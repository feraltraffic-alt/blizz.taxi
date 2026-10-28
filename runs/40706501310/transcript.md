# Sandbox transcript (2026-10-28T14:30:45Z, 9e4921b)

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
  "correlation_id": "d575ecd6-68a2-425c-97ca-0b30eeffe5ee"
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
  "session_id": "4c39cf9f-9669-47cb-9e15-f87d66d39ef7",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg3NTMsImlhdCI6MTc5MzE5Nzg1MywianRpIjoiODQ3OWE5NjktZGNkMy00YzM5LWFjNWMtNDE2Mjg5OWE1MGYzIiwic2lkIjoiNGMzOWNmOWYtOTY2OS00N2NiLTllMTUtZjg3ZDY2ZDM5ZWY3In0.JdnKO_q1mQLBmpC7e5QPN_yHuPut5vCoyUiIpy-J-Zg",
  "access_expires_at": "2026-10-28T14:45:53.058783071Z",
  "refresh_token": "Ybyy5n7t70Df7IxKup2f2-kq4fMoAfKTcsmuUV_HelA",
  "refresh_expires_at": "2026-10-29T02:30:53.056524225Z",
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
  "session_id": "e5dc516c-6c25-45eb-abda-0bcbee8b2123",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg3NTQsImlhdCI6MTc5MzE5Nzg1NCwianRpIjoiMDJlY2I1MmQtNzMzNC00YjRmLTgzMWQtYjUwNTlkZWM2ZmQ3Iiwic2lkIjoiZTVkYzUxNmMtNmMyNS00NWViLWFiZGEtMGJjYmVlOGIyMTIzIn0.MFyt70r16tfrLPxDpTznlsRZ9ljiCmM50uFKXe9sW0s",
  "access_expires_at": "2026-10-28T14:45:54.786686339Z",
  "refresh_token": "gOhBMt6zsB_OhAWOR6ZWp6Io8KbHucsGC4OGcRa0FwM",
  "refresh_expires_at": "2026-10-29T02:30:54.785592353Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "1bbaa653-76a1-4bbe-a007-02f0bec77488",
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
  "id": "9622d70c-bdff-4cf2-9e64-c246ae8908c5",
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
  "created_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "created_at": "2026-10-28T14:30:55.108412Z",
  "updated_at": "2026-10-28T14:30:55.108412Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633917974",
  "device_ref": "sandbox-28391"
}
```

```json
{
  "challenge_id": "f2f75c3e-5eaf-44ce-b024-4b2a274c1626",
  "expires_at": "2026-10-28T14:35:55.41762811Z",
  "resend_available_at": "2026-10-28T14:30:56.41762811Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633917974` → **200**

```json
{
  "phone": "+380633917974",
  "audience": "CLIENT",
  "code": "449187",
  "sent_at": "2026-10-28T14:30:55.428359488Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f2f75c3e-5eaf-44ce-b024-4b2a274c1626",
  "code": "449187",
  "device_ref": "sandbox-28391"
}
```

```json
{
  "session_id": "f7de6172-fced-4d72-8b06-7ed717f79ee1",
  "subject": {
    "type": "CLIENT",
    "id": "748fb97b-acc7-4448-922e-c42a4b62b299"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NDhmYjk3Yi1hY2M3LTQ0NDgtOTIyZS1jNDJhNGI2MmIyOTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NzU1LCJpYXQiOjE3OTMxOTc4NTUsImp0aSI6ImU3MjQ5NmI3LWVkNWUtNGFiMC05MjIwLTk4OTY4NGU1ZjdkOSIsInNpZCI6ImY3ZGU2MTcyLWZjZWQtNGQ3Mi04YjA2LTdlZDcxN2Y3OWVlMSJ9.JflYBXfwCCIxqer1OivGRrrKgzXfpCHx0HpNqVyg9e8",
  "access_expires_at": "2026-10-28T14:45:55.759497912Z",
  "refresh_token": "IR71y9KIlMDELhM-gymgur6-US1rAmPc5dU-x_PEZyQ",
  "refresh_expires_at": "2026-11-27T14:30:55.758505445Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633917974` → **200**

```json
{
  "client_id": "748fb97b-acc7-4448-922e-c42a4b62b299"
}
```

`POST /api/admin/v1/rider-wallets/748fb97b-acc7-4448-922e-c42a4b62b299/top-ups` → **201**

```json
{
  "command_id": "b1b0da2f-2ddf-41a2-becc-d953fad122f2",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "748fb97b-acc7-4448-922e-c42a4b62b299",
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
      "id": "80e753cb-fdbc-429f-b7b0-e6753e840e35",
      "at": "2026-10-28T14:30:56.332366Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "462fae68-a0f0-47b8-bf1f-5148f3297a81",
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
  "id": "1e895280-3877-4844-ba50-4071d8e22d1d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:35:56.733147Z",
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
      "id": "9622d70c-bdff-4cf2-9e64-c246ae8908c5",
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
  "device_ref": "sandbox-4630"
}
```

```json
{
  "challenge_id": "3af271f9-f848-41f0-880c-a8b85acfac6d",
  "expires_at": "2026-10-28T14:35:57.080011789Z",
  "resend_available_at": "2026-10-28T14:30:58.080011789Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "345170",
  "sent_at": "2026-10-28T14:30:57.084096412Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3af271f9-f848-41f0-880c-a8b85acfac6d",
  "code": "345170",
  "device_ref": "sandbox-4630"
}
```

```json
{
  "session_id": "1df661f0-5756-4ac5-ade1-497903a170be",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODc1NywiaWF0IjoxNzkzMTk3ODU3LCJqdGkiOiI4MzJhZmY0NS1mMjdlLTQ5NWYtOWNjYS00Zjk0ZmEwMmVmOWUiLCJzaWQiOiIxZGY2NjFmMC01NzU2LTRhYzUtYWRlMS00OTc5MDNhMTcwYmUifQ.i7UCOvg1lVRx2Ew7jyOBAoWmNpAx42qKUqvvsWbEOTs",
  "access_expires_at": "2026-10-28T14:45:57.386030387Z",
  "refresh_token": "Uq-kTbPVWDYjcPQwfUsiV3hXcaqLMh3aCPzwZDTg9Co",
  "refresh_expires_at": "2026-11-27T14:30:57.385006648Z",
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
  "command_id": "9c4096c7-9980-4889-9492-281040cf33d3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:30:57Z",
    "sequence": 1793197857953
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "21414571-128b-486e-9257-c688761d7100",
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
  "last_heartbeat_at": "2026-10-28T14:30:58.007555Z",
  "last_location_at": "2026-10-28T14:30:58.007555Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9c1ee209-172f-41fa-9305-05691aa42ba7",
  "quote_id": "1e895280-3877-4844-ba50-4071d8e22d1d",
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
  "id": "2c700f19-5f29-4adf-bd68-80c147943dc9",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "748fb97b-acc7-4448-922e-c42a4b62b299",
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
  "created_at": "2026-10-28T14:30:58.356445Z",
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
  "client_id": "748fb97b-acc7-4448-922e-c42a4b62b299",
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
      "id": "80e753cb-fdbc-429f-b7b0-e6753e840e35",
      "at": "2026-10-28T14:30:56.332366Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
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
    "id": "6e5603ba-6762-469f-ad22-ebd44287d6d3",
    "order_id": "2c700f19-5f29-4adf-bd68-80c147943dc9",
    "expires_at": "2026-10-28T14:31:13.373136Z",
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

`POST /api/driver/v1/offers/6e5603ba-6762-469f-ad22-ebd44287d6d3/accept` → **200**

```json
{
  "command_id": "60daeb6b-f9fc-4095-b331-3a852a3b585a"
}
```

```json
{
  "id": "85ce058f-856b-4e8b-8847-a812384523f5",
  "order_id": "2c700f19-5f29-4adf-bd68-80c147943dc9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d21a2125-8e52-46a7-82e2-fb9478125b3d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d21a2125-8e52-46a7-82e2-fb9478125b3d",
  "order_id": "2c700f19-5f29-4adf-bd68-80c147943dc9",
  "assignment_id": "85ce058f-856b-4e8b-8847-a812384523f5",
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

`POST /api/driver/v1/work-sessions/21414571-128b-486e-9257-c688761d7100/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:30:59Z",
    "sequence": 1793197859844
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "21414571-128b-486e-9257-c688761d7100",
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
  "last_heartbeat_at": "2026-10-28T14:30:59.874053Z",
  "last_location_at": "2026-10-28T14:30:59.874053Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d21a2125-8e52-46a7-82e2-fb9478125b3d/arrive` → **200**

```json
{
  "command_id": "bc85a7fe-2c65-44da-b934-d46fff77d9d9",
  "expected_version": 0
}
```

```json
{
  "id": "d21a2125-8e52-46a7-82e2-fb9478125b3d",
  "order_id": "2c700f19-5f29-4adf-bd68-80c147943dc9",
  "assignment_id": "85ce058f-856b-4e8b-8847-a812384523f5",
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
  "arrived_at": "2026-10-28T14:31:00.1761Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d21a2125-8e52-46a7-82e2-fb9478125b3d/start` → **200**

```json
{
  "command_id": "f8be5736-98f5-40ae-948e-b6a43ff6aeaa",
  "expected_version": 1
}
```

```json
{
  "id": "d21a2125-8e52-46a7-82e2-fb9478125b3d",
  "order_id": "2c700f19-5f29-4adf-bd68-80c147943dc9",
  "assignment_id": "85ce058f-856b-4e8b-8847-a812384523f5",
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
  "arrived_at": "2026-10-28T14:31:00.1761Z",
  "started_at": "2026-10-28T14:31:00.534431Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/d21a2125-8e52-46a7-82e2-fb9478125b3d/complete` → **200**

```json
{
  "command_id": "865e0e0a-45f9-406f-a753-0f6072ea4fef",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:31:00Z",
  "cash_received": true
}
```

```json
{
  "id": "d21a2125-8e52-46a7-82e2-fb9478125b3d",
  "order_id": "2c700f19-5f29-4adf-bd68-80c147943dc9",
  "assignment_id": "85ce058f-856b-4e8b-8847-a812384523f5",
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
  "arrived_at": "2026-10-28T14:31:00.1761Z",
  "started_at": "2026-10-28T14:31:00.534431Z",
  "completed_at": "2026-10-28T14:31:00.865535Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "748fb97b-acc7-4448-922e-c42a4b62b299",
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
      "id": "38fc55de-4bec-4b22-ac10-8d3bf3fff278",
      "at": "2026-10-28T14:31:01.696447Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "2c700f19-5f29-4adf-bd68-80c147943dc9"
    },
    {
      "id": "80e753cb-fdbc-429f-b7b0-e6753e840e35",
      "at": "2026-10-28T14:30:56.332366Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/9622d70c-bdff-4cf2-9e64-c246ae8908c5/archive` → **200**

```json
{
  "command_id": "93ad617b-6089-46dc-9895-c3afc35fa187",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "9622d70c-bdff-4cf2-9e64-c246ae8908c5",
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
  "created_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "created_at": "2026-10-28T14:30:55.108412Z",
  "updated_at": "2026-10-28T14:31:04.45857Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "21414571-128b-486e-9257-c688761d7100",
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
  "last_heartbeat_at": "2026-10-28T14:30:59.874053Z",
  "last_location_at": "2026-10-28T14:30:59.874053Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/21414571-128b-486e-9257-c688761d7100/close` → **200**

```json
{
  "command_id": "aaa3ff68-3bf5-4ef1-986a-41e2f41d6e4a",
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

Done: order 2c700f19-5f29-4adf-bd68-80c147943dc9.

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
  "session_id": "08b6530f-404c-4550-b295-cdd4aabc1229",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg3NjUsImlhdCI6MTc5MzE5Nzg2NSwianRpIjoiOTU4M2I5NGUtYjE3ZC00ZTY2LWFiMmItNWNjOTE0YjBkNDE5Iiwic2lkIjoiMDhiNjUzMGYtNDA0Yy00NTUwLWIyOTUtY2RkNGFhYmMxMjI5In0.U3T0EzIDhDQimFvENvG_vkCexb02rZLSVeDQZvr3bfM",
  "access_expires_at": "2026-10-28T14:46:05.676942966Z",
  "refresh_token": "FPjZ_9OsynT2qGqXmSTBQAV5QN2b7HZ_OGDHZtjyjwU",
  "refresh_expires_at": "2026-10-29T02:31:05.675877803Z",
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
  "command_id": "b823eb30-00f9-404a-ae87-299750900398",
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
  "session_id": "1b7c9d22-cbc7-4711-bf88-72a51251c2b7",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg3NjYsImlhdCI6MTc5MzE5Nzg2NiwianRpIjoiMWEwODY1ZTAtYzljZS00OWExLTljYmYtZTFlZmMwYTc1NWMyIiwic2lkIjoiMWI3YzlkMjItY2JjNy00NzExLWJmODgtNzJhNTEyNTFjMmI3In0.aK2gz_V3wQJO-C66W12JcqsGHhqqq7eLrFtrOMnnxkg",
  "access_expires_at": "2026-10-28T14:46:06.861614783Z",
  "refresh_token": "CGgsEhH-_mSYoxCYdVq7JWos3WJwiHg6Of2bjmn2g-k",
  "refresh_expires_at": "2026-10-29T02:31:06.86079453Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.86218432",
    "linkedid": "1730052700.86218432",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670916838"
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
    "id": "1730052700.86218432",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "10174146-9a63-4b88-9a3c-1f77a9ecd4f3",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670916838",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:31:07.142663Z",
      "answered_at": null,
      "ended_at": "2026-10-28T14:31:07.170232Z",
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
    "id": "1730052600.54943225",
    "linkedid": "1730052600.54943225",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670916838"
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
      "id": "f07179d9-f3bc-427c-b726-4c4efa6fe580",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670916838",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:31:07.493734Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/f07179d9-f3bc-427c-b726-4c4efa6fe580/answer` → **200**

```json
{
  "command_id": "db558875-9951-41b2-9907-3c5ed477b818"
}
```

```json
{
  "id": "f07179d9-f3bc-427c-b726-4c4efa6fe580",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670916838",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "order_ids": [],
  "started_at": "2026-10-28T14:31:07.493734Z",
  "answered_at": "2026-10-28T14:31:07.814727Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.54943225",
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
    "id": "1730052600.54943225",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f07179d9-f3bc-427c-b726-4c4efa6fe580",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670916838",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_ids": [],
      "started_at": "2026-10-28T14:31:07.493734Z",
      "answered_at": "2026-10-28T14:31:07.814727Z",
      "ended_at": "2026-10-28T14:31:08.117706Z",
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
      "id": "f07179d9-f3bc-427c-b726-4c4efa6fe580",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670916838",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_ids": [],
      "started_at": "2026-10-28T14:31:07.493734Z",
      "answered_at": "2026-10-28T14:31:07.814727Z",
      "ended_at": "2026-10-28T14:31:08.117706Z",
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
      "id": "f07179d9-f3bc-427c-b726-4c4efa6fe580",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670916838",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_ids": [],
      "started_at": "2026-10-28T14:31:07.493734Z",
      "answered_at": "2026-10-28T14:31:07.814727Z",
      "ended_at": "2026-10-28T14:31:08.117706Z",
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
      "id": "f07179d9-f3bc-427c-b726-4c4efa6fe580",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670916838",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_ids": [],
      "started_at": "2026-10-28T14:31:07.493734Z",
      "answered_at": "2026-10-28T14:31:07.814727Z",
      "ended_at": "2026-10-28T14:31:08.117706Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:31:14.455842Z"
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
      "id": "f07179d9-f3bc-427c-b726-4c4efa6fe580",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670916838",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_ids": [],
      "started_at": "2026-10-28T14:31:07.493734Z",
      "answered_at": "2026-10-28T14:31:07.814727Z",
      "ended_at": "2026-10-28T14:31:08.117706Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:31:14.455842Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/f07179d9-f3bc-427c-b726-4c4efa6fe580/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/f07179d9-f3bc-427c-b726-4c4efa6fe580/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=f07179d9-f3bc-427c-b726-4c4efa6fe580` → **200**

```json
{
  "changes": [
    {
      "id": "00819733-e9b2-4e01-a89c-90c41afb337c",
      "occurred_at": "2026-10-28T14:31:15.589459Z",
      "actor_type": "STAFF",
      "actor_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f07179d9-f3bc-427c-b726-4c4efa6fe580",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"48a6b7f1-2240-4253-947e-a77da066b6ef\", \"order_ids\": []}",
      "correlation_id": "407df5b6-e039-4f35-a544-5e3a8f7de0dd"
    },
    {
      "id": "7ee552c3-0245-447c-b1a2-460043236838",
      "occurred_at": "2026-10-28T14:31:15.550491Z",
      "actor_type": "STAFF",
      "actor_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f07179d9-f3bc-427c-b726-4c4efa6fe580",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"48a6b7f1-2240-4253-947e-a77da066b6ef\", \"order_ids\": []}",
      "correlation_id": "33b2557f-1923-47db-852a-4b3153f37d29"
    }
  ]
}
```

Done: call f07179d9-f3bc-427c-b726-4c4efa6fe580 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2082"
}
```

```json
{
  "challenge_id": "c73ba14b-c4c6-4c62-b2fc-ad3146bf479f",
  "expires_at": "2026-10-28T14:36:15.920536561Z",
  "resend_available_at": "2026-10-28T14:31:16.920536561Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "228144",
  "sent_at": "2026-10-28T14:31:15.924691869Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c73ba14b-c4c6-4c62-b2fc-ad3146bf479f",
  "code": "228144",
  "device_ref": "sandbox-2082"
}
```

```json
{
  "session_id": "bf67f7f0-d36b-47dd-9023-d960488c8358",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODc3NiwiaWF0IjoxNzkzMTk3ODc2LCJqdGkiOiJiMDgyNzVlZS1mY2RmLTQwYTEtYjFjMS1mYjMzNWM1ZDMxNzAiLCJzaWQiOiJiZjY3ZjdmMC1kMzZiLTQ3ZGQtOTAyMy1kOTYwNDg4YzgzNTgifQ.2tlvzApslugjQ1POYIxRMWF9nyUfJhA6LkPFw-xzJdg",
  "access_expires_at": "2026-10-28T14:46:16.225884Z",
  "refresh_token": "_nVD9IdffLu9fi30uBmisnmT-JUp4ZNu601VToqbkkc",
  "refresh_expires_at": "2026-11-27T14:31:16.22509561Z",
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
  "command_id": "0c4f4b25-3915-48d9-ba10-d03f338da0a5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:31:16Z",
    "sequence": 1793197876761
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f69bc76d-3c54-4b89-827d-6af0c8946b20",
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
  "last_heartbeat_at": "2026-10-28T14:31:16.783863Z",
  "last_location_at": "2026-10-28T14:31:16.783863Z",
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
  "session_id": "65d5910d-7ba7-4a6d-b799-5f2364a86550",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg3NzcsImlhdCI6MTc5MzE5Nzg3NywianRpIjoiNTQyNjJhZTgtZjk0ZS00NDZmLTkxYzQtYjNlYzdiZjQ0YzI3Iiwic2lkIjoiNjVkNTkxMGQtN2JhNy00YTZkLWI3OTktNWYyMzY0YTg2NTUwIn0.Jg6nVP-vmics01UUYNgbxzUfAoezhDw0WUDt6L2wIF8",
  "access_expires_at": "2026-10-28T14:46:17.39743373Z",
  "refresh_token": "eovW1yfct1KjYxN8paFc2NIRh8p_3F0kXOy7CpDLWPQ",
  "refresh_expires_at": "2026-10-29T02:31:17.396822521Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "89242a98-28df-4a4a-abb3-a169228aef1d",
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
  "id": "ad8ead35-32c3-4514-a054-63cb7377010f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:36:17.681156Z",
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
  "command_id": "5dcbc060-4115-42d0-8721-4d29a0e2c9b2",
  "quote_id": "ad8ead35-32c3-4514-a054-63cb7377010f",
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
    "phone": "+380678980051"
  }
}
```

```json
{
  "id": "2fcd4e45-5906-4eee-ae50-5539400bb3ab",
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
  "created_at": "2026-10-28T14:31:17.983717Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678980051"
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
    "id": "9b19381e-a6bb-4ec4-904c-275a42a67489",
    "order_id": "2fcd4e45-5906-4eee-ae50-5539400bb3ab",
    "expires_at": "2026-10-28T14:31:32.989852Z",
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

`POST /api/driver/v1/offers/9b19381e-a6bb-4ec4-904c-275a42a67489/accept` → **200**

```json
{
  "command_id": "bd74857e-850f-4221-b4f5-d33596886b1f"
}
```

```json
{
  "id": "35a8194b-a2ac-4f22-b934-a5948504aaa7",
  "order_id": "2fcd4e45-5906-4eee-ae50-5539400bb3ab",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "34281f29-bb9d-4406-9265-70d89078ce48",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678980051` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678980051` → **200**

```json
[
  {
    "phone": "+380678980051",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:31:19.644287068Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678980051` → **200**

```json
[
  {
    "phone": "+380678980051",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:31:19.644287068Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678980051` → **200**

```json
[
  {
    "phone": "+380678980051",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:31:19.644287068Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "34281f29-bb9d-4406-9265-70d89078ce48",
  "order_id": "2fcd4e45-5906-4eee-ae50-5539400bb3ab",
  "assignment_id": "35a8194b-a2ac-4f22-b934-a5948504aaa7",
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
    "phone": "+380678980051"
  }
}
```

`POST /api/driver/v1/work-sessions/f69bc76d-3c54-4b89-827d-6af0c8946b20/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:31:20Z",
    "sequence": 1793197880214
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f69bc76d-3c54-4b89-827d-6af0c8946b20",
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
  "last_heartbeat_at": "2026-10-28T14:31:20.236489Z",
  "last_location_at": "2026-10-28T14:31:20.236489Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/34281f29-bb9d-4406-9265-70d89078ce48/arrive` → **200**

```json
{
  "command_id": "03732e60-779e-474b-af0b-394fa7902b1f",
  "expected_version": 0
}
```

```json
{
  "id": "34281f29-bb9d-4406-9265-70d89078ce48",
  "order_id": "2fcd4e45-5906-4eee-ae50-5539400bb3ab",
  "assignment_id": "35a8194b-a2ac-4f22-b934-a5948504aaa7",
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
  "arrived_at": "2026-10-28T14:31:20.516077Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678980051"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678980051` → **200**

```json
[
  {
    "phone": "+380678980051",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:31:19.644287068Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678980051` → **200**

```json
[
  {
    "phone": "+380678980051",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:31:19.644287068Z"
  },
  {
    "phone": "+380678980051",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:31:21.654038853Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678980051` → **200**

```json
[
  {
    "phone": "+380678980051",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:31:19.644287068Z"
  },
  {
    "phone": "+380678980051",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:31:21.654038853Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678980051` → **200**

```json
[
  {
    "phone": "+380678980051",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:31:19.644287068Z"
  },
  {
    "phone": "+380678980051",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:31:21.654038853Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/34281f29-bb9d-4406-9265-70d89078ce48/start` → **200**

```json
{
  "command_id": "09442b01-c09a-4eb0-b4db-4b1d55f28f1f",
  "expected_version": 1
}
```

```json
{
  "id": "34281f29-bb9d-4406-9265-70d89078ce48",
  "order_id": "2fcd4e45-5906-4eee-ae50-5539400bb3ab",
  "assignment_id": "35a8194b-a2ac-4f22-b934-a5948504aaa7",
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
  "arrived_at": "2026-10-28T14:31:20.516077Z",
  "started_at": "2026-10-28T14:31:21.932497Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678980051"
  }
}
```

`POST /api/driver/v1/trips/34281f29-bb9d-4406-9265-70d89078ce48/complete` → **200**

```json
{
  "command_id": "d425e110-f52a-4a97-bbff-be0e8621e9e5",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:31:22Z",
  "cash_received": true
}
```

```json
{
  "id": "34281f29-bb9d-4406-9265-70d89078ce48",
  "order_id": "2fcd4e45-5906-4eee-ae50-5539400bb3ab",
  "assignment_id": "35a8194b-a2ac-4f22-b934-a5948504aaa7",
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
  "arrived_at": "2026-10-28T14:31:20.516077Z",
  "started_at": "2026-10-28T14:31:21.932497Z",
  "completed_at": "2026-10-28T14:31:22.288875Z",
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
  "session_id": "f69bc76d-3c54-4b89-827d-6af0c8946b20",
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
  "last_heartbeat_at": "2026-10-28T14:31:20.236489Z",
  "last_location_at": "2026-10-28T14:31:20.236489Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f69bc76d-3c54-4b89-827d-6af0c8946b20/close` → **200**

```json
{
  "command_id": "dc74c4be-faba-41f7-8a5f-301cd04481dd",
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
  "phone": "+380635721380",
  "device_ref": "sandbox-24660"
}
```

```json
{
  "challenge_id": "1b9aa4d4-7046-477a-9635-0465c87b706e",
  "expires_at": "2026-10-28T14:36:23.146956229Z",
  "resend_available_at": "2026-10-28T14:31:24.146956229Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635721380` → **200**

```json
{
  "phone": "+380635721380",
  "audience": "CLIENT",
  "code": "577545",
  "sent_at": "2026-10-28T14:31:23.151340204Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b9aa4d4-7046-477a-9635-0465c87b706e",
  "code": "577545",
  "device_ref": "sandbox-24660"
}
```

```json
{
  "session_id": "c60fb741-17e6-43a0-9213-7891b08d748e",
  "subject": {
    "type": "CLIENT",
    "id": "09ce6a04-180e-442b-a913-f1ed15de3648"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWNlNmEwNC0xODBlLTQ0MmItYTkxMy1mMWVkMTVkZTM2NDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NzgzLCJpYXQiOjE3OTMxOTc4ODMsImp0aSI6IjViOWEwYTg1LWMwNDctNDQ0MS05ZTNiLTJmNDQ5NDQ1NDViNSIsInNpZCI6ImM2MGZiNzQxLTE3ZTYtNDNhMC05MjEzLTc4OTFiMDhkNzQ4ZSJ9.Y-qyUHidtI9LasnDvYHi8GF_o3PSB8W_cpiekT23ejA",
  "access_expires_at": "2026-10-28T14:46:23.447278498Z",
  "refresh_token": "YSFMdyhsidS6DcyIfhlHplxHjIz01q0tjeqOLHxMc0I",
  "refresh_expires_at": "2026-11-27T14:31:23.446549481Z",
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
        "ru": "Передумал ехать",
        "pl": "Zmiana planów",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "en": "Wrong address",
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
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
  "device_ref": "sandbox-28330"
}
```

```json
{
  "challenge_id": "14335ccd-1017-4383-8d42-1033cf94bdd9",
  "expires_at": "2026-10-28T14:36:23.990768412Z",
  "resend_available_at": "2026-10-28T14:31:24.990768412Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "772724",
  "sent_at": "2026-10-28T14:31:23.994556242Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14335ccd-1017-4383-8d42-1033cf94bdd9",
  "code": "772724",
  "device_ref": "sandbox-28330"
}
```

```json
{
  "session_id": "a082aea4-9579-48a5-8a98-88f07a50ceba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODc4NCwiaWF0IjoxNzkzMTk3ODg0LCJqdGkiOiJlYjdiMmY5Zi02YjFkLTQwNDMtOTBjOC00M2FlN2Q4NTVlNWUiLCJzaWQiOiJhMDgyYWVhNC05NTc5LTQ4YTUtOGE5OC04OGYwN2E1MGNlYmEifQ.MBTMxMyzddqHEUXSK7VXQkE56PanWIsvCfvHft_p5ec",
  "access_expires_at": "2026-10-28T14:46:24.297631493Z",
  "refresh_token": "CGwmu8aD5Lp2SLhf9xqosmZ_52wsUd5nYujF-zDl9ys",
  "refresh_expires_at": "2026-11-27T14:31:24.29696493Z",
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
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
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
  "session_id": "87c2ec7b-26f8-4cc5-82e7-a9f01cb889d6",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg3ODUsImlhdCI6MTc5MzE5Nzg4NSwianRpIjoiZjc5NzUyNjMtMjUyYS00OWRiLWIzNjgtZTBmY2FlYjM3M2RmIiwic2lkIjoiODdjMmVjN2ItMjZmOC00Y2M1LTgyZTctYTlmMDFjYjg4OWQ2In0.eMahU_WuxqmpcJoeFCc-ZWZp7QHhYQq1UD5duk2XAOo",
  "access_expires_at": "2026-10-28T14:46:25.177023159Z",
  "refresh_token": "-fmnJ6mKVpCrixiMgnurwkxcYHlRJePmqiUe1k0vD4g",
  "refresh_expires_at": "2026-10-29T02:31:25.176453451Z",
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
  "session_id": "1abc6665-123b-41cd-aa4d-831ba072f7c0",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg3ODUsImlhdCI6MTc5MzE5Nzg4NSwianRpIjoiYmQzOThmOGMtMzUwZi00ZjJjLWI0OWQtZGZiYjA4MDdiYjVlIiwic2lkIjoiMWFiYzY2NjUtMTIzYi00MWNkLWFhNGQtODMxYmEwNzJmN2MwIn0.cDWRmrh8OGTKbUlBmGzUBf3hYqVPZBCWW0N5d4CdT64",
  "access_expires_at": "2026-10-28T14:46:25.777395929Z",
  "refresh_token": "BnTaFwfFttlOQUoRbmSmrGLvjpUrhDkbht5eZqbdlrw",
  "refresh_expires_at": "2026-10-29T02:31:25.776728469Z",
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
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "en": "Duplicate order",
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "en": "No cars available",
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "en": "Test order",
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "ru": "ДТП",
        "pl": "Wypadek",
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
  "command_id": "1a45c74d-f73f-400d-bbff-a500365ee4e3",
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
  "id": "e6e8e518-6b84-4e0d-8085-34bab90cc84e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:36:26.323671Z",
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
  "command_id": "3f75bbb6-5713-44e1-80fd-811e7b36b4c6",
  "quote_id": "e6e8e518-6b84-4e0d-8085-34bab90cc84e",
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
  "id": "f8b4533b-b070-453e-9e3a-6f902c006def",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "09ce6a04-180e-442b-a913-f1ed15de3648",
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
  "created_at": "2026-10-28T14:31:26.621131Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f8b4533b-b070-453e-9e3a-6f902c006def` → **200**

```json
{
  "id": "f8b4533b-b070-453e-9e3a-6f902c006def",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "09ce6a04-180e-442b-a913-f1ed15de3648",
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
  "created_at": "2026-10-28T14:31:26.621131Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f8b4533b-b070-453e-9e3a-6f902c006def/cancel` → **200**

```json
{
  "command_id": "651ea37d-5134-41e7-b221-fdd513a35896",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "f8b4533b-b070-453e-9e3a-6f902c006def",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "09ce6a04-180e-442b-a913-f1ed15de3648",
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
  "created_at": "2026-10-28T14:31:26.621131Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "en": "The wait is too long",
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
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
  "command_id": "ff2661a8-3dda-4011-9ed9-a553d90bc169",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:31:27Z",
    "sequence": 1793197887783
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "54fab2a2-60fe-43d0-aacf-bc19521ea0f5",
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
  "last_heartbeat_at": "2026-10-28T14:31:27.804696Z",
  "last_location_at": "2026-10-28T14:31:27.804696Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30850"
}
```

```json
{
  "challenge_id": "a51f9591-f3c3-4f3f-bcf2-5320b5092c94",
  "expires_at": "2026-10-28T14:36:28.084816071Z",
  "resend_available_at": "2026-10-28T14:31:29.084816071Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "532075",
  "sent_at": "2026-10-28T14:31:28.088110245Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a51f9591-f3c3-4f3f-bcf2-5320b5092c94",
  "code": "532075",
  "device_ref": "sandbox-30850"
}
```

```json
{
  "session_id": "067adddd-92dc-4a1a-9692-bc0fbfbeea34",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODc4OCwiaWF0IjoxNzkzMTk3ODg4LCJqdGkiOiJkMTIxNTY1OS1jOTMyLTQwMjktYWE2ZS1lZDEzNzE4NTNhYmYiLCJzaWQiOiIwNjdhZGRkZC05MmRjLTRhMWEtOTY5Mi1iYzBmYmZiZWVhMzQifQ.dr8unow9KqoYQ8MeUpFf0lUBE3bOXK8LQWjvey9oMKo",
  "access_expires_at": "2026-10-28T14:46:28.395973647Z",
  "refresh_token": "m9j5uDvMf0lXZ7PahTt-G-G03llc1f5oolhltbanC-s",
  "refresh_expires_at": "2026-11-27T14:31:28.395308246Z",
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
  "command_id": "85cf652a-2299-47e9-9f4d-d0a1ac780220",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:31:28Z",
    "sequence": 1793197888933
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ceed853-4dd9-4244-a2b2-e8a3516ba444",
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
  "last_heartbeat_at": "2026-10-28T14:31:28.953863Z",
  "last_location_at": "2026-10-28T14:31:28.953863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2425fbfd-493f-4e4c-bc4b-4a0a61e2ef8a",
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
  "id": "80c58584-e0f4-4c57-8c09-6c5db6754662",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:36:29.238970Z",
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
  "command_id": "4ce13d20-764b-430f-a572-f3a14820d646",
  "quote_id": "80c58584-e0f4-4c57-8c09-6c5db6754662",
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
  "id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "09ce6a04-180e-442b-a913-f1ed15de3648",
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
  "created_at": "2026-10-28T14:31:29.53315Z",
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
    "id": "030f12af-03e1-4668-9f33-a4b9037f0131",
    "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
    "expires_at": "2026-10-28T14:31:44.537285Z",
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

`POST /api/driver/v1/offers/030f12af-03e1-4668-9f33-a4b9037f0131/accept` → **200**

```json
{
  "command_id": "c1b9c54b-4433-4f4a-9ea6-3d5a27d80518"
}
```

```json
{
  "id": "3777b0da-ff81-4499-8ace-17217bcead2d",
  "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4d7e5846-ff89-4c49-b380-b65be9e530ef",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4d7e5846-ff89-4c49-b380-b65be9e530ef",
  "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
  "assignment_id": "3777b0da-ff81-4499-8ace-17217bcead2d",
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

`POST /api/driver/v1/trips/4d7e5846-ff89-4c49-b380-b65be9e530ef/cancel` → **200**

```json
{
  "command_id": "a21e90ba-7c1f-4b38-8ce2-eee7d1705b2e",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "4d7e5846-ff89-4c49-b380-b65be9e530ef",
  "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
  "assignment_id": "3777b0da-ff81-4499-8ace-17217bcead2d",
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

`GET /api/rider/v1/orders/e575210c-c1d9-4b85-86d4-0b41a540b5ea` → **200**

```json
{
  "id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "09ce6a04-180e-442b-a913-f1ed15de3648",
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
    "id": "3777b0da-ff81-4499-8ace-17217bcead2d",
    "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4d7e5846-ff89-4c49-b380-b65be9e530ef",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:31:29.53315Z",
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
    "id": "0eb383e3-f581-46f6-98ba-7862e9020516",
    "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
    "expires_at": "2026-10-28T14:31:45.67973Z",
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

`POST /api/driver/v1/offers/0eb383e3-f581-46f6-98ba-7862e9020516/accept` → **200**

```json
{
  "command_id": "87e6ef1a-5dfd-4d4a-ac4e-565bc9f7f432"
}
```

```json
{
  "id": "cc921c8b-5e73-4307-8d93-6412c7e55f72",
  "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9afa9212-4175-438f-954b-0b709a6a15d0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9afa9212-4175-438f-954b-0b709a6a15d0",
  "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
  "assignment_id": "cc921c8b-5e73-4307-8d93-6412c7e55f72",
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

`POST /api/driver/v1/trips/9afa9212-4175-438f-954b-0b709a6a15d0/cancel` → **200**

```json
{
  "command_id": "08d1dbea-251f-4268-b85a-8786ea9ef3d4",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "9afa9212-4175-438f-954b-0b709a6a15d0",
  "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
  "assignment_id": "cc921c8b-5e73-4307-8d93-6412c7e55f72",
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
    "id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:31:29.53315Z",
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
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати"
      }
    },
    "pickup_at": null
  },
  {
    "id": "f8b4533b-b070-453e-9e3a-6f902c006def",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:31:26.621131Z",
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
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/e575210c-c1d9-4b85-86d4-0b41a540b5ea/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:31:29.533915Z",
      "actor": {
        "type": "CLIENT",
        "id": "09ce6a04-180e-442b-a913-f1ed15de3648",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
        "quote_id": "80c58584-e0f4-4c57-8c09-6c5db6754662",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "ce1dd00e-b1bd-442b-b435-580ebb8e86ab"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:31:29.536171Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
        "attempt_id": "15607c93-a5c3-40e8-9c57-0d2942b4b64b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ce1dd00e-b1bd-442b-b435-580ebb8e86ab"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:31:29.544207Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "030f12af-03e1-4668-9f33-a4b9037f0131",
        "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "ce1dd00e-b1bd-442b-b435-580ebb8e86ab"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:31:30.110652Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "030f12af-03e1-4668-9f33-a4b9037f0131",
        "order_id": "e575210c-c1d9-4b85-86d4-0b41a540b5ea",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "3777b0da-ff81-4499-8ace-17217bcead2d"
      },
      "correlation_id": "f63a157c-6b2a-48fa-8641-f3b2758e9eb6"
```

Done: orders f8b4533b-b070-453e-9e3a-6f902c006def, e575210c-c1d9-4b85-86d4-0b41a540b5ea.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738257427",
  "device_ref": "sandbox-32137"
}
```

```json
{
  "challenge_id": "a61d2a6b-d1ea-4f36-981f-d434fb83016b",
  "expires_at": "2026-10-28T14:36:32.9840539Z",
  "resend_available_at": "2026-10-28T14:31:33.9840539Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738257427` → **200**

```json
{
  "phone": "+380738257427",
  "audience": "CLIENT",
  "code": "837272",
  "sent_at": "2026-10-28T14:31:32.987363798Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a61d2a6b-d1ea-4f36-981f-d434fb83016b",
  "code": "837272",
  "device_ref": "sandbox-32137"
}
```

```json
{
  "session_id": "1446579b-cea5-492f-84b9-adce4511e238",
  "subject": {
    "type": "CLIENT",
    "id": "727ec281-1ba1-48f2-b787-95ce0a035e32"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjdlYzI4MS0xYmExLTQ4ZjItYjc4Ny05NWNlMGEwMzVlMzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NzkzLCJpYXQiOjE3OTMxOTc4OTMsImp0aSI6IjM2Yzc5YjZlLTEzNTUtNGZhMC1iNzg0LWMwZTc5YWVkM2FmNyIsInNpZCI6IjE0NDY1NzliLWNlYTUtNDkyZi04NGI5LWFkY2U0NTExZTIzOCJ9.M_JHDmiZOeKsnvKPLRvIMwDMoTu4o9auORbB4BSrHoc",
  "access_expires_at": "2026-10-28T14:46:33.296794001Z",
  "refresh_token": "nrszK7KSwK2s09bMVxoFCEAJ9fVL9IlHq_jPztjDJ9o",
  "refresh_expires_at": "2026-11-27T14:31:33.296182261Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6487e96a-1bed-46de-9fea-7254710aa260",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "ea2ba699-e49f-4a9c-98fd-b75fa30744ae",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-ea2ba699-e49f-4a9c-98fd-b75fa30744ae",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4481fedc0eec6fe4af81485c5eb02cad",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=ea2ba699-e49f-4a9c-98fd-b75fa30744ae",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738257427"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=ea2ba699-e49f-4a9c-98fd-b75fa30744ae",
  "expires_at": "2026-10-28T15:01:33.583212Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/ea2ba699-e49f-4a9c-98fd-b75fa30744ae` → **200**

```json
{
  "id": "ea2ba699-e49f-4a9c-98fd-b75fa30744ae",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T15:01:33.583212Z",
  "card": {
    "id": "ec99bc42-bb45-4660-91ee-4c9dbfa392b2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3503",
    "card_type": "Visa",
    "created_at": "2026-10-28T14:31:33.875104Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "ec99bc42-bb45-4660-91ee-4c9dbfa392b2",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3503",
      "card_type": "Visa",
      "created_at": "2026-10-28T14:31:33.875104Z"
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
  "device_ref": "sandbox-3817"
}
```

```json
{
  "challenge_id": "81bebe97-7591-4465-b7b5-642f77487ba9",
  "expires_at": "2026-10-28T14:36:34.434049681Z",
  "resend_available_at": "2026-10-28T14:31:35.434049681Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "930886",
  "sent_at": "2026-10-28T14:31:34.437743786Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81bebe97-7591-4465-b7b5-642f77487ba9",
  "code": "930886",
  "device_ref": "sandbox-3817"
}
```

```json
{
  "session_id": "22e5a5fb-4cbc-49a8-a799-c6997fe1ce58",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODc5NCwiaWF0IjoxNzkzMTk3ODk0LCJqdGkiOiI2MmE0MzgyYy1iYmE3LTRjNGUtYTk1Ny1kZTNmMDMzNjI0ZTUiLCJzaWQiOiIyMmU1YTVmYi00Y2JjLTQ5YTgtYTc5OS1jNjk5N2ZlMWNlNTgifQ.yu6z4YIcZsTV0meyZql8cY11_mJUf1U3wZO2-Zl8gpE",
  "access_expires_at": "2026-10-28T14:46:34.734313213Z",
  "refresh_token": "iXLWJJU5tbr9K-SCIKePx74DPrNFCIxryAlm7aWjpos",
  "refresh_expires_at": "2026-11-27T14:31:34.733718729Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ceed853-4dd9-4244-a2b2-e8a3516ba444",
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
  "last_heartbeat_at": "2026-10-28T14:31:28.953863Z",
  "last_location_at": "2026-10-28T14:31:28.953863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6ceed853-4dd9-4244-a2b2-e8a3516ba444/handover` → **200**

```json
{
  "command_id": "addbb82a-697f-4964-b7ee-1485a5fa607c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ceed853-4dd9-4244-a2b2-e8a3516ba444",
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
  "last_heartbeat_at": "2026-10-28T14:31:28.953863Z",
  "last_location_at": "2026-10-28T14:31:28.953863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6ceed853-4dd9-4244-a2b2-e8a3516ba444/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:31:35Z",
    "sequence": 1793197895552
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ceed853-4dd9-4244-a2b2-e8a3516ba444",
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
  "last_heartbeat_at": "2026-10-28T14:31:35.573925Z",
  "last_location_at": "2026-10-28T14:31:35.573925Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fc296366-3c7d-4096-93f3-eb5b8d26822c",
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
  "id": "a45ad18f-5f62-4396-885f-172b764dfae4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:36:35.854324Z",
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
  "command_id": "57542485-365e-435f-afc1-64219d87f473",
  "quote_id": "a45ad18f-5f62-4396-885f-172b764dfae4",
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
  "id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "727ec281-1ba1-48f2-b787-95ce0a035e32",
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
  "created_at": "2026-10-28T14:31:36.141399Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bd672476-0204-49f0-85b3-4f986b2b1b15` → **200**

```json
{
  "id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "727ec281-1ba1-48f2-b787-95ce0a035e32",
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
  "created_at": "2026-10-28T14:31:36.141399Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bd672476-0204-49f0-85b3-4f986b2b1b15` → **200**

```json
{
  "id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "727ec281-1ba1-48f2-b787-95ce0a035e32",
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
  "created_at": "2026-10-28T14:31:36.141399Z",
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
    "id": "ddd01e5b-0e55-49e9-ace0-6f6edc5b6d61",
    "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
    "expires_at": "2026-10-28T14:31:51.952798Z",
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

`POST /api/driver/v1/offers/ddd01e5b-0e55-49e9-ace0-6f6edc5b6d61/accept` → **200**

```json
{
  "command_id": "4361f758-8673-4f18-abb1-a931845ba1a5"
}
```

```json
{
  "id": "cd03291c-fe40-4b20-a834-4181d8af4c29",
  "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c8066afd-f306-42d3-bf4d-a3d62d79a7a3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c8066afd-f306-42d3-bf4d-a3d62d79a7a3",
  "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
  "assignment_id": "cd03291c-fe40-4b20-a834-4181d8af4c29",
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

`POST /api/driver/v1/work-sessions/6ceed853-4dd9-4244-a2b2-e8a3516ba444/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:31:38Z",
    "sequence": 1793197898848
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ceed853-4dd9-4244-a2b2-e8a3516ba444",
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
  "last_heartbeat_at": "2026-10-28T14:31:38.873025Z",
  "last_location_at": "2026-10-28T14:31:38.873025Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c8066afd-f306-42d3-bf4d-a3d62d79a7a3/arrive` → **200**

```json
{
  "command_id": "5f41fbdc-c883-4359-bc5d-666f3feb6d78",
  "expected_version": 0
}
```

```json
{
  "id": "c8066afd-f306-42d3-bf4d-a3d62d79a7a3",
  "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
  "assignment_id": "cd03291c-fe40-4b20-a834-4181d8af4c29",
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
  "arrived_at": "2026-10-28T14:31:39.169797Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c8066afd-f306-42d3-bf4d-a3d62d79a7a3/start` → **200**

```json
{
  "command_id": "39a58711-e476-4262-901d-8a4dbf6768bf",
  "expected_version": 1
}
```

```json
{
  "id": "c8066afd-f306-42d3-bf4d-a3d62d79a7a3",
  "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
  "assignment_id": "cd03291c-fe40-4b20-a834-4181d8af4c29",
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
  "arrived_at": "2026-10-28T14:31:39.169797Z",
  "started_at": "2026-10-28T14:31:39.455103Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c8066afd-f306-42d3-bf4d-a3d62d79a7a3/complete` → **200**

```json
{
  "command_id": "43c68b8d-82c1-4401-9876-ed35271a5a17",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:31:39Z",
  "cash_received": true
}
```

```json
{
  "id": "c8066afd-f306-42d3-bf4d-a3d62d79a7a3",
  "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
  "assignment_id": "cd03291c-fe40-4b20-a834-4181d8af4c29",
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
  "arrived_at": "2026-10-28T14:31:39.169797Z",
  "started_at": "2026-10-28T14:31:39.455103Z",
  "completed_at": "2026-10-28T14:31:39.750375Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/bd672476-0204-49f0-85b3-4f986b2b1b15` → **200**

```json
{
  "id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "727ec281-1ba1-48f2-b787-95ce0a035e32",
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
    "id": "cd03291c-fe40-4b20-a834-4181d8af4c29",
    "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c8066afd-f306-42d3-bf4d-a3d62d79a7a3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:31:36.141399Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bd672476-0204-49f0-85b3-4f986b2b1b15` → **200**

```json
{
  "id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "727ec281-1ba1-48f2-b787-95ce0a035e32",
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
    "id": "cd03291c-fe40-4b20-a834-4181d8af4c29",
    "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c8066afd-f306-42d3-bf4d-a3d62d79a7a3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:31:36.141399Z",
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
      "id": "5ef246c1-1f32-4811-8c04-7b1dfc658347",
      "at": "2026-10-28T14:31:40.001934Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/bd672476-0204-49f0-85b3-4f986b2b1b15/tip` → **200**

```json
{
  "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
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
  "available_until": "2026-10-29T14:31:39.750375Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/bd672476-0204-49f0-85b3-4f986b2b1b15/tip` → **201**

```json
{
  "command_id": "7de13ae8-d009-4855-b91c-58d50dd064e1",
  "amount_minor": 2500
}
```

```json
{
  "id": "12e59864-b4a0-4715-aba5-a154abe098ac",
  "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:31:42.447533Z"
}
```

`GET /api/rider/v1/orders/bd672476-0204-49f0-85b3-4f986b2b1b15/tip` → **200**

```json
{
  "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
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
  "available_until": "2026-10-29T14:31:39.750375Z",
  "open": false,
  "tip": {
    "id": "12e59864-b4a0-4715-aba5-a154abe098ac",
    "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:31:42.447533Z"
  }
}
```

`GET /api/rider/v1/orders/bd672476-0204-49f0-85b3-4f986b2b1b15/tip` → **200**

```json
{
  "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
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
  "available_until": "2026-10-29T14:31:39.750375Z",
  "open": false,
  "tip": {
    "id": "12e59864-b4a0-4715-aba5-a154abe098ac",
    "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:31:42.447533Z"
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
      "id": "596371d5-8315-4237-873c-066be9325030",
      "at": "2026-10-28T14:31:44.071613Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
      "counterpart_id": null
    },
    {
      "id": "5ef246c1-1f32-4811-8c04-7b1dfc658347",
      "at": "2026-10-28T14:31:40.001934Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "916ed46e-95ff-430d-8283-4fa2b67e9a5c",
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
  "id": "f9e50e3b-fbe9-4bc7-9d2b-c7f598e3603f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:36:44.609325Z",
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
  "session_id": "43d22901-09b4-4ae6-acf5-64a79dd283d3",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4MDUsImlhdCI6MTc5MzE5NzkwNSwianRpIjoiMTEyYmIxYjgtNTNlOC00OWZmLTk2MTQtMzAyMzQzYjBmZWQ2Iiwic2lkIjoiNDNkMjI5MDEtMDliNC00YWU2LWFjZjUtNjRhNzlkZDI4M2QzIn0.UcjXHkXWZZWUw1r3Fta65043qsbHeSS3ZmgfxjC2Ub8",
  "access_expires_at": "2026-10-28T14:46:45.239283489Z",
  "refresh_token": "fRLJwngxbksTRPuKD3lCxvIzQCM66pRg25sXes2U0K0",
  "refresh_expires_at": "2026-10-29T02:31:45.238731589Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380738257427` → **200**

```json
{
  "client_id": "727ec281-1ba1-48f2-b787-95ce0a035e32"
}
```

`POST /api/admin/v1/rider-wallets/727ec281-1ba1-48f2-b787-95ce0a035e32/top-ups` → **201**

```json
{
  "command_id": "c8086d26-f646-492e-86f5-8dcf27428f4b",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "727ec281-1ba1-48f2-b787-95ce0a035e32",
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
      "id": "55661290-d964-4f08-b1ab-b723d9349dd6",
      "at": "2026-10-28T14:31:45.787152Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "05c1d0cd-137d-4a7c-b136-0320424cc747",
  "quote_id": "f9e50e3b-fbe9-4bc7-9d2b-c7f598e3603f",
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
  "id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "727ec281-1ba1-48f2-b787-95ce0a035e32",
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
  "created_at": "2026-10-28T14:31:46.093982Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20d67b6b-8536-40b6-bd3a-f6b4188f4d2e` → **200**

```json
{
  "id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "727ec281-1ba1-48f2-b787-95ce0a035e32",
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
  "created_at": "2026-10-28T14:31:46.093982Z",
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
    "id": "82b9528f-1a43-4bdf-a2f1-62797fd91b5a",
    "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
    "expires_at": "2026-10-28T14:32:01.099368Z",
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

`POST /api/driver/v1/offers/82b9528f-1a43-4bdf-a2f1-62797fd91b5a/accept` → **200**

```json
{
  "command_id": "d1f55234-f593-4270-92bd-838679dc05ec"
}
```

```json
{
  "id": "1ead4ea8-51b3-4e2a-9b48-d253dcbce39f",
  "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bce3b0f5-b397-4f5d-b0cf-d5405230ab45",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bce3b0f5-b397-4f5d-b0cf-d5405230ab45",
  "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
  "assignment_id": "1ead4ea8-51b3-4e2a-9b48-d253dcbce39f",
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

`POST /api/driver/v1/work-sessions/6ceed853-4dd9-4244-a2b2-e8a3516ba444/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:31:47Z",
    "sequence": 1793197907485
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ceed853-4dd9-4244-a2b2-e8a3516ba444",
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
  "last_heartbeat_at": "2026-10-28T14:31:47.507701Z",
  "last_location_at": "2026-10-28T14:31:47.507701Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bce3b0f5-b397-4f5d-b0cf-d5405230ab45/arrive` → **200**

```json
{
  "command_id": "cee374a9-df4d-4506-a973-1ebec46c41b1",
  "expected_version": 0
}
```

```json
{
  "id": "bce3b0f5-b397-4f5d-b0cf-d5405230ab45",
  "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
  "assignment_id": "1ead4ea8-51b3-4e2a-9b48-d253dcbce39f",
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
  "arrived_at": "2026-10-28T14:31:47.804228Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bce3b0f5-b397-4f5d-b0cf-d5405230ab45/start` → **200**

```json
{
  "command_id": "e571102a-b33a-4144-9424-0b9731c729d6",
  "expected_version": 1
}
```

```json
{
  "id": "bce3b0f5-b397-4f5d-b0cf-d5405230ab45",
  "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
  "assignment_id": "1ead4ea8-51b3-4e2a-9b48-d253dcbce39f",
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
  "arrived_at": "2026-10-28T14:31:47.804228Z",
  "started_at": "2026-10-28T14:31:48.095523Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bce3b0f5-b397-4f5d-b0cf-d5405230ab45/complete` → **200**

```json
{
  "command_id": "52a941df-26d2-4159-a518-82a1a5e46078",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:31:48Z",
  "cash_received": true
}
```

```json
{
  "id": "bce3b0f5-b397-4f5d-b0cf-d5405230ab45",
  "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
  "assignment_id": "1ead4ea8-51b3-4e2a-9b48-d253dcbce39f",
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
  "arrived_at": "2026-10-28T14:31:47.804228Z",
  "started_at": "2026-10-28T14:31:48.095523Z",
  "completed_at": "2026-10-28T14:31:48.392054Z",
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
  "client_id": "727ec281-1ba1-48f2-b787-95ce0a035e32",
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
      "id": "55661290-d964-4f08-b1ab-b723d9349dd6",
      "at": "2026-10-28T14:31:45.787152Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
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
      "balance_minor": 30204
    }
  ],
  "entries": [
    {
      "id": "7af28d76-d167-428f-9637-95f8736a52a5",
      "at": "2026-10-28T14:31:49.116521Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
      "counterpart_id": null
    },
    {
      "id": "596371d5-8315-4237-873c-066be9325030",
      "at": "2026-10-28T14:31:44.071613Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
      "counterpart_id": null
    },
    {
      "id": "5ef246c1-1f32-4811-8c04-7b1dfc658347",
      "at": "2026-10-28T14:31:40.001934Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/20d67b6b-8536-40b6-bd3a-f6b4188f4d2e/tip` → **200**

```json
{
  "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
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
  "available_until": "2026-10-29T14:31:48.392054Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/20d67b6b-8536-40b6-bd3a-f6b4188f4d2e/tip` → **201**

```json
{
  "command_id": "292bc3ce-a6e7-4620-baea-0796ba546599",
  "amount_minor": 2500
}
```

```json
{
  "id": "f983a62f-5597-4fa4-8df6-5c2caa72ab59",
  "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:31:49.78188Z"
}
```

`GET /api/rider/v1/orders/20d67b6b-8536-40b6-bd3a-f6b4188f4d2e/tip` → **200**

```json
{
  "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
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
  "available_until": "2026-10-29T14:31:48.392054Z",
  "open": false,
  "tip": {
    "id": "f983a62f-5597-4fa4-8df6-5c2caa72ab59",
    "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:31:49.78188Z"
  }
}
```

`GET /api/rider/v1/orders/20d67b6b-8536-40b6-bd3a-f6b4188f4d2e/tip` → **200**

```json
{
  "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
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
  "available_until": "2026-10-29T14:31:48.392054Z",
  "open": false,
  "tip": {
    "id": "f983a62f-5597-4fa4-8df6-5c2caa72ab59",
    "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:31:49.78188Z"
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
      "id": "31d61315-b71c-4ad0-a86b-783e84fdb630",
      "at": "2026-10-28T14:31:51.148773Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
      "counterpart_id": null
    },
    {
      "id": "7af28d76-d167-428f-9637-95f8736a52a5",
      "at": "2026-10-28T14:31:49.116521Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "20d67b6b-8536-40b6-bd3a-f6b4188f4d2e",
      "counterpart_id": null
    },
    {
      "id": "596371d5-8315-4237-873c-066be9325030",
      "at": "2026-10-28T14:31:44.071613Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
      "counterpart_id": null
    },
    {
      "id": "5ef246c1-1f32-4811-8c04-7b1dfc658347",
      "at": "2026-10-28T14:31:40.001934Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "bd672476-0204-49f0-85b3-4f986b2b1b15",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ceed853-4dd9-4244-a2b2-e8a3516ba444",
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
  "last_heartbeat_at": "2026-10-28T14:31:47.507701Z",
  "last_location_at": "2026-10-28T14:31:47.507701Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6ceed853-4dd9-4244-a2b2-e8a3516ba444/close` → **200**

```json
{
  "command_id": "3fd55c7c-bc10-4304-8276-5db9bc1a774b",
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

Done: card order 20d67b6b-8536-40b6-bd3a-f6b4188f4d2e.

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
  "phone": "+380733155249",
  "device_ref": "sandbox-4791"
}
```

```json
{
  "challenge_id": "0dd42b3e-574d-4bae-8843-eb7060ab4df6",
  "expires_at": "2026-10-28T14:36:52.724799431Z",
  "resend_available_at": "2026-10-28T14:31:53.724799431Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733155249` → **200**

```json
{
  "phone": "+380733155249",
  "audience": "CLIENT",
  "code": "011199",
  "sent_at": "2026-10-28T14:31:52.728811796Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0dd42b3e-574d-4bae-8843-eb7060ab4df6",
  "code": "011199",
  "device_ref": "sandbox-4791"
}
```

```json
{
  "session_id": "ab4e8bc6-40f7-42e8-aa0f-93751caadcd4",
  "subject": {
    "type": "CLIENT",
    "id": "fca7617a-2cf6-41d8-a554-dabb1249388b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2E3NjE3YS0yY2Y2LTQxZDgtYTU1NC1kYWJiMTI0OTM4OGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4ODEzLCJpYXQiOjE3OTMxOTc5MTMsImp0aSI6IjVkMDIwMzI3LWU3MTktNGU1My1hYjhkLWI1ZTUwNjIxOGE5YiIsInNpZCI6ImFiNGU4YmM2LTQwZjctNDJlOC1hYTBmLTkzNzUxY2FhZGNkNCJ9.hngUSUlq0cunX994glBo0AQOckdqHCZaj76fZnA92xs",
  "access_expires_at": "2026-10-28T14:46:53.03610209Z",
  "refresh_token": "IXaY7fGzprD7Rq_dhIVsSqboN-InOI7euWfzXVhNXAE",
  "refresh_expires_at": "2026-11-27T14:31:53.035545343Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "91e80fe8-3735-4bf7-a75f-0db17c10ee92",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "ef87f4b5-5d8e-4331-b811-f5358e06b797",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ef87f4b5-5d8e-4331-b811-f5358e06b797",
    "orderDate": "1793197913",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "a3a4f1817f75f3c2cfdcf2c51504677b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ef87f4b5-5d8e-4331-b811-f5358e06b797",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733155249"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ef87f4b5-5d8e-4331-b811-f5358e06b797",
  "created_at": "2026-10-28T14:31:53.318063Z",
  "expires_at": "2026-10-28T15:01:53.318063Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/ef87f4b5-5d8e-4331-b811-f5358e06b797` → **200**

```json
{
  "id": "ef87f4b5-5d8e-4331-b811-f5358e06b797",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:31:53.318063Z",
  "expires_at": "2026-10-28T15:01:53.318063Z",
  "completed_at": "2026-10-28T14:31:53.602907Z",
  "masked_pan": "41****0448",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fca7617a-2cf6-41d8-a554-dabb1249388b",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fca7617a-2cf6-41d8-a554-dabb1249388b",
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
      "id": "54e15711-f544-459c-8053-d430c03fd6ad",
      "at": "2026-10-28T14:31:54.163727Z",
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
  "client_id": "fca7617a-2cf6-41d8-a554-dabb1249388b",
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
      "id": "54e15711-f544-459c-8053-d430c03fd6ad",
      "at": "2026-10-28T14:31:54.163727Z",
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
  "device_ref": "sandbox-29360"
}
```

```json
{
  "challenge_id": "6e16f1f2-383e-4399-b890-f634da7b8ad4",
  "expires_at": "2026-10-28T14:36:55.722737783Z",
  "resend_available_at": "2026-10-28T14:31:56.722737783Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "601036",
  "sent_at": "2026-10-28T14:31:55.725914892Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e16f1f2-383e-4399-b890-f634da7b8ad4",
  "code": "601036",
  "device_ref": "sandbox-29360"
}
```

```json
{
  "session_id": "1d92b82b-1c65-42e6-a86f-78a9d317d695",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODgxNiwiaWF0IjoxNzkzMTk3OTE2LCJqdGkiOiIwMzE3ZmIxOS1mZDliLTRhOTAtYTRkNS0yOGEwYzcxOGJiZGMiLCJzaWQiOiIxZDkyYjgyYi0xYzY1LTQyZTYtYTg2Zi03OGE5ZDMxN2Q2OTUifQ.zU4hsgjo1eilDiPpYTagJzQDLC6TnSBo7U0BRg7hRsk",
  "access_expires_at": "2026-10-28T14:46:56.030991867Z",
  "refresh_token": "4xYxd48j_0eKCV1lWayogmrmBbpLlnCZpHpul-JoX7s",
  "refresh_expires_at": "2026-11-27T14:31:56.030323677Z",
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
  "command_id": "0d0140b4-a1c7-424b-a2f9-c65babe39450",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "1c56fa06-f73b-42ee-8975-6c300b00b7c7",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-1c56fa06-f73b-42ee-8975-6c300b00b7c7",
    "orderDate": "1793197916",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "cffbef9e9da5fe62de2784655d5cffcd",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=1c56fa06-f73b-42ee-8975-6c300b00b7c7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=1c56fa06-f73b-42ee-8975-6c300b00b7c7",
  "created_at": "2026-10-28T14:31:56.576931Z",
  "expires_at": "2026-10-28T15:01:56.576931Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/1c56fa06-f73b-42ee-8975-6c300b00b7c7` → **200**

```json
{
  "id": "1c56fa06-f73b-42ee-8975-6c300b00b7c7",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:31:56.576931Z",
  "expires_at": "2026-10-28T15:01:56.576931Z",
  "completed_at": "2026-10-28T14:31:56.862952Z",
  "masked_pan": "41****4789",
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
      "id": "53d0bd7e-0910-4305-8c8f-da497078a112",
      "at": "2026-10-28T14:31:57.173483Z",
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
  "command_id": "665db065-be70-467d-9536-ae17252f2de9",
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
  "correlation_id": "874e1848-94ca-489f-a34c-eae699d1e26f"
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
  "session_id": "58703e71-6052-427b-b6b8-85115e8d8670",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4MTksImlhdCI6MTc5MzE5NzkxOSwianRpIjoiZTM0ODU4OWYtNzFiMi00ZjI4LWJmMjQtNDAyMGNkN2Q0MDhhIiwic2lkIjoiNTg3MDNlNzEtNjA1Mi00MjdiLWI2YjgtODUxMTVlOGQ4NjcwIn0.v0Hq-tdIWdoskcpbj-Ui2BHiUG8cQKEQUf954xn6TrI",
  "access_expires_at": "2026-10-28T14:46:59.332966704Z",
  "refresh_token": "bAJ3_HlBo9kei5VSnUAbNBXYsfIpncEZW6CHtEfrNqg",
  "refresh_expires_at": "2026-10-29T02:31:59.332356356Z",
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
  "phone": "+48600312071",
  "device_ref": "sandbox-4773"
}
```

```json
{
  "challenge_id": "93d5d65a-5a7e-4075-b976-5304b7d33eb2",
  "expires_at": "2026-10-28T14:37:00.155660006Z",
  "resend_available_at": "2026-10-28T14:32:01.155660006Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600312071` → **200**

```json
{
  "phone": "+48600312071",
  "audience": "CLIENT",
  "code": "098460",
  "sent_at": "2026-10-28T14:32:00.158204668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93d5d65a-5a7e-4075-b976-5304b7d33eb2",
  "code": "098460",
  "device_ref": "sandbox-4773"
}
```

```json
{
  "session_id": "bf26985c-27c6-472c-a015-088649a09bf9",
  "subject": {
    "type": "CLIENT",
    "id": "6d921ec3-ff95-41ef-9007-4e30ffa69c1f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZDkyMWVjMy1mZjk1LTQxZWYtOTAwNy00ZTMwZmZhNjljMWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4ODIwLCJpYXQiOjE3OTMxOTc5MjAsImp0aSI6IjI2M2UwM2MzLTcxN2EtNDgwOC04NTU1LWUyZWJhMWJlZmJiNiIsInNpZCI6ImJmMjY5ODVjLTI3YzYtNDcyYy1hMDE1LTA4ODY0OWEwOWJmOSJ9.nF5jE4coQ4Molpd2JDwsbyh-fpqnBV3NMsjClschYNY",
  "access_expires_at": "2026-10-28T14:47:00.458488427Z",
  "refresh_token": "1s4eUxb2tYE0XirhgilxR3jfeb1d3mfj3vSpHTnsQoE",
  "refresh_expires_at": "2026-11-27T14:32:00.457885691Z",
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
  "command_id": "9fb76ebb-c318-4025-aff4-e975bb4fd0e4",
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
  "correlation_id": "708e40de-7796-4937-8295-a69af869a085",
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
  "command_id": "2de81e2c-d1e8-4b2a-8b22-f3f0e6b29197",
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
  "paused_at": "2026-10-28T14:32:01.594071346Z",
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
  "command_id": "5b6d9004-a068-4a43-836d-7693d5950b71",
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
  "id": "91094a0b-f1d6-4cb9-aee5-538bd00ee7b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:37:02.165468Z",
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
  "command_id": "3a7ab5ef-5920-4774-9197-ceeeaf510ac8",
  "quote_id": "91094a0b-f1d6-4cb9-aee5-538bd00ee7b7",
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
  "correlation_id": "76de8a0f-5660-46cb-b7fe-b1aaa66aeab4"
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
  "paused_at": "2026-10-28T14:32:01.594071Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "9e75e124-5ee3-4e4c-a2fd-9b74693f35e2",
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
  "command_id": "a4913567-ce2e-435e-b021-09583291f792",
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
  "command_id": "55134c48-a481-4808-af56-0e48e41b628b",
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
  "id": "7ea7fe96-d8a0-4b39-a54c-69fbe02c6b1c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:37:03.876231Z",
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
  "command_id": "99464dea-4ce4-461c-b446-fe8dc8599f3a",
  "quote_id": "7ea7fe96-d8a0-4b39-a54c-69fbe02c6b1c",
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
  "correlation_id": "a8a746b0-bc7b-465c-87ff-50dc260dd1a9"
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
  "command_id": "0597541a-d16a-4a6a-9802-3414d7c315b1",
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
  "command_id": "07e45928-a7b9-4d79-b11c-1e002ccbac97",
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
  "id": "bfa6fe64-48b5-44dd-8603-1c79cfbad816",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:37:05.007962Z",
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
  "command_id": "5acb57ea-052f-4995-bb1b-ae9340c051d5",
  "quote_id": "bfa6fe64-48b5-44dd-8603-1c79cfbad816",
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
  "correlation_id": "49f6c22f-feca-4606-a682-1e78ea937f56"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "8e21e11b-2e2f-44c9-8bb5-e1f480533b0e",
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
  "correlation_id": "3d28a7ce-2b24-4851-9329-8f743cc02e1f"
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
  "command_id": "88832a27-efae-4836-ab97-4c4c952b51e8",
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
  "phone": "+380674306813",
  "device_ref": "sandbox-133"
}
```

```json
{
  "challenge_id": "5e5eb721-3051-4f0b-aec8-4e75e6c83576",
  "expires_at": "2026-10-28T14:37:06.515589934Z",
  "resend_available_at": "2026-10-28T14:32:07.515589934Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674306813` → **200**

```json
{
  "phone": "+380674306813",
  "audience": "CLIENT",
  "code": "574376",
  "sent_at": "2026-10-28T14:32:06.518230566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e5eb721-3051-4f0b-aec8-4e75e6c83576",
  "code": "574376",
  "device_ref": "sandbox-133"
}
```

```json
{
  "session_id": "a4da9a30-53d4-44ef-8964-95dd5a779004",
  "subject": {
    "type": "CLIENT",
    "id": "1295137e-d2f8-40b3-b0ab-4c93a6f395dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjk1MTM3ZS1kMmY4LTQwYjMtYjBhYi00YzkzYTZmMzk1ZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4ODI2LCJpYXQiOjE3OTMxOTc5MjYsImp0aSI6ImIyZTA2ZDY5LTRhMDUtNDkxNy05Zjk4LTU2YzU0NWIxOTJiNiIsInNpZCI6ImE0ZGE5YTMwLTUzZDQtNDRlZi04OTY0LTk1ZGQ1YTc3OTAwNCJ9.gorSnld5VdsZcE46V76dCEuXIL8vvF2yjbrv-eSb8sU",
  "access_expires_at": "2026-10-28T14:47:06.816967713Z",
  "refresh_token": "X4ihEgYt0vf7oC_ZQnBaVUJzJXlcWEQKaHdZTMGt6cg",
  "refresh_expires_at": "2026-11-27T14:32:06.81647384Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1295137e-d2f8-40b3-b0ab-4c93a6f395dd",
  "session_id": "a4da9a30-53d4-44ef-8964-95dd5a779004",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4bf8d8a1-010d-4821-9c00-c847fc4adbb9",
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
  "id": "d5e06a00-b5ab-4497-b5e5-ef9e533006bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:37:07.367019Z",
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
  "challenge_id": "b83bf567-ce4c-48b9-9d55-52db3df9b179",
  "expires_at": "2026-10-28T14:37:09.656714242Z",
  "resend_available_at": "2026-10-28T14:32:10.656714242Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674306813` → **200**

```json
{
  "phone": "+380674306813",
  "audience": "CLIENT",
  "code": "948512",
  "sent_at": "2026-10-28T14:32:09.659427192Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "35c3bdba-abd3-4ee6-8b62-c1101dc13aa5",
  "challenge_id": "b83bf567-ce4c-48b9-9d55-52db3df9b179",
  "otp_code": "948512"
}
```

```json
{
  "client_id": "1295137e-d2f8-40b3-b0ab-4c93a6f395dd",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T14:32:09.989153581Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "25ce0f7c-3355-4206-97bd-b4d918c66044",
  "quote_id": "d5e06a00-b5ab-4497-b5e5-ef9e533006bb",
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
  "correlation_id": "ea88e1c7-d833-45d3-ad86-e4c6fa1bd437"
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
  "session_id": "a412b42b-1fe8-4002-8967-7fadd66f8ca9",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4MzAsImlhdCI6MTc5MzE5NzkzMCwianRpIjoiY2I2MTU3NzctYzYwOC00MmFiLWE1MGEtOWVkZmUwMTY5Y2RhIiwic2lkIjoiYTQxMmI0MmItMWZlOC00MDAyLTg5NjctN2ZhZGQ2NmY4Y2E5In0.GeMxnQfTRLssCHWZsYBLQKLWcq_r28Lpke1ju3CClug",
  "access_expires_at": "2026-10-28T14:47:10.90550814Z",
  "refresh_token": "t6DUjzFqgDJx3Rat5Llkv-0F7_9L_cBeUzAIgwX8pvQ",
  "refresh_expires_at": "2026-10-29T02:32:10.90480983Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "1295137e-d2f8-40b3-b0ab-4c93a6f395dd",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T14:32:09.989154Z",
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

`POST /api/admin/v1/client-deletions/1295137e-d2f8-40b3-b0ab-4c93a6f395dd/complete` → **200**

```json
{
  "command_id": "a9ea2c0c-a6f1-4c22-97c5-cb77fa43b888",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "1295137e-d2f8-40b3-b0ab-4c93a6f395dd",
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
  "correlation_id": "b969768a-b4ae-4202-99d0-2d54d88ad70c"
}
```

Done: client 1295137e-d2f8-40b3-b0ab-4c93a6f395dd anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668047276",
  "device_ref": "sandbox-25005"
}
```

```json
{
  "challenge_id": "75087599-38da-4965-bb11-0b042b35f2db",
  "expires_at": "2026-10-28T14:37:12.048287366Z",
  "resend_available_at": "2026-10-28T14:32:13.048287366Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668047276` → **200**

```json
{
  "phone": "+380668047276",
  "audience": "CLIENT",
  "code": "564026",
  "sent_at": "2026-10-28T14:32:12.051079796Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75087599-38da-4965-bb11-0b042b35f2db",
  "code": "564026",
  "device_ref": "sandbox-25005"
}
```

```json
{
  "session_id": "1e2a95af-c81d-4b00-b6c5-6d8079e0bee3",
  "subject": {
    "type": "CLIENT",
    "id": "6e8f5ac2-a196-45ef-91e6-646fda5c57b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZThmNWFjMi1hMTk2LTQ1ZWYtOTFlNi02NDZmZGE1YzU3YjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4ODMyLCJpYXQiOjE3OTMxOTc5MzIsImp0aSI6ImJkY2JlNjYyLTJjOWYtNDlmNi05Yjk1LTYxNzVkMjA2OWYwOCIsInNpZCI6IjFlMmE5NWFmLWM4MWQtNGIwMC1iNmM1LTZkODA3OWUwYmVlMyJ9.Sr7lsZKA3HRulZ7i6wp5eimqwJVgNpLjH9JbmYJEAT0",
  "access_expires_at": "2026-10-28T14:47:12.364339729Z",
  "refresh_token": "eQZajzadyrpK2vnOxVffFU5Sq1OOHcceTMyVBgViiGg",
  "refresh_expires_at": "2026-11-27T14:32:12.36377529Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6e8f5ac2-a196-45ef-91e6-646fda5c57b6",
  "session_id": "1e2a95af-c81d-4b00-b6c5-6d8079e0bee3",
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
  "session_id": "c4703ca3-69f0-4f11-acfb-0d6955798bd2",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4MzMsImlhdCI6MTc5MzE5NzkzMywianRpIjoiM2NhN2Q3ZWEtZTdiMi00ZDhjLWFlNzMtMzIzMWQzMDU5ODkxIiwic2lkIjoiYzQ3MDNjYTMtNjlmMC00ZjExLWFjZmItMGQ2OTU1Nzk4YmQyIn0.CJL8akReiNbhYJgakLbwTshLwv-1B2KN7nNdNVMbiRs",
  "access_expires_at": "2026-10-28T14:47:13.253287971Z",
  "refresh_token": "sH81mraRIStImcHBB-F0wbimqr6kZffvPEUxIItIhrQ",
  "refresh_expires_at": "2026-10-29T02:32:13.252725615Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=8047276&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "6e8f5ac2-a196-45ef-91e6-646fda5c57b6",
      "phone": "+380668047276",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T14:32:12.361815Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/6e8f5ac2-a196-45ef-91e6-646fda5c57b6` → **200**

```json
{
  "client": {
    "id": "6e8f5ac2-a196-45ef-91e6-646fda5c57b6",
    "phone": "+380668047276",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:32:12.361815Z",
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

`POST /api/admin/v1/clients/6e8f5ac2-a196-45ef-91e6-646fda5c57b6/block` → **400**

```json
{
  "command_id": "0f991948-4558-48fc-bde4-7e23f9ad17fe",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/6e8f5ac2-a196-45ef-91e6-646fda5c57b6/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2ff24095-40b1-48c0-9a80-f6a72cd5e80f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/6e8f5ac2-a196-45ef-91e6-646fda5c57b6/block` → **200**

```json
{
  "command_id": "b52b551a-88b1-4032-8445-049963d29e87",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "6e8f5ac2-a196-45ef-91e6-646fda5c57b6",
  "phone": "+380668047276",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T14:32:12.361815Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T14:32:14.432464Z",
    "by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
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
  "correlation_id": "b0890ad3-9a85-4436-ad97-99175a54d9a9"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668047276",
  "device_ref": "sandbox-13655"
}
```

```json
{
  "challenge_id": "568756e9-9f80-47ad-ba48-4971bfa366e0",
  "expires_at": "2026-10-28T14:37:16.992812412Z",
  "resend_available_at": "2026-10-28T14:32:17.992812412Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668047276` → **200**

```json
{
  "phone": "+380668047276",
  "audience": "CLIENT",
  "code": "732765",
  "sent_at": "2026-10-28T14:32:16.995376033Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "568756e9-9f80-47ad-ba48-4971bfa366e0",
  "code": "732765",
  "device_ref": "sandbox-13655"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "457dd18b-fa19-4f00-a80c-05653244aacd"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/6e8f5ac2-a196-45ef-91e6-646fda5c57b6` → **200**

```json
{
  "client": {
    "id": "6e8f5ac2-a196-45ef-91e6-646fda5c57b6",
    "phone": "+380668047276",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T14:32:12.361815Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T14:32:14.432464Z",
      "by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
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

`POST /api/admin/v1/clients/6e8f5ac2-a196-45ef-91e6-646fda5c57b6/unblock` → **200**

```json
{
  "command_id": "6ad7c569-6b99-47e2-ad57-68d7f55b71a7",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "6e8f5ac2-a196-45ef-91e6-646fda5c57b6",
  "phone": "+380668047276",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T14:32:12.361815Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668047276",
  "device_ref": "sandbox-5455"
}
```

```json
{
  "challenge_id": "a4e76ac5-a5e6-44ce-80a6-43c27a2078c5",
  "expires_at": "2026-10-28T14:37:20.182557162Z",
  "resend_available_at": "2026-10-28T14:32:21.182557162Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668047276` → **200**

```json
{
  "phone": "+380668047276",
  "audience": "CLIENT",
  "code": "638135",
  "sent_at": "2026-10-28T14:32:20.185113907Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4e76ac5-a5e6-44ce-80a6-43c27a2078c5",
  "code": "638135",
  "device_ref": "sandbox-5455"
}
```

```json
{
  "session_id": "d09739e7-0f2f-4b77-8e29-6d67e3b831a2",
  "subject": {
    "type": "CLIENT",
    "id": "6e8f5ac2-a196-45ef-91e6-646fda5c57b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZThmNWFjMi1hMTk2LTQ1ZWYtOTFlNi02NDZmZGE1YzU3YjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4ODQwLCJpYXQiOjE3OTMxOTc5NDAsImp0aSI6IjdkZmE0NmJlLTZlYTQtNDI3Ny1iYmUxLTJhZWExYmUzOWVkYyIsInNpZCI6ImQwOTczOWU3LTBmMmYtNGI3Ny04ZTI5LTZkNjdlM2I4MzFhMiJ9.2ru-J-FS86EXWPy2J-IEgdxL3qcL_82DWErY-m04di8",
  "access_expires_at": "2026-10-28T14:47:20.493974087Z",
  "refresh_token": "QW8EDiAFBaJj402ClH0RHpy6l6MXVoit1Rrvi5qtSKU",
  "refresh_expires_at": "2026-11-27T14:32:20.493310098Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6e8f5ac2-a196-45ef-91e6-646fda5c57b6",
  "session_id": "d09739e7-0f2f-4b77-8e29-6d67e3b831a2",
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
  "phone": "+380664013638",
  "device_ref": "sandbox-637"
}
```

```json
{
  "challenge_id": "1326a6a4-64c5-4edf-b694-abde4d242bdb",
  "expires_at": "2026-10-28T14:37:21.047008609Z",
  "resend_available_at": "2026-10-28T14:32:22.047008609Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664013638` → **200**

```json
{
  "phone": "+380664013638",
  "audience": "CLIENT",
  "code": "842086",
  "sent_at": "2026-10-28T14:32:21.049757543Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1326a6a4-64c5-4edf-b694-abde4d242bdb",
  "code": "842086",
  "device_ref": "sandbox-637"
}
```

```json
{
  "session_id": "171a856e-8631-4ce5-b587-8707e8a86007",
  "subject": {
    "type": "CLIENT",
    "id": "5b9c4790-e6ac-4b99-8039-fb5eaa8bac82"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YjljNDc5MC1lNmFjLTRiOTktODAzOS1mYjVlYWE4YmFjODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4ODQxLCJpYXQiOjE3OTMxOTc5NDEsImp0aSI6IjUzZWYzNzYzLWVlM2UtNGMxNC04NjU0LWJkNGE2YjBkMDYyYyIsInNpZCI6IjE3MWE4NTZlLTg2MzEtNGNlNS1iNTg3LTg3MDdlOGE4NjAwNyJ9.MhIfJBhwyB_dzcQ1G4tUxxBakbIQaxumJJZn9Dam0xk",
  "access_expires_at": "2026-10-28T14:47:21.344939366Z",
  "refresh_token": "bIo4dZ7PtJD7k1MDbCb5PJ6FdsK3VsvubvQRUIbG6QI",
  "refresh_expires_at": "2026-11-27T14:32:21.344424151Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e37d89c8-9a6a-436b-9cc2-e9719550ea5f",
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
  "id": "a2418adb-ad43-4065-84a7-e848463fd7b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:37:21.625102Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 335661f4-1ca6-406c-bb52-77d433d8cde6) → **201**

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
  "session_id": "2920c620-5d3a-48f6-bbc9-6fa656b3ecf9",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4NDIsImlhdCI6MTc5MzE5Nzk0MiwianRpIjoiMWQ0YzhlMjYtMDAwMi00MjFiLThiYzYtMmJiZjNmNzM4YzQ1Iiwic2lkIjoiMjkyMGM2MjAtNWQzYS00OGY2LWJiYzktNmZhNjU2YjNlY2Y5In0.rdYN2bcFCpJG3VXzbsN7PQGV35K0xvBf2fWgaD3u044",
  "access_expires_at": "2026-10-28T14:47:22.293791077Z",
  "refresh_token": "j1sUrZE7FT_oN46hKEZSjlp00YFtzIJaqPh7g0C7Td4",
  "refresh_expires_at": "2026-10-29T02:32:22.293213969Z",
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
  "session_id": "676cc0a6-1aa7-4a91-90d0-b40d986bb1e0",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4NDIsImlhdCI6MTc5MzE5Nzk0MiwianRpIjoiN2QyN2NmNzktNTllMS00MjM0LWJjNDctMzFiNGI1M2EwZmM4Iiwic2lkIjoiNjc2Y2MwYTYtMWFhNy00YTkxLTkwZDAtYjQwZDk4NmJiMWUwIn0.LntGUzcY4lzj3zNIZ8uP4PBZn8qxVzwnh0RdqkUiOOw",
  "access_expires_at": "2026-10-28T14:47:22.897797189Z",
  "refresh_token": "4MyvCkvoZd1y-fHl5R16Embl-JANm0FefZKPxnKfTKc",
  "refresh_expires_at": "2026-10-29T02:32:22.89725313Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/39cb6500-893e-4ef7-b70a-deeaa5562c62/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:32:21.907094Z",
      "actor": {
        "type": "CLIENT",
        "id": "5b9c4790-e6ac-4b99-8039-fb5eaa8bac82",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "39cb6500-893e-4ef7-b70a-deeaa5562c62",
        "quote_id": "a2418adb-ad43-4065-84a7-e848463fd7b2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "335661f4-1ca6-406c-bb52-77d433d8cde6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:32:21.909553Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "39cb6500-893e-4ef7-b70a-deeaa5562c62",
        "attempt_id": "b8927322-31da-44ea-b8fa-26ad91424d88",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "335661f4-1ca6-406c-bb52-77d433d8cde6"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T14:32:21.919532Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "39cb6500-893e-4ef7-b70a-deeaa5562c62",
        "attempt_id": "b8927322-31da-44ea-b8fa-26ad91424d88"
      },
      "correlation_id": "335661f4-1ca6-406c-bb52-77d433d8cde6"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "b8927322-31da-44ea-b8fa-26ad91424d88",
        "generation": 1,
        "started_at": "2026-10-28T14:32:21.908483Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T14:32:21.919532Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T14:32:21.910472Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/335661f4-1ca6-406c-bb52-77d433d8cde6` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "39cb6500-893e-4ef7-b70a-deeaa5562c62:0",
      "order_id": "39cb6500-893e-4ef7-b70a-deeaa5562c62",
      "at": "2026-10-28T14:32:21.907094Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "39cb6500-893e-4ef7-b70a-deeaa5562c62:1",
      "order_id": "39cb6500-893e-4ef7-b70a-deeaa5562c62",
      "at": "2026-10-28T14:32:21.909553Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "39cb6500-893e-4ef7-b70a-deeaa5562c62:2",
      "order_id": "39cb6500-893e-4ef7-b70a-deeaa5562c62",
      "at": "2026-10-28T14:32:21.919532Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/15ec377c-09f6-4e08-a2f9-4c53cefeaec1` → **200**

```json
{
  "found": []
}
```

Done: request 335661f4-1ca6-406c-bb52-77d433d8cde6 — order 39cb6500-893e-4ef7-b70a-deeaa5562c62 found by its id.

`GET /api/rider/v1/orders/39cb6500-893e-4ef7-b70a-deeaa5562c62` → **200**

```json
{
  "id": "39cb6500-893e-4ef7-b70a-deeaa5562c62",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5b9c4790-e6ac-4b99-8039-fb5eaa8bac82",
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
  "created_at": "2026-10-28T14:32:21.906509Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/39cb6500-893e-4ef7-b70a-deeaa5562c62/cancel` → **200**

```json
{
  "command_id": "853a12d0-9d9d-4866-9a63-403d56702a3c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "39cb6500-893e-4ef7-b70a-deeaa5562c62",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5b9c4790-e6ac-4b99-8039-fb5eaa8bac82",
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
  "created_at": "2026-10-28T14:32:21.906509Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
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
  "phone": "+380638383471",
  "device_ref": "sandbox-26847"
}
```

```json
{
  "challenge_id": "164a9bc4-0804-45f2-a741-dcf01f29b5a2",
  "expires_at": "2026-10-28T14:37:24.679147558Z",
  "resend_available_at": "2026-10-28T14:32:25.679147558Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638383471` → **200**

```json
{
  "phone": "+380638383471",
  "audience": "CLIENT",
  "code": "982640",
  "sent_at": "2026-10-28T14:32:24.681541157Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "164a9bc4-0804-45f2-a741-dcf01f29b5a2",
  "code": "982640",
  "device_ref": "sandbox-26847"
}
```

```json
{
  "session_id": "368e1cbf-c777-4185-99f6-31a72a7b42ec",
  "subject": {
    "type": "CLIENT",
    "id": "1402bdea-e1f9-420d-802c-c03babb07d13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNDAyYmRlYS1lMWY5LTQyMGQtODAyYy1jMDNiYWJiMDdkMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4ODQ0LCJpYXQiOjE3OTMxOTc5NDQsImp0aSI6IjJjZGYyNjI2LThlOGQtNGQ0YS05NjVjLTQyMmNiOWZmYWUzZiIsInNpZCI6IjM2OGUxY2JmLWM3NzctNDE4NS05OWY2LTMxYTcyYTdiNDJlYyJ9.YCBgKefumf3F6rfClkIVhKN9u5x3PlUis1T1dHwGPWs",
  "access_expires_at": "2026-10-28T14:47:24.982650462Z",
  "refresh_token": "QMFBwmxboZCTE-HuKcYHPjg_o67mfjozX2VALq9b-SQ",
  "refresh_expires_at": "2026-11-27T14:32:24.982037059Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "e41c82bd-c2cd-4307-ba88-36327406d832",
  "expires_at": "2026-10-28T14:37:27.257772051Z",
  "resend_available_at": "2026-10-28T14:32:28.257772051Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638383471` → **200**

```json
{
  "phone": "+380638383471",
  "audience": "CLIENT",
  "code": "623705",
  "sent_at": "2026-10-28T14:32:27.2600184Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "a24923d9-9e6d-4e2e-8a12-3fe9e7e6adea",
  "challenge_id": "e41c82bd-c2cd-4307-ba88-36327406d832",
  "otp_code": "623705"
}
```

```json
{
  "id": "1de257cd-46cd-415e-8d66-c907fea6cab1",
  "state": "PENDING",
  "created_at": "2026-10-28T14:32:27.571864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/1de257cd-46cd-415e-8d66-c907fea6cab1` → **200**

```json
{
  "id": "1de257cd-46cd-415e-8d66-c907fea6cab1",
  "state": "PENDING",
  "created_at": "2026-10-28T14:32:27.571864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1de257cd-46cd-415e-8d66-c907fea6cab1` → **200**

```json
{
  "id": "1de257cd-46cd-415e-8d66-c907fea6cab1",
  "state": "PENDING",
  "created_at": "2026-10-28T14:32:27.571864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1de257cd-46cd-415e-8d66-c907fea6cab1` → **200**

```json
{
  "id": "1de257cd-46cd-415e-8d66-c907fea6cab1",
  "state": "PENDING",
  "created_at": "2026-10-28T14:32:27.571864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1de257cd-46cd-415e-8d66-c907fea6cab1` → **200**

```json
{
  "id": "1de257cd-46cd-415e-8d66-c907fea6cab1",
  "state": "PENDING",
  "created_at": "2026-10-28T14:32:27.571864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1de257cd-46cd-415e-8d66-c907fea6cab1` → **200**

```json
{
  "id": "1de257cd-46cd-415e-8d66-c907fea6cab1",
  "state": "PENDING",
  "created_at": "2026-10-28T14:32:27.571864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1de257cd-46cd-415e-8d66-c907fea6cab1` → **200**

```json
{
  "id": "1de257cd-46cd-415e-8d66-c907fea6cab1",
  "state": "PENDING",
  "created_at": "2026-10-28T14:32:27.571864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1de257cd-46cd-415e-8d66-c907fea6cab1` → **200**

```json
{
  "id": "1de257cd-46cd-415e-8d66-c907fea6cab1",
  "state": "READY",
  "created_at": "2026-10-28T14:32:27.571864Z",
  "ready_at": "2026-10-28T14:32:34.474416Z",
  "expires_at": "2026-11-04T14:32:34.474416Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/1de257cd-46cd-415e-8d66-c907fea6cab1/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634620793",
  "device_ref": "sandbox-694"
}
```

```json
{
  "challenge_id": "427c3877-06c4-4aeb-abd9-d760bca03702",
  "expires_at": "2026-10-28T14:37:35.758202344Z",
  "resend_available_at": "2026-10-28T14:32:36.758202344Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634620793` → **200**

```json
{
  "phone": "+380634620793",
  "audience": "CLIENT",
  "code": "920570",
  "sent_at": "2026-10-28T14:32:35.761057077Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "427c3877-06c4-4aeb-abd9-d760bca03702",
  "code": "920570",
  "device_ref": "sandbox-694"
}
```

```json
{
  "session_id": "ff81eb79-ca13-429c-8eac-94de4605277b",
  "subject": {
    "type": "CLIENT",
    "id": "21667e7d-9fdd-483a-815e-2ff4a013878b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTY2N2U3ZC05ZmRkLTQ4M2EtODE1ZS0yZmY0YTAxMzg3OGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4ODU2LCJpYXQiOjE3OTMxOTc5NTYsImp0aSI6ImE3ZjkzNDIxLWI3NTMtNDI2OS1iYzJlLTkzNjUyZjZkZmI1OSIsInNpZCI6ImZmODFlYjc5LWNhMTMtNDI5Yy04ZWFjLTk0ZGU0NjA1Mjc3YiJ9.PMXCUw9w4kazlM4cH2L1xz8yFT_asrdL5D9KNLBx0tI",
  "access_expires_at": "2026-10-28T14:47:36.069342447Z",
  "refresh_token": "LBve1kFCCxWgmTx502KcIz4qUBagr0WcOr9iL_sJGGo",
  "refresh_expires_at": "2026-11-27T14:32:36.057274449Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/1de257cd-46cd-415e-8d66-c907fea6cab1/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/1de257cd-46cd-415e-8d66-c907fea6cab1/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0d7305d9-4181-455a-a6b2-db6659c39fb0"
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
  "session_id": "d16711ae-85a2-4fc3-837f-fb12c6bd547f",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4NTYsImlhdCI6MTc5MzE5Nzk1NiwianRpIjoiZTg4ZWZmNzItNmJkZC00YTZjLWE3NmQtYTUwM2NkYTM1NmIyIiwic2lkIjoiZDE2NzExYWUtODVhMi00ZmMzLTgzN2YtZmIxMmM2YmQ1NDdmIn0.GawjeMdOcf-mes0FUohcFSAM1GLhl-WMMTXjUGRvBVE",
  "access_expires_at": "2026-10-28T14:47:36.946726053Z",
  "refresh_token": "8vfgMVLkAR48Zoh5LMizToAw2J--olwFqHtruGra3Oc",
  "refresh_expires_at": "2026-10-29T02:32:36.946064773Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1402bdea-e1f9-420d-802c-c03babb07d13",
  "session_id": "368e1cbf-c777-4185-99f6-31a72a7b42ec",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/1402bdea-e1f9-420d-802c-c03babb07d13/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "1de257cd-46cd-415e-8d66-c907fea6cab1",
      "state": "READY",
      "created_at": "2026-10-28T14:32:27.571864Z",
      "ready_at": "2026-10-28T14:32:34.474416Z",
      "expires_at": "2026-11-04T14:32:34.474416Z",
      "size_bytes": 1030
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
  "device_ref": "sandbox-9530"
}
```

```json
{
  "challenge_id": "712681e7-f127-4aee-ac75-31dc93daea0d",
  "expires_at": "2026-10-28T14:37:37.766994942Z",
  "resend_available_at": "2026-10-28T14:32:38.766994942Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "892173",
  "sent_at": "2026-10-28T14:32:37.769296878Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "712681e7-f127-4aee-ac75-31dc93daea0d",
  "code": "892173",
  "device_ref": "sandbox-9530"
}
```

```json
{
  "session_id": "a004e409-47de-43cb-accf-5076097e653b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODg1OCwiaWF0IjoxNzkzMTk3OTU4LCJqdGkiOiI4N2I1OWQ1Yy00MmRkLTQ4MzAtYjM1ZC0yNGNhMWZhMmM0NDAiLCJzaWQiOiJhMDA0ZTQwOS00N2RlLTQzY2ItYWNjZi01MDc2MDk3ZTY1M2IifQ.FRgy1SMgk5g98HvspIm_f8roh3xWKQsiucS2BnfNu5I",
  "access_expires_at": "2026-10-28T14:47:38.071122268Z",
  "refresh_token": "ZWwEbyFzAnYmz0DuPQng1D9qjthasjl74hKfgYa6TEQ",
  "refresh_expires_at": "2026-11-27T14:32:38.070609427Z",
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
  "device_ref": "sandbox-10943"
}
```

```json
{
  "challenge_id": "f12e0ccd-bfdc-4c2a-a2ad-c9bb4411a812",
  "expires_at": "2026-10-28T14:37:38.623983307Z",
  "resend_available_at": "2026-10-28T14:32:39.623983307Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "138204",
  "sent_at": "2026-10-28T14:32:38.626466662Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f12e0ccd-bfdc-4c2a-a2ad-c9bb4411a812",
  "code": "138204",
  "device_ref": "sandbox-10943"
}
```

```json
{
  "session_id": "6f12975d-67d2-4900-bc6f-1b0b4a1f94e7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODg1OCwiaWF0IjoxNzkzMTk3OTU4LCJqdGkiOiI2MjQ5YzJjMy1iMmJhLTQ3MDItYjkxMi1iN2IwODA5NTE1ZTUiLCJzaWQiOiI2ZjEyOTc1ZC02N2QyLTQ5MDAtYmM2Zi0xYjBiNGExZjk0ZTcifQ.meDdYaUson7SEJNhC5h2ulWbD9-wAbtJMDDofGNV5pg",
  "access_expires_at": "2026-10-28T14:47:38.918820511Z",
  "refresh_token": "XgfZ-oxlc2TPgmELblBGHFHDvN1-yB7TvZMULvv78g4",
  "refresh_expires_at": "2026-11-27T14:32:38.918273569Z",
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
  "command_id": "510100c6-28f8-4e99-8f57-15cf7f290678",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:32:39Z",
    "sequence": 1793197959453
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "961c83fa-0fe7-4dfa-987f-cdcfeb9b0b8e",
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
  "last_heartbeat_at": "2026-10-28T14:32:39.473977Z",
  "last_location_at": "2026-10-28T14:32:39.473977Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-16740"
}
```

```json
{
  "challenge_id": "c5a17b25-76cf-45ff-b6cf-c0f742e36255",
  "expires_at": "2026-10-28T14:37:39.7396851Z",
  "resend_available_at": "2026-10-28T14:32:40.7396851Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "130664",
  "sent_at": "2026-10-28T14:32:39.741966271Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c5a17b25-76cf-45ff-b6cf-c0f742e36255",
  "code": "130664",
  "device_ref": "sandbox-16740"
}
```

```json
{
  "session_id": "7d242533-5a7c-4e49-9b9e-8547e2737097",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODg2MCwiaWF0IjoxNzkzMTk3OTYwLCJqdGkiOiJlZDc0ODVlZi01MjViLTRjZmEtYWEyMy0yNjc4N2NkODgyYzciLCJzaWQiOiI3ZDI0MjUzMy01YTdjLTRlNDktOWI5ZS04NTQ3ZTI3MzcwOTcifQ.rPFTq3rmBuCLrUCPWgGFNQ_HzX_AE5rqZZLS-VSC8_g",
  "access_expires_at": "2026-10-28T14:47:40.038667179Z",
  "refresh_token": "A1Fos-mubAirv8kRdGrJ_kk6iCUpBwJqQPm19CXIr6c",
  "refresh_expires_at": "2026-11-27T14:32:40.038037181Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "54fab2a2-60fe-43d0-aacf-bc19521ea0f5",
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
  "last_heartbeat_at": "2026-10-28T14:31:27.804696Z",
  "last_location_at": "2026-10-28T14:31:27.804696Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/54fab2a2-60fe-43d0-aacf-bc19521ea0f5/handover` → **200**

```json
{
  "command_id": "de12f8b1-001c-42f3-9e2f-428b93eed216",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "54fab2a2-60fe-43d0-aacf-bc19521ea0f5",
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
  "last_heartbeat_at": "2026-10-28T14:31:27.804696Z",
  "last_location_at": "2026-10-28T14:31:27.804696Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/54fab2a2-60fe-43d0-aacf-bc19521ea0f5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:32:40Z",
    "sequence": 1793197960848
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "54fab2a2-60fe-43d0-aacf-bc19521ea0f5",
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
  "last_heartbeat_at": "2026-10-28T14:32:40.869091Z",
  "last_location_at": "2026-10-28T14:32:40.869091Z",
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
  "session_id": "147671b7-144b-48ee-bbfb-a643f9362a03",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4NjEsImlhdCI6MTc5MzE5Nzk2MSwianRpIjoiOTE1YzQ2NmMtMDhhYy00ZDMwLWFkMTctYWNhZTJiNjNiOGM5Iiwic2lkIjoiMTQ3NjcxYjctMTQ0Yi00OGVlLWJiZmItYTY0M2Y5MzYyYTAzIn0.6v3jsPt4o9gyFLIRAxPaAF-CTmhsUIkebT_UBlADDzI",
  "access_expires_at": "2026-10-28T14:47:41.470519631Z",
  "refresh_token": "ZRVudgKHTWxYMTZYuhTemjXDUlKkBvI3m-8H7LzG1Q8",
  "refresh_expires_at": "2026-10-29T02:32:41.469945728Z",
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
  "session_id": "e02e4b4c-c66b-4060-a526-9606ae122bd3",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4NjIsImlhdCI6MTc5MzE5Nzk2MiwianRpIjoiMTUyMTIzMjAtMjc1ZS00ZDE2LWJkZGEtNzRlOTY4YjNiZWY0Iiwic2lkIjoiZTAyZTRiNGMtYzY2Yi00MDYwLWE1MjYtOTYwNmFlMTIyYmQzIn0.x6ukib76FR1WzzJLqdOkW7t2ESAZa2grSqQmncrQY-M",
  "access_expires_at": "2026-10-28T14:47:42.072195185Z",
  "refresh_token": "UfBhc0zpOd5wZYCi-3AoRUu3eM6awzjCPJcL0e9252o",
  "refresh_expires_at": "2026-10-29T02:32:42.071534061Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681107358",
  "device_ref": "sandbox-19533"
}
```

```json
{
  "challenge_id": "803e6058-5cba-4eb6-bc1a-0425c78375a9",
  "expires_at": "2026-10-28T14:37:42.346390763Z",
  "resend_available_at": "2026-10-28T14:32:43.346390763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380681107358` → **200**

```json
{
  "phone": "+380681107358",
  "audience": "CLIENT",
  "code": "205975",
  "sent_at": "2026-10-28T14:32:42.348941204Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "803e6058-5cba-4eb6-bc1a-0425c78375a9",
  "code": "205975",
  "device_ref": "sandbox-19533"
}
```

```json
{
  "session_id": "584bc3bd-b57e-4a1a-a9be-fdab264ac5fc",
  "subject": {
    "type": "CLIENT",
    "id": "d6bba374-1727-4e85-8bf8-d01bb85cb7aa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmJiYTM3NC0xNzI3LTRlODUtOGJmOC1kMDFiYjg1Y2I3YWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4ODYyLCJpYXQiOjE3OTMxOTc5NjIsImp0aSI6ImIyNzVmNDQxLWE1MTktNDc2OS1iOGM1LWJkNTRiNTRlOTBiMCIsInNpZCI6IjU4NGJjM2JkLWI1N2UtNGExYS1hOWJlLWZkYWIyNjRhYzVmYyJ9.VYiERNy1e5XvGRDHD3tpbs9GbO7R5dYPz_14usZfbFE",
  "access_expires_at": "2026-10-28T14:47:42.650487529Z",
  "refresh_token": "EzFc1wouKTA3fIlWX8wypkEkJgmTC3Hy0aieRaGqO6o",
  "refresh_expires_at": "2026-11-27T14:32:42.64998934Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8f8c6eaa-3280-4904-b37a-fe4325241b0e",
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
  "id": "6046f393-d72f-43d1-8ff0-66a4358f44de",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:37:42.924353Z",
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
  "command_id": "5f10a2de-6a53-4a3c-a90b-e37d767ce3ac",
  "quote_id": "6046f393-d72f-43d1-8ff0-66a4358f44de",
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
  "id": "4e0ed246-d9df-456f-9b0d-df7f1c37c50d",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d6bba374-1727-4e85-8bf8-d01bb85cb7aa",
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
  "created_at": "2026-10-28T14:32:43.21101Z",
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
    "id": "d569471c-68f5-47ab-a6d8-fdaf2d096c4a",
    "order_id": "4e0ed246-d9df-456f-9b0d-df7f1c37c50d",
    "expires_at": "2026-10-28T14:32:58.214682Z",
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

`POST /api/driver/v1/offers/d569471c-68f5-47ab-a6d8-fdaf2d096c4a/reject` → **204**

```json
{
  "command_id": "2b26688c-b1f2-4a00-a1cd-6186cc44e79c"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "d4cbfdb4-a1e4-4777-a321-4de68748e852",
    "order_id": "4e0ed246-d9df-456f-9b0d-df7f1c37c50d",
    "expires_at": "2026-10-28T14:32:58.794112Z",
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

`POST /api/driver/v1/offers/d4cbfdb4-a1e4-4777-a321-4de68748e852/accept` → **200**

```json
{
  "command_id": "23b712c2-cf7f-4f0e-b913-ae2016846d52"
}
```

```json
{
  "id": "33c3f72e-c2a8-4039-8721-33587f5a1354",
  "order_id": "4e0ed246-d9df-456f-9b0d-df7f1c37c50d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "47af5486-b52f-444e-9a98-3a6e620bdb10",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/4e0ed246-d9df-456f-9b0d-df7f1c37c50d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:32:43.211574Z",
      "actor": {
        "type": "CLIENT",
        "id": "d6bba374-1727-4e85-8bf8-d01bb85cb7aa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4e0ed246-d9df-456f-9b0d-df7f1c37c50d",
        "quote_id": "6046f393-d72f-43d1-8ff0-66a4358f44de",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "bf75b390-ff7a-4127-865e-82b800d9f5e3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:32:43.213792Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4e0ed246-d9df-456f-9b0d-df7f1c37c50d",
        "attempt_id": "224a7d55-3631-448b-a1ab-8f91411ac4a7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "bf75b390-ff7a-4127-865e-82b800d9f5e3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:32:43.220592Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d569471c-68f5-47ab-a6d8-fdaf2d096c4a",
        "order_id": "4e0ed246-d9df-456f-9b0d-df7f1c37c50d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "bf75b390-ff7a-4127-865e-82b800d9f5e3"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T14:32:43.79304Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d569471c-68f5-47ab-a6d8-fdaf2d096c4a",
        "order_id": "4e0ed246-d9df-456f-9b0d-df7f1c37c50d"
      },
      "correlation_id": "afe63926-ad8b-4ea1-97a8-4a8e5bf5019f"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 4e0ed246-d9df-456f-9b0d-df7f1c37c50d — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/4e0ed246-d9df-456f-9b0d-df7f1c37c50d` → **200**

```json
{
  "id": "4e0ed246-d9df-456f-9b0d-df7f1c37c50d",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "d6bba374-1727-4e85-8bf8-d01bb85cb7aa",
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
    "id": "33c3f72e-c2a8-4039-8721-33587f5a1354",
    "order_id": "4e0ed246-d9df-456f-9b0d-df7f1c37c50d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "47af5486-b52f-444e-9a98-3a6e620bdb10",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:32:43.21101Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4e0ed246-d9df-456f-9b0d-df7f1c37c50d/cancel` → **200**

```json
{
  "command_id": "babab3b8-755f-44a6-ac40-4b8e100a0164",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4e0ed246-d9df-456f-9b0d-df7f1c37c50d",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d6bba374-1727-4e85-8bf8-d01bb85cb7aa",
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
    "id": "33c3f72e-c2a8-4039-8721-33587f5a1354",
    "order_id": "4e0ed246-d9df-456f-9b0d-df7f1c37c50d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "47af5486-b52f-444e-9a98-3a6e620bdb10",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:32:43.21101Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
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
  "session_id": "961c83fa-0fe7-4dfa-987f-cdcfeb9b0b8e",
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
  "last_heartbeat_at": "2026-10-28T14:32:39.473977Z",
  "last_location_at": "2026-10-28T14:32:39.473977Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/961c83fa-0fe7-4dfa-987f-cdcfeb9b0b8e/close` → **200**

```json
{
  "command_id": "2c74c78b-1cec-48f6-b9a8-72d784c3b6d7",
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
  "session_id": "54fab2a2-60fe-43d0-aacf-bc19521ea0f5",
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
  "last_heartbeat_at": "2026-10-28T14:32:40.869091Z",
  "last_location_at": "2026-10-28T14:32:40.869091Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/54fab2a2-60fe-43d0-aacf-bc19521ea0f5/close` → **200**

```json
{
  "command_id": "810c4175-ab43-4495-a99e-395fc7b51b3c",
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
  "device_ref": "sandbox-31761"
}
```

```json
{
  "challenge_id": "71cb904a-f87c-4dd4-ad0d-9547f571c68f",
  "expires_at": "2026-10-28T14:37:46.64214375Z",
  "resend_available_at": "2026-10-28T14:32:47.64214375Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "463352",
  "sent_at": "2026-10-28T14:32:46.644468135Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71cb904a-f87c-4dd4-ad0d-9547f571c68f",
  "code": "463352",
  "device_ref": "sandbox-31761"
}
```

```json
{
  "session_id": "103d412f-e707-48cf-8ce6-35df952da5f2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODg2NiwiaWF0IjoxNzkzMTk3OTY2LCJqdGkiOiI4MTljMjJmYS0wOGFjLTQ1YjUtOGMzYy0wMDIyY2JiZTcxYzMiLCJzaWQiOiIxMDNkNDEyZi1lNzA3LTQ4Y2YtOGNlNi0zNWRmOTUyZGE1ZjIifQ.-0EYDWciFIe8CnR_g6IWJysqc53vTBF7jhk0N0P-iPg",
  "access_expires_at": "2026-10-28T14:47:46.941930907Z",
  "refresh_token": "o-Muct1zwE2_rkFkNpnNVYqtYYCRF_yB7-w0wPTA1Tc",
  "refresh_expires_at": "2026-11-27T14:32:46.941388351Z",
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
  "command_id": "af5abd81-2a4a-401e-ba9b-5e82787d3b5a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:32:47Z",
    "sequence": 1793197967481
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b0bae29-ce79-4b89-86d7-8b4c205fb093",
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
  "last_heartbeat_at": "2026-10-28T14:32:47.50054Z",
  "last_location_at": "2026-10-28T14:32:47.50054Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677038401",
  "device_ref": "sandbox-14450"
}
```

```json
{
  "challenge_id": "259da999-af28-43ad-b5e1-6e662862dc06",
  "expires_at": "2026-10-28T14:37:47.772798251Z",
  "resend_available_at": "2026-10-28T14:32:48.772798251Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677038401` → **200**

```json
{
  "phone": "+380677038401",
  "audience": "CLIENT",
  "code": "769045",
  "sent_at": "2026-10-28T14:32:47.775388772Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "259da999-af28-43ad-b5e1-6e662862dc06",
  "code": "769045",
  "device_ref": "sandbox-14450"
}
```

```json
{
  "session_id": "9e5fcf54-c8e9-4b90-9795-2f1a6841d7fd",
  "subject": {
    "type": "CLIENT",
    "id": "ac0b701a-ea84-4af7-a702-f65b7bae3096"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzBiNzAxYS1lYTg0LTRhZjctYTcwMi1mNjViN2JhZTMwOTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4ODY4LCJpYXQiOjE3OTMxOTc5NjgsImp0aSI6IjQwMTQ0Y2IwLTAyYmItNGFiZC05MzliLTc4MGRhOTY1YWEzOSIsInNpZCI6IjllNWZjZjU0LWM4ZTktNGI5MC05Nzk1LTJmMWE2ODQxZDdmZCJ9.LbjefRBI_JO3J03jOTCgfXb4tgFK2B2UNuQZW1DmXDQ",
  "access_expires_at": "2026-10-28T14:47:48.07804486Z",
  "refresh_token": "4c88uFqHPfqiQqU13C0dXzyeU-12BhrST6xB97WjezE",
  "refresh_expires_at": "2026-11-27T14:32:48.077537767Z",
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
  "command_id": "de818ed5-7eb8-4309-a830-87c1bcb9f52d",
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
  "id": "e543a161-cf34-4264-b1c2-827cf39699d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:37:48.622751Z",
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
  "command_id": "cc57ba7b-b1da-488c-82b7-6b15aa934374",
  "platform": "ANDROID",
  "token": "sandbox-driver-935247a8-b05a-4f01-baa9-03e416c529f8"
}
```

```json
{
  "id": "af1aee5c-6c91-40e8-983e-dc93385afc2b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:32:48.920549Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "64eaa9cc-d572-4729-90ec-927f49a7a1d7",
  "platform": "ANDROID",
  "token": "sandbox-rider-9570a806-6b3f-476f-bcf6-89b56f6486f5"
}
```

```json
{
  "id": "ec5ffdff-3f68-44c8-8897-f52a557befd6",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:32:49.20457Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3aed8ef6-d625-4fec-9188-699c603e191f",
  "quote_id": "e543a161-cf34-4264-b1c2-827cf39699d6",
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
  "id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ac0b701a-ea84-4af7-a702-f65b7bae3096",
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
  "created_at": "2026-10-28T14:32:49.507098Z",
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
    "id": "37cf0c04-8064-437f-b60b-f0219e25273d",
    "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
    "expires_at": "2026-10-28T14:33:04.510802Z",
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

`POST /api/driver/v1/offers/37cf0c04-8064-437f-b60b-f0219e25273d/accept` → **200**

```json
{
  "command_id": "32c534a5-80b1-4159-9d65-7c1951479df7"
}
```

```json
{
  "id": "a1795876-fbb4-46ef-9a0a-3813fed68a03",
  "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c0338636-96ce-4046-bc7f-d9f0b09551de",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:32:49.479Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:32:49.479Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:32:50.892374944Z",
    "token_suffix": "c529f8",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
      "order_version": "2",
      "event_id": "07efda3c-864e-4d0e-b7b9-0df48e65094d",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677038401&after=2026-10-28T14:32:49.479Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:32:50.894502774Z",
    "token_suffix": "6486f5",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
      "order_version": "3",
      "event_id": "bcd6eb7f-2a07-4f8a-a96f-e9edac731d68",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/86972084-c4f6-4b4f-85a0-8e00ffe87aa7/messages` → **201**

```json
{
  "command_id": "7556864b-dd55-4770-8600-c30ddbc87763",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "030c0ab1-7852-4971-adc1-86ab1afff4f9",
  "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T14:32:51.465676633Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c0338636-96ce-4046-bc7f-d9f0b09551de",
  "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
  "assignment_id": "a1795876-fbb4-46ef-9a0a-3813fed68a03",
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

`POST /api/driver/v1/trips/c0338636-96ce-4046-bc7f-d9f0b09551de/messages` → **201**

```json
{
  "command_id": "611fd5dd-79eb-456a-a56d-07fef268510d",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "1c5cf06b-8490-4b56-91c5-52e954339087",
  "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T14:32:51.994700086Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/86972084-c4f6-4b4f-85a0-8e00ffe87aa7/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/c0338636-96ce-4046-bc7f-d9f0b09551de/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677038401"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/5b0bae29-ce79-4b89-86d7-8b4c205fb093/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:32:52Z",
    "sequence": 1793197972798
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b0bae29-ce79-4b89-86d7-8b4c205fb093",
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
  "last_heartbeat_at": "2026-10-28T14:32:52.81892Z",
  "last_location_at": "2026-10-28T14:32:52.81892Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c0338636-96ce-4046-bc7f-d9f0b09551de",
  "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
  "assignment_id": "a1795876-fbb4-46ef-9a0a-3813fed68a03",
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

`POST /api/driver/v1/trips/c0338636-96ce-4046-bc7f-d9f0b09551de/arrive` → **200**

```json
{
  "command_id": "7d6536f8-d67c-4e68-8639-9d41082f87aa",
  "expected_version": 0
}
```

```json
{
  "id": "c0338636-96ce-4046-bc7f-d9f0b09551de",
  "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
  "assignment_id": "a1795876-fbb4-46ef-9a0a-3813fed68a03",
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
  "arrived_at": "2026-10-28T14:32:53.357784Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c0338636-96ce-4046-bc7f-d9f0b09551de/start` → **200**

```json
{
  "command_id": "87ae1e9b-e02e-4a5f-bea9-401cfa0c2b35",
  "expected_version": 1
}
```

```json
{
  "id": "c0338636-96ce-4046-bc7f-d9f0b09551de",
  "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
  "assignment_id": "a1795876-fbb4-46ef-9a0a-3813fed68a03",
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
  "arrived_at": "2026-10-28T14:32:53.357784Z",
  "started_at": "2026-10-28T14:32:53.646872Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/5b0bae29-ce79-4b89-86d7-8b4c205fb093/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:32:53Z",
    "sequence": 1793197973916
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b0bae29-ce79-4b89-86d7-8b4c205fb093",
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
  "last_heartbeat_at": "2026-10-28T14:32:53.93793Z",
  "last_location_at": "2026-10-28T14:32:53.93793Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/c0338636-96ce-4046-bc7f-d9f0b09551de/complete` → **200**

```json
{
  "command_id": "88efbcd0-1f47-4d44-8cb4-bd584afaace3",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:32:54Z",
  "cash_received": true
}
```

```json
{
  "id": "c0338636-96ce-4046-bc7f-d9f0b09551de",
  "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
  "assignment_id": "a1795876-fbb4-46ef-9a0a-3813fed68a03",
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
  "arrived_at": "2026-10-28T14:32:53.357784Z",
  "started_at": "2026-10-28T14:32:53.646872Z",
  "completed_at": "2026-10-28T14:32:54.218173Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/86972084-c4f6-4b4f-85a0-8e00ffe87aa7` → **200**

```json
{
  "id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ac0b701a-ea84-4af7-a702-f65b7bae3096",
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
    "id": "a1795876-fbb4-46ef-9a0a-3813fed68a03",
    "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c0338636-96ce-4046-bc7f-d9f0b09551de",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:32:49.507098Z",
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
    "id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:32:49.507098Z",
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
    "id": "c0338636-96ce-4046-bc7f-d9f0b09551de",
    "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
    "order_short_number": 9,
    "created_at": "2026-10-28T14:32:50.08528Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "34281f29-bb9d-4406-9265-70d89078ce48",
    "order_id": "2fcd4e45-5906-4eee-ae50-5539400bb3ab",
    "order_short_number": 2,
    "created_at": "2026-10-28T14:31:18.568758Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d21a2125-8e52-46a7-82e2-fb9478125b3d",
    "order_id": "2c700f19-5f29-4adf-bd68-80c147943dc9",
    "order_short_number": 1,
    "created_at": "2026-10-28T14:30:59.28128Z",
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

`GET /api/rider/v1/orders/86972084-c4f6-4b4f-85a0-8e00ffe87aa7/tip` → **200**

```json
{
  "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
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
  "available_until": "2026-10-29T14:32:54.218173Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/86972084-c4f6-4b4f-85a0-8e00ffe87aa7/tip` → **201**

```json
{
  "command_id": "4c06dd08-0286-4a07-aba0-c19a6d9e57c7",
  "amount_minor": 1100
}
```

```json
{
  "id": "a4b0e55e-9753-42f5-9b07-4d9f4ae333da",
  "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T14:32:59.20337Z"
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
  "session_id": "c46414c9-e629-4d03-a922-e20dced1d343",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4NzksImlhdCI6MTc5MzE5Nzk3OSwianRpIjoiYTlhOTQ5NDktZTJhZC00NjcyLTgwODMtNDg0ZDZmMjhjYzQwIiwic2lkIjoiYzQ2NDE0YzktZTYyOS00ZDAzLWE5MjItZTIwZGNlZDFkMzQzIn0.pNbOxMeGNk8k4gEi9fqQFEdeQ6bBwFO7G0L_TnuxEQw",
  "access_expires_at": "2026-10-28T14:47:59.810409307Z",
  "refresh_token": "7kdEsM9XKHZlFngJ32BiBNiOEfd8hfh3vL1gAyN1bsg",
  "refresh_expires_at": "2026-10-29T02:32:59.809895354Z",
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
          "APP": 8,
          "PHONE": 1
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 8
        },
        "cancelled_by": {
          "STAFF": 1,
          "RIDER": 2,
          "DRIVER": 1
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
      "APP": 8,
      "PHONE": 1
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 8
    },
    "cancelled_by": {
      "STAFF": 1,
      "RIDER": 2,
      "DRIVER": 1
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
  "generated_at": "2026-10-28T14:33:00.082105244Z"
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
  "generated_at": "2026-10-28T14:33:00.36328898Z"
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
  "session_id": "cbd04fd3-f080-40a8-b4d7-7825650f23bd",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4ODAsImlhdCI6MTc5MzE5Nzk4MCwianRpIjoiMDk2OTE3NmEtYThkMC00ZTkzLWI2OTItNjJhNmE5N2FlMWY4Iiwic2lkIjoiY2JkMDRmZDMtZjA4MC00MGE4LWI0ZDctNzgyNTY1MGYyM2JkIn0.SPhRuDw7r15_GPEl8rngWjtihuFb2MNzKm1QYlks2Ic",
  "access_expires_at": "2026-10-28T14:48:00.966114051Z",
  "refresh_token": "PseTvfCyaZ6pcEvb1LhBWjLEJ4CSHqrfFEF62n6kUus",
  "refresh_expires_at": "2026-10-29T02:33:00.965611816Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/86972084-c4f6-4b4f-85a0-8e00ffe87aa7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:32:49.507793Z",
      "actor": {
        "type": "CLIENT",
        "id": "ac0b701a-ea84-4af7-a702-f65b7bae3096",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
        "quote_id": "e543a161-cf34-4264-b1c2-827cf39699d6",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "41cd0a75-47aa-42cb-a2cb-81408ba1ecb6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:32:49.509952Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
        "attempt_id": "b81e6f50-e835-403b-9a87-150e14071d61",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "41cd0a75-47aa-42cb-a2cb-81408ba1ecb6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:32:49.513837Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "37cf0c04-8064-437f-b60b-f0219e25273d",
        "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "41cd0a75-47aa-42cb-a2cb-81408ba1ecb6"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:32:50.087048Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "37cf0c04-8064-437f-b60b-f0219e25273d",
        "order_id": "86972084-c4f6-4b4f-85a0-8e00ffe87aa7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a1795876-fbb4-46ef-9a0a-3813fed68a03"
      },
      "correlation_id": "e0942481-1d3d-4a2c-8b0f-7c7efdb682fc"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T14:33:01.51055674Z",
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
      "last_location_at": "2026-10-28T14:32:53.93793Z",
      "order_id": null
    }
  ]
}
```

Done: order 86972084-c4f6-4b4f-85a0-8e00ffe87aa7.

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
  "session_id": "84bf376f-1cba-4d45-85ef-e22afcb1a8b8",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4ODIsImlhdCI6MTc5MzE5Nzk4MiwianRpIjoiYzAyYzc4YTctYTEwMC00N2ZjLWJhZDEtNWRlNTAyYmFiYmY4Iiwic2lkIjoiODRiZjM3NmYtMWNiYS00ZDQ1LTg1ZWYtZTIyYWZjYjFhOGI4In0.XfCrtDk42QTVa6KqiNYxnf3yHIEdmrRHPdPqs4-U28I",
  "access_expires_at": "2026-10-28T14:48:02.135473767Z",
  "refresh_token": "ILZvE90_J5mM7dt8QZYnl1ig7MtQYQd5gLWkZW3DrNg",
  "refresh_expires_at": "2026-10-29T02:33:02.13486395Z",
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
  "command_id": "a4940bd3-08ba-4764-8eeb-fb3be6833d92",
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
  "timestamp": "2026-10-28T14:33:02.000+0000",
  "channel": {
    "id": "1730052000.736530822",
    "linkedid": "1730052000.736530822",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677331799"
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
  "timestamp": "2026-10-28T14:33:02.000+0000",
  "channel": {
    "id": "1730052000.736530822",
    "linkedid": "1730052000.736530822",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677331799"
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
  "session_id": "f8022191-c871-482f-b64e-8e257dd8e924",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4ODMsImlhdCI6MTc5MzE5Nzk4MywianRpIjoiZTRkMzc2N2ItOWIwMy00ZDk2LThiZTUtYTMyMDdhNWE3NjIwIiwic2lkIjoiZjgwMjIxOTEtYzg3MS00ODJmLWI2NGUtOGUyNTdkZDhlOTI0In0.U-oK_D4awB4CRny9TFzNgf1DbH6cVIAhwUHCzYUBBTA",
  "access_expires_at": "2026-10-28T14:48:03.331450804Z",
  "refresh_token": "_ksYKRCNI7rw7WDaEriKdMTP_dSBl8Eiq6dbOs-XHBQ",
  "refresh_expires_at": "2026-10-29T02:33:03.33079665Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "6e7fe11c-5509-4925-936a-a690b0be4306",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677331799",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:33:02Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/6e7fe11c-5509-4925-936a-a690b0be4306/answer` → **200**

```json
{
  "command_id": "1bde800c-25d4-488b-9206-273fd16e06b7"
}
```

```json
{
  "id": "6e7fe11c-5509-4925-936a-a690b0be4306",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677331799",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "order_ids": [],
  "started_at": "2026-10-28T14:33:02Z",
  "answered_at": "2026-10-28T14:33:03.907128Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.736530822",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e72ba36f-8d5c-49f0-a0f4-f07fafba19d0",
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
  "id": "ce346448-793d-4950-80ee-0b8207cd73cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:38:04.214549Z",
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
  "command_id": "154738f6-3097-48d9-8da3-13aade4612a7",
  "quote_id": "ce346448-793d-4950-80ee-0b8207cd73cc",
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
    "phone": "+380677331799"
  },
  "call_id": "6e7fe11c-5509-4925-936a-a690b0be4306"
}
```

```json
{
  "id": "5c19500a-f17e-4bfd-aec9-7a329a9e921b",
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
  "created_at": "2026-10-28T14:33:04.500787Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677331799"
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
    "id": "1730052000.736530822",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "6e7fe11c-5509-4925-936a-a690b0be4306",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677331799",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_ids": [
        "5c19500a-f17e-4bfd-aec9-7a329a9e921b"
      ],
      "started_at": "2026-10-28T14:33:02Z",
      "answered_at": "2026-10-28T14:33:03.907128Z",
      "ended_at": "2026-10-28T14:33:04.804545Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "f07179d9-f3bc-427c-b726-4c4efa6fe580",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670916838",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_ids": [],
      "started_at": "2026-10-28T14:31:07.493734Z",
      "answered_at": "2026-10-28T14:31:07.814727Z",
      "ended_at": "2026-10-28T14:31:08.117706Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:31:14.455842Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/5c19500a-f17e-4bfd-aec9-7a329a9e921b` → **200**

```json
{
  "id": "5c19500a-f17e-4bfd-aec9-7a329a9e921b",
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
  "created_at": "2026-10-28T14:33:04.500787Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677331799"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/5c19500a-f17e-4bfd-aec9-7a329a9e921b` → **200**

```json
{
  "id": "5c19500a-f17e-4bfd-aec9-7a329a9e921b",
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
  "created_at": "2026-10-28T14:33:04.500787Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677331799"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5c19500a-f17e-4bfd-aec9-7a329a9e921b/cancel` → **200**

```json
{
  "command_id": "69b677c0-35e0-4512-a3ed-43b68290e832",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5c19500a-f17e-4bfd-aec9-7a329a9e921b",
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
  "created_at": "2026-10-28T14:33:04.500787Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677331799"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 6e7fe11c-5509-4925-936a-a690b0be4306 with order 5c19500a-f17e-4bfd-aec9-7a329a9e921b.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28327"
}
```

```json
{
  "challenge_id": "6ef497cc-8029-4b40-9f15-1f91b490f53e",
  "expires_at": "2026-10-28T14:38:05.991968054Z",
  "resend_available_at": "2026-10-28T14:33:06.991968054Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "197253",
  "sent_at": "2026-10-28T14:33:05.995153585Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ef497cc-8029-4b40-9f15-1f91b490f53e",
  "code": "197253",
  "device_ref": "sandbox-28327"
}
```

```json
{
  "session_id": "b6e0713e-acbf-461b-8118-11ad36a5ca0c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODg4NiwiaWF0IjoxNzkzMTk3OTg2LCJqdGkiOiJhMDRkMzk5MS1jZDhmLTRiNTItOTk1Yi00MDI1YWI3MjliN2EiLCJzaWQiOiJiNmUwNzEzZS1hY2JmLTQ2MWItODExOC0xMWFkMzZhNWNhMGMifQ.qxbk4cwucIvZXunz4Gg25b7novu49tv86SlKA8eg7-w",
  "access_expires_at": "2026-10-28T14:48:06.287478497Z",
  "refresh_token": "b-04n3hx9-ZCWN6asxw6MXIIqeV8CuqYSwmYdsvdD_U",
  "refresh_expires_at": "2026-11-27T14:33:06.286955661Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b0bae29-ce79-4b89-86d7-8b4c205fb093",
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
  "last_heartbeat_at": "2026-10-28T14:32:53.93793Z",
  "last_location_at": "2026-10-28T14:32:53.93793Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b0bae29-ce79-4b89-86d7-8b4c205fb093/handover` → **200**

```json
{
  "command_id": "c67effbf-7e85-400f-bb68-3246f243b49e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b0bae29-ce79-4b89-86d7-8b4c205fb093",
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
  "last_heartbeat_at": "2026-10-28T14:32:53.93793Z",
  "last_location_at": "2026-10-28T14:32:53.93793Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b0bae29-ce79-4b89-86d7-8b4c205fb093/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:33:07Z",
    "sequence": 1793197987119
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b0bae29-ce79-4b89-86d7-8b4c205fb093",
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
  "last_heartbeat_at": "2026-10-28T14:33:07.139209Z",
  "last_location_at": "2026-10-28T14:33:07.139209Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665414862",
  "device_ref": "sandbox-32056"
}
```

```json
{
  "challenge_id": "658f0e57-c7c7-4572-9fc7-f0dba09f6749",
  "expires_at": "2026-10-28T14:38:07.41522038Z",
  "resend_available_at": "2026-10-28T14:33:08.41522038Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665414862` → **200**

```json
{
  "phone": "+380665414862",
  "audience": "CLIENT",
  "code": "630894",
  "sent_at": "2026-10-28T14:33:07.417618617Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "658f0e57-c7c7-4572-9fc7-f0dba09f6749",
  "code": "630894",
  "device_ref": "sandbox-32056"
}
```

```json
{
  "session_id": "134ecf08-39d7-4970-a949-f536cfa53fbb",
  "subject": {
    "type": "CLIENT",
    "id": "52e6b0b5-f6af-4abd-802c-cdba67277bdd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmU2YjBiNS1mNmFmLTRhYmQtODAyYy1jZGJhNjcyNzdiZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4ODg3LCJpYXQiOjE3OTMxOTc5ODcsImp0aSI6ImMzMWU4ZmI5LTM2M2ItNGU0OC04NjQxLWEzYjJlMDM3OWFlMSIsInNpZCI6IjEzNGVjZjA4LTM5ZDctNDk3MC1hOTQ5LWY1MzZjZmE1M2ZiYiJ9.L_QXSGJ1PvWPnQ4CArh9MxZ5yL4Z50SxElxKYZfxdKs",
  "access_expires_at": "2026-10-28T14:48:07.722612768Z",
  "refresh_token": "_rAoGdx6maeEYxgcXzdE03O3p9oTnai1sUkEWu8ez4Y",
  "refresh_expires_at": "2026-11-27T14:33:07.722012676Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cb34e3ba-c56e-4879-9277-5d9196e80caf",
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
  "id": "70a2cce4-76f3-49b0-95c4-aecede293c6a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:38:08.001631Z",
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
  "command_id": "0ea5ffda-c485-4497-9751-2e0f189683d5",
  "quote_id": "70a2cce4-76f3-49b0-95c4-aecede293c6a",
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
  "id": "b316378f-bf17-4819-a2e4-e4118876c616",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52e6b0b5-f6af-4abd-802c-cdba67277bdd",
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
  "created_at": "2026-10-28T14:33:08.285699Z",
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
    "id": "03edacbb-7010-4472-9eba-8a1355c8f923",
    "order_id": "b316378f-bf17-4819-a2e4-e4118876c616",
    "expires_at": "2026-10-28T14:33:23.288823Z",
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

`POST /api/driver/v1/offers/03edacbb-7010-4472-9eba-8a1355c8f923/accept` → **200**

```json
{
  "command_id": "2eb63f6e-b250-4b32-a0da-7567080d020e"
}
```

```json
{
  "id": "57293d96-69c1-4de7-b575-e4512db7d300",
  "order_id": "b316378f-bf17-4819-a2e4-e4118876c616",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e784171-1aff-49dd-989f-a774471ff13b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e784171-1aff-49dd-989f-a774471ff13b",
  "order_id": "b316378f-bf17-4819-a2e4-e4118876c616",
  "assignment_id": "57293d96-69c1-4de7-b575-e4512db7d300",
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

`POST /api/driver/v1/work-sessions/5b0bae29-ce79-4b89-86d7-8b4c205fb093/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:33:09Z",
    "sequence": 1793197989398
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b0bae29-ce79-4b89-86d7-8b4c205fb093",
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
  "last_heartbeat_at": "2026-10-28T14:33:09.419027Z",
  "last_location_at": "2026-10-28T14:33:09.419027Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3e784171-1aff-49dd-989f-a774471ff13b/arrive` → **200**

```json
{
  "command_id": "7f098fec-3766-487d-8b82-3b1b797e1c35",
  "expected_version": 0
}
```

```json
{
  "id": "3e784171-1aff-49dd-989f-a774471ff13b",
  "order_id": "b316378f-bf17-4819-a2e4-e4118876c616",
  "assignment_id": "57293d96-69c1-4de7-b575-e4512db7d300",
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
  "arrived_at": "2026-10-28T14:33:09.697788Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3e784171-1aff-49dd-989f-a774471ff13b/start` → **200**

```json
{
  "command_id": "02a84d57-6063-4a5b-bcd6-87818c179156",
  "expected_version": 1
}
```

```json
{
  "id": "3e784171-1aff-49dd-989f-a774471ff13b",
  "order_id": "b316378f-bf17-4819-a2e4-e4118876c616",
  "assignment_id": "57293d96-69c1-4de7-b575-e4512db7d300",
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
  "arrived_at": "2026-10-28T14:33:09.697788Z",
  "started_at": "2026-10-28T14:33:09.984035Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/5b0bae29-ce79-4b89-86d7-8b4c205fb093/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:33:10Z",
    "sequence": 1793197990259
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b0bae29-ce79-4b89-86d7-8b4c205fb093",
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
  "last_heartbeat_at": "2026-10-28T14:33:10.279826Z",
  "last_location_at": "2026-10-28T14:33:10.279826Z",
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
  "device_ref": "sandbox-25033"
}
```

```json
{
  "challenge_id": "000d55d0-61a5-4717-ac05-f52cc57b4876",
  "expires_at": "2026-10-28T14:38:10.561595318Z",
  "resend_available_at": "2026-10-28T14:33:11.561595318Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "796301",
  "sent_at": "2026-10-28T14:33:10.564447187Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "000d55d0-61a5-4717-ac05-f52cc57b4876",
  "code": "796301",
  "device_ref": "sandbox-25033"
}
```

```json
{
  "session_id": "dc30b036-7541-4c9f-909b-1b4cb183732a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODg5MCwiaWF0IjoxNzkzMTk3OTkwLCJqdGkiOiJlODUzYTI2Zi01NmJlLTQ3OGEtYjE0Yi0xNDNiYWYyZWUxZjAiLCJzaWQiOiJkYzMwYjAzNi03NTQxLTRjOWYtOTA5Yi0xYjRjYjE4MzczMmEifQ.C04Q9EcCgKYpQ_mGs2fc6zx85bi6EkXpdbbTueB-1Xw",
  "access_expires_at": "2026-10-28T14:48:10.878000189Z",
  "refresh_token": "AQv0ihH_sP8mZIl1tKaOIEytXGcAuxE31_E1NMSeVd8",
  "refresh_expires_at": "2026-11-27T14:33:10.877410943Z",
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
  "command_id": "06780fd3-5444-4bec-a02d-e42b6e064299",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:33:11Z",
    "sequence": 1793197991409
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "28aade1c-4f17-4c68-9c70-74974f017f22",
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
  "last_heartbeat_at": "2026-10-28T14:33:11.428508Z",
  "last_location_at": "2026-10-28T14:33:11.428508Z",
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
  "session_id": "b73da00a-b71e-4a43-b92b-a7fae20448bf",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4OTIsImlhdCI6MTc5MzE5Nzk5MiwianRpIjoiN2JiYzIxNGEtZWIzMi00MjIwLWI1YTgtN2M0YTBkMzExY2FjIiwic2lkIjoiYjczZGEwMGEtYjcxZS00YTQzLWI5MmItYTdmYWUyMDQ0OGJmIn0.A377PpQY-De4p7tmqmSHJxgW2N-fPvHDzJWOlv4ebj0",
  "access_expires_at": "2026-10-28T14:48:12.034874497Z",
  "refresh_token": "1qDOQ2LBBfaG1hGxkt6ifDvPB986rnsgPBdp-7Th1UM",
  "refresh_expires_at": "2026-10-29T02:33:12.034325762Z",
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
  "session_id": "dea63710-fa2f-42e8-9f85-b2d0eea26f46",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg4OTIsImlhdCI6MTc5MzE5Nzk5MiwianRpIjoiZWI5NzFlNWItOGFhYy00N2JkLTkzNmQtM2E2YTNmMmYwYmUzIiwic2lkIjoiZGVhNjM3MTAtZmEyZi00MmU4LTlmODUtYjJkMGVlYTI2ZjQ2In0.L7_-x8AjyolzcxDsz0pFgZwB3uwA0zzSPfX3gGz2AWE",
  "access_expires_at": "2026-10-28T14:48:12.631353658Z",
  "refresh_token": "kqH-wN9wcNcowMCDyeSb2wtOyxvL-d18hm2hmM-asb4",
  "refresh_expires_at": "2026-10-29T02:33:12.630775809Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b316378f-bf17-4819-a2e4-e4118876c616` → **200**

```json
{
  "id": "b316378f-bf17-4819-a2e4-e4118876c616",
  "short_number": 11,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "52e6b0b5-f6af-4abd-802c-cdba67277bdd",
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
    "id": "57293d96-69c1-4de7-b575-e4512db7d300",
    "order_id": "b316378f-bf17-4819-a2e4-e4118876c616",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3e784171-1aff-49dd-989f-a774471ff13b",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T14:33:08.285699Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b316378f-bf17-4819-a2e4-e4118876c616/interrupt` → **200**

```json
{
  "command_id": "7b568937-2da4-4174-910a-6d50588e9663",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "b316378f-bf17-4819-a2e4-e4118876c616",
    "short_number": 11,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "52e6b0b5-f6af-4abd-802c-cdba67277bdd",
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
      "id": "57293d96-69c1-4de7-b575-e4512db7d300",
      "order_id": "b316378f-bf17-4819-a2e4-e4118876c616",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "3e784171-1aff-49dd-989f-a774471ff13b",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T14:33:08.285699Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "4919d89e-b94f-4fa0-bf58-df4b1fb06af5",
    "short_number": 12,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "52e6b0b5-f6af-4abd-802c-cdba67277bdd",
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
    "id": "926b39f0-2dea-4a14-b9bc-c665d22067e6",
    "order_id": "4919d89e-b94f-4fa0-bf58-df4b1fb06af5",
    "expires_at": "2026-10-28T14:33:28.217185Z",
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

`POST /api/driver/v1/offers/926b39f0-2dea-4a14-b9bc-c665d22067e6/accept` → **200**

```json
{
  "command_id": "52c1c360-12b7-4987-9ec3-c212949a296d"
}
```

```json
{
  "id": "93725c4c-6087-4b41-a9d3-d7687dcd00da",
  "order_id": "4919d89e-b94f-4fa0-bf58-df4b1fb06af5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6f1c5874-dd87-4e0e-8868-a82bafabd3f8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6f1c5874-dd87-4e0e-8868-a82bafabd3f8",
  "order_id": "4919d89e-b94f-4fa0-bf58-df4b1fb06af5",
  "assignment_id": "93725c4c-6087-4b41-a9d3-d7687dcd00da",
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
  "session_id": "28aade1c-4f17-4c68-9c70-74974f017f22",
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
  "last_heartbeat_at": "2026-10-28T14:33:11.428508Z",
  "last_location_at": "2026-10-28T14:33:11.428508Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/28aade1c-4f17-4c68-9c70-74974f017f22/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:33:14Z",
    "sequence": 1793197994630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "28aade1c-4f17-4c68-9c70-74974f017f22",
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
  "last_heartbeat_at": "2026-10-28T14:33:14.651102Z",
  "last_location_at": "2026-10-28T14:33:14.651102Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6f1c5874-dd87-4e0e-8868-a82bafabd3f8/arrive` → **200**

```json
{
  "command_id": "07356225-e7a3-40dc-8c42-eb0071f26cad",
  "expected_version": 0
}
```

```json
{
  "id": "6f1c5874-dd87-4e0e-8868-a82bafabd3f8",
  "order_id": "4919d89e-b94f-4fa0-bf58-df4b1fb06af5",
  "assignment_id": "93725c4c-6087-4b41-a9d3-d7687dcd00da",
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
  "arrived_at": "2026-10-28T14:33:14.931352Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6f1c5874-dd87-4e0e-8868-a82bafabd3f8/start` → **200**

```json
{
  "command_id": "f57ff72d-ae8a-44ca-9781-6b7bd2c618fe",
  "expected_version": 1
}
```

```json
{
  "id": "6f1c5874-dd87-4e0e-8868-a82bafabd3f8",
  "order_id": "4919d89e-b94f-4fa0-bf58-df4b1fb06af5",
  "assignment_id": "93725c4c-6087-4b41-a9d3-d7687dcd00da",
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
  "arrived_at": "2026-10-28T14:33:14.931352Z",
  "started_at": "2026-10-28T14:33:15.217264Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6f1c5874-dd87-4e0e-8868-a82bafabd3f8/complete` → **200**

```json
{
  "command_id": "a3857ccc-bab3-43b4-8967-0a9ad9746833",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:33:15Z"
}
```

```json
{
  "id": "6f1c5874-dd87-4e0e-8868-a82bafabd3f8",
  "order_id": "4919d89e-b94f-4fa0-bf58-df4b1fb06af5",
  "assignment_id": "93725c4c-6087-4b41-a9d3-d7687dcd00da",
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
  "arrived_at": "2026-10-28T14:33:14.931352Z",
  "started_at": "2026-10-28T14:33:15.217264Z",
  "completed_at": "2026-10-28T14:33:15.507661Z",
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
    "id": "4919d89e-b94f-4fa0-bf58-df4b1fb06af5",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:33:13.208584Z",
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
    "id": "b316378f-bf17-4819-a2e4-e4118876c616",
    "short_number": 11,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:33:08.285699Z",
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
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
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

`GET /api/operator/v1/orders/b316378f-bf17-4819-a2e4-e4118876c616/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:33:08.28619Z",
      "actor": {
        "type": "CLIENT",
        "id": "52e6b0b5-f6af-4abd-802c-cdba67277bdd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b316378f-bf17-4819-a2e4-e4118876c616",
        "quote_id": "70a2cce4-76f3-49b0-95c4-aecede293c6a",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "818f4d29-3e9b-4aaf-8fc7-a04ce044e08d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:33:08.288078Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b316378f-bf17-4819-a2e4-e4118876c616",
        "attempt_id": "e7efbcb6-961c-4884-9dd5-c86c10f73c3a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "818f4d29-3e9b-4aaf-8fc7-a04ce044e08d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:33:08.290917Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "03edacbb-7010-4472-9eba-8a1355c8f923",
        "order_id": "b316378f-bf17-4819-a2e4-e4118876c616",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "818f4d29-3e9b-4aaf-8fc7-a04ce044e08d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:33:08.857663Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "03edacbb-7010-4472-9eba-8a1355c8f923",
        "order_id": "b316378f-bf17-4819-a2e4-e4118876c616",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "57293d96-69c1-4de7-b575-e4512db7d300"
      },
      "correlation_id": "28b55b79-3608-4378-84de-b53c7c6f4bf3"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/4919d89e-b94f-4fa0-bf58-df4b1fb06af5/tip` → **200**

```json
{
  "order_id": "4919d89e-b94f-4fa0-bf58-df4b1fb06af5",
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
  "available_until": "2026-10-29T14:33:15.507661Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/4919d89e-b94f-4fa0-bf58-df4b1fb06af5/tip` → **409**

```json
{
  "command_id": "e1cb6e9d-853d-48f6-ba6f-966810875af7",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/4919d89e-b94f-4fa0-bf58-df4b1fb06af5/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "575ab67c-1319-4534-9232-f6fbcd5779b3"
}
```

Done: interrupted b316378f-bf17-4819-a2e4-e4118876c616, follow-up 4919d89e-b94f-4fa0-bf58-df4b1fb06af5.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b0bae29-ce79-4b89-86d7-8b4c205fb093",
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
  "last_heartbeat_at": "2026-10-28T14:33:10.279826Z",
  "last_location_at": "2026-10-28T14:33:10.279826Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b0bae29-ce79-4b89-86d7-8b4c205fb093/close` → **200**

```json
{
  "command_id": "e24809bc-dcfa-4921-bfa0-fa4fcb828185",
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
  "session_id": "28aade1c-4f17-4c68-9c70-74974f017f22",
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
  "last_heartbeat_at": "2026-10-28T14:33:14.651102Z",
  "last_location_at": "2026-10-28T14:33:14.651102Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/28aade1c-4f17-4c68-9c70-74974f017f22/close` → **200**

```json
{
  "command_id": "ec0a2229-1baf-4160-b26e-4a807e6dc963",
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
  "session_id": "97e53725-0c57-4063-ba70-c03d0769627b",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5MDEsImlhdCI6MTc5MzE5ODAwMSwianRpIjoiZTljY2EwZDUtYThiNC00MzIwLWIzNzYtNzU0ODI0ODVjY2JmIiwic2lkIjoiOTdlNTM3MjUtMGM1Ny00MDYzLWJhNzAtYzAzZDA3Njk2MjdiIn0.FP3XScHKC2wVY2uHrv_lAulqSnWistQfyxH0OBwCNs4",
  "access_expires_at": "2026-10-28T14:48:21.621642882Z",
  "refresh_token": "9eCsn8nojjlY3H2BS1flDDjPo0liruwMqMK5MxmjR9A",
  "refresh_expires_at": "2026-10-29T02:33:21.62106942Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a2812b69-56f3-47d1-bae6-3a037bf17924",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:33:21Z"
}
```

```json
{
  "id": "c841d02e-a0e6-42a2-8f12-84076cc58766",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:33:21Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/c841d02e-a0e6-42a2-8f12-84076cc58766/publish` → **200**

```json
{
  "command_id": "8b57ce8c-2ea3-423a-bc39-450ad6ea6dd9",
  "expected_version": 0
}
```

```json
{
  "id": "c841d02e-a0e6-42a2-8f12-84076cc58766",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:33:22.191106Z",
  "published_at": "2026-10-28T14:33:22.191106Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "c841d02e-a0e6-42a2-8f12-84076cc58766",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T14:33:22.191106Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639522254",
  "device_ref": "sandbox-13462"
}
```

```json
{
  "challenge_id": "32d6e2b2-06fd-496a-b1a6-96762a03d8b9",
  "expires_at": "2026-10-28T14:38:22.725998229Z",
  "resend_available_at": "2026-10-28T14:33:23.725998229Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639522254` → **200**

```json
{
  "phone": "+380639522254",
  "audience": "CLIENT",
  "code": "021573",
  "sent_at": "2026-10-28T14:33:22.728468775Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32d6e2b2-06fd-496a-b1a6-96762a03d8b9",
  "code": "021573",
  "device_ref": "sandbox-13462"
}
```

```json
{
  "session_id": "68f3bc40-1109-45e2-8681-5cd3f36e103f",
  "subject": {
    "type": "CLIENT",
    "id": "2e1dac79-e19d-483f-b81d-0af7f8fc8088"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTFkYWM3OS1lMTlkLTQ4M2YtYjgxZC0wYWY3ZjhmYzgwODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4OTAzLCJpYXQiOjE3OTMxOTgwMDMsImp0aSI6IjdhOWY4NGNmLTcyMDUtNGRjMS04NjY5LTA0Yzc0ZmFhOTNmZCIsInNpZCI6IjY4ZjNiYzQwLTExMDktNDVlMi04NjgxLTVjZDNmMzZlMTAzZiJ9.7NEvUVi2qiLTSiWPi650DaA9Im-AU0CgAer4qX_Ygh0",
  "access_expires_at": "2026-10-28T14:48:23.020202941Z",
  "refresh_token": "jvimpNtNowznE9A1q9ivIJ7e5nbOtsKsj-8tzzGt-OY",
  "refresh_expires_at": "2026-11-27T14:33:23.019648698Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "c841d02e-a0e6-42a2-8f12-84076cc58766",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T14:33:22.191106Z",
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
  "command_id": "ff05e48a-f58e-470d-a572-751db2c7d0c0",
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
  "id": "422ed589-75d9-4cac-97bf-34b7d835e4dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:38:23.569197Z",
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
  "command_id": "6d552dd9-cab5-4348-bc0f-ab17594460ca",
  "quote_id": "422ed589-75d9-4cac-97bf-34b7d835e4dc",
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
  "correlation_id": "1ec06fe6-fa3f-48fe-b373-bff0ad7232bc"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "d3462888-7fe0-4ad1-a471-5971d864225e",
  "version_id": "c841d02e-a0e6-42a2-8f12-84076cc58766",
  "language": "uk"
}
```

```json
{
  "version_id": "c841d02e-a0e6-42a2-8f12-84076cc58766",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T14:33:24.168279Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0bad83e6-2a1b-45c3-88f5-01b199a75c62",
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
  "id": "57dc4a55-388d-4f98-bb70-97e036387a7b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:38:24.447252Z",
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
  "command_id": "861a95ac-740a-400d-9da8-81053722796b",
  "quote_id": "57dc4a55-388d-4f98-bb70-97e036387a7b",
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
  "id": "5b0d6bad-22db-49cc-9ce1-99c297b8bd6d",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2e1dac79-e19d-483f-b81d-0af7f8fc8088",
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
  "created_at": "2026-10-28T14:33:24.729196Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5b0d6bad-22db-49cc-9ce1-99c297b8bd6d` → **200**

```json
{
  "id": "5b0d6bad-22db-49cc-9ce1-99c297b8bd6d",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2e1dac79-e19d-483f-b81d-0af7f8fc8088",
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
  "created_at": "2026-10-28T14:33:24.729196Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5b0d6bad-22db-49cc-9ce1-99c297b8bd6d/cancel` → **200**

```json
{
  "command_id": "3179a7b6-abc1-46eb-aa00-48f1856d9c76",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5b0d6bad-22db-49cc-9ce1-99c297b8bd6d",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2e1dac79-e19d-483f-b81d-0af7f8fc8088",
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
  "created_at": "2026-10-28T14:33:24.729196Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
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

`POST /api/admin/v1/legal-documents/c841d02e-a0e6-42a2-8f12-84076cc58766` → **409**

```json
{
  "command_id": "774bf850-f62c-448a-9c42-a18ddfd183f7",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:33:25Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/c841d02e-a0e6-42a2-8f12-84076cc58766",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8c8ef78b-bffe-40de-b854-9ebc7e0ad6ad"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "e34b04d9-29b1-433a-a08e-f50c024c4e5f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:33:25Z"
}
```

```json
{
  "id": "ebfbcff7-ec2b-4717-a8ba-1a857c71a4f8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:33:25Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/ebfbcff7-ec2b-4717-a8ba-1a857c71a4f8/publish` → **200**

```json
{
  "command_id": "b1aed53a-97a7-4fea-84de-6152cc701f14",
  "expected_version": 0
}
```

```json
{
  "id": "ebfbcff7-ec2b-4717-a8ba-1a857c71a4f8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:33:26.184886Z",
  "published_at": "2026-10-28T14:33:26.184886Z",
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
  "device_ref": "sandbox-14117"
}
```

```json
{
  "challenge_id": "5c5d8e74-8edd-45bf-9900-edae86f9f541",
  "expires_at": "2026-10-28T14:38:26.463880886Z",
  "resend_available_at": "2026-10-28T14:33:27.463880886Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "663248",
  "sent_at": "2026-10-28T14:33:26.466036323Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c5d8e74-8edd-45bf-9900-edae86f9f541",
  "code": "663248",
  "device_ref": "sandbox-14117"
}
```

```json
{
  "session_id": "b20a09ea-5567-4175-8331-2034cafa2dc3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODkwNiwiaWF0IjoxNzkzMTk4MDA2LCJqdGkiOiJmNzU5ZTk5MS05NWEzLTQ5YTItODQ1My1hZDI0N2Y5YmU3ZTIiLCJzaWQiOiJiMjBhMDllYS01NTY3LTQxNzUtODMzMS0yMDM0Y2FmYTJkYzMifQ.lwGFXvkK2VYllfYB6w-MxzqelSNqOCAslmmPR6MY8BA",
  "access_expires_at": "2026-10-28T14:48:26.764662856Z",
  "refresh_token": "I1pDENYXvDO9T6hYQmOdHj07XY6GIM6Vmi_plH5yP5s",
  "refresh_expires_at": "2026-11-27T14:33:26.764118962Z",
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
  "command_id": "f95b6542-5881-4b89-8982-fe0584089e34",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:33:27Z",
    "sequence": 1793198007297
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ed00e102-dc1b-4a77-ac54-fd3e89e4c991",
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
  "last_heartbeat_at": "2026-10-28T14:33:27.316783Z",
  "last_location_at": "2026-10-28T14:33:27.316783Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674394356",
  "device_ref": "sandbox-2263"
}
```

```json
{
  "challenge_id": "a9efe93c-8915-445e-a241-3377e27b17d8",
  "expires_at": "2026-10-28T14:38:27.591214813Z",
  "resend_available_at": "2026-10-28T14:33:28.591214813Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674394356` → **200**

```json
{
  "phone": "+380674394356",
  "audience": "CLIENT",
  "code": "360644",
  "sent_at": "2026-10-28T14:33:27.593392779Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9efe93c-8915-445e-a241-3377e27b17d8",
  "code": "360644",
  "device_ref": "sandbox-2263"
}
```

```json
{
  "session_id": "ced545a1-db3b-4833-a1f9-c8a9255f8b1d",
  "subject": {
    "type": "CLIENT",
    "id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjBmMWRiZS1kNWE3LTRhMGUtOTI1Zi1mNjk3ZGQzNGVmZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4OTA3LCJpYXQiOjE3OTMxOTgwMDcsImp0aSI6ImRlMzU5NWQ1LTA0ZDUtNDYwZS1hNTVhLTc5ZTlkZWVjMTUwNSIsInNpZCI6ImNlZDU0NWExLWRiM2ItNDgzMy1hMWY5LWM4YTkyNTVmOGIxZCJ9._9q6wLWifU-dLF4tvZ_oaA7wJc70sfIPQNPB3crcXhw",
  "access_expires_at": "2026-10-28T14:48:27.886810569Z",
  "refresh_token": "1bnIoBZi70Md9QfBOH9mt-IEST6J22T1jLyKFXlvMVA",
  "refresh_expires_at": "2026-11-27T14:33:27.886309461Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8b0bb716-8949-4fb9-942b-f979bf9f428b",
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
  "id": "d07b8b16-63e0-4c62-8b72-05ce31785dd8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:38:28.156867Z",
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
  "command_id": "85b756ca-6980-4fcb-a51e-c8362c014a13",
  "quote_id": "d07b8b16-63e0-4c62-8b72-05ce31785dd8",
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
    "phone": "+380674858790"
  }
}
```

```json
{
  "id": "0def5403-f437-4659-876c-7027d84443cd",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6",
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
  "created_at": "2026-10-28T14:33:28.445129Z",
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
    "id": "cd27839e-0e8b-4d02-9fee-208762b2a80b",
    "order_id": "0def5403-f437-4659-876c-7027d84443cd",
    "expires_at": "2026-10-28T14:33:43.449068Z",
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

`POST /api/driver/v1/offers/cd27839e-0e8b-4d02-9fee-208762b2a80b/accept` → **200**

```json
{
  "command_id": "8ef3278c-1fcb-48ae-bd19-84433605ea0f"
}
```

```json
{
  "id": "1e37e7e7-735f-45d4-8218-e7ce0c589865",
  "order_id": "0def5403-f437-4659-876c-7027d84443cd",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dd6d4ef7-38cf-4226-8e57-d1f8f0c07f8c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dd6d4ef7-38cf-4226-8e57-d1f8f0c07f8c",
  "order_id": "0def5403-f437-4659-876c-7027d84443cd",
  "assignment_id": "1e37e7e7-735f-45d4-8218-e7ce0c589865",
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
    "phone": "+380674858790"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "df035b3a-2c7d-483f-b169-4d4055f9a949",
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
  "id": "7768eb6d-e499-4271-9588-78b55ef200b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:38:29.581418Z",
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
  "command_id": "08c9a4e8-ea16-4e1d-a9fd-b4f33da9045e",
  "quote_id": "7768eb6d-e499-4271-9588-78b55ef200b9",
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
  "id": "0842f9d9-8335-4a42-a7f9-33ff950f667b",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6",
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
  "created_at": "2026-10-28T14:33:29.867176Z",
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
  "command_id": "0a7e8bb9-89b4-4360-a50e-07b61cae2542",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T17:33:30Z"
}
```

```json
{
  "id": "07c10805-eb83-4be7-8eee-a25bce0cc867",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:38:30.169154Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:33:30Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9a0c93d6-2486-46b3-9634-99809f3a3b26",
  "quote_id": "07c10805-eb83-4be7-8eee-a25bce0cc867",
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
  "pickup_at": "2026-10-28T17:33:30Z"
}
```

```json
{
  "id": "9ae86249-f6f3-416d-8931-e1bcc04bce25",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6",
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
  "created_at": "2026-10-28T14:33:30.456693Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:33:30Z",
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
  "command_id": "8afba38c-e266-4142-91ea-5e5b02533d69",
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
  "id": "bc77f029-4ca2-4bf9-8993-047a155ca548",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:38:30.753930Z",
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
  "command_id": "c343986b-2c09-492f-9511-d3406d4e7de4",
  "quote_id": "bc77f029-4ca2-4bf9-8993-047a155ca548",
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
  "correlation_id": "92fda1a7-eebd-4db0-938d-a15efb4e5446"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "9ae86249-f6f3-416d-8931-e1bcc04bce25",
      "short_number": 16,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6",
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
      "created_at": "2026-10-28T14:33:30.456693Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T17:33:30Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "0842f9d9-8335-4a42-a7f9-33ff950f667b",
      "short_number": 15,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6",
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
      "created_at": "2026-10-28T14:33:29.867176Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "0def5403-f437-4659-876c-7027d84443cd",
      "short_number": 14,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "0842f9d9-8335-4a42-a7f9-33ff950f667b",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6",
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
  "created_at": "2026-10-28T14:33:29.867176Z",
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

`GET /api/rider/v1/orders/0def5403-f437-4659-876c-7027d84443cd` → **200**

```json
{
  "id": "0def5403-f437-4659-876c-7027d84443cd",
  "short_number": 14,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6",
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
    "id": "1e37e7e7-735f-45d4-8218-e7ce0c589865",
    "order_id": "0def5403-f437-4659-876c-7027d84443cd",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "dd6d4ef7-38cf-4226-8e57-d1f8f0c07f8c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:33:28.445129Z",
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
    "location_at": "2026-10-28T14:33:27.316783Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/0def5403-f437-4659-876c-7027d84443cd/cancel` → **200**

```json
{
  "command_id": "701d6dc8-7b32-40ac-8653-1cfe336af015",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0def5403-f437-4659-876c-7027d84443cd",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6",
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
    "id": "1e37e7e7-735f-45d4-8218-e7ce0c589865",
    "order_id": "0def5403-f437-4659-876c-7027d84443cd",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "dd6d4ef7-38cf-4226-8e57-d1f8f0c07f8c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:33:28.445129Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
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

`GET /api/rider/v1/orders/0842f9d9-8335-4a42-a7f9-33ff950f667b` → **200**

```json
{
  "id": "0842f9d9-8335-4a42-a7f9-33ff950f667b",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6",
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
  "created_at": "2026-10-28T14:33:29.867176Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0842f9d9-8335-4a42-a7f9-33ff950f667b/cancel` → **200**

```json
{
  "command_id": "0d3af514-944c-44bd-b617-4066db9a6c56",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0842f9d9-8335-4a42-a7f9-33ff950f667b",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6",
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
  "created_at": "2026-10-28T14:33:29.867176Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
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

`GET /api/rider/v1/orders/9ae86249-f6f3-416d-8931-e1bcc04bce25` → **200**

```json
{
  "id": "9ae86249-f6f3-416d-8931-e1bcc04bce25",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6",
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
  "created_at": "2026-10-28T14:33:30.456693Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:33:30Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9ae86249-f6f3-416d-8931-e1bcc04bce25/cancel` → **200**

```json
{
  "command_id": "30e0ab4c-95b4-49ad-99af-3cf9b299efa8",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9ae86249-f6f3-416d-8931-e1bcc04bce25",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "6b0f1dbe-d5a7-4a0e-925f-f697dd34efd6",
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
  "created_at": "2026-10-28T14:33:30.456693Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-28T17:33:30Z",
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
  "session_id": "ed00e102-dc1b-4a77-ac54-fd3e89e4c991",
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
  "last_heartbeat_at": "2026-10-28T14:33:27.316783Z",
  "last_location_at": "2026-10-28T14:33:27.316783Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed00e102-dc1b-4a77-ac54-fd3e89e4c991/close` → **200**

```json
{
  "command_id": "c20afc76-6b34-48ff-ace3-ea3e49e967dc",
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

Done: orders 0def5403-f437-4659-876c-7027d84443cd, 0842f9d9-8335-4a42-a7f9-33ff950f667b, 9ae86249-f6f3-416d-8931-e1bcc04bce25.

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
  "session_id": "ce993d32-9b88-4e33-9342-64fe2f8e1b73",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5MTQsImlhdCI6MTc5MzE5ODAxNCwianRpIjoiMjhkODk4MTctZGVjMi00NmFlLTkyOWUtOTg4ZjViZDJhNzBiIiwic2lkIjoiY2U5OTNkMzItOWI4OC00ZTMzLTkzNDItNjRmZTJmOGUxYjczIn0.v-Z7ALaeh5CEh7Wj9_pRv5yynzhxZ-n_t_4cKNWwV7k",
  "access_expires_at": "2026-10-28T14:48:34.479259876Z",
  "refresh_token": "H8CjpzTWZXimlkg-wgcmsKCByAiv2oQ1ynT1NllUFsE",
  "refresh_expires_at": "2026-10-29T02:33:34.478672503Z",
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
  "session_id": "28bb8466-5493-4c42-bb63-51a5e007aeed",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5MTUsImlhdCI6MTc5MzE5ODAxNSwianRpIjoiY2M2MjUzYmUtZDQyYy00YzIzLWFmYzUtNzgwZDFlM2YzODczIiwic2lkIjoiMjhiYjg0NjYtNTQ5My00YzQyLWJiNjMtNTFhNWUwMDdhZWVkIn0.yEj3TYWKmnkwy3-AVaJk0xcmS95YmicjJ1ROnDPTLOU",
  "access_expires_at": "2026-10-28T14:48:35.087035887Z",
  "refresh_token": "wJlMvGRGQl8QHwTTSrEgNQfeZC3FqYM6sJ0MG1ipkAM",
  "refresh_expires_at": "2026-10-29T02:33:35.086451388Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1815"
}
```

```json
{
  "challenge_id": "fe4db5ba-c550-40b7-9816-67d0dc503b82",
  "expires_at": "2026-10-28T14:38:35.361790421Z",
  "resend_available_at": "2026-10-28T14:33:36.361790421Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "924507",
  "sent_at": "2026-10-28T14:33:35.364576912Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe4db5ba-c550-40b7-9816-67d0dc503b82",
  "code": "924507",
  "device_ref": "sandbox-1815"
}
```

```json
{
  "session_id": "bde84779-01fc-410b-82ef-f113a86a06cf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODkxNSwiaWF0IjoxNzkzMTk4MDE1LCJqdGkiOiIwODg1ODJkOS1jNTVhLTQ2MmUtOWMwZi01YWFiNGY3NDcyODAiLCJzaWQiOiJiZGU4NDc3OS0wMWZjLTQxMGItODJlZi1mMTEzYTg2YTA2Y2YifQ.q_k1frDiFv36PbLh1eTjbVb4oufiFvzcBD8Zd346c24",
  "access_expires_at": "2026-10-28T14:48:35.687036555Z",
  "refresh_token": "-yR6dBGg5ol7dh17B7JVyMREe1yvvo-dDDPSDU8WzkI",
  "refresh_expires_at": "2026-11-27T14:33:35.686057252Z",
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
  "command_id": "ec8d730b-fc34-4a8d-ac51-cc445306c4db",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:33:36Z",
    "sequence": 1793198016232
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "771d0e01-cf29-4f9e-94a0-58b23201e955",
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
  "last_heartbeat_at": "2026-10-28T14:33:36.252819Z",
  "last_location_at": "2026-10-28T14:33:36.252819Z",
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
  "command_id": "342f3126-d983-45dd-be29-d4c428008456",
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
  "effective_at": "2026-10-28T14:33:36.816374Z",
  "changed_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T14:31:22.29605Z",
  "last_entries": [
    {
      "order_id": "2fcd4e45-5906-4eee-ae50-5539400bb3ab",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T14:31:22.29605Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cbe6da8a-425c-48c9-9fe5-fa830f25ef17",
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
  "id": "271c2c3b-94b0-47d2-9bec-733f04ea825a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:38:37.367017Z",
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
  "command_id": "9d63b949-60e6-4c61-b51f-c8189b4238d8",
  "quote_id": "271c2c3b-94b0-47d2-9bec-733f04ea825a",
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
    "phone": "+3806711123726"
  }
}
```

```json
{
  "id": "689768c6-8c3a-49f4-b6d5-31917a49f499",
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
  "created_at": "2026-10-28T14:33:37.651736Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123726"
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
    "id": "6c86eb83-402b-4dd9-af14-a2780afe0764",
    "order_id": "689768c6-8c3a-49f4-b6d5-31917a49f499",
    "expires_at": "2026-10-28T14:33:52.655Z",
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

`POST /api/driver/v1/offers/6c86eb83-402b-4dd9-af14-a2780afe0764/accept` → **200**

```json
{
  "command_id": "55b2b73c-1ca0-4456-9ad1-833614fd27b8"
}
```

```json
{
  "id": "403c7a15-7c8f-470d-a680-af6a34d884dc",
  "order_id": "689768c6-8c3a-49f4-b6d5-31917a49f499",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bfe7051f-86d6-4a54-b97e-14ea48647703",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bfe7051f-86d6-4a54-b97e-14ea48647703",
  "order_id": "689768c6-8c3a-49f4-b6d5-31917a49f499",
  "assignment_id": "403c7a15-7c8f-470d-a680-af6a34d884dc",
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
    "phone": "+3806711123726"
  }
}
```

`POST /api/driver/v1/work-sessions/771d0e01-cf29-4f9e-94a0-58b23201e955/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:33:38Z",
    "sequence": 1793198018773
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "771d0e01-cf29-4f9e-94a0-58b23201e955",
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
  "last_heartbeat_at": "2026-10-28T14:33:38.794086Z",
  "last_location_at": "2026-10-28T14:33:38.794086Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bfe7051f-86d6-4a54-b97e-14ea48647703/arrive` → **200**

```json
{
  "command_id": "17c180a7-3667-4f6d-9895-51ef5f55ff46",
  "expected_version": 0
}
```

```json
{
  "id": "bfe7051f-86d6-4a54-b97e-14ea48647703",
  "order_id": "689768c6-8c3a-49f4-b6d5-31917a49f499",
  "assignment_id": "403c7a15-7c8f-470d-a680-af6a34d884dc",
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
  "arrived_at": "2026-10-28T14:33:39.081973Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711123726"
  }
}
```

`POST /api/driver/v1/trips/bfe7051f-86d6-4a54-b97e-14ea48647703/start` → **200**

```json
{
  "command_id": "4e088276-2f41-49bd-9028-b036b766124f",
  "expected_version": 1
}
```

```json
{
  "id": "bfe7051f-86d6-4a54-b97e-14ea48647703",
  "order_id": "689768c6-8c3a-49f4-b6d5-31917a49f499",
  "assignment_id": "403c7a15-7c8f-470d-a680-af6a34d884dc",
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
  "arrived_at": "2026-10-28T14:33:39.081973Z",
  "started_at": "2026-10-28T14:33:39.370923Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711123726"
  }
}
```

`POST /api/driver/v1/trips/bfe7051f-86d6-4a54-b97e-14ea48647703/complete` → **200**

```json
{
  "command_id": "c2940170-4aa4-41fd-8a3c-10f4d00e94c5",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:33:39Z",
  "cash_received": true
}
```

```json
{
  "id": "bfe7051f-86d6-4a54-b97e-14ea48647703",
  "order_id": "689768c6-8c3a-49f4-b6d5-31917a49f499",
  "assignment_id": "403c7a15-7c8f-470d-a680-af6a34d884dc",
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
  "arrived_at": "2026-10-28T14:33:39.081973Z",
  "started_at": "2026-10-28T14:33:39.370923Z",
  "completed_at": "2026-10-28T14:33:39.661541Z",
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
  "command_id": "5bc8a95e-1210-4aff-94e3-d51a0a576f62",
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
  "id": "e7d371e5-6c88-4a1b-8e67-6786717e53dd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:38:39.945764Z",
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
  "command_id": "204218b1-cbaf-45bf-aed2-d3a093a99c8e",
  "quote_id": "e7d371e5-6c88-4a1b-8e67-6786717e53dd",
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
    "phone": "+3806711129703"
  }
}
```

```json
{
  "id": "0939924e-94a7-4c82-b72a-0694fd058b2b",
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
  "created_at": "2026-10-28T14:33:40.235078Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129703"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0939924e-94a7-4c82-b72a-0694fd058b2b` → **200**

```json
{
  "id": "0939924e-94a7-4c82-b72a-0694fd058b2b",
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
  "created_at": "2026-10-28T14:33:40.235078Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129703"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0939924e-94a7-4c82-b72a-0694fd058b2b/cancel` → **200**

```json
{
  "command_id": "be389180-0f70-4288-974d-a67b0a8862c2",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "0939924e-94a7-4c82-b72a-0694fd058b2b",
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
  "created_at": "2026-10-28T14:33:40.235078Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129703"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "en": "Operator error",
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
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
  "staff_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T14:31:22.29605Z",
  "last_entries": [
    {
      "order_id": "0939924e-94a7-4c82-b72a-0694fd058b2b",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T14:33:40.824842Z"
    },
    {
      "order_id": "689768c6-8c3a-49f4-b6d5-31917a49f499",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T14:33:39.666278Z"
    },
    {
      "order_id": "2fcd4e45-5906-4eee-ae50-5539400bb3ab",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T14:31:22.29605Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "771d0e01-cf29-4f9e-94a0-58b23201e955",
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
  "last_heartbeat_at": "2026-10-28T14:33:38.794086Z",
  "last_location_at": "2026-10-28T14:33:38.794086Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/771d0e01-cf29-4f9e-94a0-58b23201e955/close` → **200**

```json
{
  "command_id": "1fb125c3-f13b-4fcc-b3b8-bbb0aeb8f536",
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

Done: operator bonus for fulfilled 689768c6-8c3a-49f4-b6d5-31917a49f499 and operator-fault cancellation 0939924e-94a7-4c82-b72a-0694fd058b2b.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676842785",
  "device_ref": "sandbox-32620"
}
```

```json
{
  "challenge_id": "0d7b4b52-9a51-4340-af64-d4bfaa524836",
  "expires_at": "2026-10-28T14:38:43.982906603Z",
  "resend_available_at": "2026-10-28T14:33:44.982906603Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676842785` → **200**

```json
{
  "phone": "+380676842785",
  "audience": "CLIENT",
  "code": "168477",
  "sent_at": "2026-10-28T14:33:43.985468436Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677235940",
  "device_ref": "sandbox-9024",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "2a531ca8-10f1-46db-b1a1-908c0987f921",
  "expires_at": "2026-10-28T14:38:44.284499876Z",
  "resend_available_at": "2026-10-28T14:33:45.284499876Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677235940` → **200**

```json
{
  "phone": "+380677235940",
  "audience": "CLIENT",
  "code": "418193",
  "sent_at": "2026-10-28T14:33:44.286576479Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678460000",
  "device_ref": "sandbox-11689"
}
```

```json
{
  "challenge_id": "fac6778b-e2e8-4039-96ad-2a43e65191fe",
  "expires_at": "2026-10-28T14:38:44.592607001Z",
  "resend_available_at": "2026-10-28T14:33:45.592607001Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678460000` → **200**

```json
{
  "phone": "+380678460000",
  "audience": "CLIENT",
  "code": "707270",
  "sent_at": "2026-10-28T14:33:44.595454313Z",
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
  "session_id": "070759d4-db0e-4d9c-be7c-1dfbaa319392",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5MjUsImlhdCI6MTc5MzE5ODAyNSwianRpIjoiMTQ5OTQyY2QtOGRjNC00Nzc1LTgwN2UtMWU4ZWFmYjdlZjJhIiwic2lkIjoiMDcwNzU5ZDQtZGIwZS00ZDljLWJlN2MtMWRmYmFhMzE5MzkyIn0.f8MMPb3Qx8jJyKbisjXm2Az-lyDlKeHl_t7GM_U1Pn4",
  "access_expires_at": "2026-10-28T14:48:45.219904334Z",
  "refresh_token": "rP16zSkwjfiriNu5smlwufER2YFl9Vinet0hsQZSh4c",
  "refresh_expires_at": "2026-10-29T02:33:45.219415559Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678460000` → **200**

```json
{
  "deliveries": [
    {
      "id": "111e2791-e3ca-40c5-b058-5e3b66131538",
      "challenge_id": "fac6778b-e2e8-4039-96ad-2a43e65191fe",
      "phone": "+380678460000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-5ddbfa60-80db-4aad-8de5-295b2f9486cc",
      "error": null,
      "attempted_at": "2026-10-28T14:33:44.595719Z"
    },
    {
      "id": "74d361c5-aa82-46f6-8a98-7661a7cf55a8",
      "challenge_id": "fac6778b-e2e8-4039-96ad-2a43e65191fe",
      "phone": "+380678460000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T14:33:44.594893Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678460000` → **200**

```json
{
  "phone": "+380678460000",
  "audience": "CLIENT",
  "code": "707270",
  "sent_at": "2026-10-28T14:33:44.595454313Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677235940` → **200**

```json
{
  "deliveries": [
    {
      "id": "1e3f343a-317f-453c-ab45-897f3ebb6e5b",
      "challenge_id": "2a531ca8-10f1-46db-b1a1-908c0987f921",
      "phone": "+380677235940",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-e59e7414-b0a8-4b21-9b39-6abeee920193",
      "error": null,
      "attempted_at": "2026-10-28T14:33:44.286827Z"
    }
  ]
}
```

Done: SMS to +380676842785, a call to +380677235940, SMS then a call to +380678460000.

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
  "session_id": "8b247866-7681-4316-a221-b7aa1451b672",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5MjYsImlhdCI6MTc5MzE5ODAyNiwianRpIjoiOGE0ZDMwZjYtYWFjNS00OGU4LTlhZDgtNzk1MDk5YmMxZWZkIiwic2lkIjoiOGIyNDc4NjYtNzY4MS00MzE2LWEyMjEtYjdhYTE0NTFiNjcyIn0.sw5_uClTdRAWHtdxS9GuszYjGDv99LLNb9VcPraPPSk",
  "access_expires_at": "2026-10-28T14:48:46.42013233Z",
  "refresh_token": "zfhtZcnsIZUCmCqm0bK6jtP09XFX8UNv3Q7BX7ZVDzM",
  "refresh_expires_at": "2026-10-29T02:33:46.419596178Z",
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
  "session_id": "e80f2229-fe6a-4493-a938-485a0df58b75",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5MjcsImlhdCI6MTc5MzE5ODAyNywianRpIjoiYjMyNmIyZjgtMThkNy00YTBhLWJkNDUtYmVmNmYwMGM2MDUwIiwic2lkIjoiZTgwZjIyMjktZmU2YS00NDkzLWE5MzgtNDg1YTBkZjU4Yjc1In0.VXCOqPgTJKnINYyIBD5AcXz7DpMlIRyib9Cxvt2kI40",
  "access_expires_at": "2026-10-28T14:48:47.021599435Z",
  "refresh_token": "0G4fCKCZwaZCcu8foTsr9mfHF6jyT6c89TjZnRjMGAk",
  "refresh_expires_at": "2026-10-29T02:33:47.021041135Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
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

`POST /api/admin/v1/staff-extensions/e5dbcbe7-7a06-47a0-8db2-4e0c1641de84` → **200**

```json
{
  "command_id": "151e7ab5-a919-47f4-be43-8a2f2e4be6e5",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "ecb90a2f-af2e-49c3-b7a0-5d3b0e32f617",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:33:48.111546Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:33:48.111546Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "78e3f4c7-e331-40b2-b25d-566e91ad44ab",
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
  "id": "1bf86b7c-970f-44cf-b257-ae48e217d7b3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:38:48.653249Z",
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
  "command_id": "0008ecbb-0a69-4636-921b-2c977742d31a",
  "quote_id": "1bf86b7c-970f-44cf-b257-ae48e217d7b3",
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
    "phone": "+380675554024"
  }
}
```

```json
{
  "id": "f294f5eb-ebfb-499f-bc96-b44add77891c",
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
  "created_at": "2026-10-28T14:33:48.934182Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675554024"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/f294f5eb-ebfb-499f-bc96-b44add77891c/calls` → **201**

```json
{
  "command_id": "c1f75acc-f26b-4a8b-82e4-63b9b4270690",
  "to": "CALLER"
}
```

```json
{
  "id": "29cb570f-ec1a-4e0c-adab-95422b24a131",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "order_ids": [
    "f294f5eb-ebfb-499f-bc96-b44add77891c"
  ],
  "started_at": "2026-10-28T14:33:49.247912Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/f294f5eb-ebfb-499f-bc96-b44add77891c/calls` → **201**

```json
{
  "command_id": "c1f75acc-f26b-4a8b-82e4-63b9b4270690",
  "to": "CALLER"
}
```

```json
{
  "id": "29cb570f-ec1a-4e0c-adab-95422b24a131",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "order_ids": [
    "f294f5eb-ebfb-499f-bc96-b44add77891c"
  ],
  "started_at": "2026-10-28T14:33:49.247912Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "29cb570f-ec1a-4e0c-adab-95422b24a131",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675554024",
    "at": "2026-10-28T14:33:49.249790229Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "29cb570f-ec1a-4e0c-adab-95422b24a131",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.3477",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "29cb570f-ec1a-4e0c-adab-95422b24a131"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "29cb570f-ec1a-4e0c-adab-95422b24a131",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=f294f5eb-ebfb-499f-bc96-b44add77891c` → **200**

```json
{
  "calls": [
    {
      "id": "29cb570f-ec1a-4e0c-adab-95422b24a131",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_ids": [
        "f294f5eb-ebfb-499f-bc96-b44add77891c"
      ],
      "started_at": "2026-10-28T14:33:49.247912Z",
      "answered_at": "2026-10-28T14:33:49.896567Z",
      "ended_at": "2026-10-28T14:33:49.919777Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=f294f5eb-ebfb-499f-bc96-b44add77891c` → **200**

```json
{
  "calls": [
    {
      "id": "29cb570f-ec1a-4e0c-adab-95422b24a131",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_ids": [
        "f294f5eb-ebfb-499f-bc96-b44add77891c"
      ],
      "started_at": "2026-10-28T14:33:49.247912Z",
      "answered_at": "2026-10-28T14:33:49.896567Z",
      "ended_at": "2026-10-28T14:33:49.919777Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=f294f5eb-ebfb-499f-bc96-b44add77891c` → **200**

```json
{
  "calls": [
    {
      "id": "29cb570f-ec1a-4e0c-adab-95422b24a131",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "order_ids": [
        "f294f5eb-ebfb-499f-bc96-b44add77891c"
      ],
      "started_at": "2026-10-28T14:33:49.247912Z",
      "answered_at": "2026-10-28T14:33:49.896567Z",
      "ended_at": "2026-10-28T14:33:49.919777Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:33:54.50012Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/f294f5eb-ebfb-499f-bc96-b44add77891c` → **200**

```json
{
  "id": "f294f5eb-ebfb-499f-bc96-b44add77891c",
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
  "created_at": "2026-10-28T14:33:48.934182Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675554024"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f294f5eb-ebfb-499f-bc96-b44add77891c/cancel` → **200**

```json
{
  "command_id": "c69f50b3-bc82-43ae-b413-60eea1eec0be",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f294f5eb-ebfb-499f-bc96-b44add77891c",
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
  "created_at": "2026-10-28T14:33:48.934182Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675554024"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
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
  "command_id": "f2f86266-e100-46a3-bdbb-020dd9c77dc6",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T14:33:55.406364Z",
  "extension": "101"
}
```

Done: outgoing call 29cb570f-ec1a-4e0c-adab-95422b24a131 from order f294f5eb-ebfb-499f-bc96-b44add77891c, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639361863",
  "device_ref": "sandbox-1973"
}
```

```json
{
  "challenge_id": "177a822c-b3a8-4396-adf5-dfb6b3e10b55",
  "expires_at": "2026-10-28T14:38:55.693849593Z",
  "resend_available_at": "2026-10-28T14:33:56.693849593Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639361863` → **200**

```json
{
  "phone": "+380639361863",
  "audience": "CLIENT",
  "code": "274260",
  "sent_at": "2026-10-28T14:33:55.696482593Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "177a822c-b3a8-4396-adf5-dfb6b3e10b55",
  "code": "274260",
  "device_ref": "sandbox-1973"
}
```

```json
{
  "session_id": "287b4538-8300-422c-87f0-6e8e463a483e",
  "subject": {
    "type": "CLIENT",
    "id": "1fba14b7-e515-4249-8869-c98eb3afb1b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmJhMTRiNy1lNTE1LTQyNDktODg2OS1jOThlYjNhZmIxYjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4OTM1LCJpYXQiOjE3OTMxOTgwMzUsImp0aSI6IjZmZWViZDNkLTA3MTctNDhhMy05NjEyLWJmNzZkMDM0ODhiZCIsInNpZCI6IjI4N2I0NTM4LTgzMDAtNDIyYy04N2YwLTZlOGU0NjNhNDgzZSJ9.vGr3nYuseunUjlt9kjy8Roq-N1djgtSQH2xqjceIrJM",
  "access_expires_at": "2026-10-28T14:48:55.991023023Z",
  "refresh_token": "0-dcjKvLhuAto_t9H3kUyWPhqeDj2FqXnXtcnWLO0-4",
  "refresh_expires_at": "2026-11-27T14:33:55.990071372Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1fba14b7-e515-4249-8869-c98eb3afb1b9",
  "session_id": "287b4538-8300-422c-87f0-6e8e463a483e",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639361863",
  "device_ref": "sandbox-4210"
}
```

```json
{
  "challenge_id": "bcb9b591-f4f8-4ff1-b3b2-c99af4fb4bfd",
  "expires_at": "2026-10-28T14:38:58.517519879Z",
  "resend_available_at": "2026-10-28T14:33:59.517519879Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639361863` → **200**

```json
{
  "phone": "+380639361863",
  "audience": "CLIENT",
  "code": "311853",
  "sent_at": "2026-10-28T14:33:58.519473107Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bcb9b591-f4f8-4ff1-b3b2-c99af4fb4bfd",
  "code": "311853",
  "device_ref": "sandbox-4210"
}
```

```json
{
  "session_id": "7956620c-ee85-4967-9d22-f88684cbc876",
  "subject": {
    "type": "CLIENT",
    "id": "1fba14b7-e515-4249-8869-c98eb3afb1b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmJhMTRiNy1lNTE1LTQyNDktODg2OS1jOThlYjNhZmIxYjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4OTM4LCJpYXQiOjE3OTMxOTgwMzgsImp0aSI6IjgyMTA5MTlhLWQ0ZjQtNGU3My1iODJlLTc2N2YzYWFjMWM4ZSIsInNpZCI6Ijc5NTY2MjBjLWVlODUtNDk2Ny05ZDIyLWY4ODY4NGNiYzg3NiJ9.ThUxvzptHB-_qxsUswnxO7zvul5SyCAZJw8W-AZiiUc",
  "access_expires_at": "2026-10-28T14:48:58.813996587Z",
  "refresh_token": "yVmAnJ9BXD22qyph9o6tGPrd7TPN1Kzgt98Us8oWj9Q",
  "refresh_expires_at": "2026-11-27T14:33:58.813289583Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "98419e9c-8720-4ef2-9bbb-36c87a342b35",
  "expires_at": "2026-10-28T14:39:01.093357359Z",
  "resend_available_at": "2026-10-28T14:34:02.093357359Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639361863` → **200**

```json
{
  "phone": "+380639361863",
  "audience": "CLIENT",
  "code": "719650",
  "sent_at": "2026-10-28T14:34:01.095355544Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637141103"
}
```

```json
{
  "challenge_id": "65edcfea-51f0-4b7a-80ae-5d34d1f33404",
  "expires_at": "2026-10-28T14:39:01.385700145Z",
  "resend_available_at": "2026-10-28T14:34:02.385700145Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637141103` → **200**

```json
{
  "phone": "+380637141103",
  "audience": "CLIENT",
  "code": "127417",
  "sent_at": "2026-10-28T14:34:01.387531468Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "15d9d41b-5226-4900-a0d8-1d6525ea5416",
  "current_challenge_id": "98419e9c-8720-4ef2-9bbb-36c87a342b35",
  "current_code": "000000",
  "new_challenge_id": "65edcfea-51f0-4b7a-80ae-5d34d1f33404",
  "new_code": "127417"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "903e3117-5a9a-4f56-a253-8302659de5e1"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "8868f955-d874-4490-9b97-11199e34b641",
  "current_challenge_id": "98419e9c-8720-4ef2-9bbb-36c87a342b35",
  "current_code": "719650",
  "new_challenge_id": "65edcfea-51f0-4b7a-80ae-5d34d1f33404",
  "new_code": "127417"
}
```

```json
{
  "subject_id": "1fba14b7-e515-4249-8869-c98eb3afb1b9",
  "phone": "+380637141103",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1fba14b7-e515-4249-8869-c98eb3afb1b9",
  "session_id": "287b4538-8300-422c-87f0-6e8e463a483e",
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
  "correlation_id": "f3b53d6c-2db4-4be7-b806-77b54c0dcf9b"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637141103",
  "device_ref": "sandbox-17024"
}
```

```json
{
  "challenge_id": "a7e8745b-ef7f-4ace-abc9-cfc4f861f1e0",
  "expires_at": "2026-10-28T14:39:04.789900176Z",
  "resend_available_at": "2026-10-28T14:34:05.789900176Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637141103` → **200**

```json
{
  "phone": "+380637141103",
  "audience": "CLIENT",
  "code": "354619",
  "sent_at": "2026-10-28T14:34:04.79203007Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7e8745b-ef7f-4ace-abc9-cfc4f861f1e0",
  "code": "354619",
  "device_ref": "sandbox-17024"
}
```

```json
{
  "session_id": "17aa9d0d-cd98-491b-a151-84fefafe7cd4",
  "subject": {
    "type": "CLIENT",
    "id": "1fba14b7-e515-4249-8869-c98eb3afb1b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmJhMTRiNy1lNTE1LTQyNDktODg2OS1jOThlYjNhZmIxYjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4OTQ1LCJpYXQiOjE3OTMxOTgwNDUsImp0aSI6IjhlYWMxYjZjLTJkODEtNDBkYi05YzQxLTc1NzU4YThmOTdhNCIsInNpZCI6IjE3YWE5ZDBkLWNkOTgtNDkxYi1hMTUxLTg0ZmVmYWZlN2NkNCJ9.rK0KLgOGROZBNTHSxjy0Nq7TiWDGAlvPY-qlAgahFb0",
  "access_expires_at": "2026-10-28T14:49:05.095499188Z",
  "refresh_token": "GoEH06q9aD_Kw5KRANuYIMyuldcdd4fVeQ1S2wPjxYA",
  "refresh_expires_at": "2026-11-27T14:34:05.09494822Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1fba14b7-e515-4249-8869-c98eb3afb1b9",
  "session_id": "17aa9d0d-cd98-491b-a151-84fefafe7cd4",
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
  "session_id": "1093a134-8e92-4c16-8c76-be791e6aef47",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5NDUsImlhdCI6MTc5MzE5ODA0NSwianRpIjoiMjJkZmM5NzAtYzg3Ni00NTQ1LWJhNzQtYjEyYTExMDg2M2NhIiwic2lkIjoiMTA5M2ExMzQtOGU5Mi00YzE2LThjNzYtYmU3OTFlNmFlZjQ3In0.rVaY8CQkOyEIsFK4AQccexdtH6MBwbsxvu9MtjFmGJU",
  "access_expires_at": "2026-10-28T14:49:05.955629884Z",
  "refresh_token": "gJGraehn5pwbIqJMxvwdiNykctl2b1sPI7O_7xIWW-w",
  "refresh_expires_at": "2026-10-29T02:34:05.955024193Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/1fba14b7-e515-4249-8869-c98eb3afb1b9` → **200**

```json
{
  "client": {
    "id": "1fba14b7-e515-4249-8869-c98eb3afb1b9",
    "phone": "+380637141103",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:33:55.988458Z",
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

`POST /api/admin/v1/clients/1fba14b7-e515-4249-8869-c98eb3afb1b9/phone` → **400**

```json
{
  "command_id": "692a7f99-fa7b-4e5b-b956-32ed77b553ec",
  "expected_version": 3,
  "phone": "+380638197105",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/1fba14b7-e515-4249-8869-c98eb3afb1b9/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1c789016-6327-49b3-b951-74cecf97c533",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/1fba14b7-e515-4249-8869-c98eb3afb1b9/phone` → **200**

```json
{
  "command_id": "66f533b8-4144-4fad-bda9-e9e29f8e390d",
  "expected_version": 3,
  "phone": "+380638197105",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "1fba14b7-e515-4249-8869-c98eb3afb1b9",
  "phone": "+380638197105",
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
  "correlation_id": "e6355e94-fb74-4e95-ba91-7cc4d6ac387c"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638197105",
  "device_ref": "sandbox-973"
}
```

```json
{
  "challenge_id": "be913223-6e9d-4086-8f6c-accce93fb3ea",
  "expires_at": "2026-10-28T14:39:07.352888433Z",
  "resend_available_at": "2026-10-28T14:34:08.352888433Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638197105` → **200**

```json
{
  "phone": "+380638197105",
  "audience": "CLIENT",
  "code": "120920",
  "sent_at": "2026-10-28T14:34:07.355278583Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be913223-6e9d-4086-8f6c-accce93fb3ea",
  "code": "120920",
  "device_ref": "sandbox-973"
}
```

```json
{
  "session_id": "d80451bf-a90f-486b-97d8-1d8a77430d4b",
  "subject": {
    "type": "CLIENT",
    "id": "1fba14b7-e515-4249-8869-c98eb3afb1b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmJhMTRiNy1lNTE1LTQyNDktODg2OS1jOThlYjNhZmIxYjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4OTQ3LCJpYXQiOjE3OTMxOTgwNDcsImp0aSI6IjA2YzI4YTAzLWUwMGEtNDU0YS05OTJjLTRhODQwZmEwYWM3NCIsInNpZCI6ImQ4MDQ1MWJmLWE5MGYtNDg2Yi05N2Q4LTFkOGE3NzQzMGQ0YiJ9.aBVyMDo7TTCFHKn4JcIQWGJZEUqYlSHMWFB55CbahJM",
  "access_expires_at": "2026-10-28T14:49:07.649582632Z",
  "refresh_token": "gbrTsSLeY7BiCugyuWax_N2wmbJrcnoDgrbuhLzig_g",
  "refresh_expires_at": "2026-11-27T14:34:07.648973645Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1fba14b7-e515-4249-8869-c98eb3afb1b9",
  "session_id": "d80451bf-a90f-486b-97d8-1d8a77430d4b",
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
  "phone": "+380633730575",
  "device_ref": "sandbox-15971"
}
```

```json
{
  "challenge_id": "5c8f7f45-ff8f-48ce-a8cc-10d9d021ecb5",
  "expires_at": "2026-10-28T14:39:08.189784056Z",
  "resend_available_at": "2026-10-28T14:34:09.189784056Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633730575` → **200**

```json
{
  "phone": "+380633730575",
  "audience": "CLIENT",
  "code": "035012",
  "sent_at": "2026-10-28T14:34:08.191887354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c8f7f45-ff8f-48ce-a8cc-10d9d021ecb5",
  "code": "035012",
  "device_ref": "sandbox-15971"
}
```

```json
{
  "session_id": "f1e5ceff-5cf9-4761-8134-15f1b23671fe",
  "subject": {
    "type": "CLIENT",
    "id": "9ca386cb-2fff-4d93-bf88-58e7a9dbf602"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Y2EzODZjYi0yZmZmLTRkOTMtYmY4OC01OGU3YTlkYmY2MDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4OTQ4LCJpYXQiOjE3OTMxOTgwNDgsImp0aSI6ImVlMmQ1MThhLTkzZjYtNDA1Ni04MjAyLTc5YWQ2NTZkNjkwZSIsInNpZCI6ImYxZTVjZWZmLTVjZjktNDc2MS04MTM0LTE1ZjFiMjM2NzFmZSJ9.yLaczU4eOqmXfOi3eBBoZFztGT_HVM7-Ee-pJNxzn6w",
  "access_expires_at": "2026-10-28T14:49:08.485001708Z",
  "refresh_token": "i1pdiA3jhNYvzOj71ScbR3JlC0_-hcYHjOc9xzJircg",
  "refresh_expires_at": "2026-11-27T14:34:08.484415116Z",
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
  "session_id": "4d392e86-4d19-4c2e-9621-215b56aed45f",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5NDksImlhdCI6MTc5MzE5ODA0OSwianRpIjoiMTQwN2VjNDUtNDgyOS00ZDA5LTlkOGYtZGE4Njc4MDY2MTZiIiwic2lkIjoiNGQzOTJlODYtNGQxOS00YzJlLTk2MjEtMjE1YjU2YWVkNDVmIn0.R1dGfBSEdLXbRz0OlkgBBoIcnKLfVDNBpyCc22zSA6Q",
  "access_expires_at": "2026-10-28T14:49:09.661390574Z",
  "refresh_token": "cyhnUBqEeWcQdzVYfvlp7Cjs2IVgW6P2HkkiUCB9Kiw",
  "refresh_expires_at": "2026-10-29T02:34:09.660872405Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633730575` → **200**

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
  "correlation_id": "624d5564-eda4-47d3-b361-706ed9b2671a"
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
  "session_id": "98c66d08-50e5-446f-91a0-ddf7df1108bf",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5NTAsImlhdCI6MTc5MzE5ODA1MCwianRpIjoiYmFkM2VmMTAtYTE3MS00YjIzLWE1YTMtYWRmYjI1YTg1MWVjIiwic2lkIjoiOThjNjZkMDgtNTBlNS00NDZmLTkxYTAtZGRmN2RmMTEwOGJmIn0.XSC3kyZcI6-uAWDPd3WpxBU5IQ6tHNhMAvpMdMuvm44",
  "access_expires_at": "2026-10-28T14:49:10.834834506Z",
  "refresh_token": "y88NgEatympfxfTH714f5A6yLGv8OKLu7XNkUJtunPs",
  "refresh_expires_at": "2026-10-29T02:34:10.834286302Z",
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
  "command_id": "ed2d658d-bc30-4ad3-9d8c-738893b97af8",
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
  "changed_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T14:34:11.399550914Z"
}
```

## The rider books the airport for 2026-10-28T17:34:10Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600450250",
  "device_ref": "sandbox-22970"
}
```

```json
{
  "challenge_id": "2de0afcb-c4a9-41a4-a2dd-a907b6116277",
  "expires_at": "2026-10-28T14:39:11.690656286Z",
  "resend_available_at": "2026-10-28T14:34:12.690656286Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600450250` → **200**

```json
{
  "phone": "+48600450250",
  "audience": "CLIENT",
  "code": "946996",
  "sent_at": "2026-10-28T14:34:11.692925539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2de0afcb-c4a9-41a4-a2dd-a907b6116277",
  "code": "946996",
  "device_ref": "sandbox-22970"
}
```

```json
{
  "session_id": "a3407e36-f674-4f7c-bf8d-a0aa031c285c",
  "subject": {
    "type": "CLIENT",
    "id": "9fc5ea24-2f93-4a38-b6cb-cf58dafd2fc6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmM1ZWEyNC0yZjkzLTRhMzgtYjZjYi1jZjU4ZGFmZDJmYzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4OTUxLCJpYXQiOjE3OTMxOTgwNTEsImp0aSI6IjljZjdkZjYxLTBjNGYtNDc1ZC1iZjE2LTk2ZmYzODVhYmQ1NyIsInNpZCI6ImEzNDA3ZTM2LWY2NzQtNGY3Yy1iZjhkLWEwYWEwMzFjMjg1YyJ9.cY10otLfRvqHrivsGFxkNfDQ6omJFzQz3YQLFyGT7qA",
  "access_expires_at": "2026-10-28T14:49:11.988993686Z",
  "refresh_token": "4RXGpLoADevXETI5lCQPMWxqA4WrLKvGejy6Z2RcSz0",
  "refresh_expires_at": "2026-11-27T14:34:11.988284139Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d3ec3986-4984-4ba9-bd9d-34f56e18e2e8",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T17:34:10Z"
}
```

```json
{
  "id": "b08a7729-07f4-4d53-afeb-4bde3ba6e133",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:39:12.272385Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:34:10Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f1487755-4d96-42ec-857c-c61ef2866c86",
  "quote_id": "b08a7729-07f4-4d53-afeb-4bde3ba6e133",
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
  "pickup_at": "2026-10-28T17:34:10Z"
}
```

```json
{
  "id": "416c8389-5927-40be-b8f9-038c504fdec7",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9fc5ea24-2f93-4a38-b6cb-cf58dafd2fc6",
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
  "created_at": "2026-10-28T14:34:12.561593Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:34:10Z",
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
  "device_ref": "sandbox-18347"
}
```

```json
{
  "challenge_id": "8f588df0-a46e-429e-b1a5-567f9ec30eaa",
  "expires_at": "2026-10-28T14:39:12.850756791Z",
  "resend_available_at": "2026-10-28T14:34:13.850756791Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "294515",
  "sent_at": "2026-10-28T14:34:12.85337273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f588df0-a46e-429e-b1a5-567f9ec30eaa",
  "code": "294515",
  "device_ref": "sandbox-18347"
}
```

```json
{
  "session_id": "a833869e-5986-419b-8005-dce8b128d014",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODk1MywiaWF0IjoxNzkzMTk4MDUzLCJqdGkiOiJmNzFiNzVhNC02YmFhLTQxZGEtOWQ4OC03NjQyNDVjOGI2YzIiLCJzaWQiOiJhODMzODY5ZS01OTg2LTQxOWItODAwNS1kY2U4YjEyOGQwMTQifQ.VVM7in5tN6R6sg_m15_CT93NkF1kGQKBPazGxm9m4Cg",
  "access_expires_at": "2026-10-28T14:49:13.154333726Z",
  "refresh_token": "Q0XanYNFIawyknDhBZhNFp5swIw81U96XCIaX4sLQYo",
  "refresh_expires_at": "2026-11-27T14:34:13.153793223Z",
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
  "command_id": "70e82883-43d7-4504-a608-d8639c2f02d1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:34:13Z",
    "sequence": 1793198053689
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a6cd86a5-8d74-4fcb-ac55-3bcd15def950",
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
  "last_heartbeat_at": "2026-10-28T14:34:13.70891Z",
  "last_location_at": "2026-10-28T14:34:13.70891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "416c8389-5927-40be-b8f9-038c504fdec7",
      "short_number": 20,
      "pickup_at": "2026-10-28T17:34:10Z",
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

`POST /api/driver/v1/preorders/416c8389-5927-40be-b8f9-038c504fdec7/reserve` → **200**

```json
{
  "command_id": "0668a0a2-fc39-48bd-adfc-0cf22cbf0ac7"
}
```

```json
{
  "id": "80a6fd23-80ac-4e5b-9115-57399241471e",
  "state": "RESERVED",
  "order": {
    "order_id": "416c8389-5927-40be-b8f9-038c504fdec7",
    "short_number": 20,
    "pickup_at": "2026-10-28T17:34:10Z",
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
  "reserved_at": "2026-10-28T14:34:14.249986Z",
  "confirm_from": "2026-10-28T17:04:10Z",
  "confirm_until": "2026-10-28T17:14:10Z",
  "drop_until": "2026-10-28T16:34:10Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "80a6fd23-80ac-4e5b-9115-57399241471e",
      "state": "RESERVED",
      "order": {
        "order_id": "416c8389-5927-40be-b8f9-038c504fdec7",
        "short_number": 20,
        "pickup_at": "2026-10-28T17:34:10Z",
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
      "reserved_at": "2026-10-28T14:34:14.249986Z",
      "confirm_from": "2026-10-28T17:04:10Z",
      "confirm_until": "2026-10-28T17:14:10Z",
      "drop_until": "2026-10-28T16:34:10Z"
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
      "id": "80a6fd23-80ac-4e5b-9115-57399241471e",
      "state": "RESERVED",
      "order": {
        "order_id": "416c8389-5927-40be-b8f9-038c504fdec7",
        "short_number": 20,
        "pickup_at": "2026-10-28T17:34:10Z",
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
      "reserved_at": "2026-10-28T14:34:14.249986Z",
      "confirm_from": "2026-10-28T17:04:10Z",
      "confirm_until": "2026-10-28T17:14:10Z",
      "drop_until": "2026-10-28T16:34:10Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/80a6fd23-80ac-4e5b-9115-57399241471e/confirm` → **409**

```json
{
  "command_id": "6172beba-6cbd-4507-8e30-621f23381245"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/80a6fd23-80ac-4e5b-9115-57399241471e/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7e1c1c60-c592-4743-a4a2-676626dc2b61"
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
  "session_id": "b16417cf-d483-4822-b093-c5880fa661b2",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5NTUsImlhdCI6MTc5MzE5ODA1NSwianRpIjoiZDA2MjQ0ZTktYmZlOC00OWM0LWFmMjQtMDI2MjU0OWI2Y2I4Iiwic2lkIjoiYjE2NDE3Y2YtZDQ4My00ODIyLWIwOTMtYzU4ODBmYTY2MWIyIn0.Rftbrb4C-04JRIkmns6n66cTfDY3FatPDvXC7dButrE",
  "access_expires_at": "2026-10-28T14:49:15.687391726Z",
  "refresh_token": "ZhLGibFHm85uvhZPu1A7RC6bWpKIupxWZcEd91ppCIE",
  "refresh_expires_at": "2026-10-29T02:34:15.686875649Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/416c8389-5927-40be-b8f9-038c504fdec7` → **200**

```json
{
  "id": "416c8389-5927-40be-b8f9-038c504fdec7",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "9fc5ea24-2f93-4a38-b6cb-cf58dafd2fc6",
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
  "created_at": "2026-10-28T14:34:12.561593Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T17:34:10Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "80a6fd23-80ac-4e5b-9115-57399241471e",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T14:34:14.249986Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/416c8389-5927-40be-b8f9-038c504fdec7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T14:34:12.562736Z",
      "actor": {
        "type": "CLIENT",
        "id": "9fc5ea24-2f93-4a38-b6cb-cf58dafd2fc6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "416c8389-5927-40be-b8f9-038c504fdec7",
        "preorder": true,
        "quote_id": "b08a7729-07f4-4d53-afeb-4bde3ba6e133",
        "pickup_at": "2026-10-28T17:34:10Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "52e8ea01-e404-4e1f-afb1-6860a856b93c"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T14:34:14.251132Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "416c8389-5927-40be-b8f9-038c504fdec7",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "80a6fd23-80ac-4e5b-9115-57399241471e"
      },
      "correlation_id": "04cc1bd0-41cc-4c17-8758-e908c70025bb"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 416c8389-5927-40be-b8f9-038c504fdec7, reservation 80a6fd23-80ac-4e5b-9115-57399241471e.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30319"
}
```

```json
{
  "challenge_id": "494d683a-3d60-4c29-b3ec-ec0926ef8b43",
  "expires_at": "2026-10-28T14:39:16.535564311Z",
  "resend_available_at": "2026-10-28T14:34:17.535564311Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "867044",
  "sent_at": "2026-10-28T14:34:16.537902061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "494d683a-3d60-4c29-b3ec-ec0926ef8b43",
  "code": "867044",
  "device_ref": "sandbox-30319"
}
```

```json
{
  "session_id": "82066d79-09e9-436d-a8d5-d7d788b45238",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODk1NiwiaWF0IjoxNzkzMTk4MDU2LCJqdGkiOiJhZDRmMTA4OC0xZGQ0LTRhM2YtOGU1Mi1mNzY4NmEzMzg4OTciLCJzaWQiOiI4MjA2NmQ3OS0wOWU5LTQzNmQtYThkNS1kN2Q3ODhiNDUyMzgifQ.Wrb0jSAm4l_bjY4ioHlx0vga7tAXR74q_muqKTAzc-Q",
  "access_expires_at": "2026-10-28T14:49:16.834350215Z",
  "refresh_token": "dCxtWiF_oDVtQJ0cEwWywBFs76VQbbS1iA968kM4UeY",
  "refresh_expires_at": "2026-11-27T14:34:16.833788961Z",
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
  "command_id": "c0684b3b-c490-4069-a5e2-a471ce6e3c6e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:34:17Z",
    "sequence": 1793198057365
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9690281e-fade-4ea9-a78d-7239d570b517",
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
  "last_heartbeat_at": "2026-10-28T14:34:17.38506Z",
  "last_location_at": "2026-10-28T14:34:17.38506Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672503059",
  "device_ref": "sandbox-22071"
}
```

```json
{
  "challenge_id": "bfb957cf-ad76-466c-9e17-3ac60d74f82f",
  "expires_at": "2026-10-28T14:39:17.657695281Z",
  "resend_available_at": "2026-10-28T14:34:18.657695281Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672503059` → **200**

```json
{
  "phone": "+380672503059",
  "audience": "CLIENT",
  "code": "659024",
  "sent_at": "2026-10-28T14:34:17.660130683Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bfb957cf-ad76-466c-9e17-3ac60d74f82f",
  "code": "659024",
  "device_ref": "sandbox-22071"
}
```

```json
{
  "session_id": "16709720-194d-4070-a86f-aacd8c196339",
  "subject": {
    "type": "CLIENT",
    "id": "67cc90c3-ae9b-42eb-87fb-8c6d55b5baec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2N2NjOTBjMy1hZTliLTQyZWItODdmYi04YzZkNTViNWJhZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4OTU3LCJpYXQiOjE3OTMxOTgwNTcsImp0aSI6IjkyNTVkNzFjLWQ4NjMtNDI1Yy05NjY1LTYyNTQ0YWM1NTQ4MSIsInNpZCI6IjE2NzA5NzIwLTE5NGQtNDA3MC1hODZmLWFhY2Q4YzE5NjMzOSJ9.hZ5lm9Nq9rtKlhu13XgZ0Ud8VuAnflwJrqfsJLWQTFM",
  "access_expires_at": "2026-10-28T14:49:17.956003086Z",
  "refresh_token": "qmiHmK16IrNkOpnIBOiTkVPaqn8p2J9lbsre9wwLz9o",
  "refresh_expires_at": "2026-11-27T14:34:17.95547393Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "69f06bd2-df83-436f-861a-bc6d2b733df3",
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
  "id": "88cdc8e8-8eaa-4199-a1e3-878ba20fe59e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:39:18.234781Z",
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
  "command_id": "5010fbdf-c3f8-4784-8af4-081f161a3fe2",
  "quote_id": "88cdc8e8-8eaa-4199-a1e3-878ba20fe59e",
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
  "id": "44ecc53e-ce68-49f5-ad46-ebc13e462693",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67cc90c3-ae9b-42eb-87fb-8c6d55b5baec",
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
  "created_at": "2026-10-28T14:34:18.51959Z",
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
    "id": "3ee0b9b5-712e-4bb0-9a1f-a6723d1ce43a",
    "order_id": "44ecc53e-ce68-49f5-ad46-ebc13e462693",
    "expires_at": "2026-10-28T14:34:33.523074Z",
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

`POST /api/driver/v1/offers/3ee0b9b5-712e-4bb0-9a1f-a6723d1ce43a/accept` → **200**

```json
{
  "command_id": "4eed73b7-47fa-4447-93ae-83a779137de8"
}
```

```json
{
  "id": "f349ba9d-9aee-41d8-abeb-424da0ccd628",
  "order_id": "44ecc53e-ce68-49f5-ad46-ebc13e462693",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b31aff94-0720-4ce5-9488-6984502f1b87",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b31aff94-0720-4ce5-9488-6984502f1b87",
  "order_id": "44ecc53e-ce68-49f5-ad46-ebc13e462693",
  "assignment_id": "f349ba9d-9aee-41d8-abeb-424da0ccd628",
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

`POST /api/driver/v1/work-sessions/9690281e-fade-4ea9-a78d-7239d570b517/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:34:19Z",
    "sequence": 1793198059626
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9690281e-fade-4ea9-a78d-7239d570b517",
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
  "last_heartbeat_at": "2026-10-28T14:34:19.647532Z",
  "last_location_at": "2026-10-28T14:34:19.647532Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b31aff94-0720-4ce5-9488-6984502f1b87",
  "order_id": "44ecc53e-ce68-49f5-ad46-ebc13e462693",
  "assignment_id": "f349ba9d-9aee-41d8-abeb-424da0ccd628",
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

`POST /api/driver/v1/trips/b31aff94-0720-4ce5-9488-6984502f1b87/arrive` → **200**

```json
{
  "command_id": "1fe3672d-9792-402c-8d36-2ffcef557e25",
  "expected_version": 0
}
```

```json
{
  "id": "b31aff94-0720-4ce5-9488-6984502f1b87",
  "order_id": "44ecc53e-ce68-49f5-ad46-ebc13e462693",
  "assignment_id": "f349ba9d-9aee-41d8-abeb-424da0ccd628",
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
  "arrived_at": "2026-10-28T14:34:20.212992Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b31aff94-0720-4ce5-9488-6984502f1b87/start` → **200**

```json
{
  "command_id": "80b99575-3fe6-4737-b883-c0f8a0b1a082",
  "expected_version": 1
}
```

```json
{
  "id": "b31aff94-0720-4ce5-9488-6984502f1b87",
  "order_id": "44ecc53e-ce68-49f5-ad46-ebc13e462693",
  "assignment_id": "f349ba9d-9aee-41d8-abeb-424da0ccd628",
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
  "arrived_at": "2026-10-28T14:34:20.212992Z",
  "started_at": "2026-10-28T14:34:20.491473Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/9690281e-fade-4ea9-a78d-7239d570b517/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:34:20Z",
    "sequence": 1793198060764
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9690281e-fade-4ea9-a78d-7239d570b517",
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
  "last_heartbeat_at": "2026-10-28T14:34:20.783699Z",
  "last_location_at": "2026-10-28T14:34:20.783699Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/b31aff94-0720-4ce5-9488-6984502f1b87/complete` → **200**

```json
{
  "command_id": "1ae86c60-e04c-4ca2-a74c-016b1ade82e8",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:34:21Z",
  "cash_received": true
}
```

```json
{
  "id": "b31aff94-0720-4ce5-9488-6984502f1b87",
  "order_id": "44ecc53e-ce68-49f5-ad46-ebc13e462693",
  "assignment_id": "f349ba9d-9aee-41d8-abeb-424da0ccd628",
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
  "arrived_at": "2026-10-28T14:34:20.212992Z",
  "started_at": "2026-10-28T14:34:20.491473Z",
  "completed_at": "2026-10-28T14:34:21.063078Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/44ecc53e-ce68-49f5-ad46-ebc13e462693/rating` → **200**

```json
{
  "command_id": "a6bb7597-ce13-4480-b136-9acb985cd737",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "44ecc53e-ce68-49f5-ad46-ebc13e462693",
  "score": 5,
  "created_at": "2026-10-28T14:34:21.361194681Z"
}
```

`POST /api/driver/v1/orders/44ecc53e-ce68-49f5-ad46-ebc13e462693/rating` → **200**

```json
{
  "command_id": "0d0b7ab3-b8a0-45cc-afe8-78e9ac2bda3c",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "44ecc53e-ce68-49f5-ad46-ebc13e462693",
  "score": 4,
  "created_at": "2026-10-28T14:34:21.637946472Z"
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
  "session_id": "af821133-9e85-45ff-99af-742ca5a3ef8a",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5NjIsImlhdCI6MTc5MzE5ODA2MiwianRpIjoiOTgwNzM5NjYtNzI1NS00OTYyLTgzNGEtODcyMmVjNTAyNzZkIiwic2lkIjoiYWY4MjExMzMtOWU4NS00NWZmLTk5YWYtNzQyY2E1YTNlZjhhIn0.XjjzfPUyR43ZHj1xJem2GKLFWbdUFx1nMJSUos9YR9k",
  "access_expires_at": "2026-10-28T14:49:22.517526462Z",
  "refresh_token": "U1XWd3vBvE23hWBFxquc1SSGkImr9MmxNIhOBSJrL3A",
  "refresh_expires_at": "2026-10-29T02:34:22.516983305Z",
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
  "session_id": "c56588bc-d8ba-4bfb-a016-57cb3462f6f3",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5NjMsImlhdCI6MTc5MzE5ODA2MywianRpIjoiMzBiMzViNDQtOTg1OS00ZDk0LTg1N2EtMWE4YzRhMzMyYzE5Iiwic2lkIjoiYzU2NTg4YmMtZDhiYS00YmZiLWEwMTYtNTdjYjM0NjJmNmYzIn0.UIHGdfFZcSELXLXOoA2fm_pewzbUlNzkXmhjudbns0M",
  "access_expires_at": "2026-10-28T14:49:23.115913336Z",
  "refresh_token": "srkmCGlUs1hF7LZC8LeStK4BA1GtX6L66FQT9oaUjgo",
  "refresh_expires_at": "2026-10-29T02:34:23.115399808Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/44ecc53e-ce68-49f5-ad46-ebc13e462693/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "44ecc53e-ce68-49f5-ad46-ebc13e462693",
      "author_type": "RIDER",
      "author_id": "67cc90c3-ae9b-42eb-87fb-8c6d55b5baec",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T14:34:21.361195Z"
    },
    {
      "order_id": "44ecc53e-ce68-49f5-ad46-ebc13e462693",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "67cc90c3-ae9b-42eb-87fb-8c6d55b5baec",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T14:34:21.637946Z"
    }
  ]
}
```

Done: ratings for order 44ecc53e-ce68-49f5-ad46-ebc13e462693.

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
  "session_id": "571f1f1e-40d8-4599-9eda-6e47d4ceb071",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5NjQsImlhdCI6MTc5MzE5ODA2NCwianRpIjoiNTczODRiZTUtMTcxZi00NTVkLThiZWQtODk5MWRmNmJmZWExIiwic2lkIjoiNTcxZjFmMWUtNDBkOC00NTk5LTllZGEtNmU0N2Q0Y2ViMDcxIn0.WvvNn30BbwpZtqLElasILMAnhOE9L9n7WXH4B3IYG6M",
  "access_expires_at": "2026-10-28T14:49:24.008465957Z",
  "refresh_token": "D7iyuPebZGvOGyeAvRndFSUi5qnmHOp9WZjBkxvGn-Q",
  "refresh_expires_at": "2026-10-29T02:34:24.007917392Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "d13c7f94-0d52-48e4-94c0-94cbc60e39de",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "86ca359e-9ce8-4bc3-8623-62f78a368195",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:34:24.294701Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/86ca359e-9ce8-4bc3-8623-62f78a368195` → **200**

```json
{
  "id": "86ca359e-9ce8-4bc3-8623-62f78a368195",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:34:24.294701Z",
  "ready_at": "2026-10-28T14:34:24.529941Z",
  "expires_at": "2026-10-29T14:34:24.529941Z"
}
```

`GET /api/admin/v1/reports/exports/86ca359e-9ce8-4bc3-8623-62f78a368195/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
total,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "f45b47d8-aec2-40e8-9a49-ceb8d906e7d3",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "f69a12bf-79d1-4106-8009-17d5d6773cb8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:34:24.900289Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f69a12bf-79d1-4106-8009-17d5d6773cb8` → **200**

```json
{
  "id": "f69a12bf-79d1-4106-8009-17d5d6773cb8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:34:24.900289Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f69a12bf-79d1-4106-8009-17d5d6773cb8` → **200**

```json
{
  "id": "f69a12bf-79d1-4106-8009-17d5d6773cb8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:34:24.900289Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f69a12bf-79d1-4106-8009-17d5d6773cb8` → **200**

```json
{
  "id": "f69a12bf-79d1-4106-8009-17d5d6773cb8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:34:24.900289Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f69a12bf-79d1-4106-8009-17d5d6773cb8` → **200**

```json
{
  "id": "f69a12bf-79d1-4106-8009-17d5d6773cb8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:34:24.900289Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f69a12bf-79d1-4106-8009-17d5d6773cb8` → **200**

```json
{
  "id": "f69a12bf-79d1-4106-8009-17d5d6773cb8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:34:24.900289Z",
  "ready_at": "2026-10-28T14:34:29.538986Z",
  "expires_at": "2026-10-29T14:34:29.538986Z"
}
```

`GET /api/admin/v1/reports/exports/f69a12bf-79d1-4106-8009-17d5d6773cb8/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/529a01eb-6a56-4f44-97d2-90c676e5e93d` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/529a01eb-6a56-4f44-97d2-90c676e5e93d",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e8d0f877-c996-48dd-b2fe-83470368b59b"
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
  "device_ref": "sandbox-21321"
}
```

```json
{
  "challenge_id": "7f75129c-b28c-4c3b-9265-d622e70f1952",
  "expires_at": "2026-10-28T14:39:30.878872394Z",
  "resend_available_at": "2026-10-28T14:34:31.878872394Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "808680",
  "sent_at": "2026-10-28T14:34:30.881322824Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f75129c-b28c-4c3b-9265-d622e70f1952",
  "code": "808680",
  "device_ref": "sandbox-21321"
}
```

```json
{
  "session_id": "7a021fa1-1795-43c4-b6cc-73290aaf7872",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODk3MSwiaWF0IjoxNzkzMTk4MDcxLCJqdGkiOiI3MGUyOWQ4Ni0yMzlmLTQ4NWItYTRlMy01ODBmNzdhNDk5MDYiLCJzaWQiOiI3YTAyMWZhMS0xNzk1LTQzYzQtYjZjYy03MzI5MGFhZjc4NzIifQ.QESgwRjVhmgAefASM-FQCRwXmvP99hbjORAXsxeQ4TI",
  "access_expires_at": "2026-10-28T14:49:31.179613235Z",
  "refresh_token": "3Y7BbN4wev_4KbY2KFyISTkllxQ4moiIkL5BY4fDMKo",
  "refresh_expires_at": "2026-11-27T14:34:31.179070438Z",
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
  "command_id": "e7a45e00-3700-468d-a914-55837849a0ca",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:34:31Z",
    "sequence": 1793198071986
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dc55d3fc-65bc-4460-bbdc-6e67339e82eb",
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
  "last_heartbeat_at": "2026-10-28T14:34:32.005455Z",
  "last_location_at": "2026-10-28T14:34:32.005455Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "4fd8ceda-cd7f-4af5-abfa-f6a2f4155190",
  "points": [
    {
      "sequence": 1793198074287,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:33:34Z"
    },
    {
      "sequence": 1793198074295,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:34:34Z"
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
  "session_id": "60609036-8be3-41bd-b014-528ed2498f95",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5NzQsImlhdCI6MTc5MzE5ODA3NCwianRpIjoiM2IwZTZmNjgtNWUwOC00ZjU3LWJjNWItZDNiYjhhN2JlZTNhIiwic2lkIjoiNjA2MDkwMzYtOGJlMy00MWJkLWIwMTQtNTI4ZWQyNDk4Zjk1In0.EL0oHANzbDFwVsDT1Rv82kZhAxhl1ZyJW-njsfRU_O4",
  "access_expires_at": "2026-10-28T14:49:34.949758228Z",
  "refresh_token": "QJSwjNEiVkjWGEQFj9oLNyKfD4anK9F51f4oKHnnw2M",
  "refresh_expires_at": "2026-10-29T02:34:34.949202512Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "983b8a6c-b3f8-4196-b705-c0cd87a9b1e0",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T14:34:34Z",
        "track_point_id": "638ca274-3cf3-4e4c-a223-cdb097653178",
        "work_session_id": "dc55d3fc-65bc-4460-bbdc-6e67339e82eb"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T14:34:34Z",
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

`POST /api/admin/v1/driver-risk-flags/983b8a6c-b3f8-4196-b705-c0cd87a9b1e0/confirm` → **200**

```json
{
  "command_id": "c9feb4da-bdd3-4708-af4f-a8b95fe9af43",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "983b8a6c-b3f8-4196-b705-c0cd87a9b1e0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T14:34:34Z",
    "track_point_id": "638ca274-3cf3-4e4c-a223-cdb097653178",
    "work_session_id": "dc55d3fc-65bc-4460-bbdc-6e67339e82eb"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T14:34:34Z",
  "reason": null,
  "reviewed_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "reviewed_at": "2026-10-28T14:34:35.834496Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/983b8a6c-b3f8-4196-b705-c0cd87a9b1e0/dismiss` → **409**

```json
{
  "command_id": "c51b9879-56c7-405e-b8c9-b52fba21eda6",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/983b8a6c-b3f8-4196-b705-c0cd87a9b1e0/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "837f1d94-d7a9-4c64-af51-39c6ab50ea4a"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "b8594dc0-242e-4740-8e09-34714ba21b01",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "32bd7b41-6f0f-4660-bab9-b6f195fd8149",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "raised_at": "2026-10-28T14:34:36.400656Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/32bd7b41-6f0f-4660-bab9-b6f195fd8149/dismiss` → **200**

```json
{
  "command_id": "6dcd7a3d-ded7-4791-8678-21da7ec4805d",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "32bd7b41-6f0f-4660-bab9-b6f195fd8149",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "raised_at": "2026-10-28T14:34:36.400656Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "reviewed_at": "2026-10-28T14:34:36.696931Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "50c39e34-8144-4f7f-8d81-a459d1b228a9",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "983b8a6c-b3f8-4196-b705-c0cd87a9b1e0"
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
      "actor_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:34:36.994191Z"
    }
  ]
}
```

Done: flag 983b8a6c-b3f8-4196-b705-c0cd87a9b1e0 confirmed, suspension named it, driver reinstated.

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
  "session_id": "76e0ca48-dfef-4614-9130-3d5023d01f8c",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5NzcsImlhdCI6MTc5MzE5ODA3NywianRpIjoiZWEwZDdjNjYtN2NjMS00NzlkLTg0NWItYjYzZDE2MzVhNDEyIiwic2lkIjoiNzZlMGNhNDgtZGZlZi00NjE0LTkxMzAtM2Q1MDIzZDAxZjhjIn0.703OociPEWMkpQePBtAwpuTLCxpwBV8-SithFXPSyuE",
  "access_expires_at": "2026-10-28T14:49:37.883328487Z",
  "refresh_token": "ZtkAO831DIFX1GD6jBbY_3U7aV9QPOvL3NeJXolaMMc",
  "refresh_expires_at": "2026-10-29T02:34:37.882684609Z",
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
      "actor_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:34:36.994191Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "9ca7078a-8659-460b-8a20-483be0cc8239",
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
  "session_id": "dc55d3fc-65bc-4460-bbdc-6e67339e82eb",
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
  "last_heartbeat_at": "2026-10-28T14:34:32.005455Z",
  "last_location_at": "2026-10-28T14:34:32.005455Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc55d3fc-65bc-4460-bbdc-6e67339e82eb/close` → **200**

```json
{
  "command_id": "bf0fe438-94c0-4e0f-8263-6b772a1575d1",
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
  "session_id": "768705c3-d41f-48ef-b067-05637b3e8fdc",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5NzksImlhdCI6MTc5MzE5ODA3OSwianRpIjoiZTZjZDAwMGMtNTg3ZS00MWM3LTlkNzktMTUyMzNhZGFlODZkIiwic2lkIjoiNzY4NzA1YzMtZDQxZi00OGVmLWIwNjctMDU2MzdiM2U4ZmRjIn0.SWnlEmrunwDbaWpVGtgvTl5XMHwkG36iOIYJBYj-dAY",
  "access_expires_at": "2026-10-28T14:49:39.623787538Z",
  "refresh_token": "gbow4-FWaC58TjoUzlJ-OPA20_dY5qhOpXP7sw74bEM",
  "refresh_expires_at": "2026-10-29T02:34:39.623275628Z",
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
  "command_id": "779cecf5-d91d-4a84-9ff6-d9e4b28ff30b",
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
  "changed_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:34:40.211Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "779cecf5-d91d-4a84-9ff6-d9e4b28ff30b",
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
  "changed_by": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:34:40.211Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48372094216",
  "device_ref": "sandbox-18949"
}
```

```json
{
  "challenge_id": "ee737912-1eea-42d4-b3d7-2fa1782ed7cb",
  "expires_at": "2026-10-28T14:39:40.797562735Z",
  "resend_available_at": "2026-10-28T14:34:41.797562735Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48372094216` → **200**

```json
{
  "phone": "+48372094216",
  "audience": "CLIENT",
  "code": "236870",
  "sent_at": "2026-10-28T14:34:40.800018057Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee737912-1eea-42d4-b3d7-2fa1782ed7cb",
  "code": "236870",
  "device_ref": "sandbox-18949"
}
```

```json
{
  "session_id": "9ee42c8e-fb63-424b-b7af-44cb634b088d",
  "subject": {
    "type": "CLIENT",
    "id": "5519f7c5-3eab-4dbb-ae20-d1d44f38cfa5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTE5ZjdjNS0zZWFiLTRkYmItYWUyMC1kMWQ0NGYzOGNmYTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4OTgxLCJpYXQiOjE3OTMxOTgwODEsImp0aSI6IjczNmE0MWVhLThkOTgtNDEwMi1iNjY4LTg4YjU5N2Y1N2FjMSIsInNpZCI6IjllZTQyYzhlLWZiNjMtNDI0Yi1iN2FmLTQ0Y2I2MzRiMDg4ZCJ9.H8FGrOlwOf4HBttAfDaszzp22qy_9_Ii2MbkuACFBqA",
  "access_expires_at": "2026-10-28T14:49:41.108523569Z",
  "refresh_token": "L5ZctGhE5p_ZSFSjJkswwcy4bi0jIu4B01AI4vy5NL4",
  "refresh_expires_at": "2026-11-27T14:34:41.107904663Z",
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
  "correlation_id": "a5fb4b3f-b64a-4e10-a977-3ca9957f8b10"
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
  "device_ref": "sandbox-15628"
}
```

```json
{
  "challenge_id": "948ab495-2710-4a53-bf62-fed9eb162a57",
  "expires_at": "2026-10-28T14:39:41.942472881Z",
  "resend_available_at": "2026-10-28T14:34:42.942472881Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "566102",
  "sent_at": "2026-10-28T14:34:41.944631407Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "948ab495-2710-4a53-bf62-fed9eb162a57",
  "code": "566102",
  "device_ref": "sandbox-15628"
}
```

```json
{
  "session_id": "b80dfa78-162f-4f85-8b0e-76bc93e344e7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODk4MiwiaWF0IjoxNzkzMTk4MDgyLCJqdGkiOiJjZWIyZDc3Yi1mYzZjLTRjMjEtYWMyMC00OWYwOWE5ODZhMzkiLCJzaWQiOiJiODBkZmE3OC0xNjJmLTRmODUtOGIwZS03NmJjOTNlMzQ0ZTcifQ.HFJehSkPzpZ8WJl-lKnkWnSifCY4-OapJq7DjtlAmvg",
  "access_expires_at": "2026-10-28T14:49:42.256212559Z",
  "refresh_token": "8LzR-gdzIWkBe6Ku7zxR1lfFhvAQd35b1Blz2KuzT74",
  "refresh_expires_at": "2026-11-27T14:34:42.255548881Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a6cd86a5-8d74-4fcb-ac55-3bcd15def950",
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
  "last_heartbeat_at": "2026-10-28T14:34:13.70891Z",
  "last_location_at": "2026-10-28T14:34:13.70891Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a6cd86a5-8d74-4fcb-ac55-3bcd15def950/handover` → **200**

```json
{
  "command_id": "33deb92d-e65b-4ef7-9674-5f895b841c73",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a6cd86a5-8d74-4fcb-ac55-3bcd15def950",
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
  "last_heartbeat_at": "2026-10-28T14:34:13.70891Z",
  "last_location_at": "2026-10-28T14:34:13.70891Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a6cd86a5-8d74-4fcb-ac55-3bcd15def950/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:34:43Z",
    "sequence": 1793198083869
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a6cd86a5-8d74-4fcb-ac55-3bcd15def950",
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
  "last_heartbeat_at": "2026-10-28T14:34:43.107337Z",
  "last_location_at": "2026-10-28T14:34:43.107337Z",
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
  "session_id": "a6cd86a5-8d74-4fcb-ac55-3bcd15def950",
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
  "last_heartbeat_at": "2026-10-28T14:34:43.107337Z",
  "last_location_at": "2026-10-28T14:34:43.107337Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a6cd86a5-8d74-4fcb-ac55-3bcd15def950/close` → **200**

```json
{
  "command_id": "a65781c6-82cc-4b08-ad2b-94de9f3b5008",
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
  "correlation_id": "8aba8005-ade3-424e-8102-ccf57cd08087"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673064793",
  "device_ref": "sandbox-18149"
}
```

```json
{
  "challenge_id": "32937a4e-d7a2-4a0a-9a1a-af64d911ce27",
  "expires_at": "2026-10-28T14:39:44.51168611Z",
  "resend_available_at": "2026-10-28T14:34:45.51168611Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673064793` → **200**

```json
{
  "phone": "+380673064793",
  "audience": "CLIENT",
  "code": "039362",
  "sent_at": "2026-10-28T14:34:44.513877666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32937a4e-d7a2-4a0a-9a1a-af64d911ce27",
  "code": "039362",
  "device_ref": "sandbox-18149"
}
```

```json
{
  "session_id": "4f72944b-27e0-42fc-96ff-e0c8a1ed9941",
  "subject": {
    "type": "CLIENT",
    "id": "82a1cc0c-94ef-4990-acee-482e4e5a362a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MmExY2MwYy05NGVmLTQ5OTAtYWNlZS00ODJlNGU1YTM2MmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4OTg0LCJpYXQiOjE3OTMxOTgwODQsImp0aSI6ImExYzQ0ZTljLWU2NDEtNDBkMi1hODkwLWY2YmI5M2VkZWViMCIsInNpZCI6IjRmNzI5NDRiLTI3ZTAtNDJmYy05NmZmLWUwYzhhMWVkOTk0MSJ9.sQyQRD2QIhr39xHbtwycFplgIEaRxo4pWlyKgzkIlfQ",
  "access_expires_at": "2026-10-28T14:49:44.81311235Z",
  "refresh_token": "j7_sBwZA8ZwFyIzUFGg7YaCs-cyVFkfREGdgUEwJmXM",
  "refresh_expires_at": "2026-11-27T14:34:44.812562352Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "dee52421-ad6c-4be9-81f5-2a22357d0a29",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c3ea8767-7b1a-4f96-b2f7-7e8fd797166a",
  "upload_path": "/api/rider/v1/uploads/c3ea8767-7b1a-4f96-b2f7-7e8fd797166a",
  "expires_at": "2026-10-28T14:49:45.090855311Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/c3ea8767-7b1a-4f96-b2f7-7e8fd797166a` → **200**

```json
{
  "file_id": "c3ea8767-7b1a-4f96-b2f7-7e8fd797166a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "6d7a006a-a6be-4523-ae38-6820a92e391d",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "c3ea8767-7b1a-4f96-b2f7-7e8fd797166a"
  ]
}
```

```json
{
  "id": "2ddf715b-f28c-453a-8d0a-62516ca83244",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "82a1cc0c-94ef-4990-acee-482e4e5a362a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:34:45.409104Z",
  "updated_at": "2026-10-28T14:34:45.409104Z",
  "messages": [
    {
      "id": "807fcd8f-64f9-4335-bc20-564e068817d2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "82a1cc0c-94ef-4990-acee-482e4e5a362a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:34:45.410572Z",
      "attachments": [
        {
          "file_id": "c3ea8767-7b1a-4f96-b2f7-7e8fd797166a",
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
  "session_id": "7e12bc81-ecbe-4557-bad4-4fc4b090c420",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5ODYsImlhdCI6MTc5MzE5ODA4NiwianRpIjoiMzQ1NGIxNTktY2Y1Yi00YzUzLTg4YjYtMjhhMTM2ZGQyYmUwIiwic2lkIjoiN2UxMmJjODEtZWNiZS00NTU3LWJhZDQtNGZjNGIwOTBjNDIwIn0.xzKZGSGE6S8OWNeSj4A_W3di82hOh9Uku2sUG1cR-bg",
  "access_expires_at": "2026-10-28T14:49:46.05300892Z",
  "refresh_token": "Sb583J90dcWkFiv1wR53BvZj2aqb_gOBZVnfF958ji8",
  "refresh_expires_at": "2026-10-29T02:34:46.05227735Z",
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
  "session_id": "7cbad168-1c17-4467-b806-37bc8fb7f168",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5ODYsImlhdCI6MTc5MzE5ODA4NiwianRpIjoiOTIyMGFiN2MtM2QwMS00ZjQ3LWE1MTQtZjBiODcyNjUyYWY0Iiwic2lkIjoiN2NiYWQxNjgtMWMxNy00NDY3LWI4MDYtMzdiYzhmYjdmMTY4In0.6f0D58LodgZwhzl9fLh5A4qF9GNKiGgrge0b92deQ6A",
  "access_expires_at": "2026-10-28T14:49:46.651821133Z",
  "refresh_token": "lfeTLCQONjNXSpZKZhFPccQAqdpXhfrgbTm0n4YQ5-o",
  "refresh_expires_at": "2026-10-29T02:34:46.651192718Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/2ddf715b-f28c-453a-8d0a-62516ca83244/attachments/c3ea8767-7b1a-4f96-b2f7-7e8fd797166a` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "bafbd336-f85b-410b-87db-f509855eb045",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "511d55b8-04f0-4144-bce8-5178ae79ad12",
  "upload_path": "/api/operator/v1/uploads/511d55b8-04f0-4144-bce8-5178ae79ad12",
  "expires_at": "2026-10-28T14:49:46.941943813Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/511d55b8-04f0-4144-bce8-5178ae79ad12` → **200**

```json
{
  "file_id": "511d55b8-04f0-4144-bce8-5178ae79ad12",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/2ddf715b-f28c-453a-8d0a-62516ca83244` → **200**

```json
{
  "id": "2ddf715b-f28c-453a-8d0a-62516ca83244",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "82a1cc0c-94ef-4990-acee-482e4e5a362a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:34:45.409104Z",
  "updated_at": "2026-10-28T14:34:45.409104Z",
  "messages": [
    {
      "id": "807fcd8f-64f9-4335-bc20-564e068817d2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "82a1cc0c-94ef-4990-acee-482e4e5a362a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:34:45.410572Z",
      "attachments": [
        {
          "file_id": "c3ea8767-7b1a-4f96-b2f7-7e8fd797166a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/2ddf715b-f28c-453a-8d0a-62516ca83244/comments` → **200**

```json
{
  "command_id": "2f9601c0-9ad4-44d8-a67f-08ed7c182036",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "511d55b8-04f0-4144-bce8-5178ae79ad12"
  ]
}
```

```json
{
  "id": "2ddf715b-f28c-453a-8d0a-62516ca83244",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "82a1cc0c-94ef-4990-acee-482e4e5a362a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:34:45.409104Z",
  "updated_at": "2026-10-28T14:34:47.528552Z",
  "messages": [
    {
      "id": "807fcd8f-64f9-4335-bc20-564e068817d2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "82a1cc0c-94ef-4990-acee-482e4e5a362a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:34:45.410572Z",
      "attachments": [
        {
          "file_id": "c3ea8767-7b1a-4f96-b2f7-7e8fd797166a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "4e54f9aa-2661-4fb6-9e9d-4707988cb17f",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:34:47.528151Z",
      "attachments": [
        {
          "file_id": "511d55b8-04f0-4144-bce8-5178ae79ad12",
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

`GET /api/rider/v1/support/cases/2ddf715b-f28c-453a-8d0a-62516ca83244` → **200**

```json
{
  "id": "2ddf715b-f28c-453a-8d0a-62516ca83244",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "82a1cc0c-94ef-4990-acee-482e4e5a362a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:34:45.409104Z",
  "updated_at": "2026-10-28T14:34:47.528552Z",
  "messages": [
    {
      "id": "807fcd8f-64f9-4335-bc20-564e068817d2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "82a1cc0c-94ef-4990-acee-482e4e5a362a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:34:45.410572Z",
      "attachments": [
        {
          "file_id": "c3ea8767-7b1a-4f96-b2f7-7e8fd797166a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "4e54f9aa-2661-4fb6-9e9d-4707988cb17f",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:34:47.528151Z",
      "attachments": [
        {
          "file_id": "511d55b8-04f0-4144-bce8-5178ae79ad12",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/2ddf715b-f28c-453a-8d0a-62516ca83244/attachments/511d55b8-04f0-4144-bce8-5178ae79ad12` → **200**

Done: support case 2ddf715b-f28c-453a-8d0a-62516ca83244, rider attachment c3ea8767-7b1a-4f96-b2f7-7e8fd797166a, operator attachment 511d55b8-04f0-4144-bce8-5178ae79ad12.

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
  "session_id": "7ff3cd77-6872-4951-a2b4-0f8645c1caff",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5ODgsImlhdCI6MTc5MzE5ODA4OCwianRpIjoiM2JjMzIzMWEtNzYzOC00YTlkLTk2ZDMtMTU4YzIzOWM0MDI0Iiwic2lkIjoiN2ZmM2NkNzctNjg3Mi00OTUxLWEyYjQtMGY4NjQ1YzFjYWZmIn0.KSoDGJbiUOeWe3M_JLdek921-rNeLu4CqLkpPJJxdbA",
  "access_expires_at": "2026-10-28T14:49:48.452117096Z",
  "refresh_token": "D7JHIvHKNQ--qjzVvKBW7F-i6nmgZCIbS4Lfg693o0k",
  "refresh_expires_at": "2026-10-29T02:34:48.451618216Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24361"
}
```

```json
{
  "challenge_id": "5256de72-957d-42bc-a502-384826643395",
  "expires_at": "2026-10-28T14:39:48.715945146Z",
  "resend_available_at": "2026-10-28T14:34:49.715945146Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "928975",
  "sent_at": "2026-10-28T14:34:48.718617901Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5256de72-957d-42bc-a502-384826643395",
  "code": "928975",
  "device_ref": "sandbox-24361"
}
```

```json
{
  "session_id": "ad2ca88d-f717-455e-a380-962dc687782e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODk4OSwiaWF0IjoxNzkzMTk4MDg5LCJqdGkiOiJkMGQ4YWI2Mi05N2UwLTRhNGQtOWE5Yy0xMjJlYzAzNzMxNmUiLCJzaWQiOiJhZDJjYTg4ZC1mNzE3LTQ1NWUtYTM4MC05NjJkYzY4Nzc4MmUifQ.JWFr6n3gQwjyl9J_gHSZdkLoAyqvaJ7lK0XKCVWAc_U",
  "access_expires_at": "2026-10-28T14:49:49.023652388Z",
  "refresh_token": "6ldRvWSWrmeMRdbT6Y8-EjjoT5V9AyEQY_za3-X8N7g",
  "refresh_expires_at": "2026-11-27T14:34:49.023104674Z",
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
      "actor_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:34:36.994191Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T14:34:38.443042Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "205ae27f-dd74-4f7b-8e36-fce8e71fa2f5",
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
  "device_ref": "sandbox-5437"
}
```

```json
{
  "challenge_id": "7f9aa90c-6f7e-4e17-bdff-b00d2a86a831",
  "expires_at": "2026-10-28T14:39:50.151918506Z",
  "resend_available_at": "2026-10-28T14:34:51.151918506Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "656105",
  "sent_at": "2026-10-28T14:34:50.154020778Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f9aa90c-6f7e-4e17-bdff-b00d2a86a831",
  "code": "656105",
  "device_ref": "sandbox-5437"
}
```

```json
{
  "session_id": "1803a8a7-54e9-482e-9b43-5950d3818385",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODk5MCwiaWF0IjoxNzkzMTk4MDkwLCJqdGkiOiI0NWM1Y2Q3NC1mMTBhLTRkZjctOWMxMS1mZmI5YmFiYjM4NTIiLCJzaWQiOiIxODAzYThhNy01NGU5LTQ4MmUtOWI0My01OTUwZDM4MTgzODUifQ.gb9kdA-nyjLEFaZdXJ-rHlJtnYfWvj0nnsZP45uT5s8",
  "access_expires_at": "2026-10-28T14:49:50.469843089Z",
  "refresh_token": "ddE__IO0gYOz08xReyplVzPgjWyOk5UEsYqoXQKrpek",
  "refresh_expires_at": "2026-11-27T14:34:50.469335736Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9690281e-fade-4ea9-a78d-7239d570b517",
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
  "last_heartbeat_at": "2026-10-28T14:34:20.783699Z",
  "last_location_at": "2026-10-28T14:34:20.783699Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9690281e-fade-4ea9-a78d-7239d570b517/handover` → **200**

```json
{
  "command_id": "74fe23e2-7216-4f64-8a14-fcd8105ab817",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9690281e-fade-4ea9-a78d-7239d570b517",
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
  "last_heartbeat_at": "2026-10-28T14:34:20.783699Z",
  "last_location_at": "2026-10-28T14:34:20.783699Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9690281e-fade-4ea9-a78d-7239d570b517/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:34:51Z",
    "sequence": 1793198091293
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9690281e-fade-4ea9-a78d-7239d570b517",
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
  "last_heartbeat_at": "2026-10-28T14:34:51.3126Z",
  "last_location_at": "2026-10-28T14:34:51.3126Z",
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
  "command_id": "eccbfc69-492c-42f6-b169-0d6d1f747863",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:34:51Z",
    "sequence": 1793198091849
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d5e684f5-16b2-4e54-9887-5c6dee51cd5b",
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
  "last_heartbeat_at": "2026-10-28T14:34:51.86823Z",
  "last_location_at": "2026-10-28T14:34:51.86823Z",
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
  "session_id": "8e400626-ca48-4ee8-9d22-b099fae3ab80",
  "subject": {
    "type": "STAFF",
    "id": "e5dbcbe7-7a06-47a0-8db2-4e0c1641de84"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWRiY2JlNy03YTA2LTQ3YTAtOGRiMi00ZTBjMTY0MWRlODQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg5OTIsImlhdCI6MTc5MzE5ODA5MiwianRpIjoiY2QyYjQ1ZmQtMWUwYS00OWFhLTgwMzEtOWVjMWM0YmE1MDQzIiwic2lkIjoiOGU0MDA2MjYtY2E0OC00ZWU4LTlkMjItYjA5OWZhZTNhYjgwIn0.zFbGpEOkczEpzPp6eivKeJXiPDxni_S6aahgLZU69BM",
  "access_expires_at": "2026-10-28T14:49:52.479069579Z",
  "refresh_token": "yWsi_-wmZKJlXpofrE9IixHeo6M8kuLv-psU6toGao0",
  "refresh_expires_at": "2026-10-29T02:34:52.47855834Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a008c7a1-483d-4fa6-9ddf-79e842135285",
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
  "id": "374f027b-7f7c-49c7-92f7-440b964622bc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:39:52.751920Z",
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
  "command_id": "f77ff655-714c-4997-8b53-19517467a394",
  "quote_id": "374f027b-7f7c-49c7-92f7-440b964622bc",
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
  "id": "0ce3da96-b986-4a39-b20b-2f688f93d6aa",
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
  "created_at": "2026-10-28T14:34:53.044033Z",
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
    "id": "548e6f3e-0823-4903-ae62-7bbaf6ae9a7f",
    "order_id": "0ce3da96-b986-4a39-b20b-2f688f93d6aa",
    "expires_at": "2026-10-28T14:35:08.047345Z",
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

`POST /api/driver/v1/offers/548e6f3e-0823-4903-ae62-7bbaf6ae9a7f/accept` → **200**

```json
{
  "command_id": "41f75ada-0d6b-4edd-a3d1-84a9434252c7"
}
```

```json
{
  "id": "099fc046-49c1-4227-8cab-a7f2cac4ddfb",
  "order_id": "0ce3da96-b986-4a39-b20b-2f688f93d6aa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e2be6507-97b6-4f42-9359-3bf81c984e3f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e2be6507-97b6-4f42-9359-3bf81c984e3f",
  "order_id": "0ce3da96-b986-4a39-b20b-2f688f93d6aa",
  "assignment_id": "099fc046-49c1-4227-8cab-a7f2cac4ddfb",
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

`POST /api/driver/v1/work-sessions/d5e684f5-16b2-4e54-9887-5c6dee51cd5b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:34:54Z",
    "sequence": 1793198094418
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d5e684f5-16b2-4e54-9887-5c6dee51cd5b",
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
  "last_heartbeat_at": "2026-10-28T14:34:54.439733Z",
  "last_location_at": "2026-10-28T14:34:54.439733Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e2be6507-97b6-4f42-9359-3bf81c984e3f/arrive` → **200**

```json
{
  "command_id": "b8eec3b6-5912-43dd-9cfa-0100b4086899",
  "expected_version": 0
}
```

```json
{
  "id": "e2be6507-97b6-4f42-9359-3bf81c984e3f",
  "order_id": "0ce3da96-b986-4a39-b20b-2f688f93d6aa",
  "assignment_id": "099fc046-49c1-4227-8cab-a7f2cac4ddfb",
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
  "arrived_at": "2026-10-28T14:34:54.730702Z",
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

`POST /api/driver/v1/trips/e2be6507-97b6-4f42-9359-3bf81c984e3f/start` → **200**

```json
{
  "command_id": "e6d5bddf-cfee-44d3-b2f6-3e0b208fc63a",
  "expected_version": 1
}
```

```json
{
  "id": "e2be6507-97b6-4f42-9359-3bf81c984e3f",
  "order_id": "0ce3da96-b986-4a39-b20b-2f688f93d6aa",
  "assignment_id": "099fc046-49c1-4227-8cab-a7f2cac4ddfb",
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
  "arrived_at": "2026-10-28T14:34:54.730702Z",
  "started_at": "2026-10-28T14:34:55.028485Z",
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

`POST /api/driver/v1/trips/e2be6507-97b6-4f42-9359-3bf81c984e3f/complete` → **200**

```json
{
  "command_id": "c1f22f23-7f63-4d6b-9b72-f17a84378533",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:34:55Z",
  "cash_received": true
}
```

```json
{
  "id": "e2be6507-97b6-4f42-9359-3bf81c984e3f",
  "order_id": "0ce3da96-b986-4a39-b20b-2f688f93d6aa",
  "assignment_id": "099fc046-49c1-4227-8cab-a7f2cac4ddfb",
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
  "arrived_at": "2026-10-28T14:34:54.730702Z",
  "started_at": "2026-10-28T14:34:55.028485Z",
  "completed_at": "2026-10-28T14:34:55.315211Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/0ce3da96-b986-4a39-b20b-2f688f93d6aa` → **200**

```json
{
  "id": "0ce3da96-b986-4a39-b20b-2f688f93d6aa",
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
    "id": "099fc046-49c1-4227-8cab-a7f2cac4ddfb",
    "order_id": "0ce3da96-b986-4a39-b20b-2f688f93d6aa",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e2be6507-97b6-4f42-9359-3bf81c984e3f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:34:53.044033Z",
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
  "session_id": "9690281e-fade-4ea9-a78d-7239d570b517",
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
  "last_heartbeat_at": "2026-10-28T14:34:51.3126Z",
  "last_location_at": "2026-10-28T14:34:51.3126Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9690281e-fade-4ea9-a78d-7239d570b517/close` → **200**

```json
{
  "command_id": "e598374c-b130-47e9-bb02-5ce07d1594cd",
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
  "session_id": "d5e684f5-16b2-4e54-9887-5c6dee51cd5b",
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
  "last_heartbeat_at": "2026-10-28T14:34:54.439733Z",
  "last_location_at": "2026-10-28T14:34:54.439733Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d5e684f5-16b2-4e54-9887-5c6dee51cd5b/close` → **200**

```json
{
  "command_id": "8b6183c6-686b-4d7a-b5c3-22c523afbafe",
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

Done: terminal order 0ce3da96-b986-4a39-b20b-2f688f93d6aa by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23878"
}
```

```json
{
  "challenge_id": "2583488c-9d87-483b-a6a3-cb7731b828d7",
  "expires_at": "2026-10-28T14:40:00.275904154Z",
  "resend_available_at": "2026-10-28T14:35:01.275904154Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "284982",
  "sent_at": "2026-10-28T14:35:00.27904314Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2583488c-9d87-483b-a6a3-cb7731b828d7",
  "code": "284982",
  "device_ref": "sandbox-23878"
}
```

```json
{
  "session_id": "cc24f3b2-daa4-4321-afe8-a1c8fb93f6d3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTAwMCwiaWF0IjoxNzkzMTk4MTAwLCJqdGkiOiIyZjYwZDM4Yi00YTAwLTRkZDktOTNmMC0zNzY3ZTVhYzhkYTMiLCJzaWQiOiJjYzI0ZjNiMi1kYWE0LTQzMjEtYWZlOC1hMWM4ZmI5M2Y2ZDMifQ.V8nNIpa4nKm-ssFRfqNEefGhHfca9g3KtROUobekKuA",
  "access_expires_at": "2026-10-28T14:50:00.595113925Z",
  "refresh_token": "Tmbq50BD6j1mCDBNbJfkIAp3QL4rpBA-P0W86TJ9Vng",
  "refresh_expires_at": "2026-11-27T14:35:00.594434488Z",
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
  "device_ref": "sandbox-31947"
}
```

```json
{
  "challenge_id": "14d2c752-0d27-4120-aa39-565384d6ad1a",
  "expires_at": "2026-10-28T14:40:01.1508479Z",
  "resend_available_at": "2026-10-28T14:35:02.1508479Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "076176",
  "sent_at": "2026-10-28T14:35:01.15310179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14d2c752-0d27-4120-aa39-565384d6ad1a",
  "code": "076176",
  "device_ref": "sandbox-31947"
}
```

```json
{
  "session_id": "20c2c46c-7bec-4e41-8a3d-47101e9e95f6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTAwMSwiaWF0IjoxNzkzMTk4MTAxLCJqdGkiOiJlM2Y5ZTNhYS0wNjIxLTRkZTktODYzNy1iOWIyNTNhM2QwNzciLCJzaWQiOiIyMGMyYzQ2Yy03YmVjLTRlNDEtOGEzZC00NzEwMWU5ZTk1ZjYifQ.8Wdp6o1DQUX7s8fApd-yYF0kjoCgu1C-T7ersmyKbRA",
  "access_expires_at": "2026-10-28T14:50:01.462656324Z",
  "refresh_token": "1XXLyKvXEYARYknjtt9y-kodrpdocNDUpAcFWh-ZsvM",
  "refresh_expires_at": "2026-11-27T14:35:01.462062195Z",
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
  "device_ref": "sandbox-31348"
}
```

```json
{
  "challenge_id": "79d835b5-8f46-4168-9dd4-345c9e372167",
  "expires_at": "2026-10-28T14:40:02.013227404Z",
  "resend_available_at": "2026-10-28T14:35:03.013227404Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "276884",
  "sent_at": "2026-10-28T14:35:02.015450974Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79d835b5-8f46-4168-9dd4-345c9e372167",
  "code": "276884",
  "device_ref": "sandbox-31348"
}
```

```json
{
  "session_id": "7a516d10-4dba-494d-8e62-a4b166492f6b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTAwMiwiaWF0IjoxNzkzMTk4MTAyLCJqdGkiOiIyNDBiNTFkNi01YmNhLTQ3N2MtYjVjYy1mZTY4YTczN2EyMmQiLCJzaWQiOiI3YTUxNmQxMC00ZGJhLTQ5NGQtOGU2Mi1hNGIxNjY0OTJmNmIifQ.i0qduZvG42UXt6C7HcnvDqMzYL23PO2EjfROAW9NioY",
  "access_expires_at": "2026-10-28T14:50:02.313069099Z",
  "refresh_token": "nKTxi6S-aHrwEjPK9xcJzFCJXWFC8KkqOcnCoAmK3qk",
  "refresh_expires_at": "2026-11-27T14:35:02.312581496Z",
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
  "phone": "+380691407584",
  "device_ref": "sandbox-26118"
}
```

```json
{
  "challenge_id": "3acf6036-bfd6-4c3d-b782-ba432e23c64e",
  "expires_at": "2026-10-28T14:40:02.847937371Z",
  "resend_available_at": "2026-10-28T14:35:03.847937371Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380691407584` → **200**

```json
{
  "phone": "+380691407584",
  "audience": "CLIENT",
  "code": "773386",
  "sent_at": "2026-10-28T14:35:02.850227686Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3acf6036-bfd6-4c3d-b782-ba432e23c64e",
  "code": "773386",
  "device_ref": "sandbox-26118"
}
```

```json
{
  "session_id": "71bee6f2-7bff-4ff9-81ae-7bc7c55d267e",
  "subject": {
    "type": "CLIENT",
    "id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjliN2U5MS00Y2RkLTQ4MmYtYTVkZi0xOWZhNjViNmNmMTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5MDAzLCJpYXQiOjE3OTMxOTgxMDMsImp0aSI6IjQwNWVkZDk4LTA5MGItNDE2Ny1iZDlhLWMzMGZhMzJiMzk2MyIsInNpZCI6IjcxYmVlNmYyLTdiZmYtNGZmOS04MWFlLTdiYzdjNTVkMjY3ZSJ9.ukWkJomaBg4-epmH4TBrQsz59SM59zfom-vvYQy5hMg",
  "access_expires_at": "2026-10-28T14:50:03.155185197Z",
  "refresh_token": "IBZPYfVLtADQPWi3TXJZ4jSKGxYdzRW97_AmoAJbZho",
  "refresh_expires_at": "2026-11-27T14:35:03.154703562Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eed11ac2-3c6e-424e-b5e8-7fb0107afefb",
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
  "id": "9efd868b-6c02-4705-95df-0c04ff360461",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:40:03.430942Z",
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
  "command_id": "e3e2ec9f-0a43-4e4f-8482-8f32f25a5612",
  "quote_id": "9efd868b-6c02-4705-95df-0c04ff360461",
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
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
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
{
  "blizz_orders_total": 23,
  "blizz_orders_cancelled_total": 12,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 15,
  "blizz_dispatch_assigned_seconds_count": 14,
  "blizz_offers_total": 17,
  "blizz_dispatch_excluded_total": 7,
  "blizz_sms_sent_total": 62
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 14
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 11.488941306
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 2.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 15
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.133114114
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 14.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 15.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 5.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 3.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 55.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/829e8a1f-ac31-4a4b-84de-d77e018d7f99` → **200**

```json
{
  "id": "829e8a1f-ac31-4a4b-84de-d77e018d7f99",
  "short_number": 23,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c69b7e91-4cdd-482f-a5df-19fa65b6cf14",
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
  "created_at": "2026-10-28T14:35:03.711492Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
