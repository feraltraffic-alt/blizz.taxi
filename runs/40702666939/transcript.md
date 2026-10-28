# Sandbox transcript (2026-10-28T14:07:16Z, df0545f)

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
  "correlation_id": "4c96866b-957d-47d1-baed-596ca1702b31"
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
  "session_id": "5f6cd6e7-2b97-4c57-9281-0db26d17b390",
  "subject": {
    "type": "STAFF",
    "id": "5c66918c-b463-4f23-a2d5-468e3a657090"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzY2OTE4Yy1iNDYzLTRmMjMtYTJkNS00NjhlM2E2NTcwOTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTczNDUsImlhdCI6MTc5MzE5NjQ0NSwianRpIjoiM2M2YTEzNGYtNDg3NS00MzRhLWI2OTktN2ZiMmQ3ZDc5M2Q2Iiwic2lkIjoiNWY2Y2Q2ZTctMmI5Ny00YzU3LTkyODEtMGRiMjZkMTdiMzkwIn0._oVQY-CBJ-WTJFiCWufRVOxe5b8p6avSTr_tUwAjUWk",
  "access_expires_at": "2026-10-28T14:22:25.307372261Z",
  "refresh_token": "pDE4idamKy-jBKoD2Ajjz2otQLHe_icG-reCuCFc8GQ",
  "refresh_expires_at": "2026-10-29T02:07:25.305239915Z",
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
  "session_id": "7c487f94-ab31-4122-abd3-03184bccdafe",
  "subject": {
    "type": "STAFF",
    "id": "5c66918c-b463-4f23-a2d5-468e3a657090"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzY2OTE4Yy1iNDYzLTRmMjMtYTJkNS00NjhlM2E2NTcwOTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTczNDYsImlhdCI6MTc5MzE5NjQ0NiwianRpIjoiMjVhYjZiYmItMjQ0NS00OWE1LWE5YmUtOTY1Yzg2NmFjNzZiIiwic2lkIjoiN2M0ODdmOTQtYWIzMS00MTIyLWFiZDMtMDMxODRiY2NkYWZlIn0.FQzTkTrj03iy5yNsogEoY78z9SDXCRu944HFOUrOqVk",
  "access_expires_at": "2026-10-28T14:22:26.844722532Z",
  "refresh_token": "K-ubVhPCT68WyjffNOFUuozthLYVh-vG2SdH6jG5DxA",
  "refresh_expires_at": "2026-10-29T02:07:26.84372708Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "d7f7e42c-3910-4946-9bbf-c2928e153e7b",
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
  "id": "79254bb0-528a-4727-85d3-f8841c1dfa52",
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
  "created_by": "5c66918c-b463-4f23-a2d5-468e3a657090",
  "created_at": "2026-10-28T14:07:27.153758Z",
  "updated_at": "2026-10-28T14:07:27.153758Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634356394",
  "device_ref": "sandbox-26950"
}
```

```json
{
  "challenge_id": "2db7ce0f-273d-4e77-a750-242c2e2f4ac1",
  "expires_at": "2026-10-28T14:12:27.455525091Z",
  "resend_available_at": "2026-10-28T14:07:28.455525091Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634356394` → **200**

```json
{
  "phone": "+380634356394",
  "audience": "CLIENT",
  "code": "999039",
  "sent_at": "2026-10-28T14:07:27.474813129Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2db7ce0f-273d-4e77-a750-242c2e2f4ac1",
  "code": "999039",
  "device_ref": "sandbox-26950"
}
```

```json
{
  "session_id": "d4361126-8ce6-4ac8-bfd9-250853fafcf2",
  "subject": {
    "type": "CLIENT",
    "id": "6537fff5-8600-4a70-96c1-a78d871dc1e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTM3ZmZmNS04NjAwLTRhNzAtOTZjMS1hNzhkODcxZGMxZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3MzQ3LCJpYXQiOjE3OTMxOTY0NDcsImp0aSI6Ijc0MTgxOWQxLTU4MGYtNDRiZS05NWJkLWQzOWZkNTkxYzU5YyIsInNpZCI6ImQ0MzYxMTI2LThjZTYtNGFjOC1iZmQ5LTI1MDg1M2ZhZmNmMiJ9.8pc0FQrGNEnEVDCLOmvIMS4mbnhaaMhwyuhIJMI5EdA",
  "access_expires_at": "2026-10-28T14:22:27.795556543Z",
  "refresh_token": "_BLZGiJvM896IsQEP9doJ66ZX0Afd1dhzCYLQMoiBgI",
  "refresh_expires_at": "2026-11-27T14:07:27.794499877Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634356394` → **200**

```json
{
  "client_id": "6537fff5-8600-4a70-96c1-a78d871dc1e2"
}
```

`POST /api/admin/v1/rider-wallets/6537fff5-8600-4a70-96c1-a78d871dc1e2/top-ups` → **201**

```json
{
  "command_id": "79d5e3c2-1603-4d46-bf41-3b0fee3c4dd7",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "6537fff5-8600-4a70-96c1-a78d871dc1e2",
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
      "id": "0e42ebda-6207-4abe-bc48-f47a29e21cef",
      "at": "2026-10-28T14:07:28.363849Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "5c66918c-b463-4f23-a2d5-468e3a657090",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8ec89b13-df5f-4303-ba53-dcee12054364",
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
  "id": "66a81f96-e886-44b0-a73f-b87d5e46c980",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:12:28.748716Z",
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
      "id": "79254bb0-528a-4727-85d3-f8841c1dfa52",
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
  "device_ref": "sandbox-18570"
}
```

```json
{
  "challenge_id": "de17bc09-910c-4015-ad00-9f5ddde151cc",
  "expires_at": "2026-10-28T14:12:29.059265296Z",
  "resend_available_at": "2026-10-28T14:07:30.059265296Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "818155",
  "sent_at": "2026-10-28T14:07:29.063795047Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de17bc09-910c-4015-ad00-9f5ddde151cc",
  "code": "818155",
  "device_ref": "sandbox-18570"
}
```

```json
{
  "session_id": "46c88e4a-e0f9-4361-81f4-d42515d7d9fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzM0OSwiaWF0IjoxNzkzMTk2NDQ5LCJqdGkiOiJjMGRhN2Q1YS03MzBkLTQzMDMtODVmNy1mMDRlZDZmYmIwZWUiLCJzaWQiOiI0NmM4OGU0YS1lMGY5LTQzNjEtODFmNC1kNDI1MTVkN2Q5ZmUifQ.cX7u41Iv8BRbLDvaR9Q_LOdIQSgL3LmV4D0VxUdC0Lo",
  "access_expires_at": "2026-10-28T14:22:29.367804408Z",
  "refresh_token": "p_7jW5qi_hw8NAVz6YUPGbAZqnF-HHkHQrO3e17t_NQ",
  "refresh_expires_at": "2026-11-27T14:07:29.366731539Z",
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
  "command_id": "1e010de9-ba5c-4537-9075-6a43b9ca4ff3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:07:29Z",
    "sequence": 1793196449940
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3269299b-a6e3-414a-b981-c863640861ce",
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
  "last_heartbeat_at": "2026-10-28T14:07:29.983416Z",
  "last_location_at": "2026-10-28T14:07:29.983416Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "30c1fc7c-8879-4257-920e-f4a32597af5c",
  "quote_id": "66a81f96-e886-44b0-a73f-b87d5e46c980",
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
  "id": "60be6372-0a62-4eb5-81ce-252997c433dc",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6537fff5-8600-4a70-96c1-a78d871dc1e2",
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
  "created_at": "2026-10-28T14:07:30.327618Z",
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
  "client_id": "6537fff5-8600-4a70-96c1-a78d871dc1e2",
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
      "id": "0e42ebda-6207-4abe-bc48-f47a29e21cef",
      "at": "2026-10-28T14:07:28.363849Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "5c66918c-b463-4f23-a2d5-468e3a657090",
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
    "id": "23060443-33af-4e03-9385-679cd5a01393",
    "order_id": "60be6372-0a62-4eb5-81ce-252997c433dc",
    "expires_at": "2026-10-28T14:07:45.345077Z",
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

`POST /api/driver/v1/offers/23060443-33af-4e03-9385-679cd5a01393/accept` → **200**

```json
{
  "command_id": "aa5e4f92-4bd7-4901-98e6-5a092a174f57"
}
```

```json
{
  "id": "49e8eac6-39c2-49b9-8009-4b4f907b1933",
  "order_id": "60be6372-0a62-4eb5-81ce-252997c433dc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "011fd79e-51bc-48d8-8cdb-8c0c3c8ff486",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "011fd79e-51bc-48d8-8cdb-8c0c3c8ff486",
  "order_id": "60be6372-0a62-4eb5-81ce-252997c433dc",
  "assignment_id": "49e8eac6-39c2-49b9-8009-4b4f907b1933",
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

`POST /api/driver/v1/work-sessions/3269299b-a6e3-414a-b981-c863640861ce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:07:31Z",
    "sequence": 1793196451757
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3269299b-a6e3-414a-b981-c863640861ce",
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
  "last_heartbeat_at": "2026-10-28T14:07:31.78228Z",
  "last_location_at": "2026-10-28T14:07:31.78228Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/011fd79e-51bc-48d8-8cdb-8c0c3c8ff486/arrive` → **200**

```json
{
  "command_id": "7fda6898-7ebb-41ec-93ae-777c36491a40",
  "expected_version": 0
}
```

```json
{
  "id": "011fd79e-51bc-48d8-8cdb-8c0c3c8ff486",
  "order_id": "60be6372-0a62-4eb5-81ce-252997c433dc",
  "assignment_id": "49e8eac6-39c2-49b9-8009-4b4f907b1933",
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
  "arrived_at": "2026-10-28T14:07:32.070458Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/011fd79e-51bc-48d8-8cdb-8c0c3c8ff486/start` → **200**

```json
{
  "command_id": "5db83bdd-f7c6-4fac-97a7-1591dd3ec1d0",
  "expected_version": 1
}
```

```json
{
  "id": "011fd79e-51bc-48d8-8cdb-8c0c3c8ff486",
  "order_id": "60be6372-0a62-4eb5-81ce-252997c433dc",
  "assignment_id": "49e8eac6-39c2-49b9-8009-4b4f907b1933",
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
  "arrived_at": "2026-10-28T14:07:32.070458Z",
  "started_at": "2026-10-28T14:07:32.382284Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/011fd79e-51bc-48d8-8cdb-8c0c3c8ff486/complete` → **200**

```json
{
  "command_id": "b7898679-a632-49a3-8a0b-69276985fe95",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:07:32Z",
  "cash_received": true
}
```

```json
{
  "id": "011fd79e-51bc-48d8-8cdb-8c0c3c8ff486",
  "order_id": "60be6372-0a62-4eb5-81ce-252997c433dc",
  "assignment_id": "49e8eac6-39c2-49b9-8009-4b4f907b1933",
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
  "arrived_at": "2026-10-28T14:07:32.070458Z",
  "started_at": "2026-10-28T14:07:32.382284Z",
  "completed_at": "2026-10-28T14:07:32.697534Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "6537fff5-8600-4a70-96c1-a78d871dc1e2",
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
      "id": "86599f83-e451-4ab8-90bd-2e4bb014c996",
      "at": "2026-10-28T14:07:33.22965Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "60be6372-0a62-4eb5-81ce-252997c433dc"
    },
    {
      "id": "0e42ebda-6207-4abe-bc48-f47a29e21cef",
      "at": "2026-10-28T14:07:28.363849Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "5c66918c-b463-4f23-a2d5-468e3a657090",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/79254bb0-528a-4727-85d3-f8841c1dfa52/archive` → **200**

```json
{
  "command_id": "6ae60056-28ee-497c-a776-b4b74542a2e3",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "79254bb0-528a-4727-85d3-f8841c1dfa52",
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
  "created_by": "5c66918c-b463-4f23-a2d5-468e3a657090",
  "created_at": "2026-10-28T14:07:27.153758Z",
  "updated_at": "2026-10-28T14:07:36.28492Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3269299b-a6e3-414a-b981-c863640861ce",
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
  "last_heartbeat_at": "2026-10-28T14:07:31.78228Z",
  "last_location_at": "2026-10-28T14:07:31.78228Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3269299b-a6e3-414a-b981-c863640861ce/close` → **200**

```json
{
  "command_id": "987db01d-9741-4b70-a7d2-5a7f47b19cae",
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

Done: order 60be6372-0a62-4eb5-81ce-252997c433dc.

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
  "session_id": "1f337196-f7d8-48af-96cb-7dcd3983153e",
  "subject": {
    "type": "STAFF",
    "id": "5c66918c-b463-4f23-a2d5-468e3a657090"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzY2OTE4Yy1iNDYzLTRmMjMtYTJkNS00NjhlM2E2NTcwOTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTczNTcsImlhdCI6MTc5MzE5NjQ1NywianRpIjoiOWEyN2NhMTktZGUzZC00NDdlLThhMjMtNTIwMmIwNmUxYTg1Iiwic2lkIjoiMWYzMzcxOTYtZjdkOC00OGFmLTk2Y2ItN2RjZDM5ODMxNTNlIn0.dlqnEQzLHkDcPE4X3vxzMbnpTpLqjsCufq8ILgtTmU4",
  "access_expires_at": "2026-10-28T14:22:37.433628133Z",
  "refresh_token": "e7zYfpfDKobP0ez_wQbcBdtNskrd6n1QudxytFXz_cU",
  "refresh_expires_at": "2026-10-29T02:07:37.432669162Z",
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
  "command_id": "f0ace32d-9e50-42f1-940f-346d59ce02be",
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
  "session_id": "863d993c-41dd-4a66-b992-ff30b65094a6",
  "subject": {
    "type": "STAFF",
    "id": "5c66918c-b463-4f23-a2d5-468e3a657090"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzY2OTE4Yy1iNDYzLTRmMjMtYTJkNS00NjhlM2E2NTcwOTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTczNTgsImlhdCI6MTc5MzE5NjQ1OCwianRpIjoiNTU2NmY0MzItZDgzZi00YjNlLWIxN2ItMTJiNTUzODlhNTAxIiwic2lkIjoiODYzZDk5M2MtNDFkZC00YTY2LWI5OTItZmYzMGI2NTA5NGE2In0.hSnrKOPU6OTzSUfGVVxzXaEEEPGXrgkAfyKR2Cd0JqE",
  "access_expires_at": "2026-10-28T14:22:38.560670433Z",
  "refresh_token": "uDXMqq8tj8tEv1qh-yiYPeBF7uH4hyOxnovB5Z3cVbI",
  "refresh_expires_at": "2026-10-29T02:07:38.559806496Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.135267101",
    "linkedid": "1730052700.135267101",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676777069"
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
    "id": "1730052700.135267101",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "2adfff3f-997e-477d-9961-fba0f89ff923",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380676777069",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:07:38.828275Z",
      "answered_at": null,
      "ended_at": "2026-10-28T14:07:38.853089Z",
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
    "id": "1730052600.184426461",
    "linkedid": "1730052600.184426461",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676777069"
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
      "id": "21ac44f3-c1ee-47ca-99bb-9cf103595446",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676777069",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:07:39.173551Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/21ac44f3-c1ee-47ca-99bb-9cf103595446/answer` → **200**

```json
{
  "command_id": "e74b6b1d-0cbe-4203-a88d-dfe74abf93b2"
}
```

```json
{
  "id": "21ac44f3-c1ee-47ca-99bb-9cf103595446",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676777069",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5c66918c-b463-4f23-a2d5-468e3a657090",
  "order_ids": [],
  "started_at": "2026-10-28T14:07:39.173551Z",
  "answered_at": "2026-10-28T14:07:39.480895Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.184426461",
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
    "id": "1730052600.184426461",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "21ac44f3-c1ee-47ca-99bb-9cf103595446",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676777069",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5c66918c-b463-4f23-a2d5-468e3a657090",
      "order_ids": [],
      "started_at": "2026-10-28T14:07:39.173551Z",
      "answered_at": "2026-10-28T14:07:39.480895Z",
      "ended_at": "2026-10-28T14:07:39.789695Z",
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
      "id": "21ac44f3-c1ee-47ca-99bb-9cf103595446",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676777069",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5c66918c-b463-4f23-a2d5-468e3a657090",
      "order_ids": [],
      "started_at": "2026-10-28T14:07:39.173551Z",
      "answered_at": "2026-10-28T14:07:39.480895Z",
      "ended_at": "2026-10-28T14:07:39.789695Z",
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
      "id": "21ac44f3-c1ee-47ca-99bb-9cf103595446",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676777069",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5c66918c-b463-4f23-a2d5-468e3a657090",
      "order_ids": [],
      "started_at": "2026-10-28T14:07:39.173551Z",
      "answered_at": "2026-10-28T14:07:39.480895Z",
      "ended_at": "2026-10-28T14:07:39.789695Z",
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
      "id": "21ac44f3-c1ee-47ca-99bb-9cf103595446",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676777069",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5c66918c-b463-4f23-a2d5-468e3a657090",
      "order_ids": [],
      "started_at": "2026-10-28T14:07:39.173551Z",
      "answered_at": "2026-10-28T14:07:39.480895Z",
      "ended_at": "2026-10-28T14:07:39.789695Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:07:45.994538Z"
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
      "id": "21ac44f3-c1ee-47ca-99bb-9cf103595446",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676777069",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5c66918c-b463-4f23-a2d5-468e3a657090",
      "order_ids": [],
      "started_at": "2026-10-28T14:07:39.173551Z",
      "answered_at": "2026-10-28T14:07:39.480895Z",
      "ended_at": "2026-10-28T14:07:39.789695Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:07:45.994538Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/21ac44f3-c1ee-47ca-99bb-9cf103595446/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/21ac44f3-c1ee-47ca-99bb-9cf103595446/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=21ac44f3-c1ee-47ca-99bb-9cf103595446` → **200**

```json
{
  "changes": [
    {
      "id": "447aa805-d897-4ec1-9d33-5a30f02c3cd3",
      "occurred_at": "2026-10-28T14:07:47.305978Z",
      "actor_type": "STAFF",
      "actor_id": "5c66918c-b463-4f23-a2d5-468e3a657090",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "21ac44f3-c1ee-47ca-99bb-9cf103595446",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"9c1e27dc-fc69-41a9-8ad4-20844beecaa5\", \"order_ids\": []}",
      "correlation_id": "958a850a-9b20-4dcf-9f43-d073a067816c"
    },
    {
      "id": "b3584796-3687-433f-8537-11053dbff23f",
      "occurred_at": "2026-10-28T14:07:47.268583Z",
      "actor_type": "STAFF",
      "actor_id": "5c66918c-b463-4f23-a2d5-468e3a657090",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "21ac44f3-c1ee-47ca-99bb-9cf103595446",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"9c1e27dc-fc69-41a9-8ad4-20844beecaa5\", \"order_ids\": []}",
      "correlation_id": "7603ed1b-fcde-4eba-9681-08af3c973f4e"
    }
  ]
}
```

Done: call 21ac44f3-c1ee-47ca-99bb-9cf103595446 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25063"
}
```

```json
{
  "challenge_id": "dc7773a7-2331-4c65-87ca-ec40d06e2acb",
  "expires_at": "2026-10-28T14:12:47.674453681Z",
  "resend_available_at": "2026-10-28T14:07:48.674453681Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "221032",
  "sent_at": "2026-10-28T14:07:47.679038647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc7773a7-2331-4c65-87ca-ec40d06e2acb",
  "code": "221032",
  "device_ref": "sandbox-25063"
}
```

```json
{
  "session_id": "54fc8ebc-4b3a-429b-89c6-f163cf2aafe9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzM2OCwiaWF0IjoxNzkzMTk2NDY4LCJqdGkiOiJiNDFlZWNlZS1mY2E4LTRlMDQtYjcxMy1hZmYxNjg0ZTk2YTAiLCJzaWQiOiI1NGZjOGViYy00YjNhLTQyOWItODljNi1mMTYzY2YyYWFmZTkifQ.I75Pp2sbgrLVsFyCS9r4tZDNxhwsClvK4eXUbIx13U4",
  "access_expires_at": "2026-10-28T14:22:48.002315579Z",
  "refresh_token": "U1ZjhI0_hMZ2xobMoKJjBtMsW6tX4ogBQDdG6KpIk2A",
  "refresh_expires_at": "2026-11-27T14:07:48.001440142Z",
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
  "command_id": "8a2bd07f-77a2-4f75-8e95-9d44b4df5578",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:07:48Z",
    "sequence": 1793196468533
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cb3b293-df06-4f0d-a79b-477296e01729",
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
  "last_heartbeat_at": "2026-10-28T14:07:48.554913Z",
  "last_location_at": "2026-10-28T14:07:48.554913Z",
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
  "session_id": "e2cfa7d3-5145-4f75-926e-b355b414c2a8",
  "subject": {
    "type": "STAFF",
    "id": "5c66918c-b463-4f23-a2d5-468e3a657090"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzY2OTE4Yy1iNDYzLTRmMjMtYTJkNS00NjhlM2E2NTcwOTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTczNjksImlhdCI6MTc5MzE5NjQ2OSwianRpIjoiM2I3ZTk2Y2UtODYxNS00NWVmLTg1OGEtNGQ5YWRkMDEzYWRkIiwic2lkIjoiZTJjZmE3ZDMtNTE0NS00Zjc1LTkyNmUtYjM1NWI0MTRjMmE4In0.k-I83Pmf3BR-wuXeu8-yevwvwsac86JJgGIWiylyHjI",
  "access_expires_at": "2026-10-28T14:22:49.134630496Z",
  "refresh_token": "rvh949lH79eD2VxLfgNGSHXGMV7oS1YJwKDACH78mX0",
  "refresh_expires_at": "2026-10-29T02:07:49.133976723Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ed65e43e-da72-4d6f-92cd-2cfbd89f6304",
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
  "id": "99044b5c-cb40-430c-9571-90468b28c187",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:12:49.412570Z",
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
  "command_id": "f674ac59-a7ed-4098-83d6-31ac276a1a81",
  "quote_id": "99044b5c-cb40-430c-9571-90468b28c187",
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
    "phone": "+380672262208"
  }
}
```

```json
{
  "id": "daebf213-e3e3-410d-bfc4-c1a191908f33",
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
  "created_at": "2026-10-28T14:07:49.709927Z",
  "caller": {
    "name": "Олена",
    "phone": "+380672262208"
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
    "id": "1e9e2e63-0319-4b8d-a8a4-696567500226",
    "order_id": "daebf213-e3e3-410d-bfc4-c1a191908f33",
    "expires_at": "2026-10-28T14:08:04.716372Z",
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

`POST /api/driver/v1/offers/1e9e2e63-0319-4b8d-a8a4-696567500226/accept` → **200**

```json
{
  "command_id": "6436842c-670e-4544-8d18-99851a39d715"
}
```

```json
{
  "id": "16bb5134-3b96-409e-8168-db35b8d0cf89",
  "order_id": "daebf213-e3e3-410d-bfc4-c1a191908f33",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "350fb169-330e-472d-9cfe-63228b1f2e0a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380672262208` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380672262208` → **200**

```json
[
  {
    "phone": "+380672262208",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:07:51.189805045Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672262208` → **200**

```json
[
  {
    "phone": "+380672262208",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:07:51.189805045Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380672262208` → **200**

```json
[
  {
    "phone": "+380672262208",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:07:51.189805045Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "350fb169-330e-472d-9cfe-63228b1f2e0a",
  "order_id": "daebf213-e3e3-410d-bfc4-c1a191908f33",
  "assignment_id": "16bb5134-3b96-409e-8168-db35b8d0cf89",
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
    "phone": "+380672262208"
  }
}
```

`POST /api/driver/v1/work-sessions/0cb3b293-df06-4f0d-a79b-477296e01729/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:07:51Z",
    "sequence": 1793196471934
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cb3b293-df06-4f0d-a79b-477296e01729",
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
  "last_heartbeat_at": "2026-10-28T14:07:51.955825Z",
  "last_location_at": "2026-10-28T14:07:51.955825Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/350fb169-330e-472d-9cfe-63228b1f2e0a/arrive` → **200**

```json
{
  "command_id": "f2619712-ec85-4244-9f11-da26a71cd153",
  "expected_version": 0
}
```

```json
{
  "id": "350fb169-330e-472d-9cfe-63228b1f2e0a",
  "order_id": "daebf213-e3e3-410d-bfc4-c1a191908f33",
  "assignment_id": "16bb5134-3b96-409e-8168-db35b8d0cf89",
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
  "arrived_at": "2026-10-28T14:07:52.239375Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380672262208"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380672262208` → **200**

```json
[
  {
    "phone": "+380672262208",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:07:51.189805045Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672262208` → **200**

```json
[
  {
    "phone": "+380672262208",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:07:51.189805045Z"
  },
  {
    "phone": "+380672262208",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:07:53.198073401Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672262208` → **200**

```json
[
  {
    "phone": "+380672262208",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:07:51.189805045Z"
  },
  {
    "phone": "+380672262208",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:07:53.198073401Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380672262208` → **200**

```json
[
  {
    "phone": "+380672262208",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:07:51.189805045Z"
  },
  {
    "phone": "+380672262208",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:07:53.198073401Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/350fb169-330e-472d-9cfe-63228b1f2e0a/start` → **200**

```json
{
  "command_id": "a702fbee-51e3-4e1b-a4f4-aa74bdd101f5",
  "expected_version": 1
}
```

```json
{
  "id": "350fb169-330e-472d-9cfe-63228b1f2e0a",
  "order_id": "daebf213-e3e3-410d-bfc4-c1a191908f33",
  "assignment_id": "16bb5134-3b96-409e-8168-db35b8d0cf89",
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
  "arrived_at": "2026-10-28T14:07:52.239375Z",
  "started_at": "2026-10-28T14:07:53.635367Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380672262208"
  }
}
```

`POST /api/driver/v1/trips/350fb169-330e-472d-9cfe-63228b1f2e0a/complete` → **200**

```json
{
  "command_id": "68c30cdd-f387-4364-ac28-f836d336ac41",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:07:53Z",
  "cash_received": true
}
```

```json
{
  "id": "350fb169-330e-472d-9cfe-63228b1f2e0a",
  "order_id": "daebf213-e3e3-410d-bfc4-c1a191908f33",
  "assignment_id": "16bb5134-3b96-409e-8168-db35b8d0cf89",
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
  "arrived_at": "2026-10-28T14:07:52.239375Z",
  "started_at": "2026-10-28T14:07:53.635367Z",
  "completed_at": "2026-10-28T14:07:53.927406Z",
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
  "session_id": "0cb3b293-df06-4f0d-a79b-477296e01729",
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
  "last_heartbeat_at": "2026-10-28T14:07:51.955825Z",
  "last_location_at": "2026-10-28T14:07:51.955825Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0cb3b293-df06-4f0d-a79b-477296e01729/close` → **200**

```json
{
  "command_id": "1018e8d8-ab92-46d3-8ae0-90ba0c924408",
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
  "phone": "+380630741211",
  "device_ref": "sandbox-14568"
}
```

```json
{
  "challenge_id": "be1009da-8b16-4093-91ff-9f4fa0f5e672",
  "expires_at": "2026-10-28T14:12:54.822948897Z",
  "resend_available_at": "2026-10-28T14:07:55.822948897Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630741211` → **200**

```json
{
  "phone": "+380630741211",
  "audience": "CLIENT",
  "code": "343261",
  "sent_at": "2026-10-28T14:07:54.826855052Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be1009da-8b16-4093-91ff-9f4fa0f5e672",
  "code": "343261",
  "device_ref": "sandbox-14568"
}
```

```json
{
  "session_id": "5727ed41-8335-4e67-b0bf-d7082025f149",
  "subject": {
    "type": "CLIENT",
    "id": "108f3142-b60f-456f-990a-e2b46115131d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDhmMzE0Mi1iNjBmLTQ1NmYtOTkwYS1lMmI0NjExNTEzMWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3Mzc1LCJpYXQiOjE3OTMxOTY0NzUsImp0aSI6ImIwM2QxMGI1LTUyZGQtNGY2OS1iZmVmLTllOTZhNDhjZDkwMCIsInNpZCI6IjU3MjdlZDQxLTgzMzUtNGU2Ny1iMGJmLWQ3MDgyMDI1ZjE0OSJ9.9sM9EpqGEJXW23_NcIU08F0e-gAIvGraOuU-ioSTnx4",
  "access_expires_at": "2026-10-28T14:22:55.119909531Z",
  "refresh_token": "CqmIt9pR9NFXzEYDGAUy4qHFg571H_O0BhXHsq4eGGM",
  "refresh_expires_at": "2026-11-27T14:07:55.118158386Z",
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
  "device_ref": "sandbox-32573"
}
```

```json
{
  "challenge_id": "07f7b00d-9c79-4e19-a3a0-91247512e158",
  "expires_at": "2026-10-28T14:12:55.650423548Z",
  "resend_available_at": "2026-10-28T14:07:56.650423548Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "554202",
  "sent_at": "2026-10-28T14:07:55.65387396Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07f7b00d-9c79-4e19-a3a0-91247512e158",
  "code": "554202",
  "device_ref": "sandbox-32573"
}
```

```json
{
  "session_id": "4960864e-3d74-4df1-a6ef-c5a458189386",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzM3NSwiaWF0IjoxNzkzMTk2NDc1LCJqdGkiOiJhYjk1Mzc0OC00OGQ4LTQ1YjYtYTM3Ni0wNmQyZmViNWEyNWQiLCJzaWQiOiI0OTYwODY0ZS0zZDc0LTRkZjEtYTZlZi1jNWE0NTgxODkzODYifQ.Gj1jOaw4ViNyJd_8Rp4TaQa9NR13PJ0a8MBuuz8fSTg",
  "access_expires_at": "2026-10-28T14:22:55.936077215Z",
  "refresh_token": "PhElUcLKpRjr-az06eA44oDwbfEbu-RpsoDvqs80SvM",
  "refresh_expires_at": "2026-11-27T14:07:55.935438037Z",
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
  "session_id": "38bbbcdc-db11-4b84-ac74-a969b3d0bae4",
  "subject": {
    "type": "STAFF",
    "id": "5c66918c-b463-4f23-a2d5-468e3a657090"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzY2OTE4Yy1iNDYzLTRmMjMtYTJkNS00NjhlM2E2NTcwOTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTczNzYsImlhdCI6MTc5MzE5NjQ3NiwianRpIjoiNTQyNzFmOTktNzQ0Ni00YzM0LTg5MGYtMzE4YzM4YmNkM2FjIiwic2lkIjoiMzhiYmJjZGMtZGIxMS00Yjg0LWFjNzQtYTk2OWIzZDBiYWU0In0.H-7ceO3G5QVSa61m_1Mh6Yk1qL8-uSHZRG2W3Ba6hc4",
  "access_expires_at": "2026-10-28T14:22:56.760590389Z",
  "refresh_token": "p58roqf4N_KM5q2GMzo3PAo-F5SlcKnaGtiISGsfan4",
  "refresh_expires_at": "2026-10-29T02:07:56.759828494Z",
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
  "session_id": "bf5df2dd-916f-4608-a211-a376d453f6c0",
  "subject": {
    "type": "STAFF",
    "id": "5c66918c-b463-4f23-a2d5-468e3a657090"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzY2OTE4Yy1iNDYzLTRmMjMtYTJkNS00NjhlM2E2NTcwOTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTczNzcsImlhdCI6MTc5MzE5NjQ3NywianRpIjoiZjk2ODlkMWQtZTRhOS00MWZkLWFkMDQtODBlYzYyOGEwZDc5Iiwic2lkIjoiYmY1ZGYyZGQtOTE2Zi00NjA4LWEyMTEtYTM3NmQ0NTNmNmMwIn0.Q6-IKXnWhboAja4cqH7rf30DBnuzAGdh3JqZESKj37c",
  "access_expires_at": "2026-10-28T14:22:57.322335663Z",
  "refresh_token": "HEGUOoby12PI5vG-alJo0McKqjhG6iDKPp2Fh3nH_hE",
  "refresh_expires_at": "2026-10-29T02:07:57.321641716Z",
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
  "command_id": "cdd55ba8-b908-489a-a31e-ca9d06bf1322",
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
  "id": "c2d026b1-8f81-4a47-b3db-579516bda59e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:12:57.868945Z",
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
  "command_id": "9441f49d-f799-427e-9b6b-48c807fbe100",
  "quote_id": "c2d026b1-8f81-4a47-b3db-579516bda59e",
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
  "id": "57550863-0504-4ee2-9939-85d48a1733a2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "108f3142-b60f-456f-990a-e2b46115131d",
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
  "created_at": "2026-10-28T14:07:58.151615Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57550863-0504-4ee2-9939-85d48a1733a2` → **200**

```json
{
  "id": "57550863-0504-4ee2-9939-85d48a1733a2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "108f3142-b60f-456f-990a-e2b46115131d",
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
  "created_at": "2026-10-28T14:07:58.151615Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/57550863-0504-4ee2-9939-85d48a1733a2/cancel` → **200**

```json
{
  "command_id": "e0633c3a-a9d2-4d88-9dba-d5c5df94b0f4",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "57550863-0504-4ee2-9939-85d48a1733a2",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "108f3142-b60f-456f-990a-e2b46115131d",
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
  "created_at": "2026-10-28T14:07:58.151615Z",
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
  "command_id": "e4efa62c-35ba-48cb-a958-bce77133ef34",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:07:59Z",
    "sequence": 1793196479299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0c133535-8085-49fc-83a0-a347e5904ee4",
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
  "last_heartbeat_at": "2026-10-28T14:07:59.319067Z",
  "last_location_at": "2026-10-28T14:07:59.319067Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-6560"
}
```

```json
{
  "challenge_id": "0f049057-988d-405e-8562-a4185d87a6e0",
  "expires_at": "2026-10-28T14:12:59.589619446Z",
  "resend_available_at": "2026-10-28T14:08:00.589619446Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "178333",
  "sent_at": "2026-10-28T14:07:59.593020015Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f049057-988d-405e-8562-a4185d87a6e0",
  "code": "178333",
  "device_ref": "sandbox-6560"
}
```

```json
{
  "session_id": "bde74522-b5ed-413c-b019-d23a000acdc1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzM3OSwiaWF0IjoxNzkzMTk2NDc5LCJqdGkiOiIyMWJmMTYwNi0xNjlhLTQ1NmEtOTM0NC01Y2QwZDZhYTdmNGQiLCJzaWQiOiJiZGU3NDUyMi1iNWVkLTQxM2MtYjAxOS1kMjNhMDAwYWNkYzEifQ.nbJIiXvnL4bHgacjSEplC8G8N7mFdhRK-SJPbJuht5c",
  "access_expires_at": "2026-10-28T14:22:59.890902528Z",
  "refresh_token": "5nWiznlSn1ZgMtAIfV5-oZN3gbMmJgYo5GsfD7u_TLQ",
  "refresh_expires_at": "2026-11-27T14:07:59.890230258Z",
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
  "command_id": "b6c6335f-741c-456c-85ee-93a5f243183b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:08:00Z",
    "sequence": 1793196480433
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d8b646d-10c7-4b1e-a10f-92d07d90aac5",
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
  "last_heartbeat_at": "2026-10-28T14:08:00.453549Z",
  "last_location_at": "2026-10-28T14:08:00.453549Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "317f1073-7e62-4fe5-b159-9b3cdaa6cb3a",
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
  "id": "03439eec-739c-4a63-b2dc-44818eeebbe3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:13:00.732178Z",
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
  "command_id": "c8d76ec7-c474-4ff9-beba-c2bd0a265fce",
  "quote_id": "03439eec-739c-4a63-b2dc-44818eeebbe3",
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
  "id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "108f3142-b60f-456f-990a-e2b46115131d",
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
  "created_at": "2026-10-28T14:08:01.021179Z",
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
    "id": "adc6d36b-a5e6-4638-8fba-eae749485fdb",
    "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
    "expires_at": "2026-10-28T14:08:16.025244Z",
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

`POST /api/driver/v1/offers/adc6d36b-a5e6-4638-8fba-eae749485fdb/accept` → **200**

```json
{
  "command_id": "cc9f5269-5e4b-45f3-b7e3-809a96eb8394"
}
```

```json
{
  "id": "aa5ccf4c-94f4-480c-a0ec-14516132b28c",
  "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "71763a4b-4d58-4363-b6dd-0c383a0990a9",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "71763a4b-4d58-4363-b6dd-0c383a0990a9",
  "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
  "assignment_id": "aa5ccf4c-94f4-480c-a0ec-14516132b28c",
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

`POST /api/driver/v1/trips/71763a4b-4d58-4363-b6dd-0c383a0990a9/cancel` → **200**

```json
{
  "command_id": "9d743ea5-a931-45eb-a14c-308aa236ba05",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "71763a4b-4d58-4363-b6dd-0c383a0990a9",
  "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
  "assignment_id": "aa5ccf4c-94f4-480c-a0ec-14516132b28c",
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

`GET /api/rider/v1/orders/5d13bf83-ebca-4305-a8c4-de0a2c3a19ce` → **200**

```json
{
  "id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "108f3142-b60f-456f-990a-e2b46115131d",
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
    "id": "aa5ccf4c-94f4-480c-a0ec-14516132b28c",
    "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "71763a4b-4d58-4363-b6dd-0c383a0990a9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:08:01.021179Z",
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
    "id": "8e38fd4c-77a2-47cd-aaf7-e5f83b10a37b",
    "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
    "expires_at": "2026-10-28T14:08:17.195294Z",
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

`POST /api/driver/v1/offers/8e38fd4c-77a2-47cd-aaf7-e5f83b10a37b/accept` → **200**

```json
{
  "command_id": "09922540-f290-4649-ae3c-d912b76075f3"
}
```

```json
{
  "id": "a66c1d08-63ff-44f9-9302-04f28caa90d8",
  "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "23e79ef9-c486-48c9-8244-48e9763f1346",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "23e79ef9-c486-48c9-8244-48e9763f1346",
  "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
  "assignment_id": "a66c1d08-63ff-44f9-9302-04f28caa90d8",
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

`POST /api/driver/v1/trips/23e79ef9-c486-48c9-8244-48e9763f1346/cancel` → **200**

```json
{
  "command_id": "799a6f81-9d27-4462-9297-9d55e529dc45",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "23e79ef9-c486-48c9-8244-48e9763f1346",
  "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
  "assignment_id": "a66c1d08-63ff-44f9-9302-04f28caa90d8",
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
    "id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:08:01.021179Z",
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
    "id": "57550863-0504-4ee2-9939-85d48a1733a2",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:07:58.151615Z",
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

`GET /api/operator/v1/orders/5d13bf83-ebca-4305-a8c4-de0a2c3a19ce/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:08:01.021862Z",
      "actor": {
        "type": "CLIENT",
        "id": "108f3142-b60f-456f-990a-e2b46115131d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
        "quote_id": "03439eec-739c-4a63-b2dc-44818eeebbe3",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "1158cb4d-ee52-4cbf-9d97-bcede2312611"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:08:01.024218Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
        "attempt_id": "dc91ede2-0f89-4638-a048-2a8f4dfecfe7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1158cb4d-ee52-4cbf-9d97-bcede2312611"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:08:01.032423Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "adc6d36b-a5e6-4638-8fba-eae749485fdb",
        "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "1158cb4d-ee52-4cbf-9d97-bcede2312611"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:08:01.625925Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "adc6d36b-a5e6-4638-8fba-eae749485fdb",
        "order_id": "5d13bf83-ebca-4305-a8c4-de0a2c3a19ce",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "aa5ccf4c-94f4-480c-a0ec-14516132b28c"
      },
      "correlation_id": "6bf5d59e-aad0-4898-8390-e463e7c4df2f"
```

Done: orders 57550863-0504-4ee2-9939-85d48a1733a2, 5d13bf83-ebca-4305-a8c4-de0a2c3a19ce.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735633781",
  "device_ref": "sandbox-11290"
}
```

```json
{
  "challenge_id": "a2c0ea51-a878-48b7-b3a1-242cac093e13",
  "expires_at": "2026-10-28T14:13:04.474465749Z",
  "resend_available_at": "2026-10-28T14:08:05.474465749Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735633781` → **200**

```json
{
  "phone": "+380735633781",
  "audience": "CLIENT",
  "code": "161129",
  "sent_at": "2026-10-28T14:08:04.477950375Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2c0ea51-a878-48b7-b3a1-242cac093e13",
  "code": "161129",
  "device_ref": "sandbox-11290"
}
```

```json
{
  "session_id": "a72c6fc7-e253-4278-ac8b-393554b6ef42",
  "subject": {
    "type": "CLIENT",
    "id": "05c4943c-e1fd-44b8-b8c2-9afbcea55f87"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNWM0OTQzYy1lMWZkLTQ0YjgtYjhjMi05YWZiY2VhNTVmODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3Mzg0LCJpYXQiOjE3OTMxOTY0ODQsImp0aSI6IjExNTIyNGM0LWE0ZGMtNDA3My04NjY5LTg2OTliYjQwMzgzNiIsInNpZCI6ImE3MmM2ZmM3LWUyNTMtNDI3OC1hYzhiLTM5MzU1NGI2ZWY0MiJ9.n9aHmxQtNjtg2PW3ueNjIxwDLpnuqjI8Pam20bOvGx8",
  "access_expires_at": "2026-10-28T14:23:04.793634295Z",
  "refresh_token": "Xat42x6V6JMzO4CihySqYh9sT6gMwHwcH3-W55Pm7S0",
  "refresh_expires_at": "2026-11-27T14:08:04.792936729Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "ffacece9-4d39-40b9-b957-4de00616f69c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "866a0c9c-0564-4f54-b8ec-9876dbfb5d76",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-866a0c9c-0564-4f54-b8ec-9876dbfb5d76",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a61ba5d25f11fbfe53c18565568688a2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=866a0c9c-0564-4f54-b8ec-9876dbfb5d76",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735633781"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=866a0c9c-0564-4f54-b8ec-9876dbfb5d76",
  "expires_at": "2026-10-28T14:38:05.068853Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/866a0c9c-0564-4f54-b8ec-9876dbfb5d76` → **200**

```json
{
  "id": "866a0c9c-0564-4f54-b8ec-9876dbfb5d76",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T14:38:05.068853Z",
  "card": {
    "id": "9a07a159-2b67-4bf2-a253-f853cc66c979",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8083",
    "card_type": "Visa",
    "created_at": "2026-10-28T14:08:05.363767Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "9a07a159-2b67-4bf2-a253-f853cc66c979",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8083",
      "card_type": "Visa",
      "created_at": "2026-10-28T14:08:05.363767Z"
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
  "device_ref": "sandbox-30299"
}
```

```json
{
  "challenge_id": "097febf1-8acc-417b-8305-594920452b75",
  "expires_at": "2026-10-28T14:13:05.910941034Z",
  "resend_available_at": "2026-10-28T14:08:06.910941034Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "837821",
  "sent_at": "2026-10-28T14:08:05.914686609Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "097febf1-8acc-417b-8305-594920452b75",
  "code": "837821",
  "device_ref": "sandbox-30299"
}
```

```json
{
  "session_id": "3639f097-37bb-4572-8ac7-08a912dc2252",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzM4NiwiaWF0IjoxNzkzMTk2NDg2LCJqdGkiOiI3NDNlZGEwMC01MzFlLTQxM2QtODQ1Yy1jNmE5NDUxMjA4ZDUiLCJzaWQiOiIzNjM5ZjA5Ny0zN2JiLTQ1NzItOGFjNy0wOGE5MTJkYzIyNTIifQ.GL78j85dBpSVpyPMb9bIHdSaksQwx9Q6XiLd7KmoGvY",
  "access_expires_at": "2026-10-28T14:23:06.205768959Z",
  "refresh_token": "pWPY4ypc6SXB6onJ5aBikd9m1enwnpYv1iOA6m7cwL8",
  "refresh_expires_at": "2026-11-27T14:08:06.204715306Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d8b646d-10c7-4b1e-a10f-92d07d90aac5",
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
  "last_heartbeat_at": "2026-10-28T14:08:00.453549Z",
  "last_location_at": "2026-10-28T14:08:00.453549Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d8b646d-10c7-4b1e-a10f-92d07d90aac5/handover` → **200**

```json
{
  "command_id": "f6398a81-0b46-4c5a-9e89-28099bac784b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d8b646d-10c7-4b1e-a10f-92d07d90aac5",
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
  "last_heartbeat_at": "2026-10-28T14:08:00.453549Z",
  "last_location_at": "2026-10-28T14:08:00.453549Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d8b646d-10c7-4b1e-a10f-92d07d90aac5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:08:07Z",
    "sequence": 1793196487198
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d8b646d-10c7-4b1e-a10f-92d07d90aac5",
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
  "last_heartbeat_at": "2026-10-28T14:08:07.039835Z",
  "last_location_at": "2026-10-28T14:08:07.039835Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "00e439ba-66ac-4596-b45a-ef4dc40e982f",
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
  "id": "8e5a2fb0-f051-4e8b-aa53-faacaa6025a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:13:07.320388Z",
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
  "command_id": "efff4f12-e80d-42ca-82eb-52da42aa6c46",
  "quote_id": "8e5a2fb0-f051-4e8b-aa53-faacaa6025a3",
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
  "id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "05c4943c-e1fd-44b8-b8c2-9afbcea55f87",
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
  "created_at": "2026-10-28T14:08:07.609432Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5c564e90-2cbb-4a3c-ba55-defdb954638d` → **200**

```json
{
  "id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "05c4943c-e1fd-44b8-b8c2-9afbcea55f87",
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
  "created_at": "2026-10-28T14:08:07.609432Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5c564e90-2cbb-4a3c-ba55-defdb954638d` → **200**

```json
{
  "id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "05c4943c-e1fd-44b8-b8c2-9afbcea55f87",
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
  "created_at": "2026-10-28T14:08:07.609432Z",
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
    "id": "2662ffb1-d1d2-477f-ae14-6a0c6717d2b3",
    "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
    "expires_at": "2026-10-28T14:08:23.494431Z",
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

`POST /api/driver/v1/offers/2662ffb1-d1d2-477f-ae14-6a0c6717d2b3/accept` → **200**

```json
{
  "command_id": "eeb19fdf-dbbb-474f-a4e7-c115513d2fde"
}
```

```json
{
  "id": "2abd2870-fa9d-4b84-9cd5-77983c7f628d",
  "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "41e6f4b6-0e99-4b08-b973-a0253c3e8aed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "41e6f4b6-0e99-4b08-b973-a0253c3e8aed",
  "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
  "assignment_id": "2abd2870-fa9d-4b84-9cd5-77983c7f628d",
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

`POST /api/driver/v1/work-sessions/7d8b646d-10c7-4b1e-a10f-92d07d90aac5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:08:10Z",
    "sequence": 1793196490292
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d8b646d-10c7-4b1e-a10f-92d07d90aac5",
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
  "last_heartbeat_at": "2026-10-28T14:08:10.312371Z",
  "last_location_at": "2026-10-28T14:08:10.312371Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/41e6f4b6-0e99-4b08-b973-a0253c3e8aed/arrive` → **200**

```json
{
  "command_id": "1caac63e-9f84-432a-8883-ec565040cb3b",
  "expected_version": 0
}
```

```json
{
  "id": "41e6f4b6-0e99-4b08-b973-a0253c3e8aed",
  "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
  "assignment_id": "2abd2870-fa9d-4b84-9cd5-77983c7f628d",
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
  "arrived_at": "2026-10-28T14:08:10.599629Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/41e6f4b6-0e99-4b08-b973-a0253c3e8aed/start` → **200**

```json
{
  "command_id": "39e66aa8-f01b-486d-bab6-0e0a66d29c48",
  "expected_version": 1
}
```

```json
{
  "id": "41e6f4b6-0e99-4b08-b973-a0253c3e8aed",
  "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
  "assignment_id": "2abd2870-fa9d-4b84-9cd5-77983c7f628d",
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
  "arrived_at": "2026-10-28T14:08:10.599629Z",
  "started_at": "2026-10-28T14:08:10.884024Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/41e6f4b6-0e99-4b08-b973-a0253c3e8aed/complete` → **200**

```json
{
  "command_id": "ea8fb26c-4c3f-4ddf-a316-9db33a1ae88b",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:08:11Z",
  "cash_received": true
}
```

```json
{
  "id": "41e6f4b6-0e99-4b08-b973-a0253c3e8aed",
  "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
  "assignment_id": "2abd2870-fa9d-4b84-9cd5-77983c7f628d",
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
  "arrived_at": "2026-10-28T14:08:10.599629Z",
  "started_at": "2026-10-28T14:08:10.884024Z",
  "completed_at": "2026-10-28T14:08:11.193242Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/5c564e90-2cbb-4a3c-ba55-defdb954638d` → **200**

```json
{
  "id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "05c4943c-e1fd-44b8-b8c2-9afbcea55f87",
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
    "id": "2abd2870-fa9d-4b84-9cd5-77983c7f628d",
    "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "41e6f4b6-0e99-4b08-b973-a0253c3e8aed",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:08:07.609432Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5c564e90-2cbb-4a3c-ba55-defdb954638d` → **200**

```json
{
  "id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "05c4943c-e1fd-44b8-b8c2-9afbcea55f87",
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
    "id": "2abd2870-fa9d-4b84-9cd5-77983c7f628d",
    "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "41e6f4b6-0e99-4b08-b973-a0253c3e8aed",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:08:07.609432Z",
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
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/5c564e90-2cbb-4a3c-ba55-defdb954638d/tip` → **200**

```json
{
  "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
  "available_until": "2026-10-29T14:08:11.193242Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5c564e90-2cbb-4a3c-ba55-defdb954638d/tip` → **201**

```json
{
  "command_id": "273f5009-3ce7-44d3-be25-be18ef0aec71",
  "amount_minor": 2500
}
```

```json
{
  "id": "4ad73ef5-3fe3-47d7-8e00-ae4b88bb18b7",
  "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:08:13.881982Z"
}
```

`GET /api/rider/v1/orders/5c564e90-2cbb-4a3c-ba55-defdb954638d/tip` → **200**

```json
{
  "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
  "available_until": "2026-10-29T14:08:11.193242Z",
  "open": false,
  "tip": {
    "id": "4ad73ef5-3fe3-47d7-8e00-ae4b88bb18b7",
    "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:08:13.881982Z"
  }
}
```

`GET /api/rider/v1/orders/5c564e90-2cbb-4a3c-ba55-defdb954638d/tip` → **200**

```json
{
  "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
  "available_until": "2026-10-29T14:08:11.193242Z",
  "open": false,
  "tip": {
    "id": "4ad73ef5-3fe3-47d7-8e00-ae4b88bb18b7",
    "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:08:13.881982Z"
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
      "balance_minor": 16352
    }
  ],
  "entries": [
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "db0d98df-8dc9-4f55-9be0-e8b91473fb44",
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
  "id": "31618e0f-f9e9-47a5-8c5c-7ee7a0b32fb4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:13:15.992289Z",
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
  "session_id": "34006fd0-969d-48dc-8f2f-ab674ee34215",
  "subject": {
    "type": "STAFF",
    "id": "5c66918c-b463-4f23-a2d5-468e3a657090"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzY2OTE4Yy1iNDYzLTRmMjMtYTJkNS00NjhlM2E2NTcwOTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTczOTYsImlhdCI6MTc5MzE5NjQ5NiwianRpIjoiNjgwMjAwOTEtM2EzMy00MjNmLWI2M2UtMjEwOWU4MzAyNzMwIiwic2lkIjoiMzQwMDZmZDAtOTY5ZC00OGRjLThmMmYtYWI2NzRlZTM0MjE1In0.zOtl9OlBjNrvVhnBnvUBeiVnZ99UINCWt10Rs1Ba2Rc",
  "access_expires_at": "2026-10-28T14:23:16.603738074Z",
  "refresh_token": "bQqtu28O2TR75TXr55hNNTjAsTfmA2kskfvWYDiQdHI",
  "refresh_expires_at": "2026-10-29T02:08:16.60314742Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380735633781` → **200**

```json
{
  "client_id": "05c4943c-e1fd-44b8-b8c2-9afbcea55f87"
}
```

`POST /api/admin/v1/rider-wallets/05c4943c-e1fd-44b8-b8c2-9afbcea55f87/top-ups` → **201**

```json
{
  "command_id": "736053ae-ea8f-41c1-85e6-751a9e71ffd3",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "05c4943c-e1fd-44b8-b8c2-9afbcea55f87",
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
      "id": "43f5bde0-639f-4433-9041-63f6e48b038c",
      "at": "2026-10-28T14:08:17.14603Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "5c66918c-b463-4f23-a2d5-468e3a657090",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fe9d6a7a-68ff-4cf2-8844-b6bbf8de9a3c",
  "quote_id": "31618e0f-f9e9-47a5-8c5c-7ee7a0b32fb4",
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
  "id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "05c4943c-e1fd-44b8-b8c2-9afbcea55f87",
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
  "created_at": "2026-10-28T14:08:17.434635Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d50d71f-5385-41e4-bd66-1b8b1ea78ccb` → **200**

```json
{
  "id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "05c4943c-e1fd-44b8-b8c2-9afbcea55f87",
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
  "created_at": "2026-10-28T14:08:17.434635Z",
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
    "id": "3dba3b2f-9696-4bf0-bf8c-61ddad5fc072",
    "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
    "expires_at": "2026-10-28T14:08:32.439568Z",
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

`POST /api/driver/v1/offers/3dba3b2f-9696-4bf0-bf8c-61ddad5fc072/accept` → **200**

```json
{
  "command_id": "2467c1d0-e7b9-4f8d-ba04-bf6762145069"
}
```

```json
{
  "id": "43d3a502-114c-4d47-8a39-bb7fb4f9aa32",
  "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2b2b5622-6817-426d-bae4-a98d5066354d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2b2b5622-6817-426d-bae4-a98d5066354d",
  "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
  "assignment_id": "43d3a502-114c-4d47-8a39-bb7fb4f9aa32",
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

`POST /api/driver/v1/work-sessions/7d8b646d-10c7-4b1e-a10f-92d07d90aac5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:08:18Z",
    "sequence": 1793196498839
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d8b646d-10c7-4b1e-a10f-92d07d90aac5",
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
  "last_heartbeat_at": "2026-10-28T14:08:18.859983Z",
  "last_location_at": "2026-10-28T14:08:18.859983Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2b2b5622-6817-426d-bae4-a98d5066354d/arrive` → **200**

```json
{
  "command_id": "985598dc-0491-400e-85e3-07d4ac6d6fb4",
  "expected_version": 0
}
```

```json
{
  "id": "2b2b5622-6817-426d-bae4-a98d5066354d",
  "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
  "assignment_id": "43d3a502-114c-4d47-8a39-bb7fb4f9aa32",
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
  "arrived_at": "2026-10-28T14:08:19.139445Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2b2b5622-6817-426d-bae4-a98d5066354d/start` → **200**

```json
{
  "command_id": "a4233ada-da9f-44d1-a8bc-0910fbf847b4",
  "expected_version": 1
}
```

```json
{
  "id": "2b2b5622-6817-426d-bae4-a98d5066354d",
  "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
  "assignment_id": "43d3a502-114c-4d47-8a39-bb7fb4f9aa32",
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
  "arrived_at": "2026-10-28T14:08:19.139445Z",
  "started_at": "2026-10-28T14:08:19.436958Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2b2b5622-6817-426d-bae4-a98d5066354d/complete` → **200**

```json
{
  "command_id": "a4f47957-0b97-4508-a0d5-cee5881876e6",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:08:19Z",
  "cash_received": true
}
```

```json
{
  "id": "2b2b5622-6817-426d-bae4-a98d5066354d",
  "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
  "assignment_id": "43d3a502-114c-4d47-8a39-bb7fb4f9aa32",
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
  "arrived_at": "2026-10-28T14:08:19.139445Z",
  "started_at": "2026-10-28T14:08:19.436958Z",
  "completed_at": "2026-10-28T14:08:19.725933Z",
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
  "client_id": "05c4943c-e1fd-44b8-b8c2-9afbcea55f87",
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
      "id": "43f5bde0-639f-4433-9041-63f6e48b038c",
      "at": "2026-10-28T14:08:17.14603Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "5c66918c-b463-4f23-a2d5-468e3a657090",
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
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/3d50d71f-5385-41e4-bd66-1b8b1ea78ccb/tip` → **200**

```json
{
  "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
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
  "available_until": "2026-10-29T14:08:19.725933Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/3d50d71f-5385-41e4-bd66-1b8b1ea78ccb/tip` → **201**

```json
{
  "command_id": "296560ba-4441-4965-821a-f454eee61f64",
  "amount_minor": 2500
}
```

```json
{
  "id": "a7c0dfd1-c9a2-4307-8937-ba6eac0fc27d",
  "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:08:21.112658Z"
}
```

`GET /api/rider/v1/orders/3d50d71f-5385-41e4-bd66-1b8b1ea78ccb/tip` → **200**

```json
{
  "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
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
  "available_until": "2026-10-29T14:08:19.725933Z",
  "open": false,
  "tip": {
    "id": "a7c0dfd1-c9a2-4307-8937-ba6eac0fc27d",
    "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:08:21.112658Z"
  }
}
```

`GET /api/rider/v1/orders/3d50d71f-5385-41e4-bd66-1b8b1ea78ccb/tip` → **200**

```json
{
  "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
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
  "available_until": "2026-10-29T14:08:19.725933Z",
  "open": false,
  "tip": {
    "id": "a7c0dfd1-c9a2-4307-8937-ba6eac0fc27d",
    "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:08:21.112658Z"
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
      "id": "58772fd5-994c-4a04-8e0b-4c440632a553",
      "at": "2026-10-28T14:08:22.697232Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "297a2ede-e308-4bfa-b97d-573064a11081",
      "at": "2026-10-28T14:08:20.666717Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3d50d71f-5385-41e4-bd66-1b8b1ea78ccb",
      "counterpart_id": null
    },
    {
      "id": "4bb80098-ed1b-4fe8-b2a2-6c57fe7c5482",
      "at": "2026-10-28T14:08:15.612615Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
      "counterpart_id": null
    },
    {
      "id": "f29a6ba8-4978-4de2-bdb6-6f83297778b1",
      "at": "2026-10-28T14:08:11.548305Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5c564e90-2cbb-4a3c-ba55-defdb954638d",
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
  "session_id": "7d8b646d-10c7-4b1e-a10f-92d07d90aac5",
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
  "last_heartbeat_at": "2026-10-28T14:08:18.859983Z",
  "last_location_at": "2026-10-28T14:08:18.859983Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7d8b646d-10c7-4b1e-a10f-92d07d90aac5/close` → **200**

```json
{
  "command_id": "a85879d6-7ae9-48d4-b54c-2e73930da3cb",
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
  "phone": "+380734217192",
  "device_ref": "sandbox-6483"
}
```

```json
{
  "challenge_id": "61dae7ef-53e8-4783-baad-0b465e6d18fd",
  "expires_at": "2026-10-28T14:13:48.939939227Z",
  "resend_available_at": "2026-10-28T14:08:49.939939227Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734217192` → **200**

```json
{
  "phone": "+380734217192",
  "audience": "CLIENT",
  "code": "079346",
  "sent_at": "2026-10-28T14:08:48.943676446Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61dae7ef-53e8-4783-baad-0b465e6d18fd",
  "code": "079346",
  "device_ref": "sandbox-6483"
}
```

```json
{
  "session_id": "0e4a5b4f-9db9-474c-bd77-27338e118a16",
  "subject": {
    "type": "CLIENT",
    "id": "4270a703-5b77-4e6e-ac27-316c109393cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MjcwYTcwMy01Yjc3LTRlNmUtYWMyNy0zMTZjMTA5MzkzY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NDI5LCJpYXQiOjE3OTMxOTY1MjksImp0aSI6IjhhODZiOTg1LTVkYzktNGM0Zi04NWZiLTA4ZDI0N2YxNjliMCIsInNpZCI6IjBlNGE1YjRmLTlkYjktNDc0Yy1iZDc3LTI3MzM4ZTExOGExNiJ9.lVtsrfynjaqowxi9G0H9jB7NQGdyEFCCoyML4SLMNtk",
  "access_expires_at": "2026-10-28T14:23:49.259989807Z",
  "refresh_token": "HlaWnBxJ-m8PXpsxRhyPnYohZcQKBg5trxp5hCEaFRk",
  "refresh_expires_at": "2026-11-27T14:08:49.259457883Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "794f9f13-f1da-4205-8f3a-f242b912bd88",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "70ac39ac-48a6-4a2a-94d9-d5162062371f",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-70ac39ac-48a6-4a2a-94d9-d5162062371f",
    "orderDate": "1793196529",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "74919f5c5fbb36f3bb420eda9288a225",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=70ac39ac-48a6-4a2a-94d9-d5162062371f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734217192"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=70ac39ac-48a6-4a2a-94d9-d5162062371f",
  "created_at": "2026-10-28T14:08:49.540737Z",
  "expires_at": "2026-10-28T14:38:49.540737Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/70ac39ac-48a6-4a2a-94d9-d5162062371f` → **200**

```json
{
  "id": "70ac39ac-48a6-4a2a-94d9-d5162062371f",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:08:49.540737Z",
  "expires_at": "2026-10-28T14:38:49.540737Z",
  "completed_at": "2026-10-28T14:08:49.812438Z",
  "masked_pan": "41****0780",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "4270a703-5b77-4e6e-ac27-316c109393cd",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "4270a703-5b77-4e6e-ac27-316c109393cd",
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
      "id": "62044ace-33f1-4548-8749-1de5fd8d7d5d",
      "at": "2026-10-28T14:08:50.757989Z",
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
  "client_id": "4270a703-5b77-4e6e-ac27-316c109393cd",
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
      "id": "62044ace-33f1-4548-8749-1de5fd8d7d5d",
      "at": "2026-10-28T14:08:50.757989Z",
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
  "device_ref": "sandbox-10883"
}
```

```json
{
  "challenge_id": "c69bb5be-ee3e-4f01-957d-db670978dda0",
  "expires_at": "2026-10-28T14:13:51.907823925Z",
  "resend_available_at": "2026-10-28T14:08:52.907823925Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "132157",
  "sent_at": "2026-10-28T14:08:51.910531986Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c69bb5be-ee3e-4f01-957d-db670978dda0",
  "code": "132157",
  "device_ref": "sandbox-10883"
}
```

```json
{
  "session_id": "6cc38249-8ab8-4e66-ac40-e8fe457ac4cb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzQzMiwiaWF0IjoxNzkzMTk2NTMyLCJqdGkiOiJjZDkwMzVjZi02MWE0LTQ4YjgtYTE5NC1jNjE0Njg3MmIzMmUiLCJzaWQiOiI2Y2MzODI0OS04YWI4LTRlNjYtYWM0MC1lOGZlNDU3YWM0Y2IifQ.J0shRrIxdcY2p-itq1gF9rt1QDLekfointv_ISHIwXg",
  "access_expires_at": "2026-10-28T14:23:52.197777255Z",
  "refresh_token": "PnLdpkSFO4qe29eCEY2EH-JAUylcqVHpU2wcqjlCfCQ",
  "refresh_expires_at": "2026-11-27T14:08:52.197239357Z",
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
  "command_id": "987a8b27-c868-4852-8e1a-abf0e621fa1a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "f88807b1-87fa-4829-956a-eb824762bf2c",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-f88807b1-87fa-4829-956a-eb824762bf2c",
    "orderDate": "1793196532",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "4f20cba63172c3b8c9a8682ff776635c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=f88807b1-87fa-4829-956a-eb824762bf2c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=f88807b1-87fa-4829-956a-eb824762bf2c",
  "created_at": "2026-10-28T14:08:52.735506Z",
  "expires_at": "2026-10-28T14:38:52.735506Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/f88807b1-87fa-4829-956a-eb824762bf2c` → **200**

```json
{
  "id": "f88807b1-87fa-4829-956a-eb824762bf2c",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:08:52.735506Z",
  "expires_at": "2026-10-28T14:38:52.735506Z",
  "completed_at": "2026-10-28T14:08:53.01038Z",
  "masked_pan": "41****4234",
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
      "id": "a17f37b3-b8b6-48f8-8350-01fda2240d78",
      "at": "2026-10-28T14:08:53.765426Z",
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
  "command_id": "ab85bc8d-bb31-4e16-a9ca-819fda54e2cf",
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
  "correlation_id": "dd2a4982-eec7-4f56-97b7-ed1c7bc7a186"
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
  "session_id": "c184e33d-8c9c-488c-af71-ab2ae8a7aac5",
  "subject": {
    "type": "STAFF",
    "id": "5c66918c-b463-4f23-a2d5-468e3a657090"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzY2OTE4Yy1iNDYzLTRmMjMtYTJkNS00NjhlM2E2NTcwOTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc0MzUsImlhdCI6MTc5MzE5NjUzNSwianRpIjoiMTJlOTM5MjctYjljZC00MmY5LWI5ODEtNjkyZDQ5MmNiNzMzIiwic2lkIjoiYzE4NGUzM2QtOGM5Yy00ODhjLWFmNzEtYWIyYWU4YTdhYWM1In0.Q5GqoQSeQXhPNNxkwdpYovGExOzD6HR03ko_XeHSuXU",
  "access_expires_at": "2026-10-28T14:23:55.421808396Z",
  "refresh_token": "eRJRj8ly_vuFYjS6HQV5srQgKsw_grECdMkKy9XUbDw",
  "refresh_expires_at": "2026-10-29T02:08:55.421255382Z",
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
  "phone": "+48600588396",
  "device_ref": "sandbox-20311"
}
```

```json
{
  "challenge_id": "df2b74a3-8981-43a5-ab65-52d391b61f20",
  "expires_at": "2026-10-28T14:13:56.223797993Z",
  "resend_available_at": "2026-10-28T14:08:57.223797993Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600588396` → **200**

```json
{
  "phone": "+48600588396",
  "audience": "CLIENT",
  "code": "229987",
  "sent_at": "2026-10-28T14:08:56.226173873Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df2b74a3-8981-43a5-ab65-52d391b61f20",
  "code": "229987",
  "device_ref": "sandbox-20311"
}
```

```json
{
  "session_id": "df27b15f-6872-41bb-851f-d2439c4b49d8",
  "subject": {
    "type": "CLIENT",
    "id": "a82fb961-cc51-4b3e-9b11-d9126997c7e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODJmYjk2MS1jYzUxLTRiM2UtOWIxMS1kOTEyNjk5N2M3ZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NDM2LCJpYXQiOjE3OTMxOTY1MzYsImp0aSI6IjhmOTRjNDdkLWU5NGQtNGM3Mi04ODM4LWU5ZmE2MmYzMzEyNiIsInNpZCI6ImRmMjdiMTVmLTY4NzItNDFiYi04NTFmLWQyNDM5YzRiNDlkOCJ9.zizXSDr6HF0RSScm0CF197S3VnVv3dsz5fTuuq5IFO0",
  "access_expires_at": "2026-10-28T14:23:56.510513636Z",
  "refresh_token": "uT1XVX43aYUAe1Hu8lw-hLvkrhTO0onoIllVKaL4BGE",
  "refresh_expires_at": "2026-11-27T14:08:56.50996079Z",
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
  "command_id": "b97b826f-71bb-418c-a0c1-333bef763ddb",
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
  "correlation_id": "bbaf13dd-38a7-470f-b4dc-6bf78ed8dc68",
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
  "command_id": "a43d4d17-fbc8-47f6-ae15-75d1d1223da6",
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
  "paused_at": "2026-10-28T14:08:57.596952514Z",
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
  "command_id": "87c74d5c-d97b-49a6-81e8-7721db4ad49c",
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
  "id": "9d11d7d1-7a70-411f-846d-bb3a44a543ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:13:58.134799Z",
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
  "command_id": "16e72ef7-0115-4f1a-93ac-7d6eff13463e",
  "quote_id": "9d11d7d1-7a70-411f-846d-bb3a44a543ca",
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
  "correlation_id": "64a11d2d-7fa3-4a94-9cb4-67fa92b05151"
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
  "paused_at": "2026-10-28T14:08:57.596953Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "579f045f-a0bd-487b-9462-5152ccdefc56",
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
  "command_id": "d31e1f04-ff63-48a1-bc47-5c301694dfac",
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
  "command_id": "5fb0678f-3316-4a5f-b974-7fc2cb4239a9",
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
  "id": "dc5e71a6-acb3-4f41-aac5-539179fae775",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:13:59.784761Z",
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
  "command_id": "ec10196c-7215-4bb7-9e44-e84b1558e8c2",
  "quote_id": "dc5e71a6-acb3-4f41-aac5-539179fae775",
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
  "correlation_id": "f5f9aab1-264e-4226-b79d-98d88b231a1d"
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
  "command_id": "875fad24-c022-43ea-8bd3-e32c980c6bee",
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
  "command_id": "6dd0d7b5-31fc-452a-9fc9-827db0f7c974",
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
  "id": "172cf805-8e0a-4fe4-81f5-7774ef5cbea4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:14:00.873743Z",
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
  "command_id": "559f37f5-220d-4290-b194-ddac8b04a116",
  "quote_id": "172cf805-8e0a-4fe4-81f5-7774ef5cbea4",
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
  "correlation_id": "462f1bb8-11ee-44d2-870c-a8e616bacc55"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "39b79fc6-1184-43f5-a894-037e89039e88",
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
  "correlation_id": "fad90849-3e03-4597-bca8-ccc47524f730"
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
  "command_id": "5f6c01a4-3f0a-4bf6-bc65-335900c37d43",
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
