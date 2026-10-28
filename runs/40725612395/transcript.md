# Sandbox transcript (2026-10-28T16:25:11Z, a9c3519)

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
  "correlation_id": "bfd7b185-9ede-45e7-ade3-5630036bad08"
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
  "session_id": "2b2ff3e6-2811-4266-873d-af60bb610f63",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU2MTksImlhdCI6MTc5MzIwNDcxOSwianRpIjoiNjg3ZWVmOWMtMDgzMi00NDYxLTljMGMtNDA0N2MwODFjMmY1Iiwic2lkIjoiMmIyZmYzZTYtMjgxMS00MjY2LTg3M2QtYWY2MGJiNjEwZjYzIn0.rNUUiC4kWD3lW0r9W3HKqAGE1YfPfeOeb33e1LsrdAY",
  "access_expires_at": "2026-10-28T16:40:19.649802981Z",
  "refresh_token": "SvzewsZF0E0cVCcxOZtMdA4Jqvp8hsaiargPWrE4NnU",
  "refresh_expires_at": "2026-10-29T04:25:19.647592422Z",
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
  "session_id": "ade66620-f69f-47a4-9b30-887859b75407",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU2MjEsImlhdCI6MTc5MzIwNDcyMSwianRpIjoiNTMxOGNiMjQtZjBmZi00ZGFlLWJlOTUtMWYwMzk5NTA2MjliIiwic2lkIjoiYWRlNjY2MjAtZjY5Zi00N2E0LTliMzAtODg3ODU5Yjc1NDA3In0.v2907blu_-Z3P7aPtfwqqZA94Nn9a7ZzLKqfXp3lcTM",
  "access_expires_at": "2026-10-28T16:40:21.225721806Z",
  "refresh_token": "wNs6oBnKPX8G2P0GpT7fVD5g_Qsfas_BSeLOwfgP3LI",
  "refresh_expires_at": "2026-10-29T04:25:21.224836964Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "3de16827-a441-497d-a191-e44e931a0108",
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
  "id": "cf48dea5-7d45-4db2-b689-28af2c1e5113",
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
  "created_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "created_at": "2026-10-28T16:25:21.533231Z",
  "updated_at": "2026-10-28T16:25:21.533231Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631153662",
  "device_ref": "sandbox-22897"
}
```

```json
{
  "challenge_id": "dadee40e-a8ae-4dc9-ba55-93317f902973",
  "expires_at": "2026-10-28T16:30:21.833494683Z",
  "resend_available_at": "2026-10-28T16:25:22.833494683Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631153662` → **200**

```json
{
  "phone": "+380631153662",
  "audience": "CLIENT",
  "code": "436692",
  "sent_at": "2026-10-28T16:25:21.844628468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dadee40e-a8ae-4dc9-ba55-93317f902973",
  "code": "436692",
  "device_ref": "sandbox-22897"
}
```

```json
{
  "session_id": "347b0f7e-0d38-4647-9ef9-d927c868f093",
  "subject": {
    "type": "CLIENT",
    "id": "6a98e1ca-4f74-4917-8f3e-b19261dce61e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YTk4ZTFjYS00Zjc0LTQ5MTctOGYzZS1iMTkyNjFkY2U2MWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NjIyLCJpYXQiOjE3OTMyMDQ3MjIsImp0aSI6IjJkNjVhMTJmLTdkMjUtNGYyNy05NDExLWNiNjExNDUxZmM0NCIsInNpZCI6IjM0N2IwZjdlLTBkMzgtNDY0Ny05ZWY5LWQ5MjdjODY4ZjA5MyJ9.-ZZwR8zTrgv_83jGPaylwO2vnK9lS4uw8rt2OcJgjFg",
  "access_expires_at": "2026-10-28T16:40:22.162586791Z",
  "refresh_token": "ukcFuWZujuqv6VbszJIljefg2RWjOnfwhQp7S-SVLyE",
  "refresh_expires_at": "2026-11-27T16:25:22.161030174Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631153662` → **200**

```json
{
  "client_id": "6a98e1ca-4f74-4917-8f3e-b19261dce61e"
}
```

`POST /api/admin/v1/rider-wallets/6a98e1ca-4f74-4917-8f3e-b19261dce61e/top-ups` → **201**

```json
{
  "command_id": "90c6bd72-4745-4468-9a9d-e94c8ffcdb75",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "6a98e1ca-4f74-4917-8f3e-b19261dce61e",
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
      "id": "ab1064d6-2067-4330-8f1b-19738899eab0",
      "at": "2026-10-28T16:25:22.724579Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8c46843b-97c5-4dca-ba96-a5e18d46aad3",
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
  "id": "5ca2b156-5a72-4ef9-9d7d-1fc6c04bf524",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:30:23.073964Z",
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
      "id": "cf48dea5-7d45-4db2-b689-28af2c1e5113",
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
  "device_ref": "sandbox-14807"
}
```

```json
{
  "challenge_id": "cd28609b-cad2-4857-84d5-27e6e2024d9d",
  "expires_at": "2026-10-28T16:30:23.38025284Z",
  "resend_available_at": "2026-10-28T16:25:24.38025284Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "086558",
  "sent_at": "2026-10-28T16:25:23.38430696Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd28609b-cad2-4857-84d5-27e6e2024d9d",
  "code": "086558",
  "device_ref": "sandbox-14807"
}
```

```json
{
  "session_id": "58c46d26-b656-41e4-9cab-02a4a3525b2f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTYyMywiaWF0IjoxNzkzMjA0NzIzLCJqdGkiOiIyYTJjYWI2Zi01OGYyLTQxMmYtYTliYi04MmI0OTg5OWIwZjkiLCJzaWQiOiI1OGM0NmQyNi1iNjU2LTQxZTQtOWNhYi0wMmE0YTM1MjViMmYifQ.6FCZkejKXcqVz5_TQxoC0wnCbR-I2DJm0NfDHFD2SkI",
  "access_expires_at": "2026-10-28T16:40:23.678567036Z",
  "refresh_token": "8uK-LMqZlP7NrE7W-pU058tH3r4OxeytDuZdQpI8024",
  "refresh_expires_at": "2026-11-27T16:25:23.67760549Z",
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
  "command_id": "125050d6-9559-478b-ad5e-0babc886db4d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:25:24Z",
    "sequence": 1793204724229
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1787dd8a-2f1a-429d-92ab-a9e433c3f69a",
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
  "last_heartbeat_at": "2026-10-28T16:25:24.270829Z",
  "last_location_at": "2026-10-28T16:25:24.270829Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6bd282c8-f984-4f80-914d-7f381d2afa2a",
  "quote_id": "5ca2b156-5a72-4ef9-9d7d-1fc6c04bf524",
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
  "id": "00a170a8-43ec-4bed-a3f8-3f36093afec9",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6a98e1ca-4f74-4917-8f3e-b19261dce61e",
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
  "created_at": "2026-10-28T16:25:24.624922Z",
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
  "client_id": "6a98e1ca-4f74-4917-8f3e-b19261dce61e",
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
      "id": "ab1064d6-2067-4330-8f1b-19738899eab0",
      "at": "2026-10-28T16:25:22.724579Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
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
    "id": "360c24b8-1c2a-433a-90e2-3a92b8ad76cb",
    "order_id": "00a170a8-43ec-4bed-a3f8-3f36093afec9",
    "expires_at": "2026-10-28T16:25:39.63926Z",
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

`POST /api/driver/v1/offers/360c24b8-1c2a-433a-90e2-3a92b8ad76cb/accept` → **200**

```json
{
  "command_id": "af140b70-38e0-4140-b3ab-c6ba69c76a0d"
}
```

```json
{
  "id": "6f970c1f-6e17-4fba-8ba9-ffcce06966a3",
  "order_id": "00a170a8-43ec-4bed-a3f8-3f36093afec9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2b499ba9-1f4e-4965-afc5-3328514ca3c0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2b499ba9-1f4e-4965-afc5-3328514ca3c0",
  "order_id": "00a170a8-43ec-4bed-a3f8-3f36093afec9",
  "assignment_id": "6f970c1f-6e17-4fba-8ba9-ffcce06966a3",
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

`POST /api/driver/v1/work-sessions/1787dd8a-2f1a-429d-92ab-a9e433c3f69a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:25:26Z",
    "sequence": 1793204726879
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1787dd8a-2f1a-429d-92ab-a9e433c3f69a",
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
  "last_heartbeat_at": "2026-10-28T16:25:26.113292Z",
  "last_location_at": "2026-10-28T16:25:26.113292Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2b499ba9-1f4e-4965-afc5-3328514ca3c0/arrive` → **200**

```json
{
  "command_id": "80048d08-af35-4272-8742-822a519629e8",
  "expected_version": 0
}
```

```json
{
  "id": "2b499ba9-1f4e-4965-afc5-3328514ca3c0",
  "order_id": "00a170a8-43ec-4bed-a3f8-3f36093afec9",
  "assignment_id": "6f970c1f-6e17-4fba-8ba9-ffcce06966a3",
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
  "arrived_at": "2026-10-28T16:25:26.408961Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2b499ba9-1f4e-4965-afc5-3328514ca3c0/start` → **200**

```json
{
  "command_id": "e4197665-349c-4227-9036-6d97d4d42bb4",
  "expected_version": 1
}
```

```json
{
  "id": "2b499ba9-1f4e-4965-afc5-3328514ca3c0",
  "order_id": "00a170a8-43ec-4bed-a3f8-3f36093afec9",
  "assignment_id": "6f970c1f-6e17-4fba-8ba9-ffcce06966a3",
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
  "arrived_at": "2026-10-28T16:25:26.408961Z",
  "started_at": "2026-10-28T16:25:26.697365Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/2b499ba9-1f4e-4965-afc5-3328514ca3c0/complete` → **200**

```json
{
  "command_id": "d04f4b69-4f93-4e61-a073-ea9148d18c50",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:25:26Z",
  "cash_received": true
}
```

```json
{
  "id": "2b499ba9-1f4e-4965-afc5-3328514ca3c0",
  "order_id": "00a170a8-43ec-4bed-a3f8-3f36093afec9",
  "assignment_id": "6f970c1f-6e17-4fba-8ba9-ffcce06966a3",
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
  "arrived_at": "2026-10-28T16:25:26.408961Z",
  "started_at": "2026-10-28T16:25:26.697365Z",
  "completed_at": "2026-10-28T16:25:27.017275Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "6a98e1ca-4f74-4917-8f3e-b19261dce61e",
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
      "id": "f1e5b049-f84a-459e-8e2b-64e3f160b5bc",
      "at": "2026-10-28T16:25:27.934515Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "00a170a8-43ec-4bed-a3f8-3f36093afec9"
    },
    {
      "id": "ab1064d6-2067-4330-8f1b-19738899eab0",
      "at": "2026-10-28T16:25:22.724579Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/cf48dea5-7d45-4db2-b689-28af2c1e5113/archive` → **200**

```json
{
  "command_id": "5f28e9b0-e5bd-4c01-be09-a5ac7e8cba65",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "cf48dea5-7d45-4db2-b689-28af2c1e5113",
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
  "created_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "created_at": "2026-10-28T16:25:21.533231Z",
  "updated_at": "2026-10-28T16:25:30.603325Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1787dd8a-2f1a-429d-92ab-a9e433c3f69a",
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
  "last_heartbeat_at": "2026-10-28T16:25:26.113292Z",
  "last_location_at": "2026-10-28T16:25:26.113292Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1787dd8a-2f1a-429d-92ab-a9e433c3f69a/close` → **200**

```json
{
  "command_id": "25e49371-a219-479f-82a6-8f073f0ae5e3",
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

Done: order 00a170a8-43ec-4bed-a3f8-3f36093afec9.

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
  "session_id": "2e8eef90-a7dc-4cb7-8425-18942e3130e5",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU2MzEsImlhdCI6MTc5MzIwNDczMSwianRpIjoiNDVjMTk0OTItMGM5YS00MTQwLWJkZjMtMmNjNWM4Mjc2MzhjIiwic2lkIjoiMmU4ZWVmOTAtYTdkYy00Y2I3LTg0MjUtMTg5NDJlMzEzMGU1In0.zFvLA7u1_1Ak6Y6R2srgxK7XzEBE00XWQvLyoibZLqg",
  "access_expires_at": "2026-10-28T16:40:31.788078922Z",
  "refresh_token": "esV3Pmf8iipGv0bROnhGS0KZ0Y6PcqdOgRnOI9fWqb8",
  "refresh_expires_at": "2026-10-29T04:25:31.787321497Z",
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
  "command_id": "4fb11e64-d306-4758-92ab-6a57820fd40c",
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
  "session_id": "00d55d24-7a31-425d-9fd5-399bbbe62ca1",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU2MzIsImlhdCI6MTc5MzIwNDczMiwianRpIjoiODgyNDQxNjQtNzU3MC00MzVhLWFiZDctM2E4Y2Q5NmU2ZTdhIiwic2lkIjoiMDBkNTVkMjQtN2EzMS00MjVkLTlmZDUtMzk5YmJiZTYyY2ExIn0.lgbCh6PqZ9FDRCd86TT0Bo9t0K4xjXxMMEY3B9S1xN4",
  "access_expires_at": "2026-10-28T16:40:32.928983731Z",
  "refresh_token": "dXf315GLBFoZOy_mVlxuLsom-HOQMlAAcXCrzfmuGrM",
  "refresh_expires_at": "2026-10-29T04:25:32.928265209Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.166010976",
    "linkedid": "1730052700.166010976",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678762550"
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
    "id": "1730052700.166010976",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "8aac5322-1100-42ad-a937-56137690fc8c",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380678762550",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:25:33.207271Z",
      "answered_at": null,
      "ended_at": "2026-10-28T16:25:33.234314Z",
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
    "id": "1730052600.1010730367",
    "linkedid": "1730052600.1010730367",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678762550"
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
      "id": "a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678762550",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:25:33.5508Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd/answer` → **200**

```json
{
  "command_id": "2e1e8bc8-1238-4b88-b17e-9446a19f2432"
}
```

```json
{
  "id": "a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678762550",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "order_ids": [],
  "started_at": "2026-10-28T16:25:33.5508Z",
  "answered_at": "2026-10-28T16:25:33.872185Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1010730367",
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
    "id": "1730052600.1010730367",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678762550",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "order_ids": [],
      "started_at": "2026-10-28T16:25:33.5508Z",
      "answered_at": "2026-10-28T16:25:33.872185Z",
      "ended_at": "2026-10-28T16:25:34.180007Z",
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
      "id": "a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678762550",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "order_ids": [],
      "started_at": "2026-10-28T16:25:33.5508Z",
      "answered_at": "2026-10-28T16:25:33.872185Z",
      "ended_at": "2026-10-28T16:25:34.180007Z",
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
      "id": "a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678762550",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "order_ids": [],
      "started_at": "2026-10-28T16:25:33.5508Z",
      "answered_at": "2026-10-28T16:25:33.872185Z",
      "ended_at": "2026-10-28T16:25:34.180007Z",
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
      "id": "a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678762550",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "order_ids": [],
      "started_at": "2026-10-28T16:25:33.5508Z",
      "answered_at": "2026-10-28T16:25:33.872185Z",
      "ended_at": "2026-10-28T16:25:34.180007Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:25:39.699758Z"
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
      "id": "a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678762550",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "order_ids": [],
      "started_at": "2026-10-28T16:25:33.5508Z",
      "answered_at": "2026-10-28T16:25:33.872185Z",
      "ended_at": "2026-10-28T16:25:34.180007Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:25:39.699758Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd` → **200**

```json
{
  "changes": [
    {
      "id": "0e33eca5-6bd4-444b-8502-d36b02924a48",
      "occurred_at": "2026-10-28T16:25:41.660588Z",
      "actor_type": "STAFF",
      "actor_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"e3d8187b-5959-471e-a02b-78d7f8ba4d99\", \"order_ids\": []}",
      "correlation_id": "bb17a0c2-7182-41ce-aaaf-8794751dc212"
    },
    {
      "id": "cd51453d-bc4c-485e-8637-0669574841b6",
      "occurred_at": "2026-10-28T16:25:41.626981Z",
      "actor_type": "STAFF",
      "actor_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"e3d8187b-5959-471e-a02b-78d7f8ba4d99\", \"order_ids\": []}",
      "correlation_id": "0c16537a-cb2a-4593-977b-4f0e2102282c"
    }
  ]
}
```

Done: call a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26184"
}
```

```json
{
  "challenge_id": "87db92fb-758e-4859-acdb-494b73b08d4b",
  "expires_at": "2026-10-28T16:30:41.979518677Z",
  "resend_available_at": "2026-10-28T16:25:42.979518677Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "348010",
  "sent_at": "2026-10-28T16:25:41.983901013Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87db92fb-758e-4859-acdb-494b73b08d4b",
  "code": "348010",
  "device_ref": "sandbox-26184"
}
```

```json
{
  "session_id": "a000ad3f-15b2-4aac-87a9-83740b456c40",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTY0MiwiaWF0IjoxNzkzMjA0NzQyLCJqdGkiOiIyNjBiN2I0Ny1kNDVmLTRkMGUtYThmMi1lZGU5ZDhiYzE3NTIiLCJzaWQiOiJhMDAwYWQzZi0xNWIyLTRhYWMtODdhOS04Mzc0MGI0NTZjNDAifQ.QPOYzdETYMHquodF18zaBvYSasZHPZlLRV1yIoygd7g",
  "access_expires_at": "2026-10-28T16:40:42.286880647Z",
  "refresh_token": "vDDasLJBnxlR3Bvu57r-t4ELBjen1ApRb3IXhylBTLk",
  "refresh_expires_at": "2026-11-27T16:25:42.286141026Z",
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
  "command_id": "360ce7b9-f396-4317-9a6d-5f7aa0e6c61e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:25:42Z",
    "sequence": 1793204742816
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ed7faa12-ec66-4a89-af36-2b052e7955ad",
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
  "last_heartbeat_at": "2026-10-28T16:25:42.837762Z",
  "last_location_at": "2026-10-28T16:25:42.837762Z",
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
  "session_id": "f6f45ace-3898-4696-a8d7-f3e328f670aa",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU2NDMsImlhdCI6MTc5MzIwNDc0MywianRpIjoiYzFiYTc5ZWYtZGQ0MC00ZmE1LWI5YTEtM2JjOGUwNzIxY2U0Iiwic2lkIjoiZjZmNDVhY2UtMzg5OC00Njk2LWE4ZDctZjNlMzI4ZjY3MGFhIn0.TLl5gmRgJUhwnKU8mfURLkKHhK905KeXLCR-wa3D_Ag",
  "access_expires_at": "2026-10-28T16:40:43.40562531Z",
  "refresh_token": "Y89Xku54-JI7RqKEhx0zdg2JrXlBN9OluldeaiZVtf0",
  "refresh_expires_at": "2026-10-29T04:25:43.404947094Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6dc022d6-4684-4065-8744-c58064cb8440",
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
  "id": "d29823cf-5c06-4307-8db9-bc46c455f7d9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:30:43.680487Z",
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
  "command_id": "54d561a5-270d-4bbb-90eb-7678ace919c4",
  "quote_id": "d29823cf-5c06-4307-8db9-bc46c455f7d9",
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
    "phone": "+380677580898"
  }
}
```

```json
{
  "id": "bc5c5cae-c879-47ff-a232-6be7b1af1766",
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
  "created_at": "2026-10-28T16:25:43.991779Z",
  "caller": {
    "name": "Олена",
    "phone": "+380677580898"
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
    "id": "24e12120-5576-4213-b25d-3a77fd5f3a73",
    "order_id": "bc5c5cae-c879-47ff-a232-6be7b1af1766",
    "expires_at": "2026-10-28T16:25:58.999492Z",
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

`POST /api/driver/v1/offers/24e12120-5576-4213-b25d-3a77fd5f3a73/accept` → **200**

```json
{
  "command_id": "7ed9bcf2-8035-42fc-b611-6ec0981e8c24"
}
```

```json
{
  "id": "43022447-f9cd-4656-aa1e-9c18384f65da",
  "order_id": "bc5c5cae-c879-47ff-a232-6be7b1af1766",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "adcb67ce-d4e0-4385-867e-d3760c22f9b4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380677580898` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677580898` → **200**

```json
[
  {
    "phone": "+380677580898",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:25:45.892641522Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677580898` → **200**

```json
[
  {
    "phone": "+380677580898",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:25:45.892641522Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677580898` → **200**

```json
[
  {
    "phone": "+380677580898",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:25:45.892641522Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "adcb67ce-d4e0-4385-867e-d3760c22f9b4",
  "order_id": "bc5c5cae-c879-47ff-a232-6be7b1af1766",
  "assignment_id": "43022447-f9cd-4656-aa1e-9c18384f65da",
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
    "phone": "+380677580898"
  }
}
```

`POST /api/driver/v1/work-sessions/ed7faa12-ec66-4a89-af36-2b052e7955ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:25:46Z",
    "sequence": 1793204746230
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ed7faa12-ec66-4a89-af36-2b052e7955ad",
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
  "last_heartbeat_at": "2026-10-28T16:25:46.24994Z",
  "last_location_at": "2026-10-28T16:25:46.24994Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/adcb67ce-d4e0-4385-867e-d3760c22f9b4/arrive` → **200**

```json
{
  "command_id": "7c1b2350-22c6-496b-bb62-33adec304a8e",
  "expected_version": 0
}
```

```json
{
  "id": "adcb67ce-d4e0-4385-867e-d3760c22f9b4",
  "order_id": "bc5c5cae-c879-47ff-a232-6be7b1af1766",
  "assignment_id": "43022447-f9cd-4656-aa1e-9c18384f65da",
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
  "arrived_at": "2026-10-28T16:25:46.525489Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677580898"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380677580898` → **200**

```json
[
  {
    "phone": "+380677580898",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:25:45.892641522Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677580898` → **200**

```json
[
  {
    "phone": "+380677580898",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:25:45.892641522Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677580898` → **200**

```json
[
  {
    "phone": "+380677580898",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:25:45.892641522Z"
  },
  {
    "phone": "+380677580898",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T16:25:47.899928154Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677580898` → **200**

```json
[
  {
    "phone": "+380677580898",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:25:45.892641522Z"
  },
  {
    "phone": "+380677580898",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T16:25:47.899928154Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677580898` → **200**

```json
[
  {
    "phone": "+380677580898",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:25:45.892641522Z"
  },
  {
    "phone": "+380677580898",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T16:25:47.899928154Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/adcb67ce-d4e0-4385-867e-d3760c22f9b4/start` → **200**

```json
{
  "command_id": "7b6a8a75-7b23-43c5-96a8-983c15d49712",
  "expected_version": 1
}
```

```json
{
  "id": "adcb67ce-d4e0-4385-867e-d3760c22f9b4",
  "order_id": "bc5c5cae-c879-47ff-a232-6be7b1af1766",
  "assignment_id": "43022447-f9cd-4656-aa1e-9c18384f65da",
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
  "arrived_at": "2026-10-28T16:25:46.525489Z",
  "started_at": "2026-10-28T16:25:48.942336Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677580898"
  }
}
```

`POST /api/driver/v1/trips/adcb67ce-d4e0-4385-867e-d3760c22f9b4/complete` → **200**

```json
{
  "command_id": "03651d10-3be4-4937-bcda-aa7291fa3f9c",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:25:49Z",
  "cash_received": true
}
```

```json
{
  "id": "adcb67ce-d4e0-4385-867e-d3760c22f9b4",
  "order_id": "bc5c5cae-c879-47ff-a232-6be7b1af1766",
  "assignment_id": "43022447-f9cd-4656-aa1e-9c18384f65da",
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
  "arrived_at": "2026-10-28T16:25:46.525489Z",
  "started_at": "2026-10-28T16:25:48.942336Z",
  "completed_at": "2026-10-28T16:25:49.229542Z",
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
  "session_id": "ed7faa12-ec66-4a89-af36-2b052e7955ad",
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
  "last_heartbeat_at": "2026-10-28T16:25:46.24994Z",
  "last_location_at": "2026-10-28T16:25:46.24994Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed7faa12-ec66-4a89-af36-2b052e7955ad/close` → **200**

```json
{
  "command_id": "ce581010-a6e7-4908-bb93-f159f9acc3d8",
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
  "phone": "+380633131071",
  "device_ref": "sandbox-13554"
}
```

```json
{
  "challenge_id": "d6aa2237-d8f8-49ae-bcb0-0b7e0ee1da15",
  "expires_at": "2026-10-28T16:30:50.085982759Z",
  "resend_available_at": "2026-10-28T16:25:51.085982759Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633131071` → **200**

```json
{
  "phone": "+380633131071",
  "audience": "CLIENT",
  "code": "775394",
  "sent_at": "2026-10-28T16:25:50.090007292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6aa2237-d8f8-49ae-bcb0-0b7e0ee1da15",
  "code": "775394",
  "device_ref": "sandbox-13554"
}
```

```json
{
  "session_id": "3ee2d8d3-8162-4551-9f0a-2e55ddea0669",
  "subject": {
    "type": "CLIENT",
    "id": "30ad4d8e-9049-44c6-b2d7-aa1fefd325ef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMGFkNGQ4ZS05MDQ5LTQ0YzYtYjJkNy1hYTFmZWZkMzI1ZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NjUwLCJpYXQiOjE3OTMyMDQ3NTAsImp0aSI6IjEwMDY1NTg5LTU5MTctNGJhZS1iOTlkLWUzYTI4Nzk5YTQ5MCIsInNpZCI6IjNlZTJkOGQzLTgxNjItNDU1MS05ZjBhLTJlNTVkZGVhMDY2OSJ9.T27u9DzP1lG1Oj276JLPvqoIFfB9mTQjEbyRm-FXgGU",
  "access_expires_at": "2026-10-28T16:40:50.385563985Z",
  "refresh_token": "JxN7xdOs3R5Lb0yjda4rO4RtY5sHTq0rmGvrdpzc8m8",
  "refresh_expires_at": "2026-11-27T16:25:50.384794849Z",
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
  "device_ref": "sandbox-11943"
}
```

```json
{
  "challenge_id": "1afa2713-844d-47b2-9b2d-ed60a6d8d990",
  "expires_at": "2026-10-28T16:30:50.918500782Z",
  "resend_available_at": "2026-10-28T16:25:51.918500782Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "723444",
  "sent_at": "2026-10-28T16:25:50.921720665Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1afa2713-844d-47b2-9b2d-ed60a6d8d990",
  "code": "723444",
  "device_ref": "sandbox-11943"
}
```

```json
{
  "session_id": "ef6fe5fe-5421-4e22-ab1b-782dfdfd3788",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTY1MSwiaWF0IjoxNzkzMjA0NzUxLCJqdGkiOiIzOTY1MWRjZS1jNjEwLTQwNTEtOGQxNy1hM2I3YmVmMjc0NmEiLCJzaWQiOiJlZjZmZTVmZS01NDIxLTRlMjItYWIxYi03ODJkZmRmZDM3ODgifQ.t-HIyoavlrqymE3C_pHOBVwc92zuzmKdc-N82uIX95o",
  "access_expires_at": "2026-10-28T16:40:51.208963131Z",
  "refresh_token": "i6apqapaV222q1yCmidk3JBRGP1HjDSn4vUcgriGa3A",
  "refresh_expires_at": "2026-11-27T16:25:51.20829844Z",
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
  "session_id": "e99afb52-d446-4338-92e8-cbfd31d104f0",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU2NTIsImlhdCI6MTc5MzIwNDc1MiwianRpIjoiMzc3M2M5ZmUtNjY1ZC00ODYxLTk2NjItZWUxMGRmNzUzMGVlIiwic2lkIjoiZTk5YWZiNTItZDQ0Ni00MzM4LTkyZTgtY2JmZDMxZDEwNGYwIn0.1ZPGXu6amDU_Eu-pyFL-brdqrkQiq0AmNNyzA_ZViH4",
  "access_expires_at": "2026-10-28T16:40:52.034712912Z",
  "refresh_token": "cybks6G3XiZby7T7WMKlElLKgP8kFbGCPm_UGscclDo",
  "refresh_expires_at": "2026-10-29T04:25:52.034037801Z",
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
  "session_id": "78918436-0356-4374-86fb-1324a1e4b8cd",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU2NTIsImlhdCI6MTc5MzIwNDc1MiwianRpIjoiNGE1OTRlYzMtMTg0Ny00ODM5LWJmYzktYWFiMWZhNDlmMzFjIiwic2lkIjoiNzg5MTg0MzYtMDM1Ni00Mzc0LTg2ZmItMTMyNGExZTRiOGNkIn0.HXZyP0ajrjSWY_B-1-PBQwck5eEAiOxCghqkvs9ndHo",
  "access_expires_at": "2026-10-28T16:40:52.59997605Z",
  "refresh_token": "bRNMgRQrH94p6VkRRDyKvu-cC9fYnmrNNwbYe6aYNUg",
  "refresh_expires_at": "2026-10-29T04:25:52.599396478Z",
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
  "command_id": "3f6452fd-2e2c-4b9a-bbd3-96879d8a1252",
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
  "id": "4dd943b5-a410-4119-9796-e56a1839e341",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:30:53.135161Z",
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
  "command_id": "50e38438-dbd5-4426-a27a-2e2458f01e0e",
  "quote_id": "4dd943b5-a410-4119-9796-e56a1839e341",
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
  "id": "ea47c169-94fb-49f7-96bf-f033e07ebc8f",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30ad4d8e-9049-44c6-b2d7-aa1fefd325ef",
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
  "created_at": "2026-10-28T16:25:53.417605Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ea47c169-94fb-49f7-96bf-f033e07ebc8f` → **200**

```json
{
  "id": "ea47c169-94fb-49f7-96bf-f033e07ebc8f",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30ad4d8e-9049-44c6-b2d7-aa1fefd325ef",
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
  "created_at": "2026-10-28T16:25:53.417605Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ea47c169-94fb-49f7-96bf-f033e07ebc8f/cancel` → **200**

```json
{
  "command_id": "4f26a5f6-1e89-4c67-9884-bc799fcd9fac",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "ea47c169-94fb-49f7-96bf-f033e07ebc8f",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "30ad4d8e-9049-44c6-b2d7-aa1fefd325ef",
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
  "created_at": "2026-10-28T16:25:53.417605Z",
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
  "command_id": "38349a79-0fcc-4243-bd41-55fae4c830c0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:25:54Z",
    "sequence": 1793204754572
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "60eac934-254f-4aeb-8bce-e888ca0a2a74",
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
  "last_heartbeat_at": "2026-10-28T16:25:54.591727Z",
  "last_location_at": "2026-10-28T16:25:54.591727Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11348"
}
```

```json
{
  "challenge_id": "3fa4a71e-11ab-46e7-8d92-a9b96dbb0998",
  "expires_at": "2026-10-28T16:30:54.862364098Z",
  "resend_available_at": "2026-10-28T16:25:55.862364098Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "979491",
  "sent_at": "2026-10-28T16:25:54.865608597Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3fa4a71e-11ab-46e7-8d92-a9b96dbb0998",
  "code": "979491",
  "device_ref": "sandbox-11348"
}
```

```json
{
  "session_id": "15b7ccf7-cbec-4104-8d94-200dfd8216ea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTY1NSwiaWF0IjoxNzkzMjA0NzU1LCJqdGkiOiJjOGEwMmViNS03ZmFiLTQ2ODktYjQyOC03NDAxNzA1ZjlhYzUiLCJzaWQiOiIxNWI3Y2NmNy1jYmVjLTQxMDQtOGQ5NC0yMDBkZmQ4MjE2ZWEifQ.W0MHykvNRq5UUbboEpve5G3fJdfCPVXT9lviRk5quxs",
  "access_expires_at": "2026-10-28T16:40:55.185453565Z",
  "refresh_token": "cs79abP0SFUJacJPM1GHEyu8jYt5cJZ0S81y-zTrP3s",
  "refresh_expires_at": "2026-11-27T16:25:55.184762126Z",
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
  "command_id": "33c03c9d-2396-4656-a50f-5057102678d4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:25:55Z",
    "sequence": 1793204755723
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00f95f7d-10d3-4cab-9c3f-344a87735940",
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
  "last_heartbeat_at": "2026-10-28T16:25:55.743108Z",
  "last_location_at": "2026-10-28T16:25:55.743108Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6b73822c-bd70-42ae-9212-7a0042e1cb79",
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
  "id": "a42ac15f-c700-4b7d-9ee6-b8e524b1f888",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:30:56.022004Z",
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
  "command_id": "dde6ad89-df6f-4491-a9bd-5cba5a0c0ac3",
  "quote_id": "a42ac15f-c700-4b7d-9ee6-b8e524b1f888",
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
  "id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30ad4d8e-9049-44c6-b2d7-aa1fefd325ef",
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
  "created_at": "2026-10-28T16:25:56.306087Z",
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
    "id": "5dcfa62c-830b-48d5-9b30-b1c4abc71859",
    "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
    "expires_at": "2026-10-28T16:26:11.310154Z",
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

`POST /api/driver/v1/offers/5dcfa62c-830b-48d5-9b30-b1c4abc71859/accept` → **200**

```json
{
  "command_id": "89df9657-804b-4438-a556-b43e82c0c6c0"
}
```

```json
{
  "id": "b9c5029d-6f5e-4189-b240-3521b8732541",
  "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4f2905c3-0969-4d39-9a07-a130137b3608",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4f2905c3-0969-4d39-9a07-a130137b3608",
  "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
  "assignment_id": "b9c5029d-6f5e-4189-b240-3521b8732541",
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

`POST /api/driver/v1/trips/4f2905c3-0969-4d39-9a07-a130137b3608/cancel` → **200**

```json
{
  "command_id": "0fa8662e-dce6-4fb8-a000-8ab21cc3ef5b",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "4f2905c3-0969-4d39-9a07-a130137b3608",
  "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
  "assignment_id": "b9c5029d-6f5e-4189-b240-3521b8732541",
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

`GET /api/rider/v1/orders/06eb1e24-7f5e-4902-a4de-70e842858d64` → **200**

```json
{
  "id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "30ad4d8e-9049-44c6-b2d7-aa1fefd325ef",
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
    "id": "b9c5029d-6f5e-4189-b240-3521b8732541",
    "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4f2905c3-0969-4d39-9a07-a130137b3608",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:25:56.306087Z",
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
    "id": "422fab7e-a2e5-488b-9695-b077b37ee627",
    "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
    "expires_at": "2026-10-28T16:26:12.440568Z",
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

`POST /api/driver/v1/offers/422fab7e-a2e5-488b-9695-b077b37ee627/accept` → **200**

```json
{
  "command_id": "25355aea-f3c6-4714-ab4d-4b20f229d3c8"
}
```

```json
{
  "id": "7a2f2026-32fd-40ca-b263-3744575f6cff",
  "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b4410991-0910-47de-9abe-e568ffb434db",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b4410991-0910-47de-9abe-e568ffb434db",
  "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
  "assignment_id": "7a2f2026-32fd-40ca-b263-3744575f6cff",
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

`POST /api/driver/v1/trips/b4410991-0910-47de-9abe-e568ffb434db/cancel` → **200**

```json
{
  "command_id": "b929062d-95e4-4963-9641-42d67ca81fd8",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "b4410991-0910-47de-9abe-e568ffb434db",
  "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
  "assignment_id": "7a2f2026-32fd-40ca-b263-3744575f6cff",
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
    "id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:25:56.306087Z",
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
    "id": "ea47c169-94fb-49f7-96bf-f033e07ebc8f",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:25:53.417605Z",
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

`GET /api/operator/v1/orders/06eb1e24-7f5e-4902-a4de-70e842858d64/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:25:56.306703Z",
      "actor": {
        "type": "CLIENT",
        "id": "30ad4d8e-9049-44c6-b2d7-aa1fefd325ef",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
        "quote_id": "a42ac15f-c700-4b7d-9ee6-b8e524b1f888",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "afb667c3-2973-41b2-bf3b-5f5e1dbc37aa"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:25:56.309106Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
        "attempt_id": "a3f958d3-083d-4218-81fd-aa360817377f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "afb667c3-2973-41b2-bf3b-5f5e1dbc37aa"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:25:56.316827Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5dcfa62c-830b-48d5-9b30-b1c4abc71859",
        "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "afb667c3-2973-41b2-bf3b-5f5e1dbc37aa"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:25:56.877731Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "5dcfa62c-830b-48d5-9b30-b1c4abc71859",
        "order_id": "06eb1e24-7f5e-4902-a4de-70e842858d64",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "b9c5029d-6f5e-4189-b240-3521b8732541"
      },
      "correlation_id": "35b51776-f13a-4015-9ae6-298284579585"
```

Done: orders ea47c169-94fb-49f7-96bf-f033e07ebc8f, 06eb1e24-7f5e-4902-a4de-70e842858d64.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736811135",
  "device_ref": "sandbox-7113"
}
```

```json
{
  "challenge_id": "dcc0e724-36b8-48b6-b31a-8428487b6a24",
  "expires_at": "2026-10-28T16:30:59.75440835Z",
  "resend_available_at": "2026-10-28T16:26:00.75440835Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736811135` → **200**

```json
{
  "phone": "+380736811135",
  "audience": "CLIENT",
  "code": "019288",
  "sent_at": "2026-10-28T16:25:59.757269511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dcc0e724-36b8-48b6-b31a-8428487b6a24",
  "code": "019288",
  "device_ref": "sandbox-7113"
}
```

```json
{
  "session_id": "1c6b2d2d-4291-422b-a2ff-0f6b00806141",
  "subject": {
    "type": "CLIENT",
    "id": "e1063f85-0d5a-483c-a9a8-ffcb42f07de8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTA2M2Y4NS0wZDVhLTQ4M2MtYTlhOC1mZmNiNDJmMDdkZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NjYwLCJpYXQiOjE3OTMyMDQ3NjAsImp0aSI6IjJlZjAwZWIwLTM4OTgtNDRkOS1iZmFmLWIyMjZmYjRmMDRhNiIsInNpZCI6IjFjNmIyZDJkLTQyOTEtNDIyYi1hMmZmLTBmNmIwMDgwNjE0MSJ9.MQWIBHCVnsN2F3PrBhmq0QKbfS5bcuLJOTEeB_i_ROM",
  "access_expires_at": "2026-10-28T16:41:00.070184503Z",
  "refresh_token": "-jLx4RB0nYdLodc8RuA2OhunUd_eCNF8VQni_FTVuvk",
  "refresh_expires_at": "2026-11-27T16:26:00.069460439Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "1c610e8b-3794-47cc-b3f7-4d725c05cc1c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "1659cf2b-fe84-4cf2-8bd4-d570670bd6ae",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-1659cf2b-fe84-4cf2-8bd4-d570670bd6ae",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "2dace7e32cf6c0d16a98d32ffe04eed5",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=1659cf2b-fe84-4cf2-8bd4-d570670bd6ae",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736811135"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=1659cf2b-fe84-4cf2-8bd4-d570670bd6ae",
  "expires_at": "2026-10-28T16:56:00.347324Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/1659cf2b-fe84-4cf2-8bd4-d570670bd6ae` → **200**

```json
{
  "id": "1659cf2b-fe84-4cf2-8bd4-d570670bd6ae",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T16:56:00.347324Z",
  "card": {
    "id": "a4353cc9-2a73-4037-87f8-ce71231bcf76",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4418",
    "card_type": "Visa",
    "created_at": "2026-10-28T16:26:00.642423Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "a4353cc9-2a73-4037-87f8-ce71231bcf76",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4418",
      "card_type": "Visa",
      "created_at": "2026-10-28T16:26:00.642423Z"
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
  "device_ref": "sandbox-9186"
}
```

```json
{
  "challenge_id": "82955db7-bc72-4f99-95e7-0a49ff5e9a23",
  "expires_at": "2026-10-28T16:31:01.19641645Z",
  "resend_available_at": "2026-10-28T16:26:02.19641645Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "183934",
  "sent_at": "2026-10-28T16:26:01.199624973Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82955db7-bc72-4f99-95e7-0a49ff5e9a23",
  "code": "183934",
  "device_ref": "sandbox-9186"
}
```

```json
{
  "session_id": "9ec33189-f168-431a-af20-6459ebea8dc4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTY2MSwiaWF0IjoxNzkzMjA0NzYxLCJqdGkiOiI1OWNkMDFkZi1jMWVkLTQzMmYtODJiOC02Y2RmOWI2ZjI5OTAiLCJzaWQiOiI5ZWMzMzE4OS1mMTY4LTQzMWEtYWYyMC02NDU5ZWJlYThkYzQifQ.zCklqwckXdY2Pl9xrW0o_G8lw59YyfXV-ST9rYpGRX0",
  "access_expires_at": "2026-10-28T16:41:01.495711045Z",
  "refresh_token": "73Ti7RmjA2dpkPRmfSRbbNt_VZoxuFjIS5u4Wk3kiyo",
  "refresh_expires_at": "2026-11-27T16:26:01.494982043Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00f95f7d-10d3-4cab-9c3f-344a87735940",
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
  "last_heartbeat_at": "2026-10-28T16:25:55.743108Z",
  "last_location_at": "2026-10-28T16:25:55.743108Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/00f95f7d-10d3-4cab-9c3f-344a87735940/handover` → **200**

```json
{
  "command_id": "e37ebd88-ddcb-4986-bb12-40672c91d6ef",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00f95f7d-10d3-4cab-9c3f-344a87735940",
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
  "last_heartbeat_at": "2026-10-28T16:25:55.743108Z",
  "last_location_at": "2026-10-28T16:25:55.743108Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/00f95f7d-10d3-4cab-9c3f-344a87735940/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:26:02Z",
    "sequence": 1793204762326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00f95f7d-10d3-4cab-9c3f-344a87735940",
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
  "last_heartbeat_at": "2026-10-28T16:26:02.346133Z",
  "last_location_at": "2026-10-28T16:26:02.346133Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0fabd590-a8fb-4d92-9d72-e3542560473a",
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
  "id": "d930f458-99b1-429f-8c06-f1e830b80191",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:31:02.623762Z",
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
  "command_id": "4b60783d-9713-4f0e-82a0-b4194b864fa0",
  "quote_id": "d930f458-99b1-429f-8c06-f1e830b80191",
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
  "id": "229ecec8-92d5-4282-af6f-b28f80267243",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e1063f85-0d5a-483c-a9a8-ffcb42f07de8",
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
  "created_at": "2026-10-28T16:26:02.91078Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/229ecec8-92d5-4282-af6f-b28f80267243` → **200**

```json
{
  "id": "229ecec8-92d5-4282-af6f-b28f80267243",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e1063f85-0d5a-483c-a9a8-ffcb42f07de8",
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
  "created_at": "2026-10-28T16:26:02.91078Z",
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
    "id": "dcd63ee3-d878-4e01-83dd-f5ca974a3548",
    "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
    "expires_at": "2026-10-28T16:26:18.163799Z",
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

`POST /api/driver/v1/offers/dcd63ee3-d878-4e01-83dd-f5ca974a3548/accept` → **200**

```json
{
  "command_id": "e0fbbee9-b0e6-4af4-8140-66125afdeee3"
}
```

```json
{
  "id": "fc8e5ccc-9d0f-4296-9322-e4234c133265",
  "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5226329d-8ad9-4a5e-9aa5-915a40155053",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5226329d-8ad9-4a5e-9aa5-915a40155053",
  "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
  "assignment_id": "fc8e5ccc-9d0f-4296-9322-e4234c133265",
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

`POST /api/driver/v1/work-sessions/00f95f7d-10d3-4cab-9c3f-344a87735940/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:26:04Z",
    "sequence": 1793204764306
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00f95f7d-10d3-4cab-9c3f-344a87735940",
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
  "last_heartbeat_at": "2026-10-28T16:26:04.326079Z",
  "last_location_at": "2026-10-28T16:26:04.326079Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5226329d-8ad9-4a5e-9aa5-915a40155053/arrive` → **200**

```json
{
  "command_id": "d6ab9ec6-33bf-4cfc-9732-141c3cd1d050",
  "expected_version": 0
}
```

```json
{
  "id": "5226329d-8ad9-4a5e-9aa5-915a40155053",
  "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
  "assignment_id": "fc8e5ccc-9d0f-4296-9322-e4234c133265",
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
  "arrived_at": "2026-10-28T16:26:04.600714Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5226329d-8ad9-4a5e-9aa5-915a40155053/start` → **200**

```json
{
  "command_id": "0c7e3250-3666-4397-98b7-0f93b1660f90",
  "expected_version": 1
}
```

```json
{
  "id": "5226329d-8ad9-4a5e-9aa5-915a40155053",
  "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
  "assignment_id": "fc8e5ccc-9d0f-4296-9322-e4234c133265",
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
  "arrived_at": "2026-10-28T16:26:04.600714Z",
  "started_at": "2026-10-28T16:26:04.885363Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5226329d-8ad9-4a5e-9aa5-915a40155053/complete` → **200**

```json
{
  "command_id": "90626eda-e959-4475-9673-588092f5a3fd",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:26:05Z",
  "cash_received": true
}
```

```json
{
  "id": "5226329d-8ad9-4a5e-9aa5-915a40155053",
  "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
  "assignment_id": "fc8e5ccc-9d0f-4296-9322-e4234c133265",
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
  "arrived_at": "2026-10-28T16:26:04.600714Z",
  "started_at": "2026-10-28T16:26:04.885363Z",
  "completed_at": "2026-10-28T16:26:05.185376Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/229ecec8-92d5-4282-af6f-b28f80267243` → **200**

```json
{
  "id": "229ecec8-92d5-4282-af6f-b28f80267243",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e1063f85-0d5a-483c-a9a8-ffcb42f07de8",
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
    "id": "fc8e5ccc-9d0f-4296-9322-e4234c133265",
    "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5226329d-8ad9-4a5e-9aa5-915a40155053",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:26:02.91078Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/229ecec8-92d5-4282-af6f-b28f80267243` → **200**

```json
{
  "id": "229ecec8-92d5-4282-af6f-b28f80267243",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "e1063f85-0d5a-483c-a9a8-ffcb42f07de8",
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
    "id": "fc8e5ccc-9d0f-4296-9322-e4234c133265",
    "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5226329d-8ad9-4a5e-9aa5-915a40155053",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:26:02.91078Z",
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

`GET /api/rider/v1/orders/229ecec8-92d5-4282-af6f-b28f80267243/tip` → **200**

```json
{
  "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
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
  "available_until": "2026-10-29T16:26:05.185376Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/229ecec8-92d5-4282-af6f-b28f80267243/tip` → **201**

```json
{
  "command_id": "40cdad72-1e74-4cc0-b60b-6e99c5747946",
  "amount_minor": 2500
}
```

```json
{
  "id": "dc2b1d63-2090-4156-b7e4-a74f719e7694",
  "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T16:26:07.618675Z"
}
```

`GET /api/rider/v1/orders/229ecec8-92d5-4282-af6f-b28f80267243/tip` → **200**

```json
{
  "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
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
  "available_until": "2026-10-29T16:26:05.185376Z",
  "open": false,
  "tip": {
    "id": "dc2b1d63-2090-4156-b7e4-a74f719e7694",
    "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T16:26:07.618675Z"
  }
}
```

`GET /api/rider/v1/orders/229ecec8-92d5-4282-af6f-b28f80267243/tip` → **200**

```json
{
  "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
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
  "available_until": "2026-10-29T16:26:05.185376Z",
  "open": false,
  "tip": {
    "id": "dc2b1d63-2090-4156-b7e4-a74f719e7694",
    "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T16:26:07.618675Z"
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
      "id": "aee34dd6-37fc-4a6d-b340-d48b3bd2239d",
      "at": "2026-10-28T16:26:09.288395Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
      "counterpart_id": null
    },
    {
      "id": "b51cd554-5370-4816-9d62-139407e9bcf4",
      "at": "2026-10-28T16:26:05.229761Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a992710f-957d-4313-8b20-4dd70ba86647",
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
  "id": "b53ef0a4-4f8b-488a-be1e-c0369895e6b1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:31:09.740832Z",
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
  "session_id": "92bf17c4-f7c2-4219-8444-f0d494840ef3",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU2NzAsImlhdCI6MTc5MzIwNDc3MCwianRpIjoiNWNjYWVmYjEtNWEwZi00ZjllLWIzMTctM2JjMTUwMTQwMWFhIiwic2lkIjoiOTJiZjE3YzQtZjdjMi00MjE5LTg0NDQtZjBkNDk0ODQwZWYzIn0.jRn7kMfsLCnppMQdD7qRanZIAh-4y0rFSd2n83ICSIk",
  "access_expires_at": "2026-10-28T16:41:10.32335399Z",
  "refresh_token": "CwMx30sgDkoBwm6ay9ufnvlg3InX39feFdsvX1PqZUI",
  "refresh_expires_at": "2026-10-29T04:26:10.322588781Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380736811135` → **200**

```json
{
  "client_id": "e1063f85-0d5a-483c-a9a8-ffcb42f07de8"
}
```

`POST /api/admin/v1/rider-wallets/e1063f85-0d5a-483c-a9a8-ffcb42f07de8/top-ups` → **201**

```json
{
  "command_id": "a9ead68c-1284-4566-8def-c31e42d412ea",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "e1063f85-0d5a-483c-a9a8-ffcb42f07de8",
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
      "id": "d4e18de0-3292-400b-a97c-4a33c2097e5b",
      "at": "2026-10-28T16:26:10.853676Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4fd17ac9-78b2-4f77-b970-4c7a6050880d",
  "quote_id": "b53ef0a4-4f8b-488a-be1e-c0369895e6b1",
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
  "id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e1063f85-0d5a-483c-a9a8-ffcb42f07de8",
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
  "created_at": "2026-10-28T16:26:11.157857Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e19620fb-3f14-4b54-8a4e-c3420662e187` → **200**

```json
{
  "id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e1063f85-0d5a-483c-a9a8-ffcb42f07de8",
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
  "created_at": "2026-10-28T16:26:11.157857Z",
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
    "id": "5293b634-b8b0-43a9-b537-e6471644e4ef",
    "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
    "expires_at": "2026-10-28T16:26:26.163525Z",
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

`POST /api/driver/v1/offers/5293b634-b8b0-43a9-b537-e6471644e4ef/accept` → **200**

```json
{
  "command_id": "6e993b05-b452-4463-b4aa-52ed2e0cac95"
}
```

```json
{
  "id": "7649fc4e-e58a-4797-a625-0d27e15437d2",
  "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3a61002d-1a87-487c-ad3b-b40811c1b741",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3a61002d-1a87-487c-ad3b-b40811c1b741",
  "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
  "assignment_id": "7649fc4e-e58a-4797-a625-0d27e15437d2",
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

`POST /api/driver/v1/work-sessions/00f95f7d-10d3-4cab-9c3f-344a87735940/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:26:12Z",
    "sequence": 1793204772553
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00f95f7d-10d3-4cab-9c3f-344a87735940",
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
  "last_heartbeat_at": "2026-10-28T16:26:12.573606Z",
  "last_location_at": "2026-10-28T16:26:12.573606Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3a61002d-1a87-487c-ad3b-b40811c1b741/arrive` → **200**

```json
{
  "command_id": "7ed62b6d-bd27-45e8-a44c-57537b6dee58",
  "expected_version": 0
}
```

```json
{
  "id": "3a61002d-1a87-487c-ad3b-b40811c1b741",
  "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
  "assignment_id": "7649fc4e-e58a-4797-a625-0d27e15437d2",
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
  "arrived_at": "2026-10-28T16:26:12.857377Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3a61002d-1a87-487c-ad3b-b40811c1b741/start` → **200**

```json
{
  "command_id": "8776961c-95eb-4784-9772-ee0f9b5c7628",
  "expected_version": 1
}
```

```json
{
  "id": "3a61002d-1a87-487c-ad3b-b40811c1b741",
  "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
  "assignment_id": "7649fc4e-e58a-4797-a625-0d27e15437d2",
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
  "arrived_at": "2026-10-28T16:26:12.857377Z",
  "started_at": "2026-10-28T16:26:13.140178Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3a61002d-1a87-487c-ad3b-b40811c1b741/complete` → **200**

```json
{
  "command_id": "4f5b5813-d017-467b-956a-4a06b3c556b1",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:26:13Z",
  "cash_received": true
}
```

```json
{
  "id": "3a61002d-1a87-487c-ad3b-b40811c1b741",
  "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
  "assignment_id": "7649fc4e-e58a-4797-a625-0d27e15437d2",
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
  "arrived_at": "2026-10-28T16:26:12.857377Z",
  "started_at": "2026-10-28T16:26:13.140178Z",
  "completed_at": "2026-10-28T16:26:13.435932Z",
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
  "client_id": "e1063f85-0d5a-483c-a9a8-ffcb42f07de8",
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
      "id": "d4e18de0-3292-400b-a97c-4a33c2097e5b",
      "at": "2026-10-28T16:26:10.853676Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
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

`GET /api/rider/v1/orders/e19620fb-3f14-4b54-8a4e-c3420662e187/tip` → **200**

```json
{
  "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
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
  "available_until": "2026-10-29T16:26:13.435932Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e19620fb-3f14-4b54-8a4e-c3420662e187/tip` → **201**

```json
{
  "command_id": "4633f193-d372-4e0c-9eaf-178062d01839",
  "amount_minor": 2500
}
```

```json
{
  "id": "796ab8de-18ef-4591-9467-3e3d3f7a4565",
  "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T16:26:14.538826Z"
}
```

`GET /api/rider/v1/orders/e19620fb-3f14-4b54-8a4e-c3420662e187/tip` → **200**

```json
{
  "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
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
  "available_until": "2026-10-29T16:26:13.435932Z",
  "open": false,
  "tip": {
    "id": "796ab8de-18ef-4591-9467-3e3d3f7a4565",
    "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T16:26:14.538826Z"
  }
}
```

`GET /api/rider/v1/orders/e19620fb-3f14-4b54-8a4e-c3420662e187/tip` → **200**

```json
{
  "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
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
  "available_until": "2026-10-29T16:26:13.435932Z",
  "open": false,
  "tip": {
    "id": "796ab8de-18ef-4591-9467-3e3d3f7a4565",
    "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T16:26:14.538826Z"
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
      "id": "e360e0a6-9dd0-4aca-82bc-02ded568383f",
      "at": "2026-10-28T16:26:16.358945Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
      "counterpart_id": null
    },
    {
      "id": "a4db886c-770b-46ad-8967-a13d7b7ef270",
      "at": "2026-10-28T16:26:14.333428Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e19620fb-3f14-4b54-8a4e-c3420662e187",
      "counterpart_id": null
    },
    {
      "id": "aee34dd6-37fc-4a6d-b340-d48b3bd2239d",
      "at": "2026-10-28T16:26:09.288395Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
      "counterpart_id": null
    },
    {
      "id": "b51cd554-5370-4816-9d62-139407e9bcf4",
      "at": "2026-10-28T16:26:05.229761Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "229ecec8-92d5-4282-af6f-b28f80267243",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00f95f7d-10d3-4cab-9c3f-344a87735940",
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
  "last_heartbeat_at": "2026-10-28T16:26:12.573606Z",
  "last_location_at": "2026-10-28T16:26:12.573606Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/00f95f7d-10d3-4cab-9c3f-344a87735940/close` → **200**

```json
{
  "command_id": "b32bfa33-fdd4-452e-ba30-0c2d2b7e5109",
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

Done: card order e19620fb-3f14-4b54-8a4e-c3420662e187.

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
  "phone": "+380739629775",
  "device_ref": "sandbox-27315"
}
```

```json
{
  "challenge_id": "6ca04957-453c-4b24-a840-53f04003fa36",
  "expires_at": "2026-10-28T16:31:17.51845519Z",
  "resend_available_at": "2026-10-28T16:26:18.51845519Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739629775` → **200**

```json
{
  "phone": "+380739629775",
  "audience": "CLIENT",
  "code": "274429",
  "sent_at": "2026-10-28T16:26:17.521291307Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ca04957-453c-4b24-a840-53f04003fa36",
  "code": "274429",
  "device_ref": "sandbox-27315"
}
```

```json
{
  "session_id": "e77a9544-7dfc-4c80-8ae7-136186297414",
  "subject": {
    "type": "CLIENT",
    "id": "3a0a9ec9-9701-4202-8d30-830cebcded11"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTBhOWVjOS05NzAxLTQyMDItOGQzMC04MzBjZWJjZGVkMTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1Njc3LCJpYXQiOjE3OTMyMDQ3NzcsImp0aSI6IjgzMGYwOWU3LWY5MTItNDdiZi1hODQ1LWFiY2JiOTllZThhNCIsInNpZCI6ImU3N2E5NTQ0LTdkZmMtNGM4MC04YWU3LTEzNjE4NjI5NzQxNCJ9.ZocXwNslq6HHq31zTYzFyrz6feTVcvVc3kFzVDdsOls",
  "access_expires_at": "2026-10-28T16:41:17.831504638Z",
  "refresh_token": "fx0PfQ0P9ss2V7bh0PlpQRWRvoCOO_kqLMU949BOCRA",
  "refresh_expires_at": "2026-11-27T16:26:17.830850138Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "70d40d26-ba90-4e9c-8d44-e563293a869b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "52cfca0d-e1b5-4e7f-b0c4-5a0ffa6428a6",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-52cfca0d-e1b5-4e7f-b0c4-5a0ffa6428a6",
    "orderDate": "1793204778",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "aabe052f50d1f45fccc27c47bace2088",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=52cfca0d-e1b5-4e7f-b0c4-5a0ffa6428a6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739629775"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=52cfca0d-e1b5-4e7f-b0c4-5a0ffa6428a6",
  "created_at": "2026-10-28T16:26:18.154381Z",
  "expires_at": "2026-10-28T16:56:18.154381Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/52cfca0d-e1b5-4e7f-b0c4-5a0ffa6428a6` → **200**

```json
{
  "id": "52cfca0d-e1b5-4e7f-b0c4-5a0ffa6428a6",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T16:26:18.154381Z",
  "expires_at": "2026-10-28T16:56:18.154381Z",
  "completed_at": "2026-10-28T16:26:18.475411Z",
  "masked_pan": "41****7143",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3a0a9ec9-9701-4202-8d30-830cebcded11",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3a0a9ec9-9701-4202-8d30-830cebcded11",
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
      "id": "b07b92c2-047a-4449-b6e0-c303c927b275",
      "at": "2026-10-28T16:26:19.377929Z",
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
  "client_id": "3a0a9ec9-9701-4202-8d30-830cebcded11",
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
      "id": "b07b92c2-047a-4449-b6e0-c303c927b275",
      "at": "2026-10-28T16:26:19.377929Z",
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
  "device_ref": "sandbox-4624"
}
```

```json
{
  "challenge_id": "0ede4860-ef65-4910-9665-bb465bf7ca08",
  "expires_at": "2026-10-28T16:31:20.636700784Z",
  "resend_available_at": "2026-10-28T16:26:21.636700784Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "389363",
  "sent_at": "2026-10-28T16:26:20.639550654Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ede4860-ef65-4910-9665-bb465bf7ca08",
  "code": "389363",
  "device_ref": "sandbox-4624"
}
```

```json
{
  "session_id": "b68a22b4-3e3c-4636-84ee-fb61e75aa313",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTY4MCwiaWF0IjoxNzkzMjA0NzgwLCJqdGkiOiJlNmRhMGEzYi1kYjFiLTQwYmYtYWFlOS1hMTAzYjJhNDJlYTciLCJzaWQiOiJiNjhhMjJiNC0zZTNjLTQ2MzYtODRlZS1mYjYxZTc1YWEzMTMifQ.Rn663RxGRxtFNrdBvARspio8hr1Jjg8SAJqzSQeOx4w",
  "access_expires_at": "2026-10-28T16:41:20.932217579Z",
  "refresh_token": "9Zf1unG879etAvtDvoEgHGsh7Z7womWkkWl8k6zgma0",
  "refresh_expires_at": "2026-11-27T16:26:20.931642064Z",
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
  "command_id": "82820251-7992-4e11-9411-5fc2093c7c2b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "df355510-f787-434d-89e7-93c235ba77aa",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-df355510-f787-434d-89e7-93c235ba77aa",
    "orderDate": "1793204781",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "208e2220e30345ec19acaf6978dcfc57",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=df355510-f787-434d-89e7-93c235ba77aa",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=df355510-f787-434d-89e7-93c235ba77aa",
  "created_at": "2026-10-28T16:26:21.471521Z",
  "expires_at": "2026-10-28T16:56:21.471521Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/df355510-f787-434d-89e7-93c235ba77aa` → **200**

```json
{
  "id": "df355510-f787-434d-89e7-93c235ba77aa",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T16:26:21.471521Z",
  "expires_at": "2026-10-28T16:56:21.471521Z",
  "completed_at": "2026-10-28T16:26:21.735101Z",
  "masked_pan": "41****5094",
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
      "id": "26cf354c-88d4-42a9-8209-ad613d294786",
      "at": "2026-10-28T16:26:22.385463Z",
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
  "command_id": "08617e44-bbf7-4093-9d3a-9e43a5e812d9",
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
  "correlation_id": "53131047-405f-4328-94b0-6d3c068b07a7"
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
  "session_id": "475ba857-fbcd-4c10-87ad-cc24a14a0b34",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU2ODQsImlhdCI6MTc5MzIwNDc4NCwianRpIjoiNGY4MzhkZTMtODZiNi00Njg3LThmOGItMTk2Njc2YTY2OGMzIiwic2lkIjoiNDc1YmE4NTctZmJjZC00YzEwLTg3YWQtY2MyNGExNGEwYjM0In0.J4umd0msyxophcb8dYWK4QzRbJWMycss09sV-VBBi8M",
  "access_expires_at": "2026-10-28T16:41:24.154109788Z",
  "refresh_token": "QJTwZcp-fekWNToiyiJT-qNEoKXTeswZt03_CjgLqjc",
  "refresh_expires_at": "2026-10-29T04:26:24.153514987Z",
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
  "phone": "+48600115796",
  "device_ref": "sandbox-32111"
}
```

```json
{
  "challenge_id": "8ff22a7d-b242-455b-8bcd-e70e729e1711",
  "expires_at": "2026-10-28T16:31:24.983239542Z",
  "resend_available_at": "2026-10-28T16:26:25.983239542Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600115796` → **200**

```json
{
  "phone": "+48600115796",
  "audience": "CLIENT",
  "code": "496760",
  "sent_at": "2026-10-28T16:26:24.98565914Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ff22a7d-b242-455b-8bcd-e70e729e1711",
  "code": "496760",
  "device_ref": "sandbox-32111"
}
```

```json
{
  "session_id": "7d630638-56c9-4611-9cc2-f7745ee33b56",
  "subject": {
    "type": "CLIENT",
    "id": "9e0676a3-7a41-4d45-8a9f-b0e38258899c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTA2NzZhMy03YTQxLTRkNDUtOGE5Zi1iMGUzODI1ODg5OWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1Njg1LCJpYXQiOjE3OTMyMDQ3ODUsImp0aSI6ImI4NGQ2ZGQ2LWYzNjYtNDhmNy1hMDFmLTczZTdlNWE2MDgxMyIsInNpZCI6IjdkNjMwNjM4LTU2YzktNDYxMS05Y2MyLWY3NzQ1ZWUzM2I1NiJ9.YBIjYUySBRpCc6rMMFlK63YGXaBeU1WIObOrNkdcN_U",
  "access_expires_at": "2026-10-28T16:41:25.281382998Z",
  "refresh_token": "qtbtRVuQ8Qw1VYVQntBv7g8CZD_H_CIVTePlmjLIsAk",
  "refresh_expires_at": "2026-11-27T16:26:25.280763752Z",
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
  "command_id": "a9515ff4-34f7-4669-b3ca-b3644cb0543a",
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
  "correlation_id": "06f89cc4-1165-4a42-8ae1-1d21d3ee6275",
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
  "command_id": "e4041ac0-c49e-4ba9-bea3-c0903e8c9ef4",
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
  "paused_at": "2026-10-28T16:26:26.41286585Z",
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
  "command_id": "9d815c57-98c9-437a-aba1-3b425637ec64",
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
  "id": "9a6c3f9f-a0b0-413b-a6d7-1f49af56d460",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:31:26.971877Z",
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
  "command_id": "cc0edeb4-dec6-42a0-9e42-aa186264d11c",
  "quote_id": "9a6c3f9f-a0b0-413b-a6d7-1f49af56d460",
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
  "correlation_id": "0dfa533c-4534-4af7-b047-c450ef7b2cd8"
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
  "paused_at": "2026-10-28T16:26:26.412866Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "97661a3f-6c5c-4b61-912b-293eebab1f68",
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
  "command_id": "bdad430f-9873-419f-b6e1-5577ae9cbbaf",
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
  "command_id": "e0ab6633-d3a9-4e6e-87fa-180744217d10",
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
  "id": "73daf131-91a4-4759-b0ea-f6532b49d5a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:31:28.629007Z",
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
  "command_id": "4e2595dc-cb68-4c70-b432-fd852b0e8c65",
  "quote_id": "73daf131-91a4-4759-b0ea-f6532b49d5a8",
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
  "correlation_id": "eb1b0a1e-c6f9-46e5-8167-9fe47ef44ac1"
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
  "command_id": "1e7bac34-3973-4de3-91e7-8816204defa7",
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
      "from": "19:00",
      "to": "20:00"
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
      "from": "19:00",
      "to": "20:00"
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
  "command_id": "fc65adfc-3481-4043-a632-431437ab8e10",
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
  "id": "e30d6e18-004e-4fbf-b14e-15484d0c5103",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:31:29.759838Z",
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
  "command_id": "2d815c7c-5787-40bb-8b4e-06b86174580d",
  "quote_id": "e30d6e18-004e-4fbf-b14e-15484d0c5103",
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
  "correlation_id": "b852f100-14f0-4b46-bf17-5e68000de631"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "7a27c99d-b1a2-4251-a998-76311b3f6c48",
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
  "correlation_id": "9a97ea80-e1ed-4759-bb8e-93a349b945c3"
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
      "from": "19:00",
      "to": "20:00"
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
  "command_id": "2927cc90-fffd-40ea-8f1c-6151a2b6189e",
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
  "phone": "+380675093988",
  "device_ref": "sandbox-30202"
}
```

```json
{
  "challenge_id": "388ca883-d1b9-496c-bd94-4b33736fe671",
  "expires_at": "2026-10-28T16:31:31.190518443Z",
  "resend_available_at": "2026-10-28T16:26:32.190518443Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675093988` → **200**

```json
{
  "phone": "+380675093988",
  "audience": "CLIENT",
  "code": "018767",
  "sent_at": "2026-10-28T16:26:31.192783755Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "388ca883-d1b9-496c-bd94-4b33736fe671",
  "code": "018767",
  "device_ref": "sandbox-30202"
}
```

```json
{
  "session_id": "5d066ddc-d6ab-4891-9d49-661f98d41170",
  "subject": {
    "type": "CLIENT",
    "id": "353a7d87-ab68-4343-a6e3-69f743db43f8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNTNhN2Q4Ny1hYjY4LTQzNDMtYTZlMy02OWY3NDNkYjQzZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NjkxLCJpYXQiOjE3OTMyMDQ3OTEsImp0aSI6IjY0YjNiMGJkLTYzZjYtNDRhNi04Nzc0LWEzOWViYmI4MWQxNiIsInNpZCI6IjVkMDY2ZGRjLWQ2YWItNDg5MS05ZDQ5LTY2MWY5OGQ0MTE3MCJ9.awf0eWWqu85kOlp0PnJ5hthyoN05WObr-OWAzwmdImE",
  "access_expires_at": "2026-10-28T16:41:31.491642418Z",
  "refresh_token": "tij6EBAO9rOUfk4l17Wzim8EY-30gdJtRJB7lTeBDsA",
  "refresh_expires_at": "2026-11-27T16:26:31.490959032Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "353a7d87-ab68-4343-a6e3-69f743db43f8",
  "session_id": "5d066ddc-d6ab-4891-9d49-661f98d41170",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c31e7a44-9625-45e4-a04c-af18ff0f766d",
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
  "id": "1041a88e-3d99-4e44-8bba-0c3dd9a3c97b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:31:32.027572Z",
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
  "challenge_id": "670cebb1-020e-4c49-b73e-0a7ac8e0021a",
  "expires_at": "2026-10-28T16:31:34.303750833Z",
  "resend_available_at": "2026-10-28T16:26:35.303750833Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675093988` → **200**

```json
{
  "phone": "+380675093988",
  "audience": "CLIENT",
  "code": "927885",
  "sent_at": "2026-10-28T16:26:34.305840756Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "b1694822-2e2d-4745-aa8b-a49100ed7726",
  "challenge_id": "670cebb1-020e-4c49-b73e-0a7ac8e0021a",
  "otp_code": "927885"
}
```

```json
{
  "client_id": "353a7d87-ab68-4343-a6e3-69f743db43f8",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T16:26:34.613684Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "8d0e4bf4-3d36-45d4-8dfb-91963cac64d5",
  "quote_id": "1041a88e-3d99-4e44-8bba-0c3dd9a3c97b",
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
  "correlation_id": "0b637ff8-444a-4656-9e12-5bb10e616bd2"
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
  "session_id": "e84a9c96-d297-4f2f-a90a-31569cdeee96",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU2OTUsImlhdCI6MTc5MzIwNDc5NSwianRpIjoiZGNhOTE2YjctZTRmZS00M2FjLTk2ZDMtNzU5MjU0NzQzODE4Iiwic2lkIjoiZTg0YTljOTYtZDI5Ny00ZjJmLWE5MGEtMzE1NjljZGVlZTk2In0.WAS2aoHEtU5tSl8QxjQXOHGfAVFupWEfl-iqBn41Rm8",
  "access_expires_at": "2026-10-28T16:41:35.457404398Z",
  "refresh_token": "UtKZbITPDLTMTOegFHLbZrft3hKntSThpVosvzypeGQ",
  "refresh_expires_at": "2026-10-29T04:26:35.456772047Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "353a7d87-ab68-4343-a6e3-69f743db43f8",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T16:26:34.613684Z",
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

`POST /api/admin/v1/client-deletions/353a7d87-ab68-4343-a6e3-69f743db43f8/complete` → **200**

```json
{
  "command_id": "2ee5ba4d-465e-4840-b59e-3ab9ac648869",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "353a7d87-ab68-4343-a6e3-69f743db43f8",
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
  "correlation_id": "a02222cb-2e8f-4dfd-93ca-97ac40ba6048"
}
```

Done: client 353a7d87-ab68-4343-a6e3-69f743db43f8 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660037326",
  "device_ref": "sandbox-8856"
}
```

```json
{
  "challenge_id": "9c1b66ba-99ac-45ae-9bc1-3beff594f8df",
  "expires_at": "2026-10-28T16:31:36.59270537Z",
  "resend_available_at": "2026-10-28T16:26:37.59270537Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660037326` → **200**

```json
{
  "phone": "+380660037326",
  "audience": "CLIENT",
  "code": "546458",
  "sent_at": "2026-10-28T16:26:36.59533362Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c1b66ba-99ac-45ae-9bc1-3beff594f8df",
  "code": "546458",
  "device_ref": "sandbox-8856"
}
```

```json
{
  "session_id": "0d67f7d7-90df-4eb3-ae63-0825c96ae3e8",
  "subject": {
    "type": "CLIENT",
    "id": "abc8dcff-afb0-4161-a2af-3afe65b0e714"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmM4ZGNmZi1hZmIwLTQxNjEtYTJhZi0zYWZlNjViMGU3MTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1Njk2LCJpYXQiOjE3OTMyMDQ3OTYsImp0aSI6IjIxNjRjZTY3LWQ2NGEtNGFjMS04NmViLTc1OTdjZmExMzM0NiIsInNpZCI6IjBkNjdmN2Q3LTkwZGYtNGViMy1hZTYzLTA4MjVjOTZhZTNlOCJ9.LGgsTcbNaGSZiOa0Hj3ByCny63zpITv1fC9f_ub9IsM",
  "access_expires_at": "2026-10-28T16:41:36.895365724Z",
  "refresh_token": "SDlrfH2TmUBNUb0X_GRymamuZptICT_Xa8_30LW3Gzc",
  "refresh_expires_at": "2026-11-27T16:26:36.89473684Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "abc8dcff-afb0-4161-a2af-3afe65b0e714",
  "session_id": "0d67f7d7-90df-4eb3-ae63-0825c96ae3e8",
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
  "session_id": "268b9433-e4c0-4cb8-87ef-25eed02b8fdc",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU2OTcsImlhdCI6MTc5MzIwNDc5NywianRpIjoiOGNjNTQyMTYtNjkwZC00MTQzLTljZGQtMGYyMzBjMDZjNjNhIiwic2lkIjoiMjY4Yjk0MzMtZTRjMC00Y2I4LTg3ZWYtMjVlZWQwMmI4ZmRjIn0.91QIGtD1IR_dj2x9cYmXSWEubHkjWGch_suZJtyOfYU",
  "access_expires_at": "2026-10-28T16:41:37.73699071Z",
  "refresh_token": "kUux5OtQEj8DO0vMMD9N4gsfPxmPbM4p7pNdyFsN-_k",
  "refresh_expires_at": "2026-10-29T04:26:37.736414033Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0037326&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "abc8dcff-afb0-4161-a2af-3afe65b0e714",
      "phone": "+380660037326",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T16:26:36.892675Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/abc8dcff-afb0-4161-a2af-3afe65b0e714` → **200**

```json
{
  "client": {
    "id": "abc8dcff-afb0-4161-a2af-3afe65b0e714",
    "phone": "+380660037326",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:26:36.892675Z",
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

`POST /api/admin/v1/clients/abc8dcff-afb0-4161-a2af-3afe65b0e714/block` → **400**

```json
{
  "command_id": "41c84163-506e-4992-bf72-7ffdad4219f6",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/abc8dcff-afb0-4161-a2af-3afe65b0e714/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "86acd8f4-bfbe-4157-ba62-14dc11f57ce2",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/abc8dcff-afb0-4161-a2af-3afe65b0e714/block` → **200**

```json
{
  "command_id": "dc36be19-c0f5-4a11-94fe-a390897b56ad",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "abc8dcff-afb0-4161-a2af-3afe65b0e714",
  "phone": "+380660037326",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T16:26:36.892675Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T16:26:38.926383Z",
    "by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
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
  "correlation_id": "09ccacb9-7acc-43f4-9728-4b801ac05a67"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660037326",
  "device_ref": "sandbox-19790"
}
```

```json
{
  "challenge_id": "7eec6a3e-8ca5-4da0-ac38-21789d81c5a6",
  "expires_at": "2026-10-28T16:31:41.487393682Z",
  "resend_available_at": "2026-10-28T16:26:42.487393682Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660037326` → **200**

```json
{
  "phone": "+380660037326",
  "audience": "CLIENT",
  "code": "530019",
  "sent_at": "2026-10-28T16:26:41.489943383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "7eec6a3e-8ca5-4da0-ac38-21789d81c5a6",
  "code": "530019",
  "device_ref": "sandbox-19790"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "ccf47053-cc61-4642-a901-80cc33bf91c2"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/abc8dcff-afb0-4161-a2af-3afe65b0e714` → **200**

```json
{
  "client": {
    "id": "abc8dcff-afb0-4161-a2af-3afe65b0e714",
    "phone": "+380660037326",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T16:26:36.892675Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T16:26:38.926383Z",
      "by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
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

`POST /api/admin/v1/clients/abc8dcff-afb0-4161-a2af-3afe65b0e714/unblock` → **200**

```json
{
  "command_id": "752adf48-2fdf-4352-b10f-91a2f9228804",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "abc8dcff-afb0-4161-a2af-3afe65b0e714",
  "phone": "+380660037326",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T16:26:36.892675Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660037326",
  "device_ref": "sandbox-13435"
}
```

```json
{
  "challenge_id": "c0bed474-19a0-4658-b43a-783d5815626e",
  "expires_at": "2026-10-28T16:31:44.663542842Z",
  "resend_available_at": "2026-10-28T16:26:45.663542842Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660037326` → **200**

```json
{
  "phone": "+380660037326",
  "audience": "CLIENT",
  "code": "437412",
  "sent_at": "2026-10-28T16:26:44.665822048Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0bed474-19a0-4658-b43a-783d5815626e",
  "code": "437412",
  "device_ref": "sandbox-13435"
}
```

```json
{
  "session_id": "c517ac8a-335c-4db1-9c99-2cd0fa884c38",
  "subject": {
    "type": "CLIENT",
    "id": "abc8dcff-afb0-4161-a2af-3afe65b0e714"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmM4ZGNmZi1hZmIwLTQxNjEtYTJhZi0zYWZlNjViMGU3MTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NzA0LCJpYXQiOjE3OTMyMDQ4MDQsImp0aSI6ImIyYjYxNjA4LWY3MDAtNDUwYy1hZjc5LWU4ODQxOWIxMGRlMiIsInNpZCI6ImM1MTdhYzhhLTMzNWMtNGRiMS05Yzk5LTJjZDBmYTg4NGMzOCJ9.s9P-PVcfxridD4O47yWsMAN2Hq-WZ4xfrbEct2u4mkI",
  "access_expires_at": "2026-10-28T16:41:44.964837796Z",
  "refresh_token": "5e_tHidn0TOkF2W8VIqTJf0ounLBApR273OY0cfDtTE",
  "refresh_expires_at": "2026-11-27T16:26:44.964263503Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "abc8dcff-afb0-4161-a2af-3afe65b0e714",
  "session_id": "c517ac8a-335c-4db1-9c99-2cd0fa884c38",
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
  "phone": "+380669246126",
  "device_ref": "sandbox-9753"
}
```

```json
{
  "challenge_id": "3e4e607d-f871-4659-a894-834488ab78fc",
  "expires_at": "2026-10-28T16:31:45.513623181Z",
  "resend_available_at": "2026-10-28T16:26:46.513623181Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669246126` → **200**

```json
{
  "phone": "+380669246126",
  "audience": "CLIENT",
  "code": "013878",
  "sent_at": "2026-10-28T16:26:45.515953334Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e4e607d-f871-4659-a894-834488ab78fc",
  "code": "013878",
  "device_ref": "sandbox-9753"
}
```

```json
{
  "session_id": "7081693b-22ef-4c62-8eaa-9fb0226d759a",
  "subject": {
    "type": "CLIENT",
    "id": "403f4007-5cdd-49e0-b006-537b2ec6feba"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDNmNDAwNy01Y2RkLTQ5ZTAtYjAwNi01MzdiMmVjNmZlYmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NzA1LCJpYXQiOjE3OTMyMDQ4MDUsImp0aSI6ImFhMDIzODhhLTQ5NGUtNDNlOC1hODkyLTZmMDFmNGNmZDMzYSIsInNpZCI6IjcwODE2OTNiLTIyZWYtNGM2Mi04ZWFhLTlmYjAyMjZkNzU5YSJ9.GFoN8Ag7elEbxSTNmDRjx79kSC8YqNFqsj7vNti-gfk",
  "access_expires_at": "2026-10-28T16:41:45.839676204Z",
  "refresh_token": "2yKFtl42mWV4N5VIST3spm9UX46x3klO37De0vra9Vs",
  "refresh_expires_at": "2026-11-27T16:26:45.839147827Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d7a1fca9-536f-4ea5-b1b2-2e074ad90213",
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
  "id": "9d047fb4-45dd-422a-b243-d6b8d748b9e4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:31:46.125983Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: e9dde194-140d-44af-8277-2f75499949b0) → **201**

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
  "session_id": "20600ea0-4125-451d-b644-9f967dbafdd0",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3MDYsImlhdCI6MTc5MzIwNDgwNiwianRpIjoiYmU2NWI3MGYtMDQ5Yy00MmNiLTk5ZjItMmYzNzVkYjJlODU4Iiwic2lkIjoiMjA2MDBlYTAtNDEyNS00NTFkLWI2NDQtOWY5NjdkYmFmZGQwIn0.DvPBfrz5DoD931PRoqFgqdQ6dNn40fdOy_eSgJnS-88",
  "access_expires_at": "2026-10-28T16:41:46.746472344Z",
  "refresh_token": "_Q4zN7zJrVOQuzw-SCG4xF66xpQ4WnfX1QvvIfESsFc",
  "refresh_expires_at": "2026-10-29T04:26:46.745866012Z",
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
  "session_id": "f6b41410-879b-47dc-bb1c-d83df0365fe1",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3MDcsImlhdCI6MTc5MzIwNDgwNywianRpIjoiM2M3MjA0ZmYtMTEwZS00YTA0LTlmYTktMGMxMGIwMDBkMjU0Iiwic2lkIjoiZjZiNDE0MTAtODc5Yi00N2RjLWJiMWMtZDgzZGYwMzY1ZmUxIn0.ZuKa8pKiJfHoC-o393sGNIYC82YpSok_SMTRVQ-f_3I",
  "access_expires_at": "2026-10-28T16:41:47.310273567Z",
  "refresh_token": "lOpwXGiKeRj1oPPjnD4OO1U9D_qo0c44sDP6Bvqj3ek",
  "refresh_expires_at": "2026-10-29T04:26:47.309705627Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b79f1e2e-a16b-46a2-87cd-0298f099bac6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:26:46.411667Z",
      "actor": {
        "type": "CLIENT",
        "id": "403f4007-5cdd-49e0-b006-537b2ec6feba",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b79f1e2e-a16b-46a2-87cd-0298f099bac6",
        "quote_id": "9d047fb4-45dd-422a-b243-d6b8d748b9e4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e9dde194-140d-44af-8277-2f75499949b0"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:26:46.41411Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b79f1e2e-a16b-46a2-87cd-0298f099bac6",
        "attempt_id": "048e77d3-8d0c-4ae4-ac73-9704ffe87313",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e9dde194-140d-44af-8277-2f75499949b0"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T16:26:46.423905Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b79f1e2e-a16b-46a2-87cd-0298f099bac6",
        "attempt_id": "048e77d3-8d0c-4ae4-ac73-9704ffe87313"
      },
      "correlation_id": "e9dde194-140d-44af-8277-2f75499949b0"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "048e77d3-8d0c-4ae4-ac73-9704ffe87313",
        "generation": 1,
        "started_at": "2026-10-28T16:26:46.413029Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T16:26:46.423905Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T16:26:46.414968Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/e9dde194-140d-44af-8277-2f75499949b0` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "b79f1e2e-a16b-46a2-87cd-0298f099bac6:0",
      "order_id": "b79f1e2e-a16b-46a2-87cd-0298f099bac6",
      "at": "2026-10-28T16:26:46.411667Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "b79f1e2e-a16b-46a2-87cd-0298f099bac6:1",
      "order_id": "b79f1e2e-a16b-46a2-87cd-0298f099bac6",
      "at": "2026-10-28T16:26:46.41411Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "b79f1e2e-a16b-46a2-87cd-0298f099bac6:2",
      "order_id": "b79f1e2e-a16b-46a2-87cd-0298f099bac6",
      "at": "2026-10-28T16:26:46.423905Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/ea2e6536-9be6-4087-b58e-44020dcd0297` → **200**

```json
{
  "found": []
}
```

Done: request e9dde194-140d-44af-8277-2f75499949b0 — order b79f1e2e-a16b-46a2-87cd-0298f099bac6 found by its id.

`GET /api/rider/v1/orders/b79f1e2e-a16b-46a2-87cd-0298f099bac6` → **200**

```json
{
  "id": "b79f1e2e-a16b-46a2-87cd-0298f099bac6",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "403f4007-5cdd-49e0-b006-537b2ec6feba",
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
  "created_at": "2026-10-28T16:26:46.411014Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b79f1e2e-a16b-46a2-87cd-0298f099bac6/cancel` → **200**

```json
{
  "command_id": "de460b8a-9898-4a00-8011-d91b29e59e7f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b79f1e2e-a16b-46a2-87cd-0298f099bac6",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "403f4007-5cdd-49e0-b006-537b2ec6feba",
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
  "created_at": "2026-10-28T16:26:46.411014Z",
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
  "phone": "+380632150092",
  "device_ref": "sandbox-159"
}
```

```json
{
  "challenge_id": "4a41e8fe-0ead-40c6-80f8-f76edba25e02",
  "expires_at": "2026-10-28T16:31:49.005866094Z",
  "resend_available_at": "2026-10-28T16:26:50.005866094Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632150092` → **200**

```json
{
  "phone": "+380632150092",
  "audience": "CLIENT",
  "code": "856578",
  "sent_at": "2026-10-28T16:26:49.00898609Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a41e8fe-0ead-40c6-80f8-f76edba25e02",
  "code": "856578",
  "device_ref": "sandbox-159"
}
```

```json
{
  "session_id": "8e2ae3d1-a78c-4e72-bbc4-42c21e790e11",
  "subject": {
    "type": "CLIENT",
    "id": "29fc8a81-d46b-4fbc-baf0-6002de985a2c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWZjOGE4MS1kNDZiLTRmYmMtYmFmMC02MDAyZGU5ODVhMmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NzA5LCJpYXQiOjE3OTMyMDQ4MDksImp0aSI6ImM0MWRhNTNlLTA1YTktNDg2Yy1hYmEzLTk2MGU4MjVjYTZlMiIsInNpZCI6IjhlMmFlM2QxLWE3OGMtNGU3Mi1iYmM0LTQyYzIxZTc5MGUxMSJ9.x1K1soWiYjTGd1HSzhXNVa9mpgz4BDJYcf8m1da_ij4",
  "access_expires_at": "2026-10-28T16:41:49.301875437Z",
  "refresh_token": "EEFFFGbZcB7KhYkuFYew8zgEML5Dm6WdvpKBZ06PZyM",
  "refresh_expires_at": "2026-11-27T16:26:49.300182976Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "804cd164-1741-4685-9d61-11c223b96198",
  "expires_at": "2026-10-28T16:31:51.576861786Z",
  "resend_available_at": "2026-10-28T16:26:52.576861786Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632150092` → **200**

```json
{
  "phone": "+380632150092",
  "audience": "CLIENT",
  "code": "519627",
  "sent_at": "2026-10-28T16:26:51.579294569Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "d005d683-abfa-4a25-89af-d2f07e4126dc",
  "challenge_id": "804cd164-1741-4685-9d61-11c223b96198",
  "otp_code": "519627"
}
```

```json
{
  "id": "aeb2ce3c-475a-4322-bbfa-1a34df68dc9d",
  "state": "PENDING",
  "created_at": "2026-10-28T16:26:51.899615Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/aeb2ce3c-475a-4322-bbfa-1a34df68dc9d` → **200**

```json
{
  "id": "aeb2ce3c-475a-4322-bbfa-1a34df68dc9d",
  "state": "PENDING",
  "created_at": "2026-10-28T16:26:51.899615Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/aeb2ce3c-475a-4322-bbfa-1a34df68dc9d` → **200**

```json
{
  "id": "aeb2ce3c-475a-4322-bbfa-1a34df68dc9d",
  "state": "PENDING",
  "created_at": "2026-10-28T16:26:51.899615Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/aeb2ce3c-475a-4322-bbfa-1a34df68dc9d` → **200**

```json
{
  "id": "aeb2ce3c-475a-4322-bbfa-1a34df68dc9d",
  "state": "PENDING",
  "created_at": "2026-10-28T16:26:51.899615Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/aeb2ce3c-475a-4322-bbfa-1a34df68dc9d` → **200**

```json
{
  "id": "aeb2ce3c-475a-4322-bbfa-1a34df68dc9d",
  "state": "PENDING",
  "created_at": "2026-10-28T16:26:51.899615Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/aeb2ce3c-475a-4322-bbfa-1a34df68dc9d` → **200**

```json
{
  "id": "aeb2ce3c-475a-4322-bbfa-1a34df68dc9d",
  "state": "PENDING",
  "created_at": "2026-10-28T16:26:51.899615Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/aeb2ce3c-475a-4322-bbfa-1a34df68dc9d` → **200**

```json
{
  "id": "aeb2ce3c-475a-4322-bbfa-1a34df68dc9d",
  "state": "PENDING",
  "created_at": "2026-10-28T16:26:51.899615Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/aeb2ce3c-475a-4322-bbfa-1a34df68dc9d` → **200**

```json
{
  "id": "aeb2ce3c-475a-4322-bbfa-1a34df68dc9d",
  "state": "READY",
  "created_at": "2026-10-28T16:26:51.899615Z",
  "ready_at": "2026-10-28T16:26:59.718572Z",
  "expires_at": "2026-11-04T16:26:59.718572Z",
  "size_bytes": 1028
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/aeb2ce3c-475a-4322-bbfa-1a34df68dc9d/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637543477",
  "device_ref": "sandbox-18502"
}
```

```json
{
  "challenge_id": "6a96f46f-287c-4b96-84f4-506bea6abbf0",
  "expires_at": "2026-10-28T16:32:00.080733375Z",
  "resend_available_at": "2026-10-28T16:27:01.080733375Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637543477` → **200**

```json
{
  "phone": "+380637543477",
  "audience": "CLIENT",
  "code": "103438",
  "sent_at": "2026-10-28T16:27:00.083383203Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a96f46f-287c-4b96-84f4-506bea6abbf0",
  "code": "103438",
  "device_ref": "sandbox-18502"
}
```

```json
{
  "session_id": "6d71e810-bb5c-4ab4-a8fa-78bcc1041e47",
  "subject": {
    "type": "CLIENT",
    "id": "2a934ff2-55b9-4298-913a-b86eb2c633e1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTkzNGZmMi01NWI5LTQyOTgtOTEzYS1iODZlYjJjNjMzZTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NzIwLCJpYXQiOjE3OTMyMDQ4MjAsImp0aSI6IjYzYjVmMzI5LWFlOTYtNGFiZS05MTI0LTU0MzNiNzVhYTQ3MSIsInNpZCI6IjZkNzFlODEwLWJiNWMtNGFiNC1hOGZhLTc4YmNjMTA0MWU0NyJ9.cQXGgWwGbGP1vOSZR3crl2GHf7IyE7AiyM9Z2QULxJg",
  "access_expires_at": "2026-10-28T16:42:00.377661572Z",
  "refresh_token": "9nfmNLfdmj8E2Mi7m33mBF5KYQhPqZ2bNvY_ZtDygAo",
  "refresh_expires_at": "2026-11-27T16:27:00.377105273Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/aeb2ce3c-475a-4322-bbfa-1a34df68dc9d/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/aeb2ce3c-475a-4322-bbfa-1a34df68dc9d/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d5afd315-180b-4860-ae78-e2b1bad09111"
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
  "session_id": "8874aec7-6c74-46a8-812b-44cb2ffab5b4",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3MjEsImlhdCI6MTc5MzIwNDgyMSwianRpIjoiNDI0YzZmOWItYjRiYi00MTU2LThhZTUtOTY4ZjgzYjQwMjFmIiwic2lkIjoiODg3NGFlYzctNmM3NC00NmE4LTgxMmItNDRjYjJmZmFiNWI0In0.IT601QUtkOBEYBogmwcONS7aRNTzkIXl7oYYTgKD9bE",
  "access_expires_at": "2026-10-28T16:42:01.223834267Z",
  "refresh_token": "zOBPtQSPcmSTMxIShxeGqRbWO1JmnEzKp4aYZFQnnpQ",
  "refresh_expires_at": "2026-10-29T04:27:01.223247852Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "29fc8a81-d46b-4fbc-baf0-6002de985a2c",
  "session_id": "8e2ae3d1-a78c-4e72-bbc4-42c21e790e11",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/29fc8a81-d46b-4fbc-baf0-6002de985a2c/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "aeb2ce3c-475a-4322-bbfa-1a34df68dc9d",
      "state": "READY",
      "created_at": "2026-10-28T16:26:51.899615Z",
      "ready_at": "2026-10-28T16:26:59.718572Z",
      "expires_at": "2026-11-04T16:26:59.718572Z",
      "size_bytes": 1028
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
  "device_ref": "sandbox-26639"
}
```

```json
{
  "challenge_id": "011515cf-c75c-4b2d-8476-6b19645a59fc",
  "expires_at": "2026-10-28T16:32:02.04509157Z",
  "resend_available_at": "2026-10-28T16:27:03.04509157Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "083098",
  "sent_at": "2026-10-28T16:27:02.047788674Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "011515cf-c75c-4b2d-8476-6b19645a59fc",
  "code": "083098",
  "device_ref": "sandbox-26639"
}
```

```json
{
  "session_id": "80572fdc-149b-4ef2-b3a4-d65532a4e75e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTcyMiwiaWF0IjoxNzkzMjA0ODIyLCJqdGkiOiI5MjM1OTA0YS1lZmU1LTQ3ZGItOWEzNC0wM2YzNDhiM2ZhYTEiLCJzaWQiOiI4MDU3MmZkYy0xNDliLTRlZjItYjNhNC1kNjU1MzJhNGU3NWUifQ.uvlFcAfA-p0QF2FVFt8oLYuZ7Pq8nQwJepnjWDjRJ5k",
  "access_expires_at": "2026-10-28T16:42:02.348257412Z",
  "refresh_token": "PevxxBJfyBFmKhOlxYNd6MgJ88kOvhUqpp-qMZjcU8k",
  "refresh_expires_at": "2026-11-27T16:27:02.347674213Z",
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
  "device_ref": "sandbox-29214"
}
```

```json
{
  "challenge_id": "9a09f064-bb34-4df4-aaae-e318e86de4bf",
  "expires_at": "2026-10-28T16:32:02.880317413Z",
  "resend_available_at": "2026-10-28T16:27:03.880317413Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "082929",
  "sent_at": "2026-10-28T16:27:02.882730579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a09f064-bb34-4df4-aaae-e318e86de4bf",
  "code": "082929",
  "device_ref": "sandbox-29214"
}
```

```json
{
  "session_id": "9eb211fc-6a1c-4b29-895a-b6ae0b0c7f15",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTcyMywiaWF0IjoxNzkzMjA0ODIzLCJqdGkiOiI2NDMzZmY4ZS1jZDAzLTQ5MWQtOGY5ZS04NjMzNzEyNmI0MTAiLCJzaWQiOiI5ZWIyMTFmYy02YTFjLTRiMjktODk1YS1iNmFlMGIwYzdmMTUifQ.EfhHN9gbp4QZEWP_3bP0BX0wT0_Ntfo0u6bfJIj0GPU",
  "access_expires_at": "2026-10-28T16:42:03.172184771Z",
  "refresh_token": "aaicydfWiFA5tWHsRxbLZ8s6UbsRbNK6iDAvyxIfJdw",
  "refresh_expires_at": "2026-11-27T16:27:03.171626738Z",
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
  "command_id": "bfc8c996-de63-4dea-9ab9-ff75ba7d77b6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:27:03Z",
    "sequence": 1793204823701
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cc8ec8a1-12ec-4898-8814-487b590ac6cf",
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
  "last_heartbeat_at": "2026-10-28T16:27:03.719841Z",
  "last_location_at": "2026-10-28T16:27:03.719841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-3159"
}
```

```json
{
  "challenge_id": "3c1d2a03-e351-4af2-8a51-780cbb0036cb",
  "expires_at": "2026-10-28T16:32:03.994789724Z",
  "resend_available_at": "2026-10-28T16:27:04.994789724Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "544057",
  "sent_at": "2026-10-28T16:27:03.997488852Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c1d2a03-e351-4af2-8a51-780cbb0036cb",
  "code": "544057",
  "device_ref": "sandbox-3159"
}
```

```json
{
  "session_id": "c28fb0b5-d1ac-4845-870a-9d232aa47777",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTcyNCwiaWF0IjoxNzkzMjA0ODI0LCJqdGkiOiJjOWU4NmMyZC04YWNjLTQzNjctYTI5OC03OWVlZGY0MTk2MmYiLCJzaWQiOiJjMjhmYjBiNS1kMWFjLTQ4NDUtODcwYS05ZDIzMmFhNDc3NzcifQ.vlsiBTphOQndbBtNfJv36qsOy5MFniebGb_Al2QIByw",
  "access_expires_at": "2026-10-28T16:42:04.297724698Z",
  "refresh_token": "yxaYqstqpqJrskwtD4PpMF9RZ6Han0PwaS6-ENrToF4",
  "refresh_expires_at": "2026-11-27T16:27:04.297191452Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "60eac934-254f-4aeb-8bce-e888ca0a2a74",
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
  "last_heartbeat_at": "2026-10-28T16:25:54.591727Z",
  "last_location_at": "2026-10-28T16:25:54.591727Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/60eac934-254f-4aeb-8bce-e888ca0a2a74/handover` → **200**

```json
{
  "command_id": "63a044ec-4755-42a4-aa2b-da4afc39189f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "60eac934-254f-4aeb-8bce-e888ca0a2a74",
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
  "last_heartbeat_at": "2026-10-28T16:25:54.591727Z",
  "last_location_at": "2026-10-28T16:25:54.591727Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/60eac934-254f-4aeb-8bce-e888ca0a2a74/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:27:05Z",
    "sequence": 1793204825110
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "60eac934-254f-4aeb-8bce-e888ca0a2a74",
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
  "last_heartbeat_at": "2026-10-28T16:27:05.128957Z",
  "last_location_at": "2026-10-28T16:27:05.128957Z",
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
  "session_id": "5ad2ce94-1df0-4d8a-b46c-61dc9c997600",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3MjUsImlhdCI6MTc5MzIwNDgyNSwianRpIjoiMmE1OTFjYjQtOGM3Ni00MmZlLTlkNmQtODViMzRiOTJhOTQxIiwic2lkIjoiNWFkMmNlOTQtMWRmMC00ZDhhLWI0NmMtNjFkYzljOTk3NjAwIn0.eZ-vOaIzwr9Jo_xTlYX8zs5RPpcXvjjmF44AY10BkFY",
  "access_expires_at": "2026-10-28T16:42:05.685824557Z",
  "refresh_token": "iBRYWaFp0O2jzXmvKpN2fNqQ7Zhdc0228zJvP-irLsc",
  "refresh_expires_at": "2026-10-29T04:27:05.685282024Z",
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
  "session_id": "eaa55fc7-5f56-4fdf-adc6-116fbde5fa37",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3MjYsImlhdCI6MTc5MzIwNDgyNiwianRpIjoiZGZlYWFkM2ItZjM5Ni00Y2E0LWFiMDctOWM5MjBiNTI2MTNlIiwic2lkIjoiZWFhNTVmYzctNWY1Ni00ZmRmLWFkYzYtMTE2ZmJkZTVmYTM3In0.sE5x6sSyzTT17ZYyjzBPgltUHpZGqcxjmUTzF-YR2PM",
  "access_expires_at": "2026-10-28T16:42:06.246489672Z",
  "refresh_token": "W8DyPNEn2L4Ha85JPSP_9eXgHAvul2SmF_Lch_rCqk4",
  "refresh_expires_at": "2026-10-29T04:27:06.24586211Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380685478301",
  "device_ref": "sandbox-32709"
}
```

```json
{
  "challenge_id": "6913a534-77dd-444b-8171-0a83ecbd6d9a",
  "expires_at": "2026-10-28T16:32:06.512136337Z",
  "resend_available_at": "2026-10-28T16:27:07.512136337Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380685478301` → **200**

```json
{
  "phone": "+380685478301",
  "audience": "CLIENT",
  "code": "199136",
  "sent_at": "2026-10-28T16:27:06.514840026Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6913a534-77dd-444b-8171-0a83ecbd6d9a",
  "code": "199136",
  "device_ref": "sandbox-32709"
}
```

```json
{
  "session_id": "dc60b049-b2a3-47b4-8c65-214347926979",
  "subject": {
    "type": "CLIENT",
    "id": "423ed652-cce5-4f75-800a-1d8ebb411c04"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MjNlZDY1Mi1jY2U1LTRmNzUtODAwYS0xZDhlYmI0MTFjMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NzI2LCJpYXQiOjE3OTMyMDQ4MjYsImp0aSI6IjJlZjY1MTFjLWI5NGUtNDE1Ni04YjJjLTM0MTZmZDhhZTY0NiIsInNpZCI6ImRjNjBiMDQ5LWIyYTMtNDdiNC04YzY1LTIxNDM0NzkyNjk3OSJ9.S5z8q3qkxA-5pSaiCYjQq2-ZflMmVVmHasqmb53vkT0",
  "access_expires_at": "2026-10-28T16:42:06.812679578Z",
  "refresh_token": "8ZpsNnvcRE6HQcXl8QwPsH8XEfqNHupNgGnFaxalidk",
  "refresh_expires_at": "2026-11-27T16:27:06.81211405Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8a70563e-c0b0-4206-889f-e31a32629ed4",
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
  "id": "d81b801f-6fd2-4d70-9a8c-a7086cdcf2a1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:32:07.093953Z",
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
  "command_id": "ded523ef-4ae1-4bdf-9699-bd74c1fcd377",
  "quote_id": "d81b801f-6fd2-4d70-9a8c-a7086cdcf2a1",
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
  "id": "7688f48b-0346-48bb-92f9-29c360c427cb",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "423ed652-cce5-4f75-800a-1d8ebb411c04",
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
  "created_at": "2026-10-28T16:27:07.384433Z",
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
    "id": "14586b51-89f0-47f4-8417-2bb39750bfee",
    "order_id": "7688f48b-0346-48bb-92f9-29c360c427cb",
    "expires_at": "2026-10-28T16:27:22.388412Z",
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

`POST /api/driver/v1/offers/14586b51-89f0-47f4-8417-2bb39750bfee/reject` → **204**

```json
{
  "command_id": "f665e130-eed8-4408-a50a-3228f0e46ea4"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a85c722b-25d1-47e5-bcf0-936ad9cf2137",
    "order_id": "7688f48b-0346-48bb-92f9-29c360c427cb",
    "expires_at": "2026-10-28T16:27:22.964132Z",
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

`POST /api/driver/v1/offers/a85c722b-25d1-47e5-bcf0-936ad9cf2137/accept` → **200**

```json
{
  "command_id": "d5ced0f8-3237-4fc8-a728-c72cf191a9da"
}
```

```json
{
  "id": "105e307d-ea87-4055-b93e-27cca58d14bc",
  "order_id": "7688f48b-0346-48bb-92f9-29c360c427cb",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d916c503-300c-4d97-98db-b5a2c1e76ca3",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/7688f48b-0346-48bb-92f9-29c360c427cb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:27:07.384939Z",
      "actor": {
        "type": "CLIENT",
        "id": "423ed652-cce5-4f75-800a-1d8ebb411c04",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7688f48b-0346-48bb-92f9-29c360c427cb",
        "quote_id": "d81b801f-6fd2-4d70-9a8c-a7086cdcf2a1",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "cfa18d50-9349-4bcf-8d51-7b5cf7cf9047"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:27:07.387379Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7688f48b-0346-48bb-92f9-29c360c427cb",
        "attempt_id": "a62c21f8-8384-4767-80fd-8084b0f30b2a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cfa18d50-9349-4bcf-8d51-7b5cf7cf9047"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:27:07.39425Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "14586b51-89f0-47f4-8417-2bb39750bfee",
        "order_id": "7688f48b-0346-48bb-92f9-29c360c427cb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "cfa18d50-9349-4bcf-8d51-7b5cf7cf9047"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T16:27:07.96303Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "14586b51-89f0-47f4-8417-2bb39750bfee",
        "order_id": "7688f48b-0346-48bb-92f9-29c360c427cb"
      },
      "correlation_id": "d0e86b14-a853-440b-b811-06888486fc03"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 7688f48b-0346-48bb-92f9-29c360c427cb — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/7688f48b-0346-48bb-92f9-29c360c427cb` → **200**

```json
{
  "id": "7688f48b-0346-48bb-92f9-29c360c427cb",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "423ed652-cce5-4f75-800a-1d8ebb411c04",
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
    "id": "105e307d-ea87-4055-b93e-27cca58d14bc",
    "order_id": "7688f48b-0346-48bb-92f9-29c360c427cb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d916c503-300c-4d97-98db-b5a2c1e76ca3",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:27:07.384433Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7688f48b-0346-48bb-92f9-29c360c427cb/cancel` → **200**

```json
{
  "command_id": "f608beca-2740-4fcd-bfb0-53f4d4bf65f9",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7688f48b-0346-48bb-92f9-29c360c427cb",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "423ed652-cce5-4f75-800a-1d8ebb411c04",
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
    "id": "105e307d-ea87-4055-b93e-27cca58d14bc",
    "order_id": "7688f48b-0346-48bb-92f9-29c360c427cb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d916c503-300c-4d97-98db-b5a2c1e76ca3",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:27:07.384433Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
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
  "session_id": "cc8ec8a1-12ec-4898-8814-487b590ac6cf",
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
  "last_heartbeat_at": "2026-10-28T16:27:03.719841Z",
  "last_location_at": "2026-10-28T16:27:03.719841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cc8ec8a1-12ec-4898-8814-487b590ac6cf/close` → **200**

```json
{
  "command_id": "77da1259-dc26-44f0-ac78-38cdee165fb9",
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
  "session_id": "60eac934-254f-4aeb-8bce-e888ca0a2a74",
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
  "last_heartbeat_at": "2026-10-28T16:27:05.128957Z",
  "last_location_at": "2026-10-28T16:27:05.128957Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/60eac934-254f-4aeb-8bce-e888ca0a2a74/close` → **200**

```json
{
  "command_id": "a7bef46b-1ac6-4186-9ee0-68e43d4abe5a",
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
  "session_id": "907b4729-8cac-4126-adca-de5f37be97a7",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3MzAsImlhdCI6MTc5MzIwNDgzMCwianRpIjoiNzA0ZTQ5YzUtOTA4Yi00OTVhLWEyNTEtYmNmYmU5MTFkYjUzIiwic2lkIjoiOTA3YjQ3MjktOGNhYy00MTI2LWFkY2EtZGU1ZjM3YmU5N2E3In0.8lZm7f2O6Yeiz3qSbmXQ9YdmI7Ik82qXXhU8-dscZSs",
  "access_expires_at": "2026-10-28T16:42:10.869487192Z",
  "refresh_token": "xif-nffI2Vf6RI-2_qHEskeCa25ov9lc1bpIETuDLeI",
  "refresh_expires_at": "2026-10-29T04:27:10.868868078Z",
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
  "command_id": "c673f312-331b-4863-88f1-798bb654c6c2",
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
  "changed_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T16:27:11.45842Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "b029b9f0-4765-49b8-81ef-883ceca90e6d",
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
  "correlation_id": "5416f7b7-02b5-4977-8d98-677821a1001f"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "dbbd7241-fdf5-4e57-b31e-7e2054d1d524",
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
  "correlation_id": "c6ff25ef-fc88-4aca-ac8d-c4420475ae25"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636221930",
  "device_ref": "sandbox-20967"
}
```

```json
{
  "challenge_id": "c7b851cd-1a2c-40fe-bcac-ea7ce4b9d8cd",
  "expires_at": "2026-10-28T16:32:12.291189315Z",
  "resend_available_at": "2026-10-28T16:27:13.291189315Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636221930` → **200**

```json
{
  "phone": "+380636221930",
  "audience": "CLIENT",
  "code": "853381",
  "sent_at": "2026-10-28T16:27:12.293754507Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7b851cd-1a2c-40fe-bcac-ea7ce4b9d8cd",
  "code": "853381",
  "device_ref": "sandbox-20967"
}
```

```json
{
  "session_id": "2917a576-0bd1-4785-afe9-2ddfb0a69cb8",
  "subject": {
    "type": "CLIENT",
    "id": "c4a70a65-020f-4678-9927-ec0288bbb44e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGE3MGE2NS0wMjBmLTQ2NzgtOTkyNy1lYzAyODhiYmI0NGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NzMyLCJpYXQiOjE3OTMyMDQ4MzIsImp0aSI6ImFhYWVjMDZjLWJhNTctNDA1NC1hODdkLTViMWNkZDJjYjNhMyIsInNpZCI6IjI5MTdhNTc2LTBiZDEtNDc4NS1hZmU5LTJkZGZiMGE2OWNiOCJ9.cSGeM2BfANoyfdCNAmYBnOJbUYhtLyvlNWzeO7ngyOw",
  "access_expires_at": "2026-10-28T16:42:12.587254285Z",
  "refresh_token": "mh90ejreCrTlXojbgkvwGMLcHw7KrFRGbvH1AjuumLY",
  "refresh_expires_at": "2026-11-27T16:27:12.586548978Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6e5e239a-a86a-4bf1-ac74-40b0a81d71a7",
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
  "id": "3cea38dd-290e-4a40-980e-ce21454061ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:32:12.866699Z",
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
  "command_id": "3dac37e6-3c12-45b8-aa3f-965cba727e24",
  "quote_id": "3cea38dd-290e-4a40-980e-ce21454061ef",
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
  "correlation_id": "210e3c64-7776-41d0-9c19-ae15a3a6fe3d"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3fd63246-042b-416c-ae16-bbf0ecbdea48",
  "quote_id": "3cea38dd-290e-4a40-980e-ce21454061ef",
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
  "id": "36d95a3f-d50c-45b6-b74b-7ceb4d674c1a",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c4a70a65-020f-4678-9927-ec0288bbb44e",
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
  "created_at": "2026-10-28T16:27:13.426173Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/36d95a3f-d50c-45b6-b74b-7ceb4d674c1a/cancel` → **200**

```json
{
  "command_id": "facea78a-3964-4c82-920d-8eba4cbb50c4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "36d95a3f-d50c-45b6-b74b-7ceb4d674c1a",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c4a70a65-020f-4678-9927-ec0288bbb44e",
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
  "created_at": "2026-10-28T16:27:13.426173Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "cdf01f22-47a8-45cb-a9a2-1c79306f17cc",
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
  "changed_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T16:27:14.046923Z"
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
      "changed_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T16:27:14.046923Z"
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
  "device_ref": "sandbox-15402"
}
```

```json
{
  "challenge_id": "e8dc8217-dfb2-48b9-b909-38a61a537fd9",
  "expires_at": "2026-10-28T16:32:14.887570872Z",
  "resend_available_at": "2026-10-28T16:27:15.887570872Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "714892",
  "sent_at": "2026-10-28T16:27:14.890141954Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8dc8217-dfb2-48b9-b909-38a61a537fd9",
  "code": "714892",
  "device_ref": "sandbox-15402"
}
```

```json
{
  "session_id": "dd0c7bdc-aa6c-4ff7-a16c-c2531032e55a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTczNSwiaWF0IjoxNzkzMjA0ODM1LCJqdGkiOiI4NTdkOWFhMS00OTEwLTRiZDEtYjY4NS04MTdlMTdmOTdkNmEiLCJzaWQiOiJkZDBjN2JkYy1hYTZjLTRmZjctYTE2Yy1jMjUzMTAzMmU1NWEifQ.HtJssbCMdEHj5LJZPl-bmh-Amu81rAHf_mY8ZpZ9irk",
  "access_expires_at": "2026-10-28T16:42:15.184657874Z",
  "refresh_token": "MZNLnFBwbtqcUuWFGjqPEqAAjYlldlUgVSJn7WLLUtI",
  "refresh_expires_at": "2026-11-27T16:27:15.184101315Z",
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
  "command_id": "3a3ce4f6-de29-4b71-b873-cda9d12c7f32",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:27:15Z",
    "sequence": 1793204835727
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a6fe339-ef67-46ba-a408-87de3d6f7a31",
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
  "last_heartbeat_at": "2026-10-28T16:27:15.745857Z",
  "last_location_at": "2026-10-28T16:27:15.745857Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671178477",
  "device_ref": "sandbox-2522"
}
```

```json
{
  "challenge_id": "138a4f07-8be2-4106-bd66-b2a8c39bcd6f",
  "expires_at": "2026-10-28T16:32:16.025908974Z",
  "resend_available_at": "2026-10-28T16:27:17.025908974Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671178477` → **200**

```json
{
  "phone": "+380671178477",
  "audience": "CLIENT",
  "code": "837304",
  "sent_at": "2026-10-28T16:27:16.028106417Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "138a4f07-8be2-4106-bd66-b2a8c39bcd6f",
  "code": "837304",
  "device_ref": "sandbox-2522"
}
```

```json
{
  "session_id": "a723c174-df3b-4978-a79f-0125feb38190",
  "subject": {
    "type": "CLIENT",
    "id": "c4331cbe-d19e-447c-abf2-c51f73c590fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDMzMWNiZS1kMTllLTQ0N2MtYWJmMi1jNTFmNzNjNTkwZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NzM2LCJpYXQiOjE3OTMyMDQ4MzYsImp0aSI6IjI1OWY0OWE2LThmZmYtNDEyMi1iN2U5LWViZjA5NjcxZjE2YyIsInNpZCI6ImE3MjNjMTc0LWRmM2ItNDk3OC1hNzlmLTAxMjVmZWIzODE5MCJ9.84u9HlgL5QDbYA_aMdCOpN3Nxur7fltgnDe6ovArBCM",
  "access_expires_at": "2026-10-28T16:42:16.344466827Z",
  "refresh_token": "KugGoK19VDOnOkxRhU6tpV3LtdkrWg5Edr1PGmhYSAo",
  "refresh_expires_at": "2026-11-27T16:27:16.343836049Z",
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
  "command_id": "911f144b-24ee-4dd5-a4a4-f1e61c232fb1",
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
  "id": "cba8473f-8b44-4199-807a-bfab70680382",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:32:16.889602Z",
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
  "command_id": "623b1eda-156d-4781-a1ce-9ef0457cd411",
  "platform": "ANDROID",
  "token": "sandbox-driver-c62370b6-4630-4784-9697-399b6069fb19"
}
```

```json
{
  "id": "850899a2-5d0e-4679-ad6a-876a995544d3",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T16:27:17.183726Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "29cd8a8b-cd54-4966-96c0-97138338bd31",
  "platform": "ANDROID",
  "token": "sandbox-rider-e74382ef-0552-4334-82e5-cc93effa471d"
}
```

```json
{
  "id": "a43c96a3-595c-488e-a7b3-3df4b43ca1d6",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T16:27:17.491239Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1da5f9dd-d844-4d6d-9301-b82cb2b5ba5b",
  "quote_id": "cba8473f-8b44-4199-807a-bfab70680382",
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
  "id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c4331cbe-d19e-447c-abf2-c51f73c590fe",
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
  "created_at": "2026-10-28T16:27:17.808022Z",
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
    "id": "6c20670b-d327-4b90-b181-7d3b2eb13444",
    "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
    "expires_at": "2026-10-28T16:27:32.811812Z",
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

`POST /api/driver/v1/offers/6c20670b-d327-4b90-b181-7d3b2eb13444/accept` → **200**

```json
{
  "command_id": "89419b06-a0d6-4cab-bdd5-d2239ee94830"
}
```

```json
{
  "id": "8b5fd30d-ba06-41cf-8efc-d2789b4608b1",
  "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T16:27:17.780Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T16:27:17.780Z` → **200**

```json
[
  {
    "at": "2026-10-28T16:27:19.118878904Z",
    "token_suffix": "69fb19",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "bef15b0b-ec1b-41f5-85e6-66eefe3d4d2d",
      "order_version": "2",
      "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380671178477&after=2026-10-28T16:27:17.780Z` → **200**

```json
[
  {
    "at": "2026-10-28T16:27:19.122098855Z",
    "token_suffix": "fa471d",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "a5ad6d93-6ccf-4f71-a2d9-169658d0fe64",
      "order_version": "3",
      "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/bc79c812-bb8b-4f80-922b-f411c210ea3f/messages` → **201**

```json
{
  "command_id": "ec1b3c4c-d960-4598-b3d5-e4d24b9b15d6",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "08d42fec-0153-4bc2-82ea-317666c4ac1e",
  "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T16:27:19.799006814Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619",
  "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
  "assignment_id": "8b5fd30d-ba06-41cf-8efc-d2789b4608b1",
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

`POST /api/driver/v1/trips/98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619/messages` → **201**

```json
{
  "command_id": "8657f448-14e9-4c74-94ee-99b7dda125bd",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "ce02cb7e-d40d-446b-bf08-1d0e0747706d",
  "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T16:27:20.34056718Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/bc79c812-bb8b-4f80-922b-f411c210ea3f/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380671178477"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/4a6fe339-ef67-46ba-a408-87de3d6f7a31/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:27:21Z",
    "sequence": 1793204841131
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a6fe339-ef67-46ba-a408-87de3d6f7a31",
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
  "last_heartbeat_at": "2026-10-28T16:27:21.149717Z",
  "last_location_at": "2026-10-28T16:27:21.149717Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619",
  "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
  "assignment_id": "8b5fd30d-ba06-41cf-8efc-d2789b4608b1",
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

`POST /api/driver/v1/trips/98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619/arrive` → **200**

```json
{
  "command_id": "44cb1558-7166-4ac5-af3f-cd7460359051",
  "expected_version": 0
}
```

```json
{
  "id": "98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619",
  "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
  "assignment_id": "8b5fd30d-ba06-41cf-8efc-d2789b4608b1",
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
  "arrived_at": "2026-10-28T16:27:21.707504Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619/start` → **200**

```json
{
  "command_id": "7c20b6a3-c8e8-4a11-83c1-eb4a8a0f2b23",
  "expected_version": 1
}
```

```json
{
  "id": "98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619",
  "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
  "assignment_id": "8b5fd30d-ba06-41cf-8efc-d2789b4608b1",
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
  "arrived_at": "2026-10-28T16:27:21.707504Z",
  "started_at": "2026-10-28T16:27:21.988014Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/4a6fe339-ef67-46ba-a408-87de3d6f7a31/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:27:22Z",
    "sequence": 1793204842254
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a6fe339-ef67-46ba-a408-87de3d6f7a31",
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
  "last_heartbeat_at": "2026-10-28T16:27:22.272544Z",
  "last_location_at": "2026-10-28T16:27:22.272544Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619/complete` → **200**

```json
{
  "command_id": "709851e1-32a9-4bbf-9577-5c9071d842d9",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:27:22Z",
  "cash_received": true
}
```

```json
{
  "id": "98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619",
  "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
  "assignment_id": "8b5fd30d-ba06-41cf-8efc-d2789b4608b1",
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
  "arrived_at": "2026-10-28T16:27:21.707504Z",
  "started_at": "2026-10-28T16:27:21.988014Z",
  "completed_at": "2026-10-28T16:27:22.553773Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/bc79c812-bb8b-4f80-922b-f411c210ea3f` → **200**

```json
{
  "id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c4331cbe-d19e-447c-abf2-c51f73c590fe",
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
    "id": "8b5fd30d-ba06-41cf-8efc-d2789b4608b1",
    "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:27:17.808022Z",
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
    "id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:27:17.808022Z",
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
    "id": "98cdf4bb-8aa1-40fa-9f23-ed4bd5c70619",
    "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
    "order_short_number": 10,
    "created_at": "2026-10-28T16:27:18.421356Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "adcb67ce-d4e0-4385-867e-d3760c22f9b4",
    "order_id": "bc5c5cae-c879-47ff-a232-6be7b1af1766",
    "order_short_number": 2,
    "created_at": "2026-10-28T16:25:44.580689Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2b499ba9-1f4e-4965-afc5-3328514ca3c0",
    "order_id": "00a170a8-43ec-4bed-a3f8-3f36093afec9",
    "order_short_number": 1,
    "created_at": "2026-10-28T16:25:25.544846Z",
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

`GET /api/rider/v1/orders/bc79c812-bb8b-4f80-922b-f411c210ea3f/tip` → **200**

```json
{
  "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
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
  "available_until": "2026-10-29T16:27:22.553773Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/bc79c812-bb8b-4f80-922b-f411c210ea3f/tip` → **201**

```json
{
  "command_id": "183de03f-97fc-450c-b0e1-5f2796e99e21",
  "amount_minor": 1100
}
```

```json
{
  "id": "fce3b17c-1864-4fe7-83bb-5af49ce1d9c5",
  "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T16:27:27.505787Z"
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
  "session_id": "af633f59-8af5-4814-8ac1-9516bf8d64e6",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3NDgsImlhdCI6MTc5MzIwNDg0OCwianRpIjoiMTMzMjExY2MtZTZmNS00ZGFmLWI1MzgtMmIyYzdiMjRmZjhlIiwic2lkIjoiYWY2MzNmNTktOGFmNS00ODE0LThhYzEtOTUxNmJmOGQ2NGU2In0.Lw_TjnVJ5wZQaAiTS9F4urNvQADleNAPbyw9_R-cX48",
  "access_expires_at": "2026-10-28T16:42:28.082266387Z",
  "refresh_token": "R2P61IblhRd9EBmP4CxezGeXhosGSfEiIjZNWDZfUdY",
  "refresh_expires_at": "2026-10-29T04:27:28.081623175Z",
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
          "APP": 9,
          "PHONE": 1
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 9
        },
        "cancelled_by": {
          "RIDER": 3,
          "STAFF": 1,
          "DRIVER": 1
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
      "APP": 9,
      "PHONE": 1
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 9
    },
    "cancelled_by": {
      "RIDER": 3,
      "STAFF": 1,
      "DRIVER": 1
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
  "generated_at": "2026-10-28T16:27:28.358452269Z"
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
  "generated_at": "2026-10-28T16:27:28.647331335Z"
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
  "session_id": "7a94bde2-6f6e-4cf8-bead-32b04ed77efd",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3NDksImlhdCI6MTc5MzIwNDg0OSwianRpIjoiOTBhZDk2ZjgtODk0Mi00OTRhLThmY2YtNmM4MjVjODQyNTUzIiwic2lkIjoiN2E5NGJkZTItNmY2ZS00Y2Y4LWJlYWQtMzJiMDRlZDc3ZWZkIn0.v5IgT1uyzNcZAXsKud-_ntKc7DUUTyrxcJggmeNryqI",
  "access_expires_at": "2026-10-28T16:42:29.213963088Z",
  "refresh_token": "4TfUCyyYwaxsfH8-3YuSXfsx3xaCfyJERPDBf9S9rqw",
  "refresh_expires_at": "2026-10-29T04:27:29.213237567Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/bc79c812-bb8b-4f80-922b-f411c210ea3f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:27:17.808564Z",
      "actor": {
        "type": "CLIENT",
        "id": "c4331cbe-d19e-447c-abf2-c51f73c590fe",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
        "quote_id": "cba8473f-8b44-4199-807a-bfab70680382",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "157577bf-d85b-4d23-91d7-13e0a5c29766"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:27:17.811019Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
        "attempt_id": "1fa27fcf-99db-483e-a3cc-741845c3aeef",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "157577bf-d85b-4d23-91d7-13e0a5c29766"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:27:17.814069Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6c20670b-d327-4b90-b181-7d3b2eb13444",
        "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "157577bf-d85b-4d23-91d7-13e0a5c29766"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:27:18.422977Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6c20670b-d327-4b90-b181-7d3b2eb13444",
        "order_id": "bc79c812-bb8b-4f80-922b-f411c210ea3f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8b5fd30d-ba06-41cf-8efc-d2789b4608b1"
      },
      "correlation_id": "c57bcddc-b761-49c2-a671-182d7f8adc26"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T16:27:29.770711485Z",
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
      "last_location_at": "2026-10-28T16:27:22.272544Z",
      "order_id": null
    }
  ]
}
```

Done: order bc79c812-bb8b-4f80-922b-f411c210ea3f.

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
  "session_id": "37c1e7c3-e876-4b8f-a6f5-14b84e8ce8e1",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3NTAsImlhdCI6MTc5MzIwNDg1MCwianRpIjoiOGVmODliMmMtYzg3OS00OWVlLWEwMWQtYWNlYTJhYTI2Mjg5Iiwic2lkIjoiMzdjMWU3YzMtZTg3Ni00YjhmLWE2ZjUtMTRiODRlOGNlOGUxIn0.Zk2Wd5e7i08SVD8FtW3-4oilRKoMXlWTLGSVFesTJcQ",
  "access_expires_at": "2026-10-28T16:42:30.355787805Z",
  "refresh_token": "BeXECp1LeN27hLmde_UbzBRshQLcEL1L8zPFuBQO97o",
  "refresh_expires_at": "2026-10-29T04:27:30.355224484Z",
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
  "command_id": "d5743169-ed88-40df-bbd7-b7bbfc0ade39",
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
  "timestamp": "2026-10-28T16:27:31.000+0000",
  "channel": {
    "id": "1730052000.3202825402",
    "linkedid": "1730052000.3202825402",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677155643"
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
  "timestamp": "2026-10-28T16:27:31.000+0000",
  "channel": {
    "id": "1730052000.3202825402",
    "linkedid": "1730052000.3202825402",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677155643"
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
  "session_id": "7caf69c4-b218-46c9-87c8-7b66f008da5b",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3NTEsImlhdCI6MTc5MzIwNDg1MSwianRpIjoiMDIwOGI5NjYtZjkzYy00NjI5LThlNTgtMTM0ZDJkMTZiOWVkIiwic2lkIjoiN2NhZjY5YzQtYjIxOC00NmM5LTg3YzgtN2I2NmYwMDhkYTViIn0.dttCHLDTdNk3Rir_suAooCfOPbdauPdeJTueseevsew",
  "access_expires_at": "2026-10-28T16:42:31.518829524Z",
  "refresh_token": "zF97ba3zeKdWQNkY4nDHCJhjcUW3ozgdnqauDgNN6iE",
  "refresh_expires_at": "2026-10-29T04:27:31.518285058Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "29956a9f-97ba-4a73-8869-be65bc345d4a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677155643",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:27:31Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/29956a9f-97ba-4a73-8869-be65bc345d4a/answer` → **200**

```json
{
  "command_id": "34439e3e-7559-4866-9d67-7feab1ca0ff9"
}
```

```json
{
  "id": "29956a9f-97ba-4a73-8869-be65bc345d4a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677155643",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "order_ids": [],
  "started_at": "2026-10-28T16:27:31Z",
  "answered_at": "2026-10-28T16:27:32.097008Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.3202825402",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6188da67-14a0-4a9f-be22-e828e90765dd",
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
  "id": "2fa3758e-7c9e-41a2-8dea-d2b5b7a512a4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:32:32.416456Z",
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
  "command_id": "40d23a34-a143-4df3-946c-1730bc873ac2",
  "quote_id": "2fa3758e-7c9e-41a2-8dea-d2b5b7a512a4",
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
    "phone": "+380677155643"
  },
  "call_id": "29956a9f-97ba-4a73-8869-be65bc345d4a"
}
```

```json
{
  "id": "8ffc6467-d343-4c7a-bb23-8363cf7bd6dc",
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
  "created_at": "2026-10-28T16:27:32.714743Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677155643"
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
    "id": "1730052000.3202825402",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "29956a9f-97ba-4a73-8869-be65bc345d4a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677155643",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "order_ids": [
        "8ffc6467-d343-4c7a-bb23-8363cf7bd6dc"
      ],
      "started_at": "2026-10-28T16:27:31Z",
      "answered_at": "2026-10-28T16:27:32.097008Z",
      "ended_at": "2026-10-28T16:27:33.013113Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "a4abc6cb-c2a9-4dc4-b450-a8b9ea2255fd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678762550",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "order_ids": [],
      "started_at": "2026-10-28T16:25:33.5508Z",
      "answered_at": "2026-10-28T16:25:33.872185Z",
      "ended_at": "2026-10-28T16:25:34.180007Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:25:39.699758Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/8ffc6467-d343-4c7a-bb23-8363cf7bd6dc` → **200**

```json
{
  "id": "8ffc6467-d343-4c7a-bb23-8363cf7bd6dc",
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
  "created_at": "2026-10-28T16:27:32.714743Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677155643"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/8ffc6467-d343-4c7a-bb23-8363cf7bd6dc` → **200**

```json
{
  "id": "8ffc6467-d343-4c7a-bb23-8363cf7bd6dc",
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
  "created_at": "2026-10-28T16:27:32.714743Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677155643"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8ffc6467-d343-4c7a-bb23-8363cf7bd6dc/cancel` → **200**

```json
{
  "command_id": "5a492326-3be4-480c-83e4-60296d74a19f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "8ffc6467-d343-4c7a-bb23-8363cf7bd6dc",
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
  "created_at": "2026-10-28T16:27:32.714743Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677155643"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 29956a9f-97ba-4a73-8869-be65bc345d4a with order 8ffc6467-d343-4c7a-bb23-8363cf7bd6dc.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6815"
}
```

```json
{
  "challenge_id": "de5c6a41-b0d3-4631-b05c-ebbfee64d82c",
  "expires_at": "2026-10-28T16:32:34.209455715Z",
  "resend_available_at": "2026-10-28T16:27:35.209455715Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "755912",
  "sent_at": "2026-10-28T16:27:34.212719089Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de5c6a41-b0d3-4631-b05c-ebbfee64d82c",
  "code": "755912",
  "device_ref": "sandbox-6815"
}
```

```json
{
  "session_id": "98d283a6-6aae-4aad-93cf-a0b57032e700",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTc1NCwiaWF0IjoxNzkzMjA0ODU0LCJqdGkiOiI1Nzk5NGFjNi1jMmYxLTRiNjMtODAxYy0xY2VhY2FiNTVhY2QiLCJzaWQiOiI5OGQyODNhNi02YWFlLTRhYWQtOTNjZi1hMGI1NzAzMmU3MDAifQ.T7svZhdeB4g3Zohj8W8EZmgsnlCcJGwyz8UhDdCv8KM",
  "access_expires_at": "2026-10-28T16:42:34.506801975Z",
  "refresh_token": "GME37qMhy6Hx59E7a2DiqYSlZUN8t0AfTLxQVh4GDEc",
  "refresh_expires_at": "2026-11-27T16:27:34.506263839Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a6fe339-ef67-46ba-a408-87de3d6f7a31",
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
  "last_heartbeat_at": "2026-10-28T16:27:22.272544Z",
  "last_location_at": "2026-10-28T16:27:22.272544Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4a6fe339-ef67-46ba-a408-87de3d6f7a31/handover` → **200**

```json
{
  "command_id": "abc401f2-6c82-4bb0-8a77-e7f3ae0110a5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a6fe339-ef67-46ba-a408-87de3d6f7a31",
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
  "last_heartbeat_at": "2026-10-28T16:27:22.272544Z",
  "last_location_at": "2026-10-28T16:27:22.272544Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4a6fe339-ef67-46ba-a408-87de3d6f7a31/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:27:35Z",
    "sequence": 1793204855318
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a6fe339-ef67-46ba-a408-87de3d6f7a31",
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
  "last_heartbeat_at": "2026-10-28T16:27:35.337189Z",
  "last_location_at": "2026-10-28T16:27:35.337189Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663837111",
  "device_ref": "sandbox-27995"
}
```

```json
{
  "challenge_id": "80e2a1bc-e4b0-4647-914a-cd4c6f81d73a",
  "expires_at": "2026-10-28T16:32:35.62647709Z",
  "resend_available_at": "2026-10-28T16:27:36.62647709Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663837111` → **200**

```json
{
  "phone": "+380663837111",
  "audience": "CLIENT",
  "code": "283475",
  "sent_at": "2026-10-28T16:27:35.62919855Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80e2a1bc-e4b0-4647-914a-cd4c6f81d73a",
  "code": "283475",
  "device_ref": "sandbox-27995"
}
```

```json
{
  "session_id": "cd391135-2acd-471a-a9ff-d8ffced4722c",
  "subject": {
    "type": "CLIENT",
    "id": "627b4d1b-494a-48c7-a0c1-e7d78541fbdc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjdiNGQxYi00OTRhLTQ4YzctYTBjMS1lN2Q3ODU0MWZiZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NzU1LCJpYXQiOjE3OTMyMDQ4NTUsImp0aSI6IjJhZWE3YzA3LWE3MjgtNDc0Zi1iYTA4LWNiYzlkODFkZWM1YiIsInNpZCI6ImNkMzkxMTM1LTJhY2QtNDcxYS1hOWZmLWQ4ZmZjZWQ0NzIyYyJ9._3YDXWknwiix6g3Clv02QJfJETcIrraaOwv8S1YifDk",
  "access_expires_at": "2026-10-28T16:42:35.925872501Z",
  "refresh_token": "tPKQUQp44kv6AdCkE9rPGBgYK5EtiKf2HhojTXn-1zE",
  "refresh_expires_at": "2026-11-27T16:27:35.925369031Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "26f18974-4a00-401c-b003-74dde3f0e3d5",
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
  "id": "bb9a90ec-3663-4291-b73f-e7cda8807de2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:32:36.201010Z",
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
  "command_id": "5fd59f59-054e-4e04-baf3-7773e4c218d4",
  "quote_id": "bb9a90ec-3663-4291-b73f-e7cda8807de2",
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
  "id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "627b4d1b-494a-48c7-a0c1-e7d78541fbdc",
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
  "created_at": "2026-10-28T16:27:36.493823Z",
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
    "id": "17913633-4a85-447b-9f2b-a7e7d756af07",
    "order_id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
    "expires_at": "2026-10-28T16:27:51.497182Z",
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

`POST /api/driver/v1/offers/17913633-4a85-447b-9f2b-a7e7d756af07/accept` → **200**

```json
{
  "command_id": "a6bea687-0de3-437d-946c-e846281ba692"
}
```

```json
{
  "id": "5ca02f8f-c278-4c20-9668-c8949de49c9e",
  "order_id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e1b649fa-f408-4586-946f-9267670b539a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e1b649fa-f408-4586-946f-9267670b539a",
  "order_id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
  "assignment_id": "5ca02f8f-c278-4c20-9668-c8949de49c9e",
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

`POST /api/driver/v1/work-sessions/4a6fe339-ef67-46ba-a408-87de3d6f7a31/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:27:37Z",
    "sequence": 1793204857592
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a6fe339-ef67-46ba-a408-87de3d6f7a31",
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
  "last_heartbeat_at": "2026-10-28T16:27:37.612028Z",
  "last_location_at": "2026-10-28T16:27:37.612028Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e1b649fa-f408-4586-946f-9267670b539a/arrive` → **200**

```json
{
  "command_id": "6ac4dc2c-09ee-4a34-8887-19001c686c24",
  "expected_version": 0
}
```

```json
{
  "id": "e1b649fa-f408-4586-946f-9267670b539a",
  "order_id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
  "assignment_id": "5ca02f8f-c278-4c20-9668-c8949de49c9e",
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
  "arrived_at": "2026-10-28T16:27:37.901817Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e1b649fa-f408-4586-946f-9267670b539a/start` → **200**

```json
{
  "command_id": "70035b29-1ac3-4cdc-a649-99a7ff83f552",
  "expected_version": 1
}
```

```json
{
  "id": "e1b649fa-f408-4586-946f-9267670b539a",
  "order_id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
  "assignment_id": "5ca02f8f-c278-4c20-9668-c8949de49c9e",
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
  "arrived_at": "2026-10-28T16:27:37.901817Z",
  "started_at": "2026-10-28T16:27:38.191849Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/4a6fe339-ef67-46ba-a408-87de3d6f7a31/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:27:38Z",
    "sequence": 1793204858457
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a6fe339-ef67-46ba-a408-87de3d6f7a31",
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
  "last_heartbeat_at": "2026-10-28T16:27:38.476021Z",
  "last_location_at": "2026-10-28T16:27:38.476021Z",
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
  "device_ref": "sandbox-29953"
}
```

```json
{
  "challenge_id": "56975ac0-90ce-4998-8fb2-dc8e3b8a5d2d",
  "expires_at": "2026-10-28T16:32:38.751831993Z",
  "resend_available_at": "2026-10-28T16:27:39.751831993Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "439384",
  "sent_at": "2026-10-28T16:27:38.754303558Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56975ac0-90ce-4998-8fb2-dc8e3b8a5d2d",
  "code": "439384",
  "device_ref": "sandbox-29953"
}
```

```json
{
  "session_id": "5cf57646-16ed-4caf-a513-5243ef7b21fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTc1OSwiaWF0IjoxNzkzMjA0ODU5LCJqdGkiOiJjYTAyMDc0Ni02ZTQyLTRmOWYtYjZiNC04NTQwMjRkNmM1ZTAiLCJzaWQiOiI1Y2Y1NzY0Ni0xNmVkLTRjYWYtYTUxMy01MjQzZWY3YjIxZmUifQ.wRY697qF6eux4aCASHi5H_hiHaGraGOAhinZNfQGAEQ",
  "access_expires_at": "2026-10-28T16:42:39.050187412Z",
  "refresh_token": "uxvyyz5u0f3mvyK_G8o4H7YJizZJwmDX5SK342s0eIc",
  "refresh_expires_at": "2026-11-27T16:27:39.049602199Z",
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
  "command_id": "b7de2130-20df-421a-a96a-c7e70a50084a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:27:39Z",
    "sequence": 1793204859590
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "68e7973a-379a-44e6-b9f9-55a811160124",
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
  "last_heartbeat_at": "2026-10-28T16:27:39.608761Z",
  "last_location_at": "2026-10-28T16:27:39.608761Z",
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
  "session_id": "0836ccfb-95f8-4715-ac02-e6e0b35143dd",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3NjAsImlhdCI6MTc5MzIwNDg2MCwianRpIjoiZjY2NjYwMDEtOGQ4Mi00Y2NkLThmNTItNzI1Y2ViZDVmM2U3Iiwic2lkIjoiMDgzNmNjZmItOTVmOC00NzE1LWFjMDItZTZlMGIzNTE0M2RkIn0.rFQVonuFh2oa7pF8zwSOTiSnikmC3o1Z_IINu5EOVs4",
  "access_expires_at": "2026-10-28T16:42:40.180818129Z",
  "refresh_token": "i5x0MYIvVwr-HO7msM4Eks8_B_7MRtZtQbgpIA5A_UM",
  "refresh_expires_at": "2026-10-29T04:27:40.180271671Z",
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
  "session_id": "7c0d1aee-b8ed-40fd-8e55-19651a0d07fb",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3NjAsImlhdCI6MTc5MzIwNDg2MCwianRpIjoiMjU1MTgzMDEtYTExOC00NWMxLThiMGYtZGFlZGU4ZDlmYzUxIiwic2lkIjoiN2MwZDFhZWUtYjhlZC00MGZkLThlNTUtMTk2NTFhMGQwN2ZiIn0.YKjOuml-gxdtYAYfGfvYpemceuZn7FljCmj4_2lCmwY",
  "access_expires_at": "2026-10-28T16:42:40.739332939Z",
  "refresh_token": "pZVV_2lb2wQ-EeVXZ0CaqO2JsHRd-RM0ssZ70kGRAgc",
  "refresh_expires_at": "2026-10-29T04:27:40.738719845Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c1b1942f-8c9e-4f8d-a21f-4ff431413044` → **200**

```json
{
  "id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
  "short_number": 12,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "627b4d1b-494a-48c7-a0c1-e7d78541fbdc",
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
    "id": "5ca02f8f-c278-4c20-9668-c8949de49c9e",
    "order_id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e1b649fa-f408-4586-946f-9267670b539a",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T16:27:36.493823Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c1b1942f-8c9e-4f8d-a21f-4ff431413044/interrupt` → **200**

```json
{
  "command_id": "9c6fdf2c-2abb-47e7-a7bb-fa1f8d37f406",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
    "short_number": 12,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "627b4d1b-494a-48c7-a0c1-e7d78541fbdc",
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
      "id": "5ca02f8f-c278-4c20-9668-c8949de49c9e",
      "order_id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "e1b649fa-f408-4586-946f-9267670b539a",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T16:27:36.493823Z",
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
    "id": "00e7e00e-f2d6-42c9-9b39-09948ac04a38",
    "short_number": 13,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "627b4d1b-494a-48c7-a0c1-e7d78541fbdc",
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
    "id": "f432e1a5-f19d-4ec4-b412-e08fad4540d5",
    "order_id": "00e7e00e-f2d6-42c9-9b39-09948ac04a38",
    "expires_at": "2026-10-28T16:27:56.337122Z",
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

`POST /api/driver/v1/offers/f432e1a5-f19d-4ec4-b412-e08fad4540d5/accept` → **200**

```json
{
  "command_id": "841c079a-df8c-4b29-8be7-7859760b0e6f"
}
```

```json
{
  "id": "c749d187-279a-43a9-964c-535e4645d344",
  "order_id": "00e7e00e-f2d6-42c9-9b39-09948ac04a38",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ce4429c6-9825-439b-ab67-78724d20196f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ce4429c6-9825-439b-ab67-78724d20196f",
  "order_id": "00e7e00e-f2d6-42c9-9b39-09948ac04a38",
  "assignment_id": "c749d187-279a-43a9-964c-535e4645d344",
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
  "session_id": "68e7973a-379a-44e6-b9f9-55a811160124",
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
  "last_heartbeat_at": "2026-10-28T16:27:39.608761Z",
  "last_location_at": "2026-10-28T16:27:39.608761Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/68e7973a-379a-44e6-b9f9-55a811160124/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:27:42Z",
    "sequence": 1793204862758
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "68e7973a-379a-44e6-b9f9-55a811160124",
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
  "last_heartbeat_at": "2026-10-28T16:27:42.776195Z",
  "last_location_at": "2026-10-28T16:27:42.776195Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ce4429c6-9825-439b-ab67-78724d20196f/arrive` → **200**

```json
{
  "command_id": "b3a5c08d-bdad-40a4-84e1-85ed9395aa14",
  "expected_version": 0
}
```

```json
{
  "id": "ce4429c6-9825-439b-ab67-78724d20196f",
  "order_id": "00e7e00e-f2d6-42c9-9b39-09948ac04a38",
  "assignment_id": "c749d187-279a-43a9-964c-535e4645d344",
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
  "arrived_at": "2026-10-28T16:27:43.060317Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ce4429c6-9825-439b-ab67-78724d20196f/start` → **200**

```json
{
  "command_id": "e65d9149-cb91-419a-a3ef-8c89a0304ccd",
  "expected_version": 1
}
```

```json
{
  "id": "ce4429c6-9825-439b-ab67-78724d20196f",
  "order_id": "00e7e00e-f2d6-42c9-9b39-09948ac04a38",
  "assignment_id": "c749d187-279a-43a9-964c-535e4645d344",
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
  "arrived_at": "2026-10-28T16:27:43.060317Z",
  "started_at": "2026-10-28T16:27:43.342273Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ce4429c6-9825-439b-ab67-78724d20196f/complete` → **200**

```json
{
  "command_id": "1f7201ed-35d0-4b57-b696-67caa8938b3b",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:27:43Z"
}
```

```json
{
  "id": "ce4429c6-9825-439b-ab67-78724d20196f",
  "order_id": "00e7e00e-f2d6-42c9-9b39-09948ac04a38",
  "assignment_id": "c749d187-279a-43a9-964c-535e4645d344",
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
  "arrived_at": "2026-10-28T16:27:43.060317Z",
  "started_at": "2026-10-28T16:27:43.342273Z",
  "completed_at": "2026-10-28T16:27:43.631741Z",
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
    "id": "00e7e00e-f2d6-42c9-9b39-09948ac04a38",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:27:41.327605Z",
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
    "id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
    "short_number": 12,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:27:36.493823Z",
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

`GET /api/operator/v1/orders/c1b1942f-8c9e-4f8d-a21f-4ff431413044/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:27:36.49434Z",
      "actor": {
        "type": "CLIENT",
        "id": "627b4d1b-494a-48c7-a0c1-e7d78541fbdc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
        "quote_id": "bb9a90ec-3663-4291-b73f-e7cda8807de2",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "c6f2eeeb-6932-4886-89e3-9da7230ea488"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:27:36.496341Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
        "attempt_id": "a41fe13d-64de-475d-8ae4-9d6a2f65ba1d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c6f2eeeb-6932-4886-89e3-9da7230ea488"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:27:36.499268Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "17913633-4a85-447b-9f2b-a7e7d756af07",
        "order_id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "c6f2eeeb-6932-4886-89e3-9da7230ea488"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:27:37.064739Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "17913633-4a85-447b-9f2b-a7e7d756af07",
        "order_id": "c1b1942f-8c9e-4f8d-a21f-4ff431413044",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "5ca02f8f-c278-4c20-9668-c8949de49c9e"
      },
      "correlation_id": "6a7978bd-b4e1-4de3-9dc5-b6cab253e9e4"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/00e7e00e-f2d6-42c9-9b39-09948ac04a38/tip` → **200**

```json
{
  "order_id": "00e7e00e-f2d6-42c9-9b39-09948ac04a38",
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
  "available_until": "2026-10-29T16:27:43.631741Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/00e7e00e-f2d6-42c9-9b39-09948ac04a38/tip` → **409**

```json
{
  "command_id": "2ca611d8-fe1d-4912-919b-2622b677ebe5",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/00e7e00e-f2d6-42c9-9b39-09948ac04a38/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "00d27424-3d94-40bf-8a48-89fc5913b613"
}
```

Done: interrupted c1b1942f-8c9e-4f8d-a21f-4ff431413044, follow-up 00e7e00e-f2d6-42c9-9b39-09948ac04a38.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a6fe339-ef67-46ba-a408-87de3d6f7a31",
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
  "last_heartbeat_at": "2026-10-28T16:27:38.476021Z",
  "last_location_at": "2026-10-28T16:27:38.476021Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4a6fe339-ef67-46ba-a408-87de3d6f7a31/close` → **200**

```json
{
  "command_id": "b8d862ba-2412-4a40-9c60-9a3248a9756a",
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
  "session_id": "68e7973a-379a-44e6-b9f9-55a811160124",
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
  "last_heartbeat_at": "2026-10-28T16:27:42.776195Z",
  "last_location_at": "2026-10-28T16:27:42.776195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/68e7973a-379a-44e6-b9f9-55a811160124/close` → **200**

```json
{
  "command_id": "3c726703-b57e-4cf2-8581-a8bb3ce2a5be",
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
  "session_id": "37a7346c-cd6f-4589-9875-d64b0234d4dd",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3NjksImlhdCI6MTc5MzIwNDg2OSwianRpIjoiZjBmMDIxZWMtOTJjMy00MjZmLWI0MTktOThiM2JjNThlZDA4Iiwic2lkIjoiMzdhNzM0NmMtY2Q2Zi00NTg5LTk4NzUtZDY0YjAyMzRkNGRkIn0.NNc2Tyv3GVJjSSZinsK4etnYES2IhL4TTWmqVFw0lU8",
  "access_expires_at": "2026-10-28T16:42:49.702397814Z",
  "refresh_token": "327x3z1YYVl8fpvHnEDyp-PKusK02djZ2GoCVOWeExc",
  "refresh_expires_at": "2026-10-29T04:27:49.701811179Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d10e93f2-5b51-4591-962e-eae3126a0de9",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:27:49Z"
}
```

```json
{
  "id": "6829aa48-e72a-46c7-be26-07502a420b6e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:27:49Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/6829aa48-e72a-46c7-be26-07502a420b6e/publish` → **200**

```json
{
  "command_id": "220ed0aa-1822-4985-9918-88ce0166b804",
  "expected_version": 0
}
```

```json
{
  "id": "6829aa48-e72a-46c7-be26-07502a420b6e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:27:50.281483Z",
  "published_at": "2026-10-28T16:27:50.281483Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "6829aa48-e72a-46c7-be26-07502a420b6e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T16:27:50.281483Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637481197",
  "device_ref": "sandbox-19029"
}
```

```json
{
  "challenge_id": "a7694737-b499-4aea-852f-7ccbfb9dcac7",
  "expires_at": "2026-10-28T16:32:50.832603545Z",
  "resend_available_at": "2026-10-28T16:27:51.832603545Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637481197` → **200**

```json
{
  "phone": "+380637481197",
  "audience": "CLIENT",
  "code": "389605",
  "sent_at": "2026-10-28T16:27:50.835257272Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7694737-b499-4aea-852f-7ccbfb9dcac7",
  "code": "389605",
  "device_ref": "sandbox-19029"
}
```

```json
{
  "session_id": "614e1261-6079-49d8-bb13-11b760783ea6",
  "subject": {
    "type": "CLIENT",
    "id": "f4aa5222-a99c-4d7b-87ef-2e22a6657c60"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNGFhNTIyMi1hOTljLTRkN2ItODdlZi0yZTIyYTY2NTdjNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1NzcxLCJpYXQiOjE3OTMyMDQ4NzEsImp0aSI6IjNmYTdkMzczLTlkOGEtNDI4Yy1hNDllLTY3NzJkNGFiYzQ5YyIsInNpZCI6IjYxNGUxMjYxLTYwNzktNDlkOC1iYjEzLTExYjc2MDc4M2VhNiJ9.WcjSatQdkcGYfNVI9Mj0u-yF6-iAW1bnoeAhjghK30U",
  "access_expires_at": "2026-10-28T16:42:51.129843588Z",
  "refresh_token": "9pBmNzDjJglhRrozQXGOThMDPdoNWJccCiwR4hm03P8",
  "refresh_expires_at": "2026-11-27T16:27:51.129338284Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "6829aa48-e72a-46c7-be26-07502a420b6e",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T16:27:50.281483Z",
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
  "command_id": "fb598e11-3a27-4ac8-90d7-956eb682c162",
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
  "id": "aaff143d-c447-45d8-9ee7-5e6bc8fd4b0e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:32:51.677515Z",
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
  "command_id": "094dec2a-a5be-420a-b0a3-a09959561b8c",
  "quote_id": "aaff143d-c447-45d8-9ee7-5e6bc8fd4b0e",
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
  "correlation_id": "9de7595c-5422-4390-8786-e26abe000920"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "673851e5-2d50-4fc3-9456-6f19f6877a0a",
  "version_id": "6829aa48-e72a-46c7-be26-07502a420b6e",
  "language": "uk"
}
```

```json
{
  "version_id": "6829aa48-e72a-46c7-be26-07502a420b6e",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T16:27:52.248142Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8db096df-06a4-4db8-9835-16f18664d087",
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
  "id": "ac1c80d8-33f1-49ae-888e-54426d467d49",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:32:52.522452Z",
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
  "command_id": "426b5469-9eba-4bc7-996b-2688bf3cc803",
  "quote_id": "ac1c80d8-33f1-49ae-888e-54426d467d49",
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
  "id": "2e6d827c-f0f4-47af-bf12-f093eeb29789",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f4aa5222-a99c-4d7b-87ef-2e22a6657c60",
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
  "created_at": "2026-10-28T16:27:52.80657Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e6d827c-f0f4-47af-bf12-f093eeb29789` → **200**

```json
{
  "id": "2e6d827c-f0f4-47af-bf12-f093eeb29789",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f4aa5222-a99c-4d7b-87ef-2e22a6657c60",
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
  "created_at": "2026-10-28T16:27:52.80657Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2e6d827c-f0f4-47af-bf12-f093eeb29789/cancel` → **200**

```json
{
  "command_id": "caeb5ceb-5dfe-44ff-b20b-9e38cfaaf79a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2e6d827c-f0f4-47af-bf12-f093eeb29789",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f4aa5222-a99c-4d7b-87ef-2e22a6657c60",
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
  "created_at": "2026-10-28T16:27:52.80657Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/6829aa48-e72a-46c7-be26-07502a420b6e` → **409**

```json
{
  "command_id": "6fbcd685-8c1a-49e2-a6b4-c2567a1b6520",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:27:53Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/6829aa48-e72a-46c7-be26-07502a420b6e",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "83fd8b6f-f721-44b9-aff3-9a80abb9da82"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "f934cdff-7616-4046-9518-c91bbd0bac43",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:27:53Z"
}
```

```json
{
  "id": "905e94bf-799e-419d-812c-3775aac56a89",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:27:53Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/905e94bf-799e-419d-812c-3775aac56a89/publish` → **200**

```json
{
  "command_id": "5623e7ec-2002-4a79-b273-f7001f7b66b1",
  "expected_version": 0
}
```

```json
{
  "id": "905e94bf-799e-419d-812c-3775aac56a89",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:27:54.269157Z",
  "published_at": "2026-10-28T16:27:54.269157Z",
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
  "device_ref": "sandbox-31339"
}
```

```json
{
  "challenge_id": "048475c0-9744-4a60-be48-6862cea76e61",
  "expires_at": "2026-10-28T16:32:54.551121147Z",
  "resend_available_at": "2026-10-28T16:27:55.551121147Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "457034",
  "sent_at": "2026-10-28T16:27:54.553480072Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "048475c0-9744-4a60-be48-6862cea76e61",
  "code": "457034",
  "device_ref": "sandbox-31339"
}
```

```json
{
  "session_id": "bd4d6576-60ef-45ba-adf4-a4ff6508481c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTc3NCwiaWF0IjoxNzkzMjA0ODc0LCJqdGkiOiJhZDI4YTg0MS0xYzJjLTRmNTQtYTg5Yi1kZDFkNzg2ZjQ0MzciLCJzaWQiOiJiZDRkNjU3Ni02MGVmLTQ1YmEtYWRmNC1hNGZmNjUwODQ4MWMifQ.4t-sTgFHVJRaDJXSw1opBnmnrTJ6nixRxdjTP3hYDJg",
  "access_expires_at": "2026-10-28T16:42:54.843794612Z",
  "refresh_token": "N4FK_eKw4n4GdvpcbuI0qZFZQqrY83bwlArMr4lH2P8",
  "refresh_expires_at": "2026-11-27T16:27:54.843187389Z",
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
  "command_id": "b7c3dcb3-192d-41a9-981a-bf95f6e4a5bc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:27:55Z",
    "sequence": 1793204875372
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6b74bcad-d387-4f6e-9fc2-61b1f586092f",
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
  "last_heartbeat_at": "2026-10-28T16:27:55.390342Z",
  "last_location_at": "2026-10-28T16:27:55.390342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679871116",
  "device_ref": "sandbox-27550"
}
```

```json
{
  "challenge_id": "e28e7414-11b8-42d0-8cc3-d58375605fc0",
  "expires_at": "2026-10-28T16:32:55.670368123Z",
  "resend_available_at": "2026-10-28T16:27:56.670368123Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679871116` → **200**

```json
{
  "phone": "+380679871116",
  "audience": "CLIENT",
  "code": "912724",
  "sent_at": "2026-10-28T16:27:55.6726051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e28e7414-11b8-42d0-8cc3-d58375605fc0",
  "code": "912724",
  "device_ref": "sandbox-27550"
}
```

```json
{
  "session_id": "0cfdfc47-acc9-4c5e-b44c-6eb7d009f3f2",
  "subject": {
    "type": "CLIENT",
    "id": "4543538d-3a59-4c8e-bd52-0e1a123cd692"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTQzNTM4ZC0zYTU5LTRjOGUtYmQ1Mi0wZTFhMTIzY2Q2OTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1Nzc1LCJpYXQiOjE3OTMyMDQ4NzUsImp0aSI6IjkyYzJiN2QxLTY3NTgtNDgyOS04OWUyLTE3NzUwNmVhMGE0NyIsInNpZCI6IjBjZmRmYzQ3LWFjYzktNGM1ZS1iNDRjLTZlYjdkMDA5ZjNmMiJ9.HjT3B6v8XqEtzjN2QwlkD65wjlVfAuBYw3CqwxMLpME",
  "access_expires_at": "2026-10-28T16:42:55.972464043Z",
  "refresh_token": "okoP0tn-nG5cltVsHPwQ_p3pwcsSiakzDbcFPTA7I3E",
  "refresh_expires_at": "2026-11-27T16:27:55.971916461Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d1fba4cd-088f-49ae-8ccc-c1df12068177",
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
  "id": "a1cb8a08-521d-4e50-9c3f-79d21024f3b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:32:56.247469Z",
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
  "command_id": "515c760b-8edd-4911-8314-54954ed48602",
  "quote_id": "a1cb8a08-521d-4e50-9c3f-79d21024f3b7",
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
    "phone": "+380678903661"
  }
}
```

```json
{
  "id": "1923a0fc-af75-4785-b037-f7e195632aec",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4543538d-3a59-4c8e-bd52-0e1a123cd692",
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
  "created_at": "2026-10-28T16:27:56.541481Z",
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
    "id": "560cc26a-4bde-486c-8dd7-5067af366935",
    "order_id": "1923a0fc-af75-4785-b037-f7e195632aec",
    "expires_at": "2026-10-28T16:28:11.545132Z",
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

`POST /api/driver/v1/offers/560cc26a-4bde-486c-8dd7-5067af366935/accept` → **200**

```json
{
  "command_id": "e0a471ba-e051-44f8-9f7f-8bc7cdad3f3c"
}
```

```json
{
  "id": "79769022-93af-4cca-a416-0f48cad6a22b",
  "order_id": "1923a0fc-af75-4785-b037-f7e195632aec",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "238208e8-5817-4448-bb21-46a4dc814ea9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "238208e8-5817-4448-bb21-46a4dc814ea9",
  "order_id": "1923a0fc-af75-4785-b037-f7e195632aec",
  "assignment_id": "79769022-93af-4cca-a416-0f48cad6a22b",
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
    "phone": "+380678903661"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "689dd0e9-d7a7-4011-9ae4-7aa6b87b837a",
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
  "id": "b6674c5c-6dc2-4ac8-816e-d8f89793cea4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:32:57.680972Z",
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
  "command_id": "baba7d79-7f1c-4586-b356-ca5102056832",
  "quote_id": "b6674c5c-6dc2-4ac8-816e-d8f89793cea4",
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
  "id": "679bda78-41e0-491c-bae7-cf708d5066d8",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4543538d-3a59-4c8e-bd52-0e1a123cd692",
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
  "created_at": "2026-10-28T16:27:57.963858Z",
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
  "command_id": "d260e0c2-6ecd-4601-9034-f4c25df3d616",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T19:27:58Z"
}
```

```json
{
  "id": "4e289abe-d973-4d60-9c68-baf6d2b69440",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:32:58.265329Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:27:58Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "107a3359-120d-4098-a585-93bc405bb06d",
  "quote_id": "4e289abe-d973-4d60-9c68-baf6d2b69440",
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
  "pickup_at": "2026-10-28T19:27:58Z"
}
```

```json
{
  "id": "b6537ee1-b833-4e74-9d13-3be6f9045c42",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4543538d-3a59-4c8e-bd52-0e1a123cd692",
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
  "created_at": "2026-10-28T16:27:58.55944Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:27:58Z",
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
  "command_id": "67e6708d-0120-43e4-a526-9c4e70122d55",
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
  "id": "a94d670d-2eb0-4465-8292-18115fce2b63",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:32:58.864366Z",
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
  "command_id": "942511b6-35ee-41e5-8097-688d8dd49d8b",
  "quote_id": "a94d670d-2eb0-4465-8292-18115fce2b63",
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
  "correlation_id": "81dfb0dc-00f9-44ca-ac9e-4823f304b7bf"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "b6537ee1-b833-4e74-9d13-3be6f9045c42",
      "short_number": 17,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "4543538d-3a59-4c8e-bd52-0e1a123cd692",
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
      "created_at": "2026-10-28T16:27:58.55944Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T19:27:58Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "679bda78-41e0-491c-bae7-cf708d5066d8",
      "short_number": 16,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "4543538d-3a59-4c8e-bd52-0e1a123cd692",
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
      "created_at": "2026-10-28T16:27:57.963858Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "1923a0fc-af75-4785-b037-f7e195632aec",
      "short_number": 15,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "679bda78-41e0-491c-bae7-cf708d5066d8",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4543538d-3a59-4c8e-bd52-0e1a123cd692",
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
  "created_at": "2026-10-28T16:27:57.963858Z",
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

`GET /api/rider/v1/orders/1923a0fc-af75-4785-b037-f7e195632aec` → **200**

```json
{
  "id": "1923a0fc-af75-4785-b037-f7e195632aec",
  "short_number": 15,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4543538d-3a59-4c8e-bd52-0e1a123cd692",
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
    "id": "79769022-93af-4cca-a416-0f48cad6a22b",
    "order_id": "1923a0fc-af75-4785-b037-f7e195632aec",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "238208e8-5817-4448-bb21-46a4dc814ea9",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:27:56.541481Z",
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
    "location_at": "2026-10-28T16:27:55.390342Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/1923a0fc-af75-4785-b037-f7e195632aec/cancel` → **200**

```json
{
  "command_id": "22472d06-f0fb-4692-9175-9e998ee70b33",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1923a0fc-af75-4785-b037-f7e195632aec",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4543538d-3a59-4c8e-bd52-0e1a123cd692",
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
    "id": "79769022-93af-4cca-a416-0f48cad6a22b",
    "order_id": "1923a0fc-af75-4785-b037-f7e195632aec",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "238208e8-5817-4448-bb21-46a4dc814ea9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:27:56.541481Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/679bda78-41e0-491c-bae7-cf708d5066d8` → **200**

```json
{
  "id": "679bda78-41e0-491c-bae7-cf708d5066d8",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4543538d-3a59-4c8e-bd52-0e1a123cd692",
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
  "created_at": "2026-10-28T16:27:57.963858Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/679bda78-41e0-491c-bae7-cf708d5066d8/cancel` → **200**

```json
{
  "command_id": "1632cdc1-c86d-460f-a06f-1cde785e8b8b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "679bda78-41e0-491c-bae7-cf708d5066d8",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4543538d-3a59-4c8e-bd52-0e1a123cd692",
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
  "created_at": "2026-10-28T16:27:57.963858Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6537ee1-b833-4e74-9d13-3be6f9045c42` → **200**

```json
{
  "id": "b6537ee1-b833-4e74-9d13-3be6f9045c42",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4543538d-3a59-4c8e-bd52-0e1a123cd692",
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
  "created_at": "2026-10-28T16:27:58.55944Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:27:58Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b6537ee1-b833-4e74-9d13-3be6f9045c42/cancel` → **200**

```json
{
  "command_id": "3742361c-ad1b-4250-98f2-1d18459c4cb6",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b6537ee1-b833-4e74-9d13-3be6f9045c42",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "4543538d-3a59-4c8e-bd52-0e1a123cd692",
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
  "created_at": "2026-10-28T16:27:58.55944Z",
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
  "pickup_at": "2026-10-28T19:27:58Z",
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
  "session_id": "6b74bcad-d387-4f6e-9fc2-61b1f586092f",
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
  "last_heartbeat_at": "2026-10-28T16:27:55.390342Z",
  "last_location_at": "2026-10-28T16:27:55.390342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6b74bcad-d387-4f6e-9fc2-61b1f586092f/close` → **200**

```json
{
  "command_id": "c836b1e7-a8c5-462c-abe4-86f90654037e",
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

Done: orders 1923a0fc-af75-4785-b037-f7e195632aec, 679bda78-41e0-491c-bae7-cf708d5066d8, b6537ee1-b833-4e74-9d13-3be6f9045c42.

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
  "session_id": "c3da3f4e-3873-4ab2-9fbd-78a54e2d1246",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3ODIsImlhdCI6MTc5MzIwNDg4MiwianRpIjoiMmEzOWE4N2QtNGZhYy00OTIwLWEyYjctODMyOTY5MzkzNTQ5Iiwic2lkIjoiYzNkYTNmNGUtMzg3My00YWIyLTlmYmQtNzhhNTRlMmQxMjQ2In0.wiAsFP1TytJlGZri3pw9YlyH9NtKVgpshpTb0myaY3k",
  "access_expires_at": "2026-10-28T16:43:02.5834809Z",
  "refresh_token": "dm5uecG9b4VDTa-BQgutglmh-aYtAJyS5DmWBEn6L4s",
  "refresh_expires_at": "2026-10-29T04:28:02.582873205Z",
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
  "session_id": "9a245e5c-9f1e-41f0-a9e8-7cccc1796323",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3ODMsImlhdCI6MTc5MzIwNDg4MywianRpIjoiZGYzZDkxMWQtNWVjMi00NDM5LWI5ZTYtYzBjZTY2NDYyY2I0Iiwic2lkIjoiOWEyNDVlNWMtOWYxZS00MWYwLWE5ZTgtN2NjY2MxNzk2MzIzIn0.VWvyNZvgpA6E3swSE_kNNfgAhFmmldHSLYDTIiUhtJs",
  "access_expires_at": "2026-10-28T16:43:03.142845394Z",
  "refresh_token": "j4sYNPApFEwhCAx46kpMPe0wgSrkc6T7oPXgqQqliao",
  "refresh_expires_at": "2026-10-29T04:28:03.14232387Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9468"
}
```

```json
{
  "challenge_id": "da2b008d-1793-4ab6-a79a-6106214047fb",
  "expires_at": "2026-10-28T16:33:03.42375718Z",
  "resend_available_at": "2026-10-28T16:28:04.42375718Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "727428",
  "sent_at": "2026-10-28T16:28:03.426152042Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da2b008d-1793-4ab6-a79a-6106214047fb",
  "code": "727428",
  "device_ref": "sandbox-9468"
}
```

```json
{
  "session_id": "02d53243-752d-455e-837a-4506c7e8d62e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTc4MywiaWF0IjoxNzkzMjA0ODgzLCJqdGkiOiJjMWJkYTVmMS1jM2M1LTQ2ZDEtOGZhMC0zOWM4Mzk4YjAzNjkiLCJzaWQiOiIwMmQ1MzI0My03NTJkLTQ1NWUtODM3YS00NTA2YzdlOGQ2MmUifQ.urJpAfMzznerf0rJmA-LLCKXynfVoFE1aX9ExuOLOUs",
  "access_expires_at": "2026-10-28T16:43:03.721324148Z",
  "refresh_token": "ICD0mJPl8uKDqm-xPHOfSs4wZ6IxQLLyD20qByN1Law",
  "refresh_expires_at": "2026-11-27T16:28:03.720792525Z",
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
  "command_id": "5cedf615-227a-49ff-a425-9149c417ebc4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:28:04Z",
    "sequence": 1793204884253
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e73d7ce7-4174-4230-bf14-480628f744f3",
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
  "last_heartbeat_at": "2026-10-28T16:28:04.271002Z",
  "last_location_at": "2026-10-28T16:28:04.271002Z",
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
  "command_id": "5d98f88b-c045-4867-a4a7-8175c8126188",
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
  "effective_at": "2026-10-28T16:28:04.829562Z",
  "changed_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T16:25:49.236248Z",
  "last_entries": [
    {
      "order_id": "bc5c5cae-c879-47ff-a232-6be7b1af1766",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T16:25:49.236248Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "db34c02a-9d2c-4a17-8cfc-4ed62bdd88cd",
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
  "id": "4378263a-fce2-4798-983f-6d9321c4f14d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:33:05.381444Z",
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
  "command_id": "3cbbe290-cbe8-48a1-ad10-df40d842862e",
  "quote_id": "4378263a-fce2-4798-983f-6d9321c4f14d",
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
    "phone": "+3806711111920"
  }
}
```

```json
{
  "id": "93e89300-fb43-49c6-b2ef-27b5e7323210",
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
  "created_at": "2026-10-28T16:28:05.672482Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111920"
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
    "id": "598bcf70-279d-4946-af46-61624ba144bb",
    "order_id": "93e89300-fb43-49c6-b2ef-27b5e7323210",
    "expires_at": "2026-10-28T16:28:20.676189Z",
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

`POST /api/driver/v1/offers/598bcf70-279d-4946-af46-61624ba144bb/accept` → **200**

```json
{
  "command_id": "61e80f75-5dde-45b8-aaf2-08b6c05f9de6"
}
```

```json
{
  "id": "c204d1ef-eef9-4c21-99a0-bb513245c3a8",
  "order_id": "93e89300-fb43-49c6-b2ef-27b5e7323210",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cc8cfe49-10b0-40df-a2a7-6c4e4df07713",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cc8cfe49-10b0-40df-a2a7-6c4e4df07713",
  "order_id": "93e89300-fb43-49c6-b2ef-27b5e7323210",
  "assignment_id": "c204d1ef-eef9-4c21-99a0-bb513245c3a8",
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
    "phone": "+3806711111920"
  }
}
```

`POST /api/driver/v1/work-sessions/e73d7ce7-4174-4230-bf14-480628f744f3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:28:06Z",
    "sequence": 1793204886779
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e73d7ce7-4174-4230-bf14-480628f744f3",
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
  "last_heartbeat_at": "2026-10-28T16:28:06.797935Z",
  "last_location_at": "2026-10-28T16:28:06.797935Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cc8cfe49-10b0-40df-a2a7-6c4e4df07713/arrive` → **200**

```json
{
  "command_id": "869d6bd3-704f-4ae1-82cb-d844e457854c",
  "expected_version": 0
}
```

```json
{
  "id": "cc8cfe49-10b0-40df-a2a7-6c4e4df07713",
  "order_id": "93e89300-fb43-49c6-b2ef-27b5e7323210",
  "assignment_id": "c204d1ef-eef9-4c21-99a0-bb513245c3a8",
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
  "arrived_at": "2026-10-28T16:28:07.104585Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711111920"
  }
}
```

`POST /api/driver/v1/trips/cc8cfe49-10b0-40df-a2a7-6c4e4df07713/start` → **200**

```json
{
  "command_id": "1beb16b4-6d6a-47f1-8346-49b7820216e7",
  "expected_version": 1
}
```

```json
{
  "id": "cc8cfe49-10b0-40df-a2a7-6c4e4df07713",
  "order_id": "93e89300-fb43-49c6-b2ef-27b5e7323210",
  "assignment_id": "c204d1ef-eef9-4c21-99a0-bb513245c3a8",
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
  "arrived_at": "2026-10-28T16:28:07.104585Z",
  "started_at": "2026-10-28T16:28:07.390241Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711111920"
  }
}
```

`POST /api/driver/v1/trips/cc8cfe49-10b0-40df-a2a7-6c4e4df07713/complete` → **200**

```json
{
  "command_id": "aa81e7f1-fc04-49c3-ab5e-6fab3d0a07d2",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:28:07Z",
  "cash_received": true
}
```

```json
{
  "id": "cc8cfe49-10b0-40df-a2a7-6c4e4df07713",
  "order_id": "93e89300-fb43-49c6-b2ef-27b5e7323210",
  "assignment_id": "c204d1ef-eef9-4c21-99a0-bb513245c3a8",
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
  "arrived_at": "2026-10-28T16:28:07.104585Z",
  "started_at": "2026-10-28T16:28:07.390241Z",
  "completed_at": "2026-10-28T16:28:07.687969Z",
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
  "command_id": "b34baa82-a17e-44c5-ba99-087a936be8e7",
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
  "id": "4b9c6718-0444-43b2-bcd4-0b015cbcd89a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:33:07.986171Z",
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
  "command_id": "df835f27-0e63-4d7a-ad04-ac8f72e44aaa",
  "quote_id": "4b9c6718-0444-43b2-bcd4-0b015cbcd89a",
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
    "phone": "+380671118490"
  }
}
```

```json
{
  "id": "76ec9c5c-f96a-4405-b48e-151335be7490",
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
  "created_at": "2026-10-28T16:28:08.262301Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118490"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/76ec9c5c-f96a-4405-b48e-151335be7490` → **200**

```json
{
  "id": "76ec9c5c-f96a-4405-b48e-151335be7490",
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
  "created_at": "2026-10-28T16:28:08.262301Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118490"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/76ec9c5c-f96a-4405-b48e-151335be7490/cancel` → **200**

```json
{
  "command_id": "052ac0f9-043b-4f13-b6a2-bb305b37f4ae",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "76ec9c5c-f96a-4405-b48e-151335be7490",
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
  "created_at": "2026-10-28T16:28:08.262301Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118490"
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
  "staff_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T16:25:49.236248Z",
  "last_entries": [
    {
      "order_id": "76ec9c5c-f96a-4405-b48e-151335be7490",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T16:28:08.850499Z"
    },
    {
      "order_id": "93e89300-fb43-49c6-b2ef-27b5e7323210",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T16:28:07.693643Z"
    },
    {
      "order_id": "bc5c5cae-c879-47ff-a232-6be7b1af1766",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T16:25:49.236248Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e73d7ce7-4174-4230-bf14-480628f744f3",
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
  "last_heartbeat_at": "2026-10-28T16:28:06.797935Z",
  "last_location_at": "2026-10-28T16:28:06.797935Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e73d7ce7-4174-4230-bf14-480628f744f3/close` → **200**

```json
{
  "command_id": "b6cd0de0-9ebb-443f-8fa2-b6e384b0dfe9",
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

Done: operator bonus for fulfilled 93e89300-fb43-49c6-b2ef-27b5e7323210 and operator-fault cancellation 76ec9c5c-f96a-4405-b48e-151335be7490.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676793360",
  "device_ref": "sandbox-20585"
}
```

```json
{
  "challenge_id": "7737053a-5326-4950-abf2-5f0365cddb9a",
  "expires_at": "2026-10-28T16:33:12.018299474Z",
  "resend_available_at": "2026-10-28T16:28:13.018299474Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676793360` → **200**

```json
{
  "phone": "+380676793360",
  "audience": "CLIENT",
  "code": "358124",
  "sent_at": "2026-10-28T16:28:12.021253019Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675642772",
  "device_ref": "sandbox-24839",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "50df0ae4-9dcf-4b66-bbdb-a86e3b4b0456",
  "expires_at": "2026-10-28T16:33:12.320466922Z",
  "resend_available_at": "2026-10-28T16:28:13.320466922Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675642772` → **200**

```json
{
  "phone": "+380675642772",
  "audience": "CLIENT",
  "code": "780263",
  "sent_at": "2026-10-28T16:28:12.32274192Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671870000",
  "device_ref": "sandbox-6230"
}
```

```json
{
  "challenge_id": "1ab1d3bd-7c90-4fb4-8cbe-3119d92651c5",
  "expires_at": "2026-10-28T16:33:12.620514282Z",
  "resend_available_at": "2026-10-28T16:28:13.620514282Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671870000` → **200**

```json
{
  "phone": "+380671870000",
  "audience": "CLIENT",
  "code": "601455",
  "sent_at": "2026-10-28T16:28:12.623794267Z",
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
  "session_id": "ee1d220c-2449-426d-a942-a0ad53f4b686",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3OTMsImlhdCI6MTc5MzIwNDg5MywianRpIjoiYzdmMTFkMmMtNzk0YS00ZTlkLWFlMjQtOWRlNGRmZmJjN2FhIiwic2lkIjoiZWUxZDIyMGMtMjQ0OS00MjZkLWE5NDItYTBhZDUzZjRiNjg2In0.7Z61e2I5Vsl1NRc3HXZgPoWpz0cunfOVz0x9TRI7yx0",
  "access_expires_at": "2026-10-28T16:43:13.199229912Z",
  "refresh_token": "tiOGRf5lPMIBYjdKEeEiYyjxIcsHrwPj8Hkwr_nFI2E",
  "refresh_expires_at": "2026-10-29T04:28:13.19845251Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671870000` → **200**

```json
{
  "deliveries": [
    {
      "id": "0ebed9ec-98bd-4fc0-85c5-6dde53d31ab4",
      "challenge_id": "1ab1d3bd-7c90-4fb4-8cbe-3119d92651c5",
      "phone": "+380671870000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-bb7c090d-4b50-4fad-bc7f-fc2b902ac81f",
      "error": null,
      "attempted_at": "2026-10-28T16:28:12.624031Z"
    },
    {
      "id": "f80c24d5-6c6d-4a2e-9547-82eee0ecfc52",
      "challenge_id": "1ab1d3bd-7c90-4fb4-8cbe-3119d92651c5",
      "phone": "+380671870000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T16:28:12.622863Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380671870000` → **200**

```json
{
  "phone": "+380671870000",
  "audience": "CLIENT",
  "code": "601455",
  "sent_at": "2026-10-28T16:28:12.623794267Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675642772` → **200**

```json
{
  "deliveries": [
    {
      "id": "66482ab9-741a-4b45-b133-8fa055b63fa0",
      "challenge_id": "50df0ae4-9dcf-4b66-bbdb-a86e3b4b0456",
      "phone": "+380675642772",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-17908932-2e40-4a9f-876d-bea594c5788d",
      "error": null,
      "attempted_at": "2026-10-28T16:28:12.322987Z"
    }
  ]
}
```

Done: SMS to +380676793360, a call to +380675642772, SMS then a call to +380671870000.

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
  "session_id": "f2229dac-47d2-46e1-825a-ad248372a76d",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3OTQsImlhdCI6MTc5MzIwNDg5NCwianRpIjoiYjJlOWZlZjEtNGNiMy00MTE4LThiMDItMWZjMjYzZDk1ZTA1Iiwic2lkIjoiZjIyMjlkYWMtNDdkMi00NmUxLTgyNWEtYWQyNDgzNzJhNzZkIn0.JZN7Jx4q3WtX6ylPoKnTZoOp10i4dwn69REnZ3wg5FM",
  "access_expires_at": "2026-10-28T16:43:14.35607642Z",
  "refresh_token": "HY0Z6ke7Cnykdn-G5oBdlppbHC34CdXniqxJbpVA-mE",
  "refresh_expires_at": "2026-10-29T04:28:14.35549801Z",
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
  "session_id": "9d0aab3d-a898-4425-9985-264f93dcf76f",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU3OTQsImlhdCI6MTc5MzIwNDg5NCwianRpIjoiODZjNzZmMTQtMzYwOS00MTIxLWExOTctZWI1NGUyMTRhMjk2Iiwic2lkIjoiOWQwYWFiM2QtYTg5OC00NDI1LTk5ODUtMjY0ZjkzZGNmNzZmIn0.lzrG6OM2uGXLnWjfU_570P49JxQuCCXSLoR1eLBheck",
  "access_expires_at": "2026-10-28T16:43:14.916808568Z",
  "refresh_token": "tg-7SsoaYI4cGMPCLrv1W1BZxfFpF90z8hj3-Q-u2l0",
  "refresh_expires_at": "2026-10-29T04:28:14.916249933Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
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

`POST /api/admin/v1/staff-extensions/4cfe205f-a936-4f00-8f28-6b2daba5d15d` → **200**

```json
{
  "command_id": "ecf55b56-4dae-4526-b40c-a4ef9842be86",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "5d513b9b-ebd0-432b-aae0-2889b3c84ada",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:28:16.028532Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:28:16.028532Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b8ea0cd7-38bc-4c20-91ff-72a2e8d61132",
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
  "id": "107fbfc4-39f6-48ef-ae91-948638b67323",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:33:16.584263Z",
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
  "command_id": "0218d9a2-4504-4d06-867a-c90984556439",
  "quote_id": "107fbfc4-39f6-48ef-ae91-948638b67323",
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
    "phone": "+380671581383"
  }
}
```

```json
{
  "id": "eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c",
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
  "created_at": "2026-10-28T16:28:16.86523Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671581383"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c/calls` → **201**

```json
{
  "command_id": "0a9a4ece-67d3-4dfb-8b68-cf78d81ad8aa",
  "to": "CALLER"
}
```

```json
{
  "id": "4788e9f0-d4b1-4ec9-aeb3-a668cd852aec",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "order_ids": [
    "eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c"
  ],
  "started_at": "2026-10-28T16:28:17.188904Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c/calls` → **201**

```json
{
  "command_id": "0a9a4ece-67d3-4dfb-8b68-cf78d81ad8aa",
  "to": "CALLER"
}
```

```json
{
  "id": "4788e9f0-d4b1-4ec9-aeb3-a668cd852aec",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "order_ids": [
    "eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c"
  ],
  "started_at": "2026-10-28T16:28:17.188904Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "4788e9f0-d4b1-4ec9-aeb3-a668cd852aec",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671581383",
    "at": "2026-10-28T16:28:17.191257298Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "4788e9f0-d4b1-4ec9-aeb3-a668cd852aec",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.3296",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "4788e9f0-d4b1-4ec9-aeb3-a668cd852aec"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "4788e9f0-d4b1-4ec9-aeb3-a668cd852aec",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c` → **200**

```json
{
  "calls": [
    {
      "id": "4788e9f0-d4b1-4ec9-aeb3-a668cd852aec",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "order_ids": [
        "eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c"
      ],
      "started_at": "2026-10-28T16:28:17.188904Z",
      "answered_at": "2026-10-28T16:28:17.857908Z",
      "ended_at": "2026-10-28T16:28:17.880856Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c` → **200**

```json
{
  "calls": [
    {
      "id": "4788e9f0-d4b1-4ec9-aeb3-a668cd852aec",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "order_ids": [
        "eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c"
      ],
      "started_at": "2026-10-28T16:28:17.188904Z",
      "answered_at": "2026-10-28T16:28:17.857908Z",
      "ended_at": "2026-10-28T16:28:17.880856Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:28:19.752242Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c` → **200**

```json
{
  "id": "eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c",
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
  "created_at": "2026-10-28T16:28:16.86523Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671581383"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c/cancel` → **200**

```json
{
  "command_id": "92d089eb-102a-4536-a52d-34f0844b8b27",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c",
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
  "created_at": "2026-10-28T16:28:16.86523Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671581383"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
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
  "command_id": "09cf8556-91dd-4386-bbd3-6630b72607fa",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T16:28:21.093962Z",
  "extension": "101"
}
```

Done: outgoing call 4788e9f0-d4b1-4ec9-aeb3-a668cd852aec from order eafa5e06-f2cd-4d89-a53a-da66e3d7dd0c, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633073912",
  "device_ref": "sandbox-11154"
}
```

```json
{
  "challenge_id": "c8a6bde2-8d5a-4593-8f67-768bebfed46c",
  "expires_at": "2026-10-28T16:33:21.375387389Z",
  "resend_available_at": "2026-10-28T16:28:22.375387389Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633073912` → **200**

```json
{
  "phone": "+380633073912",
  "audience": "CLIENT",
  "code": "900864",
  "sent_at": "2026-10-28T16:28:21.377842078Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c8a6bde2-8d5a-4593-8f67-768bebfed46c",
  "code": "900864",
  "device_ref": "sandbox-11154"
}
```

```json
{
  "session_id": "a31a3c11-ca1d-4bf0-8f35-431ef6b1242b",
  "subject": {
    "type": "CLIENT",
    "id": "9eed6c13-875c-458b-83d6-124927f16c41"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZWVkNmMxMy04NzVjLTQ1OGItODNkNi0xMjQ5MjdmMTZjNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1ODAxLCJpYXQiOjE3OTMyMDQ5MDEsImp0aSI6ImZhMzcxOWY2LWZiZTAtNDZiNy1iZWFhLTZlZmY5YTQ3MmM3ZiIsInNpZCI6ImEzMWEzYzExLWNhMWQtNGJmMC04ZjM1LTQzMWVmNmIxMjQyYiJ9.WPyk536qnhVUIt11zhZHyZm9EInxIB4fTontcL3mpTk",
  "access_expires_at": "2026-10-28T16:43:21.67411628Z",
  "refresh_token": "CYrJsPossyC6yEJ_50Qh0I2_LIgXFx1iROeb1HDxIu4",
  "refresh_expires_at": "2026-11-27T16:28:21.673176857Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9eed6c13-875c-458b-83d6-124927f16c41",
  "session_id": "a31a3c11-ca1d-4bf0-8f35-431ef6b1242b",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633073912",
  "device_ref": "sandbox-32102"
}
```

```json
{
  "challenge_id": "e94fb124-8795-4c95-a21b-83fef5d4457f",
  "expires_at": "2026-10-28T16:33:24.222132567Z",
  "resend_available_at": "2026-10-28T16:28:25.222132567Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633073912` → **200**

```json
{
  "phone": "+380633073912",
  "audience": "CLIENT",
  "code": "051531",
  "sent_at": "2026-10-28T16:28:24.224204468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e94fb124-8795-4c95-a21b-83fef5d4457f",
  "code": "051531",
  "device_ref": "sandbox-32102"
}
```

```json
{
  "session_id": "859d6763-677b-425f-8e62-fc8ce533d65a",
  "subject": {
    "type": "CLIENT",
    "id": "9eed6c13-875c-458b-83d6-124927f16c41"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZWVkNmMxMy04NzVjLTQ1OGItODNkNi0xMjQ5MjdmMTZjNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1ODA0LCJpYXQiOjE3OTMyMDQ5MDQsImp0aSI6ImVmNDYyODI4LTkwN2UtNGE1NS04YTBjLTdlOTQ3ZTI5NTQzMiIsInNpZCI6Ijg1OWQ2NzYzLTY3N2ItNDI1Zi04ZTYyLWZjOGNlNTMzZDY1YSJ9.A2rousPfglesjS_ZP-HPk5vNqS80fIHMBesksw7hgvc",
  "access_expires_at": "2026-10-28T16:43:24.516265466Z",
  "refresh_token": "b5X5LK2Ch73U468CIfB2gIxCfAUzLxSyKn_d9uqQqik",
  "refresh_expires_at": "2026-11-27T16:28:24.51563044Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "bcff8c08-a166-4bc6-9fe6-0ad2e8db9af4",
  "expires_at": "2026-10-28T16:33:26.806365783Z",
  "resend_available_at": "2026-10-28T16:28:27.806365783Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633073912` → **200**

```json
{
  "phone": "+380633073912",
  "audience": "CLIENT",
  "code": "241293",
  "sent_at": "2026-10-28T16:28:26.809024309Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639640226"
}
```

```json
{
  "challenge_id": "4ed5064b-70d9-4e71-a5d3-69e0d0b4e237",
  "expires_at": "2026-10-28T16:33:27.10335362Z",
  "resend_available_at": "2026-10-28T16:28:28.10335362Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639640226` → **200**

```json
{
  "phone": "+380639640226",
  "audience": "CLIENT",
  "code": "529872",
  "sent_at": "2026-10-28T16:28:27.105572323Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "21be2a01-bda5-4b20-abd1-133cd7edc073",
  "current_challenge_id": "bcff8c08-a166-4bc6-9fe6-0ad2e8db9af4",
  "current_code": "000000",
  "new_challenge_id": "4ed5064b-70d9-4e71-a5d3-69e0d0b4e237",
  "new_code": "529872"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "685a30d3-f63f-4b92-817d-c3b004f29d39"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "4acd111a-8e74-495b-aca8-92eddcc861e2",
  "current_challenge_id": "bcff8c08-a166-4bc6-9fe6-0ad2e8db9af4",
  "current_code": "241293",
  "new_challenge_id": "4ed5064b-70d9-4e71-a5d3-69e0d0b4e237",
  "new_code": "529872"
}
```

```json
{
  "subject_id": "9eed6c13-875c-458b-83d6-124927f16c41",
  "phone": "+380639640226",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9eed6c13-875c-458b-83d6-124927f16c41",
  "session_id": "a31a3c11-ca1d-4bf0-8f35-431ef6b1242b",
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
  "correlation_id": "336e008d-0857-406e-b08a-ab58b7a2baf0"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639640226",
  "device_ref": "sandbox-32418"
}
```

```json
{
  "challenge_id": "cdc9878f-cc26-4b4b-a516-0a769f037d13",
  "expires_at": "2026-10-28T16:33:30.509429267Z",
  "resend_available_at": "2026-10-28T16:28:31.509429267Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639640226` → **200**

```json
{
  "phone": "+380639640226",
  "audience": "CLIENT",
  "code": "197904",
  "sent_at": "2026-10-28T16:28:30.511635978Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdc9878f-cc26-4b4b-a516-0a769f037d13",
  "code": "197904",
  "device_ref": "sandbox-32418"
}
```

```json
{
  "session_id": "118da45a-f4bf-4d82-a283-6ef11ce02d8f",
  "subject": {
    "type": "CLIENT",
    "id": "9eed6c13-875c-458b-83d6-124927f16c41"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZWVkNmMxMy04NzVjLTQ1OGItODNkNi0xMjQ5MjdmMTZjNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1ODEwLCJpYXQiOjE3OTMyMDQ5MTAsImp0aSI6IjAyNWJmZTlmLTExNmMtNDgzYy04ZGUwLWYxNzNiZWYwNjI4OSIsInNpZCI6IjExOGRhNDVhLWY0YmYtNGQ4Mi1hMjgzLTZlZjExY2UwMmQ4ZiJ9.u-2q85CM7H71oKrCAZhY6nsCm0aH8eamwOMOnhFMBR8",
  "access_expires_at": "2026-10-28T16:43:30.807708466Z",
  "refresh_token": "kUtpTg_zhuoIn29KyY7roouFu9wWNfDajDpwRRFccGo",
  "refresh_expires_at": "2026-11-27T16:28:30.807103467Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9eed6c13-875c-458b-83d6-124927f16c41",
  "session_id": "118da45a-f4bf-4d82-a283-6ef11ce02d8f",
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
  "session_id": "55db6b41-b34a-4ac2-a4e4-b66b5561a309",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4MTEsImlhdCI6MTc5MzIwNDkxMSwianRpIjoiYzM2NzA5ODQtOWM0Yy00MjQ3LTk4Y2EtZjZjZmM4ZjJkNTgzIiwic2lkIjoiNTVkYjZiNDEtYjM0YS00YWMyLWE0ZTQtYjY2YjU1NjFhMzA5In0.4UVJR849h-eYuTpzybpHDDSz72hONHFOvwkEaFQCLlo",
  "access_expires_at": "2026-10-28T16:43:31.646780513Z",
  "refresh_token": "LwN7XRFcpz4e2qX9irHpmSP9u71nxpL7jfX0X5KKFZ8",
  "refresh_expires_at": "2026-10-29T04:28:31.646125791Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/9eed6c13-875c-458b-83d6-124927f16c41` → **200**

```json
{
  "client": {
    "id": "9eed6c13-875c-458b-83d6-124927f16c41",
    "phone": "+380639640226",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:28:21.671576Z",
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

`POST /api/admin/v1/clients/9eed6c13-875c-458b-83d6-124927f16c41/phone/new-code` → **201**

```json
{
  "phone": "+380639724410"
}
```

```json
{
  "challenge_id": "2df88ec2-d470-497a-b4e9-7548e27ef19d",
  "expires_at": "2026-10-28T16:33:32.216831314Z",
  "resend_available_at": "2026-10-28T16:28:33.216831314Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639724410` → **200**

```json
{
  "phone": "+380639724410",
  "audience": "CLIENT",
  "code": "493459",
  "sent_at": "2026-10-28T16:28:32.218961681Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/9eed6c13-875c-458b-83d6-124927f16c41/phone` → **422**

```json
{
  "command_id": "6ddf7103-d5c9-4762-a9f1-402ac62cabf5",
  "expected_version": 3,
  "new_challenge_id": "2df88ec2-d470-497a-b4e9-7548e27ef19d",
  "new_code": "493460",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/9eed6c13-875c-458b-83d6-124927f16c41/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "b05c0eca-69cd-4689-b1ae-332f91b8f826"
}
```

`POST /api/admin/v1/clients/9eed6c13-875c-458b-83d6-124927f16c41/phone` → **400**

```json
{
  "command_id": "05df72c7-dce7-46eb-a638-980197acfc7f",
  "expected_version": 3,
  "new_challenge_id": "2df88ec2-d470-497a-b4e9-7548e27ef19d",
  "new_code": "493459",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9eed6c13-875c-458b-83d6-124927f16c41/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "671a27a5-5adc-4db0-986d-1d33d44e4322",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/9eed6c13-875c-458b-83d6-124927f16c41/phone` → **200**

```json
{
  "command_id": "2a9a4967-6290-45f9-b5d2-9aab71acff07",
  "expected_version": 3,
  "new_challenge_id": "2df88ec2-d470-497a-b4e9-7548e27ef19d",
  "new_code": "493459",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "9eed6c13-875c-458b-83d6-124927f16c41",
  "phone": "+380639724410",
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
  "correlation_id": "8d872410-1ff5-45c2-9652-7458abf5d315"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639724410",
  "device_ref": "sandbox-15303"
}
```

```json
{
  "challenge_id": "1efa081b-63b8-4e3e-acfb-1151f8948aac",
  "expires_at": "2026-10-28T16:33:33.635541752Z",
  "resend_available_at": "2026-10-28T16:28:34.635541752Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639724410` → **200**

```json
{
  "phone": "+380639724410",
  "audience": "CLIENT",
  "code": "665325",
  "sent_at": "2026-10-28T16:28:33.637767317Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1efa081b-63b8-4e3e-acfb-1151f8948aac",
  "code": "665325",
  "device_ref": "sandbox-15303"
}
```

```json
{
  "session_id": "0b6c94c5-2262-42db-b773-65cbf042e328",
  "subject": {
    "type": "CLIENT",
    "id": "9eed6c13-875c-458b-83d6-124927f16c41"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZWVkNmMxMy04NzVjLTQ1OGItODNkNi0xMjQ5MjdmMTZjNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1ODEzLCJpYXQiOjE3OTMyMDQ5MTMsImp0aSI6IjkyZDk5NjI1LWIwMDQtNDFhZi05NjczLTY0NGQwMzlmMjQ5NSIsInNpZCI6IjBiNmM5NGM1LTIyNjItNDJkYi1iNzczLTY1Y2JmMDQyZTMyOCJ9.ZStrwGUX2Pm-n9TVKXS8sGPlM4E0H0SVLaBQAhuqnY0",
  "access_expires_at": "2026-10-28T16:43:33.937062162Z",
  "refresh_token": "gLqNO9dTCgEsA57CJkfHabILGsRjU8hC4B8xbM1PKzw",
  "refresh_expires_at": "2026-11-27T16:28:33.936433578Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9eed6c13-875c-458b-83d6-124927f16c41",
  "session_id": "0b6c94c5-2262-42db-b773-65cbf042e328",
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
  "phone": "+380631606553",
  "device_ref": "sandbox-24264"
}
```

```json
{
  "challenge_id": "d6cf786e-23aa-4945-9bc3-7ce801176075",
  "expires_at": "2026-10-28T16:33:34.48870059Z",
  "resend_available_at": "2026-10-28T16:28:35.48870059Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631606553` → **200**

```json
{
  "phone": "+380631606553",
  "audience": "CLIENT",
  "code": "127311",
  "sent_at": "2026-10-28T16:28:34.490823393Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6cf786e-23aa-4945-9bc3-7ce801176075",
  "code": "127311",
  "device_ref": "sandbox-24264"
}
```

```json
{
  "session_id": "a51eecff-7932-41e5-a5fa-d0d75145387d",
  "subject": {
    "type": "CLIENT",
    "id": "261eaa3d-8416-4fc9-837b-267c73d09069"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNjFlYWEzZC04NDE2LTRmYzktODM3Yi0yNjdjNzNkMDkwNjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1ODE0LCJpYXQiOjE3OTMyMDQ5MTQsImp0aSI6ImYxZTJhOWE3LTkxZTMtNGY3YS04YTk4LTRlNmY1YTJjZDQ2YSIsInNpZCI6ImE1MWVlY2ZmLTc5MzItNDFlNS1hNWZhLWQwZDc1MTQ1Mzg3ZCJ9.N289IwN2fv3EiD45a8_cly-90o9K1kH1SLRH-7UNhLE",
  "access_expires_at": "2026-10-28T16:43:34.782163646Z",
  "refresh_token": "l8B23GP_lVFL5gE1HETcjNJ6rmnxQmB-tR5c9LYYUqU",
  "refresh_expires_at": "2026-11-27T16:28:34.781558827Z",
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
  "session_id": "055fc792-055b-4192-8bf3-7883166d4743",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4MTUsImlhdCI6MTc5MzIwNDkxNSwianRpIjoiZGJlZTM0MDgtZjFlYi00YmU2LTg3ZGEtNDRjYmU4NzE5ZmI1Iiwic2lkIjoiMDU1ZmM3OTItMDU1Yi00MTkyLThiZjMtNzg4MzE2NmQ0NzQzIn0.oqT6oz4U6adZ_RlZsRc4ygswQdf3D6-uXjXtsSfnH9A",
  "access_expires_at": "2026-10-28T16:43:35.895013232Z",
  "refresh_token": "wYD0E3hW4If_QWfcZF581lNPKDqUf-Y5tZ9UCfdPMas",
  "refresh_expires_at": "2026-10-29T04:28:35.894082915Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631606553` → **200**

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
  "correlation_id": "9af49c3b-4b4e-440e-8e4a-1885cdaa3427"
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
  "session_id": "c7da3b4f-880e-45e9-b2ce-ab550a2f335f",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4MTcsImlhdCI6MTc5MzIwNDkxNywianRpIjoiNThmNDk0ZDYtOWQ4Ni00YzI3LTk0MWMtZTdmMDY0ZTk1YTg4Iiwic2lkIjoiYzdkYTNiNGYtODgwZS00NWU5LWIyY2UtYWI1NTBhMmYzMzVmIn0.kH3OsQc4uh1wWbIxqmqoo0GDHQUAeIQ-t6Sr9FvWVFc",
  "access_expires_at": "2026-10-28T16:43:37.020611447Z",
  "refresh_token": "LqiH4HgYjELoGMPHtDZXxgAa2jEzlCVR9qBip30pnvU",
  "refresh_expires_at": "2026-10-29T04:28:37.019925857Z",
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
  "command_id": "0d5b4fd1-eb58-483b-be8a-d089673aa7fd",
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
  "changed_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T16:28:37.606677847Z"
}
```

## The rider books the airport for 2026-10-28T19:28:36Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600267488",
  "device_ref": "sandbox-6457"
}
```

```json
{
  "challenge_id": "6ac03f5b-1ee8-4146-a5d1-265f4f4f7326",
  "expires_at": "2026-10-28T16:33:37.899322417Z",
  "resend_available_at": "2026-10-28T16:28:38.899322417Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600267488` → **200**

```json
{
  "phone": "+48600267488",
  "audience": "CLIENT",
  "code": "194914",
  "sent_at": "2026-10-28T16:28:37.902021614Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ac03f5b-1ee8-4146-a5d1-265f4f4f7326",
  "code": "194914",
  "device_ref": "sandbox-6457"
}
```

```json
{
  "session_id": "6c1adac9-2545-430e-a2b9-95a87c00300d",
  "subject": {
    "type": "CLIENT",
    "id": "a3549d6e-4566-4ee9-ad47-4d008aa8685a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzU0OWQ2ZS00NTY2LTRlZTktYWQ0Ny00ZDAwOGFhODY4NWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1ODE4LCJpYXQiOjE3OTMyMDQ5MTgsImp0aSI6IjM3NDZmOTQ4LTM5YjUtNGE0Mi1hNzBkLWY2ZGE1MTAzNDZkNiIsInNpZCI6IjZjMWFkYWM5LTI1NDUtNDMwZS1hMmI5LTk1YTg3YzAwMzAwZCJ9.kLqIyiZz9DGNoxYUTb6MsI7Wo-kzbp0RItdmjHEj3HA",
  "access_expires_at": "2026-10-28T16:43:38.197889714Z",
  "refresh_token": "ZS6OQG316DM3EXqsk-KN-xJ-7JM1ytBKy50SgSmiqBs",
  "refresh_expires_at": "2026-11-27T16:28:38.197234651Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9f72679b-b39d-4caf-b01b-aea9ec355766",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T19:28:36Z"
}
```

```json
{
  "id": "6d89d5bd-c580-4529-acad-ea66b5cf2508",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:33:38.481602Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:28:36Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9f6480de-de25-46fa-9b6d-6e77c6c0df62",
  "quote_id": "6d89d5bd-c580-4529-acad-ea66b5cf2508",
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
  "pickup_at": "2026-10-28T19:28:36Z"
}
```

```json
{
  "id": "99f85cb5-d4ba-418a-a08f-2b30c3f356d6",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a3549d6e-4566-4ee9-ad47-4d008aa8685a",
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
  "created_at": "2026-10-28T16:28:38.762352Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:28:36Z",
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
  "device_ref": "sandbox-23307"
}
```

```json
{
  "challenge_id": "537a2f1a-6cf4-4f31-8da6-129e2deac77c",
  "expires_at": "2026-10-28T16:33:39.056664264Z",
  "resend_available_at": "2026-10-28T16:28:40.056664264Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "811940",
  "sent_at": "2026-10-28T16:28:39.059150145Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "537a2f1a-6cf4-4f31-8da6-129e2deac77c",
  "code": "811940",
  "device_ref": "sandbox-23307"
}
```

```json
{
  "session_id": "a58ab2ba-72df-44d5-a0c3-3897b4a6fbf9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTgxOSwiaWF0IjoxNzkzMjA0OTE5LCJqdGkiOiJlZTY2ZWRhNy1lMmI4LTQ1ZDItYTFmMS05MmMwZDY1ZGFlYTciLCJzaWQiOiJhNThhYjJiYS03MmRmLTQ0ZDUtYTBjMy0zODk3YjRhNmZiZjkifQ.vcJH1yeiuayLMww4Ef_DzOqqBwWPb0l-5JU8MMGnNAY",
  "access_expires_at": "2026-10-28T16:43:39.351118721Z",
  "refresh_token": "P95cYzFzXZVHAc_zGUlkeT_XbPlFU7EFU9KHPCpZnMo",
  "refresh_expires_at": "2026-11-27T16:28:39.350575416Z",
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
  "command_id": "d5a5b66d-a5f3-4f0f-9fae-cd5f2d37a025",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:28:39Z",
    "sequence": 1793204919895
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bfb1a156-4a98-442b-aaa0-14b80ffe6880",
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
  "last_heartbeat_at": "2026-10-28T16:28:39.913644Z",
  "last_location_at": "2026-10-28T16:28:39.913644Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "99f85cb5-d4ba-418a-a08f-2b30c3f356d6",
      "short_number": 21,
      "pickup_at": "2026-10-28T19:28:36Z",
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

`POST /api/driver/v1/preorders/99f85cb5-d4ba-418a-a08f-2b30c3f356d6/reserve` → **200**

```json
{
  "command_id": "e70481ea-7ed9-41ff-8049-772ca7cf1659"
}
```

```json
{
  "id": "a66c8534-6858-4e7f-95e2-59dcb9e67376",
  "state": "RESERVED",
  "order": {
    "order_id": "99f85cb5-d4ba-418a-a08f-2b30c3f356d6",
    "short_number": 21,
    "pickup_at": "2026-10-28T19:28:36Z",
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
  "reserved_at": "2026-10-28T16:28:40.473873Z",
  "confirm_from": "2026-10-28T18:58:36Z",
  "confirm_until": "2026-10-28T19:08:36Z",
  "drop_until": "2026-10-28T18:28:36Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "a66c8534-6858-4e7f-95e2-59dcb9e67376",
      "state": "RESERVED",
      "order": {
        "order_id": "99f85cb5-d4ba-418a-a08f-2b30c3f356d6",
        "short_number": 21,
        "pickup_at": "2026-10-28T19:28:36Z",
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
      "reserved_at": "2026-10-28T16:28:40.473873Z",
      "confirm_from": "2026-10-28T18:58:36Z",
      "confirm_until": "2026-10-28T19:08:36Z",
      "drop_until": "2026-10-28T18:28:36Z"
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
      "id": "a66c8534-6858-4e7f-95e2-59dcb9e67376",
      "state": "RESERVED",
      "order": {
        "order_id": "99f85cb5-d4ba-418a-a08f-2b30c3f356d6",
        "short_number": 21,
        "pickup_at": "2026-10-28T19:28:36Z",
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
      "reserved_at": "2026-10-28T16:28:40.473873Z",
      "confirm_from": "2026-10-28T18:58:36Z",
      "confirm_until": "2026-10-28T19:08:36Z",
      "drop_until": "2026-10-28T18:28:36Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/a66c8534-6858-4e7f-95e2-59dcb9e67376/confirm` → **409**

```json
{
  "command_id": "9840faa3-9471-427e-906e-bd1f423cca34"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/a66c8534-6858-4e7f-95e2-59dcb9e67376/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "84cf38fc-a31c-4321-a83e-ed12c80511fd"
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
  "session_id": "d59cee98-6bdc-4a79-93d2-a5b59401167c",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4MjEsImlhdCI6MTc5MzIwNDkyMSwianRpIjoiMTVlMzQ4MzQtMWFkYy00ZDI5LTlkMWEtMjhhYzNhNzNhYmI3Iiwic2lkIjoiZDU5Y2VlOTgtNmJkYy00YTc5LTkzZDItYTViNTk0MDExNjdjIn0.TZ6iu2DXDDg2Xo-nYmwezIJko9l70Gl0vObcQCpIaP0",
  "access_expires_at": "2026-10-28T16:43:41.860167108Z",
  "refresh_token": "12l13fInJ1TupQ0pvWSNnlCsycCxlCUscC-JbGZUB9A",
  "refresh_expires_at": "2026-10-29T04:28:41.859608705Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/99f85cb5-d4ba-418a-a08f-2b30c3f356d6` → **200**

```json
{
  "id": "99f85cb5-d4ba-418a-a08f-2b30c3f356d6",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "a3549d6e-4566-4ee9-ad47-4d008aa8685a",
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
  "created_at": "2026-10-28T16:28:38.762352Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T19:28:36Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "a66c8534-6858-4e7f-95e2-59dcb9e67376",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T16:28:40.473873Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/99f85cb5-d4ba-418a-a08f-2b30c3f356d6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T16:28:38.763391Z",
      "actor": {
        "type": "CLIENT",
        "id": "a3549d6e-4566-4ee9-ad47-4d008aa8685a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "99f85cb5-d4ba-418a-a08f-2b30c3f356d6",
        "preorder": true,
        "quote_id": "6d89d5bd-c580-4529-acad-ea66b5cf2508",
        "pickup_at": "2026-10-28T19:28:36Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "45942d07-6234-44cb-ba8d-4905c5b146aa"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T16:28:40.474946Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "99f85cb5-d4ba-418a-a08f-2b30c3f356d6",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "a66c8534-6858-4e7f-95e2-59dcb9e67376"
      },
      "correlation_id": "cb9aa6f9-6c66-455c-bdac-60eb55bb88ab"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 99f85cb5-d4ba-418a-a08f-2b30c3f356d6, reservation a66c8534-6858-4e7f-95e2-59dcb9e67376.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5060"
}
```

```json
{
  "challenge_id": "e26c46c5-b87f-444d-8b7f-5ac9c9ee89a9",
  "expires_at": "2026-10-28T16:33:42.727241329Z",
  "resend_available_at": "2026-10-28T16:28:43.727241329Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "489798",
  "sent_at": "2026-10-28T16:28:42.729581338Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e26c46c5-b87f-444d-8b7f-5ac9c9ee89a9",
  "code": "489798",
  "device_ref": "sandbox-5060"
}
```

```json
{
  "session_id": "9fd8f14b-ec3e-46ec-b01e-049f891a076f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTgyMywiaWF0IjoxNzkzMjA0OTIzLCJqdGkiOiI5MWFiZjNhNC1lNGQ5LTQ5ZjctYTRiYS01NjVhM2E1MTNjYjUiLCJzaWQiOiI5ZmQ4ZjE0Yi1lYzNlLTQ2ZWMtYjAxZS0wNDlmODkxYTA3NmYifQ.a9pWpUzVel7jo54QT2EYeYmYd1xPdXQcWV0Er6oOAlI",
  "access_expires_at": "2026-10-28T16:43:43.0183563Z",
  "refresh_token": "8OtKUZn9krXijgSE6V46G_-8pojhzoTGEI_fONefMTU",
  "refresh_expires_at": "2026-11-27T16:28:43.017685919Z",
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
  "command_id": "4b0849f4-c148-498e-b2cb-fb7b6c2c1a1d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:28:43Z",
    "sequence": 1793204923557
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "026c77a8-3d4f-4164-82a2-4744ec08af48",
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
  "last_heartbeat_at": "2026-10-28T16:28:43.57495Z",
  "last_location_at": "2026-10-28T16:28:43.57495Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673434506",
  "device_ref": "sandbox-27028"
}
```

```json
{
  "challenge_id": "1cd5c23e-e034-4b69-b209-d9b18cfdb48a",
  "expires_at": "2026-10-28T16:33:43.848632891Z",
  "resend_available_at": "2026-10-28T16:28:44.848632891Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673434506` → **200**

```json
{
  "phone": "+380673434506",
  "audience": "CLIENT",
  "code": "925627",
  "sent_at": "2026-10-28T16:28:43.85273895Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cd5c23e-e034-4b69-b209-d9b18cfdb48a",
  "code": "925627",
  "device_ref": "sandbox-27028"
}
```

```json
{
  "session_id": "b28bd91c-bc7e-4e26-99e5-675c8895ba7c",
  "subject": {
    "type": "CLIENT",
    "id": "df358c89-2992-4c44-85c1-93d6baca74da"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZjM1OGM4OS0yOTkyLTRjNDQtODVjMS05M2Q2YmFjYTc0ZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1ODI0LCJpYXQiOjE3OTMyMDQ5MjQsImp0aSI6IjM5ZTlkNGRkLTE4ZDItNDNkZi04ZTFjLWRjZTQ2NGQyOTQyYSIsInNpZCI6ImIyOGJkOTFjLWJjN2UtNGUyNi05OWU1LTY3NWM4ODk1YmE3YyJ9.2daYUgAAj5UW9adyICVrCIrcOXCHkDY5kb03BAwE3aU",
  "access_expires_at": "2026-10-28T16:43:44.14950884Z",
  "refresh_token": "8LgGMhcRJ0V0QVOwPTXcOBuHbV5z1ueDngWRkeYjpKo",
  "refresh_expires_at": "2026-11-27T16:28:44.148948802Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0bce5d71-4a41-486a-ae4c-a6a804c9ec18",
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
  "id": "b93ff561-e488-4584-8455-9cba73720849",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:33:44.433257Z",
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
  "command_id": "cf4a7203-4700-4dbf-a253-0443be04b1b7",
  "quote_id": "b93ff561-e488-4584-8455-9cba73720849",
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
  "id": "7198f58b-e465-4f47-8b3d-a0f7a9484553",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "df358c89-2992-4c44-85c1-93d6baca74da",
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
  "created_at": "2026-10-28T16:28:44.723886Z",
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
    "id": "3d4ab3eb-456c-46c8-9f82-9101fa74bdc6",
    "order_id": "7198f58b-e465-4f47-8b3d-a0f7a9484553",
    "expires_at": "2026-10-28T16:28:59.727134Z",
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

`POST /api/driver/v1/offers/3d4ab3eb-456c-46c8-9f82-9101fa74bdc6/accept` → **200**

```json
{
  "command_id": "c20ab476-1e7e-40a9-826c-0f1daa08d6d9"
}
```

```json
{
  "id": "4e439e4b-a4bb-4697-9559-44a1cda227e3",
  "order_id": "7198f58b-e465-4f47-8b3d-a0f7a9484553",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0e2c83be-99d9-4c1e-82b4-4cf90c163d51",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0e2c83be-99d9-4c1e-82b4-4cf90c163d51",
  "order_id": "7198f58b-e465-4f47-8b3d-a0f7a9484553",
  "assignment_id": "4e439e4b-a4bb-4697-9559-44a1cda227e3",
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

`POST /api/driver/v1/work-sessions/026c77a8-3d4f-4164-82a2-4744ec08af48/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:28:45Z",
    "sequence": 1793204925814
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "026c77a8-3d4f-4164-82a2-4744ec08af48",
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
  "last_heartbeat_at": "2026-10-28T16:28:45.833515Z",
  "last_location_at": "2026-10-28T16:28:45.833515Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0e2c83be-99d9-4c1e-82b4-4cf90c163d51",
  "order_id": "7198f58b-e465-4f47-8b3d-a0f7a9484553",
  "assignment_id": "4e439e4b-a4bb-4697-9559-44a1cda227e3",
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

`POST /api/driver/v1/trips/0e2c83be-99d9-4c1e-82b4-4cf90c163d51/arrive` → **200**

```json
{
  "command_id": "c7a395c1-538a-41ba-879c-e3ceb8b3e4e7",
  "expected_version": 0
}
```

```json
{
  "id": "0e2c83be-99d9-4c1e-82b4-4cf90c163d51",
  "order_id": "7198f58b-e465-4f47-8b3d-a0f7a9484553",
  "assignment_id": "4e439e4b-a4bb-4697-9559-44a1cda227e3",
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
  "arrived_at": "2026-10-28T16:28:46.385249Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0e2c83be-99d9-4c1e-82b4-4cf90c163d51/start` → **200**

```json
{
  "command_id": "2a5a6f07-9298-4073-a5e9-87099e2410c9",
  "expected_version": 1
}
```

```json
{
  "id": "0e2c83be-99d9-4c1e-82b4-4cf90c163d51",
  "order_id": "7198f58b-e465-4f47-8b3d-a0f7a9484553",
  "assignment_id": "4e439e4b-a4bb-4697-9559-44a1cda227e3",
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
  "arrived_at": "2026-10-28T16:28:46.385249Z",
  "started_at": "2026-10-28T16:28:46.668491Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/026c77a8-3d4f-4164-82a2-4744ec08af48/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:28:46Z",
    "sequence": 1793204926934
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "026c77a8-3d4f-4164-82a2-4744ec08af48",
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
  "last_heartbeat_at": "2026-10-28T16:28:46.952286Z",
  "last_location_at": "2026-10-28T16:28:46.952286Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/0e2c83be-99d9-4c1e-82b4-4cf90c163d51/complete` → **200**

```json
{
  "command_id": "48b53c9e-5fd0-411f-bdc9-843020b3b194",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:28:47Z",
  "cash_received": true
}
```

```json
{
  "id": "0e2c83be-99d9-4c1e-82b4-4cf90c163d51",
  "order_id": "7198f58b-e465-4f47-8b3d-a0f7a9484553",
  "assignment_id": "4e439e4b-a4bb-4697-9559-44a1cda227e3",
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
  "arrived_at": "2026-10-28T16:28:46.385249Z",
  "started_at": "2026-10-28T16:28:46.668491Z",
  "completed_at": "2026-10-28T16:28:47.226954Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/7198f58b-e465-4f47-8b3d-a0f7a9484553/rating` → **200**

```json
{
  "command_id": "a4716fc3-8817-4d70-ba14-3656215b2c25",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "7198f58b-e465-4f47-8b3d-a0f7a9484553",
  "score": 5,
  "created_at": "2026-10-28T16:28:47.528474119Z"
}
```

`POST /api/driver/v1/orders/7198f58b-e465-4f47-8b3d-a0f7a9484553/rating` → **200**

```json
{
  "command_id": "b1c5316e-7a91-4276-8951-f95e6abad38f",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "7198f58b-e465-4f47-8b3d-a0f7a9484553",
  "score": 4,
  "created_at": "2026-10-28T16:28:47.824593271Z"
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
  "session_id": "58619672-c10e-4366-81c1-1b8e21bd944b",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4MjgsImlhdCI6MTc5MzIwNDkyOCwianRpIjoiMWRmNWFiMzEtNTJmNS00MjkyLWEzYTEtNTcyNWIxYjRkNTQwIiwic2lkIjoiNTg2MTk2NzItYzEwZS00MzY2LTgxYzEtMWI4ZTIxYmQ5NDRiIn0.lmFpRj4awTY4Id_vmTVSMZ9F-XH6p5X9vRk6_CN7uvs",
  "access_expires_at": "2026-10-28T16:43:48.661202665Z",
  "refresh_token": "F53k8aRuT_gF8if-QzA_YxqyvifoLefVvjYK8pCVUfA",
  "refresh_expires_at": "2026-10-29T04:28:48.660592546Z",
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
  "session_id": "ddaf5ee9-cf70-45a3-ac5e-e3ff232cc0d8",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4MjksImlhdCI6MTc5MzIwNDkyOSwianRpIjoiYjhlMjc4YzItMDJiMi00YzVkLWE1NGQtN2JmMjM4YzliYmZhIiwic2lkIjoiZGRhZjVlZTktY2Y3MC00NWEzLWFjNWUtZTNmZjIzMmNjMGQ4In0.r8OggddwBPC0Urg1XWqgOu7aYz7GoxsIvNdviG5Znxo",
  "access_expires_at": "2026-10-28T16:43:49.222713496Z",
  "refresh_token": "OgALztaVpnbbba90qk1zthh8hJwLN3TaUavtWOWcgrs",
  "refresh_expires_at": "2026-10-29T04:28:49.222195619Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7198f58b-e465-4f47-8b3d-a0f7a9484553/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "7198f58b-e465-4f47-8b3d-a0f7a9484553",
      "author_type": "RIDER",
      "author_id": "df358c89-2992-4c44-85c1-93d6baca74da",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T16:28:47.528474Z"
    },
    {
      "order_id": "7198f58b-e465-4f47-8b3d-a0f7a9484553",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "df358c89-2992-4c44-85c1-93d6baca74da",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T16:28:47.824593Z"
    }
  ]
}
```

Done: ratings for order 7198f58b-e465-4f47-8b3d-a0f7a9484553.

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
  "session_id": "d45e384a-8243-470f-b00e-b11f638fe691",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4MzAsImlhdCI6MTc5MzIwNDkzMCwianRpIjoiZTJlNjJhZmEtNDE5ZC00NTUxLTg0YTctN2MxZWMxN2U1YWUwIiwic2lkIjoiZDQ1ZTM4NGEtODI0My00NzBmLWIwMGUtYjExZjYzOGZlNjkxIn0.vHfdBC505VObs7s7Y1kqc8-nZBj9ZuQ3Pkr8z1HRyKE",
  "access_expires_at": "2026-10-28T16:43:50.07234699Z",
  "refresh_token": "zXy8V8WyyoMIR9X7W-jG69emoT7_IVcRo-USK-cvyoU",
  "refresh_expires_at": "2026-10-29T04:28:50.071756748Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b3b04796-5954-41f1-bb04-520f015b07fa",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "f972b92f-477b-4e99-ac9c-88d9dbf207e1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:28:50.355695Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f972b92f-477b-4e99-ac9c-88d9dbf207e1` → **200**

```json
{
  "id": "f972b92f-477b-4e99-ac9c-88d9dbf207e1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:28:50.355695Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f972b92f-477b-4e99-ac9c-88d9dbf207e1` → **200**

```json
{
  "id": "f972b92f-477b-4e99-ac9c-88d9dbf207e1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:28:50.355695Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f972b92f-477b-4e99-ac9c-88d9dbf207e1` → **200**

```json
{
  "id": "f972b92f-477b-4e99-ac9c-88d9dbf207e1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:28:50.355695Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f972b92f-477b-4e99-ac9c-88d9dbf207e1` → **200**

```json
{
  "id": "f972b92f-477b-4e99-ac9c-88d9dbf207e1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:28:50.355695Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f972b92f-477b-4e99-ac9c-88d9dbf207e1` → **200**

```json
{
  "id": "f972b92f-477b-4e99-ac9c-88d9dbf207e1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:28:50.355695Z",
  "ready_at": "2026-10-28T16:28:54.771497Z",
  "expires_at": "2026-10-29T16:28:54.771497Z"
}
```

`GET /api/admin/v1/reports/exports/f972b92f-477b-4e99-ac9c-88d9dbf207e1/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
total,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "5971c471-12fb-4be3-a761-8b3e041b675c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "bf81f0ee-e3c8-45ef-bbdd-e4b66b26d1bd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:28:56.009626Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bf81f0ee-e3c8-45ef-bbdd-e4b66b26d1bd` → **200**

```json
{
  "id": "bf81f0ee-e3c8-45ef-bbdd-e4b66b26d1bd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:28:56.009626Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bf81f0ee-e3c8-45ef-bbdd-e4b66b26d1bd` → **200**

```json
{
  "id": "bf81f0ee-e3c8-45ef-bbdd-e4b66b26d1bd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:28:56.009626Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bf81f0ee-e3c8-45ef-bbdd-e4b66b26d1bd` → **200**

```json
{
  "id": "bf81f0ee-e3c8-45ef-bbdd-e4b66b26d1bd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:28:56.009626Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bf81f0ee-e3c8-45ef-bbdd-e4b66b26d1bd` → **200**

```json
{
  "id": "bf81f0ee-e3c8-45ef-bbdd-e4b66b26d1bd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:28:56.009626Z",
  "ready_at": "2026-10-28T16:28:59.778965Z",
  "expires_at": "2026-10-29T16:28:59.778965Z"
}
```

`GET /api/admin/v1/reports/exports/bf81f0ee-e3c8-45ef-bbdd-e4b66b26d1bd/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/4d565f53-320d-4dd5-b1a5-a73c43dfd63e` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/4d565f53-320d-4dd5-b1a5-a73c43dfd63e",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c5c53fba-a88f-45df-9990-ba8df84555a2"
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
  "device_ref": "sandbox-27747"
}
```

```json
{
  "challenge_id": "14aac7d4-f3b2-44c2-9cd3-44657cbe0712",
  "expires_at": "2026-10-28T16:34:00.690975755Z",
  "resend_available_at": "2026-10-28T16:29:01.690975755Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "887527",
  "sent_at": "2026-10-28T16:29:00.693384482Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14aac7d4-f3b2-44c2-9cd3-44657cbe0712",
  "code": "887527",
  "device_ref": "sandbox-27747"
}
```

```json
{
  "session_id": "d28df3b6-e5d6-46c6-bee9-ec32fe7d506f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTg0MCwiaWF0IjoxNzkzMjA0OTQwLCJqdGkiOiIyNzFhMGUzZi1iYTZhLTQ0NGYtYWYyOS0xZGNkM2U5ZDk4MTkiLCJzaWQiOiJkMjhkZjNiNi1lNWQ2LTQ2YzYtYmVlOS1lYzMyZmU3ZDUwNmYifQ.fsuUwijfn9YhVYULnPm8v-kZ5I5kkti4PJNa0Uilxc0",
  "access_expires_at": "2026-10-28T16:44:00.98285904Z",
  "refresh_token": "SK_lXVz95eabKK9M_FnPWe8d7ppicnc4RiC8RefFrO4",
  "refresh_expires_at": "2026-11-27T16:29:00.982335933Z",
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
  "command_id": "b374aad7-ae53-417b-bcb3-74c4b3b8f232",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:29:01Z",
    "sequence": 1793204941791
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "500aa1df-f0bd-48a2-9eba-02735e730876",
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
  "last_heartbeat_at": "2026-10-28T16:29:01.808907Z",
  "last_location_at": "2026-10-28T16:29:01.808907Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "8282262f-3264-4120-a78a-cf3066d3ec4b",
  "points": [
    {
      "sequence": 1793204944804,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:28:04Z"
    },
    {
      "sequence": 1793204944876,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:29:04Z"
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
  "session_id": "56f21b67-8237-4239-b424-fcb7c5bc13cc",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4NDQsImlhdCI6MTc5MzIwNDk0NCwianRpIjoiZTVhODI4ZGYtMDEyYy00NTJlLWIxNTQtODY2ZDI2ZWJiYWVjIiwic2lkIjoiNTZmMjFiNjctODIzNy00MjM5LWI0MjQtZmNiN2M1YmMxM2NjIn0.hy852W6bJpIwc0KjsIPWf3POJx1H9-W4hMdp4b0q4oI",
  "access_expires_at": "2026-10-28T16:44:04.689901451Z",
  "refresh_token": "QdltIjBexHjPaEzPCSzHzggxIep8akhjuHaV8Cx17XY",
  "refresh_expires_at": "2026-10-29T04:29:04.689341675Z",
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
      "id": "69a6e73f-9ef3-44ca-b8c8-0d89f9f54fc8",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T16:29:04Z",
        "track_point_id": "b5dce16a-027f-4dd8-aaf9-c8f21f15e8cd",
        "work_session_id": "500aa1df-f0bd-48a2-9eba-02735e730876"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T16:29:04Z",
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

`POST /api/admin/v1/driver-risk-flags/69a6e73f-9ef3-44ca-b8c8-0d89f9f54fc8/confirm` → **200**

```json
{
  "command_id": "61558f3c-5f48-4baf-b0fe-a8f6df5de3c5",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "69a6e73f-9ef3-44ca-b8c8-0d89f9f54fc8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T16:29:04Z",
    "track_point_id": "b5dce16a-027f-4dd8-aaf9-c8f21f15e8cd",
    "work_session_id": "500aa1df-f0bd-48a2-9eba-02735e730876"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T16:29:04Z",
  "reason": null,
  "reviewed_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "reviewed_at": "2026-10-28T16:29:06.820076Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/69a6e73f-9ef3-44ca-b8c8-0d89f9f54fc8/dismiss` → **409**

```json
{
  "command_id": "be4ca70f-77f4-48bc-927f-0f861281de53",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/69a6e73f-9ef3-44ca-b8c8-0d89f9f54fc8/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "25765667-bacc-422d-b744-af96b499f447"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "231a8ffe-6571-4a8a-ac89-72257b27c0da",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "ad9aef89-ed7b-4c4b-bfda-6752a93ca570",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "raised_at": "2026-10-28T16:29:07.399303Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/ad9aef89-ed7b-4c4b-bfda-6752a93ca570/dismiss` → **200**

```json
{
  "command_id": "4dc8432c-5510-4013-8b94-61546bd559cd",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "ad9aef89-ed7b-4c4b-bfda-6752a93ca570",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "raised_at": "2026-10-28T16:29:07.399303Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "reviewed_at": "2026-10-28T16:29:07.67807Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "a86ad6a0-516c-4465-9aa4-40c372597e40",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "69a6e73f-9ef3-44ca-b8c8-0d89f9f54fc8"
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
      "actor_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:29:07.986735Z"
    }
  ]
}
```

Done: flag 69a6e73f-9ef3-44ca-b8c8-0d89f9f54fc8 confirmed, suspension named it, driver reinstated.

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
  "session_id": "ab33476f-62d9-4bd1-b7bf-f6f4ee528e95",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4NDgsImlhdCI6MTc5MzIwNDk0OCwianRpIjoiNzVkZjk5ZjEtYTBmNS00MmZiLWFmZWUtNTBjMWI1NjEyZjIyIiwic2lkIjoiYWIzMzQ3NmYtNjJkOS00YmQxLWI3YmYtZjZmNGVlNTI4ZTk1In0.zoX2FTaC-VI9OppgFvZ-qqJOv2e_KaAC-_axk-T9myU",
  "access_expires_at": "2026-10-28T16:44:08.828430656Z",
  "refresh_token": "BjSgHw_YB4NkB2aLisz8m1j5O7t_W53mbtkd9eVdwII",
  "refresh_expires_at": "2026-10-29T04:29:08.827864068Z",
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
      "actor_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:29:07.986735Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "aa2b26bd-e099-44d6-896d-6d96ceb7550a",
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
  "session_id": "500aa1df-f0bd-48a2-9eba-02735e730876",
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
  "last_heartbeat_at": "2026-10-28T16:29:01.808907Z",
  "last_location_at": "2026-10-28T16:29:01.808907Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/500aa1df-f0bd-48a2-9eba-02735e730876/close` → **200**

```json
{
  "command_id": "b4a7e9a6-cd7e-4e49-a924-eb3a8fa60a39",
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
  "session_id": "29dca533-1a70-40aa-9c33-de47edd5a165",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4NTAsImlhdCI6MTc5MzIwNDk1MCwianRpIjoiOGZjNjgxNGYtODFmNC00OGMxLWIxNTItNDc4ZjIxZDMzNzAwIiwic2lkIjoiMjlkY2E1MzMtMWE3MC00MGFhLTljMzMtZGU0N2VkZDVhMTY1In0.D8h39YNlbfavmeDnduAETJsuC9vFWEkfTfHqX5_pzrw",
  "access_expires_at": "2026-10-28T16:44:10.550015076Z",
  "refresh_token": "fz-bMiaIN_YF5yBoBstB5PO7SaGurJ79W2MjUmwHJD8",
  "refresh_expires_at": "2026-10-29T04:29:10.549377325Z",
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
  "command_id": "98f2645f-4024-4b6d-a687-0a7253adf059",
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
  "changed_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:29:11.10968Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "98f2645f-4024-4b6d-a687-0a7253adf059",
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
  "changed_by": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:29:11.10968Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48290637230",
  "device_ref": "sandbox-31841"
}
```

```json
{
  "challenge_id": "f56e886c-ae27-4ee4-a136-68a1b404deac",
  "expires_at": "2026-10-28T16:34:11.696213578Z",
  "resend_available_at": "2026-10-28T16:29:12.696213578Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48290637230` → **200**

```json
{
  "phone": "+48290637230",
  "audience": "CLIENT",
  "code": "394821",
  "sent_at": "2026-10-28T16:29:11.699300925Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f56e886c-ae27-4ee4-a136-68a1b404deac",
  "code": "394821",
  "device_ref": "sandbox-31841"
}
```

```json
{
  "session_id": "69db4885-7760-4ef8-a1d9-195ead2fb74f",
  "subject": {
    "type": "CLIENT",
    "id": "0f1aa115-db70-4e58-a89a-59151d8b864a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZjFhYTExNS1kYjcwLTRlNTgtYTg5YS01OTE1MWQ4Yjg2NGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1ODUyLCJpYXQiOjE3OTMyMDQ5NTIsImp0aSI6IjJjMTc1NTIxLWNiYjMtNGMwYi04N2Q5LWY5ZTdkYzEyMDU2MiIsInNpZCI6IjY5ZGI0ODg1LTc3NjAtNGVmOC1hMWQ5LTE5NWVhZDJmYjc0ZiJ9.rPY8hRdtWBwjxneLajWCTAQtlCZWo028zuKLDjXhhP0",
  "access_expires_at": "2026-10-28T16:44:12.000909481Z",
  "refresh_token": "6ocDO99Uk17ZCCzcp8iZEipo4Mj7_mGh5cGGu8cP0cI",
  "refresh_expires_at": "2026-11-27T16:29:12.000365976Z",
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
  "correlation_id": "a6ff2224-ea8e-4e38-b0a7-6641054c4880"
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
  "device_ref": "sandbox-7239"
}
```

```json
{
  "challenge_id": "a5c813bd-d57a-4826-ac8d-b150fda45b3d",
  "expires_at": "2026-10-28T16:34:12.80323801Z",
  "resend_available_at": "2026-10-28T16:29:13.80323801Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "718585",
  "sent_at": "2026-10-28T16:29:12.805300361Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5c813bd-d57a-4826-ac8d-b150fda45b3d",
  "code": "718585",
  "device_ref": "sandbox-7239"
}
```

```json
{
  "session_id": "8165c907-f66e-470b-a627-d8e542477f98",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTg1MywiaWF0IjoxNzkzMjA0OTUzLCJqdGkiOiIwYjBiNTU5Yy1lYjZkLTQwYjYtOWJiNS05ODFjN2UyYzhhMDUiLCJzaWQiOiI4MTY1YzkwNy1mNjZlLTQ3MGItYTYyNy1kOGU1NDI0NzdmOTgifQ.ajNanuW7V4gvZaOnBjWtgKGCk7Q6Pk-9d64mFjgirmY",
  "access_expires_at": "2026-10-28T16:44:13.113038887Z",
  "refresh_token": "WVi957oLRWL5q8QpIe5GrxebOYRq7w9z6dokwWIhqok",
  "refresh_expires_at": "2026-11-27T16:29:13.112367764Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bfb1a156-4a98-442b-aaa0-14b80ffe6880",
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
  "last_heartbeat_at": "2026-10-28T16:28:39.913644Z",
  "last_location_at": "2026-10-28T16:28:39.913644Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bfb1a156-4a98-442b-aaa0-14b80ffe6880/handover` → **200**

```json
{
  "command_id": "cf05e0dc-430d-4d83-9b24-78485b5cdf10",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bfb1a156-4a98-442b-aaa0-14b80ffe6880",
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
  "last_heartbeat_at": "2026-10-28T16:28:39.913644Z",
  "last_location_at": "2026-10-28T16:28:39.913644Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bfb1a156-4a98-442b-aaa0-14b80ffe6880/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:29:13Z",
    "sequence": 1793204953927
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bfb1a156-4a98-442b-aaa0-14b80ffe6880",
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
  "last_heartbeat_at": "2026-10-28T16:29:13.945379Z",
  "last_location_at": "2026-10-28T16:29:13.945379Z",
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
  "session_id": "bfb1a156-4a98-442b-aaa0-14b80ffe6880",
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
  "last_heartbeat_at": "2026-10-28T16:29:13.945379Z",
  "last_location_at": "2026-10-28T16:29:13.945379Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bfb1a156-4a98-442b-aaa0-14b80ffe6880/close` → **200**

```json
{
  "command_id": "4e1efc2e-85f9-478b-b360-62e5af9d830f",
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
  "correlation_id": "9229b7b7-68c8-41bb-9e80-0996101aec01"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674534246",
  "device_ref": "sandbox-31869"
}
```

```json
{
  "challenge_id": "fe2e406c-9d5f-47be-bec0-79257325ea42",
  "expires_at": "2026-10-28T16:34:15.313291851Z",
  "resend_available_at": "2026-10-28T16:29:16.313291851Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674534246` → **200**

```json
{
  "phone": "+380674534246",
  "audience": "CLIENT",
  "code": "729078",
  "sent_at": "2026-10-28T16:29:15.315463586Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe2e406c-9d5f-47be-bec0-79257325ea42",
  "code": "729078",
  "device_ref": "sandbox-31869"
}
```

```json
{
  "session_id": "4dd594a9-2267-4bf2-bc7c-a4cf1a5677c8",
  "subject": {
    "type": "CLIENT",
    "id": "c0980035-1f07-43d2-84b1-41ce2c8b530d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDk4MDAzNS0xZjA3LTQzZDItODRiMS00MWNlMmM4YjUzMGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1ODU1LCJpYXQiOjE3OTMyMDQ5NTUsImp0aSI6ImMzMzAyMzlmLWQyOTQtNDdmMC05OTk3LTA2ZjUyNWZkM2NlZSIsInNpZCI6IjRkZDU5NGE5LTIyNjctNGJmMi1iYzdjLWE0Y2YxYTU2NzdjOCJ9.TwDwbIu_GKVmUA9dJXwgYWQzk8A1GsG3_ZGuXpy6px4",
  "access_expires_at": "2026-10-28T16:44:15.61962527Z",
  "refresh_token": "cjxCeFeyOYSt7nPQA4CT-1O12o---K7r7NntJQeL4NA",
  "refresh_expires_at": "2026-11-27T16:29:15.619023647Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "6acd6656-e0fd-42fe-aef1-faed0d6f5dd8",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "58c59c7b-f8bd-461d-9663-1c34f2eedbae",
  "upload_path": "/api/rider/v1/uploads/58c59c7b-f8bd-461d-9663-1c34f2eedbae",
  "expires_at": "2026-10-28T16:44:15.897141537Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/58c59c7b-f8bd-461d-9663-1c34f2eedbae` → **200**

```json
{
  "file_id": "58c59c7b-f8bd-461d-9663-1c34f2eedbae",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "e4e2fbe6-ce25-4d8e-b4da-9ff9633a541d",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "58c59c7b-f8bd-461d-9663-1c34f2eedbae"
  ]
}
```

```json
{
  "id": "5704961c-56df-4155-8ec3-4fd07e316a7b",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c0980035-1f07-43d2-84b1-41ce2c8b530d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:29:16.200965Z",
  "updated_at": "2026-10-28T16:29:16.200965Z",
  "respond_by": "2026-10-28T20:29:16.200965Z",
  "messages": [
    {
      "id": "c68ceda5-a191-4639-82e6-a2a71b67b8ae",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c0980035-1f07-43d2-84b1-41ce2c8b530d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:29:16.203289Z",
      "attachments": [
        {
          "file_id": "58c59c7b-f8bd-461d-9663-1c34f2eedbae",
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
  "session_id": "55161649-39de-4a46-bc95-ab512f032a39",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4NTYsImlhdCI6MTc5MzIwNDk1NiwianRpIjoiOTQwNGMwNzgtZWE4Yy00MTFlLWIyMmEtMWVmODNjMWVhMmIyIiwic2lkIjoiNTUxNjE2NDktMzlkZS00YTQ2LWJjOTUtYWI1MTJmMDMyYTM5In0.zFop1AjwoJZs9H3DL9l_oq13G4X1JWY29poFMkk1ClI",
  "access_expires_at": "2026-10-28T16:44:16.788378389Z",
  "refresh_token": "IPQFZEX0mWc7KuPFk73T8zE-7V53MRV-NqrsuBfOuBA",
  "refresh_expires_at": "2026-10-29T04:29:16.787833852Z",
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
  "session_id": "cea9c2e6-0c20-42db-8031-b1c4d605dee4",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4NTcsImlhdCI6MTc5MzIwNDk1NywianRpIjoiZWEzYjU2MGUtNjkyMi00ZTQyLTkxOTQtOGJkMjJlNGUwZDc1Iiwic2lkIjoiY2VhOWMyZTYtMGMyMC00MmRiLTgwMzEtYjFjNGQ2MDVkZWU0In0.nd_H1ijA3pud-2grow4PHaPYyagvPXB8wZ48lTuu-F4",
  "access_expires_at": "2026-10-28T16:44:17.348363375Z",
  "refresh_token": "Q6mrFN6He2yQmjDfuJe3C_qDxVw6QiZxdbfuzc3GVyk",
  "refresh_expires_at": "2026-10-29T04:29:17.347762584Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/5704961c-56df-4155-8ec3-4fd07e316a7b/attachments/58c59c7b-f8bd-461d-9663-1c34f2eedbae` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "0319ccd5-6400-4dc7-aca6-4c1d458bd8f7",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "e4acd72a-be55-4b94-b946-424f556bf505",
  "upload_path": "/api/operator/v1/uploads/e4acd72a-be55-4b94-b946-424f556bf505",
  "expires_at": "2026-10-28T16:44:17.641617708Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/e4acd72a-be55-4b94-b946-424f556bf505` → **200**

```json
{
  "file_id": "e4acd72a-be55-4b94-b946-424f556bf505",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/5704961c-56df-4155-8ec3-4fd07e316a7b` → **200**

```json
{
  "id": "5704961c-56df-4155-8ec3-4fd07e316a7b",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c0980035-1f07-43d2-84b1-41ce2c8b530d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:29:16.200965Z",
  "updated_at": "2026-10-28T16:29:16.200965Z",
  "respond_by": "2026-10-28T20:29:16.200965Z",
  "messages": [
    {
      "id": "c68ceda5-a191-4639-82e6-a2a71b67b8ae",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c0980035-1f07-43d2-84b1-41ce2c8b530d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:29:16.203289Z",
      "attachments": [
        {
          "file_id": "58c59c7b-f8bd-461d-9663-1c34f2eedbae",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/5704961c-56df-4155-8ec3-4fd07e316a7b/comments` → **200**

```json
{
  "command_id": "fb0c8d6d-8eb0-4e67-b6a2-0975bb6a2902",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "e4acd72a-be55-4b94-b946-424f556bf505"
  ]
}
```

```json
{
  "id": "5704961c-56df-4155-8ec3-4fd07e316a7b",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c0980035-1f07-43d2-84b1-41ce2c8b530d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:29:16.200965Z",
  "updated_at": "2026-10-28T16:29:18.296236Z",
  "respond_by": "2026-10-28T20:29:16.200965Z",
  "messages": [
    {
      "id": "c68ceda5-a191-4639-82e6-a2a71b67b8ae",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c0980035-1f07-43d2-84b1-41ce2c8b530d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:29:16.203289Z",
      "attachments": [
        {
          "file_id": "58c59c7b-f8bd-461d-9663-1c34f2eedbae",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "3a19dd45-b571-4710-9a91-e2ea7a4752f1",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:29:18.295606Z",
      "attachments": [
        {
          "file_id": "e4acd72a-be55-4b94-b946-424f556bf505",
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

`GET /api/rider/v1/support/cases/5704961c-56df-4155-8ec3-4fd07e316a7b` → **200**

```json
{
  "id": "5704961c-56df-4155-8ec3-4fd07e316a7b",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c0980035-1f07-43d2-84b1-41ce2c8b530d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:29:16.200965Z",
  "updated_at": "2026-10-28T16:29:18.296236Z",
  "respond_by": "2026-10-28T20:29:16.200965Z",
  "messages": [
    {
      "id": "c68ceda5-a191-4639-82e6-a2a71b67b8ae",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c0980035-1f07-43d2-84b1-41ce2c8b530d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:29:16.203289Z",
      "attachments": [
        {
          "file_id": "58c59c7b-f8bd-461d-9663-1c34f2eedbae",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "3a19dd45-b571-4710-9a91-e2ea7a4752f1",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:29:18.295606Z",
      "attachments": [
        {
          "file_id": "e4acd72a-be55-4b94-b946-424f556bf505",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/5704961c-56df-4155-8ec3-4fd07e316a7b/attachments/e4acd72a-be55-4b94-b946-424f556bf505` → **200**

Done: support case 5704961c-56df-4155-8ec3-4fd07e316a7b, rider attachment 58c59c7b-f8bd-461d-9663-1c34f2eedbae, operator attachment e4acd72a-be55-4b94-b946-424f556bf505.

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
  "session_id": "63f7dcbf-8d89-4d7e-9825-1b14423ba86c",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4NTksImlhdCI6MTc5MzIwNDk1OSwianRpIjoiMDNkMGJjMjQtYzRiNC00NWY2LTg4NjYtNTkwOWFkZTllYzgwIiwic2lkIjoiNjNmN2RjYmYtOGQ4OS00ZDdlLTk4MjUtMWIxNDQyM2JhODZjIn0.JmZO_wDkYezs2QYcAXixIKwiZV_AswjQw-m8FXpyP80",
  "access_expires_at": "2026-10-28T16:44:19.241747291Z",
  "refresh_token": "4dKjNm6i89rRLt_hRmv18i1t7y3D_GHeLON769aav04",
  "refresh_expires_at": "2026-10-29T04:29:19.241221139Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-32562"
}
```

```json
{
  "challenge_id": "bea170c0-f53c-4191-826d-0cda22343a44",
  "expires_at": "2026-10-28T16:34:19.509341694Z",
  "resend_available_at": "2026-10-28T16:29:20.509341694Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "412231",
  "sent_at": "2026-10-28T16:29:19.511975441Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bea170c0-f53c-4191-826d-0cda22343a44",
  "code": "412231",
  "device_ref": "sandbox-32562"
}
```

```json
{
  "session_id": "358cb2a5-ec1a-4889-b0d7-b12bf1c58bd1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTg1OSwiaWF0IjoxNzkzMjA0OTU5LCJqdGkiOiJjYjkyNmFjMS00NzQzLTQ4ZjAtYWMwYS1kM2EzYjkzMmQ0YzEiLCJzaWQiOiIzNThjYjJhNS1lYzFhLTQ4ODktYjBkNy1iMTJiZjFjNThiZDEifQ.294qr55VUVx4heDIZYpFvu0JguIiR87FvL1YJHK1HYw",
  "access_expires_at": "2026-10-28T16:44:19.808951146Z",
  "refresh_token": "O1rdp0oTvpfSGOwy45iJWX9LT5h4MKGqKOGrDCIWGUw",
  "refresh_expires_at": "2026-11-27T16:29:19.80843947Z",
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
      "actor_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:29:07.986735Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T16:29:09.387366Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "c156a305-baff-4c24-92f2-cf1626f77ed0",
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
  "device_ref": "sandbox-22994"
}
```

```json
{
  "challenge_id": "f6afad1b-badc-45c5-977e-c26b9754a253",
  "expires_at": "2026-10-28T16:34:20.919981953Z",
  "resend_available_at": "2026-10-28T16:29:21.919981953Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "993813",
  "sent_at": "2026-10-28T16:29:20.922218862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6afad1b-badc-45c5-977e-c26b9754a253",
  "code": "993813",
  "device_ref": "sandbox-22994"
}
```

```json
{
  "session_id": "fba4fa9e-cc4b-4f24-960f-94978c3078fb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTg2MSwiaWF0IjoxNzkzMjA0OTYxLCJqdGkiOiI0ZjYyZmQyNy0xYzhlLTQyYTMtYTgwOS04YTg5MjczZmY3YmQiLCJzaWQiOiJmYmE0ZmE5ZS1jYzRiLTRmMjQtOTYwZi05NDk3OGMzMDc4ZmIifQ.6e2bhN1Zu0w8yilQ9Zc017xTR4vJxGjuzBHyugFORz0",
  "access_expires_at": "2026-10-28T16:44:21.212933807Z",
  "refresh_token": "9LexB-zu2lznK8_LXCTfveP9pLzhE2P4JKl3CmQ-eQY",
  "refresh_expires_at": "2026-11-27T16:29:21.212268895Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "026c77a8-3d4f-4164-82a2-4744ec08af48",
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
  "last_heartbeat_at": "2026-10-28T16:28:46.952286Z",
  "last_location_at": "2026-10-28T16:28:46.952286Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/026c77a8-3d4f-4164-82a2-4744ec08af48/handover` → **200**

```json
{
  "command_id": "94cd5612-2cb1-4711-9f55-bc82fe46f335",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "026c77a8-3d4f-4164-82a2-4744ec08af48",
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
  "last_heartbeat_at": "2026-10-28T16:28:46.952286Z",
  "last_location_at": "2026-10-28T16:28:46.952286Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/026c77a8-3d4f-4164-82a2-4744ec08af48/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:29:22Z",
    "sequence": 1793204962324
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "026c77a8-3d4f-4164-82a2-4744ec08af48",
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
  "last_heartbeat_at": "2026-10-28T16:29:22.050998Z",
  "last_location_at": "2026-10-28T16:29:22.050998Z",
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
  "command_id": "1373677d-2f82-49e6-9fae-8ff090cc7ced",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:29:22Z",
    "sequence": 1793204962580
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d268251d-079a-4816-962b-2e62dee8b7c6",
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
  "last_heartbeat_at": "2026-10-28T16:29:22.598123Z",
  "last_location_at": "2026-10-28T16:29:22.598123Z",
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
  "session_id": "98014e60-916e-4631-b599-ca406c022ecd",
  "subject": {
    "type": "STAFF",
    "id": "4cfe205f-a936-4f00-8f28-6b2daba5d15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2ZlMjA1Zi1hOTM2LTRmMDAtOGYyOC02YjJkYWJhNWQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDU4NjMsImlhdCI6MTc5MzIwNDk2MywianRpIjoiM2YwYzc4NzgtMjdiMC00N2E3LTlmM2UtMjNhZWMxNjBjZDRkIiwic2lkIjoiOTgwMTRlNjAtOTE2ZS00NjMxLWI1OTktY2E0MDZjMDIyZWNkIn0.ACitRF3cymwWLrfIbtHCfrDOP384k9oR44AMKl1eNDo",
  "access_expires_at": "2026-10-28T16:44:23.165397609Z",
  "refresh_token": "iBbv1l0mgl-Belm24RazqRc4bq9L2i9B1AgcQmuZjyc",
  "refresh_expires_at": "2026-10-29T04:29:23.164745842Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e2e13249-1942-49bc-91d4-20b0453233d9",
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
  "id": "e98aef74-6a5c-4da1-8c4a-15dba566ade4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:34:23.433723Z",
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
  "command_id": "2e0836c9-e441-4a56-8a43-67790f977a5d",
  "quote_id": "e98aef74-6a5c-4da1-8c4a-15dba566ade4",
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
  "id": "427624d3-893e-429e-9450-26c503f53205",
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
  "created_at": "2026-10-28T16:29:23.711488Z",
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
    "id": "0c04c02e-cd05-47f9-a0bf-4e806ab2fbe3",
    "order_id": "427624d3-893e-429e-9450-26c503f53205",
    "expires_at": "2026-10-28T16:29:38.716164Z",
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

`POST /api/driver/v1/offers/0c04c02e-cd05-47f9-a0bf-4e806ab2fbe3/accept` → **200**

```json
{
  "command_id": "d90d101e-5871-42a9-a550-462ac22fa63d"
}
```

```json
{
  "id": "1ab55c2a-b3b8-47fa-89e2-2c613840f5c7",
  "order_id": "427624d3-893e-429e-9450-26c503f53205",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b3c5b918-f3f5-4a35-9797-fb7873d370e4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b3c5b918-f3f5-4a35-9797-fb7873d370e4",
  "order_id": "427624d3-893e-429e-9450-26c503f53205",
  "assignment_id": "1ab55c2a-b3b8-47fa-89e2-2c613840f5c7",
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

`POST /api/driver/v1/work-sessions/d268251d-079a-4816-962b-2e62dee8b7c6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:29:25Z",
    "sequence": 1793204965873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d268251d-079a-4816-962b-2e62dee8b7c6",
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
  "last_heartbeat_at": "2026-10-28T16:29:25.105462Z",
  "last_location_at": "2026-10-28T16:29:25.105462Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b3c5b918-f3f5-4a35-9797-fb7873d370e4/arrive` → **200**

```json
{
  "command_id": "a564f202-0986-40ed-bf90-c639553418df",
  "expected_version": 0
}
```

```json
{
  "id": "b3c5b918-f3f5-4a35-9797-fb7873d370e4",
  "order_id": "427624d3-893e-429e-9450-26c503f53205",
  "assignment_id": "1ab55c2a-b3b8-47fa-89e2-2c613840f5c7",
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
  "arrived_at": "2026-10-28T16:29:25.390593Z",
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

`POST /api/driver/v1/trips/b3c5b918-f3f5-4a35-9797-fb7873d370e4/start` → **200**

```json
{
  "command_id": "d2cefffa-2619-4c70-9603-9a510bdc44be",
  "expected_version": 1
}
```

```json
{
  "id": "b3c5b918-f3f5-4a35-9797-fb7873d370e4",
  "order_id": "427624d3-893e-429e-9450-26c503f53205",
  "assignment_id": "1ab55c2a-b3b8-47fa-89e2-2c613840f5c7",
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
  "arrived_at": "2026-10-28T16:29:25.390593Z",
  "started_at": "2026-10-28T16:29:25.676084Z",
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

`POST /api/driver/v1/trips/b3c5b918-f3f5-4a35-9797-fb7873d370e4/complete` → **200**

```json
{
  "command_id": "6e23df1f-55db-413d-88c9-8fc2732ddd82",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:29:25Z",
  "cash_received": true
}
```

```json
{
  "id": "b3c5b918-f3f5-4a35-9797-fb7873d370e4",
  "order_id": "427624d3-893e-429e-9450-26c503f53205",
  "assignment_id": "1ab55c2a-b3b8-47fa-89e2-2c613840f5c7",
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
  "arrived_at": "2026-10-28T16:29:25.390593Z",
  "started_at": "2026-10-28T16:29:25.676084Z",
  "completed_at": "2026-10-28T16:29:25.968974Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/427624d3-893e-429e-9450-26c503f53205` → **200**

```json
{
  "id": "427624d3-893e-429e-9450-26c503f53205",
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
    "id": "1ab55c2a-b3b8-47fa-89e2-2c613840f5c7",
    "order_id": "427624d3-893e-429e-9450-26c503f53205",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b3c5b918-f3f5-4a35-9797-fb7873d370e4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:29:23.711488Z",
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
  "session_id": "026c77a8-3d4f-4164-82a2-4744ec08af48",
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
  "last_heartbeat_at": "2026-10-28T16:29:22.050998Z",
  "last_location_at": "2026-10-28T16:29:22.050998Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/026c77a8-3d4f-4164-82a2-4744ec08af48/close` → **200**

```json
{
  "command_id": "37d44621-28ce-40ce-ba14-fb274272b3ff",
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
  "session_id": "d268251d-079a-4816-962b-2e62dee8b7c6",
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
  "last_heartbeat_at": "2026-10-28T16:29:25.105462Z",
  "last_location_at": "2026-10-28T16:29:25.105462Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d268251d-079a-4816-962b-2e62dee8b7c6/close` → **200**

```json
{
  "command_id": "ad58b753-dbc6-464f-9b65-fe957f437b05",
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

Done: terminal order 427624d3-893e-429e-9450-26c503f53205 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9967"
}
```

```json
{
  "challenge_id": "4ea89916-5d3b-4d3c-a089-9abfb07778f2",
  "expires_at": "2026-10-28T16:34:30.906498676Z",
  "resend_available_at": "2026-10-28T16:29:31.906498676Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "287605",
  "sent_at": "2026-10-28T16:29:30.909216642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ea89916-5d3b-4d3c-a089-9abfb07778f2",
  "code": "287605",
  "device_ref": "sandbox-9967"
}
```

```json
{
  "session_id": "3e7fd26a-392a-417d-ad21-d4f624ea82c5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTg3MSwiaWF0IjoxNzkzMjA0OTcxLCJqdGkiOiJmZmNmMDdjYi01N2UzLTQ3ZTUtOTMwMS1iOTQwNDkzOTgzMzMiLCJzaWQiOiIzZTdmZDI2YS0zOTJhLTQxN2QtYWQyMS1kNGY2MjRlYTgyYzUifQ.NuONcfbHnsEOmZErbYv296VhEn8yI0JUsimYQZiN9NI",
  "access_expires_at": "2026-10-28T16:44:31.204434503Z",
  "refresh_token": "FSzsWfuNs95NoqayDRXKVJLXf9-2Xbu11oMtLbCP93M",
  "refresh_expires_at": "2026-11-27T16:29:31.203808353Z",
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
  "device_ref": "sandbox-19127"
}
```

```json
{
  "challenge_id": "5f815765-e48a-4251-967b-48b988eaca29",
  "expires_at": "2026-10-28T16:34:31.732398048Z",
  "resend_available_at": "2026-10-28T16:29:32.732398048Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "524502",
  "sent_at": "2026-10-28T16:29:31.734617252Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f815765-e48a-4251-967b-48b988eaca29",
  "code": "524502",
  "device_ref": "sandbox-19127"
}
```

```json
{
  "session_id": "c81acbda-a840-4850-93c5-66f73f1a306a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTg3MiwiaWF0IjoxNzkzMjA0OTcyLCJqdGkiOiIzYjRkMGI4Ny02NWQ4LTQ5NzQtOWU1MS0xNjE4YThlNTIzN2EiLCJzaWQiOiJjODFhY2JkYS1hODQwLTQ4NTAtOTNjNS02NmY3M2YxYTMwNmEifQ.MrNopx7v-3JkgqBHCZUs6d-AUmZONrAKK7NftykSM1c",
  "access_expires_at": "2026-10-28T16:44:32.026974863Z",
  "refresh_token": "7F1TyHpdwYj7ricT8aFSI5t0WTGDxvKpggOS5H6zgtM",
  "refresh_expires_at": "2026-11-27T16:29:32.026448089Z",
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
  "device_ref": "sandbox-28285"
}
```

```json
{
  "challenge_id": "2999d1ff-a805-466d-8f8d-6c2685aca657",
  "expires_at": "2026-10-28T16:34:32.560466571Z",
  "resend_available_at": "2026-10-28T16:29:33.560466571Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "034555",
  "sent_at": "2026-10-28T16:29:32.562640292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2999d1ff-a805-466d-8f8d-6c2685aca657",
  "code": "034555",
  "device_ref": "sandbox-28285"
}
```

```json
{
  "session_id": "b2dd5b10-3bbf-4e2e-8e76-efc530fb8190",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNTg3MiwiaWF0IjoxNzkzMjA0OTcyLCJqdGkiOiJlYTY0NWY1Yy1kYmVkLTQ5OTQtODNhYi0wMGYyMWQ5M2E3ZGIiLCJzaWQiOiJiMmRkNWIxMC0zYmJmLTRlMmUtOGU3Ni1lZmM1MzBmYjgxOTAifQ.4mhHc9nVWXMdAeha3UptCrrNQs8PyHVuP9oTQtkj5V0",
  "access_expires_at": "2026-10-28T16:44:32.850981613Z",
  "refresh_token": "dtlkpid7b3WmlwIrfDjAo8UcSIaFsr_LRdTKL4raDtY",
  "refresh_expires_at": "2026-11-27T16:29:32.850461442Z",
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
  "phone": "+380698230896",
  "device_ref": "sandbox-19171"
}
```

```json
{
  "challenge_id": "ed0a071b-521a-46c1-858a-df578d57bc69",
  "expires_at": "2026-10-28T16:34:33.420991487Z",
  "resend_available_at": "2026-10-28T16:29:34.420991487Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380698230896` → **200**

```json
{
  "phone": "+380698230896",
  "audience": "CLIENT",
  "code": "385804",
  "sent_at": "2026-10-28T16:29:33.423684946Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed0a071b-521a-46c1-858a-df578d57bc69",
  "code": "385804",
  "device_ref": "sandbox-19171"
}
```

```json
{
  "session_id": "4ca8b379-7433-49ea-9ed5-c4a98252a4d5",
  "subject": {
    "type": "CLIENT",
    "id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMWNjMzIwMy02YmMwLTRmZTctYTU1Zi1jZGQ4ZGUxZmU1MzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA1ODczLCJpYXQiOjE3OTMyMDQ5NzMsImp0aSI6IjQ2MzViNDcyLWI1ZWQtNGE4Mi1hNzI1LTk4OTJkNzY2YmE1ZiIsInNpZCI6IjRjYThiMzc5LTc0MzMtNDllYS05ZWQ1LWM0YTk4MjUyYTRkNSJ9.ZXEQ8EJdICw-af9osCUAUhn-iOBdcQbRn4Bc6je1UJI",
  "access_expires_at": "2026-10-28T16:44:33.713803626Z",
  "refresh_token": "ZJHNhjzXnYPZa2QhdLCj69dfOf_jHVaL8MKBTzZmYb8",
  "refresh_expires_at": "2026-11-27T16:29:33.713265231Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "70f74d18-05f6-40fa-b2a1-c1ebe40c3ce6",
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
  "id": "592ea5be-50bd-474b-ad5f-b017e5219e60",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:34:33.998810Z",
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
  "command_id": "4b65b512-678a-4e26-aa25-0378b4e22a4d",
  "quote_id": "592ea5be-50bd-474b-ad5f-b017e5219e60",
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
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
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
  "blizz_sms_sent_total": 64
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 14
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 10.853966497
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 2.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 15
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.139709631
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 57.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/42eb4c1b-560b-4e9a-88f8-d9953edb2e62` → **200**

```json
{
  "id": "42eb4c1b-560b-4e9a-88f8-d9953edb2e62",
  "short_number": 24,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b1cc3203-6bc0-4fe7-a55f-cdd8de1fe531",
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
  "created_at": "2026-10-28T16:29:34.287179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
