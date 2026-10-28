# Sandbox transcript (2026-10-28T10:08:52Z, 2fea268)

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
  "correlation_id": "b64c0d17-9cae-469e-ab09-3ae668199f91"
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
  "session_id": "c860fc28-9301-43a6-bd55-bb409b64b529",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwMzksImlhdCI6MTc5MzE4MjEzOSwianRpIjoiZWY4OGM3OWUtZjA5ZS00YTMyLTkyODctYTY4YTM3OTJjM2RkIiwic2lkIjoiYzg2MGZjMjgtOTMwMS00M2E2LWJkNTUtYmI0MDliNjRiNTI5In0.fbxu9nUntyAIDwGCTK5OnQt-RnZ1HMaJkJcVPGVFVYA",
  "access_expires_at": "2026-10-28T10:23:59.802520969Z",
  "refresh_token": "BO-53PnueHVBqCPaSgCDRbNzNHaL84x1LUQ8Rd4rf48",
  "refresh_expires_at": "2026-10-28T22:08:59.800371851Z",
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
  "session_id": "48dad033-8af9-447e-b786-8fd9013242b8",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwNDEsImlhdCI6MTc5MzE4MjE0MSwianRpIjoiYzZlYzUwMTUtNzUyNy00M2VlLWFhYmQtMzI5ZDM2M2Y0MWY0Iiwic2lkIjoiNDhkYWQwMzMtOGFmOS00NDdlLWI3ODYtOGZkOTAxMzI0MmI4In0.ERjCjXrPaPW23cAAD3NE9If985Ljh_5Q1Q206G4HnE8",
  "access_expires_at": "2026-10-28T10:24:01.089380089Z",
  "refresh_token": "RO_Kkwa7q-n3PiExjJrvrmzgk8PldbkocXmGcil_o-E",
  "refresh_expires_at": "2026-10-28T22:09:01.088456828Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "1318c6c6-84eb-49f6-8f1c-0a2b75a51d31",
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
  "id": "95599c86-1b8f-4354-9056-0180836351b7",
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
  "created_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "created_at": "2026-10-28T10:09:01.292423Z",
  "updated_at": "2026-10-28T10:09:01.292423Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636365818",
  "device_ref": "sandbox-8507"
}
```

```json
{
  "challenge_id": "0d1dc03a-7a8b-4bf4-a850-d816a1725b30",
  "expires_at": "2026-10-28T10:14:01.486290354Z",
  "resend_available_at": "2026-10-28T10:09:02.486290354Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636365818` → **200**

```json
{
  "phone": "+380636365818",
  "audience": "CLIENT",
  "code": "878562",
  "sent_at": "2026-10-28T10:09:01.493200561Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d1dc03a-7a8b-4bf4-a850-d816a1725b30",
  "code": "878562",
  "device_ref": "sandbox-8507"
}
```

```json
{
  "session_id": "194d340d-4cab-4504-a913-c515b8a729ca",
  "subject": {
    "type": "CLIENT",
    "id": "f01998d9-490c-456d-97c9-ba7eff44d00b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMDE5OThkOS00OTBjLTQ1NmQtOTdjOS1iYTdlZmY0NGQwMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMDQxLCJpYXQiOjE3OTMxODIxNDEsImp0aSI6IjkwZjk5ZWYxLTYzOGEtNGZiNi04ZGQyLWMyN2E3NmE3ODQ5YiIsInNpZCI6IjE5NGQzNDBkLTRjYWItNDUwNC1hOTEzLWM1MTViOGE3MjljYSJ9.VhdJ1g4SuCAjSlcjp77keJQdSXRk2b1UhCqHjt4L4uw",
  "access_expires_at": "2026-10-28T10:24:01.694409362Z",
  "refresh_token": "Z7XNN8LaPQkH749Xbzttbp2BvkRzrB8BhSkkg9RDMP8",
  "refresh_expires_at": "2026-11-27T10:09:01.693310548Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636365818` → **200**

```json
{
  "client_id": "f01998d9-490c-456d-97c9-ba7eff44d00b"
}
```

`POST /api/admin/v1/rider-wallets/f01998d9-490c-456d-97c9-ba7eff44d00b/top-ups` → **201**

```json
{
  "command_id": "a984167f-8e1b-4e27-80e2-0ffe79de8511",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "f01998d9-490c-456d-97c9-ba7eff44d00b",
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
      "id": "4da58b63-58c3-4f46-8f9a-68e6ca1f1e52",
      "at": "2026-10-28T10:09:02.041967Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "24800f23-f68e-491f-b2a4-b458048fd941",
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
  "id": "691d8bac-4bd2-49f7-964a-4cbb83393f4b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:14:02.351954Z",
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
      "id": "95599c86-1b8f-4354-9056-0180836351b7",
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
  "device_ref": "sandbox-21169"
}
```

```json
{
  "challenge_id": "7bf9be63-598b-4263-a200-32e3100c2767",
  "expires_at": "2026-10-28T10:14:02.552524769Z",
  "resend_available_at": "2026-10-28T10:09:03.552524769Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "847215",
  "sent_at": "2026-10-28T10:09:02.555328684Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bf9be63-598b-4263-a200-32e3100c2767",
  "code": "847215",
  "device_ref": "sandbox-21169"
}
```

```json
{
  "session_id": "ad24cd07-48f9-44e9-ad2b-75a7f6fb4fb2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzA0MiwiaWF0IjoxNzkzMTgyMTQyLCJqdGkiOiJlZWQ1YWI5MC03ZGMxLTRiNDctOTNjZC01NWJlYmFkZmUzYzEiLCJzaWQiOiJhZDI0Y2QwNy00OGY5LTQ0ZTktYWQyYi03NWE3ZjZmYjRmYjIifQ.IJwyP1OFfrBCbBFMF_--puZjeikRgeNzOVE_7s9Bvio",
  "access_expires_at": "2026-10-28T10:24:02.761220968Z",
  "refresh_token": "3KYyPZ8ABm6cqu3y1kYhx8CxU24CiMvxwct2xd0puqM",
  "refresh_expires_at": "2026-11-27T10:09:02.759727485Z",
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
  "command_id": "cd49bb6d-80f1-4548-848f-b9c782864da3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:09:03Z",
    "sequence": 1793182143105
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "86d986bd-f105-4acb-a114-8414612e54fa",
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
  "last_heartbeat_at": "2026-10-28T10:09:03.142608Z",
  "last_location_at": "2026-10-28T10:09:03.142608Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "94e2fcce-4815-412e-8aec-253eb5d36143",
  "quote_id": "691d8bac-4bd2-49f7-964a-4cbb83393f4b",
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
  "id": "db6fc136-4a2f-4a3d-bfdb-123203b3202f",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f01998d9-490c-456d-97c9-ba7eff44d00b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:09:03.379942Z",
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
  "client_id": "f01998d9-490c-456d-97c9-ba7eff44d00b",
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
      "id": "4da58b63-58c3-4f46-8f9a-68e6ca1f1e52",
      "at": "2026-10-28T10:09:02.041967Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
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
    "id": "7dcfc76a-b6a7-48b8-b84c-cf4d01ac41ab",
    "order_id": "db6fc136-4a2f-4a3d-bfdb-123203b3202f",
    "expires_at": "2026-10-28T10:09:18.39126Z",
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

`POST /api/driver/v1/offers/7dcfc76a-b6a7-48b8-b84c-cf4d01ac41ab/accept` → **200**

```json
{
  "command_id": "a9862686-5af5-4ee4-8d99-8fb7e2a51068"
}
```

```json
{
  "id": "ab746c37-0f58-4a61-acb4-109725eacc97",
  "order_id": "db6fc136-4a2f-4a3d-bfdb-123203b3202f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "747478e6-09f9-43b5-a194-fa5a8311e361",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "747478e6-09f9-43b5-a194-fa5a8311e361",
  "order_id": "db6fc136-4a2f-4a3d-bfdb-123203b3202f",
  "assignment_id": "ab746c37-0f58-4a61-acb4-109725eacc97",
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

`POST /api/driver/v1/work-sessions/86d986bd-f105-4acb-a114-8414612e54fa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:09:04Z",
    "sequence": 1793182144261
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "86d986bd-f105-4acb-a114-8414612e54fa",
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
  "last_heartbeat_at": "2026-10-28T10:09:04.27892Z",
  "last_location_at": "2026-10-28T10:09:04.27892Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/747478e6-09f9-43b5-a194-fa5a8311e361/arrive` → **200**

```json
{
  "command_id": "46b288fb-546d-47c4-af23-b22bcf362b48",
  "expected_version": 0
}
```

```json
{
  "id": "747478e6-09f9-43b5-a194-fa5a8311e361",
  "order_id": "db6fc136-4a2f-4a3d-bfdb-123203b3202f",
  "assignment_id": "ab746c37-0f58-4a61-acb4-109725eacc97",
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
  "arrived_at": "2026-10-28T10:09:04.463685Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/747478e6-09f9-43b5-a194-fa5a8311e361/start` → **200**

```json
{
  "command_id": "30cb6d1c-4f03-43f1-92c3-2a0e78c00395",
  "expected_version": 1
}
```

```json
{
  "id": "747478e6-09f9-43b5-a194-fa5a8311e361",
  "order_id": "db6fc136-4a2f-4a3d-bfdb-123203b3202f",
  "assignment_id": "ab746c37-0f58-4a61-acb4-109725eacc97",
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
  "arrived_at": "2026-10-28T10:09:04.463685Z",
  "started_at": "2026-10-28T10:09:04.648541Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/747478e6-09f9-43b5-a194-fa5a8311e361/complete` → **200**

```json
{
  "command_id": "8275c557-74fd-449e-b4c3-b6b6eea298bb",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:09:04Z",
  "cash_received": true
}
```

```json
{
  "id": "747478e6-09f9-43b5-a194-fa5a8311e361",
  "order_id": "db6fc136-4a2f-4a3d-bfdb-123203b3202f",
  "assignment_id": "ab746c37-0f58-4a61-acb4-109725eacc97",
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
  "arrived_at": "2026-10-28T10:09:04.463685Z",
  "started_at": "2026-10-28T10:09:04.648541Z",
  "completed_at": "2026-10-28T10:09:04.851983Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f01998d9-490c-456d-97c9-ba7eff44d00b",
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
      "id": "6cc12cde-be0f-43af-8fe5-2b3521e0c2d0",
      "at": "2026-10-28T10:09:05.087832Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "db6fc136-4a2f-4a3d-bfdb-123203b3202f"
    },
    {
      "id": "4da58b63-58c3-4f46-8f9a-68e6ca1f1e52",
      "at": "2026-10-28T10:09:02.041967Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/95599c86-1b8f-4354-9056-0180836351b7/archive` → **200**

```json
{
  "command_id": "385e8127-79d2-4934-86f9-8b1206f1f66f",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "95599c86-1b8f-4354-9056-0180836351b7",
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
  "created_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "created_at": "2026-10-28T10:09:01.292423Z",
  "updated_at": "2026-10-28T10:09:08.230877Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "86d986bd-f105-4acb-a114-8414612e54fa",
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
  "last_heartbeat_at": "2026-10-28T10:09:04.27892Z",
  "last_location_at": "2026-10-28T10:09:04.27892Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/86d986bd-f105-4acb-a114-8414612e54fa/close` → **200**

```json
{
  "command_id": "15f540d6-409d-4681-8ea0-73fe52fb72ee",
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

Done: order db6fc136-4a2f-4a3d-bfdb-123203b3202f.

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
  "session_id": "1068f6a8-f1e1-4f7d-afc7-2fdae2fe8c91",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwNDksImlhdCI6MTc5MzE4MjE0OSwianRpIjoiMWM5NzM4ZGQtNGU0Yi00YzhjLTgxOTQtYzUwNWQwY2I2NmU0Iiwic2lkIjoiMTA2OGY2YTgtZjFlMS00ZjdkLWFmYzctMmZkYWUyZmU4YzkxIn0.1QX8rEH8VJnTJgGMIrF3STUtojIj51pPhIUdwvzSf7E",
  "access_expires_at": "2026-10-28T10:24:09.017762729Z",
  "refresh_token": "vRkJM4Svnbo2mkhKqE9I_ok1kGTFWPdVLw5mCQGoDSE",
  "refresh_expires_at": "2026-10-28T22:09:09.01688582Z",
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
  "command_id": "87651f74-33ac-4f7a-b27b-0a311ecbf12d",
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
  "session_id": "4c3576c9-855e-4f35-b073-8bb189c70f72",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwNDksImlhdCI6MTc5MzE4MjE0OSwianRpIjoiM2UwMzFlMWQtYTRjNS00YjExLWFlZmEtZWFmY2FjYjk2Mzg3Iiwic2lkIjoiNGMzNTc2YzktODU1ZS00ZjM1LWIwNzMtOGJiMTg5YzcwZjcyIn0.mDcDWLwxKEKp8P8wQ5F3YgnvQrweTeGtSK0NeXxm3ug",
  "access_expires_at": "2026-10-28T10:24:09.781268476Z",
  "refresh_token": "33G1hk0fkVxcpPxXfc-DeM0cGk5WT3F2UsvFwzJ3l6A",
  "refresh_expires_at": "2026-10-28T22:09:09.780408353Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.184999517",
    "linkedid": "1730052700.184999517",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675756215"
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
    "id": "1730052700.184999517",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "d15e216f-6a8f-4407-af9e-69454986b8de",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675756215",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:09:09.943117Z",
      "answered_at": null,
      "ended_at": "2026-10-28T10:09:09.961086Z",
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
    "id": "1730052600.2592910715",
    "linkedid": "1730052600.2592910715",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675756215"
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
      "id": "063bc915-9c8b-4fd8-b18f-db7d0734d62f",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675756215",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:09:10.159576Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/063bc915-9c8b-4fd8-b18f-db7d0734d62f/answer` → **200**

```json
{
  "command_id": "8db54ef0-cca5-436a-aaca-2a80881bf87d"
}
```

```json
{
  "id": "063bc915-9c8b-4fd8-b18f-db7d0734d62f",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675756215",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "order_ids": [],
  "started_at": "2026-10-28T10:09:10.159576Z",
  "answered_at": "2026-10-28T10:09:10.359488Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2592910715",
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
    "id": "1730052600.2592910715",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "063bc915-9c8b-4fd8-b18f-db7d0734d62f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675756215",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "order_ids": [],
      "started_at": "2026-10-28T10:09:10.159576Z",
      "answered_at": "2026-10-28T10:09:10.359488Z",
      "ended_at": "2026-10-28T10:09:10.546011Z",
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
      "id": "063bc915-9c8b-4fd8-b18f-db7d0734d62f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675756215",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "order_ids": [],
      "started_at": "2026-10-28T10:09:10.159576Z",
      "answered_at": "2026-10-28T10:09:10.359488Z",
      "ended_at": "2026-10-28T10:09:10.546011Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:09:10.926104Z"
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
      "id": "063bc915-9c8b-4fd8-b18f-db7d0734d62f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675756215",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "order_ids": [],
      "started_at": "2026-10-28T10:09:10.159576Z",
      "answered_at": "2026-10-28T10:09:10.359488Z",
      "ended_at": "2026-10-28T10:09:10.546011Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:09:10.926104Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/063bc915-9c8b-4fd8-b18f-db7d0734d62f/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/063bc915-9c8b-4fd8-b18f-db7d0734d62f/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=063bc915-9c8b-4fd8-b18f-db7d0734d62f` → **200**

```json
{
  "changes": [
    {
      "id": "7eee9053-f88d-43bb-bd3c-ec8686cb0de3",
      "occurred_at": "2026-10-28T10:09:13.248037Z",
      "actor_type": "STAFF",
      "actor_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "063bc915-9c8b-4fd8-b18f-db7d0734d62f",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1ffde06b-abdf-4422-84eb-43719ec2b9b7\", \"order_ids\": []}",
      "correlation_id": "afd09bde-214a-419b-a217-4e66ba4cae43"
    },
    {
      "id": "622e9ec6-6085-466e-9d58-af111401a974",
      "occurred_at": "2026-10-28T10:09:13.223071Z",
      "actor_type": "STAFF",
      "actor_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "063bc915-9c8b-4fd8-b18f-db7d0734d62f",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1ffde06b-abdf-4422-84eb-43719ec2b9b7\", \"order_ids\": []}",
      "correlation_id": "a376bc9e-f18d-413e-99f5-e09ef55d2a4b"
    }
  ]
}
```

Done: call 063bc915-9c8b-4fd8-b18f-db7d0734d62f recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635835925",
  "device_ref": "sandbox-18818"
}
```

```json
{
  "challenge_id": "bc731356-b66e-492b-b0bd-800c2d6f8cc3",
  "expires_at": "2026-10-28T10:14:13.443443855Z",
  "resend_available_at": "2026-10-28T10:09:14.443443855Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635835925` → **200**

```json
{
  "phone": "+380635835925",
  "audience": "CLIENT",
  "code": "768307",
  "sent_at": "2026-10-28T10:09:13.445948193Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc731356-b66e-492b-b0bd-800c2d6f8cc3",
  "code": "768307",
  "device_ref": "sandbox-18818"
}
```

```json
{
  "session_id": "c680944e-d6b5-4047-9fb1-917533baa7e5",
  "subject": {
    "type": "CLIENT",
    "id": "cdaf7937-f2dc-44d0-8653-6974f477d9fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZGFmNzkzNy1mMmRjLTQ0ZDAtODY1My02OTc0ZjQ3N2Q5ZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMDUzLCJpYXQiOjE3OTMxODIxNTMsImp0aSI6Ijc0YzFhMDg3LWJjMzAtNDQ0Ni04MDJmLTU0ZGZlNmJjNDMxYyIsInNpZCI6ImM2ODA5NDRlLWQ2YjUtNDA0Ny05ZmIxLTkxNzUzM2JhYTdlNSJ9.KRZDNY1QExIU2pBD2jB3Vcda1HDZcRWoywwrA6RSEm8",
  "access_expires_at": "2026-10-28T10:24:13.637806205Z",
  "refresh_token": "wD_neHHBaieH_ReowD76722GsMRK07S0OSdzgl6tBdo",
  "refresh_expires_at": "2026-11-27T10:09:13.63721832Z",
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
        "en": "Changed my mind",
        "uk": "Передумав їхати",
        "pl": "Zmiana planów",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "en": "Wrong address",
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "en": "Found other transport",
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
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
  "device_ref": "sandbox-16105"
}
```

```json
{
  "challenge_id": "8b9d0c5c-e2a2-4089-9dd8-3e6aaf454bf8",
  "expires_at": "2026-10-28T10:14:13.968791967Z",
  "resend_available_at": "2026-10-28T10:09:14.968791967Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "537236",
  "sent_at": "2026-10-28T10:09:13.971701395Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b9d0c5c-e2a2-4089-9dd8-3e6aaf454bf8",
  "code": "537236",
  "device_ref": "sandbox-16105"
}
```

```json
{
  "session_id": "8fcfaa9e-7a9c-4d7e-9906-17d0f1f016fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzA1NCwiaWF0IjoxNzkzMTgyMTU0LCJqdGkiOiJmYzAxOGEwMC04ODA0LTQ4ZDQtOTgxNy01MjI5YmM4MDY4NDIiLCJzaWQiOiI4ZmNmYWE5ZS03YTljLTRkN2UtOTkwNi0xN2QwZjFmMDE2ZmUifQ.ViNnJgnuGbOJdsBObm7_nYA6PNgOfHwhGZsgWSeKMzc",
  "access_expires_at": "2026-10-28T10:24:14.150613977Z",
  "refresh_token": "PJPgG8jRHEyBXT6hs6Z3IXCLIo4tlNl7QqCt3SOlJ2c",
  "refresh_expires_at": "2026-11-27T10:09:14.150136889Z",
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
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "en": "Cannot reach the pickup",
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
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
  "session_id": "f7b97a0f-4638-4f11-a048-ad6c5fd639b6",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwNTQsImlhdCI6MTc5MzE4MjE1NCwianRpIjoiMjFhZmFiMzYtNGY4MS00OTU0LWJlMWItZjg2YzAzNjhjZTcyIiwic2lkIjoiZjdiOTdhMGYtNDYzOC00ZjExLWEwNDgtYWQ2YzVmZDYzOWI2In0.B5IDipgmaRwucj_0ufER-xyOAJiel8Svzar1-gNYKBQ",
  "access_expires_at": "2026-10-28T10:24:14.737497632Z",
  "refresh_token": "0V8q56_InpQafob06PI-95e51sRw9gNlTTd6q4pq9V8",
  "refresh_expires_at": "2026-10-28T22:09:14.736836301Z",
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
  "session_id": "9334bb05-8a42-4e11-b83d-f0ba12af22d0",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwNTUsImlhdCI6MTc5MzE4MjE1NSwianRpIjoiYTA1Yzg4YjYtNDhhYi00NWFhLWIwNzctZTdhYzUwNWM1NTI2Iiwic2lkIjoiOTMzNGJiMDUtOGE0Mi00ZTExLWI4M2QtZjBiYTEyYWYyMmQwIn0.OuPrvWWt90DTbUjODmrqAENgkaPsangF8d9nKGosG78",
  "access_expires_at": "2026-10-28T10:24:15.171231854Z",
  "refresh_token": "d828lpCDB2srbyhAwFKfFDS6T51cw8Lk19JUvzPQ-UU",
  "refresh_expires_at": "2026-10-28T22:09:15.170577096Z",
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
        "en": "Passenger asked",
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "en": "Duplicate order",
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "en": "No cars available",
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "en": "Test order",
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "uk": "ДТП",
        "pl": "Wypadek",
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
  "command_id": "1768854b-0be6-44bf-b7bd-266cc5f0e6c8",
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
  "id": "72765438-d1ea-4cdb-a01e-d7f31d8a82f6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:14:15.523382Z",
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
  "command_id": "1e3a70f3-6d03-438e-8f40-325ee3b361be",
  "quote_id": "72765438-d1ea-4cdb-a01e-d7f31d8a82f6",
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
  "id": "c5a7a434-58f8-4f2b-94f2-a24c9885af94",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cdaf7937-f2dc-44d0-8653-6974f477d9fe",
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
  "created_at": "2026-10-28T10:09:15.707503Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c5a7a434-58f8-4f2b-94f2-a24c9885af94` → **200**

```json
{
  "id": "c5a7a434-58f8-4f2b-94f2-a24c9885af94",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cdaf7937-f2dc-44d0-8653-6974f477d9fe",
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
  "created_at": "2026-10-28T10:09:15.707503Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/c5a7a434-58f8-4f2b-94f2-a24c9885af94/cancel` → **200**

```json
{
  "command_id": "12f2d4a0-0fe9-45ec-b4d1-4bd8856f6d4d",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "c5a7a434-58f8-4f2b-94f2-a24c9885af94",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cdaf7937-f2dc-44d0-8653-6974f477d9fe",
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
  "created_at": "2026-10-28T10:09:15.707503Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "en": "The wait is too long",
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
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
  "command_id": "2dea3e65-baca-4f01-8e01-22c3f1a6604c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:09:16Z",
    "sequence": 1793182156417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c812ed73-562e-4e15-96fa-2cd534580464",
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
  "last_heartbeat_at": "2026-10-28T10:09:16.43126Z",
  "last_location_at": "2026-10-28T10:09:16.43126Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10889"
}
```

```json
{
  "challenge_id": "ca817f1f-f9f7-496d-94bf-7fd41d9bf5a3",
  "expires_at": "2026-10-28T10:14:16.600264909Z",
  "resend_available_at": "2026-10-28T10:09:17.600264909Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "129105",
  "sent_at": "2026-10-28T10:09:16.602838249Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca817f1f-f9f7-496d-94bf-7fd41d9bf5a3",
  "code": "129105",
  "device_ref": "sandbox-10889"
}
```

```json
{
  "session_id": "bc37fe3a-4d85-4cc8-bc55-816ad51ac2f8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzA1NiwiaWF0IjoxNzkzMTgyMTU2LCJqdGkiOiIzYTRlMTg0Zi0wMWE4LTQ2OTQtYTg2ZC04YjZjNTlhNWE5NDgiLCJzaWQiOiJiYzM3ZmUzYS00ZDg1LTRjYzgtYmM1NS04MTZhZDUxYWMyZjgifQ.a_8aa-o4dl4AXFP9kh_pfvnXbLQNE_UeauwfDyTqjuc",
  "access_expires_at": "2026-10-28T10:24:16.788985943Z",
  "refresh_token": "aPnHNqzGUmXA-Llym-IDvG1TSJC7areZpGFVEnrdEaw",
  "refresh_expires_at": "2026-11-27T10:09:16.788412503Z",
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
  "command_id": "072f20a9-92a2-4ea4-a3ea-054a55123daa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:09:17Z",
    "sequence": 1793182157114
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5b2d415f-8b8e-4857-9305-d7955b9efecb",
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
  "last_heartbeat_at": "2026-10-28T10:09:17.127941Z",
  "last_location_at": "2026-10-28T10:09:17.127941Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bd48494b-6f3f-43a6-a985-c1c9468add4f",
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
  "id": "261a54f6-29ce-43c5-abd1-d69e2d834682",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:14:17.310395Z",
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
  "command_id": "3b4a901e-7713-408f-a726-da1bc8aa63f8",
  "quote_id": "261a54f6-29ce-43c5-abd1-d69e2d834682",
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
  "id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cdaf7937-f2dc-44d0-8653-6974f477d9fe",
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
  "created_at": "2026-10-28T10:09:17.488928Z",
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
    "id": "cf865d65-a970-4f3b-9b4e-b618e9749029",
    "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
    "expires_at": "2026-10-28T10:09:32.49357Z",
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

`POST /api/driver/v1/offers/cf865d65-a970-4f3b-9b4e-b618e9749029/accept` → **200**

```json
{
  "command_id": "5b52ddc4-0fc7-4ad3-88e9-9b6b532d79dd"
}
```

```json
{
  "id": "7f1c9250-a3ef-48f9-bcd0-ee6080097a84",
  "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "87559e50-295f-4611-a569-d284e333e814",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "87559e50-295f-4611-a569-d284e333e814",
  "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
  "assignment_id": "7f1c9250-a3ef-48f9-bcd0-ee6080097a84",
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

`POST /api/driver/v1/trips/87559e50-295f-4611-a569-d284e333e814/cancel` → **200**

```json
{
  "command_id": "adaed375-3147-4dea-b1e4-5f12c9d241a3",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "87559e50-295f-4611-a569-d284e333e814",
  "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
  "assignment_id": "7f1c9250-a3ef-48f9-bcd0-ee6080097a84",
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

`GET /api/rider/v1/orders/d2a9554d-5316-4f70-8f5b-6326669e47cf` → **200**

```json
{
  "id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "cdaf7937-f2dc-44d0-8653-6974f477d9fe",
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
    "id": "7f1c9250-a3ef-48f9-bcd0-ee6080097a84",
    "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "87559e50-295f-4611-a569-d284e333e814",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:09:17.488928Z",
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
    "id": "d8616887-7485-4dc2-89d3-9a74731add75",
    "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
    "expires_at": "2026-10-28T10:09:33.194916Z",
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

`POST /api/driver/v1/offers/d8616887-7485-4dc2-89d3-9a74731add75/accept` → **200**

```json
{
  "command_id": "bec12474-5d12-4b19-b6f7-7d93511ab52e"
}
```

```json
{
  "id": "2298ca3a-a128-44b3-87b7-753690dafb18",
  "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1dd15701-41a7-440e-a4a5-e94a8f4e1194",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1dd15701-41a7-440e-a4a5-e94a8f4e1194",
  "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
  "assignment_id": "2298ca3a-a128-44b3-87b7-753690dafb18",
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

`POST /api/driver/v1/trips/1dd15701-41a7-440e-a4a5-e94a8f4e1194/cancel` → **200**

```json
{
  "command_id": "ae358d73-ba91-4495-860e-fc3cd2e59802",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1dd15701-41a7-440e-a4a5-e94a8f4e1194",
  "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
  "assignment_id": "2298ca3a-a128-44b3-87b7-753690dafb18",
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
    "id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:09:17.488928Z",
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
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      }
    },
    "pickup_at": null
  },
  {
    "id": "c5a7a434-58f8-4f2b-94f2-a24c9885af94",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:09:15.707503Z",
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
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/d2a9554d-5316-4f70-8f5b-6326669e47cf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:09:17.489691Z",
      "actor": {
        "type": "CLIENT",
        "id": "cdaf7937-f2dc-44d0-8653-6974f477d9fe",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
        "quote_id": "261a54f6-29ce-43c5-abd1-d69e2d834682",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "cd3179b5-a9a0-4d6c-b595-831f0cb5d55e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:09:17.492452Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
        "attempt_id": "a93a68d4-bddd-4598-ad3e-7749094bce7e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cd3179b5-a9a0-4d6c-b595-831f0cb5d55e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:09:17.499145Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cf865d65-a970-4f3b-9b4e-b618e9749029",
        "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "cd3179b5-a9a0-4d6c-b595-831f0cb5d55e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:09:17.841071Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cf865d65-a970-4f3b-9b4e-b618e9749029",
        "order_id": "d2a9554d-5316-4f70-8f5b-6326669e47cf",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "7f1c9250-a3ef-48f9-bcd0-ee6080097a84"
      },
      "correlation_id": "7ac63c51-9b5b-4ff9-b9ad-99b21cbd78c9"
```

Done: orders c5a7a434-58f8-4f2b-94f2-a24c9885af94, d2a9554d-5316-4f70-8f5b-6326669e47cf.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730021102",
  "device_ref": "sandbox-2783"
}
```

```json
{
  "challenge_id": "58631331-1f6d-4179-8f55-1130570d55d1",
  "expires_at": "2026-10-28T10:14:19.585288803Z",
  "resend_available_at": "2026-10-28T10:09:20.585288803Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730021102` → **200**

```json
{
  "phone": "+380730021102",
  "audience": "CLIENT",
  "code": "211945",
  "sent_at": "2026-10-28T10:09:19.58754701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58631331-1f6d-4179-8f55-1130570d55d1",
  "code": "211945",
  "device_ref": "sandbox-2783"
}
```

```json
{
  "session_id": "e09ff782-88fb-4f9c-9aa2-c8ef673da951",
  "subject": {
    "type": "CLIENT",
    "id": "01f3ac4f-d771-4259-95e5-3680aae04ed0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMWYzYWM0Zi1kNzcxLTQyNTktOTVlNS0zNjgwYWFlMDRlZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMDU5LCJpYXQiOjE3OTMxODIxNTksImp0aSI6IjUyZTExN2M0LWY2YTQtNDM1Ni1iY2QzLTFmMmFhMDhhNmIyOCIsInNpZCI6ImUwOWZmNzgyLTg4ZmItNGY5Yy05YWEyLWM4ZWY2NzNkYTk1MSJ9.M5EhlA2dpP5UCMpEfCM7XBYCwd2Csfya9BtKfRyeowc",
  "access_expires_at": "2026-10-28T10:24:19.773557183Z",
  "refresh_token": "AH3DMxSUCMFi34nfADZk-0_jWP50YkiAKNuNqMLDzGQ",
  "refresh_expires_at": "2026-11-27T10:09:19.772922375Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "5a80543d-74bd-475d-a20c-ed47e9ef7e64",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "5b0708ec-dc98-4027-94ab-d2d6b3ba7cd4",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-5b0708ec-dc98-4027-94ab-d2d6b3ba7cd4",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4ffba7dfa3818ad9688de79f221c09f0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=5b0708ec-dc98-4027-94ab-d2d6b3ba7cd4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730021102"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=5b0708ec-dc98-4027-94ab-d2d6b3ba7cd4",
  "expires_at": "2026-10-28T10:39:19.940258Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/5b0708ec-dc98-4027-94ab-d2d6b3ba7cd4` → **200**

```json
{
  "id": "5b0708ec-dc98-4027-94ab-d2d6b3ba7cd4",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T10:39:19.940258Z",
  "card": {
    "id": "e0a3dfcb-8697-4f91-a958-4fd77f5258e2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0794",
    "card_type": "Visa",
    "created_at": "2026-10-28T10:09:20.12427Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "e0a3dfcb-8697-4f91-a958-4fd77f5258e2",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0794",
      "card_type": "Visa",
      "created_at": "2026-10-28T10:09:20.12427Z"
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
  "device_ref": "sandbox-10960"
}
```

```json
{
  "challenge_id": "4e9e04c4-b94a-454e-9381-a66a2976e3a5",
  "expires_at": "2026-10-28T10:14:20.474610516Z",
  "resend_available_at": "2026-10-28T10:09:21.474610516Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "229243",
  "sent_at": "2026-10-28T10:09:20.476668929Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e9e04c4-b94a-454e-9381-a66a2976e3a5",
  "code": "229243",
  "device_ref": "sandbox-10960"
}
```

```json
{
  "session_id": "b618e1d3-cbe5-440e-be71-7af433bfc140",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzA2MCwiaWF0IjoxNzkzMTgyMTYwLCJqdGkiOiIxOTYxOTQ4YS1mZDJkLTQzYTktODlkNC02ZGFkOTdhODFmZDAiLCJzaWQiOiJiNjE4ZTFkMy1jYmU1LTQ0MGUtYmU3MS03YWY0MzNiZmMxNDAifQ.JSbk4iwCiB3oDj3s8YUipPk5KiO4mU1K8uQdTs7PIbI",
  "access_expires_at": "2026-10-28T10:24:20.660558018Z",
  "refresh_token": "2aK_VRyZLqRx0FihREBnvYxv4AU4Mf4ygDMAZrqwQ34",
  "refresh_expires_at": "2026-11-27T10:09:20.659904749Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5b2d415f-8b8e-4857-9305-d7955b9efecb",
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
  "last_heartbeat_at": "2026-10-28T10:09:17.127941Z",
  "last_location_at": "2026-10-28T10:09:17.127941Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b2d415f-8b8e-4857-9305-d7955b9efecb/handover` → **200**

```json
{
  "command_id": "751154d2-5fb1-4518-bbf7-438f34c9f33f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5b2d415f-8b8e-4857-9305-d7955b9efecb",
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
  "last_heartbeat_at": "2026-10-28T10:09:17.127941Z",
  "last_location_at": "2026-10-28T10:09:17.127941Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b2d415f-8b8e-4857-9305-d7955b9efecb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:09:21Z",
    "sequence": 1793182161169
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5b2d415f-8b8e-4857-9305-d7955b9efecb",
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
  "last_heartbeat_at": "2026-10-28T10:09:21.183767Z",
  "last_location_at": "2026-10-28T10:09:21.183767Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8e2d19d0-de0a-4d3b-a1a8-a3b8ffd318e2",
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
  "id": "d425f2b7-86c9-4485-8070-2b96acea2ebe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:14:21.359405Z",
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
  "command_id": "e78cc084-a21c-4af6-9456-6e1a3d2845b2",
  "quote_id": "d425f2b7-86c9-4485-8070-2b96acea2ebe",
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
  "id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "01f3ac4f-d771-4259-95e5-3680aae04ed0",
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
  "created_at": "2026-10-28T10:09:21.536614Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/688153c1-6b45-41c2-ae36-f384618c9c1e` → **200**

```json
{
  "id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "01f3ac4f-d771-4259-95e5-3680aae04ed0",
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
  "created_at": "2026-10-28T10:09:21.536614Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/688153c1-6b45-41c2-ae36-f384618c9c1e` → **200**

```json
{
  "id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "01f3ac4f-d771-4259-95e5-3680aae04ed0",
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
  "created_at": "2026-10-28T10:09:21.536614Z",
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
    "id": "43f422de-493c-4d99-9479-0e0f70d0ddb7",
    "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
    "expires_at": "2026-10-28T10:09:37.210346Z",
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

`POST /api/driver/v1/offers/43f422de-493c-4d99-9479-0e0f70d0ddb7/accept` → **200**

```json
{
  "command_id": "3a956344-fd7e-4c77-8c8b-82ae52076689"
}
```

```json
{
  "id": "685f17c8-056b-4479-b666-47f9a00bb43f",
  "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "084bcdf6-cd6d-4065-8e4c-22bba0748030",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "084bcdf6-cd6d-4065-8e4c-22bba0748030",
  "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
  "assignment_id": "685f17c8-056b-4479-b666-47f9a00bb43f",
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

`POST /api/driver/v1/work-sessions/5b2d415f-8b8e-4857-9305-d7955b9efecb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:09:23Z",
    "sequence": 1793182163567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5b2d415f-8b8e-4857-9305-d7955b9efecb",
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
  "last_heartbeat_at": "2026-10-28T10:09:23.58181Z",
  "last_location_at": "2026-10-28T10:09:23.58181Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/084bcdf6-cd6d-4065-8e4c-22bba0748030/arrive` → **200**

```json
{
  "command_id": "0c70ca8c-070f-4a4f-bce1-1986a9f9a17a",
  "expected_version": 0
}
```

```json
{
  "id": "084bcdf6-cd6d-4065-8e4c-22bba0748030",
  "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
  "assignment_id": "685f17c8-056b-4479-b666-47f9a00bb43f",
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
  "arrived_at": "2026-10-28T10:09:23.754372Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/084bcdf6-cd6d-4065-8e4c-22bba0748030/start` → **200**

```json
{
  "command_id": "5ea66ff7-060f-448c-ad3a-d86325630608",
  "expected_version": 1
}
```

```json
{
  "id": "084bcdf6-cd6d-4065-8e4c-22bba0748030",
  "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
  "assignment_id": "685f17c8-056b-4479-b666-47f9a00bb43f",
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
  "arrived_at": "2026-10-28T10:09:23.754372Z",
  "started_at": "2026-10-28T10:09:23.932306Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/084bcdf6-cd6d-4065-8e4c-22bba0748030/complete` → **200**

```json
{
  "command_id": "3f62248f-f113-41b9-99a4-a31c09c5062e",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:09:24Z"
}
```

```json
{
  "id": "084bcdf6-cd6d-4065-8e4c-22bba0748030",
  "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
  "assignment_id": "685f17c8-056b-4479-b666-47f9a00bb43f",
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
  "arrived_at": "2026-10-28T10:09:23.754372Z",
  "started_at": "2026-10-28T10:09:23.932306Z",
  "completed_at": "2026-10-28T10:09:24.109284Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/688153c1-6b45-41c2-ae36-f384618c9c1e` → **200**

```json
{
  "id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "01f3ac4f-d771-4259-95e5-3680aae04ed0",
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
    "id": "685f17c8-056b-4479-b666-47f9a00bb43f",
    "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "084bcdf6-cd6d-4065-8e4c-22bba0748030",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:09:21.536614Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/688153c1-6b45-41c2-ae36-f384618c9c1e` → **200**

```json
{
  "id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "01f3ac4f-d771-4259-95e5-3680aae04ed0",
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
    "id": "685f17c8-056b-4479-b666-47f9a00bb43f",
    "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "084bcdf6-cd6d-4065-8e4c-22bba0748030",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:09:21.536614Z",
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
      "id": "8856fa35-81c1-4fbe-a97e-ba420e48ffcb",
      "at": "2026-10-28T10:09:24.247883Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/688153c1-6b45-41c2-ae36-f384618c9c1e/tip` → **200**

```json
{
  "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
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
  "available_until": "2026-10-29T10:09:24.109284Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/688153c1-6b45-41c2-ae36-f384618c9c1e/tip` → **201**

```json
{
  "command_id": "da478d74-7e2c-419b-8d23-241caa4ea579",
  "amount_minor": 2500
}
```

```json
{
  "id": "af5605b7-0a3b-428c-88cf-b938122a2d7b",
  "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T10:09:26.133825Z"
}
```

`GET /api/rider/v1/orders/688153c1-6b45-41c2-ae36-f384618c9c1e/tip` → **200**

```json
{
  "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
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
  "available_until": "2026-10-29T10:09:24.109284Z",
  "open": false,
  "tip": {
    "id": "af5605b7-0a3b-428c-88cf-b938122a2d7b",
    "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T10:09:26.133825Z"
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
      "id": "8856fa35-81c1-4fbe-a97e-ba420e48ffcb",
      "at": "2026-10-28T10:09:24.247883Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
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
      "id": "9321a1f1-9612-4016-bc35-d5fcab8133f3",
      "at": "2026-10-28T10:09:27.311733Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
      "counterpart_id": null
    },
    {
      "id": "8856fa35-81c1-4fbe-a97e-ba420e48ffcb",
      "at": "2026-10-28T10:09:24.247883Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "688153c1-6b45-41c2-ae36-f384618c9c1e",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5b2d415f-8b8e-4857-9305-d7955b9efecb",
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
  "last_heartbeat_at": "2026-10-28T10:09:23.58181Z",
  "last_location_at": "2026-10-28T10:09:23.58181Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b2d415f-8b8e-4857-9305-d7955b9efecb/close` → **200**

```json
{
  "command_id": "d5c688a7-c4ab-4e1f-abf3-8815c08af0e3",
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

Done: card order 688153c1-6b45-41c2-ae36-f384618c9c1e.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732101112",
  "device_ref": "sandbox-12046"
}
```

```json
{
  "challenge_id": "d3366586-93c1-4e6f-8612-74bb9a56d5a8",
  "expires_at": "2026-10-28T10:14:28.214244581Z",
  "resend_available_at": "2026-10-28T10:09:29.214244581Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732101112` → **200**

```json
{
  "phone": "+380732101112",
  "audience": "CLIENT",
  "code": "660248",
  "sent_at": "2026-10-28T10:09:28.216687725Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3366586-93c1-4e6f-8612-74bb9a56d5a8",
  "code": "660248",
  "device_ref": "sandbox-12046"
}
```

```json
{
  "session_id": "c98c17cc-31a6-487b-ba9b-835b126cba89",
  "subject": {
    "type": "CLIENT",
    "id": "dca201df-dee4-4409-b7b9-c89482108931"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2EyMDFkZi1kZWU0LTQ0MDktYjdiOS1jODk0ODIxMDg5MzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMDY4LCJpYXQiOjE3OTMxODIxNjgsImp0aSI6ImViZThiODg3LTIwM2MtNDNhZS1iYThhLTkyMTAxMjIyYWU0ZiIsInNpZCI6ImM5OGMxN2NjLTMxYTYtNDg3Yi1iYTliLTgzNWIxMjZjYmE4OSJ9.J1mEgOUsIYSzRDmIqOCexk-9ip2NoGMEpv4RNBQhQI4",
  "access_expires_at": "2026-10-28T10:24:28.401682309Z",
  "refresh_token": "-PN9tkfDhUWmyiKMF1nZXLn08X7X3Z6Z-LL0WtxgveU",
  "refresh_expires_at": "2026-11-27T10:09:28.401034799Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "6aef04f3-793e-4add-adef-46f9b8fdd4a3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "04a983cd-acbe-46cd-8e96-b95b05ec2fc2",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-04a983cd-acbe-46cd-8e96-b95b05ec2fc2",
    "orderDate": "1793182168",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "e597578c50ce64315b293dcbbca0ccb1",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=04a983cd-acbe-46cd-8e96-b95b05ec2fc2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732101112"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=04a983cd-acbe-46cd-8e96-b95b05ec2fc2",
  "created_at": "2026-10-28T10:09:28.574037Z",
  "expires_at": "2026-10-28T10:39:28.574037Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/04a983cd-acbe-46cd-8e96-b95b05ec2fc2` → **200**

```json
{
  "id": "04a983cd-acbe-46cd-8e96-b95b05ec2fc2",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:09:28.574037Z",
  "expires_at": "2026-10-28T10:39:28.574037Z",
  "completed_at": "2026-10-28T10:09:28.740986Z",
  "masked_pan": "41****5379",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "dca201df-dee4-4409-b7b9-c89482108931",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "dca201df-dee4-4409-b7b9-c89482108931",
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
      "id": "ee483516-31b2-4b76-b49f-ad1f0a80fc42",
      "at": "2026-10-28T10:09:29.330829Z",
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
  "client_id": "dca201df-dee4-4409-b7b9-c89482108931",
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
      "id": "ee483516-31b2-4b76-b49f-ad1f0a80fc42",
      "at": "2026-10-28T10:09:29.330829Z",
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
  "device_ref": "sandbox-8544"
}
```

```json
{
  "challenge_id": "b786ff7d-1c8a-4661-a254-68c58da50c34",
  "expires_at": "2026-10-28T10:14:30.419505754Z",
  "resend_available_at": "2026-10-28T10:09:31.419505754Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "827904",
  "sent_at": "2026-10-28T10:09:30.422450573Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b786ff7d-1c8a-4661-a254-68c58da50c34",
  "code": "827904",
  "device_ref": "sandbox-8544"
}
```

```json
{
  "session_id": "157fa9bc-0abd-4a31-a8bc-7d0d1f6335de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzA3MCwiaWF0IjoxNzkzMTgyMTcwLCJqdGkiOiI4MDFlZTZhMi0xMjliLTQxOTUtODE0Ny1hMDA5MzNmZjMzZjUiLCJzaWQiOiIxNTdmYTliYy0wYWJkLTRhMzEtYThiYy03ZDBkMWY2MzM1ZGUifQ.h36J9IGtiAR7EoN-BXGnRY0S6wgaPIUsvFomrIUrsXs",
  "access_expires_at": "2026-10-28T10:24:30.606822888Z",
  "refresh_token": "Ci3K9smYv-CWvFHKGIHq9cXQ5O2Ti86v0OA3_YQ4T28",
  "refresh_expires_at": "2026-11-27T10:09:30.606398375Z",
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
  "command_id": "b9810721-a566-4b7b-9597-dd7c58a54537",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "4ea0c39d-646c-4e2d-9085-d86b9ce51ac4",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-4ea0c39d-646c-4e2d-9085-d86b9ce51ac4",
    "orderDate": "1793182170",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "affe7f3fbbfb60f48a004fc5c8734222",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=4ea0c39d-646c-4e2d-9085-d86b9ce51ac4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=4ea0c39d-646c-4e2d-9085-d86b9ce51ac4",
  "created_at": "2026-10-28T10:09:30.933938Z",
  "expires_at": "2026-10-28T10:39:30.933938Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/4ea0c39d-646c-4e2d-9085-d86b9ce51ac4` → **200**

```json
{
  "id": "4ea0c39d-646c-4e2d-9085-d86b9ce51ac4",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:09:30.933938Z",
  "expires_at": "2026-10-28T10:39:30.933938Z",
  "completed_at": "2026-10-28T10:09:31.096842Z",
  "masked_pan": "41****7015",
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
      "id": "44beda59-2fb7-44a3-a286-c5fd0790fad1",
      "at": "2026-10-28T10:09:31.376678Z",
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
  "command_id": "7905cd78-d4ee-4e71-8bc6-fe88f1e45ff0",
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
  "correlation_id": "7963ca0d-ff1b-4f06-8c12-b3efcf965417"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670023168",
  "device_ref": "sandbox-25996"
}
```

```json
{
  "challenge_id": "8708de6f-2b7d-4384-ae6d-c85a382c880c",
  "expires_at": "2026-10-28T10:14:32.780434564Z",
  "resend_available_at": "2026-10-28T10:09:33.780434564Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670023168` → **200**

```json
{
  "phone": "+380670023168",
  "audience": "CLIENT",
  "code": "039157",
  "sent_at": "2026-10-28T10:09:32.782425821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8708de6f-2b7d-4384-ae6d-c85a382c880c",
  "code": "039157",
  "device_ref": "sandbox-25996"
}
```

```json
{
  "session_id": "4d7a9ecb-a018-495f-8354-9a3c49b9901f",
  "subject": {
    "type": "CLIENT",
    "id": "b58f4d72-7614-4ebd-a665-ed8a0f6093ab"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNThmNGQ3Mi03NjE0LTRlYmQtYTY2NS1lZDhhMGY2MDkzYWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMDcyLCJpYXQiOjE3OTMxODIxNzIsImp0aSI6IjZkYjU1ZGIzLWRkOTgtNDExYi05NDk0LWUyYmI2YzcyNWNkMSIsInNpZCI6IjRkN2E5ZWNiLWEwMTgtNDk1Zi04MzU0LTlhM2M0OWI5OTAxZiJ9.FDurhCTEtH7dDh-74xNlSR6Jp809BmMB06kmeAyf0xA",
  "access_expires_at": "2026-10-28T10:24:32.966127218Z",
  "refresh_token": "ILYJeqgrP5G1_fv91yBobbZNRtKfkiMOfaFwF9406FM",
  "refresh_expires_at": "2026-11-27T10:09:32.965757028Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b58f4d72-7614-4ebd-a665-ed8a0f6093ab",
  "session_id": "4d7a9ecb-a018-495f-8354-9a3c49b9901f",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dd16161a-a037-46a5-b4e4-4ce3674ecbeb",
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
  "id": "0d245043-d8c1-4556-b50a-49d0c2e1a18b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:14:33.295600Z",
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
  "challenge_id": "ecae40f2-c0e1-4427-8ad3-2a86059d9984",
  "expires_at": "2026-10-28T10:14:35.473361178Z",
  "resend_available_at": "2026-10-28T10:09:36.473361178Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670023168` → **200**

```json
{
  "phone": "+380670023168",
  "audience": "CLIENT",
  "code": "764161",
  "sent_at": "2026-10-28T10:09:35.475540062Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "e11edb04-8357-4707-8cbc-48270d80289b",
  "challenge_id": "ecae40f2-c0e1-4427-8ad3-2a86059d9984",
  "otp_code": "764161"
}
```

```json
{
  "client_id": "b58f4d72-7614-4ebd-a665-ed8a0f6093ab",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T10:09:35.680695311Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "f9a415fa-80b6-486f-ac13-8bc764e7e9b5",
  "quote_id": "0d245043-d8c1-4556-b50a-49d0c2e1a18b",
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
  "correlation_id": "e5212c1a-f2cf-4a99-b4e7-8b9e516736f8"
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
  "session_id": "982b504f-7396-4f26-90c1-b841fff04f4f",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwNzYsImlhdCI6MTc5MzE4MjE3NiwianRpIjoiZjM2Y2E3NjQtMzEyZC00YmJkLTgxZDUtNWE3MWVmNDM1OTA1Iiwic2lkIjoiOTgyYjUwNGYtNzM5Ni00ZjI2LTkwYzEtYjg0MWZmZjA0ZjRmIn0.QeY_IuXjxmzJdK4DbkDbqZTwtUzSZu0wU2MH6JsTpX0",
  "access_expires_at": "2026-10-28T10:24:36.277646111Z",
  "refresh_token": "JY14xQlg5AGhGhw7gwvNIOeuSyu0pySg_pkNgorYlrc",
  "refresh_expires_at": "2026-10-28T22:09:36.277136236Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "b58f4d72-7614-4ebd-a665-ed8a0f6093ab",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T10:09:35.680695Z",
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

`POST /api/admin/v1/client-deletions/b58f4d72-7614-4ebd-a665-ed8a0f6093ab/complete` → **200**

```json
{
  "command_id": "2e79c40b-5831-46f3-a827-4472bc720cc0",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "b58f4d72-7614-4ebd-a665-ed8a0f6093ab",
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
  "correlation_id": "56651ef2-f926-4409-852c-79e790f7a6c5"
}
```

Done: client b58f4d72-7614-4ebd-a665-ed8a0f6093ab anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661429722",
  "device_ref": "sandbox-26098"
}
```

```json
{
  "challenge_id": "2fc93281-5ac8-4a2e-bc5b-020dc67458d5",
  "expires_at": "2026-10-28T10:14:36.978560127Z",
  "resend_available_at": "2026-10-28T10:09:37.978560127Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661429722` → **200**

```json
{
  "phone": "+380661429722",
  "audience": "CLIENT",
  "code": "803504",
  "sent_at": "2026-10-28T10:09:36.98039707Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2fc93281-5ac8-4a2e-bc5b-020dc67458d5",
  "code": "803504",
  "device_ref": "sandbox-26098"
}
```

```json
{
  "session_id": "36bbbdcd-a840-4577-b620-95745e0c4755",
  "subject": {
    "type": "CLIENT",
    "id": "0d0a6ed2-cc96-400b-b2f0-92f530f51924"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZDBhNmVkMi1jYzk2LTQwMGItYjJmMC05MmY1MzBmNTE5MjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMDc3LCJpYXQiOjE3OTMxODIxNzcsImp0aSI6IjljZjBmNDU4LWRiYzctNDRhZC1hNjY2LTUxMzNhODMxZmQ0MCIsInNpZCI6IjM2YmJiZGNkLWE4NDAtNDU3Ny1iNjIwLTk1NzQ1ZTBjNDc1NSJ9.3OMCi7ocfUB6RMCTXh9Di9HcvSYNKWVxYrP1iYiUiS0",
  "access_expires_at": "2026-10-28T10:24:37.158320671Z",
  "refresh_token": "Rcz1vBnJ1nfhsgvXkhtI79USyNOPkh2dB5lgl0HFlyk",
  "refresh_expires_at": "2026-11-27T10:09:37.157807552Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0d0a6ed2-cc96-400b-b2f0-92f530f51924",
  "session_id": "36bbbdcd-a840-4577-b620-95745e0c4755",
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
  "session_id": "ec66723f-e805-4c62-b3ca-b42175b079ee",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwNzcsImlhdCI6MTc5MzE4MjE3NywianRpIjoiYzkyNmE2MGYtMGZlZC00ZTQ5LTg3OGEtMzIxZjk5ZTc3Mjc0Iiwic2lkIjoiZWM2NjcyM2YtZTgwNS00YzYyLWIzY2EtYjQyMTc1YjA3OWVlIn0.ZH9WeSKPu-1WkjTiSDhkhUO9bVO-WzglRt-S9r3Xs_k",
  "access_expires_at": "2026-10-28T10:24:37.739200856Z",
  "refresh_token": "YDr5xll3sh4KTk0KX1Db5R9MvrTqMGYiCSznC0hJ-cI",
  "refresh_expires_at": "2026-10-28T22:09:37.738801813Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1429722&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "0d0a6ed2-cc96-400b-b2f0-92f530f51924",
      "phone": "+380661429722",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T10:09:37.156433Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/0d0a6ed2-cc96-400b-b2f0-92f530f51924` → **200**

```json
{
  "client": {
    "id": "0d0a6ed2-cc96-400b-b2f0-92f530f51924",
    "phone": "+380661429722",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T10:09:37.156433Z",
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

`POST /api/admin/v1/clients/0d0a6ed2-cc96-400b-b2f0-92f530f51924/block` → **400**

```json
{
  "command_id": "abd1defb-5e71-480e-bde9-6e883b72c488",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/0d0a6ed2-cc96-400b-b2f0-92f530f51924/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "63d0b28b-687b-42c8-87aa-9f9da200b471",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/0d0a6ed2-cc96-400b-b2f0-92f530f51924/block` → **200**

```json
{
  "command_id": "d1b964d4-e55f-4f56-95ad-af0f65882ec6",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "0d0a6ed2-cc96-400b-b2f0-92f530f51924",
  "phone": "+380661429722",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T10:09:37.156433Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T10:09:38.459839Z",
    "by": "6e5fbc98-8252-401a-a330-6d8daea121be"
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
  "correlation_id": "f1d868c9-5b50-46af-a131-7d40802dad5d"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661429722",
  "device_ref": "sandbox-14975"
}
```

```json
{
  "challenge_id": "c5d0bc6f-89bb-4d53-95c8-b93f3eeb5257",
  "expires_at": "2026-10-28T10:14:40.793212992Z",
  "resend_available_at": "2026-10-28T10:09:41.793212992Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661429722` → **200**

```json
{
  "phone": "+380661429722",
  "audience": "CLIENT",
  "code": "534196",
  "sent_at": "2026-10-28T10:09:40.795368078Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "c5d0bc6f-89bb-4d53-95c8-b93f3eeb5257",
  "code": "534196",
  "device_ref": "sandbox-14975"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "8ce3df06-166f-465e-9c62-6c71b72a2d95"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/0d0a6ed2-cc96-400b-b2f0-92f530f51924` → **200**

```json
{
  "client": {
    "id": "0d0a6ed2-cc96-400b-b2f0-92f530f51924",
    "phone": "+380661429722",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T10:09:37.156433Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T10:09:38.459839Z",
      "by": "6e5fbc98-8252-401a-a330-6d8daea121be"
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

`POST /api/admin/v1/clients/0d0a6ed2-cc96-400b-b2f0-92f530f51924/unblock` → **200**

```json
{
  "command_id": "cbd37a9f-6883-41c7-b019-4d497a8cdcce",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "0d0a6ed2-cc96-400b-b2f0-92f530f51924",
  "phone": "+380661429722",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T10:09:37.156433Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661429722",
  "device_ref": "sandbox-26266"
}
```

```json
{
  "challenge_id": "c546100c-b3da-471a-8c0f-d0dec6917837",
  "expires_at": "2026-10-28T10:14:43.53775709Z",
  "resend_available_at": "2026-10-28T10:09:44.53775709Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661429722` → **200**

```json
{
  "phone": "+380661429722",
  "audience": "CLIENT",
  "code": "317224",
  "sent_at": "2026-10-28T10:09:43.539479085Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c546100c-b3da-471a-8c0f-d0dec6917837",
  "code": "317224",
  "device_ref": "sandbox-26266"
}
```

```json
{
  "session_id": "3dff7f4f-f1bc-4fe2-a44a-e35a45148d94",
  "subject": {
    "type": "CLIENT",
    "id": "0d0a6ed2-cc96-400b-b2f0-92f530f51924"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZDBhNmVkMi1jYzk2LTQwMGItYjJmMC05MmY1MzBmNTE5MjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMDgzLCJpYXQiOjE3OTMxODIxODMsImp0aSI6IjYzZGQ1NzBhLWY4YjYtNGExMy1iOWJkLWU0NzUxMmRkOGFkMiIsInNpZCI6IjNkZmY3ZjRmLWYxYmMtNGZlMi1hNDRhLWUzNWE0NTE0OGQ5NCJ9.4jK-HqsUtR5_pcJVxC4cO7x90x3FKK18guM-LBUJfjs",
  "access_expires_at": "2026-10-28T10:24:43.723961557Z",
  "refresh_token": "FeZIAyxiCs33lpY0dtOe3Tx4XmQwyX3vmOHdx6T1yM4",
  "refresh_expires_at": "2026-11-27T10:09:43.723448763Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0d0a6ed2-cc96-400b-b2f0-92f530f51924",
  "session_id": "3dff7f4f-f1bc-4fe2-a44a-e35a45148d94",
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
  "phone": "+380662943185",
  "device_ref": "sandbox-3715"
}
```

```json
{
  "challenge_id": "6501d19f-a095-4d5b-a59d-5fb2609ba99a",
  "expires_at": "2026-10-28T10:14:44.051021812Z",
  "resend_available_at": "2026-10-28T10:09:45.051021812Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662943185` → **200**

```json
{
  "phone": "+380662943185",
  "audience": "CLIENT",
  "code": "608710",
  "sent_at": "2026-10-28T10:09:44.052641822Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6501d19f-a095-4d5b-a59d-5fb2609ba99a",
  "code": "608710",
  "device_ref": "sandbox-3715"
}
```

```json
{
  "session_id": "46a8e3d0-507b-4da4-bfe1-7f332ee5df0b",
  "subject": {
    "type": "CLIENT",
    "id": "f72e09e2-b4ef-4f09-b1b4-d33196337d75"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNzJlMDllMi1iNGVmLTRmMDktYjFiNC1kMzMxOTYzMzdkNzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMDg0LCJpYXQiOjE3OTMxODIxODQsImp0aSI6IjQyOGI3ZjdhLTAxNmYtNGEyOC04MmQ0LTJiZTIxYjlmODhhYSIsInNpZCI6IjQ2YThlM2QwLTUwN2ItNGRhNC1iZmUxLTdmMzMyZWU1ZGYwYiJ9.ki0j8WpgW0UJAVdm4wBC9VsjH2qQjiDsBkTJ3OPkC08",
  "access_expires_at": "2026-10-28T10:24:44.235019763Z",
  "refresh_token": "PXPTwhluZAdJEIJtOu9aWkJnyzFV-9qW_T2f6goqnjM",
  "refresh_expires_at": "2026-11-27T10:09:44.234477665Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d958d51c-e53c-4b38-ad73-3c5fc16a7aa4",
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
  "id": "a334649b-c1dd-45fe-a623-80a5a042b63c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:14:44.399516Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 9debce5f-c36c-457c-b105-9a1a39030b2d) → **201**

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
  "session_id": "292d9422-9a7c-487a-9b5c-ca79b326081f",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwODQsImlhdCI6MTc5MzE4MjE4NCwianRpIjoiMGRhODlmNTMtMWZlNy00OWMwLWIwYWMtYzhiM2Y5NWY4NjY3Iiwic2lkIjoiMjkyZDk0MjItOWE3Yy00ODdhLTliNWMtY2E3OWIzMjYwODFmIn0.1o2nSy920yUdBpo5m1rnE6-TGdJqq3-nXPgFojHKrzE",
  "access_expires_at": "2026-10-28T10:24:44.859543747Z",
  "refresh_token": "PFXT_W4TmfRAdKRCGaBNhjiSll472jz7YhZvFJG3PYw",
  "refresh_expires_at": "2026-10-28T22:09:44.859113013Z",
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
  "session_id": "746155c0-d0f4-458d-94e3-7eb78419cdf0",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwODUsImlhdCI6MTc5MzE4MjE4NSwianRpIjoiZmE5YTA4Y2YtYzg5OS00NzY4LWI1MzYtOTlkNzA5MzA5ZjUxIiwic2lkIjoiNzQ2MTU1YzAtZDBmNC00NThkLTk0ZTMtN2ViNzg0MTljZGYwIn0.m5nuTTXUf94dKA6F8aqYuMLSL2XLz9Wa2GJOeukijg8",
  "access_expires_at": "2026-10-28T10:24:45.282758565Z",
  "refresh_token": "Qc-HZBqJO1dfOFPcGvaV3uOww7deShon7-0HSjM2oV8",
  "refresh_expires_at": "2026-10-28T22:09:45.282225825Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ee1c633c-1186-42c1-8841-3b7d1f854136/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:09:44.572939Z",
      "actor": {
        "type": "CLIENT",
        "id": "f72e09e2-b4ef-4f09-b1b4-d33196337d75",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ee1c633c-1186-42c1-8841-3b7d1f854136",
        "quote_id": "a334649b-c1dd-45fe-a623-80a5a042b63c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "9debce5f-c36c-457c-b105-9a1a39030b2d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:09:44.5747Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ee1c633c-1186-42c1-8841-3b7d1f854136",
        "attempt_id": "73415b29-aa20-4a25-9a4b-999d79fd3969",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9debce5f-c36c-457c-b105-9a1a39030b2d"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T10:09:44.583378Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ee1c633c-1186-42c1-8841-3b7d1f854136",
        "attempt_id": "73415b29-aa20-4a25-9a4b-999d79fd3969"
      },
      "correlation_id": "9debce5f-c36c-457c-b105-9a1a39030b2d"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "73415b29-aa20-4a25-9a4b-999d79fd3969",
        "generation": 1,
        "started_at": "2026-10-28T10:09:44.573696Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T10:09:44.583378Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T10:09:44.575633Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/9debce5f-c36c-457c-b105-9a1a39030b2d` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "ee1c633c-1186-42c1-8841-3b7d1f854136:0",
      "order_id": "ee1c633c-1186-42c1-8841-3b7d1f854136",
      "at": "2026-10-28T10:09:44.572939Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "ee1c633c-1186-42c1-8841-3b7d1f854136:1",
      "order_id": "ee1c633c-1186-42c1-8841-3b7d1f854136",
      "at": "2026-10-28T10:09:44.5747Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "ee1c633c-1186-42c1-8841-3b7d1f854136:2",
      "order_id": "ee1c633c-1186-42c1-8841-3b7d1f854136",
      "at": "2026-10-28T10:09:44.583378Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/9c7144e6-b641-4efd-9bcb-9ed9f9ed2ea7` → **200**

```json
{
  "found": []
}
```

Done: request 9debce5f-c36c-457c-b105-9a1a39030b2d — order ee1c633c-1186-42c1-8841-3b7d1f854136 found by its id.

`GET /api/rider/v1/orders/ee1c633c-1186-42c1-8841-3b7d1f854136` → **200**

```json
{
  "id": "ee1c633c-1186-42c1-8841-3b7d1f854136",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f72e09e2-b4ef-4f09-b1b4-d33196337d75",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:09:44.572376Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/ee1c633c-1186-42c1-8841-3b7d1f854136/cancel` → **200**

```json
{
  "command_id": "d9759f3d-fa4d-4242-add6-ad0b51dfc9d7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ee1c633c-1186-42c1-8841-3b7d1f854136",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f72e09e2-b4ef-4f09-b1b4-d33196337d75",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:09:44.572376Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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
  "phone": "+380639869731",
  "device_ref": "sandbox-26469"
}
```

```json
{
  "challenge_id": "251ce869-1a5d-4b6f-bb16-a833b1ba2564",
  "expires_at": "2026-10-28T10:14:46.328947948Z",
  "resend_available_at": "2026-10-28T10:09:47.328947948Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639869731` → **200**

```json
{
  "phone": "+380639869731",
  "audience": "CLIENT",
  "code": "201063",
  "sent_at": "2026-10-28T10:09:46.331370739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "251ce869-1a5d-4b6f-bb16-a833b1ba2564",
  "code": "201063",
  "device_ref": "sandbox-26469"
}
```

```json
{
  "session_id": "3d273400-c0a2-4c7d-8681-654a21ddc86a",
  "subject": {
    "type": "CLIENT",
    "id": "bad201be-bedc-4813-b99c-0860ed2f968c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWQyMDFiZS1iZWRjLTQ4MTMtYjk5Yy0wODYwZWQyZjk2OGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMDg2LCJpYXQiOjE3OTMxODIxODYsImp0aSI6ImQ1MWMwOTQ1LWMwNTktNDQxYS1hYTc0LThmZTkwZTQyNzAxOCIsInNpZCI6IjNkMjczNDAwLWMwYTItNGM3ZC04NjgxLTY1NGEyMWRkYzg2YSJ9.Ps8jIBwT5-6XTl4QiREv2PxmhqOzFDKsdx_0dDIP8SE",
  "access_expires_at": "2026-10-28T10:24:46.548082014Z",
  "refresh_token": "BfJltbgW07nmnG1b3T537WL68m6n1dfIyV0AP4VI_QM",
  "refresh_expires_at": "2026-11-27T10:09:46.547483004Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "a4d99e6d-1514-43e5-9fd1-95a3a42f5c65",
  "expires_at": "2026-10-28T10:14:48.716539502Z",
  "resend_available_at": "2026-10-28T10:09:49.716539502Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639869731` → **200**

```json
{
  "phone": "+380639869731",
  "audience": "CLIENT",
  "code": "496292",
  "sent_at": "2026-10-28T10:09:48.718811788Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "be7f02cd-f709-4780-9ad3-f3968f49eea6",
  "challenge_id": "a4d99e6d-1514-43e5-9fd1-95a3a42f5c65",
  "otp_code": "496292"
}
```

```json
{
  "id": "c88977ab-52bf-49e8-a1bb-89a41230cebf",
  "state": "PENDING",
  "created_at": "2026-10-28T10:09:48.911805Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/c88977ab-52bf-49e8-a1bb-89a41230cebf` → **200**

```json
{
  "id": "c88977ab-52bf-49e8-a1bb-89a41230cebf",
  "state": "PENDING",
  "created_at": "2026-10-28T10:09:48.911805Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c88977ab-52bf-49e8-a1bb-89a41230cebf` → **200**

```json
{
  "id": "c88977ab-52bf-49e8-a1bb-89a41230cebf",
  "state": "PENDING",
  "created_at": "2026-10-28T10:09:48.911805Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c88977ab-52bf-49e8-a1bb-89a41230cebf` → **200**

```json
{
  "id": "c88977ab-52bf-49e8-a1bb-89a41230cebf",
  "state": "READY",
  "created_at": "2026-10-28T10:09:48.911805Z",
  "ready_at": "2026-10-28T10:09:50.941479Z",
  "expires_at": "2026-11-04T10:09:50.941479Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/c88977ab-52bf-49e8-a1bb-89a41230cebf/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639522387",
  "device_ref": "sandbox-25299"
}
```

```json
{
  "challenge_id": "ea8e3d56-63a3-4468-924e-65bccf22a0a7",
  "expires_at": "2026-10-28T10:14:51.588286503Z",
  "resend_available_at": "2026-10-28T10:09:52.588286503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639522387` → **200**

```json
{
  "phone": "+380639522387",
  "audience": "CLIENT",
  "code": "125266",
  "sent_at": "2026-10-28T10:09:51.59015465Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea8e3d56-63a3-4468-924e-65bccf22a0a7",
  "code": "125266",
  "device_ref": "sandbox-25299"
}
```

```json
{
  "session_id": "08e18a5a-d139-4391-b59f-61bfd3b1bafd",
  "subject": {
    "type": "CLIENT",
    "id": "4adfc76c-de75-46b7-8b36-7f474f2e2ce0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YWRmYzc2Yy1kZTc1LTQ2YjctOGIzNi03ZjQ3NGYyZTJjZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMDkxLCJpYXQiOjE3OTMxODIxOTEsImp0aSI6Ijk3OGI5YzU1LWNjYzktNDU1Mi1iZGY2LWY0MjhmMThhOGFmMCIsInNpZCI6IjA4ZTE4YTVhLWQxMzktNDM5MS1iNTlmLTYxYmZkM2IxYmFmZCJ9.9nfps46b6whMgXwXK7sDPrtQRdfset3ooYLJfYxTF-4",
  "access_expires_at": "2026-10-28T10:24:51.773578851Z",
  "refresh_token": "Rgflb0JReJd2chRYsi7svwPZv2WqVRG8Hqlv-vLqOSA",
  "refresh_expires_at": "2026-11-27T10:09:51.773218956Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/c88977ab-52bf-49e8-a1bb-89a41230cebf/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/c88977ab-52bf-49e8-a1bb-89a41230cebf/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fd47d3d5-8f65-477e-85e6-7dbef2e0e494"
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
  "session_id": "1de59ed5-4bbc-4e81-814e-60e807f784a2",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwOTIsImlhdCI6MTc5MzE4MjE5MiwianRpIjoiMjU5ZTdjZjItNjgxMi00N2Q3LWEwMjQtNzk1MGZiN2ViZTZlIiwic2lkIjoiMWRlNTllZDUtNGJiYy00ZTgxLTgxNGUtNjBlODA3Zjc4NGEyIn0.Y9wA6cDdXa9mNxlXsSSrle9x7dq5LBvwoY6Mc9qWqX0",
  "access_expires_at": "2026-10-28T10:24:52.351446799Z",
  "refresh_token": "_aa-to2Itns5umkcKg2kLA3rKNy8VgXy6aUAOHUlEfY",
  "refresh_expires_at": "2026-10-28T22:09:52.350992664Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bad201be-bedc-4813-b99c-0860ed2f968c",
  "session_id": "3d273400-c0a2-4c7d-8681-654a21ddc86a",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/bad201be-bedc-4813-b99c-0860ed2f968c/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "c88977ab-52bf-49e8-a1bb-89a41230cebf",
      "state": "READY",
      "created_at": "2026-10-28T10:09:48.911805Z",
      "ready_at": "2026-10-28T10:09:50.941479Z",
      "expires_at": "2026-11-04T10:09:50.941479Z",
      "size_bytes": 1032
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
  "device_ref": "sandbox-1555"
}
```

```json
{
  "challenge_id": "9d9e2e5d-55ef-4837-b6c7-5e48956f1c69",
  "expires_at": "2026-10-28T10:14:52.849979286Z",
  "resend_available_at": "2026-10-28T10:09:53.849979286Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "087506",
  "sent_at": "2026-10-28T10:09:52.852081913Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d9e2e5d-55ef-4837-b6c7-5e48956f1c69",
  "code": "087506",
  "device_ref": "sandbox-1555"
}
```

```json
{
  "session_id": "ee55d089-7245-425f-933c-bfa8a8c5d5ba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzA5MywiaWF0IjoxNzkzMTgyMTkzLCJqdGkiOiI1YWVhYjE4My0wNGYzLTQ1MDgtOTY1Zi02MjAyMjY4NzQ1ZmQiLCJzaWQiOiJlZTU1ZDA4OS03MjQ1LTQyNWYtOTMzYy1iZmE4YThjNWQ1YmEifQ.bfWRvnXwbL5Zq2FEQpU0o_iXPCLtCfhS2HGq45WDVDc",
  "access_expires_at": "2026-10-28T10:24:53.030646592Z",
  "refresh_token": "P28fuWFA72vHCYKn8fTGkQiw5ywTTLgF0npZ3EmIyP4",
  "refresh_expires_at": "2026-11-27T10:09:53.030072945Z",
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
  "device_ref": "sandbox-20793"
}
```

```json
{
  "challenge_id": "5cca3bbc-854e-467d-bd54-15d3da1088b9",
  "expires_at": "2026-10-28T10:14:53.345530712Z",
  "resend_available_at": "2026-10-28T10:09:54.345530712Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "773582",
  "sent_at": "2026-10-28T10:09:53.347307141Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5cca3bbc-854e-467d-bd54-15d3da1088b9",
  "code": "773582",
  "device_ref": "sandbox-20793"
}
```

```json
{
  "session_id": "cd173555-b80d-4f6b-aac8-1e3076c547b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzA5MywiaWF0IjoxNzkzMTgyMTkzLCJqdGkiOiJhMDg4Y2VjYS1hODZkLTRmZDQtOTRmNy03NDA3YWI0MmFjYzAiLCJzaWQiOiJjZDE3MzU1NS1iODBkLTRmNmItYWFjOC0xZTMwNzZjNTQ3YjcifQ.JujOhcR2at2-qZ3uaAbETh8lCEkjvGApxqNFMvE_yts",
  "access_expires_at": "2026-10-28T10:24:53.529056977Z",
  "refresh_token": "dwo59InX1WQENaTvQH1sW847bb9X95lS5w9dOP7y6e8",
  "refresh_expires_at": "2026-11-27T10:09:53.528558217Z",
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
  "command_id": "1759f446-6d7b-4ddc-a54b-c29740265eee",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:09:53Z",
    "sequence": 1793182193852
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8009cd13-1dd3-447d-a3b7-f2da2f0f3fe2",
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
  "last_heartbeat_at": "2026-10-28T10:09:53.865242Z",
  "last_location_at": "2026-10-28T10:09:53.865242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-5668"
}
```

```json
{
  "challenge_id": "808eebcf-059a-44bb-bfac-1a9f933bff2f",
  "expires_at": "2026-10-28T10:14:54.032156861Z",
  "resend_available_at": "2026-10-28T10:09:55.032156861Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "905710",
  "sent_at": "2026-10-28T10:09:54.033939635Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "808eebcf-059a-44bb-bfac-1a9f933bff2f",
  "code": "905710",
  "device_ref": "sandbox-5668"
}
```

```json
{
  "session_id": "7ef67d0f-745e-45be-83af-2282e1409640",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzA5NCwiaWF0IjoxNzkzMTgyMTk0LCJqdGkiOiI0MGQzOGU4NS1iNTMzLTQ1YTctODBjNi1iMzlmNmU5ZDE2NDEiLCJzaWQiOiI3ZWY2N2QwZi03NDVlLTQ1YmUtODNhZi0yMjgyZTE0MDk2NDAifQ.JiYg1VmJDgCy3nR_8ME0_9HRaJSNOL3D8bDRIc6K7eY",
  "access_expires_at": "2026-10-28T10:24:54.217775181Z",
  "refresh_token": "Uitt7EqN75aOfH2BkVe-jocz3Ri4T8Ow5ML-7_rgXRM",
  "refresh_expires_at": "2026-11-27T10:09:54.217391418Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c812ed73-562e-4e15-96fa-2cd534580464",
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
  "last_heartbeat_at": "2026-10-28T10:09:16.43126Z",
  "last_location_at": "2026-10-28T10:09:16.43126Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c812ed73-562e-4e15-96fa-2cd534580464/handover` → **200**

```json
{
  "command_id": "8e6aaf73-5057-42c8-bd26-bec91001972c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c812ed73-562e-4e15-96fa-2cd534580464",
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
  "last_heartbeat_at": "2026-10-28T10:09:16.43126Z",
  "last_location_at": "2026-10-28T10:09:16.43126Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c812ed73-562e-4e15-96fa-2cd534580464/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:09:54Z",
    "sequence": 1793182194710
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c812ed73-562e-4e15-96fa-2cd534580464",
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
  "last_heartbeat_at": "2026-10-28T10:09:54.723757Z",
  "last_location_at": "2026-10-28T10:09:54.723757Z",
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
  "session_id": "7193b4ba-d4c8-4c27-9cb5-21e137828700",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwOTUsImlhdCI6MTc5MzE4MjE5NSwianRpIjoiNGRiODg5MzAtYzgzYS00MWVmLWJkNzEtNDdkMjIwYTgzYTY3Iiwic2lkIjoiNzE5M2I0YmEtZDRjOC00YzI3LTljYjUtMjFlMTM3ODI4NzAwIn0.sT7eghxgpsUEu4TYTECAwxLbjTEPbpH2K7E5IiFrMvM",
  "access_expires_at": "2026-10-28T10:24:55.152332702Z",
  "refresh_token": "Fy67IUbfT7ObVHADKKpn91J5Y17CiodnaB5EUdpXd8I",
  "refresh_expires_at": "2026-10-28T22:09:55.151841171Z",
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
  "session_id": "0b17585f-b5bb-445a-ab29-63f09a0e9335",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMwOTUsImlhdCI6MTc5MzE4MjE5NSwianRpIjoiYjcyNjc5YjEtNWI0NC00Yzk5LWE0NWUtNzcxYzEwNGQ5YjhiIiwic2lkIjoiMGIxNzU4NWYtYjViYi00NDVhLWFiMjktNjNmMDlhMGU5MzM1In0.89mzW0uba_qwyGZ4auGsKkeE1tOfwmKLabk18EXchWI",
  "access_expires_at": "2026-10-28T10:24:55.577561291Z",
  "refresh_token": "Wq71KpeZUlc1LVkoRe-Yo5pguobHSV0AZ1S3jhdR7BY",
  "refresh_expires_at": "2026-10-28T22:09:55.577003875Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689835539",
  "device_ref": "sandbox-5211"
}
```

```json
{
  "challenge_id": "097ea69e-6bb2-4ea7-96c8-5bf86956b66a",
  "expires_at": "2026-10-28T10:14:55.753692386Z",
  "resend_available_at": "2026-10-28T10:09:56.753692386Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380689835539` → **200**

```json
{
  "phone": "+380689835539",
  "audience": "CLIENT",
  "code": "089693",
  "sent_at": "2026-10-28T10:09:55.755298702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "097ea69e-6bb2-4ea7-96c8-5bf86956b66a",
  "code": "089693",
  "device_ref": "sandbox-5211"
}
```

```json
{
  "session_id": "e0b5a1e2-a136-4ad7-9665-a29bfbe51b97",
  "subject": {
    "type": "CLIENT",
    "id": "048c5836-6a5e-419f-b092-d21917c0e55c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDhjNTgzNi02YTVlLTQxOWYtYjA5Mi1kMjE5MTdjMGU1NWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMDk1LCJpYXQiOjE3OTMxODIxOTUsImp0aSI6IjE1NmJkYjE2LTdlYTAtNGZkYS1hYmM0LWZlOTEyODBkYWFhNSIsInNpZCI6ImUwYjVhMWUyLWExMzYtNGFkNy05NjY1LWEyOWJmYmU1MWI5NyJ9.RWQRngoZw6PqWVuAq93umDwpMUc9CcN9orzPoKVID_k",
  "access_expires_at": "2026-10-28T10:24:55.941501801Z",
  "refresh_token": "fSHTskuImtsLS5iWkUBnQbfe93OK-MeYd1OvZJmUr14",
  "refresh_expires_at": "2026-11-27T10:09:55.940948497Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e4420602-5700-44f5-a7f1-347f1bb42094",
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
  "id": "dd69496f-c667-49d0-8d23-4f0666f5ba7d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:14:56.116743Z",
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
  "command_id": "16e837e8-d870-47c2-85e5-57e548114f66",
  "quote_id": "dd69496f-c667-49d0-8d23-4f0666f5ba7d",
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
  "id": "19d3dc3e-190e-436b-a0f1-8500bc8476e6",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "048c5836-6a5e-419f-b092-d21917c0e55c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:09:56.297618Z",
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
    "id": "3ba288ee-80f8-4bbc-bd38-9e3b9233a579",
    "order_id": "19d3dc3e-190e-436b-a0f1-8500bc8476e6",
    "expires_at": "2026-10-28T10:10:11.300927Z",
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

`POST /api/driver/v1/offers/3ba288ee-80f8-4bbc-bd38-9e3b9233a579/reject` → **204**

```json
{
  "command_id": "0cc57da1-4ae9-4c0b-bfa4-341e9dfe4221"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "01e17e0c-38e8-4ce7-9aa4-87b3d02dadc0",
    "order_id": "19d3dc3e-190e-436b-a0f1-8500bc8476e6",
    "expires_at": "2026-10-28T10:10:11.653291Z",
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

`POST /api/driver/v1/offers/01e17e0c-38e8-4ce7-9aa4-87b3d02dadc0/accept` → **200**

```json
{
  "command_id": "495dfd1f-e638-49c7-82fc-92896f97f7d8"
}
```

```json
{
  "id": "099f460f-42cb-475d-8494-f0b64f25fc53",
  "order_id": "19d3dc3e-190e-436b-a0f1-8500bc8476e6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ba4d20d2-539e-498a-9a19-74d0d21de122",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/19d3dc3e-190e-436b-a0f1-8500bc8476e6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:09:56.298117Z",
      "actor": {
        "type": "CLIENT",
        "id": "048c5836-6a5e-419f-b092-d21917c0e55c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "19d3dc3e-190e-436b-a0f1-8500bc8476e6",
        "quote_id": "dd69496f-c667-49d0-8d23-4f0666f5ba7d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "94a61f70-a638-45f5-b6d1-0eca06409ae1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:09:56.300053Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "19d3dc3e-190e-436b-a0f1-8500bc8476e6",
        "attempt_id": "b85e9dae-d785-41be-b5b8-b63e545e1038",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "94a61f70-a638-45f5-b6d1-0eca06409ae1"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:09:56.306269Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3ba288ee-80f8-4bbc-bd38-9e3b9233a579",
        "order_id": "19d3dc3e-190e-436b-a0f1-8500bc8476e6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "94a61f70-a638-45f5-b6d1-0eca06409ae1"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T10:09:56.6525Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3ba288ee-80f8-4bbc-bd38-9e3b9233a579",
        "order_id": "19d3dc3e-190e-436b-a0f1-8500bc8476e6"
      },
      "correlation_id": "f2e10b75-9231-4f45-b6cc-0de4e9722640"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 19d3dc3e-190e-436b-a0f1-8500bc8476e6 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/19d3dc3e-190e-436b-a0f1-8500bc8476e6` → **200**

```json
{
  "id": "19d3dc3e-190e-436b-a0f1-8500bc8476e6",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "048c5836-6a5e-419f-b092-d21917c0e55c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "099f460f-42cb-475d-8494-f0b64f25fc53",
    "order_id": "19d3dc3e-190e-436b-a0f1-8500bc8476e6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ba4d20d2-539e-498a-9a19-74d0d21de122",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:09:56.297618Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/19d3dc3e-190e-436b-a0f1-8500bc8476e6/cancel` → **200**

```json
{
  "command_id": "1e9e6840-79a7-4aa0-b2f9-6ea36b10ad0a",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "19d3dc3e-190e-436b-a0f1-8500bc8476e6",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "048c5836-6a5e-419f-b092-d21917c0e55c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "099f460f-42cb-475d-8494-f0b64f25fc53",
    "order_id": "19d3dc3e-190e-436b-a0f1-8500bc8476e6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ba4d20d2-539e-498a-9a19-74d0d21de122",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:09:56.297618Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
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
  "session_id": "8009cd13-1dd3-447d-a3b7-f2da2f0f3fe2",
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
  "last_heartbeat_at": "2026-10-28T10:09:53.865242Z",
  "last_location_at": "2026-10-28T10:09:53.865242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8009cd13-1dd3-447d-a3b7-f2da2f0f3fe2/close` → **200**

```json
{
  "command_id": "dd9420b8-12cf-4838-b100-281e9cbc50ce",
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
  "session_id": "c812ed73-562e-4e15-96fa-2cd534580464",
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
  "last_heartbeat_at": "2026-10-28T10:09:54.723757Z",
  "last_location_at": "2026-10-28T10:09:54.723757Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c812ed73-562e-4e15-96fa-2cd534580464/close` → **200**

```json
{
  "command_id": "73d01aa2-9a0e-40f1-b8c2-30c18675ffb1",
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
  "device_ref": "sandbox-16227"
}
```

```json
{
  "challenge_id": "9144cdfa-4fc1-47ef-901b-c517336a23be",
  "expires_at": "2026-10-28T10:14:58.390154316Z",
  "resend_available_at": "2026-10-28T10:09:59.390154316Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "711999",
  "sent_at": "2026-10-28T10:09:58.391949968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9144cdfa-4fc1-47ef-901b-c517336a23be",
  "code": "711999",
  "device_ref": "sandbox-16227"
}
```

```json
{
  "session_id": "a7744f0d-33ba-4544-a659-ce2c11ed9856",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzA5OCwiaWF0IjoxNzkzMTgyMTk4LCJqdGkiOiI2Y2M1NjI1MS1lMzQ4LTRkYmQtOWJjOC03MmEzODhlOGI1YWMiLCJzaWQiOiJhNzc0NGYwZC0zM2JhLTQ1NDQtYTY1OS1jZTJjMTFlZDk4NTYifQ.9PVavNbZ2Unjgv9BdDWVnGgrdHZmJ6BrG7TJxO097W0",
  "access_expires_at": "2026-10-28T10:24:58.577078357Z",
  "refresh_token": "8lV-gIfMzY6YURccKZVc-0v88ziA8njHvstujwObJ6c",
  "refresh_expires_at": "2026-11-27T10:09:58.576611369Z",
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
  "command_id": "2f026d6b-f041-439f-9090-4ab079ece338",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:09:58Z",
    "sequence": 1793182198903
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
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
  "last_heartbeat_at": "2026-10-28T10:09:58.916019Z",
  "last_location_at": "2026-10-28T10:09:58.916019Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677655648",
  "device_ref": "sandbox-14140"
}
```

```json
{
  "challenge_id": "7d6eb5c5-c710-41ac-9817-b5fc7ac5a63e",
  "expires_at": "2026-10-28T10:14:59.091622556Z",
  "resend_available_at": "2026-10-28T10:10:00.091622556Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677655648` → **200**

```json
{
  "phone": "+380677655648",
  "audience": "CLIENT",
  "code": "712862",
  "sent_at": "2026-10-28T10:09:59.093892714Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d6eb5c5-c710-41ac-9817-b5fc7ac5a63e",
  "code": "712862",
  "device_ref": "sandbox-14140"
}
```

```json
{
  "session_id": "e62777c1-e8c1-4ff6-adcb-9b6e3551f924",
  "subject": {
    "type": "CLIENT",
    "id": "2556638d-fbc2-408f-8c13-d337a67b53aa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTU2NjM4ZC1mYmMyLTQwOGYtOGMxMy1kMzM3YTY3YjUzYWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMDk5LCJpYXQiOjE3OTMxODIxOTksImp0aSI6IjE2YmU0ZTViLTMxMjEtNDAyNC1iMTFmLTVjYmY1ZGY4M2E3OCIsInNpZCI6ImU2Mjc3N2MxLWU4YzEtNGZmNi1hZGNiLTliNmUzNTUxZjkyNCJ9.3h0AsS9to7tJjaw588mBwKHxI711nr5wYHJD_Nw4250",
  "access_expires_at": "2026-10-28T10:24:59.274553118Z",
  "refresh_token": "1UO9Hg_q3aBinC64JcApb8fS7EcHvbVnb8r2MVRx9i0",
  "refresh_expires_at": "2026-11-27T10:09:59.274049285Z",
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
  "command_id": "08776442-e0a8-45dc-a738-f1631622a9be",
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
  "id": "7c0e8ffb-5bde-4831-821a-1f3664530a3c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:14:59.607577Z",
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
  "command_id": "7d7dc4dd-9062-4705-b4c7-cc43376458d0",
  "platform": "ANDROID",
  "token": "sandbox-driver-eead99fb-3f89-4506-ae06-f76faf94c1e4"
}
```

```json
{
  "id": "366bdf3d-b93a-4497-aa2e-1a9b483f1067",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:09:59.787538Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "5a2da51e-6b28-4f92-bd6c-4a9b2801798a",
  "platform": "ANDROID",
  "token": "sandbox-rider-72361834-3792-44dc-aa96-ab977f417def"
}
```

```json
{
  "id": "9f676e9d-695b-47b6-a49c-8404a01eedac",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:09:59.953534Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "590a4531-309a-4055-a3b8-fc0e2a09fd5d",
  "quote_id": "7c0e8ffb-5bde-4831-821a-1f3664530a3c",
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
  "id": "6d859597-c1ec-4a77-b778-501d3d066802",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2556638d-fbc2-408f-8c13-d337a67b53aa",
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
  "created_at": "2026-10-28T10:10:00.121307Z",
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
    "id": "9adc0fcf-b39d-4633-b97f-b002cb56cc50",
    "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
    "expires_at": "2026-10-28T10:10:15.124382Z",
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

`POST /api/driver/v1/offers/9adc0fcf-b39d-4633-b97f-b002cb56cc50/accept` → **200**

```json
{
  "command_id": "b297bb27-73ba-4267-8cda-9caee5a6ecc3"
}
```

```json
{
  "id": "05c02a90-adcd-459e-91c1-ff9d43e97f3e",
  "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2f1e722c-9d86-41c7-b2d7-0c8c99ef7214",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:10:00.104Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:10:00.104Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:10:01.097194739Z",
    "token_suffix": "94c1e4",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "95fe1c21-c35c-443b-b515-08417ed5dd2c"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677655648&after=2026-10-28T10:10:00.104Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:10:01.094974966Z",
    "token_suffix": "417def",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "fc4bbf83-535d-4ba1-9bc1-fc9a9d3040b9"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/6d859597-c1ec-4a77-b778-501d3d066802/messages` → **201**

```json
{
  "command_id": "2e4acaac-648d-4ccd-8132-9a58b711b903",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "19fc3a81-6846-4ca0-a3cf-ed5be85b7baf",
  "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T10:10:01.710815682Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2f1e722c-9d86-41c7-b2d7-0c8c99ef7214",
  "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
  "assignment_id": "05c02a90-adcd-459e-91c1-ff9d43e97f3e",
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

`POST /api/driver/v1/trips/2f1e722c-9d86-41c7-b2d7-0c8c99ef7214/messages` → **201**

```json
{
  "command_id": "7d68e2ca-a890-4415-92c4-e5659a95424b",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "d1e0ac34-4b29-404a-964c-13f6067859bb",
  "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T10:10:02.03307925Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/6d859597-c1ec-4a77-b778-501d3d066802/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/2f1e722c-9d86-41c7-b2d7-0c8c99ef7214/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677655648"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/34727db7-56ab-4d85-a42b-600df9e57f90/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:02Z",
    "sequence": 1793182202514
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
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
  "last_heartbeat_at": "2026-10-28T10:10:02.527888Z",
  "last_location_at": "2026-10-28T10:10:02.527888Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2f1e722c-9d86-41c7-b2d7-0c8c99ef7214",
  "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
  "assignment_id": "05c02a90-adcd-459e-91c1-ff9d43e97f3e",
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

`POST /api/driver/v1/trips/2f1e722c-9d86-41c7-b2d7-0c8c99ef7214/arrive` → **200**

```json
{
  "command_id": "14564c42-6350-4f40-8e6b-b7dbc4c5bc95",
  "expected_version": 0
}
```

```json
{
  "id": "2f1e722c-9d86-41c7-b2d7-0c8c99ef7214",
  "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
  "assignment_id": "05c02a90-adcd-459e-91c1-ff9d43e97f3e",
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
  "arrived_at": "2026-10-28T10:10:02.851792Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2f1e722c-9d86-41c7-b2d7-0c8c99ef7214/start` → **200**

```json
{
  "command_id": "263b45fa-cf69-4068-8ef0-79d6c82ac120",
  "expected_version": 1
}
```

```json
{
  "id": "2f1e722c-9d86-41c7-b2d7-0c8c99ef7214",
  "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
  "assignment_id": "05c02a90-adcd-459e-91c1-ff9d43e97f3e",
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
  "arrived_at": "2026-10-28T10:10:02.851792Z",
  "started_at": "2026-10-28T10:10:03.022609Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/34727db7-56ab-4d85-a42b-600df9e57f90/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:03Z",
    "sequence": 1793182203184
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
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
  "last_heartbeat_at": "2026-10-28T10:10:03.196536Z",
  "last_location_at": "2026-10-28T10:10:03.196536Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/2f1e722c-9d86-41c7-b2d7-0c8c99ef7214/complete` → **200**

```json
{
  "command_id": "6a94ae9b-2256-4a28-8c58-c50cbf160046",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:10:03Z",
  "cash_received": true
}
```

```json
{
  "id": "2f1e722c-9d86-41c7-b2d7-0c8c99ef7214",
  "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
  "assignment_id": "05c02a90-adcd-459e-91c1-ff9d43e97f3e",
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
  "arrived_at": "2026-10-28T10:10:02.851792Z",
  "started_at": "2026-10-28T10:10:03.022609Z",
  "completed_at": "2026-10-28T10:10:03.364813Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/6d859597-c1ec-4a77-b778-501d3d066802` → **200**

```json
{
  "id": "6d859597-c1ec-4a77-b778-501d3d066802",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2556638d-fbc2-408f-8c13-d337a67b53aa",
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
    "id": "05c02a90-adcd-459e-91c1-ff9d43e97f3e",
    "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2f1e722c-9d86-41c7-b2d7-0c8c99ef7214",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:10:00.121307Z",
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
    "id": "6d859597-c1ec-4a77-b778-501d3d066802",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:10:00.121307Z",
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
    "id": "2f1e722c-9d86-41c7-b2d7-0c8c99ef7214",
    "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
    "order_short_number": 7,
    "created_at": "2026-10-28T10:10:00.47175Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "747478e6-09f9-43b5-a194-fa5a8311e361",
    "order_id": "db6fc136-4a2f-4a3d-bfdb-123203b3202f",
    "order_short_number": 1,
    "created_at": "2026-10-28T10:09:03.925825Z",
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

`GET /api/rider/v1/orders/6d859597-c1ec-4a77-b778-501d3d066802/tip` → **200**

```json
{
  "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
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
  "available_until": "2026-10-29T10:10:03.364813Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6d859597-c1ec-4a77-b778-501d3d066802/tip` → **201**

```json
{
  "command_id": "64f3ae49-db16-463c-89ad-9605b042f6bf",
  "amount_minor": 1100
}
```

```json
{
  "id": "8aa1391c-a120-4257-a4d7-0b762e54c76c",
  "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T10:10:07.57764Z"
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
  "session_id": "435564a5-7881-411e-89a0-aa491b78c5aa",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxMDcsImlhdCI6MTc5MzE4MjIwNywianRpIjoiMDg4ZmM1MjMtZTY1Yi00YWE4LTgzMjEtYzM1ODA5ZDc0MTljIiwic2lkIjoiNDM1NTY0YTUtNzg4MS00MTFlLTg5YTAtYWE0OTFiNzhjNWFhIn0.8WY1OVeoBwwJs0lkaD473XGhzkBBAtDMlMFqxj2M7WY",
  "access_expires_at": "2026-10-28T10:25:07.996467365Z",
  "refresh_token": "FJNGJp4ZwIrz3HgwGRSEvWHySdEk9PZjHu6mB3gqMMc",
  "refresh_expires_at": "2026-10-28T22:10:07.996051543Z",
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
          "CARD": 1,
          "CASH": 6
        },
        "cancelled_by": {
          "STAFF": 1,
          "DRIVER": 1,
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
      "CARD": 1,
      "CASH": 6
    },
    "cancelled_by": {
      "STAFF": 1,
      "DRIVER": 1,
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
  "generated_at": "2026-10-28T10:10:08.163162592Z"
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
  "generated_at": "2026-10-28T10:10:08.328441539Z"
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
  "session_id": "59ac118c-5dcb-4a6e-a73a-f3827e7c7b4a",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxMDgsImlhdCI6MTc5MzE4MjIwOCwianRpIjoiNjkwY2I0ZjMtNDhkOC00Mjg5LTk5YmMtNTM2YzJiZDQ3Y2M4Iiwic2lkIjoiNTlhYzExOGMtNWRjYi00YTZlLWE3M2EtZjM4MjdlN2M3YjRhIn0.l1gTb3UtJuXg2ie7USL_W-9b7OmHAxmZrZHcygrJlas",
  "access_expires_at": "2026-10-28T10:25:08.750372574Z",
  "refresh_token": "_zNDDJ_UJYHiobue3NTGGy1LWY0t7qeq-LmrX_sAnpw",
  "refresh_expires_at": "2026-10-28T22:10:08.749927546Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6d859597-c1ec-4a77-b778-501d3d066802/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:10:00.121806Z",
      "actor": {
        "type": "CLIENT",
        "id": "2556638d-fbc2-408f-8c13-d337a67b53aa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
        "quote_id": "7c0e8ffb-5bde-4831-821a-1f3664530a3c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "10d36936-934e-4b73-a4d1-d1cb489d9f3b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:10:00.12361Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
        "attempt_id": "c6c61555-5ac1-4677-bb28-a758d28de1bf",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "10d36936-934e-4b73-a4d1-d1cb489d9f3b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:10:00.1295Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9adc0fcf-b39d-4633-b97f-b002cb56cc50",
        "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "10d36936-934e-4b73-a4d1-d1cb489d9f3b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:10:00.47352Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9adc0fcf-b39d-4633-b97f-b002cb56cc50",
        "order_id": "6d859597-c1ec-4a77-b778-501d3d066802",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "05c02a90-adcd-459e-91c1-ff9d43e97f3e"
      },
      "correlation_id": "40451a38-73ca-4837-8fff-efe52a35eb1c"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T10:10:09.082325584Z",
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
      "last_location_at": "2026-10-28T10:10:03.196536Z",
      "order_id": null
    }
  ]
}
```

Done: order 6d859597-c1ec-4a77-b778-501d3d066802.

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
  "session_id": "460bcbf7-2fef-4f04-9cc2-71c799826771",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxMDksImlhdCI6MTc5MzE4MjIwOSwianRpIjoiNDJhNjRjYjYtZWEyZS00ZGMyLTllM2ItMDlkYmU5NTE0OTgwIiwic2lkIjoiNDYwYmNiZjctMmZlZi00ZjA0LTljYzItNzFjNzk5ODI2NzcxIn0.HhkdEzP3AYSbmBkx99qIKhnHgfBxefvNq7rYHfPXTG8",
  "access_expires_at": "2026-10-28T10:25:09.52456292Z",
  "refresh_token": "ez6sUYupYcdweJ1nnqGQwCxe5kL3B0szYRcTmcGGw2k",
  "refresh_expires_at": "2026-10-28T22:10:09.524160157Z",
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
  "command_id": "822a6054-caa7-4579-90ad-51af00e5b122",
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
  "timestamp": "2026-10-28T10:10:10.000+0000",
  "channel": {
    "id": "1730052000.242818606",
    "linkedid": "1730052000.242818606",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679935830"
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
  "timestamp": "2026-10-28T10:10:10.000+0000",
  "channel": {
    "id": "1730052000.242818606",
    "linkedid": "1730052000.242818606",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679935830"
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
  "session_id": "73f2f66a-0dd4-4e81-95f3-07391bc01781",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxMTAsImlhdCI6MTc5MzE4MjIxMCwianRpIjoiZjAzMDgzOWItZjhkMy00ZmNhLWJlMjAtNzJlOTU0MmVjMTA4Iiwic2lkIjoiNzNmMmY2NmEtMGRkNC00ZTgxLTk1ZjMtMDczOTFiYzAxNzgxIn0.YSoMppg6Z8NVD1slEzThgR9RKMuJHQnHL0KEy51xTXg",
  "access_expires_at": "2026-10-28T10:25:10.307948885Z",
  "refresh_token": "rCwmFi7bnO99eASpXr4Xi5K_KrTqf3t-8WPeMd7CJ2c",
  "refresh_expires_at": "2026-10-28T22:10:10.307481004Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "8259fcaf-3387-4d49-b542-e11de003249e",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679935830",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:10:10Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/8259fcaf-3387-4d49-b542-e11de003249e/answer` → **200**

```json
{
  "command_id": "457de410-9f12-4e2b-9b71-87e7caac6734"
}
```

```json
{
  "id": "8259fcaf-3387-4d49-b542-e11de003249e",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679935830",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "order_ids": [],
  "started_at": "2026-10-28T10:10:10Z",
  "answered_at": "2026-10-28T10:10:10.664449Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.242818606",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7f965080-768d-4e8b-97b7-869b9581812e",
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
  "id": "bb8aa8cb-b140-42d2-9fa9-6bd14bf424e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:10.862347Z",
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
  "command_id": "f61f55dc-303a-4d79-96f1-287d7ed51937",
  "quote_id": "bb8aa8cb-b140-42d2-9fa9-6bd14bf424e5",
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
    "phone": "+380679935830"
  },
  "call_id": "8259fcaf-3387-4d49-b542-e11de003249e"
}
```

```json
{
  "id": "321a406a-4f6e-4320-9879-b42b1898fbd0",
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
  "created_at": "2026-10-28T10:10:11.057972Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679935830"
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
    "id": "1730052000.242818606",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "8259fcaf-3387-4d49-b542-e11de003249e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679935830",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "order_ids": [
        "321a406a-4f6e-4320-9879-b42b1898fbd0"
      ],
      "started_at": "2026-10-28T10:10:10Z",
      "answered_at": "2026-10-28T10:10:10.664449Z",
      "ended_at": "2026-10-28T10:10:11.246415Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "063bc915-9c8b-4fd8-b18f-db7d0734d62f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675756215",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "order_ids": [],
      "started_at": "2026-10-28T10:09:10.159576Z",
      "answered_at": "2026-10-28T10:09:10.359488Z",
      "ended_at": "2026-10-28T10:09:10.546011Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:09:10.926104Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/321a406a-4f6e-4320-9879-b42b1898fbd0` → **200**

```json
{
  "id": "321a406a-4f6e-4320-9879-b42b1898fbd0",
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
  "created_at": "2026-10-28T10:10:11.057972Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679935830"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/321a406a-4f6e-4320-9879-b42b1898fbd0` → **200**

```json
{
  "id": "321a406a-4f6e-4320-9879-b42b1898fbd0",
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
  "created_at": "2026-10-28T10:10:11.057972Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679935830"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/321a406a-4f6e-4320-9879-b42b1898fbd0/cancel` → **200**

```json
{
  "command_id": "7c89b3c7-a1de-4302-9cec-930217328f75",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "321a406a-4f6e-4320-9879-b42b1898fbd0",
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
  "created_at": "2026-10-28T10:10:11.057972Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679935830"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 8259fcaf-3387-4d49-b542-e11de003249e with order 321a406a-4f6e-4320-9879-b42b1898fbd0.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3417"
}
```

```json
{
  "challenge_id": "6dc53a0a-4f78-4f2a-843a-1934f919b96a",
  "expires_at": "2026-10-28T10:15:11.961997166Z",
  "resend_available_at": "2026-10-28T10:10:12.961997166Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "650073",
  "sent_at": "2026-10-28T10:10:11.963859551Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6dc53a0a-4f78-4f2a-843a-1934f919b96a",
  "code": "650073",
  "device_ref": "sandbox-3417"
}
```

```json
{
  "session_id": "ed14ed9c-5ad8-4a49-ba85-7023225ef719",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzExMiwiaWF0IjoxNzkzMTgyMjEyLCJqdGkiOiIyYTU0M2IxMC1kYzM2LTRmYjctOWMwYi05MzY2MWQwMDRiZWEiLCJzaWQiOiJlZDE0ZWQ5Yy01YWQ4LTRhNDktYmE4NS03MDIzMjI1ZWY3MTkifQ.LR1NGFXa2FPAGNivw8ZH7S0uvrM3XVX5krcepr6fCN0",
  "access_expires_at": "2026-10-28T10:25:12.146462873Z",
  "refresh_token": "lJ6F9bGqfm5FYyphGIjPUD4J5BaLgB90h8lXdUiGiqI",
  "refresh_expires_at": "2026-11-27T10:10:12.146097613Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
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
  "last_heartbeat_at": "2026-10-28T10:10:03.196536Z",
  "last_location_at": "2026-10-28T10:10:03.196536Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34727db7-56ab-4d85-a42b-600df9e57f90/handover` → **200**

```json
{
  "command_id": "2a27225d-5dba-43fb-84e1-fa43afadf0fb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
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
  "last_heartbeat_at": "2026-10-28T10:10:03.196536Z",
  "last_location_at": "2026-10-28T10:10:03.196536Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34727db7-56ab-4d85-a42b-600df9e57f90/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:12Z",
    "sequence": 1793182212641
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
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
  "last_heartbeat_at": "2026-10-28T10:10:12.654307Z",
  "last_location_at": "2026-10-28T10:10:12.654307Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668246110",
  "device_ref": "sandbox-5817"
}
```

```json
{
  "challenge_id": "190a6a34-f7a2-4acb-8d22-02563e87df07",
  "expires_at": "2026-10-28T10:15:12.809023355Z",
  "resend_available_at": "2026-10-28T10:10:13.809023355Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668246110` → **200**

```json
{
  "phone": "+380668246110",
  "audience": "CLIENT",
  "code": "484157",
  "sent_at": "2026-10-28T10:10:12.810443623Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "190a6a34-f7a2-4acb-8d22-02563e87df07",
  "code": "484157",
  "device_ref": "sandbox-5817"
}
```

```json
{
  "session_id": "10b561aa-d7fd-4883-a6f3-8bd7e12ee30e",
  "subject": {
    "type": "CLIENT",
    "id": "24b13e29-c0f6-451b-8a2a-65065dcb8782"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNGIxM2UyOS1jMGY2LTQ1MWItOGEyYS02NTA2NWRjYjg3ODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMTEyLCJpYXQiOjE3OTMxODIyMTIsImp0aSI6ImE1OThlZDA3LTYwMjctNDYzOS1iNjFjLTg5OTFhMzMzNjQyYiIsInNpZCI6IjEwYjU2MWFhLWQ3ZmQtNDg4My1hNmYzLThiZDdlMTJlZTMwZSJ9.loP9096hfm2XUQ9-noB4shZabXNwdPxzrMrhZ-WVizE",
  "access_expires_at": "2026-10-28T10:25:12.98846123Z",
  "refresh_token": "0-c_9GqCXpY5TWPzAwTOIINEClV2_JJONsDKrAvlk6U",
  "refresh_expires_at": "2026-11-27T10:10:12.987947901Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f64825da-ab65-4312-a270-314673884ec8",
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
  "id": "043b0098-4611-409d-a72c-2998984bd02e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:13.154572Z",
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
  "command_id": "75815f93-47c1-4970-89a5-303318dec18a",
  "quote_id": "043b0098-4611-409d-a72c-2998984bd02e",
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
  "id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "24b13e29-c0f6-451b-8a2a-65065dcb8782",
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
  "created_at": "2026-10-28T10:10:13.33098Z",
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
    "id": "adeaa8eb-7936-44e5-b947-a5b85cec583f",
    "order_id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
    "expires_at": "2026-10-28T10:10:28.333711Z",
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

`POST /api/driver/v1/offers/adeaa8eb-7936-44e5-b947-a5b85cec583f/accept` → **200**

```json
{
  "command_id": "f64c3617-1fa5-4114-9cd2-c40e8d4d9681"
}
```

```json
{
  "id": "24e2bd3a-f715-43b9-9194-3447938976a0",
  "order_id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "48a47a4a-9e43-4bce-854d-c2875f5ed6b1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "48a47a4a-9e43-4bce-854d-c2875f5ed6b1",
  "order_id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
  "assignment_id": "24e2bd3a-f715-43b9-9194-3447938976a0",
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

`POST /api/driver/v1/work-sessions/34727db7-56ab-4d85-a42b-600df9e57f90/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:13Z",
    "sequence": 1793182213998
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
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
  "last_heartbeat_at": "2026-10-28T10:10:14.012293Z",
  "last_location_at": "2026-10-28T10:10:14.012293Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/48a47a4a-9e43-4bce-854d-c2875f5ed6b1/arrive` → **200**

```json
{
  "command_id": "e40cd713-92f0-4fd0-9fcb-f9287252db86",
  "expected_version": 0
}
```

```json
{
  "id": "48a47a4a-9e43-4bce-854d-c2875f5ed6b1",
  "order_id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
  "assignment_id": "24e2bd3a-f715-43b9-9194-3447938976a0",
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
  "arrived_at": "2026-10-28T10:10:14.187532Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/48a47a4a-9e43-4bce-854d-c2875f5ed6b1/start` → **200**

```json
{
  "command_id": "b023fe05-4815-456f-8f4c-22889a12375e",
  "expected_version": 1
}
```

```json
{
  "id": "48a47a4a-9e43-4bce-854d-c2875f5ed6b1",
  "order_id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
  "assignment_id": "24e2bd3a-f715-43b9-9194-3447938976a0",
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
  "arrived_at": "2026-10-28T10:10:14.187532Z",
  "started_at": "2026-10-28T10:10:14.365628Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/34727db7-56ab-4d85-a42b-600df9e57f90/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:14Z",
    "sequence": 1793182214536
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
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
  "last_heartbeat_at": "2026-10-28T10:10:14.549535Z",
  "last_location_at": "2026-10-28T10:10:14.549535Z",
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
  "device_ref": "sandbox-29507"
}
```

```json
{
  "challenge_id": "fa8d15ea-a79e-4189-925a-97bc649c2125",
  "expires_at": "2026-10-28T10:15:14.727968454Z",
  "resend_available_at": "2026-10-28T10:10:15.727968454Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "497740",
  "sent_at": "2026-10-28T10:10:14.729800013Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa8d15ea-a79e-4189-925a-97bc649c2125",
  "code": "497740",
  "device_ref": "sandbox-29507"
}
```

```json
{
  "session_id": "72cedf09-c0ca-4147-b03c-03ba225c6863",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzExNCwiaWF0IjoxNzkzMTgyMjE0LCJqdGkiOiIxN2ExZmE1OS02OGZkLTRiNDktODJiMy1iYjY5YzI4Y2FkOTYiLCJzaWQiOiI3MmNlZGYwOS1jMGNhLTQxNDctYjAzYy0wM2JhMjI1YzY4NjMifQ.-lCy3sGRVYQ9z1RsKjWYGY8aZ8aeGZuaLcK8t0MfvWo",
  "access_expires_at": "2026-10-28T10:25:14.91036138Z",
  "refresh_token": "N72f_nnjTN1P7ggggjUwDawd5yAiW1hmFvyj4n72j-I",
  "refresh_expires_at": "2026-11-27T10:10:14.90994774Z",
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
  "command_id": "a90058ea-da93-4df6-b01c-dcac61aeb583",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:15Z",
    "sequence": 1793182215238
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "00c2d77c-b485-44b7-874b-4ad8995a1c07",
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
  "last_heartbeat_at": "2026-10-28T10:10:15.252105Z",
  "last_location_at": "2026-10-28T10:10:15.252105Z",
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
  "session_id": "946b30e7-f203-47db-8d90-34152f15b6d1",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxMTUsImlhdCI6MTc5MzE4MjIxNSwianRpIjoiYTQ0OGNmZDgtMTI3MC00NzQwLTkzODgtYjM0MmQ1ZTI0YjY2Iiwic2lkIjoiOTQ2YjMwZTctZjIwMy00N2RiLThkOTAtMzQxNTJmMTViNmQxIn0.QOoYIB3itWMAicF-o1tokQ25lpdW_u0anBfgWZDPFro",
  "access_expires_at": "2026-10-28T10:25:15.673549735Z",
  "refresh_token": "ktQD54yI3y732FIZsWRrm-TqdFuEeQPCS1KgqQdXmHE",
  "refresh_expires_at": "2026-10-28T22:10:15.673069656Z",
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
  "session_id": "6cd623cd-4770-4a43-ace3-25c3b0eb713e",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxMTYsImlhdCI6MTc5MzE4MjIxNiwianRpIjoiOWU5Yzk1ZTItODI2My00NzRlLTk0NjEtMTdlYjFmMThlYTU2Iiwic2lkIjoiNmNkNjIzY2QtNDc3MC00YTQzLWFjZTMtMjVjM2IwZWI3MTNlIn0.km4iey7WlNVt5pHCKfzVD_H6jUaRMsYkNiCKhg5rfo0",
  "access_expires_at": "2026-10-28T10:25:16.101056647Z",
  "refresh_token": "gKb-_wcmG1O9x8PZbqjlg-lmV49t_VjXnXocXcP9W0w",
  "refresh_expires_at": "2026-10-28T22:10:16.100637962Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/639622c1-e6f8-49aa-9e73-bffd716f19f4` → **200**

```json
{
  "id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "24b13e29-c0f6-451b-8a2a-65065dcb8782",
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
    "id": "24e2bd3a-f715-43b9-9194-3447938976a0",
    "order_id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "48a47a4a-9e43-4bce-854d-c2875f5ed6b1",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T10:10:13.33098Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/639622c1-e6f8-49aa-9e73-bffd716f19f4/interrupt` → **200**

```json
{
  "command_id": "f8527340-d4d6-4068-a2d7-bae5c6db684c",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "24b13e29-c0f6-451b-8a2a-65065dcb8782",
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
      "id": "24e2bd3a-f715-43b9-9194-3447938976a0",
      "order_id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "48a47a4a-9e43-4bce-854d-c2875f5ed6b1",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T10:10:13.33098Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "3657da20-da47-4894-a745-0d151abe084f",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "24b13e29-c0f6-451b-8a2a-65065dcb8782",
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
    "id": "4425d937-dc9a-437d-8ca6-f41febf97b30",
    "order_id": "3657da20-da47-4894-a745-0d151abe084f",
    "expires_at": "2026-10-28T10:10:31.471148Z",
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

`POST /api/driver/v1/offers/4425d937-dc9a-437d-8ca6-f41febf97b30/accept` → **200**

```json
{
  "command_id": "b19e0dfa-a82e-47f8-af27-8e917be05dc9"
}
```

```json
{
  "id": "d578cf5b-391b-4e56-853f-d800768ff7f2",
  "order_id": "3657da20-da47-4894-a745-0d151abe084f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "99062199-c041-4297-a1d6-660a1c25fbe0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "99062199-c041-4297-a1d6-660a1c25fbe0",
  "order_id": "3657da20-da47-4894-a745-0d151abe084f",
  "assignment_id": "d578cf5b-391b-4e56-853f-d800768ff7f2",
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
  "session_id": "00c2d77c-b485-44b7-874b-4ad8995a1c07",
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
  "last_heartbeat_at": "2026-10-28T10:10:15.252105Z",
  "last_location_at": "2026-10-28T10:10:15.252105Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/00c2d77c-b485-44b7-874b-4ad8995a1c07/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:17Z",
    "sequence": 1793182217315
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "00c2d77c-b485-44b7-874b-4ad8995a1c07",
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
  "last_heartbeat_at": "2026-10-28T10:10:17.328301Z",
  "last_location_at": "2026-10-28T10:10:17.328301Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/99062199-c041-4297-a1d6-660a1c25fbe0/arrive` → **200**

```json
{
  "command_id": "1b5845bd-31ed-4ac1-a960-f59a3a13f00c",
  "expected_version": 0
}
```

```json
{
  "id": "99062199-c041-4297-a1d6-660a1c25fbe0",
  "order_id": "3657da20-da47-4894-a745-0d151abe084f",
  "assignment_id": "d578cf5b-391b-4e56-853f-d800768ff7f2",
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
  "arrived_at": "2026-10-28T10:10:17.499854Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/99062199-c041-4297-a1d6-660a1c25fbe0/start` → **200**

```json
{
  "command_id": "f2c391ec-1a2e-4d06-893f-9d3b004d0654",
  "expected_version": 1
}
```

```json
{
  "id": "99062199-c041-4297-a1d6-660a1c25fbe0",
  "order_id": "3657da20-da47-4894-a745-0d151abe084f",
  "assignment_id": "d578cf5b-391b-4e56-853f-d800768ff7f2",
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
  "arrived_at": "2026-10-28T10:10:17.499854Z",
  "started_at": "2026-10-28T10:10:17.677897Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/99062199-c041-4297-a1d6-660a1c25fbe0/complete` → **200**

```json
{
  "command_id": "b56c8e44-cb54-4947-894f-cbdf774db175",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:10:17Z"
}
```

```json
{
  "id": "99062199-c041-4297-a1d6-660a1c25fbe0",
  "order_id": "3657da20-da47-4894-a745-0d151abe084f",
  "assignment_id": "d578cf5b-391b-4e56-853f-d800768ff7f2",
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
  "arrived_at": "2026-10-28T10:10:17.499854Z",
  "started_at": "2026-10-28T10:10:17.677897Z",
  "completed_at": "2026-10-28T10:10:17.858424Z",
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
    "id": "3657da20-da47-4894-a745-0d151abe084f",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:10:16.462374Z",
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
    "id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:10:13.33098Z",
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
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
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

`GET /api/operator/v1/orders/639622c1-e6f8-49aa-9e73-bffd716f19f4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:10:13.331429Z",
      "actor": {
        "type": "CLIENT",
        "id": "24b13e29-c0f6-451b-8a2a-65065dcb8782",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
        "quote_id": "043b0098-4611-409d-a72c-2998984bd02e",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "f1897518-e40c-4e74-a5cb-ee2f52a238fa"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:10:13.332974Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
        "attempt_id": "5e771969-2877-4a67-9588-2f0774f03120",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f1897518-e40c-4e74-a5cb-ee2f52a238fa"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:10:13.33615Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "adeaa8eb-7936-44e5-b947-a5b85cec583f",
        "order_id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "f1897518-e40c-4e74-a5cb-ee2f52a238fa"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:10:13.675675Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "adeaa8eb-7936-44e5-b947-a5b85cec583f",
        "order_id": "639622c1-e6f8-49aa-9e73-bffd716f19f4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "24e2bd3a-f715-43b9-9194-3447938976a0"
      },
      "correlation_id": "cb3e3509-fbaa-4153-a5ea-c9643a3e3bb1"
```

Done: interrupted 639622c1-e6f8-49aa-9e73-bffd716f19f4, follow-up 3657da20-da47-4894-a745-0d151abe084f.

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
  "session_id": "ba4faa9f-6bc9-42cd-a9eb-f498f51505cd",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxMjEsImlhdCI6MTc5MzE4MjIyMSwianRpIjoiNDRhZGQwMTAtZTBmYy00NGY5LTgxYTQtNjUwYjE3NmQwZDEzIiwic2lkIjoiYmE0ZmFhOWYtNmJjOS00MmNkLWE5ZWItZjQ5OGY1MTUwNWNkIn0.t6vS2emPhk_ujvWcp4vFcRdQn8q9BfdTCOdTDYAxP_A",
  "access_expires_at": "2026-10-28T10:25:21.81935848Z",
  "refresh_token": "FHnn2pGEg0gLYJ7ljmFeEkX8FsvM2FUa9SH-71QnXag",
  "refresh_expires_at": "2026-10-28T22:10:21.818043086Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "46244e23-3dc0-4b81-9c78-de0272806387",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:10:21Z"
}
```

```json
{
  "id": "80ea446c-c91a-4f19-8dc9-68aaa576ad55",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:10:21Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/80ea446c-c91a-4f19-8dc9-68aaa576ad55/publish` → **200**

```json
{
  "command_id": "3d841462-58b7-4090-8fc0-a9fe6af96f52",
  "expected_version": 0
}
```

```json
{
  "id": "80ea446c-c91a-4f19-8dc9-68aaa576ad55",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:10:22.201443Z",
  "published_at": "2026-10-28T10:10:22.201443Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "80ea446c-c91a-4f19-8dc9-68aaa576ad55",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T10:10:22.201443Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631291529",
  "device_ref": "sandbox-2041"
}
```

```json
{
  "challenge_id": "ec78c5f7-cbe0-40e5-98b1-54d6fb482d0f",
  "expires_at": "2026-10-28T10:15:22.539030088Z",
  "resend_available_at": "2026-10-28T10:10:23.539030088Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631291529` → **200**

```json
{
  "phone": "+380631291529",
  "audience": "CLIENT",
  "code": "128290",
  "sent_at": "2026-10-28T10:10:22.540700849Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec78c5f7-cbe0-40e5-98b1-54d6fb482d0f",
  "code": "128290",
  "device_ref": "sandbox-2041"
}
```

```json
{
  "session_id": "55203606-07b8-4234-9d31-14c03b19a01d",
  "subject": {
    "type": "CLIENT",
    "id": "8b7f29c5-162c-4165-96fe-306aadcda803"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjdmMjljNS0xNjJjLTQxNjUtOTZmZS0zMDZhYWRjZGE4MDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMTIyLCJpYXQiOjE3OTMxODIyMjIsImp0aSI6IjUxYmQyZGE4LTBhZDAtNGVmOC1hNzQ5LThmY2JkOTg5NDYzMSIsInNpZCI6IjU1MjAzNjA2LTA3YjgtNDIzNC05ZDMxLTE0YzAzYjE5YTAxZCJ9.t5DDfFCVZCQrTXbcANrH4QOexyhKENeRw7iI77gg-oM",
  "access_expires_at": "2026-10-28T10:25:22.717811542Z",
  "refresh_token": "Q0nzImchisMm76ipvAjR42oWxhNyyOSNyHg-it4AEvI",
  "refresh_expires_at": "2026-11-27T10:10:22.71747832Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "80ea446c-c91a-4f19-8dc9-68aaa576ad55",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T10:10:22.201443Z",
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
  "command_id": "99ac12c7-b5c7-42de-8c6f-adabb2f88bdd",
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
  "id": "a422a58c-3b52-4119-becc-b2be499f2341",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:23.042912Z",
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
  "command_id": "39123958-4714-4591-bb51-494d10f931fe",
  "quote_id": "a422a58c-3b52-4119-becc-b2be499f2341",
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
  "correlation_id": "98ad6658-6c15-4164-ba61-015867a0e2ef"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "15d92852-608d-4602-ae15-48cd2cde34dc",
  "version_id": "80ea446c-c91a-4f19-8dc9-68aaa576ad55",
  "language": "uk"
}
```

```json
{
  "version_id": "80ea446c-c91a-4f19-8dc9-68aaa576ad55",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T10:10:23.388355Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9bca44b1-dbec-4187-867c-5b7ce235baeb",
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
  "id": "d691f3aa-02fc-4752-b1d9-24bb370178af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:23.559534Z",
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
  "command_id": "1489bdc2-d801-4a87-99c0-04f7aa85f68d",
  "quote_id": "d691f3aa-02fc-4752-b1d9-24bb370178af",
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
  "id": "52b4ab37-803e-49a8-9428-b0ba931c0ab7",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b7f29c5-162c-4165-96fe-306aadcda803",
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
  "created_at": "2026-10-28T10:10:23.73527Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/52b4ab37-803e-49a8-9428-b0ba931c0ab7` → **200**

```json
{
  "id": "52b4ab37-803e-49a8-9428-b0ba931c0ab7",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b7f29c5-162c-4165-96fe-306aadcda803",
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
  "created_at": "2026-10-28T10:10:23.73527Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/52b4ab37-803e-49a8-9428-b0ba931c0ab7/cancel` → **200**

```json
{
  "command_id": "08e209aa-7f3d-406b-a09b-8360bbc77164",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "52b4ab37-803e-49a8-9428-b0ba931c0ab7",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8b7f29c5-162c-4165-96fe-306aadcda803",
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
  "created_at": "2026-10-28T10:10:23.73527Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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

`POST /api/admin/v1/legal-documents/80ea446c-c91a-4f19-8dc9-68aaa576ad55` → **409**

```json
{
  "command_id": "db5d0e1c-ed7b-44b9-8c2b-bed5fecafb6e",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:10:24Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/80ea446c-c91a-4f19-8dc9-68aaa576ad55",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "74ef8954-1d8c-4e8f-a4d1-f9b593c3d0c5"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a97fbd99-ac11-4353-93ac-8fbc8a04174c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:10:24Z"
}
```

```json
{
  "id": "d3f7f8be-034c-44bd-816f-b097508a28a3",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:10:24Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/d3f7f8be-034c-44bd-816f-b097508a28a3/publish` → **200**

```json
{
  "command_id": "db106858-fa0f-499f-8f06-fad2d090def8",
  "expected_version": 0
}
```

```json
{
  "id": "d3f7f8be-034c-44bd-816f-b097508a28a3",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:10:24.61846Z",
  "published_at": "2026-10-28T10:10:24.61846Z",
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
  "device_ref": "sandbox-2106"
}
```

```json
{
  "challenge_id": "f9d8dbf5-ed10-4422-aaf7-f135a86c113f",
  "expires_at": "2026-10-28T10:15:24.796834374Z",
  "resend_available_at": "2026-10-28T10:10:25.796834374Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "403182",
  "sent_at": "2026-10-28T10:10:24.798313136Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9d8dbf5-ed10-4422-aaf7-f135a86c113f",
  "code": "403182",
  "device_ref": "sandbox-2106"
}
```

```json
{
  "session_id": "833eb697-b000-46b5-b579-3a2aa08d3cbe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzEyNCwiaWF0IjoxNzkzMTgyMjI0LCJqdGkiOiJmOWMyODc5My0zNWE5LTRjNTEtOTc5Ny1mZDdjNzljMmViNGMiLCJzaWQiOiI4MzNlYjY5Ny1iMDAwLTQ2YjUtYjU3OS0zYTJhYTA4ZDNjYmUifQ.9rnbEiuOFGvF23PER2Bfc6fvnattPa9lufUh6hOrjqw",
  "access_expires_at": "2026-10-28T10:25:24.982027001Z",
  "refresh_token": "ttZ7p6ZOyRaokxsCyX4iNvFdSlEDqBSckYSRC1Szs20",
  "refresh_expires_at": "2026-11-27T10:10:24.981712905Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "00c2d77c-b485-44b7-874b-4ad8995a1c07",
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
  "last_heartbeat_at": "2026-10-28T10:10:17.328301Z",
  "last_location_at": "2026-10-28T10:10:17.328301Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/00c2d77c-b485-44b7-874b-4ad8995a1c07/handover` → **200**

```json
{
  "command_id": "d42c44f7-47a5-4fe5-9f19-9bca467c8d0d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "00c2d77c-b485-44b7-874b-4ad8995a1c07",
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
  "last_heartbeat_at": "2026-10-28T10:10:17.328301Z",
  "last_location_at": "2026-10-28T10:10:17.328301Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/00c2d77c-b485-44b7-874b-4ad8995a1c07/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:25Z",
    "sequence": 1793182225474
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "00c2d77c-b485-44b7-874b-4ad8995a1c07",
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
  "last_heartbeat_at": "2026-10-28T10:10:25.487828Z",
  "last_location_at": "2026-10-28T10:10:25.487828Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674288605",
  "device_ref": "sandbox-16036"
}
```

```json
{
  "challenge_id": "18db78e9-a930-477f-b5cc-c212b07885aa",
  "expires_at": "2026-10-28T10:15:25.654923064Z",
  "resend_available_at": "2026-10-28T10:10:26.654923064Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674288605` → **200**

```json
{
  "phone": "+380674288605",
  "audience": "CLIENT",
  "code": "227702",
  "sent_at": "2026-10-28T10:10:25.656501997Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18db78e9-a930-477f-b5cc-c212b07885aa",
  "code": "227702",
  "device_ref": "sandbox-16036"
}
```

```json
{
  "session_id": "43ae7253-48b9-4a7b-bd52-45c5899b810f",
  "subject": {
    "type": "CLIENT",
    "id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzU3MzNiMS0yMGM1LTRlMjEtODUwZS04ZjljODZkYmQ1ZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMTI1LCJpYXQiOjE3OTMxODIyMjUsImp0aSI6ImYyMTBjNmEzLTk3YTItNDZiNS04ZjVhLWE5YzQ1NDhlYzcxMiIsInNpZCI6IjQzYWU3MjUzLTQ4YjktNGE3Yi1iZDUyLTQ1YzU4OTliODEwZiJ9.7NAKuXgR0ae7NajUrWoMuIn139rf2TxKILtc9qIpmyw",
  "access_expires_at": "2026-10-28T10:25:25.837430148Z",
  "refresh_token": "he6rpYKhoZ-XOQ9s3yJXrKk7AUOPPQTFKuKvRH_pgDE",
  "refresh_expires_at": "2026-11-27T10:10:25.836989459Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8bb881c0-2b68-4a23-894c-1976f10bf5b1",
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
  "id": "a04dc992-bf37-47d0-823c-5194e27a3439",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:26.011312Z",
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
  "command_id": "775a3c34-1678-47ab-9b86-8727eeb72af5",
  "quote_id": "a04dc992-bf37-47d0-823c-5194e27a3439",
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
    "phone": "+380679916371"
  }
}
```

```json
{
  "id": "be354726-3529-4d8e-b1e2-f5b173bea6c3",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:10:26.190092Z",
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
    "id": "18ce107f-cf6c-4bf1-9f7c-516fca18802a",
    "order_id": "be354726-3529-4d8e-b1e2-f5b173bea6c3",
    "expires_at": "2026-10-28T10:10:41.193029Z",
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

`POST /api/driver/v1/offers/18ce107f-cf6c-4bf1-9f7c-516fca18802a/accept` → **200**

```json
{
  "command_id": "f96da673-8845-4581-b0c7-270ebc83a168"
}
```

```json
{
  "id": "84321132-8240-4b67-8734-fd7bb92c2fe2",
  "order_id": "be354726-3529-4d8e-b1e2-f5b173bea6c3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "85e194a6-2c78-46c8-9dec-f1a2ef4ffb67",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "85e194a6-2c78-46c8-9dec-f1a2ef4ffb67",
  "order_id": "be354726-3529-4d8e-b1e2-f5b173bea6c3",
  "assignment_id": "84321132-8240-4b67-8734-fd7bb92c2fe2",
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
    "phone": "+380679916371"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7c2ae982-a090-4a58-b6aa-abde294af151",
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
  "id": "e521ac47-79d3-4f32-839f-1e20b2050307",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:26.881073Z",
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
  "command_id": "40b27673-8c4b-4925-b89b-310036a1f148",
  "quote_id": "e521ac47-79d3-4f32-839f-1e20b2050307",
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
  "id": "dd939bf1-8700-472c-a241-932ab1fef6a9",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:10:27.060627Z",
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
  "command_id": "53d8b45a-77c8-42d0-8039-190905fb3a35",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T13:10:27Z"
}
```

```json
{
  "id": "d9bc52f0-3a3b-4b82-8260-ce377eb5dd5a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:27.241594Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:10:27Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a8b7f847-4d8e-474d-aeea-8f9a57efd031",
  "quote_id": "d9bc52f0-3a3b-4b82-8260-ce377eb5dd5a",
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
  "pickup_at": "2026-10-28T13:10:27Z"
}
```

```json
{
  "id": "f8061375-ae3a-4d31-8ad8-e2ab0257fe52",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:10:27.422154Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:10:27Z",
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
  "command_id": "7b66d2c5-6024-4f57-83b2-25cdbc41bf28",
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
  "id": "8f79a927-92ca-455e-b06b-a59ede4b36c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:27.599489Z",
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
  "command_id": "15a4b7bd-2e68-4a69-aa2e-f9f6c5e3d40b",
  "quote_id": "8f79a927-92ca-455e-b06b-a59ede4b36c0",
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
  "correlation_id": "9211fb47-c1f4-44d2-ba30-d210cda4647a"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "f8061375-ae3a-4d31-8ad8-e2ab0257fe52",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T10:10:27.422154Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T13:10:27Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "dd939bf1-8700-472c-a241-932ab1fef6a9",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T10:10:27.060627Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "be354726-3529-4d8e-b1e2-f5b173bea6c3",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "dd939bf1-8700-472c-a241-932ab1fef6a9",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:10:27.060627Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/be354726-3529-4d8e-b1e2-f5b173bea6c3` → **200**

```json
{
  "id": "be354726-3529-4d8e-b1e2-f5b173bea6c3",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "84321132-8240-4b67-8734-fd7bb92c2fe2",
    "order_id": "be354726-3529-4d8e-b1e2-f5b173bea6c3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "85e194a6-2c78-46c8-9dec-f1a2ef4ffb67",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:10:26.190092Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/be354726-3529-4d8e-b1e2-f5b173bea6c3/cancel` → **200**

```json
{
  "command_id": "cf3a33c9-64af-4e78-9061-333d97bb866a",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "be354726-3529-4d8e-b1e2-f5b173bea6c3",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "84321132-8240-4b67-8734-fd7bb92c2fe2",
    "order_id": "be354726-3529-4d8e-b1e2-f5b173bea6c3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "85e194a6-2c78-46c8-9dec-f1a2ef4ffb67",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:10:26.190092Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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

`GET /api/rider/v1/orders/dd939bf1-8700-472c-a241-932ab1fef6a9` → **200**

```json
{
  "id": "dd939bf1-8700-472c-a241-932ab1fef6a9",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:10:27.060627Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/dd939bf1-8700-472c-a241-932ab1fef6a9/cancel` → **200**

```json
{
  "command_id": "5c633d36-1da8-420f-830a-3bfa75926615",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "dd939bf1-8700-472c-a241-932ab1fef6a9",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:10:27.060627Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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

`GET /api/rider/v1/orders/f8061375-ae3a-4d31-8ad8-e2ab0257fe52` → **200**

```json
{
  "id": "f8061375-ae3a-4d31-8ad8-e2ab0257fe52",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:10:27.422154Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:10:27Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/f8061375-ae3a-4d31-8ad8-e2ab0257fe52/cancel` → **200**

```json
{
  "command_id": "1274f726-abf0-48b7-8fc6-7d4806a32224",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f8061375-ae3a-4d31-8ad8-e2ab0257fe52",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8c5733b1-20c5-4e21-850e-8f9c86dbd5dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:10:27.422154Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": "2026-10-28T13:10:27Z",
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
  "session_id": "00c2d77c-b485-44b7-874b-4ad8995a1c07",
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
  "last_heartbeat_at": "2026-10-28T10:10:25.487828Z",
  "last_location_at": "2026-10-28T10:10:25.487828Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/00c2d77c-b485-44b7-874b-4ad8995a1c07/close` → **200**

```json
{
  "command_id": "a8a7ad75-6f21-4a6e-88ee-95ccde2b0f0a",
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

Done: orders be354726-3529-4d8e-b1e2-f5b173bea6c3, dd939bf1-8700-472c-a241-932ab1fef6a9, f8061375-ae3a-4d31-8ad8-e2ab0257fe52.

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
  "session_id": "a36b38bf-4b19-49f1-8b32-31e59fa14692",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxMjksImlhdCI6MTc5MzE4MjIyOSwianRpIjoiNTA3ZDUxNDItNDA4OS00MWZkLWJlODItY2M3ZmJhZWRlNWE0Iiwic2lkIjoiYTM2YjM4YmYtNGIxOS00OWYxLThiMzItMzFlNTlmYTE0NjkyIn0.QBX9M5v8-W6153hetd0AMiycXyOZZnul-WTmiosxAsE",
  "access_expires_at": "2026-10-28T10:25:29.918507919Z",
  "refresh_token": "QLKp_Q6QeRzZh96pa28KWbKW23uTjx81sDzeZffNgoo",
  "refresh_expires_at": "2026-10-28T22:10:29.918076527Z",
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
  "session_id": "5e0363e1-d7d7-4485-8ce1-bfa0ac702bd4",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxMzAsImlhdCI6MTc5MzE4MjIzMCwianRpIjoiZjEyYTc5NWYtNmVmYi00Y2JlLTlkOGEtMmVmZDg0ODFjNDNkIiwic2lkIjoiNWUwMzYzZTEtZDdkNy00NDg1LThjZTEtYmZhMGFjNzAyYmQ0In0.9CGJ_467rcwk3zpxsiQNLVPRd4maxZ0IlbKoIrixAv8",
  "access_expires_at": "2026-10-28T10:25:30.342807204Z",
  "refresh_token": "nUbIBpYHQNGA9kolYihkJllASwHi1HUBMGiFeHQ4S8s",
  "refresh_expires_at": "2026-10-28T22:10:30.342415089Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4509"
}
```

```json
{
  "challenge_id": "77707168-a727-4820-ac91-ccb351e51add",
  "expires_at": "2026-10-28T10:15:30.499507776Z",
  "resend_available_at": "2026-10-28T10:10:31.499507776Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "855860",
  "sent_at": "2026-10-28T10:10:30.501284049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77707168-a727-4820-ac91-ccb351e51add",
  "code": "855860",
  "device_ref": "sandbox-4509"
}
```

```json
{
  "session_id": "537aed62-04f1-4872-bcd3-11b6f89dd93a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzEzMCwiaWF0IjoxNzkzMTgyMjMwLCJqdGkiOiIyMTVjNDI5ZS1mODZjLTRiOWMtYTI4OC1jM2ViY2Y3ZTIxOGIiLCJzaWQiOiI1MzdhZWQ2Mi0wNGYxLTQ4NzItYmNkMy0xMWI2Zjg5ZGQ5M2EifQ.ch5QrF9RWGaXzs5GcrPXiPjybmikDK5DmlSiTH74Luo",
  "access_expires_at": "2026-10-28T10:25:30.680367654Z",
  "refresh_token": "l3DK5OU6E8mtL9jZZC0LRsFh0vq002HgBwXt63azzTQ",
  "refresh_expires_at": "2026-11-27T10:10:30.679930474Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:10:14.549535Z",
  "last_location_at": "2026-10-28T10:10:14.549535Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/34727db7-56ab-4d85-a42b-600df9e57f90/handover` → **200**

```json
{
  "command_id": "b3d1eb21-24a1-4a93-8dbc-8465b08ee3d3",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:10:14.549535Z",
  "last_location_at": "2026-10-28T10:10:14.549535Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/34727db7-56ab-4d85-a42b-600df9e57f90/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:31Z",
    "sequence": 1793182231179
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
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
  "last_heartbeat_at": "2026-10-28T10:10:31.192128Z",
  "last_location_at": "2026-10-28T10:10:31.192128Z",
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
  "command_id": "820e30e1-bc04-4de7-a897-daef9bde7d98",
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
  "effective_at": "2026-10-28T10:10:31.535555Z",
  "changed_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T10:10:31.705130459Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6ddd7cea-5cce-4110-bec8-bf0bb63176b1",
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
  "id": "830016a2-9d91-4f5b-96c1-dac56154b2ae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:31.874704Z",
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
  "command_id": "ede834bd-8555-4c76-9ba6-b1bad61b6576",
  "quote_id": "830016a2-9d91-4f5b-96c1-dac56154b2ae",
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
    "phone": "+3806711123152"
  }
}
```

```json
{
  "id": "49f8a101-11bf-4ed9-87b3-c4da163e2e7e",
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
  "created_at": "2026-10-28T10:10:32.051099Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123152"
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
    "id": "80d518c0-49f5-48e1-9df0-fa409ce8a6c9",
    "order_id": "49f8a101-11bf-4ed9-87b3-c4da163e2e7e",
    "expires_at": "2026-10-28T10:10:47.053827Z",
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

`POST /api/driver/v1/offers/80d518c0-49f5-48e1-9df0-fa409ce8a6c9/accept` → **200**

```json
{
  "command_id": "2ad36429-1b6d-4ce6-b7a8-38ce57bcd18b"
}
```

```json
{
  "id": "9226df16-f5d1-4cf1-98a5-bfd11cc7223c",
  "order_id": "49f8a101-11bf-4ed9-87b3-c4da163e2e7e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "13cc3cdc-5fac-4bdd-a9a5-6ba1960b9d4e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "13cc3cdc-5fac-4bdd-a9a5-6ba1960b9d4e",
  "order_id": "49f8a101-11bf-4ed9-87b3-c4da163e2e7e",
  "assignment_id": "9226df16-f5d1-4cf1-98a5-bfd11cc7223c",
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
    "phone": "+3806711123152"
  }
}
```

`POST /api/driver/v1/work-sessions/34727db7-56ab-4d85-a42b-600df9e57f90/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:32Z",
    "sequence": 1793182232720
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
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
  "last_heartbeat_at": "2026-10-28T10:10:32.733265Z",
  "last_location_at": "2026-10-28T10:10:32.733265Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/13cc3cdc-5fac-4bdd-a9a5-6ba1960b9d4e/arrive` → **200**

```json
{
  "command_id": "50f62bf3-2b68-4e0a-a5ed-5ba4192e58d6",
  "expected_version": 0
}
```

```json
{
  "id": "13cc3cdc-5fac-4bdd-a9a5-6ba1960b9d4e",
  "order_id": "49f8a101-11bf-4ed9-87b3-c4da163e2e7e",
  "assignment_id": "9226df16-f5d1-4cf1-98a5-bfd11cc7223c",
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
  "arrived_at": "2026-10-28T10:10:32.909563Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711123152"
  }
}
```

`POST /api/driver/v1/trips/13cc3cdc-5fac-4bdd-a9a5-6ba1960b9d4e/start` → **200**

```json
{
  "command_id": "804ed757-d07a-4bdc-b889-5f874cd7fae8",
  "expected_version": 1
}
```

```json
{
  "id": "13cc3cdc-5fac-4bdd-a9a5-6ba1960b9d4e",
  "order_id": "49f8a101-11bf-4ed9-87b3-c4da163e2e7e",
  "assignment_id": "9226df16-f5d1-4cf1-98a5-bfd11cc7223c",
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
  "arrived_at": "2026-10-28T10:10:32.909563Z",
  "started_at": "2026-10-28T10:10:33.080489Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711123152"
  }
}
```

`POST /api/driver/v1/trips/13cc3cdc-5fac-4bdd-a9a5-6ba1960b9d4e/complete` → **200**

```json
{
  "command_id": "33b0e645-b09d-4407-832c-43917a2dbcaf",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:10:33Z",
  "cash_received": true
}
```

```json
{
  "id": "13cc3cdc-5fac-4bdd-a9a5-6ba1960b9d4e",
  "order_id": "49f8a101-11bf-4ed9-87b3-c4da163e2e7e",
  "assignment_id": "9226df16-f5d1-4cf1-98a5-bfd11cc7223c",
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
  "arrived_at": "2026-10-28T10:10:32.909563Z",
  "started_at": "2026-10-28T10:10:33.080489Z",
  "completed_at": "2026-10-28T10:10:33.258929Z",
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
  "command_id": "e4b89835-80bd-47fe-90f9-2e720605854f",
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
  "id": "49904e85-e242-4aaa-babc-b9b2dc3a2dcd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:33.439663Z",
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
  "command_id": "d1c63ee5-92ed-4ac8-80b5-e31d1624a988",
  "quote_id": "49904e85-e242-4aaa-babc-b9b2dc3a2dcd",
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
    "phone": "+380671111209"
  }
}
```

```json
{
  "id": "5b8bac0e-ce1e-46d8-becf-cd6e641485ec",
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
  "created_at": "2026-10-28T10:10:33.614751Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111209"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5b8bac0e-ce1e-46d8-becf-cd6e641485ec` → **200**

```json
{
  "id": "5b8bac0e-ce1e-46d8-becf-cd6e641485ec",
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
  "created_at": "2026-10-28T10:10:33.614751Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111209"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5b8bac0e-ce1e-46d8-becf-cd6e641485ec/cancel` → **200**

```json
{
  "command_id": "c03d1b2d-2527-471c-8b3e-4b348325fbed",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "5b8bac0e-ce1e-46d8-becf-cd6e641485ec",
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
  "created_at": "2026-10-28T10:10:33.614751Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111209"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "en": "Operator error",
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
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
  "staff_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T10:10:33.262935Z",
  "last_entries": [
    {
      "order_id": "5b8bac0e-ce1e-46d8-becf-cd6e641485ec",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T10:10:33.976726Z"
    },
    {
      "order_id": "49f8a101-11bf-4ed9-87b3-c4da163e2e7e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T10:10:33.262935Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34727db7-56ab-4d85-a42b-600df9e57f90",
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
  "last_heartbeat_at": "2026-10-28T10:10:32.733265Z",
  "last_location_at": "2026-10-28T10:10:32.733265Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34727db7-56ab-4d85-a42b-600df9e57f90/close` → **200**

```json
{
  "command_id": "a6e6bf20-9e87-40e7-b98f-6189cbc3283d",
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

Done: operator bonus for fulfilled 49f8a101-11bf-4ed9-87b3-c4da163e2e7e and operator-fault cancellation 5b8bac0e-ce1e-46d8-becf-cd6e641485ec.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673366455",
  "device_ref": "sandbox-27046"
}
```

```json
{
  "challenge_id": "2fea5429-c411-49ae-94b3-419b2f372593",
  "expires_at": "2026-10-28T10:15:36.69249615Z",
  "resend_available_at": "2026-10-28T10:10:37.69249615Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673366455` → **200**

```json
{
  "phone": "+380673366455",
  "audience": "CLIENT",
  "code": "107309",
  "sent_at": "2026-10-28T10:10:36.694364431Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671368477",
  "device_ref": "sandbox-25854",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "1142459b-64fc-4130-9c83-b6e6474ba46b",
  "expires_at": "2026-10-28T10:15:36.874428798Z",
  "resend_available_at": "2026-10-28T10:10:37.874428798Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671368477` → **200**

```json
{
  "phone": "+380671368477",
  "audience": "CLIENT",
  "code": "584443",
  "sent_at": "2026-10-28T10:10:36.875967464Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670660000",
  "device_ref": "sandbox-30653"
}
```

```json
{
  "challenge_id": "fb4ceb05-745b-4512-a305-e14a4db8baf9",
  "expires_at": "2026-10-28T10:15:37.051152682Z",
  "resend_available_at": "2026-10-28T10:10:38.051152682Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670660000` → **200**

```json
{
  "phone": "+380670660000",
  "audience": "CLIENT",
  "code": "582635",
  "sent_at": "2026-10-28T10:10:37.053125173Z",
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
  "session_id": "0092f52a-8dc6-4197-b468-fdfa4770db8d",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxMzcsImlhdCI6MTc5MzE4MjIzNywianRpIjoiZjgwMTQ4NzMtNjczMi00NGEzLTliOTktNTc3NDNlOWVkNDhmIiwic2lkIjoiMDA5MmY1MmEtOGRjNi00MTk3LWI0NjgtZmRmYTQ3NzBkYjhkIn0.zgk0FwKSCxytIQShjD91fMHefkabLO3MLjMkU1luyBQ",
  "access_expires_at": "2026-10-28T10:25:37.487854071Z",
  "refresh_token": "RZY20NAzPxhlEIfK4Nge5nuiJXpN3kvGcV1YlNqc-K0",
  "refresh_expires_at": "2026-10-28T22:10:37.487496836Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670660000` → **200**

```json
{
  "deliveries": [
    {
      "id": "e4afcda0-7c47-482c-a6ed-5e305ef7a823",
      "challenge_id": "fb4ceb05-745b-4512-a305-e14a4db8baf9",
      "phone": "+380670660000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-81b99caf-4a35-48f0-b556-d6b555db07d5",
      "error": null,
      "attempted_at": "2026-10-28T10:10:37.053343Z"
    },
    {
      "id": "b1141690-c805-4b2d-a9d5-d6dddab24f6d",
      "challenge_id": "fb4ceb05-745b-4512-a305-e14a4db8baf9",
      "phone": "+380670660000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T10:10:37.052708Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670660000` → **200**

```json
{
  "phone": "+380670660000",
  "audience": "CLIENT",
  "code": "582635",
  "sent_at": "2026-10-28T10:10:37.053125173Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671368477` → **200**

```json
{
  "deliveries": [
    {
      "id": "80aa9c45-9ecc-48bd-9404-66e6654bba88",
      "challenge_id": "1142459b-64fc-4130-9c83-b6e6474ba46b",
      "phone": "+380671368477",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ac72ede8-706c-47b9-8824-b4a1ba9b1850",
      "error": null,
      "attempted_at": "2026-10-28T10:10:36.876149Z"
    }
  ]
}
```

Done: SMS to +380673366455, a call to +380671368477, SMS then a call to +380670660000.

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
  "session_id": "4d45616d-3d74-45d3-b5df-d8a8ae2be5a4",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxMzgsImlhdCI6MTc5MzE4MjIzOCwianRpIjoiNzg3ZTk2OWQtZWZkZC00YzFiLWJlMTktOThiZDc0Mjg4NDQ4Iiwic2lkIjoiNGQ0NTYxNmQtM2Q3NC00NWQzLWI1ZGYtZDhhOGFlMmJlNWE0In0.MhwRFbMBeg7uaYn4b-aqTzGQavHEju0csThiXa6YOqE",
  "access_expires_at": "2026-10-28T10:25:38.273328417Z",
  "refresh_token": "wfc6ITnpOyEgp7A_WMOX6_zlYniYfd6TRPf1nJEZoSE",
  "refresh_expires_at": "2026-10-28T22:10:38.272949704Z",
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
  "session_id": "8257cb4a-abf4-42d5-99b6-1f9a682584f3",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxMzgsImlhdCI6MTc5MzE4MjIzOCwianRpIjoiZDRmZmZjNjQtZTYxZC00YTg2LTk1NGItNTYxNjhlOGMzMzY4Iiwic2lkIjoiODI1N2NiNGEtYWJmNC00MmQ1LTk5YjYtMWY5YTY4MjU4NGYzIn0.OsgcrGBy6YrTEkTYX5S_kNDFdgBUomXEuXtfTH0O_FM",
  "access_expires_at": "2026-10-28T10:25:38.696365491Z",
  "refresh_token": "tlpyhZMCBdMWD6QodEz3nsEFYJExPSF48KReic0jtsY",
  "refresh_expires_at": "2026-10-28T22:10:38.695971507Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be",
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

`POST /api/admin/v1/staff-extensions/6e5fbc98-8252-401a-a330-6d8daea121be` → **200**

```json
{
  "command_id": "2c0226d9-19ed-4686-b791-d25d74da2bf6",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "95b04c4b-e202-43ad-9368-7154affcf3e5",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:10:39.369344Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:10:39.369344Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d0320a86-1b7e-49a9-aac3-4e43919a84f5",
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
  "id": "db64a32d-204e-4ad4-802d-b13b822599a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:39.696892Z",
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
  "command_id": "077c2d3a-bcd8-4e57-ac8d-df50ba7e0736",
  "quote_id": "db64a32d-204e-4ad4-802d-b13b822599a5",
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
    "phone": "+380674195628"
  }
}
```

```json
{
  "id": "de0aa011-5347-40e0-93e5-3d24f8985a99",
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
  "created_at": "2026-10-28T10:10:39.869542Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674195628"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/de0aa011-5347-40e0-93e5-3d24f8985a99/calls` → **201**

```json
{
  "command_id": "9dc79f0d-a931-4951-8152-d28f1a7b59cd",
  "to": "CALLER"
}
```

```json
{
  "id": "aae3aea7-3d7a-409f-af43-bbe83f52ead9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "order_ids": [
    "de0aa011-5347-40e0-93e5-3d24f8985a99"
  ],
  "started_at": "2026-10-28T10:10:40.060213Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/de0aa011-5347-40e0-93e5-3d24f8985a99/calls` → **201**

```json
{
  "command_id": "9dc79f0d-a931-4951-8152-d28f1a7b59cd",
  "to": "CALLER"
}
```

```json
{
  "id": "aae3aea7-3d7a-409f-af43-bbe83f52ead9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "order_ids": [
    "de0aa011-5347-40e0-93e5-3d24f8985a99"
  ],
  "started_at": "2026-10-28T10:10:40.060213Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "aae3aea7-3d7a-409f-af43-bbe83f52ead9",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380674195628",
    "at": "2026-10-28T10:10:40.062267578Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "aae3aea7-3d7a-409f-af43-bbe83f52ead9",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.23608",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "aae3aea7-3d7a-409f-af43-bbe83f52ead9"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "aae3aea7-3d7a-409f-af43-bbe83f52ead9",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=de0aa011-5347-40e0-93e5-3d24f8985a99` → **200**

```json
{
  "calls": [
    {
      "id": "aae3aea7-3d7a-409f-af43-bbe83f52ead9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "order_ids": [
        "de0aa011-5347-40e0-93e5-3d24f8985a99"
      ],
      "started_at": "2026-10-28T10:10:40.060213Z",
      "answered_at": "2026-10-28T10:10:40.459628Z",
      "ended_at": "2026-10-28T10:10:40.473598Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=de0aa011-5347-40e0-93e5-3d24f8985a99` → **200**

```json
{
  "calls": [
    {
      "id": "aae3aea7-3d7a-409f-af43-bbe83f52ead9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "order_ids": [
        "de0aa011-5347-40e0-93e5-3d24f8985a99"
      ],
      "started_at": "2026-10-28T10:10:40.060213Z",
      "answered_at": "2026-10-28T10:10:40.459628Z",
      "ended_at": "2026-10-28T10:10:40.473598Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:10:40.958373Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/de0aa011-5347-40e0-93e5-3d24f8985a99` → **200**

```json
{
  "id": "de0aa011-5347-40e0-93e5-3d24f8985a99",
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
  "created_at": "2026-10-28T10:10:39.869542Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674195628"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/de0aa011-5347-40e0-93e5-3d24f8985a99/cancel` → **200**

```json
{
  "command_id": "bcae523b-43a0-46d3-9140-96489f96e78b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "de0aa011-5347-40e0-93e5-3d24f8985a99",
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
  "created_at": "2026-10-28T10:10:39.869542Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674195628"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
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
  "command_id": "7d1fcc28-c650-4c80-89e7-65770b918fdf",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T10:10:43.199985Z",
  "extension": "101"
}
```

Done: outgoing call aae3aea7-3d7a-409f-af43-bbe83f52ead9 from order de0aa011-5347-40e0-93e5-3d24f8985a99, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630829039",
  "device_ref": "sandbox-15519"
}
```

```json
{
  "challenge_id": "a3c95501-e854-4a85-bbee-0ad90585e1f4",
  "expires_at": "2026-10-28T10:15:43.364463947Z",
  "resend_available_at": "2026-10-28T10:10:44.364463947Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630829039` → **200**

```json
{
  "phone": "+380630829039",
  "audience": "CLIENT",
  "code": "808345",
  "sent_at": "2026-10-28T10:10:43.36608865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3c95501-e854-4a85-bbee-0ad90585e1f4",
  "code": "808345",
  "device_ref": "sandbox-15519"
}
```

```json
{
  "session_id": "1a720e72-e8c8-49aa-85e4-20b86cb85402",
  "subject": {
    "type": "CLIENT",
    "id": "3b35a5f8-85e7-4de4-995b-5cd33ecc4f8d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYjM1YTVmOC04NWU3LTRkZTQtOTk1Yi01Y2QzM2VjYzRmOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMTQzLCJpYXQiOjE3OTMxODIyNDMsImp0aSI6IjljMmY2M2Q1LTdhYjQtNDRiZS1iNDU0LWY3MmM1OTc5ZmQ3NSIsInNpZCI6IjFhNzIwZTcyLWU4YzgtNDlhYS04NWU0LTIwYjg2Y2I4NTQwMiJ9.DPCOTkIRJUrS3sAuaZuMukAVK9UyvpS2ArY9ETVhJaU",
  "access_expires_at": "2026-10-28T10:25:43.550158332Z",
  "refresh_token": "uxJowAn7VRWOAf7QovAZumZwaQrwCWJxZoWov-Q_TMk",
  "refresh_expires_at": "2026-11-27T10:10:43.549860203Z",
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
  "session_id": "680abfe2-0cbe-43fe-9da7-5b73a1006ec6",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNDQsImlhdCI6MTc5MzE4MjI0NCwianRpIjoiM2NjZjI5ZTEtYWU0ZS00MjBlLThiZDctZThjZGM3YWNkNTRiIiwic2lkIjoiNjgwYWJmZTItMGNiZS00M2ZlLTlkYTctNWI3M2ExMDA2ZWM2In0.PCiUzGRE_qnEMADvNKpo65UkLTfZdY0lOH0bP3k5tf8",
  "access_expires_at": "2026-10-28T10:25:44.315699987Z",
  "refresh_token": "TJlb4XHbkv8n8ldYZ4nhC3PtJGYKrbZh8KRN0y_Njeg",
  "refresh_expires_at": "2026-10-28T22:10:44.315339778Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380630829039` → **200**

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
  "correlation_id": "39691ac0-cd76-4e30-b10b-ffa91aa2eda6"
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
  "session_id": "c7457176-8824-4604-9af7-9563fe97fc10",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNDUsImlhdCI6MTc5MzE4MjI0NSwianRpIjoiMjdiNTJlYzktOTdkYi00NWQzLWE2NmQtMDJmY2Y3OGExNjc2Iiwic2lkIjoiYzc0NTcxNzYtODgyNC00NjA0LTlhZjctOTU2M2ZlOTdmYzEwIn0.aQqnWmFZg3KWA-BCfk8G9drwYx_KmihCh3AUauikEeo",
  "access_expires_at": "2026-10-28T10:25:45.077914031Z",
  "refresh_token": "Kctl4I6BYusIKWMI1orqUiUeP1rvuKpK_dQldarF2cU",
  "refresh_expires_at": "2026-10-28T22:10:45.077553037Z",
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
  "command_id": "47944d21-b4d6-4ebf-bbb7-703d3cbfe980",
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
  "changed_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T10:10:45.423102646Z"
}
```

## The rider books the airport for 2026-10-28T13:10:44Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600382024",
  "device_ref": "sandbox-31874"
}
```

```json
{
  "challenge_id": "dda0da23-6b01-497e-bf24-e1e4eb994853",
  "expires_at": "2026-10-28T10:15:45.592075691Z",
  "resend_available_at": "2026-10-28T10:10:46.592075691Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600382024` → **200**

```json
{
  "phone": "+48600382024",
  "audience": "CLIENT",
  "code": "163220",
  "sent_at": "2026-10-28T10:10:45.593639442Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dda0da23-6b01-497e-bf24-e1e4eb994853",
  "code": "163220",
  "device_ref": "sandbox-31874"
}
```

```json
{
  "session_id": "a8674681-ebff-4d17-adce-13280a3541c9",
  "subject": {
    "type": "CLIENT",
    "id": "37467562-c255-4021-acd7-86878414b350"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzQ2NzU2Mi1jMjU1LTQwMjEtYWNkNy04Njg3ODQxNGIzNTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMTQ1LCJpYXQiOjE3OTMxODIyNDUsImp0aSI6ImEwNGQyOGZkLWI5MWEtNDQ5ZS05Y2JmLWVmMTM4Njg3NWU3MSIsInNpZCI6ImE4Njc0NjgxLWViZmYtNGQxNy1hZGNlLTEzMjgwYTM1NDFjOSJ9.yfwDeg9xPGD4zIEIzEHqkRGlIdS_zHBMtqQMN8nkM8U",
  "access_expires_at": "2026-10-28T10:25:45.770961402Z",
  "refresh_token": "a3dMkwomN0jaC_tgTR_KsGYU3ShHaEQGDl-PXItjQ2g",
  "refresh_expires_at": "2026-11-27T10:10:45.770607765Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2917306b-f23b-4cc8-ad89-0396ddb0e201",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T13:10:44Z"
}
```

```json
{
  "id": "7fb5b0eb-d6a5-4564-b49f-66c970365ab0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:45.939291Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:10:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d4b57dbe-f6cf-40c8-911b-f1414ba1df77",
  "quote_id": "7fb5b0eb-d6a5-4564-b49f-66c970365ab0",
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
  "pickup_at": "2026-10-28T13:10:44Z"
}
```

```json
{
  "id": "319914aa-9c9b-4624-827f-df1685af0c61",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "37467562-c255-4021-acd7-86878414b350",
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
  "created_at": "2026-10-28T10:10:46.112554Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:10:44Z",
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
  "device_ref": "sandbox-16226"
}
```

```json
{
  "challenge_id": "b9a1ab90-9645-49b9-8c07-37dc1b7293ee",
  "expires_at": "2026-10-28T10:15:46.297917561Z",
  "resend_available_at": "2026-10-28T10:10:47.297917561Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "753078",
  "sent_at": "2026-10-28T10:10:46.299270196Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9a1ab90-9645-49b9-8c07-37dc1b7293ee",
  "code": "753078",
  "device_ref": "sandbox-16226"
}
```

```json
{
  "session_id": "bdd534c5-662f-4e20-8073-7a77bac6027d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzE0NiwiaWF0IjoxNzkzMTgyMjQ2LCJqdGkiOiI1NzdmZmZiMi1jY2U5LTRmNDItYTExMi0xOGE3YjgyOGZhMzIiLCJzaWQiOiJiZGQ1MzRjNS02NjJmLTRlMjAtODA3My03YTc3YmFjNjAyN2QifQ.moZA5-jLszSVvcA1TcNKk1ZnJcqtXXiz85FreNVuIWg",
  "access_expires_at": "2026-10-28T10:25:46.523819105Z",
  "refresh_token": "AFrS-wdTXwwbauxQNPM68gZxG0un135sLeC0aXyeMZQ",
  "refresh_expires_at": "2026-11-27T10:10:46.523135781Z",
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
  "command_id": "edd50f3a-f481-4e3e-877b-9cd1a35066fe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:46Z",
    "sequence": 1793182246859
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4e79e6fa-eb99-47c9-8574-05f56830270d",
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
  "last_heartbeat_at": "2026-10-28T10:10:46.871564Z",
  "last_location_at": "2026-10-28T10:10:46.871564Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "319914aa-9c9b-4624-827f-df1685af0c61",
      "short_number": 18,
      "pickup_at": "2026-10-28T13:10:44Z",
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

`POST /api/driver/v1/preorders/319914aa-9c9b-4624-827f-df1685af0c61/reserve` → **200**

```json
{
  "command_id": "3b53d38b-9048-455f-a678-afa30181ff9b"
}
```

```json
{
  "id": "45a7ea14-2c2d-4820-ad06-f203b1925a1a",
  "state": "RESERVED",
  "order": {
    "order_id": "319914aa-9c9b-4624-827f-df1685af0c61",
    "short_number": 18,
    "pickup_at": "2026-10-28T13:10:44Z",
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
  "reserved_at": "2026-10-28T10:10:47.193308Z",
  "confirm_from": "2026-10-28T12:40:44Z",
  "confirm_until": "2026-10-28T12:50:44Z",
  "drop_until": "2026-10-28T12:10:44Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "45a7ea14-2c2d-4820-ad06-f203b1925a1a",
      "state": "RESERVED",
      "order": {
        "order_id": "319914aa-9c9b-4624-827f-df1685af0c61",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:10:44Z",
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
      "reserved_at": "2026-10-28T10:10:47.193308Z",
      "confirm_from": "2026-10-28T12:40:44Z",
      "confirm_until": "2026-10-28T12:50:44Z",
      "drop_until": "2026-10-28T12:10:44Z"
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
      "id": "45a7ea14-2c2d-4820-ad06-f203b1925a1a",
      "state": "RESERVED",
      "order": {
        "order_id": "319914aa-9c9b-4624-827f-df1685af0c61",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:10:44Z",
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
      "reserved_at": "2026-10-28T10:10:47.193308Z",
      "confirm_from": "2026-10-28T12:40:44Z",
      "confirm_until": "2026-10-28T12:50:44Z",
      "drop_until": "2026-10-28T12:10:44Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/45a7ea14-2c2d-4820-ad06-f203b1925a1a/confirm` → **409**

```json
{
  "command_id": "2375bc4a-9c22-49d0-9e13-758c9c0b1910"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/45a7ea14-2c2d-4820-ad06-f203b1925a1a/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "48c44f0a-7e77-43ff-b914-037b7c66f75a"
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
  "session_id": "d9306f47-b529-41a7-91fc-40c1db7a64dd",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNDgsImlhdCI6MTc5MzE4MjI0OCwianRpIjoiZjU4ZDA4NWQtY2ZmYi00OTg1LTg5NjctMDExOWFiMWQ5ODQ2Iiwic2lkIjoiZDkzMDZmNDctYjUyOS00MWE3LTkxZmMtNDBjMWRiN2E2NGRkIn0.Y1Wcz9-_3Gwnzj950w8IO1a_6BLiXyg_Ff3NjWel4Sk",
  "access_expires_at": "2026-10-28T10:25:48.112900186Z",
  "refresh_token": "wt1kYVSadt4Rq19z5XhW5tZCJfl9X9lq3Cz1x1Si47I",
  "refresh_expires_at": "2026-10-28T22:10:48.112518407Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/319914aa-9c9b-4624-827f-df1685af0c61` → **200**

```json
{
  "id": "319914aa-9c9b-4624-827f-df1685af0c61",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "37467562-c255-4021-acd7-86878414b350",
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
  "created_at": "2026-10-28T10:10:46.112554Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T13:10:44Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "45a7ea14-2c2d-4820-ad06-f203b1925a1a",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T10:10:47.193308Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/319914aa-9c9b-4624-827f-df1685af0c61/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T10:10:46.113477Z",
      "actor": {
        "type": "CLIENT",
        "id": "37467562-c255-4021-acd7-86878414b350",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "319914aa-9c9b-4624-827f-df1685af0c61",
        "preorder": true,
        "quote_id": "7fb5b0eb-d6a5-4564-b49f-66c970365ab0",
        "pickup_at": "2026-10-28T13:10:44Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "b7326ddf-dede-42b1-810e-86f18008c785"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T10:10:47.194318Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "319914aa-9c9b-4624-827f-df1685af0c61",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "45a7ea14-2c2d-4820-ad06-f203b1925a1a"
      },
      "correlation_id": "0e345782-7202-4717-9f5f-81b5aaf4a342"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 319914aa-9c9b-4624-827f-df1685af0c61, reservation 45a7ea14-2c2d-4820-ad06-f203b1925a1a.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30193"
}
```

```json
{
  "challenge_id": "1cc8061c-0e31-43d2-bc63-9123f8cc5e64",
  "expires_at": "2026-10-28T10:15:48.616784697Z",
  "resend_available_at": "2026-10-28T10:10:49.616784697Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "900864",
  "sent_at": "2026-10-28T10:10:48.618446439Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cc8061c-0e31-43d2-bc63-9123f8cc5e64",
  "code": "900864",
  "device_ref": "sandbox-30193"
}
```

```json
{
  "session_id": "a6d444ff-58cd-4f50-9d16-6e723c47c803",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzE0OCwiaWF0IjoxNzkzMTgyMjQ4LCJqdGkiOiIwNTYzZjYxYy1kMmFkLTRjNmUtYjliOS0yNjEzYzNmN2M0NDkiLCJzaWQiOiJhNmQ0NDRmZi01OGNkLTRmNTAtOWQxNi02ZTcyM2M0N2M4MDMifQ.lEqdzutYSyfayWrNDJLyqGbCOLqDgqdpsntOEeZZGRw",
  "access_expires_at": "2026-10-28T10:25:48.799041863Z",
  "refresh_token": "YFVqFOhdmhUzV0nvwRhMROMpOBhp93or34oPXIJDym8",
  "refresh_expires_at": "2026-11-27T10:10:48.798724475Z",
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
  "command_id": "b975373e-83b1-4c9d-86be-533a5d7c3434",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:49Z",
    "sequence": 1793182249130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "604209d7-0b5b-43a5-8c1c-7ba0363298b5",
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
  "last_heartbeat_at": "2026-10-28T10:10:49.142507Z",
  "last_location_at": "2026-10-28T10:10:49.142507Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674419234",
  "device_ref": "sandbox-29968"
}
```

```json
{
  "challenge_id": "6d52a38d-8c3a-4029-bec7-1f97d318fcb8",
  "expires_at": "2026-10-28T10:15:49.306580135Z",
  "resend_available_at": "2026-10-28T10:10:50.306580135Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674419234` → **200**

```json
{
  "phone": "+380674419234",
  "audience": "CLIENT",
  "code": "796266",
  "sent_at": "2026-10-28T10:10:49.308284458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d52a38d-8c3a-4029-bec7-1f97d318fcb8",
  "code": "796266",
  "device_ref": "sandbox-29968"
}
```

```json
{
  "session_id": "8c384660-f1fa-4500-9b0e-a1c9eda8e39e",
  "subject": {
    "type": "CLIENT",
    "id": "1a33c375-9725-4536-92ef-e4bcf0187f04"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYTMzYzM3NS05NzI1LTQ1MzYtOTJlZi1lNGJjZjAxODdmMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMTQ5LCJpYXQiOjE3OTMxODIyNDksImp0aSI6IjljOTY5OWYzLTcxZmMtNDc2NS04ZjM2LTc0YWNlYTk0YTkyMCIsInNpZCI6IjhjMzg0NjYwLWYxZmEtNDUwMC05YjBlLWExYzllZGE4ZTM5ZSJ9.uN4bpdm67INrqvtQMlRrtcGPdD7wggt6R_qDkfxH0Nk",
  "access_expires_at": "2026-10-28T10:25:49.483124364Z",
  "refresh_token": "m6lvLlcjUvfqoKnJyQliXOJXyM0AMD2AcOz7-_vAjyw",
  "refresh_expires_at": "2026-11-27T10:10:49.482774383Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5df5b328-33c5-48c9-b66a-0ce7292baa6e",
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
  "id": "47d455b5-f454-4b3f-a517-29466b1a09c5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:15:49.649018Z",
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
  "command_id": "4c0bee21-c37d-46aa-89ab-d5705484c135",
  "quote_id": "47d455b5-f454-4b3f-a517-29466b1a09c5",
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
  "id": "90d3fc8f-e605-4c65-9665-3938c8bbcf1b",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a33c375-9725-4536-92ef-e4bcf0187f04",
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
  "created_at": "2026-10-28T10:10:49.822857Z",
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
    "id": "0c26d5a0-227a-4293-8f8b-478e1986af8e",
    "order_id": "90d3fc8f-e605-4c65-9665-3938c8bbcf1b",
    "expires_at": "2026-10-28T10:11:04.825022Z",
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

`POST /api/driver/v1/offers/0c26d5a0-227a-4293-8f8b-478e1986af8e/accept` → **200**

```json
{
  "command_id": "e030b039-231a-4619-a031-5e262a097503"
}
```

```json
{
  "id": "83f25169-2cec-425e-bd4e-4e6b317f131d",
  "order_id": "90d3fc8f-e605-4c65-9665-3938c8bbcf1b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a619cee0-1178-4b08-bdb5-a7084198475d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a619cee0-1178-4b08-bdb5-a7084198475d",
  "order_id": "90d3fc8f-e605-4c65-9665-3938c8bbcf1b",
  "assignment_id": "83f25169-2cec-425e-bd4e-4e6b317f131d",
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

`POST /api/driver/v1/work-sessions/604209d7-0b5b-43a5-8c1c-7ba0363298b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:50Z",
    "sequence": 1793182250482
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "604209d7-0b5b-43a5-8c1c-7ba0363298b5",
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
  "last_heartbeat_at": "2026-10-28T10:10:50.495635Z",
  "last_location_at": "2026-10-28T10:10:50.495635Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a619cee0-1178-4b08-bdb5-a7084198475d",
  "order_id": "90d3fc8f-e605-4c65-9665-3938c8bbcf1b",
  "assignment_id": "83f25169-2cec-425e-bd4e-4e6b317f131d",
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

`POST /api/driver/v1/trips/a619cee0-1178-4b08-bdb5-a7084198475d/arrive` → **200**

```json
{
  "command_id": "2546a545-4327-437d-91e9-232a3cac7a2c",
  "expected_version": 0
}
```

```json
{
  "id": "a619cee0-1178-4b08-bdb5-a7084198475d",
  "order_id": "90d3fc8f-e605-4c65-9665-3938c8bbcf1b",
  "assignment_id": "83f25169-2cec-425e-bd4e-4e6b317f131d",
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
  "arrived_at": "2026-10-28T10:10:50.828688Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a619cee0-1178-4b08-bdb5-a7084198475d/start` → **200**

```json
{
  "command_id": "848f6d6f-a01e-4551-8ade-3ca62cc3c057",
  "expected_version": 1
}
```

```json
{
  "id": "a619cee0-1178-4b08-bdb5-a7084198475d",
  "order_id": "90d3fc8f-e605-4c65-9665-3938c8bbcf1b",
  "assignment_id": "83f25169-2cec-425e-bd4e-4e6b317f131d",
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
  "arrived_at": "2026-10-28T10:10:50.828688Z",
  "started_at": "2026-10-28T10:10:51.005201Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/604209d7-0b5b-43a5-8c1c-7ba0363298b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:10:51Z",
    "sequence": 1793182251171
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "604209d7-0b5b-43a5-8c1c-7ba0363298b5",
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
  "last_heartbeat_at": "2026-10-28T10:10:51.183861Z",
  "last_location_at": "2026-10-28T10:10:51.183861Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/a619cee0-1178-4b08-bdb5-a7084198475d/complete` → **200**

```json
{
  "command_id": "e350ac10-2d33-496f-a75f-fa72f4aceb96",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:10:51Z",
  "cash_received": true
}
```

```json
{
  "id": "a619cee0-1178-4b08-bdb5-a7084198475d",
  "order_id": "90d3fc8f-e605-4c65-9665-3938c8bbcf1b",
  "assignment_id": "83f25169-2cec-425e-bd4e-4e6b317f131d",
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
  "arrived_at": "2026-10-28T10:10:50.828688Z",
  "started_at": "2026-10-28T10:10:51.005201Z",
  "completed_at": "2026-10-28T10:10:51.360872Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/90d3fc8f-e605-4c65-9665-3938c8bbcf1b/rating` → **200**

```json
{
  "command_id": "a1925be2-5ffe-4e69-bd04-d9566a0ab1d0",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "90d3fc8f-e605-4c65-9665-3938c8bbcf1b",
  "score": 5,
  "created_at": "2026-10-28T10:10:51.541222391Z"
}
```

`POST /api/driver/v1/orders/90d3fc8f-e605-4c65-9665-3938c8bbcf1b/rating` → **200**

```json
{
  "command_id": "5aa6842d-c03b-42f2-94d1-4261396d8660",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "90d3fc8f-e605-4c65-9665-3938c8bbcf1b",
  "score": 4,
  "created_at": "2026-10-28T10:10:51.707123724Z"
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
  "session_id": "cc8d8e86-9e58-4b28-84b5-0f3fab6f374f",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNTIsImlhdCI6MTc5MzE4MjI1MiwianRpIjoiNmU5ZWQ5MjEtOGRiYi00N2EzLWI4YTAtZmJlOGUxMjdmZDczIiwic2lkIjoiY2M4ZDhlODYtOWU1OC00YjI4LTg0YjUtMGYzZmFiNmYzNzRmIn0.mqa2s6_VptEkumtjQ7jAqVJ-kCYYfSnM3mj1QKG2E7w",
  "access_expires_at": "2026-10-28T10:25:52.302155411Z",
  "refresh_token": "ZfC7xOnb2udIlYu_d-Of-KPNH9HeUJkBzlq-Bc0-umY",
  "refresh_expires_at": "2026-10-28T22:10:52.301852329Z",
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
  "session_id": "f724a0a1-dbde-4156-94db-3ab431d37893",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNTIsImlhdCI6MTc5MzE4MjI1MiwianRpIjoiZDkwN2Y3MDktNTg0My00MjllLTk3MWItZjQ1ZDljNmJlYjIyIiwic2lkIjoiZjcyNGEwYTEtZGJkZS00MTU2LTk0ZGItM2FiNDMxZDM3ODkzIn0.9RcYLfsZQmCwP9rj--aTZrvUALkZjgbm9qxhyBI0cp0",
  "access_expires_at": "2026-10-28T10:25:52.722410754Z",
  "refresh_token": "a_9sg-TCG-dH9k7OCHuwIY6Fl8laLLWaPzeUqatROuY",
  "refresh_expires_at": "2026-10-28T22:10:52.721907647Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/90d3fc8f-e605-4c65-9665-3938c8bbcf1b/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "90d3fc8f-e605-4c65-9665-3938c8bbcf1b",
      "author_type": "RIDER",
      "author_id": "1a33c375-9725-4536-92ef-e4bcf0187f04",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T10:10:51.541222Z"
    },
    {
      "order_id": "90d3fc8f-e605-4c65-9665-3938c8bbcf1b",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "1a33c375-9725-4536-92ef-e4bcf0187f04",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T10:10:51.707124Z"
    }
  ]
}
```

Done: ratings for order 90d3fc8f-e605-4c65-9665-3938c8bbcf1b.

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
  "session_id": "f5ca40df-4c13-4975-96f8-e5af13bc03d8",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNTMsImlhdCI6MTc5MzE4MjI1MywianRpIjoiNDVkZjcxYWEtMmY2ZS00ODhmLWE1N2YtMDEzNzg0MDRiZjYwIiwic2lkIjoiZjVjYTQwZGYtNGMxMy00OTc1LTk2ZjgtZTVhZjEzYmMwM2Q4In0.jSEZ5SYPXOswzCr1-LDd6t9U8APfAXPzuDnIweW8SCU",
  "access_expires_at": "2026-10-28T10:25:53.321973457Z",
  "refresh_token": "UT_6S0qP2DhWXBVw1jvc5IPe1ff-Yq8F3Xg7kQDQPq0",
  "refresh_expires_at": "2026-10-28T22:10:53.321641185Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "3f7964ce-71b4-4609-a262-f7ac128066e1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "3941111e-4a2b-4408-b85a-2819c0466a4f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:10:53.499976Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3941111e-4a2b-4408-b85a-2819c0466a4f` → **200**

```json
{
  "id": "3941111e-4a2b-4408-b85a-2819c0466a4f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:10:53.499976Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3941111e-4a2b-4408-b85a-2819c0466a4f` → **200**

```json
{
  "id": "3941111e-4a2b-4408-b85a-2819c0466a4f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:10:53.499976Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3941111e-4a2b-4408-b85a-2819c0466a4f` → **200**

```json
{
  "id": "3941111e-4a2b-4408-b85a-2819c0466a4f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:10:53.499976Z",
  "ready_at": "2026-10-28T10:10:55.967865Z",
  "expires_at": "2026-10-29T10:10:55.967865Z"
}
```

`GET /api/admin/v1/reports/exports/3941111e-4a2b-4408-b85a-2819c0466a4f/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6ab82493-b729-44d8-b139-7eb8233c5508",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "5920f537-474f-4783-a3db-f36a10e7497d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:10:56.207045Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5920f537-474f-4783-a3db-f36a10e7497d` → **200**

```json
{
  "id": "5920f537-474f-4783-a3db-f36a10e7497d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:10:56.207045Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5920f537-474f-4783-a3db-f36a10e7497d` → **200**

```json
{
  "id": "5920f537-474f-4783-a3db-f36a10e7497d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:10:56.207045Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5920f537-474f-4783-a3db-f36a10e7497d` → **200**

```json
{
  "id": "5920f537-474f-4783-a3db-f36a10e7497d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:10:56.207045Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5920f537-474f-4783-a3db-f36a10e7497d` → **200**

```json
{
  "id": "5920f537-474f-4783-a3db-f36a10e7497d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:10:56.207045Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5920f537-474f-4783-a3db-f36a10e7497d` → **200**

```json
{
  "id": "5920f537-474f-4783-a3db-f36a10e7497d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:10:56.207045Z",
  "ready_at": "2026-10-28T10:11:00.974848Z",
  "expires_at": "2026-10-29T10:11:00.974848Z"
}
```

`GET /api/admin/v1/reports/exports/5920f537-474f-4783-a3db-f36a10e7497d/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/e519d2cb-9905-4204-8284-80bc3cfe681a` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/e519d2cb-9905-4204-8284-80bc3cfe681a",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8ce46f69-adb8-4638-a34f-ae3f4c75ba74"
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
  "device_ref": "sandbox-26844"
}
```

```json
{
  "challenge_id": "f7c1df39-bbe3-4f4f-8a63-9e84799060e9",
  "expires_at": "2026-10-28T10:16:01.426632068Z",
  "resend_available_at": "2026-10-28T10:11:02.426632068Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "676396",
  "sent_at": "2026-10-28T10:11:01.428617326Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f7c1df39-bbe3-4f4f-8a63-9e84799060e9",
  "code": "676396",
  "device_ref": "sandbox-26844"
}
```

```json
{
  "session_id": "f2320b0b-8d66-42fa-bd0c-8ac3aa1541f4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzE2MSwiaWF0IjoxNzkzMTgyMjYxLCJqdGkiOiI4ZjcxOTgxOS01MmZkLTRhZWItYjY1MC1hNjgzYjUyZDE3N2QiLCJzaWQiOiJmMjMyMGIwYi04ZDY2LTQyZmEtYmQwYy04YWMzYWExNTQxZjQifQ.66BIV5QhyorX6IxXhXOJhhAJlRanDTaNhFNUmsdT4X4",
  "access_expires_at": "2026-10-28T10:26:01.613485944Z",
  "refresh_token": "bQh4ZV122vzP_0BOwkUz__6OXczqu6J66NYIh5tnSFw",
  "refresh_expires_at": "2026-11-27T10:11:01.61297781Z",
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
  "command_id": "be62b098-7c28-4a2f-9677-630cb5976ae5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:11:02Z",
    "sequence": 1793182262994
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f2e95bd8-8598-47b3-8a58-ea45b5100c1f",
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
  "last_heartbeat_at": "2026-10-28T10:11:02.111367Z",
  "last_location_at": "2026-10-28T10:11:02.111367Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "afb5d477-97d3-46fc-ad89-a6ce5791f831",
  "points": [
    {
      "sequence": 1793182264282,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:10:04Z"
    },
    {
      "sequence": 1793182264288,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:11:04Z"
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
  "session_id": "e7d867a9-1597-4714-972a-70feec6a3e10",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNjQsImlhdCI6MTc5MzE4MjI2NCwianRpIjoiOThlZTI2OWMtN2E5NC00ZjRlLWI2ZWUtYTdkMGEwYTIwOTE3Iiwic2lkIjoiZTdkODY3YTktMTU5Ny00NzE0LTk3MmEtNzBmZWVjNmEzZTEwIn0.di5P41Uxv99EoyrsYdwUoObqry5HZ5y3-rC8ydX71d0",
  "access_expires_at": "2026-10-28T10:26:04.761294113Z",
  "refresh_token": "z1Dd-B-YchLTLIRXSxxZI8pdznpZqTnm7fsP1nj1X2w",
  "refresh_expires_at": "2026-10-28T22:11:04.760654574Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "f6948f74-027a-4afc-b583-69fbf4f3ec9d",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T10:11:04Z",
        "track_point_id": "f835e560-3a73-4e06-a8e7-3d5dd10af2a3",
        "work_session_id": "f2e95bd8-8598-47b3-8a58-ea45b5100c1f"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T10:11:04Z",
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

`POST /api/admin/v1/driver-risk-flags/f6948f74-027a-4afc-b583-69fbf4f3ec9d/confirm` → **200**

```json
{
  "command_id": "67c084d7-ec77-45b5-9eed-ee8440ad488b",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "f6948f74-027a-4afc-b583-69fbf4f3ec9d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T10:11:04Z",
    "track_point_id": "f835e560-3a73-4e06-a8e7-3d5dd10af2a3",
    "work_session_id": "f2e95bd8-8598-47b3-8a58-ea45b5100c1f"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T10:11:04Z",
  "reason": null,
  "reviewed_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "reviewed_at": "2026-10-28T10:11:05.302478Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/f6948f74-027a-4afc-b583-69fbf4f3ec9d/dismiss` → **409**

```json
{
  "command_id": "dd15afb2-4206-464a-987f-e55398c8209a",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/f6948f74-027a-4afc-b583-69fbf4f3ec9d/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6429cb87-d4d7-4dc8-89cd-8359817e1eac"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "8917a0c6-3d62-4be3-a966-324a45f0e569",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "f9a24171-d571-4ace-8b77-e05f408c2698",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "raised_at": "2026-10-28T10:11:05.654024Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/f9a24171-d571-4ace-8b77-e05f408c2698/dismiss` → **200**

```json
{
  "command_id": "8fef6b7a-3979-42c3-8fb3-8988055e6a42",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "f9a24171-d571-4ace-8b77-e05f408c2698",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "raised_at": "2026-10-28T10:11:05.654024Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "reviewed_at": "2026-10-28T10:11:05.823049Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "6985863a-2d52-42d3-98b5-98d4b3e5af94",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "f6948f74-027a-4afc-b583-69fbf4f3ec9d"
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
      "actor_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:11:06.006081Z"
    }
  ]
}
```

Done: flag f6948f74-027a-4afc-b583-69fbf4f3ec9d confirmed, suspension named it, driver reinstated.

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
  "session_id": "88961208-a294-470c-b176-4404dbd055b8",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNjYsImlhdCI6MTc5MzE4MjI2NiwianRpIjoiMWRlNjE2MDAtYzk0Mi00MjMxLWExZWQtOWRiNTMwNjE2YWRjIiwic2lkIjoiODg5NjEyMDgtYTI5NC00NzBjLWIxNzYtNDQwNGRiZDA1NWI4In0.myicdMlcL65dRwj9ztHe88J5FD5Qeg6hJcPOPilXjOk",
  "access_expires_at": "2026-10-28T10:26:06.6133602Z",
  "refresh_token": "OAL7XQgXLBusZct6gb0UQMRQQWzTNlumjEJpHbU6B80",
  "refresh_expires_at": "2026-10-28T22:11:06.612849902Z",
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
      "actor_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:11:06.006081Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "5e2e3e3e-6ff5-4ceb-b6db-e5b238f438a6",
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
  "session_id": "f2e95bd8-8598-47b3-8a58-ea45b5100c1f",
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
  "last_heartbeat_at": "2026-10-28T10:11:02.111367Z",
  "last_location_at": "2026-10-28T10:11:02.111367Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f2e95bd8-8598-47b3-8a58-ea45b5100c1f/close` → **200**

```json
{
  "command_id": "fc36f02b-c868-40f5-afd0-e1bd37555aba",
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
  "session_id": "755b4e8e-ee0f-4779-bf0e-9c4c07e68894",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNjcsImlhdCI6MTc5MzE4MjI2NywianRpIjoiYWNmMDQxODItNzBhNi00YTU4LTg2MTktMGFjNmYyZGJlZjYxIiwic2lkIjoiNzU1YjRlOGUtZWUwZi00Nzc5LWJmMGUtOWM0YzA3ZTY4ODk0In0.jiB0IL6PafIVtZWgxNj-sshR1MoUo4vrA7NGuXtpHn4",
  "access_expires_at": "2026-10-28T10:26:07.72064439Z",
  "refresh_token": "L_5TBTDlyogyhG-jkFlcnD-tInozsgOZBKU0CRtscds",
  "refresh_expires_at": "2026-10-28T22:11:07.720068375Z",
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
  "command_id": "ff1298cc-21ae-460a-8ab9-ea5555534cfb",
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
  "changed_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:11:08.059304Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "ff1298cc-21ae-460a-8ab9-ea5555534cfb",
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
  "changed_by": "6e5fbc98-8252-401a-a330-6d8daea121be",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:11:08.059304Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48508737023",
  "device_ref": "sandbox-27631"
}
```

```json
{
  "challenge_id": "4445620b-61a4-4b25-8f5d-c0be7e8ea836",
  "expires_at": "2026-10-28T10:16:08.395156015Z",
  "resend_available_at": "2026-10-28T10:11:09.395156015Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48508737023` → **200**

```json
{
  "phone": "+48508737023",
  "audience": "CLIENT",
  "code": "866281",
  "sent_at": "2026-10-28T10:11:08.397430834Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4445620b-61a4-4b25-8f5d-c0be7e8ea836",
  "code": "866281",
  "device_ref": "sandbox-27631"
}
```

```json
{
  "session_id": "ae0c4703-78a1-4839-ae4c-676149637487",
  "subject": {
    "type": "CLIENT",
    "id": "8acf9493-17ce-42ad-9762-38b5d818f8c9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YWNmOTQ5My0xN2NlLTQyYWQtOTc2Mi0zOGI1ZDgxOGY4YzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMTY4LCJpYXQiOjE3OTMxODIyNjgsImp0aSI6ImVmYjBmM2IzLTFjOTctNDY1Zi1hYzlkLWNjZDkyOTVlNzNiOSIsInNpZCI6ImFlMGM0NzAzLTc4YTEtNDgzOS1hZTRjLTY3NjE0OTYzNzQ4NyJ9.sV2NLz_cskTqslrEBm-Z_yvMWbRv9KaYlNf8yD9eTX4",
  "access_expires_at": "2026-10-28T10:26:08.578558647Z",
  "refresh_token": "u_fRY_4DNYH5Zmu6E_8Mw5DvYKGQgQP9kr0k5d5v1vE",
  "refresh_expires_at": "2026-11-27T10:11:08.578069979Z",
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
  "correlation_id": "4cb1b06c-7d49-4316-90fa-c307a2b95578"
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
  "device_ref": "sandbox-11578"
}
```

```json
{
  "challenge_id": "8c7aa0f3-8b0e-494c-9521-97933743e3d0",
  "expires_at": "2026-10-28T10:16:09.07175568Z",
  "resend_available_at": "2026-10-28T10:11:10.07175568Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "940761",
  "sent_at": "2026-10-28T10:11:09.073272572Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c7aa0f3-8b0e-494c-9521-97933743e3d0",
  "code": "940761",
  "device_ref": "sandbox-11578"
}
```

```json
{
  "session_id": "1222ddd6-3e13-48ff-b582-7e5083dff7b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzE2OSwiaWF0IjoxNzkzMTgyMjY5LCJqdGkiOiJlNjhjMWNiZS1iZGY1LTQ2NTEtYTdiZi03MjY3OTQ3MTA0YjUiLCJzaWQiOiIxMjIyZGRkNi0zZTEzLTQ4ZmYtYjU4Mi03ZTUwODNkZmY3YjMifQ.B4_FG7_5tb7bgY5CQdzwlPGTWEEcfRuIu-0YsAyQupQ",
  "access_expires_at": "2026-10-28T10:26:09.249871793Z",
  "refresh_token": "j3KC4Iz4YClMv4dgZ0SEMBgUTNToGBCwkNN_7JDZYiI",
  "refresh_expires_at": "2026-11-27T10:11:09.24937248Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4e79e6fa-eb99-47c9-8574-05f56830270d",
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
  "last_heartbeat_at": "2026-10-28T10:10:46.871564Z",
  "last_location_at": "2026-10-28T10:10:46.871564Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4e79e6fa-eb99-47c9-8574-05f56830270d/handover` → **200**

```json
{
  "command_id": "cdc68942-8576-4607-8774-fd1cf5a7c1c6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4e79e6fa-eb99-47c9-8574-05f56830270d",
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
  "last_heartbeat_at": "2026-10-28T10:10:46.871564Z",
  "last_location_at": "2026-10-28T10:10:46.871564Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4e79e6fa-eb99-47c9-8574-05f56830270d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:11:09Z",
    "sequence": 1793182269728
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4e79e6fa-eb99-47c9-8574-05f56830270d",
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
  "last_heartbeat_at": "2026-10-28T10:11:09.740808Z",
  "last_location_at": "2026-10-28T10:11:09.740808Z",
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
  "session_id": "4e79e6fa-eb99-47c9-8574-05f56830270d",
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
  "last_heartbeat_at": "2026-10-28T10:11:09.740808Z",
  "last_location_at": "2026-10-28T10:11:09.740808Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4e79e6fa-eb99-47c9-8574-05f56830270d/close` → **200**

```json
{
  "command_id": "a16c1e6c-4062-4836-9284-74271a00fad2",
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
  "correlation_id": "84bbc0e0-1b1c-4ae7-b2a5-6bc8adf36aff"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674852111",
  "device_ref": "sandbox-2057"
}
```

```json
{
  "challenge_id": "6288e72f-a45b-41c7-b199-0f9ed26e7f9b",
  "expires_at": "2026-10-28T10:16:10.556309933Z",
  "resend_available_at": "2026-10-28T10:11:11.556309933Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674852111` → **200**

```json
{
  "phone": "+380674852111",
  "audience": "CLIENT",
  "code": "359389",
  "sent_at": "2026-10-28T10:11:10.557852552Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6288e72f-a45b-41c7-b199-0f9ed26e7f9b",
  "code": "359389",
  "device_ref": "sandbox-2057"
}
```

```json
{
  "session_id": "3f0f0bb0-542e-4de4-8a07-e3c41adaf329",
  "subject": {
    "type": "CLIENT",
    "id": "4ca220cd-167e-4fee-abb5-a54d35c1183c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2EyMjBjZC0xNjdlLTRmZWUtYWJiNS1hNTRkMzVjMTE4M2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzMTcwLCJpYXQiOjE3OTMxODIyNzAsImp0aSI6ImEyNzZkYWFkLWRjZjMtNGU5Yy05Nzk5LWIzNDk2ZjAyOTNkYiIsInNpZCI6IjNmMGYwYmIwLTU0MmUtNGRlNC04YTA3LWUzYzQxYWRhZjMyOSJ9.d64ZWRuK5gc9U1tdvY7wuZW071Qyl0SUTfTjqshheeQ",
  "access_expires_at": "2026-10-28T10:26:10.735302129Z",
  "refresh_token": "uXElq_gGqswP-JXlPxpQ916NAPevxmcV5fOYa5-UMhc",
  "refresh_expires_at": "2026-11-27T10:11:10.734805077Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "b18edf6c-b6a2-441e-bd7a-19d928666a90",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b85e4f1c-7773-491b-bfe2-9ca3d3b70799",
  "upload_path": "/api/rider/v1/uploads/b85e4f1c-7773-491b-bfe2-9ca3d3b70799",
  "expires_at": "2026-10-28T10:26:10.900894092Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/b85e4f1c-7773-491b-bfe2-9ca3d3b70799` → **200**

```json
{
  "file_id": "b85e4f1c-7773-491b-bfe2-9ca3d3b70799",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "793b2d8c-8e93-4730-b91d-8b9e0b236a31",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "b85e4f1c-7773-491b-bfe2-9ca3d3b70799"
  ]
}
```

```json
{
  "id": "c621d423-7b9d-4f75-8485-18cdbd3a6fd6",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "4ca220cd-167e-4fee-abb5-a54d35c1183c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:11:11.085399Z",
  "updated_at": "2026-10-28T10:11:11.085399Z",
  "messages": [
    {
      "id": "db558178-7dfe-4578-96f8-c18521ecda43",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "4ca220cd-167e-4fee-abb5-a54d35c1183c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:11:11.086677Z",
      "attachments": [
        {
          "file_id": "b85e4f1c-7773-491b-bfe2-9ca3d3b70799",
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
  "session_id": "5ba573c1-227c-46a7-92a1-1ab4166103e4",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNzEsImlhdCI6MTc5MzE4MjI3MSwianRpIjoiNTc4NDUxMTAtYTY3MC00NDRmLWIxNGQtNGUzNzE3ZjcyZGE4Iiwic2lkIjoiNWJhNTczYzEtMjI3Yy00NmE3LTkyYTEtMWFiNDE2NjEwM2U0In0.dDolZL-YvWdrscOaOV4wUARLK_wf4yX_ZXNWiVarVm8",
  "access_expires_at": "2026-10-28T10:26:11.532082483Z",
  "refresh_token": "uukFuX_vmGBrdUwRkWEpY25QpPvNc2Adak7Dt9TBT8w",
  "refresh_expires_at": "2026-10-28T22:11:11.531641881Z",
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
  "session_id": "3f2149e4-68f4-4525-a97b-2b02a1d6b8dc",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNzEsImlhdCI6MTc5MzE4MjI3MSwianRpIjoiMDAzMTkwZWEtMDQ4My00NTVhLTgyNzAtMGQzYmNhNDFiMTRjIiwic2lkIjoiM2YyMTQ5ZTQtNjhmNC00NTI1LWE5N2ItMmIwMmExZDZiOGRjIn0.8_urf0Usl_Mo-g6B3eMa0MOHIYxxTegmUeburEwM7Ag",
  "access_expires_at": "2026-10-28T10:26:11.967526112Z",
  "refresh_token": "GoO3RkfN5MSfJBRm54f44Gdddqx8BiBVqEi_-onSYOo",
  "refresh_expires_at": "2026-10-28T22:11:11.967106023Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/c621d423-7b9d-4f75-8485-18cdbd3a6fd6/attachments/b85e4f1c-7773-491b-bfe2-9ca3d3b70799` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "a94f2f4c-a203-43b1-8c8c-f04600a5b5bd",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "861edfa1-e439-47ef-9891-612acfd67c74",
  "upload_path": "/api/operator/v1/uploads/861edfa1-e439-47ef-9891-612acfd67c74",
  "expires_at": "2026-10-28T10:26:12.145626498Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/861edfa1-e439-47ef-9891-612acfd67c74` → **200**

```json
{
  "file_id": "861edfa1-e439-47ef-9891-612acfd67c74",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/c621d423-7b9d-4f75-8485-18cdbd3a6fd6` → **200**

```json
{
  "id": "c621d423-7b9d-4f75-8485-18cdbd3a6fd6",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "4ca220cd-167e-4fee-abb5-a54d35c1183c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:11:11.085399Z",
  "updated_at": "2026-10-28T10:11:11.085399Z",
  "messages": [
    {
      "id": "db558178-7dfe-4578-96f8-c18521ecda43",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "4ca220cd-167e-4fee-abb5-a54d35c1183c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:11:11.086677Z",
      "attachments": [
        {
          "file_id": "b85e4f1c-7773-491b-bfe2-9ca3d3b70799",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/c621d423-7b9d-4f75-8485-18cdbd3a6fd6/comments` → **200**

```json
{
  "command_id": "58ba5e0a-cd4d-4267-a861-8d10c8ad85bb",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "861edfa1-e439-47ef-9891-612acfd67c74"
  ]
}
```

```json
{
  "id": "c621d423-7b9d-4f75-8485-18cdbd3a6fd6",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "4ca220cd-167e-4fee-abb5-a54d35c1183c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:11:11.085399Z",
  "updated_at": "2026-10-28T10:11:12.507755Z",
  "messages": [
    {
      "id": "db558178-7dfe-4578-96f8-c18521ecda43",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "4ca220cd-167e-4fee-abb5-a54d35c1183c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:11:11.086677Z",
      "attachments": [
        {
          "file_id": "b85e4f1c-7773-491b-bfe2-9ca3d3b70799",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "0b667989-9961-42db-9e16-08190dcee929",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:11:12.507503Z",
      "attachments": [
        {
          "file_id": "861edfa1-e439-47ef-9891-612acfd67c74",
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

`GET /api/rider/v1/support/cases/c621d423-7b9d-4f75-8485-18cdbd3a6fd6` → **200**

```json
{
  "id": "c621d423-7b9d-4f75-8485-18cdbd3a6fd6",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "4ca220cd-167e-4fee-abb5-a54d35c1183c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:11:11.085399Z",
  "updated_at": "2026-10-28T10:11:12.507755Z",
  "messages": [
    {
      "id": "db558178-7dfe-4578-96f8-c18521ecda43",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "4ca220cd-167e-4fee-abb5-a54d35c1183c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:11:11.086677Z",
      "attachments": [
        {
          "file_id": "b85e4f1c-7773-491b-bfe2-9ca3d3b70799",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "0b667989-9961-42db-9e16-08190dcee929",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:11:12.507503Z",
      "attachments": [
        {
          "file_id": "861edfa1-e439-47ef-9891-612acfd67c74",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/c621d423-7b9d-4f75-8485-18cdbd3a6fd6/attachments/861edfa1-e439-47ef-9891-612acfd67c74` → **200**

Done: support case c621d423-7b9d-4f75-8485-18cdbd3a6fd6, rider attachment b85e4f1c-7773-491b-bfe2-9ca3d3b70799, operator attachment 861edfa1-e439-47ef-9891-612acfd67c74.

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
  "session_id": "c7115f94-2459-4dc4-abae-634ba9a259a2",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNzMsImlhdCI6MTc5MzE4MjI3MywianRpIjoiNGZkODM1MGItOTY0MC00NTE2LThkODktNGM4ZDE0YmFjNDdkIiwic2lkIjoiYzcxMTVmOTQtMjQ1OS00ZGM0LWFiYWUtNjM0YmE5YTI1OWEyIn0.rEoMUUinv3kFaFPh2cWLNsnuGBpadvajRnSpl2bs-xI",
  "access_expires_at": "2026-10-28T10:26:13.126452155Z",
  "refresh_token": "VcwHxiROvbumgAGsTLAjesG9VomcI0aoxUbtdkpCOxI",
  "refresh_expires_at": "2026-10-28T22:11:13.126062445Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4948"
}
```

```json
{
  "challenge_id": "979ed42d-86bd-4ab8-93b4-22ece90af0e0",
  "expires_at": "2026-10-28T10:16:13.29382793Z",
  "resend_available_at": "2026-10-28T10:11:14.29382793Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "402461",
  "sent_at": "2026-10-28T10:11:13.295315947Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "979ed42d-86bd-4ab8-93b4-22ece90af0e0",
  "code": "402461",
  "device_ref": "sandbox-4948"
}
```

```json
{
  "session_id": "763c2cd3-37e8-4436-a5ab-021f34013873",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzE3MywiaWF0IjoxNzkzMTgyMjczLCJqdGkiOiJiYWE1MDkyNS00YWY0LTRmOTAtODdiZC0zNzQ5MWY4ODg2MGEiLCJzaWQiOiI3NjNjMmNkMy0zN2U4LTQ0MzYtYTVhYi0wMjFmMzQwMTM4NzMifQ.pITaTxqqsG_EzWL8JXF1JNnxIrp0fxP_TeiYHO-GNAE",
  "access_expires_at": "2026-10-28T10:26:13.476146641Z",
  "refresh_token": "dRkiBYnYntFyqj-Ml0AteJyTmZ8aoCxX6aflyAT0f3w",
  "refresh_expires_at": "2026-11-27T10:11:13.475756603Z",
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
      "actor_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:11:06.006081Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "6e5fbc98-8252-401a-a330-6d8daea121be",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T10:11:06.953519Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "a97c0a94-09da-41b9-b4ff-563b9b94fcd5",
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
  "device_ref": "sandbox-24106"
}
```

```json
{
  "challenge_id": "e826b51e-970a-46f7-90b0-b13779efe091",
  "expires_at": "2026-10-28T10:16:14.146065463Z",
  "resend_available_at": "2026-10-28T10:11:15.146065463Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "772635",
  "sent_at": "2026-10-28T10:11:14.147558968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e826b51e-970a-46f7-90b0-b13779efe091",
  "code": "772635",
  "device_ref": "sandbox-24106"
}
```

```json
{
  "session_id": "abebee2b-a893-4e1d-94f5-fe10e255b40e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MzE3NCwiaWF0IjoxNzkzMTgyMjc0LCJqdGkiOiI2MzYwM2NjNS1iYjViLTQwMjYtYjBmNC00ZWUxNzNlNzA2NGMiLCJzaWQiOiJhYmViZWUyYi1hODkzLTRlMWQtOTRmNS1mZTEwZTI1NWI0MGUifQ.wlUIKMti79LrWU2BwedGsFK2fW2DLPhg1mzv77rd9BA",
  "access_expires_at": "2026-10-28T10:26:14.324448495Z",
  "refresh_token": "ERGr1KxaMLWMCbzF29jUBbhmqqd0w19YdGHmizt-IJg",
  "refresh_expires_at": "2026-11-27T10:11:14.323862394Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "604209d7-0b5b-43a5-8c1c-7ba0363298b5",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:10:51.183861Z",
  "last_location_at": "2026-10-28T10:10:51.183861Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/604209d7-0b5b-43a5-8c1c-7ba0363298b5/handover` → **200**

```json
{
  "command_id": "1465d046-afd9-4e73-9559-2738a7defff4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "604209d7-0b5b-43a5-8c1c-7ba0363298b5",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:10:51.183861Z",
  "last_location_at": "2026-10-28T10:10:51.183861Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/604209d7-0b5b-43a5-8c1c-7ba0363298b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:11:14Z",
    "sequence": 1793182274824
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "604209d7-0b5b-43a5-8c1c-7ba0363298b5",
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
  "last_heartbeat_at": "2026-10-28T10:11:14.840214Z",
  "last_location_at": "2026-10-28T10:11:14.840214Z",
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
  "command_id": "d74c1f5d-7ac4-4884-b9ae-9578c4748268",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:11:15Z",
    "sequence": 1793182275165
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a272e2a-0441-4795-87c6-476abeda3e1c",
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
  "last_heartbeat_at": "2026-10-28T10:11:15.177792Z",
  "last_location_at": "2026-10-28T10:11:15.177792Z",
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
  "session_id": "15aebcee-3195-4df3-a002-4a036c8dd20e",
  "subject": {
    "type": "STAFF",
    "id": "6e5fbc98-8252-401a-a330-6d8daea121be"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTVmYmM5OC04MjUyLTQwMWEtYTMzMC02ZDhkYWVhMTIxYmUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODMxNzUsImlhdCI6MTc5MzE4MjI3NSwianRpIjoiZjg3MDA4NjAtNDhmMy00OWRiLWJhN2ItOTk4MzI2ZDgxNGE3Iiwic2lkIjoiMTVhZWJjZWUtMzE5NS00ZGYzLWEwMDItNGEwMzZjOGRkMjBlIn0.ZX-hmJt3P2qi3qsgxfHwdJvM93urPV55UV11DT-J9YA",
  "access_expires_at": "2026-10-28T10:26:15.607915928Z",
  "refresh_token": "KE_X55UmHG2L0bD9qAKuPDd_JWG3m3wsLnDE5Cwo_es",
  "refresh_expires_at": "2026-10-28T22:11:15.607483798Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7d3ac139-0852-4fd9-ae08-edd6206c1992",
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
  "id": "23a3d04a-2494-4321-ace5-40b9c07d9b04",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:16:15.777635Z",
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
  "command_id": "8ebe88d5-d592-447d-b544-7c631226a8e8",
  "quote_id": "23a3d04a-2494-4321-ace5-40b9c07d9b04",
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
  "id": "67e1e66b-951b-4937-9fec-c1e8439124b9",
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
  "created_at": "2026-10-28T10:11:15.95199Z",
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
    "id": "c932b2c1-a33f-442c-876d-71631deddd3d",
    "order_id": "67e1e66b-951b-4937-9fec-c1e8439124b9",
    "expires_at": "2026-10-28T10:11:30.955946Z",
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

`POST /api/driver/v1/offers/c932b2c1-a33f-442c-876d-71631deddd3d/accept` → **200**

```json
{
  "command_id": "8cc931f2-be2c-472b-8cb9-dea8bc714227"
}
```

```json
{
  "id": "7db2678c-22fb-416b-bbb6-55dbf3e4f396",
  "order_id": "67e1e66b-951b-4937-9fec-c1e8439124b9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2c8f1401-3c3a-49fd-bc4a-8a55d569a864",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2c8f1401-3c3a-49fd-bc4a-8a55d569a864",
  "order_id": "67e1e66b-951b-4937-9fec-c1e8439124b9",
  "assignment_id": "7db2678c-22fb-416b-bbb6-55dbf3e4f396",
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

`POST /api/driver/v1/work-sessions/2a272e2a-0441-4795-87c6-476abeda3e1c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:11:16Z",
    "sequence": 1793182276802
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a272e2a-0441-4795-87c6-476abeda3e1c",
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
  "last_heartbeat_at": "2026-10-28T10:11:16.815286Z",
  "last_location_at": "2026-10-28T10:11:16.815286Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2c8f1401-3c3a-49fd-bc4a-8a55d569a864/arrive` → **200**

```json
{
  "command_id": "f5569d53-e4d8-404f-81c0-4a06f3818916",
  "expected_version": 0
}
```

```json
{
  "id": "2c8f1401-3c3a-49fd-bc4a-8a55d569a864",
  "order_id": "67e1e66b-951b-4937-9fec-c1e8439124b9",
  "assignment_id": "7db2678c-22fb-416b-bbb6-55dbf3e4f396",
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
  "arrived_at": "2026-10-28T10:11:16.989415Z",
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

`POST /api/driver/v1/trips/2c8f1401-3c3a-49fd-bc4a-8a55d569a864/start` → **200**

```json
{
  "command_id": "bc22ab60-0591-4fbb-b481-048d2e57aedd",
  "expected_version": 1
}
```

```json
{
  "id": "2c8f1401-3c3a-49fd-bc4a-8a55d569a864",
  "order_id": "67e1e66b-951b-4937-9fec-c1e8439124b9",
  "assignment_id": "7db2678c-22fb-416b-bbb6-55dbf3e4f396",
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
  "arrived_at": "2026-10-28T10:11:16.989415Z",
  "started_at": "2026-10-28T10:11:17.165685Z",
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

`POST /api/driver/v1/trips/2c8f1401-3c3a-49fd-bc4a-8a55d569a864/complete` → **200**

```json
{
  "command_id": "03296e17-6c6d-4083-9641-242690f0ada6",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:11:17Z",
  "cash_received": true
}
```

```json
{
  "id": "2c8f1401-3c3a-49fd-bc4a-8a55d569a864",
  "order_id": "67e1e66b-951b-4937-9fec-c1e8439124b9",
  "assignment_id": "7db2678c-22fb-416b-bbb6-55dbf3e4f396",
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
  "arrived_at": "2026-10-28T10:11:16.989415Z",
  "started_at": "2026-10-28T10:11:17.165685Z",
  "completed_at": "2026-10-28T10:11:17.346613Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/67e1e66b-951b-4937-9fec-c1e8439124b9` → **200**

```json
{
  "id": "67e1e66b-951b-4937-9fec-c1e8439124b9",
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
    "id": "7db2678c-22fb-416b-bbb6-55dbf3e4f396",
    "order_id": "67e1e66b-951b-4937-9fec-c1e8439124b9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2c8f1401-3c3a-49fd-bc4a-8a55d569a864",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:11:15.95199Z",
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
  "session_id": "604209d7-0b5b-43a5-8c1c-7ba0363298b5",
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
  "last_heartbeat_at": "2026-10-28T10:11:14.840214Z",
  "last_location_at": "2026-10-28T10:11:14.840214Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/604209d7-0b5b-43a5-8c1c-7ba0363298b5/close` → **200**

```json
{
  "command_id": "8b72d518-0d36-43c1-bd9e-c83fdffe6bcd",
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
  "session_id": "2a272e2a-0441-4795-87c6-476abeda3e1c",
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
  "last_heartbeat_at": "2026-10-28T10:11:16.815286Z",
  "last_location_at": "2026-10-28T10:11:16.815286Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2a272e2a-0441-4795-87c6-476abeda3e1c/close` → **200**

```json
{
  "command_id": "30832614-af43-472e-a33b-acc281717d1c",
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

Done: terminal order 67e1e66b-951b-4937-9fec-c1e8439124b9 by Andrii (5a000000-0000-4000-8000-000000000403).
