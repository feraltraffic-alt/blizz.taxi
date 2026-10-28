# Sandbox transcript (2026-10-28T11:49:41Z, a661f45)

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
  "correlation_id": "9e084764-bd37-400d-89ca-da6780bf4ff9"
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
  "session_id": "f0baf923-3ad5-49b9-84d0-c05802512543",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkwODgsImlhdCI6MTc5MzE4ODE4OCwianRpIjoiNjBjYTI2ZmItMTdiMC00OGVkLTg0NGItMjRjMjE3NGExNzY0Iiwic2lkIjoiZjBiYWY5MjMtM2FkNS00OWI5LTg0ZDAtYzA1ODAyNTEyNTQzIn0.fNy5nL-hZX6ZQzAEC7BZrGtJ4QdqHOT9kv2dEq8n6Dw",
  "access_expires_at": "2026-10-28T12:04:48.15444057Z",
  "refresh_token": "FfT8Ndpq_0E1qKDKlutjwTy6c283LK4isuS_v3fMvYM",
  "refresh_expires_at": "2026-10-28T23:49:48.152323988Z",
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
  "session_id": "aafb46ea-e913-4f3f-93a6-3146443ce228",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkwODksImlhdCI6MTc5MzE4ODE4OSwianRpIjoiM2Q3MjRmZGQtYTNjMS00ZTRmLWIxNjUtN2RjN2MxNWRiZDY1Iiwic2lkIjoiYWFmYjQ2ZWEtZTkxMy00ZjNmLTkzYTYtMzE0NjQ0M2NlMjI4In0.hof_FrVHcwThnjC5il4pCtyDepUWwxQs6f9ujPwHOqw",
  "access_expires_at": "2026-10-28T12:04:49.709564836Z",
  "refresh_token": "j2l4WVd5H0z-CNUExy4rCwj4j9sN0CGy-A5tJGE4ykU",
  "refresh_expires_at": "2026-10-28T23:49:49.708401373Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "8d4e4afb-6e75-4ef0-bf6d-f5f92f704fb1",
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
  "id": "69274f40-d885-4a3b-a66a-fc596ef37ab0",
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
  "created_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "created_at": "2026-10-28T11:49:50.024057Z",
  "updated_at": "2026-10-28T11:49:50.024057Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632750463",
  "device_ref": "sandbox-29628"
}
```

```json
{
  "challenge_id": "0438e3c2-56ca-402e-8523-27c04b7dbe88",
  "expires_at": "2026-10-28T11:54:50.327922228Z",
  "resend_available_at": "2026-10-28T11:49:51.327922228Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632750463` → **200**

```json
{
  "phone": "+380632750463",
  "audience": "CLIENT",
  "code": "930919",
  "sent_at": "2026-10-28T11:49:50.336460299Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0438e3c2-56ca-402e-8523-27c04b7dbe88",
  "code": "930919",
  "device_ref": "sandbox-29628"
}
```

```json
{
  "session_id": "385ff9f1-f60d-439c-907c-4e7431af13b7",
  "subject": {
    "type": "CLIENT",
    "id": "1c94ec94-dfc9-47c5-b823-c2d58bf7ef90"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzk0ZWM5NC1kZmM5LTQ3YzUtYjgyMy1jMmQ1OGJmN2VmOTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MDkwLCJpYXQiOjE3OTMxODgxOTAsImp0aSI6ImY0MTZhM2ZiLWNiZjUtNGI2MC05NDM5LWM5NDJiMzIyNGNjYyIsInNpZCI6IjM4NWZmOWYxLWY2MGQtNDM5Yy05MDdjLTRlNzQzMWFmMTNiNyJ9.Blytj8lVt1Pw2vzEVxpbjHZMR6WaUEasCmyJPfmtJ6Q",
  "access_expires_at": "2026-10-28T12:04:50.663131551Z",
  "refresh_token": "C8V9MRnX_xxDQ4ItIcY1f7tgMT0gSFXpjKdsbd4tVCI",
  "refresh_expires_at": "2026-11-27T11:49:50.662105025Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632750463` → **200**

```json
{
  "client_id": "1c94ec94-dfc9-47c5-b823-c2d58bf7ef90"
}
```

`POST /api/admin/v1/rider-wallets/1c94ec94-dfc9-47c5-b823-c2d58bf7ef90/top-ups` → **201**

```json
{
  "command_id": "39bc9b72-6973-4489-8fe5-86f644d9e69c",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "1c94ec94-dfc9-47c5-b823-c2d58bf7ef90",
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
      "id": "cad6a5d8-c08b-4215-9794-21fc4bb37820",
      "at": "2026-10-28T11:49:51.258386Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d83a8f12-6c31-43e1-bdd2-a37f5ac9568e",
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
  "id": "dcd3c7c6-23b1-432d-88a3-fb7631ff3595",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:54:51.698079Z",
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
      "id": "69274f40-d885-4a3b-a66a-fc596ef37ab0",
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
  "device_ref": "sandbox-14119"
}
```

```json
{
  "challenge_id": "d3ee166b-2712-46f2-8bc3-a314eddeb46a",
  "expires_at": "2026-10-28T11:54:52.045857951Z",
  "resend_available_at": "2026-10-28T11:49:53.045857951Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "696822",
  "sent_at": "2026-10-28T11:49:52.052769493Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3ee166b-2712-46f2-8bc3-a314eddeb46a",
  "code": "696822",
  "device_ref": "sandbox-14119"
}
```

```json
{
  "session_id": "03628278-aa8f-4718-a86a-12bd6c1234ee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTA5MiwiaWF0IjoxNzkzMTg4MTkyLCJqdGkiOiJhZWVhM2E3Ni0zMWQyLTQ1N2ItODc5YS1mYjdhNjI2OGQxOGMiLCJzaWQiOiIwMzYyODI3OC1hYThmLTQ3MTgtYTg2YS0xMmJkNmMxMjM0ZWUifQ.XDjDs0eS3-K5UBYPzzCECWttNoycjXcOKT6tVrhL698",
  "access_expires_at": "2026-10-28T12:04:52.357957437Z",
  "refresh_token": "Q7c86Fst7rQBivpD5kvEqZZwdNUtlqOW9ivKtZPfH5s",
  "refresh_expires_at": "2026-11-27T11:49:52.356988899Z",
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
  "command_id": "a08c1d20-8bf7-4bac-bbac-e1a7279371f4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:49:52Z",
    "sequence": 1793188192915
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3bc1b83c-764a-4b8f-8fc5-f21ba5b88aaf",
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
  "last_heartbeat_at": "2026-10-28T11:49:52.959572Z",
  "last_location_at": "2026-10-28T11:49:52.959572Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "aa611458-1b40-48d5-8cc5-b4b75990892f",
  "quote_id": "dcd3c7c6-23b1-432d-88a3-fb7631ff3595",
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
  "id": "1a26d138-6149-436d-9e0c-7f6bcb09849c",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1c94ec94-dfc9-47c5-b823-c2d58bf7ef90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T11:49:53.322498Z",
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
  "client_id": "1c94ec94-dfc9-47c5-b823-c2d58bf7ef90",
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
      "id": "cad6a5d8-c08b-4215-9794-21fc4bb37820",
      "at": "2026-10-28T11:49:51.258386Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
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
    "id": "4ad466b2-a358-4a61-b786-7f9eeadacdb6",
    "order_id": "1a26d138-6149-436d-9e0c-7f6bcb09849c",
    "expires_at": "2026-10-28T11:50:08.351526Z",
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

`POST /api/driver/v1/offers/4ad466b2-a358-4a61-b786-7f9eeadacdb6/accept` → **200**

```json
{
  "command_id": "eb3fa5e8-1aa4-4b82-b4ec-563a4558c1dd"
}
```

```json
{
  "id": "563fceda-f59e-4b83-9dc6-906f4873608e",
  "order_id": "1a26d138-6149-436d-9e0c-7f6bcb09849c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8c7542d2-f62f-430c-a43f-c9546f1852a0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8c7542d2-f62f-430c-a43f-c9546f1852a0",
  "order_id": "1a26d138-6149-436d-9e0c-7f6bcb09849c",
  "assignment_id": "563fceda-f59e-4b83-9dc6-906f4873608e",
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

`POST /api/driver/v1/work-sessions/3bc1b83c-764a-4b8f-8fc5-f21ba5b88aaf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:49:54Z",
    "sequence": 1793188194789
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3bc1b83c-764a-4b8f-8fc5-f21ba5b88aaf",
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
  "last_heartbeat_at": "2026-10-28T11:49:54.816523Z",
  "last_location_at": "2026-10-28T11:49:54.816523Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8c7542d2-f62f-430c-a43f-c9546f1852a0/arrive` → **200**

```json
{
  "command_id": "593c55ae-f5fc-4d68-9652-d03f1db54040",
  "expected_version": 0
}
```

```json
{
  "id": "8c7542d2-f62f-430c-a43f-c9546f1852a0",
  "order_id": "1a26d138-6149-436d-9e0c-7f6bcb09849c",
  "assignment_id": "563fceda-f59e-4b83-9dc6-906f4873608e",
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
  "arrived_at": "2026-10-28T11:49:55.145256Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8c7542d2-f62f-430c-a43f-c9546f1852a0/start` → **200**

```json
{
  "command_id": "1f3c76ba-7890-4be4-afe3-9fd1e7734a56",
  "expected_version": 1
}
```

```json
{
  "id": "8c7542d2-f62f-430c-a43f-c9546f1852a0",
  "order_id": "1a26d138-6149-436d-9e0c-7f6bcb09849c",
  "assignment_id": "563fceda-f59e-4b83-9dc6-906f4873608e",
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
  "arrived_at": "2026-10-28T11:49:55.145256Z",
  "started_at": "2026-10-28T11:49:55.440469Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/8c7542d2-f62f-430c-a43f-c9546f1852a0/complete` → **200**

```json
{
  "command_id": "66dd2da8-b2d0-44a9-8072-6f8aa3599bec",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:49:55Z",
  "cash_received": true
}
```

```json
{
  "id": "8c7542d2-f62f-430c-a43f-c9546f1852a0",
  "order_id": "1a26d138-6149-436d-9e0c-7f6bcb09849c",
  "assignment_id": "563fceda-f59e-4b83-9dc6-906f4873608e",
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
  "arrived_at": "2026-10-28T11:49:55.145256Z",
  "started_at": "2026-10-28T11:49:55.440469Z",
  "completed_at": "2026-10-28T11:49:55.75278Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1c94ec94-dfc9-47c5-b823-c2d58bf7ef90",
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
      "id": "342d2fed-02c3-4948-8187-1827203f4d19",
      "at": "2026-10-28T11:49:56.062439Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "1a26d138-6149-436d-9e0c-7f6bcb09849c"
    },
    {
      "id": "cad6a5d8-c08b-4215-9794-21fc4bb37820",
      "at": "2026-10-28T11:49:51.258386Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/69274f40-d885-4a3b-a66a-fc596ef37ab0/archive` → **200**

```json
{
  "command_id": "d5e1740a-1977-4327-bff6-d161333619e2",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "69274f40-d885-4a3b-a66a-fc596ef37ab0",
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
  "created_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "created_at": "2026-10-28T11:49:50.024057Z",
  "updated_at": "2026-10-28T11:49:59.350742Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3bc1b83c-764a-4b8f-8fc5-f21ba5b88aaf",
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
  "last_heartbeat_at": "2026-10-28T11:49:54.816523Z",
  "last_location_at": "2026-10-28T11:49:54.816523Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3bc1b83c-764a-4b8f-8fc5-f21ba5b88aaf/close` → **200**

```json
{
  "command_id": "1de51651-8f04-4691-8610-3b1768373c74",
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

Done: order 1a26d138-6149-436d-9e0c-7f6bcb09849c.

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
  "session_id": "e0a2d3f0-44ea-4b70-938d-89bb3e2f513a",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxMDAsImlhdCI6MTc5MzE4ODIwMCwianRpIjoiOWZiYzhiNjktOTE2OC00NTY1LThiNDktYmI5NjM3NmRjNjk1Iiwic2lkIjoiZTBhMmQzZjAtNDRlYS00YjcwLTkzOGQtODliYjNlMmY1MTNhIn0.2Whv60MmXvDCX-eDVMsDFCcjFO_wCI1ODNfELFMQQa4",
  "access_expires_at": "2026-10-28T12:05:00.524811453Z",
  "refresh_token": "aqUz2_ppdhb_0u1h9tUMIp29DK2KRqd3jpauzBw7GZ8",
  "refresh_expires_at": "2026-10-28T23:50:00.523695727Z",
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
  "command_id": "5f28cf0c-bb52-44e4-9209-9c33b661fcea",
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
  "session_id": "a3c482f1-c12f-40ff-bdcf-e2db6c712815",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxMDEsImlhdCI6MTc5MzE4ODIwMSwianRpIjoiNGY2MmQwZGEtOTBhYy00MzUyLWExMzgtNzkzYWZlOTgxODM4Iiwic2lkIjoiYTNjNDgyZjEtYzEyZi00MGZmLWJkY2YtZTJkYjZjNzEyODE1In0.qZ8bYNk6F8gcYkwQJXOB4moukiE848rL2DL9sCPufVA",
  "access_expires_at": "2026-10-28T12:05:01.677959198Z",
  "refresh_token": "iCR1cfvHt2ViBuOxQ59bZ8VkW7demRyfk6-daUxzXMY",
  "refresh_expires_at": "2026-10-28T23:50:01.676716188Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1073923021",
    "linkedid": "1730052700.1073923021",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674816211"
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
    "id": "1730052700.1073923021",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "545fe02c-2275-48c3-9861-50aae38cfd3e",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674816211",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T11:50:01.948637Z",
      "answered_at": null,
      "ended_at": "2026-10-28T11:50:01.976385Z",
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
    "id": "1730052600.363217687",
    "linkedid": "1730052600.363217687",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674816211"
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
      "id": "fb492374-3a3b-442d-b0a7-6c43756183e8",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674816211",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T11:50:02.299203Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/fb492374-3a3b-442d-b0a7-6c43756183e8/answer` → **200**

```json
{
  "command_id": "10ae4bb2-5e1c-4fe2-af5b-c7b818aba53c"
}
```

```json
{
  "id": "fb492374-3a3b-442d-b0a7-6c43756183e8",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674816211",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "order_ids": [],
  "started_at": "2026-10-28T11:50:02.299203Z",
  "answered_at": "2026-10-28T11:50:02.613272Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.363217687",
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
    "id": "1730052600.363217687",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "fb492374-3a3b-442d-b0a7-6c43756183e8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674816211",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_ids": [],
      "started_at": "2026-10-28T11:50:02.299203Z",
      "answered_at": "2026-10-28T11:50:02.613272Z",
      "ended_at": "2026-10-28T11:50:02.924992Z",
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
      "id": "fb492374-3a3b-442d-b0a7-6c43756183e8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674816211",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_ids": [],
      "started_at": "2026-10-28T11:50:02.299203Z",
      "answered_at": "2026-10-28T11:50:02.613272Z",
      "ended_at": "2026-10-28T11:50:02.924992Z",
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
      "id": "fb492374-3a3b-442d-b0a7-6c43756183e8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674816211",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_ids": [],
      "started_at": "2026-10-28T11:50:02.299203Z",
      "answered_at": "2026-10-28T11:50:02.613272Z",
      "ended_at": "2026-10-28T11:50:02.924992Z",
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
      "id": "fb492374-3a3b-442d-b0a7-6c43756183e8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674816211",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_ids": [],
      "started_at": "2026-10-28T11:50:02.299203Z",
      "answered_at": "2026-10-28T11:50:02.613272Z",
      "ended_at": "2026-10-28T11:50:02.924992Z",
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
      "id": "fb492374-3a3b-442d-b0a7-6c43756183e8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674816211",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_ids": [],
      "started_at": "2026-10-28T11:50:02.299203Z",
      "answered_at": "2026-10-28T11:50:02.613272Z",
      "ended_at": "2026-10-28T11:50:02.924992Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T11:50:10.889504Z"
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
      "id": "fb492374-3a3b-442d-b0a7-6c43756183e8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674816211",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_ids": [],
      "started_at": "2026-10-28T11:50:02.299203Z",
      "answered_at": "2026-10-28T11:50:02.613272Z",
      "ended_at": "2026-10-28T11:50:02.924992Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T11:50:10.889504Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/fb492374-3a3b-442d-b0a7-6c43756183e8/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/fb492374-3a3b-442d-b0a7-6c43756183e8/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=fb492374-3a3b-442d-b0a7-6c43756183e8` → **200**

```json
{
  "changes": [
    {
      "id": "68255270-ff48-412d-a0ec-762f047b9bfc",
      "occurred_at": "2026-10-28T11:50:12.698038Z",
      "actor_type": "STAFF",
      "actor_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "fb492374-3a3b-442d-b0a7-6c43756183e8",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b0c49100-a51f-431a-862c-aaeb509a23db\", \"order_ids\": []}",
      "correlation_id": "d3536394-917a-4210-afc3-5dff78a755a9"
    },
    {
      "id": "a2a1ca4b-46ca-4e92-8333-ae38d1080b2c",
      "occurred_at": "2026-10-28T11:50:12.664179Z",
      "actor_type": "STAFF",
      "actor_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "fb492374-3a3b-442d-b0a7-6c43756183e8",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b0c49100-a51f-431a-862c-aaeb509a23db\", \"order_ids\": []}",
      "correlation_id": "81e28f6a-116a-4782-a8b3-3cd5c6932cfd"
    }
  ]
}
```

Done: call fb492374-3a3b-442d-b0a7-6c43756183e8 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636639643",
  "device_ref": "sandbox-17299"
}
```

```json
{
  "challenge_id": "971da698-8a15-4835-9137-e057437fe0e4",
  "expires_at": "2026-10-28T11:55:13.027421137Z",
  "resend_available_at": "2026-10-28T11:50:14.027421137Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636639643` → **200**

```json
{
  "phone": "+380636639643",
  "audience": "CLIENT",
  "code": "920021",
  "sent_at": "2026-10-28T11:50:13.031239163Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "971da698-8a15-4835-9137-e057437fe0e4",
  "code": "920021",
  "device_ref": "sandbox-17299"
}
```

```json
{
  "session_id": "df5684f0-1d9a-4c67-962c-3ec1f66d7775",
  "subject": {
    "type": "CLIENT",
    "id": "9e192ea4-e417-4fdd-a7d1-4a8ae80604c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTE5MmVhNC1lNDE3LTRmZGQtYTdkMS00YThhZTgwNjA0YzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MTEzLCJpYXQiOjE3OTMxODgyMTMsImp0aSI6IjQ0OGYwYzc4LWRmYzItNDIzOS04NDk0LWQ1Mjg0OGViYjRiNCIsInNpZCI6ImRmNTY4NGYwLTFkOWEtNGM2Ny05NjJjLTNlYzFmNjZkNzc3NSJ9.AxahZ9xPMK9K3CuTVWVPJj1Xj2_9B0hKgMQq1t9ee48",
  "access_expires_at": "2026-10-28T12:05:13.331953119Z",
  "refresh_token": "Xf-Fxq2ugcU_GbkBrGb-oW5BuQjxdqlEwH89_COatUo",
  "refresh_expires_at": "2026-11-27T11:50:13.331139028Z",
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
        "ru": "Передумал ехать",
        "pl": "Zmiana planów",
        "uk": "Передумав їхати",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
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
  "device_ref": "sandbox-27843"
}
```

```json
{
  "challenge_id": "a16e4d57-61e5-40ff-8978-67d9700ca03c",
  "expires_at": "2026-10-28T11:55:13.880239336Z",
  "resend_available_at": "2026-10-28T11:50:14.880239336Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "495254",
  "sent_at": "2026-10-28T11:50:13.88376052Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a16e4d57-61e5-40ff-8978-67d9700ca03c",
  "code": "495254",
  "device_ref": "sandbox-27843"
}
```

```json
{
  "session_id": "c3c9fc97-09d6-4363-8f63-5af4ca54ab5f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTExNCwiaWF0IjoxNzkzMTg4MjE0LCJqdGkiOiJiZmRkMGRkZS02Nzk1LTQwZjAtYmE4My1hYmM1NTBlZjQyY2IiLCJzaWQiOiJjM2M5ZmM5Ny0wOWQ2LTQzNjMtOGY2My01YWY0Y2E1NGFiNWYifQ.Sp0eABs3rIg21LLYmO-vF2iQUlTFXAUJj1U25tppzpI",
  "access_expires_at": "2026-10-28T12:05:14.18711451Z",
  "refresh_token": "zBCG6DxvRqWNi2WwGxz7I7H9ovgEq-mUaODwYc7LTFg",
  "refresh_expires_at": "2026-11-27T11:50:14.185840853Z",
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
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
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
  "session_id": "a29762bd-3800-4784-b7dd-ee569cd2fab1",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxMTUsImlhdCI6MTc5MzE4ODIxNSwianRpIjoiNjNlZTkyNjctNGQyZi00NjUxLWFlNDUtNzE3N2IyY2YxMjUwIiwic2lkIjoiYTI5NzYyYmQtMzgwMC00Nzg0LWI3ZGQtZWU1NjljZDJmYWIxIn0.WjBB84QyUbajWfZKRXtgF6jw6fpscFHURBCV6NCP9Sc",
  "access_expires_at": "2026-10-28T12:05:15.041530985Z",
  "refresh_token": "YrVwEvzuxjqPJSbkcENp8na2MCh9EibAlAEY2VW3peU",
  "refresh_expires_at": "2026-10-28T23:50:15.0408035Z",
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
  "session_id": "310856bb-322b-4a71-a4f7-1a3a3ba2350a",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxMTUsImlhdCI6MTc5MzE4ODIxNSwianRpIjoiYTAwNjE5MTAtOTgyZC00NmZlLTgxZGUtOTI2NzU2ZjU5M2RhIiwic2lkIjoiMzEwODU2YmItMzIyYi00YTcxLWE0ZjctMWEzYTNiYTIzNTBhIn0.Q8aiYCdR-wQC7phQQVjYLU8MeV1LhCDhvu0kUb8gM4Y",
  "access_expires_at": "2026-10-28T12:05:15.61262239Z",
  "refresh_token": "Jel3r7bpSfu2iQflLl4tDoDxvP8DElkCNjvtoRiSer8",
  "refresh_expires_at": "2026-10-28T23:50:15.611864793Z",
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
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "ru": "ДТП",
        "pl": "Wypadek",
        "uk": "ДТП",
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
  "command_id": "60052c42-f616-49e4-a89e-d7b6448a089c",
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
  "id": "18d13d2d-418a-451e-b739-f0c64cc40635",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:55:16.173778Z",
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
  "command_id": "7a456531-9c3a-4e76-8d65-ca04c7dd2684",
  "quote_id": "18d13d2d-418a-451e-b739-f0c64cc40635",
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
  "id": "96b034a1-7345-4243-83a5-72814c72673a",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e192ea4-e417-4fdd-a7d1-4a8ae80604c6",
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
  "created_at": "2026-10-28T11:50:16.468388Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/96b034a1-7345-4243-83a5-72814c72673a` → **200**

```json
{
  "id": "96b034a1-7345-4243-83a5-72814c72673a",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e192ea4-e417-4fdd-a7d1-4a8ae80604c6",
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
  "created_at": "2026-10-28T11:50:16.468388Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/96b034a1-7345-4243-83a5-72814c72673a/cancel` → **200**

```json
{
  "command_id": "f12d169e-aaaa-49cb-b339-1e9a8dbf3d7e",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "96b034a1-7345-4243-83a5-72814c72673a",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9e192ea4-e417-4fdd-a7d1-4a8ae80604c6",
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
  "created_at": "2026-10-28T11:50:16.468388Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
      "en": "The wait is too long"
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
  "command_id": "9ed1b9ea-141f-4fb5-9383-c83e2c80760e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:50:17Z",
    "sequence": 1793188217636
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9463f33c-c869-4695-91f1-e34b07a4c999",
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
  "last_heartbeat_at": "2026-10-28T11:50:17.658598Z",
  "last_location_at": "2026-10-28T11:50:17.658598Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17279"
}
```

```json
{
  "challenge_id": "956cfc54-6923-481a-a06b-cd5736014be7",
  "expires_at": "2026-10-28T11:55:17.934934296Z",
  "resend_available_at": "2026-10-28T11:50:18.934934296Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "279384",
  "sent_at": "2026-10-28T11:50:17.938245507Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "956cfc54-6923-481a-a06b-cd5736014be7",
  "code": "279384",
  "device_ref": "sandbox-17279"
}
```

```json
{
  "session_id": "78bb440e-e670-43ee-8654-10b774f8c3ef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTExOCwiaWF0IjoxNzkzMTg4MjE4LCJqdGkiOiJiYzk0YzU2YS0zZjk2LTQ5OTAtYjQxYS1iMzkzNGVjOWY0ZjQiLCJzaWQiOiI3OGJiNDQwZS1lNjcwLTQzZWUtODY1NC0xMGI3NzRmOGMzZWYifQ.MlQpxSx-_NUW4QdyiUoNHS3PAbpwKc5Tx9_j2Wfg_2Q",
  "access_expires_at": "2026-10-28T12:05:18.238037711Z",
  "refresh_token": "b7iUCHETW0TN5YJx7_4L0A8tbCvDJ5EaVdx0gxJwE4k",
  "refresh_expires_at": "2026-11-27T11:50:18.237350969Z",
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
  "command_id": "344c1ee3-ff72-4bb8-8680-0bd0d2c1dfc6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:50:18Z",
    "sequence": 1793188218786
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7c9e5b08-398f-48b8-b3dc-bc45b7148950",
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
  "last_heartbeat_at": "2026-10-28T11:50:18.807842Z",
  "last_location_at": "2026-10-28T11:50:18.807842Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "77cba5b6-b0b8-41f9-8f5d-78cb0819967a",
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
  "id": "2779207d-f654-49e6-b27b-7924fa9dffce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:55:19.101902Z",
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
  "command_id": "81fc6934-01d0-40e2-9a32-e580b436d944",
  "quote_id": "2779207d-f654-49e6-b27b-7924fa9dffce",
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
  "id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e192ea4-e417-4fdd-a7d1-4a8ae80604c6",
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
  "created_at": "2026-10-28T11:50:19.423004Z",
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
    "id": "9f2574f6-e698-4d21-9dbb-a3e61c6b38a2",
    "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
    "expires_at": "2026-10-28T11:50:34.42748Z",
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

`POST /api/driver/v1/offers/9f2574f6-e698-4d21-9dbb-a3e61c6b38a2/accept` → **200**

```json
{
  "command_id": "67d1c98c-5344-4327-b706-b42a10620be4"
}
```

```json
{
  "id": "790aba0b-8190-4ffc-a256-55352aca6efb",
  "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a5653355-0952-47f9-bab7-36b23c0221d4",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a5653355-0952-47f9-bab7-36b23c0221d4",
  "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
  "assignment_id": "790aba0b-8190-4ffc-a256-55352aca6efb",
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

`POST /api/driver/v1/trips/a5653355-0952-47f9-bab7-36b23c0221d4/cancel` → **200**

```json
{
  "command_id": "4f33f427-ff0b-4da8-9c86-0a76eb41ab68",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "a5653355-0952-47f9-bab7-36b23c0221d4",
  "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
  "assignment_id": "790aba0b-8190-4ffc-a256-55352aca6efb",
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

`GET /api/rider/v1/orders/257b1f78-2cba-43c8-a2a6-5b0d446ac132` → **200**

```json
{
  "id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9e192ea4-e417-4fdd-a7d1-4a8ae80604c6",
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
    "id": "790aba0b-8190-4ffc-a256-55352aca6efb",
    "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a5653355-0952-47f9-bab7-36b23c0221d4",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T11:50:19.423004Z",
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
    "id": "4312a768-701b-4251-b1dd-320291f27527",
    "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
    "expires_at": "2026-10-28T11:50:35.592977Z",
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

`POST /api/driver/v1/offers/4312a768-701b-4251-b1dd-320291f27527/accept` → **200**

```json
{
  "command_id": "49d14e0d-37c1-40a7-bb73-4faecc923998"
}
```

```json
{
  "id": "e029839f-95ef-4eea-b1ce-7c5b32873be7",
  "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "210479f6-30c8-429e-960a-2575a0259845",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "210479f6-30c8-429e-960a-2575a0259845",
  "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
  "assignment_id": "e029839f-95ef-4eea-b1ce-7c5b32873be7",
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

`POST /api/driver/v1/trips/210479f6-30c8-429e-960a-2575a0259845/cancel` → **200**

```json
{
  "command_id": "72ca830c-95db-4178-961a-8ece3d4a42d9",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "210479f6-30c8-429e-960a-2575a0259845",
  "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
  "assignment_id": "e029839f-95ef-4eea-b1ce-7c5b32873be7",
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
    "id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T11:50:19.423004Z",
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
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "96b034a1-7345-4243-83a5-72814c72673a",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T11:50:16.468388Z",
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
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/257b1f78-2cba-43c8-a2a6-5b0d446ac132/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T11:50:19.423775Z",
      "actor": {
        "type": "CLIENT",
        "id": "9e192ea4-e417-4fdd-a7d1-4a8ae80604c6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
        "quote_id": "2779207d-f654-49e6-b27b-7924fa9dffce",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "679de312-798e-4e1d-ac3d-06158f224e72"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T11:50:19.426227Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
        "attempt_id": "50d61f66-e746-469d-aede-36eedb3e6b51",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "679de312-798e-4e1d-ac3d-06158f224e72"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T11:50:19.4346Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9f2574f6-e698-4d21-9dbb-a3e61c6b38a2",
        "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "679de312-798e-4e1d-ac3d-06158f224e72"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T11:50:20.013011Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9f2574f6-e698-4d21-9dbb-a3e61c6b38a2",
        "order_id": "257b1f78-2cba-43c8-a2a6-5b0d446ac132",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "790aba0b-8190-4ffc-a256-55352aca6efb"
      },
      "correlation_id": "78bde9af-8ed2-448a-9696-99cd884d2564"
```

Done: orders 96b034a1-7345-4243-83a5-72814c72673a, 257b1f78-2cba-43c8-a2a6-5b0d446ac132.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734829790",
  "device_ref": "sandbox-32116"
}
```

```json
{
  "challenge_id": "7c81226c-2b1f-4cb2-89ac-64c1673feaf5",
  "expires_at": "2026-10-28T11:55:22.908596962Z",
  "resend_available_at": "2026-10-28T11:50:23.908596962Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734829790` → **200**

```json
{
  "phone": "+380734829790",
  "audience": "CLIENT",
  "code": "862565",
  "sent_at": "2026-10-28T11:50:22.91194732Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c81226c-2b1f-4cb2-89ac-64c1673feaf5",
  "code": "862565",
  "device_ref": "sandbox-32116"
}
```

```json
{
  "session_id": "eb99e351-2aa4-4180-ab32-5f4678d2fa76",
  "subject": {
    "type": "CLIENT",
    "id": "376ca484-bae5-4ac9-a289-191af54e61dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzZjYTQ4NC1iYWU1LTRhYzktYTI4OS0xOTFhZjU0ZTYxZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MTIzLCJpYXQiOjE3OTMxODgyMjMsImp0aSI6Ijk2MTcyMTRjLTAzYWMtNGY4OS05MDUyLTkwZjY0MDMyMmRkZiIsInNpZCI6ImViOTllMzUxLTJhYTQtNDE4MC1hYjMyLTVmNDY3OGQyZmE3NiJ9.G0sbRkzJc1dWUx6b1pxser6UWO9qI1SfWYXUpdyKoPU",
  "access_expires_at": "2026-10-28T12:05:23.22182997Z",
  "refresh_token": "fqek68_TGVek51TEjjOPCKaDDeZyEP40wVQSEd4EO08",
  "refresh_expires_at": "2026-11-27T11:50:23.22088697Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "f0f23539-7731-49ce-a6fd-48fcc66efcc5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "91d7bd39-d339-4e30-8bce-4c7f9c789bec",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-91d7bd39-d339-4e30-8bce-4c7f9c789bec",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "9a8f80e6ff6de4a3a74650e9f631a616",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=91d7bd39-d339-4e30-8bce-4c7f9c789bec",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734829790"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=91d7bd39-d339-4e30-8bce-4c7f9c789bec",
  "expires_at": "2026-10-28T12:20:23.513035Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/91d7bd39-d339-4e30-8bce-4c7f9c789bec` → **200**

```json
{
  "id": "91d7bd39-d339-4e30-8bce-4c7f9c789bec",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T12:20:23.513035Z",
  "card": {
    "id": "6f089e22-3833-4812-a2fd-a31c1de9e3db",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0381",
    "card_type": "Visa",
    "created_at": "2026-10-28T11:50:23.812984Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "6f089e22-3833-4812-a2fd-a31c1de9e3db",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0381",
      "card_type": "Visa",
      "created_at": "2026-10-28T11:50:23.812984Z"
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
  "device_ref": "sandbox-26549"
}
```

```json
{
  "challenge_id": "382e6522-1b07-45d1-9bd2-c1b710026520",
  "expires_at": "2026-10-28T11:55:24.404632575Z",
  "resend_available_at": "2026-10-28T11:50:25.404632575Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "557204",
  "sent_at": "2026-10-28T11:50:24.408015202Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "382e6522-1b07-45d1-9bd2-c1b710026520",
  "code": "557204",
  "device_ref": "sandbox-26549"
}
```

```json
{
  "session_id": "7312506a-f53e-424b-9788-cf702700deee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTEyNCwiaWF0IjoxNzkzMTg4MjI0LCJqdGkiOiIwYWFkMTdmNy1mYTFmLTRkZTktYjNmYS03NzdlM2YxY2QxNGEiLCJzaWQiOiI3MzEyNTA2YS1mNTNlLTQyNGItOTc4OC1jZjcwMjcwMGRlZWUifQ.YTPUg3C24Mxk5leYRvOecP9UiYRpCk0lDro0TyFhjgY",
  "access_expires_at": "2026-10-28T12:05:24.705726681Z",
  "refresh_token": "7FkO1vfTJcSFF2dLMRtRjlLHoHdkS8opl070bPwFdZo",
  "refresh_expires_at": "2026-11-27T11:50:24.705050839Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7c9e5b08-398f-48b8-b3dc-bc45b7148950",
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
  "last_heartbeat_at": "2026-10-28T11:50:18.807842Z",
  "last_location_at": "2026-10-28T11:50:18.807842Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7c9e5b08-398f-48b8-b3dc-bc45b7148950/handover` → **200**

```json
{
  "command_id": "19ac97d1-c0e2-41de-b656-24fcbb46f47d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7c9e5b08-398f-48b8-b3dc-bc45b7148950",
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
  "last_heartbeat_at": "2026-10-28T11:50:18.807842Z",
  "last_location_at": "2026-10-28T11:50:18.807842Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7c9e5b08-398f-48b8-b3dc-bc45b7148950/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:50:25Z",
    "sequence": 1793188225548
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7c9e5b08-398f-48b8-b3dc-bc45b7148950",
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
  "last_heartbeat_at": "2026-10-28T11:50:25.571195Z",
  "last_location_at": "2026-10-28T11:50:25.571195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c38a7afa-aa4f-452a-aa51-816484d14ece",
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
  "id": "4f9b21ac-4150-402d-a582-745d851577d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:55:25.869809Z",
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
  "command_id": "19f4e920-a50e-418a-96e8-56b5ed7b5d82",
  "quote_id": "4f9b21ac-4150-402d-a582-745d851577d6",
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
  "id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "376ca484-bae5-4ac9-a289-191af54e61dc",
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
  "created_at": "2026-10-28T11:50:26.161493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ae7421ab-0552-404f-92ce-89fc4b994aa4` → **200**

```json
{
  "id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "376ca484-bae5-4ac9-a289-191af54e61dc",
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
  "created_at": "2026-10-28T11:50:26.161493Z",
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
    "id": "694d7407-3b1b-403d-b9c5-86ada4b87a8b",
    "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
    "expires_at": "2026-10-28T11:50:41.243039Z",
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

`POST /api/driver/v1/offers/694d7407-3b1b-403d-b9c5-86ada4b87a8b/accept` → **200**

```json
{
  "command_id": "fdb50416-e607-42d8-99ba-64646e3e2cfa"
}
```

```json
{
  "id": "cccb9485-d4b2-4c81-b93f-027dff46798f",
  "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "775f3982-c75c-44b1-bf48-1b259bae0bba",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "775f3982-c75c-44b1-bf48-1b259bae0bba",
  "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
  "assignment_id": "cccb9485-d4b2-4c81-b93f-027dff46798f",
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

`POST /api/driver/v1/work-sessions/7c9e5b08-398f-48b8-b3dc-bc45b7148950/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:50:27Z",
    "sequence": 1793188227580
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7c9e5b08-398f-48b8-b3dc-bc45b7148950",
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
  "last_heartbeat_at": "2026-10-28T11:50:27.601653Z",
  "last_location_at": "2026-10-28T11:50:27.601653Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/775f3982-c75c-44b1-bf48-1b259bae0bba/arrive` → **200**

```json
{
  "command_id": "b8e55c5b-b8ce-43fc-af96-f0f72d47221f",
  "expected_version": 0
}
```

```json
{
  "id": "775f3982-c75c-44b1-bf48-1b259bae0bba",
  "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
  "assignment_id": "cccb9485-d4b2-4c81-b93f-027dff46798f",
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
  "arrived_at": "2026-10-28T11:50:27.89221Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/775f3982-c75c-44b1-bf48-1b259bae0bba/start` → **200**

```json
{
  "command_id": "ee0032b1-7de3-4bbe-8bb2-d43f469b33eb",
  "expected_version": 1
}
```

```json
{
  "id": "775f3982-c75c-44b1-bf48-1b259bae0bba",
  "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
  "assignment_id": "cccb9485-d4b2-4c81-b93f-027dff46798f",
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
  "arrived_at": "2026-10-28T11:50:27.89221Z",
  "started_at": "2026-10-28T11:50:28.18302Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/775f3982-c75c-44b1-bf48-1b259bae0bba/complete` → **200**

```json
{
  "command_id": "fa25a4e1-8a9e-48a1-9427-45847a671ab2",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:50:28Z"
}
```

```json
{
  "id": "775f3982-c75c-44b1-bf48-1b259bae0bba",
  "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
  "assignment_id": "cccb9485-d4b2-4c81-b93f-027dff46798f",
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
  "arrived_at": "2026-10-28T11:50:27.89221Z",
  "started_at": "2026-10-28T11:50:28.18302Z",
  "completed_at": "2026-10-28T11:50:28.483635Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/ae7421ab-0552-404f-92ce-89fc4b994aa4` → **200**

```json
{
  "id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "376ca484-bae5-4ac9-a289-191af54e61dc",
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
    "id": "cccb9485-d4b2-4c81-b93f-027dff46798f",
    "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "775f3982-c75c-44b1-bf48-1b259bae0bba",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T11:50:26.161493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ae7421ab-0552-404f-92ce-89fc4b994aa4` → **200**

```json
{
  "id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "376ca484-bae5-4ac9-a289-191af54e61dc",
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
    "id": "cccb9485-d4b2-4c81-b93f-027dff46798f",
    "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "775f3982-c75c-44b1-bf48-1b259bae0bba",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T11:50:26.161493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ae7421ab-0552-404f-92ce-89fc4b994aa4` → **200**

```json
{
  "id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "376ca484-bae5-4ac9-a289-191af54e61dc",
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
    "id": "cccb9485-d4b2-4c81-b93f-027dff46798f",
    "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "775f3982-c75c-44b1-bf48-1b259bae0bba",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T11:50:26.161493Z",
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
      "id": "6f1977b8-a279-4560-b5cb-593fbb8175a5",
      "at": "2026-10-28T11:50:29.302424Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/ae7421ab-0552-404f-92ce-89fc4b994aa4/tip` → **200**

```json
{
  "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
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
  "available_until": "2026-10-29T11:50:28.483635Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ae7421ab-0552-404f-92ce-89fc4b994aa4/tip` → **201**

```json
{
  "command_id": "ad8989d0-8f9f-49a5-b134-6f62aa1f8189",
  "amount_minor": 2500
}
```

```json
{
  "id": "4c98d2f4-e3e2-49ce-9b5f-993b689d6b77",
  "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T11:50:32.478528Z"
}
```

`GET /api/rider/v1/orders/ae7421ab-0552-404f-92ce-89fc4b994aa4/tip` → **200**

```json
{
  "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
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
  "available_until": "2026-10-29T11:50:28.483635Z",
  "open": false,
  "tip": {
    "id": "4c98d2f4-e3e2-49ce-9b5f-993b689d6b77",
    "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T11:50:32.478528Z"
  }
}
```

`GET /api/rider/v1/orders/ae7421ab-0552-404f-92ce-89fc4b994aa4/tip` → **200**

```json
{
  "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
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
  "available_until": "2026-10-29T11:50:28.483635Z",
  "open": false,
  "tip": {
    "id": "4c98d2f4-e3e2-49ce-9b5f-993b689d6b77",
    "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T11:50:32.478528Z"
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
      "id": "6f1977b8-a279-4560-b5cb-593fbb8175a5",
      "at": "2026-10-28T11:50:29.302424Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
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
      "id": "78cb0fe8-1e67-47d9-af46-bbaaf973a078",
      "at": "2026-10-28T11:50:34.370724Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
      "counterpart_id": null
    },
    {
      "id": "6f1977b8-a279-4560-b5cb-593fbb8175a5",
      "at": "2026-10-28T11:50:29.302424Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ae7421ab-0552-404f-92ce-89fc4b994aa4",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7c9e5b08-398f-48b8-b3dc-bc45b7148950",
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
  "last_heartbeat_at": "2026-10-28T11:50:27.601653Z",
  "last_location_at": "2026-10-28T11:50:27.601653Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7c9e5b08-398f-48b8-b3dc-bc45b7148950/close` → **200**

```json
{
  "command_id": "60c28121-3d45-4755-8163-27bebc531fa5",
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

Done: card order ae7421ab-0552-404f-92ce-89fc4b994aa4.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737772896",
  "device_ref": "sandbox-27116"
}
```

```json
{
  "challenge_id": "87bb83be-f067-478d-9ead-0ce2db030367",
  "expires_at": "2026-10-28T11:55:36.482436749Z",
  "resend_available_at": "2026-10-28T11:50:37.482436749Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737772896` → **200**

```json
{
  "phone": "+380737772896",
  "audience": "CLIENT",
  "code": "198278",
  "sent_at": "2026-10-28T11:50:36.485565431Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87bb83be-f067-478d-9ead-0ce2db030367",
  "code": "198278",
  "device_ref": "sandbox-27116"
}
```

```json
{
  "session_id": "5c0d3a08-091f-4d21-9646-0c917ae2151c",
  "subject": {
    "type": "CLIENT",
    "id": "d52b4957-9db4-4f0c-80dc-a21d8dcc2433"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTJiNDk1Ny05ZGI0LTRmMGMtODBkYy1hMjFkOGRjYzI0MzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MTM2LCJpYXQiOjE3OTMxODgyMzYsImp0aSI6ImM5NTY2MTVhLTU0OTctNDI3MS1hYzA4LWUxNzRiM2QyMDY3YyIsInNpZCI6IjVjMGQzYTA4LTA5MWYtNGQyMS05NjQ2LTBjOTE3YWUyMTUxYyJ9.3uUivmGjBC1rlfNnLnh2eDWeQwgHvgy7HCA8YTMQeoU",
  "access_expires_at": "2026-10-28T12:05:36.788995454Z",
  "refresh_token": "JveFuvHgG6VHJbCbgjwyq9MJTq0JPEUxWOTCig8LmKs",
  "refresh_expires_at": "2026-11-27T11:50:36.788357212Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "3df855a6-ded2-4821-90ef-eb4cb591e50c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "c3038b6b-9a9e-40b4-b453-c67dd5353063",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c3038b6b-9a9e-40b4-b453-c67dd5353063",
    "orderDate": "1793188237",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "86d55cdc818078a6bddd998449deb0b8",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c3038b6b-9a9e-40b4-b453-c67dd5353063",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737772896"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c3038b6b-9a9e-40b4-b453-c67dd5353063",
  "created_at": "2026-10-28T11:50:37.068151Z",
  "expires_at": "2026-10-28T12:20:37.068151Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/c3038b6b-9a9e-40b4-b453-c67dd5353063` → **200**

```json
{
  "id": "c3038b6b-9a9e-40b4-b453-c67dd5353063",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T11:50:37.068151Z",
  "expires_at": "2026-10-28T12:20:37.068151Z",
  "completed_at": "2026-10-28T11:50:37.351351Z",
  "masked_pan": "41****1709",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d52b4957-9db4-4f0c-80dc-a21d8dcc2433",
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
      "id": "97dbb3a2-c246-4aa1-b49a-b8067ba397a1",
      "at": "2026-10-28T11:50:37.395736Z",
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
  "client_id": "d52b4957-9db4-4f0c-80dc-a21d8dcc2433",
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
      "id": "97dbb3a2-c246-4aa1-b49a-b8067ba397a1",
      "at": "2026-10-28T11:50:37.395736Z",
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
  "device_ref": "sandbox-21609"
}
```

```json
{
  "challenge_id": "7acaa0cc-3d59-444b-bae2-37ea29799e88",
  "expires_at": "2026-10-28T11:55:38.216939059Z",
  "resend_available_at": "2026-10-28T11:50:39.216939059Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "605994",
  "sent_at": "2026-10-28T11:50:38.220096557Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7acaa0cc-3d59-444b-bae2-37ea29799e88",
  "code": "605994",
  "device_ref": "sandbox-21609"
}
```

```json
{
  "session_id": "566a023e-ed3f-4ac1-a24a-fb8463530ea3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTEzOCwiaWF0IjoxNzkzMTg4MjM4LCJqdGkiOiJiZjZhNThjMi0yNWE5LTRlODgtODE0Ni1hNzViODVjMDgzYWIiLCJzaWQiOiI1NjZhMDIzZS1lZDNmLTRhYzEtYTI0YS1mYjg0NjM1MzBlYTMifQ.qn4aelm4JDQr43rjmmcEQdwdBwssQB8e-DMzL56_1n4",
  "access_expires_at": "2026-10-28T12:05:38.524437219Z",
  "refresh_token": "cP4QBoQF12aAEAfd2S4Mn_JlvtrXQR3lJiv90pdwZ9A",
  "refresh_expires_at": "2026-11-27T11:50:38.523590519Z",
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
  "command_id": "021908da-6e5b-440a-9660-05a13651618d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "2782726d-3cb6-43fa-a7c5-66c37d2a35cc",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2782726d-3cb6-43fa-a7c5-66c37d2a35cc",
    "orderDate": "1793188239",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "aed0eaa7279e3f52cdc526ff031100e4",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2782726d-3cb6-43fa-a7c5-66c37d2a35cc",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2782726d-3cb6-43fa-a7c5-66c37d2a35cc",
  "created_at": "2026-10-28T11:50:39.060071Z",
  "expires_at": "2026-10-28T12:20:39.060071Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/2782726d-3cb6-43fa-a7c5-66c37d2a35cc` → **200**

```json
{
  "id": "2782726d-3cb6-43fa-a7c5-66c37d2a35cc",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T11:50:39.060071Z",
  "expires_at": "2026-10-28T12:20:39.060071Z",
  "completed_at": "2026-10-28T11:50:39.338746Z",
  "masked_pan": "41****0257",
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
      "id": "3317280c-3a11-4695-80d2-df0c0b427006",
      "at": "2026-10-28T11:50:39.408602Z",
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
  "command_id": "49a175b9-eee4-4fb9-bab0-df09373db5d6",
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
  "correlation_id": "8415cfec-1eb4-411e-80c4-94a7848ef584"
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
  "session_id": "844692f0-e8f9-4997-a5c2-56dc73eea723",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxNDAsImlhdCI6MTc5MzE4ODI0MCwianRpIjoiNTM2MzNmMWEtNzIwZC00ZTFmLThkNTctZjIxMTZiZTE3OGE2Iiwic2lkIjoiODQ0NjkyZjAtZThmOS00OTk3LWE1YzItNTZkYzczZWVhNzIzIn0.uNg2w_UztlG68iwcug5avODwHI-0VJvr2Uy-d7Q9iWQ",
  "access_expires_at": "2026-10-28T12:05:40.527073535Z",
  "refresh_token": "Q1oKgodmeQy4TtFndscyjsstr0Ibx_wft0Q_P5zEbo8",
  "refresh_expires_at": "2026-10-28T23:50:40.526430023Z",
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
  "phone": "+48600500430",
  "device_ref": "sandbox-3203"
}
```

```json
{
  "challenge_id": "2a5bbe83-3450-4a73-8ff6-dfdf79d38544",
  "expires_at": "2026-10-28T11:55:41.373245677Z",
  "resend_available_at": "2026-10-28T11:50:42.373245677Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600500430` → **200**

```json
{
  "phone": "+48600500430",
  "audience": "CLIENT",
  "code": "085505",
  "sent_at": "2026-10-28T11:50:41.376117429Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a5bbe83-3450-4a73-8ff6-dfdf79d38544",
  "code": "085505",
  "device_ref": "sandbox-3203"
}
```

```json
{
  "session_id": "f3e36f42-a3b1-440b-941f-e77a3e6fd09d",
  "subject": {
    "type": "CLIENT",
    "id": "33b68e59-1cbe-424a-bfe3-b984e5d64610"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzM2I2OGU1OS0xY2JlLTQyNGEtYmZlMy1iOTg0ZTVkNjQ2MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MTQxLCJpYXQiOjE3OTMxODgyNDEsImp0aSI6IjhiZTRjMmZhLTk2MTMtNGJmMS1hN2UzLTc2YjZjOWViNGViNSIsInNpZCI6ImYzZTM2ZjQyLWEzYjEtNDQwYi05NDFmLWU3N2EzZTZmZDA5ZCJ9.IJDGrByCmQbm7fodaQCdmZy-QDTkXGQNHw5xIv6tSCk",
  "access_expires_at": "2026-10-28T12:05:41.67336767Z",
  "refresh_token": "OcP75jhPTjBASsx4rINaBwAXPSDr7phZh2k5QgjG9kk",
  "refresh_expires_at": "2026-11-27T11:50:41.672663433Z",
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
  "command_id": "29b7748b-958f-440e-b19c-9b7cd5efa97d",
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
  "correlation_id": "c53ab6f8-6b5d-4211-afee-4aa5d64d6830",
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
  "command_id": "2bd55599-431e-4343-beef-bfd21ab1e577",
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
  "paused_at": "2026-10-28T11:50:42.885371775Z",
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
  "command_id": "c6cebdb7-f0b8-4bdf-9e03-cebf1b79c313",
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
  "id": "ce1b50df-feaa-4e6b-86a4-a6ee33db2c0d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:55:43.463173Z",
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
  "command_id": "8059105e-3c0f-40de-b56d-e15c68545e1e",
  "quote_id": "ce1b50df-feaa-4e6b-86a4-a6ee33db2c0d",
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
  "correlation_id": "78deb4aa-b1bb-4f56-abde-b1c7b11096a5"
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
  "paused_at": "2026-10-28T11:50:42.885372Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "ffbc058a-db3c-4e8d-89de-2455447694c1",
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
  "command_id": "b0709565-d1b2-436d-8a5e-51b3f0a682a3",
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
  "command_id": "aa14fe33-55b5-467e-894c-1e7463a76dca",
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
  "id": "3d53b7d0-15f3-4b97-9963-1a754d920992",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:55:45.192731Z",
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
  "command_id": "bcb626b0-80d3-4a7b-9d66-caa83140e805",
  "quote_id": "3d53b7d0-15f3-4b97-9963-1a754d920992",
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
  "correlation_id": "7e8c1310-5a8e-48bc-98d3-cd33ddadbf3b"
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
  "command_id": "508588eb-1b8c-4ea9-877c-942739c122c8",
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
      "from": "14:00",
      "to": "15:00"
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
      "from": "14:00",
      "to": "15:00"
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
  "command_id": "70b47b9d-e094-468f-9545-d97ec7060d44",
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
  "id": "dcd32032-60af-4421-9a9a-4c3faeadfd5a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:55:46.333802Z",
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
  "command_id": "dbfb98b7-568c-4548-ae33-02b5469d56e2",
  "quote_id": "dcd32032-60af-4421-9a9a-4c3faeadfd5a",
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
  "correlation_id": "54ae3071-88a6-4745-8a7d-5cc9641642b4"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "26b9b963-b058-4636-92c3-ab269276bca1",
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
  "correlation_id": "20c96e09-41a9-4d78-8b52-c655b2ab76a6"
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
      "from": "14:00",
      "to": "15:00"
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
  "command_id": "15a839cf-5a0b-4d8d-a660-1637d212de6a",
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
  "phone": "+380673132108",
  "device_ref": "sandbox-18068"
}
```

```json
{
  "challenge_id": "cdd47ea0-8095-45b1-ab0b-7ddc8f7ff6a4",
  "expires_at": "2026-10-28T11:55:47.753153211Z",
  "resend_available_at": "2026-10-28T11:50:48.753153211Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673132108` → **200**

```json
{
  "phone": "+380673132108",
  "audience": "CLIENT",
  "code": "643225",
  "sent_at": "2026-10-28T11:50:47.756414556Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdd47ea0-8095-45b1-ab0b-7ddc8f7ff6a4",
  "code": "643225",
  "device_ref": "sandbox-18068"
}
```

```json
{
  "session_id": "237f4608-3c69-4391-9e4d-d4d4a2e89218",
  "subject": {
    "type": "CLIENT",
    "id": "baafe535-4948-4dc6-8999-c8cdd6a6f6f7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWFmZTUzNS00OTQ4LTRkYzYtODk5OS1jOGNkZDZhNmY2ZjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MTQ4LCJpYXQiOjE3OTMxODgyNDgsImp0aSI6IjQyOTFlN2FiLTg5YTEtNDZjMS05ZGFlLTRkODkxOGU5NDBjMiIsInNpZCI6IjIzN2Y0NjA4LTNjNjktNDM5MS05ZTRkLWQ0ZDRhMmU4OTIxOCJ9.UQU8Lf7Zp-4eWep6rZkRHnvWw9m6Mb-XMXDPL9AVsK4",
  "access_expires_at": "2026-10-28T12:05:48.071470487Z",
  "refresh_token": "T7uIr__jQejvv3C-kpwa5Zasml7Fnpjz886sFLU3Hgo",
  "refresh_expires_at": "2026-11-27T11:50:48.070878862Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "baafe535-4948-4dc6-8999-c8cdd6a6f6f7",
  "session_id": "237f4608-3c69-4391-9e4d-d4d4a2e89218",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "51f6a888-eaee-4c7e-bfb9-5b7f4b3c7e41",
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
  "id": "adef9b51-366b-47dd-abd9-f02afcd07d6e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:55:48.641647Z",
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
  "challenge_id": "f8e42845-0244-4739-acf1-a2c6b46bb091",
  "expires_at": "2026-10-28T11:55:50.93761778Z",
  "resend_available_at": "2026-10-28T11:50:51.93761778Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673132108` → **200**

```json
{
  "phone": "+380673132108",
  "audience": "CLIENT",
  "code": "739709",
  "sent_at": "2026-10-28T11:50:50.940035719Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "83e1cf1b-a8ec-45a0-b317-4f8bbe7592dc",
  "challenge_id": "f8e42845-0244-4739-acf1-a2c6b46bb091",
  "otp_code": "739709"
}
```

```json
{
  "client_id": "baafe535-4948-4dc6-8999-c8cdd6a6f6f7",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T11:50:51.258399317Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "0dd6993b-a2d6-4c91-a289-82c55062ad9e",
  "quote_id": "adef9b51-366b-47dd-abd9-f02afcd07d6e",
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
  "correlation_id": "d07dd90e-4d07-4856-a28c-47aba26c7866"
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
  "session_id": "8fafeb2e-50c0-4ff7-b577-36cf432e4bef",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxNTIsImlhdCI6MTc5MzE4ODI1MiwianRpIjoiODM1MWUwZDMtNzExNS00NzJlLTlhMmQtMzRjYWZhYzkxMWJlIiwic2lkIjoiOGZhZmViMmUtNTBjMC00ZmY3LWI1NzctMzZjZjQzMmU0YmVmIn0.ZsSkKsJ7DMshSh0RsoHj9PS6Yp9BjIKivGv6LnFskG8",
  "access_expires_at": "2026-10-28T12:05:52.109868056Z",
  "refresh_token": "n6k11GXSj4OUueFYy8IQXIOwy_ixh-5VVo-Ja5NrFYc",
  "refresh_expires_at": "2026-10-28T23:50:52.109175082Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "baafe535-4948-4dc6-8999-c8cdd6a6f6f7",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T11:50:51.258399Z",
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

`POST /api/admin/v1/client-deletions/baafe535-4948-4dc6-8999-c8cdd6a6f6f7/complete` → **200**

```json
{
  "command_id": "1753b85e-5b8d-4150-8aa7-5a886dcddd9e",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "baafe535-4948-4dc6-8999-c8cdd6a6f6f7",
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
  "correlation_id": "fbfda59b-59e9-4eb1-8c1e-4fd41b4eb0e6"
}
```

Done: client baafe535-4948-4dc6-8999-c8cdd6a6f6f7 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663825029",
  "device_ref": "sandbox-24721"
}
```

```json
{
  "challenge_id": "36020668-9f67-40b1-abaf-29bff3b627db",
  "expires_at": "2026-10-28T11:55:53.265218614Z",
  "resend_available_at": "2026-10-28T11:50:54.265218614Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663825029` → **200**

```json
{
  "phone": "+380663825029",
  "audience": "CLIENT",
  "code": "907380",
  "sent_at": "2026-10-28T11:50:53.268329475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36020668-9f67-40b1-abaf-29bff3b627db",
  "code": "907380",
  "device_ref": "sandbox-24721"
}
```

```json
{
  "session_id": "d76be4c4-9f69-4c0e-a775-abb643450b42",
  "subject": {
    "type": "CLIENT",
    "id": "d4154ff1-e694-4deb-a635-28a0ab3cc0dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNDE1NGZmMS1lNjk0LTRkZWItYTYzNS0yOGEwYWIzY2MwZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MTUzLCJpYXQiOjE3OTMxODgyNTMsImp0aSI6IjE4M2Y4ZjAzLTZjNzAtNDcyZC05NTUxLWE3MjIyYzM5YWRjMyIsInNpZCI6ImQ3NmJlNGM0LTlmNjktNGMwZS1hNzc1LWFiYjY0MzQ1MGI0MiJ9.etldbvc9UsKq9X_KslGYylCM_x5w23mT_F-OJzGK8Eg",
  "access_expires_at": "2026-10-28T12:05:53.581225383Z",
  "refresh_token": "F9BJLwA08v0zT04l_k5WrtimHun_EdOUtZxa2jXsnQM",
  "refresh_expires_at": "2026-11-27T11:50:53.58064513Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d4154ff1-e694-4deb-a635-28a0ab3cc0dc",
  "session_id": "d76be4c4-9f69-4c0e-a775-abb643450b42",
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
  "session_id": "8238805a-7b31-4d03-bf2e-c48e42b6cdc1",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxNTQsImlhdCI6MTc5MzE4ODI1NCwianRpIjoiYmI2MzJmYTctYmNhNS00NGM1LWFhNDQtMDRiYzliZGNkY2VlIiwic2lkIjoiODIzODgwNWEtN2IzMS00ZDAzLWJmMmUtYzQ4ZTQyYjZjZGMxIn0.Zh3r1dtI9nk-ZzCDITdMr6lpcOAWbjjKmkU0LRjpM2A",
  "access_expires_at": "2026-10-28T12:05:54.423901538Z",
  "refresh_token": "ld0BvCTtmYJ9y9Tt3fiTSqV5yk34UlK0tkBLo_jHNho",
  "refresh_expires_at": "2026-10-28T23:50:54.423269378Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3825029&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "d4154ff1-e694-4deb-a635-28a0ab3cc0dc",
      "phone": "+380663825029",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T11:50:53.578366Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/d4154ff1-e694-4deb-a635-28a0ab3cc0dc` → **200**

```json
{
  "client": {
    "id": "d4154ff1-e694-4deb-a635-28a0ab3cc0dc",
    "phone": "+380663825029",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T11:50:53.578366Z",
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

`POST /api/admin/v1/clients/d4154ff1-e694-4deb-a635-28a0ab3cc0dc/block` → **400**

```json
{
  "command_id": "e7f9bd07-b3af-4b10-bb2b-a2f75209b765",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/d4154ff1-e694-4deb-a635-28a0ab3cc0dc/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "74592628-944c-4bdb-b465-a009a269b06b",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/d4154ff1-e694-4deb-a635-28a0ab3cc0dc/block` → **200**

```json
{
  "command_id": "52fcd525-6fb6-4906-9441-3f1ee43335ac",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "d4154ff1-e694-4deb-a635-28a0ab3cc0dc",
  "phone": "+380663825029",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T11:50:53.578366Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T11:50:55.625155Z",
    "by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
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
  "correlation_id": "1a51f8bf-d473-4a1b-b209-1e8366e603ac"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663825029",
  "device_ref": "sandbox-27403"
}
```

```json
{
  "challenge_id": "0b5a0fc7-0f84-4a51-8563-28ca6e82b729",
  "expires_at": "2026-10-28T11:55:58.189193407Z",
  "resend_available_at": "2026-10-28T11:50:59.189193407Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663825029` → **200**

```json
{
  "phone": "+380663825029",
  "audience": "CLIENT",
  "code": "693593",
  "sent_at": "2026-10-28T11:50:58.192483432Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "0b5a0fc7-0f84-4a51-8563-28ca6e82b729",
  "code": "693593",
  "device_ref": "sandbox-27403"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "49571d77-aa5b-4cc9-8a80-bc3a0d0cfa64"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/d4154ff1-e694-4deb-a635-28a0ab3cc0dc` → **200**

```json
{
  "client": {
    "id": "d4154ff1-e694-4deb-a635-28a0ab3cc0dc",
    "phone": "+380663825029",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T11:50:53.578366Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T11:50:55.625155Z",
      "by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
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

`POST /api/admin/v1/clients/d4154ff1-e694-4deb-a635-28a0ab3cc0dc/unblock` → **200**

```json
{
  "command_id": "faf42467-6efa-4c5a-b002-53adb52785c2",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "d4154ff1-e694-4deb-a635-28a0ab3cc0dc",
  "phone": "+380663825029",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T11:50:53.578366Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663825029",
  "device_ref": "sandbox-21156"
}
```

```json
{
  "challenge_id": "a7623538-e032-4318-a515-5717ea8e9fac",
  "expires_at": "2026-10-28T11:56:01.395093812Z",
  "resend_available_at": "2026-10-28T11:51:02.395093812Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663825029` → **200**

```json
{
  "phone": "+380663825029",
  "audience": "CLIENT",
  "code": "340223",
  "sent_at": "2026-10-28T11:51:01.397926366Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7623538-e032-4318-a515-5717ea8e9fac",
  "code": "340223",
  "device_ref": "sandbox-21156"
}
```

```json
{
  "session_id": "81370576-e301-4fd1-956b-628a31583b4b",
  "subject": {
    "type": "CLIENT",
    "id": "d4154ff1-e694-4deb-a635-28a0ab3cc0dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNDE1NGZmMS1lNjk0LTRkZWItYTYzNS0yOGEwYWIzY2MwZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MTYxLCJpYXQiOjE3OTMxODgyNjEsImp0aSI6Ijg3NzM0M2IxLWUwNjYtNDlkYS1hZDFlLTY3MjkxZmYxZDgxZSIsInNpZCI6IjgxMzcwNTc2LWUzMDEtNGZkMS05NTZiLTYyOGEzMTU4M2I0YiJ9.WcRc4Nnq25Oit2SdAGqAGjiXETamo-_x8lWUkPb4Npc",
  "access_expires_at": "2026-10-28T12:06:01.711483893Z",
  "refresh_token": "BB48d8K8mUr3cktkvEPc5e4Nl_L3ehuwsvsIKvR4two",
  "refresh_expires_at": "2026-11-27T11:51:01.710808765Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d4154ff1-e694-4deb-a635-28a0ab3cc0dc",
  "session_id": "81370576-e301-4fd1-956b-628a31583b4b",
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
  "phone": "+380669925385",
  "device_ref": "sandbox-13985"
}
```

```json
{
  "challenge_id": "d68299e9-f9c4-4084-aa53-2641f143a0d6",
  "expires_at": "2026-10-28T11:56:02.300328909Z",
  "resend_available_at": "2026-10-28T11:51:03.300328909Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669925385` → **200**

```json
{
  "phone": "+380669925385",
  "audience": "CLIENT",
  "code": "063206",
  "sent_at": "2026-10-28T11:51:02.303010014Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d68299e9-f9c4-4084-aa53-2641f143a0d6",
  "code": "063206",
  "device_ref": "sandbox-13985"
}
```

```json
{
  "session_id": "c7e038e4-670a-4522-adac-c69e7645f39f",
  "subject": {
    "type": "CLIENT",
    "id": "533ba0e3-444c-4538-a082-5143fa33d2fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MzNiYTBlMy00NDRjLTQ1MzgtYTA4Mi01MTQzZmEzM2QyZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MTYyLCJpYXQiOjE3OTMxODgyNjIsImp0aSI6ImNjZGJmOTA3LWZiYTYtNDMxYi1hNmZmLWY4Y2JmYTAzNTQyMiIsInNpZCI6ImM3ZTAzOGU0LTY3MGEtNDUyMi1hZGFjLWM2OWU3NjQ1ZjM5ZiJ9.CyK-vs_x3kEYxgOmUGAe6iDaoAJN7ZeLx8BKbpDi_4Y",
  "access_expires_at": "2026-10-28T12:06:02.616861365Z",
  "refresh_token": "9qWOFsU4rCOiWUEicIrvKuQBu76gPYwKsb6A1Nru-Rs",
  "refresh_expires_at": "2026-11-27T11:51:02.615923182Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6099a464-8238-425d-be81-b525e6b994f1",
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
  "id": "9dc545ad-b7af-4e17-b37f-1634f0d6db5a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:56:02.909439Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 3e6af3a9-ff90-4039-bf87-e7e491a851c2) → **201**

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
  "session_id": "54819822-c5e5-4e3f-93f7-6e57721bb808",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxNjMsImlhdCI6MTc5MzE4ODI2MywianRpIjoiOTM5YjI3NDEtNjhlNC00N2Y5LTkyNDAtNjgwNzA0NzE4NmQyIiwic2lkIjoiNTQ4MTk4MjItYzVlNS00ZTNmLTkzZjctNmU1NzcyMWJiODA4In0.HUa8XnBsuSqjmiQ7BWr6OQh2JzjXsZQZSk_s276juBg",
  "access_expires_at": "2026-10-28T12:06:03.574742442Z",
  "refresh_token": "wIxSBXIMAEe74rtW0x6UQt2GqPwdY0GEmFaXUKIAq10",
  "refresh_expires_at": "2026-10-28T23:51:03.574068002Z",
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
  "session_id": "38318ae8-9b24-480c-8071-0343d6d10d7c",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxNjQsImlhdCI6MTc5MzE4ODI2NCwianRpIjoiZGVjMzVjYTctZjY1Ni00NzQyLWI1NTAtN2MwODQ5NTA0ZDJmIiwic2lkIjoiMzgzMThhZTgtOWIyNC00ODBjLTgwNzEtMDM0M2Q2ZDEwZDdjIn0.vCwVmw9Jb8PL1NZkVKWluf4OSGf-vVz6q4TTUcqm_BY",
  "access_expires_at": "2026-10-28T12:06:04.141715804Z",
  "refresh_token": "N5ZUKOL-OFjxR2JUYeysWuEJsUgcCvQue8P4QqpprEs",
  "refresh_expires_at": "2026-10-28T23:51:04.141121755Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e2056a78-ce88-4260-8851-0e4de9280302/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T11:51:03.231103Z",
      "actor": {
        "type": "CLIENT",
        "id": "533ba0e3-444c-4538-a082-5143fa33d2fc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e2056a78-ce88-4260-8851-0e4de9280302",
        "quote_id": "9dc545ad-b7af-4e17-b37f-1634f0d6db5a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "3e6af3a9-ff90-4039-bf87-e7e491a851c2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T11:51:03.233682Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e2056a78-ce88-4260-8851-0e4de9280302",
        "attempt_id": "e667c7bb-bcca-4b06-a352-31fbed4957e0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3e6af3a9-ff90-4039-bf87-e7e491a851c2"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T11:51:03.245502Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e2056a78-ce88-4260-8851-0e4de9280302",
        "attempt_id": "e667c7bb-bcca-4b06-a352-31fbed4957e0"
      },
      "correlation_id": "3e6af3a9-ff90-4039-bf87-e7e491a851c2"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "e667c7bb-bcca-4b06-a352-31fbed4957e0",
        "generation": 1,
        "started_at": "2026-10-28T11:51:03.232237Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T11:51:03.245502Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T11:51:03.23477Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/3e6af3a9-ff90-4039-bf87-e7e491a851c2` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "e2056a78-ce88-4260-8851-0e4de9280302:0",
      "order_id": "e2056a78-ce88-4260-8851-0e4de9280302",
      "at": "2026-10-28T11:51:03.231103Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e2056a78-ce88-4260-8851-0e4de9280302:1",
      "order_id": "e2056a78-ce88-4260-8851-0e4de9280302",
      "at": "2026-10-28T11:51:03.233682Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e2056a78-ce88-4260-8851-0e4de9280302:2",
      "order_id": "e2056a78-ce88-4260-8851-0e4de9280302",
      "at": "2026-10-28T11:51:03.245502Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/6e3c65b5-a25a-49c2-bf38-e1baea9c5042` → **200**

```json
{
  "found": []
}
```

Done: request 3e6af3a9-ff90-4039-bf87-e7e491a851c2 — order e2056a78-ce88-4260-8851-0e4de9280302 found by its id.

`GET /api/rider/v1/orders/e2056a78-ce88-4260-8851-0e4de9280302` → **200**

```json
{
  "id": "e2056a78-ce88-4260-8851-0e4de9280302",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "533ba0e3-444c-4538-a082-5143fa33d2fc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T11:51:03.22987Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/e2056a78-ce88-4260-8851-0e4de9280302/cancel` → **200**

```json
{
  "command_id": "28517bbd-068b-4578-9bff-86b9ab04247e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e2056a78-ce88-4260-8851-0e4de9280302",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "533ba0e3-444c-4538-a082-5143fa33d2fc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T11:51:03.22987Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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
  "phone": "+380637990268",
  "device_ref": "sandbox-156"
}
```

```json
{
  "challenge_id": "76e05285-e9b6-4fed-8afa-4df97c848e85",
  "expires_at": "2026-10-28T11:56:05.905592715Z",
  "resend_available_at": "2026-10-28T11:51:06.905592715Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637990268` → **200**

```json
{
  "phone": "+380637990268",
  "audience": "CLIENT",
  "code": "186938",
  "sent_at": "2026-10-28T11:51:05.908958872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76e05285-e9b6-4fed-8afa-4df97c848e85",
  "code": "186938",
  "device_ref": "sandbox-156"
}
```

```json
{
  "session_id": "e4b2d7a3-0758-45b0-8f34-4a1b0216cb9d",
  "subject": {
    "type": "CLIENT",
    "id": "568e8bfa-8d0b-4b90-9099-646d285864c0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NjhlOGJmYS04ZDBiLTRiOTAtOTA5OS02NDZkMjg1ODY0YzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MTY2LCJpYXQiOjE3OTMxODgyNjYsImp0aSI6Ijc0MzQ5ZmUzLTM3NzEtNDNjZS04ZWNhLTRmMzhkYWQxYTc2YSIsInNpZCI6ImU0YjJkN2EzLTA3NTgtNDViMC04ZjM0LTRhMWIwMjE2Y2I5ZCJ9.RJwUlsAA4n5-_NjFcLute-_CGcttmxi4DCSEufzFeJ0",
  "access_expires_at": "2026-10-28T12:06:06.215830545Z",
  "refresh_token": "C-La95P9wAH1w-YmYV9P_8HDRIFx630dS2pZHXce-yE",
  "refresh_expires_at": "2026-11-27T11:51:06.215083329Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "0ea8f84f-4250-4237-b6f5-3d77e9f3bc95",
  "expires_at": "2026-10-28T11:56:08.490759754Z",
  "resend_available_at": "2026-10-28T11:51:09.490759754Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637990268` → **200**

```json
{
  "phone": "+380637990268",
  "audience": "CLIENT",
  "code": "845397",
  "sent_at": "2026-10-28T11:51:08.493350165Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "e656b0e5-ae08-4db2-9c49-35a5f80cdaee",
  "challenge_id": "0ea8f84f-4250-4237-b6f5-3d77e9f3bc95",
  "otp_code": "845397"
}
```

```json
{
  "id": "a5c098d9-b021-4746-8b92-492b4524a51c",
  "state": "PENDING",
  "created_at": "2026-10-28T11:51:08.809233Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/a5c098d9-b021-4746-8b92-492b4524a51c` → **200**

```json
{
  "id": "a5c098d9-b021-4746-8b92-492b4524a51c",
  "state": "PENDING",
  "created_at": "2026-10-28T11:51:08.809233Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a5c098d9-b021-4746-8b92-492b4524a51c` → **200**

```json
{
  "id": "a5c098d9-b021-4746-8b92-492b4524a51c",
  "state": "PENDING",
  "created_at": "2026-10-28T11:51:08.809233Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a5c098d9-b021-4746-8b92-492b4524a51c` → **200**

```json
{
  "id": "a5c098d9-b021-4746-8b92-492b4524a51c",
  "state": "READY",
  "created_at": "2026-10-28T11:51:08.809233Z",
  "ready_at": "2026-10-28T11:51:10.897449Z",
  "expires_at": "2026-11-04T11:51:10.897449Z",
  "size_bytes": 1029
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/a5c098d9-b021-4746-8b92-492b4524a51c/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635920303",
  "device_ref": "sandbox-4669"
}
```

```json
{
  "challenge_id": "f3193cfa-afcb-4f9e-bffd-1216d0ba8786",
  "expires_at": "2026-10-28T11:56:11.927537451Z",
  "resend_available_at": "2026-10-28T11:51:12.927537451Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635920303` → **200**

```json
{
  "phone": "+380635920303",
  "audience": "CLIENT",
  "code": "997043",
  "sent_at": "2026-10-28T11:51:11.930131843Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3193cfa-afcb-4f9e-bffd-1216d0ba8786",
  "code": "997043",
  "device_ref": "sandbox-4669"
}
```

```json
{
  "session_id": "aed1c6ff-bfa7-4e27-b033-95404f0e1bef",
  "subject": {
    "type": "CLIENT",
    "id": "84e4a85b-2081-462c-9df3-5e57b2c6a6af"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGU0YTg1Yi0yMDgxLTQ2MmMtOWRmMy01ZTU3YjJjNmE2YWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MTcyLCJpYXQiOjE3OTMxODgyNzIsImp0aSI6IjAyZjNlN2MyLTI3YzctNDkyMy04MWJkLTgxNWQyN2Y3YTg0MiIsInNpZCI6ImFlZDFjNmZmLWJmYTctNGUyNy1iMDMzLTk1NDA0ZjBlMWJlZiJ9.b4aR-g3EKyDmjB7V7P5ro8M6Lc93ddlcn_1qrPRU0l8",
  "access_expires_at": "2026-10-28T12:06:12.233790698Z",
  "refresh_token": "0CE9Uw4CbUIu7F_rCBhqUvPy2SFT_TdKsUVaIvn7Lww",
  "refresh_expires_at": "2026-11-27T11:51:12.233234499Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/a5c098d9-b021-4746-8b92-492b4524a51c/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/a5c098d9-b021-4746-8b92-492b4524a51c/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "af9f76d0-fde4-47cc-94a9-318b6c9bffa7"
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
  "session_id": "5ba83fa7-0679-49d3-ab61-42311d710f0d",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxNzMsImlhdCI6MTc5MzE4ODI3MywianRpIjoiMzY1Nzc3MzQtMjMzYy00ZTRlLWEwMjQtZjExYTE3YzI3OWFlIiwic2lkIjoiNWJhODNmYTctMDY3OS00OWQzLWFiNjEtNDIzMTFkNzEwZjBkIn0.BrwrvoudYQ-6V7JGarjDdjVqa3pvbh7agGruQiI_9m0",
  "access_expires_at": "2026-10-28T12:06:13.079258782Z",
  "refresh_token": "fHpr0WyiDeGdFxwxAsfcQbO0P4PRHbdFqsX53BDWi6g",
  "refresh_expires_at": "2026-10-28T23:51:13.078612114Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "568e8bfa-8d0b-4b90-9099-646d285864c0",
  "session_id": "e4b2d7a3-0758-45b0-8f34-4a1b0216cb9d",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/568e8bfa-8d0b-4b90-9099-646d285864c0/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "a5c098d9-b021-4746-8b92-492b4524a51c",
      "state": "READY",
      "created_at": "2026-10-28T11:51:08.809233Z",
      "ready_at": "2026-10-28T11:51:10.897449Z",
      "expires_at": "2026-11-04T11:51:10.897449Z",
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
  "device_ref": "sandbox-11479"
}
```

```json
{
  "challenge_id": "a1c124d0-0d24-4ad0-93d4-9c7e1d7f3982",
  "expires_at": "2026-10-28T11:56:13.924692822Z",
  "resend_available_at": "2026-10-28T11:51:14.924692822Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "872088",
  "sent_at": "2026-10-28T11:51:13.927394487Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1c124d0-0d24-4ad0-93d4-9c7e1d7f3982",
  "code": "872088",
  "device_ref": "sandbox-11479"
}
```

```json
{
  "session_id": "1558d6bb-f4d1-4ad3-900f-bd993306ad07",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTE3NCwiaWF0IjoxNzkzMTg4Mjc0LCJqdGkiOiIyZjhmNTdkNi03ZWI0LTQ4ZWMtODk0Ni1lZGNiMWQ4YzUxNjIiLCJzaWQiOiIxNTU4ZDZiYi1mNGQxLTRhZDMtOTAwZi1iZDk5MzMwNmFkMDcifQ.yIF-yWW9vImkfW-1bP745aAjAXCWrS_wS_gG13REiu8",
  "access_expires_at": "2026-10-28T12:06:14.231509967Z",
  "refresh_token": "mm-asjP5xvmHD6XalXYd5uEKGjeY_20pJPLQ8fyeSl8",
  "refresh_expires_at": "2026-11-27T11:51:14.230879851Z",
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
  "device_ref": "sandbox-18363"
}
```

```json
{
  "challenge_id": "04b56b19-bee5-446e-bc20-72041c678c3d",
  "expires_at": "2026-10-28T11:56:14.778774153Z",
  "resend_available_at": "2026-10-28T11:51:15.778774153Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "935472",
  "sent_at": "2026-10-28T11:51:14.781168945Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04b56b19-bee5-446e-bc20-72041c678c3d",
  "code": "935472",
  "device_ref": "sandbox-18363"
}
```

```json
{
  "session_id": "c962fa4f-35e7-4cf1-b405-69590b426382",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTE3NSwiaWF0IjoxNzkzMTg4Mjc1LCJqdGkiOiJiNjQ4ZjlmZi1jNmQzLTQwNDktYWJjNi03OWViMWFiMGI3ZTAiLCJzaWQiOiJjOTYyZmE0Zi0zNWU3LTRjZjEtYjQwNS02OTU5MGI0MjYzODIifQ.2aJHrQsAObxb7SGAZpT6vZAB0CEeLBSZxw6O680ZqJM",
  "access_expires_at": "2026-10-28T12:06:15.091257711Z",
  "refresh_token": "ystTi_CS_gJQ0JRwax-BYuIYyrcVKZmwpXwGWWaZR8g",
  "refresh_expires_at": "2026-11-27T11:51:15.090668401Z",
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
  "command_id": "ac54adfb-e7b2-4cbf-963f-5e5fc4188b99",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:51:15Z",
    "sequence": 1793188275636
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8091fed4-2d74-45b7-bfa6-bbf0dbeec743",
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
  "last_heartbeat_at": "2026-10-28T11:51:15.655977Z",
  "last_location_at": "2026-10-28T11:51:15.655977Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-25894"
}
```

```json
{
  "challenge_id": "b6ca65b7-3446-4639-b72b-51699e9eedcd",
  "expires_at": "2026-10-28T11:56:15.932219661Z",
  "resend_available_at": "2026-10-28T11:51:16.932219661Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "630077",
  "sent_at": "2026-10-28T11:51:15.935379411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6ca65b7-3446-4639-b72b-51699e9eedcd",
  "code": "630077",
  "device_ref": "sandbox-25894"
}
```

```json
{
  "session_id": "cec6622b-cbc5-496a-9ec1-ce90dca3e0f9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTE3NiwiaWF0IjoxNzkzMTg4Mjc2LCJqdGkiOiIzNWI3NzE0YS1jOTYxLTRiZGMtYjZjZi01OGRjNzVlMTIzMTgiLCJzaWQiOiJjZWM2NjIyYi1jYmM1LTQ5NmEtOWVjMS1jZTkwZGNhM2UwZjkifQ.c8RVOxIGkfA00P535reELEnPEf0Xdo71xeyoMBaV_8w",
  "access_expires_at": "2026-10-28T12:06:16.2336135Z",
  "refresh_token": "7_EsQVMmkm4YuH8ftfiNe1Sk1_FEO7N0zNQXav7-9I0",
  "refresh_expires_at": "2026-11-27T11:51:16.232989475Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9463f33c-c869-4695-91f1-e34b07a4c999",
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
  "last_heartbeat_at": "2026-10-28T11:50:17.658598Z",
  "last_location_at": "2026-10-28T11:50:17.658598Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9463f33c-c869-4695-91f1-e34b07a4c999/handover` → **200**

```json
{
  "command_id": "eaea8e5a-8f38-4138-986e-963d0f7521d7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9463f33c-c869-4695-91f1-e34b07a4c999",
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
  "last_heartbeat_at": "2026-10-28T11:50:17.658598Z",
  "last_location_at": "2026-10-28T11:50:17.658598Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9463f33c-c869-4695-91f1-e34b07a4c999/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:51:17Z",
    "sequence": 1793188277755
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9463f33c-c869-4695-91f1-e34b07a4c999",
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
  "last_heartbeat_at": "2026-10-28T11:51:17.095616Z",
  "last_location_at": "2026-10-28T11:51:17.095616Z",
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
  "session_id": "e31dddeb-5853-4a54-af17-02722493d792",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxNzcsImlhdCI6MTc5MzE4ODI3NywianRpIjoiN2JmODMxZGMtZGM3Yi00MGE3LThlNWEtZjVmYTdmYzVkZDkyIiwic2lkIjoiZTMxZGRkZWItNTg1My00YTU0LWFmMTctMDI3MjI0OTNkNzkyIn0.7abEwg5NkR5Xjcevn_58jqm2ESJJc-4GekeDqAiAhdA",
  "access_expires_at": "2026-10-28T12:06:17.662507439Z",
  "refresh_token": "C1MxHZgzwZPTy5Tkd2DREe6ie96TPcYKOUM8XdOmlOw",
  "refresh_expires_at": "2026-10-28T23:51:17.661891249Z",
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
  "session_id": "3a6cbfff-48b9-4126-a44b-14951c6540b4",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxNzgsImlhdCI6MTc5MzE4ODI3OCwianRpIjoiYzYyZWNkMDQtYzg3Yi00MDJkLTg3ZWMtMDdmYzM1OWRlMDBiIiwic2lkIjoiM2E2Y2JmZmYtNDhiOS00MTI2LWE0NGItMTQ5NTFjNjU0MGI0In0.PKSHwgnYS4ZSwrBiYH_39jHbHaIqGl3GwLWD0Uc87jg",
  "access_expires_at": "2026-10-28T12:06:18.250357496Z",
  "refresh_token": "6SALGyeF4LsuGiYXY5-GzHCxhSnOWu1GSrvjzLo50qQ",
  "refresh_expires_at": "2026-10-28T23:51:18.249651371Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681081983",
  "device_ref": "sandbox-13717"
}
```

```json
{
  "challenge_id": "5ec2d09e-eb87-4dad-86a0-000a26d08935",
  "expires_at": "2026-10-28T11:56:18.526366392Z",
  "resend_available_at": "2026-10-28T11:51:19.526366392Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380681081983` → **200**

```json
{
  "phone": "+380681081983",
  "audience": "CLIENT",
  "code": "910266",
  "sent_at": "2026-10-28T11:51:18.528990973Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ec2d09e-eb87-4dad-86a0-000a26d08935",
  "code": "910266",
  "device_ref": "sandbox-13717"
}
```

```json
{
  "session_id": "8abedc7a-5143-4972-82dd-a4f671744dbe",
  "subject": {
    "type": "CLIENT",
    "id": "03e1cdaa-63b5-46d4-bb34-d8526b1eba15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwM2UxY2RhYS02M2I1LTQ2ZDQtYmIzNC1kODUyNmIxZWJhMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MTc4LCJpYXQiOjE3OTMxODgyNzgsImp0aSI6IjUzMGFiMWNmLTI5NDAtNGI3Ni1hMTcxLWEzMmM1MTcxNjA0YiIsInNpZCI6IjhhYmVkYzdhLTUxNDMtNDk3Mi04MmRkLWE0ZjY3MTc0NGRiZSJ9.-HDKNaG906XWdY_ccBzmhhbk32fZGSKm7QExiWg2rXw",
  "access_expires_at": "2026-10-28T12:06:18.842930038Z",
  "refresh_token": "Tb5y3TJiY6NxIOPh_BEp02jloHivZRIjwrujvhXaGZA",
  "refresh_expires_at": "2026-11-27T11:51:18.842270203Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ed90d820-796d-438b-9bd7-c943cf68b9bb",
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
  "id": "a609e75b-325c-43c6-899c-66cf50294c5e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:56:19.136436Z",
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
  "command_id": "b3dc23bd-31fd-4023-863c-215fcf35cc6f",
  "quote_id": "a609e75b-325c-43c6-899c-66cf50294c5e",
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
  "id": "7acff546-2b98-4cb4-9f54-353d79cf3bd3",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "03e1cdaa-63b5-46d4-bb34-d8526b1eba15",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T11:51:19.436172Z",
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
    "id": "2e45025f-087c-4421-9d4e-734f580f53df",
    "order_id": "7acff546-2b98-4cb4-9f54-353d79cf3bd3",
    "expires_at": "2026-10-28T11:51:34.440083Z",
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

`POST /api/driver/v1/offers/2e45025f-087c-4421-9d4e-734f580f53df/reject` → **204**

```json
{
  "command_id": "83fafce6-3834-4327-99d9-497f47e94f34"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e4161ae1-24de-4b26-aa54-891fea051d68",
    "order_id": "7acff546-2b98-4cb4-9f54-353d79cf3bd3",
    "expires_at": "2026-10-28T11:51:35.028356Z",
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

`POST /api/driver/v1/offers/e4161ae1-24de-4b26-aa54-891fea051d68/accept` → **200**

```json
{
  "command_id": "26a7b3f9-19b0-45e4-aa4f-5d1979b9cd74"
}
```

```json
{
  "id": "daaf30fe-c0cc-4e45-bbeb-1aa56bd60176",
  "order_id": "7acff546-2b98-4cb4-9f54-353d79cf3bd3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "01762eda-4497-41c8-bd90-1f6091b885a5",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/7acff546-2b98-4cb4-9f54-353d79cf3bd3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T11:51:19.436976Z",
      "actor": {
        "type": "CLIENT",
        "id": "03e1cdaa-63b5-46d4-bb34-d8526b1eba15",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7acff546-2b98-4cb4-9f54-353d79cf3bd3",
        "quote_id": "a609e75b-325c-43c6-899c-66cf50294c5e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "4a57e124-473a-4bd4-b20c-3c5f1ff3001c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T11:51:19.43897Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7acff546-2b98-4cb4-9f54-353d79cf3bd3",
        "attempt_id": "a7c3d985-af5f-4d07-a70e-8f5a021b40d5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4a57e124-473a-4bd4-b20c-3c5f1ff3001c"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T11:51:19.449332Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2e45025f-087c-4421-9d4e-734f580f53df",
        "order_id": "7acff546-2b98-4cb4-9f54-353d79cf3bd3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "4a57e124-473a-4bd4-b20c-3c5f1ff3001c"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T11:51:20.026831Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2e45025f-087c-4421-9d4e-734f580f53df",
        "order_id": "7acff546-2b98-4cb4-9f54-353d79cf3bd3"
      },
      "correlation_id": "54c75168-2fcf-4463-9e42-fa6e7e55671c"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 7acff546-2b98-4cb4-9f54-353d79cf3bd3 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/7acff546-2b98-4cb4-9f54-353d79cf3bd3` → **200**

```json
{
  "id": "7acff546-2b98-4cb4-9f54-353d79cf3bd3",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "03e1cdaa-63b5-46d4-bb34-d8526b1eba15",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "daaf30fe-c0cc-4e45-bbeb-1aa56bd60176",
    "order_id": "7acff546-2b98-4cb4-9f54-353d79cf3bd3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "01762eda-4497-41c8-bd90-1f6091b885a5",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T11:51:19.436172Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7acff546-2b98-4cb4-9f54-353d79cf3bd3/cancel` → **200**

```json
{
  "command_id": "8b68dffc-d57a-4d3f-8a7d-aca6ccc1d9a0",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7acff546-2b98-4cb4-9f54-353d79cf3bd3",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "03e1cdaa-63b5-46d4-bb34-d8526b1eba15",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "daaf30fe-c0cc-4e45-bbeb-1aa56bd60176",
    "order_id": "7acff546-2b98-4cb4-9f54-353d79cf3bd3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "01762eda-4497-41c8-bd90-1f6091b885a5",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T11:51:19.436172Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "session_id": "8091fed4-2d74-45b7-bfa6-bbf0dbeec743",
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
  "last_heartbeat_at": "2026-10-28T11:51:15.655977Z",
  "last_location_at": "2026-10-28T11:51:15.655977Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8091fed4-2d74-45b7-bfa6-bbf0dbeec743/close` → **200**

```json
{
  "command_id": "83d8b4d1-b87c-4c87-91a5-12f11d1c216a",
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
  "session_id": "9463f33c-c869-4695-91f1-e34b07a4c999",
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
  "last_heartbeat_at": "2026-10-28T11:51:17.095616Z",
  "last_location_at": "2026-10-28T11:51:17.095616Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9463f33c-c869-4695-91f1-e34b07a4c999/close` → **200**

```json
{
  "command_id": "e7dad7f8-c8e5-42dd-aea7-21fa6eb14c73",
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
  "device_ref": "sandbox-4853"
}
```

```json
{
  "challenge_id": "dee97753-4a0e-43eb-92bc-bae4df8a447c",
  "expires_at": "2026-10-28T11:56:23.010415549Z",
  "resend_available_at": "2026-10-28T11:51:24.010415549Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "793150",
  "sent_at": "2026-10-28T11:51:23.012890605Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dee97753-4a0e-43eb-92bc-bae4df8a447c",
  "code": "793150",
  "device_ref": "sandbox-4853"
}
```

```json
{
  "session_id": "3b87290b-050b-417e-81f9-a51e79d499f0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTE4MywiaWF0IjoxNzkzMTg4MjgzLCJqdGkiOiJiNmU2YzQ2NC1hMTNmLTQ1MGEtODBlNy1iZGY5YTViN2I5YTgiLCJzaWQiOiIzYjg3MjkwYi0wNTBiLTQxN2UtODFmOS1hNTFlNzlkNDk5ZjAifQ.JudT2EfG0p7q1_hSD1kzjufK262JzC0zpmayfMhS5Eo",
  "access_expires_at": "2026-10-28T12:06:23.318480711Z",
  "refresh_token": "b6kQQP9MN32mkk7BUZjnbY4o_SZFtaFncLTCuTI6uMg",
  "refresh_expires_at": "2026-11-27T11:51:23.317588799Z",
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
  "command_id": "3763813e-fe7b-4437-bc7e-31143f1f9ab5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:51:23Z",
    "sequence": 1793188283902
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:51:23.922643Z",
  "last_location_at": "2026-10-28T11:51:23.922643Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675060552",
  "device_ref": "sandbox-3197"
}
```

```json
{
  "challenge_id": "24850b48-c794-4fdb-9a7a-88936f9a6ac9",
  "expires_at": "2026-10-28T11:56:24.211018982Z",
  "resend_available_at": "2026-10-28T11:51:25.211018982Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675060552` → **200**

```json
{
  "phone": "+380675060552",
  "audience": "CLIENT",
  "code": "130621",
  "sent_at": "2026-10-28T11:51:24.213722893Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24850b48-c794-4fdb-9a7a-88936f9a6ac9",
  "code": "130621",
  "device_ref": "sandbox-3197"
}
```

```json
{
  "session_id": "650fdc4b-3371-4211-a39b-bee397b1b816",
  "subject": {
    "type": "CLIENT",
    "id": "c5e40a5b-7f2a-411f-abc3-ccdbe3131e5c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWU0MGE1Yi03ZjJhLTQxMWYtYWJjMy1jY2RiZTMxMzFlNWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MTg0LCJpYXQiOjE3OTMxODgyODQsImp0aSI6ImE1YTdmMTYyLTFiNTEtNDMwMS1hZjQ3LWFjZThlMTkwMDA3NSIsInNpZCI6IjY1MGZkYzRiLTMzNzEtNDIxMS1hMzliLWJlZTM5N2IxYjgxNiJ9.-2CAqD-SP5mXJVg7vOgulu_Sk1V3p3CPuEW95jnaQ-g",
  "access_expires_at": "2026-10-28T12:06:24.517396909Z",
  "refresh_token": "4gt2Y0JbKv2KaWAQUDLD1kzyTex32sbn7aGhBOP1PVU",
  "refresh_expires_at": "2026-11-27T11:51:24.516671233Z",
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
  "command_id": "83373a69-0e49-413f-bb4c-6efbdf2769c6",
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
  "id": "a6f003f1-e584-449e-a6a3-5307490f93fc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:56:25.074914Z",
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
  "command_id": "0518eb95-6954-44f6-97b8-de4f351a0487",
  "platform": "ANDROID",
  "token": "sandbox-driver-79e63d20-8e09-4a65-bb50-bc1a990c62b1"
}
```

```json
{
  "id": "46fec1e6-7b57-48b8-bb88-ebe93d250f67",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T11:51:25.394206Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "05366109-690f-4b9f-8541-04a74d48d502",
  "platform": "ANDROID",
  "token": "sandbox-rider-4f919b75-5efe-42a1-b92a-fe98743647be"
}
```

```json
{
  "id": "b1d9f99e-f084-45a8-8ad3-1c4b83df5338",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T11:51:25.672495Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "eb00fc5f-e469-433e-9301-c82cf93a800b",
  "quote_id": "a6f003f1-e584-449e-a6a3-5307490f93fc",
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
  "id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c5e40a5b-7f2a-411f-abc3-ccdbe3131e5c",
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
  "created_at": "2026-10-28T11:51:25.962366Z",
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
    "id": "3e8cf443-f715-4088-8c11-9f1b699332b1",
    "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
    "expires_at": "2026-10-28T11:51:40.965938Z",
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

`POST /api/driver/v1/offers/3e8cf443-f715-4088-8c11-9f1b699332b1/accept` → **200**

```json
{
  "command_id": "eaa52a4d-1f9e-4c3e-94c7-18a21666c97b"
}
```

```json
{
  "id": "d7d5abbf-eea2-4b6f-ae91-8a49f6fc2c05",
  "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f159401d-ec8c-4577-8986-01ca4f6d153c",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T11:51:25.936Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T11:51:25.936Z` → **200**

```json
[
  {
    "at": "2026-10-28T11:51:27.165066435Z",
    "token_suffix": "0c62b1",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "4038f29f-6678-41d6-bd1d-2e912845e050",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675060552&after=2026-10-28T11:51:25.936Z` → **200**

```json
[
  {
    "at": "2026-10-28T11:51:27.167678243Z",
    "token_suffix": "3647be",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "ed84c1d4-0356-4199-8645-5ba4faa94d9d",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/6ba2476d-503e-4d0c-b56c-da5a3bf7844c/messages` → **201**

```json
{
  "command_id": "94ca586e-785b-40eb-928f-04367f96bc40",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "250c5760-3979-48b3-9623-9a0ed7527aa1",
  "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T11:51:27.902878709Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f159401d-ec8c-4577-8986-01ca4f6d153c",
  "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
  "assignment_id": "d7d5abbf-eea2-4b6f-ae91-8a49f6fc2c05",
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

`POST /api/driver/v1/trips/f159401d-ec8c-4577-8986-01ca4f6d153c/messages` → **201**

```json
{
  "command_id": "191cb28b-9b53-4c1a-ae3c-7839c1f95117",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "6e87721e-6fce-43d8-aba6-d601cba77a84",
  "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T11:51:28.446556066Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/6ba2476d-503e-4d0c-b56c-da5a3bf7844c/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/f159401d-ec8c-4577-8986-01ca4f6d153c/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675060552"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/8fb0ca8f-771a-49dd-8086-774f7972ec1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:51:29Z",
    "sequence": 1793188289245
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:51:29.265213Z",
  "last_location_at": "2026-10-28T11:51:29.265213Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f159401d-ec8c-4577-8986-01ca4f6d153c",
  "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
  "assignment_id": "d7d5abbf-eea2-4b6f-ae91-8a49f6fc2c05",
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

`POST /api/driver/v1/trips/f159401d-ec8c-4577-8986-01ca4f6d153c/arrive` → **200**

```json
{
  "command_id": "10296734-e7b5-41df-af12-af95a1205856",
  "expected_version": 0
}
```

```json
{
  "id": "f159401d-ec8c-4577-8986-01ca4f6d153c",
  "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
  "assignment_id": "d7d5abbf-eea2-4b6f-ae91-8a49f6fc2c05",
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
  "arrived_at": "2026-10-28T11:51:29.797014Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f159401d-ec8c-4577-8986-01ca4f6d153c/start` → **200**

```json
{
  "command_id": "eeef7b1a-6b49-4ec9-8342-a2d4938762f6",
  "expected_version": 1
}
```

```json
{
  "id": "f159401d-ec8c-4577-8986-01ca4f6d153c",
  "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
  "assignment_id": "d7d5abbf-eea2-4b6f-ae91-8a49f6fc2c05",
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
  "arrived_at": "2026-10-28T11:51:29.797014Z",
  "started_at": "2026-10-28T11:51:30.080401Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/8fb0ca8f-771a-49dd-8086-774f7972ec1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:51:30Z",
    "sequence": 1793188290364
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:51:30.386513Z",
  "last_location_at": "2026-10-28T11:51:30.386513Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/f159401d-ec8c-4577-8986-01ca4f6d153c/complete` → **200**

```json
{
  "command_id": "87f99b02-8524-48ce-9d13-fdf87eb48bae",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:51:30Z",
  "cash_received": true
}
```

```json
{
  "id": "f159401d-ec8c-4577-8986-01ca4f6d153c",
  "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
  "assignment_id": "d7d5abbf-eea2-4b6f-ae91-8a49f6fc2c05",
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
  "arrived_at": "2026-10-28T11:51:29.797014Z",
  "started_at": "2026-10-28T11:51:30.080401Z",
  "completed_at": "2026-10-28T11:51:30.672795Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/6ba2476d-503e-4d0c-b56c-da5a3bf7844c` → **200**

```json
{
  "id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c5e40a5b-7f2a-411f-abc3-ccdbe3131e5c",
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
    "id": "d7d5abbf-eea2-4b6f-ae91-8a49f6fc2c05",
    "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f159401d-ec8c-4577-8986-01ca4f6d153c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T11:51:25.962366Z",
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
    "id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T11:51:25.962366Z",
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
    "id": "f159401d-ec8c-4577-8986-01ca4f6d153c",
    "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
    "order_short_number": 7,
    "created_at": "2026-10-28T11:51:26.531887Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8c7542d2-f62f-430c-a43f-c9546f1852a0",
    "order_id": "1a26d138-6149-436d-9e0c-7f6bcb09849c",
    "order_short_number": 1,
    "created_at": "2026-10-28T11:49:54.247231Z",
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

`GET /api/rider/v1/orders/6ba2476d-503e-4d0c-b56c-da5a3bf7844c/tip` → **200**

```json
{
  "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
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
  "available_until": "2026-10-29T11:51:30.672795Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6ba2476d-503e-4d0c-b56c-da5a3bf7844c/tip` → **201**

```json
{
  "command_id": "4d404e54-c5db-480d-8d73-3d98085a806f",
  "amount_minor": 1100
}
```

```json
{
  "id": "9a039841-1209-43ed-b440-51fa597c26d5",
  "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T11:51:35.637976Z"
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
  "session_id": "867d1bc9-1acf-4dbf-ae29-b63a0fb2cb15",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxOTYsImlhdCI6MTc5MzE4ODI5NiwianRpIjoiZGE4NzNiNmItNWRiNC00MzJmLWI1MWItZDFkY2MyOTYyNGRhIiwic2lkIjoiODY3ZDFiYzktMWFjZi00ZGJmLWFlMjktYjYzYTBmYjJjYjE1In0.qoeuL7R4va2fXsu0Aqc7lq3g2X0QOWOPyGjqjlaXgFw",
  "access_expires_at": "2026-10-28T12:06:36.222220787Z",
  "refresh_token": "K7ds3424l0y7VgEOQs1Jv7G21nsspkDCX2UDAMd0UyQ",
  "refresh_expires_at": "2026-10-28T23:51:36.221391701Z",
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
          "RIDER": 2,
          "DRIVER": 1,
          "STAFF": 1
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
      "RIDER": 2,
      "DRIVER": 1,
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
  "generated_at": "2026-10-28T11:51:36.498101479Z"
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
  "generated_at": "2026-10-28T11:51:36.790959445Z"
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
  "session_id": "76678263-c99a-421a-89a8-2aaa289437c5",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxOTcsImlhdCI6MTc5MzE4ODI5NywianRpIjoiZTVhMWM1MjktNGVkZS00MGE0LWJmOTktZWIxZWU4MTc5NzJiIiwic2lkIjoiNzY2NzgyNjMtYzk5YS00MjFhLTg5YTgtMmFhYTI4OTQzN2M1In0.m---p-hkgramtF6yPzJy7WXTmtgGNJ41e97QkHI8FcE",
  "access_expires_at": "2026-10-28T12:06:37.372462231Z",
  "refresh_token": "DT5f5UUn1zFXysiF_hkSaF_mX0v13imAsn36yMd0Mbk",
  "refresh_expires_at": "2026-10-28T23:51:37.371730905Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6ba2476d-503e-4d0c-b56c-da5a3bf7844c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T11:51:25.962925Z",
      "actor": {
        "type": "CLIENT",
        "id": "c5e40a5b-7f2a-411f-abc3-ccdbe3131e5c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
        "quote_id": "a6f003f1-e584-449e-a6a3-5307490f93fc",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "a17abed4-1cf5-477d-b07b-5e086265e7c4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T11:51:25.965031Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
        "attempt_id": "91b2c59e-e23b-4ae5-b9f2-37ad7e1c0c60",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a17abed4-1cf5-477d-b07b-5e086265e7c4"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T11:51:25.972886Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3e8cf443-f715-4088-8c11-9f1b699332b1",
        "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "a17abed4-1cf5-477d-b07b-5e086265e7c4"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T11:51:26.533939Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3e8cf443-f715-4088-8c11-9f1b699332b1",
        "order_id": "6ba2476d-503e-4d0c-b56c-da5a3bf7844c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d7d5abbf-eea2-4b6f-ae91-8a49f6fc2c05"
      },
      "correlation_id": "d260f888-5dcc-4f34-b0ae-808959603e8f"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T11:51:37.924895472Z",
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
      "last_location_at": "2026-10-28T11:51:30.386513Z",
      "order_id": null
    }
  ]
}
```

Done: order 6ba2476d-503e-4d0c-b56c-da5a3bf7844c.

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
  "session_id": "4d7987f7-6964-441f-aed8-e0d1a6f01c9e",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxOTgsImlhdCI6MTc5MzE4ODI5OCwianRpIjoiMmU4NmU5YjEtNmEzNy00MmE4LTk0YjctODkxYTE3NmIwODIzIiwic2lkIjoiNGQ3OTg3ZjctNjk2NC00NDFmLWFlZDgtZTBkMWE2ZjAxYzllIn0.Eg10qSiBzc2I0am56E2Xefje64qdccGk54vtsgYIj3Y",
  "access_expires_at": "2026-10-28T12:06:38.520409128Z",
  "refresh_token": "tYIHtzapu3c78HmHARcenoeMjZGuiadfJWKlj9IJV0A",
  "refresh_expires_at": "2026-10-28T23:51:38.519764925Z",
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
  "command_id": "700f7f31-49f8-476d-8a40-f229531f30d3",
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
  "timestamp": "2026-10-28T11:51:39.000+0000",
  "channel": {
    "id": "1730052000.229426963",
    "linkedid": "1730052000.229426963",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673875174"
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
  "timestamp": "2026-10-28T11:51:39.000+0000",
  "channel": {
    "id": "1730052000.229426963",
    "linkedid": "1730052000.229426963",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673875174"
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
  "session_id": "1ee71307-226b-46b7-a31e-1f2f9c882a09",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkxOTksImlhdCI6MTc5MzE4ODI5OSwianRpIjoiNDk5M2NkMTItNjY3Ni00Njg2LTkwYzktZWFkYzhmOTI0OGYxIiwic2lkIjoiMWVlNzEzMDctMjI2Yi00NmI3LWEzMWUtMWYyZjljODgyYTA5In0.53jDrue9nAxdpfc75v7e6vv0B8kbp4Oo6VBz0RieaD8",
  "access_expires_at": "2026-10-28T12:06:39.698426807Z",
  "refresh_token": "xV9j9RM8p33kOBv20kpkTFoZX2Pl5eAZsaRXIqhRS28",
  "refresh_expires_at": "2026-10-28T23:51:39.697762406Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "89331b4b-e6da-4e1b-9b54-14e94901d707",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673875174",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T11:51:39Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/89331b4b-e6da-4e1b-9b54-14e94901d707/answer` → **200**

```json
{
  "command_id": "b8193d09-40ee-438b-b3c2-3761094d6325"
}
```

```json
{
  "id": "89331b4b-e6da-4e1b-9b54-14e94901d707",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673875174",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "order_ids": [],
  "started_at": "2026-10-28T11:51:39Z",
  "answered_at": "2026-10-28T11:51:40.270021Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.229426963",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b959126a-4fef-4265-be41-99f236560a3f",
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
  "id": "c0e102a4-7fd7-44f3-8081-019be1d1f68e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:56:40.597962Z",
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
  "command_id": "64e6f671-4df0-4402-bf64-3d8ccf943597",
  "quote_id": "c0e102a4-7fd7-44f3-8081-019be1d1f68e",
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
    "phone": "+380673875174"
  },
  "call_id": "89331b4b-e6da-4e1b-9b54-14e94901d707"
}
```

```json
{
  "id": "57462371-3520-43be-bf85-95fd5a8e920e",
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
  "created_at": "2026-10-28T11:51:40.9108Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673875174"
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
    "id": "1730052000.229426963",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "89331b4b-e6da-4e1b-9b54-14e94901d707",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673875174",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_ids": [
        "57462371-3520-43be-bf85-95fd5a8e920e"
      ],
      "started_at": "2026-10-28T11:51:39Z",
      "answered_at": "2026-10-28T11:51:40.270021Z",
      "ended_at": "2026-10-28T11:51:41.220822Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "fb492374-3a3b-442d-b0a7-6c43756183e8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674816211",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_ids": [],
      "started_at": "2026-10-28T11:50:02.299203Z",
      "answered_at": "2026-10-28T11:50:02.613272Z",
      "ended_at": "2026-10-28T11:50:02.924992Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T11:50:10.889504Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/57462371-3520-43be-bf85-95fd5a8e920e` → **200**

```json
{
  "id": "57462371-3520-43be-bf85-95fd5a8e920e",
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
  "created_at": "2026-10-28T11:51:40.9108Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673875174"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/57462371-3520-43be-bf85-95fd5a8e920e` → **200**

```json
{
  "id": "57462371-3520-43be-bf85-95fd5a8e920e",
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
  "created_at": "2026-10-28T11:51:40.9108Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673875174"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/57462371-3520-43be-bf85-95fd5a8e920e/cancel` → **200**

```json
{
  "command_id": "4390e2fd-ea77-4e81-94ed-58629893b6f6",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "57462371-3520-43be-bf85-95fd5a8e920e",
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
  "created_at": "2026-10-28T11:51:40.9108Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673875174"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 89331b4b-e6da-4e1b-9b54-14e94901d707 with order 57462371-3520-43be-bf85-95fd5a8e920e.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24231"
}
```

```json
{
  "challenge_id": "921dabed-7b8a-4490-b232-ae844e9b542a",
  "expires_at": "2026-10-28T11:56:42.497286697Z",
  "resend_available_at": "2026-10-28T11:51:43.497286697Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "741844",
  "sent_at": "2026-10-28T11:51:42.499840487Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "921dabed-7b8a-4490-b232-ae844e9b542a",
  "code": "741844",
  "device_ref": "sandbox-24231"
}
```

```json
{
  "session_id": "7203d126-37df-462d-b29e-881ea8f55242",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTIwMiwiaWF0IjoxNzkzMTg4MzAyLCJqdGkiOiIxYWE3OTQxMy04NTI3LTRiZDgtYjVhYi0zMzNiYTFmYmEzYjMiLCJzaWQiOiI3MjAzZDEyNi0zN2RmLTQ2MmQtYjI5ZS04ODFlYThmNTUyNDIifQ.gj1Rku6miaXu5wgDYP6qigLQz1iTili_cMlGcdWadEE",
  "access_expires_at": "2026-10-28T12:06:42.805280387Z",
  "refresh_token": "YeRI69YxXa2WQ0AEaBpf82QuQwtbt3ompvoeVIB1qRw",
  "refresh_expires_at": "2026-11-27T11:51:42.804610745Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:51:30.386513Z",
  "last_location_at": "2026-10-28T11:51:30.386513Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8fb0ca8f-771a-49dd-8086-774f7972ec1f/handover` → **200**

```json
{
  "command_id": "a14fc5d9-92ed-4828-8db4-962e650242bc",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:51:30.386513Z",
  "last_location_at": "2026-10-28T11:51:30.386513Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8fb0ca8f-771a-49dd-8086-774f7972ec1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:51:43Z",
    "sequence": 1793188303636
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:51:43.656172Z",
  "last_location_at": "2026-10-28T11:51:43.656172Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667471056",
  "device_ref": "sandbox-14592"
}
```

```json
{
  "challenge_id": "d1a2380d-e7f4-472e-af3b-70a33d630875",
  "expires_at": "2026-10-28T11:56:43.934540798Z",
  "resend_available_at": "2026-10-28T11:51:44.934540798Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667471056` → **200**

```json
{
  "phone": "+380667471056",
  "audience": "CLIENT",
  "code": "741316",
  "sent_at": "2026-10-28T11:51:43.936770601Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1a2380d-e7f4-472e-af3b-70a33d630875",
  "code": "741316",
  "device_ref": "sandbox-14592"
}
```

```json
{
  "session_id": "6cdd9849-9185-4232-956d-3dc34433b3c3",
  "subject": {
    "type": "CLIENT",
    "id": "66865975-24fd-4ba0-8ddc-698b9c01ca01"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Njg2NTk3NS0yNGZkLTRiYTAtOGRkYy02OThiOWMwMWNhMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MjA0LCJpYXQiOjE3OTMxODgzMDQsImp0aSI6ImJhMzM4ZjlkLTY5YmUtNDllYS04ZDZiLTA0NGE2NThiOGU4MiIsInNpZCI6IjZjZGQ5ODQ5LTkxODUtNDIzMi05NTZkLTNkYzM0NDMzYjNjMyJ9.pRcLXf0gVm6Nt5KNGlbLse9EJalEPue3NK86WmDAibk",
  "access_expires_at": "2026-10-28T12:06:44.235235747Z",
  "refresh_token": "J_7S1fhhKvScDgT4zwAQE0m1XPD9W7eHtCfXWiayFac",
  "refresh_expires_at": "2026-11-27T11:51:44.234572593Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6f4a64fc-42f9-458a-814c-de99a555f62e",
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
  "id": "792bed81-1a2d-42cc-87d0-241e06760af8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:56:44.516777Z",
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
  "command_id": "08d0bf0a-3ef7-4972-b383-2099372ef98a",
  "quote_id": "792bed81-1a2d-42cc-87d0-241e06760af8",
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
  "id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "66865975-24fd-4ba0-8ddc-698b9c01ca01",
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
  "created_at": "2026-10-28T11:51:44.80034Z",
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
    "id": "f51007db-9b5b-4f8d-9d68-e751a4b2df57",
    "order_id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
    "expires_at": "2026-10-28T11:51:59.803726Z",
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

`POST /api/driver/v1/offers/f51007db-9b5b-4f8d-9d68-e751a4b2df57/accept` → **200**

```json
{
  "command_id": "e591c9e6-b951-4a10-a0fa-f19b1ae12f0d"
}
```

```json
{
  "id": "22114043-e13a-40cc-b727-6f016bb57507",
  "order_id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dc3fb967-f0a8-488e-8e82-f793024a4293",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dc3fb967-f0a8-488e-8e82-f793024a4293",
  "order_id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
  "assignment_id": "22114043-e13a-40cc-b727-6f016bb57507",
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

`POST /api/driver/v1/work-sessions/8fb0ca8f-771a-49dd-8086-774f7972ec1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:51:45Z",
    "sequence": 1793188305926
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:51:45.946871Z",
  "last_location_at": "2026-10-28T11:51:45.946871Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dc3fb967-f0a8-488e-8e82-f793024a4293/arrive` → **200**

```json
{
  "command_id": "da5fcc83-fd5b-4810-bd58-b4fc76736bc0",
  "expected_version": 0
}
```

```json
{
  "id": "dc3fb967-f0a8-488e-8e82-f793024a4293",
  "order_id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
  "assignment_id": "22114043-e13a-40cc-b727-6f016bb57507",
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
  "arrived_at": "2026-10-28T11:51:46.233625Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dc3fb967-f0a8-488e-8e82-f793024a4293/start` → **200**

```json
{
  "command_id": "2796d38c-a261-44ca-96c3-fdf273cad097",
  "expected_version": 1
}
```

```json
{
  "id": "dc3fb967-f0a8-488e-8e82-f793024a4293",
  "order_id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
  "assignment_id": "22114043-e13a-40cc-b727-6f016bb57507",
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
  "arrived_at": "2026-10-28T11:51:46.233625Z",
  "started_at": "2026-10-28T11:51:46.519223Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/8fb0ca8f-771a-49dd-8086-774f7972ec1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:51:46Z",
    "sequence": 1793188306800
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:51:46.820999Z",
  "last_location_at": "2026-10-28T11:51:46.820999Z",
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
  "device_ref": "sandbox-13438"
}
```

```json
{
  "challenge_id": "6d829707-b764-40d4-8216-5c53c3bf4a0c",
  "expires_at": "2026-10-28T11:56:47.103155406Z",
  "resend_available_at": "2026-10-28T11:51:48.103155406Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "671406",
  "sent_at": "2026-10-28T11:51:47.106205449Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d829707-b764-40d4-8216-5c53c3bf4a0c",
  "code": "671406",
  "device_ref": "sandbox-13438"
}
```

```json
{
  "session_id": "42528446-2d5d-44c3-bfc8-21db1c47c8af",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTIwNywiaWF0IjoxNzkzMTg4MzA3LCJqdGkiOiJjZjkwYmFhOS05NmYzLTQ0YWItODhjOC1mMzI2NWUxYWI2YTIiLCJzaWQiOiI0MjUyODQ0Ni0yZDVkLTQ0YzMtYmZjOC0yMWRiMWM0N2M4YWYifQ.FGR4cXpJR-V2UUewAiqnDUfGeUxPV_IQbkuXe-1VYgU",
  "access_expires_at": "2026-10-28T12:06:47.411516731Z",
  "refresh_token": "eExH8Yk7Yljx2C0CpP5auncwqTM4tjPaoOSjhTqLOus",
  "refresh_expires_at": "2026-11-27T11:51:47.410918273Z",
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
  "command_id": "452d4d55-12df-42dd-9321-84c9c5963864",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:51:47Z",
    "sequence": 1793188307957
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5895ae59-4630-411d-9952-681806f0495e",
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
  "last_heartbeat_at": "2026-10-28T11:51:47.978883Z",
  "last_location_at": "2026-10-28T11:51:47.978883Z",
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
  "session_id": "0b6b9a74-a417-47d0-9fd7-d81218fe7f73",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyMDgsImlhdCI6MTc5MzE4ODMwOCwianRpIjoiMGJmNDc1OTAtMmQ1OC00MTlhLTk2NjQtN2MzMDMyNDczYzFmIiwic2lkIjoiMGI2YjlhNzQtYTQxNy00N2QwLTlmZDctZDgxMjE4ZmU3ZjczIn0.fv510HZfZqCbfrMsiek5lG6PXVV6hhn5qlXK_RJMMac",
  "access_expires_at": "2026-10-28T12:06:48.558735888Z",
  "refresh_token": "qSEzB1nzkItivimxWsm0HUL-iQH1az6FJuGVzt7HOhc",
  "refresh_expires_at": "2026-10-28T23:51:48.558056942Z",
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
  "session_id": "9a70d6f0-1c0c-4c42-bd71-f0bfe97a1c13",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyMDksImlhdCI6MTc5MzE4ODMwOSwianRpIjoiOGM5NjgwNjMtNTdiNC00YmNkLWJmY2QtY2EzMmI1ZGZmZWIwIiwic2lkIjoiOWE3MGQ2ZjAtMWMwYy00YzQyLWJkNzEtZjBiZmU5N2ExYzEzIn0.Hul0hpROxQotwuxkS7ae4paiOMMlgvbxudvBjZRpfE8",
  "access_expires_at": "2026-10-28T12:06:49.137366169Z",
  "refresh_token": "LHAYok4-ULAUxkQDnbqCU4_oWKYDfQ974WLtC6xO4Ng",
  "refresh_expires_at": "2026-10-28T23:51:49.136696478Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/138669dd-3027-485f-9e5c-2ba52dc274a0` → **200**

```json
{
  "id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "66865975-24fd-4ba0-8ddc-698b9c01ca01",
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
    "id": "22114043-e13a-40cc-b727-6f016bb57507",
    "order_id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "dc3fb967-f0a8-488e-8e82-f793024a4293",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T11:51:44.80034Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/138669dd-3027-485f-9e5c-2ba52dc274a0/interrupt` → **200**

```json
{
  "command_id": "d5927aab-a61f-4595-9d70-5754721491df",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "66865975-24fd-4ba0-8ddc-698b9c01ca01",
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
      "id": "22114043-e13a-40cc-b727-6f016bb57507",
      "order_id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "dc3fb967-f0a8-488e-8e82-f793024a4293",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T11:51:44.80034Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "a36936f2-c571-402f-8330-b2def3977372",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "66865975-24fd-4ba0-8ddc-698b9c01ca01",
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
    "id": "e81c4b58-a1c4-4093-97c9-f153f3b27790",
    "order_id": "a36936f2-c571-402f-8330-b2def3977372",
    "expires_at": "2026-10-28T11:52:04.739827Z",
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

`POST /api/driver/v1/offers/e81c4b58-a1c4-4093-97c9-f153f3b27790/accept` → **200**

```json
{
  "command_id": "7cf0da2d-2666-4304-8c59-ce7be44c3a38"
}
```

```json
{
  "id": "3df8a04e-d227-41ca-ad22-7087696afd5d",
  "order_id": "a36936f2-c571-402f-8330-b2def3977372",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "89ea751e-b117-4c7c-9683-8f08d4cb0881",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "89ea751e-b117-4c7c-9683-8f08d4cb0881",
  "order_id": "a36936f2-c571-402f-8330-b2def3977372",
  "assignment_id": "3df8a04e-d227-41ca-ad22-7087696afd5d",
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
  "session_id": "5895ae59-4630-411d-9952-681806f0495e",
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
  "last_heartbeat_at": "2026-10-28T11:51:47.978883Z",
  "last_location_at": "2026-10-28T11:51:47.978883Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/5895ae59-4630-411d-9952-681806f0495e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:51:51Z",
    "sequence": 1793188311191
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5895ae59-4630-411d-9952-681806f0495e",
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
  "last_heartbeat_at": "2026-10-28T11:51:51.211086Z",
  "last_location_at": "2026-10-28T11:51:51.211086Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/89ea751e-b117-4c7c-9683-8f08d4cb0881/arrive` → **200**

```json
{
  "command_id": "499eb850-9d69-4198-80bf-90c0f2d8b2c7",
  "expected_version": 0
}
```

```json
{
  "id": "89ea751e-b117-4c7c-9683-8f08d4cb0881",
  "order_id": "a36936f2-c571-402f-8330-b2def3977372",
  "assignment_id": "3df8a04e-d227-41ca-ad22-7087696afd5d",
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
  "arrived_at": "2026-10-28T11:51:51.493717Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/89ea751e-b117-4c7c-9683-8f08d4cb0881/start` → **200**

```json
{
  "command_id": "36f2269e-bca1-4e81-8b9e-2288e5130fd7",
  "expected_version": 1
}
```

```json
{
  "id": "89ea751e-b117-4c7c-9683-8f08d4cb0881",
  "order_id": "a36936f2-c571-402f-8330-b2def3977372",
  "assignment_id": "3df8a04e-d227-41ca-ad22-7087696afd5d",
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
  "arrived_at": "2026-10-28T11:51:51.493717Z",
  "started_at": "2026-10-28T11:51:51.781036Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/89ea751e-b117-4c7c-9683-8f08d4cb0881/complete` → **200**

```json
{
  "command_id": "3a1119e5-5f61-4c56-a6e6-dbfd53649187",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:51:52Z"
}
```

```json
{
  "id": "89ea751e-b117-4c7c-9683-8f08d4cb0881",
  "order_id": "a36936f2-c571-402f-8330-b2def3977372",
  "assignment_id": "3df8a04e-d227-41ca-ad22-7087696afd5d",
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
  "arrived_at": "2026-10-28T11:51:51.493717Z",
  "started_at": "2026-10-28T11:51:51.781036Z",
  "completed_at": "2026-10-28T11:51:52.070838Z",
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
    "id": "a36936f2-c571-402f-8330-b2def3977372",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T11:51:49.729011Z",
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
    "id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T11:51:44.80034Z",
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
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
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

`GET /api/operator/v1/orders/138669dd-3027-485f-9e5c-2ba52dc274a0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T11:51:44.801041Z",
      "actor": {
        "type": "CLIENT",
        "id": "66865975-24fd-4ba0-8ddc-698b9c01ca01",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
        "quote_id": "792bed81-1a2d-42cc-87d0-241e06760af8",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "f4fa9ddb-446e-4395-9218-453054110288"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T11:51:44.802916Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
        "attempt_id": "f73490bb-42c6-4991-9671-61fce44eb772",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f4fa9ddb-446e-4395-9218-453054110288"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T11:51:44.810121Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f51007db-9b5b-4f8d-9d68-e751a4b2df57",
        "order_id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "f4fa9ddb-446e-4395-9218-453054110288"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T11:51:45.364249Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f51007db-9b5b-4f8d-9d68-e751a4b2df57",
        "order_id": "138669dd-3027-485f-9e5c-2ba52dc274a0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "22114043-e13a-40cc-b727-6f016bb57507"
      },
      "correlation_id": "aefecc55-9fa5-4f2e-9fc6-e186a81d4646"
```

Done: interrupted 138669dd-3027-485f-9e5c-2ba52dc274a0, follow-up a36936f2-c571-402f-8330-b2def3977372.

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
  "session_id": "85fb9a7a-ff1c-4c91-87dc-6cc3caa155db",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyMTYsImlhdCI6MTc5MzE4ODMxNiwianRpIjoiNGYyMGYyNmMtMDBkNS00YjExLThjZjctNTM3NTljZTRjNDNhIiwic2lkIjoiODVmYjlhN2EtZmYxYy00YzkxLTg3ZGMtNmNjM2NhYTE1NWRiIn0.7RcitZWIfri6pXz3muOALoKCuKBFZ7hBoQhS3pUSI0E",
  "access_expires_at": "2026-10-28T12:06:56.519766395Z",
  "refresh_token": "j_0SPOpeNgm5TgfsmVXfcJnLo_okohtQ7Ri3kV4ewtQ",
  "refresh_expires_at": "2026-10-28T23:51:56.519189959Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "df1e008e-aea9-4849-b1e7-c485b3bf10ab",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T11:51:56Z"
}
```

```json
{
  "id": "f415aefc-ab6c-4f5a-93b3-59f3ec68696c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T11:51:56Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/f415aefc-ab6c-4f5a-93b3-59f3ec68696c/publish` → **200**

```json
{
  "command_id": "6006f4b2-b494-4592-a292-908999403576",
  "expected_version": 0
}
```

```json
{
  "id": "f415aefc-ab6c-4f5a-93b3-59f3ec68696c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T11:51:57.098026Z",
  "published_at": "2026-10-28T11:51:57.098026Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "f415aefc-ab6c-4f5a-93b3-59f3ec68696c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T11:51:57.098026Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632363949",
  "device_ref": "sandbox-18227"
}
```

```json
{
  "challenge_id": "47576066-3f04-4a08-8043-95e5070070a9",
  "expires_at": "2026-10-28T11:56:57.651203554Z",
  "resend_available_at": "2026-10-28T11:51:58.651203554Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632363949` → **200**

```json
{
  "phone": "+380632363949",
  "audience": "CLIENT",
  "code": "220355",
  "sent_at": "2026-10-28T11:51:57.654411876Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47576066-3f04-4a08-8043-95e5070070a9",
  "code": "220355",
  "device_ref": "sandbox-18227"
}
```

```json
{
  "session_id": "c12ccd00-cf42-4e31-ac9e-05b78913463d",
  "subject": {
    "type": "CLIENT",
    "id": "92e89877-247d-48a8-982d-89b916956242"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MmU4OTg3Ny0yNDdkLTQ4YTgtOTgyZC04OWI5MTY5NTYyNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MjE3LCJpYXQiOjE3OTMxODgzMTcsImp0aSI6ImZkYWU4MGI3LTEyMjgtNGE4MS1hZDJmLTZhYzA5YmNlZTNmYiIsInNpZCI6ImMxMmNjZDAwLWNmNDItNGUzMS1hYzllLTA1Yjc4OTEzNDYzZCJ9.0nCoYx8pP89dSOGyTGty165CvdsZT3PmwNAMCtVt2N0",
  "access_expires_at": "2026-10-28T12:06:57.950874326Z",
  "refresh_token": "h2bhD1XitzxUmGDy1bw7uc_euWBG0UY6CPTeo7oBaOo",
  "refresh_expires_at": "2026-11-27T11:51:57.95018042Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "f415aefc-ab6c-4f5a-93b3-59f3ec68696c",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T11:51:57.098026Z",
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
  "command_id": "e47ffc99-adf1-49cc-8c64-0a7694a81bbd",
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
  "id": "df32e0da-77b5-4d5c-93ae-fffea50ecfd0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:56:58.511094Z",
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
  "command_id": "b3fcba16-a57c-4d6c-9f20-31707587b2f0",
  "quote_id": "df32e0da-77b5-4d5c-93ae-fffea50ecfd0",
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
  "correlation_id": "8de7e541-b52a-4af0-a904-c3479171642c"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "ae845955-b7ef-4a95-b2d5-e13dfd346e68",
  "version_id": "f415aefc-ab6c-4f5a-93b3-59f3ec68696c",
  "language": "uk"
}
```

```json
{
  "version_id": "f415aefc-ab6c-4f5a-93b3-59f3ec68696c",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T11:51:59.083159Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fdf41041-08c2-4487-bb8d-29e391aa92eb",
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
  "id": "12ac39f9-3935-43d9-96e6-e2de1c68360b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:56:59.359675Z",
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
  "command_id": "3db0f913-0882-498c-a374-06cab151898f",
  "quote_id": "12ac39f9-3935-43d9-96e6-e2de1c68360b",
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
  "id": "7331a0af-2e7b-4626-939f-ba0a286002c6",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "92e89877-247d-48a8-982d-89b916956242",
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
  "created_at": "2026-10-28T11:51:59.648458Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/7331a0af-2e7b-4626-939f-ba0a286002c6` → **200**

```json
{
  "id": "7331a0af-2e7b-4626-939f-ba0a286002c6",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "92e89877-247d-48a8-982d-89b916956242",
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
  "created_at": "2026-10-28T11:51:59.648458Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/7331a0af-2e7b-4626-939f-ba0a286002c6/cancel` → **200**

```json
{
  "command_id": "37bd2081-cea1-416a-93bf-4ef313a2f842",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7331a0af-2e7b-4626-939f-ba0a286002c6",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "92e89877-247d-48a8-982d-89b916956242",
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
  "created_at": "2026-10-28T11:51:59.648458Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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

`POST /api/admin/v1/legal-documents/f415aefc-ab6c-4f5a-93b3-59f3ec68696c` → **409**

```json
{
  "command_id": "b15c2e5f-915e-4269-a383-451e39caa595",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T11:52:00Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/f415aefc-ab6c-4f5a-93b3-59f3ec68696c",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d8235e8d-58cb-4116-85e7-e69391041e56"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "1bd4d992-c355-4b2e-959a-96a3691679ad",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T11:52:00Z"
}
```

```json
{
  "id": "371dfc15-a876-4bcf-bd8d-eb34efecc0fa",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T11:52:00Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/371dfc15-a876-4bcf-bd8d-eb34efecc0fa/publish` → **200**

```json
{
  "command_id": "ad12f0ea-64a0-4c2f-9781-77affbf4e622",
  "expected_version": 0
}
```

```json
{
  "id": "371dfc15-a876-4bcf-bd8d-eb34efecc0fa",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T11:52:01.123578Z",
  "published_at": "2026-10-28T11:52:01.123578Z",
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
  "device_ref": "sandbox-2601"
}
```

```json
{
  "challenge_id": "e1e3228c-4a29-4c5e-bace-711979c7f321",
  "expires_at": "2026-10-28T11:57:01.404805474Z",
  "resend_available_at": "2026-10-28T11:52:02.404805474Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "136935",
  "sent_at": "2026-10-28T11:52:01.406968414Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1e3228c-4a29-4c5e-bace-711979c7f321",
  "code": "136935",
  "device_ref": "sandbox-2601"
}
```

```json
{
  "session_id": "a92ccfed-474d-46c3-a83f-77e51a320501",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTIyMSwiaWF0IjoxNzkzMTg4MzIxLCJqdGkiOiIzYjVjMzU3ZC1jNWZkLTQ0ZmItOTI2OC1lNDhhNDFiN2E2ODEiLCJzaWQiOiJhOTJjY2ZlZC00NzRkLTQ2YzMtYTgzZi03N2U1MWEzMjA1MDEifQ.sRhIlEI5L83zd4BBrfzJPlCmNkaJKLz8LCtxI-GMYtw",
  "access_expires_at": "2026-10-28T12:07:01.712078393Z",
  "refresh_token": "Bfj7VX1FC-ZSR5UZPZIv6zjy5Pye0oBludtpVQwfVXE",
  "refresh_expires_at": "2026-11-27T11:52:01.711515752Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5895ae59-4630-411d-9952-681806f0495e",
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
  "last_heartbeat_at": "2026-10-28T11:51:51.211086Z",
  "last_location_at": "2026-10-28T11:51:51.211086Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5895ae59-4630-411d-9952-681806f0495e/handover` → **200**

```json
{
  "command_id": "8379616f-6720-44c1-bd4e-000eeaa2c052",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5895ae59-4630-411d-9952-681806f0495e",
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
  "last_heartbeat_at": "2026-10-28T11:51:51.211086Z",
  "last_location_at": "2026-10-28T11:51:51.211086Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5895ae59-4630-411d-9952-681806f0495e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:52:02Z",
    "sequence": 1793188322534
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5895ae59-4630-411d-9952-681806f0495e",
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
  "last_heartbeat_at": "2026-10-28T11:52:02.553663Z",
  "last_location_at": "2026-10-28T11:52:02.553663Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672831348",
  "device_ref": "sandbox-21301"
}
```

```json
{
  "challenge_id": "6c6179c4-f9ef-4c86-9693-0ae3973b469c",
  "expires_at": "2026-10-28T11:57:02.82950335Z",
  "resend_available_at": "2026-10-28T11:52:03.82950335Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672831348` → **200**

```json
{
  "phone": "+380672831348",
  "audience": "CLIENT",
  "code": "192160",
  "sent_at": "2026-10-28T11:52:02.831957352Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c6179c4-f9ef-4c86-9693-0ae3973b469c",
  "code": "192160",
  "device_ref": "sandbox-21301"
}
```

```json
{
  "session_id": "00f1d9ec-a404-42db-9933-300dbb3474be",
  "subject": {
    "type": "CLIENT",
    "id": "3711e092-cab5-4e2f-ba25-65efd0ab8887"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzExZTA5Mi1jYWI1LTRlMmYtYmEyNS02NWVmZDBhYjg4ODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MjIzLCJpYXQiOjE3OTMxODgzMjMsImp0aSI6ImFiZDU4MGJhLWI2NTYtNDU3Ny1hNWZhLTY1ZmNhZmNlZDFhNSIsInNpZCI6IjAwZjFkOWVjLWE0MDQtNDJkYi05OTMzLTMwMGRiYjM0NzRiZSJ9.R5pSpH8M5yn5PZFiIFf8Yss9uxPY1ybbXRiwobFlRsU",
  "access_expires_at": "2026-10-28T12:07:03.132722604Z",
  "refresh_token": "f1UQ-Wy2UyB7QqHwNWSzr_2kEj01qS8aYNTT05MKDlg",
  "refresh_expires_at": "2026-11-27T11:52:03.132014562Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fa94ddab-a478-4372-802e-508049ba3af7",
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
  "id": "4383db4f-10f6-490b-a149-b503067f4af3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:57:03.421260Z",
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
  "command_id": "6a0da977-e234-4998-8b20-1b8aa3ac2dd8",
  "quote_id": "4383db4f-10f6-490b-a149-b503067f4af3",
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
    "phone": "+380675660570"
  }
}
```

```json
{
  "id": "7ac3a7c6-2648-4d89-94ea-915ee9d5c40b",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T11:52:03.713569Z",
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
    "id": "25c46d56-948e-4209-acfa-640b78db7563",
    "order_id": "7ac3a7c6-2648-4d89-94ea-915ee9d5c40b",
    "expires_at": "2026-10-28T11:52:18.717137Z",
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

`POST /api/driver/v1/offers/25c46d56-948e-4209-acfa-640b78db7563/accept` → **200**

```json
{
  "command_id": "8fbf4d59-f3d9-4e1c-9a76-256a17a57642"
}
```

```json
{
  "id": "03133c9f-2727-4ac1-8019-e3efabc18ced",
  "order_id": "7ac3a7c6-2648-4d89-94ea-915ee9d5c40b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2d933749-a3ea-4519-b2a6-6b9a939e0d57",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2d933749-a3ea-4519-b2a6-6b9a939e0d57",
  "order_id": "7ac3a7c6-2648-4d89-94ea-915ee9d5c40b",
  "assignment_id": "03133c9f-2727-4ac1-8019-e3efabc18ced",
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
    "phone": "+380675660570"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "39457105-fbfe-4da2-8fd9-ac0b5350ef47",
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
  "id": "e84c65d7-3156-40cf-8da7-4cea78f0d1c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:57:04.895733Z",
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
  "command_id": "6586617f-e945-424e-b947-2e1e8ebcf012",
  "quote_id": "e84c65d7-3156-40cf-8da7-4cea78f0d1c3",
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
  "id": "0475fe11-baf3-434c-b426-8c2980bc1d7e",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T11:52:05.18505Z",
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
  "command_id": "42e197e2-2d71-44d0-bee1-82b06300240f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T14:52:05Z"
}
```

```json
{
  "id": "0a2bee57-bde9-4422-b642-866c2053ab81",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:57:05.491428Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T14:52:05Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a449b984-635e-45aa-9552-2097afddd219",
  "quote_id": "0a2bee57-bde9-4422-b642-866c2053ab81",
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
  "pickup_at": "2026-10-28T14:52:05Z"
}
```

```json
{
  "id": "7cccf1a7-26d0-45b5-9d0a-d9ea220cb40d",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T11:52:05.778456Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T14:52:05Z",
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
  "command_id": "c836fce1-781d-4bdf-9fa6-db1853ba5d7e",
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
  "id": "596b19e6-59dc-4e23-9391-ee72daa64b31",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:57:06.102742Z",
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
  "command_id": "e15d7f40-d4a9-4f95-a47c-37fa998ea9f8",
  "quote_id": "596b19e6-59dc-4e23-9391-ee72daa64b31",
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
  "correlation_id": "546f6862-a666-4b1b-b62e-ed2f53e06e6a"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "7cccf1a7-26d0-45b5-9d0a-d9ea220cb40d",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T11:52:05.778456Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T14:52:05Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "0475fe11-baf3-434c-b426-8c2980bc1d7e",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T11:52:05.18505Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "7ac3a7c6-2648-4d89-94ea-915ee9d5c40b",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "0475fe11-baf3-434c-b426-8c2980bc1d7e",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T11:52:05.18505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/7ac3a7c6-2648-4d89-94ea-915ee9d5c40b` → **200**

```json
{
  "id": "7ac3a7c6-2648-4d89-94ea-915ee9d5c40b",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "03133c9f-2727-4ac1-8019-e3efabc18ced",
    "order_id": "7ac3a7c6-2648-4d89-94ea-915ee9d5c40b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2d933749-a3ea-4519-b2a6-6b9a939e0d57",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T11:52:03.713569Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/7ac3a7c6-2648-4d89-94ea-915ee9d5c40b/cancel` → **200**

```json
{
  "command_id": "07c46f02-448e-4e7b-bac1-ad0f4e9351d1",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7ac3a7c6-2648-4d89-94ea-915ee9d5c40b",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "03133c9f-2727-4ac1-8019-e3efabc18ced",
    "order_id": "7ac3a7c6-2648-4d89-94ea-915ee9d5c40b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2d933749-a3ea-4519-b2a6-6b9a939e0d57",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T11:52:03.713569Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/0475fe11-baf3-434c-b426-8c2980bc1d7e` → **200**

```json
{
  "id": "0475fe11-baf3-434c-b426-8c2980bc1d7e",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T11:52:05.18505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/0475fe11-baf3-434c-b426-8c2980bc1d7e/cancel` → **200**

```json
{
  "command_id": "8c850375-6bda-4410-b5ed-ab3ca96ab280",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0475fe11-baf3-434c-b426-8c2980bc1d7e",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T11:52:05.18505Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/7cccf1a7-26d0-45b5-9d0a-d9ea220cb40d` → **200**

```json
{
  "id": "7cccf1a7-26d0-45b5-9d0a-d9ea220cb40d",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T11:52:05.778456Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T14:52:05Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/7cccf1a7-26d0-45b5-9d0a-d9ea220cb40d/cancel` → **200**

```json
{
  "command_id": "5ecfdf63-3b25-46ab-89e5-bbd2f5dc5617",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7cccf1a7-26d0-45b5-9d0a-d9ea220cb40d",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "3711e092-cab5-4e2f-ba25-65efd0ab8887",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T11:52:05.778456Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-28T14:52:05Z",
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
  "session_id": "5895ae59-4630-411d-9952-681806f0495e",
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
  "last_heartbeat_at": "2026-10-28T11:52:02.553663Z",
  "last_location_at": "2026-10-28T11:52:02.553663Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5895ae59-4630-411d-9952-681806f0495e/close` → **200**

```json
{
  "command_id": "46b143e0-b6f7-4195-93bb-dd4fdd3846eb",
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

Done: orders 7ac3a7c6-2648-4d89-94ea-915ee9d5c40b, 0475fe11-baf3-434c-b426-8c2980bc1d7e, 7cccf1a7-26d0-45b5-9d0a-d9ea220cb40d.

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
  "session_id": "00002d21-1662-43d8-a14e-ab1ebd596ee0",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyMjksImlhdCI6MTc5MzE4ODMyOSwianRpIjoiMWIwMmZiYTItMTNlNC00MjFhLWE0NWEtZTgwMDM2YmJiMmVmIiwic2lkIjoiMDAwMDJkMjEtMTY2Mi00M2Q4LWExNGUtYWIxZWJkNTk2ZWUwIn0.CZgKrqquBaWQUlFJE7K-hTqUpcLthdh5Gyl1EzzGtig",
  "access_expires_at": "2026-10-28T12:07:09.864638764Z",
  "refresh_token": "lDbv6hGgKPfCg1yUyi8SoZayoA2AoT1IXEbhnNMJH-M",
  "refresh_expires_at": "2026-10-28T23:52:09.86404234Z",
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
  "session_id": "855be685-8aa0-4a7e-bb59-306c70388853",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyMzAsImlhdCI6MTc5MzE4ODMzMCwianRpIjoiNDlhNjI2Y2MtYzQ4Zi00ZDY3LThiYWYtMmMyZGNhNmU0M2IwIiwic2lkIjoiODU1YmU2ODUtOGFhMC00YTdlLWJiNTktMzA2YzcwMzg4ODUzIn0.qYhQmIcpjvUKuSVNbHbj1PataxHA3vSicSjr4jOrIH8",
  "access_expires_at": "2026-10-28T12:07:10.434747874Z",
  "refresh_token": "TkPyieozNv5Ly4JYWY1aEjEuPGLnGAqAlft00buy0z0",
  "refresh_expires_at": "2026-10-28T23:52:10.43410821Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25374"
}
```

```json
{
  "challenge_id": "fd52cee5-b28c-49cb-856a-ae5a5ed8bce3",
  "expires_at": "2026-10-28T11:57:10.710998592Z",
  "resend_available_at": "2026-10-28T11:52:11.710998592Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "941130",
  "sent_at": "2026-10-28T11:52:10.713574391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd52cee5-b28c-49cb-856a-ae5a5ed8bce3",
  "code": "941130",
  "device_ref": "sandbox-25374"
}
```

```json
{
  "session_id": "2898693e-2765-42ef-a72b-75650d181357",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTIzMSwiaWF0IjoxNzkzMTg4MzMxLCJqdGkiOiJiMGIxMTRhZi0wNTFlLTRjYzgtYjMzZS01MzViY2UzMmIyNDgiLCJzaWQiOiIyODk4NjkzZS0yNzY1LTQyZWYtYTcyYi03NTY1MGQxODEzNTcifQ.b4uZOce7mnwNo6S3N5kej2P9NTrFJe-wC9SANZ0yZM0",
  "access_expires_at": "2026-10-28T12:07:11.02224483Z",
  "refresh_token": "iwNcIQakl9PpxU3MJE4u3098Z0QYdItufHU3v-OFCGA",
  "refresh_expires_at": "2026-11-27T11:52:11.021564778Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:51:46.820999Z",
  "last_location_at": "2026-10-28T11:51:46.820999Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8fb0ca8f-771a-49dd-8086-774f7972ec1f/handover` → **200**

```json
{
  "command_id": "0ff5396d-5849-46c3-ad10-eb877e7e71b0",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:51:46.820999Z",
  "last_location_at": "2026-10-28T11:51:46.820999Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8fb0ca8f-771a-49dd-8086-774f7972ec1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:52:11Z",
    "sequence": 1793188331875
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:52:11.896226Z",
  "last_location_at": "2026-10-28T11:52:11.896226Z",
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
  "command_id": "3960e655-0ba6-4e84-94ab-fb63d5f185a6",
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
  "effective_at": "2026-10-28T11:52:12.472053Z",
  "changed_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T11:52:12.746666048Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "34d46e29-0fca-42bf-ac95-9109693a23fb",
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
  "id": "3a13283b-2302-48cd-8803-7433ea809e20",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:57:13.034858Z",
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
  "command_id": "f01357a6-9f65-4abe-bc64-f286025ef218",
  "quote_id": "3a13283b-2302-48cd-8803-7433ea809e20",
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
    "phone": "+380671110262"
  }
}
```

```json
{
  "id": "b6ff2522-7ca7-4c07-991e-7bb527d1b8d3",
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
  "created_at": "2026-10-28T11:52:13.339023Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110262"
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
    "id": "cd331308-dd9a-41a0-939d-435b29113d9c",
    "order_id": "b6ff2522-7ca7-4c07-991e-7bb527d1b8d3",
    "expires_at": "2026-10-28T11:52:28.343819Z",
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

`POST /api/driver/v1/offers/cd331308-dd9a-41a0-939d-435b29113d9c/accept` → **200**

```json
{
  "command_id": "1146dfcd-967c-4da1-9353-f055cef23c61"
}
```

```json
{
  "id": "1babf16d-d3dc-46c4-8e2b-972414802442",
  "order_id": "b6ff2522-7ca7-4c07-991e-7bb527d1b8d3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e3277161-799e-4f7e-80d0-496cdd22257a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e3277161-799e-4f7e-80d0-496cdd22257a",
  "order_id": "b6ff2522-7ca7-4c07-991e-7bb527d1b8d3",
  "assignment_id": "1babf16d-d3dc-46c4-8e2b-972414802442",
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
    "phone": "+380671110262"
  }
}
```

`POST /api/driver/v1/work-sessions/8fb0ca8f-771a-49dd-8086-774f7972ec1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:52:14Z",
    "sequence": 1793188334468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:52:14.487985Z",
  "last_location_at": "2026-10-28T11:52:14.487985Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e3277161-799e-4f7e-80d0-496cdd22257a/arrive` → **200**

```json
{
  "command_id": "a97bca4a-a7d2-4b3a-b98a-bf4aa5a0e253",
  "expected_version": 0
}
```

```json
{
  "id": "e3277161-799e-4f7e-80d0-496cdd22257a",
  "order_id": "b6ff2522-7ca7-4c07-991e-7bb527d1b8d3",
  "assignment_id": "1babf16d-d3dc-46c4-8e2b-972414802442",
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
  "arrived_at": "2026-10-28T11:52:14.777489Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671110262"
  }
}
```

`POST /api/driver/v1/trips/e3277161-799e-4f7e-80d0-496cdd22257a/start` → **200**

```json
{
  "command_id": "35f6a51b-05b8-4918-b4df-1749e61b9258",
  "expected_version": 1
}
```

```json
{
  "id": "e3277161-799e-4f7e-80d0-496cdd22257a",
  "order_id": "b6ff2522-7ca7-4c07-991e-7bb527d1b8d3",
  "assignment_id": "1babf16d-d3dc-46c4-8e2b-972414802442",
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
  "arrived_at": "2026-10-28T11:52:14.777489Z",
  "started_at": "2026-10-28T11:52:15.078087Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671110262"
  }
}
```

`POST /api/driver/v1/trips/e3277161-799e-4f7e-80d0-496cdd22257a/complete` → **200**

```json
{
  "command_id": "30bf1358-9931-4fa5-8a8b-e45368cf6a05",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:52:15Z",
  "cash_received": true
}
```

```json
{
  "id": "e3277161-799e-4f7e-80d0-496cdd22257a",
  "order_id": "b6ff2522-7ca7-4c07-991e-7bb527d1b8d3",
  "assignment_id": "1babf16d-d3dc-46c4-8e2b-972414802442",
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
  "arrived_at": "2026-10-28T11:52:14.777489Z",
  "started_at": "2026-10-28T11:52:15.078087Z",
  "completed_at": "2026-10-28T11:52:15.375883Z",
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
  "command_id": "c8b5b052-ccde-4839-823c-61ff7d7d9959",
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
  "id": "076b9940-8a7a-450c-904f-6e1c83bca91d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:57:15.669652Z",
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
  "command_id": "13c6b927-e46b-4e17-b894-ff2ca5b0aae0",
  "quote_id": "076b9940-8a7a-450c-904f-6e1c83bca91d",
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
    "phone": "+3806711114810"
  }
}
```

```json
{
  "id": "41220ed1-db75-40bc-b6e9-92b45c14083a",
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
  "created_at": "2026-10-28T11:52:15.980778Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114810"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/41220ed1-db75-40bc-b6e9-92b45c14083a` → **200**

```json
{
  "id": "41220ed1-db75-40bc-b6e9-92b45c14083a",
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
  "created_at": "2026-10-28T11:52:15.980778Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114810"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/41220ed1-db75-40bc-b6e9-92b45c14083a/cancel` → **200**

```json
{
  "command_id": "b3932780-3710-4765-bfe9-48db6f2a93f7",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "41220ed1-db75-40bc-b6e9-92b45c14083a",
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
  "created_at": "2026-10-28T11:52:15.980778Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114810"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
      "en": "Operator error"
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
  "staff_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T11:52:15.381281Z",
  "last_entries": [
    {
      "order_id": "41220ed1-db75-40bc-b6e9-92b45c14083a",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T11:52:16.601388Z"
    },
    {
      "order_id": "b6ff2522-7ca7-4c07-991e-7bb527d1b8d3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T11:52:15.381281Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fb0ca8f-771a-49dd-8086-774f7972ec1f",
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
  "last_heartbeat_at": "2026-10-28T11:52:14.487985Z",
  "last_location_at": "2026-10-28T11:52:14.487985Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8fb0ca8f-771a-49dd-8086-774f7972ec1f/close` → **200**

```json
{
  "command_id": "3fe46201-54cb-4547-86aa-6a07dbea74b8",
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

Done: operator bonus for fulfilled b6ff2522-7ca7-4c07-991e-7bb527d1b8d3 and operator-fault cancellation 41220ed1-db75-40bc-b6e9-92b45c14083a.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678369417",
  "device_ref": "sandbox-22490"
}
```

```json
{
  "challenge_id": "e87ac97c-9e18-4a85-95a4-ecb13fc0db5c",
  "expires_at": "2026-10-28T11:57:19.769539219Z",
  "resend_available_at": "2026-10-28T11:52:20.769539219Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678369417` → **200**

```json
{
  "phone": "+380678369417",
  "audience": "CLIENT",
  "code": "717779",
  "sent_at": "2026-10-28T11:52:19.771868125Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679045517",
  "device_ref": "sandbox-29275",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "79a78258-3d8e-4cd6-b68b-d9e5bb092d0f",
  "expires_at": "2026-10-28T11:57:20.06946032Z",
  "resend_available_at": "2026-10-28T11:52:21.06946032Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679045517` → **200**

```json
{
  "phone": "+380679045517",
  "audience": "CLIENT",
  "code": "393811",
  "sent_at": "2026-10-28T11:52:20.072239138Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677100000",
  "device_ref": "sandbox-4575"
}
```

```json
{
  "challenge_id": "fa6c91e1-5039-4a3c-b24d-b4b92d9823d2",
  "expires_at": "2026-10-28T11:57:20.374216473Z",
  "resend_available_at": "2026-10-28T11:52:21.374216473Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677100000` → **200**

```json
{
  "phone": "+380677100000",
  "audience": "CLIENT",
  "code": "788525",
  "sent_at": "2026-10-28T11:52:20.377370567Z",
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
  "session_id": "0137d0a4-3f0b-4655-b8a9-21dce4e96f91",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyNDAsImlhdCI6MTc5MzE4ODM0MCwianRpIjoiYTZhYzQ4MmEtM2Y0OC00NjE1LTk2YTAtYjFmNmM2Y2UzMjI2Iiwic2lkIjoiMDEzN2QwYTQtM2YwYi00NjU1LWI4YTktMjFkY2U0ZTk2ZjkxIn0.Nr_hfYmq7WOJYGUpWIwyeAMnZo8WU9isegLxAwtO1Yc",
  "access_expires_at": "2026-10-28T12:07:20.966543283Z",
  "refresh_token": "gpu3mtm8hWKjNsCAM_zi6gR2Xje2K7rF1gwo0ksksJE",
  "refresh_expires_at": "2026-10-28T23:52:20.965938434Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677100000` → **200**

```json
{
  "deliveries": [
    {
      "id": "7f27ce78-7561-40d6-a574-cdb9e3b69835",
      "challenge_id": "fa6c91e1-5039-4a3c-b24d-b4b92d9823d2",
      "phone": "+380677100000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ab82cf4d-d20f-450a-94ec-973e4b7408e9",
      "error": null,
      "attempted_at": "2026-10-28T11:52:20.377634Z"
    },
    {
      "id": "fec18db2-0c04-4756-a9af-56acaeedab6b",
      "challenge_id": "fa6c91e1-5039-4a3c-b24d-b4b92d9823d2",
      "phone": "+380677100000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T11:52:20.376908Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677100000` → **200**

```json
{
  "phone": "+380677100000",
  "audience": "CLIENT",
  "code": "788525",
  "sent_at": "2026-10-28T11:52:20.377370567Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679045517` → **200**

```json
{
  "deliveries": [
    {
      "id": "8096a1d2-5385-402d-9331-6dc63e8eb8aa",
      "challenge_id": "79a78258-3d8e-4cd6-b68b-d9e5bb092d0f",
      "phone": "+380679045517",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-051c25a5-ca68-4abe-889f-713ad25e605e",
      "error": null,
      "attempted_at": "2026-10-28T11:52:20.072547Z"
    }
  ]
}
```

Done: SMS to +380678369417, a call to +380679045517, SMS then a call to +380677100000.

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
  "session_id": "a066fc2d-5767-4d11-97f7-210510dbc140",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyNDIsImlhdCI6MTc5MzE4ODM0MiwianRpIjoiNWJkZjY4YjYtNDhmNi00N2ZjLThlMjUtMTkwMTFjMjU3YzUxIiwic2lkIjoiYTA2NmZjMmQtNTc2Ny00ZDExLTk3ZjctMjEwNTEwZGJjMTQwIn0.VsLUw25oAHz2YdHx5GNM2isdsxL1ZkCgvRGQh4Dvvsg",
  "access_expires_at": "2026-10-28T12:07:22.147597979Z",
  "refresh_token": "bPTF76OZ1lYar2WWDsAuDuPk_Xxm7DmQUhjRliwfkl4",
  "refresh_expires_at": "2026-10-28T23:52:22.147055716Z",
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
  "session_id": "3d4e2177-75b6-49e2-86fb-5e13bd61d4f0",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyNDIsImlhdCI6MTc5MzE4ODM0MiwianRpIjoiNmUxNGMxNjUtMjI4ZC00NjM4LTljZjctMTI2NmJkZjMwNmFkIiwic2lkIjoiM2Q0ZTIxNzctNzViNi00OWUyLTg2ZmItNWUxM2JkNjFkNGYwIn0.mv1ylf6yTHs3fyQkgn-_BIGekD1SMa6MMGUiCKN1UwQ",
  "access_expires_at": "2026-10-28T12:07:22.721157324Z",
  "refresh_token": "-z8mhjs68fCr886HO4JvLWHKqi5pbUHN8xsMqSpJ3Ck",
  "refresh_expires_at": "2026-10-28T23:52:22.72059281Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
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

`POST /api/admin/v1/staff-extensions/a46f8238-ec06-4c9c-93a5-5e694d6841d1` → **200**

```json
{
  "command_id": "e0ba2098-1876-4f05-bd6a-c0270072c31e",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "f3c2419a-7195-4be9-adc9-6142b8494fae",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T11:52:23.849092Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T11:52:23.849092Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "41339974-4746-4f05-9c99-405ab1550cfe",
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
  "id": "59bbf80e-05b9-4f54-acda-44dac0a028a6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:57:24.404619Z",
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
  "command_id": "b675c1e8-68e0-4cf7-8f3f-8c7722aaac80",
  "quote_id": "59bbf80e-05b9-4f54-acda-44dac0a028a6",
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
    "phone": "+380670502048"
  }
}
```

```json
{
  "id": "811840f6-ec56-4532-8db8-d25100321275",
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
  "created_at": "2026-10-28T11:52:24.703719Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670502048"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/811840f6-ec56-4532-8db8-d25100321275/calls` → **201**

```json
{
  "command_id": "15ca3308-e372-4e6e-8c8b-adec7bf037a3",
  "to": "CALLER"
}
```

```json
{
  "id": "5d2411d4-a781-4e21-8681-a4e33e75ba17",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "order_ids": [
    "811840f6-ec56-4532-8db8-d25100321275"
  ],
  "started_at": "2026-10-28T11:52:25.025535Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/811840f6-ec56-4532-8db8-d25100321275/calls` → **201**

```json
{
  "command_id": "15ca3308-e372-4e6e-8c8b-adec7bf037a3",
  "to": "CALLER"
}
```

```json
{
  "id": "5d2411d4-a781-4e21-8681-a4e33e75ba17",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "order_ids": [
    "811840f6-ec56-4532-8db8-d25100321275"
  ],
  "started_at": "2026-10-28T11:52:25.025535Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "5d2411d4-a781-4e21-8681-a4e33e75ba17",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380670502048",
    "at": "2026-10-28T11:52:25.028672707Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "5d2411d4-a781-4e21-8681-a4e33e75ba17",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.1145",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "5d2411d4-a781-4e21-8681-a4e33e75ba17"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "5d2411d4-a781-4e21-8681-a4e33e75ba17",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=811840f6-ec56-4532-8db8-d25100321275` → **200**

```json
{
  "calls": [
    {
      "id": "5d2411d4-a781-4e21-8681-a4e33e75ba17",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_ids": [
        "811840f6-ec56-4532-8db8-d25100321275"
      ],
      "started_at": "2026-10-28T11:52:25.025535Z",
      "answered_at": "2026-10-28T11:52:25.695838Z",
      "ended_at": "2026-10-28T11:52:25.719975Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=811840f6-ec56-4532-8db8-d25100321275` → **200**

```json
{
  "calls": [
    {
      "id": "5d2411d4-a781-4e21-8681-a4e33e75ba17",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_ids": [
        "811840f6-ec56-4532-8db8-d25100321275"
      ],
      "started_at": "2026-10-28T11:52:25.025535Z",
      "answered_at": "2026-10-28T11:52:25.695838Z",
      "ended_at": "2026-10-28T11:52:25.719975Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=811840f6-ec56-4532-8db8-d25100321275` → **200**

```json
{
  "calls": [
    {
      "id": "5d2411d4-a781-4e21-8681-a4e33e75ba17",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_ids": [
        "811840f6-ec56-4532-8db8-d25100321275"
      ],
      "started_at": "2026-10-28T11:52:25.025535Z",
      "answered_at": "2026-10-28T11:52:25.695838Z",
      "ended_at": "2026-10-28T11:52:25.719975Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=811840f6-ec56-4532-8db8-d25100321275` → **200**

```json
{
  "calls": [
    {
      "id": "5d2411d4-a781-4e21-8681-a4e33e75ba17",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "order_ids": [
        "811840f6-ec56-4532-8db8-d25100321275"
      ],
      "started_at": "2026-10-28T11:52:25.025535Z",
      "answered_at": "2026-10-28T11:52:25.695838Z",
      "ended_at": "2026-10-28T11:52:25.719975Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T11:52:30.923629Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/811840f6-ec56-4532-8db8-d25100321275` → **200**

```json
{
  "id": "811840f6-ec56-4532-8db8-d25100321275",
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
  "created_at": "2026-10-28T11:52:24.703719Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670502048"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/811840f6-ec56-4532-8db8-d25100321275/cancel` → **200**

```json
{
  "command_id": "968acf71-294c-4008-afcb-7f54f932570e",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "811840f6-ec56-4532-8db8-d25100321275",
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
  "created_at": "2026-10-28T11:52:24.703719Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670502048"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
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
  "command_id": "bf8c402b-86ce-4c69-b36b-9b67e6daaa15",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T11:52:33.514738Z",
  "extension": "101"
}
```

Done: outgoing call 5d2411d4-a781-4e21-8681-a4e33e75ba17 from order 811840f6-ec56-4532-8db8-d25100321275, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637008749",
  "device_ref": "sandbox-26130"
}
```

```json
{
  "challenge_id": "1d5c1a74-f1d5-4001-a996-45309057337d",
  "expires_at": "2026-10-28T11:57:33.80320789Z",
  "resend_available_at": "2026-10-28T11:52:34.80320789Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637008749` → **200**

```json
{
  "phone": "+380637008749",
  "audience": "CLIENT",
  "code": "072876",
  "sent_at": "2026-10-28T11:52:33.805492145Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d5c1a74-f1d5-4001-a996-45309057337d",
  "code": "072876",
  "device_ref": "sandbox-26130"
}
```

```json
{
  "session_id": "09863d12-d649-4578-8fb5-3bd606b9ab2f",
  "subject": {
    "type": "CLIENT",
    "id": "9643112a-dc49-4226-9930-afbd9e69fe72"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjQzMTEyYS1kYzQ5LTQyMjYtOTkzMC1hZmJkOWU2OWZlNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MjU0LCJpYXQiOjE3OTMxODgzNTQsImp0aSI6IjRlNWI2MDMzLTAyNzUtNGEzMy05MzNjLTgzODhjY2I1ZGRkOCIsInNpZCI6IjA5ODYzZDEyLWQ2NDktNDU3OC04ZmI1LTNiZDYwNmI5YWIyZiJ9.IN_TPsFI7Y6sjcTa04jKaSadw0iKwyFgGaCB_uklpnw",
  "access_expires_at": "2026-10-28T12:07:34.121159867Z",
  "refresh_token": "EqBMCYeMpYGYlbHUFnAGQQQr2Ak-W1-OxudzO9rjFc8",
  "refresh_expires_at": "2026-11-27T11:52:34.120570506Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9643112a-dc49-4226-9930-afbd9e69fe72",
  "session_id": "09863d12-d649-4578-8fb5-3bd606b9ab2f",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637008749",
  "device_ref": "sandbox-7655"
}
```

```json
{
  "challenge_id": "915b711f-2e38-4dfc-b946-bdd95c323d61",
  "expires_at": "2026-10-28T11:57:36.662247293Z",
  "resend_available_at": "2026-10-28T11:52:37.662247293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637008749` → **200**

```json
{
  "phone": "+380637008749",
  "audience": "CLIENT",
  "code": "432586",
  "sent_at": "2026-10-28T11:52:36.665140035Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "915b711f-2e38-4dfc-b946-bdd95c323d61",
  "code": "432586",
  "device_ref": "sandbox-7655"
}
```

```json
{
  "session_id": "3885de00-8715-4dd2-beb8-67f15e1522ef",
  "subject": {
    "type": "CLIENT",
    "id": "9643112a-dc49-4226-9930-afbd9e69fe72"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjQzMTEyYS1kYzQ5LTQyMjYtOTkzMC1hZmJkOWU2OWZlNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MjU2LCJpYXQiOjE3OTMxODgzNTYsImp0aSI6ImZmYWYzNzRjLTZiYjUtNGYyOS05ZjNmLWFkZGFjZTNhYTJjOSIsInNpZCI6IjM4ODVkZTAwLTg3MTUtNGRkMi1iZWI4LTY3ZjE1ZTE1MjJlZiJ9.xLLf7cYbKgCwDmeG3rz58YTapIl1OLOmu90l5AW1mOY",
  "access_expires_at": "2026-10-28T12:07:36.958849646Z",
  "refresh_token": "rq18PFIHy-_-Ndu9ZcsI4-H7QJ8hrXPgIZN62oVYzjM",
  "refresh_expires_at": "2026-11-27T11:52:36.958263221Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "c67c7f6b-bbd0-4025-8de5-e7af4aed63f9",
  "expires_at": "2026-10-28T11:57:39.236419021Z",
  "resend_available_at": "2026-10-28T11:52:40.236419021Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637008749` → **200**

```json
{
  "phone": "+380637008749",
  "audience": "CLIENT",
  "code": "458885",
  "sent_at": "2026-10-28T11:52:39.238704831Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639649915"
}
```

```json
{
  "challenge_id": "716dd9e5-9fff-424c-9545-2f70b7b1ad14",
  "expires_at": "2026-10-28T11:57:39.535152278Z",
  "resend_available_at": "2026-10-28T11:52:40.535152278Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639649915` → **200**

```json
{
  "phone": "+380639649915",
  "audience": "CLIENT",
  "code": "019771",
  "sent_at": "2026-10-28T11:52:39.536954962Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "7db13940-aaae-4075-b9da-f86956abeff2",
  "current_challenge_id": "c67c7f6b-bbd0-4025-8de5-e7af4aed63f9",
  "current_code": "000000",
  "new_challenge_id": "716dd9e5-9fff-424c-9545-2f70b7b1ad14",
  "new_code": "019771"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "a8081ffd-9f98-435e-b862-ee864d7f98e5"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "37a16add-ddd1-49e5-9011-c8812da3964c",
  "current_challenge_id": "c67c7f6b-bbd0-4025-8de5-e7af4aed63f9",
  "current_code": "458885",
  "new_challenge_id": "716dd9e5-9fff-424c-9545-2f70b7b1ad14",
  "new_code": "019771"
}
```

```json
{
  "subject_id": "9643112a-dc49-4226-9930-afbd9e69fe72",
  "phone": "+380639649915",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9643112a-dc49-4226-9930-afbd9e69fe72",
  "session_id": "09863d12-d649-4578-8fb5-3bd606b9ab2f",
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
  "correlation_id": "4ffc2c21-c610-4713-91db-235a419d5ab3"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639649915",
  "device_ref": "sandbox-31069"
}
```

```json
{
  "challenge_id": "cd540ffb-9358-479d-ba34-162b6b836bcb",
  "expires_at": "2026-10-28T11:57:42.944148961Z",
  "resend_available_at": "2026-10-28T11:52:43.944148961Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639649915` → **200**

```json
{
  "phone": "+380639649915",
  "audience": "CLIENT",
  "code": "464758",
  "sent_at": "2026-10-28T11:52:42.94639763Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd540ffb-9358-479d-ba34-162b6b836bcb",
  "code": "464758",
  "device_ref": "sandbox-31069"
}
```

```json
{
  "session_id": "ccfd0b3f-d9cc-4e4e-a3c1-368f9510ee93",
  "subject": {
    "type": "CLIENT",
    "id": "9643112a-dc49-4226-9930-afbd9e69fe72"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjQzMTEyYS1kYzQ5LTQyMjYtOTkzMC1hZmJkOWU2OWZlNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MjYzLCJpYXQiOjE3OTMxODgzNjMsImp0aSI6ImJjNWMwMTMxLTNkMDUtNDliZC04NGE3LWU3ZGJkOGE0NjI0NiIsInNpZCI6ImNjZmQwYjNmLWQ5Y2MtNGU0ZS1hM2MxLTM2OGY5NTEwZWU5MyJ9.oEGkxEyySicnMHwYfUgwBF_fG_fxX02RTQYEZbEWW2Y",
  "access_expires_at": "2026-10-28T12:07:43.244917434Z",
  "refresh_token": "qRAFnnIro2djOG2Hc2B5yGQyYMKQmAetiTY0KSY73VU",
  "refresh_expires_at": "2026-11-27T11:52:43.244357078Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9643112a-dc49-4226-9930-afbd9e69fe72",
  "session_id": "ccfd0b3f-d9cc-4e4e-a3c1-368f9510ee93",
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
  "session_id": "508b477f-d3fe-400e-a39e-80717527c8ff",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyNjQsImlhdCI6MTc5MzE4ODM2NCwianRpIjoiMDJjZGMzMTgtN2YwOS00OTg0LTlmYTAtNDk2NTQ4OTY1YjAwIiwic2lkIjoiNTA4YjQ3N2YtZDNmZS00MDBlLWEzOWUtODA3MTc1MjdjOGZmIn0.u4Pc0GfPEITzPr1oFXDwAy6YQ0x-rPqctf9ynpl8wQ0",
  "access_expires_at": "2026-10-28T12:07:44.084718559Z",
  "refresh_token": "vzytU9X7VMlrtxcfmI26EUU9id0Q0QmEBsXx7chbAW0",
  "refresh_expires_at": "2026-10-28T23:52:44.084141852Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/9643112a-dc49-4226-9930-afbd9e69fe72` → **200**

```json
{
  "client": {
    "id": "9643112a-dc49-4226-9930-afbd9e69fe72",
    "phone": "+380639649915",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T11:52:34.118517Z",
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

`POST /api/admin/v1/clients/9643112a-dc49-4226-9930-afbd9e69fe72/phone` → **400**

```json
{
  "command_id": "69a21bf2-5ae1-4dc4-9b46-3146280390f5",
  "expected_version": 3,
  "phone": "+380638378539",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9643112a-dc49-4226-9930-afbd9e69fe72/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "03e890d7-5c6d-4cd1-aafc-b20c86297a2b",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/9643112a-dc49-4226-9930-afbd9e69fe72/phone` → **200**

```json
{
  "command_id": "e40e784b-5870-4f3a-b2de-2019077b584e",
  "expected_version": 3,
  "phone": "+380638378539",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "9643112a-dc49-4226-9930-afbd9e69fe72",
  "phone": "+380638378539",
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
  "correlation_id": "e5aaf88b-695d-41eb-a003-b4f2662769e1"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638378539",
  "device_ref": "sandbox-9056"
}
```

```json
{
  "challenge_id": "f44c3a9d-9358-4fd2-957f-e7c5e49c31c3",
  "expires_at": "2026-10-28T11:57:45.488395908Z",
  "resend_available_at": "2026-10-28T11:52:46.488395908Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638378539` → **200**

```json
{
  "phone": "+380638378539",
  "audience": "CLIENT",
  "code": "749922",
  "sent_at": "2026-10-28T11:52:45.491157503Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f44c3a9d-9358-4fd2-957f-e7c5e49c31c3",
  "code": "749922",
  "device_ref": "sandbox-9056"
}
```

```json
{
  "session_id": "0814fe62-131e-4699-b300-16d21da1d7fc",
  "subject": {
    "type": "CLIENT",
    "id": "9643112a-dc49-4226-9930-afbd9e69fe72"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjQzMTEyYS1kYzQ5LTQyMjYtOTkzMC1hZmJkOWU2OWZlNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MjY1LCJpYXQiOjE3OTMxODgzNjUsImp0aSI6IjEyMDUyZTRkLTkxZDQtNDY5My1iZTkxLWIzMmM3NDRkNTdhOSIsInNpZCI6IjA4MTRmZTYyLTEzMWUtNDY5OS1iMzAwLTE2ZDIxZGExZDdmYyJ9.8ct5QRtkiHcAlikFUaFu8fnEBmLy0Od_8uF80dBu2TM",
  "access_expires_at": "2026-10-28T12:07:45.799175285Z",
  "refresh_token": "HSUAz5IPVBeGLSV7jqVm9DxnSi3CjCXrnFwOikhdPc8",
  "refresh_expires_at": "2026-11-27T11:52:45.798179786Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9643112a-dc49-4226-9930-afbd9e69fe72",
  "session_id": "0814fe62-131e-4699-b300-16d21da1d7fc",
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
  "phone": "+380639488328",
  "device_ref": "sandbox-32038"
}
```

```json
{
  "challenge_id": "f9f23a80-e5ed-49f5-8c3a-b0a3aa0abf85",
  "expires_at": "2026-10-28T11:57:46.341414304Z",
  "resend_available_at": "2026-10-28T11:52:47.341414304Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639488328` → **200**

```json
{
  "phone": "+380639488328",
  "audience": "CLIENT",
  "code": "544591",
  "sent_at": "2026-10-28T11:52:46.343651096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9f23a80-e5ed-49f5-8c3a-b0a3aa0abf85",
  "code": "544591",
  "device_ref": "sandbox-32038"
}
```

```json
{
  "session_id": "8fecf407-57cb-4e4c-a8b1-88fb516aa558",
  "subject": {
    "type": "CLIENT",
    "id": "9a4a86b2-2058-4934-9641-e1f6ab283947"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YTRhODZiMi0yMDU4LTQ5MzQtOTY0MS1lMWY2YWIyODM5NDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MjY2LCJpYXQiOjE3OTMxODgzNjYsImp0aSI6IjIzMThjMmExLTJlYzAtNDE4Yi1hNjY4LWI5NzIzOGY1NWY3NSIsInNpZCI6IjhmZWNmNDA3LTU3Y2ItNGU0Yy1hOGIxLTg4ZmI1MTZhYTU1OCJ9.Puc_4iRIK8QUEXKlCXeJuNyeaDLgsWIdEvsza1abZz8",
  "access_expires_at": "2026-10-28T12:07:46.669149902Z",
  "refresh_token": "E8Q_9bTuF9rmQYzOLIGTHHSlWzCc0WDn8inMokBXG-M",
  "refresh_expires_at": "2026-11-27T11:52:46.668232456Z",
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
  "session_id": "92fea322-f2fe-4e0d-8549-82dce1cea3bc",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyNjcsImlhdCI6MTc5MzE4ODM2NywianRpIjoiMTZlMjNiNGEtOTI1OC00MjdkLWIzOTItODQ1MzFkYTQ5NzRlIiwic2lkIjoiOTJmZWEzMjItZjJmZS00ZTBkLTg1NDktODJkY2UxY2VhM2JjIn0.tx3_52baf2ZRRF_2kAPpZKG3zplB6aFSdmKy9leeHlM",
  "access_expires_at": "2026-10-28T12:07:47.796993216Z",
  "refresh_token": "2rOgSRMjifdc_0jjo03Xw3IbHp-sXStLoRCdQHKieqs",
  "refresh_expires_at": "2026-10-28T23:52:47.796379651Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639488328` → **200**

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
  "correlation_id": "2e025208-4190-4d11-9e7b-8f7f3407fbc1"
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
  "session_id": "f834321c-920e-4ce8-a49c-931ed83dc82f",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyNjgsImlhdCI6MTc5MzE4ODM2OCwianRpIjoiNDlhYjUxY2MtMWM4OC00ZDBkLTg5MGYtNjJiMDcyOGMzODhjIiwic2lkIjoiZjgzNDMyMWMtOTIwZS00Y2U4LWE0OWMtOTMxZWQ4M2RjODJmIn0.sqa7XQgW1lj3h-OK6z3-9S02MxlBkR6svSXBrQVDOjU",
  "access_expires_at": "2026-10-28T12:07:48.933121413Z",
  "refresh_token": "vYwAVHHpN02BNRHwOhkn163YUAfWV4pEZ620BBR3Rmk",
  "refresh_expires_at": "2026-10-28T23:52:48.932346756Z",
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
  "command_id": "5298456b-92b1-4875-b70c-dc99382ec0c3",
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
  "changed_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T11:52:49.500122659Z"
}
```

## The rider books the airport for 2026-10-28T14:52:48Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600220307",
  "device_ref": "sandbox-27781"
}
```

```json
{
  "challenge_id": "73bdd5d3-0f89-45e3-8bb1-b76cefadfd18",
  "expires_at": "2026-10-28T11:57:49.788326031Z",
  "resend_available_at": "2026-10-28T11:52:50.788326031Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600220307` → **200**

```json
{
  "phone": "+48600220307",
  "audience": "CLIENT",
  "code": "533535",
  "sent_at": "2026-10-28T11:52:49.790988733Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73bdd5d3-0f89-45e3-8bb1-b76cefadfd18",
  "code": "533535",
  "device_ref": "sandbox-27781"
}
```

```json
{
  "session_id": "925d2159-e274-4f1d-ac31-86b2a4bf554a",
  "subject": {
    "type": "CLIENT",
    "id": "80a4758f-b044-4f2c-bd20-809438b8160c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MGE0NzU4Zi1iMDQ0LTRmMmMtYmQyMC04MDk0MzhiODE2MGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MjcwLCJpYXQiOjE3OTMxODgzNzAsImp0aSI6IjAzYzFlOWY5LWQwYWYtNDgwMC1hMWMxLWY0NDJhZmRkMGNmNCIsInNpZCI6IjkyNWQyMTU5LWUyNzQtNGYxZC1hYzMxLTg2YjJhNGJmNTU0YSJ9.tdh4X6aTU--nCi2Jp-bqrwKpg08oqGwQosAhA5Vx4co",
  "access_expires_at": "2026-10-28T12:07:50.08715872Z",
  "refresh_token": "m3d2S5lz3FK0bQ4wQ9LpDZbMgFFwc9qAjdA1cSkMZNY",
  "refresh_expires_at": "2026-11-27T11:52:50.086553649Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c7a89a62-0423-44b3-b154-b44cdb119d20",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T14:52:48Z"
}
```

```json
{
  "id": "ebd694a0-de4c-408e-8cc3-7180f2537312",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:57:50.367270Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T14:52:48Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3e8332a0-b7ce-4a5b-b825-e7a47c376eb3",
  "quote_id": "ebd694a0-de4c-408e-8cc3-7180f2537312",
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
  "pickup_at": "2026-10-28T14:52:48Z"
}
```

```json
{
  "id": "5d660cba-1a70-44e1-94b8-66ce430c3cdc",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "80a4758f-b044-4f2c-bd20-809438b8160c",
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
  "created_at": "2026-10-28T11:52:50.652529Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T14:52:48Z",
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
  "device_ref": "sandbox-2241"
}
```

```json
{
  "challenge_id": "d2c9ce5d-ef71-4859-883f-e7de1218bbc5",
  "expires_at": "2026-10-28T11:57:50.947574932Z",
  "resend_available_at": "2026-10-28T11:52:51.947574932Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "812535",
  "sent_at": "2026-10-28T11:52:50.950111614Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2c9ce5d-ef71-4859-883f-e7de1218bbc5",
  "code": "812535",
  "device_ref": "sandbox-2241"
}
```

```json
{
  "session_id": "23a379d5-57ca-4c26-8ef6-c37fce138fd9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTI3MSwiaWF0IjoxNzkzMTg4MzcxLCJqdGkiOiIwNjMyNWY5Zi0wM2U5LTQ4NDktYjQzOC1mYWFmNWQ1NDVlZGQiLCJzaWQiOiIyM2EzNzlkNS01N2NhLTRjMjYtOGVmNi1jMzdmY2UxMzhmZDkifQ.MDx0qMoI8du-N0TbQmSrRaIuyi1TCfWrzCUOAQlb-sQ",
  "access_expires_at": "2026-10-28T12:07:51.256645973Z",
  "refresh_token": "k3ShnNXGCD6tx6hUxK3qV5XulaIkk8xSVR5Si09Jrlg",
  "refresh_expires_at": "2026-11-27T11:52:51.255940096Z",
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
  "command_id": "9eecd3fc-0335-41a7-a27b-c40ba2518cf4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:52:51Z",
    "sequence": 1793188371802
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0bae8e22-a0c8-4b4e-999c-c2d13e8a8993",
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
  "last_heartbeat_at": "2026-10-28T11:52:51.821599Z",
  "last_location_at": "2026-10-28T11:52:51.821599Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "5d660cba-1a70-44e1-94b8-66ce430c3cdc",
      "short_number": 18,
      "pickup_at": "2026-10-28T14:52:48Z",
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

`POST /api/driver/v1/preorders/5d660cba-1a70-44e1-94b8-66ce430c3cdc/reserve` → **200**

```json
{
  "command_id": "72333754-8062-4071-af8d-7020c0cd938b"
}
```

```json
{
  "id": "bf2331f7-cae7-4abd-be6a-cda423fe47d3",
  "state": "RESERVED",
  "order": {
    "order_id": "5d660cba-1a70-44e1-94b8-66ce430c3cdc",
    "short_number": 18,
    "pickup_at": "2026-10-28T14:52:48Z",
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
  "reserved_at": "2026-10-28T11:52:52.38159Z",
  "confirm_from": "2026-10-28T14:22:48Z",
  "confirm_until": "2026-10-28T14:32:48Z",
  "drop_until": "2026-10-28T13:52:48Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "bf2331f7-cae7-4abd-be6a-cda423fe47d3",
      "state": "RESERVED",
      "order": {
        "order_id": "5d660cba-1a70-44e1-94b8-66ce430c3cdc",
        "short_number": 18,
        "pickup_at": "2026-10-28T14:52:48Z",
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
      "reserved_at": "2026-10-28T11:52:52.38159Z",
      "confirm_from": "2026-10-28T14:22:48Z",
      "confirm_until": "2026-10-28T14:32:48Z",
      "drop_until": "2026-10-28T13:52:48Z"
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
      "id": "bf2331f7-cae7-4abd-be6a-cda423fe47d3",
      "state": "RESERVED",
      "order": {
        "order_id": "5d660cba-1a70-44e1-94b8-66ce430c3cdc",
        "short_number": 18,
        "pickup_at": "2026-10-28T14:52:48Z",
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
      "reserved_at": "2026-10-28T11:52:52.38159Z",
      "confirm_from": "2026-10-28T14:22:48Z",
      "confirm_until": "2026-10-28T14:32:48Z",
      "drop_until": "2026-10-28T13:52:48Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/bf2331f7-cae7-4abd-be6a-cda423fe47d3/confirm` → **409**

```json
{
  "command_id": "477b9e3f-9f37-4772-95d5-cfa2ed7bf7a4"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/bf2331f7-cae7-4abd-be6a-cda423fe47d3/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "62ef47d8-1088-4ce0-a248-b4ba3c4f8889"
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
  "session_id": "75464ed1-0f1e-43b6-b21b-c969a200059a",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyNzMsImlhdCI6MTc5MzE4ODM3MywianRpIjoiNTIzMjE1ZDEtMDgyZS00ZWFiLTk2MWEtZGYyZjA5ODdkMTRhIiwic2lkIjoiNzU0NjRlZDEtMGYxZS00M2I2LWIyMWItYzk2OWEyMDAwNTlhIn0.xwfyZ8IiJWszNgm0YTDJNQsol1G7jlt39qErZCbd5po",
  "access_expires_at": "2026-10-28T12:07:53.783718208Z",
  "refresh_token": "QV7eYhU191cfC8Rew3yDlsJoKYy_VvJ2x9LuPjVkTug",
  "refresh_expires_at": "2026-10-28T23:52:53.78294302Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5d660cba-1a70-44e1-94b8-66ce430c3cdc` → **200**

```json
{
  "id": "5d660cba-1a70-44e1-94b8-66ce430c3cdc",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "80a4758f-b044-4f2c-bd20-809438b8160c",
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
  "created_at": "2026-10-28T11:52:50.652529Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T14:52:48Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "bf2331f7-cae7-4abd-be6a-cda423fe47d3",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T11:52:52.38159Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5d660cba-1a70-44e1-94b8-66ce430c3cdc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T11:52:50.653904Z",
      "actor": {
        "type": "CLIENT",
        "id": "80a4758f-b044-4f2c-bd20-809438b8160c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "5d660cba-1a70-44e1-94b8-66ce430c3cdc",
        "preorder": true,
        "quote_id": "ebd694a0-de4c-408e-8cc3-7180f2537312",
        "pickup_at": "2026-10-28T14:52:48Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "f3f72dcc-ed75-452f-86ae-73e579a33c4e"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T11:52:52.382823Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5d660cba-1a70-44e1-94b8-66ce430c3cdc",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "bf2331f7-cae7-4abd-be6a-cda423fe47d3"
      },
      "correlation_id": "20fd5cfa-fb0c-4334-861f-2a94fb9d03ed"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 5d660cba-1a70-44e1-94b8-66ce430c3cdc, reservation bf2331f7-cae7-4abd-be6a-cda423fe47d3.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6855"
}
```

```json
{
  "challenge_id": "d8ddf34f-df7c-448d-a59a-4172bdb39273",
  "expires_at": "2026-10-28T11:57:54.636896878Z",
  "resend_available_at": "2026-10-28T11:52:55.636896878Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "131894",
  "sent_at": "2026-10-28T11:52:54.639110472Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8ddf34f-df7c-448d-a59a-4172bdb39273",
  "code": "131894",
  "device_ref": "sandbox-6855"
}
```

```json
{
  "session_id": "1651da09-984a-49a3-bd5e-5e49936e49a1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTI3NCwiaWF0IjoxNzkzMTg4Mzc0LCJqdGkiOiIwZGVkZmZiZi1jNTk5LTQ3MDctYTdjMy0yMTJlYWZhM2UyZDIiLCJzaWQiOiIxNjUxZGEwOS05ODRhLTQ5YTMtYmQ1ZS01ZTQ5OTM2ZTQ5YTEifQ.kBjz1S6EK88R6iNfqwo31afWPHCvRiVX7CZg3EWHgGU",
  "access_expires_at": "2026-10-28T12:07:54.936882374Z",
  "refresh_token": "ADHTx_jCUYogzQcsIhOILzUudpVPC6nf6fvWnsAsY5E",
  "refresh_expires_at": "2026-11-27T11:52:54.935989206Z",
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
  "command_id": "1f08785f-e0e6-42ee-8fd5-73be7ccb92c3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:52:55Z",
    "sequence": 1793188375488
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "28a458b4-d799-4d14-adb4-763394764442",
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
  "last_heartbeat_at": "2026-10-28T11:52:55.507511Z",
  "last_location_at": "2026-10-28T11:52:55.507511Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679508512",
  "device_ref": "sandbox-22189"
}
```

```json
{
  "challenge_id": "cd34155a-8ec8-4378-86de-c060ffe81a80",
  "expires_at": "2026-10-28T11:57:55.775588848Z",
  "resend_available_at": "2026-10-28T11:52:56.775588848Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679508512` → **200**

```json
{
  "phone": "+380679508512",
  "audience": "CLIENT",
  "code": "158848",
  "sent_at": "2026-10-28T11:52:55.778137717Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd34155a-8ec8-4378-86de-c060ffe81a80",
  "code": "158848",
  "device_ref": "sandbox-22189"
}
```

```json
{
  "session_id": "db1b36f2-e5f4-4888-9de8-c89aaef76079",
  "subject": {
    "type": "CLIENT",
    "id": "37095923-8103-4e51-8f60-b0a5c94e4013"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzA5NTkyMy04MTAzLTRlNTEtOGY2MC1iMGE1Yzk0ZTQwMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5Mjc2LCJpYXQiOjE3OTMxODgzNzYsImp0aSI6ImFlZTc2MDc0LTBmY2QtNDg5NS1hMzkwLTU2YTA4YjdkNmI0YyIsInNpZCI6ImRiMWIzNmYyLWU1ZjQtNDg4OC05ZGU4LWM4OWFhZWY3NjA3OSJ9.vk5Hm0muMTgi4bi24K0azKskyIUsnxFmxx2QsUnU0Nw",
  "access_expires_at": "2026-10-28T12:07:56.078675175Z",
  "refresh_token": "S3gF85tE9hJJgDXKJpBTMtVcmF0NQrTD97pmpvJHdCk",
  "refresh_expires_at": "2026-11-27T11:52:56.078114909Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f5b1d4f3-cf32-4379-87c5-cd33768cdb9b",
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
  "id": "3ba4f932-1997-4555-bb47-98f1281a43cd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:57:56.369873Z",
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
  "command_id": "db92ba63-a79f-4977-a0ac-27744d8b29ed",
  "quote_id": "3ba4f932-1997-4555-bb47-98f1281a43cd",
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
  "id": "65584a35-c41d-46df-ab55-29176ee840bd",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "37095923-8103-4e51-8f60-b0a5c94e4013",
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
  "created_at": "2026-10-28T11:52:56.661485Z",
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
    "id": "e9be4cdb-e403-4302-834c-dcddef90a472",
    "order_id": "65584a35-c41d-46df-ab55-29176ee840bd",
    "expires_at": "2026-10-28T11:53:11.666086Z",
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

`POST /api/driver/v1/offers/e9be4cdb-e403-4302-834c-dcddef90a472/accept` → **200**

```json
{
  "command_id": "6d0ccab4-4045-4926-8eca-dd2339e129ab"
}
```

```json
{
  "id": "f0b49c73-51f9-419f-bbe9-52eab24c2383",
  "order_id": "65584a35-c41d-46df-ab55-29176ee840bd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "480975ba-9bd4-4e9e-9f84-ee16767db750",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "480975ba-9bd4-4e9e-9f84-ee16767db750",
  "order_id": "65584a35-c41d-46df-ab55-29176ee840bd",
  "assignment_id": "f0b49c73-51f9-419f-bbe9-52eab24c2383",
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

`POST /api/driver/v1/work-sessions/28a458b4-d799-4d14-adb4-763394764442/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:52:57Z",
    "sequence": 1793188377774
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "28a458b4-d799-4d14-adb4-763394764442",
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
  "last_heartbeat_at": "2026-10-28T11:52:57.79431Z",
  "last_location_at": "2026-10-28T11:52:57.79431Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "480975ba-9bd4-4e9e-9f84-ee16767db750",
  "order_id": "65584a35-c41d-46df-ab55-29176ee840bd",
  "assignment_id": "f0b49c73-51f9-419f-bbe9-52eab24c2383",
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

`POST /api/driver/v1/trips/480975ba-9bd4-4e9e-9f84-ee16767db750/arrive` → **200**

```json
{
  "command_id": "53721bd5-a0df-494c-9f7d-99876c5b88d6",
  "expected_version": 0
}
```

```json
{
  "id": "480975ba-9bd4-4e9e-9f84-ee16767db750",
  "order_id": "65584a35-c41d-46df-ab55-29176ee840bd",
  "assignment_id": "f0b49c73-51f9-419f-bbe9-52eab24c2383",
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
  "arrived_at": "2026-10-28T11:52:58.333688Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/480975ba-9bd4-4e9e-9f84-ee16767db750/start` → **200**

```json
{
  "command_id": "0f69b44b-9c83-4728-9c13-2fd7b41bc751",
  "expected_version": 1
}
```

```json
{
  "id": "480975ba-9bd4-4e9e-9f84-ee16767db750",
  "order_id": "65584a35-c41d-46df-ab55-29176ee840bd",
  "assignment_id": "f0b49c73-51f9-419f-bbe9-52eab24c2383",
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
  "arrived_at": "2026-10-28T11:52:58.333688Z",
  "started_at": "2026-10-28T11:52:58.611409Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/28a458b4-d799-4d14-adb4-763394764442/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:52:58Z",
    "sequence": 1793188378884
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "28a458b4-d799-4d14-adb4-763394764442",
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
  "last_heartbeat_at": "2026-10-28T11:52:58.903406Z",
  "last_location_at": "2026-10-28T11:52:58.903406Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/480975ba-9bd4-4e9e-9f84-ee16767db750/complete` → **200**

```json
{
  "command_id": "3ab20eff-5b6e-4017-9aa8-e3d6d10aa332",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:52:59Z",
  "cash_received": true
}
```

```json
{
  "id": "480975ba-9bd4-4e9e-9f84-ee16767db750",
  "order_id": "65584a35-c41d-46df-ab55-29176ee840bd",
  "assignment_id": "f0b49c73-51f9-419f-bbe9-52eab24c2383",
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
  "arrived_at": "2026-10-28T11:52:58.333688Z",
  "started_at": "2026-10-28T11:52:58.611409Z",
  "completed_at": "2026-10-28T11:52:59.181655Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/65584a35-c41d-46df-ab55-29176ee840bd/rating` → **200**

```json
{
  "command_id": "daa907d0-da42-4d78-97fb-17e5260bef21",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "65584a35-c41d-46df-ab55-29176ee840bd",
  "score": 5,
  "created_at": "2026-10-28T11:52:59.474635312Z"
}
```

`POST /api/driver/v1/orders/65584a35-c41d-46df-ab55-29176ee840bd/rating` → **200**

```json
{
  "command_id": "663c0e4d-f3d9-4638-aefb-8b09529568b0",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "65584a35-c41d-46df-ab55-29176ee840bd",
  "score": 4,
  "created_at": "2026-10-28T11:52:59.751159012Z"
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
  "session_id": "34b4bab5-0d63-42ae-82da-42f050aa17e5",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyODAsImlhdCI6MTc5MzE4ODM4MCwianRpIjoiZTEzM2RmZjgtZjg1NS00ODRlLTg5ZmQtZjIzNWRjYzQ1YzdjIiwic2lkIjoiMzRiNGJhYjUtMGQ2My00MmFlLTgyZGEtNDJmMDUwYWExN2U1In0.18TUVj6j4klDAZ8li3oNnr0yMqfFeRCdo7w68mrfwwU",
  "access_expires_at": "2026-10-28T12:08:00.603256087Z",
  "refresh_token": "fBuy0AG_Of9O8eKOqcQqq-GRyHRCgTC7KaTZ8lH3DWU",
  "refresh_expires_at": "2026-10-28T23:53:00.602637852Z",
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
  "session_id": "e62510a8-1277-4b58-95c7-db09f0995dc7",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyODEsImlhdCI6MTc5MzE4ODM4MSwianRpIjoiZTEzNzZlYWUtZTgwNi00OGEwLWI0ZjUtNjc4ZmZmMGYwOGNhIiwic2lkIjoiZTYyNTEwYTgtMTI3Ny00YjU4LTk1YzctZGIwOWYwOTk1ZGM3In0.1zEMZBMvP3dFpJi-UZ9VwmQnglWKmCyLOnRt4y-HYZk",
  "access_expires_at": "2026-10-28T12:08:01.180811234Z",
  "refresh_token": "Qi_00wUI0w-LpcJFTzCPGrqRM0niugNjryRU_3cjX9I",
  "refresh_expires_at": "2026-10-28T23:53:01.180063408Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/65584a35-c41d-46df-ab55-29176ee840bd/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "65584a35-c41d-46df-ab55-29176ee840bd",
      "author_type": "RIDER",
      "author_id": "37095923-8103-4e51-8f60-b0a5c94e4013",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T11:52:59.474635Z"
    },
    {
      "order_id": "65584a35-c41d-46df-ab55-29176ee840bd",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "37095923-8103-4e51-8f60-b0a5c94e4013",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T11:52:59.751159Z"
    }
  ]
}
```

Done: ratings for order 65584a35-c41d-46df-ab55-29176ee840bd.

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
  "session_id": "2548c2f0-8b85-4dd4-adb3-fad4ac52fb52",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyODIsImlhdCI6MTc5MzE4ODM4MiwianRpIjoiN2QwZTkxMzUtZjZlZi00NjQ4LTg5MjItNWY5ZWYzZWY3YWE5Iiwic2lkIjoiMjU0OGMyZjAtOGI4NS00ZGQ0LWFkYjMtZmFkNGFjNTJmYjUyIn0.lNN3j9dYhYkHZ7KBiJbCeWhhe7wBFfMq2qW0uWc18TQ",
  "access_expires_at": "2026-10-28T12:08:02.052036088Z",
  "refresh_token": "UgSa8JHinzahQI9-Nxan3NouwixdVPfYUTd0Pi-TDU0",
  "refresh_expires_at": "2026-10-28T23:53:02.051407995Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "80929ecf-fa9d-40f7-9801-23bdb2471442",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "70c2b76f-77ae-422a-973d-87f002256dbf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:53:02.34164Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/70c2b76f-77ae-422a-973d-87f002256dbf` → **200**

```json
{
  "id": "70c2b76f-77ae-422a-973d-87f002256dbf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:53:02.34164Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/70c2b76f-77ae-422a-973d-87f002256dbf` → **200**

```json
{
  "id": "70c2b76f-77ae-422a-973d-87f002256dbf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:53:02.34164Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/70c2b76f-77ae-422a-973d-87f002256dbf` → **200**

```json
{
  "id": "70c2b76f-77ae-422a-973d-87f002256dbf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:53:02.34164Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/70c2b76f-77ae-422a-973d-87f002256dbf` → **200**

```json
{
  "id": "70c2b76f-77ae-422a-973d-87f002256dbf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T11:53:02.34164Z",
  "ready_at": "2026-10-28T11:53:05.965928Z",
  "expires_at": "2026-10-29T11:53:05.965928Z"
}
```

`GET /api/admin/v1/reports/exports/70c2b76f-77ae-422a-973d-87f002256dbf/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "02128f0a-fca7-40f9-9e9d-4ddca14c213a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "445ec00f-34ab-4c18-8ac3-09b15d36cd41",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:53:06.781426Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/445ec00f-34ab-4c18-8ac3-09b15d36cd41` → **200**

```json
{
  "id": "445ec00f-34ab-4c18-8ac3-09b15d36cd41",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:53:06.781426Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/445ec00f-34ab-4c18-8ac3-09b15d36cd41` → **200**

```json
{
  "id": "445ec00f-34ab-4c18-8ac3-09b15d36cd41",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:53:06.781426Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/445ec00f-34ab-4c18-8ac3-09b15d36cd41` → **200**

```json
{
  "id": "445ec00f-34ab-4c18-8ac3-09b15d36cd41",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:53:06.781426Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/445ec00f-34ab-4c18-8ac3-09b15d36cd41` → **200**

```json
{
  "id": "445ec00f-34ab-4c18-8ac3-09b15d36cd41",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T11:53:06.781426Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/445ec00f-34ab-4c18-8ac3-09b15d36cd41` → **200**

```json
{
  "id": "445ec00f-34ab-4c18-8ac3-09b15d36cd41",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T11:53:06.781426Z",
  "ready_at": "2026-10-28T11:53:10.975051Z",
  "expires_at": "2026-10-29T11:53:10.975051Z"
}
```

`GET /api/admin/v1/reports/exports/445ec00f-34ab-4c18-8ac3-09b15d36cd41/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/4e1b2334-747d-42a3-b470-32420b0dd2b8` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/4e1b2334-747d-42a3-b470-32420b0dd2b8",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "59f22f87-f390-44ba-97cf-35a88957a271"
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
  "device_ref": "sandbox-32509"
}
```

```json
{
  "challenge_id": "10dd3c8b-ad6d-4836-b004-f52f2f07d16b",
  "expires_at": "2026-10-28T11:58:12.761991066Z",
  "resend_available_at": "2026-10-28T11:53:13.761991066Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "393082",
  "sent_at": "2026-10-28T11:53:12.764524647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10dd3c8b-ad6d-4836-b004-f52f2f07d16b",
  "code": "393082",
  "device_ref": "sandbox-32509"
}
```

```json
{
  "session_id": "0bd51303-c04f-42f2-a9a1-ec6808a6cc9c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTI5MywiaWF0IjoxNzkzMTg4MzkzLCJqdGkiOiI2ZjUwNGY1Ny03OWJmLTQzODQtYjQ2Ni0yYjAwODg5MzE2ODYiLCJzaWQiOiIwYmQ1MTMwMy1jMDRmLTQyZjItYTlhMS1lYzY4MDhhNmNjOWMifQ.nMj3AzgdXFFRd92-4JoOCrtbTyfpa7z_nBVot2smtVs",
  "access_expires_at": "2026-10-28T12:08:13.061458611Z",
  "refresh_token": "0F7sgxCyqIOve0EqIRcDpn5fOHJK_VkG-kCLRn4gmdQ",
  "refresh_expires_at": "2026-11-27T11:53:13.060844687Z",
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
  "command_id": "affbc6dc-be1c-47fc-9534-594ad0b39d33",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:53:13Z",
    "sequence": 1793188393866
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "495e51cc-3115-45f4-9583-640d4cb06e94",
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
  "last_heartbeat_at": "2026-10-28T11:53:13.886535Z",
  "last_location_at": "2026-10-28T11:53:13.886535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "39f64c4b-b996-49bb-a6a0-474e325e4883",
  "points": [
    {
      "sequence": 1793188396165,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T11:52:16Z"
    },
    {
      "sequence": 1793188396173,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T11:53:16Z"
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
  "session_id": "0e9467e7-8380-4c8c-9da0-e260195beef4",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkyOTYsImlhdCI6MTc5MzE4ODM5NiwianRpIjoiYzUxMjIyOTktNzhlMS00ZTdmLWI2MTItNmQxNjk4ODQ3OTEyIiwic2lkIjoiMGU5NDY3ZTctODM4MC00YzhjLTlkYTAtZTI2MDE5NWJlZWY0In0.N6HK-IbPmmbhC0AZI5h9dXrrKj_1g3dMF23dF_pYTpM",
  "access_expires_at": "2026-10-28T12:08:16.780054806Z",
  "refresh_token": "7YzG64vBu9g9iyfb7kc8pnkXu9uyzTzOddzO1Sf829I",
  "refresh_expires_at": "2026-10-28T23:53:16.779449726Z",
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
      "id": "7ebd3c5d-0a82-4db8-ac8b-7972d8919a29",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T11:53:16Z",
        "track_point_id": "6584c551-de5b-496f-af10-ec8953ec7f2f",
        "work_session_id": "495e51cc-3115-45f4-9583-640d4cb06e94"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T11:53:16Z",
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

`POST /api/admin/v1/driver-risk-flags/7ebd3c5d-0a82-4db8-ac8b-7972d8919a29/confirm` → **200**

```json
{
  "command_id": "0d8d90ce-91ff-40da-a462-42d3888f0b8f",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "7ebd3c5d-0a82-4db8-ac8b-7972d8919a29",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T11:53:16Z",
    "track_point_id": "6584c551-de5b-496f-af10-ec8953ec7f2f",
    "work_session_id": "495e51cc-3115-45f4-9583-640d4cb06e94"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T11:53:16Z",
  "reason": null,
  "reviewed_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "reviewed_at": "2026-10-28T11:53:18.964021Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/7ebd3c5d-0a82-4db8-ac8b-7972d8919a29/dismiss` → **409**

```json
{
  "command_id": "1abd8b1b-6000-446c-9be0-d330003cf022",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/7ebd3c5d-0a82-4db8-ac8b-7972d8919a29/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5ec7ee6b-988f-4dd1-a2f6-fa52d0285379"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "a6c6680f-b82a-4504-9d19-f61aa1d14942",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "77c2683d-7291-400a-8c14-cb384a441434",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "raised_at": "2026-10-28T11:53:19.52936Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/77c2683d-7291-400a-8c14-cb384a441434/dismiss` → **200**

```json
{
  "command_id": "0cc7bf0e-6716-4b87-b027-bc1c4872f8de",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "77c2683d-7291-400a-8c14-cb384a441434",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "raised_at": "2026-10-28T11:53:19.52936Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "reviewed_at": "2026-10-28T11:53:19.82235Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "d6584033-7854-4b42-b8d1-194ba4495bbc",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "7ebd3c5d-0a82-4db8-ac8b-7972d8919a29"
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
      "actor_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T11:53:20.113283Z"
    }
  ]
}
```

Done: flag 7ebd3c5d-0a82-4db8-ac8b-7972d8919a29 confirmed, suspension named it, driver reinstated.

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
  "session_id": "165288bb-d29a-4e31-ae98-35ec47fe3da5",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkzMDAsImlhdCI6MTc5MzE4ODQwMCwianRpIjoiY2M3MmVmMWYtMWIwYi00ZmM1LWE4M2EtMGJmZTcwOGI1ZjIyIiwic2lkIjoiMTY1Mjg4YmItZDI5YS00ZTMxLWFlOTgtMzVlYzQ3ZmUzZGE1In0.4aPcO5zDtmQyiAwDjhEwUufMnB4cnGHyr3gQKEWvMH0",
  "access_expires_at": "2026-10-28T12:08:20.966923221Z",
  "refresh_token": "0r9OYwI4YWrd-l4WgNKZsrHZ4lAVfYCeESWjI3Kx418",
  "refresh_expires_at": "2026-10-28T23:53:20.966350161Z",
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
      "actor_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T11:53:20.113283Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "f4e2e3db-5281-4830-b3fd-0632f5dee3a2",
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
  "session_id": "495e51cc-3115-45f4-9583-640d4cb06e94",
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
  "last_heartbeat_at": "2026-10-28T11:53:13.886535Z",
  "last_location_at": "2026-10-28T11:53:13.886535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/495e51cc-3115-45f4-9583-640d4cb06e94/close` → **200**

```json
{
  "command_id": "77266fc4-8e9d-44af-ad05-3598337b07d9",
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
  "session_id": "a74f2040-39c4-4cc8-9aaa-f894363eeba0",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkzMDIsImlhdCI6MTc5MzE4ODQwMiwianRpIjoiZWU0MDljODctOGNjNS00OTlhLTgyM2UtMTYxMGMwNDRjMzkwIiwic2lkIjoiYTc0ZjIwNDAtMzljNC00Y2M4LTlhYWEtZjg5NDM2M2VlYmEwIn0.LVBFA6RDsLTH5rUIMhV4LdENVk4bDzhPoyBUMfcZ_xQ",
  "access_expires_at": "2026-10-28T12:08:22.693139527Z",
  "refresh_token": "eDMVHmy2INlFNgp9jwzGJHU0qQworMDsZqosbiaVBDY",
  "refresh_expires_at": "2026-10-28T23:53:22.692603646Z",
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
  "command_id": "defe88c4-c367-46a4-83c5-5b23f2500885",
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
  "changed_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T11:53:23.261545Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "defe88c4-c367-46a4-83c5-5b23f2500885",
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
  "changed_by": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T11:53:23.261545Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48369707268",
  "device_ref": "sandbox-2616"
}
```

```json
{
  "challenge_id": "f5a4de03-6762-43eb-99b1-5300c974e902",
  "expires_at": "2026-10-28T11:58:23.8324938Z",
  "resend_available_at": "2026-10-28T11:53:24.8324938Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48369707268` → **200**

```json
{
  "phone": "+48369707268",
  "audience": "CLIENT",
  "code": "735045",
  "sent_at": "2026-10-28T11:53:23.835033773Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5a4de03-6762-43eb-99b1-5300c974e902",
  "code": "735045",
  "device_ref": "sandbox-2616"
}
```

```json
{
  "session_id": "8eb5e772-e36d-4fc1-90a1-19c1d72eff97",
  "subject": {
    "type": "CLIENT",
    "id": "525384fa-b701-45c0-984c-4781bfe12c5d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MjUzODRmYS1iNzAxLTQ1YzAtOTg0Yy00NzgxYmZlMTJjNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MzA0LCJpYXQiOjE3OTMxODg0MDQsImp0aSI6Ijk3NmVlMTk5LTlhYTEtNGRkYi1hMzlkLTY5ZDk2MjgyYzg5MyIsInNpZCI6IjhlYjVlNzcyLWUzNmQtNGZjMS05MGExLTE5YzFkNzJlZmY5NyJ9.I35e5rPZ9klnJpCsNkT0dv1oSesOUBd2-dqcQI4epnk",
  "access_expires_at": "2026-10-28T12:08:24.139046269Z",
  "refresh_token": "aaqsgpEnBYL7PtE3aBeEZAeHDzNbUTvGh3SsnciGP9o",
  "refresh_expires_at": "2026-11-27T11:53:24.138509246Z",
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
  "correlation_id": "0472e08c-2e23-4263-bf9d-fb0a753cc523"
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
  "device_ref": "sandbox-7370"
}
```

```json
{
  "challenge_id": "bd59e975-aca7-41f0-bf7f-0b069cd7cd69",
  "expires_at": "2026-10-28T11:58:24.954261596Z",
  "resend_available_at": "2026-10-28T11:53:25.954261596Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "476444",
  "sent_at": "2026-10-28T11:53:24.956615942Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd59e975-aca7-41f0-bf7f-0b069cd7cd69",
  "code": "476444",
  "device_ref": "sandbox-7370"
}
```

```json
{
  "session_id": "0c0c615d-535b-475b-bc67-d06e905ca6e6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTMwNSwiaWF0IjoxNzkzMTg4NDA1LCJqdGkiOiJkZGFkZTM1Ni03ZjkzLTQzNTctYmEyNy0wYzY0OGVjMDdkMTQiLCJzaWQiOiIwYzBjNjE1ZC01MzViLTQ3NWItYmM2Ny1kMDZlOTA1Y2E2ZTYifQ.4zVd4_05dGQIJUWMWhmfLs_MV-2CJ39uB_p7EdDK9LE",
  "access_expires_at": "2026-10-28T12:08:25.265966611Z",
  "refresh_token": "2DIbTA1hUp8DVheM3KC7rYz7FSdo-z6kY8jcerF5sTw",
  "refresh_expires_at": "2026-11-27T11:53:25.265335233Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0bae8e22-a0c8-4b4e-999c-c2d13e8a8993",
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
  "last_heartbeat_at": "2026-10-28T11:52:51.821599Z",
  "last_location_at": "2026-10-28T11:52:51.821599Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0bae8e22-a0c8-4b4e-999c-c2d13e8a8993/handover` → **200**

```json
{
  "command_id": "6cba6f12-7985-4921-a037-6fc7d91695ef",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0bae8e22-a0c8-4b4e-999c-c2d13e8a8993",
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
  "last_heartbeat_at": "2026-10-28T11:52:51.821599Z",
  "last_location_at": "2026-10-28T11:52:51.821599Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0bae8e22-a0c8-4b4e-999c-c2d13e8a8993/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:53:26Z",
    "sequence": 1793188406831
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0bae8e22-a0c8-4b4e-999c-c2d13e8a8993",
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
  "last_heartbeat_at": "2026-10-28T11:53:26.102455Z",
  "last_location_at": "2026-10-28T11:53:26.102455Z",
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
  "session_id": "0bae8e22-a0c8-4b4e-999c-c2d13e8a8993",
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
  "last_heartbeat_at": "2026-10-28T11:53:26.102455Z",
  "last_location_at": "2026-10-28T11:53:26.102455Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0bae8e22-a0c8-4b4e-999c-c2d13e8a8993/close` → **200**

```json
{
  "command_id": "23f6fe98-cb01-4c88-b566-a3c873613339",
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
  "correlation_id": "1d044673-d646-46c6-9f04-b2663c50756c"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673004007",
  "device_ref": "sandbox-11291"
}
```

```json
{
  "challenge_id": "da4a80fc-2667-47d1-a091-9db412372449",
  "expires_at": "2026-10-28T11:58:27.506669071Z",
  "resend_available_at": "2026-10-28T11:53:28.506669071Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673004007` → **200**

```json
{
  "phone": "+380673004007",
  "audience": "CLIENT",
  "code": "579410",
  "sent_at": "2026-10-28T11:53:27.509031695Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da4a80fc-2667-47d1-a091-9db412372449",
  "code": "579410",
  "device_ref": "sandbox-11291"
}
```

```json
{
  "session_id": "a25f7b9e-eb24-4660-92bc-311407aabcca",
  "subject": {
    "type": "CLIENT",
    "id": "d6aefed8-5b22-4449-99aa-db48b61a4027"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmFlZmVkOC01YjIyLTQ0NDktOTlhYS1kYjQ4YjYxYTQwMjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg5MzA3LCJpYXQiOjE3OTMxODg0MDcsImp0aSI6IjkyNzQzMDUzLTAzNzgtNGQxYi05OTM0LWJlMzA5OTk3ZDBlOCIsInNpZCI6ImEyNWY3YjllLWViMjQtNDY2MC05MmJjLTMxMTQwN2FhYmNjYSJ9.8jaIdp3QzO9lkCbjIHhcxm2BzX-nCFK06Uoj48LGsKI",
  "access_expires_at": "2026-10-28T12:08:27.810263414Z",
  "refresh_token": "OGQvkJsPlJJp-Ylij-eYJEXzBSAp1NPWxwVdAvxk0rg",
  "refresh_expires_at": "2026-11-27T11:53:27.809691225Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "58b40ea0-5851-496e-8f15-0833486e2aa7",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "2e514c85-d06a-4724-8311-b95da2072cbd",
  "upload_path": "/api/rider/v1/uploads/2e514c85-d06a-4724-8311-b95da2072cbd",
  "expires_at": "2026-10-28T12:08:28.094034891Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/2e514c85-d06a-4724-8311-b95da2072cbd` → **200**

```json
{
  "file_id": "2e514c85-d06a-4724-8311-b95da2072cbd",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "ab6d95ad-7f96-4975-b8fb-de73cb42c46f",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "2e514c85-d06a-4724-8311-b95da2072cbd"
  ]
}
```

```json
{
  "id": "4c7edc38-7626-4d3d-b347-885d36602455",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d6aefed8-5b22-4449-99aa-db48b61a4027",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T11:53:28.422192Z",
  "updated_at": "2026-10-28T11:53:28.422192Z",
  "messages": [
    {
      "id": "1f7db4ba-ae5a-40f6-86c5-5ec72b5801b3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d6aefed8-5b22-4449-99aa-db48b61a4027",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T11:53:28.423838Z",
      "attachments": [
        {
          "file_id": "2e514c85-d06a-4724-8311-b95da2072cbd",
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
  "session_id": "f146cb60-011f-4177-867e-28cb4af5c0a3",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkzMDksImlhdCI6MTc5MzE4ODQwOSwianRpIjoiNDYzOWRlZmYtYmU1OC00ODUwLThlM2UtYzI3NTU3OTZkODE0Iiwic2lkIjoiZjE0NmNiNjAtMDExZi00MTc3LTg2N2UtMjhjYjRhZjVjMGEzIn0.zg_2GN7quOL2rouKykJoP00ZmdmXCnKItzZZiXtg0Xs",
  "access_expires_at": "2026-10-28T12:08:29.017061413Z",
  "refresh_token": "UJHIOAP3SqOviRXHgQXzxNwLTs7Xgk5OieAG6qGche4",
  "refresh_expires_at": "2026-10-28T23:53:29.016490216Z",
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
  "session_id": "172bf0cc-7515-477e-84ee-499b5cc89579",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkzMDksImlhdCI6MTc5MzE4ODQwOSwianRpIjoiMDcxM2Y0N2QtZGIyYS00OGYwLWFiZmQtZmMyNWUwMzU3YThmIiwic2lkIjoiMTcyYmYwY2MtNzUxNS00NzdlLTg0ZWUtNDk5YjVjYzg5NTc5In0.IPoC019n9Sj0Z5n0a6SIANpjfaU_uNzKS7tPRCWFPkc",
  "access_expires_at": "2026-10-28T12:08:29.589801545Z",
  "refresh_token": "D-mhKZLPJMMZtCWaw8fNDLlw4nBwGoSmb6oLMzvb-9E",
  "refresh_expires_at": "2026-10-28T23:53:29.589223396Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/4c7edc38-7626-4d3d-b347-885d36602455/attachments/2e514c85-d06a-4724-8311-b95da2072cbd` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "51f2285d-6c52-4deb-a4e6-a77ee5410d5f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c6f194ba-fe84-4340-b9b3-2ee3a9d7e04c",
  "upload_path": "/api/operator/v1/uploads/c6f194ba-fe84-4340-b9b3-2ee3a9d7e04c",
  "expires_at": "2026-10-28T12:08:29.874817138Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/c6f194ba-fe84-4340-b9b3-2ee3a9d7e04c` → **200**

```json
{
  "file_id": "c6f194ba-fe84-4340-b9b3-2ee3a9d7e04c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/4c7edc38-7626-4d3d-b347-885d36602455` → **200**

```json
{
  "id": "4c7edc38-7626-4d3d-b347-885d36602455",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d6aefed8-5b22-4449-99aa-db48b61a4027",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T11:53:28.422192Z",
  "updated_at": "2026-10-28T11:53:28.422192Z",
  "messages": [
    {
      "id": "1f7db4ba-ae5a-40f6-86c5-5ec72b5801b3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d6aefed8-5b22-4449-99aa-db48b61a4027",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T11:53:28.423838Z",
      "attachments": [
        {
          "file_id": "2e514c85-d06a-4724-8311-b95da2072cbd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/4c7edc38-7626-4d3d-b347-885d36602455/comments` → **200**

```json
{
  "command_id": "a9c85b0f-96cc-4d13-b6ee-02fe3bf6140b",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "c6f194ba-fe84-4340-b9b3-2ee3a9d7e04c"
  ]
}
```

```json
{
  "id": "4c7edc38-7626-4d3d-b347-885d36602455",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d6aefed8-5b22-4449-99aa-db48b61a4027",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T11:53:28.422192Z",
  "updated_at": "2026-10-28T11:53:30.46327Z",
  "messages": [
    {
      "id": "1f7db4ba-ae5a-40f6-86c5-5ec72b5801b3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d6aefed8-5b22-4449-99aa-db48b61a4027",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T11:53:28.423838Z",
      "attachments": [
        {
          "file_id": "2e514c85-d06a-4724-8311-b95da2072cbd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6f0e9d66-800b-4de0-ab3e-ab44a89e2f48",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T11:53:30.46286Z",
      "attachments": [
        {
          "file_id": "c6f194ba-fe84-4340-b9b3-2ee3a9d7e04c",
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

`GET /api/rider/v1/support/cases/4c7edc38-7626-4d3d-b347-885d36602455` → **200**

```json
{
  "id": "4c7edc38-7626-4d3d-b347-885d36602455",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d6aefed8-5b22-4449-99aa-db48b61a4027",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T11:53:28.422192Z",
  "updated_at": "2026-10-28T11:53:30.46327Z",
  "messages": [
    {
      "id": "1f7db4ba-ae5a-40f6-86c5-5ec72b5801b3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d6aefed8-5b22-4449-99aa-db48b61a4027",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T11:53:28.423838Z",
      "attachments": [
        {
          "file_id": "2e514c85-d06a-4724-8311-b95da2072cbd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6f0e9d66-800b-4de0-ab3e-ab44a89e2f48",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T11:53:30.46286Z",
      "attachments": [
        {
          "file_id": "c6f194ba-fe84-4340-b9b3-2ee3a9d7e04c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/4c7edc38-7626-4d3d-b347-885d36602455/attachments/c6f194ba-fe84-4340-b9b3-2ee3a9d7e04c` → **200**

Done: support case 4c7edc38-7626-4d3d-b347-885d36602455, rider attachment 2e514c85-d06a-4724-8311-b95da2072cbd, operator attachment c6f194ba-fe84-4340-b9b3-2ee3a9d7e04c.

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
  "session_id": "54348d06-02ca-4c59-803c-9f063ccd1ed5",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkzMTEsImlhdCI6MTc5MzE4ODQxMSwianRpIjoiMzlhMDRiMWQtNDdlMi00NWQ4LTk0ZjAtMWUzNzQxOTc3ZjhkIiwic2lkIjoiNTQzNDhkMDYtMDJjYS00YzU5LTgwM2MtOWYwNjNjY2QxZWQ1In0.E_mGCbZXkLftKqFQFe50BK8PTKt69dFYsI5nube4nfw",
  "access_expires_at": "2026-10-28T12:08:31.352565039Z",
  "refresh_token": "s79blRK5p5jp2_8B1efvfCq2qCs3tC8oyFC7s_4-VdA",
  "refresh_expires_at": "2026-10-28T23:53:31.351878369Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8481"
}
```

```json
{
  "challenge_id": "895cf5b2-cdab-42bf-a933-49372586ff6c",
  "expires_at": "2026-10-28T11:58:31.619046118Z",
  "resend_available_at": "2026-10-28T11:53:32.619046118Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "636934",
  "sent_at": "2026-10-28T11:53:31.621883446Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "895cf5b2-cdab-42bf-a933-49372586ff6c",
  "code": "636934",
  "device_ref": "sandbox-8481"
}
```

```json
{
  "session_id": "22eb5b50-c054-4c9d-a41c-e1ec72133952",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTMxMSwiaWF0IjoxNzkzMTg4NDExLCJqdGkiOiI1ZDdkMzZlNS04ZjMzLTRhNzEtYTkyYy1hYmE4OTExOGM3NzYiLCJzaWQiOiIyMmViNWI1MC1jMDU0LTRjOWQtYTQxYy1lMWVjNzIxMzM5NTIifQ.UibdXAB8ZsRT0S_D8M6g0do_w5VeF6j5OdWOUkSJM34",
  "access_expires_at": "2026-10-28T12:08:31.920942691Z",
  "refresh_token": "KYereSK52KWSDcKZWGSAhbPxfpxiAJ1G_WvludE6mas",
  "refresh_expires_at": "2026-11-27T11:53:31.92006486Z",
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
      "actor_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T11:53:20.113283Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T11:53:21.532826Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "662294f7-d4f7-470c-a47f-b0f42240c972",
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
  "device_ref": "sandbox-15521"
}
```

```json
{
  "challenge_id": "d5175c8f-e15a-4c81-ae69-86cd441e1330",
  "expires_at": "2026-10-28T11:58:33.052167752Z",
  "resend_available_at": "2026-10-28T11:53:34.052167752Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "595489",
  "sent_at": "2026-10-28T11:53:33.054381693Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5175c8f-e15a-4c81-ae69-86cd441e1330",
  "code": "595489",
  "device_ref": "sandbox-15521"
}
```

```json
{
  "session_id": "4c8ed86e-b78c-4bfa-a17e-5e21acaa825d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4OTMxMywiaWF0IjoxNzkzMTg4NDEzLCJqdGkiOiIyNzQwZWU1NC1mMmM2LTQzNWQtYThjMy1kOWM3NGNkMDE5ODgiLCJzaWQiOiI0YzhlZDg2ZS1iNzhjLTRiZmEtYTE3ZS01ZTIxYWNhYTgyNWQifQ.VfrE-V2Vtkd6rd-D6JaR1V0iSepFEXW_yTpoBNljYCI",
  "access_expires_at": "2026-10-28T12:08:33.346076847Z",
  "refresh_token": "G8mPKDxv1tZ-bC9Fk-Et1bT1AA5nBNhCUDpKeeoer6Y",
  "refresh_expires_at": "2026-11-27T11:53:33.345467179Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "28a458b4-d799-4d14-adb4-763394764442",
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
  "last_heartbeat_at": "2026-10-28T11:52:58.903406Z",
  "last_location_at": "2026-10-28T11:52:58.903406Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/28a458b4-d799-4d14-adb4-763394764442/handover` → **200**

```json
{
  "command_id": "6bce2072-05e0-4413-a167-815763a4f343",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "28a458b4-d799-4d14-adb4-763394764442",
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
  "last_heartbeat_at": "2026-10-28T11:52:58.903406Z",
  "last_location_at": "2026-10-28T11:52:58.903406Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/28a458b4-d799-4d14-adb4-763394764442/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:53:34Z",
    "sequence": 1793188414172
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "28a458b4-d799-4d14-adb4-763394764442",
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
  "last_heartbeat_at": "2026-10-28T11:53:34.191176Z",
  "last_location_at": "2026-10-28T11:53:34.191176Z",
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
  "command_id": "84087a7d-cab1-4e66-8632-ad464fa89426",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:53:34Z",
    "sequence": 1793188414726
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ff3d014-2b83-4420-92c3-a0288f75502c",
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
  "last_heartbeat_at": "2026-10-28T11:53:34.744206Z",
  "last_location_at": "2026-10-28T11:53:34.744206Z",
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
  "session_id": "47fe1985-550d-4590-a293-585584dae7ee",
  "subject": {
    "type": "STAFF",
    "id": "a46f8238-ec06-4c9c-93a5-5e694d6841d1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmODIzOC1lYzA2LTRjOWMtOTNhNS01ZTY5NGQ2ODQxZDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODkzMTUsImlhdCI6MTc5MzE4ODQxNSwianRpIjoiMjgyNDI4ZDEtZWI3ZC00NGU2LTk3NDUtZjY4MGY0OGViY2ZiIiwic2lkIjoiNDdmZTE5ODUtNTUwZC00NTkwLWEyOTMtNTg1NTg0ZGFlN2VlIn0.5zn-O9YwrtIpbUsdmIxgoP9wYrxt0zCIqolJpYK4XmU",
  "access_expires_at": "2026-10-28T12:08:35.311584029Z",
  "refresh_token": "aIQhNbbVUr3k172w-lnUuVjUpxbk9FNmgItBIgZrRZM",
  "refresh_expires_at": "2026-10-28T23:53:35.310994869Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d5b65d24-0ebb-4421-a158-be0c874e1c95",
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
  "id": "213468f9-acd5-4b3d-b06a-c1177b198aa7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:58:35.582589Z",
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
  "command_id": "03969662-4582-4143-93ba-d5267c1a2e09",
  "quote_id": "213468f9-acd5-4b3d-b06a-c1177b198aa7",
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
  "id": "97d9fad6-b1c4-4ca1-b392-a1b3e28d8f8f",
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
  "created_at": "2026-10-28T11:53:35.869274Z",
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
    "id": "e438ad38-6696-49bd-9b80-3a2d322999cb",
    "order_id": "97d9fad6-b1c4-4ca1-b392-a1b3e28d8f8f",
    "expires_at": "2026-10-28T11:53:50.873652Z",
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

`POST /api/driver/v1/offers/e438ad38-6696-49bd-9b80-3a2d322999cb/accept` → **200**

```json
{
  "command_id": "92fe0731-7140-43eb-9310-b7b4a1cdce11"
}
```

```json
{
  "id": "fbc8d1e4-d73a-4c9f-9c24-d48d0d35cf0b",
  "order_id": "97d9fad6-b1c4-4ca1-b392-a1b3e28d8f8f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f8a2246a-4a12-4cb3-8a8e-4924a3648c91",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f8a2246a-4a12-4cb3-8a8e-4924a3648c91",
  "order_id": "97d9fad6-b1c4-4ca1-b392-a1b3e28d8f8f",
  "assignment_id": "fbc8d1e4-d73a-4c9f-9c24-d48d0d35cf0b",
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

`POST /api/driver/v1/work-sessions/6ff3d014-2b83-4420-92c3-a0288f75502c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T11:53:37Z",
    "sequence": 1793188417266
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6ff3d014-2b83-4420-92c3-a0288f75502c",
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
  "last_heartbeat_at": "2026-10-28T11:53:37.290032Z",
  "last_location_at": "2026-10-28T11:53:37.290032Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f8a2246a-4a12-4cb3-8a8e-4924a3648c91/arrive` → **200**

```json
{
  "command_id": "26a36d51-3af3-4853-9dfc-8de76a3e3370",
  "expected_version": 0
}
```

```json
{
  "id": "f8a2246a-4a12-4cb3-8a8e-4924a3648c91",
  "order_id": "97d9fad6-b1c4-4ca1-b392-a1b3e28d8f8f",
  "assignment_id": "fbc8d1e4-d73a-4c9f-9c24-d48d0d35cf0b",
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
  "arrived_at": "2026-10-28T11:53:37.575255Z",
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

`POST /api/driver/v1/trips/f8a2246a-4a12-4cb3-8a8e-4924a3648c91/start` → **200**

```json
{
  "command_id": "c9c7740d-2763-48b5-b833-0b8a9b06b83a",
  "expected_version": 1
}
```

```json
{
  "id": "f8a2246a-4a12-4cb3-8a8e-4924a3648c91",
  "order_id": "97d9fad6-b1c4-4ca1-b392-a1b3e28d8f8f",
  "assignment_id": "fbc8d1e4-d73a-4c9f-9c24-d48d0d35cf0b",
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
  "arrived_at": "2026-10-28T11:53:37.575255Z",
  "started_at": "2026-10-28T11:53:37.87327Z",
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

`POST /api/driver/v1/trips/f8a2246a-4a12-4cb3-8a8e-4924a3648c91/complete` → **200**

```json
{
  "command_id": "46c4bdc6-c2ba-46b1-89b1-50244b969931",
  "expected_version": 2,
  "reported_at": "2026-10-28T11:53:38Z",
  "cash_received": true
}
```

```json
{
  "id": "f8a2246a-4a12-4cb3-8a8e-4924a3648c91",
  "order_id": "97d9fad6-b1c4-4ca1-b392-a1b3e28d8f8f",
  "assignment_id": "fbc8d1e4-d73a-4c9f-9c24-d48d0d35cf0b",
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
  "arrived_at": "2026-10-28T11:53:37.575255Z",
  "started_at": "2026-10-28T11:53:37.87327Z",
  "completed_at": "2026-10-28T11:53:38.164893Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/97d9fad6-b1c4-4ca1-b392-a1b3e28d8f8f` → **200**

```json
{
  "id": "97d9fad6-b1c4-4ca1-b392-a1b3e28d8f8f",
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
    "id": "fbc8d1e4-d73a-4c9f-9c24-d48d0d35cf0b",
    "order_id": "97d9fad6-b1c4-4ca1-b392-a1b3e28d8f8f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f8a2246a-4a12-4cb3-8a8e-4924a3648c91",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T11:53:35.869274Z",
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
  "session_id": "28a458b4-d799-4d14-adb4-763394764442",
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
  "last_heartbeat_at": "2026-10-28T11:53:34.191176Z",
  "last_location_at": "2026-10-28T11:53:34.191176Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/28a458b4-d799-4d14-adb4-763394764442/close` → **200**

```json
{
  "command_id": "6bc7ad73-decc-4509-8d5f-2939b0fabbfe",
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
  "session_id": "6ff3d014-2b83-4420-92c3-a0288f75502c",
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
  "last_heartbeat_at": "2026-10-28T11:53:37.290032Z",
  "last_location_at": "2026-10-28T11:53:37.290032Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6ff3d014-2b83-4420-92c3-a0288f75502c/close` → **200**

```json
{
  "command_id": "bb52cd76-1ad0-439e-bdea-f739a6c603c7",
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

Done: terminal order 97d9fad6-b1c4-4ca1-b392-a1b3e28d8f8f by Andrii (5a000000-0000-4000-8000-000000000403).
