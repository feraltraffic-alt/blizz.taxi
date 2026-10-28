# Sandbox transcript (2026-10-28T15:04:54Z, e8380de)

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
  "correlation_id": "4b58306a-f8a7-4a3e-b1be-4cd773af5d5f"
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
  "session_id": "619651cd-ad18-4941-89e0-817a934e1bc9",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MDEsImlhdCI6MTc5MzE5OTkwMSwianRpIjoiNTRhYjdjMTgtNDM1Ny00YTkwLWJiMDQtOWEzMjVlMGEwMzU1Iiwic2lkIjoiNjE5NjUxY2QtYWQxOC00OTQxLTg5ZTAtODE3YTkzNGUxYmM5In0.oikZH3hTXgrXUC-CdlWyRD-ObeVZuHu6TWeCETmPNT0",
  "access_expires_at": "2026-10-28T15:20:01.401096885Z",
  "refresh_token": "zCUe5_olG4eYQ8QhVAwBSw1GPIcOu5f0NMDGwt_gDGo",
  "refresh_expires_at": "2026-10-29T03:05:01.398874576Z",
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
  "session_id": "aa48546e-dd82-43c8-be82-9b2f75a88b01",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MDIsImlhdCI6MTc5MzE5OTkwMiwianRpIjoiZTI4Mzk1ZGQtZWQ3Yy00ZGFmLTk5MWUtMzYwNDU1OThkMzAyIiwic2lkIjoiYWE0ODU0NmUtZGQ4Mi00M2M4LWJlODItOWIyZjc1YTg4YjAxIn0.FZmp1845Ue2wmzXc7LdOm7T3fgp1eIb5YnQwyxaqhbE",
  "access_expires_at": "2026-10-28T15:20:02.481130855Z",
  "refresh_token": "FDqR_kFUHftjklA0pJXXUrZEpiQWoJLzY2IjyINrRvw",
  "refresh_expires_at": "2026-10-29T03:05:02.480346048Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "d00d5077-1b5a-41e4-87bb-5849915ece6a",
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
  "id": "c13f252a-6aad-4e45-a426-929ae7cf8039",
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
  "created_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "created_at": "2026-10-28T15:05:02.684267Z",
  "updated_at": "2026-10-28T15:05:02.684267Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635706517",
  "device_ref": "sandbox-7542"
}
```

```json
{
  "challenge_id": "96a95b45-1493-4684-962b-6c51914851fa",
  "expires_at": "2026-10-28T15:10:02.884491566Z",
  "resend_available_at": "2026-10-28T15:05:03.884491566Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635706517` → **200**

```json
{
  "phone": "+380635706517",
  "audience": "CLIENT",
  "code": "536029",
  "sent_at": "2026-10-28T15:05:02.891361842Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "96a95b45-1493-4684-962b-6c51914851fa",
  "code": "536029",
  "device_ref": "sandbox-7542"
}
```

```json
{
  "session_id": "eb5bd5f1-f421-44da-800f-6671870712bf",
  "subject": {
    "type": "CLIENT",
    "id": "e2105334-f337-4aa9-8ecc-a1acfbbffd7d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMjEwNTMzNC1mMzM3LTRhYTktOGVjYy1hMWFjZmJiZmZkN2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODAzLCJpYXQiOjE3OTMxOTk5MDMsImp0aSI6IjZiNTQzYTU1LTBhODItNDk5Zi1iZTI0LTc1MGJjNmJmMjY5MyIsInNpZCI6ImViNWJkNWYxLWY0MjEtNDRkYS04MDBmLTY2NzE4NzA3MTJiZiJ9.CvrBPj0wxrlrrvXsYrqI83QTEvLfLuOYYx7kxJFlX54",
  "access_expires_at": "2026-10-28T15:20:03.124226367Z",
  "refresh_token": "tU7pvL6z2dbHCs_U3LuF3N8hJEkmGyJY8fI6OTo8HbM",
  "refresh_expires_at": "2026-11-27T15:05:03.122963347Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635706517` → **200**

```json
{
  "client_id": "e2105334-f337-4aa9-8ecc-a1acfbbffd7d"
}
```

`POST /api/admin/v1/rider-wallets/e2105334-f337-4aa9-8ecc-a1acfbbffd7d/top-ups` → **201**

```json
{
  "command_id": "5ae1c3f0-41db-4df0-abf6-9bfccc58ea49",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "e2105334-f337-4aa9-8ecc-a1acfbbffd7d",
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
      "id": "2734c3b0-f4c6-45e9-b11b-658d6140909c",
      "at": "2026-10-28T15:05:03.504766Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7849c14f-0baf-426b-81ee-d0c561c6421b",
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
  "id": "dc17d799-99b1-43b4-a2b1-f9a0b1b6a2da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:03.745874Z",
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
      "id": "c13f252a-6aad-4e45-a426-929ae7cf8039",
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
  "device_ref": "sandbox-25991"
}
```

```json
{
  "challenge_id": "b702efa5-4761-4d31-8f61-dbf234992dc9",
  "expires_at": "2026-10-28T15:10:03.951485066Z",
  "resend_available_at": "2026-10-28T15:05:04.951485066Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "887786",
  "sent_at": "2026-10-28T15:05:03.954796632Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b702efa5-4761-4d31-8f61-dbf234992dc9",
  "code": "887786",
  "device_ref": "sandbox-25991"
}
```

```json
{
  "session_id": "bf4155c8-9ee6-4a7f-ba4f-d0033f32cd19",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDgwNCwiaWF0IjoxNzkzMTk5OTA0LCJqdGkiOiIzYjkzMzY0ZS1hZWM1LTQ3YTctYjc0Mi1lZDE2ZmM2ZTdjMmMiLCJzaWQiOiJiZjQxNTVjOC05ZWU2LTRhN2YtYmE0Zi1kMDAzM2YzMmNkMTkifQ.5ELg7Zz4pdWrLQzULPeGsJgEdhwtG6I96lxSfvPXCc8",
  "access_expires_at": "2026-10-28T15:20:04.17313616Z",
  "refresh_token": "wjdGDtF8e8ub6h3Zdj48z6PrsZ2STQaHRms1WC9eIh0",
  "refresh_expires_at": "2026-11-27T15:05:04.172254488Z",
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
  "command_id": "8d6bd3e0-72a4-4a93-ac0a-2e4f3c4d4e52",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:04Z",
    "sequence": 1793199904545
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1783797e-eb5b-4794-8c28-65285b1ef135",
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
  "last_heartbeat_at": "2026-10-28T15:05:04.583485Z",
  "last_location_at": "2026-10-28T15:05:04.583485Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "41759fa7-38b3-4953-9095-a6cac25e66e8",
  "quote_id": "dc17d799-99b1-43b4-a2b1-f9a0b1b6a2da",
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
  "id": "5cb123e0-a540-46eb-bea9-6346906d6f07",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e2105334-f337-4aa9-8ecc-a1acfbbffd7d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:05:04.826669Z",
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
  "client_id": "e2105334-f337-4aa9-8ecc-a1acfbbffd7d",
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
      "id": "2734c3b0-f4c6-45e9-b11b-658d6140909c",
      "at": "2026-10-28T15:05:03.504766Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
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
    "id": "fadc2afd-5305-4137-b6f0-4d02d20a01fe",
    "order_id": "5cb123e0-a540-46eb-bea9-6346906d6f07",
    "expires_at": "2026-10-28T15:05:19.836629Z",
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

`POST /api/driver/v1/offers/fadc2afd-5305-4137-b6f0-4d02d20a01fe/accept` → **200**

```json
{
  "command_id": "e6239c55-fc66-44a8-9efe-83be7c932d36"
}
```

```json
{
  "id": "36cd93af-3638-4e59-b889-7e00ecef9f63",
  "order_id": "5cb123e0-a540-46eb-bea9-6346906d6f07",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "84e00807-ba79-4e9c-bb76-d3c870b89b94",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "84e00807-ba79-4e9c-bb76-d3c870b89b94",
  "order_id": "5cb123e0-a540-46eb-bea9-6346906d6f07",
  "assignment_id": "36cd93af-3638-4e59-b889-7e00ecef9f63",
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

`POST /api/driver/v1/work-sessions/1783797e-eb5b-4794-8c28-65285b1ef135/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:05Z",
    "sequence": 1793199905821
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1783797e-eb5b-4794-8c28-65285b1ef135",
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
  "last_heartbeat_at": "2026-10-28T15:05:05.843125Z",
  "last_location_at": "2026-10-28T15:05:05.843125Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/84e00807-ba79-4e9c-bb76-d3c870b89b94/arrive` → **200**

```json
{
  "command_id": "cb14aef1-35a2-4920-bca8-201a0a0ddff5",
  "expected_version": 0
}
```

```json
{
  "id": "84e00807-ba79-4e9c-bb76-d3c870b89b94",
  "order_id": "5cb123e0-a540-46eb-bea9-6346906d6f07",
  "assignment_id": "36cd93af-3638-4e59-b889-7e00ecef9f63",
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
  "arrived_at": "2026-10-28T15:05:06.046141Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/84e00807-ba79-4e9c-bb76-d3c870b89b94/start` → **200**

```json
{
  "command_id": "55d41c44-727d-4f8d-a8c6-0a74ae7df1c0",
  "expected_version": 1
}
```

```json
{
  "id": "84e00807-ba79-4e9c-bb76-d3c870b89b94",
  "order_id": "5cb123e0-a540-46eb-bea9-6346906d6f07",
  "assignment_id": "36cd93af-3638-4e59-b889-7e00ecef9f63",
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
  "arrived_at": "2026-10-28T15:05:06.046141Z",
  "started_at": "2026-10-28T15:05:06.255588Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/84e00807-ba79-4e9c-bb76-d3c870b89b94/complete` → **200**

```json
{
  "command_id": "83e7259a-6234-4550-9b8c-168cc4e544d6",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:05:06Z",
  "cash_received": true
}
```

```json
{
  "id": "84e00807-ba79-4e9c-bb76-d3c870b89b94",
  "order_id": "5cb123e0-a540-46eb-bea9-6346906d6f07",
  "assignment_id": "36cd93af-3638-4e59-b889-7e00ecef9f63",
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
  "arrived_at": "2026-10-28T15:05:06.046141Z",
  "started_at": "2026-10-28T15:05:06.255588Z",
  "completed_at": "2026-10-28T15:05:06.484928Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e2105334-f337-4aa9-8ecc-a1acfbbffd7d",
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
      "id": "8952cad3-d63b-4e9f-b27a-68a3f0a92890",
      "at": "2026-10-28T15:05:07.462318Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "5cb123e0-a540-46eb-bea9-6346906d6f07"
    },
    {
      "id": "2734c3b0-f4c6-45e9-b11b-658d6140909c",
      "at": "2026-10-28T15:05:03.504766Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/c13f252a-6aad-4e45-a426-929ae7cf8039/archive` → **200**

```json
{
  "command_id": "cf9ecedd-389e-4418-8f68-141556d5a142",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "c13f252a-6aad-4e45-a426-929ae7cf8039",
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
  "created_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "created_at": "2026-10-28T15:05:02.684267Z",
  "updated_at": "2026-10-28T15:05:09.889697Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1783797e-eb5b-4794-8c28-65285b1ef135",
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
  "last_heartbeat_at": "2026-10-28T15:05:05.843125Z",
  "last_location_at": "2026-10-28T15:05:05.843125Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1783797e-eb5b-4794-8c28-65285b1ef135/close` → **200**

```json
{
  "command_id": "67c9395b-c5d4-4e4b-8e17-39f0f7e4ed58",
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

Done: order 5cb123e0-a540-46eb-bea9-6346906d6f07.

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
  "session_id": "611ed899-0715-4fe1-acf2-77eaab73725f",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MTAsImlhdCI6MTc5MzE5OTkxMCwianRpIjoiNmNhMjU4M2QtY2ZlYS00YzhhLWI4NjAtNTBhOTY4OWYwNzUxIiwic2lkIjoiNjExZWQ4OTktMDcxNS00ZmUxLWFjZjItNzdlYWFiNzM3MjVmIn0.uezyNMFttH41BkXtGSkRVlOk5XKQpoArtQYSWH1uMtc",
  "access_expires_at": "2026-10-28T15:20:10.731027423Z",
  "refresh_token": "LGOdCZ3HuqNPQumzq21VW_M2RgXDj5x3fwMvHX8r23s",
  "refresh_expires_at": "2026-10-29T03:05:10.730395548Z",
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
  "command_id": "54bd559f-0e2a-4172-9f01-08bb68cd6f75",
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
  "session_id": "5d6865dd-cfb4-4fda-98c1-a69bf7d4e472",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MTEsImlhdCI6MTc5MzE5OTkxMSwianRpIjoiMjYxNTUwNzctZTcwZC00ZTQ1LWE4Y2QtY2FjYTcyOGZlZGM4Iiwic2lkIjoiNWQ2ODY1ZGQtY2ZiNC00ZmRhLTk4YzEtYTY5YmY3ZDRlNDcyIn0.251ZwsIkAMv4VMTQvm-v426wZkhzd6_VADYt8onBnHQ",
  "access_expires_at": "2026-10-28T15:20:11.50959219Z",
  "refresh_token": "ITJPRvSN0xdPKtEHhqd0hpUQz-6Qu1JLVagQPFghZKk",
  "refresh_expires_at": "2026-10-29T03:05:11.508920845Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.455623300",
    "linkedid": "1730052700.455623300",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672694215"
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
    "id": "1730052700.455623300",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "bb8cc95a-dbc8-452a-91d8-c6bba7eb5a1b",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672694215",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:05:11.686767Z",
      "answered_at": null,
      "ended_at": "2026-10-28T15:05:11.708069Z",
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
    "id": "1730052600.2488015038",
    "linkedid": "1730052600.2488015038",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672694215"
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
      "id": "1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672694215",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:05:11.925967Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b/answer` → **200**

```json
{
  "command_id": "126b8d06-5572-41ee-aae8-34451030e20d"
}
```

```json
{
  "id": "1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672694215",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "order_ids": [],
  "started_at": "2026-10-28T15:05:11.925967Z",
  "answered_at": "2026-10-28T15:05:12.148092Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2488015038",
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
    "id": "1730052600.2488015038",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672694215",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "order_ids": [],
      "started_at": "2026-10-28T15:05:11.925967Z",
      "answered_at": "2026-10-28T15:05:12.148092Z",
      "ended_at": "2026-10-28T15:05:12.354704Z",
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
      "id": "1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672694215",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "order_ids": [],
      "started_at": "2026-10-28T15:05:11.925967Z",
      "answered_at": "2026-10-28T15:05:12.148092Z",
      "ended_at": "2026-10-28T15:05:12.354704Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:05:14.2774Z"
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
      "id": "1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672694215",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "order_ids": [],
      "started_at": "2026-10-28T15:05:11.925967Z",
      "answered_at": "2026-10-28T15:05:12.148092Z",
      "ended_at": "2026-10-28T15:05:12.354704Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:05:14.2774Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b` → **200**

```json
{
  "changes": [
    {
      "id": "92a74968-8bc6-4ae0-9c48-23f792e52411",
      "occurred_at": "2026-10-28T15:05:14.98742Z",
      "actor_type": "STAFF",
      "actor_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"e432b3ba-a6b7-4510-b273-2c5f7bea52fa\", \"order_ids\": []}",
      "correlation_id": "52c3052b-488c-470a-8d8c-cc5d41dc99c9"
    },
    {
      "id": "3cf5cf4c-72d8-4c2a-98e5-3ba51d22959d",
      "occurred_at": "2026-10-28T15:05:14.958357Z",
      "actor_type": "STAFF",
      "actor_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"e432b3ba-a6b7-4510-b273-2c5f7bea52fa\", \"order_ids\": []}",
      "correlation_id": "8713a624-6e5f-4092-9974-54b7b058856b"
    }
  ]
}
```

Done: call 1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10960"
}
```

```json
{
  "challenge_id": "35654635-3874-4430-bbc3-a3677450a4a9",
  "expires_at": "2026-10-28T15:10:15.208170924Z",
  "resend_available_at": "2026-10-28T15:05:16.208170924Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "100184",
  "sent_at": "2026-10-28T15:05:15.211233623Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35654635-3874-4430-bbc3-a3677450a4a9",
  "code": "100184",
  "device_ref": "sandbox-10960"
}
```

```json
{
  "session_id": "a65a0e98-101a-46ce-8c84-3b7629e97df9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDgxNSwiaWF0IjoxNzkzMTk5OTE1LCJqdGkiOiJmOWJmMDJkZS1kZjIyLTRhZWItYTdlOC0zN2NkOWY3Nzg1YWUiLCJzaWQiOiJhNjVhMGU5OC0xMDFhLTQ2Y2UtOGM4NC0zYjc2MjllOTdkZjkifQ.XzUqdBEM4kb8W807R0iK_N74uzeUiZnVncZ7GOspApo",
  "access_expires_at": "2026-10-28T15:20:15.419540866Z",
  "refresh_token": "-KdSlti_kcxVg67Lbc0zPI1nH5VWPczElsmvF0BjASM",
  "refresh_expires_at": "2026-11-27T15:05:15.418794868Z",
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
  "command_id": "337d3229-e283-4a2b-90a9-41fbd5bc9320",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:15Z",
    "sequence": 1793199915776
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07125b6c-f66b-4626-a5dd-119f0acc0807",
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
  "last_heartbeat_at": "2026-10-28T15:05:15.793804Z",
  "last_location_at": "2026-10-28T15:05:15.793804Z",
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
  "session_id": "8fae3428-168b-4263-a0af-9101c269c930",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MTYsImlhdCI6MTc5MzE5OTkxNiwianRpIjoiMDRiYTBmNDUtZTI5Yy00OTJkLTk3ZjAtNGM5MzdkOThkZGEwIiwic2lkIjoiOGZhZTM0MjgtMTY4Yi00MjYzLWEwYWYtOTEwMWMyNjljOTMwIn0.p7ushhf6XwYx1xe_sfiWs-0AaikqROYOXDxPAV9AJao",
  "access_expires_at": "2026-10-28T15:20:16.195207923Z",
  "refresh_token": "mNYYBwOGMYitujl9WROD3USf5B6a-dKj2fYpl65mkoA",
  "refresh_expires_at": "2026-10-29T03:05:16.194765854Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bfe5f328-ac02-4beb-8942-dd9d36c87314",
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
  "id": "57d93a1b-d892-4081-a915-acee9cad565a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:16.392919Z",
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
  "command_id": "55002b61-03c7-4dcf-9cab-c050be012e11",
  "quote_id": "57d93a1b-d892-4081-a915-acee9cad565a",
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
    "phone": "+380673672838"
  }
}
```

```json
{
  "id": "1ec974a5-0d29-4a80-890a-d724ecf9c2fa",
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
  "created_at": "2026-10-28T15:05:16.61034Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673672838"
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
    "id": "6dee9eeb-37ec-427d-b7d7-688a032ade04",
    "order_id": "1ec974a5-0d29-4a80-890a-d724ecf9c2fa",
    "expires_at": "2026-10-28T15:05:31.614319Z",
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

`POST /api/driver/v1/offers/6dee9eeb-37ec-427d-b7d7-688a032ade04/accept` → **200**

```json
{
  "command_id": "54cf2e97-3acb-4f02-97f9-b2a3473a849b"
}
```

```json
{
  "id": "33f63800-d46e-4beb-be5a-d7d01a508d78",
  "order_id": "1ec974a5-0d29-4a80-890a-d724ecf9c2fa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "19a401c4-194f-49a6-9c40-4ccbbb6b1c24",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673672838` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673672838` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673672838` → **200**

```json
[
  {
    "phone": "+380673672838",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:05:18.40937693Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673672838` → **200**

```json
[
  {
    "phone": "+380673672838",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:05:18.40937693Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673672838` → **200**

```json
[
  {
    "phone": "+380673672838",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:05:18.40937693Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "19a401c4-194f-49a6-9c40-4ccbbb6b1c24",
  "order_id": "1ec974a5-0d29-4a80-890a-d724ecf9c2fa",
  "assignment_id": "33f63800-d46e-4beb-be5a-d7d01a508d78",
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
    "phone": "+380673672838"
  }
}
```

`POST /api/driver/v1/work-sessions/07125b6c-f66b-4626-a5dd-119f0acc0807/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:19Z",
    "sequence": 1793199919491
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07125b6c-f66b-4626-a5dd-119f0acc0807",
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
  "last_heartbeat_at": "2026-10-28T15:05:19.508817Z",
  "last_location_at": "2026-10-28T15:05:19.508817Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/19a401c4-194f-49a6-9c40-4ccbbb6b1c24/arrive` → **200**

```json
{
  "command_id": "e621b7d2-bef7-4fef-afa1-5aadb6701d7c",
  "expected_version": 0
}
```

```json
{
  "id": "19a401c4-194f-49a6-9c40-4ccbbb6b1c24",
  "order_id": "1ec974a5-0d29-4a80-890a-d724ecf9c2fa",
  "assignment_id": "33f63800-d46e-4beb-be5a-d7d01a508d78",
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
  "arrived_at": "2026-10-28T15:05:19.699339Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673672838"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673672838` → **200**

```json
[
  {
    "phone": "+380673672838",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:05:18.40937693Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673672838` → **200**

```json
[
  {
    "phone": "+380673672838",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:05:18.40937693Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673672838` → **200**

```json
[
  {
    "phone": "+380673672838",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:05:18.40937693Z"
  },
  {
    "phone": "+380673672838",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:05:21.41776931Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673672838` → **200**

```json
[
  {
    "phone": "+380673672838",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:05:18.40937693Z"
  },
  {
    "phone": "+380673672838",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:05:21.41776931Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673672838` → **200**

```json
[
  {
    "phone": "+380673672838",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:05:18.40937693Z"
  },
  {
    "phone": "+380673672838",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:05:21.41776931Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/19a401c4-194f-49a6-9c40-4ccbbb6b1c24/start` → **200**

```json
{
  "command_id": "c2313bef-1205-453c-a557-27c30671a8ff",
  "expected_version": 1
}
```

```json
{
  "id": "19a401c4-194f-49a6-9c40-4ccbbb6b1c24",
  "order_id": "1ec974a5-0d29-4a80-890a-d724ecf9c2fa",
  "assignment_id": "33f63800-d46e-4beb-be5a-d7d01a508d78",
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
  "arrived_at": "2026-10-28T15:05:19.699339Z",
  "started_at": "2026-10-28T15:05:21.995981Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673672838"
  }
}
```

`POST /api/driver/v1/trips/19a401c4-194f-49a6-9c40-4ccbbb6b1c24/complete` → **200**

```json
{
  "command_id": "b8b5214e-a1e3-4190-9eff-430b20b2e6d3",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:05:22Z",
  "cash_received": true
}
```

```json
{
  "id": "19a401c4-194f-49a6-9c40-4ccbbb6b1c24",
  "order_id": "1ec974a5-0d29-4a80-890a-d724ecf9c2fa",
  "assignment_id": "33f63800-d46e-4beb-be5a-d7d01a508d78",
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
  "arrived_at": "2026-10-28T15:05:19.699339Z",
  "started_at": "2026-10-28T15:05:21.995981Z",
  "completed_at": "2026-10-28T15:05:22.188626Z",
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
  "session_id": "07125b6c-f66b-4626-a5dd-119f0acc0807",
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
  "last_heartbeat_at": "2026-10-28T15:05:19.508817Z",
  "last_location_at": "2026-10-28T15:05:19.508817Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/07125b6c-f66b-4626-a5dd-119f0acc0807/close` → **200**

```json
{
  "command_id": "3e2dd794-2f8f-4a96-848e-82d03c34d2f8",
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
  "phone": "+380639358074",
  "device_ref": "sandbox-9865"
}
```

```json
{
  "challenge_id": "d0f6b2ae-1d25-448f-a323-7cbed2aaca28",
  "expires_at": "2026-10-28T15:10:22.751340314Z",
  "resend_available_at": "2026-10-28T15:05:23.751340314Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639358074` → **200**

```json
{
  "phone": "+380639358074",
  "audience": "CLIENT",
  "code": "027870",
  "sent_at": "2026-10-28T15:05:22.753944188Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0f6b2ae-1d25-448f-a323-7cbed2aaca28",
  "code": "027870",
  "device_ref": "sandbox-9865"
}
```

```json
{
  "session_id": "6430e105-86cc-4a99-8c28-6d024463f036",
  "subject": {
    "type": "CLIENT",
    "id": "c24adc9d-9b3c-4a8c-ab31-102d6a9c616a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjRhZGM5ZC05YjNjLTRhOGMtYWIzMS0xMDJkNmE5YzYxNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODIyLCJpYXQiOjE3OTMxOTk5MjIsImp0aSI6IjE0ZjY3MjdiLTVlMDUtNGRiZS1hZGVjLTNjNmNmOWJlNzQxNCIsInNpZCI6IjY0MzBlMTA1LTg2Y2MtNGE5OS04YzI4LTZkMDI0NDYzZjAzNiJ9.x4jYlvnCAQuH347QKwGParWZ02uEHlUc_t_obWBvbEg",
  "access_expires_at": "2026-10-28T15:20:22.958176628Z",
  "refresh_token": "izRh_I9q3LcFIBUtZMrtCFmnbTYS62ux084dJ3BjKFo",
  "refresh_expires_at": "2026-11-27T15:05:22.957678216Z",
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
  "device_ref": "sandbox-21365"
}
```

```json
{
  "challenge_id": "41c8bef7-e798-4c55-8a53-2ba7f5a67205",
  "expires_at": "2026-10-28T15:10:23.316309106Z",
  "resend_available_at": "2026-10-28T15:05:24.316309106Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "095248",
  "sent_at": "2026-10-28T15:05:23.318829554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41c8bef7-e798-4c55-8a53-2ba7f5a67205",
  "code": "095248",
  "device_ref": "sandbox-21365"
}
```

```json
{
  "session_id": "c98a86e6-65e7-4d21-8b4d-f052bd92e61d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDgyMywiaWF0IjoxNzkzMTk5OTIzLCJqdGkiOiI3YjUzMzYzZS0zZWUyLTRlOTYtODM4OC0wNWQzZmMyMzJiNTkiLCJzaWQiOiJjOThhODZlNi02NWU3LTRkMjEtOGI0ZC1mMDUyYmQ5MmU2MWQifQ.JrWk3w3Cnib6p6Pa6JGc2unx3z_--Nvutn15f9OZ0WQ",
  "access_expires_at": "2026-10-28T15:20:23.527375432Z",
  "refresh_token": "LeJWfb2VwftyNSU3NXKyynD4dk1p0mC5uv4yDOIKgPU",
  "refresh_expires_at": "2026-11-27T15:05:23.526892283Z",
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
  "session_id": "4d89c685-522f-4884-95ab-150500b33e63",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MjQsImlhdCI6MTc5MzE5OTkyNCwianRpIjoiNDc5Nzk1MWQtZmE3My00NDgwLWE0ZjQtMjkzYTk1NjQxZDExIiwic2lkIjoiNGQ4OWM2ODUtNTIyZi00ODg0LTk1YWItMTUwNTAwYjMzZTYzIn0.sURvWmnMJJsJx5aZs0gUYLdPyVDCJqR3-nsZqpDk9_c",
  "access_expires_at": "2026-10-28T15:20:24.081255353Z",
  "refresh_token": "AdrX3vlF5jfcIjnT0lUSBMmT8NAObrG4IXWlANSIaZQ",
  "refresh_expires_at": "2026-10-29T03:05:24.080677299Z",
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
  "session_id": "4946523d-959a-4397-9393-d594821c6b23",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MjQsImlhdCI6MTc5MzE5OTkyNCwianRpIjoiODEyOWY1NzctOTRlNi00NmMzLThmMzItOTRkZTJkNzY4Y2VmIiwic2lkIjoiNDk0NjUyM2QtOTU5YS00Mzk3LTkzOTMtZDU5NDgyMWM2YjIzIn0.3kkpW62nXLIfl-2PAsvy2FKxJshkqki2XIC04lo7Zlw",
  "access_expires_at": "2026-10-28T15:20:24.490626835Z",
  "refresh_token": "t_HmPbhBOqeb8zflkMyti5S_vKVp-saBnPj4sk6c-yc",
  "refresh_expires_at": "2026-10-29T03:05:24.489905154Z",
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
  "command_id": "f56600aa-09b0-45dc-9161-9e0367b79b51",
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
  "id": "3177be0a-6efb-4c1b-bd59-734066e976d1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:24.862598Z",
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
  "command_id": "60b65e73-4df6-4d7f-b848-cce1eef10c38",
  "quote_id": "3177be0a-6efb-4c1b-bd59-734066e976d1",
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
  "id": "7b0e7b6a-5ea9-4c86-ae95-afbaa9b76b33",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c24adc9d-9b3c-4a8c-ab31-102d6a9c616a",
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
  "created_at": "2026-10-28T15:05:25.063594Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7b0e7b6a-5ea9-4c86-ae95-afbaa9b76b33` → **200**

```json
{
  "id": "7b0e7b6a-5ea9-4c86-ae95-afbaa9b76b33",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c24adc9d-9b3c-4a8c-ab31-102d6a9c616a",
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
  "created_at": "2026-10-28T15:05:25.063594Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7b0e7b6a-5ea9-4c86-ae95-afbaa9b76b33/cancel` → **200**

```json
{
  "command_id": "a25c6497-5fd0-450b-b1f4-006eb7a12fd0",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "7b0e7b6a-5ea9-4c86-ae95-afbaa9b76b33",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c24adc9d-9b3c-4a8c-ab31-102d6a9c616a",
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
  "created_at": "2026-10-28T15:05:25.063594Z",
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
  "command_id": "71b062b2-a3da-41a6-ad83-e625d84b1d98",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:25Z",
    "sequence": 1793199925891
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d363094f-d2ff-4681-89b7-de170759aabc",
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
  "last_heartbeat_at": "2026-10-28T15:05:25.908242Z",
  "last_location_at": "2026-10-28T15:05:25.908242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17688"
}
```

```json
{
  "challenge_id": "d68587f0-b662-4f5a-97d7-5956da849971",
  "expires_at": "2026-10-28T15:10:26.09482598Z",
  "resend_available_at": "2026-10-28T15:05:27.09482598Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "446336",
  "sent_at": "2026-10-28T15:05:26.097467803Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d68587f0-b662-4f5a-97d7-5956da849971",
  "code": "446336",
  "device_ref": "sandbox-17688"
}
```

```json
{
  "session_id": "b71e5bbf-6f69-4c8f-beb0-0c67e5053872",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDgyNiwiaWF0IjoxNzkzMTk5OTI2LCJqdGkiOiI0MTUwOWMyMC1hODI3LTRhOGMtOWI4Ny05Y2JhZGVkZmNhOGEiLCJzaWQiOiJiNzFlNWJiZi02ZjY5LTRjOGYtYmViMC0wYzY3ZTUwNTM4NzIifQ.6hIyqpZvQwIYoIBmIpIaHKhZCegt7jWYp6hOyYN-PtQ",
  "access_expires_at": "2026-10-28T15:20:26.302025206Z",
  "refresh_token": "GIi-3XW3AXD48Z6gBN4ZzpLvipQf9ORL-bhh_wDjFBc",
  "refresh_expires_at": "2026-11-27T15:05:26.301605491Z",
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
  "command_id": "ba5bf401-42ec-4f17-9848-d916ae444afb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:26Z",
    "sequence": 1793199926687
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18f2b738-94ef-481d-bc87-0e053cd1ecd7",
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
  "last_heartbeat_at": "2026-10-28T15:05:26.703457Z",
  "last_location_at": "2026-10-28T15:05:26.703457Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a4d2903b-22fb-4f5b-b1ee-7f33e7a431f7",
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
  "id": "8718f528-6905-4843-a23f-c211ec80e0a6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:26.899186Z",
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
  "command_id": "a3d698df-4da5-4716-93bb-c41494f38eed",
  "quote_id": "8718f528-6905-4843-a23f-c211ec80e0a6",
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
  "id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c24adc9d-9b3c-4a8c-ab31-102d6a9c616a",
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
  "created_at": "2026-10-28T15:05:27.131415Z",
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
    "id": "f3299769-e209-4b7b-b808-af0a0f823fe7",
    "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
    "expires_at": "2026-10-28T15:05:42.13432Z",
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

`POST /api/driver/v1/offers/f3299769-e209-4b7b-b808-af0a0f823fe7/accept` → **200**

```json
{
  "command_id": "6be1c7da-e4b6-4fff-a25f-3a54e042f204"
}
```

```json
{
  "id": "8f54b14d-8b78-4436-b7fc-973226cff5e4",
  "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "538485f0-99a8-4a49-a04b-06c3217566ae",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "538485f0-99a8-4a49-a04b-06c3217566ae",
  "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
  "assignment_id": "8f54b14d-8b78-4436-b7fc-973226cff5e4",
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

`POST /api/driver/v1/trips/538485f0-99a8-4a49-a04b-06c3217566ae/cancel` → **200**

```json
{
  "command_id": "16041485-3e13-4a64-9b1e-85369eda588b",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "538485f0-99a8-4a49-a04b-06c3217566ae",
  "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
  "assignment_id": "8f54b14d-8b78-4436-b7fc-973226cff5e4",
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

`GET /api/rider/v1/orders/06fd3bc4-5305-4bf8-b3d8-748387facf2a` → **200**

```json
{
  "id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c24adc9d-9b3c-4a8c-ab31-102d6a9c616a",
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
    "id": "8f54b14d-8b78-4436-b7fc-973226cff5e4",
    "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "538485f0-99a8-4a49-a04b-06c3217566ae",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:05:27.131415Z",
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
    "id": "27c6ad93-0248-43e4-814c-94264ebaa1b0",
    "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
    "expires_at": "2026-10-28T15:05:42.884375Z",
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

`POST /api/driver/v1/offers/27c6ad93-0248-43e4-814c-94264ebaa1b0/accept` → **200**

```json
{
  "command_id": "50dd386e-e36f-4b61-a689-bdf8cd62b2d9"
}
```

```json
{
  "id": "005831f4-b3cc-4b70-8b30-e97e906d0c6a",
  "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4cf7461b-077f-49ca-b28b-54606deee322",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4cf7461b-077f-49ca-b28b-54606deee322",
  "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
  "assignment_id": "005831f4-b3cc-4b70-8b30-e97e906d0c6a",
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

`POST /api/driver/v1/trips/4cf7461b-077f-49ca-b28b-54606deee322/cancel` → **200**

```json
{
  "command_id": "13ff815e-6dcb-4715-b6cd-c14e8a6191f9",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "4cf7461b-077f-49ca-b28b-54606deee322",
  "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
  "assignment_id": "005831f4-b3cc-4b70-8b30-e97e906d0c6a",
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
    "id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:05:27.131415Z",
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
    "id": "7b0e7b6a-5ea9-4c86-ae95-afbaa9b76b33",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:05:25.063594Z",
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

`GET /api/operator/v1/orders/06fd3bc4-5305-4bf8-b3d8-748387facf2a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:05:27.13196Z",
      "actor": {
        "type": "CLIENT",
        "id": "c24adc9d-9b3c-4a8c-ab31-102d6a9c616a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
        "quote_id": "8718f528-6905-4843-a23f-c211ec80e0a6",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "a1105325-8562-4a8f-8e4a-9c0cd2e0cbf3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:05:27.133355Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
        "attempt_id": "26eb0d94-2e8a-4c27-8b9c-486d1d7330b6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a1105325-8562-4a8f-8e4a-9c0cd2e0cbf3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:05:27.139238Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f3299769-e209-4b7b-b808-af0a0f823fe7",
        "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "a1105325-8562-4a8f-8e4a-9c0cd2e0cbf3"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:05:27.51057Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f3299769-e209-4b7b-b808-af0a0f823fe7",
        "order_id": "06fd3bc4-5305-4bf8-b3d8-748387facf2a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "8f54b14d-8b78-4436-b7fc-973226cff5e4"
      },
      "correlation_id": "a68d05cd-9b58-4d15-b6e5-5dc398f1bdda"
```

Done: orders 7b0e7b6a-5ea9-4c86-ae95-afbaa9b76b33, 06fd3bc4-5305-4bf8-b3d8-748387facf2a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736664790",
  "device_ref": "sandbox-3783"
}
```

```json
{
  "challenge_id": "7cbe5b85-d586-4b12-b5f5-ecde45ac6edc",
  "expires_at": "2026-10-28T15:10:29.374685631Z",
  "resend_available_at": "2026-10-28T15:05:30.374685631Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736664790` → **200**

```json
{
  "phone": "+380736664790",
  "audience": "CLIENT",
  "code": "177655",
  "sent_at": "2026-10-28T15:05:29.376954881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7cbe5b85-d586-4b12-b5f5-ecde45ac6edc",
  "code": "177655",
  "device_ref": "sandbox-3783"
}
```

```json
{
  "session_id": "8827e63b-6a07-4134-98bb-a50be0957c5d",
  "subject": {
    "type": "CLIENT",
    "id": "f34e1f9f-0b70-43b3-8199-66eb0c30d2bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMzRlMWY5Zi0wYjcwLTQzYjMtODE5OS02NmViMGMzMGQyYmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODI5LCJpYXQiOjE3OTMxOTk5MjksImp0aSI6IjNjYWIwMDEyLWY4YjEtNDc5Yy04YTg0LTMxOWY4NzRkOTI3YSIsInNpZCI6Ijg4MjdlNjNiLTZhMDctNDEzNC05OGJiLWE1MGJlMDk1N2M1ZCJ9.InvtqWNLFs3SiLQXmUH92efbSFQKrjM5CeSCdM09rpc",
  "access_expires_at": "2026-10-28T15:20:29.578042811Z",
  "refresh_token": "yJU-fHoJLNzL2otEDjzyW3bsH1GbY-fmZA3iKZ0Svu4",
  "refresh_expires_at": "2026-11-27T15:05:29.577595535Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "84963fde-7095-4ad7-8229-222f3de406c2",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "ee2e2a1f-9b3d-4035-93f9-b554365ac28c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-ee2e2a1f-9b3d-4035-93f9-b554365ac28c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a2e9d1cc19853969d135b05fa95bd2fb",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=ee2e2a1f-9b3d-4035-93f9-b554365ac28c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736664790"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=ee2e2a1f-9b3d-4035-93f9-b554365ac28c",
  "expires_at": "2026-10-28T15:35:29.769061Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/ee2e2a1f-9b3d-4035-93f9-b554365ac28c` → **200**

```json
{
  "id": "ee2e2a1f-9b3d-4035-93f9-b554365ac28c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T15:35:29.769061Z",
  "card": {
    "id": "f57fc583-fa46-482f-8763-23d83b9e7d6b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2246",
    "card_type": "Visa",
    "created_at": "2026-10-28T15:05:29.964956Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "f57fc583-fa46-482f-8763-23d83b9e7d6b",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2246",
      "card_type": "Visa",
      "created_at": "2026-10-28T15:05:29.964956Z"
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
  "device_ref": "sandbox-10070"
}
```

```json
{
  "challenge_id": "28e36f25-b7bb-4464-b687-85aed7c2a5cf",
  "expires_at": "2026-10-28T15:10:30.342512226Z",
  "resend_available_at": "2026-10-28T15:05:31.342512226Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "042527",
  "sent_at": "2026-10-28T15:05:30.344669366Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28e36f25-b7bb-4464-b687-85aed7c2a5cf",
  "code": "042527",
  "device_ref": "sandbox-10070"
}
```

```json
{
  "session_id": "7708e9aa-162f-48aa-b333-793fba8c17fd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDgzMCwiaWF0IjoxNzkzMTk5OTMwLCJqdGkiOiI5MjRlZjBmZS0xODk3LTQwYmEtYjY4OS1lMDhkZTJhMjUzOTQiLCJzaWQiOiI3NzA4ZTlhYS0xNjJmLTQ4YWEtYjMzMy03OTNmYmE4YzE3ZmQifQ.eyaKCnA5PrjyryIMROUad3AUcK7kYmB3S27DaHod7O0",
  "access_expires_at": "2026-10-28T15:20:30.539775824Z",
  "refresh_token": "h-wLtFBXYQq2ss978Qh7iUcUl91D23JQ_GAz65ZwSso",
  "refresh_expires_at": "2026-11-27T15:05:30.539331232Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18f2b738-94ef-481d-bc87-0e053cd1ecd7",
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
  "last_heartbeat_at": "2026-10-28T15:05:26.703457Z",
  "last_location_at": "2026-10-28T15:05:26.703457Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/18f2b738-94ef-481d-bc87-0e053cd1ecd7/handover` → **200**

```json
{
  "command_id": "a8710c8d-ada5-41e0-a6c9-74f01828b227",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18f2b738-94ef-481d-bc87-0e053cd1ecd7",
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
  "last_heartbeat_at": "2026-10-28T15:05:26.703457Z",
  "last_location_at": "2026-10-28T15:05:26.703457Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/18f2b738-94ef-481d-bc87-0e053cd1ecd7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:31Z",
    "sequence": 1793199931817
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18f2b738-94ef-481d-bc87-0e053cd1ecd7",
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
  "last_heartbeat_at": "2026-10-28T15:05:31.09941Z",
  "last_location_at": "2026-10-28T15:05:31.09941Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c1e9aaba-8be6-4a37-91c0-edb4ea0878a3",
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
  "id": "d7cd5072-763e-4e1b-ab20-37f86b749cad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:31.292624Z",
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
  "command_id": "44eafd00-dcae-416c-9bc2-58982f38b76e",
  "quote_id": "d7cd5072-763e-4e1b-ab20-37f86b749cad",
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
  "id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f34e1f9f-0b70-43b3-8199-66eb0c30d2bd",
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
  "created_at": "2026-10-28T15:05:31.486252Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f71a2a85-3d91-41dd-a4bd-7d22982b0196` → **200**

```json
{
  "id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f34e1f9f-0b70-43b3-8199-66eb0c30d2bd",
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
  "created_at": "2026-10-28T15:05:31.486252Z",
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
    "id": "bca31f2c-8ab4-408d-a1cf-f529d4f2021b",
    "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
    "expires_at": "2026-10-28T15:05:46.667055Z",
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

`POST /api/driver/v1/offers/bca31f2c-8ab4-408d-a1cf-f529d4f2021b/accept` → **200**

```json
{
  "command_id": "7e38a066-16d2-49d5-9890-6731f3572c7a"
}
```

```json
{
  "id": "87bcfa40-9fef-4cb0-a253-490c083d50b8",
  "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6edb0ecc-8922-42ff-9ca1-b696fe8d6541",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6edb0ecc-8922-42ff-9ca1-b696fe8d6541",
  "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
  "assignment_id": "87bcfa40-9fef-4cb0-a253-490c083d50b8",
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

`POST /api/driver/v1/work-sessions/18f2b738-94ef-481d-bc87-0e053cd1ecd7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:32Z",
    "sequence": 1793199932462
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18f2b738-94ef-481d-bc87-0e053cd1ecd7",
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
  "last_heartbeat_at": "2026-10-28T15:05:32.478856Z",
  "last_location_at": "2026-10-28T15:05:32.478856Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6edb0ecc-8922-42ff-9ca1-b696fe8d6541/arrive` → **200**

```json
{
  "command_id": "c500bec6-bd60-4d9c-8bac-304d34725eeb",
  "expected_version": 0
}
```

```json
{
  "id": "6edb0ecc-8922-42ff-9ca1-b696fe8d6541",
  "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
  "assignment_id": "87bcfa40-9fef-4cb0-a253-490c083d50b8",
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
  "arrived_at": "2026-10-28T15:05:32.667794Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6edb0ecc-8922-42ff-9ca1-b696fe8d6541/start` → **200**

```json
{
  "command_id": "6baf3c52-1f92-4106-a068-5eda1a3c8760",
  "expected_version": 1
}
```

```json
{
  "id": "6edb0ecc-8922-42ff-9ca1-b696fe8d6541",
  "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
  "assignment_id": "87bcfa40-9fef-4cb0-a253-490c083d50b8",
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
  "arrived_at": "2026-10-28T15:05:32.667794Z",
  "started_at": "2026-10-28T15:05:32.867321Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6edb0ecc-8922-42ff-9ca1-b696fe8d6541/complete` → **200**

```json
{
  "command_id": "4d15ad42-3143-41e2-8717-6874fdbd10b5",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:05:33Z",
  "cash_received": true
}
```

```json
{
  "id": "6edb0ecc-8922-42ff-9ca1-b696fe8d6541",
  "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
  "assignment_id": "87bcfa40-9fef-4cb0-a253-490c083d50b8",
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
  "arrived_at": "2026-10-28T15:05:32.667794Z",
  "started_at": "2026-10-28T15:05:32.867321Z",
  "completed_at": "2026-10-28T15:05:33.062862Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/f71a2a85-3d91-41dd-a4bd-7d22982b0196` → **200**

```json
{
  "id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f34e1f9f-0b70-43b3-8199-66eb0c30d2bd",
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
    "id": "87bcfa40-9fef-4cb0-a253-490c083d50b8",
    "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6edb0ecc-8922-42ff-9ca1-b696fe8d6541",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:05:31.486252Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f71a2a85-3d91-41dd-a4bd-7d22982b0196` → **200**

```json
{
  "id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f34e1f9f-0b70-43b3-8199-66eb0c30d2bd",
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
    "id": "87bcfa40-9fef-4cb0-a253-490c083d50b8",
    "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6edb0ecc-8922-42ff-9ca1-b696fe8d6541",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:05:31.486252Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f71a2a85-3d91-41dd-a4bd-7d22982b0196` → **200**

```json
{
  "id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "f34e1f9f-0b70-43b3-8199-66eb0c30d2bd",
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
    "id": "87bcfa40-9fef-4cb0-a253-490c083d50b8",
    "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6edb0ecc-8922-42ff-9ca1-b696fe8d6541",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:05:31.486252Z",
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

`GET /api/rider/v1/orders/f71a2a85-3d91-41dd-a4bd-7d22982b0196/tip` → **200**

```json
{
  "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
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
  "available_until": "2026-10-29T15:05:33.062862Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f71a2a85-3d91-41dd-a4bd-7d22982b0196/tip` → **201**

```json
{
  "command_id": "525a112c-0e22-4462-b725-fbe2e2f1cfff",
  "amount_minor": 2500
}
```

```json
{
  "id": "98104136-0f3b-4238-a371-48c3ed066bd6",
  "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:05:36.192057Z"
}
```

`GET /api/rider/v1/orders/f71a2a85-3d91-41dd-a4bd-7d22982b0196/tip` → **200**

```json
{
  "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
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
  "available_until": "2026-10-29T15:05:33.062862Z",
  "open": false,
  "tip": {
    "id": "98104136-0f3b-4238-a371-48c3ed066bd6",
    "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:05:36.192057Z"
  }
}
```

`GET /api/rider/v1/orders/f71a2a85-3d91-41dd-a4bd-7d22982b0196/tip` → **200**

```json
{
  "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
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
  "available_until": "2026-10-29T15:05:33.062862Z",
  "open": false,
  "tip": {
    "id": "98104136-0f3b-4238-a371-48c3ed066bd6",
    "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:05:36.192057Z"
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
      "id": "091ab0a8-d7da-41f0-9022-7125648c3437",
      "at": "2026-10-28T15:05:33.72293Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
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
      "id": "d43c7ff4-fb63-44c7-8ad1-fdf0c4436235",
      "at": "2026-10-28T15:05:37.770937Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
      "counterpart_id": null
    },
    {
      "id": "091ab0a8-d7da-41f0-9022-7125648c3437",
      "at": "2026-10-28T15:05:33.72293Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a617904f-5f6a-4ddb-9ecd-2e97ac04ae88",
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
  "id": "5c434381-a047-4418-8fd1-cf47e5481afb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:39.118605Z",
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
  "session_id": "7a3157b4-30c2-443a-82a1-903fba9f1282",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MzksImlhdCI6MTc5MzE5OTkzOSwianRpIjoiYjNjODAzMTUtNWQ0MC00MTQ3LWFkMDgtYmY0NGQ5OTBhNGY2Iiwic2lkIjoiN2EzMTU3YjQtMzBjMi00NDNhLTgyYTEtOTAzZmJhOWYxMjgyIn0.BB-uabVFKV4lUOXJeJNY3maVmN_40jOuDtAqTA7zgsk",
  "access_expires_at": "2026-10-28T15:20:39.518152931Z",
  "refresh_token": "6MTlbljkpiEvyCF8Pwmg0w5T1WjQL3RC8IRhcUIhDWA",
  "refresh_expires_at": "2026-10-29T03:05:39.517754289Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380736664790` → **200**

```json
{
  "client_id": "f34e1f9f-0b70-43b3-8199-66eb0c30d2bd"
}
```

`POST /api/admin/v1/rider-wallets/f34e1f9f-0b70-43b3-8199-66eb0c30d2bd/top-ups` → **201**

```json
{
  "command_id": "f76302e9-f6a2-48e4-9929-43b1b6f515d4",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "f34e1f9f-0b70-43b3-8199-66eb0c30d2bd",
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
      "id": "f8b77467-2b7d-4c37-9c85-fab0173cfe33",
      "at": "2026-10-28T15:05:39.898867Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "06b1979b-bc87-4b1f-8a21-f1aa2cc44c51",
  "quote_id": "5c434381-a047-4418-8fd1-cf47e5481afb",
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
  "id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f34e1f9f-0b70-43b3-8199-66eb0c30d2bd",
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
  "created_at": "2026-10-28T15:05:40.100242Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a306588b-d57e-4f45-a56b-f82bebe6a85a` → **200**

```json
{
  "id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f34e1f9f-0b70-43b3-8199-66eb0c30d2bd",
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
  "created_at": "2026-10-28T15:05:40.100242Z",
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
    "id": "efc27845-7558-4395-a0d6-c496d963367c",
    "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
    "expires_at": "2026-10-28T15:05:55.103545Z",
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

`POST /api/driver/v1/offers/efc27845-7558-4395-a0d6-c496d963367c/accept` → **200**

```json
{
  "command_id": "9d3b0576-4c87-41e7-bfe1-d660fb94ee5b"
}
```

```json
{
  "id": "7f4757cb-81bf-424f-83f3-0ff07a813b75",
  "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6977d93e-a68e-49b4-a3ca-940ae25e7caf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6977d93e-a68e-49b4-a3ca-940ae25e7caf",
  "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
  "assignment_id": "7f4757cb-81bf-424f-83f3-0ff07a813b75",
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

`POST /api/driver/v1/work-sessions/18f2b738-94ef-481d-bc87-0e053cd1ecd7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:41Z",
    "sequence": 1793199941752
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18f2b738-94ef-481d-bc87-0e053cd1ecd7",
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
  "last_heartbeat_at": "2026-10-28T15:05:41.093482Z",
  "last_location_at": "2026-10-28T15:05:41.093482Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6977d93e-a68e-49b4-a3ca-940ae25e7caf/arrive` → **200**

```json
{
  "command_id": "2892a2ee-8a38-424c-8d61-c6ad0ed57a99",
  "expected_version": 0
}
```

```json
{
  "id": "6977d93e-a68e-49b4-a3ca-940ae25e7caf",
  "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
  "assignment_id": "7f4757cb-81bf-424f-83f3-0ff07a813b75",
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
  "arrived_at": "2026-10-28T15:05:41.333046Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6977d93e-a68e-49b4-a3ca-940ae25e7caf/start` → **200**

```json
{
  "command_id": "08a53198-e939-4e93-bdfb-8af9d3ae9224",
  "expected_version": 1
}
```

```json
{
  "id": "6977d93e-a68e-49b4-a3ca-940ae25e7caf",
  "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
  "assignment_id": "7f4757cb-81bf-424f-83f3-0ff07a813b75",
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
  "arrived_at": "2026-10-28T15:05:41.333046Z",
  "started_at": "2026-10-28T15:05:41.534784Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6977d93e-a68e-49b4-a3ca-940ae25e7caf/complete` → **200**

```json
{
  "command_id": "2b4560bc-68ab-4828-91da-ef9d35c10adf",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:05:41Z",
  "cash_received": true
}
```

```json
{
  "id": "6977d93e-a68e-49b4-a3ca-940ae25e7caf",
  "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
  "assignment_id": "7f4757cb-81bf-424f-83f3-0ff07a813b75",
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
  "arrived_at": "2026-10-28T15:05:41.333046Z",
  "started_at": "2026-10-28T15:05:41.534784Z",
  "completed_at": "2026-10-28T15:05:41.744834Z",
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
  "client_id": "f34e1f9f-0b70-43b3-8199-66eb0c30d2bd",
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
      "id": "2a4a52ae-4ed7-4809-a656-9554fd7061fc",
      "at": "2026-10-28T15:05:41.80828Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a"
    },
    {
      "id": "f8b77467-2b7d-4c37-9c85-fab0173cfe33",
      "at": "2026-10-28T15:05:39.898867Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
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

`GET /api/rider/v1/orders/a306588b-d57e-4f45-a56b-f82bebe6a85a/tip` → **200**

```json
{
  "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
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
  "available_until": "2026-10-29T15:05:41.744834Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a306588b-d57e-4f45-a56b-f82bebe6a85a/tip` → **201**

```json
{
  "command_id": "aa7560bf-9170-4cb9-9c24-df637162ccd7",
  "amount_minor": 2500
}
```

```json
{
  "id": "854596b4-9e6e-452c-8c3f-c7a35258a437",
  "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:05:42.550954Z"
}
```

`GET /api/rider/v1/orders/a306588b-d57e-4f45-a56b-f82bebe6a85a/tip` → **200**

```json
{
  "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
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
  "available_until": "2026-10-29T15:05:41.744834Z",
  "open": false,
  "tip": {
    "id": "854596b4-9e6e-452c-8c3f-c7a35258a437",
    "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:05:42.550954Z"
  }
}
```

`GET /api/rider/v1/orders/a306588b-d57e-4f45-a56b-f82bebe6a85a/tip` → **200**

```json
{
  "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
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
  "available_until": "2026-10-29T15:05:41.744834Z",
  "open": false,
  "tip": {
    "id": "854596b4-9e6e-452c-8c3f-c7a35258a437",
    "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:05:42.550954Z"
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
      "id": "075e02ab-b691-4449-b7cb-99881eacc222",
      "at": "2026-10-28T15:05:43.826438Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
      "counterpart_id": null
    },
    {
      "id": "ec792b03-f1c5-4257-8736-f6ecc43a86ce",
      "at": "2026-10-28T15:05:41.805284Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a306588b-d57e-4f45-a56b-f82bebe6a85a",
      "counterpart_id": null
    },
    {
      "id": "d43c7ff4-fb63-44c7-8ad1-fdf0c4436235",
      "at": "2026-10-28T15:05:37.770937Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
      "counterpart_id": null
    },
    {
      "id": "091ab0a8-d7da-41f0-9022-7125648c3437",
      "at": "2026-10-28T15:05:33.72293Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f71a2a85-3d91-41dd-a4bd-7d22982b0196",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18f2b738-94ef-481d-bc87-0e053cd1ecd7",
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
  "last_heartbeat_at": "2026-10-28T15:05:41.093482Z",
  "last_location_at": "2026-10-28T15:05:41.093482Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/18f2b738-94ef-481d-bc87-0e053cd1ecd7/close` → **200**

```json
{
  "command_id": "0173ca68-fb78-4572-9969-7e00fa615f2b",
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

Done: card order a306588b-d57e-4f45-a56b-f82bebe6a85a.

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
  "phone": "+380737913076",
  "device_ref": "sandbox-1934"
}
```

```json
{
  "challenge_id": "ecfe4cd4-7838-4d59-a04a-27822cfe88d6",
  "expires_at": "2026-10-28T15:10:44.895601046Z",
  "resend_available_at": "2026-10-28T15:05:45.895601046Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737913076` → **200**

```json
{
  "phone": "+380737913076",
  "audience": "CLIENT",
  "code": "920177",
  "sent_at": "2026-10-28T15:05:44.897747341Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecfe4cd4-7838-4d59-a04a-27822cfe88d6",
  "code": "920177",
  "device_ref": "sandbox-1934"
}
```

```json
{
  "session_id": "3a9e6cff-8ca9-4638-b39c-700ecfdf4374",
  "subject": {
    "type": "CLIENT",
    "id": "32907c8e-c5de-4358-88a8-4f80269bb034"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMjkwN2M4ZS1jNWRlLTQzNTgtODhhOC00ZjgwMjY5YmIwMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODQ1LCJpYXQiOjE3OTMxOTk5NDUsImp0aSI6ImRjMDU2MDRjLWU3OTEtNDQ1Yy1iN2U2LWM1M2Q0NDljODgyOCIsInNpZCI6IjNhOWU2Y2ZmLThjYTktNDYzOC1iMzljLTcwMGVjZmRmNDM3NCJ9.H2PAwVpoYGAp4N2H1-Gjy0dnhQJ8lm-YBaNb6DnAkQE",
  "access_expires_at": "2026-10-28T15:20:45.107160754Z",
  "refresh_token": "PXAya3baVtkvhwO-vPWWYPxWN6_MrNzsojRhmHjpMXw",
  "refresh_expires_at": "2026-11-27T15:05:45.106702041Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "b92248b6-cc0c-4e54-853d-ac3ad40c4669",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "e19482a4-fbd2-4b7e-8bab-262bb9bcb6ee",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e19482a4-fbd2-4b7e-8bab-262bb9bcb6ee",
    "orderDate": "1793199945",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "b8741f35c35a576f84055c18c9cc5d24",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e19482a4-fbd2-4b7e-8bab-262bb9bcb6ee",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737913076"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e19482a4-fbd2-4b7e-8bab-262bb9bcb6ee",
  "created_at": "2026-10-28T15:05:45.293211Z",
  "expires_at": "2026-10-28T15:35:45.293211Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/e19482a4-fbd2-4b7e-8bab-262bb9bcb6ee` → **200**

```json
{
  "id": "e19482a4-fbd2-4b7e-8bab-262bb9bcb6ee",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:05:45.293211Z",
  "expires_at": "2026-10-28T15:35:45.293211Z",
  "completed_at": "2026-10-28T15:05:45.486568Z",
  "masked_pan": "41****6552",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "32907c8e-c5de-4358-88a8-4f80269bb034",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "32907c8e-c5de-4358-88a8-4f80269bb034",
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
      "id": "4dbc26af-7080-46ff-95bd-06bcb4954fd9",
      "at": "2026-10-28T15:05:45.837452Z",
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
  "client_id": "32907c8e-c5de-4358-88a8-4f80269bb034",
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
      "id": "4dbc26af-7080-46ff-95bd-06bcb4954fd9",
      "at": "2026-10-28T15:05:45.837452Z",
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
  "device_ref": "sandbox-31"
}
```

```json
{
  "challenge_id": "99ee67e5-db3c-44ab-a38d-04445f7a5172",
  "expires_at": "2026-10-28T15:10:47.325353102Z",
  "resend_available_at": "2026-10-28T15:05:48.325353102Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "235247",
  "sent_at": "2026-10-28T15:05:47.327726428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99ee67e5-db3c-44ab-a38d-04445f7a5172",
  "code": "235247",
  "device_ref": "sandbox-31"
}
```

```json
{
  "session_id": "5ab6b7b0-9963-47df-b558-c3422853ec7d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDg0NywiaWF0IjoxNzkzMTk5OTQ3LCJqdGkiOiJmMWZiY2QwNy03OTUxLTRmNzctYWE2Ny03N2Y4NjBhNTM1M2UiLCJzaWQiOiI1YWI2YjdiMC05OTYzLTQ3ZGYtYjU1OC1jMzQyMjg1M2VjN2QifQ.zlFIMtpErg8ObNVWOEp3_-wb9BKjY5ULltwrmVCEEh8",
  "access_expires_at": "2026-10-28T15:20:47.535033449Z",
  "refresh_token": "IVBRCrhicrW-qnyg6bxdTF3fdP55gEBJ3-n8K9BRktM",
  "refresh_expires_at": "2026-11-27T15:05:47.534577179Z",
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
  "command_id": "88f00271-505f-463c-b418-3120ab703cb1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "5788561a-0037-4eec-837a-da6a8bfd48ed",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-5788561a-0037-4eec-837a-da6a8bfd48ed",
    "orderDate": "1793199947",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "a843c7108133f7f2b69d688e60ad6c23",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=5788561a-0037-4eec-837a-da6a8bfd48ed",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=5788561a-0037-4eec-837a-da6a8bfd48ed",
  "created_at": "2026-10-28T15:05:47.901958Z",
  "expires_at": "2026-10-28T15:35:47.901958Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/5788561a-0037-4eec-837a-da6a8bfd48ed` → **200**

```json
{
  "id": "5788561a-0037-4eec-837a-da6a8bfd48ed",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:05:47.901958Z",
  "expires_at": "2026-10-28T15:35:47.901958Z",
  "completed_at": "2026-10-28T15:05:48.088947Z",
  "masked_pan": "41****2409",
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
      "id": "1f210433-8b7a-4141-8bfb-19a67c130a4d",
      "at": "2026-10-28T15:05:48.845389Z",
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
  "command_id": "e35e053c-8e71-4a7f-8a21-0d2314f9b607",
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
  "correlation_id": "b3d234a7-3aa9-49b4-882a-cb6740bc429b"
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
  "session_id": "a14dbc35-3ccf-42e0-b786-ce0bae10517b",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NTAsImlhdCI6MTc5MzE5OTk1MCwianRpIjoiM2JkM2Y1OGItZjcxZi00ZTAwLTk5Y2YtNzFjNjJkZTZhYTdlIiwic2lkIjoiYTE0ZGJjMzUtM2NjZi00MmUwLWI3ODYtY2UwYmFlMTA1MTdiIn0.n3zTZ-kbCaHmxVTiOrGW7cI573MNOuZwIIM_WVpm1lk",
  "access_expires_at": "2026-10-28T15:20:50.072662085Z",
  "refresh_token": "WNAmj8tvC7ECDjTPpWjrbmv6L2A05cRZteUEWgpqn_s",
  "refresh_expires_at": "2026-10-29T03:05:50.072248911Z",
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
  "phone": "+48600882394",
  "device_ref": "sandbox-23958"
}
```

```json
{
  "challenge_id": "5590571e-39fb-4172-867d-e931deedf087",
  "expires_at": "2026-10-28T15:10:50.626417398Z",
  "resend_available_at": "2026-10-28T15:05:51.626417398Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600882394` → **200**

```json
{
  "phone": "+48600882394",
  "audience": "CLIENT",
  "code": "440355",
  "sent_at": "2026-10-28T15:05:50.628419754Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5590571e-39fb-4172-867d-e931deedf087",
  "code": "440355",
  "device_ref": "sandbox-23958"
}
```

```json
{
  "session_id": "054955fb-03c6-46e3-8991-50683860ed11",
  "subject": {
    "type": "CLIENT",
    "id": "73a4c21c-326d-4f84-9d8f-b1fe6b497557"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3M2E0YzIxYy0zMjZkLTRmODQtOWQ4Zi1iMWZlNmI0OTc1NTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODUwLCJpYXQiOjE3OTMxOTk5NTAsImp0aSI6IjYyM2FkZWRmLWQ4YjMtNGJhMi05YzExLTAwNGI5Mzg5OGM2ZSIsInNpZCI6IjA1NDk1NWZiLTAzYzYtNDZlMy04OTkxLTUwNjgzODYwZWQxMSJ9.jpNEaq3_3IYRHhCVX3gB_XrNPohmpj1LpTHBs6HPjBs",
  "access_expires_at": "2026-10-28T15:20:50.830056274Z",
  "refresh_token": "qXW4I7Wo0f3ox263N0h4EdNUneqLsbHAP8ft9hVHn-8",
  "refresh_expires_at": "2026-11-27T15:05:50.829709279Z",
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
  "command_id": "b7d495ee-1109-4a9f-b8f3-531b6441fab8",
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
  "correlation_id": "bc0dd1c0-f73d-4eda-874d-e8f96b176e7d",
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
  "command_id": "5e8f0d35-1887-4cfb-9511-e2a55ad3826a",
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
  "paused_at": "2026-10-28T15:05:51.566270647Z",
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
  "command_id": "5265e861-def9-4306-97f8-c586b632c1c1",
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
  "id": "ad672e68-3674-4f98-b26e-64a98e452d91",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:51.942699Z",
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
  "command_id": "049fba6a-9487-42b7-8752-3f846f1819ad",
  "quote_id": "ad672e68-3674-4f98-b26e-64a98e452d91",
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
  "correlation_id": "d348a694-4210-4a87-abb1-41ecb395418e"
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
  "paused_at": "2026-10-28T15:05:51.566271Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "0aa351b0-cf0e-4a7d-9abb-e41108c449b5",
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
  "command_id": "1c1051a6-63e9-46d3-8a80-c37ffd3d7334",
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
  "command_id": "09c31260-d8f8-4901-a2c4-59d431b8633d",
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
  "id": "62f6d0c9-7e00-487e-96e6-405541695867",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:53.057073Z",
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
  "command_id": "f48fad95-7bc3-4bd1-90e6-53e3b0be9d9e",
  "quote_id": "62f6d0c9-7e00-487e-96e6-405541695867",
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
  "correlation_id": "83682b7b-687c-43a2-85fc-6e3ec4c3fb56"
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
  "command_id": "7ea14995-ec28-4753-8d2f-6b69af78a2b1",
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
  "command_id": "0f9cae2c-20aa-4691-ac77-4bac22edf596",
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
  "id": "f00526db-c4fa-4161-a4bd-5aa953a7350b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:53.794866Z",
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
  "command_id": "bae57497-78e6-4182-9dea-8d645b820383",
  "quote_id": "f00526db-c4fa-4161-a4bd-5aa953a7350b",
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
  "correlation_id": "98db2375-5424-4898-8796-8ee056d73a38"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "643f1116-2008-44d3-8061-1c9661d0d313",
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
  "correlation_id": "28c3e6ea-b7c6-487e-87b2-480657aa2eb3"
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
  "command_id": "ef8b249a-00e1-41c7-ad73-c3cfd741e80f",
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
  "phone": "+380675328757",
  "device_ref": "sandbox-19712"
}
```

```json
{
  "challenge_id": "48e647d5-03e0-4027-8dd8-bf7ba05b44cb",
  "expires_at": "2026-10-28T15:10:54.779317179Z",
  "resend_available_at": "2026-10-28T15:05:55.779317179Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675328757` → **200**

```json
{
  "phone": "+380675328757",
  "audience": "CLIENT",
  "code": "318246",
  "sent_at": "2026-10-28T15:05:54.78118964Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48e647d5-03e0-4027-8dd8-bf7ba05b44cb",
  "code": "318246",
  "device_ref": "sandbox-19712"
}
```

```json
{
  "session_id": "16f33484-322d-4118-b355-9edbd3725752",
  "subject": {
    "type": "CLIENT",
    "id": "aa95724f-67e1-4d72-b542-e1b1ee4e12de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYTk1NzI0Zi02N2UxLTRkNzItYjU0Mi1lMWIxZWU0ZTEyZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODU0LCJpYXQiOjE3OTMxOTk5NTQsImp0aSI6IjlhMDYxMTY5LTU1MzctNDg2YS1iMTk0LTc4N2MyMzI0MWFjNCIsInNpZCI6IjE2ZjMzNDg0LTMyMmQtNDExOC1iMzU1LTllZGJkMzcyNTc1MiJ9.Qd0ki8JcEkr3SnxOORLn4FAIfGyNYtZ8pl_meTP6dDU",
  "access_expires_at": "2026-10-28T15:20:54.980876481Z",
  "refresh_token": "MLBdgUxNW1g83LbzjhJ-U17Mcz187iPrDwrEPXUU8tU",
  "refresh_expires_at": "2026-11-27T15:05:54.98045218Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "aa95724f-67e1-4d72-b542-e1b1ee4e12de",
  "session_id": "16f33484-322d-4118-b355-9edbd3725752",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ffecc05d-9596-4b12-92b6-d6761d803e08",
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
  "id": "95a6266b-9a9a-488e-b20c-c3e134de3561",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:55.325534Z",
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
  "challenge_id": "4f3c1c28-ac4f-4380-b421-86d442b7e9ff",
  "expires_at": "2026-10-28T15:10:57.508470241Z",
  "resend_available_at": "2026-10-28T15:05:58.508470241Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675328757` → **200**

```json
{
  "phone": "+380675328757",
  "audience": "CLIENT",
  "code": "528354",
  "sent_at": "2026-10-28T15:05:57.510263432Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "c72b4cd1-5488-4349-9ee6-cdd62abbd97a",
  "challenge_id": "4f3c1c28-ac4f-4380-b421-86d442b7e9ff",
  "otp_code": "528354"
}
```

```json
{
  "client_id": "aa95724f-67e1-4d72-b542-e1b1ee4e12de",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T15:05:57.715290248Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "71f9283f-06ee-4f77-85b8-3c54eaebf8ac",
  "quote_id": "95a6266b-9a9a-488e-b20c-c3e134de3561",
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
  "correlation_id": "489ef816-8d78-487c-b57a-67961d9eea34"
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
  "session_id": "bd76648e-d3fe-45de-9963-9b959841f995",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NTgsImlhdCI6MTc5MzE5OTk1OCwianRpIjoiOWZhMzIyYTktNjA1Ni00NjFiLWE4YjctZGJkOTMxZDkyMDQwIiwic2lkIjoiYmQ3NjY0OGUtZDNmZS00NWRlLTk5NjMtOWI5NTk4NDFmOTk1In0.2xh6PGUOzANeBYhlGem6XaaPlci2Y2uKSNvY3iJPmGE",
  "access_expires_at": "2026-10-28T15:20:58.290403431Z",
  "refresh_token": "4j1WyP8tKgbD7tFFm80aWOkx4wLCSNxdnSMHOxzPGRU",
  "refresh_expires_at": "2026-10-29T03:05:58.290069887Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "aa95724f-67e1-4d72-b542-e1b1ee4e12de",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T15:05:57.71529Z",
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

`POST /api/admin/v1/client-deletions/aa95724f-67e1-4d72-b542-e1b1ee4e12de/complete` → **200**

```json
{
  "command_id": "9173f706-275d-4e38-af10-ffecebf056b5",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "aa95724f-67e1-4d72-b542-e1b1ee4e12de",
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
  "correlation_id": "ebedd379-c300-4a13-bdf5-a5e4c1564293"
}
```

Done: client aa95724f-67e1-4d72-b542-e1b1ee4e12de anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660453902",
  "device_ref": "sandbox-9459"
}
```

```json
{
  "challenge_id": "c19abbde-6142-431f-8b16-c5671f4d5ff6",
  "expires_at": "2026-10-28T15:10:59.073210861Z",
  "resend_available_at": "2026-10-28T15:06:00.073210861Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660453902` → **200**

```json
{
  "phone": "+380660453902",
  "audience": "CLIENT",
  "code": "075059",
  "sent_at": "2026-10-28T15:05:59.075203734Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c19abbde-6142-431f-8b16-c5671f4d5ff6",
  "code": "075059",
  "device_ref": "sandbox-9459"
}
```

```json
{
  "session_id": "1f979b6b-5c29-4d2f-9a7a-4a5583a565da",
  "subject": {
    "type": "CLIENT",
    "id": "d9590ec6-248d-4e49-97de-4a49cda07075"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTU5MGVjNi0yNDhkLTRlNDktOTdkZS00YTQ5Y2RhMDcwNzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODU5LCJpYXQiOjE3OTMxOTk5NTksImp0aSI6IjkyMmZhZGZiLTczMDMtNDk1Zi1hNjlmLWM0ZjNhMDRlMjJkMCIsInNpZCI6IjFmOTc5YjZiLTVjMjktNGQyZi05YTdhLTRhNTU4M2E1NjVkYSJ9.kDhFTpEIwKlhmu9rdsqJc2fhy8BYJ1ZuJJRJR2pccZw",
  "access_expires_at": "2026-10-28T15:20:59.271036091Z",
  "refresh_token": "oXuXovCsoKLMHQ4SmI2znEcGhcynGEfRh7PCyvPGS0Q",
  "refresh_expires_at": "2026-11-27T15:05:59.27057901Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d9590ec6-248d-4e49-97de-4a49cda07075",
  "session_id": "1f979b6b-5c29-4d2f-9a7a-4a5583a565da",
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
  "session_id": "fe801406-93c3-4d23-b799-6aa6d7c15043",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NTksImlhdCI6MTc5MzE5OTk1OSwianRpIjoiMzdiM2FjMWYtMWY2My00ZmY3LTg3MDctOThiNDVlZWJiZGM4Iiwic2lkIjoiZmU4MDE0MDYtOTNjMy00ZDIzLWI3OTktNmFhNmQ3YzE1MDQzIn0.YQVS0l1qpkLWduVvX4KxqkIgfHS4om_sb32aZHKdRQk",
  "access_expires_at": "2026-10-28T15:20:59.835360756Z",
  "refresh_token": "Fu3rBGO8IPKW8wmIfLU-IkvY88r5fJklp66v_YWLlVQ",
  "refresh_expires_at": "2026-10-29T03:05:59.834944937Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0453902&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "d9590ec6-248d-4e49-97de-4a49cda07075",
      "phone": "+380660453902",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T15:05:59.269008Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/d9590ec6-248d-4e49-97de-4a49cda07075` → **200**

```json
{
  "client": {
    "id": "d9590ec6-248d-4e49-97de-4a49cda07075",
    "phone": "+380660453902",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:05:59.269008Z",
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

`POST /api/admin/v1/clients/d9590ec6-248d-4e49-97de-4a49cda07075/block` → **400**

```json
{
  "command_id": "1d9b36a3-0218-4386-a074-00df93216b8d",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/d9590ec6-248d-4e49-97de-4a49cda07075/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d667245d-2477-4345-aebe-0be198cf213f",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/d9590ec6-248d-4e49-97de-4a49cda07075/block` → **200**

```json
{
  "command_id": "0af0ea46-b2e1-4998-9520-eed303a5632f",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "d9590ec6-248d-4e49-97de-4a49cda07075",
  "phone": "+380660453902",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T15:05:59.269008Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T15:06:00.586546Z",
    "by": "41b39d15-7936-4b20-b8c7-04f8c064b914"
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
  "correlation_id": "df14b3a2-ab8d-4827-b963-8cac9b345e1a"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660453902",
  "device_ref": "sandbox-731"
}
```

```json
{
  "challenge_id": "169dc4cf-8dd6-4417-b075-9bcd09548107",
  "expires_at": "2026-10-28T15:11:02.950076715Z",
  "resend_available_at": "2026-10-28T15:06:03.950076715Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660453902` → **200**

```json
{
  "phone": "+380660453902",
  "audience": "CLIENT",
  "code": "712106",
  "sent_at": "2026-10-28T15:06:02.956369518Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "169dc4cf-8dd6-4417-b075-9bcd09548107",
  "code": "712106",
  "device_ref": "sandbox-731"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "33a0e0e7-d135-4513-9cd5-e38c4abb185c"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/d9590ec6-248d-4e49-97de-4a49cda07075` → **200**

```json
{
  "client": {
    "id": "d9590ec6-248d-4e49-97de-4a49cda07075",
    "phone": "+380660453902",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T15:05:59.269008Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T15:06:00.586546Z",
      "by": "41b39d15-7936-4b20-b8c7-04f8c064b914"
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

`POST /api/admin/v1/clients/d9590ec6-248d-4e49-97de-4a49cda07075/unblock` → **200**

```json
{
  "command_id": "b5b90c01-2527-4b6a-9373-634ad68bd92c",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "d9590ec6-248d-4e49-97de-4a49cda07075",
  "phone": "+380660453902",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T15:05:59.269008Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660453902",
  "device_ref": "sandbox-26503"
}
```

```json
{
  "challenge_id": "1b6c2daf-c36e-49a4-942e-5a6570f9c065",
  "expires_at": "2026-10-28T15:11:05.733667918Z",
  "resend_available_at": "2026-10-28T15:06:06.733667918Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660453902` → **200**

```json
{
  "phone": "+380660453902",
  "audience": "CLIENT",
  "code": "374072",
  "sent_at": "2026-10-28T15:06:05.735307196Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b6c2daf-c36e-49a4-942e-5a6570f9c065",
  "code": "374072",
  "device_ref": "sandbox-26503"
}
```

```json
{
  "session_id": "e6626fba-5c6e-4635-9831-02b668e567f0",
  "subject": {
    "type": "CLIENT",
    "id": "d9590ec6-248d-4e49-97de-4a49cda07075"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTU5MGVjNi0yNDhkLTRlNDktOTdkZS00YTQ5Y2RhMDcwNzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODY1LCJpYXQiOjE3OTMxOTk5NjUsImp0aSI6ImUyNDAzNTkzLTIxNmEtNDhhZC04ODM0LTQzZDQ5ODBlYmI4ZiIsInNpZCI6ImU2NjI2ZmJhLTVjNmUtNDYzNS05ODMxLTAyYjY2OGU1NjdmMCJ9.6TCO5CUPG5ZVKuqidmRFWbgSN5wcoE2_tcd59wKqVc8",
  "access_expires_at": "2026-10-28T15:21:05.93331616Z",
  "refresh_token": "04y2rFU2H0A6PuCZPqlD9ry8KhrqleozKw7niCNf5q8",
  "refresh_expires_at": "2026-11-27T15:06:05.932930217Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d9590ec6-248d-4e49-97de-4a49cda07075",
  "session_id": "e6626fba-5c6e-4635-9831-02b668e567f0",
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
  "phone": "+380664476752",
  "device_ref": "sandbox-25747"
}
```

```json
{
  "challenge_id": "a94d5143-a727-4f93-997f-921b5c8d5a17",
  "expires_at": "2026-10-28T15:11:06.304100358Z",
  "resend_available_at": "2026-10-28T15:06:07.304100358Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664476752` → **200**

```json
{
  "phone": "+380664476752",
  "audience": "CLIENT",
  "code": "789830",
  "sent_at": "2026-10-28T15:06:06.306010466Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a94d5143-a727-4f93-997f-921b5c8d5a17",
  "code": "789830",
  "device_ref": "sandbox-25747"
}
```

```json
{
  "session_id": "3cf818d4-ee28-4ea8-9a1c-1e00f82db866",
  "subject": {
    "type": "CLIENT",
    "id": "0b424174-11cb-459d-be2c-a6bc3ffe62e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjQyNDE3NC0xMWNiLTQ1OWQtYmUyYy1hNmJjM2ZmZTYyZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODY2LCJpYXQiOjE3OTMxOTk5NjYsImp0aSI6IjgwNDA5YjExLTAyZmItNDMyYS04OTg1LTU2ZGM2OTQ3Y2Y4MCIsInNpZCI6IjNjZjgxOGQ0LWVlMjgtNGVhOC05YTFjLTFlMDBmODJkYjg2NiJ9.S8fK2XBvbL3rKu5dGdqLkS9b8yPrPDug9UGvYCa62V4",
  "access_expires_at": "2026-10-28T15:21:06.515853951Z",
  "refresh_token": "_HzRO1LvAtdZZyiGVRBVPpUEeVd-8hVCCYVo3v_Wvl0",
  "refresh_expires_at": "2026-11-27T15:06:06.515495329Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c10264b8-3c3d-4e2f-9d7b-eaba7b287c71",
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
  "id": "422409d0-3804-44f5-8c1d-f8691d8ea134",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:06.703101Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 404e7d13-1c94-4002-8fe6-8fa2becd3b18) → **201**

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
  "session_id": "236ac3ee-4d5e-4bd6-8d4d-482aefd746ab",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NjcsImlhdCI6MTc5MzE5OTk2NywianRpIjoiN2UwMjYxNDAtZDQyZC00ZjQ4LTkzNmEtNjdhOWM4NDVmY2E2Iiwic2lkIjoiMjM2YWMzZWUtNGQ1ZS00YmQ2LThkNGQtNDgyYWVmZDc0NmFiIn0.EWjlhm-4XNevRH-Oi9vOYK4QgSowiLhEbHgXGpODNPA",
  "access_expires_at": "2026-10-28T15:21:07.135653487Z",
  "refresh_token": "W_Zqy8-GbvZfl2LdR6fUStmbJojWJ0e8_vUUcPJAlF4",
  "refresh_expires_at": "2026-10-29T03:06:07.135306352Z",
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
  "session_id": "49a0c07c-0b89-49bb-a6b9-236be22df805",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NjcsImlhdCI6MTc5MzE5OTk2NywianRpIjoiYTY2ZmExYzMtYWUxOC00ZTE1LWEwZTctZTIxMGY0NzM5MGIxIiwic2lkIjoiNDlhMGMwN2MtMGI4OS00OWJiLWE2YjktMjM2YmUyMmRmODA1In0.GniyPoL1_KOEfVP8tIk94_2dgRFnZD-SAAsnw_0xviU",
  "access_expires_at": "2026-10-28T15:21:07.518259597Z",
  "refresh_token": "4J-ShNpoXNds2f5YjQapyiMNYZQ0TCz7ch6FCaV9Yvg",
  "refresh_expires_at": "2026-10-29T03:06:07.517905832Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4ca83295-4e40-4dcc-ab25-753f78f29c5a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:06:06.901754Z",
      "actor": {
        "type": "CLIENT",
        "id": "0b424174-11cb-459d-be2c-a6bc3ffe62e3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4ca83295-4e40-4dcc-ab25-753f78f29c5a",
        "quote_id": "422409d0-3804-44f5-8c1d-f8691d8ea134",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "404e7d13-1c94-4002-8fe6-8fa2becd3b18"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:06:06.902821Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4ca83295-4e40-4dcc-ab25-753f78f29c5a",
        "attempt_id": "e47b5c55-e8c2-4db9-93fa-477bb06973c6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "404e7d13-1c94-4002-8fe6-8fa2becd3b18"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T15:06:06.909368Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4ca83295-4e40-4dcc-ab25-753f78f29c5a",
        "attempt_id": "e47b5c55-e8c2-4db9-93fa-477bb06973c6"
      },
      "correlation_id": "404e7d13-1c94-4002-8fe6-8fa2becd3b18"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "e47b5c55-e8c2-4db9-93fa-477bb06973c6",
        "generation": 1,
        "started_at": "2026-10-28T15:06:06.902237Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T15:06:06.909368Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T15:06:06.903457Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/404e7d13-1c94-4002-8fe6-8fa2becd3b18` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "4ca83295-4e40-4dcc-ab25-753f78f29c5a:0",
      "order_id": "4ca83295-4e40-4dcc-ab25-753f78f29c5a",
      "at": "2026-10-28T15:06:06.901754Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4ca83295-4e40-4dcc-ab25-753f78f29c5a:1",
      "order_id": "4ca83295-4e40-4dcc-ab25-753f78f29c5a",
      "at": "2026-10-28T15:06:06.902821Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4ca83295-4e40-4dcc-ab25-753f78f29c5a:2",
      "order_id": "4ca83295-4e40-4dcc-ab25-753f78f29c5a",
      "at": "2026-10-28T15:06:06.909368Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/301c1d84-c5f2-44c7-b921-c6ca691ff289` → **200**

```json
{
  "found": []
}
```

Done: request 404e7d13-1c94-4002-8fe6-8fa2becd3b18 — order 4ca83295-4e40-4dcc-ab25-753f78f29c5a found by its id.

`GET /api/rider/v1/orders/4ca83295-4e40-4dcc-ab25-753f78f29c5a` → **200**

```json
{
  "id": "4ca83295-4e40-4dcc-ab25-753f78f29c5a",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0b424174-11cb-459d-be2c-a6bc3ffe62e3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:06:06.9013Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4ca83295-4e40-4dcc-ab25-753f78f29c5a/cancel` → **200**

```json
{
  "command_id": "85f55a32-9b2a-4c4f-9f8c-c89d3e3d83c4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4ca83295-4e40-4dcc-ab25-753f78f29c5a",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0b424174-11cb-459d-be2c-a6bc3ffe62e3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:06:06.9013Z",
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
  "phone": "+380635894776",
  "device_ref": "sandbox-24593"
}
```

```json
{
  "challenge_id": "1169cb20-cbcf-48b9-9a9f-0ed08d6bbd20",
  "expires_at": "2026-10-28T15:11:08.629401065Z",
  "resend_available_at": "2026-10-28T15:06:09.629401065Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635894776` → **200**

```json
{
  "phone": "+380635894776",
  "audience": "CLIENT",
  "code": "265182",
  "sent_at": "2026-10-28T15:06:08.631684358Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1169cb20-cbcf-48b9-9a9f-0ed08d6bbd20",
  "code": "265182",
  "device_ref": "sandbox-24593"
}
```

```json
{
  "session_id": "fb815918-90d9-429f-8ca8-b38f296373fd",
  "subject": {
    "type": "CLIENT",
    "id": "c82e8787-127c-4d96-b1c0-0c12f5fbf9cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODJlODc4Ny0xMjdjLTRkOTYtYjFjMC0wYzEyZjVmYmY5Y2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODY4LCJpYXQiOjE3OTMxOTk5NjgsImp0aSI6ImM4YjY0OWMzLTE4NjAtNDYxYS04NDJkLWU3NTNkMzI1Y2Q4ZCIsInNpZCI6ImZiODE1OTE4LTkwZDktNDI5Zi04Y2E4LWIzOGYyOTYzNzNmZCJ9.UBEneOCIzAxuJGxnDe0e4-0atTGVPex0gG1nz7i5HTI",
  "access_expires_at": "2026-10-28T15:21:08.82949364Z",
  "refresh_token": "rorU52Zr46gON7uLOg4VZ3qad7lIACRvjmMYadJ46Ws",
  "refresh_expires_at": "2026-11-27T15:06:08.829000053Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "040dd2ad-0b41-4464-80f2-3159fb928985",
  "expires_at": "2026-10-28T15:11:11.02137886Z",
  "resend_available_at": "2026-10-28T15:06:12.02137886Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635894776` → **200**

```json
{
  "phone": "+380635894776",
  "audience": "CLIENT",
  "code": "616350",
  "sent_at": "2026-10-28T15:06:11.022916224Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "1128b328-0358-4a3f-8f5b-3c950e0c3dca",
  "challenge_id": "040dd2ad-0b41-4464-80f2-3159fb928985",
  "otp_code": "616350"
}
```

```json
{
  "id": "ebe6603f-be28-4845-904c-fd70a55e4daa",
  "state": "PENDING",
  "created_at": "2026-10-28T15:06:11.231705Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/ebe6603f-be28-4845-904c-fd70a55e4daa` → **200**

```json
{
  "id": "ebe6603f-be28-4845-904c-fd70a55e4daa",
  "state": "PENDING",
  "created_at": "2026-10-28T15:06:11.231705Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/ebe6603f-be28-4845-904c-fd70a55e4daa` → **200**

```json
{
  "id": "ebe6603f-be28-4845-904c-fd70a55e4daa",
  "state": "PENDING",
  "created_at": "2026-10-28T15:06:11.231705Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/ebe6603f-be28-4845-904c-fd70a55e4daa` → **200**

```json
{
  "id": "ebe6603f-be28-4845-904c-fd70a55e4daa",
  "state": "PENDING",
  "created_at": "2026-10-28T15:06:11.231705Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/ebe6603f-be28-4845-904c-fd70a55e4daa` → **200**

```json
{
  "id": "ebe6603f-be28-4845-904c-fd70a55e4daa",
  "state": "READY",
  "created_at": "2026-10-28T15:06:11.231705Z",
  "ready_at": "2026-10-28T15:06:14.294531Z",
  "expires_at": "2026-11-04T15:06:14.294531Z",
  "size_bytes": 1023
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/ebe6603f-be28-4845-904c-fd70a55e4daa/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636841676",
  "device_ref": "sandbox-17368"
}
```

```json
{
  "challenge_id": "7363627c-f351-43b8-81b2-872eafb7f86a",
  "expires_at": "2026-10-28T15:11:15.163602904Z",
  "resend_available_at": "2026-10-28T15:06:16.163602904Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636841676` → **200**

```json
{
  "phone": "+380636841676",
  "audience": "CLIENT",
  "code": "516254",
  "sent_at": "2026-10-28T15:06:15.165685712Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7363627c-f351-43b8-81b2-872eafb7f86a",
  "code": "516254",
  "device_ref": "sandbox-17368"
}
```

```json
{
  "session_id": "ee5982f1-3f95-4bdc-aaab-18d6152fd5fc",
  "subject": {
    "type": "CLIENT",
    "id": "38b1786e-0ecd-4575-b079-b4f72b6a3206"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGIxNzg2ZS0wZWNkLTQ1NzUtYjA3OS1iNGY3MmI2YTMyMDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODc1LCJpYXQiOjE3OTMxOTk5NzUsImp0aSI6IjRkNWY4YWI2LTQwOGMtNDA4Mi04ODBjLTQzNjU4MTRiZjYzNiIsInNpZCI6ImVlNTk4MmYxLTNmOTUtNGJkYy1hYWFiLTE4ZDYxNTJmZDVmYyJ9.V2-5QPtjBjL016MlrjaIxV8gLw6Ji3TDoQGaybGTV8s",
  "access_expires_at": "2026-10-28T15:21:15.368718565Z",
  "refresh_token": "tFKCs3F55PJoIGekj6r_SwK-p7WzyxrIio-DNKwcrO0",
  "refresh_expires_at": "2026-11-27T15:06:15.368383409Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/ebe6603f-be28-4845-904c-fd70a55e4daa/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/ebe6603f-be28-4845-904c-fd70a55e4daa/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6e7eb607-ff47-4643-b804-3b7a922e67d7"
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
  "session_id": "dc7703fc-ae72-4d7d-9983-4174785aea45",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NzUsImlhdCI6MTc5MzE5OTk3NSwianRpIjoiY2M3ZWQyZWItMDQwOS00ZDdiLTllMjEtNTU2MWY2OTM5NGZkIiwic2lkIjoiZGM3NzAzZmMtYWU3Mi00ZDdkLTk5ODMtNDE3NDc4NWFlYTQ1In0.9WdexigUZNSJEo4XfYS4imnZKCbomdGdwdvL0sRS_xg",
  "access_expires_at": "2026-10-28T15:21:15.927226409Z",
  "refresh_token": "YZjDXaTmTrtInq5R8LngNeWVYA1wXXgV4AlX8Dpg14E",
  "refresh_expires_at": "2026-10-29T03:06:15.926746504Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c82e8787-127c-4d96-b1c0-0c12f5fbf9cf",
  "session_id": "fb815918-90d9-429f-8ca8-b38f296373fd",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/c82e8787-127c-4d96-b1c0-0c12f5fbf9cf/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "ebe6603f-be28-4845-904c-fd70a55e4daa",
      "state": "READY",
      "created_at": "2026-10-28T15:06:11.231705Z",
      "ready_at": "2026-10-28T15:06:14.294531Z",
      "expires_at": "2026-11-04T15:06:14.294531Z",
      "size_bytes": 1023
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
  "device_ref": "sandbox-16595"
}
```

```json
{
  "challenge_id": "79f4d7a8-9b6f-47a3-93b0-41fc3ebb4e16",
  "expires_at": "2026-10-28T15:11:16.463258277Z",
  "resend_available_at": "2026-10-28T15:06:17.463258277Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "921912",
  "sent_at": "2026-10-28T15:06:16.465029685Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79f4d7a8-9b6f-47a3-93b0-41fc3ebb4e16",
  "code": "921912",
  "device_ref": "sandbox-16595"
}
```

```json
{
  "session_id": "242b2d97-4b10-49e5-9789-951441faaaca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDg3NiwiaWF0IjoxNzkzMTk5OTc2LCJqdGkiOiJiODU2ODIxYi04MGRhLTRhMjktOTk2OC0xZGFmMmRhNmE4YjkiLCJzaWQiOiIyNDJiMmQ5Ny00YjEwLTQ5ZTUtOTc4OS05NTE0NDFmYWFhY2EifQ.EfHmtNdCHMlccUv4V92TnNa1829kPczBRGFDBkj6PLQ",
  "access_expires_at": "2026-10-28T15:21:16.660587828Z",
  "refresh_token": "JIS8mfb1JXsb_Z0YZFP6HMm63hG8L6t8QZTWlojfpEc",
  "refresh_expires_at": "2026-11-27T15:06:16.660206493Z",
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
  "device_ref": "sandbox-13535"
}
```

```json
{
  "challenge_id": "18155dae-3e92-4f96-aa2d-2e6419546415",
  "expires_at": "2026-10-28T15:11:17.008563162Z",
  "resend_available_at": "2026-10-28T15:06:18.008563162Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "132123",
  "sent_at": "2026-10-28T15:06:17.010292047Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18155dae-3e92-4f96-aa2d-2e6419546415",
  "code": "132123",
  "device_ref": "sandbox-13535"
}
```

```json
{
  "session_id": "f61f00c1-89fb-4be7-a378-3824fd47baab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDg3NywiaWF0IjoxNzkzMTk5OTc3LCJqdGkiOiIxMDZlNzJhOS1mYmNiLTRjNTEtOTA3Zi1hOWNkNzliMzRiYTIiLCJzaWQiOiJmNjFmMDBjMS04OWZiLTRiZTctYTM3OC0zODI0ZmQ0N2JhYWIifQ.JHUokt6pvaJin0GiEJpTEk8iVmkAMGObQeEYy2MPEpI",
  "access_expires_at": "2026-10-28T15:21:17.199226197Z",
  "refresh_token": "vgfASxmTdHqZ5axWDY1sKbLJn5oPMvCgKBQLzn9svq8",
  "refresh_expires_at": "2026-11-27T15:06:17.198781025Z",
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
  "command_id": "18445a7a-b8d1-44c7-9e44-e81b5d666d2c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:17Z",
    "sequence": 1793199977551
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b438da4-b61f-4110-a429-2cb807fa3509",
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
  "last_heartbeat_at": "2026-10-28T15:06:17.567393Z",
  "last_location_at": "2026-10-28T15:06:17.567393Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-6454"
}
```

```json
{
  "challenge_id": "c7f2f354-8140-4077-91b7-0df0230523bb",
  "expires_at": "2026-10-28T15:11:17.747704089Z",
  "resend_available_at": "2026-10-28T15:06:18.747704089Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "610859",
  "sent_at": "2026-10-28T15:06:17.749448906Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7f2f354-8140-4077-91b7-0df0230523bb",
  "code": "610859",
  "device_ref": "sandbox-6454"
}
```

```json
{
  "session_id": "27660329-fd9a-47de-aa77-dd5cf6589a08",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDg3NywiaWF0IjoxNzkzMTk5OTc3LCJqdGkiOiJmYzQzMDE5NC1lNTFjLTRjYTEtODY5Yy00MGI1ZDM1OGZhYTMiLCJzaWQiOiIyNzY2MDMyOS1mZDlhLTQ3ZGUtYWE3Ny1kZDVjZjY1ODlhMDgifQ.JdW4k2oKevL9_I9qlfz7dWL4M9A8y8sTBUYzQ3IWpdw",
  "access_expires_at": "2026-10-28T15:21:17.950512243Z",
  "refresh_token": "qPLUvVbA-8VU1BCG-CuLVQYffXbqy_3Y8qRnTTIkvOI",
  "refresh_expires_at": "2026-11-27T15:06:17.950162304Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d363094f-d2ff-4681-89b7-de170759aabc",
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
  "last_heartbeat_at": "2026-10-28T15:05:25.908242Z",
  "last_location_at": "2026-10-28T15:05:25.908242Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d363094f-d2ff-4681-89b7-de170759aabc/handover` → **200**

```json
{
  "command_id": "be61f276-438d-438d-bdfc-6ee2bdcf71c5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d363094f-d2ff-4681-89b7-de170759aabc",
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
  "last_heartbeat_at": "2026-10-28T15:05:25.908242Z",
  "last_location_at": "2026-10-28T15:05:25.908242Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d363094f-d2ff-4681-89b7-de170759aabc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:18Z",
    "sequence": 1793199978497
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d363094f-d2ff-4681-89b7-de170759aabc",
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
  "last_heartbeat_at": "2026-10-28T15:06:18.513746Z",
  "last_location_at": "2026-10-28T15:06:18.513746Z",
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
  "session_id": "6a8c2d5a-eb88-43c2-a8aa-eed8ee04a3f6",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NzgsImlhdCI6MTc5MzE5OTk3OCwianRpIjoiM2E2NmRlMGUtYWFlMi00MjJkLThlMTgtNjNiNjExNmM1YjAxIiwic2lkIjoiNmE4YzJkNWEtZWI4OC00M2MyLWE4YWEtZWVkOGVlMDRhM2Y2In0.ElDYCagTgJEPVFzYNGv_vf5f8K_OJuEP6mBwTYbZVPk",
  "access_expires_at": "2026-10-28T15:21:18.897377213Z",
  "refresh_token": "gF1u42vruZdr0e7Dr4icyQnfcOXbg7T6dAVTLd1xcQI",
  "refresh_expires_at": "2026-10-29T03:06:18.896905781Z",
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
  "session_id": "508f27f1-42c8-45e7-ac9e-572007e23649",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NzksImlhdCI6MTc5MzE5OTk3OSwianRpIjoiNTNiOGZmNmQtNzRmYi00ZDBkLWI0MDYtZjdkYmUyZGE4ODRhIiwic2lkIjoiNTA4ZjI3ZjEtNDJjOC00NWU3LWFjOWUtNTcyMDA3ZTIzNjQ5In0.G5X1IWsapbnf_fhejgbU-lqm3UoDjvva2xkvTOJrneI",
  "access_expires_at": "2026-10-28T15:21:19.27590395Z",
  "refresh_token": "S89nEogqKDwrsq6q9iK9NdddRhAjGrOdqrYMW7GkWv4",
  "refresh_expires_at": "2026-10-29T03:06:19.275531847Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688575586",
  "device_ref": "sandbox-23569"
}
```

```json
{
  "challenge_id": "ce8b30b1-2f32-40b3-9fb3-a11606e27ee9",
  "expires_at": "2026-10-28T15:11:19.457999103Z",
  "resend_available_at": "2026-10-28T15:06:20.457999103Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380688575586` → **200**

```json
{
  "phone": "+380688575586",
  "audience": "CLIENT",
  "code": "185072",
  "sent_at": "2026-10-28T15:06:19.459759474Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce8b30b1-2f32-40b3-9fb3-a11606e27ee9",
  "code": "185072",
  "device_ref": "sandbox-23569"
}
```

```json
{
  "session_id": "2f99ae82-5283-450f-acfa-05997ca50601",
  "subject": {
    "type": "CLIENT",
    "id": "dc3479de-dcbb-42c1-95ec-09cfe45ff653"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYzM0NzlkZS1kY2JiLTQyYzEtOTVlYy0wOWNmZTQ1ZmY2NTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODc5LCJpYXQiOjE3OTMxOTk5NzksImp0aSI6ImE1MDJkODZhLWIwZjAtNDkwYS05ZDdiLTY4NDFkZjM0YmRkZiIsInNpZCI6IjJmOTlhZTgyLTUyODMtNDUwZi1hY2ZhLTA1OTk3Y2E1MDYwMSJ9.1xTKlynldB87marV6_1Y1clF-T1XXznNzwMISb5J4r8",
  "access_expires_at": "2026-10-28T15:21:19.651575531Z",
  "refresh_token": "UPU9NgNkw07OZ3n28J5fcQOG6l86lThIeVpUucANjfI",
  "refresh_expires_at": "2026-11-27T15:06:19.651162627Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0d29dc97-d201-4cdf-8afe-2fcd69483e1f",
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
  "id": "6fefe645-37b7-44a5-862e-fcada617270e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:19.837075Z",
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
  "command_id": "363fd5c7-4044-4b1c-ba07-9c1db1b46be5",
  "quote_id": "6fefe645-37b7-44a5-862e-fcada617270e",
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
  "id": "64f68eb7-f7c2-4955-9f30-5b5d7ca851c9",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dc3479de-dcbb-42c1-95ec-09cfe45ff653",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:06:20.023855Z",
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
    "id": "b4d2dc4d-7093-49be-930e-16e5b097d437",
    "order_id": "64f68eb7-f7c2-4955-9f30-5b5d7ca851c9",
    "expires_at": "2026-10-28T15:06:35.026709Z",
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

`POST /api/driver/v1/offers/b4d2dc4d-7093-49be-930e-16e5b097d437/reject` → **204**

```json
{
  "command_id": "8607ae46-7c9f-4fa9-a989-3326d43c45e7"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6adc8418-69e4-4603-b3f7-128547d87591",
    "order_id": "64f68eb7-f7c2-4955-9f30-5b5d7ca851c9",
    "expires_at": "2026-10-28T15:06:35.396706Z",
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

`POST /api/driver/v1/offers/6adc8418-69e4-4603-b3f7-128547d87591/accept` → **200**

```json
{
  "command_id": "45b92e06-a6e6-47b2-a7f8-f84ffcc823b7"
}
```

```json
{
  "id": "082f5758-9946-49e6-9c56-4ba47050b46d",
  "order_id": "64f68eb7-f7c2-4955-9f30-5b5d7ca851c9",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3a542cfe-bdd9-4e46-bc7e-243f18b1670a",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/64f68eb7-f7c2-4955-9f30-5b5d7ca851c9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:06:20.024388Z",
      "actor": {
        "type": "CLIENT",
        "id": "dc3479de-dcbb-42c1-95ec-09cfe45ff653",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "64f68eb7-f7c2-4955-9f30-5b5d7ca851c9",
        "quote_id": "6fefe645-37b7-44a5-862e-fcada617270e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b2146a44-29da-4c55-bc62-1ab05608d983"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:06:20.026097Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "64f68eb7-f7c2-4955-9f30-5b5d7ca851c9",
        "attempt_id": "273de942-80b6-4382-bf7f-a831b6a34e66",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b2146a44-29da-4c55-bc62-1ab05608d983"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:06:20.03108Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b4d2dc4d-7093-49be-930e-16e5b097d437",
        "order_id": "64f68eb7-f7c2-4955-9f30-5b5d7ca851c9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "b2146a44-29da-4c55-bc62-1ab05608d983"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T15:06:20.395888Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b4d2dc4d-7093-49be-930e-16e5b097d437",
        "order_id": "64f68eb7-f7c2-4955-9f30-5b5d7ca851c9"
      },
      "correlation_id": "66037b1c-6b7d-4553-8f23-acf2958d3ec5"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 64f68eb7-f7c2-4955-9f30-5b5d7ca851c9 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/64f68eb7-f7c2-4955-9f30-5b5d7ca851c9` → **200**

```json
{
  "id": "64f68eb7-f7c2-4955-9f30-5b5d7ca851c9",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "dc3479de-dcbb-42c1-95ec-09cfe45ff653",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "082f5758-9946-49e6-9c56-4ba47050b46d",
    "order_id": "64f68eb7-f7c2-4955-9f30-5b5d7ca851c9",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3a542cfe-bdd9-4e46-bc7e-243f18b1670a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:06:20.023855Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/64f68eb7-f7c2-4955-9f30-5b5d7ca851c9/cancel` → **200**

```json
{
  "command_id": "7b09b79f-bf88-4d4a-bb3b-85ce75ab17ad",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "64f68eb7-f7c2-4955-9f30-5b5d7ca851c9",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "dc3479de-dcbb-42c1-95ec-09cfe45ff653",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "082f5758-9946-49e6-9c56-4ba47050b46d",
    "order_id": "64f68eb7-f7c2-4955-9f30-5b5d7ca851c9",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3a542cfe-bdd9-4e46-bc7e-243f18b1670a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:06:20.023855Z",
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
  "session_id": "9b438da4-b61f-4110-a429-2cb807fa3509",
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
  "last_heartbeat_at": "2026-10-28T15:06:17.567393Z",
  "last_location_at": "2026-10-28T15:06:17.567393Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9b438da4-b61f-4110-a429-2cb807fa3509/close` → **200**

```json
{
  "command_id": "fd040aea-1ec7-4cc3-b0b1-c3e84269918b",
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
  "session_id": "d363094f-d2ff-4681-89b7-de170759aabc",
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
  "last_heartbeat_at": "2026-10-28T15:06:18.513746Z",
  "last_location_at": "2026-10-28T15:06:18.513746Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d363094f-d2ff-4681-89b7-de170759aabc/close` → **200**

```json
{
  "command_id": "a467098c-0cb5-430a-8606-bb9f08f31620",
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
  "device_ref": "sandbox-10669"
}
```

```json
{
  "challenge_id": "ce1225f0-84d4-4088-b5d2-c7be19f54597",
  "expires_at": "2026-10-28T15:11:22.409766096Z",
  "resend_available_at": "2026-10-28T15:06:23.409766096Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "566517",
  "sent_at": "2026-10-28T15:06:22.411595562Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce1225f0-84d4-4088-b5d2-c7be19f54597",
  "code": "566517",
  "device_ref": "sandbox-10669"
}
```

```json
{
  "session_id": "9e695734-934b-446c-9d58-c7c75a66eacc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDg4MiwiaWF0IjoxNzkzMTk5OTgyLCJqdGkiOiI3NDU1ZDc3ZC1iYTY5LTRmYTQtYTY1YS0yZjVlOGQ3MjVhMWYiLCJzaWQiOiI5ZTY5NTczNC05MzRiLTQ0NmMtOWQ1OC1jN2M3NWE2NmVhY2MifQ.uharPaZ9KJ2LSoRDt8M6SbmEpym-n_WBP4lHoksVzbk",
  "access_expires_at": "2026-10-28T15:21:22.618330151Z",
  "refresh_token": "DP4xZC3LfeXKINFIOz8q2tCjNUHXg0Po83ZF_hSvIOA",
  "refresh_expires_at": "2026-11-27T15:06:22.617901042Z",
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
  "command_id": "d4cb248b-26df-4860-b70a-bab84e3e1efb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:23Z",
    "sequence": 1793199983151
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1134040-d16c-4283-b680-810a78b2b069",
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
  "last_heartbeat_at": "2026-10-28T15:06:23.030238Z",
  "last_location_at": "2026-10-28T15:06:23.030238Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677078967",
  "device_ref": "sandbox-14215"
}
```

```json
{
  "challenge_id": "4e3615bc-09c5-4c3a-91b5-4b3fef73c85d",
  "expires_at": "2026-10-28T15:11:23.209826447Z",
  "resend_available_at": "2026-10-28T15:06:24.209826447Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677078967` → **200**

```json
{
  "phone": "+380677078967",
  "audience": "CLIENT",
  "code": "092085",
  "sent_at": "2026-10-28T15:06:23.211549201Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e3615bc-09c5-4c3a-91b5-4b3fef73c85d",
  "code": "092085",
  "device_ref": "sandbox-14215"
}
```

```json
{
  "session_id": "83664ffc-4432-4a7d-ac5f-6ad2b6788b32",
  "subject": {
    "type": "CLIENT",
    "id": "d5a7421c-9290-464c-b96a-bbdc1883c076"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNWE3NDIxYy05MjkwLTQ2NGMtYjk2YS1iYmRjMTg4M2MwNzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODgzLCJpYXQiOjE3OTMxOTk5ODMsImp0aSI6ImFlNzVlZDI3LWQ3YmQtNDI0NS1hN2U5LWUzMDlhYzhhOTNiYyIsInNpZCI6IjgzNjY0ZmZjLTQ0MzItNGE3ZC1hYzVmLTZhZDJiNjc4OGIzMiJ9.lUjLG36R9v_AJcRUVECLmuQwtY7lNExQs0nPQBkvrEM",
  "access_expires_at": "2026-10-28T15:21:23.415863151Z",
  "refresh_token": "qHD3UT0fybOnXGXB8TEodIohXmWLTcdhTvZpEd_32Wk",
  "refresh_expires_at": "2026-11-27T15:06:23.415458869Z",
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
  "command_id": "c17d57c9-fa30-4989-8b23-8dd9dca4e10f",
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
  "id": "d4242ad5-5887-45b0-a442-7377e66c0e5b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:23.790289Z",
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
  "command_id": "2ed09171-3e73-408a-a9e0-033999c4c2e6",
  "platform": "ANDROID",
  "token": "sandbox-driver-40b74e9e-d3c5-4db9-8d26-2fef7a5d715d"
}
```

```json
{
  "id": "a6bcbfa3-8545-4274-8db5-ada58284874a",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T15:06:23.98638Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "ec172310-074f-46d0-9ccf-aac1e14f2f18",
  "platform": "ANDROID",
  "token": "sandbox-rider-2d66bdd3-f1ee-44d4-b0ab-35eb128af858"
}
```

```json
{
  "id": "504aa6a6-dbb1-4fc2-9b86-91504c32456a",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T15:06:24.171348Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4595aa13-8079-4a36-b97c-17f3133d2524",
  "quote_id": "d4242ad5-5887-45b0-a442-7377e66c0e5b",
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
  "id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d5a7421c-9290-464c-b96a-bbdc1883c076",
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
  "created_at": "2026-10-28T15:06:24.367188Z",
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
    "id": "e256c21e-5ea2-4302-aec0-e814265dac3e",
    "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
    "expires_at": "2026-10-28T15:06:39.370295Z",
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

`POST /api/driver/v1/offers/e256c21e-5ea2-4302-aec0-e814265dac3e/accept` → **200**

```json
{
  "command_id": "482a491b-7133-450f-97f5-486eebe1e63c"
}
```

```json
{
  "id": "60591ff9-870b-4133-81b3-f03c6ce76d31",
  "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ea036f0d-56fd-4556-beb9-c3b911c56daf",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T15:06:24.346Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T15:06:24.346Z` → **200**

```json
[
  {
    "at": "2026-10-28T15:06:25.576413452Z",
    "token_suffix": "5d715d",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "21d3e64b-aeff-4ed3-8f21-24b315b3cb2f"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677078967&after=2026-10-28T15:06:24.346Z` → **200**

```json
[
  {
    "at": "2026-10-28T15:06:25.578527428Z",
    "token_suffix": "8af858",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "3322a73b-4d62-48c5-b2b0-591935003ddb"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/1b7b3ec8-6eb8-4c0d-995b-50d108ea2534/messages` → **201**

```json
{
  "command_id": "b191be46-8354-4e34-bdb7-84a582ef143d",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "db6b0125-68c0-44c9-8857-a8930597196a",
  "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T15:06:26.034452029Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ea036f0d-56fd-4556-beb9-c3b911c56daf",
  "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
  "assignment_id": "60591ff9-870b-4133-81b3-f03c6ce76d31",
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

`POST /api/driver/v1/trips/ea036f0d-56fd-4556-beb9-c3b911c56daf/messages` → **201**

```json
{
  "command_id": "8cff5830-1689-4b94-97ec-5d9e7d8c7181",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "d1288e0e-a789-43c3-a48b-e15ddd2da263",
  "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T15:06:26.400528608Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/1b7b3ec8-6eb8-4c0d-995b-50d108ea2534/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/ea036f0d-56fd-4556-beb9-c3b911c56daf/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677078967"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/e1134040-d16c-4283-b680-810a78b2b069/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:26Z",
    "sequence": 1793199986950
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1134040-d16c-4283-b680-810a78b2b069",
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
  "last_heartbeat_at": "2026-10-28T15:06:26.967393Z",
  "last_location_at": "2026-10-28T15:06:26.967393Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ea036f0d-56fd-4556-beb9-c3b911c56daf",
  "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
  "assignment_id": "60591ff9-870b-4133-81b3-f03c6ce76d31",
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

`POST /api/driver/v1/trips/ea036f0d-56fd-4556-beb9-c3b911c56daf/arrive` → **200**

```json
{
  "command_id": "9a6bc8dd-97a2-4386-b31f-c376bf69e759",
  "expected_version": 0
}
```

```json
{
  "id": "ea036f0d-56fd-4556-beb9-c3b911c56daf",
  "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
  "assignment_id": "60591ff9-870b-4133-81b3-f03c6ce76d31",
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
  "arrived_at": "2026-10-28T15:06:27.345991Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ea036f0d-56fd-4556-beb9-c3b911c56daf/start` → **200**

```json
{
  "command_id": "b33fe3ce-bec6-45ca-93ae-f49f45f74579",
  "expected_version": 1
}
```

```json
{
  "id": "ea036f0d-56fd-4556-beb9-c3b911c56daf",
  "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
  "assignment_id": "60591ff9-870b-4133-81b3-f03c6ce76d31",
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
  "arrived_at": "2026-10-28T15:06:27.345991Z",
  "started_at": "2026-10-28T15:06:27.548028Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e1134040-d16c-4283-b680-810a78b2b069/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:27Z",
    "sequence": 1793199987736
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1134040-d16c-4283-b680-810a78b2b069",
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
  "last_heartbeat_at": "2026-10-28T15:06:27.753872Z",
  "last_location_at": "2026-10-28T15:06:27.753872Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/ea036f0d-56fd-4556-beb9-c3b911c56daf/complete` → **200**

```json
{
  "command_id": "62129892-d641-4898-bdf5-a753a5f1ff00",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:06:27Z",
  "cash_received": true
}
```

```json
{
  "id": "ea036f0d-56fd-4556-beb9-c3b911c56daf",
  "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
  "assignment_id": "60591ff9-870b-4133-81b3-f03c6ce76d31",
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
  "arrived_at": "2026-10-28T15:06:27.345991Z",
  "started_at": "2026-10-28T15:06:27.548028Z",
  "completed_at": "2026-10-28T15:06:27.975095Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/1b7b3ec8-6eb8-4c0d-995b-50d108ea2534` → **200**

```json
{
  "id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d5a7421c-9290-464c-b96a-bbdc1883c076",
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
    "id": "60591ff9-870b-4133-81b3-f03c6ce76d31",
    "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ea036f0d-56fd-4556-beb9-c3b911c56daf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:06:24.367188Z",
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
    "id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T15:06:24.367188Z",
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
    "id": "ea036f0d-56fd-4556-beb9-c3b911c56daf",
    "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
    "order_short_number": 9,
    "created_at": "2026-10-28T15:06:24.75761Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "19a401c4-194f-49a6-9c40-4ccbbb6b1c24",
    "order_id": "1ec974a5-0d29-4a80-890a-d724ecf9c2fa",
    "order_short_number": 2,
    "created_at": "2026-10-28T15:05:17.022513Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "84e00807-ba79-4e9c-bb76-d3c870b89b94",
    "order_id": "5cb123e0-a540-46eb-bea9-6346906d6f07",
    "order_short_number": 1,
    "created_at": "2026-10-28T15:05:05.453201Z",
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

`GET /api/rider/v1/orders/1b7b3ec8-6eb8-4c0d-995b-50d108ea2534/tip` → **200**

```json
{
  "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
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
  "available_until": "2026-10-29T15:06:27.975095Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1b7b3ec8-6eb8-4c0d-995b-50d108ea2534/tip` → **201**

```json
{
  "command_id": "a668985d-2908-4b17-b812-57aa87b82c75",
  "amount_minor": 1100
}
```

```json
{
  "id": "d65f84d2-87f4-4269-8214-7e3d10989d2a",
  "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T15:06:32.315734Z"
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
  "session_id": "6905b826-48d6-4a0d-aa6a-84bc1caef494",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4OTIsImlhdCI6MTc5MzE5OTk5MiwianRpIjoiZDM5N2ZhZjYtMzE4Ni00YTEyLThlYzctYTU4YTA4NDhlOTgyIiwic2lkIjoiNjkwNWI4MjYtNDhkNi00YTBkLWFhNmEtODRiYzFjYWVmNDk0In0.whgZoyWilky958LTx-ou7-j_gCcyKw02ZclYhteE2dM",
  "access_expires_at": "2026-10-28T15:21:32.759962439Z",
  "refresh_token": "e1d8V6sa8RYScO_IalVH1FIHOu0-Z8XnZ_oyA4k-4ik",
  "refresh_expires_at": "2026-10-29T03:06:32.759620793Z",
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
          "CARD": 1,
          "CASH": 8
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
      "CARD": 1,
      "CASH": 8
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
  "generated_at": "2026-10-28T15:06:32.95046096Z"
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
  "generated_at": "2026-10-28T15:06:33.142545769Z"
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
  "session_id": "b1c0b97b-4d53-46ee-9b11-417f42e13caf",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4OTMsImlhdCI6MTc5MzE5OTk5MywianRpIjoiNTMyZjI2N2EtMzU4NS00YTlkLWE3MjEtYWI2MmMxMjJmNTYwIiwic2lkIjoiYjFjMGI5N2ItNGQ1My00NmVlLTliMTEtNDE3ZjQyZTEzY2FmIn0.8nEum7D2awVbywAm_tVzwuvBlKqV4MlEGLf2v8m7WBU",
  "access_expires_at": "2026-10-28T15:21:33.541057458Z",
  "refresh_token": "6jGgpwB_N7Cq1FHWK0vAfiU8O_LWm9H3s-E0spAEu3s",
  "refresh_expires_at": "2026-10-29T03:06:33.540623051Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1b7b3ec8-6eb8-4c0d-995b-50d108ea2534/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:06:24.3677Z",
      "actor": {
        "type": "CLIENT",
        "id": "d5a7421c-9290-464c-b96a-bbdc1883c076",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
        "quote_id": "d4242ad5-5887-45b0-a442-7377e66c0e5b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "05a4b314-cea9-4aec-8132-f4243aedfb2d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:06:24.369507Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
        "attempt_id": "d7d9a7f6-a20d-4472-82b9-930fd235a805",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "05a4b314-cea9-4aec-8132-f4243aedfb2d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:06:24.372993Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e256c21e-5ea2-4302-aec0-e814265dac3e",
        "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "05a4b314-cea9-4aec-8132-f4243aedfb2d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:06:24.758682Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e256c21e-5ea2-4302-aec0-e814265dac3e",
        "order_id": "1b7b3ec8-6eb8-4c0d-995b-50d108ea2534",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "60591ff9-870b-4133-81b3-f03c6ce76d31"
      },
      "correlation_id": "567abd9a-406d-469f-858f-33c14204ff64"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T15:06:33.925406537Z",
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
      "last_location_at": "2026-10-28T15:06:27.753872Z",
      "order_id": null
    }
  ]
}
```

Done: order 1b7b3ec8-6eb8-4c0d-995b-50d108ea2534.

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
  "session_id": "66d4b707-1657-473c-897b-450cb8b3a588",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4OTQsImlhdCI6MTc5MzE5OTk5NCwianRpIjoiMTY4OGIzNjUtNzI5Ny00MGM1LWI5YjAtNmRiNWRlMTA5MjZjIiwic2lkIjoiNjZkNGI3MDctMTY1Ny00NzNjLTg5N2ItNDUwY2I4YjNhNTg4In0.luDRLi0AIjPOPi-k4kBIndqsAmBBVudt6bYRQ4yB55c",
  "access_expires_at": "2026-10-28T15:21:34.331403312Z",
  "refresh_token": "9brI7SJpILmZ1vK_PcOv8b4KW0g068iogv-rXUZG6yw",
  "refresh_expires_at": "2026-10-29T03:06:34.330945129Z",
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
  "command_id": "5a98ff5f-eb54-42c5-a9b4-40d5fa1f7017",
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
  "timestamp": "2026-10-28T15:06:34.000+0000",
  "channel": {
    "id": "1730052000.4905742",
    "linkedid": "1730052000.4905742",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672985060"
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
  "timestamp": "2026-10-28T15:06:34.000+0000",
  "channel": {
    "id": "1730052000.4905742",
    "linkedid": "1730052000.4905742",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672985060"
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
  "session_id": "3992cb77-af57-47fe-8ad1-37e47540d6c1",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4OTUsImlhdCI6MTc5MzE5OTk5NSwianRpIjoiNmQ1ZjU1NDAtZTQ1ZS00OGQzLThkZWMtOGJiYzYyZjZlMTdjIiwic2lkIjoiMzk5MmNiNzctYWY1Ny00N2ZlLThhZDEtMzdlNDc1NDBkNmMxIn0.Dcz76fysKuptbZG8zJ0PMuxbR86JMT7IyV0Mt5EEOH4",
  "access_expires_at": "2026-10-28T15:21:35.156068136Z",
  "refresh_token": "lsL31XCsG6N8eOn0DIF_bdOx1NS0sFrFNh_3HsSyX-w",
  "refresh_expires_at": "2026-10-29T03:06:35.155663244Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "1d0b23fc-5cd9-405b-a30f-cbc442ffd34f",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672985060",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:06:34Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/1d0b23fc-5cd9-405b-a30f-cbc442ffd34f/answer` → **200**

```json
{
  "command_id": "488197c4-4a85-4667-9505-a17b9f9bb6e6"
}
```

```json
{
  "id": "1d0b23fc-5cd9-405b-a30f-cbc442ffd34f",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672985060",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "order_ids": [],
  "started_at": "2026-10-28T15:06:34Z",
  "answered_at": "2026-10-28T15:06:35.544025Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.4905742",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1a173fd1-2d06-4b58-b67b-d295ac8248ea",
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
  "id": "b6b2b1a8-e0db-4cc0-a3e2-3f431128a745",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:35.761117Z",
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
  "command_id": "54cf07e1-8233-4fa1-83e1-fdbf886e1853",
  "quote_id": "b6b2b1a8-e0db-4cc0-a3e2-3f431128a745",
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
    "phone": "+380672985060"
  },
  "call_id": "1d0b23fc-5cd9-405b-a30f-cbc442ffd34f"
}
```

```json
{
  "id": "0fbec5ed-0ce6-4e26-ae7c-7a098127285e",
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
  "created_at": "2026-10-28T15:06:35.961726Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672985060"
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
    "id": "1730052000.4905742",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "1d0b23fc-5cd9-405b-a30f-cbc442ffd34f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672985060",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "order_ids": [
        "0fbec5ed-0ce6-4e26-ae7c-7a098127285e"
      ],
      "started_at": "2026-10-28T15:06:34Z",
      "answered_at": "2026-10-28T15:06:35.544025Z",
      "ended_at": "2026-10-28T15:06:36.178018Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "1f689bda-4dce-4ca2-b7a7-11ebf19f9f4b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672694215",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "order_ids": [],
      "started_at": "2026-10-28T15:05:11.925967Z",
      "answered_at": "2026-10-28T15:05:12.148092Z",
      "ended_at": "2026-10-28T15:05:12.354704Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:05:14.2774Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/0fbec5ed-0ce6-4e26-ae7c-7a098127285e` → **200**

```json
{
  "id": "0fbec5ed-0ce6-4e26-ae7c-7a098127285e",
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
  "created_at": "2026-10-28T15:06:35.961726Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672985060"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/0fbec5ed-0ce6-4e26-ae7c-7a098127285e` → **200**

```json
{
  "id": "0fbec5ed-0ce6-4e26-ae7c-7a098127285e",
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
  "created_at": "2026-10-28T15:06:35.961726Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672985060"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0fbec5ed-0ce6-4e26-ae7c-7a098127285e/cancel` → **200**

```json
{
  "command_id": "f6b27bac-6e71-4003-80d0-0ca9db1277e7",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0fbec5ed-0ce6-4e26-ae7c-7a098127285e",
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
  "created_at": "2026-10-28T15:06:35.961726Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672985060"
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

Done: call 1d0b23fc-5cd9-405b-a30f-cbc442ffd34f with order 0fbec5ed-0ce6-4e26-ae7c-7a098127285e.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24542"
}
```

```json
{
  "challenge_id": "736e30a5-f746-4a6e-bb76-58835f9b97a1",
  "expires_at": "2026-10-28T15:11:37.008923791Z",
  "resend_available_at": "2026-10-28T15:06:38.008923791Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "947712",
  "sent_at": "2026-10-28T15:06:37.010680966Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "736e30a5-f746-4a6e-bb76-58835f9b97a1",
  "code": "947712",
  "device_ref": "sandbox-24542"
}
```

```json
{
  "session_id": "b378cf3e-cbc0-4b33-814a-19b78ff47d0c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDg5NywiaWF0IjoxNzkzMTk5OTk3LCJqdGkiOiI2YzgyZGEzNS05NWZmLTRkOWQtOGFhNy0xOWE1OTU1M2NiM2IiLCJzaWQiOiJiMzc4Y2YzZS1jYmMwLTRiMzMtODE0YS0xOWI3OGZmNDdkMGMifQ.QQEfkMJhSH99j6KEGjq1TN9apkvHIKhpNT_btzEzpnA",
  "access_expires_at": "2026-10-28T15:21:37.22461114Z",
  "refresh_token": "GDAfQbbNFzoyuB3Bac83sjmx24Y9UaM4wDrhy18LBH0",
  "refresh_expires_at": "2026-11-27T15:06:37.224249343Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1134040-d16c-4283-b680-810a78b2b069",
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
  "last_heartbeat_at": "2026-10-28T15:06:27.753872Z",
  "last_location_at": "2026-10-28T15:06:27.753872Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e1134040-d16c-4283-b680-810a78b2b069/handover` → **200**

```json
{
  "command_id": "ade7330f-b612-4632-b088-9f7d656393ac",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1134040-d16c-4283-b680-810a78b2b069",
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
  "last_heartbeat_at": "2026-10-28T15:06:27.753872Z",
  "last_location_at": "2026-10-28T15:06:27.753872Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e1134040-d16c-4283-b680-810a78b2b069/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:37Z",
    "sequence": 1793199997778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1134040-d16c-4283-b680-810a78b2b069",
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
  "last_heartbeat_at": "2026-10-28T15:06:37.794543Z",
  "last_location_at": "2026-10-28T15:06:37.794543Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668058424",
  "device_ref": "sandbox-18419"
}
```

```json
{
  "challenge_id": "b92c23d4-83f6-47dc-a6ab-f88afe95709c",
  "expires_at": "2026-10-28T15:11:37.970769152Z",
  "resend_available_at": "2026-10-28T15:06:38.970769152Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668058424` → **200**

```json
{
  "phone": "+380668058424",
  "audience": "CLIENT",
  "code": "383381",
  "sent_at": "2026-10-28T15:06:37.972503723Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b92c23d4-83f6-47dc-a6ab-f88afe95709c",
  "code": "383381",
  "device_ref": "sandbox-18419"
}
```

```json
{
  "session_id": "c5476ddd-eb7a-4a0b-971b-7ebfe5281050",
  "subject": {
    "type": "CLIENT",
    "id": "04caeb8a-5b66-47df-ac89-2489e75fa848"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGNhZWI4YS01YjY2LTQ3ZGYtYWM4OS0yNDg5ZTc1ZmE4NDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODk4LCJpYXQiOjE3OTMxOTk5OTgsImp0aSI6IjhiM2QyMjQ2LWIwNTItNDc2Ni1hMGVmLTdhYTEyZjgxN2VkNyIsInNpZCI6ImM1NDc2ZGRkLWViN2EtNGEwYi05NzFiLTdlYmZlNTI4MTA1MCJ9.Pj0g2grMC1f1pu7Ksfmddxk00RJR_Q6px_XXIMQidq8",
  "access_expires_at": "2026-10-28T15:21:38.17898559Z",
  "refresh_token": "oZBKZVjbLFSqvraVslHhz52mQ9stSPL4th_0ogF-CTs",
  "refresh_expires_at": "2026-11-27T15:06:38.178487617Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "93bd4cbd-495a-4760-aea1-93e1f9cd70ef",
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
  "id": "e9422356-3f8f-4011-b718-b826f89faf3e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:38.367582Z",
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
  "command_id": "148df3d4-cd2d-4a87-94e7-b607b853fc87",
  "quote_id": "e9422356-3f8f-4011-b718-b826f89faf3e",
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
  "id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "04caeb8a-5b66-47df-ac89-2489e75fa848",
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
  "created_at": "2026-10-28T15:06:38.563923Z",
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
    "id": "28ccfd6b-9a6b-4f9c-94ca-17da0ca6ed2b",
    "order_id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
    "expires_at": "2026-10-28T15:06:53.565781Z",
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

`POST /api/driver/v1/offers/28ccfd6b-9a6b-4f9c-94ca-17da0ca6ed2b/accept` → **200**

```json
{
  "command_id": "ec1d783c-16f2-4e89-82ae-b6c9144cf935"
}
```

```json
{
  "id": "fd14cd9b-26a9-4d11-b129-88067c4c4a1a",
  "order_id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "636ee6a1-4ab1-448a-9019-ee9198e1711d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "636ee6a1-4ab1-448a-9019-ee9198e1711d",
  "order_id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
  "assignment_id": "fd14cd9b-26a9-4d11-b129-88067c4c4a1a",
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

`POST /api/driver/v1/work-sessions/e1134040-d16c-4283-b680-810a78b2b069/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:39Z",
    "sequence": 1793199999318
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1134040-d16c-4283-b680-810a78b2b069",
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
  "last_heartbeat_at": "2026-10-28T15:06:39.335318Z",
  "last_location_at": "2026-10-28T15:06:39.335318Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/636ee6a1-4ab1-448a-9019-ee9198e1711d/arrive` → **200**

```json
{
  "command_id": "38b924f1-7be6-4dce-b512-0ac84438aa15",
  "expected_version": 0
}
```

```json
{
  "id": "636ee6a1-4ab1-448a-9019-ee9198e1711d",
  "order_id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
  "assignment_id": "fd14cd9b-26a9-4d11-b129-88067c4c4a1a",
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
  "arrived_at": "2026-10-28T15:06:39.536772Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/636ee6a1-4ab1-448a-9019-ee9198e1711d/start` → **200**

```json
{
  "command_id": "1b175dd1-0943-4836-88c9-6d9134efaff4",
  "expected_version": 1
}
```

```json
{
  "id": "636ee6a1-4ab1-448a-9019-ee9198e1711d",
  "order_id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
  "assignment_id": "fd14cd9b-26a9-4d11-b129-88067c4c4a1a",
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
  "arrived_at": "2026-10-28T15:06:39.536772Z",
  "started_at": "2026-10-28T15:06:39.732147Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/e1134040-d16c-4283-b680-810a78b2b069/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:39Z",
    "sequence": 1793199999918
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1134040-d16c-4283-b680-810a78b2b069",
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
  "last_heartbeat_at": "2026-10-28T15:06:39.93433Z",
  "last_location_at": "2026-10-28T15:06:39.93433Z",
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
  "device_ref": "sandbox-5333"
}
```

```json
{
  "challenge_id": "f76219c9-fa9b-4f9f-9a48-b1a88f44fea4",
  "expires_at": "2026-10-28T15:11:40.123297535Z",
  "resend_available_at": "2026-10-28T15:06:41.123297535Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "468642",
  "sent_at": "2026-10-28T15:06:40.125474978Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f76219c9-fa9b-4f9f-9a48-b1a88f44fea4",
  "code": "468642",
  "device_ref": "sandbox-5333"
}
```

```json
{
  "session_id": "86cda4b8-2ab9-4abf-8f06-e8b894225ae0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDkwMCwiaWF0IjoxNzkzMjAwMDAwLCJqdGkiOiI2NzRmODZjNC1jNzdiLTRmYTUtYWFmNS1hYWFiOTA2MTNjNGQiLCJzaWQiOiI4NmNkYTRiOC0yYWI5LTRhYmYtOGYwNi1lOGI4OTQyMjVhZTAifQ.lkvMowKsraYLjBxSAGJJcBnKtdUoGgBxam0eeC-MgPI",
  "access_expires_at": "2026-10-28T15:21:40.350289318Z",
  "refresh_token": "XTN8esRJ-nJXYG9EARiC3y3-8dLIRgUGUiTKHHoeA0Q",
  "refresh_expires_at": "2026-11-27T15:06:40.349932839Z",
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
  "command_id": "e9e350f3-e35c-4526-92af-12ecfa3ace99",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:40Z",
    "sequence": 1793200000708
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2c4bf088-74b0-4bcf-a216-d47b0c6954eb",
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
  "last_heartbeat_at": "2026-10-28T15:06:40.724924Z",
  "last_location_at": "2026-10-28T15:06:40.724924Z",
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
  "session_id": "28c63e91-bfe3-4074-a2e4-3e91764ca59b",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5MDEsImlhdCI6MTc5MzIwMDAwMSwianRpIjoiOTQ2ZTUzZWQtZjI5NC00NDU2LTgwNGEtYjQxZjhjYzg3NzI5Iiwic2lkIjoiMjhjNjNlOTEtYmZlMy00MDc0LWEyZTQtM2U5MTc2NGNhNTliIn0.Lm7hmFnWFgi_HPGfCsa9Vf7elcyJk7TmO_zMFgo8YTU",
  "access_expires_at": "2026-10-28T15:21:41.114917648Z",
  "refresh_token": "s14oxsZmjOQXHb5ZnZ81-VXDgTkS7QYLSVOtTDs11y8",
  "refresh_expires_at": "2026-10-29T03:06:41.114560609Z",
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
  "session_id": "b22c27be-aa83-4ede-a9d7-861a1ab9116c",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5MDEsImlhdCI6MTc5MzIwMDAwMSwianRpIjoiMjBjMzc2OTMtYzc1MC00Mzg4LWIwMGQtMmUyY2E2MjM3Y2ZkIiwic2lkIjoiYjIyYzI3YmUtYWE4My00ZWRlLWE5ZDctODYxYTFhYjkxMTZjIn0.kxCm2zcwOXU-yatcRyhMRlVrSoirfE-s6bPJUvsftn0",
  "access_expires_at": "2026-10-28T15:21:41.50027576Z",
  "refresh_token": "ZtZOrm0y-BRIYNEn6cTuotaTvzkJyK7_7GkdaHhl9QQ",
  "refresh_expires_at": "2026-10-29T03:06:41.499893822Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/741ca0b8-c8d0-4447-9407-647b780d9fe9` → **200**

```json
{
  "id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
  "short_number": 11,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "04caeb8a-5b66-47df-ac89-2489e75fa848",
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
    "id": "fd14cd9b-26a9-4d11-b129-88067c4c4a1a",
    "order_id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "636ee6a1-4ab1-448a-9019-ee9198e1711d",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T15:06:38.563923Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/741ca0b8-c8d0-4447-9407-647b780d9fe9/interrupt` → **200**

```json
{
  "command_id": "1a75d50d-9f00-4565-88d3-4a0be065f222",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
    "short_number": 11,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "04caeb8a-5b66-47df-ac89-2489e75fa848",
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
      "id": "fd14cd9b-26a9-4d11-b129-88067c4c4a1a",
      "order_id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "636ee6a1-4ab1-448a-9019-ee9198e1711d",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T15:06:38.563923Z",
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
    "id": "142c3e44-e5e3-4483-975a-c7e59eda7ffb",
    "short_number": 12,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "04caeb8a-5b66-47df-ac89-2489e75fa848",
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
    "id": "93c844d1-d9c3-4743-943e-5ffc79c070ca",
    "order_id": "142c3e44-e5e3-4483-975a-c7e59eda7ffb",
    "expires_at": "2026-10-28T15:06:56.902543Z",
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

`POST /api/driver/v1/offers/93c844d1-d9c3-4743-943e-5ffc79c070ca/accept` → **200**

```json
{
  "command_id": "88665088-d688-48aa-8fea-c6c6c7904c9c"
}
```

```json
{
  "id": "c58ddbd9-e7b9-4472-908a-b3102f74f7cd",
  "order_id": "142c3e44-e5e3-4483-975a-c7e59eda7ffb",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f239cada-d663-4c86-aa0e-9f2c5a06c35c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f239cada-d663-4c86-aa0e-9f2c5a06c35c",
  "order_id": "142c3e44-e5e3-4483-975a-c7e59eda7ffb",
  "assignment_id": "c58ddbd9-e7b9-4472-908a-b3102f74f7cd",
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
  "session_id": "2c4bf088-74b0-4bcf-a216-d47b0c6954eb",
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
  "last_heartbeat_at": "2026-10-28T15:06:40.724924Z",
  "last_location_at": "2026-10-28T15:06:40.724924Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/2c4bf088-74b0-4bcf-a216-d47b0c6954eb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:42Z",
    "sequence": 1793200002865
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2c4bf088-74b0-4bcf-a216-d47b0c6954eb",
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
  "last_heartbeat_at": "2026-10-28T15:06:42.881684Z",
  "last_location_at": "2026-10-28T15:06:42.881684Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f239cada-d663-4c86-aa0e-9f2c5a06c35c/arrive` → **200**

```json
{
  "command_id": "6312bed1-a8a2-4ea0-bec6-73212f8bce5e",
  "expected_version": 0
}
```

```json
{
  "id": "f239cada-d663-4c86-aa0e-9f2c5a06c35c",
  "order_id": "142c3e44-e5e3-4483-975a-c7e59eda7ffb",
  "assignment_id": "c58ddbd9-e7b9-4472-908a-b3102f74f7cd",
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
  "arrived_at": "2026-10-28T15:06:43.072459Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f239cada-d663-4c86-aa0e-9f2c5a06c35c/start` → **200**

```json
{
  "command_id": "3f87ece7-25df-4ec5-b5f5-525957a50ec9",
  "expected_version": 1
}
```

```json
{
  "id": "f239cada-d663-4c86-aa0e-9f2c5a06c35c",
  "order_id": "142c3e44-e5e3-4483-975a-c7e59eda7ffb",
  "assignment_id": "c58ddbd9-e7b9-4472-908a-b3102f74f7cd",
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
  "arrived_at": "2026-10-28T15:06:43.072459Z",
  "started_at": "2026-10-28T15:06:43.267517Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f239cada-d663-4c86-aa0e-9f2c5a06c35c/complete` → **200**

```json
{
  "command_id": "772e3408-577d-4f7c-bb05-f3fdf930f442",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:06:43Z"
}
```

```json
{
  "id": "f239cada-d663-4c86-aa0e-9f2c5a06c35c",
  "order_id": "142c3e44-e5e3-4483-975a-c7e59eda7ffb",
  "assignment_id": "c58ddbd9-e7b9-4472-908a-b3102f74f7cd",
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
  "arrived_at": "2026-10-28T15:06:43.072459Z",
  "started_at": "2026-10-28T15:06:43.267517Z",
  "completed_at": "2026-10-28T15:06:43.466766Z",
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
    "id": "142c3e44-e5e3-4483-975a-c7e59eda7ffb",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-28T15:06:41.89522Z",
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
    "id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
    "short_number": 11,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:06:38.563923Z",
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

`GET /api/operator/v1/orders/741ca0b8-c8d0-4447-9407-647b780d9fe9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:06:38.564327Z",
      "actor": {
        "type": "CLIENT",
        "id": "04caeb8a-5b66-47df-ac89-2489e75fa848",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
        "quote_id": "e9422356-3f8f-4011-b718-b826f89faf3e",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "c8b92a3e-2719-42a7-9280-acf0a6cbac62"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:06:38.565398Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
        "attempt_id": "60fd44b8-3e14-4225-a185-60fabf5a2352",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c8b92a3e-2719-42a7-9280-acf0a6cbac62"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:06:38.566954Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "28ccfd6b-9a6b-4f9c-94ca-17da0ca6ed2b",
        "order_id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "c8b92a3e-2719-42a7-9280-acf0a6cbac62"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:06:38.953897Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "28ccfd6b-9a6b-4f9c-94ca-17da0ca6ed2b",
        "order_id": "741ca0b8-c8d0-4447-9407-647b780d9fe9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "fd14cd9b-26a9-4d11-b129-88067c4c4a1a"
      },
      "correlation_id": "2918761f-f2af-4f57-9104-78d3de699116"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/142c3e44-e5e3-4483-975a-c7e59eda7ffb/tip` → **200**

```json
{
  "order_id": "142c3e44-e5e3-4483-975a-c7e59eda7ffb",
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
  "available_until": "2026-10-29T15:06:43.466766Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/142c3e44-e5e3-4483-975a-c7e59eda7ffb/tip` → **409**

```json
{
  "command_id": "b44ec4a8-d74f-484d-8c1b-6319163c4c32",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/142c3e44-e5e3-4483-975a-c7e59eda7ffb/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "17b9dfec-a87e-4bd0-a034-95301ff9846b"
}
```

Done: interrupted 741ca0b8-c8d0-4447-9407-647b780d9fe9, follow-up 142c3e44-e5e3-4483-975a-c7e59eda7ffb.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1134040-d16c-4283-b680-810a78b2b069",
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
  "last_heartbeat_at": "2026-10-28T15:06:39.93433Z",
  "last_location_at": "2026-10-28T15:06:39.93433Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e1134040-d16c-4283-b680-810a78b2b069/close` → **200**

```json
{
  "command_id": "aa68e460-fb42-4703-9657-5f5069642585",
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
  "session_id": "2c4bf088-74b0-4bcf-a216-d47b0c6954eb",
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
  "last_heartbeat_at": "2026-10-28T15:06:42.881684Z",
  "last_location_at": "2026-10-28T15:06:42.881684Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c4bf088-74b0-4bcf-a216-d47b0c6954eb/close` → **200**

```json
{
  "command_id": "e940371c-dcea-4c17-98cb-0fd2b34053fc",
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
  "session_id": "2e974464-929e-420a-bb45-397ffeb63b54",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5MDgsImlhdCI6MTc5MzIwMDAwOCwianRpIjoiMDMzNTQyMTUtYTg2Mi00ZDI0LTlmMzktNjZkYWM3MmE0YjNkIiwic2lkIjoiMmU5NzQ0NjQtOTI5ZS00MjBhLWJiNDUtMzk3ZmZlYjYzYjU0In0.wLUqGnJhTJ7cs2Hghu6EsDQTkG3ojmA3hfPMhztUFLs",
  "access_expires_at": "2026-10-28T15:21:48.584251555Z",
  "refresh_token": "bBs_Eq95gpugD_L083VkDZX5hzg5tnU4wxDEQ7_bWnQ",
  "refresh_expires_at": "2026-10-29T03:06:48.58379179Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "123688d8-86c9-472e-9ca0-e948beee6dc7",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:06:48Z"
}
```

```json
{
  "id": "df98978c-68cc-4e9d-84c7-b52e41a024f9",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:06:48Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/df98978c-68cc-4e9d-84c7-b52e41a024f9/publish` → **200**

```json
{
  "command_id": "d1124e00-befd-4cd8-89d4-d40e71ef0f54",
  "expected_version": 0
}
```

```json
{
  "id": "df98978c-68cc-4e9d-84c7-b52e41a024f9",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:06:48.986833Z",
  "published_at": "2026-10-28T15:06:48.986833Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "df98978c-68cc-4e9d-84c7-b52e41a024f9",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T15:06:48.986833Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639266912",
  "device_ref": "sandbox-25761"
}
```

```json
{
  "challenge_id": "cb27f4e0-eee6-41e1-82f3-57533ebe84d6",
  "expires_at": "2026-10-28T15:11:49.360156263Z",
  "resend_available_at": "2026-10-28T15:06:50.360156263Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639266912` → **200**

```json
{
  "phone": "+380639266912",
  "audience": "CLIENT",
  "code": "065463",
  "sent_at": "2026-10-28T15:06:49.361994351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb27f4e0-eee6-41e1-82f3-57533ebe84d6",
  "code": "065463",
  "device_ref": "sandbox-25761"
}
```

```json
{
  "session_id": "42c409f0-892f-4941-933e-f2e2aa905a8e",
  "subject": {
    "type": "CLIENT",
    "id": "fbc35a4d-2532-4bdc-9a6d-8561718e8a2c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYmMzNWE0ZC0yNTMyLTRiZGMtOWE2ZC04NTYxNzE4ZThhMmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwOTA5LCJpYXQiOjE3OTMyMDAwMDksImp0aSI6ImI2NTdlMzUwLWQ4OWYtNDU3My1hNzhjLTEwMDlhNGJmN2MwZSIsInNpZCI6IjQyYzQwOWYwLTg5MmYtNDk0MS05MzNlLWYyZTJhYTkwNWE4ZSJ9.rovsvcdApHdbEmmYOhme3IaOhleQEuKY8g_uxTyPWS0",
  "access_expires_at": "2026-10-28T15:21:49.573841572Z",
  "refresh_token": "oooJx3GJCf52I2e0HUVMrwS5LQzrHNbYNcEEE2THmds",
  "refresh_expires_at": "2026-11-27T15:06:49.573511633Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "df98978c-68cc-4e9d-84c7-b52e41a024f9",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T15:06:48.986833Z",
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
  "command_id": "7f8f1b2d-a262-4569-aa94-a0beba8f008e",
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
  "id": "d7a24c7a-e76d-4092-aba6-38faaae727b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:49.952410Z",
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
  "command_id": "f9032b86-68f6-4ab5-8db8-795d8d8457b8",
  "quote_id": "d7a24c7a-e76d-4092-aba6-38faaae727b2",
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
  "correlation_id": "fe5b156f-d0d3-42cf-ac43-12dbe86f921a"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "9e30e4cb-fbd6-4f86-bf88-2da31d9b81fc",
  "version_id": "df98978c-68cc-4e9d-84c7-b52e41a024f9",
  "language": "uk"
}
```

```json
{
  "version_id": "df98978c-68cc-4e9d-84c7-b52e41a024f9",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T15:06:50.349241Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ca535884-7562-45a8-b40f-16c76a2614af",
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
  "id": "64273b68-ecb7-457e-af1b-97308394ca0a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:50.535317Z",
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
  "command_id": "5f7f365a-cb8c-420a-9ff1-556c2b3fea58",
  "quote_id": "64273b68-ecb7-457e-af1b-97308394ca0a",
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
  "id": "d6684642-67f3-4fcf-b290-199e8aaa2623",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fbc35a4d-2532-4bdc-9a6d-8561718e8a2c",
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
  "created_at": "2026-10-28T15:06:50.722856Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d6684642-67f3-4fcf-b290-199e8aaa2623` → **200**

```json
{
  "id": "d6684642-67f3-4fcf-b290-199e8aaa2623",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fbc35a4d-2532-4bdc-9a6d-8561718e8a2c",
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
  "created_at": "2026-10-28T15:06:50.722856Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d6684642-67f3-4fcf-b290-199e8aaa2623/cancel` → **200**

```json
{
  "command_id": "0d9ede22-41f3-400d-a0e4-e9af0cc303a5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d6684642-67f3-4fcf-b290-199e8aaa2623",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fbc35a4d-2532-4bdc-9a6d-8561718e8a2c",
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
  "created_at": "2026-10-28T15:06:50.722856Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/df98978c-68cc-4e9d-84c7-b52e41a024f9` → **409**

```json
{
  "command_id": "8b303789-c175-4081-8539-44f728a17b48",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:06:51Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/df98978c-68cc-4e9d-84c7-b52e41a024f9",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b7ab36d9-702a-4557-8a60-24a738096ba1"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "57e0743c-6064-475c-a0a9-db958e91ac5a",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:06:51Z"
}
```

```json
{
  "id": "d32b2a63-12dd-445b-8385-e26bed08d7b2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:06:51Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/d32b2a63-12dd-445b-8385-e26bed08d7b2/publish` → **200**

```json
{
  "command_id": "5a85bec4-0c4e-406b-be95-8afb04d8693b",
  "expected_version": 0
}
```

```json
{
  "id": "d32b2a63-12dd-445b-8385-e26bed08d7b2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:06:51.759514Z",
  "published_at": "2026-10-28T15:06:51.759514Z",
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
  "device_ref": "sandbox-8040"
}
```

```json
{
  "challenge_id": "fe16e56d-4762-4365-9d10-709dc32f9d7d",
  "expires_at": "2026-10-28T15:11:51.951059124Z",
  "resend_available_at": "2026-10-28T15:06:52.951059124Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "027610",
  "sent_at": "2026-10-28T15:06:51.952844282Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe16e56d-4762-4365-9d10-709dc32f9d7d",
  "code": "027610",
  "device_ref": "sandbox-8040"
}
```

```json
{
  "session_id": "a9e0d2e0-35c3-4218-8ac6-d687a22d099d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDkxMiwiaWF0IjoxNzkzMjAwMDEyLCJqdGkiOiI4YWJiNzhjMi1jZmIzLTRmYTEtYjc2Zi1lNDhjZWNjNmU5NmEiLCJzaWQiOiJhOWUwZDJlMC0zNWMzLTQyMTgtOGFjNi1kNjg3YTIyZDA5OWQifQ.ej2RjHE7qZQi18WUtIU0E_vKCGhjZiSC5pWu1Omczwo",
  "access_expires_at": "2026-10-28T15:21:52.152454464Z",
  "refresh_token": "6DsmHzgIaZMUq9deobwHRb6wLderJQN-5oecY2-X3Pg",
  "refresh_expires_at": "2026-11-27T15:06:52.152079477Z",
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
  "command_id": "502f03e1-0bb4-45c7-a97b-de10578682b0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:52Z",
    "sequence": 1793200012508
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "62432d54-5a66-491a-b1a8-04bb013e7d6b",
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
  "last_heartbeat_at": "2026-10-28T15:06:52.524118Z",
  "last_location_at": "2026-10-28T15:06:52.524118Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678446078",
  "device_ref": "sandbox-10372"
}
```

```json
{
  "challenge_id": "b9e78a0d-2432-4053-81c0-c9748f881d3b",
  "expires_at": "2026-10-28T15:11:52.709403887Z",
  "resend_available_at": "2026-10-28T15:06:53.709403887Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678446078` → **200**

```json
{
  "phone": "+380678446078",
  "audience": "CLIENT",
  "code": "474265",
  "sent_at": "2026-10-28T15:06:52.71107282Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9e78a0d-2432-4053-81c0-c9748f881d3b",
  "code": "474265",
  "device_ref": "sandbox-10372"
}
```

```json
{
  "session_id": "34a8bb8b-435c-4539-8f63-f9be6a0a9353",
  "subject": {
    "type": "CLIENT",
    "id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmEyOTY0YS04Njc4LTRlYjYtOWEwZS00NDdjNzUxZDkwYzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwOTEyLCJpYXQiOjE3OTMyMDAwMTIsImp0aSI6IjRhOTgwNjMzLWE5MzYtNDllNS04MjEyLTNkMjRiMmJjOTk1MSIsInNpZCI6IjM0YThiYjhiLTQzNWMtNDUzOS04ZjYzLWY5YmU2YTBhOTM1MyJ9.EtB5baxz3WqsF3xuUSNH8bgUex92LkhOo0D_5sZ2OWo",
  "access_expires_at": "2026-10-28T15:21:52.908480122Z",
  "refresh_token": "sXG1MB4Sj2k4dnF3uPZs_95I8dOykj6SYD3WwUZzhWE",
  "refresh_expires_at": "2026-11-27T15:06:52.908161079Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "abcb7e78-286a-4667-84cf-67633100e8cb",
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
  "id": "bd7a13be-b316-4830-bc0e-ea8da3de2c89",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:53.095282Z",
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
  "command_id": "f5864ea8-2cf8-447c-a139-7b37653d11eb",
  "quote_id": "bd7a13be-b316-4830-bc0e-ea8da3de2c89",
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
    "phone": "+380672074878"
  }
}
```

```json
{
  "id": "a03a5d1e-735e-4718-b503-d99530bdbc13",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:06:53.290958Z",
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
    "id": "380eee6a-8bbf-4a63-b987-940be27c752a",
    "order_id": "a03a5d1e-735e-4718-b503-d99530bdbc13",
    "expires_at": "2026-10-28T15:07:08.293236Z",
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

`POST /api/driver/v1/offers/380eee6a-8bbf-4a63-b987-940be27c752a/accept` → **200**

```json
{
  "command_id": "3e680f5b-68af-4573-ac25-4b9aa2bf9269"
}
```

```json
{
  "id": "35abb326-fc4d-4816-a4c6-36d68718b6e3",
  "order_id": "a03a5d1e-735e-4718-b503-d99530bdbc13",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2525f922-acd4-4d04-9519-b2383e119691",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2525f922-acd4-4d04-9519-b2383e119691",
  "order_id": "a03a5d1e-735e-4718-b503-d99530bdbc13",
  "assignment_id": "35abb326-fc4d-4816-a4c6-36d68718b6e3",
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
    "phone": "+380672074878"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "57d7b675-43e7-4c6f-819e-e229748511f3",
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
  "id": "72053d1c-0210-43bd-b500-d2be9bd259d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:54.036847Z",
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
  "command_id": "71d062de-e2fc-49ce-8a44-8a2283c75f2c",
  "quote_id": "72053d1c-0210-43bd-b500-d2be9bd259d2",
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
  "id": "371e7704-207c-459b-ab74-ccad33a0b617",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:06:54.236117Z",
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
  "command_id": "2d07d31c-254f-40e5-a22c-ee01f05a57c0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T18:06:54Z"
}
```

```json
{
  "id": "68a45ced-d3d3-4b87-b48c-749da99f6cb8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:54.444929Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T18:06:54Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3ccf0273-f23c-4e0a-bd13-31e4886bd5f3",
  "quote_id": "68a45ced-d3d3-4b87-b48c-749da99f6cb8",
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
  "pickup_at": "2026-10-28T18:06:54Z"
}
```

```json
{
  "id": "b28212d6-c275-4932-aebc-610230058820",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:06:54.645118Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:06:54Z",
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
  "command_id": "988a5aa0-f569-4aaf-b9be-780bd645aa00",
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
  "id": "bcbdec42-7b9e-4296-8862-e767121ef021",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:54.842577Z",
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
  "command_id": "321dacd1-d014-4c24-ba5b-1dc841a6b7c3",
  "quote_id": "bcbdec42-7b9e-4296-8862-e767121ef021",
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
  "correlation_id": "e45b6742-7bf1-4435-bfed-48aa8d4a78a5"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "b28212d6-c275-4932-aebc-610230058820",
      "short_number": 16,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T15:06:54.645118Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T18:06:54Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "371e7704-207c-459b-ab74-ccad33a0b617",
      "short_number": 15,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T15:06:54.236117Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "a03a5d1e-735e-4718-b503-d99530bdbc13",
      "short_number": 14,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "371e7704-207c-459b-ab74-ccad33a0b617",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:06:54.236117Z",
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

`GET /api/rider/v1/orders/a03a5d1e-735e-4718-b503-d99530bdbc13` → **200**

```json
{
  "id": "a03a5d1e-735e-4718-b503-d99530bdbc13",
  "short_number": 14,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "35abb326-fc4d-4816-a4c6-36d68718b6e3",
    "order_id": "a03a5d1e-735e-4718-b503-d99530bdbc13",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2525f922-acd4-4d04-9519-b2383e119691",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:06:53.290958Z",
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
    "location_at": "2026-10-28T15:06:52.524118Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/a03a5d1e-735e-4718-b503-d99530bdbc13/cancel` → **200**

```json
{
  "command_id": "c2ea1070-105e-4dc7-b593-d6e7e36622e1",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a03a5d1e-735e-4718-b503-d99530bdbc13",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "35abb326-fc4d-4816-a4c6-36d68718b6e3",
    "order_id": "a03a5d1e-735e-4718-b503-d99530bdbc13",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2525f922-acd4-4d04-9519-b2383e119691",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:06:53.290958Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/371e7704-207c-459b-ab74-ccad33a0b617` → **200**

```json
{
  "id": "371e7704-207c-459b-ab74-ccad33a0b617",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:06:54.236117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/371e7704-207c-459b-ab74-ccad33a0b617/cancel` → **200**

```json
{
  "command_id": "34db2faf-c173-405c-a600-f87b8236ea8b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "371e7704-207c-459b-ab74-ccad33a0b617",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:06:54.236117Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b28212d6-c275-4932-aebc-610230058820` → **200**

```json
{
  "id": "b28212d6-c275-4932-aebc-610230058820",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:06:54.645118Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:06:54Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b28212d6-c275-4932-aebc-610230058820/cancel` → **200**

```json
{
  "command_id": "067e6225-97a4-44b0-b923-b5436ec16d38",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b28212d6-c275-4932-aebc-610230058820",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "a6a2964a-8678-4eb6-9a0e-447c751d90c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:06:54.645118Z",
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
  "pickup_at": "2026-10-28T18:06:54Z",
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
  "session_id": "62432d54-5a66-491a-b1a8-04bb013e7d6b",
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
  "last_heartbeat_at": "2026-10-28T15:06:52.524118Z",
  "last_location_at": "2026-10-28T15:06:52.524118Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/62432d54-5a66-491a-b1a8-04bb013e7d6b/close` → **200**

```json
{
  "command_id": "246882c5-d171-4b80-bd67-2ddf366422bd",
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

Done: orders a03a5d1e-735e-4718-b503-d99530bdbc13, 371e7704-207c-459b-ab74-ccad33a0b617, b28212d6-c275-4932-aebc-610230058820.

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
  "session_id": "a28adb10-bdf0-4d66-9338-a91e1bea2546",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5MTcsImlhdCI6MTc5MzIwMDAxNywianRpIjoiMTVkZjhmYzctNmRhZS00ZmJlLWI0MDgtMTRhNTFiNzI1MThhIiwic2lkIjoiYTI4YWRiMTAtYmRmMC00ZDY2LTkzMzgtYTkxZTFiZWEyNTQ2In0.oczeCPOwS47t4a4E8JrDCtlcLFewaZhFHwOepL3TLnA",
  "access_expires_at": "2026-10-28T15:21:57.339124972Z",
  "refresh_token": "AbAwvSbmkzHFrR3WBchjEMzlXq9uk75GFCsvHs7tJgg",
  "refresh_expires_at": "2026-10-29T03:06:57.338774582Z",
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
  "session_id": "b2c0d0df-fae7-45a5-a664-1b398c385e01",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5MTcsImlhdCI6MTc5MzIwMDAxNywianRpIjoiZDY0MzY0MGMtMzRjNy00OTc4LTgwZmQtZGZiMzk1NGMyZGIxIiwic2lkIjoiYjJjMGQwZGYtZmFlNy00NWE1LWE2NjQtMWIzOThjMzg1ZTAxIn0.0A8-xT1M3dJJ1zc5fgaJ37awT3U6RxZQu43LU62tvcI",
  "access_expires_at": "2026-10-28T15:21:57.730520683Z",
  "refresh_token": "h_ClGFitKbwVtOEuoLCRS2Qdw9GIunqAZoKL4jJfbWU",
  "refresh_expires_at": "2026-10-29T03:06:57.730184715Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11383"
}
```

```json
{
  "challenge_id": "22777645-e870-445f-9f1d-eb0fb361e1aa",
  "expires_at": "2026-10-28T15:11:57.912840375Z",
  "resend_available_at": "2026-10-28T15:06:58.912840375Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "066144",
  "sent_at": "2026-10-28T15:06:57.914531772Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22777645-e870-445f-9f1d-eb0fb361e1aa",
  "code": "066144",
  "device_ref": "sandbox-11383"
}
```

```json
{
  "session_id": "bea6098d-6d93-408c-bf97-c16925da05ce",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDkxOCwiaWF0IjoxNzkzMjAwMDE4LCJqdGkiOiI3MWNhOTJlOS1hNGRiLTQ3MDEtOTY4NC00MjBkNjdiNDg0YzUiLCJzaWQiOiJiZWE2MDk4ZC02ZDkzLTQwOGMtYmY5Ny1jMTY5MjVkYTA1Y2UifQ.YnFBmxUXUhYIphOV50AB0zIuFr-qIIP0OAOYYLZIP7I",
  "access_expires_at": "2026-10-28T15:21:58.123892231Z",
  "refresh_token": "3CWG-tILdPph825vA8WfotdbG4AzOI1opeMjQiWo8mU",
  "refresh_expires_at": "2026-11-27T15:06:58.123523504Z",
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
  "command_id": "dc47bd3a-7c7b-477a-9c96-4e77f5eb7e15",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:58Z",
    "sequence": 1793200018491
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b68c905f-379c-4c0f-a9be-db3c508e046d",
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
  "last_heartbeat_at": "2026-10-28T15:06:58.506657Z",
  "last_location_at": "2026-10-28T15:06:58.506657Z",
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
  "command_id": "2e961745-6d27-433c-ac7e-775632f79108",
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
  "effective_at": "2026-10-28T15:06:58.879004Z",
  "changed_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T15:05:22.193894Z",
  "last_entries": [
    {
      "order_id": "1ec974a5-0d29-4a80-890a-d724ecf9c2fa",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T15:05:22.193894Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "491a1526-d25b-4bd0-a9a1-0cbf1d862b1d",
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
  "id": "69101a57-340a-4e4c-b17a-f6a40accf59c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:59.246535Z",
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
  "command_id": "5ca59f5b-080e-4cb4-9a1b-7a484603dcaa",
  "quote_id": "69101a57-340a-4e4c-b17a-f6a40accf59c",
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
    "phone": "+380671110628"
  }
}
```

```json
{
  "id": "7c7580c2-7056-4f24-85c0-2c0691d51784",
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
  "created_at": "2026-10-28T15:06:59.446524Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110628"
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
    "id": "be00a285-7de4-4d24-ba1d-8367e37a9ad6",
    "order_id": "7c7580c2-7056-4f24-85c0-2c0691d51784",
    "expires_at": "2026-10-28T15:07:14.448951Z",
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

`POST /api/driver/v1/offers/be00a285-7de4-4d24-ba1d-8367e37a9ad6/accept` → **200**

```json
{
  "command_id": "ae976055-8063-48ec-a056-4b9cdc85127c"
}
```

```json
{
  "id": "4a7a282f-0dca-4a19-8c59-f99eca614b1d",
  "order_id": "7c7580c2-7056-4f24-85c0-2c0691d51784",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9f30411b-b131-4152-ac8b-91a8b2fcf553",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9f30411b-b131-4152-ac8b-91a8b2fcf553",
  "order_id": "7c7580c2-7056-4f24-85c0-2c0691d51784",
  "assignment_id": "4a7a282f-0dca-4a19-8c59-f99eca614b1d",
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
    "phone": "+380671110628"
  }
}
```

`POST /api/driver/v1/work-sessions/b68c905f-379c-4c0f-a9be-db3c508e046d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:07:00Z",
    "sequence": 1793200020182
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b68c905f-379c-4c0f-a9be-db3c508e046d",
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
  "last_heartbeat_at": "2026-10-28T15:07:00.200116Z",
  "last_location_at": "2026-10-28T15:07:00.200116Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9f30411b-b131-4152-ac8b-91a8b2fcf553/arrive` → **200**

```json
{
  "command_id": "e9138961-f596-4b75-b9be-c7dea734ad83",
  "expected_version": 0
}
```

```json
{
  "id": "9f30411b-b131-4152-ac8b-91a8b2fcf553",
  "order_id": "7c7580c2-7056-4f24-85c0-2c0691d51784",
  "assignment_id": "4a7a282f-0dca-4a19-8c59-f99eca614b1d",
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
  "arrived_at": "2026-10-28T15:07:00.396745Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671110628"
  }
}
```

`POST /api/driver/v1/trips/9f30411b-b131-4152-ac8b-91a8b2fcf553/start` → **200**

```json
{
  "command_id": "381568df-2381-4d50-9cb2-c5bc001357f3",
  "expected_version": 1
}
```

```json
{
  "id": "9f30411b-b131-4152-ac8b-91a8b2fcf553",
  "order_id": "7c7580c2-7056-4f24-85c0-2c0691d51784",
  "assignment_id": "4a7a282f-0dca-4a19-8c59-f99eca614b1d",
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
  "arrived_at": "2026-10-28T15:07:00.396745Z",
  "started_at": "2026-10-28T15:07:00.585529Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671110628"
  }
}
```

`POST /api/driver/v1/trips/9f30411b-b131-4152-ac8b-91a8b2fcf553/complete` → **200**

```json
{
  "command_id": "74755abc-76b2-49f9-bc4f-b522ed73bd91",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:07:00Z",
  "cash_received": true
}
```

```json
{
  "id": "9f30411b-b131-4152-ac8b-91a8b2fcf553",
  "order_id": "7c7580c2-7056-4f24-85c0-2c0691d51784",
  "assignment_id": "4a7a282f-0dca-4a19-8c59-f99eca614b1d",
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
  "arrived_at": "2026-10-28T15:07:00.396745Z",
  "started_at": "2026-10-28T15:07:00.585529Z",
  "completed_at": "2026-10-28T15:07:00.820093Z",
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
  "command_id": "a0ad8e8c-c7b1-4828-90e9-4d152b7f905c",
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
  "id": "2a6ad830-7be0-4065-a24e-b7733cafda62",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:12:01.014887Z",
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
  "command_id": "2a1196e1-99ef-4590-990e-2709ca7f6d86",
  "quote_id": "2a6ad830-7be0-4065-a24e-b7733cafda62",
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
    "phone": "+3806711131181"
  }
}
```

```json
{
  "id": "284e4a1f-a13e-45a6-9ce8-d3f8a29a412e",
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
  "created_at": "2026-10-28T15:07:01.215668Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131181"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/284e4a1f-a13e-45a6-9ce8-d3f8a29a412e` → **200**

```json
{
  "id": "284e4a1f-a13e-45a6-9ce8-d3f8a29a412e",
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
  "created_at": "2026-10-28T15:07:01.215668Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131181"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/284e4a1f-a13e-45a6-9ce8-d3f8a29a412e/cancel` → **200**

```json
{
  "command_id": "5223bc59-0e47-4d9a-84af-33e2ebb59534",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "284e4a1f-a13e-45a6-9ce8-d3f8a29a412e",
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
  "created_at": "2026-10-28T15:07:01.215668Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131181"
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
  "staff_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T15:05:22.193894Z",
  "last_entries": [
    {
      "order_id": "284e4a1f-a13e-45a6-9ce8-d3f8a29a412e",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T15:07:01.609818Z"
    },
    {
      "order_id": "7c7580c2-7056-4f24-85c0-2c0691d51784",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T15:07:00.823342Z"
    },
    {
      "order_id": "1ec974a5-0d29-4a80-890a-d724ecf9c2fa",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T15:05:22.193894Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b68c905f-379c-4c0f-a9be-db3c508e046d",
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
  "last_heartbeat_at": "2026-10-28T15:07:00.200116Z",
  "last_location_at": "2026-10-28T15:07:00.200116Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b68c905f-379c-4c0f-a9be-db3c508e046d/close` → **200**

```json
{
  "command_id": "66538b01-b401-49e2-9f44-a82e7d075d3b",
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

Done: operator bonus for fulfilled 7c7580c2-7056-4f24-85c0-2c0691d51784 and operator-fault cancellation 284e4a1f-a13e-45a6-9ce8-d3f8a29a412e.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678605683",
  "device_ref": "sandbox-9527"
}
```

```json
{
  "challenge_id": "cea25cdd-c954-4f8f-a5ed-a9ba10e154c8",
  "expires_at": "2026-10-28T15:12:04.380723174Z",
  "resend_available_at": "2026-10-28T15:07:05.380723174Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678605683` → **200**

```json
{
  "phone": "+380678605683",
  "audience": "CLIENT",
  "code": "754337",
  "sent_at": "2026-10-28T15:07:04.382544688Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676895027",
  "device_ref": "sandbox-23856",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "de70a67f-61f5-47ef-af97-e1afd07ccce7",
  "expires_at": "2026-10-28T15:12:04.578498551Z",
  "resend_available_at": "2026-10-28T15:07:05.578498551Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676895027` → **200**

```json
{
  "phone": "+380676895027",
  "audience": "CLIENT",
  "code": "520392",
  "sent_at": "2026-10-28T15:07:04.580120984Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678280000",
  "device_ref": "sandbox-3754"
}
```

```json
{
  "challenge_id": "61b05316-c168-4b4d-b907-b58426e32028",
  "expires_at": "2026-10-28T15:12:04.776166445Z",
  "resend_available_at": "2026-10-28T15:07:05.776166445Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678280000` → **200**

```json
{
  "phone": "+380678280000",
  "audience": "CLIENT",
  "code": "593258",
  "sent_at": "2026-10-28T15:07:04.778380342Z",
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
  "session_id": "c02dd905-fe4c-489a-9747-63f376ae58e2",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5MjUsImlhdCI6MTc5MzIwMDAyNSwianRpIjoiMjYxZTk0YTgtZDQ3OC00NTg2LTliNWQtNjI1N2I0ZDk5MzhmIiwic2lkIjoiYzAyZGQ5MDUtZmU0Yy00ODlhLTk3NDctNjNmMzc2YWU1OGUyIn0.CRyLUKaZUkEPPXVYyLU_RFpOafNDNu8cEYZtRo_R28I",
  "access_expires_at": "2026-10-28T15:22:05.181115378Z",
  "refresh_token": "GGfhMHhN2m7zfyTWWCaVsKybP4oBCD2XqWkLBXz_wIg",
  "refresh_expires_at": "2026-10-29T03:07:05.180765559Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678280000` → **200**

```json
{
  "deliveries": [
    {
      "id": "33926cf5-59a7-407e-bcbb-bed9a137df87",
      "challenge_id": "61b05316-c168-4b4d-b907-b58426e32028",
      "phone": "+380678280000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-7ae3caeb-fdfb-45de-8314-10928024e450",
      "error": null,
      "attempted_at": "2026-10-28T15:07:04.778611Z"
    },
    {
      "id": "d30f1532-b42c-47c5-b3ec-ecb6ee14aeac",
      "challenge_id": "61b05316-c168-4b4d-b907-b58426e32028",
      "phone": "+380678280000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T15:07:04.777924Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678280000` → **200**

```json
{
  "phone": "+380678280000",
  "audience": "CLIENT",
  "code": "593258",
  "sent_at": "2026-10-28T15:07:04.778380342Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676895027` → **200**

```json
{
  "deliveries": [
    {
      "id": "f64bcade-c33d-425b-889c-efa3086b1c1b",
      "challenge_id": "de70a67f-61f5-47ef-af97-e1afd07ccce7",
      "phone": "+380676895027",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-19af3950-12ad-4c50-99a3-85c14a6a64c5",
      "error": null,
      "attempted_at": "2026-10-28T15:07:04.580362Z"
    }
  ]
}
```

Done: SMS to +380678605683, a call to +380676895027, SMS then a call to +380678280000.

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
  "session_id": "336b8ade-75e0-4496-8710-b0535036bbb4",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5MjUsImlhdCI6MTc5MzIwMDAyNSwianRpIjoiMzcwMGJhZmUtZDZkOC00ODRiLWEzNzQtZWRjNzllNWRkZmI1Iiwic2lkIjoiMzM2YjhhZGUtNzVlMC00NDk2LTg3MTAtYjA1MzUwMzZiYmI0In0.xsjt4xNQH1dQw7fGPy1zqFDOgSSJKwS2eDJK8URGMx0",
  "access_expires_at": "2026-10-28T15:22:05.950815349Z",
  "refresh_token": "SzOGq6LlS45bix6O6Rjwp4pIRXliAjDhUTd7XOAmKEE",
  "refresh_expires_at": "2026-10-29T03:07:05.950451458Z",
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
  "session_id": "cd7335d6-771f-4a14-a9f0-cca161fb12d5",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5MjYsImlhdCI6MTc5MzIwMDAyNiwianRpIjoiMWVhMmY1YzgtZmRmYS00YzgzLTliM2ItNjJjM2Y0MGU3M2FjIiwic2lkIjoiY2Q3MzM1ZDYtNzcxZi00YTE0LWE5ZjAtY2NhMTYxZmIxMmQ1In0.97oNzzhnkDORiOfrl4u3WnuyUDrPnes55cqKsQXNwd4",
  "access_expires_at": "2026-10-28T15:22:06.323745763Z",
  "refresh_token": "U3rCXxABbNzSRXH20gBas-wxvuiUITysvH5Mq66utaE",
  "refresh_expires_at": "2026-10-29T03:07:06.32341271Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
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

`POST /api/admin/v1/staff-extensions/41b39d15-7936-4b20-b8c7-04f8c064b914` → **200**

```json
{
  "command_id": "df0dfa1f-80ef-4737-9bda-3d82c3b594cc",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "fce134f7-0a22-4426-9f46-71a91387c3ab",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T15:07:07.052333Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T15:07:07.052333Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cae9b6e3-0aed-4c4b-ae6f-332acd15bb17",
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
  "id": "1a6f08f6-9b78-4204-a839-afb0861abce4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:12:07.403208Z",
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
  "command_id": "2e331bdb-292f-455e-a9a3-5b3c3fec2913",
  "quote_id": "1a6f08f6-9b78-4204-a839-afb0861abce4",
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
    "phone": "+380673392538"
  }
}
```

```json
{
  "id": "075b1a9e-e3e3-445d-9275-62410a2194da",
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
  "created_at": "2026-10-28T15:07:07.581268Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673392538"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/075b1a9e-e3e3-445d-9275-62410a2194da/calls` → **201**

```json
{
  "command_id": "edcd2c7f-281c-4cc6-9d96-8c68e7b71d72",
  "to": "CALLER"
}
```

```json
{
  "id": "ff4b68e5-29de-4bf9-aee8-edea18f93839",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "order_ids": [
    "075b1a9e-e3e3-445d-9275-62410a2194da"
  ],
  "started_at": "2026-10-28T15:07:07.778958Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/075b1a9e-e3e3-445d-9275-62410a2194da/calls` → **201**

```json
{
  "command_id": "edcd2c7f-281c-4cc6-9d96-8c68e7b71d72",
  "to": "CALLER"
}
```

```json
{
  "id": "ff4b68e5-29de-4bf9-aee8-edea18f93839",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "order_ids": [
    "075b1a9e-e3e3-445d-9275-62410a2194da"
  ],
  "started_at": "2026-10-28T15:07:07.778958Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "ff4b68e5-29de-4bf9-aee8-edea18f93839",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673392538",
    "at": "2026-10-28T15:07:07.780551355Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "ff4b68e5-29de-4bf9-aee8-edea18f93839",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.20902",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "ff4b68e5-29de-4bf9-aee8-edea18f93839"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "ff4b68e5-29de-4bf9-aee8-edea18f93839",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=075b1a9e-e3e3-445d-9275-62410a2194da` → **200**

```json
{
  "calls": [
    {
      "id": "ff4b68e5-29de-4bf9-aee8-edea18f93839",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "order_ids": [
        "075b1a9e-e3e3-445d-9275-62410a2194da"
      ],
      "started_at": "2026-10-28T15:07:07.778958Z",
      "answered_at": "2026-10-28T15:07:08.215557Z",
      "ended_at": "2026-10-28T15:07:08.236133Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=075b1a9e-e3e3-445d-9275-62410a2194da` → **200**

```json
{
  "calls": [
    {
      "id": "ff4b68e5-29de-4bf9-aee8-edea18f93839",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "order_ids": [
        "075b1a9e-e3e3-445d-9275-62410a2194da"
      ],
      "started_at": "2026-10-28T15:07:07.778958Z",
      "answered_at": "2026-10-28T15:07:08.215557Z",
      "ended_at": "2026-10-28T15:07:08.236133Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=075b1a9e-e3e3-445d-9275-62410a2194da` → **200**

```json
{
  "calls": [
    {
      "id": "ff4b68e5-29de-4bf9-aee8-edea18f93839",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "order_ids": [
        "075b1a9e-e3e3-445d-9275-62410a2194da"
      ],
      "started_at": "2026-10-28T15:07:07.778958Z",
      "answered_at": "2026-10-28T15:07:08.215557Z",
      "ended_at": "2026-10-28T15:07:08.236133Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=075b1a9e-e3e3-445d-9275-62410a2194da` → **200**

```json
{
  "calls": [
    {
      "id": "ff4b68e5-29de-4bf9-aee8-edea18f93839",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "order_ids": [
        "075b1a9e-e3e3-445d-9275-62410a2194da"
      ],
      "started_at": "2026-10-28T15:07:07.778958Z",
      "answered_at": "2026-10-28T15:07:08.215557Z",
      "ended_at": "2026-10-28T15:07:08.236133Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:07:14.312597Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/075b1a9e-e3e3-445d-9275-62410a2194da` → **200**

```json
{
  "id": "075b1a9e-e3e3-445d-9275-62410a2194da",
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
  "created_at": "2026-10-28T15:07:07.581268Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673392538"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/075b1a9e-e3e3-445d-9275-62410a2194da/cancel` → **200**

```json
{
  "command_id": "803b2cff-ff2e-4515-bd14-132f7b1a30f4",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "075b1a9e-e3e3-445d-9275-62410a2194da",
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
  "created_at": "2026-10-28T15:07:07.581268Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673392538"
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
  "command_id": "bb008da8-49ef-4327-9bb4-8289a32bde19",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T15:07:15.412497Z",
  "extension": "101"
}
```

Done: outgoing call ff4b68e5-29de-4bf9-aee8-edea18f93839 from order 075b1a9e-e3e3-445d-9275-62410a2194da, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632184939",
  "device_ref": "sandbox-3933"
}
```

```json
{
  "challenge_id": "140e6c31-3e2b-4431-b2d3-94f88b625d1f",
  "expires_at": "2026-10-28T15:12:15.644507934Z",
  "resend_available_at": "2026-10-28T15:07:16.644507934Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632184939` → **200**

```json
{
  "phone": "+380632184939",
  "audience": "CLIENT",
  "code": "845372",
  "sent_at": "2026-10-28T15:07:15.648372917Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "140e6c31-3e2b-4431-b2d3-94f88b625d1f",
  "code": "845372",
  "device_ref": "sandbox-3933"
}
```

```json
{
  "session_id": "5c9784f8-54ba-4a7c-8ae0-a8848a5439b7",
  "subject": {
    "type": "CLIENT",
    "id": "25f310de-4b19-4310-b0a9-9f54f784cf83"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNWYzMTBkZS00YjE5LTQzMTAtYjBhOS05ZjU0Zjc4NGNmODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwOTM1LCJpYXQiOjE3OTMyMDAwMzUsImp0aSI6ImQxNWMwZjE0LWY0ZjYtNDg5ZS1hZTY1LWIyMzRmMzIwMjgwNiIsInNpZCI6IjVjOTc4NGY4LTU0YmEtNGE3Yy04YWUwLWE4ODQ4YTU0MzliNyJ9.X1FAFnf16CzyOro0DLuG5C_Tudl4yq2l2etWremzoCQ",
  "access_expires_at": "2026-10-28T15:22:15.855455523Z",
  "refresh_token": "OJzO8K4vlYvl4Gh3sbSbn6fbfg06ceax2LGV6WoC2EE",
  "refresh_expires_at": "2026-11-27T15:07:15.854749867Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "25f310de-4b19-4310-b0a9-9f54f784cf83",
  "session_id": "5c9784f8-54ba-4a7c-8ae0-a8848a5439b7",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632184939",
  "device_ref": "sandbox-31829"
}
```

```json
{
  "challenge_id": "e9b24783-ebf7-476a-87c6-489f16bb1206",
  "expires_at": "2026-10-28T15:12:18.212752396Z",
  "resend_available_at": "2026-10-28T15:07:19.212752396Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632184939` → **200**

```json
{
  "phone": "+380632184939",
  "audience": "CLIENT",
  "code": "705796",
  "sent_at": "2026-10-28T15:07:18.214290852Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9b24783-ebf7-476a-87c6-489f16bb1206",
  "code": "705796",
  "device_ref": "sandbox-31829"
}
```

```json
{
  "session_id": "ac7716fb-8ef1-4adf-a7fc-fbe5c875cd3d",
  "subject": {
    "type": "CLIENT",
    "id": "25f310de-4b19-4310-b0a9-9f54f784cf83"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNWYzMTBkZS00YjE5LTQzMTAtYjBhOS05ZjU0Zjc4NGNmODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwOTM4LCJpYXQiOjE3OTMyMDAwMzgsImp0aSI6ImRiMWE3YzQ3LWNjMGMtNDI5OC05NTljLTNjZGI0NjFmODA2MCIsInNpZCI6ImFjNzcxNmZiLThlZjEtNGFkZi1hN2ZjLWZiZTVjODc1Y2QzZCJ9.SUqMNytI7UI0l4kr5mCgYHn0Bt25cvHm0Ykb_cs0koo",
  "access_expires_at": "2026-10-28T15:22:18.413687988Z",
  "refresh_token": "ZV1k6xJy_GJDzXmWApAzdgUe43NxPQrtYmdAnI3Earw",
  "refresh_expires_at": "2026-11-27T15:07:18.413296216Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "a0a94877-8bb0-4d66-b882-ada71b4a9b81",
  "expires_at": "2026-10-28T15:12:20.597681163Z",
  "resend_available_at": "2026-10-28T15:07:21.597681163Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632184939` → **200**

```json
{
  "phone": "+380632184939",
  "audience": "CLIENT",
  "code": "457209",
  "sent_at": "2026-10-28T15:07:20.599034499Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380638550610"
}
```

```json
{
  "challenge_id": "792509fe-e8d6-446c-bc7d-77554a044b19",
  "expires_at": "2026-10-28T15:12:20.799268691Z",
  "resend_available_at": "2026-10-28T15:07:21.799268691Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638550610` → **200**

```json
{
  "phone": "+380638550610",
  "audience": "CLIENT",
  "code": "762532",
  "sent_at": "2026-10-28T15:07:20.80066417Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "ebe86213-8c1c-4af6-a0fa-a133aa272408",
  "current_challenge_id": "a0a94877-8bb0-4d66-b882-ada71b4a9b81",
  "current_code": "000000",
  "new_challenge_id": "792509fe-e8d6-446c-bc7d-77554a044b19",
  "new_code": "762532"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "1e612281-efba-429b-b580-df23c7d8d00d"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "634e2143-a03d-447c-8b54-00084bc33279",
  "current_challenge_id": "a0a94877-8bb0-4d66-b882-ada71b4a9b81",
  "current_code": "457209",
  "new_challenge_id": "792509fe-e8d6-446c-bc7d-77554a044b19",
  "new_code": "762532"
}
```

```json
{
  "subject_id": "25f310de-4b19-4310-b0a9-9f54f784cf83",
  "phone": "+380638550610",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "25f310de-4b19-4310-b0a9-9f54f784cf83",
  "session_id": "5c9784f8-54ba-4a7c-8ae0-a8848a5439b7",
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
  "correlation_id": "92f8a617-c2c6-43a0-add6-2e0f1bc4129d"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638550610",
  "device_ref": "sandbox-19530"
}
```

```json
{
  "challenge_id": "6ab75226-eb6f-4aec-8c44-b1435e1ab537",
  "expires_at": "2026-10-28T15:12:23.766803606Z",
  "resend_available_at": "2026-10-28T15:07:24.766803606Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638550610` → **200**

```json
{
  "phone": "+380638550610",
  "audience": "CLIENT",
  "code": "586526",
  "sent_at": "2026-10-28T15:07:23.768428503Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ab75226-eb6f-4aec-8c44-b1435e1ab537",
  "code": "586526",
  "device_ref": "sandbox-19530"
}
```

```json
{
  "session_id": "2eba737e-729b-4cd7-8b21-bf75bcd2d4e2",
  "subject": {
    "type": "CLIENT",
    "id": "25f310de-4b19-4310-b0a9-9f54f784cf83"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNWYzMTBkZS00YjE5LTQzMTAtYjBhOS05ZjU0Zjc4NGNmODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwOTQzLCJpYXQiOjE3OTMyMDAwNDMsImp0aSI6ImM1NmEzODhiLWRkMzEtNDk3My1iZmQ5LTlhYzE5NmU2NWVhNSIsInNpZCI6IjJlYmE3MzdlLTcyOWItNGNkNy04YjIxLWJmNzViY2QyZDRlMiJ9.afyxz600D-BeYbA5C8063p3pjesTM1LKLK6yqZ0AhZ4",
  "access_expires_at": "2026-10-28T15:22:23.974410613Z",
  "refresh_token": "4VtIZ07KuXPv1RZX5B4ufDHucj-fBnz88xP2cg_HADY",
  "refresh_expires_at": "2026-11-27T15:07:23.973941443Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "25f310de-4b19-4310-b0a9-9f54f784cf83",
  "session_id": "2eba737e-729b-4cd7-8b21-bf75bcd2d4e2",
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
  "session_id": "3557c299-6030-4741-a3e2-f30eba8b5b2c",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NDQsImlhdCI6MTc5MzIwMDA0NCwianRpIjoiYjQ4YjgxZmItYzRkZC00MGZjLTg3NTAtMGZhMWY2ZmUyMjc2Iiwic2lkIjoiMzU1N2MyOTktNjAzMC00NzQxLWEzZTItZjMwZWJhOGI1YjJjIn0.dE6ujEigYvGxeDZH7oWuZFSsiQndsXPIcAFnVpeXSs0",
  "access_expires_at": "2026-10-28T15:22:24.53859832Z",
  "refresh_token": "F2-JmAXrDDu5lfnvJotjH_I_S5rW7E_f9QEOT9zvK84",
  "refresh_expires_at": "2026-10-29T03:07:24.538158815Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/25f310de-4b19-4310-b0a9-9f54f784cf83` → **200**

```json
{
  "client": {
    "id": "25f310de-4b19-4310-b0a9-9f54f784cf83",
    "phone": "+380638550610",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:07:15.853077Z",
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

`POST /api/admin/v1/clients/25f310de-4b19-4310-b0a9-9f54f784cf83/phone` → **400**

```json
{
  "command_id": "18a163dc-82ac-4aef-95e0-51d4492c7e0c",
  "expected_version": 3,
  "phone": "+380639607485",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/25f310de-4b19-4310-b0a9-9f54f784cf83/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "133d4198-d44d-4292-9e7c-aac4d39b83e6",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/25f310de-4b19-4310-b0a9-9f54f784cf83/phone` → **200**

```json
{
  "command_id": "0d2270fa-5673-4b05-8af1-45f538c6b78e",
  "expected_version": 3,
  "phone": "+380639607485",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "25f310de-4b19-4310-b0a9-9f54f784cf83",
  "phone": "+380639607485",
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
  "correlation_id": "dc9ff38d-dfdd-4c6e-813d-c77aa377b70f"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639607485",
  "device_ref": "sandbox-13013"
}
```

```json
{
  "challenge_id": "3bd64ccd-f033-4ee3-8b5a-e7cf8794ca55",
  "expires_at": "2026-10-28T15:12:25.48242943Z",
  "resend_available_at": "2026-10-28T15:07:26.48242943Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639607485` → **200**

```json
{
  "phone": "+380639607485",
  "audience": "CLIENT",
  "code": "379487",
  "sent_at": "2026-10-28T15:07:25.484152846Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3bd64ccd-f033-4ee3-8b5a-e7cf8794ca55",
  "code": "379487",
  "device_ref": "sandbox-13013"
}
```

```json
{
  "session_id": "4edb2cd9-a890-416b-9cff-9eb3723579d3",
  "subject": {
    "type": "CLIENT",
    "id": "25f310de-4b19-4310-b0a9-9f54f784cf83"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNWYzMTBkZS00YjE5LTQzMTAtYjBhOS05ZjU0Zjc4NGNmODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwOTQ1LCJpYXQiOjE3OTMyMDAwNDUsImp0aSI6IjQzNjFkYTcyLTM3ZjgtNDJhNy1hYWY3LWZkZmYzZTBlNDU2MSIsInNpZCI6IjRlZGIyY2Q5LWE4OTAtNDE2Yi05Y2ZmLTllYjM3MjM1NzlkMyJ9.F8r28J2nL_4GXfJVhYrtUVkTpUi9cnl-s-zTcicjcQk",
  "access_expires_at": "2026-10-28T15:22:25.679058802Z",
  "refresh_token": "trjV9Cmx65vEiApSOmKVyvdV9oe78kBaFodJKlAXbzI",
  "refresh_expires_at": "2026-11-27T15:07:25.678629353Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "25f310de-4b19-4310-b0a9-9f54f784cf83",
  "session_id": "4edb2cd9-a890-416b-9cff-9eb3723579d3",
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
  "phone": "+380632093968",
  "device_ref": "sandbox-6668"
}
```

```json
{
  "challenge_id": "73d0a70e-fc75-489d-96f1-5fbec6ad29ce",
  "expires_at": "2026-10-28T15:12:26.035061419Z",
  "resend_available_at": "2026-10-28T15:07:27.035061419Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632093968` → **200**

```json
{
  "phone": "+380632093968",
  "audience": "CLIENT",
  "code": "131137",
  "sent_at": "2026-10-28T15:07:26.037199841Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73d0a70e-fc75-489d-96f1-5fbec6ad29ce",
  "code": "131137",
  "device_ref": "sandbox-6668"
}
```

```json
{
  "session_id": "36c56700-ae5e-48cd-a130-8a5750ced55b",
  "subject": {
    "type": "CLIENT",
    "id": "24333b5f-d4bb-4d87-8383-9f1726fc5c75"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDMzM2I1Zi1kNGJiLTRkODctODM4My05ZjE3MjZmYzVjNzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwOTQ2LCJpYXQiOjE3OTMyMDAwNDYsImp0aSI6IjBjMDJkNDVmLWM3Y2QtNDM2Yy1iYTU5LWIwYTgyMDI3MGRkNiIsInNpZCI6IjM2YzU2NzAwLWFlNWUtNDhjZC1hMTMwLThhNTc1MGNlZDU1YiJ9.ZvjIj2_oZna8upjhFPChuRXs_lw6cQ_Bd-MVUuCNnro",
  "access_expires_at": "2026-10-28T15:22:26.250342196Z",
  "refresh_token": "KgM5WF_bsbN0OIpOQ5b2hwXqiXdChTryi_s6-kSHf4A",
  "refresh_expires_at": "2026-11-27T15:07:26.2498953Z",
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
  "session_id": "f35b7db4-2b2f-45af-9443-ed450bf6ab25",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NDcsImlhdCI6MTc5MzIwMDA0NywianRpIjoiNmIyOTM3ZWQtOGE3ZS00NWI2LThjYmQtMDdiMjg3YzAzZTE4Iiwic2lkIjoiZjM1YjdkYjQtMmIyZi00NWFmLTk0NDMtZWQ0NTBiZjZhYjI1In0.kkdFuHOK-q5YhpwaW9tIl89iE4tJo_sP9lj91CT9-KQ",
  "access_expires_at": "2026-10-28T15:22:27.026063635Z",
  "refresh_token": "KsWEowE-tIWGmkZfHVxpuFeECNzuchXfar1ruCPBwWk",
  "refresh_expires_at": "2026-10-29T03:07:27.025592032Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632093968` → **200**

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
  "correlation_id": "0ad52a03-5446-47bb-bf05-d633dd95bf36"
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
  "session_id": "60f7d2c6-25c6-47da-be4d-d67bcabb5783",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NDcsImlhdCI6MTc5MzIwMDA0NywianRpIjoiNTZhMTQxNzUtYTg5My00ODJkLThhMGMtMzY1NjA1NmYzZmYxIiwic2lkIjoiNjBmN2QyYzYtMjVjNi00N2RhLWJlNGQtZDY3YmNhYmI1NzgzIn0.uCpgRBi-WPvdijEGvbY0XfuzokhmC6_Ff6O2WLobKxI",
  "access_expires_at": "2026-10-28T15:22:27.917211459Z",
  "refresh_token": "MY6NyBtaIf0nd3RO_7ZanBAqig5nA0HjWWnGEb6QExk",
  "refresh_expires_at": "2026-10-29T03:07:27.916724633Z",
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
  "command_id": "326f88c6-0d9a-4d68-bf59-b7fc4fdf7bf6",
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
  "changed_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T15:07:28.312828537Z"
}
```

## The rider books the airport for 2026-10-28T18:07:27Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600139824",
  "device_ref": "sandbox-12898"
}
```

```json
{
  "challenge_id": "4b87ecbf-880a-40e1-b8ea-45503799d49e",
  "expires_at": "2026-10-28T15:12:28.505667099Z",
  "resend_available_at": "2026-10-28T15:07:29.505667099Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600139824` → **200**

```json
{
  "phone": "+48600139824",
  "audience": "CLIENT",
  "code": "890189",
  "sent_at": "2026-10-28T15:07:28.507340179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b87ecbf-880a-40e1-b8ea-45503799d49e",
  "code": "890189",
  "device_ref": "sandbox-12898"
}
```

```json
{
  "session_id": "4d5471ef-f1de-4b3d-98f1-b6a2308cb880",
  "subject": {
    "type": "CLIENT",
    "id": "df314615-8121-4d7b-9819-598ca0f7a40b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZjMxNDYxNS04MTIxLTRkN2ItOTgxOS01OThjYTBmN2E0MGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwOTQ4LCJpYXQiOjE3OTMyMDAwNDgsImp0aSI6ImFmNTAyNjYzLWVjYWMtNDc3OC1iY2JjLTU1NWY0NmI0YmIwMyIsInNpZCI6IjRkNTQ3MWVmLWYxZGUtNGIzZC05OGYxLWI2YTIzMDhjYjg4MCJ9.C_yZ4-ZEyvtmO5Bz65qmHx1jYNXaRcY85yUuWDFrzkQ",
  "access_expires_at": "2026-10-28T15:22:28.715213157Z",
  "refresh_token": "UZFelvCwrT95qYu90eDK-jfCvVUFqYXN21hAjoSOC3o",
  "refresh_expires_at": "2026-11-27T15:07:28.71473201Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "12b80ad3-b3d6-4629-8f8a-1429c71c21ad",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T18:07:27Z"
}
```

```json
{
  "id": "679ea8e6-3056-4829-af0b-dd49945137bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:12:28.909728Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T18:07:27Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0ffa28d5-97c7-467f-a26e-018232e9fb71",
  "quote_id": "679ea8e6-3056-4829-af0b-dd49945137bb",
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
  "pickup_at": "2026-10-28T18:07:27Z"
}
```

```json
{
  "id": "b078d442-d5f6-4965-a094-f7223d0a8209",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "df314615-8121-4d7b-9819-598ca0f7a40b",
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
  "created_at": "2026-10-28T15:07:29.105633Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:07:27Z",
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
  "device_ref": "sandbox-30256"
}
```

```json
{
  "challenge_id": "8d5bc4ec-f7a2-4d2f-9ca2-5fca9f56f668",
  "expires_at": "2026-10-28T15:12:29.305284301Z",
  "resend_available_at": "2026-10-28T15:07:30.305284301Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "149680",
  "sent_at": "2026-10-28T15:07:29.307389534Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8d5bc4ec-f7a2-4d2f-9ca2-5fca9f56f668",
  "code": "149680",
  "device_ref": "sandbox-30256"
}
```

```json
{
  "session_id": "6edafc2b-0f74-4573-beaa-17a96b52b884",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDk0OSwiaWF0IjoxNzkzMjAwMDQ5LCJqdGkiOiJlYWE5MjIwNS0zYTQ0LTQ0MzMtODU0Ny04N2FkNjE5NjlkNWEiLCJzaWQiOiI2ZWRhZmMyYi0wZjc0LTQ1NzMtYmVhYS0xN2E5NmI1MmI4ODQifQ.UMSLwRuiM2N2zelDbN96SXmraUcSFgynTF0MzCi8f7c",
  "access_expires_at": "2026-10-28T15:22:29.513299234Z",
  "refresh_token": "dTU7deLLEA4mqGhD4K6vHxr0Gve0dSa-VLXKurV0hKE",
  "refresh_expires_at": "2026-11-27T15:07:29.512873461Z",
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
  "command_id": "198614c2-7cb2-45f4-b920-37b941ce00de",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:07:29Z",
    "sequence": 1793200049882
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "38a70a6b-9352-430b-8874-4cbf9d190dcd",
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
  "last_heartbeat_at": "2026-10-28T15:07:29.898057Z",
  "last_location_at": "2026-10-28T15:07:29.898057Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "b078d442-d5f6-4965-a094-f7223d0a8209",
      "short_number": 20,
      "pickup_at": "2026-10-28T18:07:27Z",
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

`POST /api/driver/v1/preorders/b078d442-d5f6-4965-a094-f7223d0a8209/reserve` → **200**

```json
{
  "command_id": "40a8b9a8-b2c3-418d-a765-3e120a793d9b"
}
```

```json
{
  "id": "6a5229c5-56db-44e9-86ff-932fbea08cc4",
  "state": "RESERVED",
  "order": {
    "order_id": "b078d442-d5f6-4965-a094-f7223d0a8209",
    "short_number": 20,
    "pickup_at": "2026-10-28T18:07:27Z",
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
  "reserved_at": "2026-10-28T15:07:30.278154Z",
  "confirm_from": "2026-10-28T17:37:27Z",
  "confirm_until": "2026-10-28T17:47:27Z",
  "drop_until": "2026-10-28T17:07:27Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "6a5229c5-56db-44e9-86ff-932fbea08cc4",
      "state": "RESERVED",
      "order": {
        "order_id": "b078d442-d5f6-4965-a094-f7223d0a8209",
        "short_number": 20,
        "pickup_at": "2026-10-28T18:07:27Z",
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
      "reserved_at": "2026-10-28T15:07:30.278154Z",
      "confirm_from": "2026-10-28T17:37:27Z",
      "confirm_until": "2026-10-28T17:47:27Z",
      "drop_until": "2026-10-28T17:07:27Z"
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
      "id": "6a5229c5-56db-44e9-86ff-932fbea08cc4",
      "state": "RESERVED",
      "order": {
        "order_id": "b078d442-d5f6-4965-a094-f7223d0a8209",
        "short_number": 20,
        "pickup_at": "2026-10-28T18:07:27Z",
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
      "reserved_at": "2026-10-28T15:07:30.278154Z",
      "confirm_from": "2026-10-28T17:37:27Z",
      "confirm_until": "2026-10-28T17:47:27Z",
      "drop_until": "2026-10-28T17:07:27Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/6a5229c5-56db-44e9-86ff-932fbea08cc4/confirm` → **409**

```json
{
  "command_id": "2307e1e7-fd16-4024-8283-19c9c437364e"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/6a5229c5-56db-44e9-86ff-932fbea08cc4/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "685fd0f4-e197-46d4-b5dd-b678e68962ea"
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
  "session_id": "7afae888-e8ac-4946-b3cf-2c4f4b4d53ce",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NTEsImlhdCI6MTc5MzIwMDA1MSwianRpIjoiMjA3MGViZmQtODg2My00YjJkLTliYWYtNzAyZDk1NzAzOGFlIiwic2lkIjoiN2FmYWU4ODgtZThhYy00OTQ2LWIzY2YtMmM0ZjRiNGQ1M2NlIn0.iNALvqadSFDdUbAiafhX7ILF51aApOThLVzZrali360",
  "access_expires_at": "2026-10-28T15:22:31.291809457Z",
  "refresh_token": "-NbJObIyNBzA1Yl69im9HXgXLD1pgqN798cYTMzszwE",
  "refresh_expires_at": "2026-10-29T03:07:31.291267268Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b078d442-d5f6-4965-a094-f7223d0a8209` → **200**

```json
{
  "id": "b078d442-d5f6-4965-a094-f7223d0a8209",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "df314615-8121-4d7b-9819-598ca0f7a40b",
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
  "created_at": "2026-10-28T15:07:29.105633Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T18:07:27Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "6a5229c5-56db-44e9-86ff-932fbea08cc4",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T15:07:30.278154Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b078d442-d5f6-4965-a094-f7223d0a8209/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T15:07:29.106731Z",
      "actor": {
        "type": "CLIENT",
        "id": "df314615-8121-4d7b-9819-598ca0f7a40b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "b078d442-d5f6-4965-a094-f7223d0a8209",
        "preorder": true,
        "quote_id": "679ea8e6-3056-4829-af0b-dd49945137bb",
        "pickup_at": "2026-10-28T18:07:27Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "decdeff1-54b4-4ba8-912d-8ad71b3ae76d"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T15:07:30.279233Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b078d442-d5f6-4965-a094-f7223d0a8209",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "6a5229c5-56db-44e9-86ff-932fbea08cc4"
      },
      "correlation_id": "4360d6f8-f076-4526-9f11-7853fa84932a"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order b078d442-d5f6-4965-a094-f7223d0a8209, reservation 6a5229c5-56db-44e9-86ff-932fbea08cc4.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27908"
}
```

```json
{
  "challenge_id": "cf3c81b5-b25e-4e43-a918-2515fd851bbe",
  "expires_at": "2026-10-28T15:12:31.885259208Z",
  "resend_available_at": "2026-10-28T15:07:32.885259208Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "368019",
  "sent_at": "2026-10-28T15:07:31.887042784Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf3c81b5-b25e-4e43-a918-2515fd851bbe",
  "code": "368019",
  "device_ref": "sandbox-27908"
}
```

```json
{
  "session_id": "60085492-b82a-490f-9c62-00c55d416fe4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDk1MiwiaWF0IjoxNzkzMjAwMDUyLCJqdGkiOiI1MDZhMDhkNy1jYzAzLTQ1ZDEtYTljZC0wY2Q1NDY5ZDUyMmQiLCJzaWQiOiI2MDA4NTQ5Mi1iODJhLTQ5MGYtOWM2Mi0wMGM1NWQ0MTZmZTQifQ.hDsU7LmwGPZLseKl12Ta-6IPDSyaqpCDVu5nAV3kAn8",
  "access_expires_at": "2026-10-28T15:22:32.100116956Z",
  "refresh_token": "iobuyuxMrEw22UCg7ODpfkY4WkeUrz23RF6FrJB0W3g",
  "refresh_expires_at": "2026-11-27T15:07:32.099719135Z",
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
  "command_id": "c4553a6d-b42e-4239-97ed-9573afcdba06",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:07:32Z",
    "sequence": 1793200052491
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e765f1d-2b52-4842-8791-50258608fdff",
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
  "last_heartbeat_at": "2026-10-28T15:07:32.507616Z",
  "last_location_at": "2026-10-28T15:07:32.507616Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673337088",
  "device_ref": "sandbox-20116"
}
```

```json
{
  "challenge_id": "f283ae1a-c1f8-485c-8062-8b2904ccf050",
  "expires_at": "2026-10-28T15:12:32.702450916Z",
  "resend_available_at": "2026-10-28T15:07:33.702450916Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673337088` → **200**

```json
{
  "phone": "+380673337088",
  "audience": "CLIENT",
  "code": "829098",
  "sent_at": "2026-10-28T15:07:32.704141682Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f283ae1a-c1f8-485c-8062-8b2904ccf050",
  "code": "829098",
  "device_ref": "sandbox-20116"
}
```

```json
{
  "session_id": "93f7ce0c-ad7f-4a48-aaf7-b934f47ec718",
  "subject": {
    "type": "CLIENT",
    "id": "a294762c-0bf9-4da0-be98-7165754f902d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjk0NzYyYy0wYmY5LTRkYTAtYmU5OC03MTY1NzU0ZjkwMmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwOTUyLCJpYXQiOjE3OTMyMDAwNTIsImp0aSI6ImE5Y2E2MmM5LWJiOGQtNDcwMC05MmMyLTcyMzNjYzViNjA5ZSIsInNpZCI6IjkzZjdjZTBjLWFkN2YtNGE0OC1hYWY3LWI5MzRmNDdlYzcxOCJ9.rJXabN8TUdEQL4IiWKfHfvBRo2UJy7_C_oZuBcxW9O4",
  "access_expires_at": "2026-10-28T15:22:32.909112624Z",
  "refresh_token": "TxsC1bEExETUZ8rsIowuhBf8xfgEtgpTljZkXRC9JIw",
  "refresh_expires_at": "2026-11-27T15:07:32.908696775Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cca226d2-41f1-4cdc-96a6-18301650b1ad",
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
  "id": "60580fdc-3010-42b8-bfe1-91969133f747",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:12:33.100425Z",
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
  "command_id": "14bf57bb-c797-4a6c-b1e7-0f2525d38988",
  "quote_id": "60580fdc-3010-42b8-bfe1-91969133f747",
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
  "id": "ee04f93c-e40a-4ada-89a7-3e3b79b048d1",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a294762c-0bf9-4da0-be98-7165754f902d",
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
  "created_at": "2026-10-28T15:07:33.292961Z",
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
    "id": "2f2fd6f2-d279-4de1-b852-1e31042276e3",
    "order_id": "ee04f93c-e40a-4ada-89a7-3e3b79b048d1",
    "expires_at": "2026-10-28T15:07:48.29523Z",
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

`POST /api/driver/v1/offers/2f2fd6f2-d279-4de1-b852-1e31042276e3/accept` → **200**

```json
{
  "command_id": "0ccb415e-2b25-4044-91f7-127b1ebff0df"
}
```

```json
{
  "id": "1a1b5a6b-75fb-40bf-b8c8-6175b910eb0d",
  "order_id": "ee04f93c-e40a-4ada-89a7-3e3b79b048d1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e3ec9e2a-e811-4f21-ac86-07d5591d6a9a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e3ec9e2a-e811-4f21-ac86-07d5591d6a9a",
  "order_id": "ee04f93c-e40a-4ada-89a7-3e3b79b048d1",
  "assignment_id": "1a1b5a6b-75fb-40bf-b8c8-6175b910eb0d",
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

`POST /api/driver/v1/work-sessions/1e765f1d-2b52-4842-8791-50258608fdff/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:07:34Z",
    "sequence": 1793200054482
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e765f1d-2b52-4842-8791-50258608fdff",
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
  "last_heartbeat_at": "2026-10-28T15:07:34.064525Z",
  "last_location_at": "2026-10-28T15:07:34.064525Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e3ec9e2a-e811-4f21-ac86-07d5591d6a9a",
  "order_id": "ee04f93c-e40a-4ada-89a7-3e3b79b048d1",
  "assignment_id": "1a1b5a6b-75fb-40bf-b8c8-6175b910eb0d",
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

`POST /api/driver/v1/trips/e3ec9e2a-e811-4f21-ac86-07d5591d6a9a/arrive` → **200**

```json
{
  "command_id": "d241e539-072a-485f-b417-76a4954f7d27",
  "expected_version": 0
}
```

```json
{
  "id": "e3ec9e2a-e811-4f21-ac86-07d5591d6a9a",
  "order_id": "ee04f93c-e40a-4ada-89a7-3e3b79b048d1",
  "assignment_id": "1a1b5a6b-75fb-40bf-b8c8-6175b910eb0d",
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
  "arrived_at": "2026-10-28T15:07:34.429191Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e3ec9e2a-e811-4f21-ac86-07d5591d6a9a/start` → **200**

```json
{
  "command_id": "fd489f19-437f-432d-b142-f305c00d6530",
  "expected_version": 1
}
```

```json
{
  "id": "e3ec9e2a-e811-4f21-ac86-07d5591d6a9a",
  "order_id": "ee04f93c-e40a-4ada-89a7-3e3b79b048d1",
  "assignment_id": "1a1b5a6b-75fb-40bf-b8c8-6175b910eb0d",
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
  "arrived_at": "2026-10-28T15:07:34.429191Z",
  "started_at": "2026-10-28T15:07:34.626068Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1e765f1d-2b52-4842-8791-50258608fdff/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:07:34Z",
    "sequence": 1793200054808
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e765f1d-2b52-4842-8791-50258608fdff",
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
  "last_heartbeat_at": "2026-10-28T15:07:34.824759Z",
  "last_location_at": "2026-10-28T15:07:34.824759Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/e3ec9e2a-e811-4f21-ac86-07d5591d6a9a/complete` → **200**

```json
{
  "command_id": "415af84a-ee4b-44e1-a0ba-c4f8dcccebe8",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:07:34Z",
  "cash_received": true
}
```

```json
{
  "id": "e3ec9e2a-e811-4f21-ac86-07d5591d6a9a",
  "order_id": "ee04f93c-e40a-4ada-89a7-3e3b79b048d1",
  "assignment_id": "1a1b5a6b-75fb-40bf-b8c8-6175b910eb0d",
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
  "arrived_at": "2026-10-28T15:07:34.429191Z",
  "started_at": "2026-10-28T15:07:34.626068Z",
  "completed_at": "2026-10-28T15:07:35.009479Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/ee04f93c-e40a-4ada-89a7-3e3b79b048d1/rating` → **200**

```json
{
  "command_id": "babd45a2-6dda-4d31-9028-16220a5d9822",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "ee04f93c-e40a-4ada-89a7-3e3b79b048d1",
  "score": 5,
  "created_at": "2026-10-28T15:07:35.216237141Z"
}
```

`POST /api/driver/v1/orders/ee04f93c-e40a-4ada-89a7-3e3b79b048d1/rating` → **200**

```json
{
  "command_id": "9f19baa1-c741-4ddf-b421-a6d12f1165ae",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "ee04f93c-e40a-4ada-89a7-3e3b79b048d1",
  "score": 4,
  "created_at": "2026-10-28T15:07:35.399316841Z"
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
  "session_id": "17f7f102-5109-4dd2-adaa-ff353cd81dc2",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NTUsImlhdCI6MTc5MzIwMDA1NSwianRpIjoiMjgwMzk1MDItZDcwZC00MjE5LWIxYTYtZDU3NDQ4NWM0YTIxIiwic2lkIjoiMTdmN2YxMDItNTEwOS00ZGQyLWFkYWEtZmYzNTNjZDgxZGMyIn0.6KkGCKx2L67SgVO1bW0Dt_GQh2qPd9fqecG3fB_KDj0",
  "access_expires_at": "2026-10-28T15:22:35.974059043Z",
  "refresh_token": "lOZi1KpxCNTAKvaVKibfPlKpnc-uXDuQD-asf_wgeLA",
  "refresh_expires_at": "2026-10-29T03:07:35.973683245Z",
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
  "session_id": "ba081754-a73b-40cb-bdd9-68dec76a54b6",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NTYsImlhdCI6MTc5MzIwMDA1NiwianRpIjoiYjQ4OTNiNDAtYzY5OC00MmRmLTg5NjMtMmY5MjIxYmQ2ODFjIiwic2lkIjoiYmEwODE3NTQtYTczYi00MGNiLWJkZDktNjhkZWM3NmE1NGI2In0.OKhL4UNlkT0v0Ayp9tHM2DvBllZ60GWxvusI2-6A0JI",
  "access_expires_at": "2026-10-28T15:22:36.351412036Z",
  "refresh_token": "oNPniuEhUp5Iqk0NwSSjUR6th-kUmPr97r2pPmIJkV8",
  "refresh_expires_at": "2026-10-29T03:07:36.351043989Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ee04f93c-e40a-4ada-89a7-3e3b79b048d1/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "ee04f93c-e40a-4ada-89a7-3e3b79b048d1",
      "author_type": "RIDER",
      "author_id": "a294762c-0bf9-4da0-be98-7165754f902d",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T15:07:35.216237Z"
    },
    {
      "order_id": "ee04f93c-e40a-4ada-89a7-3e3b79b048d1",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "a294762c-0bf9-4da0-be98-7165754f902d",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T15:07:35.399317Z"
    }
  ]
}
```

Done: ratings for order ee04f93c-e40a-4ada-89a7-3e3b79b048d1.

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
  "session_id": "3b10708f-b571-4fcc-9c8e-6f4897b63b6f",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NTYsImlhdCI6MTc5MzIwMDA1NiwianRpIjoiM2QzYjlkY2ItYzdmOC00NWRlLWEyMjItOWQxYjU4ODNlNzYzIiwic2lkIjoiM2IxMDcwOGYtYjU3MS00ZmNjLTljOGUtNmY0ODk3YjYzYjZmIn0.BBtMFNPfOmoaH57SvyopRNpkdpsG_Fidq-hentLE74s",
  "access_expires_at": "2026-10-28T15:22:36.931610184Z",
  "refresh_token": "YU3ejCzBwRcmn4scsGjrc0h2Xg3Go0671s8l2z28CKo",
  "refresh_expires_at": "2026-10-29T03:07:36.931270651Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6f7687ae-b4e9-4123-a309-17b95980736a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "660a7ddb-ea30-4b4e-b8dd-258947894277",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:07:37.118027Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/660a7ddb-ea30-4b4e-b8dd-258947894277` → **200**

```json
{
  "id": "660a7ddb-ea30-4b4e-b8dd-258947894277",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:07:37.118027Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/660a7ddb-ea30-4b4e-b8dd-258947894277` → **200**

```json
{
  "id": "660a7ddb-ea30-4b4e-b8dd-258947894277",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:07:37.118027Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/660a7ddb-ea30-4b4e-b8dd-258947894277` → **200**

```json
{
  "id": "660a7ddb-ea30-4b4e-b8dd-258947894277",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T15:07:37.118027Z",
  "ready_at": "2026-10-28T15:07:39.352384Z",
  "expires_at": "2026-10-29T15:07:39.352384Z"
}
```

`GET /api/admin/v1/reports/exports/660a7ddb-ea30-4b4e-b8dd-258947894277/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
total,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "7bcf927c-35a9-4985-914c-68c1138ea832",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "0d40e97c-7ed9-42f8-9e35-cef27e8fd0b5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:07:39.882587Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0d40e97c-7ed9-42f8-9e35-cef27e8fd0b5` → **200**

```json
{
  "id": "0d40e97c-7ed9-42f8-9e35-cef27e8fd0b5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:07:39.882587Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0d40e97c-7ed9-42f8-9e35-cef27e8fd0b5` → **200**

```json
{
  "id": "0d40e97c-7ed9-42f8-9e35-cef27e8fd0b5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:07:39.882587Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0d40e97c-7ed9-42f8-9e35-cef27e8fd0b5` → **200**

```json
{
  "id": "0d40e97c-7ed9-42f8-9e35-cef27e8fd0b5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:07:39.882587Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0d40e97c-7ed9-42f8-9e35-cef27e8fd0b5` → **200**

```json
{
  "id": "0d40e97c-7ed9-42f8-9e35-cef27e8fd0b5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:07:39.882587Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0d40e97c-7ed9-42f8-9e35-cef27e8fd0b5` → **200**

```json
{
  "id": "0d40e97c-7ed9-42f8-9e35-cef27e8fd0b5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T15:07:39.882587Z",
  "ready_at": "2026-10-28T15:07:44.358717Z",
  "expires_at": "2026-10-29T15:07:44.358717Z"
}
```

`GET /api/admin/v1/reports/exports/0d40e97c-7ed9-42f8-9e35-cef27e8fd0b5/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/67187995-ba13-43d7-b34c-06f314e31618` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/67187995-ba13-43d7-b34c-06f314e31618",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3184b4d7-d0b5-4478-8242-3bc3483c312b"
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
  "device_ref": "sandbox-15809"
}
```

```json
{
  "challenge_id": "0d95d189-b92d-4a4c-acc7-38d79244fcae",
  "expires_at": "2026-10-28T15:12:45.218097173Z",
  "resend_available_at": "2026-10-28T15:07:46.218097173Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "392188",
  "sent_at": "2026-10-28T15:07:45.219870754Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d95d189-b92d-4a4c-acc7-38d79244fcae",
  "code": "392188",
  "device_ref": "sandbox-15809"
}
```

```json
{
  "session_id": "d5b0070a-cc66-4585-87b3-591e53e4af06",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDk2NSwiaWF0IjoxNzkzMjAwMDY1LCJqdGkiOiI3ZDM2NmU0MS1kYWIzLTRjYmYtYTVkNi01ZjFmZmRhOTU3NWQiLCJzaWQiOiJkNWIwMDcwYS1jYzY2LTQ1ODUtODdiMy01OTFlNTNlNGFmMDYifQ.Jjrzguu2QtpycjJ4IR9evj65U_VXMXiVsMFVzDj8Dg8",
  "access_expires_at": "2026-10-28T15:22:45.425002978Z",
  "refresh_token": "jRusMFRLTt4tziH1lGjdVM9VKwCpB2CWP53BfuvWzeQ",
  "refresh_expires_at": "2026-11-27T15:07:45.424495149Z",
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
  "command_id": "e69414bb-06e7-4297-8d19-b0292a3724bf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:07:45Z",
    "sequence": 1793200065971
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "61aa71e6-ba48-424c-a928-1cfa0ca61b13",
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
  "last_heartbeat_at": "2026-10-28T15:07:45.986317Z",
  "last_location_at": "2026-10-28T15:07:45.986317Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "a3eab8a6-0ee1-4872-a63d-6809d53ce6bb",
  "points": [
    {
      "sequence": 1793200068174,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T15:06:48Z"
    },
    {
      "sequence": 1793200068180,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T15:07:48Z"
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
  "session_id": "fd8044fd-e02e-4baf-84ac-f8af165b6bf2",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NjgsImlhdCI6MTc5MzIwMDA2OCwianRpIjoiODhmNzMwYTUtMTI1Ny00NzEzLTk5OWItOGVkZTIyYmM1YWQwIiwic2lkIjoiZmQ4MDQ0ZmQtZTAyZS00YmFmLTg0YWMtZjhhZjE2NWI2YmYyIn0.vTbMKbEfwORe0JJV7G2Ijv13mw50nn4obXLgDoPx5Us",
  "access_expires_at": "2026-10-28T15:22:48.592158761Z",
  "refresh_token": "wOEkDLl92-gDxejQqVVFz3O8Dff1Ly1fYLThPgIUDbM",
  "refresh_expires_at": "2026-10-29T03:07:48.59184718Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "679ab6a5-0a55-46fd-a313-606b2000627c",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T15:07:48Z",
        "track_point_id": "d0e3486f-2b4b-4be4-9e56-40acdcb4c0d7",
        "work_session_id": "61aa71e6-ba48-424c-a928-1cfa0ca61b13"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T15:07:48Z",
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

`POST /api/admin/v1/driver-risk-flags/679ab6a5-0a55-46fd-a313-606b2000627c/confirm` → **200**

```json
{
  "command_id": "3e1d116f-97b1-4bb7-bbbb-be84533c0da2",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "679ab6a5-0a55-46fd-a313-606b2000627c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T15:07:48Z",
    "track_point_id": "d0e3486f-2b4b-4be4-9e56-40acdcb4c0d7",
    "work_session_id": "61aa71e6-ba48-424c-a928-1cfa0ca61b13"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T15:07:48Z",
  "reason": null,
  "reviewed_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "reviewed_at": "2026-10-28T15:07:49.177782Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/679ab6a5-0a55-46fd-a313-606b2000627c/dismiss` → **409**

```json
{
  "command_id": "b123fc5a-32f3-4485-924b-0e0294d011b1",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/679ab6a5-0a55-46fd-a313-606b2000627c/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b6724b71-6cf6-401c-8cc3-00264c303782"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "fef26f06-dc33-4b0e-b0a3-47217ee33f4b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "f5bfc4f4-64df-4e54-8f58-2ab9b90a9688",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "raised_at": "2026-10-28T15:07:49.551218Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/f5bfc4f4-64df-4e54-8f58-2ab9b90a9688/dismiss` → **200**

```json
{
  "command_id": "5689dbfd-a1db-4adf-a07c-347b3f15a43b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "f5bfc4f4-64df-4e54-8f58-2ab9b90a9688",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "raised_at": "2026-10-28T15:07:49.551218Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "reviewed_at": "2026-10-28T15:07:49.749136Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "69953cb0-6cb6-4521-9d5c-ed767c862bea",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "679ab6a5-0a55-46fd-a313-606b2000627c"
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
      "actor_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:07:49.941208Z"
    }
  ]
}
```

Done: flag 679ab6a5-0a55-46fd-a313-606b2000627c confirmed, suspension named it, driver reinstated.

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
  "session_id": "aec18978-c356-43f5-8148-61c556ebbb6d",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NzAsImlhdCI6MTc5MzIwMDA3MCwianRpIjoiYzk0ZGVhMTgtYTJlOS00NGFjLTlmY2YtNzFkNTQ0YTU4ZDE1Iiwic2lkIjoiYWVjMTg5NzgtYzM1Ni00M2Y1LTgxNDgtNjFjNTU2ZWJiYjZkIn0.3OcyI76zlouwpYVFBDbpTvWv-VkajKD8wlxlvL8uhZ4",
  "access_expires_at": "2026-10-28T15:22:50.529848586Z",
  "refresh_token": "yL3uQoSzDvtKgles4gqBxp3k7u417MLu4HV4U1ig--Y",
  "refresh_expires_at": "2026-10-29T03:07:50.529217838Z",
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
      "actor_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:07:49.941208Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "8ff265d6-660b-4395-a39d-b732858d6ab5",
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
  "session_id": "61aa71e6-ba48-424c-a928-1cfa0ca61b13",
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
  "last_heartbeat_at": "2026-10-28T15:07:45.986317Z",
  "last_location_at": "2026-10-28T15:07:45.986317Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/61aa71e6-ba48-424c-a928-1cfa0ca61b13/close` → **200**

```json
{
  "command_id": "5fd5c39f-3820-48bd-ab8b-21f8a5201c83",
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
  "session_id": "f0a62e0b-f008-4d3b-b5a9-881f9e2e511e",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NzEsImlhdCI6MTc5MzIwMDA3MSwianRpIjoiMzU4NGM5NzUtNDdlZC00N2EwLTlhMTAtZGRiOGViNGYwNDU4Iiwic2lkIjoiZjBhNjJlMGItZjAwOC00ZDNiLWI1YTktODgxZjllMmU1MTFlIn0.mYHQRROhmBOcL0zGJyW_MVR7M3_u_w0qu9F-7W1X9AY",
  "access_expires_at": "2026-10-28T15:22:51.754463363Z",
  "refresh_token": "AFFL4UH42gtixrOjIdAXU0tbfV2D1qNrZot3P97Zg3c",
  "refresh_expires_at": "2026-10-29T03:07:51.754095066Z",
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
  "command_id": "9370e210-57b1-4f92-a858-d96db0b71257",
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
  "changed_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T15:07:52.132143Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "9370e210-57b1-4f92-a858-d96db0b71257",
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
  "changed_by": "41b39d15-7936-4b20-b8c7-04f8c064b914",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T15:07:52.132143Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48030740287",
  "device_ref": "sandbox-14988"
}
```

```json
{
  "challenge_id": "10e3f68f-7f38-45e2-9f96-bb298dac1475",
  "expires_at": "2026-10-28T15:12:52.523405726Z",
  "resend_available_at": "2026-10-28T15:07:53.523405726Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48030740287` → **200**

```json
{
  "phone": "+48030740287",
  "audience": "CLIENT",
  "code": "295868",
  "sent_at": "2026-10-28T15:07:52.525143082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10e3f68f-7f38-45e2-9f96-bb298dac1475",
  "code": "295868",
  "device_ref": "sandbox-14988"
}
```

```json
{
  "session_id": "0911f4c3-021e-46c1-b81b-2500637c2361",
  "subject": {
    "type": "CLIENT",
    "id": "68adcd4e-1aa5-4bef-8fc5-6d09eb91b201"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OGFkY2Q0ZS0xYWE1LTRiZWYtOGZjNS02ZDA5ZWI5MWIyMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwOTcyLCJpYXQiOjE3OTMyMDAwNzIsImp0aSI6IjNlMmQwYTkwLTZhOWEtNDhlMC1hYWVhLTcwNzk4YzcyOTFmNSIsInNpZCI6IjA5MTFmNGMzLTAyMWUtNDZjMS1iODFiLTI1MDA2MzdjMjM2MSJ9.Fuk4lD48PuagXgPHWQ3EB4FCcMf0ep-yV5slHNLVtNQ",
  "access_expires_at": "2026-10-28T15:22:52.773243493Z",
  "refresh_token": "FvzcnTxp0TiBWL57Hai74AhOphCLO2giBXIgvWFK55k",
  "refresh_expires_at": "2026-11-27T15:07:52.772860153Z",
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
  "correlation_id": "891ae466-1377-4c07-91b4-df89f3695041"
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
  "device_ref": "sandbox-6221"
}
```

```json
{
  "challenge_id": "cc09c374-a12d-4dee-a04f-29fc143e381c",
  "expires_at": "2026-10-28T15:12:53.332231118Z",
  "resend_available_at": "2026-10-28T15:07:54.332231118Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "114708",
  "sent_at": "2026-10-28T15:07:53.333887983Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc09c374-a12d-4dee-a04f-29fc143e381c",
  "code": "114708",
  "device_ref": "sandbox-6221"
}
```

```json
{
  "session_id": "93cbfc8f-3b0b-494f-9260-0797fffde19d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDk3MywiaWF0IjoxNzkzMjAwMDczLCJqdGkiOiI0ZWY3NmI1Ni00ZDBiLTQwM2ItOWZkYy1mOThlOWY4ZTI3ZjYiLCJzaWQiOiI5M2NiZmM4Zi0zYjBiLTQ5NGYtOTI2MC0wNzk3ZmZmZGUxOWQifQ.PGJPQ7NMywHZpl9zvi3_Ny2vjFAJOm94xUi1ePgBTLM",
  "access_expires_at": "2026-10-28T15:22:53.544028642Z",
  "refresh_token": "3IBIbjm91gllcu707FhRJYasR9fEyHTlm-AeoNKh2Bs",
  "refresh_expires_at": "2026-11-27T15:07:53.543635217Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "38a70a6b-9352-430b-8874-4cbf9d190dcd",
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
  "last_heartbeat_at": "2026-10-28T15:07:29.898057Z",
  "last_location_at": "2026-10-28T15:07:29.898057Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/38a70a6b-9352-430b-8874-4cbf9d190dcd/handover` → **200**

```json
{
  "command_id": "5595cac9-a8c1-4db8-b940-d7f86af9adbb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "38a70a6b-9352-430b-8874-4cbf9d190dcd",
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
  "last_heartbeat_at": "2026-10-28T15:07:29.898057Z",
  "last_location_at": "2026-10-28T15:07:29.898057Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/38a70a6b-9352-430b-8874-4cbf9d190dcd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:07:54Z",
    "sequence": 1793200074101
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "38a70a6b-9352-430b-8874-4cbf9d190dcd",
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
  "last_heartbeat_at": "2026-10-28T15:07:54.116921Z",
  "last_location_at": "2026-10-28T15:07:54.116921Z",
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
  "session_id": "38a70a6b-9352-430b-8874-4cbf9d190dcd",
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
  "last_heartbeat_at": "2026-10-28T15:07:54.116921Z",
  "last_location_at": "2026-10-28T15:07:54.116921Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/38a70a6b-9352-430b-8874-4cbf9d190dcd/close` → **200**

```json
{
  "command_id": "f647003f-21c5-46ce-9928-a5f24b8afcd5",
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
  "correlation_id": "c65ad82c-c8d6-43c8-a636-bc02f8933537"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673442996",
  "device_ref": "sandbox-26195"
}
```

```json
{
  "challenge_id": "179a6c8b-5715-490c-b770-82052782529a",
  "expires_at": "2026-10-28T15:12:55.146991598Z",
  "resend_available_at": "2026-10-28T15:07:56.146991598Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673442996` → **200**

```json
{
  "phone": "+380673442996",
  "audience": "CLIENT",
  "code": "077247",
  "sent_at": "2026-10-28T15:07:55.148567877Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "179a6c8b-5715-490c-b770-82052782529a",
  "code": "077247",
  "device_ref": "sandbox-26195"
}
```

```json
{
  "session_id": "9a2c7ced-f242-4170-a257-97fe9a758453",
  "subject": {
    "type": "CLIENT",
    "id": "d6066f4a-91b4-45dd-96e3-7f604fbcfcd2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjA2NmY0YS05MWI0LTQ1ZGQtOTZlMy03ZjYwNGZiY2ZjZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwOTc1LCJpYXQiOjE3OTMyMDAwNzUsImp0aSI6Ijg2YWViZDk3LWE2ZDgtNDI3Yi04ZGYwLWU1NjI4NzBmYWVjMCIsInNpZCI6IjlhMmM3Y2VkLWYyNDItNDE3MC1hMjU3LTk3ZmU5YTc1ODQ1MyJ9.A8bY8bzT7-5CoZ27z9B_pLzaqjt4Idx5KidLY-p_tG8",
  "access_expires_at": "2026-10-28T15:22:55.353148301Z",
  "refresh_token": "DgH1jq7kJ4JlQG1YGZigsnV_Rzlr1mbMlfyzkEpGwrs",
  "refresh_expires_at": "2026-11-27T15:07:55.352778592Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "8194bc64-2ea4-45d2-bf1f-099d5b0765ed",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f6b0b331-1c8e-4ff1-8f5f-d05490bc448c",
  "upload_path": "/api/rider/v1/uploads/f6b0b331-1c8e-4ff1-8f5f-d05490bc448c",
  "expires_at": "2026-10-28T15:22:55.534927938Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/f6b0b331-1c8e-4ff1-8f5f-d05490bc448c` → **200**

```json
{
  "file_id": "f6b0b331-1c8e-4ff1-8f5f-d05490bc448c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "50d790d4-d0be-4419-a5aa-07d23c4f1980",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "f6b0b331-1c8e-4ff1-8f5f-d05490bc448c"
  ]
}
```

```json
{
  "id": "cc6c2706-f0b3-4e09-80dd-aa09563f1a7a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d6066f4a-91b4-45dd-96e3-7f604fbcfcd2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T15:07:55.760281Z",
  "updated_at": "2026-10-28T15:07:55.760281Z",
  "respond_by": "2026-10-28T19:07:55.760281Z",
  "messages": [
    {
      "id": "5239810d-3fed-47c0-9f6e-6ffc346c7f88",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d6066f4a-91b4-45dd-96e3-7f604fbcfcd2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:07:55.762054Z",
      "attachments": [
        {
          "file_id": "f6b0b331-1c8e-4ff1-8f5f-d05490bc448c",
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
  "session_id": "ccdaba3b-c306-4ac8-8e41-ae667a7c5917",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NzYsImlhdCI6MTc5MzIwMDA3NiwianRpIjoiNzU4MWY3YTAtZTYzZC00Y2NiLWJjNTEtMjgzMzczZjkxOThlIiwic2lkIjoiY2NkYWJhM2ItYzMwNi00YWM4LThlNDEtYWU2NjdhN2M1OTE3In0.NqvQl9r6pN9bClWuFuUo-tebSpqf0av3woFj4zfOWYo",
  "access_expires_at": "2026-10-28T15:22:56.174033107Z",
  "refresh_token": "5CrNj1zkuDiIw9S66j0fMOVQbzPczWC-MD-0hn47R98",
  "refresh_expires_at": "2026-10-29T03:07:56.173493341Z",
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
  "session_id": "22d1734f-b169-4fab-8ef8-10bf2dd23eb5",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NzYsImlhdCI6MTc5MzIwMDA3NiwianRpIjoiNThmYTc2YmYtMzEyNS00YjM5LWIyZGMtNWFkOTJmMzZhYjJjIiwic2lkIjoiMjJkMTczNGYtYjE2OS00ZmFiLThlZjgtMTBiZjJkZDIzZWI1In0.T8IK_PNTzTKtie1SP4OPe5IA3dlkVz0KLaNKaA_yKFU",
  "access_expires_at": "2026-10-28T15:22:56.549545657Z",
  "refresh_token": "cz4CgjFR69OY4hekNCF0kNgHSVhkjNQ2A0kx91SffcM",
  "refresh_expires_at": "2026-10-29T03:07:56.549222629Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/cc6c2706-f0b3-4e09-80dd-aa09563f1a7a/attachments/f6b0b331-1c8e-4ff1-8f5f-d05490bc448c` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "c0e4c37c-578c-4788-8929-b787acc16024",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "6936e479-c4a7-4c1c-bd63-c4bd7f32c3a1",
  "upload_path": "/api/operator/v1/uploads/6936e479-c4a7-4c1c-bd63-c4bd7f32c3a1",
  "expires_at": "2026-10-28T15:22:56.743568282Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/6936e479-c4a7-4c1c-bd63-c4bd7f32c3a1` → **200**

```json
{
  "file_id": "6936e479-c4a7-4c1c-bd63-c4bd7f32c3a1",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/cc6c2706-f0b3-4e09-80dd-aa09563f1a7a` → **200**

```json
{
  "id": "cc6c2706-f0b3-4e09-80dd-aa09563f1a7a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d6066f4a-91b4-45dd-96e3-7f604fbcfcd2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T15:07:55.760281Z",
  "updated_at": "2026-10-28T15:07:55.760281Z",
  "respond_by": "2026-10-28T19:07:55.760281Z",
  "messages": [
    {
      "id": "5239810d-3fed-47c0-9f6e-6ffc346c7f88",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d6066f4a-91b4-45dd-96e3-7f604fbcfcd2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:07:55.762054Z",
      "attachments": [
        {
          "file_id": "f6b0b331-1c8e-4ff1-8f5f-d05490bc448c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/cc6c2706-f0b3-4e09-80dd-aa09563f1a7a/comments` → **200**

```json
{
  "command_id": "adc6f54a-38b8-4701-8b6b-bbc22f318ca8",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "6936e479-c4a7-4c1c-bd63-c4bd7f32c3a1"
  ]
}
```

```json
{
  "id": "cc6c2706-f0b3-4e09-80dd-aa09563f1a7a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d6066f4a-91b4-45dd-96e3-7f604fbcfcd2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T15:07:55.760281Z",
  "updated_at": "2026-10-28T15:07:57.146565Z",
  "respond_by": "2026-10-28T19:07:55.760281Z",
  "messages": [
    {
      "id": "5239810d-3fed-47c0-9f6e-6ffc346c7f88",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d6066f4a-91b4-45dd-96e3-7f604fbcfcd2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:07:55.762054Z",
      "attachments": [
        {
          "file_id": "f6b0b331-1c8e-4ff1-8f5f-d05490bc448c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "5138b176-759c-48c4-93dc-67a17375f8bf",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T15:07:57.146111Z",
      "attachments": [
        {
          "file_id": "6936e479-c4a7-4c1c-bd63-c4bd7f32c3a1",
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

`GET /api/rider/v1/support/cases/cc6c2706-f0b3-4e09-80dd-aa09563f1a7a` → **200**

```json
{
  "id": "cc6c2706-f0b3-4e09-80dd-aa09563f1a7a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d6066f4a-91b4-45dd-96e3-7f604fbcfcd2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T15:07:55.760281Z",
  "updated_at": "2026-10-28T15:07:57.146565Z",
  "respond_by": "2026-10-28T19:07:55.760281Z",
  "messages": [
    {
      "id": "5239810d-3fed-47c0-9f6e-6ffc346c7f88",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d6066f4a-91b4-45dd-96e3-7f604fbcfcd2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:07:55.762054Z",
      "attachments": [
        {
          "file_id": "f6b0b331-1c8e-4ff1-8f5f-d05490bc448c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "5138b176-759c-48c4-93dc-67a17375f8bf",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T15:07:57.146111Z",
      "attachments": [
        {
          "file_id": "6936e479-c4a7-4c1c-bd63-c4bd7f32c3a1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/cc6c2706-f0b3-4e09-80dd-aa09563f1a7a/attachments/6936e479-c4a7-4c1c-bd63-c4bd7f32c3a1` → **200**

Done: support case cc6c2706-f0b3-4e09-80dd-aa09563f1a7a, rider attachment f6b0b331-1c8e-4ff1-8f5f-d05490bc448c, operator attachment 6936e479-c4a7-4c1c-bd63-c4bd7f32c3a1.

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
  "session_id": "3caac5ff-e08b-430e-bf14-da4b706230f3",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5NzcsImlhdCI6MTc5MzIwMDA3NywianRpIjoiMjdiNDhiMDItYWM2MS00M2VjLTkyNzItOGYwMWI4NDk4ZTAzIiwic2lkIjoiM2NhYWM1ZmYtZTA4Yi00MzBlLWJmMTQtZGE0YjcwNjIzMGYzIn0.H9ukfxXXVzOGbGnvSf6uAy4-x17H793zikaWRJ4M1g0",
  "access_expires_at": "2026-10-28T15:22:57.76303724Z",
  "refresh_token": "hin5iZz8yUa_e--JsibuH9CtD9XAmbY7XXqeaYLF54I",
  "refresh_expires_at": "2026-10-29T03:07:57.762625618Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3016"
}
```

```json
{
  "challenge_id": "0697cc38-b95f-46cc-ae40-abe2d3fa9185",
  "expires_at": "2026-10-28T15:12:57.94462679Z",
  "resend_available_at": "2026-10-28T15:07:58.94462679Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "176988",
  "sent_at": "2026-10-28T15:07:57.949402609Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0697cc38-b95f-46cc-ae40-abe2d3fa9185",
  "code": "176988",
  "device_ref": "sandbox-3016"
}
```

```json
{
  "session_id": "f83b3fae-f7bd-4acc-853e-b951809ab002",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDk3OCwiaWF0IjoxNzkzMjAwMDc4LCJqdGkiOiJhMTkzYjI2NS0zYWVhLTQ2MTYtODMwMS02OTQ0OWUzYTgzZDciLCJzaWQiOiJmODNiM2ZhZS1mN2JkLTRhY2MtODUzZS1iOTUxODA5YWIwMDIifQ.1L1_6yNjyDkZkrtgrL8FhUewTPS1Tjf-qb4yb4UFY5k",
  "access_expires_at": "2026-10-28T15:22:58.156279293Z",
  "refresh_token": "yOfjGScvoEnIW3yTedUkLB0WWfYhz2UqNKsCac12Q8w",
  "refresh_expires_at": "2026-11-27T15:07:58.155908572Z",
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
      "actor_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:07:49.941208Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "41b39d15-7936-4b20-b8c7-04f8c064b914",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T15:07:50.945795Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "d5af2367-7f59-431a-8b8d-e182a26f0b47",
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
  "device_ref": "sandbox-24372"
}
```

```json
{
  "challenge_id": "cbaa3d97-f1ca-4fa0-8373-fdae1d1e724e",
  "expires_at": "2026-10-28T15:12:58.920735636Z",
  "resend_available_at": "2026-10-28T15:07:59.920735636Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "335177",
  "sent_at": "2026-10-28T15:07:58.92249138Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbaa3d97-f1ca-4fa0-8373-fdae1d1e724e",
  "code": "335177",
  "device_ref": "sandbox-24372"
}
```

```json
{
  "session_id": "f512215d-6c80-43ff-a710-7d18d720695c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDk3OSwiaWF0IjoxNzkzMjAwMDc5LCJqdGkiOiI2ODM5ZjUwMS02Yzg5LTRjYjAtOGFiMC1jMzY3Njg4ZGE0ODEiLCJzaWQiOiJmNTEyMjE1ZC02YzgwLTQzZmYtYTcxMC03ZDE4ZDcyMDY5NWMifQ.5nu6g33xivMWRbkCYDIU_QRm9hkJ8qGOJFcqFesHe7U",
  "access_expires_at": "2026-10-28T15:22:59.134700444Z",
  "refresh_token": "bFjQw2h42lV5tQLdZd-Vr3JoX6clwy2zJERG0fEML1A",
  "refresh_expires_at": "2026-11-27T15:07:59.134235391Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e765f1d-2b52-4842-8791-50258608fdff",
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
  "last_heartbeat_at": "2026-10-28T15:07:34.824759Z",
  "last_location_at": "2026-10-28T15:07:34.824759Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1e765f1d-2b52-4842-8791-50258608fdff/handover` → **200**

```json
{
  "command_id": "b075b21a-a662-44e0-8478-6f989c81b1d2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e765f1d-2b52-4842-8791-50258608fdff",
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
  "last_heartbeat_at": "2026-10-28T15:07:34.824759Z",
  "last_location_at": "2026-10-28T15:07:34.824759Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1e765f1d-2b52-4842-8791-50258608fdff/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:07:59Z",
    "sequence": 1793200079683
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e765f1d-2b52-4842-8791-50258608fdff",
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
  "last_heartbeat_at": "2026-10-28T15:07:59.698456Z",
  "last_location_at": "2026-10-28T15:07:59.698456Z",
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
  "command_id": "d1195338-e3de-470a-822c-500c027d05a4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:08:00Z",
    "sequence": 1793200080684
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e158ebbf-262e-4be9-8c83-880a4fb8c681",
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
  "last_heartbeat_at": "2026-10-28T15:08:00.083876Z",
  "last_location_at": "2026-10-28T15:08:00.083876Z",
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
  "session_id": "21189fec-12e3-44a2-8f0e-0eb52c5da30d",
  "subject": {
    "type": "STAFF",
    "id": "41b39d15-7936-4b20-b8c7-04f8c064b914"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWIzOWQxNS03OTM2LTRiMjAtYjhjNy0wNGY4YzA2NGI5MTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA5ODAsImlhdCI6MTc5MzIwMDA4MCwianRpIjoiOWM2ZTM1MDQtZDdmYi00ZjE2LTg5ZmUtOWJmMDA4MWE1OTA0Iiwic2lkIjoiMjExODlmZWMtMTJlMy00NGEyLThmMGUtMGViNTJjNWRhMzBkIn0.FWKAhXFpmICrqBAiNEsabIj-ILtXIYj7EbJaNx_LZd0",
  "access_expires_at": "2026-10-28T15:23:00.475625289Z",
  "refresh_token": "gph0oaQCZqJYKuh92-SaCwwjCoKa6HOl8cu04a7AHlU",
  "refresh_expires_at": "2026-10-29T03:08:00.475258474Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6a915b0c-337f-43bd-af7b-e15665224aeb",
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
  "id": "8eb21eaa-c224-4fc7-b608-ee931e31010a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:13:00.667362Z",
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
  "command_id": "1511ef99-fcb0-4f7d-a192-90ec279e5b21",
  "quote_id": "8eb21eaa-c224-4fc7-b608-ee931e31010a",
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
  "id": "36c48ee2-c487-4eaa-a831-32287f967f73",
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
  "created_at": "2026-10-28T15:08:00.911269Z",
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
    "id": "22fcacfb-2245-48c3-aa25-a8033f960f6a",
    "order_id": "36c48ee2-c487-4eaa-a831-32287f967f73",
    "expires_at": "2026-10-28T15:08:15.913641Z",
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

`POST /api/driver/v1/offers/22fcacfb-2245-48c3-aa25-a8033f960f6a/accept` → **200**

```json
{
  "command_id": "631d775b-2c46-42b0-8820-9b14736e4e9b"
}
```

```json
{
  "id": "bc98171d-ab30-41a0-a24d-7a1035031c25",
  "order_id": "36c48ee2-c487-4eaa-a831-32287f967f73",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "49116ba2-c2f9-4a84-8a9c-63db3770d5f9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "49116ba2-c2f9-4a84-8a9c-63db3770d5f9",
  "order_id": "36c48ee2-c487-4eaa-a831-32287f967f73",
  "assignment_id": "bc98171d-ab30-41a0-a24d-7a1035031c25",
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

`POST /api/driver/v1/work-sessions/e158ebbf-262e-4be9-8c83-880a4fb8c681/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:08:01Z",
    "sequence": 1793200081853
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e158ebbf-262e-4be9-8c83-880a4fb8c681",
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
  "last_heartbeat_at": "2026-10-28T15:08:01.870274Z",
  "last_location_at": "2026-10-28T15:08:01.870274Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/49116ba2-c2f9-4a84-8a9c-63db3770d5f9/arrive` → **200**

```json
{
  "command_id": "4ffd7690-a30d-4848-873d-53a7db8ddac5",
  "expected_version": 0
}
```

```json
{
  "id": "49116ba2-c2f9-4a84-8a9c-63db3770d5f9",
  "order_id": "36c48ee2-c487-4eaa-a831-32287f967f73",
  "assignment_id": "bc98171d-ab30-41a0-a24d-7a1035031c25",
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
  "arrived_at": "2026-10-28T15:08:02.05796Z",
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

`POST /api/driver/v1/trips/49116ba2-c2f9-4a84-8a9c-63db3770d5f9/start` → **200**

```json
{
  "command_id": "e47b95d8-e410-4859-9562-209312ba983a",
  "expected_version": 1
}
```

```json
{
  "id": "49116ba2-c2f9-4a84-8a9c-63db3770d5f9",
  "order_id": "36c48ee2-c487-4eaa-a831-32287f967f73",
  "assignment_id": "bc98171d-ab30-41a0-a24d-7a1035031c25",
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
  "arrived_at": "2026-10-28T15:08:02.05796Z",
  "started_at": "2026-10-28T15:08:02.251378Z",
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

`POST /api/driver/v1/trips/49116ba2-c2f9-4a84-8a9c-63db3770d5f9/complete` → **200**

```json
{
  "command_id": "63e4ebb7-9104-43b3-9c68-f639f924ba99",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:08:02Z",
  "cash_received": true
}
```

```json
{
  "id": "49116ba2-c2f9-4a84-8a9c-63db3770d5f9",
  "order_id": "36c48ee2-c487-4eaa-a831-32287f967f73",
  "assignment_id": "bc98171d-ab30-41a0-a24d-7a1035031c25",
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
  "arrived_at": "2026-10-28T15:08:02.05796Z",
  "started_at": "2026-10-28T15:08:02.251378Z",
  "completed_at": "2026-10-28T15:08:02.440548Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/36c48ee2-c487-4eaa-a831-32287f967f73` → **200**

```json
{
  "id": "36c48ee2-c487-4eaa-a831-32287f967f73",
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
    "id": "bc98171d-ab30-41a0-a24d-7a1035031c25",
    "order_id": "36c48ee2-c487-4eaa-a831-32287f967f73",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "49116ba2-c2f9-4a84-8a9c-63db3770d5f9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:08:00.911269Z",
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
  "session_id": "1e765f1d-2b52-4842-8791-50258608fdff",
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
  "last_heartbeat_at": "2026-10-28T15:07:59.698456Z",
  "last_location_at": "2026-10-28T15:07:59.698456Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1e765f1d-2b52-4842-8791-50258608fdff/close` → **200**

```json
{
  "command_id": "24fcf749-ed25-4aff-be01-b15571a51fb6",
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
  "session_id": "e158ebbf-262e-4be9-8c83-880a4fb8c681",
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
  "last_heartbeat_at": "2026-10-28T15:08:01.870274Z",
  "last_location_at": "2026-10-28T15:08:01.870274Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e158ebbf-262e-4be9-8c83-880a4fb8c681/close` → **200**

```json
{
  "command_id": "825265fb-042c-4c11-aaed-3d75d05141a4",
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

Done: terminal order 36c48ee2-c487-4eaa-a831-32287f967f73 by Andrii (5a000000-0000-4000-8000-000000000403).
