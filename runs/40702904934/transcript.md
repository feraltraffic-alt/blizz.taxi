# Sandbox transcript (2026-10-28T14:10:05Z, bf5ed58)

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
  "correlation_id": "bd1d5384-e874-4de5-a454-110d5522770b"
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
  "session_id": "3883b5ab-2600-4910-944a-6220977b9868",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc1MTIsImlhdCI6MTc5MzE5NjYxMiwianRpIjoiYjcxNGZhMzYtN2VmMC00ZmU1LWJkOWYtYWVjZWIwMmNhYWQ2Iiwic2lkIjoiMzg4M2I1YWItMjYwMC00OTEwLTk0NGEtNjIyMDk3N2I5ODY4In0.3-YGkBZo-qL6QE22B3k-_5zPpaQG9_5wPbjKJuNJmy0",
  "access_expires_at": "2026-10-28T14:25:12.667490816Z",
  "refresh_token": "NnpfnEaIQuVE2t-79Qks4tZitrwU0bGsbN1Xna0OLIk",
  "refresh_expires_at": "2026-10-29T02:10:12.665465696Z",
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
  "session_id": "0e5c933e-bc02-4d61-bd48-3a1025193369",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc1MTQsImlhdCI6MTc5MzE5NjYxNCwianRpIjoiZjllYjNjZDctNmQyNi00ZDUwLWI0MDktZTFkYWJlMWU4YzFjIiwic2lkIjoiMGU1YzkzM2UtYmMwMi00ZDYxLWJkNDgtM2ExMDI1MTkzMzY5In0.UDAHLfq212t_EGnVN_p_DD8Pbb6VwQ4zg_zOhn-Wjrc",
  "access_expires_at": "2026-10-28T14:25:14.234427088Z",
  "refresh_token": "6zsTtulxV7MgWXiAdrnJGAjAASmLQT9RrzsDtDLAPI8",
  "refresh_expires_at": "2026-10-29T02:10:14.233481934Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "3e610cda-e274-4d76-8204-4cd5d7c2edc9",
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
  "id": "ec7d1bad-066d-455a-b21d-23cc3fc68711",
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
  "created_by": "91585543-f74c-451e-a2d9-1db88b7458e9",
  "created_at": "2026-10-28T14:10:14.551494Z",
  "updated_at": "2026-10-28T14:10:14.551494Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632266555",
  "device_ref": "sandbox-18022"
}
```

```json
{
  "challenge_id": "30c10ce3-b22a-4912-a23d-6ca0b8515bd2",
  "expires_at": "2026-10-28T14:15:14.847376323Z",
  "resend_available_at": "2026-10-28T14:10:15.847376323Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632266555` → **200**

```json
{
  "phone": "+380632266555",
  "audience": "CLIENT",
  "code": "051846",
  "sent_at": "2026-10-28T14:10:14.857648731Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30c10ce3-b22a-4912-a23d-6ca0b8515bd2",
  "code": "051846",
  "device_ref": "sandbox-18022"
}
```

```json
{
  "session_id": "5d812324-ae84-4745-a81a-92b5a9f1b2dd",
  "subject": {
    "type": "CLIENT",
    "id": "b92be421-9bd8-4814-84c5-dff60e467e44"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOTJiZTQyMS05YmQ4LTQ4MTQtODRjNS1kZmY2MGU0NjdlNDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NTE1LCJpYXQiOjE3OTMxOTY2MTUsImp0aSI6IjU2N2EzYWUyLTg3M2QtNDZlMC04MzY5LWIxYzFkZjg1MjdjMSIsInNpZCI6IjVkODEyMzI0LWFlODQtNDc0NS1hODFhLTkyYjVhOWYxYjJkZCJ9.RYSvnbO51xydsAyAKy5lTtlONA9TBh9v1OCvSc-0-Bw",
  "access_expires_at": "2026-10-28T14:25:15.183691739Z",
  "refresh_token": "9jRaFlssm1oCtqZTiCwvxfZGwYNUZwtLPXNRgviBG1I",
  "refresh_expires_at": "2026-11-27T14:10:15.182641455Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632266555` → **200**

```json
{
  "client_id": "b92be421-9bd8-4814-84c5-dff60e467e44"
}
```

`POST /api/admin/v1/rider-wallets/b92be421-9bd8-4814-84c5-dff60e467e44/top-ups` → **201**

```json
{
  "command_id": "4a0809fc-4c79-45f5-a931-96f50fb4b090",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "b92be421-9bd8-4814-84c5-dff60e467e44",
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
      "id": "a38a9c0a-5c69-40db-aed9-f2d77fb74a12",
      "at": "2026-10-28T14:10:15.746611Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4d7d5f78-7d3d-4ddb-9d92-f372466d592b",
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
  "id": "20e4563d-52cf-4e8c-877b-7d2a1315885b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:15:16.150984Z",
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
      "id": "ec7d1bad-066d-455a-b21d-23cc3fc68711",
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
  "device_ref": "sandbox-14860"
}
```

```json
{
  "challenge_id": "c19359cd-6724-4f39-9dae-fddd2edfaebc",
  "expires_at": "2026-10-28T14:15:16.476714744Z",
  "resend_available_at": "2026-10-28T14:10:17.476714744Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "702210",
  "sent_at": "2026-10-28T14:10:16.480771987Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c19359cd-6724-4f39-9dae-fddd2edfaebc",
  "code": "702210",
  "device_ref": "sandbox-14860"
}
```

```json
{
  "session_id": "ba95a00f-717b-4220-b0e5-571fa081c899",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzUxNiwiaWF0IjoxNzkzMTk2NjE2LCJqdGkiOiI5MDcxOTc5Mi1iM2Y3LTQ1MDItODZmNS0xYTI0MzJkNzhlYTIiLCJzaWQiOiJiYTk1YTAwZi03MTdiLTQyMjAtYjBlNS01NzFmYTA4MWM4OTkifQ.TC3tYMnmfbPU49Ejn3YOkiP6xTAHpjYu-h2Bnru2ErY",
  "access_expires_at": "2026-10-28T14:25:16.781775941Z",
  "refresh_token": "il2Snm5Q3zO2DxdHWsFg0cXTyKbk6X-IzrHkZi6A0fs",
  "refresh_expires_at": "2026-11-27T14:10:16.78071982Z",
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
  "command_id": "ffce7e46-edeb-40a3-9157-764f80389d4d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:10:17Z",
    "sequence": 1793196617341
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d441dae0-ea70-4bf8-a500-22fc4bb58130",
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
  "last_heartbeat_at": "2026-10-28T14:10:17.392198Z",
  "last_location_at": "2026-10-28T14:10:17.392198Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0acc6724-efed-4c44-b45f-586e7ed9a814",
  "quote_id": "20e4563d-52cf-4e8c-877b-7d2a1315885b",
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
  "id": "7529af78-1947-402e-9f43-4bdb07a48445",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b92be421-9bd8-4814-84c5-dff60e467e44",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:10:17.729705Z",
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
  "client_id": "b92be421-9bd8-4814-84c5-dff60e467e44",
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
      "id": "a38a9c0a-5c69-40db-aed9-f2d77fb74a12",
      "at": "2026-10-28T14:10:15.746611Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "91585543-f74c-451e-a2d9-1db88b7458e9",
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
    "id": "f8150eed-3ee9-42b8-a96e-5b5b5140b014",
    "order_id": "7529af78-1947-402e-9f43-4bdb07a48445",
    "expires_at": "2026-10-28T14:10:32.744833Z",
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

`POST /api/driver/v1/offers/f8150eed-3ee9-42b8-a96e-5b5b5140b014/accept` → **200**

```json
{
  "command_id": "adc706f3-f2d2-4a73-a891-4a4329944dc0"
}
```

```json
{
  "id": "0b04a5dd-7e53-4641-aaef-45e8c52c0ff2",
  "order_id": "7529af78-1947-402e-9f43-4bdb07a48445",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "350f9c11-a884-4c06-9280-bd4b7acb3aa0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "350f9c11-a884-4c06-9280-bd4b7acb3aa0",
  "order_id": "7529af78-1947-402e-9f43-4bdb07a48445",
  "assignment_id": "0b04a5dd-7e53-4641-aaef-45e8c52c0ff2",
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

`POST /api/driver/v1/work-sessions/d441dae0-ea70-4bf8-a500-22fc4bb58130/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:10:19Z",
    "sequence": 1793196619177
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d441dae0-ea70-4bf8-a500-22fc4bb58130",
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
  "last_heartbeat_at": "2026-10-28T14:10:19.203971Z",
  "last_location_at": "2026-10-28T14:10:19.203971Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/350f9c11-a884-4c06-9280-bd4b7acb3aa0/arrive` → **200**

```json
{
  "command_id": "f29c5405-36cb-4855-9d55-be3b728dadd6",
  "expected_version": 0
}
```

```json
{
  "id": "350f9c11-a884-4c06-9280-bd4b7acb3aa0",
  "order_id": "7529af78-1947-402e-9f43-4bdb07a48445",
  "assignment_id": "0b04a5dd-7e53-4641-aaef-45e8c52c0ff2",
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
  "arrived_at": "2026-10-28T14:10:19.501292Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/350f9c11-a884-4c06-9280-bd4b7acb3aa0/start` → **200**

```json
{
  "command_id": "f72058ed-80c7-4866-8602-033fc5a7ddce",
  "expected_version": 1
}
```

```json
{
  "id": "350f9c11-a884-4c06-9280-bd4b7acb3aa0",
  "order_id": "7529af78-1947-402e-9f43-4bdb07a48445",
  "assignment_id": "0b04a5dd-7e53-4641-aaef-45e8c52c0ff2",
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
  "arrived_at": "2026-10-28T14:10:19.501292Z",
  "started_at": "2026-10-28T14:10:19.797578Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/350f9c11-a884-4c06-9280-bd4b7acb3aa0/complete` → **200**

```json
{
  "command_id": "aa083564-5a4e-4f0b-b923-f6783550f3cf",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:10:20Z",
  "cash_received": true
}
```

```json
{
  "id": "350f9c11-a884-4c06-9280-bd4b7acb3aa0",
  "order_id": "7529af78-1947-402e-9f43-4bdb07a48445",
  "assignment_id": "0b04a5dd-7e53-4641-aaef-45e8c52c0ff2",
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
  "arrived_at": "2026-10-28T14:10:19.501292Z",
  "started_at": "2026-10-28T14:10:19.797578Z",
  "completed_at": "2026-10-28T14:10:20.125185Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b92be421-9bd8-4814-84c5-dff60e467e44",
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
      "id": "a338f655-3886-4ccb-9d99-8480d1cd1aab",
      "at": "2026-10-28T14:10:20.791358Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "7529af78-1947-402e-9f43-4bdb07a48445"
    },
    {
      "id": "a38a9c0a-5c69-40db-aed9-f2d77fb74a12",
      "at": "2026-10-28T14:10:15.746611Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/ec7d1bad-066d-455a-b21d-23cc3fc68711/archive` → **200**

```json
{
  "command_id": "e3757d64-b493-487a-af28-54f65013d2ac",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "ec7d1bad-066d-455a-b21d-23cc3fc68711",
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
  "created_by": "91585543-f74c-451e-a2d9-1db88b7458e9",
  "created_at": "2026-10-28T14:10:14.551494Z",
  "updated_at": "2026-10-28T14:10:23.718771Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d441dae0-ea70-4bf8-a500-22fc4bb58130",
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
  "last_heartbeat_at": "2026-10-28T14:10:19.203971Z",
  "last_location_at": "2026-10-28T14:10:19.203971Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d441dae0-ea70-4bf8-a500-22fc4bb58130/close` → **200**

```json
{
  "command_id": "dc8e51b1-52d3-4e71-994d-e50ab7775d0f",
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

Done: order 7529af78-1947-402e-9f43-4bdb07a48445.

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
  "session_id": "af4081f3-03c9-45c1-affa-ff8711306a0d",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc1MjQsImlhdCI6MTc5MzE5NjYyNCwianRpIjoiZmJiYzI0MDEtNjEyNC00ZDA4LWE5YTYtYTZkZmE1ZjVhNDY0Iiwic2lkIjoiYWY0MDgxZjMtMDNjOS00NWMxLWFmZmEtZmY4NzExMzA2YTBkIn0.kgXCBTZSszi4tau9Zggxf-Hrll__djh19Fv8zkFMS2s",
  "access_expires_at": "2026-10-28T14:25:24.89074663Z",
  "refresh_token": "XmJmXA2GiXRRh98uSYfgZ-jtHl091tFrovlSaOZqX84",
  "refresh_expires_at": "2026-10-29T02:10:24.889914046Z",
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
  "command_id": "724239f4-0dd6-44c2-939f-fa8369f9f291",
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
  "session_id": "32d7021a-99eb-418e-ba95-daf8d5d56236",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc1MjYsImlhdCI6MTc5MzE5NjYyNiwianRpIjoiNjQ0OGM0N2QtYjkxMS00NzNkLTlkMjktMDVlMmU2ZGU2YWU2Iiwic2lkIjoiMzJkNzAyMWEtOTllYi00MThlLWJhOTUtZGFmOGQ1ZDU2MjM2In0.qrZK3kKUDewz5UhWZcDo0DSdeUMDXiMKUrXPLSPsXgc",
  "access_expires_at": "2026-10-28T14:25:26.044182057Z",
  "refresh_token": "tCzYnY_R5lU7lJrRZpUZS3_ULJ0qgYEj1dWjaGoR6aA",
  "refresh_expires_at": "2026-10-29T02:10:26.043237123Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2243911164",
    "linkedid": "1730052700.2243911164",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671401130"
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
    "id": "1730052700.2243911164",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "8fb4666c-0a57-43ab-a1e0-b845df85ba75",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671401130",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:10:26.313724Z",
      "answered_at": null,
      "ended_at": "2026-10-28T14:10:26.341254Z",
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
    "id": "1730052600.902922517",
    "linkedid": "1730052600.902922517",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671401130"
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
      "id": "c8ad217a-84e3-4d60-b2f2-df1813017d72",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671401130",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:10:26.669906Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/c8ad217a-84e3-4d60-b2f2-df1813017d72/answer` → **200**

```json
{
  "command_id": "90946908-957a-47f6-b08e-da75164a6211"
}
```

```json
{
  "id": "c8ad217a-84e3-4d60-b2f2-df1813017d72",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671401130",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "91585543-f74c-451e-a2d9-1db88b7458e9",
  "order_ids": [],
  "started_at": "2026-10-28T14:10:26.669906Z",
  "answered_at": "2026-10-28T14:10:26.999246Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.902922517",
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
    "id": "1730052600.902922517",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "c8ad217a-84e3-4d60-b2f2-df1813017d72",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671401130",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "order_ids": [],
      "started_at": "2026-10-28T14:10:26.669906Z",
      "answered_at": "2026-10-28T14:10:26.999246Z",
      "ended_at": "2026-10-28T14:10:27.298917Z",
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
      "id": "c8ad217a-84e3-4d60-b2f2-df1813017d72",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671401130",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "order_ids": [],
      "started_at": "2026-10-28T14:10:26.669906Z",
      "answered_at": "2026-10-28T14:10:26.999246Z",
      "ended_at": "2026-10-28T14:10:27.298917Z",
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
      "id": "c8ad217a-84e3-4d60-b2f2-df1813017d72",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671401130",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "order_ids": [],
      "started_at": "2026-10-28T14:10:26.669906Z",
      "answered_at": "2026-10-28T14:10:26.999246Z",
      "ended_at": "2026-10-28T14:10:27.298917Z",
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
      "id": "c8ad217a-84e3-4d60-b2f2-df1813017d72",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671401130",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "order_ids": [],
      "started_at": "2026-10-28T14:10:26.669906Z",
      "answered_at": "2026-10-28T14:10:26.999246Z",
      "ended_at": "2026-10-28T14:10:27.298917Z",
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
      "id": "c8ad217a-84e3-4d60-b2f2-df1813017d72",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671401130",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "order_ids": [],
      "started_at": "2026-10-28T14:10:26.669906Z",
      "answered_at": "2026-10-28T14:10:26.999246Z",
      "ended_at": "2026-10-28T14:10:27.298917Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:10:34.559014Z"
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
      "id": "c8ad217a-84e3-4d60-b2f2-df1813017d72",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671401130",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "order_ids": [],
      "started_at": "2026-10-28T14:10:26.669906Z",
      "answered_at": "2026-10-28T14:10:26.999246Z",
      "ended_at": "2026-10-28T14:10:27.298917Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:10:34.559014Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/c8ad217a-84e3-4d60-b2f2-df1813017d72/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/c8ad217a-84e3-4d60-b2f2-df1813017d72/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=c8ad217a-84e3-4d60-b2f2-df1813017d72` → **200**

```json
{
  "changes": [
    {
      "id": "b089942c-32f9-422f-ad3f-f4f55a96d491",
      "occurred_at": "2026-10-28T14:10:37.077647Z",
      "actor_type": "STAFF",
      "actor_id": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "c8ad217a-84e3-4d60-b2f2-df1813017d72",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"8f659ef7-1b51-4cf4-b299-5b3502013d7e\", \"order_ids\": []}",
      "correlation_id": "ad4d6660-2046-4304-b0f0-683598c1a00f"
    },
    {
      "id": "46b540be-ff60-4849-91f0-c327dc853136",
      "occurred_at": "2026-10-28T14:10:37.040925Z",
      "actor_type": "STAFF",
      "actor_id": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "c8ad217a-84e3-4d60-b2f2-df1813017d72",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"8f659ef7-1b51-4cf4-b299-5b3502013d7e\", \"order_ids\": []}",
      "correlation_id": "6ab06d36-f75c-435d-9887-285099c7a77c"
    }
  ]
}
```

Done: call c8ad217a-84e3-4d60-b2f2-df1813017d72 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32446"
}
```

```json
{
  "challenge_id": "4fa77bf8-75ac-46b5-a953-e58cb2dfc49a",
  "expires_at": "2026-10-28T14:15:37.399741879Z",
  "resend_available_at": "2026-10-28T14:10:38.399741879Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "116359",
  "sent_at": "2026-10-28T14:10:37.403804481Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fa77bf8-75ac-46b5-a953-e58cb2dfc49a",
  "code": "116359",
  "device_ref": "sandbox-32446"
}
```

```json
{
  "session_id": "c10a08ba-c5cd-4170-af28-a9d5f715da5d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzUzNywiaWF0IjoxNzkzMTk2NjM3LCJqdGkiOiJmNWEzYmI0Yy02YzIxLTRlYTktOWJhYS1lYmJhOGNiOTFhOWEiLCJzaWQiOiJjMTBhMDhiYS1jNWNkLTQxNzAtYWYyOC1hOWQ1ZjcxNWRhNWQifQ.UJYqbMFxG0hrssmbJjBUOu5772QtN1fCLL1AChlthzM",
  "access_expires_at": "2026-10-28T14:25:37.704990844Z",
  "refresh_token": "rDchQYTZrLberfPu5dZaI3pRtxXbbxcakKO8gcttCo4",
  "refresh_expires_at": "2026-11-27T14:10:37.704202552Z",
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
  "command_id": "fa046ddb-60ce-4085-bba8-62e6ff6e1ca2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:10:38Z",
    "sequence": 1793196638249
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d62f725c-09e5-4bca-8faf-947c64082b7e",
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
  "last_heartbeat_at": "2026-10-28T14:10:38.271933Z",
  "last_location_at": "2026-10-28T14:10:38.271933Z",
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
  "session_id": "0a7e018f-01cd-4cd4-a635-e86b226cc3d9",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc1MzgsImlhdCI6MTc5MzE5NjYzOCwianRpIjoiMGYzYjU1NTAtNGRjYi00YTA1LWE2NDMtMjM4NDVkOWNhMTg5Iiwic2lkIjoiMGE3ZTAxOGYtMDFjZC00Y2Q0LWE2MzUtZTg2YjIyNmNjM2Q5In0.PURJxSs3GNnHOKm2_C0sy5smzeR5AOWqNErU_XIdWIQ",
  "access_expires_at": "2026-10-28T14:25:38.845911509Z",
  "refresh_token": "qRqEvo9wcFnZy2yd6jl6-ZRq6sNju2HIn0xSC4nJVUw",
  "refresh_expires_at": "2026-10-29T02:10:38.845259832Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6532216a-a4f0-4113-b1eb-d3358297c81a",
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
  "id": "61d3c222-6808-4d35-9de0-83bd3510a61e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:15:39.140159Z",
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
  "command_id": "3b1b2215-b4b3-40de-bc36-ac91ab7e2a58",
  "quote_id": "61d3c222-6808-4d35-9de0-83bd3510a61e",
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
    "phone": "+380677414367"
  }
}
```

```json
{
  "id": "cb4ec4e9-836c-4acc-b840-c726ef88fdca",
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
  "created_at": "2026-10-28T14:10:39.460106Z",
  "caller": {
    "name": "Олена",
    "phone": "+380677414367"
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
    "id": "f4d56993-13bd-44fa-b6fb-bd6d458fdec0",
    "order_id": "cb4ec4e9-836c-4acc-b840-c726ef88fdca",
    "expires_at": "2026-10-28T14:10:54.466684Z",
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

`POST /api/driver/v1/offers/f4d56993-13bd-44fa-b6fb-bd6d458fdec0/accept` → **200**

```json
{
  "command_id": "c47ea280-971f-4bbc-b6bc-cd8eecb8d8f1"
}
```

```json
{
  "id": "061e407a-cbe5-4c6d-a147-33b97decff99",
  "order_id": "cb4ec4e9-836c-4acc-b840-c726ef88fdca",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "399972f8-081b-4686-8764-5bb217e1534b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380677414367` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677414367` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677414367` → **200**

```json
[
  {
    "phone": "+380677414367",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:10:41.747296872Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677414367` → **200**

```json
[
  {
    "phone": "+380677414367",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:10:41.747296872Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677414367` → **200**

```json
[
  {
    "phone": "+380677414367",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:10:41.747296872Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "399972f8-081b-4686-8764-5bb217e1534b",
  "order_id": "cb4ec4e9-836c-4acc-b840-c726ef88fdca",
  "assignment_id": "061e407a-cbe5-4c6d-a147-33b97decff99",
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
    "phone": "+380677414367"
  }
}
```

`POST /api/driver/v1/work-sessions/d62f725c-09e5-4bca-8faf-947c64082b7e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:10:42Z",
    "sequence": 1793196642762
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d62f725c-09e5-4bca-8faf-947c64082b7e",
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
  "last_heartbeat_at": "2026-10-28T14:10:42.784809Z",
  "last_location_at": "2026-10-28T14:10:42.784809Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/399972f8-081b-4686-8764-5bb217e1534b/arrive` → **200**

```json
{
  "command_id": "e379cac6-9bb5-4d84-a313-7799dc0a2058",
  "expected_version": 0
}
```

```json
{
  "id": "399972f8-081b-4686-8764-5bb217e1534b",
  "order_id": "cb4ec4e9-836c-4acc-b840-c726ef88fdca",
  "assignment_id": "061e407a-cbe5-4c6d-a147-33b97decff99",
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
  "arrived_at": "2026-10-28T14:10:43.077228Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677414367"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380677414367` → **200**

```json
[
  {
    "phone": "+380677414367",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:10:41.747296872Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677414367` → **200**

```json
[
  {
    "phone": "+380677414367",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:10:41.747296872Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677414367` → **200**

```json
[
  {
    "phone": "+380677414367",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:10:41.747296872Z"
  },
  {
    "phone": "+380677414367",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:10:44.758423311Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677414367` → **200**

```json
[
  {
    "phone": "+380677414367",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:10:41.747296872Z"
  },
  {
    "phone": "+380677414367",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:10:44.758423311Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677414367` → **200**

```json
[
  {
    "phone": "+380677414367",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:10:41.747296872Z"
  },
  {
    "phone": "+380677414367",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:10:44.758423311Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/399972f8-081b-4686-8764-5bb217e1534b/start` → **200**

```json
{
  "command_id": "e76aef70-1afd-4cb2-8e06-8ad5d6179578",
  "expected_version": 1
}
```

```json
{
  "id": "399972f8-081b-4686-8764-5bb217e1534b",
  "order_id": "cb4ec4e9-836c-4acc-b840-c726ef88fdca",
  "assignment_id": "061e407a-cbe5-4c6d-a147-33b97decff99",
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
  "arrived_at": "2026-10-28T14:10:43.077228Z",
  "started_at": "2026-10-28T14:10:45.507133Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677414367"
  }
}
```

`POST /api/driver/v1/trips/399972f8-081b-4686-8764-5bb217e1534b/complete` → **200**

```json
{
  "command_id": "fdb16018-64a7-4e67-8092-29f4afa96d82",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:10:45Z",
  "cash_received": true
}
```

```json
{
  "id": "399972f8-081b-4686-8764-5bb217e1534b",
  "order_id": "cb4ec4e9-836c-4acc-b840-c726ef88fdca",
  "assignment_id": "061e407a-cbe5-4c6d-a147-33b97decff99",
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
  "arrived_at": "2026-10-28T14:10:43.077228Z",
  "started_at": "2026-10-28T14:10:45.507133Z",
  "completed_at": "2026-10-28T14:10:45.804863Z",
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
  "session_id": "d62f725c-09e5-4bca-8faf-947c64082b7e",
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
  "last_heartbeat_at": "2026-10-28T14:10:42.784809Z",
  "last_location_at": "2026-10-28T14:10:42.784809Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d62f725c-09e5-4bca-8faf-947c64082b7e/close` → **200**

```json
{
  "command_id": "d245900d-122e-469d-8502-49cc76e545b8",
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
  "phone": "+380634979854",
  "device_ref": "sandbox-29146"
}
```

```json
{
  "challenge_id": "8a119287-9af0-4678-9031-69cd4c3a1ccd",
  "expires_at": "2026-10-28T14:15:46.692098619Z",
  "resend_available_at": "2026-10-28T14:10:47.692098619Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634979854` → **200**

```json
{
  "phone": "+380634979854",
  "audience": "CLIENT",
  "code": "449277",
  "sent_at": "2026-10-28T14:10:46.696449131Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a119287-9af0-4678-9031-69cd4c3a1ccd",
  "code": "449277",
  "device_ref": "sandbox-29146"
}
```

```json
{
  "session_id": "14de67ef-b94c-4f61-8284-ef07605ae90d",
  "subject": {
    "type": "CLIENT",
    "id": "6e2d6685-7cf1-4216-bbee-e5b50721b66b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTJkNjY4NS03Y2YxLTQyMTYtYmJlZS1lNWI1MDcyMWI2NmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NTQ3LCJpYXQiOjE3OTMxOTY2NDcsImp0aSI6IjE3YWE5MTNiLTRiZTMtNDZlYy04YTMyLWNhYTQ2Y2UxOWVlNCIsInNpZCI6IjE0ZGU2N2VmLWI5NGMtNGY2MS04Mjg0LWVmMDc2MDVhZTkwZCJ9.9iBimGcbfplQgSv2kPGyUlFzGJoW4z7d91w5oJjL8qo",
  "access_expires_at": "2026-10-28T14:25:47.017879592Z",
  "refresh_token": "kExX0BJYxrxAAScRWT0rl4KbEXKSQ6stncM7oBQXNoM",
  "refresh_expires_at": "2026-11-27T14:10:47.017061988Z",
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
  "device_ref": "sandbox-29561"
}
```

```json
{
  "challenge_id": "d4e1222c-8582-4aed-a0d7-aa31762c0c18",
  "expires_at": "2026-10-28T14:15:47.559645167Z",
  "resend_available_at": "2026-10-28T14:10:48.559645167Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "312325",
  "sent_at": "2026-10-28T14:10:47.563436603Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4e1222c-8582-4aed-a0d7-aa31762c0c18",
  "code": "312325",
  "device_ref": "sandbox-29561"
}
```

```json
{
  "session_id": "88674804-178b-4e03-b24f-b7e244e5b7d9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzU0NywiaWF0IjoxNzkzMTk2NjQ3LCJqdGkiOiI2MTM2YjY0Yy1hOThjLTRkZjQtOGY3Ni1kMmI0OGU1N2Q5Y2QiLCJzaWQiOiI4ODY3NDgwNC0xNzhiLTRlMDMtYjI0Zi1iN2UyNDRlNWI3ZDkifQ.wTOaXQjiBTjeGfC1b9fpOXAAjPI32E1A8JW00q7Wr4g",
  "access_expires_at": "2026-10-28T14:25:47.865134603Z",
  "refresh_token": "yK20jxAk73XxEwLdgjaDezZtLJNIxSbQ17HXVO497rQ",
  "refresh_expires_at": "2026-11-27T14:10:47.864455245Z",
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
  "session_id": "110318ce-cc98-40ef-9e2e-0d2a38fab657",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc1NDgsImlhdCI6MTc5MzE5NjY0OCwianRpIjoiNTgyODQ2MmYtOTIxYi00ZTBjLThkMmUtZmExMGUyOTE5YjkyIiwic2lkIjoiMTEwMzE4Y2UtY2M5OC00MGVmLTllMmUtMGQyYTM4ZmFiNjU3In0.ruZTJ-acFjuqNl7MTmYMppBzjd8qJe--aUigAGxCxS0",
  "access_expires_at": "2026-10-28T14:25:48.696240855Z",
  "refresh_token": "pN2_CeP3eUwMrac6AvOBqqQYfuRNRnL_xPRYlMQq960",
  "refresh_expires_at": "2026-10-29T02:10:48.695486788Z",
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
  "session_id": "07afc2de-3359-4bc1-8faf-214ef0fd8ad8",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc1NDksImlhdCI6MTc5MzE5NjY0OSwianRpIjoiYmJiNDc2M2EtNTM1ZC00NTBmLThhMDktOTNjMWI0ZDE5MTg4Iiwic2lkIjoiMDdhZmMyZGUtMzM1OS00YmMxLThmYWYtMjE0ZWYwZmQ4YWQ4In0.drKSLTFAxqNWP4GgD6xbe6osvvYORlKU_ZUEWyA0MGE",
  "access_expires_at": "2026-10-28T14:25:49.260902158Z",
  "refresh_token": "CN8yBIUDZhcQB_IIz2M9q5TzNSJo4ir85HXUk7C-6dQ",
  "refresh_expires_at": "2026-10-29T02:10:49.260255463Z",
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
  "command_id": "da73ea1f-d94b-46cf-adda-9a3bf14ee73c",
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
  "id": "381b07bd-38a0-4465-9408-0242c290882b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:15:49.815679Z",
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
  "command_id": "7fa99554-3678-4e92-bf4b-a611fe5e0e6c",
  "quote_id": "381b07bd-38a0-4465-9408-0242c290882b",
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
  "id": "adcff49c-908d-4c70-a5c2-788ec8d2cdea",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6e2d6685-7cf1-4216-bbee-e5b50721b66b",
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
  "created_at": "2026-10-28T14:10:50.116842Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/adcff49c-908d-4c70-a5c2-788ec8d2cdea` → **200**

```json
{
  "id": "adcff49c-908d-4c70-a5c2-788ec8d2cdea",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6e2d6685-7cf1-4216-bbee-e5b50721b66b",
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
  "created_at": "2026-10-28T14:10:50.116842Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/adcff49c-908d-4c70-a5c2-788ec8d2cdea/cancel` → **200**

```json
{
  "command_id": "2ce3a5e5-19a6-4ab9-a67a-e2911d2ad584",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "adcff49c-908d-4c70-a5c2-788ec8d2cdea",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6e2d6685-7cf1-4216-bbee-e5b50721b66b",
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
  "created_at": "2026-10-28T14:10:50.116842Z",
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
  "command_id": "fcd54968-928b-4183-a4e3-e3c605d43fdc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:10:51Z",
    "sequence": 1793196651292
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e9aa3d9c-9747-4caa-87da-31ca0e0f85c9",
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
  "last_heartbeat_at": "2026-10-28T14:10:51.31362Z",
  "last_location_at": "2026-10-28T14:10:51.31362Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19900"
}
```

```json
{
  "challenge_id": "23088f24-8670-46f9-a000-e5b004ae48f3",
  "expires_at": "2026-10-28T14:15:51.588447224Z",
  "resend_available_at": "2026-10-28T14:10:52.588447224Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "624187",
  "sent_at": "2026-10-28T14:10:51.591708849Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23088f24-8670-46f9-a000-e5b004ae48f3",
  "code": "624187",
  "device_ref": "sandbox-19900"
}
```

```json
{
  "session_id": "7e275527-ab4f-4f6e-8020-cc6ee15eb7e8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzU1MSwiaWF0IjoxNzkzMTk2NjUxLCJqdGkiOiJhYWQ2ZDk3ZC0wYWU4LTQ1OGMtYTVhZS1mMDBlMDBjY2U0NWUiLCJzaWQiOiI3ZTI3NTUyNy1hYjRmLTRmNmUtODAyMC1jYzZlZTE1ZWI3ZTgifQ.Mi2I33EsBtYXLdKLIW1PfXlEy3S9mkAbKWqCfoL5Hh8",
  "access_expires_at": "2026-10-28T14:25:51.906982452Z",
  "refresh_token": "1hssHm-LqpqXDcX_br6wEYoHieaf-4S2BnLme8c8UmU",
  "refresh_expires_at": "2026-11-27T14:10:51.906184357Z",
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
  "command_id": "c8c18fb1-6661-40c5-8ac0-e18bf24a425c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:10:52Z",
    "sequence": 1793196652449
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b17188-316c-486a-8a3a-025bb0a439bc",
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
  "last_heartbeat_at": "2026-10-28T14:10:52.470378Z",
  "last_location_at": "2026-10-28T14:10:52.470378Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ceeebbc8-5eb0-4d70-b4a7-a430fa3579e6",
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
  "id": "f53d2c60-a981-4273-a9f6-d31b2e8aae0c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:15:52.757458Z",
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
  "command_id": "cae80d4c-648f-4a65-8a52-094c00808774",
  "quote_id": "f53d2c60-a981-4273-a9f6-d31b2e8aae0c",
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
  "id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6e2d6685-7cf1-4216-bbee-e5b50721b66b",
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
  "created_at": "2026-10-28T14:10:53.063174Z",
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
    "id": "b9428e71-9f9a-42af-ad58-d6cba543da3b",
    "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
    "expires_at": "2026-10-28T14:11:08.067752Z",
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

`POST /api/driver/v1/offers/b9428e71-9f9a-42af-ad58-d6cba543da3b/accept` → **200**

```json
{
  "command_id": "9a359a3c-212f-447d-90f5-4f53b0f688af"
}
```

```json
{
  "id": "93639b16-66ef-4052-8ab1-7e85e8bf4969",
  "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3267f9f1-7aee-4ac3-95e5-f8d763e76596",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3267f9f1-7aee-4ac3-95e5-f8d763e76596",
  "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
  "assignment_id": "93639b16-66ef-4052-8ab1-7e85e8bf4969",
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

`POST /api/driver/v1/trips/3267f9f1-7aee-4ac3-95e5-f8d763e76596/cancel` → **200**

```json
{
  "command_id": "e0eda689-4453-4793-a1ab-5350c527cf21",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "3267f9f1-7aee-4ac3-95e5-f8d763e76596",
  "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
  "assignment_id": "93639b16-66ef-4052-8ab1-7e85e8bf4969",
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

`GET /api/rider/v1/orders/ba1bbba8-7b67-4984-84a8-65c2652af69e` → **200**

```json
{
  "id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6e2d6685-7cf1-4216-bbee-e5b50721b66b",
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
    "id": "93639b16-66ef-4052-8ab1-7e85e8bf4969",
    "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3267f9f1-7aee-4ac3-95e5-f8d763e76596",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:10:53.063174Z",
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
    "id": "7d8efc43-e419-4256-8b83-97c1e8a48e11",
    "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
    "expires_at": "2026-10-28T14:11:09.236535Z",
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

`POST /api/driver/v1/offers/7d8efc43-e419-4256-8b83-97c1e8a48e11/accept` → **200**

```json
{
  "command_id": "5ec27e56-0a30-45f1-aae4-b06a4a287fe4"
}
```

```json
{
  "id": "25766916-06cd-4352-980a-3dcb2a3ede28",
  "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f6bfa914-4938-4e64-a143-87eb68dfb269",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f6bfa914-4938-4e64-a143-87eb68dfb269",
  "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
  "assignment_id": "25766916-06cd-4352-980a-3dcb2a3ede28",
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

`POST /api/driver/v1/trips/f6bfa914-4938-4e64-a143-87eb68dfb269/cancel` → **200**

```json
{
  "command_id": "c0a13c82-84e7-43b9-b149-556d2c4d0412",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "f6bfa914-4938-4e64-a143-87eb68dfb269",
  "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
  "assignment_id": "25766916-06cd-4352-980a-3dcb2a3ede28",
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
    "id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:10:53.063174Z",
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
    "id": "adcff49c-908d-4c70-a5c2-788ec8d2cdea",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:10:50.116842Z",
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

`GET /api/operator/v1/orders/ba1bbba8-7b67-4984-84a8-65c2652af69e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:10:53.063949Z",
      "actor": {
        "type": "CLIENT",
        "id": "6e2d6685-7cf1-4216-bbee-e5b50721b66b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
        "quote_id": "f53d2c60-a981-4273-a9f6-d31b2e8aae0c",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "651e8fb8-3102-407e-9b63-cd98a468d6a1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:10:53.066643Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
        "attempt_id": "bb7409b9-ae34-4d80-a610-31ef6a373c01",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "651e8fb8-3102-407e-9b63-cd98a468d6a1"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:10:53.07459Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b9428e71-9f9a-42af-ad58-d6cba543da3b",
        "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "651e8fb8-3102-407e-9b63-cd98a468d6a1"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:10:53.646924Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b9428e71-9f9a-42af-ad58-d6cba543da3b",
        "order_id": "ba1bbba8-7b67-4984-84a8-65c2652af69e",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "93639b16-66ef-4052-8ab1-7e85e8bf4969"
      },
      "correlation_id": "ade351e7-ef4c-4025-8ff7-e69596b48d48"
```

Done: orders adcff49c-908d-4c70-a5c2-788ec8d2cdea, ba1bbba8-7b67-4984-84a8-65c2652af69e.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732584130",
  "device_ref": "sandbox-16114"
}
```

```json
{
  "challenge_id": "245b99fe-d346-4abf-9825-d82a0a450ec6",
  "expires_at": "2026-10-28T14:15:56.546933806Z",
  "resend_available_at": "2026-10-28T14:10:57.546933806Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732584130` → **200**

```json
{
  "phone": "+380732584130",
  "audience": "CLIENT",
  "code": "801974",
  "sent_at": "2026-10-28T14:10:56.550020314Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "245b99fe-d346-4abf-9825-d82a0a450ec6",
  "code": "801974",
  "device_ref": "sandbox-16114"
}
```

```json
{
  "session_id": "a48bd3d3-6742-44be-a6e0-628380f13945",
  "subject": {
    "type": "CLIENT",
    "id": "746bd60f-bfe6-4fdc-a666-bb8294bc9a5e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NDZiZDYwZi1iZmU2LTRmZGMtYTY2Ni1iYjgyOTRiYzlhNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NTU2LCJpYXQiOjE3OTMxOTY2NTYsImp0aSI6ImUyODBhN2EwLTdmYjktNDdiMy1hNmNhLTk5MzMzNDkxODMwZSIsInNpZCI6ImE0OGJkM2QzLTY3NDItNDRiZS1hNmUwLTYyODM4MGYxMzk0NSJ9.u9TFmpXAR14TfokEM1Nuhc8aVHLczcbqDxUq7uqk9Y0",
  "access_expires_at": "2026-10-28T14:25:56.846481456Z",
  "refresh_token": "9QoOJWyFC69yJZH8fRdG0TErTQGi_HUPRaJTFgUkRe0",
  "refresh_expires_at": "2026-11-27T14:10:56.845829933Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "99f238af-15df-46a2-bee6-c99ff8f42a61",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "a74d418c-4662-402c-a143-90a9f5bbb535",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-a74d418c-4662-402c-a143-90a9f5bbb535",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c1036aa65fa8db50c38b29086c5df143",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=a74d418c-4662-402c-a143-90a9f5bbb535",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732584130"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=a74d418c-4662-402c-a143-90a9f5bbb535",
  "expires_at": "2026-10-28T14:40:57.133087Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/a74d418c-4662-402c-a143-90a9f5bbb535` → **200**

```json
{
  "id": "a74d418c-4662-402c-a143-90a9f5bbb535",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T14:40:57.133087Z",
  "card": {
    "id": "8fd9ecf1-6627-41bc-afd4-946d92b9790a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8654",
    "card_type": "Visa",
    "created_at": "2026-10-28T14:10:57.421723Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "8fd9ecf1-6627-41bc-afd4-946d92b9790a",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8654",
      "card_type": "Visa",
      "created_at": "2026-10-28T14:10:57.421723Z"
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
  "device_ref": "sandbox-2762"
}
```

```json
{
  "challenge_id": "446b3eec-42c5-42d9-b4bc-9d551e1a4332",
  "expires_at": "2026-10-28T14:15:57.985118793Z",
  "resend_available_at": "2026-10-28T14:10:58.985118793Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "898744",
  "sent_at": "2026-10-28T14:10:57.988606371Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "446b3eec-42c5-42d9-b4bc-9d551e1a4332",
  "code": "898744",
  "device_ref": "sandbox-2762"
}
```

```json
{
  "session_id": "43bf4252-89b9-4f9b-89c3-905dd80dd041",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzU1OCwiaWF0IjoxNzkzMTk2NjU4LCJqdGkiOiI4MjYzNDA0MC1iYjczLTQ1YzgtYjkwNy04MWYyZDJlM2M1ZjEiLCJzaWQiOiI0M2JmNDI1Mi04OWI5LTRmOWItODljMy05MDVkZDgwZGQwNDEifQ.eTbKTV6I2PpUXZcJzWxzEoQv8Dwg8a7fpjWu2TF8E8U",
  "access_expires_at": "2026-10-28T14:25:58.289703544Z",
  "refresh_token": "biOnD62hoPGkdXM6ja8pjKQquvN4z2IbtprWmGLg8ms",
  "refresh_expires_at": "2026-11-27T14:10:58.289087805Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b17188-316c-486a-8a3a-025bb0a439bc",
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
  "last_heartbeat_at": "2026-10-28T14:10:52.470378Z",
  "last_location_at": "2026-10-28T14:10:52.470378Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5b17188-316c-486a-8a3a-025bb0a439bc/handover` → **200**

```json
{
  "command_id": "b98cb435-008b-426d-b7cc-4dcac2c3c2cc",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b17188-316c-486a-8a3a-025bb0a439bc",
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
  "last_heartbeat_at": "2026-10-28T14:10:52.470378Z",
  "last_location_at": "2026-10-28T14:10:52.470378Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5b17188-316c-486a-8a3a-025bb0a439bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:10:59Z",
    "sequence": 1793196659138
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b17188-316c-486a-8a3a-025bb0a439bc",
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
  "last_heartbeat_at": "2026-10-28T14:10:59.16129Z",
  "last_location_at": "2026-10-28T14:10:59.16129Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b7a3a742-0260-4994-83f6-a1d2041053c5",
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
  "id": "9289fd3e-ab19-49c1-9206-5a47259a8220",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:15:59.448055Z",
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
  "command_id": "2753a065-6173-4fd6-89e4-bb1b324be5d0",
  "quote_id": "9289fd3e-ab19-49c1-9206-5a47259a8220",
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
  "id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "746bd60f-bfe6-4fdc-a666-bb8294bc9a5e",
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
  "created_at": "2026-10-28T14:10:59.7502Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0a57755d-715d-49c3-9bdd-5b724ce131aa` → **200**

```json
{
  "id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "746bd60f-bfe6-4fdc-a666-bb8294bc9a5e",
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
  "created_at": "2026-10-28T14:10:59.7502Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0a57755d-715d-49c3-9bdd-5b724ce131aa` → **200**

```json
{
  "id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "746bd60f-bfe6-4fdc-a666-bb8294bc9a5e",
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
  "created_at": "2026-10-28T14:10:59.7502Z",
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
    "id": "aaddc7fd-ceaa-4197-b679-608cdd852414",
    "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
    "expires_at": "2026-10-28T14:11:15.07519Z",
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

`POST /api/driver/v1/offers/aaddc7fd-ceaa-4197-b679-608cdd852414/accept` → **200**

```json
{
  "command_id": "edcb6d3a-fb4e-419f-83c1-3fc79fa7d721"
}
```

```json
{
  "id": "10fc41b4-74b7-463b-b1e4-2b17833aab20",
  "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6c72494b-2b78-4caf-9182-7a051953d305",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6c72494b-2b78-4caf-9182-7a051953d305",
  "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
  "assignment_id": "10fc41b4-74b7-463b-b1e4-2b17833aab20",
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

`POST /api/driver/v1/work-sessions/c5b17188-316c-486a-8a3a-025bb0a439bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:11:02Z",
    "sequence": 1793196662502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b17188-316c-486a-8a3a-025bb0a439bc",
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
  "last_heartbeat_at": "2026-10-28T14:11:02.525817Z",
  "last_location_at": "2026-10-28T14:11:02.525817Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6c72494b-2b78-4caf-9182-7a051953d305/arrive` → **200**

```json
{
  "command_id": "7cee4eac-8e00-4996-b8f1-909c87037b49",
  "expected_version": 0
}
```

```json
{
  "id": "6c72494b-2b78-4caf-9182-7a051953d305",
  "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
  "assignment_id": "10fc41b4-74b7-463b-b1e4-2b17833aab20",
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
  "arrived_at": "2026-10-28T14:11:02.816932Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6c72494b-2b78-4caf-9182-7a051953d305/start` → **200**

```json
{
  "command_id": "a1376bd7-bb72-4fba-b623-7d4db71dd62a",
  "expected_version": 1
}
```

```json
{
  "id": "6c72494b-2b78-4caf-9182-7a051953d305",
  "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
  "assignment_id": "10fc41b4-74b7-463b-b1e4-2b17833aab20",
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
  "arrived_at": "2026-10-28T14:11:02.816932Z",
  "started_at": "2026-10-28T14:11:03.10947Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6c72494b-2b78-4caf-9182-7a051953d305/complete` → **200**

```json
{
  "command_id": "79a2b26b-0532-4f4b-af01-a0a6f6b93a8a",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:11:03Z",
  "cash_received": true
}
```

```json
{
  "id": "6c72494b-2b78-4caf-9182-7a051953d305",
  "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
  "assignment_id": "10fc41b4-74b7-463b-b1e4-2b17833aab20",
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
  "arrived_at": "2026-10-28T14:11:02.816932Z",
  "started_at": "2026-10-28T14:11:03.10947Z",
  "completed_at": "2026-10-28T14:11:03.404191Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/0a57755d-715d-49c3-9bdd-5b724ce131aa` → **200**

```json
{
  "id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "746bd60f-bfe6-4fdc-a666-bb8294bc9a5e",
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
    "id": "10fc41b4-74b7-463b-b1e4-2b17833aab20",
    "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6c72494b-2b78-4caf-9182-7a051953d305",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:10:59.7502Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0a57755d-715d-49c3-9bdd-5b724ce131aa` → **200**

```json
{
  "id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "746bd60f-bfe6-4fdc-a666-bb8294bc9a5e",
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
    "id": "10fc41b4-74b7-463b-b1e4-2b17833aab20",
    "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6c72494b-2b78-4caf-9182-7a051953d305",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:10:59.7502Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0a57755d-715d-49c3-9bdd-5b724ce131aa` → **200**

```json
{
  "id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "746bd60f-bfe6-4fdc-a666-bb8294bc9a5e",
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
    "id": "10fc41b4-74b7-463b-b1e4-2b17833aab20",
    "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6c72494b-2b78-4caf-9182-7a051953d305",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:10:59.7502Z",
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
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/0a57755d-715d-49c3-9bdd-5b724ce131aa/tip` → **200**

```json
{
  "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
  "available_until": "2026-10-29T14:11:03.404191Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/0a57755d-715d-49c3-9bdd-5b724ce131aa/tip` → **201**

```json
{
  "command_id": "77304f0c-7734-4f00-a421-25d387ef4924",
  "amount_minor": 2500
}
```

```json
{
  "id": "f8897b0b-bd65-47fd-b483-9b0c1e8615a6",
  "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:11:07.434188Z"
}
```

`GET /api/rider/v1/orders/0a57755d-715d-49c3-9bdd-5b724ce131aa/tip` → **200**

```json
{
  "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
  "available_until": "2026-10-29T14:11:03.404191Z",
  "open": false,
  "tip": {
    "id": "f8897b0b-bd65-47fd-b483-9b0c1e8615a6",
    "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:11:07.434188Z"
  }
}
```

`GET /api/rider/v1/orders/0a57755d-715d-49c3-9bdd-5b724ce131aa/tip` → **200**

```json
{
  "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
  "available_until": "2026-10-29T14:11:03.404191Z",
  "open": false,
  "tip": {
    "id": "f8897b0b-bd65-47fd-b483-9b0c1e8615a6",
    "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:11:07.434188Z"
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
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d26f1ec6-d6e4-45c5-bd7d-2b0df80bf61b",
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
  "id": "11b8cea0-c40f-4d2a-86d8-3a067104b568",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:16:09.576959Z",
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
  "session_id": "10e9f41e-6a9e-49a9-bb97-2f5288101622",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc1NzAsImlhdCI6MTc5MzE5NjY3MCwianRpIjoiM2U2ZTMxZDEtY2UzNy00MjAxLWIxYjEtZWUzYjA4OTAwY2RlIiwic2lkIjoiMTBlOWY0MWUtNmE5ZS00OWE5LWJiOTctMmY1Mjg4MTAxNjIyIn0.3qtdQ8il8QbQSFe3w9GeLHV7tmqsMCdxwdQ9e5h0gLE",
  "access_expires_at": "2026-10-28T14:26:10.161309041Z",
  "refresh_token": "S8Q6an9FeRtIIcZXCIzVqzGdIJeQXIC6iTNde7EoQHc",
  "refresh_expires_at": "2026-10-29T02:11:10.160683288Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380732584130` → **200**

```json
{
  "client_id": "746bd60f-bfe6-4fdc-a666-bb8294bc9a5e"
}
```

`POST /api/admin/v1/rider-wallets/746bd60f-bfe6-4fdc-a666-bb8294bc9a5e/top-ups` → **201**

```json
{
  "command_id": "8537b156-e5e0-4716-85f5-a5d9cf78b31f",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "746bd60f-bfe6-4fdc-a666-bb8294bc9a5e",
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
      "id": "cd171b42-9a7e-4707-8f6b-c36e26efd69f",
      "at": "2026-10-28T14:11:10.707407Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "65452008-3770-4537-8ade-4965edc0348f",
  "quote_id": "11b8cea0-c40f-4d2a-86d8-3a067104b568",
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
  "id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "746bd60f-bfe6-4fdc-a666-bb8294bc9a5e",
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
  "created_at": "2026-10-28T14:11:11.00575Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7fbdd89e-24ba-4e91-851a-d74e5a5ad054` → **200**

```json
{
  "id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "746bd60f-bfe6-4fdc-a666-bb8294bc9a5e",
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
  "created_at": "2026-10-28T14:11:11.00575Z",
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
    "id": "7bf1f99b-306e-4a40-b4d0-0b2bbdb7ce18",
    "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
    "expires_at": "2026-10-28T14:11:26.011659Z",
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

`POST /api/driver/v1/offers/7bf1f99b-306e-4a40-b4d0-0b2bbdb7ce18/accept` → **200**

```json
{
  "command_id": "1868bf5f-ec3c-4941-b02b-65ee44e2e80b"
}
```

```json
{
  "id": "c2807b77-f2f2-4eff-933d-717993a0a5cb",
  "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6c480111-46d6-43c8-a4a5-ec418b1a20f4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6c480111-46d6-43c8-a4a5-ec418b1a20f4",
  "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
  "assignment_id": "c2807b77-f2f2-4eff-933d-717993a0a5cb",
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

`POST /api/driver/v1/work-sessions/c5b17188-316c-486a-8a3a-025bb0a439bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:11:12Z",
    "sequence": 1793196672412
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c5b17188-316c-486a-8a3a-025bb0a439bc",
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
  "last_heartbeat_at": "2026-10-28T14:11:12.433965Z",
  "last_location_at": "2026-10-28T14:11:12.433965Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6c480111-46d6-43c8-a4a5-ec418b1a20f4/arrive` → **200**

```json
{
  "command_id": "d77fc009-014b-434e-a1ad-c56bcf007729",
  "expected_version": 0
}
```

```json
{
  "id": "6c480111-46d6-43c8-a4a5-ec418b1a20f4",
  "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
  "assignment_id": "c2807b77-f2f2-4eff-933d-717993a0a5cb",
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
  "arrived_at": "2026-10-28T14:11:12.719761Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6c480111-46d6-43c8-a4a5-ec418b1a20f4/start` → **200**

```json
{
  "command_id": "57eeea48-4001-4046-839c-7ce21aa0eb9b",
  "expected_version": 1
}
```

```json
{
  "id": "6c480111-46d6-43c8-a4a5-ec418b1a20f4",
  "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
  "assignment_id": "c2807b77-f2f2-4eff-933d-717993a0a5cb",
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
  "arrived_at": "2026-10-28T14:11:12.719761Z",
  "started_at": "2026-10-28T14:11:13.014135Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6c480111-46d6-43c8-a4a5-ec418b1a20f4/complete` → **200**

```json
{
  "command_id": "15d0ce15-c4ec-42da-a364-5fadcdf09c99",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:11:13Z",
  "cash_received": true
}
```

```json
{
  "id": "6c480111-46d6-43c8-a4a5-ec418b1a20f4",
  "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
  "assignment_id": "c2807b77-f2f2-4eff-933d-717993a0a5cb",
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
  "arrived_at": "2026-10-28T14:11:12.719761Z",
  "started_at": "2026-10-28T14:11:13.014135Z",
  "completed_at": "2026-10-28T14:11:13.312972Z",
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
  "client_id": "746bd60f-bfe6-4fdc-a666-bb8294bc9a5e",
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
      "id": "cd171b42-9a7e-4707-8f6b-c36e26efd69f",
      "at": "2026-10-28T14:11:10.707407Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "91585543-f74c-451e-a2d9-1db88b7458e9",
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
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/7fbdd89e-24ba-4e91-851a-d74e5a5ad054/tip` → **200**

```json
{
  "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
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
  "available_until": "2026-10-29T14:11:13.312972Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/7fbdd89e-24ba-4e91-851a-d74e5a5ad054/tip` → **201**

```json
{
  "command_id": "68813738-1caa-4635-a495-73224019bbee",
  "amount_minor": 2500
}
```

```json
{
  "id": "2c2a6f15-db8d-40b2-b3c5-70328d69b9ea",
  "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:11:14.704164Z"
}
```

`GET /api/rider/v1/orders/7fbdd89e-24ba-4e91-851a-d74e5a5ad054/tip` → **200**

```json
{
  "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
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
  "available_until": "2026-10-29T14:11:13.312972Z",
  "open": false,
  "tip": {
    "id": "2c2a6f15-db8d-40b2-b3c5-70328d69b9ea",
    "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:11:14.704164Z"
  }
}
```

`GET /api/rider/v1/orders/7fbdd89e-24ba-4e91-851a-d74e5a5ad054/tip` → **200**

```json
{
  "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
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
  "available_until": "2026-10-29T14:11:13.312972Z",
  "open": false,
  "tip": {
    "id": "2c2a6f15-db8d-40b2-b3c5-70328d69b9ea",
    "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:11:14.704164Z"
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
      "id": "b5cec9c7-350f-4a23-9d75-d4efc988b806",
      "at": "2026-10-28T14:11:16.305828Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "67ed9423-ed10-4f38-88d3-2866d300b34c",
      "at": "2026-10-28T14:11:14.273662Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7fbdd89e-24ba-4e91-851a-d74e5a5ad054",
      "counterpart_id": null
    },
    {
      "id": "f60caac0-e0c9-46a3-b17a-02bff394897a",
      "at": "2026-10-28T14:11:09.219018Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
      "counterpart_id": null
    },
    {
      "id": "c07ad6ec-78b5-4647-b61b-a2eae198d56c",
      "at": "2026-10-28T14:11:04.150306Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0a57755d-715d-49c3-9bdd-5b724ce131aa",
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
  "session_id": "c5b17188-316c-486a-8a3a-025bb0a439bc",
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
  "last_heartbeat_at": "2026-10-28T14:11:12.433965Z",
  "last_location_at": "2026-10-28T14:11:12.433965Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c5b17188-316c-486a-8a3a-025bb0a439bc/close` → **200**

```json
{
  "command_id": "9d919a35-3851-4693-9a22-609850ad90a0",
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
  "phone": "+380738340470",
  "device_ref": "sandbox-21185"
}
```

```json
{
  "challenge_id": "f796216b-afbc-4911-a750-7fc150557b0a",
  "expires_at": "2026-10-28T14:16:42.685820471Z",
  "resend_available_at": "2026-10-28T14:11:43.685820471Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738340470` → **200**

```json
{
  "phone": "+380738340470",
  "audience": "CLIENT",
  "code": "513927",
  "sent_at": "2026-10-28T14:11:42.689025636Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f796216b-afbc-4911-a750-7fc150557b0a",
  "code": "513927",
  "device_ref": "sandbox-21185"
}
```

```json
{
  "session_id": "7a1a279d-bf73-4b20-acc1-3dd72f021d3e",
  "subject": {
    "type": "CLIENT",
    "id": "3fca43ec-e6bf-42bb-bbb4-e89e83aaeeca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZmNhNDNlYy1lNmJmLTQyYmItYmJiNC1lODllODNhYWVlY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NjAzLCJpYXQiOjE3OTMxOTY3MDMsImp0aSI6IjM3NzllYzkzLTg4MzgtNDY5Yy05YWQzLTFkYzQ1OTg5NjJkYyIsInNpZCI6IjdhMWEyNzlkLWJmNzMtNGIyMC1hY2MxLTNkZDcyZjAyMWQzZSJ9.2sf806GE2IJ7qQThOVXV5XNqHHQOp6KtzRuQSyri9_k",
  "access_expires_at": "2026-10-28T14:26:43.011319082Z",
  "refresh_token": "ABvyG50T7wYNq45Rxzu98pBVS8nNxmlTgW7Pm7P95I0",
  "refresh_expires_at": "2026-11-27T14:11:43.010733061Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "e10dc881-3490-4d12-8547-27e0908f02ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "bcf47ed8-5c65-4db3-a623-a6eb78c3d830",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-bcf47ed8-5c65-4db3-a623-a6eb78c3d830",
    "orderDate": "1793196703",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "b77d45f4832832b79610fb5fd8f3f77e",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=bcf47ed8-5c65-4db3-a623-a6eb78c3d830",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738340470"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=bcf47ed8-5c65-4db3-a623-a6eb78c3d830",
  "created_at": "2026-10-28T14:11:43.298356Z",
  "expires_at": "2026-10-28T14:41:43.298356Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/bcf47ed8-5c65-4db3-a623-a6eb78c3d830` → **200**

```json
{
  "id": "bcf47ed8-5c65-4db3-a623-a6eb78c3d830",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:11:43.298356Z",
  "expires_at": "2026-10-28T14:41:43.298356Z",
  "completed_at": "2026-10-28T14:11:43.593892Z",
  "masked_pan": "41****3456",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3fca43ec-e6bf-42bb-bbb4-e89e83aaeeca",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3fca43ec-e6bf-42bb-bbb4-e89e83aaeeca",
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
      "id": "e020b9a5-a679-4315-b256-a88fdbfe1aec",
      "at": "2026-10-28T14:11:44.366625Z",
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
  "client_id": "3fca43ec-e6bf-42bb-bbb4-e89e83aaeeca",
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
      "id": "e020b9a5-a679-4315-b256-a88fdbfe1aec",
      "at": "2026-10-28T14:11:44.366625Z",
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
  "device_ref": "sandbox-15333"
}
```

```json
{
  "challenge_id": "6d19bf1c-f3e7-4443-a16c-306bdf1c40c6",
  "expires_at": "2026-10-28T14:16:45.768223133Z",
  "resend_available_at": "2026-10-28T14:11:46.768223133Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "183177",
  "sent_at": "2026-10-28T14:11:45.77132338Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d19bf1c-f3e7-4443-a16c-306bdf1c40c6",
  "code": "183177",
  "device_ref": "sandbox-15333"
}
```

```json
{
  "session_id": "a183fe52-d07c-4d13-b776-61df0a157f5d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzYwNiwiaWF0IjoxNzkzMTk2NzA2LCJqdGkiOiJlMmFhNmYxZS1lOWQzLTQyNDAtYWYxYS0zNjYxZjdlYjI5MDkiLCJzaWQiOiJhMTgzZmU1Mi1kMDdjLTRkMTMtYjc3Ni02MWRmMGExNTdmNWQifQ.Lmz-8bWqiZjsapcNKjkiWcewtdVej4Hk1nZKr9nN1SU",
  "access_expires_at": "2026-10-28T14:26:46.092459008Z",
  "refresh_token": "xuk9dYpfjM_Id06hA854EJD4yq_tQvY8dCArK21v6iA",
  "refresh_expires_at": "2026-11-27T14:11:46.091788494Z",
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
  "command_id": "d3563161-aaad-4354-8053-25c651d029a1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "02f943aa-42bf-4933-8cb4-560491e902be",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-02f943aa-42bf-4933-8cb4-560491e902be",
    "orderDate": "1793196706",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "bd20ac51941a9c58278defc64737567a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=02f943aa-42bf-4933-8cb4-560491e902be",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=02f943aa-42bf-4933-8cb4-560491e902be",
  "created_at": "2026-10-28T14:11:46.667591Z",
  "expires_at": "2026-10-28T14:41:46.667591Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/02f943aa-42bf-4933-8cb4-560491e902be` → **200**

```json
{
  "id": "02f943aa-42bf-4933-8cb4-560491e902be",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:11:46.667591Z",
  "expires_at": "2026-10-28T14:41:46.667591Z",
  "completed_at": "2026-10-28T14:11:46.957063Z",
  "masked_pan": "41****9517",
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
      "id": "f37d5fed-1162-4d46-ad64-c43bd18939c3",
      "at": "2026-10-28T14:11:47.374709Z",
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
  "command_id": "a7c39bf2-b0be-48d8-ac81-6ff47258fd03",
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
  "correlation_id": "e828e8ed-b83d-40b9-a105-80cb0170d343"
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
  "session_id": "e60feb0c-e715-41bc-9d9c-5a14fd5e4af7",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2MDksImlhdCI6MTc5MzE5NjcwOSwianRpIjoiZTEyNTg5OTAtNzM2Yy00MmI5LWJhZWMtYzIzNGI4YWQwOWYzIiwic2lkIjoiZTYwZmViMGMtZTcxNS00MWJjLTlkOWMtNWExNGZkNWU0YWY3In0.xTGVIXfhYwEMnFMZWpROMi5WPeJSVLFsc59Ia8wjHyo",
  "access_expires_at": "2026-10-28T14:26:49.422023149Z",
  "refresh_token": "yZpDvbZth3ohUA8FRwvpOa8ZFovp8pytwDZMQPygCNU",
  "refresh_expires_at": "2026-10-29T02:11:49.421435434Z",
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
  "phone": "+48600643459",
  "device_ref": "sandbox-20026"
}
```

```json
{
  "challenge_id": "13fe65fd-6ade-440b-b352-f2e769c6eb85",
  "expires_at": "2026-10-28T14:16:50.282500345Z",
  "resend_available_at": "2026-10-28T14:11:51.282500345Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600643459` → **200**

```json
{
  "phone": "+48600643459",
  "audience": "CLIENT",
  "code": "891488",
  "sent_at": "2026-10-28T14:11:50.284964383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "13fe65fd-6ade-440b-b352-f2e769c6eb85",
  "code": "891488",
  "device_ref": "sandbox-20026"
}
```

```json
{
  "session_id": "eb788dc5-648a-4438-9949-f7f871fe67c7",
  "subject": {
    "type": "CLIENT",
    "id": "d1f65f19-084b-49e8-b6f6-4ce33da32d78"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWY2NWYxOS0wODRiLTQ5ZTgtYjZmNi00Y2UzM2RhMzJkNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NjEwLCJpYXQiOjE3OTMxOTY3MTAsImp0aSI6ImYxNDFlZmRkLWE1OTctNGE4Ni1hZTc4LWM4M2Q3NjdmOWM4OSIsInNpZCI6ImViNzg4ZGM1LTY0OGEtNDQzOC05OTQ5LWY3Zjg3MWZlNjdjNyJ9.ErLw65qJRAF_ppIkEF_a-nUvcSwhkhLf2x8J9JqMhPE",
  "access_expires_at": "2026-10-28T14:26:50.596037465Z",
  "refresh_token": "ty2jnmdwgY55CRx_hf2s6jeSn4U1z0g-ZpDTHn5n7DE",
  "refresh_expires_at": "2026-11-27T14:11:50.59537702Z",
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
  "command_id": "b8f22c88-1d39-4dec-ae48-1224c0cb527b",
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
  "correlation_id": "e33ac4dd-e418-484b-a077-b3fc42d08f2a",
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
  "command_id": "6b5555a7-4b26-4baf-93e0-ff61b737fb22",
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
  "paused_at": "2026-10-28T14:11:51.731572711Z",
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
  "command_id": "4e59a999-4c87-4cf5-9a81-6d38e638b37c",
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
  "id": "8484e09d-aab8-4334-9a50-597a72930c3f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:16:52.315909Z",
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
  "command_id": "7d3da0bf-e0a8-4b6c-8f68-b8c5fac76476",
  "quote_id": "8484e09d-aab8-4334-9a50-597a72930c3f",
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
  "correlation_id": "9bf65b4c-f221-4501-b65a-6697f1f81bb1"
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
  "paused_at": "2026-10-28T14:11:51.731573Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "85a8ff0e-91cd-4dc3-bda7-404b3d904883",
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
  "command_id": "4c1b6db6-35f5-4722-bca2-fae7d86e4948",
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
  "command_id": "e43b8e9b-79fc-457f-8e13-02b900455cea",
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
  "id": "18267e90-8a90-4493-be4e-8973055d3d9a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:16:54.047396Z",
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
  "command_id": "25d01ccd-c687-45db-9098-0cce9022cd26",
  "quote_id": "18267e90-8a90-4493-be4e-8973055d3d9a",
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
  "correlation_id": "42ff0cde-ef0e-48eb-a9d2-2479151d6a58"
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
  "command_id": "ad432260-8599-42d6-9006-9aa1d4b0d3cf",
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
  "command_id": "9db8f260-61da-454a-918d-f702f789cace",
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
  "id": "0de2cb3c-be48-46b8-9abb-9338fbf0005f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:16:55.203348Z",
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
  "command_id": "0e97b0d9-b6ee-487a-ae0c-0ba1d37b0fb9",
  "quote_id": "0de2cb3c-be48-46b8-9abb-9338fbf0005f",
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
  "correlation_id": "09f61ca4-0fae-42a2-942f-f7df69a0160e"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "cf2923b3-b9fa-48bd-9b8b-f3c3292b34f5",
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
  "correlation_id": "0f0ab699-2ee4-4ba7-8524-d0ebbc76c633"
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
  "command_id": "36cbcdcc-8e1f-47a2-bcc5-32c4734bb10c",
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
  "phone": "+380675160772",
  "device_ref": "sandbox-1510"
}
```

```json
{
  "challenge_id": "ec97d362-4d6b-4b62-88ac-29ac727f17b3",
  "expires_at": "2026-10-28T14:16:56.650119718Z",
  "resend_available_at": "2026-10-28T14:11:57.650119718Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675160772` → **200**

```json
{
  "phone": "+380675160772",
  "audience": "CLIENT",
  "code": "588343",
  "sent_at": "2026-10-28T14:11:56.652732937Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec97d362-4d6b-4b62-88ac-29ac727f17b3",
  "code": "588343",
  "device_ref": "sandbox-1510"
}
```

```json
{
  "session_id": "0e4b7c4e-f1cc-4489-b763-4369baa3beb3",
  "subject": {
    "type": "CLIENT",
    "id": "93c6871f-f0b9-4aa6-b753-d2a5ab9d515d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5M2M2ODcxZi1mMGI5LTRhYTYtYjc1My1kMmE1YWI5ZDUxNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NjE2LCJpYXQiOjE3OTMxOTY3MTYsImp0aSI6ImQwNjBjOTdmLTZhZDEtNDA1ZC04N2JkLWE4N2ZlZDZmNTYyMiIsInNpZCI6IjBlNGI3YzRlLWYxY2MtNDQ4OS1iNzYzLTQzNjliYWEzYmViMyJ9.h_ALyHysc0c6jnV8n35tLiGYywC7LK_I-_reAPaT_24",
  "access_expires_at": "2026-10-28T14:26:56.951285746Z",
  "refresh_token": "CxRV8ajFNejH5B4EZDlsFFuprZi5cf825hKjKaKwGFU",
  "refresh_expires_at": "2026-11-27T14:11:56.950714377Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "93c6871f-f0b9-4aa6-b753-d2a5ab9d515d",
  "session_id": "0e4b7c4e-f1cc-4489-b763-4369baa3beb3",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8c772f76-2c06-42b9-b58e-09d2a73eea64",
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
  "id": "210921cc-1eef-4551-a7b1-4481ad2cb8d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:16:57.496129Z",
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
  "challenge_id": "bff412b4-4ee6-4a36-8bec-405425cddd0e",
  "expires_at": "2026-10-28T14:16:59.784557233Z",
  "resend_available_at": "2026-10-28T14:12:00.784557233Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675160772` → **200**

```json
{
  "phone": "+380675160772",
  "audience": "CLIENT",
  "code": "990315",
  "sent_at": "2026-10-28T14:11:59.78678581Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "0c05003e-33d9-4431-92b5-fb942ce10f7c",
  "challenge_id": "bff412b4-4ee6-4a36-8bec-405425cddd0e",
  "otp_code": "990315"
}
```

```json
{
  "client_id": "93c6871f-f0b9-4aa6-b753-d2a5ab9d515d",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T14:12:00.100181807Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "1bb46271-04a1-402d-b54e-c5222b4f626c",
  "quote_id": "210921cc-1eef-4551-a7b1-4481ad2cb8d6",
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
  "correlation_id": "5e64c519-9a0d-4129-b611-746c72a542ed"
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
  "session_id": "6060ca83-8b50-4d6f-9394-9d20f3311162",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2MjAsImlhdCI6MTc5MzE5NjcyMCwianRpIjoiYzBlMTlkMjMtYWZiNS00ODE5LWIyMTktNzdhMThmZDEwZDQ3Iiwic2lkIjoiNjA2MGNhODMtOGI1MC00ZDZmLTkzOTQtOWQyMGYzMzExMTYyIn0.r6VVOYj4FND1-LmH65gzIak9g0W09E7Dm1dSmEEo1JA",
  "access_expires_at": "2026-10-28T14:27:00.949137989Z",
  "refresh_token": "b0frbocpVp0Yfij8-XjfWYcJrB8iLdz1vK6j2QYvfP4",
  "refresh_expires_at": "2026-10-29T02:12:00.9485707Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "93c6871f-f0b9-4aa6-b753-d2a5ab9d515d",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T14:12:00.100182Z",
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

`POST /api/admin/v1/client-deletions/93c6871f-f0b9-4aa6-b753-d2a5ab9d515d/complete` → **200**

```json
{
  "command_id": "3a5a8554-c0db-440f-836d-763b7a071665",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "93c6871f-f0b9-4aa6-b753-d2a5ab9d515d",
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
  "correlation_id": "118fc92c-72e6-41df-b920-2db7e8c615d5"
}
```

Done: client 93c6871f-f0b9-4aa6-b753-d2a5ab9d515d anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662289402",
  "device_ref": "sandbox-32654"
}
```

```json
{
  "challenge_id": "a6e042b5-ed69-4d97-9b57-8f54c4fb0fb1",
  "expires_at": "2026-10-28T14:17:02.071099253Z",
  "resend_available_at": "2026-10-28T14:12:03.071099253Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662289402` → **200**

```json
{
  "phone": "+380662289402",
  "audience": "CLIENT",
  "code": "651216",
  "sent_at": "2026-10-28T14:12:02.074271394Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6e042b5-ed69-4d97-9b57-8f54c4fb0fb1",
  "code": "651216",
  "device_ref": "sandbox-32654"
}
```

```json
{
  "session_id": "cbfaf916-305a-43fe-aa6d-6af4dd41f646",
  "subject": {
    "type": "CLIENT",
    "id": "cdde31d2-1772-4b92-89a3-034d0bf71e42"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZGRlMzFkMi0xNzcyLTRiOTItODlhMy0wMzRkMGJmNzFlNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NjIyLCJpYXQiOjE3OTMxOTY3MjIsImp0aSI6IjJkNTc1Yzg3LTM0MDItNGE1My05NTMwLTIzOWM5YWM3YTA4OCIsInNpZCI6ImNiZmFmOTE2LTMwNWEtNDNmZS1hYTZkLTZhZjRkZDQxZjY0NiJ9.Mf0yAMIf2vGyJIFy_gPPqigkdWrennrHxSsVjPoT2QA",
  "access_expires_at": "2026-10-28T14:27:02.376907031Z",
  "refresh_token": "do9efD5pDFOJIyfxV9-0JHVmESTh55C5pCwt3G3EsNk",
  "refresh_expires_at": "2026-11-27T14:12:02.37633359Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cdde31d2-1772-4b92-89a3-034d0bf71e42",
  "session_id": "cbfaf916-305a-43fe-aa6d-6af4dd41f646",
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
  "session_id": "5e27ab82-18f5-4257-a1ce-f4e98de60c4c",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2MjMsImlhdCI6MTc5MzE5NjcyMywianRpIjoiYTdkZWExYzAtMmMwNi00NjQyLTk5N2QtNjE2M2NjNGNiYjllIiwic2lkIjoiNWUyN2FiODItMThmNS00MjU3LWExY2UtZjRlOThkZTYwYzRjIn0.ZQI3WciRYM6nfvYc03E6LABqNmp5MfRb7MV1_pEw_us",
  "access_expires_at": "2026-10-28T14:27:03.226181278Z",
  "refresh_token": "kRRE7uBvi86lZqNmL-76fUzxvADq_rgTnwUL4d6uX94",
  "refresh_expires_at": "2026-10-29T02:12:03.2256195Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2289402&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "cdde31d2-1772-4b92-89a3-034d0bf71e42",
      "phone": "+380662289402",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T14:12:02.374564Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/cdde31d2-1772-4b92-89a3-034d0bf71e42` → **200**

```json
{
  "client": {
    "id": "cdde31d2-1772-4b92-89a3-034d0bf71e42",
    "phone": "+380662289402",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:12:02.374564Z",
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

`POST /api/admin/v1/clients/cdde31d2-1772-4b92-89a3-034d0bf71e42/block` → **400**

```json
{
  "command_id": "dd4e3fc5-c487-4063-bb04-1dbbcc0538d3",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/cdde31d2-1772-4b92-89a3-034d0bf71e42/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7d2f00b2-98f3-4953-8c84-08706269a973",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/cdde31d2-1772-4b92-89a3-034d0bf71e42/block` → **200**

```json
{
  "command_id": "2d6e1c5a-6764-412f-8f7a-b9c791bed0ff",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "cdde31d2-1772-4b92-89a3-034d0bf71e42",
  "phone": "+380662289402",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T14:12:02.374564Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T14:12:04.392387Z",
    "by": "91585543-f74c-451e-a2d9-1db88b7458e9"
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
  "correlation_id": "137c7f7d-564d-49a5-9d2b-38801202c7b9"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662289402",
  "device_ref": "sandbox-31682"
}
```

```json
{
  "challenge_id": "1ca1d26c-f19d-40ce-a672-50b05fe86a27",
  "expires_at": "2026-10-28T14:17:06.989269512Z",
  "resend_available_at": "2026-10-28T14:12:07.989269512Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662289402` → **200**

```json
{
  "phone": "+380662289402",
  "audience": "CLIENT",
  "code": "942974",
  "sent_at": "2026-10-28T14:12:06.99170449Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "1ca1d26c-f19d-40ce-a672-50b05fe86a27",
  "code": "942974",
  "device_ref": "sandbox-31682"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "d3a48d5c-04ec-420d-bf3d-a0b9d74d3307"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/cdde31d2-1772-4b92-89a3-034d0bf71e42` → **200**

```json
{
  "client": {
    "id": "cdde31d2-1772-4b92-89a3-034d0bf71e42",
    "phone": "+380662289402",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T14:12:02.374564Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T14:12:04.392387Z",
      "by": "91585543-f74c-451e-a2d9-1db88b7458e9"
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

`POST /api/admin/v1/clients/cdde31d2-1772-4b92-89a3-034d0bf71e42/unblock` → **200**

```json
{
  "command_id": "7dfc2618-98f2-4d49-abbb-511bf5a1c27c",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "cdde31d2-1772-4b92-89a3-034d0bf71e42",
  "phone": "+380662289402",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T14:12:02.374564Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662289402",
  "device_ref": "sandbox-13455"
}
```

```json
{
  "challenge_id": "c96007cb-6bac-45a3-9e55-63f062dd948a",
  "expires_at": "2026-10-28T14:17:10.180331554Z",
  "resend_available_at": "2026-10-28T14:12:11.180331554Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662289402` → **200**

```json
{
  "phone": "+380662289402",
  "audience": "CLIENT",
  "code": "023289",
  "sent_at": "2026-10-28T14:12:10.184165143Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c96007cb-6bac-45a3-9e55-63f062dd948a",
  "code": "023289",
  "device_ref": "sandbox-13455"
}
```

```json
{
  "session_id": "02ab183d-aa7f-4acb-b5ba-b07ef74466e1",
  "subject": {
    "type": "CLIENT",
    "id": "cdde31d2-1772-4b92-89a3-034d0bf71e42"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZGRlMzFkMi0xNzcyLTRiOTItODlhMy0wMzRkMGJmNzFlNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NjMwLCJpYXQiOjE3OTMxOTY3MzAsImp0aSI6ImZlNmIzM2UzLWQzZjAtNGUyNC05NWU4LTVmNDZhNGM4YzM3MCIsInNpZCI6IjAyYWIxODNkLWFhN2YtNGFjYi1iNWJhLWIwN2VmNzQ0NjZlMSJ9._OxQSaZSrsky2tyyL5Q3clwesKWT1zcYfxaGU0ZcjBc",
  "access_expires_at": "2026-10-28T14:27:10.480670858Z",
  "refresh_token": "BkZ7JO4a1beEYzYIrlLH30k-KfQZXDyaAWGklx5ayqM",
  "refresh_expires_at": "2026-11-27T14:12:10.480118226Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cdde31d2-1772-4b92-89a3-034d0bf71e42",
  "session_id": "02ab183d-aa7f-4acb-b5ba-b07ef74466e1",
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
  "phone": "+380663411449",
  "device_ref": "sandbox-18862"
}
```

```json
{
  "challenge_id": "13b92131-7f4d-40c2-b084-cfdf6d40a4c6",
  "expires_at": "2026-10-28T14:17:11.022079806Z",
  "resend_available_at": "2026-10-28T14:12:12.022079806Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663411449` → **200**

```json
{
  "phone": "+380663411449",
  "audience": "CLIENT",
  "code": "468615",
  "sent_at": "2026-10-28T14:12:11.024422429Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "13b92131-7f4d-40c2-b084-cfdf6d40a4c6",
  "code": "468615",
  "device_ref": "sandbox-18862"
}
```

```json
{
  "session_id": "5412dc05-153b-4505-9b1d-26a37955db83",
  "subject": {
    "type": "CLIENT",
    "id": "cdde06b3-2cbe-45c9-ade5-6cfe921c2b77"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZGRlMDZiMy0yY2JlLTQ1YzktYWRlNS02Y2ZlOTIxYzJiNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NjMxLCJpYXQiOjE3OTMxOTY3MzEsImp0aSI6IjgzOGE5MjFiLWJkMGItNGExMC04MzFkLThlNmQxMThjOThhMiIsInNpZCI6IjU0MTJkYzA1LTE1M2ItNDUwNS05YjFkLTI2YTM3OTU1ZGI4MyJ9.4we_T4CL5zue8sZY2mVcGH7L_Sy7C5QIDQjbaEmNpdo",
  "access_expires_at": "2026-10-28T14:27:11.317923956Z",
  "refresh_token": "L2DUjuR20a1evOvw6Hd5icY78YofnMYwgXzEZ4E6WMA",
  "refresh_expires_at": "2026-11-27T14:12:11.317378047Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "69992465-80e5-4946-a17d-d3a0f847d958",
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
  "id": "8c976f81-cbe6-4763-b0a3-3d6b65ea9897",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:17:11.596668Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 0536362d-afda-43a2-91c1-2c7c510a07ab) → **201**

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
  "session_id": "ba136bbe-edb6-48dd-b77b-110fa8050813",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2MzIsImlhdCI6MTc5MzE5NjczMiwianRpIjoiOTVkMzQzY2UtZWFkNS00MzU0LTlhODctYTNmMzZjMTFiODQ4Iiwic2lkIjoiYmExMzZiYmUtZWRiNi00OGRkLWI3N2ItMTEwZmE4MDUwODEzIn0.bkJLSxgktAmFjCBSKhmNYKuc6_jOZOyig_6rVn0NHRg",
  "access_expires_at": "2026-10-28T14:27:12.216140793Z",
  "refresh_token": "5xn1N3oib7zVFr6VzBWplbmqQEWI6DdVjWtBe2TtfH4",
  "refresh_expires_at": "2026-10-29T02:12:12.215601446Z",
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
  "session_id": "cf47910b-4db8-458d-90ff-594234e6b732",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2MzIsImlhdCI6MTc5MzE5NjczMiwianRpIjoiMDRmZjljNWQtOTk2YS00YTljLWFhZTItMTNhY2YwNjAxYzVlIiwic2lkIjoiY2Y0NzkxMGItNGRiOC00NThkLTkwZmYtNTk0MjM0ZTZiNzMyIn0.WFM-FPaE7tdCVZSPk1mO-Bp4coN9RfKbQI6LA_OwjiE",
  "access_expires_at": "2026-10-28T14:27:12.775417382Z",
  "refresh_token": "IwBLKJOheyafdB70YNjMqPzFz84XX9ef5On_zYg4wck",
  "refresh_expires_at": "2026-10-29T02:12:12.774895639Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:12:11.881067Z",
      "actor": {
        "type": "CLIENT",
        "id": "cdde06b3-2cbe-45c9-ade5-6cfe921c2b77",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4",
        "quote_id": "8c976f81-cbe6-4763-b0a3-3d6b65ea9897",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0536362d-afda-43a2-91c1-2c7c510a07ab"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:12:11.883854Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4",
        "attempt_id": "06e59f76-9ca0-44c3-802f-1cc97719710a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0536362d-afda-43a2-91c1-2c7c510a07ab"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T14:12:11.896836Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4",
        "attempt_id": "06e59f76-9ca0-44c3-802f-1cc97719710a"
      },
      "correlation_id": "0536362d-afda-43a2-91c1-2c7c510a07ab"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "06e59f76-9ca0-44c3-802f-1cc97719710a",
        "generation": 1,
        "started_at": "2026-10-28T14:12:11.882496Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T14:12:11.896836Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T14:12:11.884907Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/0536362d-afda-43a2-91c1-2c7c510a07ab` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4:0",
      "order_id": "cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4",
      "at": "2026-10-28T14:12:11.881067Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4:1",
      "order_id": "cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4",
      "at": "2026-10-28T14:12:11.883854Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4:2",
      "order_id": "cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4",
      "at": "2026-10-28T14:12:11.896836Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/baab8356-32fd-43b0-878e-7fcfad3f5faa` → **200**

```json
{
  "found": []
}
```

Done: request 0536362d-afda-43a2-91c1-2c7c510a07ab — order cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4 found by its id.

`GET /api/rider/v1/orders/cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4` → **200**

```json
{
  "id": "cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cdde06b3-2cbe-45c9-ade5-6cfe921c2b77",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:12:11.880201Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4/cancel` → **200**

```json
{
  "command_id": "bfe78f1c-469b-4641-ad28-d96d59e06d24",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cbf3a13e-3da1-4d89-abb2-1ddfa4ce9ab4",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cdde06b3-2cbe-45c9-ade5-6cfe921c2b77",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:12:11.880201Z",
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
  "phone": "+380631071573",
  "device_ref": "sandbox-6512"
}
```

```json
{
  "challenge_id": "8fbed8f7-cfee-492b-ba06-666c65104486",
  "expires_at": "2026-10-28T14:17:14.484155381Z",
  "resend_available_at": "2026-10-28T14:12:15.484155381Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631071573` → **200**

```json
{
  "phone": "+380631071573",
  "audience": "CLIENT",
  "code": "012649",
  "sent_at": "2026-10-28T14:12:14.486524974Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8fbed8f7-cfee-492b-ba06-666c65104486",
  "code": "012649",
  "device_ref": "sandbox-6512"
}
```

```json
{
  "session_id": "ff1f681a-7912-4873-82d0-f3a6bc01e18a",
  "subject": {
    "type": "CLIENT",
    "id": "45988d18-e3e8-4172-9f11-aaaf600fcf69"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTk4OGQxOC1lM2U4LTQxNzItOWYxMS1hYWFmNjAwZmNmNjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NjM0LCJpYXQiOjE3OTMxOTY3MzQsImp0aSI6IjU1OWNjZjliLTI5ZmMtNDJmMS04YWM0LTExOTJlYWVhNjhkYyIsInNpZCI6ImZmMWY2ODFhLTc5MTItNDg3My04MmQwLWYzYTZiYzAxZTE4YSJ9.WEk17SXGM9dl2jf4AYHTmH0nY9Uftv17PwzJ-KbC84M",
  "access_expires_at": "2026-10-28T14:27:14.783229357Z",
  "refresh_token": "Td8Lpycblyff1-g0h2T8FsKRcQWlsq9LzliapMaQK3k",
  "refresh_expires_at": "2026-11-27T14:12:14.782614948Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "7e655ddd-9abe-4f52-94dd-deccf6e369a8",
  "expires_at": "2026-10-28T14:17:17.058423256Z",
  "resend_available_at": "2026-10-28T14:12:18.058423256Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631071573` → **200**

```json
{
  "phone": "+380631071573",
  "audience": "CLIENT",
  "code": "264352",
  "sent_at": "2026-10-28T14:12:17.060763403Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "bd4c6f4d-0797-4d07-9d78-48c408b7b478",
  "challenge_id": "7e655ddd-9abe-4f52-94dd-deccf6e369a8",
  "otp_code": "264352"
}
```

```json
{
  "id": "df891085-4039-4cc4-9d1b-dc0c45ef195b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:12:17.369331Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/df891085-4039-4cc4-9d1b-dc0c45ef195b` → **200**

```json
{
  "id": "df891085-4039-4cc4-9d1b-dc0c45ef195b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:12:17.369331Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/df891085-4039-4cc4-9d1b-dc0c45ef195b` → **200**

```json
{
  "id": "df891085-4039-4cc4-9d1b-dc0c45ef195b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:12:17.369331Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/df891085-4039-4cc4-9d1b-dc0c45ef195b` → **200**

```json
{
  "id": "df891085-4039-4cc4-9d1b-dc0c45ef195b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:12:17.369331Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/df891085-4039-4cc4-9d1b-dc0c45ef195b` → **200**

```json
{
  "id": "df891085-4039-4cc4-9d1b-dc0c45ef195b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:12:17.369331Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/df891085-4039-4cc4-9d1b-dc0c45ef195b` → **200**

```json
{
  "id": "df891085-4039-4cc4-9d1b-dc0c45ef195b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:12:17.369331Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/df891085-4039-4cc4-9d1b-dc0c45ef195b` → **200**

```json
{
  "id": "df891085-4039-4cc4-9d1b-dc0c45ef195b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:12:17.369331Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/df891085-4039-4cc4-9d1b-dc0c45ef195b` → **200**

```json
{
  "id": "df891085-4039-4cc4-9d1b-dc0c45ef195b",
  "state": "READY",
  "created_at": "2026-10-28T14:12:17.369331Z",
  "ready_at": "2026-10-28T14:12:24.576797Z",
  "expires_at": "2026-11-04T14:12:24.576797Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/df891085-4039-4cc4-9d1b-dc0c45ef195b/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638405609",
  "device_ref": "sandbox-29814"
}
```

```json
{
  "challenge_id": "9f245dd3-3765-4ccb-8668-7346390a8790",
  "expires_at": "2026-10-28T14:17:25.569656368Z",
  "resend_available_at": "2026-10-28T14:12:26.569656368Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638405609` → **200**

```json
{
  "phone": "+380638405609",
  "audience": "CLIENT",
  "code": "748236",
  "sent_at": "2026-10-28T14:12:25.572275937Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f245dd3-3765-4ccb-8668-7346390a8790",
  "code": "748236",
  "device_ref": "sandbox-29814"
}
```

```json
{
  "session_id": "163d8b6f-1b68-48fd-986c-ab36c6789780",
  "subject": {
    "type": "CLIENT",
    "id": "5705ce3c-ce56-4d32-b116-aaea972f3193"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NzA1Y2UzYy1jZTU2LTRkMzItYjExNi1hYWVhOTcyZjMxOTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NjQ1LCJpYXQiOjE3OTMxOTY3NDUsImp0aSI6IjUyOGVjOGU4LWRmZDAtNDI5MC1iNGE2LWI1ZDI5ZWU4YzUzNSIsInNpZCI6IjE2M2Q4YjZmLTFiNjgtNDhmZC05ODZjLWFiMzZjNjc4OTc4MCJ9.CSgQMX0_BJQmXxF7PYQIxuaiFZVAVt6oZb9K5UctlHw",
  "access_expires_at": "2026-10-28T14:27:25.869047386Z",
  "refresh_token": "VcbtxiXz_seljzStF3g4xTZL9FSVoerihThdrJlGKPg",
  "refresh_expires_at": "2026-11-27T14:12:25.868560207Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/df891085-4039-4cc4-9d1b-dc0c45ef195b/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/df891085-4039-4cc4-9d1b-dc0c45ef195b/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "336311ff-2024-475a-8737-48a68f22ce12"
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
  "session_id": "a4c13ece-4493-450b-8940-e9c37616d584",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2NDYsImlhdCI6MTc5MzE5Njc0NiwianRpIjoiZTUzODFlZGMtMzU3NS00OTg2LTg3ZGMtMjA5N2JhZjJmY2NlIiwic2lkIjoiYTRjMTNlY2UtNDQ5My00NTBiLTg5NDAtZTljMzc2MTZkNTg0In0.hR9c07fDFLpg9jIcPOw-n-S1n6PXrCvlAXdUZPIoYWA",
  "access_expires_at": "2026-10-28T14:27:26.689675672Z",
  "refresh_token": "VtHS7NxqPlKbEl6bhBZy5oM-dC3BebE2F_88K4qllhI",
  "refresh_expires_at": "2026-10-29T02:12:26.689103985Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "45988d18-e3e8-4172-9f11-aaaf600fcf69",
  "session_id": "ff1f681a-7912-4873-82d0-f3a6bc01e18a",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/45988d18-e3e8-4172-9f11-aaaf600fcf69/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "df891085-4039-4cc4-9d1b-dc0c45ef195b",
      "state": "READY",
      "created_at": "2026-10-28T14:12:17.369331Z",
      "ready_at": "2026-10-28T14:12:24.576797Z",
      "expires_at": "2026-11-04T14:12:24.576797Z",
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
  "device_ref": "sandbox-32439"
}
```

```json
{
  "challenge_id": "5397779d-fdb7-4f31-a4ec-e97a6e23acb3",
  "expires_at": "2026-10-28T14:17:27.490918245Z",
  "resend_available_at": "2026-10-28T14:12:28.490918245Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "573731",
  "sent_at": "2026-10-28T14:12:27.493292807Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5397779d-fdb7-4f31-a4ec-e97a6e23acb3",
  "code": "573731",
  "device_ref": "sandbox-32439"
}
```

```json
{
  "session_id": "decb5a7c-835d-4d0b-8524-1fe3b1bcd38b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzY0NywiaWF0IjoxNzkzMTk2NzQ3LCJqdGkiOiIzZWNhMTA0MS1lN2JhLTRhN2EtYWRlYy0zYTNkZjZjNTNkZWYiLCJzaWQiOiJkZWNiNWE3Yy04MzVkLTRkMGItODUyNC0xZmUzYjFiY2QzOGIifQ.J4VJa8JANskgNwM3NTJq3YV7lrBtc1O1TOwGHbp2gVU",
  "access_expires_at": "2026-10-28T14:27:27.786895283Z",
  "refresh_token": "CaXHNgoqVuYQedhjhWjCz5AI8ThOgAbuGZoVZENoxVg",
  "refresh_expires_at": "2026-11-27T14:12:27.786324101Z",
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
  "device_ref": "sandbox-6331"
}
```

```json
{
  "challenge_id": "9c8f13c6-a57a-4c04-8c10-72e763ab7bdb",
  "expires_at": "2026-10-28T14:17:28.325310117Z",
  "resend_available_at": "2026-10-28T14:12:29.325310117Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "398615",
  "sent_at": "2026-10-28T14:12:28.327490084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c8f13c6-a57a-4c04-8c10-72e763ab7bdb",
  "code": "398615",
  "device_ref": "sandbox-6331"
}
```

```json
{
  "session_id": "55c80d51-eaa0-4c8a-adaa-df18c0857b6f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzY0OCwiaWF0IjoxNzkzMTk2NzQ4LCJqdGkiOiJkZDZlZGE2NS01M2I1LTQ1MGYtYTQ0ZS00NjBmNzZhNmRiOWQiLCJzaWQiOiI1NWM4MGQ1MS1lYWEwLTRjOGEtYWRhYS1kZjE4YzA4NTdiNmYifQ.DKDMqxjw5jNXruyP2ciAxUy-GYHhqAib-dCQECSY7lA",
  "access_expires_at": "2026-10-28T14:27:28.620897746Z",
  "refresh_token": "MOk3tG1qu5dIHUlyKSZ2X13XM76BYn8I9Cz-WKxPRzE",
  "refresh_expires_at": "2026-11-27T14:12:28.620276787Z",
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
  "command_id": "5487c671-d3e7-42d7-9500-5b4d219af751",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:12:29Z",
    "sequence": 1793196749156
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dd7aeab7-b5c0-4e12-9b6c-695f280bc49c",
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
  "last_heartbeat_at": "2026-10-28T14:12:29.175626Z",
  "last_location_at": "2026-10-28T14:12:29.175626Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-12992"
}
```

```json
{
  "challenge_id": "af186ab3-0120-40e9-b518-d54764e960a0",
  "expires_at": "2026-10-28T14:17:29.439560721Z",
  "resend_available_at": "2026-10-28T14:12:30.439560721Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "078731",
  "sent_at": "2026-10-28T14:12:29.441769703Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af186ab3-0120-40e9-b518-d54764e960a0",
  "code": "078731",
  "device_ref": "sandbox-12992"
}
```

```json
{
  "session_id": "2e174f1a-215a-48a9-b832-48ca56d78f76",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzY0OSwiaWF0IjoxNzkzMTk2NzQ5LCJqdGkiOiIxNzgwNmYzYS1jYTEwLTQ5NjAtYjQxNi0xZjUzMmFjYjExMTAiLCJzaWQiOiIyZTE3NGYxYS0yMTVhLTQ4YTktYjgzMi00OGNhNTZkNzhmNzYifQ.cQUl9nqg4mLPuSySVgrTMOkm5DV-GFETcIKCWl6LqyM",
  "access_expires_at": "2026-10-28T14:27:29.744441396Z",
  "refresh_token": "LRVh6pPiLP2x6n_W90bXIcYLdUywv9h2w85nV0B7lPY",
  "refresh_expires_at": "2026-11-27T14:12:29.743940071Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e9aa3d9c-9747-4caa-87da-31ca0e0f85c9",
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
  "last_heartbeat_at": "2026-10-28T14:10:51.31362Z",
  "last_location_at": "2026-10-28T14:10:51.31362Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e9aa3d9c-9747-4caa-87da-31ca0e0f85c9/handover` → **200**

```json
{
  "command_id": "97fb96a6-e797-44bc-b02f-b41e4b9ee957",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e9aa3d9c-9747-4caa-87da-31ca0e0f85c9",
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
  "last_heartbeat_at": "2026-10-28T14:10:51.31362Z",
  "last_location_at": "2026-10-28T14:10:51.31362Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e9aa3d9c-9747-4caa-87da-31ca0e0f85c9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:12:30Z",
    "sequence": 1793196750557
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e9aa3d9c-9747-4caa-87da-31ca0e0f85c9",
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
  "last_heartbeat_at": "2026-10-28T14:12:30.577118Z",
  "last_location_at": "2026-10-28T14:12:30.577118Z",
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
  "session_id": "2269da95-c1f4-4b60-9206-6911ca783376",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2NTEsImlhdCI6MTc5MzE5Njc1MSwianRpIjoiM2MxOThiNzgtZjBlYi00NmRlLWE2OTgtNzQ3YjIyNmNmMjU0Iiwic2lkIjoiMjI2OWRhOTUtYzFmNC00YjYwLTkyMDYtNjkxMWNhNzgzMzc2In0.meB5f7sJO31NhNPDinGqGkATz5YC_h3xJ91n7ub91xI",
  "access_expires_at": "2026-10-28T14:27:31.124900141Z",
  "refresh_token": "EU8cIDhQYi9mvBB9dCKUN1MtwImjRie1c0RFO45Bd8g",
  "refresh_expires_at": "2026-10-29T02:12:31.124378327Z",
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
  "session_id": "64124b9f-0f0b-40cd-b2ac-4defa2a4c2e2",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2NTEsImlhdCI6MTc5MzE5Njc1MSwianRpIjoiN2VmMmRmZDItZjVkOS00ZmZjLTkzYWEtZDAwMWU1ZDcxN2ZhIiwic2lkIjoiNjQxMjRiOWYtMGYwYi00MGNkLWIyYWMtNGRlZmEyYTRjMmUyIn0.A9Caz8N_CqOinIDymhKjnwL8-oU82fd8zoTbgKMQi9c",
  "access_expires_at": "2026-10-28T14:27:31.691823152Z",
  "refresh_token": "1c-CemvFz1BBBbaDIgmEv7u_ET7KXzhxghJmweVTou8",
  "refresh_expires_at": "2026-10-29T02:12:31.691026916Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681009581",
  "device_ref": "sandbox-20039"
}
```

```json
{
  "challenge_id": "5e3f4aa7-5e68-42c5-a167-c1b0e38a7b61",
  "expires_at": "2026-10-28T14:17:31.951584477Z",
  "resend_available_at": "2026-10-28T14:12:32.951584477Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380681009581` → **200**

```json
{
  "phone": "+380681009581",
  "audience": "CLIENT",
  "code": "071126",
  "sent_at": "2026-10-28T14:12:31.954688459Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e3f4aa7-5e68-42c5-a167-c1b0e38a7b61",
  "code": "071126",
  "device_ref": "sandbox-20039"
}
```

```json
{
  "session_id": "923862fd-dcd0-4b91-a416-1131761c593b",
  "subject": {
    "type": "CLIENT",
    "id": "9a7c4e17-0b59-43be-b9a6-eb7536c63ba8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YTdjNGUxNy0wYjU5LTQzYmUtYjlhNi1lYjc1MzZjNjNiYTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NjUyLCJpYXQiOjE3OTMxOTY3NTIsImp0aSI6IjFlODkxN2JlLTU2NjEtNGE5ZC04M2NjLTU4M2U1YmRjODE5YSIsInNpZCI6IjkyMzg2MmZkLWRjZDAtNGI5MS1hNDE2LTExMzE3NjFjNTkzYiJ9.sCIn12nXKA6JEiFO2xPLCUufJzql3CEEqxMs2dlOymw",
  "access_expires_at": "2026-10-28T14:27:32.24236506Z",
  "refresh_token": "-vTCDtNibCnTgNNKERRcPa_VAhrUYCYvX3iwd5lH7Hk",
  "refresh_expires_at": "2026-11-27T14:12:32.241867331Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3054c6a5-0c9b-46e7-bdf2-cbb85f154982",
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
  "id": "a318ce29-7c20-4794-afaa-f6578d15d5ab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:17:32.512654Z",
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
  "command_id": "6463f155-5e13-401f-9c78-94d971d5320f",
  "quote_id": "a318ce29-7c20-4794-afaa-f6578d15d5ab",
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
  "id": "4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a7c4e17-0b59-43be-b9a6-eb7536c63ba8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:12:32.792164Z",
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
    "id": "7b7b1771-75ba-4f07-9f69-60d1234a71f4",
    "order_id": "4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2",
    "expires_at": "2026-10-28T14:12:47.79638Z",
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

`POST /api/driver/v1/offers/7b7b1771-75ba-4f07-9f69-60d1234a71f4/reject` → **204**

```json
{
  "command_id": "ae38a867-f577-4a4a-b49c-435c06467e00"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7f9454c7-d46b-4c19-82ea-2b326a929841",
    "order_id": "4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2",
    "expires_at": "2026-10-28T14:12:48.359852Z",
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

`POST /api/driver/v1/offers/7f9454c7-d46b-4c19-82ea-2b326a929841/accept` → **200**

```json
{
  "command_id": "7260501f-cde0-4bd5-8a3f-7e670043a084"
}
```

```json
{
  "id": "0eed544b-9e4a-48dc-8f2f-0a34a233d380",
  "order_id": "4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a8fcdf05-04c5-4335-8cc8-984c37355290",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:12:32.792875Z",
      "actor": {
        "type": "CLIENT",
        "id": "9a7c4e17-0b59-43be-b9a6-eb7536c63ba8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2",
        "quote_id": "a318ce29-7c20-4794-afaa-f6578d15d5ab",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "37246f72-2228-4502-83d4-05ff6e9a12cf"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:12:32.795406Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2",
        "attempt_id": "2b060800-0a5b-4e79-b9c5-fcfc2d4082b5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "37246f72-2228-4502-83d4-05ff6e9a12cf"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:12:32.804246Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7b7b1771-75ba-4f07-9f69-60d1234a71f4",
        "order_id": "4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "37246f72-2228-4502-83d4-05ff6e9a12cf"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T14:12:33.358266Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7b7b1771-75ba-4f07-9f69-60d1234a71f4",
        "order_id": "4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2"
      },
      "correlation_id": "ff7c248e-efd4-45db-95de-773da70842dc"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2` → **200**

```json
{
  "id": "4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9a7c4e17-0b59-43be-b9a6-eb7536c63ba8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "0eed544b-9e4a-48dc-8f2f-0a34a233d380",
    "order_id": "4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a8fcdf05-04c5-4335-8cc8-984c37355290",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:12:32.792164Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2/cancel` → **200**

```json
{
  "command_id": "9cc34f89-02c6-4500-a3ff-e474e4ccf09d",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9a7c4e17-0b59-43be-b9a6-eb7536c63ba8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "0eed544b-9e4a-48dc-8f2f-0a34a233d380",
    "order_id": "4a2ec9a5-ea39-4e9f-af19-3b55fd4542a2",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a8fcdf05-04c5-4335-8cc8-984c37355290",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:12:32.792164Z",
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
  "session_id": "dd7aeab7-b5c0-4e12-9b6c-695f280bc49c",
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
  "last_heartbeat_at": "2026-10-28T14:12:29.175626Z",
  "last_location_at": "2026-10-28T14:12:29.175626Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dd7aeab7-b5c0-4e12-9b6c-695f280bc49c/close` → **200**

```json
{
  "command_id": "46730551-80f2-4d17-af75-b92576a1d2b0",
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
  "session_id": "e9aa3d9c-9747-4caa-87da-31ca0e0f85c9",
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
  "last_heartbeat_at": "2026-10-28T14:12:30.577118Z",
  "last_location_at": "2026-10-28T14:12:30.577118Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9aa3d9c-9747-4caa-87da-31ca0e0f85c9/close` → **200**

```json
{
  "command_id": "d86d769b-3a40-42dc-a8c4-a6e5ab81f80c",
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
  "device_ref": "sandbox-20449"
}
```

```json
{
  "challenge_id": "4a55fea0-2033-4ced-aecb-3af8d421c3d5",
  "expires_at": "2026-10-28T14:17:36.251274117Z",
  "resend_available_at": "2026-10-28T14:12:37.251274117Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "804670",
  "sent_at": "2026-10-28T14:12:36.253910535Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a55fea0-2033-4ced-aecb-3af8d421c3d5",
  "code": "804670",
  "device_ref": "sandbox-20449"
}
```

```json
{
  "session_id": "d4d90c2d-0ac2-417c-a454-2356d507ff76",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzY1NiwiaWF0IjoxNzkzMTk2NzU2LCJqdGkiOiIyZWRiNTNlNS0zNGIzLTRlMTQtOGNjNS0zYTg4ZTcwZWEyODUiLCJzaWQiOiJkNGQ5MGMyZC0wYWMyLTQxN2MtYTQ1NC0yMzU2ZDUwN2ZmNzYifQ.-YC3GRniI1BDjkFjeNX1oJDSKAYYUpwB5OInPOjVXeM",
  "access_expires_at": "2026-10-28T14:27:36.5491257Z",
  "refresh_token": "-t_77tBPh3RrB_W66VNgYQRvAnVF18BY3mkrvpgBNG4",
  "refresh_expires_at": "2026-11-27T14:12:36.548478738Z",
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
  "command_id": "3d89b14f-d12f-49a6-8693-24c45627cf82",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:12:37Z",
    "sequence": 1793196757845
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83af30a4-f35c-436f-a8b7-46f0915fda2d",
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
  "last_heartbeat_at": "2026-10-28T14:12:37.103197Z",
  "last_location_at": "2026-10-28T14:12:37.103197Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674993692",
  "device_ref": "sandbox-9642"
}
```

```json
{
  "challenge_id": "0596db7f-8ae9-462a-917b-b5d0f51a4040",
  "expires_at": "2026-10-28T14:17:37.363227766Z",
  "resend_available_at": "2026-10-28T14:12:38.363227766Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674993692` → **200**

```json
{
  "phone": "+380674993692",
  "audience": "CLIENT",
  "code": "604903",
  "sent_at": "2026-10-28T14:12:37.365851296Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0596db7f-8ae9-462a-917b-b5d0f51a4040",
  "code": "604903",
  "device_ref": "sandbox-9642"
}
```

```json
{
  "session_id": "73131ae2-3a6a-4fd3-96c3-2b56e636fb4c",
  "subject": {
    "type": "CLIENT",
    "id": "adb8b552-a026-4e65-9be5-0aa17c583b0c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZGI4YjU1Mi1hMDI2LTRlNjUtOWJlNS0wYWExN2M1ODNiMGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NjU3LCJpYXQiOjE3OTMxOTY3NTcsImp0aSI6IjY2MDAxOTMxLWUyNjItNDBkNC04M2MxLTRjNjMwZmRhNTMyMiIsInNpZCI6IjczMTMxYWUyLTNhNmEtNGZkMy05NmMzLTJiNTZlNjM2ZmI0YyJ9.K-TICF5NrP3FAl6VmiGLl5CJqXqWwSVriH1LNC7T7wk",
  "access_expires_at": "2026-10-28T14:27:37.65458053Z",
  "refresh_token": "xNcxiLgo_BzLBpJwrGL77DHi8p4QDqHxi-Lqhl71F_E",
  "refresh_expires_at": "2026-11-27T14:12:37.654039941Z",
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
  "command_id": "bcb4bf3a-3e71-4a40-b225-8fc7546a1011",
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
  "id": "b001e3b1-e055-426c-877e-b5e99ec133d7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:17:38.188765Z",
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
  "command_id": "0084a7d4-82c3-4c5a-81aa-dfc81ec5794e",
  "platform": "ANDROID",
  "token": "sandbox-driver-92fca934-4e92-41fe-95e9-fa741fabcc93"
}
```

```json
{
  "id": "5d8e18fd-ff75-4da6-9346-889fd704926a",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:12:38.48136Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "8bbdb426-415c-4d02-9a06-85e9d23e9534",
  "platform": "ANDROID",
  "token": "sandbox-rider-f3a2b0bd-1267-4c4a-82d7-e7e0b8340211"
}
```

```json
{
  "id": "55c30358-d1f7-4029-abd9-5f9dc9f70d47",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:12:38.743775Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "cfd6e40c-98bc-4e89-b0cb-5e64ac333dfd",
  "quote_id": "b001e3b1-e055-426c-877e-b5e99ec133d7",
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
  "id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "adb8b552-a026-4e65-9be5-0aa17c583b0c",
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
  "created_at": "2026-10-28T14:12:39.010962Z",
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
    "id": "f3df2964-e209-407d-8daf-3b76c288a928",
    "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
    "expires_at": "2026-10-28T14:12:54.014155Z",
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

`POST /api/driver/v1/offers/f3df2964-e209-407d-8daf-3b76c288a928/accept` → **200**

```json
{
  "command_id": "b9f1847a-358a-4415-baa4-64ba6e3b23c5"
}
```

```json
{
  "id": "74c3b2a5-6d8b-4afe-ac56-fe7667b17174",
  "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "606fb36e-f013-4d13-b7e7-b91acdc132bd",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:12:38.986Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:12:38.986Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:12:40.042274439Z",
    "token_suffix": "abcc93",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "7b6794ff-34ed-4241-b830-a25ebc266f47",
      "order_version": "2",
      "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674993692&after=2026-10-28T14:12:38.986Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380674993692&after=2026-10-28T14:12:38.986Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:12:41.04643667Z",
    "token_suffix": "340211",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "f21c4bdf-9bf0-4abd-a49d-fb7da43650ad",
      "order_version": "3",
      "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/211760b1-8280-414b-8bab-a6f0d4526ed5/messages` → **201**

```json
{
  "command_id": "7b648b7a-7dbd-45f5-80b9-cd021fe6c451",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "56ed4f96-3257-43b6-a2ae-547b676adceb",
  "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T14:12:41.952072054Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "606fb36e-f013-4d13-b7e7-b91acdc132bd",
  "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
  "assignment_id": "74c3b2a5-6d8b-4afe-ac56-fe7667b17174",
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

`POST /api/driver/v1/trips/606fb36e-f013-4d13-b7e7-b91acdc132bd/messages` → **201**

```json
{
  "command_id": "5c0fa49e-9ef2-48c3-a217-3b301e7c0d1a",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "33e67f5c-bad0-4443-bd41-9384b5dc5058",
  "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T14:12:42.473996014Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/211760b1-8280-414b-8bab-a6f0d4526ed5/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/606fb36e-f013-4d13-b7e7-b91acdc132bd/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674993692"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/83af30a4-f35c-436f-a8b7-46f0915fda2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:12:43Z",
    "sequence": 1793196763245
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83af30a4-f35c-436f-a8b7-46f0915fda2d",
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
  "last_heartbeat_at": "2026-10-28T14:12:43.264418Z",
  "last_location_at": "2026-10-28T14:12:43.264418Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "606fb36e-f013-4d13-b7e7-b91acdc132bd",
  "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
  "assignment_id": "74c3b2a5-6d8b-4afe-ac56-fe7667b17174",
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

`POST /api/driver/v1/trips/606fb36e-f013-4d13-b7e7-b91acdc132bd/arrive` → **200**

```json
{
  "command_id": "4f37a44e-dbc5-4086-857a-9e96a1afddcd",
  "expected_version": 0
}
```

```json
{
  "id": "606fb36e-f013-4d13-b7e7-b91acdc132bd",
  "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
  "assignment_id": "74c3b2a5-6d8b-4afe-ac56-fe7667b17174",
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
  "arrived_at": "2026-10-28T14:12:43.800063Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/606fb36e-f013-4d13-b7e7-b91acdc132bd/start` → **200**

```json
{
  "command_id": "0f131215-07d8-4050-8978-6e35663330a0",
  "expected_version": 1
}
```

```json
{
  "id": "606fb36e-f013-4d13-b7e7-b91acdc132bd",
  "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
  "assignment_id": "74c3b2a5-6d8b-4afe-ac56-fe7667b17174",
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
  "arrived_at": "2026-10-28T14:12:43.800063Z",
  "started_at": "2026-10-28T14:12:44.070992Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/83af30a4-f35c-436f-a8b7-46f0915fda2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:12:44Z",
    "sequence": 1793196764337
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83af30a4-f35c-436f-a8b7-46f0915fda2d",
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
  "last_heartbeat_at": "2026-10-28T14:12:44.357438Z",
  "last_location_at": "2026-10-28T14:12:44.357438Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/606fb36e-f013-4d13-b7e7-b91acdc132bd/complete` → **200**

```json
{
  "command_id": "350a7f81-3f98-462e-923f-1f78fef9f14a",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:12:44Z",
  "cash_received": true
}
```

```json
{
  "id": "606fb36e-f013-4d13-b7e7-b91acdc132bd",
  "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
  "assignment_id": "74c3b2a5-6d8b-4afe-ac56-fe7667b17174",
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
  "arrived_at": "2026-10-28T14:12:43.800063Z",
  "started_at": "2026-10-28T14:12:44.070992Z",
  "completed_at": "2026-10-28T14:12:44.644422Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/211760b1-8280-414b-8bab-a6f0d4526ed5` → **200**

```json
{
  "id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "adb8b552-a026-4e65-9be5-0aa17c583b0c",
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
    "id": "74c3b2a5-6d8b-4afe-ac56-fe7667b17174",
    "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "606fb36e-f013-4d13-b7e7-b91acdc132bd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:12:39.010962Z",
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
    "id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:12:39.010962Z",
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
    "id": "606fb36e-f013-4d13-b7e7-b91acdc132bd",
    "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
    "order_short_number": 9,
    "created_at": "2026-10-28T14:12:39.570632Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "399972f8-081b-4686-8764-5bb217e1534b",
    "order_id": "cb4ec4e9-836c-4acc-b840-c726ef88fdca",
    "order_short_number": 2,
    "created_at": "2026-10-28T14:10:40.075639Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "350f9c11-a884-4c06-9280-bd4b7acb3aa0",
    "order_id": "7529af78-1947-402e-9f43-4bdb07a48445",
    "order_short_number": 1,
    "created_at": "2026-10-28T14:10:18.626848Z",
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

`GET /api/rider/v1/orders/211760b1-8280-414b-8bab-a6f0d4526ed5/tip` → **200**

```json
{
  "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
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
  "available_until": "2026-10-29T14:12:44.644422Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/211760b1-8280-414b-8bab-a6f0d4526ed5/tip` → **201**

```json
{
  "command_id": "aea6027f-9b87-4553-a0d8-7a80ae6a1439",
  "amount_minor": 1100
}
```

```json
{
  "id": "b9b47008-4216-4ef7-acb7-ca0013f5adbe",
  "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T14:12:49.556699Z"
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
  "session_id": "79b856a4-58d3-4289-add8-a8da691af577",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2NzAsImlhdCI6MTc5MzE5Njc3MCwianRpIjoiYWZlY2QzNDAtYjIxMS00Nzc2LWI5NjktNTkyZDE2ZjA0YWM3Iiwic2lkIjoiNzliODU2YTQtNThkMy00Mjg5LWFkZDgtYThkYTY5MWFmNTc3In0.xto5nCT6fpNv-a3JCtMG_SVPaylo0qy6SW84uVOrBIA",
  "access_expires_at": "2026-10-28T14:27:50.12276278Z",
  "refresh_token": "N88Yd32nb46QV16nGbeJCXr3Nh7mdy-gVEUGmlDaRwo",
  "refresh_expires_at": "2026-10-29T02:12:50.122193848Z",
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
          "CASH": 8,
          "CARD": 1
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
      "CASH": 8,
      "CARD": 1
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
  "generated_at": "2026-10-28T14:12:50.388271275Z"
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
  "generated_at": "2026-10-28T14:12:50.654484201Z"
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
  "session_id": "094dd4b2-813c-42cd-a405-33767c2dc091",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2NzEsImlhdCI6MTc5MzE5Njc3MSwianRpIjoiOTkyNzQ1YTktMmQ2ZS00MWIxLWE3M2MtODA2OGE5NmQ0OWNlIiwic2lkIjoiMDk0ZGQ0YjItODEzYy00MmNkLWE0MDUtMzM3NjdjMmRjMDkxIn0.-YT4fkAt2L1pY7Bm0Rh0vPGhCOXVosSh41GNg7fJslM",
  "access_expires_at": "2026-10-28T14:27:51.23013048Z",
  "refresh_token": "6VDoApWXWFUWC_-tEKuMbK4G0y75LDFk4WIrKVUqS4I",
  "refresh_expires_at": "2026-10-29T02:12:51.229563459Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/211760b1-8280-414b-8bab-a6f0d4526ed5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:12:39.01139Z",
      "actor": {
        "type": "CLIENT",
        "id": "adb8b552-a026-4e65-9be5-0aa17c583b0c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
        "quote_id": "b001e3b1-e055-426c-877e-b5e99ec133d7",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b25d6343-2d81-4de3-8467-6bb77136c3c1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:12:39.013358Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
        "attempt_id": "695ab3aa-6f48-4b41-9869-c3fc23951b1e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b25d6343-2d81-4de3-8467-6bb77136c3c1"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:12:39.016965Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f3df2964-e209-407d-8daf-3b76c288a928",
        "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "b25d6343-2d81-4de3-8467-6bb77136c3c1"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:12:39.572217Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f3df2964-e209-407d-8daf-3b76c288a928",
        "order_id": "211760b1-8280-414b-8bab-a6f0d4526ed5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "74c3b2a5-6d8b-4afe-ac56-fe7667b17174"
      },
      "correlation_id": "3cf535ab-1ad3-4435-afdd-586ac1f47dcb"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T14:12:51.747211895Z",
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
      "last_location_at": "2026-10-28T14:12:44.357438Z",
      "order_id": null
    }
  ]
}
```

Done: order 211760b1-8280-414b-8bab-a6f0d4526ed5.

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
  "session_id": "dca84d6f-942e-42b9-b94e-55c9a27b0d5f",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2NzIsImlhdCI6MTc5MzE5Njc3MiwianRpIjoiMzRlMzY5NDgtMWMxZC00ZThkLWE0MjQtN2MzMzQ4ZGE3ZmM0Iiwic2lkIjoiZGNhODRkNmYtOTQyZS00MmI5LWI5NGUtNTVjOWEyN2IwZDVmIn0.D7xlyISOR4RSW5jC17twf1pERBKkU0koB5TkHsUyHA4",
  "access_expires_at": "2026-10-28T14:27:52.31509898Z",
  "refresh_token": "BpQYNQoUx0HT8QAAV1qCppoD7HSYATMpeOOjwS-QObU",
  "refresh_expires_at": "2026-10-29T02:12:52.314543134Z",
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
  "command_id": "a1f461d9-3ed2-4d2f-80ea-eb109a3a93f7",
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
  "timestamp": "2026-10-28T14:12:53.000+0000",
  "channel": {
    "id": "1730052000.288109888",
    "linkedid": "1730052000.288109888",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674966733"
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
  "timestamp": "2026-10-28T14:12:53.000+0000",
  "channel": {
    "id": "1730052000.288109888",
    "linkedid": "1730052000.288109888",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674966733"
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
  "session_id": "b4a79447-c3ba-43aa-9a33-74657043a24d",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2NzMsImlhdCI6MTc5MzE5Njc3MywianRpIjoiOGZlOWY3YTktMzk1Zi00MmZiLTk1MDItZGQ3NWM4ZjdmNTg0Iiwic2lkIjoiYjRhNzk0NDctYzNiYS00M2FhLTlhMzMtNzQ2NTcwNDNhMjRkIn0.dPuSeyely4Sfd68sqY-i0C9MlVDbcOXvIfF8darX7oI",
  "access_expires_at": "2026-10-28T14:27:53.433398265Z",
  "refresh_token": "PXZGYlu7jUO5yD8Hd3QsIQQ_FTqkipKe5G-MjsdAzKk",
  "refresh_expires_at": "2026-10-29T02:12:53.432885568Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "2a9fc4c0-1845-4a21-a341-8611c3661e93",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674966733",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:12:53Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/2a9fc4c0-1845-4a21-a341-8611c3661e93/answer` → **200**

```json
{
  "command_id": "4c0b9d68-e4f5-4ebf-81a0-90543b84f92b"
}
```

```json
{
  "id": "2a9fc4c0-1845-4a21-a341-8611c3661e93",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674966733",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "91585543-f74c-451e-a2d9-1db88b7458e9",
  "order_ids": [],
  "started_at": "2026-10-28T14:12:53Z",
  "answered_at": "2026-10-28T14:12:53.991649Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.288109888",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "384c8e95-03fa-45ad-b2b1-434204f4b334",
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
  "id": "3af0fa78-56fb-47d8-9678-528cc8aa6029",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:17:54.287916Z",
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
  "command_id": "2fc7328d-76ec-4718-a2a9-b365bbcbb76c",
  "quote_id": "3af0fa78-56fb-47d8-9678-528cc8aa6029",
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
    "phone": "+380674966733"
  },
  "call_id": "2a9fc4c0-1845-4a21-a341-8611c3661e93"
}
```

```json
{
  "id": "5fbb9d40-b908-4502-bc5a-94fb91ab5631",
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
  "created_at": "2026-10-28T14:12:54.568878Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674966733"
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
    "id": "1730052000.288109888",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "2a9fc4c0-1845-4a21-a341-8611c3661e93",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674966733",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "order_ids": [
        "5fbb9d40-b908-4502-bc5a-94fb91ab5631"
      ],
      "started_at": "2026-10-28T14:12:53Z",
      "answered_at": "2026-10-28T14:12:53.991649Z",
      "ended_at": "2026-10-28T14:12:54.860443Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "c8ad217a-84e3-4d60-b2f2-df1813017d72",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671401130",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91585543-f74c-451e-a2d9-1db88b7458e9",
      "order_ids": [],
      "started_at": "2026-10-28T14:10:26.669906Z",
      "answered_at": "2026-10-28T14:10:26.999246Z",
      "ended_at": "2026-10-28T14:10:27.298917Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:10:34.559014Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/5fbb9d40-b908-4502-bc5a-94fb91ab5631` → **200**

```json
{
  "id": "5fbb9d40-b908-4502-bc5a-94fb91ab5631",
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
  "created_at": "2026-10-28T14:12:54.568878Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674966733"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/5fbb9d40-b908-4502-bc5a-94fb91ab5631` → **200**

```json
{
  "id": "5fbb9d40-b908-4502-bc5a-94fb91ab5631",
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
  "created_at": "2026-10-28T14:12:54.568878Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674966733"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5fbb9d40-b908-4502-bc5a-94fb91ab5631/cancel` → **200**

```json
{
  "command_id": "67dd365f-8220-4616-a837-5eef46f4d575",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5fbb9d40-b908-4502-bc5a-94fb91ab5631",
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
  "created_at": "2026-10-28T14:12:54.568878Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674966733"
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

Done: call 2a9fc4c0-1845-4a21-a341-8611c3661e93 with order 5fbb9d40-b908-4502-bc5a-94fb91ab5631.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2455"
}
```

```json
{
  "challenge_id": "30a92735-97be-43fc-9ed9-a0b4e7a040b2",
  "expires_at": "2026-10-28T14:17:55.991705276Z",
  "resend_available_at": "2026-10-28T14:12:56.991705276Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "862263",
  "sent_at": "2026-10-28T14:12:55.993756585Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30a92735-97be-43fc-9ed9-a0b4e7a040b2",
  "code": "862263",
  "device_ref": "sandbox-2455"
}
```

```json
{
  "session_id": "f1857288-aeb0-46c1-b28b-3cc74843d76b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzY3NiwiaWF0IjoxNzkzMTk2Nzc2LCJqdGkiOiJhOWE2MmZhYy0zNjU4LTRlMjQtYTI4NC0yYmM0NDAxNzBmOWIiLCJzaWQiOiJmMTg1NzI4OC1hZWIwLTQ2YzEtYjI4Yi0zY2M3NDg0M2Q3NmIifQ.--bNtP7SczJpDX1wPTmRyUFgS-gxlssYCg8-wcoNgBY",
  "access_expires_at": "2026-10-28T14:27:56.277161882Z",
  "refresh_token": "XDQ1fG9Ty_nZdhu9gjqXyrgpBWDXDuzPrnWGQcCt8Iw",
  "refresh_expires_at": "2026-11-27T14:12:56.276624521Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83af30a4-f35c-436f-a8b7-46f0915fda2d",
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
  "last_heartbeat_at": "2026-10-28T14:12:44.357438Z",
  "last_location_at": "2026-10-28T14:12:44.357438Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/83af30a4-f35c-436f-a8b7-46f0915fda2d/handover` → **200**

```json
{
  "command_id": "4e08bb9a-dc64-4358-a6d3-c422169d3940",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83af30a4-f35c-436f-a8b7-46f0915fda2d",
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
  "last_heartbeat_at": "2026-10-28T14:12:44.357438Z",
  "last_location_at": "2026-10-28T14:12:44.357438Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/83af30a4-f35c-436f-a8b7-46f0915fda2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:12:57Z",
    "sequence": 1793196777131
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83af30a4-f35c-436f-a8b7-46f0915fda2d",
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
  "last_heartbeat_at": "2026-10-28T14:12:57.150065Z",
  "last_location_at": "2026-10-28T14:12:57.150065Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660426776",
  "device_ref": "sandbox-7339"
}
```

```json
{
  "challenge_id": "af47be23-a9ce-4f9a-8c9c-fd2a0df4d221",
  "expires_at": "2026-10-28T14:17:57.419438862Z",
  "resend_available_at": "2026-10-28T14:12:58.419438862Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660426776` → **200**

```json
{
  "phone": "+380660426776",
  "audience": "CLIENT",
  "code": "470508",
  "sent_at": "2026-10-28T14:12:57.421826456Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af47be23-a9ce-4f9a-8c9c-fd2a0df4d221",
  "code": "470508",
  "device_ref": "sandbox-7339"
}
```

```json
{
  "session_id": "6bef4a60-6b8f-484b-8823-cf1ffeec3505",
  "subject": {
    "type": "CLIENT",
    "id": "e3024415-6c74-4aa9-91bb-df160b1f9015"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzAyNDQxNS02Yzc0LTRhYTktOTFiYi1kZjE2MGIxZjkwMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3Njc3LCJpYXQiOjE3OTMxOTY3NzcsImp0aSI6ImE1MDAyM2ZhLWUzMTUtNGU1Zi04ODdhLWI0OThkMDgzNzUwMiIsInNpZCI6IjZiZWY0YTYwLTZiOGYtNDg0Yi04ODIzLWNmMWZmZWVjMzUwNSJ9.BvZ24ElBnet3VhrlQeXFbtikgOfW3V_ix4Qr1f6gKTc",
  "access_expires_at": "2026-10-28T14:27:57.706165742Z",
  "refresh_token": "JDINGhzdeznOwSuHg-VfIW8AFkJHLHV5PMZ3G9CAnao",
  "refresh_expires_at": "2026-11-27T14:12:57.705702778Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "863ab2e7-081f-4cff-a68d-b5c004cd29e4",
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
  "id": "1006645e-51a9-46b6-937f-59dd3a2019fb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:17:57.971706Z",
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
  "command_id": "7867ba4e-bb00-404c-a292-5c3344c754c2",
  "quote_id": "1006645e-51a9-46b6-937f-59dd3a2019fb",
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
  "id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e3024415-6c74-4aa9-91bb-df160b1f9015",
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
  "created_at": "2026-10-28T14:12:58.240222Z",
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
    "id": "db6a1c3a-ce9f-4ca2-b0cd-fbedeee9cb56",
    "order_id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
    "expires_at": "2026-10-28T14:13:13.243116Z",
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

`POST /api/driver/v1/offers/db6a1c3a-ce9f-4ca2-b0cd-fbedeee9cb56/accept` → **200**

```json
{
  "command_id": "c4e19339-9db2-4a6d-8538-e5f00f213b6d"
}
```

```json
{
  "id": "58cde8c0-d3e1-4d55-b523-e2156f57766a",
  "order_id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6389ffb4-97b6-401a-be34-4d9aaa5d5685",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6389ffb4-97b6-401a-be34-4d9aaa5d5685",
  "order_id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
  "assignment_id": "58cde8c0-d3e1-4d55-b523-e2156f57766a",
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

`POST /api/driver/v1/work-sessions/83af30a4-f35c-436f-a8b7-46f0915fda2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:12:59Z",
    "sequence": 1793196779309
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83af30a4-f35c-436f-a8b7-46f0915fda2d",
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
  "last_heartbeat_at": "2026-10-28T14:12:59.327826Z",
  "last_location_at": "2026-10-28T14:12:59.327826Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6389ffb4-97b6-401a-be34-4d9aaa5d5685/arrive` → **200**

```json
{
  "command_id": "6f5c824f-1738-4971-8596-cb9bb36e6d8c",
  "expected_version": 0
}
```

```json
{
  "id": "6389ffb4-97b6-401a-be34-4d9aaa5d5685",
  "order_id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
  "assignment_id": "58cde8c0-d3e1-4d55-b523-e2156f57766a",
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
  "arrived_at": "2026-10-28T14:12:59.605875Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6389ffb4-97b6-401a-be34-4d9aaa5d5685/start` → **200**

```json
{
  "command_id": "f1b85f81-e46f-45a0-b67f-0c66bf807bdf",
  "expected_version": 1
}
```

```json
{
  "id": "6389ffb4-97b6-401a-be34-4d9aaa5d5685",
  "order_id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
  "assignment_id": "58cde8c0-d3e1-4d55-b523-e2156f57766a",
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
  "arrived_at": "2026-10-28T14:12:59.605875Z",
  "started_at": "2026-10-28T14:12:59.899554Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/83af30a4-f35c-436f-a8b7-46f0915fda2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:13:00Z",
    "sequence": 1793196780168
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83af30a4-f35c-436f-a8b7-46f0915fda2d",
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
  "last_heartbeat_at": "2026-10-28T14:13:00.187055Z",
  "last_location_at": "2026-10-28T14:13:00.187055Z",
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
  "device_ref": "sandbox-18929"
}
```

```json
{
  "challenge_id": "3ab91abe-dd0f-460f-94e4-63633aa6b54e",
  "expires_at": "2026-10-28T14:18:00.448296088Z",
  "resend_available_at": "2026-10-28T14:13:01.448296088Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "494622",
  "sent_at": "2026-10-28T14:13:00.450643918Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ab91abe-dd0f-460f-94e4-63633aa6b54e",
  "code": "494622",
  "device_ref": "sandbox-18929"
}
```

```json
{
  "session_id": "3f47458c-ed07-4cfc-a711-55a2a09a02ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzY4MCwiaWF0IjoxNzkzMTk2NzgwLCJqdGkiOiJlZjQ2MzYxYS04N2JmLTQwYWItOWIyYi1iYzYzZDc3NmFiMjkiLCJzaWQiOiIzZjQ3NDU4Yy1lZDA3LTRjZmMtYTcxMS01NWEyYTA5YTAyY2EifQ.fMyVNJOogwRArNUOieKPhTIbAhhxbfF4wxLkNmh_Heg",
  "access_expires_at": "2026-10-28T14:28:00.74955721Z",
  "refresh_token": "ORkoLYMWxa0tb-yG8OY96-F_nEYXRAefo5_UGMOGfOY",
  "refresh_expires_at": "2026-11-27T14:13:00.749020428Z",
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
  "command_id": "50b01cee-dabf-40ca-b035-0d9641449db7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:13:01Z",
    "sequence": 1793196781270
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a57fd3d4-d5eb-4302-9ac2-f1e9e3eb9e0c",
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
  "last_heartbeat_at": "2026-10-28T14:13:01.288178Z",
  "last_location_at": "2026-10-28T14:13:01.288178Z",
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
  "session_id": "ed657adf-c0cd-46b4-b098-99d4b783e2af",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2ODEsImlhdCI6MTc5MzE5Njc4MSwianRpIjoiMWNjZTVmMjItMmViNi00NDZiLTk2ZjUtYWI1YjRiNzRkMjkxIiwic2lkIjoiZWQ2NTdhZGYtYzBjZC00NmI0LWIwOTgtOTlkNGI3ODNlMmFmIn0.KnjwAPdlaMRB7HECRUsM4D-xuweJ8nXXeljFbXG_qpU",
  "access_expires_at": "2026-10-28T14:28:01.839078451Z",
  "refresh_token": "g9r46p5fTQ2o1kvuAjrL-2cS31LNxLP4f6R4sODq5Vw",
  "refresh_expires_at": "2026-10-29T02:13:01.838582616Z",
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
  "session_id": "b0a42d4f-b027-4b8c-b050-1d4f5d471ff2",
  "subject": {
    "type": "STAFF",
    "id": "91585543-f74c-451e-a2d9-1db88b7458e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTU4NTU0My1mNzRjLTQ1MWUtYTJkOS0xZGI4OGI3NDU4ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc2ODIsImlhdCI6MTc5MzE5Njc4MiwianRpIjoiMTcyM2U1Y2EtMGNlZS00ZTliLWE2NTAtNTk3MzFlOTM4NDY3Iiwic2lkIjoiYjBhNDJkNGYtYjAyNy00YjhjLWIwNTAtMWQ0ZjVkNDcxZmYyIn0.5jWqti5WJ4XztMWLsnnkUaz5UgqrhKCOYk0wQgpUINI",
  "access_expires_at": "2026-10-28T14:28:02.38690827Z",
  "refresh_token": "4OJ5qHiSnzu6Xfh33KmmExMTIvlNYMOz-M-i3Rcgcug",
  "refresh_expires_at": "2026-10-29T02:13:02.386385782Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3` → **200**

```json
{
  "id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
  "short_number": 11,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e3024415-6c74-4aa9-91bb-df160b1f9015",
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
    "id": "58cde8c0-d3e1-4d55-b523-e2156f57766a",
    "order_id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6389ffb4-97b6-401a-be34-4d9aaa5d5685",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T14:12:58.240222Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3/interrupt` → **200**

```json
{
  "command_id": "7a033b00-6c1c-46f0-b7b5-ba79a02dc217",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
    "short_number": 11,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "e3024415-6c74-4aa9-91bb-df160b1f9015",
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
      "id": "58cde8c0-d3e1-4d55-b523-e2156f57766a",
      "order_id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "6389ffb4-97b6-401a-be34-4d9aaa5d5685",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T14:12:58.240222Z",
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
    "id": "e32e4cd6-63dc-4598-9ad3-f0927872dde7",
    "short_number": 12,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "e3024415-6c74-4aa9-91bb-df160b1f9015",
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
    "id": "0180471c-f8c2-4705-9f20-086ac0460165",
    "order_id": "e32e4cd6-63dc-4598-9ad3-f0927872dde7",
    "expires_at": "2026-10-28T14:13:17.952884Z",
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

`POST /api/driver/v1/offers/0180471c-f8c2-4705-9f20-086ac0460165/accept` → **200**

```json
{
  "command_id": "98a6e5ba-f0de-467e-bf75-6905b9dfc798"
}
```

```json
{
  "id": "639220f2-4354-412d-b3a3-9e9b0dcee471",
  "order_id": "e32e4cd6-63dc-4598-9ad3-f0927872dde7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cf49e8b9-ceb4-4415-9395-531fddcf110a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cf49e8b9-ceb4-4415-9395-531fddcf110a",
  "order_id": "e32e4cd6-63dc-4598-9ad3-f0927872dde7",
  "assignment_id": "639220f2-4354-412d-b3a3-9e9b0dcee471",
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
  "session_id": "a57fd3d4-d5eb-4302-9ac2-f1e9e3eb9e0c",
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
  "last_heartbeat_at": "2026-10-28T14:13:01.288178Z",
  "last_location_at": "2026-10-28T14:13:01.288178Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/a57fd3d4-d5eb-4302-9ac2-f1e9e3eb9e0c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:13:04Z",
    "sequence": 1793196784314
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a57fd3d4-d5eb-4302-9ac2-f1e9e3eb9e0c",
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
  "last_heartbeat_at": "2026-10-28T14:13:04.333004Z",
  "last_location_at": "2026-10-28T14:13:04.333004Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cf49e8b9-ceb4-4415-9395-531fddcf110a/arrive` → **200**

```json
{
  "command_id": "3d653aa6-774b-4298-b585-bc9e807f3e40",
  "expected_version": 0
}
```

```json
{
  "id": "cf49e8b9-ceb4-4415-9395-531fddcf110a",
  "order_id": "e32e4cd6-63dc-4598-9ad3-f0927872dde7",
  "assignment_id": "639220f2-4354-412d-b3a3-9e9b0dcee471",
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
  "arrived_at": "2026-10-28T14:13:04.598639Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cf49e8b9-ceb4-4415-9395-531fddcf110a/start` → **200**

```json
{
  "command_id": "51503296-76c6-4d82-82c4-60760da264af",
  "expected_version": 1
}
```

```json
{
  "id": "cf49e8b9-ceb4-4415-9395-531fddcf110a",
  "order_id": "e32e4cd6-63dc-4598-9ad3-f0927872dde7",
  "assignment_id": "639220f2-4354-412d-b3a3-9e9b0dcee471",
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
  "arrived_at": "2026-10-28T14:13:04.598639Z",
  "started_at": "2026-10-28T14:13:04.882761Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cf49e8b9-ceb4-4415-9395-531fddcf110a/complete` → **200**

```json
{
  "command_id": "ee0c06e0-d53e-44b0-afae-46bc5505e2a8",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:13:05Z"
}
```

```json
{
  "id": "cf49e8b9-ceb4-4415-9395-531fddcf110a",
  "order_id": "e32e4cd6-63dc-4598-9ad3-f0927872dde7",
  "assignment_id": "639220f2-4354-412d-b3a3-9e9b0dcee471",
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
  "arrived_at": "2026-10-28T14:13:04.598639Z",
  "started_at": "2026-10-28T14:13:04.882761Z",
  "completed_at": "2026-10-28T14:13:05.20828Z",
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
    "id": "e32e4cd6-63dc-4598-9ad3-f0927872dde7",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:13:02.943572Z",
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
    "id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
    "short_number": 11,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:12:58.240222Z",
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

`GET /api/operator/v1/orders/7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:12:58.240713Z",
      "actor": {
        "type": "CLIENT",
        "id": "e3024415-6c74-4aa9-91bb-df160b1f9015",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
        "quote_id": "1006645e-51a9-46b6-937f-59dd3a2019fb",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "ab3e03b6-ae75-4ba7-a39d-acc40d3f71c4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:12:58.242352Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
        "attempt_id": "8cda9f1b-e396-4515-8a9d-698dd5aaba86",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ab3e03b6-ae75-4ba7-a39d-acc40d3f71c4"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:12:58.245351Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "db6a1c3a-ce9f-4ca2-b0cd-fbedeee9cb56",
        "order_id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "ab3e03b6-ae75-4ba7-a39d-acc40d3f71c4"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:12:58.794754Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "db6a1c3a-ce9f-4ca2-b0cd-fbedeee9cb56",
        "order_id": "7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "58cde8c0-d3e1-4d55-b523-e2156f57766a"
      },
      "correlation_id": "af61a1ab-4e28-4781-a70f-d15a6f2bb1ac"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/e32e4cd6-63dc-4598-9ad3-f0927872dde7/tip` → **200**

```json
{
  "order_id": "e32e4cd6-63dc-4598-9ad3-f0927872dde7",
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
  "available_until": "2026-10-29T14:13:05.20828Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/e32e4cd6-63dc-4598-9ad3-f0927872dde7/tip` → **409**

```json
{
  "command_id": "7112be96-65bb-4411-8c12-9f4ec0c3e057",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/e32e4cd6-63dc-4598-9ad3-f0927872dde7/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0efaebde-e515-4e20-88b3-5c08ecfb2a6d"
}
```

Done: interrupted 7faf4d43-e3d7-4d59-a0c8-c7d4b45526b3, follow-up e32e4cd6-63dc-4598-9ad3-f0927872dde7.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83af30a4-f35c-436f-a8b7-46f0915fda2d",
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
  "last_heartbeat_at": "2026-10-28T14:13:00.187055Z",
  "last_location_at": "2026-10-28T14:13:00.187055Z",
  "eligible": true,
  "ineligible_reasons": []
}
```
