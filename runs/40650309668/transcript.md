# Sandbox transcript (2026-10-28T07:29:24Z, f182c9d)

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
  "correlation_id": "df96022e-aaca-41a1-a91f-b69640e7e194"
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
  "session_id": "1b5aa4c9-3e9a-447d-bb40-0185969f52ea",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM0NjUsImlhdCI6MTc5MzE3MjU2NSwianRpIjoiNmEwZGNkZDYtOWE4Zi00NmZhLTk2MDItY2VlOTMyZjI4YjE4Iiwic2lkIjoiMWI1YWE0YzktM2U5YS00NDdkLWJiNDAtMDE4NTk2OWY1MmVhIn0.quPVeqQ9uFnZA2wMVIopCxRj2n73VP03-G4DWp1FUGI",
  "access_expires_at": "2026-10-28T07:44:25.651445157Z",
  "refresh_token": "f00gVp5ky0w9QjsFlZYs_fgPT8OX1nJeqouUdUqrRD0",
  "refresh_expires_at": "2026-10-28T19:29:25.648931163Z",
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
  "session_id": "06e6fbb7-e7c8-4b74-8053-0468313946ba",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM0NjYsImlhdCI6MTc5MzE3MjU2NiwianRpIjoiZGE3NDExMDItOTE4Yi00NzAwLTk5YzctNTdmZTBiYTJiNDhkIiwic2lkIjoiMDZlNmZiYjctZTdjOC00Yjc0LTgwNTMtMDQ2ODMxMzk0NmJhIn0.bgdUckVlrPj4K0HtWul3ASS4GfeqV6YbCXeTMHf1nlQ",
  "access_expires_at": "2026-10-28T07:44:26.954513649Z",
  "refresh_token": "RlipvYk1ChRp2Ei1q0yXWALDkP_wlEu_KJ3vicdKAtM",
  "refresh_expires_at": "2026-10-28T19:29:26.953430232Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "7cb3cad5-cf95-46f8-a65d-5e78c999a060",
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
  "id": "f8e7ce02-bef1-4fe8-a847-452a4f136b60",
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
  "created_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "created_at": "2026-10-28T07:29:27.024818Z",
  "updated_at": "2026-10-28T07:29:27.024818Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631674478",
  "device_ref": "sandbox-14752"
}
```

```json
{
  "challenge_id": "59793aaf-310f-4c85-a2a4-2cb414b8716e",
  "expires_at": "2026-10-28T07:34:27.073254106Z",
  "resend_available_at": "2026-10-28T07:29:28.073254106Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631674478` → **200**

```json
{
  "phone": "+380631674478",
  "audience": "CLIENT",
  "code": "599680",
  "sent_at": "2026-10-28T07:29:27.083977911Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59793aaf-310f-4c85-a2a4-2cb414b8716e",
  "code": "599680",
  "device_ref": "sandbox-14752"
}
```

```json
{
  "session_id": "1370d962-28bc-4f81-90e3-7ce005d2a35b",
  "subject": {
    "type": "CLIENT",
    "id": "3fb87d17-b972-4a0c-9fb9-12e2e9d236b7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZmI4N2QxNy1iOTcyLTRhMGMtOWZiOS0xMmUyZTlkMjM2YjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNDY3LCJpYXQiOjE3OTMxNzI1NjcsImp0aSI6IjUyMTc2NjM5LWNiZjMtNGI3YS1iNjVlLTZjMDE5YmU1YzQ1YiIsInNpZCI6IjEzNzBkOTYyLTI4YmMtNGY4MS05MGUzLTdjZTAwNWQyYTM1YiJ9.jVmJBFdLXnxmEPRjn0f9cvG2kx3MArz4orGjYkeLuo0",
  "access_expires_at": "2026-10-28T07:44:27.165146222Z",
  "refresh_token": "4_dIstO5rGWwWcDyaTbvEXFZC4K5ljV4lS0qM6kG-DE",
  "refresh_expires_at": "2026-11-27T07:29:27.163839622Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631674478` → **200**

```json
{
  "client_id": "3fb87d17-b972-4a0c-9fb9-12e2e9d236b7"
}
```

`POST /api/admin/v1/rider-wallets/3fb87d17-b972-4a0c-9fb9-12e2e9d236b7/top-ups` → **201**

```json
{
  "command_id": "ddbed54c-e6c2-4d0f-bee3-6719ff23842c",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "3fb87d17-b972-4a0c-9fb9-12e2e9d236b7",
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
      "id": "2849eb73-dff3-4fd7-be4a-e67082eee8fe",
      "at": "2026-10-28T07:29:27.255111Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9e5f9407-e056-4462-94ff-dedd9b9fdbb0",
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
  "id": "e03e16d5-7121-406e-9ece-620e7a4b35cd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:34:27.379834Z",
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
      "id": "f8e7ce02-bef1-4fe8-a847-452a4f136b60",
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
  "device_ref": "sandbox-17039"
}
```

```json
{
  "challenge_id": "4fa41ba3-0d34-4a20-a4c3-29ab3534f228",
  "expires_at": "2026-10-28T07:34:27.457232753Z",
  "resend_available_at": "2026-10-28T07:29:28.457232753Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "424302",
  "sent_at": "2026-10-28T07:29:27.461233095Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fa41ba3-0d34-4a20-a4c3-29ab3534f228",
  "code": "424302",
  "device_ref": "sandbox-17039"
}
```

```json
{
  "session_id": "8c5b3f6d-6f87-4d18-8d52-860ce09d8a9f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzQ2NywiaWF0IjoxNzkzMTcyNTY3LCJqdGkiOiJhMDRiMmMwYi1hYzE0LTQxNjMtYWYxYi0yNjJhMDg1YzFhODMiLCJzaWQiOiI4YzViM2Y2ZC02Zjg3LTRkMTgtOGQ1Mi04NjBjZTA5ZDhhOWYifQ.nPMq0fgsIHzMwrXquWvYIrV9igULix6yIafMj3vN-2M",
  "access_expires_at": "2026-10-28T07:44:27.520775226Z",
  "refresh_token": "EQHO8w7EPvHAILYDV4t0aPXM6ifDmC4NKWzUkqUDlbY",
  "refresh_expires_at": "2026-11-27T07:29:27.519775694Z",
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
  "command_id": "6aa90ba7-042d-45b1-a124-d04632223bcc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:29:27Z",
    "sequence": 1793172567584
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a5bdc2cd-f1b6-41df-9bc7-a3c3d6327627",
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
  "last_heartbeat_at": "2026-10-28T07:29:27.634592Z",
  "last_location_at": "2026-10-28T07:29:27.634592Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c3b0cafe-6280-412b-9ca6-1ccbaedd4dbf",
  "quote_id": "e03e16d5-7121-406e-9ece-620e7a4b35cd",
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
  "id": "5aeb06ce-cfc6-4875-9b31-1cc20c461328",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3fb87d17-b972-4a0c-9fb9-12e2e9d236b7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T07:29:27.720707Z",
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
  "client_id": "3fb87d17-b972-4a0c-9fb9-12e2e9d236b7",
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
      "id": "2849eb73-dff3-4fd7-be4a-e67082eee8fe",
      "at": "2026-10-28T07:29:27.255111Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
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
    "id": "6be450e6-5779-47fd-811d-c6a140fd4e6a",
    "order_id": "5aeb06ce-cfc6-4875-9b31-1cc20c461328",
    "expires_at": "2026-10-28T07:29:42.735964Z",
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

`POST /api/driver/v1/offers/6be450e6-5779-47fd-811d-c6a140fd4e6a/accept` → **200**

```json
{
  "command_id": "1a103ee5-d42e-45a1-bf83-bd68f9250db8"
}
```

```json
{
  "id": "a9d50634-24a2-46ce-8d40-7de0becc6db2",
  "order_id": "5aeb06ce-cfc6-4875-9b31-1cc20c461328",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "27da40a1-deba-4c7e-b4dd-74e8a0e452a8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "27da40a1-deba-4c7e-b4dd-74e8a0e452a8",
  "order_id": "5aeb06ce-cfc6-4875-9b31-1cc20c461328",
  "assignment_id": "a9d50634-24a2-46ce-8d40-7de0becc6db2",
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

`POST /api/driver/v1/work-sessions/a5bdc2cd-f1b6-41df-9bc7-a3c3d6327627/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:29:27Z",
    "sequence": 1793172567912
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a5bdc2cd-f1b6-41df-9bc7-a3c3d6327627",
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
  "last_heartbeat_at": "2026-10-28T07:29:27.938148Z",
  "last_location_at": "2026-10-28T07:29:27.938148Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/27da40a1-deba-4c7e-b4dd-74e8a0e452a8/arrive` → **200**

```json
{
  "command_id": "c8040745-1b12-47c5-8b37-ccd5d89ea38d",
  "expected_version": 0
}
```

```json
{
  "id": "27da40a1-deba-4c7e-b4dd-74e8a0e452a8",
  "order_id": "5aeb06ce-cfc6-4875-9b31-1cc20c461328",
  "assignment_id": "a9d50634-24a2-46ce-8d40-7de0becc6db2",
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
  "arrived_at": "2026-10-28T07:29:27.986388Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/27da40a1-deba-4c7e-b4dd-74e8a0e452a8/start` → **200**

```json
{
  "command_id": "9d9923b4-83cf-4556-8577-835e22073fac",
  "expected_version": 1
}
```

```json
{
  "id": "27da40a1-deba-4c7e-b4dd-74e8a0e452a8",
  "order_id": "5aeb06ce-cfc6-4875-9b31-1cc20c461328",
  "assignment_id": "a9d50634-24a2-46ce-8d40-7de0becc6db2",
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
  "arrived_at": "2026-10-28T07:29:27.986388Z",
  "started_at": "2026-10-28T07:29:28.031972Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/27da40a1-deba-4c7e-b4dd-74e8a0e452a8/complete` → **200**

```json
{
  "command_id": "105f3e5c-15c9-4c8c-8210-f659b80f2e27",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:29:28Z",
  "cash_received": true
}
```

```json
{
  "id": "27da40a1-deba-4c7e-b4dd-74e8a0e452a8",
  "order_id": "5aeb06ce-cfc6-4875-9b31-1cc20c461328",
  "assignment_id": "a9d50634-24a2-46ce-8d40-7de0becc6db2",
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
  "arrived_at": "2026-10-28T07:29:27.986388Z",
  "started_at": "2026-10-28T07:29:28.031972Z",
  "completed_at": "2026-10-28T07:29:28.099933Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3fb87d17-b972-4a0c-9fb9-12e2e9d236b7",
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
      "id": "647f7eb0-ed1f-41f1-a624-838c1e36c20e",
      "at": "2026-10-28T07:29:28.7898Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "5aeb06ce-cfc6-4875-9b31-1cc20c461328"
    },
    {
      "id": "2849eb73-dff3-4fd7-be4a-e67082eee8fe",
      "at": "2026-10-28T07:29:27.255111Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/f8e7ce02-bef1-4fe8-a847-452a4f136b60/archive` → **200**

```json
{
  "command_id": "a975b567-bdf4-423c-afcd-44588393e828",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "f8e7ce02-bef1-4fe8-a847-452a4f136b60",
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
  "created_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "created_at": "2026-10-28T07:29:27.024818Z",
  "updated_at": "2026-10-28T07:29:31.195104Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a5bdc2cd-f1b6-41df-9bc7-a3c3d6327627",
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
  "last_heartbeat_at": "2026-10-28T07:29:27.938148Z",
  "last_location_at": "2026-10-28T07:29:27.938148Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a5bdc2cd-f1b6-41df-9bc7-a3c3d6327627/close` → **200**

```json
{
  "command_id": "4550c708-4d36-48ca-baf1-55060251dbeb",
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

Done: order 5aeb06ce-cfc6-4875-9b31-1cc20c461328.

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
  "session_id": "2cecd94e-ee1e-4b41-89af-c040ae0bb422",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM0NzEsImlhdCI6MTc5MzE3MjU3MSwianRpIjoiN2Q0MGJiMmUtNDMxZC00ZDhjLTlkZDgtMWVmMjFlYmZiNTdlIiwic2lkIjoiMmNlY2Q5NGUtZWUxZS00YjQxLTg5YWYtYzA0MGFlMGJiNDIyIn0.xrc1PUknEPeNUEwb0rsIPQPKogKt3TUK6Z1_Xvu5UAo",
  "access_expires_at": "2026-10-28T07:44:31.61428852Z",
  "refresh_token": "rh5oc-ypooswWlyyeWPKYxcQ6IM2xiSqKoQK5TDv2i8",
  "refresh_expires_at": "2026-10-28T19:29:31.613339372Z",
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
  "command_id": "a8a1b8aa-13e9-49d2-aaf2-aa699c2d295d",
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
  "session_id": "6d479446-31d1-4b54-b481-074ccd4a2dd2",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM0NzIsImlhdCI6MTc5MzE3MjU3MiwianRpIjoiYmU5NzhiNTAtYWZjNy00YWI4LTgyMTktZWFiY2ZkYTJiMzIxIiwic2lkIjoiNmQ0Nzk0NDYtMzFkMS00YjU0LWI0ODEtMDc0Y2NkNGEyZGQyIn0.rEjgHbBnLleptlgRs3DDP9sGE3lBUJfRZeAOTv47DSY",
  "access_expires_at": "2026-10-28T07:44:32.013473756Z",
  "refresh_token": "Glk-ZadULqhZ5vR7N5wRq9h21JVgcR_g-l4BBJIahSk",
  "refresh_expires_at": "2026-10-28T19:29:32.012564915Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.238922850",
    "linkedid": "1730052700.238922850",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672642976"
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
    "id": "1730052700.238922850",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "9d6f57a7-32ad-41e3-ba1c-e4f89f35d20c",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672642976",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:29:32.044422Z",
      "answered_at": null,
      "ended_at": "2026-10-28T07:29:32.069387Z",
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
    "id": "1730052600.136516586",
    "linkedid": "1730052600.136516586",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672642976"
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
      "id": "b5aaee5e-8182-4336-a63f-5c7e127866ef",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672642976",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:29:32.13837Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/b5aaee5e-8182-4336-a63f-5c7e127866ef/answer` → **200**

```json
{
  "command_id": "79c45b58-8653-495a-9191-52b961eb3ce1"
}
```

```json
{
  "id": "b5aaee5e-8182-4336-a63f-5c7e127866ef",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672642976",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "order_ids": [],
  "started_at": "2026-10-28T07:29:32.13837Z",
  "answered_at": "2026-10-28T07:29:32.201077Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.136516586",
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
    "id": "1730052600.136516586",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "b5aaee5e-8182-4336-a63f-5c7e127866ef",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672642976",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
      "order_ids": [],
      "started_at": "2026-10-28T07:29:32.13837Z",
      "answered_at": "2026-10-28T07:29:32.201077Z",
      "ended_at": "2026-10-28T07:29:32.253418Z",
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
      "id": "b5aaee5e-8182-4336-a63f-5c7e127866ef",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672642976",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
      "order_ids": [],
      "started_at": "2026-10-28T07:29:32.13837Z",
      "answered_at": "2026-10-28T07:29:32.201077Z",
      "ended_at": "2026-10-28T07:29:32.253418Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:29:33.644853Z"
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
      "id": "b5aaee5e-8182-4336-a63f-5c7e127866ef",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672642976",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
      "order_ids": [],
      "started_at": "2026-10-28T07:29:32.13837Z",
      "answered_at": "2026-10-28T07:29:32.201077Z",
      "ended_at": "2026-10-28T07:29:32.253418Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:29:33.644853Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/b5aaee5e-8182-4336-a63f-5c7e127866ef/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/b5aaee5e-8182-4336-a63f-5c7e127866ef/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=b5aaee5e-8182-4336-a63f-5c7e127866ef` → **200**

```json
{
  "changes": [
    {
      "id": "cdb59120-7cb4-40be-822c-28a5ec31179b",
      "occurred_at": "2026-10-28T07:29:34.408509Z",
      "actor_type": "STAFF",
      "actor_id": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b5aaee5e-8182-4336-a63f-5c7e127866ef",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"ac069f30-9896-42ab-a0f6-d1edc534d59d\", \"order_ids\": []}",
      "correlation_id": "53c27988-7f7f-45d7-bca0-a5e5e2d2ffdd"
    },
    {
      "id": "05376e59-12c2-4e42-9b84-acae7c918e5a",
      "occurred_at": "2026-10-28T07:29:34.374715Z",
      "actor_type": "STAFF",
      "actor_id": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b5aaee5e-8182-4336-a63f-5c7e127866ef",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"ac069f30-9896-42ab-a0f6-d1edc534d59d\", \"order_ids\": []}",
      "correlation_id": "9fa07562-a04e-4f12-835a-c02c30a4ec55"
    }
  ]
}
```

Done: call b5aaee5e-8182-4336-a63f-5c7e127866ef recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637227126",
  "device_ref": "sandbox-22658"
}
```

```json
{
  "challenge_id": "583c3156-bba9-46cb-b30c-35d8ddc33c7e",
  "expires_at": "2026-10-28T07:34:34.483270206Z",
  "resend_available_at": "2026-10-28T07:29:35.483270206Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637227126` → **200**

```json
{
  "phone": "+380637227126",
  "audience": "CLIENT",
  "code": "538180",
  "sent_at": "2026-10-28T07:29:34.487319071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "583c3156-bba9-46cb-b30c-35d8ddc33c7e",
  "code": "538180",
  "device_ref": "sandbox-22658"
}
```

```json
{
  "session_id": "30327527-4a9c-4cae-9de4-25a27c9fa0cb",
  "subject": {
    "type": "CLIENT",
    "id": "93ba4c95-0dac-43b0-85e9-ba09de25c89a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5M2JhNGM5NS0wZGFjLTQzYjAtODVlOS1iYTA5ZGUyNWM4OWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNDc0LCJpYXQiOjE3OTMxNzI1NzQsImp0aSI6ImY2NjdhYjg1LTk2NzItNDM3OS05MDA0LTM1NTRkNTRlNmJkOSIsInNpZCI6IjMwMzI3NTI3LTRhOWMtNGNhZS05ZGU0LTI1YTI3YzlmYTBjYiJ9.uDHzSQCKF1RVQ3xJypY2psqxGjcXPu0NP9F43fSamuk",
  "access_expires_at": "2026-10-28T07:44:34.545414633Z",
  "refresh_token": "IRrNQH_jxGIy9kSQxlG-JMqUhwASuttgxPg2EIXqZ24",
  "refresh_expires_at": "2026-11-27T07:29:34.544682395Z",
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
  "device_ref": "sandbox-19428"
}
```

```json
{
  "challenge_id": "c1e69f88-f356-4ab4-84a2-11582e591b14",
  "expires_at": "2026-10-28T07:34:34.607101852Z",
  "resend_available_at": "2026-10-28T07:29:35.607101852Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "891430",
  "sent_at": "2026-10-28T07:29:34.611295078Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1e69f88-f356-4ab4-84a2-11582e591b14",
  "code": "891430",
  "device_ref": "sandbox-19428"
}
```

```json
{
  "session_id": "a4b3e97b-95a4-4bc6-b2b6-30eac6384b32",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzQ3NCwiaWF0IjoxNzkzMTcyNTc0LCJqdGkiOiJmNDFhNjYwYy0xZWNhLTQ1ODEtYmUxZC0xZWVlMzhkMzM1NmIiLCJzaWQiOiJhNGIzZTk3Yi05NWE0LTRiYzYtYjJiNi0zMGVhYzYzODRiMzIifQ.yC_tQDH6k2K76tp1LH04C8sQ8umIwG_G6fslDP_jHmE",
  "access_expires_at": "2026-10-28T07:44:34.675898076Z",
  "refresh_token": "BmIomuBzIbyZkz4TYFkNLorszUAA3Q_5uA3dWFVlsXU",
  "refresh_expires_at": "2026-11-27T07:29:34.67506953Z",
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
  "session_id": "00d3455c-1e10-41f7-8522-cc9418ea94b1",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM0NzUsImlhdCI6MTc5MzE3MjU3NSwianRpIjoiM2YyZjI5ZmUtYWM4OC00ZWQxLTg0MzQtNzFiYTQ2ZDhiNzMxIiwic2lkIjoiMDBkMzQ1NWMtMWUxMC00MWY3LTg1MjItY2M5NDE4ZWE5NGIxIn0.mQF56xoDoCpVqSEzcaDEHnQov3zzoNuRSEYV_oAHRSI",
  "access_expires_at": "2026-10-28T07:44:35.023649593Z",
  "refresh_token": "3UlwOmfTGYYOziJtuRmbHQDec1i3mEAByXQ_16n_3bk",
  "refresh_expires_at": "2026-10-28T19:29:35.022813661Z",
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
  "session_id": "1be4fe12-0b3d-48a9-8638-c6005bc8af64",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM0NzUsImlhdCI6MTc5MzE3MjU3NSwianRpIjoiNjFlZjRlODQtNGU3Yi00ZDYyLThhOWQtYWI2NWZmNDJiYzI5Iiwic2lkIjoiMWJlNGZlMTItMGIzZC00OGE5LTg2MzgtYzYwMDViYzhhZjY0In0.8NhR4n1bfxHLE3r-38ZLXEvfPGXZXJQLLrGwwDUFDEU",
  "access_expires_at": "2026-10-28T07:44:35.345133733Z",
  "refresh_token": "rNj2CqLCCnkBxruuCcdUTwZ2iNJ39Is4ACmhg2CmP88",
  "refresh_expires_at": "2026-10-28T19:29:35.344393479Z",
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
  "command_id": "4b3b9358-d904-44ab-8edd-491820f63c3c",
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
  "id": "fd3ba283-4dfd-481a-9273-cdbd15273874",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:34:35.408951Z",
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
  "command_id": "84b7bd33-fb32-4581-9500-77af1e93a902",
  "quote_id": "fd3ba283-4dfd-481a-9273-cdbd15273874",
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
  "id": "db941f49-26fc-4ba2-9f51-14cab2f473d8",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "93ba4c95-0dac-43b0-85e9-ba09de25c89a",
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
  "created_at": "2026-10-28T07:29:35.449663Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/db941f49-26fc-4ba2-9f51-14cab2f473d8` → **200**

```json
{
  "id": "db941f49-26fc-4ba2-9f51-14cab2f473d8",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "93ba4c95-0dac-43b0-85e9-ba09de25c89a",
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
  "created_at": "2026-10-28T07:29:35.449663Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/db941f49-26fc-4ba2-9f51-14cab2f473d8/cancel` → **200**

```json
{
  "command_id": "f3ed4ec2-ae15-4832-8fbb-8470f7698b40",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "db941f49-26fc-4ba2-9f51-14cab2f473d8",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "93ba4c95-0dac-43b0-85e9-ba09de25c89a",
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
  "created_at": "2026-10-28T07:29:35.449663Z",
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
  "command_id": "aed98a81-4656-4315-9c83-55cdea140841",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:29:35Z",
    "sequence": 1793172575588
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b9431471-4d67-4b65-be5e-7cd106288669",
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
  "last_heartbeat_at": "2026-10-28T07:29:35.607886Z",
  "last_location_at": "2026-10-28T07:29:35.607886Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2760"
}
```

```json
{
  "challenge_id": "9d8ab619-4382-4fe7-a54e-92e81aab88bf",
  "expires_at": "2026-10-28T07:34:35.638451863Z",
  "resend_available_at": "2026-10-28T07:29:36.638451863Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "973212",
  "sent_at": "2026-10-28T07:29:35.641558206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d8ab619-4382-4fe7-a54e-92e81aab88bf",
  "code": "973212",
  "device_ref": "sandbox-2760"
}
```

```json
{
  "session_id": "e2325de6-131f-447f-91c2-b79445f4b8d1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzQ3NSwiaWF0IjoxNzkzMTcyNTc1LCJqdGkiOiI0NmQ4MmYwNi0wNTQ5LTQ1OWUtOTg1ZS1hY2NmMmQyNDYwMDQiLCJzaWQiOiJlMjMyNWRlNi0xMzFmLTQ0N2YtOTFjMi1iNzk0NDVmNGI4ZDEifQ.Xr3ag3wXxOQsQ4www5ZDf42KNT0gym3tzOdiI0zyqwM",
  "access_expires_at": "2026-10-28T07:44:35.69959281Z",
  "refresh_token": "v3wjJEOB0xqnZbLhKWAh77nVOjZuOve6sIxzI9BiKNQ",
  "refresh_expires_at": "2026-11-27T07:29:35.698870563Z",
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
  "command_id": "33e7ab92-b950-4615-a7bd-26e29b1f2120",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:29:35Z",
    "sequence": 1793172575752
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "872ab972-1df9-455f-9a97-ff7350e79e4a",
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
  "last_heartbeat_at": "2026-10-28T07:29:35.771516Z",
  "last_location_at": "2026-10-28T07:29:35.771516Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d20fe614-1fd1-40f2-a059-f615ede41eb6",
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
  "id": "0b03ccd2-e6c1-4cc2-819e-6e91aeb8514e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:34:35.811749Z",
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
  "command_id": "c16b1b2b-4724-4e6a-813a-06cf3fd23ca6",
  "quote_id": "0b03ccd2-e6c1-4cc2-819e-6e91aeb8514e",
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
  "id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "93ba4c95-0dac-43b0-85e9-ba09de25c89a",
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
  "created_at": "2026-10-28T07:29:35.852091Z",
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
    "id": "bb39fa46-9c79-4064-bddb-149af114d68c",
    "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
    "expires_at": "2026-10-28T07:29:50.856524Z",
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

`POST /api/driver/v1/offers/bb39fa46-9c79-4064-bddb-149af114d68c/accept` → **200**

```json
{
  "command_id": "6de7d6c9-60d0-4b66-80b8-977d06684c12"
}
```

```json
{
  "id": "84918802-e9ce-4b35-9a7a-19f9401d488d",
  "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "093b39e4-e341-48c3-bc3c-7450984a4e71",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "093b39e4-e341-48c3-bc3c-7450984a4e71",
  "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
  "assignment_id": "84918802-e9ce-4b35-9a7a-19f9401d488d",
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

`POST /api/driver/v1/trips/093b39e4-e341-48c3-bc3c-7450984a4e71/cancel` → **200**

```json
{
  "command_id": "5232fc2d-0c63-4dc9-b6c1-73af61c0dc0d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "093b39e4-e341-48c3-bc3c-7450984a4e71",
  "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
  "assignment_id": "84918802-e9ce-4b35-9a7a-19f9401d488d",
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

`GET /api/rider/v1/orders/33f4eb80-0975-4f95-8684-bc3ac79ebbb6` → **200**

```json
{
  "id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "93ba4c95-0dac-43b0-85e9-ba09de25c89a",
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
    "id": "84918802-e9ce-4b35-9a7a-19f9401d488d",
    "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "093b39e4-e341-48c3-bc3c-7450984a4e71",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T07:29:35.852091Z",
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
    "id": "feb194f3-4a87-4a83-8fd4-16258913ff5d",
    "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
    "expires_at": "2026-10-28T07:29:51.002645Z",
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

`POST /api/driver/v1/offers/feb194f3-4a87-4a83-8fd4-16258913ff5d/accept` → **200**

```json
{
  "command_id": "fe3d2371-2dcf-42b3-9ba4-22c90f3adc9a"
}
```

```json
{
  "id": "b443dd82-a744-4438-a5f0-26ca624b7c3e",
  "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a04f43b7-df1d-44eb-850a-19f7ff60895f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a04f43b7-df1d-44eb-850a-19f7ff60895f",
  "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
  "assignment_id": "b443dd82-a744-4438-a5f0-26ca624b7c3e",
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

`POST /api/driver/v1/trips/a04f43b7-df1d-44eb-850a-19f7ff60895f/cancel` → **200**

```json
{
  "command_id": "c0ce1805-1e6c-4c46-9bfe-664bbc0f05f3",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "a04f43b7-df1d-44eb-850a-19f7ff60895f",
  "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
  "assignment_id": "b443dd82-a744-4438-a5f0-26ca624b7c3e",
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
    "id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:29:35.852091Z",
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
    "id": "db941f49-26fc-4ba2-9f51-14cab2f473d8",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:29:35.449663Z",
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

`GET /api/operator/v1/orders/33f4eb80-0975-4f95-8684-bc3ac79ebbb6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:29:35.852815Z",
      "actor": {
        "type": "CLIENT",
        "id": "93ba4c95-0dac-43b0-85e9-ba09de25c89a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
        "quote_id": "0b03ccd2-e6c1-4cc2-819e-6e91aeb8514e",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:29:35.855274Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
        "attempt_id": "2112b998-1312-465d-aa3a-e7dcb297b912",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:29:35.862925Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bb39fa46-9c79-4064-bddb-149af114d68c",
        "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:29:35.927682Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bb39fa46-9c79-4064-bddb-149af114d68c",
        "order_id": "33f4eb80-0975-4f95-8684-bc3ac79ebbb6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "84918802-e9ce-4b35-9a7a-19f9401d488d"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders db941f49-26fc-4ba2-9f51-14cab2f473d8, 33f4eb80-0975-4f95-8684-bc3ac79ebbb6.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732339902",
  "device_ref": "sandbox-19010"
}
```

```json
{
  "challenge_id": "088d7334-9c00-4da0-b158-07f65337f7c8",
  "expires_at": "2026-10-28T07:34:36.263307496Z",
  "resend_available_at": "2026-10-28T07:29:37.263307496Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732339902` → **200**

```json
{
  "phone": "+380732339902",
  "audience": "CLIENT",
  "code": "256500",
  "sent_at": "2026-10-28T07:29:36.266368064Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "088d7334-9c00-4da0-b158-07f65337f7c8",
  "code": "256500",
  "device_ref": "sandbox-19010"
}
```

```json
{
  "session_id": "aaa7a6d4-b8f8-4458-8880-634589b26e8d",
  "subject": {
    "type": "CLIENT",
    "id": "a661ad62-cd52-4852-828e-33754a654056"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjYxYWQ2Mi1jZDUyLTQ4NTItODI4ZS0zMzc1NGE2NTQwNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNDc2LCJpYXQiOjE3OTMxNzI1NzYsImp0aSI6ImYyYmUyMTZjLWZmODEtNDExYS05ZDQyLWVlZjk1MTA5ZmY5YyIsInNpZCI6ImFhYTdhNmQ0LWI4ZjgtNDQ1OC04ODgwLTYzNDU4OWIyNmU4ZCJ9._unyjtO5I35hEqMdwcot8VM2Wb-9HTChqK0Y4wckz84",
  "access_expires_at": "2026-10-28T07:44:36.324569662Z",
  "refresh_token": "VCnQKtG9Xygh9mkprU0hxIJeqJyhBZ7Wn3NkKgcX0AE",
  "refresh_expires_at": "2026-11-27T07:29:36.323945957Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "fa82a204-1768-4c82-a501-0e3407046c13",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e1935f6b-602a-4427-99d9-c6d85577f27c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e1935f6b-602a-4427-99d9-c6d85577f27c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "582775933caf4c006002940ec5255547",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e1935f6b-602a-4427-99d9-c6d85577f27c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732339902"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e1935f6b-602a-4427-99d9-c6d85577f27c",
  "expires_at": "2026-10-28T07:59:36.361222Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e1935f6b-602a-4427-99d9-c6d85577f27c` → **200**

```json
{
  "id": "e1935f6b-602a-4427-99d9-c6d85577f27c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T07:59:36.361222Z",
  "card": {
    "id": "eedd1cc4-c379-433b-9418-5dfbd0b8d3e2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3430",
    "card_type": "Visa",
    "created_at": "2026-10-28T07:29:36.408102Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "eedd1cc4-c379-433b-9418-5dfbd0b8d3e2",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3430",
      "card_type": "Visa",
      "created_at": "2026-10-28T07:29:36.408102Z"
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
  "device_ref": "sandbox-2498"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "39316ec3-5137-417f-a2af-77ae16e46cc6",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2498"
}
```

```json
{
  "challenge_id": "49818cbe-bffe-417e-8a67-d0bf229c8510",
  "expires_at": "2026-10-28T07:34:37.523920948Z",
  "resend_available_at": "2026-10-28T07:29:38.523920948Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "857163",
  "sent_at": "2026-10-28T07:29:37.526973149Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49818cbe-bffe-417e-8a67-d0bf229c8510",
  "code": "857163",
  "device_ref": "sandbox-2498"
}
```

```json
{
  "session_id": "216936c6-d9a2-4c60-ae7f-e8a46e673752",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzQ3NywiaWF0IjoxNzkzMTcyNTc3LCJqdGkiOiI3NTEwZWUxMC0xOTlkLTQ4YTgtODI0Ny02MjAxYzU2NzEyNTkiLCJzaWQiOiIyMTY5MzZjNi1kOWEyLTRjNjAtYWU3Zi1lOGE0NmU2NzM3NTIifQ.qlEEpKQFi00T-OcvgGWMzU13zSGaZArEeuRWbHecOiE",
  "access_expires_at": "2026-10-28T07:44:37.58377997Z",
  "refresh_token": "TCIX0VS59RZmTc5rxM5ku0Eo6JrSb3ztYU8Cze9VhWs",
  "refresh_expires_at": "2026-11-27T07:29:37.583006846Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "872ab972-1df9-455f-9a97-ff7350e79e4a",
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
  "last_heartbeat_at": "2026-10-28T07:29:35.771516Z",
  "last_location_at": "2026-10-28T07:29:35.771516Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/872ab972-1df9-455f-9a97-ff7350e79e4a/handover` → **200**

```json
{
  "command_id": "1b105a3a-8e20-4a7c-bc1e-177ee94adb10",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "872ab972-1df9-455f-9a97-ff7350e79e4a",
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
  "last_heartbeat_at": "2026-10-28T07:29:35.771516Z",
  "last_location_at": "2026-10-28T07:29:35.771516Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/872ab972-1df9-455f-9a97-ff7350e79e4a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:29:37Z",
    "sequence": 1793172577680
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "872ab972-1df9-455f-9a97-ff7350e79e4a",
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
  "last_heartbeat_at": "2026-10-28T07:29:37.70132Z",
  "last_location_at": "2026-10-28T07:29:37.70132Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5429c0e1-2356-45f9-9730-d61cbba7ee27",
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
  "id": "fae80b30-b468-4e37-a221-f1ca7fe86405",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-28T07:34:37.756980Z",
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
  "command_id": "10287020-536b-408c-81c7-0573f97cbd45",
  "quote_id": "fae80b30-b468-4e37-a221-f1ca7fe86405",
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
  "id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a661ad62-cd52-4852-828e-33754a654056",
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
  "created_at": "2026-10-28T07:29:37.798747Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/cdea6e3e-b037-46d5-ad4f-6539dacf5760` → **200**

```json
{
  "id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a661ad62-cd52-4852-828e-33754a654056",
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
  "created_at": "2026-10-28T07:29:37.798747Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/cdea6e3e-b037-46d5-ad4f-6539dacf5760` → **200**

```json
{
  "id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a661ad62-cd52-4852-828e-33754a654056",
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
  "created_at": "2026-10-28T07:29:37.798747Z",
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
    "id": "83bc710f-fdf8-49c6-a231-f123878daa66",
    "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
    "expires_at": "2026-10-28T07:29:52.930911Z",
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

`POST /api/driver/v1/offers/83bc710f-fdf8-49c6-a231-f123878daa66/accept` → **200**

```json
{
  "command_id": "da7daf22-fa63-4784-b68a-d0e19f6f53ed"
}
```

```json
{
  "id": "08803130-acea-4062-b165-891195f91059",
  "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b36373b1-c352-49fd-9f92-580ec9808166",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b36373b1-c352-49fd-9f92-580ec9808166",
  "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "assignment_id": "08803130-acea-4062-b165-891195f91059",
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

`POST /api/driver/v1/work-sessions/872ab972-1df9-455f-9a97-ff7350e79e4a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:29:38Z",
    "sequence": 1793172578991
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "872ab972-1df9-455f-9a97-ff7350e79e4a",
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
  "last_heartbeat_at": "2026-10-28T07:29:39.010813Z",
  "last_location_at": "2026-10-28T07:29:39.010813Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b36373b1-c352-49fd-9f92-580ec9808166/arrive` → **200**

```json
{
  "command_id": "f1067444-9cb7-439c-9978-d27b1554df15",
  "expected_version": 0
}
```

```json
{
  "id": "b36373b1-c352-49fd-9f92-580ec9808166",
  "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "assignment_id": "08803130-acea-4062-b165-891195f91059",
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
  "arrived_at": "2026-10-28T07:29:39.048723Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b36373b1-c352-49fd-9f92-580ec9808166/start` → **200**

```json
{
  "command_id": "9112e609-7857-4111-9ba5-e96124e59013",
  "expected_version": 1
}
```

```json
{
  "id": "b36373b1-c352-49fd-9f92-580ec9808166",
  "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "assignment_id": "08803130-acea-4062-b165-891195f91059",
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
  "arrived_at": "2026-10-28T07:29:39.048723Z",
  "started_at": "2026-10-28T07:29:39.090011Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b36373b1-c352-49fd-9f92-580ec9808166/complete` → **200**

```json
{
  "command_id": "6b023e08-f2e2-43fc-898f-a7bf7b1b80ad",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:29:39Z"
}
```

```json
{
  "id": "b36373b1-c352-49fd-9f92-580ec9808166",
  "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "assignment_id": "08803130-acea-4062-b165-891195f91059",
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
  "arrived_at": "2026-10-28T07:29:39.048723Z",
  "started_at": "2026-10-28T07:29:39.090011Z",
  "completed_at": "2026-10-28T07:29:39.134051Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/cdea6e3e-b037-46d5-ad4f-6539dacf5760` → **200**

```json
{
  "id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a661ad62-cd52-4852-828e-33754a654056",
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
    "id": "08803130-acea-4062-b165-891195f91059",
    "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b36373b1-c352-49fd-9f92-580ec9808166",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:29:37.798747Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/cdea6e3e-b037-46d5-ad4f-6539dacf5760` → **200**

```json
{
  "id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a661ad62-cd52-4852-828e-33754a654056",
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
    "id": "08803130-acea-4062-b165-891195f91059",
    "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b36373b1-c352-49fd-9f92-580ec9808166",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:29:37.798747Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/cdea6e3e-b037-46d5-ad4f-6539dacf5760` → **200**

```json
{
  "id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a661ad62-cd52-4852-828e-33754a654056",
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
    "id": "08803130-acea-4062-b165-891195f91059",
    "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b36373b1-c352-49fd-9f92-580ec9808166",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:29:37.798747Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/cdea6e3e-b037-46d5-ad4f-6539dacf5760` → **200**

```json
{
  "id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a661ad62-cd52-4852-828e-33754a654056",
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
    "id": "08803130-acea-4062-b165-891195f91059",
    "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b36373b1-c352-49fd-9f92-580ec9808166",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:29:37.798747Z",
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
      "id": "4ec2d3ea-2ef3-4cc7-946b-05f3c87f7df6",
      "at": "2026-10-28T07:29:39.974417Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/cdea6e3e-b037-46d5-ad4f-6539dacf5760/tip` → **200**

```json
{
  "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
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
  "available_until": "2026-10-29T07:29:39.134051Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/cdea6e3e-b037-46d5-ad4f-6539dacf5760/tip` → **201**

```json
{
  "command_id": "5f5d1604-38f7-42cf-90bf-e849cf0411ad",
  "amount_minor": 2500
}
```

```json
{
  "id": "34197470-d9e4-4c86-ad74-513ae6ea01ef",
  "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T07:29:42.378911Z"
}
```

`GET /api/rider/v1/orders/cdea6e3e-b037-46d5-ad4f-6539dacf5760/tip` → **200**

```json
{
  "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
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
  "available_until": "2026-10-29T07:29:39.134051Z",
  "open": false,
  "tip": {
    "id": "34197470-d9e4-4c86-ad74-513ae6ea01ef",
    "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T07:29:42.378911Z"
  }
}
```

`GET /api/rider/v1/orders/cdea6e3e-b037-46d5-ad4f-6539dacf5760/tip` → **200**

```json
{
  "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
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
  "available_until": "2026-10-29T07:29:39.134051Z",
  "open": false,
  "tip": {
    "id": "34197470-d9e4-4c86-ad74-513ae6ea01ef",
    "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T07:29:42.378911Z"
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
      "id": "4ec2d3ea-2ef3-4cc7-946b-05f3c87f7df6",
      "at": "2026-10-28T07:29:39.974417Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
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
      "id": "a4ee9c22-0813-4e05-b278-560db928f0d9",
      "at": "2026-10-28T07:29:44.023014Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
      "counterpart_id": null
    },
    {
      "id": "4ec2d3ea-2ef3-4cc7-946b-05f3c87f7df6",
      "at": "2026-10-28T07:29:39.974417Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "cdea6e3e-b037-46d5-ad4f-6539dacf5760",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "872ab972-1df9-455f-9a97-ff7350e79e4a",
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
  "last_heartbeat_at": "2026-10-28T07:29:39.010813Z",
  "last_location_at": "2026-10-28T07:29:39.010813Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/872ab972-1df9-455f-9a97-ff7350e79e4a/close` → **200**

```json
{
  "command_id": "bc077410-8c92-407e-ad6e-8f53bcf15e6d",
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

Done: card order cdea6e3e-b037-46d5-ad4f-6539dacf5760.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732975552",
  "device_ref": "sandbox-16583"
}
```

```json
{
  "challenge_id": "89a89a2d-6a87-467e-be1a-931a504318e7",
  "expires_at": "2026-10-28T07:34:44.598070991Z",
  "resend_available_at": "2026-10-28T07:29:45.598070991Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732975552` → **200**

```json
{
  "phone": "+380732975552",
  "audience": "CLIENT",
  "code": "757084",
  "sent_at": "2026-10-28T07:29:44.601163627Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89a89a2d-6a87-467e-be1a-931a504318e7",
  "code": "757084",
  "device_ref": "sandbox-16583"
}
```

```json
{
  "session_id": "347b0b17-32a7-4846-9115-55a0fe348c48",
  "subject": {
    "type": "CLIENT",
    "id": "40939fd2-60f9-4885-a2a2-e23ca99076f2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDkzOWZkMi02MGY5LTQ4ODUtYTJhMi1lMjNjYTk5MDc2ZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNDg0LCJpYXQiOjE3OTMxNzI1ODQsImp0aSI6IjI4N2Y0NWFkLTRlYWUtNGI4MC1hYzY3LWEyZWViZTFlZjgzZCIsInNpZCI6IjM0N2IwYjE3LTMyYTctNDg0Ni05MTE1LTU1YTBmZTM0OGM0OCJ9.MxxUpVfL_ewEMBzaK6jSL8oD0Gu4Qg7JehmlJDniY8o",
  "access_expires_at": "2026-10-28T07:44:44.659393752Z",
  "refresh_token": "gtTpt5QdChtjJOTHFwKxzhPq9XrSJbnpF-DkklKD-4o",
  "refresh_expires_at": "2026-11-27T07:29:44.658651784Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "dad15e35-27c3-4ae9-97b4-79c61cea38b9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "02eb8e5d-9fd7-41a1-a5f5-2a47299c2d3e",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-02eb8e5d-9fd7-41a1-a5f5-2a47299c2d3e",
    "orderDate": "1793172584",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "07a03dd20f4f8fa131355b1e09b8423a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=02eb8e5d-9fd7-41a1-a5f5-2a47299c2d3e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732975552"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=02eb8e5d-9fd7-41a1-a5f5-2a47299c2d3e",
  "created_at": "2026-10-28T07:29:44.694894Z",
  "expires_at": "2026-10-28T07:59:44.694894Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/02eb8e5d-9fd7-41a1-a5f5-2a47299c2d3e` → **200**

```json
{
  "id": "02eb8e5d-9fd7-41a1-a5f5-2a47299c2d3e",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T07:29:44.694894Z",
  "expires_at": "2026-10-28T07:59:44.694894Z",
  "completed_at": "2026-10-28T07:29:44.739738Z",
  "masked_pan": "41****4697",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "40939fd2-60f9-4885-a2a2-e23ca99076f2",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "40939fd2-60f9-4885-a2a2-e23ca99076f2",
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
      "id": "c14f0791-5dcb-4025-a2c5-dd5db8c342c5",
      "at": "2026-10-28T07:29:45.036469Z",
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
  "client_id": "40939fd2-60f9-4885-a2a2-e23ca99076f2",
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
      "id": "c14f0791-5dcb-4025-a2c5-dd5db8c342c5",
      "at": "2026-10-28T07:29:45.036469Z",
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
  "device_ref": "sandbox-9743"
}
```

```json
{
  "challenge_id": "9273b3bd-ca17-4053-ab20-22e5d1aff850",
  "expires_at": "2026-10-28T07:34:45.880605226Z",
  "resend_available_at": "2026-10-28T07:29:46.880605226Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "249317",
  "sent_at": "2026-10-28T07:29:45.883710716Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9273b3bd-ca17-4053-ab20-22e5d1aff850",
  "code": "249317",
  "device_ref": "sandbox-9743"
}
```

```json
{
  "session_id": "54839842-d814-46e6-acb0-7f8504a9f464",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzQ4NSwiaWF0IjoxNzkzMTcyNTg1LCJqdGkiOiIwZDViMzc4NS02YTJkLTQ1MWItYjIwNS05NzAwYzg3MWRhY2YiLCJzaWQiOiI1NDgzOTg0Mi1kODE0LTQ2ZTYtYWNiMC03Zjg1MDRhOWY0NjQifQ.W5G8-Q_FI0F0-gceJvciy3QbcipY1KmTbtNMAHvsR5I",
  "access_expires_at": "2026-10-28T07:44:45.941758992Z",
  "refresh_token": "gMWYQtlH6li6Bdhijdanflw1k5NZXF93f103s8adehg",
  "refresh_expires_at": "2026-11-27T07:29:45.940734809Z",
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
  "command_id": "4ea1e3ab-1abc-4130-a17e-862fe4479575",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "a43d5033-4c91-48b2-ad98-796a0686965e",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-a43d5033-4c91-48b2-ad98-796a0686965e",
    "orderDate": "1793172585",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "36e5200d94695a6a400db938a25a807a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=a43d5033-4c91-48b2-ad98-796a0686965e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=a43d5033-4c91-48b2-ad98-796a0686965e",
  "created_at": "2026-10-28T07:29:45.998262Z",
  "expires_at": "2026-10-28T07:59:45.998262Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/a43d5033-4c91-48b2-ad98-796a0686965e` → **200**

```json
{
  "id": "a43d5033-4c91-48b2-ad98-796a0686965e",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T07:29:45.998262Z",
  "expires_at": "2026-10-28T07:59:45.998262Z",
  "completed_at": "2026-10-28T07:29:46.030854Z",
  "masked_pan": "41****9157",
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
      "id": "7733bf2e-0a79-4dd8-a925-909194dba23b",
      "at": "2026-10-28T07:29:46.041703Z",
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
  "command_id": "016dd2ad-bc2c-4e47-bcd2-cc9022ee7381",
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
  "correlation_id": "815c6b75-6ad8-424c-a5be-0e911bbf55ba"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675812769",
  "device_ref": "sandbox-21924"
}
```

```json
{
  "challenge_id": "a7df2a2e-3cab-4f7a-aa3b-80f3a5fcf404",
  "expires_at": "2026-10-28T07:34:46.152935915Z",
  "resend_available_at": "2026-10-28T07:29:47.152935915Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675812769` → **200**

```json
{
  "phone": "+380675812769",
  "audience": "CLIENT",
  "code": "693034",
  "sent_at": "2026-10-28T07:29:46.156056108Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7df2a2e-3cab-4f7a-aa3b-80f3a5fcf404",
  "code": "693034",
  "device_ref": "sandbox-21924"
}
```

```json
{
  "session_id": "b9cace51-680c-4763-a33b-c66b28afcc2f",
  "subject": {
    "type": "CLIENT",
    "id": "a3f13904-c625-4cf0-84ff-cf747902212a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2YxMzkwNC1jNjI1LTRjZjAtODRmZi1jZjc0NzkwMjIxMmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNDg2LCJpYXQiOjE3OTMxNzI1ODYsImp0aSI6IjAzM2MzNWQxLWYyZjctNGQyMy1iMTBlLWMyMmI2MjFkODM1OCIsInNpZCI6ImI5Y2FjZTUxLTY4MGMtNDc2My1hMzNiLWM2NmIyOGFmY2MyZiJ9.Ihqjx95b6A6ajiqzNtYWFTDt2YRrB99_0H7nfOBrAyw",
  "access_expires_at": "2026-10-28T07:44:46.211544119Z",
  "refresh_token": "ggIFmNHnL_QaVBZ13eNwInDEg14gH_5jaMKc1CIFf1g",
  "refresh_expires_at": "2026-11-27T07:29:46.210800756Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a3f13904-c625-4cf0-84ff-cf747902212a",
  "session_id": "b9cace51-680c-4763-a33b-c66b28afcc2f",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ecd76331-1dca-43c5-9b1b-a20d67bf72bd",
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
  "id": "1ae70e54-5ac7-4f40-9235-c3cef5676dbf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:34:46.277640Z",
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
  "challenge_id": "29ce193e-0e1b-491b-a977-77c3d89df72b",
  "expires_at": "2026-10-28T07:34:48.315629503Z",
  "resend_available_at": "2026-10-28T07:29:49.315629503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675812769` → **200**

```json
{
  "phone": "+380675812769",
  "audience": "CLIENT",
  "code": "629509",
  "sent_at": "2026-10-28T07:29:48.318708501Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "2a4b412a-6074-4a9b-90ae-31fb4ccc9bb8",
  "challenge_id": "29ce193e-0e1b-491b-a977-77c3d89df72b",
  "otp_code": "629509"
}
```

```json
{
  "client_id": "a3f13904-c625-4cf0-84ff-cf747902212a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T07:29:48.387795209Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "83b87ba4-42af-437b-8b0c-3bd8c206eb81",
  "quote_id": "1ae70e54-5ac7-4f40-9235-c3cef5676dbf",
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
  "correlation_id": "f79cf936-5879-4297-a153-6308128e7ddc"
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
  "session_id": "4e0ef143-d1a6-43f8-93ab-8d584d017050",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM0ODgsImlhdCI6MTc5MzE3MjU4OCwianRpIjoiMjMzMzdjODEtYTYxMy00YzVhLWFjMDQtNTZmYjU1NTA5OWNhIiwic2lkIjoiNGUwZWYxNDMtZDFhNi00M2Y4LTkzYWItOGQ1ODRkMDE3MDUwIn0.FGQwHDgni0IJMQkhWwHGPRBFIY52ygAYAeMY3mK7Z54",
  "access_expires_at": "2026-10-28T07:44:48.761739343Z",
  "refresh_token": "Zj2HBz_hrcDf2oR_XeJDGOPOEpSNqQbsZTI4V8IXTOA",
  "refresh_expires_at": "2026-10-28T19:29:48.761131378Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "a3f13904-c625-4cf0-84ff-cf747902212a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T07:29:48.387795Z",
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

`POST /api/admin/v1/client-deletions/a3f13904-c625-4cf0-84ff-cf747902212a/complete` → **200**

```json
{
  "command_id": "9505b8be-12c3-48f5-8eb3-9176b9b3f60d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "a3f13904-c625-4cf0-84ff-cf747902212a",
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
  "correlation_id": "432576ff-3a85-4381-9d9a-25924105bf28"
}
```

Done: client a3f13904-c625-4cf0-84ff-cf747902212a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663905418",
  "device_ref": "sandbox-24166"
}
```

```json
{
  "challenge_id": "6f169fda-d318-4429-aad7-7f271d8e7203",
  "expires_at": "2026-10-28T07:34:48.913699351Z",
  "resend_available_at": "2026-10-28T07:29:49.913699351Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663905418` → **200**

```json
{
  "phone": "+380663905418",
  "audience": "CLIENT",
  "code": "651748",
  "sent_at": "2026-10-28T07:29:48.917447959Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f169fda-d318-4429-aad7-7f271d8e7203",
  "code": "651748",
  "device_ref": "sandbox-24166"
}
```

```json
{
  "session_id": "49ed0fad-d11b-4ce9-8433-d9eb7285def3",
  "subject": {
    "type": "CLIENT",
    "id": "bf34764e-d334-4cb0-a33e-fcc89bdf768d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjM0NzY0ZS1kMzM0LTRjYjAtYTMzZS1mY2M4OWJkZjc2OGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNDg4LCJpYXQiOjE3OTMxNzI1ODgsImp0aSI6IjJlNmQ3NzY1LTkxOTktNDg2Mi1iMWIzLTE1MzkyYjA3NTU0MiIsInNpZCI6IjQ5ZWQwZmFkLWQxMWItNGNlOS04NDMzLWQ5ZWI3Mjg1ZGVmMyJ9.0HrVqMhn5nRgYMsniKn1KqlY3ydeSN7udlW5ZHwdacY",
  "access_expires_at": "2026-10-28T07:44:48.979307887Z",
  "refresh_token": "8UP83TZv-MbYJnsWDQFnpgUd9Md7zxKNE5ZZ2EO1eTI",
  "refresh_expires_at": "2026-11-27T07:29:48.978307128Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bf34764e-d334-4cb0-a33e-fcc89bdf768d",
  "session_id": "49ed0fad-d11b-4ce9-8433-d9eb7285def3",
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
  "session_id": "fca23c41-6bba-4aca-a1a2-f67a6c1c83d9",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM0ODksImlhdCI6MTc5MzE3MjU4OSwianRpIjoiNTc5NTBlYTMtYzQ5Yy00MzFhLThkYzYtNzgyM2U4YjVkNzhiIiwic2lkIjoiZmNhMjNjNDEtNmJiYS00YWNhLWExYTItZjY3YTZjMWM4M2Q5In0.gP_burU8KcinuefVAYyjGrszb_9DUKHD3J7WcERgXJU",
  "access_expires_at": "2026-10-28T07:44:49.331888458Z",
  "refresh_token": "tK0JDl7tqVlWXZIzwnL64d1vIolbVGA3kO7__KWaExw",
  "refresh_expires_at": "2026-10-28T19:29:49.331303215Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3905418&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "bf34764e-d334-4cb0-a33e-fcc89bdf768d",
      "phone": "+380663905418",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T07:29:48.975403Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/bf34764e-d334-4cb0-a33e-fcc89bdf768d` → **200**

```json
{
  "client": {
    "id": "bf34764e-d334-4cb0-a33e-fcc89bdf768d",
    "phone": "+380663905418",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T07:29:48.975403Z",
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

`POST /api/admin/v1/clients/bf34764e-d334-4cb0-a33e-fcc89bdf768d/block` → **400**

```json
{
  "command_id": "dc457acc-432d-4eeb-b83d-548f7e92e977",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/bf34764e-d334-4cb0-a33e-fcc89bdf768d/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "997089a4-946d-487a-ab00-d22bd01d6bbb",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/bf34764e-d334-4cb0-a33e-fcc89bdf768d/block` → **200**

```json
{
  "command_id": "f2b307be-6809-4245-a6f7-93602b486eee",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "bf34764e-d334-4cb0-a33e-fcc89bdf768d",
  "phone": "+380663905418",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T07:29:48.975403Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T07:29:49.49857Z",
    "by": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
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
  "correlation_id": "5184d599-c853-431c-97f9-b502fec5d35e"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663905418",
  "device_ref": "sandbox-21684"
}
```

```json
{
  "challenge_id": "a3dd26fe-8c86-45f3-b42c-d0774869b2ae",
  "expires_at": "2026-10-28T07:34:51.561949086Z",
  "resend_available_at": "2026-10-28T07:29:52.561949086Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663905418` → **200**

```json
{
  "phone": "+380663905418",
  "audience": "CLIENT",
  "code": "028002",
  "sent_at": "2026-10-28T07:29:51.564685043Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "a3dd26fe-8c86-45f3-b42c-d0774869b2ae",
  "code": "028002",
  "device_ref": "sandbox-21684"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "54b86f40-1af7-45e8-b499-471308cab235"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/bf34764e-d334-4cb0-a33e-fcc89bdf768d` → **200**

```json
{
  "client": {
    "id": "bf34764e-d334-4cb0-a33e-fcc89bdf768d",
    "phone": "+380663905418",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T07:29:48.975403Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T07:29:49.49857Z",
      "by": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
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

`POST /api/admin/v1/clients/bf34764e-d334-4cb0-a33e-fcc89bdf768d/unblock` → **200**

```json
{
  "command_id": "6f1d6434-3cbe-4e68-a038-4010c997482c",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "bf34764e-d334-4cb0-a33e-fcc89bdf768d",
  "phone": "+380663905418",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T07:29:48.975403Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663905418",
  "device_ref": "sandbox-13105"
}
```

```json
{
  "challenge_id": "4d6d2876-67e8-4fb6-b48f-a19e2061dce1",
  "expires_at": "2026-10-28T07:34:53.722015486Z",
  "resend_available_at": "2026-10-28T07:29:54.722015486Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663905418` → **200**

```json
{
  "phone": "+380663905418",
  "audience": "CLIENT",
  "code": "995246",
  "sent_at": "2026-10-28T07:29:53.725186688Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d6d2876-67e8-4fb6-b48f-a19e2061dce1",
  "code": "995246",
  "device_ref": "sandbox-13105"
}
```

```json
{
  "session_id": "3523cacb-8aa9-4852-b3fb-aea6cb5a41c7",
  "subject": {
    "type": "CLIENT",
    "id": "bf34764e-d334-4cb0-a33e-fcc89bdf768d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjM0NzY0ZS1kMzM0LTRjYjAtYTMzZS1mY2M4OWJkZjc2OGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNDkzLCJpYXQiOjE3OTMxNzI1OTMsImp0aSI6IjZiNTdmNmM4LTJjNTgtNDlmMS04MjI1LTc2MjBkOWM5OTBkYSIsInNpZCI6IjM1MjNjYWNiLThhYTktNDg1Mi1iM2ZiLWFlYTZjYjVhNDFjNyJ9.UHJJ4BncdsQqmQ4BIZ-y0MXLj2fqQAKEk9rcm4Rk4TU",
  "access_expires_at": "2026-10-28T07:44:53.78324399Z",
  "refresh_token": "vNHi3WdGzyzbdTIH2Cna5qIRsgApc-genCN-IrdiJ3M",
  "refresh_expires_at": "2026-11-27T07:29:53.782548799Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bf34764e-d334-4cb0-a33e-fcc89bdf768d",
  "session_id": "3523cacb-8aa9-4852-b3fb-aea6cb5a41c7",
  "account_state": "ACTIVE"
}
```

Done: found, blocked (signed out, sign-in refused) and unblocked.

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
  "device_ref": "sandbox-23034"
}
```

```json
{
  "challenge_id": "88ac3c00-f7b1-4ca9-b466-a9ef7435938a",
  "expires_at": "2026-10-28T07:34:53.878298271Z",
  "resend_available_at": "2026-10-28T07:29:54.878298271Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "534021",
  "sent_at": "2026-10-28T07:29:53.881196822Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88ac3c00-f7b1-4ca9-b466-a9ef7435938a",
  "code": "534021",
  "device_ref": "sandbox-23034"
}
```

```json
{
  "session_id": "23fa6b0f-9537-425f-80a9-bc54e4820432",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzQ5MywiaWF0IjoxNzkzMTcyNTkzLCJqdGkiOiJlYWE0OGQ3Yi0wMTk4LTQ2YTQtOTY5Mi04YjMyZTg5ZDRkNmIiLCJzaWQiOiIyM2ZhNmIwZi05NTM3LTQyNWYtODBhOS1iYzU0ZTQ4MjA0MzIifQ.tx1quVIVRcITR-EJrEd-8xX86du8YvAjBXjvmlN8sd4",
  "access_expires_at": "2026-10-28T07:44:53.938165481Z",
  "refresh_token": "lW8a9AW9Yt9FKQgRAcsdOkfJwACXH17FVLQXMTy-CIA",
  "refresh_expires_at": "2026-11-27T07:29:53.937558036Z",
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
  "command_id": "a0c28fd9-810d-4e62-a564-0f862245f0b6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:29:53Z",
    "sequence": 1793172593990
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:29:54.00903Z",
  "last_location_at": "2026-10-28T07:29:54.00903Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677798367",
  "device_ref": "sandbox-8914"
}
```

```json
{
  "challenge_id": "3da8d840-ed11-4c39-9e58-b5c20677efc4",
  "expires_at": "2026-10-28T07:34:54.04312007Z",
  "resend_available_at": "2026-10-28T07:29:55.04312007Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677798367` → **200**

```json
{
  "phone": "+380677798367",
  "audience": "CLIENT",
  "code": "770441",
  "sent_at": "2026-10-28T07:29:54.045997056Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3da8d840-ed11-4c39-9e58-b5c20677efc4",
  "code": "770441",
  "device_ref": "sandbox-8914"
}
```

```json
{
  "session_id": "6a9b9028-7c92-49d7-8e9e-5c4b247a7eb7",
  "subject": {
    "type": "CLIENT",
    "id": "6854957c-5cf7-4c2d-979a-9f6d61f0c308"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODU0OTU3Yy01Y2Y3LTRjMmQtOTc5YS05ZjZkNjFmMGMzMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNDk0LCJpYXQiOjE3OTMxNzI1OTQsImp0aSI6IjY3NWUxZjUyLTQ1MTUtNGE4Ni05M2JiLTViNDYzYmViYWI3MCIsInNpZCI6IjZhOWI5MDI4LTdjOTItNDlkNy04ZTllLTVjNGIyNDdhN2ViNyJ9.zibwNa5Ll5BuMKbHRyTPIJ4CgHkhRXWrqrstt0jTAYg",
  "access_expires_at": "2026-10-28T07:44:54.104111721Z",
  "refresh_token": "3lK_kuDLnP7MkTl4ItsoqRC1bRrb3pfB7kibVo1haEI",
  "refresh_expires_at": "2026-11-27T07:29:54.103529344Z",
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
  "command_id": "36a5c588-a632-4c2c-873d-ffcd33b50a00",
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
  "id": "77c00a99-7c55-4bf8-968d-f18e1b5e1d63",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:34:54.169889Z",
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
  "command_id": "c8ad52ee-325f-4f07-8eaa-a3c9fc3e166d",
  "platform": "ANDROID",
  "token": "sandbox-driver-b3c8ae97-e717-4def-8a89-97893a81b0c1"
}
```

```json
{
  "id": "a14efe50-4cf7-4054-84a2-2e7fdd53808b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T07:29:54.214029Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "3be01142-9ead-45c3-8097-04c720798f5f",
  "platform": "ANDROID",
  "token": "sandbox-rider-9c9fe8a1-511a-4cf3-8cf3-a1069a1d75b4"
}
```

```json
{
  "id": "b22182a3-d200-49c2-bc67-faac9fea2eb1",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T07:29:54.250024Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a195055b-ef2c-4732-aa39-616be2eb8ce3",
  "quote_id": "77c00a99-7c55-4bf8-968d-f18e1b5e1d63",
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
  "id": "281d25aa-4283-456d-9f26-b7d3df48253e",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6854957c-5cf7-4c2d-979a-9f6d61f0c308",
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
  "created_at": "2026-10-28T07:29:54.293129Z",
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
    "id": "081af09b-fb2a-4c56-b454-db7d64dfa746",
    "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
    "expires_at": "2026-10-28T07:30:09.29634Z",
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

`POST /api/driver/v1/offers/081af09b-fb2a-4c56-b454-db7d64dfa746/accept` → **200**

```json
{
  "command_id": "8c48c86e-5f2f-4f0a-ae51-adb2de722948"
}
```

```json
{
  "id": "4c62ac86-f9d9-4186-b688-3da096823dcc",
  "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c16cd8ac-dad6-4c0f-a201-e7beec93fdaa",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:29:54.269Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:29:54.269Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:29:54.269Z` → **200**

```json
[
  {
    "at": "2026-10-28T07:29:55.785687532Z",
    "token_suffix": "81b0c1",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "fc8ecf02-2a3d-45a8-bf6d-17b774e519de",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677798367&after=2026-10-28T07:29:54.269Z` → **200**

```json
[
  {
    "at": "2026-10-28T07:29:55.787811684Z",
    "token_suffix": "1d75b4",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "fe886593-7e9f-4cda-871e-0631dbf08b37",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/281d25aa-4283-456d-9f26-b7d3df48253e/messages` → **201**

```json
{
  "command_id": "6f978cd0-1d86-435f-8f7d-bec3b835f442",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "b7ab418b-a68d-4db4-948b-d87e791955df",
  "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T07:29:56.513369057Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c16cd8ac-dad6-4c0f-a201-e7beec93fdaa",
  "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
  "assignment_id": "4c62ac86-f9d9-4186-b688-3da096823dcc",
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

`POST /api/driver/v1/trips/c16cd8ac-dad6-4c0f-a201-e7beec93fdaa/messages` → **201**

```json
{
  "command_id": "28722aa7-c43f-4412-b34b-56a29c09dc04",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "5804d14d-c5ba-4eca-8092-e0ae0c4fc238",
  "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T07:29:56.568872205Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/281d25aa-4283-456d-9f26-b7d3df48253e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/c16cd8ac-dad6-4c0f-a201-e7beec93fdaa/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677798367"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/e906e256-fd99-472c-98d0-5c9e918f6167/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:29:56Z",
    "sequence": 1793172596650
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:29:56.670102Z",
  "last_location_at": "2026-10-28T07:29:56.670102Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c16cd8ac-dad6-4c0f-a201-e7beec93fdaa",
  "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
  "assignment_id": "4c62ac86-f9d9-4186-b688-3da096823dcc",
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

`POST /api/driver/v1/trips/c16cd8ac-dad6-4c0f-a201-e7beec93fdaa/arrive` → **200**

```json
{
  "command_id": "11193eed-8dee-46f8-89cd-cc597a34bddc",
  "expected_version": 0
}
```

```json
{
  "id": "c16cd8ac-dad6-4c0f-a201-e7beec93fdaa",
  "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
  "assignment_id": "4c62ac86-f9d9-4186-b688-3da096823dcc",
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
  "arrived_at": "2026-10-28T07:29:56.727642Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c16cd8ac-dad6-4c0f-a201-e7beec93fdaa/start` → **200**

```json
{
  "command_id": "873b09ea-bf16-43bb-a98d-6f344bac7355",
  "expected_version": 1
}
```

```json
{
  "id": "c16cd8ac-dad6-4c0f-a201-e7beec93fdaa",
  "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
  "assignment_id": "4c62ac86-f9d9-4186-b688-3da096823dcc",
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
  "arrived_at": "2026-10-28T07:29:56.727642Z",
  "started_at": "2026-10-28T07:29:56.766566Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e906e256-fd99-472c-98d0-5c9e918f6167/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:29:56Z",
    "sequence": 1793172596794
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:29:56.81421Z",
  "last_location_at": "2026-10-28T07:29:56.81421Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/c16cd8ac-dad6-4c0f-a201-e7beec93fdaa/complete` → **200**

```json
{
  "command_id": "30e2e5b0-6a5c-444e-8a15-351494472f0c",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:29:56Z",
  "cash_received": true
}
```

```json
{
  "id": "c16cd8ac-dad6-4c0f-a201-e7beec93fdaa",
  "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
  "assignment_id": "4c62ac86-f9d9-4186-b688-3da096823dcc",
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
  "arrived_at": "2026-10-28T07:29:56.727642Z",
  "started_at": "2026-10-28T07:29:56.766566Z",
  "completed_at": "2026-10-28T07:29:56.852317Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/281d25aa-4283-456d-9f26-b7d3df48253e` → **200**

```json
{
  "id": "281d25aa-4283-456d-9f26-b7d3df48253e",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6854957c-5cf7-4c2d-979a-9f6d61f0c308",
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
    "id": "4c62ac86-f9d9-4186-b688-3da096823dcc",
    "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c16cd8ac-dad6-4c0f-a201-e7beec93fdaa",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:29:54.293129Z",
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
    "id": "281d25aa-4283-456d-9f26-b7d3df48253e",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-28T07:29:54.293129Z",
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
    "id": "c16cd8ac-dad6-4c0f-a201-e7beec93fdaa",
    "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
    "order_short_number": 5,
    "created_at": "2026-10-28T07:29:54.364026Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "27da40a1-deba-4c7e-b4dd-74e8a0e452a8",
    "order_id": "5aeb06ce-cfc6-4875-9b31-1cc20c461328",
    "order_short_number": 1,
    "created_at": "2026-10-28T07:29:27.858441Z",
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

`GET /api/rider/v1/orders/281d25aa-4283-456d-9f26-b7d3df48253e/tip` → **200**

```json
{
  "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
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
  "available_until": "2026-10-29T07:29:56.852317Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/281d25aa-4283-456d-9f26-b7d3df48253e/tip` → **201**

```json
{
  "command_id": "b041c923-5bab-4c01-a8e5-37f098c2752c",
  "amount_minor": 1100
}
```

```json
{
  "id": "50a47a67-d1d8-483c-93a8-8a44b8c8b8c4",
  "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T07:30:00.076997Z"
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
  "session_id": "bfa66577-7847-447b-b352-04bfa9b7f488",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MDAsImlhdCI6MTc5MzE3MjYwMCwianRpIjoiMDg3ZjhhMzEtYWIzZC00ODNmLTk0NmQtNTFjYzhhODAyOWYwIiwic2lkIjoiYmZhNjY1NzctNzg0Ny00NDdiLWIzNTItMDRiZmE5YjdmNDg4In0.uSEz--sfC9uJo00HRKWqdsJshabbQBoq_kRt4DIGWVQ",
  "access_expires_at": "2026-10-28T07:45:00.403927224Z",
  "refresh_token": "qJhxtaHEC_DqfNL71AWmw0lAcwdIONONDHMmQLkJTaw",
  "refresh_expires_at": "2026-10-28T19:30:00.403317576Z",
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
        "created": 5,
        "fulfilled": 3,
        "cancelled": 2,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 5
        },
        "by_payment": {
          "CASH": 4,
          "CARD": 1
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
      "CASH": 4,
      "CARD": 1
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
  "generated_at": "2026-10-28T07:30:00.436104347Z"
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
  "generated_at": "2026-10-28T07:30:00.46808948Z"
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
  "session_id": "2562779c-d0b5-486c-affd-576943bae47d",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MDAsImlhdCI6MTc5MzE3MjYwMCwianRpIjoiMTIyNTBiYzAtYjJiNi00ODc2LWIyY2MtYzgzMTUzNDNhMTU0Iiwic2lkIjoiMjU2Mjc3OWMtZDBiNS00ODZjLWFmZmQtNTc2OTQzYmFlNDdkIn0.rPH-h0v2iTB9rTbibVSsyZx_9abFjqBY_37NGGHbBeg",
  "access_expires_at": "2026-10-28T07:45:00.789544012Z",
  "refresh_token": "dcAt5qvrsb1DtxB_zHNJAKSkDe7X4fySButW7CcG3VE",
  "refresh_expires_at": "2026-10-28T19:30:00.788871134Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/281d25aa-4283-456d-9f26-b7d3df48253e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:29:54.293779Z",
      "actor": {
        "type": "CLIENT",
        "id": "6854957c-5cf7-4c2d-979a-9f6d61f0c308",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
        "quote_id": "77c00a99-7c55-4bf8-968d-f18e1b5e1d63",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:29:54.29555Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
        "attempt_id": "44e8f1b7-a0fc-4eec-9b4f-faeabf08fbbb",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:29:54.301079Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "081af09b-fb2a-4c56-b454-db7d64dfa746",
        "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:29:54.366239Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "081af09b-fb2a-4c56-b454-db7d64dfa746",
        "order_id": "281d25aa-4283-456d-9f26-b7d3df48253e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "4c62ac86-f9d9-4186-b688-3da096823dcc"
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
  "at": "2026-10-28T07:30:00.842646303Z",
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
      "last_location_at": "2026-10-28T07:29:56.81421Z",
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
      "last_location_at": "2026-10-28T07:29:35.607886Z",
      "order_id": null
    }
  ]
}
```

Done: order 281d25aa-4283-456d-9f26-b7d3df48253e.

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
  "session_id": "b14119a1-d345-4ea4-8b45-1b2e75318d66",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MDEsImlhdCI6MTc5MzE3MjYwMSwianRpIjoiMTNhNzdiNTMtNmYwNy00NDhmLWI2NmQtNWZhOWZjYWQzODkxIiwic2lkIjoiYjE0MTE5YTEtZDM0NS00ZWE0LThiNDUtMWIyZTc1MzE4ZDY2In0.-ULaFAEB9ucsFOcDgR9v49dnMh-s0rpLlM6E2d2sEto",
  "access_expires_at": "2026-10-28T07:45:01.180643533Z",
  "refresh_token": "4Whzf4Cd_JgO93TQZFopuNDMr1grq3ll6WtIpmJ_GkI",
  "refresh_expires_at": "2026-10-28T19:30:01.180004827Z",
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
  "command_id": "ae1a3d65-e740-465e-9ac1-dede31eb4c31",
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
  "timestamp": "2026-10-28T07:30:01.000+0000",
  "channel": {
    "id": "1730052000.434117027",
    "linkedid": "1730052000.434117027",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671635116"
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
  "timestamp": "2026-10-28T07:30:01.000+0000",
  "channel": {
    "id": "1730052000.434117027",
    "linkedid": "1730052000.434117027",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671635116"
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
  "session_id": "59898934-6704-4abb-9f55-d178a36228ad",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MDEsImlhdCI6MTc5MzE3MjYwMSwianRpIjoiM2QxYmRjZDUtMTdlYi00ZTcwLWJiMzYtMGZkY2JhMmFlYzAzIiwic2lkIjoiNTk4OTg5MzQtNjcwNC00YWJiLTlmNTUtZDE3OGEzNjIyOGFkIn0.qbhy9HyXErAK4AxrfiDlHOxV40Vr5S680aVMsd5dsdQ",
  "access_expires_at": "2026-10-28T07:45:01.612225034Z",
  "refresh_token": "iEV99hSod-ekOg62AY8Lay02LPVadMILnTK4e0x2_yI",
  "refresh_expires_at": "2026-10-28T19:30:01.611643749Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "54edabee-6e20-430c-b9e9-b6a1cfa325ff",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671635116",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:30:01Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/54edabee-6e20-430c-b9e9-b6a1cfa325ff/answer` → **200**

```json
{
  "command_id": "d479fb28-32ea-4037-99e1-c2de4dbd4ef1"
}
```

```json
{
  "id": "54edabee-6e20-430c-b9e9-b6a1cfa325ff",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671635116",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "order_ids": [],
  "started_at": "2026-10-28T07:30:01Z",
  "answered_at": "2026-10-28T07:30:01.685739Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.434117027",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d2b5de78-0a71-47b8-a08e-040debe16042",
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
  "id": "32c80023-19ee-4130-8ecb-b5eb7f993b64",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:35:01.751687Z",
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
  "command_id": "39f0b65a-6158-400f-a28f-570f4a72f87f",
  "quote_id": "32c80023-19ee-4130-8ecb-b5eb7f993b64",
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
    "phone": "+380671635116"
  },
  "call_id": "54edabee-6e20-430c-b9e9-b6a1cfa325ff"
}
```

```json
{
  "id": "89b10ff8-82c3-422c-956a-a43b57040a9a",
  "short_number": 6,
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
  "created_at": "2026-10-28T07:30:01.814142Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671635116"
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
    "id": "1730052000.434117027",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "54edabee-6e20-430c-b9e9-b6a1cfa325ff",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671635116",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
      "order_ids": [
        "89b10ff8-82c3-422c-956a-a43b57040a9a"
      ],
      "started_at": "2026-10-28T07:30:01Z",
      "answered_at": "2026-10-28T07:30:01.685739Z",
      "ended_at": "2026-10-28T07:30:01.86741Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "b5aaee5e-8182-4336-a63f-5c7e127866ef",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672642976",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
      "order_ids": [],
      "started_at": "2026-10-28T07:29:32.13837Z",
      "answered_at": "2026-10-28T07:29:32.201077Z",
      "ended_at": "2026-10-28T07:29:32.253418Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:29:33.644853Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/89b10ff8-82c3-422c-956a-a43b57040a9a` → **200**

```json
{
  "id": "89b10ff8-82c3-422c-956a-a43b57040a9a",
  "short_number": 6,
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
  "created_at": "2026-10-28T07:30:01.814142Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671635116"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/89b10ff8-82c3-422c-956a-a43b57040a9a` → **200**

```json
{
  "id": "89b10ff8-82c3-422c-956a-a43b57040a9a",
  "short_number": 6,
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
  "created_at": "2026-10-28T07:30:01.814142Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671635116"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/89b10ff8-82c3-422c-956a-a43b57040a9a/cancel` → **200**

```json
{
  "command_id": "61ada839-8b5f-4ae2-96a7-dd3615f3b49e",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "89b10ff8-82c3-422c-956a-a43b57040a9a",
  "short_number": 6,
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
  "created_at": "2026-10-28T07:30:01.814142Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671635116"
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

Done: call 54edabee-6e20-430c-b9e9-b6a1cfa325ff with order 89b10ff8-82c3-422c-956a-a43b57040a9a.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21210"
}
```

```json
{
  "challenge_id": "ec9ecf11-6174-430b-94a4-4eb898e650de",
  "expires_at": "2026-10-28T07:35:02.037237739Z",
  "resend_available_at": "2026-10-28T07:30:03.037237739Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "036763",
  "sent_at": "2026-10-28T07:30:02.039694359Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec9ecf11-6174-430b-94a4-4eb898e650de",
  "code": "036763",
  "device_ref": "sandbox-21210"
}
```

```json
{
  "session_id": "8cce50b7-38f5-4ec0-bb48-b85916995ad6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzUwMiwiaWF0IjoxNzkzMTcyNjAyLCJqdGkiOiIyMDMwOGUwZi05ZTczLTQzYmQtYmY1Yi0xYTM5MjRiY2VhNTMiLCJzaWQiOiI4Y2NlNTBiNy0zOGY1LTRlYzAtYmI0OC1iODU5MTY5OTVhZDYifQ.DhlIbi02cBKyOf2S3-tOw-yXqY0APquiFdhOtrbVxSo",
  "access_expires_at": "2026-10-28T07:45:02.097006254Z",
  "refresh_token": "h5_qQD3ESjChjrc9HumnWprAid4S97nfzuHuZFkNCw0",
  "refresh_expires_at": "2026-11-27T07:30:02.09637594Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:29:56.81421Z",
  "last_location_at": "2026-10-28T07:29:56.81421Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e906e256-fd99-472c-98d0-5c9e918f6167/handover` → **200**

```json
{
  "command_id": "3749094b-38ef-4f24-8b78-1bd6f05984f0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:29:56.81421Z",
  "last_location_at": "2026-10-28T07:29:56.81421Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e906e256-fd99-472c-98d0-5c9e918f6167/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:02Z",
    "sequence": 1793172602186
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:30:02.205791Z",
  "last_location_at": "2026-10-28T07:30:02.205791Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660972820",
  "device_ref": "sandbox-16730"
}
```

```json
{
  "challenge_id": "b4051418-722c-4fad-80ca-9ace9214b092",
  "expires_at": "2026-10-28T07:35:02.231329988Z",
  "resend_available_at": "2026-10-28T07:30:03.231329988Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660972820` → **200**

```json
{
  "phone": "+380660972820",
  "audience": "CLIENT",
  "code": "732951",
  "sent_at": "2026-10-28T07:30:02.233632468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4051418-722c-4fad-80ca-9ace9214b092",
  "code": "732951",
  "device_ref": "sandbox-16730"
}
```

```json
{
  "session_id": "9bd805d4-a4d8-4788-93de-b32bf17b7310",
  "subject": {
    "type": "CLIENT",
    "id": "aefb25db-a1f1-465c-8e0a-c8edb74f2a91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZWZiMjVkYi1hMWYxLTQ2NWMtOGUwYS1jOGVkYjc0ZjJhOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNTAyLCJpYXQiOjE3OTMxNzI2MDIsImp0aSI6ImNmNmI2Nzk3LTNkZGEtNDNlNi1iODgyLTQ5NGM5N2I3NmU2YyIsInNpZCI6IjliZDgwNWQ0LWE0ZDgtNDc4OC05M2RlLWIzMmJmMTdiNzMxMCJ9.JUWsLWOihw7bzFmZIX4ZkuFBymG_UnhmXHzj2ZoYqs8",
  "access_expires_at": "2026-10-28T07:45:02.288906685Z",
  "refresh_token": "aOpYVTajs9HtHUiRKwPcFAMmjHZ5S1JEBUF-fw0DwW0",
  "refresh_expires_at": "2026-11-27T07:30:02.288278021Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a961a04b-49ec-4ce7-b878-ba1cae190181",
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
  "id": "e8b3cffc-fcaa-4285-9e58-9237fa9996cf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-28T07:35:02.322990Z",
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
  "command_id": "46172030-c48e-4918-8540-0f7d23ed705b",
  "quote_id": "e8b3cffc-fcaa-4285-9e58-9237fa9996cf",
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
  "id": "15e58980-a11a-4f83-879f-1a710974138a",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aefb25db-a1f1-465c-8e0a-c8edb74f2a91",
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
  "created_at": "2026-10-28T07:30:02.362512Z",
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
    "id": "e90a96d3-8a7b-4f90-87d8-de6457d860e7",
    "order_id": "15e58980-a11a-4f83-879f-1a710974138a",
    "expires_at": "2026-10-28T07:30:17.365901Z",
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

`POST /api/driver/v1/offers/e90a96d3-8a7b-4f90-87d8-de6457d860e7/accept` → **200**

```json
{
  "command_id": "b29433fb-0a36-4d28-bd2c-a6c4379c42b5"
}
```

```json
{
  "id": "60fcf4d2-e411-4114-930a-e64d8d850239",
  "order_id": "15e58980-a11a-4f83-879f-1a710974138a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "039a0df8-7891-4048-be39-97552db934b0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "039a0df8-7891-4048-be39-97552db934b0",
  "order_id": "15e58980-a11a-4f83-879f-1a710974138a",
  "assignment_id": "60fcf4d2-e411-4114-930a-e64d8d850239",
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

`POST /api/driver/v1/work-sessions/e906e256-fd99-472c-98d0-5c9e918f6167/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:02Z",
    "sequence": 1793172602469
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:30:02.487447Z",
  "last_location_at": "2026-10-28T07:30:02.487447Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/039a0df8-7891-4048-be39-97552db934b0/arrive` → **200**

```json
{
  "command_id": "de5fc817-930c-4ffb-8e8d-66a7f267e0da",
  "expected_version": 0
}
```

```json
{
  "id": "039a0df8-7891-4048-be39-97552db934b0",
  "order_id": "15e58980-a11a-4f83-879f-1a710974138a",
  "assignment_id": "60fcf4d2-e411-4114-930a-e64d8d850239",
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
  "arrived_at": "2026-10-28T07:30:02.522986Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/039a0df8-7891-4048-be39-97552db934b0/start` → **200**

```json
{
  "command_id": "302dd951-1a01-4c3c-9e0d-d1da9e031bbc",
  "expected_version": 1
}
```

```json
{
  "id": "039a0df8-7891-4048-be39-97552db934b0",
  "order_id": "15e58980-a11a-4f83-879f-1a710974138a",
  "assignment_id": "60fcf4d2-e411-4114-930a-e64d8d850239",
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
  "arrived_at": "2026-10-28T07:30:02.522986Z",
  "started_at": "2026-10-28T07:30:02.562547Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/e906e256-fd99-472c-98d0-5c9e918f6167/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:02Z",
    "sequence": 1793172602591
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:30:02.611195Z",
  "last_location_at": "2026-10-28T07:30:02.611195Z",
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
  "device_ref": "sandbox-5194"
}
```

```json
{
  "challenge_id": "472db505-f749-471b-861b-751cf9b16abc",
  "expires_at": "2026-10-28T07:35:02.636241613Z",
  "resend_available_at": "2026-10-28T07:30:03.636241613Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "659855",
  "sent_at": "2026-10-28T07:30:02.638789857Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "472db505-f749-471b-861b-751cf9b16abc",
  "code": "659855",
  "device_ref": "sandbox-5194"
}
```

```json
{
  "session_id": "44136d52-6fcf-4ff1-8f8e-d316bfce4bd9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzUwMiwiaWF0IjoxNzkzMTcyNjAyLCJqdGkiOiI4YzMzNDUwOC0wNWE3LTQxOGUtOGNiYS1iOTYzOWVhZmNkZTYiLCJzaWQiOiI0NDEzNmQ1Mi02ZmNmLTRmZjEtOGY4ZS1kMzE2YmZjZTRiZDkifQ.OK_e1dv6MxdBmOF2CsDXY5585bx96qzdE0gxPx9EUTM",
  "access_expires_at": "2026-10-28T07:45:02.693935786Z",
  "refresh_token": "UY1zjwxnjpdQ4ZqQwCDvoXqRolGor-oiz22kUt3wuKk",
  "refresh_expires_at": "2026-11-27T07:30:02.693356024Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b9431471-4d67-4b65-be5e-7cd106288669",
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
  "last_heartbeat_at": "2026-10-28T07:29:35.607886Z",
  "last_location_at": "2026-10-28T07:29:35.607886Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b9431471-4d67-4b65-be5e-7cd106288669/handover` → **200**

```json
{
  "command_id": "ece46357-1844-45c4-b76c-c011303554a9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b9431471-4d67-4b65-be5e-7cd106288669",
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
  "last_heartbeat_at": "2026-10-28T07:29:35.607886Z",
  "last_location_at": "2026-10-28T07:29:35.607886Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b9431471-4d67-4b65-be5e-7cd106288669/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:02Z",
    "sequence": 1793172602781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b9431471-4d67-4b65-be5e-7cd106288669",
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
  "last_heartbeat_at": "2026-10-28T07:30:02.800927Z",
  "last_location_at": "2026-10-28T07:30:02.800927Z",
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
  "session_id": "59711c81-112b-4952-a68e-c42500bd9827",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MDMsImlhdCI6MTc5MzE3MjYwMywianRpIjoiYjU3MWViMDQtOGU5Ni00YzNlLWFlMWUtNjZiNzYwNGQ3NzFmIiwic2lkIjoiNTk3MTFjODEtMTEyYi00OTUyLWE2OGUtYzQyNTAwYmQ5ODI3In0.lR3AifDk9riMc-jp6kcoSquSslD0UhdgE9nrJjUfUa4",
  "access_expires_at": "2026-10-28T07:45:03.123861136Z",
  "refresh_token": "VBcuu4tWFL8_GiYJ0VWqYJkZ5mkHJopCf4qPwiFTXYk",
  "refresh_expires_at": "2026-10-28T19:30:03.123296301Z",
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
  "session_id": "529b1f68-bdf6-4ec8-91f6-bcd8e133639c",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MDMsImlhdCI6MTc5MzE3MjYwMywianRpIjoiMjE4MmM3NmEtY2IyNC00OWUyLTk4OWEtOTA1NWQyMzdmYzdmIiwic2lkIjoiNTI5YjFmNjgtYmRmNi00ZWM4LTkxZjYtYmNkOGUxMzM2MzljIn0.8JWzR5TpGXqYNL9uj1yi6SGuVgI_LzsSlLqdqWjxNH8",
  "access_expires_at": "2026-10-28T07:45:03.446334754Z",
  "refresh_token": "S1S39Zr4dEtd_KAiy2PR3WwoEeZQqxN474L3hRUMUJc",
  "refresh_expires_at": "2026-10-28T19:30:03.445755367Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/15e58980-a11a-4f83-879f-1a710974138a` → **200**

```json
{
  "id": "15e58980-a11a-4f83-879f-1a710974138a",
  "short_number": 7,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "aefb25db-a1f1-465c-8e0a-c8edb74f2a91",
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
    "id": "60fcf4d2-e411-4114-930a-e64d8d850239",
    "order_id": "15e58980-a11a-4f83-879f-1a710974138a",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "039a0df8-7891-4048-be39-97552db934b0",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T07:30:02.362512Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/15e58980-a11a-4f83-879f-1a710974138a/interrupt` → **200**

```json
{
  "command_id": "482ddea1-86f8-43d0-b95a-88edbccdef55",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "15e58980-a11a-4f83-879f-1a710974138a",
    "short_number": 7,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "aefb25db-a1f1-465c-8e0a-c8edb74f2a91",
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
      "id": "60fcf4d2-e411-4114-930a-e64d8d850239",
      "order_id": "15e58980-a11a-4f83-879f-1a710974138a",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "039a0df8-7891-4048-be39-97552db934b0",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T07:30:02.362512Z",
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
    "id": "9baf4feb-1d39-4ccd-8f22-f11024d68eba",
    "short_number": 8,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "aefb25db-a1f1-465c-8e0a-c8edb74f2a91",
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
    "id": "530210d0-8c41-46d5-885a-ac0fbdfbb820",
    "order_id": "9baf4feb-1d39-4ccd-8f22-f11024d68eba",
    "expires_at": "2026-10-28T07:30:18.536904Z",
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

`POST /api/driver/v1/offers/530210d0-8c41-46d5-885a-ac0fbdfbb820/accept` → **200**

```json
{
  "command_id": "9daedf6c-d0bf-4e3d-aa54-5beb66b59f3a"
}
```

```json
{
  "id": "aa5d8500-fada-4675-8f75-a34e6367ab09",
  "order_id": "9baf4feb-1d39-4ccd-8f22-f11024d68eba",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d50336ae-acdb-4391-a53c-8142f0e4175e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d50336ae-acdb-4391-a53c-8142f0e4175e",
  "order_id": "9baf4feb-1d39-4ccd-8f22-f11024d68eba",
  "assignment_id": "aa5d8500-fada-4675-8f75-a34e6367ab09",
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
  "session_id": "b9431471-4d67-4b65-be5e-7cd106288669",
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
  "last_heartbeat_at": "2026-10-28T07:30:02.800927Z",
  "last_location_at": "2026-10-28T07:30:02.800927Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/b9431471-4d67-4b65-be5e-7cd106288669/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:03Z",
    "sequence": 1793172603674
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b9431471-4d67-4b65-be5e-7cd106288669",
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
  "last_heartbeat_at": "2026-10-28T07:30:03.693223Z",
  "last_location_at": "2026-10-28T07:30:03.693223Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d50336ae-acdb-4391-a53c-8142f0e4175e/arrive` → **200**

```json
{
  "command_id": "5dfa6e11-f542-4d0c-a22f-ae559d3723c5",
  "expected_version": 0
}
```

```json
{
  "id": "d50336ae-acdb-4391-a53c-8142f0e4175e",
  "order_id": "9baf4feb-1d39-4ccd-8f22-f11024d68eba",
  "assignment_id": "aa5d8500-fada-4675-8f75-a34e6367ab09",
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
  "arrived_at": "2026-10-28T07:30:03.730307Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d50336ae-acdb-4391-a53c-8142f0e4175e/start` → **200**

```json
{
  "command_id": "3aa99457-46de-47d2-82b5-4c7f04c3ffec",
  "expected_version": 1
}
```

```json
{
  "id": "d50336ae-acdb-4391-a53c-8142f0e4175e",
  "order_id": "9baf4feb-1d39-4ccd-8f22-f11024d68eba",
  "assignment_id": "aa5d8500-fada-4675-8f75-a34e6367ab09",
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
  "arrived_at": "2026-10-28T07:30:03.730307Z",
  "started_at": "2026-10-28T07:30:03.771571Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d50336ae-acdb-4391-a53c-8142f0e4175e/complete` → **200**

```json
{
  "command_id": "a5977f9d-9cec-4991-a873-27501c11fe7e",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:30:03Z"
}
```

```json
{
  "id": "d50336ae-acdb-4391-a53c-8142f0e4175e",
  "order_id": "9baf4feb-1d39-4ccd-8f22-f11024d68eba",
  "assignment_id": "aa5d8500-fada-4675-8f75-a34e6367ab09",
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
  "arrived_at": "2026-10-28T07:30:03.730307Z",
  "started_at": "2026-10-28T07:30:03.771571Z",
  "completed_at": "2026-10-28T07:30:03.816727Z",
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
    "id": "9baf4feb-1d39-4ccd-8f22-f11024d68eba",
    "short_number": 8,
    "status": "FULFILLED",
    "created_at": "2026-10-28T07:30:03.525827Z",
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
    "id": "15e58980-a11a-4f83-879f-1a710974138a",
    "short_number": 7,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:30:02.362512Z",
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

`GET /api/operator/v1/orders/15e58980-a11a-4f83-879f-1a710974138a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:30:02.363008Z",
      "actor": {
        "type": "CLIENT",
        "id": "aefb25db-a1f1-465c-8e0a-c8edb74f2a91",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "15e58980-a11a-4f83-879f-1a710974138a",
        "quote_id": "e8b3cffc-fcaa-4285-9e58-9237fa9996cf",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:30:02.365021Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "15e58980-a11a-4f83-879f-1a710974138a",
        "attempt_id": "491d3f26-f2fe-4bd3-a29c-6ae2aefb3270",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:30:02.370414Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e90a96d3-8a7b-4f90-87d8-de6457d860e7",
        "order_id": "15e58980-a11a-4f83-879f-1a710974138a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:30:02.428526Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e90a96d3-8a7b-4f90-87d8-de6457d860e7",
        "order_id": "15e58980-a11a-4f83-879f-1a710974138a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "60fcf4d2-e411-4114-930a-e64d8d850239"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 15e58980-a11a-4f83-879f-1a710974138a, follow-up 9baf4feb-1d39-4ccd-8f22-f11024d68eba.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-1596"
}
```

```json
{
  "challenge_id": "715b1879-8bcd-4b0d-8b3f-65be6c6999b5",
  "expires_at": "2026-10-28T07:35:06.941696498Z",
  "resend_available_at": "2026-10-28T07:30:07.941696498Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "834737",
  "sent_at": "2026-10-28T07:30:06.944275905Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "715b1879-8bcd-4b0d-8b3f-65be6c6999b5",
  "code": "834737",
  "device_ref": "sandbox-1596"
}
```

```json
{
  "session_id": "43c81aab-aca2-4772-8da0-d089893e0a1e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzUwNiwiaWF0IjoxNzkzMTcyNjA2LCJqdGkiOiJlYTY4YWM2MS0wOGE1LTQ3N2UtYTRjYy1lNjFjNGNkZjIyYWEiLCJzaWQiOiI0M2M4MWFhYi1hY2EyLTQ3NzItOGRhMC1kMDg5ODkzZTBhMWUifQ.AZ56UBJlKbJxs9yw0f-eEIEEGgfnyUFedJdnDjxi8tM",
  "access_expires_at": "2026-10-28T07:45:06.99991236Z",
  "refresh_token": "ho9iqqI1sjdATV02BvoQ5uMEZZ46wxLSGAd6M2heCt4",
  "refresh_expires_at": "2026-11-27T07:30:06.99929049Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b9431471-4d67-4b65-be5e-7cd106288669",
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
  "last_heartbeat_at": "2026-10-28T07:30:03.693223Z",
  "last_location_at": "2026-10-28T07:30:03.693223Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b9431471-4d67-4b65-be5e-7cd106288669/handover` → **200**

```json
{
  "command_id": "af009534-edf3-4dd4-a16c-2110f63b4c4f",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b9431471-4d67-4b65-be5e-7cd106288669",
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
  "last_heartbeat_at": "2026-10-28T07:30:03.693223Z",
  "last_location_at": "2026-10-28T07:30:03.693223Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b9431471-4d67-4b65-be5e-7cd106288669/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:07Z",
    "sequence": 1793172607867
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b9431471-4d67-4b65-be5e-7cd106288669",
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
  "last_heartbeat_at": "2026-10-28T07:30:07.104936Z",
  "last_location_at": "2026-10-28T07:30:07.104936Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675741266",
  "device_ref": "sandbox-10531"
}
```

```json
{
  "challenge_id": "f477bf53-fbc1-4dd0-a305-f64630276b92",
  "expires_at": "2026-10-28T07:35:07.132288341Z",
  "resend_available_at": "2026-10-28T07:30:08.132288341Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675741266` → **200**

```json
{
  "phone": "+380675741266",
  "audience": "CLIENT",
  "code": "851440",
  "sent_at": "2026-10-28T07:30:07.134796395Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f477bf53-fbc1-4dd0-a305-f64630276b92",
  "code": "851440",
  "device_ref": "sandbox-10531"
}
```

```json
{
  "session_id": "0582f0c9-89d7-490b-9926-cf8583667be2",
  "subject": {
    "type": "CLIENT",
    "id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZDhkM2VlOC0wZGQwLTQzNjgtODQ0YS04ZGQ4MmEwMmVlODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNTA3LCJpYXQiOjE3OTMxNzI2MDcsImp0aSI6ImU3YjI3NTJmLWUwYTgtNGM4OC04OGQxLThlZmM0YmRmNTllYyIsInNpZCI6IjA1ODJmMGM5LTg5ZDctNDkwYi05OTI2LWNmODU4MzY2N2JlMiJ9.-QlyzYCbJ71CsWOmF99TP6z8QhNnZfwq3P-hTtlEKno",
  "access_expires_at": "2026-10-28T07:45:07.189666272Z",
  "refresh_token": "gKN2rtlAafoRAtiYAeUZGFyOG_mgkEFdycc-Mc5WjZw",
  "refresh_expires_at": "2026-11-27T07:30:07.189063496Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c9993917-deed-49e6-9e63-1d7aeaa93714",
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
  "id": "b85e8905-3e18-450e-8f98-dd6bc61c8953",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:35:07.223901Z",
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
  "command_id": "649d901b-3a72-4f54-a54d-e47ec642b9d9",
  "quote_id": "b85e8905-3e18-450e-8f98-dd6bc61c8953",
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
    "phone": "+380679982730"
  }
}
```

```json
{
  "id": "5c5d721e-2ce2-411c-9ff5-707cb4136ae7",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T07:30:07.263039Z",
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
    "id": "410cc386-96b0-4833-a6d2-9ec7e71b1eb4",
    "order_id": "5c5d721e-2ce2-411c-9ff5-707cb4136ae7",
    "expires_at": "2026-10-28T07:30:22.26624Z",
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

`POST /api/driver/v1/offers/410cc386-96b0-4833-a6d2-9ec7e71b1eb4/accept` → **200**

```json
{
  "command_id": "a94fd547-7d3a-4eb4-9b50-0f98931ccf7b"
}
```

```json
{
  "id": "15db18ed-778f-4e9a-8776-f129efc87f9c",
  "order_id": "5c5d721e-2ce2-411c-9ff5-707cb4136ae7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5e570ffc-abe4-4cfe-8b04-8287ddb4b6ee",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5e570ffc-abe4-4cfe-8b04-8287ddb4b6ee",
  "order_id": "5c5d721e-2ce2-411c-9ff5-707cb4136ae7",
  "assignment_id": "15db18ed-778f-4e9a-8776-f129efc87f9c",
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
    "phone": "+380679982730"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "59c65a43-2037-48ad-bcac-14f61a8a32c5",
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
  "id": "dee21d49-658f-41cd-b414-1151e5961d35",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:35:07.396920Z",
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
  "command_id": "a3c03807-2516-4eae-9455-9b2f94013fb1",
  "quote_id": "dee21d49-658f-41cd-b414-1151e5961d35",
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
  "id": "17c426f1-ceb8-4795-97f3-aa86ba35f416",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T07:30:07.432413Z",
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
  "command_id": "39f25cdb-bc04-49dd-a202-af1d653d6847",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T10:30:07Z"
}
```

```json
{
  "id": "980e435c-a740-490e-ad96-80c27695a3c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:35:07.476136Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T10:30:07Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "09bfe707-67ad-49e6-9993-b45ee6d824cc",
  "quote_id": "980e435c-a740-490e-ad96-80c27695a3c3",
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
  "pickup_at": "2026-10-28T10:30:07Z"
}
```

```json
{
  "id": "4e6263b0-88e0-47bd-88a5-5a0da689d448",
  "short_number": 11,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T07:30:07.514036Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:30:07Z",
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
  "command_id": "436ab163-2374-4649-a4a9-90aa3b933bde",
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
  "id": "e4225a17-e80a-4fd6-8eb9-86f278204d02",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:35:07.553142Z",
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
  "command_id": "4aad185b-9d3e-4483-bf3e-195943216e70",
  "quote_id": "e4225a17-e80a-4fd6-8eb9-86f278204d02",
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
  "correlation_id": "2090cd32-3247-4d92-913f-2f1d899a0675"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "4e6263b0-88e0-47bd-88a5-5a0da689d448",
      "short_number": 11,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T07:30:07.514036Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T10:30:07Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "17c426f1-ceb8-4795-97f3-aa86ba35f416",
      "short_number": 10,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T07:30:07.432413Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "5c5d721e-2ce2-411c-9ff5-707cb4136ae7",
      "short_number": 9,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "17c426f1-ceb8-4795-97f3-aa86ba35f416",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T07:30:07.432413Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/5c5d721e-2ce2-411c-9ff5-707cb4136ae7` → **200**

```json
{
  "id": "5c5d721e-2ce2-411c-9ff5-707cb4136ae7",
  "short_number": 9,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "15db18ed-778f-4e9a-8776-f129efc87f9c",
    "order_id": "5c5d721e-2ce2-411c-9ff5-707cb4136ae7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5e570ffc-abe4-4cfe-8b04-8287ddb4b6ee",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T07:30:07.263039Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/5c5d721e-2ce2-411c-9ff5-707cb4136ae7/cancel` → **200**

```json
{
  "command_id": "b135fb11-bae9-4967-8525-7af68b4b927e",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5c5d721e-2ce2-411c-9ff5-707cb4136ae7",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "15db18ed-778f-4e9a-8776-f129efc87f9c",
    "order_id": "5c5d721e-2ce2-411c-9ff5-707cb4136ae7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5e570ffc-abe4-4cfe-8b04-8287ddb4b6ee",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T07:30:07.263039Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/17c426f1-ceb8-4795-97f3-aa86ba35f416` → **200**

```json
{
  "id": "17c426f1-ceb8-4795-97f3-aa86ba35f416",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T07:30:07.432413Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/17c426f1-ceb8-4795-97f3-aa86ba35f416/cancel` → **200**

```json
{
  "command_id": "24a73b2a-f0c2-43c6-985a-301f2ba8f2b4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "17c426f1-ceb8-4795-97f3-aa86ba35f416",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T07:30:07.432413Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/4e6263b0-88e0-47bd-88a5-5a0da689d448` → **200**

```json
{
  "id": "4e6263b0-88e0-47bd-88a5-5a0da689d448",
  "short_number": 11,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T07:30:07.514036Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:30:07Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4e6263b0-88e0-47bd-88a5-5a0da689d448/cancel` → **200**

```json
{
  "command_id": "2b9d904b-63c3-4466-940b-50aab277053f",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4e6263b0-88e0-47bd-88a5-5a0da689d448",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "ad8d3ee8-0dd0-4368-844a-8dd82a02ee80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T07:30:07.514036Z",
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
  "pickup_at": "2026-10-28T10:30:07Z",
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
  "session_id": "b9431471-4d67-4b65-be5e-7cd106288669",
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
  "last_heartbeat_at": "2026-10-28T07:30:07.104936Z",
  "last_location_at": "2026-10-28T07:30:07.104936Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b9431471-4d67-4b65-be5e-7cd106288669/close` → **200**

```json
{
  "command_id": "dfc8cbb8-a4be-4b54-bbfc-a8c15d4e7307",
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

Done: orders 5c5d721e-2ce2-411c-9ff5-707cb4136ae7, 17c426f1-ceb8-4795-97f3-aa86ba35f416, 4e6263b0-88e0-47bd-88a5-5a0da689d448.

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
  "session_id": "1569ab97-b66b-41ee-8893-bf683c2450f0",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MDgsImlhdCI6MTc5MzE3MjYwOCwianRpIjoiYzgzMzdkZWQtNDAxMC00NWU3LWJhOWQtZGViZTBmMDNiYzFjIiwic2lkIjoiMTU2OWFiOTctYjY2Yi00MWVlLTg4OTMtYmY2ODNjMjQ1MGYwIn0.ostoIbuAkf3VC-VMX6vVM_OIWLVRV4oD5F_Lpcg7fcE",
  "access_expires_at": "2026-10-28T07:45:08.20759538Z",
  "refresh_token": "BwWSgUslKVOl7yg7Yscj10Nnp6wyLJJj7yWxY63Lkl8",
  "refresh_expires_at": "2026-10-28T19:30:08.206907933Z",
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
  "session_id": "9b694ad3-9238-44e3-9160-3c7d33a5e5cc",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MDgsImlhdCI6MTc5MzE3MjYwOCwianRpIjoiOTgzZjZlNmQtNDNjNC00NGNhLWIyYWUtYjIyNjI4Y2E4MzJmIiwic2lkIjoiOWI2OTRhZDMtOTIzOC00NGUzLTkxNjAtM2M3ZDMzYTVlNWNjIn0.if-tzIO7mzaHULT0Sf9JzhC7JiuE_AHxBYhR2Msz3MQ",
  "access_expires_at": "2026-10-28T07:45:08.531746456Z",
  "refresh_token": "aBfqY22-aXolA_yD3J0G6tXuWIWmmDw0iJ155TOpDV4",
  "refresh_expires_at": "2026-10-28T19:30:08.531145476Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6924"
}
```

```json
{
  "challenge_id": "7da7d5e7-c018-41ab-bf42-61401d0312db",
  "expires_at": "2026-10-28T07:35:08.555635147Z",
  "resend_available_at": "2026-10-28T07:30:09.555635147Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "043495",
  "sent_at": "2026-10-28T07:30:08.558086208Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7da7d5e7-c018-41ab-bf42-61401d0312db",
  "code": "043495",
  "device_ref": "sandbox-6924"
}
```

```json
{
  "session_id": "5ad958db-635f-42b5-a699-635719562a13",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzUwOCwiaWF0IjoxNzkzMTcyNjA4LCJqdGkiOiI0MDI2MmE5Mi0yNjNjLTQ2MGQtODdhNy0yMmJmZGRlYjg4ZDciLCJzaWQiOiI1YWQ5NThkYi02MzVmLTQyYjUtYTY5OS02MzU3MTk1NjJhMTMifQ.8OiV1OqqXH9OwWB6u3WRaXr-ur9aZhJ8bKThj458lbE",
  "access_expires_at": "2026-10-28T07:45:08.612289227Z",
  "refresh_token": "FaSD-C5uvCvaXyArBmYnIP6RUeOqbQmk8QbkEVgodqY",
  "refresh_expires_at": "2026-11-27T07:30:08.611566046Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:30:02.611195Z",
  "last_location_at": "2026-10-28T07:30:02.611195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e906e256-fd99-472c-98d0-5c9e918f6167/handover` → **200**

```json
{
  "command_id": "fc4781c0-3adb-4203-981b-39514a5e2a64",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:30:02.611195Z",
  "last_location_at": "2026-10-28T07:30:02.611195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e906e256-fd99-472c-98d0-5c9e918f6167/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:08Z",
    "sequence": 1793172608696
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:30:08.716353Z",
  "last_location_at": "2026-10-28T07:30:08.716353Z",
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
  "command_id": "b09d8e9d-3e36-4862-958b-a964a582b24a",
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
  "effective_at": "2026-10-28T07:30:08.785423Z",
  "changed_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T07:30:08.816425307Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "facaff11-55b6-404e-9177-e1029b4d6500",
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
  "id": "bd951104-fd8a-4d8d-87f7-441b0c3f4616",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:35:08.852897Z",
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
  "command_id": "d5bc0b79-2b5a-4d06-99e7-c259b32d98ae",
  "quote_id": "bd951104-fd8a-4d8d-87f7-441b0c3f4616",
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
    "phone": "+380671113473"
  }
}
```

```json
{
  "id": "4d035dac-7af1-4994-bc53-0bcc42a5ba3a",
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
  "created_at": "2026-10-28T07:30:08.889539Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671113473"
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
    "id": "f2735775-66f1-44a8-aca1-51cf679dab56",
    "order_id": "4d035dac-7af1-4994-bc53-0bcc42a5ba3a",
    "expires_at": "2026-10-28T07:30:23.89331Z",
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

`POST /api/driver/v1/offers/f2735775-66f1-44a8-aca1-51cf679dab56/accept` → **200**

```json
{
  "command_id": "bca3ae44-60b8-49bc-a765-ede776c2463a"
}
```

```json
{
  "id": "5ffeb52b-b9a2-48cc-bc66-e295c1de4312",
  "order_id": "4d035dac-7af1-4994-bc53-0bcc42a5ba3a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "967a752a-8111-429f-8fab-a7e65cce8b72",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "967a752a-8111-429f-8fab-a7e65cce8b72",
  "order_id": "4d035dac-7af1-4994-bc53-0bcc42a5ba3a",
  "assignment_id": "5ffeb52b-b9a2-48cc-bc66-e295c1de4312",
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
    "phone": "+380671113473"
  }
}
```

`POST /api/driver/v1/work-sessions/e906e256-fd99-472c-98d0-5c9e918f6167/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:08Z",
    "sequence": 1793172608997
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:30:09.0156Z",
  "last_location_at": "2026-10-28T07:30:09.0156Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/967a752a-8111-429f-8fab-a7e65cce8b72/arrive` → **200**

```json
{
  "command_id": "4e059af0-a255-4368-a0f8-c6a1278bfdfc",
  "expected_version": 0
}
```

```json
{
  "id": "967a752a-8111-429f-8fab-a7e65cce8b72",
  "order_id": "4d035dac-7af1-4994-bc53-0bcc42a5ba3a",
  "assignment_id": "5ffeb52b-b9a2-48cc-bc66-e295c1de4312",
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
  "arrived_at": "2026-10-28T07:30:09.051142Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671113473"
  }
}
```

`POST /api/driver/v1/trips/967a752a-8111-429f-8fab-a7e65cce8b72/start` → **200**

```json
{
  "command_id": "a5ea2d05-fd4f-47d8-a9a6-02dc9d587621",
  "expected_version": 1
}
```

```json
{
  "id": "967a752a-8111-429f-8fab-a7e65cce8b72",
  "order_id": "4d035dac-7af1-4994-bc53-0bcc42a5ba3a",
  "assignment_id": "5ffeb52b-b9a2-48cc-bc66-e295c1de4312",
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
  "arrived_at": "2026-10-28T07:30:09.051142Z",
  "started_at": "2026-10-28T07:30:09.090406Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671113473"
  }
}
```

`POST /api/driver/v1/trips/967a752a-8111-429f-8fab-a7e65cce8b72/complete` → **200**

```json
{
  "command_id": "f637eaab-9029-47db-a63d-bd60d9398d06",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:30:09Z",
  "cash_received": true
}
```

```json
{
  "id": "967a752a-8111-429f-8fab-a7e65cce8b72",
  "order_id": "4d035dac-7af1-4994-bc53-0bcc42a5ba3a",
  "assignment_id": "5ffeb52b-b9a2-48cc-bc66-e295c1de4312",
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
  "arrived_at": "2026-10-28T07:30:09.051142Z",
  "started_at": "2026-10-28T07:30:09.090406Z",
  "completed_at": "2026-10-28T07:30:09.131824Z",
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
  "command_id": "5af3ac73-e47f-4249-bc45-8ef2f9abfb1e",
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
  "id": "c0242749-6d16-40d6-bf79-cd739fefe4ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:35:09.175381Z",
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
  "command_id": "f63bc4ba-9e80-450d-8a8d-c1d81ed09e9f",
  "quote_id": "c0242749-6d16-40d6-bf79-cd739fefe4ed",
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
    "phone": "+3806711116053"
  }
}
```

```json
{
  "id": "5e4b5d58-d369-464f-9a2e-e83bc4897434",
  "short_number": 13,
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
  "created_at": "2026-10-28T07:30:09.213976Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116053"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5e4b5d58-d369-464f-9a2e-e83bc4897434` → **200**

```json
{
  "id": "5e4b5d58-d369-464f-9a2e-e83bc4897434",
  "short_number": 13,
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
  "created_at": "2026-10-28T07:30:09.213976Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116053"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5e4b5d58-d369-464f-9a2e-e83bc4897434/cancel` → **200**

```json
{
  "command_id": "910d49e0-6516-41e4-b782-5f9cd7250e53",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "5e4b5d58-d369-464f-9a2e-e83bc4897434",
  "short_number": 13,
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
  "created_at": "2026-10-28T07:30:09.213976Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116053"
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
  "staff_id": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T07:30:09.137529Z",
  "last_entries": [
    {
      "order_id": "5e4b5d58-d369-464f-9a2e-e83bc4897434",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T07:30:09.287319Z"
    },
    {
      "order_id": "4d035dac-7af1-4994-bc53-0bcc42a5ba3a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T07:30:09.137529Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e906e256-fd99-472c-98d0-5c9e918f6167",
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
  "last_heartbeat_at": "2026-10-28T07:30:09.0156Z",
  "last_location_at": "2026-10-28T07:30:09.0156Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e906e256-fd99-472c-98d0-5c9e918f6167/close` → **200**

```json
{
  "command_id": "3b7703d7-ecd9-4104-85d0-af422568f383",
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

Done: operator bonus for fulfilled 4d035dac-7af1-4994-bc53-0bcc42a5ba3a and operator-fault cancellation 5e4b5d58-d369-464f-9a2e-e83bc4897434.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676772783",
  "device_ref": "sandbox-14729"
}
```

```json
{
  "challenge_id": "18532fb2-7680-496d-9cee-ae813693968f",
  "expires_at": "2026-10-28T07:35:11.449420779Z",
  "resend_available_at": "2026-10-28T07:30:12.449420779Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676772783` → **200**

```json
{
  "phone": "+380676772783",
  "audience": "CLIENT",
  "code": "687709",
  "sent_at": "2026-10-28T07:30:11.451780087Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678926809",
  "device_ref": "sandbox-30506",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "657a552d-c2dc-4d9e-80ed-92bc4419bd22",
  "expires_at": "2026-10-28T07:35:11.504617073Z",
  "resend_available_at": "2026-10-28T07:30:12.504617073Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678926809` → **200**

```json
{
  "phone": "+380678926809",
  "audience": "CLIENT",
  "code": "246011",
  "sent_at": "2026-10-28T07:30:11.50667609Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677480000",
  "device_ref": "sandbox-11207"
}
```

```json
{
  "challenge_id": "2ca3f05f-03b0-47af-aa19-3de926bbeaad",
  "expires_at": "2026-10-28T07:35:11.5568338Z",
  "resend_available_at": "2026-10-28T07:30:12.5568338Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677480000` → **200**

```json
{
  "phone": "+380677480000",
  "audience": "CLIENT",
  "code": "981453",
  "sent_at": "2026-10-28T07:30:11.55979474Z",
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
  "session_id": "fbf9274f-749c-43ba-8be4-0b3ad878e651",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MTEsImlhdCI6MTc5MzE3MjYxMSwianRpIjoiMWZiZTBiZGQtYjc1ZS00YzAxLWJiZjgtZmM3OThhODQ4YmVhIiwic2lkIjoiZmJmOTI3NGYtNzQ5Yy00M2JhLThiZTQtMGIzYWQ4NzhlNjUxIn0.A6ykRuuwtBUVsGNlk07_B3FflryYONi2L_M0fkbShP4",
  "access_expires_at": "2026-10-28T07:45:11.902470669Z",
  "refresh_token": "FhiLmEj4mt_cIwNUrA58D0yasLsm8RIQkbVDTeb4z8o",
  "refresh_expires_at": "2026-10-28T19:30:11.901961348Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677480000` → **200**

```json
{
  "deliveries": [
    {
      "id": "f05626d7-6185-4d07-822a-03d81ed55451",
      "challenge_id": "2ca3f05f-03b0-47af-aa19-3de926bbeaad",
      "phone": "+380677480000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-490b509d-1506-4c48-af1a-9c371bcb0405",
      "error": null,
      "attempted_at": "2026-10-28T07:30:11.55998Z"
    },
    {
      "id": "c20bf2d4-8c75-4d7f-8901-71523ee9283f",
      "challenge_id": "2ca3f05f-03b0-47af-aa19-3de926bbeaad",
      "phone": "+380677480000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T07:30:11.559274Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677480000` → **200**

```json
{
  "phone": "+380677480000",
  "audience": "CLIENT",
  "code": "981453",
  "sent_at": "2026-10-28T07:30:11.55979474Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678926809` → **200**

```json
{
  "deliveries": [
    {
      "id": "48991d5e-ba40-46bf-8932-242502a8bcd4",
      "challenge_id": "657a552d-c2dc-4d9e-80ed-92bc4419bd22",
      "phone": "+380678926809",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8076502a-1bb1-475e-be9d-e668e99e7cd6",
      "error": null,
      "attempted_at": "2026-10-28T07:30:11.506863Z"
    }
  ]
}
```

Done: SMS to +380676772783, a call to +380678926809, SMS then a call to +380677480000.

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
  "session_id": "4d64605c-e3a1-49dd-b4c4-551fbf973f43",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MTIsImlhdCI6MTc5MzE3MjYxMiwianRpIjoiZjY5ZGY2NGYtMjA4ZS00NjExLTgyZGMtMGQ4NjZhMjJlMGI3Iiwic2lkIjoiNGQ2NDYwNWMtZTNhMS00OWRkLWI0YzQtNTUxZmJmOTczZjQzIn0.QGyEX4fW-3iOqQZg1JNjQPNEGmkZ-j1UUZnZ4iNEC4o",
  "access_expires_at": "2026-10-28T07:45:12.319216107Z",
  "refresh_token": "-6lu6UCbWr70sxcmhzKaDGSTygA3eJRQRuR7971Y5EQ",
  "refresh_expires_at": "2026-10-28T19:30:12.318687861Z",
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
  "session_id": "486cee94-e22b-4d8a-aac5-4f446d467825",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MTIsImlhdCI6MTc5MzE3MjYxMiwianRpIjoiMmE2MmM0MWEtYWI2OS00NTRjLThkZTctODI5NzY0YWYzMTIzIiwic2lkIjoiNDg2Y2VlOTQtZTIyYi00ZDhhLWFhYzUtNGY0NDZkNDY3ODI1In0.azRcy8J9bSC61O7t27thBTtdTZS67O3KvYcSc8zjmpw",
  "access_expires_at": "2026-10-28T07:45:12.640098267Z",
  "refresh_token": "fJCdxtgrTxkT_8rW4Y-IQFE8Vgs14NJilAEK8xNUPy8",
  "refresh_expires_at": "2026-10-28T19:30:12.639517302Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
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
    "reports.view"
  ]
}
```

`GET /api/admin/v1/staff-extensions` → **200**

```json
{
  "extensions": []
}
```

`POST /api/admin/v1/staff-extensions/dbd9ee06-2b81-4924-86dd-d555af0288d4` → **200**

```json
{
  "command_id": "a41c7fb4-3906-4c2a-a0a6-7d437a512695",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "94a78f45-71a2-4c98-8e0e-72b5553b2f89",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T07:30:12.775729Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T07:30:12.775729Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "46f39298-7f7a-404f-8281-b4e0a9fd0fb8",
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
  "id": "b89be3a0-633c-4385-8231-0713fef3df68",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:35:12.839945Z",
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
  "command_id": "2ed3c4ec-d30f-4709-b242-c1b043d4bb5c",
  "quote_id": "b89be3a0-633c-4385-8231-0713fef3df68",
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
    "phone": "+380679823169"
  }
}
```

```json
{
  "id": "24b5aa6a-08cd-4733-acf0-7fab635d6887",
  "short_number": 14,
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
  "created_at": "2026-10-28T07:30:12.876419Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679823169"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/24b5aa6a-08cd-4733-acf0-7fab635d6887/calls` → **201**

```json
{
  "command_id": "28f36f66-f6b1-4813-9ed8-38f7508e579a",
  "to": "CALLER"
}
```

```json
{
  "id": "5759430d-cfdd-4889-ada4-ce461e1c7885",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "order_ids": [
    "24b5aa6a-08cd-4733-acf0-7fab635d6887"
  ],
  "started_at": "2026-10-28T07:30:12.923785Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/24b5aa6a-08cd-4733-acf0-7fab635d6887/calls` → **201**

```json
{
  "command_id": "28f36f66-f6b1-4813-9ed8-38f7508e579a",
  "to": "CALLER"
}
```

```json
{
  "id": "5759430d-cfdd-4889-ada4-ce461e1c7885",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "order_ids": [
    "24b5aa6a-08cd-4733-acf0-7fab635d6887"
  ],
  "started_at": "2026-10-28T07:30:12.923785Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "5759430d-cfdd-4889-ada4-ce461e1c7885",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380679823169",
    "at": "2026-10-28T07:30:12.925745225Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "5759430d-cfdd-4889-ada4-ce461e1c7885",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.6721",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "5759430d-cfdd-4889-ada4-ce461e1c7885"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "5759430d-cfdd-4889-ada4-ce461e1c7885",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=24b5aa6a-08cd-4733-acf0-7fab635d6887` → **200**

```json
{
  "calls": [
    {
      "id": "5759430d-cfdd-4889-ada4-ce461e1c7885",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
      "order_ids": [
        "24b5aa6a-08cd-4733-acf0-7fab635d6887"
      ],
      "started_at": "2026-10-28T07:30:12.923785Z",
      "answered_at": "2026-10-28T07:30:13.060969Z",
      "ended_at": "2026-10-28T07:30:13.082075Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=24b5aa6a-08cd-4733-acf0-7fab635d6887` → **200**

```json
{
  "calls": [
    {
      "id": "5759430d-cfdd-4889-ada4-ce461e1c7885",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
      "order_ids": [
        "24b5aa6a-08cd-4733-acf0-7fab635d6887"
      ],
      "started_at": "2026-10-28T07:30:12.923785Z",
      "answered_at": "2026-10-28T07:30:13.060969Z",
      "ended_at": "2026-10-28T07:30:13.082075Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:30:13.664557Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/24b5aa6a-08cd-4733-acf0-7fab635d6887` → **200**

```json
{
  "id": "24b5aa6a-08cd-4733-acf0-7fab635d6887",
  "short_number": 14,
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
  "created_at": "2026-10-28T07:30:12.876419Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679823169"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/24b5aa6a-08cd-4733-acf0-7fab635d6887/cancel` → **200**

```json
{
  "command_id": "689b663d-4bb8-446f-900a-f5fe58a45285",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "24b5aa6a-08cd-4733-acf0-7fab635d6887",
  "short_number": 14,
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
  "created_at": "2026-10-28T07:30:12.876419Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679823169"
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
  "command_id": "8564557f-c2b1-480f-9cbd-0940685359dc",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T07:30:15.253767Z",
  "extension": "101"
}
```

Done: outgoing call 5759430d-cfdd-4889-ada4-ce461e1c7885 from order 24b5aa6a-08cd-4733-acf0-7fab635d6887, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638827176",
  "device_ref": "sandbox-15707"
}
```

```json
{
  "challenge_id": "6e3c6fc0-4901-414b-84b0-5cabcdd61384",
  "expires_at": "2026-10-28T07:35:15.295563365Z",
  "resend_available_at": "2026-10-28T07:30:16.295563365Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638827176` → **200**

```json
{
  "phone": "+380638827176",
  "audience": "CLIENT",
  "code": "288430",
  "sent_at": "2026-10-28T07:30:15.297831973Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e3c6fc0-4901-414b-84b0-5cabcdd61384",
  "code": "288430",
  "device_ref": "sandbox-15707"
}
```

```json
{
  "session_id": "fd73d5e9-0bfe-4ad1-a8f3-fa8cd4151140",
  "subject": {
    "type": "CLIENT",
    "id": "40ed98ad-84fe-451f-b24c-d69fe2a72253"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MGVkOThhZC04NGZlLTQ1MWYtYjI0Yy1kNjlmZTJhNzIyNTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNTE1LCJpYXQiOjE3OTMxNzI2MTUsImp0aSI6IjZhYTdiMGY5LTMzNjYtNGMyMC1iNjk3LWYwZmZlZjE3YjE0YSIsInNpZCI6ImZkNzNkNWU5LTBiZmUtNGFkMS1hOGYzLWZhOGNkNDE1MTE0MCJ9.rKxzZC6AlfhnceO8I0aY2mDUhUqexlib-lObLSggRok",
  "access_expires_at": "2026-10-28T07:45:15.3544277Z",
  "refresh_token": "us_zy29CPCkwuA8OpjZD3WziX2KhYv9WfiEoprKdtck",
  "refresh_expires_at": "2026-11-27T07:30:15.353909322Z",
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
  "session_id": "5cbd6507-9fce-40b3-b80e-8251a55a0ed8",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MTUsImlhdCI6MTc5MzE3MjYxNSwianRpIjoiOGYzYTA2ZGItOTg2Ni00ODA0LWFiMTMtZTc1MzRkZWZlYTliIiwic2lkIjoiNWNiZDY1MDctOWZjZS00MGIzLWI4MGUtODI1MWE1NWEwZWQ4In0.jFVNhIAi5F0ypn6LHt-hYRiY71hTABd2MmjhqGgr7_o",
  "access_expires_at": "2026-10-28T07:45:15.754208851Z",
  "refresh_token": "iGwcxjKerR_0gKmByFiQFm7CURL961t3ZTlxOYPq5qU",
  "refresh_expires_at": "2026-10-28T19:30:15.753670306Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638827176` → **200**

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
  "correlation_id": "270ea0a8-170b-4297-93db-417704ed26c8"
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
  "session_id": "a30e4966-a84c-40ef-937f-0175e3db6894",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MTYsImlhdCI6MTc5MzE3MjYxNiwianRpIjoiYjZjNTM5NTktNWRmMS00MmQyLWEwYzItMzdjODJhZjlkODlkIiwic2lkIjoiYTMwZTQ5NjYtYTg0Yy00MGVmLTkzN2YtMDE3NWUzZGI2ODk0In0.45noSDOxbb4vRk96B1ouZPS8PCNk--TuIipvj8qxCc4",
  "access_expires_at": "2026-10-28T07:45:16.140739229Z",
  "refresh_token": "_aeqhIwDZqdSZcsog8Wfu1Xj13ANJEw5idx1-0a7VYo",
  "refresh_expires_at": "2026-10-28T19:30:16.140122217Z",
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
  "command_id": "d70da0c8-8f35-4cdb-83cf-ff1ef3a74909",
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
  "changed_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T07:30:16.214533657Z"
}
```

## The rider books the airport for 2026-10-28T10:30:15Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600110097",
  "device_ref": "sandbox-26051"
}
```

```json
{
  "challenge_id": "6bc9613a-d198-4602-bd96-09e67d702846",
  "expires_at": "2026-10-28T07:35:16.245865565Z",
  "resend_available_at": "2026-10-28T07:30:17.245865565Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600110097` → **200**

```json
{
  "phone": "+48600110097",
  "audience": "CLIENT",
  "code": "269777",
  "sent_at": "2026-10-28T07:30:16.248176258Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6bc9613a-d198-4602-bd96-09e67d702846",
  "code": "269777",
  "device_ref": "sandbox-26051"
}
```

```json
{
  "session_id": "097781ad-b69c-42a4-b1d3-27413d790bf0",
  "subject": {
    "type": "CLIENT",
    "id": "d6cdd3bb-98d8-4a45-88a0-c999d071a0bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmNkZDNiYi05OGQ4LTRhNDUtODhhMC1jOTk5ZDA3MWEwYmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNTE2LCJpYXQiOjE3OTMxNzI2MTYsImp0aSI6ImVmZTk5MzQ1LTE2NzEtNDFhMi1iNjhiLTBkYzZkYzE1YzI2MSIsInNpZCI6IjA5Nzc4MWFkLWI2OWMtNDJhNC1iMWQzLTI3NDEzZDc5MGJmMCJ9.hyypFyirm6IlqtxO0WoGSDfmDDio8Q2KC4OO535JUig",
  "access_expires_at": "2026-10-28T07:45:16.301838937Z",
  "refresh_token": "_3YTh1nQ3jAdriOczs41A0G50Mub6kK_f6if-uEnXiA",
  "refresh_expires_at": "2026-11-27T07:30:16.3012524Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b7e971f9-bd09-4d22-8efb-07a0b982d94c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T10:30:15Z"
}
```

```json
{
  "id": "3f223a2b-a9d6-480a-8351-8bec774c4849",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-28T07:35:16.337148Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T10:30:15Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "28ecb18b-503d-4586-98e5-ff10049fb630",
  "quote_id": "3f223a2b-a9d6-480a-8351-8bec774c4849",
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
  "pickup_at": "2026-10-28T10:30:15Z"
}
```

```json
{
  "id": "027b1e32-1a9b-4f3f-9004-65336e36509f",
  "short_number": 15,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d6cdd3bb-98d8-4a45-88a0-c999d071a0bd",
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
  "created_at": "2026-10-28T07:30:16.375413Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:30:15Z",
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
  "device_ref": "sandbox-26672"
}
```

```json
{
  "challenge_id": "220dc91d-a135-43b7-b97b-196008978e62",
  "expires_at": "2026-10-28T07:35:16.406620209Z",
  "resend_available_at": "2026-10-28T07:30:17.406620209Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "353655",
  "sent_at": "2026-10-28T07:30:16.40891264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "220dc91d-a135-43b7-b97b-196008978e62",
  "code": "353655",
  "device_ref": "sandbox-26672"
}
```

```json
{
  "session_id": "5743897d-4245-4e63-a1f2-9f6588c9fc56",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzUxNiwiaWF0IjoxNzkzMTcyNjE2LCJqdGkiOiJhYTEyMmZlMy03M2JlLTQ5MmEtODJkYS1jYzAzY2MxNTJmYmEiLCJzaWQiOiI1NzQzODk3ZC00MjQ1LTRlNjMtYTFmMi05ZjY1ODhjOWZjNTYifQ.blcWUPOG1eyxisLuFBuAchHlyDRkUY0Ec1AAF-tntgQ",
  "access_expires_at": "2026-10-28T07:45:16.467607451Z",
  "refresh_token": "mF3EZwmL2TfruINn839EX1AmpvNftQvA6p2Gh5gTF00",
  "refresh_expires_at": "2026-11-27T07:30:16.467050221Z",
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
  "command_id": "77472174-cbc8-4dec-9f23-c7d10c77ce28",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:16Z",
    "sequence": 1793172616519
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b03a06dc-0d6c-4ef5-9a94-a9a37913fc96",
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
  "last_heartbeat_at": "2026-10-28T07:30:16.537133Z",
  "last_location_at": "2026-10-28T07:30:16.537133Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "027b1e32-1a9b-4f3f-9004-65336e36509f",
      "short_number": 15,
      "pickup_at": "2026-10-28T10:30:15Z",
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

`POST /api/driver/v1/preorders/027b1e32-1a9b-4f3f-9004-65336e36509f/reserve` → **200**

```json
{
  "command_id": "c15cfc33-00b0-4d8f-8d50-41b15a5308e3"
}
```

```json
{
  "id": "38bf4d86-bf94-405b-a2d1-df0221f066cc",
  "state": "RESERVED",
  "order": {
    "order_id": "027b1e32-1a9b-4f3f-9004-65336e36509f",
    "short_number": 15,
    "pickup_at": "2026-10-28T10:30:15Z",
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
  "reserved_at": "2026-10-28T07:30:16.606354Z",
  "confirm_from": "2026-10-28T10:00:15Z",
  "confirm_until": "2026-10-28T10:10:15Z",
  "drop_until": "2026-10-28T09:30:15Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "38bf4d86-bf94-405b-a2d1-df0221f066cc",
      "state": "RESERVED",
      "order": {
        "order_id": "027b1e32-1a9b-4f3f-9004-65336e36509f",
        "short_number": 15,
        "pickup_at": "2026-10-28T10:30:15Z",
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
      "reserved_at": "2026-10-28T07:30:16.606354Z",
      "confirm_from": "2026-10-28T10:00:15Z",
      "confirm_until": "2026-10-28T10:10:15Z",
      "drop_until": "2026-10-28T09:30:15Z"
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
      "id": "38bf4d86-bf94-405b-a2d1-df0221f066cc",
      "state": "RESERVED",
      "order": {
        "order_id": "027b1e32-1a9b-4f3f-9004-65336e36509f",
        "short_number": 15,
        "pickup_at": "2026-10-28T10:30:15Z",
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
      "reserved_at": "2026-10-28T07:30:16.606354Z",
      "confirm_from": "2026-10-28T10:00:15Z",
      "confirm_until": "2026-10-28T10:10:15Z",
      "drop_until": "2026-10-28T09:30:15Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/38bf4d86-bf94-405b-a2d1-df0221f066cc/confirm` → **409**

```json
{
  "command_id": "dc1cc6e0-06e7-46a1-8db9-c7c5fe9edec2"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/38bf4d86-bf94-405b-a2d1-df0221f066cc/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "08682b28-517f-43f9-8e22-9fd4eb856cca"
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
  "session_id": "b0cb6555-aa1e-4cc5-a8a1-6563ec994b08",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MTcsImlhdCI6MTc5MzE3MjYxNywianRpIjoiNjZlNWZjMTMtMzQzNC00MmQxLWE0NmItMjY3ZjI1NTllZjkyIiwic2lkIjoiYjBjYjY1NTUtYWExZS00Y2M1LWE4YTEtNjU2M2VjOTk0YjA4In0.XzsK8Q5Q2969-XPi3yvU1SJHRHAqdlPgIAqwOoU4yf0",
  "access_expires_at": "2026-10-28T07:45:17.01876217Z",
  "refresh_token": "tnMPZG0wmVa_PVkYE9AoNbJ5Ph1zQhRpD6hVsn4V4t4",
  "refresh_expires_at": "2026-10-28T19:30:17.018215169Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/027b1e32-1a9b-4f3f-9004-65336e36509f` → **200**

```json
{
  "id": "027b1e32-1a9b-4f3f-9004-65336e36509f",
  "short_number": 15,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "d6cdd3bb-98d8-4a45-88a0-c999d071a0bd",
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
  "created_at": "2026-10-28T07:30:16.375413Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T10:30:15Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "38bf4d86-bf94-405b-a2d1-df0221f066cc",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T07:30:16.606354Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/027b1e32-1a9b-4f3f-9004-65336e36509f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T07:30:16.376521Z",
      "actor": {
        "type": "CLIENT",
        "id": "d6cdd3bb-98d8-4a45-88a0-c999d071a0bd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "027b1e32-1a9b-4f3f-9004-65336e36509f",
        "preorder": true,
        "quote_id": "3f223a2b-a9d6-480a-8351-8bec774c4849",
        "pickup_at": "2026-10-28T10:30:15Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T07:30:16.607459Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "027b1e32-1a9b-4f3f-9004-65336e36509f",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "38bf4d86-bf94-405b-a2d1-df0221f066cc"
      }
    }
  ]
}
```

Done: pre-order 027b1e32-1a9b-4f3f-9004-65336e36509f, reservation 38bf4d86-bf94-405b-a2d1-df0221f066cc.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9050"
}
```

```json
{
  "challenge_id": "f0ad3b54-b1fd-43a5-8b14-6d68c989fcd2",
  "expires_at": "2026-10-28T07:35:17.104465945Z",
  "resend_available_at": "2026-10-28T07:30:18.104465945Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "620674",
  "sent_at": "2026-10-28T07:30:17.10652828Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0ad3b54-b1fd-43a5-8b14-6d68c989fcd2",
  "code": "620674",
  "device_ref": "sandbox-9050"
}
```

```json
{
  "session_id": "8fc77687-990c-4973-8a99-a64495e44f62",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzUxNywiaWF0IjoxNzkzMTcyNjE3LCJqdGkiOiJmMzYzMzZkNC1iNzA1LTRiYzMtYWI3OS0zZDFhMDcyNjVhMTciLCJzaWQiOiI4ZmM3NzY4Ny05OTBjLTQ5NzMtOGE5OS1hNjQ0OTVlNDRmNjIifQ.89IMHm-aq54o1echs8G-4uobL4QBtRpMRcM8p5xVQ_o",
  "access_expires_at": "2026-10-28T07:45:17.160832258Z",
  "refresh_token": "9zbOU5g0t5oByu7OjvS1N-N2E0LgpybrLt-9RfHlVM4",
  "refresh_expires_at": "2026-11-27T07:30:17.160255868Z",
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
  "command_id": "bbe1e6e6-9aad-4ffa-9ca6-949a95f0325e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:17Z",
    "sequence": 1793172617209
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81b50ee1-fc50-4a7b-acad-b35e9651651a",
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
  "last_heartbeat_at": "2026-10-28T07:30:17.226535Z",
  "last_location_at": "2026-10-28T07:30:17.226535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670711344",
  "device_ref": "sandbox-689"
}
```

```json
{
  "challenge_id": "a1cbe41e-9af2-4715-9677-4520ca2bc66c",
  "expires_at": "2026-10-28T07:35:17.256203301Z",
  "resend_available_at": "2026-10-28T07:30:18.256203301Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670711344` → **200**

```json
{
  "phone": "+380670711344",
  "audience": "CLIENT",
  "code": "179156",
  "sent_at": "2026-10-28T07:30:17.258558564Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1cbe41e-9af2-4715-9677-4520ca2bc66c",
  "code": "179156",
  "device_ref": "sandbox-689"
}
```

```json
{
  "session_id": "2b4b6712-d50b-480e-95cc-75654590a68d",
  "subject": {
    "type": "CLIENT",
    "id": "e951650e-3772-495b-a917-8cfc45e76436"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTUxNjUwZS0zNzcyLTQ5NWItYTkxNy04Y2ZjNDVlNzY0MzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNTE3LCJpYXQiOjE3OTMxNzI2MTcsImp0aSI6IjAyYzczZDdjLTYwMjYtNDE2OS1iZjM5LWRiYzMxOGQ1OTliNCIsInNpZCI6IjJiNGI2NzEyLWQ1MGItNDgwZS05NWNjLTc1NjU0NTkwYTY4ZCJ9.rZ117PRM8v4m4Ob7PwUIXTf0Y8dlD5fVyn8Xhc6xlUs",
  "access_expires_at": "2026-10-28T07:45:17.311948566Z",
  "refresh_token": "OGi1Tsp2kZ_Re34rcCLEfeXZZsi9_-rCruZNs23ZNrI",
  "refresh_expires_at": "2026-11-27T07:30:17.31125956Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d71f2690-66b2-44bc-aa39-85b149cea937",
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
  "id": "df9aac30-622d-4422-b0d3-66ce2c2e0424",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:35:17.349455Z",
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
  "command_id": "be46c87b-c246-4e38-be9f-0c281662ec1f",
  "quote_id": "df9aac30-622d-4422-b0d3-66ce2c2e0424",
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
  "id": "28cfa484-0473-4388-9bfa-dd6f624d3ed6",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e951650e-3772-495b-a917-8cfc45e76436",
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
  "created_at": "2026-10-28T07:30:17.385947Z",
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
    "id": "11ca678a-a3f1-460c-b288-29af7fd97b17",
    "order_id": "28cfa484-0473-4388-9bfa-dd6f624d3ed6",
    "expires_at": "2026-10-28T07:30:32.388661Z",
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

`POST /api/driver/v1/offers/11ca678a-a3f1-460c-b288-29af7fd97b17/accept` → **200**

```json
{
  "command_id": "ff5304f3-b89e-42c2-a112-f4d5ad81ebca"
}
```

```json
{
  "id": "fe730b6d-1588-40cc-ae81-e2b267795aed",
  "order_id": "28cfa484-0473-4388-9bfa-dd6f624d3ed6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "85a1eda4-44b5-43d0-9886-a275e24272b5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "85a1eda4-44b5-43d0-9886-a275e24272b5",
  "order_id": "28cfa484-0473-4388-9bfa-dd6f624d3ed6",
  "assignment_id": "fe730b6d-1588-40cc-ae81-e2b267795aed",
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

`POST /api/driver/v1/work-sessions/81b50ee1-fc50-4a7b-acad-b35e9651651a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:17Z",
    "sequence": 1793172617488
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81b50ee1-fc50-4a7b-acad-b35e9651651a",
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
  "last_heartbeat_at": "2026-10-28T07:30:17.506305Z",
  "last_location_at": "2026-10-28T07:30:17.506305Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "85a1eda4-44b5-43d0-9886-a275e24272b5",
  "order_id": "28cfa484-0473-4388-9bfa-dd6f624d3ed6",
  "assignment_id": "fe730b6d-1588-40cc-ae81-e2b267795aed",
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

`POST /api/driver/v1/trips/85a1eda4-44b5-43d0-9886-a275e24272b5/arrive` → **200**

```json
{
  "command_id": "8d8c1fd0-af58-422f-bbcc-80da41e8509c",
  "expected_version": 0
}
```

```json
{
  "id": "85a1eda4-44b5-43d0-9886-a275e24272b5",
  "order_id": "28cfa484-0473-4388-9bfa-dd6f624d3ed6",
  "assignment_id": "fe730b6d-1588-40cc-ae81-e2b267795aed",
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
  "arrived_at": "2026-10-28T07:30:17.556422Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/85a1eda4-44b5-43d0-9886-a275e24272b5/start` → **200**

```json
{
  "command_id": "bac6c702-133d-4ccd-b975-374c2583e02a",
  "expected_version": 1
}
```

```json
{
  "id": "85a1eda4-44b5-43d0-9886-a275e24272b5",
  "order_id": "28cfa484-0473-4388-9bfa-dd6f624d3ed6",
  "assignment_id": "fe730b6d-1588-40cc-ae81-e2b267795aed",
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
  "arrived_at": "2026-10-28T07:30:17.556422Z",
  "started_at": "2026-10-28T07:30:17.588414Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/81b50ee1-fc50-4a7b-acad-b35e9651651a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:17Z",
    "sequence": 1793172617611
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81b50ee1-fc50-4a7b-acad-b35e9651651a",
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
  "last_heartbeat_at": "2026-10-28T07:30:17.629119Z",
  "last_location_at": "2026-10-28T07:30:17.629119Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/85a1eda4-44b5-43d0-9886-a275e24272b5/complete` → **200**

```json
{
  "command_id": "decefb55-bdb2-4ffc-9e29-3188dedd08cf",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:30:17Z",
  "cash_received": true
}
```

```json
{
  "id": "85a1eda4-44b5-43d0-9886-a275e24272b5",
  "order_id": "28cfa484-0473-4388-9bfa-dd6f624d3ed6",
  "assignment_id": "fe730b6d-1588-40cc-ae81-e2b267795aed",
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
  "arrived_at": "2026-10-28T07:30:17.556422Z",
  "started_at": "2026-10-28T07:30:17.588414Z",
  "completed_at": "2026-10-28T07:30:17.659588Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/28cfa484-0473-4388-9bfa-dd6f624d3ed6/rating` → **200**

```json
{
  "command_id": "e54c1829-611b-4bb3-b7e7-2b380ee61dd8",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "28cfa484-0473-4388-9bfa-dd6f624d3ed6",
  "score": 5,
  "created_at": "2026-10-28T07:30:17.705281118Z"
}
```

`POST /api/driver/v1/orders/28cfa484-0473-4388-9bfa-dd6f624d3ed6/rating` → **200**

```json
{
  "command_id": "46ea347e-9fa2-43e5-8607-d1d77588159c",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "28cfa484-0473-4388-9bfa-dd6f624d3ed6",
  "score": 4,
  "created_at": "2026-10-28T07:30:17.740108582Z"
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
  "session_id": "9ff102dc-e464-4428-9c31-1b7142944398",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MTgsImlhdCI6MTc5MzE3MjYxOCwianRpIjoiODRmYmRiYzMtOWFiZi00YzUyLWI2OWUtMzc0Y2RmY2NmYmUwIiwic2lkIjoiOWZmMTAyZGMtZTQ2NC00NDI4LTljMzEtMWI3MTQyOTQ0Mzk4In0.P17xtYXfROyMlAq-XF5z_SmmP2cB-qdIVv2DednPOqU",
  "access_expires_at": "2026-10-28T07:45:18.092722646Z",
  "refresh_token": "sjRp6tcrbhfRMbD-wB7Xam7ZIQpvdxF-HaPeI45cgSc",
  "refresh_expires_at": "2026-10-28T19:30:18.092143414Z",
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
  "session_id": "efc11319-6843-4ead-a1d1-be0221b1aa87",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MTgsImlhdCI6MTc5MzE3MjYxOCwianRpIjoiOGIyM2I4OTMtZTFiMS00ZTZhLWI0M2YtYzI0NDIzZDMxZmJlIiwic2lkIjoiZWZjMTEzMTktNjg0My00ZWFkLWExZDEtYmUwMjIxYjFhYTg3In0.ZNqc3cMn4dkTkoVlpD49_Ee3MYai-eHZ8sq6ughD2q8",
  "access_expires_at": "2026-10-28T07:45:18.412712947Z",
  "refresh_token": "3nb1i4_9suqMb9Y-NA4SYMKFCQGm6qz7_0FckcMP-Oo",
  "refresh_expires_at": "2026-10-28T19:30:18.41213856Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/28cfa484-0473-4388-9bfa-dd6f624d3ed6/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "28cfa484-0473-4388-9bfa-dd6f624d3ed6",
      "author_type": "RIDER",
      "author_id": "e951650e-3772-495b-a917-8cfc45e76436",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T07:30:17.705281Z"
    },
    {
      "order_id": "28cfa484-0473-4388-9bfa-dd6f624d3ed6",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "e951650e-3772-495b-a917-8cfc45e76436",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T07:30:17.740109Z"
    }
  ]
}
```

Done: ratings for order 28cfa484-0473-4388-9bfa-dd6f624d3ed6.

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
  "session_id": "a4c74d72-e6f8-43e3-b002-5806fe774c40",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MTgsImlhdCI6MTc5MzE3MjYxOCwianRpIjoiZTMzOTFlODQtOTdjZi00NmExLTk0NmItNGViMzIwOTVkMzI5Iiwic2lkIjoiYTRjNzRkNzItZTZmOC00M2UzLWIwMDItNTgwNmZlNzc0YzQwIn0.tR8oqTvpITFow_bvJRRoY_9Zcl0s14_Zok6jwmznf_0",
  "access_expires_at": "2026-10-28T07:45:18.778927753Z",
  "refresh_token": "aBc8ogtoMuux0IrckHHvp96Uo0duX61Sq3nlsKbCOjs",
  "refresh_expires_at": "2026-10-28T19:30:18.778328712Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6e15d104-b7ad-4068-b145-f70fbde7f3ab",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "5420f51e-dd1b-4628-9918-9a9e60085eea",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:30:18.818902Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5420f51e-dd1b-4628-9918-9a9e60085eea` → **200**

```json
{
  "id": "5420f51e-dd1b-4628-9918-9a9e60085eea",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:30:18.818902Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5420f51e-dd1b-4628-9918-9a9e60085eea` → **200**

```json
{
  "id": "5420f51e-dd1b-4628-9918-9a9e60085eea",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:30:18.818902Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5420f51e-dd1b-4628-9918-9a9e60085eea` → **200**

```json
{
  "id": "5420f51e-dd1b-4628-9918-9a9e60085eea",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:30:18.818902Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5420f51e-dd1b-4628-9918-9a9e60085eea` → **200**

```json
{
  "id": "5420f51e-dd1b-4628-9918-9a9e60085eea",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:30:18.818902Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5420f51e-dd1b-4628-9918-9a9e60085eea` → **200**

```json
{
  "id": "5420f51e-dd1b-4628-9918-9a9e60085eea",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:30:18.818902Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5420f51e-dd1b-4628-9918-9a9e60085eea` → **200**

```json
{
  "id": "5420f51e-dd1b-4628-9918-9a9e60085eea",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T07:30:18.818902Z",
  "ready_at": "2026-10-28T07:30:23.674149Z",
  "expires_at": "2026-10-29T07:30:23.674149Z"
}
```

`GET /api/admin/v1/reports/exports/5420f51e-dd1b-4628-9918-9a9e60085eea/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,15,6,9,0,0,11,4,0,13,1,0,1,4,1,4
total,15,6,9,0,0,11,4,0,13,1,0,1,4,1,4
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "ce643309-5a5d-4cc7-b185-338fadf7d6e4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "1ffb321c-a189-4a82-9f25-418837d9e977",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:30:24.04437Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1ffb321c-a189-4a82-9f25-418837d9e977` → **200**

```json
{
  "id": "1ffb321c-a189-4a82-9f25-418837d9e977",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:30:24.04437Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1ffb321c-a189-4a82-9f25-418837d9e977` → **200**

```json
{
  "id": "1ffb321c-a189-4a82-9f25-418837d9e977",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:30:24.04437Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1ffb321c-a189-4a82-9f25-418837d9e977` → **200**

```json
{
  "id": "1ffb321c-a189-4a82-9f25-418837d9e977",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:30:24.04437Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1ffb321c-a189-4a82-9f25-418837d9e977` → **200**

```json
{
  "id": "1ffb321c-a189-4a82-9f25-418837d9e977",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:30:24.04437Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1ffb321c-a189-4a82-9f25-418837d9e977` → **200**

```json
{
  "id": "1ffb321c-a189-4a82-9f25-418837d9e977",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:30:24.04437Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1ffb321c-a189-4a82-9f25-418837d9e977` → **200**

```json
{
  "id": "1ffb321c-a189-4a82-9f25-418837d9e977",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T07:30:24.04437Z",
  "ready_at": "2026-10-28T07:30:28.681809Z",
  "expires_at": "2026-10-29T07:30:28.681809Z"
}
```

`GET /api/admin/v1/reports/exports/1ffb321c-a189-4a82-9f25-418837d9e977/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/f6b00972-2860-49a1-85f3-914755d7a591` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/f6b00972-2860-49a1-85f3-914755d7a591",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2328d8f0-909e-4038-ac60-202bd7ff14bc"
}
```

Done: both reports were built in the background and downloaded.

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
  "session_id": "7b1a2340-2f28-4a75-b0fb-057d055921b6",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MjksImlhdCI6MTc5MzE3MjYyOSwianRpIjoiY2NmYTVjMzUtNWFkNy00Mjk1LWFlYjctOTBlYjNmOGNjZDgwIiwic2lkIjoiN2IxYTIzNDAtMmYyOC00YTc1LWIwZmItMDU3ZDA1NTkyMWI2In0.Y3vf8NXVDgH7EKtTW3TNIeeBkhgrcdn8wd5z_wQeGxY",
  "access_expires_at": "2026-10-28T07:45:29.587210602Z",
  "refresh_token": "GmirgXpIQZ9zLPcadn7X3rIXZNjYqWlTpRtcFQ6cl_o",
  "refresh_expires_at": "2026-10-28T19:30:29.586713495Z",
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
  "command_id": "2d62153c-9b22-4476-af1d-b9277b331af8",
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
  "changed_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T07:30:29.655558Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "2d62153c-9b22-4476-af1d-b9277b331af8",
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
  "changed_by": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T07:30:29.655558Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48642447239",
  "device_ref": "sandbox-8801"
}
```

```json
{
  "challenge_id": "e8d04e17-6146-4bc2-a1ef-927f81320c51",
  "expires_at": "2026-10-28T07:35:29.729039685Z",
  "resend_available_at": "2026-10-28T07:30:30.729039685Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48642447239` → **200**

```json
{
  "phone": "+48642447239",
  "audience": "CLIENT",
  "code": "796332",
  "sent_at": "2026-10-28T07:30:29.731439024Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8d04e17-6146-4bc2-a1ef-927f81320c51",
  "code": "796332",
  "device_ref": "sandbox-8801"
}
```

```json
{
  "session_id": "fcf5fa9d-7f3d-4f7b-a34b-5dd23a081ace",
  "subject": {
    "type": "CLIENT",
    "id": "0423abe6-33ad-447c-b1b3-746acbeb0b80"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDIzYWJlNi0zM2FkLTQ0N2MtYjFiMy03NDZhY2JlYjBiODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNTI5LCJpYXQiOjE3OTMxNzI2MjksImp0aSI6IjA3NTdjOTJjLTY1ZDktNDEwMC1hZWYxLTc4MDNmM2VlZDMxYiIsInNpZCI6ImZjZjVmYTlkLTdmM2QtNGY3Yi1hMzRiLTVkZDIzYTA4MWFjZSJ9.XKkUw5sOZK_FYjacUJ9WPFHKBRZvP6qY77w-pfMqRlA",
  "access_expires_at": "2026-10-28T07:45:29.78498743Z",
  "refresh_token": "m42AMHqdSU8XHoU5UYJNyWOs-iayNsY2SPsvOzCYh8k",
  "refresh_expires_at": "2026-11-27T07:30:29.784416331Z",
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
  "correlation_id": "abd8736a-1f2d-4d55-b767-6fd7721d0d56"
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
  "device_ref": "sandbox-31359"
}
```

```json
{
  "challenge_id": "9ba05453-1352-4396-8330-5baf764d853f",
  "expires_at": "2026-10-28T07:35:29.864862718Z",
  "resend_available_at": "2026-10-28T07:30:30.864862718Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "718071",
  "sent_at": "2026-10-28T07:30:29.8668508Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ba05453-1352-4396-8330-5baf764d853f",
  "code": "718071",
  "device_ref": "sandbox-31359"
}
```

```json
{
  "session_id": "feccf421-5705-46a9-a082-f6d361439607",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzUyOSwiaWF0IjoxNzkzMTcyNjI5LCJqdGkiOiJkM2VlYzI4My0yNzRlLTQzNDAtYjg3OC1lZDIzN2IxZDhkMTQiLCJzaWQiOiJmZWNjZjQyMS01NzA1LTQ2YTktYTA4Mi1mNmQzNjE0Mzk2MDcifQ.KS8kJLSSsa1FGT4-xfDYqQqggEscBjcXdw8gnqrIogU",
  "access_expires_at": "2026-10-28T07:45:29.919985869Z",
  "refresh_token": "4PLkwiKFouu2ugQzgOsgao4ZA7uWnNptIHaZ0caRwuo",
  "refresh_expires_at": "2026-11-27T07:30:29.919420623Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b03a06dc-0d6c-4ef5-9a94-a9a37913fc96",
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
  "last_heartbeat_at": "2026-10-28T07:30:16.537133Z",
  "last_location_at": "2026-10-28T07:30:16.537133Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b03a06dc-0d6c-4ef5-9a94-a9a37913fc96/handover` → **200**

```json
{
  "command_id": "e14d37ad-b727-4fc7-9dc2-eb9760dfe23e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b03a06dc-0d6c-4ef5-9a94-a9a37913fc96",
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
  "last_heartbeat_at": "2026-10-28T07:30:16.537133Z",
  "last_location_at": "2026-10-28T07:30:16.537133Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b03a06dc-0d6c-4ef5-9a94-a9a37913fc96/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:29Z",
    "sequence": 1793172630122
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b03a06dc-0d6c-4ef5-9a94-a9a37913fc96",
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
  "last_heartbeat_at": "2026-10-28T07:30:30.019128Z",
  "last_location_at": "2026-10-28T07:30:30.019128Z",
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
  "session_id": "b03a06dc-0d6c-4ef5-9a94-a9a37913fc96",
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
  "last_heartbeat_at": "2026-10-28T07:30:30.019128Z",
  "last_location_at": "2026-10-28T07:30:30.019128Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b03a06dc-0d6c-4ef5-9a94-a9a37913fc96/close` → **200**

```json
{
  "command_id": "9db0e42f-a3c8-4020-8044-b3103e5545d5",
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
  "correlation_id": "fdb2162e-a4d7-4f95-9746-8a157645c057"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671666620",
  "device_ref": "sandbox-6494"
}
```

```json
{
  "challenge_id": "90b22e07-8de3-4f26-b32e-701674df9d1b",
  "expires_at": "2026-10-28T07:35:30.176113189Z",
  "resend_available_at": "2026-10-28T07:30:31.176113189Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671666620` → **200**

```json
{
  "phone": "+380671666620",
  "audience": "CLIENT",
  "code": "643634",
  "sent_at": "2026-10-28T07:30:30.178195891Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90b22e07-8de3-4f26-b32e-701674df9d1b",
  "code": "643634",
  "device_ref": "sandbox-6494"
}
```

```json
{
  "session_id": "33ba5547-29d4-42cb-9d2b-e948a4e7c294",
  "subject": {
    "type": "CLIENT",
    "id": "7276782e-eb32-4a3b-9403-7e5d2bb5707d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Mjc2NzgyZS1lYjMyLTRhM2ItOTQwMy03ZTVkMmJiNTcwN2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczNTMwLCJpYXQiOjE3OTMxNzI2MzAsImp0aSI6ImMwZWMwYzkxLTdmYmYtNGU3Mi05NDExLTU1ZDAzNDA4MzIwMiIsInNpZCI6IjMzYmE1NTQ3LTI5ZDQtNDJjYi05ZDJiLWU5NDhhNGU3YzI5NCJ9.n8447kxxBjEAnm-MsMR7uy8w58hsNfDlqqO9ac2OK3g",
  "access_expires_at": "2026-10-28T07:45:30.231332672Z",
  "refresh_token": "CDNyOa0W55ObFxlbwepEmt2AYQVL7h4smjYW5neyuh4",
  "refresh_expires_at": "2026-11-27T07:30:30.230702217Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "996c3856-af4e-4e3d-9290-d1af8a077f24",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "d3a97e13-e105-4ce6-99aa-fcddfb30f9d7",
  "upload_path": "/api/rider/v1/uploads/d3a97e13-e105-4ce6-99aa-fcddfb30f9d7",
  "expires_at": "2026-10-28T07:45:30.267311601Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/d3a97e13-e105-4ce6-99aa-fcddfb30f9d7` → **200**

```json
{
  "file_id": "d3a97e13-e105-4ce6-99aa-fcddfb30f9d7",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "fdc0d98a-e72b-4f28-9096-893bed7f13ff",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "d3a97e13-e105-4ce6-99aa-fcddfb30f9d7"
  ]
}
```

```json
{
  "id": "0ef987f9-e155-484b-84da-10a76df06b20",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "7276782e-eb32-4a3b-9403-7e5d2bb5707d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T07:30:30.333854Z",
  "updated_at": "2026-10-28T07:30:30.333854Z",
  "messages": [
    {
      "id": "69aa80b6-9ede-4a13-a2ed-04d702b84457",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "7276782e-eb32-4a3b-9403-7e5d2bb5707d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:30:30.335402Z",
      "attachments": [
        {
          "file_id": "d3a97e13-e105-4ce6-99aa-fcddfb30f9d7",
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
  "session_id": "7d2df7ab-080d-4fc2-9878-b9f67f151786",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MzAsImlhdCI6MTc5MzE3MjYzMCwianRpIjoiMjdlNWI0MDYtYmUzZC00ODVlLTgwZTAtMGVkMmFkNDEyYjBhIiwic2lkIjoiN2QyZGY3YWItMDgwZC00ZmMyLTk4NzgtYjlmNjdmMTUxNzg2In0.Fg3lhjXoD8nw1uQ4FsPhERVovExb1LJWvH5DWiWCFFQ",
  "access_expires_at": "2026-10-28T07:45:30.681730007Z",
  "refresh_token": "Vn-TsKom0rwFGkKp77BOn-m2rDdUAsd-pn58d0-4N9Y",
  "refresh_expires_at": "2026-10-28T19:30:30.681178949Z",
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
  "session_id": "11edc084-a109-4ed1-bcf5-90197d5b69c1",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MzAsImlhdCI6MTc5MzE3MjYzMCwianRpIjoiNzhkMzJjOTctNDFkNS00NzNiLThiYTgtOTFjNGZhYTA3OWRmIiwic2lkIjoiMTFlZGMwODQtYTEwOS00ZWQxLWJjZjUtOTAxOTdkNWI2OWMxIn0.0vfjlQfFMBRkz4wAqDGO7aS2E5UjYmpdWYTNi36bJg0",
  "access_expires_at": "2026-10-28T07:45:30.998755561Z",
  "refresh_token": "TcbSz1U6C4l4KYgWa6dMrjYEI2e6I3CMBD13Q1TZrm4",
  "refresh_expires_at": "2026-10-28T19:30:30.998209804Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/0ef987f9-e155-484b-84da-10a76df06b20/attachments/d3a97e13-e105-4ce6-99aa-fcddfb30f9d7` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "c19acf24-4d18-4160-8fdd-d8e0006e52ff",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "a0480d53-a9ac-49e2-a5d1-c5e48bb6223e",
  "upload_path": "/api/operator/v1/uploads/a0480d53-a9ac-49e2-a5d1-c5e48bb6223e",
  "expires_at": "2026-10-28T07:45:31.044033513Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/a0480d53-a9ac-49e2-a5d1-c5e48bb6223e` → **200**

```json
{
  "file_id": "a0480d53-a9ac-49e2-a5d1-c5e48bb6223e",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/0ef987f9-e155-484b-84da-10a76df06b20` → **200**

```json
{
  "id": "0ef987f9-e155-484b-84da-10a76df06b20",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "7276782e-eb32-4a3b-9403-7e5d2bb5707d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T07:30:30.333854Z",
  "updated_at": "2026-10-28T07:30:30.333854Z",
  "messages": [
    {
      "id": "69aa80b6-9ede-4a13-a2ed-04d702b84457",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "7276782e-eb32-4a3b-9403-7e5d2bb5707d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:30:30.335402Z",
      "attachments": [
        {
          "file_id": "d3a97e13-e105-4ce6-99aa-fcddfb30f9d7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/0ef987f9-e155-484b-84da-10a76df06b20/comments` → **200**

```json
{
  "command_id": "0de815da-329a-4816-aa44-896da7d87bdb",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "a0480d53-a9ac-49e2-a5d1-c5e48bb6223e"
  ]
}
```

```json
{
  "id": "0ef987f9-e155-484b-84da-10a76df06b20",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "7276782e-eb32-4a3b-9403-7e5d2bb5707d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T07:30:30.333854Z",
  "updated_at": "2026-10-28T07:30:31.137154Z",
  "messages": [
    {
      "id": "69aa80b6-9ede-4a13-a2ed-04d702b84457",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "7276782e-eb32-4a3b-9403-7e5d2bb5707d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:30:30.335402Z",
      "attachments": [
        {
          "file_id": "d3a97e13-e105-4ce6-99aa-fcddfb30f9d7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "522fdd6b-5168-4efb-97d4-d0b83079c83f",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "dbd9ee06-2b81-4924-86dd-d555af0288d4",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T07:30:31.136757Z",
      "attachments": [
        {
          "file_id": "a0480d53-a9ac-49e2-a5d1-c5e48bb6223e",
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

`GET /api/rider/v1/support/cases/0ef987f9-e155-484b-84da-10a76df06b20` → **200**

```json
{
  "id": "0ef987f9-e155-484b-84da-10a76df06b20",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "7276782e-eb32-4a3b-9403-7e5d2bb5707d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T07:30:30.333854Z",
  "updated_at": "2026-10-28T07:30:31.137154Z",
  "messages": [
    {
      "id": "69aa80b6-9ede-4a13-a2ed-04d702b84457",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "7276782e-eb32-4a3b-9403-7e5d2bb5707d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:30:30.335402Z",
      "attachments": [
        {
          "file_id": "d3a97e13-e105-4ce6-99aa-fcddfb30f9d7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "522fdd6b-5168-4efb-97d4-d0b83079c83f",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T07:30:31.136757Z",
      "attachments": [
        {
          "file_id": "a0480d53-a9ac-49e2-a5d1-c5e48bb6223e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/0ef987f9-e155-484b-84da-10a76df06b20/attachments/a0480d53-a9ac-49e2-a5d1-c5e48bb6223e` → **200**

Done: support case 0ef987f9-e155-484b-84da-10a76df06b20, rider attachment d3a97e13-e105-4ce6-99aa-fcddfb30f9d7, operator attachment a0480d53-a9ac-49e2-a5d1-c5e48bb6223e.

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
  "session_id": "b8a0ae7d-520e-4d3d-a6dc-aa829cca3514",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MzEsImlhdCI6MTc5MzE3MjYzMSwianRpIjoiNDY3ZjAzZDYtMjI0OC00NWI1LTgwOTctN2U2NDAxODRiNzkxIiwic2lkIjoiYjhhMGFlN2QtNTIwZS00ZDNkLWE2ZGMtYWE4MjljY2EzNTE0In0.g0GqFeSvrjYL4xS8GjTWkLlwKnMmu9sbjpwvpSeiJco",
  "access_expires_at": "2026-10-28T07:45:31.517270052Z",
  "refresh_token": "meeeKdy5RqeHej_lczb4ZkzJr3UCstYJuKKWprIemMQ",
  "refresh_expires_at": "2026-10-28T19:30:31.516781081Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2971"
}
```

```json
{
  "challenge_id": "8e9b43a7-f374-4ac4-a41c-edca25614b37",
  "expires_at": "2026-10-28T07:35:31.543411588Z",
  "resend_available_at": "2026-10-28T07:30:32.543411588Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "747368",
  "sent_at": "2026-10-28T07:30:31.545690711Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e9b43a7-f374-4ac4-a41c-edca25614b37",
  "code": "747368",
  "device_ref": "sandbox-2971"
}
```

```json
{
  "session_id": "b8f971a1-edb8-4750-9488-3dbdf7f37d83",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzUzMSwiaWF0IjoxNzkzMTcyNjMxLCJqdGkiOiJhMWRkZDg1OC05OTlhLTQzNTctYjcwMS1mOWNhNjIxOTY2YjciLCJzaWQiOiJiOGY5NzFhMS1lZGI4LTQ3NTAtOTQ4OC0zZGJkZjdmMzdkODMifQ.VGM72irhtER90K2kdz2XNVKcT4ypIPcYZMtgSii7op8",
  "access_expires_at": "2026-10-28T07:45:31.600089591Z",
  "refresh_token": "uRkrekH-fuVNK-iuoZbXHyCDBRkvgCryQGeVKmYCQiU",
  "refresh_expires_at": "2026-11-27T07:30:31.599476506Z",
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
  "command_id": "4cb17c10-0277-42f8-9685-fe6a80d49650",
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
  "device_ref": "sandbox-26593"
}
```

```json
{
  "challenge_id": "05a84c5f-025b-47ba-87e3-fa25e0c6ac88",
  "expires_at": "2026-10-28T07:35:31.728785909Z",
  "resend_available_at": "2026-10-28T07:30:32.728785909Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "102697",
  "sent_at": "2026-10-28T07:30:31.730971666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05a84c5f-025b-47ba-87e3-fa25e0c6ac88",
  "code": "102697",
  "device_ref": "sandbox-26593"
}
```

```json
{
  "session_id": "7bd15d30-c117-4eeb-9c8e-74820f304e82",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzUzMSwiaWF0IjoxNzkzMTcyNjMxLCJqdGkiOiJhZjlkMDlmNC0yN2MxLTQ3OGItYTY0YS01OTIzYzYwOTVlMzMiLCJzaWQiOiI3YmQxNWQzMC1jMTE3LTRlZWItOWM4ZS03NDgyMGYzMDRlODIifQ.aZXZGiIiQSEVlHjh2jfsQnatETG-6VGfOIqD60hV00U",
  "access_expires_at": "2026-10-28T07:45:31.783156163Z",
  "refresh_token": "zNvXKOZz09Y61L2iDERVmlfIttjvLV8VIu1oE3RmrJM",
  "refresh_expires_at": "2026-11-27T07:30:31.782606908Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81b50ee1-fc50-4a7b-acad-b35e9651651a",
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
  "last_heartbeat_at": "2026-10-28T07:30:17.629119Z",
  "last_location_at": "2026-10-28T07:30:17.629119Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/81b50ee1-fc50-4a7b-acad-b35e9651651a/handover` → **200**

```json
{
  "command_id": "6c2a7a62-0b7a-4bc0-b31a-38f21ec14091",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81b50ee1-fc50-4a7b-acad-b35e9651651a",
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
  "last_heartbeat_at": "2026-10-28T07:30:17.629119Z",
  "last_location_at": "2026-10-28T07:30:17.629119Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/81b50ee1-fc50-4a7b-acad-b35e9651651a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:31Z",
    "sequence": 1793172631864
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81b50ee1-fc50-4a7b-acad-b35e9651651a",
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
  "last_heartbeat_at": "2026-10-28T07:30:31.881436Z",
  "last_location_at": "2026-10-28T07:30:31.881436Z",
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
  "command_id": "53259bfa-ef4c-43f4-b3a8-ef7abbe26c53",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:31Z",
    "sequence": 1793172631929
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f576989d-c65a-4370-89df-91e3128695f3",
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
  "last_heartbeat_at": "2026-10-28T07:30:31.946559Z",
  "last_location_at": "2026-10-28T07:30:31.946559Z",
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
  "session_id": "8fa83bfc-f17a-4a37-9094-dba731cb9e4b",
  "subject": {
    "type": "STAFF",
    "id": "dbd9ee06-2b81-4924-86dd-d555af0288d4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmQ5ZWUwNi0yYjgxLTQ5MjQtODZkZC1kNTU1YWYwMjg4ZDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM1MzIsImlhdCI6MTc5MzE3MjYzMiwianRpIjoiNjVlNjFiMDgtNmI3Zi00MTFlLWFmNjgtYWQwNWI2MTcxODEwIiwic2lkIjoiOGZhODNiZmMtZjE3YS00YTM3LTkwOTQtZGJhNzMxY2I5ZTRiIn0.sVf7w3pfeWDCqYZBFIzkqTeib0W54ZMJFUbZytQU2WY",
  "access_expires_at": "2026-10-28T07:45:32.271290006Z",
  "refresh_token": "DpQ76oAJVzAQjaZHfJHSaPVUKYLP-lI7lXHw2-YZim4",
  "refresh_expires_at": "2026-10-28T19:30:32.270696663Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7b8d1181-0a0f-4471-acac-28cbc4104bf3",
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
  "id": "2291f976-81cd-4dd9-bc25-6e76fb288d1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:35:32.302374Z",
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
  "command_id": "9aa24dc4-91dc-4aa6-b9bd-3c2896d18296",
  "quote_id": "2291f976-81cd-4dd9-bc25-6e76fb288d1f",
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
  "id": "b18b6c54-ad61-4079-bd63-6efe5d44ecb5",
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
  "created_at": "2026-10-28T07:30:32.338318Z",
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
    "id": "5e1f770c-4970-4e8a-a4bc-8f78a8f6e394",
    "order_id": "b18b6c54-ad61-4079-bd63-6efe5d44ecb5",
    "expires_at": "2026-10-28T07:30:47.341821Z",
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

`POST /api/driver/v1/offers/5e1f770c-4970-4e8a-a4bc-8f78a8f6e394/accept` → **200**

```json
{
  "command_id": "4bc6f62d-444c-498c-94f8-ba7b9c714591"
}
```

```json
{
  "id": "67e7603f-d620-42c9-b19b-aa69e4488e49",
  "order_id": "b18b6c54-ad61-4079-bd63-6efe5d44ecb5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c7f86183-bf6c-403c-abb2-3bb089e60167",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c7f86183-bf6c-403c-abb2-3bb089e60167",
  "order_id": "b18b6c54-ad61-4079-bd63-6efe5d44ecb5",
  "assignment_id": "67e7603f-d620-42c9-b19b-aa69e4488e49",
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

`POST /api/driver/v1/work-sessions/f576989d-c65a-4370-89df-91e3128695f3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:30:32Z",
    "sequence": 1793172632471
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f576989d-c65a-4370-89df-91e3128695f3",
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
  "last_heartbeat_at": "2026-10-28T07:30:32.489431Z",
  "last_location_at": "2026-10-28T07:30:32.489431Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c7f86183-bf6c-403c-abb2-3bb089e60167/arrive` → **200**

```json
{
  "command_id": "dd3da5af-1bb4-405f-8b17-5b272edf3b6d",
  "expected_version": 0
}
```

```json
{
  "id": "c7f86183-bf6c-403c-abb2-3bb089e60167",
  "order_id": "b18b6c54-ad61-4079-bd63-6efe5d44ecb5",
  "assignment_id": "67e7603f-d620-42c9-b19b-aa69e4488e49",
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
  "arrived_at": "2026-10-28T07:30:32.523443Z",
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

`POST /api/driver/v1/trips/c7f86183-bf6c-403c-abb2-3bb089e60167/start` → **200**

```json
{
  "command_id": "7774e20b-b68a-4dd2-b253-4139283550c1",
  "expected_version": 1
}
```

```json
{
  "id": "c7f86183-bf6c-403c-abb2-3bb089e60167",
  "order_id": "b18b6c54-ad61-4079-bd63-6efe5d44ecb5",
  "assignment_id": "67e7603f-d620-42c9-b19b-aa69e4488e49",
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
  "arrived_at": "2026-10-28T07:30:32.523443Z",
  "started_at": "2026-10-28T07:30:32.560926Z",
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

`POST /api/driver/v1/trips/c7f86183-bf6c-403c-abb2-3bb089e60167/complete` → **200**

```json
{
  "command_id": "8abc35e5-42ea-4c38-a4b4-eaeff87c16a3",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:30:32Z",
  "cash_received": true
}
```

```json
{
  "id": "c7f86183-bf6c-403c-abb2-3bb089e60167",
  "order_id": "b18b6c54-ad61-4079-bd63-6efe5d44ecb5",
  "assignment_id": "67e7603f-d620-42c9-b19b-aa69e4488e49",
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
  "arrived_at": "2026-10-28T07:30:32.523443Z",
  "started_at": "2026-10-28T07:30:32.560926Z",
  "completed_at": "2026-10-28T07:30:32.601665Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/b18b6c54-ad61-4079-bd63-6efe5d44ecb5` → **200**

```json
{
  "id": "b18b6c54-ad61-4079-bd63-6efe5d44ecb5",
  "short_number": 17,
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
    "id": "67e7603f-d620-42c9-b19b-aa69e4488e49",
    "order_id": "b18b6c54-ad61-4079-bd63-6efe5d44ecb5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c7f86183-bf6c-403c-abb2-3bb089e60167",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:30:32.338318Z",
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
  "session_id": "81b50ee1-fc50-4a7b-acad-b35e9651651a",
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
  "last_heartbeat_at": "2026-10-28T07:30:31.881436Z",
  "last_location_at": "2026-10-28T07:30:31.881436Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/81b50ee1-fc50-4a7b-acad-b35e9651651a/close` → **200**

```json
{
  "command_id": "2f82cf62-f83e-4064-a43c-ae6ded5e5d7b",
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
  "session_id": "f576989d-c65a-4370-89df-91e3128695f3",
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
  "last_heartbeat_at": "2026-10-28T07:30:32.489431Z",
  "last_location_at": "2026-10-28T07:30:32.489431Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f576989d-c65a-4370-89df-91e3128695f3/close` → **200**

```json
{
  "command_id": "62fa194c-b4e8-49fe-b2e8-32418c3cffdd",
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

Done: terminal order b18b6c54-ad61-4079-bd63-6efe5d44ecb5 by Andrii (5a000000-0000-4000-8000-000000000403).
