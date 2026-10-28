# Sandbox transcript (2026-10-28T13:07:20Z, 43a51f0)

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
  "correlation_id": "e0d18d4b-5c7a-41f3-9c76-4fff687a5cde"
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
  "session_id": "7a212015-23c4-44ba-ae45-b1748d73d6de",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM3NDcsImlhdCI6MTc5MzE5Mjg0NywianRpIjoiNWQ2YWMyOGYtYzEyMi00MTQzLWI5ZTEtYjMzMWVmODAzMDc3Iiwic2lkIjoiN2EyMTIwMTUtMjNjNC00NGJhLWFlNDUtYjE3NDhkNzNkNmRlIn0.xEx5QPIpMdfXaQfVMqFtq1FJdIo76-ZpEj-Hw8FRyH8",
  "access_expires_at": "2026-10-28T13:22:27.449525171Z",
  "refresh_token": "IlPTSWdERqa4XxA5vm7vrBjS-QMzZ-o_BpP0rxV3ans",
  "refresh_expires_at": "2026-10-29T01:07:27.447775754Z",
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
  "session_id": "a44bfe95-d852-435a-b348-58ddfae99a39",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM3NDgsImlhdCI6MTc5MzE5Mjg0OCwianRpIjoiNjZmYTk0MDgtMWI0Zi00NDBiLTg0YTktNmYxMjcyM2I0OGE4Iiwic2lkIjoiYTQ0YmZlOTUtZDg1Mi00MzVhLWIzNDgtNThkZGZhZTk5YTM5In0.ZBOF0WqGUZQ72rytwME2amYWLFDD2mFQxmNmvC5xLLU",
  "access_expires_at": "2026-10-28T13:22:28.538412006Z",
  "refresh_token": "cysFAZqK7wyaBzpnW7Nb6qhEr1z48VKLMsOwZqevCe4",
  "refresh_expires_at": "2026-10-29T01:07:28.537686429Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "44b16cd0-dcda-4e55-924a-a6640bcff4fa",
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
  "id": "6401676c-552c-4d70-9621-852bce907295",
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
  "created_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "created_at": "2026-10-28T13:07:28.752927Z",
  "updated_at": "2026-10-28T13:07:28.752927Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633114959",
  "device_ref": "sandbox-24329"
}
```

```json
{
  "challenge_id": "26651e2b-6d44-40dd-ae77-095d56416487",
  "expires_at": "2026-10-28T13:12:28.960531358Z",
  "resend_available_at": "2026-10-28T13:07:29.960531358Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633114959` → **200**

```json
{
  "phone": "+380633114959",
  "audience": "CLIENT",
  "code": "272135",
  "sent_at": "2026-10-28T13:07:28.967064511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26651e2b-6d44-40dd-ae77-095d56416487",
  "code": "272135",
  "device_ref": "sandbox-24329"
}
```

```json
{
  "session_id": "e5c8f7e9-787f-48c2-9a49-1ddf893871dd",
  "subject": {
    "type": "CLIENT",
    "id": "4a635096-13f4-4692-8e0c-ec6291b6e391"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTYzNTA5Ni0xM2Y0LTQ2OTItOGUwYy1lYzYyOTFiNmUzOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNzQ5LCJpYXQiOjE3OTMxOTI4NDksImp0aSI6IjM1NzBhYmUyLWNmOTEtNDg4Yy05NmRhLTNhYzJiY2E1ODEwZSIsInNpZCI6ImU1YzhmN2U5LTc4N2YtNDhjMi05YTQ5LTFkZGY4OTM4NzFkZCJ9.O73E0zIainrKl8KsKq4TVroJ1hNYL2tXP3oE0IQiF4I",
  "access_expires_at": "2026-10-28T13:22:29.195641306Z",
  "refresh_token": "_jkMIVAP-ayoQzvNA4pm3fkfqpxUpqG3-_lvsSC39Ic",
  "refresh_expires_at": "2026-11-27T13:07:29.194838662Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633114959` → **200**

```json
{
  "client_id": "4a635096-13f4-4692-8e0c-ec6291b6e391"
}
```

`POST /api/admin/v1/rider-wallets/4a635096-13f4-4692-8e0c-ec6291b6e391/top-ups` → **201**

```json
{
  "command_id": "f988404c-19de-455c-ad4e-31bdd1c37a35",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "4a635096-13f4-4692-8e0c-ec6291b6e391",
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
      "id": "9b5c0703-cf71-4441-9f94-340757024f2d",
      "at": "2026-10-28T13:07:29.585144Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5476120e-1b5e-4ecf-945e-14b2ed0c6f6c",
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
  "id": "a5810a57-4173-4bc9-8983-c252f563aa2a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:12:30.015414Z",
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
      "id": "6401676c-552c-4d70-9621-852bce907295",
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
  "device_ref": "sandbox-8022"
}
```

```json
{
  "challenge_id": "e3feb6da-6e46-40ee-871a-4b7029b48d86",
  "expires_at": "2026-10-28T13:12:30.229528328Z",
  "resend_available_at": "2026-10-28T13:07:31.229528328Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "665349",
  "sent_at": "2026-10-28T13:07:30.232844099Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3feb6da-6e46-40ee-871a-4b7029b48d86",
  "code": "665349",
  "device_ref": "sandbox-8022"
}
```

```json
{
  "session_id": "2e13dc88-ab55-42e4-baf8-1a6cae9a9a04",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Mzc1MCwiaWF0IjoxNzkzMTkyODUwLCJqdGkiOiI4ZjUwOWI5MS1mMzA5LTQ3ZjUtODIxOS03MGNhYTFiNWQ4MWQiLCJzaWQiOiIyZTEzZGM4OC1hYjU1LTQyZTQtYmFmOC0xYTZjYWU5YTlhMDQifQ.nRJ6Zm3pN0AZabHmPfTuy09NMHrCDwZusHa8s5RibcQ",
  "access_expires_at": "2026-10-28T13:22:30.436410469Z",
  "refresh_token": "hfJygf4ID03ipETDQnH_dqzKai5gKB9102vHddZ127o",
  "refresh_expires_at": "2026-11-27T13:07:30.435598431Z",
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
  "command_id": "c874762b-d654-4446-9258-b349f86332ce",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:07:30Z",
    "sequence": 1793192850811
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a69ce3b9-3494-451a-a9a7-72f23ac8a86f",
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
  "last_heartbeat_at": "2026-10-28T13:07:30.849731Z",
  "last_location_at": "2026-10-28T13:07:30.849731Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ad5d5362-0956-4ced-a681-de45d0f11d43",
  "quote_id": "a5810a57-4173-4bc9-8983-c252f563aa2a",
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
  "id": "05da7461-c118-4f2e-b547-ca706b27b187",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4a635096-13f4-4692-8e0c-ec6291b6e391",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:07:31.084219Z",
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
  "client_id": "4a635096-13f4-4692-8e0c-ec6291b6e391",
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
      "id": "9b5c0703-cf71-4441-9f94-340757024f2d",
      "at": "2026-10-28T13:07:29.585144Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
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
    "id": "574c82b7-b847-474d-88aa-825bfe07b6d8",
    "order_id": "05da7461-c118-4f2e-b547-ca706b27b187",
    "expires_at": "2026-10-28T13:07:46.095245Z",
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

`POST /api/driver/v1/offers/574c82b7-b847-474d-88aa-825bfe07b6d8/accept` → **200**

```json
{
  "command_id": "568232d1-144f-4797-ad1c-5699027b7352"
}
```

```json
{
  "id": "026f99e4-58b1-40a9-9a1e-cc29025f44b8",
  "order_id": "05da7461-c118-4f2e-b547-ca706b27b187",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6172ebd1-f536-4a04-9cdd-eae41ac19a82",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6172ebd1-f536-4a04-9cdd-eae41ac19a82",
  "order_id": "05da7461-c118-4f2e-b547-ca706b27b187",
  "assignment_id": "026f99e4-58b1-40a9-9a1e-cc29025f44b8",
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

`POST /api/driver/v1/work-sessions/a69ce3b9-3494-451a-a9a7-72f23ac8a86f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:07:32Z",
    "sequence": 1793192852783
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a69ce3b9-3494-451a-a9a7-72f23ac8a86f",
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
  "last_heartbeat_at": "2026-10-28T13:07:32.099997Z",
  "last_location_at": "2026-10-28T13:07:32.099997Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6172ebd1-f536-4a04-9cdd-eae41ac19a82/arrive` → **200**

```json
{
  "command_id": "37397cbb-2880-418f-8acd-cd78ea3424f1",
  "expected_version": 0
}
```

```json
{
  "id": "6172ebd1-f536-4a04-9cdd-eae41ac19a82",
  "order_id": "05da7461-c118-4f2e-b547-ca706b27b187",
  "assignment_id": "026f99e4-58b1-40a9-9a1e-cc29025f44b8",
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
  "arrived_at": "2026-10-28T13:07:32.311127Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6172ebd1-f536-4a04-9cdd-eae41ac19a82/start` → **200**

```json
{
  "command_id": "0b6b8fd9-ad59-48fe-b803-942ce73e77ac",
  "expected_version": 1
}
```

```json
{
  "id": "6172ebd1-f536-4a04-9cdd-eae41ac19a82",
  "order_id": "05da7461-c118-4f2e-b547-ca706b27b187",
  "assignment_id": "026f99e4-58b1-40a9-9a1e-cc29025f44b8",
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
  "arrived_at": "2026-10-28T13:07:32.311127Z",
  "started_at": "2026-10-28T13:07:32.51151Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/6172ebd1-f536-4a04-9cdd-eae41ac19a82/complete` → **200**

```json
{
  "command_id": "2f2d5a94-cee6-4cda-b082-c20d150ee8db",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:07:32Z",
  "cash_received": true
}
```

```json
{
  "id": "6172ebd1-f536-4a04-9cdd-eae41ac19a82",
  "order_id": "05da7461-c118-4f2e-b547-ca706b27b187",
  "assignment_id": "026f99e4-58b1-40a9-9a1e-cc29025f44b8",
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
  "arrived_at": "2026-10-28T13:07:32.311127Z",
  "started_at": "2026-10-28T13:07:32.51151Z",
  "completed_at": "2026-10-28T13:07:32.732896Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "4a635096-13f4-4692-8e0c-ec6291b6e391",
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
      "id": "40a8da75-ca97-4c52-925e-0a60af6b8737",
      "at": "2026-10-28T13:07:33.341265Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "05da7461-c118-4f2e-b547-ca706b27b187"
    },
    {
      "id": "9b5c0703-cf71-4441-9f94-340757024f2d",
      "at": "2026-10-28T13:07:29.585144Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/6401676c-552c-4d70-9621-852bce907295/archive` → **200**

```json
{
  "command_id": "c7508120-818d-41de-95ca-59c1a030cd1c",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "6401676c-552c-4d70-9621-852bce907295",
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
  "created_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "created_at": "2026-10-28T13:07:28.752927Z",
  "updated_at": "2026-10-28T13:07:36.130704Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a69ce3b9-3494-451a-a9a7-72f23ac8a86f",
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
  "last_heartbeat_at": "2026-10-28T13:07:32.099997Z",
  "last_location_at": "2026-10-28T13:07:32.099997Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a69ce3b9-3494-451a-a9a7-72f23ac8a86f/close` → **200**

```json
{
  "command_id": "72c773fb-2960-4833-9bb8-9787338a814c",
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

Done: order 05da7461-c118-4f2e-b547-ca706b27b187.

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
  "session_id": "bbeeac91-8a54-4585-8696-759e39f51ebe",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM3NTYsImlhdCI6MTc5MzE5Mjg1NiwianRpIjoiNTVkZGVhYjUtODcwZi00MDkxLWJmNDMtN2E1MmY1NDkwY2M1Iiwic2lkIjoiYmJlZWFjOTEtOGE1NC00NTg1LTg2OTYtNzU5ZTM5ZjUxZWJlIn0.3UQIFOCfHIUFlm9fq64H5QIMiSSoEgd0RcIZz39KYa0",
  "access_expires_at": "2026-10-28T13:22:36.918277807Z",
  "refresh_token": "MWwgsQRjY1LW98wRRbiO8zg6yt6vhgCDBzkpnsCEqlo",
  "refresh_expires_at": "2026-10-29T01:07:36.917620963Z",
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
  "command_id": "86f6c494-31be-457d-a305-dafd05c266f2",
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
  "session_id": "c66699ca-8dbf-47dc-9040-6b79bf219823",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM3NTcsImlhdCI6MTc5MzE5Mjg1NywianRpIjoiNGY0YjhhZWQtYjliYi00M2I2LTg4MGQtN2NmOTIyMTIyZDM2Iiwic2lkIjoiYzY2Njk5Y2EtOGRiZi00N2RjLTkwNDAtNmI3OWJmMjE5ODIzIn0.n79EutRxdfjf3phEaxjUs3zWOENLW1CqoqK4QrIeznI",
  "access_expires_at": "2026-10-28T13:22:37.709730999Z",
  "refresh_token": "Fwl-4k0sOdg6xtpFUb4QQoJVIMIayC4IbcACLeV6dFw",
  "refresh_expires_at": "2026-10-29T01:07:37.709137615Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.803920589",
    "linkedid": "1730052700.803920589",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673889603"
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
    "id": "1730052700.803920589",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "4b9f907a-43b7-4b10-8c37-72cbad77592d",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673889603",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:07:37.895415Z",
      "answered_at": null,
      "ended_at": "2026-10-28T13:07:37.918161Z",
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
    "id": "1730052600.16885652",
    "linkedid": "1730052600.16885652",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673889603"
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
      "id": "509849d0-112a-4b1b-9461-84e31dd471d9",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673889603",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:07:38.141662Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/509849d0-112a-4b1b-9461-84e31dd471d9/answer` → **200**

```json
{
  "command_id": "d5b4a6db-3e22-44ed-87b0-d6eea93ccdeb"
}
```

```json
{
  "id": "509849d0-112a-4b1b-9461-84e31dd471d9",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673889603",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "order_ids": [],
  "started_at": "2026-10-28T13:07:38.141662Z",
  "answered_at": "2026-10-28T13:07:38.367251Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.16885652",
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
    "id": "1730052600.16885652",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "509849d0-112a-4b1b-9461-84e31dd471d9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673889603",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [],
      "started_at": "2026-10-28T13:07:38.141662Z",
      "answered_at": "2026-10-28T13:07:38.367251Z",
      "ended_at": "2026-10-28T13:07:38.578946Z",
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
      "id": "509849d0-112a-4b1b-9461-84e31dd471d9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673889603",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [],
      "started_at": "2026-10-28T13:07:38.141662Z",
      "answered_at": "2026-10-28T13:07:38.367251Z",
      "ended_at": "2026-10-28T13:07:38.578946Z",
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
      "id": "509849d0-112a-4b1b-9461-84e31dd471d9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673889603",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [],
      "started_at": "2026-10-28T13:07:38.141662Z",
      "answered_at": "2026-10-28T13:07:38.367251Z",
      "ended_at": "2026-10-28T13:07:38.578946Z",
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
      "id": "509849d0-112a-4b1b-9461-84e31dd471d9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673889603",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [],
      "started_at": "2026-10-28T13:07:38.141662Z",
      "answered_at": "2026-10-28T13:07:38.367251Z",
      "ended_at": "2026-10-28T13:07:38.578946Z",
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
      "id": "509849d0-112a-4b1b-9461-84e31dd471d9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673889603",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [],
      "started_at": "2026-10-28T13:07:38.141662Z",
      "answered_at": "2026-10-28T13:07:38.367251Z",
      "ended_at": "2026-10-28T13:07:38.578946Z",
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
      "id": "509849d0-112a-4b1b-9461-84e31dd471d9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673889603",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [],
      "started_at": "2026-10-28T13:07:38.141662Z",
      "answered_at": "2026-10-28T13:07:38.367251Z",
      "ended_at": "2026-10-28T13:07:38.578946Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:07:48.194519Z"
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
      "id": "509849d0-112a-4b1b-9461-84e31dd471d9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673889603",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [],
      "started_at": "2026-10-28T13:07:38.141662Z",
      "answered_at": "2026-10-28T13:07:38.367251Z",
      "ended_at": "2026-10-28T13:07:38.578946Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:07:48.194519Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/509849d0-112a-4b1b-9461-84e31dd471d9/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/509849d0-112a-4b1b-9461-84e31dd471d9/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=509849d0-112a-4b1b-9461-84e31dd471d9` → **200**

```json
{
  "changes": [
    {
      "id": "557bacfc-a053-47b6-8ac6-c22eaed031da",
      "occurred_at": "2026-10-28T13:07:49.980929Z",
      "actor_type": "STAFF",
      "actor_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "509849d0-112a-4b1b-9461-84e31dd471d9",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f733f0d3-f526-49d2-aa59-d52083cf3f69\", \"order_ids\": []}",
      "correlation_id": "362e3d15-68f4-48f3-a5c6-84d5d2e6e4dc"
    },
    {
      "id": "5d259483-1c0c-4818-8ad3-28bb19cd585c",
      "occurred_at": "2026-10-28T13:07:49.946768Z",
      "actor_type": "STAFF",
      "actor_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "509849d0-112a-4b1b-9461-84e31dd471d9",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f733f0d3-f526-49d2-aa59-d52083cf3f69\", \"order_ids\": []}",
      "correlation_id": "a13429b3-3b77-4b9c-8f57-9c4d6ad5a999"
    }
  ]
}
```

Done: call 509849d0-112a-4b1b-9461-84e31dd471d9 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31862"
}
```

```json
{
  "challenge_id": "50e6daae-7e23-4435-8f66-0561e5bda073",
  "expires_at": "2026-10-28T13:12:50.235408648Z",
  "resend_available_at": "2026-10-28T13:07:51.235408648Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "941817",
  "sent_at": "2026-10-28T13:07:50.238412151Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50e6daae-7e23-4435-8f66-0561e5bda073",
  "code": "941817",
  "device_ref": "sandbox-31862"
}
```

```json
{
  "session_id": "7e9514fa-ff4e-489e-b497-091f2903931b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Mzc3MCwiaWF0IjoxNzkzMTkyODcwLCJqdGkiOiJmZmI2ZWU4Mi04MjIxLTQzMTctOTJhOC1lZjkzY2QwMmEyOTkiLCJzaWQiOiI3ZTk1MTRmYS1mZjRlLTQ4OWUtYjQ5Ny0wOTFmMjkwMzkzMWIifQ.h9Q2WQAB5ebHszE8xRhX9dycCNQ8uUFVd1YxmTw3XiI",
  "access_expires_at": "2026-10-28T13:22:50.451405213Z",
  "refresh_token": "DmCVMcGFBNCUdwOtxU0omUlF_4jul-xXMR4OFuWX5yU",
  "refresh_expires_at": "2026-11-27T13:07:50.450773227Z",
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
  "command_id": "ade27522-c6ee-4fd0-981c-22d85bab9cc3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:07:50Z",
    "sequence": 1793192870823
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8a2ca8a-091a-4b83-8121-db6c672c3cce",
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
  "last_heartbeat_at": "2026-10-28T13:07:50.841113Z",
  "last_location_at": "2026-10-28T13:07:50.841113Z",
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
  "session_id": "9d1d0ac1-5199-47d8-8055-846197aec660",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM3NzEsImlhdCI6MTc5MzE5Mjg3MSwianRpIjoiZmIxZThmYzQtZWUwYS00MzRjLTk4YzEtMzdjNTllNTNkNDEwIiwic2lkIjoiOWQxZDBhYzEtNTE5OS00N2Q4LTgwNTUtODQ2MTk3YWVjNjYwIn0.rJl1hFTFQOeZi-ByM4_wnopYa0CgmI8qMx_hXlEK4Js",
  "access_expires_at": "2026-10-28T13:22:51.236144946Z",
  "refresh_token": "vfPFFpVSTDyRE7xkbTLXCNWQFromJEjFk9FH28ITOR4",
  "refresh_expires_at": "2026-10-29T01:07:51.235739192Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ce4fae9e-09bc-4210-a9f8-e78445e3f229",
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
  "id": "a8f4f6fd-2839-42dc-b5df-53b599c0585b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:12:51.425672Z",
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
  "command_id": "56fd9d85-7cff-42ab-8736-786841cecb6b",
  "quote_id": "a8f4f6fd-2839-42dc-b5df-53b599c0585b",
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
    "phone": "+380679214093"
  }
}
```

```json
{
  "id": "59f307a0-864a-4740-80f8-9c9274a5c482",
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
  "created_at": "2026-10-28T13:07:51.629866Z",
  "caller": {
    "name": "Олена",
    "phone": "+380679214093"
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
    "id": "e2b8cb71-e2ff-4989-b306-b4fdbde194eb",
    "order_id": "59f307a0-864a-4740-80f8-9c9274a5c482",
    "expires_at": "2026-10-28T13:08:06.633736Z",
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

`POST /api/driver/v1/offers/e2b8cb71-e2ff-4989-b306-b4fdbde194eb/accept` → **200**

```json
{
  "command_id": "5ddf35ad-7252-46d0-be29-a9dba33fb6a1"
}
```

```json
{
  "id": "7577e0a8-e10e-408a-a60d-960974541d0c",
  "order_id": "59f307a0-864a-4740-80f8-9c9274a5c482",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e5cbff38-b15a-4189-9cfc-bc2548809954",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380679214093` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380679214093` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380679214093` → **200**

```json
[
  {
    "phone": "+380679214093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:07:53.323400893Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679214093` → **200**

```json
[
  {
    "phone": "+380679214093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:07:53.323400893Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679214093` → **200**

```json
[
  {
    "phone": "+380679214093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:07:53.323400893Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e5cbff38-b15a-4189-9cfc-bc2548809954",
  "order_id": "59f307a0-864a-4740-80f8-9c9274a5c482",
  "assignment_id": "7577e0a8-e10e-408a-a60d-960974541d0c",
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
    "phone": "+380679214093"
  }
}
```

`POST /api/driver/v1/work-sessions/c8a2ca8a-091a-4b83-8121-db6c672c3cce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:07:54Z",
    "sequence": 1793192874491
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8a2ca8a-091a-4b83-8121-db6c672c3cce",
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
  "last_heartbeat_at": "2026-10-28T13:07:54.508673Z",
  "last_location_at": "2026-10-28T13:07:54.508673Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e5cbff38-b15a-4189-9cfc-bc2548809954/arrive` → **200**

```json
{
  "command_id": "249d1393-d846-4563-b862-51bcfdd3849e",
  "expected_version": 0
}
```

```json
{
  "id": "e5cbff38-b15a-4189-9cfc-bc2548809954",
  "order_id": "59f307a0-864a-4740-80f8-9c9274a5c482",
  "assignment_id": "7577e0a8-e10e-408a-a60d-960974541d0c",
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
  "arrived_at": "2026-10-28T13:07:54.6989Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679214093"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380679214093` → **200**

```json
[
  {
    "phone": "+380679214093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:07:53.323400893Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679214093` → **200**

```json
[
  {
    "phone": "+380679214093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:07:53.323400893Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679214093` → **200**

```json
[
  {
    "phone": "+380679214093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:07:53.323400893Z"
  },
  {
    "phone": "+380679214093",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T13:07:56.331085911Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679214093` → **200**

```json
[
  {
    "phone": "+380679214093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:07:53.323400893Z"
  },
  {
    "phone": "+380679214093",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T13:07:56.331085911Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679214093` → **200**

```json
[
  {
    "phone": "+380679214093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:07:53.323400893Z"
  },
  {
    "phone": "+380679214093",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T13:07:56.331085911Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/e5cbff38-b15a-4189-9cfc-bc2548809954/start` → **200**

```json
{
  "command_id": "993b3f68-3bcf-44c8-9f2b-65ca322a2111",
  "expected_version": 1
}
```

```json
{
  "id": "e5cbff38-b15a-4189-9cfc-bc2548809954",
  "order_id": "59f307a0-864a-4740-80f8-9c9274a5c482",
  "assignment_id": "7577e0a8-e10e-408a-a60d-960974541d0c",
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
  "arrived_at": "2026-10-28T13:07:54.6989Z",
  "started_at": "2026-10-28T13:07:57.007309Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679214093"
  }
}
```

`POST /api/driver/v1/trips/e5cbff38-b15a-4189-9cfc-bc2548809954/complete` → **200**

```json
{
  "command_id": "a8b8041a-8f5a-4844-9a9e-3f4e6d84238c",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:07:57Z",
  "cash_received": true
}
```

```json
{
  "id": "e5cbff38-b15a-4189-9cfc-bc2548809954",
  "order_id": "59f307a0-864a-4740-80f8-9c9274a5c482",
  "assignment_id": "7577e0a8-e10e-408a-a60d-960974541d0c",
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
  "arrived_at": "2026-10-28T13:07:54.6989Z",
  "started_at": "2026-10-28T13:07:57.007309Z",
  "completed_at": "2026-10-28T13:07:57.197678Z",
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
  "session_id": "c8a2ca8a-091a-4b83-8121-db6c672c3cce",
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
  "last_heartbeat_at": "2026-10-28T13:07:54.508673Z",
  "last_location_at": "2026-10-28T13:07:54.508673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8a2ca8a-091a-4b83-8121-db6c672c3cce/close` → **200**

```json
{
  "command_id": "d1a0eeb4-c160-4090-954e-f104482d3142",
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
  "phone": "+380638243499",
  "device_ref": "sandbox-15931"
}
```

```json
{
  "challenge_id": "fcae66fa-f3c4-4a33-98a4-799f67534289",
  "expires_at": "2026-10-28T13:12:57.780752762Z",
  "resend_available_at": "2026-10-28T13:07:58.780752762Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638243499` → **200**

```json
{
  "phone": "+380638243499",
  "audience": "CLIENT",
  "code": "667164",
  "sent_at": "2026-10-28T13:07:57.783578847Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fcae66fa-f3c4-4a33-98a4-799f67534289",
  "code": "667164",
  "device_ref": "sandbox-15931"
}
```

```json
{
  "session_id": "d1ce1d67-188b-40d7-a18d-480ca95852c4",
  "subject": {
    "type": "CLIENT",
    "id": "32437e01-0ec3-4ba9-bf8d-555621f8fc5e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMjQzN2UwMS0wZWMzLTRiYTktYmY4ZC01NTU2MjFmOGZjNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNzc3LCJpYXQiOjE3OTMxOTI4NzcsImp0aSI6IjQ5OWE5NDQ5LTE5YzQtNDk3OS1hZmU5LTQxM2UyNTFlZDc3YyIsInNpZCI6ImQxY2UxZDY3LTE4OGItNDBkNy1hMThkLTQ4MGNhOTU4NTJjNCJ9.NvkogZ-alHcSSkv9q-qCbvnqGmq3_OmXOYzGe2ESZKg",
  "access_expires_at": "2026-10-28T13:22:57.997933263Z",
  "refresh_token": "9lF7F30MFkmYLWoncx6UDL3QqJjBbprJnXZSPUW2Q3M",
  "refresh_expires_at": "2026-11-27T13:07:57.99725752Z",
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
  "device_ref": "sandbox-10110"
}
```

```json
{
  "challenge_id": "d2bf4f59-be3f-4c17-a387-ccfbe2af2f43",
  "expires_at": "2026-10-28T13:12:58.375933932Z",
  "resend_available_at": "2026-10-28T13:07:59.375933932Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "531843",
  "sent_at": "2026-10-28T13:07:58.378586767Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2bf4f59-be3f-4c17-a387-ccfbe2af2f43",
  "code": "531843",
  "device_ref": "sandbox-10110"
}
```

```json
{
  "session_id": "7d4a5d2c-dc99-4682-bd9e-517d0176ac7d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Mzc3OCwiaWF0IjoxNzkzMTkyODc4LCJqdGkiOiI3OWRlNzg1Ny04MzI5LTQzZjktODk5Ny03ZDIwY2U5MDI5OGQiLCJzaWQiOiI3ZDRhNWQyYy1kYzk5LTQ2ODItYmQ5ZS01MTdkMDE3NmFjN2QifQ.rWW19sVFQSuaqlXDjTXjvOL8eJ2iOy5p-PddJVsswRY",
  "access_expires_at": "2026-10-28T13:22:58.589998799Z",
  "refresh_token": "ys1N2oXYWQIdSO_w1Xaj3_u9-lYD9tYWrYrC801tnyA",
  "refresh_expires_at": "2026-11-27T13:07:58.589485863Z",
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
  "session_id": "2c1aed2b-f35d-4ad5-8c07-a7422c13dc37",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM3NzksImlhdCI6MTc5MzE5Mjg3OSwianRpIjoiMDEwYjUwYjQtYzVkMC00MDc1LWE4OTUtNTkzM2M0ZDhjZjdlIiwic2lkIjoiMmMxYWVkMmItZjM1ZC00YWQ1LThjMDctYTc0MjJjMTNkYzM3In0.WPkHmShXTTJG9oNTIJywCXzTG12b5MjDbGt2hiYwHy4",
  "access_expires_at": "2026-10-28T13:22:59.159521956Z",
  "refresh_token": "W2wa-yA8hnIAPSHdwe6t2BaMqYL-UswncqB9ydGm3W0",
  "refresh_expires_at": "2026-10-29T01:07:59.159126407Z",
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
  "session_id": "d58a4e57-b2bb-40ec-acc2-3773044dc2c1",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM3NzksImlhdCI6MTc5MzE5Mjg3OSwianRpIjoiYmU1N2U5YzYtN2JiYi00MmFmLWJmYjctMjQ3MWYyZjhiY2I5Iiwic2lkIjoiZDU4YTRlNTctYjJiYi00MGVjLWFjYzItMzc3MzA0NGRjMmMxIn0.V6UubHvbgCio5ljLGFBsztH2tJ3t-2tnVditByV9u4I",
  "access_expires_at": "2026-10-28T13:22:59.551249772Z",
  "refresh_token": "bnr34w-k5c9rsn_4ht0Hqr-6IlLRJ4UwXJp52g7CI9Q",
  "refresh_expires_at": "2026-10-29T01:07:59.550783827Z",
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
  "command_id": "be6c420e-2fd2-40e3-8a5b-9688b7477882",
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
  "id": "4c4dafa5-899c-4525-823e-40c911a7f61c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:12:59.920017Z",
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
  "command_id": "68942bf8-a714-4de3-b702-715d0adbaaa0",
  "quote_id": "4c4dafa5-899c-4525-823e-40c911a7f61c",
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
  "id": "4d87affb-b622-4bcd-b48e-2a9d22aa0c83",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "32437e01-0ec3-4ba9-bf8d-555621f8fc5e",
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
  "created_at": "2026-10-28T13:08:00.116533Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4d87affb-b622-4bcd-b48e-2a9d22aa0c83` → **200**

```json
{
  "id": "4d87affb-b622-4bcd-b48e-2a9d22aa0c83",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "32437e01-0ec3-4ba9-bf8d-555621f8fc5e",
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
  "created_at": "2026-10-28T13:08:00.116533Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4d87affb-b622-4bcd-b48e-2a9d22aa0c83/cancel` → **200**

```json
{
  "command_id": "d4bc9fa0-852e-4e32-b007-b6dc5093c740",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "4d87affb-b622-4bcd-b48e-2a9d22aa0c83",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "32437e01-0ec3-4ba9-bf8d-555621f8fc5e",
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
  "created_at": "2026-10-28T13:08:00.116533Z",
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
  "command_id": "a5ba1f96-6fb9-4ceb-ae12-1747d660d632",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:08:00Z",
    "sequence": 1793192880922
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c4fd4569-9825-4834-ad2d-873c70587906",
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
  "last_heartbeat_at": "2026-10-28T13:08:00.939764Z",
  "last_location_at": "2026-10-28T13:08:00.939764Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19370"
}
```

```json
{
  "challenge_id": "a32cfab0-5a2f-45a0-93e5-394d08c70e52",
  "expires_at": "2026-10-28T13:13:01.12940979Z",
  "resend_available_at": "2026-10-28T13:08:02.12940979Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "730129",
  "sent_at": "2026-10-28T13:08:01.131807048Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a32cfab0-5a2f-45a0-93e5-394d08c70e52",
  "code": "730129",
  "device_ref": "sandbox-19370"
}
```

```json
{
  "session_id": "450e8a5a-6c87-4bf0-ae69-ea3f82b57129",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Mzc4MSwiaWF0IjoxNzkzMTkyODgxLCJqdGkiOiIxMzJiMGQ2NS04YTExLTQ5YjgtYjQ5My04N2FlMjA4MzM0OTIiLCJzaWQiOiI0NTBlOGE1YS02Yzg3LTRiZjAtYWU2OS1lYTNmODJiNTcxMjkifQ.7IFIgJCJZgpQ3C5hz4maV9IbiSJ_uRwf7-gOEyVAFqs",
  "access_expires_at": "2026-10-28T13:23:01.342795395Z",
  "refresh_token": "84koEd0uXQ1FATF5Dao3YPoKxHljkGdgeEKcIu7xjQg",
  "refresh_expires_at": "2026-11-27T13:08:01.342250119Z",
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
  "command_id": "ff079ab3-b435-4c42-b648-149aaa2079b2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:08:01Z",
    "sequence": 1793192881702
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d4e723d6-de2c-447a-90e7-20efc735044f",
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
  "last_heartbeat_at": "2026-10-28T13:08:01.719404Z",
  "last_location_at": "2026-10-28T13:08:01.719404Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5b053460-988e-4392-825b-f4378838c67e",
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
  "id": "5666c7de-947f-48d0-9037-3fdbf714b8f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:13:01.907582Z",
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
  "command_id": "07ae03a1-1c25-47b3-9a6a-002e0c327671",
  "quote_id": "5666c7de-947f-48d0-9037-3fdbf714b8f1",
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
  "id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "32437e01-0ec3-4ba9-bf8d-555621f8fc5e",
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
  "created_at": "2026-10-28T13:08:02.105971Z",
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
    "id": "64035793-6c87-41c0-aa58-aedf1a05bc1d",
    "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
    "expires_at": "2026-10-28T13:08:17.108995Z",
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

`POST /api/driver/v1/offers/64035793-6c87-41c0-aa58-aedf1a05bc1d/accept` → **200**

```json
{
  "command_id": "17ca8984-f0b5-4e92-8516-1b8ce4f5002b"
}
```

```json
{
  "id": "1f05079f-1b8e-4ddc-8b79-6d0548fbd015",
  "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "226ce5c6-1f25-4998-8d94-1463928f7be7",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "226ce5c6-1f25-4998-8d94-1463928f7be7",
  "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
  "assignment_id": "1f05079f-1b8e-4ddc-8b79-6d0548fbd015",
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

`POST /api/driver/v1/trips/226ce5c6-1f25-4998-8d94-1463928f7be7/cancel` → **200**

```json
{
  "command_id": "888108a8-4f00-4379-9a94-d4f4c8c50d64",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "226ce5c6-1f25-4998-8d94-1463928f7be7",
  "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
  "assignment_id": "1f05079f-1b8e-4ddc-8b79-6d0548fbd015",
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

`GET /api/rider/v1/orders/11cd3cbb-7728-4a4c-ad9d-368eff122bb7` → **200**

```json
{
  "id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "32437e01-0ec3-4ba9-bf8d-555621f8fc5e",
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
    "id": "1f05079f-1b8e-4ddc-8b79-6d0548fbd015",
    "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "226ce5c6-1f25-4998-8d94-1463928f7be7",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:08:02.105971Z",
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
    "id": "e28abe0d-e973-4ed4-9e76-a362a91ed5f9",
    "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
    "expires_at": "2026-10-28T13:08:17.89911Z",
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

`POST /api/driver/v1/offers/e28abe0d-e973-4ed4-9e76-a362a91ed5f9/accept` → **200**

```json
{
  "command_id": "ae912ab7-887d-4113-a8e5-368747b627d6"
}
```

```json
{
  "id": "5060fe80-c39c-4e5d-95e0-faa27f508af4",
  "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "44336e18-436d-44f3-87f1-65f3f45c142e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "44336e18-436d-44f3-87f1-65f3f45c142e",
  "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
  "assignment_id": "5060fe80-c39c-4e5d-95e0-faa27f508af4",
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

`POST /api/driver/v1/trips/44336e18-436d-44f3-87f1-65f3f45c142e/cancel` → **200**

```json
{
  "command_id": "34107862-f916-4f88-b22e-4b5bcf74eb27",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "44336e18-436d-44f3-87f1-65f3f45c142e",
  "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
  "assignment_id": "5060fe80-c39c-4e5d-95e0-faa27f508af4",
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
    "id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:08:02.105971Z",
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
    "id": "4d87affb-b622-4bcd-b48e-2a9d22aa0c83",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:08:00.116533Z",
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

`GET /api/operator/v1/orders/11cd3cbb-7728-4a4c-ad9d-368eff122bb7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:08:02.10652Z",
      "actor": {
        "type": "CLIENT",
        "id": "32437e01-0ec3-4ba9-bf8d-555621f8fc5e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
        "quote_id": "5666c7de-947f-48d0-9037-3fdbf714b8f1",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "8cbc6c4d-bab1-4516-a6c0-0f7375508c5d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:08:02.108066Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
        "attempt_id": "21d3403d-302a-4cfb-bd55-3146159694b2",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8cbc6c4d-bab1-4516-a6c0-0f7375508c5d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:08:02.114165Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "64035793-6c87-41c0-aa58-aedf1a05bc1d",
        "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "8cbc6c4d-bab1-4516-a6c0-0f7375508c5d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:08:02.503142Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "64035793-6c87-41c0-aa58-aedf1a05bc1d",
        "order_id": "11cd3cbb-7728-4a4c-ad9d-368eff122bb7",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "1f05079f-1b8e-4ddc-8b79-6d0548fbd015"
      },
      "correlation_id": "f753f8d3-47ef-40ab-8b0e-b7e2ecb8dd01"
```

Done: orders 4d87affb-b622-4bcd-b48e-2a9d22aa0c83, 11cd3cbb-7728-4a4c-ad9d-368eff122bb7.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732739410",
  "device_ref": "sandbox-22329"
}
```

```json
{
  "challenge_id": "eba6e18c-19b3-4ef7-afc9-fe1b1bed951a",
  "expires_at": "2026-10-28T13:13:04.468077538Z",
  "resend_available_at": "2026-10-28T13:08:05.468077538Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732739410` → **200**

```json
{
  "phone": "+380732739410",
  "audience": "CLIENT",
  "code": "356252",
  "sent_at": "2026-10-28T13:08:04.470614387Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eba6e18c-19b3-4ef7-afc9-fe1b1bed951a",
  "code": "356252",
  "device_ref": "sandbox-22329"
}
```

```json
{
  "session_id": "567bfb53-672a-42af-9448-6dff3a1b114f",
  "subject": {
    "type": "CLIENT",
    "id": "0ef0b761-fea2-433c-9963-64e4cbb35ca0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZWYwYjc2MS1mZWEyLTQzM2MtOTk2My02NGU0Y2JiMzVjYTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNzg0LCJpYXQiOjE3OTMxOTI4ODQsImp0aSI6ImQ4ZTc0MmM2LWFmZDgtNDVhZi04NGE1LWExYzM2ZGIyYWUzOSIsInNpZCI6IjU2N2JmYjUzLTY3MmEtNDJhZi05NDQ4LTZkZmYzYTFiMTE0ZiJ9.CpvRgP3efw6uZB84JR0FU70iXvGrtFhjOBq11SqwtyY",
  "access_expires_at": "2026-10-28T13:23:04.681177576Z",
  "refresh_token": "YrK-6J5tFAblThrhNQHxbL2jSznvlN_JN4W8XRkvrz8",
  "refresh_expires_at": "2026-11-27T13:08:04.680649306Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "37812224-48b7-41ae-8783-720147509334",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d704e19b-8234-4c99-9fe6-050e40e7112b",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d704e19b-8234-4c99-9fe6-050e40e7112b",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b5d16271085ee19c9fe567c39b712f72",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d704e19b-8234-4c99-9fe6-050e40e7112b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732739410"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d704e19b-8234-4c99-9fe6-050e40e7112b",
  "expires_at": "2026-10-28T13:38:04.870758Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/d704e19b-8234-4c99-9fe6-050e40e7112b` → **200**

```json
{
  "id": "d704e19b-8234-4c99-9fe6-050e40e7112b",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T13:38:04.870758Z",
  "card": {
    "id": "20a55117-440a-4138-859d-59edb25c7e89",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6279",
    "card_type": "Visa",
    "created_at": "2026-10-28T13:08:05.071144Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "20a55117-440a-4138-859d-59edb25c7e89",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6279",
      "card_type": "Visa",
      "created_at": "2026-10-28T13:08:05.071144Z"
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
  "device_ref": "sandbox-24039"
}
```

```json
{
  "challenge_id": "33fcfa2a-9fd3-495f-9975-238af6d6a0f7",
  "expires_at": "2026-10-28T13:13:05.461257995Z",
  "resend_available_at": "2026-10-28T13:08:06.461257995Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "262698",
  "sent_at": "2026-10-28T13:08:05.464091764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "33fcfa2a-9fd3-495f-9975-238af6d6a0f7",
  "code": "262698",
  "device_ref": "sandbox-24039"
}
```

```json
{
  "session_id": "1834ad54-e5ee-42e1-bc00-0c8285f7f5ac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Mzc4NSwiaWF0IjoxNzkzMTkyODg1LCJqdGkiOiJjMTI4ZDY4ZC1mM2VhLTQxODEtYjE5My0zMDQ1NDM4ZWZlYzMiLCJzaWQiOiIxODM0YWQ1NC1lNWVlLTQyZTEtYmMwMC0wYzgyODVmN2Y1YWMifQ.Kx5SCoAO3FRsEe60lc7VRAn5txOyaoMLjOQby80qBaY",
  "access_expires_at": "2026-10-28T13:23:05.67389954Z",
  "refresh_token": "MTwgubH9_0a5Rf6uwiMTAFctnEmVPlc8S1dR4N8QS2Y",
  "refresh_expires_at": "2026-11-27T13:08:05.673510511Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d4e723d6-de2c-447a-90e7-20efc735044f",
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
  "last_heartbeat_at": "2026-10-28T13:08:01.719404Z",
  "last_location_at": "2026-10-28T13:08:01.719404Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d4e723d6-de2c-447a-90e7-20efc735044f/handover` → **200**

```json
{
  "command_id": "feb084f8-a830-4483-8d4d-2d9dcee755e3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d4e723d6-de2c-447a-90e7-20efc735044f",
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
  "last_heartbeat_at": "2026-10-28T13:08:01.719404Z",
  "last_location_at": "2026-10-28T13:08:01.719404Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d4e723d6-de2c-447a-90e7-20efc735044f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:08:06Z",
    "sequence": 1793192886240
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d4e723d6-de2c-447a-90e7-20efc735044f",
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
  "last_heartbeat_at": "2026-10-28T13:08:06.259242Z",
  "last_location_at": "2026-10-28T13:08:06.259242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e1d59390-eb90-4c7c-9437-c4ad999c6009",
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
  "id": "9fda60fc-81f1-4807-ae6d-77f53137c43f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:13:06.484684Z",
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
  "command_id": "394e9765-2697-42a1-bb3f-98e31dc32a45",
  "quote_id": "9fda60fc-81f1-4807-ae6d-77f53137c43f",
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
  "id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0ef0b761-fea2-433c-9963-64e4cbb35ca0",
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
  "created_at": "2026-10-28T13:08:06.68346Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e0c231a-a4a6-4132-aeef-770b7de0c389` → **200**

```json
{
  "id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0ef0b761-fea2-433c-9963-64e4cbb35ca0",
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
  "created_at": "2026-10-28T13:08:06.68346Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e0c231a-a4a6-4132-aeef-770b7de0c389` → **200**

```json
{
  "id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0ef0b761-fea2-433c-9963-64e4cbb35ca0",
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
  "created_at": "2026-10-28T13:08:06.68346Z",
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
    "id": "1819148e-1cda-4b37-9b04-becfa7fa0d48",
    "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
    "expires_at": "2026-10-28T13:08:22.544129Z",
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

`POST /api/driver/v1/offers/1819148e-1cda-4b37-9b04-becfa7fa0d48/accept` → **200**

```json
{
  "command_id": "630790b9-35d0-47a8-887d-b0fef0f29ba7"
}
```

```json
{
  "id": "c4a396b3-bf07-41ef-a11f-a027b77513eb",
  "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "27a5b347-ca9d-4dc9-b657-c42e1b0c768e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "27a5b347-ca9d-4dc9-b657-c42e1b0c768e",
  "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
  "assignment_id": "c4a396b3-bf07-41ef-a11f-a027b77513eb",
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

`POST /api/driver/v1/work-sessions/d4e723d6-de2c-447a-90e7-20efc735044f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:08:08Z",
    "sequence": 1793192888856
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d4e723d6-de2c-447a-90e7-20efc735044f",
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
  "last_heartbeat_at": "2026-10-28T13:08:08.873677Z",
  "last_location_at": "2026-10-28T13:08:08.873677Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/27a5b347-ca9d-4dc9-b657-c42e1b0c768e/arrive` → **200**

```json
{
  "command_id": "0ed1810d-4596-4944-8b45-e708e066d770",
  "expected_version": 0
}
```

```json
{
  "id": "27a5b347-ca9d-4dc9-b657-c42e1b0c768e",
  "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
  "assignment_id": "c4a396b3-bf07-41ef-a11f-a027b77513eb",
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
  "arrived_at": "2026-10-28T13:08:09.07073Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/27a5b347-ca9d-4dc9-b657-c42e1b0c768e/start` → **200**

```json
{
  "command_id": "60a53089-5e2b-4baa-933f-e3c67b8f8ef9",
  "expected_version": 1
}
```

```json
{
  "id": "27a5b347-ca9d-4dc9-b657-c42e1b0c768e",
  "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
  "assignment_id": "c4a396b3-bf07-41ef-a11f-a027b77513eb",
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
  "arrived_at": "2026-10-28T13:08:09.07073Z",
  "started_at": "2026-10-28T13:08:09.278718Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/27a5b347-ca9d-4dc9-b657-c42e1b0c768e/complete` → **200**

```json
{
  "command_id": "25556171-dddc-4911-85c1-1cc3a0296d92",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:08:09Z"
}
```

```json
{
  "id": "27a5b347-ca9d-4dc9-b657-c42e1b0c768e",
  "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
  "assignment_id": "c4a396b3-bf07-41ef-a11f-a027b77513eb",
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
  "arrived_at": "2026-10-28T13:08:09.07073Z",
  "started_at": "2026-10-28T13:08:09.278718Z",
  "completed_at": "2026-10-28T13:08:09.482763Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/2e0c231a-a4a6-4132-aeef-770b7de0c389` → **200**

```json
{
  "id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0ef0b761-fea2-433c-9963-64e4cbb35ca0",
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
    "id": "c4a396b3-bf07-41ef-a11f-a027b77513eb",
    "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "27a5b347-ca9d-4dc9-b657-c42e1b0c768e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:08:06.68346Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e0c231a-a4a6-4132-aeef-770b7de0c389` → **200**

```json
{
  "id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "0ef0b761-fea2-433c-9963-64e4cbb35ca0",
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
    "id": "c4a396b3-bf07-41ef-a11f-a027b77513eb",
    "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "27a5b347-ca9d-4dc9-b657-c42e1b0c768e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:08:06.68346Z",
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
      "id": "c43cb432-80b8-40a0-8af7-e012708d3947",
      "at": "2026-10-28T13:08:09.584806Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/2e0c231a-a4a6-4132-aeef-770b7de0c389/tip` → **200**

```json
{
  "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
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
  "available_until": "2026-10-29T13:08:09.482763Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/2e0c231a-a4a6-4132-aeef-770b7de0c389/tip` → **201**

```json
{
  "command_id": "2c011159-dd59-4603-9527-1c849eb56788",
  "amount_minor": 2500
}
```

```json
{
  "id": "946a9b3d-7a55-4bb8-b8f1-07d5fd1ef80b",
  "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T13:08:11.635906Z"
}
```

`GET /api/rider/v1/orders/2e0c231a-a4a6-4132-aeef-770b7de0c389/tip` → **200**

```json
{
  "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
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
  "available_until": "2026-10-29T13:08:09.482763Z",
  "open": false,
  "tip": {
    "id": "946a9b3d-7a55-4bb8-b8f1-07d5fd1ef80b",
    "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T13:08:11.635906Z"
  }
}
```

`GET /api/rider/v1/orders/2e0c231a-a4a6-4132-aeef-770b7de0c389/tip` → **200**

```json
{
  "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
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
  "available_until": "2026-10-29T13:08:09.482763Z",
  "open": false,
  "tip": {
    "id": "946a9b3d-7a55-4bb8-b8f1-07d5fd1ef80b",
    "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T13:08:11.635906Z"
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
      "id": "c43cb432-80b8-40a0-8af7-e012708d3947",
      "at": "2026-10-28T13:08:09.584806Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
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
      "id": "100a6790-472c-4980-81e9-2f6b373d2be2",
      "at": "2026-10-28T13:08:13.64406Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
      "counterpart_id": null
    },
    {
      "id": "c43cb432-80b8-40a0-8af7-e012708d3947",
      "at": "2026-10-28T13:08:09.584806Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2e0c231a-a4a6-4132-aeef-770b7de0c389",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d4e723d6-de2c-447a-90e7-20efc735044f",
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
  "last_heartbeat_at": "2026-10-28T13:08:08.873677Z",
  "last_location_at": "2026-10-28T13:08:08.873677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d4e723d6-de2c-447a-90e7-20efc735044f/close` → **200**

```json
{
  "command_id": "5415e97e-0a18-4bbe-abef-866c4e500472",
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

Done: card order 2e0c231a-a4a6-4132-aeef-770b7de0c389.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731639045",
  "device_ref": "sandbox-5"
}
```

```json
{
  "challenge_id": "ce23df90-5200-4e7e-97b1-f8454257c845",
  "expires_at": "2026-10-28T13:13:14.94921307Z",
  "resend_available_at": "2026-10-28T13:08:15.94921307Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731639045` → **200**

```json
{
  "phone": "+380731639045",
  "audience": "CLIENT",
  "code": "992742",
  "sent_at": "2026-10-28T13:08:14.951748443Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce23df90-5200-4e7e-97b1-f8454257c845",
  "code": "992742",
  "device_ref": "sandbox-5"
}
```

```json
{
  "session_id": "7f08a2cf-cf80-44ba-b172-3e8ad09db4b6",
  "subject": {
    "type": "CLIENT",
    "id": "fd10f5df-cf26-4f86-8f17-eed42bd07c82"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDEwZjVkZi1jZjI2LTRmODYtOGYxNy1lZWQ0MmJkMDdjODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNzk1LCJpYXQiOjE3OTMxOTI4OTUsImp0aSI6ImM3NzBiMDg5LTNiMGEtNDM2Ny05MzlhLTA3NjMwNWM0MzVhYyIsInNpZCI6IjdmMDhhMmNmLWNmODAtNDRiYS1iMTcyLTNlOGFkMDlkYjRiNiJ9.EJtpkJHkzMiCwZsLwEmtARc8NEwxTArZeYcDLThWVgw",
  "access_expires_at": "2026-10-28T13:23:15.158391895Z",
  "refresh_token": "XhoS88WB-agMRkF-loRUT0NV4Egi803RbJ-r11B6_w4",
  "refresh_expires_at": "2026-11-27T13:08:15.157796484Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "fbba6182-3050-4a0e-9a2e-529d91094206",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "9ae8fbd7-c372-4d5c-94eb-b236f85e9e51",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9ae8fbd7-c372-4d5c-94eb-b236f85e9e51",
    "orderDate": "1793192895",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "639d4bc196c6d9869461f546e9778c16",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9ae8fbd7-c372-4d5c-94eb-b236f85e9e51",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731639045"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9ae8fbd7-c372-4d5c-94eb-b236f85e9e51",
  "created_at": "2026-10-28T13:08:15.35766Z",
  "expires_at": "2026-10-28T13:38:15.35766Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/9ae8fbd7-c372-4d5c-94eb-b236f85e9e51` → **200**

```json
{
  "id": "9ae8fbd7-c372-4d5c-94eb-b236f85e9e51",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T13:08:15.35766Z",
  "expires_at": "2026-10-28T13:38:15.35766Z",
  "completed_at": "2026-10-28T13:08:15.554082Z",
  "masked_pan": "41****0431",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fd10f5df-cf26-4f86-8f17-eed42bd07c82",
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
      "id": "3feadf86-a13f-4331-8033-8833c2a93a4a",
      "at": "2026-10-28T13:08:15.666351Z",
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
  "client_id": "fd10f5df-cf26-4f86-8f17-eed42bd07c82",
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
      "id": "3feadf86-a13f-4331-8033-8833c2a93a4a",
      "at": "2026-10-28T13:08:15.666351Z",
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
  "device_ref": "sandbox-13639"
}
```

```json
{
  "challenge_id": "bfbfd467-2fd6-4072-8ee2-369a8f0e7977",
  "expires_at": "2026-10-28T13:13:16.125932223Z",
  "resend_available_at": "2026-10-28T13:08:17.125932223Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "483260",
  "sent_at": "2026-10-28T13:08:16.128363172Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bfbfd467-2fd6-4072-8ee2-369a8f0e7977",
  "code": "483260",
  "device_ref": "sandbox-13639"
}
```

```json
{
  "session_id": "60f61802-6c34-49e4-b966-23d3dddba82b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Mzc5NiwiaWF0IjoxNzkzMTkyODk2LCJqdGkiOiI0YTMxN2MxOS02MzZhLTQyNjgtOWIxNy0xNGJjYjk3ODQ2YTUiLCJzaWQiOiI2MGY2MTgwMi02YzM0LTQ5ZTQtYjk2Ni0yM2QzZGRkYmE4MmIifQ.5WnS46RK_ChO6csd6nQM90rFWhxbJOSd3BfePM5R8Ig",
  "access_expires_at": "2026-10-28T13:23:16.334346946Z",
  "refresh_token": "d44_VQ_Sf32AUvLkoLUR8KHjRR_ybhFnfEFG4BTQz10",
  "refresh_expires_at": "2026-11-27T13:08:16.33392399Z",
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
  "command_id": "80683765-5e8b-4d21-8021-ca3d56e2026c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "ee4db598-b0e8-4e93-928f-d000c68c1499",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ee4db598-b0e8-4e93-928f-d000c68c1499",
    "orderDate": "1793192896",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "6232aab389d7b3bd0ae902917d7d7d44",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ee4db598-b0e8-4e93-928f-d000c68c1499",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ee4db598-b0e8-4e93-928f-d000c68c1499",
  "created_at": "2026-10-28T13:08:16.709082Z",
  "expires_at": "2026-10-28T13:38:16.709082Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/ee4db598-b0e8-4e93-928f-d000c68c1499` → **200**

```json
{
  "id": "ee4db598-b0e8-4e93-928f-d000c68c1499",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T13:08:16.709082Z",
  "expires_at": "2026-10-28T13:38:16.709082Z",
  "completed_at": "2026-10-28T13:08:16.892851Z",
  "masked_pan": "41****0111",
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
      "id": "95ce3f64-53a7-4d2e-a57c-89ae15b3fbd4",
      "at": "2026-10-28T13:08:17.673105Z",
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
  "command_id": "25c74544-a0c3-4055-b889-5e053cc6f94c",
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
  "correlation_id": "d60872f5-9426-4d89-9c7e-d141137f72d1"
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
  "session_id": "b0dff529-5765-4110-9757-a7034a40711f",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM3OTgsImlhdCI6MTc5MzE5Mjg5OCwianRpIjoiYWI3ZjllMjYtZjYwNC00MjJjLWFhODQtNmVjN2E1ZjcwOGE1Iiwic2lkIjoiYjBkZmY1MjktNTc2NS00MTEwLTk3NTctYTcwMzRhNDA3MTFmIn0.y_VVk57GR3ZztBCuojKODBt8L0dXHliv8_SZv6QyUS4",
  "access_expires_at": "2026-10-28T13:23:18.872935202Z",
  "refresh_token": "Rj8gw-6rxw4LgLtUm1dQJbtMkCDmVhv-cUsZPXWUCis",
  "refresh_expires_at": "2026-10-29T01:08:18.872463468Z",
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
  "phone": "+48600315191",
  "device_ref": "sandbox-12800"
}
```

```json
{
  "challenge_id": "93c94ea6-0d85-4f26-b532-2cf6d67d4105",
  "expires_at": "2026-10-28T13:13:19.444322428Z",
  "resend_available_at": "2026-10-28T13:08:20.444322428Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600315191` → **200**

```json
{
  "phone": "+48600315191",
  "audience": "CLIENT",
  "code": "670963",
  "sent_at": "2026-10-28T13:08:19.446236866Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93c94ea6-0d85-4f26-b532-2cf6d67d4105",
  "code": "670963",
  "device_ref": "sandbox-12800"
}
```

```json
{
  "session_id": "e6e440da-1c40-44b0-be5b-2b809863829a",
  "subject": {
    "type": "CLIENT",
    "id": "7d7b5a50-19b5-4bb7-83ff-5a8c2ebdadf2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZDdiNWE1MC0xOWI1LTRiYjctODNmZi01YThjMmViZGFkZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNzk5LCJpYXQiOjE3OTMxOTI4OTksImp0aSI6IjBkMmRmMWJiLWJiZGMtNGQ2OC1hMGI5LTMxNDZiNTFkMWJhMiIsInNpZCI6ImU2ZTQ0MGRhLTFjNDAtNDRiMC1iZTViLTJiODA5ODYzODI5YSJ9.Lds849RjNFOVUK7L3lyeFSK_ekvY_bubWSdVb1fzGoE",
  "access_expires_at": "2026-10-28T13:23:19.652394306Z",
  "refresh_token": "rqViZbOlLj3dhvrUwGEyDwLriJzVRO-B6xJZIFyVKEY",
  "refresh_expires_at": "2026-11-27T13:08:19.651925938Z",
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
  "command_id": "2bbf738e-effc-4901-926f-bea8630399d1",
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
  "correlation_id": "1d468764-668b-44e6-ae23-18d0356f08af",
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
  "command_id": "4a7d4695-d069-42c9-9365-34d81416889b",
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
  "paused_at": "2026-10-28T13:08:20.441228215Z",
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
  "command_id": "6b5cac13-0712-4b0c-b583-41e7e3731bbf",
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
  "id": "5595f0c0-f8ba-42bd-937d-ce22d2c53a4d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:13:20.861340Z",
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
  "command_id": "e86281a3-3d44-44ef-bcbf-37e52bac5ac1",
  "quote_id": "5595f0c0-f8ba-42bd-937d-ce22d2c53a4d",
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
  "correlation_id": "ae6618d2-e2f4-4d91-89fd-7835ec7d9e73"
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
  "paused_at": "2026-10-28T13:08:20.441228Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "56a1f0c0-bb62-4f2d-96c6-4149cca171a3",
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
  "command_id": "3bf6b3be-6272-4f94-bd79-c47b5a152bf6",
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
  "command_id": "658ab3e7-7f0a-445a-9032-41e5bfa2caf7",
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
  "id": "38e71c2d-6e5e-4de9-b2e7-f8ebc56d9b46",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:13:22.038870Z",
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
  "command_id": "d396fea0-0189-41b4-b99c-64f8668227a2",
  "quote_id": "38e71c2d-6e5e-4de9-b2e7-f8ebc56d9b46",
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
  "correlation_id": "e358cac1-7a7d-486d-8dc6-518c7da90716"
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
  "command_id": "a056db45-c6f2-4b62-93d0-259fa73e9fc6",
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
      "from": "16:00",
      "to": "17:00"
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
      "from": "16:00",
      "to": "17:00"
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
  "command_id": "9b47f8a5-57df-41f2-961e-6156aa10ffb5",
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
  "id": "1020b7bd-5a3d-414f-bb15-c1a119169e1c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:13:22.803068Z",
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
  "command_id": "4dc7011a-0ff0-45b0-bf0e-9db22e3728ee",
  "quote_id": "1020b7bd-5a3d-414f-bb15-c1a119169e1c",
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
  "correlation_id": "5de71f3f-dc4f-4506-acd8-a53f9482d00f"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "4f1f6e7c-87fb-4fc5-985c-c675892c462a",
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
  "correlation_id": "31d261f0-7829-4f64-b9a1-42d21554860d"
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
      "from": "16:00",
      "to": "17:00"
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
  "command_id": "826655b0-4085-4d30-baa3-c2d0cf623448",
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
  "phone": "+380673747916",
  "device_ref": "sandbox-25585"
}
```

```json
{
  "challenge_id": "298f19a0-43d8-4817-9e92-228a918cd2cd",
  "expires_at": "2026-10-28T13:13:23.786769468Z",
  "resend_available_at": "2026-10-28T13:08:24.786769468Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673747916` → **200**

```json
{
  "phone": "+380673747916",
  "audience": "CLIENT",
  "code": "477162",
  "sent_at": "2026-10-28T13:08:23.788981356Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "298f19a0-43d8-4817-9e92-228a918cd2cd",
  "code": "477162",
  "device_ref": "sandbox-25585"
}
```

```json
{
  "session_id": "6cf34866-937f-4ec6-b6a0-b41ec23886c8",
  "subject": {
    "type": "CLIENT",
    "id": "c81e65cb-c0e9-44e4-a718-aea33bc7d360"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODFlNjVjYi1jMGU5LTQ0ZTQtYTcxOC1hZWEzM2JjN2QzNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODAzLCJpYXQiOjE3OTMxOTI5MDMsImp0aSI6ImU1MzY4OTFhLTRmN2QtNDBlZi1iZDk1LTFlMGE3NjBkMmI2NCIsInNpZCI6IjZjZjM0ODY2LTkzN2YtNGVjNi1iNmEwLWI0MWVjMjM4ODZjOCJ9.R0U_ht32XmbQtixbB5R68tZ4hl5McctQH7IvXTjHcq8",
  "access_expires_at": "2026-10-28T13:23:23.994411918Z",
  "refresh_token": "Oa4wFSGVK5oYNFaPHhlO4RK2J8BkjFXq2VhvjWg7NM4",
  "refresh_expires_at": "2026-11-27T13:08:23.993946093Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c81e65cb-c0e9-44e4-a718-aea33bc7d360",
  "session_id": "6cf34866-937f-4ec6-b6a0-b41ec23886c8",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "49be2044-a184-4f29-b2c2-507d57f7a914",
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
  "id": "ec9115a9-8542-44e1-9a8e-e8574be5456a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:13:24.358302Z",
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
  "challenge_id": "9d6b0385-4869-4e7c-9ea6-6bade4283e5e",
  "expires_at": "2026-10-28T13:13:26.554252121Z",
  "resend_available_at": "2026-10-28T13:08:27.554252121Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673747916` → **200**

```json
{
  "phone": "+380673747916",
  "audience": "CLIENT",
  "code": "337301",
  "sent_at": "2026-10-28T13:08:26.556139187Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "b1ebd641-c726-4248-89c9-8ecece78d2dd",
  "challenge_id": "9d6b0385-4869-4e7c-9ea6-6bade4283e5e",
  "otp_code": "337301"
}
```

```json
{
  "client_id": "c81e65cb-c0e9-44e4-a718-aea33bc7d360",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T13:08:26.772083031Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "b6f957e4-de25-4529-96b7-a7b2eaced2f7",
  "quote_id": "ec9115a9-8542-44e1-9a8e-e8574be5456a",
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
  "correlation_id": "b2351a32-5d26-4e23-947e-657336aa46aa"
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
  "session_id": "96b5081a-a49d-4ee1-a0ed-898ce630cea1",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4MDcsImlhdCI6MTc5MzE5MjkwNywianRpIjoiNDMyZDA5ZDQtYmE5YS00M2UyLWE3YmQtYTkwODNmYzI3Zjg0Iiwic2lkIjoiOTZiNTA4MWEtYTQ5ZC00ZWUxLWEwZWQtODk4Y2U2MzBjZWExIn0.Gu3V0RNKIe2_5vt5QG2tyThbIOZ-NIzp7IlMFfhJhjs",
  "access_expires_at": "2026-10-28T13:23:27.359222211Z",
  "refresh_token": "i1Gcgw6ISOZmWcAFZ14y7q_bZHzCLgDKFB4OxPwkHnM",
  "refresh_expires_at": "2026-10-29T01:08:27.358717828Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "c81e65cb-c0e9-44e4-a718-aea33bc7d360",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T13:08:26.772083Z",
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

`POST /api/admin/v1/client-deletions/c81e65cb-c0e9-44e4-a718-aea33bc7d360/complete` → **200**

```json
{
  "command_id": "659f4624-26e3-45db-993f-236a8ccad854",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "c81e65cb-c0e9-44e4-a718-aea33bc7d360",
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
  "correlation_id": "a899ad42-d3cc-44df-9e5d-3396b7b47bd3"
}
```

Done: client c81e65cb-c0e9-44e4-a718-aea33bc7d360 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660399583",
  "device_ref": "sandbox-6093"
}
```

```json
{
  "challenge_id": "776fc8d6-f8bf-460a-b548-b8e64f6013c0",
  "expires_at": "2026-10-28T13:13:28.13013691Z",
  "resend_available_at": "2026-10-28T13:08:29.13013691Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660399583` → **200**

```json
{
  "phone": "+380660399583",
  "audience": "CLIENT",
  "code": "556797",
  "sent_at": "2026-10-28T13:08:28.132314836Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "776fc8d6-f8bf-460a-b548-b8e64f6013c0",
  "code": "556797",
  "device_ref": "sandbox-6093"
}
```

```json
{
  "session_id": "cd6409e6-fa9b-4119-81e3-f5c81cc9d64b",
  "subject": {
    "type": "CLIENT",
    "id": "0f363edb-6c32-4e79-807e-0693f30ce675"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZjM2M2VkYi02YzMyLTRlNzktODA3ZS0wNjkzZjMwY2U2NzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODA4LCJpYXQiOjE3OTMxOTI5MDgsImp0aSI6IjUzNzhmYTNmLWY3YzctNDM0My04Njk0LTdkN2NhZWNkMDQ3ZCIsInNpZCI6ImNkNjQwOWU2LWZhOWItNDExOS04MWUzLWY1YzgxY2M5ZDY0YiJ9.sA8m-zzONNDShuXerignYgh6Mz7J0QMUAq1lYKP-pac",
  "access_expires_at": "2026-10-28T13:23:28.339444234Z",
  "refresh_token": "_R8qzCyEl7KDW9PmlGIrxTykUFGx_MdusuplDS71W_k",
  "refresh_expires_at": "2026-11-27T13:08:28.338963486Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0f363edb-6c32-4e79-807e-0693f30ce675",
  "session_id": "cd6409e6-fa9b-4119-81e3-f5c81cc9d64b",
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
  "session_id": "e3badeba-c637-4337-b681-1819fcf121ea",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4MDgsImlhdCI6MTc5MzE5MjkwOCwianRpIjoiODg4ODg3ODQtOTk5NC00NGQ2LTg5ZTctOGYxOWVkOGNmZTU2Iiwic2lkIjoiZTNiYWRlYmEtYzYzNy00MzM3LWI2ODEtMTgxOWZjZjEyMWVhIn0.ah0caYiV5FpqXChUpFZ1v2B_dZZ4drwM6boFHmkAjjU",
  "access_expires_at": "2026-10-28T13:23:28.912505018Z",
  "refresh_token": "l4Jr73OVNqABKgCDHabIEF60QvFDONhzhViY6Qlgc7o",
  "refresh_expires_at": "2026-10-29T01:08:28.912157472Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0399583&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "0f363edb-6c32-4e79-807e-0693f30ce675",
      "phone": "+380660399583",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T13:08:28.337417Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/0f363edb-6c32-4e79-807e-0693f30ce675` → **200**

```json
{
  "client": {
    "id": "0f363edb-6c32-4e79-807e-0693f30ce675",
    "phone": "+380660399583",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T13:08:28.337417Z",
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

`POST /api/admin/v1/clients/0f363edb-6c32-4e79-807e-0693f30ce675/block` → **400**

```json
{
  "command_id": "3e761bf0-34a7-4b45-b80c-9c218f1fb34b",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/0f363edb-6c32-4e79-807e-0693f30ce675/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "553e9237-a7b4-40e2-9540-c487f52f9957",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/0f363edb-6c32-4e79-807e-0693f30ce675/block` → **200**

```json
{
  "command_id": "cdabb0e1-96ad-4643-bcb3-3c0e12f6404b",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "0f363edb-6c32-4e79-807e-0693f30ce675",
  "phone": "+380660399583",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T13:08:28.337417Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T13:08:29.713942Z",
    "by": "84504c0c-64de-41ea-beaa-6c1f491d5457"
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
  "correlation_id": "ff436f5e-3d15-460b-af07-6ac6f8e6cd3b"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660399583",
  "device_ref": "sandbox-697"
}
```

```json
{
  "challenge_id": "8e4234f0-57f5-4695-8e5d-22b99df089ba",
  "expires_at": "2026-10-28T13:13:32.074836644Z",
  "resend_available_at": "2026-10-28T13:08:33.074836644Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660399583` → **200**

```json
{
  "phone": "+380660399583",
  "audience": "CLIENT",
  "code": "307933",
  "sent_at": "2026-10-28T13:08:32.076577754Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "8e4234f0-57f5-4695-8e5d-22b99df089ba",
  "code": "307933",
  "device_ref": "sandbox-697"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "181df4f0-49c1-4bbd-ac26-f999c77b0b76"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/0f363edb-6c32-4e79-807e-0693f30ce675` → **200**

```json
{
  "client": {
    "id": "0f363edb-6c32-4e79-807e-0693f30ce675",
    "phone": "+380660399583",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T13:08:28.337417Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T13:08:29.713942Z",
      "by": "84504c0c-64de-41ea-beaa-6c1f491d5457"
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

`POST /api/admin/v1/clients/0f363edb-6c32-4e79-807e-0693f30ce675/unblock` → **200**

```json
{
  "command_id": "91e1f60d-3103-4809-9634-f62193b3bc21",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "0f363edb-6c32-4e79-807e-0693f30ce675",
  "phone": "+380660399583",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T13:08:28.337417Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660399583",
  "device_ref": "sandbox-2704"
}
```

```json
{
  "challenge_id": "8a2135d6-ccee-42f0-b90e-fa719a3ced0f",
  "expires_at": "2026-10-28T13:13:34.840252599Z",
  "resend_available_at": "2026-10-28T13:08:35.840252599Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660399583` → **200**

```json
{
  "phone": "+380660399583",
  "audience": "CLIENT",
  "code": "596830",
  "sent_at": "2026-10-28T13:08:34.841800131Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a2135d6-ccee-42f0-b90e-fa719a3ced0f",
  "code": "596830",
  "device_ref": "sandbox-2704"
}
```

```json
{
  "session_id": "2f7ae69c-e364-476c-a86d-aef52e386987",
  "subject": {
    "type": "CLIENT",
    "id": "0f363edb-6c32-4e79-807e-0693f30ce675"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZjM2M2VkYi02YzMyLTRlNzktODA3ZS0wNjkzZjMwY2U2NzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODE1LCJpYXQiOjE3OTMxOTI5MTUsImp0aSI6ImYyMzEyZTg3LTU1NDEtNDkyZS1iMTc0LTdhNWZiNjJkMmQ5ZCIsInNpZCI6IjJmN2FlNjljLWUzNjQtNDc2Yy1hODZkLWFlZjUyZTM4Njk4NyJ9.kDOvDXcM-LMkcpnv6Gdr4f4BDsMYdjiDjDCWUemyk34",
  "access_expires_at": "2026-10-28T13:23:35.040382363Z",
  "refresh_token": "VefuPj-p6UWONX1CQhQs3eoLMZZBWG7x4HW5XQKjlO4",
  "refresh_expires_at": "2026-11-27T13:08:35.039851635Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0f363edb-6c32-4e79-807e-0693f30ce675",
  "session_id": "2f7ae69c-e364-476c-a86d-aef52e386987",
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
  "phone": "+380660854772",
  "device_ref": "sandbox-23450"
}
```

```json
{
  "challenge_id": "65c8f17e-de6e-4adf-86c3-0a5e679e55a9",
  "expires_at": "2026-10-28T13:13:35.398532672Z",
  "resend_available_at": "2026-10-28T13:08:36.398532672Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660854772` → **200**

```json
{
  "phone": "+380660854772",
  "audience": "CLIENT",
  "code": "502430",
  "sent_at": "2026-10-28T13:08:35.400213436Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65c8f17e-de6e-4adf-86c3-0a5e679e55a9",
  "code": "502430",
  "device_ref": "sandbox-23450"
}
```

```json
{
  "session_id": "61e44763-fc6c-40f0-a4ff-60c0f5ea175f",
  "subject": {
    "type": "CLIENT",
    "id": "89c346c1-553a-47bf-9929-9fb093e03cca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWMzNDZjMS01NTNhLTQ3YmYtOTkyOS05ZmIwOTNlMDNjY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODE1LCJpYXQiOjE3OTMxOTI5MTUsImp0aSI6IjQyM2Q1YzE1LTZjZTktNDEwMC1iMjg3LThlZDY0ZmQ4MTgwNSIsInNpZCI6IjYxZTQ0NzYzLWZjNmMtNDBmMC1hNGZmLTYwYzBmNWVhMTc1ZiJ9.RiY55UhKuGmVCMNbV8sJJ1xFPiiEzbrGogdWAY6VZBM",
  "access_expires_at": "2026-10-28T13:23:35.603599722Z",
  "refresh_token": "v59u1w4O7trKD14js3Gnr12Ye2XrJJN5kt0jz_8_nwU",
  "refresh_expires_at": "2026-11-27T13:08:35.603262041Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9414d5d6-8473-410c-a859-062950fae803",
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
  "id": "5bd55987-10c7-4397-a77e-b705049e7b07",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:13:35.790642Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 785affbf-7b27-4c29-a1ff-1f1c018966a1) → **201**

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
  "session_id": "f3a73f57-1fb1-45b7-856a-b765524a269e",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4MTYsImlhdCI6MTc5MzE5MjkxNiwianRpIjoiNTJhOGZkMjItZDhmZi00ZGQwLWI5YmUtODVkYjg0NTUwNDIyIiwic2lkIjoiZjNhNzNmNTctMWZiMS00NWI3LTg1NmEtYjc2NTUyNGEyNjllIn0.9KjKuokcJWTMsY80ZVjXztXcLRsknFH-9vurO4-XlwA",
  "access_expires_at": "2026-10-28T13:23:36.218157732Z",
  "refresh_token": "tLypNXkZc_OCTBGszyb1v1mGEJt34YqqXUBtMIiPLnQ",
  "refresh_expires_at": "2026-10-29T01:08:36.217801603Z",
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
  "session_id": "37b1f95f-9fdb-456f-824a-2c3b894df457",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4MTYsImlhdCI6MTc5MzE5MjkxNiwianRpIjoiMDRmMjcwNzItZjFjOC00MTNmLThiM2UtMjVhZDk1ZWQ3N2FiIiwic2lkIjoiMzdiMWY5NWYtOWZkYi00NTZmLTgyNGEtMmMzYjg5NGRmNDU3In0.vl0rV5qdgKAoJOtDETWqZ0mF8QWgNPvaFrK3cZlsoYw",
  "access_expires_at": "2026-10-28T13:23:36.601104425Z",
  "refresh_token": "EvCbMsHy2xP0mmaASauELktGyo05mcoIz9YCgHPy8mo",
  "refresh_expires_at": "2026-10-29T01:08:36.600726322Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c934e32f-355b-4960-814c-464e0c26f0e7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:08:35.982102Z",
      "actor": {
        "type": "CLIENT",
        "id": "89c346c1-553a-47bf-9929-9fb093e03cca",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c934e32f-355b-4960-814c-464e0c26f0e7",
        "quote_id": "5bd55987-10c7-4397-a77e-b705049e7b07",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "785affbf-7b27-4c29-a1ff-1f1c018966a1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:08:35.983304Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c934e32f-355b-4960-814c-464e0c26f0e7",
        "attempt_id": "fc03d4d8-dfb1-4b68-9629-62d656684bed",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "785affbf-7b27-4c29-a1ff-1f1c018966a1"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T13:08:35.989845Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c934e32f-355b-4960-814c-464e0c26f0e7",
        "attempt_id": "fc03d4d8-dfb1-4b68-9629-62d656684bed"
      },
      "correlation_id": "785affbf-7b27-4c29-a1ff-1f1c018966a1"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "fc03d4d8-dfb1-4b68-9629-62d656684bed",
        "generation": 1,
        "started_at": "2026-10-28T13:08:35.982583Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T13:08:35.989845Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T13:08:35.983941Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/785affbf-7b27-4c29-a1ff-1f1c018966a1` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "c934e32f-355b-4960-814c-464e0c26f0e7:0",
      "order_id": "c934e32f-355b-4960-814c-464e0c26f0e7",
      "at": "2026-10-28T13:08:35.982102Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "c934e32f-355b-4960-814c-464e0c26f0e7:1",
      "order_id": "c934e32f-355b-4960-814c-464e0c26f0e7",
      "at": "2026-10-28T13:08:35.983304Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "c934e32f-355b-4960-814c-464e0c26f0e7:2",
      "order_id": "c934e32f-355b-4960-814c-464e0c26f0e7",
      "at": "2026-10-28T13:08:35.989845Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/d6511cdc-4a5c-4c2d-b915-033b21e3eb8d` → **200**

```json
{
  "found": []
}
```

Done: request 785affbf-7b27-4c29-a1ff-1f1c018966a1 — order c934e32f-355b-4960-814c-464e0c26f0e7 found by its id.

`GET /api/rider/v1/orders/c934e32f-355b-4960-814c-464e0c26f0e7` → **200**

```json
{
  "id": "c934e32f-355b-4960-814c-464e0c26f0e7",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89c346c1-553a-47bf-9929-9fb093e03cca",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:08:35.981706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c934e32f-355b-4960-814c-464e0c26f0e7/cancel` → **200**

```json
{
  "command_id": "e88b1a37-d8f1-4c64-bb82-0adc7ad999c0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c934e32f-355b-4960-814c-464e0c26f0e7",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "89c346c1-553a-47bf-9929-9fb093e03cca",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:08:35.981706Z",
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
  "phone": "+380637338078",
  "device_ref": "sandbox-14335"
}
```

```json
{
  "challenge_id": "023868a8-5afb-4484-8dd6-bfe3dd666d78",
  "expires_at": "2026-10-28T13:13:37.778673091Z",
  "resend_available_at": "2026-10-28T13:08:38.778673091Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637338078` → **200**

```json
{
  "phone": "+380637338078",
  "audience": "CLIENT",
  "code": "519803",
  "sent_at": "2026-10-28T13:08:37.780667328Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "023868a8-5afb-4484-8dd6-bfe3dd666d78",
  "code": "519803",
  "device_ref": "sandbox-14335"
}
```

```json
{
  "session_id": "8b5cf9aa-be3a-423b-be0f-2a220f00b061",
  "subject": {
    "type": "CLIENT",
    "id": "0e61e02e-468c-4e0f-8639-3e140b12881d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZTYxZTAyZS00NjhjLTRlMGYtODYzOS0zZTE0MGIxMjg4MWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODE3LCJpYXQiOjE3OTMxOTI5MTcsImp0aSI6ImFiNzU0ZGIyLTAwN2YtNDc3Mi05NzM0LTA0MmY1ZTI2OTllMSIsInNpZCI6IjhiNWNmOWFhLWJlM2EtNDIzYi1iZTBmLTJhMjIwZjAwYjA2MSJ9.ucYy21LaSSUWQh7BF2PW_4hDNL4lo4uE8fXvPMUFT4o",
  "access_expires_at": "2026-10-28T13:23:37.980460397Z",
  "refresh_token": "htklQTuGxdaiQ5TvnqKXVAdAlqM9HZAYTnKiqCHTDdg",
  "refresh_expires_at": "2026-11-27T13:08:37.980055985Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "b50d5044-bea1-4689-8346-ee6fb9ec743e",
  "expires_at": "2026-10-28T13:13:40.165865244Z",
  "resend_available_at": "2026-10-28T13:08:41.165865244Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637338078` → **200**

```json
{
  "phone": "+380637338078",
  "audience": "CLIENT",
  "code": "675860",
  "sent_at": "2026-10-28T13:08:40.167237581Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "24f92201-0de1-4992-8a20-0116f7562ddc",
  "challenge_id": "b50d5044-bea1-4689-8346-ee6fb9ec743e",
  "otp_code": "675860"
}
```

```json
{
  "id": "b9075760-db90-4a61-89df-1e9ae929f71b",
  "state": "PENDING",
  "created_at": "2026-10-28T13:08:40.363207Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/b9075760-db90-4a61-89df-1e9ae929f71b` → **200**

```json
{
  "id": "b9075760-db90-4a61-89df-1e9ae929f71b",
  "state": "PENDING",
  "created_at": "2026-10-28T13:08:40.363207Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b9075760-db90-4a61-89df-1e9ae929f71b` → **200**

```json
{
  "id": "b9075760-db90-4a61-89df-1e9ae929f71b",
  "state": "PENDING",
  "created_at": "2026-10-28T13:08:40.363207Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b9075760-db90-4a61-89df-1e9ae929f71b` → **200**

```json
{
  "id": "b9075760-db90-4a61-89df-1e9ae929f71b",
  "state": "PENDING",
  "created_at": "2026-10-28T13:08:40.363207Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b9075760-db90-4a61-89df-1e9ae929f71b` → **200**

```json
{
  "id": "b9075760-db90-4a61-89df-1e9ae929f71b",
  "state": "PENDING",
  "created_at": "2026-10-28T13:08:40.363207Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b9075760-db90-4a61-89df-1e9ae929f71b` → **200**

```json
{
  "id": "b9075760-db90-4a61-89df-1e9ae929f71b",
  "state": "PENDING",
  "created_at": "2026-10-28T13:08:40.363207Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b9075760-db90-4a61-89df-1e9ae929f71b` → **200**

```json
{
  "id": "b9075760-db90-4a61-89df-1e9ae929f71b",
  "state": "PENDING",
  "created_at": "2026-10-28T13:08:40.363207Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b9075760-db90-4a61-89df-1e9ae929f71b` → **200**

```json
{
  "id": "b9075760-db90-4a61-89df-1e9ae929f71b",
  "state": "PENDING",
  "created_at": "2026-10-28T13:08:40.363207Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b9075760-db90-4a61-89df-1e9ae929f71b` → **200**

```json
{
  "id": "b9075760-db90-4a61-89df-1e9ae929f71b",
  "state": "READY",
  "created_at": "2026-10-28T13:08:40.363207Z",
  "ready_at": "2026-10-28T13:08:48.207319Z",
  "expires_at": "2026-11-04T13:08:48.207319Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/b9075760-db90-4a61-89df-1e9ae929f71b/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631059022",
  "device_ref": "sandbox-13030"
}
```

```json
{
  "challenge_id": "24074900-47a1-4410-a687-efde98003963",
  "expires_at": "2026-10-28T13:13:48.987126411Z",
  "resend_available_at": "2026-10-28T13:08:49.987126411Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631059022` → **200**

```json
{
  "phone": "+380631059022",
  "audience": "CLIENT",
  "code": "867214",
  "sent_at": "2026-10-28T13:08:48.989193646Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24074900-47a1-4410-a687-efde98003963",
  "code": "867214",
  "device_ref": "sandbox-13030"
}
```

```json
{
  "session_id": "d4a45aa0-2257-4501-971c-bc7a771e536f",
  "subject": {
    "type": "CLIENT",
    "id": "0e47aa03-f865-45e7-9fd4-ed7db57c687b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZTQ3YWEwMy1mODY1LTQ1ZTctOWZkNC1lZDdkYjU3YzY4N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODI5LCJpYXQiOjE3OTMxOTI5MjksImp0aSI6IjIxNTk3MzAzLTU1YzEtNDM1ZS1iOWJlLTU2M2NjMzk1YzVlMyIsInNpZCI6ImQ0YTQ1YWEwLTIyNTctNDUwMS05NzFjLWJjN2E3NzFlNTM2ZiJ9.IxvTVCjBu6-S5SymZ_3is2PLz86QhlsOdf2AUBH9osw",
  "access_expires_at": "2026-10-28T13:23:49.184194914Z",
  "refresh_token": "LL0R9jFo8d3k1jHL--86xuDmaQtpqjajGurE2VBfZRU",
  "refresh_expires_at": "2026-11-27T13:08:49.183842521Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/b9075760-db90-4a61-89df-1e9ae929f71b/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/b9075760-db90-4a61-89df-1e9ae929f71b/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ca594198-0364-4bf1-8b21-e00e312c2694"
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
  "session_id": "aae17b6f-640f-4b04-aec9-e9bd6a5e1deb",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4MjksImlhdCI6MTc5MzE5MjkyOSwianRpIjoiNTIyMWU0MjQtZTk0Zi00NTVhLTliYjYtMTA3Y2E5OTgwMzJhIiwic2lkIjoiYWFlMTdiNmYtNjQwZi00YjA0LWFlYzktZTliZDZhNWUxZGViIn0.m0reVuwqLn54Pc9C22nc2iFB2EQRLtRnTiidjAnh5Xw",
  "access_expires_at": "2026-10-28T13:23:49.771145268Z",
  "refresh_token": "FeBYmtzhwtbVXfJJSUc9a1MoxJeuu4avBMrKVso9YxQ",
  "refresh_expires_at": "2026-10-29T01:08:49.770706149Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0e61e02e-468c-4e0f-8639-3e140b12881d",
  "session_id": "8b5cf9aa-be3a-423b-be0f-2a220f00b061",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/0e61e02e-468c-4e0f-8639-3e140b12881d/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "b9075760-db90-4a61-89df-1e9ae929f71b",
      "state": "READY",
      "created_at": "2026-10-28T13:08:40.363207Z",
      "ready_at": "2026-10-28T13:08:48.207319Z",
      "expires_at": "2026-11-04T13:08:48.207319Z",
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
  "device_ref": "sandbox-1122"
}
```

```json
{
  "challenge_id": "eeb0aee0-e3ba-4787-b357-3e45455d2706",
  "expires_at": "2026-10-28T13:13:50.293121642Z",
  "resend_available_at": "2026-10-28T13:08:51.293121642Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "387697",
  "sent_at": "2026-10-28T13:08:50.295250231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eeb0aee0-e3ba-4787-b357-3e45455d2706",
  "code": "387697",
  "device_ref": "sandbox-1122"
}
```

```json
{
  "session_id": "243b6c4f-0288-41d9-a88f-902437f6c5b6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzgzMCwiaWF0IjoxNzkzMTkyOTMwLCJqdGkiOiJhNjhiZjU4My0yMzQ4LTQ4ODUtYThlOS00ZjJlOTcxYjYxMGMiLCJzaWQiOiIyNDNiNmM0Zi0wMjg4LTQxZDktYTg4Zi05MDI0MzdmNmM1YjYifQ.R1jwlwF4PsNUAPF2u9omdZOYwGlI1k28vEVeLprtlig",
  "access_expires_at": "2026-10-28T13:23:50.491556922Z",
  "refresh_token": "JlRUMPpbi7NjkyOx7qrnEMVmRr-ZIxSiHd07I9dF2kY",
  "refresh_expires_at": "2026-11-27T13:08:50.491084918Z",
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
  "device_ref": "sandbox-20190"
}
```

```json
{
  "challenge_id": "53caf9ff-00b4-4743-a5b7-1d5a3de4a689",
  "expires_at": "2026-10-28T13:13:50.836415905Z",
  "resend_available_at": "2026-10-28T13:08:51.836415905Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "188454",
  "sent_at": "2026-10-28T13:08:50.838208185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53caf9ff-00b4-4743-a5b7-1d5a3de4a689",
  "code": "188454",
  "device_ref": "sandbox-20190"
}
```

```json
{
  "session_id": "b39f4909-ba4e-46a8-b0ac-4e33401f5d8e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzgzMSwiaWF0IjoxNzkzMTkyOTMxLCJqdGkiOiJhNTAzYzFhOS03YTdiLTRmOTgtODRlOS1kMGJmM2Y1ZGQzMGYiLCJzaWQiOiJiMzlmNDkwOS1iYTRlLTQ2YTgtYjBhYy00ZTMzNDAxZjVkOGUifQ.PISG7EmBDxm_puBKeiT72mgI3cvLLVCsEudfgd6IH2E",
  "access_expires_at": "2026-10-28T13:23:51.040532491Z",
  "refresh_token": "l06JB0r1bb4GB_Wbqp5ajl9UWOM1xMmTYZGR-U1ryc4",
  "refresh_expires_at": "2026-11-27T13:08:51.039933696Z",
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
  "command_id": "7d246f70-4902-454f-8a99-ff2b8cbda627",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:08:51Z",
    "sequence": 1793192931388
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cf21d08-e34e-4ae3-a02c-6006602051bf",
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
  "last_heartbeat_at": "2026-10-28T13:08:51.404191Z",
  "last_location_at": "2026-10-28T13:08:51.404191Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-27100"
}
```

```json
{
  "challenge_id": "c1c070d1-eabf-4c8c-84cb-5842cf4386a3",
  "expires_at": "2026-10-28T13:13:51.587973454Z",
  "resend_available_at": "2026-10-28T13:08:52.587973454Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "811044",
  "sent_at": "2026-10-28T13:08:51.58997218Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1c070d1-eabf-4c8c-84cb-5842cf4386a3",
  "code": "811044",
  "device_ref": "sandbox-27100"
}
```

```json
{
  "session_id": "e2fef8fc-872a-44be-88e9-1361a640efb1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzgzMSwiaWF0IjoxNzkzMTkyOTMxLCJqdGkiOiJiNDBhZDZjNy1jMDNjLTQzNmUtYWExNC0wNjQzYzdjM2QwNjUiLCJzaWQiOiJlMmZlZjhmYy04NzJhLTQ0YmUtODhlOS0xMzYxYTY0MGVmYjEifQ.g5_X2crMKAHOiqzN9xfURhS1FCHr3LIykGbb82waKlM",
  "access_expires_at": "2026-10-28T13:23:51.796866703Z",
  "refresh_token": "gXdy4ktx0cK92POl1cUzpd1y0FXhLwBSTTbYgwkXhMs",
  "refresh_expires_at": "2026-11-27T13:08:51.796450998Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c4fd4569-9825-4834-ad2d-873c70587906",
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
  "last_heartbeat_at": "2026-10-28T13:08:00.939764Z",
  "last_location_at": "2026-10-28T13:08:00.939764Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c4fd4569-9825-4834-ad2d-873c70587906/handover` → **200**

```json
{
  "command_id": "b2e33095-f5c0-4bb5-a313-4bfdc32c72c7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c4fd4569-9825-4834-ad2d-873c70587906",
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
  "last_heartbeat_at": "2026-10-28T13:08:00.939764Z",
  "last_location_at": "2026-10-28T13:08:00.939764Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c4fd4569-9825-4834-ad2d-873c70587906/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:08:52Z",
    "sequence": 1793192932346
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c4fd4569-9825-4834-ad2d-873c70587906",
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
  "last_heartbeat_at": "2026-10-28T13:08:52.36261Z",
  "last_location_at": "2026-10-28T13:08:52.36261Z",
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
  "session_id": "5f082920-75b5-4433-b268-ca1277c956c9",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4MzIsImlhdCI6MTc5MzE5MjkzMiwianRpIjoiYTZkOGE0YTktZjBjZi00OGI0LWI1YTUtYThjMGY5OWM0MGMxIiwic2lkIjoiNWYwODI5MjAtNzViNS00NDMzLWIyNjgtY2ExMjc3Yzk1NmM5In0.YgGRUzUiHhvFnnuPlGWuxTpTP1Ysv8Fs9hn2trh2A50",
  "access_expires_at": "2026-10-28T13:23:52.74943396Z",
  "refresh_token": "xiMoE3DNjhia8cpJrw7NYcEp5BWC6y3lD-o445fzEug",
  "refresh_expires_at": "2026-10-29T01:08:52.749093265Z",
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
  "session_id": "c2469325-6e24-43bf-87bf-8673f3cec81e",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4MzMsImlhdCI6MTc5MzE5MjkzMywianRpIjoiYzI3OTY5MTEtZDVhYi00ZTEyLWEwZmEtYWZkMmE3NDY3MDlhIiwic2lkIjoiYzI0NjkzMjUtNmUyNC00M2JmLTg3YmYtODY3M2YzY2VjODFlIn0.vEFGXYYGxjqpD5reweuVL-fViXTl1OUhFtefEefWGAw",
  "access_expires_at": "2026-10-28T13:23:53.134331564Z",
  "refresh_token": "OQ5Zxh4f_RA8QHRSYboq_VOGsTH0EAB7Pk2t2nFeems",
  "refresh_expires_at": "2026-10-29T01:08:53.133843936Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380685215163",
  "device_ref": "sandbox-15248"
}
```

```json
{
  "challenge_id": "a9f385bb-ff06-4e03-ba28-db24f491ab53",
  "expires_at": "2026-10-28T13:13:53.35167606Z",
  "resend_available_at": "2026-10-28T13:08:54.35167606Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380685215163` → **200**

```json
{
  "phone": "+380685215163",
  "audience": "CLIENT",
  "code": "066703",
  "sent_at": "2026-10-28T13:08:53.353743599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9f385bb-ff06-4e03-ba28-db24f491ab53",
  "code": "066703",
  "device_ref": "sandbox-15248"
}
```

```json
{
  "session_id": "026e690e-5ebd-462e-9c30-8eb0172d7c40",
  "subject": {
    "type": "CLIENT",
    "id": "4796aedc-8240-4b5c-81b6-d88363c447be"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Nzk2YWVkYy04MjQwLTRiNWMtODFiNi1kODgzNjNjNDQ3YmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODMzLCJpYXQiOjE3OTMxOTI5MzMsImp0aSI6ImQyOTNmMDUwLTZlN2ItNDNjOS1hNTI2LTY4NzY1YWFhYzQ1YiIsInNpZCI6IjAyNmU2OTBlLTVlYmQtNDYyZS05YzMwLThlYjAxNzJkN2M0MCJ9.qAP6h4lQOU4B3bSLxrIsgCuH7YaJ0Qt3E_lzhERBhT0",
  "access_expires_at": "2026-10-28T13:23:53.55229552Z",
  "refresh_token": "ZqQD1Tp6UN-4oJJ5Ez3EC6PCbX7rcpx97eqnkaP3EgE",
  "refresh_expires_at": "2026-11-27T13:08:53.551948776Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6b76e6a3-e7ea-4c2d-b46f-9d0ce71c86c9",
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
  "id": "a183b3f2-1704-493f-ae42-dcc828195440",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:13:53.734249Z",
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
  "command_id": "336dc275-154e-415c-942d-4ae03ed81b6b",
  "quote_id": "a183b3f2-1704-493f-ae42-dcc828195440",
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
  "id": "9aee057b-225e-44b6-9730-dd53c6967d1b",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4796aedc-8240-4b5c-81b6-d88363c447be",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:08:53.925113Z",
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
    "id": "ac53ed4b-ae25-4242-b997-894bf489f359",
    "order_id": "9aee057b-225e-44b6-9730-dd53c6967d1b",
    "expires_at": "2026-10-28T13:09:08.92754Z",
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

`POST /api/driver/v1/offers/ac53ed4b-ae25-4242-b997-894bf489f359/reject` → **204**

```json
{
  "command_id": "10ec59c3-fad6-4292-a112-df9bcdf20665"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "cbb324c2-7a4e-4829-88a2-8e67113ff052",
    "order_id": "9aee057b-225e-44b6-9730-dd53c6967d1b",
    "expires_at": "2026-10-28T13:09:09.298599Z",
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

`POST /api/driver/v1/offers/cbb324c2-7a4e-4829-88a2-8e67113ff052/accept` → **200**

```json
{
  "command_id": "38704ee6-4b73-4a09-8f57-1545b4d7bee7"
}
```

```json
{
  "id": "60e0e629-2803-475a-a307-a3ddcd9536ac",
  "order_id": "9aee057b-225e-44b6-9730-dd53c6967d1b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0de83303-d1c6-4172-b4c8-ca8d8725d450",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/9aee057b-225e-44b6-9730-dd53c6967d1b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:08:53.925504Z",
      "actor": {
        "type": "CLIENT",
        "id": "4796aedc-8240-4b5c-81b6-d88363c447be",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9aee057b-225e-44b6-9730-dd53c6967d1b",
        "quote_id": "a183b3f2-1704-493f-ae42-dcc828195440",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "91b26b8b-3d04-4e25-82dd-533c679eebb1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:08:53.926862Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9aee057b-225e-44b6-9730-dd53c6967d1b",
        "attempt_id": "9fa936c2-cbc0-4de4-b543-39880d6215ea",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "91b26b8b-3d04-4e25-82dd-533c679eebb1"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:08:53.931413Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ac53ed4b-ae25-4242-b997-894bf489f359",
        "order_id": "9aee057b-225e-44b6-9730-dd53c6967d1b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "91b26b8b-3d04-4e25-82dd-533c679eebb1"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T13:08:54.29758Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ac53ed4b-ae25-4242-b997-894bf489f359",
        "order_id": "9aee057b-225e-44b6-9730-dd53c6967d1b"
      },
      "correlation_id": "811b41ef-1b2e-4b8f-87fd-5179d2c88c12"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 9aee057b-225e-44b6-9730-dd53c6967d1b — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/9aee057b-225e-44b6-9730-dd53c6967d1b` → **200**

```json
{
  "id": "9aee057b-225e-44b6-9730-dd53c6967d1b",
  "short_number": 7,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4796aedc-8240-4b5c-81b6-d88363c447be",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "60e0e629-2803-475a-a307-a3ddcd9536ac",
    "order_id": "9aee057b-225e-44b6-9730-dd53c6967d1b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0de83303-d1c6-4172-b4c8-ca8d8725d450",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T13:08:53.925113Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9aee057b-225e-44b6-9730-dd53c6967d1b/cancel` → **200**

```json
{
  "command_id": "4bb2883a-72d3-4f12-9f00-4dfb7d8b7096",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9aee057b-225e-44b6-9730-dd53c6967d1b",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "4796aedc-8240-4b5c-81b6-d88363c447be",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "60e0e629-2803-475a-a307-a3ddcd9536ac",
    "order_id": "9aee057b-225e-44b6-9730-dd53c6967d1b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "0de83303-d1c6-4172-b4c8-ca8d8725d450",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:08:53.925113Z",
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
  "session_id": "0cf21d08-e34e-4ae3-a02c-6006602051bf",
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
  "last_heartbeat_at": "2026-10-28T13:08:51.404191Z",
  "last_location_at": "2026-10-28T13:08:51.404191Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0cf21d08-e34e-4ae3-a02c-6006602051bf/close` → **200**

```json
{
  "command_id": "26dadaae-2a46-4606-8405-5523f4571f23",
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
  "session_id": "c4fd4569-9825-4834-ad2d-873c70587906",
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
  "last_heartbeat_at": "2026-10-28T13:08:52.36261Z",
  "last_location_at": "2026-10-28T13:08:52.36261Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c4fd4569-9825-4834-ad2d-873c70587906/close` → **200**

```json
{
  "command_id": "e18a68d1-4e6c-4714-aa93-71c5640a07f4",
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
  "device_ref": "sandbox-14900"
}
```

```json
{
  "challenge_id": "407f62fe-a2a7-457c-b01b-47412fdfb2b8",
  "expires_at": "2026-10-28T13:13:56.229175812Z",
  "resend_available_at": "2026-10-28T13:08:57.229175812Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "696577",
  "sent_at": "2026-10-28T13:08:56.230976347Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "407f62fe-a2a7-457c-b01b-47412fdfb2b8",
  "code": "696577",
  "device_ref": "sandbox-14900"
}
```

```json
{
  "session_id": "6aafb84d-e9c4-43fe-94ff-325f923d1f2f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzgzNiwiaWF0IjoxNzkzMTkyOTM2LCJqdGkiOiI4ZTY5OTIxOS1jY2M5LTQ2ZWUtYTU5ZC02MGQ0YzFlMmRjNDUiLCJzaWQiOiI2YWFmYjg0ZC1lOWM0LTQzZmUtOTRmZi0zMjVmOTIzZDFmMmYifQ.QIw-xWffW25TTf8ffe7U6s0NBC9csF1TXcSdufVNqqk",
  "access_expires_at": "2026-10-28T13:23:56.431426984Z",
  "refresh_token": "SjkBxjbzZKAkA4ETVNWvOJ_e1Q3dAJw5r80gL-cSL5E",
  "refresh_expires_at": "2026-11-27T13:08:56.430946237Z",
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
  "command_id": "5b0f8a6c-432f-4651-96c8-3a06fd4f5e7c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:08:56Z",
    "sequence": 1793192936780
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:08:56.795643Z",
  "last_location_at": "2026-10-28T13:08:56.795643Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677008675",
  "device_ref": "sandbox-23418"
}
```

```json
{
  "challenge_id": "24b90adc-2f8b-443c-ac71-647d5733527d",
  "expires_at": "2026-10-28T13:13:56.976585336Z",
  "resend_available_at": "2026-10-28T13:08:57.976585336Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677008675` → **200**

```json
{
  "phone": "+380677008675",
  "audience": "CLIENT",
  "code": "215797",
  "sent_at": "2026-10-28T13:08:56.978301623Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24b90adc-2f8b-443c-ac71-647d5733527d",
  "code": "215797",
  "device_ref": "sandbox-23418"
}
```

```json
{
  "session_id": "b6f8e88e-82be-4486-a467-90cf91e8c2af",
  "subject": {
    "type": "CLIENT",
    "id": "5acd8365-3a1e-45fa-a4df-df9f6d9737e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWNkODM2NS0zYTFlLTQ1ZmEtYTRkZi1kZjlmNmQ5NzM3ZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODM3LCJpYXQiOjE3OTMxOTI5MzcsImp0aSI6IjJkZmQzZTljLWE4ZGYtNDdkNC1hNTRkLTdmZWVjNWQ0NzEyNyIsInNpZCI6ImI2ZjhlODhlLTgyYmUtNDQ4Ni1hNDY3LTkwY2Y5MWU4YzJhZiJ9.3NQzzozuOmEAl1DiXEGdYkfJDFEibIUpcZVPzk3DjLQ",
  "access_expires_at": "2026-10-28T13:23:57.175461511Z",
  "refresh_token": "iD4WK1XI-XfQNCTJzWWJqyKF0a8YmrR_6wTDn9Da2uo",
  "refresh_expires_at": "2026-11-27T13:08:57.17508414Z",
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
  "command_id": "d6dadde6-1671-46e7-aee0-e330440f6c3f",
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
  "id": "8e4fdac9-5b52-4854-8b39-a75a93e23e6a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:13:57.542259Z",
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
  "command_id": "ffa53aef-b6b5-45b9-ae0e-6310e1eea707",
  "platform": "ANDROID",
  "token": "sandbox-driver-fe236069-0393-45dd-a0e8-c6afc9c18d83"
}
```

```json
{
  "id": "851a2a8e-c9d4-4656-aa46-21dd68278f99",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T13:08:57.732059Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "4317e82d-7516-4526-a46e-b8a5238ef2b3",
  "platform": "ANDROID",
  "token": "sandbox-rider-162acbd1-164c-4184-be72-0a63d97fc86a"
}
```

```json
{
  "id": "6d94a381-28eb-4b36-801e-fc67f4482edf",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T13:08:57.918197Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4171da93-c692-4cdf-b900-f2dd29128c7c",
  "quote_id": "8e4fdac9-5b52-4854-8b39-a75a93e23e6a",
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
  "id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5acd8365-3a1e-45fa-a4df-df9f6d9737e3",
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
  "created_at": "2026-10-28T13:08:58.10651Z",
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
    "id": "50908f85-c6b8-4e43-a31b-f14955917c5e",
    "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
    "expires_at": "2026-10-28T13:09:13.108862Z",
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

`POST /api/driver/v1/offers/50908f85-c6b8-4e43-a31b-f14955917c5e/accept` → **200**

```json
{
  "command_id": "f4bc92d0-0f45-45b1-aa8c-4585978ef615"
}
```

```json
{
  "id": "78d28dbd-d81f-456e-ae43-a78f2db2974e",
  "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "34ca1c0a-bbc6-4f7d-944e-c466af859759",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T13:08:58.861Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T13:08:58.861Z` → **200**

```json
[
  {
    "at": "2026-10-28T13:08:59.477612218Z",
    "token_suffix": "c18d83",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
      "order_version": "2",
      "event_id": "2d93bc05-3df3-4a6a-ae06-2101d371a1e4",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677008675&after=2026-10-28T13:08:58.861Z` → **200**

```json
[
  {
    "at": "2026-10-28T13:08:59.479319092Z",
    "token_suffix": "7fc86a",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
      "order_version": "3",
      "event_id": "f70d822a-177a-4f85-aa82-376e54ed160e",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/7975c0ec-d50a-4faf-8f8c-eba6ea1aea76/messages` → **201**

```json
{
  "command_id": "2528e077-a99b-45e6-8d7e-0cfefc18cd0c",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "8aeeea36-12fb-4bb5-9369-89faeb907745",
  "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T13:08:59.750250248Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "34ca1c0a-bbc6-4f7d-944e-c466af859759",
  "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
  "assignment_id": "78d28dbd-d81f-456e-ae43-a78f2db2974e",
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

`POST /api/driver/v1/trips/34ca1c0a-bbc6-4f7d-944e-c466af859759/messages` → **201**

```json
{
  "command_id": "8e7fa875-f2db-48bd-b969-5781eff5c355",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a44586f6-b848-46d6-9cbf-ef16e727a2c3",
  "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T13:09:00.105334186Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/7975c0ec-d50a-4faf-8f8c-eba6ea1aea76/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/34ca1c0a-bbc6-4f7d-944e-c466af859759/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677008675"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/44da49c1-d92f-4c66-a99a-6069c1d6f4ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:09:00Z",
    "sequence": 1793192940639
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:09:00.656301Z",
  "last_location_at": "2026-10-28T13:09:00.656301Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "34ca1c0a-bbc6-4f7d-944e-c466af859759",
  "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
  "assignment_id": "78d28dbd-d81f-456e-ae43-a78f2db2974e",
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

`POST /api/driver/v1/trips/34ca1c0a-bbc6-4f7d-944e-c466af859759/arrive` → **200**

```json
{
  "command_id": "4f6a58cd-28cf-4e96-a63c-20e0a38c0973",
  "expected_version": 0
}
```

```json
{
  "id": "34ca1c0a-bbc6-4f7d-944e-c466af859759",
  "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
  "assignment_id": "78d28dbd-d81f-456e-ae43-a78f2db2974e",
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
  "arrived_at": "2026-10-28T13:09:01.00878Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/34ca1c0a-bbc6-4f7d-944e-c466af859759/start` → **200**

```json
{
  "command_id": "1e282d53-0b98-4524-a29c-10531ee7f183",
  "expected_version": 1
}
```

```json
{
  "id": "34ca1c0a-bbc6-4f7d-944e-c466af859759",
  "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
  "assignment_id": "78d28dbd-d81f-456e-ae43-a78f2db2974e",
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
  "arrived_at": "2026-10-28T13:09:01.00878Z",
  "started_at": "2026-10-28T13:09:01.195503Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/44da49c1-d92f-4c66-a99a-6069c1d6f4ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:09:01Z",
    "sequence": 1793192941375
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:09:01.391571Z",
  "last_location_at": "2026-10-28T13:09:01.391571Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/34ca1c0a-bbc6-4f7d-944e-c466af859759/complete` → **200**

```json
{
  "command_id": "a03a5eb8-0ce5-4359-a36e-4b71b8358909",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:09:01Z",
  "cash_received": true
}
```

```json
{
  "id": "34ca1c0a-bbc6-4f7d-944e-c466af859759",
  "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
  "assignment_id": "78d28dbd-d81f-456e-ae43-a78f2db2974e",
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
  "arrived_at": "2026-10-28T13:09:01.00878Z",
  "started_at": "2026-10-28T13:09:01.195503Z",
  "completed_at": "2026-10-28T13:09:01.577138Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/7975c0ec-d50a-4faf-8f8c-eba6ea1aea76` → **200**

```json
{
  "id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5acd8365-3a1e-45fa-a4df-df9f6d9737e3",
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
    "id": "78d28dbd-d81f-456e-ae43-a78f2db2974e",
    "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "34ca1c0a-bbc6-4f7d-944e-c466af859759",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:08:58.10651Z",
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
    "id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
    "short_number": 8,
    "status": "FULFILLED",
    "created_at": "2026-10-28T13:08:58.10651Z",
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
    "id": "34ca1c0a-bbc6-4f7d-944e-c466af859759",
    "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
    "order_short_number": 8,
    "created_at": "2026-10-28T13:08:58.484862Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e5cbff38-b15a-4189-9cfc-bc2548809954",
    "order_id": "59f307a0-864a-4740-80f8-9c9274a5c482",
    "order_short_number": 2,
    "created_at": "2026-10-28T13:07:52.021852Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6172ebd1-f536-4a04-9cdd-eae41ac19a82",
    "order_id": "05da7461-c118-4f2e-b547-ca706b27b187",
    "order_short_number": 1,
    "created_at": "2026-10-28T13:07:31.715305Z",
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

`GET /api/rider/v1/orders/7975c0ec-d50a-4faf-8f8c-eba6ea1aea76/tip` → **200**

```json
{
  "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
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
  "available_until": "2026-10-29T13:09:01.577138Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/7975c0ec-d50a-4faf-8f8c-eba6ea1aea76/tip` → **201**

```json
{
  "command_id": "6673aa1f-8943-40bc-8554-94dad0db9198",
  "amount_minor": 1100
}
```

```json
{
  "id": "17b60f82-6ea6-40d3-a8dd-1c5b089aced9",
  "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T13:09:05.862284Z"
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
  "session_id": "f2cfc1cf-7103-45ac-b2ad-36405a46a871",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4NDYsImlhdCI6MTc5MzE5Mjk0NiwianRpIjoiZDRmMWY2YzQtOWY1ZS00YWQ0LTk5ZjUtNzQ2MjI3Y2VkNDI1Iiwic2lkIjoiZjJjZmMxY2YtNzEwMy00NWFjLWIyYWQtMzY0MDVhNDZhODcxIn0.HYpCdnO4SsXrZYEBZZ4GM_lLYK4NGGuZP4LBQHTFv_Y",
  "access_expires_at": "2026-10-28T13:24:06.255360154Z",
  "refresh_token": "rqIH6xCWQAAgXtQbnziWuq0b7FkfAWBOIzgDH8RGkFQ",
  "refresh_expires_at": "2026-10-29T01:09:06.25492797Z",
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
        "created": 8,
        "fulfilled": 4,
        "cancelled": 4,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 7,
          "PHONE": 1
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 7
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
    "created": 8,
    "fulfilled": 4,
    "cancelled": 4,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 7,
      "PHONE": 1
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 7
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
  "generated_at": "2026-10-28T13:09:06.44273405Z"
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
        "trips": 4,
        "fares_minor": 47848,
        "service_rides_minor": 0,
        "commission_minor": 7179,
        "driver_share_minor": 40669,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 2000,
        "collected_by_drivers_minor": 28499,
        "tips_minor": 2500,
        "rider_debt_change_minor": 0
      }
    }
  ],
  "total": {
    "trips": 4,
    "fares_minor": 47848,
    "service_rides_minor": 0,
    "commission_minor": 7179,
    "driver_share_minor": 40669,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 2000,
    "collected_by_drivers_minor": 28499,
    "tips_minor": 2500,
    "rider_debt_change_minor": 0
  },
  "generated_at": "2026-10-28T13:09:06.623435323Z"
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
  "session_id": "467f6ffe-3d57-4eae-b604-22a89644a93c",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4NDcsImlhdCI6MTc5MzE5Mjk0NywianRpIjoiNjlkNTE1MDYtMWQwMi00ZmU3LTljYzktYmNjZTJhNzlkZTdhIiwic2lkIjoiNDY3ZjZmZmUtM2Q1Ny00ZWFlLWI2MDQtMjJhODk2NDRhOTNjIn0.n0p7Z8zpIpOzKl5aJsN3MThtU68po7n8IQZysgSkHCc",
  "access_expires_at": "2026-10-28T13:24:07.019472656Z",
  "refresh_token": "HBqIdTfdCK11ZwvDTF07LAPpX3y55mQVarncKvlcj-s",
  "refresh_expires_at": "2026-10-29T01:09:07.019057884Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7975c0ec-d50a-4faf-8f8c-eba6ea1aea76/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:08:58.1069Z",
      "actor": {
        "type": "CLIENT",
        "id": "5acd8365-3a1e-45fa-a4df-df9f6d9737e3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
        "quote_id": "8e4fdac9-5b52-4854-8b39-a75a93e23e6a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e1fa3a8b-f511-47df-9d39-6ab5928e91f7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:08:58.108311Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
        "attempt_id": "d984059f-d2a6-4a99-851e-e22a1545c77f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e1fa3a8b-f511-47df-9d39-6ab5928e91f7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:08:58.110923Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "50908f85-c6b8-4e43-a31b-f14955917c5e",
        "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "e1fa3a8b-f511-47df-9d39-6ab5928e91f7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:08:58.485743Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "50908f85-c6b8-4e43-a31b-f14955917c5e",
        "order_id": "7975c0ec-d50a-4faf-8f8c-eba6ea1aea76",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "78d28dbd-d81f-456e-ae43-a78f2db2974e"
      },
      "correlation_id": "767294f6-307d-4132-baeb-4804c04fa888"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T13:09:07.392417279Z",
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
      "last_location_at": "2026-10-28T13:09:01.391571Z",
      "order_id": null
    }
  ]
}
```

Done: order 7975c0ec-d50a-4faf-8f8c-eba6ea1aea76.

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
  "session_id": "ad425ea6-6779-4cb0-ad12-24f4c17d052f",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4NDcsImlhdCI6MTc5MzE5Mjk0NywianRpIjoiNGMwZTUxNzctOGQzMS00NGU1LWEwM2YtMGIwODFiOGQ1YzczIiwic2lkIjoiYWQ0MjVlYTYtNjc3OS00Y2IwLWFkMTItMjRmNGMxN2QwNTJmIn0._4s9UFloYRdukCUay6cLkY2NMfWi9rb5fU6Jbh3SZ4E",
  "access_expires_at": "2026-10-28T13:24:07.810458531Z",
  "refresh_token": "WkW-SY5Vee0a5PyUb8MX-yGuN9UA5iyM0HceLB87ESE",
  "refresh_expires_at": "2026-10-29T01:09:07.810030297Z",
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
  "command_id": "81df7cf7-7b3b-4433-8590-1cb91dbe94fc",
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
  "timestamp": "2026-10-28T13:09:08.000+0000",
  "channel": {
    "id": "1730052000.5538544",
    "linkedid": "1730052000.5538544",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671265696"
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
  "timestamp": "2026-10-28T13:09:08.000+0000",
  "channel": {
    "id": "1730052000.5538544",
    "linkedid": "1730052000.5538544",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671265696"
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
  "session_id": "64508284-0662-40f9-a7ca-03eb1f204867",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4NDgsImlhdCI6MTc5MzE5Mjk0OCwianRpIjoiMjI4NDk4ODktOTk4Ny00ZDI4LTgxMjUtZmFiMDM1ODAwYTllIiwic2lkIjoiNjQ1MDgyODQtMDY2Mi00MGY5LWE3Y2EtMDNlYjFmMjA0ODY3In0.XmMED0wMTFs1FxHN2VTd9pZccEwryqhO8cWo5OXKFA0",
  "access_expires_at": "2026-10-28T13:24:08.614701075Z",
  "refresh_token": "DyopQqR-Ywm0VtZwvYpqLGcs_JxMLTMwXGu1e8xKEcE",
  "refresh_expires_at": "2026-10-29T01:09:08.614230509Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "6c98da6f-d079-40b9-bccc-0a8ec6d48882",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671265696",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:09:08Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/6c98da6f-d079-40b9-bccc-0a8ec6d48882/answer` → **200**

```json
{
  "command_id": "a990231c-52dd-4712-a65a-7da56e46e60f"
}
```

```json
{
  "id": "6c98da6f-d079-40b9-bccc-0a8ec6d48882",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671265696",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "order_ids": [],
  "started_at": "2026-10-28T13:09:08Z",
  "answered_at": "2026-10-28T13:09:08.999487Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.5538544",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1f373214-c292-4493-9366-ec0c1a2c7114",
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
  "id": "e77cf345-2621-4689-ba42-9128a90971f7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:14:09.210696Z",
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
  "command_id": "88543a59-fc9c-4cb0-b426-e0782b20e752",
  "quote_id": "e77cf345-2621-4689-ba42-9128a90971f7",
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
    "phone": "+380671265696"
  },
  "call_id": "6c98da6f-d079-40b9-bccc-0a8ec6d48882"
}
```

```json
{
  "id": "1e28e7db-5fd0-48a7-b8f1-4b9e2da8db74",
  "short_number": 9,
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
  "created_at": "2026-10-28T13:09:09.401321Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671265696"
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
    "id": "1730052000.5538544",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "6c98da6f-d079-40b9-bccc-0a8ec6d48882",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671265696",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [
        "1e28e7db-5fd0-48a7-b8f1-4b9e2da8db74"
      ],
      "started_at": "2026-10-28T13:09:08Z",
      "answered_at": "2026-10-28T13:09:08.999487Z",
      "ended_at": "2026-10-28T13:09:09.604907Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "509849d0-112a-4b1b-9461-84e31dd471d9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673889603",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [],
      "started_at": "2026-10-28T13:07:38.141662Z",
      "answered_at": "2026-10-28T13:07:38.367251Z",
      "ended_at": "2026-10-28T13:07:38.578946Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:07:48.194519Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/1e28e7db-5fd0-48a7-b8f1-4b9e2da8db74` → **200**

```json
{
  "id": "1e28e7db-5fd0-48a7-b8f1-4b9e2da8db74",
  "short_number": 9,
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
  "created_at": "2026-10-28T13:09:09.401321Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671265696"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/1e28e7db-5fd0-48a7-b8f1-4b9e2da8db74` → **200**

```json
{
  "id": "1e28e7db-5fd0-48a7-b8f1-4b9e2da8db74",
  "short_number": 9,
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
  "created_at": "2026-10-28T13:09:09.401321Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671265696"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1e28e7db-5fd0-48a7-b8f1-4b9e2da8db74/cancel` → **200**

```json
{
  "command_id": "a7960a31-a8f3-4213-be72-353d12073489",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "1e28e7db-5fd0-48a7-b8f1-4b9e2da8db74",
  "short_number": 9,
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
  "created_at": "2026-10-28T13:09:09.401321Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671265696"
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

Done: call 6c98da6f-d079-40b9-bccc-0a8ec6d48882 with order 1e28e7db-5fd0-48a7-b8f1-4b9e2da8db74.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6267"
}
```

```json
{
  "challenge_id": "71f28484-9b93-47b0-8c76-b38d17d8ffe7",
  "expires_at": "2026-10-28T13:14:10.438924029Z",
  "resend_available_at": "2026-10-28T13:09:11.438924029Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "289321",
  "sent_at": "2026-10-28T13:09:10.440664469Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71f28484-9b93-47b0-8c76-b38d17d8ffe7",
  "code": "289321",
  "device_ref": "sandbox-6267"
}
```

```json
{
  "session_id": "c0af5bc4-dd68-4ac6-8638-da2d37d27153",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Mzg1MCwiaWF0IjoxNzkzMTkyOTUwLCJqdGkiOiJhOWM5ZmM5YS02N2I0LTRiYWQtYWE2Yi05NjEyNGIyZTg5MzUiLCJzaWQiOiJjMGFmNWJjNC1kZDY4LTRhYzYtODYzOC1kYTJkMzdkMjcxNTMifQ.SBE8BkIUl5BEtKniqvVP9QFx7Rmf3MDNxNpmeX6g1mI",
  "access_expires_at": "2026-10-28T13:24:10.644072192Z",
  "refresh_token": "E36LRnBBwAhCRApvmKi_WBrtTw36knJpKV2lRxvIjQI",
  "refresh_expires_at": "2026-11-27T13:09:10.643675411Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:09:01.391571Z",
  "last_location_at": "2026-10-28T13:09:01.391571Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/44da49c1-d92f-4c66-a99a-6069c1d6f4ae/handover` → **200**

```json
{
  "command_id": "96f2da0b-d25e-43b1-974a-c195803a09b4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:09:01.391571Z",
  "last_location_at": "2026-10-28T13:09:01.391571Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/44da49c1-d92f-4c66-a99a-6069c1d6f4ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:09:11Z",
    "sequence": 1793192951187
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:09:11.203221Z",
  "last_location_at": "2026-10-28T13:09:11.203221Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661738774",
  "device_ref": "sandbox-14827"
}
```

```json
{
  "challenge_id": "9f58303f-444f-48ba-9823-bc56a1a80f65",
  "expires_at": "2026-10-28T13:14:11.386241332Z",
  "resend_available_at": "2026-10-28T13:09:12.386241332Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661738774` → **200**

```json
{
  "phone": "+380661738774",
  "audience": "CLIENT",
  "code": "013996",
  "sent_at": "2026-10-28T13:09:11.387881389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f58303f-444f-48ba-9823-bc56a1a80f65",
  "code": "013996",
  "device_ref": "sandbox-14827"
}
```

```json
{
  "session_id": "2e51015c-7ed4-4728-bca7-ca296b9ffb30",
  "subject": {
    "type": "CLIENT",
    "id": "6d8cdea6-1793-4534-86bf-ece8c99f9d22"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZDhjZGVhNi0xNzkzLTQ1MzQtODZiZi1lY2U4Yzk5ZjlkMjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODUxLCJpYXQiOjE3OTMxOTI5NTEsImp0aSI6IjM4NDY2MjJiLTU3MjUtNDQ3Yi1hOTA1LTc4OGEzMjdiMDI1NiIsInNpZCI6IjJlNTEwMTVjLTdlZDQtNDcyOC1iY2E3LWNhMjk2YjlmZmIzMCJ9.ACPUTuX78fgKz6hjPcKOVjFOtnt_wiUyPCVBYKijtgs",
  "access_expires_at": "2026-10-28T13:24:11.590287632Z",
  "refresh_token": "FFWL0Bx_htpEA9-7UnPsJ74MQDOPhgI5kkylok2hvB0",
  "refresh_expires_at": "2026-11-27T13:09:11.589798776Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fbcfcb4b-378b-4125-9903-f54cd0746d68",
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
  "id": "495ee207-c94f-46de-b116-a92796c99913",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:14:11.768069Z",
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
  "command_id": "c86b648d-a8ed-4ebc-aa7f-be9b22d013cc",
  "quote_id": "495ee207-c94f-46de-b116-a92796c99913",
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
  "id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6d8cdea6-1793-4534-86bf-ece8c99f9d22",
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
  "created_at": "2026-10-28T13:09:11.960935Z",
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
    "id": "35bb844e-5333-4f77-9ce0-060329fda91b",
    "order_id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
    "expires_at": "2026-10-28T13:09:26.962883Z",
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

`POST /api/driver/v1/offers/35bb844e-5333-4f77-9ce0-060329fda91b/accept` → **200**

```json
{
  "command_id": "1e1ec425-a2a3-44ae-90ba-1326f88c10d6"
}
```

```json
{
  "id": "33898e47-006f-4503-ad37-e92cfd7d7bf2",
  "order_id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a2039924-c32e-401a-acc9-93eab543a299",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a2039924-c32e-401a-acc9-93eab543a299",
  "order_id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
  "assignment_id": "33898e47-006f-4503-ad37-e92cfd7d7bf2",
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

`POST /api/driver/v1/work-sessions/44da49c1-d92f-4c66-a99a-6069c1d6f4ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:09:12Z",
    "sequence": 1793192952691
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:09:12.706887Z",
  "last_location_at": "2026-10-28T13:09:12.706887Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a2039924-c32e-401a-acc9-93eab543a299/arrive` → **200**

```json
{
  "command_id": "fb4ef5c7-8890-4b7c-8b76-10b34d3c0911",
  "expected_version": 0
}
```

```json
{
  "id": "a2039924-c32e-401a-acc9-93eab543a299",
  "order_id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
  "assignment_id": "33898e47-006f-4503-ad37-e92cfd7d7bf2",
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
  "arrived_at": "2026-10-28T13:09:12.886336Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a2039924-c32e-401a-acc9-93eab543a299/start` → **200**

```json
{
  "command_id": "4cfd8a06-fe6b-4313-9f7b-8221bca3cd95",
  "expected_version": 1
}
```

```json
{
  "id": "a2039924-c32e-401a-acc9-93eab543a299",
  "order_id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
  "assignment_id": "33898e47-006f-4503-ad37-e92cfd7d7bf2",
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
  "arrived_at": "2026-10-28T13:09:12.886336Z",
  "started_at": "2026-10-28T13:09:13.079839Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/44da49c1-d92f-4c66-a99a-6069c1d6f4ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:09:13Z",
    "sequence": 1793192953256
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:09:13.271688Z",
  "last_location_at": "2026-10-28T13:09:13.271688Z",
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
  "device_ref": "sandbox-19086"
}
```

```json
{
  "challenge_id": "78bc7d20-6c6a-4ef8-8cd9-3c9d64bf9507",
  "expires_at": "2026-10-28T13:14:13.448364229Z",
  "resend_available_at": "2026-10-28T13:09:14.448364229Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "666012",
  "sent_at": "2026-10-28T13:09:13.450131193Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78bc7d20-6c6a-4ef8-8cd9-3c9d64bf9507",
  "code": "666012",
  "device_ref": "sandbox-19086"
}
```

```json
{
  "session_id": "43c685c7-c885-4266-b6c7-9de232ebc5db",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Mzg1MywiaWF0IjoxNzkzMTkyOTUzLCJqdGkiOiIxMWZmMWFjYS0zMWE3LTQwMGYtOWFmNS05ZTkwMjkwYjEyYzUiLCJzaWQiOiI0M2M2ODVjNy1jODg1LTQyNjYtYjZjNy05ZGUyMzJlYmM1ZGIifQ.kE8nsW1qDmfP7YUDioqZU7a0oJhSjrkV2wkhrihi6uM",
  "access_expires_at": "2026-10-28T13:24:13.653145361Z",
  "refresh_token": "kw7fTFf8nN44yli57Dv0anQt3dYtfRPs-jSJAdxCvC8",
  "refresh_expires_at": "2026-11-27T13:09:13.652730553Z",
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
  "command_id": "c8f1024c-5cb0-4f98-98e0-557fc7a1619b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:09:14Z",
    "sequence": 1793192954168
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7466fc7a-8f93-4785-b327-0a6e67d981ee",
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
  "last_heartbeat_at": "2026-10-28T13:09:14.032282Z",
  "last_location_at": "2026-10-28T13:09:14.032282Z",
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
  "session_id": "967c1e86-5662-4215-bb8b-83c3a4e88bf5",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4NTQsImlhdCI6MTc5MzE5Mjk1NCwianRpIjoiMmM3NGRlNDEtOWFhNS00NTliLWJlMDgtZDZkN2Y5ZTFkYjNiIiwic2lkIjoiOTY3YzFlODYtNTY2Mi00MjE1LWJiOGItODNjM2E0ZTg4YmY1In0.70Uv80KcpNrbHqWKe2wD_zMSv7BzvPenyyYxQrgEOzo",
  "access_expires_at": "2026-10-28T13:24:14.424008724Z",
  "refresh_token": "YFCBf0e9Ezl8IUEdRJsO3uk1qysZv4IsLG-d5cw26Ts",
  "refresh_expires_at": "2026-10-29T01:09:14.423635915Z",
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
  "session_id": "f536c44e-81fc-4a3a-af35-a1723334592e",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4NTQsImlhdCI6MTc5MzE5Mjk1NCwianRpIjoiNDkzMzFhYjAtNzI0MC00MjM5LWJiNzctYWNkM2Y3ZTk4NjA2Iiwic2lkIjoiZjUzNmM0NGUtODFmYy00YTNhLWFmMzUtYTE3MjMzMzQ1OTJlIn0.fpctnuHQFZF5RDe7BxWgaaO33GONt0nUOsSbNfVrtAs",
  "access_expires_at": "2026-10-28T13:24:14.804365815Z",
  "refresh_token": "IkfY74CEMzCidW6iTvr3Sug1KuAu2nr8NeRxd5IHq4o",
  "refresh_expires_at": "2026-10-29T01:09:14.803978909Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2ef9ef0c-36eb-4af1-b179-96f76b76c61a` → **200**

```json
{
  "id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
  "short_number": 10,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "6d8cdea6-1793-4534-86bf-ece8c99f9d22",
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
    "id": "33898e47-006f-4503-ad37-e92cfd7d7bf2",
    "order_id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a2039924-c32e-401a-acc9-93eab543a299",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T13:09:11.960935Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2ef9ef0c-36eb-4af1-b179-96f76b76c61a/interrupt` → **200**

```json
{
  "command_id": "b4f390c4-1451-42c4-9634-5f23ece674e5",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
    "short_number": 10,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "6d8cdea6-1793-4534-86bf-ece8c99f9d22",
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
      "id": "33898e47-006f-4503-ad37-e92cfd7d7bf2",
      "order_id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "a2039924-c32e-401a-acc9-93eab543a299",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T13:09:11.960935Z",
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
    "id": "0dae782a-0587-48ed-aeff-20963b790991",
    "short_number": 11,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "6d8cdea6-1793-4534-86bf-ece8c99f9d22",
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
    "id": "8dbeda5a-bdec-4268-a5d0-e7cb9c68ecd1",
    "order_id": "0dae782a-0587-48ed-aeff-20963b790991",
    "expires_at": "2026-10-28T13:09:30.200113Z",
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

`POST /api/driver/v1/offers/8dbeda5a-bdec-4268-a5d0-e7cb9c68ecd1/accept` → **200**

```json
{
  "command_id": "21041a10-af22-4b3c-bd1c-816d13e020c1"
}
```

```json
{
  "id": "4970637d-6a73-4260-9bc2-ad5818f4bbc0",
  "order_id": "0dae782a-0587-48ed-aeff-20963b790991",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8f8f6b4f-52fb-4ea3-bb40-312ea29bca16",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8f8f6b4f-52fb-4ea3-bb40-312ea29bca16",
  "order_id": "0dae782a-0587-48ed-aeff-20963b790991",
  "assignment_id": "4970637d-6a73-4260-9bc2-ad5818f4bbc0",
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
  "session_id": "7466fc7a-8f93-4785-b327-0a6e67d981ee",
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
  "last_heartbeat_at": "2026-10-28T13:09:14.032282Z",
  "last_location_at": "2026-10-28T13:09:14.032282Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/7466fc7a-8f93-4785-b327-0a6e67d981ee/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:09:16Z",
    "sequence": 1793192956106
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7466fc7a-8f93-4785-b327-0a6e67d981ee",
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
  "last_heartbeat_at": "2026-10-28T13:09:16.122287Z",
  "last_location_at": "2026-10-28T13:09:16.122287Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8f8f6b4f-52fb-4ea3-bb40-312ea29bca16/arrive` → **200**

```json
{
  "command_id": "f7a7e534-9b83-44fe-81fb-7af3939c1f52",
  "expected_version": 0
}
```

```json
{
  "id": "8f8f6b4f-52fb-4ea3-bb40-312ea29bca16",
  "order_id": "0dae782a-0587-48ed-aeff-20963b790991",
  "assignment_id": "4970637d-6a73-4260-9bc2-ad5818f4bbc0",
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
  "arrived_at": "2026-10-28T13:09:16.307124Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8f8f6b4f-52fb-4ea3-bb40-312ea29bca16/start` → **200**

```json
{
  "command_id": "aba77c86-5c66-492b-a590-6dfe62d5291f",
  "expected_version": 1
}
```

```json
{
  "id": "8f8f6b4f-52fb-4ea3-bb40-312ea29bca16",
  "order_id": "0dae782a-0587-48ed-aeff-20963b790991",
  "assignment_id": "4970637d-6a73-4260-9bc2-ad5818f4bbc0",
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
  "arrived_at": "2026-10-28T13:09:16.307124Z",
  "started_at": "2026-10-28T13:09:16.50125Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8f8f6b4f-52fb-4ea3-bb40-312ea29bca16/complete` → **200**

```json
{
  "command_id": "18bc23d5-1776-4b7f-b5ad-ef7fac0eafe6",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:09:16Z"
}
```

```json
{
  "id": "8f8f6b4f-52fb-4ea3-bb40-312ea29bca16",
  "order_id": "0dae782a-0587-48ed-aeff-20963b790991",
  "assignment_id": "4970637d-6a73-4260-9bc2-ad5818f4bbc0",
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
  "arrived_at": "2026-10-28T13:09:16.307124Z",
  "started_at": "2026-10-28T13:09:16.50125Z",
  "completed_at": "2026-10-28T13:09:16.699163Z",
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
    "id": "0dae782a-0587-48ed-aeff-20963b790991",
    "short_number": 11,
    "status": "FULFILLED",
    "created_at": "2026-10-28T13:09:15.193603Z",
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
    "id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
    "short_number": 10,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:09:11.960935Z",
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

`GET /api/operator/v1/orders/2ef9ef0c-36eb-4af1-b179-96f76b76c61a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:09:11.961307Z",
      "actor": {
        "type": "CLIENT",
        "id": "6d8cdea6-1793-4534-86bf-ece8c99f9d22",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
        "quote_id": "495ee207-c94f-46de-b116-a92796c99913",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "8fa1f4ef-a5bb-469c-b529-373efbb59ab5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:09:11.962459Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
        "attempt_id": "e6a48df2-6b05-4462-9d53-4c27994cf643",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8fa1f4ef-a5bb-469c-b529-373efbb59ab5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:09:11.96408Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "35bb844e-5333-4f77-9ce0-060329fda91b",
        "order_id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "8fa1f4ef-a5bb-469c-b529-373efbb59ab5"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:09:12.344936Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "35bb844e-5333-4f77-9ce0-060329fda91b",
        "order_id": "2ef9ef0c-36eb-4af1-b179-96f76b76c61a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "33898e47-006f-4503-ad37-e92cfd7d7bf2"
      },
      "correlation_id": "eab9d086-5bcd-4f3a-b538-b7a746aa7521"
```

Done: interrupted 2ef9ef0c-36eb-4af1-b179-96f76b76c61a, follow-up 0dae782a-0587-48ed-aeff-20963b790991.

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
  "session_id": "f613a768-034b-4fa0-a228-02c74361bfdd",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4NjAsImlhdCI6MTc5MzE5Mjk2MCwianRpIjoiMzFjNjU0OWQtNWIxYy00ZDc4LWI0MWEtNmZmYTdjYmJlZjgyIiwic2lkIjoiZjYxM2E3NjgtMDM0Yi00ZmEwLWEyMjgtMDJjNzQzNjFiZmRkIn0.6sF00MY4-WeB6hGKxBw4xQWU4kOGGVmieH-HToqGJ5U",
  "access_expires_at": "2026-10-28T13:24:20.655438673Z",
  "refresh_token": "jsZJwTNs5xd_9t5Iwolkdo9ZYZgk4GTvi22wVZB8y7I",
  "refresh_expires_at": "2026-10-29T01:09:20.655089845Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "43e4cb56-5923-4367-8e6a-986997550d3f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:09:20Z"
}
```

```json
{
  "id": "0063ab42-16e9-4440-a0d7-5ed62bca6b78",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:09:20Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/0063ab42-16e9-4440-a0d7-5ed62bca6b78/publish` → **200**

```json
{
  "command_id": "42bdd860-80f7-40f5-acb9-1c226832e247",
  "expected_version": 0
}
```

```json
{
  "id": "0063ab42-16e9-4440-a0d7-5ed62bca6b78",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:09:21.05487Z",
  "published_at": "2026-10-28T13:09:21.05487Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "0063ab42-16e9-4440-a0d7-5ed62bca6b78",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T13:09:21.05487Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630809745",
  "device_ref": "sandbox-21001"
}
```

```json
{
  "challenge_id": "c0efc58b-4b9a-443c-b64e-22b875a102ef",
  "expires_at": "2026-10-28T13:14:21.46480651Z",
  "resend_available_at": "2026-10-28T13:09:22.46480651Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630809745` → **200**

```json
{
  "phone": "+380630809745",
  "audience": "CLIENT",
  "code": "330594",
  "sent_at": "2026-10-28T13:09:21.466550168Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0efc58b-4b9a-443c-b64e-22b875a102ef",
  "code": "330594",
  "device_ref": "sandbox-21001"
}
```

```json
{
  "session_id": "b1574ab5-b476-44b0-8064-e28f58c1d8da",
  "subject": {
    "type": "CLIENT",
    "id": "1380a45d-ac82-41da-ac3d-bfb1f3cfe1cc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzgwYTQ1ZC1hYzgyLTQxZGEtYWMzZC1iZmIxZjNjZmUxY2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODYxLCJpYXQiOjE3OTMxOTI5NjEsImp0aSI6IjQ5ODNmMjE5LWUyOTEtNDg5OC1hMDk0LWM2ZDhiNjA2YjUyNSIsInNpZCI6ImIxNTc0YWI1LWI0NzYtNDRiMC04MDY0LWUyOGY1OGMxZDhkYSJ9.9TNh_ek_Ln36GAGpQUHHYiW80xIMkNFUl7Qu92a7cDw",
  "access_expires_at": "2026-10-28T13:24:21.667433358Z",
  "refresh_token": "oq15AdV6NKze_Q5R0IODtksNATAUpsazzfum7dv3Afs",
  "refresh_expires_at": "2026-11-27T13:09:21.667006176Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "0063ab42-16e9-4440-a0d7-5ed62bca6b78",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T13:09:21.05487Z",
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
  "command_id": "6d3bb8ee-a27b-4e79-89fc-33aa562c2626",
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
  "id": "06bd0ac1-4619-4998-bfbc-3cb33f90a8e4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:14:22.022296Z",
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
  "command_id": "933df1e3-3e8d-45c4-84f1-9b0d24938b41",
  "quote_id": "06bd0ac1-4619-4998-bfbc-3cb33f90a8e4",
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
  "correlation_id": "efa349a3-730b-485f-b639-e936634fdf25"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "914e9992-4051-47f3-aa35-bab5ad616aeb",
  "version_id": "0063ab42-16e9-4440-a0d7-5ed62bca6b78",
  "language": "uk"
}
```

```json
{
  "version_id": "0063ab42-16e9-4440-a0d7-5ed62bca6b78",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T13:09:22.408402Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fc79f559-3342-48f2-887d-47b0cb1a1da0",
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
  "id": "afa66b95-79ff-449d-86b8-d374c40c42f8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:14:22.600671Z",
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
  "command_id": "19d4d6fa-18a2-498c-8dc3-fe10b1569dd0",
  "quote_id": "afa66b95-79ff-449d-86b8-d374c40c42f8",
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
  "id": "2ade97dd-1ef6-4fef-8304-20279af233de",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1380a45d-ac82-41da-ac3d-bfb1f3cfe1cc",
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
  "created_at": "2026-10-28T13:09:22.787334Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2ade97dd-1ef6-4fef-8304-20279af233de` → **200**

```json
{
  "id": "2ade97dd-1ef6-4fef-8304-20279af233de",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1380a45d-ac82-41da-ac3d-bfb1f3cfe1cc",
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
  "created_at": "2026-10-28T13:09:22.787334Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2ade97dd-1ef6-4fef-8304-20279af233de/cancel` → **200**

```json
{
  "command_id": "a37db001-e549-4d99-9268-292b3482a1b3",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2ade97dd-1ef6-4fef-8304-20279af233de",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1380a45d-ac82-41da-ac3d-bfb1f3cfe1cc",
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
  "created_at": "2026-10-28T13:09:22.787334Z",
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

`POST /api/admin/v1/legal-documents/0063ab42-16e9-4440-a0d7-5ed62bca6b78` → **409**

```json
{
  "command_id": "0e6b62ab-e643-4480-a298-d11dfb4f8090",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:09:23Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/0063ab42-16e9-4440-a0d7-5ed62bca6b78",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "98ada53d-701c-4bdc-be93-130b12e15c82"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "016189cc-ea4f-43f5-b09d-10998a0df267",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:09:23Z"
}
```

```json
{
  "id": "25137cd3-fb6d-4109-a167-af90c301caec",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:09:23Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/25137cd3-fb6d-4109-a167-af90c301caec/publish` → **200**

```json
{
  "command_id": "54c4e9b1-8f03-4efd-b392-7a31bb8829e2",
  "expected_version": 0
}
```

```json
{
  "id": "25137cd3-fb6d-4109-a167-af90c301caec",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:09:23.8348Z",
  "published_at": "2026-10-28T13:09:23.8348Z",
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
  "device_ref": "sandbox-19882"
}
```

```json
{
  "challenge_id": "7632df13-fc73-4a8a-86b0-efff1a81fd00",
  "expires_at": "2026-10-28T13:14:24.019857977Z",
  "resend_available_at": "2026-10-28T13:09:25.019857977Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "861842",
  "sent_at": "2026-10-28T13:09:24.021247295Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7632df13-fc73-4a8a-86b0-efff1a81fd00",
  "code": "861842",
  "device_ref": "sandbox-19882"
}
```

```json
{
  "session_id": "5d78dfa5-9d29-41ae-a8e3-78dd8001eb06",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Mzg2NCwiaWF0IjoxNzkzMTkyOTY0LCJqdGkiOiJiOWI3ODA2Ny02NmMxLTRkOGYtOWMzNi02NzhjNTY0MmViYjEiLCJzaWQiOiI1ZDc4ZGZhNS05ZDI5LTQxYWUtYThlMy03OGRkODAwMWViMDYifQ.s0GOd0ZqYi7oINqlZElK3J_HaF-Uw9wsREW3UgUS8mU",
  "access_expires_at": "2026-10-28T13:24:24.226758713Z",
  "refresh_token": "yu_MSXkAC9xDJtHFzT6A7fZevoK1j6RMYxgI1pQs46E",
  "refresh_expires_at": "2026-11-27T13:09:24.226264235Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7466fc7a-8f93-4785-b327-0a6e67d981ee",
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
  "last_heartbeat_at": "2026-10-28T13:09:16.122287Z",
  "last_location_at": "2026-10-28T13:09:16.122287Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7466fc7a-8f93-4785-b327-0a6e67d981ee/handover` → **200**

```json
{
  "command_id": "093bf136-76dc-4dae-8fb8-62b09c2a05b3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7466fc7a-8f93-4785-b327-0a6e67d981ee",
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
  "last_heartbeat_at": "2026-10-28T13:09:16.122287Z",
  "last_location_at": "2026-10-28T13:09:16.122287Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7466fc7a-8f93-4785-b327-0a6e67d981ee/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:09:24Z",
    "sequence": 1793192964778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7466fc7a-8f93-4785-b327-0a6e67d981ee",
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
  "last_heartbeat_at": "2026-10-28T13:09:24.79403Z",
  "last_location_at": "2026-10-28T13:09:24.79403Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670483075",
  "device_ref": "sandbox-10157"
}
```

```json
{
  "challenge_id": "b85b16ad-b84c-4058-9d07-b01f3bf7ef9c",
  "expires_at": "2026-10-28T13:14:24.977672292Z",
  "resend_available_at": "2026-10-28T13:09:25.977672292Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670483075` → **200**

```json
{
  "phone": "+380670483075",
  "audience": "CLIENT",
  "code": "478089",
  "sent_at": "2026-10-28T13:09:24.979433927Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b85b16ad-b84c-4058-9d07-b01f3bf7ef9c",
  "code": "478089",
  "device_ref": "sandbox-10157"
}
```

```json
{
  "session_id": "a9676f1a-75fb-4fd3-89f5-8beaa0c097f7",
  "subject": {
    "type": "CLIENT",
    "id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODk4ZTcyOC03N2E5LTRlMmUtYjNiZC1kNzIwNTkwYWM1YjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODY1LCJpYXQiOjE3OTMxOTI5NjUsImp0aSI6IjkxMDI5OGMzLTBmZmQtNDZmMi05Y2Y5LTU5OWU2OTYwNTFjYSIsInNpZCI6ImE5Njc2ZjFhLTc1ZmItNGZkMy04OWY1LThiZWFhMGMwOTdmNyJ9.HQV6QpIB532WrbyNI2KzpaBsdGBOjGSZ35L_xQN9nEs",
  "access_expires_at": "2026-10-28T13:24:25.179204344Z",
  "refresh_token": "Pdbqo7XIeakiPUK6tqNLnP6kqkj77mgAIJWGil0iqHs",
  "refresh_expires_at": "2026-11-27T13:09:25.178863187Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ded69f1d-21d9-4526-81b5-581ebdbe0d6b",
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
  "id": "f46cbc13-d3f1-44a2-86f9-15d5433cf4b6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:14:25.366615Z",
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
  "command_id": "1e691dc8-8574-45c0-82cd-4f4636a3fffb",
  "quote_id": "f46cbc13-d3f1-44a2-86f9-15d5433cf4b6",
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
    "phone": "+380674203790"
  }
}
```

```json
{
  "id": "56393db9-640c-41a3-8002-577d10671dc7",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:09:25.561547Z",
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
    "id": "f481268a-57e1-4d54-85f9-1c8bb75b8283",
    "order_id": "56393db9-640c-41a3-8002-577d10671dc7",
    "expires_at": "2026-10-28T13:09:40.563613Z",
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

`POST /api/driver/v1/offers/f481268a-57e1-4d54-85f9-1c8bb75b8283/accept` → **200**

```json
{
  "command_id": "3e6d770f-47c7-45c6-a539-750b3320b282"
}
```

```json
{
  "id": "43587461-53b4-49d1-854e-830518b183bd",
  "order_id": "56393db9-640c-41a3-8002-577d10671dc7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2627d978-cf7f-417b-b4d9-7df4bae1c011",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2627d978-cf7f-417b-b4d9-7df4bae1c011",
  "order_id": "56393db9-640c-41a3-8002-577d10671dc7",
  "assignment_id": "43587461-53b4-49d1-854e-830518b183bd",
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
    "phone": "+380674203790"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bec5fdb0-f71f-44f0-a1e2-b801a64acfea",
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
  "id": "c8e81336-f3fd-489a-a993-7e5b26492203",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:14:26.326375Z",
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
  "command_id": "48bda2df-77f4-494c-9692-87922351a852",
  "quote_id": "c8e81336-f3fd-489a-a993-7e5b26492203",
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
  "id": "84fb1d73-d0e1-4e67-a243-2a2fa5e6ada0",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:09:26.518646Z",
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
  "command_id": "56f80109-73e2-4b2b-8b6e-c08e5875cffd",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T16:09:26Z"
}
```

```json
{
  "id": "a2ff0055-fc62-4791-b6f1-753e8cafb414",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:14:26.721526Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T16:09:26Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c856c0a7-0852-48ba-bc27-b57320496ce8",
  "quote_id": "a2ff0055-fc62-4791-b6f1-753e8cafb414",
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
  "pickup_at": "2026-10-28T16:09:26Z"
}
```

```json
{
  "id": "23bf60f9-db84-4dca-b5d5-e3c64db96d5b",
  "short_number": 15,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T13:09:26.910492Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:09:26Z",
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
  "command_id": "0d8f16e3-fa90-43f0-8f3c-d31e828f273c",
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
  "id": "34505479-ab9b-4a28-92f6-5a3e872086ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:14:27.110816Z",
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
  "command_id": "3d985a1f-e9a3-4631-97cf-ef9a7ba8a51e",
  "quote_id": "34505479-ab9b-4a28-92f6-5a3e872086ef",
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
  "correlation_id": "f4cb3d0c-1d62-480d-a616-f53152665d8f"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "23bf60f9-db84-4dca-b5d5-e3c64db96d5b",
      "short_number": 15,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T13:09:26.910492Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T16:09:26Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "84fb1d73-d0e1-4e67-a243-2a2fa5e6ada0",
      "short_number": 14,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T13:09:26.518646Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "56393db9-640c-41a3-8002-577d10671dc7",
      "short_number": 13,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "84fb1d73-d0e1-4e67-a243-2a2fa5e6ada0",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:09:26.518646Z",
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

`GET /api/rider/v1/orders/56393db9-640c-41a3-8002-577d10671dc7` → **200**

```json
{
  "id": "56393db9-640c-41a3-8002-577d10671dc7",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "43587461-53b4-49d1-854e-830518b183bd",
    "order_id": "56393db9-640c-41a3-8002-577d10671dc7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2627d978-cf7f-417b-b4d9-7df4bae1c011",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T13:09:25.561547Z",
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
    "location_at": "2026-10-28T13:09:24.79403Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/56393db9-640c-41a3-8002-577d10671dc7/cancel` → **200**

```json
{
  "command_id": "f35591f4-104d-4107-a4e1-327310e57c56",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "56393db9-640c-41a3-8002-577d10671dc7",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "43587461-53b4-49d1-854e-830518b183bd",
    "order_id": "56393db9-640c-41a3-8002-577d10671dc7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2627d978-cf7f-417b-b4d9-7df4bae1c011",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:09:25.561547Z",
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

`GET /api/rider/v1/orders/84fb1d73-d0e1-4e67-a243-2a2fa5e6ada0` → **200**

```json
{
  "id": "84fb1d73-d0e1-4e67-a243-2a2fa5e6ada0",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:09:26.518646Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/84fb1d73-d0e1-4e67-a243-2a2fa5e6ada0/cancel` → **200**

```json
{
  "command_id": "31e934bf-66ae-4e34-b631-aced93b3151b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "84fb1d73-d0e1-4e67-a243-2a2fa5e6ada0",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:09:26.518646Z",
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

`GET /api/rider/v1/orders/23bf60f9-db84-4dca-b5d5-e3c64db96d5b` → **200**

```json
{
  "id": "23bf60f9-db84-4dca-b5d5-e3c64db96d5b",
  "short_number": 15,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T13:09:26.910492Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:09:26Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/23bf60f9-db84-4dca-b5d5-e3c64db96d5b/cancel` → **200**

```json
{
  "command_id": "58e2c6e7-5234-4446-b0c6-b7b484e941bf",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "23bf60f9-db84-4dca-b5d5-e3c64db96d5b",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "0898e728-77a9-4e2e-b3bd-d720590ac5b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T13:09:26.910492Z",
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
  "pickup_at": "2026-10-28T16:09:26Z",
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
  "session_id": "7466fc7a-8f93-4785-b327-0a6e67d981ee",
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
  "last_heartbeat_at": "2026-10-28T13:09:24.79403Z",
  "last_location_at": "2026-10-28T13:09:24.79403Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7466fc7a-8f93-4785-b327-0a6e67d981ee/close` → **200**

```json
{
  "command_id": "41a0d05f-22b2-4362-a4ae-307326c89d36",
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

Done: orders 56393db9-640c-41a3-8002-577d10671dc7, 84fb1d73-d0e1-4e67-a243-2a2fa5e6ada0, 23bf60f9-db84-4dca-b5d5-e3c64db96d5b.

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
  "session_id": "582bae80-2a5d-45d7-add1-9de038191e51",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4NjksImlhdCI6MTc5MzE5Mjk2OSwianRpIjoiYzk3ZTcyMTctNTA0MC00OGVhLTgwYTEtNmFiYzU4MTE2NDM4Iiwic2lkIjoiNTgyYmFlODAtMmE1ZC00NWQ3LWFkZDEtOWRlMDM4MTkxZTUxIn0.CnnK8y3PGJvwWaTpkdeK8MjiQpf3547PH--3bKLvGUs",
  "access_expires_at": "2026-10-28T13:24:29.648338776Z",
  "refresh_token": "e10415veB-9CWNSjxc7aTo7HtFj9pzkECPGGVvT_v3s",
  "refresh_expires_at": "2026-10-29T01:09:29.64768036Z",
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
  "session_id": "f66ab3df-6e94-4270-84c6-988b54db0ea9",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4NzAsImlhdCI6MTc5MzE5Mjk3MCwianRpIjoiY2ZiMWY0YzAtZGIxMS00MzVjLThhMjQtNzBhNWI1MjE2YjBiIiwic2lkIjoiZjY2YWIzZGYtNmU5NC00MjcwLTg0YzYtOTg4YjU0ZGIwZWE5In0.51FvZeMhm6X9lmoeM_JkW-4lUOrQj4eUWDukFWzFtQM",
  "access_expires_at": "2026-10-28T13:24:30.036622355Z",
  "refresh_token": "8us2dDAgnn6tlO1IhMgx6klQk4jfXHr42YGTCnFT3Zk",
  "refresh_expires_at": "2026-10-29T01:09:30.036245045Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2535"
}
```

```json
{
  "challenge_id": "71f9d728-3e0b-4802-9bdb-1e506073ebc3",
  "expires_at": "2026-10-28T13:14:30.236545287Z",
  "resend_available_at": "2026-10-28T13:09:31.236545287Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "492297",
  "sent_at": "2026-10-28T13:09:30.239511223Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71f9d728-3e0b-4802-9bdb-1e506073ebc3",
  "code": "492297",
  "device_ref": "sandbox-2535"
}
```

```json
{
  "session_id": "36fddbd4-6896-4e21-aca1-3eb5e5cc6eff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Mzg3MCwiaWF0IjoxNzkzMTkyOTcwLCJqdGkiOiJhZWRlYjU5MS01Y2FlLTRkMDctYjQxMy0zMjFmNmZlODg5M2YiLCJzaWQiOiIzNmZkZGJkNC02ODk2LTRlMjEtYWNhMS0zZWI1ZTVjYzZlZmYifQ.MxV5nEAeu0sYxcxCaPHIxeu6u39PwGw9O7PPQX4vcAI",
  "access_expires_at": "2026-10-28T13:24:30.44555064Z",
  "refresh_token": "U4V9iX98Enq-ZlOSMj3PcHjcpDkuTkmHDHYvI8o4w8A",
  "refresh_expires_at": "2026-11-27T13:09:30.445149659Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:09:13.271688Z",
  "last_location_at": "2026-10-28T13:09:13.271688Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/44da49c1-d92f-4c66-a99a-6069c1d6f4ae/handover` → **200**

```json
{
  "command_id": "189d0550-7dd5-4bd3-8d66-d33ccb617e3d",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:09:13.271688Z",
  "last_location_at": "2026-10-28T13:09:13.271688Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/44da49c1-d92f-4c66-a99a-6069c1d6f4ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:09:30Z",
    "sequence": 1793192971176
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:09:31.018098Z",
  "last_location_at": "2026-10-28T13:09:31.018098Z",
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
  "command_id": "8a9b0f61-eb52-4b10-aff4-7d4bcc74b987",
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
  "effective_at": "2026-10-28T13:09:31.395013Z",
  "changed_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T13:07:57.201871Z",
  "last_entries": [
    {
      "order_id": "59f307a0-864a-4740-80f8-9c9274a5c482",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T13:07:57.201871Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3b201376-64ae-45bb-86bf-bdfc9b4118ab",
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
  "id": "d541d871-5387-4d5b-9ea5-37f7c26a73ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:14:31.770935Z",
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
  "command_id": "a69da464-29af-4402-a62f-5008c2c15153",
  "quote_id": "d541d871-5387-4d5b-9ea5-37f7c26a73ca",
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
    "phone": "+3806711125340"
  }
}
```

```json
{
  "id": "11b8ffc7-00da-442b-b988-cf7a99b1fc2d",
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
  "created_at": "2026-10-28T13:09:31.970663Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711125340"
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
    "id": "8ee4b22b-2544-4c57-ab64-48aacbc45fa0",
    "order_id": "11b8ffc7-00da-442b-b988-cf7a99b1fc2d",
    "expires_at": "2026-10-28T13:09:46.973168Z",
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

`POST /api/driver/v1/offers/8ee4b22b-2544-4c57-ab64-48aacbc45fa0/accept` → **200**

```json
{
  "command_id": "177abf3f-cfb2-4dbd-bcf0-2c9227494ba5"
}
```

```json
{
  "id": "9b06df82-4f2b-4ec0-953a-c4a0550ae93e",
  "order_id": "11b8ffc7-00da-442b-b988-cf7a99b1fc2d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "042cfb64-34b8-42e6-80a1-eb4cbf4ac0aa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "042cfb64-34b8-42e6-80a1-eb4cbf4ac0aa",
  "order_id": "11b8ffc7-00da-442b-b988-cf7a99b1fc2d",
  "assignment_id": "9b06df82-4f2b-4ec0-953a-c4a0550ae93e",
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
    "phone": "+3806711125340"
  }
}
```

`POST /api/driver/v1/work-sessions/44da49c1-d92f-4c66-a99a-6069c1d6f4ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:09:32Z",
    "sequence": 1793192972720
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:09:32.737002Z",
  "last_location_at": "2026-10-28T13:09:32.737002Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/042cfb64-34b8-42e6-80a1-eb4cbf4ac0aa/arrive` → **200**

```json
{
  "command_id": "e4b94437-0d36-4221-a894-fd593af583f2",
  "expected_version": 0
}
```

```json
{
  "id": "042cfb64-34b8-42e6-80a1-eb4cbf4ac0aa",
  "order_id": "11b8ffc7-00da-442b-b988-cf7a99b1fc2d",
  "assignment_id": "9b06df82-4f2b-4ec0-953a-c4a0550ae93e",
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
  "arrived_at": "2026-10-28T13:09:32.924999Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125340"
  }
}
```

`POST /api/driver/v1/trips/042cfb64-34b8-42e6-80a1-eb4cbf4ac0aa/start` → **200**

```json
{
  "command_id": "df323169-aa12-4f94-adb7-6adf249c2c96",
  "expected_version": 1
}
```

```json
{
  "id": "042cfb64-34b8-42e6-80a1-eb4cbf4ac0aa",
  "order_id": "11b8ffc7-00da-442b-b988-cf7a99b1fc2d",
  "assignment_id": "9b06df82-4f2b-4ec0-953a-c4a0550ae93e",
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
  "arrived_at": "2026-10-28T13:09:32.924999Z",
  "started_at": "2026-10-28T13:09:33.122206Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125340"
  }
}
```

`POST /api/driver/v1/trips/042cfb64-34b8-42e6-80a1-eb4cbf4ac0aa/complete` → **200**

```json
{
  "command_id": "40468407-2d0a-4871-b604-0cc15b7c02eb",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:09:33Z",
  "cash_received": true
}
```

```json
{
  "id": "042cfb64-34b8-42e6-80a1-eb4cbf4ac0aa",
  "order_id": "11b8ffc7-00da-442b-b988-cf7a99b1fc2d",
  "assignment_id": "9b06df82-4f2b-4ec0-953a-c4a0550ae93e",
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
  "arrived_at": "2026-10-28T13:09:32.924999Z",
  "started_at": "2026-10-28T13:09:33.122206Z",
  "completed_at": "2026-10-28T13:09:33.321542Z",
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
  "command_id": "f3f2000a-74b9-4be6-88f6-2bc048045b83",
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
  "id": "1712d4b5-ff83-46a9-be42-38ed9f9cdf01",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:14:33.519068Z",
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
  "command_id": "5f42a66c-4ded-4581-b19f-8f89643ec5e9",
  "quote_id": "1712d4b5-ff83-46a9-be42-38ed9f9cdf01",
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
    "phone": "+3806711125394"
  }
}
```

```json
{
  "id": "5583dbfa-cc1f-4497-a05a-f588ade9f584",
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
  "created_at": "2026-10-28T13:09:33.71239Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711125394"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5583dbfa-cc1f-4497-a05a-f588ade9f584` → **200**

```json
{
  "id": "5583dbfa-cc1f-4497-a05a-f588ade9f584",
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
  "created_at": "2026-10-28T13:09:33.71239Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711125394"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5583dbfa-cc1f-4497-a05a-f588ade9f584/cancel` → **200**

```json
{
  "command_id": "74722aa0-431e-4c61-9139-cc4150460a35",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "5583dbfa-cc1f-4497-a05a-f588ade9f584",
  "short_number": 17,
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
  "created_at": "2026-10-28T13:09:33.71239Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711125394"
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
  "staff_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T13:07:57.201871Z",
  "last_entries": [
    {
      "order_id": "5583dbfa-cc1f-4497-a05a-f588ade9f584",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T13:09:34.117707Z"
    },
    {
      "order_id": "11b8ffc7-00da-442b-b988-cf7a99b1fc2d",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T13:09:33.325119Z"
    },
    {
      "order_id": "59f307a0-864a-4740-80f8-9c9274a5c482",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T13:07:57.201871Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44da49c1-d92f-4c66-a99a-6069c1d6f4ae",
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
  "last_heartbeat_at": "2026-10-28T13:09:32.737002Z",
  "last_location_at": "2026-10-28T13:09:32.737002Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/44da49c1-d92f-4c66-a99a-6069c1d6f4ae/close` → **200**

```json
{
  "command_id": "f5e9853f-68e6-41fb-b4be-d506678cf4a2",
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

Done: operator bonus for fulfilled 11b8ffc7-00da-442b-b988-cf7a99b1fc2d and operator-fault cancellation 5583dbfa-cc1f-4497-a05a-f588ade9f584.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678098608",
  "device_ref": "sandbox-883"
}
```

```json
{
  "challenge_id": "348f4c1d-9993-4cc2-81a4-5ae779fbc3ec",
  "expires_at": "2026-10-28T13:14:36.928956552Z",
  "resend_available_at": "2026-10-28T13:09:37.928956552Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678098608` → **200**

```json
{
  "phone": "+380678098608",
  "audience": "CLIENT",
  "code": "141277",
  "sent_at": "2026-10-28T13:09:36.930753401Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670110363",
  "device_ref": "sandbox-27434",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "760802c5-3ddb-4e84-8a58-8c48648a6c88",
  "expires_at": "2026-10-28T13:14:37.126495053Z",
  "resend_available_at": "2026-10-28T13:09:38.126495053Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670110363` → **200**

```json
{
  "phone": "+380670110363",
  "audience": "CLIENT",
  "code": "598409",
  "sent_at": "2026-10-28T13:09:37.127960971Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670840000",
  "device_ref": "sandbox-4779"
}
```

```json
{
  "challenge_id": "9ff51d49-c8d3-4cd5-bab4-f24561d6c0de",
  "expires_at": "2026-10-28T13:14:37.315851107Z",
  "resend_available_at": "2026-10-28T13:09:38.315851107Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670840000` → **200**

```json
{
  "phone": "+380670840000",
  "audience": "CLIENT",
  "code": "160602",
  "sent_at": "2026-10-28T13:09:37.317919848Z",
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
  "session_id": "f9864a26-2256-4156-8d2f-ccd34f5f949e",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4NzcsImlhdCI6MTc5MzE5Mjk3NywianRpIjoiNTgwYjJkOGUtNzk0ZC00YjhkLTg5ZGYtMjc3OWM4NWMwOWM3Iiwic2lkIjoiZjk4NjRhMjYtMjI1Ni00MTU2LThkMmYtY2NkMzRmNWY5NDllIn0.jdW_96Wqipgot4gfYpR0OaHtMrbivxjncC3qLNOqyPM",
  "access_expires_at": "2026-10-28T13:24:37.730178237Z",
  "refresh_token": "NnBiq9YQI2Qke06V7QujvBmq4BqWALUFHeTAAEqfHr8",
  "refresh_expires_at": "2026-10-29T01:09:37.729500962Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670840000` → **200**

```json
{
  "deliveries": [
    {
      "id": "5e5ce471-d653-4c47-aead-00cb50003c3f",
      "challenge_id": "9ff51d49-c8d3-4cd5-bab4-f24561d6c0de",
      "phone": "+380670840000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a4f25dc6-eaf0-4841-a1ec-da1e782b9b1d",
      "error": null,
      "attempted_at": "2026-10-28T13:09:37.318208Z"
    },
    {
      "id": "5e82cd02-a2bd-4c9c-83e3-8a816d3b1525",
      "challenge_id": "9ff51d49-c8d3-4cd5-bab4-f24561d6c0de",
      "phone": "+380670840000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T13:09:37.317494Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670840000` → **200**

```json
{
  "phone": "+380670840000",
  "audience": "CLIENT",
  "code": "160602",
  "sent_at": "2026-10-28T13:09:37.317919848Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670110363` → **200**

```json
{
  "deliveries": [
    {
      "id": "ee9c75d7-db81-4f95-a6f9-162cd76dc243",
      "challenge_id": "760802c5-3ddb-4e84-8a58-8c48648a6c88",
      "phone": "+380670110363",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ea0cbc62-b659-437c-9b3c-e9ec375aee5e",
      "error": null,
      "attempted_at": "2026-10-28T13:09:37.128186Z"
    }
  ]
}
```

Done: SMS to +380678098608, a call to +380670110363, SMS then a call to +380670840000.

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
  "session_id": "bba1ccde-f2d1-4077-9367-42323e957110",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4NzgsImlhdCI6MTc5MzE5Mjk3OCwianRpIjoiMTRiOTIzZjEtMjRhOC00Yzc1LWE3NTgtOTg2ZjFjNjNhYmVlIiwic2lkIjoiYmJhMWNjZGUtZjJkMS00MDc3LTkzNjctNDIzMjNlOTU3MTEwIn0.W8j4SoeuuV0FnFRvk2flaIAFXJtIO6h51zb28Pgsds0",
  "access_expires_at": "2026-10-28T13:24:38.556825758Z",
  "refresh_token": "ROkNula7qm01koK7oLfJT3cdQnCqelWxhyUBZm_gCws",
  "refresh_expires_at": "2026-10-29T01:09:38.556407165Z",
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
  "session_id": "d652dcbc-4367-45d5-873c-76c1455d93cf",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4NzgsImlhdCI6MTc5MzE5Mjk3OCwianRpIjoiNzEwMDI2ZTEtZjZiZS00ZTAxLWJiNDMtNGZkMDBjNDRjYzVmIiwic2lkIjoiZDY1MmRjYmMtNDM2Ny00NWQ1LTg3M2MtNzZjMTQ1NWQ5M2NmIn0.1tCCl7DDAbh_13wgdD5W_ok42uP5K6axxf3Gm2IuboY",
  "access_expires_at": "2026-10-28T13:24:38.95234084Z",
  "refresh_token": "stYS7dLEgjbVdxPpi1FAf5F5iMu6TfH2VBQ97hRWyqo",
  "refresh_expires_at": "2026-10-29T01:09:38.951874564Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
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

`POST /api/admin/v1/staff-extensions/84504c0c-64de-41ea-beaa-6c1f491d5457` → **200**

```json
{
  "command_id": "2d05861f-88e6-4513-a0ae-f145a6663918",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "915c95ae-3e9e-4074-992a-595be2b2eb9b",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T13:09:39.775836Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T13:09:39.775836Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a81f2042-860a-49c5-85dc-f15a34b99a9b",
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
  "id": "b3b1fade-eb26-4343-b898-3a44d2bb23d5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:14:40.166691Z",
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
  "command_id": "3ec4bf0e-2a2c-4def-82ff-42d9a9c34cbe",
  "quote_id": "b3b1fade-eb26-4343-b898-3a44d2bb23d5",
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
    "phone": "+380678698606"
  }
}
```

```json
{
  "id": "6522dbd4-fe02-4128-b928-5204b1c26501",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:09:40.366473Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678698606"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/6522dbd4-fe02-4128-b928-5204b1c26501/calls` → **201**

```json
{
  "command_id": "7d0b173c-d130-49d6-a184-b9c7f8ca36c5",
  "to": "CALLER"
}
```

```json
{
  "id": "fa850412-5e53-4542-a1b1-bfeba2a3769e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "order_ids": [
    "6522dbd4-fe02-4128-b928-5204b1c26501"
  ],
  "started_at": "2026-10-28T13:09:40.594884Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/6522dbd4-fe02-4128-b928-5204b1c26501/calls` → **201**

```json
{
  "command_id": "7d0b173c-d130-49d6-a184-b9c7f8ca36c5",
  "to": "CALLER"
}
```

```json
{
  "id": "fa850412-5e53-4542-a1b1-bfeba2a3769e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "order_ids": [
    "6522dbd4-fe02-4128-b928-5204b1c26501"
  ],
  "started_at": "2026-10-28T13:09:40.594884Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "fa850412-5e53-4542-a1b1-bfeba2a3769e",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678698606",
    "at": "2026-10-28T13:09:40.597088023Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "fa850412-5e53-4542-a1b1-bfeba2a3769e",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.19006",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "fa850412-5e53-4542-a1b1-bfeba2a3769e"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "fa850412-5e53-4542-a1b1-bfeba2a3769e",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=6522dbd4-fe02-4128-b928-5204b1c26501` → **200**

```json
{
  "calls": [
    {
      "id": "fa850412-5e53-4542-a1b1-bfeba2a3769e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [
        "6522dbd4-fe02-4128-b928-5204b1c26501"
      ],
      "started_at": "2026-10-28T13:09:40.594884Z",
      "answered_at": "2026-10-28T13:09:41.095872Z",
      "ended_at": "2026-10-28T13:09:41.116006Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6522dbd4-fe02-4128-b928-5204b1c26501` → **200**

```json
{
  "calls": [
    {
      "id": "fa850412-5e53-4542-a1b1-bfeba2a3769e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [
        "6522dbd4-fe02-4128-b928-5204b1c26501"
      ],
      "started_at": "2026-10-28T13:09:40.594884Z",
      "answered_at": "2026-10-28T13:09:41.095872Z",
      "ended_at": "2026-10-28T13:09:41.116006Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6522dbd4-fe02-4128-b928-5204b1c26501` → **200**

```json
{
  "calls": [
    {
      "id": "fa850412-5e53-4542-a1b1-bfeba2a3769e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [
        "6522dbd4-fe02-4128-b928-5204b1c26501"
      ],
      "started_at": "2026-10-28T13:09:40.594884Z",
      "answered_at": "2026-10-28T13:09:41.095872Z",
      "ended_at": "2026-10-28T13:09:41.116006Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6522dbd4-fe02-4128-b928-5204b1c26501` → **200**

```json
{
  "calls": [
    {
      "id": "fa850412-5e53-4542-a1b1-bfeba2a3769e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [
        "6522dbd4-fe02-4128-b928-5204b1c26501"
      ],
      "started_at": "2026-10-28T13:09:40.594884Z",
      "answered_at": "2026-10-28T13:09:41.095872Z",
      "ended_at": "2026-10-28T13:09:41.116006Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6522dbd4-fe02-4128-b928-5204b1c26501` → **200**

```json
{
  "calls": [
    {
      "id": "fa850412-5e53-4542-a1b1-bfeba2a3769e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "order_ids": [
        "6522dbd4-fe02-4128-b928-5204b1c26501"
      ],
      "started_at": "2026-10-28T13:09:40.594884Z",
      "answered_at": "2026-10-28T13:09:41.095872Z",
      "ended_at": "2026-10-28T13:09:41.116006Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:09:48.222762Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/6522dbd4-fe02-4128-b928-5204b1c26501` → **200**

```json
{
  "id": "6522dbd4-fe02-4128-b928-5204b1c26501",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:09:40.366473Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678698606"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6522dbd4-fe02-4128-b928-5204b1c26501/cancel` → **200**

```json
{
  "command_id": "40c3e18e-76e2-41a1-97d9-c895609122ef",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6522dbd4-fe02-4128-b928-5204b1c26501",
  "short_number": 18,
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
  "created_at": "2026-10-28T13:09:40.366473Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678698606"
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
  "command_id": "0421475d-4c32-4625-bd74-df833d462cc3",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T13:09:50.616908Z",
  "extension": "101"
}
```

Done: outgoing call fa850412-5e53-4542-a1b1-bfeba2a3769e from order 6522dbd4-fe02-4128-b928-5204b1c26501, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632782993",
  "device_ref": "sandbox-14775"
}
```

```json
{
  "challenge_id": "511f0d46-63fb-4a1c-be6b-62e37839d335",
  "expires_at": "2026-10-28T13:14:50.830065948Z",
  "resend_available_at": "2026-10-28T13:09:51.830065948Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632782993` → **200**

```json
{
  "phone": "+380632782993",
  "audience": "CLIENT",
  "code": "751552",
  "sent_at": "2026-10-28T13:09:50.831966572Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "511f0d46-63fb-4a1c-be6b-62e37839d335",
  "code": "751552",
  "device_ref": "sandbox-14775"
}
```

```json
{
  "session_id": "998aceef-af35-46e6-948d-66346f9396ad",
  "subject": {
    "type": "CLIENT",
    "id": "8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzQ2MjljNS03YThjLTQ3Y2EtYWI3NS04Y2M1YThkOGFkNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODkxLCJpYXQiOjE3OTMxOTI5OTEsImp0aSI6IjAzMzg5YTliLTY3YTItNDY4Zi1hNTEwLTBhYzAyNmZlNzI1ZCIsInNpZCI6Ijk5OGFjZWVmLWFmMzUtNDZlNi05NDhkLTY2MzQ2ZjkzOTZhZCJ9.-KdpH9lqwpjMjF4pyT5MnfF_WPXRoeOwkh053uQ3YmI",
  "access_expires_at": "2026-10-28T13:24:51.048655176Z",
  "refresh_token": "Z4fDTB9Nov15wjwvbOzoLF5GzOvBexeWmL-ftwK4oMY",
  "refresh_expires_at": "2026-11-27T13:09:51.04825783Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e",
  "session_id": "998aceef-af35-46e6-948d-66346f9396ad",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632782993",
  "device_ref": "sandbox-6623"
}
```

```json
{
  "challenge_id": "073d9786-cbaf-455e-a29c-732f77b996f6",
  "expires_at": "2026-10-28T13:14:53.430006048Z",
  "resend_available_at": "2026-10-28T13:09:54.430006048Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632782993` → **200**

```json
{
  "phone": "+380632782993",
  "audience": "CLIENT",
  "code": "532541",
  "sent_at": "2026-10-28T13:09:53.431542486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "073d9786-cbaf-455e-a29c-732f77b996f6",
  "code": "532541",
  "device_ref": "sandbox-6623"
}
```

```json
{
  "session_id": "8cae0ae9-1c69-4550-8df6-35a0f191a5fc",
  "subject": {
    "type": "CLIENT",
    "id": "8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzQ2MjljNS03YThjLTQ3Y2EtYWI3NS04Y2M1YThkOGFkNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODkzLCJpYXQiOjE3OTMxOTI5OTMsImp0aSI6Ijg0NTQ4YWFiLTg3NDgtNDBlMi1hZDM3LTRiMTQyNzQzNGY2NyIsInNpZCI6IjhjYWUwYWU5LTFjNjktNDU1MC04ZGY2LTM1YTBmMTkxYTVmYyJ9.TR2H67izrcth3muqpF6KDKCCAE1pnYdvULBIKSz2TwQ",
  "access_expires_at": "2026-10-28T13:24:53.656604288Z",
  "refresh_token": "ZjpO9FU6aCF6BiIoc8YzqbqIzKBDtPO-MTe0HF2kDiI",
  "refresh_expires_at": "2026-11-27T13:09:53.656168975Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "b8422a9a-be67-47f1-9ebd-480538fb7c7a",
  "expires_at": "2026-10-28T13:14:55.863158286Z",
  "resend_available_at": "2026-10-28T13:09:56.863158286Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632782993` → **200**

```json
{
  "phone": "+380632782993",
  "audience": "CLIENT",
  "code": "024038",
  "sent_at": "2026-10-28T13:09:55.864713468Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639365734"
}
```

```json
{
  "challenge_id": "f102c5ba-054d-468b-b1a6-83730528e54f",
  "expires_at": "2026-10-28T13:14:56.063447825Z",
  "resend_available_at": "2026-10-28T13:09:57.063447825Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639365734` → **200**

```json
{
  "phone": "+380639365734",
  "audience": "CLIENT",
  "code": "323620",
  "sent_at": "2026-10-28T13:09:56.064764873Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "3e8b7b8f-5464-446d-9f9e-61a15e5ad7b9",
  "current_challenge_id": "b8422a9a-be67-47f1-9ebd-480538fb7c7a",
  "current_code": "000000",
  "new_challenge_id": "f102c5ba-054d-468b-b1a6-83730528e54f",
  "new_code": "323620"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "b2262112-54a9-48c2-b856-85e236217980"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "63db68a7-3ebc-4c36-a1a0-a6f70f342182",
  "current_challenge_id": "b8422a9a-be67-47f1-9ebd-480538fb7c7a",
  "current_code": "024038",
  "new_challenge_id": "f102c5ba-054d-468b-b1a6-83730528e54f",
  "new_code": "323620"
}
```

```json
{
  "subject_id": "8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e",
  "phone": "+380639365734",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e",
  "session_id": "998aceef-af35-46e6-948d-66346f9396ad",
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
  "correlation_id": "fa09fb0c-e811-432a-96b9-f1f4ed9e6baa"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639365734",
  "device_ref": "sandbox-9383"
}
```

```json
{
  "challenge_id": "bba680b9-a359-4da6-9678-041042e1df12",
  "expires_at": "2026-10-28T13:14:59.01642742Z",
  "resend_available_at": "2026-10-28T13:10:00.01642742Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639365734` → **200**

```json
{
  "phone": "+380639365734",
  "audience": "CLIENT",
  "code": "720583",
  "sent_at": "2026-10-28T13:09:59.018117367Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bba680b9-a359-4da6-9678-041042e1df12",
  "code": "720583",
  "device_ref": "sandbox-9383"
}
```

```json
{
  "session_id": "9cf6f02a-8ad3-48ed-8d05-006b2f3ab3d2",
  "subject": {
    "type": "CLIENT",
    "id": "8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzQ2MjljNS03YThjLTQ3Y2EtYWI3NS04Y2M1YThkOGFkNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzODk5LCJpYXQiOjE3OTMxOTI5OTksImp0aSI6IjFjNDdkYjhiLTY3OTYtNDg2MC05ZTY4LTI4MzgxOWQ4NWFkZCIsInNpZCI6IjljZjZmMDJhLThhZDMtNDhlZC04ZDA1LTAwNmIyZjNhYjNkMiJ9.B_wnU_gQz7vP3PFQiEl6DUqFfNb5EaH2geS0K0gU9c4",
  "access_expires_at": "2026-10-28T13:24:59.226656052Z",
  "refresh_token": "Qwbxd2nBHJrCmVOQZc1nYw2Gmwr62o_qxyHYPcH9tKs",
  "refresh_expires_at": "2026-11-27T13:09:59.226261776Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e",
  "session_id": "9cf6f02a-8ad3-48ed-8d05-006b2f3ab3d2",
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
  "session_id": "94d0eb12-8d67-4e5b-9485-e0435c9b9428",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM4OTksImlhdCI6MTc5MzE5Mjk5OSwianRpIjoiNmNkYWMzOTktMzVlMS00YzJmLWFlNDItNDFlNjkzYjBkM2QzIiwic2lkIjoiOTRkMGViMTItOGQ2Ny00ZTViLTk0ODUtZTA0MzVjOWI5NDI4In0.bdi69inclG11UOj_nCtg9D5_TIO-aEwid4gUBYLJ-3Q",
  "access_expires_at": "2026-10-28T13:24:59.802817175Z",
  "refresh_token": "CQXh-efjE-d58oj_yqME8o1GGKA5VJBLtS9CipvODCM",
  "refresh_expires_at": "2026-10-29T01:09:59.802477521Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e` → **200**

```json
{
  "client": {
    "id": "8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e",
    "phone": "+380639365734",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T13:09:51.046799Z",
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

`POST /api/admin/v1/clients/8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e/phone` → **400**

```json
{
  "command_id": "1b71d8a2-91be-417d-ab2e-66fd7edaa163",
  "expected_version": 3,
  "phone": "+380637059377",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d7383298-9257-4da3-9bd7-8ace70246fa9",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e/phone` → **200**

```json
{
  "command_id": "c5c61795-3864-4d73-8554-803c53bbaddc",
  "expected_version": 3,
  "phone": "+380637059377",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e",
  "phone": "+380637059377",
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
  "correlation_id": "c3f79d7c-b55b-4936-ad46-282768924ad1"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637059377",
  "device_ref": "sandbox-28963"
}
```

```json
{
  "challenge_id": "0d4ef293-adeb-408b-a3d6-90d6b96e3712",
  "expires_at": "2026-10-28T13:15:00.812832993Z",
  "resend_available_at": "2026-10-28T13:10:01.812832993Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637059377` → **200**

```json
{
  "phone": "+380637059377",
  "audience": "CLIENT",
  "code": "217873",
  "sent_at": "2026-10-28T13:10:00.814720209Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d4ef293-adeb-408b-a3d6-90d6b96e3712",
  "code": "217873",
  "device_ref": "sandbox-28963"
}
```

```json
{
  "session_id": "0b605642-51c4-4e33-a91b-aeae0db9a566",
  "subject": {
    "type": "CLIENT",
    "id": "8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzQ2MjljNS03YThjLTQ3Y2EtYWI3NS04Y2M1YThkOGFkNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzOTAxLCJpYXQiOjE3OTMxOTMwMDEsImp0aSI6IjQxY2E0MDIyLTE1NDQtNDUzZC1hY2M3LWZlZWRjMTg1YWIwMSIsInNpZCI6IjBiNjA1NjQyLTUxYzQtNGUzMy1hOTFiLWFlYWUwZGI5YTU2NiJ9._r3rPO04Lp7wQOrWdv3FVafjRuGZ73y_rQ6hGYkgjMw",
  "access_expires_at": "2026-10-28T13:25:01.036059921Z",
  "refresh_token": "tiHqQn5oYieFwnu2j3YtDwhOQhtbpa8s9C-2PBd1GMA",
  "refresh_expires_at": "2026-11-27T13:10:01.035578562Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8c4629c5-7a8c-47ca-ab75-8cc5a8d8ad6e",
  "session_id": "0b605642-51c4-4e33-a91b-aeae0db9a566",
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
  "phone": "+380632744878",
  "device_ref": "sandbox-5551"
}
```

```json
{
  "challenge_id": "1a158de2-3b75-4a20-a8cc-1e8239d9f02e",
  "expires_at": "2026-10-28T13:15:01.424580342Z",
  "resend_available_at": "2026-10-28T13:10:02.424580342Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632744878` → **200**

```json
{
  "phone": "+380632744878",
  "audience": "CLIENT",
  "code": "781237",
  "sent_at": "2026-10-28T13:10:01.426438419Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a158de2-3b75-4a20-a8cc-1e8239d9f02e",
  "code": "781237",
  "device_ref": "sandbox-5551"
}
```

```json
{
  "session_id": "dda36494-8c23-497a-8ea0-ef89a8b3cf68",
  "subject": {
    "type": "CLIENT",
    "id": "3283c6aa-d9c5-4d9a-b1cd-a72d33270e48"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMjgzYzZhYS1kOWM1LTRkOWEtYjFjZC1hNzJkMzMyNzBlNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzOTAxLCJpYXQiOjE3OTMxOTMwMDEsImp0aSI6IjA3MDIyNmZlLTg5NjYtNGY2NC1hMjlkLWE3NmRjZTZjMDBhYyIsInNpZCI6ImRkYTM2NDk0LThjMjMtNDk3YS04ZWEwLWVmODlhOGIzY2Y2OCJ9._O3bKYsEYiQ7KHxSnlAtPQFwH4jdp6LeESXDJgkYF-I",
  "access_expires_at": "2026-10-28T13:25:01.637136362Z",
  "refresh_token": "X_KtTvjOne8uAnKmvBoEIghJvkXGoGB5oM4S1JEum1w",
  "refresh_expires_at": "2026-11-27T13:10:01.636736857Z",
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
  "session_id": "248865fb-b9cf-493e-82fd-b6613e55d873",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MDIsImlhdCI6MTc5MzE5MzAwMiwianRpIjoiY2IyNTdjNjEtZjk0Ny00MzY5LTk1MWItMmYzYjk4NDVhYTQ0Iiwic2lkIjoiMjQ4ODY1ZmItYjljZi00OTNlLTgyZmQtYjY2MTNlNTVkODczIn0.EVG4wTpbMfCw4AEbBcIw7nhWzBB4xWdHJVr-q-HAAGk",
  "access_expires_at": "2026-10-28T13:25:02.405138107Z",
  "refresh_token": "xVxq7J4xANsqHrwoCIGFphihajKB2GMhQxkytBHyfug",
  "refresh_expires_at": "2026-10-29T01:10:02.404730776Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632744878` → **200**

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
  "correlation_id": "29eacf29-e0bd-4378-96b4-7f0dfb5a386e"
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
  "session_id": "37446a48-a09e-47ec-a1f6-bbfd166ac7e2",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MDMsImlhdCI6MTc5MzE5MzAwMywianRpIjoiYTYyYTdmMzMtMGZjNi00MDZiLTg3NzQtZDU1NWZiNGU2MjYxIiwic2lkIjoiMzc0NDZhNDgtYTA5ZS00N2VjLWExZjYtYmJmZDE2NmFjN2UyIn0.y_zau2DosJqC6AQZYN2mitpirtFHd1QHYHVAAf7RQI0",
  "access_expires_at": "2026-10-28T13:25:03.186948308Z",
  "refresh_token": "Gt5pjARfu92C3O1eNR_hWr-hd-daKdcewy8gMHyoSaU",
  "refresh_expires_at": "2026-10-29T01:10:03.186540611Z",
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
  "command_id": "5be637a6-d034-44b4-b22b-c0951d9f036c",
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
  "changed_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T13:10:03.55853767Z"
}
```

## The rider books the airport for 2026-10-28T16:10:02Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600786903",
  "device_ref": "sandbox-5829"
}
```

```json
{
  "challenge_id": "695c23c4-66c8-4159-923e-a089f07e67f3",
  "expires_at": "2026-10-28T13:15:03.739162164Z",
  "resend_available_at": "2026-10-28T13:10:04.739162164Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600786903` → **200**

```json
{
  "phone": "+48600786903",
  "audience": "CLIENT",
  "code": "435658",
  "sent_at": "2026-10-28T13:10:03.740900404Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "695c23c4-66c8-4159-923e-a089f07e67f3",
  "code": "435658",
  "device_ref": "sandbox-5829"
}
```

```json
{
  "session_id": "260b95eb-46a0-425b-bfc3-50f60e41a308",
  "subject": {
    "type": "CLIENT",
    "id": "0dd48be0-7d1a-4539-beb3-5113632a1f88"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGQ0OGJlMC03ZDFhLTQ1MzktYmViMy01MTEzNjMyYTFmODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzOTAzLCJpYXQiOjE3OTMxOTMwMDMsImp0aSI6ImU1YzU2MjRjLTRlZmQtNDkzMS1iMzI4LTA4MjYxZTg5MDU0NSIsInNpZCI6IjI2MGI5NWViLTQ2YTAtNDI1Yi1iZmMzLTUwZjYwZTQxYTMwOCJ9.SaxDemVZv3H97HR2BBYb84Ej8Wccn_BtYMoCqWsMUyg",
  "access_expires_at": "2026-10-28T13:25:03.936499359Z",
  "refresh_token": "WJO99KNBjsB7Oybnnmc2F-iiVthRbEJqpeg1PAJrxvA",
  "refresh_expires_at": "2026-11-27T13:10:03.936142259Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "90308985-882b-48b1-b4af-650e0170358c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T16:10:02Z"
}
```

```json
{
  "id": "e8c2366e-48bb-4d6a-9287-0f77cc8cfb39",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:15:04.117394Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T16:10:02Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3f3c243c-2b5f-4f26-ad9f-7b2cc6490595",
  "quote_id": "e8c2366e-48bb-4d6a-9287-0f77cc8cfb39",
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
  "pickup_at": "2026-10-28T16:10:02Z"
}
```

```json
{
  "id": "9126b1cc-98b8-48bd-b025-ed8dc4b2c711",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0dd48be0-7d1a-4539-beb3-5113632a1f88",
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
  "created_at": "2026-10-28T13:10:04.299635Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:10:02Z",
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
  "device_ref": "sandbox-9912"
}
```

```json
{
  "challenge_id": "c595a317-18c2-4ce1-a996-2317a8dbbfe9",
  "expires_at": "2026-10-28T13:15:04.482487177Z",
  "resend_available_at": "2026-10-28T13:10:05.482487177Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "610551",
  "sent_at": "2026-10-28T13:10:04.484243775Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c595a317-18c2-4ce1-a996-2317a8dbbfe9",
  "code": "610551",
  "device_ref": "sandbox-9912"
}
```

```json
{
  "session_id": "1f5acf06-5f9a-4e6c-a4c1-cc3fa0c3e704",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzkwNCwiaWF0IjoxNzkzMTkzMDA0LCJqdGkiOiI0YzdkNjI4NC0xY2U4LTRiNTMtOTBkZi0wNTllYTVkYjYxNDgiLCJzaWQiOiIxZjVhY2YwNi01ZjlhLTRlNmMtYTRjMS1jYzNmYTBjM2U3MDQifQ.FdC7avPzUfycA7EgKjBF5LUPhxT9GocNhsQXiXsSwpE",
  "access_expires_at": "2026-10-28T13:25:04.682818904Z",
  "refresh_token": "JAcH6APXBdiJqK9222mtcX5YYevNwSXyU34rHf1wB-o",
  "refresh_expires_at": "2026-11-27T13:10:04.682184218Z",
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
  "command_id": "8c48a709-769b-49d9-adf9-1e45e11f9bd1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:10:05Z",
    "sequence": 1793193005334
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "9454c141-5b95-490b-a2ec-b7fe669d16d0",
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
  "last_heartbeat_at": "2026-10-28T13:10:05.049054Z",
  "last_location_at": "2026-10-28T13:10:05.049054Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "9126b1cc-98b8-48bd-b025-ed8dc4b2c711",
      "short_number": 19,
      "pickup_at": "2026-10-28T16:10:02Z",
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

`POST /api/driver/v1/preorders/9126b1cc-98b8-48bd-b025-ed8dc4b2c711/reserve` → **200**

```json
{
  "command_id": "5314fbbe-836d-42e2-a983-e380ee7a2109"
}
```

```json
{
  "id": "40f480a5-d9a3-49a2-933d-59c940b68d33",
  "state": "RESERVED",
  "order": {
    "order_id": "9126b1cc-98b8-48bd-b025-ed8dc4b2c711",
    "short_number": 19,
    "pickup_at": "2026-10-28T16:10:02Z",
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
  "reserved_at": "2026-10-28T13:10:05.426114Z",
  "confirm_from": "2026-10-28T15:40:02Z",
  "confirm_until": "2026-10-28T15:50:02Z",
  "drop_until": "2026-10-28T15:10:02Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "40f480a5-d9a3-49a2-933d-59c940b68d33",
      "state": "RESERVED",
      "order": {
        "order_id": "9126b1cc-98b8-48bd-b025-ed8dc4b2c711",
        "short_number": 19,
        "pickup_at": "2026-10-28T16:10:02Z",
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
      "reserved_at": "2026-10-28T13:10:05.426114Z",
      "confirm_from": "2026-10-28T15:40:02Z",
      "confirm_until": "2026-10-28T15:50:02Z",
      "drop_until": "2026-10-28T15:10:02Z"
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
      "id": "40f480a5-d9a3-49a2-933d-59c940b68d33",
      "state": "RESERVED",
      "order": {
        "order_id": "9126b1cc-98b8-48bd-b025-ed8dc4b2c711",
        "short_number": 19,
        "pickup_at": "2026-10-28T16:10:02Z",
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
      "reserved_at": "2026-10-28T13:10:05.426114Z",
      "confirm_from": "2026-10-28T15:40:02Z",
      "confirm_until": "2026-10-28T15:50:02Z",
      "drop_until": "2026-10-28T15:10:02Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/40f480a5-d9a3-49a2-933d-59c940b68d33/confirm` → **409**

```json
{
  "command_id": "088f3519-7f11-491e-9a22-5c0386078710"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/40f480a5-d9a3-49a2-933d-59c940b68d33/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9922a4a8-c6de-4185-83e7-a66262f73fd6"
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
  "session_id": "a606aa30-922f-48d1-83f9-74c8e2000cd9",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MDYsImlhdCI6MTc5MzE5MzAwNiwianRpIjoiNmZjNzFkYTQtMmM2YS00MzM2LWIxZjMtZDNhZGJmMjEwYjhjIiwic2lkIjoiYTYwNmFhMzAtOTIyZi00OGQxLTgzZjktNzRjOGUyMDAwY2Q5In0.63M1AWiiy6TpOUcypOHCorU9MuvMsoBmIamWP7uCGk4",
  "access_expires_at": "2026-10-28T13:25:06.356864273Z",
  "refresh_token": "tsmwnXbyWjcn4ZSltBJUI_GUaDAeLVCqvXrQUvO3hic",
  "refresh_expires_at": "2026-10-29T01:10:06.356512861Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9126b1cc-98b8-48bd-b025-ed8dc4b2c711` → **200**

```json
{
  "id": "9126b1cc-98b8-48bd-b025-ed8dc4b2c711",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "0dd48be0-7d1a-4539-beb3-5113632a1f88",
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
  "created_at": "2026-10-28T13:10:04.299635Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T16:10:02Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "40f480a5-d9a3-49a2-933d-59c940b68d33",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T13:10:05.426114Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9126b1cc-98b8-48bd-b025-ed8dc4b2c711/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T13:10:04.300479Z",
      "actor": {
        "type": "CLIENT",
        "id": "0dd48be0-7d1a-4539-beb3-5113632a1f88",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "9126b1cc-98b8-48bd-b025-ed8dc4b2c711",
        "preorder": true,
        "quote_id": "e8c2366e-48bb-4d6a-9287-0f77cc8cfb39",
        "pickup_at": "2026-10-28T16:10:02Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "aebca478-e6a2-40d0-a760-290ee325fb0c"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T13:10:05.426998Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9126b1cc-98b8-48bd-b025-ed8dc4b2c711",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "40f480a5-d9a3-49a2-933d-59c940b68d33"
      },
      "correlation_id": "65bfb8ed-6466-48e1-b42f-91b571610307"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 9126b1cc-98b8-48bd-b025-ed8dc4b2c711, reservation 40f480a5-d9a3-49a2-933d-59c940b68d33.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8715"
}
```

```json
{
  "challenge_id": "35f37878-fe6c-4b2f-b204-b5e4f84b0660",
  "expires_at": "2026-10-28T13:15:06.916928949Z",
  "resend_available_at": "2026-10-28T13:10:07.916928949Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "965087",
  "sent_at": "2026-10-28T13:10:06.91886552Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35f37878-fe6c-4b2f-b204-b5e4f84b0660",
  "code": "965087",
  "device_ref": "sandbox-8715"
}
```

```json
{
  "session_id": "0cf65a0a-624c-42ce-81f2-eb0a13f48868",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzkwNywiaWF0IjoxNzkzMTkzMDA3LCJqdGkiOiIyMjBkMzM5ZS03NTE3LTQ0NGQtODNhZC03ZWU1NDg3ZTk5ZWMiLCJzaWQiOiIwY2Y2NWEwYS02MjRjLTQyY2UtODFmMi1lYjBhMTNmNDg4NjgifQ.qGlZDH2RY6dbzHfnmJ41n_QAq1wORy6dtCMUBlGzviE",
  "access_expires_at": "2026-10-28T13:25:07.117560943Z",
  "refresh_token": "zYBXvLrgxMV8eG-vbPqTHA9xx_lUKNCxc8rG0CEpG_s",
  "refresh_expires_at": "2026-11-27T13:10:07.117173046Z",
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
  "command_id": "a70a6661-afe2-4b1a-a589-08225b5beadf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:10:07Z",
    "sequence": 1793193007463
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1be00925-e58b-4058-be93-fbea630f47c5",
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
  "last_heartbeat_at": "2026-10-28T13:10:07.47799Z",
  "last_location_at": "2026-10-28T13:10:07.47799Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671861614",
  "device_ref": "sandbox-10490"
}
```

```json
{
  "challenge_id": "1148aaa9-5ce4-4c84-bdfb-492aa5cf5f32",
  "expires_at": "2026-10-28T13:15:07.651803513Z",
  "resend_available_at": "2026-10-28T13:10:08.651803513Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671861614` → **200**

```json
{
  "phone": "+380671861614",
  "audience": "CLIENT",
  "code": "574283",
  "sent_at": "2026-10-28T13:10:07.653474381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1148aaa9-5ce4-4c84-bdfb-492aa5cf5f32",
  "code": "574283",
  "device_ref": "sandbox-10490"
}
```

```json
{
  "session_id": "5902fee9-1680-4a8b-b577-bfaae2ab2935",
  "subject": {
    "type": "CLIENT",
    "id": "dc77ec95-a22e-4196-9a43-03f931cffbbc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYzc3ZWM5NS1hMjJlLTQxOTYtOWE0My0wM2Y5MzFjZmZiYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzOTA3LCJpYXQiOjE3OTMxOTMwMDcsImp0aSI6ImFjYTIyYTU3LTY4ODEtNGIzOC1iMTczLTQwMzRjNmI1MTM1NSIsInNpZCI6IjU5MDJmZWU5LTE2ODAtNGE4Yi1iNTc3LWJmYWFlMmFiMjkzNSJ9.uqDHUuU3nEw1prHWtfJq60VER5yfb_Dowr1LsOo1Zu4",
  "access_expires_at": "2026-10-28T13:25:07.849322391Z",
  "refresh_token": "XgCrdcMt4__6swXevCgJe1pbEqKdRvSLWYbBIqv-cYM",
  "refresh_expires_at": "2026-11-27T13:10:07.848926292Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c9492ae1-2fdb-430c-9784-af85302805b2",
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
  "id": "c619ee29-b517-4a9c-be99-eb113455ae35",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:15:08.031555Z",
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
  "command_id": "4da02ddb-43ac-4339-b0b8-7afd30604abd",
  "quote_id": "c619ee29-b517-4a9c-be99-eb113455ae35",
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
  "id": "01501339-00d7-4d95-8ae2-18ef2c19d6fa",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dc77ec95-a22e-4196-9a43-03f931cffbbc",
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
  "created_at": "2026-10-28T13:10:08.222826Z",
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
    "id": "3b343bd9-0994-4349-857b-a2d793fe97e1",
    "order_id": "01501339-00d7-4d95-8ae2-18ef2c19d6fa",
    "expires_at": "2026-10-28T13:10:23.233361Z",
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

`POST /api/driver/v1/offers/3b343bd9-0994-4349-857b-a2d793fe97e1/accept` → **200**

```json
{
  "command_id": "d14bf15f-095b-4c57-b81c-a7753d928d1f"
}
```

```json
{
  "id": "157e6c71-0642-4b9b-8fb9-b77c8a31eff9",
  "order_id": "01501339-00d7-4d95-8ae2-18ef2c19d6fa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "51aa4de3-5c32-4e63-a91a-5fe887292f75",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "51aa4de3-5c32-4e63-a91a-5fe887292f75",
  "order_id": "01501339-00d7-4d95-8ae2-18ef2c19d6fa",
  "assignment_id": "157e6c71-0642-4b9b-8fb9-b77c8a31eff9",
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

`POST /api/driver/v1/work-sessions/1be00925-e58b-4058-be93-fbea630f47c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:10:08Z",
    "sequence": 1793193008969
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1be00925-e58b-4058-be93-fbea630f47c5",
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
  "last_heartbeat_at": "2026-10-28T13:10:08.985708Z",
  "last_location_at": "2026-10-28T13:10:08.985708Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "51aa4de3-5c32-4e63-a91a-5fe887292f75",
  "order_id": "01501339-00d7-4d95-8ae2-18ef2c19d6fa",
  "assignment_id": "157e6c71-0642-4b9b-8fb9-b77c8a31eff9",
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

`POST /api/driver/v1/trips/51aa4de3-5c32-4e63-a91a-5fe887292f75/arrive` → **200**

```json
{
  "command_id": "75991bc4-9a6c-4219-b2be-1b0294e01d1d",
  "expected_version": 0
}
```

```json
{
  "id": "51aa4de3-5c32-4e63-a91a-5fe887292f75",
  "order_id": "01501339-00d7-4d95-8ae2-18ef2c19d6fa",
  "assignment_id": "157e6c71-0642-4b9b-8fb9-b77c8a31eff9",
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
  "arrived_at": "2026-10-28T13:10:09.338504Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/51aa4de3-5c32-4e63-a91a-5fe887292f75/start` → **200**

```json
{
  "command_id": "0069e053-e684-44a4-88fd-b028e228477b",
  "expected_version": 1
}
```

```json
{
  "id": "51aa4de3-5c32-4e63-a91a-5fe887292f75",
  "order_id": "01501339-00d7-4d95-8ae2-18ef2c19d6fa",
  "assignment_id": "157e6c71-0642-4b9b-8fb9-b77c8a31eff9",
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
  "arrived_at": "2026-10-28T13:10:09.338504Z",
  "started_at": "2026-10-28T13:10:09.538304Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1be00925-e58b-4058-be93-fbea630f47c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:10:09Z",
    "sequence": 1793193009739
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1be00925-e58b-4058-be93-fbea630f47c5",
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
  "last_heartbeat_at": "2026-10-28T13:10:09.75555Z",
  "last_location_at": "2026-10-28T13:10:09.75555Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/51aa4de3-5c32-4e63-a91a-5fe887292f75/complete` → **200**

```json
{
  "command_id": "c0949cfd-c184-483b-a95f-9523e262db44",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:10:09Z",
  "cash_received": true
}
```

```json
{
  "id": "51aa4de3-5c32-4e63-a91a-5fe887292f75",
  "order_id": "01501339-00d7-4d95-8ae2-18ef2c19d6fa",
  "assignment_id": "157e6c71-0642-4b9b-8fb9-b77c8a31eff9",
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
  "arrived_at": "2026-10-28T13:10:09.338504Z",
  "started_at": "2026-10-28T13:10:09.538304Z",
  "completed_at": "2026-10-28T13:10:09.942364Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/01501339-00d7-4d95-8ae2-18ef2c19d6fa/rating` → **200**

```json
{
  "command_id": "f71cfe62-6a0f-4468-bc08-e32962ae5ebf",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "01501339-00d7-4d95-8ae2-18ef2c19d6fa",
  "score": 5,
  "created_at": "2026-10-28T13:10:10.142479539Z"
}
```

`POST /api/driver/v1/orders/01501339-00d7-4d95-8ae2-18ef2c19d6fa/rating` → **200**

```json
{
  "command_id": "602b4ee8-787c-4d3c-8c51-238e5cd7d728",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "01501339-00d7-4d95-8ae2-18ef2c19d6fa",
  "score": 4,
  "created_at": "2026-10-28T13:10:10.341046702Z"
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
  "session_id": "c4448bbd-9f54-48c3-bb89-a486eef1dbb9",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MTAsImlhdCI6MTc5MzE5MzAxMCwianRpIjoiYmIxNmJmNmMtN2M2Mi00OGEzLWIwZWMtMjg3OGJiZmFlNDY1Iiwic2lkIjoiYzQ0NDhiYmQtOWY1NC00OGMzLWJiODktYTQ4NmVlZjFkYmI5In0.BpSFiZdsTq1EpllqHXWZK2_5L1VMhB9-lAGfQ3hVXOo",
  "access_expires_at": "2026-10-28T13:25:10.913321034Z",
  "refresh_token": "ilUkqFRdyTYR-0c0i3C6mRISEwoGP-JGoLSp5LyKB7E",
  "refresh_expires_at": "2026-10-29T01:10:10.912962692Z",
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
  "session_id": "3bfebb54-bc43-489b-b80d-e05a0fbbea1f",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MTEsImlhdCI6MTc5MzE5MzAxMSwianRpIjoiMmE0ZjVkNDQtNzAzOC00M2IwLWEwOWItZWI2OTQxNjQwZTliIiwic2lkIjoiM2JmZWJiNTQtYmM0My00ODliLWI4MGQtZTA1YTBmYmJlYTFmIn0.au7DETzPATyHG4LpRpBel_zvEdfxLEmbaiJ9CBrTXok",
  "access_expires_at": "2026-10-28T13:25:11.288980798Z",
  "refresh_token": "hMSNmkLMOJjdEzzV4v7X_eXCh2GKwDB9f60fuZuSl8Y",
  "refresh_expires_at": "2026-10-29T01:10:11.288613622Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/01501339-00d7-4d95-8ae2-18ef2c19d6fa/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "01501339-00d7-4d95-8ae2-18ef2c19d6fa",
      "author_type": "RIDER",
      "author_id": "dc77ec95-a22e-4196-9a43-03f931cffbbc",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T13:10:10.14248Z"
    },
    {
      "order_id": "01501339-00d7-4d95-8ae2-18ef2c19d6fa",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "dc77ec95-a22e-4196-9a43-03f931cffbbc",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T13:10:10.341047Z"
    }
  ]
}
```

Done: ratings for order 01501339-00d7-4d95-8ae2-18ef2c19d6fa.

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
  "session_id": "080a3d0b-01a2-4115-89e1-0a29f429ee2b",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MTEsImlhdCI6MTc5MzE5MzAxMSwianRpIjoiY2Y4NzU3ZGItOTU5MS00YWFlLTg1NTgtY2VmNmRjYjlmMDNhIiwic2lkIjoiMDgwYTNkMGItMDFhMi00MTE1LTg5ZTEtMGEyOWY0MjllZTJiIn0.PM1IweGH5m21xqeKryijafMn80oyW6x4PH_vwS-wPd0",
  "access_expires_at": "2026-10-28T13:25:11.863825835Z",
  "refresh_token": "6OD1vtNOBeKeuXXdnTqWagc9wLOgnh8LGGaNyxYUBOs",
  "refresh_expires_at": "2026-10-29T01:10:11.863450838Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "bdf65d13-3384-4686-a9ee-fc513d8715b3",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "8d1efde9-5dd4-4164-85cc-2c072051ee5e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:10:12.046318Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8d1efde9-5dd4-4164-85cc-2c072051ee5e` → **200**

```json
{
  "id": "8d1efde9-5dd4-4164-85cc-2c072051ee5e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:10:12.046318Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8d1efde9-5dd4-4164-85cc-2c072051ee5e` → **200**

```json
{
  "id": "8d1efde9-5dd4-4164-85cc-2c072051ee5e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T13:10:12.046318Z",
  "ready_at": "2026-10-28T13:10:13.246208Z",
  "expires_at": "2026-10-29T13:10:13.246208Z"
}
```

`GET /api/admin/v1/reports/exports/8d1efde9-5dd4-4164-85cc-2c072051ee5e/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,19,7,12,0,0,14,5,0,17,1,0,1,6,1,5
total,19,7,12,0,0,14,5,0,17,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "62cd92ff-1e13-4e21-b903-634a04a08b4a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "f1d8d196-03ee-4b19-ba40-77e25d6365f2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:10:13.634567Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f1d8d196-03ee-4b19-ba40-77e25d6365f2` → **200**

```json
{
  "id": "f1d8d196-03ee-4b19-ba40-77e25d6365f2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:10:13.634567Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f1d8d196-03ee-4b19-ba40-77e25d6365f2` → **200**

```json
{
  "id": "f1d8d196-03ee-4b19-ba40-77e25d6365f2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:10:13.634567Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f1d8d196-03ee-4b19-ba40-77e25d6365f2` → **200**

```json
{
  "id": "f1d8d196-03ee-4b19-ba40-77e25d6365f2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:10:13.634567Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f1d8d196-03ee-4b19-ba40-77e25d6365f2` → **200**

```json
{
  "id": "f1d8d196-03ee-4b19-ba40-77e25d6365f2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:10:13.634567Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f1d8d196-03ee-4b19-ba40-77e25d6365f2` → **200**

```json
{
  "id": "f1d8d196-03ee-4b19-ba40-77e25d6365f2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T13:10:13.634567Z",
  "ready_at": "2026-10-28T13:10:18.252274Z",
  "expires_at": "2026-10-29T13:10:18.252274Z"
}
```

`GET /api/admin/v1/reports/exports/f1d8d196-03ee-4b19-ba40-77e25d6365f2/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,7,1014.06,130.74,152.13,861.93,10.52,0.00,162.97,20.00,689.83,25.00,0.00
total,UAH,7,1014.06,130.74,152.13,861.93,10.52,0.00,162.97,20.00,689.83,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/e6204e87-474f-4dd1-91fc-217d126e3d0f` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/e6204e87-474f-4dd1-91fc-217d126e3d0f",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "26b025ef-995f-4c35-a61d-3a08ec40c141"
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
  "device_ref": "sandbox-6655"
}
```

```json
{
  "challenge_id": "12bef856-b48f-4aff-8e1b-9a165df47462",
  "expires_at": "2026-10-28T13:15:18.919652913Z",
  "resend_available_at": "2026-10-28T13:10:19.919652913Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "939965",
  "sent_at": "2026-10-28T13:10:18.921350581Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12bef856-b48f-4aff-8e1b-9a165df47462",
  "code": "939965",
  "device_ref": "sandbox-6655"
}
```

```json
{
  "session_id": "4c5ef897-bd54-4bbc-8001-6df235e61ebf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzkxOSwiaWF0IjoxNzkzMTkzMDE5LCJqdGkiOiJiMzAyYzVjOC0yY2MyLTQ1MTMtYWRmNC1iNjZmZTU3OTM3MTEiLCJzaWQiOiI0YzVlZjg5Ny1iZDU0LTRiYmMtODAwMS02ZGYyMzVlNjFlYmYifQ.tQ0mgjZ1y_UsaRrmtG2B93kqWCJmD5MUn8B2S9LGU7k",
  "access_expires_at": "2026-10-28T13:25:19.112709434Z",
  "refresh_token": "IuSsSwIW0XDSDmyq7_HkL9M9dRLsYRldpC89pWXhcLo",
  "refresh_expires_at": "2026-11-27T13:10:19.112363701Z",
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
  "command_id": "1d7d185a-e54a-4468-b4c5-a5a22d2eb808",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:10:19Z",
    "sequence": 1793193019630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2bfaffea-81a6-4ca2-ba65-17e73bdd6042",
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
  "last_heartbeat_at": "2026-10-28T13:10:19.645672Z",
  "last_location_at": "2026-10-28T13:10:19.645672Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "58fa4217-6513-46b2-8d12-7f71fea6ae87",
  "points": [
    {
      "sequence": 1793193021824,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T13:09:21Z"
    },
    {
      "sequence": 1793193021830,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T13:10:21Z"
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
  "session_id": "2a1134b8-acb3-4bbc-8334-9dfc54eb5042",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MjIsImlhdCI6MTc5MzE5MzAyMiwianRpIjoiYmQ4NWZjZDUtZmI5Yi00MjM3LWFkYjUtMjhlZGZhYzk2ZGMzIiwic2lkIjoiMmExMTM0YjgtYWNiMy00YmJjLTgzMzQtOWRmYzU0ZWI1MDQyIn0.5kYYKJfZprxYg1xlNlsmt4p8f3eM2a6nY5ILCqHAubk",
  "access_expires_at": "2026-10-28T13:25:22.241636429Z",
  "refresh_token": "sdWgW2cJTELuMi2aM0SxymA0zsAtUogoA7TE3ffl6Hk",
  "refresh_expires_at": "2026-10-29T01:10:22.241334622Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "ecd263cc-f894-4193-a0d5-2a42d9c5a581",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T13:10:21Z",
        "track_point_id": "07cc3cd4-fe5c-4d00-add5-dd93af42597f",
        "work_session_id": "2bfaffea-81a6-4ca2-ba65-17e73bdd6042"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T13:10:21Z",
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

`POST /api/admin/v1/driver-risk-flags/ecd263cc-f894-4193-a0d5-2a42d9c5a581/confirm` → **200**

```json
{
  "command_id": "5515c63f-48bc-4e3b-94d9-6e74d4c1bac1",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "ecd263cc-f894-4193-a0d5-2a42d9c5a581",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T13:10:21Z",
    "track_point_id": "07cc3cd4-fe5c-4d00-add5-dd93af42597f",
    "work_session_id": "2bfaffea-81a6-4ca2-ba65-17e73bdd6042"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T13:10:21Z",
  "reason": null,
  "reviewed_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "reviewed_at": "2026-10-28T13:10:22.833421Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/ecd263cc-f894-4193-a0d5-2a42d9c5a581/dismiss` → **409**

```json
{
  "command_id": "44c34998-8cd5-4df7-80f7-37a21fe6b816",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/ecd263cc-f894-4193-a0d5-2a42d9c5a581/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3b55c196-57f8-4ff1-8d7a-2a04eedd5150"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "a24b45da-339b-4081-b84c-a6697af26b82",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "3cdd126d-a530-4bd5-b61f-6591afc08d41",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "raised_at": "2026-10-28T13:10:23.243065Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/3cdd126d-a530-4bd5-b61f-6591afc08d41/dismiss` → **200**

```json
{
  "command_id": "a360a80e-6489-4454-ad6a-982fd6efcea7",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "3cdd126d-a530-4bd5-b61f-6591afc08d41",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "raised_at": "2026-10-28T13:10:23.243065Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "reviewed_at": "2026-10-28T13:10:23.433515Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "1f70b9d7-68a0-49b9-a251-cda4ebc7dc60",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "ecd263cc-f894-4193-a0d5-2a42d9c5a581"
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
      "actor_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:10:23.626308Z"
    }
  ]
}
```

Done: flag ecd263cc-f894-4193-a0d5-2a42d9c5a581 confirmed, suspension named it, driver reinstated.

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
  "session_id": "3d5c85a2-a236-47ff-9616-b77f82072379",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MjQsImlhdCI6MTc5MzE5MzAyNCwianRpIjoiMTVmNjU3NWUtZDNkYi00MmIxLWEyMGMtNmQzYzMyNjhlNDNlIiwic2lkIjoiM2Q1Yzg1YTItYTIzNi00N2ZmLTk2MTYtYjc3ZjgyMDcyMzc5In0.wgKdAuMkSKqXYJdO4S7_mTu875LXJr7bzPU6_enPiqU",
  "access_expires_at": "2026-10-28T13:25:24.191637317Z",
  "refresh_token": "TnBWw31dAHHlvPogUHn4tcNhYzgGRwOjnwhalFuekWg",
  "refresh_expires_at": "2026-10-29T01:10:24.191298264Z",
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
      "actor_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:10:23.626308Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "2e06b814-cb70-46b6-aa28-6db71f55033c",
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
  "session_id": "2bfaffea-81a6-4ca2-ba65-17e73bdd6042",
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
  "last_heartbeat_at": "2026-10-28T13:10:19.645672Z",
  "last_location_at": "2026-10-28T13:10:19.645672Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2bfaffea-81a6-4ca2-ba65-17e73bdd6042/close` → **200**

```json
{
  "command_id": "d0aa0deb-ee0f-400d-b55a-2e7a24da106c",
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
  "session_id": "2937d214-0b72-4907-bf22-908f2ef2bab8",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MjUsImlhdCI6MTc5MzE5MzAyNSwianRpIjoiMWY5Y2MwYTgtZjViNS00ZjZiLWFjY2EtMGZkNDc3MzUzYmQ4Iiwic2lkIjoiMjkzN2QyMTQtMGI3Mi00OTA3LWJmMjItOTA4ZjJlZjJiYWI4In0.Js72RL8SkrpmoasaYgiGtO23VGsKJn-IwMJb8v4Wybg",
  "access_expires_at": "2026-10-28T13:25:25.347220886Z",
  "refresh_token": "J91PTIPl_OiCN9dWG4hKhppBOlmjooICXGqgUlBXUks",
  "refresh_expires_at": "2026-10-29T01:10:25.346871287Z",
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
  "command_id": "59f88f22-a7ca-4a9a-89a6-1489dbcc29da",
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
  "changed_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T13:10:25.71866Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "59f88f22-a7ca-4a9a-89a6-1489dbcc29da",
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
  "changed_by": "84504c0c-64de-41ea-beaa-6c1f491d5457",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T13:10:25.71866Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48526038798",
  "device_ref": "sandbox-14259"
}
```

```json
{
  "challenge_id": "9d8d7b33-8016-47c4-9bde-9c58d3eac57e",
  "expires_at": "2026-10-28T13:15:26.096506772Z",
  "resend_available_at": "2026-10-28T13:10:27.096506772Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48526038798` → **200**

```json
{
  "phone": "+48526038798",
  "audience": "CLIENT",
  "code": "752326",
  "sent_at": "2026-10-28T13:10:26.098462311Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d8d7b33-8016-47c4-9bde-9c58d3eac57e",
  "code": "752326",
  "device_ref": "sandbox-14259"
}
```

```json
{
  "session_id": "2ceadb74-41b3-41bb-a8f2-3b22badb0e0f",
  "subject": {
    "type": "CLIENT",
    "id": "d4d0ed59-8991-4965-87fc-33eca665f663"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGQwZWQ1OS04OTkxLTQ5NjUtODdmYy0zM2VjYTY2NWY2NjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzOTI2LCJpYXQiOjE3OTMxOTMwMjYsImp0aSI6Ijc0ZGRjNDEwLWU3NDQtNDQxOS04MTVlLWVmMmVmODUwNmM2ZCIsInNpZCI6IjJjZWFkYjc0LTQxYjMtNDFiYi1hOGYyLTNiMjJiYWRiMGUwZiJ9.hRuAtUBg4AsWI13KL_Rre-yvwzitzijsFQak9KK0Upk",
  "access_expires_at": "2026-10-28T13:25:26.300611835Z",
  "refresh_token": "88ZY-3Y2NnbgNYHhGy05BeZbul_31z1OKskMNaviEb0",
  "refresh_expires_at": "2026-11-27T13:10:26.300208955Z",
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
  "correlation_id": "33362570-7cf5-4ada-add3-baee56349cde"
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
  "device_ref": "sandbox-18804"
}
```

```json
{
  "challenge_id": "23e45725-35dc-43ad-ad71-eddc83df0d23",
  "expires_at": "2026-10-28T13:15:26.837656508Z",
  "resend_available_at": "2026-10-28T13:10:27.837656508Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "606127",
  "sent_at": "2026-10-28T13:10:26.839328197Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23e45725-35dc-43ad-ad71-eddc83df0d23",
  "code": "606127",
  "device_ref": "sandbox-18804"
}
```

```json
{
  "session_id": "20eebe93-2540-4ab2-8d59-2b2bb6f9c057",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzkyNywiaWF0IjoxNzkzMTkzMDI3LCJqdGkiOiJiZmMxNzVkNi0yOTM4LTRmNjItODgzMi04Y2QzYTZkNDc1YWMiLCJzaWQiOiIyMGVlYmU5My0yNTQwLTRhYjItOGQ1OS0yYjJiYjZmOWMwNTcifQ.zcfgSeZqIARF3BRM3uuhOXqSWlQ28fOzJWScp40hf94",
  "access_expires_at": "2026-10-28T13:25:27.038272766Z",
  "refresh_token": "8Jb9AxyQPKRu34zzAyTI5NTh8-MQCWIFajZBV_z4cxI",
  "refresh_expires_at": "2026-11-27T13:10:27.037904088Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "9454c141-5b95-490b-a2ec-b7fe669d16d0",
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
  "last_heartbeat_at": "2026-10-28T13:10:05.049054Z",
  "last_location_at": "2026-10-28T13:10:05.049054Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9454c141-5b95-490b-a2ec-b7fe669d16d0/handover` → **200**

```json
{
  "command_id": "76b9fcea-707d-43f5-900b-c854cd6fa258",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "9454c141-5b95-490b-a2ec-b7fe669d16d0",
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
  "last_heartbeat_at": "2026-10-28T13:10:05.049054Z",
  "last_location_at": "2026-10-28T13:10:05.049054Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9454c141-5b95-490b-a2ec-b7fe669d16d0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:10:27Z",
    "sequence": 1793193027572
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "9454c141-5b95-490b-a2ec-b7fe669d16d0",
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
  "last_heartbeat_at": "2026-10-28T13:10:27.595786Z",
  "last_location_at": "2026-10-28T13:10:27.595786Z",
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
  "session_id": "9454c141-5b95-490b-a2ec-b7fe669d16d0",
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
  "last_heartbeat_at": "2026-10-28T13:10:27.595786Z",
  "last_location_at": "2026-10-28T13:10:27.595786Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9454c141-5b95-490b-a2ec-b7fe669d16d0/close` → **200**

```json
{
  "command_id": "d7fb38ca-bb57-4ee5-be61-932f0274f480",
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
  "correlation_id": "c8d86806-8000-41d9-9f76-00b757d0ed75"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678337887",
  "device_ref": "sandbox-23833"
}
```

```json
{
  "challenge_id": "e5b2ef3a-bf53-45e2-82d4-1d40eb536cfb",
  "expires_at": "2026-10-28T13:15:28.503816032Z",
  "resend_available_at": "2026-10-28T13:10:29.503816032Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678337887` → **200**

```json
{
  "phone": "+380678337887",
  "audience": "CLIENT",
  "code": "107170",
  "sent_at": "2026-10-28T13:10:28.505398132Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e5b2ef3a-bf53-45e2-82d4-1d40eb536cfb",
  "code": "107170",
  "device_ref": "sandbox-23833"
}
```

```json
{
  "session_id": "7e87e8d8-ef5b-440b-ab29-6067c11c94f7",
  "subject": {
    "type": "CLIENT",
    "id": "2d6bd7ec-97a6-4da2-b66b-3ff0b6e850c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDZiZDdlYy05N2E2LTRkYTItYjY2Yi0zZmYwYjZlODUwYzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzOTI4LCJpYXQiOjE3OTMxOTMwMjgsImp0aSI6IjMwN2UyZDdjLTVjYjItNGQxMy1hMTFlLWFmZTIzNjY5ZTY1ZCIsInNpZCI6IjdlODdlOGQ4LWVmNWItNDQwYi1hYjI5LTYwNjdjMTFjOTRmNyJ9.XTBB4FNGeUpkgfV4UEerGL3Tp14OyGdKpV3N1nDL2nc",
  "access_expires_at": "2026-10-28T13:25:28.70409807Z",
  "refresh_token": "l9568qt1LZcbYXWREfCQP7m83PmoXpXa1q13GO7XIbI",
  "refresh_expires_at": "2026-11-27T13:10:28.703751445Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "494c3127-82e2-42bd-9023-aab6b74068fb",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "aba200f2-b92d-4fab-82e9-5e1094903dff",
  "upload_path": "/api/rider/v1/uploads/aba200f2-b92d-4fab-82e9-5e1094903dff",
  "expires_at": "2026-10-28T13:25:28.896229791Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/aba200f2-b92d-4fab-82e9-5e1094903dff` → **200**

```json
{
  "file_id": "aba200f2-b92d-4fab-82e9-5e1094903dff",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "9f6112fb-3596-4fed-b34a-daff41ebecbc",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "aba200f2-b92d-4fab-82e9-5e1094903dff"
  ]
}
```

```json
{
  "id": "1c2e9ef0-f12b-477e-b6ea-19941244eaf2",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2d6bd7ec-97a6-4da2-b66b-3ff0b6e850c2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T13:10:29.103584Z",
  "updated_at": "2026-10-28T13:10:29.103584Z",
  "messages": [
    {
      "id": "45cfa81d-2341-4ec2-baec-1c6a00076c67",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2d6bd7ec-97a6-4da2-b66b-3ff0b6e850c2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:10:29.104786Z",
      "attachments": [
        {
          "file_id": "aba200f2-b92d-4fab-82e9-5e1094903dff",
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
  "session_id": "4942e23c-abad-4e8c-b94a-a7ab1480c1f9",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MjksImlhdCI6MTc5MzE5MzAyOSwianRpIjoiYmYwMjc1NmUtM2QzMC00NDJjLTg4ZjQtOTA1ZjA4MDg4Yjg5Iiwic2lkIjoiNDk0MmUyM2MtYWJhZC00ZThjLWI5NGEtYTdhYjE0ODBjMWY5In0.d5JnrdYIpeeAHFSVHVHAYP8tLX9ez-ZpoPabKVw-tNE",
  "access_expires_at": "2026-10-28T13:25:29.507943464Z",
  "refresh_token": "0rKpEP89B75DLv_QOTqgFHWjoEah-6-pwHwQKdxrGJw",
  "refresh_expires_at": "2026-10-29T01:10:29.50757718Z",
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
  "session_id": "c678f3b9-4097-4034-bb6e-24bdf1d1fb36",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MjksImlhdCI6MTc5MzE5MzAyOSwianRpIjoiMTA3NTdlMDYtOTQ3Yy00MTM3LThjYjgtMThlNzliODM4OTBkIiwic2lkIjoiYzY3OGYzYjktNDA5Ny00MDM0LWJiNmUtMjRiZGYxZDFmYjM2In0.E1atWypCHMxpSm-6-f63GT4IQSVlfdtZUILXQ5PAOMI",
  "access_expires_at": "2026-10-28T13:25:29.902955188Z",
  "refresh_token": "Q45Ia-CeX4isl059SPAe2Bhut0EyVQNICduli6663_o",
  "refresh_expires_at": "2026-10-29T01:10:29.902468642Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/1c2e9ef0-f12b-477e-b6ea-19941244eaf2/attachments/aba200f2-b92d-4fab-82e9-5e1094903dff` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "4ea64b2d-6ac4-44f5-ba44-cdb11109e250",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f793e341-5688-4393-a9d4-e2b654eafb9d",
  "upload_path": "/api/operator/v1/uploads/f793e341-5688-4393-a9d4-e2b654eafb9d",
  "expires_at": "2026-10-28T13:25:30.090876698Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/f793e341-5688-4393-a9d4-e2b654eafb9d` → **200**

```json
{
  "file_id": "f793e341-5688-4393-a9d4-e2b654eafb9d",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/1c2e9ef0-f12b-477e-b6ea-19941244eaf2` → **200**

```json
{
  "id": "1c2e9ef0-f12b-477e-b6ea-19941244eaf2",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2d6bd7ec-97a6-4da2-b66b-3ff0b6e850c2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T13:10:29.103584Z",
  "updated_at": "2026-10-28T13:10:29.103584Z",
  "messages": [
    {
      "id": "45cfa81d-2341-4ec2-baec-1c6a00076c67",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2d6bd7ec-97a6-4da2-b66b-3ff0b6e850c2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:10:29.104786Z",
      "attachments": [
        {
          "file_id": "aba200f2-b92d-4fab-82e9-5e1094903dff",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/1c2e9ef0-f12b-477e-b6ea-19941244eaf2/comments` → **200**

```json
{
  "command_id": "d27aaf06-5c2e-41b5-baa8-0e2ec0844930",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "f793e341-5688-4393-a9d4-e2b654eafb9d"
  ]
}
```

```json
{
  "id": "1c2e9ef0-f12b-477e-b6ea-19941244eaf2",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2d6bd7ec-97a6-4da2-b66b-3ff0b6e850c2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T13:10:29.103584Z",
  "updated_at": "2026-10-28T13:10:30.470222Z",
  "messages": [
    {
      "id": "45cfa81d-2341-4ec2-baec-1c6a00076c67",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2d6bd7ec-97a6-4da2-b66b-3ff0b6e850c2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:10:29.104786Z",
      "attachments": [
        {
          "file_id": "aba200f2-b92d-4fab-82e9-5e1094903dff",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "13442e74-c343-49f6-a0c5-c9aa8de3bb5b",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T13:10:30.469965Z",
      "attachments": [
        {
          "file_id": "f793e341-5688-4393-a9d4-e2b654eafb9d",
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

`GET /api/rider/v1/support/cases/1c2e9ef0-f12b-477e-b6ea-19941244eaf2` → **200**

```json
{
  "id": "1c2e9ef0-f12b-477e-b6ea-19941244eaf2",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2d6bd7ec-97a6-4da2-b66b-3ff0b6e850c2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T13:10:29.103584Z",
  "updated_at": "2026-10-28T13:10:30.470222Z",
  "messages": [
    {
      "id": "45cfa81d-2341-4ec2-baec-1c6a00076c67",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2d6bd7ec-97a6-4da2-b66b-3ff0b6e850c2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:10:29.104786Z",
      "attachments": [
        {
          "file_id": "aba200f2-b92d-4fab-82e9-5e1094903dff",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "13442e74-c343-49f6-a0c5-c9aa8de3bb5b",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T13:10:30.469965Z",
      "attachments": [
        {
          "file_id": "f793e341-5688-4393-a9d4-e2b654eafb9d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/1c2e9ef0-f12b-477e-b6ea-19941244eaf2/attachments/f793e341-5688-4393-a9d4-e2b654eafb9d` → **200**

Done: support case 1c2e9ef0-f12b-477e-b6ea-19941244eaf2, rider attachment aba200f2-b92d-4fab-82e9-5e1094903dff, operator attachment f793e341-5688-4393-a9d4-e2b654eafb9d.

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
  "session_id": "3c34875b-e60b-4b34-a051-bf5bce7a1b36",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MzEsImlhdCI6MTc5MzE5MzAzMSwianRpIjoiM2E5NWNmNDgtMjM1ZS00ZTMzLWJlNzItNzUyYWUzYjQzY2JlIiwic2lkIjoiM2MzNDg3NWItZTYwYi00YjM0LWEwNTEtYmY1YmNlN2ExYjM2In0.lYmVAV66DjHXMezr6S9uCSG3EZoTyI51SU88LCC3jM0",
  "access_expires_at": "2026-10-28T13:25:31.077305652Z",
  "refresh_token": "KvmXT235v2vs_J64eiiWE8D7OjMW3boUfALxc8xWwrc",
  "refresh_expires_at": "2026-10-29T01:10:31.076930855Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18803"
}
```

```json
{
  "challenge_id": "24aae8b5-985c-4836-8b32-f533e7b74eb8",
  "expires_at": "2026-10-28T13:15:31.249257793Z",
  "resend_available_at": "2026-10-28T13:10:32.249257793Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "116085",
  "sent_at": "2026-10-28T13:10:31.250657361Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24aae8b5-985c-4836-8b32-f533e7b74eb8",
  "code": "116085",
  "device_ref": "sandbox-18803"
}
```

```json
{
  "session_id": "8dc51fb1-0441-4308-871f-7d1a8a4c697c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzkzMSwiaWF0IjoxNzkzMTkzMDMxLCJqdGkiOiIzODkyNzdhNi1kYTJiLTQ0MmItYTUzMi04ZjA0ZDcxODYyMTEiLCJzaWQiOiI4ZGM1MWZiMS0wNDQxLTQzMDgtODcxZi03ZDFhOGE0YzY5N2MifQ.6M3VlfaWjdiYRZ23CNAlutK0TLr_1wV7O0G6MVT0IrA",
  "access_expires_at": "2026-10-28T13:25:31.446595481Z",
  "refresh_token": "Mq4uhWIl37co8PAhD30iKquvXnU1RWwGp9_b5FX50rE",
  "refresh_expires_at": "2026-11-27T13:10:31.446192521Z",
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
      "actor_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:10:23.626308Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "84504c0c-64de-41ea-beaa-6c1f491d5457",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T13:10:24.556721Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "033f7aa4-9607-4083-be09-e7d1e48b24d0",
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
  "device_ref": "sandbox-24830"
}
```

```json
{
  "challenge_id": "320c4965-02d6-4f37-bd7d-df473ea36abe",
  "expires_at": "2026-10-28T13:15:32.307923606Z",
  "resend_available_at": "2026-10-28T13:10:33.307923606Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "869512",
  "sent_at": "2026-10-28T13:10:32.309712602Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "320c4965-02d6-4f37-bd7d-df473ea36abe",
  "code": "869512",
  "device_ref": "sandbox-24830"
}
```

```json
{
  "session_id": "387d0822-9846-4e85-89e6-235e867050d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzkzMiwiaWF0IjoxNzkzMTkzMDMyLCJqdGkiOiIzN2Y4Zjk4MC03ZGNkLTQxNzItYmUwZi1lOTlmYzcwYWM1YzciLCJzaWQiOiIzODdkMDgyMi05ODQ2LTRlODUtODllNi0yMzVlODY3MDUwZDgifQ.FwVTUbqH-9iRFE66801gU0yMihXYPxpa5ZvXyAKJhis",
  "access_expires_at": "2026-10-28T13:25:32.51187789Z",
  "refresh_token": "Ba-9uAmoWv0V00NBMFv7qAc8sFEI1CQMdTRjkmeMtYs",
  "refresh_expires_at": "2026-11-27T13:10:32.511478896Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1be00925-e58b-4058-be93-fbea630f47c5",
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
  "last_heartbeat_at": "2026-10-28T13:10:09.75555Z",
  "last_location_at": "2026-10-28T13:10:09.75555Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1be00925-e58b-4058-be93-fbea630f47c5/handover` → **200**

```json
{
  "command_id": "b4ce960a-e1bf-4428-85c1-20b5fc237d7d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1be00925-e58b-4058-be93-fbea630f47c5",
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
  "last_heartbeat_at": "2026-10-28T13:10:09.75555Z",
  "last_location_at": "2026-10-28T13:10:09.75555Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1be00925-e58b-4058-be93-fbea630f47c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:10:33Z",
    "sequence": 1793193033119
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1be00925-e58b-4058-be93-fbea630f47c5",
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
  "last_heartbeat_at": "2026-10-28T13:10:33.136153Z",
  "last_location_at": "2026-10-28T13:10:33.136153Z",
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
  "command_id": "6db665bf-4a57-4f15-92ce-2b567190feb5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:10:33Z",
    "sequence": 1793193033487
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b2cd1049-e819-493b-a62a-4637b58faa43",
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
  "last_heartbeat_at": "2026-10-28T13:10:33.502819Z",
  "last_location_at": "2026-10-28T13:10:33.502819Z",
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
  "session_id": "b6a023d1-f824-4a50-8fef-bdd3c83acd00",
  "subject": {
    "type": "STAFF",
    "id": "84504c0c-64de-41ea-beaa-6c1f491d5457"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDUwNGMwYy02NGRlLTQxZWEtYmVhYS02YzFmNDkxZDU0NTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM5MzMsImlhdCI6MTc5MzE5MzAzMywianRpIjoiMjg3YzRmNjAtY2U5MS00YTc5LTlhM2YtOWExOWQ1NTFkY2U4Iiwic2lkIjoiYjZhMDIzZDEtZjgyNC00YTUwLThmZWYtYmRkM2M4M2FjZDAwIn0.zQf_KU3QL2xGVEztIaBZE5d0BYfKR7QOfYyLSWyyV3w",
  "access_expires_at": "2026-10-28T13:25:33.8879386Z",
  "refresh_token": "USHl5MTB1ic1mwBDqfNZ5FjgQv2fQXe0Btr-jf9icec",
  "refresh_expires_at": "2026-10-29T01:10:33.887532225Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "01446839-9e4a-4c94-bd8b-53f87b3e0a64",
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
  "id": "fa49d933-07c4-4c4a-b4ac-5b792d8489e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:15:34.066088Z",
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
  "command_id": "0ba6ac29-af3a-4229-97d4-dec813bc8220",
  "quote_id": "fa49d933-07c4-4c4a-b4ac-5b792d8489e5",
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
  "id": "0f893ca4-8b9d-4252-ab84-055b52e8342a",
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
  "created_at": "2026-10-28T13:10:34.258299Z",
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
    "id": "a4c14c3c-ea0a-4123-8b77-de652954e64f",
    "order_id": "0f893ca4-8b9d-4252-ab84-055b52e8342a",
    "expires_at": "2026-10-28T13:10:49.261489Z",
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

`POST /api/driver/v1/offers/a4c14c3c-ea0a-4123-8b77-de652954e64f/accept` → **200**

```json
{
  "command_id": "cb8c21b1-52a2-4729-86f8-ff61caa71476"
}
```

```json
{
  "id": "061b4ad3-6f34-4734-8e40-b7b7eb63f129",
  "order_id": "0f893ca4-8b9d-4252-ab84-055b52e8342a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "45545be1-0bce-43dc-903d-45d69cfb103b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "45545be1-0bce-43dc-903d-45d69cfb103b",
  "order_id": "0f893ca4-8b9d-4252-ab84-055b52e8342a",
  "assignment_id": "061b4ad3-6f34-4734-8e40-b7b7eb63f129",
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

`POST /api/driver/v1/work-sessions/b2cd1049-e819-493b-a62a-4637b58faa43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:10:35Z",
    "sequence": 1793193035153
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b2cd1049-e819-493b-a62a-4637b58faa43",
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
  "last_heartbeat_at": "2026-10-28T13:10:35.168955Z",
  "last_location_at": "2026-10-28T13:10:35.168955Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/45545be1-0bce-43dc-903d-45d69cfb103b/arrive` → **200**

```json
{
  "command_id": "5ab0abc2-df0f-4455-830f-01c860242a6c",
  "expected_version": 0
}
```

```json
{
  "id": "45545be1-0bce-43dc-903d-45d69cfb103b",
  "order_id": "0f893ca4-8b9d-4252-ab84-055b52e8342a",
  "assignment_id": "061b4ad3-6f34-4734-8e40-b7b7eb63f129",
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
  "arrived_at": "2026-10-28T13:10:35.36076Z",
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

`POST /api/driver/v1/trips/45545be1-0bce-43dc-903d-45d69cfb103b/start` → **200**

```json
{
  "command_id": "afc64026-5b1b-49c1-a063-87e7f1e04be0",
  "expected_version": 1
}
```

```json
{
  "id": "45545be1-0bce-43dc-903d-45d69cfb103b",
  "order_id": "0f893ca4-8b9d-4252-ab84-055b52e8342a",
  "assignment_id": "061b4ad3-6f34-4734-8e40-b7b7eb63f129",
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
  "arrived_at": "2026-10-28T13:10:35.36076Z",
  "started_at": "2026-10-28T13:10:35.563403Z",
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

`POST /api/driver/v1/trips/45545be1-0bce-43dc-903d-45d69cfb103b/complete` → **200**

```json
{
  "command_id": "03f2d32d-bc96-4ec1-8b7b-c60f3db644bd",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:10:35Z",
  "cash_received": true
}
```

```json
{
  "id": "45545be1-0bce-43dc-903d-45d69cfb103b",
  "order_id": "0f893ca4-8b9d-4252-ab84-055b52e8342a",
  "assignment_id": "061b4ad3-6f34-4734-8e40-b7b7eb63f129",
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
  "arrived_at": "2026-10-28T13:10:35.36076Z",
  "started_at": "2026-10-28T13:10:35.563403Z",
  "completed_at": "2026-10-28T13:10:35.770891Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/0f893ca4-8b9d-4252-ab84-055b52e8342a` → **200**

```json
{
  "id": "0f893ca4-8b9d-4252-ab84-055b52e8342a",
  "short_number": 21,
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
    "id": "061b4ad3-6f34-4734-8e40-b7b7eb63f129",
    "order_id": "0f893ca4-8b9d-4252-ab84-055b52e8342a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "45545be1-0bce-43dc-903d-45d69cfb103b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:10:34.258299Z",
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
  "session_id": "1be00925-e58b-4058-be93-fbea630f47c5",
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
  "last_heartbeat_at": "2026-10-28T13:10:33.136153Z",
  "last_location_at": "2026-10-28T13:10:33.136153Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1be00925-e58b-4058-be93-fbea630f47c5/close` → **200**

```json
{
  "command_id": "43bf7ba8-f163-4967-8e87-944ec09d25fa",
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
  "session_id": "b2cd1049-e819-493b-a62a-4637b58faa43",
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
  "last_heartbeat_at": "2026-10-28T13:10:35.168955Z",
  "last_location_at": "2026-10-28T13:10:35.168955Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b2cd1049-e819-493b-a62a-4637b58faa43/close` → **200**

```json
{
  "command_id": "16eed3e4-477c-4134-a173-a3d6b0f7b51d",
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

Done: terminal order 0f893ca4-8b9d-4252-ab84-055b52e8342a by Andrii (5a000000-0000-4000-8000-000000000403).
