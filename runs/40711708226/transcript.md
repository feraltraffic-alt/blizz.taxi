# Sandbox transcript (2026-10-28T15:02:25Z, 5b145b1)

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
  "correlation_id": "de43f847-cd4d-4972-a775-d9a28cce73d4"
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
  "session_id": "a0255973-5e58-413b-a77f-db10e316c5a6",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA2NTIsImlhdCI6MTc5MzE5OTc1MiwianRpIjoiN2FlMjdkNDEtODQ4OS00Njc0LWFhODEtZWU2OTU2Mzc4NDZjIiwic2lkIjoiYTAyNTU5NzMtNWU1OC00MTNiLWE3N2YtZGIxMGUzMTZjNWE2In0.zyOjGmickt4pKc2yiDX8kNp6CDjU-bajL4T2c9VB8is",
  "access_expires_at": "2026-10-28T15:17:32.908391173Z",
  "refresh_token": "RyPvKCFzkmCAvcwnpge1lHoPowzTai68Uuo7G1ErmFM",
  "refresh_expires_at": "2026-10-29T03:02:32.906318993Z",
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
  "session_id": "145f0f31-fab7-454b-90f5-d92705d36ab7",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA2NTQsImlhdCI6MTc5MzE5OTc1NCwianRpIjoiMDliYmM5YTctOTcyNS00MGMzLTk4M2EtMDkyMzA5ODk3NGRlIiwic2lkIjoiMTQ1ZjBmMzEtZmFiNy00NTRiLTkwZjUtZDkyNzA1ZDM2YWI3In0._Iwfsc57xWcyoxFh2tsr_bD82qnO-sHzsbgc8TTRA_c",
  "access_expires_at": "2026-10-28T15:17:34.403325095Z",
  "refresh_token": "bPn0lYUb-yg04TWSEIuJqrKo8JZflWyv-XsdavW4DCw",
  "refresh_expires_at": "2026-10-29T03:02:34.402290155Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "67d05e18-e9a6-4e34-ba53-8c29819c37b7",
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
  "id": "0159a822-0933-469b-ae35-a0838093b190",
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
  "created_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "created_at": "2026-10-28T15:02:34.708748Z",
  "updated_at": "2026-10-28T15:02:34.708748Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637477740",
  "device_ref": "sandbox-3409"
}
```

```json
{
  "challenge_id": "30ed2a68-1b54-4323-b6d3-d8f50a495930",
  "expires_at": "2026-10-28T15:07:34.990210348Z",
  "resend_available_at": "2026-10-28T15:02:35.990210348Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637477740` → **200**

```json
{
  "phone": "+380637477740",
  "audience": "CLIENT",
  "code": "154885",
  "sent_at": "2026-10-28T15:02:34.999549725Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30ed2a68-1b54-4323-b6d3-d8f50a495930",
  "code": "154885",
  "device_ref": "sandbox-3409"
}
```

```json
{
  "session_id": "9f1525c4-7d8d-463f-8399-3c666f537abc",
  "subject": {
    "type": "CLIENT",
    "id": "89884985-e94b-4f9a-b392-4f7fc103a793"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OTg4NDk4NS1lOTRiLTRmOWEtYjM5Mi00ZjdmYzEwM2E3OTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNjU1LCJpYXQiOjE3OTMxOTk3NTUsImp0aSI6ImVlNDQ2ZmU1LWIzY2UtNDEzNy04MmIwLWI2OWFkMjcxZDgwZiIsInNpZCI6IjlmMTUyNWM0LTdkOGQtNDYzZi04Mzk5LTNjNjY2ZjUzN2FiYyJ9.Cq9oQiDf9nBynfATMMn5Wb7-ApdvNqPSwDkLjETP0uQ",
  "access_expires_at": "2026-10-28T15:17:35.309932571Z",
  "refresh_token": "QIpHLEygdTWhZAbRRI940YTuuW5pMAlk3P4mW2tyHPo",
  "refresh_expires_at": "2026-11-27T15:02:35.308550173Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637477740` → **200**

```json
{
  "client_id": "89884985-e94b-4f9a-b392-4f7fc103a793"
}
```

`POST /api/admin/v1/rider-wallets/89884985-e94b-4f9a-b392-4f7fc103a793/top-ups` → **201**

```json
{
  "command_id": "a78fa082-26d8-43d9-88df-4806bef6e650",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "89884985-e94b-4f9a-b392-4f7fc103a793",
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
      "id": "64e1e4e8-c1cd-4331-9ba5-951077ce00a8",
      "at": "2026-10-28T15:02:35.878549Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b078e826-f92a-48c1-ba73-3ee5690bdbbd",
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
  "id": "745ad843-7b4f-4031-87ea-27fb98461bf5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:07:36.369019Z",
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
      "id": "0159a822-0933-469b-ae35-a0838093b190",
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
  "device_ref": "sandbox-24050"
}
```

```json
{
  "challenge_id": "06da6137-640b-4394-8982-5a09e3370a73",
  "expires_at": "2026-10-28T15:07:36.681301955Z",
  "resend_available_at": "2026-10-28T15:02:37.681301955Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "570812",
  "sent_at": "2026-10-28T15:02:36.685040398Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "06da6137-640b-4394-8982-5a09e3370a73",
  "code": "570812",
  "device_ref": "sandbox-24050"
}
```

```json
{
  "session_id": "ad2ed3ce-cb21-46c8-86da-a32c7f897079",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDY1NiwiaWF0IjoxNzkzMTk5NzU2LCJqdGkiOiJhOTY4M2M0YS03YjRlLTRlMjQtODNjOC05ZGEwMjk1MmYwOWMiLCJzaWQiOiJhZDJlZDNjZS1jYjIxLTQ2YzgtODZkYS1hMzJjN2Y4OTcwNzkifQ.Z2v_X_kEQFdVCdky676mHAxmE3XXmb27FsmMeA1Mdu0",
  "access_expires_at": "2026-10-28T15:17:36.97445209Z",
  "refresh_token": "ZGY7AmKFHHBto8vPSmS1u2Xa2drwm8K5q2aesgQ7W7E",
  "refresh_expires_at": "2026-11-27T15:02:36.973314415Z",
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
  "command_id": "575e7271-d6bb-4179-bd7e-be32fee0620b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:02:37Z",
    "sequence": 1793199757529
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e2bdbfbc-0349-4a1a-b21e-27fd0f970649",
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
  "last_heartbeat_at": "2026-10-28T15:02:37.582591Z",
  "last_location_at": "2026-10-28T15:02:37.582591Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e9402464-6407-49a3-9dde-721b42baa0b4",
  "quote_id": "745ad843-7b4f-4031-87ea-27fb98461bf5",
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
  "id": "00494ee0-7b80-41fb-aba8-235218f395e5",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89884985-e94b-4f9a-b392-4f7fc103a793",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:02:37.930572Z",
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
  "client_id": "89884985-e94b-4f9a-b392-4f7fc103a793",
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
      "id": "64e1e4e8-c1cd-4331-9ba5-951077ce00a8",
      "at": "2026-10-28T15:02:35.878549Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
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
    "id": "af65a906-0bea-4850-9723-cec8d6888df2",
    "order_id": "00494ee0-7b80-41fb-aba8-235218f395e5",
    "expires_at": "2026-10-28T15:02:52.948391Z",
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

`POST /api/driver/v1/offers/af65a906-0bea-4850-9723-cec8d6888df2/accept` → **200**

```json
{
  "command_id": "af8b175d-5e8d-4508-aa93-029c7e6698f1"
}
```

```json
{
  "id": "491ab1a5-762d-47c4-b1ea-4bf043039e87",
  "order_id": "00494ee0-7b80-41fb-aba8-235218f395e5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d234344f-847a-4659-8683-bd884512d579",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d234344f-847a-4659-8683-bd884512d579",
  "order_id": "00494ee0-7b80-41fb-aba8-235218f395e5",
  "assignment_id": "491ab1a5-762d-47c4-b1ea-4bf043039e87",
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

`POST /api/driver/v1/work-sessions/e2bdbfbc-0349-4a1a-b21e-27fd0f970649/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:02:39Z",
    "sequence": 1793199759409
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e2bdbfbc-0349-4a1a-b21e-27fd0f970649",
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
  "last_heartbeat_at": "2026-10-28T15:02:39.43485Z",
  "last_location_at": "2026-10-28T15:02:39.43485Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d234344f-847a-4659-8683-bd884512d579/arrive` → **200**

```json
{
  "command_id": "cc1cf4c5-0176-4bbf-a533-169917eeee6d",
  "expected_version": 0
}
```

```json
{
  "id": "d234344f-847a-4659-8683-bd884512d579",
  "order_id": "00494ee0-7b80-41fb-aba8-235218f395e5",
  "assignment_id": "491ab1a5-762d-47c4-b1ea-4bf043039e87",
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
  "arrived_at": "2026-10-28T15:02:39.738863Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d234344f-847a-4659-8683-bd884512d579/start` → **200**

```json
{
  "command_id": "d8faac74-1051-4e87-9564-84be671c24c3",
  "expected_version": 1
}
```

```json
{
  "id": "d234344f-847a-4659-8683-bd884512d579",
  "order_id": "00494ee0-7b80-41fb-aba8-235218f395e5",
  "assignment_id": "491ab1a5-762d-47c4-b1ea-4bf043039e87",
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
  "arrived_at": "2026-10-28T15:02:39.738863Z",
  "started_at": "2026-10-28T15:02:40.040464Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/d234344f-847a-4659-8683-bd884512d579/complete` → **200**

```json
{
  "command_id": "b700abb3-1941-4bfe-a6e1-5c13041036e2",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:02:40Z",
  "cash_received": true
}
```

```json
{
  "id": "d234344f-847a-4659-8683-bd884512d579",
  "order_id": "00494ee0-7b80-41fb-aba8-235218f395e5",
  "assignment_id": "491ab1a5-762d-47c4-b1ea-4bf043039e87",
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
  "arrived_at": "2026-10-28T15:02:39.738863Z",
  "started_at": "2026-10-28T15:02:40.040464Z",
  "completed_at": "2026-10-28T15:02:40.357317Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "89884985-e94b-4f9a-b392-4f7fc103a793",
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
      "id": "7a2ad2fd-2ac1-4a45-a577-9d1a997890aa",
      "at": "2026-10-28T15:02:40.848872Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "00494ee0-7b80-41fb-aba8-235218f395e5"
    },
    {
      "id": "64e1e4e8-c1cd-4331-9ba5-951077ce00a8",
      "at": "2026-10-28T15:02:35.878549Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/0159a822-0933-469b-ae35-a0838093b190/archive` → **200**

```json
{
  "command_id": "c4877ef3-5e45-4a2c-8fa9-abaabb348e9a",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "0159a822-0933-469b-ae35-a0838093b190",
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
  "created_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "created_at": "2026-10-28T15:02:34.708748Z",
  "updated_at": "2026-10-28T15:02:43.946748Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e2bdbfbc-0349-4a1a-b21e-27fd0f970649",
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
  "last_heartbeat_at": "2026-10-28T15:02:39.43485Z",
  "last_location_at": "2026-10-28T15:02:39.43485Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e2bdbfbc-0349-4a1a-b21e-27fd0f970649/close` → **200**

```json
{
  "command_id": "45b19822-9a9e-466f-9815-adf2f1a48449",
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

Done: order 00494ee0-7b80-41fb-aba8-235218f395e5.

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
  "session_id": "0a3d4d52-54fe-4f30-b39a-65268ff0487e",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA2NjUsImlhdCI6MTc5MzE5OTc2NSwianRpIjoiNzVmYzEyMjEtMDBjYS00MjMzLTk0NjItZmUwMjU5OTJhMWY2Iiwic2lkIjoiMGEzZDRkNTItNTRmZS00ZjMwLWIzOWEtNjUyNjhmZjA0ODdlIn0.a17KWI3y-SCiOjm4laTTKK7tMn_zV-g32mwNw9MsJdU",
  "access_expires_at": "2026-10-28T15:17:45.066662923Z",
  "refresh_token": "BDkL3qdUp5EDBtnCjm9nyUY3tG0U8YhYt4_eZyqS1p4",
  "refresh_expires_at": "2026-10-29T03:02:45.065760242Z",
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
  "command_id": "5c07c788-c15a-4ff0-8f79-90952825ed33",
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
  "session_id": "0fa5e56e-29ff-4250-b316-511c470d5a3b",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA2NjYsImlhdCI6MTc5MzE5OTc2NiwianRpIjoiMTBlMTE3YmUtM2Q2Yi00MGY1LTk2MzAtMWU2ODhiY2M2M2UyIiwic2lkIjoiMGZhNWU1NmUtMjlmZi00MjUwLWIzMTYtNTExYzQ3MGQ1YTNiIn0.ogoQykNO2yy49J1a1kSNj7KvWPkEYCuIXNga9wG6EvQ",
  "access_expires_at": "2026-10-28T15:17:46.154735675Z",
  "refresh_token": "dK30fNx4NsT4satqfJVwzUwWK2EAUsVb40p0xqSnBiE",
  "refresh_expires_at": "2026-10-29T03:02:46.153987888Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1115120682",
    "linkedid": "1730052700.1115120682",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677577423"
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
    "id": "1730052700.1115120682",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "590e553e-dd10-4edc-8090-a66fb23ddf8e",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677577423",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:02:46.404286Z",
      "answered_at": null,
      "ended_at": "2026-10-28T15:02:46.427838Z",
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
    "id": "1730052600.260759553",
    "linkedid": "1730052600.260759553",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677577423"
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
      "id": "93ddc942-ac6c-4659-b6b3-861ace4a9ffa",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677577423",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:02:46.718124Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/93ddc942-ac6c-4659-b6b3-861ace4a9ffa/answer` → **200**

```json
{
  "command_id": "1328ee8e-86d2-4336-bd43-6f225ec2fa06"
}
```

```json
{
  "id": "93ddc942-ac6c-4659-b6b3-861ace4a9ffa",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677577423",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "order_ids": [],
  "started_at": "2026-10-28T15:02:46.718124Z",
  "answered_at": "2026-10-28T15:02:47.0182Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.260759553",
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
    "id": "1730052600.260759553",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "93ddc942-ac6c-4659-b6b3-861ace4a9ffa",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677577423",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_ids": [],
      "started_at": "2026-10-28T15:02:46.718124Z",
      "answered_at": "2026-10-28T15:02:47.0182Z",
      "ended_at": "2026-10-28T15:02:47.294614Z",
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
      "id": "93ddc942-ac6c-4659-b6b3-861ace4a9ffa",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677577423",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_ids": [],
      "started_at": "2026-10-28T15:02:46.718124Z",
      "answered_at": "2026-10-28T15:02:47.0182Z",
      "ended_at": "2026-10-28T15:02:47.294614Z",
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
      "id": "93ddc942-ac6c-4659-b6b3-861ace4a9ffa",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677577423",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_ids": [],
      "started_at": "2026-10-28T15:02:46.718124Z",
      "answered_at": "2026-10-28T15:02:47.0182Z",
      "ended_at": "2026-10-28T15:02:47.294614Z",
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
      "id": "93ddc942-ac6c-4659-b6b3-861ace4a9ffa",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677577423",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_ids": [],
      "started_at": "2026-10-28T15:02:46.718124Z",
      "answered_at": "2026-10-28T15:02:47.0182Z",
      "ended_at": "2026-10-28T15:02:47.294614Z",
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
      "id": "93ddc942-ac6c-4659-b6b3-861ace4a9ffa",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677577423",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_ids": [],
      "started_at": "2026-10-28T15:02:46.718124Z",
      "answered_at": "2026-10-28T15:02:47.0182Z",
      "ended_at": "2026-10-28T15:02:47.294614Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:02:54.611495Z"
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
      "id": "93ddc942-ac6c-4659-b6b3-861ace4a9ffa",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677577423",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_ids": [],
      "started_at": "2026-10-28T15:02:46.718124Z",
      "answered_at": "2026-10-28T15:02:47.0182Z",
      "ended_at": "2026-10-28T15:02:47.294614Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:02:54.611495Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/93ddc942-ac6c-4659-b6b3-861ace4a9ffa/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/93ddc942-ac6c-4659-b6b3-861ace4a9ffa/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=93ddc942-ac6c-4659-b6b3-861ace4a9ffa` → **200**

```json
{
  "changes": [
    {
      "id": "119ff311-c6af-415c-b748-7d32430d6b4b",
      "occurred_at": "2026-10-28T15:02:56.955072Z",
      "actor_type": "STAFF",
      "actor_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "93ddc942-ac6c-4659-b6b3-861ace4a9ffa",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"3020aaff-b68a-4b33-8be1-189fa4ebdfa5\", \"order_ids\": []}",
      "correlation_id": "38fc993d-7c8f-40c7-aa59-f5c469fba464"
    },
    {
      "id": "5910ff02-0657-482f-88a6-3b9d1498a371",
      "occurred_at": "2026-10-28T15:02:56.925016Z",
      "actor_type": "STAFF",
      "actor_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "93ddc942-ac6c-4659-b6b3-861ace4a9ffa",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"3020aaff-b68a-4b33-8be1-189fa4ebdfa5\", \"order_ids\": []}",
      "correlation_id": "7b878f27-8344-43de-ba54-08f77f1e79ae"
    }
  ]
}
```

Done: call 93ddc942-ac6c-4659-b6b3-861ace4a9ffa recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23228"
}
```

```json
{
  "challenge_id": "d6743c75-11d9-4ae3-a8c0-119d812200f5",
  "expires_at": "2026-10-28T15:07:57.256054695Z",
  "resend_available_at": "2026-10-28T15:02:58.256054695Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "501915",
  "sent_at": "2026-10-28T15:02:57.259622224Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6743c75-11d9-4ae3-a8c0-119d812200f5",
  "code": "501915",
  "device_ref": "sandbox-23228"
}
```

```json
{
  "session_id": "fdfde35a-6548-43d0-96d0-2ba12ca4116f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDY3NywiaWF0IjoxNzkzMTk5Nzc3LCJqdGkiOiIxYzI1ODhkMy1hNjc0LTQxNTMtOTA2Ny0zYmY3NzIwMjZmNTYiLCJzaWQiOiJmZGZkZTM1YS02NTQ4LTQzZDAtOTZkMC0yYmExMmNhNDExNmYifQ.yjU9xmqp9NQs4EGL8wx0_34ET11yrVI2LOOldYXFtRk",
  "access_expires_at": "2026-10-28T15:17:57.53499428Z",
  "refresh_token": "UyJBU6Qe3giDOHkdsltOQDAokl1TTbgLBCby31LjDuI",
  "refresh_expires_at": "2026-11-27T15:02:57.534146039Z",
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
  "command_id": "367a71ea-bdd9-40a2-bc33-4612278b19a6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:02:58Z",
    "sequence": 1793199778398
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cdc287ea-ae39-4ecf-8c38-a8ea26b72b5d",
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
  "last_heartbeat_at": "2026-10-28T15:02:58.058125Z",
  "last_location_at": "2026-10-28T15:02:58.058125Z",
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
  "session_id": "8731b727-b08d-4273-9067-2ddd3389f816",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA2NzgsImlhdCI6MTc5MzE5OTc3OCwianRpIjoiMjhmOTRlYTktZjhiNC00NTViLTgxMGItYjVmZTI1OWQ3MTE0Iiwic2lkIjoiODczMWI3MjctYjA4ZC00MjczLTkwNjctMmRkZDMzODlmODE2In0._wFmTugBVe8iXCaeuJtRGGtVfCIf2PhFOhPdf1uxG4g",
  "access_expires_at": "2026-10-28T15:17:58.593671553Z",
  "refresh_token": "JLjLe-cIkptUKZB5063dV_dU1wI2TbyF4lXick44VxI",
  "refresh_expires_at": "2026-10-29T03:02:58.59304206Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "680e3a94-c08e-4c3e-90e4-8fe00635a46f",
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
  "id": "2f195be6-b3ca-4d77-bc25-9ca6ca4dbf2c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:07:58.856057Z",
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
  "command_id": "946fbb7b-604c-4c6d-be9c-6f54fa68d174",
  "quote_id": "2f195be6-b3ca-4d77-bc25-9ca6ca4dbf2c",
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
    "phone": "+380675769906"
  }
}
```

```json
{
  "id": "435bba0b-77c4-4b20-94aa-1c01019bb34c",
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
  "created_at": "2026-10-28T15:02:59.143498Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675769906"
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
    "id": "d72f7bee-50a6-491d-8db5-f5b3c74dd0a6",
    "order_id": "435bba0b-77c4-4b20-94aa-1c01019bb34c",
    "expires_at": "2026-10-28T15:03:14.149247Z",
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

`POST /api/driver/v1/offers/d72f7bee-50a6-491d-8db5-f5b3c74dd0a6/accept` → **200**

```json
{
  "command_id": "aa39c490-137d-43ef-925f-574ac045ad74"
}
```

```json
{
  "id": "55f95027-c7a8-46ff-afbd-cd7a20dffb58",
  "order_id": "435bba0b-77c4-4b20-94aa-1c01019bb34c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1a46f5b8-327c-4b9e-be9b-9ecca04bda64",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675769906` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675769906` → **200**

```json
[
  {
    "phone": "+380675769906",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:03:00.795120971Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675769906` → **200**

```json
[
  {
    "phone": "+380675769906",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:03:00.795120971Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675769906` → **200**

```json
[
  {
    "phone": "+380675769906",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:03:00.795120971Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1a46f5b8-327c-4b9e-be9b-9ecca04bda64",
  "order_id": "435bba0b-77c4-4b20-94aa-1c01019bb34c",
  "assignment_id": "55f95027-c7a8-46ff-afbd-cd7a20dffb58",
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
    "phone": "+380675769906"
  }
}
```

`POST /api/driver/v1/work-sessions/cdc287ea-ae39-4ecf-8c38-a8ea26b72b5d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:03:01Z",
    "sequence": 1793199781308
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cdc287ea-ae39-4ecf-8c38-a8ea26b72b5d",
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
  "last_heartbeat_at": "2026-10-28T15:03:01.326925Z",
  "last_location_at": "2026-10-28T15:03:01.326925Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1a46f5b8-327c-4b9e-be9b-9ecca04bda64/arrive` → **200**

```json
{
  "command_id": "59752869-5481-41c4-97e3-a3db688d9b7d",
  "expected_version": 0
}
```

```json
{
  "id": "1a46f5b8-327c-4b9e-be9b-9ecca04bda64",
  "order_id": "435bba0b-77c4-4b20-94aa-1c01019bb34c",
  "assignment_id": "55f95027-c7a8-46ff-afbd-cd7a20dffb58",
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
  "arrived_at": "2026-10-28T15:03:01.594852Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675769906"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675769906` → **200**

```json
[
  {
    "phone": "+380675769906",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:03:00.795120971Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675769906` → **200**

```json
[
  {
    "phone": "+380675769906",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:03:00.795120971Z"
  },
  {
    "phone": "+380675769906",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:03:02.803782424Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675769906` → **200**

```json
[
  {
    "phone": "+380675769906",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:03:00.795120971Z"
  },
  {
    "phone": "+380675769906",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:03:02.803782424Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675769906` → **200**

```json
[
  {
    "phone": "+380675769906",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:03:00.795120971Z"
  },
  {
    "phone": "+380675769906",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:03:02.803782424Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/1a46f5b8-327c-4b9e-be9b-9ecca04bda64/start` → **200**

```json
{
  "command_id": "84cb78cf-2e84-4f3a-b845-1428c404874a",
  "expected_version": 1
}
```

```json
{
  "id": "1a46f5b8-327c-4b9e-be9b-9ecca04bda64",
  "order_id": "435bba0b-77c4-4b20-94aa-1c01019bb34c",
  "assignment_id": "55f95027-c7a8-46ff-afbd-cd7a20dffb58",
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
  "arrived_at": "2026-10-28T15:03:01.594852Z",
  "started_at": "2026-10-28T15:03:02.964038Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675769906"
  }
}
```

`POST /api/driver/v1/trips/1a46f5b8-327c-4b9e-be9b-9ecca04bda64/complete` → **200**

```json
{
  "command_id": "2d9850f5-2a17-4718-b669-d4d417b025e1",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:03:03Z",
  "cash_received": true
}
```

```json
{
  "id": "1a46f5b8-327c-4b9e-be9b-9ecca04bda64",
  "order_id": "435bba0b-77c4-4b20-94aa-1c01019bb34c",
  "assignment_id": "55f95027-c7a8-46ff-afbd-cd7a20dffb58",
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
  "arrived_at": "2026-10-28T15:03:01.594852Z",
  "started_at": "2026-10-28T15:03:02.964038Z",
  "completed_at": "2026-10-28T15:03:03.267945Z",
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
  "session_id": "cdc287ea-ae39-4ecf-8c38-a8ea26b72b5d",
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
  "last_heartbeat_at": "2026-10-28T15:03:01.326925Z",
  "last_location_at": "2026-10-28T15:03:01.326925Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cdc287ea-ae39-4ecf-8c38-a8ea26b72b5d/close` → **200**

```json
{
  "command_id": "85469798-262c-4df0-b7de-94bcb6e58869",
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
  "phone": "+380634362644",
  "device_ref": "sandbox-10495"
}
```

```json
{
  "challenge_id": "a2cf914d-ce7f-4ad5-a0e0-34d9c858a944",
  "expires_at": "2026-10-28T15:08:04.074966074Z",
  "resend_available_at": "2026-10-28T15:03:05.074966074Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634362644` → **200**

```json
{
  "phone": "+380634362644",
  "audience": "CLIENT",
  "code": "945996",
  "sent_at": "2026-10-28T15:03:04.078265789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2cf914d-ce7f-4ad5-a0e0-34d9c858a944",
  "code": "945996",
  "device_ref": "sandbox-10495"
}
```

```json
{
  "session_id": "948d6f8b-0e1d-49da-88a9-6dde8aeb56ce",
  "subject": {
    "type": "CLIENT",
    "id": "3402ee2e-953b-4471-b8ef-94a6284703b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNDAyZWUyZS05NTNiLTQ0NzEtYjhlZi05NGE2Mjg0NzAzYjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNjg0LCJpYXQiOjE3OTMxOTk3ODQsImp0aSI6ImJmZTNlZmM5LTE1M2ItNGZiYS05NWE2LWUyMmMzYjAzOWE2MiIsInNpZCI6Ijk0OGQ2ZjhiLTBlMWQtNDlkYS04OGE5LTZkZGU4YWViNTZjZSJ9.hKOnVCgR1TidNOyNaCC_DkdA8V48MJwYVlRNzUnzZG8",
  "access_expires_at": "2026-10-28T15:18:04.355450472Z",
  "refresh_token": "mO6B6eahZFDjInPp7npYJk9HrzhUl141P1wYQqBxQyU",
  "refresh_expires_at": "2026-11-27T15:03:04.354673739Z",
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
  "device_ref": "sandbox-22984"
}
```

```json
{
  "challenge_id": "fc54b331-19da-4b80-92d7-ac2f11254bf3",
  "expires_at": "2026-10-28T15:08:04.879619031Z",
  "resend_available_at": "2026-10-28T15:03:05.879619031Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "381575",
  "sent_at": "2026-10-28T15:03:04.882475604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc54b331-19da-4b80-92d7-ac2f11254bf3",
  "code": "381575",
  "device_ref": "sandbox-22984"
}
```

```json
{
  "session_id": "62859f71-409e-41b4-ad32-df8895c7890e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDY4NSwiaWF0IjoxNzkzMTk5Nzg1LCJqdGkiOiIzODI5OTgxNy02M2M4LTQyNjktYjBiOS00ODI5ZTAwYWJhN2YiLCJzaWQiOiI2Mjg1OWY3MS00MDllLTQxYjQtYWQzMi1kZjg4OTVjNzg5MGUifQ.CQuFPg2aqzFZgp6VsT51NY6SPOEk9wdbMlJhqtPsGlA",
  "access_expires_at": "2026-10-28T15:18:05.160033121Z",
  "refresh_token": "lKoj7yySobAwV6ohpFX3Fj2bivrxbWQaqSUK6h6KYfo",
  "refresh_expires_at": "2026-11-27T15:03:05.159407426Z",
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
  "session_id": "8db02993-32bf-4b62-a1d9-0b216cc325f9",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA2ODUsImlhdCI6MTc5MzE5OTc4NSwianRpIjoiMzkxMjcxNzEtN2Y1YS00ZTYxLWFhMDMtNjVlZjU2NDRmYmI0Iiwic2lkIjoiOGRiMDI5OTMtMzJiZi00YjYyLWExZDktMGIyMTZjYzMyNWY5In0.GVNe5Awbl8dqoYWGa-TPOJlXMGN0tYVKKnlJrCfd5qs",
  "access_expires_at": "2026-10-28T15:18:05.955108133Z",
  "refresh_token": "Lt3_6JIyEnTOlxX-LdMXS7wtIMJrmnH91iUIrSuQw38",
  "refresh_expires_at": "2026-10-29T03:03:05.954505682Z",
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
  "session_id": "1baa5ed2-c3f4-4009-a383-133aa992f006",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA2ODYsImlhdCI6MTc5MzE5OTc4NiwianRpIjoiZjkyYjY2NDAtNzhmMy00ZWNlLTkzMjgtOGM0ODRjNTYxM2I5Iiwic2lkIjoiMWJhYTVlZDItYzNmNC00MDA5LWEzODMtMTMzYWE5OTJmMDA2In0.d3tKW8GhYsmJ06ULw1WrtN4O8s7oX0jHzB_pAKJ_FWU",
  "access_expires_at": "2026-10-28T15:18:06.517986851Z",
  "refresh_token": "mdXDFCEbD18oMTZBkouhxIpXsh5L2ynIs79qCEYDbg8",
  "refresh_expires_at": "2026-10-29T03:03:06.517375069Z",
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
  "command_id": "245eef84-2be7-4416-af5c-d43468ef6d48",
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
  "id": "9288011c-399a-492f-8226-2739aff3282d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:08:07.031846Z",
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
  "command_id": "2e80eea4-2316-4416-bf9a-c0cef4aa6aa4",
  "quote_id": "9288011c-399a-492f-8226-2739aff3282d",
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
  "id": "aa8d9aa0-a0f3-478f-a2b4-d3ec30c28127",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3402ee2e-953b-4471-b8ef-94a6284703b2",
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
  "created_at": "2026-10-28T15:03:07.300904Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa8d9aa0-a0f3-478f-a2b4-d3ec30c28127` → **200**

```json
{
  "id": "aa8d9aa0-a0f3-478f-a2b4-d3ec30c28127",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3402ee2e-953b-4471-b8ef-94a6284703b2",
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
  "created_at": "2026-10-28T15:03:07.300904Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/aa8d9aa0-a0f3-478f-a2b4-d3ec30c28127/cancel` → **200**

```json
{
  "command_id": "5fa92686-1432-4e0d-a3e8-dbea6f65ac33",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "aa8d9aa0-a0f3-478f-a2b4-d3ec30c28127",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3402ee2e-953b-4471-b8ef-94a6284703b2",
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
  "created_at": "2026-10-28T15:03:07.300904Z",
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
  "command_id": "a92c3fc5-d72d-454c-8b5c-23e0d1d6876f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:03:08Z",
    "sequence": 1793199788382
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "08828562-6b9f-49c7-b88a-de3c8e8d630e",
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
  "last_heartbeat_at": "2026-10-28T15:03:08.400619Z",
  "last_location_at": "2026-10-28T15:03:08.400619Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3616"
}
```

```json
{
  "challenge_id": "0791acc1-a234-492c-835d-43c036bdf3f0",
  "expires_at": "2026-10-28T15:08:08.658097369Z",
  "resend_available_at": "2026-10-28T15:03:09.658097369Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "066812",
  "sent_at": "2026-10-28T15:03:08.660922866Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0791acc1-a234-492c-835d-43c036bdf3f0",
  "code": "066812",
  "device_ref": "sandbox-3616"
}
```

```json
{
  "session_id": "3ffde6b0-ee24-4446-a1d7-3c0287c004d0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDY4OCwiaWF0IjoxNzkzMTk5Nzg4LCJqdGkiOiJlYmUwZmY0My03ZmQ1LTQ1NjQtOWE0ZS05N2U2Njg3NjBmNjMiLCJzaWQiOiIzZmZkZTZiMC1lZTI0LTQ0NDYtYTFkNy0zYzAyODdjMDA0ZDAifQ.B95iWIp5VBPb8Ku3uwIRv_8iVANfBg_UHv9YbpwEdNI",
  "access_expires_at": "2026-10-28T15:18:08.942566686Z",
  "refresh_token": "lHx7daZzPUIP5RWyDVChT-uvS9aKV3Ul0YVUrCtednA",
  "refresh_expires_at": "2026-11-27T15:03:08.941891628Z",
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
  "command_id": "24bee5ef-564b-4586-82c7-9957b2aaf792",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:03:09Z",
    "sequence": 1793199789452
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b7c15f9a-9455-49fb-94a4-69139173d57c",
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
  "last_heartbeat_at": "2026-10-28T15:03:09.470287Z",
  "last_location_at": "2026-10-28T15:03:09.470287Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0e8073f4-fa18-40e1-86d4-49932c981896",
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
  "id": "a1227ece-32a2-4495-b91b-380c75826142",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:08:09.743372Z",
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
  "command_id": "750e9811-8920-4f49-ba22-48e2819ab25d",
  "quote_id": "a1227ece-32a2-4495-b91b-380c75826142",
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
  "id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3402ee2e-953b-4471-b8ef-94a6284703b2",
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
  "created_at": "2026-10-28T15:03:10.014858Z",
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
    "id": "17c9ad0a-67c9-45be-85fb-5bbcf9a61a30",
    "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
    "expires_at": "2026-10-28T15:03:25.019179Z",
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

`POST /api/driver/v1/offers/17c9ad0a-67c9-45be-85fb-5bbcf9a61a30/accept` → **200**

```json
{
  "command_id": "9ab1196a-0d29-4ee1-b5ef-8751c0e42e66"
}
```

```json
{
  "id": "f9209ef1-11ba-4888-9dda-d0dc3bb8e63f",
  "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7950bfcd-929a-45b5-9b9b-8a4765d8564c",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7950bfcd-929a-45b5-9b9b-8a4765d8564c",
  "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
  "assignment_id": "f9209ef1-11ba-4888-9dda-d0dc3bb8e63f",
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

`POST /api/driver/v1/trips/7950bfcd-929a-45b5-9b9b-8a4765d8564c/cancel` → **200**

```json
{
  "command_id": "61d6126b-7c62-489c-98ad-46aaa01d2f46",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "7950bfcd-929a-45b5-9b9b-8a4765d8564c",
  "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
  "assignment_id": "f9209ef1-11ba-4888-9dda-d0dc3bb8e63f",
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

`GET /api/rider/v1/orders/d49cfd1b-b366-44ee-96f6-453d885b9fd6` → **200**

```json
{
  "id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3402ee2e-953b-4471-b8ef-94a6284703b2",
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
    "id": "f9209ef1-11ba-4888-9dda-d0dc3bb8e63f",
    "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7950bfcd-929a-45b5-9b9b-8a4765d8564c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:03:10.014858Z",
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
    "id": "db9fdad6-72ae-4719-9555-244ab2bf6273",
    "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
    "expires_at": "2026-10-28T15:03:26.116976Z",
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

`POST /api/driver/v1/offers/db9fdad6-72ae-4719-9555-244ab2bf6273/accept` → **200**

```json
{
  "command_id": "d041d68e-3664-4413-a40a-d5d931dfc4f1"
}
```

```json
{
  "id": "fdd6967d-6c97-4632-810f-51102297bd0f",
  "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0bc7252d-cd95-4018-a4ef-7035a7251bb3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0bc7252d-cd95-4018-a4ef-7035a7251bb3",
  "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
  "assignment_id": "fdd6967d-6c97-4632-810f-51102297bd0f",
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

`POST /api/driver/v1/trips/0bc7252d-cd95-4018-a4ef-7035a7251bb3/cancel` → **200**

```json
{
  "command_id": "4522b4f1-8e80-416f-9f8e-7f930a4bb4fa",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "0bc7252d-cd95-4018-a4ef-7035a7251bb3",
  "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
  "assignment_id": "fdd6967d-6c97-4632-810f-51102297bd0f",
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
    "id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:03:10.014858Z",
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
    "id": "aa8d9aa0-a0f3-478f-a2b4-d3ec30c28127",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:03:07.300904Z",
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

`GET /api/operator/v1/orders/d49cfd1b-b366-44ee-96f6-453d885b9fd6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:03:10.015777Z",
      "actor": {
        "type": "CLIENT",
        "id": "3402ee2e-953b-4471-b8ef-94a6284703b2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
        "quote_id": "a1227ece-32a2-4495-b91b-380c75826142",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "722c7f1c-8dee-44a6-86b8-987474469726"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:03:10.017936Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
        "attempt_id": "a38ca62a-68e7-4625-a9f9-a3c04cadd6f5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "722c7f1c-8dee-44a6-86b8-987474469726"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:03:10.02603Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "17c9ad0a-67c9-45be-85fb-5bbcf9a61a30",
        "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "722c7f1c-8dee-44a6-86b8-987474469726"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:03:10.576903Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "17c9ad0a-67c9-45be-85fb-5bbcf9a61a30",
        "order_id": "d49cfd1b-b366-44ee-96f6-453d885b9fd6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "f9209ef1-11ba-4888-9dda-d0dc3bb8e63f"
      },
      "correlation_id": "f92b4079-aa47-4689-9511-8e415cb2d9a5"
```

Done: orders aa8d9aa0-a0f3-478f-a2b4-d3ec30c28127, d49cfd1b-b366-44ee-96f6-453d885b9fd6.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736648257",
  "device_ref": "sandbox-28037"
}
```

```json
{
  "challenge_id": "f64df8e1-c0a7-44ab-a1fb-012fc0e30a1c",
  "expires_at": "2026-10-28T15:08:13.289861908Z",
  "resend_available_at": "2026-10-28T15:03:14.289861908Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736648257` → **200**

```json
{
  "phone": "+380736648257",
  "audience": "CLIENT",
  "code": "122453",
  "sent_at": "2026-10-28T15:03:13.292533133Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f64df8e1-c0a7-44ab-a1fb-012fc0e30a1c",
  "code": "122453",
  "device_ref": "sandbox-28037"
}
```

```json
{
  "session_id": "c55354b4-a205-42f1-9a1f-0d3c5b306975",
  "subject": {
    "type": "CLIENT",
    "id": "edabcd6b-2b6b-4371-bf11-87639618f071"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZGFiY2Q2Yi0yYjZiLTQzNzEtYmYxMS04NzYzOTYxOGYwNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNjkzLCJpYXQiOjE3OTMxOTk3OTMsImp0aSI6IjYyOGVkMTQyLWQzMmUtNDE1OS04OGM3LTliODcwMzczNzQyYiIsInNpZCI6ImM1NTM1NGI0LWEyMDUtNDJmMS05YTFmLTBkM2M1YjMwNjk3NSJ9.TtX52Lw7v0WrU4jeB9rBo0Aj4I_mcPAu8ksYwCmyOr4",
  "access_expires_at": "2026-10-28T15:18:13.571455034Z",
  "refresh_token": "nGWqDt1n5NY9HVhR7zJ7GQ_R77DIIyXhgmHuOVrsl70",
  "refresh_expires_at": "2026-11-27T15:03:13.570842697Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "47df5e75-71a8-46ac-89d4-71c73354c0c4",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d1a603fa-c7b1-414f-874d-948aa2d10a59",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d1a603fa-c7b1-414f-874d-948aa2d10a59",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "38e28d24c5e72ae8dea9de2fe53b4bab",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d1a603fa-c7b1-414f-874d-948aa2d10a59",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736648257"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d1a603fa-c7b1-414f-874d-948aa2d10a59",
  "expires_at": "2026-10-28T15:33:13.841896Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/d1a603fa-c7b1-414f-874d-948aa2d10a59` → **200**

```json
{
  "id": "d1a603fa-c7b1-414f-874d-948aa2d10a59",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T15:33:13.841896Z",
  "card": {
    "id": "72dd25e8-c448-47a2-abe0-f3f7906ea1b4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4513",
    "card_type": "Visa",
    "created_at": "2026-10-28T15:03:14.12721Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "72dd25e8-c448-47a2-abe0-f3f7906ea1b4",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4513",
      "card_type": "Visa",
      "created_at": "2026-10-28T15:03:14.12721Z"
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
  "device_ref": "sandbox-25846"
}
```

```json
{
  "challenge_id": "1becbab2-adde-4a8a-9c2c-604b75bda61e",
  "expires_at": "2026-10-28T15:08:14.68435612Z",
  "resend_available_at": "2026-10-28T15:03:15.68435612Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "288876",
  "sent_at": "2026-10-28T15:03:14.68745036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1becbab2-adde-4a8a-9c2c-604b75bda61e",
  "code": "288876",
  "device_ref": "sandbox-25846"
}
```

```json
{
  "session_id": "f5538a55-e918-491b-bba5-73c7cf1eda88",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDY5NCwiaWF0IjoxNzkzMTk5Nzk0LCJqdGkiOiIyOGUyN2QwNC02MDQzLTRmM2ItOGNlNy1lNzU1MTIwOTNmNDUiLCJzaWQiOiJmNTUzOGE1NS1lOTE4LTQ5MWItYmJhNS03M2M3Y2YxZWRhODgifQ.XAjbgCUZqGo3eoS5GICCzTjhTHda-YEpMTTmHjC7bIc",
  "access_expires_at": "2026-10-28T15:18:14.975041594Z",
  "refresh_token": "ocE0FC3V_N78kQT5h7UiFEpjoQq3HOLtXZcn1Zk_9qQ",
  "refresh_expires_at": "2026-11-27T15:03:14.974283412Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b7c15f9a-9455-49fb-94a4-69139173d57c",
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
  "last_heartbeat_at": "2026-10-28T15:03:09.470287Z",
  "last_location_at": "2026-10-28T15:03:09.470287Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b7c15f9a-9455-49fb-94a4-69139173d57c/handover` → **200**

```json
{
  "command_id": "b5d57eea-fa1b-4814-9a7c-d79435cfe331",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b7c15f9a-9455-49fb-94a4-69139173d57c",
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
  "last_heartbeat_at": "2026-10-28T15:03:09.470287Z",
  "last_location_at": "2026-10-28T15:03:09.470287Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b7c15f9a-9455-49fb-94a4-69139173d57c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:03:15Z",
    "sequence": 1793199795748
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b7c15f9a-9455-49fb-94a4-69139173d57c",
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
  "last_heartbeat_at": "2026-10-28T15:03:15.766152Z",
  "last_location_at": "2026-10-28T15:03:15.766152Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "04673dc0-eb5d-4991-9231-dd0a03a0f9a0",
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
  "id": "4e9915dd-7b0a-49ad-bd71-5e0925d25cd2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:08:16.050028Z",
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
  "command_id": "1a4fb616-f8e9-4cb1-9833-39e7a05022ff",
  "quote_id": "4e9915dd-7b0a-49ad-bd71-5e0925d25cd2",
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
  "id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "edabcd6b-2b6b-4371-bf11-87639618f071",
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
  "created_at": "2026-10-28T15:03:16.338683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/94bf8100-24c4-44fe-a2fa-13fc37d5907c` → **200**

```json
{
  "id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "edabcd6b-2b6b-4371-bf11-87639618f071",
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
  "created_at": "2026-10-28T15:03:16.338683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/94bf8100-24c4-44fe-a2fa-13fc37d5907c` → **200**

```json
{
  "id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "edabcd6b-2b6b-4371-bf11-87639618f071",
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
  "created_at": "2026-10-28T15:03:16.338683Z",
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
    "id": "f9f3d810-1799-4ed7-aa0e-c1cbe1ed2a4e",
    "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
    "expires_at": "2026-10-28T15:03:32.118064Z",
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

`POST /api/driver/v1/offers/f9f3d810-1799-4ed7-aa0e-c1cbe1ed2a4e/accept` → **200**

```json
{
  "command_id": "10ba0a52-8e1e-4aa8-9d3a-9d293c1d3dd3"
}
```

```json
{
  "id": "0362ad9e-0888-4d3c-b721-dc06b6467e07",
  "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4d32d219-ee32-4b64-9f6d-eeffe895b5de",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4d32d219-ee32-4b64-9f6d-eeffe895b5de",
  "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
  "assignment_id": "0362ad9e-0888-4d3c-b721-dc06b6467e07",
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

`POST /api/driver/v1/work-sessions/b7c15f9a-9455-49fb-94a4-69139173d57c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:03:18Z",
    "sequence": 1793199798926
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b7c15f9a-9455-49fb-94a4-69139173d57c",
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
  "last_heartbeat_at": "2026-10-28T15:03:18.943721Z",
  "last_location_at": "2026-10-28T15:03:18.943721Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4d32d219-ee32-4b64-9f6d-eeffe895b5de/arrive` → **200**

```json
{
  "command_id": "6e3a2f1e-c040-4c50-8117-9a686fc5f66b",
  "expected_version": 0
}
```

```json
{
  "id": "4d32d219-ee32-4b64-9f6d-eeffe895b5de",
  "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
  "assignment_id": "0362ad9e-0888-4d3c-b721-dc06b6467e07",
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
  "arrived_at": "2026-10-28T15:03:19.208756Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4d32d219-ee32-4b64-9f6d-eeffe895b5de/start` → **200**

```json
{
  "command_id": "59c3c8e3-bd43-4988-b5ea-309eb8a861e7",
  "expected_version": 1
}
```

```json
{
  "id": "4d32d219-ee32-4b64-9f6d-eeffe895b5de",
  "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
  "assignment_id": "0362ad9e-0888-4d3c-b721-dc06b6467e07",
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
  "arrived_at": "2026-10-28T15:03:19.208756Z",
  "started_at": "2026-10-28T15:03:19.482511Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4d32d219-ee32-4b64-9f6d-eeffe895b5de/complete` → **200**

```json
{
  "command_id": "35df4e4f-d016-4c9b-b77c-6bd4149d72ff",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:03:19Z",
  "cash_received": true
}
```

```json
{
  "id": "4d32d219-ee32-4b64-9f6d-eeffe895b5de",
  "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
  "assignment_id": "0362ad9e-0888-4d3c-b721-dc06b6467e07",
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
  "arrived_at": "2026-10-28T15:03:19.208756Z",
  "started_at": "2026-10-28T15:03:19.482511Z",
  "completed_at": "2026-10-28T15:03:19.76997Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/94bf8100-24c4-44fe-a2fa-13fc37d5907c` → **200**

```json
{
  "id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "edabcd6b-2b6b-4371-bf11-87639618f071",
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
    "id": "0362ad9e-0888-4d3c-b721-dc06b6467e07",
    "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4d32d219-ee32-4b64-9f6d-eeffe895b5de",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:03:16.338683Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/94bf8100-24c4-44fe-a2fa-13fc37d5907c` → **200**

```json
{
  "id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "edabcd6b-2b6b-4371-bf11-87639618f071",
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
    "id": "0362ad9e-0888-4d3c-b721-dc06b6467e07",
    "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4d32d219-ee32-4b64-9f6d-eeffe895b5de",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:03:16.338683Z",
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
      "id": "f006fd6c-a402-473e-9a66-04cdcfebb0ac",
      "at": "2026-10-28T15:03:20.179667Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/94bf8100-24c4-44fe-a2fa-13fc37d5907c/tip` → **200**

```json
{
  "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
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
  "available_until": "2026-10-29T15:03:19.76997Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/94bf8100-24c4-44fe-a2fa-13fc37d5907c/tip` → **201**

```json
{
  "command_id": "28648364-e8bc-4078-8415-5f92b0f90215",
  "amount_minor": 2500
}
```

```json
{
  "id": "cc2c4828-5f4c-4634-b343-28bb6d86aef4",
  "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:03:22.380504Z"
}
```

`GET /api/rider/v1/orders/94bf8100-24c4-44fe-a2fa-13fc37d5907c/tip` → **200**

```json
{
  "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
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
  "available_until": "2026-10-29T15:03:19.76997Z",
  "open": false,
  "tip": {
    "id": "cc2c4828-5f4c-4634-b343-28bb6d86aef4",
    "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:03:22.380504Z"
  }
}
```

`GET /api/rider/v1/orders/94bf8100-24c4-44fe-a2fa-13fc37d5907c/tip` → **200**

```json
{
  "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
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
  "available_until": "2026-10-29T15:03:19.76997Z",
  "open": false,
  "tip": {
    "id": "cc2c4828-5f4c-4634-b343-28bb6d86aef4",
    "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:03:22.380504Z"
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
      "id": "f006fd6c-a402-473e-9a66-04cdcfebb0ac",
      "at": "2026-10-28T15:03:20.179667Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
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
      "id": "f31412f2-2a32-4cef-bf50-b20ef065939e",
      "at": "2026-10-28T15:03:24.247334Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
      "counterpart_id": null
    },
    {
      "id": "f006fd6c-a402-473e-9a66-04cdcfebb0ac",
      "at": "2026-10-28T15:03:20.179667Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eaf4173b-32ef-4115-bc28-4cb7ad54ea32",
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
  "id": "a5df63e9-e54c-411a-bc1f-8b9c7f63bdad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:08:25.676537Z",
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
  "session_id": "f7f650d6-3d66-49d8-809d-4a646fb182d1",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3MDYsImlhdCI6MTc5MzE5OTgwNiwianRpIjoiZGJhOWQ4MzgtNGM5OS00ZDU2LWI1YTQtMzk2NzIwOTZlNmJmIiwic2lkIjoiZjdmNjUwZDYtM2Q2Ni00OWQ4LTgwOWQtNGE2NDZmYjE4MmQxIn0.zYGsXqd-Zdpo625FzBn1uFSSwWRZ5_CduwvEBT3GoaY",
  "access_expires_at": "2026-10-28T15:18:26.22512689Z",
  "refresh_token": "qPfWEaa__lVsDj_YcFzklOjfExtjN4xOs44jAnYMJk0",
  "refresh_expires_at": "2026-10-29T03:03:26.224382388Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380736648257` → **200**

```json
{
  "client_id": "edabcd6b-2b6b-4371-bf11-87639618f071"
}
```

`POST /api/admin/v1/rider-wallets/edabcd6b-2b6b-4371-bf11-87639618f071/top-ups` → **201**

```json
{
  "command_id": "5a29c86e-b368-4031-99ee-d63e6f850fc2",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "edabcd6b-2b6b-4371-bf11-87639618f071",
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
      "id": "1e61f619-6fcf-4827-8a82-42b772a42f24",
      "at": "2026-10-28T15:03:26.747997Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d5a316af-4467-4a14-a4bd-feb0d5540e83",
  "quote_id": "a5df63e9-e54c-411a-bc1f-8b9c7f63bdad",
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
  "id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "edabcd6b-2b6b-4371-bf11-87639618f071",
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
  "created_at": "2026-10-28T15:03:27.022682Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6e5fa84f-35ca-4466-8a44-a7c16a2efc8c` → **200**

```json
{
  "id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "edabcd6b-2b6b-4371-bf11-87639618f071",
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
  "created_at": "2026-10-28T15:03:27.022682Z",
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
    "id": "07cb7c77-b59d-4f69-93da-6681322c5051",
    "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
    "expires_at": "2026-10-28T15:03:42.027691Z",
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

`POST /api/driver/v1/offers/07cb7c77-b59d-4f69-93da-6681322c5051/accept` → **200**

```json
{
  "command_id": "099872c1-1b8a-4ebf-b246-8c796dbf0ea7"
}
```

```json
{
  "id": "426a11e0-3da1-4857-90a6-9f56bcc5cc75",
  "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5ba8d76b-9c5b-47bc-bcb2-734c70efe35a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5ba8d76b-9c5b-47bc-bcb2-734c70efe35a",
  "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
  "assignment_id": "426a11e0-3da1-4857-90a6-9f56bcc5cc75",
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

`POST /api/driver/v1/work-sessions/b7c15f9a-9455-49fb-94a4-69139173d57c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:03:28Z",
    "sequence": 1793199808362
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b7c15f9a-9455-49fb-94a4-69139173d57c",
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
  "last_heartbeat_at": "2026-10-28T15:03:28.38115Z",
  "last_location_at": "2026-10-28T15:03:28.38115Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5ba8d76b-9c5b-47bc-bcb2-734c70efe35a/arrive` → **200**

```json
{
  "command_id": "4f3424e4-0f2e-4039-99b0-6c9684ffc95a",
  "expected_version": 0
}
```

```json
{
  "id": "5ba8d76b-9c5b-47bc-bcb2-734c70efe35a",
  "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
  "assignment_id": "426a11e0-3da1-4857-90a6-9f56bcc5cc75",
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
  "arrived_at": "2026-10-28T15:03:28.648309Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5ba8d76b-9c5b-47bc-bcb2-734c70efe35a/start` → **200**

```json
{
  "command_id": "ce0f4a1e-17b7-4e74-8af3-d80e71298509",
  "expected_version": 1
}
```

```json
{
  "id": "5ba8d76b-9c5b-47bc-bcb2-734c70efe35a",
  "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
  "assignment_id": "426a11e0-3da1-4857-90a6-9f56bcc5cc75",
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
  "arrived_at": "2026-10-28T15:03:28.648309Z",
  "started_at": "2026-10-28T15:03:28.918908Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5ba8d76b-9c5b-47bc-bcb2-734c70efe35a/complete` → **200**

```json
{
  "command_id": "99fd557f-919e-4ba9-9aab-f6af38f0ff8c",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:03:29Z",
  "cash_received": true
}
```

```json
{
  "id": "5ba8d76b-9c5b-47bc-bcb2-734c70efe35a",
  "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
  "assignment_id": "426a11e0-3da1-4857-90a6-9f56bcc5cc75",
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
  "arrived_at": "2026-10-28T15:03:28.648309Z",
  "started_at": "2026-10-28T15:03:28.918908Z",
  "completed_at": "2026-10-28T15:03:29.191297Z",
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
  "client_id": "edabcd6b-2b6b-4371-bf11-87639618f071",
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
      "id": "bbfc38c7-e86b-4df4-b223-6ac5c58e1eaa",
      "at": "2026-10-28T15:03:29.294515Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c"
    },
    {
      "id": "1e61f619-6fcf-4827-8a82-42b772a42f24",
      "at": "2026-10-28T15:03:26.747997Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
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
      "id": "46ec76d0-7ade-43de-9ed1-aef50a3ab7f4",
      "at": "2026-10-28T15:03:29.290007Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
      "counterpart_id": null
    },
    {
      "id": "f31412f2-2a32-4cef-bf50-b20ef065939e",
      "at": "2026-10-28T15:03:24.247334Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
      "counterpart_id": null
    },
    {
      "id": "f006fd6c-a402-473e-9a66-04cdcfebb0ac",
      "at": "2026-10-28T15:03:20.179667Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/6e5fa84f-35ca-4466-8a44-a7c16a2efc8c/tip` → **200**

```json
{
  "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
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
  "available_until": "2026-10-29T15:03:29.191297Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6e5fa84f-35ca-4466-8a44-a7c16a2efc8c/tip` → **201**

```json
{
  "command_id": "0a569cc6-80a3-4bf0-a238-eb132461f5d9",
  "amount_minor": 2500
}
```

```json
{
  "id": "1d911341-c593-467f-b17e-577c0be742a8",
  "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:03:30.494769Z"
}
```

`GET /api/rider/v1/orders/6e5fa84f-35ca-4466-8a44-a7c16a2efc8c/tip` → **200**

```json
{
  "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
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
  "available_until": "2026-10-29T15:03:29.191297Z",
  "open": false,
  "tip": {
    "id": "1d911341-c593-467f-b17e-577c0be742a8",
    "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:03:30.494769Z"
  }
}
```

`GET /api/rider/v1/orders/6e5fa84f-35ca-4466-8a44-a7c16a2efc8c/tip` → **200**

```json
{
  "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
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
  "available_until": "2026-10-29T15:03:29.191297Z",
  "open": false,
  "tip": {
    "id": "1d911341-c593-467f-b17e-577c0be742a8",
    "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:03:30.494769Z"
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
      "id": "46ec76d0-7ade-43de-9ed1-aef50a3ab7f4",
      "at": "2026-10-28T15:03:29.290007Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
      "counterpart_id": null
    },
    {
      "id": "f31412f2-2a32-4cef-bf50-b20ef065939e",
      "at": "2026-10-28T15:03:24.247334Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
      "counterpart_id": null
    },
    {
      "id": "f006fd6c-a402-473e-9a66-04cdcfebb0ac",
      "at": "2026-10-28T15:03:20.179667Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
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
      "id": "b8d879c3-1087-4646-bcb7-7e8ca23ee236",
      "at": "2026-10-28T15:03:32.313643Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
      "counterpart_id": null
    },
    {
      "id": "46ec76d0-7ade-43de-9ed1-aef50a3ab7f4",
      "at": "2026-10-28T15:03:29.290007Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6e5fa84f-35ca-4466-8a44-a7c16a2efc8c",
      "counterpart_id": null
    },
    {
      "id": "f31412f2-2a32-4cef-bf50-b20ef065939e",
      "at": "2026-10-28T15:03:24.247334Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
      "counterpart_id": null
    },
    {
      "id": "f006fd6c-a402-473e-9a66-04cdcfebb0ac",
      "at": "2026-10-28T15:03:20.179667Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "94bf8100-24c4-44fe-a2fa-13fc37d5907c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b7c15f9a-9455-49fb-94a4-69139173d57c",
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
  "last_heartbeat_at": "2026-10-28T15:03:28.38115Z",
  "last_location_at": "2026-10-28T15:03:28.38115Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b7c15f9a-9455-49fb-94a4-69139173d57c/close` → **200**

```json
{
  "command_id": "278ec642-ec1d-40b6-b7c1-6cfc8400064d",
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

Done: card order 6e5fa84f-35ca-4466-8a44-a7c16a2efc8c.

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
  "phone": "+380739280303",
  "device_ref": "sandbox-28717"
}
```

```json
{
  "challenge_id": "60f66946-c324-4e95-9b0d-5ff7413d4772",
  "expires_at": "2026-10-28T15:08:34.593416072Z",
  "resend_available_at": "2026-10-28T15:03:35.593416072Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739280303` → **200**

```json
{
  "phone": "+380739280303",
  "audience": "CLIENT",
  "code": "210210",
  "sent_at": "2026-10-28T15:03:34.596233285Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60f66946-c324-4e95-9b0d-5ff7413d4772",
  "code": "210210",
  "device_ref": "sandbox-28717"
}
```

```json
{
  "session_id": "4cb458f8-4f18-4ae3-a5ff-0a7873c670ec",
  "subject": {
    "type": "CLIENT",
    "id": "8bf976fb-949e-480f-afc5-92aeb4513416"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YmY5NzZmYi05NDllLTQ4MGYtYWZjNS05MmFlYjQ1MTM0MTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNzE0LCJpYXQiOjE3OTMxOTk4MTQsImp0aSI6IjhjZjQwMDcxLWNiOGUtNDkzZi05YmVlLWQzODM3NWFjZDYzNCIsInNpZCI6IjRjYjQ1OGY4LTRmMTgtNGFlMy1hNWZmLTBhNzg3M2M2NzBlYyJ9.GsYOzluSZ6mZRTgN2H7PVbBvmV365ju_mQT2gHIbPRA",
  "access_expires_at": "2026-10-28T15:18:34.871981035Z",
  "refresh_token": "Kgqq9pRWdceYuPMfLM6TAh-aSRsDFXBNIxVvMa-Y1hM",
  "refresh_expires_at": "2026-11-27T15:03:34.871423397Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "9a519039-5add-46bf-aa74-9c9a82691423",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "d3e28dd4-ecaf-4e62-9a1e-7aadbfca560b",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-d3e28dd4-ecaf-4e62-9a1e-7aadbfca560b",
    "orderDate": "1793199815",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "275920cf37e843d093e9ae303aa0802e",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=d3e28dd4-ecaf-4e62-9a1e-7aadbfca560b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739280303"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=d3e28dd4-ecaf-4e62-9a1e-7aadbfca560b",
  "created_at": "2026-10-28T15:03:35.13715Z",
  "expires_at": "2026-10-28T15:33:35.13715Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/d3e28dd4-ecaf-4e62-9a1e-7aadbfca560b` → **200**

```json
{
  "id": "d3e28dd4-ecaf-4e62-9a1e-7aadbfca560b",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:03:35.13715Z",
  "expires_at": "2026-10-28T15:33:35.13715Z",
  "completed_at": "2026-10-28T15:03:35.404351Z",
  "masked_pan": "41****2949",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8bf976fb-949e-480f-afc5-92aeb4513416",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8bf976fb-949e-480f-afc5-92aeb4513416",
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
      "id": "0a9ca5a0-2357-4cf8-9848-7f25223d9165",
      "at": "2026-10-28T15:03:36.329851Z",
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
  "client_id": "8bf976fb-949e-480f-afc5-92aeb4513416",
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
      "id": "0a9ca5a0-2357-4cf8-9848-7f25223d9165",
      "at": "2026-10-28T15:03:36.329851Z",
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
  "device_ref": "sandbox-25099"
}
```

```json
{
  "challenge_id": "2abd9aff-310d-4242-915b-a12f9476c17c",
  "expires_at": "2026-10-28T15:08:37.455623494Z",
  "resend_available_at": "2026-10-28T15:03:38.455623494Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "734188",
  "sent_at": "2026-10-28T15:03:37.459022329Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2abd9aff-310d-4242-915b-a12f9476c17c",
  "code": "734188",
  "device_ref": "sandbox-25099"
}
```

```json
{
  "session_id": "80b6f893-6a59-4e6a-8133-d14bfafb4341",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDcxNywiaWF0IjoxNzkzMTk5ODE3LCJqdGkiOiIwMzU2NjA3NC02MzIwLTQ2ZDAtOTljOC1hYTM3ZTg1Mzg0ZTQiLCJzaWQiOiI4MGI2Zjg5My02YTU5LTRlNmEtODEzMy1kMTRiZmFmYjQzNDEifQ.CvGC635kHNUu5sph13cJ0YeRan551OZGoe7GD8mmr0Y",
  "access_expires_at": "2026-10-28T15:18:37.750369124Z",
  "refresh_token": "V7-tUZ4CGyVLgvWDTWgikj_JjvVdMKa5bj2XrnuopoE",
  "refresh_expires_at": "2026-11-27T15:03:37.74982268Z",
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
  "command_id": "c9b0e721-47e5-40ff-95d1-5c9afa5f8e87",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "599e6f51-6f1d-4ed5-9cc0-f84b101712e4",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-599e6f51-6f1d-4ed5-9cc0-f84b101712e4",
    "orderDate": "1793199818",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "c5526e2aa5473496201dbeef78aaba38",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=599e6f51-6f1d-4ed5-9cc0-f84b101712e4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=599e6f51-6f1d-4ed5-9cc0-f84b101712e4",
  "created_at": "2026-10-28T15:03:38.273597Z",
  "expires_at": "2026-10-28T15:33:38.273597Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/599e6f51-6f1d-4ed5-9cc0-f84b101712e4` → **200**

```json
{
  "id": "599e6f51-6f1d-4ed5-9cc0-f84b101712e4",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:03:38.273597Z",
  "expires_at": "2026-10-28T15:33:38.273597Z",
  "completed_at": "2026-10-28T15:03:38.542339Z",
  "masked_pan": "41****0358",
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
      "id": "d248985b-709f-49ab-bbb6-8667d03b5dcf",
      "at": "2026-10-28T15:03:39.337693Z",
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
  "command_id": "9ad83337-93e7-4e8a-b948-58d908afb5bc",
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
  "correlation_id": "fb204987-95b5-407c-a42b-5f2c75d1065c"
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
  "session_id": "3c098025-1d51-4598-a094-809f2b257569",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3MjAsImlhdCI6MTc5MzE5OTgyMCwianRpIjoiZGM5ODE2YWYtYTZiZC00Y2MwLWJjNTMtMWU4NTRlMjJjOGRkIiwic2lkIjoiM2MwOTgwMjUtMWQ1MS00NTk4LWEwOTQtODA5ZjJiMjU3NTY5In0.y_bjwBUdnDvmRfscoz6jvLZqPEBg2VDt8OQsU5zrSlM",
  "access_expires_at": "2026-10-28T15:18:40.949939301Z",
  "refresh_token": "dEA0N2ddu6IrEZCDoPFT2aWsHQ32nKnIQT08fHjp27c",
  "refresh_expires_at": "2026-10-29T03:03:40.94937852Z",
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
  "phone": "+48600856304",
  "device_ref": "sandbox-5844"
}
```

```json
{
  "challenge_id": "6c576158-2e03-481d-89ca-98bd1acbc5f9",
  "expires_at": "2026-10-28T15:08:41.787758205Z",
  "resend_available_at": "2026-10-28T15:03:42.787758205Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600856304` → **200**

```json
{
  "phone": "+48600856304",
  "audience": "CLIENT",
  "code": "512782",
  "sent_at": "2026-10-28T15:03:41.790097724Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c576158-2e03-481d-89ca-98bd1acbc5f9",
  "code": "512782",
  "device_ref": "sandbox-5844"
}
```

```json
{
  "session_id": "c47ae530-e464-41af-bbaf-e978388e17b7",
  "subject": {
    "type": "CLIENT",
    "id": "c9039ca0-4950-49b9-bf5d-b4723c3968b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTAzOWNhMC00OTUwLTQ5YjktYmY1ZC1iNDcyM2MzOTY4YjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNzIyLCJpYXQiOjE3OTMxOTk4MjIsImp0aSI6IjlhOWU3NWY0LTgzMWItNDBmZi05MmVjLWVmMTVmYTM2MjUwNyIsInNpZCI6ImM0N2FlNTMwLWU0NjQtNDFhZi1iYmFmLWU5NzgzODhlMTdiNyJ9.tRFokTWHpTHyxp5F0rl0X0Ezi7NZQ7SV9XXaP2M98kc",
  "access_expires_at": "2026-10-28T15:18:42.080890603Z",
  "refresh_token": "AMTL1f5FawSP7y7TaDq7S1O0kDWeS-v0puqTxrS2n8I",
  "refresh_expires_at": "2026-11-27T15:03:42.080234505Z",
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
  "command_id": "81112e7d-d855-4ac2-9226-d23f55b7593a",
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
  "correlation_id": "aae6f019-df39-4210-9775-3b071ce2ac8e",
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
  "command_id": "a5266684-0a2e-48bb-9440-18ea33e5c1fa",
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
  "paused_at": "2026-10-28T15:03:43.166648757Z",
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
  "command_id": "218f10fc-039b-447d-b243-8a3e98a82c56",
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
  "id": "1603cab7-8b37-4876-8bd3-754e8e3d5993",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:08:43.705841Z",
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
  "command_id": "d6ffd3bc-ce5e-4455-b9c9-4fbef476a89b",
  "quote_id": "1603cab7-8b37-4876-8bd3-754e8e3d5993",
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
  "correlation_id": "f6a1a068-c9a8-424d-9a77-1a77bd504681"
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
  "paused_at": "2026-10-28T15:03:43.166649Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "78a2f410-41f2-40c4-a41e-b32de5b0b58b",
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
  "command_id": "43248cc0-e97f-4c39-b080-a408e7dd54ab",
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
  "command_id": "d91a08df-2a69-4672-8d1b-ff787cd982de",
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
  "id": "21075526-bc9a-4411-aacc-f2ffa09369d5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:08:45.307005Z",
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
  "command_id": "d949c654-3935-4e62-9d7f-2c0f709d04e5",
  "quote_id": "21075526-bc9a-4411-aacc-f2ffa09369d5",
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
  "correlation_id": "0d3b9ade-16e0-49a9-b60f-2a38921dcbf1"
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
  "command_id": "f083c3d0-e62b-4f31-87dd-a608459edb84",
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
  "command_id": "99828295-7d82-4a1d-88fd-7bd826d9ccce",
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
  "id": "e8fe21e7-4411-4418-ba28-f2cf1a67c4bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:08:46.393424Z",
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
  "command_id": "d8c0b7fc-37ca-415a-b0f1-49a1c9387da8",
  "quote_id": "e8fe21e7-4411-4418-ba28-f2cf1a67c4bf",
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
  "correlation_id": "e2024ac9-1ba3-44fd-b216-c7b5bdc54153"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "475f430c-c82c-422e-9f9d-d833c748ca83",
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
  "correlation_id": "ae7fce7b-b695-4817-a374-8fbdf0d42944"
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
  "command_id": "36703e83-1503-47d0-b268-128cd9d2eccb",
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
  "phone": "+380671432952",
  "device_ref": "sandbox-11786"
}
```

```json
{
  "challenge_id": "9daac6d7-bd08-4113-88f9-672a49049dc2",
  "expires_at": "2026-10-28T15:08:47.734074295Z",
  "resend_available_at": "2026-10-28T15:03:48.734074295Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671432952` → **200**

```json
{
  "phone": "+380671432952",
  "audience": "CLIENT",
  "code": "124542",
  "sent_at": "2026-10-28T15:03:47.736272651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9daac6d7-bd08-4113-88f9-672a49049dc2",
  "code": "124542",
  "device_ref": "sandbox-11786"
}
```

```json
{
  "session_id": "473819a9-c05f-4a86-9a0e-1a10f1928390",
  "subject": {
    "type": "CLIENT",
    "id": "b0bfdc25-6505-424a-935f-63e1b1006810"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGJmZGMyNS02NTA1LTQyNGEtOTM1Zi02M2UxYjEwMDY4MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNzI4LCJpYXQiOjE3OTMxOTk4MjgsImp0aSI6Ijk4NGRlNDA5LTkzNTAtNDA4NC04YWUwLTdlNmI5MjRlNjQ1YiIsInNpZCI6IjQ3MzgxOWE5LWMwNWYtNGE4Ni05YTBlLTFhMTBmMTkyODM5MCJ9.Xx6tJVhTlZYJdL1W_ccGPLLR8UvsRUCtBkn1SZ34EUI",
  "access_expires_at": "2026-10-28T15:18:48.019647045Z",
  "refresh_token": "zi-3BHB4wOR62IQYX6eEgHe2AM8ZIhnBZiJCwjTDS1I",
  "refresh_expires_at": "2026-11-27T15:03:48.019099626Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b0bfdc25-6505-424a-935f-63e1b1006810",
  "session_id": "473819a9-c05f-4a86-9a0e-1a10f1928390",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8ca64ffd-f4a6-4ac4-91d2-926f7f498e26",
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
  "id": "9885a55d-b0ad-4a4b-9535-3a4e6c96c967",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:08:48.521541Z",
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
  "challenge_id": "02637c1f-7717-4a0f-8064-35ede8757f35",
  "expires_at": "2026-10-28T15:08:50.781516075Z",
  "resend_available_at": "2026-10-28T15:03:51.781516075Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671432952` → **200**

```json
{
  "phone": "+380671432952",
  "audience": "CLIENT",
  "code": "995150",
  "sent_at": "2026-10-28T15:03:50.783689684Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "8de3e921-9b56-4c1c-a0cf-2e473365b545",
  "challenge_id": "02637c1f-7717-4a0f-8064-35ede8757f35",
  "otp_code": "995150"
}
```

```json
{
  "client_id": "b0bfdc25-6505-424a-935f-63e1b1006810",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T15:03:51.069414066Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "125c2334-e243-4053-bae6-086f93454d84",
  "quote_id": "9885a55d-b0ad-4a4b-9535-3a4e6c96c967",
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
  "correlation_id": "57cdff13-ff4e-412b-81b4-1d107e975d47"
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
  "session_id": "c5b30f40-6427-4c81-8ec0-b325920bca85",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3MzEsImlhdCI6MTc5MzE5OTgzMSwianRpIjoiNGIyYWY1MmYtZjc2Ni00OTZjLTljNTAtYmM0NWM1YjAwNGEwIiwic2lkIjoiYzViMzBmNDAtNjQyNy00YzgxLThlYzAtYjMyNTkyMGJjYTg1In0.uwBswWC6QS5ZmdWojCG5lN5UpGV2Lb8gyNX1c_I93v0",
  "access_expires_at": "2026-10-28T15:18:51.877273252Z",
  "refresh_token": "xUVHKfnmvFYA2bP6BV3RyHhOlm_4WGjqA-bpzXDFMdA",
  "refresh_expires_at": "2026-10-29T03:03:51.876536763Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "b0bfdc25-6505-424a-935f-63e1b1006810",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T15:03:51.069414Z",
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

`POST /api/admin/v1/client-deletions/b0bfdc25-6505-424a-935f-63e1b1006810/complete` → **200**

```json
{
  "command_id": "a3696506-b441-478e-87cc-87037ca30d26",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "b0bfdc25-6505-424a-935f-63e1b1006810",
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
  "correlation_id": "d50e3df9-441a-45e5-b3a9-6d6a5ad61d10"
}
```

Done: client b0bfdc25-6505-424a-935f-63e1b1006810 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666712193",
  "device_ref": "sandbox-6588"
}
```

```json
{
  "challenge_id": "8b776c20-ab43-4837-9d58-4fdfab141330",
  "expires_at": "2026-10-28T15:08:52.951669556Z",
  "resend_available_at": "2026-10-28T15:03:53.951669556Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666712193` → **200**

```json
{
  "phone": "+380666712193",
  "audience": "CLIENT",
  "code": "105084",
  "sent_at": "2026-10-28T15:03:52.954055303Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b776c20-ab43-4837-9d58-4fdfab141330",
  "code": "105084",
  "device_ref": "sandbox-6588"
}
```

```json
{
  "session_id": "28da8ac5-82b3-48ae-8d16-56fd6c82ac4f",
  "subject": {
    "type": "CLIENT",
    "id": "af0d11bf-4ef4-42dd-a564-c980780635c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjBkMTFiZi00ZWY0LTQyZGQtYTU2NC1jOTgwNzgwNjM1YzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNzMzLCJpYXQiOjE3OTMxOTk4MzMsImp0aSI6Ijk2NjRhYTFhLWJiNjEtNDUwZS1iNWZmLWRmZTI1YzQyM2ZjNiIsInNpZCI6IjI4ZGE4YWM1LTgyYjMtNDhhZS04ZDE2LTU2ZmQ2YzgyYWM0ZiJ9.L83lL9XWlUT5Q8zCwJnAgbhFEi8f_0ijcqc5mtxETXI",
  "access_expires_at": "2026-10-28T15:18:53.231255893Z",
  "refresh_token": "dq5H8HpEAtZKG_IXdT5vRZ6y5eQLDpwEJ69fQFwxvUM",
  "refresh_expires_at": "2026-11-27T15:03:53.230635782Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "af0d11bf-4ef4-42dd-a564-c980780635c8",
  "session_id": "28da8ac5-82b3-48ae-8d16-56fd6c82ac4f",
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
  "session_id": "13aae148-0322-48f5-864d-f5ab3a063d7c",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3MzQsImlhdCI6MTc5MzE5OTgzNCwianRpIjoiOTdiYzI2MjAtNTNmMy00NWI3LTgzOWEtYjkwNThmMzk3MzhkIiwic2lkIjoiMTNhYWUxNDgtMDMyMi00OGY1LTg2NGQtZjVhYjNhMDYzZDdjIn0.Njwymtt4qnMjMYXx7ddjLntQZNR4L8m2_AykhKbeDKo",
  "access_expires_at": "2026-10-28T15:18:54.028639412Z",
  "refresh_token": "6jEh2Q9JV83DM0KtSAmVR6TdaYr16rktyRIXUqiPr0I",
  "refresh_expires_at": "2026-10-29T03:03:54.028069872Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6712193&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "af0d11bf-4ef4-42dd-a564-c980780635c8",
      "phone": "+380666712193",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T15:03:53.228741Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/af0d11bf-4ef4-42dd-a564-c980780635c8` → **200**

```json
{
  "client": {
    "id": "af0d11bf-4ef4-42dd-a564-c980780635c8",
    "phone": "+380666712193",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:03:53.228741Z",
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

`POST /api/admin/v1/clients/af0d11bf-4ef4-42dd-a564-c980780635c8/block` → **400**

```json
{
  "command_id": "0e79f641-daf3-48c1-b7da-907eff978554",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/af0d11bf-4ef4-42dd-a564-c980780635c8/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c77089a1-ffe8-44f1-99ae-107974038755",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/af0d11bf-4ef4-42dd-a564-c980780635c8/block` → **200**

```json
{
  "command_id": "9ec2a9d0-2a87-47a5-9420-d23b98e74366",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "af0d11bf-4ef4-42dd-a564-c980780635c8",
  "phone": "+380666712193",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T15:03:53.228741Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T15:03:55.150067Z",
    "by": "f0e25eac-31e8-4f76-b671-addb0f66903a"
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
  "correlation_id": "fdbf960a-c3d0-4240-bc0d-e31e76e7d787"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666712193",
  "device_ref": "sandbox-1000"
}
```

```json
{
  "challenge_id": "f270bd18-2085-4ab7-9f27-87f0badeced7",
  "expires_at": "2026-10-28T15:08:57.684174081Z",
  "resend_available_at": "2026-10-28T15:03:58.684174081Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666712193` → **200**

```json
{
  "phone": "+380666712193",
  "audience": "CLIENT",
  "code": "164919",
  "sent_at": "2026-10-28T15:03:57.686387571Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "f270bd18-2085-4ab7-9f27-87f0badeced7",
  "code": "164919",
  "device_ref": "sandbox-1000"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "a452e891-91a3-4715-9f14-25d2e5aeb534"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/af0d11bf-4ef4-42dd-a564-c980780635c8` → **200**

```json
{
  "client": {
    "id": "af0d11bf-4ef4-42dd-a564-c980780635c8",
    "phone": "+380666712193",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T15:03:53.228741Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T15:03:55.150067Z",
      "by": "f0e25eac-31e8-4f76-b671-addb0f66903a"
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

`POST /api/admin/v1/clients/af0d11bf-4ef4-42dd-a564-c980780635c8/unblock` → **200**

```json
{
  "command_id": "ed9ffe5a-bd7d-4e3b-9ced-a6913e846e87",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "af0d11bf-4ef4-42dd-a564-c980780635c8",
  "phone": "+380666712193",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T15:03:53.228741Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666712193",
  "device_ref": "sandbox-9872"
}
```

```json
{
  "challenge_id": "3d57927e-7746-4ce5-ab25-bcd9f9871672",
  "expires_at": "2026-10-28T15:09:00.806720924Z",
  "resend_available_at": "2026-10-28T15:04:01.806720924Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666712193` → **200**

```json
{
  "phone": "+380666712193",
  "audience": "CLIENT",
  "code": "213213",
  "sent_at": "2026-10-28T15:04:00.808582888Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d57927e-7746-4ce5-ab25-bcd9f9871672",
  "code": "213213",
  "device_ref": "sandbox-9872"
}
```

```json
{
  "session_id": "8e7979c5-8401-45a2-84a6-923dc16b5c13",
  "subject": {
    "type": "CLIENT",
    "id": "af0d11bf-4ef4-42dd-a564-c980780635c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjBkMTFiZi00ZWY0LTQyZGQtYTU2NC1jOTgwNzgwNjM1YzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNzQxLCJpYXQiOjE3OTMxOTk4NDEsImp0aSI6ImYxMGQxYzhjLTQxYWMtNDdhNi1iNGIyLTRlNjRkMTAzMDM3ZSIsInNpZCI6IjhlNzk3OWM1LTg0MDEtNDVhMi04NGE2LTkyM2RjMTZiNWMxMyJ9.MQvbztmG9qg42X4nbVtQ213gGZe6kVhHanLQG-4DyME",
  "access_expires_at": "2026-10-28T15:19:01.090405991Z",
  "refresh_token": "7My3LEDKivyxE11Nn72L6Q4IWm27G2K-og5u5ArKB90",
  "refresh_expires_at": "2026-11-27T15:04:01.089806361Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "af0d11bf-4ef4-42dd-a564-c980780635c8",
  "session_id": "8e7979c5-8401-45a2-84a6-923dc16b5c13",
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
  "phone": "+380666206370",
  "device_ref": "sandbox-14248"
}
```

```json
{
  "challenge_id": "cf807dae-51f9-41fe-bdbf-7a83d6d41c44",
  "expires_at": "2026-10-28T15:09:01.634306897Z",
  "resend_available_at": "2026-10-28T15:04:02.634306897Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666206370` → **200**

```json
{
  "phone": "+380666206370",
  "audience": "CLIENT",
  "code": "780077",
  "sent_at": "2026-10-28T15:04:01.636468504Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf807dae-51f9-41fe-bdbf-7a83d6d41c44",
  "code": "780077",
  "device_ref": "sandbox-14248"
}
```

```json
{
  "session_id": "9d0953fc-7c8d-4fc9-91bc-58f26b24d44d",
  "subject": {
    "type": "CLIENT",
    "id": "f38735f9-cb08-49e6-99ec-bb1783d5f3be"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMzg3MzVmOS1jYjA4LTQ5ZTYtOTllYy1iYjE3ODNkNWYzYmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNzQxLCJpYXQiOjE3OTMxOTk4NDEsImp0aSI6IjQ4NjA2ODk4LTVkNWEtNDJkYS1iZjJlLWE4YzU1ZWJjOTQ1OCIsInNpZCI6IjlkMDk1M2ZjLTdjOGQtNGZjOS05MWJjLTU4ZjI2YjI0ZDQ0ZCJ9.1kEOfDW4MET6oFqMAg__sZ_VI_hdNcgPWPsCUeqau8I",
  "access_expires_at": "2026-10-28T15:19:01.909021348Z",
  "refresh_token": "G7Mm90ROQt9LTTFfu8rueDOVW5zXvtGIL04Ug2L8dIM",
  "refresh_expires_at": "2026-11-27T15:04:01.908429002Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6f19c3dd-451e-43e3-9fa4-583c9f9ecbb7",
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
  "id": "50ea75d8-43c1-40ff-b7b8-d3e5fc2897e0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:09:02.186013Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 3b2823bb-d471-4a81-a84d-468531280b28) → **201**

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
  "session_id": "72723e8f-ed02-4b58-a4cf-9235436e51af",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3NDIsImlhdCI6MTc5MzE5OTg0MiwianRpIjoiYzRlZGM1ZmItZWRhNy00ZmMxLTgzYTItOTljOTk0YjU1MDZiIiwic2lkIjoiNzI3MjNlOGYtZWQwMi00YjU4LWE0Y2YtOTIzNTQzNmU1MWFmIn0.xQJlajt-USYwslE7WNsmZR78tfoJxF7QqjDbFl-_Evo",
  "access_expires_at": "2026-10-28T15:19:02.777932779Z",
  "refresh_token": "BdaD5-FgCwxkTAfaUVprhC1cb02er1dEBNWR2N_PgLQ",
  "refresh_expires_at": "2026-10-29T03:04:02.777326422Z",
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
  "session_id": "5116a21b-0a26-499b-9bb8-b7985676e327",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3NDMsImlhdCI6MTc5MzE5OTg0MywianRpIjoiYjllNWYzMzQtN2Q4Mi00NDE1LTg4OTEtN2FjNjZjNzQ3MDA3Iiwic2lkIjoiNTExNmEyMWItMGEyNi00OTliLTliYjgtYjc5ODU2NzZlMzI3In0.1i92j1Z2xjgn9I4Q5s52EYuwvbGGiKDhUoURV3llc_g",
  "access_expires_at": "2026-10-28T15:19:03.318405606Z",
  "refresh_token": "NPV3TMxx3uZ6vrZW54Q9MAagBYvSeQ8NcXmmNTFEFTM",
  "refresh_expires_at": "2026-10-29T03:04:03.317877226Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2d2c9458-08ae-4725-a66a-7ad90551e952/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:04:02.460651Z",
      "actor": {
        "type": "CLIENT",
        "id": "f38735f9-cb08-49e6-99ec-bb1783d5f3be",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2d2c9458-08ae-4725-a66a-7ad90551e952",
        "quote_id": "50ea75d8-43c1-40ff-b7b8-d3e5fc2897e0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "3b2823bb-d471-4a81-a84d-468531280b28"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:04:02.46238Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2d2c9458-08ae-4725-a66a-7ad90551e952",
        "attempt_id": "aa419522-8429-4fab-8fbd-3102f826bc5c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3b2823bb-d471-4a81-a84d-468531280b28"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T15:04:02.471657Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2d2c9458-08ae-4725-a66a-7ad90551e952",
        "attempt_id": "aa419522-8429-4fab-8fbd-3102f826bc5c"
      },
      "correlation_id": "3b2823bb-d471-4a81-a84d-468531280b28"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "aa419522-8429-4fab-8fbd-3102f826bc5c",
        "generation": 1,
        "started_at": "2026-10-28T15:04:02.461418Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T15:04:02.471657Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T15:04:02.463274Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/3b2823bb-d471-4a81-a84d-468531280b28` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "2d2c9458-08ae-4725-a66a-7ad90551e952:0",
      "order_id": "2d2c9458-08ae-4725-a66a-7ad90551e952",
      "at": "2026-10-28T15:04:02.460651Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "2d2c9458-08ae-4725-a66a-7ad90551e952:1",
      "order_id": "2d2c9458-08ae-4725-a66a-7ad90551e952",
      "at": "2026-10-28T15:04:02.46238Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "2d2c9458-08ae-4725-a66a-7ad90551e952:2",
      "order_id": "2d2c9458-08ae-4725-a66a-7ad90551e952",
      "at": "2026-10-28T15:04:02.471657Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/3368a7da-2fa4-46fb-9f97-dc5343d27335` → **200**

```json
{
  "found": []
}
```

Done: request 3b2823bb-d471-4a81-a84d-468531280b28 — order 2d2c9458-08ae-4725-a66a-7ad90551e952 found by its id.

`GET /api/rider/v1/orders/2d2c9458-08ae-4725-a66a-7ad90551e952` → **200**

```json
{
  "id": "2d2c9458-08ae-4725-a66a-7ad90551e952",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f38735f9-cb08-49e6-99ec-bb1783d5f3be",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:04:02.460062Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2d2c9458-08ae-4725-a66a-7ad90551e952/cancel` → **200**

```json
{
  "command_id": "b3bbaa57-1bcc-44f1-bd43-2a4fab16fb90",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2d2c9458-08ae-4725-a66a-7ad90551e952",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f38735f9-cb08-49e6-99ec-bb1783d5f3be",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:04:02.460062Z",
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
  "phone": "+380631374835",
  "device_ref": "sandbox-6461"
}
```

```json
{
  "challenge_id": "b4522a49-a136-4e8e-8106-d64f8e8f9fa7",
  "expires_at": "2026-10-28T15:09:04.961835278Z",
  "resend_available_at": "2026-10-28T15:04:05.961835278Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631374835` → **200**

```json
{
  "phone": "+380631374835",
  "audience": "CLIENT",
  "code": "263391",
  "sent_at": "2026-10-28T15:04:04.964381267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4522a49-a136-4e8e-8106-d64f8e8f9fa7",
  "code": "263391",
  "device_ref": "sandbox-6461"
}
```

```json
{
  "session_id": "69d064ac-6079-4e3d-bcbd-403206d573a8",
  "subject": {
    "type": "CLIENT",
    "id": "97d1eac4-9817-4931-a245-f1e9cd8e171f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5N2QxZWFjNC05ODE3LTQ5MzEtYTI0NS1mMWU5Y2Q4ZTE3MWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNzQ1LCJpYXQiOjE3OTMxOTk4NDUsImp0aSI6ImU4NjljZGNhLWIzYTktNDlkZi05MDE3LTQ5NTY4YjY5NmY0NSIsInNpZCI6IjY5ZDA2NGFjLTYwNzktNGUzZC1iY2JkLTQwMzIwNmQ1NzNhOCJ9.AyuDfW2iHZ8vfqTjsp14hewA7Xn2mH-msEd7WbnjvFg",
  "access_expires_at": "2026-10-28T15:19:05.263226125Z",
  "refresh_token": "Zbk6nK0_N2epsNzwTJHbN4ACI5RUTGrSCpAh__zudZI",
  "refresh_expires_at": "2026-11-27T15:04:05.262183266Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "dddbec83-ca75-4244-a032-4feca6395072",
  "expires_at": "2026-10-28T15:09:07.546908113Z",
  "resend_available_at": "2026-10-28T15:04:08.546908113Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631374835` → **200**

```json
{
  "phone": "+380631374835",
  "audience": "CLIENT",
  "code": "918597",
  "sent_at": "2026-10-28T15:04:07.548881732Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "705d2673-b3dd-4b86-a82e-89fdf949af3c",
  "challenge_id": "dddbec83-ca75-4244-a032-4feca6395072",
  "otp_code": "918597"
}
```

```json
{
  "id": "169d53a3-eaeb-474f-a49d-d8781549be6c",
  "state": "PENDING",
  "created_at": "2026-10-28T15:04:07.850256Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/169d53a3-eaeb-474f-a49d-d8781549be6c` → **200**

```json
{
  "id": "169d53a3-eaeb-474f-a49d-d8781549be6c",
  "state": "PENDING",
  "created_at": "2026-10-28T15:04:07.850256Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/169d53a3-eaeb-474f-a49d-d8781549be6c` → **200**

```json
{
  "id": "169d53a3-eaeb-474f-a49d-d8781549be6c",
  "state": "PENDING",
  "created_at": "2026-10-28T15:04:07.850256Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/169d53a3-eaeb-474f-a49d-d8781549be6c` → **200**

```json
{
  "id": "169d53a3-eaeb-474f-a49d-d8781549be6c",
  "state": "PENDING",
  "created_at": "2026-10-28T15:04:07.850256Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/169d53a3-eaeb-474f-a49d-d8781549be6c` → **200**

```json
{
  "id": "169d53a3-eaeb-474f-a49d-d8781549be6c",
  "state": "PENDING",
  "created_at": "2026-10-28T15:04:07.850256Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/169d53a3-eaeb-474f-a49d-d8781549be6c` → **200**

```json
{
  "id": "169d53a3-eaeb-474f-a49d-d8781549be6c",
  "state": "PENDING",
  "created_at": "2026-10-28T15:04:07.850256Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/169d53a3-eaeb-474f-a49d-d8781549be6c` → **200**

```json
{
  "id": "169d53a3-eaeb-474f-a49d-d8781549be6c",
  "state": "PENDING",
  "created_at": "2026-10-28T15:04:07.850256Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/169d53a3-eaeb-474f-a49d-d8781549be6c` → **200**

```json
{
  "id": "169d53a3-eaeb-474f-a49d-d8781549be6c",
  "state": "READY",
  "created_at": "2026-10-28T15:04:07.850256Z",
  "ready_at": "2026-10-28T15:04:14.628646Z",
  "expires_at": "2026-11-04T15:04:14.628646Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/169d53a3-eaeb-474f-a49d-d8781549be6c/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638637842",
  "device_ref": "sandbox-5693"
}
```

```json
{
  "challenge_id": "fdb177bb-5059-40ec-8053-8cbec87d8865",
  "expires_at": "2026-10-28T15:09:15.962809847Z",
  "resend_available_at": "2026-10-28T15:04:16.962809847Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638637842` → **200**

```json
{
  "phone": "+380638637842",
  "audience": "CLIENT",
  "code": "248626",
  "sent_at": "2026-10-28T15:04:15.965118801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fdb177bb-5059-40ec-8053-8cbec87d8865",
  "code": "248626",
  "device_ref": "sandbox-5693"
}
```

```json
{
  "session_id": "aecd98dd-c766-4d84-a671-728cedc687c9",
  "subject": {
    "type": "CLIENT",
    "id": "abd45a8f-3675-4a81-b137-871a034b3b2c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmQ0NWE4Zi0zNjc1LTRhODEtYjEzNy04NzFhMDM0YjNiMmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNzU2LCJpYXQiOjE3OTMxOTk4NTYsImp0aSI6IjQ2MTZjMzk2LTc3MzMtNGQ3Mi1iYzk1LTZjNTlhZTllM2FkMSIsInNpZCI6ImFlY2Q5OGRkLWM3NjYtNGQ4NC1hNjcxLTcyOGNlZGM2ODdjOSJ9.MdL7q3dTXBTLEWLc1FSpkxVV8tdqs16_m2UfyeH2O3Q",
  "access_expires_at": "2026-10-28T15:19:16.240967016Z",
  "refresh_token": "ARfDimAiYXqMPgaF9L9OKSOSMtQgp-Q9CJdEeRxlOOc",
  "refresh_expires_at": "2026-11-27T15:04:16.240369471Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/169d53a3-eaeb-474f-a49d-d8781549be6c/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/169d53a3-eaeb-474f-a49d-d8781549be6c/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8c7fed90-9d06-4a3a-b25b-d8fb1c419a95"
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
  "session_id": "92f7021b-e938-48ff-8c8e-5e4d598e00d1",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3NTcsImlhdCI6MTc5MzE5OTg1NywianRpIjoiY2ZlOWI5MDEtNWM0ZC00MWNmLWI4ZDEtNWI4OWYxYmE4NzljIiwic2lkIjoiOTJmNzAyMWItZTkzOC00OGZmLThjOGUtNWU0ZDU5OGUwMGQxIn0.EEjSqamwgKAPBc60cXspFjIHAzde3qr47cTwJHp3Lb4",
  "access_expires_at": "2026-10-28T15:19:17.050006364Z",
  "refresh_token": "N_bJ69AnLWy5d4oGivrzawZoQuClUuFvziuR9-1tucA",
  "refresh_expires_at": "2026-10-29T03:04:17.049437509Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "97d1eac4-9817-4931-a245-f1e9cd8e171f",
  "session_id": "69d064ac-6079-4e3d-bcbd-403206d573a8",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/97d1eac4-9817-4931-a245-f1e9cd8e171f/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "169d53a3-eaeb-474f-a49d-d8781549be6c",
      "state": "READY",
      "created_at": "2026-10-28T15:04:07.850256Z",
      "ready_at": "2026-10-28T15:04:14.628646Z",
      "expires_at": "2026-11-04T15:04:14.628646Z",
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
  "device_ref": "sandbox-4782"
}
```

```json
{
  "challenge_id": "ce075833-946d-4533-88a5-e539248438d4",
  "expires_at": "2026-10-28T15:09:17.820807757Z",
  "resend_available_at": "2026-10-28T15:04:18.820807757Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "714276",
  "sent_at": "2026-10-28T15:04:17.82286126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce075833-946d-4533-88a5-e539248438d4",
  "code": "714276",
  "device_ref": "sandbox-4782"
}
```

```json
{
  "session_id": "0d3f556a-1e77-4fb8-9672-245d7701bed6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDc1OCwiaWF0IjoxNzkzMTk5ODU4LCJqdGkiOiI1YzRiYmNjMi0zYTBmLTQ0NmMtYTM1Zi0zYTNhMTUxMjFhMGMiLCJzaWQiOiIwZDNmNTU2YS0xZTc3LTRmYjgtOTY3Mi0yNDVkNzcwMWJlZDYifQ.YPzO9-DO8ic7f1q08g25AK5hSLVWsBGYiKURDwdnxnA",
  "access_expires_at": "2026-10-28T15:19:18.099766309Z",
  "refresh_token": "HAmg6FW9AdX45NHnKWOVSk_S_FBuYjWZ1QZaLxwoZZY",
  "refresh_expires_at": "2026-11-27T15:04:18.099113303Z",
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
  "device_ref": "sandbox-14238"
}
```

```json
{
  "challenge_id": "b0afb0b1-2d30-4ee5-950c-19421b6dcbc6",
  "expires_at": "2026-10-28T15:09:18.603164343Z",
  "resend_available_at": "2026-10-28T15:04:19.603164343Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "166464",
  "sent_at": "2026-10-28T15:04:18.605249387Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0afb0b1-2d30-4ee5-950c-19421b6dcbc6",
  "code": "166464",
  "device_ref": "sandbox-14238"
}
```

```json
{
  "session_id": "239ee64c-79cc-4a7c-bfb9-55bb3ce16051",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDc1OCwiaWF0IjoxNzkzMTk5ODU4LCJqdGkiOiI1MzljZGU4MC1jYmQ4LTQ4NjMtYTRkZi01MThhMzgyMDE4NmUiLCJzaWQiOiIyMzllZTY0Yy03OWNjLTRhN2MtYmZiOS01NWJiM2NlMTYwNTEifQ.r0F6XZsoL7XBTfFo2LVCviSZf-ewxk5wfFdzXkHum2s",
  "access_expires_at": "2026-10-28T15:19:18.88517221Z",
  "refresh_token": "2KrNoJ1M5gvcsFT1AF7VMtugdgIlYariez1l5xqDGsc",
  "refresh_expires_at": "2026-11-27T15:04:18.884614466Z",
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
  "command_id": "aa5a0b0e-6ad2-4b1c-83ad-c083cda1b232",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:04:19Z",
    "sequence": 1793199859403
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dd0addc2-c10a-4b37-8d3c-62cafd926cae",
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
  "last_heartbeat_at": "2026-10-28T15:04:19.420866Z",
  "last_location_at": "2026-10-28T15:04:19.420866Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-20295"
}
```

```json
{
  "challenge_id": "0af0e2ef-e462-42cd-ae04-55d2464348fc",
  "expires_at": "2026-10-28T15:09:19.687289421Z",
  "resend_available_at": "2026-10-28T15:04:20.687289421Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "606322",
  "sent_at": "2026-10-28T15:04:19.68941842Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0af0e2ef-e462-42cd-ae04-55d2464348fc",
  "code": "606322",
  "device_ref": "sandbox-20295"
}
```

```json
{
  "session_id": "843282f7-df93-450d-aa7a-5b1d76d74b31",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDc1OSwiaWF0IjoxNzkzMTk5ODU5LCJqdGkiOiIwZmQ1OGU2OS1mN2ZkLTQ2ZWEtYWNiZC1mZWUxMzZkY2I3NDYiLCJzaWQiOiI4NDMyODJmNy1kZjkzLTQ1MGQtYWE3YS01YjFkNzZkNzRiMzEifQ.6Xiv4WyY0nJNwJKhUl1v6ip-_ksAPOJ7-KLz5hAWvDU",
  "access_expires_at": "2026-10-28T15:19:19.979619229Z",
  "refresh_token": "tsNRgP2G5TARbTKQ3x0-1U-O6DJGjVysoYijDmEht0c",
  "refresh_expires_at": "2026-11-27T15:04:19.979117101Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "08828562-6b9f-49c7-b88a-de3c8e8d630e",
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
  "last_heartbeat_at": "2026-10-28T15:03:08.400619Z",
  "last_location_at": "2026-10-28T15:03:08.400619Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/08828562-6b9f-49c7-b88a-de3c8e8d630e/handover` → **200**

```json
{
  "command_id": "5a1a2071-1ba2-4f84-89e5-0065bedc2f64",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "08828562-6b9f-49c7-b88a-de3c8e8d630e",
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
  "last_heartbeat_at": "2026-10-28T15:03:08.400619Z",
  "last_location_at": "2026-10-28T15:03:08.400619Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/08828562-6b9f-49c7-b88a-de3c8e8d630e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:04:20Z",
    "sequence": 1793199860766
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "08828562-6b9f-49c7-b88a-de3c8e8d630e",
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
  "last_heartbeat_at": "2026-10-28T15:04:20.78364Z",
  "last_location_at": "2026-10-28T15:04:20.78364Z",
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
  "session_id": "68de82d0-6ed9-49be-98b8-75a7c665d17b",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3NjEsImlhdCI6MTc5MzE5OTg2MSwianRpIjoiNmRkOTRjYjktMWQ0ZS00ZmVhLThkNGUtMjZmZTAyOTg1ZDJiIiwic2lkIjoiNjhkZTgyZDAtNmVkOS00OWJlLTk4YjgtNzVhN2M2NjVkMTdiIn0.yFv_uRM-JU-hfC27RWeKDh97NTMNtiI5MmvrwpUT7QA",
  "access_expires_at": "2026-10-28T15:19:21.330188862Z",
  "refresh_token": "Ps2ufBRzMj5A6efPcNxrxUBcvCm1SsneTuurcUpWxD4",
  "refresh_expires_at": "2026-10-29T03:04:21.329572332Z",
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
  "session_id": "21f9a655-6103-4a07-a015-22c6405d1327",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3NjEsImlhdCI6MTc5MzE5OTg2MSwianRpIjoiMTYxM2RlNWQtY2NlYi00YjI3LTljNWItYjU5YjJiNzJiNDRlIiwic2lkIjoiMjFmOWE2NTUtNjEwMy00YTA3LWEwMTUtMjJjNjQwNWQxMzI3In0.OdHKus0VI84-ZT5W5B8c2KmWd4Y0jr9xgkq69Bs2ybE",
  "access_expires_at": "2026-10-28T15:19:21.87763111Z",
  "refresh_token": "IsLnA4GmGnQG9nDcpZFbdn_3Utz9AE6A6HMkWWerXPI",
  "refresh_expires_at": "2026-10-29T03:04:21.877124948Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689504833",
  "device_ref": "sandbox-8969"
}
```

```json
{
  "challenge_id": "472fa4ef-05fc-4115-870a-09409d3a3228",
  "expires_at": "2026-10-28T15:09:22.144404902Z",
  "resend_available_at": "2026-10-28T15:04:23.144404902Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380689504833` → **200**

```json
{
  "phone": "+380689504833",
  "audience": "CLIENT",
  "code": "994557",
  "sent_at": "2026-10-28T15:04:22.146924481Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "472fa4ef-05fc-4115-870a-09409d3a3228",
  "code": "994557",
  "device_ref": "sandbox-8969"
}
```

```json
{
  "session_id": "c99ffe57-91d1-4f6e-8242-7f7b4d0f7596",
  "subject": {
    "type": "CLIENT",
    "id": "f40fa8bf-aad8-4600-81eb-2e5e6bcc10b1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNDBmYThiZi1hYWQ4LTQ2MDAtODFlYi0yZTVlNmJjYzEwYjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNzYyLCJpYXQiOjE3OTMxOTk4NjIsImp0aSI6IjE4M2ZjZjJhLTBjN2MtNGRjMy1hZDYwLTc4ODkxNDI3M2JiMSIsInNpZCI6ImM5OWZmZTU3LTkxZDEtNGY2ZS04MjQyLTdmN2I0ZDBmNzU5NiJ9.lc6IarAWF3ew34pGqvqZFQwMP6B-a06a2ofvAvdRbGs",
  "access_expires_at": "2026-10-28T15:19:22.419395244Z",
  "refresh_token": "Jmpm-K43SKOs6Bj_bjoto31hgBSOAYZ9MVz_J-jb7pY",
  "refresh_expires_at": "2026-11-27T15:04:22.418891624Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7a674508-a5ed-4d9e-b2b2-339900244ef5",
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
  "id": "216715f3-068d-41d1-9933-a043de88bb90",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:09:22.683975Z",
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
  "command_id": "853e3e87-6f33-431f-9e49-1188a07fa1b6",
  "quote_id": "216715f3-068d-41d1-9933-a043de88bb90",
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
  "id": "c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f40fa8bf-aad8-4600-81eb-2e5e6bcc10b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:04:22.955125Z",
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
    "id": "b4df4cc2-4b22-4042-b5b5-c80fc789eebf",
    "order_id": "c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2",
    "expires_at": "2026-10-28T15:04:37.958762Z",
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

`POST /api/driver/v1/offers/b4df4cc2-4b22-4042-b5b5-c80fc789eebf/reject` → **204**

```json
{
  "command_id": "602c8e63-0b7b-4cb3-9f2b-dc2f1be37883"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a1484e53-143d-4601-8994-bb3ec68fc244",
    "order_id": "c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2",
    "expires_at": "2026-10-28T15:04:38.512933Z",
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

`POST /api/driver/v1/offers/a1484e53-143d-4601-8994-bb3ec68fc244/accept` → **200**

```json
{
  "command_id": "79705ae5-6dc6-4da7-aead-f5182a1d1283"
}
```

```json
{
  "id": "26f493a5-de31-440b-8752-20970b53d261",
  "order_id": "c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa865591-bb45-4527-9349-0b72e7298a94",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:04:22.955755Z",
      "actor": {
        "type": "CLIENT",
        "id": "f40fa8bf-aad8-4600-81eb-2e5e6bcc10b1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2",
        "quote_id": "216715f3-068d-41d1-9933-a043de88bb90",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "84bc4960-fbf6-466b-9f73-e0c26612aac0"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:04:22.957889Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2",
        "attempt_id": "3ac299cb-71ff-443f-a65d-b2bf8d9a66d7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "84bc4960-fbf6-466b-9f73-e0c26612aac0"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:04:22.965191Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b4df4cc2-4b22-4042-b5b5-c80fc789eebf",
        "order_id": "c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "84bc4960-fbf6-466b-9f73-e0c26612aac0"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T15:04:23.511832Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b4df4cc2-4b22-4042-b5b5-c80fc789eebf",
        "order_id": "c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2"
      },
      "correlation_id": "f2e733ff-3476-4b7a-b05f-7d25ab592503"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2` → **200**

```json
{
  "id": "c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f40fa8bf-aad8-4600-81eb-2e5e6bcc10b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "26f493a5-de31-440b-8752-20970b53d261",
    "order_id": "c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "aa865591-bb45-4527-9349-0b72e7298a94",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:04:22.955125Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2/cancel` → **200**

```json
{
  "command_id": "98ee959e-efc1-47b5-a1b8-ca8c52a19d10",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f40fa8bf-aad8-4600-81eb-2e5e6bcc10b1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "26f493a5-de31-440b-8752-20970b53d261",
    "order_id": "c3d93c0f-8c62-41c4-a8ee-fdb2e56edeb2",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "aa865591-bb45-4527-9349-0b72e7298a94",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:04:22.955125Z",
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
  "session_id": "dd0addc2-c10a-4b37-8d3c-62cafd926cae",
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
  "last_heartbeat_at": "2026-10-28T15:04:19.420866Z",
  "last_location_at": "2026-10-28T15:04:19.420866Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dd0addc2-c10a-4b37-8d3c-62cafd926cae/close` → **200**

```json
{
  "command_id": "d380a71f-4c2c-47ee-997d-1793fa58b63e",
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
  "session_id": "08828562-6b9f-49c7-b88a-de3c8e8d630e",
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
  "last_heartbeat_at": "2026-10-28T15:04:20.78364Z",
  "last_location_at": "2026-10-28T15:04:20.78364Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/08828562-6b9f-49c7-b88a-de3c8e8d630e/close` → **200**

```json
{
  "command_id": "f5a819b4-eb41-4a67-868e-deae110e1229",
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
  "session_id": "0d1aa3ca-80e3-4bc6-95f6-fdfa90be7ccb",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3NjYsImlhdCI6MTc5MzE5OTg2NiwianRpIjoiMjMzOGRlZjItYzFmYS00NjRkLWJmMzItNjNlMzM0YzAxNzRjIiwic2lkIjoiMGQxYWEzY2EtODBlMy00YmM2LTk1ZjYtZmRmYTkwYmU3Y2NiIn0.KMdYwRyuy4GcELtBFw3SJP8H6T4p4ELvDcG0C6Kak9I",
  "access_expires_at": "2026-10-28T15:19:26.276541519Z",
  "refresh_token": "c00JXnz3hJoLhnk9zkIN5Kpt36t1ZwWkWG-PCvUVjC0",
  "refresh_expires_at": "2026-10-29T03:04:26.276032022Z",
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
  "command_id": "c434c7f7-69d1-42a7-87ec-6583a560e1cd",
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
  "changed_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T15:04:26.817401Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "b30325b8-51ba-41b1-8cb1-a20ee8e8289c",
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
  "correlation_id": "2116706a-a169-4229-bb50-d243f21dac63"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "85ebe66a-cdcf-467b-ac15-eb52e2fbfae3",
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
  "correlation_id": "21e1c513-64a2-4733-847d-210985d3eac8"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633594931",
  "device_ref": "sandbox-10547"
}
```

```json
{
  "challenge_id": "1dd14ac9-da03-4088-bc81-51d9ef6c4c71",
  "expires_at": "2026-10-28T15:09:27.616973249Z",
  "resend_available_at": "2026-10-28T15:04:28.616973249Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633594931` → **200**

```json
{
  "phone": "+380633594931",
  "audience": "CLIENT",
  "code": "235093",
  "sent_at": "2026-10-28T15:04:27.61925923Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1dd14ac9-da03-4088-bc81-51d9ef6c4c71",
  "code": "235093",
  "device_ref": "sandbox-10547"
}
```

```json
{
  "session_id": "ac763ee9-0ace-4fbc-b0c4-075f4cbdd3de",
  "subject": {
    "type": "CLIENT",
    "id": "b6e97f10-db38-4937-836c-14a7a805e1bf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNmU5N2YxMC1kYjM4LTQ5MzctODM2Yy0xNGE3YTgwNWUxYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNzY3LCJpYXQiOjE3OTMxOTk4NjcsImp0aSI6ImMwMWMzMTM5LWJhOTgtNDdjNC05ZGRjLTQwY2Q0MTI1MmJjZSIsInNpZCI6ImFjNzYzZWU5LTBhY2UtNGZiYy1iMGM0LTA3NWY0Y2JkZDNkZSJ9.MU4M-5q7ah2IV_zUuS4ygALDYQHLUQUULqKCE6uhwkA",
  "access_expires_at": "2026-10-28T15:19:27.90485322Z",
  "refresh_token": "ELeMxOy-VV0GIVdJ3iwagUK47C0FkbTWCFM0w8pM5N8",
  "refresh_expires_at": "2026-11-27T15:04:27.904316385Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "31590547-29e5-4872-ae0d-0647d910be3f",
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
  "id": "c523c8fd-6bd3-4f16-81af-a06757280e88",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:09:28.165224Z",
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
  "command_id": "4847208e-77e0-43eb-ad15-55f52471ef3c",
  "quote_id": "c523c8fd-6bd3-4f16-81af-a06757280e88",
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
  "correlation_id": "1f7a2a0f-4476-4f2f-8b5a-a720cc451eac"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6b2b7975-68f0-4fc8-8cff-5aaf16d6a832",
  "quote_id": "c523c8fd-6bd3-4f16-81af-a06757280e88",
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
  "id": "3476b743-400c-41fc-a382-bf66d56b656d",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b6e97f10-db38-4937-836c-14a7a805e1bf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:04:28.691773Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3476b743-400c-41fc-a382-bf66d56b656d/cancel` → **200**

```json
{
  "command_id": "c54177a9-e721-44e2-b1e5-07f8683d8910",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3476b743-400c-41fc-a382-bf66d56b656d",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b6e97f10-db38-4937-836c-14a7a805e1bf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:04:28.691773Z",
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
  "command_id": "3bf4f873-bcee-4463-b278-8927fcb5836f",
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
  "changed_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T15:04:29.262657Z"
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
      "changed_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T15:04:29.262657Z"
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
  "device_ref": "sandbox-7726"
}
```

```json
{
  "challenge_id": "d6885c50-9a27-48bb-a94d-04ef6388c5aa",
  "expires_at": "2026-10-28T15:09:30.072410507Z",
  "resend_available_at": "2026-10-28T15:04:31.072410507Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "000218",
  "sent_at": "2026-10-28T15:04:30.074349687Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6885c50-9a27-48bb-a94d-04ef6388c5aa",
  "code": "000218",
  "device_ref": "sandbox-7726"
}
```

```json
{
  "session_id": "2f9dca1c-9ba5-4037-b96f-cc7a7fba5224",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDc3MCwiaWF0IjoxNzkzMTk5ODcwLCJqdGkiOiI0MzU2NWMxYS03ZmU2LTQ2MjgtOGFjMi03NWViZmI2OGZiOGQiLCJzaWQiOiIyZjlkY2ExYy05YmE1LTQwMzctYjk2Zi1jYzdhN2ZiYTUyMjQifQ.kcoJc1QJydQyzpqTXi0s9QsWrcXu4CtNKjMj_y4t7lw",
  "access_expires_at": "2026-10-28T15:19:30.349110481Z",
  "refresh_token": "aPpF2Psr1I3z-kPXoOc-bGgygy_gwJ0yK1rj3Hs8lgA",
  "refresh_expires_at": "2026-11-27T15:04:30.348569017Z",
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
  "command_id": "3d79b8f2-cbd3-4579-8757-63132d47dddf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:04:30Z",
    "sequence": 1793199870852
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7919f01f-d486-48b7-932e-77f793911799",
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
  "last_heartbeat_at": "2026-10-28T15:04:30.868172Z",
  "last_location_at": "2026-10-28T15:04:30.868172Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672894325",
  "device_ref": "sandbox-22891"
}
```

```json
{
  "challenge_id": "e801fac2-4943-464d-a595-af8fa13212be",
  "expires_at": "2026-10-28T15:09:31.134624554Z",
  "resend_available_at": "2026-10-28T15:04:32.134624554Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672894325` → **200**

```json
{
  "phone": "+380672894325",
  "audience": "CLIENT",
  "code": "829232",
  "sent_at": "2026-10-28T15:04:31.136621991Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e801fac2-4943-464d-a595-af8fa13212be",
  "code": "829232",
  "device_ref": "sandbox-22891"
}
```

```json
{
  "session_id": "1488e9f6-7f4e-4ff5-bee8-6e4a92102a24",
  "subject": {
    "type": "CLIENT",
    "id": "be54a0e9-452f-4555-8aff-40fa9d5be7d3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTU0YTBlOS00NTJmLTQ1NTUtOGFmZi00MGZhOWQ1YmU3ZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNzcxLCJpYXQiOjE3OTMxOTk4NzEsImp0aSI6ImNjOWUxOTA2LTMzMTctNGU1OC1iNDkzLWM4ZWQ0MjdhN2I0MyIsInNpZCI6IjE0ODhlOWY2LTdmNGUtNGZmNS1iZWU4LTZlNGE5MjEwMmEyNCJ9.WsyP6BTbWQS1TcABQPLTopt6qpzEHcCnUuGAP6LUj5o",
  "access_expires_at": "2026-10-28T15:19:31.420051512Z",
  "refresh_token": "XjtYcxAL9aABwhEM5PHdFWVdsKo9hxxCTKoy2Vl6yHw",
  "refresh_expires_at": "2026-11-27T15:04:31.419536457Z",
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
  "command_id": "8f620b31-3774-4d2a-a81c-f77dcfc3cac8",
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
  "id": "f1e3f871-c698-4f12-8f91-fb5a565221a6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:09:31.929717Z",
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
  "command_id": "aade3c8c-1b3e-4460-8420-05f5dcaaedbd",
  "platform": "ANDROID",
  "token": "sandbox-driver-8befca27-2c10-4420-9eaa-9c16d14e7837"
}
```

```json
{
  "id": "66090151-d633-4684-9695-3679e12212f1",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T15:04:32.223671Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "7bf50c27-3f36-4a28-8247-4e9666826862",
  "platform": "ANDROID",
  "token": "sandbox-rider-27779e7f-5ffa-4226-9aeb-f785b7bba20e"
}
```

```json
{
  "id": "6eef77da-2dd9-427e-ac0b-9b71e20c155e",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T15:04:32.484253Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "05280c68-d548-40b3-9cb4-75b90c5cc8d0",
  "quote_id": "f1e3f871-c698-4f12-8f91-fb5a565221a6",
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
  "id": "81ff11dd-ad45-418b-8317-58af7df19927",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "be54a0e9-452f-4555-8aff-40fa9d5be7d3",
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
  "created_at": "2026-10-28T15:04:32.762768Z",
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
    "id": "8866e21a-5106-43cc-a217-a9f53d48574b",
    "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
    "expires_at": "2026-10-28T15:04:47.765798Z",
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

`POST /api/driver/v1/offers/8866e21a-5106-43cc-a217-a9f53d48574b/accept` → **200**

```json
{
  "command_id": "aa1ead65-d18d-4b49-83e0-601254dd8583"
}
```

```json
{
  "id": "be561b73-3cc2-46b0-9a9b-91d79bac8f53",
  "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9c229686-7918-4e32-b5f8-b1809da6d564",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T15:04:32.740Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T15:04:32.740Z` → **200**

```json
[
  {
    "at": "2026-10-28T15:04:34.033922298Z",
    "token_suffix": "4e7837",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "a35dde13-03c7-42a2-b38c-4850eadbf337",
      "order_version": "2",
      "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672894325&after=2026-10-28T15:04:32.740Z` → **200**

```json
[
  {
    "at": "2026-10-28T15:04:34.03655439Z",
    "token_suffix": "bba20e",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "64dedd04-ae67-4146-baac-8623d67ff9f3",
      "order_version": "3",
      "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/81ff11dd-ad45-418b-8317-58af7df19927/messages` → **201**

```json
{
  "command_id": "53ab4723-170b-49d0-ab68-cdefae28a4e5",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "89c56683-62af-46bd-81a1-43c7e814ef02",
  "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T15:04:34.658072567Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9c229686-7918-4e32-b5f8-b1809da6d564",
  "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
  "assignment_id": "be561b73-3cc2-46b0-9a9b-91d79bac8f53",
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

`POST /api/driver/v1/trips/9c229686-7918-4e32-b5f8-b1809da6d564/messages` → **201**

```json
{
  "command_id": "8f29d3ae-5fe1-4b1b-9339-d01e5b52ec93",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "681402d3-f2c9-4c8d-93e3-8f9de078bd31",
  "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T15:04:35.175285999Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/81ff11dd-ad45-418b-8317-58af7df19927/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/9c229686-7918-4e32-b5f8-b1809da6d564/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672894325"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/7919f01f-d486-48b7-932e-77f793911799/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:04:35Z",
    "sequence": 1793199875932
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7919f01f-d486-48b7-932e-77f793911799",
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
  "last_heartbeat_at": "2026-10-28T15:04:35.949202Z",
  "last_location_at": "2026-10-28T15:04:35.949202Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9c229686-7918-4e32-b5f8-b1809da6d564",
  "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
  "assignment_id": "be561b73-3cc2-46b0-9a9b-91d79bac8f53",
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

`POST /api/driver/v1/trips/9c229686-7918-4e32-b5f8-b1809da6d564/arrive` → **200**

```json
{
  "command_id": "768b35ee-0cb8-4b4f-a3bf-a6ae349d841a",
  "expected_version": 0
}
```

```json
{
  "id": "9c229686-7918-4e32-b5f8-b1809da6d564",
  "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
  "assignment_id": "be561b73-3cc2-46b0-9a9b-91d79bac8f53",
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
  "arrived_at": "2026-10-28T15:04:36.475919Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9c229686-7918-4e32-b5f8-b1809da6d564/start` → **200**

```json
{
  "command_id": "39945f0e-b255-4aad-a5a5-b56026065aae",
  "expected_version": 1
}
```

```json
{
  "id": "9c229686-7918-4e32-b5f8-b1809da6d564",
  "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
  "assignment_id": "be561b73-3cc2-46b0-9a9b-91d79bac8f53",
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
  "arrived_at": "2026-10-28T15:04:36.475919Z",
  "started_at": "2026-10-28T15:04:36.75104Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/7919f01f-d486-48b7-932e-77f793911799/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:04:37Z",
    "sequence": 1793199877125
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7919f01f-d486-48b7-932e-77f793911799",
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
  "last_heartbeat_at": "2026-10-28T15:04:37.031148Z",
  "last_location_at": "2026-10-28T15:04:37.031148Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/9c229686-7918-4e32-b5f8-b1809da6d564/complete` → **200**

```json
{
  "command_id": "87263ede-dd97-4f83-b838-126c2d6ec6a1",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:04:37Z",
  "cash_received": true
}
```

```json
{
  "id": "9c229686-7918-4e32-b5f8-b1809da6d564",
  "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
  "assignment_id": "be561b73-3cc2-46b0-9a9b-91d79bac8f53",
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
  "arrived_at": "2026-10-28T15:04:36.475919Z",
  "started_at": "2026-10-28T15:04:36.75104Z",
  "completed_at": "2026-10-28T15:04:37.304223Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/81ff11dd-ad45-418b-8317-58af7df19927` → **200**

```json
{
  "id": "81ff11dd-ad45-418b-8317-58af7df19927",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "be54a0e9-452f-4555-8aff-40fa9d5be7d3",
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
    "id": "be561b73-3cc2-46b0-9a9b-91d79bac8f53",
    "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c229686-7918-4e32-b5f8-b1809da6d564",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:04:32.762768Z",
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
    "id": "81ff11dd-ad45-418b-8317-58af7df19927",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T15:04:32.762768Z",
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
    "id": "9c229686-7918-4e32-b5f8-b1809da6d564",
    "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
    "order_short_number": 10,
    "created_at": "2026-10-28T15:04:33.299407Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1a46f5b8-327c-4b9e-be9b-9ecca04bda64",
    "order_id": "435bba0b-77c4-4b20-94aa-1c01019bb34c",
    "order_short_number": 2,
    "created_at": "2026-10-28T15:02:59.706258Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d234344f-847a-4659-8683-bd884512d579",
    "order_id": "00494ee0-7b80-41fb-aba8-235218f395e5",
    "order_short_number": 1,
    "created_at": "2026-10-28T15:02:38.826727Z",
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

`GET /api/rider/v1/orders/81ff11dd-ad45-418b-8317-58af7df19927/tip` → **200**

```json
{
  "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
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
  "available_until": "2026-10-29T15:04:37.304223Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/81ff11dd-ad45-418b-8317-58af7df19927/tip` → **201**

```json
{
  "command_id": "2b06dc11-088b-4b3e-a513-911ff99661a3",
  "amount_minor": 1100
}
```

```json
{
  "id": "a79bc404-d62a-4f41-b8c1-9e8f5ae7948a",
  "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T15:04:42.165639Z"
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
  "session_id": "f9d2b3b6-b293-4d6c-ae43-65d6b05f17d1",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3ODIsImlhdCI6MTc5MzE5OTg4MiwianRpIjoiMTJhOWNkYWQtNTM4Zi00NjY1LTg2NzktM2Q1M2M3ODc1NWFmIiwic2lkIjoiZjlkMmIzYjYtYjI5My00ZDZjLWFlNDMtNjVkNmIwNWYxN2QxIn0.cwlIhlpedss90mr-_abRM-i8VTW1dkUgj6teG7NSxZM",
  "access_expires_at": "2026-10-28T15:19:42.706891018Z",
  "refresh_token": "z6Y81eyNCtJpfivMQyomnWM-pYGWPQNZUCsJS7VGgQI",
  "refresh_expires_at": "2026-10-29T03:04:42.706299625Z",
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
  "generated_at": "2026-10-28T15:04:42.96191453Z"
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
  "generated_at": "2026-10-28T15:04:43.230609353Z"
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
  "session_id": "a109059d-5ea8-4cd0-9358-5b7b7bb20707",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3ODMsImlhdCI6MTc5MzE5OTg4MywianRpIjoiZjZiMjk5ZGYtYmM2Yy00NjY2LWIwNDAtZWY0OWNiNjhlODcyIiwic2lkIjoiYTEwOTA1OWQtNWVhOC00Y2QwLTkzNTgtNWI3YjdiYjIwNzA3In0.P8NKPL7rxjrwrL6SbSoSETG7jive_PSXAP3nbtp3Tcw",
  "access_expires_at": "2026-10-28T15:19:43.784520333Z",
  "refresh_token": "3wEmmhEP7PpnOtmB1IiJyHC_HdjtifwyxyyQTmhftMM",
  "refresh_expires_at": "2026-10-29T03:04:43.783929454Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/81ff11dd-ad45-418b-8317-58af7df19927/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:04:32.763261Z",
      "actor": {
        "type": "CLIENT",
        "id": "be54a0e9-452f-4555-8aff-40fa9d5be7d3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
        "quote_id": "f1e3f871-c698-4f12-8f91-fb5a565221a6",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "30bb7abc-ece9-4560-8633-3faf6ee99d6e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:04:32.765049Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
        "attempt_id": "0a16b774-206c-499e-bb89-89897c3c1c12",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "30bb7abc-ece9-4560-8633-3faf6ee99d6e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:04:32.767758Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8866e21a-5106-43cc-a217-a9f53d48574b",
        "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "30bb7abc-ece9-4560-8633-3faf6ee99d6e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:04:33.300942Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "8866e21a-5106-43cc-a217-a9f53d48574b",
        "order_id": "81ff11dd-ad45-418b-8317-58af7df19927",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "be561b73-3cc2-46b0-9a9b-91d79bac8f53"
      },
      "correlation_id": "c679067e-25db-43ab-9f9d-7ad855ccd9f7"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T15:04:44.31237633Z",
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
      "last_location_at": "2026-10-28T15:04:37.031148Z",
      "order_id": null
    }
  ]
}
```

Done: order 81ff11dd-ad45-418b-8317-58af7df19927.

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
  "session_id": "d3bb1a03-08e8-49a5-becd-c655c96224cc",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3ODQsImlhdCI6MTc5MzE5OTg4NCwianRpIjoiMzhlMmQ0MDctYWJmYS00ZTJlLTg5MjYtZWZkZDYyNmRmODI0Iiwic2lkIjoiZDNiYjFhMDMtMDhlOC00OWE1LWJlY2QtYzY1NWM5NjIyNGNjIn0.uSh_RRj22TxcfmlSBNpgvqZVoNDaClcXmGux78PcE_s",
  "access_expires_at": "2026-10-28T15:19:44.86934603Z",
  "refresh_token": "lH_kp8J2EFFin3MXw967rTh_i0HeG4Zsbn_hdcQ2YK8",
  "refresh_expires_at": "2026-10-29T03:04:44.868800451Z",
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
  "command_id": "9525da67-05f3-41a5-9341-47be49e7615b",
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
  "timestamp": "2026-10-28T15:04:45.000+0000",
  "channel": {
    "id": "1730052000.1654612746",
    "linkedid": "1730052000.1654612746",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678442254"
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
  "timestamp": "2026-10-28T15:04:45.000+0000",
  "channel": {
    "id": "1730052000.1654612746",
    "linkedid": "1730052000.1654612746",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678442254"
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
  "session_id": "ccd90375-b2be-4f2b-adc7-a44c8471145f",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3ODUsImlhdCI6MTc5MzE5OTg4NSwianRpIjoiNThkZmExYTItYjhlYi00MjdlLWE2OTMtMGRlZTU1MDEwZjg3Iiwic2lkIjoiY2NkOTAzNzUtYjJiZS00ZjJiLWFkYzctYTQ0Yzg0NzExNDVmIn0.h880uI7LuzPcHoFLy2y5YSqelSI8OlaF38l36eQAmR0",
  "access_expires_at": "2026-10-28T15:19:45.973275426Z",
  "refresh_token": "TrYn9VpJbVuR8TCfB29sVPHiFu_Y4eMU_h1-Hn1-8iM",
  "refresh_expires_at": "2026-10-29T03:04:45.972656651Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "9b9ace95-b434-48c2-91c3-dab262b04373",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678442254",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:04:45Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/9b9ace95-b434-48c2-91c3-dab262b04373/answer` → **200**

```json
{
  "command_id": "1ef9281a-2a72-4d50-9b5e-5e05c507a96d"
}
```

```json
{
  "id": "9b9ace95-b434-48c2-91c3-dab262b04373",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678442254",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "order_ids": [],
  "started_at": "2026-10-28T15:04:45Z",
  "answered_at": "2026-10-28T15:04:46.500758Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1654612746",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2fc5705b-67d1-4ef4-a33a-6df81bd3cba9",
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
  "id": "2daff0c7-bb16-467a-a3e7-52d36b407b35",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:09:46.791814Z",
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
  "command_id": "6438981e-e172-4f18-b3e6-a112e7575723",
  "quote_id": "2daff0c7-bb16-467a-a3e7-52d36b407b35",
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
    "phone": "+380678442254"
  },
  "call_id": "9b9ace95-b434-48c2-91c3-dab262b04373"
}
```

```json
{
  "id": "9cc36356-27be-48b2-aca6-58a82d586128",
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
  "created_at": "2026-10-28T15:04:47.063578Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678442254"
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
    "id": "1730052000.1654612746",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9b9ace95-b434-48c2-91c3-dab262b04373",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678442254",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_ids": [
        "9cc36356-27be-48b2-aca6-58a82d586128"
      ],
      "started_at": "2026-10-28T15:04:45Z",
      "answered_at": "2026-10-28T15:04:46.500758Z",
      "ended_at": "2026-10-28T15:04:47.356001Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "93ddc942-ac6c-4659-b6b3-861ace4a9ffa",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677577423",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_ids": [],
      "started_at": "2026-10-28T15:02:46.718124Z",
      "answered_at": "2026-10-28T15:02:47.0182Z",
      "ended_at": "2026-10-28T15:02:47.294614Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:02:54.611495Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/9cc36356-27be-48b2-aca6-58a82d586128` → **200**

```json
{
  "id": "9cc36356-27be-48b2-aca6-58a82d586128",
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
  "created_at": "2026-10-28T15:04:47.063578Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678442254"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/9cc36356-27be-48b2-aca6-58a82d586128` → **200**

```json
{
  "id": "9cc36356-27be-48b2-aca6-58a82d586128",
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
  "created_at": "2026-10-28T15:04:47.063578Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678442254"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9cc36356-27be-48b2-aca6-58a82d586128/cancel` → **200**

```json
{
  "command_id": "8fec3e82-b887-43cb-bd28-4c16f725d061",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9cc36356-27be-48b2-aca6-58a82d586128",
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
  "created_at": "2026-10-28T15:04:47.063578Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678442254"
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

Done: call 9b9ace95-b434-48c2-91c3-dab262b04373 with order 9cc36356-27be-48b2-aca6-58a82d586128.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1631"
}
```

```json
{
  "challenge_id": "d529712b-5757-47ea-8628-30722f7b35a4",
  "expires_at": "2026-10-28T15:09:48.492756511Z",
  "resend_available_at": "2026-10-28T15:04:49.492756511Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "542643",
  "sent_at": "2026-10-28T15:04:48.495145689Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d529712b-5757-47ea-8628-30722f7b35a4",
  "code": "542643",
  "device_ref": "sandbox-1631"
}
```

```json
{
  "session_id": "2f436043-2fe3-4c7b-94b1-eac30979dc1a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDc4OCwiaWF0IjoxNzkzMTk5ODg4LCJqdGkiOiIwNjlmOGJkNi1jYjk0LTQ5NzgtYWNlMi1mNjZkMDdiNTFiYWIiLCJzaWQiOiIyZjQzNjA0My0yZmUzLTRjN2ItOTRiMS1lYWMzMDk3OWRjMWEifQ.pSWKzIRpquMQ-gl6Elx5GGjFeamMO500y-Hq4pY-8RQ",
  "access_expires_at": "2026-10-28T15:19:48.780014057Z",
  "refresh_token": "1hYqNMGb62O7tSczFM9ilPtIRPN5ivMGpKZGr2R6mTw",
  "refresh_expires_at": "2026-11-27T15:04:48.779518913Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7919f01f-d486-48b7-932e-77f793911799",
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
  "last_heartbeat_at": "2026-10-28T15:04:37.031148Z",
  "last_location_at": "2026-10-28T15:04:37.031148Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7919f01f-d486-48b7-932e-77f793911799/handover` → **200**

```json
{
  "command_id": "abcc04de-8327-4313-bf0a-d118a7e5abce",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7919f01f-d486-48b7-932e-77f793911799",
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
  "last_heartbeat_at": "2026-10-28T15:04:37.031148Z",
  "last_location_at": "2026-10-28T15:04:37.031148Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7919f01f-d486-48b7-932e-77f793911799/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:04:49Z",
    "sequence": 1793199889550
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7919f01f-d486-48b7-932e-77f793911799",
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
  "last_heartbeat_at": "2026-10-28T15:04:49.566759Z",
  "last_location_at": "2026-10-28T15:04:49.566759Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668534056",
  "device_ref": "sandbox-25870"
}
```

```json
{
  "challenge_id": "19752067-991c-46ff-be10-dcdc23ea007d",
  "expires_at": "2026-10-28T15:09:49.818426167Z",
  "resend_available_at": "2026-10-28T15:04:50.818426167Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668534056` → **200**

```json
{
  "phone": "+380668534056",
  "audience": "CLIENT",
  "code": "499234",
  "sent_at": "2026-10-28T15:04:49.820688964Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19752067-991c-46ff-be10-dcdc23ea007d",
  "code": "499234",
  "device_ref": "sandbox-25870"
}
```

```json
{
  "session_id": "bca6f0dd-ab11-4b57-a275-dbbea2ac6ed7",
  "subject": {
    "type": "CLIENT",
    "id": "351341d2-670c-41fd-ab41-78a5670cf811"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNTEzNDFkMi02NzBjLTQxZmQtYWI0MS03OGE1NjcwY2Y4MTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNzkwLCJpYXQiOjE3OTMxOTk4OTAsImp0aSI6ImJjZDliMGFiLTc0OWEtNGRkYi1hZThmLTQ0OWZmYjA2ODZiNyIsInNpZCI6ImJjYTZmMGRkLWFiMTEtNGI1Ny1hMjc1LWRiYmVhMmFjNmVkNyJ9.HmXDjIiAFGMWP6R4k1skd9sWfexo9bYZs0YB_hrpyZk",
  "access_expires_at": "2026-10-28T15:19:50.097433055Z",
  "refresh_token": "g8QBg2kb7_RIV_SRWY_8Z4GOTY1ZctY0Qs7BdwUFBNg",
  "refresh_expires_at": "2026-11-27T15:04:50.096774527Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b4ac6af8-e4e5-49e9-9c83-83fd2052c930",
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
  "id": "41837c75-288c-4905-a4ea-15065bfc8cda",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:09:50.377018Z",
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
  "command_id": "13c273eb-5c4e-46c0-b26f-73ee692fe947",
  "quote_id": "41837c75-288c-4905-a4ea-15065bfc8cda",
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
  "id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "351341d2-670c-41fd-ab41-78a5670cf811",
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
  "created_at": "2026-10-28T15:04:50.647337Z",
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
    "id": "65beda8f-7cef-4705-b48d-edd26dcd720d",
    "order_id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
    "expires_at": "2026-10-28T15:05:05.65014Z",
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

`POST /api/driver/v1/offers/65beda8f-7cef-4705-b48d-edd26dcd720d/accept` → **200**

```json
{
  "command_id": "df953d6e-822e-4c79-88ab-988cd7042dc1"
}
```

```json
{
  "id": "7d00520e-5729-4782-9200-6ac17b54155e",
  "order_id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "522fded8-6f39-48fa-abbc-28b0ade494ed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "522fded8-6f39-48fa-abbc-28b0ade494ed",
  "order_id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
  "assignment_id": "7d00520e-5729-4782-9200-6ac17b54155e",
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

`POST /api/driver/v1/work-sessions/7919f01f-d486-48b7-932e-77f793911799/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:04:51Z",
    "sequence": 1793199891689
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7919f01f-d486-48b7-932e-77f793911799",
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
  "last_heartbeat_at": "2026-10-28T15:04:51.706098Z",
  "last_location_at": "2026-10-28T15:04:51.706098Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/522fded8-6f39-48fa-abbc-28b0ade494ed/arrive` → **200**

```json
{
  "command_id": "0d427603-11be-4040-b3c7-27c5a8a718e3",
  "expected_version": 0
}
```

```json
{
  "id": "522fded8-6f39-48fa-abbc-28b0ade494ed",
  "order_id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
  "assignment_id": "7d00520e-5729-4782-9200-6ac17b54155e",
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
  "arrived_at": "2026-10-28T15:04:51.969968Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/522fded8-6f39-48fa-abbc-28b0ade494ed/start` → **200**

```json
{
  "command_id": "8e8283a8-7d65-4ee6-83c7-90da9f766f9e",
  "expected_version": 1
}
```

```json
{
  "id": "522fded8-6f39-48fa-abbc-28b0ade494ed",
  "order_id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
  "assignment_id": "7d00520e-5729-4782-9200-6ac17b54155e",
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
  "arrived_at": "2026-10-28T15:04:51.969968Z",
  "started_at": "2026-10-28T15:04:52.248694Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/7919f01f-d486-48b7-932e-77f793911799/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:04:52Z",
    "sequence": 1793199892514
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7919f01f-d486-48b7-932e-77f793911799",
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
  "last_heartbeat_at": "2026-10-28T15:04:52.531116Z",
  "last_location_at": "2026-10-28T15:04:52.531116Z",
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
  "device_ref": "sandbox-19117"
}
```

```json
{
  "challenge_id": "eaf32f19-fded-452a-bcad-6ac015de5556",
  "expires_at": "2026-10-28T15:09:52.797186977Z",
  "resend_available_at": "2026-10-28T15:04:53.797186977Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "631783",
  "sent_at": "2026-10-28T15:04:52.799563661Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eaf32f19-fded-452a-bcad-6ac015de5556",
  "code": "631783",
  "device_ref": "sandbox-19117"
}
```

```json
{
  "session_id": "43cecaa2-e00f-4a13-ac85-c8bba83c6f3d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDc5MywiaWF0IjoxNzkzMTk5ODkzLCJqdGkiOiJmZTI4ZDBjYS01ODRhLTQ2MGItOTQ3Zi05MzkyZDVhY2I3Y2YiLCJzaWQiOiI0M2NlY2FhMi1lMDBmLTRhMTMtYWM4NS1jOGJiYTgzYzZmM2QifQ.WW-NmpnViZTL9Q3_RlcSg9cfIM2iGObpIA0gT6nomik",
  "access_expires_at": "2026-10-28T15:19:53.073035939Z",
  "refresh_token": "mpJenGAy7czyX4L5P08LMWUqLa33P1qEoMbkGKfecU0",
  "refresh_expires_at": "2026-11-27T15:04:53.072547893Z",
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
  "command_id": "61719f15-b369-49c8-ac4b-ffe534944074",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:04:53Z",
    "sequence": 1793199893586
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b1e97c54-4c25-4ee8-98d1-557e55b798cc",
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
  "last_heartbeat_at": "2026-10-28T15:04:53.602268Z",
  "last_location_at": "2026-10-28T15:04:53.602268Z",
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
  "session_id": "485d1752-bf25-4784-8704-ee8e3e18b17f",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3OTQsImlhdCI6MTc5MzE5OTg5NCwianRpIjoiYTAwMTgzYzEtMDFmOC00YmExLWI1YTctYzE3ZTIwM2Q0YTcwIiwic2lkIjoiNDg1ZDE3NTItYmYyNS00Nzg0LTg3MDQtZWU4ZTNlMThiMTdmIn0.4moc5trioEAuQ-vEF5lFsJi3T2d_XTaCB8USPg1AH5w",
  "access_expires_at": "2026-10-28T15:19:54.147417614Z",
  "refresh_token": "MFdcAtK3kU2Ir66YIwDNLIeITj-IGCF6ko-QLmDXtOk",
  "refresh_expires_at": "2026-10-29T03:04:54.146917352Z",
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
  "session_id": "dceec4a0-48f1-4aac-8dd7-f00590dee87a",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA3OTQsImlhdCI6MTc5MzE5OTg5NCwianRpIjoiNGU3ODQ1NzAtNjgwZS00NDg3LThiZmUtMTJmZWVlZjY4NDg5Iiwic2lkIjoiZGNlZWM0YTAtNDhmMS00YWFjLThkZDctZjAwNTkwZGVlODdhIn0.DDJvWkjsJ5-aX4i2A2GkUYZu1bvhlm7HVe0N6GB94Zw",
  "access_expires_at": "2026-10-28T15:19:54.672144337Z",
  "refresh_token": "7Tff1kKjlPEW-OJfRWIbwL0HOmSiJ1xaVfEOyCzRt-A",
  "refresh_expires_at": "2026-10-29T03:04:54.671639194Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e700c4ac-a719-4eca-b81d-c48058a7045b` → **200**

```json
{
  "id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
  "short_number": 12,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "351341d2-670c-41fd-ab41-78a5670cf811",
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
    "id": "7d00520e-5729-4782-9200-6ac17b54155e",
    "order_id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "522fded8-6f39-48fa-abbc-28b0ade494ed",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T15:04:50.647337Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e700c4ac-a719-4eca-b81d-c48058a7045b/interrupt` → **200**

```json
{
  "command_id": "326ef20f-85de-4d60-b7cc-f7d4b88800f1",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
    "short_number": 12,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "351341d2-670c-41fd-ab41-78a5670cf811",
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
      "id": "7d00520e-5729-4782-9200-6ac17b54155e",
      "order_id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "522fded8-6f39-48fa-abbc-28b0ade494ed",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T15:04:50.647337Z",
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
    "id": "11137c38-0135-4503-a265-ce5ad45f3d54",
    "short_number": 13,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "351341d2-670c-41fd-ab41-78a5670cf811",
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
    "id": "e52c8b3e-eedc-40f6-af5e-faf239784e09",
    "order_id": "11137c38-0135-4503-a265-ce5ad45f3d54",
    "expires_at": "2026-10-28T15:05:10.246113Z",
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

`POST /api/driver/v1/offers/e52c8b3e-eedc-40f6-af5e-faf239784e09/accept` → **200**

```json
{
  "command_id": "1bcf847a-7775-4492-a17f-e59f90297785"
}
```

```json
{
  "id": "48295927-a1f1-4f36-a82a-546665e4b38f",
  "order_id": "11137c38-0135-4503-a265-ce5ad45f3d54",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fe28d986-f7bd-4df4-80ab-480a50100943",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fe28d986-f7bd-4df4-80ab-480a50100943",
  "order_id": "11137c38-0135-4503-a265-ce5ad45f3d54",
  "assignment_id": "48295927-a1f1-4f36-a82a-546665e4b38f",
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
  "session_id": "b1e97c54-4c25-4ee8-98d1-557e55b798cc",
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
  "last_heartbeat_at": "2026-10-28T15:04:53.602268Z",
  "last_location_at": "2026-10-28T15:04:53.602268Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/b1e97c54-4c25-4ee8-98d1-557e55b798cc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:04:56Z",
    "sequence": 1793199896546
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b1e97c54-4c25-4ee8-98d1-557e55b798cc",
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
  "last_heartbeat_at": "2026-10-28T15:04:56.563337Z",
  "last_location_at": "2026-10-28T15:04:56.563337Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fe28d986-f7bd-4df4-80ab-480a50100943/arrive` → **200**

```json
{
  "command_id": "91c96de6-bcca-462a-bd3e-b5053778f1f8",
  "expected_version": 0
}
```

```json
{
  "id": "fe28d986-f7bd-4df4-80ab-480a50100943",
  "order_id": "11137c38-0135-4503-a265-ce5ad45f3d54",
  "assignment_id": "48295927-a1f1-4f36-a82a-546665e4b38f",
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
  "arrived_at": "2026-10-28T15:04:56.826765Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fe28d986-f7bd-4df4-80ab-480a50100943/start` → **200**

```json
{
  "command_id": "c0d95588-aebc-4085-81de-c767916c452f",
  "expected_version": 1
}
```

```json
{
  "id": "fe28d986-f7bd-4df4-80ab-480a50100943",
  "order_id": "11137c38-0135-4503-a265-ce5ad45f3d54",
  "assignment_id": "48295927-a1f1-4f36-a82a-546665e4b38f",
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
  "arrived_at": "2026-10-28T15:04:56.826765Z",
  "started_at": "2026-10-28T15:04:57.102286Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fe28d986-f7bd-4df4-80ab-480a50100943/complete` → **200**

```json
{
  "command_id": "b419797b-f173-482a-8b24-ce433defea98",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:04:57Z"
}
```

```json
{
  "id": "fe28d986-f7bd-4df4-80ab-480a50100943",
  "order_id": "11137c38-0135-4503-a265-ce5ad45f3d54",
  "assignment_id": "48295927-a1f1-4f36-a82a-546665e4b38f",
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
  "arrived_at": "2026-10-28T15:04:56.826765Z",
  "started_at": "2026-10-28T15:04:57.102286Z",
  "completed_at": "2026-10-28T15:04:57.385695Z",
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
    "id": "11137c38-0135-4503-a265-ce5ad45f3d54",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-28T15:04:55.234984Z",
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
    "id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
    "short_number": 12,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:04:50.647337Z",
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

`GET /api/operator/v1/orders/e700c4ac-a719-4eca-b81d-c48058a7045b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:04:50.647837Z",
      "actor": {
        "type": "CLIENT",
        "id": "351341d2-670c-41fd-ab41-78a5670cf811",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
        "quote_id": "41837c75-288c-4905-a4ea-15065bfc8cda",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "f6fb6b0c-5884-4f3e-a2b0-43eb3db6277a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:04:50.649459Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
        "attempt_id": "1d141853-c50b-4c73-8b55-953c0eb892d0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f6fb6b0c-5884-4f3e-a2b0-43eb3db6277a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:04:50.652026Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "65beda8f-7cef-4705-b48d-edd26dcd720d",
        "order_id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "f6fb6b0c-5884-4f3e-a2b0-43eb3db6277a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:04:51.180104Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "65beda8f-7cef-4705-b48d-edd26dcd720d",
        "order_id": "e700c4ac-a719-4eca-b81d-c48058a7045b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "7d00520e-5729-4782-9200-6ac17b54155e"
      },
      "correlation_id": "ea13385c-f155-470b-b30b-9c039929d8e6"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/11137c38-0135-4503-a265-ce5ad45f3d54/tip` → **200**

```json
{
  "order_id": "11137c38-0135-4503-a265-ce5ad45f3d54",
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
  "available_until": "2026-10-29T15:04:57.385695Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/11137c38-0135-4503-a265-ce5ad45f3d54/tip` → **409**

```json
{
  "command_id": "e7f21f48-12a2-4cf9-b3c6-021fdbb0e597",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/11137c38-0135-4503-a265-ce5ad45f3d54/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "be8aebe1-99eb-44c0-8991-074c12e3e5a5"
}
```

Done: interrupted e700c4ac-a719-4eca-b81d-c48058a7045b, follow-up 11137c38-0135-4503-a265-ce5ad45f3d54.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7919f01f-d486-48b7-932e-77f793911799",
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
  "last_heartbeat_at": "2026-10-28T15:04:52.531116Z",
  "last_location_at": "2026-10-28T15:04:52.531116Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7919f01f-d486-48b7-932e-77f793911799/close` → **200**

```json
{
  "command_id": "4c27ac6e-2897-4704-984a-a6ae97db3523",
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
  "session_id": "b1e97c54-4c25-4ee8-98d1-557e55b798cc",
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
  "last_heartbeat_at": "2026-10-28T15:04:56.563337Z",
  "last_location_at": "2026-10-28T15:04:56.563337Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1e97c54-4c25-4ee8-98d1-557e55b798cc/close` → **200**

```json
{
  "command_id": "c8d15661-e78c-402f-b326-0848dd6c56fe",
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
  "session_id": "c4d93925-38b1-4e54-8594-77b9a83353d9",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MDMsImlhdCI6MTc5MzE5OTkwMywianRpIjoiNmY4YmFjY2QtMDQzMy00NDBkLThiMzMtMTY5NzJkYjc4NTcyIiwic2lkIjoiYzRkOTM5MjUtMzhiMS00ZTU0LTg1OTQtNzdiOWE4MzM1M2Q5In0.JrcD12Nn7-_43I5eJvMiAegq0hUIMwFt_D7UDqxUlGc",
  "access_expires_at": "2026-10-28T15:20:03.33542133Z",
  "refresh_token": "YmVGPRvXQqa5rneGuyfVT7S4nD0scRlu0T_cneio1OQ",
  "refresh_expires_at": "2026-10-29T03:05:03.334872449Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "bddb8a64-9ad7-4f92-8908-806cc8c7bfab",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:05:03Z"
}
```

```json
{
  "id": "67f33dd9-612a-4f4d-adeb-5442a22a4194",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:05:03Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/67f33dd9-612a-4f4d-adeb-5442a22a4194/publish` → **200**

```json
{
  "command_id": "0bd7ec23-d5f3-45c6-b00a-b0e24c4b53c8",
  "expected_version": 0
}
```

```json
{
  "id": "67f33dd9-612a-4f4d-adeb-5442a22a4194",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:05:03.885047Z",
  "published_at": "2026-10-28T15:05:03.885047Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "67f33dd9-612a-4f4d-adeb-5442a22a4194",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T15:05:03.885047Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636156335",
  "device_ref": "sandbox-8250"
}
```

```json
{
  "challenge_id": "0f2a7145-bc97-492b-9136-96f0a277f706",
  "expires_at": "2026-10-28T15:10:04.405189273Z",
  "resend_available_at": "2026-10-28T15:05:05.405189273Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636156335` → **200**

```json
{
  "phone": "+380636156335",
  "audience": "CLIENT",
  "code": "705876",
  "sent_at": "2026-10-28T15:05:04.407524311Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f2a7145-bc97-492b-9136-96f0a277f706",
  "code": "705876",
  "device_ref": "sandbox-8250"
}
```

```json
{
  "session_id": "c1d67fa6-6dff-4275-814e-71aca6d52279",
  "subject": {
    "type": "CLIENT",
    "id": "3eaddea4-78cb-4969-8e36-b15601e6226f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZWFkZGVhNC03OGNiLTQ5NjktOGUzNi1iMTU2MDFlNjIyNmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODA0LCJpYXQiOjE3OTMxOTk5MDQsImp0aSI6IjkyN2JhZTA4LTVkNDItNDM1Mi1iMzY0LWQ2YmZjZGU4YjIzYSIsInNpZCI6ImMxZDY3ZmE2LTZkZmYtNDI3NS04MTRlLTcxYWNhNmQ1MjI3OSJ9.0BuQMlyWAlvQPN7PVDftEsOK11O0JVARkaDj7038QGs",
  "access_expires_at": "2026-10-28T15:20:04.68429467Z",
  "refresh_token": "c77kYNGsF6LceAfCqrzr8AqDJ0kvELwoj32dPHoVi14",
  "refresh_expires_at": "2026-11-27T15:05:04.683830672Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "67f33dd9-612a-4f4d-adeb-5442a22a4194",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T15:05:03.885047Z",
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
  "command_id": "dd3c1fcf-aaa9-4438-85fc-619d10870a8f",
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
  "id": "e3590ed7-6553-4db6-b8e5-45cdb0ff4331",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:05.197664Z",
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
  "command_id": "0f06a906-528c-4156-b0d9-5dbaddd9e95f",
  "quote_id": "e3590ed7-6553-4db6-b8e5-45cdb0ff4331",
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
  "correlation_id": "5f5fa784-2ca6-4377-91fc-f56307bc12dd"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "9085dff2-5297-49df-90f5-a503de915cfb",
  "version_id": "67f33dd9-612a-4f4d-adeb-5442a22a4194",
  "language": "uk"
}
```

```json
{
  "version_id": "67f33dd9-612a-4f4d-adeb-5442a22a4194",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T15:05:05.749304Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76f9b254-afca-401a-9a45-5b3e5bb59ab7",
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
  "id": "6fd9f676-5980-4469-b7ca-1e6e4c2360ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:06.009963Z",
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
  "command_id": "061ebe3d-3986-484a-a319-92c05f4c112d",
  "quote_id": "6fd9f676-5980-4469-b7ca-1e6e4c2360ef",
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
  "id": "4b96fe7c-9d4c-4d07-a8a9-8d0ce4affa8d",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3eaddea4-78cb-4969-8e36-b15601e6226f",
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
  "created_at": "2026-10-28T15:05:06.278984Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4b96fe7c-9d4c-4d07-a8a9-8d0ce4affa8d` → **200**

```json
{
  "id": "4b96fe7c-9d4c-4d07-a8a9-8d0ce4affa8d",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3eaddea4-78cb-4969-8e36-b15601e6226f",
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
  "created_at": "2026-10-28T15:05:06.278984Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4b96fe7c-9d4c-4d07-a8a9-8d0ce4affa8d/cancel` → **200**

```json
{
  "command_id": "2f8a1f63-22c9-4ccc-9fe3-d19f707b7355",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4b96fe7c-9d4c-4d07-a8a9-8d0ce4affa8d",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3eaddea4-78cb-4969-8e36-b15601e6226f",
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
  "created_at": "2026-10-28T15:05:06.278984Z",
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

`POST /api/admin/v1/legal-documents/67f33dd9-612a-4f4d-adeb-5442a22a4194` → **409**

```json
{
  "command_id": "82b6dc56-c7fc-401c-852b-072d1fdc8fb9",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:05:07Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/67f33dd9-612a-4f4d-adeb-5442a22a4194",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "aa8612b7-97d2-4a92-aaca-8f905e8e2e06"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "8903e263-0d93-4ee3-86fa-9f9efc493404",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:05:07Z"
}
```

```json
{
  "id": "64955bbf-8fa3-41fb-8bd1-e26179827e38",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:05:07Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/64955bbf-8fa3-41fb-8bd1-e26179827e38/publish` → **200**

```json
{
  "command_id": "2b174ecb-eae9-43d0-b20d-315a93a022ca",
  "expected_version": 0
}
```

```json
{
  "id": "64955bbf-8fa3-41fb-8bd1-e26179827e38",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:05:07.661463Z",
  "published_at": "2026-10-28T15:05:07.661463Z",
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
  "device_ref": "sandbox-8845"
}
```

```json
{
  "challenge_id": "f0a40422-fbc1-47de-ae8c-ac084b90441d",
  "expires_at": "2026-10-28T15:10:07.928812577Z",
  "resend_available_at": "2026-10-28T15:05:08.928812577Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "138339",
  "sent_at": "2026-10-28T15:05:07.930969164Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0a40422-fbc1-47de-ae8c-ac084b90441d",
  "code": "138339",
  "device_ref": "sandbox-8845"
}
```

```json
{
  "session_id": "7bf4469a-8d63-479f-b82f-e786458ee3c6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDgwOCwiaWF0IjoxNzkzMTk5OTA4LCJqdGkiOiI1NDY4ZDlkZC0wZWU0LTQ3MTEtYTNjMy0wMmZjNmQwMThkZDkiLCJzaWQiOiI3YmY0NDY5YS04ZDYzLTQ3OWYtYjgyZi1lNzg2NDU4ZWUzYzYifQ.C0ow3p_h6v4oxFDjgC5DUKpolsTCJDQ6RHUXfPhN1PA",
  "access_expires_at": "2026-10-28T15:20:08.212630241Z",
  "refresh_token": "08JR8V9Uh1o7nT4_XWy-T_gcD1HT56Hgiwl6-MYir_o",
  "refresh_expires_at": "2026-11-27T15:05:08.21199449Z",
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
  "command_id": "b0918603-07b3-4eb6-be3a-1e77ad8d3021",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:08Z",
    "sequence": 1793199908722
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0434e72f-ed33-4414-ab03-34971e508cc2",
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
  "last_heartbeat_at": "2026-10-28T15:05:08.739947Z",
  "last_location_at": "2026-10-28T15:05:08.739947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672819897",
  "device_ref": "sandbox-468"
}
```

```json
{
  "challenge_id": "1f000a96-654c-40f8-8b70-a486edd8a56c",
  "expires_at": "2026-10-28T15:10:09.007413657Z",
  "resend_available_at": "2026-10-28T15:05:10.007413657Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672819897` → **200**

```json
{
  "phone": "+380672819897",
  "audience": "CLIENT",
  "code": "006869",
  "sent_at": "2026-10-28T15:05:09.009892438Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f000a96-654c-40f8-8b70-a486edd8a56c",
  "code": "006869",
  "device_ref": "sandbox-468"
}
```

```json
{
  "session_id": "c98944f7-e266-4d33-b463-58d836d0f754",
  "subject": {
    "type": "CLIENT",
    "id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmFhNzYxZi1hNWIzLTQ1M2YtYTgzYy0yZGI3NDQyYWQ2YTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODA5LCJpYXQiOjE3OTMxOTk5MDksImp0aSI6ImZjMGQwZjJlLTUzZmEtNGI4ZC04ZmExLWUxMzYwZmQxMDNjMSIsInNpZCI6ImM5ODk0NGY3LWUyNjYtNGQzMy1iNDYzLTU4ZDgzNmQwZjc1NCJ9.fCOL4oGbgfMGrZdIFWH_xkdQapEEMDiywtRfYdlcD08",
  "access_expires_at": "2026-10-28T15:20:09.296399432Z",
  "refresh_token": "ehMGKVgBgVJSTX9YUgl4pVca-IXGU0kl-nRWhd-c9J8",
  "refresh_expires_at": "2026-11-27T15:05:09.295758606Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "db6f1219-c9a2-4fbe-be81-437ba612b2c5",
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
  "id": "84a12bdd-4ca3-491d-9f57-9f0355932e59",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:09.555524Z",
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
  "command_id": "4f9c2391-8abd-425c-8f1b-980ca80597d0",
  "quote_id": "84a12bdd-4ca3-491d-9f57-9f0355932e59",
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
    "phone": "+380678419344"
  }
}
```

```json
{
  "id": "e9f923b3-5e8d-423c-bc2f-c16a01bb585d",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:05:09.828616Z",
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
    "id": "dd0d5fa9-1cd7-4bd5-80bb-6fc31e45bf1c",
    "order_id": "e9f923b3-5e8d-423c-bc2f-c16a01bb585d",
    "expires_at": "2026-10-28T15:05:24.831634Z",
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

`POST /api/driver/v1/offers/dd0d5fa9-1cd7-4bd5-80bb-6fc31e45bf1c/accept` → **200**

```json
{
  "command_id": "fe163782-9c40-4805-8ff7-949c589db184"
}
```

```json
{
  "id": "2569aa97-a08f-411a-a79c-a6dfeade2aec",
  "order_id": "e9f923b3-5e8d-423c-bc2f-c16a01bb585d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6842263f-5b40-4e58-9504-4451c9cec880",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6842263f-5b40-4e58-9504-4451c9cec880",
  "order_id": "e9f923b3-5e8d-423c-bc2f-c16a01bb585d",
  "assignment_id": "2569aa97-a08f-411a-a79c-a6dfeade2aec",
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
    "phone": "+380678419344"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e0264202-c917-4734-840c-8b69705008e1",
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
  "id": "11f2f6d1-a291-4a29-8625-eb60687babb1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:10.899187Z",
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
  "command_id": "32a5dea3-b313-4efd-a298-ad8aab86fc79",
  "quote_id": "11f2f6d1-a291-4a29-8625-eb60687babb1",
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
  "id": "c47a59ef-c8c3-4f32-ba5d-49df4633bb5f",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:05:11.170003Z",
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
  "command_id": "9625bbbd-5937-44f2-9a20-04db20efbbe1",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T18:05:11Z"
}
```

```json
{
  "id": "c0170246-a8b1-4e94-a162-2843fbf8056d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:11.471146Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T18:05:11Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "413a809e-f253-4d99-9e14-d9525fe16585",
  "quote_id": "c0170246-a8b1-4e94-a162-2843fbf8056d",
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
  "pickup_at": "2026-10-28T18:05:11Z"
}
```

```json
{
  "id": "93bc84ed-57b0-4408-955c-4eeec290941e",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:05:11.74308Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:05:11Z",
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
  "command_id": "11d3e905-ddf5-40c8-9186-12d67979c03b",
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
  "id": "7a08dc14-6c49-4470-8320-4fa5ec4cb8e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:12.017303Z",
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
  "command_id": "dbd826c0-2161-4f4d-adf7-e0ceae00da55",
  "quote_id": "7a08dc14-6c49-4470-8320-4fa5ec4cb8e1",
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
  "correlation_id": "316a8434-7dbc-45b2-8e91-90b9c3ac0984"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "93bc84ed-57b0-4408-955c-4eeec290941e",
      "short_number": 17,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T15:05:11.74308Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T18:05:11Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "c47a59ef-c8c3-4f32-ba5d-49df4633bb5f",
      "short_number": 16,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T15:05:11.170003Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "e9f923b3-5e8d-423c-bc2f-c16a01bb585d",
      "short_number": 15,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "c47a59ef-c8c3-4f32-ba5d-49df4633bb5f",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:05:11.170003Z",
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

`GET /api/rider/v1/orders/e9f923b3-5e8d-423c-bc2f-c16a01bb585d` → **200**

```json
{
  "id": "e9f923b3-5e8d-423c-bc2f-c16a01bb585d",
  "short_number": 15,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2569aa97-a08f-411a-a79c-a6dfeade2aec",
    "order_id": "e9f923b3-5e8d-423c-bc2f-c16a01bb585d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6842263f-5b40-4e58-9504-4451c9cec880",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:05:09.828616Z",
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
    "location_at": "2026-10-28T15:05:08.739947Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/e9f923b3-5e8d-423c-bc2f-c16a01bb585d/cancel` → **200**

```json
{
  "command_id": "d6856be5-6057-432f-984e-7ed7e66993b8",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e9f923b3-5e8d-423c-bc2f-c16a01bb585d",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2569aa97-a08f-411a-a79c-a6dfeade2aec",
    "order_id": "e9f923b3-5e8d-423c-bc2f-c16a01bb585d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6842263f-5b40-4e58-9504-4451c9cec880",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:05:09.828616Z",
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

`GET /api/rider/v1/orders/c47a59ef-c8c3-4f32-ba5d-49df4633bb5f` → **200**

```json
{
  "id": "c47a59ef-c8c3-4f32-ba5d-49df4633bb5f",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:05:11.170003Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c47a59ef-c8c3-4f32-ba5d-49df4633bb5f/cancel` → **200**

```json
{
  "command_id": "d3db0e21-e69a-417d-a1c3-1193819bea89",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c47a59ef-c8c3-4f32-ba5d-49df4633bb5f",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:05:11.170003Z",
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

`GET /api/rider/v1/orders/93bc84ed-57b0-4408-955c-4eeec290941e` → **200**

```json
{
  "id": "93bc84ed-57b0-4408-955c-4eeec290941e",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:05:11.74308Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:05:11Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/93bc84ed-57b0-4408-955c-4eeec290941e/cancel` → **200**

```json
{
  "command_id": "9f1c01ac-4cfa-4c82-9684-14e6dccae47c",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "93bc84ed-57b0-4408-955c-4eeec290941e",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "06aa761f-a5b3-453f-a83c-2db7442ad6a1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:05:11.74308Z",
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
  "pickup_at": "2026-10-28T18:05:11Z",
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
  "session_id": "0434e72f-ed33-4414-ab03-34971e508cc2",
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
  "last_heartbeat_at": "2026-10-28T15:05:08.739947Z",
  "last_location_at": "2026-10-28T15:05:08.739947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0434e72f-ed33-4414-ab03-34971e508cc2/close` → **200**

```json
{
  "command_id": "5db9a63d-f9d7-4a3d-b881-64a90591a434",
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

Done: orders e9f923b3-5e8d-423c-bc2f-c16a01bb585d, c47a59ef-c8c3-4f32-ba5d-49df4633bb5f, 93bc84ed-57b0-4408-955c-4eeec290941e.

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
  "session_id": "cbea94a2-6bfb-42e8-85e4-ce472d62acc5",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MTUsImlhdCI6MTc5MzE5OTkxNSwianRpIjoiMmI4YjAyNDYtYjU0Yi00NzIyLTljYmUtZjI3YzIxNjExNTE2Iiwic2lkIjoiY2JlYTk0YTItNmJmYi00MmU4LTg1ZTQtY2U0NzJkNjJhY2M1In0.1JSnIylVumi1r-VPFZJI7xZZu-gclM-GzpDudXEwAG8",
  "access_expires_at": "2026-10-28T15:20:15.647376546Z",
  "refresh_token": "sRXHtcf1lN4ySEEKz9nqJmyGc22GvDGKTxl0U8pD7as",
  "refresh_expires_at": "2026-10-29T03:05:15.646856959Z",
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
  "session_id": "48138899-279b-4ddb-b4cc-457f273d9d37",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MTYsImlhdCI6MTc5MzE5OTkxNiwianRpIjoiNmIwOGEzNTctOGUyYy00YzEyLWI4ZjctYmMwODU1YWM0NzU5Iiwic2lkIjoiNDgxMzg4OTktMjc5Yi00ZGRiLWI0Y2MtNDU3ZjI3M2Q5ZDM3In0.KM7CqzADh_WNQuqO4CI1fUbH0hXOPdd7Bg0HI7xCJpQ",
  "access_expires_at": "2026-10-28T15:20:16.182531508Z",
  "refresh_token": "dGmMIeIw-JHoQBkr5Adcn-KSqNxLNg1o0kSKOGZbD2s",
  "refresh_expires_at": "2026-10-29T03:05:16.181950078Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23797"
}
```

```json
{
  "challenge_id": "94aed124-440d-4b09-9a00-4541e920e4b9",
  "expires_at": "2026-10-28T15:10:16.432068971Z",
  "resend_available_at": "2026-10-28T15:05:17.432068971Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "991687",
  "sent_at": "2026-10-28T15:05:16.434363039Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94aed124-440d-4b09-9a00-4541e920e4b9",
  "code": "991687",
  "device_ref": "sandbox-23797"
}
```

```json
{
  "session_id": "69314176-ae14-4e0b-a59f-52f60229d8de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDgxNiwiaWF0IjoxNzkzMTk5OTE2LCJqdGkiOiJiNTU1NGYwMC1kMTc3LTRlNjQtYWJjZS1kYTI5MzA1YmVmODAiLCJzaWQiOiI2OTMxNDE3Ni1hZTE0LTRlMGItYTU5Zi01MmY2MDIyOWQ4ZGUifQ.0Byvhh8ur0J7Luu9LictLCgdzzJKd_FFn0nSw_jJ9G0",
  "access_expires_at": "2026-10-28T15:20:16.70630584Z",
  "refresh_token": "o-GPHruNCI4sqKAX8T3yE6EfNuMBNiPprcpoWbDqJvw",
  "refresh_expires_at": "2026-11-27T15:05:16.705680785Z",
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
  "command_id": "248731e8-d9bf-4c4a-b170-0aae45590e18",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:17Z",
    "sequence": 1793199917233
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b7e2adf-1a24-49a4-975a-3beeb10ebdbf",
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
  "last_heartbeat_at": "2026-10-28T15:05:17.249479Z",
  "last_location_at": "2026-10-28T15:05:17.249479Z",
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
  "command_id": "1e1f76c1-416f-4fd6-bdda-5d21afbc4bc0",
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
  "effective_at": "2026-10-28T15:05:17.796447Z",
  "changed_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T15:03:03.274421Z",
  "last_entries": [
    {
      "order_id": "435bba0b-77c4-4b20-94aa-1c01019bb34c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T15:03:03.274421Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ff8aa7d5-d16c-4a67-8b17-797d9614332b",
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
  "id": "2a5c3c51-1e52-494f-8257-453b178e2bca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:18.336625Z",
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
  "command_id": "b334e7af-b6a5-453e-a2cf-80a930465915",
  "quote_id": "2a5c3c51-1e52-494f-8257-453b178e2bca",
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
    "phone": "+380671118743"
  }
}
```

```json
{
  "id": "10a6a11b-4d4f-4641-9321-1ea8ad9c9282",
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
  "created_at": "2026-10-28T15:05:18.599896Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118743"
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
    "id": "80c0d639-88fd-4c30-acf4-cf7cbd3442e5",
    "order_id": "10a6a11b-4d4f-4641-9321-1ea8ad9c9282",
    "expires_at": "2026-10-28T15:05:33.604583Z",
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

`POST /api/driver/v1/offers/80c0d639-88fd-4c30-acf4-cf7cbd3442e5/accept` → **200**

```json
{
  "command_id": "2d40210a-9158-4ebb-8a01-d7dbaa9c0218"
}
```

```json
{
  "id": "5c7c6731-4e56-49fc-b777-98f12c84c929",
  "order_id": "10a6a11b-4d4f-4641-9321-1ea8ad9c9282",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bf1768eb-af36-4134-9e84-8c92acf0c098",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bf1768eb-af36-4134-9e84-8c92acf0c098",
  "order_id": "10a6a11b-4d4f-4641-9321-1ea8ad9c9282",
  "assignment_id": "5c7c6731-4e56-49fc-b777-98f12c84c929",
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
    "phone": "+380671118743"
  }
}
```

`POST /api/driver/v1/work-sessions/5b7e2adf-1a24-49a4-975a-3beeb10ebdbf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:19Z",
    "sequence": 1793199919654
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b7e2adf-1a24-49a4-975a-3beeb10ebdbf",
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
  "last_heartbeat_at": "2026-10-28T15:05:19.670317Z",
  "last_location_at": "2026-10-28T15:05:19.670317Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bf1768eb-af36-4134-9e84-8c92acf0c098/arrive` → **200**

```json
{
  "command_id": "c9a1ea58-1595-4723-8c2c-12a97692e321",
  "expected_version": 0
}
```

```json
{
  "id": "bf1768eb-af36-4134-9e84-8c92acf0c098",
  "order_id": "10a6a11b-4d4f-4641-9321-1ea8ad9c9282",
  "assignment_id": "5c7c6731-4e56-49fc-b777-98f12c84c929",
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
  "arrived_at": "2026-10-28T15:05:19.930887Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671118743"
  }
}
```

`POST /api/driver/v1/trips/bf1768eb-af36-4134-9e84-8c92acf0c098/start` → **200**

```json
{
  "command_id": "2ed65f91-9c0a-45a8-8049-0efb920b9c2b",
  "expected_version": 1
}
```

```json
{
  "id": "bf1768eb-af36-4134-9e84-8c92acf0c098",
  "order_id": "10a6a11b-4d4f-4641-9321-1ea8ad9c9282",
  "assignment_id": "5c7c6731-4e56-49fc-b777-98f12c84c929",
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
  "arrived_at": "2026-10-28T15:05:19.930887Z",
  "started_at": "2026-10-28T15:05:20.214337Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671118743"
  }
}
```

`POST /api/driver/v1/trips/bf1768eb-af36-4134-9e84-8c92acf0c098/complete` → **200**

```json
{
  "command_id": "ae469106-4cd5-44a6-8b28-8ba4a2bdbee9",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:05:20Z",
  "cash_received": true
}
```

```json
{
  "id": "bf1768eb-af36-4134-9e84-8c92acf0c098",
  "order_id": "10a6a11b-4d4f-4641-9321-1ea8ad9c9282",
  "assignment_id": "5c7c6731-4e56-49fc-b777-98f12c84c929",
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
  "arrived_at": "2026-10-28T15:05:19.930887Z",
  "started_at": "2026-10-28T15:05:20.214337Z",
  "completed_at": "2026-10-28T15:05:20.495671Z",
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
  "command_id": "d11b96ad-b7bc-4b48-93d1-1493b64b8a55",
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
  "id": "88f24914-d26d-41b0-9d96-a08a45183947",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:20.765907Z",
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
  "command_id": "19490fd5-1532-47d2-a82f-64abfbaa201c",
  "quote_id": "88f24914-d26d-41b0-9d96-a08a45183947",
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
    "phone": "+3806711113108"
  }
}
```

```json
{
  "id": "6a3d4cad-a2f8-4034-9c50-260f1cfbb35e",
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
  "created_at": "2026-10-28T15:05:21.051603Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113108"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/6a3d4cad-a2f8-4034-9c50-260f1cfbb35e` → **200**

```json
{
  "id": "6a3d4cad-a2f8-4034-9c50-260f1cfbb35e",
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
  "created_at": "2026-10-28T15:05:21.051603Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113108"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6a3d4cad-a2f8-4034-9c50-260f1cfbb35e/cancel` → **200**

```json
{
  "command_id": "116fa86e-4021-4708-af58-9c49cd6ba416",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "6a3d4cad-a2f8-4034-9c50-260f1cfbb35e",
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
  "created_at": "2026-10-28T15:05:21.051603Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113108"
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
  "staff_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T15:03:03.274421Z",
  "last_entries": [
    {
      "order_id": "6a3d4cad-a2f8-4034-9c50-260f1cfbb35e",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T15:05:21.63325Z"
    },
    {
      "order_id": "10a6a11b-4d4f-4641-9321-1ea8ad9c9282",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T15:05:20.501219Z"
    },
    {
      "order_id": "435bba0b-77c4-4b20-94aa-1c01019bb34c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T15:03:03.274421Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5b7e2adf-1a24-49a4-975a-3beeb10ebdbf",
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
  "last_heartbeat_at": "2026-10-28T15:05:19.670317Z",
  "last_location_at": "2026-10-28T15:05:19.670317Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b7e2adf-1a24-49a4-975a-3beeb10ebdbf/close` → **200**

```json
{
  "command_id": "38187970-79a8-44f1-8719-2ebac0a83f42",
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

Done: operator bonus for fulfilled 10a6a11b-4d4f-4641-9321-1ea8ad9c9282 and operator-fault cancellation 6a3d4cad-a2f8-4034-9c50-260f1cfbb35e.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678130372",
  "device_ref": "sandbox-3673"
}
```

```json
{
  "challenge_id": "f8153301-7a55-4574-82d2-b3da140a7ad2",
  "expires_at": "2026-10-28T15:10:24.741651994Z",
  "resend_available_at": "2026-10-28T15:05:25.741651994Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678130372` → **200**

```json
{
  "phone": "+380678130372",
  "audience": "CLIENT",
  "code": "220994",
  "sent_at": "2026-10-28T15:05:24.74456638Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676972741",
  "device_ref": "sandbox-10991",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "15423ec9-6942-441b-9dc7-11a93aea77c6",
  "expires_at": "2026-10-28T15:10:25.032481091Z",
  "resend_available_at": "2026-10-28T15:05:26.032481091Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676972741` → **200**

```json
{
  "phone": "+380676972741",
  "audience": "CLIENT",
  "code": "106397",
  "sent_at": "2026-10-28T15:05:25.034496638Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675620000",
  "device_ref": "sandbox-26667"
}
```

```json
{
  "challenge_id": "d1da3555-298a-431f-be2f-d7edde7b0846",
  "expires_at": "2026-10-28T15:10:25.305308599Z",
  "resend_available_at": "2026-10-28T15:05:26.305308599Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675620000` → **200**

```json
{
  "phone": "+380675620000",
  "audience": "CLIENT",
  "code": "804227",
  "sent_at": "2026-10-28T15:05:25.308006236Z",
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
  "session_id": "60c3fa8d-233a-469d-a2ed-d386ead67e7f",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MjUsImlhdCI6MTc5MzE5OTkyNSwianRpIjoiOGVkZmMzYzQtZjcxZi00NzNiLWFkYjctZDU0YmJhN2ViYjYyIiwic2lkIjoiNjBjM2ZhOGQtMjMzYS00NjlkLWEyZWQtZDM4NmVhZDY3ZTdmIn0.yQT4PtM1dfER0sox1TWaqF26JAZaURdZcHF-63p_ilE",
  "access_expires_at": "2026-10-28T15:20:25.865078424Z",
  "refresh_token": "zDsMTWn7uBiIokQeryIfhcBQATvAWiH6dx7Syo00PMs",
  "refresh_expires_at": "2026-10-29T03:05:25.864208113Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675620000` → **200**

```json
{
  "deliveries": [
    {
      "id": "d36f7d31-7407-4a32-b8c0-ad052900e862",
      "challenge_id": "d1da3555-298a-431f-be2f-d7edde7b0846",
      "phone": "+380675620000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f8042409-dd9e-436e-9a28-4668ce44c526",
      "error": null,
      "attempted_at": "2026-10-28T15:05:25.308241Z"
    },
    {
      "id": "8c8664bd-3fed-4b57-86d0-8c3fd37c8766",
      "challenge_id": "d1da3555-298a-431f-be2f-d7edde7b0846",
      "phone": "+380675620000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T15:05:25.307522Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675620000` → **200**

```json
{
  "phone": "+380675620000",
  "audience": "CLIENT",
  "code": "804227",
  "sent_at": "2026-10-28T15:05:25.308006236Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676972741` → **200**

```json
{
  "deliveries": [
    {
      "id": "fb08f891-6c94-4bc4-bb21-c725e34c12c3",
      "challenge_id": "15423ec9-6942-441b-9dc7-11a93aea77c6",
      "phone": "+380676972741",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-1e00e61e-f3c8-4274-8076-bd37147a5e3b",
      "error": null,
      "attempted_at": "2026-10-28T15:05:25.034757Z"
    }
  ]
}
```

Done: SMS to +380678130372, a call to +380676972741, SMS then a call to +380675620000.

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
  "session_id": "15d775aa-c9e0-4fdf-a28b-8e1f630a8e1b",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MjYsImlhdCI6MTc5MzE5OTkyNiwianRpIjoiMGU3OTgyNGMtYzU0NC00MWFiLWFiM2EtNTZmNTY0NmM5ZTczIiwic2lkIjoiMTVkNzc1YWEtYzllMC00ZmRmLWEyOGItOGUxZjYzMGE4ZTFiIn0.7FFwR7_URtrr7OgXdNoPxKfCIpCrG32jQvqWcw9S1Gs",
  "access_expires_at": "2026-10-28T15:20:26.985879805Z",
  "refresh_token": "qVb1lKuwOWlu7v-TQYlOiUcEo2BxAWzSUclyAUAlljk",
  "refresh_expires_at": "2026-10-29T03:05:26.985189146Z",
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
  "session_id": "c03dd25c-bbee-446a-b1aa-70ad1041941d",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4MjcsImlhdCI6MTc5MzE5OTkyNywianRpIjoiOTI5M2UwODQtZDhjNS00OTRkLTkwNzgtY2ExMGQ0NDE4N2NkIiwic2lkIjoiYzAzZGQyNWMtYmJlZS00NDZhLWIxYWEtNzBhZDEwNDE5NDFkIn0.e_tohG5ayCdwhNGRamCEVJS9HtVYqZ_gp3La5AaPVmk",
  "access_expires_at": "2026-10-28T15:20:27.533437398Z",
  "refresh_token": "JoWCUoz0-61V2lR1_ZM-hHo2OLE07eBXbMUmblJ6mrs",
  "refresh_expires_at": "2026-10-29T03:05:27.532836047Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
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

`POST /api/admin/v1/staff-extensions/f0e25eac-31e8-4f76-b671-addb0f66903a` → **200**

```json
{
  "command_id": "95a714df-a123-47b9-950f-4116faa65ed4",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "4458b04b-58b5-4d86-a391-cde4ca91b6fe",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T15:05:28.575157Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T15:05:28.575157Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "113fee2c-c0bf-4a4d-bee3-b572e4209159",
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
  "id": "3d4967f8-b5d2-4229-8299-ba0aaec31463",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:29.093744Z",
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
  "command_id": "8d2ffa36-a585-4ca3-a11a-024affd397e7",
  "quote_id": "3d4967f8-b5d2-4229-8299-ba0aaec31463",
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
    "phone": "+380678825820"
  }
}
```

```json
{
  "id": "708e860e-3522-4012-9292-53af0360001b",
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
  "created_at": "2026-10-28T15:05:29.369477Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678825820"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/708e860e-3522-4012-9292-53af0360001b/calls` → **201**

```json
{
  "command_id": "9cc192fc-7e20-44f4-bda1-b3158d20cf38",
  "to": "CALLER"
}
```

```json
{
  "id": "b57b311b-dfa3-4f84-9db6-d65e7f0fe08e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "order_ids": [
    "708e860e-3522-4012-9292-53af0360001b"
  ],
  "started_at": "2026-10-28T15:05:29.661012Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/708e860e-3522-4012-9292-53af0360001b/calls` → **201**

```json
{
  "command_id": "9cc192fc-7e20-44f4-bda1-b3158d20cf38",
  "to": "CALLER"
}
```

```json
{
  "id": "b57b311b-dfa3-4f84-9db6-d65e7f0fe08e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "order_ids": [
    "708e860e-3522-4012-9292-53af0360001b"
  ],
  "started_at": "2026-10-28T15:05:29.661012Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "b57b311b-dfa3-4f84-9db6-d65e7f0fe08e",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678825820",
    "at": "2026-10-28T15:05:29.663082829Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "b57b311b-dfa3-4f84-9db6-d65e7f0fe08e",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.9557",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "b57b311b-dfa3-4f84-9db6-d65e7f0fe08e"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "b57b311b-dfa3-4f84-9db6-d65e7f0fe08e",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=708e860e-3522-4012-9292-53af0360001b` → **200**

```json
{
  "calls": [
    {
      "id": "b57b311b-dfa3-4f84-9db6-d65e7f0fe08e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_ids": [
        "708e860e-3522-4012-9292-53af0360001b"
      ],
      "started_at": "2026-10-28T15:05:29.661012Z",
      "answered_at": "2026-10-28T15:05:30.262978Z",
      "ended_at": "2026-10-28T15:05:30.28206Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=708e860e-3522-4012-9292-53af0360001b` → **200**

```json
{
  "calls": [
    {
      "id": "b57b311b-dfa3-4f84-9db6-d65e7f0fe08e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_ids": [
        "708e860e-3522-4012-9292-53af0360001b"
      ],
      "started_at": "2026-10-28T15:05:29.661012Z",
      "answered_at": "2026-10-28T15:05:30.262978Z",
      "ended_at": "2026-10-28T15:05:30.28206Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=708e860e-3522-4012-9292-53af0360001b` → **200**

```json
{
  "calls": [
    {
      "id": "b57b311b-dfa3-4f84-9db6-d65e7f0fe08e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "order_ids": [
        "708e860e-3522-4012-9292-53af0360001b"
      ],
      "started_at": "2026-10-28T15:05:29.661012Z",
      "answered_at": "2026-10-28T15:05:30.262978Z",
      "ended_at": "2026-10-28T15:05:30.28206Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:05:34.655102Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/708e860e-3522-4012-9292-53af0360001b` → **200**

```json
{
  "id": "708e860e-3522-4012-9292-53af0360001b",
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
  "created_at": "2026-10-28T15:05:29.369477Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678825820"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/708e860e-3522-4012-9292-53af0360001b/cancel` → **200**

```json
{
  "command_id": "d1bf6da6-633f-4c90-8197-b90e0d0fa8d4",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "708e860e-3522-4012-9292-53af0360001b",
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
  "created_at": "2026-10-28T15:05:29.369477Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678825820"
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
  "command_id": "33287d00-737d-42cf-815f-328a65ed5bbb",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T15:05:35.718544Z",
  "extension": "101"
}
```

Done: outgoing call b57b311b-dfa3-4f84-9db6-d65e7f0fe08e from order 708e860e-3522-4012-9292-53af0360001b, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638202256",
  "device_ref": "sandbox-19033"
}
```

```json
{
  "challenge_id": "118bd160-8a5e-4990-b5aa-43ba7cee2473",
  "expires_at": "2026-10-28T15:10:35.993260689Z",
  "resend_available_at": "2026-10-28T15:05:36.993260689Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638202256` → **200**

```json
{
  "phone": "+380638202256",
  "audience": "CLIENT",
  "code": "565166",
  "sent_at": "2026-10-28T15:05:35.995547443Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "118bd160-8a5e-4990-b5aa-43ba7cee2473",
  "code": "565166",
  "device_ref": "sandbox-19033"
}
```

```json
{
  "session_id": "a40e6772-3e32-42c4-b194-113edad5359d",
  "subject": {
    "type": "CLIENT",
    "id": "a85924ed-37d7-4f3f-a6a2-080742bd7f4c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODU5MjRlZC0zN2Q3LTRmM2YtYTZhMi0wODA3NDJiZDdmNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODM2LCJpYXQiOjE3OTMxOTk5MzYsImp0aSI6Ijk5OTkyYWM4LWE3YTktNDc2ZC1iYWYwLWQwMzcxNTE0NjllNiIsInNpZCI6ImE0MGU2NzcyLTNlMzItNDJjNC1iMTk0LTExM2VkYWQ1MzU5ZCJ9.GLUVn0aPVStYLD9fd4vl65onEQQbP_o2FyQnbPtwxR4",
  "access_expires_at": "2026-10-28T15:20:36.283636135Z",
  "refresh_token": "kH-cGlnDqHM7TEUaB3WTzRyIwWss2lH3O1QM2PprZ-s",
  "refresh_expires_at": "2026-11-27T15:05:36.283045238Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a85924ed-37d7-4f3f-a6a2-080742bd7f4c",
  "session_id": "a40e6772-3e32-42c4-b194-113edad5359d",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638202256",
  "device_ref": "sandbox-23711"
}
```

```json
{
  "challenge_id": "78954eda-9761-4ad5-b758-1ed9f6e891e3",
  "expires_at": "2026-10-28T15:10:38.801941187Z",
  "resend_available_at": "2026-10-28T15:05:39.801941187Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638202256` → **200**

```json
{
  "phone": "+380638202256",
  "audience": "CLIENT",
  "code": "053920",
  "sent_at": "2026-10-28T15:05:38.804039409Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78954eda-9761-4ad5-b758-1ed9f6e891e3",
  "code": "053920",
  "device_ref": "sandbox-23711"
}
```

```json
{
  "session_id": "4adea8c3-0d17-4907-a3bb-6420bd28f027",
  "subject": {
    "type": "CLIENT",
    "id": "a85924ed-37d7-4f3f-a6a2-080742bd7f4c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODU5MjRlZC0zN2Q3LTRmM2YtYTZhMi0wODA3NDJiZDdmNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODM5LCJpYXQiOjE3OTMxOTk5MzksImp0aSI6ImZlYjdiNzg5LTA4ZDMtNDhjZS1hNWE5LWFmZjlkZmZkMWI2NyIsInNpZCI6IjRhZGVhOGMzLTBkMTctNDkwNy1hM2JiLTY0MjBiZDI4ZjAyNyJ9.3trYszXjJZR4MKZ98dukIYg6U1laA5che1OEfP-pf1E",
  "access_expires_at": "2026-10-28T15:20:39.107135031Z",
  "refresh_token": "5rAsBUB5Mr_oYKJnGQWAUbYDExzBMVE4ESaNyYdG_gI",
  "refresh_expires_at": "2026-11-27T15:05:39.106223667Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "a1412e20-a869-4fa5-a381-e24b235110e7",
  "expires_at": "2026-10-28T15:10:41.367335645Z",
  "resend_available_at": "2026-10-28T15:05:42.367335645Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638202256` → **200**

```json
{
  "phone": "+380638202256",
  "audience": "CLIENT",
  "code": "880738",
  "sent_at": "2026-10-28T15:05:41.369336886Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636284224"
}
```

```json
{
  "challenge_id": "a05a6f06-90f3-4060-8638-34bd700f9bc9",
  "expires_at": "2026-10-28T15:10:41.640027302Z",
  "resend_available_at": "2026-10-28T15:05:42.640027302Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636284224` → **200**

```json
{
  "phone": "+380636284224",
  "audience": "CLIENT",
  "code": "766122",
  "sent_at": "2026-10-28T15:05:41.641731688Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "82f300e4-fac7-4cfe-99e0-c9a2e4596289",
  "current_challenge_id": "a1412e20-a869-4fa5-a381-e24b235110e7",
  "current_code": "000000",
  "new_challenge_id": "a05a6f06-90f3-4060-8638-34bd700f9bc9",
  "new_code": "766122"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "49bda983-cc4c-46e6-a9e8-39c429df408c"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "628639cd-937b-427c-b0b1-b4bb9b9237f4",
  "current_challenge_id": "a1412e20-a869-4fa5-a381-e24b235110e7",
  "current_code": "880738",
  "new_challenge_id": "a05a6f06-90f3-4060-8638-34bd700f9bc9",
  "new_code": "766122"
}
```

```json
{
  "subject_id": "a85924ed-37d7-4f3f-a6a2-080742bd7f4c",
  "phone": "+380636284224",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a85924ed-37d7-4f3f-a6a2-080742bd7f4c",
  "session_id": "a40e6772-3e32-42c4-b194-113edad5359d",
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
  "correlation_id": "3ecfa667-0d01-4e93-8823-72476566b656"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636284224",
  "device_ref": "sandbox-18811"
}
```

```json
{
  "challenge_id": "2d13cfb9-569a-45bf-9413-081e11bca983",
  "expires_at": "2026-10-28T15:10:44.957659049Z",
  "resend_available_at": "2026-10-28T15:05:45.957659049Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636284224` → **200**

```json
{
  "phone": "+380636284224",
  "audience": "CLIENT",
  "code": "582421",
  "sent_at": "2026-10-28T15:05:44.959854153Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d13cfb9-569a-45bf-9413-081e11bca983",
  "code": "582421",
  "device_ref": "sandbox-18811"
}
```

```json
{
  "session_id": "8926d5d4-94ed-4219-be44-a8d5c51c1f96",
  "subject": {
    "type": "CLIENT",
    "id": "a85924ed-37d7-4f3f-a6a2-080742bd7f4c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODU5MjRlZC0zN2Q3LTRmM2YtYTZhMi0wODA3NDJiZDdmNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODQ1LCJpYXQiOjE3OTMxOTk5NDUsImp0aSI6IjM5OWQyNzBiLWEwNTItNDI2ZC1iMmQ5LWRmNjE4MTNiNzAxMCIsInNpZCI6Ijg5MjZkNWQ0LTk0ZWQtNDIxOS1iZTQ0LWE4ZDVjNTFjMWY5NiJ9.geafhaFsWxQCazeg_zB3aQ7oEEpfByXeQQ5xRP7Skso",
  "access_expires_at": "2026-10-28T15:20:45.25818314Z",
  "refresh_token": "b405RF_Qezs1qb9Im8w4tTni9TH5BsLs631mEuRKkVo",
  "refresh_expires_at": "2026-11-27T15:05:45.257499356Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a85924ed-37d7-4f3f-a6a2-080742bd7f4c",
  "session_id": "8926d5d4-94ed-4219-be44-a8d5c51c1f96",
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
  "session_id": "43de5560-e541-482b-a541-bd0ea0cf7416",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NDYsImlhdCI6MTc5MzE5OTk0NiwianRpIjoiMGYzOWM0NDQtMjBkYS00NDQyLTg3ZjQtYzUzMTIyZDIyZWY2Iiwic2lkIjoiNDNkZTU1NjAtZTU0MS00ODJiLWE1NDEtYmQwZWEwY2Y3NDE2In0.QeyPZpyDMSd0fCXOcVcBxvg-sCEruWGSoSwO3nkRMLg",
  "access_expires_at": "2026-10-28T15:20:46.03055273Z",
  "refresh_token": "qKyvimkppYKXP2z-xzhzQMaP4omHVD8vwSJqa-AITA8",
  "refresh_expires_at": "2026-10-29T03:05:46.03000859Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/a85924ed-37d7-4f3f-a6a2-080742bd7f4c` → **200**

```json
{
  "client": {
    "id": "a85924ed-37d7-4f3f-a6a2-080742bd7f4c",
    "phone": "+380636284224",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:05:36.281083Z",
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

`POST /api/admin/v1/clients/a85924ed-37d7-4f3f-a6a2-080742bd7f4c/phone` → **400**

```json
{
  "command_id": "f32f9526-3cb1-4de0-accf-918a60a8306a",
  "expected_version": 3,
  "phone": "+380635548160",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a85924ed-37d7-4f3f-a6a2-080742bd7f4c/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7c48e918-b180-4f01-9fd8-231496cc3e45",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/a85924ed-37d7-4f3f-a6a2-080742bd7f4c/phone` → **200**

```json
{
  "command_id": "ae6255c3-79be-4eaa-8eab-98253fbefce1",
  "expected_version": 3,
  "phone": "+380635548160",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "a85924ed-37d7-4f3f-a6a2-080742bd7f4c",
  "phone": "+380635548160",
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
  "correlation_id": "f7e5c5f4-d8b4-4b4a-a2e8-b521c33bd61b"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635548160",
  "device_ref": "sandbox-17372"
}
```

```json
{
  "challenge_id": "26200fdb-42e2-4948-a21c-530608bca537",
  "expires_at": "2026-10-28T15:10:47.408306861Z",
  "resend_available_at": "2026-10-28T15:05:48.408306861Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635548160` → **200**

```json
{
  "phone": "+380635548160",
  "audience": "CLIENT",
  "code": "285429",
  "sent_at": "2026-10-28T15:05:47.410906915Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26200fdb-42e2-4948-a21c-530608bca537",
  "code": "285429",
  "device_ref": "sandbox-17372"
}
```

```json
{
  "session_id": "f21e6cae-2143-4046-bebb-5f67862a182e",
  "subject": {
    "type": "CLIENT",
    "id": "a85924ed-37d7-4f3f-a6a2-080742bd7f4c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODU5MjRlZC0zN2Q3LTRmM2YtYTZhMi0wODA3NDJiZDdmNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODQ3LCJpYXQiOjE3OTMxOTk5NDcsImp0aSI6IjRiODk5Y2QyLTY0NjQtNGRlNi1iMGNlLWYzMWU3ZTdhYjc1NSIsInNpZCI6ImYyMWU2Y2FlLTIxNDMtNDA0Ni1iZWJiLTVmNjc4NjJhMTgyZSJ9.ksk3HzjfIOWrzFptUT2YQnlztOSWEQwj-4FV6L7SJLM",
  "access_expires_at": "2026-10-28T15:20:47.69039987Z",
  "refresh_token": "msHwAz9hOSQpF0tevWDjgaVN2x8Jzg8z8ZobPqCTRo4",
  "refresh_expires_at": "2026-11-27T15:05:47.689845071Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a85924ed-37d7-4f3f-a6a2-080742bd7f4c",
  "session_id": "f21e6cae-2143-4046-bebb-5f67862a182e",
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
  "phone": "+380638726936",
  "device_ref": "sandbox-29278"
}
```

```json
{
  "challenge_id": "b741c76f-29d2-45f5-84e5-bc2602a713a0",
  "expires_at": "2026-10-28T15:10:48.199928509Z",
  "resend_available_at": "2026-10-28T15:05:49.199928509Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638726936` → **200**

```json
{
  "phone": "+380638726936",
  "audience": "CLIENT",
  "code": "467640",
  "sent_at": "2026-10-28T15:05:48.202050191Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b741c76f-29d2-45f5-84e5-bc2602a713a0",
  "code": "467640",
  "device_ref": "sandbox-29278"
}
```

```json
{
  "session_id": "b45989bf-52c9-4a6d-b20a-535c2ad32cd9",
  "subject": {
    "type": "CLIENT",
    "id": "68c922b9-a661-4fd2-9d83-aba40391e7fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OGM5MjJiOS1hNjYxLTRmZDItOWQ4My1hYmE0MDM5MWU3ZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODQ4LCJpYXQiOjE3OTMxOTk5NDgsImp0aSI6Ijk1YWQ2NzIwLTQ0YTUtNGI2NS04NjM2LWJjMWRhYzU5YmExNyIsInNpZCI6ImI0NTk4OWJmLTUyYzktNGE2ZC1iMjBhLTUzNWMyYWQzMmNkOSJ9.PtIvV2SLGPnn5oNFNv_89guGv11OWBW1kZDNnRB87C4",
  "access_expires_at": "2026-10-28T15:20:48.482484608Z",
  "refresh_token": "LcoaQeA_AYbmYbt4VfclMJiZzY4ICXEPi7NSU3GHAGI",
  "refresh_expires_at": "2026-11-27T15:05:48.482029219Z",
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
  "session_id": "9d51fe9d-56ef-4fea-9667-5a6c251edb11",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NDksImlhdCI6MTc5MzE5OTk0OSwianRpIjoiMTRkMTJhNmItZGY4Ni00NmZiLThhZWYtYzYzMzIyZWI1ODNkIiwic2lkIjoiOWQ1MWZlOWQtNTZlZi00ZmVhLTk2NjctNWE2YzI1MWVkYjExIn0.VYhETQzgnubKmbhV4S7LgLpjAHuZXFGi6A5Urx98p-A",
  "access_expires_at": "2026-10-28T15:20:49.582380398Z",
  "refresh_token": "7WDJ5MUbkvmSDe3xpuvRbh2T8FBKvBabSdE5hUcyOW8",
  "refresh_expires_at": "2026-10-29T03:05:49.581666855Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638726936` → **200**

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
  "correlation_id": "63514c87-f283-4991-8b49-e392e17a3f7c"
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
  "session_id": "55c4eace-14e6-4bb7-aa4e-3143f2f1b19b",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NTAsImlhdCI6MTc5MzE5OTk1MCwianRpIjoiY2FhMTEzNDAtZDdkOS00YjJjLTk5ZDAtOTZjZGQ5MTczMzBmIiwic2lkIjoiNTVjNGVhY2UtMTRlNi00YmI3LWFhNGUtMzE0M2YyZjFiMTliIn0.miDuH0KmJE3MU8Ddx37p02tC8TF-54Whcw4BpnGD3m0",
  "access_expires_at": "2026-10-28T15:20:50.634029815Z",
  "refresh_token": "e4aZ7BGnYQG19I-pzBskoELJ0Ch7NqpPD2_WDAgPNvg",
  "refresh_expires_at": "2026-10-29T03:05:50.633485865Z",
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
  "command_id": "eb98e606-ecab-46d7-999a-640d305bdd06",
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
  "changed_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T15:05:51.168690111Z"
}
```

## The rider books the airport for 2026-10-28T18:05:50Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600431733",
  "device_ref": "sandbox-15452"
}
```

```json
{
  "challenge_id": "f4f2745b-f769-44bb-b946-9df484e720fb",
  "expires_at": "2026-10-28T15:10:51.426357358Z",
  "resend_available_at": "2026-10-28T15:05:52.426357358Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600431733` → **200**

```json
{
  "phone": "+48600431733",
  "audience": "CLIENT",
  "code": "788178",
  "sent_at": "2026-10-28T15:05:51.428308265Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4f2745b-f769-44bb-b946-9df484e720fb",
  "code": "788178",
  "device_ref": "sandbox-15452"
}
```

```json
{
  "session_id": "e05b8b96-e51f-4d8e-9f27-ae6ea2431767",
  "subject": {
    "type": "CLIENT",
    "id": "02f1ad05-a65e-415a-b58f-2dbe6913e2cc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMmYxYWQwNS1hNjVlLTQxNWEtYjU4Zi0yZGJlNjkxM2UyY2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODUxLCJpYXQiOjE3OTMxOTk5NTEsImp0aSI6ImM0MTllMzM3LWE1YTctNGVhZC1iMjk3LTJjNTkyYmYzOWVlMCIsInNpZCI6ImUwNWI4Yjk2LWU1MWYtNGQ4ZS05ZjI3LWFlNmVhMjQzMTc2NyJ9.MpbqY732GLAuE8pdy6dErAlTmOUY91Z0p0MPHrR4Dvc",
  "access_expires_at": "2026-10-28T15:20:51.69136873Z",
  "refresh_token": "NGCPFIDxg61OdDmd3tw1zTRFN9BsTETsSHY9tYPzsFU",
  "refresh_expires_at": "2026-11-27T15:05:51.690914279Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4c721ad9-6cd1-4eba-91d2-8b5576b0978e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T18:05:50Z"
}
```

```json
{
  "id": "76454fb2-f890-4b82-99fe-abb017e0f077",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:51.947887Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T18:05:50Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0dd27919-c9ee-4cbb-ad8d-0b5949ea8412",
  "quote_id": "76454fb2-f890-4b82-99fe-abb017e0f077",
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
  "pickup_at": "2026-10-28T18:05:50Z"
}
```

```json
{
  "id": "b214a21c-57ad-4262-8b34-c5a33ff34896",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "02f1ad05-a65e-415a-b58f-2dbe6913e2cc",
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
  "created_at": "2026-10-28T15:05:52.209905Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:05:50Z",
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
  "device_ref": "sandbox-31229"
}
```

```json
{
  "challenge_id": "5461bc99-0880-472e-b543-9ed435bf6210",
  "expires_at": "2026-10-28T15:10:52.474130881Z",
  "resend_available_at": "2026-10-28T15:05:53.474130881Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "803386",
  "sent_at": "2026-10-28T15:05:52.476204154Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5461bc99-0880-472e-b543-9ed435bf6210",
  "code": "803386",
  "device_ref": "sandbox-31229"
}
```

```json
{
  "session_id": "a798c662-2242-427e-aca1-d26725283c2e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDg1MiwiaWF0IjoxNzkzMTk5OTUyLCJqdGkiOiI1Y2ZkNGU0ZS04ZmRiLTQ0OTUtYjc4NS05NWMyODYxMTc3MWYiLCJzaWQiOiJhNzk4YzY2Mi0yMjQyLTQyN2UtYWNhMS1kMjY3MjUyODNjMmUifQ.Wfr6fxyJ9FzSfUSlvsKsYEP7WEKr29AAe1bthnsZtD0",
  "access_expires_at": "2026-10-28T15:20:52.743411205Z",
  "refresh_token": "v2n_OPgIcu8egpPq-esfw5KwMNex0WW5xg4_c0664jk",
  "refresh_expires_at": "2026-11-27T15:05:52.74277703Z",
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
  "command_id": "e85538aa-bb94-4921-9daa-45546fd2f3d8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:53Z",
    "sequence": 1793199953252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "15c571ff-aa7c-4ffe-8b95-af9697beb5d0",
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
  "last_heartbeat_at": "2026-10-28T15:05:53.267646Z",
  "last_location_at": "2026-10-28T15:05:53.267646Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "b214a21c-57ad-4262-8b34-c5a33ff34896",
      "short_number": 21,
      "pickup_at": "2026-10-28T18:05:50Z",
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

`POST /api/driver/v1/preorders/b214a21c-57ad-4262-8b34-c5a33ff34896/reserve` → **200**

```json
{
  "command_id": "2e0248b9-6c17-46be-864a-93e5a6eb2ede"
}
```

```json
{
  "id": "08d4530a-d8fc-45b6-83e1-9fe20fa77e9e",
  "state": "RESERVED",
  "order": {
    "order_id": "b214a21c-57ad-4262-8b34-c5a33ff34896",
    "short_number": 21,
    "pickup_at": "2026-10-28T18:05:50Z",
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
  "reserved_at": "2026-10-28T15:05:53.788659Z",
  "confirm_from": "2026-10-28T17:35:50Z",
  "confirm_until": "2026-10-28T17:45:50Z",
  "drop_until": "2026-10-28T17:05:50Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "08d4530a-d8fc-45b6-83e1-9fe20fa77e9e",
      "state": "RESERVED",
      "order": {
        "order_id": "b214a21c-57ad-4262-8b34-c5a33ff34896",
        "short_number": 21,
        "pickup_at": "2026-10-28T18:05:50Z",
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
      "reserved_at": "2026-10-28T15:05:53.788659Z",
      "confirm_from": "2026-10-28T17:35:50Z",
      "confirm_until": "2026-10-28T17:45:50Z",
      "drop_until": "2026-10-28T17:05:50Z"
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
      "id": "08d4530a-d8fc-45b6-83e1-9fe20fa77e9e",
      "state": "RESERVED",
      "order": {
        "order_id": "b214a21c-57ad-4262-8b34-c5a33ff34896",
        "short_number": 21,
        "pickup_at": "2026-10-28T18:05:50Z",
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
      "reserved_at": "2026-10-28T15:05:53.788659Z",
      "confirm_from": "2026-10-28T17:35:50Z",
      "confirm_until": "2026-10-28T17:45:50Z",
      "drop_until": "2026-10-28T17:05:50Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/08d4530a-d8fc-45b6-83e1-9fe20fa77e9e/confirm` → **409**

```json
{
  "command_id": "7731e361-690d-4558-9fb7-a79da1374698"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/08d4530a-d8fc-45b6-83e1-9fe20fa77e9e/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "13ed693e-cd50-438c-b7d4-61820332d6a0"
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
  "session_id": "8ac01089-c2f2-4413-a0a5-fb118f30e6b8",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NTUsImlhdCI6MTc5MzE5OTk1NSwianRpIjoiYTYxMDhmYTEtYmJhZC00YzExLThhNWQtNWQ1OWQzZTliOGJlIiwic2lkIjoiOGFjMDEwODktYzJmMi00NDEzLWEwYTUtZmIxMThmMzBlNmI4In0.0KBeilUNlS1cCSnZqt2_Sxdc6oPdtZMA3LrURAxTUmw",
  "access_expires_at": "2026-10-28T15:20:55.106763768Z",
  "refresh_token": "9yvAr04Bifefh_KHvJJvt2rbZL9eSDsKjnXLCQKnqTs",
  "refresh_expires_at": "2026-10-29T03:05:55.106117982Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b214a21c-57ad-4262-8b34-c5a33ff34896` → **200**

```json
{
  "id": "b214a21c-57ad-4262-8b34-c5a33ff34896",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "02f1ad05-a65e-415a-b58f-2dbe6913e2cc",
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
  "created_at": "2026-10-28T15:05:52.209905Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T18:05:50Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "08d4530a-d8fc-45b6-83e1-9fe20fa77e9e",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T15:05:53.788659Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b214a21c-57ad-4262-8b34-c5a33ff34896/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T15:05:52.211024Z",
      "actor": {
        "type": "CLIENT",
        "id": "02f1ad05-a65e-415a-b58f-2dbe6913e2cc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "b214a21c-57ad-4262-8b34-c5a33ff34896",
        "preorder": true,
        "quote_id": "76454fb2-f890-4b82-99fe-abb017e0f077",
        "pickup_at": "2026-10-28T18:05:50Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "7b91d3e2-0897-4bed-8198-6606f6287f94"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T15:05:53.789695Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b214a21c-57ad-4262-8b34-c5a33ff34896",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "08d4530a-d8fc-45b6-83e1-9fe20fa77e9e"
      },
      "correlation_id": "75c42550-d249-4bdf-ac81-a7e329fa53a5"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order b214a21c-57ad-4262-8b34-c5a33ff34896, reservation 08d4530a-d8fc-45b6-83e1-9fe20fa77e9e.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28821"
}
```

```json
{
  "challenge_id": "1115063d-c143-49f8-a574-f7e397f1ac8a",
  "expires_at": "2026-10-28T15:10:55.88797074Z",
  "resend_available_at": "2026-10-28T15:05:56.88797074Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "151710",
  "sent_at": "2026-10-28T15:05:55.890133652Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1115063d-c143-49f8-a574-f7e397f1ac8a",
  "code": "151710",
  "device_ref": "sandbox-28821"
}
```

```json
{
  "session_id": "c90a36cd-2060-4b24-b38d-49d8212420fb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDg1NiwiaWF0IjoxNzkzMTk5OTU2LCJqdGkiOiJiYzY4ZjIyMC03NjBjLTRmNDctYjI3MC0zNmY5ZDFmNWYwOGMiLCJzaWQiOiJjOTBhMzZjZC0yMDYwLTRiMjQtYjM4ZC00OWQ4MjEyNDIwZmIifQ.aka3ex7F0ypvnnKnMby7RrhLA5cie-mRnvVDQTCDXF8",
  "access_expires_at": "2026-10-28T15:20:56.159682794Z",
  "refresh_token": "lwULVIktdf3Er50Cu9247JJgYtZxyntozcMnhPhtCk4",
  "refresh_expires_at": "2026-11-27T15:05:56.159008473Z",
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
  "command_id": "305e87e4-ce66-49fa-b124-7ef0c5fe45b9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:56Z",
    "sequence": 1793199956656
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e21ca228-3ee7-4ce9-a804-bd01e1e4b34a",
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
  "last_heartbeat_at": "2026-10-28T15:05:56.671535Z",
  "last_location_at": "2026-10-28T15:05:56.671535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672250509",
  "device_ref": "sandbox-25016"
}
```

```json
{
  "challenge_id": "28d7a8d6-34d1-4089-9649-f1251364c7be",
  "expires_at": "2026-10-28T15:10:56.925809685Z",
  "resend_available_at": "2026-10-28T15:05:57.925809685Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672250509` → **200**

```json
{
  "phone": "+380672250509",
  "audience": "CLIENT",
  "code": "251621",
  "sent_at": "2026-10-28T15:05:56.927773388Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28d7a8d6-34d1-4089-9649-f1251364c7be",
  "code": "251621",
  "device_ref": "sandbox-25016"
}
```

```json
{
  "session_id": "de8fb134-300b-42c7-993d-3fc5ec016aa8",
  "subject": {
    "type": "CLIENT",
    "id": "1fea7c38-98d4-430b-882d-bfe9d8de1965"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmVhN2MzOC05OGQ0LTQzMGItODgyZC1iZmU5ZDhkZTE5NjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODU3LCJpYXQiOjE3OTMxOTk5NTcsImp0aSI6IjJiYjA5OGEyLWQyMmQtNDQ1Yi05MDQxLTY3YTIxMGJhYjM3NSIsInNpZCI6ImRlOGZiMTM0LTMwMGItNDJjNy05OTNkLTNmYzVlYzAxNmFhOCJ9.DfhfJbK2UBe96LdVB910bmvqNuFFo8vKBmbtpahjU3E",
  "access_expires_at": "2026-10-28T15:20:57.211097608Z",
  "refresh_token": "xN2Jarjk3EVx7piruUjD_-IfxjGAPphdVMMagXN3uUg",
  "refresh_expires_at": "2026-11-27T15:05:57.210430035Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4f6ab321-1540-4516-89ee-615c97d52017",
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
  "id": "4e9253a9-7fdd-4081-81ae-c5c88be30701",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:10:57.473175Z",
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
  "command_id": "708295aa-cf0d-4a16-9639-bb143c97ba70",
  "quote_id": "4e9253a9-7fdd-4081-81ae-c5c88be30701",
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
  "id": "c4f4225b-6ea7-4ad1-8bb0-c202533e8d53",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1fea7c38-98d4-430b-882d-bfe9d8de1965",
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
  "created_at": "2026-10-28T15:05:57.752918Z",
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
    "id": "cd7d9701-c36e-4c9a-abe3-72e49d940dc0",
    "order_id": "c4f4225b-6ea7-4ad1-8bb0-c202533e8d53",
    "expires_at": "2026-10-28T15:06:12.756348Z",
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

`POST /api/driver/v1/offers/cd7d9701-c36e-4c9a-abe3-72e49d940dc0/accept` → **200**

```json
{
  "command_id": "44ab671a-f4c3-4a27-9c2e-c1e91992ee76"
}
```

```json
{
  "id": "742aea41-3a5f-4890-b033-70b80b2bff42",
  "order_id": "c4f4225b-6ea7-4ad1-8bb0-c202533e8d53",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "408643d5-466d-433b-a643-7a89d38936ff",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "408643d5-466d-433b-a643-7a89d38936ff",
  "order_id": "c4f4225b-6ea7-4ad1-8bb0-c202533e8d53",
  "assignment_id": "742aea41-3a5f-4890-b033-70b80b2bff42",
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

`POST /api/driver/v1/work-sessions/e21ca228-3ee7-4ce9-a804-bd01e1e4b34a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:58Z",
    "sequence": 1793199958792
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e21ca228-3ee7-4ce9-a804-bd01e1e4b34a",
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
  "last_heartbeat_at": "2026-10-28T15:05:58.808174Z",
  "last_location_at": "2026-10-28T15:05:58.808174Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "408643d5-466d-433b-a643-7a89d38936ff",
  "order_id": "c4f4225b-6ea7-4ad1-8bb0-c202533e8d53",
  "assignment_id": "742aea41-3a5f-4890-b033-70b80b2bff42",
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

`POST /api/driver/v1/trips/408643d5-466d-433b-a643-7a89d38936ff/arrive` → **200**

```json
{
  "command_id": "afcb2788-2467-4091-bee0-87256d1d9252",
  "expected_version": 0
}
```

```json
{
  "id": "408643d5-466d-433b-a643-7a89d38936ff",
  "order_id": "c4f4225b-6ea7-4ad1-8bb0-c202533e8d53",
  "assignment_id": "742aea41-3a5f-4890-b033-70b80b2bff42",
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
  "arrived_at": "2026-10-28T15:05:59.322341Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/408643d5-466d-433b-a643-7a89d38936ff/start` → **200**

```json
{
  "command_id": "ec6bf81b-2add-4049-a4fa-f58840f0d3a1",
  "expected_version": 1
}
```

```json
{
  "id": "408643d5-466d-433b-a643-7a89d38936ff",
  "order_id": "c4f4225b-6ea7-4ad1-8bb0-c202533e8d53",
  "assignment_id": "742aea41-3a5f-4890-b033-70b80b2bff42",
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
  "arrived_at": "2026-10-28T15:05:59.322341Z",
  "started_at": "2026-10-28T15:05:59.584177Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e21ca228-3ee7-4ce9-a804-bd01e1e4b34a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:05:59Z",
    "sequence": 1793199959843
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e21ca228-3ee7-4ce9-a804-bd01e1e4b34a",
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
  "last_heartbeat_at": "2026-10-28T15:05:59.859356Z",
  "last_location_at": "2026-10-28T15:05:59.859356Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/408643d5-466d-433b-a643-7a89d38936ff/complete` → **200**

```json
{
  "command_id": "71d0cfe4-c740-4c12-bf8b-cb0a815ae425",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:06:00Z",
  "cash_received": true
}
```

```json
{
  "id": "408643d5-466d-433b-a643-7a89d38936ff",
  "order_id": "c4f4225b-6ea7-4ad1-8bb0-c202533e8d53",
  "assignment_id": "742aea41-3a5f-4890-b033-70b80b2bff42",
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
  "arrived_at": "2026-10-28T15:05:59.322341Z",
  "started_at": "2026-10-28T15:05:59.584177Z",
  "completed_at": "2026-10-28T15:06:00.126343Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/c4f4225b-6ea7-4ad1-8bb0-c202533e8d53/rating` → **200**

```json
{
  "command_id": "9a59095b-9f48-4c0f-ad89-04f2f8aa7de9",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "c4f4225b-6ea7-4ad1-8bb0-c202533e8d53",
  "score": 5,
  "created_at": "2026-10-28T15:06:00.40843531Z"
}
```

`POST /api/driver/v1/orders/c4f4225b-6ea7-4ad1-8bb0-c202533e8d53/rating` → **200**

```json
{
  "command_id": "42f24e87-b610-4b1c-b0cd-bffb16a398be",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "c4f4225b-6ea7-4ad1-8bb0-c202533e8d53",
  "score": 4,
  "created_at": "2026-10-28T15:06:00.659421899Z"
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
  "session_id": "09a274de-50ef-4413-939c-ea4298251cab",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NjEsImlhdCI6MTc5MzE5OTk2MSwianRpIjoiMzMxNDMzMzktMjk0Ny00ZjRjLTgyODMtMDhiYTI2ZmE4MGQzIiwic2lkIjoiMDlhMjc0ZGUtNTBlZi00NDEzLTkzOWMtZWE0Mjk4MjUxY2FiIn0.F67zcMkQEnlB4bakwnT6t2Bmat9tdilnyIc-ztYT4_I",
  "access_expires_at": "2026-10-28T15:21:01.450061569Z",
  "refresh_token": "037VQNmwAstQ_4wsqFqH-6KGvgFEJ6KDAp_b98a1dkE",
  "refresh_expires_at": "2026-10-29T03:06:01.449557727Z",
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
  "session_id": "8a9e8018-9384-403f-866f-ff85a3f5d3d0",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NjEsImlhdCI6MTc5MzE5OTk2MSwianRpIjoiNjE1MjU1YzctMGRkYi00MGIyLWFhOTEtYzBhM2I2NjgwZDE3Iiwic2lkIjoiOGE5ZTgwMTgtOTM4NC00MDNmLTg2NmYtZmY4NWEzZjVkM2QwIn0.tQseLUeEGd-vWkztdrzc_BGIgIzBk1cz2pm0ekT0Qko",
  "access_expires_at": "2026-10-28T15:21:01.983389409Z",
  "refresh_token": "Ssn5rtARCMeWjy8A1go83yP_lzYAyb1aEGk3PQUVueM",
  "refresh_expires_at": "2026-10-29T03:06:01.982909514Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c4f4225b-6ea7-4ad1-8bb0-c202533e8d53/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "c4f4225b-6ea7-4ad1-8bb0-c202533e8d53",
      "author_type": "RIDER",
      "author_id": "1fea7c38-98d4-430b-882d-bfe9d8de1965",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T15:06:00.408435Z"
    },
    {
      "order_id": "c4f4225b-6ea7-4ad1-8bb0-c202533e8d53",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "1fea7c38-98d4-430b-882d-bfe9d8de1965",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T15:06:00.659422Z"
    }
  ]
}
```

Done: ratings for order c4f4225b-6ea7-4ad1-8bb0-c202533e8d53.

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
  "session_id": "df140402-b8ee-4b98-839c-0b1b59d02bb0",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NjIsImlhdCI6MTc5MzE5OTk2MiwianRpIjoiZGU2YTc4YWYtYmRmMi00MmYxLWI0MDYtNTM4OGExNThjNTMzIiwic2lkIjoiZGYxNDA0MDItYjhlZS00Yjk4LTgzOWMtMGIxYjU5ZDAyYmIwIn0.hjmAvUX1DgMxRluh7Lhc-Zu-TFqJLWgPphC0FmEZREU",
  "access_expires_at": "2026-10-28T15:21:02.797286817Z",
  "refresh_token": "JNqKtVZsqTJEbkbR_VGQvTfIqEzDfI3lwn11XrY5Cjg",
  "refresh_expires_at": "2026-10-29T03:06:02.796693686Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "89153937-1131-4c01-ad0e-d4416299dc7c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "b7c76024-0662-482c-a3ab-a7b9a2f1adf2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:06:03.064903Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b7c76024-0662-482c-a3ab-a7b9a2f1adf2` → **200**

```json
{
  "id": "b7c76024-0662-482c-a3ab-a7b9a2f1adf2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:06:03.064903Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b7c76024-0662-482c-a3ab-a7b9a2f1adf2` → **200**

```json
{
  "id": "b7c76024-0662-482c-a3ab-a7b9a2f1adf2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:06:03.064903Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b7c76024-0662-482c-a3ab-a7b9a2f1adf2` → **200**

```json
{
  "id": "b7c76024-0662-482c-a3ab-a7b9a2f1adf2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T15:06:03.064903Z",
  "ready_at": "2026-10-28T15:06:04.691047Z",
  "expires_at": "2026-10-29T15:06:04.691047Z"
}
```

`GET /api/admin/v1/reports/exports/b7c76024-0662-482c-a3ab-a7b9a2f1adf2/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
total,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "2d46e079-1700-43f6-b54b-91b540268804",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "a97d60b5-5ae3-4ddc-ab02-c9664fc9a137",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:06:06.145201Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a97d60b5-5ae3-4ddc-ab02-c9664fc9a137` → **200**

```json
{
  "id": "a97d60b5-5ae3-4ddc-ab02-c9664fc9a137",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:06:06.145201Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a97d60b5-5ae3-4ddc-ab02-c9664fc9a137` → **200**

```json
{
  "id": "a97d60b5-5ae3-4ddc-ab02-c9664fc9a137",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:06:06.145201Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a97d60b5-5ae3-4ddc-ab02-c9664fc9a137` → **200**

```json
{
  "id": "a97d60b5-5ae3-4ddc-ab02-c9664fc9a137",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:06:06.145201Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a97d60b5-5ae3-4ddc-ab02-c9664fc9a137` → **200**

```json
{
  "id": "a97d60b5-5ae3-4ddc-ab02-c9664fc9a137",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T15:06:06.145201Z",
  "ready_at": "2026-10-28T15:06:09.699355Z",
  "expires_at": "2026-10-29T15:06:09.699355Z"
}
```

`GET /api/admin/v1/reports/exports/a97d60b5-5ae3-4ddc-ab02-c9664fc9a137/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/092fb048-0cce-4393-9540-1fb72f2a0066` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/092fb048-0cce-4393-9540-1fb72f2a0066",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "063653e2-c08a-4225-9a97-a625cafb409d"
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
  "device_ref": "sandbox-8136"
}
```

```json
{
  "challenge_id": "b754604e-62c9-44dc-b6ac-7bc755395d66",
  "expires_at": "2026-10-28T15:11:10.69545945Z",
  "resend_available_at": "2026-10-28T15:06:11.69545945Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "345910",
  "sent_at": "2026-10-28T15:06:10.69774887Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b754604e-62c9-44dc-b6ac-7bc755395d66",
  "code": "345910",
  "device_ref": "sandbox-8136"
}
```

```json
{
  "session_id": "06747607-bfe5-4d91-873f-78876c04489e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDg3MCwiaWF0IjoxNzkzMTk5OTcwLCJqdGkiOiI1ODA4NmRhMi00ZWU3LTQ5OTItYmYyZC02NGUyZmE0NDBhNWQiLCJzaWQiOiIwNjc0NzYwNy1iZmU1LTRkOTEtODczZi03ODg3NmMwNDQ4OWUifQ.Y73x04ZvrB2UPOGGQ63-liQYv9tRtQ6qbE_HxXuuM7s",
  "access_expires_at": "2026-10-28T15:21:10.967402144Z",
  "refresh_token": "yy6c2CXpE48xhKPheBZI_EVMRX8i1Umeh-71wP_qNDQ",
  "refresh_expires_at": "2026-11-27T15:06:10.966905321Z",
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
  "command_id": "26a70c43-59f8-42fd-a2a3-239c77ff074f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:11Z",
    "sequence": 1793199971704
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "613ae847-3eb7-4465-84b2-b1be7c61d488",
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
  "last_heartbeat_at": "2026-10-28T15:06:11.719625Z",
  "last_location_at": "2026-10-28T15:06:11.719625Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "9b5a5211-739f-4e0d-b40c-61cb9e084b9a",
  "points": [
    {
      "sequence": 1793199973976,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T15:05:13Z"
    },
    {
      "sequence": 1793199973983,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T15:06:13Z"
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
  "session_id": "f843020a-6ca9-4cb2-822a-5d2176e858d6",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NzQsImlhdCI6MTc5MzE5OTk3NCwianRpIjoiMGE4NTM3YjMtMWM3Yi00MjI3LWFiNWItNDU4YmM1NTA5ZTQ5Iiwic2lkIjoiZjg0MzAyMGEtNmNhOS00Y2IyLTgyMmEtNWQyMTc2ZTg1OGQ2In0.-xpaDB-rd_RPl8KzvCNJRLP4G3TRzPe0xYZnjBaomlw",
  "access_expires_at": "2026-10-28T15:21:14.559458169Z",
  "refresh_token": "NpD5USQR15ECya5dRndi97QEJM_cAw6UYm1LIF5Y5ME",
  "refresh_expires_at": "2026-10-29T03:06:14.558904276Z",
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
      "id": "69cdb38e-7980-4fdb-b3bd-9c32f236c587",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T15:06:13Z",
        "track_point_id": "06ecee7c-ef06-4fde-81da-65ea8fc7191f",
        "work_session_id": "613ae847-3eb7-4465-84b2-b1be7c61d488"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T15:06:13Z",
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

`POST /api/admin/v1/driver-risk-flags/69cdb38e-7980-4fdb-b3bd-9c32f236c587/confirm` → **200**

```json
{
  "command_id": "a0b5cc1e-d175-4384-956a-37aa1030b970",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "69cdb38e-7980-4fdb-b3bd-9c32f236c587",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T15:06:13Z",
    "track_point_id": "06ecee7c-ef06-4fde-81da-65ea8fc7191f",
    "work_session_id": "613ae847-3eb7-4465-84b2-b1be7c61d488"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T15:06:13Z",
  "reason": null,
  "reviewed_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "reviewed_at": "2026-10-28T15:06:16.630235Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/69cdb38e-7980-4fdb-b3bd-9c32f236c587/dismiss` → **409**

```json
{
  "command_id": "7fb9283b-f64f-4944-a0e7-13ba7daae9e1",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/69cdb38e-7980-4fdb-b3bd-9c32f236c587/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "384ce3c0-97aa-4d55-943d-8f662c083ce1"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "0492b970-9ba5-430a-a595-d4c77d26c419",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "992e5da4-84cc-4574-b5db-a2baaeb74410",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "raised_at": "2026-10-28T15:06:17.173245Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/992e5da4-84cc-4574-b5db-a2baaeb74410/dismiss` → **200**

```json
{
  "command_id": "d9c321d3-26a9-4a5c-88ec-4d678d27504b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "992e5da4-84cc-4574-b5db-a2baaeb74410",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "raised_at": "2026-10-28T15:06:17.173245Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "reviewed_at": "2026-10-28T15:06:17.453372Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "10309446-acce-4f59-b2d9-b8ed4f66e032",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "69cdb38e-7980-4fdb-b3bd-9c32f236c587"
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
      "actor_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:06:17.748243Z"
    }
  ]
}
```

Done: flag 69cdb38e-7980-4fdb-b3bd-9c32f236c587 confirmed, suspension named it, driver reinstated.

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
  "session_id": "9168f794-5537-4722-9cec-64f98934ee11",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4NzgsImlhdCI6MTc5MzE5OTk3OCwianRpIjoiYmRkY2NjNGQtNDI0Ni00NjZmLTk3YmEtNjM0NzE4MTI0YWMyIiwic2lkIjoiOTE2OGY3OTQtNTUzNy00NzIyLTljZWMtNjRmOTg5MzRlZTExIn0.sAd6mjeDjgNIeApi34YfNXn7SubPfztjw7NS4GE_vlg",
  "access_expires_at": "2026-10-28T15:21:18.547354235Z",
  "refresh_token": "tsAvkL4geLh-8PsOLoDKWRhX6y1sLG7Wn56CKekC568",
  "refresh_expires_at": "2026-10-29T03:06:18.546864358Z",
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
      "actor_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:06:17.748243Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "5d52a9bb-c42d-4d57-ab4f-677942f284ea",
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
  "session_id": "613ae847-3eb7-4465-84b2-b1be7c61d488",
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
  "last_heartbeat_at": "2026-10-28T15:06:11.719625Z",
  "last_location_at": "2026-10-28T15:06:11.719625Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/613ae847-3eb7-4465-84b2-b1be7c61d488/close` → **200**

```json
{
  "command_id": "e9170db4-2539-410c-946c-7d676fc619e7",
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
  "session_id": "3c00fba1-5d54-42f8-b4dc-ab6ded7836b6",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4ODAsImlhdCI6MTc5MzE5OTk4MCwianRpIjoiM2I2NjVhZmEtYWRkMi00NTA5LThkZTItMGY1M2IzMTRjZDMxIiwic2lkIjoiM2MwMGZiYTEtNWQ1NC00MmY4LWI0ZGMtYWI2ZGVkNzgzNmI2In0.gxQOht8AbxB1DeOH4KqBsT7RZUzVG8Xn2C9PX14dtAE",
  "access_expires_at": "2026-10-28T15:21:20.144564913Z",
  "refresh_token": "B2PAKa72BBGxkCX2Yx4J-aA-lSUMKwOj3AbDHeVeFPI",
  "refresh_expires_at": "2026-10-29T03:06:20.144098313Z",
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
  "command_id": "bdb0c9e1-ed68-4332-bbac-d674edf3f318",
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
  "changed_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T15:06:20.675741Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "bdb0c9e1-ed68-4332-bbac-d674edf3f318",
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
  "changed_by": "f0e25eac-31e8-4f76-b671-addb0f66903a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T15:06:20.675741Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48794090772",
  "device_ref": "sandbox-12086"
}
```

```json
{
  "challenge_id": "74ba70c6-1bfe-4dd1-a336-144b7078ea62",
  "expires_at": "2026-10-28T15:11:21.20804648Z",
  "resend_available_at": "2026-10-28T15:06:22.20804648Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48794090772` → **200**

```json
{
  "phone": "+48794090772",
  "audience": "CLIENT",
  "code": "234212",
  "sent_at": "2026-10-28T15:06:21.210062346Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74ba70c6-1bfe-4dd1-a336-144b7078ea62",
  "code": "234212",
  "device_ref": "sandbox-12086"
}
```

```json
{
  "session_id": "7da983f4-30a1-4962-b301-bf4d41aa9dce",
  "subject": {
    "type": "CLIENT",
    "id": "0a31d96f-5449-4de3-8072-a553fd562c2b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYTMxZDk2Zi01NDQ5LTRkZTMtODA3Mi1hNTUzZmQ1NjJjMmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODgxLCJpYXQiOjE3OTMxOTk5ODEsImp0aSI6ImE2YmVmNjcwLTUzNjQtNGUxOC04MjAyLTZiODViYTIzMjllNiIsInNpZCI6IjdkYTk4M2Y0LTMwYTEtNDk2Mi1iMzAxLWJmNGQ0MWFhOWRjZSJ9.jhOgHSHZCLhunIlgrvyEoi3RWmpx_yGd9FbxzxR28Kc",
  "access_expires_at": "2026-10-28T15:21:21.488995026Z",
  "refresh_token": "GMtrgDuOdK9XL7SWDB_N0SbWJxKS4GoMdbGpf7I4ouo",
  "refresh_expires_at": "2026-11-27T15:06:21.488380386Z",
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
  "correlation_id": "fd7a6785-4d7a-4252-ba1c-5ff27ad7374f"
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
  "device_ref": "sandbox-3799"
}
```

```json
{
  "challenge_id": "8f365ef8-6749-4af5-a132-0dae003b5a1c",
  "expires_at": "2026-10-28T15:11:22.23682268Z",
  "resend_available_at": "2026-10-28T15:06:23.23682268Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "304096",
  "sent_at": "2026-10-28T15:06:22.238844806Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f365ef8-6749-4af5-a132-0dae003b5a1c",
  "code": "304096",
  "device_ref": "sandbox-3799"
}
```

```json
{
  "session_id": "21f4d911-7dcd-431d-b08e-0392c6c55bed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDg4MiwiaWF0IjoxNzkzMTk5OTgyLCJqdGkiOiJhYTQ4Yzc1OS0wN2RkLTQwMjQtODRkOS05ZjFlYTNhNzFhNjEiLCJzaWQiOiIyMWY0ZDkxMS03ZGNkLTQzMWQtYjA4ZS0wMzkyYzZjNTViZWQifQ.99LobH3GYpN5p7hgSTd46AAsINzgivt0p3vkA_TScHM",
  "access_expires_at": "2026-10-28T15:21:22.510303189Z",
  "refresh_token": "0QUI1Q6neSM5RHe1LS78OmSqhNiHJq_XMW1s3VCOyyw",
  "refresh_expires_at": "2026-11-27T15:06:22.509634074Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "15c571ff-aa7c-4ffe-8b95-af9697beb5d0",
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
  "last_heartbeat_at": "2026-10-28T15:05:53.267646Z",
  "last_location_at": "2026-10-28T15:05:53.267646Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/15c571ff-aa7c-4ffe-8b95-af9697beb5d0/handover` → **200**

```json
{
  "command_id": "d9f8e7cc-d6d5-4717-9c3d-3b86f5788f03",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "15c571ff-aa7c-4ffe-8b95-af9697beb5d0",
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
  "last_heartbeat_at": "2026-10-28T15:05:53.267646Z",
  "last_location_at": "2026-10-28T15:05:53.267646Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/15c571ff-aa7c-4ffe-8b95-af9697beb5d0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:23Z",
    "sequence": 1793199983279
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "15c571ff-aa7c-4ffe-8b95-af9697beb5d0",
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
  "last_heartbeat_at": "2026-10-28T15:06:23.294869Z",
  "last_location_at": "2026-10-28T15:06:23.294869Z",
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
  "session_id": "15c571ff-aa7c-4ffe-8b95-af9697beb5d0",
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
  "last_heartbeat_at": "2026-10-28T15:06:23.294869Z",
  "last_location_at": "2026-10-28T15:06:23.294869Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/15c571ff-aa7c-4ffe-8b95-af9697beb5d0/close` → **200**

```json
{
  "command_id": "eb0464ed-fa35-4fa6-b618-5d3d711eccf2",
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
  "correlation_id": "2feea290-1ba9-4581-93b3-67e7a890340e"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671926250",
  "device_ref": "sandbox-15915"
}
```

```json
{
  "challenge_id": "4589dd5b-633f-42cc-a4f4-b7fe5fadad8b",
  "expires_at": "2026-10-28T15:11:24.599379932Z",
  "resend_available_at": "2026-10-28T15:06:25.599379932Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671926250` → **200**

```json
{
  "phone": "+380671926250",
  "audience": "CLIENT",
  "code": "145711",
  "sent_at": "2026-10-28T15:06:24.601604524Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4589dd5b-633f-42cc-a4f4-b7fe5fadad8b",
  "code": "145711",
  "device_ref": "sandbox-15915"
}
```

```json
{
  "session_id": "9ffeaf12-bb7a-466b-88df-6574538255e6",
  "subject": {
    "type": "CLIENT",
    "id": "3243d888-74db-489f-b393-fcf0f8d79f8f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMjQzZDg4OC03NGRiLTQ4OWYtYjM5My1mY2YwZjhkNzlmOGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwODg0LCJpYXQiOjE3OTMxOTk5ODQsImp0aSI6IjFiMTQ5MGRlLWRiYTItNGQxYy1iZjdmLWQwOTdlYmM2YWUxNiIsInNpZCI6IjlmZmVhZjEyLWJiN2EtNDY2Yi04OGRmLTY1NzQ1MzgyNTVlNiJ9.ZcmT-613L1atJHDBP3KRomjYsjk1NR6ek9iPfp7j_M8",
  "access_expires_at": "2026-10-28T15:21:24.889032055Z",
  "refresh_token": "VONQfsbQRnRTcUPqt9L-HQwC6kbcg_8ca841Df6lASY",
  "refresh_expires_at": "2026-11-27T15:06:24.88850467Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "355d4316-ae86-4f2b-b63d-d8cbed359d78",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "e8b98efe-f8ff-4618-bda6-48322f1c7cb7",
  "upload_path": "/api/rider/v1/uploads/e8b98efe-f8ff-4618-bda6-48322f1c7cb7",
  "expires_at": "2026-10-28T15:21:25.153158328Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/e8b98efe-f8ff-4618-bda6-48322f1c7cb7` → **200**

```json
{
  "file_id": "e8b98efe-f8ff-4618-bda6-48322f1c7cb7",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "01490db5-88ed-4184-b333-34566db7a428",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "e8b98efe-f8ff-4618-bda6-48322f1c7cb7"
  ]
}
```

```json
{
  "id": "f13f6ee2-5978-48b5-9ac7-7110e6002458",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3243d888-74db-489f-b393-fcf0f8d79f8f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T15:06:25.435775Z",
  "updated_at": "2026-10-28T15:06:25.435775Z",
  "respond_by": "2026-10-28T19:06:25.435775Z",
  "messages": [
    {
      "id": "0e7b8bc9-217e-4c57-b52f-3aeb5a3295aa",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3243d888-74db-489f-b393-fcf0f8d79f8f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:06:25.437486Z",
      "attachments": [
        {
          "file_id": "e8b98efe-f8ff-4618-bda6-48322f1c7cb7",
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
  "session_id": "161802ce-2f36-46e4-b524-2d523cbcf579",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4ODUsImlhdCI6MTc5MzE5OTk4NSwianRpIjoiZDQ1Mjg5ZTgtYjQ4OS00OTEyLWFlZDEtYTkyMjA3OWYxNzY3Iiwic2lkIjoiMTYxODAyY2UtMmYzNi00NmU0LWI1MjQtMmQ1MjNjYmNmNTc5In0.9NAsHHLnshLQgLukvk0HGFfKHmclMNdjom7Las-V2nQ",
  "access_expires_at": "2026-10-28T15:21:25.993219381Z",
  "refresh_token": "_HCN_rW_3qF5AeyMxpAw8Qj6sBAxHLjpwu3pgfyUocg",
  "refresh_expires_at": "2026-10-29T03:06:25.992732086Z",
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
  "session_id": "3659b857-6a69-4f9d-93f1-873bd8f1a962",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4ODYsImlhdCI6MTc5MzE5OTk4NiwianRpIjoiY2RhYTIwNmUtMTM2NC00YWI3LWE1MTMtMWQ0OTc1MjMyOGNhIiwic2lkIjoiMzY1OWI4NTctNmE2OS00ZjlkLTkzZjEtODczYmQ4ZjFhOTYyIn0.XBGQla4xi2_uoeKVLm1ICQCleiZvtx-4NCF6Hwv54Bw",
  "access_expires_at": "2026-10-28T15:21:26.524383911Z",
  "refresh_token": "qXf6Dvd-6wfuJ6q4lFwCP_feb-01-elvC49K8vVicCQ",
  "refresh_expires_at": "2026-10-29T03:06:26.523856897Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/f13f6ee2-5978-48b5-9ac7-7110e6002458/attachments/e8b98efe-f8ff-4618-bda6-48322f1c7cb7` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "772aedb3-7651-44c9-a654-2148bcb8a6e7",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "2501a556-bd16-4773-b979-fa45ed43d0b4",
  "upload_path": "/api/operator/v1/uploads/2501a556-bd16-4773-b979-fa45ed43d0b4",
  "expires_at": "2026-10-28T15:21:26.803834982Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/2501a556-bd16-4773-b979-fa45ed43d0b4` → **200**

```json
{
  "file_id": "2501a556-bd16-4773-b979-fa45ed43d0b4",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/f13f6ee2-5978-48b5-9ac7-7110e6002458` → **200**

```json
{
  "id": "f13f6ee2-5978-48b5-9ac7-7110e6002458",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3243d888-74db-489f-b393-fcf0f8d79f8f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T15:06:25.435775Z",
  "updated_at": "2026-10-28T15:06:25.435775Z",
  "respond_by": "2026-10-28T19:06:25.435775Z",
  "messages": [
    {
      "id": "0e7b8bc9-217e-4c57-b52f-3aeb5a3295aa",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3243d888-74db-489f-b393-fcf0f8d79f8f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:06:25.437486Z",
      "attachments": [
        {
          "file_id": "e8b98efe-f8ff-4618-bda6-48322f1c7cb7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/f13f6ee2-5978-48b5-9ac7-7110e6002458/comments` → **200**

```json
{
  "command_id": "09e1dc09-1744-4ca5-bed6-2a892f9b2cb7",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "2501a556-bd16-4773-b979-fa45ed43d0b4"
  ]
}
```

```json
{
  "id": "f13f6ee2-5978-48b5-9ac7-7110e6002458",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3243d888-74db-489f-b393-fcf0f8d79f8f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T15:06:25.435775Z",
  "updated_at": "2026-10-28T15:06:27.346683Z",
  "respond_by": "2026-10-28T19:06:25.435775Z",
  "messages": [
    {
      "id": "0e7b8bc9-217e-4c57-b52f-3aeb5a3295aa",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3243d888-74db-489f-b393-fcf0f8d79f8f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:06:25.437486Z",
      "attachments": [
        {
          "file_id": "e8b98efe-f8ff-4618-bda6-48322f1c7cb7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d6c7fd65-4c4f-4ff1-9d9e-20fd062c4dae",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T15:06:27.346115Z",
      "attachments": [
        {
          "file_id": "2501a556-bd16-4773-b979-fa45ed43d0b4",
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

`GET /api/rider/v1/support/cases/f13f6ee2-5978-48b5-9ac7-7110e6002458` → **200**

```json
{
  "id": "f13f6ee2-5978-48b5-9ac7-7110e6002458",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3243d888-74db-489f-b393-fcf0f8d79f8f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T15:06:25.435775Z",
  "updated_at": "2026-10-28T15:06:27.346683Z",
  "respond_by": "2026-10-28T19:06:25.435775Z",
  "messages": [
    {
      "id": "0e7b8bc9-217e-4c57-b52f-3aeb5a3295aa",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3243d888-74db-489f-b393-fcf0f8d79f8f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:06:25.437486Z",
      "attachments": [
        {
          "file_id": "e8b98efe-f8ff-4618-bda6-48322f1c7cb7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d6c7fd65-4c4f-4ff1-9d9e-20fd062c4dae",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T15:06:27.346115Z",
      "attachments": [
        {
          "file_id": "2501a556-bd16-4773-b979-fa45ed43d0b4",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/f13f6ee2-5978-48b5-9ac7-7110e6002458/attachments/2501a556-bd16-4773-b979-fa45ed43d0b4` → **200**

Done: support case f13f6ee2-5978-48b5-9ac7-7110e6002458, rider attachment e8b98efe-f8ff-4618-bda6-48322f1c7cb7, operator attachment 2501a556-bd16-4773-b979-fa45ed43d0b4.

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
  "session_id": "0041aedf-cd6f-4676-9152-d5825607bd73",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4ODgsImlhdCI6MTc5MzE5OTk4OCwianRpIjoiNzc0MmFmMmMtNzkyZC00Mzk3LWFhYWYtNDQwNjM0YjRkMzE0Iiwic2lkIjoiMDA0MWFlZGYtY2Q2Zi00Njc2LTkxNTItZDU4MjU2MDdiZDczIn0.a_QekM6O3nSWclji8Gg_r0W-xitkxygT6NUq-CVNf5M",
  "access_expires_at": "2026-10-28T15:21:28.176772041Z",
  "refresh_token": "5_LUm6W9Qv1_xsmujXkYgf_l8nhIbyOmSBnMldzLQkY",
  "refresh_expires_at": "2026-10-29T03:06:28.176251792Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10761"
}
```

```json
{
  "challenge_id": "15905e7e-5c89-4634-9db8-a19b96a50b28",
  "expires_at": "2026-10-28T15:11:28.419391527Z",
  "resend_available_at": "2026-10-28T15:06:29.419391527Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "845462",
  "sent_at": "2026-10-28T15:06:28.421490441Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "15905e7e-5c89-4634-9db8-a19b96a50b28",
  "code": "845462",
  "device_ref": "sandbox-10761"
}
```

```json
{
  "session_id": "4951b8b4-153d-4f94-abc8-23dc8817e817",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDg4OCwiaWF0IjoxNzkzMTk5OTg4LCJqdGkiOiJkYzk1MmViYi02NDBjLTQzNzUtOWFiOC1mOTljZmNlYmYwZTMiLCJzaWQiOiI0OTUxYjhiNC0xNTNkLTRmOTQtYWJjOC0yM2RjODgxN2U4MTcifQ.WkL4EVK1CupJlsUY-h0ehuvKGZ-qKd6KCX8d6Ud4TdE",
  "access_expires_at": "2026-10-28T15:21:28.696367374Z",
  "refresh_token": "LDHQS0pE1Qo378JBlo8_hUx5OMYAv5b9qNrLQHDYqGE",
  "refresh_expires_at": "2026-11-27T15:06:28.695856057Z",
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
      "actor_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:06:17.748243Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "f0e25eac-31e8-4f76-b671-addb0f66903a",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T15:06:19.082746Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "77771797-6c68-4ec8-98d6-eaa7f2ec864a",
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
  "device_ref": "sandbox-2828"
}
```

```json
{
  "challenge_id": "564c9767-d9c2-45ac-8ce6-edcc391db349",
  "expires_at": "2026-10-28T15:11:29.730406383Z",
  "resend_available_at": "2026-10-28T15:06:30.730406383Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "574736",
  "sent_at": "2026-10-28T15:06:29.732378782Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "564c9767-d9c2-45ac-8ce6-edcc391db349",
  "code": "574736",
  "device_ref": "sandbox-2828"
}
```

```json
{
  "session_id": "76c2b46b-d540-40b0-90b2-e80d5cba2a5f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDg5MCwiaWF0IjoxNzkzMTk5OTkwLCJqdGkiOiJjM2RmNDZlMy0xMzQyLTRhOGItYWZiYy0xM2VjZjhiZmViYWIiLCJzaWQiOiI3NmMyYjQ2Yi1kNTQwLTQwYjAtOTBiMi1lODBkNWNiYTJhNWYifQ.GMxzb1IHBUrq2GtXSbQsq3hys77bSAE3UyiwbpDwVl4",
  "access_expires_at": "2026-10-28T15:21:30.012640886Z",
  "refresh_token": "YhLlMCpF4A3gwEJxCmVvJW3YhMukB90z0M2ZfQbI6po",
  "refresh_expires_at": "2026-11-27T15:06:30.012168287Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e21ca228-3ee7-4ce9-a804-bd01e1e4b34a",
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
  "last_heartbeat_at": "2026-10-28T15:05:59.859356Z",
  "last_location_at": "2026-10-28T15:05:59.859356Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e21ca228-3ee7-4ce9-a804-bd01e1e4b34a/handover` → **200**

```json
{
  "command_id": "fc63d2f9-6c7c-454e-a85e-c6f20d2aecc2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e21ca228-3ee7-4ce9-a804-bd01e1e4b34a",
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
  "last_heartbeat_at": "2026-10-28T15:05:59.859356Z",
  "last_location_at": "2026-10-28T15:05:59.859356Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e21ca228-3ee7-4ce9-a804-bd01e1e4b34a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:30Z",
    "sequence": 1793199990778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e21ca228-3ee7-4ce9-a804-bd01e1e4b34a",
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
  "last_heartbeat_at": "2026-10-28T15:06:30.794487Z",
  "last_location_at": "2026-10-28T15:06:30.794487Z",
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
  "command_id": "49756a6f-53ef-4a5a-ace5-a6e2869ad2f6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:31Z",
    "sequence": 1793199991290
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8bb0c162-9240-45e7-b10a-87065696d98b",
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
  "last_heartbeat_at": "2026-10-28T15:06:31.304999Z",
  "last_location_at": "2026-10-28T15:06:31.304999Z",
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
  "session_id": "2ccf17ac-18d2-4703-941c-138d125ef67e",
  "subject": {
    "type": "STAFF",
    "id": "f0e25eac-31e8-4f76-b671-addb0f66903a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUyNWVhYy0zMWU4LTRmNzYtYjY3MS1hZGRiMGY2NjkwM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA4OTEsImlhdCI6MTc5MzE5OTk5MSwianRpIjoiNDVkMmM4NTEtMmQ3YS00MThhLWFiM2MtOTY1ZmYzODkwNmUwIiwic2lkIjoiMmNjZjE3YWMtMThkMi00NzAzLTk0MWMtMTM4ZDEyNWVmNjdlIn0.hY2UziI3z6j0-mCC1LpGgpl5yfUZwLL-AuT-SCVFDnY",
  "access_expires_at": "2026-10-28T15:21:31.836987667Z",
  "refresh_token": "gL8CAphAxIHJHUX3LAXfWMfDYbO8L4JbDfXlO_KH9_s",
  "refresh_expires_at": "2026-10-29T03:06:31.836482021Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "02ca5dc2-9cfd-451f-86b1-30df4a27db43",
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
  "id": "9df81d96-3fbf-4337-a6b5-ef14abd8fd04",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:11:32.097823Z",
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
  "command_id": "12c8e2a8-4aa9-4b5c-a4d6-b7451d2c31a8",
  "quote_id": "9df81d96-3fbf-4337-a6b5-ef14abd8fd04",
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
  "id": "6bbb7fb5-aeb7-45db-ac93-3ac22bc7e165",
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
  "created_at": "2026-10-28T15:06:32.365929Z",
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
    "id": "b72fc723-fbae-4bc2-95a1-25e0369b8772",
    "order_id": "6bbb7fb5-aeb7-45db-ac93-3ac22bc7e165",
    "expires_at": "2026-10-28T15:06:47.369252Z",
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

`POST /api/driver/v1/offers/b72fc723-fbae-4bc2-95a1-25e0369b8772/accept` → **200**

```json
{
  "command_id": "2091deb6-7737-4643-95fd-207df5f6a925"
}
```

```json
{
  "id": "b1b58618-703c-4e9b-8ec5-f24c205fb54d",
  "order_id": "6bbb7fb5-aeb7-45db-ac93-3ac22bc7e165",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "264a3e46-f1f4-42be-bdff-06652c79265f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "264a3e46-f1f4-42be-bdff-06652c79265f",
  "order_id": "6bbb7fb5-aeb7-45db-ac93-3ac22bc7e165",
  "assignment_id": "b1b58618-703c-4e9b-8ec5-f24c205fb54d",
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

`POST /api/driver/v1/work-sessions/8bb0c162-9240-45e7-b10a-87065696d98b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:06:33Z",
    "sequence": 1793199993660
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8bb0c162-9240-45e7-b10a-87065696d98b",
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
  "last_heartbeat_at": "2026-10-28T15:06:33.676612Z",
  "last_location_at": "2026-10-28T15:06:33.676612Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/264a3e46-f1f4-42be-bdff-06652c79265f/arrive` → **200**

```json
{
  "command_id": "426cff78-01b3-460d-b854-fa7fdf29e2c6",
  "expected_version": 0
}
```

```json
{
  "id": "264a3e46-f1f4-42be-bdff-06652c79265f",
  "order_id": "6bbb7fb5-aeb7-45db-ac93-3ac22bc7e165",
  "assignment_id": "b1b58618-703c-4e9b-8ec5-f24c205fb54d",
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
  "arrived_at": "2026-10-28T15:06:33.937534Z",
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

`POST /api/driver/v1/trips/264a3e46-f1f4-42be-bdff-06652c79265f/start` → **200**

```json
{
  "command_id": "e5e10ddf-c214-4b9f-b789-373fc82904fe",
  "expected_version": 1
}
```

```json
{
  "id": "264a3e46-f1f4-42be-bdff-06652c79265f",
  "order_id": "6bbb7fb5-aeb7-45db-ac93-3ac22bc7e165",
  "assignment_id": "b1b58618-703c-4e9b-8ec5-f24c205fb54d",
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
  "arrived_at": "2026-10-28T15:06:33.937534Z",
  "started_at": "2026-10-28T15:06:34.208505Z",
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

`POST /api/driver/v1/trips/264a3e46-f1f4-42be-bdff-06652c79265f/complete` → **200**

```json
{
  "command_id": "322f6433-4b75-49d7-b37d-5f939ae03273",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:06:34Z",
  "cash_received": true
}
```

```json
{
  "id": "264a3e46-f1f4-42be-bdff-06652c79265f",
  "order_id": "6bbb7fb5-aeb7-45db-ac93-3ac22bc7e165",
  "assignment_id": "b1b58618-703c-4e9b-8ec5-f24c205fb54d",
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
  "arrived_at": "2026-10-28T15:06:33.937534Z",
  "started_at": "2026-10-28T15:06:34.208505Z",
  "completed_at": "2026-10-28T15:06:34.478478Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/6bbb7fb5-aeb7-45db-ac93-3ac22bc7e165` → **200**

```json
{
  "id": "6bbb7fb5-aeb7-45db-ac93-3ac22bc7e165",
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
    "id": "b1b58618-703c-4e9b-8ec5-f24c205fb54d",
    "order_id": "6bbb7fb5-aeb7-45db-ac93-3ac22bc7e165",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "264a3e46-f1f4-42be-bdff-06652c79265f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:06:32.365929Z",
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
  "session_id": "e21ca228-3ee7-4ce9-a804-bd01e1e4b34a",
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
  "last_heartbeat_at": "2026-10-28T15:06:30.794487Z",
  "last_location_at": "2026-10-28T15:06:30.794487Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e21ca228-3ee7-4ce9-a804-bd01e1e4b34a/close` → **200**

```json
{
  "command_id": "350e3ded-7d5e-4a91-a4e9-74377e2ed774",
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
  "session_id": "8bb0c162-9240-45e7-b10a-87065696d98b",
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
  "last_heartbeat_at": "2026-10-28T15:06:33.676612Z",
  "last_location_at": "2026-10-28T15:06:33.676612Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8bb0c162-9240-45e7-b10a-87065696d98b/close` → **200**

```json
{
  "command_id": "01ab15b4-bf14-443c-974b-763650482b88",
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

Done: terminal order 6bbb7fb5-aeb7-45db-ac93-3ac22bc7e165 by Andrii (5a000000-0000-4000-8000-000000000403).
