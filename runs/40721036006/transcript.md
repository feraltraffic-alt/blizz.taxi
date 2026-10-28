# Sandbox transcript (2026-10-28T15:57:37Z, 8f283da)

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
  "correlation_id": "957f7dc7-63e1-4c1c-a048-76001ce5f701"
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
  "session_id": "1a202df4-742c-4349-9d6b-fdf0bd55ed18",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDM5NjYsImlhdCI6MTc5MzIwMzA2NiwianRpIjoiOTYzMTM4NjgtN2M3MS00ZTM3LWE3MzUtZjU1ZmU2MTEyYWIxIiwic2lkIjoiMWEyMDJkZjQtNzQyYy00MzQ5LTlkNmItZmRmMGJkNTVlZDE4In0.l2rbu0rYUKx0TlddIXjlHxC5tQQC3GfbV6-V_xCWxzo",
  "access_expires_at": "2026-10-28T16:12:46.345992064Z",
  "refresh_token": "BDn3fGPVAe6EtfCAFA7vnVzxIuSL65cG3I3kzBM1L3M",
  "refresh_expires_at": "2026-10-29T03:57:46.343956514Z",
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
  "session_id": "264c54aa-2feb-49dc-b1b7-0af178b7a31f",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDM5NjcsImlhdCI6MTc5MzIwMzA2NywianRpIjoiN2E4ZjJmNjQtNzUyYy00ZTE2LWI2YTUtODQ3MDI0MzNlMjdkIiwic2lkIjoiMjY0YzU0YWEtMmZlYi00OWRjLWIxYjctMGFmMTc4YjdhMzFmIn0.vQCu19FxpRgLdCtm85aOTHg8kW3c5MuTpb0BI8lP_IA",
  "access_expires_at": "2026-10-28T16:12:47.893553622Z",
  "refresh_token": "siy1e3O8HPmx9bPR5LvkLWoYsKeeECgpjB0G4fkXdRM",
  "refresh_expires_at": "2026-10-29T03:57:47.892657067Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "bc8a4631-7c08-4d09-96d5-2dd1319dfda6",
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
  "id": "0c1a9153-2778-48f3-beba-f0639bdd8407",
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
  "created_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "created_at": "2026-10-28T15:57:48.196087Z",
  "updated_at": "2026-10-28T15:57:48.196087Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638255578",
  "device_ref": "sandbox-25368"
}
```

```json
{
  "challenge_id": "e372d5b5-8e54-4ec3-a3eb-f1b2a06fb8ce",
  "expires_at": "2026-10-28T16:02:48.490086614Z",
  "resend_available_at": "2026-10-28T15:57:49.490086614Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638255578` → **200**

```json
{
  "phone": "+380638255578",
  "audience": "CLIENT",
  "code": "647179",
  "sent_at": "2026-10-28T15:57:48.500837278Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e372d5b5-8e54-4ec3-a3eb-f1b2a06fb8ce",
  "code": "647179",
  "device_ref": "sandbox-25368"
}
```

```json
{
  "session_id": "1a535abc-af2a-4840-963b-023ee7c85ec1",
  "subject": {
    "type": "CLIENT",
    "id": "8a396fde-44ae-46bb-9f41-4e7afd532fad"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YTM5NmZkZS00NGFlLTQ2YmItOWY0MS00ZTdhZmQ1MzJmYWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAzOTY4LCJpYXQiOjE3OTMyMDMwNjgsImp0aSI6ImM2ZmYzNDMxLTY2ZDktNDlkYi1iZjlmLTVmOWUzMWJkY2Y5YyIsInNpZCI6IjFhNTM1YWJjLWFmMmEtNDg0MC05NjNiLTAyM2VlN2M4NWVjMSJ9.2WDdGU-j574DG7DqigQFxbiBQ0lodHE4DTG8geQC9gU",
  "access_expires_at": "2026-10-28T16:12:48.821321028Z",
  "refresh_token": "HwacPjW6HSSLtZreZ7JoqGssq6b9HZ6dafWwyN0o2dc",
  "refresh_expires_at": "2026-11-27T15:57:48.820337474Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638255578` → **200**

```json
{
  "client_id": "8a396fde-44ae-46bb-9f41-4e7afd532fad"
}
```

`POST /api/admin/v1/rider-wallets/8a396fde-44ae-46bb-9f41-4e7afd532fad/top-ups` → **201**

```json
{
  "command_id": "5e17cfc0-9736-4b1d-830f-e2807452c620",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "8a396fde-44ae-46bb-9f41-4e7afd532fad",
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
      "id": "fb342528-3cfb-435a-b5a9-0ed65d8d90c4",
      "at": "2026-10-28T15:57:49.369451Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "df564268-f416-45b3-a8b9-88ed68f5c816",
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
  "id": "441baff1-e603-4a86-82cd-fd6766132f52",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:02:49.831067Z",
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
      "id": "0c1a9153-2778-48f3-beba-f0639bdd8407",
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
  "device_ref": "sandbox-7247"
}
```

```json
{
  "challenge_id": "48a0bed0-07ca-4444-8736-556b968443a9",
  "expires_at": "2026-10-28T16:02:50.147660077Z",
  "resend_available_at": "2026-10-28T15:57:51.147660077Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "485010",
  "sent_at": "2026-10-28T15:57:50.15154786Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48a0bed0-07ca-4444-8736-556b968443a9",
  "code": "485010",
  "device_ref": "sandbox-7247"
}
```

```json
{
  "session_id": "3a6a39a9-7b4b-4910-8f2c-5b98c1e7a80c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMzk3MCwiaWF0IjoxNzkzMjAzMDcwLCJqdGkiOiIxYzA4ZjI4NC00ZDRlLTQ4YzAtOTdkMy01ZmYyNWI0MGMxMWMiLCJzaWQiOiIzYTZhMzlhOS03YjRiLTQ5MTAtOGYyYy01Yjk4YzFlN2E4MGMifQ.n0hroDqBJj7Q_vEZM_PyiBAfwwGnFBImnFWyP_e0L24",
  "access_expires_at": "2026-10-28T16:12:50.440545732Z",
  "refresh_token": "hUYKg7eXQ5ORk228kmZoF4-YF4R5dj04585s2IwD2Wk",
  "refresh_expires_at": "2026-11-27T15:57:50.439475233Z",
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
  "command_id": "6c987de5-dd1c-4b45-b382-b9fa0483691b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:57:50Z",
    "sequence": 1793203070990
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e774a5c4-57b9-4512-a75e-6eafc75cebf6",
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
  "last_heartbeat_at": "2026-10-28T15:57:51.038353Z",
  "last_location_at": "2026-10-28T15:57:51.038353Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a7e2a34e-b6f8-4525-ae25-0916de137153",
  "quote_id": "441baff1-e603-4a86-82cd-fd6766132f52",
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
  "id": "0ca5434e-3501-472c-a6c1-0d4056d44a92",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8a396fde-44ae-46bb-9f41-4e7afd532fad",
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
  "created_at": "2026-10-28T15:57:51.383534Z",
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
  "client_id": "8a396fde-44ae-46bb-9f41-4e7afd532fad",
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
      "id": "fb342528-3cfb-435a-b5a9-0ed65d8d90c4",
      "at": "2026-10-28T15:57:49.369451Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
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
    "id": "5e6ccb10-ce8d-4b3f-88d9-5ddb5a3ac6ce",
    "order_id": "0ca5434e-3501-472c-a6c1-0d4056d44a92",
    "expires_at": "2026-10-28T15:58:06.396483Z",
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

`POST /api/driver/v1/offers/5e6ccb10-ce8d-4b3f-88d9-5ddb5a3ac6ce/accept` → **200**

```json
{
  "command_id": "aff7a8e7-1d79-4813-a953-28f30a37b11e"
}
```

```json
{
  "id": "b0e511e1-56ef-48e6-9612-a5abc9555a1a",
  "order_id": "0ca5434e-3501-472c-a6c1-0d4056d44a92",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fe722188-7288-4401-866f-4e17ea3215b4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fe722188-7288-4401-866f-4e17ea3215b4",
  "order_id": "0ca5434e-3501-472c-a6c1-0d4056d44a92",
  "assignment_id": "b0e511e1-56ef-48e6-9612-a5abc9555a1a",
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

`POST /api/driver/v1/work-sessions/e774a5c4-57b9-4512-a75e-6eafc75cebf6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:57:52Z",
    "sequence": 1793203072863
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e774a5c4-57b9-4512-a75e-6eafc75cebf6",
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
  "last_heartbeat_at": "2026-10-28T15:57:52.888057Z",
  "last_location_at": "2026-10-28T15:57:52.888057Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fe722188-7288-4401-866f-4e17ea3215b4/arrive` → **200**

```json
{
  "command_id": "6b1b36f0-c6d5-4698-8c91-8de504eca770",
  "expected_version": 0
}
```

```json
{
  "id": "fe722188-7288-4401-866f-4e17ea3215b4",
  "order_id": "0ca5434e-3501-472c-a6c1-0d4056d44a92",
  "assignment_id": "b0e511e1-56ef-48e6-9612-a5abc9555a1a",
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
  "arrived_at": "2026-10-28T15:57:53.171169Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fe722188-7288-4401-866f-4e17ea3215b4/start` → **200**

```json
{
  "command_id": "cc213114-da86-4131-b211-d81899930bd6",
  "expected_version": 1
}
```

```json
{
  "id": "fe722188-7288-4401-866f-4e17ea3215b4",
  "order_id": "0ca5434e-3501-472c-a6c1-0d4056d44a92",
  "assignment_id": "b0e511e1-56ef-48e6-9612-a5abc9555a1a",
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
  "arrived_at": "2026-10-28T15:57:53.171169Z",
  "started_at": "2026-10-28T15:57:53.452942Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/fe722188-7288-4401-866f-4e17ea3215b4/complete` → **200**

```json
{
  "command_id": "49fce938-6a3a-4cc6-9573-eb9f8b6890bb",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:57:53Z",
  "cash_received": true
}
```

```json
{
  "id": "fe722188-7288-4401-866f-4e17ea3215b4",
  "order_id": "0ca5434e-3501-472c-a6c1-0d4056d44a92",
  "assignment_id": "b0e511e1-56ef-48e6-9612-a5abc9555a1a",
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
  "arrived_at": "2026-10-28T15:57:53.171169Z",
  "started_at": "2026-10-28T15:57:53.452942Z",
  "completed_at": "2026-10-28T15:57:53.756938Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8a396fde-44ae-46bb-9f41-4e7afd532fad",
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
      "id": "57c63d9d-3979-4fb0-bcf2-0f904de9e3eb",
      "at": "2026-10-28T15:57:53.901479Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "0ca5434e-3501-472c-a6c1-0d4056d44a92"
    },
    {
      "id": "fb342528-3cfb-435a-b5a9-0ed65d8d90c4",
      "at": "2026-10-28T15:57:49.369451Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/0c1a9153-2778-48f3-beba-f0639bdd8407/archive` → **200**

```json
{
  "command_id": "2b8905e2-7372-4c78-a811-25aac07c08bc",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "0c1a9153-2778-48f3-beba-f0639bdd8407",
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
  "created_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "created_at": "2026-10-28T15:57:48.196087Z",
  "updated_at": "2026-10-28T15:57:57.350263Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e774a5c4-57b9-4512-a75e-6eafc75cebf6",
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
  "last_heartbeat_at": "2026-10-28T15:57:52.888057Z",
  "last_location_at": "2026-10-28T15:57:52.888057Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e774a5c4-57b9-4512-a75e-6eafc75cebf6/close` → **200**

```json
{
  "command_id": "4907bed4-aaed-4684-a4f3-e4a89350202d",
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

Done: order 0ca5434e-3501-472c-a6c1-0d4056d44a92.

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
  "session_id": "de785068-69d1-4960-a1e8-a7ef6b8afeae",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDM5NzgsImlhdCI6MTc5MzIwMzA3OCwianRpIjoiM2Q4NWZlOTAtOWU3NC00YzkwLWI0MGEtMjI0MzYxOGVmMTFjIiwic2lkIjoiZGU3ODUwNjgtNjlkMS00OTYwLWExZTgtYTdlZjZiOGFmZWFlIn0.KoAGL3NSsRtYWZCusNY258Zp0VWMYlwBaUF9ReMl4ls",
  "access_expires_at": "2026-10-28T16:12:58.533165726Z",
  "refresh_token": "cso2gy4mhv6IsTrzSnIYsve8-EhYMbrvF-64mP_gKN0",
  "refresh_expires_at": "2026-10-29T03:57:58.532429401Z",
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
  "command_id": "19b92fc9-1545-4741-a414-f5dd434f4e58",
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
  "session_id": "3995d1ed-d197-449d-bfb9-bb0b2fbc76df",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDM5NzksImlhdCI6MTc5MzIwMzA3OSwianRpIjoiNDQ3MGMxZDctZmI5NS00YjUxLWIxNWEtNDM0ZTc2YmQyZmMxIiwic2lkIjoiMzk5NWQxZWQtZDE5Ny00NDlkLWJmYjktYmIwYjJmYmM3NmRmIn0._rzbUSQjkZ64XfPyeHQAipLEdKAeM4_36cx_47gKtPw",
  "access_expires_at": "2026-10-28T16:12:59.654883071Z",
  "refresh_token": "ECYJV6tfJZ_Gd8Py3Wx15ruruHbGoskEAaRTWCYnotU",
  "refresh_expires_at": "2026-10-29T03:57:59.654169489Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2655831879",
    "linkedid": "1730052700.2655831879",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671935519"
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
    "id": "1730052700.2655831879",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "a6941029-a10a-46e5-be91-7fe399d9b99f",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671935519",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:57:59.920062Z",
      "answered_at": null,
      "ended_at": "2026-10-28T15:57:59.943968Z",
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
    "id": "1730052600.3176825886",
    "linkedid": "1730052600.3176825886",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671935519"
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
      "id": "29b8602b-c28e-44e8-bc32-de25d4d5d13f",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671935519",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:58:00.25788Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/29b8602b-c28e-44e8-bc32-de25d4d5d13f/answer` → **200**

```json
{
  "command_id": "f212537d-76c4-41ac-bc42-b232340ea916"
}
```

```json
{
  "id": "29b8602b-c28e-44e8-bc32-de25d4d5d13f",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671935519",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "order_ids": [],
  "started_at": "2026-10-28T15:58:00.25788Z",
  "answered_at": "2026-10-28T15:58:00.563951Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.3176825886",
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
    "id": "1730052600.3176825886",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "29b8602b-c28e-44e8-bc32-de25d4d5d13f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671935519",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_ids": [],
      "started_at": "2026-10-28T15:58:00.25788Z",
      "answered_at": "2026-10-28T15:58:00.563951Z",
      "ended_at": "2026-10-28T15:58:00.859367Z",
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
      "id": "29b8602b-c28e-44e8-bc32-de25d4d5d13f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671935519",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_ids": [],
      "started_at": "2026-10-28T15:58:00.25788Z",
      "answered_at": "2026-10-28T15:58:00.563951Z",
      "ended_at": "2026-10-28T15:58:00.859367Z",
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
      "id": "29b8602b-c28e-44e8-bc32-de25d4d5d13f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671935519",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_ids": [],
      "started_at": "2026-10-28T15:58:00.25788Z",
      "answered_at": "2026-10-28T15:58:00.563951Z",
      "ended_at": "2026-10-28T15:58:00.859367Z",
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
      "id": "29b8602b-c28e-44e8-bc32-de25d4d5d13f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671935519",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_ids": [],
      "started_at": "2026-10-28T15:58:00.25788Z",
      "answered_at": "2026-10-28T15:58:00.563951Z",
      "ended_at": "2026-10-28T15:58:00.859367Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:58:06.720823Z"
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
      "id": "29b8602b-c28e-44e8-bc32-de25d4d5d13f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671935519",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_ids": [],
      "started_at": "2026-10-28T15:58:00.25788Z",
      "answered_at": "2026-10-28T15:58:00.563951Z",
      "ended_at": "2026-10-28T15:58:00.859367Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:58:06.720823Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/29b8602b-c28e-44e8-bc32-de25d4d5d13f/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/29b8602b-c28e-44e8-bc32-de25d4d5d13f/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=29b8602b-c28e-44e8-bc32-de25d4d5d13f` → **200**

```json
{
  "changes": [
    {
      "id": "2f458687-0290-4195-92ef-a62a57b305c5",
      "occurred_at": "2026-10-28T15:58:08.305265Z",
      "actor_type": "STAFF",
      "actor_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "29b8602b-c28e-44e8-bc32-de25d4d5d13f",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c50b9c41-77df-4bf6-8a9c-6e6f1fdb3038\", \"order_ids\": []}",
      "correlation_id": "8ccdb2ec-eb41-4f25-8c73-1491084b3ee3"
    },
    {
      "id": "1ac8638d-9f97-454f-b1a5-fe7c80145c6d",
      "occurred_at": "2026-10-28T15:58:08.270958Z",
      "actor_type": "STAFF",
      "actor_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "29b8602b-c28e-44e8-bc32-de25d4d5d13f",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c50b9c41-77df-4bf6-8a9c-6e6f1fdb3038\", \"order_ids\": []}",
      "correlation_id": "5fb373cc-5e97-4d80-a7c7-9b6aa66d182e"
    }
  ]
}
```

Done: call 29b8602b-c28e-44e8-bc32-de25d4d5d13f recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7749"
}
```

```json
{
  "challenge_id": "b634bd0d-a968-4053-83d9-9f85bccb2c32",
  "expires_at": "2026-10-28T16:03:08.615006138Z",
  "resend_available_at": "2026-10-28T15:58:09.615006138Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "174904",
  "sent_at": "2026-10-28T15:58:08.619593321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b634bd0d-a968-4053-83d9-9f85bccb2c32",
  "code": "174904",
  "device_ref": "sandbox-7749"
}
```

```json
{
  "session_id": "030b6bc7-6ef1-4861-bcc0-b8ef4bed78ef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMzk4OCwiaWF0IjoxNzkzMjAzMDg4LCJqdGkiOiIwZGQ2OTYxNC1hOGM2LTQ4M2EtYjIyMi1lZmE2MWMzYmQxOTkiLCJzaWQiOiIwMzBiNmJjNy02ZWYxLTQ4NjEtYmNjMC1iOGVmNGJlZDc4ZWYifQ.5VEaVgC_-CglJ20oatnltNPlIN2YavxMGuUfiPvNr3E",
  "access_expires_at": "2026-10-28T16:13:08.911573847Z",
  "refresh_token": "k1pQbCRJ0FvQonQjwbTUgF-GuIuM3s5R4wVnmC7c4Io",
  "refresh_expires_at": "2026-11-27T15:58:08.910901111Z",
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
  "command_id": "156273da-4dfa-4b8a-be7b-ff757bf792f2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:58:09Z",
    "sequence": 1793203089443
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1073f1ea-1b5d-4112-a194-b7e41547cddc",
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
  "last_heartbeat_at": "2026-10-28T15:58:09.46488Z",
  "last_location_at": "2026-10-28T15:58:09.46488Z",
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
  "session_id": "61ba2c9f-cec6-468e-9fa0-1991cd14faea",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDM5OTAsImlhdCI6MTc5MzIwMzA5MCwianRpIjoiNjY3Y2JhOGEtZTQ4OS00NmY4LWE1NDItMmYwZDU3MmQ3ZmJkIiwic2lkIjoiNjFiYTJjOWYtY2VjNi00NjhlLTlmYTAtMTk5MWNkMTRmYWVhIn0.wO7wXczwWBN0JsUZIasJ7HRITSNTiAWwSthQPvl5dmM",
  "access_expires_at": "2026-10-28T16:13:10.035021253Z",
  "refresh_token": "ck8DC42wJ45QHW19pUvNCi1HHX0q0xZtVscrvLXTdMs",
  "refresh_expires_at": "2026-10-29T03:58:10.03437709Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "605b50c1-039d-4ebf-9a81-10cd3ffa5d5e",
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
  "id": "3d8d70a5-3932-4592-9f4a-caf3c42a6c92",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:03:10.305374Z",
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
  "command_id": "17a850e9-4a1b-421e-8c13-5b2878c63de7",
  "quote_id": "3d8d70a5-3932-4592-9f4a-caf3c42a6c92",
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
    "phone": "+380677641757"
  }
}
```

```json
{
  "id": "bb7fa43d-6f37-4288-af35-5769684b3da2",
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
  "created_at": "2026-10-28T15:58:10.614391Z",
  "caller": {
    "name": "Олена",
    "phone": "+380677641757"
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
    "id": "669b7161-3adc-4c12-baec-3b8fa517b2c5",
    "order_id": "bb7fa43d-6f37-4288-af35-5769684b3da2",
    "expires_at": "2026-10-28T15:58:25.621315Z",
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

`POST /api/driver/v1/offers/669b7161-3adc-4c12-baec-3b8fa517b2c5/accept` → **200**

```json
{
  "command_id": "102e7793-94e4-47ec-bdcf-c98568aaae7d"
}
```

```json
{
  "id": "a6c32856-8110-472b-bec7-78ecd0ebf46e",
  "order_id": "bb7fa43d-6f37-4288-af35-5769684b3da2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1b24f173-d981-479a-87ce-00e5c64a1458",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380677641757` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677641757` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677641757` → **200**

```json
[
  {
    "phone": "+380677641757",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:58:12.877430444Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677641757` → **200**

```json
[
  {
    "phone": "+380677641757",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:58:12.877430444Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677641757` → **200**

```json
[
  {
    "phone": "+380677641757",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:58:12.877430444Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1b24f173-d981-479a-87ce-00e5c64a1458",
  "order_id": "bb7fa43d-6f37-4288-af35-5769684b3da2",
  "assignment_id": "a6c32856-8110-472b-bec7-78ecd0ebf46e",
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
    "phone": "+380677641757"
  }
}
```

`POST /api/driver/v1/work-sessions/1073f1ea-1b5d-4112-a194-b7e41547cddc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:58:13Z",
    "sequence": 1793203093899
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1073f1ea-1b5d-4112-a194-b7e41547cddc",
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
  "last_heartbeat_at": "2026-10-28T15:58:13.920533Z",
  "last_location_at": "2026-10-28T15:58:13.920533Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1b24f173-d981-479a-87ce-00e5c64a1458/arrive` → **200**

```json
{
  "command_id": "2aa7c79f-ccb7-4493-846c-a82b293352fd",
  "expected_version": 0
}
```

```json
{
  "id": "1b24f173-d981-479a-87ce-00e5c64a1458",
  "order_id": "bb7fa43d-6f37-4288-af35-5769684b3da2",
  "assignment_id": "a6c32856-8110-472b-bec7-78ecd0ebf46e",
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
  "arrived_at": "2026-10-28T15:58:14.195715Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677641757"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380677641757` → **200**

```json
[
  {
    "phone": "+380677641757",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:58:12.877430444Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677641757` → **200**

```json
[
  {
    "phone": "+380677641757",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:58:12.877430444Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677641757` → **200**

```json
[
  {
    "phone": "+380677641757",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:58:12.877430444Z"
  },
  {
    "phone": "+380677641757",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:58:15.887663451Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677641757` → **200**

```json
[
  {
    "phone": "+380677641757",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:58:12.877430444Z"
  },
  {
    "phone": "+380677641757",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:58:15.887663451Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677641757` → **200**

```json
[
  {
    "phone": "+380677641757",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:58:12.877430444Z"
  },
  {
    "phone": "+380677641757",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:58:15.887663451Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/1b24f173-d981-479a-87ce-00e5c64a1458/start` → **200**

```json
{
  "command_id": "6bb9b0e1-693e-4357-9714-2879d8d3aaae",
  "expected_version": 1
}
```

```json
{
  "id": "1b24f173-d981-479a-87ce-00e5c64a1458",
  "order_id": "bb7fa43d-6f37-4288-af35-5769684b3da2",
  "assignment_id": "a6c32856-8110-472b-bec7-78ecd0ebf46e",
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
  "arrived_at": "2026-10-28T15:58:14.195715Z",
  "started_at": "2026-10-28T15:58:16.607607Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677641757"
  }
}
```

`POST /api/driver/v1/trips/1b24f173-d981-479a-87ce-00e5c64a1458/complete` → **200**

```json
{
  "command_id": "4588897b-f9a6-422f-a06b-1ba51bf39bb1",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:58:16Z",
  "cash_received": true
}
```

```json
{
  "id": "1b24f173-d981-479a-87ce-00e5c64a1458",
  "order_id": "bb7fa43d-6f37-4288-af35-5769684b3da2",
  "assignment_id": "a6c32856-8110-472b-bec7-78ecd0ebf46e",
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
  "arrived_at": "2026-10-28T15:58:14.195715Z",
  "started_at": "2026-10-28T15:58:16.607607Z",
  "completed_at": "2026-10-28T15:58:16.897753Z",
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
  "session_id": "1073f1ea-1b5d-4112-a194-b7e41547cddc",
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
  "last_heartbeat_at": "2026-10-28T15:58:13.920533Z",
  "last_location_at": "2026-10-28T15:58:13.920533Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1073f1ea-1b5d-4112-a194-b7e41547cddc/close` → **200**

```json
{
  "command_id": "902322c0-8884-4aac-b850-569898ea7103",
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
  "phone": "+380636254463",
  "device_ref": "sandbox-4898"
}
```

```json
{
  "challenge_id": "5cd2900c-1409-4aeb-a921-c336d39f5cba",
  "expires_at": "2026-10-28T16:03:17.750165844Z",
  "resend_available_at": "2026-10-28T15:58:18.750165844Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636254463` → **200**

```json
{
  "phone": "+380636254463",
  "audience": "CLIENT",
  "code": "499339",
  "sent_at": "2026-10-28T15:58:17.755013763Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5cd2900c-1409-4aeb-a921-c336d39f5cba",
  "code": "499339",
  "device_ref": "sandbox-4898"
}
```

```json
{
  "session_id": "f919fe32-4af5-4ae0-a6ab-9fcde230bc6e",
  "subject": {
    "type": "CLIENT",
    "id": "0f26e767-abb7-4d40-be67-c9c6d2dafaa3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZjI2ZTc2Ny1hYmI3LTRkNDAtYmU2Ny1jOWM2ZDJkYWZhYTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAzOTk4LCJpYXQiOjE3OTMyMDMwOTgsImp0aSI6ImIwMTkwMTRiLTBlZjUtNGI2OS1hNjcyLThhZTIyZTk2ZjZjYSIsInNpZCI6ImY5MTlmZTMyLTRhZjUtNGFlMC1hNmFiLTlmY2RlMjMwYmM2ZSJ9.DgCQ_pak5RqdSpicGd7z9-LeWX1XcR1_Wbwo0N5bkFw",
  "access_expires_at": "2026-10-28T16:13:18.044651511Z",
  "refresh_token": "fam-SSlPz549EaNnWpciBw3ZaCWSDIlZ0KCsEY5afyQ",
  "refresh_expires_at": "2026-11-27T15:58:18.043956376Z",
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
        "uk": "Передумав їхати",
        "en": "Changed my mind",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте"
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
  "device_ref": "sandbox-17868"
}
```

```json
{
  "challenge_id": "2f1f5e40-54a6-4e46-a3e8-05ba0f25fa31",
  "expires_at": "2026-10-28T16:03:18.579306048Z",
  "resend_available_at": "2026-10-28T15:58:19.579306048Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "170762",
  "sent_at": "2026-10-28T15:58:18.582625551Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f1f5e40-54a6-4e46-a3e8-05ba0f25fa31",
  "code": "170762",
  "device_ref": "sandbox-17868"
}
```

```json
{
  "session_id": "1fb5806c-3a8e-4355-bd80-57f07b937395",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMzk5OCwiaWF0IjoxNzkzMjAzMDk4LCJqdGkiOiI5YzNmMDA0MS1lOWE0LTQ2MGUtOTkxOS0xMmE1NGUzZGQ4ZjgiLCJzaWQiOiIxZmI1ODA2Yy0zYThlLTQzNTUtYmQ4MC01N2YwN2I5MzczOTUifQ.JyLTlArfACO8iyuO04c4hL_r7p5O8CDA57QzRJAH1w4",
  "access_expires_at": "2026-10-28T16:13:18.876774166Z",
  "refresh_token": "p2lZ2toHbYnzX8DPASP6nT2dPXNAu9Y40YoL7jo0DvQ",
  "refresh_expires_at": "2026-11-27T15:58:18.876075192Z",
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
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать"
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
  "session_id": "e0fe37f5-a609-4cb2-a2e2-036234387bb7",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDM5OTksImlhdCI6MTc5MzIwMzA5OSwianRpIjoiZDc1MjU1NDItZmY3ZS00MmRmLTg4ZDYtYmE0YjA0MTgwNTg4Iiwic2lkIjoiZTBmZTM3ZjUtYTYwOS00Y2IyLWEyZTItMDM2MjM0Mzg3YmI3In0.PcFtLSZ-yMDYrU_BkWpKnE7_x_o8P6Mxrnr9pnaZAmY",
  "access_expires_at": "2026-10-28T16:13:19.692409955Z",
  "refresh_token": "887bKEPFWbHmgmzmXfAArIdpu2JmgoZpZcnDTf9E1sA",
  "refresh_expires_at": "2026-10-29T03:58:19.691681055Z",
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
  "session_id": "f1279217-ef95-4431-99ad-6c292aee1bcd",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwMDAsImlhdCI6MTc5MzIwMzEwMCwianRpIjoiNjExODZhYmMtY2VlNS00NzExLWFhNWItNDA3NTY4NWJmZDUwIiwic2lkIjoiZjEyNzkyMTctZWY5NS00NDMxLTk5YWQtNmMyOTJhZWUxYmNkIn0.cucHpyuVxdKf6E3HQfRCoGCUmRgeZKc7dox6hiysMlw",
  "access_expires_at": "2026-10-28T16:13:20.263826105Z",
  "refresh_token": "lgH34K50YX_Srj3lQ0pK8YsdMHVERpFU7XxGXj64xmM",
  "refresh_expires_at": "2026-10-29T03:58:20.263238127Z",
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
        "uk": "Пасажир попросив",
        "en": "Passenger asked",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error",
        "ru": "Ошибка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "uk": "ДТП",
        "en": "Accident",
        "ru": "ДТП"
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
  "command_id": "f633ba6e-886b-428a-aa6c-849acdc50384",
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
  "id": "467f44d2-3478-4d7b-a30b-87f8b9072ad2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:03:20.796262Z",
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
  "command_id": "fdf028dc-9499-45eb-83c4-6b1cabab69fb",
  "quote_id": "467f44d2-3478-4d7b-a30b-87f8b9072ad2",
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
  "id": "5cac1244-c82e-4c96-9134-c80fa1b22555",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f26e767-abb7-4d40-be67-c9c6d2dafaa3",
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
  "created_at": "2026-10-28T15:58:21.082719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5cac1244-c82e-4c96-9134-c80fa1b22555` → **200**

```json
{
  "id": "5cac1244-c82e-4c96-9134-c80fa1b22555",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f26e767-abb7-4d40-be67-c9c6d2dafaa3",
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
  "created_at": "2026-10-28T15:58:21.082719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5cac1244-c82e-4c96-9134-c80fa1b22555/cancel` → **200**

```json
{
  "command_id": "e33e04cb-3e4f-48fb-8847-cf9ebb876b09",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "5cac1244-c82e-4c96-9134-c80fa1b22555",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0f26e767-abb7-4d40-be67-c9c6d2dafaa3",
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
  "created_at": "2026-10-28T15:58:21.082719Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
      "en": "The wait is too long",
      "ru": "Долго ждать машину"
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
  "command_id": "2d92253e-4082-4a48-8bac-61a6723f7b7a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:58:22Z",
    "sequence": 1793203102265
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0ba59a57-2bb8-4e5c-a7dc-61e156ffb9c4",
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
  "last_heartbeat_at": "2026-10-28T15:58:22.286003Z",
  "last_location_at": "2026-10-28T15:58:22.286003Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5066"
}
```

```json
{
  "challenge_id": "28e54c26-357b-4554-8c08-415b796d1559",
  "expires_at": "2026-10-28T16:03:22.550416098Z",
  "resend_available_at": "2026-10-28T15:58:23.550416098Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "125804",
  "sent_at": "2026-10-28T15:58:22.553522062Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28e54c26-357b-4554-8c08-415b796d1559",
  "code": "125804",
  "device_ref": "sandbox-5066"
}
```

```json
{
  "session_id": "832370ca-17e9-4dd2-9b21-8cae5daff566",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDAwMiwiaWF0IjoxNzkzMjAzMTAyLCJqdGkiOiI4MmM0YjM3ZS0zNjk1LTQwN2YtOTFjMi0wZWEwYjQxZGNiZDAiLCJzaWQiOiI4MzIzNzBjYS0xN2U5LTRkZDItOWIyMS04Y2FlNWRhZmY1NjYifQ.pnWUisUG73oFpIWhAk8r9a-PXfzaRgxpVTm2nBCYII4",
  "access_expires_at": "2026-10-28T16:13:22.848794516Z",
  "refresh_token": "n32WoxDCFoUD7iBYrvVaf_x_hJMfwuPfnh89WcFbafE",
  "refresh_expires_at": "2026-11-27T15:58:22.848164865Z",
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
  "command_id": "a58f26f9-558e-4976-8dd2-84f201c97e8d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:58:23Z",
    "sequence": 1793203103370
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0c5ab4e0-8286-4fac-933c-09157953cf2d",
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
  "last_heartbeat_at": "2026-10-28T15:58:23.391399Z",
  "last_location_at": "2026-10-28T15:58:23.391399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b7c6cf7e-4ea8-444d-959f-4ad4d802ad58",
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
  "id": "bc513ac3-5070-4054-b5e7-b6ebed4e43d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:03:23.674889Z",
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
  "command_id": "a5796330-39f8-4003-baeb-b102d802eb04",
  "quote_id": "bc513ac3-5070-4054-b5e7-b6ebed4e43d6",
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
  "id": "14bfb711-0552-4a76-a133-637d86a9e66a",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f26e767-abb7-4d40-be67-c9c6d2dafaa3",
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
  "created_at": "2026-10-28T15:58:23.956155Z",
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
    "id": "8b8bc812-037d-42f8-9d24-66f8d5183d10",
    "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
    "expires_at": "2026-10-28T15:58:38.960952Z",
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

`POST /api/driver/v1/offers/8b8bc812-037d-42f8-9d24-66f8d5183d10/accept` → **200**

```json
{
  "command_id": "978a3391-de87-49b8-b8c1-cb5b58a1d9be"
}
```

```json
{
  "id": "5075951d-6497-4788-b333-719415680cf7",
  "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c730fabf-c4cc-46a8-a292-863524d4c012",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c730fabf-c4cc-46a8-a292-863524d4c012",
  "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
  "assignment_id": "5075951d-6497-4788-b333-719415680cf7",
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

`POST /api/driver/v1/trips/c730fabf-c4cc-46a8-a292-863524d4c012/cancel` → **200**

```json
{
  "command_id": "5ca63ae9-21b9-4329-ad7d-e21b2c62adb5",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "c730fabf-c4cc-46a8-a292-863524d4c012",
  "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
  "assignment_id": "5075951d-6497-4788-b333-719415680cf7",
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

`GET /api/rider/v1/orders/14bfb711-0552-4a76-a133-637d86a9e66a` → **200**

```json
{
  "id": "14bfb711-0552-4a76-a133-637d86a9e66a",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0f26e767-abb7-4d40-be67-c9c6d2dafaa3",
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
    "id": "5075951d-6497-4788-b333-719415680cf7",
    "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c730fabf-c4cc-46a8-a292-863524d4c012",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:58:23.956155Z",
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
    "id": "99e34da8-0d4b-4f42-82f0-41f56655b192",
    "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
    "expires_at": "2026-10-28T15:58:40.086788Z",
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

`POST /api/driver/v1/offers/99e34da8-0d4b-4f42-82f0-41f56655b192/accept` → **200**

```json
{
  "command_id": "1241294f-a9b5-4a91-8de5-750c26f179eb"
}
```

```json
{
  "id": "febf4de7-7056-41be-900d-3d9205a6ff40",
  "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "615ff4cb-1936-4218-8549-948fc4bea7ef",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "615ff4cb-1936-4218-8549-948fc4bea7ef",
  "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
  "assignment_id": "febf4de7-7056-41be-900d-3d9205a6ff40",
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

`POST /api/driver/v1/trips/615ff4cb-1936-4218-8549-948fc4bea7ef/cancel` → **200**

```json
{
  "command_id": "93fb25a4-3600-4f45-aefb-93c8dfa77c49",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "615ff4cb-1936-4218-8549-948fc4bea7ef",
  "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
  "assignment_id": "febf4de7-7056-41be-900d-3d9205a6ff40",
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
    "id": "14bfb711-0552-4a76-a133-637d86a9e66a",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:58:23.956155Z",
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
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить"
      }
    },
    "pickup_at": null
  },
  {
    "id": "5cac1244-c82e-4c96-9134-c80fa1b22555",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:58:21.082719Z",
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
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/14bfb711-0552-4a76-a133-637d86a9e66a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:58:23.957205Z",
      "actor": {
        "type": "CLIENT",
        "id": "0f26e767-abb7-4d40-be67-c9c6d2dafaa3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
        "quote_id": "bc513ac3-5070-4054-b5e7-b6ebed4e43d6",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "b4809ef0-57c6-4262-be67-7c8be1e0bf5b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:58:23.959887Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
        "attempt_id": "84fb60ef-1810-4325-b1e5-428352a203b5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b4809ef0-57c6-4262-be67-7c8be1e0bf5b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:58:23.967755Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8b8bc812-037d-42f8-9d24-66f8d5183d10",
        "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "b4809ef0-57c6-4262-be67-7c8be1e0bf5b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:58:24.513425Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "8b8bc812-037d-42f8-9d24-66f8d5183d10",
        "order_id": "14bfb711-0552-4a76-a133-637d86a9e66a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "5075951d-6497-4788-b333-719415680cf7"
      },
      "correlation_id": "74dc2789-de6c-4f47-be95-b46fba8a1bab"
```

Done: orders 5cac1244-c82e-4c96-9134-c80fa1b22555, 14bfb711-0552-4a76-a133-637d86a9e66a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736662466",
  "device_ref": "sandbox-19052"
}
```

```json
{
  "challenge_id": "3bfb3a63-c49b-483e-b935-03a6ecf3e4ae",
  "expires_at": "2026-10-28T16:03:27.328027568Z",
  "resend_available_at": "2026-10-28T15:58:28.328027568Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736662466` → **200**

```json
{
  "phone": "+380736662466",
  "audience": "CLIENT",
  "code": "399274",
  "sent_at": "2026-10-28T15:58:27.331424711Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3bfb3a63-c49b-483e-b935-03a6ecf3e4ae",
  "code": "399274",
  "device_ref": "sandbox-19052"
}
```

```json
{
  "session_id": "889b7705-f44f-4b55-8936-3fe373dc705c",
  "subject": {
    "type": "CLIENT",
    "id": "bda18196-3044-49a3-b654-6036f58d8866"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZGExODE5Ni0zMDQ0LTQ5YTMtYjY1NC02MDM2ZjU4ZDg4NjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MDA3LCJpYXQiOjE3OTMyMDMxMDcsImp0aSI6IjYwMWVmZmE5LWRlNmYtNGMxNi1iZTA1LTFlODZlNzBiODdmZSIsInNpZCI6Ijg4OWI3NzA1LWY0NGYtNGI1NS04OTM2LTNmZTM3M2RjNzA1YyJ9.NfVwuc3v3FLHmEhzjF56NYpKMDL9VL906UCtX_Lae6U",
  "access_expires_at": "2026-10-28T16:13:27.621874756Z",
  "refresh_token": "ICQf4yEAWc4M87nfXIwuN53P3GIsx9byuKQkl-u7Cwg",
  "refresh_expires_at": "2026-11-27T15:58:27.621116259Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "4e5aa2fa-00c2-4ba4-b41c-d47630c993aa",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b365c160-e32a-4f8b-9f91-ee1cc625c1a4",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b365c160-e32a-4f8b-9f91-ee1cc625c1a4",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "73781499e75657b77adb697d38325961",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b365c160-e32a-4f8b-9f91-ee1cc625c1a4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736662466"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b365c160-e32a-4f8b-9f91-ee1cc625c1a4",
  "expires_at": "2026-10-28T16:28:27.893064Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b365c160-e32a-4f8b-9f91-ee1cc625c1a4` → **200**

```json
{
  "id": "b365c160-e32a-4f8b-9f91-ee1cc625c1a4",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T16:28:27.893064Z",
  "card": {
    "id": "558d0059-1680-453b-a912-7873d29bbc38",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6776",
    "card_type": "Visa",
    "created_at": "2026-10-28T15:58:28.178511Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "558d0059-1680-453b-a912-7873d29bbc38",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6776",
      "card_type": "Visa",
      "created_at": "2026-10-28T15:58:28.178511Z"
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
  "device_ref": "sandbox-6977"
}
```

```json
{
  "challenge_id": "07cf15c1-f11b-4a1f-aeba-a761a68a0be6",
  "expires_at": "2026-10-28T16:03:28.732605448Z",
  "resend_available_at": "2026-10-28T15:58:29.732605448Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "325597",
  "sent_at": "2026-10-28T15:58:28.736147943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07cf15c1-f11b-4a1f-aeba-a761a68a0be6",
  "code": "325597",
  "device_ref": "sandbox-6977"
}
```

```json
{
  "session_id": "7518675b-8d29-41cd-95ce-a26aa0090938",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDAwOSwiaWF0IjoxNzkzMjAzMTA5LCJqdGkiOiI2MTY2ZDhiNi0zYTk5LTRjY2ItYjk2OC1iMGM0YzJjNDQwZjgiLCJzaWQiOiI3NTE4Njc1Yi04ZDI5LTQxY2QtOTVjZS1hMjZhYTAwOTA5MzgifQ.BmhAXNSjPAf-E5vrCe1amJWG31BHGI07kFMbPRTEIto",
  "access_expires_at": "2026-10-28T16:13:29.029031288Z",
  "refresh_token": "ZTcalk48tkZaG2BZmhYTLRFT15q30S6x08ZZjexxOfg",
  "refresh_expires_at": "2026-11-27T15:58:29.028440195Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0c5ab4e0-8286-4fac-933c-09157953cf2d",
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
  "last_heartbeat_at": "2026-10-28T15:58:23.391399Z",
  "last_location_at": "2026-10-28T15:58:23.391399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0c5ab4e0-8286-4fac-933c-09157953cf2d/handover` → **200**

```json
{
  "command_id": "b0644b9c-16b4-4d30-bc60-1d0a0d493163",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0c5ab4e0-8286-4fac-933c-09157953cf2d",
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
  "last_heartbeat_at": "2026-10-28T15:58:23.391399Z",
  "last_location_at": "2026-10-28T15:58:23.391399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0c5ab4e0-8286-4fac-933c-09157953cf2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:58:29Z",
    "sequence": 1793203109835
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0c5ab4e0-8286-4fac-933c-09157953cf2d",
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
  "last_heartbeat_at": "2026-10-28T15:58:29.855989Z",
  "last_location_at": "2026-10-28T15:58:29.855989Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "995c9674-99ee-4516-b340-42e40a437b6d",
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
  "id": "b99b6c5e-446e-43c4-aa8c-62b2f30937f6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:03:30.146617Z",
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
  "command_id": "1e8024b0-eff8-49c7-8a87-5f3e79b5adb6",
  "quote_id": "b99b6c5e-446e-43c4-aa8c-62b2f30937f6",
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
  "id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bda18196-3044-49a3-b654-6036f58d8866",
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
  "created_at": "2026-10-28T15:58:30.442355Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50dc117b-09fa-4cff-bb54-fd4f29a085c3` → **200**

```json
{
  "id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bda18196-3044-49a3-b654-6036f58d8866",
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
  "created_at": "2026-10-28T15:58:30.442355Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50dc117b-09fa-4cff-bb54-fd4f29a085c3` → **200**

```json
{
  "id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bda18196-3044-49a3-b654-6036f58d8866",
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
  "created_at": "2026-10-28T15:58:30.442355Z",
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
    "id": "95348b2e-928a-46b0-9e37-6b60f450f755",
    "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
    "expires_at": "2026-10-28T15:58:46.157547Z",
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

`POST /api/driver/v1/offers/95348b2e-928a-46b0-9e37-6b60f450f755/accept` → **200**

```json
{
  "command_id": "5a4a003a-3fb6-43b1-9f45-2ceb24d94409"
}
```

```json
{
  "id": "71ab8708-37e4-4f5c-97aa-aa9f740bdc25",
  "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e9595e5a-a707-4950-95a7-11f1784fddc3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e9595e5a-a707-4950-95a7-11f1784fddc3",
  "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
  "assignment_id": "71ab8708-37e4-4f5c-97aa-aa9f740bdc25",
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

`POST /api/driver/v1/work-sessions/0c5ab4e0-8286-4fac-933c-09157953cf2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:58:33Z",
    "sequence": 1793203113110
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0c5ab4e0-8286-4fac-933c-09157953cf2d",
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
  "last_heartbeat_at": "2026-10-28T15:58:33.131982Z",
  "last_location_at": "2026-10-28T15:58:33.131982Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e9595e5a-a707-4950-95a7-11f1784fddc3/arrive` → **200**

```json
{
  "command_id": "ab6d9b35-c846-4ed9-a860-a11c56c74c50",
  "expected_version": 0
}
```

```json
{
  "id": "e9595e5a-a707-4950-95a7-11f1784fddc3",
  "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
  "assignment_id": "71ab8708-37e4-4f5c-97aa-aa9f740bdc25",
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
  "arrived_at": "2026-10-28T15:58:33.412367Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9595e5a-a707-4950-95a7-11f1784fddc3/start` → **200**

```json
{
  "command_id": "41afa5ae-1fa0-4486-80f8-6a57e4f64425",
  "expected_version": 1
}
```

```json
{
  "id": "e9595e5a-a707-4950-95a7-11f1784fddc3",
  "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
  "assignment_id": "71ab8708-37e4-4f5c-97aa-aa9f740bdc25",
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
  "arrived_at": "2026-10-28T15:58:33.412367Z",
  "started_at": "2026-10-28T15:58:33.694969Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9595e5a-a707-4950-95a7-11f1784fddc3/complete` → **200**

```json
{
  "command_id": "03e45dbd-decf-474d-ae8d-3017644712bb",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:58:33Z",
  "cash_received": true
}
```

```json
{
  "id": "e9595e5a-a707-4950-95a7-11f1784fddc3",
  "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
  "assignment_id": "71ab8708-37e4-4f5c-97aa-aa9f740bdc25",
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
  "arrived_at": "2026-10-28T15:58:33.412367Z",
  "started_at": "2026-10-28T15:58:33.694969Z",
  "completed_at": "2026-10-28T15:58:33.988196Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/50dc117b-09fa-4cff-bb54-fd4f29a085c3` → **200**

```json
{
  "id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "bda18196-3044-49a3-b654-6036f58d8866",
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
    "id": "71ab8708-37e4-4f5c-97aa-aa9f740bdc25",
    "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e9595e5a-a707-4950-95a7-11f1784fddc3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:58:30.442355Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/50dc117b-09fa-4cff-bb54-fd4f29a085c3` → **200**

```json
{
  "id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "bda18196-3044-49a3-b654-6036f58d8866",
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
    "id": "71ab8708-37e4-4f5c-97aa-aa9f740bdc25",
    "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e9595e5a-a707-4950-95a7-11f1784fddc3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:58:30.442355Z",
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

`GET /api/rider/v1/orders/50dc117b-09fa-4cff-bb54-fd4f29a085c3/tip` → **200**

```json
{
  "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
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
  "available_until": "2026-10-29T15:58:33.988196Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/50dc117b-09fa-4cff-bb54-fd4f29a085c3/tip` → **201**

```json
{
  "command_id": "5eca723a-898e-4570-9f03-79d0244a9d98",
  "amount_minor": 2500
}
```

```json
{
  "id": "e2c9a3e7-8c87-4c53-bda7-ff278e95298a",
  "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:58:36.402651Z"
}
```

`GET /api/rider/v1/orders/50dc117b-09fa-4cff-bb54-fd4f29a085c3/tip` → **200**

```json
{
  "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
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
  "available_until": "2026-10-29T15:58:33.988196Z",
  "open": false,
  "tip": {
    "id": "e2c9a3e7-8c87-4c53-bda7-ff278e95298a",
    "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:58:36.402651Z"
  }
}
```

`GET /api/rider/v1/orders/50dc117b-09fa-4cff-bb54-fd4f29a085c3/tip` → **200**

```json
{
  "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
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
  "available_until": "2026-10-29T15:58:33.988196Z",
  "open": false,
  "tip": {
    "id": "e2c9a3e7-8c87-4c53-bda7-ff278e95298a",
    "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:58:36.402651Z"
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
      "id": "a409525e-aff0-424f-954f-50c781f4fbbe",
      "at": "2026-10-28T15:58:34.213932Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
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
      "id": "078c143c-91ff-4ef0-ac53-97d73b2d2e8d",
      "at": "2026-10-28T15:58:38.276951Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
      "counterpart_id": null
    },
    {
      "id": "a409525e-aff0-424f-954f-50c781f4fbbe",
      "at": "2026-10-28T15:58:34.213932Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8360facc-775a-42b1-af46-8c0604050021",
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
  "id": "d70e6160-d8bf-4ab8-83ac-4e9220701a5f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:03:39.773499Z",
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
  "session_id": "eafaeb34-8ee3-4dec-905f-8cb30128d77a",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwMjAsImlhdCI6MTc5MzIwMzEyMCwianRpIjoiMWZlODU3NDAtNzZjMy00NDhjLTllYWQtZTI1MWRhODhhYzAyIiwic2lkIjoiZWFmYWViMzQtOGVlMy00ZGVjLTkwNWYtOGNiMzAxMjhkNzdhIn0.7fCJ9k-0JQAcCmSK27s111uYQSlHeAFLz3JDbwRSlOw",
  "access_expires_at": "2026-10-28T16:13:40.364339492Z",
  "refresh_token": "XqajEK_XdfggexIrqSck-PMtHXaCxxFp8tSImg6hIqA",
  "refresh_expires_at": "2026-10-29T03:58:40.363604845Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380736662466` → **200**

```json
{
  "client_id": "bda18196-3044-49a3-b654-6036f58d8866"
}
```

`POST /api/admin/v1/rider-wallets/bda18196-3044-49a3-b654-6036f58d8866/top-ups` → **201**

```json
{
  "command_id": "0b8deced-df5a-44b9-b746-1a617247417e",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "bda18196-3044-49a3-b654-6036f58d8866",
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
      "id": "be3c3aed-d5fe-477a-8fc9-3cedc8c482f7",
      "at": "2026-10-28T15:58:40.904663Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "07ac177d-867f-4b81-ae9a-5c6127b2e3c9",
  "quote_id": "d70e6160-d8bf-4ab8-83ac-4e9220701a5f",
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
  "id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bda18196-3044-49a3-b654-6036f58d8866",
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
  "created_at": "2026-10-28T15:58:41.197172Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a0c74c59-fa32-4062-9345-1c50067cc6f5` → **200**

```json
{
  "id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bda18196-3044-49a3-b654-6036f58d8866",
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
  "created_at": "2026-10-28T15:58:41.197172Z",
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
    "id": "46f854d7-5d75-4757-abe6-83bc44c06d5e",
    "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
    "expires_at": "2026-10-28T15:58:56.20246Z",
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

`POST /api/driver/v1/offers/46f854d7-5d75-4757-abe6-83bc44c06d5e/accept` → **200**

```json
{
  "command_id": "1d1f6536-0139-477a-89d0-2eeb12abc31a"
}
```

```json
{
  "id": "c8503fab-bdad-4ab0-8039-61a9c38a1a54",
  "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "efc4ad70-65a9-4c70-ba39-5a883d3c868f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "efc4ad70-65a9-4c70-ba39-5a883d3c868f",
  "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
  "assignment_id": "c8503fab-bdad-4ab0-8039-61a9c38a1a54",
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

`POST /api/driver/v1/work-sessions/0c5ab4e0-8286-4fac-933c-09157953cf2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:58:42Z",
    "sequence": 1793203122597
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0c5ab4e0-8286-4fac-933c-09157953cf2d",
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
  "last_heartbeat_at": "2026-10-28T15:58:42.61698Z",
  "last_location_at": "2026-10-28T15:58:42.61698Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/efc4ad70-65a9-4c70-ba39-5a883d3c868f/arrive` → **200**

```json
{
  "command_id": "a230a325-5927-4baa-8a2d-fe1bf7e594d8",
  "expected_version": 0
}
```

```json
{
  "id": "efc4ad70-65a9-4c70-ba39-5a883d3c868f",
  "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
  "assignment_id": "c8503fab-bdad-4ab0-8039-61a9c38a1a54",
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
  "arrived_at": "2026-10-28T15:58:42.89095Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/efc4ad70-65a9-4c70-ba39-5a883d3c868f/start` → **200**

```json
{
  "command_id": "c1ebac86-6433-4a0e-96b9-0a0ab1e3abbb",
  "expected_version": 1
}
```

```json
{
  "id": "efc4ad70-65a9-4c70-ba39-5a883d3c868f",
  "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
  "assignment_id": "c8503fab-bdad-4ab0-8039-61a9c38a1a54",
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
  "arrived_at": "2026-10-28T15:58:42.89095Z",
  "started_at": "2026-10-28T15:58:43.18694Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/efc4ad70-65a9-4c70-ba39-5a883d3c868f/complete` → **200**

```json
{
  "command_id": "56764283-df46-4754-9f0c-9c1fa7deea90",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:58:43Z",
  "cash_received": true
}
```

```json
{
  "id": "efc4ad70-65a9-4c70-ba39-5a883d3c868f",
  "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
  "assignment_id": "c8503fab-bdad-4ab0-8039-61a9c38a1a54",
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
  "arrived_at": "2026-10-28T15:58:42.89095Z",
  "started_at": "2026-10-28T15:58:43.18694Z",
  "completed_at": "2026-10-28T15:58:43.473595Z",
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
  "client_id": "bda18196-3044-49a3-b654-6036f58d8866",
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
      "id": "be3c3aed-d5fe-477a-8fc9-3cedc8c482f7",
      "at": "2026-10-28T15:58:40.904663Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
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

`GET /api/rider/v1/orders/a0c74c59-fa32-4062-9345-1c50067cc6f5/tip` → **200**

```json
{
  "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
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
  "available_until": "2026-10-29T15:58:43.473595Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a0c74c59-fa32-4062-9345-1c50067cc6f5/tip` → **201**

```json
{
  "command_id": "c3363857-86af-45fd-9f55-7954b7576d9f",
  "amount_minor": 2500
}
```

```json
{
  "id": "306d2cec-e92b-4748-8139-1d14fbf56621",
  "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:58:44.558269Z"
}
```

`GET /api/rider/v1/orders/a0c74c59-fa32-4062-9345-1c50067cc6f5/tip` → **200**

```json
{
  "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
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
  "available_until": "2026-10-29T15:58:43.473595Z",
  "open": false,
  "tip": {
    "id": "306d2cec-e92b-4748-8139-1d14fbf56621",
    "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:58:44.558269Z"
  }
}
```

`GET /api/rider/v1/orders/a0c74c59-fa32-4062-9345-1c50067cc6f5/tip` → **200**

```json
{
  "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
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
  "available_until": "2026-10-29T15:58:43.473595Z",
  "open": false,
  "tip": {
    "id": "306d2cec-e92b-4748-8139-1d14fbf56621",
    "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:58:44.558269Z"
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
      "id": "498df0ad-1147-4926-a62d-f0806e43a31b",
      "at": "2026-10-28T15:58:46.351539Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
      "counterpart_id": null
    },
    {
      "id": "4f71853a-e1c2-4f7c-94c1-a5c66fa7d93d",
      "at": "2026-10-28T15:58:44.326856Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a0c74c59-fa32-4062-9345-1c50067cc6f5",
      "counterpart_id": null
    },
    {
      "id": "078c143c-91ff-4ef0-ac53-97d73b2d2e8d",
      "at": "2026-10-28T15:58:38.276951Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
      "counterpart_id": null
    },
    {
      "id": "a409525e-aff0-424f-954f-50c781f4fbbe",
      "at": "2026-10-28T15:58:34.213932Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "50dc117b-09fa-4cff-bb54-fd4f29a085c3",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0c5ab4e0-8286-4fac-933c-09157953cf2d",
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
  "last_heartbeat_at": "2026-10-28T15:58:42.61698Z",
  "last_location_at": "2026-10-28T15:58:42.61698Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0c5ab4e0-8286-4fac-933c-09157953cf2d/close` → **200**

```json
{
  "command_id": "5346b583-dbcb-451c-a161-6f40eb15a2e9",
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

Done: card order a0c74c59-fa32-4062-9345-1c50067cc6f5.

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
  "phone": "+380732683172",
  "device_ref": "sandbox-3846"
}
```

```json
{
  "challenge_id": "5696613b-875a-473b-abab-b856b351f199",
  "expires_at": "2026-10-28T16:03:47.453972607Z",
  "resend_available_at": "2026-10-28T15:58:48.453972607Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732683172` → **200**

```json
{
  "phone": "+380732683172",
  "audience": "CLIENT",
  "code": "639305",
  "sent_at": "2026-10-28T15:58:47.457231884Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5696613b-875a-473b-abab-b856b351f199",
  "code": "639305",
  "device_ref": "sandbox-3846"
}
```

```json
{
  "session_id": "33f60720-7052-4e87-9788-da121325886f",
  "subject": {
    "type": "CLIENT",
    "id": "c344611a-2dda-4a15-ae9c-3ebdfc901ea7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzQ0NjExYS0yZGRhLTRhMTUtYWU5Yy0zZWJkZmM5MDFlYTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MDI3LCJpYXQiOjE3OTMyMDMxMjcsImp0aSI6IjNkMmZlZDBiLTlkZTMtNGE3Ny1hNDMwLTgzZWY0M2E0OTgyNSIsInNpZCI6IjMzZjYwNzIwLTcwNTItNGU4Ny05Nzg4LWRhMTIxMzI1ODg2ZiJ9.gNgBUtKa-WSzMydiYPzJdFLxYj9qM74ka2ynP7iUAAU",
  "access_expires_at": "2026-10-28T16:13:47.748741294Z",
  "refresh_token": "FQ1PXp3mofp-DEVbeuI-qIKK2XDdGV4qafbi9BsXMfI",
  "refresh_expires_at": "2026-11-27T15:58:47.748155701Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "1d37a2cc-757e-4047-8d02-12160e463e9c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "54f1ccc9-e5c1-48ae-b8f9-6f05e6c910f6",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-54f1ccc9-e5c1-48ae-b8f9-6f05e6c910f6",
    "orderDate": "1793203128",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "aadb0b221d608ca81103f87a4c764bab",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=54f1ccc9-e5c1-48ae-b8f9-6f05e6c910f6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732683172"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=54f1ccc9-e5c1-48ae-b8f9-6f05e6c910f6",
  "created_at": "2026-10-28T15:58:48.027448Z",
  "expires_at": "2026-10-28T16:28:48.027448Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/54f1ccc9-e5c1-48ae-b8f9-6f05e6c910f6` → **200**

```json
{
  "id": "54f1ccc9-e5c1-48ae-b8f9-6f05e6c910f6",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:58:48.027448Z",
  "expires_at": "2026-10-28T16:28:48.027448Z",
  "completed_at": "2026-10-28T15:58:48.318656Z",
  "masked_pan": "41****6233",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "c344611a-2dda-4a15-ae9c-3ebdfc901ea7",
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
      "id": "c99f9fb7-4233-44f0-bd1e-f7ab80511d9a",
      "at": "2026-10-28T15:58:48.366205Z",
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
  "client_id": "c344611a-2dda-4a15-ae9c-3ebdfc901ea7",
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
      "id": "c99f9fb7-4233-44f0-bd1e-f7ab80511d9a",
      "at": "2026-10-28T15:58:48.366205Z",
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
  "device_ref": "sandbox-7904"
}
```

```json
{
  "challenge_id": "587695ad-731b-453e-9cba-70883b7dfb18",
  "expires_at": "2026-10-28T16:03:49.145489168Z",
  "resend_available_at": "2026-10-28T15:58:50.145489168Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "068066",
  "sent_at": "2026-10-28T15:58:49.148257204Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "587695ad-731b-453e-9cba-70883b7dfb18",
  "code": "068066",
  "device_ref": "sandbox-7904"
}
```

```json
{
  "session_id": "9ba5bd97-50b8-4e90-a8c3-7b225cdfeb29",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDAyOSwiaWF0IjoxNzkzMjAzMTI5LCJqdGkiOiIwYjEzZmY3Yi02YjgwLTRmNWEtODU4Ny05ODhlZDFhNDM2OTMiLCJzaWQiOiI5YmE1YmQ5Ny01MGI4LTRlOTAtYThjMy03YjIyNWNkZmViMjkifQ.jLQRNktRPuwqi2DwNOzevEZdF4mM_xAmUuzsznpSolk",
  "access_expires_at": "2026-10-28T16:13:49.445368715Z",
  "refresh_token": "vdFkE_crXmFlmixBABXie0rOohpls2_HnOr6Gb6Q214",
  "refresh_expires_at": "2026-11-27T15:58:49.444315539Z",
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
  "command_id": "550c8dd5-e92e-4ef1-9e7f-edd8795bc38d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "02fcff1a-25e0-4b0b-9c6f-02a2da7a7eb7",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-02fcff1a-25e0-4b0b-9c6f-02a2da7a7eb7",
    "orderDate": "1793203129",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "44522024cea4ecbede8e964ff40c0751",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=02fcff1a-25e0-4b0b-9c6f-02a2da7a7eb7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=02fcff1a-25e0-4b0b-9c6f-02a2da7a7eb7",
  "created_at": "2026-10-28T15:58:49.983909Z",
  "expires_at": "2026-10-28T16:28:49.983909Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/02fcff1a-25e0-4b0b-9c6f-02a2da7a7eb7` → **200**

```json
{
  "id": "02fcff1a-25e0-4b0b-9c6f-02a2da7a7eb7",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:58:49.983909Z",
  "expires_at": "2026-10-28T16:28:49.983909Z",
  "completed_at": "2026-10-28T15:58:50.256631Z",
  "masked_pan": "41****2209",
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
      "id": "f9f482b1-70e1-4269-8eb6-b5744de1fdc6",
      "at": "2026-10-28T15:58:50.373079Z",
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
  "command_id": "eed36105-385e-42ed-8d87-d82f2264fb86",
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
  "correlation_id": "1404b1b8-018f-4eb6-bbd6-6e1a0d824077"
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
  "session_id": "5fe40d45-9c88-4e77-a171-5618988fa378",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwMzEsImlhdCI6MTc5MzIwMzEzMSwianRpIjoiNjExYmUxYTQtM2YxNS00ZWViLWIyZWEtMzM0OWVlM2VkNTQ2Iiwic2lkIjoiNWZlNDBkNDUtOWM4OC00ZTc3LWExNzEtNTYxODk4OGZhMzc4In0.pmSh22IqtlAx5I7q6S0LGZTxYgdyCcIirDG3k_geNUI",
  "access_expires_at": "2026-10-28T16:13:51.4104498Z",
  "refresh_token": "5UY51AfyEy5HxJMHtjHCH1DqhF3XoICZCQzJCogRmUE",
  "refresh_expires_at": "2026-10-29T03:58:51.409778166Z",
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
  "phone": "+48600928974",
  "device_ref": "sandbox-5299"
}
```

```json
{
  "challenge_id": "2af1baad-b1fd-49d7-bfeb-6953d717de3e",
  "expires_at": "2026-10-28T16:03:52.275482592Z",
  "resend_available_at": "2026-10-28T15:58:53.275482592Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600928974` → **200**

```json
{
  "phone": "+48600928974",
  "audience": "CLIENT",
  "code": "312662",
  "sent_at": "2026-10-28T15:58:52.278336181Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2af1baad-b1fd-49d7-bfeb-6953d717de3e",
  "code": "312662",
  "device_ref": "sandbox-5299"
}
```

```json
{
  "session_id": "7b7112cc-8d2c-45fb-89d7-22911923141f",
  "subject": {
    "type": "CLIENT",
    "id": "96b3a675-54c4-41b1-ae2f-b46b8aa65bb4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NmIzYTY3NS01NGM0LTQxYjEtYWUyZi1iNDZiOGFhNjViYjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MDMyLCJpYXQiOjE3OTMyMDMxMzIsImp0aSI6Ijg3MDY1ZTA5LTViYTQtNGNiOC1iMjYwLThiOTEzMTgyYWRiNyIsInNpZCI6IjdiNzExMmNjLThkMmMtNDVmYi04OWQ3LTIyOTExOTIzMTQxZiJ9.N8k430ixrat1J5hQtDK1vH3pspGXy2gaaHJaXCrvFKw",
  "access_expires_at": "2026-10-28T16:13:52.644351583Z",
  "refresh_token": "VIexMHTCILomd94N2E5rKYIedIhKCnjWUIhlwcYckvM",
  "refresh_expires_at": "2026-11-27T15:58:52.643713057Z",
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
  "command_id": "6ba7daca-d918-49a4-b1e6-b13c96906c34",
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
  "correlation_id": "a9ba157a-7c6a-4389-8649-85d72220fe25",
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
  "command_id": "08ee4a93-bada-4e76-833a-263d520c3550",
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
  "paused_at": "2026-10-28T15:58:53.758286298Z",
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
  "command_id": "5a4f76e8-393f-4587-a7e0-c0477ba608df",
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
  "id": "d261f196-f264-41b3-96a7-c87794e9cb73",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:03:54.328736Z",
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
  "command_id": "de159833-179d-4279-b023-303939bdabdf",
  "quote_id": "d261f196-f264-41b3-96a7-c87794e9cb73",
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
  "correlation_id": "3a6578b8-b264-4800-873e-00d0f3f1b161"
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
  "paused_at": "2026-10-28T15:58:53.758286Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "49a56fe7-4a3e-4f0d-a9aa-f94d6b605945",
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
  "command_id": "e9ab58c5-e876-4e1b-91ca-363b9743c487",
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
  "command_id": "21b5f4b4-f559-44d5-8e0a-d0a46271a162",
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
  "id": "62628bc8-e019-449e-9197-cde762ac853a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:03:56.004412Z",
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
  "command_id": "ff57d806-27ef-44ae-b9c0-4370f1fc5091",
  "quote_id": "62628bc8-e019-449e-9197-cde762ac853a",
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
  "correlation_id": "e48f1fa8-bb5a-47f7-8acd-d6799e54c204"
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
  "command_id": "a72776bd-5622-4b37-8c1c-d263f35e6991",
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
  "command_id": "796a234d-75c3-4757-973d-c82a351f8052",
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
  "id": "1596d864-e54a-466c-bcd2-3179eaaaf5ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:03:57.104583Z",
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
  "command_id": "a4bea1d0-bf97-486e-b4e7-7adc6ea0031e",
  "quote_id": "1596d864-e54a-466c-bcd2-3179eaaaf5ea",
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
  "correlation_id": "9892ec84-1fbb-4719-b871-88212d74db81"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "8484be88-9a30-4e4d-a839-38ec25944ea4",
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
  "correlation_id": "c4caf7ac-2c3e-4203-911a-e1f06e464651"
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
  "command_id": "bfbc7df1-8144-4138-ac40-3304db0702a3",
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
  "phone": "+380673964232",
  "device_ref": "sandbox-7294"
}
```

```json
{
  "challenge_id": "65f2cf50-0537-436c-8621-e4165de5f98d",
  "expires_at": "2026-10-28T16:03:58.491265872Z",
  "resend_available_at": "2026-10-28T15:58:59.491265872Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673964232` → **200**

```json
{
  "phone": "+380673964232",
  "audience": "CLIENT",
  "code": "677359",
  "sent_at": "2026-10-28T15:58:58.493527671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65f2cf50-0537-436c-8621-e4165de5f98d",
  "code": "677359",
  "device_ref": "sandbox-7294"
}
```

```json
{
  "session_id": "efb8bf65-575d-4c9a-b77c-bf1dd3d8e2cc",
  "subject": {
    "type": "CLIENT",
    "id": "97b43bde-a473-4fbe-8932-a118cdbd2799"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5N2I0M2JkZS1hNDczLTRmYmUtODkzMi1hMTE4Y2RiZDI3OTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MDM4LCJpYXQiOjE3OTMyMDMxMzgsImp0aSI6ImIzN2FlOGE2LTc2MTYtNDY2Ni04OTA0LThjYmY2NWUwNWZmOCIsInNpZCI6ImVmYjhiZjY1LTU3NWQtNGM5YS1iNzdjLWJmMWRkM2Q4ZTJjYyJ9.Uq3bkRa7uTzWAJSWrMvyYuJaHJ-oPoDkeONUncUuthE",
  "access_expires_at": "2026-10-28T16:13:58.784012642Z",
  "refresh_token": "PMV--r_IIpxaVha56LWUQzre6FrRx7UWkk-xvWA4CxY",
  "refresh_expires_at": "2026-11-27T15:58:58.78341455Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "97b43bde-a473-4fbe-8932-a118cdbd2799",
  "session_id": "efb8bf65-575d-4c9a-b77c-bf1dd3d8e2cc",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cbffb46e-cbe4-488a-a50d-c51d25eac94d",
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
  "id": "e8b4b8cf-c3d6-473f-82f8-82ab5563a502",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:03:59.318956Z",
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
  "challenge_id": "52351c06-c130-4461-af9c-4256eb84332a",
  "expires_at": "2026-10-28T16:04:01.594253173Z",
  "resend_available_at": "2026-10-28T15:59:02.594253173Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673964232` → **200**

```json
{
  "phone": "+380673964232",
  "audience": "CLIENT",
  "code": "393334",
  "sent_at": "2026-10-28T15:59:01.596277476Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "e24aa550-888b-4c20-a891-55cb5a8d1404",
  "challenge_id": "52351c06-c130-4461-af9c-4256eb84332a",
  "otp_code": "393334"
}
```

```json
{
  "client_id": "97b43bde-a473-4fbe-8932-a118cdbd2799",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T15:59:01.900647853Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "9c1ce922-25af-4773-a505-98006ff7b289",
  "quote_id": "e8b4b8cf-c3d6-473f-82f8-82ab5563a502",
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
  "correlation_id": "eb65895b-9865-4c31-97e3-ed00307c9254"
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
  "session_id": "b98f4834-39ac-4c1b-8bec-b1ff1b8d4a0e",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwNDIsImlhdCI6MTc5MzIwMzE0MiwianRpIjoiMmNhZjhkYzYtZDU5ZC00YmNkLThjZmItODIxYzcwZTNhZTJjIiwic2lkIjoiYjk4ZjQ4MzQtMzlhYy00YzFiLThiZWMtYjFmZjFiOGQ0YTBlIn0.hZOYPYLZspTNB4QeEKwc2OeVRLHmglpB6Pa1GcmKWJY",
  "access_expires_at": "2026-10-28T16:14:02.743186679Z",
  "refresh_token": "-vHqjicIetyEuS2hfAvHaRLIH1vIlgKhKRM4GrmYFjI",
  "refresh_expires_at": "2026-10-29T03:59:02.742596697Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "97b43bde-a473-4fbe-8932-a118cdbd2799",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T15:59:01.900648Z",
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

`POST /api/admin/v1/client-deletions/97b43bde-a473-4fbe-8932-a118cdbd2799/complete` → **200**

```json
{
  "command_id": "114f7903-b815-4755-bcc5-f6202fe9712d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "97b43bde-a473-4fbe-8932-a118cdbd2799",
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
  "correlation_id": "90cbb9e7-1206-4937-82a2-a9b3f0b360ac"
}
```

Done: client 97b43bde-a473-4fbe-8932-a118cdbd2799 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661412921",
  "device_ref": "sandbox-13136"
}
```

```json
{
  "challenge_id": "bbde99f5-7928-4438-9990-6bfe31de0e25",
  "expires_at": "2026-10-28T16:04:03.891701468Z",
  "resend_available_at": "2026-10-28T15:59:04.891701468Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661412921` → **200**

```json
{
  "phone": "+380661412921",
  "audience": "CLIENT",
  "code": "083279",
  "sent_at": "2026-10-28T15:59:03.894266088Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bbde99f5-7928-4438-9990-6bfe31de0e25",
  "code": "083279",
  "device_ref": "sandbox-13136"
}
```

```json
{
  "session_id": "f6981e86-c554-4859-9c1b-d65080853631",
  "subject": {
    "type": "CLIENT",
    "id": "2d8ac445-c994-4b08-ab2a-e816a58c9cf8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDhhYzQ0NS1jOTk0LTRiMDgtYWIyYS1lODE2YTU4YzljZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MDQ0LCJpYXQiOjE3OTMyMDMxNDQsImp0aSI6IjNhYmY1MjQ1LWE1ZWEtNDU4NC05ZWJmLWQ0Y2Q2ZGViMWU0OSIsInNpZCI6ImY2OTgxZTg2LWM1NTQtNDg1OS05YzFiLWQ2NTA4MDg1MzYzMSJ9.STYR4TGPDI8fCC20yUdM8_54e1ixPBcKZpt2pIwhV-w",
  "access_expires_at": "2026-10-28T16:14:04.187091787Z",
  "refresh_token": "tP66fIDmKi58lLLHAS_sejUV67QOvLHms0VfP6o_y_U",
  "refresh_expires_at": "2026-11-27T15:59:04.186444448Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2d8ac445-c994-4b08-ab2a-e816a58c9cf8",
  "session_id": "f6981e86-c554-4859-9c1b-d65080853631",
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
  "session_id": "c0b9e817-2c26-4e0a-8442-dc9c4684ade4",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwNDQsImlhdCI6MTc5MzIwMzE0NCwianRpIjoiNmExOWIxZjYtMmIxZS00NzA2LWE4OGEtYjVmMzk5ZTkzYTJiIiwic2lkIjoiYzBiOWU4MTctMmMyNi00ZTBhLTg0NDItZGM5YzQ2ODRhZGU0In0.SEjNCSznmJc630Sm8-XahCN0R7mkgeHkoHfBNCVGYGo",
  "access_expires_at": "2026-10-28T16:14:04.994069327Z",
  "refresh_token": "meoR3tBhpcFdCC06RIMxN3hlImR6ZbJr8g7KW-qi5Gk",
  "refresh_expires_at": "2026-10-29T03:59:04.993549066Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1412921&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "2d8ac445-c994-4b08-ab2a-e816a58c9cf8",
      "phone": "+380661412921",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T15:59:04.184171Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/2d8ac445-c994-4b08-ab2a-e816a58c9cf8` → **200**

```json
{
  "client": {
    "id": "2d8ac445-c994-4b08-ab2a-e816a58c9cf8",
    "phone": "+380661412921",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:59:04.184171Z",
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

`POST /api/admin/v1/clients/2d8ac445-c994-4b08-ab2a-e816a58c9cf8/block` → **400**

```json
{
  "command_id": "1c5a863a-9c43-4e8c-87b3-bea4114aa9fc",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/2d8ac445-c994-4b08-ab2a-e816a58c9cf8/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1f2429b2-5b97-42ee-9761-07dfa9788ac9",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/2d8ac445-c994-4b08-ab2a-e816a58c9cf8/block` → **200**

```json
{
  "command_id": "0f72c021-0068-4353-804e-e8b784cea95e",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "2d8ac445-c994-4b08-ab2a-e816a58c9cf8",
  "phone": "+380661412921",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T15:59:04.184171Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T15:59:06.145164Z",
    "by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
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
  "correlation_id": "970c9001-17f7-4c43-8ccf-fa1b9aa30b14"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661412921",
  "device_ref": "sandbox-8532"
}
```

```json
{
  "challenge_id": "575250f5-b877-4032-89eb-a0b6cb83f231",
  "expires_at": "2026-10-28T16:04:08.678345827Z",
  "resend_available_at": "2026-10-28T15:59:09.678345827Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661412921` → **200**

```json
{
  "phone": "+380661412921",
  "audience": "CLIENT",
  "code": "012666",
  "sent_at": "2026-10-28T15:59:08.680656932Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "575250f5-b877-4032-89eb-a0b6cb83f231",
  "code": "012666",
  "device_ref": "sandbox-8532"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "f2533568-318f-4b12-baeb-3317c21f5883"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/2d8ac445-c994-4b08-ab2a-e816a58c9cf8` → **200**

```json
{
  "client": {
    "id": "2d8ac445-c994-4b08-ab2a-e816a58c9cf8",
    "phone": "+380661412921",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T15:59:04.184171Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T15:59:06.145164Z",
      "by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
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

`POST /api/admin/v1/clients/2d8ac445-c994-4b08-ab2a-e816a58c9cf8/unblock` → **200**

```json
{
  "command_id": "7b722ac5-68ad-4a6c-ab4a-5a0773a9af38",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "2d8ac445-c994-4b08-ab2a-e816a58c9cf8",
  "phone": "+380661412921",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T15:59:04.184171Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661412921",
  "device_ref": "sandbox-15729"
}
```

```json
{
  "challenge_id": "aa32c4a6-2ef3-40ed-883f-5bdd9df7efa5",
  "expires_at": "2026-10-28T16:04:11.820914741Z",
  "resend_available_at": "2026-10-28T15:59:12.820914741Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661412921` → **200**

```json
{
  "phone": "+380661412921",
  "audience": "CLIENT",
  "code": "993591",
  "sent_at": "2026-10-28T15:59:11.82297614Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa32c4a6-2ef3-40ed-883f-5bdd9df7efa5",
  "code": "993591",
  "device_ref": "sandbox-15729"
}
```

```json
{
  "session_id": "6b3bc4d6-b1e1-4859-b58a-a21532a77b13",
  "subject": {
    "type": "CLIENT",
    "id": "2d8ac445-c994-4b08-ab2a-e816a58c9cf8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDhhYzQ0NS1jOTk0LTRiMDgtYWIyYS1lODE2YTU4YzljZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MDUyLCJpYXQiOjE3OTMyMDMxNTIsImp0aSI6IjI5ODE2MWEyLTY2NDQtNDJkYy04N2FiLTUxZDMxOGZiZjlhYiIsInNpZCI6IjZiM2JjNGQ2LWIxZTEtNDg1OS1iNThhLWEyMTUzMmE3N2IxMyJ9.PcYKlrkOTKluwExPWreuecYTGfzXCZl8IdK6Kmrf6go",
  "access_expires_at": "2026-10-28T16:14:12.116012934Z",
  "refresh_token": "1xxvt7AXOmks06sUOFqRXug2mfknNo1eqiqdi3CKX8s",
  "refresh_expires_at": "2026-11-27T15:59:12.115480229Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2d8ac445-c994-4b08-ab2a-e816a58c9cf8",
  "session_id": "6b3bc4d6-b1e1-4859-b58a-a21532a77b13",
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
  "phone": "+380663325263",
  "device_ref": "sandbox-24642"
}
```

```json
{
  "challenge_id": "763aa739-d210-4084-970e-14f17c800473",
  "expires_at": "2026-10-28T16:04:12.660352264Z",
  "resend_available_at": "2026-10-28T15:59:13.660352264Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663325263` → **200**

```json
{
  "phone": "+380663325263",
  "audience": "CLIENT",
  "code": "263099",
  "sent_at": "2026-10-28T15:59:12.66332745Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "763aa739-d210-4084-970e-14f17c800473",
  "code": "263099",
  "device_ref": "sandbox-24642"
}
```

```json
{
  "session_id": "8a5e71f6-f1e1-4479-8361-731ace13895f",
  "subject": {
    "type": "CLIENT",
    "id": "ba308aa2-2b88-4912-941c-0ff3b82be287"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYTMwOGFhMi0yYjg4LTQ5MTItOTQxYy0wZmYzYjgyYmUyODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MDUyLCJpYXQiOjE3OTMyMDMxNTIsImp0aSI6IjY0OWZjZjMyLTQyZGYtNGZmYi05MmQ1LTMwMWEzZTRhM2NiOCIsInNpZCI6IjhhNWU3MWY2LWYxZTEtNDQ3OS04MzYxLTczMWFjZTEzODk1ZiJ9.Zcwn-2YDsrXKgyPhTYGhOIOAM0lCNmw3tgI4PpbymVI",
  "access_expires_at": "2026-10-28T16:14:12.956599197Z",
  "refresh_token": "4ANAKLSsHl6TE2kO-PJiRnIT3R605aDbveaCeiqNfZY",
  "refresh_expires_at": "2026-11-27T15:59:12.955894565Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f23cde55-fe08-43dc-9555-a1615848e26c",
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
  "id": "b1982ef1-fd21-4858-b953-9a51fd7e136a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:04:13.227460Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 3de36635-7728-4088-99aa-25b0e6fe8054) → **201**

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
  "session_id": "746f0d5b-2070-453a-8e3e-b682b69765fe",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwNTMsImlhdCI6MTc5MzIwMzE1MywianRpIjoiNzZjZjQ5N2YtODllNy00OTQ5LWE0MjctNTAwOTZkZmEwNGI4Iiwic2lkIjoiNzQ2ZjBkNWItMjA3MC00NTNhLThlM2UtYjY4MmI2OTc2NWZlIn0.rI9plOt3uuHkuHG7hOl6PD_bUYqMRp4gNoL5Wllg1Rg",
  "access_expires_at": "2026-10-28T16:14:13.843455361Z",
  "refresh_token": "gYoJ-3qNL1JpiNSwJCvg0W6YA1TP47C9lpV40VCasJU",
  "refresh_expires_at": "2026-10-29T03:59:13.84285544Z",
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
  "session_id": "4906cd89-07ea-4a58-84c6-5e61412bf945",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwNTQsImlhdCI6MTc5MzIwMzE1NCwianRpIjoiMDNhOTY4MWMtY2Q4My00NWNkLTkzNzUtNTNjNWMwMWFkMDZiIiwic2lkIjoiNDkwNmNkODktMDdlYS00YTU4LTg0YzYtNWU2MTQxMmJmOTQ1In0.AbxLjXGbO1SpSaJKTsj9vVR673pcpdgifaQUwYwe9iQ",
  "access_expires_at": "2026-10-28T16:14:14.396322979Z",
  "refresh_token": "NGVujxiyx5M6dg7EDTrrnGCd2sWj8LkiW9HTIMMypMo",
  "refresh_expires_at": "2026-10-29T03:59:14.395712636Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/212e31e2-8b0f-4116-8106-684b52742db2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:59:13.51501Z",
      "actor": {
        "type": "CLIENT",
        "id": "ba308aa2-2b88-4912-941c-0ff3b82be287",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "212e31e2-8b0f-4116-8106-684b52742db2",
        "quote_id": "b1982ef1-fd21-4858-b953-9a51fd7e136a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "3de36635-7728-4088-99aa-25b0e6fe8054"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:59:13.51689Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "212e31e2-8b0f-4116-8106-684b52742db2",
        "attempt_id": "f8095baa-375c-4449-9d85-a85351763bbb",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3de36635-7728-4088-99aa-25b0e6fe8054"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T15:59:13.525966Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "212e31e2-8b0f-4116-8106-684b52742db2",
        "attempt_id": "f8095baa-375c-4449-9d85-a85351763bbb"
      },
      "correlation_id": "3de36635-7728-4088-99aa-25b0e6fe8054"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "f8095baa-375c-4449-9d85-a85351763bbb",
        "generation": 1,
        "started_at": "2026-10-28T15:59:13.516014Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T15:59:13.525966Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T15:59:13.517706Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/3de36635-7728-4088-99aa-25b0e6fe8054` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "212e31e2-8b0f-4116-8106-684b52742db2:0",
      "order_id": "212e31e2-8b0f-4116-8106-684b52742db2",
      "at": "2026-10-28T15:59:13.51501Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "212e31e2-8b0f-4116-8106-684b52742db2:1",
      "order_id": "212e31e2-8b0f-4116-8106-684b52742db2",
      "at": "2026-10-28T15:59:13.51689Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "212e31e2-8b0f-4116-8106-684b52742db2:2",
      "order_id": "212e31e2-8b0f-4116-8106-684b52742db2",
      "at": "2026-10-28T15:59:13.525966Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/d266e7b8-a9ed-4070-a835-3e7b7a4d52ae` → **200**

```json
{
  "found": []
}
```

Done: request 3de36635-7728-4088-99aa-25b0e6fe8054 — order 212e31e2-8b0f-4116-8106-684b52742db2 found by its id.

`GET /api/rider/v1/orders/212e31e2-8b0f-4116-8106-684b52742db2` → **200**

```json
{
  "id": "212e31e2-8b0f-4116-8106-684b52742db2",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ba308aa2-2b88-4912-941c-0ff3b82be287",
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
  "created_at": "2026-10-28T15:59:13.514453Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/212e31e2-8b0f-4116-8106-684b52742db2/cancel` → **200**

```json
{
  "command_id": "af1a2149-152b-430a-9614-f236c4cf5ebf",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "212e31e2-8b0f-4116-8106-684b52742db2",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ba308aa2-2b88-4912-941c-0ff3b82be287",
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
  "created_at": "2026-10-28T15:59:13.514453Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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
  "phone": "+380639336491",
  "device_ref": "sandbox-8476"
}
```

```json
{
  "challenge_id": "f24a5b0c-ec43-4914-9898-ead19278a2d3",
  "expires_at": "2026-10-28T16:04:16.1056118Z",
  "resend_available_at": "2026-10-28T15:59:17.1056118Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639336491` → **200**

```json
{
  "phone": "+380639336491",
  "audience": "CLIENT",
  "code": "190253",
  "sent_at": "2026-10-28T15:59:16.108453917Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f24a5b0c-ec43-4914-9898-ead19278a2d3",
  "code": "190253",
  "device_ref": "sandbox-8476"
}
```

```json
{
  "session_id": "cee35b06-638a-4e68-a121-784f328b12d5",
  "subject": {
    "type": "CLIENT",
    "id": "3778a691-a688-4d4c-a480-72d35eb0f99b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzc4YTY5MS1hNjg4LTRkNGMtYTQ4MC03MmQzNWViMGY5OWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MDU2LCJpYXQiOjE3OTMyMDMxNTYsImp0aSI6Ijg5ZDZjOTZmLWRlYjEtNDJjMC1hMjcyLTJjYzY3MTQ0ZDRkMSIsInNpZCI6ImNlZTM1YjA2LTYzOGEtNGU2OC1hMTIxLTc4NGYzMjhiMTJkNSJ9.4ruirHZxjA1WZ5hPmlzNZCQfpGg4tK2zbtKbKdLpGCc",
  "access_expires_at": "2026-10-28T16:14:16.402227122Z",
  "refresh_token": "FCrzVdusLiwIpEJdufW8BEpDfJabFWxkGrBmiUFFKpI",
  "refresh_expires_at": "2026-11-27T15:59:16.401617939Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "4b653007-d36a-4c90-93f4-5d7361ab9aa8",
  "expires_at": "2026-10-28T16:04:18.669697256Z",
  "resend_available_at": "2026-10-28T15:59:19.669697256Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639336491` → **200**

```json
{
  "phone": "+380639336491",
  "audience": "CLIENT",
  "code": "682277",
  "sent_at": "2026-10-28T15:59:18.671958881Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "4feb20a2-1fde-4796-b9a3-9d73ff575a37",
  "challenge_id": "4b653007-d36a-4c90-93f4-5d7361ab9aa8",
  "otp_code": "682277"
}
```

```json
{
  "id": "03ba8d1f-a931-45c6-83f8-cf705533aaf6",
  "state": "PENDING",
  "created_at": "2026-10-28T15:59:18.973589Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/03ba8d1f-a931-45c6-83f8-cf705533aaf6` → **200**

```json
{
  "id": "03ba8d1f-a931-45c6-83f8-cf705533aaf6",
  "state": "PENDING",
  "created_at": "2026-10-28T15:59:18.973589Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/03ba8d1f-a931-45c6-83f8-cf705533aaf6` → **200**

```json
{
  "id": "03ba8d1f-a931-45c6-83f8-cf705533aaf6",
  "state": "PENDING",
  "created_at": "2026-10-28T15:59:18.973589Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/03ba8d1f-a931-45c6-83f8-cf705533aaf6` → **200**

```json
{
  "id": "03ba8d1f-a931-45c6-83f8-cf705533aaf6",
  "state": "PENDING",
  "created_at": "2026-10-28T15:59:18.973589Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/03ba8d1f-a931-45c6-83f8-cf705533aaf6` → **200**

```json
{
  "id": "03ba8d1f-a931-45c6-83f8-cf705533aaf6",
  "state": "PENDING",
  "created_at": "2026-10-28T15:59:18.973589Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/03ba8d1f-a931-45c6-83f8-cf705533aaf6` → **200**

```json
{
  "id": "03ba8d1f-a931-45c6-83f8-cf705533aaf6",
  "state": "PENDING",
  "created_at": "2026-10-28T15:59:18.973589Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/03ba8d1f-a931-45c6-83f8-cf705533aaf6` → **200**

```json
{
  "id": "03ba8d1f-a931-45c6-83f8-cf705533aaf6",
  "state": "PENDING",
  "created_at": "2026-10-28T15:59:18.973589Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/03ba8d1f-a931-45c6-83f8-cf705533aaf6` → **200**

```json
{
  "id": "03ba8d1f-a931-45c6-83f8-cf705533aaf6",
  "state": "READY",
  "created_at": "2026-10-28T15:59:18.973589Z",
  "ready_at": "2026-10-28T15:59:26.73331Z",
  "expires_at": "2026-11-04T15:59:26.73331Z",
  "size_bytes": 1029
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/03ba8d1f-a931-45c6-83f8-cf705533aaf6/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630933397",
  "device_ref": "sandbox-19680"
}
```

```json
{
  "challenge_id": "d29de963-5abe-43df-a98f-5a6c0ca91f97",
  "expires_at": "2026-10-28T16:04:27.099647957Z",
  "resend_available_at": "2026-10-28T15:59:28.099647957Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630933397` → **200**

```json
{
  "phone": "+380630933397",
  "audience": "CLIENT",
  "code": "415089",
  "sent_at": "2026-10-28T15:59:27.102253665Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d29de963-5abe-43df-a98f-5a6c0ca91f97",
  "code": "415089",
  "device_ref": "sandbox-19680"
}
```

```json
{
  "session_id": "6dd81622-1300-4519-aa03-814c61e94dac",
  "subject": {
    "type": "CLIENT",
    "id": "241703ce-7d9b-449b-84ca-149106ea3ddf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDE3MDNjZS03ZDliLTQ0OWItODRjYS0xNDkxMDZlYTNkZGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MDY3LCJpYXQiOjE3OTMyMDMxNjcsImp0aSI6ImJmMTBiZGZjLWYwMGItNDM0ZC05YjM2LWU4M2EzZjY0YjJkZCIsInNpZCI6IjZkZDgxNjIyLTEzMDAtNDUxOS1hYTAzLTgxNGM2MWU5NGRhYyJ9.UCKLmjXkL_ExANLVDn3k8ymbQOxVwvVFlHkc_-Vdi5A",
  "access_expires_at": "2026-10-28T16:14:27.390931603Z",
  "refresh_token": "5LAAfCeyfPGaugW3hkUE-pm7gHcd-wo62EIoAMMu7M0",
  "refresh_expires_at": "2026-11-27T15:59:27.39028134Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/03ba8d1f-a931-45c6-83f8-cf705533aaf6/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/03ba8d1f-a931-45c6-83f8-cf705533aaf6/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "175a4216-78cf-41b2-b2c0-d4b09a61c366"
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
  "session_id": "1a1a308e-07bb-4a06-b91e-ad4aea1d1b6a",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwNjgsImlhdCI6MTc5MzIwMzE2OCwianRpIjoiYjYwMTE5OWUtMGRhZS00NDc1LWEwMDMtOWEyZTVhMTI1MzliIiwic2lkIjoiMWExYTMwOGUtMDdiYi00YTA2LWI5MWUtYWQ0YWVhMWQxYjZhIn0.SDOd3QXmf_B3nvBONxPGXrvEPp2Cch0A65U6Cs737SM",
  "access_expires_at": "2026-10-28T16:14:28.216078667Z",
  "refresh_token": "-7_68O3rxE6zDZYA-rEor0iD2vqGNq6npXV3z8RGgcY",
  "refresh_expires_at": "2026-10-29T03:59:28.215560078Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3778a691-a688-4d4c-a480-72d35eb0f99b",
  "session_id": "cee35b06-638a-4e68-a121-784f328b12d5",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/3778a691-a688-4d4c-a480-72d35eb0f99b/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "03ba8d1f-a931-45c6-83f8-cf705533aaf6",
      "state": "READY",
      "created_at": "2026-10-28T15:59:18.973589Z",
      "ready_at": "2026-10-28T15:59:26.73331Z",
      "expires_at": "2026-11-04T15:59:26.73331Z",
      "size_bytes": 1029
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
  "device_ref": "sandbox-17234"
}
```

```json
{
  "challenge_id": "fe466608-6bbc-48c9-9b84-6ed2c30ee56f",
  "expires_at": "2026-10-28T16:04:29.011517847Z",
  "resend_available_at": "2026-10-28T15:59:30.011517847Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "913923",
  "sent_at": "2026-10-28T15:59:29.013800412Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe466608-6bbc-48c9-9b84-6ed2c30ee56f",
  "code": "913923",
  "device_ref": "sandbox-17234"
}
```

```json
{
  "session_id": "a48de3e4-db17-447d-9c71-c4eee95c93aa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDA2OSwiaWF0IjoxNzkzMjAzMTY5LCJqdGkiOiIzN2IwMDI1Yi00OGVlLTRlZGQtOGZmYS1mODRjZDVhMDg4ZjEiLCJzaWQiOiJhNDhkZTNlNC1kYjE3LTQ0N2QtOWM3MS1jNGVlZTk1YzkzYWEifQ.2PzyKCUrEFpw4WHJvG6JbVLPGYRvYfmaV4xHHuT3cKs",
  "access_expires_at": "2026-10-28T16:14:29.301633967Z",
  "refresh_token": "zPFMaxROJF_l2Kv8ANegi7Ioj1DkPVSLXG0Ozg2nrtI",
  "refresh_expires_at": "2026-11-27T15:59:29.300957263Z",
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
  "device_ref": "sandbox-30560"
}
```

```json
{
  "challenge_id": "24e15482-6280-4fee-829c-7b49eff1addd",
  "expires_at": "2026-10-28T16:04:29.821690515Z",
  "resend_available_at": "2026-10-28T15:59:30.821690515Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "471180",
  "sent_at": "2026-10-28T15:59:29.824277869Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24e15482-6280-4fee-829c-7b49eff1addd",
  "code": "471180",
  "device_ref": "sandbox-30560"
}
```

```json
{
  "session_id": "4566d18a-bcec-4453-b64e-c8a52a5576a0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDA3MCwiaWF0IjoxNzkzMjAzMTcwLCJqdGkiOiI5N2M0MjkzYy05ZTkxLTQyZDAtYTIwYS0xMDYxYTc5Y2E2ZWEiLCJzaWQiOiI0NTY2ZDE4YS1iY2VjLTQ0NTMtYjY0ZS1jOGE1MmE1NTc2YTAifQ.CS88bM1k3cWVV-3cA8S0cWkSe9GitNAkoDDJqzfb4iw",
  "access_expires_at": "2026-10-28T16:14:30.113539169Z",
  "refresh_token": "KAPvKFksb_4fTf7E6XAyCxZ8h1gM4WJbDY_zT-mkSeg",
  "refresh_expires_at": "2026-11-27T15:59:30.112779649Z",
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
  "command_id": "ea805a17-b1f6-4dd5-9e8d-4b38214b6e98",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:59:30Z",
    "sequence": 1793203170644
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b36ee618-a8ee-4f61-b844-6c56e7e1bf11",
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
  "last_heartbeat_at": "2026-10-28T15:59:30.66324Z",
  "last_location_at": "2026-10-28T15:59:30.66324Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-15119"
}
```

```json
{
  "challenge_id": "de6cf9a9-601c-4a6a-80e1-1e4a543f32cb",
  "expires_at": "2026-10-28T16:04:30.950203559Z",
  "resend_available_at": "2026-10-28T15:59:31.950203559Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "969043",
  "sent_at": "2026-10-28T15:59:30.952840222Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de6cf9a9-601c-4a6a-80e1-1e4a543f32cb",
  "code": "969043",
  "device_ref": "sandbox-15119"
}
```

```json
{
  "session_id": "85868f42-7c28-48ab-8999-232863cb5e73",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDA3MSwiaWF0IjoxNzkzMjAzMTcxLCJqdGkiOiJmYzBiOTI3NC0wNTJkLTQ3NWMtOGZiNC02YzIxNTMyMzgxZGMiLCJzaWQiOiI4NTg2OGY0Mi03YzI4LTQ4YWItODk5OS0yMzI4NjNjYjVlNzMifQ.EnAkESnknQROXVYcfWxWq9Z813PaPj9laVd13LFEd-w",
  "access_expires_at": "2026-10-28T16:14:31.239037111Z",
  "refresh_token": "va-gb-iQVG_Z5oUKBzOqCZ7nuW9CjJEG8llxQuqYB04",
  "refresh_expires_at": "2026-11-27T15:59:31.238499266Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0ba59a57-2bb8-4e5c-a7dc-61e156ffb9c4",
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
  "last_heartbeat_at": "2026-10-28T15:58:22.286003Z",
  "last_location_at": "2026-10-28T15:58:22.286003Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0ba59a57-2bb8-4e5c-a7dc-61e156ffb9c4/handover` → **200**

```json
{
  "command_id": "aedc3027-bfec-4ae1-97d6-13b4fb9644ff",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0ba59a57-2bb8-4e5c-a7dc-61e156ffb9c4",
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
  "last_heartbeat_at": "2026-10-28T15:58:22.286003Z",
  "last_location_at": "2026-10-28T15:58:22.286003Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0ba59a57-2bb8-4e5c-a7dc-61e156ffb9c4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:59:32Z",
    "sequence": 1793203172348
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0ba59a57-2bb8-4e5c-a7dc-61e156ffb9c4",
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
  "last_heartbeat_at": "2026-10-28T15:59:32.05395Z",
  "last_location_at": "2026-10-28T15:59:32.05395Z",
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
  "session_id": "cded123a-2c21-4b81-a32a-8635d1f3b40b",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwNzIsImlhdCI6MTc5MzIwMzE3MiwianRpIjoiNGQ4NGZjNDgtNTkzNC00Y2VlLWJjZTAtODg0Y2YzOTVmZjg3Iiwic2lkIjoiY2RlZDEyM2EtMmMyMS00YjgxLWEzMmEtODYzNWQxZjNiNDBiIn0.c8mDEafG0sOauWL4pgyburvp4a6Gq3tguq7TmXpZGv8",
  "access_expires_at": "2026-10-28T16:14:32.625261342Z",
  "refresh_token": "fWjS3aYAyX_luKRN0QIC8ftMYAerkYQK0VrUgze8YpE",
  "refresh_expires_at": "2026-10-29T03:59:32.62465133Z",
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
  "session_id": "85b33bcc-7f34-4b68-8b86-f8b62b9d92d0",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwNzMsImlhdCI6MTc5MzIwMzE3MywianRpIjoiODExYzJhMTUtN2UxZi00YzAxLWFmZGEtOGQzYjFlZDE2NWZlIiwic2lkIjoiODViMzNiY2MtN2YzNC00YjY4LThiODYtZjhiNjJiOWQ5MmQwIn0.iT24tCM3Znlp07lwIyPCMQZf9dPBb98UHQD9kZPbZR0",
  "access_expires_at": "2026-10-28T16:14:33.181997311Z",
  "refresh_token": "KFP6wjONcyKE-aZXP4wjs3_vK2jKfV-62qJddRxj_js",
  "refresh_expires_at": "2026-10-29T03:59:33.181366243Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683624504",
  "device_ref": "sandbox-23980"
}
```

```json
{
  "challenge_id": "956b3d10-9fe8-40f3-ad48-05b8d9891c6f",
  "expires_at": "2026-10-28T16:04:33.44341483Z",
  "resend_available_at": "2026-10-28T15:59:34.44341483Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380683624504` → **200**

```json
{
  "phone": "+380683624504",
  "audience": "CLIENT",
  "code": "416873",
  "sent_at": "2026-10-28T15:59:33.446667186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "956b3d10-9fe8-40f3-ad48-05b8d9891c6f",
  "code": "416873",
  "device_ref": "sandbox-23980"
}
```

```json
{
  "session_id": "f57f5e1b-dbf8-4a0f-82a9-380d5ddd230c",
  "subject": {
    "type": "CLIENT",
    "id": "c4116529-8d9d-4dd5-ab70-e580ffba82b5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDExNjUyOS04ZDlkLTRkZDUtYWI3MC1lNTgwZmZiYTgyYjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MDczLCJpYXQiOjE3OTMyMDMxNzMsImp0aSI6ImVlNDRkYjliLTMwM2UtNGE0YS1iZWYwLTgzMTM1MGFhNmQ3ZCIsInNpZCI6ImY1N2Y1ZTFiLWRiZjgtNGEwZi04MmE5LTM4MGQ1ZGRkMjMwYyJ9.ECxiGvitWcebXftTFOdxX7qv1rhMeKnoZd0sYvtQxPA",
  "access_expires_at": "2026-10-28T16:14:33.741582545Z",
  "refresh_token": "E9_6QYhNLCvWYJNcdJFEKjcEupNUmzCECnAL0c53AxA",
  "refresh_expires_at": "2026-11-27T15:59:33.741033057Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "09287f15-c239-4953-936c-859f18dffb46",
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
  "id": "74968851-c366-41f1-83bb-3bee5b3a52d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:04:34.010401Z",
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
  "command_id": "a8de76e1-3fdd-464c-8ad2-f84d52115a4b",
  "quote_id": "74968851-c366-41f1-83bb-3bee5b3a52d6",
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
  "id": "69559c40-e56a-417d-a3f3-b3b4e9ccb4fb",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c4116529-8d9d-4dd5-ab70-e580ffba82b5",
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
  "created_at": "2026-10-28T15:59:34.298308Z",
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
    "id": "1fc3da91-796b-4955-a3e9-deb15730966d",
    "order_id": "69559c40-e56a-417d-a3f3-b3b4e9ccb4fb",
    "expires_at": "2026-10-28T15:59:49.302068Z",
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

`POST /api/driver/v1/offers/1fc3da91-796b-4955-a3e9-deb15730966d/reject` → **204**

```json
{
  "command_id": "c0768253-14a0-4706-82c4-7de90d0c994e"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "59ac3cfa-df11-43d9-8532-815c2a9b7129",
    "order_id": "69559c40-e56a-417d-a3f3-b3b4e9ccb4fb",
    "expires_at": "2026-10-28T15:59:49.87469Z",
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

`POST /api/driver/v1/offers/59ac3cfa-df11-43d9-8532-815c2a9b7129/accept` → **200**

```json
{
  "command_id": "db46aa2c-4225-4a6e-a65d-7cc76c4438a3"
}
```

```json
{
  "id": "feac90e9-1967-436b-a448-eb8bbd15ab53",
  "order_id": "69559c40-e56a-417d-a3f3-b3b4e9ccb4fb",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fd2fe4ac-3f93-4420-ac87-f679d6047c5e",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/69559c40-e56a-417d-a3f3-b3b4e9ccb4fb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:59:34.29882Z",
      "actor": {
        "type": "CLIENT",
        "id": "c4116529-8d9d-4dd5-ab70-e580ffba82b5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "69559c40-e56a-417d-a3f3-b3b4e9ccb4fb",
        "quote_id": "74968851-c366-41f1-83bb-3bee5b3a52d6",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e9d85a31-3ce1-42b5-9a1d-7cf9b3b81535"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:59:34.301084Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "69559c40-e56a-417d-a3f3-b3b4e9ccb4fb",
        "attempt_id": "50c3ee2c-f0d2-4dd0-9b2a-56c41e2223da",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e9d85a31-3ce1-42b5-9a1d-7cf9b3b81535"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:59:34.307917Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1fc3da91-796b-4955-a3e9-deb15730966d",
        "order_id": "69559c40-e56a-417d-a3f3-b3b4e9ccb4fb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "e9d85a31-3ce1-42b5-9a1d-7cf9b3b81535"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T15:59:34.873528Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1fc3da91-796b-4955-a3e9-deb15730966d",
        "order_id": "69559c40-e56a-417d-a3f3-b3b4e9ccb4fb"
      },
      "correlation_id": "6315dd1d-8935-4e49-9079-40e2d61efe10"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 69559c40-e56a-417d-a3f3-b3b4e9ccb4fb — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/69559c40-e56a-417d-a3f3-b3b4e9ccb4fb` → **200**

```json
{
  "id": "69559c40-e56a-417d-a3f3-b3b4e9ccb4fb",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c4116529-8d9d-4dd5-ab70-e580ffba82b5",
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
    "id": "feac90e9-1967-436b-a448-eb8bbd15ab53",
    "order_id": "69559c40-e56a-417d-a3f3-b3b4e9ccb4fb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "fd2fe4ac-3f93-4420-ac87-f679d6047c5e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:59:34.298308Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/69559c40-e56a-417d-a3f3-b3b4e9ccb4fb/cancel` → **200**

```json
{
  "command_id": "83f5b4ad-1c69-447b-a2ff-2ce26f3e971c",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "69559c40-e56a-417d-a3f3-b3b4e9ccb4fb",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c4116529-8d9d-4dd5-ab70-e580ffba82b5",
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
    "id": "feac90e9-1967-436b-a448-eb8bbd15ab53",
    "order_id": "69559c40-e56a-417d-a3f3-b3b4e9ccb4fb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "fd2fe4ac-3f93-4420-ac87-f679d6047c5e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:59:34.298308Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
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
  "session_id": "b36ee618-a8ee-4f61-b844-6c56e7e1bf11",
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
  "last_heartbeat_at": "2026-10-28T15:59:30.66324Z",
  "last_location_at": "2026-10-28T15:59:30.66324Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b36ee618-a8ee-4f61-b844-6c56e7e1bf11/close` → **200**

```json
{
  "command_id": "257e24e6-1109-40ac-97f6-b8915f153898",
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
  "session_id": "0ba59a57-2bb8-4e5c-a7dc-61e156ffb9c4",
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
  "last_heartbeat_at": "2026-10-28T15:59:32.05395Z",
  "last_location_at": "2026-10-28T15:59:32.05395Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0ba59a57-2bb8-4e5c-a7dc-61e156ffb9c4/close` → **200**

```json
{
  "command_id": "0f8b9957-006b-4929-9247-3a2624a45f0a",
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
  "session_id": "847657fa-dc8d-4d87-9933-a4bfb589da6b",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwNzcsImlhdCI6MTc5MzIwMzE3NywianRpIjoiMzJjMWQyNTctZTUwOC00MTAxLWE5MzItMTljYmY3OWMyMzU2Iiwic2lkIjoiODQ3NjU3ZmEtZGM4ZC00ZDg3LTk5MzMtYTRiZmI1ODlkYTZiIn0.6v571TN7fnGdZib5gkazMrCDRZuG56icSzt5x6qcHvw",
  "access_expires_at": "2026-10-28T16:14:37.752496934Z",
  "refresh_token": "aoZdhgZBqU40SJGchtxGmwEy_XIxyF4sPSK0QfAUEww",
  "refresh_expires_at": "2026-10-29T03:59:37.751932089Z",
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
  "command_id": "7951d890-7bdd-44b9-bae3-9a4b8e206bdf",
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
  "changed_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T15:59:38.312676Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "9618a837-2392-42bf-b4c9-d7ae6ec3df95",
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
  "correlation_id": "bef0f5f4-4c0e-45d8-aeda-cff0b883ea34"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "9627d62d-08c9-4a59-979a-2dc7ec5d05e2",
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
  "correlation_id": "33e8fcd8-c1aa-4720-baa3-10e4a2d16ed5"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631217360",
  "device_ref": "sandbox-10919"
}
```

```json
{
  "challenge_id": "fc730920-e555-4167-b786-cdb194556320",
  "expires_at": "2026-10-28T16:04:39.13635875Z",
  "resend_available_at": "2026-10-28T15:59:40.13635875Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631217360` → **200**

```json
{
  "phone": "+380631217360",
  "audience": "CLIENT",
  "code": "351775",
  "sent_at": "2026-10-28T15:59:39.139438792Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc730920-e555-4167-b786-cdb194556320",
  "code": "351775",
  "device_ref": "sandbox-10919"
}
```

```json
{
  "session_id": "39cfe82c-08ab-4203-8d98-c4009d78e1ec",
  "subject": {
    "type": "CLIENT",
    "id": "9fc6c5b1-de4b-4176-baa7-35e017ac3946"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmM2YzViMS1kZTRiLTQxNzYtYmFhNy0zNWUwMTdhYzM5NDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MDc5LCJpYXQiOjE3OTMyMDMxNzksImp0aSI6Ijk1MzU2NmY2LTQ1NDAtNGZiZC05NmFiLWQ1MDlhOGFlNWY2YyIsInNpZCI6IjM5Y2ZlODJjLTA4YWItNDIwMy04ZDk4LWM0MDA5ZDc4ZTFlYyJ9.QSGw2jlWG-Rvbb3mN3QCPhHXXE4V4szxJXkZ6sbMq3o",
  "access_expires_at": "2026-10-28T16:14:39.427795675Z",
  "refresh_token": "mPc7VWBcXhwK7-yQWKcpn4ErQut2my8lnnsFezuXo7Y",
  "refresh_expires_at": "2026-11-27T15:59:39.427244621Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b72a1056-74ec-40d6-91dd-482f15aac910",
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
  "id": "953161d3-ab73-45f2-b8ba-25832b5c2b55",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:04:39.705937Z",
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
  "command_id": "7f7c7f47-e5f8-4bf5-9c29-42c09a93c54e",
  "quote_id": "953161d3-ab73-45f2-b8ba-25832b5c2b55",
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
  "correlation_id": "e5809aad-2646-493e-9635-287d516ce6fd"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9aaaa2a1-708a-47ef-bc1b-5da6e773ec3b",
  "quote_id": "953161d3-ab73-45f2-b8ba-25832b5c2b55",
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
  "id": "b697165f-107f-4c24-b35f-256e8833063d",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fc6c5b1-de4b-4176-baa7-35e017ac3946",
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
  "created_at": "2026-10-28T15:59:40.263721Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b697165f-107f-4c24-b35f-256e8833063d/cancel` → **200**

```json
{
  "command_id": "1dd53406-e56e-4e4d-857c-49341c010a82",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b697165f-107f-4c24-b35f-256e8833063d",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9fc6c5b1-de4b-4176-baa7-35e017ac3946",
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
  "created_at": "2026-10-28T15:59:40.263721Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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
  "command_id": "790fd335-96df-4246-83f2-5b4ec7e674ce",
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
  "changed_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T15:59:40.865283Z"
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
      "changed_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T15:59:40.865283Z"
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
  "device_ref": "sandbox-12077"
}
```

```json
{
  "challenge_id": "e64f1ffd-7da4-477a-81c5-89c08a776e41",
  "expires_at": "2026-10-28T16:04:41.710785221Z",
  "resend_available_at": "2026-10-28T15:59:42.710785221Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "558828",
  "sent_at": "2026-10-28T15:59:41.713030937Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e64f1ffd-7da4-477a-81c5-89c08a776e41",
  "code": "558828",
  "device_ref": "sandbox-12077"
}
```

```json
{
  "session_id": "2403bbfc-7fc8-4b83-9b92-979364782af7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDA4MiwiaWF0IjoxNzkzMjAzMTgyLCJqdGkiOiIzZTJjNjM5ZC00M2YxLTRjZGMtYTlmZC05NGM3NDk4YzYzYjciLCJzaWQiOiIyNDAzYmJmYy03ZmM4LTRiODMtOWI5Mi05NzkzNjQ3ODJhZjcifQ.eG1YwkqsR47M7tIvJ1nj5DrWuBiyHaT2s3YE-AISUaQ",
  "access_expires_at": "2026-10-28T16:14:42.002350084Z",
  "refresh_token": "4ydBwihpiHwZDyYPcss4RCORD1JP8RdREg4B7rWLI3I",
  "refresh_expires_at": "2026-11-27T15:59:42.001648586Z",
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
  "command_id": "95ff0a66-9733-48ca-b76e-5a47abcc7b25",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:59:42Z",
    "sequence": 1793203182536
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "76e80238-30c4-49fa-97d5-54fb94532d3c",
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
  "last_heartbeat_at": "2026-10-28T15:59:42.554845Z",
  "last_location_at": "2026-10-28T15:59:42.554845Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674151341",
  "device_ref": "sandbox-9190"
}
```

```json
{
  "challenge_id": "d57cf465-b08f-4609-a60b-cc9f050f0d46",
  "expires_at": "2026-10-28T16:04:42.823870898Z",
  "resend_available_at": "2026-10-28T15:59:43.823870898Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674151341` → **200**

```json
{
  "phone": "+380674151341",
  "audience": "CLIENT",
  "code": "190786",
  "sent_at": "2026-10-28T15:59:42.826370487Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d57cf465-b08f-4609-a60b-cc9f050f0d46",
  "code": "190786",
  "device_ref": "sandbox-9190"
}
```

```json
{
  "session_id": "f273e720-c12b-4024-b2ae-5c38fd3a5d24",
  "subject": {
    "type": "CLIENT",
    "id": "dccb67a3-6dc8-4705-af43-b594103c682d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2NiNjdhMy02ZGM4LTQ3MDUtYWY0My1iNTk0MTAzYzY4MmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MDgzLCJpYXQiOjE3OTMyMDMxODMsImp0aSI6ImQ2YjZmZjAwLTdiMDctNGEyOC05NGE4LTliNmE5Y2E0ZGUwYSIsInNpZCI6ImYyNzNlNzIwLWMxMmItNDAyNC1iMmFlLTVjMzhmZDNhNWQyNCJ9.BTBUP-0SX5S4ZoNL4IC0-xEi0preXLY1at5rxfPQiP8",
  "access_expires_at": "2026-10-28T16:14:43.123417661Z",
  "refresh_token": "DDtmFXaTomVqDB0jrmWB7JpFVk0xhuIqhxm-yRx-es0",
  "refresh_expires_at": "2026-11-27T15:59:43.122879776Z",
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
  "command_id": "f06b782d-cd87-4722-9eba-a4a34085d46b",
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
  "id": "3c43b0a5-fb6f-492d-862f-1fe30292b6e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:04:43.656712Z",
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
  "command_id": "acfc3ece-f7d5-4415-a4ac-a42e2c3aa066",
  "platform": "ANDROID",
  "token": "sandbox-driver-9c8528e8-a767-4fe6-a67b-4575fe650119"
}
```

```json
{
  "id": "99003be6-522f-4c1c-860b-34ea62d5b277",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T15:59:43.947408Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "45916dc6-f932-47cd-9106-9249561f446b",
  "platform": "ANDROID",
  "token": "sandbox-rider-a9e8d6d2-7c10-4755-95d1-493c5c5dadac"
}
```

```json
{
  "id": "a15bed91-5914-4b24-851d-59310c1057de",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T15:59:44.219626Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d2eabf43-fed3-4145-a33d-08092b3dcb37",
  "quote_id": "3c43b0a5-fb6f-492d-862f-1fe30292b6e5",
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
  "id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dccb67a3-6dc8-4705-af43-b594103c682d",
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
  "created_at": "2026-10-28T15:59:44.495759Z",
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
    "id": "0341890f-ab81-4a21-aa1e-4e1d7d5f7b2e",
    "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
    "expires_at": "2026-10-28T15:59:59.499717Z",
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

`POST /api/driver/v1/offers/0341890f-ab81-4a21-aa1e-4e1d7d5f7b2e/accept` → **200**

```json
{
  "command_id": "d000230f-8b6b-4556-abda-62305932ada7"
}
```

```json
{
  "id": "69cfcfa7-e4b6-4e22-820a-502423f3b5c1",
  "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4e4dbbc2-cb00-40f7-a145-a6865db80361",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T15:59:44.471Z` → **200**

```json
[
  {
    "at": "2026-10-28T15:59:45.119277298Z",
    "token_suffix": "650119",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "20446b87-e50b-4087-8a05-007d5ca753d3",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674151341&after=2026-10-28T15:59:44.471Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380674151341&after=2026-10-28T15:59:44.471Z` → **200**

```json
[
  {
    "at": "2026-10-28T15:59:46.123825319Z",
    "token_suffix": "5dadac",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "d060214e-c6b4-4f41-bfcb-873bf00604fe",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/421a2c6f-89ec-4c53-92fe-cf71e11701ab/messages` → **201**

```json
{
  "command_id": "9afb4f58-ac0c-4d07-8db2-6a05722bc4b6",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "7efd2bd9-b31f-424a-b2cf-45505cd06e5c",
  "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T15:59:46.418392382Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4e4dbbc2-cb00-40f7-a145-a6865db80361",
  "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
  "assignment_id": "69cfcfa7-e4b6-4e22-820a-502423f3b5c1",
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

`POST /api/driver/v1/trips/4e4dbbc2-cb00-40f7-a145-a6865db80361/messages` → **201**

```json
{
  "command_id": "775890a8-c3ea-4e8f-8066-d869537a52d3",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "683816b0-116c-4b7c-8204-6957a00d4c0c",
  "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T15:59:46.945792105Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/421a2c6f-89ec-4c53-92fe-cf71e11701ab/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/4e4dbbc2-cb00-40f7-a145-a6865db80361/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674151341"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/76e80238-30c4-49fa-97d5-54fb94532d3c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:59:47Z",
    "sequence": 1793203187730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "76e80238-30c4-49fa-97d5-54fb94532d3c",
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
  "last_heartbeat_at": "2026-10-28T15:59:47.750073Z",
  "last_location_at": "2026-10-28T15:59:47.750073Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4e4dbbc2-cb00-40f7-a145-a6865db80361",
  "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
  "assignment_id": "69cfcfa7-e4b6-4e22-820a-502423f3b5c1",
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

`POST /api/driver/v1/trips/4e4dbbc2-cb00-40f7-a145-a6865db80361/arrive` → **200**

```json
{
  "command_id": "4ba1418e-084f-4654-b1b8-62bdccbe1675",
  "expected_version": 0
}
```

```json
{
  "id": "4e4dbbc2-cb00-40f7-a145-a6865db80361",
  "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
  "assignment_id": "69cfcfa7-e4b6-4e22-820a-502423f3b5c1",
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
  "arrived_at": "2026-10-28T15:59:48.288578Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4e4dbbc2-cb00-40f7-a145-a6865db80361/start` → **200**

```json
{
  "command_id": "e972b5c8-90d3-4753-ac50-caabd1e07d5d",
  "expected_version": 1
}
```

```json
{
  "id": "4e4dbbc2-cb00-40f7-a145-a6865db80361",
  "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
  "assignment_id": "69cfcfa7-e4b6-4e22-820a-502423f3b5c1",
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
  "arrived_at": "2026-10-28T15:59:48.288578Z",
  "started_at": "2026-10-28T15:59:48.562601Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/76e80238-30c4-49fa-97d5-54fb94532d3c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:59:48Z",
    "sequence": 1793203188828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "76e80238-30c4-49fa-97d5-54fb94532d3c",
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
  "last_heartbeat_at": "2026-10-28T15:59:48.847177Z",
  "last_location_at": "2026-10-28T15:59:48.847177Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/4e4dbbc2-cb00-40f7-a145-a6865db80361/complete` → **200**

```json
{
  "command_id": "603c586f-d3ef-436a-9f06-b41dfc94bdd4",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:59:49Z",
  "cash_received": true
}
```

```json
{
  "id": "4e4dbbc2-cb00-40f7-a145-a6865db80361",
  "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
  "assignment_id": "69cfcfa7-e4b6-4e22-820a-502423f3b5c1",
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
  "arrived_at": "2026-10-28T15:59:48.288578Z",
  "started_at": "2026-10-28T15:59:48.562601Z",
  "completed_at": "2026-10-28T15:59:49.128443Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/421a2c6f-89ec-4c53-92fe-cf71e11701ab` → **200**

```json
{
  "id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "dccb67a3-6dc8-4705-af43-b594103c682d",
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
    "id": "69cfcfa7-e4b6-4e22-820a-502423f3b5c1",
    "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4e4dbbc2-cb00-40f7-a145-a6865db80361",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:59:44.495759Z",
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
    "id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T15:59:44.495759Z",
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
    "id": "4e4dbbc2-cb00-40f7-a145-a6865db80361",
    "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
    "order_short_number": 10,
    "created_at": "2026-10-28T15:59:45.061322Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1b24f173-d981-479a-87ce-00e5c64a1458",
    "order_id": "bb7fa43d-6f37-4288-af35-5769684b3da2",
    "order_short_number": 2,
    "created_at": "2026-10-28T15:58:11.242985Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "fe722188-7288-4401-866f-4e17ea3215b4",
    "order_id": "0ca5434e-3501-472c-a6c1-0d4056d44a92",
    "order_short_number": 1,
    "created_at": "2026-10-28T15:57:52.316417Z",
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

`GET /api/rider/v1/orders/421a2c6f-89ec-4c53-92fe-cf71e11701ab/tip` → **200**

```json
{
  "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
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
  "available_until": "2026-10-29T15:59:49.128443Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/421a2c6f-89ec-4c53-92fe-cf71e11701ab/tip` → **201**

```json
{
  "command_id": "167bf6e8-f824-4b63-b086-88e85a518cb0",
  "amount_minor": 1100
}
```

```json
{
  "id": "e11aabc6-a83f-40e5-904e-01c7b063552e",
  "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T15:59:54.045661Z"
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
  "session_id": "64533f21-99f5-4712-b355-879541a35568",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwOTQsImlhdCI6MTc5MzIwMzE5NCwianRpIjoiMjczNmExNTgtMGUyNy00YjJmLTk5MTgtNzI5ZDc1NzdmOGFlIiwic2lkIjoiNjQ1MzNmMjEtOTlmNS00NzEyLWIzNTUtODc5NTQxYTM1NTY4In0.2pwiGdi1fUabHbIKEQpfP-jfF3SJ1jEQFfyV_YX4pK8",
  "access_expires_at": "2026-10-28T16:14:54.61079891Z",
  "refresh_token": "BRFGB07KW2NIdL1eHxH8sTIIGm2kUq64IV58WtV8AO8",
  "refresh_expires_at": "2026-10-29T03:59:54.61022041Z",
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
        "created": 10,
        "fulfilled": 5,
        "cancelled": 5,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "PHONE": 1,
          "APP": 9
        },
        "by_payment": {
          "CASH": 9,
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
    "created": 10,
    "fulfilled": 5,
    "cancelled": 5,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "PHONE": 1,
      "APP": 9
    },
    "by_payment": {
      "CASH": 9,
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
  "generated_at": "2026-10-28T15:59:54.876021448Z"
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
  "generated_at": "2026-10-28T15:59:55.164592782Z"
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
  "session_id": "e11b93c1-3846-48fb-aef0-09f4fddf7d40",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwOTUsImlhdCI6MTc5MzIwMzE5NSwianRpIjoiNTIzMTMyMTItOTc2NS00NWZjLThkNzQtOWQxYzM1ZTI2NTU3Iiwic2lkIjoiZTExYjkzYzEtMzg0Ni00OGZiLWFlZjAtMDlmNGZkZGY3ZDQwIn0.qHg9pEDhRQCSOMppxz4ls0voSGWUtFLzgTIbC-jOgVg",
  "access_expires_at": "2026-10-28T16:14:55.728853976Z",
  "refresh_token": "T_zCSn8tirEytp2nYwpn5cdCdD8Q97rA4SDXWOE4Lm8",
  "refresh_expires_at": "2026-10-29T03:59:55.728044131Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/421a2c6f-89ec-4c53-92fe-cf71e11701ab/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:59:44.496329Z",
      "actor": {
        "type": "CLIENT",
        "id": "dccb67a3-6dc8-4705-af43-b594103c682d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
        "quote_id": "3c43b0a5-fb6f-492d-862f-1fe30292b6e5",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "adaa956e-3e41-419d-904d-78029241735f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:59:44.498853Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
        "attempt_id": "4ea190ba-1565-4d4f-95e4-f0a17cdc28bc",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "adaa956e-3e41-419d-904d-78029241735f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:59:44.505353Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0341890f-ab81-4a21-aa1e-4e1d7d5f7b2e",
        "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "adaa956e-3e41-419d-904d-78029241735f"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:59:45.06318Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "0341890f-ab81-4a21-aa1e-4e1d7d5f7b2e",
        "order_id": "421a2c6f-89ec-4c53-92fe-cf71e11701ab",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "69cfcfa7-e4b6-4e22-820a-502423f3b5c1"
      },
      "correlation_id": "1b23499d-5cba-40a9-a37c-9f0f6acf2b38"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T15:59:56.280220512Z",
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
      "last_location_at": "2026-10-28T15:59:48.847177Z",
      "order_id": null
    }
  ]
}
```

Done: order 421a2c6f-89ec-4c53-92fe-cf71e11701ab.

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
  "session_id": "1627d624-6a37-406c-94e6-310b8acce103",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwOTYsImlhdCI6MTc5MzIwMzE5NiwianRpIjoiNGMzMWEwMTAtODAxYy00ZGY1LWJmMjctOTA0ZmE0N2MzZjg3Iiwic2lkIjoiMTYyN2Q2MjQtNmEzNy00MDZjLTk0ZTYtMzEwYjhhY2NlMTAzIn0.9ZzA2SDuzwk_A_OiWZ-22jjVbhGI7ra_hmjTdsZeJ9w",
  "access_expires_at": "2026-10-28T16:14:56.86719209Z",
  "refresh_token": "YIeZp8BN2dnU7hooPYcSqLlLpoWqiLcMv_-5kPUfJzg",
  "refresh_expires_at": "2026-10-29T03:59:56.866656049Z",
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
  "command_id": "18676589-382f-4c76-b4e6-b05e278d3364",
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
  "timestamp": "2026-10-28T15:59:57.000+0000",
  "channel": {
    "id": "1730052000.2113623815",
    "linkedid": "1730052000.2113623815",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678864764"
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
  "timestamp": "2026-10-28T15:59:57.000+0000",
  "channel": {
    "id": "1730052000.2113623815",
    "linkedid": "1730052000.2113623815",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678864764"
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
  "session_id": "cb60ff76-05b7-4148-b764-870592424e51",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQwOTgsImlhdCI6MTc5MzIwMzE5OCwianRpIjoiNDQ1Y2Q4Y2MtNGFkYS00YTRjLWE5NmUtOGIwOTM4NDRkNDIxIiwic2lkIjoiY2I2MGZmNzYtMDViNy00MTQ4LWI3NjQtODcwNTkyNDI0ZTUxIn0.saLtF2_0laULeT2Ss52zCQMx4oyqBG-gR1NhOw-2UH4",
  "access_expires_at": "2026-10-28T16:14:58.014324491Z",
  "refresh_token": "cOmsf6eXln6hZaxZrzbl1TSVAZVeG6TQI-JrgiFrEkk",
  "refresh_expires_at": "2026-10-29T03:59:58.013736944Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "2ac2a274-afff-4cf5-ab47-1abb5be8fd6f",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678864764",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:59:57Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/2ac2a274-afff-4cf5-ab47-1abb5be8fd6f/answer` → **200**

```json
{
  "command_id": "80047889-fe7d-4073-98af-5861e1ffb464"
}
```

```json
{
  "id": "2ac2a274-afff-4cf5-ab47-1abb5be8fd6f",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678864764",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "order_ids": [],
  "started_at": "2026-10-28T15:59:57Z",
  "answered_at": "2026-10-28T15:59:58.570596Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2113623815",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a424e571-3162-4381-be31-209b7811ffbf",
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
  "id": "0c43392a-e844-4966-ba7b-bd3185dea459",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:04:58.876169Z",
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
  "command_id": "e18fcecd-b162-4bac-b724-71ff75eb4819",
  "quote_id": "0c43392a-e844-4966-ba7b-bd3185dea459",
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
    "phone": "+380678864764"
  },
  "call_id": "2ac2a274-afff-4cf5-ab47-1abb5be8fd6f"
}
```

```json
{
  "id": "a0a4461c-4c98-4f5f-9033-dd1d428909b3",
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
  "created_at": "2026-10-28T15:59:59.15687Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678864764"
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
    "id": "1730052000.2113623815",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "2ac2a274-afff-4cf5-ab47-1abb5be8fd6f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678864764",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_ids": [
        "a0a4461c-4c98-4f5f-9033-dd1d428909b3"
      ],
      "started_at": "2026-10-28T15:59:57Z",
      "answered_at": "2026-10-28T15:59:58.570596Z",
      "ended_at": "2026-10-28T15:59:59.456608Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "29b8602b-c28e-44e8-bc32-de25d4d5d13f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671935519",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_ids": [],
      "started_at": "2026-10-28T15:58:00.25788Z",
      "answered_at": "2026-10-28T15:58:00.563951Z",
      "ended_at": "2026-10-28T15:58:00.859367Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:58:06.720823Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/a0a4461c-4c98-4f5f-9033-dd1d428909b3` → **200**

```json
{
  "id": "a0a4461c-4c98-4f5f-9033-dd1d428909b3",
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
  "created_at": "2026-10-28T15:59:59.15687Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678864764"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/a0a4461c-4c98-4f5f-9033-dd1d428909b3` → **200**

```json
{
  "id": "a0a4461c-4c98-4f5f-9033-dd1d428909b3",
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
  "created_at": "2026-10-28T15:59:59.15687Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678864764"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a0a4461c-4c98-4f5f-9033-dd1d428909b3/cancel` → **200**

```json
{
  "command_id": "879fb42d-fe07-48e7-b8d0-70a0b0575637",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a0a4461c-4c98-4f5f-9033-dd1d428909b3",
  "short_number": 11,
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
  "created_at": "2026-10-28T15:59:59.15687Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678864764"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 2ac2a274-afff-4cf5-ab47-1abb5be8fd6f with order a0a4461c-4c98-4f5f-9033-dd1d428909b3.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14404"
}
```

```json
{
  "challenge_id": "c99bbf8e-5ade-45d4-9046-4e1e53f8ff0b",
  "expires_at": "2026-10-28T16:05:00.634729131Z",
  "resend_available_at": "2026-10-28T16:00:01.634729131Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "999929",
  "sent_at": "2026-10-28T16:00:00.637286346Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c99bbf8e-5ade-45d4-9046-4e1e53f8ff0b",
  "code": "999929",
  "device_ref": "sandbox-14404"
}
```

```json
{
  "session_id": "cce20ee4-a0cd-42fe-a15e-337ce1d2b913",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDEwMCwiaWF0IjoxNzkzMjAzMjAwLCJqdGkiOiI0MDAyYTlkMy1hZmEzLTQwZjEtOTA0NS1hOTNiMGMxZDMzNDIiLCJzaWQiOiJjY2UyMGVlNC1hMGNkLTQyZmUtYTE1ZS0zMzdjZTFkMmI5MTMifQ.oYS_HfdgTCanhUTf9J3Xw7FlG_ak0I_YiyDDraIxE6I",
  "access_expires_at": "2026-10-28T16:15:00.926279588Z",
  "refresh_token": "rOPiZvmZ5lvQFoCkiyLFkmblBg_rS5ITV8MzXl6wyxs",
  "refresh_expires_at": "2026-11-27T16:00:00.925685216Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "76e80238-30c4-49fa-97d5-54fb94532d3c",
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
  "last_heartbeat_at": "2026-10-28T15:59:48.847177Z",
  "last_location_at": "2026-10-28T15:59:48.847177Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/76e80238-30c4-49fa-97d5-54fb94532d3c/handover` → **200**

```json
{
  "command_id": "705f3739-6ed8-4aae-a425-b301b2290bcd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "76e80238-30c4-49fa-97d5-54fb94532d3c",
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
  "last_heartbeat_at": "2026-10-28T15:59:48.847177Z",
  "last_location_at": "2026-10-28T15:59:48.847177Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/76e80238-30c4-49fa-97d5-54fb94532d3c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:00:01Z",
    "sequence": 1793203201756
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "76e80238-30c4-49fa-97d5-54fb94532d3c",
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
  "last_heartbeat_at": "2026-10-28T16:00:01.775319Z",
  "last_location_at": "2026-10-28T16:00:01.775319Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666478936",
  "device_ref": "sandbox-21311"
}
```

```json
{
  "challenge_id": "8c2d1ec0-5d2c-4fb8-a5cc-fff27103f06e",
  "expires_at": "2026-10-28T16:05:02.06064883Z",
  "resend_available_at": "2026-10-28T16:00:03.06064883Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666478936` → **200**

```json
{
  "phone": "+380666478936",
  "audience": "CLIENT",
  "code": "291014",
  "sent_at": "2026-10-28T16:00:02.063740373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c2d1ec0-5d2c-4fb8-a5cc-fff27103f06e",
  "code": "291014",
  "device_ref": "sandbox-21311"
}
```

```json
{
  "session_id": "f58f5fec-fa99-4c7f-a990-aa0ec930e2cb",
  "subject": {
    "type": "CLIENT",
    "id": "50e73e54-1594-4886-b614-0e7e6ead2af9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU3M2U1NC0xNTk0LTQ4ODYtYjYxNC0wZTdlNmVhZDJhZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MTAyLCJpYXQiOjE3OTMyMDMyMDIsImp0aSI6IjMxZmIzNjhiLTEwMDYtNDZhMy05ODA2LTE3ZGQzNjEzOTVjNCIsInNpZCI6ImY1OGY1ZmVjLWZhOTktNGM3Zi1hOTkwLWFhMGVjOTMwZTJjYiJ9.hP7jveqYV4emjXSLfUGhuR9Xwy8kai8onyQYHSnYYV0",
  "access_expires_at": "2026-10-28T16:15:02.370184415Z",
  "refresh_token": "Tu-PUh1OuGWCh1d9mTBzIpiU3YRmwPfpNSwmNSwDFTQ",
  "refresh_expires_at": "2026-11-27T16:00:02.369586716Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7fd28f3c-a8eb-4152-8d86-436f59c238a5",
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
  "id": "52e313cf-4bf9-4021-ba6b-1679ba7c5a44",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:05:02.642673Z",
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
  "command_id": "8ea7541f-1095-44d4-b9db-ffbf50c3cc2e",
  "quote_id": "52e313cf-4bf9-4021-ba6b-1679ba7c5a44",
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
  "id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50e73e54-1594-4886-b614-0e7e6ead2af9",
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
  "created_at": "2026-10-28T16:00:02.927719Z",
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
    "id": "2d4048af-d729-4c97-a8a4-70472255c9f4",
    "order_id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
    "expires_at": "2026-10-28T16:00:17.930734Z",
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

`POST /api/driver/v1/offers/2d4048af-d729-4c97-a8a4-70472255c9f4/accept` → **200**

```json
{
  "command_id": "56449641-c271-40c9-bb12-997c44448d52"
}
```

```json
{
  "id": "822b0dea-a587-48f8-b7ee-da94466c1ef3",
  "order_id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "87ad904a-643e-448e-8aba-b5c8e482b019",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "87ad904a-643e-448e-8aba-b5c8e482b019",
  "order_id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
  "assignment_id": "822b0dea-a587-48f8-b7ee-da94466c1ef3",
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

`POST /api/driver/v1/work-sessions/76e80238-30c4-49fa-97d5-54fb94532d3c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:00:04Z",
    "sequence": 1793203204275
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "76e80238-30c4-49fa-97d5-54fb94532d3c",
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
  "last_heartbeat_at": "2026-10-28T16:00:04.047381Z",
  "last_location_at": "2026-10-28T16:00:04.047381Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/87ad904a-643e-448e-8aba-b5c8e482b019/arrive` → **200**

```json
{
  "command_id": "11c10ed0-06c1-41e2-ad0c-727de088a573",
  "expected_version": 0
}
```

```json
{
  "id": "87ad904a-643e-448e-8aba-b5c8e482b019",
  "order_id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
  "assignment_id": "822b0dea-a587-48f8-b7ee-da94466c1ef3",
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
  "arrived_at": "2026-10-28T16:00:04.336287Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/87ad904a-643e-448e-8aba-b5c8e482b019/start` → **200**

```json
{
  "command_id": "15693ed2-3f10-4d48-b42f-01ac0abee417",
  "expected_version": 1
}
```

```json
{
  "id": "87ad904a-643e-448e-8aba-b5c8e482b019",
  "order_id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
  "assignment_id": "822b0dea-a587-48f8-b7ee-da94466c1ef3",
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
  "arrived_at": "2026-10-28T16:00:04.336287Z",
  "started_at": "2026-10-28T16:00:04.611987Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/76e80238-30c4-49fa-97d5-54fb94532d3c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:00:04Z",
    "sequence": 1793203204883
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "76e80238-30c4-49fa-97d5-54fb94532d3c",
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
  "last_heartbeat_at": "2026-10-28T16:00:04.901917Z",
  "last_location_at": "2026-10-28T16:00:04.901917Z",
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
  "device_ref": "sandbox-17077"
}
```

```json
{
  "challenge_id": "1326754c-fbbc-43ea-a6a7-ac5f314f5118",
  "expires_at": "2026-10-28T16:05:05.171082777Z",
  "resend_available_at": "2026-10-28T16:00:06.171082777Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "083251",
  "sent_at": "2026-10-28T16:00:05.173259489Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1326754c-fbbc-43ea-a6a7-ac5f314f5118",
  "code": "083251",
  "device_ref": "sandbox-17077"
}
```

```json
{
  "session_id": "102c5e21-9fd2-4ad1-a08f-7e7b06afc444",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDEwNSwiaWF0IjoxNzkzMjAzMjA1LCJqdGkiOiJjOTlhYmY2Mi1mMDEwLTQwMzktOTI0My01MGRlZDBhNjU5NjkiLCJzaWQiOiIxMDJjNWUyMS05ZmQyLTRhZDEtYTA4Zi03ZTdiMDZhZmM0NDQifQ.wa1GI5k9fdi1t3p7S-4Kdq_vuaqylDE3bNV8xzXr78E",
  "access_expires_at": "2026-10-28T16:15:05.460325756Z",
  "refresh_token": "umOyrWdynJBjeYG8fcJ-I0S6G045G-PPHr0ILIPhgz0",
  "refresh_expires_at": "2026-11-27T16:00:05.459737498Z",
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
  "command_id": "666b005e-846a-430c-8fd8-ece24b332f7f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:00:05Z",
    "sequence": 1793203205981
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d422af84-0a66-434f-b58a-722747bbbf27",
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
  "last_heartbeat_at": "2026-10-28T16:00:05.999Z",
  "last_location_at": "2026-10-28T16:00:05.999Z",
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
  "session_id": "db3ca8de-514e-4161-aef6-1f365b9e5e36",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxMDYsImlhdCI6MTc5MzIwMzIwNiwianRpIjoiNDk1NjU2N2EtZGM1NS00M2ZlLTg1YWQtNzJkYWMyOWE3NzU2Iiwic2lkIjoiZGIzY2E4ZGUtNTE0ZS00MTYxLWFlZjYtMWYzNjViOWU1ZTM2In0.Z7otJGZHjSyrIKxmoza8MkEHv6Z46xxLWQPDvtq5uIk",
  "access_expires_at": "2026-10-28T16:15:06.563912021Z",
  "refresh_token": "HmE1S-TvAFlKyvnN3PCgC6BglAPEuY7gseQf3PUtEVc",
  "refresh_expires_at": "2026-10-29T04:00:06.563378484Z",
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
  "session_id": "383f5467-d519-4e60-a693-0a5de0357865",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxMDcsImlhdCI6MTc5MzIwMzIwNywianRpIjoiMzZlZTU1MDAtNGRhOC00YmZmLWIzOWUtOTdhMWJjMTllNzMyIiwic2lkIjoiMzgzZjU0NjctZDUxOS00ZTYwLWE2OTMtMGE1ZGUwMzU3ODY1In0.q02twB4XdSQIhuwAtaayhXWcox8q_wVBskv_DWDc0lY",
  "access_expires_at": "2026-10-28T16:15:07.125678712Z",
  "refresh_token": "GjMDL0Unj0JN2NOnU1SoYjHfA5D6YRq74nNVtEg2m0s",
  "refresh_expires_at": "2026-10-29T04:00:07.125151778Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3021e9cf-90e6-467c-bec1-409f00c4108f` → **200**

```json
{
  "id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
  "short_number": 12,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "50e73e54-1594-4886-b614-0e7e6ead2af9",
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
    "id": "822b0dea-a587-48f8-b7ee-da94466c1ef3",
    "order_id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "87ad904a-643e-448e-8aba-b5c8e482b019",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T16:00:02.927719Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3021e9cf-90e6-467c-bec1-409f00c4108f/interrupt` → **200**

```json
{
  "command_id": "8382f587-0e81-4aa4-b2c8-2c2bc6e6a35a",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
    "short_number": 12,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "50e73e54-1594-4886-b614-0e7e6ead2af9",
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
      "id": "822b0dea-a587-48f8-b7ee-da94466c1ef3",
      "order_id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "87ad904a-643e-448e-8aba-b5c8e482b019",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T16:00:02.927719Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "8671432c-97d0-4d5b-b9d3-9d237b4aa179",
    "short_number": 13,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "50e73e54-1594-4886-b614-0e7e6ead2af9",
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
    "id": "a7e20504-c093-4327-a8bc-8634d385df75",
    "order_id": "8671432c-97d0-4d5b-b9d3-9d237b4aa179",
    "expires_at": "2026-10-28T16:00:22.701553Z",
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

`POST /api/driver/v1/offers/a7e20504-c093-4327-a8bc-8634d385df75/accept` → **200**

```json
{
  "command_id": "8d1dd943-073f-419e-9cb7-8a3920898fbb"
}
```

```json
{
  "id": "4e4e5525-ba6a-42e1-96dd-93bfc74ea47a",
  "order_id": "8671432c-97d0-4d5b-b9d3-9d237b4aa179",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d09cf7eb-f676-45b5-bd35-7d15effd8352",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d09cf7eb-f676-45b5-bd35-7d15effd8352",
  "order_id": "8671432c-97d0-4d5b-b9d3-9d237b4aa179",
  "assignment_id": "4e4e5525-ba6a-42e1-96dd-93bfc74ea47a",
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
  "session_id": "d422af84-0a66-434f-b58a-722747bbbf27",
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
  "last_heartbeat_at": "2026-10-28T16:00:05.999Z",
  "last_location_at": "2026-10-28T16:00:05.999Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/d422af84-0a66-434f-b58a-722747bbbf27/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:00:09Z",
    "sequence": 1793203209714
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d422af84-0a66-434f-b58a-722747bbbf27",
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
  "last_heartbeat_at": "2026-10-28T16:00:09.089819Z",
  "last_location_at": "2026-10-28T16:00:09.089819Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d09cf7eb-f676-45b5-bd35-7d15effd8352/arrive` → **200**

```json
{
  "command_id": "32e50cf5-6b02-485d-bbfa-0ab3ae7084b5",
  "expected_version": 0
}
```

```json
{
  "id": "d09cf7eb-f676-45b5-bd35-7d15effd8352",
  "order_id": "8671432c-97d0-4d5b-b9d3-9d237b4aa179",
  "assignment_id": "4e4e5525-ba6a-42e1-96dd-93bfc74ea47a",
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
  "arrived_at": "2026-10-28T16:00:09.364677Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d09cf7eb-f676-45b5-bd35-7d15effd8352/start` → **200**

```json
{
  "command_id": "c5f42d29-df14-4358-b952-4b1cb617fd13",
  "expected_version": 1
}
```

```json
{
  "id": "d09cf7eb-f676-45b5-bd35-7d15effd8352",
  "order_id": "8671432c-97d0-4d5b-b9d3-9d237b4aa179",
  "assignment_id": "4e4e5525-ba6a-42e1-96dd-93bfc74ea47a",
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
  "arrived_at": "2026-10-28T16:00:09.364677Z",
  "started_at": "2026-10-28T16:00:09.647538Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d09cf7eb-f676-45b5-bd35-7d15effd8352/complete` → **200**

```json
{
  "command_id": "4bed0aca-438e-4c55-95a5-360ff88090dc",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:00:09Z"
}
```

```json
{
  "id": "d09cf7eb-f676-45b5-bd35-7d15effd8352",
  "order_id": "8671432c-97d0-4d5b-b9d3-9d237b4aa179",
  "assignment_id": "4e4e5525-ba6a-42e1-96dd-93bfc74ea47a",
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
  "arrived_at": "2026-10-28T16:00:09.364677Z",
  "started_at": "2026-10-28T16:00:09.647538Z",
  "completed_at": "2026-10-28T16:00:09.933318Z",
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
    "id": "8671432c-97d0-4d5b-b9d3-9d237b4aa179",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:00:07.691162Z",
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
    "id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
    "short_number": 12,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:00:02.927719Z",
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
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
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

`GET /api/operator/v1/orders/3021e9cf-90e6-467c-bec1-409f00c4108f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:00:02.928233Z",
      "actor": {
        "type": "CLIENT",
        "id": "50e73e54-1594-4886-b614-0e7e6ead2af9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
        "quote_id": "52e313cf-4bf9-4021-ba6b-1679ba7c5a44",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "9104e570-92e5-4c9f-a10b-3a7072afe63a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:00:02.930052Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
        "attempt_id": "b0858086-b318-4450-9482-5889979fd98e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9104e570-92e5-4c9f-a10b-3a7072afe63a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:00:02.932781Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2d4048af-d729-4c97-a8a4-70472255c9f4",
        "order_id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "9104e570-92e5-4c9f-a10b-3a7072afe63a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:00:03.494839Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2d4048af-d729-4c97-a8a4-70472255c9f4",
        "order_id": "3021e9cf-90e6-467c-bec1-409f00c4108f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "822b0dea-a587-48f8-b7ee-da94466c1ef3"
      },
      "correlation_id": "a74fa0bb-e092-46a2-be4e-021ca791ebd3"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/8671432c-97d0-4d5b-b9d3-9d237b4aa179/tip` → **200**

```json
{
  "order_id": "8671432c-97d0-4d5b-b9d3-9d237b4aa179",
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
  "available_until": "2026-10-29T16:00:09.933318Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/8671432c-97d0-4d5b-b9d3-9d237b4aa179/tip` → **409**

```json
{
  "command_id": "23355dbe-5daa-432b-b3d5-813ca41733f1",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/8671432c-97d0-4d5b-b9d3-9d237b4aa179/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c2927da2-12f3-45e8-8f52-c287fec998e8"
}
```

Done: interrupted 3021e9cf-90e6-467c-bec1-409f00c4108f, follow-up 8671432c-97d0-4d5b-b9d3-9d237b4aa179.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "76e80238-30c4-49fa-97d5-54fb94532d3c",
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
  "last_heartbeat_at": "2026-10-28T16:00:04.901917Z",
  "last_location_at": "2026-10-28T16:00:04.901917Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/76e80238-30c4-49fa-97d5-54fb94532d3c/close` → **200**

```json
{
  "command_id": "a6947a57-93be-49b3-a135-c296656dc542",
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
  "session_id": "d422af84-0a66-434f-b58a-722747bbbf27",
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
  "last_heartbeat_at": "2026-10-28T16:00:09.089819Z",
  "last_location_at": "2026-10-28T16:00:09.089819Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d422af84-0a66-434f-b58a-722747bbbf27/close` → **200**

```json
{
  "command_id": "4e5b6253-66d0-4d82-a2ff-d5a997a456fe",
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
  "session_id": "d977771d-af10-4ca7-9a02-1c17c80a5abb",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxMTUsImlhdCI6MTc5MzIwMzIxNSwianRpIjoiZmE2YWQ2OTUtNTUxOC00Njc5LTg4OTAtOTA1ZDRlNmIyODlkIiwic2lkIjoiZDk3Nzc3MWQtYWYxMC00Y2E3LTlhMDItMWMxN2M4MGE1YWJiIn0.RCLKl_k9zMgQF6N0PKz3OTYmaQhaDqBVp2W70HbUV9c",
  "access_expires_at": "2026-10-28T16:15:15.943593293Z",
  "refresh_token": "M5JKYXPjVu3_NcKXhPSd26QsbOOZylwCjpBom9ysRIs",
  "refresh_expires_at": "2026-10-29T04:00:15.943078732Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "ae79bf3c-012c-4f5f-899e-2e269606257f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:00:16Z"
}
```

```json
{
  "id": "3385a57d-1ad6-44d0-b86e-2db01bc9053f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:00:16Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/3385a57d-1ad6-44d0-b86e-2db01bc9053f/publish` → **200**

```json
{
  "command_id": "159995e8-4379-414d-8dc5-bf393eff96e6",
  "expected_version": 0
}
```

```json
{
  "id": "3385a57d-1ad6-44d0-b86e-2db01bc9053f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:00:16.50948Z",
  "published_at": "2026-10-28T16:00:16.50948Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "3385a57d-1ad6-44d0-b86e-2db01bc9053f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T16:00:16.50948Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634890678",
  "device_ref": "sandbox-5597"
}
```

```json
{
  "challenge_id": "8cf8a710-186a-4706-93c0-23439f8030e0",
  "expires_at": "2026-10-28T16:05:17.062850004Z",
  "resend_available_at": "2026-10-28T16:00:18.062850004Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634890678` → **200**

```json
{
  "phone": "+380634890678",
  "audience": "CLIENT",
  "code": "921979",
  "sent_at": "2026-10-28T16:00:17.065433818Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8cf8a710-186a-4706-93c0-23439f8030e0",
  "code": "921979",
  "device_ref": "sandbox-5597"
}
```

```json
{
  "session_id": "3b22aa63-b06d-4623-acac-28cc51bbe22d",
  "subject": {
    "type": "CLIENT",
    "id": "cb7afe14-f5cc-48a4-8bd6-32ae6963ed69"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYjdhZmUxNC1mNWNjLTQ4YTQtOGJkNi0zMmFlNjk2M2VkNjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MTE3LCJpYXQiOjE3OTMyMDMyMTcsImp0aSI6ImFjYmE5YmFhLWZjYzctNDc0Yy1iNjIyLTYyZmI4ZmNhZjZiNSIsInNpZCI6IjNiMjJhYTYzLWIwNmQtNDYyMy1hY2FjLTI4Y2M1MWJiZTIyZCJ9.92Pz8LAatLe-H2hqVAvQwt_OnSapy40l_2QruEP1gZY",
  "access_expires_at": "2026-10-28T16:15:17.361449252Z",
  "refresh_token": "rIq6glcOsFEv7zNhLnWt8yZDLmMI4kZf_seYUTucQxI",
  "refresh_expires_at": "2026-11-27T16:00:17.360879909Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "3385a57d-1ad6-44d0-b86e-2db01bc9053f",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T16:00:16.50948Z",
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
  "command_id": "7e4c2f1a-5e8d-45be-bfea-36ec603b7e63",
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
  "id": "9a833098-ae48-472c-8e94-c71eb3ca8a08",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:05:17.895612Z",
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
  "command_id": "3be3aaee-d91d-4b22-914c-093442c3900d",
  "quote_id": "9a833098-ae48-472c-8e94-c71eb3ca8a08",
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
  "correlation_id": "40c5731f-4cc4-400f-894b-ff5222f11436"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "85039c85-0be1-4bc3-b25b-42e1bd99dba0",
  "version_id": "3385a57d-1ad6-44d0-b86e-2db01bc9053f",
  "language": "uk"
}
```

```json
{
  "version_id": "3385a57d-1ad6-44d0-b86e-2db01bc9053f",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T16:00:18.45439Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bdbb890a-a30d-4fff-92b4-c846f64138ed",
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
  "id": "fd6477bd-561c-41a4-9a25-41a8166a9985",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:05:18.726159Z",
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
  "command_id": "15be9bc2-e053-495f-a422-2f41cc73009c",
  "quote_id": "fd6477bd-561c-41a4-9a25-41a8166a9985",
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
  "id": "b9930b80-03be-499f-9e25-a4e8f295e279",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cb7afe14-f5cc-48a4-8bd6-32ae6963ed69",
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
  "created_at": "2026-10-28T16:00:19.008925Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b9930b80-03be-499f-9e25-a4e8f295e279` → **200**

```json
{
  "id": "b9930b80-03be-499f-9e25-a4e8f295e279",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cb7afe14-f5cc-48a4-8bd6-32ae6963ed69",
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
  "created_at": "2026-10-28T16:00:19.008925Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b9930b80-03be-499f-9e25-a4e8f295e279/cancel` → **200**

```json
{
  "command_id": "38f827aa-88aa-4145-bc98-76a5f2cc2727",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b9930b80-03be-499f-9e25-a4e8f295e279",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cb7afe14-f5cc-48a4-8bd6-32ae6963ed69",
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
  "created_at": "2026-10-28T16:00:19.008925Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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

`POST /api/admin/v1/legal-documents/3385a57d-1ad6-44d0-b86e-2db01bc9053f` → **409**

```json
{
  "command_id": "944399ce-908a-4edc-b5f3-9b50e81490b2",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:00:19Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/3385a57d-1ad6-44d0-b86e-2db01bc9053f",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b0f3eeaf-845e-4523-b5da-bf4cb25d6663"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "bbe68daf-dd34-48d1-a264-21e03c4b59c7",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:00:20Z"
}
```

```json
{
  "id": "aa207d31-2d94-400e-9b0c-17d02eeb7e5a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:00:20Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/aa207d31-2d94-400e-9b0c-17d02eeb7e5a/publish` → **200**

```json
{
  "command_id": "31a3bf84-528d-4e7f-acf3-9b24b406ddbd",
  "expected_version": 0
}
```

```json
{
  "id": "aa207d31-2d94-400e-9b0c-17d02eeb7e5a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:00:20.453643Z",
  "published_at": "2026-10-28T16:00:20.453643Z",
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
  "device_ref": "sandbox-1244"
}
```

```json
{
  "challenge_id": "3fbdff24-bd8c-4be3-8812-288168f40e56",
  "expires_at": "2026-10-28T16:05:20.726431313Z",
  "resend_available_at": "2026-10-28T16:00:21.726431313Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "252428",
  "sent_at": "2026-10-28T16:00:20.728760178Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3fbdff24-bd8c-4be3-8812-288168f40e56",
  "code": "252428",
  "device_ref": "sandbox-1244"
}
```

```json
{
  "session_id": "1dd5c322-0789-4417-a136-c6574182a5d2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDEyMSwiaWF0IjoxNzkzMjAzMjIxLCJqdGkiOiI5MDM4MmYwNC0yNGM4LTRjMTQtYWY0YS01ZjI4YmJjNzIyMjQiLCJzaWQiOiIxZGQ1YzMyMi0wNzg5LTQ0MTctYTEzNi1jNjU3NDE4MmE1ZDIifQ.eDh6ty6bBZ1vTlqgidgXJsofKGlpaxqmusfBJmbZg9c",
  "access_expires_at": "2026-10-28T16:15:21.016055022Z",
  "refresh_token": "l5wf1Zdq-i-zia1mA1W0sV2fQ-1YUzPvVCoMs3FY1ug",
  "refresh_expires_at": "2026-11-27T16:00:21.015412204Z",
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
  "command_id": "b0292635-ece5-405f-b14e-bf91eac40111",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:00:21Z",
    "sequence": 1793203221547
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b24c9f83-eccb-4794-9895-b9853233df99",
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
  "last_heartbeat_at": "2026-10-28T16:00:21.565443Z",
  "last_location_at": "2026-10-28T16:00:21.565443Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670042691",
  "device_ref": "sandbox-30084"
}
```

```json
{
  "challenge_id": "78f319b7-8601-49f6-91b8-d609e1b015ca",
  "expires_at": "2026-10-28T16:05:21.854669105Z",
  "resend_available_at": "2026-10-28T16:00:22.854669105Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670042691` → **200**

```json
{
  "phone": "+380670042691",
  "audience": "CLIENT",
  "code": "214115",
  "sent_at": "2026-10-28T16:00:21.856659111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78f319b7-8601-49f6-91b8-d609e1b015ca",
  "code": "214115",
  "device_ref": "sandbox-30084"
}
```

```json
{
  "session_id": "91210050-d92d-47c7-ae0f-7c814137c3e1",
  "subject": {
    "type": "CLIENT",
    "id": "c363f07d-65dc-4655-8246-a16b05863064"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzYzZjA3ZC02NWRjLTQ2NTUtODI0Ni1hMTZiMDU4NjMwNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MTIyLCJpYXQiOjE3OTMyMDMyMjIsImp0aSI6IjM4YzJmYTNmLWUzNmItNDg5Mi1hNTlhLWViM2U5NjM0MjNlOCIsInNpZCI6IjkxMjEwMDUwLWQ5MmQtNDdjNy1hZTBmLTdjODE0MTM3YzNlMSJ9.bOW210vuwYCGU75z4zU-zMW6-F-L4EyQXIepoK6nqZs",
  "access_expires_at": "2026-10-28T16:15:22.141697344Z",
  "refresh_token": "DlwScK-nANnSueFpnGutqDxgu27NreOIHBJ7rV4vGEw",
  "refresh_expires_at": "2026-11-27T16:00:22.140991456Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "54dcc0ac-8589-41d5-a593-2a6dc2fedc82",
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
  "id": "a912acd1-1cb2-4ddc-9256-bc12fc0a9fa5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:05:22.408388Z",
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
  "command_id": "96c60feb-d2c7-4773-8c39-1577d2024004",
  "quote_id": "a912acd1-1cb2-4ddc-9256-bc12fc0a9fa5",
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
    "phone": "+380672493919"
  }
}
```

```json
{
  "id": "e43329a4-5f32-4fa2-a7ee-28f80b3ed332",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c363f07d-65dc-4655-8246-a16b05863064",
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
  "created_at": "2026-10-28T16:00:22.690489Z",
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
    "id": "217ce6d4-6447-4ba7-9a4a-9422eebd962b",
    "order_id": "e43329a4-5f32-4fa2-a7ee-28f80b3ed332",
    "expires_at": "2026-10-28T16:00:37.693578Z",
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

`POST /api/driver/v1/offers/217ce6d4-6447-4ba7-9a4a-9422eebd962b/accept` → **200**

```json
{
  "command_id": "6d577d7d-ad41-4f8c-aa7b-7661e1080171"
}
```

```json
{
  "id": "a63d1edf-e0ef-41aa-b1f9-a6e41f0b1015",
  "order_id": "e43329a4-5f32-4fa2-a7ee-28f80b3ed332",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e0f4633-fd14-4474-ae26-69f45a5cfa03",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e0f4633-fd14-4474-ae26-69f45a5cfa03",
  "order_id": "e43329a4-5f32-4fa2-a7ee-28f80b3ed332",
  "assignment_id": "a63d1edf-e0ef-41aa-b1f9-a6e41f0b1015",
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
    "phone": "+380672493919"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f47c26b2-480c-4267-ab64-604058893d5b",
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
  "id": "5bb27a67-13d6-4f13-bf05-7f3538b3c936",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:05:23.817501Z",
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
  "command_id": "03cb2ff5-fca1-4cf9-bb95-83834265d212",
  "quote_id": "5bb27a67-13d6-4f13-bf05-7f3538b3c936",
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
  "id": "76f40230-8a1a-4dce-8716-7025f738f928",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c363f07d-65dc-4655-8246-a16b05863064",
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
  "created_at": "2026-10-28T16:00:24.112069Z",
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
  "command_id": "94396da2-49b1-42cd-9259-2afff3959ce5",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T19:00:24Z"
}
```

```json
{
  "id": "4a663d90-e679-4944-bff7-fa1def5b447f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:05:24.406258Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:00:24Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2a827768-b210-4068-87f8-1ea7f8eb0a64",
  "quote_id": "4a663d90-e679-4944-bff7-fa1def5b447f",
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
  "pickup_at": "2026-10-28T19:00:24Z"
}
```

```json
{
  "id": "f7d92c87-6933-45a5-9ccb-ee5c61d0fa51",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c363f07d-65dc-4655-8246-a16b05863064",
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
  "created_at": "2026-10-28T16:00:24.683593Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:00:24Z",
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
  "command_id": "9ea175c7-2d62-400a-8ae9-53559383f3ed",
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
  "id": "cc1c0694-a880-484c-938a-cc37f4d59ff5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:05:24.984942Z",
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
  "command_id": "53c04bd3-52cf-45a6-bbc0-b19314a51432",
  "quote_id": "cc1c0694-a880-484c-938a-cc37f4d59ff5",
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
  "correlation_id": "a0542204-50a0-4f94-8ffb-2f2096f769ce"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "f7d92c87-6933-45a5-9ccb-ee5c61d0fa51",
      "short_number": 17,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "c363f07d-65dc-4655-8246-a16b05863064",
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
      "created_at": "2026-10-28T16:00:24.683593Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T19:00:24Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "76f40230-8a1a-4dce-8716-7025f738f928",
      "short_number": 16,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "c363f07d-65dc-4655-8246-a16b05863064",
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
      "created_at": "2026-10-28T16:00:24.112069Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "e43329a4-5f32-4fa2-a7ee-28f80b3ed332",
      "short_number": 15,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "76f40230-8a1a-4dce-8716-7025f738f928",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c363f07d-65dc-4655-8246-a16b05863064",
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
  "created_at": "2026-10-28T16:00:24.112069Z",
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

`GET /api/rider/v1/orders/e43329a4-5f32-4fa2-a7ee-28f80b3ed332` → **200**

```json
{
  "id": "e43329a4-5f32-4fa2-a7ee-28f80b3ed332",
  "short_number": 15,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c363f07d-65dc-4655-8246-a16b05863064",
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
    "id": "a63d1edf-e0ef-41aa-b1f9-a6e41f0b1015",
    "order_id": "e43329a4-5f32-4fa2-a7ee-28f80b3ed332",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3e0f4633-fd14-4474-ae26-69f45a5cfa03",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:00:22.690489Z",
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
    "location_at": "2026-10-28T16:00:21.565443Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/e43329a4-5f32-4fa2-a7ee-28f80b3ed332/cancel` → **200**

```json
{
  "command_id": "0880de5c-c20d-4a02-bbc4-ba89222386c9",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e43329a4-5f32-4fa2-a7ee-28f80b3ed332",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c363f07d-65dc-4655-8246-a16b05863064",
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
    "id": "a63d1edf-e0ef-41aa-b1f9-a6e41f0b1015",
    "order_id": "e43329a4-5f32-4fa2-a7ee-28f80b3ed332",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3e0f4633-fd14-4474-ae26-69f45a5cfa03",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:00:22.690489Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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

`GET /api/rider/v1/orders/76f40230-8a1a-4dce-8716-7025f738f928` → **200**

```json
{
  "id": "76f40230-8a1a-4dce-8716-7025f738f928",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c363f07d-65dc-4655-8246-a16b05863064",
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
  "created_at": "2026-10-28T16:00:24.112069Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/76f40230-8a1a-4dce-8716-7025f738f928/cancel` → **200**

```json
{
  "command_id": "c052bc01-ddab-4668-afe3-05188bab0fc0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "76f40230-8a1a-4dce-8716-7025f738f928",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c363f07d-65dc-4655-8246-a16b05863064",
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
  "created_at": "2026-10-28T16:00:24.112069Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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

`GET /api/rider/v1/orders/f7d92c87-6933-45a5-9ccb-ee5c61d0fa51` → **200**

```json
{
  "id": "f7d92c87-6933-45a5-9ccb-ee5c61d0fa51",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c363f07d-65dc-4655-8246-a16b05863064",
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
  "created_at": "2026-10-28T16:00:24.683593Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:00:24Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f7d92c87-6933-45a5-9ccb-ee5c61d0fa51/cancel` → **200**

```json
{
  "command_id": "0a632e3c-d782-4841-8b22-bb9ce8c5aac1",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f7d92c87-6933-45a5-9ccb-ee5c61d0fa51",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c363f07d-65dc-4655-8246-a16b05863064",
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
  "created_at": "2026-10-28T16:00:24.683593Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": "2026-10-28T19:00:24Z",
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
  "session_id": "b24c9f83-eccb-4794-9895-b9853233df99",
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
  "last_heartbeat_at": "2026-10-28T16:00:21.565443Z",
  "last_location_at": "2026-10-28T16:00:21.565443Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b24c9f83-eccb-4794-9895-b9853233df99/close` → **200**

```json
{
  "command_id": "0b0c3f6b-cc4d-4207-85cf-820ff9324417",
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

Done: orders e43329a4-5f32-4fa2-a7ee-28f80b3ed332, 76f40230-8a1a-4dce-8716-7025f738f928, f7d92c87-6933-45a5-9ccb-ee5c61d0fa51.

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
  "session_id": "82f29bcb-b3ac-4a0c-bcb7-06202e10c7bc",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxMjgsImlhdCI6MTc5MzIwMzIyOCwianRpIjoiNTdjMTI1ZDctZDYzMS00ZjZkLWI5OGYtMWNjYjFkNmY1OWZiIiwic2lkIjoiODJmMjliY2ItYjNhYy00YTBjLWJjYjctMDYyMDJlMTBjN2JjIn0.JJzxNetGLkAMe-UOyqJYkumd6UD1hs4Iy8mhpkO_1LQ",
  "access_expires_at": "2026-10-28T16:15:28.64369751Z",
  "refresh_token": "HfcYxMnjjTy8-qcrc_pGZ38P9zEbpRv95pLVtOxfqgE",
  "refresh_expires_at": "2026-10-29T04:00:28.643175736Z",
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
  "session_id": "09093a84-0556-4fc2-bd3f-42d77220aee2",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxMjksImlhdCI6MTc5MzIwMzIyOSwianRpIjoiOGRjYWFlMDQtZDZmOC00NmQ1LTljNzUtNDM1NGJhM2IyYTJkIiwic2lkIjoiMDkwOTNhODQtMDU1Ni00ZmMyLWJkM2YtNDJkNzcyMjBhZWUyIn0.cI8JLZCFV7D-Z8aDsYSKfPTvF47UnMDiF8C_R661EQI",
  "access_expires_at": "2026-10-28T16:15:29.199508095Z",
  "refresh_token": "dxAzqvgvOko_orNgFOOA5tkqbyh9GpXsGu18SQ1sVHI",
  "refresh_expires_at": "2026-10-29T04:00:29.198985909Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26994"
}
```

```json
{
  "challenge_id": "6d2ec1cb-eb70-41c0-ac60-c6d53abaa722",
  "expires_at": "2026-10-28T16:05:29.455864396Z",
  "resend_available_at": "2026-10-28T16:00:30.455864396Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "219225",
  "sent_at": "2026-10-28T16:00:29.458267204Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d2ec1cb-eb70-41c0-ac60-c6d53abaa722",
  "code": "219225",
  "device_ref": "sandbox-26994"
}
```

```json
{
  "session_id": "4d65b9b8-0ef8-496e-9fef-ee57ee6e6ae7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDEyOSwiaWF0IjoxNzkzMjAzMjI5LCJqdGkiOiIxNjdmOGUwMi02NzczLTQ5NzYtYTZjMy02NGJjODVmNWZiYjIiLCJzaWQiOiI0ZDY1YjliOC0wZWY4LTQ5NmUtOWZlZi1lZTU3ZWU2ZTZhZTcifQ.P6VTbEVHLyQKc5oXXLBkR3c59N_JkdUHE3ZHWOhcWA0",
  "access_expires_at": "2026-10-28T16:15:29.749847432Z",
  "refresh_token": "8Amt-VX9IiRgXets-sa9s0-C0iIU2uczZcmbD9iH58s",
  "refresh_expires_at": "2026-11-27T16:00:29.749286604Z",
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
  "command_id": "2ebea6be-7fff-4cbf-b68e-8f47e8efca98",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:00:30Z",
    "sequence": 1793203230284
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8cd5f213-8b61-4a88-9394-645689a4a4ed",
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
  "last_heartbeat_at": "2026-10-28T16:00:30.301904Z",
  "last_location_at": "2026-10-28T16:00:30.301904Z",
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
  "command_id": "502dae49-fdd5-4d5c-8cab-97f3b83a43d9",
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
  "effective_at": "2026-10-28T16:00:30.853846Z",
  "changed_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T15:58:16.904672Z",
  "last_entries": [
    {
      "order_id": "bb7fa43d-6f37-4288-af35-5769684b3da2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T15:58:16.904672Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9e6406ad-5903-4019-b7eb-e70373b1843c",
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
  "id": "75529715-c426-45b8-9765-260111068b0c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:05:31.399745Z",
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
  "command_id": "b06e3883-3aff-4319-acc6-9dbe4a477ed8",
  "quote_id": "75529715-c426-45b8-9765-260111068b0c",
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
    "phone": "+3806711116916"
  }
}
```

```json
{
  "id": "60718e20-1dce-4ffa-bb10-ccf2fa47522d",
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
  "created_at": "2026-10-28T16:00:31.67889Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116916"
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
    "id": "fb260d75-6a0b-4e7b-a985-984602226e49",
    "order_id": "60718e20-1dce-4ffa-bb10-ccf2fa47522d",
    "expires_at": "2026-10-28T16:00:46.682901Z",
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

`POST /api/driver/v1/offers/fb260d75-6a0b-4e7b-a985-984602226e49/accept` → **200**

```json
{
  "command_id": "0fc568a4-b65a-4b81-8895-2e0178c02757"
}
```

```json
{
  "id": "f84362b5-d281-4dca-8a45-6dcfde9767a3",
  "order_id": "60718e20-1dce-4ffa-bb10-ccf2fa47522d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0e6fb328-4699-4830-a3fd-65e0604080a1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0e6fb328-4699-4830-a3fd-65e0604080a1",
  "order_id": "60718e20-1dce-4ffa-bb10-ccf2fa47522d",
  "assignment_id": "f84362b5-d281-4dca-8a45-6dcfde9767a3",
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
    "phone": "+3806711116916"
  }
}
```

`POST /api/driver/v1/work-sessions/8cd5f213-8b61-4a88-9394-645689a4a4ed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:00:32Z",
    "sequence": 1793203232767
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8cd5f213-8b61-4a88-9394-645689a4a4ed",
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
  "last_heartbeat_at": "2026-10-28T16:00:32.786161Z",
  "last_location_at": "2026-10-28T16:00:32.786161Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0e6fb328-4699-4830-a3fd-65e0604080a1/arrive` → **200**

```json
{
  "command_id": "ed3e13f9-cc0e-4242-8266-eba9fcd2ea96",
  "expected_version": 0
}
```

```json
{
  "id": "0e6fb328-4699-4830-a3fd-65e0604080a1",
  "order_id": "60718e20-1dce-4ffa-bb10-ccf2fa47522d",
  "assignment_id": "f84362b5-d281-4dca-8a45-6dcfde9767a3",
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
  "arrived_at": "2026-10-28T16:00:33.06182Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711116916"
  }
}
```

`POST /api/driver/v1/trips/0e6fb328-4699-4830-a3fd-65e0604080a1/start` → **200**

```json
{
  "command_id": "0cbbfa50-eca8-4c0f-bde4-df1dd9390fc5",
  "expected_version": 1
}
```

```json
{
  "id": "0e6fb328-4699-4830-a3fd-65e0604080a1",
  "order_id": "60718e20-1dce-4ffa-bb10-ccf2fa47522d",
  "assignment_id": "f84362b5-d281-4dca-8a45-6dcfde9767a3",
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
  "arrived_at": "2026-10-28T16:00:33.06182Z",
  "started_at": "2026-10-28T16:00:33.34055Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711116916"
  }
}
```

`POST /api/driver/v1/trips/0e6fb328-4699-4830-a3fd-65e0604080a1/complete` → **200**

```json
{
  "command_id": "8502daf6-abda-4a2b-9e3c-c8fd6e5b413e",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:00:33Z",
  "cash_received": true
}
```

```json
{
  "id": "0e6fb328-4699-4830-a3fd-65e0604080a1",
  "order_id": "60718e20-1dce-4ffa-bb10-ccf2fa47522d",
  "assignment_id": "f84362b5-d281-4dca-8a45-6dcfde9767a3",
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
  "arrived_at": "2026-10-28T16:00:33.06182Z",
  "started_at": "2026-10-28T16:00:33.34055Z",
  "completed_at": "2026-10-28T16:00:33.63422Z",
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
  "command_id": "02359af6-c686-491d-b2d0-e50f942796ab",
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
  "id": "6aad19a8-3fff-4a91-a62c-e23da96df7b6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:05:33.926988Z",
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
  "command_id": "0c824abf-e1b8-457f-b4d3-503908567817",
  "quote_id": "6aad19a8-3fff-4a91-a62c-e23da96df7b6",
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
    "phone": "+3806711131769"
  }
}
```

```json
{
  "id": "27c3e000-d47b-45f8-9ba7-678d168a2b94",
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
  "created_at": "2026-10-28T16:00:34.208177Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131769"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/27c3e000-d47b-45f8-9ba7-678d168a2b94` → **200**

```json
{
  "id": "27c3e000-d47b-45f8-9ba7-678d168a2b94",
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
  "created_at": "2026-10-28T16:00:34.208177Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131769"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/27c3e000-d47b-45f8-9ba7-678d168a2b94/cancel` → **200**

```json
{
  "command_id": "7e8bb91b-fc40-4593-963a-eb994dc074a3",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "27c3e000-d47b-45f8-9ba7-678d168a2b94",
  "short_number": 19,
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
  "created_at": "2026-10-28T16:00:34.208177Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131769"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
      "en": "Operator error",
      "ru": "Ошибка оператора"
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
  "staff_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T15:58:16.904672Z",
  "last_entries": [
    {
      "order_id": "27c3e000-d47b-45f8-9ba7-678d168a2b94",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T16:00:34.798941Z"
    },
    {
      "order_id": "60718e20-1dce-4ffa-bb10-ccf2fa47522d",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T16:00:33.639359Z"
    },
    {
      "order_id": "bb7fa43d-6f37-4288-af35-5769684b3da2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T15:58:16.904672Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8cd5f213-8b61-4a88-9394-645689a4a4ed",
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
  "last_heartbeat_at": "2026-10-28T16:00:32.786161Z",
  "last_location_at": "2026-10-28T16:00:32.786161Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8cd5f213-8b61-4a88-9394-645689a4a4ed/close` → **200**

```json
{
  "command_id": "2688019c-96bd-4517-8e9f-e395f3d0b5a0",
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

Done: operator bonus for fulfilled 60718e20-1dce-4ffa-bb10-ccf2fa47522d and operator-fault cancellation 27c3e000-d47b-45f8-9ba7-678d168a2b94.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672856381",
  "device_ref": "sandbox-15133"
}
```

```json
{
  "challenge_id": "fe7a6a83-065e-4b63-9a25-c68777d85721",
  "expires_at": "2026-10-28T16:05:37.933375232Z",
  "resend_available_at": "2026-10-28T16:00:38.933375232Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672856381` → **200**

```json
{
  "phone": "+380672856381",
  "audience": "CLIENT",
  "code": "793971",
  "sent_at": "2026-10-28T16:00:37.935822995Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671807845",
  "device_ref": "sandbox-22492",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "4bf0b0a4-c597-47b4-9984-4ad03453d1cc",
  "expires_at": "2026-10-28T16:05:38.224941351Z",
  "resend_available_at": "2026-10-28T16:00:39.224941351Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671807845` → **200**

```json
{
  "phone": "+380671807845",
  "audience": "CLIENT",
  "code": "558972",
  "sent_at": "2026-10-28T16:00:38.22724676Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675490000",
  "device_ref": "sandbox-19392"
}
```

```json
{
  "challenge_id": "6bee3afe-4d34-40e6-9355-08fba09cc307",
  "expires_at": "2026-10-28T16:05:38.510392625Z",
  "resend_available_at": "2026-10-28T16:00:39.510392625Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675490000` → **200**

```json
{
  "phone": "+380675490000",
  "audience": "CLIENT",
  "code": "969267",
  "sent_at": "2026-10-28T16:00:38.513610156Z",
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
  "session_id": "f7098b69-45c4-4338-8676-50ba09f9b87c",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxMzksImlhdCI6MTc5MzIwMzIzOSwianRpIjoiOWJkYjBjNDItNzFhMi00OWRkLWFkMTctODRmOTFiZDJhZjBjIiwic2lkIjoiZjcwOThiNjktNDVjNC00MzM4LTg2NzYtNTBiYTA5ZjliODdjIn0.Nu7OtWkEqCCnKUG1mS1zfFVogVNjgtoMik4muFBzURo",
  "access_expires_at": "2026-10-28T16:15:39.086803594Z",
  "refresh_token": "QJJI2N68NIzbMWBx5dVAedQe8hY55PSPlCsGertgRBI",
  "refresh_expires_at": "2026-10-29T04:00:39.086196119Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675490000` → **200**

```json
{
  "deliveries": [
    {
      "id": "f4221606-6bb4-4f22-b539-8baf86056de1",
      "challenge_id": "6bee3afe-4d34-40e6-9355-08fba09cc307",
      "phone": "+380675490000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-791e48af-966e-4939-86e5-5db63ffba91c",
      "error": null,
      "attempted_at": "2026-10-28T16:00:38.513853Z"
    },
    {
      "id": "f77803ad-564c-4c95-b764-4d3d80b3d55f",
      "challenge_id": "6bee3afe-4d34-40e6-9355-08fba09cc307",
      "phone": "+380675490000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T16:00:38.512712Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675490000` → **200**

```json
{
  "phone": "+380675490000",
  "audience": "CLIENT",
  "code": "969267",
  "sent_at": "2026-10-28T16:00:38.513610156Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671807845` → **200**

```json
{
  "deliveries": [
    {
      "id": "34fa709a-b21e-4f46-ae44-f44416ba5b0b",
      "challenge_id": "4bf0b0a4-c597-47b4-9984-4ad03453d1cc",
      "phone": "+380671807845",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-471e1146-3997-4c37-936d-cad9793d7aeb",
      "error": null,
      "attempted_at": "2026-10-28T16:00:38.22751Z"
    }
  ]
}
```

Done: SMS to +380672856381, a call to +380671807845, SMS then a call to +380675490000.

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
  "session_id": "851caded-e019-4515-8cec-9e06226961ba",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxNDAsImlhdCI6MTc5MzIwMzI0MCwianRpIjoiZThlYzE5N2EtODkxNC00OWJjLWFhNzMtNmM4NWVhMmQ2ZDhlIiwic2lkIjoiODUxY2FkZWQtZTAxOS00NTE1LThjZWMtOWUwNjIyNjk2MWJhIn0.CQSM4C4HBKvGUzAKZGiBCuL9d0ChtulvuDsJWnyRIhw",
  "access_expires_at": "2026-10-28T16:15:40.213324445Z",
  "refresh_token": "J6FVRO1Vd5jE654ohsLQHYN90RNIqR5Hp-IAKjajsJ4",
  "refresh_expires_at": "2026-10-29T04:00:40.212775129Z",
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
  "session_id": "2a8a6a2a-08d8-45b2-a213-7f9921d010a2",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxNDAsImlhdCI6MTc5MzIwMzI0MCwianRpIjoiYTk2ZmVkZGEtYTUwNy00NTE2LWFhY2QtYjNjNjVlODY4Yjg2Iiwic2lkIjoiMmE4YTZhMmEtMDhkOC00NWIyLWEyMTMtN2Y5OTIxZDAxMGEyIn0.srCbFnRege9dO4s0idEwdIGG-80wfHO_w1TX58KB-NE",
  "access_expires_at": "2026-10-28T16:15:40.770839411Z",
  "refresh_token": "bmxjE5mQw8TtfqvWzdFvOP2C6Ec_pIdaSljNTp6vgGo",
  "refresh_expires_at": "2026-10-29T04:00:40.770265286Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
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

`POST /api/admin/v1/staff-extensions/9b58bdac-6f96-4c48-81c0-c0464b00cbce` → **200**

```json
{
  "command_id": "381d3542-123a-4f2b-a73c-7b3b624172f9",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "26c24c5c-d643-48d3-9b12-065c14103a37",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:00:41.850463Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:00:41.850463Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cfeef316-d72d-4350-af91-1948f774c420",
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
  "id": "62632f4c-9e88-4a0b-8ec1-43ac09234cde",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:05:42.413083Z",
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
  "command_id": "064a10b3-7772-413e-8dc7-8aa7750f9590",
  "quote_id": "62632f4c-9e88-4a0b-8ec1-43ac09234cde",
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
    "phone": "+380678705268"
  }
}
```

```json
{
  "id": "bea40ad9-4d4c-437b-97f3-57303203bd20",
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
  "created_at": "2026-10-28T16:00:42.69292Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678705268"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/bea40ad9-4d4c-437b-97f3-57303203bd20/calls` → **201**

```json
{
  "command_id": "16bcde65-1ac0-4948-9a53-cc2f955d77d2",
  "to": "CALLER"
}
```

```json
{
  "id": "9e5440b8-3590-4c51-ba69-681eb1c9b11e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "order_ids": [
    "bea40ad9-4d4c-437b-97f3-57303203bd20"
  ],
  "started_at": "2026-10-28T16:00:43.007069Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/bea40ad9-4d4c-437b-97f3-57303203bd20/calls` → **201**

```json
{
  "command_id": "16bcde65-1ac0-4948-9a53-cc2f955d77d2",
  "to": "CALLER"
}
```

```json
{
  "id": "9e5440b8-3590-4c51-ba69-681eb1c9b11e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "order_ids": [
    "bea40ad9-4d4c-437b-97f3-57303203bd20"
  ],
  "started_at": "2026-10-28T16:00:43.007069Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "9e5440b8-3590-4c51-ba69-681eb1c9b11e",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678705268",
    "at": "2026-10-28T16:00:43.009655135Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "9e5440b8-3590-4c51-ba69-681eb1c9b11e",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.10405",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "9e5440b8-3590-4c51-ba69-681eb1c9b11e"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "9e5440b8-3590-4c51-ba69-681eb1c9b11e",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=bea40ad9-4d4c-437b-97f3-57303203bd20` → **200**

```json
{
  "calls": [
    {
      "id": "9e5440b8-3590-4c51-ba69-681eb1c9b11e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_ids": [
        "bea40ad9-4d4c-437b-97f3-57303203bd20"
      ],
      "started_at": "2026-10-28T16:00:43.007069Z",
      "answered_at": "2026-10-28T16:00:43.62204Z",
      "ended_at": "2026-10-28T16:00:43.641781Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=bea40ad9-4d4c-437b-97f3-57303203bd20` → **200**

```json
{
  "calls": [
    {
      "id": "9e5440b8-3590-4c51-ba69-681eb1c9b11e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_ids": [
        "bea40ad9-4d4c-437b-97f3-57303203bd20"
      ],
      "started_at": "2026-10-28T16:00:43.007069Z",
      "answered_at": "2026-10-28T16:00:43.62204Z",
      "ended_at": "2026-10-28T16:00:43.641781Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=bea40ad9-4d4c-437b-97f3-57303203bd20` → **200**

```json
{
  "calls": [
    {
      "id": "9e5440b8-3590-4c51-ba69-681eb1c9b11e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "order_ids": [
        "bea40ad9-4d4c-437b-97f3-57303203bd20"
      ],
      "started_at": "2026-10-28T16:00:43.007069Z",
      "answered_at": "2026-10-28T16:00:43.62204Z",
      "ended_at": "2026-10-28T16:00:43.641781Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:00:46.762726Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/bea40ad9-4d4c-437b-97f3-57303203bd20` → **200**

```json
{
  "id": "bea40ad9-4d4c-437b-97f3-57303203bd20",
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
  "created_at": "2026-10-28T16:00:42.69292Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678705268"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bea40ad9-4d4c-437b-97f3-57303203bd20/cancel` → **200**

```json
{
  "command_id": "f4b503d5-5233-4dce-8c23-fa5b4551c1de",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "bea40ad9-4d4c-437b-97f3-57303203bd20",
  "short_number": 20,
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
  "created_at": "2026-10-28T16:00:42.69292Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678705268"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
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
  "command_id": "1436d01b-eb24-4d4b-b3ed-cd1bda5b6897",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T16:00:49.100301Z",
  "extension": "101"
}
```

Done: outgoing call 9e5440b8-3590-4c51-ba69-681eb1c9b11e from order bea40ad9-4d4c-437b-97f3-57303203bd20, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632662400",
  "device_ref": "sandbox-30779"
}
```

```json
{
  "challenge_id": "959c6834-99b0-4c69-ae2f-0397f002e532",
  "expires_at": "2026-10-28T16:05:49.374549779Z",
  "resend_available_at": "2026-10-28T16:00:50.374549779Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632662400` → **200**

```json
{
  "phone": "+380632662400",
  "audience": "CLIENT",
  "code": "804115",
  "sent_at": "2026-10-28T16:00:49.377697298Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "959c6834-99b0-4c69-ae2f-0397f002e532",
  "code": "804115",
  "device_ref": "sandbox-30779"
}
```

```json
{
  "session_id": "ff91b1c2-7f89-4dcc-831d-0fae797e976c",
  "subject": {
    "type": "CLIENT",
    "id": "a472de4f-66d8-4c5b-a983-3b5ec5db92c1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDcyZGU0Zi02NmQ4LTRjNWItYTk4My0zYjVlYzVkYjkyYzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MTQ5LCJpYXQiOjE3OTMyMDMyNDksImp0aSI6ImJiYzM4YzgwLTAzY2EtNGNkOS04YWNkLWNhM2IyZTlkNGY0YiIsInNpZCI6ImZmOTFiMWMyLTdmODktNGRjYy04MzFkLTBmYWU3OTdlOTc2YyJ9.owS4_bj-Y9RMg6AzNdtoDv1_cuyvyb1ZJ6GyjB60xN4",
  "access_expires_at": "2026-10-28T16:15:49.672005059Z",
  "refresh_token": "MA4O9eli1L4bdvOZo5ohXwGx38nhSQq1xco1t1E9quA",
  "refresh_expires_at": "2026-11-27T16:00:49.671227016Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a472de4f-66d8-4c5b-a983-3b5ec5db92c1",
  "session_id": "ff91b1c2-7f89-4dcc-831d-0fae797e976c",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632662400",
  "device_ref": "sandbox-23758"
}
```

```json
{
  "challenge_id": "3ec0fc6f-6169-46ec-bac2-83dc466e798a",
  "expires_at": "2026-10-28T16:05:52.195684282Z",
  "resend_available_at": "2026-10-28T16:00:53.195684282Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632662400` → **200**

```json
{
  "phone": "+380632662400",
  "audience": "CLIENT",
  "code": "270679",
  "sent_at": "2026-10-28T16:00:52.198154361Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ec0fc6f-6169-46ec-bac2-83dc466e798a",
  "code": "270679",
  "device_ref": "sandbox-23758"
}
```

```json
{
  "session_id": "95a2aa41-728d-415b-9fec-594dcd8a3498",
  "subject": {
    "type": "CLIENT",
    "id": "a472de4f-66d8-4c5b-a983-3b5ec5db92c1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDcyZGU0Zi02NmQ4LTRjNWItYTk4My0zYjVlYzVkYjkyYzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MTUyLCJpYXQiOjE3OTMyMDMyNTIsImp0aSI6IjViNDIyZGExLWE4MjQtNGE4My05ZGRjLTQ1YzVkNzJlM2U4MyIsInNpZCI6Ijk1YTJhYTQxLTcyOGQtNDE1Yi05ZmVjLTU5NGRjZDhhMzQ5OCJ9.pqaHjMw_KMdjD_cWuQAXx15Gq4vDWRQoiDvIBwaFVJs",
  "access_expires_at": "2026-10-28T16:15:52.562752245Z",
  "refresh_token": "Ac-B1AFE_TTZPVqQgCZ8BGFSWq2SC11O_bvd0Bwqlxk",
  "refresh_expires_at": "2026-11-27T16:00:52.562069841Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "b4f79933-9a7e-49cb-846f-b2cf430ea15d",
  "expires_at": "2026-10-28T16:05:54.828792861Z",
  "resend_available_at": "2026-10-28T16:00:55.828792861Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632662400` → **200**

```json
{
  "phone": "+380632662400",
  "audience": "CLIENT",
  "code": "891804",
  "sent_at": "2026-10-28T16:00:54.83111604Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637167876"
}
```

```json
{
  "challenge_id": "d68f0ad3-4078-47f1-be2b-70a3d8e42b58",
  "expires_at": "2026-10-28T16:05:55.116306829Z",
  "resend_available_at": "2026-10-28T16:00:56.116306829Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637167876` → **200**

```json
{
  "phone": "+380637167876",
  "audience": "CLIENT",
  "code": "554311",
  "sent_at": "2026-10-28T16:00:55.118186402Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "9d52e308-67da-4cdd-98bc-aa7b67f4fef7",
  "current_challenge_id": "b4f79933-9a7e-49cb-846f-b2cf430ea15d",
  "current_code": "000000",
  "new_challenge_id": "d68f0ad3-4078-47f1-be2b-70a3d8e42b58",
  "new_code": "554311"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "8ce9a81b-404b-45bc-9f1c-a8dc876973e8"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "2b9ff21c-44b9-48bb-b533-3fab5202ab18",
  "current_challenge_id": "b4f79933-9a7e-49cb-846f-b2cf430ea15d",
  "current_code": "891804",
  "new_challenge_id": "d68f0ad3-4078-47f1-be2b-70a3d8e42b58",
  "new_code": "554311"
}
```

```json
{
  "subject_id": "a472de4f-66d8-4c5b-a983-3b5ec5db92c1",
  "phone": "+380637167876",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a472de4f-66d8-4c5b-a983-3b5ec5db92c1",
  "session_id": "ff91b1c2-7f89-4dcc-831d-0fae797e976c",
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
  "correlation_id": "8d28bcfe-14b9-4389-94a7-0f87e7540a76"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637167876",
  "device_ref": "sandbox-26151"
}
```

```json
{
  "challenge_id": "0b3d0c6c-14d4-47bb-8be4-c6b53b86be2c",
  "expires_at": "2026-10-28T16:05:58.477051241Z",
  "resend_available_at": "2026-10-28T16:00:59.477051241Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637167876` → **200**

```json
{
  "phone": "+380637167876",
  "audience": "CLIENT",
  "code": "850822",
  "sent_at": "2026-10-28T16:00:58.479110607Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b3d0c6c-14d4-47bb-8be4-c6b53b86be2c",
  "code": "850822",
  "device_ref": "sandbox-26151"
}
```

```json
{
  "session_id": "66fa3a00-ca68-401d-b858-ee8e475126d4",
  "subject": {
    "type": "CLIENT",
    "id": "a472de4f-66d8-4c5b-a983-3b5ec5db92c1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDcyZGU0Zi02NmQ4LTRjNWItYTk4My0zYjVlYzVkYjkyYzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MTU4LCJpYXQiOjE3OTMyMDMyNTgsImp0aSI6IjE0MGY5NGRkLTcxZDctNGJkMi05YzllLTJhYWVlNzIwMGI3MCIsInNpZCI6IjY2ZmEzYTAwLWNhNjgtNDAxZC1iODU4LWVlOGU0NzUxMjZkNCJ9.i_9fFaz8Z15zXUBJBj49VkX8ZMJoOyLz5v5k1AxV9Hc",
  "access_expires_at": "2026-10-28T16:15:58.760532431Z",
  "refresh_token": "BaFB5j3fk2CSJBhqYiDw7jhF9-2ZV9zWHGuAKDdBkVM",
  "refresh_expires_at": "2026-11-27T16:00:58.759876145Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a472de4f-66d8-4c5b-a983-3b5ec5db92c1",
  "session_id": "66fa3a00-ca68-401d-b858-ee8e475126d4",
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
  "session_id": "bb6b88b0-2824-4802-a8e7-b7f27c549e58",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxNTksImlhdCI6MTc5MzIwMzI1OSwianRpIjoiOWM2NzIxOTAtOWM2My00NDc4LWJjNjctZDVmY2Y1NjU2M2ZkIiwic2lkIjoiYmI2Yjg4YjAtMjgyNC00ODAyLWE4ZTctYjdmMjdjNTQ5ZTU4In0.-to1F0ftiie0uPHXRTHtufMcmZNhtDdGigAHi_i1ffQ",
  "access_expires_at": "2026-10-28T16:15:59.576858978Z",
  "refresh_token": "K_FPrB-ksf4TRtjTYyura5OR9wvM6FYAc94uYfP1uUQ",
  "refresh_expires_at": "2026-10-29T04:00:59.576308781Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/a472de4f-66d8-4c5b-a983-3b5ec5db92c1` → **200**

```json
{
  "client": {
    "id": "a472de4f-66d8-4c5b-a983-3b5ec5db92c1",
    "phone": "+380637167876",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:00:49.669416Z",
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

`POST /api/admin/v1/clients/a472de4f-66d8-4c5b-a983-3b5ec5db92c1/phone` → **400**

```json
{
  "command_id": "f0aace75-d2e5-4280-8d03-885b723f60a5",
  "expected_version": 3,
  "phone": "+380634082261",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a472de4f-66d8-4c5b-a983-3b5ec5db92c1/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "26ed5484-7cc2-4db3-af8c-1c57dbd1e247",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/a472de4f-66d8-4c5b-a983-3b5ec5db92c1/phone` → **200**

```json
{
  "command_id": "48f01f66-2b8e-4817-b055-7578ad1d6dee",
  "expected_version": 3,
  "phone": "+380634082261",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "a472de4f-66d8-4c5b-a983-3b5ec5db92c1",
  "phone": "+380634082261",
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
  "correlation_id": "7c1515d3-94fc-4523-ba65-17a0fdb230b6"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634082261",
  "device_ref": "sandbox-27988"
}
```

```json
{
  "challenge_id": "27753b6c-6b33-43f0-aa70-9e82518390f8",
  "expires_at": "2026-10-28T16:06:00.952512344Z",
  "resend_available_at": "2026-10-28T16:01:01.952512344Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634082261` → **200**

```json
{
  "phone": "+380634082261",
  "audience": "CLIENT",
  "code": "874231",
  "sent_at": "2026-10-28T16:01:00.954856281Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27753b6c-6b33-43f0-aa70-9e82518390f8",
  "code": "874231",
  "device_ref": "sandbox-27988"
}
```

```json
{
  "session_id": "57f5896b-e493-4e2c-ad03-3b5ae4978156",
  "subject": {
    "type": "CLIENT",
    "id": "a472de4f-66d8-4c5b-a983-3b5ec5db92c1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDcyZGU0Zi02NmQ4LTRjNWItYTk4My0zYjVlYzVkYjkyYzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MTYxLCJpYXQiOjE3OTMyMDMyNjEsImp0aSI6ImMzMDBlZjVkLTZjMWItNDY5ZS1iNmViLWQ3NjUxMzc1N2VjMiIsInNpZCI6IjU3ZjU4OTZiLWU0OTMtNGUyYy1hZDAzLTNiNWFlNDk3ODE1NiJ9.o1cP2cSuktikG1YIcvqCCZxcqH38_QX5R8osuqOCmh8",
  "access_expires_at": "2026-10-28T16:16:01.247567623Z",
  "refresh_token": "wIG6BePaHpvlANANQnWywcZYUMndGAKaBMZ-XsFq7gM",
  "refresh_expires_at": "2026-11-27T16:01:01.246890271Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a472de4f-66d8-4c5b-a983-3b5ec5db92c1",
  "session_id": "57f5896b-e493-4e2c-ad03-3b5ae4978156",
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
  "phone": "+380637039378",
  "device_ref": "sandbox-13997"
}
```

```json
{
  "challenge_id": "05520186-4527-4ae5-8ee0-38833bbb056d",
  "expires_at": "2026-10-28T16:06:01.773516224Z",
  "resend_available_at": "2026-10-28T16:01:02.773516224Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637039378` → **200**

```json
{
  "phone": "+380637039378",
  "audience": "CLIENT",
  "code": "515748",
  "sent_at": "2026-10-28T16:01:01.775729277Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05520186-4527-4ae5-8ee0-38833bbb056d",
  "code": "515748",
  "device_ref": "sandbox-13997"
}
```

```json
{
  "session_id": "dcf28ae0-53e6-4a19-a533-51e03c20ab5e",
  "subject": {
    "type": "CLIENT",
    "id": "56c332d6-ef3e-41b4-86f4-1fc30d1a1a8d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMzMzJkNi1lZjNlLTQxYjQtODZmNC0xZmMzMGQxYTFhOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MTYyLCJpYXQiOjE3OTMyMDMyNjIsImp0aSI6IjczYTIwYzU5LWI0OTgtNGViYy05ZGY1LTA0NzA3ZGUxMmQyNSIsInNpZCI6ImRjZjI4YWUwLTUzZTYtNGExOS1hNTMzLTUxZTAzYzIwYWI1ZSJ9.zWDQb02otry_8oEx2IpGUtTjcrdBINAR4kkYaDFJIBU",
  "access_expires_at": "2026-10-28T16:16:02.077311137Z",
  "refresh_token": "lAMw2oVNbwPGNzMneqeh4DbZJrPKVcmxxrQXeRe0zgs",
  "refresh_expires_at": "2026-11-27T16:01:02.076714012Z",
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
  "session_id": "a8dc3b2f-7b17-47ff-84da-f14f3c57aeee",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxNjMsImlhdCI6MTc5MzIwMzI2MywianRpIjoiMzY2OGUwNDctNzBjOC00NjI4LWI0NDktZjMzYTM4YjAyMzZmIiwic2lkIjoiYThkYzNiMmYtN2IxNy00N2ZmLTg0ZGEtZjE0ZjNjNTdhZWVlIn0.hsXoDrYHbKS_0Aju24Ua2sE1BFH-VJKJ_EzqEyux7kg",
  "access_expires_at": "2026-10-28T16:16:03.214924382Z",
  "refresh_token": "l_JbgmrGQ0rnZVJuGmI9Cz2cyw8TdSuLrOtzo1hGzk4",
  "refresh_expires_at": "2026-10-29T04:01:03.204021451Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637039378` → **200**

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
  "correlation_id": "7bfc6984-a7df-4c76-98b6-92a0ca9bce2a"
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
  "session_id": "8baa72e2-c02b-4b80-a147-707178f9a0d7",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxNjQsImlhdCI6MTc5MzIwMzI2NCwianRpIjoiMTk3NDg3MzAtODFiYy00ZDEyLTk3NWItZTBjOWNjYzUwOTBkIiwic2lkIjoiOGJhYTcyZTItYzAyYi00YjgwLWExNDctNzA3MTc4ZjlhMGQ3In0.xHAVaxkzTUbEkteKXVKqopKcwJvGy9qJ17YAEKIIZ4g",
  "access_expires_at": "2026-10-28T16:16:04.320451643Z",
  "refresh_token": "4AsPlyGv7BdhwrLCtCQJvUiji2x5pXV_O9OYuVF4rPM",
  "refresh_expires_at": "2026-10-29T04:01:04.319900092Z",
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
  "command_id": "cdbec550-948a-4fc6-92f0-1f21f055b2f1",
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
  "changed_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T16:01:04.870288047Z"
}
```

## The rider books the airport for 2026-10-28T19:01:04Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600214114",
  "device_ref": "sandbox-866"
}
```

```json
{
  "challenge_id": "c14ae6b1-2921-47f3-b963-35de3ecd821d",
  "expires_at": "2026-10-28T16:06:05.145544241Z",
  "resend_available_at": "2026-10-28T16:01:06.145544241Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600214114` → **200**

```json
{
  "phone": "+48600214114",
  "audience": "CLIENT",
  "code": "827733",
  "sent_at": "2026-10-28T16:01:05.147704796Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c14ae6b1-2921-47f3-b963-35de3ecd821d",
  "code": "827733",
  "device_ref": "sandbox-866"
}
```

```json
{
  "session_id": "21be726c-3cc6-4d6a-84f6-9a66c4e55c1c",
  "subject": {
    "type": "CLIENT",
    "id": "8d4bb802-8e4d-4910-98fe-f8d625cf88e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZDRiYjgwMi04ZTRkLTQ5MTAtOThmZS1mOGQ2MjVjZjg4ZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MTY1LCJpYXQiOjE3OTMyMDMyNjUsImp0aSI6ImEzMmU1YjcyLWVmZjAtNDc2My1hM2ViLTg3NjEyZDY3ZmY5YyIsInNpZCI6IjIxYmU3MjZjLTNjYzYtNGQ2YS04NGY2LTlhNjZjNGU1NWMxYyJ9.t5T_yHObqk146AtGNP2nqKLB9IqAOtburquS5ViWYQQ",
  "access_expires_at": "2026-10-28T16:16:05.435366978Z",
  "refresh_token": "5AT_VGkuFFc2-1U5umxsV9n6cs9ZqDvtFduPE0SwRoQ",
  "refresh_expires_at": "2026-11-27T16:01:05.434803341Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "589890ae-5e65-4183-93ea-3a11164ebf98",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T19:01:04Z"
}
```

```json
{
  "id": "8257ed4f-61f5-4cea-b529-4ecac2ab5db2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:06:05.708457Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:01:04Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d7c7cdab-98da-47a0-8d7b-b8779d12f817",
  "quote_id": "8257ed4f-61f5-4cea-b529-4ecac2ab5db2",
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
  "pickup_at": "2026-10-28T19:01:04Z"
}
```

```json
{
  "id": "eac62c7d-5350-495e-9b31-6273602bb074",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8d4bb802-8e4d-4910-98fe-f8d625cf88e2",
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
  "created_at": "2026-10-28T16:01:05.997772Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:01:04Z",
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
  "device_ref": "sandbox-25761"
}
```

```json
{
  "challenge_id": "d6f55720-b0b8-455d-b89a-a6d25565d5f1",
  "expires_at": "2026-10-28T16:06:06.28899578Z",
  "resend_available_at": "2026-10-28T16:01:07.28899578Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "466483",
  "sent_at": "2026-10-28T16:01:06.292797232Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6f55720-b0b8-455d-b89a-a6d25565d5f1",
  "code": "466483",
  "device_ref": "sandbox-25761"
}
```

```json
{
  "session_id": "b367caea-83fb-493f-a811-58d063562842",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDE2NiwiaWF0IjoxNzkzMjAzMjY2LCJqdGkiOiJiOTY0N2NmNC0xOWMwLTQ5ODUtYTEwOC1kNjg0MzYxYTA3NzIiLCJzaWQiOiJiMzY3Y2FlYS04M2ZiLTQ5M2YtYTgxMS01OGQwNjM1NjI4NDIifQ.acdlclMIpWlstUR7qG348YFcjfnQ_bHZa1LsJYOX7V0",
  "access_expires_at": "2026-10-28T16:16:06.584191404Z",
  "refresh_token": "G9hqEqvuw1en8aPDwyYN4x25LNCjFQQSIh_cSa4z7JE",
  "refresh_expires_at": "2026-11-27T16:01:06.58366471Z",
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
  "command_id": "9e2dbf7d-b474-4c04-8ee4-11807eed330e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:01:07Z",
    "sequence": 1793203267109
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6738298a-3b88-4ee6-96d7-4cd103df19a0",
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
  "last_heartbeat_at": "2026-10-28T16:01:07.127491Z",
  "last_location_at": "2026-10-28T16:01:07.127491Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "eac62c7d-5350-495e-9b31-6273602bb074",
      "short_number": 21,
      "pickup_at": "2026-10-28T19:01:04Z",
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

`POST /api/driver/v1/preorders/eac62c7d-5350-495e-9b31-6273602bb074/reserve` → **200**

```json
{
  "command_id": "86fff058-75b3-49c7-9264-2c28ddea9358"
}
```

```json
{
  "id": "be3a0a51-b4ff-4264-8d67-c9f13912e6f8",
  "state": "RESERVED",
  "order": {
    "order_id": "eac62c7d-5350-495e-9b31-6273602bb074",
    "short_number": 21,
    "pickup_at": "2026-10-28T19:01:04Z",
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
  "reserved_at": "2026-10-28T16:01:07.684769Z",
  "confirm_from": "2026-10-28T18:31:04Z",
  "confirm_until": "2026-10-28T18:41:04Z",
  "drop_until": "2026-10-28T18:01:04Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "be3a0a51-b4ff-4264-8d67-c9f13912e6f8",
      "state": "RESERVED",
      "order": {
        "order_id": "eac62c7d-5350-495e-9b31-6273602bb074",
        "short_number": 21,
        "pickup_at": "2026-10-28T19:01:04Z",
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
      "reserved_at": "2026-10-28T16:01:07.684769Z",
      "confirm_from": "2026-10-28T18:31:04Z",
      "confirm_until": "2026-10-28T18:41:04Z",
      "drop_until": "2026-10-28T18:01:04Z"
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
      "id": "be3a0a51-b4ff-4264-8d67-c9f13912e6f8",
      "state": "RESERVED",
      "order": {
        "order_id": "eac62c7d-5350-495e-9b31-6273602bb074",
        "short_number": 21,
        "pickup_at": "2026-10-28T19:01:04Z",
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
      "reserved_at": "2026-10-28T16:01:07.684769Z",
      "confirm_from": "2026-10-28T18:31:04Z",
      "confirm_until": "2026-10-28T18:41:04Z",
      "drop_until": "2026-10-28T18:01:04Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/be3a0a51-b4ff-4264-8d67-c9f13912e6f8/confirm` → **409**

```json
{
  "command_id": "e3f213f8-4dbb-4845-800a-bc7e8e608c0f"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/be3a0a51-b4ff-4264-8d67-c9f13912e6f8/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bc25a346-9b34-4894-a2a1-aa840cb662b2"
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
  "session_id": "10868a79-d776-42c3-a2c6-11fc5ee8394b",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxNjksImlhdCI6MTc5MzIwMzI2OSwianRpIjoiNmI1ZGEwNmItMzgyNS00NDM3LThlNzItZGRlYWRlZWEwYWM4Iiwic2lkIjoiMTA4NjhhNzktZDc3Ni00MmMzLWEyYzYtMTFmYzVlZTgzOTRiIn0.k2q17NPsYFBGjmQD0J0pwbYlNhh7zxXqOVkc7r_xW4E",
  "access_expires_at": "2026-10-28T16:16:09.053991083Z",
  "refresh_token": "NN7_OV8zbMsLdAZXWnPuGFm4ZfpgbSI8_iDmzOwp_9E",
  "refresh_expires_at": "2026-10-29T04:01:09.05348042Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/eac62c7d-5350-495e-9b31-6273602bb074` → **200**

```json
{
  "id": "eac62c7d-5350-495e-9b31-6273602bb074",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8d4bb802-8e4d-4910-98fe-f8d625cf88e2",
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
  "created_at": "2026-10-28T16:01:05.997772Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T19:01:04Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "be3a0a51-b4ff-4264-8d67-c9f13912e6f8",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T16:01:07.684769Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/eac62c7d-5350-495e-9b31-6273602bb074/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T16:01:05.998879Z",
      "actor": {
        "type": "CLIENT",
        "id": "8d4bb802-8e4d-4910-98fe-f8d625cf88e2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "eac62c7d-5350-495e-9b31-6273602bb074",
        "preorder": true,
        "quote_id": "8257ed4f-61f5-4cea-b529-4ecac2ab5db2",
        "pickup_at": "2026-10-28T19:01:04Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "b0672353-d0e0-496d-8dc9-ef134cbae4c7"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T16:01:07.685904Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "eac62c7d-5350-495e-9b31-6273602bb074",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "be3a0a51-b4ff-4264-8d67-c9f13912e6f8"
      },
      "correlation_id": "dd7c6a1b-994a-49bc-96c8-4bfcc901a9a0"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order eac62c7d-5350-495e-9b31-6273602bb074, reservation be3a0a51-b4ff-4264-8d67-c9f13912e6f8.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15364"
}
```

```json
{
  "challenge_id": "ffc124ad-3a2e-422b-b79d-2612bcaae921",
  "expires_at": "2026-10-28T16:06:09.889098977Z",
  "resend_available_at": "2026-10-28T16:01:10.889098977Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "833067",
  "sent_at": "2026-10-28T16:01:09.891375609Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ffc124ad-3a2e-422b-b79d-2612bcaae921",
  "code": "833067",
  "device_ref": "sandbox-15364"
}
```

```json
{
  "session_id": "91531e81-20a7-4a06-968d-64a4ee76b498",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDE3MCwiaWF0IjoxNzkzMjAzMjcwLCJqdGkiOiJkYmE0ZDQ2ZS0zODU2LTRkNjYtYTg5NC1hNTM0YmYxODRkMWEiLCJzaWQiOiI5MTUzMWU4MS0yMGE3LTRhMDYtOTY4ZC02NGE0ZWU3NmI0OTgifQ.x4oX7LyJmoAydQ6Fsxpm-VHC4OxxS-X6jXUSgO9-9Uo",
  "access_expires_at": "2026-10-28T16:16:10.177810829Z",
  "refresh_token": "EgLyB7USXB2GqW00wsk1Inx1Ad5vnpMbnisP81UTFZI",
  "refresh_expires_at": "2026-11-27T16:01:10.177296649Z",
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
  "command_id": "b0543600-416d-4cee-b63e-64694fd1a9ea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:01:10Z",
    "sequence": 1793203270700
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "70e13bea-6bc2-4881-b8ad-6287785fb47e",
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
  "last_heartbeat_at": "2026-10-28T16:01:10.718019Z",
  "last_location_at": "2026-10-28T16:01:10.718019Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679574050",
  "device_ref": "sandbox-2017"
}
```

```json
{
  "challenge_id": "d10fee65-c434-4685-a3f9-5f4b709148b1",
  "expires_at": "2026-10-28T16:06:10.984580651Z",
  "resend_available_at": "2026-10-28T16:01:11.984580651Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679574050` → **200**

```json
{
  "phone": "+380679574050",
  "audience": "CLIENT",
  "code": "886827",
  "sent_at": "2026-10-28T16:01:10.986809884Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d10fee65-c434-4685-a3f9-5f4b709148b1",
  "code": "886827",
  "device_ref": "sandbox-2017"
}
```

```json
{
  "session_id": "c8540148-afb3-49e1-a033-d5d6f4ab81e3",
  "subject": {
    "type": "CLIENT",
    "id": "6cb3030f-cd4b-48f3-a873-28149758051f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Y2IzMDMwZi1jZDRiLTQ4ZjMtYTg3My0yODE0OTc1ODA1MWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MTcxLCJpYXQiOjE3OTMyMDMyNzEsImp0aSI6ImQ3MTQ2ZmNiLWE4MWUtNDI5Zi1iMmI5LWYyY2Q4YzAxNWQ0NiIsInNpZCI6ImM4NTQwMTQ4LWFmYjMtNDllMS1hMDMzLWQ1ZDZmNGFiODFlMyJ9.u1dtiLrFmQ86CquxxSkxiFigmgv81kAf6pTXyMJ_cME",
  "access_expires_at": "2026-10-28T16:16:11.272148562Z",
  "refresh_token": "bhtrIurtG2a-W3fS3fd2hi_wGwU-XHgnHU2aADd8PlY",
  "refresh_expires_at": "2026-11-27T16:01:11.271636486Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "adc32942-3049-4165-8961-a74f390b74c5",
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
  "id": "25a56474-30d4-4dc6-8508-df75eb7710ee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:06:11.547127Z",
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
  "command_id": "a4f19776-2e35-48ac-a592-382d89258a5e",
  "quote_id": "25a56474-30d4-4dc6-8508-df75eb7710ee",
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
  "id": "81b29e4e-282a-4dd1-bb85-61fb07f5471a",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6cb3030f-cd4b-48f3-a873-28149758051f",
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
  "created_at": "2026-10-28T16:01:11.826513Z",
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
    "id": "62420052-2c59-48cd-aba1-0848e51b517f",
    "order_id": "81b29e4e-282a-4dd1-bb85-61fb07f5471a",
    "expires_at": "2026-10-28T16:01:26.829584Z",
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

`POST /api/driver/v1/offers/62420052-2c59-48cd-aba1-0848e51b517f/accept` → **200**

```json
{
  "command_id": "f94e000c-f2f9-4d83-ae1b-437a01d491aa"
}
```

```json
{
  "id": "f9b2e1a1-9b25-46e5-8f44-9a42225933a7",
  "order_id": "81b29e4e-282a-4dd1-bb85-61fb07f5471a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9daf8f55-94ac-4c02-816b-0a34212ba37d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9daf8f55-94ac-4c02-816b-0a34212ba37d",
  "order_id": "81b29e4e-282a-4dd1-bb85-61fb07f5471a",
  "assignment_id": "f9b2e1a1-9b25-46e5-8f44-9a42225933a7",
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

`POST /api/driver/v1/work-sessions/70e13bea-6bc2-4881-b8ad-6287785fb47e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:01:12Z",
    "sequence": 1793203272917
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "70e13bea-6bc2-4881-b8ad-6287785fb47e",
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
  "last_heartbeat_at": "2026-10-28T16:01:12.934797Z",
  "last_location_at": "2026-10-28T16:01:12.934797Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9daf8f55-94ac-4c02-816b-0a34212ba37d",
  "order_id": "81b29e4e-282a-4dd1-bb85-61fb07f5471a",
  "assignment_id": "f9b2e1a1-9b25-46e5-8f44-9a42225933a7",
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

`POST /api/driver/v1/trips/9daf8f55-94ac-4c02-816b-0a34212ba37d/arrive` → **200**

```json
{
  "command_id": "a453a55b-b945-48ef-beb2-fd5566bd24e9",
  "expected_version": 0
}
```

```json
{
  "id": "9daf8f55-94ac-4c02-816b-0a34212ba37d",
  "order_id": "81b29e4e-282a-4dd1-bb85-61fb07f5471a",
  "assignment_id": "f9b2e1a1-9b25-46e5-8f44-9a42225933a7",
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
  "arrived_at": "2026-10-28T16:01:13.460078Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9daf8f55-94ac-4c02-816b-0a34212ba37d/start` → **200**

```json
{
  "command_id": "0e26f3df-9786-4bfa-8e89-56360e44e5c6",
  "expected_version": 1
}
```

```json
{
  "id": "9daf8f55-94ac-4c02-816b-0a34212ba37d",
  "order_id": "81b29e4e-282a-4dd1-bb85-61fb07f5471a",
  "assignment_id": "f9b2e1a1-9b25-46e5-8f44-9a42225933a7",
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
  "arrived_at": "2026-10-28T16:01:13.460078Z",
  "started_at": "2026-10-28T16:01:13.734003Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/70e13bea-6bc2-4881-b8ad-6287785fb47e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:01:14Z",
    "sequence": 1793203274591
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "70e13bea-6bc2-4881-b8ad-6287785fb47e",
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
  "last_heartbeat_at": "2026-10-28T16:01:14.023929Z",
  "last_location_at": "2026-10-28T16:01:14.023929Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/9daf8f55-94ac-4c02-816b-0a34212ba37d/complete` → **200**

```json
{
  "command_id": "8c12a9c7-2e87-4154-a0e5-91fd046d817a",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:01:14Z",
  "cash_received": true
}
```

```json
{
  "id": "9daf8f55-94ac-4c02-816b-0a34212ba37d",
  "order_id": "81b29e4e-282a-4dd1-bb85-61fb07f5471a",
  "assignment_id": "f9b2e1a1-9b25-46e5-8f44-9a42225933a7",
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
  "arrived_at": "2026-10-28T16:01:13.460078Z",
  "started_at": "2026-10-28T16:01:13.734003Z",
  "completed_at": "2026-10-28T16:01:14.289389Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/81b29e4e-282a-4dd1-bb85-61fb07f5471a/rating` → **200**

```json
{
  "command_id": "297a96e9-6c11-4d80-ab16-7274494370c3",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "81b29e4e-282a-4dd1-bb85-61fb07f5471a",
  "score": 5,
  "created_at": "2026-10-28T16:01:14.589558393Z"
}
```

`POST /api/driver/v1/orders/81b29e4e-282a-4dd1-bb85-61fb07f5471a/rating` → **200**

```json
{
  "command_id": "5cab46a4-1bf6-4431-a9d5-33641d73ec60",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "81b29e4e-282a-4dd1-bb85-61fb07f5471a",
  "score": 4,
  "created_at": "2026-10-28T16:01:14.85566184Z"
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
  "session_id": "04a37fad-68a7-436c-bc06-f0878341185e",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxNzUsImlhdCI6MTc5MzIwMzI3NSwianRpIjoiYTE2M2UzYWUtMzg1Yi00NjExLWJiNDctMDU5ZjIyNWY4NjhkIiwic2lkIjoiMDRhMzdmYWQtNjhhNy00MzZjLWJjMDYtZjA4NzgzNDExODVlIn0.p_X1z8fAnVXpU0MQDG_f2F2nrWYWu-0qY6f8sdVhFM0",
  "access_expires_at": "2026-10-28T16:16:15.692528292Z",
  "refresh_token": "EEF0Jn7CS48QHQpBuZOXFL9mfM8wawBlGyPbOZ9dT2c",
  "refresh_expires_at": "2026-10-29T04:01:15.691914075Z",
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
  "session_id": "5005f601-9946-44dc-af83-ede8e502e182",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxNzYsImlhdCI6MTc5MzIwMzI3NiwianRpIjoiZjc3M2FjOWQtODYyYi00OTBmLWE1NDAtYzViMWMyYTA4MDg4Iiwic2lkIjoiNTAwNWY2MDEtOTk0Ni00NGRjLWFmODMtZWRlOGU1MDJlMTgyIn0.iU4-EaHq4kxjYV4k7G2rCkjygbvKcbTxQDSnSyHmiqw",
  "access_expires_at": "2026-10-28T16:16:16.252422476Z",
  "refresh_token": "8YXxyIr7nHK3hPwaXJChew9lBA27llRmBqD_aZu9Sfg",
  "refresh_expires_at": "2026-10-29T04:01:16.251833777Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/81b29e4e-282a-4dd1-bb85-61fb07f5471a/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "81b29e4e-282a-4dd1-bb85-61fb07f5471a",
      "author_type": "RIDER",
      "author_id": "6cb3030f-cd4b-48f3-a873-28149758051f",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T16:01:14.589558Z"
    },
    {
      "order_id": "81b29e4e-282a-4dd1-bb85-61fb07f5471a",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "6cb3030f-cd4b-48f3-a873-28149758051f",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T16:01:14.855662Z"
    }
  ]
}
```

Done: ratings for order 81b29e4e-282a-4dd1-bb85-61fb07f5471a.

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
  "session_id": "606e02b5-0932-4c68-bd48-937f0f84f48a",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxNzcsImlhdCI6MTc5MzIwMzI3NywianRpIjoiMDVmODM5ZGUtNjQ5YS00NzU5LTgzZDgtYjdiNTMwZWY4YWFmIiwic2lkIjoiNjA2ZTAyYjUtMDkzMi00YzY4LWJkNDgtOTM3ZjBmODRmNDhhIn0.-LHvYCqU5zrZQGKo_ixoHrIemran9Tl1Q13fGQDOmWY",
  "access_expires_at": "2026-10-28T16:16:17.083616532Z",
  "refresh_token": "rj_EEKHxLn0XwKN5Lp3jjC_WLNlf6IREDuwleUWCOag",
  "refresh_expires_at": "2026-10-29T04:01:17.083036937Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "5864ad20-0472-461a-aab0-f5ff5a8399c3",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "fdd81fef-22d4-45cf-a01a-8fb686e6544d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:01:17.35699Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/fdd81fef-22d4-45cf-a01a-8fb686e6544d` → **200**

```json
{
  "id": "fdd81fef-22d4-45cf-a01a-8fb686e6544d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:01:17.35699Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/fdd81fef-22d4-45cf-a01a-8fb686e6544d` → **200**

```json
{
  "id": "fdd81fef-22d4-45cf-a01a-8fb686e6544d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:01:17.35699Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/fdd81fef-22d4-45cf-a01a-8fb686e6544d` → **200**

```json
{
  "id": "fdd81fef-22d4-45cf-a01a-8fb686e6544d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:01:17.35699Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/fdd81fef-22d4-45cf-a01a-8fb686e6544d` → **200**

```json
{
  "id": "fdd81fef-22d4-45cf-a01a-8fb686e6544d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:01:17.35699Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/fdd81fef-22d4-45cf-a01a-8fb686e6544d` → **200**

```json
{
  "id": "fdd81fef-22d4-45cf-a01a-8fb686e6544d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:01:17.35699Z",
  "ready_at": "2026-10-28T16:01:21.791754Z",
  "expires_at": "2026-10-29T16:01:21.791754Z"
}
```

`GET /api/admin/v1/reports/exports/fdd81fef-22d4-45cf-a01a-8fb686e6544d/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
total,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "5d03436a-a873-47a0-952c-bebae7d42be7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "6237fcae-518f-4712-8c7d-c024983e749c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:01:23.030895Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6237fcae-518f-4712-8c7d-c024983e749c` → **200**

```json
{
  "id": "6237fcae-518f-4712-8c7d-c024983e749c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:01:23.030895Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6237fcae-518f-4712-8c7d-c024983e749c` → **200**

```json
{
  "id": "6237fcae-518f-4712-8c7d-c024983e749c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:01:23.030895Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6237fcae-518f-4712-8c7d-c024983e749c` → **200**

```json
{
  "id": "6237fcae-518f-4712-8c7d-c024983e749c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:01:23.030895Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6237fcae-518f-4712-8c7d-c024983e749c` → **200**

```json
{
  "id": "6237fcae-518f-4712-8c7d-c024983e749c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:01:23.030895Z",
  "ready_at": "2026-10-28T16:01:26.79976Z",
  "expires_at": "2026-10-29T16:01:26.79976Z"
}
```

`GET /api/admin/v1/reports/exports/6237fcae-518f-4712-8c7d-c024983e749c/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/2c4e91a9-bd66-4c38-bfac-c6b57e8801dc` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/2c4e91a9-bd66-4c38-bfac-c6b57e8801dc",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0c85f4aa-0e8d-4ade-83a4-516b67cc3f7c"
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
  "device_ref": "sandbox-3988"
}
```

```json
{
  "challenge_id": "cc28693d-6658-4f00-a7fb-20edbb7776fe",
  "expires_at": "2026-10-28T16:06:27.677549112Z",
  "resend_available_at": "2026-10-28T16:01:28.677549112Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "221108",
  "sent_at": "2026-10-28T16:01:27.680366883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc28693d-6658-4f00-a7fb-20edbb7776fe",
  "code": "221108",
  "device_ref": "sandbox-3988"
}
```

```json
{
  "session_id": "85764e94-dc43-4398-b3b8-1e6038d90232",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDE4NywiaWF0IjoxNzkzMjAzMjg3LCJqdGkiOiI2ZjcwOTcxZC1jNDFkLTQ1MmMtYTYxZi1hNjgwY2Y4MGQ2OWYiLCJzaWQiOiI4NTc2NGU5NC1kYzQzLTQzOTgtYjNiOC0xZTYwMzhkOTAyMzIifQ.1r8rBCFuzk7LTVZIGf9i7brhQf3YiHkn8UBlzlrt8Ls",
  "access_expires_at": "2026-10-28T16:16:27.968028426Z",
  "refresh_token": "0zEVQSTXypWtLHF6WxOrqspfzq10nmAK_NsD-muJqjE",
  "refresh_expires_at": "2026-11-27T16:01:27.967464504Z",
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
  "command_id": "b77122a2-9c2a-49af-823a-547a52255860",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:01:28Z",
    "sequence": 1793203288766
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9e6fb5c3-66d2-4d08-8346-a1f216d2b7be",
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
  "last_heartbeat_at": "2026-10-28T16:01:28.783279Z",
  "last_location_at": "2026-10-28T16:01:28.783279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "cdee6385-c5a9-488a-a6d0-700d971b0123",
  "points": [
    {
      "sequence": 1793203291522,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:00:31Z"
    },
    {
      "sequence": 1793203291592,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:01:31Z"
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
  "session_id": "e97d8cc4-7c7c-417c-a4f5-0674041b8341",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxOTEsImlhdCI6MTc5MzIwMzI5MSwianRpIjoiNzExZjEwNTUtMmYzNS00NDJiLThmOTMtZGVjOTRiODEwZWU0Iiwic2lkIjoiZTk3ZDhjYzQtN2M3Yy00MTdjLWE0ZjUtMDY3NDA0MWI4MzQxIn0.CC7MCqAUCz3Xncbr-VURMFNKh5f2j639yfjyrlMsDmc",
  "access_expires_at": "2026-10-28T16:16:31.658723031Z",
  "refresh_token": "XeU3gIigbUMXGNCaGpFYcm9vInE2XGZIN652vMJniS4",
  "refresh_expires_at": "2026-10-29T04:01:31.658180528Z",
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
      "id": "c345f83f-3431-462d-b08d-0fc144ccc758",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T16:01:31Z",
        "track_point_id": "44af58e6-fc4a-47fb-9f76-5f6a8ad0b908",
        "work_session_id": "9e6fb5c3-66d2-4d08-8346-a1f216d2b7be"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T16:01:31Z",
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

`POST /api/admin/v1/driver-risk-flags/c345f83f-3431-462d-b08d-0fc144ccc758/confirm` → **200**

```json
{
  "command_id": "09fe7d2b-f897-4f1b-8d15-359f4af1c35e",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "c345f83f-3431-462d-b08d-0fc144ccc758",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T16:01:31Z",
    "track_point_id": "44af58e6-fc4a-47fb-9f76-5f6a8ad0b908",
    "work_session_id": "9e6fb5c3-66d2-4d08-8346-a1f216d2b7be"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T16:01:31Z",
  "reason": null,
  "reviewed_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "reviewed_at": "2026-10-28T16:01:33.785245Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/c345f83f-3431-462d-b08d-0fc144ccc758/dismiss` → **409**

```json
{
  "command_id": "16d78274-9b16-48ff-b689-63025bfb138f",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/c345f83f-3431-462d-b08d-0fc144ccc758/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b3e4a114-0373-4255-b86a-c3a36a506a75"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "ccf0fe9e-6508-48f2-97bd-1df17647d410",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "be195e07-c339-43e0-b6d2-b7ed7f61a263",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "raised_at": "2026-10-28T16:01:34.357568Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/be195e07-c339-43e0-b6d2-b7ed7f61a263/dismiss` → **200**

```json
{
  "command_id": "7cca087b-497d-4b24-8f89-6bd87bf7a430",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "be195e07-c339-43e0-b6d2-b7ed7f61a263",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "raised_at": "2026-10-28T16:01:34.357568Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "reviewed_at": "2026-10-28T16:01:34.638027Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "d5cf833f-cb3e-4d83-9ea1-f4a7161f8ffb",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "c345f83f-3431-462d-b08d-0fc144ccc758"
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
      "actor_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:01:34.923108Z"
    }
  ]
}
```

Done: flag c345f83f-3431-462d-b08d-0fc144ccc758 confirmed, suspension named it, driver reinstated.

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
  "session_id": "208ecb29-5e10-42f9-ae2d-94c0d3273748",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxOTUsImlhdCI6MTc5MzIwMzI5NSwianRpIjoiNjdlZGE3NWUtZWJjYS00YzllLWE4MWEtNDRlNzMxZTYxY2NlIiwic2lkIjoiMjA4ZWNiMjktNWUxMC00MmY5LWFlMmQtOTRjMGQzMjczNzQ4In0.vlLfMatwJpeTgNoCjCk-YwjHBQp3yB19wj1yPnmzJrg",
  "access_expires_at": "2026-10-28T16:16:35.762859278Z",
  "refresh_token": "ICoDP1HYt_PHmBWg2M7aTfZ5Bz3WeEiTJ_kP4HSizBI",
  "refresh_expires_at": "2026-10-29T04:01:35.762182051Z",
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
      "actor_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:01:34.923108Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "73d55db7-1761-4b4e-9cf2-405a67af39c0",
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
  "session_id": "9e6fb5c3-66d2-4d08-8346-a1f216d2b7be",
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
  "last_heartbeat_at": "2026-10-28T16:01:28.783279Z",
  "last_location_at": "2026-10-28T16:01:28.783279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9e6fb5c3-66d2-4d08-8346-a1f216d2b7be/close` → **200**

```json
{
  "command_id": "7b9b2f35-c900-4230-9953-ddd444e9fbf7",
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
  "session_id": "01181df7-cd05-4798-b2a8-c6343842be3e",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQxOTcsImlhdCI6MTc5MzIwMzI5NywianRpIjoiOGJjYzgxZmItYTc4Mi00YTQ5LTgzMWMtODZhMDgyYmNiMmFlIiwic2lkIjoiMDExODFkZjctY2QwNS00Nzk4LWIyYTgtYzYzNDM4NDJiZTNlIn0.bF0ZzMjUNPcjyp2bHiDkOIVNVeGNIZwWyDU40WSeeIw",
  "access_expires_at": "2026-10-28T16:16:37.458861625Z",
  "refresh_token": "ELjJur_apggLdOwwanqsWwx9ka5fryiTC95U0Lw9oWo",
  "refresh_expires_at": "2026-10-29T04:01:37.458306598Z",
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
  "command_id": "a1d71634-5c3a-4422-ab8b-faaf41a45bff",
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
  "changed_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:01:38.031929Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "a1d71634-5c3a-4422-ab8b-faaf41a45bff",
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
  "changed_by": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:01:38.031929Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48931673371",
  "device_ref": "sandbox-1792"
}
```

```json
{
  "challenge_id": "4feb8d54-388a-48a0-b40a-9148436931d9",
  "expires_at": "2026-10-28T16:06:38.597919371Z",
  "resend_available_at": "2026-10-28T16:01:39.597919371Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48931673371` → **200**

```json
{
  "phone": "+48931673371",
  "audience": "CLIENT",
  "code": "571080",
  "sent_at": "2026-10-28T16:01:38.600375928Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4feb8d54-388a-48a0-b40a-9148436931d9",
  "code": "571080",
  "device_ref": "sandbox-1792"
}
```

```json
{
  "session_id": "145ff6d5-f154-4b1c-85ed-8339b67fcc01",
  "subject": {
    "type": "CLIENT",
    "id": "f4d04364-24fd-4cbd-a8a4-d407dd3bea4d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNGQwNDM2NC0yNGZkLTRjYmQtYThhNC1kNDA3ZGQzYmVhNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MTk4LCJpYXQiOjE3OTMyMDMyOTgsImp0aSI6ImNiZDk5Yjc0LTcwNTItNDZlYS1hYzA1LTFkMmY1MzI0MDVmYiIsInNpZCI6IjE0NWZmNmQ1LWYxNTQtNGIxYy04NWVkLTgzMzliNjdmY2MwMSJ9.qCBhmDNKIy0aYNuvnkmLvGETNNh69yWcffya-jkw7k4",
  "access_expires_at": "2026-10-28T16:16:38.891233412Z",
  "refresh_token": "tOMKQpmNF_4Fgq0gcUhqySkyTpvJDBQOVhdNEoj2TNE",
  "refresh_expires_at": "2026-11-27T16:01:38.890546576Z",
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
  "correlation_id": "f412195b-a834-4088-8112-f87253b4b2be"
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
  "device_ref": "sandbox-7995"
}
```

```json
{
  "challenge_id": "fe2116ef-ed32-4982-8228-4375aae51c9c",
  "expires_at": "2026-10-28T16:06:39.704239657Z",
  "resend_available_at": "2026-10-28T16:01:40.704239657Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "798384",
  "sent_at": "2026-10-28T16:01:39.706543987Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe2116ef-ed32-4982-8228-4375aae51c9c",
  "code": "798384",
  "device_ref": "sandbox-7995"
}
```

```json
{
  "session_id": "0c327ebc-effa-4160-8803-58b5e2642ca0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDIwMCwiaWF0IjoxNzkzMjAzMzAwLCJqdGkiOiI5MWEyYzk3MC0zYzczLTRlMDAtYjBkOC01ZmNmYTFkNzgxNmQiLCJzaWQiOiIwYzMyN2ViYy1lZmZhLTQxNjAtODgwMy01OGI1ZTI2NDJjYTAifQ.OjPJk0wpzApDz40KA27D9vIQaIPPWcYxMvanamzjp5I",
  "access_expires_at": "2026-10-28T16:16:40.000108104Z",
  "refresh_token": "lXzF8ZDW_BEI6Oa_cKg1ybEWtgHoznUggh8VgmaGTnE",
  "refresh_expires_at": "2026-11-27T16:01:39.999358564Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6738298a-3b88-4ee6-96d7-4cd103df19a0",
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
  "last_heartbeat_at": "2026-10-28T16:01:07.127491Z",
  "last_location_at": "2026-10-28T16:01:07.127491Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6738298a-3b88-4ee6-96d7-4cd103df19a0/handover` → **200**

```json
{
  "command_id": "8e836654-bb96-4fbe-8c11-a63f7fca9f1f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6738298a-3b88-4ee6-96d7-4cd103df19a0",
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
  "last_heartbeat_at": "2026-10-28T16:01:07.127491Z",
  "last_location_at": "2026-10-28T16:01:07.127491Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6738298a-3b88-4ee6-96d7-4cd103df19a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:01:40Z",
    "sequence": 1793203300808
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6738298a-3b88-4ee6-96d7-4cd103df19a0",
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
  "last_heartbeat_at": "2026-10-28T16:01:40.826905Z",
  "last_location_at": "2026-10-28T16:01:40.826905Z",
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
  "session_id": "6738298a-3b88-4ee6-96d7-4cd103df19a0",
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
  "last_heartbeat_at": "2026-10-28T16:01:40.826905Z",
  "last_location_at": "2026-10-28T16:01:40.826905Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6738298a-3b88-4ee6-96d7-4cd103df19a0/close` → **200**

```json
{
  "command_id": "705efb7f-0cba-45fa-b4f8-01102a5e88d4",
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
  "correlation_id": "619fef54-5bf7-4944-bf69-cfd336997e31"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676186832",
  "device_ref": "sandbox-9816"
}
```

```json
{
  "challenge_id": "a0b60b5e-f191-42b4-8c0b-67631b940807",
  "expires_at": "2026-10-28T16:06:42.192980589Z",
  "resend_available_at": "2026-10-28T16:01:43.192980589Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676186832` → **200**

```json
{
  "phone": "+380676186832",
  "audience": "CLIENT",
  "code": "315272",
  "sent_at": "2026-10-28T16:01:42.195045257Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0b60b5e-f191-42b4-8c0b-67631b940807",
  "code": "315272",
  "device_ref": "sandbox-9816"
}
```

```json
{
  "session_id": "ef6733b6-2c2c-411e-94a7-0462c9bad890",
  "subject": {
    "type": "CLIENT",
    "id": "0bbb8e6d-3079-450b-8e6e-63faa0b84096"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmJiOGU2ZC0zMDc5LTQ1MGItOGU2ZS02M2ZhYTBiODQwOTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MjAyLCJpYXQiOjE3OTMyMDMzMDIsImp0aSI6ImQ2MjhmYWY3LWY1Y2QtNGFjOS04ZWFjLTM4ZDkxYzgzYWUyYiIsInNpZCI6ImVmNjczM2I2LTJjMmMtNDExZS05NGE3LTA0NjJjOWJhZDg5MCJ9.3PTO16gooCTc4D0KiHCFuAqOVLVRdLwr7PgOViX96Y0",
  "access_expires_at": "2026-10-28T16:16:42.4809463Z",
  "refresh_token": "x6k-1zevPYXTGNv1rtRazCPbWY5zmyGOZx3UUFwDXDc",
  "refresh_expires_at": "2026-11-27T16:01:42.480378771Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "78613102-328e-4c4e-9d71-dc6a25e5e29f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c6fb3cbc-7953-4826-8ec1-d92f00eeea93",
  "upload_path": "/api/rider/v1/uploads/c6fb3cbc-7953-4826-8ec1-d92f00eeea93",
  "expires_at": "2026-10-28T16:16:42.754446726Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/c6fb3cbc-7953-4826-8ec1-d92f00eeea93` → **200**

```json
{
  "file_id": "c6fb3cbc-7953-4826-8ec1-d92f00eeea93",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "3c838273-aefb-497d-8a79-ae6a7c7f5c01",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "c6fb3cbc-7953-4826-8ec1-d92f00eeea93"
  ]
}
```

```json
{
  "id": "247c9067-cc35-4f5a-9e64-ae69369fd315",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "0bbb8e6d-3079-450b-8e6e-63faa0b84096",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:01:43.07574Z",
  "updated_at": "2026-10-28T16:01:43.07574Z",
  "respond_by": "2026-10-28T20:01:43.07574Z",
  "messages": [
    {
      "id": "63922b23-cecb-4541-a211-d8a07d3994d6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "0bbb8e6d-3079-450b-8e6e-63faa0b84096",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:01:43.077349Z",
      "attachments": [
        {
          "file_id": "c6fb3cbc-7953-4826-8ec1-d92f00eeea93",
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
  "session_id": "dada57e1-cac4-4377-8a40-bb75631991ae",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQyMDMsImlhdCI6MTc5MzIwMzMwMywianRpIjoiZmJhYTI0MGItZTllMC00YzBiLWE0MDAtNTA0NDJkNTYyM2VmIiwic2lkIjoiZGFkYTU3ZTEtY2FjNC00Mzc3LThhNDAtYmI3NTYzMTk5MWFlIn0.9i-APbY079ysSc1wOoYCKASrrwvs-QtmwF-3HYu1a2s",
  "access_expires_at": "2026-10-28T16:16:43.66110191Z",
  "refresh_token": "pctR_zDcPrR4SHnm1phsUR8YOB3vGn9qz6aQ6DdvhnU",
  "refresh_expires_at": "2026-10-29T04:01:43.660590746Z",
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
  "session_id": "0e5487c1-7a95-4dee-805a-159056b462d0",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQyMDQsImlhdCI6MTc5MzIwMzMwNCwianRpIjoiMDY0NzEyZTktMzhmYS00ZjJhLThjNmMtYmU3NTdmMDAzZGY0Iiwic2lkIjoiMGU1NDg3YzEtN2E5NS00ZGVlLTgwNWEtMTU5MDU2YjQ2MmQwIn0.sL_3aZM_zkSgfCieumWKBpJnovflhgL9Psc211I8gfQ",
  "access_expires_at": "2026-10-28T16:16:44.212520198Z",
  "refresh_token": "iaZnXFWeV4iX7EyRleAX7frO5BidpgdVK0NEcwD54BQ",
  "refresh_expires_at": "2026-10-29T04:01:44.21196982Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/247c9067-cc35-4f5a-9e64-ae69369fd315/attachments/c6fb3cbc-7953-4826-8ec1-d92f00eeea93` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "0f7ae58f-e432-49f3-aa30-09054bc3f674",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c5d7e894-19d0-474c-b6ae-b7b3148b511a",
  "upload_path": "/api/operator/v1/uploads/c5d7e894-19d0-474c-b6ae-b7b3148b511a",
  "expires_at": "2026-10-28T16:16:44.493228324Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/c5d7e894-19d0-474c-b6ae-b7b3148b511a` → **200**

```json
{
  "file_id": "c5d7e894-19d0-474c-b6ae-b7b3148b511a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/247c9067-cc35-4f5a-9e64-ae69369fd315` → **200**

```json
{
  "id": "247c9067-cc35-4f5a-9e64-ae69369fd315",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "0bbb8e6d-3079-450b-8e6e-63faa0b84096",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:01:43.07574Z",
  "updated_at": "2026-10-28T16:01:43.07574Z",
  "respond_by": "2026-10-28T20:01:43.07574Z",
  "messages": [
    {
      "id": "63922b23-cecb-4541-a211-d8a07d3994d6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "0bbb8e6d-3079-450b-8e6e-63faa0b84096",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:01:43.077349Z",
      "attachments": [
        {
          "file_id": "c6fb3cbc-7953-4826-8ec1-d92f00eeea93",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/247c9067-cc35-4f5a-9e64-ae69369fd315/comments` → **200**

```json
{
  "command_id": "3757d41c-531b-496a-8cc7-2f5add4b46cb",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "c5d7e894-19d0-474c-b6ae-b7b3148b511a"
  ]
}
```

```json
{
  "id": "247c9067-cc35-4f5a-9e64-ae69369fd315",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "0bbb8e6d-3079-450b-8e6e-63faa0b84096",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:01:43.07574Z",
  "updated_at": "2026-10-28T16:01:45.066716Z",
  "respond_by": "2026-10-28T20:01:43.07574Z",
  "messages": [
    {
      "id": "63922b23-cecb-4541-a211-d8a07d3994d6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "0bbb8e6d-3079-450b-8e6e-63faa0b84096",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:01:43.077349Z",
      "attachments": [
        {
          "file_id": "c6fb3cbc-7953-4826-8ec1-d92f00eeea93",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "7cc81fe3-4fd6-4e07-a274-2e19a4648ff8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:01:45.066294Z",
      "attachments": [
        {
          "file_id": "c5d7e894-19d0-474c-b6ae-b7b3148b511a",
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

`GET /api/rider/v1/support/cases/247c9067-cc35-4f5a-9e64-ae69369fd315` → **200**

```json
{
  "id": "247c9067-cc35-4f5a-9e64-ae69369fd315",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "0bbb8e6d-3079-450b-8e6e-63faa0b84096",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:01:43.07574Z",
  "updated_at": "2026-10-28T16:01:45.066716Z",
  "respond_by": "2026-10-28T20:01:43.07574Z",
  "messages": [
    {
      "id": "63922b23-cecb-4541-a211-d8a07d3994d6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "0bbb8e6d-3079-450b-8e6e-63faa0b84096",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:01:43.077349Z",
      "attachments": [
        {
          "file_id": "c6fb3cbc-7953-4826-8ec1-d92f00eeea93",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "7cc81fe3-4fd6-4e07-a274-2e19a4648ff8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:01:45.066294Z",
      "attachments": [
        {
          "file_id": "c5d7e894-19d0-474c-b6ae-b7b3148b511a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/247c9067-cc35-4f5a-9e64-ae69369fd315/attachments/c5d7e894-19d0-474c-b6ae-b7b3148b511a` → **200**

Done: support case 247c9067-cc35-4f5a-9e64-ae69369fd315, rider attachment c6fb3cbc-7953-4826-8ec1-d92f00eeea93, operator attachment c5d7e894-19d0-474c-b6ae-b7b3148b511a.

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
  "session_id": "f439b48f-fa2a-4f78-9ec3-0980b70d7a06",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQyMDUsImlhdCI6MTc5MzIwMzMwNSwianRpIjoiZTBhMjY4YjQtNTFmYi00NjM0LTkyZmItMWY2MjIzMWMyM2E3Iiwic2lkIjoiZjQzOWI0OGYtZmEyYS00Zjc4LTllYzMtMDk4MGI3MGQ3YTA2In0.7k2WCqqVs0wTdSdHPTdOibSzFWQ2aSUVpvJhSPWMNUw",
  "access_expires_at": "2026-10-28T16:16:45.963186879Z",
  "refresh_token": "wPBMReVrmu-Yk_fa9NCvUsO_vbduGvS3uM1bK7Gzj4o",
  "refresh_expires_at": "2026-10-29T04:01:45.962655807Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16315"
}
```

```json
{
  "challenge_id": "9ecbe3db-82b0-4658-8a67-b9b994352707",
  "expires_at": "2026-10-28T16:06:46.236419522Z",
  "resend_available_at": "2026-10-28T16:01:47.236419522Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "422924",
  "sent_at": "2026-10-28T16:01:46.239140219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ecbe3db-82b0-4658-8a67-b9b994352707",
  "code": "422924",
  "device_ref": "sandbox-16315"
}
```

```json
{
  "session_id": "dee85bb0-4d5d-4dcf-a0b3-2c6c3fd900ef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDIwNiwiaWF0IjoxNzkzMjAzMzA2LCJqdGkiOiI1NWVjYjBiMS1hOTY3LTQ3NjUtYjZjYS0xYzhlZWIxOGY3MTQiLCJzaWQiOiJkZWU4NWJiMC00ZDVkLTRkY2YtYTBiMy0yYzZjM2ZkOTAwZWYifQ.uUcc12bVencVl2XFoqn9eMgzcsiMa7J06BMGDbH1GjQ",
  "access_expires_at": "2026-10-28T16:16:46.526259848Z",
  "refresh_token": "w2yItdGsiKugeJeWBU6GQ8zpFANIX7idvIRVHxsgtXM",
  "refresh_expires_at": "2026-11-27T16:01:46.525672632Z",
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
      "actor_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:01:34.923108Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T16:01:36.326367Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "d5a656e5-a44a-4243-9acb-aec55d894cd1",
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
  "device_ref": "sandbox-10531"
}
```

```json
{
  "challenge_id": "b648a1f7-fd73-4c8c-a496-fe57374399a7",
  "expires_at": "2026-10-28T16:06:47.594285156Z",
  "resend_available_at": "2026-10-28T16:01:48.594285156Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "403561",
  "sent_at": "2026-10-28T16:01:47.59653041Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b648a1f7-fd73-4c8c-a496-fe57374399a7",
  "code": "403561",
  "device_ref": "sandbox-10531"
}
```

```json
{
  "session_id": "be85e61a-0d09-49f3-86f2-f2716ca6b5cb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDIwNywiaWF0IjoxNzkzMjAzMzA3LCJqdGkiOiJlMDk3N2QxMy1jMDJiLTQ2NjctOWQ2OC0yN2U2YTUzY2M2MGQiLCJzaWQiOiJiZTg1ZTYxYS0wZDA5LTQ5ZjMtODZmMi1mMjcxNmNhNmI1Y2IifQ.WG6yHDTnCqqt448Fx3sWe5PMXql5Q9vQEUsHs1G5ESk",
  "access_expires_at": "2026-10-28T16:16:47.885354591Z",
  "refresh_token": "gc7aPhMpnMkoyIF7uoVYc6h3bNyL8B1Q7cuadIrfEeM",
  "refresh_expires_at": "2026-11-27T16:01:47.884524669Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "70e13bea-6bc2-4881-b8ad-6287785fb47e",
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
  "last_heartbeat_at": "2026-10-28T16:01:14.023929Z",
  "last_location_at": "2026-10-28T16:01:14.023929Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/70e13bea-6bc2-4881-b8ad-6287785fb47e/handover` → **200**

```json
{
  "command_id": "6d253ecd-6898-4133-b8d8-2e7994f58f4d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "70e13bea-6bc2-4881-b8ad-6287785fb47e",
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
  "last_heartbeat_at": "2026-10-28T16:01:14.023929Z",
  "last_location_at": "2026-10-28T16:01:14.023929Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/70e13bea-6bc2-4881-b8ad-6287785fb47e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:01:48Z",
    "sequence": 1793203308687
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "70e13bea-6bc2-4881-b8ad-6287785fb47e",
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
  "last_heartbeat_at": "2026-10-28T16:01:48.705975Z",
  "last_location_at": "2026-10-28T16:01:48.705975Z",
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
  "command_id": "47ed39fb-6fc9-4865-9b09-8004ba736108",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:01:49Z",
    "sequence": 1793203309230
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63ec598c-0b82-4619-9d44-11cc49b70417",
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
  "last_heartbeat_at": "2026-10-28T16:01:49.248484Z",
  "last_location_at": "2026-10-28T16:01:49.248484Z",
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
  "session_id": "ed138d5d-2ae3-460c-9e2a-4d9ccc946083",
  "subject": {
    "type": "STAFF",
    "id": "9b58bdac-6f96-4c48-81c0-c0464b00cbce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjU4YmRhYy02Zjk2LTRjNDgtODFjMC1jMDQ2NGIwMGNiY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDQyMDksImlhdCI6MTc5MzIwMzMwOSwianRpIjoiYWUwMTM0MGMtNGVmNy00YjhmLTk0OWEtOWI3ZjQyMTFmZTdmIiwic2lkIjoiZWQxMzhkNWQtMmFlMy00NjBjLTllMmEtNGQ5Y2NjOTQ2MDgzIn0.6ZVV7FlQMcmVDHyvo5HwkoGTuQd3k2gLvd4pK0RN3D8",
  "access_expires_at": "2026-10-28T16:16:49.807029821Z",
  "refresh_token": "6UWGyHe274fJb8RLkEOa_QsP9NLIxtnyE7MX1tNV5e0",
  "refresh_expires_at": "2026-10-29T04:01:49.806370709Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5c49e41c-07a6-42f7-9b43-8f1f5801ae08",
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
  "id": "566f654b-2db6-4b0d-8bdf-4f7a6183d2c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:06:50.076376Z",
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
  "command_id": "40172044-f242-48fa-b845-bcecc982c20a",
  "quote_id": "566f654b-2db6-4b0d-8bdf-4f7a6183d2c9",
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
  "id": "b560e78e-61f4-4ee2-97e8-7180ecb3a0f6",
  "short_number": 23,
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
  "created_at": "2026-10-28T16:01:50.351189Z",
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
    "id": "67cfd7c2-f79e-464f-bb88-adf1649b19bd",
    "order_id": "b560e78e-61f4-4ee2-97e8-7180ecb3a0f6",
    "expires_at": "2026-10-28T16:02:05.355172Z",
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

`POST /api/driver/v1/offers/67cfd7c2-f79e-464f-bb88-adf1649b19bd/accept` → **200**

```json
{
  "command_id": "ac1b6fb2-1c67-4745-82f4-bd520cfa9405"
}
```

```json
{
  "id": "770c7467-8d2d-4fee-bc26-9408a3c9a7fe",
  "order_id": "b560e78e-61f4-4ee2-97e8-7180ecb3a0f6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d826de55-2afa-4e2c-9b2e-ab88b46ebf76",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d826de55-2afa-4e2c-9b2e-ab88b46ebf76",
  "order_id": "b560e78e-61f4-4ee2-97e8-7180ecb3a0f6",
  "assignment_id": "770c7467-8d2d-4fee-bc26-9408a3c9a7fe",
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

`POST /api/driver/v1/work-sessions/63ec598c-0b82-4619-9d44-11cc49b70417/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:01:51Z",
    "sequence": 1793203311716
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63ec598c-0b82-4619-9d44-11cc49b70417",
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
  "last_heartbeat_at": "2026-10-28T16:01:51.736656Z",
  "last_location_at": "2026-10-28T16:01:51.736656Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d826de55-2afa-4e2c-9b2e-ab88b46ebf76/arrive` → **200**

```json
{
  "command_id": "fc86ce81-675f-49eb-8fcc-32d9f6d1922a",
  "expected_version": 0
}
```

```json
{
  "id": "d826de55-2afa-4e2c-9b2e-ab88b46ebf76",
  "order_id": "b560e78e-61f4-4ee2-97e8-7180ecb3a0f6",
  "assignment_id": "770c7467-8d2d-4fee-bc26-9408a3c9a7fe",
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
  "arrived_at": "2026-10-28T16:01:52.030579Z",
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

`POST /api/driver/v1/trips/d826de55-2afa-4e2c-9b2e-ab88b46ebf76/start` → **200**

```json
{
  "command_id": "75620c88-1e62-42dd-b789-22c939d83cd5",
  "expected_version": 1
}
```

```json
{
  "id": "d826de55-2afa-4e2c-9b2e-ab88b46ebf76",
  "order_id": "b560e78e-61f4-4ee2-97e8-7180ecb3a0f6",
  "assignment_id": "770c7467-8d2d-4fee-bc26-9408a3c9a7fe",
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
  "arrived_at": "2026-10-28T16:01:52.030579Z",
  "started_at": "2026-10-28T16:01:52.335388Z",
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

`POST /api/driver/v1/trips/d826de55-2afa-4e2c-9b2e-ab88b46ebf76/complete` → **200**

```json
{
  "command_id": "a45dcee1-4a52-44bc-868e-46b1aa2adec6",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:01:52Z",
  "cash_received": true
}
```

```json
{
  "id": "d826de55-2afa-4e2c-9b2e-ab88b46ebf76",
  "order_id": "b560e78e-61f4-4ee2-97e8-7180ecb3a0f6",
  "assignment_id": "770c7467-8d2d-4fee-bc26-9408a3c9a7fe",
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
  "arrived_at": "2026-10-28T16:01:52.030579Z",
  "started_at": "2026-10-28T16:01:52.335388Z",
  "completed_at": "2026-10-28T16:01:52.645378Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/b560e78e-61f4-4ee2-97e8-7180ecb3a0f6` → **200**

```json
{
  "id": "b560e78e-61f4-4ee2-97e8-7180ecb3a0f6",
  "short_number": 23,
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
    "id": "770c7467-8d2d-4fee-bc26-9408a3c9a7fe",
    "order_id": "b560e78e-61f4-4ee2-97e8-7180ecb3a0f6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d826de55-2afa-4e2c-9b2e-ab88b46ebf76",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:01:50.351189Z",
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
  "session_id": "70e13bea-6bc2-4881-b8ad-6287785fb47e",
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
  "last_heartbeat_at": "2026-10-28T16:01:48.705975Z",
  "last_location_at": "2026-10-28T16:01:48.705975Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/70e13bea-6bc2-4881-b8ad-6287785fb47e/close` → **200**

```json
{
  "command_id": "9444f6f8-083d-4f0a-aa94-1487e96cbb34",
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
  "session_id": "63ec598c-0b82-4619-9d44-11cc49b70417",
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
  "last_heartbeat_at": "2026-10-28T16:01:51.736656Z",
  "last_location_at": "2026-10-28T16:01:51.736656Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/63ec598c-0b82-4619-9d44-11cc49b70417/close` → **200**

```json
{
  "command_id": "b55794bc-ae80-43d5-8eff-d37c5eaedb79",
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

Done: terminal order b560e78e-61f4-4ee2-97e8-7180ecb3a0f6 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26959"
}
```

```json
{
  "challenge_id": "350125a3-a9c7-4874-bd77-e19cb3be8ee7",
  "expires_at": "2026-10-28T16:06:57.606237509Z",
  "resend_available_at": "2026-10-28T16:01:58.606237509Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "920377",
  "sent_at": "2026-10-28T16:01:57.608790786Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "350125a3-a9c7-4874-bd77-e19cb3be8ee7",
  "code": "920377",
  "device_ref": "sandbox-26959"
}
```

```json
{
  "session_id": "2365f90c-26fd-4c5c-8ce4-28bcc9829fc6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDIxNywiaWF0IjoxNzkzMjAzMzE3LCJqdGkiOiI4YTVjMTkxNS02YjZiLTQ3YjItOThmNS0zNzgyMTc1OGZiZWUiLCJzaWQiOiIyMzY1ZjkwYy0yNmZkLTRjNWMtOGNlNC0yOGJjYzk4MjlmYzYifQ.ZpSKIIlGZHrxGB7YyG_CNcwu6EuXdlqZtILl8mtX8Fw",
  "access_expires_at": "2026-10-28T16:16:57.907026298Z",
  "refresh_token": "gikHDSNix0lELd3ec9UVSR9gRZT8yiGJlV5QVLTGASw",
  "refresh_expires_at": "2026-11-27T16:01:57.906460742Z",
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
  "device_ref": "sandbox-17144"
}
```

```json
{
  "challenge_id": "63becbc4-732b-4a28-a31d-75a3295d7fae",
  "expires_at": "2026-10-28T16:06:58.442683834Z",
  "resend_available_at": "2026-10-28T16:01:59.442683834Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "337322",
  "sent_at": "2026-10-28T16:01:58.445013294Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63becbc4-732b-4a28-a31d-75a3295d7fae",
  "code": "337322",
  "device_ref": "sandbox-17144"
}
```

```json
{
  "session_id": "f6af93e1-e66e-48d2-826f-dc445cf34069",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDIxOCwiaWF0IjoxNzkzMjAzMzE4LCJqdGkiOiJlNDM3ZDMwMC05MTQ1LTQ5MmYtYjRiNi0xYzA2ZjZlYTg1NDAiLCJzaWQiOiJmNmFmOTNlMS1lNjZlLTQ4ZDItODI2Zi1kYzQ0NWNmMzQwNjkifQ.0HqrUVI_kjtzRtpkxnmZUGzjbosJ1ZDoDyIFEhURrDU",
  "access_expires_at": "2026-10-28T16:16:58.728843779Z",
  "refresh_token": "nHhGqWesPN9_1eE4U6lrAew8dLWinQhuZ8m7KRjbOjM",
  "refresh_expires_at": "2026-11-27T16:01:58.728286842Z",
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
  "device_ref": "sandbox-1197"
}
```

```json
{
  "challenge_id": "345354da-d8c4-44fe-be61-160ecd47ffe1",
  "expires_at": "2026-10-28T16:06:59.261661467Z",
  "resend_available_at": "2026-10-28T16:02:00.261661467Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "733919",
  "sent_at": "2026-10-28T16:01:59.263984645Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "345354da-d8c4-44fe-be61-160ecd47ffe1",
  "code": "733919",
  "device_ref": "sandbox-1197"
}
```

```json
{
  "session_id": "362295e2-e7a0-4738-9265-9415b226ce88",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNDIxOSwiaWF0IjoxNzkzMjAzMzE5LCJqdGkiOiI4MjM0ZTk4OC1lYzY4LTRmNGUtYTYwYS0zY2U3YTI0MDAxNmIiLCJzaWQiOiIzNjIyOTVlMi1lN2EwLTQ3MzgtOTI2NS05NDE1YjIyNmNlODgifQ.tECuCpBE13NYytAHL8OA7EuUGHcZblilp4gbWl3iArc",
  "access_expires_at": "2026-10-28T16:16:59.554760851Z",
  "refresh_token": "CX6xhr8IfAYCnj554kyyjNOEYM9tWVg-nkotKAyMQr0",
  "refresh_expires_at": "2026-11-27T16:01:59.554243695Z",
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
  "phone": "+380695001974",
  "device_ref": "sandbox-29891"
}
```

```json
{
  "challenge_id": "e1524895-99e8-4e4e-8f28-a2ae10850385",
  "expires_at": "2026-10-28T16:07:00.073684141Z",
  "resend_available_at": "2026-10-28T16:02:01.073684141Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380695001974` → **200**

```json
{
  "phone": "+380695001974",
  "audience": "CLIENT",
  "code": "038843",
  "sent_at": "2026-10-28T16:02:00.07580411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1524895-99e8-4e4e-8f28-a2ae10850385",
  "code": "038843",
  "device_ref": "sandbox-29891"
}
```

```json
{
  "session_id": "8c0e56af-aa19-4983-bb16-4eb6697d10c4",
  "subject": {
    "type": "CLIENT",
    "id": "1e31b4d1-6483-4667-b85a-b3d901151050"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZTMxYjRkMS02NDgzLTQ2NjctYjg1YS1iM2Q5MDExNTEwNTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA0MjIwLCJpYXQiOjE3OTMyMDMzMjAsImp0aSI6IjE5NzRjNGVlLWM3ZjgtNGQ5NS05YzRhLThjNTFhZTc0MDk3OSIsInNpZCI6IjhjMGU1NmFmLWFhMTktNDk4My1iYjE2LTRlYjY2OTdkMTBjNCJ9.0qyAx4blkt4OhY5TJLdB0T43w3CV3czdKqQpleUKLls",
  "access_expires_at": "2026-10-28T16:17:00.363488678Z",
  "refresh_token": "pkBWvnHW63WvINv6upRGXgKRvSic1EHqpStaJk30S2g",
  "refresh_expires_at": "2026-11-27T16:02:00.362921519Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4f184109-c24f-43f1-8972-3fef8ba93374",
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
  "id": "bffce7cd-5e1c-4431-864f-a257f6a42700",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:07:00.638405Z",
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
  "command_id": "f2d671c5-0c0c-4b01-a85a-e999df44e138",
  "quote_id": "bffce7cd-5e1c-4431-864f-a257f6a42700",
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
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
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
  "blizz_orders_total": 24,
  "blizz_orders_cancelled_total": 13,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 15,
  "blizz_dispatch_assigned_seconds_count": 14,
  "blizz_offers_total": 17,
  "blizz_dispatch_excluded_total": 7,
  "blizz_sms_sent_total": 63
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 14
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 11.516905609
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 2.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 15
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.133935567
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 14.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 16.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 3.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 56.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/b865355c-073f-43c2-8b34-93cfefa29f17` → **200**

```json
{
  "id": "b865355c-073f-43c2-8b34-93cfefa29f17",
  "short_number": 24,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1e31b4d1-6483-4667-b85a-b3d901151050",
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
  "created_at": "2026-10-28T16:02:00.918716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
