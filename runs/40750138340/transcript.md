# Sandbox transcript (2026-10-28T19:00:08Z, 2550f3b)

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
  "correlation_id": "0d1c53a3-468b-4397-afcc-dd0c7af88981"
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
  "session_id": "0cb57f7c-2676-4a2c-87b1-34c7412a913c",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQ5MTYsImlhdCI6MTc5MzIxNDAxNiwianRpIjoiNTNjZjk4YjktNmNlOS00MGFmLTgyMmEtYzUzNzdkN2M1NGMyIiwic2lkIjoiMGNiNTdmN2MtMjY3Ni00YTJjLTg3YjEtMzRjNzQxMmE5MTNjIn0.moQomAzmoX1rOr7CLmrijZWcjuIqxIp9P7NhUYGO2w8",
  "access_expires_at": "2026-10-28T19:15:16.272748817Z",
  "refresh_token": "YsFK277jzYp68lwGAGoW6I3ecpizNgCJHDoQXRnl5JM",
  "refresh_expires_at": "2026-10-29T07:00:16.270231946Z",
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
  "session_id": "02646b1d-56a1-4cff-9d70-9ff5792ccd10",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQ5MTgsImlhdCI6MTc5MzIxNDAxOCwianRpIjoiNmFkYTk4YzItZTM4Yi00YjU3LThjNTAtZDFkNTMwNTFmYTQwIiwic2lkIjoiMDI2NDZiMWQtNTZhMS00Y2ZmLTlkNzAtOWZmNTc5MmNjZDEwIn0.aaiEblwhItKxHyIE08F6owlql3cZwsP3GiCHAL7_bqg",
  "access_expires_at": "2026-10-28T19:15:18.014220658Z",
  "refresh_token": "6Ci-CWnWIxJjBUfEsUoYJDMRL1GenI7Ye9SAR2403dc",
  "refresh_expires_at": "2026-10-29T07:00:18.013119462Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "bb6e102e-50ef-4e81-aa3a-87d11d6c9fe3",
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
  "id": "55d79502-bed3-4364-ba84-cac719d14b55",
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
  "created_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "created_at": "2026-10-28T19:00:18.353784Z",
  "updated_at": "2026-10-28T19:00:18.353784Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639285022",
  "device_ref": "sandbox-27844"
}
```

```json
{
  "challenge_id": "b88c5751-94cb-435e-8c6b-1183931c5dd0",
  "expires_at": "2026-10-28T19:05:18.684696365Z",
  "resend_available_at": "2026-10-28T19:00:19.684696365Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639285022` → **200**

```json
{
  "phone": "+380639285022",
  "audience": "CLIENT",
  "code": "167414",
  "sent_at": "2026-10-28T19:00:18.697096218Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b88c5751-94cb-435e-8c6b-1183931c5dd0",
  "code": "167414",
  "device_ref": "sandbox-27844"
}
```

```json
{
  "session_id": "c325cc94-8804-4678-8ef9-09c4380ddb82",
  "subject": {
    "type": "CLIENT",
    "id": "18819f29-a1ac-4d1a-8392-38aa5b2ba42a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODgxOWYyOS1hMWFjLTRkMWEtODM5Mi0zOGFhNWIyYmE0MmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0OTE5LCJpYXQiOjE3OTMyMTQwMTksImp0aSI6ImM2YWM5MGUwLWM0YWEtNDAwZC1iN2EwLWEyMjVlMjMzMmI2MSIsInNpZCI6ImMzMjVjYzk0LTg4MDQtNDY3OC04ZWY5LTA5YzQzODBkZGI4MiJ9.VbNPzMjaIxiPR3GmR2avhJDC8XhA_LNcuceOTWDLy-w",
  "access_expires_at": "2026-10-28T19:15:19.053647534Z",
  "refresh_token": "-yJ5SPU4CyFSBwEHwhiFjMf32vNH98ohbCzsLfR6GO4",
  "refresh_expires_at": "2026-11-27T19:00:19.052210944Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639285022` → **200**

```json
{
  "client_id": "18819f29-a1ac-4d1a-8392-38aa5b2ba42a"
}
```

`POST /api/admin/v1/rider-wallets/18819f29-a1ac-4d1a-8392-38aa5b2ba42a/top-ups` → **201**

```json
{
  "command_id": "05223fd4-8c22-4872-b0ef-e3618011e8e3",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "18819f29-a1ac-4d1a-8392-38aa5b2ba42a",
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
      "id": "638a5ca3-4205-43f4-bd32-65c3c024035a",
      "at": "2026-10-28T19:00:19.69125Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8f9433f0-69c4-4e10-96b2-947915f9f4e7",
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
  "id": "dde2bd50-67d7-4ee5-852f-3d775c11cfc8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:05:20.164407Z",
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
      "id": "55d79502-bed3-4364-ba84-cac719d14b55",
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
  "device_ref": "sandbox-6284"
}
```

```json
{
  "challenge_id": "70c96216-9f20-4137-8e4f-1043f8a616be",
  "expires_at": "2026-10-28T19:05:20.503174069Z",
  "resend_available_at": "2026-10-28T19:00:21.503174069Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "776066",
  "sent_at": "2026-10-28T19:00:20.507751462Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70c96216-9f20-4137-8e4f-1043f8a616be",
  "code": "776066",
  "device_ref": "sandbox-6284"
}
```

```json
{
  "session_id": "a76cbaba-4d0f-4d50-8715-457380edb7a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDkyMCwiaWF0IjoxNzkzMjE0MDIwLCJqdGkiOiI3OGM1NTRhOS1jMjk2LTQyOTgtYjExYS01YmQ4ZDBlMzI2ODUiLCJzaWQiOiJhNzZjYmFiYS00ZDBmLTRkNTAtODcxNS00NTczODBlZGI3YTcifQ.JQFM2sC3IcZOS4oTHqYv6FKjanrZza1OszCw2VmXc2Y",
  "access_expires_at": "2026-10-28T19:15:20.840472645Z",
  "refresh_token": "paOQ6lryjHvTZwZ1A4wi6_IBuKg-nfjNcpkA2tZfF-k",
  "refresh_expires_at": "2026-11-27T19:00:20.839085762Z",
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
  "command_id": "1486f439-9309-4370-8ce6-7978507211c4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:00:21Z",
    "sequence": 1793214021447
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5ccf03d-43e7-4713-a3ea-a9e5a5a1c02a",
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
  "last_heartbeat_at": "2026-10-28T19:00:21.499314Z",
  "last_location_at": "2026-10-28T19:00:21.499314Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dcdc9a28-afd3-4c12-998b-8b03ef4ae20b",
  "quote_id": "dde2bd50-67d7-4ee5-852f-3d775c11cfc8",
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
  "id": "9805d2af-7a00-4bdc-8cf0-419992d19299",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "18819f29-a1ac-4d1a-8392-38aa5b2ba42a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:00:21.871325Z",
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
  "client_id": "18819f29-a1ac-4d1a-8392-38aa5b2ba42a",
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
      "id": "638a5ca3-4205-43f4-bd32-65c3c024035a",
      "at": "2026-10-28T19:00:19.69125Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "716e1551-e1ad-4619-8d26-a6521c301975",
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
    "id": "dd80a349-2d6a-4ef5-be65-cae37562a1f6",
    "order_id": "9805d2af-7a00-4bdc-8cf0-419992d19299",
    "expires_at": "2026-10-28T19:00:36.887361Z",
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

`POST /api/driver/v1/offers/dd80a349-2d6a-4ef5-be65-cae37562a1f6/accept` → **200**

```json
{
  "command_id": "19e782d4-9da2-42c1-9282-f44eb7b794a2"
}
```

```json
{
  "id": "028da182-262b-47c4-a324-e26e5a79f9d5",
  "order_id": "9805d2af-7a00-4bdc-8cf0-419992d19299",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5a002f8e-6a54-4a56-9aef-c676fa613a5b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5a002f8e-6a54-4a56-9aef-c676fa613a5b",
  "order_id": "9805d2af-7a00-4bdc-8cf0-419992d19299",
  "assignment_id": "028da182-262b-47c4-a324-e26e5a79f9d5",
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

`POST /api/driver/v1/work-sessions/c5ccf03d-43e7-4713-a3ea-a9e5a5a1c02a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:00:23Z",
    "sequence": 1793214023430
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5ccf03d-43e7-4713-a3ea-a9e5a5a1c02a",
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
  "last_heartbeat_at": "2026-10-28T19:00:23.46113Z",
  "last_location_at": "2026-10-28T19:00:23.46113Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5a002f8e-6a54-4a56-9aef-c676fa613a5b/arrive` → **200**

```json
{
  "command_id": "346f0707-31b3-4f04-822e-c2ce697b971b",
  "expected_version": 0
}
```

```json
{
  "id": "5a002f8e-6a54-4a56-9aef-c676fa613a5b",
  "order_id": "9805d2af-7a00-4bdc-8cf0-419992d19299",
  "assignment_id": "028da182-262b-47c4-a324-e26e5a79f9d5",
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
  "arrived_at": "2026-10-28T19:00:23.790763Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5a002f8e-6a54-4a56-9aef-c676fa613a5b/start` → **200**

```json
{
  "command_id": "cad24e7e-a562-428a-8418-7178452c9118",
  "expected_version": 1
}
```

```json
{
  "id": "5a002f8e-6a54-4a56-9aef-c676fa613a5b",
  "order_id": "9805d2af-7a00-4bdc-8cf0-419992d19299",
  "assignment_id": "028da182-262b-47c4-a324-e26e5a79f9d5",
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
  "arrived_at": "2026-10-28T19:00:23.790763Z",
  "started_at": "2026-10-28T19:00:24.114687Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/5a002f8e-6a54-4a56-9aef-c676fa613a5b/complete` → **200**

```json
{
  "command_id": "0abd22ff-160f-430a-90da-9413e31434a3",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:00:24Z",
  "cash_received": true
}
```

```json
{
  "id": "5a002f8e-6a54-4a56-9aef-c676fa613a5b",
  "order_id": "9805d2af-7a00-4bdc-8cf0-419992d19299",
  "assignment_id": "028da182-262b-47c4-a324-e26e5a79f9d5",
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
  "arrived_at": "2026-10-28T19:00:23.790763Z",
  "started_at": "2026-10-28T19:00:24.114687Z",
  "completed_at": "2026-10-28T19:00:24.464943Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "18819f29-a1ac-4d1a-8392-38aa5b2ba42a",
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
      "id": "390d4126-6a23-4797-b5f9-2942c5760df2",
      "at": "2026-10-28T19:00:25.325176Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "9805d2af-7a00-4bdc-8cf0-419992d19299"
    },
    {
      "id": "638a5ca3-4205-43f4-bd32-65c3c024035a",
      "at": "2026-10-28T19:00:19.69125Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/55d79502-bed3-4364-ba84-cac719d14b55/archive` → **200**

```json
{
  "command_id": "64d39044-0cc7-4674-82fb-bc02232313f9",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "55d79502-bed3-4364-ba84-cac719d14b55",
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
  "created_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "created_at": "2026-10-28T19:00:18.353784Z",
  "updated_at": "2026-10-28T19:00:28.107372Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5ccf03d-43e7-4713-a3ea-a9e5a5a1c02a",
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
  "last_heartbeat_at": "2026-10-28T19:00:23.46113Z",
  "last_location_at": "2026-10-28T19:00:23.46113Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5ccf03d-43e7-4713-a3ea-a9e5a5a1c02a/close` → **200**

```json
{
  "command_id": "2146b044-4185-4a8f-8de7-b0c2372fa6aa",
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

Done: order 9805d2af-7a00-4bdc-8cf0-419992d19299.

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
  "session_id": "adda35b0-9f7c-498a-a53a-2a7d632e41cf",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQ5MjksImlhdCI6MTc5MzIxNDAyOSwianRpIjoiZTFjN2E2MjMtYTU0ZC00M2ZmLWJkYjctMDg1OTY2Yzg4N2UzIiwic2lkIjoiYWRkYTM1YjAtOWY3Yy00OThhLWE1M2EtMmE3ZDYzMmU0MWNmIn0.3PQCjDmaSZE4fvaY4UXWyXe4UcpXA7zl0pPqBqk0Zhg",
  "access_expires_at": "2026-10-28T19:15:29.382774015Z",
  "refresh_token": "m-cwyDQnKO-ESnvT4fxA_XHThrzvUeB_Hk9u6RWefzw",
  "refresh_expires_at": "2026-10-29T07:00:29.381991692Z",
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
  "command_id": "73d3e5f3-519b-4d51-8244-e83119f40e73",
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
  "session_id": "c0e9b096-3fc4-4081-8371-df16a5d10c35",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQ5MzAsImlhdCI6MTc5MzIxNDAzMCwianRpIjoiOTdhZTZjMDQtMGJhZi00ZmU2LTljZjEtZmJjY2FmMjAxOWE2Iiwic2lkIjoiYzBlOWIwOTYtM2ZjNC00MDgxLTgzNzEtZGYxNmE1ZDEwYzM1In0.mU16D6RZ5SkPfTjOzVTvA5S6bqasjNoZnrDNhR7lJH0",
  "access_expires_at": "2026-10-28T19:15:30.642354518Z",
  "refresh_token": "VgX-TKxBeD2xfzVc6I4Ea-XV9doat7wf1nUpP57vrZE",
  "refresh_expires_at": "2026-10-29T07:00:30.641500609Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.122494901",
    "linkedid": "1730052700.122494901",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670245232"
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
    "id": "1730052700.122494901",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "6f8bc47f-a618-4356-b365-fbf8662b7cb7",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670245232",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T19:00:30.929516Z",
      "answered_at": null,
      "ended_at": "2026-10-28T19:00:30.960781Z",
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
    "id": "1730052600.170031443",
    "linkedid": "1730052600.170031443",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670245232"
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
      "id": "9e194682-1986-4ec7-b92d-962a8c2815fc",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670245232",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T19:00:31.311554Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/9e194682-1986-4ec7-b92d-962a8c2815fc/answer` → **200**

```json
{
  "command_id": "ec3308a6-a2af-4d98-82f9-44d9d6291c6c"
}
```

```json
{
  "id": "9e194682-1986-4ec7-b92d-962a8c2815fc",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670245232",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "order_ids": [],
  "started_at": "2026-10-28T19:00:31.311554Z",
  "answered_at": "2026-10-28T19:00:31.667842Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.170031443",
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
    "id": "1730052600.170031443",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9e194682-1986-4ec7-b92d-962a8c2815fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670245232",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_ids": [],
      "started_at": "2026-10-28T19:00:31.311554Z",
      "answered_at": "2026-10-28T19:00:31.667842Z",
      "ended_at": "2026-10-28T19:00:31.989164Z",
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
      "id": "9e194682-1986-4ec7-b92d-962a8c2815fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670245232",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_ids": [],
      "started_at": "2026-10-28T19:00:31.311554Z",
      "answered_at": "2026-10-28T19:00:31.667842Z",
      "ended_at": "2026-10-28T19:00:31.989164Z",
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
      "id": "9e194682-1986-4ec7-b92d-962a8c2815fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670245232",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_ids": [],
      "started_at": "2026-10-28T19:00:31.311554Z",
      "answered_at": "2026-10-28T19:00:31.667842Z",
      "ended_at": "2026-10-28T19:00:31.989164Z",
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
      "id": "9e194682-1986-4ec7-b92d-962a8c2815fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670245232",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_ids": [],
      "started_at": "2026-10-28T19:00:31.311554Z",
      "answered_at": "2026-10-28T19:00:31.667842Z",
      "ended_at": "2026-10-28T19:00:31.989164Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:00:37.057825Z"
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
      "id": "9e194682-1986-4ec7-b92d-962a8c2815fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670245232",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_ids": [],
      "started_at": "2026-10-28T19:00:31.311554Z",
      "answered_at": "2026-10-28T19:00:31.667842Z",
      "ended_at": "2026-10-28T19:00:31.989164Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:00:37.057825Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/9e194682-1986-4ec7-b92d-962a8c2815fc/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/9e194682-1986-4ec7-b92d-962a8c2815fc/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=9e194682-1986-4ec7-b92d-962a8c2815fc` → **200**

```json
{
  "changes": [
    {
      "id": "0eb19db7-a44b-4395-9a3b-a2f966819c6f",
      "occurred_at": "2026-10-28T19:00:39.566143Z",
      "actor_type": "STAFF",
      "actor_id": "716e1551-e1ad-4619-8d26-a6521c301975",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "9e194682-1986-4ec7-b92d-962a8c2815fc",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"d0fb9258-c28b-47dd-a619-07cb5c90311c\", \"order_ids\": []}",
      "correlation_id": "a876306b-de6d-4108-90d3-6f4b037c2c92"
    },
    {
      "id": "105413bb-3dd5-4b26-90a0-9bf93975c994",
      "occurred_at": "2026-10-28T19:00:39.526336Z",
      "actor_type": "STAFF",
      "actor_id": "716e1551-e1ad-4619-8d26-a6521c301975",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "9e194682-1986-4ec7-b92d-962a8c2815fc",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"d0fb9258-c28b-47dd-a619-07cb5c90311c\", \"order_ids\": []}",
      "correlation_id": "590674f3-59e0-49da-9efe-a58c3adb40c1"
    }
  ]
}
```

Done: call 9e194682-1986-4ec7-b92d-962a8c2815fc recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23376"
}
```

```json
{
  "challenge_id": "2cc82ca1-ea27-44cc-98f9-e4f120dabf49",
  "expires_at": "2026-10-28T19:05:39.966918069Z",
  "resend_available_at": "2026-10-28T19:00:40.966918069Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "588150",
  "sent_at": "2026-10-28T19:00:39.972500752Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2cc82ca1-ea27-44cc-98f9-e4f120dabf49",
  "code": "588150",
  "device_ref": "sandbox-23376"
}
```

```json
{
  "session_id": "8793c4b4-9914-4b2e-a811-196a255e50af",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDk0MCwiaWF0IjoxNzkzMjE0MDQwLCJqdGkiOiI4Nzk3MDFhMi1lYjU2LTQ4YzMtYTc3ZC1iOThjZTVlNjRkOWEiLCJzaWQiOiI4NzkzYzRiNC05OTE0LTRiMmUtYTgxMS0xOTZhMjU1ZTUwYWYifQ.c-r3HOryhLVlGxMi_LRv4_JxT6KeXq12k20PMIb9QtM",
  "access_expires_at": "2026-10-28T19:15:40.329430323Z",
  "refresh_token": "iowR8yiGPSCyC8h6d0mFPMUZmfPkcN3H2Dihet3pmPY",
  "refresh_expires_at": "2026-11-27T19:00:40.32847925Z",
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
  "command_id": "23d24e51-8c3f-4bff-b2ce-45575208cc76",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:00:40Z",
    "sequence": 1793214040913
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "69464470-f2e8-467b-9cea-0700a01dc415",
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
  "last_heartbeat_at": "2026-10-28T19:00:40.937056Z",
  "last_location_at": "2026-10-28T19:00:40.937056Z",
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
  "session_id": "5e9d684f-d2f8-40de-a733-10e608971c31",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQ5NDEsImlhdCI6MTc5MzIxNDA0MSwianRpIjoiMGMxZGUxZjAtMDVhMy00M2RmLTk3YTctNDExYjRjOWZkZTk3Iiwic2lkIjoiNWU5ZDY4NGYtZDJmOC00MGRlLWE3MzMtMTBlNjA4OTcxYzMxIn0.6Bd8AgP24_jHvPHZN8rVKggxxhTuMkrq4pxgKc1yt6Y",
  "access_expires_at": "2026-10-28T19:15:41.577279216Z",
  "refresh_token": "xeFEDQp8cMtgcdWvE8aAjWSkdWQ-shuJyegKv4WZ-FE",
  "refresh_expires_at": "2026-10-29T07:00:41.576619263Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4bc13412-67c4-43a2-b8ca-672e296662c0",
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
  "id": "98894868-36cc-44d8-9b20-edb2dba8e263",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:05:41.898331Z",
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
  "command_id": "56263805-3a2b-47cb-a0b8-f4da37bc53a0",
  "quote_id": "98894868-36cc-44d8-9b20-edb2dba8e263",
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
    "phone": "+380678284669"
  }
}
```

```json
{
  "id": "faf0fdd4-acec-4d7d-bdc5-f0f6e0a83fdf",
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
  "created_at": "2026-10-28T19:00:42.242193Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678284669"
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
    "id": "0808e67a-1d58-4928-9ea2-b0421ff66dfd",
    "order_id": "faf0fdd4-acec-4d7d-bdc5-f0f6e0a83fdf",
    "expires_at": "2026-10-28T19:00:57.249335Z",
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

`POST /api/driver/v1/offers/0808e67a-1d58-4928-9ea2-b0421ff66dfd/accept` → **200**

```json
{
  "command_id": "89dad9f1-faf2-479e-a507-a891305f14d0"
}
```

```json
{
  "id": "c420b7c2-df24-4fd9-922b-2fe498e658d9",
  "order_id": "faf0fdd4-acec-4d7d-bdc5-f0f6e0a83fdf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "40c91d7b-64d0-43cd-991b-e50ba950eb2f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678284669` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678284669` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678284669` → **200**

```json
[
  {
    "phone": "+380678284669",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:00:44.280942476Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678284669` → **200**

```json
[
  {
    "phone": "+380678284669",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:00:44.280942476Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678284669` → **200**

```json
[
  {
    "phone": "+380678284669",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:00:44.280942476Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "40c91d7b-64d0-43cd-991b-e50ba950eb2f",
  "order_id": "faf0fdd4-acec-4d7d-bdc5-f0f6e0a83fdf",
  "assignment_id": "c420b7c2-df24-4fd9-922b-2fe498e658d9",
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
    "phone": "+380678284669"
  }
}
```

`POST /api/driver/v1/work-sessions/69464470-f2e8-467b-9cea-0700a01dc415/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:00:45Z",
    "sequence": 1793214045615
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "69464470-f2e8-467b-9cea-0700a01dc415",
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
  "last_heartbeat_at": "2026-10-28T19:00:45.640342Z",
  "last_location_at": "2026-10-28T19:00:45.640342Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/40c91d7b-64d0-43cd-991b-e50ba950eb2f/arrive` → **200**

```json
{
  "command_id": "654c902f-986f-478a-a6ec-d847d926f263",
  "expected_version": 0
}
```

```json
{
  "id": "40c91d7b-64d0-43cd-991b-e50ba950eb2f",
  "order_id": "faf0fdd4-acec-4d7d-bdc5-f0f6e0a83fdf",
  "assignment_id": "c420b7c2-df24-4fd9-922b-2fe498e658d9",
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
  "arrived_at": "2026-10-28T19:00:45.952096Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678284669"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678284669` → **200**

```json
[
  {
    "phone": "+380678284669",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:00:44.280942476Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678284669` → **200**

```json
[
  {
    "phone": "+380678284669",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:00:44.280942476Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678284669` → **200**

```json
[
  {
    "phone": "+380678284669",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:00:44.280942476Z"
  },
  {
    "phone": "+380678284669",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T19:00:47.292202139Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678284669` → **200**

```json
[
  {
    "phone": "+380678284669",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:00:44.280942476Z"
  },
  {
    "phone": "+380678284669",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T19:00:47.292202139Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678284669` → **200**

```json
[
  {
    "phone": "+380678284669",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:00:44.280942476Z"
  },
  {
    "phone": "+380678284669",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T19:00:47.292202139Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/40c91d7b-64d0-43cd-991b-e50ba950eb2f/start` → **200**

```json
{
  "command_id": "026795a4-ad7a-438b-98a9-50cf98ec1d53",
  "expected_version": 1
}
```

```json
{
  "id": "40c91d7b-64d0-43cd-991b-e50ba950eb2f",
  "order_id": "faf0fdd4-acec-4d7d-bdc5-f0f6e0a83fdf",
  "assignment_id": "c420b7c2-df24-4fd9-922b-2fe498e658d9",
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
  "arrived_at": "2026-10-28T19:00:45.952096Z",
  "started_at": "2026-10-28T19:00:48.414412Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678284669"
  }
}
```

`POST /api/driver/v1/trips/40c91d7b-64d0-43cd-991b-e50ba950eb2f/complete` → **200**

```json
{
  "command_id": "437b4fbf-17fc-4541-b407-a2f46376ca6b",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:00:48Z",
  "cash_received": true
}
```

```json
{
  "id": "40c91d7b-64d0-43cd-991b-e50ba950eb2f",
  "order_id": "faf0fdd4-acec-4d7d-bdc5-f0f6e0a83fdf",
  "assignment_id": "c420b7c2-df24-4fd9-922b-2fe498e658d9",
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
  "arrived_at": "2026-10-28T19:00:45.952096Z",
  "started_at": "2026-10-28T19:00:48.414412Z",
  "completed_at": "2026-10-28T19:00:48.734288Z",
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
  "session_id": "69464470-f2e8-467b-9cea-0700a01dc415",
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
  "last_heartbeat_at": "2026-10-28T19:00:45.640342Z",
  "last_location_at": "2026-10-28T19:00:45.640342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/69464470-f2e8-467b-9cea-0700a01dc415/close` → **200**

```json
{
  "command_id": "da636b15-ad84-4b74-8a52-2202aa95d8a7",
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
  "phone": "+380636828228",
  "device_ref": "sandbox-3049"
}
```

```json
{
  "challenge_id": "2bda4dfc-8357-4093-8650-2ba69c164d33",
  "expires_at": "2026-10-28T19:05:49.674222099Z",
  "resend_available_at": "2026-10-28T19:00:50.674222099Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636828228` → **200**

```json
{
  "phone": "+380636828228",
  "audience": "CLIENT",
  "code": "548944",
  "sent_at": "2026-10-28T19:00:49.6785568Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2bda4dfc-8357-4093-8650-2ba69c164d33",
  "code": "548944",
  "device_ref": "sandbox-3049"
}
```

```json
{
  "session_id": "394906d8-5bc0-442f-bb86-b9a16f5d7d29",
  "subject": {
    "type": "CLIENT",
    "id": "9e05a50e-1a7e-4dd3-a3c0-d8b089bd9d96"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTA1YTUwZS0xYTdlLTRkZDMtYTNjMC1kOGIwODliZDlkOTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0OTUwLCJpYXQiOjE3OTMyMTQwNTAsImp0aSI6IjI0NThlNDhjLWY3OTQtNDc2NC1hODA5LTRmMDY2Zjg5ZjJkYSIsInNpZCI6IjM5NDkwNmQ4LTViYzAtNDQyZi1iYjg2LWI5YTE2ZjVkN2QyOSJ9.FYzWlrJHwvWBXMJvQlSL9BzBnur13YK1DaNGKpalo5c",
  "access_expires_at": "2026-10-28T19:15:50.002871455Z",
  "refresh_token": "uZyApOkjpwkF7pGKuKNdhDtRLvh8v4-BGwmJFhOXRnU",
  "refresh_expires_at": "2026-11-27T19:00:50.002008522Z",
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
  "device_ref": "sandbox-13624"
}
```

```json
{
  "challenge_id": "57f01558-d2e5-4f66-a9d0-c710ab63324f",
  "expires_at": "2026-10-28T19:05:50.594541642Z",
  "resend_available_at": "2026-10-28T19:00:51.594541642Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "857350",
  "sent_at": "2026-10-28T19:00:50.598044568Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57f01558-d2e5-4f66-a9d0-c710ab63324f",
  "code": "857350",
  "device_ref": "sandbox-13624"
}
```

```json
{
  "session_id": "b27e8985-90c6-4fd8-af23-f206af2808bd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDk1MCwiaWF0IjoxNzkzMjE0MDUwLCJqdGkiOiJmNzkxMDJlZi1hNzZjLTQzMjMtYTQwZi1kNDFiNWQwMzhhMTEiLCJzaWQiOiJiMjdlODk4NS05MGM2LTRmZDgtYWYyMy1mMjA2YWYyODA4YmQifQ.y86aONEdvMSKTaML4fG7gOc_N9sUZ9J-Z_pDWdFI8jw",
  "access_expires_at": "2026-10-28T19:15:50.925192029Z",
  "refresh_token": "u5CTOxxf_sVOzhqt-Ijw720f86DQe0nhuEU6hz7gx-s",
  "refresh_expires_at": "2026-11-27T19:00:50.924302677Z",
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
  "session_id": "240f7d8f-3dcb-4f23-9092-b066f2b6a137",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQ5NTEsImlhdCI6MTc5MzIxNDA1MSwianRpIjoiODM0YTcwYWQtNjQyMS00ODYzLTliMjYtMTg0YmZlZDAwZjVmIiwic2lkIjoiMjQwZjdkOGYtM2RjYi00ZjIzLTkwOTItYjA2NmYyYjZhMTM3In0.y13hRyuFTZRvnvW0Xv0e17cossoAOI2-QcrB8JPOohY",
  "access_expires_at": "2026-10-28T19:15:51.844937071Z",
  "refresh_token": "IXC1Z-beEqBf4Ucj3Igr1e8xFIaVi19TfGpkQdekNFs",
  "refresh_expires_at": "2026-10-29T07:00:51.84424495Z",
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
  "session_id": "c2f97149-b584-409c-99fc-619d969eea7d",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQ5NTIsImlhdCI6MTc5MzIxNDA1MiwianRpIjoiNDYyODAxMDAtNzcwNS00ZDI0LTkwMmItZmE2MjZmMmIzZjZjIiwic2lkIjoiYzJmOTcxNDktYjU4NC00MDljLTk5ZmMtNjE5ZDk2OWVlYTdkIn0.f3O6D2-3yPzFE8podfOqs0f-5UczYVEt756LfTEPH6s",
  "access_expires_at": "2026-10-28T19:15:52.461785206Z",
  "refresh_token": "8nJobgiLRd0qICGV8j2WBAYtN5_q38xBe1OwkR2wp0g",
  "refresh_expires_at": "2026-10-29T07:00:52.461139243Z",
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
  "command_id": "56fa9404-89dd-4498-864d-c3b81d4b5659",
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
  "id": "91e2cc78-d1aa-4ae4-a0b4-7b0a8de96450",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:05:53.066602Z",
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
  "command_id": "6bfc01e6-592b-4035-9e8a-692b687158fc",
  "quote_id": "91e2cc78-d1aa-4ae4-a0b4-7b0a8de96450",
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
  "id": "ea67a9b3-7190-4ddb-bd17-9afbc360ecd6",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e05a50e-1a7e-4dd3-a3c0-d8b089bd9d96",
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
  "created_at": "2026-10-28T19:00:53.383742Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ea67a9b3-7190-4ddb-bd17-9afbc360ecd6` → **200**

```json
{
  "id": "ea67a9b3-7190-4ddb-bd17-9afbc360ecd6",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e05a50e-1a7e-4dd3-a3c0-d8b089bd9d96",
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
  "created_at": "2026-10-28T19:00:53.383742Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ea67a9b3-7190-4ddb-bd17-9afbc360ecd6/cancel` → **200**

```json
{
  "command_id": "8b6a7c98-c42f-4599-ac7a-bedc8685dfed",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "ea67a9b3-7190-4ddb-bd17-9afbc360ecd6",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9e05a50e-1a7e-4dd3-a3c0-d8b089bd9d96",
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
  "created_at": "2026-10-28T19:00:53.383742Z",
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
  "command_id": "edbd127d-13e3-414e-8f47-b3276d46adf8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:00:54Z",
    "sequence": 1793214054645
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "124e2543-bd22-4d1a-b8fd-8e9f9bda1c6d",
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
  "last_heartbeat_at": "2026-10-28T19:00:54.668508Z",
  "last_location_at": "2026-10-28T19:00:54.668508Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11619"
}
```

```json
{
  "challenge_id": "1f6af058-334b-41d4-9efb-bf4d82d29ce7",
  "expires_at": "2026-10-28T19:05:54.954261778Z",
  "resend_available_at": "2026-10-28T19:00:55.954261778Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "237854",
  "sent_at": "2026-10-28T19:00:54.957873413Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f6af058-334b-41d4-9efb-bf4d82d29ce7",
  "code": "237854",
  "device_ref": "sandbox-11619"
}
```

```json
{
  "session_id": "308c3b72-0447-43f7-87c3-137a19543b69",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDk1NSwiaWF0IjoxNzkzMjE0MDU1LCJqdGkiOiI5ZjRiYmU4Yi0wM2NkLTQxMmItOGE1MC03ZjA3NDU1ZWRmZjMiLCJzaWQiOiIzMDhjM2I3Mi0wNDQ3LTQzZjctODdjMy0xMzdhMTk1NDNiNjkifQ.tpnjtwuOy9Dg-SILaWcYDpCRh79YNENT3IrTpCcodxg",
  "access_expires_at": "2026-10-28T19:15:55.300935406Z",
  "refresh_token": "Krs6Tp_dPdMNMaI-f0uRqepDQtFGeYJGxfLqX2B1ERE",
  "refresh_expires_at": "2026-11-27T19:00:55.30018154Z",
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
  "command_id": "8c15b963-bcbb-41da-b7a1-e6e291ff55d2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:00:55Z",
    "sequence": 1793214055893
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a6d7f83e-91b8-4281-a56a-cf1cc07e18d0",
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
  "last_heartbeat_at": "2026-10-28T19:00:55.916674Z",
  "last_location_at": "2026-10-28T19:00:55.916674Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76913e65-299c-4b34-8509-e46f160cc67b",
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
  "id": "f82e4378-b727-45bc-8890-f07a377b457c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:05:56.224928Z",
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
  "command_id": "39803a6c-1271-4e07-8c6a-1c05439ad47d",
  "quote_id": "f82e4378-b727-45bc-8890-f07a377b457c",
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
  "id": "74db9585-20b5-430d-b6e1-0583148dfdec",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e05a50e-1a7e-4dd3-a3c0-d8b089bd9d96",
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
  "created_at": "2026-10-28T19:00:56.538749Z",
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
    "id": "13b4cc87-f1f0-4b1b-aa16-92a6f17f7e86",
    "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
    "expires_at": "2026-10-28T19:01:11.543691Z",
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

`POST /api/driver/v1/offers/13b4cc87-f1f0-4b1b-aa16-92a6f17f7e86/accept` → **200**

```json
{
  "command_id": "f23fe183-4297-4530-b709-d8ae69c369eb"
}
```

```json
{
  "id": "9ef207fd-6510-4f1d-a9c7-5dfb4bfca0b7",
  "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bdfce25b-769f-4474-a51f-4fb19ba4e1fe",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bdfce25b-769f-4474-a51f-4fb19ba4e1fe",
  "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
  "assignment_id": "9ef207fd-6510-4f1d-a9c7-5dfb4bfca0b7",
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

`POST /api/driver/v1/trips/bdfce25b-769f-4474-a51f-4fb19ba4e1fe/cancel` → **200**

```json
{
  "command_id": "7ffc9da7-69de-4a18-8a26-4a0788009464",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "bdfce25b-769f-4474-a51f-4fb19ba4e1fe",
  "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
  "assignment_id": "9ef207fd-6510-4f1d-a9c7-5dfb4bfca0b7",
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

`GET /api/rider/v1/orders/74db9585-20b5-430d-b6e1-0583148dfdec` → **200**

```json
{
  "id": "74db9585-20b5-430d-b6e1-0583148dfdec",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9e05a50e-1a7e-4dd3-a3c0-d8b089bd9d96",
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
    "id": "9ef207fd-6510-4f1d-a9c7-5dfb4bfca0b7",
    "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "bdfce25b-769f-4474-a51f-4fb19ba4e1fe",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T19:00:56.538749Z",
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
    "id": "0416df79-c02e-403e-9b16-9e385e836eaa",
    "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
    "expires_at": "2026-10-28T19:01:12.769365Z",
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

`POST /api/driver/v1/offers/0416df79-c02e-403e-9b16-9e385e836eaa/accept` → **200**

```json
{
  "command_id": "50a162ad-e58f-46eb-b348-7dd1f6c7e8ce"
}
```

```json
{
  "id": "9d3cdd77-6108-4429-8e8b-4324639d3f8b",
  "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bbfc30a0-f333-484a-913a-72c4a1e8781c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bbfc30a0-f333-484a-913a-72c4a1e8781c",
  "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
  "assignment_id": "9d3cdd77-6108-4429-8e8b-4324639d3f8b",
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

`POST /api/driver/v1/trips/bbfc30a0-f333-484a-913a-72c4a1e8781c/cancel` → **200**

```json
{
  "command_id": "32a1b2fa-d4a4-43c0-8a34-860819ed58d0",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "bbfc30a0-f333-484a-913a-72c4a1e8781c",
  "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
  "assignment_id": "9d3cdd77-6108-4429-8e8b-4324639d3f8b",
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
    "id": "74db9585-20b5-430d-b6e1-0583148dfdec",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T19:00:56.538749Z",
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
    "id": "ea67a9b3-7190-4ddb-bd17-9afbc360ecd6",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T19:00:53.383742Z",
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

`GET /api/operator/v1/orders/74db9585-20b5-430d-b6e1-0583148dfdec/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:00:56.539518Z",
      "actor": {
        "type": "CLIENT",
        "id": "9e05a50e-1a7e-4dd3-a3c0-d8b089bd9d96",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
        "quote_id": "f82e4378-b727-45bc-8890-f07a377b457c",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "83c2b1f9-89f9-4fff-8604-bb2b446b1585"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:00:56.542448Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
        "attempt_id": "1a3b70b8-fd5f-4563-a310-9bd2747b4546",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "83c2b1f9-89f9-4fff-8604-bb2b446b1585"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:00:56.551073Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "13b4cc87-f1f0-4b1b-aa16-92a6f17f7e86",
        "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "83c2b1f9-89f9-4fff-8604-bb2b446b1585"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T19:00:57.154481Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "13b4cc87-f1f0-4b1b-aa16-92a6f17f7e86",
        "order_id": "74db9585-20b5-430d-b6e1-0583148dfdec",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "9ef207fd-6510-4f1d-a9c7-5dfb4bfca0b7"
      },
      "correlation_id": "423f5a66-a422-4249-a6d9-733a434bf8a7"
```

Done: orders ea67a9b3-7190-4ddb-bd17-9afbc360ecd6, 74db9585-20b5-430d-b6e1-0583148dfdec.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732115138",
  "device_ref": "sandbox-31628"
}
```

```json
{
  "challenge_id": "f9711c60-cf8c-4198-b199-fe7492051675",
  "expires_at": "2026-10-28T19:06:00.264424748Z",
  "resend_available_at": "2026-10-28T19:01:01.264424748Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732115138` → **200**

```json
{
  "phone": "+380732115138",
  "audience": "CLIENT",
  "code": "653002",
  "sent_at": "2026-10-28T19:01:00.268065036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9711c60-cf8c-4198-b199-fe7492051675",
  "code": "653002",
  "device_ref": "sandbox-31628"
}
```

```json
{
  "session_id": "977ef3f2-45ab-4ae8-8fc0-13fa2c64fb73",
  "subject": {
    "type": "CLIENT",
    "id": "c35ede0e-844a-4b52-a368-59370424d257"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzVlZGUwZS04NDRhLTRiNTItYTM2OC01OTM3MDQyNGQyNTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0OTYwLCJpYXQiOjE3OTMyMTQwNjAsImp0aSI6ImUyMjcxODk5LTI0MjQtNGUxYy05NTkxLWEwNmJjM2I1M2MyYiIsInNpZCI6Ijk3N2VmM2YyLTQ1YWItNGFlOC04ZmMwLTEzZmEyYzY0ZmI3MyJ9.4SB6KFXs4wOU2w1tJDgyklNm5yuocsVElK2wUpXfMW8",
  "access_expires_at": "2026-10-28T19:16:00.596017447Z",
  "refresh_token": "QkBRMm6zUdv-rQrE3--Y5EJB8TDGQzCtdHKb5JV6lGw",
  "refresh_expires_at": "2026-11-27T19:01:00.595396341Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "edc691c2-773e-4e30-a697-295ae5cd9388",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c4204281-4bc9-4cd4-ad88-22c81173f833",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c4204281-4bc9-4cd4-ad88-22c81173f833",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "3682767c308d461ee038ba273e705232",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c4204281-4bc9-4cd4-ad88-22c81173f833",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732115138"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c4204281-4bc9-4cd4-ad88-22c81173f833",
  "expires_at": "2026-10-28T19:31:00.895288Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/c4204281-4bc9-4cd4-ad88-22c81173f833` → **200**

```json
{
  "id": "c4204281-4bc9-4cd4-ad88-22c81173f833",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T19:31:00.895288Z",
  "card": {
    "id": "ed177adf-2c64-490d-b24c-89e4ec2ae88d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1886",
    "card_type": "Visa",
    "created_at": "2026-10-28T19:01:01.21408Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "ed177adf-2c64-490d-b24c-89e4ec2ae88d",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****1886",
      "card_type": "Visa",
      "created_at": "2026-10-28T19:01:01.21408Z"
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
  "device_ref": "sandbox-12040"
}
```

```json
{
  "challenge_id": "443aacf1-f61d-4f15-a9c8-775b605b9bcf",
  "expires_at": "2026-10-28T19:06:01.826995026Z",
  "resend_available_at": "2026-10-28T19:01:02.826995026Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "004739",
  "sent_at": "2026-10-28T19:01:01.830553169Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "443aacf1-f61d-4f15-a9c8-775b605b9bcf",
  "code": "004739",
  "device_ref": "sandbox-12040"
}
```

```json
{
  "session_id": "4f44edf0-ec62-4729-9f6c-cfa8d29cd950",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDk2MiwiaWF0IjoxNzkzMjE0MDYyLCJqdGkiOiI0ZWE1YjNkMi04ZWYxLTQxMDMtOTU5Yi1hMjYzZGU0MzRkYzgiLCJzaWQiOiI0ZjQ0ZWRmMC1lYzYyLTQ3MjktOWY2Yy1jZmE4ZDI5Y2Q5NTAifQ.Ab0MFzqi_cwSTXl-lSE4zr6W-qkJXas2FMNw_l1ngYM",
  "access_expires_at": "2026-10-28T19:16:02.168125106Z",
  "refresh_token": "p72q59X6QblmtwNnJcc8B4ggsoUjzaW0a44qhD1hKZE",
  "refresh_expires_at": "2026-11-27T19:01:02.167492323Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a6d7f83e-91b8-4281-a56a-cf1cc07e18d0",
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
  "last_heartbeat_at": "2026-10-28T19:00:55.916674Z",
  "last_location_at": "2026-10-28T19:00:55.916674Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a6d7f83e-91b8-4281-a56a-cf1cc07e18d0/handover` → **200**

```json
{
  "command_id": "598ab6c6-e7bd-4ca5-8e51-4649a33cd7a6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a6d7f83e-91b8-4281-a56a-cf1cc07e18d0",
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
  "last_heartbeat_at": "2026-10-28T19:00:55.916674Z",
  "last_location_at": "2026-10-28T19:00:55.916674Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a6d7f83e-91b8-4281-a56a-cf1cc07e18d0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:01:03Z",
    "sequence": 1793214063541
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a6d7f83e-91b8-4281-a56a-cf1cc07e18d0",
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
  "last_heartbeat_at": "2026-10-28T19:01:03.077627Z",
  "last_location_at": "2026-10-28T19:01:03.077627Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "db91725d-7fc1-4bbd-ad0c-20557d14389c",
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
  "id": "baaeb9f1-3ded-49cd-a199-8a062d48fd5f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:06:03.385706Z",
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
  "command_id": "c3ece35b-7ecc-406e-8266-88e1450ccf86",
  "quote_id": "baaeb9f1-3ded-49cd-a199-8a062d48fd5f",
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
  "id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c35ede0e-844a-4b52-a368-59370424d257",
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
  "created_at": "2026-10-28T19:01:03.716643Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab1de8db-e27b-43ec-83c6-ebb421f7f517` → **200**

```json
{
  "id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c35ede0e-844a-4b52-a368-59370424d257",
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
  "created_at": "2026-10-28T19:01:03.716643Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab1de8db-e27b-43ec-83c6-ebb421f7f517` → **200**

```json
{
  "id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c35ede0e-844a-4b52-a368-59370424d257",
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
  "created_at": "2026-10-28T19:01:03.716643Z",
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
    "id": "bc31da96-3cc2-4a8d-8359-deb8f62cf7c7",
    "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
    "expires_at": "2026-10-28T19:01:19.609395Z",
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

`POST /api/driver/v1/offers/bc31da96-3cc2-4a8d-8359-deb8f62cf7c7/accept` → **200**

```json
{
  "command_id": "b1da515b-b25c-4f4a-896b-5d82fd3e0068"
}
```

```json
{
  "id": "c8953a2e-b259-43c3-82cc-efb656cc5646",
  "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "888ee62d-9c56-4e0a-b199-9547c3da1e6e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "888ee62d-9c56-4e0a-b199-9547c3da1e6e",
  "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
  "assignment_id": "c8953a2e-b259-43c3-82cc-efb656cc5646",
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

`POST /api/driver/v1/work-sessions/a6d7f83e-91b8-4281-a56a-cf1cc07e18d0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:01:06Z",
    "sequence": 1793214066544
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a6d7f83e-91b8-4281-a56a-cf1cc07e18d0",
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
  "last_heartbeat_at": "2026-10-28T19:01:06.568062Z",
  "last_location_at": "2026-10-28T19:01:06.568062Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/888ee62d-9c56-4e0a-b199-9547c3da1e6e/arrive` → **200**

```json
{
  "command_id": "936f4824-f827-495c-a78e-e3ac691f95e9",
  "expected_version": 0
}
```

```json
{
  "id": "888ee62d-9c56-4e0a-b199-9547c3da1e6e",
  "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
  "assignment_id": "c8953a2e-b259-43c3-82cc-efb656cc5646",
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
  "arrived_at": "2026-10-28T19:01:06.882648Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/888ee62d-9c56-4e0a-b199-9547c3da1e6e/start` → **200**

```json
{
  "command_id": "aab5ba78-caf2-4353-a562-509a77bc97c3",
  "expected_version": 1
}
```

```json
{
  "id": "888ee62d-9c56-4e0a-b199-9547c3da1e6e",
  "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
  "assignment_id": "c8953a2e-b259-43c3-82cc-efb656cc5646",
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
  "arrived_at": "2026-10-28T19:01:06.882648Z",
  "started_at": "2026-10-28T19:01:07.204031Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/888ee62d-9c56-4e0a-b199-9547c3da1e6e/complete` → **200**

```json
{
  "command_id": "f8f1b50e-e69a-4e49-8f37-c5f8a2163f6f",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:01:07Z",
  "cash_received": true
}
```

```json
{
  "id": "888ee62d-9c56-4e0a-b199-9547c3da1e6e",
  "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
  "assignment_id": "c8953a2e-b259-43c3-82cc-efb656cc5646",
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
  "arrived_at": "2026-10-28T19:01:06.882648Z",
  "started_at": "2026-10-28T19:01:07.204031Z",
  "completed_at": "2026-10-28T19:01:07.526763Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/ab1de8db-e27b-43ec-83c6-ebb421f7f517` → **200**

```json
{
  "id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c35ede0e-844a-4b52-a368-59370424d257",
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
    "id": "c8953a2e-b259-43c3-82cc-efb656cc5646",
    "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "888ee62d-9c56-4e0a-b199-9547c3da1e6e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:01:03.716643Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab1de8db-e27b-43ec-83c6-ebb421f7f517` → **200**

```json
{
  "id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c35ede0e-844a-4b52-a368-59370424d257",
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
    "id": "c8953a2e-b259-43c3-82cc-efb656cc5646",
    "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "888ee62d-9c56-4e0a-b199-9547c3da1e6e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:01:03.716643Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab1de8db-e27b-43ec-83c6-ebb421f7f517` → **200**

```json
{
  "id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c35ede0e-844a-4b52-a368-59370424d257",
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
    "id": "c8953a2e-b259-43c3-82cc-efb656cc5646",
    "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "888ee62d-9c56-4e0a-b199-9547c3da1e6e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:01:03.716643Z",
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

`GET /api/rider/v1/orders/ab1de8db-e27b-43ec-83c6-ebb421f7f517/tip` → **200**

```json
{
  "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
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
  "available_until": "2026-10-29T19:01:07.526763Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ab1de8db-e27b-43ec-83c6-ebb421f7f517/tip` → **201**

```json
{
  "command_id": "100af0cd-f8ef-468c-95dd-934072722f7e",
  "amount_minor": 2500
}
```

```json
{
  "id": "a22b49da-5cd2-41e6-a0dc-7cd4d174d5f3",
  "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T19:01:11.406512Z"
}
```

`GET /api/rider/v1/orders/ab1de8db-e27b-43ec-83c6-ebb421f7f517/tip` → **200**

```json
{
  "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
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
  "available_until": "2026-10-29T19:01:07.526763Z",
  "open": false,
  "tip": {
    "id": "a22b49da-5cd2-41e6-a0dc-7cd4d174d5f3",
    "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T19:01:11.406512Z"
  }
}
```

`GET /api/rider/v1/orders/ab1de8db-e27b-43ec-83c6-ebb421f7f517/tip` → **200**

```json
{
  "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
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
  "available_until": "2026-10-29T19:01:07.526763Z",
  "open": false,
  "tip": {
    "id": "a22b49da-5cd2-41e6-a0dc-7cd4d174d5f3",
    "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T19:01:11.406512Z"
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
      "id": "d72850eb-1920-4732-b7c7-3dd5602a42d4",
      "at": "2026-10-28T19:01:12.742321Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
      "counterpart_id": null
    },
    {
      "id": "60f1a5fd-f597-40b2-9952-80dcea9285a9",
      "at": "2026-10-28T19:01:07.678304Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1c5f518b-bd7b-44d0-ac13-573110f2d266",
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
  "id": "4398c133-a557-4a15-8d35-2557634860e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:06:13.613428Z",
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
  "session_id": "1bbd833d-258b-4071-87fa-793d1eedb107",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQ5NzQsImlhdCI6MTc5MzIxNDA3NCwianRpIjoiNjcxODUxNzItMWUxOC00ZTYxLTk2ZjAtZTc0MGUxYmI1MjAzIiwic2lkIjoiMWJiZDgzM2QtMjU4Yi00MDcxLTg3ZmEtNzkzZDFlZWRiMTA3In0.KnPNofifGZnPrMMXpWXx3PtecoiIX-xO5yIzT5Tjtdc",
  "access_expires_at": "2026-10-28T19:16:14.26089226Z",
  "refresh_token": "FbMnZ2kHw0QWtA3HCEjz6bBW3y_EOxbk4uImmxBRSgo",
  "refresh_expires_at": "2026-10-29T07:01:14.260121653Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380732115138` → **200**

```json
{
  "client_id": "c35ede0e-844a-4b52-a368-59370424d257"
}
```

`POST /api/admin/v1/rider-wallets/c35ede0e-844a-4b52-a368-59370424d257/top-ups` → **201**

```json
{
  "command_id": "c6840f83-3597-4721-81d0-cc8f6732240a",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "c35ede0e-844a-4b52-a368-59370424d257",
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
      "id": "f7964ecc-c0ec-40d9-a2e6-d347c949a422",
      "at": "2026-10-28T19:01:14.849795Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3e431778-b0c5-4ee0-be29-957295421743",
  "quote_id": "4398c133-a557-4a15-8d35-2557634860e5",
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
  "id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c35ede0e-844a-4b52-a368-59370424d257",
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
  "created_at": "2026-10-28T19:01:15.167743Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b53b0681-078a-4ae7-af39-bb552b809fb7` → **200**

```json
{
  "id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c35ede0e-844a-4b52-a368-59370424d257",
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
  "created_at": "2026-10-28T19:01:15.167743Z",
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
    "id": "7eaaff97-885e-4c74-8feb-07009bce1b87",
    "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
    "expires_at": "2026-10-28T19:01:30.172778Z",
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

`POST /api/driver/v1/offers/7eaaff97-885e-4c74-8feb-07009bce1b87/accept` → **200**

```json
{
  "command_id": "67da6c82-4cda-4ace-ba9f-0ffe446cc28d"
}
```

```json
{
  "id": "3c4e5104-4c91-41a5-b3fc-c6af8a789024",
  "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a85c330d-cb3c-447d-85f8-095db1fe3e85",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a85c330d-cb3c-447d-85f8-095db1fe3e85",
  "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
  "assignment_id": "3c4e5104-4c91-41a5-b3fc-c6af8a789024",
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

`POST /api/driver/v1/work-sessions/a6d7f83e-91b8-4281-a56a-cf1cc07e18d0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:01:16Z",
    "sequence": 1793214076679
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a6d7f83e-91b8-4281-a56a-cf1cc07e18d0",
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
  "last_heartbeat_at": "2026-10-28T19:01:16.7037Z",
  "last_location_at": "2026-10-28T19:01:16.7037Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a85c330d-cb3c-447d-85f8-095db1fe3e85/arrive` → **200**

```json
{
  "command_id": "e40f14b5-4eec-43c6-842d-5c005dc4d316",
  "expected_version": 0
}
```

```json
{
  "id": "a85c330d-cb3c-447d-85f8-095db1fe3e85",
  "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
  "assignment_id": "3c4e5104-4c91-41a5-b3fc-c6af8a789024",
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
  "arrived_at": "2026-10-28T19:01:17.014766Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a85c330d-cb3c-447d-85f8-095db1fe3e85/start` → **200**

```json
{
  "command_id": "bea1aea8-2822-4957-b1d0-57e4c3539457",
  "expected_version": 1
}
```

```json
{
  "id": "a85c330d-cb3c-447d-85f8-095db1fe3e85",
  "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
  "assignment_id": "3c4e5104-4c91-41a5-b3fc-c6af8a789024",
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
  "arrived_at": "2026-10-28T19:01:17.014766Z",
  "started_at": "2026-10-28T19:01:17.334583Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a85c330d-cb3c-447d-85f8-095db1fe3e85/complete` → **200**

```json
{
  "command_id": "595d09aa-7c18-4364-ab05-ecb238432530",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:01:17Z",
  "cash_received": true
}
```

```json
{
  "id": "a85c330d-cb3c-447d-85f8-095db1fe3e85",
  "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
  "assignment_id": "3c4e5104-4c91-41a5-b3fc-c6af8a789024",
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
  "arrived_at": "2026-10-28T19:01:17.014766Z",
  "started_at": "2026-10-28T19:01:17.334583Z",
  "completed_at": "2026-10-28T19:01:17.652308Z",
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
  "client_id": "c35ede0e-844a-4b52-a368-59370424d257",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 300,
      "reserved_minor": 0,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "d124496f-4a5b-4959-97c5-ae862af66117",
      "at": "2026-10-28T19:01:17.793892Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7"
    },
    {
      "id": "f7964ecc-c0ec-40d9-a2e6-d347c949a422",
      "at": "2026-10-28T19:01:14.849795Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "716e1551-e1ad-4619-8d26-a6521c301975",
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
      "balance_minor": 30204,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/rider/v1/orders/b53b0681-078a-4ae7-af39-bb552b809fb7/tip` → **200**

```json
{
  "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
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
  "available_until": "2026-10-29T19:01:17.652308Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b53b0681-078a-4ae7-af39-bb552b809fb7/tip` → **201**

```json
{
  "command_id": "3cc19648-4860-421e-8b32-124d3d88a00d",
  "amount_minor": 2500
}
```

```json
{
  "id": "d743aeb8-f9bd-4690-bff8-eee13ea8fe4f",
  "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T19:01:18.874924Z"
}
```

`GET /api/rider/v1/orders/b53b0681-078a-4ae7-af39-bb552b809fb7/tip` → **200**

```json
{
  "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
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
  "available_until": "2026-10-29T19:01:17.652308Z",
  "open": false,
  "tip": {
    "id": "d743aeb8-f9bd-4690-bff8-eee13ea8fe4f",
    "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T19:01:18.874924Z"
  }
}
```

`GET /api/rider/v1/orders/b53b0681-078a-4ae7-af39-bb552b809fb7/tip` → **200**

```json
{
  "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
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
  "available_until": "2026-10-29T19:01:17.652308Z",
  "open": false,
  "tip": {
    "id": "d743aeb8-f9bd-4690-bff8-eee13ea8fe4f",
    "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T19:01:18.874924Z"
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
      "balance_minor": 30204
    }
  ],
  "entries": [
    {
      "id": "f323c945-7eff-456b-a1fc-eab4ea00d20c",
      "at": "2026-10-28T19:01:17.78921Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
      "counterpart_id": null
    },
    {
      "id": "d72850eb-1920-4732-b7c7-3dd5602a42d4",
      "at": "2026-10-28T19:01:12.742321Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
      "counterpart_id": null
    },
    {
      "id": "60f1a5fd-f597-40b2-9952-80dcea9285a9",
      "at": "2026-10-28T19:01:07.678304Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
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
      "id": "cd43358a-b661-42b1-934f-c6f369eff938",
      "at": "2026-10-28T19:01:20.815355Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
      "counterpart_id": null
    },
    {
      "id": "f323c945-7eff-456b-a1fc-eab4ea00d20c",
      "at": "2026-10-28T19:01:17.78921Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b53b0681-078a-4ae7-af39-bb552b809fb7",
      "counterpart_id": null
    },
    {
      "id": "d72850eb-1920-4732-b7c7-3dd5602a42d4",
      "at": "2026-10-28T19:01:12.742321Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
      "counterpart_id": null
    },
    {
      "id": "60f1a5fd-f597-40b2-9952-80dcea9285a9",
      "at": "2026-10-28T19:01:07.678304Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ab1de8db-e27b-43ec-83c6-ebb421f7f517",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a6d7f83e-91b8-4281-a56a-cf1cc07e18d0",
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
  "last_heartbeat_at": "2026-10-28T19:01:16.7037Z",
  "last_location_at": "2026-10-28T19:01:16.7037Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a6d7f83e-91b8-4281-a56a-cf1cc07e18d0/close` → **200**

```json
{
  "command_id": "aa18a352-dbf3-43f9-b8fe-5e99e3f8a128",
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

Done: card order b53b0681-078a-4ae7-af39-bb552b809fb7.

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
  "phone": "+380735968824",
  "device_ref": "sandbox-30295"
}
```

```json
{
  "challenge_id": "ee1e98e3-79cf-4dc8-9194-2c9144ac49e0",
  "expires_at": "2026-10-28T19:06:23.256102263Z",
  "resend_available_at": "2026-10-28T19:01:24.256102263Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735968824` → **200**

```json
{
  "phone": "+380735968824",
  "audience": "CLIENT",
  "code": "601592",
  "sent_at": "2026-10-28T19:01:23.259765098Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee1e98e3-79cf-4dc8-9194-2c9144ac49e0",
  "code": "601592",
  "device_ref": "sandbox-30295"
}
```

```json
{
  "session_id": "c405a682-45f7-4f19-9607-d53daa3b4482",
  "subject": {
    "type": "CLIENT",
    "id": "83c43c21-a649-468f-aa1b-098e0b798a78"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4M2M0M2MyMS1hNjQ5LTQ2OGYtYWExYi0wOThlMGI3OThhNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0OTgzLCJpYXQiOjE3OTMyMTQwODMsImp0aSI6ImE0YWU3MGRhLTJjYmYtNDMxMC1hY2JmLTgyNjk4YzQ5ODk5ZCIsInNpZCI6ImM0MDVhNjgyLTQ1ZjctNGYxOS05NjA3LWQ1M2RhYTNiNDQ4MiJ9.tiDcf8ELbFcoPwf0hVtr5J-p7Fo-R9VviQ7_C7d0UKs",
  "access_expires_at": "2026-10-28T19:16:23.582213937Z",
  "refresh_token": "T40bFw_dCWpA2XeT6tMFlVBu5gPKaSuWPWybb_wkQcc",
  "refresh_expires_at": "2026-11-27T19:01:23.581640492Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "30fcef52-4b1c-4c4d-b19b-07efae39ce6d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "a4a93085-a230-4dda-833d-5eccb9be2f60",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-a4a93085-a230-4dda-833d-5eccb9be2f60",
    "orderDate": "1793214083",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "2cc42ac4e25829c52d3f3193b6c34d94",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=a4a93085-a230-4dda-833d-5eccb9be2f60",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735968824"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=a4a93085-a230-4dda-833d-5eccb9be2f60",
  "created_at": "2026-10-28T19:01:23.89234Z",
  "expires_at": "2026-10-28T19:31:23.89234Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/a4a93085-a230-4dda-833d-5eccb9be2f60` → **200**

```json
{
  "id": "a4a93085-a230-4dda-833d-5eccb9be2f60",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T19:01:23.89234Z",
  "expires_at": "2026-10-28T19:31:23.89234Z",
  "completed_at": "2026-10-28T19:01:24.20275Z",
  "masked_pan": "41****2445",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "83c43c21-a649-468f-aa1b-098e0b798a78",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "83c43c21-a649-468f-aa1b-098e0b798a78",
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
      "id": "a803e6ce-8f1c-4c19-8dc3-c91cb019221b",
      "at": "2026-10-28T19:01:24.8326Z",
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
  "client_id": "83c43c21-a649-468f-aa1b-098e0b798a78",
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
      "id": "a803e6ce-8f1c-4c19-8dc3-c91cb019221b",
      "at": "2026-10-28T19:01:24.8326Z",
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
  "device_ref": "sandbox-24145"
}
```

```json
{
  "challenge_id": "7ea33ee3-2dc5-4214-afdc-43a975315885",
  "expires_at": "2026-10-28T19:06:26.421855984Z",
  "resend_available_at": "2026-10-28T19:01:27.421855984Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "660655",
  "sent_at": "2026-10-28T19:01:26.424520122Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ea33ee3-2dc5-4214-afdc-43a975315885",
  "code": "660655",
  "device_ref": "sandbox-24145"
}
```

```json
{
  "session_id": "b2d03d8b-6dc8-441c-a164-5a7237193d6c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDk4NiwiaWF0IjoxNzkzMjE0MDg2LCJqdGkiOiJiMmQyZWI0NC1kOTM1LTQzOTAtODcxYS03Y2RhMTBkNGY2N2EiLCJzaWQiOiJiMmQwM2Q4Yi02ZGM4LTQ0MWMtYTE2NC01YTcyMzcxOTNkNmMifQ.G-pybknENfAm_8glJW8E6OOmcDkr69Ee3RwTckII7aU",
  "access_expires_at": "2026-10-28T19:16:26.744472886Z",
  "refresh_token": "86fr-x9hUACdCdpgibiYwBNuHhn2zcSR0upozHvPwuA",
  "refresh_expires_at": "2026-11-27T19:01:26.743851009Z",
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
  "command_id": "56083981-9b1a-415e-8cb7-b6f2e99864e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "e63a15c6-a32e-4f3e-ba8d-d399c8182c56",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e63a15c6-a32e-4f3e-ba8d-d399c8182c56",
    "orderDate": "1793214087",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "21ca3dc6c87b69c50c45b40ea89bef9f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e63a15c6-a32e-4f3e-ba8d-d399c8182c56",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e63a15c6-a32e-4f3e-ba8d-d399c8182c56",
  "created_at": "2026-10-28T19:01:27.330524Z",
  "expires_at": "2026-10-28T19:31:27.330524Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/e63a15c6-a32e-4f3e-ba8d-d399c8182c56` → **200**

```json
{
  "id": "e63a15c6-a32e-4f3e-ba8d-d399c8182c56",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T19:01:27.330524Z",
  "expires_at": "2026-10-28T19:31:27.330524Z",
  "completed_at": "2026-10-28T19:01:27.626078Z",
  "masked_pan": "41****8548",
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
      "id": "473df5d0-3239-4549-885f-24d5ae2c84eb",
      "at": "2026-10-28T19:01:27.842225Z",
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
  "command_id": "850346f9-1646-4ade-8067-246c8d7114e7",
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
  "correlation_id": "81f37651-2d96-485f-b979-1815d0d5ac28"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: cash-dispute

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30492"
}
```

```json
{
  "challenge_id": "cb9c7413-dd41-4fcc-9e24-453e6e09cd47",
  "expires_at": "2026-10-28T19:06:28.552365847Z",
  "resend_available_at": "2026-10-28T19:01:29.552365847Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "863482",
  "sent_at": "2026-10-28T19:01:28.555220782Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb9c7413-dd41-4fcc-9e24-453e6e09cd47",
  "code": "863482",
  "device_ref": "sandbox-30492"
}
```

```json
{
  "session_id": "d6bf54cb-4c1c-4ac8-b6bf-fbfed1c2ea81",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDk4OCwiaWF0IjoxNzkzMjE0MDg4LCJqdGkiOiJkODdhMWQ5NS0xOGM0LTRmY2EtYmRjYy1hMTM1NTFhZTU2NzYiLCJzaWQiOiJkNmJmNTRjYi00YzFjLTRhYzgtYjZiZi1mYmZlZDFjMmVhODEifQ.h0ojenLxLz-59qOLb6LS0OIX3LKR3Ye8PQw5AEykfkg",
  "access_expires_at": "2026-10-28T19:16:28.891813009Z",
  "refresh_token": "XLiNYnV--MDXX1mq_Cu7-c2EYT7wUGL6OPzqkIdaHkw",
  "refresh_expires_at": "2026-11-27T19:01:28.891147127Z",
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
  "command_id": "f4f71d8d-54c3-45e4-a401-cbec7b9849ed",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:01:29Z",
    "sequence": 1793214089475
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "288b0cf3-0b23-405c-9b38-5a03e0d5796c",
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
  "last_heartbeat_at": "2026-10-28T19:01:29.497106Z",
  "last_location_at": "2026-10-28T19:01:29.497106Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639571145",
  "device_ref": "sandbox-12011"
}
```

```json
{
  "challenge_id": "ad47b33f-f008-4d58-9d0e-0301b1064aa7",
  "expires_at": "2026-10-28T19:06:29.791276762Z",
  "resend_available_at": "2026-10-28T19:01:30.791276762Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639571145` → **200**

```json
{
  "phone": "+380639571145",
  "audience": "CLIENT",
  "code": "616767",
  "sent_at": "2026-10-28T19:01:29.793848814Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad47b33f-f008-4d58-9d0e-0301b1064aa7",
  "code": "616767",
  "device_ref": "sandbox-12011"
}
```

```json
{
  "session_id": "0b9ecdd8-4ec9-4009-a6ed-471dbca4e00a",
  "subject": {
    "type": "CLIENT",
    "id": "4869efce-23f1-4a25-b8e5-f5086caa6f31"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODY5ZWZjZS0yM2YxLTRhMjUtYjhlNS1mNTA4NmNhYTZmMzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0OTkwLCJpYXQiOjE3OTMyMTQwOTAsImp0aSI6Ijk5OTdlZmVhLTRmZWUtNDAwYy1hODVlLWZlODQ4YmRlMTlkYiIsInNpZCI6IjBiOWVjZGQ4LTRlYzktNDAwOS1hNmVkLTQ3MWRiY2E0ZTAwYSJ9.UQbg-yyt6AgHN5YdfHnpRrsn3AVSRcJ_080tdMvbH84",
  "access_expires_at": "2026-10-28T19:16:30.117404253Z",
  "refresh_token": "zvbM7LLanEDqizjFoXcbf7NTt07MHRSRrmIbkSlP-pc",
  "refresh_expires_at": "2026-11-27T19:01:30.116835174Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c2abf203-c4d1-4835-82bb-97416fe6619b",
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
  "id": "8d692842-ef9e-4c8e-8d44-e161830bed75",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:06:30.419689Z",
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
  "command_id": "74fb6931-8307-46e4-ad09-6894d5b0d358",
  "quote_id": "8d692842-ef9e-4c8e-8d44-e161830bed75",
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
  "id": "8e65634a-227c-4de6-88c5-ec838e7d6657",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4869efce-23f1-4a25-b8e5-f5086caa6f31",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:01:30.739061Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Ivan drives; at the end the rider has no money and leaves

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "9439c8b4-350a-4a4c-8a7b-0562dae66d59",
    "order_id": "8e65634a-227c-4de6-88c5-ec838e7d6657",
    "expires_at": "2026-10-28T19:01:45.742924Z",
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

`POST /api/driver/v1/offers/9439c8b4-350a-4a4c-8a7b-0562dae66d59/accept` → **200**

```json
{
  "command_id": "e8109668-f96e-4c5d-9715-d83085d7224e"
}
```

```json
{
  "id": "30fc7e7a-1b2b-413d-9837-a00404a1dd55",
  "order_id": "8e65634a-227c-4de6-88c5-ec838e7d6657",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e9820387-f184-49ee-89ed-152e678a7c1f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e9820387-f184-49ee-89ed-152e678a7c1f",
  "order_id": "8e65634a-227c-4de6-88c5-ec838e7d6657",
  "assignment_id": "30fc7e7a-1b2b-413d-9837-a00404a1dd55",
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
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/288b0cf3-0b23-405c-9b38-5a03e0d5796c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:01:31Z",
    "sequence": 1793214091950
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "288b0cf3-0b23-405c-9b38-5a03e0d5796c",
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
  "last_heartbeat_at": "2026-10-28T19:01:31.972946Z",
  "last_location_at": "2026-10-28T19:01:31.972946Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e9820387-f184-49ee-89ed-152e678a7c1f/arrive` → **200**

```json
{
  "command_id": "7127c508-332c-4ae4-a20a-b80dc94a21a5",
  "expected_version": 0
}
```

```json
{
  "id": "e9820387-f184-49ee-89ed-152e678a7c1f",
  "order_id": "8e65634a-227c-4de6-88c5-ec838e7d6657",
  "assignment_id": "30fc7e7a-1b2b-413d-9837-a00404a1dd55",
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
  "arrived_at": "2026-10-28T19:01:32.283154Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9820387-f184-49ee-89ed-152e678a7c1f/start` → **200**

```json
{
  "command_id": "35e1a6cc-4a19-4cc4-abe9-8d2d604f5337",
  "expected_version": 1
}
```

```json
{
  "id": "e9820387-f184-49ee-89ed-152e678a7c1f",
  "order_id": "8e65634a-227c-4de6-88c5-ec838e7d6657",
  "assignment_id": "30fc7e7a-1b2b-413d-9837-a00404a1dd55",
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
  "arrived_at": "2026-10-28T19:01:32.283154Z",
  "started_at": "2026-10-28T19:01:32.605357Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9820387-f184-49ee-89ed-152e678a7c1f/complete` → **200**

```json
{
  "command_id": "22e8041d-ea64-419e-a0b7-9ee78ef98f8e",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:01:32Z",
  "cash_received": false
}
```

```json
{
  "id": "e9820387-f184-49ee-89ed-152e678a7c1f",
  "order_id": "8e65634a-227c-4de6-88c5-ec838e7d6657",
  "assignment_id": "30fc7e7a-1b2b-413d-9837-a00404a1dd55",
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
  "arrived_at": "2026-10-28T19:01:32.283154Z",
  "started_at": "2026-10-28T19:01:32.605357Z",
  "completed_at": "2026-10-28T19:01:32.919088Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Finance sees the dispute, with its deadline

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
  "session_id": "45cd2598-b6da-4096-bfa0-458a8fdfb349",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQ5OTMsImlhdCI6MTc5MzIxNDA5MywianRpIjoiZDc3YWEwZjMtZjk3Zi00YjdiLTgzZTEtYTRlNzE4ZWI2ZGJkIiwic2lkIjoiNDVjZDI1OTgtYjZkYS00MDk2LWJmYTAtNDU4YThmZGZiMzQ5In0.0eXjSvdNoAHBAdnV6BAYzu_nF7bKabJtVetlHKtGz4A",
  "access_expires_at": "2026-10-28T19:16:33.564956837Z",
  "refresh_token": "ApgabNyZCt9S0-BqgQfY5IzcG10YOK3b2ZJj3d_KJX4",
  "refresh_expires_at": "2026-10-29T07:01:33.564291897Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/8e65634a-227c-4de6-88c5-ec838e7d6657/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/8e65634a-227c-4de6-88c5-ec838e7d6657/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "acfb3906-1b44-48cd-8444-cdd2135135ae"
}
```

`GET /api/admin/v1/orders/8e65634a-227c-4de6-88c5-ec838e7d6657/cash-dispute` → **200**

```json
{
  "order_id": "8e65634a-227c-4de6-88c5-ec838e7d6657",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "4869efce-23f1-4a25-b8e5-f5086caa6f31",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-28T19:01:33.89714Z",
  "decide_by": "2026-11-11T19:01:33.89714Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-11T19:01:33.89714Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "8e65634a-227c-4de6-88c5-ec838e7d6657",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "4869efce-23f1-4a25-b8e5-f5086caa6f31",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-28T19:01:33.89714Z",
      "decide_by": "2026-11-11T19:01:33.89714Z",
      "decision": null,
      "decided_by": null,
      "reason": null,
      "decided_at": null,
      "version": 1
    }
  ]
}
```

## Finance decides: the rider did not pay, the service pays the driver

`POST /api/admin/v1/orders/8e65634a-227c-4de6-88c5-ec838e7d6657/cash-dispute/decide` → **400**

```json
{
  "command_id": "c494dcbd-af58-4ce7-8db9-8a195b7f41ce",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/8e65634a-227c-4de6-88c5-ec838e7d6657/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "08a4b110-2bba-47df-9142-710f8fd7b3a6",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/8e65634a-227c-4de6-88c5-ec838e7d6657/cash-dispute/decide` → **200**

```json
{
  "command_id": "1be434a2-766d-4e17-a05b-5940d1051bf4",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "8e65634a-227c-4de6-88c5-ec838e7d6657",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "4869efce-23f1-4a25-b8e5-f5086caa6f31",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-28T19:01:33.89714Z",
  "decide_by": "2026-11-11T19:01:33.89714Z",
  "decision": "PAY_DRIVER",
  "decided_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-28T19:01:36.129998Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/8e65634a-227c-4de6-88c5-ec838e7d6657/cash-dispute/decide` → **409**

```json
{
  "command_id": "be5bcb7f-92c1-4858-91e4-90bcbe663136",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/8e65634a-227c-4de6-88c5-ec838e7d6657/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "94790786-efc7-407f-9107-5fed8b91b910"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "288b0cf3-0b23-405c-9b38-5a03e0d5796c",
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
  "last_heartbeat_at": "2026-10-28T19:01:31.972946Z",
  "last_location_at": "2026-10-28T19:01:31.972946Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/288b0cf3-0b23-405c-9b38-5a03e0d5796c/close` → **200**

```json
{
  "command_id": "1001fb50-c636-4a1f-963c-c5e59f5a5ee5",
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
  "session_id": "2ebd63ac-6206-4265-b495-0b78c8b4558b",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQ5OTcsImlhdCI6MTc5MzIxNDA5NywianRpIjoiMmViYmU3NWItZTM5OS00NDE5LThmZTktZThkMmU0ZTNmYzkxIiwic2lkIjoiMmViZDYzYWMtNjIwNi00MjY1LWI0OTUtMGI3OGM4YjQ1NThiIn0.1NYXr5OCFHhjwzHg017ot5YOoJRSPH7Jaeo3KFG0Tds",
  "access_expires_at": "2026-10-28T19:16:37.693438942Z",
  "refresh_token": "WHt1IXcBtMA54B-CIIK1a2UO00CbSjpU8K4vgUMAy8w",
  "refresh_expires_at": "2026-10-29T07:01:37.692895761Z",
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
  "phone": "+48600898818",
  "device_ref": "sandbox-5664"
}
```

```json
{
  "challenge_id": "5b413db9-0fb7-4d3c-b763-114d15a3036a",
  "expires_at": "2026-10-28T19:06:38.570397723Z",
  "resend_available_at": "2026-10-28T19:01:39.570397723Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600898818` → **200**

```json
{
  "phone": "+48600898818",
  "audience": "CLIENT",
  "code": "897454",
  "sent_at": "2026-10-28T19:01:38.572860745Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b413db9-0fb7-4d3c-b763-114d15a3036a",
  "code": "897454",
  "device_ref": "sandbox-5664"
}
```

```json
{
  "session_id": "43828aa8-6572-43bc-b565-cab9f0ac07a1",
  "subject": {
    "type": "CLIENT",
    "id": "25616d8f-3817-4a98-9de6-47729ef57bf0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTYxNmQ4Zi0zODE3LTRhOTgtOWRlNi00NzcyOWVmNTdiZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0OTk4LCJpYXQiOjE3OTMyMTQwOTgsImp0aSI6IjdkNzI4ZmEzLThkNzQtNDNmYS1hYTJhLTE3OWVmZGFiNTcyMSIsInNpZCI6IjQzODI4YWE4LTY1NzItNDNiYy1iNTY1LWNhYjlmMGFjMDdhMSJ9.Zy4Wb8qEQO_YpgxqnWHeSlK9XAK5PCLcp9wTuYKABeY",
  "access_expires_at": "2026-10-28T19:16:38.890615891Z",
  "refresh_token": "lEi55CP4Kmx_kEwftq37BAIUOR8wqZsbd3qlg42Q9bQ",
  "refresh_expires_at": "2026-11-27T19:01:38.889861428Z",
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
  "command_id": "d6d7bc20-00b5-4eed-b31d-b5db6514a694",
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
  "correlation_id": "97b64de9-264e-4678-872d-fa951674eb3a",
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
  "command_id": "57de41ce-970c-4a9a-82b9-e95cbc6ef414",
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
  "paused_at": "2026-10-28T19:01:40.08502033Z",
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
  "command_id": "2b1dcc8c-8062-46e7-b293-96577c08eb23",
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
  "id": "bef83c12-141c-435f-9c78-09ca6e2f91c8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:06:40.702985Z",
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
  "command_id": "35c853d2-5760-4bd3-825a-49f6f775dee4",
  "quote_id": "bef83c12-141c-435f-9c78-09ca6e2f91c8",
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
  "correlation_id": "a8cfa4e1-2d80-42c6-a4e9-e45cc01dc8f4"
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
  "paused_at": "2026-10-28T19:01:40.08502Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "317df54a-e0ad-48ff-a149-0083687fbbb0",
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
  "command_id": "8b06adee-2f71-4751-97ad-4e50e51f1c13",
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
  "command_id": "06954afc-5b8e-409c-b676-fb712f871d99",
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
  "id": "01254b79-582b-4958-9124-ffc015a1ecb1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:06:42.513937Z",
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
  "command_id": "cca134d8-5a1c-4a25-b620-0cc09e7f1163",
  "quote_id": "01254b79-582b-4958-9124-ffc015a1ecb1",
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
  "correlation_id": "7ce0d2de-3df4-44e1-a406-175ac7e32b23"
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
  "command_id": "56240cb4-5918-4164-aac6-2841c68e8902",
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
      "from": "22:00",
      "to": "23:00"
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
      "from": "22:00",
      "to": "23:00"
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
  "command_id": "11ebba94-724a-4cf3-8a49-8c2cfc6262fb",
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
  "id": "34540828-ce12-46a3-a1b2-b9d1c82678d3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:06:43.725337Z",
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
  "command_id": "498e89ef-5741-46a5-8e10-1b1b2dadae2d",
  "quote_id": "34540828-ce12-46a3-a1b2-b9d1c82678d3",
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
  "correlation_id": "dd957731-09c4-4042-ab81-146f24355503"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "5a9e1564-de97-4bc4-8730-e46ecd603a01",
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
  "correlation_id": "4dee0472-f586-415c-9c94-2501dc9858ea"
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
      "from": "22:00",
      "to": "23:00"
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
  "command_id": "38331e86-7e92-43a7-a31e-98cb404763eb",
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
  "phone": "+380672786511",
  "device_ref": "sandbox-20058"
}
```

```json
{
  "challenge_id": "fdafc45e-0b6c-43a4-8062-d9100b141d20",
  "expires_at": "2026-10-28T19:06:45.240095035Z",
  "resend_available_at": "2026-10-28T19:01:46.240095035Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672786511` → **200**

```json
{
  "phone": "+380672786511",
  "audience": "CLIENT",
  "code": "684367",
  "sent_at": "2026-10-28T19:01:45.242340977Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fdafc45e-0b6c-43a4-8062-d9100b141d20",
  "code": "684367",
  "device_ref": "sandbox-20058"
}
```

```json
{
  "session_id": "d7264913-1e09-4ada-bc9a-58e9c8410c47",
  "subject": {
    "type": "CLIENT",
    "id": "fac467cc-64f9-499f-b63e-8b3a16db45fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYWM0NjdjYy02NGY5LTQ5OWYtYjYzZS04YjNhMTZkYjQ1ZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MDA1LCJpYXQiOjE3OTMyMTQxMDUsImp0aSI6ImFlZGY4MmRmLTMwZGItNDY4OS1iYTFmLTNjZDk1YWRiMWYxZCIsInNpZCI6ImQ3MjY0OTEzLTFlMDktNGFkYS1iYzlhLTU4ZTljODQxMGM0NyJ9.xChMsxUMl3WWUdg9dJeOkJ5lMZAX6s9cF5_GtJU8esA",
  "access_expires_at": "2026-10-28T19:16:45.579364413Z",
  "refresh_token": "9J3CYvGKn-nvCYLZB5-Vt44WUlywlbLd3962vp5Lexk",
  "refresh_expires_at": "2026-11-27T19:01:45.578801513Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fac467cc-64f9-499f-b63e-8b3a16db45fe",
  "session_id": "d7264913-1e09-4ada-bc9a-58e9c8410c47",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a1ed0c0f-027f-4166-b7f6-d621a84bac0c",
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
  "id": "5a3f073a-030a-4220-8574-e6feb80b8317",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:06:46.185050Z",
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
  "challenge_id": "2ef0b2a9-b3e1-470f-9b34-9fe2d76cf0f9",
  "expires_at": "2026-10-28T19:06:48.490693414Z",
  "resend_available_at": "2026-10-28T19:01:49.490693414Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672786511` → **200**

```json
{
  "phone": "+380672786511",
  "audience": "CLIENT",
  "code": "488545",
  "sent_at": "2026-10-28T19:01:48.492722224Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "8aec3dcd-c162-44e0-87ce-928af78ab1ae",
  "challenge_id": "2ef0b2a9-b3e1-470f-9b34-9fe2d76cf0f9",
  "otp_code": "488545"
}
```

```json
{
  "client_id": "fac467cc-64f9-499f-b63e-8b3a16db45fe",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T19:01:48.826815556Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "70325370-d937-4e22-8551-3943e1924165",
  "quote_id": "5a3f073a-030a-4220-8574-e6feb80b8317",
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
  "correlation_id": "b7095aa9-b65c-4a96-bd7f-58f4d05eacd7"
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
  "session_id": "efd102fd-98b8-4fc6-8c7d-87c4f764faad",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwMDksImlhdCI6MTc5MzIxNDEwOSwianRpIjoiZDM4OWYxYWMtYzg3Zi00M2Q1LWI2MTYtNzc2ZTNjZGE1MjZhIiwic2lkIjoiZWZkMTAyZmQtOThiOC00ZmM2LThjN2QtODdjNGY3NjRmYWFkIn0.8w3ZCC8PXnHr3fn2gDC75RUnBEXt-D2uP7t8_cibWfo",
  "access_expires_at": "2026-10-28T19:16:49.762047294Z",
  "refresh_token": "1DTdU58u3w4L-_PK4gPuB5j2eH1UBkTR4eWnq3d3h2c",
  "refresh_expires_at": "2026-10-29T07:01:49.761462693Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "fac467cc-64f9-499f-b63e-8b3a16db45fe",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T19:01:48.826816Z",
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

`POST /api/admin/v1/client-deletions/fac467cc-64f9-499f-b63e-8b3a16db45fe/complete` → **200**

```json
{
  "command_id": "a0e3a090-a853-4673-81f2-3a86c55e929a",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "fac467cc-64f9-499f-b63e-8b3a16db45fe",
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
  "correlation_id": "f5f67014-d776-4649-ad6b-675538cc6ecc"
}
```

Done: client fac467cc-64f9-499f-b63e-8b3a16db45fe anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660559869",
  "device_ref": "sandbox-25401"
}
```

```json
{
  "challenge_id": "e9c88067-8493-40d2-884b-c1b8b290c4b7",
  "expires_at": "2026-10-28T19:06:50.976740111Z",
  "resend_available_at": "2026-10-28T19:01:51.976740111Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660559869` → **200**

```json
{
  "phone": "+380660559869",
  "audience": "CLIENT",
  "code": "183550",
  "sent_at": "2026-10-28T19:01:50.979898665Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9c88067-8493-40d2-884b-c1b8b290c4b7",
  "code": "183550",
  "device_ref": "sandbox-25401"
}
```

```json
{
  "session_id": "c973d1b9-55c9-4842-8021-02300e4a8f2d",
  "subject": {
    "type": "CLIENT",
    "id": "a67a5533-fa34-4478-8c35-757f9fdb77e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjdhNTUzMy1mYTM0LTQ0NzgtOGMzNS03NTdmOWZkYjc3ZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MDExLCJpYXQiOjE3OTMyMTQxMTEsImp0aSI6ImY0Y2NhMGMxLWExNzMtNGVjMi1iMGUyLWFlNmM5NWNlNzYxMiIsInNpZCI6ImM5NzNkMWI5LTU1YzktNDg0Mi04MDIxLTAyMzAwZTRhOGYyZCJ9.0gICaZkM3Ynil2oYk7ZnX3nbsT0HVZow3BIn_3cY1PQ",
  "access_expires_at": "2026-10-28T19:16:51.305044063Z",
  "refresh_token": "u3PE5Fc5N8H-jFFJA5jBoDZ41f_70821Ge3ahDCWmbo",
  "refresh_expires_at": "2026-11-27T19:01:51.304488344Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a67a5533-fa34-4478-8c35-757f9fdb77e9",
  "session_id": "c973d1b9-55c9-4842-8021-02300e4a8f2d",
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
  "session_id": "ec834983-3fc7-48fb-8f4e-b2bf9a1d1054",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwMTIsImlhdCI6MTc5MzIxNDExMiwianRpIjoiZDY0M2UwYTktYjI0Yi00Njc1LTk3M2YtOTVkYTg2MDc5NWQzIiwic2lkIjoiZWM4MzQ5ODMtM2ZjNy00OGZiLThmNGUtYjJiZjlhMWQxMDU0In0.HToIlwzfpRp4x66rpq2nzkLclpSJ3MEDUxLet79KlL8",
  "access_expires_at": "2026-10-28T19:16:52.222211058Z",
  "refresh_token": "eaVVGAM_E-uNk3_N1V6muatebArFsqqrko1DIyjXZ9c",
  "refresh_expires_at": "2026-10-29T07:01:52.221475408Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0559869&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a67a5533-fa34-4478-8c35-757f9fdb77e9",
      "phone": "+380660559869",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T19:01:51.302346Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a67a5533-fa34-4478-8c35-757f9fdb77e9` → **200**

```json
{
  "client": {
    "id": "a67a5533-fa34-4478-8c35-757f9fdb77e9",
    "phone": "+380660559869",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T19:01:51.302346Z",
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

`POST /api/admin/v1/clients/a67a5533-fa34-4478-8c35-757f9fdb77e9/block` → **400**

```json
{
  "command_id": "e4716eb4-9149-490a-b2e3-a920be035a2e",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a67a5533-fa34-4478-8c35-757f9fdb77e9/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f9b21332-27b0-4973-901a-c3a5baeb389e",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a67a5533-fa34-4478-8c35-757f9fdb77e9/block` → **200**

```json
{
  "command_id": "e7bbc492-62d9-4c52-82d5-8529833b6de0",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a67a5533-fa34-4478-8c35-757f9fdb77e9",
  "phone": "+380660559869",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T19:01:51.302346Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T19:01:53.472023Z",
    "by": "716e1551-e1ad-4619-8d26-a6521c301975"
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
  "correlation_id": "8c17c12b-f80d-45ac-bf28-5c426935a861"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660559869",
  "device_ref": "sandbox-25145"
}
```

```json
{
  "challenge_id": "c064986a-361c-4f61-8f93-ee4ba52e3ed1",
  "expires_at": "2026-10-28T19:06:56.064150614Z",
  "resend_available_at": "2026-10-28T19:01:57.064150614Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660559869` → **200**

```json
{
  "phone": "+380660559869",
  "audience": "CLIENT",
  "code": "552683",
  "sent_at": "2026-10-28T19:01:56.066947467Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "c064986a-361c-4f61-8f93-ee4ba52e3ed1",
  "code": "552683",
  "device_ref": "sandbox-25145"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "20fefc2e-e610-41e5-8269-6bd2e508286f"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a67a5533-fa34-4478-8c35-757f9fdb77e9` → **200**

```json
{
  "client": {
    "id": "a67a5533-fa34-4478-8c35-757f9fdb77e9",
    "phone": "+380660559869",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T19:01:51.302346Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T19:01:53.472023Z",
      "by": "716e1551-e1ad-4619-8d26-a6521c301975"
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

`POST /api/admin/v1/clients/a67a5533-fa34-4478-8c35-757f9fdb77e9/unblock` → **200**

```json
{
  "command_id": "250a9ca0-4cbb-4d2e-b610-131dd9d4e4e7",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a67a5533-fa34-4478-8c35-757f9fdb77e9",
  "phone": "+380660559869",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T19:01:51.302346Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660559869",
  "device_ref": "sandbox-18921"
}
```

```json
{
  "challenge_id": "f12b1ad7-f29f-42c5-94a9-52d9108ede89",
  "expires_at": "2026-10-28T19:06:59.3204954Z",
  "resend_available_at": "2026-10-28T19:02:00.3204954Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660559869` → **200**

```json
{
  "phone": "+380660559869",
  "audience": "CLIENT",
  "code": "764819",
  "sent_at": "2026-10-28T19:01:59.322626953Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f12b1ad7-f29f-42c5-94a9-52d9108ede89",
  "code": "764819",
  "device_ref": "sandbox-18921"
}
```

```json
{
  "session_id": "41790a94-82ee-442d-8bdc-99fc6aac92e4",
  "subject": {
    "type": "CLIENT",
    "id": "a67a5533-fa34-4478-8c35-757f9fdb77e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjdhNTUzMy1mYTM0LTQ0NzgtOGMzNS03NTdmOWZkYjc3ZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MDE5LCJpYXQiOjE3OTMyMTQxMTksImp0aSI6IjFhZDM2MDU1LTAzMzItNGRhMy1hNDI3LTMyYzcyMDEzNWIxMyIsInNpZCI6IjQxNzkwYTk0LTgyZWUtNDQyZC04YmRjLTk5ZmM2YWFjOTJlNCJ9.XoaLzW8Rc9opLanoD2r0VRIm-xpFwa5npuTIXKJ7iFU",
  "access_expires_at": "2026-10-28T19:16:59.633678044Z",
  "refresh_token": "DNVzUym7baNUzcwCQZjv7ZKaR-N_XwvDTETqnjLrS2w",
  "refresh_expires_at": "2026-11-27T19:01:59.63304432Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a67a5533-fa34-4478-8c35-757f9fdb77e9",
  "session_id": "41790a94-82ee-442d-8bdc-99fc6aac92e4",
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
  "phone": "+380666479682",
  "device_ref": "sandbox-31700"
}
```

```json
{
  "challenge_id": "12f2eb5d-21b4-493d-b853-8ac4f7449bab",
  "expires_at": "2026-10-28T19:07:00.228720945Z",
  "resend_available_at": "2026-10-28T19:02:01.228720945Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666479682` → **200**

```json
{
  "phone": "+380666479682",
  "audience": "CLIENT",
  "code": "684518",
  "sent_at": "2026-10-28T19:02:00.231150847Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12f2eb5d-21b4-493d-b853-8ac4f7449bab",
  "code": "684518",
  "device_ref": "sandbox-31700"
}
```

```json
{
  "session_id": "cce60601-bf25-4bf5-80b2-a07060e05c5b",
  "subject": {
    "type": "CLIENT",
    "id": "b32873b8-d7c1-46f1-aac6-ec0ee1e697c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzI4NzNiOC1kN2MxLTQ2ZjEtYWFjNi1lYzBlZTFlNjk3YzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MDIwLCJpYXQiOjE3OTMyMTQxMjAsImp0aSI6ImU5NDQ0MzRmLTQ3NGUtNDFmYS04OWJjLThiOGNlZWNlNDZhYSIsInNpZCI6ImNjZTYwNjAxLWJmMjUtNGJmNS04MGIyLWEwNzA2MGUwNWM1YiJ9.TjJa8Q_4oKJfLUH6S7D2N6Z59oJ_L8mG_NSrfVdZVgs",
  "access_expires_at": "2026-10-28T19:17:00.547803207Z",
  "refresh_token": "KcQdiMTR1kcz5xsyBFA0-KJKJ_yQsEFbZrtjTq9Uz78",
  "refresh_expires_at": "2026-11-27T19:02:00.547211234Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0aff1769-2922-4558-8202-956093c8ece6",
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
  "id": "81dcfa73-9970-41db-8593-51459e809da5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:07:00.850859Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 46b2ef43-6e8c-4d46-b478-725a969689d3) → **201**

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
  "session_id": "439b372a-f3ad-4236-a4a4-0ab4d1cebc60",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwMjEsImlhdCI6MTc5MzIxNDEyMSwianRpIjoiMjFmY2YxZTgtMTg1Yy00ZDQzLWJmZjctYzExNDU5N2VhYjA4Iiwic2lkIjoiNDM5YjM3MmEtZjNhZC00MjM2LWE0YTQtMGFiNGQxY2ViYzYwIn0.PpZNRxt5qFvm9z_MYLgzJe9tHpskBJgsRV3hl8eRIFA",
  "access_expires_at": "2026-10-28T19:17:01.54674367Z",
  "refresh_token": "U_8YW7NYhGfo7OFjEcYYOz5wOlMGwI6nReqhuIdqfOY",
  "refresh_expires_at": "2026-10-29T07:02:01.546018Z",
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
  "session_id": "7ef45177-cd4b-4b50-a32e-c2a677d5a367",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwMjIsImlhdCI6MTc5MzIxNDEyMiwianRpIjoiOWQ5ZTU2M2QtNDI0OC00ZjljLWIwMzEtOGFmNTcxOGVjZmZmIiwic2lkIjoiN2VmNDUxNzctY2Q0Yi00YjUwLWEzMmUtYzJhNjc3ZDVhMzY3In0.Gd2XNsLewQt5zcGQJSa7HybRXnW1ugxohirJuBwjwhI",
  "access_expires_at": "2026-10-28T19:17:02.161969177Z",
  "refresh_token": "tmt3T4kZlxCIG2NKvziDyC7hKJkcK2KO66pSQ0MYM-c",
  "refresh_expires_at": "2026-10-29T07:02:02.16124893Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/963f2057-a6bc-4044-b247-61af1801e5f4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:02:01.171429Z",
      "actor": {
        "type": "CLIENT",
        "id": "b32873b8-d7c1-46f1-aac6-ec0ee1e697c4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "963f2057-a6bc-4044-b247-61af1801e5f4",
        "quote_id": "81dcfa73-9970-41db-8593-51459e809da5",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "46b2ef43-6e8c-4d46-b478-725a969689d3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:02:01.173421Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "963f2057-a6bc-4044-b247-61af1801e5f4",
        "attempt_id": "e6e18cd8-4ec4-44d1-86f6-6dca5678f1f6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "46b2ef43-6e8c-4d46-b478-725a969689d3"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T19:02:01.183229Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "963f2057-a6bc-4044-b247-61af1801e5f4",
        "attempt_id": "e6e18cd8-4ec4-44d1-86f6-6dca5678f1f6"
      },
      "correlation_id": "46b2ef43-6e8c-4d46-b478-725a969689d3"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "e6e18cd8-4ec4-44d1-86f6-6dca5678f1f6",
        "generation": 1,
        "started_at": "2026-10-28T19:02:01.17248Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T19:02:01.183229Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T19:02:01.174263Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/46b2ef43-6e8c-4d46-b478-725a969689d3` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "963f2057-a6bc-4044-b247-61af1801e5f4:0",
      "order_id": "963f2057-a6bc-4044-b247-61af1801e5f4",
      "at": "2026-10-28T19:02:01.171429Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "963f2057-a6bc-4044-b247-61af1801e5f4:1",
      "order_id": "963f2057-a6bc-4044-b247-61af1801e5f4",
      "at": "2026-10-28T19:02:01.173421Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "963f2057-a6bc-4044-b247-61af1801e5f4:2",
      "order_id": "963f2057-a6bc-4044-b247-61af1801e5f4",
      "at": "2026-10-28T19:02:01.183229Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/38fb2a14-5335-4cd8-abfb-46c52b18d65a` → **200**

```json
{
  "found": []
}
```

Done: request 46b2ef43-6e8c-4d46-b478-725a969689d3 — order 963f2057-a6bc-4044-b247-61af1801e5f4 found by its id.

`GET /api/rider/v1/orders/963f2057-a6bc-4044-b247-61af1801e5f4` → **200**

```json
{
  "id": "963f2057-a6bc-4044-b247-61af1801e5f4",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b32873b8-d7c1-46f1-aac6-ec0ee1e697c4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:02:01.170874Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/963f2057-a6bc-4044-b247-61af1801e5f4/cancel` → **200**

```json
{
  "command_id": "1d03268b-2ede-4f20-9fa8-1c8577e5b02f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "963f2057-a6bc-4044-b247-61af1801e5f4",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b32873b8-d7c1-46f1-aac6-ec0ee1e697c4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:02:01.170874Z",
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
  "phone": "+380633394583",
  "device_ref": "sandbox-23384"
}
```

```json
{
  "challenge_id": "43b445ff-46fa-4da4-b1d0-9607081bf891",
  "expires_at": "2026-10-28T19:07:03.989378474Z",
  "resend_available_at": "2026-10-28T19:02:04.989378474Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633394583` → **200**

```json
{
  "phone": "+380633394583",
  "audience": "CLIENT",
  "code": "501915",
  "sent_at": "2026-10-28T19:02:03.992501293Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43b445ff-46fa-4da4-b1d0-9607081bf891",
  "code": "501915",
  "device_ref": "sandbox-23384"
}
```

```json
{
  "session_id": "73ffd269-6f5c-48bc-a5bb-fa2322e783f5",
  "subject": {
    "type": "CLIENT",
    "id": "65bf8094-41ad-40b8-b1b2-1b2fb4969982"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NWJmODA5NC00MWFkLTQwYjgtYjFiMi0xYjJmYjQ5Njk5ODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MDI0LCJpYXQiOjE3OTMyMTQxMjQsImp0aSI6ImRlY2NmNTU1LWUyYjYtNGJiNi1iMmE2LWUxMjM5NWVhYjY5NyIsInNpZCI6IjczZmZkMjY5LTZmNWMtNDhiYy1hNWJiLWZhMjMyMmU3ODNmNSJ9.gx97JITKn-vB4ygnkp1jb758iizfhiiK1SC5yfKXFGs",
  "access_expires_at": "2026-10-28T19:17:04.317204279Z",
  "refresh_token": "rxo7rMe5Ej165rg9bYRLUI1OsuRmMIy6arnTFhB7rUo",
  "refresh_expires_at": "2026-11-27T19:02:04.316611716Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "ae76c6f4-b7c2-4ab9-9848-70d9ee63aa0d",
  "expires_at": "2026-10-28T19:07:06.615584239Z",
  "resend_available_at": "2026-10-28T19:02:07.615584239Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633394583` → **200**

```json
{
  "phone": "+380633394583",
  "audience": "CLIENT",
  "code": "570648",
  "sent_at": "2026-10-28T19:02:06.617476799Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "75ea8f49-ac57-44be-992e-f48df4e59080",
  "challenge_id": "ae76c6f4-b7c2-4ab9-9848-70d9ee63aa0d",
  "otp_code": "570648"
}
```

```json
{
  "id": "f1b47aab-17f8-4409-83fc-14bd82621f34",
  "state": "PENDING",
  "created_at": "2026-10-28T19:02:06.941793Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/f1b47aab-17f8-4409-83fc-14bd82621f34` → **200**

```json
{
  "id": "f1b47aab-17f8-4409-83fc-14bd82621f34",
  "state": "READY",
  "created_at": "2026-10-28T19:02:06.941793Z",
  "ready_at": "2026-10-28T19:02:07.087995Z",
  "expires_at": "2026-11-04T19:02:07.087995Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/f1b47aab-17f8-4409-83fc-14bd82621f34/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637852432",
  "device_ref": "sandbox-6040"
}
```

```json
{
  "challenge_id": "e6dcb6da-b901-4f0a-b6d7-2ef80a6c1c5c",
  "expires_at": "2026-10-28T19:07:07.59105489Z",
  "resend_available_at": "2026-10-28T19:02:08.59105489Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637852432` → **200**

```json
{
  "phone": "+380637852432",
  "audience": "CLIENT",
  "code": "495299",
  "sent_at": "2026-10-28T19:02:07.593653381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6dcb6da-b901-4f0a-b6d7-2ef80a6c1c5c",
  "code": "495299",
  "device_ref": "sandbox-6040"
}
```

```json
{
  "session_id": "130e22e4-9b0d-4e18-9783-4c9b10fda14e",
  "subject": {
    "type": "CLIENT",
    "id": "12d973b4-ecc7-4a3d-aa0c-8ab97c17ae65"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMmQ5NzNiNC1lY2M3LTRhM2QtYWEwYy04YWI5N2MxN2FlNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MDI3LCJpYXQiOjE3OTMyMTQxMjcsImp0aSI6ImQ5ZTZhZDQwLWU5MzUtNDhkNC1iYmU1LWY0MGI2ZDJhOWYyNCIsInNpZCI6IjEzMGUyMmU0LTliMGQtNGUxOC05NzgzLTRjOWIxMGZkYTE0ZSJ9.fl4qSkwAp1dAWIh3XHonB6llc-u2JqVdd0ywNKc1Y_c",
  "access_expires_at": "2026-10-28T19:17:07.912767191Z",
  "refresh_token": "3t6LFFmAa4hEsL7rVEjrWedWXFcYZ1nnmSGpTLeQ_Dk",
  "refresh_expires_at": "2026-11-27T19:02:07.912200396Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/f1b47aab-17f8-4409-83fc-14bd82621f34/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/f1b47aab-17f8-4409-83fc-14bd82621f34/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9d8e1e09-2206-4b1e-abc4-5e273c06d343"
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
  "session_id": "0d8cd18b-ecc2-45bf-92f6-2834cf947694",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwMjgsImlhdCI6MTc5MzIxNDEyOCwianRpIjoiZmI5MGM5MjUtYjUxZS00YjkwLWJhYjctNTc5Mjc4YzViNWI3Iiwic2lkIjoiMGQ4Y2QxOGItZWNjMi00NWJmLTkyZjYtMjgzNGNmOTQ3Njk0In0.xUevIXdE1dn5DSDYo4bwqie1u7IDquFYFULsvHs-UHk",
  "access_expires_at": "2026-10-28T19:17:08.829026404Z",
  "refresh_token": "D7_EPX31GZnK3zHG9tilUWiG-RkDJ2LpX8efmnA5uUs",
  "refresh_expires_at": "2026-10-29T07:02:08.828455022Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "65bf8094-41ad-40b8-b1b2-1b2fb4969982",
  "session_id": "73ffd269-6f5c-48bc-a5bb-fa2322e783f5",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/65bf8094-41ad-40b8-b1b2-1b2fb4969982/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "f1b47aab-17f8-4409-83fc-14bd82621f34",
      "state": "READY",
      "created_at": "2026-10-28T19:02:06.941793Z",
      "ready_at": "2026-10-28T19:02:07.087995Z",
      "expires_at": "2026-11-04T19:02:07.087995Z",
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
  "device_ref": "sandbox-23276"
}
```

```json
{
  "challenge_id": "3c0a0bec-e11e-4e7b-b696-4066f4bc5139",
  "expires_at": "2026-10-28T19:07:09.710337192Z",
  "resend_available_at": "2026-10-28T19:02:10.710337192Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "127381",
  "sent_at": "2026-10-28T19:02:09.713009692Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c0a0bec-e11e-4e7b-b696-4066f4bc5139",
  "code": "127381",
  "device_ref": "sandbox-23276"
}
```

```json
{
  "session_id": "ee5d74de-9b7a-4c2c-a155-1b6e2320e64e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTAzMCwiaWF0IjoxNzkzMjE0MTMwLCJqdGkiOiI4MjkzOWRlOC1jNmMzLTQzNDYtYmRmYi1kMmU4YzQ1OWQ1NjYiLCJzaWQiOiJlZTVkNzRkZS05YjdhLTRjMmMtYTE1NS0xYjZlMjMyMGU2NGUifQ.yIGTahA-8lxjk_YEpox_6v08lEV-01a2F2CKFgUlKrk",
  "access_expires_at": "2026-10-28T19:17:10.030162363Z",
  "refresh_token": "0jWk7Hd8PbAolKMALjFRfV4CttJMn-wtaxMDkKNkks0",
  "refresh_expires_at": "2026-11-27T19:02:10.029626014Z",
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
  "device_ref": "sandbox-31083"
}
```

```json
{
  "challenge_id": "1f059871-d77a-4d02-b20d-f2c9985ba258",
  "expires_at": "2026-10-28T19:07:10.594032803Z",
  "resend_available_at": "2026-10-28T19:02:11.594032803Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "247049",
  "sent_at": "2026-10-28T19:02:10.596425186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f059871-d77a-4d02-b20d-f2c9985ba258",
  "code": "247049",
  "device_ref": "sandbox-31083"
}
```

```json
{
  "session_id": "600ce4fa-1c9d-4f74-8724-12ba04eeb81f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTAzMCwiaWF0IjoxNzkzMjE0MTMwLCJqdGkiOiJmZjg5OTliZC02Y2JlLTQ2NzktYjczOS1lZGUxYjg1YTM4MGIiLCJzaWQiOiI2MDBjZTRmYS0xYzlkLTRmNzQtODcyNC0xMmJhMDRlZWI4MWYifQ.DA8ye1r8-St6h5GXd4Zo_VZsY3s1DOGsvLMK5mI6ZOc",
  "access_expires_at": "2026-10-28T19:17:10.916886237Z",
  "refresh_token": "za5TqNd4Gy88kS-XYaVfNvMxljnm8mlX4CjbHLUBHPw",
  "refresh_expires_at": "2026-11-27T19:02:10.91631712Z",
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
  "command_id": "73911460-633b-45fa-afe0-c8bdbc8279fe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:02:11Z",
    "sequence": 1793214131510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "89376c16-31a2-4c4d-aac5-a62aa3bd970c",
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
  "last_heartbeat_at": "2026-10-28T19:02:11.531213Z",
  "last_location_at": "2026-10-28T19:02:11.531213Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-8779"
}
```

```json
{
  "challenge_id": "648fb672-f81a-4b3d-a521-25b1b28e0355",
  "expires_at": "2026-10-28T19:07:11.822855114Z",
  "resend_available_at": "2026-10-28T19:02:12.822855114Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "200296",
  "sent_at": "2026-10-28T19:02:11.825193337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "648fb672-f81a-4b3d-a521-25b1b28e0355",
  "code": "200296",
  "device_ref": "sandbox-8779"
}
```

```json
{
  "session_id": "d68149d5-079f-4fd6-a7b5-3ce39fd0866a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTAzMiwiaWF0IjoxNzkzMjE0MTMyLCJqdGkiOiIwNmJiZDgyNC1jYjcyLTRmYjgtOTcwNS1lZWEwOGRmMTg3NTAiLCJzaWQiOiJkNjgxNDlkNS0wNzlmLTRmZDYtYTdiNS0zY2UzOWZkMDg2NmEifQ.qfs8chgbFlx0l7eHnMf4U8y9tbW8Chnva1VV7TjZiCg",
  "access_expires_at": "2026-10-28T19:17:12.154797237Z",
  "refresh_token": "2eG6Vs6sSrV2rfAjCCkqyN1CLJIyJee8jxH1F4AEYHg",
  "refresh_expires_at": "2026-11-27T19:02:12.15416717Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "124e2543-bd22-4d1a-b8fd-8e9f9bda1c6d",
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
  "last_heartbeat_at": "2026-10-28T19:00:54.668508Z",
  "last_location_at": "2026-10-28T19:00:54.668508Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/124e2543-bd22-4d1a-b8fd-8e9f9bda1c6d/handover` → **200**

```json
{
  "command_id": "d6e36673-973c-429b-8a26-4bf2aea4fa5c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "124e2543-bd22-4d1a-b8fd-8e9f9bda1c6d",
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
  "last_heartbeat_at": "2026-10-28T19:00:54.668508Z",
  "last_location_at": "2026-10-28T19:00:54.668508Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/124e2543-bd22-4d1a-b8fd-8e9f9bda1c6d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:02:13Z",
    "sequence": 1793214133534
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "124e2543-bd22-4d1a-b8fd-8e9f9bda1c6d",
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
  "last_heartbeat_at": "2026-10-28T19:02:13.076299Z",
  "last_location_at": "2026-10-28T19:02:13.076299Z",
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
  "session_id": "e8d4a362-ed74-43dc-9e03-23bc11a8d76d",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwMzMsImlhdCI6MTc5MzIxNDEzMywianRpIjoiMDhkYzMxMDAtYzY2ZC00NDYxLWE5YjAtYzYxY2I4ZTk0MDk4Iiwic2lkIjoiZThkNGEzNjItZWQ3NC00M2RjLTllMDMtMjNiYzExYThkNzZkIn0.NUg3kZyt-vTKR1hVqnGIMo2a_2NXFWZ9nQYyoe-rHR8",
  "access_expires_at": "2026-10-28T19:17:13.696326686Z",
  "refresh_token": "TOcYv9eYTvYNSWbMC9HBcb1fi8Wzmt601KVAySAKVN0",
  "refresh_expires_at": "2026-10-29T07:02:13.695684129Z",
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
  "session_id": "d56c265a-adf7-4b13-bbb5-33142287732d",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwMzQsImlhdCI6MTc5MzIxNDEzNCwianRpIjoiMTMwMTU2MjMtOGUzNy00ZjRmLWIwNDgtMzdiY2VlMzE2Zjk3Iiwic2lkIjoiZDU2YzI2NWEtYWRmNy00YjEzLWJiYjUtMzMxNDIyODc3MzJkIn0.BNgeUncsM_i6DAP-mG3pQUtD1x99jKur_3e-fODsyOU",
  "access_expires_at": "2026-10-28T19:17:14.326628182Z",
  "refresh_token": "cU9OdcmEgSWicL15f9FYUUoyMeXrV-ST54nUrXomtLM",
  "refresh_expires_at": "2026-10-29T07:02:14.325924554Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688326084",
  "device_ref": "sandbox-4135"
}
```

```json
{
  "challenge_id": "08a6d591-0052-4a7c-ad60-4c532c06d1b5",
  "expires_at": "2026-10-28T19:07:14.619031245Z",
  "resend_available_at": "2026-10-28T19:02:15.619031245Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380688326084` → **200**

```json
{
  "phone": "+380688326084",
  "audience": "CLIENT",
  "code": "162073",
  "sent_at": "2026-10-28T19:02:14.622637152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "08a6d591-0052-4a7c-ad60-4c532c06d1b5",
  "code": "162073",
  "device_ref": "sandbox-4135"
}
```

```json
{
  "session_id": "37ca9bb8-e3b9-40d2-bc92-a88765b3e841",
  "subject": {
    "type": "CLIENT",
    "id": "af7d6f25-3e0e-41dd-9e7d-9855630d9436"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjdkNmYyNS0zZTBlLTQxZGQtOWU3ZC05ODU1NjMwZDk0MzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MDM0LCJpYXQiOjE3OTMyMTQxMzQsImp0aSI6IjVkOGZmOTJkLTJkYTYtNDZmMy1iMzA0LTczN2JiNjI3YjM1NiIsInNpZCI6IjM3Y2E5YmI4LWUzYjktNDBkMi1iYzkyLWE4ODc2NWIzZTg0MSJ9.134QSsapJ-4FcJgx-VGeG0On0ktzaWp0KYvEtUTA-j8",
  "access_expires_at": "2026-10-28T19:17:14.957089042Z",
  "refresh_token": "_GQo5kW0eVRo1VI1bTotcTEQjUt1IcbBhIbfVk6tgGQ",
  "refresh_expires_at": "2026-11-27T19:02:14.956536958Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "530bd684-4a57-4ccc-b588-899e0fea96fa",
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
  "id": "a68e1545-97cf-4d3b-bfaf-33aa5d994540",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:07:15.255687Z",
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
  "command_id": "843242a5-3c12-4e95-86cc-4fb48fdd8012",
  "quote_id": "a68e1545-97cf-4d3b-bfaf-33aa5d994540",
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
  "id": "3043c179-ed99-4751-be30-8a9a790295f4",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "af7d6f25-3e0e-41dd-9e7d-9855630d9436",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:02:15.571425Z",
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
    "id": "a6d8eab0-f496-4e26-b522-4b3c9f5b979c",
    "order_id": "3043c179-ed99-4751-be30-8a9a790295f4",
    "expires_at": "2026-10-28T19:02:30.575965Z",
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

`POST /api/driver/v1/offers/a6d8eab0-f496-4e26-b522-4b3c9f5b979c/reject` → **204**

```json
{
  "command_id": "185a6c85-e249-4578-a806-5e376ce33e21"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a7450b44-8991-48eb-893c-ee16554309ef",
    "order_id": "3043c179-ed99-4751-be30-8a9a790295f4",
    "expires_at": "2026-10-28T19:02:31.183234Z",
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

`POST /api/driver/v1/offers/a7450b44-8991-48eb-893c-ee16554309ef/accept` → **200**

```json
{
  "command_id": "13d581e2-c6dc-4262-8de4-1e0cae2eefce"
}
```

```json
{
  "id": "5097466f-586e-40b6-81c8-0881f22b879a",
  "order_id": "3043c179-ed99-4751-be30-8a9a790295f4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "77105f89-aa7c-4d7f-84a0-5295c83fc05b",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/3043c179-ed99-4751-be30-8a9a790295f4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:02:15.572179Z",
      "actor": {
        "type": "CLIENT",
        "id": "af7d6f25-3e0e-41dd-9e7d-9855630d9436",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3043c179-ed99-4751-be30-8a9a790295f4",
        "quote_id": "a68e1545-97cf-4d3b-bfaf-33aa5d994540",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "92316bd1-b7d4-4acc-9227-9148d92663fa"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:02:15.575031Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3043c179-ed99-4751-be30-8a9a790295f4",
        "attempt_id": "eb1627de-a99f-4861-830b-9ccc72305f38",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "92316bd1-b7d4-4acc-9227-9148d92663fa"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:02:15.582854Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a6d8eab0-f496-4e26-b522-4b3c9f5b979c",
        "order_id": "3043c179-ed99-4751-be30-8a9a790295f4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "92316bd1-b7d4-4acc-9227-9148d92663fa"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T19:02:16.181964Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a6d8eab0-f496-4e26-b522-4b3c9f5b979c",
        "order_id": "3043c179-ed99-4751-be30-8a9a790295f4"
      },
      "correlation_id": "99374cad-9dc8-4d2a-866f-a60d2893041a"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 3043c179-ed99-4751-be30-8a9a790295f4 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/3043c179-ed99-4751-be30-8a9a790295f4` → **200**

```json
{
  "id": "3043c179-ed99-4751-be30-8a9a790295f4",
  "short_number": 9,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "af7d6f25-3e0e-41dd-9e7d-9855630d9436",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5097466f-586e-40b6-81c8-0881f22b879a",
    "order_id": "3043c179-ed99-4751-be30-8a9a790295f4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "77105f89-aa7c-4d7f-84a0-5295c83fc05b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T19:02:15.571425Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3043c179-ed99-4751-be30-8a9a790295f4/cancel` → **200**

```json
{
  "command_id": "e6860070-daa7-479f-a923-cdae9c2d44f8",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3043c179-ed99-4751-be30-8a9a790295f4",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "af7d6f25-3e0e-41dd-9e7d-9855630d9436",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5097466f-586e-40b6-81c8-0881f22b879a",
    "order_id": "3043c179-ed99-4751-be30-8a9a790295f4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "77105f89-aa7c-4d7f-84a0-5295c83fc05b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T19:02:15.571425Z",
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
  "session_id": "89376c16-31a2-4c4d-aac5-a62aa3bd970c",
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
  "last_heartbeat_at": "2026-10-28T19:02:11.531213Z",
  "last_location_at": "2026-10-28T19:02:11.531213Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/89376c16-31a2-4c4d-aac5-a62aa3bd970c/close` → **200**

```json
{
  "command_id": "98745269-11dd-4e64-8566-a0514d786634",
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
  "session_id": "124e2543-bd22-4d1a-b8fd-8e9f9bda1c6d",
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
  "last_heartbeat_at": "2026-10-28T19:02:13.076299Z",
  "last_location_at": "2026-10-28T19:02:13.076299Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/124e2543-bd22-4d1a-b8fd-8e9f9bda1c6d/close` → **200**

```json
{
  "command_id": "8e992b03-f2ad-4b07-8c8e-d10ded3882d7",
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
  "session_id": "900cf64f-c0f4-4c8e-8486-cc967923f03b",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwMzksImlhdCI6MTc5MzIxNDEzOSwianRpIjoiMTkwMjM2Y2MtOTAwYy00OGE3LTg3NmItMTUxY2FjZGNmZDAwIiwic2lkIjoiOTAwY2Y2NGYtYzBmNC00YzhlLTg0ODYtY2M5Njc5MjNmMDNiIn0.LPjt7JXIFR9Z3aFAIm6ZiViOzgXbUj7CnCSBXTR4Q5M",
  "access_expires_at": "2026-10-28T19:17:19.354831946Z",
  "refresh_token": "aT2BzRXLFCu9U9PSsxLP37MX6r1bgK1g7sau4D4ip_c",
  "refresh_expires_at": "2026-10-29T07:02:19.354281534Z",
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
  "command_id": "c3cb88c3-1b6f-44bd-a06c-0be41c898331",
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
  "changed_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T19:02:19.965764Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "1a7480fc-63a8-4214-b699-0264bc55e7b7",
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
  "correlation_id": "80809502-ee76-44d5-9a25-d87c73422eeb"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "c3606e62-c15e-4a9e-b16d-b01caeaf2ff3",
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
  "correlation_id": "21717b3b-5389-49bc-b2b6-873ae99d317d"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639439395",
  "device_ref": "sandbox-22289"
}
```

```json
{
  "challenge_id": "8478be44-9417-496d-963e-7f0cfab142b4",
  "expires_at": "2026-10-28T19:07:20.872697112Z",
  "resend_available_at": "2026-10-28T19:02:21.872697112Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639439395` → **200**

```json
{
  "phone": "+380639439395",
  "audience": "CLIENT",
  "code": "156360",
  "sent_at": "2026-10-28T19:02:20.875466858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8478be44-9417-496d-963e-7f0cfab142b4",
  "code": "156360",
  "device_ref": "sandbox-22289"
}
```

```json
{
  "session_id": "f313d2dd-b1d3-4840-9b06-2f646a761924",
  "subject": {
    "type": "CLIENT",
    "id": "abd6380d-7cff-42b1-8970-9b1a4f04d16f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmQ2MzgwZC03Y2ZmLTQyYjEtODk3MC05YjFhNGYwNGQxNmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MDQxLCJpYXQiOjE3OTMyMTQxNDEsImp0aSI6IjU2M2ZjNmQ2LWU1MjYtNDFjYS1iYmJkLWVjNjhmMTgwOWY0YSIsInNpZCI6ImYzMTNkMmRkLWIxZDMtNDg0MC05YjA2LTJmNjQ2YTc2MTkyNCJ9.3BN1-EfzDl2-HJKJde8E2bzAmPkpPqL0h_bVCqJ70S8",
  "access_expires_at": "2026-10-28T19:17:21.193305344Z",
  "refresh_token": "toMayNc8anaZyssd6ZcWiQXGsqMIvNbMXprUgrcofPU",
  "refresh_expires_at": "2026-11-27T19:02:21.192708223Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b12c3bd9-caeb-40fa-917b-095e2a0a8569",
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
  "id": "2edc3895-3c86-47f7-8efa-8b81978da16c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:07:21.520667Z",
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
  "command_id": "c05fc637-579c-4ba7-9ad1-5de08edeef59",
  "quote_id": "2edc3895-3c86-47f7-8efa-8b81978da16c",
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
  "correlation_id": "7d7bcf73-bf36-4058-b153-3795419f3ff9"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "58d7a5c3-7885-4ab5-be59-e12675bb6ee1",
  "quote_id": "2edc3895-3c86-47f7-8efa-8b81978da16c",
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
  "id": "a1155c8a-dd86-4c41-a46b-69adc62ad1d0",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "abd6380d-7cff-42b1-8970-9b1a4f04d16f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:02:22.116765Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a1155c8a-dd86-4c41-a46b-69adc62ad1d0/cancel` → **200**

```json
{
  "command_id": "272e14af-19ee-47c5-8678-d81a424ba713",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a1155c8a-dd86-4c41-a46b-69adc62ad1d0",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "abd6380d-7cff-42b1-8970-9b1a4f04d16f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:02:22.116765Z",
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

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "f6bab7d5-0918-44ad-ade3-cd06fc422235",
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
  "changed_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T19:02:22.768676Z"
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
      "changed_by": "716e1551-e1ad-4619-8d26-a6521c301975",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T19:02:22.768676Z"
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
  "device_ref": "sandbox-11094"
}
```

```json
{
  "challenge_id": "d8cb2f65-1f17-4143-88fd-bc2d643b081b",
  "expires_at": "2026-10-28T19:07:23.683016453Z",
  "resend_available_at": "2026-10-28T19:02:24.683016453Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "447507",
  "sent_at": "2026-10-28T19:02:23.685224919Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8cb2f65-1f17-4143-88fd-bc2d643b081b",
  "code": "447507",
  "device_ref": "sandbox-11094"
}
```

```json
{
  "session_id": "be7595fd-b6cb-4342-8b5d-806170775866",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTA0NCwiaWF0IjoxNzkzMjE0MTQ0LCJqdGkiOiI3ZjYxOGZhZi0yYzA4LTQxOTQtYTgxOC01N2VkYjQ4ZTE3NWMiLCJzaWQiOiJiZTc1OTVmZC1iNmNiLTQzNDItOGI1ZC04MDYxNzA3NzU4NjYifQ.namtFJjY3Ue0rUmcW1u8OIKt0zejyKzZQAX11GjVPWM",
  "access_expires_at": "2026-10-28T19:17:24.006551913Z",
  "refresh_token": "a3xgn_OFRM10hex3L78M2lCWA9vbKIBICK6ltzByeWY",
  "refresh_expires_at": "2026-11-27T19:02:24.006023975Z",
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
  "command_id": "bd29253d-a1b2-486e-9d09-b9151a5e4d8f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:02:24Z",
    "sequence": 1793214144572
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae953adc-65e0-49fe-9307-4af433c8a8cb",
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
  "last_heartbeat_at": "2026-10-28T19:02:24.593393Z",
  "last_location_at": "2026-10-28T19:02:24.593393Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675012792",
  "device_ref": "sandbox-28490"
}
```

```json
{
  "challenge_id": "4d2c6ecb-8d73-4702-bbc5-d4a672e563f0",
  "expires_at": "2026-10-28T19:07:24.888027647Z",
  "resend_available_at": "2026-10-28T19:02:25.888027647Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675012792` → **200**

```json
{
  "phone": "+380675012792",
  "audience": "CLIENT",
  "code": "185356",
  "sent_at": "2026-10-28T19:02:24.890326351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d2c6ecb-8d73-4702-bbc5-d4a672e563f0",
  "code": "185356",
  "device_ref": "sandbox-28490"
}
```

```json
{
  "session_id": "940d7675-4449-4fda-a24c-4004d43b6988",
  "subject": {
    "type": "CLIENT",
    "id": "9898a119-bb12-422b-aa1c-148b38b0cabd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ODk4YTExOS1iYjEyLTQyMmItYWExYy0xNDhiMzhiMGNhYmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MDQ1LCJpYXQiOjE3OTMyMTQxNDUsImp0aSI6IjU1YmNhZGU1LTkyODItNGVhNS1hZTEwLWVkZjEwODg3NzY3NSIsInNpZCI6Ijk0MGQ3Njc1LTQ0NDktNGZkYS1hMjRjLTQwMDRkNDNiNjk4OCJ9.KGadTE2uy2HbYRhJP2dDQzl7DwrEG2bPCq8GuNsNcsg",
  "access_expires_at": "2026-10-28T19:17:25.211360485Z",
  "refresh_token": "liYlNppClOsN1NMxrL8IcDsAId0v2Q71gBq2HM_sTmk",
  "refresh_expires_at": "2026-11-27T19:02:25.210804955Z",
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
  "command_id": "c7f0de68-2ee1-40ee-bb48-ad5d6dbbd669",
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
  "id": "d89e0b36-1f47-4e73-aab9-2df0589480c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:07:25.791513Z",
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
  "command_id": "cdf2d119-c8e5-45d7-88f5-5809db0534a2",
  "platform": "ANDROID",
  "token": "sandbox-driver-0d55eefa-0a80-4c27-a0e5-faa83d0f9075"
}
```

```json
{
  "id": "3403eb62-ac0d-4bc2-bb23-27c04eb924d5",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T19:02:26.137481Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "43a72b26-9279-4e1d-a3e9-e975a3960607",
  "platform": "ANDROID",
  "token": "sandbox-rider-1a5e3970-041d-436f-b7aa-da1549908b72"
}
```

```json
{
  "id": "b2ab32e9-1485-4f1f-865d-2add8ea8e985",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T19:02:26.443549Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f8ee1713-de67-494e-bf88-35ca9393cd7f",
  "quote_id": "d89e0b36-1f47-4e73-aab9-2df0589480c0",
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
  "id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9898a119-bb12-422b-aa1c-148b38b0cabd",
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
  "created_at": "2026-10-28T19:02:26.756473Z",
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
    "id": "f5731a3a-b82f-4cf8-b685-0e6f69ae36e3",
    "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
    "expires_at": "2026-10-28T19:02:41.7599Z",
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

`POST /api/driver/v1/offers/f5731a3a-b82f-4cf8-b685-0e6f69ae36e3/accept` → **200**

```json
{
  "command_id": "f8bb1bca-e9c0-42f2-9b6e-eee605c7d673"
}
```

```json
{
  "id": "0d69042e-4b42-4a95-981e-219987b8d371",
  "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a8aa8cc1-0c95-4747-89b5-7e4709ec071d",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T19:02:26.729Z` → **200**

```json
[
  {
    "at": "2026-10-28T19:02:27.562937375Z",
    "token_suffix": "0f9075",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
      "order_version": "2",
      "event_id": "2502f54f-0ed0-4537-82ff-1a96072fa641",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675012792&after=2026-10-28T19:02:26.729Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380675012792&after=2026-10-28T19:02:26.729Z` → **200**

```json
[
  {
    "at": "2026-10-28T19:02:28.57078454Z",
    "token_suffix": "908b72",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
      "order_version": "3",
      "event_id": "b047a205-29a5-4a04-a8e4-9955cd14a7f8",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/8f8abc48-2ccc-439b-9afc-6b71c722c831/messages` → **201**

```json
{
  "command_id": "2c4303b7-a1ef-4db3-a884-c0c614888014",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "1e1f3956-63cd-4071-8b6c-bfa9d20cd3cc",
  "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T19:02:28.760153925Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a8aa8cc1-0c95-4747-89b5-7e4709ec071d",
  "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
  "assignment_id": "0d69042e-4b42-4a95-981e-219987b8d371",
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

`POST /api/driver/v1/trips/a8aa8cc1-0c95-4747-89b5-7e4709ec071d/messages` → **201**

```json
{
  "command_id": "db106682-2786-4442-a446-2e83c941aead",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "d7e9bf19-de69-49e8-886e-6e3e49d32ec3",
  "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T19:02:29.33861044Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/8f8abc48-2ccc-439b-9afc-6b71c722c831/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/a8aa8cc1-0c95-4747-89b5-7e4709ec071d/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675012792"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/ae953adc-65e0-49fe-9307-4af433c8a8cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:02:30Z",
    "sequence": 1793214150200
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae953adc-65e0-49fe-9307-4af433c8a8cb",
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
  "last_heartbeat_at": "2026-10-28T19:02:30.222281Z",
  "last_location_at": "2026-10-28T19:02:30.222281Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a8aa8cc1-0c95-4747-89b5-7e4709ec071d",
  "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
  "assignment_id": "0d69042e-4b42-4a95-981e-219987b8d371",
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

`POST /api/driver/v1/trips/a8aa8cc1-0c95-4747-89b5-7e4709ec071d/arrive` → **200**

```json
{
  "command_id": "c51f73bc-1db0-49d7-b92a-37006030fae7",
  "expected_version": 0
}
```

```json
{
  "id": "a8aa8cc1-0c95-4747-89b5-7e4709ec071d",
  "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
  "assignment_id": "0d69042e-4b42-4a95-981e-219987b8d371",
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
  "arrived_at": "2026-10-28T19:02:30.810951Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a8aa8cc1-0c95-4747-89b5-7e4709ec071d/start` → **200**

```json
{
  "command_id": "fde0f77f-d134-4d7b-9c94-a8e0c46986ee",
  "expected_version": 1
}
```

```json
{
  "id": "a8aa8cc1-0c95-4747-89b5-7e4709ec071d",
  "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
  "assignment_id": "0d69042e-4b42-4a95-981e-219987b8d371",
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
  "arrived_at": "2026-10-28T19:02:30.810951Z",
  "started_at": "2026-10-28T19:02:31.107648Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ae953adc-65e0-49fe-9307-4af433c8a8cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:02:31Z",
    "sequence": 1793214151404
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae953adc-65e0-49fe-9307-4af433c8a8cb",
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
  "last_heartbeat_at": "2026-10-28T19:02:31.427604Z",
  "last_location_at": "2026-10-28T19:02:31.427604Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/a8aa8cc1-0c95-4747-89b5-7e4709ec071d/complete` → **200**

```json
{
  "command_id": "752059e6-030d-46ae-a1ce-8b5461cfdefa",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:02:31Z",
  "cash_received": true
}
```

```json
{
  "id": "a8aa8cc1-0c95-4747-89b5-7e4709ec071d",
  "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
  "assignment_id": "0d69042e-4b42-4a95-981e-219987b8d371",
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
  "arrived_at": "2026-10-28T19:02:30.810951Z",
  "started_at": "2026-10-28T19:02:31.107648Z",
  "completed_at": "2026-10-28T19:02:31.74565Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/8f8abc48-2ccc-439b-9afc-6b71c722c831` → **200**

```json
{
  "id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9898a119-bb12-422b-aa1c-148b38b0cabd",
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
    "id": "0d69042e-4b42-4a95-981e-219987b8d371",
    "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a8aa8cc1-0c95-4747-89b5-7e4709ec071d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:02:26.756473Z",
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
    "id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
    "short_number": 11,
    "status": "FULFILLED",
    "created_at": "2026-10-28T19:02:26.756473Z",
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
    "id": "a8aa8cc1-0c95-4747-89b5-7e4709ec071d",
    "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
    "order_short_number": 11,
    "created_at": "2026-10-28T19:02:27.363498Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e9820387-f184-49ee-89ed-152e678a7c1f",
    "order_id": "8e65634a-227c-4de6-88c5-ec838e7d6657",
    "order_short_number": 7,
    "created_at": "2026-10-28T19:01:31.36001Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "40c91d7b-64d0-43cd-991b-e50ba950eb2f",
    "order_id": "faf0fdd4-acec-4d7d-bdc5-f0f6e0a83fdf",
    "order_short_number": 2,
    "created_at": "2026-10-28T19:00:42.893992Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "5a002f8e-6a54-4a56-9aef-c676fa613a5b",
    "order_id": "9805d2af-7a00-4bdc-8cf0-419992d19299",
    "order_short_number": 1,
    "created_at": "2026-10-28T19:00:22.841923Z",
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
      "balance_minor": 7257,
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
        "trips": 4,
        "fare_minor": 42068,
        "commission_minor": 6312,
        "driver_share_minor": 35756,
        "cash_minor": 28499,
        "cashless_minor": 13569,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": 7257
      }
    }
  ],
  "total": {
    "trips": 4,
    "fare_minor": 42068,
    "commission_minor": 6312,
    "driver_share_minor": 35756,
    "cash_minor": 28499,
    "cashless_minor": 13569,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": 7257
  },
  "balance_minor": 7257
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/8f8abc48-2ccc-439b-9afc-6b71c722c831/tip` → **200**

```json
{
  "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
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
  "available_until": "2026-10-29T19:02:31.74565Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/8f8abc48-2ccc-439b-9afc-6b71c722c831/tip` → **201**

```json
{
  "command_id": "f9eea888-209b-4b9a-8b28-354a6d288c2c",
  "amount_minor": 1100
}
```

```json
{
  "id": "6e77ec3c-84d5-4927-8a84-f89483842e2e",
  "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T19:02:36.886854Z"
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
  "session_id": "be98bf13-8b53-4575-91a1-ebcfd140823d",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwNTcsImlhdCI6MTc5MzIxNDE1NywianRpIjoiMDZhYjQwNGYtNjA5OS00NWVjLTgzZDctMmQ2NTcwNjM5MGQ0Iiwic2lkIjoiYmU5OGJmMTMtOGI1My00NTc1LTkxYTEtZWJjZmQxNDA4MjNkIn0.zJktI6jbJfqxTG2XDKFcTw2EC8pdUpLxhRXOIFimHdE",
  "access_expires_at": "2026-10-28T19:17:37.516144195Z",
  "refresh_token": "ItZQhltyk80rW1k0-EsZt-y6UJKGggTxHoT5nfW1MhY",
  "refresh_expires_at": "2026-10-29T07:02:37.515487347Z",
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
        "created": 11,
        "fulfilled": 6,
        "cancelled": 5,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 10,
          "PHONE": 1
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 10
        },
        "cancelled_by": {
          "STAFF": 1,
          "RIDER": 3,
          "DRIVER": 1
        }
      }
    }
  ],
  "total": {
    "created": 11,
    "fulfilled": 6,
    "cancelled": 5,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 10,
      "PHONE": 1
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 10
    },
    "cancelled_by": {
      "STAFF": 1,
      "RIDER": 3,
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
  "generated_at": "2026-10-28T19:02:37.814215571Z"
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
        "trips": 6,
        "fares_minor": 74662,
        "service_rides_minor": 0,
        "commission_minor": 11202,
        "driver_share_minor": 63460,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 28499,
        "tips_minor": 5000,
        "rider_debt_change_minor": 10517
      }
    }
  ],
  "total": {
    "trips": 6,
    "fares_minor": 74662,
    "service_rides_minor": 0,
    "commission_minor": 11202,
    "driver_share_minor": 63460,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 28499,
    "tips_minor": 5000,
    "rider_debt_change_minor": 10517
  },
  "generated_at": "2026-10-28T19:02:38.118753104Z"
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
  "session_id": "9fb0642e-9a59-4cba-bc0e-a7fa7b0f31a0",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwNTgsImlhdCI6MTc5MzIxNDE1OCwianRpIjoiZjA1MmQxMmMtOTU5ZS00MWNmLTk5NDktMTc1ZTRiZWM1OTBhIiwic2lkIjoiOWZiMDY0MmUtOWE1OS00Y2JhLWJjMGUtYTdmYTdiMGYzMWEwIn0.trLvMdfhyl_FV72p25GGCrEQatWkw1G_xwUPceHu_no",
  "access_expires_at": "2026-10-28T19:17:38.763308707Z",
  "refresh_token": "Usxn3dQDJ_rDjCg3VIcyX8jgI_DC9Aw4qjpSEIb2KiA",
  "refresh_expires_at": "2026-10-29T07:02:38.762655775Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8f8abc48-2ccc-439b-9afc-6b71c722c831/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:02:26.757002Z",
      "actor": {
        "type": "CLIENT",
        "id": "9898a119-bb12-422b-aa1c-148b38b0cabd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
        "quote_id": "d89e0b36-1f47-4e73-aab9-2df0589480c0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1367f845-2333-47f4-a026-abed1a106107"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:02:26.759068Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
        "attempt_id": "0c87fe06-27f8-49df-bf01-c2f63ebaccde",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1367f845-2333-47f4-a026-abed1a106107"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:02:26.762128Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f5731a3a-b82f-4cf8-b685-0e6f69ae36e3",
        "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "1367f845-2333-47f4-a026-abed1a106107"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T19:02:27.365028Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f5731a3a-b82f-4cf8-b685-0e6f69ae36e3",
        "order_id": "8f8abc48-2ccc-439b-9afc-6b71c722c831",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "0d69042e-4b42-4a95-981e-219987b8d371"
      },
      "correlation_id": "44002c77-d154-4e06-b649-d8f87b1ca7b2"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T19:02:39.359546183Z",
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
      "last_location_at": "2026-10-28T19:02:31.427604Z",
      "order_id": null
    }
  ]
}
```

Done: order 8f8abc48-2ccc-439b-9afc-6b71c722c831.

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
  "session_id": "2ba0c8b8-94d7-46ee-9b1c-caaef1fd5503",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwNjAsImlhdCI6MTc5MzIxNDE2MCwianRpIjoiZTUxNjVlYzYtYzA1OS00MDRiLWIzNTktNzY5MWRjNDZlMDVhIiwic2lkIjoiMmJhMGM4YjgtOTRkNy00NmVlLTliMWMtY2FhZWYxZmQ1NTAzIn0.JJez1k_s1ZMi-aAHf8wkMFtq1donM1V4OSGOS-l8f68",
  "access_expires_at": "2026-10-28T19:17:40.034162629Z",
  "refresh_token": "6r2VTnHUUdTGKFK_f29wQBWWs7YtDbMv7scGqO3_4xA",
  "refresh_expires_at": "2026-10-29T07:02:40.033583365Z",
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
  "command_id": "ed8d9ce3-b24f-4e61-b1ae-2798ad28effe",
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
  "timestamp": "2026-10-28T19:02:40.000+0000",
  "channel": {
    "id": "1730052000.702165",
    "linkedid": "1730052000.702165",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673337160"
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
  "timestamp": "2026-10-28T19:02:40.000+0000",
  "channel": {
    "id": "1730052000.702165",
    "linkedid": "1730052000.702165",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673337160"
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
  "session_id": "65205019-5aab-4557-8287-8e84d0d037c4",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwNjEsImlhdCI6MTc5MzIxNDE2MSwianRpIjoiOGM4YTViMjUtODcwZi00MzlmLWE0YjUtMDJkMTE1MWQ3MjAwIiwic2lkIjoiNjUyMDUwMTktNWFhYi00NTU3LTgyODctOGU4NGQwZDAzN2M0In0.hG879Yj3nEdUs8wmX7d5bIU_J7IKz6J0gvjL49IYyj0",
  "access_expires_at": "2026-10-28T19:17:41.312425573Z",
  "refresh_token": "na_lo1arjq9Ipti1CWTcqL2wq9iJ2Dl6dLdnl8PRYWc",
  "refresh_expires_at": "2026-10-29T07:02:41.311790707Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "5ea0c4ec-c02a-43ff-8c2c-3b8e3d563aec",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673337160",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T19:02:40Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/5ea0c4ec-c02a-43ff-8c2c-3b8e3d563aec/answer` → **200**

```json
{
  "command_id": "d9818ba1-0284-46fc-9c66-c679f9e54212"
}
```

```json
{
  "id": "5ea0c4ec-c02a-43ff-8c2c-3b8e3d563aec",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673337160",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "order_ids": [],
  "started_at": "2026-10-28T19:02:40Z",
  "answered_at": "2026-10-28T19:02:41.957029Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.702165",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e2fc4be3-93e6-49c3-87c5-570858619872",
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
  "id": "8f1518c5-e3b2-4b9b-8e36-ea22c382279c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:07:42.291544Z",
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
  "command_id": "03c1b8c7-9663-4c88-9419-49bb4adebfc4",
  "quote_id": "8f1518c5-e3b2-4b9b-8e36-ea22c382279c",
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
    "phone": "+380673337160"
  },
  "call_id": "5ea0c4ec-c02a-43ff-8c2c-3b8e3d563aec"
}
```

```json
{
  "id": "04355dac-62b0-4257-8508-aa8296bb2fe6",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:02:42.607175Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673337160"
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
    "id": "1730052000.702165",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5ea0c4ec-c02a-43ff-8c2c-3b8e3d563aec",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673337160",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_ids": [
        "04355dac-62b0-4257-8508-aa8296bb2fe6"
      ],
      "started_at": "2026-10-28T19:02:40Z",
      "answered_at": "2026-10-28T19:02:41.957029Z",
      "ended_at": "2026-10-28T19:02:42.926429Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "9e194682-1986-4ec7-b92d-962a8c2815fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670245232",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_ids": [],
      "started_at": "2026-10-28T19:00:31.311554Z",
      "answered_at": "2026-10-28T19:00:31.667842Z",
      "ended_at": "2026-10-28T19:00:31.989164Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:00:37.057825Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/04355dac-62b0-4257-8508-aa8296bb2fe6` → **200**

```json
{
  "id": "04355dac-62b0-4257-8508-aa8296bb2fe6",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:02:42.607175Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673337160"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/04355dac-62b0-4257-8508-aa8296bb2fe6` → **200**

```json
{
  "id": "04355dac-62b0-4257-8508-aa8296bb2fe6",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:02:42.607175Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673337160"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/04355dac-62b0-4257-8508-aa8296bb2fe6/cancel` → **200**

```json
{
  "command_id": "3fcae49b-e084-451b-b5d6-142874aba7d6",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "04355dac-62b0-4257-8508-aa8296bb2fe6",
  "short_number": 12,
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
  "created_at": "2026-10-28T19:02:42.607175Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673337160"
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

Done: call 5ea0c4ec-c02a-43ff-8c2c-3b8e3d563aec with order 04355dac-62b0-4257-8508-aa8296bb2fe6.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15834"
}
```

```json
{
  "challenge_id": "d1655786-2d8e-469d-9f9f-d290a7b46a81",
  "expires_at": "2026-10-28T19:07:44.219432235Z",
  "resend_available_at": "2026-10-28T19:02:45.219432235Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "371267",
  "sent_at": "2026-10-28T19:02:44.221517539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1655786-2d8e-469d-9f9f-d290a7b46a81",
  "code": "371267",
  "device_ref": "sandbox-15834"
}
```

```json
{
  "session_id": "3ae6f9e0-c677-4451-a115-687028c7f734",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTA2NCwiaWF0IjoxNzkzMjE0MTY0LCJqdGkiOiI0ZTRmMTk1Ny0xMjgyLTQyNDMtYTE0Mi0yMGU1N2ZkNTA1YTMiLCJzaWQiOiIzYWU2ZjllMC1jNjc3LTQ0NTEtYTExNS02ODcwMjhjN2Y3MzQifQ.yderQRPPVxRtPp4Ojfw_TLMwjGHKglsHNRrv83dpm2w",
  "access_expires_at": "2026-10-28T19:17:44.540243582Z",
  "refresh_token": "N_2gh2ts1h89WmQaG5125-yvmngPPs3quGIhNHHogjQ",
  "refresh_expires_at": "2026-11-27T19:02:44.539696665Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae953adc-65e0-49fe-9307-4af433c8a8cb",
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
  "last_heartbeat_at": "2026-10-28T19:02:31.427604Z",
  "last_location_at": "2026-10-28T19:02:31.427604Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ae953adc-65e0-49fe-9307-4af433c8a8cb/handover` → **200**

```json
{
  "command_id": "35bad014-0ca4-477f-9e95-8953133da4ea",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae953adc-65e0-49fe-9307-4af433c8a8cb",
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
  "last_heartbeat_at": "2026-10-28T19:02:31.427604Z",
  "last_location_at": "2026-10-28T19:02:31.427604Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ae953adc-65e0-49fe-9307-4af433c8a8cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:02:45Z",
    "sequence": 1793214165423
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae953adc-65e0-49fe-9307-4af433c8a8cb",
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
  "last_heartbeat_at": "2026-10-28T19:02:45.445218Z",
  "last_location_at": "2026-10-28T19:02:45.445218Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667897439",
  "device_ref": "sandbox-24464"
}
```

```json
{
  "challenge_id": "bc852210-8b65-403b-bb3d-ed28632f11e5",
  "expires_at": "2026-10-28T19:07:45.737632421Z",
  "resend_available_at": "2026-10-28T19:02:46.737632421Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667897439` → **200**

```json
{
  "phone": "+380667897439",
  "audience": "CLIENT",
  "code": "778502",
  "sent_at": "2026-10-28T19:02:45.73981538Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc852210-8b65-403b-bb3d-ed28632f11e5",
  "code": "778502",
  "device_ref": "sandbox-24464"
}
```

```json
{
  "session_id": "5e87e316-df3c-4941-aa23-0732b0c87af7",
  "subject": {
    "type": "CLIENT",
    "id": "1854b866-43fe-45b6-a2a9-f1eb5b69339a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODU0Yjg2Ni00M2ZlLTQ1YjYtYTJhOS1mMWViNWI2OTMzOWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MDY2LCJpYXQiOjE3OTMyMTQxNjYsImp0aSI6IjM3OWU3MmZmLWFkZmMtNDVhZS1hOWVlLTRlMmQyM2YzOGFkZCIsInNpZCI6IjVlODdlMzE2LWRmM2MtNDk0MS1hYTIzLTA3MzJiMGM4N2FmNyJ9.Lb9FBdf-1MVFR7yYppYlk8orrAnRbkgM_v0iq_KVk0I",
  "access_expires_at": "2026-10-28T19:17:46.054697861Z",
  "refresh_token": "ueloIMKs8LiknQ16tlHUnArGtnt_cf-nTjSQxpdyQ74",
  "refresh_expires_at": "2026-11-27T19:02:46.054108197Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "04cb0f1a-94fe-4bac-a188-165cfcbf7560",
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
  "id": "c621ff1f-8e8c-499a-8b6f-2dd590160d62",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:07:46.344072Z",
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
  "command_id": "ee4a2ab2-a5db-4468-b3dd-da92e343aa5b",
  "quote_id": "c621ff1f-8e8c-499a-8b6f-2dd590160d62",
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
  "id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1854b866-43fe-45b6-a2a9-f1eb5b69339a",
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
  "created_at": "2026-10-28T19:02:46.64644Z",
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
    "id": "ade87a0c-0f6b-4063-9cd9-01ddcc679e73",
    "order_id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
    "expires_at": "2026-10-28T19:03:01.649602Z",
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

`POST /api/driver/v1/offers/ade87a0c-0f6b-4063-9cd9-01ddcc679e73/accept` → **200**

```json
{
  "command_id": "bf18e8b8-67cc-4c7b-9e37-217c346d05e6"
}
```

```json
{
  "id": "ed8f2a73-0429-446c-8650-2c9aa62b43f0",
  "order_id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2e5fa7cd-c83e-48d1-9cb0-e70fda5ee667",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2e5fa7cd-c83e-48d1-9cb0-e70fda5ee667",
  "order_id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
  "assignment_id": "ed8f2a73-0429-446c-8650-2c9aa62b43f0",
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

`POST /api/driver/v1/work-sessions/ae953adc-65e0-49fe-9307-4af433c8a8cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:02:47Z",
    "sequence": 1793214167841
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae953adc-65e0-49fe-9307-4af433c8a8cb",
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
  "last_heartbeat_at": "2026-10-28T19:02:47.863465Z",
  "last_location_at": "2026-10-28T19:02:47.863465Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2e5fa7cd-c83e-48d1-9cb0-e70fda5ee667/arrive` → **200**

```json
{
  "command_id": "186d4dc7-59ef-4b37-8d26-3c51b38a0a88",
  "expected_version": 0
}
```

```json
{
  "id": "2e5fa7cd-c83e-48d1-9cb0-e70fda5ee667",
  "order_id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
  "assignment_id": "ed8f2a73-0429-446c-8650-2c9aa62b43f0",
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
  "arrived_at": "2026-10-28T19:02:48.164729Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2e5fa7cd-c83e-48d1-9cb0-e70fda5ee667/start` → **200**

```json
{
  "command_id": "1101aefe-066a-40f1-9213-9eceafb2c13b",
  "expected_version": 1
}
```

```json
{
  "id": "2e5fa7cd-c83e-48d1-9cb0-e70fda5ee667",
  "order_id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
  "assignment_id": "ed8f2a73-0429-446c-8650-2c9aa62b43f0",
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
  "arrived_at": "2026-10-28T19:02:48.164729Z",
  "started_at": "2026-10-28T19:02:48.479241Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/ae953adc-65e0-49fe-9307-4af433c8a8cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:02:48Z",
    "sequence": 1793214168775
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae953adc-65e0-49fe-9307-4af433c8a8cb",
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
  "last_heartbeat_at": "2026-10-28T19:02:48.797317Z",
  "last_location_at": "2026-10-28T19:02:48.797317Z",
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
  "device_ref": "sandbox-3723"
}
```

```json
{
  "challenge_id": "c7831cd0-c7b5-491e-8545-b116affc872d",
  "expires_at": "2026-10-28T19:07:49.080425355Z",
  "resend_available_at": "2026-10-28T19:02:50.080425355Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "145828",
  "sent_at": "2026-10-28T19:02:49.083151209Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7831cd0-c7b5-491e-8545-b116affc872d",
  "code": "145828",
  "device_ref": "sandbox-3723"
}
```

```json
{
  "session_id": "ebb042bc-ce82-4b58-a75b-3f9970f0e6e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTA2OSwiaWF0IjoxNzkzMjE0MTY5LCJqdGkiOiI5NDcxMmY3ZS05N2I4LTQzNWQtODFlMC1iNTU2YzhmMjQ2NjkiLCJzaWQiOiJlYmIwNDJiYy1jZTgyLTRiNTgtYTc1Yi0zZjk5NzBmMGU2ZTUifQ.mzrTqjO5QyYFBkmcTckjNHPxjAwer9p7bks7E0bKf48",
  "access_expires_at": "2026-10-28T19:17:49.40117027Z",
  "refresh_token": "CkuRW9dtedjbv0bIwCagRak-WDJkzHkApzdYAmXVnlA",
  "refresh_expires_at": "2026-11-27T19:02:49.400625657Z",
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
  "command_id": "cdd69f2f-e7c7-4ec5-8c29-bea15729c10e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:02:49Z",
    "sequence": 1793214169985
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "029a2f12-1ec8-4503-b609-98c7dd1874f0",
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
  "last_heartbeat_at": "2026-10-28T19:02:50.00591Z",
  "last_location_at": "2026-10-28T19:02:50.00591Z",
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
  "session_id": "c2835bc3-4310-40f4-aa14-88d2fda96f1c",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwNzAsImlhdCI6MTc5MzIxNDE3MCwianRpIjoiMWY2MjhiNTEtNmI0Yy00NDFiLThhZDgtNDE4YjMwNDhmMmJkIiwic2lkIjoiYzI4MzViYzMtNDMxMC00MGY0LWFhMTQtODhkMmZkYTk2ZjFjIn0.X718fxDiPvKpnIyCxtsiX9JoGiuXhQ_pyT5UbRkNJzk",
  "access_expires_at": "2026-10-28T19:17:50.632285892Z",
  "refresh_token": "JMsZ3KtlPwl3kh9FBbC2IMzx0J5vmvum8Cb4M0Eu7w0",
  "refresh_expires_at": "2026-10-29T07:02:50.631753918Z",
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
  "session_id": "77b08e00-9a12-4c2e-b1a4-1e975224aef4",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwNzEsImlhdCI6MTc5MzIxNDE3MSwianRpIjoiMGQxMjJjYmUtOTNiNi00NjVhLWIwYjQtNTRiZWY2MzJkN2Y1Iiwic2lkIjoiNzdiMDhlMDAtOWExMi00YzJlLWIxYTQtMWU5NzUyMjRhZWY0In0.qkF6JPoYQ68IJ36B3Ym1RHNj-O2BwjQyUe9cf7QuumE",
  "access_expires_at": "2026-10-28T19:17:51.254545842Z",
  "refresh_token": "igFBT5QrnP4KQ-nGOdTNd73jjNQKElvb0WhCfgeSdYE",
  "refresh_expires_at": "2026-10-29T07:02:51.253918968Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b556e8a7-0108-4a54-8329-3ac26abe91a9` → **200**

```json
{
  "id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
  "short_number": 13,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1854b866-43fe-45b6-a2a9-f1eb5b69339a",
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
    "id": "ed8f2a73-0429-446c-8650-2c9aa62b43f0",
    "order_id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2e5fa7cd-c83e-48d1-9cb0-e70fda5ee667",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T19:02:46.64644Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b556e8a7-0108-4a54-8329-3ac26abe91a9/interrupt` → **200**

```json
{
  "command_id": "36796470-a894-4197-a9be-5af73b126b47",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
    "short_number": 13,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "1854b866-43fe-45b6-a2a9-f1eb5b69339a",
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
      "id": "ed8f2a73-0429-446c-8650-2c9aa62b43f0",
      "order_id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "2e5fa7cd-c83e-48d1-9cb0-e70fda5ee667",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T19:02:46.64644Z",
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
    "id": "957a22a8-4d7c-4ce7-8638-c3f8572ea241",
    "short_number": 14,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "1854b866-43fe-45b6-a2a9-f1eb5b69339a",
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
    "id": "b3f15f15-5472-4726-93fd-e212d1e74dab",
    "order_id": "957a22a8-4d7c-4ce7-8638-c3f8572ea241",
    "expires_at": "2026-10-28T19:03:06.873461Z",
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

`POST /api/driver/v1/offers/b3f15f15-5472-4726-93fd-e212d1e74dab/accept` → **200**

```json
{
  "command_id": "1b0215e1-cd4b-43d4-bcbf-5081b7e527be"
}
```

```json
{
  "id": "b563a2be-3c58-49de-b152-25a14f242967",
  "order_id": "957a22a8-4d7c-4ce7-8638-c3f8572ea241",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "966a0258-5ba0-4dbd-9f94-db446e7a2ef4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "966a0258-5ba0-4dbd-9f94-db446e7a2ef4",
  "order_id": "957a22a8-4d7c-4ce7-8638-c3f8572ea241",
  "assignment_id": "b563a2be-3c58-49de-b152-25a14f242967",
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
  "session_id": "029a2f12-1ec8-4503-b609-98c7dd1874f0",
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
  "last_heartbeat_at": "2026-10-28T19:02:50.00591Z",
  "last_location_at": "2026-10-28T19:02:50.00591Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/029a2f12-1ec8-4503-b609-98c7dd1874f0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:02:53Z",
    "sequence": 1793214173358
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "029a2f12-1ec8-4503-b609-98c7dd1874f0",
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
  "last_heartbeat_at": "2026-10-28T19:02:53.379658Z",
  "last_location_at": "2026-10-28T19:02:53.379658Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/966a0258-5ba0-4dbd-9f94-db446e7a2ef4/arrive` → **200**

```json
{
  "command_id": "36319d9f-fb49-4fd8-8e33-91960a960310",
  "expected_version": 0
}
```

```json
{
  "id": "966a0258-5ba0-4dbd-9f94-db446e7a2ef4",
  "order_id": "957a22a8-4d7c-4ce7-8638-c3f8572ea241",
  "assignment_id": "b563a2be-3c58-49de-b152-25a14f242967",
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
  "arrived_at": "2026-10-28T19:02:53.686336Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/966a0258-5ba0-4dbd-9f94-db446e7a2ef4/start` → **200**

```json
{
  "command_id": "933e7b31-0c4c-41a3-9858-f5e77909079e",
  "expected_version": 1
}
```

```json
{
  "id": "966a0258-5ba0-4dbd-9f94-db446e7a2ef4",
  "order_id": "957a22a8-4d7c-4ce7-8638-c3f8572ea241",
  "assignment_id": "b563a2be-3c58-49de-b152-25a14f242967",
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
  "arrived_at": "2026-10-28T19:02:53.686336Z",
  "started_at": "2026-10-28T19:02:53.997799Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/966a0258-5ba0-4dbd-9f94-db446e7a2ef4/complete` → **200**

```json
{
  "command_id": "6e5a0ca4-f37c-47fc-9a51-42a83a4cd1ec",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:02:54Z"
}
```

```json
{
  "id": "966a0258-5ba0-4dbd-9f94-db446e7a2ef4",
  "order_id": "957a22a8-4d7c-4ce7-8638-c3f8572ea241",
  "assignment_id": "b563a2be-3c58-49de-b152-25a14f242967",
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
  "arrived_at": "2026-10-28T19:02:53.686336Z",
  "started_at": "2026-10-28T19:02:53.997799Z",
  "completed_at": "2026-10-28T19:02:54.302957Z",
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
    "id": "957a22a8-4d7c-4ce7-8638-c3f8572ea241",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-28T19:02:51.863738Z",
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
    "id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
    "short_number": 13,
    "status": "CANCELLED",
    "created_at": "2026-10-28T19:02:46.64644Z",
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

`GET /api/operator/v1/orders/b556e8a7-0108-4a54-8329-3ac26abe91a9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:02:46.647026Z",
      "actor": {
        "type": "CLIENT",
        "id": "1854b866-43fe-45b6-a2a9-f1eb5b69339a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
        "quote_id": "c621ff1f-8e8c-499a-8b6f-2dd590160d62",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "d8b5c381-d5c3-4734-86af-8a8c34148cc2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:02:46.648871Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
        "attempt_id": "4c53cd25-e06a-4458-87cd-c8766aeaacc6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d8b5c381-d5c3-4734-86af-8a8c34148cc2"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:02:46.651518Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ade87a0c-0f6b-4063-9cd9-01ddcc679e73",
        "order_id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "d8b5c381-d5c3-4734-86af-8a8c34148cc2"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T19:02:47.272716Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ade87a0c-0f6b-4063-9cd9-01ddcc679e73",
        "order_id": "b556e8a7-0108-4a54-8329-3ac26abe91a9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ed8f2a73-0429-446c-8650-2c9aa62b43f0"
      },
      "correlation_id": "13bd7b9f-6e2b-42b0-af14-adf7ea4e4e21"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/957a22a8-4d7c-4ce7-8638-c3f8572ea241/tip` → **200**

```json
{
  "order_id": "957a22a8-4d7c-4ce7-8638-c3f8572ea241",
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
  "available_until": "2026-10-29T19:02:54.302957Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/957a22a8-4d7c-4ce7-8638-c3f8572ea241/tip` → **409**

```json
{
  "command_id": "f02c825e-a05f-4eae-aeec-e8c55283c2c9",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/957a22a8-4d7c-4ce7-8638-c3f8572ea241/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "682a71ce-d401-4706-985e-eca48cafc3b9"
}
```

Done: interrupted b556e8a7-0108-4a54-8329-3ac26abe91a9, follow-up 957a22a8-4d7c-4ce7-8638-c3f8572ea241.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ae953adc-65e0-49fe-9307-4af433c8a8cb",
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
  "last_heartbeat_at": "2026-10-28T19:02:48.797317Z",
  "last_location_at": "2026-10-28T19:02:48.797317Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ae953adc-65e0-49fe-9307-4af433c8a8cb/close` → **200**

```json
{
  "command_id": "7a49e2e5-59ed-413f-a2e4-1fad98aa588e",
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
  "session_id": "029a2f12-1ec8-4503-b609-98c7dd1874f0",
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
  "last_heartbeat_at": "2026-10-28T19:02:53.379658Z",
  "last_location_at": "2026-10-28T19:02:53.379658Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/029a2f12-1ec8-4503-b609-98c7dd1874f0/close` → **200**

```json
{
  "command_id": "a2412069-be08-4a31-b90f-efd799c6ccb0",
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
  "session_id": "325df009-2dd9-4c0d-957d-d71d0f3b079b",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwODAsImlhdCI6MTc5MzIxNDE4MCwianRpIjoiOWYxZDIwMTQtZTA1Yy00NDhiLTkyZTUtYjU0YzUzZjFmNjFiIiwic2lkIjoiMzI1ZGYwMDktMmRkOS00YzBkLTk1N2QtZDcxZDBmM2IwNzliIn0.9j60q3SgBz0HTEqVLw3cCmJgqTVVIWROTU6c6bNUPKM",
  "access_expires_at": "2026-10-28T19:18:00.608347743Z",
  "refresh_token": "b4TN5UDd_43S1IC0KhThlnpfj6yYRL5wnh9rD7F2RMM",
  "refresh_expires_at": "2026-10-29T07:03:00.607827496Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "b2079f30-c211-4afc-9797-f8617b389509",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:03:00Z"
}
```

```json
{
  "id": "9ec82bbc-d058-4558-821c-66ebd0288cca",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:03:00Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/9ec82bbc-d058-4558-821c-66ebd0288cca/publish` → **200**

```json
{
  "command_id": "c176f78a-ce12-4188-aaf5-e3cb5a5ee648",
  "expected_version": 0
}
```

```json
{
  "id": "9ec82bbc-d058-4558-821c-66ebd0288cca",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:03:01.229185Z",
  "published_at": "2026-10-28T19:03:01.229185Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "9ec82bbc-d058-4558-821c-66ebd0288cca",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T19:03:01.229185Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633861418",
  "device_ref": "sandbox-29088"
}
```

```json
{
  "challenge_id": "51827657-0035-4478-960f-e9abab3fa89e",
  "expires_at": "2026-10-28T19:08:01.812394068Z",
  "resend_available_at": "2026-10-28T19:03:02.812394068Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633861418` → **200**

```json
{
  "phone": "+380633861418",
  "audience": "CLIENT",
  "code": "393237",
  "sent_at": "2026-10-28T19:03:01.815052985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51827657-0035-4478-960f-e9abab3fa89e",
  "code": "393237",
  "device_ref": "sandbox-29088"
}
```

```json
{
  "session_id": "4b93516d-03d8-4dac-9031-50526e0615ef",
  "subject": {
    "type": "CLIENT",
    "id": "d796dfc5-33c3-4894-a3f9-34f72ed74a10"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNzk2ZGZjNS0zM2MzLTQ4OTQtYTNmOS0zNGY3MmVkNzRhMTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MDgyLCJpYXQiOjE3OTMyMTQxODIsImp0aSI6ImU3MTM0NjVhLTlmYzYtNDA3OC04MmVjLTdlZTE0ZjZkZDMwZiIsInNpZCI6IjRiOTM1MTZkLTAzZDgtNGRhYy05MDMxLTUwNTI2ZTA2MTVlZiJ9.xa4nPWJv2JhjTrXvBbXGdpPbq5db7QRN8JZOvbVkuV4",
  "access_expires_at": "2026-10-28T19:18:02.152114562Z",
  "refresh_token": "mkgV4PE9SVFo-veEWwFC6KZ7LNizdbHS8lRyweYsliA",
  "refresh_expires_at": "2026-11-27T19:03:02.151465549Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "9ec82bbc-d058-4558-821c-66ebd0288cca",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T19:03:01.229185Z",
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
  "command_id": "5109f6a0-62d9-4e3c-82a7-a29c499193fe",
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
  "id": "8d733a96-4fac-4087-90ad-094d08b3bd25",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:08:02.742608Z",
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
  "command_id": "a33ef864-9135-4d47-b67a-cd640c4ea15a",
  "quote_id": "8d733a96-4fac-4087-90ad-094d08b3bd25",
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
  "correlation_id": "0175ef00-ab02-418b-85b6-996caa74f56f"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "2ac2f46d-2715-4c32-a7f1-17852e0ba697",
  "version_id": "9ec82bbc-d058-4558-821c-66ebd0288cca",
  "language": "uk"
}
```

```json
{
  "version_id": "9ec82bbc-d058-4558-821c-66ebd0288cca",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T19:03:03.372735Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "69ca9217-e790-462d-afae-cb55f406d4f6",
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
  "id": "b01870e5-f6c1-4e0c-9c3b-b99c9111af05",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:08:03.670345Z",
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
  "command_id": "0337cf61-aa4b-45c6-8814-32a3f7536723",
  "quote_id": "b01870e5-f6c1-4e0c-9c3b-b99c9111af05",
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
  "id": "3a290d25-73e1-44b4-ad38-69c90bde027c",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d796dfc5-33c3-4894-a3f9-34f72ed74a10",
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
  "created_at": "2026-10-28T19:03:03.968216Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a290d25-73e1-44b4-ad38-69c90bde027c` → **200**

```json
{
  "id": "3a290d25-73e1-44b4-ad38-69c90bde027c",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d796dfc5-33c3-4894-a3f9-34f72ed74a10",
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
  "created_at": "2026-10-28T19:03:03.968216Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3a290d25-73e1-44b4-ad38-69c90bde027c/cancel` → **200**

```json
{
  "command_id": "b8fa855f-f483-4b47-af65-5451029e95a1",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3a290d25-73e1-44b4-ad38-69c90bde027c",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d796dfc5-33c3-4894-a3f9-34f72ed74a10",
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
  "created_at": "2026-10-28T19:03:03.968216Z",
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

`POST /api/admin/v1/legal-documents/9ec82bbc-d058-4558-821c-66ebd0288cca` → **409**

```json
{
  "command_id": "84a157ed-616f-4e18-8c7b-0921741b72b0",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:03:04Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/9ec82bbc-d058-4558-821c-66ebd0288cca",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8b980bf0-7744-4ec5-bc4f-46bf59e15a79"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "db828e89-08d2-4fb5-87eb-5b326f630613",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T19:03:05Z"
}
```

```json
{
  "id": "422419d9-f991-455e-9508-e96c5aef621f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T19:03:05Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/422419d9-f991-455e-9508-e96c5aef621f/publish` → **200**

```json
{
  "command_id": "706338f0-3b41-44d2-86c2-5cf8abb8f580",
  "expected_version": 0
}
```

```json
{
  "id": "422419d9-f991-455e-9508-e96c5aef621f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T19:03:05.508309Z",
  "published_at": "2026-10-28T19:03:05.508309Z",
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
  "device_ref": "sandbox-31102"
}
```

```json
{
  "challenge_id": "39e1d729-f61a-4230-9ceb-4e1b75fbcd7a",
  "expires_at": "2026-10-28T19:08:05.823453901Z",
  "resend_available_at": "2026-10-28T19:03:06.823453901Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "228691",
  "sent_at": "2026-10-28T19:03:05.825657066Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39e1d729-f61a-4230-9ceb-4e1b75fbcd7a",
  "code": "228691",
  "device_ref": "sandbox-31102"
}
```

```json
{
  "session_id": "ec8e83ff-f785-4436-83a0-7150e09d4b63",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTA4NiwiaWF0IjoxNzkzMjE0MTg2LCJqdGkiOiIzNDY3ZThlYS1lZmRkLTRhMGMtYTA0ZS1lNGJjZWNhYTJjNTQiLCJzaWQiOiJlYzhlODNmZi1mNzg1LTQ0MzYtODNhMC03MTUwZTA5ZDRiNjMifQ.o6NnDFm73uRxBpUVnqkCo2uM7WK5yBSVeHBDP-6Cykg",
  "access_expires_at": "2026-10-28T19:18:06.141479253Z",
  "refresh_token": "wEbBxUrp1FC-Isv0Zi1qIgqYc3TLFBSgiGslk6rOJjo",
  "refresh_expires_at": "2026-11-27T19:03:06.14091395Z",
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
  "command_id": "ad6e90ec-d467-4480-8ca2-c49fce5caea9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:03:06Z",
    "sequence": 1793214186716
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "597c6669-8ef7-4ae1-b697-515a7027d672",
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
  "last_heartbeat_at": "2026-10-28T19:03:06.737311Z",
  "last_location_at": "2026-10-28T19:03:06.737311Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673804854",
  "device_ref": "sandbox-14245"
}
```

```json
{
  "challenge_id": "690b1676-d627-4ad3-9b4e-2af3081030f0",
  "expires_at": "2026-10-28T19:08:07.029664734Z",
  "resend_available_at": "2026-10-28T19:03:08.029664734Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673804854` → **200**

```json
{
  "phone": "+380673804854",
  "audience": "CLIENT",
  "code": "314868",
  "sent_at": "2026-10-28T19:03:07.033082493Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "690b1676-d627-4ad3-9b4e-2af3081030f0",
  "code": "314868",
  "device_ref": "sandbox-14245"
}
```

```json
{
  "session_id": "d5a291f3-d505-4617-9116-dd7778e78fe6",
  "subject": {
    "type": "CLIENT",
    "id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTQ0Yzg0OS05NWU4LTRjZjMtYmQ0ZS1kYWFhZTRjN2YzMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MDg3LCJpYXQiOjE3OTMyMTQxODcsImp0aSI6ImM4ZjBkNTVmLTY0NTYtNGEwOC05NjZmLTAwMTEzMGU5ZWYzZCIsInNpZCI6ImQ1YTI5MWYzLWQ1MDUtNDYxNy05MTE2LWRkNzc3OGU3OGZlNiJ9.JM85vw2kgqPIontxBqCFpAFrf_otqxYIMrx1oAjCAGY",
  "access_expires_at": "2026-10-28T19:18:07.377826986Z",
  "refresh_token": "N13TE-EtYxXPNhCQantmyc1RcVG6cex1tG--ZGAWRTc",
  "refresh_expires_at": "2026-11-27T19:03:07.376984405Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a06b6116-9da7-45b5-9642-d0967535c576",
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
  "id": "c9f3fb90-3758-4f7a-8f09-02dc1c4e6f54",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:08:07.674270Z",
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
  "command_id": "9f930fa6-dad7-4ab7-a3f4-412cea85bad8",
  "quote_id": "c9f3fb90-3758-4f7a-8f09-02dc1c4e6f54",
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
    "phone": "+380677973467"
  }
}
```

```json
{
  "id": "35eb9518-9390-4915-9cbc-54a49f63c87a",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:03:07.988844Z",
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
    "id": "4e2b1c91-26d4-4a08-bc3e-403c5a1cea63",
    "order_id": "35eb9518-9390-4915-9cbc-54a49f63c87a",
    "expires_at": "2026-10-28T19:03:22.992417Z",
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

`POST /api/driver/v1/offers/4e2b1c91-26d4-4a08-bc3e-403c5a1cea63/accept` → **200**

```json
{
  "command_id": "0a819a07-6a97-4e8b-93ef-6fef7d6653f7"
}
```

```json
{
  "id": "e2fcb06d-df0a-4c26-bc1f-95d554479675",
  "order_id": "35eb9518-9390-4915-9cbc-54a49f63c87a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1528f702-2713-48e6-97d5-e11907839814",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1528f702-2713-48e6-97d5-e11907839814",
  "order_id": "35eb9518-9390-4915-9cbc-54a49f63c87a",
  "assignment_id": "e2fcb06d-df0a-4c26-bc1f-95d554479675",
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
    "phone": "+380677973467"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a3158de2-bf9a-4a5b-9ea9-7bb7fcd2b7b3",
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
  "id": "9f82b8f5-c0ad-4b29-bd1e-6ff48b26e1a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:08:09.204706Z",
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
  "command_id": "2baa8d6c-ee3d-4df2-94a4-bddd776ead92",
  "quote_id": "9f82b8f5-c0ad-4b29-bd1e-6ff48b26e1a3",
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
  "id": "6293cc1b-1ffc-4e70-a540-5f0c048bcc07",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:03:09.51916Z",
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
  "command_id": "d211790d-014d-4562-9d40-dcbe176c7f4c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T22:03:09Z"
}
```

```json
{
  "id": "b1533777-8438-4bf6-8d2a-8ec78a1ff683",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:08:09.841149Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T22:03:09Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d3915669-80da-429b-acda-112207dbd042",
  "quote_id": "b1533777-8438-4bf6-8d2a-8ec78a1ff683",
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
  "pickup_at": "2026-10-28T22:03:09Z"
}
```

```json
{
  "id": "65614328-180d-420d-9c20-cf1aee306e9d",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T19:03:10.155071Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T22:03:09Z",
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
  "command_id": "d4bdfd09-ef6c-4d1b-acc8-b990d7425771",
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
  "id": "8813405f-fbde-4b44-a28e-d6741e24fbf7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:08:10.487774Z",
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
  "command_id": "1b06e301-2210-4378-b421-e4d681cafe87",
  "quote_id": "8813405f-fbde-4b44-a28e-d6741e24fbf7",
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
  "correlation_id": "aa7e33b4-3a0f-4367-a461-94de9b52aa9c"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "65614328-180d-420d-9c20-cf1aee306e9d",
      "short_number": 18,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T19:03:10.155071Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T22:03:09Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "6293cc1b-1ffc-4e70-a540-5f0c048bcc07",
      "short_number": 17,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T19:03:09.51916Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "35eb9518-9390-4915-9cbc-54a49f63c87a",
      "short_number": 16,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "6293cc1b-1ffc-4e70-a540-5f0c048bcc07",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:03:09.51916Z",
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

`GET /api/rider/v1/orders/35eb9518-9390-4915-9cbc-54a49f63c87a` → **200**

```json
{
  "id": "35eb9518-9390-4915-9cbc-54a49f63c87a",
  "short_number": 16,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e2fcb06d-df0a-4c26-bc1f-95d554479675",
    "order_id": "35eb9518-9390-4915-9cbc-54a49f63c87a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1528f702-2713-48e6-97d5-e11907839814",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T19:03:07.988844Z",
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
    "location_at": "2026-10-28T19:03:06.737311Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/35eb9518-9390-4915-9cbc-54a49f63c87a/cancel` → **200**

```json
{
  "command_id": "e9efded2-f10a-4d32-85e2-b02e0ec1541c",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "35eb9518-9390-4915-9cbc-54a49f63c87a",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e2fcb06d-df0a-4c26-bc1f-95d554479675",
    "order_id": "35eb9518-9390-4915-9cbc-54a49f63c87a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1528f702-2713-48e6-97d5-e11907839814",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T19:03:07.988844Z",
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

`GET /api/rider/v1/orders/6293cc1b-1ffc-4e70-a540-5f0c048bcc07` → **200**

```json
{
  "id": "6293cc1b-1ffc-4e70-a540-5f0c048bcc07",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:03:09.51916Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6293cc1b-1ffc-4e70-a540-5f0c048bcc07/cancel` → **200**

```json
{
  "command_id": "43ff6685-46d6-40e4-ae3a-2b552ff71eb9",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6293cc1b-1ffc-4e70-a540-5f0c048bcc07",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:03:09.51916Z",
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

`GET /api/rider/v1/orders/65614328-180d-420d-9c20-cf1aee306e9d` → **200**

```json
{
  "id": "65614328-180d-420d-9c20-cf1aee306e9d",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T19:03:10.155071Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T22:03:09Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/65614328-180d-420d-9c20-cf1aee306e9d/cancel` → **200**

```json
{
  "command_id": "46ffd62b-d4eb-40d9-8b1e-03c05bc60477",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "65614328-180d-420d-9c20-cf1aee306e9d",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "b544c849-95e8-4cf3-bd4e-daaae4c7f319",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T19:03:10.155071Z",
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
  "pickup_at": "2026-10-28T22:03:09Z",
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
  "session_id": "597c6669-8ef7-4ae1-b697-515a7027d672",
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
  "last_heartbeat_at": "2026-10-28T19:03:06.737311Z",
  "last_location_at": "2026-10-28T19:03:06.737311Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/597c6669-8ef7-4ae1-b697-515a7027d672/close` → **200**

```json
{
  "command_id": "070da343-6b59-4de9-a4ca-a9db21e76c44",
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

Done: orders 35eb9518-9390-4915-9cbc-54a49f63c87a, 6293cc1b-1ffc-4e70-a540-5f0c048bcc07, 65614328-180d-420d-9c20-cf1aee306e9d.

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
  "session_id": "a8bb647c-8b08-4dc9-9c8d-8b13eae94ab0",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwOTQsImlhdCI6MTc5MzIxNDE5NCwianRpIjoiODIwOGQyMjAtY2RiNi00Mzg3LTk2OGUtYjQ5ODVmYWVjNDI1Iiwic2lkIjoiYThiYjY0N2MtOGIwOC00ZGM5LTljOGQtOGIxM2VhZTk0YWIwIn0.3mAonP4snadLNeLaC6DSgD2v611LIo9NK9o_N22KwUY",
  "access_expires_at": "2026-10-28T19:18:14.510149676Z",
  "refresh_token": "kfrrDB-PtlL1H81Qq_S2QdtFHg9aCfM0sm6oxyuzEzM",
  "refresh_expires_at": "2026-10-29T07:03:14.509504255Z",
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
  "session_id": "047c5463-69b5-4866-806f-3113df105138",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUwOTUsImlhdCI6MTc5MzIxNDE5NSwianRpIjoiNzBiM2VkYTktOGZmNS00ZDU3LWFmZjctZjNiOTQ3YjkxNTIyIiwic2lkIjoiMDQ3YzU0NjMtNjliNS00ODY2LTgwNmYtMzExM2RmMTA1MTM4In0.2hpnpFH1oxTQAJsNklKdGHgxAKm3HzLYBI32UUZpN1k",
  "access_expires_at": "2026-10-28T19:18:15.130034072Z",
  "refresh_token": "r0m8xhdCpwJCkmBg6x3Gxp5f0n5Gb24D6XeshsZrYgw",
  "refresh_expires_at": "2026-10-29T07:03:15.129221509Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7141"
}
```

```json
{
  "challenge_id": "0feac1e1-e623-4543-8a81-0e1ea7e190d2",
  "expires_at": "2026-10-28T19:08:15.41233321Z",
  "resend_available_at": "2026-10-28T19:03:16.41233321Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "782656",
  "sent_at": "2026-10-28T19:03:15.415021117Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0feac1e1-e623-4543-8a81-0e1ea7e190d2",
  "code": "782656",
  "device_ref": "sandbox-7141"
}
```

```json
{
  "session_id": "650be8af-d0d2-4511-8834-86908ebff015",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTA5NSwiaWF0IjoxNzkzMjE0MTk1LCJqdGkiOiIyYjY1ZjZjYy0xZGU0LTQyNDQtYTkyNi02OTdhNGM2NzJmZDQiLCJzaWQiOiI2NTBiZThhZi1kMGQyLTQ1MTEtODgzNC04NjkwOGViZmYwMTUifQ.i2y2SF6rkRoHjTkBTwMZ_vB5iehQ5Fv08faoBwX2HIo",
  "access_expires_at": "2026-10-28T19:18:15.741151738Z",
  "refresh_token": "0aN4ESDr_B_9_yoheJ3ageR-SzQsxzzismAPcPxcHpY",
  "refresh_expires_at": "2026-11-27T19:03:15.740491194Z",
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
  "command_id": "8c3e0857-3e11-49e5-8556-1364b657a8bf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:03:16Z",
    "sequence": 1793214196314
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bfeb0630-e9c9-4924-b47e-2c55181356a3",
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
  "last_heartbeat_at": "2026-10-28T19:03:16.335597Z",
  "last_location_at": "2026-10-28T19:03:16.335597Z",
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
  "command_id": "3dc04548-7a66-4931-8771-3ede635c1e59",
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
  "effective_at": "2026-10-28T19:03:16.957214Z",
  "changed_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "716e1551-e1ad-4619-8d26-a6521c301975",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T19:00:48.742031Z",
  "last_entries": [
    {
      "order_id": "faf0fdd4-acec-4d7d-bdc5-f0f6e0a83fdf",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T19:00:48.742031Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "70aa6ae4-8e7e-4c94-b20d-86f37422e516",
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
  "id": "861904f6-1507-439b-8585-d74cd6e8308e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:08:17.571643Z",
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
  "command_id": "7272b649-afe9-4841-bf2e-4835fbf5f1ef",
  "quote_id": "861904f6-1507-439b-8585-d74cd6e8308e",
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
    "phone": "+380671117804"
  }
}
```

```json
{
  "id": "71b9e4b3-df7d-4844-b876-0b0f70d80fe7",
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
  "created_at": "2026-10-28T19:03:17.880094Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117804"
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
    "id": "12675818-46d6-420e-9146-22d20f58273a",
    "order_id": "71b9e4b3-df7d-4844-b876-0b0f70d80fe7",
    "expires_at": "2026-10-28T19:03:32.884406Z",
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

`POST /api/driver/v1/offers/12675818-46d6-420e-9146-22d20f58273a/accept` → **200**

```json
{
  "command_id": "f7a7b3cb-e44c-4391-8618-2dd3dbbb1375"
}
```

```json
{
  "id": "0ca0a10e-e308-4555-9026-d41027a31954",
  "order_id": "71b9e4b3-df7d-4844-b876-0b0f70d80fe7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "46b2f9ea-78a8-4222-8e7c-bd7d0e302db8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "46b2f9ea-78a8-4222-8e7c-bd7d0e302db8",
  "order_id": "71b9e4b3-df7d-4844-b876-0b0f70d80fe7",
  "assignment_id": "0ca0a10e-e308-4555-9026-d41027a31954",
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
    "phone": "+380671117804"
  }
}
```

`POST /api/driver/v1/work-sessions/bfeb0630-e9c9-4924-b47e-2c55181356a3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:03:19Z",
    "sequence": 1793214199680
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bfeb0630-e9c9-4924-b47e-2c55181356a3",
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
  "last_heartbeat_at": "2026-10-28T19:03:19.090955Z",
  "last_location_at": "2026-10-28T19:03:19.090955Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/46b2f9ea-78a8-4222-8e7c-bd7d0e302db8/arrive` → **200**

```json
{
  "command_id": "6c3656c1-37b9-48a7-ae2c-e5f9538a686d",
  "expected_version": 0
}
```

```json
{
  "id": "46b2f9ea-78a8-4222-8e7c-bd7d0e302db8",
  "order_id": "71b9e4b3-df7d-4844-b876-0b0f70d80fe7",
  "assignment_id": "0ca0a10e-e308-4555-9026-d41027a31954",
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
  "arrived_at": "2026-10-28T19:03:19.397471Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671117804"
  }
}
```

`POST /api/driver/v1/trips/46b2f9ea-78a8-4222-8e7c-bd7d0e302db8/start` → **200**

```json
{
  "command_id": "6deab65c-6ce9-4ae4-904f-d4804c0a3b11",
  "expected_version": 1
}
```

```json
{
  "id": "46b2f9ea-78a8-4222-8e7c-bd7d0e302db8",
  "order_id": "71b9e4b3-df7d-4844-b876-0b0f70d80fe7",
  "assignment_id": "0ca0a10e-e308-4555-9026-d41027a31954",
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
  "arrived_at": "2026-10-28T19:03:19.397471Z",
  "started_at": "2026-10-28T19:03:19.708518Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671117804"
  }
}
```

`POST /api/driver/v1/trips/46b2f9ea-78a8-4222-8e7c-bd7d0e302db8/complete` → **200**

```json
{
  "command_id": "952bd0d8-7c05-4037-9282-a051a1d036e5",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:03:20Z",
  "cash_received": true
}
```

```json
{
  "id": "46b2f9ea-78a8-4222-8e7c-bd7d0e302db8",
  "order_id": "71b9e4b3-df7d-4844-b876-0b0f70d80fe7",
  "assignment_id": "0ca0a10e-e308-4555-9026-d41027a31954",
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
  "arrived_at": "2026-10-28T19:03:19.397471Z",
  "started_at": "2026-10-28T19:03:19.708518Z",
  "completed_at": "2026-10-28T19:03:20.03271Z",
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
  "command_id": "15eac3e2-0d6b-48bf-be98-33f50fc80b3e",
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
  "id": "64a5a1b8-2445-469a-8a82-8f5229f11f96",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:08:20.344333Z",
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
  "command_id": "64fe13a4-bc06-42d8-9811-7318ca698691",
  "quote_id": "64a5a1b8-2445-469a-8a82-8f5229f11f96",
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
    "phone": "+380671112343"
  }
}
```

```json
{
  "id": "5f5c53ee-cd1d-40d5-ba19-1bd1eb663c76",
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
  "created_at": "2026-10-28T19:03:20.674562Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112343"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5f5c53ee-cd1d-40d5-ba19-1bd1eb663c76` → **200**

```json
{
  "id": "5f5c53ee-cd1d-40d5-ba19-1bd1eb663c76",
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
  "created_at": "2026-10-28T19:03:20.674562Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112343"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5f5c53ee-cd1d-40d5-ba19-1bd1eb663c76/cancel` → **200**

```json
{
  "command_id": "5923691f-93a2-493f-933d-143d65571af4",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "5f5c53ee-cd1d-40d5-ba19-1bd1eb663c76",
  "short_number": 20,
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
  "created_at": "2026-10-28T19:03:20.674562Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112343"
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
  "staff_id": "716e1551-e1ad-4619-8d26-a6521c301975",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T19:00:48.742031Z",
  "last_entries": [
    {
      "order_id": "5f5c53ee-cd1d-40d5-ba19-1bd1eb663c76",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T19:03:21.311619Z"
    },
    {
      "order_id": "71b9e4b3-df7d-4844-b876-0b0f70d80fe7",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T19:03:20.038071Z"
    },
    {
      "order_id": "faf0fdd4-acec-4d7d-bdc5-f0f6e0a83fdf",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T19:00:48.742031Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bfeb0630-e9c9-4924-b47e-2c55181356a3",
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
  "last_heartbeat_at": "2026-10-28T19:03:19.090955Z",
  "last_location_at": "2026-10-28T19:03:19.090955Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bfeb0630-e9c9-4924-b47e-2c55181356a3/close` → **200**

```json
{
  "command_id": "53d62a4b-7920-4081-b143-decf6e01a411",
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

Done: operator bonus for fulfilled 71b9e4b3-df7d-4844-b876-0b0f70d80fe7 and operator-fault cancellation 5f5c53ee-cd1d-40d5-ba19-1bd1eb663c76.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671963042",
  "device_ref": "sandbox-2650"
}
```

```json
{
  "challenge_id": "4cb5a70c-c3da-4d40-8513-7bfd82228e3b",
  "expires_at": "2026-10-28T19:08:24.575744474Z",
  "resend_available_at": "2026-10-28T19:03:25.575744474Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671963042` → **200**

```json
{
  "phone": "+380671963042",
  "audience": "CLIENT",
  "code": "333590",
  "sent_at": "2026-10-28T19:03:24.578637709Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676164881",
  "device_ref": "sandbox-17424",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "039a66e6-bad9-44ac-b6b0-0c46d623fe3f",
  "expires_at": "2026-10-28T19:08:24.905309591Z",
  "resend_available_at": "2026-10-28T19:03:25.905309591Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676164881` → **200**

```json
{
  "phone": "+380676164881",
  "audience": "CLIENT",
  "code": "403738",
  "sent_at": "2026-10-28T19:03:24.907441739Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677200000",
  "device_ref": "sandbox-6269"
}
```

```json
{
  "challenge_id": "fc88a71e-de5a-441d-b056-74dcd6d7e6c5",
  "expires_at": "2026-10-28T19:08:25.221407204Z",
  "resend_available_at": "2026-10-28T19:03:26.221407204Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677200000` → **200**

```json
{
  "phone": "+380677200000",
  "audience": "CLIENT",
  "code": "176617",
  "sent_at": "2026-10-28T19:03:25.225098416Z",
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
  "session_id": "1fe47ea4-7362-49cf-8283-651ae0ce6756",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxMDUsImlhdCI6MTc5MzIxNDIwNSwianRpIjoiNDEzZDc4M2MtNTMyZC00Y2Q1LTg2ZmEtNmQ0NzBhMmY5NGU3Iiwic2lkIjoiMWZlNDdlYTQtNzM2Mi00OWNmLTgyODMtNjUxYWUwY2U2NzU2In0.31MUhz8xRz6HlvzQDox91FGZGv9F9thPHr6sVT8Kt5M",
  "access_expires_at": "2026-10-28T19:18:25.876547241Z",
  "refresh_token": "kJytPUm21-rmaTzKvhQ7IpGOPV3YM1icqzeb5EfOjKA",
  "refresh_expires_at": "2026-10-29T07:03:25.875797827Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677200000` → **200**

```json
{
  "deliveries": [
    {
      "id": "0faf4f76-4f4c-49f0-a261-41eb97e52b5a",
      "challenge_id": "fc88a71e-de5a-441d-b056-74dcd6d7e6c5",
      "phone": "+380677200000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ba6e8830-2ad9-4ccd-8985-42247082a93c",
      "error": null,
      "attempted_at": "2026-10-28T19:03:25.225406Z"
    },
    {
      "id": "47a16717-5eab-49fb-aff9-e3e59dc99833",
      "challenge_id": "fc88a71e-de5a-441d-b056-74dcd6d7e6c5",
      "phone": "+380677200000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T19:03:25.223994Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677200000` → **200**

```json
{
  "phone": "+380677200000",
  "audience": "CLIENT",
  "code": "176617",
  "sent_at": "2026-10-28T19:03:25.225098416Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676164881` → **200**

```json
{
  "deliveries": [
    {
      "id": "8da8fbd4-e283-4ea4-bb09-a2a4671003e5",
      "challenge_id": "039a66e6-bad9-44ac-b6b0-0c46d623fe3f",
      "phone": "+380676164881",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-866c9147-ba2a-42ff-af31-4bfe4e36ddb5",
      "error": null,
      "attempted_at": "2026-10-28T19:03:24.907848Z"
    }
  ]
}
```

Done: SMS to +380671963042, a call to +380676164881, SMS then a call to +380677200000.

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
  "session_id": "2f10cea0-4384-4b82-86e7-0f24dc16e6cb",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxMDcsImlhdCI6MTc5MzIxNDIwNywianRpIjoiY2YzMWNjNGUtM2YwMy00ZTM5LWFmOGYtZjNlNjU3OWQzMzczIiwic2lkIjoiMmYxMGNlYTAtNDM4NC00YjgyLTg2ZTctMGYyNGRjMTZlNmNiIn0.rg43md11m0ZbqGbzrpgi13ysA2E59Dy4XIXCcsoL6wA",
  "access_expires_at": "2026-10-28T19:18:27.14894282Z",
  "refresh_token": "34WzBzUo1WItLE8nyQnUHGtSq8CRTVkHlJ9ouAa5HiQ",
  "refresh_expires_at": "2026-10-29T07:03:27.148337839Z",
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
  "session_id": "7d2fa734-0a9c-4fd3-985c-2410d2edfe85",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxMDcsImlhdCI6MTc5MzIxNDIwNywianRpIjoiYjRjZDZlNzgtMWUyZi00NzI4LThhNWMtODg2NzZhNDllMTVhIiwic2lkIjoiN2QyZmE3MzQtMGE5Yy00ZmQzLTk4NWMtMjQxMGQyZWRmZTg1In0.1OihKguyzD7pEOCkunMWW6wBmlZER1-81KXphSF7WXU",
  "access_expires_at": "2026-10-28T19:18:27.775865053Z",
  "refresh_token": "1d9fAxq6KzCFT3Yu1JucqiYl5nTqgc2rbKO8BeFA6bo",
  "refresh_expires_at": "2026-10-29T07:03:27.775235715Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "716e1551-e1ad-4619-8d26-a6521c301975",
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

`POST /api/admin/v1/staff-extensions/716e1551-e1ad-4619-8d26-a6521c301975` → **200**

```json
{
  "command_id": "a17714b7-9a13-41be-b874-e2116b7a186d",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "716e1551-e1ad-4619-8d26-a6521c301975",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "d93ecd5f-08fd-47a5-966f-fea799606364",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T19:03:28.964192Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T19:03:28.964192Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a69ab9ba-725b-4bfd-9098-01c70e35939c",
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
  "id": "4f100f14-4f83-4c70-8764-66d39591f101",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:08:29.552309Z",
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
  "command_id": "69d4230e-3aec-4ab6-8eb3-453d3c364f24",
  "quote_id": "4f100f14-4f83-4c70-8764-66d39591f101",
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
    "phone": "+380673115918"
  }
}
```

```json
{
  "id": "dddd75f9-b492-4ae6-a544-ceacaad9477f",
  "short_number": 21,
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
  "created_at": "2026-10-28T19:03:29.853077Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673115918"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/dddd75f9-b492-4ae6-a544-ceacaad9477f/calls` → **201**

```json
{
  "command_id": "c8e1cc22-d328-462d-8005-005ab1dc94b1",
  "to": "CALLER"
}
```

```json
{
  "id": "5ea9b6cc-a0a5-4999-aac6-e6092ad7f0e6",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "order_ids": [
    "dddd75f9-b492-4ae6-a544-ceacaad9477f"
  ],
  "started_at": "2026-10-28T19:03:30.189844Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/dddd75f9-b492-4ae6-a544-ceacaad9477f/calls` → **201**

```json
{
  "command_id": "c8e1cc22-d328-462d-8005-005ab1dc94b1",
  "to": "CALLER"
}
```

```json
{
  "id": "5ea9b6cc-a0a5-4999-aac6-e6092ad7f0e6",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "order_ids": [
    "dddd75f9-b492-4ae6-a544-ceacaad9477f"
  ],
  "started_at": "2026-10-28T19:03:30.189844Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "5ea9b6cc-a0a5-4999-aac6-e6092ad7f0e6",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673115918",
    "at": "2026-10-28T19:03:30.192399073Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "5ea9b6cc-a0a5-4999-aac6-e6092ad7f0e6",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.14265",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "5ea9b6cc-a0a5-4999-aac6-e6092ad7f0e6"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "5ea9b6cc-a0a5-4999-aac6-e6092ad7f0e6",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=dddd75f9-b492-4ae6-a544-ceacaad9477f` → **200**

```json
{
  "calls": [
    {
      "id": "5ea9b6cc-a0a5-4999-aac6-e6092ad7f0e6",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_ids": [
        "dddd75f9-b492-4ae6-a544-ceacaad9477f"
      ],
      "started_at": "2026-10-28T19:03:30.189844Z",
      "answered_at": "2026-10-28T19:03:30.884351Z",
      "ended_at": "2026-10-28T19:03:30.910695Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=dddd75f9-b492-4ae6-a544-ceacaad9477f` → **200**

```json
{
  "calls": [
    {
      "id": "5ea9b6cc-a0a5-4999-aac6-e6092ad7f0e6",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_ids": [
        "dddd75f9-b492-4ae6-a544-ceacaad9477f"
      ],
      "started_at": "2026-10-28T19:03:30.189844Z",
      "answered_at": "2026-10-28T19:03:30.884351Z",
      "ended_at": "2026-10-28T19:03:30.910695Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=dddd75f9-b492-4ae6-a544-ceacaad9477f` → **200**

```json
{
  "calls": [
    {
      "id": "5ea9b6cc-a0a5-4999-aac6-e6092ad7f0e6",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_ids": [
        "dddd75f9-b492-4ae6-a544-ceacaad9477f"
      ],
      "started_at": "2026-10-28T19:03:30.189844Z",
      "answered_at": "2026-10-28T19:03:30.884351Z",
      "ended_at": "2026-10-28T19:03:30.910695Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=dddd75f9-b492-4ae6-a544-ceacaad9477f` → **200**

```json
{
  "calls": [
    {
      "id": "5ea9b6cc-a0a5-4999-aac6-e6092ad7f0e6",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "716e1551-e1ad-4619-8d26-a6521c301975",
      "order_ids": [
        "dddd75f9-b492-4ae6-a544-ceacaad9477f"
      ],
      "started_at": "2026-10-28T19:03:30.189844Z",
      "answered_at": "2026-10-28T19:03:30.884351Z",
      "ended_at": "2026-10-28T19:03:30.910695Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:03:37.125141Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/dddd75f9-b492-4ae6-a544-ceacaad9477f` → **200**

```json
{
  "id": "dddd75f9-b492-4ae6-a544-ceacaad9477f",
  "short_number": 21,
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
  "created_at": "2026-10-28T19:03:29.853077Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673115918"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dddd75f9-b492-4ae6-a544-ceacaad9477f/cancel` → **200**

```json
{
  "command_id": "02f88f6a-3a34-4145-9bbf-3ba4d62776ac",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "dddd75f9-b492-4ae6-a544-ceacaad9477f",
  "short_number": 21,
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
  "created_at": "2026-10-28T19:03:29.853077Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673115918"
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
  "command_id": "4d388886-ddf8-4866-b91d-18086969e41d",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T19:03:38.827022Z",
  "extension": "101"
}
```

Done: outgoing call 5ea9b6cc-a0a5-4999-aac6-e6092ad7f0e6 from order dddd75f9-b492-4ae6-a544-ceacaad9477f, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637478009",
  "device_ref": "sandbox-16656"
}
```

```json
{
  "challenge_id": "836d1093-a003-45b1-a4d5-4f8657548853",
  "expires_at": "2026-10-28T19:08:39.139500285Z",
  "resend_available_at": "2026-10-28T19:03:40.139500285Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637478009` → **200**

```json
{
  "phone": "+380637478009",
  "audience": "CLIENT",
  "code": "819700",
  "sent_at": "2026-10-28T19:03:39.142186815Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "836d1093-a003-45b1-a4d5-4f8657548853",
  "code": "819700",
  "device_ref": "sandbox-16656"
}
```

```json
{
  "session_id": "48be7978-dc83-4141-b5b8-9e57276bbfd5",
  "subject": {
    "type": "CLIENT",
    "id": "06e64a3e-6fd3-44ce-a122-d946364f9a42"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmU2NGEzZS02ZmQzLTQ0Y2UtYTEyMi1kOTQ2MzY0ZjlhNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MTE5LCJpYXQiOjE3OTMyMTQyMTksImp0aSI6IjAwOWEzMDkwLWQ2MDQtNDlhOS05ZmJhLTNiOGUxOTI2ZTVmZSIsInNpZCI6IjQ4YmU3OTc4LWRjODMtNDE0MS1iNWI4LTllNTcyNzZiYmZkNSJ9.Bwho_MDdeo6bPVCufQBNCzTDgZ2g9csbMslEPwWzG5M",
  "access_expires_at": "2026-10-28T19:18:39.458136745Z",
  "refresh_token": "GgvA7izN88ZU3AOzUEFY8w1m4YoKZM7l9xR1FWhWkEY",
  "refresh_expires_at": "2026-11-27T19:03:39.457581256Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "06e64a3e-6fd3-44ce-a122-d946364f9a42",
  "session_id": "48be7978-dc83-4141-b5b8-9e57276bbfd5",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637478009",
  "device_ref": "sandbox-10289"
}
```

```json
{
  "challenge_id": "dbf74db0-55df-4c22-839c-ccefca18379f",
  "expires_at": "2026-10-28T19:08:42.035959405Z",
  "resend_available_at": "2026-10-28T19:03:43.035959405Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637478009` → **200**

```json
{
  "phone": "+380637478009",
  "audience": "CLIENT",
  "code": "358451",
  "sent_at": "2026-10-28T19:03:42.037975367Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbf74db0-55df-4c22-839c-ccefca18379f",
  "code": "358451",
  "device_ref": "sandbox-10289"
}
```

```json
{
  "session_id": "393de4ae-087c-40cf-92e0-bac02d5f53d1",
  "subject": {
    "type": "CLIENT",
    "id": "06e64a3e-6fd3-44ce-a122-d946364f9a42"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmU2NGEzZS02ZmQzLTQ0Y2UtYTEyMi1kOTQ2MzY0ZjlhNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MTIyLCJpYXQiOjE3OTMyMTQyMjIsImp0aSI6IjBkNDBkYzEyLWY4NTgtNGI3Yy1hMWNmLWMwMGQ0MmJiNDc2NiIsInNpZCI6IjM5M2RlNGFlLTA4N2MtNDBjZi05MmUwLWJhYzAyZDVmNTNkMSJ9.I1Y91U6cEI__kAMJ4kW8QlMqZH_34rBpGKmphBBK7zQ",
  "access_expires_at": "2026-10-28T19:18:42.364620061Z",
  "refresh_token": "zD7g487d8V2qvSc0C47MC-02KdvBWZpkaDkcncC9pHI",
  "refresh_expires_at": "2026-11-27T19:03:42.364067957Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "8f499d9d-5388-4402-b1e0-ab89165422d1",
  "expires_at": "2026-10-28T19:08:44.658174111Z",
  "resend_available_at": "2026-10-28T19:03:45.658174111Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637478009` → **200**

```json
{
  "phone": "+380637478009",
  "audience": "CLIENT",
  "code": "094845",
  "sent_at": "2026-10-28T19:03:44.660475183Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380630372081"
}
```

```json
{
  "challenge_id": "c67e327f-bf22-4e25-b12b-cace3dd4e510",
  "expires_at": "2026-10-28T19:08:44.983098068Z",
  "resend_available_at": "2026-10-28T19:03:45.983098068Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630372081` → **200**

```json
{
  "phone": "+380630372081",
  "audience": "CLIENT",
  "code": "756578",
  "sent_at": "2026-10-28T19:03:44.984960834Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "da121f01-26da-47be-aadb-64516ea41bfd",
  "current_challenge_id": "8f499d9d-5388-4402-b1e0-ab89165422d1",
  "current_code": "000000",
  "new_challenge_id": "c67e327f-bf22-4e25-b12b-cace3dd4e510",
  "new_code": "756578"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "b847ee39-d845-4970-8cda-90848827c6de"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "5c73eb76-73d4-4b7c-bd49-78c85db0e49b",
  "current_challenge_id": "8f499d9d-5388-4402-b1e0-ab89165422d1",
  "current_code": "094845",
  "new_challenge_id": "c67e327f-bf22-4e25-b12b-cace3dd4e510",
  "new_code": "756578"
}
```

```json
{
  "subject_id": "06e64a3e-6fd3-44ce-a122-d946364f9a42",
  "phone": "+380630372081",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "06e64a3e-6fd3-44ce-a122-d946364f9a42",
  "session_id": "48be7978-dc83-4141-b5b8-9e57276bbfd5",
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
  "correlation_id": "406a3bb1-4117-409b-8604-8fdbb5cec777"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630372081",
  "device_ref": "sandbox-13130"
}
```

```json
{
  "challenge_id": "a740444e-2e46-4b8d-b30b-7129245c7ec2",
  "expires_at": "2026-10-28T19:08:48.501485002Z",
  "resend_available_at": "2026-10-28T19:03:49.501485002Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630372081` → **200**

```json
{
  "phone": "+380630372081",
  "audience": "CLIENT",
  "code": "885583",
  "sent_at": "2026-10-28T19:03:48.503617745Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a740444e-2e46-4b8d-b30b-7129245c7ec2",
  "code": "885583",
  "device_ref": "sandbox-13130"
}
```

```json
{
  "session_id": "58e085bb-137b-4217-8175-4b6279eed7ff",
  "subject": {
    "type": "CLIENT",
    "id": "06e64a3e-6fd3-44ce-a122-d946364f9a42"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmU2NGEzZS02ZmQzLTQ0Y2UtYTEyMi1kOTQ2MzY0ZjlhNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MTI4LCJpYXQiOjE3OTMyMTQyMjgsImp0aSI6IjVhMWRlYWMxLTM3MzMtNDQzOC05OTZhLTU4YmZlNGU2NzgyMiIsInNpZCI6IjU4ZTA4NWJiLTEzN2ItNDIxNy04MTc1LTRiNjI3OWVlZDdmZiJ9.oAooTPqQvXT_gwDcwxNoTDfJxT50r12sOnCOR09qHGU",
  "access_expires_at": "2026-10-28T19:18:48.830996046Z",
  "refresh_token": "1vP4xtvFmwdYDg1oVh91L_H5jsOv0csgS9LxRqiCsEo",
  "refresh_expires_at": "2026-11-27T19:03:48.830439236Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "06e64a3e-6fd3-44ce-a122-d946364f9a42",
  "session_id": "58e085bb-137b-4217-8175-4b6279eed7ff",
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
  "session_id": "ebc9273f-c5aa-4b18-969c-988784add9b4",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxMjksImlhdCI6MTc5MzIxNDIyOSwianRpIjoiMjM4Nzk5MWUtZTY3Yi00NTY3LWFhYTgtZDQyNjBmMTQ2NTJhIiwic2lkIjoiZWJjOTI3M2YtYzVhYS00YjE4LTk2OWMtOTg4Nzg0YWRkOWI0In0.xLES1xPN8OAeS-l2pHd3Pg6xt2xBbyL-VPHEZfIftP8",
  "access_expires_at": "2026-10-28T19:18:49.740008766Z",
  "refresh_token": "d9W6UW4yNUQspmzSop6ZLwROAj7d7XUAazfBsL5aZ50",
  "refresh_expires_at": "2026-10-29T07:03:49.739457264Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/06e64a3e-6fd3-44ce-a122-d946364f9a42` → **200**

```json
{
  "client": {
    "id": "06e64a3e-6fd3-44ce-a122-d946364f9a42",
    "phone": "+380630372081",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T19:03:39.455925Z",
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

`POST /api/admin/v1/clients/06e64a3e-6fd3-44ce-a122-d946364f9a42/phone/new-code` → **201**

```json
{
  "phone": "+380635849273"
}
```

```json
{
  "challenge_id": "d42aa639-1378-401a-93a3-f62002fe0262",
  "expires_at": "2026-10-28T19:08:50.358723371Z",
  "resend_available_at": "2026-10-28T19:03:51.358723371Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635849273` → **200**

```json
{
  "phone": "+380635849273",
  "audience": "CLIENT",
  "code": "728976",
  "sent_at": "2026-10-28T19:03:50.360923273Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/06e64a3e-6fd3-44ce-a122-d946364f9a42/phone` → **422**

```json
{
  "command_id": "01d0e16d-cc5f-4e0e-856e-674e75e1e265",
  "expected_version": 3,
  "new_challenge_id": "d42aa639-1378-401a-93a3-f62002fe0262",
  "new_code": "728977",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/06e64a3e-6fd3-44ce-a122-d946364f9a42/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "d38454b7-0ac5-4437-a614-54adb2c2a43f"
}
```

`POST /api/admin/v1/clients/06e64a3e-6fd3-44ce-a122-d946364f9a42/phone` → **400**

```json
{
  "command_id": "5a140c82-5d12-48ee-b854-89aef90ba9fd",
  "expected_version": 3,
  "new_challenge_id": "d42aa639-1378-401a-93a3-f62002fe0262",
  "new_code": "728976",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/06e64a3e-6fd3-44ce-a122-d946364f9a42/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e62a2d2c-925e-4986-a8c7-e54f2c4ea2f0",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/06e64a3e-6fd3-44ce-a122-d946364f9a42/phone` → **200**

```json
{
  "command_id": "f19db209-7227-49ee-b365-1083ee6e737c",
  "expected_version": 3,
  "new_challenge_id": "d42aa639-1378-401a-93a3-f62002fe0262",
  "new_code": "728976",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "06e64a3e-6fd3-44ce-a122-d946364f9a42",
  "phone": "+380635849273",
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
  "correlation_id": "b34b53e3-b91c-4626-8a41-d48cfbfb82e6"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635849273",
  "device_ref": "sandbox-10851"
}
```

```json
{
  "challenge_id": "e3e9c7da-5353-41ed-b638-ff8d2c2df695",
  "expires_at": "2026-10-28T19:08:51.893526644Z",
  "resend_available_at": "2026-10-28T19:03:52.893526644Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635849273` → **200**

```json
{
  "phone": "+380635849273",
  "audience": "CLIENT",
  "code": "340346",
  "sent_at": "2026-10-28T19:03:51.895895845Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3e9c7da-5353-41ed-b638-ff8d2c2df695",
  "code": "340346",
  "device_ref": "sandbox-10851"
}
```

```json
{
  "session_id": "342aef75-dfc8-4d40-98f7-58440b3bca39",
  "subject": {
    "type": "CLIENT",
    "id": "06e64a3e-6fd3-44ce-a122-d946364f9a42"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmU2NGEzZS02ZmQzLTQ0Y2UtYTEyMi1kOTQ2MzY0ZjlhNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MTMyLCJpYXQiOjE3OTMyMTQyMzIsImp0aSI6ImI3ZmZjYzkwLTc1MzEtNDE3Zi04MjZhLTNjOTI3NzQwMTIwMiIsInNpZCI6IjM0MmFlZjc1LWRmYzgtNGQ0MC05OGY3LTU4NDQwYjNiY2EzOSJ9.7IuwpHsd6lbX_cfmqAJixaxNDb3TcmwGdX6GUJF1piA",
  "access_expires_at": "2026-10-28T19:18:52.224880995Z",
  "refresh_token": "SJhC9tagRsqWcQpbu5OVIJSQgNPTAN3lk-gNUGwDCXY",
  "refresh_expires_at": "2026-11-27T19:03:52.224313448Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "06e64a3e-6fd3-44ce-a122-d946364f9a42",
  "session_id": "342aef75-dfc8-4d40-98f7-58440b3bca39",
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
  "phone": "+380636748232",
  "device_ref": "sandbox-20319"
}
```

```json
{
  "challenge_id": "999c3109-ebe7-4a50-b6fa-8d33272a6c97",
  "expires_at": "2026-10-28T19:08:52.812936054Z",
  "resend_available_at": "2026-10-28T19:03:53.812936054Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636748232` → **200**

```json
{
  "phone": "+380636748232",
  "audience": "CLIENT",
  "code": "513625",
  "sent_at": "2026-10-28T19:03:52.815284095Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "999c3109-ebe7-4a50-b6fa-8d33272a6c97",
  "code": "513625",
  "device_ref": "sandbox-20319"
}
```

```json
{
  "session_id": "b2b4e4fd-8e7e-47e0-b138-b1c20fca6d12",
  "subject": {
    "type": "CLIENT",
    "id": "c9fbaa01-3cc7-4f7b-bb1c-f233d8a6c1cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOWZiYWEwMS0zY2M3LTRmN2ItYmIxYy1mMjMzZDhhNmMxY2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MTMzLCJpYXQiOjE3OTMyMTQyMzMsImp0aSI6IjM3N2JlYzVkLTViN2QtNGNhZC04ZDU3LWEwYjBkMGQwNmQxMCIsInNpZCI6ImIyYjRlNGZkLThlN2UtNDdlMC1iMTM4LWIxYzIwZmNhNmQxMiJ9.RxcJPaFlKrng7RVdgpOMtplYwjgN3skfv2Ek0R_dhxg",
  "access_expires_at": "2026-10-28T19:18:53.14520326Z",
  "refresh_token": "sooZn1ONAohogVYOm5GtQ1v9Rh_NQMXfmAhvtAxwXu4",
  "refresh_expires_at": "2026-11-27T19:03:53.144672217Z",
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
  "session_id": "22d583ba-44dd-4871-b911-588597005a74",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxMzQsImlhdCI6MTc5MzIxNDIzNCwianRpIjoiNWI3YWY4MzAtMTAxMi00MjIzLTkzNzItYWI5ZDI1MWQzYjcwIiwic2lkIjoiMjJkNTgzYmEtNDRkZC00ODcxLWI5MTEtNTg4NTk3MDA1YTc0In0.WIOdBZkyVFV4IqR0onlxjkiiwAtAgkoCas5i2cckaA8",
  "access_expires_at": "2026-10-28T19:18:54.401950093Z",
  "refresh_token": "LY43XYWe5fyU2ijzBCm5aGHf0xN5niwyt5qgQuCwa18",
  "refresh_expires_at": "2026-10-29T07:03:54.401328727Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380636748232` → **200**

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
  "correlation_id": "91f2b884-588f-4ad1-b8e3-7a7385054200"
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
  "session_id": "2f7f5eaa-4ee9-4237-ad3b-b9bfcfbbf7d6",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxMzUsImlhdCI6MTc5MzIxNDIzNSwianRpIjoiNDE5NmFhZGEtYjJmMy00ZmVjLThlNDQtOTJmNTMxMmJiOTA2Iiwic2lkIjoiMmY3ZjVlYWEtNGVlOS00MjM3LWFkM2ItYjliZmNmYmJmN2Q2In0.ao7fG6EX_Z3qJsYu8PPz0POFat1NqtGPP2V9dmwZoLY",
  "access_expires_at": "2026-10-28T19:18:55.641126679Z",
  "refresh_token": "pS7n_FBxFu-9xGP5OazRddovSMd1kpJtSlSMuQYgacQ",
  "refresh_expires_at": "2026-10-29T07:03:55.640578471Z",
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
  "command_id": "62ee015b-512e-44aa-8e44-50e3572dce76",
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    }
  },
  "changed_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T19:03:56.260749247Z"
}
```

## The rider books the airport for 2026-10-28T22:03:55Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600589897",
  "device_ref": "sandbox-28830"
}
```

```json
{
  "challenge_id": "3b43fcb0-5ccf-4056-887d-e17488a1f518",
  "expires_at": "2026-10-28T19:08:56.565921053Z",
  "resend_available_at": "2026-10-28T19:03:57.565921053Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600589897` → **200**

```json
{
  "phone": "+48600589897",
  "audience": "CLIENT",
  "code": "627581",
  "sent_at": "2026-10-28T19:03:56.568559943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b43fcb0-5ccf-4056-887d-e17488a1f518",
  "code": "627581",
  "device_ref": "sandbox-28830"
}
```

```json
{
  "session_id": "40177c89-78a2-4cfc-b8c8-fb2f93688cda",
  "subject": {
    "type": "CLIENT",
    "id": "12fd1596-9ccb-47d3-89b6-5b58631794f3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMmZkMTU5Ni05Y2NiLTQ3ZDMtODliNi01YjU4NjMxNzk0ZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MTM2LCJpYXQiOjE3OTMyMTQyMzYsImp0aSI6ImViMTdkM2RhLTFlY2QtNDNhZS05ZmU3LTI0OWNmMDI5YTdiZSIsInNpZCI6IjQwMTc3Yzg5LTc4YTItNGNmYy1iOGM4LWZiMmY5MzY4OGNkYSJ9.IdFUQEICq3EscOQv_koJLnb-1DgbjroI4zRW_HJWtRY",
  "access_expires_at": "2026-10-28T19:18:56.895904527Z",
  "refresh_token": "_KOn7f-mLfEjIXQYolH4Yk_3480ZGiSHN8AaAzB0u7M",
  "refresh_expires_at": "2026-11-27T19:03:56.895345623Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "48422910-d312-473a-911e-cd6ab02c7398",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T22:03:55Z"
}
```

```json
{
  "id": "4820a3a6-8e0e-442a-9d48-c54e9c7f0b46",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:08:57.196292Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T22:03:55Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9760e0a3-ae5a-44fd-a581-dd66c0610f5a",
  "quote_id": "4820a3a6-8e0e-442a-9d48-c54e9c7f0b46",
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
  "pickup_at": "2026-10-28T22:03:55Z"
}
```

```json
{
  "id": "eef3d6a9-009c-4c76-8105-0cee78657b5c",
  "short_number": 22,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "12fd1596-9ccb-47d3-89b6-5b58631794f3",
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
  "created_at": "2026-10-28T19:03:57.5048Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T22:03:55Z",
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
  "device_ref": "sandbox-204"
}
```

```json
{
  "challenge_id": "51289844-815d-4e88-a0ca-2e767694701e",
  "expires_at": "2026-10-28T19:08:57.830802239Z",
  "resend_available_at": "2026-10-28T19:03:58.830802239Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "786529",
  "sent_at": "2026-10-28T19:03:57.833022972Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51289844-815d-4e88-a0ca-2e767694701e",
  "code": "786529",
  "device_ref": "sandbox-204"
}
```

```json
{
  "session_id": "aeb6f32d-70eb-4c90-bb33-93b69b28dd1d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTEzOCwiaWF0IjoxNzkzMjE0MjM4LCJqdGkiOiJhZDIyZTVmOS1jNzY5LTQ5NGYtOWY5Mi0zMWEyOGRkNzlhYmEiLCJzaWQiOiJhZWI2ZjMyZC03MGViLTRjOTAtYmIzMy05M2I2OWIyOGRkMWQifQ.lFYbJJ14W-XjX-JB_b9RDHfbRkqOHtU0na1xdoUUwrc",
  "access_expires_at": "2026-10-28T19:18:58.178722694Z",
  "refresh_token": "Drzp5GOaF8dP9v2X61yNkzSqD2_ccFSOuAcVi7w1nXc",
  "refresh_expires_at": "2026-11-27T19:03:58.178123636Z",
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
  "command_id": "546e22d0-b917-46e6-8fc7-063a7fb28d63",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:03:58Z",
    "sequence": 1793214238753
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4587b8bb-7ae2-47d6-b985-f5c4a2c97d7f",
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
  "last_heartbeat_at": "2026-10-28T19:03:58.775813Z",
  "last_location_at": "2026-10-28T19:03:58.775813Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "eef3d6a9-009c-4c76-8105-0cee78657b5c",
      "short_number": 22,
      "pickup_at": "2026-10-28T22:03:55Z",
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

`POST /api/driver/v1/preorders/eef3d6a9-009c-4c76-8105-0cee78657b5c/reserve` → **200**

```json
{
  "command_id": "50b3915b-d432-44d4-b9d6-cb04cbd6caf0"
}
```

```json
{
  "id": "bd874692-a5d2-41bd-848f-c03dd7c65f33",
  "state": "RESERVED",
  "order": {
    "order_id": "eef3d6a9-009c-4c76-8105-0cee78657b5c",
    "short_number": 22,
    "pickup_at": "2026-10-28T22:03:55Z",
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
  "reserved_at": "2026-10-28T19:03:59.379783Z",
  "confirm_from": "2026-10-28T21:33:55Z",
  "confirm_until": "2026-10-28T21:43:55Z",
  "drop_until": "2026-10-28T21:03:55Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "bd874692-a5d2-41bd-848f-c03dd7c65f33",
      "state": "RESERVED",
      "order": {
        "order_id": "eef3d6a9-009c-4c76-8105-0cee78657b5c",
        "short_number": 22,
        "pickup_at": "2026-10-28T22:03:55Z",
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
      "reserved_at": "2026-10-28T19:03:59.379783Z",
      "confirm_from": "2026-10-28T21:33:55Z",
      "confirm_until": "2026-10-28T21:43:55Z",
      "drop_until": "2026-10-28T21:03:55Z"
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
      "id": "bd874692-a5d2-41bd-848f-c03dd7c65f33",
      "state": "RESERVED",
      "order": {
        "order_id": "eef3d6a9-009c-4c76-8105-0cee78657b5c",
        "short_number": 22,
        "pickup_at": "2026-10-28T22:03:55Z",
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
      "reserved_at": "2026-10-28T19:03:59.379783Z",
      "confirm_from": "2026-10-28T21:33:55Z",
      "confirm_until": "2026-10-28T21:43:55Z",
      "drop_until": "2026-10-28T21:03:55Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/bd874692-a5d2-41bd-848f-c03dd7c65f33/confirm` → **409**

```json
{
  "command_id": "ee688288-ef74-44e4-a5fb-6aae4216186b"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/bd874692-a5d2-41bd-848f-c03dd7c65f33/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "826128e1-4934-4ed3-b669-805385dde216"
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
  "session_id": "ae4acb2a-0d9f-4780-97cf-7d00660d2522",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxNDAsImlhdCI6MTc5MzIxNDI0MCwianRpIjoiNDJjMmFhZjAtNmE3Mi00MGE0LWE2N2UtNjdmMDM2MmEyY2IzIiwic2lkIjoiYWU0YWNiMmEtMGQ5Zi00NzgwLTk3Y2YtN2QwMDY2MGQyNTIyIn0.AIJg41E6tRLUa4mEbFX57R9nVUBLzgC5J65cyLqu_Cc",
  "access_expires_at": "2026-10-28T19:19:00.90272868Z",
  "refresh_token": "Jj7UsAatwDzsiUFqJLqmxqQInQmi6DE9PvdwrufeD8U",
  "refresh_expires_at": "2026-10-29T07:04:00.90217246Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/eef3d6a9-009c-4c76-8105-0cee78657b5c` → **200**

```json
{
  "id": "eef3d6a9-009c-4c76-8105-0cee78657b5c",
  "short_number": 22,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "12fd1596-9ccb-47d3-89b6-5b58631794f3",
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
  "created_at": "2026-10-28T19:03:57.5048Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T22:03:55Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "bd874692-a5d2-41bd-848f-c03dd7c65f33",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T19:03:59.379783Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/eef3d6a9-009c-4c76-8105-0cee78657b5c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T19:03:57.50605Z",
      "actor": {
        "type": "CLIENT",
        "id": "12fd1596-9ccb-47d3-89b6-5b58631794f3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "eef3d6a9-009c-4c76-8105-0cee78657b5c",
        "preorder": true,
        "quote_id": "4820a3a6-8e0e-442a-9d48-c54e9c7f0b46",
        "pickup_at": "2026-10-28T22:03:55Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "34e18834-da21-4cf0-8bc4-8ab568558ba4"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T19:03:59.381084Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "eef3d6a9-009c-4c76-8105-0cee78657b5c",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "bd874692-a5d2-41bd-848f-c03dd7c65f33"
      },
      "correlation_id": "061b8e2d-297c-4d17-ba80-e73cb1fb3ce7"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order eef3d6a9-009c-4c76-8105-0cee78657b5c, reservation bd874692-a5d2-41bd-848f-c03dd7c65f33.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27207"
}
```

```json
{
  "challenge_id": "4e323649-087c-4833-8087-a8508cfd29ea",
  "expires_at": "2026-10-28T19:09:01.837617519Z",
  "resend_available_at": "2026-10-28T19:04:02.837617519Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "858667",
  "sent_at": "2026-10-28T19:04:01.84016232Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e323649-087c-4833-8087-a8508cfd29ea",
  "code": "858667",
  "device_ref": "sandbox-27207"
}
```

```json
{
  "session_id": "067d3edd-f214-49b0-ae26-8214b1017b8f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTE0MiwiaWF0IjoxNzkzMjE0MjQyLCJqdGkiOiIyYzYwODNiMy00ZDJjLTQzMmItYTc1NC0yMzMzODY5NDVlNWQiLCJzaWQiOiIwNjdkM2VkZC1mMjE0LTQ5YjAtYWUyNi04MjE0YjEwMTdiOGYifQ.BwU2nDDSY4qdrrzaCuTwMCFH9tHjSCW_Tr8Wt8-uS9o",
  "access_expires_at": "2026-10-28T19:19:02.168482203Z",
  "refresh_token": "jWAhaCGpORnu3MKvScl6kB7blmYNUtYH4kOe2aGBVIE",
  "refresh_expires_at": "2026-11-27T19:04:02.167943379Z",
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
  "command_id": "ebbb4a1a-9eef-4f71-99ca-292a6b2906e1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:04:02Z",
    "sequence": 1793214242757
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "614eb530-7bd0-46fb-8855-48f6a713c683",
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
  "last_heartbeat_at": "2026-10-28T19:04:02.778044Z",
  "last_location_at": "2026-10-28T19:04:02.778044Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673511138",
  "device_ref": "sandbox-12806"
}
```

```json
{
  "challenge_id": "df73bdf8-8ee2-4da3-914e-381be411eafa",
  "expires_at": "2026-10-28T19:09:03.079440543Z",
  "resend_available_at": "2026-10-28T19:04:04.079440543Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673511138` → **200**

```json
{
  "phone": "+380673511138",
  "audience": "CLIENT",
  "code": "612447",
  "sent_at": "2026-10-28T19:04:03.082194528Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df73bdf8-8ee2-4da3-914e-381be411eafa",
  "code": "612447",
  "device_ref": "sandbox-12806"
}
```

```json
{
  "session_id": "54596a57-e815-4d1a-aafb-9ac44cad9db7",
  "subject": {
    "type": "CLIENT",
    "id": "cc11ab6b-185f-40e5-b717-4c89a4b80b4a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYzExYWI2Yi0xODVmLTQwZTUtYjcxNy00Yzg5YTRiODBiNGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MTQzLCJpYXQiOjE3OTMyMTQyNDMsImp0aSI6ImExMGQ5ZGFhLTkwMmEtNGRjOS05MjQ2LTQwYjljZDZlODYxOCIsInNpZCI6IjU0NTk2YTU3LWU4MTUtNGQxYS1hYWZiLTlhYzQ0Y2FkOWRiNyJ9.cgFPulIqiiPQBl2caa03sL2LTtUniWjBEAUaq3Jf5rw",
  "access_expires_at": "2026-10-28T19:19:03.404991774Z",
  "refresh_token": "g2N_RAj_Ovi0WkMGMCoLjuOQkhOG2xuHzAzEz-OYMI4",
  "refresh_expires_at": "2026-11-27T19:04:03.404409015Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8820a8dc-5024-430b-bfbb-36f469e432df",
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
  "id": "dabb8890-40ad-4f65-8d7d-1be80e6e0838",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:09:03.706343Z",
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
  "command_id": "0bc7436b-4575-47a9-8143-fa1b27390875",
  "quote_id": "dabb8890-40ad-4f65-8d7d-1be80e6e0838",
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
  "id": "f2b93cfa-9a05-43a8-8f19-571baa9b610f",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cc11ab6b-185f-40e5-b717-4c89a4b80b4a",
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
  "created_at": "2026-10-28T19:04:04.020626Z",
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
    "id": "57683ff7-1c61-43e8-bc16-c9b9ba22306f",
    "order_id": "f2b93cfa-9a05-43a8-8f19-571baa9b610f",
    "expires_at": "2026-10-28T19:04:19.023486Z",
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

`POST /api/driver/v1/offers/57683ff7-1c61-43e8-bc16-c9b9ba22306f/accept` → **200**

```json
{
  "command_id": "ff70f7de-e273-4708-a723-eb339e0a6797"
}
```

```json
{
  "id": "fdcf1281-0e76-4643-ad22-354031773f26",
  "order_id": "f2b93cfa-9a05-43a8-8f19-571baa9b610f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d7e82122-bebd-4653-8ac5-0781368a0e8c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d7e82122-bebd-4653-8ac5-0781368a0e8c",
  "order_id": "f2b93cfa-9a05-43a8-8f19-571baa9b610f",
  "assignment_id": "fdcf1281-0e76-4643-ad22-354031773f26",
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

`POST /api/driver/v1/work-sessions/614eb530-7bd0-46fb-8855-48f6a713c683/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:04:05Z",
    "sequence": 1793214245223
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "614eb530-7bd0-46fb-8855-48f6a713c683",
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
  "last_heartbeat_at": "2026-10-28T19:04:05.244932Z",
  "last_location_at": "2026-10-28T19:04:05.244932Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d7e82122-bebd-4653-8ac5-0781368a0e8c",
  "order_id": "f2b93cfa-9a05-43a8-8f19-571baa9b610f",
  "assignment_id": "fdcf1281-0e76-4643-ad22-354031773f26",
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

`POST /api/driver/v1/trips/d7e82122-bebd-4653-8ac5-0781368a0e8c/arrive` → **200**

```json
{
  "command_id": "e041844a-eb89-4caa-8283-a966b0ca6822",
  "expected_version": 0
}
```

```json
{
  "id": "d7e82122-bebd-4653-8ac5-0781368a0e8c",
  "order_id": "f2b93cfa-9a05-43a8-8f19-571baa9b610f",
  "assignment_id": "fdcf1281-0e76-4643-ad22-354031773f26",
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
  "arrived_at": "2026-10-28T19:04:05.838556Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d7e82122-bebd-4653-8ac5-0781368a0e8c/start` → **200**

```json
{
  "command_id": "99fd26e0-c311-4a3a-a5f1-30e244d40e20",
  "expected_version": 1
}
```

```json
{
  "id": "d7e82122-bebd-4653-8ac5-0781368a0e8c",
  "order_id": "f2b93cfa-9a05-43a8-8f19-571baa9b610f",
  "assignment_id": "fdcf1281-0e76-4643-ad22-354031773f26",
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
  "arrived_at": "2026-10-28T19:04:05.838556Z",
  "started_at": "2026-10-28T19:04:06.146978Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/614eb530-7bd0-46fb-8855-48f6a713c683/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:04:06Z",
    "sequence": 1793214246450
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "614eb530-7bd0-46fb-8855-48f6a713c683",
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
  "last_heartbeat_at": "2026-10-28T19:04:06.472278Z",
  "last_location_at": "2026-10-28T19:04:06.472278Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/d7e82122-bebd-4653-8ac5-0781368a0e8c/complete` → **200**

```json
{
  "command_id": "51f297aa-53b9-4f38-972d-9aa463686f42",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:04:06Z",
  "cash_received": true
}
```

```json
{
  "id": "d7e82122-bebd-4653-8ac5-0781368a0e8c",
  "order_id": "f2b93cfa-9a05-43a8-8f19-571baa9b610f",
  "assignment_id": "fdcf1281-0e76-4643-ad22-354031773f26",
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
  "arrived_at": "2026-10-28T19:04:05.838556Z",
  "started_at": "2026-10-28T19:04:06.146978Z",
  "completed_at": "2026-10-28T19:04:06.771271Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/f2b93cfa-9a05-43a8-8f19-571baa9b610f/rating` → **200**

```json
{
  "command_id": "3b1218f6-c20c-439b-9a79-af21191e9f01",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "f2b93cfa-9a05-43a8-8f19-571baa9b610f",
  "score": 5,
  "created_at": "2026-10-28T19:04:07.098901025Z"
}
```

`POST /api/driver/v1/orders/f2b93cfa-9a05-43a8-8f19-571baa9b610f/rating` → **200**

```json
{
  "command_id": "b3146e66-a6a3-429c-8643-7a54fcc45f74",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "f2b93cfa-9a05-43a8-8f19-571baa9b610f",
  "score": 4,
  "created_at": "2026-10-28T19:04:07.399033925Z"
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
  "session_id": "11f96cfd-2a25-4054-be74-0e3be6bebce6",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxNDgsImlhdCI6MTc5MzIxNDI0OCwianRpIjoiZjczODkzNWItYTEzZi00MDEzLThkODYtNmU0OTFmZWViMmM3Iiwic2lkIjoiMTFmOTZjZmQtMmEyNS00MDU0LWJlNzQtMGUzYmU2YmViY2U2In0.6u7i48H8tsBWHe42zOaH3HSMT-cYEy26CWBZ6orQ3cg",
  "access_expires_at": "2026-10-28T19:19:08.340518747Z",
  "refresh_token": "JD8_NB1uffpDPIGiV8S2K0wJT6AssaCH2WkYsDvu_T4",
  "refresh_expires_at": "2026-10-29T07:04:08.339980754Z",
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
  "session_id": "8c838099-261e-4824-a1f8-831369ee9c12",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxNDgsImlhdCI6MTc5MzIxNDI0OCwianRpIjoiOTA3YTRlODktNzA5MS00NWY1LTgwMzQtYjRjOTNjM2Q0YWFjIiwic2lkIjoiOGM4MzgwOTktMjYxZS00ODI0LWExZjgtODMxMzY5ZWU5YzEyIn0.G4wafGh4YFUU_uUr6Bbx9L-fwpaFGAod4aEfSPNPC9Q",
  "access_expires_at": "2026-10-28T19:19:08.968267516Z",
  "refresh_token": "z0hBnuByjhwgDW5iUNsxA82rCpnXEbKLpE_durUhAjM",
  "refresh_expires_at": "2026-10-29T07:04:08.967668062Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f2b93cfa-9a05-43a8-8f19-571baa9b610f/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "f2b93cfa-9a05-43a8-8f19-571baa9b610f",
      "author_type": "RIDER",
      "author_id": "cc11ab6b-185f-40e5-b717-4c89a4b80b4a",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T19:04:07.098901Z"
    },
    {
      "order_id": "f2b93cfa-9a05-43a8-8f19-571baa9b610f",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "cc11ab6b-185f-40e5-b717-4c89a4b80b4a",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T19:04:07.399034Z"
    }
  ]
}
```

Done: ratings for order f2b93cfa-9a05-43a8-8f19-571baa9b610f.

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
  "session_id": "e6be3bf3-a2a4-4acf-a1f7-441e8611829e",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxNDksImlhdCI6MTc5MzIxNDI0OSwianRpIjoiMzQwNzdjZWEtM2JlYi00MmE2LWI2MWUtZTY4ZDg2ZWRhNmQ1Iiwic2lkIjoiZTZiZTNiZjMtYTJhNC00YWNmLWExZjctNDQxZTg2MTE4MjllIn0.lvFERl_wqHiWs7LWW3W629AwaD1LNfaAgbvhL4XlAro",
  "access_expires_at": "2026-10-28T19:19:09.915647314Z",
  "refresh_token": "FFLzpapWyJOI2yp1KuQaNd8dar3aGxVj07ZUxaTB_Vc",
  "refresh_expires_at": "2026-10-29T07:04:09.915125574Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "db527811-2d8c-47e2-ba9a-237048c6e0e1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "265548ef-cc1d-4400-bf90-165115393d47",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:04:10.217466Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/265548ef-cc1d-4400-bf90-165115393d47` → **200**

```json
{
  "id": "265548ef-cc1d-4400-bf90-165115393d47",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:04:10.217466Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/265548ef-cc1d-4400-bf90-165115393d47` → **200**

```json
{
  "id": "265548ef-cc1d-4400-bf90-165115393d47",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:04:10.217466Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/265548ef-cc1d-4400-bf90-165115393d47` → **200**

```json
{
  "id": "265548ef-cc1d-4400-bf90-165115393d47",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T19:04:10.217466Z",
  "ready_at": "2026-10-28T19:04:12.162741Z",
  "expires_at": "2026-10-29T19:04:12.162741Z"
}
```

`GET /api/admin/v1/reports/exports/265548ef-cc1d-4400-bf90-165115393d47/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,22,9,13,0,0,17,5,0,20,1,0,1,7,1,5
total,22,9,13,0,0,17,5,0,20,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "215fb414-d937-4ed0-b3f3-8be803c08c58",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "1c70e4b2-411a-4595-98f6-d1c28e2a9a53",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:04:13.447846Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1c70e4b2-411a-4595-98f6-d1c28e2a9a53` → **200**

```json
{
  "id": "1c70e4b2-411a-4595-98f6-d1c28e2a9a53",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:04:13.447846Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1c70e4b2-411a-4595-98f6-d1c28e2a9a53` → **200**

```json
{
  "id": "1c70e4b2-411a-4595-98f6-d1c28e2a9a53",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:04:13.447846Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1c70e4b2-411a-4595-98f6-d1c28e2a9a53` → **200**

```json
{
  "id": "1c70e4b2-411a-4595-98f6-d1c28e2a9a53",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:04:13.447846Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1c70e4b2-411a-4595-98f6-d1c28e2a9a53` → **200**

```json
{
  "id": "1c70e4b2-411a-4595-98f6-d1c28e2a9a53",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T19:04:13.447846Z",
  "ready_at": "2026-10-28T19:04:17.171088Z",
  "expires_at": "2026-10-29T19:04:17.171088Z"
}
```

`GET /api/admin/v1/reports/exports/1c70e4b2-411a-4595-98f6-d1c28e2a9a53/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,9,1282.20,130.74,192.36,1089.84,10.52,0.00,162.97,182.97,689.83,50.00,105.17
total,UAH,9,1282.20,130.74,192.36,1089.84,10.52,0.00,162.97,182.97,689.83,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/3864139e-0a3e-4613-a78b-d121d04da2d2` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/3864139e-0a3e-4613-a78b-d121d04da2d2",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f9b17454-91f3-4b44-885e-fa2a181b0b60"
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
  "device_ref": "sandbox-31423"
}
```

```json
{
  "challenge_id": "9755649a-a779-4350-a5d5-52897ba39a04",
  "expires_at": "2026-10-28T19:09:18.245323818Z",
  "resend_available_at": "2026-10-28T19:04:19.245323818Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "287201",
  "sent_at": "2026-10-28T19:04:18.248283691Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9755649a-a779-4350-a5d5-52897ba39a04",
  "code": "287201",
  "device_ref": "sandbox-31423"
}
```

```json
{
  "session_id": "40425f9e-bee3-4d3d-a46e-a110c1a9bcbd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTE1OCwiaWF0IjoxNzkzMjE0MjU4LCJqdGkiOiI5NGQyMzc2Yy01OWZhLTRiMmQtYTUwZi01MDdjNzRhODU4Y2EiLCJzaWQiOiI0MDQyNWY5ZS1iZWUzLTRkM2QtYTQ2ZS1hMTEwYzFhOWJjYmQifQ.BW3-Ivyq297g4eRyM59XYzuDhSmZ3EM727VmMq0nuNw",
  "access_expires_at": "2026-10-28T19:19:18.587883005Z",
  "refresh_token": "VDFh86ShTzXu2Ve2xVF1lvkEUD73FS-H8KX0PEI_uM0",
  "refresh_expires_at": "2026-11-27T19:04:18.587314627Z",
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
  "command_id": "911189ae-53d2-47da-9998-6a8c03444a08",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:04:19Z",
    "sequence": 1793214259440
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0d0c3d90-78f9-4d53-9f94-ab272ad3af42",
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
  "last_heartbeat_at": "2026-10-28T19:04:19.460749Z",
  "last_location_at": "2026-10-28T19:04:19.460749Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "96c88f57-c52c-454b-afaf-fbcbc9635106",
  "points": [
    {
      "sequence": 1793214261762,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T19:03:21Z"
    },
    {
      "sequence": 1793214261772,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T19:04:21Z"
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
  "session_id": "4a14f02a-0b71-4f2c-9f65-f8ba13d64519",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxNjIsImlhdCI6MTc5MzIxNDI2MiwianRpIjoiMmU4ZmIyMmQtZmYyNC00ZGZhLTgwNzctMzliOTYyYmY2NzNiIiwic2lkIjoiNGExNGYwMmEtMGI3MS00ZjJjLTlmNjUtZjhiYTEzZDY0NTE5In0.sEm3wW4NACvK2zzWh7fGOjcsk7r-qAqkdGn1jPgnB8Q",
  "access_expires_at": "2026-10-28T19:19:22.517105729Z",
  "refresh_token": "YZZfCfYkXHhyjMfCO-T3q8CCUPsBAUg2GIwpYJbv5bU",
  "refresh_expires_at": "2026-10-29T07:04:22.516443422Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "135416d5-eb09-4617-a86a-aad549f0fa0c",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T19:04:21Z",
        "track_point_id": "2fa85ba9-d735-4076-928d-d67758f6733f",
        "work_session_id": "0d0c3d90-78f9-4d53-9f94-ab272ad3af42"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T19:04:21Z",
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

`POST /api/admin/v1/driver-risk-flags/135416d5-eb09-4617-a86a-aad549f0fa0c/confirm` → **200**

```json
{
  "command_id": "75762266-37c8-4d9f-b98b-42f6772cb05d",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "135416d5-eb09-4617-a86a-aad549f0fa0c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T19:04:21Z",
    "track_point_id": "2fa85ba9-d735-4076-928d-d67758f6733f",
    "work_session_id": "0d0c3d90-78f9-4d53-9f94-ab272ad3af42"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T19:04:21Z",
  "reason": null,
  "reviewed_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "reviewed_at": "2026-10-28T19:04:23.480751Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/135416d5-eb09-4617-a86a-aad549f0fa0c/dismiss` → **409**

```json
{
  "command_id": "5c035d7b-69d9-4825-8b99-f12561f2f20e",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/135416d5-eb09-4617-a86a-aad549f0fa0c/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "34acc2f7-0b6f-41b6-94d4-d5345bef1f23"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "c19be442-838f-4cb9-a2de-73747a3a57db",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "26c5146c-3560-4cf9-9840-7ddda86e39b7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "raised_at": "2026-10-28T19:04:24.103963Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/26c5146c-3560-4cf9-9840-7ddda86e39b7/dismiss` → **200**

```json
{
  "command_id": "05fbab03-4fc0-4e36-8680-13c907f7c87d",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "26c5146c-3560-4cf9-9840-7ddda86e39b7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "raised_at": "2026-10-28T19:04:24.103963Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "reviewed_at": "2026-10-28T19:04:24.436609Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "ad266ec7-e5bf-4011-a7c1-a2fe6787dc49",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "135416d5-eb09-4617-a86a-aad549f0fa0c"
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
      "actor_id": "716e1551-e1ad-4619-8d26-a6521c301975",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T19:04:24.764713Z"
    }
  ]
}
```

Done: flag 135416d5-eb09-4617-a86a-aad549f0fa0c confirmed, suspension named it, driver reinstated.

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
  "session_id": "d96669d5-cd06-45b3-ac54-86480be42250",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxNjUsImlhdCI6MTc5MzIxNDI2NSwianRpIjoiNGExYmRkZWQtMDY0Ni00NTU3LThjNjQtMTM2ZDgzOWZmYjI0Iiwic2lkIjoiZDk2NjY5ZDUtY2QwNi00NWIzLWFjNTQtODY0ODBiZTQyMjUwIn0.qdK_adTzFr5BFH6I_yi4V9Q_XzABpbNTW8oHvubH_P8",
  "access_expires_at": "2026-10-28T19:19:25.709500389Z",
  "refresh_token": "QpP1Bp-07nc3taFwvfbmpz4MdIQhusbErYIlDTvDl-Y",
  "refresh_expires_at": "2026-10-29T07:04:25.708671297Z",
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
      "actor_id": "716e1551-e1ad-4619-8d26-a6521c301975",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T19:04:24.764713Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "fd436c36-8126-4737-8e45-57f547dc169e",
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
  "session_id": "0d0c3d90-78f9-4d53-9f94-ab272ad3af42",
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
  "last_heartbeat_at": "2026-10-28T19:04:19.460749Z",
  "last_location_at": "2026-10-28T19:04:19.460749Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0d0c3d90-78f9-4d53-9f94-ab272ad3af42/close` → **200**

```json
{
  "command_id": "060b216d-0f4b-4c47-9140-3d35883ac7b4",
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
  "session_id": "85218053-8f82-406a-9cf2-cd6597f72022",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxNjcsImlhdCI6MTc5MzIxNDI2NywianRpIjoiZTU4MGMxMzAtNTYyMy00NzEzLTgyZDMtMjhiNGMyODI5NjQ4Iiwic2lkIjoiODUyMTgwNTMtOGY4Mi00MDZhLTljZjItY2Q2NTk3ZjcyMDIyIn0.Q641AYdFYZlaDkT88asEEj6Vi2WFLwbiANsuzUFdOkk",
  "access_expires_at": "2026-10-28T19:19:27.570428516Z",
  "refresh_token": "SGruBZNg73TvANbF7BsyqDYqAQVaao6F3JyLV3P1rqE",
  "refresh_expires_at": "2026-10-29T07:04:27.569871846Z",
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
  "command_id": "b9a4acec-f4ef-4ee0-b133-f8e6f4924770",
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
  "changed_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T19:04:28.194597Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "b9a4acec-f4ef-4ee0-b133-f8e6f4924770",
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
  "changed_by": "716e1551-e1ad-4619-8d26-a6521c301975",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T19:04:28.194597Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48276066492",
  "device_ref": "sandbox-21037"
}
```

```json
{
  "challenge_id": "267530dc-8605-4c47-bdb4-f526ea7763c4",
  "expires_at": "2026-10-28T19:09:28.812456055Z",
  "resend_available_at": "2026-10-28T19:04:29.812456055Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48276066492` → **200**

```json
{
  "phone": "+48276066492",
  "audience": "CLIENT",
  "code": "218287",
  "sent_at": "2026-10-28T19:04:28.815403618Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "267530dc-8605-4c47-bdb4-f526ea7763c4",
  "code": "218287",
  "device_ref": "sandbox-21037"
}
```

```json
{
  "session_id": "c53f5a5e-a621-4b1d-bbb0-5ef669453324",
  "subject": {
    "type": "CLIENT",
    "id": "170da0b1-275d-4e0e-8311-4fae034d0252"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzBkYTBiMS0yNzVkLTRlMGUtODMxMS00ZmFlMDM0ZDAyNTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MTY5LCJpYXQiOjE3OTMyMTQyNjksImp0aSI6IjkxODZiY2Q5LTNkNzMtNGNlYy1iNzY2LWVhM2M4NjA2NGQ5YiIsInNpZCI6ImM1M2Y1YTVlLWE2MjEtNGIxZC1iYmIwLTVlZjY2OTQ1MzMyNCJ9.GAD3im6e2uhzrvVwMZi2nxRux6KvkyZkrdsE3kgD45Q",
  "access_expires_at": "2026-10-28T19:19:29.135054764Z",
  "refresh_token": "UPBEJODrILXbFCAagfDXF4ct7CFIzici1ixGNqOiUJo",
  "refresh_expires_at": "2026-11-27T19:04:29.134511364Z",
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
  "correlation_id": "2c3a8185-c508-4d43-9be2-07bcd22c1986"
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
  "device_ref": "sandbox-2120"
}
```

```json
{
  "challenge_id": "98aa59be-430a-459c-8c0b-c9a058e78e5a",
  "expires_at": "2026-10-28T19:09:30.009809845Z",
  "resend_available_at": "2026-10-28T19:04:31.009809845Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "547792",
  "sent_at": "2026-10-28T19:04:30.01220882Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98aa59be-430a-459c-8c0b-c9a058e78e5a",
  "code": "547792",
  "device_ref": "sandbox-2120"
}
```

```json
{
  "session_id": "746a79ec-729d-4fe8-a1c0-781d6b12f6b9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTE3MCwiaWF0IjoxNzkzMjE0MjcwLCJqdGkiOiI0M2VlYjAxOC1hODg5LTQwYzktOTYxYS1hYzZmMWY1ZTk2OWQiLCJzaWQiOiI3NDZhNzllYy03MjlkLTRmZTgtYTFjMC03ODFkNmIxMmY2YjkifQ.25ay3v9QRXyv9Scs1OtZdI-wJSHU-MtSgZWcB9EpmEU",
  "access_expires_at": "2026-10-28T19:19:30.347372094Z",
  "refresh_token": "ZPIZWZFP673DxusYV8l95_b-MACQsedR9_hg2W2-4FE",
  "refresh_expires_at": "2026-11-27T19:04:30.346727024Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4587b8bb-7ae2-47d6-b985-f5c4a2c97d7f",
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
  "last_heartbeat_at": "2026-10-28T19:03:58.775813Z",
  "last_location_at": "2026-10-28T19:03:58.775813Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4587b8bb-7ae2-47d6-b985-f5c4a2c97d7f/handover` → **200**

```json
{
  "command_id": "88956183-9dd0-467b-acf6-41b0cdfd7a22",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4587b8bb-7ae2-47d6-b985-f5c4a2c97d7f",
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
  "last_heartbeat_at": "2026-10-28T19:03:58.775813Z",
  "last_location_at": "2026-10-28T19:03:58.775813Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4587b8bb-7ae2-47d6-b985-f5c4a2c97d7f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:04:31Z",
    "sequence": 1793214271244
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4587b8bb-7ae2-47d6-b985-f5c4a2c97d7f",
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
  "last_heartbeat_at": "2026-10-28T19:04:31.265992Z",
  "last_location_at": "2026-10-28T19:04:31.265992Z",
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
  "session_id": "4587b8bb-7ae2-47d6-b985-f5c4a2c97d7f",
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
  "last_heartbeat_at": "2026-10-28T19:04:31.265992Z",
  "last_location_at": "2026-10-28T19:04:31.265992Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4587b8bb-7ae2-47d6-b985-f5c4a2c97d7f/close` → **200**

```json
{
  "command_id": "470aafd7-2309-49b7-a1e6-26b04e8818a8",
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
  "correlation_id": "118b0a50-dd7b-485f-8e8e-e1da32d82a27"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671455556",
  "device_ref": "sandbox-22724"
}
```

```json
{
  "challenge_id": "756a0fb4-f323-481a-858a-927e22183ba2",
  "expires_at": "2026-10-28T19:09:32.765420018Z",
  "resend_available_at": "2026-10-28T19:04:33.765420018Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671455556` → **200**

```json
{
  "phone": "+380671455556",
  "audience": "CLIENT",
  "code": "213598",
  "sent_at": "2026-10-28T19:04:32.767891575Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "756a0fb4-f323-481a-858a-927e22183ba2",
  "code": "213598",
  "device_ref": "sandbox-22724"
}
```

```json
{
  "session_id": "842d1f46-10bd-48f9-ab32-fe9885a11031",
  "subject": {
    "type": "CLIENT",
    "id": "c869a985-5ccb-401f-81bb-368acb1408d5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODY5YTk4NS01Y2NiLTQwMWYtODFiYi0zNjhhY2IxNDA4ZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MTczLCJpYXQiOjE3OTMyMTQyNzMsImp0aSI6ImJhODhmY2UwLTg2NTctNGFhMC05YThlLWU0OTI5NDA1OWJjNSIsInNpZCI6Ijg0MmQxZjQ2LTEwYmQtNDhmOS1hYjMyLWZlOTg4NWExMTAzMSJ9.NqPDl7Z30Gu5XTh_LJMfrWfiNCEh801bWJRFwZPYH2g",
  "access_expires_at": "2026-10-28T19:19:33.109520882Z",
  "refresh_token": "mrR5mAuzqCqaKTdyLxHac_1toVwf_zffyX2PfAWdtUM",
  "refresh_expires_at": "2026-11-27T19:04:33.108199345Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "47d635a2-22eb-4331-b595-522892bb9692",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "daec11b7-29c4-46f9-bf1d-090ee04af48b",
  "upload_path": "/api/rider/v1/uploads/daec11b7-29c4-46f9-bf1d-090ee04af48b",
  "expires_at": "2026-10-28T19:19:33.441042265Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/daec11b7-29c4-46f9-bf1d-090ee04af48b` → **200**

```json
{
  "file_id": "daec11b7-29c4-46f9-bf1d-090ee04af48b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "fabe7440-3842-4a4c-9518-1bd31596c85d",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "daec11b7-29c4-46f9-bf1d-090ee04af48b"
  ]
}
```

```json
{
  "id": "8a5f5ed1-ba8d-437c-94c4-75fd5223f873",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c869a985-5ccb-401f-81bb-368acb1408d5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T19:04:33.806399Z",
  "updated_at": "2026-10-28T19:04:33.806399Z",
  "respond_by": "2026-10-28T23:04:33.806399Z",
  "messages": [
    {
      "id": "2d56663d-c400-4ada-8aec-8992722131f5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c869a985-5ccb-401f-81bb-368acb1408d5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:04:33.807944Z",
      "attachments": [
        {
          "file_id": "daec11b7-29c4-46f9-bf1d-090ee04af48b",
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
  "session_id": "eb232bdb-6699-41f7-986a-d1d015e3dcee",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxNzQsImlhdCI6MTc5MzIxNDI3NCwianRpIjoiMTU1N2I4NzYtNjViZC00ZmJkLThlNDEtZTdkMGM5N2NkMWY4Iiwic2lkIjoiZWIyMzJiZGItNjY5OS00MWY3LTk4NmEtZDFkMDE1ZTNkY2VlIn0.nMp85dmcgGJGKHRq_1KXpAGXv28tsVUaAL2mElnFJPo",
  "access_expires_at": "2026-10-28T19:19:34.481216043Z",
  "refresh_token": "umLu_g-JJRJx3-Sje01F69ZiPc9ax-_VQCFSJvRKy_c",
  "refresh_expires_at": "2026-10-29T07:04:34.48069893Z",
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
  "session_id": "5460039b-70a6-47ab-a7d5-2107fa44a424",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxNzUsImlhdCI6MTc5MzIxNDI3NSwianRpIjoiMWFlYzVlOTctYmU1NS00MzdjLTllZTMtYjVlZTg1ODRmNGE3Iiwic2lkIjoiNTQ2MDAzOWItNzBhNi00N2FiLWE3ZDUtMjEwN2ZhNDRhNDI0In0.G7Vcc6WZFNXenxDZsp7zHf682E07G3_d-_33HirmKxw",
  "access_expires_at": "2026-10-28T19:19:35.108636908Z",
  "refresh_token": "l-t2TE21Iocy23URH7I3XsgBkxDHQfMaAqi3ApJA1TM",
  "refresh_expires_at": "2026-10-29T07:04:35.108058486Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/8a5f5ed1-ba8d-437c-94c4-75fd5223f873/attachments/daec11b7-29c4-46f9-bf1d-090ee04af48b` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "2818dda0-2b0e-4468-bb64-37ed5d00ba3f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "4ea528b2-eb44-48e2-8a0e-a0c1a72985ba",
  "upload_path": "/api/operator/v1/uploads/4ea528b2-eb44-48e2-8a0e-a0c1a72985ba",
  "expires_at": "2026-10-28T19:19:35.431727823Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/4ea528b2-eb44-48e2-8a0e-a0c1a72985ba` → **200**

```json
{
  "file_id": "4ea528b2-eb44-48e2-8a0e-a0c1a72985ba",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/8a5f5ed1-ba8d-437c-94c4-75fd5223f873` → **200**

```json
{
  "id": "8a5f5ed1-ba8d-437c-94c4-75fd5223f873",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c869a985-5ccb-401f-81bb-368acb1408d5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T19:04:33.806399Z",
  "updated_at": "2026-10-28T19:04:33.806399Z",
  "respond_by": "2026-10-28T23:04:33.806399Z",
  "messages": [
    {
      "id": "2d56663d-c400-4ada-8aec-8992722131f5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c869a985-5ccb-401f-81bb-368acb1408d5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:04:33.807944Z",
      "attachments": [
        {
          "file_id": "daec11b7-29c4-46f9-bf1d-090ee04af48b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/8a5f5ed1-ba8d-437c-94c4-75fd5223f873/comments` → **200**

```json
{
  "command_id": "a5d92d04-3b76-42d9-a788-6be7a502baa4",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "4ea528b2-eb44-48e2-8a0e-a0c1a72985ba"
  ]
}
```

```json
{
  "id": "8a5f5ed1-ba8d-437c-94c4-75fd5223f873",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c869a985-5ccb-401f-81bb-368acb1408d5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T19:04:33.806399Z",
  "updated_at": "2026-10-28T19:04:36.075313Z",
  "respond_by": "2026-10-28T23:04:33.806399Z",
  "messages": [
    {
      "id": "2d56663d-c400-4ada-8aec-8992722131f5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c869a985-5ccb-401f-81bb-368acb1408d5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:04:33.807944Z",
      "attachments": [
        {
          "file_id": "daec11b7-29c4-46f9-bf1d-090ee04af48b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "8ae54482-da26-4e66-a3df-9c20bc25cc77",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "716e1551-e1ad-4619-8d26-a6521c301975",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T19:04:36.074774Z",
      "attachments": [
        {
          "file_id": "4ea528b2-eb44-48e2-8a0e-a0c1a72985ba",
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

`GET /api/rider/v1/support/cases/8a5f5ed1-ba8d-437c-94c4-75fd5223f873` → **200**

```json
{
  "id": "8a5f5ed1-ba8d-437c-94c4-75fd5223f873",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c869a985-5ccb-401f-81bb-368acb1408d5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T19:04:33.806399Z",
  "updated_at": "2026-10-28T19:04:36.075313Z",
  "respond_by": "2026-10-28T23:04:33.806399Z",
  "messages": [
    {
      "id": "2d56663d-c400-4ada-8aec-8992722131f5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c869a985-5ccb-401f-81bb-368acb1408d5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:04:33.807944Z",
      "attachments": [
        {
          "file_id": "daec11b7-29c4-46f9-bf1d-090ee04af48b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "8ae54482-da26-4e66-a3df-9c20bc25cc77",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T19:04:36.074774Z",
      "attachments": [
        {
          "file_id": "4ea528b2-eb44-48e2-8a0e-a0c1a72985ba",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/8a5f5ed1-ba8d-437c-94c4-75fd5223f873/attachments/4ea528b2-eb44-48e2-8a0e-a0c1a72985ba` → **200**

Done: support case 8a5f5ed1-ba8d-437c-94c4-75fd5223f873, rider attachment daec11b7-29c4-46f9-bf1d-090ee04af48b, operator attachment 4ea528b2-eb44-48e2-8a0e-a0c1a72985ba.

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
  "session_id": "f837a91d-eaff-48db-9bac-48df2e9cde36",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxNzcsImlhdCI6MTc5MzIxNDI3NywianRpIjoiMDU0YWJkY2UtMjE4NC00MjMxLTk4YjYtZTk1ZmQ5YmU1NmMzIiwic2lkIjoiZjgzN2E5MWQtZWFmZi00OGRiLTliYWMtNDhkZjJlOWNkZTM2In0.VYsJQglwwcNCcxpjUyxO72I5U33W6HZ7cqsYTmpp_k8",
  "access_expires_at": "2026-10-28T19:19:37.085452942Z",
  "refresh_token": "IU3-UxvdxGT2gNhlLU80VaRGDjDUJRBw2TMssD5Q5f4",
  "refresh_expires_at": "2026-10-29T07:04:37.084903072Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8116"
}
```

```json
{
  "challenge_id": "002ce80a-3b91-4741-a283-637ef3f2d128",
  "expires_at": "2026-10-28T19:09:37.380555856Z",
  "resend_available_at": "2026-10-28T19:04:38.380555856Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "002221",
  "sent_at": "2026-10-28T19:04:37.38321126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "002ce80a-3b91-4741-a283-637ef3f2d128",
  "code": "002221",
  "device_ref": "sandbox-8116"
}
```

```json
{
  "session_id": "31c4c656-0552-4042-9a16-9527c5071bd1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTE3NywiaWF0IjoxNzkzMjE0Mjc3LCJqdGkiOiIxNDVhNjY4NS00OTBmLTQ0YWMtODdlOS02NDMzNzUxOTlhNDQiLCJzaWQiOiIzMWM0YzY1Ni0wNTUyLTQwNDItOWExNi05NTI3YzUwNzFiZDEifQ.PMSLVMs-rTARPSGRItod9gtY5KRiSv_PVAtVCyMmKMk",
  "access_expires_at": "2026-10-28T19:19:37.712219553Z",
  "refresh_token": "lWgyFyRECdUR_hv4OXJTlOTFk8BjkftTT0mgiJm3LnA",
  "refresh_expires_at": "2026-11-27T19:04:37.711650284Z",
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
      "actor_id": "716e1551-e1ad-4619-8d26-a6521c301975",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T19:04:24.764713Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "716e1551-e1ad-4619-8d26-a6521c301975",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T19:04:26.328108Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "775c7f43-6b07-4b8b-8643-81c73bd22011",
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
  "device_ref": "sandbox-24416"
}
```

```json
{
  "challenge_id": "4a5811d0-dab7-4efd-8084-c18d7efa9307",
  "expires_at": "2026-10-28T19:09:38.938496026Z",
  "resend_available_at": "2026-10-28T19:04:39.938496026Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "822695",
  "sent_at": "2026-10-28T19:04:38.940832531Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a5811d0-dab7-4efd-8084-c18d7efa9307",
  "code": "822695",
  "device_ref": "sandbox-24416"
}
```

```json
{
  "session_id": "5ea8ecc6-383b-4fbf-a9dc-c703a0e11042",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTE3OSwiaWF0IjoxNzkzMjE0Mjc5LCJqdGkiOiI1MTY3NGM0Zi0wMmU2LTQ5OWQtOTJiMy03NmEzNGNkZWI2YzAiLCJzaWQiOiI1ZWE4ZWNjNi0zODNiLTRmYmYtYTlkYy1jNzAzYTBlMTEwNDIifQ.Lp4Mm5sQ_41dVc8sNxAE4Xhg7IZnjSP6Wmovywoi-Yc",
  "access_expires_at": "2026-10-28T19:19:39.275994725Z",
  "refresh_token": "-QziUIKcOmSwU6F5I-Fz-eeRsBwERLZIzeWvU3SiTLg",
  "refresh_expires_at": "2026-11-27T19:04:39.275408811Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "614eb530-7bd0-46fb-8855-48f6a713c683",
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
  "last_heartbeat_at": "2026-10-28T19:04:06.472278Z",
  "last_location_at": "2026-10-28T19:04:06.472278Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/614eb530-7bd0-46fb-8855-48f6a713c683/handover` → **200**

```json
{
  "command_id": "d4bb2c69-6a5f-41c5-a3e4-9a6caa412bf0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "614eb530-7bd0-46fb-8855-48f6a713c683",
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
  "last_heartbeat_at": "2026-10-28T19:04:06.472278Z",
  "last_location_at": "2026-10-28T19:04:06.472278Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/614eb530-7bd0-46fb-8855-48f6a713c683/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:04:40Z",
    "sequence": 1793214280197
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "614eb530-7bd0-46fb-8855-48f6a713c683",
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
  "last_heartbeat_at": "2026-10-28T19:04:40.220718Z",
  "last_location_at": "2026-10-28T19:04:40.220718Z",
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
  "command_id": "a7c8947c-9700-493a-aed2-17c728f31e45",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:04:40Z",
    "sequence": 1793214280826
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "078d3a1e-fdb2-4e95-a8c1-ef385d89be71",
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
  "last_heartbeat_at": "2026-10-28T19:04:40.848045Z",
  "last_location_at": "2026-10-28T19:04:40.848045Z",
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
  "session_id": "e770942b-4419-4be6-b36f-b21e6d58e141",
  "subject": {
    "type": "STAFF",
    "id": "716e1551-e1ad-4619-8d26-a6521c301975"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTZlMTU1MS1lMWFkLTQ2MTktOGQyNi1hNjUyMWMzMDE5NzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTUxODEsImlhdCI6MTc5MzIxNDI4MSwianRpIjoiY2U2NjViZDItYWRmZC00MzZkLWIxODEtMDQ0NWUzNzZhMDQ0Iiwic2lkIjoiZTc3MDk0MmItNDQxOS00YmU2LWIzNmYtYjIxZTZkNThlMTQxIn0.S-LlwwMJjhbtPlskksxfmKuFGBegrJ92zdZpWHmGrW8",
  "access_expires_at": "2026-10-28T19:19:41.486678108Z",
  "refresh_token": "LmAvdtL3hk_5Ng-4qeF_Bh2zsznF5WWY3FMhOb9zE28",
  "refresh_expires_at": "2026-10-29T07:04:41.48603494Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "656c19eb-f12d-43f5-a2ca-a5653ea14f45",
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
  "id": "e57bb3c7-b004-47b1-87d9-c91d664492bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:09:41.790111Z",
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
  "command_id": "51e2ebc1-d1bd-4de6-ac70-0a00fada3d2e",
  "quote_id": "e57bb3c7-b004-47b1-87d9-c91d664492bb",
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
  "id": "3e398be8-d9bb-468e-9e00-380bf04e0f39",
  "short_number": 24,
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
  "created_at": "2026-10-28T19:04:42.150236Z",
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
    "id": "b39fea3e-ed6c-4883-844a-b45a6f03bbf2",
    "order_id": "3e398be8-d9bb-468e-9e00-380bf04e0f39",
    "expires_at": "2026-10-28T19:04:57.156168Z",
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

`POST /api/driver/v1/offers/b39fea3e-ed6c-4883-844a-b45a6f03bbf2/accept` → **200**

```json
{
  "command_id": "e84ffee9-6ee7-48f2-82ad-25b755473b71"
}
```

```json
{
  "id": "3726359a-e50a-4a64-b2a4-4b7e942dddaa",
  "order_id": "3e398be8-d9bb-468e-9e00-380bf04e0f39",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "201305f8-68ac-4272-b645-c0a54dd43bcf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "201305f8-68ac-4272-b645-c0a54dd43bcf",
  "order_id": "3e398be8-d9bb-468e-9e00-380bf04e0f39",
  "assignment_id": "3726359a-e50a-4a64-b2a4-4b7e942dddaa",
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

`POST /api/driver/v1/work-sessions/078d3a1e-fdb2-4e95-a8c1-ef385d89be71/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:04:43Z",
    "sequence": 1793214283661
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "078d3a1e-fdb2-4e95-a8c1-ef385d89be71",
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
  "last_heartbeat_at": "2026-10-28T19:04:43.684593Z",
  "last_location_at": "2026-10-28T19:04:43.684593Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/201305f8-68ac-4272-b645-c0a54dd43bcf/arrive` → **200**

```json
{
  "command_id": "cb715d8a-f285-4b08-bdda-0e2df831d0bd",
  "expected_version": 0
}
```

```json
{
  "id": "201305f8-68ac-4272-b645-c0a54dd43bcf",
  "order_id": "3e398be8-d9bb-468e-9e00-380bf04e0f39",
  "assignment_id": "3726359a-e50a-4a64-b2a4-4b7e942dddaa",
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
  "arrived_at": "2026-10-28T19:04:44.001922Z",
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

`POST /api/driver/v1/trips/201305f8-68ac-4272-b645-c0a54dd43bcf/start` → **200**

```json
{
  "command_id": "0e7e456d-6460-4fb0-bcc5-bc4b5e9cf012",
  "expected_version": 1
}
```

```json
{
  "id": "201305f8-68ac-4272-b645-c0a54dd43bcf",
  "order_id": "3e398be8-d9bb-468e-9e00-380bf04e0f39",
  "assignment_id": "3726359a-e50a-4a64-b2a4-4b7e942dddaa",
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
  "arrived_at": "2026-10-28T19:04:44.001922Z",
  "started_at": "2026-10-28T19:04:44.327888Z",
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

`POST /api/driver/v1/trips/201305f8-68ac-4272-b645-c0a54dd43bcf/complete` → **200**

```json
{
  "command_id": "9a984792-c0fa-424d-8a19-28b0f5b9efda",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:04:44Z",
  "cash_received": true
}
```

```json
{
  "id": "201305f8-68ac-4272-b645-c0a54dd43bcf",
  "order_id": "3e398be8-d9bb-468e-9e00-380bf04e0f39",
  "assignment_id": "3726359a-e50a-4a64-b2a4-4b7e942dddaa",
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
  "arrived_at": "2026-10-28T19:04:44.001922Z",
  "started_at": "2026-10-28T19:04:44.327888Z",
  "completed_at": "2026-10-28T19:04:44.639036Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/3e398be8-d9bb-468e-9e00-380bf04e0f39` → **200**

```json
{
  "id": "3e398be8-d9bb-468e-9e00-380bf04e0f39",
  "short_number": 24,
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
    "id": "3726359a-e50a-4a64-b2a4-4b7e942dddaa",
    "order_id": "3e398be8-d9bb-468e-9e00-380bf04e0f39",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "201305f8-68ac-4272-b645-c0a54dd43bcf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:04:42.150236Z",
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
  "session_id": "614eb530-7bd0-46fb-8855-48f6a713c683",
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
  "last_heartbeat_at": "2026-10-28T19:04:40.220718Z",
  "last_location_at": "2026-10-28T19:04:40.220718Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/614eb530-7bd0-46fb-8855-48f6a713c683/close` → **200**

```json
{
  "command_id": "9eaf10d2-2a6a-423d-8ed5-1049b96fe4c8",
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
  "session_id": "078d3a1e-fdb2-4e95-a8c1-ef385d89be71",
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
  "last_heartbeat_at": "2026-10-28T19:04:43.684593Z",
  "last_location_at": "2026-10-28T19:04:43.684593Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/078d3a1e-fdb2-4e95-a8c1-ef385d89be71/close` → **200**

```json
{
  "command_id": "3fa39496-ec0c-455c-8e5f-852f5391e37b",
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

Done: terminal order 3e398be8-d9bb-468e-9e00-380bf04e0f39 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32070"
}
```

```json
{
  "challenge_id": "57f9335a-cfc6-4f8b-9f0e-b86e5af64487",
  "expires_at": "2026-10-28T19:09:49.797988608Z",
  "resend_available_at": "2026-10-28T19:04:50.797988608Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "080060",
  "sent_at": "2026-10-28T19:04:49.80061511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57f9335a-cfc6-4f8b-9f0e-b86e5af64487",
  "code": "080060",
  "device_ref": "sandbox-32070"
}
```

```json
{
  "session_id": "8f7c9180-2a20-4df2-a290-466281b717cc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTE5MCwiaWF0IjoxNzkzMjE0MjkwLCJqdGkiOiJjZGM0YzExYy1kMDdlLTRmMmQtYjA4YS03NzQ3NGM1ODljOTAiLCJzaWQiOiI4ZjdjOTE4MC0yYTIwLTRkZjItYTI5MC00NjYyODFiNzE3Y2MifQ.5hTgPbBJlIOmEPckWcfzPAp3Xzn3EbtK0fDG4wcblFg",
  "access_expires_at": "2026-10-28T19:19:50.129856781Z",
  "refresh_token": "pq5LacS1egGIwJNLLBx4GIh52Vl8hcs-1c7w4n034RA",
  "refresh_expires_at": "2026-11-27T19:04:50.129184961Z",
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
  "device_ref": "sandbox-28586"
}
```

```json
{
  "challenge_id": "5f1d24fb-6881-4437-bd32-4b881ce0aed4",
  "expires_at": "2026-10-28T19:09:50.716032096Z",
  "resend_available_at": "2026-10-28T19:04:51.716032096Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "447330",
  "sent_at": "2026-10-28T19:04:50.718433125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f1d24fb-6881-4437-bd32-4b881ce0aed4",
  "code": "447330",
  "device_ref": "sandbox-28586"
}
```

```json
{
  "session_id": "4add30cc-1dd6-4aa6-8e5f-5e69c481d61e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTE5MSwiaWF0IjoxNzkzMjE0MjkxLCJqdGkiOiJiZTU5NmMwOS1jNjdlLTQ0NmUtYTI4OC00MzA5MjY5ZjkyY2YiLCJzaWQiOiI0YWRkMzBjYy0xZGQ2LTRhYTYtOGU1Zi01ZTY5YzQ4MWQ2MWUifQ.IQGPaRCrFlo2evFc6X67DCVbZmlEBXQgK_s7qKrU-JI",
  "access_expires_at": "2026-10-28T19:19:51.04330522Z",
  "refresh_token": "_BzyzKUAsQrfGSGcW265p6WEEgnSNyNUJMlE-n9-HWs",
  "refresh_expires_at": "2026-11-27T19:04:51.042676203Z",
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
  "device_ref": "sandbox-110"
}
```

```json
{
  "challenge_id": "7345e048-bd04-4071-8bb4-cb36321f1130",
  "expires_at": "2026-10-28T19:09:51.661290806Z",
  "resend_available_at": "2026-10-28T19:04:52.661290806Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "358115",
  "sent_at": "2026-10-28T19:04:51.663632287Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7345e048-bd04-4071-8bb4-cb36321f1130",
  "code": "358115",
  "device_ref": "sandbox-110"
}
```

```json
{
  "session_id": "4518ca75-1e20-401f-b67e-9e7ca912dc94",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTE5MSwiaWF0IjoxNzkzMjE0MjkxLCJqdGkiOiIzZTNlNzQyYi01MjEyLTRjOGItOTMyNS04MDkyZDMwMDE4NzIiLCJzaWQiOiI0NTE4Y2E3NS0xZTIwLTQwMWYtYjY3ZS05ZTdjYTkxMmRjOTQifQ.moPhybqmUbSTxNX3UhF2KiQqtpTo_pw7VFoWCJBHtTw",
  "access_expires_at": "2026-10-28T19:19:51.998587355Z",
  "refresh_token": "bg4eLExsR9igoEARZLtZzErZRfO8A_jXat4SGqnDOR4",
  "refresh_expires_at": "2026-11-27T19:04:51.997994201Z",
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
  "phone": "+380697936814",
  "device_ref": "sandbox-15032"
}
```

```json
{
  "challenge_id": "268a5125-f5f3-434d-80ee-8c10e2a4907f",
  "expires_at": "2026-10-28T19:09:52.597016733Z",
  "resend_available_at": "2026-10-28T19:04:53.597016733Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380697936814` → **200**

```json
{
  "phone": "+380697936814",
  "audience": "CLIENT",
  "code": "571491",
  "sent_at": "2026-10-28T19:04:52.599263084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "268a5125-f5f3-434d-80ee-8c10e2a4907f",
  "code": "571491",
  "device_ref": "sandbox-15032"
}
```

```json
{
  "session_id": "7a911bfb-5e46-4b31-86d3-5681aa51ae37",
  "subject": {
    "type": "CLIENT",
    "id": "52702951-ca01-4ca9-b43f-e7e03a3c2899"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MjcwMjk1MS1jYTAxLTRjYTktYjQzZi1lN2UwM2EzYzI4OTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1MTkyLCJpYXQiOjE3OTMyMTQyOTIsImp0aSI6IjQ0ZWU2ZTIxLTk5NGItNGMyNi1iZjA0LWU2OThlYzJiMzI0OCIsInNpZCI6IjdhOTExYmZiLTVlNDYtNGIzMS04NmQzLTU2ODFhYTUxYWUzNyJ9.34rAmO8f2iDaDWnhSeEW7Pu8OX8q4iFSb8Ae2GAlO6c",
  "access_expires_at": "2026-10-28T19:19:52.929278151Z",
  "refresh_token": "WOrCC-Z8-gC1uE7RoS8UF6R8YL0RRIis3YPaTqj8fDE",
  "refresh_expires_at": "2026-11-27T19:04:52.928752786Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a4ca7549-c076-4c18-a1d9-90b0b71c65d5",
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
  "id": "3edd70e9-bf6e-4e28-90a9-c3782b2938f8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:09:53.240002Z",
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
  "command_id": "78ba66d3-0ff6-4adc-878b-a4a7c13553f9",
  "quote_id": "3edd70e9-bf6e-4e28-90a9-c3782b2938f8",
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
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
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
  "blizz_orders_total": 25,
  "blizz_orders_cancelled_total": 13,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 16,
  "blizz_dispatch_assigned_seconds_count": 15,
  "blizz_offers_total": 18,
  "blizz_dispatch_excluded_total": 8,
  "blizz_sms_sent_total": 66
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 15
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 12.911182558
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 3.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 16
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.146536596
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 15.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 17.0
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 59.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/f979e87c-d05b-49e7-8fa8-4938dc80ae17` → **200**

```json
{
  "id": "f979e87c-d05b-49e7-8fa8-4938dc80ae17",
  "short_number": 25,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "52702951-ca01-4ca9-b43f-e7e03a3c2899",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:04:53.554819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
