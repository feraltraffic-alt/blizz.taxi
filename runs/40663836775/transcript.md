# Sandbox transcript (2026-10-28T09:24:16Z, d94d40e)

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
  "correlation_id": "c80312a7-6b9f-48d9-bb7c-39793d16fc7a"
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
  "session_id": "d2f6af51-71c1-4319-ac11-6e245915f391",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzNTcsImlhdCI6MTc5MzE3OTQ1NywianRpIjoiM2ExNGYwMDAtNDEyNS00ZjE1LWE1OWItNDNkMDllNWI2OWM2Iiwic2lkIjoiZDJmNmFmNTEtNzFjMS00MzE5LWFjMTEtNmUyNDU5MTVmMzkxIn0.Z7IgwkixbVri6k-J3rANSwU5c2hH6SKO5LERfSKyTJk",
  "access_expires_at": "2026-10-28T09:39:17.035753413Z",
  "refresh_token": "1pXhNPZ0wo2IpQ7dHSxjUE8XymNpqQyBz0MSZ7x8qP4",
  "refresh_expires_at": "2026-10-28T21:24:17.033530307Z",
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
  "session_id": "effcbca2-87cf-48cc-8173-ba102f57164a",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzNTgsImlhdCI6MTc5MzE3OTQ1OCwianRpIjoiMjgzZjkzZDAtZWU0Zi00NDUxLTk2OWQtNWE2NWEwZTZlZjljIiwic2lkIjoiZWZmY2JjYTItODdjZi00OGNjLTgxNzMtYmExMDJmNTcxNjRhIn0.P3QKu24YbgxuyqhSOfXLnmgAh27rXGBAtSgSPdoZFaI",
  "access_expires_at": "2026-10-28T09:39:18.285464994Z",
  "refresh_token": "Rvez99jazEd4pxdzkARcMESJWRlER5Yk3GR5bron8mc",
  "refresh_expires_at": "2026-10-28T21:24:18.284322216Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "a847b398-2ef9-4f8e-93a5-974b55faeb10",
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
  "id": "3ab697e1-7eb9-4533-b0b7-a3f85bb31b52",
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
  "created_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "created_at": "2026-10-28T09:24:18.348909Z",
  "updated_at": "2026-10-28T09:24:18.348909Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630290998",
  "device_ref": "sandbox-11363"
}
```

```json
{
  "challenge_id": "19111611-05b7-4bb6-bd24-13c5c6efd2fa",
  "expires_at": "2026-10-28T09:29:18.390718834Z",
  "resend_available_at": "2026-10-28T09:24:19.390718834Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630290998` → **200**

```json
{
  "phone": "+380630290998",
  "audience": "CLIENT",
  "code": "744616",
  "sent_at": "2026-10-28T09:24:18.400152835Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19111611-05b7-4bb6-bd24-13c5c6efd2fa",
  "code": "744616",
  "device_ref": "sandbox-11363"
}
```

```json
{
  "session_id": "62068a45-7340-4768-9617-ad4f4ab977ce",
  "subject": {
    "type": "CLIENT",
    "id": "9f65f42a-09b3-4f6a-b0b5-32491cf4997d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjY1ZjQyYS0wOWIzLTRmNmEtYjBiNS0zMjQ5MWNmNDk5N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMzU4LCJpYXQiOjE3OTMxNzk0NTgsImp0aSI6IjRhZTkyYjE3LWU3ZWQtNGYwZi1iNWYxLTkyYmRlNjE1OWVhNyIsInNpZCI6IjYyMDY4YTQ1LTczNDAtNDc2OC05NjE3LWFkNGY0YWI5NzdjZSJ9.orRkc8AHfTfUgEIeKR0jGAsJbNYtjpXPBhxfFA7Butc",
  "access_expires_at": "2026-10-28T09:39:18.468364267Z",
  "refresh_token": "7TAbSkIYRlH5m6mY3vo-2K8YX8ggLlVZ8pyWrQfYKbU",
  "refresh_expires_at": "2026-11-27T09:24:18.467130152Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630290998` → **200**

```json
{
  "client_id": "9f65f42a-09b3-4f6a-b0b5-32491cf4997d"
}
```

`POST /api/admin/v1/rider-wallets/9f65f42a-09b3-4f6a-b0b5-32491cf4997d/top-ups` → **201**

```json
{
  "command_id": "0bfbc23e-b287-4f17-b2ac-8d1fcd6b07b2",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "9f65f42a-09b3-4f6a-b0b5-32491cf4997d",
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
      "id": "523877bf-105b-47ec-a815-cc0b5be3d03d",
      "at": "2026-10-28T09:24:18.540412Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ae838779-78b2-4e85-9811-34dfdbdce629",
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
  "id": "b583814f-7d3b-44aa-805e-34fd3d3a85fb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:29:18.691859Z",
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
      "id": "3ab697e1-7eb9-4533-b0b7-a3f85bb31b52",
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
  "device_ref": "sandbox-29667"
}
```

```json
{
  "challenge_id": "f7ec97de-a053-43d6-802f-44fcb66b4b58",
  "expires_at": "2026-10-28T09:29:18.750323284Z",
  "resend_available_at": "2026-10-28T09:24:19.750323284Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "713143",
  "sent_at": "2026-10-28T09:24:18.75325758Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f7ec97de-a053-43d6-802f-44fcb66b4b58",
  "code": "713143",
  "device_ref": "sandbox-29667"
}
```

```json
{
  "session_id": "fbdff59b-62b2-4a09-b3b9-7d9a9f30bba9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDM1OCwiaWF0IjoxNzkzMTc5NDU4LCJqdGkiOiJjMzJhNjgwOS04Nzg2LTRmMjgtOGE4OS0zMTU2MjkzYzliYzYiLCJzaWQiOiJmYmRmZjU5Yi02MmIyLTRhMDktYjNiOS03ZDlhOWYzMGJiYTkifQ.OoGX0_yfSWvTpnyjCcBH79VD9m9luuV65XnR5c3fQ6Q",
  "access_expires_at": "2026-10-28T09:39:18.801551809Z",
  "refresh_token": "eHUVjNHkdc0W7I7vRJqTkshcisNXdxVajo6bSfr27iU",
  "refresh_expires_at": "2026-11-27T09:24:18.800401608Z",
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
  "command_id": "d5456f24-cb74-4690-b0c5-a7af1011d811",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:24:18Z",
    "sequence": 1793179458856
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2f374648-c4a9-4a47-9a20-014a42594119",
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
  "last_heartbeat_at": "2026-10-28T09:24:18.896718Z",
  "last_location_at": "2026-10-28T09:24:18.896718Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c2415d8f-df61-40ae-92bb-519e7fbe230f",
  "quote_id": "b583814f-7d3b-44aa-805e-34fd3d3a85fb",
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
  "id": "d9075669-860e-4e66-9b0b-c70d93aa0da6",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9f65f42a-09b3-4f6a-b0b5-32491cf4997d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:24:18.975487Z",
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
  "client_id": "9f65f42a-09b3-4f6a-b0b5-32491cf4997d",
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
      "id": "523877bf-105b-47ec-a815-cc0b5be3d03d",
      "at": "2026-10-28T09:24:18.540412Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
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
    "id": "f06e1544-c38f-4cb5-b245-6e9a1220dde4",
    "order_id": "d9075669-860e-4e66-9b0b-c70d93aa0da6",
    "expires_at": "2026-10-28T09:24:33.989605Z",
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

`POST /api/driver/v1/offers/f06e1544-c38f-4cb5-b245-6e9a1220dde4/accept` → **200**

```json
{
  "command_id": "4c6fcf9d-5364-4790-93e2-3966a64fbcb4"
}
```

```json
{
  "id": "ede52d6c-df84-4758-a9eb-3c9756526c3f",
  "order_id": "d9075669-860e-4e66-9b0b-c70d93aa0da6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e9c9927a-9a6a-436f-8362-19b3d0b378a1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e9c9927a-9a6a-436f-8362-19b3d0b378a1",
  "order_id": "d9075669-860e-4e66-9b0b-c70d93aa0da6",
  "assignment_id": "ede52d6c-df84-4758-a9eb-3c9756526c3f",
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

`POST /api/driver/v1/work-sessions/2f374648-c4a9-4a47-9a20-014a42594119/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:24:19Z",
    "sequence": 1793179459141
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2f374648-c4a9-4a47-9a20-014a42594119",
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
  "last_heartbeat_at": "2026-10-28T09:24:19.162747Z",
  "last_location_at": "2026-10-28T09:24:19.162747Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e9c9927a-9a6a-436f-8362-19b3d0b378a1/arrive` → **200**

```json
{
  "command_id": "e50b7a69-3be5-45bf-adf1-95784e75985c",
  "expected_version": 0
}
```

```json
{
  "id": "e9c9927a-9a6a-436f-8362-19b3d0b378a1",
  "order_id": "d9075669-860e-4e66-9b0b-c70d93aa0da6",
  "assignment_id": "ede52d6c-df84-4758-a9eb-3c9756526c3f",
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
  "arrived_at": "2026-10-28T09:24:19.201715Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9c9927a-9a6a-436f-8362-19b3d0b378a1/start` → **200**

```json
{
  "command_id": "d8cb6a4f-e06a-4a96-b653-d59676cdc3b5",
  "expected_version": 1
}
```

```json
{
  "id": "e9c9927a-9a6a-436f-8362-19b3d0b378a1",
  "order_id": "d9075669-860e-4e66-9b0b-c70d93aa0da6",
  "assignment_id": "ede52d6c-df84-4758-a9eb-3c9756526c3f",
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
  "arrived_at": "2026-10-28T09:24:19.201715Z",
  "started_at": "2026-10-28T09:24:19.236827Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/e9c9927a-9a6a-436f-8362-19b3d0b378a1/complete` → **200**

```json
{
  "command_id": "a98df1ba-ae22-4623-90f8-5a83e88fcb29",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:24:19Z",
  "cash_received": true
}
```

```json
{
  "id": "e9c9927a-9a6a-436f-8362-19b3d0b378a1",
  "order_id": "d9075669-860e-4e66-9b0b-c70d93aa0da6",
  "assignment_id": "ede52d6c-df84-4758-a9eb-3c9756526c3f",
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
  "arrived_at": "2026-10-28T09:24:19.201715Z",
  "started_at": "2026-10-28T09:24:19.236827Z",
  "completed_at": "2026-10-28T09:24:19.289873Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9f65f42a-09b3-4f6a-b0b5-32491cf4997d",
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
      "id": "59900bfc-313e-425f-9831-35f78edb89b1",
      "at": "2026-10-28T09:24:19.814271Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "d9075669-860e-4e66-9b0b-c70d93aa0da6"
    },
    {
      "id": "523877bf-105b-47ec-a815-cc0b5be3d03d",
      "at": "2026-10-28T09:24:18.540412Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/3ab697e1-7eb9-4533-b0b7-a3f85bb31b52/archive` → **200**

```json
{
  "command_id": "3c9b7f36-9b93-4619-a142-609412b0fa89",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "3ab697e1-7eb9-4533-b0b7-a3f85bb31b52",
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
  "created_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "created_at": "2026-10-28T09:24:18.348909Z",
  "updated_at": "2026-10-28T09:24:22.372595Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2f374648-c4a9-4a47-9a20-014a42594119",
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
  "last_heartbeat_at": "2026-10-28T09:24:19.162747Z",
  "last_location_at": "2026-10-28T09:24:19.162747Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2f374648-c4a9-4a47-9a20-014a42594119/close` → **200**

```json
{
  "command_id": "835fede5-2780-47ee-9139-04b5b32eb2bc",
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

Done: order d9075669-860e-4e66-9b0b-c70d93aa0da6.

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
  "session_id": "2cda928e-322a-4a37-880a-0af470ff3ea5",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzNjIsImlhdCI6MTc5MzE3OTQ2MiwianRpIjoiMzM4MzQ1NjAtNmYwZi00M2I3LTkwZmMtYjc3NmI2YzBkNjgzIiwic2lkIjoiMmNkYTkyOGUtMzIyYS00YTM3LTg4MGEtMGFmNDcwZmYzZWE1In0.Gq7egPWfwOy9mEl6084YW5QG_XIwQ8_KeOMJcf7E77s",
  "access_expires_at": "2026-10-28T09:39:22.751634667Z",
  "refresh_token": "XzhRREqKxHXZmQkX4vknQprqDSf0K6lqWTjJ8tyRfsc",
  "refresh_expires_at": "2026-10-28T21:24:22.750727988Z",
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
  "command_id": "221379a1-02b0-47c1-bb22-841fe997dd66",
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
  "session_id": "72694b3e-53a8-494a-bb92-b5c90960d2e4",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzNjMsImlhdCI6MTc5MzE3OTQ2MywianRpIjoiZTYwY2UzNDgtZjc3YS00MjJmLWI1ODYtZmM2NWY0MTIyNjUzIiwic2lkIjoiNzI2OTRiM2UtNTNhOC00OTRhLWJiOTItYjVjOTA5NjBkMmU0In0.xKGLuzcSh5CsUAKKC3-VJhkLLzWhw7u_t85HFhi0zjs",
  "access_expires_at": "2026-10-28T09:39:23.121661593Z",
  "refresh_token": "6d5ozcePCYXrawQqfZM7b3HvkDYLKTRQgdOQWkHLaWs",
  "refresh_expires_at": "2026-10-28T21:24:23.120786327Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.751328854",
    "linkedid": "1730052700.751328854",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670140754"
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
    "id": "1730052700.751328854",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "1580d461-dfb3-440a-aa2b-0ba00f8c2e3f",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670140754",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:24:23.147105Z",
      "answered_at": null,
      "ended_at": "2026-10-28T09:24:23.166461Z",
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
    "id": "1730052600.99879694",
    "linkedid": "1730052600.99879694",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670140754"
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
      "id": "22d10f29-b8aa-40e1-b949-16c5ff95a634",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670140754",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:24:23.2202Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/22d10f29-b8aa-40e1-b949-16c5ff95a634/answer` → **200**

```json
{
  "command_id": "e8134976-73bf-45d5-915f-a043afc5d585"
}
```

```json
{
  "id": "22d10f29-b8aa-40e1-b949-16c5ff95a634",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670140754",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "order_ids": [],
  "started_at": "2026-10-28T09:24:23.2202Z",
  "answered_at": "2026-10-28T09:24:23.270442Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.99879694",
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
    "id": "1730052600.99879694",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "22d10f29-b8aa-40e1-b949-16c5ff95a634",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670140754",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_ids": [],
      "started_at": "2026-10-28T09:24:23.2202Z",
      "answered_at": "2026-10-28T09:24:23.270442Z",
      "ended_at": "2026-10-28T09:24:23.327735Z",
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
      "id": "22d10f29-b8aa-40e1-b949-16c5ff95a634",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670140754",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_ids": [],
      "started_at": "2026-10-28T09:24:23.2202Z",
      "answered_at": "2026-10-28T09:24:23.270442Z",
      "ended_at": "2026-10-28T09:24:23.327735Z",
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
      "id": "22d10f29-b8aa-40e1-b949-16c5ff95a634",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670140754",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_ids": [],
      "started_at": "2026-10-28T09:24:23.2202Z",
      "answered_at": "2026-10-28T09:24:23.270442Z",
      "ended_at": "2026-10-28T09:24:23.327735Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:24:25.668026Z"
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
      "id": "22d10f29-b8aa-40e1-b949-16c5ff95a634",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670140754",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_ids": [],
      "started_at": "2026-10-28T09:24:23.2202Z",
      "answered_at": "2026-10-28T09:24:23.270442Z",
      "ended_at": "2026-10-28T09:24:23.327735Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:24:25.668026Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/22d10f29-b8aa-40e1-b949-16c5ff95a634/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/22d10f29-b8aa-40e1-b949-16c5ff95a634/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=22d10f29-b8aa-40e1-b949-16c5ff95a634` → **200**

```json
{
  "changes": [
    {
      "id": "201a01a6-7ede-4be2-9624-02572d6a36fb",
      "occurred_at": "2026-10-28T09:24:27.481025Z",
      "actor_type": "STAFF",
      "actor_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "22d10f29-b8aa-40e1-b949-16c5ff95a634",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"cb875dc5-8933-4b85-84d9-b66ef5b9ef33\", \"order_ids\": []}",
      "correlation_id": "13244237-71be-4202-bdb8-0e3100951f15"
    },
    {
      "id": "f2bce1ab-a202-4718-b9f7-8a03d7f11a85",
      "occurred_at": "2026-10-28T09:24:27.455573Z",
      "actor_type": "STAFF",
      "actor_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "22d10f29-b8aa-40e1-b949-16c5ff95a634",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"cb875dc5-8933-4b85-84d9-b66ef5b9ef33\", \"order_ids\": []}",
      "correlation_id": "d02d1bea-224e-47fd-ac48-7a6884f90647"
    }
  ]
}
```

Done: call 22d10f29-b8aa-40e1-b949-16c5ff95a634 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636069853",
  "device_ref": "sandbox-11423"
}
```

```json
{
  "challenge_id": "e683195c-3d99-4c29-ab52-7a53654a6ced",
  "expires_at": "2026-10-28T09:29:27.538659747Z",
  "resend_available_at": "2026-10-28T09:24:28.538659747Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636069853` → **200**

```json
{
  "phone": "+380636069853",
  "audience": "CLIENT",
  "code": "263161",
  "sent_at": "2026-10-28T09:24:27.541376783Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e683195c-3d99-4c29-ab52-7a53654a6ced",
  "code": "263161",
  "device_ref": "sandbox-11423"
}
```

```json
{
  "session_id": "9f04d27a-f0e5-4669-8dbb-c121d95aa747",
  "subject": {
    "type": "CLIENT",
    "id": "e5570cd5-9fae-4954-9030-b6a0b5849df5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNTU3MGNkNS05ZmFlLTQ5NTQtOTAzMC1iNmEwYjU4NDlkZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMzY3LCJpYXQiOjE3OTMxNzk0NjcsImp0aSI6IjM5NWIwMzkyLWExOGQtNDhkMy05MWQzLWMwNmNjMjBmMGFjNiIsInNpZCI6IjlmMDRkMjdhLWYwZTUtNDY2OS04ZGJiLWMxMjFkOTVhYTc0NyJ9.XOs3frFsgLTmtetoYzHEwIVeZ_WdlDIz7_fFrZCjXPg",
  "access_expires_at": "2026-10-28T09:39:27.586970679Z",
  "refresh_token": "wl7O3cGrKN_jtWjMBULGLZz5Q9Rz2t52im8NSPpzLMQ",
  "refresh_expires_at": "2026-11-27T09:24:27.586268142Z",
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
  "device_ref": "sandbox-22284"
}
```

```json
{
  "challenge_id": "0f1ea713-7900-4bbd-a5a8-2284375b67c5",
  "expires_at": "2026-10-28T09:29:27.631588948Z",
  "resend_available_at": "2026-10-28T09:24:28.631588948Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "053952",
  "sent_at": "2026-10-28T09:24:27.63444241Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f1ea713-7900-4bbd-a5a8-2284375b67c5",
  "code": "053952",
  "device_ref": "sandbox-22284"
}
```

```json
{
  "session_id": "04ba2415-7577-4660-9d36-e047df7ce5af",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDM2NywiaWF0IjoxNzkzMTc5NDY3LCJqdGkiOiI3YWFiMmZkMS1mM2U3LTQzODQtYWRmZS02MDRjZjA4ZmRlMjQiLCJzaWQiOiIwNGJhMjQxNS03NTc3LTQ2NjAtOWQzNi1lMDQ3ZGY3Y2U1YWYifQ.-0dmbRgceWGlz_j5CVfqLcdS27R9k8kWYxoO6trXX5c",
  "access_expires_at": "2026-10-28T09:39:27.679238356Z",
  "refresh_token": "q3N_vF-Yxmj7ZO7qfoLzapRRxc-rBra-XiJNeJMDUZY",
  "refresh_expires_at": "2026-11-27T09:24:27.678679805Z",
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
  "session_id": "c4bc6ec9-74c8-487f-a277-7331a15fa82f",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzNjgsImlhdCI6MTc5MzE3OTQ2OCwianRpIjoiMjdlZWNhNzItZTM5Yy00MTY4LTljNzQtODYyYjlhZDUxMGZjIiwic2lkIjoiYzRiYzZlYzktNzRjOC00ODdmLWEyNzctNzMzMWExNWZhODJmIn0.0HquTV3fDyFPiwDxNaP6OAwOKzzGaJEsgfFyc8eg6F0",
  "access_expires_at": "2026-10-28T09:39:28.002929756Z",
  "refresh_token": "5dDOX9x6NcqSes5MWKRdvdmujHh0maOvgH6mogHuMxs",
  "refresh_expires_at": "2026-10-28T21:24:28.002093659Z",
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
  "session_id": "8854b706-47ba-4b2a-b93b-61418fb8af6d",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzNjgsImlhdCI6MTc5MzE3OTQ2OCwianRpIjoiMzQwMjA5MDEtNzY5OS00NWNlLWIwZmItYzlkNTgwMDVlZmFkIiwic2lkIjoiODg1NGI3MDYtNDdiYS00YjJhLWI5M2ItNjE0MThmYjhhZjZkIn0.i3781ojdSklwJUTYGJSRPUgZASyMWiqthKSzzf9P1rQ",
  "access_expires_at": "2026-10-28T09:39:28.322602059Z",
  "refresh_token": "QgyrhdwYsHn8rW99H_ZFZ9fbafAh1z-flHMvw3PGG1E",
  "refresh_expires_at": "2026-10-28T21:24:28.32188835Z",
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
  "command_id": "a03da49e-3062-4be8-a550-eb60af6ccc0d",
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
  "id": "f2f11385-de83-4428-83b9-7330e393e20d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:29:28.380961Z",
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
  "command_id": "d469e0de-eb36-49c5-a908-4d99a2dc6c3b",
  "quote_id": "f2f11385-de83-4428-83b9-7330e393e20d",
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
  "id": "dd8003a8-ec66-442f-af53-da3f4dc4e0e5",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e5570cd5-9fae-4954-9030-b6a0b5849df5",
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
  "created_at": "2026-10-28T09:24:28.41787Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/dd8003a8-ec66-442f-af53-da3f4dc4e0e5` → **200**

```json
{
  "id": "dd8003a8-ec66-442f-af53-da3f4dc4e0e5",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e5570cd5-9fae-4954-9030-b6a0b5849df5",
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
  "created_at": "2026-10-28T09:24:28.41787Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/dd8003a8-ec66-442f-af53-da3f4dc4e0e5/cancel` → **200**

```json
{
  "command_id": "201caa9f-600d-4e6a-b40a-b6308f26206c",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "dd8003a8-ec66-442f-af53-da3f4dc4e0e5",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e5570cd5-9fae-4954-9030-b6a0b5849df5",
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
  "created_at": "2026-10-28T09:24:28.41787Z",
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
  "command_id": "200eb49d-e4ea-4124-b359-6ff5784dc434",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:24:28Z",
    "sequence": 1793179468531
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4465403d-0ecf-46b1-ae5d-d823f33afdf0",
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
  "last_heartbeat_at": "2026-10-28T09:24:28.546644Z",
  "last_location_at": "2026-10-28T09:24:28.546644Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19358"
}
```

```json
{
  "challenge_id": "67fca49b-3d10-47b8-938d-80acc9bf22f9",
  "expires_at": "2026-10-28T09:29:28.568477032Z",
  "resend_available_at": "2026-10-28T09:24:29.568477032Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "039099",
  "sent_at": "2026-10-28T09:24:28.571462475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67fca49b-3d10-47b8-938d-80acc9bf22f9",
  "code": "039099",
  "device_ref": "sandbox-19358"
}
```

```json
{
  "session_id": "0d611ff6-d5ce-4a15-b66f-941e5bba254d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDM2OCwiaWF0IjoxNzkzMTc5NDY4LCJqdGkiOiJlMjUwZWMzYS0yNTliLTRkZWYtYWI4NS1hYWE5NjczMjE5ODMiLCJzaWQiOiIwZDYxMWZmNi1kNWNlLTRhMTUtYjY2Zi05NDFlNWJiYTI1NGQifQ.ns3eLx8B39FHOkmX1umnGUiQOSmP6zg0Hiu6S3HwrPw",
  "access_expires_at": "2026-10-28T09:39:28.61471119Z",
  "refresh_token": "8AtfOCs7STe-9AU3yktht23v2JFXbgTmL_ME3rlPPBU",
  "refresh_expires_at": "2026-11-27T09:24:28.614094733Z",
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
  "command_id": "8d5396d4-a348-42b0-ab97-73f2f618b1c8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:24:28Z",
    "sequence": 1793179468653
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "32c78c3b-c06d-40b9-91fa-67a36973dc19",
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
  "last_heartbeat_at": "2026-10-28T09:24:28.669689Z",
  "last_location_at": "2026-10-28T09:24:28.669689Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4b9d45b4-3fe3-4b03-be30-a25c99829201",
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
  "id": "b64f9603-42b1-4e12-a5b2-7b27fe6451e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:29:28.704860Z",
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
  "command_id": "8256698c-a4ec-40d3-96c0-fc238f76ecfb",
  "quote_id": "b64f9603-42b1-4e12-a5b2-7b27fe6451e5",
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
  "id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e5570cd5-9fae-4954-9030-b6a0b5849df5",
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
  "created_at": "2026-10-28T09:24:28.737423Z",
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
    "id": "1b275b2b-d57a-4de9-b7d2-e0d1d4f15285",
    "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
    "expires_at": "2026-10-28T09:24:43.741653Z",
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

`POST /api/driver/v1/offers/1b275b2b-d57a-4de9-b7d2-e0d1d4f15285/accept` → **200**

```json
{
  "command_id": "b094b83e-da85-406d-b793-610a23a258dd"
}
```

```json
{
  "id": "44c22ff5-b490-4fc7-bb08-cf4f8591fba6",
  "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "474efaa4-e67b-46ed-8f26-7d90da76564c",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "474efaa4-e67b-46ed-8f26-7d90da76564c",
  "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
  "assignment_id": "44c22ff5-b490-4fc7-bb08-cf4f8591fba6",
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

`POST /api/driver/v1/trips/474efaa4-e67b-46ed-8f26-7d90da76564c/cancel` → **200**

```json
{
  "command_id": "03237bf0-1147-42d3-befb-e031247b5c34",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "474efaa4-e67b-46ed-8f26-7d90da76564c",
  "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
  "assignment_id": "44c22ff5-b490-4fc7-bb08-cf4f8591fba6",
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

`GET /api/rider/v1/orders/1b081cf6-2f5a-4b89-afd7-ad67ed168470` → **200**

```json
{
  "id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e5570cd5-9fae-4954-9030-b6a0b5849df5",
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
    "id": "44c22ff5-b490-4fc7-bb08-cf4f8591fba6",
    "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "474efaa4-e67b-46ed-8f26-7d90da76564c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:24:28.737423Z",
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
    "id": "770d7dab-dc88-4352-9501-1598676b97c4",
    "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
    "expires_at": "2026-10-28T09:24:43.857275Z",
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

`POST /api/driver/v1/offers/770d7dab-dc88-4352-9501-1598676b97c4/accept` → **200**

```json
{
  "command_id": "d57856a2-bbaf-4ca9-9be0-5a6a03262a43"
}
```

```json
{
  "id": "0726a915-ecf1-4da3-929c-3c9831d49694",
  "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cbf833cd-d75e-4e8e-96dd-a84e3700066a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cbf833cd-d75e-4e8e-96dd-a84e3700066a",
  "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
  "assignment_id": "0726a915-ecf1-4da3-929c-3c9831d49694",
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

`POST /api/driver/v1/trips/cbf833cd-d75e-4e8e-96dd-a84e3700066a/cancel` → **200**

```json
{
  "command_id": "01603c31-84ef-4731-8b6f-16cb7f960aff",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "cbf833cd-d75e-4e8e-96dd-a84e3700066a",
  "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
  "assignment_id": "0726a915-ecf1-4da3-929c-3c9831d49694",
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
    "id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:24:28.737423Z",
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
    "id": "dd8003a8-ec66-442f-af53-da3f4dc4e0e5",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:24:28.41787Z",
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

`GET /api/operator/v1/orders/1b081cf6-2f5a-4b89-afd7-ad67ed168470/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:24:28.738075Z",
      "actor": {
        "type": "CLIENT",
        "id": "e5570cd5-9fae-4954-9030-b6a0b5849df5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
        "quote_id": "b64f9603-42b1-4e12-a5b2-7b27fe6451e5",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "1f75c5a4-4a8c-47db-99ea-3eaa9054097a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:24:28.740439Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
        "attempt_id": "f24c527a-0875-47a6-bf10-d5560b2bd937",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1f75c5a4-4a8c-47db-99ea-3eaa9054097a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:24:28.747688Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1b275b2b-d57a-4de9-b7d2-e0d1d4f15285",
        "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "1f75c5a4-4a8c-47db-99ea-3eaa9054097a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:24:28.798926Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1b275b2b-d57a-4de9-b7d2-e0d1d4f15285",
        "order_id": "1b081cf6-2f5a-4b89-afd7-ad67ed168470",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "44c22ff5-b490-4fc7-bb08-cf4f8591fba6"
      },
      "correlation_id": "489ce5de-94a2-4394-b3f7-5688089d0430"
```

Done: orders dd8003a8-ec66-442f-af53-da3f4dc4e0e5, 1b081cf6-2f5a-4b89-afd7-ad67ed168470.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732345943",
  "device_ref": "sandbox-15282"
}
```

```json
{
  "challenge_id": "a97df449-76c2-498f-b344-3cdd524d5ec2",
  "expires_at": "2026-10-28T09:29:29.093077015Z",
  "resend_available_at": "2026-10-28T09:24:30.093077015Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732345943` → **200**

```json
{
  "phone": "+380732345943",
  "audience": "CLIENT",
  "code": "748113",
  "sent_at": "2026-10-28T09:24:29.09611226Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a97df449-76c2-498f-b344-3cdd524d5ec2",
  "code": "748113",
  "device_ref": "sandbox-15282"
}
```

```json
{
  "session_id": "1b254d05-f50c-43e5-b1a9-afb0efaac977",
  "subject": {
    "type": "CLIENT",
    "id": "5e907411-61e4-4297-83d0-b31c39e24031"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTkwNzQxMS02MWU0LTQyOTctODNkMC1iMzFjMzllMjQwMzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMzY5LCJpYXQiOjE3OTMxNzk0NjksImp0aSI6IjFmNTkxZGIwLWM2NjUtNDhmZS1hMTMwLWUyOWZkMDgwODMxYSIsInNpZCI6IjFiMjU0ZDA1LWY1MGMtNDNlNS1iMWE5LWFmYjBlZmFhYzk3NyJ9.gUkYsk0y5UC0o3EQffBqVh0Qi2FDBZPhGHZlhBU2O1A",
  "access_expires_at": "2026-10-28T09:39:29.143830774Z",
  "refresh_token": "wQ2yUAzkCQ8OzGN_lmOo0LKaLrpJR8ESta-VMJgwxU0",
  "refresh_expires_at": "2026-11-27T09:24:29.143169438Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "fa7b28e5-6d21-48f3-8768-ab02c9fb26b0",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "963a385c-dce5-4d1b-8c69-2520132d65a9",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-963a385c-dce5-4d1b-8c69-2520132d65a9",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "91696fc21a1cc8f0ca9b7888e656797b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=963a385c-dce5-4d1b-8c69-2520132d65a9",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732345943"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=963a385c-dce5-4d1b-8c69-2520132d65a9",
  "expires_at": "2026-10-28T09:54:29.172949Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/963a385c-dce5-4d1b-8c69-2520132d65a9` → **200**

```json
{
  "id": "963a385c-dce5-4d1b-8c69-2520132d65a9",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T09:54:29.172949Z",
  "card": {
    "id": "4a532127-272b-4415-9da1-8d2bc98d4ed9",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7147",
    "card_type": "Visa",
    "created_at": "2026-10-28T09:24:29.215764Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "4a532127-272b-4415-9da1-8d2bc98d4ed9",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7147",
      "card_type": "Visa",
      "created_at": "2026-10-28T09:24:29.215764Z"
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
  "device_ref": "sandbox-13163"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "cfd06240-2ba4-40a6-beef-a92c8f5902b6",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13163"
}
```

```json
{
  "challenge_id": "9f4bee37-2be9-4be3-be12-b601e8cf6c60",
  "expires_at": "2026-10-28T09:29:30.303953893Z",
  "resend_available_at": "2026-10-28T09:24:31.303953893Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "887179",
  "sent_at": "2026-10-28T09:24:30.306564194Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f4bee37-2be9-4be3-be12-b601e8cf6c60",
  "code": "887179",
  "device_ref": "sandbox-13163"
}
```

```json
{
  "session_id": "6969eb75-bae0-4af1-9ec1-88f8e0b4484d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDM3MCwiaWF0IjoxNzkzMTc5NDcwLCJqdGkiOiJkMjQ3ZWZhZi03NmUxLTRjZjItYjY1Ni1mOGRmMTg3YzRiYjAiLCJzaWQiOiI2OTY5ZWI3NS1iYWUwLTRhZjEtOWVjMS04OGY4ZTBiNDQ4NGQifQ.BNL7x_DUaPNhnIO9W6w5_aCfb9Wa69cy31RGTcfi7Ro",
  "access_expires_at": "2026-10-28T09:39:30.352327738Z",
  "refresh_token": "Yn2ddghCr47v4dmnUq2bueCMZiNXLGZhIGm3B13-vU0",
  "refresh_expires_at": "2026-11-27T09:24:30.351852076Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "32c78c3b-c06d-40b9-91fa-67a36973dc19",
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
  "last_heartbeat_at": "2026-10-28T09:24:28.669689Z",
  "last_location_at": "2026-10-28T09:24:28.669689Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/32c78c3b-c06d-40b9-91fa-67a36973dc19/handover` → **200**

```json
{
  "command_id": "4b03019d-6671-4ca5-b569-67e808a6eb32",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "32c78c3b-c06d-40b9-91fa-67a36973dc19",
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
  "last_heartbeat_at": "2026-10-28T09:24:28.669689Z",
  "last_location_at": "2026-10-28T09:24:28.669689Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/32c78c3b-c06d-40b9-91fa-67a36973dc19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:24:30Z",
    "sequence": 1793179470424
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "32c78c3b-c06d-40b9-91fa-67a36973dc19",
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
  "last_heartbeat_at": "2026-10-28T09:24:30.438993Z",
  "last_location_at": "2026-10-28T09:24:30.438993Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "88bca4eb-dbae-4530-8634-e85cd21d3795",
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
  "id": "eac44a53-b3a1-48dc-a19d-53ae89919fbf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:29:30.469248Z",
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
  "command_id": "a34eed3d-992c-4892-87ef-e88143611c36",
  "quote_id": "eac44a53-b3a1-48dc-a19d-53ae89919fbf",
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
  "id": "74000544-da22-4223-9811-15799507d61d",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5e907411-61e4-4297-83d0-b31c39e24031",
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
  "created_at": "2026-10-28T09:24:30.502105Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/74000544-da22-4223-9811-15799507d61d` → **200**

```json
{
  "id": "74000544-da22-4223-9811-15799507d61d",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5e907411-61e4-4297-83d0-b31c39e24031",
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
  "created_at": "2026-10-28T09:24:30.502105Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/74000544-da22-4223-9811-15799507d61d` → **200**

```json
{
  "id": "74000544-da22-4223-9811-15799507d61d",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5e907411-61e4-4297-83d0-b31c39e24031",
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
  "created_at": "2026-10-28T09:24:30.502105Z",
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
    "id": "ac52c410-1707-4ec6-b632-76b51cc0494f",
    "order_id": "74000544-da22-4223-9811-15799507d61d",
    "expires_at": "2026-10-28T09:24:45.932337Z",
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

`POST /api/driver/v1/offers/ac52c410-1707-4ec6-b632-76b51cc0494f/accept` → **200**

```json
{
  "command_id": "93fb7b03-369f-4fb0-bd7f-643a3f57efc7"
}
```

```json
{
  "id": "ed049359-3a65-44ca-9b84-d43d35ee07d0",
  "order_id": "74000544-da22-4223-9811-15799507d61d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9e90e593-8b5b-4bc7-93c1-f17316765987",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9e90e593-8b5b-4bc7-93c1-f17316765987",
  "order_id": "74000544-da22-4223-9811-15799507d61d",
  "assignment_id": "ed049359-3a65-44ca-9b84-d43d35ee07d0",
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

`POST /api/driver/v1/work-sessions/32c78c3b-c06d-40b9-91fa-67a36973dc19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:24:31Z",
    "sequence": 1793179471650
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "32c78c3b-c06d-40b9-91fa-67a36973dc19",
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
  "last_heartbeat_at": "2026-10-28T09:24:31.665934Z",
  "last_location_at": "2026-10-28T09:24:31.665934Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9e90e593-8b5b-4bc7-93c1-f17316765987/arrive` → **200**

```json
{
  "command_id": "0debffc3-abaf-4799-9270-18810aec644a",
  "expected_version": 0
}
```

```json
{
  "id": "9e90e593-8b5b-4bc7-93c1-f17316765987",
  "order_id": "74000544-da22-4223-9811-15799507d61d",
  "assignment_id": "ed049359-3a65-44ca-9b84-d43d35ee07d0",
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
  "arrived_at": "2026-10-28T09:24:31.696987Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9e90e593-8b5b-4bc7-93c1-f17316765987/start` → **200**

```json
{
  "command_id": "ff6ad0fa-94dc-4df7-a888-e8bbffa2bf11",
  "expected_version": 1
}
```

```json
{
  "id": "9e90e593-8b5b-4bc7-93c1-f17316765987",
  "order_id": "74000544-da22-4223-9811-15799507d61d",
  "assignment_id": "ed049359-3a65-44ca-9b84-d43d35ee07d0",
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
  "arrived_at": "2026-10-28T09:24:31.696987Z",
  "started_at": "2026-10-28T09:24:31.730234Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9e90e593-8b5b-4bc7-93c1-f17316765987/complete` → **200**

```json
{
  "command_id": "f7ef247c-51ad-4cc8-ab1b-b73feae246e8",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:24:31Z"
}
```

```json
{
  "id": "9e90e593-8b5b-4bc7-93c1-f17316765987",
  "order_id": "74000544-da22-4223-9811-15799507d61d",
  "assignment_id": "ed049359-3a65-44ca-9b84-d43d35ee07d0",
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
  "arrived_at": "2026-10-28T09:24:31.696987Z",
  "started_at": "2026-10-28T09:24:31.730234Z",
  "completed_at": "2026-10-28T09:24:31.766851Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/74000544-da22-4223-9811-15799507d61d` → **200**

```json
{
  "id": "74000544-da22-4223-9811-15799507d61d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5e907411-61e4-4297-83d0-b31c39e24031",
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
    "id": "ed049359-3a65-44ca-9b84-d43d35ee07d0",
    "order_id": "74000544-da22-4223-9811-15799507d61d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9e90e593-8b5b-4bc7-93c1-f17316765987",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:24:30.502105Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/74000544-da22-4223-9811-15799507d61d` → **200**

```json
{
  "id": "74000544-da22-4223-9811-15799507d61d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5e907411-61e4-4297-83d0-b31c39e24031",
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
    "id": "ed049359-3a65-44ca-9b84-d43d35ee07d0",
    "order_id": "74000544-da22-4223-9811-15799507d61d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9e90e593-8b5b-4bc7-93c1-f17316765987",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:24:30.502105Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/74000544-da22-4223-9811-15799507d61d` → **200**

```json
{
  "id": "74000544-da22-4223-9811-15799507d61d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5e907411-61e4-4297-83d0-b31c39e24031",
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
    "id": "ed049359-3a65-44ca-9b84-d43d35ee07d0",
    "order_id": "74000544-da22-4223-9811-15799507d61d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9e90e593-8b5b-4bc7-93c1-f17316765987",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:24:30.502105Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/74000544-da22-4223-9811-15799507d61d` → **200**

```json
{
  "id": "74000544-da22-4223-9811-15799507d61d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "5e907411-61e4-4297-83d0-b31c39e24031",
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
    "id": "ed049359-3a65-44ca-9b84-d43d35ee07d0",
    "order_id": "74000544-da22-4223-9811-15799507d61d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9e90e593-8b5b-4bc7-93c1-f17316765987",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:24:30.502105Z",
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
      "id": "63ec0396-99c4-44a9-9492-828db92c9045",
      "at": "2026-10-28T09:24:31.98888Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "74000544-da22-4223-9811-15799507d61d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/74000544-da22-4223-9811-15799507d61d/tip` → **200**

```json
{
  "order_id": "74000544-da22-4223-9811-15799507d61d",
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
  "available_until": "2026-10-29T09:24:31.766851Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/74000544-da22-4223-9811-15799507d61d/tip` → **201**

```json
{
  "command_id": "50ace246-98b5-416f-a87b-5ee2e7d9360d",
  "amount_minor": 2500
}
```

```json
{
  "id": "bc529336-304f-45af-9170-e61971d9ba4b",
  "order_id": "74000544-da22-4223-9811-15799507d61d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T09:24:34.968259Z"
}
```

`GET /api/rider/v1/orders/74000544-da22-4223-9811-15799507d61d/tip` → **200**

```json
{
  "order_id": "74000544-da22-4223-9811-15799507d61d",
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
  "available_until": "2026-10-29T09:24:31.766851Z",
  "open": false,
  "tip": {
    "id": "bc529336-304f-45af-9170-e61971d9ba4b",
    "order_id": "74000544-da22-4223-9811-15799507d61d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T09:24:34.968259Z"
  }
}
```

`GET /api/rider/v1/orders/74000544-da22-4223-9811-15799507d61d/tip` → **200**

```json
{
  "order_id": "74000544-da22-4223-9811-15799507d61d",
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
  "available_until": "2026-10-29T09:24:31.766851Z",
  "open": false,
  "tip": {
    "id": "bc529336-304f-45af-9170-e61971d9ba4b",
    "order_id": "74000544-da22-4223-9811-15799507d61d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T09:24:34.968259Z"
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
      "id": "63ec0396-99c4-44a9-9492-828db92c9045",
      "at": "2026-10-28T09:24:31.98888Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "74000544-da22-4223-9811-15799507d61d",
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
      "id": "734c0cbe-61f1-446f-9931-e6ce9a61ae57",
      "at": "2026-10-28T09:24:36.05179Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "74000544-da22-4223-9811-15799507d61d",
      "counterpart_id": null
    },
    {
      "id": "63ec0396-99c4-44a9-9492-828db92c9045",
      "at": "2026-10-28T09:24:31.98888Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "74000544-da22-4223-9811-15799507d61d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "32c78c3b-c06d-40b9-91fa-67a36973dc19",
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
  "last_heartbeat_at": "2026-10-28T09:24:31.665934Z",
  "last_location_at": "2026-10-28T09:24:31.665934Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/32c78c3b-c06d-40b9-91fa-67a36973dc19/close` → **200**

```json
{
  "command_id": "02bbf34e-68e9-421c-9834-67713816a08f",
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

Done: card order 74000544-da22-4223-9811-15799507d61d.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739272637",
  "device_ref": "sandbox-15822"
}
```

```json
{
  "challenge_id": "a750f107-0b1a-4904-acf1-2f7ce0144792",
  "expires_at": "2026-10-28T09:29:37.147048946Z",
  "resend_available_at": "2026-10-28T09:24:38.147048946Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739272637` → **200**

```json
{
  "phone": "+380739272637",
  "audience": "CLIENT",
  "code": "105298",
  "sent_at": "2026-10-28T09:24:37.149089168Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a750f107-0b1a-4904-acf1-2f7ce0144792",
  "code": "105298",
  "device_ref": "sandbox-15822"
}
```

```json
{
  "session_id": "964be9bb-3ebd-4e59-8158-e0602bb741de",
  "subject": {
    "type": "CLIENT",
    "id": "7ce98845-3794-441a-b8f0-ebe69cbd29f1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Y2U5ODg0NS0zNzk0LTQ0MWEtYjhmMC1lYmU2OWNiZDI5ZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMzc3LCJpYXQiOjE3OTMxNzk0NzcsImp0aSI6ImE0MzRiZWRjLTgwZmYtNDRjNi1iMjAyLTUxYjAwMjBmM2YwYyIsInNpZCI6Ijk2NGJlOWJiLTNlYmQtNGU1OS04MTU4LWUwNjAyYmI3NDFkZSJ9.TRajLopqwoVkNoiwsFK6Xi_XNJmyqoia-5buMCD0_YE",
  "access_expires_at": "2026-10-28T09:39:37.190741517Z",
  "refresh_token": "SDsnQDmFV8WTsP2f9S8quvB1YlOkz2x5aItaNu6yGCU",
  "refresh_expires_at": "2026-11-27T09:24:37.190328292Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "b1da626f-6345-4b0c-8c6f-de764166fc06",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "2f81d8d9-5b2f-49da-9f9d-df6224b55602",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2f81d8d9-5b2f-49da-9f9d-df6224b55602",
    "orderDate": "1793179477",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "6b8cdf26ae5ba092173733e70e98dd61",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2f81d8d9-5b2f-49da-9f9d-df6224b55602",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739272637"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2f81d8d9-5b2f-49da-9f9d-df6224b55602",
  "created_at": "2026-10-28T09:24:37.218946Z",
  "expires_at": "2026-10-28T09:54:37.218946Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/2f81d8d9-5b2f-49da-9f9d-df6224b55602` → **200**

```json
{
  "id": "2f81d8d9-5b2f-49da-9f9d-df6224b55602",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T09:24:37.218946Z",
  "expires_at": "2026-10-28T09:54:37.218946Z",
  "completed_at": "2026-10-28T09:24:37.248Z",
  "masked_pan": "41****4914",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "7ce98845-3794-441a-b8f0-ebe69cbd29f1",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "7ce98845-3794-441a-b8f0-ebe69cbd29f1",
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
      "id": "46db9516-8299-4119-a476-a6eb47f31a5d",
      "at": "2026-10-28T09:24:38.0682Z",
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
  "client_id": "7ce98845-3794-441a-b8f0-ebe69cbd29f1",
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
      "id": "46db9516-8299-4119-a476-a6eb47f31a5d",
      "at": "2026-10-28T09:24:38.0682Z",
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
  "device_ref": "sandbox-4824"
}
```

```json
{
  "challenge_id": "a5bbfdc5-5136-4b7e-994e-f73388ca570b",
  "expires_at": "2026-10-28T09:29:38.349762558Z",
  "resend_available_at": "2026-10-28T09:24:39.349762558Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "670319",
  "sent_at": "2026-10-28T09:24:38.352357911Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5bbfdc5-5136-4b7e-994e-f73388ca570b",
  "code": "670319",
  "device_ref": "sandbox-4824"
}
```

```json
{
  "session_id": "951b4a87-50cf-4673-bd17-2af0902f18fd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDM3OCwiaWF0IjoxNzkzMTc5NDc4LCJqdGkiOiI0YzlhY2Q0NS0zYzQ4LTQ0NzUtYmZlYy1mZGU0NTcyOTUwYTciLCJzaWQiOiI5NTFiNGE4Ny01MGNmLTQ2NzMtYmQxNy0yYWYwOTAyZjE4ZmQifQ.yDb_dNoHzyzizvK7gIFb3jQU2eVSweAcGzsuOpmSaR0",
  "access_expires_at": "2026-10-28T09:39:38.399868436Z",
  "refresh_token": "E0b_gM74XV9RScUta4bMT7g_OlgZ6lbTk6BmtR8PV0I",
  "refresh_expires_at": "2026-11-27T09:24:38.399284002Z",
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
  "command_id": "3ca81cd6-d417-4c57-b4e5-776955343370",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "b1f6da22-d364-4553-a42b-902fe2644c36",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b1f6da22-d364-4553-a42b-902fe2644c36",
    "orderDate": "1793179478",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "a8ca0dd5cf28f37f9a82b0d3b4a165a4",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b1f6da22-d364-4553-a42b-902fe2644c36",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b1f6da22-d364-4553-a42b-902fe2644c36",
  "created_at": "2026-10-28T09:24:38.443883Z",
  "expires_at": "2026-10-28T09:54:38.443883Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/b1f6da22-d364-4553-a42b-902fe2644c36` → **200**

```json
{
  "id": "b1f6da22-d364-4553-a42b-902fe2644c36",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T09:24:38.443883Z",
  "expires_at": "2026-10-28T09:54:38.443883Z",
  "completed_at": "2026-10-28T09:24:38.467816Z",
  "masked_pan": "41****1376",
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
      "id": "ba3442b3-a64c-4e53-8882-581a654751c0",
      "at": "2026-10-28T09:24:39.074867Z",
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
  "command_id": "c25d8dee-7e88-4d5c-8eb0-15a45d517b48",
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
  "correlation_id": "5c2a8f06-0f6f-443d-9983-ac8ac95cdfb0"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673014366",
  "device_ref": "sandbox-29004"
}
```

```json
{
  "challenge_id": "8792c516-ad1c-4652-af9f-a6137af7f93f",
  "expires_at": "2026-10-28T09:29:39.581611887Z",
  "resend_available_at": "2026-10-28T09:24:40.581611887Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673014366` → **200**

```json
{
  "phone": "+380673014366",
  "audience": "CLIENT",
  "code": "334550",
  "sent_at": "2026-10-28T09:24:39.584124125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8792c516-ad1c-4652-af9f-a6137af7f93f",
  "code": "334550",
  "device_ref": "sandbox-29004"
}
```

```json
{
  "session_id": "604282a6-f1b1-44c3-a7c8-0a970a9596cd",
  "subject": {
    "type": "CLIENT",
    "id": "3c9531a0-204a-4e5c-9cf0-e3fd08aca7ad"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzk1MzFhMC0yMDRhLTRlNWMtOWNmMC1lM2ZkMDhhY2E3YWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMzc5LCJpYXQiOjE3OTMxNzk0NzksImp0aSI6IjIxMGE1NGFkLTRjMjgtNGNmZC05YTU0LTU1ODc0N2E0YjMwZSIsInNpZCI6IjYwNDI4MmE2LWYxYjEtNDRjMy1hN2M4LTBhOTcwYTk1OTZjZCJ9.Ny_Fq8nwgY94M8x0MVXzd_txQAU2nOhKEdrbjrd1YnM",
  "access_expires_at": "2026-10-28T09:39:39.627913505Z",
  "refresh_token": "rwbK3NZdsyAN-9btfyE9-FdvqrJm4nGidEzZi1wzKRM",
  "refresh_expires_at": "2026-11-27T09:24:39.627245744Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3c9531a0-204a-4e5c-9cf0-e3fd08aca7ad",
  "session_id": "604282a6-f1b1-44c3-a7c8-0a970a9596cd",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "412cead3-ce39-46e3-80d1-4ca11a7daa1e",
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
  "id": "c5f798fa-d3ae-4fe7-a23c-a3b353c23dd1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:29:39.677251Z",
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
  "challenge_id": "61b302fd-b24f-4f44-9d3c-ef72c2486646",
  "expires_at": "2026-10-28T09:29:41.709447306Z",
  "resend_available_at": "2026-10-28T09:24:42.709447306Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673014366` → **200**

```json
{
  "phone": "+380673014366",
  "audience": "CLIENT",
  "code": "225495",
  "sent_at": "2026-10-28T09:24:41.711775842Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "805ddd20-da77-4f31-a991-fdcf443c2952",
  "challenge_id": "61b302fd-b24f-4f44-9d3c-ef72c2486646",
  "otp_code": "225495"
}
```

```json
{
  "client_id": "3c9531a0-204a-4e5c-9cf0-e3fd08aca7ad",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T09:24:41.768992754Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "845c2544-771b-4f34-9e8a-bc7048412605",
  "quote_id": "c5f798fa-d3ae-4fe7-a23c-a3b353c23dd1",
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
  "correlation_id": "1a75b2f5-7fe5-471f-b7eb-7e2133a87a9f"
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
  "session_id": "80f7bd4c-b708-4325-8930-9b9a8b09f4d8",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzODIsImlhdCI6MTc5MzE3OTQ4MiwianRpIjoiMzgxYWU1MmMtMzdjNC00ZjViLTliMDQtNmZjZmYzYzg4NTVlIiwic2lkIjoiODBmN2JkNGMtYjcwOC00MzI1LTg5MzAtOWI5YThiMDlmNGQ4In0.5X2NnkJCoTwUKBdoSbyNwDodImx_6ERPZOqxpOEYMCY",
  "access_expires_at": "2026-10-28T09:39:42.098928923Z",
  "refresh_token": "L08lDAOq160rz3TTpqCa3T8UTSutNXC_3gK3w6hVHpg",
  "refresh_expires_at": "2026-10-28T21:24:42.098287271Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "3c9531a0-204a-4e5c-9cf0-e3fd08aca7ad",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T09:24:41.768993Z",
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

`POST /api/admin/v1/client-deletions/3c9531a0-204a-4e5c-9cf0-e3fd08aca7ad/complete` → **200**

```json
{
  "command_id": "dbe1d566-0b49-4461-91b0-a7faa6a03aa7",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "3c9531a0-204a-4e5c-9cf0-e3fd08aca7ad",
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
  "correlation_id": "bcb619fb-dc8d-41c4-afa8-02298f2e6938"
}
```

Done: client 3c9531a0-204a-4e5c-9cf0-e3fd08aca7ad anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662384405",
  "device_ref": "sandbox-24520"
}
```

```json
{
  "challenge_id": "a953df9d-5975-4d47-9a20-7dfd32e9949f",
  "expires_at": "2026-10-28T09:29:42.215018748Z",
  "resend_available_at": "2026-10-28T09:24:43.215018748Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662384405` → **200**

```json
{
  "phone": "+380662384405",
  "audience": "CLIENT",
  "code": "687847",
  "sent_at": "2026-10-28T09:24:42.216963958Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a953df9d-5975-4d47-9a20-7dfd32e9949f",
  "code": "687847",
  "device_ref": "sandbox-24520"
}
```

```json
{
  "session_id": "ea28d651-b43b-4dbb-8fbe-3593ef4421db",
  "subject": {
    "type": "CLIENT",
    "id": "fd3f1d44-c933-417e-8fdd-b966607081be"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDNmMWQ0NC1jOTMzLTQxN2UtOGZkZC1iOTY2NjA3MDgxYmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMzgyLCJpYXQiOjE3OTMxNzk0ODIsImp0aSI6IjQwMDBkOTdlLTY1Y2ItNDJlZC04MTI1LWE2MTQwYjMwMzVjMSIsInNpZCI6ImVhMjhkNjUxLWI0M2ItNGRiYi04ZmJlLTM1OTNlZjQ0MjFkYiJ9.EbQPwT7S7sq1Bjt43V5mIaC0_XvZdeHH5YoXO22PFPg",
  "access_expires_at": "2026-10-28T09:39:42.261056199Z",
  "refresh_token": "Lbyg42fyR_DCQxa6ZkN2DFTXlq_s4gjJz_vrqopCJT8",
  "refresh_expires_at": "2026-11-27T09:24:42.260645179Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fd3f1d44-c933-417e-8fdd-b966607081be",
  "session_id": "ea28d651-b43b-4dbb-8fbe-3593ef4421db",
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
  "session_id": "e0e4568d-ed0e-4b2c-9baa-cda149a24e84",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzODIsImlhdCI6MTc5MzE3OTQ4MiwianRpIjoiNWU5MDg2ZjUtYWMwNS00NTAxLWFjMTMtMmU1YjNiYTJmYzRlIiwic2lkIjoiZTBlNDU2OGQtZWQwZS00YjJjLTliYWEtY2RhMTQ5YTI0ZTg0In0.YaCQATDVvkB76s0ZB9ghMafZaA5h_IcyZWzWEyK-fk4",
  "access_expires_at": "2026-10-28T09:39:42.582603623Z",
  "refresh_token": "ZXAmKLLgL-QOVIGE9Dbij83G6ibGWa5kdTRqB_h2gH8",
  "refresh_expires_at": "2026-10-28T21:24:42.582082769Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2384405&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "fd3f1d44-c933-417e-8fdd-b966607081be",
      "phone": "+380662384405",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T09:24:42.258933Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/fd3f1d44-c933-417e-8fdd-b966607081be` → **200**

```json
{
  "client": {
    "id": "fd3f1d44-c933-417e-8fdd-b966607081be",
    "phone": "+380662384405",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T09:24:42.258933Z",
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

`POST /api/admin/v1/clients/fd3f1d44-c933-417e-8fdd-b966607081be/block` → **400**

```json
{
  "command_id": "28372ba8-e112-4d48-9004-7194bae8f082",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/fd3f1d44-c933-417e-8fdd-b966607081be/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7bfd75e9-58b4-40cc-a9d2-5299c806f197",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/fd3f1d44-c933-417e-8fdd-b966607081be/block` → **200**

```json
{
  "command_id": "c17eba5e-d058-4e54-8e02-f088fcf4cd1f",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "fd3f1d44-c933-417e-8fdd-b966607081be",
  "phone": "+380662384405",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T09:24:42.258933Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T09:24:42.718556Z",
    "by": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
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
  "correlation_id": "7d00956a-5298-4925-a819-ee5dcfa366d9"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662384405",
  "device_ref": "sandbox-6008"
}
```

```json
{
  "challenge_id": "0a3e2c75-e2a0-4499-8be6-e2e74a84bbf1",
  "expires_at": "2026-10-28T09:29:44.76748438Z",
  "resend_available_at": "2026-10-28T09:24:45.76748438Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662384405` → **200**

```json
{
  "phone": "+380662384405",
  "audience": "CLIENT",
  "code": "779949",
  "sent_at": "2026-10-28T09:24:44.770079922Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "0a3e2c75-e2a0-4499-8be6-e2e74a84bbf1",
  "code": "779949",
  "device_ref": "sandbox-6008"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "dc746cbf-97ad-4f3d-83fc-ff8baf8f3f05"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/fd3f1d44-c933-417e-8fdd-b966607081be` → **200**

```json
{
  "client": {
    "id": "fd3f1d44-c933-417e-8fdd-b966607081be",
    "phone": "+380662384405",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T09:24:42.258933Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T09:24:42.718556Z",
      "by": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
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

`POST /api/admin/v1/clients/fd3f1d44-c933-417e-8fdd-b966607081be/unblock` → **200**

```json
{
  "command_id": "3efb442d-ea69-43de-b36f-d759f3903725",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "fd3f1d44-c933-417e-8fdd-b966607081be",
  "phone": "+380662384405",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T09:24:42.258933Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662384405",
  "device_ref": "sandbox-13705"
}
```

```json
{
  "challenge_id": "95a59866-ab8e-4d42-b086-1446d5835019",
  "expires_at": "2026-10-28T09:29:46.891569402Z",
  "resend_available_at": "2026-10-28T09:24:47.891569402Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662384405` → **200**

```json
{
  "phone": "+380662384405",
  "audience": "CLIENT",
  "code": "581604",
  "sent_at": "2026-10-28T09:24:46.893642465Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95a59866-ab8e-4d42-b086-1446d5835019",
  "code": "581604",
  "device_ref": "sandbox-13705"
}
```

```json
{
  "session_id": "cc5de5cf-1949-415f-9e3a-fe3e7f91ca51",
  "subject": {
    "type": "CLIENT",
    "id": "fd3f1d44-c933-417e-8fdd-b966607081be"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDNmMWQ0NC1jOTMzLTQxN2UtOGZkZC1iOTY2NjA3MDgxYmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMzg2LCJpYXQiOjE3OTMxNzk0ODYsImp0aSI6IjgyZWRmM2Q5LTg4YzYtNDFlZS04MzM0LTRiZTkyOTA0YjZhYyIsInNpZCI6ImNjNWRlNWNmLTE5NDktNDE1Zi05ZTNhLWZlM2U3ZjkxY2E1MSJ9.o0Pnf0rJkvoBMpXFpCumyHXEi5GOS_vJ8yL7vBpJqDs",
  "access_expires_at": "2026-10-28T09:39:46.939838254Z",
  "refresh_token": "XjNlZlm66b1VCPgHckQRL1OTQWPsOpmPSYu4JKIv1AY",
  "refresh_expires_at": "2026-11-27T09:24:46.939251349Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fd3f1d44-c933-417e-8fdd-b966607081be",
  "session_id": "cc5de5cf-1949-415f-9e3a-fe3e7f91ca51",
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
  "phone": "+380663106687",
  "device_ref": "sandbox-19617"
}
```

```json
{
  "challenge_id": "6bbb0902-6ea5-4fc5-ac0a-dec01a61ca07",
  "expires_at": "2026-10-28T09:29:46.988534223Z",
  "resend_available_at": "2026-10-28T09:24:47.988534223Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663106687` → **200**

```json
{
  "phone": "+380663106687",
  "audience": "CLIENT",
  "code": "050906",
  "sent_at": "2026-10-28T09:24:46.990391755Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6bbb0902-6ea5-4fc5-ac0a-dec01a61ca07",
  "code": "050906",
  "device_ref": "sandbox-19617"
}
```

```json
{
  "session_id": "1d834e96-799d-424f-957f-6f48b3e84f6f",
  "subject": {
    "type": "CLIENT",
    "id": "3fd248d1-2900-42d6-b61b-0247ffd671dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZmQyNDhkMS0yOTAwLTQyZDYtYjYxYi0wMjQ3ZmZkNjcxZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMzg3LCJpYXQiOjE3OTMxNzk0ODcsImp0aSI6IjI2ZWQxYzA1LTU4MWUtNGEwMi1iMTkxLTFjNmFhOGM5ODEzNyIsInNpZCI6IjFkODM0ZTk2LTc5OWQtNDI0Zi05NTdmLTZmNDhiM2U4NGY2ZiJ9.Kwo8LPZ2MaSNso55rq3KRxInZz6DBhAflBUNzx6XhPs",
  "access_expires_at": "2026-10-28T09:39:47.032541145Z",
  "refresh_token": "f8_OA6ijz_k7xNIXrcNPZKF0lOLrj5ex2ZyyfhlJxR4",
  "refresh_expires_at": "2026-11-27T09:24:47.032038393Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "97a9b64a-4038-4719-81ce-5afe9ff520e7",
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
  "id": "6a61b876-aaec-4568-860b-eb22e4d44fb2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:29:47.059595Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 8c3a2310-a9be-45b3-84f2-5c9911d39e67) → **201**

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
  "session_id": "30d67f90-b309-4f6b-a16f-7d40c6fef1fb",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzODcsImlhdCI6MTc5MzE3OTQ4NywianRpIjoiMDk2MzU1NGQtZGYxNS00MzE4LTllZDQtNmQ3YTgwZjI1ZTg3Iiwic2lkIjoiMzBkNjdmOTAtYjMwOS00ZjZiLWExNmYtN2Q0MGM2ZmVmMWZiIn0.DeZiDfgj48KRo_9RPD_qwuy9bDwnrsfrYP5xu2Q-DBk",
  "access_expires_at": "2026-10-28T09:39:47.399240124Z",
  "refresh_token": "vnm4bu74wxyuPkOdzfN9wTjZMZaUTwNkGyPMO1WCgwc",
  "refresh_expires_at": "2026-10-28T21:24:47.398728411Z",
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
  "session_id": "174f0d55-794a-4a2b-9805-26d6354247ab",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzODcsImlhdCI6MTc5MzE3OTQ4NywianRpIjoiYzhiNGRiYzctYjg2OC00Y2YxLTk5OWUtODZhMTg5YTNmN2Y3Iiwic2lkIjoiMTc0ZjBkNTUtNzk0YS00YTJiLTk4MDUtMjZkNjM1NDI0N2FiIn0.fcZrmORMdusQMRD-MoFcKRkw9_2rKknub1Y36i_1-fk",
  "access_expires_at": "2026-10-28T09:39:47.707518923Z",
  "refresh_token": "exc7IGPIsY3eQ-QoYQK3_ThZuZnmsFw_hRcXN3JfqlA",
  "refresh_expires_at": "2026-10-28T21:24:47.706986416Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2560412a-5104-4fa8-8c13-872d8bfedd9e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:24:47.088264Z",
      "actor": {
        "type": "CLIENT",
        "id": "3fd248d1-2900-42d6-b61b-0247ffd671dc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2560412a-5104-4fa8-8c13-872d8bfedd9e",
        "quote_id": "6a61b876-aaec-4568-860b-eb22e4d44fb2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "8c3a2310-a9be-45b3-84f2-5c9911d39e67"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:24:47.090071Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2560412a-5104-4fa8-8c13-872d8bfedd9e",
        "attempt_id": "1860a902-e0f5-47eb-a20f-bf44040e8c49",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8c3a2310-a9be-45b3-84f2-5c9911d39e67"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T09:24:47.099161Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2560412a-5104-4fa8-8c13-872d8bfedd9e",
        "attempt_id": "1860a902-e0f5-47eb-a20f-bf44040e8c49"
      },
      "correlation_id": "8c3a2310-a9be-45b3-84f2-5c9911d39e67"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "1860a902-e0f5-47eb-a20f-bf44040e8c49",
        "generation": 1,
        "started_at": "2026-10-28T09:24:47.089032Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T09:24:47.099161Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T09:24:47.091095Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/8c3a2310-a9be-45b3-84f2-5c9911d39e67` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "2560412a-5104-4fa8-8c13-872d8bfedd9e:0",
      "order_id": "2560412a-5104-4fa8-8c13-872d8bfedd9e",
      "at": "2026-10-28T09:24:47.088264Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "2560412a-5104-4fa8-8c13-872d8bfedd9e:1",
      "order_id": "2560412a-5104-4fa8-8c13-872d8bfedd9e",
      "at": "2026-10-28T09:24:47.090071Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "2560412a-5104-4fa8-8c13-872d8bfedd9e:2",
      "order_id": "2560412a-5104-4fa8-8c13-872d8bfedd9e",
      "at": "2026-10-28T09:24:47.099161Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/e8f356e3-c3b6-48c7-8d3e-75c8a7007085` → **200**

```json
{
  "found": []
}
```

Done: request 8c3a2310-a9be-45b3-84f2-5c9911d39e67 — order 2560412a-5104-4fa8-8c13-872d8bfedd9e found by its id.

`GET /api/rider/v1/orders/2560412a-5104-4fa8-8c13-872d8bfedd9e` → **200**

```json
{
  "id": "2560412a-5104-4fa8-8c13-872d8bfedd9e",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3fd248d1-2900-42d6-b61b-0247ffd671dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:24:47.087607Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/2560412a-5104-4fa8-8c13-872d8bfedd9e/cancel` → **200**

```json
{
  "command_id": "2f257374-2d51-4e16-b624-a5fd85d1674a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2560412a-5104-4fa8-8c13-872d8bfedd9e",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3fd248d1-2900-42d6-b61b-0247ffd671dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:24:47.087607Z",
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
  "discount_minor": 0
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637589165",
  "device_ref": "sandbox-19071"
}
```

```json
{
  "challenge_id": "7f31982a-14ff-43fc-afbe-bc7a1fa01b41",
  "expires_at": "2026-10-28T09:29:47.871359113Z",
  "resend_available_at": "2026-10-28T09:24:48.871359113Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637589165` → **200**

```json
{
  "phone": "+380637589165",
  "audience": "CLIENT",
  "code": "786364",
  "sent_at": "2026-10-28T09:24:47.873460206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f31982a-14ff-43fc-afbe-bc7a1fa01b41",
  "code": "786364",
  "device_ref": "sandbox-19071"
}
```

```json
{
  "session_id": "223cae49-bb3a-495d-ae58-767c76ec70ee",
  "subject": {
    "type": "CLIENT",
    "id": "fb3567b1-9f13-45c4-bd35-d21e5de15626"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjM1NjdiMS05ZjEzLTQ1YzQtYmQzNS1kMjFlNWRlMTU2MjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMzg3LCJpYXQiOjE3OTMxNzk0ODcsImp0aSI6ImJlZjc5ZTkxLWQyYmEtNGE1NC1hZjc0LWM4MDE0YzJiMmRiNyIsInNpZCI6IjIyM2NhZTQ5LWJiM2EtNDk1ZC1hZTU4LTc2N2M3NmVjNzBlZSJ9.3iMy2aRLLjdW544n3fra6o_3eM9_ebGh4Ma-GL4eYX0",
  "access_expires_at": "2026-10-28T09:39:47.918940245Z",
  "refresh_token": "gStKT48YrEzO7e8xNvrMJ3OOGnPNkAL0ndVCAE0gQFc",
  "refresh_expires_at": "2026-11-27T09:24:47.918201525Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "0d83ddaa-ba02-40ab-8226-ffbe0eaae258",
  "expires_at": "2026-10-28T09:29:49.944739102Z",
  "resend_available_at": "2026-10-28T09:24:50.944739102Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637589165` → **200**

```json
{
  "phone": "+380637589165",
  "audience": "CLIENT",
  "code": "218790",
  "sent_at": "2026-10-28T09:24:49.94673444Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "154de1ab-f2b5-46a8-9f07-6e4f7ebd6721",
  "challenge_id": "0d83ddaa-ba02-40ab-8226-ffbe0eaae258",
  "otp_code": "218790"
}
```

```json
{
  "id": "9c9d0645-993c-457e-bca6-2c1a7b071e99",
  "state": "PENDING",
  "created_at": "2026-10-28T09:24:49.998094Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/9c9d0645-993c-457e-bca6-2c1a7b071e99` → **200**

```json
{
  "id": "9c9d0645-993c-457e-bca6-2c1a7b071e99",
  "state": "PENDING",
  "created_at": "2026-10-28T09:24:49.998094Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9c9d0645-993c-457e-bca6-2c1a7b071e99` → **200**

```json
{
  "id": "9c9d0645-993c-457e-bca6-2c1a7b071e99",
  "state": "PENDING",
  "created_at": "2026-10-28T09:24:49.998094Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9c9d0645-993c-457e-bca6-2c1a7b071e99` → **200**

```json
{
  "id": "9c9d0645-993c-457e-bca6-2c1a7b071e99",
  "state": "PENDING",
  "created_at": "2026-10-28T09:24:49.998094Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9c9d0645-993c-457e-bca6-2c1a7b071e99` → **200**

```json
{
  "id": "9c9d0645-993c-457e-bca6-2c1a7b071e99",
  "state": "PENDING",
  "created_at": "2026-10-28T09:24:49.998094Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9c9d0645-993c-457e-bca6-2c1a7b071e99` → **200**

```json
{
  "id": "9c9d0645-993c-457e-bca6-2c1a7b071e99",
  "state": "PENDING",
  "created_at": "2026-10-28T09:24:49.998094Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9c9d0645-993c-457e-bca6-2c1a7b071e99` → **200**

```json
{
  "id": "9c9d0645-993c-457e-bca6-2c1a7b071e99",
  "state": "PENDING",
  "created_at": "2026-10-28T09:24:49.998094Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9c9d0645-993c-457e-bca6-2c1a7b071e99` → **200**

```json
{
  "id": "9c9d0645-993c-457e-bca6-2c1a7b071e99",
  "state": "READY",
  "created_at": "2026-10-28T09:24:49.998094Z",
  "ready_at": "2026-10-28T09:24:55.6694Z",
  "expires_at": "2026-11-04T09:24:55.6694Z",
  "size_bytes": 1028
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/9c9d0645-993c-457e-bca6-2c1a7b071e99/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631995629",
  "device_ref": "sandbox-6840"
}
```

```json
{
  "challenge_id": "0a127814-87b9-4447-a1b2-15d8d84e49be",
  "expires_at": "2026-10-28T09:29:56.20549941Z",
  "resend_available_at": "2026-10-28T09:24:57.20549941Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631995629` → **200**

```json
{
  "phone": "+380631995629",
  "audience": "CLIENT",
  "code": "039296",
  "sent_at": "2026-10-28T09:24:56.20753982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a127814-87b9-4447-a1b2-15d8d84e49be",
  "code": "039296",
  "device_ref": "sandbox-6840"
}
```

```json
{
  "session_id": "1cda0a26-78f4-4bd0-99e4-24f3dc1aee11",
  "subject": {
    "type": "CLIENT",
    "id": "24630326-97bd-461c-bfee-7fd301f3bf51"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDYzMDMyNi05N2JkLTQ2MWMtYmZlZS03ZmQzMDFmM2JmNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMzk2LCJpYXQiOjE3OTMxNzk0OTYsImp0aSI6IjRlMGM3MjFkLTBiNGMtNDU2Yi05OTdkLWJkNmUyY2U4NmVmYiIsInNpZCI6IjFjZGEwYTI2LTc4ZjQtNGJkMC05OWU0LTI0ZjNkYzFhZWUxMSJ9.nJVulRKlnFAcApT4WfrHzkSTfEwC0LCPfyvjEY0YcTY",
  "access_expires_at": "2026-10-28T09:39:56.250528283Z",
  "refresh_token": "eIlcyQaSjX_Y_9PI4555dnpuTf695Vj9gQUuAkW9ff0",
  "refresh_expires_at": "2026-11-27T09:24:56.249995701Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/9c9d0645-993c-457e-bca6-2c1a7b071e99/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/9c9d0645-993c-457e-bca6-2c1a7b071e99/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "24c2dac5-143c-4955-a047-4ff910db2b79"
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
  "session_id": "b3c963d8-91a6-4270-b3e6-62a5dd4143a9",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzOTYsImlhdCI6MTc5MzE3OTQ5NiwianRpIjoiNTJiMDhlYzQtODA2Mi00ZWYzLWI4YzgtZmY0MGU1Y2U1N2NkIiwic2lkIjoiYjNjOTYzZDgtOTFhNi00MjcwLWIzZTYtNjJhNWRkNDE0M2E5In0.lWU5EjVIHNkd4lgiJ4uqbrQToRZ2HDt6kgYfX_9xRso",
  "access_expires_at": "2026-10-28T09:39:56.578325586Z",
  "refresh_token": "hO0H0KGNiSitQ-KwZ_mwE9kblw0sb8GmTcqmQVVdj4U",
  "refresh_expires_at": "2026-10-28T21:24:56.577910036Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fb3567b1-9f13-45c4-bd35-d21e5de15626",
  "session_id": "223cae49-bb3a-495d-ae58-767c76ec70ee",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/fb3567b1-9f13-45c4-bd35-d21e5de15626/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "9c9d0645-993c-457e-bca6-2c1a7b071e99",
      "state": "READY",
      "created_at": "2026-10-28T09:24:49.998094Z",
      "ready_at": "2026-10-28T09:24:55.6694Z",
      "expires_at": "2026-11-04T09:24:55.6694Z",
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
  "device_ref": "sandbox-31505"
}
```

```json
{
  "challenge_id": "dddde442-39b4-43aa-b691-84686e6f9cbc",
  "expires_at": "2026-10-28T09:29:56.653231865Z",
  "resend_available_at": "2026-10-28T09:24:57.653231865Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "099118",
  "sent_at": "2026-10-28T09:24:56.655610654Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dddde442-39b4-43aa-b691-84686e6f9cbc",
  "code": "099118",
  "device_ref": "sandbox-31505"
}
```

```json
{
  "session_id": "23352c00-f0e9-4a0a-a649-c199a706e229",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDM5NiwiaWF0IjoxNzkzMTc5NDk2LCJqdGkiOiJlNTgxMmE3YS1lNjBlLTQwNmYtODM0NS04NDVlYTViNjkyNmYiLCJzaWQiOiIyMzM1MmMwMC1mMGU5LTRhMGEtYTY0OS1jMTk5YTcwNmUyMjkifQ.0s7XKYiit_sIp4w6qsW1d3smLK1714jGH0bXfhF7pDA",
  "access_expires_at": "2026-10-28T09:39:56.701372643Z",
  "refresh_token": "wDMaOIe798a-0p324s5AFXCTWW1i8g2ODz9xZarBOVk",
  "refresh_expires_at": "2026-11-27T09:24:56.700808929Z",
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
  "device_ref": "sandbox-6797"
}
```

```json
{
  "challenge_id": "410912c1-94b0-416e-9c7b-abbf3fdd37f8",
  "expires_at": "2026-10-28T09:29:56.738510157Z",
  "resend_available_at": "2026-10-28T09:24:57.738510157Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "586609",
  "sent_at": "2026-10-28T09:24:56.740300708Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "410912c1-94b0-416e-9c7b-abbf3fdd37f8",
  "code": "586609",
  "device_ref": "sandbox-6797"
}
```

```json
{
  "session_id": "d921a04e-a90a-4975-a6c7-fbe9fec297d3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDM5NiwiaWF0IjoxNzkzMTc5NDk2LCJqdGkiOiI5Mzc3ZTdlYy0yYmM5LTRjMzItYTMwNy03ZTQ4Njc4NWU3ODEiLCJzaWQiOiJkOTIxYTA0ZS1hOTBhLTQ5NzUtYTZjNy1mYmU5ZmVjMjk3ZDMifQ.Et5g0V1ScNNY1q5KgAWWmKaNgvMWWCxvok9IJDUC9bU",
  "access_expires_at": "2026-10-28T09:39:56.781647698Z",
  "refresh_token": "znpcSQN3jprTGNmtnty0TzPMKaUvLQOwgsNGnGgJq9s",
  "refresh_expires_at": "2026-11-27T09:24:56.781259565Z",
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
  "command_id": "927c18e0-da47-46da-93f9-b83624ec6bbe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:24:56Z",
    "sequence": 1793179496821
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8be692e5-3efb-4ac2-acb0-e98ebb72182a",
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
  "last_heartbeat_at": "2026-10-28T09:24:56.836229Z",
  "last_location_at": "2026-10-28T09:24:56.836229Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-17874"
}
```

```json
{
  "challenge_id": "af0b5914-d796-4aa9-ba54-ebeac0af36ca",
  "expires_at": "2026-10-28T09:29:56.858724971Z",
  "resend_available_at": "2026-10-28T09:24:57.858724971Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "766225",
  "sent_at": "2026-10-28T09:24:56.860509676Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af0b5914-d796-4aa9-ba54-ebeac0af36ca",
  "code": "766225",
  "device_ref": "sandbox-17874"
}
```

```json
{
  "session_id": "be425d85-281e-45ed-82ce-20d3c7cf2409",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDM5NiwiaWF0IjoxNzkzMTc5NDk2LCJqdGkiOiIwODIxYzNkYy0zMTExLTRiNmItODI2ZS03MjNmNDBhOGFkODgiLCJzaWQiOiJiZTQyNWQ4NS0yODFlLTQ1ZWQtODJjZS0yMGQzYzdjZjI0MDkifQ.cC3onMoJ456-Ku76P2U0d-H1lqBMhBHcJ1n0Ym9ZnhY",
  "access_expires_at": "2026-10-28T09:39:56.904105178Z",
  "refresh_token": "EPjldg1bAfpiLhcdoFgArgTe-PDCbrapB8p1vNGQwH8",
  "refresh_expires_at": "2026-11-27T09:24:56.903431816Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4465403d-0ecf-46b1-ae5d-d823f33afdf0",
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
  "last_heartbeat_at": "2026-10-28T09:24:28.546644Z",
  "last_location_at": "2026-10-28T09:24:28.546644Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4465403d-0ecf-46b1-ae5d-d823f33afdf0/handover` → **200**

```json
{
  "command_id": "45709b75-251b-429e-a94b-83fac84a045e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4465403d-0ecf-46b1-ae5d-d823f33afdf0",
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
  "last_heartbeat_at": "2026-10-28T09:24:28.546644Z",
  "last_location_at": "2026-10-28T09:24:28.546644Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4465403d-0ecf-46b1-ae5d-d823f33afdf0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:24:56Z",
    "sequence": 1793179496972
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4465403d-0ecf-46b1-ae5d-d823f33afdf0",
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
  "last_heartbeat_at": "2026-10-28T09:24:56.987129Z",
  "last_location_at": "2026-10-28T09:24:56.987129Z",
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
  "session_id": "4dcbd905-a8c8-42f0-b6d8-15f6cafcb330",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzOTcsImlhdCI6MTc5MzE3OTQ5NywianRpIjoiYWYwZjZiZTMtOWJmMS00ZjY4LTkwMTMtOTc2OWQwOGQxNWNkIiwic2lkIjoiNGRjYmQ5MDUtYThjOC00MmYwLWI2ZDgtMTVmNmNhZmNiMzMwIn0.8jEIdmLtdPBTQ3k8lHrqetZjCjDrQLtDDNPKQanQDpA",
  "access_expires_at": "2026-10-28T09:39:57.287082111Z",
  "refresh_token": "ekWNS-YMEDQDd78RkJIGTaoOWQx8_ssRYRZv1LeWeuw",
  "refresh_expires_at": "2026-10-28T21:24:57.286355534Z",
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
  "session_id": "6a9f1b94-abb9-4b4b-a24c-7d6da34ce038",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAzOTcsImlhdCI6MTc5MzE3OTQ5NywianRpIjoiOGFlN2E4NTYtNTBlYy00N2U1LWE2MGItOGU1OTQ2NTY2MzI0Iiwic2lkIjoiNmE5ZjFiOTQtYWJiOS00YjRiLWEyNGMtN2Q2ZGEzNGNlMDM4In0.dgI2Yi3zmx2mO6C5RkXCd8a1C-c8mW77yL1Wgurtvdc",
  "access_expires_at": "2026-10-28T09:39:57.601549543Z",
  "refresh_token": "IQrcCyD7fuZn29gYcnEdP0lyjY0PcUIoa4G8O7jzIlw",
  "refresh_expires_at": "2026-10-28T21:24:57.601041735Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380682714205",
  "device_ref": "sandbox-23289"
}
```

```json
{
  "challenge_id": "c0aa6b4a-8d6a-44c8-bf49-d69b8e07cebb",
  "expires_at": "2026-10-28T09:29:57.624859483Z",
  "resend_available_at": "2026-10-28T09:24:58.624859483Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380682714205` → **200**

```json
{
  "phone": "+380682714205",
  "audience": "CLIENT",
  "code": "800347",
  "sent_at": "2026-10-28T09:24:57.626801365Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0aa6b4a-8d6a-44c8-bf49-d69b8e07cebb",
  "code": "800347",
  "device_ref": "sandbox-23289"
}
```

```json
{
  "session_id": "40a99d13-79a9-43c5-b5d0-c4e4ce383204",
  "subject": {
    "type": "CLIENT",
    "id": "28aa8974-bc8a-4e29-8560-31d8486472bf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOGFhODk3NC1iYzhhLTRlMjktODU2MC0zMWQ4NDg2NDcyYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMzk3LCJpYXQiOjE3OTMxNzk0OTcsImp0aSI6IjhlOWY3N2YwLThhYjgtNGI4OS05YjYxLWI2OWI3MDAyMGNjOCIsInNpZCI6IjQwYTk5ZDEzLTc5YTktNDNjNS1iNWQwLWM0ZTRjZTM4MzIwNCJ9.mI2ENj8oKA4lgXSVJVTVpwr3e3RmxplXGuDdOYMWizQ",
  "access_expires_at": "2026-10-28T09:39:57.672618877Z",
  "refresh_token": "IiTLGTwrbUO5f9_p3PJp6Nho9jUjrcaZz2PPp7cKRGk",
  "refresh_expires_at": "2026-11-27T09:24:57.672008551Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b62f246b-c36d-4c04-9381-1a48705b64c5",
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
  "id": "68c028a5-63a4-4a5b-a104-a9b4d9f6ccea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:29:57.701498Z",
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
  "command_id": "3c991796-e00b-4744-9de7-40b6c4db8790",
  "quote_id": "68c028a5-63a4-4a5b-a104-a9b4d9f6ccea",
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
  "id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "28aa8974-bc8a-4e29-8560-31d8486472bf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:24:57.733058Z",
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
    "id": "e20580ce-1147-4518-8290-80019a37391a",
    "order_id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8",
    "expires_at": "2026-10-28T09:25:12.736365Z",
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

`POST /api/driver/v1/offers/e20580ce-1147-4518-8290-80019a37391a/reject` → **204**

```json
{
  "command_id": "4333e424-27f4-42aa-a127-220de5b148c8"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ad1f248d-f036-4df9-ab89-db038fca2117",
    "order_id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8",
    "expires_at": "2026-10-28T09:25:12.790545Z",
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

`POST /api/driver/v1/offers/ad1f248d-f036-4df9-ab89-db038fca2117/accept` → **200**

```json
{
  "command_id": "0b623ad8-6e3c-4dc8-9b69-43ba493add61"
}
```

```json
{
  "id": "70d29f1c-c0e7-4338-9641-256ee27419d4",
  "order_id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3ee4315e-3e09-4417-ba79-0315c8292802",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/eec74c84-1a1f-47b6-baa7-a2dce00fd1d8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:24:57.733592Z",
      "actor": {
        "type": "CLIENT",
        "id": "28aa8974-bc8a-4e29-8560-31d8486472bf",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8",
        "quote_id": "68c028a5-63a4-4a5b-a104-a9b4d9f6ccea",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c69e9e24-ea4d-4be4-8694-8456eda222c6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:24:57.735334Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8",
        "attempt_id": "c54d3e7a-1b3a-4697-ad9d-064ec4517cd3",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c69e9e24-ea4d-4be4-8694-8456eda222c6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:24:57.741856Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e20580ce-1147-4518-8290-80019a37391a",
        "order_id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "c69e9e24-ea4d-4be4-8694-8456eda222c6"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T09:24:57.789742Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e20580ce-1147-4518-8290-80019a37391a",
        "order_id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8"
      },
      "correlation_id": "8c7e1d68-87aa-41b4-8a49-73da208abec6"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order eec74c84-1a1f-47b6-baa7-a2dce00fd1d8 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/eec74c84-1a1f-47b6-baa7-a2dce00fd1d8` → **200**

```json
{
  "id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "28aa8974-bc8a-4e29-8560-31d8486472bf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "70d29f1c-c0e7-4338-9641-256ee27419d4",
    "order_id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3ee4315e-3e09-4417-ba79-0315c8292802",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T09:24:57.733058Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/eec74c84-1a1f-47b6-baa7-a2dce00fd1d8/cancel` → **200**

```json
{
  "command_id": "41c9ceff-9041-42aa-9b24-82596080cc93",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "28aa8974-bc8a-4e29-8560-31d8486472bf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "70d29f1c-c0e7-4338-9641-256ee27419d4",
    "order_id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3ee4315e-3e09-4417-ba79-0315c8292802",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:24:57.733058Z",
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
  "session_id": "8be692e5-3efb-4ac2-acb0-e98ebb72182a",
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
  "last_heartbeat_at": "2026-10-28T09:24:56.836229Z",
  "last_location_at": "2026-10-28T09:24:56.836229Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8be692e5-3efb-4ac2-acb0-e98ebb72182a/close` → **200**

```json
{
  "command_id": "e87a34f4-e1da-478a-b3fd-0e06433ec25e",
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
  "session_id": "4465403d-0ecf-46b1-ae5d-d823f33afdf0",
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
  "last_heartbeat_at": "2026-10-28T09:24:56.987129Z",
  "last_location_at": "2026-10-28T09:24:56.987129Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4465403d-0ecf-46b1-ae5d-d823f33afdf0/close` → **200**

```json
{
  "command_id": "2b5ec800-4bfe-45c1-a01d-9f52adc9aa34",
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
  "device_ref": "sandbox-23748"
}
```

```json
{
  "challenge_id": "043b4a37-2da7-43db-b2be-584d615f8038",
  "expires_at": "2026-10-28T09:29:58.095246112Z",
  "resend_available_at": "2026-10-28T09:24:59.095246112Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "652170",
  "sent_at": "2026-10-28T09:24:58.096999922Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "043b4a37-2da7-43db-b2be-584d615f8038",
  "code": "652170",
  "device_ref": "sandbox-23748"
}
```

```json
{
  "session_id": "3cc74c48-4114-4fd9-ba06-9b3d53c484cc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDM5OCwiaWF0IjoxNzkzMTc5NDk4LCJqdGkiOiIwMDJkMWNkYS0wZGQ2LTQxZmMtODNmOS1iNzBjNWU0MTNmNDkiLCJzaWQiOiIzY2M3NGM0OC00MTE0LTRmZDktYmEwNi05YjNkNTNjNDg0Y2MifQ.FI6Antr1sBNtb8LvFtkR7kxn264KoRYUod2Xh7yZ5Ts",
  "access_expires_at": "2026-10-28T09:39:58.139115813Z",
  "refresh_token": "pdPsnFbz3gC_4LFi_4Ga4Ja3RREBkwPEQtgT0U5eG_U",
  "refresh_expires_at": "2026-11-27T09:24:58.138508539Z",
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
  "command_id": "ab721c15-349f-4e75-ab01-a1bcb0e83b07",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:24:58Z",
    "sequence": 1793179498187
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:24:58.200917Z",
  "last_location_at": "2026-10-28T09:24:58.200917Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675731673",
  "device_ref": "sandbox-6181"
}
```

```json
{
  "challenge_id": "34bcbd29-b73d-4ed5-96d5-f30a23c8eceb",
  "expires_at": "2026-10-28T09:29:58.224594848Z",
  "resend_available_at": "2026-10-28T09:24:59.224594848Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675731673` → **200**

```json
{
  "phone": "+380675731673",
  "audience": "CLIENT",
  "code": "585201",
  "sent_at": "2026-10-28T09:24:58.23475187Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34bcbd29-b73d-4ed5-96d5-f30a23c8eceb",
  "code": "585201",
  "device_ref": "sandbox-6181"
}
```

```json
{
  "session_id": "327550ba-f49b-4e43-9126-b635d4d31647",
  "subject": {
    "type": "CLIENT",
    "id": "6b6b5218-828d-4514-953f-63ef9ad19b55"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjZiNTIxOC04MjhkLTQ1MTQtOTUzZi02M2VmOWFkMTliNTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMzk4LCJpYXQiOjE3OTMxNzk0OTgsImp0aSI6IjYwOGY3ZTYyLTQzYzEtNDE1ZS05OWMwLTFjODk0MmQ0MGMzZiIsInNpZCI6IjMyNzU1MGJhLWY0OWItNGU0My05MTI2LWI2MzVkNGQzMTY0NyJ9.lQSM4NLoNW3FPpk6UySXwO0Y3d9LEiA2cyEPMWMWujk",
  "access_expires_at": "2026-10-28T09:39:58.276664918Z",
  "refresh_token": "z04ErZBA53tGEeKxexnna2kowQMCNYLI6ugufRrpW6w",
  "refresh_expires_at": "2026-11-27T09:24:58.276095947Z",
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
  "command_id": "48e7e8ad-c66f-4316-9d6e-7c6c0b65c19c",
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
  "id": "00ee5945-958d-4f82-8697-cec6d14584c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:29:58.326341Z",
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
  "command_id": "a8f6d068-e8fb-4582-bfc5-24aa5ef37e40",
  "platform": "ANDROID",
  "token": "sandbox-driver-b6e0b234-926b-42c7-bfde-90ea741c3c98"
}
```

```json
{
  "id": "9711c522-9b92-4ca7-8677-d03b56dc906a",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T09:24:58.361032Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "bb51ceff-878a-467a-b409-042a234c6811",
  "platform": "ANDROID",
  "token": "sandbox-rider-de766c73-9377-4621-9fa2-9c6eff5ada00"
}
```

```json
{
  "id": "30436d1a-7ab9-45a5-973e-0c9a5a579a8c",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T09:24:58.390897Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "286fd48d-be09-4b47-a392-a17a401387cc",
  "quote_id": "00ee5945-958d-4f82-8697-cec6d14584c3",
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
  "id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6b6b5218-828d-4514-953f-63ef9ad19b55",
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
  "created_at": "2026-10-28T09:24:58.426374Z",
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
    "id": "f3968297-6d78-467e-a37e-b38b5917285d",
    "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
    "expires_at": "2026-10-28T09:25:13.429121Z",
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

`POST /api/driver/v1/offers/f3968297-6d78-467e-a37e-b38b5917285d/accept` → **200**

```json
{
  "command_id": "a41f5589-6c26-44fd-bdda-07ab7b3cb316"
}
```

```json
{
  "id": "fb83c553-bf8a-404d-986a-6b42dfa2117a",
  "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "abf56d08-fd95-46c5-8184-8816722abf7f",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T09:24:58.406Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T09:24:58.406Z` → **200**

```json
[
  {
    "at": "2026-10-28T09:24:58.80871451Z",
    "token_suffix": "1c3c98",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "ac704802-441f-4261-a522-413000c5146a",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "eec74c84-1a1f-47b6-baa7-a2dce00fd1d8",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675731673&after=2026-10-28T09:24:58.406Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380675731673&after=2026-10-28T09:24:58.406Z` → **200**

```json
[
  {
    "at": "2026-10-28T09:24:59.815149431Z",
    "token_suffix": "5ada00",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "c9c73087-130d-4deb-84aa-f2b2e0c93049",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8/messages` → **201**

```json
{
  "command_id": "8d435cd8-8e53-4ef0-8ed1-84fc60c2ae66",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "61dcd232-42a3-4bd8-a4b8-967f83e817f2",
  "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T09:25:00.606356234Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "abf56d08-fd95-46c5-8184-8816722abf7f",
  "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
  "assignment_id": "fb83c553-bf8a-404d-986a-6b42dfa2117a",
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

`POST /api/driver/v1/trips/abf56d08-fd95-46c5-8184-8816722abf7f/messages` → **201**

```json
{
  "command_id": "588752bc-3536-4a5d-84c6-635eb868b9e4",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "f102dc7d-e5db-45b4-a493-6d8151e0eebc",
  "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T09:25:00.648713298Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/abf56d08-fd95-46c5-8184-8816722abf7f/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675731673"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/981a8b9e-59ec-4ba1-81bf-1101542feeae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:00Z",
    "sequence": 1793179500707
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:25:00.721737Z",
  "last_location_at": "2026-10-28T09:25:00.721737Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "abf56d08-fd95-46c5-8184-8816722abf7f",
  "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
  "assignment_id": "fb83c553-bf8a-404d-986a-6b42dfa2117a",
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

`POST /api/driver/v1/trips/abf56d08-fd95-46c5-8184-8816722abf7f/arrive` → **200**

```json
{
  "command_id": "2d1c5dbf-83fa-4c0a-b932-99491188e37c",
  "expected_version": 0
}
```

```json
{
  "id": "abf56d08-fd95-46c5-8184-8816722abf7f",
  "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
  "assignment_id": "fb83c553-bf8a-404d-986a-6b42dfa2117a",
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
  "arrived_at": "2026-10-28T09:25:00.763325Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/abf56d08-fd95-46c5-8184-8816722abf7f/start` → **200**

```json
{
  "command_id": "6bcbbbba-5ca9-43f8-807a-b195811121ff",
  "expected_version": 1
}
```

```json
{
  "id": "abf56d08-fd95-46c5-8184-8816722abf7f",
  "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
  "assignment_id": "fb83c553-bf8a-404d-986a-6b42dfa2117a",
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
  "arrived_at": "2026-10-28T09:25:00.763325Z",
  "started_at": "2026-10-28T09:25:00.791897Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/981a8b9e-59ec-4ba1-81bf-1101542feeae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:00Z",
    "sequence": 1793179500809
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:25:00.823814Z",
  "last_location_at": "2026-10-28T09:25:00.823814Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/abf56d08-fd95-46c5-8184-8816722abf7f/complete` → **200**

```json
{
  "command_id": "fccf6bdd-a8d3-4fa1-84f5-09b665ce09be",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:25:00Z",
  "cash_received": true
}
```

```json
{
  "id": "abf56d08-fd95-46c5-8184-8816722abf7f",
  "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
  "assignment_id": "fb83c553-bf8a-404d-986a-6b42dfa2117a",
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
  "arrived_at": "2026-10-28T09:25:00.763325Z",
  "started_at": "2026-10-28T09:25:00.791897Z",
  "completed_at": "2026-10-28T09:25:00.850255Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8` → **200**

```json
{
  "id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6b6b5218-828d-4514-953f-63ef9ad19b55",
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
    "id": "fb83c553-bf8a-404d-986a-6b42dfa2117a",
    "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "abf56d08-fd95-46c5-8184-8816722abf7f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:24:58.426374Z",
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
    "id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T09:24:58.426374Z",
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
    "id": "abf56d08-fd95-46c5-8184-8816722abf7f",
    "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
    "order_short_number": 7,
    "created_at": "2026-10-28T09:24:58.481999Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e9c9927a-9a6a-436f-8362-19b3d0b378a1",
    "order_id": "d9075669-860e-4e66-9b0b-c70d93aa0da6",
    "order_short_number": 1,
    "created_at": "2026-10-28T09:24:19.099998Z",
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

`GET /api/rider/v1/orders/a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8/tip` → **200**

```json
{
  "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
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
  "available_until": "2026-10-29T09:25:00.850255Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8/tip` → **201**

```json
{
  "command_id": "24835312-462d-497a-b910-6542eeb72a58",
  "amount_minor": 1100
}
```

```json
{
  "id": "4c4457be-ac7c-4257-a000-f735b72bd54c",
  "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T09:25:04.013311Z"
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
  "session_id": "77c30185-5a81-4686-9fe2-be0c367dd5c4",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MDQsImlhdCI6MTc5MzE3OTUwNCwianRpIjoiYWRkYjQ2OTMtMDk2YS00MzZlLWIwOWUtN2M5ZTEzM2Q5NGJmIiwic2lkIjoiNzdjMzAxODUtNWE4MS00Njg2LTlmZTItYmUwYzM2N2RkNWM0In0.rYmwfZnG4bg8_aZuNtznjSQ6iv_VxifdBKLBrKr8Gm8",
  "access_expires_at": "2026-10-28T09:40:04.316666838Z",
  "refresh_token": "Hae6yWWtEBD3GR8cktUWzVXlSZpOHTlrtGXOuKq3cPM",
  "refresh_expires_at": "2026-10-28T21:25:04.316258132Z",
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
          "DRIVER": 1,
          "STAFF": 1,
          "RIDER": 2
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
      "DRIVER": 1,
      "STAFF": 1,
      "RIDER": 2
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
  "generated_at": "2026-10-28T09:25:04.344958884Z"
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
  "generated_at": "2026-10-28T09:25:04.374290698Z"
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
  "session_id": "032e1e03-7f1f-4b45-a7b6-ab4dd0a0f366",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MDQsImlhdCI6MTc5MzE3OTUwNCwianRpIjoiYzM2OGQ5ZTItNzIyZi00ZGQ5LWI5MjgtMjZmMjM4NGNhMzgzIiwic2lkIjoiMDMyZTFlMDMtN2YxZi00YjQ1LWE3YjYtYWI0ZGQwYTBmMzY2In0.5Lm6Qo5MPnOSX9v_fJEFTuhn1RUn3Q-ZFw5SRnn8VIU",
  "access_expires_at": "2026-10-28T09:40:04.672514271Z",
  "refresh_token": "PWYyYKRkkw_nD-nxSp8s1N1BCgNremmz6WiMsn4E58g",
  "refresh_expires_at": "2026-10-28T21:25:04.671942797Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:24:58.426861Z",
      "actor": {
        "type": "CLIENT",
        "id": "6b6b5218-828d-4514-953f-63ef9ad19b55",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
        "quote_id": "00ee5945-958d-4f82-8697-cec6d14584c3",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0f5799ba-0437-4d7b-a074-91d58e341407"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:24:58.428426Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
        "attempt_id": "2ce2e06a-bc76-48c7-90f0-0e06339e1178",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0f5799ba-0437-4d7b-a074-91d58e341407"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:24:58.434107Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f3968297-6d78-467e-a37e-b38b5917285d",
        "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "0f5799ba-0437-4d7b-a074-91d58e341407"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:24:58.484055Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f3968297-6d78-467e-a37e-b38b5917285d",
        "order_id": "a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "fb83c553-bf8a-404d-986a-6b42dfa2117a"
      },
      "correlation_id": "f00e7c40-9deb-43a2-ad24-f20c6caf7012"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T09:25:04.716876248Z",
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
      "last_location_at": "2026-10-28T09:25:00.823814Z",
      "order_id": null
    }
  ]
}
```

Done: order a5821fb7-16f8-45d4-ab77-ab6fb06dd5d8.

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
  "session_id": "29090f1c-f889-44d1-b4aa-7c9d06005262",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MDUsImlhdCI6MTc5MzE3OTUwNSwianRpIjoiMjNkY2Q2OGYtODg2ZS00NmU2LWIyZmQtNWI2NTg0ZDcyMWViIiwic2lkIjoiMjkwOTBmMWMtZjg4OS00NGQxLWI0YWEtN2M5ZDA2MDA1MjYyIn0.fQPpPssxJtZFJW6UqGoOErnAhJ5NwTvj7QcwTX7GgZw",
  "access_expires_at": "2026-10-28T09:40:05.032453126Z",
  "refresh_token": "rXiyctvgeZcXkeOQUtdQEDz20uT94HPMLgKj7sch_ro",
  "refresh_expires_at": "2026-10-28T21:25:05.031883024Z",
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
  "command_id": "46690a66-a084-48ba-9b77-04fb30cc0618",
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
  "timestamp": "2026-10-28T09:25:05.000+0000",
  "channel": {
    "id": "1730052000.2341416559",
    "linkedid": "1730052000.2341416559",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679783583"
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
  "timestamp": "2026-10-28T09:25:05.000+0000",
  "channel": {
    "id": "1730052000.2341416559",
    "linkedid": "1730052000.2341416559",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679783583"
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
  "session_id": "26589da8-d6ac-4029-8a76-1832cff5a621",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MDUsImlhdCI6MTc5MzE3OTUwNSwianRpIjoiOTUzNTU5YTUtOWQ0Ny00YTk0LTgzNzItNjU4ZjNiYzI0ZDE3Iiwic2lkIjoiMjY1ODlkYTgtZDZhYy00MDI5LThhNzYtMTgzMmNmZjVhNjIxIn0.nqODE8cNmop_z_csDcS3WoKnLaeZEFDvYfEMApqNYOc",
  "access_expires_at": "2026-10-28T09:40:05.41919591Z",
  "refresh_token": "kHRnyDOaAG7LRA-fQFJA_cIH0509tzvFWTfZEbke3r8",
  "refresh_expires_at": "2026-10-28T21:25:05.418698519Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "10021a44-0b3d-4187-b3ac-322287faae22",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679783583",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:25:05Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/10021a44-0b3d-4187-b3ac-322287faae22/answer` → **200**

```json
{
  "command_id": "3d15041f-f141-429e-a498-7d8ed4c77588"
}
```

```json
{
  "id": "10021a44-0b3d-4187-b3ac-322287faae22",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679783583",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "order_ids": [],
  "started_at": "2026-10-28T09:25:05Z",
  "answered_at": "2026-10-28T09:25:05.483366Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2341416559",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3780032e-925b-4c17-be21-73935e879be9",
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
  "id": "a05d9bab-83c9-4bb9-a3fe-d83a6c0f455f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:05.536598Z",
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
  "command_id": "def26f57-df95-40b2-ba84-316ef86c676f",
  "quote_id": "a05d9bab-83c9-4bb9-a3fe-d83a6c0f455f",
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
    "phone": "+380679783583"
  },
  "call_id": "10021a44-0b3d-4187-b3ac-322287faae22"
}
```

```json
{
  "id": "f9340610-f16d-422d-9a1b-2fead817c856",
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
  "created_at": "2026-10-28T09:25:05.578878Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679783583"
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
    "id": "1730052000.2341416559",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "10021a44-0b3d-4187-b3ac-322287faae22",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679783583",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_ids": [
        "f9340610-f16d-422d-9a1b-2fead817c856"
      ],
      "started_at": "2026-10-28T09:25:05Z",
      "answered_at": "2026-10-28T09:25:05.483366Z",
      "ended_at": "2026-10-28T09:25:05.612577Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "22d10f29-b8aa-40e1-b949-16c5ff95a634",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670140754",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_ids": [],
      "started_at": "2026-10-28T09:24:23.2202Z",
      "answered_at": "2026-10-28T09:24:23.270442Z",
      "ended_at": "2026-10-28T09:24:23.327735Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:24:25.668026Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/f9340610-f16d-422d-9a1b-2fead817c856` → **200**

```json
{
  "id": "f9340610-f16d-422d-9a1b-2fead817c856",
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
  "created_at": "2026-10-28T09:25:05.578878Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679783583"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/f9340610-f16d-422d-9a1b-2fead817c856` → **200**

```json
{
  "id": "f9340610-f16d-422d-9a1b-2fead817c856",
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
  "created_at": "2026-10-28T09:25:05.578878Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679783583"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f9340610-f16d-422d-9a1b-2fead817c856/cancel` → **200**

```json
{
  "command_id": "3d5f4fb0-daa2-4538-ba4f-71a161325a86",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f9340610-f16d-422d-9a1b-2fead817c856",
  "short_number": 8,
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
  "created_at": "2026-10-28T09:25:05.578878Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679783583"
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

Done: call 10021a44-0b3d-4187-b3ac-322287faae22 with order f9340610-f16d-422d-9a1b-2fead817c856.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28809"
}
```

```json
{
  "challenge_id": "c040b78b-e15b-4645-9596-037d2496117f",
  "expires_at": "2026-10-28T09:30:05.739978374Z",
  "resend_available_at": "2026-10-28T09:25:06.739978374Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "467083",
  "sent_at": "2026-10-28T09:25:05.741526978Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c040b78b-e15b-4645-9596-037d2496117f",
  "code": "467083",
  "device_ref": "sandbox-28809"
}
```

```json
{
  "session_id": "d2d81eb4-44bb-480c-8c42-4f4e7ff15753",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDQwNSwiaWF0IjoxNzkzMTc5NTA1LCJqdGkiOiJjNzMzMGFjMS1hNDIxLTRhOGYtYmMwNS1lY2IwNWFhZmQ4ZjgiLCJzaWQiOiJkMmQ4MWViNC00NGJiLTQ4MGMtOGM0Mi00ZjRlN2ZmMTU3NTMifQ.4CkfwCFOUAAWgMsAU-QjgzEKL3o_hvcBPLuWH_nByl8",
  "access_expires_at": "2026-10-28T09:40:05.783209552Z",
  "refresh_token": "L3aYbuQZIHNa6roD29et-D5q3qc5bKZCHiovfgKnd80",
  "refresh_expires_at": "2026-11-27T09:25:05.782740691Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:25:00.823814Z",
  "last_location_at": "2026-10-28T09:25:00.823814Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/981a8b9e-59ec-4ba1-81bf-1101542feeae/handover` → **200**

```json
{
  "command_id": "077f3690-888c-4da3-8d64-71ad89cc7dba",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:25:00.823814Z",
  "last_location_at": "2026-10-28T09:25:00.823814Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/981a8b9e-59ec-4ba1-81bf-1101542feeae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:05Z",
    "sequence": 1793179505848
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:25:05.862917Z",
  "last_location_at": "2026-10-28T09:25:05.862917Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664561358",
  "device_ref": "sandbox-18081"
}
```

```json
{
  "challenge_id": "b9031b6b-a1e1-4ae6-a194-0ecc1cf0e00b",
  "expires_at": "2026-10-28T09:30:05.885778459Z",
  "resend_available_at": "2026-10-28T09:25:06.885778459Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664561358` → **200**

```json
{
  "phone": "+380664561358",
  "audience": "CLIENT",
  "code": "361103",
  "sent_at": "2026-10-28T09:25:05.887302733Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9031b6b-a1e1-4ae6-a194-0ecc1cf0e00b",
  "code": "361103",
  "device_ref": "sandbox-18081"
}
```

```json
{
  "session_id": "ba951101-c949-48be-b7fb-810dbd8b56df",
  "subject": {
    "type": "CLIENT",
    "id": "0fa32212-5e82-40fc-ac42-f6df45966710"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZmEzMjIxMi01ZTgyLTQwZmMtYWM0Mi1mNmRmNDU5NjY3MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwNDA1LCJpYXQiOjE3OTMxNzk1MDUsImp0aSI6ImYyNjBlMzgxLTBmNmMtNDg1My1hYjA1LWUwMDc5NjkyYmVmZSIsInNpZCI6ImJhOTUxMTAxLWM5NDktNDhiZS1iN2ZiLTgxMGRiZDhiNTZkZiJ9.XA8p3lfEpLVRq9aJbH89f-gHLRIpFnigAtjklpVUz2E",
  "access_expires_at": "2026-10-28T09:40:05.927739697Z",
  "refresh_token": "tgzAjyPO0Zma-yAjP6Q1m2Zfn93YwiFgpWPW6NAyNOI",
  "refresh_expires_at": "2026-11-27T09:25:05.927358067Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1977f9a8-2c14-4891-8088-2c77ee11c4d9",
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
  "id": "9927a986-4a17-4a26-b85e-4028c62c632b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:05.955334Z",
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
  "command_id": "0562cc44-5ddc-4f88-82ff-d0e89111794f",
  "quote_id": "9927a986-4a17-4a26-b85e-4028c62c632b",
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
  "id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0fa32212-5e82-40fc-ac42-f6df45966710",
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
  "created_at": "2026-10-28T09:25:05.985563Z",
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
    "id": "6bd312c9-2e74-438b-a800-ded63b9f5443",
    "order_id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
    "expires_at": "2026-10-28T09:25:20.988537Z",
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

`POST /api/driver/v1/offers/6bd312c9-2e74-438b-a800-ded63b9f5443/accept` → **200**

```json
{
  "command_id": "642a66c6-7bd1-444d-ae8b-565d34cedfaa"
}
```

```json
{
  "id": "f0f21504-8305-4e7f-810b-45379dd0ea4f",
  "order_id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b2a1f58e-848d-4730-b7bd-82214170def1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b2a1f58e-848d-4730-b7bd-82214170def1",
  "order_id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
  "assignment_id": "f0f21504-8305-4e7f-810b-45379dd0ea4f",
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

`POST /api/driver/v1/work-sessions/981a8b9e-59ec-4ba1-81bf-1101542feeae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:06Z",
    "sequence": 1793179506685
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:25:06.082666Z",
  "last_location_at": "2026-10-28T09:25:06.082666Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b2a1f58e-848d-4730-b7bd-82214170def1/arrive` → **200**

```json
{
  "command_id": "7e3f4848-e046-4464-b2d9-68a22dadb500",
  "expected_version": 0
}
```

```json
{
  "id": "b2a1f58e-848d-4730-b7bd-82214170def1",
  "order_id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
  "assignment_id": "f0f21504-8305-4e7f-810b-45379dd0ea4f",
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
  "arrived_at": "2026-10-28T09:25:06.114907Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b2a1f58e-848d-4730-b7bd-82214170def1/start` → **200**

```json
{
  "command_id": "43b2e6e4-692d-47a0-9119-6bf2f6c7cc0b",
  "expected_version": 1
}
```

```json
{
  "id": "b2a1f58e-848d-4730-b7bd-82214170def1",
  "order_id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
  "assignment_id": "f0f21504-8305-4e7f-810b-45379dd0ea4f",
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
  "arrived_at": "2026-10-28T09:25:06.114907Z",
  "started_at": "2026-10-28T09:25:06.144479Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/981a8b9e-59ec-4ba1-81bf-1101542feeae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:06Z",
    "sequence": 1793179506686
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:25:06.178886Z",
  "last_location_at": "2026-10-28T09:25:06.178886Z",
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
  "device_ref": "sandbox-24178"
}
```

```json
{
  "challenge_id": "62eb71e9-87fa-4cd8-a262-ce04b1d7ede9",
  "expires_at": "2026-10-28T09:30:06.196429438Z",
  "resend_available_at": "2026-10-28T09:25:07.196429438Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "570609",
  "sent_at": "2026-10-28T09:25:06.198251812Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62eb71e9-87fa-4cd8-a262-ce04b1d7ede9",
  "code": "570609",
  "device_ref": "sandbox-24178"
}
```

```json
{
  "session_id": "9e353875-010a-4e0f-9405-34f76ef9e35d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDQwNiwiaWF0IjoxNzkzMTc5NTA2LCJqdGkiOiI1YjFkMjVhYS0yMzAyLTRmYjgtYmFiNC01NTgwMjM5MDQ3MDYiLCJzaWQiOiI5ZTM1Mzg3NS0wMTBhLTRlMGYtOTQwNS0zNGY3NmVmOWUzNWQifQ.mZQKl36ol-PzURGZbpjD3tlFqwNtI7_AFgoQi0jM6UY",
  "access_expires_at": "2026-10-28T09:40:06.239729725Z",
  "refresh_token": "YvQ4Nwc0MfPB_JJDTTuBZwg_SSk5dexPNyc-qcY9oQI",
  "refresh_expires_at": "2026-11-27T09:25:06.239204683Z",
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
  "command_id": "5582af27-8bcd-4ede-8642-71c9d40c8756",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:06Z",
    "sequence": 1793179506687
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a3f253e1-d89a-4ad5-8d7e-de6e99e3835b",
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
  "last_heartbeat_at": "2026-10-28T09:25:06.302248Z",
  "last_location_at": "2026-10-28T09:25:06.302248Z",
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
  "session_id": "2de82794-8aca-4fc5-8c06-b8ba38e88351",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MDYsImlhdCI6MTc5MzE3OTUwNiwianRpIjoiOWVlYTQzYjgtNmQxYy00NWZmLWE3MTEtMTAxOGE1NDIzZWE0Iiwic2lkIjoiMmRlODI3OTQtOGFjYS00ZmM1LThjMDYtYjhiYTM4ZTg4MzUxIn0.AQrc32poHUNxWrpg3ycnDLyCDbiQ0GXOlMG8ACv43u4",
  "access_expires_at": "2026-10-28T09:40:06.609804868Z",
  "refresh_token": "wCnm1UDnfYSHmyxitw6fcUV--6AqwHy46K6ThFHxdeU",
  "refresh_expires_at": "2026-10-28T21:25:06.609209611Z",
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
  "session_id": "f5d2e495-c9e9-4cbf-ae30-79e162fb2917",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MDYsImlhdCI6MTc5MzE3OTUwNiwianRpIjoiZWZmOGM4YTktNmE0Ny00NTc5LTk3MmYtNzQ1NzdmZmIzMzBhIiwic2lkIjoiZjVkMmU0OTUtYzllOS00Y2JmLWFlMzAtNzllMTYyZmIyOTE3In0.ffnn6MeWjK0YUDYNb12Wr8fAd29DQVBKe3lT5axLQkI",
  "access_expires_at": "2026-10-28T09:40:06.917674761Z",
  "refresh_token": "sQsMvIc_MAGLxoMlvPvBQhGDCeRMaRC5W9ksTEy9Fko",
  "refresh_expires_at": "2026-10-28T21:25:06.917271986Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b360c0c5-eceb-4307-9f9a-8844526fb943` → **200**

```json
{
  "id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0fa32212-5e82-40fc-ac42-f6df45966710",
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
    "id": "f0f21504-8305-4e7f-810b-45379dd0ea4f",
    "order_id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b2a1f58e-848d-4730-b7bd-82214170def1",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T09:25:05.985563Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b360c0c5-eceb-4307-9f9a-8844526fb943/interrupt` → **200**

```json
{
  "command_id": "cbe58e30-ae2a-4c35-970d-a1d51720a477",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "0fa32212-5e82-40fc-ac42-f6df45966710",
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
      "id": "f0f21504-8305-4e7f-810b-45379dd0ea4f",
      "order_id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "b2a1f58e-848d-4730-b7bd-82214170def1",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T09:25:05.985563Z",
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
    "id": "aed6d4a4-4e3d-4e2b-b72b-b9ba491ccb65",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "0fa32212-5e82-40fc-ac42-f6df45966710",
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
    "id": "e8b66ad4-232e-423b-b3ed-7bffa989fec7",
    "order_id": "aed6d4a4-4e3d-4e2b-b72b-b9ba491ccb65",
    "expires_at": "2026-10-28T09:25:21.990316Z",
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

`POST /api/driver/v1/offers/e8b66ad4-232e-423b-b3ed-7bffa989fec7/accept` → **200**

```json
{
  "command_id": "aeb1e3f6-daa0-4f16-a22d-b0a13014d164"
}
```

```json
{
  "id": "27a572d5-2da1-4c3e-a6e3-49e20202e4e4",
  "order_id": "aed6d4a4-4e3d-4e2b-b72b-b9ba491ccb65",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4cfc4555-794d-43e3-9a44-4e6a9fe09385",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4cfc4555-794d-43e3-9a44-4e6a9fe09385",
  "order_id": "aed6d4a4-4e3d-4e2b-b72b-b9ba491ccb65",
  "assignment_id": "27a572d5-2da1-4c3e-a6e3-49e20202e4e4",
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
  "session_id": "a3f253e1-d89a-4ad5-8d7e-de6e99e3835b",
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
  "last_heartbeat_at": "2026-10-28T09:25:06.302248Z",
  "last_location_at": "2026-10-28T09:25:06.302248Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/a3f253e1-d89a-4ad5-8d7e-de6e99e3835b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:07Z",
    "sequence": 1793179507931
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a3f253e1-d89a-4ad5-8d7e-de6e99e3835b",
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
  "last_heartbeat_at": "2026-10-28T09:25:07.107864Z",
  "last_location_at": "2026-10-28T09:25:07.107864Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4cfc4555-794d-43e3-9a44-4e6a9fe09385/arrive` → **200**

```json
{
  "command_id": "1f9e4537-3008-48b5-9058-6011c1845096",
  "expected_version": 0
}
```

```json
{
  "id": "4cfc4555-794d-43e3-9a44-4e6a9fe09385",
  "order_id": "aed6d4a4-4e3d-4e2b-b72b-b9ba491ccb65",
  "assignment_id": "27a572d5-2da1-4c3e-a6e3-49e20202e4e4",
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
  "arrived_at": "2026-10-28T09:25:07.135799Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4cfc4555-794d-43e3-9a44-4e6a9fe09385/start` → **200**

```json
{
  "command_id": "c9b65c42-6219-4173-a168-bc7523e7a1ab",
  "expected_version": 1
}
```

```json
{
  "id": "4cfc4555-794d-43e3-9a44-4e6a9fe09385",
  "order_id": "aed6d4a4-4e3d-4e2b-b72b-b9ba491ccb65",
  "assignment_id": "27a572d5-2da1-4c3e-a6e3-49e20202e4e4",
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
  "arrived_at": "2026-10-28T09:25:07.135799Z",
  "started_at": "2026-10-28T09:25:07.166807Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4cfc4555-794d-43e3-9a44-4e6a9fe09385/complete` → **200**

```json
{
  "command_id": "a13989b4-7779-4668-86e2-c7fca676909f",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:25:07Z"
}
```

```json
{
  "id": "4cfc4555-794d-43e3-9a44-4e6a9fe09385",
  "order_id": "aed6d4a4-4e3d-4e2b-b72b-b9ba491ccb65",
  "assignment_id": "27a572d5-2da1-4c3e-a6e3-49e20202e4e4",
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
  "arrived_at": "2026-10-28T09:25:07.135799Z",
  "started_at": "2026-10-28T09:25:07.166807Z",
  "completed_at": "2026-10-28T09:25:07.200642Z",
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
    "id": "aed6d4a4-4e3d-4e2b-b72b-b9ba491ccb65",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T09:25:06.981826Z",
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
    "id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:25:05.985563Z",
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

`GET /api/operator/v1/orders/b360c0c5-eceb-4307-9f9a-8844526fb943/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:25:05.986025Z",
      "actor": {
        "type": "CLIENT",
        "id": "0fa32212-5e82-40fc-ac42-f6df45966710",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
        "quote_id": "9927a986-4a17-4a26-b85e-4028c62c632b",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "1b8573c8-d106-4e60-83f7-c2616db24f06"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:25:05.987716Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
        "attempt_id": "88f995b4-6cfe-4a65-a144-fa78a65480c4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1b8573c8-d106-4e60-83f7-c2616db24f06"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:25:05.991068Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6bd312c9-2e74-438b-a800-ded63b9f5443",
        "order_id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "1b8573c8-d106-4e60-83f7-c2616db24f06"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:25:06.035796Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6bd312c9-2e74-438b-a800-ded63b9f5443",
        "order_id": "b360c0c5-eceb-4307-9f9a-8844526fb943",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f0f21504-8305-4e7f-810b-45379dd0ea4f"
      },
      "correlation_id": "4dcb57d7-9f4d-4886-85a0-a5da9dc6f214"
```

Done: interrupted b360c0c5-eceb-4307-9f9a-8844526fb943, follow-up aed6d4a4-4e3d-4e2b-b72b-b9ba491ccb65.

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
  "session_id": "8c4786d2-1989-4b49-b94a-67d80c3b73b8",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MTAsImlhdCI6MTc5MzE3OTUxMCwianRpIjoiMTU5NjlmOTItYTkyMy00NWFkLWE1ZjktOTNiZGE4MjY2MzI5Iiwic2lkIjoiOGM0Nzg2ZDItMTk4OS00YjQ5LWI5NGEtNjdkODBjM2I3M2I4In0.K0iYOLMAamCkT3iglp24yfRIyVS2xa6tMwzzv9r9sjk",
  "access_expires_at": "2026-10-28T09:40:10.580138059Z",
  "refresh_token": "0YYD14VHJPp_JMLXgcQ3a9JfxyE1LnMETc-ObuaXMsE",
  "refresh_expires_at": "2026-10-28T21:25:10.579773617Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "8b215983-3375-4dc4-81f8-22b368b80725",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:25:10Z"
}
```

```json
{
  "id": "e29ddd4d-6dd9-498b-8df8-ccdaaca4ca27",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:25:10Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/e29ddd4d-6dd9-498b-8df8-ccdaaca4ca27/publish` → **200**

```json
{
  "command_id": "e669ae20-f650-416b-a6c4-d9447f632ac3",
  "expected_version": 0
}
```

```json
{
  "id": "e29ddd4d-6dd9-498b-8df8-ccdaaca4ca27",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:25:10.656851Z",
  "published_at": "2026-10-28T09:25:10.656851Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "e29ddd4d-6dd9-498b-8df8-ccdaaca4ca27",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T09:25:10.656851Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634186438",
  "device_ref": "sandbox-23053"
}
```

```json
{
  "challenge_id": "42af581b-2466-41b7-bf04-4f9b07cb9685",
  "expires_at": "2026-10-28T09:30:10.721627596Z",
  "resend_available_at": "2026-10-28T09:25:11.721627596Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634186438` → **200**

```json
{
  "phone": "+380634186438",
  "audience": "CLIENT",
  "code": "558439",
  "sent_at": "2026-10-28T09:25:10.725424922Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42af581b-2466-41b7-bf04-4f9b07cb9685",
  "code": "558439",
  "device_ref": "sandbox-23053"
}
```

```json
{
  "session_id": "a0e1e08d-be69-4423-bf9c-6530b5f1ef59",
  "subject": {
    "type": "CLIENT",
    "id": "3d532cb7-99c8-4619-b66d-3b4cb4afefd5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZDUzMmNiNy05OWM4LTQ2MTktYjY2ZC0zYjRjYjRhZmVmZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwNDEwLCJpYXQiOjE3OTMxNzk1MTAsImp0aSI6ImZhZGU4ZjgzLWJkZmYtNGE3YS1hNTAyLTk1YzUyZjY5MWJkOCIsInNpZCI6ImEwZTFlMDhkLWJlNjktNDQyMy1iZjljLTY1MzBiNWYxZWY1OSJ9.7hXlC4wyh6zCKC1ZqES39eFNn2Tij4Tqb_FDvUSrHTo",
  "access_expires_at": "2026-10-28T09:40:10.766996129Z",
  "refresh_token": "0xur8C_zpK5iwi2t080bNK96K2UoIbU0m7apwzbiZek",
  "refresh_expires_at": "2026-11-27T09:25:10.766554008Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "e29ddd4d-6dd9-498b-8df8-ccdaaca4ca27",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T09:25:10.656851Z",
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
  "command_id": "34a65ade-757e-4e3e-9f74-1434701efe06",
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
  "id": "f8e85a7a-9d78-4e7d-b7a4-197ef9af2042",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:10.813191Z",
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
  "command_id": "95359488-626e-41e6-82fb-d08dafe62f92",
  "quote_id": "f8e85a7a-9d78-4e7d-b7a4-197ef9af2042",
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
  "correlation_id": "9c37c549-accb-4b20-9576-7dab0aea6694"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "f48af351-0a83-42e4-b68a-acc6dd32be43",
  "version_id": "e29ddd4d-6dd9-498b-8df8-ccdaaca4ca27",
  "language": "uk"
}
```

```json
{
  "version_id": "e29ddd4d-6dd9-498b-8df8-ccdaaca4ca27",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T09:25:10.870856Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dde9e151-88cd-43d4-ba3a-333b2d0e2f5c",
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
  "id": "e1500ecd-d6c5-43f8-bbaa-5283d0242e72",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:10.899067Z",
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
  "command_id": "fac92633-ec39-4ff0-8b7f-92734ca54e30",
  "quote_id": "e1500ecd-d6c5-43f8-bbaa-5283d0242e72",
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
  "id": "83e9fd23-016b-4913-9cee-157be4b657bf",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3d532cb7-99c8-4619-b66d-3b4cb4afefd5",
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
  "created_at": "2026-10-28T09:25:10.924954Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/83e9fd23-016b-4913-9cee-157be4b657bf` → **200**

```json
{
  "id": "83e9fd23-016b-4913-9cee-157be4b657bf",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3d532cb7-99c8-4619-b66d-3b4cb4afefd5",
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
  "created_at": "2026-10-28T09:25:10.924954Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/83e9fd23-016b-4913-9cee-157be4b657bf/cancel` → **200**

```json
{
  "command_id": "ee4d4553-8046-4980-b5f6-d5ddb732451f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "83e9fd23-016b-4913-9cee-157be4b657bf",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3d532cb7-99c8-4619-b66d-3b4cb4afefd5",
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
  "created_at": "2026-10-28T09:25:10.924954Z",
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
  "discount_minor": 0
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/e29ddd4d-6dd9-498b-8df8-ccdaaca4ca27` → **409**

```json
{
  "command_id": "1aa7bf9a-884c-4955-b53d-c50f4b4d869b",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:25:10Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/e29ddd4d-6dd9-498b-8df8-ccdaaca4ca27",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ab3dd2a1-ebad-4bf1-bee7-9aaff262132b"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "41b2e665-2f50-473d-bfb0-a8e9f3369494",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:25:11Z"
}
```

```json
{
  "id": "419ede51-b0a5-47fa-843f-f47312def151",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:25:11Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/419ede51-b0a5-47fa-843f-f47312def151/publish` → **200**

```json
{
  "command_id": "0d678681-fbae-4297-ae43-b80f7892e9b3",
  "expected_version": 0
}
```

```json
{
  "id": "419ede51-b0a5-47fa-843f-f47312def151",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:25:11.063511Z",
  "published_at": "2026-10-28T09:25:11.063511Z",
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
  "device_ref": "sandbox-20484"
}
```

```json
{
  "challenge_id": "0285ceed-4507-43c2-8dfb-da0b397cbb21",
  "expires_at": "2026-10-28T09:30:11.092796511Z",
  "resend_available_at": "2026-10-28T09:25:12.092796511Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "172017",
  "sent_at": "2026-10-28T09:25:11.094446235Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0285ceed-4507-43c2-8dfb-da0b397cbb21",
  "code": "172017",
  "device_ref": "sandbox-20484"
}
```

```json
{
  "session_id": "8a51c522-5e27-44f3-8c44-981155f8b398",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDQxMSwiaWF0IjoxNzkzMTc5NTExLCJqdGkiOiIyMTZmN2Y2My1iMjJkLTQyYmYtODFlNS1kZjYwYjQyYjQ1MzgiLCJzaWQiOiI4YTUxYzUyMi01ZTI3LTQ0ZjMtOGM0NC05ODExNTVmOGIzOTgifQ.biEV3PzyH_0tPHWU03_wNWj1ZKe9WANd-OfCLWiMOew",
  "access_expires_at": "2026-10-28T09:40:11.134644172Z",
  "refresh_token": "1gTNeYTLaPVGksKtgXs2cR35ME39ZUmPmBy1OH5i4C0",
  "refresh_expires_at": "2026-11-27T09:25:11.134235332Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a3f253e1-d89a-4ad5-8d7e-de6e99e3835b",
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
  "last_heartbeat_at": "2026-10-28T09:25:07.107864Z",
  "last_location_at": "2026-10-28T09:25:07.107864Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a3f253e1-d89a-4ad5-8d7e-de6e99e3835b/handover` → **200**

```json
{
  "command_id": "db4fd569-f562-4767-9243-75e6707b55cf",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a3f253e1-d89a-4ad5-8d7e-de6e99e3835b",
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
  "last_heartbeat_at": "2026-10-28T09:25:07.107864Z",
  "last_location_at": "2026-10-28T09:25:07.107864Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a3f253e1-d89a-4ad5-8d7e-de6e99e3835b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:11Z",
    "sequence": 1793179511195
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a3f253e1-d89a-4ad5-8d7e-de6e99e3835b",
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
  "last_heartbeat_at": "2026-10-28T09:25:11.208559Z",
  "last_location_at": "2026-10-28T09:25:11.208559Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673610523",
  "device_ref": "sandbox-21366"
}
```

```json
{
  "challenge_id": "e009431c-57e1-4b20-87aa-b3448375f143",
  "expires_at": "2026-10-28T09:30:11.227854967Z",
  "resend_available_at": "2026-10-28T09:25:12.227854967Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673610523` → **200**

```json
{
  "phone": "+380673610523",
  "audience": "CLIENT",
  "code": "438333",
  "sent_at": "2026-10-28T09:25:11.229523391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e009431c-57e1-4b20-87aa-b3448375f143",
  "code": "438333",
  "device_ref": "sandbox-21366"
}
```

```json
{
  "session_id": "888d9d85-1ecd-4adc-bae1-7112a9e48932",
  "subject": {
    "type": "CLIENT",
    "id": "29219d46-d18c-4566-8911-ec1445469008"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOTIxOWQ0Ni1kMThjLTQ1NjYtODkxMS1lYzE0NDU0NjkwMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwNDExLCJpYXQiOjE3OTMxNzk1MTEsImp0aSI6IjAxZGQxYmM3LWVmYzctNGVmOC04ZTk3LWYwYzFmZDFmNjczOSIsInNpZCI6Ijg4OGQ5ZDg1LTFlY2QtNGFkYy1iYWUxLTcxMTJhOWU0ODkzMiJ9.ZwXSPsrCSybsBaABWixvPYWXp4W2M7wbTssvQWGcTQ8",
  "access_expires_at": "2026-10-28T09:40:11.269710106Z",
  "refresh_token": "0j3zVEQ-DjaVNgAYWt6VVkKgwnSkW0butPT_c1P1SI8",
  "refresh_expires_at": "2026-11-27T09:25:11.269170723Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8a100d9f-0d6f-48b4-9a3a-24c6e5d185c0",
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
  "id": "dac649d7-94ec-4af8-b7e5-c884ee500cc2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:11.298267Z",
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
  "command_id": "71590a86-5db2-464c-b53c-fb53ae2e0210",
  "quote_id": "dac649d7-94ec-4af8-b7e5-c884ee500cc2",
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
    "phone": "+380672005268"
  }
}
```

```json
{
  "id": "fdb9a01f-9ad0-4809-bbf3-21281f285a5e",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:25:11.332028Z",
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
    "id": "86cf83a6-d1cf-4f77-8498-5317a16f437d",
    "order_id": "fdb9a01f-9ad0-4809-bbf3-21281f285a5e",
    "expires_at": "2026-10-28T09:25:26.334901Z",
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

`POST /api/driver/v1/offers/86cf83a6-d1cf-4f77-8498-5317a16f437d/accept` → **200**

```json
{
  "command_id": "5984b372-a824-47bd-ab8b-401f9d9d19c7"
}
```

```json
{
  "id": "2ccdac7d-a513-402f-9b35-4f0f5e13cc94",
  "order_id": "fdb9a01f-9ad0-4809-bbf3-21281f285a5e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a09104f7-caf5-4753-8870-2f3e765ef874",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a09104f7-caf5-4753-8870-2f3e765ef874",
  "order_id": "fdb9a01f-9ad0-4809-bbf3-21281f285a5e",
  "assignment_id": "2ccdac7d-a513-402f-9b35-4f0f5e13cc94",
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
    "phone": "+380672005268"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "00ad0b80-2432-42f7-aa40-7cae27441dc8",
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
  "id": "0437fcdf-edaf-41b0-9fe5-baf02cd915da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:11.442907Z",
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
  "command_id": "3d515e47-dd4f-4d3b-852a-64035846a942",
  "quote_id": "0437fcdf-edaf-41b0-9fe5-baf02cd915da",
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
  "id": "57ed4447-c099-4bf5-a3d9-0352cd90ce9e",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:25:11.472493Z",
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
  "command_id": "37bae6ab-af95-4e2f-8c28-4bfb60eff5bb",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T12:25:11Z"
}
```

```json
{
  "id": "b59cac8e-5759-4ee7-b2cc-3ba70202c9df",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:11.509667Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T12:25:11Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "556608f3-2313-4b17-b5de-ae04ab524c49",
  "quote_id": "b59cac8e-5759-4ee7-b2cc-3ba70202c9df",
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
  "pickup_at": "2026-10-28T12:25:11Z"
}
```

```json
{
  "id": "d2d9c88c-b32c-412b-92af-c5f493104010",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:25:11.539878Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:25:11Z",
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
  "command_id": "9800501e-528c-4b33-ade7-b1d1bcc1bc42",
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
  "id": "537260b0-cb7a-492c-8070-8886c41156be",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:11.570923Z",
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
  "command_id": "dadeab76-5a7f-443d-b5e1-a746922cb7c4",
  "quote_id": "537260b0-cb7a-492c-8070-8886c41156be",
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
  "correlation_id": "b8c34c3a-9d28-48e4-a1c7-c41337274b3e"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "d2d9c88c-b32c-412b-92af-c5f493104010",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T09:25:11.539878Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T12:25:11Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "57ed4447-c099-4bf5-a3d9-0352cd90ce9e",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T09:25:11.472493Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "fdb9a01f-9ad0-4809-bbf3-21281f285a5e",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "57ed4447-c099-4bf5-a3d9-0352cd90ce9e",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:25:11.472493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/fdb9a01f-9ad0-4809-bbf3-21281f285a5e` → **200**

```json
{
  "id": "fdb9a01f-9ad0-4809-bbf3-21281f285a5e",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "2ccdac7d-a513-402f-9b35-4f0f5e13cc94",
    "order_id": "fdb9a01f-9ad0-4809-bbf3-21281f285a5e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a09104f7-caf5-4753-8870-2f3e765ef874",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T09:25:11.332028Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/fdb9a01f-9ad0-4809-bbf3-21281f285a5e/cancel` → **200**

```json
{
  "command_id": "903fc446-b036-43d7-b658-d93385e60329",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fdb9a01f-9ad0-4809-bbf3-21281f285a5e",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "2ccdac7d-a513-402f-9b35-4f0f5e13cc94",
    "order_id": "fdb9a01f-9ad0-4809-bbf3-21281f285a5e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a09104f7-caf5-4753-8870-2f3e765ef874",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:25:11.332028Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/57ed4447-c099-4bf5-a3d9-0352cd90ce9e` → **200**

```json
{
  "id": "57ed4447-c099-4bf5-a3d9-0352cd90ce9e",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:25:11.472493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/57ed4447-c099-4bf5-a3d9-0352cd90ce9e/cancel` → **200**

```json
{
  "command_id": "bdfe986b-3f74-4848-87aa-e661e7e624e6",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "57ed4447-c099-4bf5-a3d9-0352cd90ce9e",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:25:11.472493Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d2d9c88c-b32c-412b-92af-c5f493104010` → **200**

```json
{
  "id": "d2d9c88c-b32c-412b-92af-c5f493104010",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:25:11.539878Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:25:11Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d2d9c88c-b32c-412b-92af-c5f493104010/cancel` → **200**

```json
{
  "command_id": "191354bf-32e0-427e-905e-b6e97f107653",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d2d9c88c-b32c-412b-92af-c5f493104010",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "29219d46-d18c-4566-8911-ec1445469008",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:25:11.539878Z",
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
  "pickup_at": "2026-10-28T12:25:11Z",
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
  "session_id": "a3f253e1-d89a-4ad5-8d7e-de6e99e3835b",
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
  "last_heartbeat_at": "2026-10-28T09:25:11.208559Z",
  "last_location_at": "2026-10-28T09:25:11.208559Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a3f253e1-d89a-4ad5-8d7e-de6e99e3835b/close` → **200**

```json
{
  "command_id": "d4279c63-046f-4f51-ae14-577758c3d8ba",
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

Done: orders fdb9a01f-9ad0-4809-bbf3-21281f285a5e, 57ed4447-c099-4bf5-a3d9-0352cd90ce9e, d2d9c88c-b32c-412b-92af-c5f493104010.

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
  "session_id": "008de165-aca0-4aa1-9d32-c51992061ce3",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MTIsImlhdCI6MTc5MzE3OTUxMiwianRpIjoiYjIwNzQ0ZjktOTU3NS00ZDRlLWFlNGEtMDVkODNjNzQyZGIxIiwic2lkIjoiMDA4ZGUxNjUtYWNhMC00YWExLTlkMzItYzUxOTkyMDYxY2UzIn0.Ih61gea1KHjv5yNI0nyHdWVdRzIH_ot057hTAkrwqSk",
  "access_expires_at": "2026-10-28T09:40:12.125787954Z",
  "refresh_token": "f2OgjdT0ybK5tbznjc79LNjglrIbDJTOc5lEpm3MGGg",
  "refresh_expires_at": "2026-10-28T21:25:12.125339368Z",
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
  "session_id": "a7184f2b-ed7e-4436-aa46-76c6b96f8f33",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MTIsImlhdCI6MTc5MzE3OTUxMiwianRpIjoiZmE2MDBiZGMtNWM0ZC00N2IxLTk0ZGItMzM4MmQ2YTNjZDk2Iiwic2lkIjoiYTcxODRmMmItZWQ3ZS00NDM2LWFhNDYtNzZjNmI5NmY4ZjMzIn0.rUR_clmNez55N9GRpPWzGHdVUwabgYFWBOrPg8ZOih8",
  "access_expires_at": "2026-10-28T09:40:12.431894577Z",
  "refresh_token": "ZutUNgvXT1GIAJG8Km3c-MHil2tEIeohO0VPw6c1IfE",
  "refresh_expires_at": "2026-10-28T21:25:12.431470446Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9912"
}
```

```json
{
  "challenge_id": "0bdb0400-1a8c-4887-b4ee-26a3fec005f7",
  "expires_at": "2026-10-28T09:30:12.451853683Z",
  "resend_available_at": "2026-10-28T09:25:13.451853683Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "265310",
  "sent_at": "2026-10-28T09:25:12.458240857Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0bdb0400-1a8c-4887-b4ee-26a3fec005f7",
  "code": "265310",
  "device_ref": "sandbox-9912"
}
```

```json
{
  "session_id": "2f48b755-4157-4589-95e2-d78253672c47",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDQxMiwiaWF0IjoxNzkzMTc5NTEyLCJqdGkiOiIwOGIzM2FiZS02ZWMyLTRhZjAtYTllMi00MTYzYTAyOTc5Y2MiLCJzaWQiOiIyZjQ4Yjc1NS00MTU3LTQ1ODktOTVlMi1kNzgyNTM2NzJjNDcifQ.v8bd7pccOgk901mFE1BLG8zEoWmCttOGnE192-2K0GI",
  "access_expires_at": "2026-10-28T09:40:12.500738697Z",
  "refresh_token": "5zWPihGndQLBGSGu6ikmBPcC-JOYZjCGftIMgREHy_o",
  "refresh_expires_at": "2026-11-27T09:25:12.500297966Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:25:06.178886Z",
  "last_location_at": "2026-10-28T09:25:06.178886Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/981a8b9e-59ec-4ba1-81bf-1101542feeae/handover` → **200**

```json
{
  "command_id": "a7777f4f-2aee-4582-9734-7c6bc57011ad",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:25:06.178886Z",
  "last_location_at": "2026-10-28T09:25:06.178886Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/981a8b9e-59ec-4ba1-81bf-1101542feeae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:12Z",
    "sequence": 1793179512563
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:25:12.578074Z",
  "last_location_at": "2026-10-28T09:25:12.578074Z",
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
  "command_id": "cd5304cb-ca2c-4dc9-a079-666efe9f4ca6",
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
  "effective_at": "2026-10-28T09:25:12.630597Z",
  "changed_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T09:25:12.670522811Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "48d69fa6-0520-4c15-b9d6-8312cb8f1c2c",
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
  "id": "d4f1b774-a799-417d-9b9c-408c1bbb9e76",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:12.698586Z",
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
  "command_id": "e2ba72e6-4f73-4795-bef1-7d34dbdbcdc3",
  "quote_id": "d4f1b774-a799-417d-9b9c-408c1bbb9e76",
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
    "phone": "+3806711112394"
  }
}
```

```json
{
  "id": "4533a512-1bf2-483f-9be5-6d28189b443a",
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
  "created_at": "2026-10-28T09:25:12.73342Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112394"
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
    "id": "e6173466-6aff-440f-af19-244bb6582ecf",
    "order_id": "4533a512-1bf2-483f-9be5-6d28189b443a",
    "expires_at": "2026-10-28T09:25:27.737456Z",
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

`POST /api/driver/v1/offers/e6173466-6aff-440f-af19-244bb6582ecf/accept` → **200**

```json
{
  "command_id": "a3815682-91a9-498b-a3a8-d0a0bbc89f9b"
}
```

```json
{
  "id": "ae8f67f2-7f6f-4bff-a055-2eaeebb7a735",
  "order_id": "4533a512-1bf2-483f-9be5-6d28189b443a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ca8c00a1-4cfa-4f1c-9894-d783101c8817",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ca8c00a1-4cfa-4f1c-9894-d783101c8817",
  "order_id": "4533a512-1bf2-483f-9be5-6d28189b443a",
  "assignment_id": "ae8f67f2-7f6f-4bff-a055-2eaeebb7a735",
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
    "phone": "+3806711112394"
  }
}
```

`POST /api/driver/v1/work-sessions/981a8b9e-59ec-4ba1-81bf-1101542feeae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:12Z",
    "sequence": 1793179512817
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:25:12.83074Z",
  "last_location_at": "2026-10-28T09:25:12.83074Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ca8c00a1-4cfa-4f1c-9894-d783101c8817/arrive` → **200**

```json
{
  "command_id": "3564e678-b19d-456f-a516-afe5974cfadc",
  "expected_version": 0
}
```

```json
{
  "id": "ca8c00a1-4cfa-4f1c-9894-d783101c8817",
  "order_id": "4533a512-1bf2-483f-9be5-6d28189b443a",
  "assignment_id": "ae8f67f2-7f6f-4bff-a055-2eaeebb7a735",
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
  "arrived_at": "2026-10-28T09:25:12.857017Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711112394"
  }
}
```

`POST /api/driver/v1/trips/ca8c00a1-4cfa-4f1c-9894-d783101c8817/start` → **200**

```json
{
  "command_id": "af0a2086-57e1-4fcc-8a4b-ef14604f772b",
  "expected_version": 1
}
```

```json
{
  "id": "ca8c00a1-4cfa-4f1c-9894-d783101c8817",
  "order_id": "4533a512-1bf2-483f-9be5-6d28189b443a",
  "assignment_id": "ae8f67f2-7f6f-4bff-a055-2eaeebb7a735",
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
  "arrived_at": "2026-10-28T09:25:12.857017Z",
  "started_at": "2026-10-28T09:25:12.891508Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711112394"
  }
}
```

`POST /api/driver/v1/trips/ca8c00a1-4cfa-4f1c-9894-d783101c8817/complete` → **200**

```json
{
  "command_id": "b56f1ac8-a580-4311-a519-121b29301c24",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:25:12Z",
  "cash_received": true
}
```

```json
{
  "id": "ca8c00a1-4cfa-4f1c-9894-d783101c8817",
  "order_id": "4533a512-1bf2-483f-9be5-6d28189b443a",
  "assignment_id": "ae8f67f2-7f6f-4bff-a055-2eaeebb7a735",
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
  "arrived_at": "2026-10-28T09:25:12.857017Z",
  "started_at": "2026-10-28T09:25:12.891508Z",
  "completed_at": "2026-10-28T09:25:12.921612Z",
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
  "command_id": "def45465-12aa-42b9-8e2a-e7d153c892bf",
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
  "id": "a7851bd9-9357-4d91-a31b-f24ec70f6626",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:12.955656Z",
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
  "command_id": "81e6b4e7-5bfc-4d93-9851-d374b399d5fb",
  "quote_id": "a7851bd9-9357-4d91-a31b-f24ec70f6626",
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
    "phone": "+380671119888"
  }
}
```

```json
{
  "id": "af40da2b-1a7c-43eb-b452-f2b593624132",
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
  "created_at": "2026-10-28T09:25:12.98523Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119888"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/af40da2b-1a7c-43eb-b452-f2b593624132` → **200**

```json
{
  "id": "af40da2b-1a7c-43eb-b452-f2b593624132",
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
  "created_at": "2026-10-28T09:25:12.98523Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119888"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/af40da2b-1a7c-43eb-b452-f2b593624132/cancel` → **200**

```json
{
  "command_id": "29422a3d-7274-4dae-a409-715aebb6dadd",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "af40da2b-1a7c-43eb-b452-f2b593624132",
  "short_number": 16,
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
  "created_at": "2026-10-28T09:25:12.98523Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119888"
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
  "staff_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T09:25:12.92613Z",
  "last_entries": [
    {
      "order_id": "af40da2b-1a7c-43eb-b452-f2b593624132",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T09:25:13.03881Z"
    },
    {
      "order_id": "4533a512-1bf2-483f-9be5-6d28189b443a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T09:25:12.92613Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "981a8b9e-59ec-4ba1-81bf-1101542feeae",
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
  "last_heartbeat_at": "2026-10-28T09:25:12.83074Z",
  "last_location_at": "2026-10-28T09:25:12.83074Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/981a8b9e-59ec-4ba1-81bf-1101542feeae/close` → **200**

```json
{
  "command_id": "1b69625d-e88b-4e66-aac5-8e64ce1fda44",
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

Done: operator bonus for fulfilled 4533a512-1bf2-483f-9be5-6d28189b443a and operator-fault cancellation af40da2b-1a7c-43eb-b452-f2b593624132.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679082972",
  "device_ref": "sandbox-29770"
}
```

```json
{
  "challenge_id": "b8d2fd35-c81b-4ac4-a7c5-c5e07e35ddc8",
  "expires_at": "2026-10-28T09:30:15.161264756Z",
  "resend_available_at": "2026-10-28T09:25:16.161264756Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679082972` → **200**

```json
{
  "phone": "+380679082972",
  "audience": "CLIENT",
  "code": "119994",
  "sent_at": "2026-10-28T09:25:15.162867715Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676429421",
  "device_ref": "sandbox-17471",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "bfd5c468-32ba-40a2-ad30-3b16e0c66229",
  "expires_at": "2026-10-28T09:30:15.202210557Z",
  "resend_available_at": "2026-10-28T09:25:16.202210557Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676429421` → **200**

```json
{
  "phone": "+380676429421",
  "audience": "CLIENT",
  "code": "787788",
  "sent_at": "2026-10-28T09:25:15.203841627Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672070000",
  "device_ref": "sandbox-26417"
}
```

```json
{
  "challenge_id": "6ef346b4-ab86-4faf-81be-5abb60e01edb",
  "expires_at": "2026-10-28T09:30:15.24270168Z",
  "resend_available_at": "2026-10-28T09:25:16.24270168Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672070000` → **200**

```json
{
  "phone": "+380672070000",
  "audience": "CLIENT",
  "code": "145998",
  "sent_at": "2026-10-28T09:25:15.24494781Z",
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
  "session_id": "906ecb76-b141-4fbc-af09-2498e3edc683",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MTUsImlhdCI6MTc5MzE3OTUxNSwianRpIjoiMmI3ZDY0NGItY2M0My00ZjdmLWJlZmQtMjQ4Y2QzYThhYWE1Iiwic2lkIjoiOTA2ZWNiNzYtYjE0MS00ZmJjLWFmMDktMjQ5OGUzZWRjNjgzIn0.tsOXQB6YssYKU_i5IB4zm4ZfiwE0dJJbNF5yTryPMhg",
  "access_expires_at": "2026-10-28T09:40:15.562021245Z",
  "refresh_token": "UkSweX7U-wMTsKOYiJkvwMCQhhu3lCHQP8mNwoB_4Pg",
  "refresh_expires_at": "2026-10-28T21:25:15.56165874Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672070000` → **200**

```json
{
  "deliveries": [
    {
      "id": "dbabd023-ad06-41e1-8d74-e215993de632",
      "challenge_id": "6ef346b4-ab86-4faf-81be-5abb60e01edb",
      "phone": "+380672070000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6756f270-f3b1-473a-a646-74993dd22f63",
      "error": null,
      "attempted_at": "2026-10-28T09:25:15.245147Z"
    },
    {
      "id": "79df290e-f94f-408e-86ea-4022ce3fa30d",
      "challenge_id": "6ef346b4-ab86-4faf-81be-5abb60e01edb",
      "phone": "+380672070000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T09:25:15.244369Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672070000` → **200**

```json
{
  "phone": "+380672070000",
  "audience": "CLIENT",
  "code": "145998",
  "sent_at": "2026-10-28T09:25:15.24494781Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676429421` → **200**

```json
{
  "deliveries": [
    {
      "id": "9a456623-ea39-4a61-83c3-7b3dca7c93c2",
      "challenge_id": "bfd5c468-32ba-40a2-ad30-3b16e0c66229",
      "phone": "+380676429421",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-037d2136-9d9b-4362-8839-2bfe34b0a036",
      "error": null,
      "attempted_at": "2026-10-28T09:25:15.204059Z"
    }
  ]
}
```

Done: SMS to +380679082972, a call to +380676429421, SMS then a call to +380672070000.

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
  "session_id": "c5706871-fc7c-462f-b249-47e274ae1e9f",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MTUsImlhdCI6MTc5MzE3OTUxNSwianRpIjoiOTZkZGFjYzAtMjdlOC00Y2FhLTg2YTctN2EyNmZmNGQ4ODAzIiwic2lkIjoiYzU3MDY4NzEtZmM3Yy00NjJmLWIyNDktNDdlMjc0YWUxZTlmIn0.iRO94B3CSoOj1S8lPKoruCmzNUXh7K0UYiNnXO8ciiA",
  "access_expires_at": "2026-10-28T09:40:15.940947784Z",
  "refresh_token": "vgJ9i5pJL1wNao5c-yE-gN3xr6haHyI3ETuNCfeVeUk",
  "refresh_expires_at": "2026-10-28T21:25:15.94051534Z",
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
  "session_id": "15ca6ea6-b14f-4442-81a5-d6e1fbdfc523",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MTYsImlhdCI6MTc5MzE3OTUxNiwianRpIjoiZjA1NWM5M2ItZTEyZS00NGY1LWEwYjUtNGI1YjZmNjY1YzIyIiwic2lkIjoiMTVjYTZlYTYtYjE0Zi00NDQyLTgxYTUtZDZlMWZiZGZjNTIzIn0.CPg5IbDNs3tfIrSK3TJOQxKKba1W3NV9XrmfAde5WmY",
  "access_expires_at": "2026-10-28T09:40:16.241672542Z",
  "refresh_token": "Q1qzZ0MGGKAVCMBId8AVP0z1M0L5sy6ZI85ruklveKM",
  "refresh_expires_at": "2026-10-28T21:25:16.241264918Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
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

`POST /api/admin/v1/staff-extensions/f81b9756-80b3-4968-b0cd-cdc62bf31550` → **200**

```json
{
  "command_id": "4efe5e83-fa19-4635-80f4-1808fc0f7d0f",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "6bd77981-73e4-4052-bdce-bf9f4dd86f38",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T09:25:16.349457Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T09:25:16.349457Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2130aea9-d766-4d2f-8236-9b02cdbb2344",
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
  "id": "7bc4e404-e69c-4262-bd73-e559e822e66b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:16.407426Z",
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
  "command_id": "ebd51e8c-164e-4cbc-9152-b37a1b2f0029",
  "quote_id": "7bc4e404-e69c-4262-bd73-e559e822e66b",
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
    "phone": "+380678136436"
  }
}
```

```json
{
  "id": "2e0f92fb-0c12-4515-bb75-543c7913b003",
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
  "created_at": "2026-10-28T09:25:16.437505Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678136436"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/2e0f92fb-0c12-4515-bb75-543c7913b003/calls` → **201**

```json
{
  "command_id": "503510c7-fc41-4400-9314-329b70a31a2a",
  "to": "CALLER"
}
```

```json
{
  "id": "a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "order_ids": [
    "2e0f92fb-0c12-4515-bb75-543c7913b003"
  ],
  "started_at": "2026-10-28T09:25:16.477372Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/2e0f92fb-0c12-4515-bb75-543c7913b003/calls` → **201**

```json
{
  "command_id": "503510c7-fc41-4400-9314-329b70a31a2a",
  "to": "CALLER"
}
```

```json
{
  "id": "a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "order_ids": [
    "2e0f92fb-0c12-4515-bb75-543c7913b003"
  ],
  "started_at": "2026-10-28T09:25:16.477372Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678136436",
    "at": "2026-10-28T09:25:16.479277186Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.24223",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=2e0f92fb-0c12-4515-bb75-543c7913b003` → **200**

```json
{
  "calls": [
    {
      "id": "a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_ids": [
        "2e0f92fb-0c12-4515-bb75-543c7913b003"
      ],
      "started_at": "2026-10-28T09:25:16.477372Z",
      "answered_at": "2026-10-28T09:25:16.582487Z",
      "ended_at": "2026-10-28T09:25:16.59805Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2e0f92fb-0c12-4515-bb75-543c7913b003` → **200**

```json
{
  "calls": [
    {
      "id": "a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_ids": [
        "2e0f92fb-0c12-4515-bb75-543c7913b003"
      ],
      "started_at": "2026-10-28T09:25:16.477372Z",
      "answered_at": "2026-10-28T09:25:16.582487Z",
      "ended_at": "2026-10-28T09:25:16.59805Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2e0f92fb-0c12-4515-bb75-543c7913b003` → **200**

```json
{
  "calls": [
    {
      "id": "a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_ids": [
        "2e0f92fb-0c12-4515-bb75-543c7913b003"
      ],
      "started_at": "2026-10-28T09:25:16.477372Z",
      "answered_at": "2026-10-28T09:25:16.582487Z",
      "ended_at": "2026-10-28T09:25:16.59805Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2e0f92fb-0c12-4515-bb75-543c7913b003` → **200**

```json
{
  "calls": [
    {
      "id": "a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_ids": [
        "2e0f92fb-0c12-4515-bb75-543c7913b003"
      ],
      "started_at": "2026-10-28T09:25:16.477372Z",
      "answered_at": "2026-10-28T09:25:16.582487Z",
      "ended_at": "2026-10-28T09:25:16.59805Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2e0f92fb-0c12-4515-bb75-543c7913b003` → **200**

```json
{
  "calls": [
    {
      "id": "a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_ids": [
        "2e0f92fb-0c12-4515-bb75-543c7913b003"
      ],
      "started_at": "2026-10-28T09:25:16.477372Z",
      "answered_at": "2026-10-28T09:25:16.582487Z",
      "ended_at": "2026-10-28T09:25:16.59805Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2e0f92fb-0c12-4515-bb75-543c7913b003` → **200**

```json
{
  "calls": [
    {
      "id": "a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "order_ids": [
        "2e0f92fb-0c12-4515-bb75-543c7913b003"
      ],
      "started_at": "2026-10-28T09:25:16.477372Z",
      "answered_at": "2026-10-28T09:25:16.582487Z",
      "ended_at": "2026-10-28T09:25:16.59805Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:25:25.691253Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/2e0f92fb-0c12-4515-bb75-543c7913b003` → **200**

```json
{
  "id": "2e0f92fb-0c12-4515-bb75-543c7913b003",
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
  "created_at": "2026-10-28T09:25:16.437505Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678136436"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2e0f92fb-0c12-4515-bb75-543c7913b003/cancel` → **200**

```json
{
  "command_id": "63fbb82a-9e7d-4a27-9070-de2014696734",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2e0f92fb-0c12-4515-bb75-543c7913b003",
  "short_number": 17,
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
  "created_at": "2026-10-28T09:25:16.437505Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678136436"
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
  "command_id": "e8c0adca-eb3f-4fff-9bef-616d4dff8070",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T09:25:26.83915Z",
  "extension": "101"
}
```

Done: outgoing call a96ba5a4-cbf7-4ea6-b63e-ddbba9eebd0c from order 2e0f92fb-0c12-4515-bb75-543c7913b003, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635783264",
  "device_ref": "sandbox-292"
}
```

```json
{
  "challenge_id": "2714f008-db2f-422d-828a-5e64b02c195f",
  "expires_at": "2026-10-28T09:30:26.869661773Z",
  "resend_available_at": "2026-10-28T09:25:27.869661773Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635783264` → **200**

```json
{
  "phone": "+380635783264",
  "audience": "CLIENT",
  "code": "972790",
  "sent_at": "2026-10-28T09:25:26.871538845Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2714f008-db2f-422d-828a-5e64b02c195f",
  "code": "972790",
  "device_ref": "sandbox-292"
}
```

```json
{
  "session_id": "72388ff2-1391-4564-80dd-1851390f293b",
  "subject": {
    "type": "CLIENT",
    "id": "1299dbd2-cccb-4bd9-99d4-508002519879"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjk5ZGJkMi1jY2NiLTRiZDktOTlkNC01MDgwMDI1MTk4NzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwNDI2LCJpYXQiOjE3OTMxNzk1MjYsImp0aSI6IjAwOWE5OGRhLTcxZTQtNDIzYi05MzA1LTUzMDQwY2M5NzEyYSIsInNpZCI6IjcyMzg4ZmYyLTEzOTEtNDU2NC04MGRkLTE4NTEzOTBmMjkzYiJ9._KQ3h13YWKjW21ym41GU7b7BmXFxdHcGzmTIPPoSChk",
  "access_expires_at": "2026-10-28T09:40:26.911633725Z",
  "refresh_token": "IWm-uLAXNNuM6Y34x6zI8p0G4pnzBum8h8yHrZVyJEI",
  "refresh_expires_at": "2026-11-27T09:25:26.911289669Z",
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
  "session_id": "93c7f830-5a84-4724-8017-19ca120c0b06",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MjcsImlhdCI6MTc5MzE3OTUyNywianRpIjoiM2Q0OWM1ZmItYjIxMC00OGMyLWIwZTMtODVkYmY1OWI4NmZmIiwic2lkIjoiOTNjN2Y4MzAtNWE4NC00NzI0LTgwMTctMTljYTEyMGMwYjA2In0.fDdOh7qCqpPOFrlAH5R9-I0EBaAQU3xG4CWdo5R_s-8",
  "access_expires_at": "2026-10-28T09:40:27.274735184Z",
  "refresh_token": "Ft8xL0izpH3zGB1psqByVlbXtd4ny2Kr7CPbuZlnows",
  "refresh_expires_at": "2026-10-28T21:25:27.274364413Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635783264` → **200**

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
  "correlation_id": "1ea4b28f-aa90-49e3-ba81-626b2b88a1b2"
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
  "session_id": "35bef066-8e75-45b4-82d7-5cdc410654c8",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MjcsImlhdCI6MTc5MzE3OTUyNywianRpIjoiYTIyNTQ3ZGYtM2Y4Ny00MDQ5LWFmYmItZTQwOTlhZjRkNThhIiwic2lkIjoiMzViZWYwNjYtOGU3NS00NWI0LTgyZDctNWNkYzQxMDY1NGM4In0.3E-Ilhu3nzZs4k7YP7nv8xwJZpsRQYd-5HHoJqR9gkQ",
  "access_expires_at": "2026-10-28T09:40:27.649093945Z",
  "refresh_token": "SCLN5YcOwe3YXCQezpzMeqS3NhqFwItKkWflMZ98Rlg",
  "refresh_expires_at": "2026-10-28T21:25:27.648605625Z",
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
  "command_id": "9774074e-14d7-4d50-acd7-de0e6070d4c8",
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
  "changed_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T09:25:27.715858815Z"
}
```

## The rider books the airport for 2026-10-28T12:25:27Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600269679",
  "device_ref": "sandbox-23887"
}
```

```json
{
  "challenge_id": "04e037d0-a211-4b0a-912d-35a05a0ff08b",
  "expires_at": "2026-10-28T09:30:27.740338996Z",
  "resend_available_at": "2026-10-28T09:25:28.740338996Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600269679` → **200**

```json
{
  "phone": "+48600269679",
  "audience": "CLIENT",
  "code": "919596",
  "sent_at": "2026-10-28T09:25:27.741840498Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04e037d0-a211-4b0a-912d-35a05a0ff08b",
  "code": "919596",
  "device_ref": "sandbox-23887"
}
```

```json
{
  "session_id": "576006d1-3a04-4adc-8d4e-8d81fbf96b1b",
  "subject": {
    "type": "CLIENT",
    "id": "6d9289f7-9ec3-4c3c-9d39-a0cd8b998f8b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZDkyODlmNy05ZWMzLTRjM2MtOWQzOS1hMGNkOGI5OThmOGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwNDI3LCJpYXQiOjE3OTMxNzk1MjcsImp0aSI6IjQ2NGVjOTIyLWZhYTQtNGVhMi04NGNhLWY1ZDFlMGJjNGIwNCIsInNpZCI6IjU3NjAwNmQxLTNhMDQtNGFkYy04ZDRlLThkODFmYmY5NmIxYiJ9.CiszTSuMakLXUHY0S5WvyWkxTAOIU6Nu4fcTWLMqA18",
  "access_expires_at": "2026-10-28T09:40:27.782456142Z",
  "refresh_token": "UjIOXdHdW8st40NkO_h69A-aUORrMcYeS9V9R6gXnxM",
  "refresh_expires_at": "2026-11-27T09:25:27.782013376Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "251f60c6-ff69-4b22-8a70-51260c8614c9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T12:25:27Z"
}
```

```json
{
  "id": "6939cee7-9fd8-41e3-8774-d7071756a54e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:27.808526Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T12:25:27Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d7d605d5-379b-4361-94cf-58d10b98a1d1",
  "quote_id": "6939cee7-9fd8-41e3-8774-d7071756a54e",
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
  "pickup_at": "2026-10-28T12:25:27Z"
}
```

```json
{
  "id": "f28f2ee7-832a-4fe6-9ea4-703ef1df0682",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6d9289f7-9ec3-4c3c-9d39-a0cd8b998f8b",
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
  "created_at": "2026-10-28T09:25:27.837731Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:25:27Z",
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
  "device_ref": "sandbox-25127"
}
```

```json
{
  "challenge_id": "f5dbacd7-ec22-425d-a43c-e6537d17ec53",
  "expires_at": "2026-10-28T09:30:27.86150976Z",
  "resend_available_at": "2026-10-28T09:25:28.86150976Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "992978",
  "sent_at": "2026-10-28T09:25:27.862952789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5dbacd7-ec22-425d-a43c-e6537d17ec53",
  "code": "992978",
  "device_ref": "sandbox-25127"
}
```

```json
{
  "session_id": "94732dcb-b676-47aa-9a8f-e4c1c6b6d1a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDQyNywiaWF0IjoxNzkzMTc5NTI3LCJqdGkiOiI5Yjc1NDljYS1kZDY5LTRiNzktYjg5ZC04ZmMwNGI5YWM0NTMiLCJzaWQiOiI5NDczMmRjYi1iNjc2LTQ3YWEtOWE4Zi1lNGMxYzZiNmQxYTcifQ.hJvXSEgJ3Ird1J1BE60Z7gDgwvlaW6NCkb0Z8FXeMbU",
  "access_expires_at": "2026-10-28T09:40:27.907970409Z",
  "refresh_token": "sKLaNGMXDz-fSdxIT4POxXUCubXzrh73TyPIvsK9s8s",
  "refresh_expires_at": "2026-11-27T09:25:27.906918615Z",
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
  "command_id": "f8856b5f-3d65-40b0-adb8-c5eb62978eee",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:27Z",
    "sequence": 1793179527946
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "92e936d7-a337-4fcd-8ae6-a9e045766bb3",
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
  "last_heartbeat_at": "2026-10-28T09:25:27.959149Z",
  "last_location_at": "2026-10-28T09:25:27.959149Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "f28f2ee7-832a-4fe6-9ea4-703ef1df0682",
      "short_number": 18,
      "pickup_at": "2026-10-28T12:25:27Z",
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

`POST /api/driver/v1/preorders/f28f2ee7-832a-4fe6-9ea4-703ef1df0682/reserve` → **200**

```json
{
  "command_id": "81910773-d591-43bb-90dd-dd3ac796887c"
}
```

```json
{
  "id": "9f22200c-f814-407c-858a-5f01e2ae840a",
  "state": "RESERVED",
  "order": {
    "order_id": "f28f2ee7-832a-4fe6-9ea4-703ef1df0682",
    "short_number": 18,
    "pickup_at": "2026-10-28T12:25:27Z",
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
  "reserved_at": "2026-10-28T09:25:28.006528Z",
  "confirm_from": "2026-10-28T11:55:27Z",
  "confirm_until": "2026-10-28T12:05:27Z",
  "drop_until": "2026-10-28T11:25:27Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "9f22200c-f814-407c-858a-5f01e2ae840a",
      "state": "RESERVED",
      "order": {
        "order_id": "f28f2ee7-832a-4fe6-9ea4-703ef1df0682",
        "short_number": 18,
        "pickup_at": "2026-10-28T12:25:27Z",
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
      "reserved_at": "2026-10-28T09:25:28.006528Z",
      "confirm_from": "2026-10-28T11:55:27Z",
      "confirm_until": "2026-10-28T12:05:27Z",
      "drop_until": "2026-10-28T11:25:27Z"
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
      "id": "9f22200c-f814-407c-858a-5f01e2ae840a",
      "state": "RESERVED",
      "order": {
        "order_id": "f28f2ee7-832a-4fe6-9ea4-703ef1df0682",
        "short_number": 18,
        "pickup_at": "2026-10-28T12:25:27Z",
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
      "reserved_at": "2026-10-28T09:25:28.006528Z",
      "confirm_from": "2026-10-28T11:55:27Z",
      "confirm_until": "2026-10-28T12:05:27Z",
      "drop_until": "2026-10-28T11:25:27Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/9f22200c-f814-407c-858a-5f01e2ae840a/confirm` → **409**

```json
{
  "command_id": "5d9e57a5-c0a8-49da-bc62-31e2894e2ff4"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/9f22200c-f814-407c-858a-5f01e2ae840a/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7a91e9f6-0af7-429e-9352-f0b2691301b7"
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
  "session_id": "c79b1152-1d9e-4527-9a67-c52319f25cc4",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MjgsImlhdCI6MTc5MzE3OTUyOCwianRpIjoiNjE0ZWViOTEtNzk1Yy00MTNlLThjNzgtMTBkZjkwZDUyYzA5Iiwic2lkIjoiYzc5YjExNTItMWQ5ZS00NTI3LTlhNjctYzUyMzE5ZjI1Y2M0In0._jG1hlt82ioJyAi7pDaHOifEzdq0WIlgmU4ksEB7iRs",
  "access_expires_at": "2026-10-28T09:40:28.369353099Z",
  "refresh_token": "3FuzoKoOIPi0MfRS9JbW6S7D2E_jAyKJa31-2kSxbBw",
  "refresh_expires_at": "2026-10-28T21:25:28.36890234Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f28f2ee7-832a-4fe6-9ea4-703ef1df0682` → **200**

```json
{
  "id": "f28f2ee7-832a-4fe6-9ea4-703ef1df0682",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "6d9289f7-9ec3-4c3c-9d39-a0cd8b998f8b",
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
  "created_at": "2026-10-28T09:25:27.837731Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T12:25:27Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "9f22200c-f814-407c-858a-5f01e2ae840a",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T09:25:28.006528Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/f28f2ee7-832a-4fe6-9ea4-703ef1df0682/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T09:25:27.838743Z",
      "actor": {
        "type": "CLIENT",
        "id": "6d9289f7-9ec3-4c3c-9d39-a0cd8b998f8b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "f28f2ee7-832a-4fe6-9ea4-703ef1df0682",
        "preorder": true,
        "quote_id": "6939cee7-9fd8-41e3-8774-d7071756a54e",
        "pickup_at": "2026-10-28T12:25:27Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "53324f9b-9f72-4687-96f1-ebdc05d3b248"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T09:25:28.007356Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f28f2ee7-832a-4fe6-9ea4-703ef1df0682",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "9f22200c-f814-407c-858a-5f01e2ae840a"
      },
      "correlation_id": "c884d347-094f-44d7-9040-987478289ad7"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order f28f2ee7-832a-4fe6-9ea4-703ef1df0682, reservation 9f22200c-f814-407c-858a-5f01e2ae840a.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8449"
}
```

```json
{
  "challenge_id": "53d7f9c1-3820-4763-a7c1-2b904d11a5a4",
  "expires_at": "2026-10-28T09:30:28.443108547Z",
  "resend_available_at": "2026-10-28T09:25:29.443108547Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "794016",
  "sent_at": "2026-10-28T09:25:28.444611114Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53d7f9c1-3820-4763-a7c1-2b904d11a5a4",
  "code": "794016",
  "device_ref": "sandbox-8449"
}
```

```json
{
  "session_id": "976417eb-9f98-44be-846b-cfd23e9e7164",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDQyOCwiaWF0IjoxNzkzMTc5NTI4LCJqdGkiOiJmMjgzMmMwMC1iYTEwLTQ5YjUtYTg5ZC1lYjA0ODgyNGI1NzgiLCJzaWQiOiI5NzY0MTdlYi05Zjk4LTQ0YmUtODQ2Yi1jZmQyM2U5ZTcxNjQifQ.Il42Wo6JQV3eEKoePq8aT7eFchik_ZucnNim1w3gsAM",
  "access_expires_at": "2026-10-28T09:40:28.48603896Z",
  "refresh_token": "br2nGWmjU06uHL_BJ5f1WbeV7lwcHskYTeN7_16jbf0",
  "refresh_expires_at": "2026-11-27T09:25:28.485662239Z",
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
  "command_id": "f01cec5d-45c2-460c-8f45-5ad083e8c3a2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:28Z",
    "sequence": 1793179528522
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2254623f-e2aa-4267-98e4-0ebdef58b520",
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
  "last_heartbeat_at": "2026-10-28T09:25:28.535784Z",
  "last_location_at": "2026-10-28T09:25:28.535784Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675602642",
  "device_ref": "sandbox-18746"
}
```

```json
{
  "challenge_id": "3190f9e5-90c7-42b0-9621-9a3aa2734048",
  "expires_at": "2026-10-28T09:30:28.555296792Z",
  "resend_available_at": "2026-10-28T09:25:29.555296792Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675602642` → **200**

```json
{
  "phone": "+380675602642",
  "audience": "CLIENT",
  "code": "523932",
  "sent_at": "2026-10-28T09:25:28.556816743Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3190f9e5-90c7-42b0-9621-9a3aa2734048",
  "code": "523932",
  "device_ref": "sandbox-18746"
}
```

```json
{
  "session_id": "5852455f-5225-4cbd-a693-e3a66c37d256",
  "subject": {
    "type": "CLIENT",
    "id": "9f84cc6f-d331-4592-afee-b6c89961cea6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Zjg0Y2M2Zi1kMzMxLTQ1OTItYWZlZS1iNmM4OTk2MWNlYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwNDI4LCJpYXQiOjE3OTMxNzk1MjgsImp0aSI6IjU2NWJiNWZmLTM3YjQtNGVhZi1hZDBiLTA0NmRiNDNjYTE3MyIsInNpZCI6IjU4NTI0NTVmLTUyMjUtNGNiZC1hNjkzLWUzYTY2YzM3ZDI1NiJ9.r13QeWoJXmJ0c3QU3AeLsXTEXyloqQLKzwp3fawB2r4",
  "access_expires_at": "2026-10-28T09:40:28.596446884Z",
  "refresh_token": "aB3mSTNJZpkxoprK0P_2qWN1uR900abnjtaPUHAZii0",
  "refresh_expires_at": "2026-11-27T09:25:28.595983305Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bc352b75-bb54-41e9-bea0-294039c646a2",
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
  "id": "d08e278e-7a0c-4863-ad7b-a3554d9e3467",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:28.623891Z",
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
  "command_id": "bd039a94-c3b9-4c93-bf9b-92ff794d1c5c",
  "quote_id": "d08e278e-7a0c-4863-ad7b-a3554d9e3467",
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
  "id": "b7eb2d32-6233-4fde-b13c-93f777e02fbd",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9f84cc6f-d331-4592-afee-b6c89961cea6",
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
  "created_at": "2026-10-28T09:25:28.652721Z",
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
    "id": "52e4a63c-3fdb-483d-9ccf-aa91ad77af50",
    "order_id": "b7eb2d32-6233-4fde-b13c-93f777e02fbd",
    "expires_at": "2026-10-28T09:25:43.655317Z",
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

`POST /api/driver/v1/offers/52e4a63c-3fdb-483d-9ccf-aa91ad77af50/accept` → **200**

```json
{
  "command_id": "3f669fda-1b5a-41d0-978f-5980fb8d3b4a"
}
```

```json
{
  "id": "2896c8d8-5ae5-4485-99b5-ee79d7aedcf3",
  "order_id": "b7eb2d32-6233-4fde-b13c-93f777e02fbd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1aaae7a2-d659-456c-95a0-3568ae0cac2f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1aaae7a2-d659-456c-95a0-3568ae0cac2f",
  "order_id": "b7eb2d32-6233-4fde-b13c-93f777e02fbd",
  "assignment_id": "2896c8d8-5ae5-4485-99b5-ee79d7aedcf3",
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

`POST /api/driver/v1/work-sessions/2254623f-e2aa-4267-98e4-0ebdef58b520/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:28Z",
    "sequence": 1793179528730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2254623f-e2aa-4267-98e4-0ebdef58b520",
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
  "last_heartbeat_at": "2026-10-28T09:25:28.744021Z",
  "last_location_at": "2026-10-28T09:25:28.744021Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1aaae7a2-d659-456c-95a0-3568ae0cac2f",
  "order_id": "b7eb2d32-6233-4fde-b13c-93f777e02fbd",
  "assignment_id": "2896c8d8-5ae5-4485-99b5-ee79d7aedcf3",
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

`POST /api/driver/v1/trips/1aaae7a2-d659-456c-95a0-3568ae0cac2f/arrive` → **200**

```json
{
  "command_id": "96cc56bb-e485-464c-b886-82492d05002b",
  "expected_version": 0
}
```

```json
{
  "id": "1aaae7a2-d659-456c-95a0-3568ae0cac2f",
  "order_id": "b7eb2d32-6233-4fde-b13c-93f777e02fbd",
  "assignment_id": "2896c8d8-5ae5-4485-99b5-ee79d7aedcf3",
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
  "arrived_at": "2026-10-28T09:25:28.78145Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1aaae7a2-d659-456c-95a0-3568ae0cac2f/start` → **200**

```json
{
  "command_id": "eec19eac-ced7-43a8-bd61-a53517644c3e",
  "expected_version": 1
}
```

```json
{
  "id": "1aaae7a2-d659-456c-95a0-3568ae0cac2f",
  "order_id": "b7eb2d32-6233-4fde-b13c-93f777e02fbd",
  "assignment_id": "2896c8d8-5ae5-4485-99b5-ee79d7aedcf3",
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
  "arrived_at": "2026-10-28T09:25:28.78145Z",
  "started_at": "2026-10-28T09:25:28.806973Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/2254623f-e2aa-4267-98e4-0ebdef58b520/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:28Z",
    "sequence": 1793179528825
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2254623f-e2aa-4267-98e4-0ebdef58b520",
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
  "last_heartbeat_at": "2026-10-28T09:25:28.839081Z",
  "last_location_at": "2026-10-28T09:25:28.839081Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/1aaae7a2-d659-456c-95a0-3568ae0cac2f/complete` → **200**

```json
{
  "command_id": "f8cd4e42-8fb4-4c68-8011-0ddb05e81c0b",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:25:28Z",
  "cash_received": true
}
```

```json
{
  "id": "1aaae7a2-d659-456c-95a0-3568ae0cac2f",
  "order_id": "b7eb2d32-6233-4fde-b13c-93f777e02fbd",
  "assignment_id": "2896c8d8-5ae5-4485-99b5-ee79d7aedcf3",
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
  "arrived_at": "2026-10-28T09:25:28.78145Z",
  "started_at": "2026-10-28T09:25:28.806973Z",
  "completed_at": "2026-10-28T09:25:28.863031Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/b7eb2d32-6233-4fde-b13c-93f777e02fbd/rating` → **200**

```json
{
  "command_id": "ff5a0077-51e9-4e51-93a7-db249393cdb9",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "b7eb2d32-6233-4fde-b13c-93f777e02fbd",
  "score": 5,
  "created_at": "2026-10-28T09:25:28.900137235Z"
}
```

`POST /api/driver/v1/orders/b7eb2d32-6233-4fde-b13c-93f777e02fbd/rating` → **200**

```json
{
  "command_id": "00c67bfa-4d60-4afa-bb26-dfbd996016cb",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "b7eb2d32-6233-4fde-b13c-93f777e02fbd",
  "score": 4,
  "created_at": "2026-10-28T09:25:28.92889828Z"
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
  "session_id": "22f3f97d-4151-4360-9fe8-b56df95b3b8c",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MjksImlhdCI6MTc5MzE3OTUyOSwianRpIjoiZmQ5NDI3MjMtYzM5NS00NDg0LWFhZDMtZjIyNWJkNjg0NmMyIiwic2lkIjoiMjJmM2Y5N2QtNDE1MS00MzYwLTlmZTgtYjU2ZGY5NWIzYjhjIn0.5RkEfF6xttDLxVHnjXSE55GllwWhL8HUQEcY4tGZzRQ",
  "access_expires_at": "2026-10-28T09:40:29.253663146Z",
  "refresh_token": "RwBOIbppxZrCSTeFiZuyKfisJrK0D--KSm9kcPgrHfw",
  "refresh_expires_at": "2026-10-28T21:25:29.253181474Z",
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
  "session_id": "e6fbbd0f-2de7-4003-ae25-1cd9a64b7472",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MjksImlhdCI6MTc5MzE3OTUyOSwianRpIjoiZTgxZWEyMTctNDg5NC00MTBiLTgwOTAtMDI0ZjZkYTdlNTM3Iiwic2lkIjoiZTZmYmJkMGYtMmRlNy00MDAzLWFlMjUtMWNkOWE2NGI3NDcyIn0.m0zqTeHPxw3mhI7AHfqX92QGzLNcXIekwqP-QW_RF0k",
  "access_expires_at": "2026-10-28T09:40:29.560698931Z",
  "refresh_token": "PIjjg0S5mmXlUPQuFtrGvK_9prUds4gEWw8B_yPhmN0",
  "refresh_expires_at": "2026-10-28T21:25:29.559702659Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b7eb2d32-6233-4fde-b13c-93f777e02fbd/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "b7eb2d32-6233-4fde-b13c-93f777e02fbd",
      "author_type": "RIDER",
      "author_id": "9f84cc6f-d331-4592-afee-b6c89961cea6",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T09:25:28.900137Z"
    },
    {
      "order_id": "b7eb2d32-6233-4fde-b13c-93f777e02fbd",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "9f84cc6f-d331-4592-afee-b6c89961cea6",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T09:25:28.928898Z"
    }
  ]
}
```

Done: ratings for order b7eb2d32-6233-4fde-b13c-93f777e02fbd.

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
  "session_id": "b1438ae5-b626-419a-bed2-5c13447f93a1",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MjksImlhdCI6MTc5MzE3OTUyOSwianRpIjoiMWFkMDdhNDktMDVhOS00NThkLThmZDQtMWQ1N2M0YjZjMTZmIiwic2lkIjoiYjE0MzhhZTUtYjYyNi00MTlhLWJlZDItNWMxMzQ0N2Y5M2ExIn0.lvCcpDy9fNCxv8UNf3BEjY49rMT_4akxoXHnnVzYJ0c",
  "access_expires_at": "2026-10-28T09:40:29.903697669Z",
  "refresh_token": "W-9Di6MlwYv7cniHyTCYGXLJuWDsWx2nwI1RM-Gz68E",
  "refresh_expires_at": "2026-10-28T21:25:29.903168047Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "cde3fa65-5fc1-4b08-9aec-6c87f1c77ca8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "77ff068f-ec05-4588-bbb8-5e0f676170d0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:25:29.936736Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/77ff068f-ec05-4588-bbb8-5e0f676170d0` → **200**

```json
{
  "id": "77ff068f-ec05-4588-bbb8-5e0f676170d0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:25:29.936736Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/77ff068f-ec05-4588-bbb8-5e0f676170d0` → **200**

```json
{
  "id": "77ff068f-ec05-4588-bbb8-5e0f676170d0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T09:25:29.936736Z",
  "ready_at": "2026-10-28T09:25:30.700412Z",
  "expires_at": "2026-10-29T09:25:30.700412Z"
}
```

`GET /api/admin/v1/reports/exports/77ff068f-ec05-4588-bbb8-5e0f676170d0/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "f4cbe568-5bba-4328-b9fc-e05799d4edb8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "43c4ce42-3dc0-4ddd-8662-d8a088b91719",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:25:31.032822Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43c4ce42-3dc0-4ddd-8662-d8a088b91719` → **200**

```json
{
  "id": "43c4ce42-3dc0-4ddd-8662-d8a088b91719",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:25:31.032822Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43c4ce42-3dc0-4ddd-8662-d8a088b91719` → **200**

```json
{
  "id": "43c4ce42-3dc0-4ddd-8662-d8a088b91719",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:25:31.032822Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43c4ce42-3dc0-4ddd-8662-d8a088b91719` → **200**

```json
{
  "id": "43c4ce42-3dc0-4ddd-8662-d8a088b91719",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:25:31.032822Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43c4ce42-3dc0-4ddd-8662-d8a088b91719` → **200**

```json
{
  "id": "43c4ce42-3dc0-4ddd-8662-d8a088b91719",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:25:31.032822Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43c4ce42-3dc0-4ddd-8662-d8a088b91719` → **200**

```json
{
  "id": "43c4ce42-3dc0-4ddd-8662-d8a088b91719",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:25:31.032822Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43c4ce42-3dc0-4ddd-8662-d8a088b91719` → **200**

```json
{
  "id": "43c4ce42-3dc0-4ddd-8662-d8a088b91719",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T09:25:31.032822Z",
  "ready_at": "2026-10-28T09:25:35.708095Z",
  "expires_at": "2026-10-29T09:25:35.708095Z"
}
```

`GET /api/admin/v1/reports/exports/43c4ce42-3dc0-4ddd-8662-d8a088b91719/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/04f15fde-4992-4c67-87ce-bfa461807fa4` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/04f15fde-4992-4c67-87ce-bfa461807fa4",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b3583cce-9617-416c-9b1d-998ee4cd8dab"
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
  "device_ref": "sandbox-4834"
}
```

```json
{
  "challenge_id": "f53885bd-4e74-4812-bb4b-7b6f745e6778",
  "expires_at": "2026-10-28T09:30:36.237358927Z",
  "resend_available_at": "2026-10-28T09:25:37.237358927Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "464428",
  "sent_at": "2026-10-28T09:25:36.240135127Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f53885bd-4e74-4812-bb4b-7b6f745e6778",
  "code": "464428",
  "device_ref": "sandbox-4834"
}
```

```json
{
  "session_id": "616d7d8f-6111-4876-92cc-f98bd4f7bcbc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDQzNiwiaWF0IjoxNzkzMTc5NTM2LCJqdGkiOiIxZjU3MWNkYS0yM2RiLTQxMGEtYmVlZi05NWQ5MjAwNTc0YmQiLCJzaWQiOiI2MTZkN2Q4Zi02MTExLTQ4NzYtOTJjYy1mOThiZDRmN2JjYmMifQ.hK2UyulNO5xRjSC_kiS2eS4v7ElXP0Lv1wxf1ViFYPM",
  "access_expires_at": "2026-10-28T09:40:36.279046044Z",
  "refresh_token": "qiHweylmDbbxh0gKSErx16xSzA3haWoZ1QbCAOsNPSU",
  "refresh_expires_at": "2026-11-27T09:25:36.278609715Z",
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
  "command_id": "62e53309-18bd-4f23-b00d-0923ae614709",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:36Z",
    "sequence": 1793179536331
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "34fb0893-7b47-43ae-8431-55e5606cb315",
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
  "last_heartbeat_at": "2026-10-28T09:25:36.344476Z",
  "last_location_at": "2026-10-28T09:25:36.344476Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "a2214622-8c32-4de0-ac0f-f92fe0a080eb",
  "points": [
    {
      "sequence": 1793179538369,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T09:24:38Z"
    },
    {
      "sequence": 1793179538375,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T09:25:38Z"
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
  "session_id": "686a129a-e01f-49b2-9752-15c5f6111002",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MzgsImlhdCI6MTc5MzE3OTUzOCwianRpIjoiZjU1N2UzZjctNGRkOS00NjdmLTgxNjUtNTNjZTUxZWQzZDdiIiwic2lkIjoiNjg2YTEyOWEtZTAxZi00OWIyLTk3NTItMTVjNWY2MTExMDAyIn0.FvbB-fwepzsFwao8WDhK3JA_jWcS6ZN4u9q0XPVkUo8",
  "access_expires_at": "2026-10-28T09:40:38.714307831Z",
  "refresh_token": "KUhaDpk2zA7rQqoBmOfLPozKA_jDmuwCPhgENRxpEIs",
  "refresh_expires_at": "2026-10-28T21:25:38.71378555Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "8d4f4817-628a-4b2d-a58d-dc0a1d92e47f",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T09:25:38Z",
        "track_point_id": "64f6ed16-eda8-42ee-8e19-c5571022da10",
        "work_session_id": "34fb0893-7b47-43ae-8431-55e5606cb315"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T09:25:38Z",
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

`POST /api/admin/v1/driver-risk-flags/8d4f4817-628a-4b2d-a58d-dc0a1d92e47f/confirm` → **200**

```json
{
  "command_id": "092a2cf6-3e24-4419-a05b-07ff9e90b27c",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "8d4f4817-628a-4b2d-a58d-dc0a1d92e47f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T09:25:38Z",
    "track_point_id": "64f6ed16-eda8-42ee-8e19-c5571022da10",
    "work_session_id": "34fb0893-7b47-43ae-8431-55e5606cb315"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T09:25:38Z",
  "reason": null,
  "reviewed_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "reviewed_at": "2026-10-28T09:25:38.811895Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/8d4f4817-628a-4b2d-a58d-dc0a1d92e47f/dismiss` → **409**

```json
{
  "command_id": "babf44cb-bc7a-46f7-a6ea-417afcc7d981",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/8d4f4817-628a-4b2d-a58d-dc0a1d92e47f/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "48fc7e8b-691b-4955-8453-1ff969dc9d51"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "e3112ad9-c3ad-430d-af14-c69af94564d8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "26a849d7-17d0-4ca4-aeb4-6a1e61291ae6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "raised_at": "2026-10-28T09:25:38.868635Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/26a849d7-17d0-4ca4-aeb4-6a1e61291ae6/dismiss` → **200**

```json
{
  "command_id": "739f0954-74e9-40bb-be79-000aa13e8184",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "26a849d7-17d0-4ca4-aeb4-6a1e61291ae6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "raised_at": "2026-10-28T09:25:38.868635Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "reviewed_at": "2026-10-28T09:25:38.897427Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "dad910cf-bc9a-4c31-9a51-037a9baa310c",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "8d4f4817-628a-4b2d-a58d-dc0a1d92e47f"
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
      "actor_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:25:38.932567Z"
    }
  ]
}
```

Done: flag 8d4f4817-628a-4b2d-a58d-dc0a1d92e47f confirmed, suspension named it, driver reinstated.

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
  "session_id": "65b00227-0f3c-4683-b2c4-98a5643e291f",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MzksImlhdCI6MTc5MzE3OTUzOSwianRpIjoiNjIyN2U0YTItOGU2NC00N2JmLWE0MzctOGVhZDUxZGYxMDgxIiwic2lkIjoiNjViMDAyMjctMGYzYy00NjgzLWIyYzQtOThhNTY0M2UyOTFmIn0.BMEB6SVVIgDLakSBDNv6ET-EI7lWya9PipI-Ts2o1Ck",
  "access_expires_at": "2026-10-28T09:40:39.253603202Z",
  "refresh_token": "jnWpv9jf183xbb2ogmxR8O-_q3FPquX17pnaAyNEsr8",
  "refresh_expires_at": "2026-10-28T21:25:39.252957678Z",
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
      "actor_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:25:38.932567Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "f555ab65-c51f-4a82-9365-03af650feeb1",
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
  "session_id": "34fb0893-7b47-43ae-8431-55e5606cb315",
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
  "last_heartbeat_at": "2026-10-28T09:25:36.344476Z",
  "last_location_at": "2026-10-28T09:25:36.344476Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34fb0893-7b47-43ae-8431-55e5606cb315/close` → **200**

```json
{
  "command_id": "c0d06bd4-9885-4c48-8751-fabb45d77537",
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
  "session_id": "e8d9d59a-35df-45b5-9acf-2bf74172aabf",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0MzksImlhdCI6MTc5MzE3OTUzOSwianRpIjoiODY3NDE3MzgtOGJjOS00ZGU5LWIwYTUtYzc5YzI5N2U5MmViIiwic2lkIjoiZThkOWQ1OWEtMzVkZi00NWI1LTlhY2YtMmJmNzQxNzJhYWJmIn0.Z4HZlzh5iIHykHtfFQjsG2nYXblUeKvJmkZj6jhjiZ4",
  "access_expires_at": "2026-10-28T09:40:39.661821733Z",
  "refresh_token": "EbLzDnZCbvb5lfDwd9rI5GD9mcHhiNj-FQM3TE3mWkU",
  "refresh_expires_at": "2026-10-28T21:25:39.661212249Z",
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
  "command_id": "6a917187-8645-452b-9fe8-35851d35617c",
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
  "changed_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T09:25:39.718074Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "6a917187-8645-452b-9fe8-35851d35617c",
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
  "changed_by": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T09:25:39.718074Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48145974131",
  "device_ref": "sandbox-15451"
}
```

```json
{
  "challenge_id": "e28a7315-57b0-4c02-8a80-dcaa962d9ae4",
  "expires_at": "2026-10-28T09:30:39.774931753Z",
  "resend_available_at": "2026-10-28T09:25:40.774931753Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48145974131` → **200**

```json
{
  "phone": "+48145974131",
  "audience": "CLIENT",
  "code": "551076",
  "sent_at": "2026-10-28T09:25:39.776413021Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e28a7315-57b0-4c02-8a80-dcaa962d9ae4",
  "code": "551076",
  "device_ref": "sandbox-15451"
}
```

```json
{
  "session_id": "d8983fc6-8d3e-4c8f-92b1-3c497915afc5",
  "subject": {
    "type": "CLIENT",
    "id": "b75dcb62-d871-4ba1-aa25-e1cad2c38128"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzVkY2I2Mi1kODcxLTRiYTEtYWEyNS1lMWNhZDJjMzgxMjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwNDM5LCJpYXQiOjE3OTMxNzk1MzksImp0aSI6IjIxNTdhY2ZmLWRiNWItNDcwMS1hY2ExLTU0YjM0ZjdiZDI0NiIsInNpZCI6ImQ4OTgzZmM2LThkM2UtNGM4Zi05MmIxLTNjNDk3OTE1YWZjNSJ9.eYHPomVhP_-k_upqcQMOifWpwDoqWfILm9FaoYBmx7w",
  "access_expires_at": "2026-10-28T09:40:39.817801334Z",
  "refresh_token": "xSfVPQ9bLik764oSVZu6Yvt6aRU0ZEyKGKBgKxNiH3Y",
  "refresh_expires_at": "2026-11-27T09:25:39.817273864Z",
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
  "correlation_id": "8ebf7640-2ccc-4947-b100-7185a51eeb6a"
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
  "device_ref": "sandbox-28641"
}
```

```json
{
  "challenge_id": "d4bfe4a9-f8f4-40bc-93ff-425c39bebd53",
  "expires_at": "2026-10-28T09:30:39.876573043Z",
  "resend_available_at": "2026-10-28T09:25:40.876573043Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "009091",
  "sent_at": "2026-10-28T09:25:39.878126893Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4bfe4a9-f8f4-40bc-93ff-425c39bebd53",
  "code": "009091",
  "device_ref": "sandbox-28641"
}
```

```json
{
  "session_id": "ded223d1-6ac4-4bdc-80ff-0692c17cad36",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDQzOSwiaWF0IjoxNzkzMTc5NTM5LCJqdGkiOiI4M2JiZmJkZC03NWMzLTQzOWMtODE5NC0xMjcxZDkzMDU4YTciLCJzaWQiOiJkZWQyMjNkMS02YWM0LTRiZGMtODBmZi0wNjkyYzE3Y2FkMzYifQ.mVmRVBSPhu-LAREFKpMDllS0BKJgOTj7jB2dTLbaa-A",
  "access_expires_at": "2026-10-28T09:40:39.920043363Z",
  "refresh_token": "Qgw3PAUpGOzjFqlCFfUhbZ-r1VlAv9p3am_pYwsj9Vs",
  "refresh_expires_at": "2026-11-27T09:25:39.919588587Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "92e936d7-a337-4fcd-8ae6-a9e045766bb3",
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
  "last_heartbeat_at": "2026-10-28T09:25:27.959149Z",
  "last_location_at": "2026-10-28T09:25:27.959149Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/92e936d7-a337-4fcd-8ae6-a9e045766bb3/handover` → **200**

```json
{
  "command_id": "755e35ee-42c6-432b-89d1-737c2f220778",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "92e936d7-a337-4fcd-8ae6-a9e045766bb3",
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
  "last_heartbeat_at": "2026-10-28T09:25:27.959149Z",
  "last_location_at": "2026-10-28T09:25:27.959149Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/92e936d7-a337-4fcd-8ae6-a9e045766bb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:39Z",
    "sequence": 1793179539979
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "92e936d7-a337-4fcd-8ae6-a9e045766bb3",
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
  "last_heartbeat_at": "2026-10-28T09:25:39.993014Z",
  "last_location_at": "2026-10-28T09:25:39.993014Z",
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
  "session_id": "92e936d7-a337-4fcd-8ae6-a9e045766bb3",
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
  "last_heartbeat_at": "2026-10-28T09:25:39.993014Z",
  "last_location_at": "2026-10-28T09:25:39.993014Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/92e936d7-a337-4fcd-8ae6-a9e045766bb3/close` → **200**

```json
{
  "command_id": "0aedfda8-d454-4b88-a89f-02d4d198ce1e",
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
  "correlation_id": "54935ff6-b39a-4ea3-9b6a-038a37083261"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673666146",
  "device_ref": "sandbox-3268"
}
```

```json
{
  "challenge_id": "eed91cbd-5e30-4e83-b906-e9e3fc1ae59f",
  "expires_at": "2026-10-28T09:30:40.10475913Z",
  "resend_available_at": "2026-10-28T09:25:41.10475913Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673666146` → **200**

```json
{
  "phone": "+380673666146",
  "audience": "CLIENT",
  "code": "693855",
  "sent_at": "2026-10-28T09:25:40.141344251Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eed91cbd-5e30-4e83-b906-e9e3fc1ae59f",
  "code": "693855",
  "device_ref": "sandbox-3268"
}
```

```json
{
  "session_id": "e693284e-2a56-4735-a012-8124c7a6d3b9",
  "subject": {
    "type": "CLIENT",
    "id": "7c84d5c8-8c33-4b73-b3f8-9b90ae15553d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Yzg0ZDVjOC04YzMzLTRiNzMtYjNmOC05YjkwYWUxNTU1M2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwNDQwLCJpYXQiOjE3OTMxNzk1NDAsImp0aSI6ImVmNmU1YjRkLWE3MDItNGVjYy1iYmM5LTUyMGRkYzUwYWVjMyIsInNpZCI6ImU2OTMyODRlLTJhNTYtNDczNS1hMDEyLTgxMjRjN2E2ZDNiOSJ9.VLhOJFh01HwuiNOf6HnYqROKiSupl-r-E38xZpCCSTI",
  "access_expires_at": "2026-10-28T09:40:40.194802053Z",
  "refresh_token": "iLL6oT7IYWFvCSQSM_rw5c-wClga4SY8tbagHGO0lvw",
  "refresh_expires_at": "2026-11-27T09:25:40.194338755Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "70d2b204-c353-4b70-82c8-17cb9474e933",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f3edab89-bbf8-4766-862c-c92b844242a2",
  "upload_path": "/api/rider/v1/uploads/f3edab89-bbf8-4766-862c-c92b844242a2",
  "expires_at": "2026-10-28T09:40:40.23080371Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/f3edab89-bbf8-4766-862c-c92b844242a2` → **200**

```json
{
  "file_id": "f3edab89-bbf8-4766-862c-c92b844242a2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "b6a9d3bb-c50f-49eb-bda0-ee2afb23525f",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "f3edab89-bbf8-4766-862c-c92b844242a2"
  ]
}
```

```json
{
  "id": "c5536307-18dc-4499-8d11-8586c0d173c5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "7c84d5c8-8c33-4b73-b3f8-9b90ae15553d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T09:25:40.285713Z",
  "updated_at": "2026-10-28T09:25:40.285713Z",
  "messages": [
    {
      "id": "97870401-251c-4756-8075-8d480c4bbe46",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "7c84d5c8-8c33-4b73-b3f8-9b90ae15553d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:25:40.287028Z",
      "attachments": [
        {
          "file_id": "f3edab89-bbf8-4766-862c-c92b844242a2",
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
  "session_id": "7161c850-0770-4088-97f8-7be216555504",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0NDAsImlhdCI6MTc5MzE3OTU0MCwianRpIjoiMDExNWQ3MDctM2VlNi00N2Y3LWEwZmQtMDJjNzRiMTYzOTdjIiwic2lkIjoiNzE2MWM4NTAtMDc3MC00MDg4LTk3ZjgtN2JlMjE2NTU1NTA0In0.-uiS9k5yb6x4alpjhlkRnr8yQ2gR-RvaV6cr6gXMOzk",
  "access_expires_at": "2026-10-28T09:40:40.622552172Z",
  "refresh_token": "KobysuZNX67WVryvc13uvL5LsDbDqFB2zyKWAVf9Qc8",
  "refresh_expires_at": "2026-10-28T21:25:40.622070597Z",
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
  "session_id": "856e56b3-ff23-43b1-9fda-fcc39373d3a7",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0NDAsImlhdCI6MTc5MzE3OTU0MCwianRpIjoiMDM5YmU0ZGUtMWY4YS00NzA0LWE2ZDktYjM5OGZlZTA2OTA4Iiwic2lkIjoiODU2ZTU2YjMtZmYyMy00M2IxLTlmZGEtZmNjMzkzNzNkM2E3In0.VvNR51xRtKH1Z15GBrfPjCOB1jlv89U7Sv-P7UQ9QHg",
  "access_expires_at": "2026-10-28T09:40:40.923928062Z",
  "refresh_token": "ZK1gT0NhtrhFMfuBhstOBFJU5jpEOrvNFjdO9FclLBg",
  "refresh_expires_at": "2026-10-28T21:25:40.923524321Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/c5536307-18dc-4499-8d11-8586c0d173c5/attachments/f3edab89-bbf8-4766-862c-c92b844242a2` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "9489489f-f7ba-45e9-9c64-0fdbe922fcd3",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "7e1169a7-567a-478b-b593-728538eddd28",
  "upload_path": "/api/operator/v1/uploads/7e1169a7-567a-478b-b593-728538eddd28",
  "expires_at": "2026-10-28T09:40:40.961212894Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/7e1169a7-567a-478b-b593-728538eddd28` → **200**

```json
{
  "file_id": "7e1169a7-567a-478b-b593-728538eddd28",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/c5536307-18dc-4499-8d11-8586c0d173c5` → **200**

```json
{
  "id": "c5536307-18dc-4499-8d11-8586c0d173c5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "7c84d5c8-8c33-4b73-b3f8-9b90ae15553d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T09:25:40.285713Z",
  "updated_at": "2026-10-28T09:25:40.285713Z",
  "messages": [
    {
      "id": "97870401-251c-4756-8075-8d480c4bbe46",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "7c84d5c8-8c33-4b73-b3f8-9b90ae15553d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:25:40.287028Z",
      "attachments": [
        {
          "file_id": "f3edab89-bbf8-4766-862c-c92b844242a2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/c5536307-18dc-4499-8d11-8586c0d173c5/comments` → **200**

```json
{
  "command_id": "181d2feb-66d7-43f2-a183-5107acb24320",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "7e1169a7-567a-478b-b593-728538eddd28"
  ]
}
```

```json
{
  "id": "c5536307-18dc-4499-8d11-8586c0d173c5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "7c84d5c8-8c33-4b73-b3f8-9b90ae15553d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T09:25:40.285713Z",
  "updated_at": "2026-10-28T09:25:41.039202Z",
  "messages": [
    {
      "id": "97870401-251c-4756-8075-8d480c4bbe46",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "7c84d5c8-8c33-4b73-b3f8-9b90ae15553d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:25:40.287028Z",
      "attachments": [
        {
          "file_id": "f3edab89-bbf8-4766-862c-c92b844242a2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "ec7b6941-eb90-4b80-b0f4-c7c3c1fc2823",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T09:25:41.038812Z",
      "attachments": [
        {
          "file_id": "7e1169a7-567a-478b-b593-728538eddd28",
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

`GET /api/rider/v1/support/cases/c5536307-18dc-4499-8d11-8586c0d173c5` → **200**

```json
{
  "id": "c5536307-18dc-4499-8d11-8586c0d173c5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "7c84d5c8-8c33-4b73-b3f8-9b90ae15553d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T09:25:40.285713Z",
  "updated_at": "2026-10-28T09:25:41.039202Z",
  "messages": [
    {
      "id": "97870401-251c-4756-8075-8d480c4bbe46",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "7c84d5c8-8c33-4b73-b3f8-9b90ae15553d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:25:40.287028Z",
      "attachments": [
        {
          "file_id": "f3edab89-bbf8-4766-862c-c92b844242a2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "ec7b6941-eb90-4b80-b0f4-c7c3c1fc2823",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T09:25:41.038812Z",
      "attachments": [
        {
          "file_id": "7e1169a7-567a-478b-b593-728538eddd28",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/c5536307-18dc-4499-8d11-8586c0d173c5/attachments/7e1169a7-567a-478b-b593-728538eddd28` → **200**

Done: support case c5536307-18dc-4499-8d11-8586c0d173c5, rider attachment f3edab89-bbf8-4766-862c-c92b844242a2, operator attachment 7e1169a7-567a-478b-b593-728538eddd28.

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
  "session_id": "22360704-8650-4f59-b359-47d6d15219c4",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0NDEsImlhdCI6MTc5MzE3OTU0MSwianRpIjoiNjcxN2IwODUtMzdkZC00Y2VkLWE0YjEtYzA1NTQ3ZWU1NjIxIiwic2lkIjoiMjIzNjA3MDQtODY1MC00ZjU5LWIzNTktNDdkNmQxNTIxOWM0In0.ccUwCwkL_w6cCB-5DhrukhJQoYQDDGRFl-SksrBvumc",
  "access_expires_at": "2026-10-28T09:40:41.38817439Z",
  "refresh_token": "BwBePqs62-hGnUcfpGZgLUZPp98MogyGi0FZlNHvFxI",
  "refresh_expires_at": "2026-10-28T21:25:41.38779476Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2249"
}
```

```json
{
  "challenge_id": "9e6c8b90-3648-458b-b308-cf77bfe1d8d6",
  "expires_at": "2026-10-28T09:30:41.411632544Z",
  "resend_available_at": "2026-10-28T09:25:42.411632544Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "854612",
  "sent_at": "2026-10-28T09:25:41.413582672Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e6c8b90-3648-458b-b308-cf77bfe1d8d6",
  "code": "854612",
  "device_ref": "sandbox-2249"
}
```

```json
{
  "session_id": "a39f9e26-8825-4dbb-9c38-b1c28a1b4f16",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDQ0MSwiaWF0IjoxNzkzMTc5NTQxLCJqdGkiOiI5NjJhMTE0YS1iN2ZjLTQwOWYtOTZjNi1lNmVjZTIzNzQzMjMiLCJzaWQiOiJhMzlmOWUyNi04ODI1LTRkYmItOWMzOC1iMWMyOGExYjRmMTYifQ.SUZhg71qrv5j_QOJ9bFCD15x-t2WUW3BMOh3F97QjP8",
  "access_expires_at": "2026-10-28T09:40:41.463518048Z",
  "refresh_token": "xDE7KfReMOB864avgwx8zfjgkCMB5Vq1JsP1zi1cLMw",
  "refresh_expires_at": "2026-11-27T09:25:41.463006487Z",
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
      "actor_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:25:38.932567Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "f81b9756-80b3-4968-b0cd-cdc62bf31550",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T09:25:39.307827Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "6239fbfa-aac0-40aa-b760-8500ca7ad1d0",
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
  "device_ref": "sandbox-32383"
}
```

```json
{
  "challenge_id": "d1440acf-b8c5-4eb5-8381-e31baa3fabfe",
  "expires_at": "2026-10-28T09:30:41.554374334Z",
  "resend_available_at": "2026-10-28T09:25:42.554374334Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "323902",
  "sent_at": "2026-10-28T09:25:41.555844018Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1440acf-b8c5-4eb5-8381-e31baa3fabfe",
  "code": "323902",
  "device_ref": "sandbox-32383"
}
```

```json
{
  "session_id": "c8e52c9e-912f-4958-85d4-83f8c65b8a1f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDQ0MSwiaWF0IjoxNzkzMTc5NTQxLCJqdGkiOiI1ZGEwZTg1Mi04NmFjLTRkZTctODI3Zi1hOTExMTA3YzJkNTciLCJzaWQiOiJjOGU1MmM5ZS05MTJmLTQ5NTgtODVkNC04M2Y4YzY1YjhhMWYifQ.pPVHxTuICO7iwoDsOPL4ma04X05glacPCWxIb1pVQL4",
  "access_expires_at": "2026-10-28T09:40:41.596139201Z",
  "refresh_token": "nJdMG1R0JPWd9uzSgVqzrLphjvCEBmu2TR7M7ekVu0w",
  "refresh_expires_at": "2026-11-27T09:25:41.595662312Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2254623f-e2aa-4267-98e4-0ebdef58b520",
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
  "last_heartbeat_at": "2026-10-28T09:25:28.839081Z",
  "last_location_at": "2026-10-28T09:25:28.839081Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2254623f-e2aa-4267-98e4-0ebdef58b520/handover` → **200**

```json
{
  "command_id": "b9b38fac-7e1e-459e-8add-9f67e524e901",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2254623f-e2aa-4267-98e4-0ebdef58b520",
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
  "last_heartbeat_at": "2026-10-28T09:25:28.839081Z",
  "last_location_at": "2026-10-28T09:25:28.839081Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2254623f-e2aa-4267-98e4-0ebdef58b520/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:41Z",
    "sequence": 1793179541656
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2254623f-e2aa-4267-98e4-0ebdef58b520",
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
  "last_heartbeat_at": "2026-10-28T09:25:41.669084Z",
  "last_location_at": "2026-10-28T09:25:41.669084Z",
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
  "command_id": "04144779-172e-428a-bfc3-f94598ea494d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:41Z",
    "sequence": 1793179541703
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4dd4031e-9bd3-4499-9d29-274321a85d42",
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
  "last_heartbeat_at": "2026-10-28T09:25:41.716351Z",
  "last_location_at": "2026-10-28T09:25:41.716351Z",
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
  "session_id": "2059ea12-4575-428a-ab54-580f1c84e11e",
  "subject": {
    "type": "STAFF",
    "id": "f81b9756-80b3-4968-b0cd-cdc62bf31550"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODFiOTc1Ni04MGIzLTQ5NjgtYjBjZC1jZGM2MmJmMzE1NTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODA0NDIsImlhdCI6MTc5MzE3OTU0MiwianRpIjoiZjc5MGFkZTQtZjBkZS00NThmLWFiOGQtZjA3MDI4MmY4NGU1Iiwic2lkIjoiMjA1OWVhMTItNDU3NS00MjhhLWFiNTQtNTgwZjFjODRlMTFlIn0.hSVsF1cd3St8cN9Yuvka-nKmNfNfpl_LtkCjiqj9-YQ",
  "access_expires_at": "2026-10-28T09:40:42.01688199Z",
  "refresh_token": "79-FdojKUo9BHMLyuLjOtHCFc_QxpMBbJ31rHZ8xZn0",
  "refresh_expires_at": "2026-10-28T21:25:42.016401347Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5cb7f80a-835d-47f5-967e-b08ae123c857",
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
  "id": "bd4f46e7-f2d9-4610-b13c-0c0fb79d28ce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:30:42.043628Z",
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
  "command_id": "ccebd9f4-3852-4b24-8763-df9ef987a232",
  "quote_id": "bd4f46e7-f2d9-4610-b13c-0c0fb79d28ce",
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
  "id": "850077f5-88e8-40a0-8f9d-8a36790a450a",
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
  "created_at": "2026-10-28T09:25:42.072544Z",
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
    "id": "adf17ebe-c320-42eb-b55d-bac07e7233fb",
    "order_id": "850077f5-88e8-40a0-8f9d-8a36790a450a",
    "expires_at": "2026-10-28T09:25:57.077742Z",
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

`POST /api/driver/v1/offers/adf17ebe-c320-42eb-b55d-bac07e7233fb/accept` → **200**

```json
{
  "command_id": "2308f002-da8e-4233-b65d-664a53d5e10d"
}
```

```json
{
  "id": "84116f1f-a3c8-4a55-becf-c07af670fbe4",
  "order_id": "850077f5-88e8-40a0-8f9d-8a36790a450a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8b120ae1-9fe3-43fc-adbf-3da1609227a4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8b120ae1-9fe3-43fc-adbf-3da1609227a4",
  "order_id": "850077f5-88e8-40a0-8f9d-8a36790a450a",
  "assignment_id": "84116f1f-a3c8-4a55-becf-c07af670fbe4",
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

`POST /api/driver/v1/work-sessions/4dd4031e-9bd3-4499-9d29-274321a85d42/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:25:42Z",
    "sequence": 1793179542185
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4dd4031e-9bd3-4499-9d29-274321a85d42",
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
  "last_heartbeat_at": "2026-10-28T09:25:42.198027Z",
  "last_location_at": "2026-10-28T09:25:42.198027Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8b120ae1-9fe3-43fc-adbf-3da1609227a4/arrive` → **200**

```json
{
  "command_id": "8983b69c-fc58-4553-b507-da002b938afe",
  "expected_version": 0
}
```

```json
{
  "id": "8b120ae1-9fe3-43fc-adbf-3da1609227a4",
  "order_id": "850077f5-88e8-40a0-8f9d-8a36790a450a",
  "assignment_id": "84116f1f-a3c8-4a55-becf-c07af670fbe4",
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
  "arrived_at": "2026-10-28T09:25:42.224637Z",
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

`POST /api/driver/v1/trips/8b120ae1-9fe3-43fc-adbf-3da1609227a4/start` → **200**

```json
{
  "command_id": "1ebb1912-3ccf-41c7-8246-f021aab3b64d",
  "expected_version": 1
}
```

```json
{
  "id": "8b120ae1-9fe3-43fc-adbf-3da1609227a4",
  "order_id": "850077f5-88e8-40a0-8f9d-8a36790a450a",
  "assignment_id": "84116f1f-a3c8-4a55-becf-c07af670fbe4",
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
  "arrived_at": "2026-10-28T09:25:42.224637Z",
  "started_at": "2026-10-28T09:25:42.253824Z",
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

`POST /api/driver/v1/trips/8b120ae1-9fe3-43fc-adbf-3da1609227a4/complete` → **200**

```json
{
  "command_id": "0bdcf74f-9c1a-4b65-9733-5b2ea3faffdc",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:25:42Z",
  "cash_received": true
}
```

```json
{
  "id": "8b120ae1-9fe3-43fc-adbf-3da1609227a4",
  "order_id": "850077f5-88e8-40a0-8f9d-8a36790a450a",
  "assignment_id": "84116f1f-a3c8-4a55-becf-c07af670fbe4",
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
  "arrived_at": "2026-10-28T09:25:42.224637Z",
  "started_at": "2026-10-28T09:25:42.253824Z",
  "completed_at": "2026-10-28T09:25:42.284526Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/850077f5-88e8-40a0-8f9d-8a36790a450a` → **200**

```json
{
  "id": "850077f5-88e8-40a0-8f9d-8a36790a450a",
  "short_number": 20,
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
    "id": "84116f1f-a3c8-4a55-becf-c07af670fbe4",
    "order_id": "850077f5-88e8-40a0-8f9d-8a36790a450a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8b120ae1-9fe3-43fc-adbf-3da1609227a4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:25:42.072544Z",
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
  "session_id": "2254623f-e2aa-4267-98e4-0ebdef58b520",
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
  "last_heartbeat_at": "2026-10-28T09:25:41.669084Z",
  "last_location_at": "2026-10-28T09:25:41.669084Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2254623f-e2aa-4267-98e4-0ebdef58b520/close` → **200**

```json
{
  "command_id": "3097fd52-297f-4fe4-8bd3-e4467d207dae",
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
  "session_id": "4dd4031e-9bd3-4499-9d29-274321a85d42",
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
  "last_heartbeat_at": "2026-10-28T09:25:42.198027Z",
  "last_location_at": "2026-10-28T09:25:42.198027Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4dd4031e-9bd3-4499-9d29-274321a85d42/close` → **200**

```json
{
  "command_id": "5e893b15-9e62-4396-9872-ffbe2ffb717d",
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

Done: terminal order 850077f5-88e8-40a0-8f9d-8a36790a450a by Andrii (5a000000-0000-4000-8000-000000000403).
