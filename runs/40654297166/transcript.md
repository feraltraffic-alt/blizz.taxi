# Sandbox transcript (2026-10-28T08:06:03Z, 7f9abac)

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
  "correlation_id": "5064e1e3-694f-4d8d-b7cc-78143906b803"
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
  "session_id": "cbd9d194-36de-438f-b0e6-6cc387fcf97b",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2NjQsImlhdCI6MTc5MzE3NDc2NCwianRpIjoiNzk5OTEzMzAtZDQ2Yy00YjdjLWIzOTgtOWFmYTc1YTA0ZDVlIiwic2lkIjoiY2JkOWQxOTQtMzZkZS00MzhmLWIwZTYtNmNjMzg3ZmNmOTdiIn0.hxUdJa42Xo9ZEFTuDMjA11fxX67KC3Ro4BYy_ky37vc",
  "access_expires_at": "2026-10-28T08:21:04.531473413Z",
  "refresh_token": "v-PWguzPci6cd8EVkan2_Exv_V1adj68DZKOAkWY9-M",
  "refresh_expires_at": "2026-10-28T20:06:04.529131483Z",
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
  "session_id": "587d2f5f-10c6-4224-9952-4c863d37e257",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2NjUsImlhdCI6MTc5MzE3NDc2NSwianRpIjoiZDZmMDgyMGItMzc5NC00MGEzLWFhNGItZTE5YzZlZGY4ZDBmIiwic2lkIjoiNTg3ZDJmNWYtMTBjNi00MjI0LTk5NTItNGM4NjNkMzdlMjU3In0.pYKZoWQeQF29smn4ZuEYWSpxP9gG9l4qm7lIWB_ycmg",
  "access_expires_at": "2026-10-28T08:21:05.874001296Z",
  "refresh_token": "TLbH6KV_3oBSmZ6wfCAkl65GW1k0-j8UN7_xEuyd4lE",
  "refresh_expires_at": "2026-10-28T20:06:05.872986298Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "8e32685e-de9f-41a7-8b9f-e34206d18a4e",
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
  "id": "13a70f3f-b889-4d03-aa00-64770e3d23dd",
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
  "created_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "created_at": "2026-10-28T08:06:05.947955Z",
  "updated_at": "2026-10-28T08:06:05.947955Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639695276",
  "device_ref": "sandbox-18133"
}
```

```json
{
  "challenge_id": "fe33461d-9e16-413b-ada1-ed78b415841b",
  "expires_at": "2026-10-28T08:11:06.002491352Z",
  "resend_available_at": "2026-10-28T08:06:07.002491352Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639695276` → **200**

```json
{
  "phone": "+380639695276",
  "audience": "CLIENT",
  "code": "562750",
  "sent_at": "2026-10-28T08:06:06.01324394Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe33461d-9e16-413b-ada1-ed78b415841b",
  "code": "562750",
  "device_ref": "sandbox-18133"
}
```

```json
{
  "session_id": "52f60d69-51f1-45ab-b36a-daf631f34705",
  "subject": {
    "type": "CLIENT",
    "id": "e30aaf86-b914-4854-8619-1fb8a0a21162"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzBhYWY4Ni1iOTE0LTQ4NTQtODYxOS0xZmI4YTBhMjExNjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NjY2LCJpYXQiOjE3OTMxNzQ3NjYsImp0aSI6IjJmY2ExMDJiLTMxZWUtNGZhMy1hNjMxLTZhMGYwYWY1ZmIwNCIsInNpZCI6IjUyZjYwZDY5LTUxZjEtNDVhYi1iMzZhLWRhZjYzMWYzNDcwNSJ9.DjF9UaQsDnLpZx-Tq_cQJofAZnZDze1rYO4m-nEaqBQ",
  "access_expires_at": "2026-10-28T08:21:06.119210628Z",
  "refresh_token": "zuTG6scL1vPmePlWfl7dhQr-Lf5XJnuqEE9qhH51eCk",
  "refresh_expires_at": "2026-11-27T08:06:06.118038154Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639695276` → **200**

```json
{
  "client_id": "e30aaf86-b914-4854-8619-1fb8a0a21162"
}
```

`POST /api/admin/v1/rider-wallets/e30aaf86-b914-4854-8619-1fb8a0a21162/top-ups` → **201**

```json
{
  "command_id": "ed1a7193-40f8-4ca2-8d4a-0a87cb14eaf9",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "e30aaf86-b914-4854-8619-1fb8a0a21162",
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
      "id": "8167dc10-a5a5-4e82-9711-fe3998213204",
      "at": "2026-10-28T08:06:06.217963Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0aa17878-90eb-4e0c-b908-a838c15fe9df",
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
  "id": "47545b9c-d1ab-4635-948e-f8ec04cdf5d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:11:06.454032Z",
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
      "id": "13a70f3f-b889-4d03-aa00-64770e3d23dd",
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
  "device_ref": "sandbox-23015"
}
```

```json
{
  "challenge_id": "f1204a8c-4331-415a-b169-60dd4dd24947",
  "expires_at": "2026-10-28T08:11:06.5279328Z",
  "resend_available_at": "2026-10-28T08:06:07.5279328Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "579405",
  "sent_at": "2026-10-28T08:06:06.532273068Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1204a8c-4331-415a-b169-60dd4dd24947",
  "code": "579405",
  "device_ref": "sandbox-23015"
}
```

```json
{
  "session_id": "878af03c-03c5-428e-ae3e-52cb50c64201",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTY2NiwiaWF0IjoxNzkzMTc0NzY2LCJqdGkiOiJhZTk4NWY4YS1iZjAxLTQ0NGYtYjVhYi1lY2RhZGYwOGIxYjQiLCJzaWQiOiI4NzhhZjAzYy0wM2M1LTQyOGUtYWUzZS01MmNiNTBjNjQyMDEifQ.-1CVvaj7Zbyii3yFOwsXTPfiZI0V1C42t4ZwWJJfkcw",
  "access_expires_at": "2026-10-28T08:21:06.598852584Z",
  "refresh_token": "uffZcM8XTc-tESTLGEi4-5pHBZ8BngFI7Tt40v6jUtc",
  "refresh_expires_at": "2026-11-27T08:06:06.597889784Z",
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
  "command_id": "42a1e38b-0dc7-4a86-bf54-87f94bc80baf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:06Z",
    "sequence": 1793174766672
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b3ed0598-fccf-4e3d-94c5-10a349634c65",
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
  "last_heartbeat_at": "2026-10-28T08:06:06.724618Z",
  "last_location_at": "2026-10-28T08:06:06.724618Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0741aee0-5795-4c8e-9f22-1a2f73a29a6f",
  "quote_id": "47545b9c-d1ab-4635-948e-f8ec04cdf5d2",
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
  "id": "61003984-14c1-4ca6-9029-04660eb9ab07",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e30aaf86-b914-4854-8619-1fb8a0a21162",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T08:06:06.830693Z",
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
  "client_id": "e30aaf86-b914-4854-8619-1fb8a0a21162",
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
      "id": "8167dc10-a5a5-4e82-9711-fe3998213204",
      "at": "2026-10-28T08:06:06.217963Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
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
    "id": "92a918c0-fd6f-4641-997c-767d88a4cad4",
    "order_id": "61003984-14c1-4ca6-9029-04660eb9ab07",
    "expires_at": "2026-10-28T08:06:21.847484Z",
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

`POST /api/driver/v1/offers/92a918c0-fd6f-4641-997c-767d88a4cad4/accept` → **200**

```json
{
  "command_id": "7e1112f1-3058-4e4a-a5e7-ad433f8612eb"
}
```

```json
{
  "id": "e1e669c6-ac16-4c51-9023-649f0d52d18d",
  "order_id": "61003984-14c1-4ca6-9029-04660eb9ab07",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bda07249-1cf8-4015-bf9b-bdaf53eadcef",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bda07249-1cf8-4015-bf9b-bdaf53eadcef",
  "order_id": "61003984-14c1-4ca6-9029-04660eb9ab07",
  "assignment_id": "e1e669c6-ac16-4c51-9023-649f0d52d18d",
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

`POST /api/driver/v1/work-sessions/b3ed0598-fccf-4e3d-94c5-10a349634c65/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:07Z",
    "sequence": 1793174767738
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b3ed0598-fccf-4e3d-94c5-10a349634c65",
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
  "last_heartbeat_at": "2026-10-28T08:06:07.11792Z",
  "last_location_at": "2026-10-28T08:06:07.11792Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bda07249-1cf8-4015-bf9b-bdaf53eadcef/arrive` → **200**

```json
{
  "command_id": "651739e4-9a28-4cfb-ba59-be0ce792b64b",
  "expected_version": 0
}
```

```json
{
  "id": "bda07249-1cf8-4015-bf9b-bdaf53eadcef",
  "order_id": "61003984-14c1-4ca6-9029-04660eb9ab07",
  "assignment_id": "e1e669c6-ac16-4c51-9023-649f0d52d18d",
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
  "arrived_at": "2026-10-28T08:06:07.184698Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bda07249-1cf8-4015-bf9b-bdaf53eadcef/start` → **200**

```json
{
  "command_id": "484e6b33-33f6-4574-aba6-18ced073d3b3",
  "expected_version": 1
}
```

```json
{
  "id": "bda07249-1cf8-4015-bf9b-bdaf53eadcef",
  "order_id": "61003984-14c1-4ca6-9029-04660eb9ab07",
  "assignment_id": "e1e669c6-ac16-4c51-9023-649f0d52d18d",
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
  "arrived_at": "2026-10-28T08:06:07.184698Z",
  "started_at": "2026-10-28T08:06:07.23704Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/bda07249-1cf8-4015-bf9b-bdaf53eadcef/complete` → **200**

```json
{
  "command_id": "256ee503-b79e-4717-a013-05ca2f64e039",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:06:07Z",
  "cash_received": true
}
```

```json
{
  "id": "bda07249-1cf8-4015-bf9b-bdaf53eadcef",
  "order_id": "61003984-14c1-4ca6-9029-04660eb9ab07",
  "assignment_id": "e1e669c6-ac16-4c51-9023-649f0d52d18d",
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
  "arrived_at": "2026-10-28T08:06:07.184698Z",
  "started_at": "2026-10-28T08:06:07.23704Z",
  "completed_at": "2026-10-28T08:06:07.314984Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e30aaf86-b914-4854-8619-1fb8a0a21162",
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
      "id": "6fd87948-72da-4cf9-985f-a085173f0151",
      "at": "2026-10-28T08:06:08.138761Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "61003984-14c1-4ca6-9029-04660eb9ab07"
    },
    {
      "id": "8167dc10-a5a5-4e82-9711-fe3998213204",
      "at": "2026-10-28T08:06:06.217963Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/13a70f3f-b889-4d03-aa00-64770e3d23dd/archive` → **200**

```json
{
  "command_id": "4ff86999-06fe-4262-a6cc-d4962957daf2",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "13a70f3f-b889-4d03-aa00-64770e3d23dd",
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
  "created_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "created_at": "2026-10-28T08:06:05.947955Z",
  "updated_at": "2026-10-28T08:06:10.423042Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b3ed0598-fccf-4e3d-94c5-10a349634c65",
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
  "last_heartbeat_at": "2026-10-28T08:06:07.11792Z",
  "last_location_at": "2026-10-28T08:06:07.11792Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b3ed0598-fccf-4e3d-94c5-10a349634c65/close` → **200**

```json
{
  "command_id": "b76fa597-0efd-464f-99de-cfea09ed880c",
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

Done: order 61003984-14c1-4ca6-9029-04660eb9ab07.

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
  "session_id": "3b7fddae-d971-47dd-b1bc-a4ad4f267094",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2NzAsImlhdCI6MTc5MzE3NDc3MCwianRpIjoiZmZjMGZhYzUtM2RjMC00Mzk4LWI1MDItYTYwMWVkYzQzODM2Iiwic2lkIjoiM2I3ZmRkYWUtZDk3MS00N2RkLWIxYmMtYTRhZDRmMjY3MDk0In0.b4-872T4guMCJIR0LD8jYOD7fTv6JHBYUEmqZkZ-_r4",
  "access_expires_at": "2026-10-28T08:21:10.867166278Z",
  "refresh_token": "ebFsgVR7T-w9FGInlfE0y-HbIusWYKZfyi2EIvv9E2U",
  "refresh_expires_at": "2026-10-28T20:06:10.866031583Z",
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
  "command_id": "36428263-3b40-4021-953d-6046a50f742d",
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
  "session_id": "2ed80b6b-5057-44c9-a702-67d404b83cbb",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2NzEsImlhdCI6MTc5MzE3NDc3MSwianRpIjoiYWQyZWJhYjktYWYxMi00ZWFmLWFkZDItZDdiYWZkZWVkZTczIiwic2lkIjoiMmVkODBiNmItNTA1Ny00NGM5LWE3MDItNjdkNDA0YjgzY2JiIn0.rRvHbDaEXAnpBOOZ-UAFJNA9g7OvHJDkAbW2DOMlzo4",
  "access_expires_at": "2026-10-28T08:21:11.285359256Z",
  "refresh_token": "RpdX_G2ScdMMY9GXWOdBGAqAHcQTm4QrajIZGGlqoOw",
  "refresh_expires_at": "2026-10-28T20:06:11.284340358Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2202522278",
    "linkedid": "1730052700.2202522278",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676641827"
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
    "id": "1730052700.2202522278",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "b4768ae1-7a08-4f5f-a9d0-6d912312d91d",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380676641827",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:06:11.320123Z",
      "answered_at": null,
      "ended_at": "2026-10-28T08:06:11.350841Z",
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
    "id": "1730052600.111522950",
    "linkedid": "1730052600.111522950",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676641827"
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
      "id": "b77a09ca-e0b0-49fd-9ada-1cbd6dd12688",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676641827",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:06:11.433122Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/b77a09ca-e0b0-49fd-9ada-1cbd6dd12688/answer` → **200**

```json
{
  "command_id": "4bb6c073-f2ee-47db-817b-290570fc5927"
}
```

```json
{
  "id": "b77a09ca-e0b0-49fd-9ada-1cbd6dd12688",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676641827",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "order_ids": [],
  "started_at": "2026-10-28T08:06:11.433122Z",
  "answered_at": "2026-10-28T08:06:11.504803Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.111522950",
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
    "id": "1730052600.111522950",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "b77a09ca-e0b0-49fd-9ada-1cbd6dd12688",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676641827",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_ids": [],
      "started_at": "2026-10-28T08:06:11.433122Z",
      "answered_at": "2026-10-28T08:06:11.504803Z",
      "ended_at": "2026-10-28T08:06:11.561542Z",
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
      "id": "b77a09ca-e0b0-49fd-9ada-1cbd6dd12688",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676641827",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_ids": [],
      "started_at": "2026-10-28T08:06:11.433122Z",
      "answered_at": "2026-10-28T08:06:11.504803Z",
      "ended_at": "2026-10-28T08:06:11.561542Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:06:11.958552Z"
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
      "id": "b77a09ca-e0b0-49fd-9ada-1cbd6dd12688",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676641827",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_ids": [],
      "started_at": "2026-10-28T08:06:11.433122Z",
      "answered_at": "2026-10-28T08:06:11.504803Z",
      "ended_at": "2026-10-28T08:06:11.561542Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:06:11.958552Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/b77a09ca-e0b0-49fd-9ada-1cbd6dd12688/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/b77a09ca-e0b0-49fd-9ada-1cbd6dd12688/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=b77a09ca-e0b0-49fd-9ada-1cbd6dd12688` → **200**

```json
{
  "changes": [
    {
      "id": "c7c01259-c855-4aac-9177-3f1845c24485",
      "occurred_at": "2026-10-28T08:06:13.734622Z",
      "actor_type": "STAFF",
      "actor_id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b77a09ca-e0b0-49fd-9ada-1cbd6dd12688",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"27b296b4-8f13-474e-913a-1501cc598527\", \"order_ids\": []}",
      "correlation_id": "0dca7789-3bbe-4047-8dee-03cf6609577a"
    },
    {
      "id": "a7e10ba8-e9b9-448c-b8e1-d72b271591f9",
      "occurred_at": "2026-10-28T08:06:13.69816Z",
      "actor_type": "STAFF",
      "actor_id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b77a09ca-e0b0-49fd-9ada-1cbd6dd12688",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"27b296b4-8f13-474e-913a-1501cc598527\", \"order_ids\": []}",
      "correlation_id": "e1b2cb2a-27b7-4360-a453-f814e8c19edd"
    }
  ]
}
```

Done: call b77a09ca-e0b0-49fd-9ada-1cbd6dd12688 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637969463",
  "device_ref": "sandbox-5131"
}
```

```json
{
  "challenge_id": "14d3828b-55a3-4e55-8c12-cc32bfbf86d6",
  "expires_at": "2026-10-28T08:11:13.816059173Z",
  "resend_available_at": "2026-10-28T08:06:14.816059173Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637969463` → **200**

```json
{
  "phone": "+380637969463",
  "audience": "CLIENT",
  "code": "958716",
  "sent_at": "2026-10-28T08:06:13.819945907Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14d3828b-55a3-4e55-8c12-cc32bfbf86d6",
  "code": "958716",
  "device_ref": "sandbox-5131"
}
```

```json
{
  "session_id": "9104afbf-dbfe-4beb-b943-1fbe0fc7922d",
  "subject": {
    "type": "CLIENT",
    "id": "4138fd51-bd57-45b6-94b7-eb68b805ced2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MTM4ZmQ1MS1iZDU3LTQ1YjYtOTRiNy1lYjY4YjgwNWNlZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NjczLCJpYXQiOjE3OTMxNzQ3NzMsImp0aSI6ImZhZmJlZjQ1LWJhNTEtNDJmNS1hZjI0LTM2ZmY3MDEwZGVmNCIsInNpZCI6IjkxMDRhZmJmLWRiZmUtNGJlYi1iOTQzLTFmYmUwZmM3OTIyZCJ9.NENS3I2bHS-fnBgMu-5VJo3PMCNuHQ2ner8Oa09YlJ4",
  "access_expires_at": "2026-10-28T08:21:13.885609866Z",
  "refresh_token": "bCpmMsALxUbrZC3reUsbawmpzmpV6p2WoO89or8AWJY",
  "refresh_expires_at": "2026-11-27T08:06:13.884914479Z",
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
  "device_ref": "sandbox-6202"
}
```

```json
{
  "challenge_id": "ecb9d549-4657-42c0-8e3c-9783adf44e30",
  "expires_at": "2026-10-28T08:11:13.94786739Z",
  "resend_available_at": "2026-10-28T08:06:14.94786739Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "988475",
  "sent_at": "2026-10-28T08:06:13.95117086Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecb9d549-4657-42c0-8e3c-9783adf44e30",
  "code": "988475",
  "device_ref": "sandbox-6202"
}
```

```json
{
  "session_id": "506357e5-5ac5-43c2-9aa7-480b0c906b97",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTY3NCwiaWF0IjoxNzkzMTc0Nzc0LCJqdGkiOiI5NTNkYWM4ZS0xNWU2LTRlZDctYWUxYy0zZTU4OTk2YTlmZWYiLCJzaWQiOiI1MDYzNTdlNS01YWM1LTQzYzItOWFhNy00ODBiMGM5MDZiOTcifQ.nxtE5sSI_F6Ta02YMULplZDlodjY4f0_oYzPWUAmjvk",
  "access_expires_at": "2026-10-28T08:21:14.015847401Z",
  "refresh_token": "mqPLoHUpYvi8dBk9hEfauZpW3v8IxAx_Ij2W5Ei0nnI",
  "refresh_expires_at": "2026-11-27T08:06:14.015049419Z",
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
  "session_id": "17575a86-db6c-4264-b098-0acb542de149",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2NzQsImlhdCI6MTc5MzE3NDc3NCwianRpIjoiNjk0MjQxZDQtNzY1Yy00NzkyLWJjM2QtYzkzZGZhZjQzMzM4Iiwic2lkIjoiMTc1NzVhODYtZGI2Yy00MjY0LWIwOTgtMGFjYjU0MmRlMTQ5In0.XXhSIGMGv5Yye_n6aU99Dz_c8uIwkJDCn8g7X0RsBwA",
  "access_expires_at": "2026-10-28T08:21:14.374776729Z",
  "refresh_token": "bLHoWmw_xogXZJS1MeSFCiMLb0lMT6sVBA_Qr8wFIfs",
  "refresh_expires_at": "2026-10-28T20:06:14.374072495Z",
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
  "session_id": "65768c19-4578-47d0-b33d-7214775c0ee5",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2NzQsImlhdCI6MTc5MzE3NDc3NCwianRpIjoiOWE1YjhjZTMtYTY0OS00ZjQyLWEyMzAtNGNlYzQzOGNiYmEwIiwic2lkIjoiNjU3NjhjMTktNDU3OC00N2QwLWIzM2QtNzIxNDc3NWMwZWU1In0.Fp61c3ePJME9LP_94zrajvS15xXxipn3TvCpTUx8YTw",
  "access_expires_at": "2026-10-28T08:21:14.701324048Z",
  "refresh_token": "riaHaktZS_lRmKhp8ls7rN7Qvl2RcXcOT72ZNIZPVcE",
  "refresh_expires_at": "2026-10-28T20:06:14.700319009Z",
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
  "command_id": "1a351371-47c7-4446-ad74-932ecef5ce19",
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
  "id": "14fb74e1-4929-4fc2-94c8-07339bdee3d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:11:14.774521Z",
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
  "command_id": "ffc4eb2b-d7b4-4a88-912e-60cc0a3e1f62",
  "quote_id": "14fb74e1-4929-4fc2-94c8-07339bdee3d2",
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
  "id": "daa28887-6bb6-4d48-8f59-d858621f9357",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4138fd51-bd57-45b6-94b7-eb68b805ced2",
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
  "created_at": "2026-10-28T08:06:14.825648Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/daa28887-6bb6-4d48-8f59-d858621f9357` → **200**

```json
{
  "id": "daa28887-6bb6-4d48-8f59-d858621f9357",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4138fd51-bd57-45b6-94b7-eb68b805ced2",
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
  "created_at": "2026-10-28T08:06:14.825648Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/daa28887-6bb6-4d48-8f59-d858621f9357/cancel` → **200**

```json
{
  "command_id": "d32648bf-cdf6-4e48-85fe-5d0551ef574b",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "daa28887-6bb6-4d48-8f59-d858621f9357",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4138fd51-bd57-45b6-94b7-eb68b805ced2",
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
  "created_at": "2026-10-28T08:06:14.825648Z",
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
  "command_id": "b3ff28c3-449e-4407-b47f-a04f9c2b1771",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:14Z",
    "sequence": 1793174774990
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "52419bfa-18d6-424d-8499-37f9b5a2edfa",
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
  "last_heartbeat_at": "2026-10-28T08:06:15.01307Z",
  "last_location_at": "2026-10-28T08:06:15.01307Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-21043"
}
```

```json
{
  "challenge_id": "e547b2c3-cd8b-4c6b-8ac4-2ce402b85e2a",
  "expires_at": "2026-10-28T08:11:15.049278416Z",
  "resend_available_at": "2026-10-28T08:06:16.049278416Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "865907",
  "sent_at": "2026-10-28T08:06:15.052770881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e547b2c3-cd8b-4c6b-8ac4-2ce402b85e2a",
  "code": "865907",
  "device_ref": "sandbox-21043"
}
```

```json
{
  "session_id": "a4ffb3e8-346a-4778-ad71-6d1b5dd1b5b2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTY3NSwiaWF0IjoxNzkzMTc0Nzc1LCJqdGkiOiI4YzVlY2QwMi0xMjE0LTQ5OGMtODZjZS04MzllYzFiMGQ3ZDUiLCJzaWQiOiJhNGZmYjNlOC0zNDZhLTQ3NzgtYWQ3MS02ZDFiNWRkMWI1YjIifQ.6ZuU_Kn_-oCzHcGsSW5xhP2J_Jc7cItSVOQ7ZNKjgak",
  "access_expires_at": "2026-10-28T08:21:15.119986335Z",
  "refresh_token": "-I4EIa4tW8J985yGV0h-AJar_s2KxgTifLT8qGyXKew",
  "refresh_expires_at": "2026-11-27T08:06:15.119196059Z",
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
  "command_id": "d60138a6-f86e-4feb-b913-430ffc24108b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:15Z",
    "sequence": 1793174775180
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "afc8c597-ed22-41cf-ac81-5b4b875c9f01",
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
  "last_heartbeat_at": "2026-10-28T08:06:15.201332Z",
  "last_location_at": "2026-10-28T08:06:15.201332Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "81cfc360-31ea-42eb-a327-b0fae760398f",
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
  "id": "db2d545a-c92c-4e1c-b1de-fa70df21c2a6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:11:15.252425Z",
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
  "command_id": "e421e9e2-cf88-45eb-861e-76144c505d14",
  "quote_id": "db2d545a-c92c-4e1c-b1de-fa70df21c2a6",
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
  "id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4138fd51-bd57-45b6-94b7-eb68b805ced2",
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
  "created_at": "2026-10-28T08:06:15.301123Z",
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
    "id": "241db5ba-7cb5-40d2-94ec-9c34fabf65e4",
    "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
    "expires_at": "2026-10-28T08:06:30.306427Z",
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

`POST /api/driver/v1/offers/241db5ba-7cb5-40d2-94ec-9c34fabf65e4/accept` → **200**

```json
{
  "command_id": "eb26e560-7835-4a8c-b9b1-18606c44926a"
}
```

```json
{
  "id": "d66c0f74-18a6-4dcc-8f48-913d2cbf88a5",
  "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d3176f45-24d8-4b44-8e19-07ef96a2f1c6",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d3176f45-24d8-4b44-8e19-07ef96a2f1c6",
  "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
  "assignment_id": "d66c0f74-18a6-4dcc-8f48-913d2cbf88a5",
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

`POST /api/driver/v1/trips/d3176f45-24d8-4b44-8e19-07ef96a2f1c6/cancel` → **200**

```json
{
  "command_id": "e0a64da5-b55c-45f2-94c8-62b4408495f2",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "d3176f45-24d8-4b44-8e19-07ef96a2f1c6",
  "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
  "assignment_id": "d66c0f74-18a6-4dcc-8f48-913d2cbf88a5",
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

`GET /api/rider/v1/orders/50ee00a1-ee8c-4e57-84b8-2d5348891e2a` → **200**

```json
{
  "id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "4138fd51-bd57-45b6-94b7-eb68b805ced2",
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
    "id": "d66c0f74-18a6-4dcc-8f48-913d2cbf88a5",
    "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d3176f45-24d8-4b44-8e19-07ef96a2f1c6",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:06:15.301123Z",
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
    "id": "52f18806-dd18-471c-9756-0f1bbca3b055",
    "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
    "expires_at": "2026-10-28T08:06:30.474477Z",
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

`POST /api/driver/v1/offers/52f18806-dd18-471c-9756-0f1bbca3b055/accept` → **200**

```json
{
  "command_id": "3c5e32fd-9d26-4c60-80f6-15165138449f"
}
```

```json
{
  "id": "7e8c924c-8825-46d9-aec5-b0078920be99",
  "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a21d8200-7f43-4c9a-b3ad-8e6e9722765b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a21d8200-7f43-4c9a-b3ad-8e6e9722765b",
  "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
  "assignment_id": "7e8c924c-8825-46d9-aec5-b0078920be99",
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

`POST /api/driver/v1/trips/a21d8200-7f43-4c9a-b3ad-8e6e9722765b/cancel` → **200**

```json
{
  "command_id": "0d2860bd-f9e3-41cd-84d7-8c54881a9a6f",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "a21d8200-7f43-4c9a-b3ad-8e6e9722765b",
  "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
  "assignment_id": "7e8c924c-8825-46d9-aec5-b0078920be99",
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
    "id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:06:15.301123Z",
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
    "id": "daa28887-6bb6-4d48-8f59-d858621f9357",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:06:14.825648Z",
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

`GET /api/operator/v1/orders/50ee00a1-ee8c-4e57-84b8-2d5348891e2a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:06:15.302146Z",
      "actor": {
        "type": "CLIENT",
        "id": "4138fd51-bd57-45b6-94b7-eb68b805ced2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
        "quote_id": "db2d545a-c92c-4e1c-b1de-fa70df21c2a6",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:06:15.304932Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
        "attempt_id": "db8c4a23-e740-4c1b-ae41-43c9159bede9",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:06:15.313301Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "241db5ba-7cb5-40d2-94ec-9c34fabf65e4",
        "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:06:15.386229Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "241db5ba-7cb5-40d2-94ec-9c34fabf65e4",
        "order_id": "50ee00a1-ee8c-4e57-84b8-2d5348891e2a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "d66c0f74-18a6-4dcc-8f48-913d2cbf88a5"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders daa28887-6bb6-4d48-8f59-d858621f9357, 50ee00a1-ee8c-4e57-84b8-2d5348891e2a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737609009",
  "device_ref": "sandbox-19758"
}
```

```json
{
  "challenge_id": "cf93bed0-7842-4396-86b0-f24c6dad031e",
  "expires_at": "2026-10-28T08:11:15.770868756Z",
  "resend_available_at": "2026-10-28T08:06:16.770868756Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737609009` → **200**

```json
{
  "phone": "+380737609009",
  "audience": "CLIENT",
  "code": "539393",
  "sent_at": "2026-10-28T08:06:15.773988999Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf93bed0-7842-4396-86b0-f24c6dad031e",
  "code": "539393",
  "device_ref": "sandbox-19758"
}
```

```json
{
  "session_id": "8763fa5a-7767-4c82-9b81-b8d52d60c956",
  "subject": {
    "type": "CLIENT",
    "id": "4e6a92ed-09c1-441b-9a3f-75f7a07ae74a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZTZhOTJlZC0wOWMxLTQ0MWItOWEzZi03NWY3YTA3YWU3NGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1Njc1LCJpYXQiOjE3OTMxNzQ3NzUsImp0aSI6IjUwMjg3YmJjLTdjMjMtNDZhZi1hNjNiLTU4Mjg0ODkzZjg5ZiIsInNpZCI6Ijg3NjNmYTVhLTc3NjctNGM4Mi05YjgxLWI4ZDUyZDYwYzk1NiJ9.TaYWNgU5e1383EAyTOU-GQuYhee45HIjpVQH9MPa5jM",
  "access_expires_at": "2026-10-28T08:21:15.837529755Z",
  "refresh_token": "uOwj6zaX_R96gg2B1jHw1LDGcF3LwvhDGXSL-lxYBHg",
  "refresh_expires_at": "2026-11-27T08:06:15.83673959Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "039bed98-5dfe-4b64-b2e8-02829adaabaa",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "01acb99d-3a76-4103-8343-7b2856573319",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-01acb99d-3a76-4103-8343-7b2856573319",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "8085ac258e6357ddf03138f612f8d68f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=01acb99d-3a76-4103-8343-7b2856573319",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737609009"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=01acb99d-3a76-4103-8343-7b2856573319",
  "expires_at": "2026-10-28T08:36:15.877593Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/01acb99d-3a76-4103-8343-7b2856573319` → **200**

```json
{
  "id": "01acb99d-3a76-4103-8343-7b2856573319",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T08:36:15.877593Z",
  "card": {
    "id": "fe699810-6997-4cf9-9209-63888bb1962f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2375",
    "card_type": "Visa",
    "created_at": "2026-10-28T08:06:15.931794Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "fe699810-6997-4cf9-9209-63888bb1962f",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2375",
      "card_type": "Visa",
      "created_at": "2026-10-28T08:06:15.931794Z"
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
  "device_ref": "sandbox-15577"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "a3faf886-4479-44df-8140-8c7434fff588",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-15577"
}
```

```json
{
  "challenge_id": "e19c2f10-e662-4c52-ba5d-f421c5ebf920",
  "expires_at": "2026-10-28T08:11:17.061873014Z",
  "resend_available_at": "2026-10-28T08:06:18.061873014Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "925226",
  "sent_at": "2026-10-28T08:06:17.06562802Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e19c2f10-e662-4c52-ba5d-f421c5ebf920",
  "code": "925226",
  "device_ref": "sandbox-15577"
}
```

```json
{
  "session_id": "06fe55f3-335d-4179-b8c0-d2270d73612e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTY3NywiaWF0IjoxNzkzMTc0Nzc3LCJqdGkiOiJmNmFiNTEzMS00MWQ3LTQ1MmUtYWMzNy01YjBjNWI4OWU0OGIiLCJzaWQiOiIwNmZlNTVmMy0zMzVkLTQxNzktYjhjMC1kMjI3MGQ3MzYxMmUifQ.kuyztNpt2PYvG-ANIkmcXD-fvzMaI5x1V1YufVUtaHQ",
  "access_expires_at": "2026-10-28T08:21:17.132017954Z",
  "refresh_token": "99V8fNRVk8vHSOhe_foqA4hu0kj3jT_kJy1Xxqr8dII",
  "refresh_expires_at": "2026-11-27T08:06:17.131212297Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "afc8c597-ed22-41cf-ac81-5b4b875c9f01",
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
  "last_heartbeat_at": "2026-10-28T08:06:15.201332Z",
  "last_location_at": "2026-10-28T08:06:15.201332Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/afc8c597-ed22-41cf-ac81-5b4b875c9f01/handover` → **200**

```json
{
  "command_id": "271d94b8-dc7d-447d-b86a-bc4741522fa6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "afc8c597-ed22-41cf-ac81-5b4b875c9f01",
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
  "last_heartbeat_at": "2026-10-28T08:06:15.201332Z",
  "last_location_at": "2026-10-28T08:06:15.201332Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/afc8c597-ed22-41cf-ac81-5b4b875c9f01/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:17Z",
    "sequence": 1793174777238
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "afc8c597-ed22-41cf-ac81-5b4b875c9f01",
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
  "last_heartbeat_at": "2026-10-28T08:06:17.260225Z",
  "last_location_at": "2026-10-28T08:06:17.260225Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cadf883d-213c-4209-83f8-2c0ee012e5cd",
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
  "id": "ec886c1c-d2bb-485a-9d7b-59cc24d248f6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-28T08:11:17.303552Z",
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
  "command_id": "10b6e16d-c9a8-4542-bfbb-697c2822cd34",
  "quote_id": "ec886c1c-d2bb-485a-9d7b-59cc24d248f6",
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
  "id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4e6a92ed-09c1-441b-9a3f-75f7a07ae74a",
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
  "created_at": "2026-10-28T08:06:17.348908Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/18c296a8-8d29-4808-af0c-17148d49e5ca` → **200**

```json
{
  "id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4e6a92ed-09c1-441b-9a3f-75f7a07ae74a",
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
  "created_at": "2026-10-28T08:06:17.348908Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/18c296a8-8d29-4808-af0c-17148d49e5ca` → **200**

```json
{
  "id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4e6a92ed-09c1-441b-9a3f-75f7a07ae74a",
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
  "created_at": "2026-10-28T08:06:17.348908Z",
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
    "id": "9a392e74-2edb-4370-9e00-2b380c302df8",
    "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
    "expires_at": "2026-10-28T08:06:33.280887Z",
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

`POST /api/driver/v1/offers/9a392e74-2edb-4370-9e00-2b380c302df8/accept` → **200**

```json
{
  "command_id": "64e45a9a-b8f7-4a99-8398-01b925cd818d"
}
```

```json
{
  "id": "10e08c7d-d773-46b0-a532-feac0d7b338a",
  "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "be27c783-1c66-459f-a14c-40d355496d96",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "be27c783-1c66-459f-a14c-40d355496d96",
  "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
  "assignment_id": "10e08c7d-d773-46b0-a532-feac0d7b338a",
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

`POST /api/driver/v1/work-sessions/afc8c597-ed22-41cf-ac81-5b4b875c9f01/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:18Z",
    "sequence": 1793174778541
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "afc8c597-ed22-41cf-ac81-5b4b875c9f01",
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
  "last_heartbeat_at": "2026-10-28T08:06:18.563158Z",
  "last_location_at": "2026-10-28T08:06:18.563158Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/be27c783-1c66-459f-a14c-40d355496d96/arrive` → **200**

```json
{
  "command_id": "fbdb3e46-2704-447a-88fd-47bdaf6a939e",
  "expected_version": 0
}
```

```json
{
  "id": "be27c783-1c66-459f-a14c-40d355496d96",
  "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
  "assignment_id": "10e08c7d-d773-46b0-a532-feac0d7b338a",
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
  "arrived_at": "2026-10-28T08:06:18.603366Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/be27c783-1c66-459f-a14c-40d355496d96/start` → **200**

```json
{
  "command_id": "15861a45-f8fa-4c3e-ac6e-d96e9804a537",
  "expected_version": 1
}
```

```json
{
  "id": "be27c783-1c66-459f-a14c-40d355496d96",
  "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
  "assignment_id": "10e08c7d-d773-46b0-a532-feac0d7b338a",
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
  "arrived_at": "2026-10-28T08:06:18.603366Z",
  "started_at": "2026-10-28T08:06:18.64741Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/be27c783-1c66-459f-a14c-40d355496d96/complete` → **200**

```json
{
  "command_id": "0364ebeb-46dd-4074-961e-d633c313f917",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:06:18Z"
}
```

```json
{
  "id": "be27c783-1c66-459f-a14c-40d355496d96",
  "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
  "assignment_id": "10e08c7d-d773-46b0-a532-feac0d7b338a",
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
  "arrived_at": "2026-10-28T08:06:18.603366Z",
  "started_at": "2026-10-28T08:06:18.64741Z",
  "completed_at": "2026-10-28T08:06:18.696091Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/18c296a8-8d29-4808-af0c-17148d49e5ca` → **200**

```json
{
  "id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4e6a92ed-09c1-441b-9a3f-75f7a07ae74a",
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
    "id": "10e08c7d-d773-46b0-a532-feac0d7b338a",
    "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "be27c783-1c66-459f-a14c-40d355496d96",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:06:17.348908Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/18c296a8-8d29-4808-af0c-17148d49e5ca` → **200**

```json
{
  "id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4e6a92ed-09c1-441b-9a3f-75f7a07ae74a",
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
    "id": "10e08c7d-d773-46b0-a532-feac0d7b338a",
    "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "be27c783-1c66-459f-a14c-40d355496d96",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:06:17.348908Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/18c296a8-8d29-4808-af0c-17148d49e5ca` → **200**

```json
{
  "id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "4e6a92ed-09c1-441b-9a3f-75f7a07ae74a",
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
    "id": "10e08c7d-d773-46b0-a532-feac0d7b338a",
    "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "be27c783-1c66-459f-a14c-40d355496d96",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:06:17.348908Z",
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
      "id": "e852f5ed-8e3f-480d-95ed-75829a9b22f0",
      "at": "2026-10-28T08:06:19.321248Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/18c296a8-8d29-4808-af0c-17148d49e5ca/tip` → **200**

```json
{
  "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
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
  "available_until": "2026-10-29T08:06:18.696091Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/18c296a8-8d29-4808-af0c-17148d49e5ca/tip` → **201**

```json
{
  "command_id": "e23008c6-89db-471b-aec6-8517a67ca871",
  "amount_minor": 2500
}
```

```json
{
  "id": "87b760db-7cd5-4cb1-8afc-f5b5efe80b64",
  "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T08:06:20.93454Z"
}
```

`GET /api/rider/v1/orders/18c296a8-8d29-4808-af0c-17148d49e5ca/tip` → **200**

```json
{
  "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
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
  "available_until": "2026-10-29T08:06:18.696091Z",
  "open": false,
  "tip": {
    "id": "87b760db-7cd5-4cb1-8afc-f5b5efe80b64",
    "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T08:06:20.93454Z"
  }
}
```

`GET /api/rider/v1/orders/18c296a8-8d29-4808-af0c-17148d49e5ca/tip` → **200**

```json
{
  "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
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
  "available_until": "2026-10-29T08:06:18.696091Z",
  "open": false,
  "tip": {
    "id": "87b760db-7cd5-4cb1-8afc-f5b5efe80b64",
    "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T08:06:20.93454Z"
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
      "id": "e852f5ed-8e3f-480d-95ed-75829a9b22f0",
      "at": "2026-10-28T08:06:19.321248Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
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
      "id": "bca15218-bbd3-47f0-987c-c6838156ac8e",
      "at": "2026-10-28T08:06:22.380836Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
      "counterpart_id": null
    },
    {
      "id": "e852f5ed-8e3f-480d-95ed-75829a9b22f0",
      "at": "2026-10-28T08:06:19.321248Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "18c296a8-8d29-4808-af0c-17148d49e5ca",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "afc8c597-ed22-41cf-ac81-5b4b875c9f01",
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
  "last_heartbeat_at": "2026-10-28T08:06:18.563158Z",
  "last_location_at": "2026-10-28T08:06:18.563158Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/afc8c597-ed22-41cf-ac81-5b4b875c9f01/close` → **200**

```json
{
  "command_id": "5582f12c-f965-4bc0-9d0c-b71bb3faed43",
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

Done: card order 18c296a8-8d29-4808-af0c-17148d49e5ca.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736624154",
  "device_ref": "sandbox-10909"
}
```

```json
{
  "challenge_id": "16ed6f60-8619-49a6-b89a-5e841e9028ea",
  "expires_at": "2026-10-28T08:11:23.177336038Z",
  "resend_available_at": "2026-10-28T08:06:24.177336038Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736624154` → **200**

```json
{
  "phone": "+380736624154",
  "audience": "CLIENT",
  "code": "622517",
  "sent_at": "2026-10-28T08:06:23.180483084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16ed6f60-8619-49a6-b89a-5e841e9028ea",
  "code": "622517",
  "device_ref": "sandbox-10909"
}
```

```json
{
  "session_id": "e463be11-2803-497c-9857-df2e6f261c65",
  "subject": {
    "type": "CLIENT",
    "id": "f43b07a1-32c3-4a04-a6b4-e1d0b377022d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNDNiMDdhMS0zMmMzLTRhMDQtYTZiNC1lMWQwYjM3NzAyMmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NjgzLCJpYXQiOjE3OTMxNzQ3ODMsImp0aSI6IjhmMmI1NjhiLThhNTgtNDU0Zi1hNDBkLWI2ZjEyMWNjNGU4MiIsInNpZCI6ImU0NjNiZTExLTI4MDMtNDk3Yy05ODU3LWRmMmU2ZjI2MWM2NSJ9._YD-G9LMNAoHIx1-Iof4tujfS3BuESnJQPEtsdvjCYU",
  "access_expires_at": "2026-10-28T08:21:23.244107664Z",
  "refresh_token": "lGJ-8mLkhncEWtMVw1m6LI4zhEl9CYh0zNoWimp7JbQ",
  "refresh_expires_at": "2026-11-27T08:06:23.243389374Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "b4e225fc-24fa-41ec-afbb-4cbeb193ba43",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "34e8a7f7-e208-40aa-94d7-dd68ca0f08b2",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-34e8a7f7-e208-40aa-94d7-dd68ca0f08b2",
    "orderDate": "1793174783",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "3e9f315dbe3a9be89aae2f14521717a9",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=34e8a7f7-e208-40aa-94d7-dd68ca0f08b2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736624154"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=34e8a7f7-e208-40aa-94d7-dd68ca0f08b2",
  "created_at": "2026-10-28T08:06:23.285723Z",
  "expires_at": "2026-10-28T08:36:23.285723Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/34e8a7f7-e208-40aa-94d7-dd68ca0f08b2` → **200**

```json
{
  "id": "34e8a7f7-e208-40aa-94d7-dd68ca0f08b2",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T08:06:23.285723Z",
  "expires_at": "2026-10-28T08:36:23.285723Z",
  "completed_at": "2026-10-28T08:06:23.328008Z",
  "masked_pan": "41****6367",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f43b07a1-32c3-4a04-a6b4-e1d0b377022d",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f43b07a1-32c3-4a04-a6b4-e1d0b377022d",
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
      "id": "0ef2196a-1fb1-46e1-9149-928a1d808b7e",
      "at": "2026-10-28T08:06:23.392709Z",
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
  "client_id": "f43b07a1-32c3-4a04-a6b4-e1d0b377022d",
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
      "id": "0ef2196a-1fb1-46e1-9149-928a1d808b7e",
      "at": "2026-10-28T08:06:23.392709Z",
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
  "device_ref": "sandbox-23213"
}
```

```json
{
  "challenge_id": "641260b5-b12c-470c-9c57-7fd5e49e31a2",
  "expires_at": "2026-10-28T08:11:24.472967641Z",
  "resend_available_at": "2026-10-28T08:06:25.472967641Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "984436",
  "sent_at": "2026-10-28T08:06:24.475968562Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "641260b5-b12c-470c-9c57-7fd5e49e31a2",
  "code": "984436",
  "device_ref": "sandbox-23213"
}
```

```json
{
  "session_id": "5997ace7-f3f0-459e-9cc1-fd930060ce89",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTY4NCwiaWF0IjoxNzkzMTc0Nzg0LCJqdGkiOiI5NTM4NDc1OS03NDMxLTQ4MDUtOTcxNy0yOWRjNjI2ZGRhODIiLCJzaWQiOiI1OTk3YWNlNy1mM2YwLTQ1OWUtOWNjMS1mZDkzMDA2MGNlODkifQ.n0n3U41VJIUOeuP8pR8prIoqcdpsMFRkxKmrPg0jFw4",
  "access_expires_at": "2026-10-28T08:21:24.537042861Z",
  "refresh_token": "Hq65TXSH0hVNk-DNsBDZJ_lVZMo2eBGEGi1tF7m-yIQ",
  "refresh_expires_at": "2026-11-27T08:06:24.536289192Z",
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
  "command_id": "9e7c9b2e-f12a-4599-bc13-04dde18ffd5f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "912dfbe7-3fa3-4106-91c0-7fd2b85b3f54",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-912dfbe7-3fa3-4106-91c0-7fd2b85b3f54",
    "orderDate": "1793174784",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "bd4943e5b4eff7b2318c514e558512df",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=912dfbe7-3fa3-4106-91c0-7fd2b85b3f54",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=912dfbe7-3fa3-4106-91c0-7fd2b85b3f54",
  "created_at": "2026-10-28T08:06:24.597021Z",
  "expires_at": "2026-10-28T08:36:24.597021Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/912dfbe7-3fa3-4106-91c0-7fd2b85b3f54` → **200**

```json
{
  "id": "912dfbe7-3fa3-4106-91c0-7fd2b85b3f54",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T08:06:24.597021Z",
  "expires_at": "2026-10-28T08:36:24.597021Z",
  "completed_at": "2026-10-28T08:06:24.631905Z",
  "masked_pan": "41****0416",
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
      "id": "f82af85c-5591-45a0-9019-c5d34eec75bb",
      "at": "2026-10-28T08:06:25.405059Z",
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
  "command_id": "e3fd4555-b2d2-44ac-aee4-66e227d65984",
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
  "correlation_id": "195ca4d8-8005-40a0-8dc8-e040e630a1c3"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675568345",
  "device_ref": "sandbox-21579"
}
```

```json
{
  "challenge_id": "5d2723da-b7aa-4f92-8dca-861628a1c29c",
  "expires_at": "2026-10-28T08:11:25.785257598Z",
  "resend_available_at": "2026-10-28T08:06:26.785257598Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675568345` → **200**

```json
{
  "phone": "+380675568345",
  "audience": "CLIENT",
  "code": "025359",
  "sent_at": "2026-10-28T08:06:25.788730096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d2723da-b7aa-4f92-8dca-861628a1c29c",
  "code": "025359",
  "device_ref": "sandbox-21579"
}
```

```json
{
  "session_id": "a8a14f6d-a722-496c-b6b2-f9bae65ea4f7",
  "subject": {
    "type": "CLIENT",
    "id": "264ccad5-797a-4021-b654-0d690cea3605"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNjRjY2FkNS03OTdhLTQwMjEtYjY1NC0wZDY5MGNlYTM2MDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1Njg1LCJpYXQiOjE3OTMxNzQ3ODUsImp0aSI6IjUxMWQwMjQ3LTdiM2UtNDEzMi1iNjg4LTQ2MTc1ZDFkMGIyOCIsInNpZCI6ImE4YTE0ZjZkLWE3MjItNDk2Yy1iNmIyLWY5YmFlNjVlYTRmNyJ9.MoUnO7XMqdj0kmqDB9xTc-f45f4xTs-gcHcHDu3OY-0",
  "access_expires_at": "2026-10-28T08:21:25.849615397Z",
  "refresh_token": "OL2-z9tHEw1XrI16qCcdXZTnpBUKoEERe64Ae2rtkDM",
  "refresh_expires_at": "2026-11-27T08:06:25.848989052Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "264ccad5-797a-4021-b654-0d690cea3605",
  "session_id": "a8a14f6d-a722-496c-b6b2-f9bae65ea4f7",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ad7b75b3-042c-43e6-8056-3c3fe2c1e314",
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
  "id": "665e5bc4-eab4-4231-a893-28e995b7b781",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:11:25.914261Z",
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
  "challenge_id": "7c786a97-00b2-4d91-8fdd-f3f96ecef6bc",
  "expires_at": "2026-10-28T08:11:27.954351723Z",
  "resend_available_at": "2026-10-28T08:06:28.954351723Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675568345` → **200**

```json
{
  "phone": "+380675568345",
  "audience": "CLIENT",
  "code": "164035",
  "sent_at": "2026-10-28T08:06:27.957148821Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "f475c4e6-ad43-4447-9740-5a07cbbb7747",
  "challenge_id": "7c786a97-00b2-4d91-8fdd-f3f96ecef6bc",
  "otp_code": "164035"
}
```

```json
{
  "client_id": "264ccad5-797a-4021-b654-0d690cea3605",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T08:06:28.03076432Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "d31f769f-8c89-4ce3-acbb-9974a0fd8c52",
  "quote_id": "665e5bc4-eab4-4231-a893-28e995b7b781",
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
  "correlation_id": "d0d8099a-5bc4-448d-a6dc-037089320c40"
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
  "session_id": "0ef3b3ba-4a26-4ec6-8be2-7fbd695608c7",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2ODgsImlhdCI6MTc5MzE3NDc4OCwianRpIjoiM2FlNGY2ZTgtYzNiYy00NWQ0LWE2NjAtYzRhMGEwNGRjMThjIiwic2lkIjoiMGVmM2IzYmEtNGEyNi00ZWM2LThiZTItN2ZiZDY5NTYwOGM3In0.0Y-6ZAEi63Yz4JyCNlOu1yLQ6BWmknLgghXcEmB19tA",
  "access_expires_at": "2026-10-28T08:21:28.407735514Z",
  "refresh_token": "P4TpOgyIWNU4YFhVX0FhbXgcEWd_kWI_QCuRvwYvVFE",
  "refresh_expires_at": "2026-10-28T20:06:28.407013116Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "264ccad5-797a-4021-b654-0d690cea3605",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T08:06:28.030764Z",
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

`POST /api/admin/v1/client-deletions/264ccad5-797a-4021-b654-0d690cea3605/complete` → **200**

```json
{
  "command_id": "444a3c9c-6031-4741-9644-ab154d4a2bda",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "264ccad5-797a-4021-b654-0d690cea3605",
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
  "correlation_id": "a0bab8e8-7e3d-426f-a7b0-262103a5403b"
}
```

Done: client 264ccad5-797a-4021-b654-0d690cea3605 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662045057",
  "device_ref": "sandbox-9151"
}
```

```json
{
  "challenge_id": "e4ccdcae-a9b3-4aa7-ae0a-06e1224c8f47",
  "expires_at": "2026-10-28T08:11:28.575359492Z",
  "resend_available_at": "2026-10-28T08:06:29.575359492Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662045057` → **200**

```json
{
  "phone": "+380662045057",
  "audience": "CLIENT",
  "code": "655455",
  "sent_at": "2026-10-28T08:06:28.578522558Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4ccdcae-a9b3-4aa7-ae0a-06e1224c8f47",
  "code": "655455",
  "device_ref": "sandbox-9151"
}
```

```json
{
  "session_id": "efac7b6f-2d0c-4acf-9615-1e1eac1694f2",
  "subject": {
    "type": "CLIENT",
    "id": "b6b1dbf7-8be0-4838-8439-3233913088c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNmIxZGJmNy04YmUwLTQ4MzgtODQzOS0zMjMzOTEzMDg4YzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1Njg4LCJpYXQiOjE3OTMxNzQ3ODgsImp0aSI6ImQ4Yzc0MzE5LTJiMTEtNDlkOS04MWEzLWQxODc5NzM5NTk2OSIsInNpZCI6ImVmYWM3YjZmLTJkMGMtNGFjZi05NjE1LTFlMWVhYzE2OTRmMiJ9.aEqvlzrAtQ2ILgnJ0wRrXHzTh8pXr_ZuDHa8YR9pvFQ",
  "access_expires_at": "2026-10-28T08:21:28.646802326Z",
  "refresh_token": "fJgYPWTa8u5_6luw_tPIwGtpd74Dpsq44WIYNCrIo6I",
  "refresh_expires_at": "2026-11-27T08:06:28.646049408Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b6b1dbf7-8be0-4838-8439-3233913088c6",
  "session_id": "efac7b6f-2d0c-4acf-9615-1e1eac1694f2",
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
  "session_id": "92d00808-4de5-4b3c-9bce-214f4b070c15",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2ODksImlhdCI6MTc5MzE3NDc4OSwianRpIjoiYzk3OWNlYWQtOTRmMi00YzllLTk3NTQtYTRjMDQ3MGY5NjI1Iiwic2lkIjoiOTJkMDA4MDgtNGRlNS00YjNjLTliY2UtMjE0ZjRiMDcwYzE1In0.KaSc7_u1bbt2QgZxjELJeX-SbOu85x_kzFkZ7c74eZI",
  "access_expires_at": "2026-10-28T08:21:29.007563477Z",
  "refresh_token": "bKBYcXA-GUF1rzKneDwK_m-dnQjckoiLgE46QA8F3To",
  "refresh_expires_at": "2026-10-28T20:06:29.00691613Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2045057&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "b6b1dbf7-8be0-4838-8439-3233913088c6",
      "phone": "+380662045057",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T08:06:28.64352Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/b6b1dbf7-8be0-4838-8439-3233913088c6` → **200**

```json
{
  "client": {
    "id": "b6b1dbf7-8be0-4838-8439-3233913088c6",
    "phone": "+380662045057",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T08:06:28.64352Z",
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

`POST /api/admin/v1/clients/b6b1dbf7-8be0-4838-8439-3233913088c6/block` → **400**

```json
{
  "command_id": "6379d0cd-2e78-4fe9-8b49-980e4dfe6069",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/b6b1dbf7-8be0-4838-8439-3233913088c6/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e2bfe2ee-ba65-4837-b7ee-54d4b7ddbb23",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/b6b1dbf7-8be0-4838-8439-3233913088c6/block` → **200**

```json
{
  "command_id": "1cb41cef-3e68-4f65-b416-31ce2d6fc88b",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "b6b1dbf7-8be0-4838-8439-3233913088c6",
  "phone": "+380662045057",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T08:06:28.64352Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T08:06:29.204727Z",
    "by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
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
  "correlation_id": "bf52cf5f-0703-4b05-94c1-080fe1a371dd"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662045057",
  "device_ref": "sandbox-90"
}
```

```json
{
  "challenge_id": "d3764257-b62b-4313-86d0-13eba57e0e71",
  "expires_at": "2026-10-28T08:11:31.272728897Z",
  "resend_available_at": "2026-10-28T08:06:32.272728897Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662045057` → **200**

```json
{
  "phone": "+380662045057",
  "audience": "CLIENT",
  "code": "501331",
  "sent_at": "2026-10-28T08:06:31.276005628Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "d3764257-b62b-4313-86d0-13eba57e0e71",
  "code": "501331",
  "device_ref": "sandbox-90"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "aff9f812-b357-4048-a013-d7f245deca09"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/b6b1dbf7-8be0-4838-8439-3233913088c6` → **200**

```json
{
  "client": {
    "id": "b6b1dbf7-8be0-4838-8439-3233913088c6",
    "phone": "+380662045057",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T08:06:28.64352Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T08:06:29.204727Z",
      "by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
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

`POST /api/admin/v1/clients/b6b1dbf7-8be0-4838-8439-3233913088c6/unblock` → **200**

```json
{
  "command_id": "6518ee62-98a6-4a6d-9369-18fdb50cbbfd",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "b6b1dbf7-8be0-4838-8439-3233913088c6",
  "phone": "+380662045057",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T08:06:28.64352Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662045057",
  "device_ref": "sandbox-8492"
}
```

```json
{
  "challenge_id": "996eae99-e523-4da7-93c0-2ef7fba98292",
  "expires_at": "2026-10-28T08:11:33.435789907Z",
  "resend_available_at": "2026-10-28T08:06:34.435789907Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662045057` → **200**

```json
{
  "phone": "+380662045057",
  "audience": "CLIENT",
  "code": "074237",
  "sent_at": "2026-10-28T08:06:33.438769548Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "996eae99-e523-4da7-93c0-2ef7fba98292",
  "code": "074237",
  "device_ref": "sandbox-8492"
}
```

```json
{
  "session_id": "9257cb86-1294-436a-82de-1ae88165757c",
  "subject": {
    "type": "CLIENT",
    "id": "b6b1dbf7-8be0-4838-8439-3233913088c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNmIxZGJmNy04YmUwLTQ4MzgtODQzOS0zMjMzOTEzMDg4YzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NjkzLCJpYXQiOjE3OTMxNzQ3OTMsImp0aSI6IjQxNWY0NGIzLTAxOWItNDc1NS05ZjQwLWEzMGExNGRmZjQwZiIsInNpZCI6IjkyNTdjYjg2LTEyOTQtNDM2YS04MmRlLTFhZTg4MTY1NzU3YyJ9.f_xwkO6Yw5A08j0ol_YMN-lqncG3qb1zdxeTQItsZf4",
  "access_expires_at": "2026-10-28T08:21:33.502752096Z",
  "refresh_token": "_3jx2bTFgIzxlHHbefqjNaUUdSpc2knNDjDe4Ms1Th8",
  "refresh_expires_at": "2026-11-27T08:06:33.501958967Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b6b1dbf7-8be0-4838-8439-3233913088c6",
  "session_id": "9257cb86-1294-436a-82de-1ae88165757c",
  "account_state": "ACTIVE"
}
```

Done: found, blocked (signed out, sign-in refused) and unblocked.

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638889396",
  "device_ref": "sandbox-14708"
}
```

```json
{
  "challenge_id": "98fdf2e2-0915-4d58-8b94-bf58e2e763bc",
  "expires_at": "2026-10-28T08:11:33.574196504Z",
  "resend_available_at": "2026-10-28T08:06:34.574196504Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638889396` → **200**

```json
{
  "phone": "+380638889396",
  "audience": "CLIENT",
  "code": "384068",
  "sent_at": "2026-10-28T08:06:33.576950671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98fdf2e2-0915-4d58-8b94-bf58e2e763bc",
  "code": "384068",
  "device_ref": "sandbox-14708"
}
```

```json
{
  "session_id": "affcae4e-e492-4aa0-bb14-6500910a7ed6",
  "subject": {
    "type": "CLIENT",
    "id": "da72bddb-5445-42ab-bdde-ac05d2df6c26"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTcyYmRkYi01NDQ1LTQyYWItYmRkZS1hYzA1ZDJkZjZjMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NjkzLCJpYXQiOjE3OTMxNzQ3OTMsImp0aSI6ImRiYTYyOGQxLTk0NTUtNDc3OS1hODk3LTg3MTlmM2UyMjYwMSIsInNpZCI6ImFmZmNhZTRlLWU0OTItNGFhMC1iYjE0LTY1MDA5MTBhN2VkNiJ9.5vmXtdEvOHMZLbV4w6wVbi2seVVbzytu5yxELTNmHTU",
  "access_expires_at": "2026-10-28T08:21:33.639437993Z",
  "refresh_token": "sYIeeo66s2EyU7ThYu_AVxwYfXWT2id3xNig7hhejro",
  "refresh_expires_at": "2026-11-27T08:06:33.638884682Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "7161daea-8593-41f7-82d5-a726f66e1fef",
  "expires_at": "2026-10-28T08:11:35.672798397Z",
  "resend_available_at": "2026-10-28T08:06:36.672798397Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638889396` → **200**

```json
{
  "phone": "+380638889396",
  "audience": "CLIENT",
  "code": "676848",
  "sent_at": "2026-10-28T08:06:35.675080357Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "5be71781-95fd-4dd6-b3d8-a6f9cf60fe74",
  "challenge_id": "7161daea-8593-41f7-82d5-a726f66e1fef",
  "otp_code": "676848"
}
```

```json
{
  "id": "53d7ae73-1beb-4885-9f10-32d4ac07fe14",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:35.744315Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/53d7ae73-1beb-4885-9f10-32d4ac07fe14` → **200**

```json
{
  "id": "53d7ae73-1beb-4885-9f10-32d4ac07fe14",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:35.744315Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/53d7ae73-1beb-4885-9f10-32d4ac07fe14` → **200**

```json
{
  "id": "53d7ae73-1beb-4885-9f10-32d4ac07fe14",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:35.744315Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/53d7ae73-1beb-4885-9f10-32d4ac07fe14` → **200**

```json
{
  "id": "53d7ae73-1beb-4885-9f10-32d4ac07fe14",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:35.744315Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/53d7ae73-1beb-4885-9f10-32d4ac07fe14` → **200**

```json
{
  "id": "53d7ae73-1beb-4885-9f10-32d4ac07fe14",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:35.744315Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/53d7ae73-1beb-4885-9f10-32d4ac07fe14` → **200**

```json
{
  "id": "53d7ae73-1beb-4885-9f10-32d4ac07fe14",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:35.744315Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/53d7ae73-1beb-4885-9f10-32d4ac07fe14` → **200**

```json
{
  "id": "53d7ae73-1beb-4885-9f10-32d4ac07fe14",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:35.744315Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/53d7ae73-1beb-4885-9f10-32d4ac07fe14` → **200**

```json
{
  "id": "53d7ae73-1beb-4885-9f10-32d4ac07fe14",
  "state": "RUNNING",
  "created_at": "2026-10-28T08:06:35.744315Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/53d7ae73-1beb-4885-9f10-32d4ac07fe14` → **200**

```json
{
  "id": "53d7ae73-1beb-4885-9f10-32d4ac07fe14",
  "state": "READY",
  "created_at": "2026-10-28T08:06:35.744315Z",
  "ready_at": "2026-10-28T08:06:41.966527Z",
  "expires_at": "2026-11-04T08:06:41.966527Z",
  "size_bytes": 1029
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/53d7ae73-1beb-4885-9f10-32d4ac07fe14/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631617204",
  "device_ref": "sandbox-29698"
}
```

```json
{
  "challenge_id": "48da265e-8537-4102-89c0-322a27f89791",
  "expires_at": "2026-10-28T08:11:43.033099373Z",
  "resend_available_at": "2026-10-28T08:06:44.033099373Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631617204` → **200**

```json
{
  "phone": "+380631617204",
  "audience": "CLIENT",
  "code": "369907",
  "sent_at": "2026-10-28T08:06:43.036038038Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48da265e-8537-4102-89c0-322a27f89791",
  "code": "369907",
  "device_ref": "sandbox-29698"
}
```

```json
{
  "session_id": "dd200f29-1167-416a-a916-32e0d5419b10",
  "subject": {
    "type": "CLIENT",
    "id": "ffc5607d-cd81-459e-aaed-b5730a1f0f57"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZmM1NjA3ZC1jZDgxLTQ1OWUtYWFlZC1iNTczMGExZjBmNTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzAzLCJpYXQiOjE3OTMxNzQ4MDMsImp0aSI6IjAxMDAwY2NiLTZjMWMtNDI5My04ZDE4LTNmMzU3MGVlYTY3MSIsInNpZCI6ImRkMjAwZjI5LTExNjctNDE2YS1hOTE2LTMyZTBkNTQxOWIxMCJ9.mLBSwZ5vTu_EK1uXys-1OLQebqJ8ucADenqLYT8tJAM",
  "access_expires_at": "2026-10-28T08:21:43.098343523Z",
  "refresh_token": "3oNhHuuEAeB3Pwr97oGaUrgCj4ts-PDk4I3ZelXa6Lo",
  "refresh_expires_at": "2026-11-27T08:06:43.097765116Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/53d7ae73-1beb-4885-9f10-32d4ac07fe14/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/53d7ae73-1beb-4885-9f10-32d4ac07fe14/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "726d8540-acd5-455e-91d3-e8df8db709da"
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
  "session_id": "5857097b-db63-417c-b14a-dc62f49d0515",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MDMsImlhdCI6MTc5MzE3NDgwMywianRpIjoiZmM4YzE3NzItOTk4MS00MDY4LTk5N2YtZGUxMzlkZWYyNTliIiwic2lkIjoiNTg1NzA5N2ItZGI2My00MTdjLWIxNGEtZGM2MmY0OWQwNTE1In0.tKzfT5xspL_KSoXjqmV8IB44TXFBCPHusHm0o-Zm-iA",
  "access_expires_at": "2026-10-28T08:21:43.454615142Z",
  "refresh_token": "8PEcMqnhLWc3hm_QPTKRuv2hwsiBW6DGPq7TtjmdBig",
  "refresh_expires_at": "2026-10-28T20:06:43.454064467Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "da72bddb-5445-42ab-bdde-ac05d2df6c26",
  "session_id": "affcae4e-e492-4aa0-bb14-6500910a7ed6",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/da72bddb-5445-42ab-bdde-ac05d2df6c26/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "53d7ae73-1beb-4885-9f10-32d4ac07fe14",
      "state": "READY",
      "created_at": "2026-10-28T08:06:35.744315Z",
      "ready_at": "2026-10-28T08:06:41.966527Z",
      "expires_at": "2026-11-04T08:06:41.966527Z",
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
  "device_ref": "sandbox-24116"
}
```

```json
{
  "challenge_id": "861efa1c-6f00-48c1-8413-b4346009881b",
  "expires_at": "2026-10-28T08:11:43.559479876Z",
  "resend_available_at": "2026-10-28T08:06:44.559479876Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "446314",
  "sent_at": "2026-10-28T08:06:43.562087106Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "861efa1c-6f00-48c1-8413-b4346009881b",
  "code": "446314",
  "device_ref": "sandbox-24116"
}
```

```json
{
  "session_id": "89060994-dcad-49f9-bb26-8759c4624a4f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcwMywiaWF0IjoxNzkzMTc0ODAzLCJqdGkiOiJmMWJlNDM2MC1hZjFhLTQ0MmYtYTlhNS0wNDdhMWEzNzBhNTkiLCJzaWQiOiI4OTA2MDk5NC1kY2FkLTQ5ZjktYmIyNi04NzU5YzQ2MjRhNGYifQ.An41M_5Or9ORcvvaQWOUQSD-Yd3zxdrOH4GtkOVEAAM",
  "access_expires_at": "2026-10-28T08:21:43.62107381Z",
  "refresh_token": "IQKakMF_sKfomLIb2qfDvGed9hYUXFWSUJ1ZhxQbWRo",
  "refresh_expires_at": "2026-11-27T08:06:43.620431674Z",
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
  "device_ref": "sandbox-13416"
}
```

```json
{
  "challenge_id": "3f2195e2-f44a-476d-8599-94899ac0247f",
  "expires_at": "2026-10-28T08:11:43.676131982Z",
  "resend_available_at": "2026-10-28T08:06:44.676131982Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "325280",
  "sent_at": "2026-10-28T08:06:43.679185283Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f2195e2-f44a-476d-8599-94899ac0247f",
  "code": "325280",
  "device_ref": "sandbox-13416"
}
```

```json
{
  "session_id": "8debeb6f-1e4c-4bf0-a4de-9b1cec4ac13e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcwMywiaWF0IjoxNzkzMTc0ODAzLCJqdGkiOiIxNzA2OWI4NS01MTVlLTRkNjMtYTQ2Ni05NmMxNzdmYWVlZDciLCJzaWQiOiI4ZGViZWI2Zi0xZTRjLTRiZjAtYTRkZS05YjFjZWM0YWMxM2UifQ.a-48fLB-fGLqq3Omjn45t-v5eVqWOOcmC_B09YUjWcc",
  "access_expires_at": "2026-10-28T08:21:43.740471056Z",
  "refresh_token": "X4W14zhfON20Jyp-bcDY9p291TSlOLwjoujCAkfNz78",
  "refresh_expires_at": "2026-11-27T08:06:43.739845302Z",
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
  "command_id": "4918fd94-c423-4c4f-a719-ed826194f642",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:43Z",
    "sequence": 1793174803801
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
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
  "last_heartbeat_at": "2026-10-28T08:06:43.822136Z",
  "last_location_at": "2026-10-28T08:06:43.822136Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-26358"
}
```

```json
{
  "challenge_id": "b288b539-885a-4215-b75b-05052cfa047e",
  "expires_at": "2026-10-28T08:11:43.85575884Z",
  "resend_available_at": "2026-10-28T08:06:44.85575884Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "687948",
  "sent_at": "2026-10-28T08:06:43.858305897Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b288b539-885a-4215-b75b-05052cfa047e",
  "code": "687948",
  "device_ref": "sandbox-26358"
}
```

```json
{
  "session_id": "e1a5adcf-7569-4544-a48d-ac015f0426b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcwMywiaWF0IjoxNzkzMTc0ODAzLCJqdGkiOiJkNDgzMTk4YS03MDcyLTQ1OTYtYTExMS05NjU0NTRiYmJjYjAiLCJzaWQiOiJlMWE1YWRjZi03NTY5LTQ1NDQtYTQ4ZC1hYzAxNWYwNDI2YjgifQ.j9AsNPYmQr0RagPv_5QjW4O1VGL3oKlWnc2lVMiC6wI",
  "access_expires_at": "2026-10-28T08:21:43.921581218Z",
  "refresh_token": "s6k0yN-LedtU5VjE_Gq3Uk-HeGMeSSRGZEKSYbQXYBs",
  "refresh_expires_at": "2026-11-27T08:06:43.920883265Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "52419bfa-18d6-424d-8499-37f9b5a2edfa",
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
  "last_heartbeat_at": "2026-10-28T08:06:15.01307Z",
  "last_location_at": "2026-10-28T08:06:15.01307Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/52419bfa-18d6-424d-8499-37f9b5a2edfa/handover` → **200**

```json
{
  "command_id": "38ff0d31-44e4-465a-8434-e7301cb0e653",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "52419bfa-18d6-424d-8499-37f9b5a2edfa",
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
  "last_heartbeat_at": "2026-10-28T08:06:15.01307Z",
  "last_location_at": "2026-10-28T08:06:15.01307Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/52419bfa-18d6-424d-8499-37f9b5a2edfa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:44Z",
    "sequence": 1793174804174
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "52419bfa-18d6-424d-8499-37f9b5a2edfa",
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
  "last_heartbeat_at": "2026-10-28T08:06:44.039619Z",
  "last_location_at": "2026-10-28T08:06:44.039619Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380682589296",
  "device_ref": "sandbox-7297"
}
```

```json
{
  "challenge_id": "a63eacf5-97dd-4fa4-93c3-766da59994b6",
  "expires_at": "2026-10-28T08:11:44.070985315Z",
  "resend_available_at": "2026-10-28T08:06:45.070985315Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380682589296` → **200**

```json
{
  "phone": "+380682589296",
  "audience": "CLIENT",
  "code": "282003",
  "sent_at": "2026-10-28T08:06:44.073697392Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a63eacf5-97dd-4fa4-93c3-766da59994b6",
  "code": "282003",
  "device_ref": "sandbox-7297"
}
```

```json
{
  "session_id": "d9935480-f104-4303-9939-6142f24f13db",
  "subject": {
    "type": "CLIENT",
    "id": "f3285a05-f95a-4383-a60c-d075f24acb6a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMzI4NWEwNS1mOTVhLTQzODMtYTYwYy1kMDc1ZjI0YWNiNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzA0LCJpYXQiOjE3OTMxNzQ4MDQsImp0aSI6ImFmOTcwYzIwLWZhY2UtNGMzZC04YTRiLTBiNDhmYjE5YzZkYSIsInNpZCI6ImQ5OTM1NDgwLWYxMDQtNDMwMy05OTM5LTYxNDJmMjRmMTNkYiJ9.ieC9tLDuFWIqaMoQc7Bld25207swAl6f_i_6I4KarA0",
  "access_expires_at": "2026-10-28T08:21:44.135546997Z",
  "refresh_token": "91jh7CQ9KthHYoyFw23678c8WFOHFnqXRm68Pw9WhxQ",
  "refresh_expires_at": "2026-11-27T08:06:44.134909597Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "68804ed5-2a3e-4c42-8374-525c7879138a",
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
  "id": "63248219-594e-4118-ae34-29462b68f8e9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:11:44.172325Z",
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
  "command_id": "751301a2-f193-47ba-ba65-569d753cc9c2",
  "quote_id": "63248219-594e-4118-ae34-29462b68f8e9",
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
  "id": "2df5a3a9-7a2a-4c82-acf7-08cac5988d1e",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3285a05-f95a-4383-a60c-d075f24acb6a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T08:06:44.213627Z",
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
    "id": "f9042777-f418-43fa-8802-23f81e52b782",
    "order_id": "2df5a3a9-7a2a-4c82-acf7-08cac5988d1e",
    "expires_at": "2026-10-28T08:06:59.217386Z",
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

`POST /api/driver/v1/offers/f9042777-f418-43fa-8802-23f81e52b782/reject` → **204**

```json
{
  "command_id": "d73b037f-9fc0-4187-bf60-2b7ac72aa79b"
}
```

**Expected 200, got 204 — scenario stopped.**

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

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6233"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "dbab10d1-9930-4337-9c39-cdacb529e86e",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6233"
}
```

```json
{
  "challenge_id": "e1787673-6bc7-457d-8c9d-c8ef0d69e3b1",
  "expires_at": "2026-10-28T08:11:45.420649527Z",
  "resend_available_at": "2026-10-28T08:06:46.420649527Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "351098",
  "sent_at": "2026-10-28T08:06:45.424130579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1787673-6bc7-457d-8c9d-c8ef0d69e3b1",
  "code": "351098",
  "device_ref": "sandbox-6233"
}
```

```json
{
  "session_id": "04a08352-f89d-4810-af6f-1c203eb36212",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcwNSwiaWF0IjoxNzkzMTc0ODA1LCJqdGkiOiJiNDA3MGQ5MS1mNzRhLTQzZTAtYTA2Mi04ZDE0OTM3NGI2ZjgiLCJzaWQiOiIwNGEwODM1Mi1mODlkLTQ4MTAtYWY2Zi0xYzIwM2ViMzYyMTIifQ.T4_15xLZJXhWu1iNJuiTp2KgyDq6LNhIl_NZ1MSxZcY",
  "access_expires_at": "2026-10-28T08:21:45.486689619Z",
  "refresh_token": "7lNJpEgUREKTow7iUFWCAKXL4mhup5nx9l8GOWrIrGo",
  "refresh_expires_at": "2026-11-27T08:06:45.486038321Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
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
  "last_heartbeat_at": "2026-10-28T08:06:43.822136Z",
  "last_location_at": "2026-10-28T08:06:43.822136Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/handover` → **200**

```json
{
  "command_id": "b4c01864-bab3-4202-9579-ad76a1131f1d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
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
  "last_heartbeat_at": "2026-10-28T08:06:43.822136Z",
  "last_location_at": "2026-10-28T08:06:43.822136Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:45Z",
    "sequence": 1793174805593
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
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
  "last_heartbeat_at": "2026-10-28T08:06:45.616802Z",
  "last_location_at": "2026-10-28T08:06:45.616802Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670560058",
  "device_ref": "sandbox-5660"
}
```

```json
{
  "challenge_id": "0c905343-159e-4d27-a8f7-b9cd54e576d3",
  "expires_at": "2026-10-28T08:11:45.651471406Z",
  "resend_available_at": "2026-10-28T08:06:46.651471406Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670560058` → **200**

```json
{
  "phone": "+380670560058",
  "audience": "CLIENT",
  "code": "123153",
  "sent_at": "2026-10-28T08:06:45.654504736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c905343-159e-4d27-a8f7-b9cd54e576d3",
  "code": "123153",
  "device_ref": "sandbox-5660"
}
```

```json
{
  "session_id": "2c553b66-2ac9-4b97-89bb-16a3af0349b1",
  "subject": {
    "type": "CLIENT",
    "id": "49cf1230-a453-4cf8-a317-f20d631d1a33"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWNmMTIzMC1hNDUzLTRjZjgtYTMxNy1mMjBkNjMxZDFhMzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzA1LCJpYXQiOjE3OTMxNzQ4MDUsImp0aSI6IjIxMTA3NmExLWM2YjQtNDZlZS05Y2FiLTg5YjE1NTRhNmM5NSIsInNpZCI6IjJjNTUzYjY2LTJhYzktNGI5Ny04OWJiLTE2YTNhZjAzNDliMSJ9.cN6kpzotK4M1WE3waHhoUOnV2mjtpo8XkaIEmhdglDk",
  "access_expires_at": "2026-10-28T08:21:45.724472225Z",
  "refresh_token": "N5Apk4nZyZxjNH5NAJg1bVYmmFKxd0aflxQvantwOpg",
  "refresh_expires_at": "2026-11-27T08:06:45.723806845Z",
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
  "command_id": "8da64b68-8e91-4317-a032-7ad98f3872a7",
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
  "id": "79bfa33b-b748-4517-a91c-e6006339d1c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:11:45.794244Z",
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
  "command_id": "a08d75d8-001a-490d-87b1-57b4f0858087",
  "platform": "ANDROID",
  "token": "sandbox-driver-0c85adce-1a2f-4b77-9101-944d42eb0bb7"
}
```

```json
{
  "id": "bbb7e495-762f-43a2-8519-2b5d85676098",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T08:06:45.839822Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "dc597c92-6337-4af4-bf06-c2711d0f03ab",
  "platform": "ANDROID",
  "token": "sandbox-rider-eab4adba-31df-41ea-9bb3-008befd72ea9"
}
```

```json
{
  "id": "e0831cd4-6b4d-464b-98c0-e62a94a7b634",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T08:06:45.883536Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0a4634e7-50ff-4cd2-bec0-971f46774a6f",
  "quote_id": "79bfa33b-b748-4517-a91c-e6006339d1c0",
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
  "id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "49cf1230-a453-4cf8-a317-f20d631d1a33",
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
  "created_at": "2026-10-28T08:06:45.934253Z",
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
    "id": "b8c64d5a-2702-490c-871e-a90dad58bb8e",
    "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
    "expires_at": "2026-10-28T08:07:00.939035Z",
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

`POST /api/driver/v1/offers/b8c64d5a-2702-490c-871e-a90dad58bb8e/accept` → **200**

```json
{
  "command_id": "4644476f-66a9-48e7-9cf3-32ddc4d99300"
}
```

```json
{
  "id": "a2d65c4a-2801-4ce0-8249-c9261a028aa1",
  "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bee6da57-9ff4-4126-bdf0-850d4903b70b",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T08:06:45.907Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T08:06:45.907Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T08:06:45.907Z` → **200**

```json
[
  {
    "at": "2026-10-28T08:06:47.143521163Z",
    "token_suffix": "eb0bb7",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
      "order_version": "2",
      "event_id": "2dd4ef7c-d8c0-44e9-ab98-8399a12c3571",
      "event_type": "OfferMade",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380670560058&after=2026-10-28T08:06:45.907Z` → **200**

```json
[
  {
    "at": "2026-10-28T08:06:47.141628697Z",
    "token_suffix": "d72ea9",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
      "order_version": "3",
      "event_id": "f2849708-aad0-4889-b267-f792f7d0d438",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/b3991ea0-0efa-44dd-b364-153ba99bf381/messages` → **201**

```json
{
  "command_id": "77041ab6-a129-4aff-874f-20421fe7092b",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "71086ec2-e4cf-4df8-b185-5d10ebc26ee6",
  "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T08:06:48.176358377Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bee6da57-9ff4-4126-bdf0-850d4903b70b",
  "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
  "assignment_id": "a2d65c4a-2801-4ce0-8249-c9261a028aa1",
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

`POST /api/driver/v1/trips/bee6da57-9ff4-4126-bdf0-850d4903b70b/messages` → **201**

```json
{
  "command_id": "265f6f88-d096-4195-9a20-01de5cc6c2a5",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "0f49094c-4670-4358-841b-a614563a4bf8",
  "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T08:06:48.230178993Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/b3991ea0-0efa-44dd-b364-153ba99bf381/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/bee6da57-9ff4-4126-bdf0-850d4903b70b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670560058"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:48Z",
    "sequence": 1793174808309
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
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
  "last_heartbeat_at": "2026-10-28T08:06:48.328983Z",
  "last_location_at": "2026-10-28T08:06:48.328983Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bee6da57-9ff4-4126-bdf0-850d4903b70b",
  "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
  "assignment_id": "a2d65c4a-2801-4ce0-8249-c9261a028aa1",
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

`POST /api/driver/v1/trips/bee6da57-9ff4-4126-bdf0-850d4903b70b/arrive` → **200**

```json
{
  "command_id": "cfbe1160-a559-4e92-b3cc-ac39929dc894",
  "expected_version": 0
}
```

```json
{
  "id": "bee6da57-9ff4-4126-bdf0-850d4903b70b",
  "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
  "assignment_id": "a2d65c4a-2801-4ce0-8249-c9261a028aa1",
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
  "arrived_at": "2026-10-28T08:06:48.382342Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bee6da57-9ff4-4126-bdf0-850d4903b70b/start` → **200**

```json
{
  "command_id": "adabb157-70c3-4f4a-9723-867324d2ee7f",
  "expected_version": 1
}
```

```json
{
  "id": "bee6da57-9ff4-4126-bdf0-850d4903b70b",
  "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
  "assignment_id": "a2d65c4a-2801-4ce0-8249-c9261a028aa1",
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
  "arrived_at": "2026-10-28T08:06:48.382342Z",
  "started_at": "2026-10-28T08:06:48.418535Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:48Z",
    "sequence": 1793174808445
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
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
  "last_heartbeat_at": "2026-10-28T08:06:48.467048Z",
  "last_location_at": "2026-10-28T08:06:48.467048Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/bee6da57-9ff4-4126-bdf0-850d4903b70b/complete` → **200**

```json
{
  "command_id": "aa37ac84-6b7a-485c-98f3-6030e2793e4c",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:06:48Z",
  "cash_received": true
}
```

```json
{
  "id": "bee6da57-9ff4-4126-bdf0-850d4903b70b",
  "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
  "assignment_id": "a2d65c4a-2801-4ce0-8249-c9261a028aa1",
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
  "arrived_at": "2026-10-28T08:06:48.382342Z",
  "started_at": "2026-10-28T08:06:48.418535Z",
  "completed_at": "2026-10-28T08:06:48.510578Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/b3991ea0-0efa-44dd-b364-153ba99bf381` → **200**

```json
{
  "id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "49cf1230-a453-4cf8-a317-f20d631d1a33",
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
    "id": "a2d65c4a-2801-4ce0-8249-c9261a028aa1",
    "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bee6da57-9ff4-4126-bdf0-850d4903b70b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:06:45.934253Z",
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
    "id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-28T08:06:45.934253Z",
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
    "id": "bee6da57-9ff4-4126-bdf0-850d4903b70b",
    "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
    "order_short_number": 6,
    "created_at": "2026-10-28T08:06:46.012723Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "bda07249-1cf8-4015-bf9b-bdaf53eadcef",
    "order_id": "61003984-14c1-4ca6-9029-04660eb9ab07",
    "order_short_number": 1,
    "created_at": "2026-10-28T08:06:07.006255Z",
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

`GET /api/rider/v1/orders/b3991ea0-0efa-44dd-b364-153ba99bf381/tip` → **200**

```json
{
  "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
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
  "available_until": "2026-10-29T08:06:48.510578Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b3991ea0-0efa-44dd-b364-153ba99bf381/tip` → **201**

```json
{
  "command_id": "d0d55b15-cc90-4206-ade5-c4803d47ef20",
  "amount_minor": 1100
}
```

```json
{
  "id": "8e0406ae-41e1-4a18-9ff1-f3c7f476e74c",
  "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T08:06:51.739917Z"
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
  "session_id": "b3027569-7711-447e-8531-f1e55abbda9a",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTIsImlhdCI6MTc5MzE3NDgxMiwianRpIjoiMjBjNThhNTktMjk2ZC00NzhhLTljNjItMjM3YzI0YjIwZmVmIiwic2lkIjoiYjMwMjc1NjktNzcxMS00NDdlLTg1MzEtZjFlNTVhYmJkYTlhIn0.lpsiFe_eA-mp5R_iiwXBpnbBzbcNkhXeVedFVf96leo",
  "access_expires_at": "2026-10-28T08:21:52.073963316Z",
  "refresh_token": "DBKBG_Dah5gaTKpIUA6HkxXZ73WEA3YVNqKEvHlUd8Y",
  "refresh_expires_at": "2026-10-28T20:06:52.073345175Z",
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
        "created": 6,
        "fulfilled": 3,
        "cancelled": 2,
        "unfulfilled": 0,
        "open": 1,
        "by_channel": {
          "APP": 6
        },
        "by_payment": {
          "CASH": 5,
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
    "created": 6,
    "fulfilled": 3,
    "cancelled": 2,
    "unfulfilled": 0,
    "open": 1,
    "by_channel": {
      "APP": 6
    },
    "by_payment": {
      "CASH": 5,
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
  "generated_at": "2026-10-28T08:06:52.109889604Z"
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
  "generated_at": "2026-10-28T08:06:52.143504431Z"
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
  "session_id": "53cba840-33c8-43b3-8b65-0b92cbe6ee08",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTIsImlhdCI6MTc5MzE3NDgxMiwianRpIjoiMzUxN2EzYzItMTQyNy00ZDMxLTg1YTYtMTYyMGVhY2NjYWQwIiwic2lkIjoiNTNjYmE4NDAtMzNjOC00M2IzLThiNjUtMGI5MmNiZTZlZTA4In0.98JncGF4hv6rQARXnN7g5YYMZj6p3nuA-ccxtxqyTgU",
  "access_expires_at": "2026-10-28T08:21:52.468316975Z",
  "refresh_token": "wbaAZEIm_uKO5cJu6N1x5-xYyTNhEK_IwrIfugVNBEw",
  "refresh_expires_at": "2026-10-28T20:06:52.467758635Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b3991ea0-0efa-44dd-b364-153ba99bf381/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:06:45.935976Z",
      "actor": {
        "type": "CLIENT",
        "id": "49cf1230-a453-4cf8-a317-f20d631d1a33",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
        "quote_id": "79bfa33b-b748-4517-a91c-e6006339d1c0",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:06:45.938141Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
        "attempt_id": "a48a1989-e177-430f-b310-30d8d608901b",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:06:45.945725Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b8c64d5a-2702-490c-871e-a90dad58bb8e",
        "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:06:46.01499Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b8c64d5a-2702-490c-871e-a90dad58bb8e",
        "order_id": "b3991ea0-0efa-44dd-b364-153ba99bf381",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a2d65c4a-2801-4ce0-8249-c9261a028aa1"
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
  "at": "2026-10-28T08:06:52.527016932Z",
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
      "last_location_at": "2026-10-28T08:06:48.467048Z",
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
      "status": "ON_ORDER",
      "occupancy": "OFFERED",
      "connection": "CONNECTED",
      "geolocation": "FRESH",
      "location": {
        "lat": 50.4555,
        "lon": 30.5234
      },
      "last_location_at": "2026-10-28T08:06:44.039619Z",
      "order_id": null
    }
  ]
}
```

Done: order b3991ea0-0efa-44dd-b364-153ba99bf381.

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
  "session_id": "e986c267-5946-4afa-bebe-b079a8ef63f7",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTIsImlhdCI6MTc5MzE3NDgxMiwianRpIjoiYjgxM2E4MzUtMmJhYS00MjJkLTlkZDItODI2MTlkY2Y5ZWQzIiwic2lkIjoiZTk4NmMyNjctNTk0Ni00YWZhLWJlYmUtYjA3OWE4ZWY2M2Y3In0.qYPQlBmHmTbmbmq65DuLFybYrlyzG_sdO4pmMTjCKJ4",
  "access_expires_at": "2026-10-28T08:21:52.877937086Z",
  "refresh_token": "WzOAsC0t4SuhwVLAd1776SkpJs_7q9WB6v8Sq9THmf0",
  "refresh_expires_at": "2026-10-28T20:06:52.877316349Z",
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
  "command_id": "36f10a72-055e-46ec-bcd5-bd8e5d2c352a",
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
  "timestamp": "2026-10-28T08:06:52.000+0000",
  "channel": {
    "id": "1730052000.805030594",
    "linkedid": "1730052000.805030594",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674134654"
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
  "timestamp": "2026-10-28T08:06:52.000+0000",
  "channel": {
    "id": "1730052000.805030594",
    "linkedid": "1730052000.805030594",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674134654"
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
  "session_id": "301c0cca-7f6b-43eb-97ba-6ba031eb8bbc",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTMsImlhdCI6MTc5MzE3NDgxMywianRpIjoiMDk0ZTdjZWMtODAzNS00ZTI3LThkYTEtNmNkOWUwZGVlYWY0Iiwic2lkIjoiMzAxYzBjY2EtN2Y2Yi00M2ViLTk3YmEtNmJhMDMxZWI4YmJjIn0.0JJbpk_ADpsjKRMK4QwTui5uwv3BJ1TKrIvh0EUCdGo",
  "access_expires_at": "2026-10-28T08:21:53.333086567Z",
  "refresh_token": "QLUaprGCpHZFEFo20heUED4pcyr4kVplRrIA3X39938",
  "refresh_expires_at": "2026-10-28T20:06:53.332376923Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "8f77816c-5026-4f7a-9561-68b9c57aae76",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674134654",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:06:52Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/8f77816c-5026-4f7a-9561-68b9c57aae76/answer` → **200**

```json
{
  "command_id": "707b2999-8cc2-463b-8176-6e0ced03e0f1"
}
```

```json
{
  "id": "8f77816c-5026-4f7a-9561-68b9c57aae76",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674134654",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "order_ids": [],
  "started_at": "2026-10-28T08:06:52Z",
  "answered_at": "2026-10-28T08:06:53.410072Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.805030594",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7472471f-ed0f-4edc-aeb5-aec9171833a9",
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
  "id": "f3b33449-630d-49fb-803f-2b6a9b95725b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:11:53.482266Z",
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
  "command_id": "5550a3b4-bb98-4bb9-b1b8-266a5f141af0",
  "quote_id": "f3b33449-630d-49fb-803f-2b6a9b95725b",
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
    "phone": "+380674134654"
  },
  "call_id": "8f77816c-5026-4f7a-9561-68b9c57aae76"
}
```

```json
{
  "id": "5fbd842d-12ee-4322-9014-64665b90d2fa",
  "short_number": 7,
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
  "created_at": "2026-10-28T08:06:53.542618Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674134654"
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
    "id": "1730052000.805030594",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "8f77816c-5026-4f7a-9561-68b9c57aae76",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674134654",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_ids": [
        "5fbd842d-12ee-4322-9014-64665b90d2fa"
      ],
      "started_at": "2026-10-28T08:06:52Z",
      "answered_at": "2026-10-28T08:06:53.410072Z",
      "ended_at": "2026-10-28T08:06:53.599324Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "b77a09ca-e0b0-49fd-9ada-1cbd6dd12688",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676641827",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_ids": [],
      "started_at": "2026-10-28T08:06:11.433122Z",
      "answered_at": "2026-10-28T08:06:11.504803Z",
      "ended_at": "2026-10-28T08:06:11.561542Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:06:11.958552Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/5fbd842d-12ee-4322-9014-64665b90d2fa` → **200**

```json
{
  "id": "5fbd842d-12ee-4322-9014-64665b90d2fa",
  "short_number": 7,
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
  "created_at": "2026-10-28T08:06:53.542618Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674134654"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/5fbd842d-12ee-4322-9014-64665b90d2fa` → **200**

```json
{
  "id": "5fbd842d-12ee-4322-9014-64665b90d2fa",
  "short_number": 7,
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
  "created_at": "2026-10-28T08:06:53.542618Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674134654"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5fbd842d-12ee-4322-9014-64665b90d2fa/cancel` → **200**

```json
{
  "command_id": "955283aa-7447-4087-bfac-661109af0672",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5fbd842d-12ee-4322-9014-64665b90d2fa",
  "short_number": 7,
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
  "created_at": "2026-10-28T08:06:53.542618Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674134654"
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

Done: call 8f77816c-5026-4f7a-9561-68b9c57aae76 with order 5fbd842d-12ee-4322-9014-64665b90d2fa.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8068"
}
```

```json
{
  "challenge_id": "04d3ea98-4318-427b-b6ad-0ee5574da0b3",
  "expires_at": "2026-10-28T08:11:53.767581418Z",
  "resend_available_at": "2026-10-28T08:06:54.767581418Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "623040",
  "sent_at": "2026-10-28T08:06:53.770072402Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04d3ea98-4318-427b-b6ad-0ee5574da0b3",
  "code": "623040",
  "device_ref": "sandbox-8068"
}
```

```json
{
  "session_id": "9092f7de-1598-40de-b3bf-2b723dd22eca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcxMywiaWF0IjoxNzkzMTc0ODEzLCJqdGkiOiI2YThiYzIzZC02Mzg4LTQ4YTAtOTM2NC03MGJiZWNlYTY4YWIiLCJzaWQiOiI5MDkyZjdkZS0xNTk4LTQwZGUtYjNiZi0yYjcyM2RkMjJlY2EifQ.HLcV-qj5R3_zthFCbmGMvG1E7OvZ8NL_fgG9s2irsvs",
  "access_expires_at": "2026-10-28T08:21:53.828886952Z",
  "refresh_token": "NRYX5osN3dDyMM0mzlnHh4VJqjXhtig_dPUqbByiKTU",
  "refresh_expires_at": "2026-11-27T08:06:53.828231591Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
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
  "last_heartbeat_at": "2026-10-28T08:06:48.467048Z",
  "last_location_at": "2026-10-28T08:06:48.467048Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/handover` → **200**

```json
{
  "command_id": "0537d7d9-dff9-4a92-bfc1-1b3e56f8c473",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
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
  "last_heartbeat_at": "2026-10-28T08:06:48.467048Z",
  "last_location_at": "2026-10-28T08:06:48.467048Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:53Z",
    "sequence": 1793174813923
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
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
  "last_heartbeat_at": "2026-10-28T08:06:53.943816Z",
  "last_location_at": "2026-10-28T08:06:53.943816Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668632046",
  "device_ref": "sandbox-1113"
}
```

```json
{
  "challenge_id": "f30c1dbe-4510-4a8b-84d8-bb6e6619baf1",
  "expires_at": "2026-10-28T08:11:53.970169858Z",
  "resend_available_at": "2026-10-28T08:06:54.970169858Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668632046` → **200**

```json
{
  "phone": "+380668632046",
  "audience": "CLIENT",
  "code": "527315",
  "sent_at": "2026-10-28T08:06:53.973762251Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f30c1dbe-4510-4a8b-84d8-bb6e6619baf1",
  "code": "527315",
  "device_ref": "sandbox-1113"
}
```

```json
{
  "session_id": "af29902d-13bf-4ab3-8a45-f372f8bdb97f",
  "subject": {
    "type": "CLIENT",
    "id": "5cece1e4-4c33-4f45-9533-c0a0a62275c3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1Y2VjZTFlNC00YzMzLTRmNDUtOTUzMy1jMGEwYTYyMjc1YzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzE0LCJpYXQiOjE3OTMxNzQ4MTQsImp0aSI6ImEzZTkyZTNjLTAwM2UtNGZhMy1iZWNkLTI1ZWExNTBkNWM3ZCIsInNpZCI6ImFmMjk5MDJkLTEzYmYtNGFiMy04YTQ1LWYzNzJmOGJkYjk3ZiJ9.ZgN606T9K9dn5A2eu9xVhoS2QgESqn0Gd4CexLveGjs",
  "access_expires_at": "2026-10-28T08:21:54.032985301Z",
  "refresh_token": "kTmNdi4Rmoz4McUwFmNRl5HeOS2JOT3AT3HtJ2CI3BY",
  "refresh_expires_at": "2026-11-27T08:06:54.032298199Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5bdeff7e-d413-4454-a453-297dde78198e",
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
  "id": "9072c94e-9961-4094-a593-34a80a50a36a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-28T08:11:54.070419Z",
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
  "command_id": "f70c0734-0c6e-46f9-a714-268be78cf619",
  "quote_id": "9072c94e-9961-4094-a593-34a80a50a36a",
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
  "id": "e44ddacd-cf8b-40fc-9a10-6beeb8c831d1",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5cece1e4-4c33-4f45-9533-c0a0a62275c3",
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
  "created_at": "2026-10-28T08:06:54.111868Z",
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
    "id": "a3f4497a-0e7e-46f7-bc36-1938b17e055a",
    "order_id": "e44ddacd-cf8b-40fc-9a10-6beeb8c831d1",
    "expires_at": "2026-10-28T08:07:09.116037Z",
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

`POST /api/driver/v1/offers/a3f4497a-0e7e-46f7-bc36-1938b17e055a/accept` → **200**

```json
{
  "command_id": "21cb5383-db65-4a55-b708-57b3c35cce1c"
}
```

```json
{
  "id": "6fc2f789-1f81-41f6-97cb-ca3ee6034cd7",
  "order_id": "e44ddacd-cf8b-40fc-9a10-6beeb8c831d1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "94891aee-e2f9-4d20-9acd-55226cf82a66",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "94891aee-e2f9-4d20-9acd-55226cf82a66",
  "order_id": "e44ddacd-cf8b-40fc-9a10-6beeb8c831d1",
  "assignment_id": "6fc2f789-1f81-41f6-97cb-ca3ee6034cd7",
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

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:54Z",
    "sequence": 1793174814231
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
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
  "last_heartbeat_at": "2026-10-28T08:06:54.2521Z",
  "last_location_at": "2026-10-28T08:06:54.2521Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/94891aee-e2f9-4d20-9acd-55226cf82a66/arrive` → **200**

```json
{
  "command_id": "c4476068-d93a-40ca-b5ef-4284c245b549",
  "expected_version": 0
}
```

```json
{
  "id": "94891aee-e2f9-4d20-9acd-55226cf82a66",
  "order_id": "e44ddacd-cf8b-40fc-9a10-6beeb8c831d1",
  "assignment_id": "6fc2f789-1f81-41f6-97cb-ca3ee6034cd7",
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
  "arrived_at": "2026-10-28T08:06:54.292437Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/94891aee-e2f9-4d20-9acd-55226cf82a66/start` → **200**

```json
{
  "command_id": "84ee11f1-6f6d-4717-8a81-0f48b208a0ea",
  "expected_version": 1
}
```

```json
{
  "id": "94891aee-e2f9-4d20-9acd-55226cf82a66",
  "order_id": "e44ddacd-cf8b-40fc-9a10-6beeb8c831d1",
  "assignment_id": "6fc2f789-1f81-41f6-97cb-ca3ee6034cd7",
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
  "arrived_at": "2026-10-28T08:06:54.292437Z",
  "started_at": "2026-10-28T08:06:54.336862Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:54Z",
    "sequence": 1793174814369
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:06:54.390956Z",
  "last_location_at": "2026-10-28T08:06:54.390956Z",
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
  "device_ref": "sandbox-17036"
}
```

```json
{
  "challenge_id": "a98dcfe3-6307-4131-8bdd-b430eac3e33c",
  "expires_at": "2026-10-28T08:11:54.418276806Z",
  "resend_available_at": "2026-10-28T08:06:55.418276806Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "494965",
  "sent_at": "2026-10-28T08:06:54.420508168Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a98dcfe3-6307-4131-8bdd-b430eac3e33c",
  "code": "494965",
  "device_ref": "sandbox-17036"
}
```

```json
{
  "session_id": "97d8843f-7020-4776-abd6-26740735bbe4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcxNCwiaWF0IjoxNzkzMTc0ODE0LCJqdGkiOiIxZDgyZDczYS1hNjUzLTQ3NWMtOGVhMC1kM2NkYWE1MDExZTMiLCJzaWQiOiI5N2Q4ODQzZi03MDIwLTQ3NzYtYWJkNi0yNjc0MDczNWJiZTQifQ.NPMSzJXqaEh8PI4RhKDV6cWwkblCD3chWx6C8R9Dni4",
  "access_expires_at": "2026-10-28T08:21:54.478429421Z",
  "refresh_token": "if9tG5PAU83C3xirFI5wp-Fz0xbWMehrw7qLPbXP_fE",
  "refresh_expires_at": "2026-11-27T08:06:54.477906117Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "52419bfa-18d6-424d-8499-37f9b5a2edfa",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T08:06:44.039619Z",
  "last_location_at": "2026-10-28T08:06:44.039619Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/52419bfa-18d6-424d-8499-37f9b5a2edfa/handover` → **200**

```json
{
  "command_id": "8b69fc67-a409-43a0-8696-31c75dbdacf2",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "52419bfa-18d6-424d-8499-37f9b5a2edfa",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T08:06:44.039619Z",
  "last_location_at": "2026-10-28T08:06:44.039619Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/52419bfa-18d6-424d-8499-37f9b5a2edfa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:54Z",
    "sequence": 1793174814572
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "52419bfa-18d6-424d-8499-37f9b5a2edfa",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T08:06:54.596108Z",
  "last_location_at": "2026-10-28T08:06:54.596108Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
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
  "session_id": "a40e0291-e98f-4283-b79e-0aa1c1f76022",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTQsImlhdCI6MTc5MzE3NDgxNCwianRpIjoiYTYyYTZjN2YtNDlmNi00MjU2LWExNjUtNzIzNzQ0ZjZhMzhjIiwic2lkIjoiYTQwZTAyOTEtZTk4Zi00MjgzLWI3OWUtMGFhMWMxZjc2MDIyIn0.gMslVdEUu4pDPgn0D9eQF0u5QdyzhIOa_hTdbaKRjDw",
  "access_expires_at": "2026-10-28T08:21:54.92787353Z",
  "refresh_token": "WvuIPRCWpyysqSRwnF-yyvTAqok3huP-uHT6G5OgqXA",
  "refresh_expires_at": "2026-10-28T20:06:54.927230051Z",
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
  "session_id": "ee139859-573c-45fb-a3f3-44063fbee313",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTUsImlhdCI6MTc5MzE3NDgxNSwianRpIjoiNjQ5NmQzZjYtNjkzMi00ZTgxLWIzYjItNjA2MzYwODhlMjVmIiwic2lkIjoiZWUxMzk4NTktNTczYy00NWZiLWEzZjMtNDQwNjNmYmVlMzEzIn0._zR2rv6nuQpbOzhC--GNpnvEbHU8Ivg51FHlOgjhEb0",
  "access_expires_at": "2026-10-28T08:21:55.252362654Z",
  "refresh_token": "sW0JsZdrGFgIFH_8ZLH3FlJ3pldrsCI7al6cRQi6XxQ",
  "refresh_expires_at": "2026-10-28T20:06:55.251770511Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e44ddacd-cf8b-40fc-9a10-6beeb8c831d1` → **200**

```json
{
  "id": "e44ddacd-cf8b-40fc-9a10-6beeb8c831d1",
  "short_number": 8,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "5cece1e4-4c33-4f45-9533-c0a0a62275c3",
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
    "id": "6fc2f789-1f81-41f6-97cb-ca3ee6034cd7",
    "order_id": "e44ddacd-cf8b-40fc-9a10-6beeb8c831d1",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "94891aee-e2f9-4d20-9acd-55226cf82a66",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T08:06:54.111868Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e44ddacd-cf8b-40fc-9a10-6beeb8c831d1/interrupt` → **200**

```json
{
  "command_id": "91cc7922-5762-4627-8a1f-9a8220e3bec0",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "e44ddacd-cf8b-40fc-9a10-6beeb8c831d1",
    "short_number": 8,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "5cece1e4-4c33-4f45-9533-c0a0a62275c3",
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
      "id": "6fc2f789-1f81-41f6-97cb-ca3ee6034cd7",
      "order_id": "e44ddacd-cf8b-40fc-9a10-6beeb8c831d1",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "94891aee-e2f9-4d20-9acd-55226cf82a66",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T08:06:54.111868Z",
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
    "id": "58589fae-ff8d-4010-8d69-6aecd23ae945",
    "short_number": 9,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "5cece1e4-4c33-4f45-9533-c0a0a62275c3",
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
    "search_phase": "BROADCAST",
```

## Oleh takes the follow-up and finishes; the rider sees both orders

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a1e0bf97-fb35-40b8-bcba-8bd466495419",
    "order_id": "2df5a3a9-7a2a-4c82-acf7-08cac5988d1e",
    "expires_at": "2026-10-28T08:06:59.294463Z",
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

`POST /api/driver/v1/offers/a1e0bf97-fb35-40b8-bcba-8bd466495419/accept` → **200**

```json
{
  "command_id": "795525f7-c418-4fa4-9c72-e5ad14861334"
}
```

```json
{
  "id": "d966aa83-2af1-42f0-a5e0-082d42f7f994",
  "order_id": "2df5a3a9-7a2a-4c82-acf7-08cac5988d1e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2cf83a1b-ff12-4051-8303-739045ae8615",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2cf83a1b-ff12-4051-8303-739045ae8615",
  "order_id": "2df5a3a9-7a2a-4c82-acf7-08cac5988d1e",
  "assignment_id": "d966aa83-2af1-42f0-a5e0-082d42f7f994",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "52419bfa-18d6-424d-8499-37f9b5a2edfa",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T08:06:54.596108Z",
  "last_location_at": "2026-10-28T08:06:54.596108Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/52419bfa-18d6-424d-8499-37f9b5a2edfa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:55Z",
    "sequence": 1793174815473
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "52419bfa-18d6-424d-8499-37f9b5a2edfa",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T08:06:55.492802Z",
  "last_location_at": "2026-10-28T08:06:55.492802Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2cf83a1b-ff12-4051-8303-739045ae8615/arrive` → **422**

```json
{
  "command_id": "3e283c8f-056e-4f49-84e8-49d0d6f6066f",
  "expected_version": 0
}
```

```json
{
  "instance": "/api/driver/v1/trips/2cf83a1b-ff12-4051-8303-739045ae8615/arrive",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "82c2da78-50cd-4243-bc77-c4d007519d9c"
}
```

**Expected 200, got 422 — scenario stopped.**

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
  "session_id": "5950e4b8-7e2e-4db5-ba17-684459039403",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTUsImlhdCI6MTc5MzE3NDgxNSwianRpIjoiNzBkY2RkMTQtNmIyNy00MDkyLTk2NTAtMDQ5ZGE0OTY0Nzc4Iiwic2lkIjoiNTk1MGU0YjgtN2UyZS00ZGI1LWJhMTctNjg0NDU5MDM5NDAzIn0.ChYy-dnUaDrmUqpLkYp8CqTNykZNGiRUO4bAXfB0-lE",
  "access_expires_at": "2026-10-28T08:21:55.877153588Z",
  "refresh_token": "oSNXR0OMSoP0n5TgqylLo1evZX5CZQ_bSQQ7HX7z8og",
  "refresh_expires_at": "2026-10-28T20:06:55.876605798Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "7e4baee8-a0ba-4a96-b896-f57d7cb42d85",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:06:55Z"
}
```

```json
{
  "id": "c90c4773-6f7a-4cc9-bfd2-ff4ec32c3095",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:06:55Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/c90c4773-6f7a-4cc9-bfd2-ff4ec32c3095/publish` → **200**

```json
{
  "command_id": "c3fa908d-2d62-4144-97f1-d48d73e6c26d",
  "expected_version": 0
}
```

```json
{
  "id": "c90c4773-6f7a-4cc9-bfd2-ff4ec32c3095",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:06:55.972681Z",
  "published_at": "2026-10-28T08:06:55.972681Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "c90c4773-6f7a-4cc9-bfd2-ff4ec32c3095",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T08:06:55.972681Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637804164",
  "device_ref": "sandbox-15492"
}
```

```json
{
  "challenge_id": "ee56313c-580b-41e0-8e74-0f02b65525e8",
  "expires_at": "2026-10-28T08:11:56.040496627Z",
  "resend_available_at": "2026-10-28T08:06:57.040496627Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637804164` → **200**

```json
{
  "phone": "+380637804164",
  "audience": "CLIENT",
  "code": "498986",
  "sent_at": "2026-10-28T08:06:56.042919394Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee56313c-580b-41e0-8e74-0f02b65525e8",
  "code": "498986",
  "device_ref": "sandbox-15492"
}
```

```json
{
  "session_id": "bb9dd5db-622a-442a-b02e-52f984ef4441",
  "subject": {
    "type": "CLIENT",
    "id": "cd4577d2-386d-4e73-9025-86a7c5814397"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZDQ1NzdkMi0zODZkLTRlNzMtOTAyNS04NmE3YzU4MTQzOTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzE2LCJpYXQiOjE3OTMxNzQ4MTYsImp0aSI6ImM5YjY0ZjAyLTM4YWEtNDVhZC05MGVlLTcxMzAwMTI1N2ExOSIsInNpZCI6ImJiOWRkNWRiLTYyMmEtNDQyYS1iMDJlLTUyZjk4NGVmNDQ0MSJ9.MZaLxWM5fvXlrN8K7cN-Az26p7OilXYNWWNIabhQl0o",
  "access_expires_at": "2026-10-28T08:21:56.108114998Z",
  "refresh_token": "JH9ljiQkJaDwcFRceoURL8__OPPgglUa3uQa8CF32w4",
  "refresh_expires_at": "2026-11-27T08:06:56.107408761Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "c90c4773-6f7a-4cc9-bfd2-ff4ec32c3095",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T08:06:55.972681Z",
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
  "command_id": "d44bb518-fc29-47e7-b0c8-b38bf1557427",
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
  "id": "57ebba5a-3255-4bfe-9651-2ee018bcb4c8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:11:56.177910Z",
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
  "command_id": "83b63e06-86e3-44b7-95a6-d3465a3090ed",
  "quote_id": "57ebba5a-3255-4bfe-9651-2ee018bcb4c8",
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
  "correlation_id": "ac8fcccf-037a-470d-a1d2-ed4118138173"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "0acf5280-c6c8-4f8f-a34d-af68b2861bb6",
  "version_id": "c90c4773-6f7a-4cc9-bfd2-ff4ec32c3095",
  "language": "uk"
}
```

```json
{
  "version_id": "c90c4773-6f7a-4cc9-bfd2-ff4ec32c3095",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T08:06:56.263961Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d5ea7dd-18d6-4e5f-985c-e2b695cb7037",
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
  "id": "861242de-daf9-48eb-b852-28e5a13b60e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:11:56.305615Z",
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
  "command_id": "867e6983-ae1f-4872-b3a1-f32cbf8f4bc2",
  "quote_id": "861242de-daf9-48eb-b852-28e5a13b60e5",
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
  "id": "c1b56c55-d5ca-480d-9a07-4924c32bd39b",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cd4577d2-386d-4e73-9025-86a7c5814397",
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
  "created_at": "2026-10-28T08:06:56.345035Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c1b56c55-d5ca-480d-9a07-4924c32bd39b` → **200**

```json
{
  "id": "c1b56c55-d5ca-480d-9a07-4924c32bd39b",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cd4577d2-386d-4e73-9025-86a7c5814397",
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
  "created_at": "2026-10-28T08:06:56.345035Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/c1b56c55-d5ca-480d-9a07-4924c32bd39b/cancel` → **200**

```json
{
  "command_id": "ed8dc114-3530-4264-89b5-f9d6d943d2b0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c1b56c55-d5ca-480d-9a07-4924c32bd39b",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cd4577d2-386d-4e73-9025-86a7c5814397",
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
  "created_at": "2026-10-28T08:06:56.345035Z",
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

## A published version never changes

`POST /api/admin/v1/legal-documents/c90c4773-6f7a-4cc9-bfd2-ff4ec32c3095` → **409**

```json
{
  "command_id": "81b76fde-6931-4d47-b3cf-f80603d1e1c1",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:06:56Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/c90c4773-6f7a-4cc9-bfd2-ff4ec32c3095",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "34f079b6-a8ff-4a22-b1e1-1121b33705d5"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "9071e971-f03b-4195-a95f-be067f6c230f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:06:56Z"
}
```

```json
{
  "id": "01b083e9-79e7-4c41-87b0-9d153caed549",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:06:56Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/01b083e9-79e7-4c41-87b0-9d153caed549/publish` → **200**

```json
{
  "command_id": "0bbb6e8f-03f1-46d3-9d63-48af52757d74",
  "expected_version": 0
}
```

```json
{
  "id": "01b083e9-79e7-4c41-87b0-9d153caed549",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:06:56.552771Z",
  "published_at": "2026-10-28T08:06:56.552771Z",
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
  "device_ref": "sandbox-8317"
}
```

```json
{
  "challenge_id": "871a3416-4783-4410-ae30-5f4f214eb25f",
  "expires_at": "2026-10-28T08:11:56.595148463Z",
  "resend_available_at": "2026-10-28T08:06:57.595148463Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "590910",
  "sent_at": "2026-10-28T08:06:56.597471369Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "871a3416-4783-4410-ae30-5f4f214eb25f",
  "code": "590910",
  "device_ref": "sandbox-8317"
}
```

```json
{
  "session_id": "92a6020d-fa2b-439e-8974-cb752c668a2a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcxNiwiaWF0IjoxNzkzMTc0ODE2LCJqdGkiOiJkZDYzNzliOS0xNGFlLTRjNzUtODUxMC01MjZlNWVhNDI0MTQiLCJzaWQiOiI5MmE2MDIwZC1mYTJiLTQzOWUtODk3NC1jYjc1MmM2NjhhMmEifQ.Qpcvm71YeChgQ9oGdAbrQ7lf6h5Yoh5s80ubHD4OPjM",
  "access_expires_at": "2026-10-28T08:21:56.662325857Z",
  "refresh_token": "15l0HGZv-clAd4FC7AYJjYprhWPZNxwCt0wUzHpwTWE",
  "refresh_expires_at": "2026-11-27T08:06:56.661633894Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "52419bfa-18d6-424d-8499-37f9b5a2edfa",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T08:06:55.492802Z",
  "last_location_at": "2026-10-28T08:06:55.492802Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/52419bfa-18d6-424d-8499-37f9b5a2edfa/handover` → **200**

```json
{
  "command_id": "856b7b56-eab7-4770-af60-e395ce88cb64",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "52419bfa-18d6-424d-8499-37f9b5a2edfa",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T08:06:55.492802Z",
  "last_location_at": "2026-10-28T08:06:55.492802Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/52419bfa-18d6-424d-8499-37f9b5a2edfa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:56Z",
    "sequence": 1793174816759
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "52419bfa-18d6-424d-8499-37f9b5a2edfa",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T08:06:56.778613Z",
  "last_location_at": "2026-10-28T08:06:56.778613Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679701179",
  "device_ref": "sandbox-22405"
}
```

```json
{
  "challenge_id": "b9524cd7-d408-4420-a421-64f66f6c140a",
  "expires_at": "2026-10-28T08:11:56.808450113Z",
  "resend_available_at": "2026-10-28T08:06:57.808450113Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679701179` → **200**

```json
{
  "phone": "+380679701179",
  "audience": "CLIENT",
  "code": "450655",
  "sent_at": "2026-10-28T08:06:56.810693231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9524cd7-d408-4420-a421-64f66f6c140a",
  "code": "450655",
  "device_ref": "sandbox-22405"
}
```

```json
{
  "session_id": "f739efc9-a688-4d4d-bca2-a4928177d329",
  "subject": {
    "type": "CLIENT",
    "id": "df165c78-1fd1-40a4-9e21-0081c42f7532"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZjE2NWM3OC0xZmQxLTQwYTQtOWUyMS0wMDgxYzQyZjc1MzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzE2LCJpYXQiOjE3OTMxNzQ4MTYsImp0aSI6ImI5MjgwMWNlLTg2NzAtNDQ4NS05MGQyLWVlYjdmYjg4YzdkMiIsInNpZCI6ImY3MzllZmM5LWE2ODgtNGQ0ZC1iY2EyLWE0OTI4MTc3ZDMyOSJ9.DdPTCK7uAM8Wy1w6Gzm_35BUMuPAB_gxdBhRoiUUYHU",
  "access_expires_at": "2026-10-28T08:21:56.873266489Z",
  "refresh_token": "m4XiSQIqx5bqU1SdGJNotFlsUgwF24yqGvKi4gr1T9c",
  "refresh_expires_at": "2026-11-27T08:06:56.872593524Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b3386529-aba5-47d0-9d92-b59118b0d012",
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
  "id": "e5a55622-170d-4039-8889-d5241cd3697f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:11:56.913420Z",
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
  "command_id": "1f083b20-cb65-43cc-b7bb-c757622b390e",
  "quote_id": "e5a55622-170d-4039-8889-d5241cd3697f",
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
    "phone": "+380679068003"
  }
}
```

```json
{
  "id": "78f30821-6f4f-411d-8a80-d517d0565d8d",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "df165c78-1fd1-40a4-9e21-0081c42f7532",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T08:06:56.956471Z",
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
[]
```

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
  "session_id": "688c8be7-b4ea-4174-97f4-f29edf61cc36",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTcsImlhdCI6MTc5MzE3NDgxNywianRpIjoiZWYzYzAzMjgtZWI0Yy00NTQ3LTliYzQtMzdjOTEzNGI3YTU1Iiwic2lkIjoiNjg4YzhiZTctYjRlYS00MTc0LTk3ZjQtZjI5ZWRmNjFjYzM2In0.XSOsdICEbG6G57NN5roSgbumGszW6N7EVb_PwXhowo8",
  "access_expires_at": "2026-10-28T08:21:57.338286373Z",
  "refresh_token": "EyMo2AxBs9ef_-VPw8uS1xxCDbfWuLHAlGGJNGBfWCw",
  "refresh_expires_at": "2026-10-28T20:06:57.337697907Z",
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
  "session_id": "115e7125-5d89-4e5e-80e4-a400e8301f97",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTcsImlhdCI6MTc5MzE3NDgxNywianRpIjoiNTg1YWRhYWEtOTAxMS00MTkwLTg4MjUtYzA0ZGYzZTY4NDAwIiwic2lkIjoiMTE1ZTcxMjUtNWQ4OS00ZTVlLTgwZTQtYTQwMGU4MzAxZjk3In0.BlboeEwy4ahX8jpnI7iH68UGb6xtEwNs-HlDSFkikMs",
  "access_expires_at": "2026-10-28T08:21:57.66398462Z",
  "refresh_token": "5z4tlZd09EVw3VFqrVl1r1RXaKRBXHbpWSD7lf9DXKE",
  "refresh_expires_at": "2026-10-28T20:06:57.663319732Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22865"
}
```

```json
{
  "challenge_id": "f10e95c8-eea4-4894-b13c-6c093ec1dc55",
  "expires_at": "2026-10-28T08:11:57.690139865Z",
  "resend_available_at": "2026-10-28T08:06:58.690139865Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "067804",
  "sent_at": "2026-10-28T08:06:57.692492377Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f10e95c8-eea4-4894-b13c-6c093ec1dc55",
  "code": "067804",
  "device_ref": "sandbox-22865"
}
```

```json
{
  "session_id": "c723e938-a56e-4341-ada2-22c29a68204b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcxNywiaWF0IjoxNzkzMTc0ODE3LCJqdGkiOiJlZTViNjQ5OC1jYjFhLTRhZTItOGY1Ni1hZTA1NWM0OGE2NjIiLCJzaWQiOiJjNzIzZTkzOC1hNTZlLTQzNDEtYWRhMi0yMmMyOWE2ODIwNGIifQ.EXQY62lZsjCMNw98jPCHZzwtUY5_ItkthtLQxzJLftw",
  "access_expires_at": "2026-10-28T08:21:57.753609507Z",
  "refresh_token": "Q709qEm2QaEgUTyN4S0ExBkXAzZxZ5YrOD4JTgtVW6s",
  "refresh_expires_at": "2026-11-27T08:06:57.753069849Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:06:54.390956Z",
  "last_location_at": "2026-10-28T08:06:54.390956Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/handover` → **200**

```json
{
  "command_id": "7903f63e-3532-44d8-b18b-52ca8d66aaac",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:06:54.390956Z",
  "last_location_at": "2026-10-28T08:06:54.390956Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:57Z",
    "sequence": 1793174817854
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:06:57.875053Z",
  "last_location_at": "2026-10-28T08:06:57.875053Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
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
  "command_id": "fedeeb14-bf21-437a-9361-5e51804f664b",
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
  "effective_at": "2026-10-28T08:06:57.947445Z",
  "changed_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T08:06:57.978947307Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "512959ac-1e78-49cb-a0b6-0a661a292652",
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
  "id": "bb08228e-b2ec-44f1-ace7-b164939e7570",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:11:58.018280Z",
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
  "command_id": "10180897-973d-4606-835d-68ae71f37dd9",
  "quote_id": "bb08228e-b2ec-44f1-ace7-b164939e7570",
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
    "phone": "+3806711118437"
  }
}
```

```json
{
  "id": "fba8ae15-8f30-4485-926b-3b2799e350ee",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T08:06:58.059207Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118437"
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
    "id": "7f770b79-f6f8-4c80-a511-436b43b67477",
    "order_id": "78f30821-6f4f-411d-8a80-d517d0565d8d",
    "expires_at": "2026-10-28T08:07:11.960184Z",
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
    "distance_m": 4462
  }
]
```

`POST /api/driver/v1/offers/7f770b79-f6f8-4c80-a511-436b43b67477/accept` → **200**

```json
{
  "command_id": "eba9aa2b-d25b-4ed0-a158-d93afff1e04e"
}
```

```json
{
  "id": "1f281c2a-4b23-4d9d-9511-610c8fa70162",
  "order_id": "78f30821-6f4f-411d-8a80-d517d0565d8d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dd150138-9ab1-49d6-99a0-0376e667630e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dd150138-9ab1-49d6-99a0-0376e667630e",
  "order_id": "78f30821-6f4f-411d-8a80-d517d0565d8d",
  "assignment_id": "1f281c2a-4b23-4d9d-9511-610c8fa70162",
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
    "phone": "+380679068003"
  }
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:58Z",
    "sequence": 1793174818173
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:06:58.194211Z",
  "last_location_at": "2026-10-28T08:06:58.194211Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dd150138-9ab1-49d6-99a0-0376e667630e/arrive` → **200**

```json
{
  "command_id": "bd3e6aa8-d7b4-4343-b502-f4f2eb28aef8",
  "expected_version": 0
}
```

```json
{
  "id": "dd150138-9ab1-49d6-99a0-0376e667630e",
  "order_id": "78f30821-6f4f-411d-8a80-d517d0565d8d",
  "assignment_id": "1f281c2a-4b23-4d9d-9511-610c8fa70162",
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
  "arrived_at": "2026-10-28T08:06:58.233103Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Бабуся Ольга",
    "phone": "+380679068003"
  }
}
```

`POST /api/driver/v1/trips/dd150138-9ab1-49d6-99a0-0376e667630e/start` → **200**

```json
{
  "command_id": "d15231f7-0e9e-4c95-9c6e-d82eaa538661",
  "expected_version": 1
}
```

```json
{
  "id": "dd150138-9ab1-49d6-99a0-0376e667630e",
  "order_id": "78f30821-6f4f-411d-8a80-d517d0565d8d",
  "assignment_id": "1f281c2a-4b23-4d9d-9511-610c8fa70162",
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
  "arrived_at": "2026-10-28T08:06:58.233103Z",
  "started_at": "2026-10-28T08:06:58.276451Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Бабуся Ольга",
    "phone": "+380679068003"
  }
}
```

`POST /api/driver/v1/trips/dd150138-9ab1-49d6-99a0-0376e667630e/complete` → **200**

```json
{
  "command_id": "92cf4976-a36e-46d6-9a0b-b271a4c6c42f",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:06:58Z",
  "cash_received": true
}
```

```json
{
  "id": "dd150138-9ab1-49d6-99a0-0376e667630e",
  "order_id": "78f30821-6f4f-411d-8a80-d517d0565d8d",
  "assignment_id": "1f281c2a-4b23-4d9d-9511-610c8fa70162",
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
  "arrived_at": "2026-10-28T08:06:58.233103Z",
  "started_at": "2026-10-28T08:06:58.276451Z",
  "completed_at": "2026-10-28T08:06:58.326391Z",
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
  "command_id": "3d7cb267-e072-421e-9f28-e6db5b8606b7",
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
  "id": "05eca9ec-6abc-4edc-9e54-0d290248b14d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:11:58.374368Z",
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
  "command_id": "d4e5e60f-8400-4e47-84b1-ae9ba0d39e04",
  "quote_id": "05eca9ec-6abc-4edc-9e54-0d290248b14d",
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
    "phone": "+3806711122227"
  }
}
```

```json
{
  "id": "3176c267-b97f-44ba-a931-a5496644bd0f",
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
  "created_at": "2026-10-28T08:06:58.418022Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122227"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/3176c267-b97f-44ba-a931-a5496644bd0f` → **200**

```json
{
  "id": "3176c267-b97f-44ba-a931-a5496644bd0f",
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
  "created_at": "2026-10-28T08:06:58.418022Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122227"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3176c267-b97f-44ba-a931-a5496644bd0f/cancel` → **200**

```json
{
  "command_id": "c5764331-d3e2-4533-8877-825a5a62c8e9",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "3176c267-b97f-44ba-a931-a5496644bd0f",
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
  "created_at": "2026-10-28T08:06:58.418022Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122227"
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
  "staff_id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "balance": -3,
  "fulfilled_count": 0,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T08:06:58.495341Z",
  "last_entries": [
    {
      "order_id": "3176c267-b97f-44ba-a931-a5496644bd0f",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T08:06:58.495341Z"
    }
  ]
}
```

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674364748",
  "device_ref": "sandbox-11056"
}
```

```json
{
  "challenge_id": "7b0b617e-e2bc-418c-bdc1-0f20d41474de",
  "expires_at": "2026-10-28T08:12:00.587573721Z",
  "resend_available_at": "2026-10-28T08:07:01.587573721Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674364748` → **200**

```json
{
  "phone": "+380674364748",
  "audience": "CLIENT",
  "code": "007836",
  "sent_at": "2026-10-28T08:07:00.590112353Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678539012",
  "device_ref": "sandbox-3362",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b7dd1920-1666-4dff-8ac9-341b00ea3e00",
  "expires_at": "2026-10-28T08:12:00.650937714Z",
  "resend_available_at": "2026-10-28T08:07:01.650937714Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678539012` → **200**

```json
{
  "phone": "+380678539012",
  "audience": "CLIENT",
  "code": "969826",
  "sent_at": "2026-10-28T08:07:00.653153609Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674100000",
  "device_ref": "sandbox-32312"
}
```

```json
{
  "challenge_id": "4782fea9-fc2d-4302-9b0f-66b77a32811c",
  "expires_at": "2026-10-28T08:12:00.711061959Z",
  "resend_available_at": "2026-10-28T08:07:01.711061959Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674100000` → **200**

```json
{
  "phone": "+380674100000",
  "audience": "CLIENT",
  "code": "388533",
  "sent_at": "2026-10-28T08:07:00.714578437Z",
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
  "session_id": "4deb55d7-bc2c-4873-89c3-eca268e73c2c",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MjEsImlhdCI6MTc5MzE3NDgyMSwianRpIjoiOGVjN2Q1ZDYtNWIxYy00YTA0LTk3MmEtYjZmZmNkYTc1YjU1Iiwic2lkIjoiNGRlYjU1ZDctYmMyYy00ODczLTg5YzMtZWNhMjY4ZTczYzJjIn0.XJSueP4meHQaxAU2At9zs_FFZoahqf65ce012tXt3qg",
  "access_expires_at": "2026-10-28T08:22:01.073299411Z",
  "refresh_token": "BWi3gLU1CL0B5nk4cFcclU41LgiMhijsW8PnIgtde1Y",
  "refresh_expires_at": "2026-10-28T20:07:01.072638286Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674100000` → **200**

```json
{
  "deliveries": [
    {
      "id": "9b5faace-be79-41d1-90bf-7f4522e70801",
      "challenge_id": "4782fea9-fc2d-4302-9b0f-66b77a32811c",
      "phone": "+380674100000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3b8d3083-1b6f-4d47-af0f-cf3a3b3f8ee7",
      "error": null,
      "attempted_at": "2026-10-28T08:07:00.714883Z"
    },
    {
      "id": "095c7047-f112-4848-8843-2ff237eabb89",
      "challenge_id": "4782fea9-fc2d-4302-9b0f-66b77a32811c",
      "phone": "+380674100000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T08:07:00.714004Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674100000` → **200**

```json
{
  "phone": "+380674100000",
  "audience": "CLIENT",
  "code": "388533",
  "sent_at": "2026-10-28T08:07:00.714578437Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678539012` → **200**

```json
{
  "deliveries": [
    {
      "id": "65ab23b6-07ca-43f9-ac4a-0e2356fe1a8a",
      "challenge_id": "b7dd1920-1666-4dff-8ac9-341b00ea3e00",
      "phone": "+380678539012",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6bfc0ac0-485d-48c4-8bfb-9356742f95d3",
      "error": null,
      "attempted_at": "2026-10-28T08:07:00.653332Z"
    }
  ]
}
```

Done: SMS to +380674364748, a call to +380678539012, SMS then a call to +380674100000.

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
  "session_id": "eb8d1b3d-e23b-47ff-8e63-24f7e598708f",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MjEsImlhdCI6MTc5MzE3NDgyMSwianRpIjoiZmY2MWY5MDUtODYwMi00Njk1LWI0ZmUtZGMwYjMwZGRmZmEwIiwic2lkIjoiZWI4ZDFiM2QtZTIzYi00N2ZmLThlNjMtMjRmN2U1OTg3MDhmIn0.hLToOv-XhURIdeFnUrXfySBFVagmFQhl-qfgqiTBTn4",
  "access_expires_at": "2026-10-28T08:22:01.508391537Z",
  "refresh_token": "Cpq9fdkCWqNvXv7k22t5QaBycZozXOOwRrkKIwVKvos",
  "refresh_expires_at": "2026-10-28T20:07:01.507665623Z",
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
  "session_id": "3885c7fe-6380-4bea-b602-e0b13e2ba650",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MjEsImlhdCI6MTc5MzE3NDgyMSwianRpIjoiYzBkMWMxMWItMjMwNy00ZTAwLWJjNmEtZmNlZDRlYWI3MzQ1Iiwic2lkIjoiMzg4NWM3ZmUtNjM4MC00YmVhLWI2MDItZTBiMTNlMmJhNjUwIn0.zEl0OL4oXoe4LnrXdbbJmNBhazDHzqkQnfimOkeVuss",
  "access_expires_at": "2026-10-28T08:22:01.850615224Z",
  "refresh_token": "aBi8lcpYeJ7lMtsyqijBaY5_zXxonxF5p4Z8f_yKtl4",
  "refresh_expires_at": "2026-10-28T20:07:01.849968373Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
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

`POST /api/admin/v1/staff-extensions/c69d1bcd-6ba9-4d98-9cfb-ac26525728f9` → **200**

```json
{
  "command_id": "645a8272-c4d9-4731-bc0c-19c0c23220a9",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "81d2fb65-0573-481f-9e5d-1d9627f58a9c",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T08:07:02.022013Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T08:07:02.022013Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e1f5211e-f5f8-4bc9-a2de-91be36310f92",
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
  "id": "3fe14814-1977-46de-91a5-c96eec42f7a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:12:02.096145Z",
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
  "command_id": "61480731-7fe2-42cf-b6af-e4bc67955627",
  "quote_id": "3fe14814-1977-46de-91a5-c96eec42f7a3",
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
    "phone": "+380678113217"
  }
}
```

```json
{
  "id": "f90ae28d-9443-4674-bcb4-4b3601a134a0",
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
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T08:07:02.142144Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678113217"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/f90ae28d-9443-4674-bcb4-4b3601a134a0/calls` → **201**

```json
{
  "command_id": "f83dbeb2-a2ff-48bc-979e-f919ee0f7153",
  "to": "CALLER"
}
```

```json
{
  "id": "56eb938c-6d03-4819-853c-f9402d605764",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "order_ids": [
    "f90ae28d-9443-4674-bcb4-4b3601a134a0"
  ],
  "started_at": "2026-10-28T08:07:02.206392Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/f90ae28d-9443-4674-bcb4-4b3601a134a0/calls` → **201**

```json
{
  "command_id": "f83dbeb2-a2ff-48bc-979e-f919ee0f7153",
  "to": "CALLER"
}
```

```json
{
  "id": "56eb938c-6d03-4819-853c-f9402d605764",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "order_ids": [
    "f90ae28d-9443-4674-bcb4-4b3601a134a0"
  ],
  "started_at": "2026-10-28T08:07:02.206392Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "56eb938c-6d03-4819-853c-f9402d605764",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678113217",
    "at": "2026-10-28T08:07:02.209515581Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "56eb938c-6d03-4819-853c-f9402d605764",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.2749",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "56eb938c-6d03-4819-853c-f9402d605764"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "56eb938c-6d03-4819-853c-f9402d605764",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=f90ae28d-9443-4674-bcb4-4b3601a134a0` → **200**

```json
{
  "calls": [
    {
      "id": "56eb938c-6d03-4819-853c-f9402d605764",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_ids": [
        "f90ae28d-9443-4674-bcb4-4b3601a134a0"
      ],
      "started_at": "2026-10-28T08:07:02.206392Z",
      "answered_at": "2026-10-28T08:07:02.384516Z",
      "ended_at": "2026-10-28T08:07:02.409213Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=f90ae28d-9443-4674-bcb4-4b3601a134a0` → **200**

```json
{
  "calls": [
    {
      "id": "56eb938c-6d03-4819-853c-f9402d605764",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_ids": [
        "f90ae28d-9443-4674-bcb4-4b3601a134a0"
      ],
      "started_at": "2026-10-28T08:07:02.206392Z",
      "answered_at": "2026-10-28T08:07:02.384516Z",
      "ended_at": "2026-10-28T08:07:02.409213Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=f90ae28d-9443-4674-bcb4-4b3601a134a0` → **200**

```json
{
  "calls": [
    {
      "id": "56eb938c-6d03-4819-853c-f9402d605764",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_ids": [
        "f90ae28d-9443-4674-bcb4-4b3601a134a0"
      ],
      "started_at": "2026-10-28T08:07:02.206392Z",
      "answered_at": "2026-10-28T08:07:02.384516Z",
      "ended_at": "2026-10-28T08:07:02.409213Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=f90ae28d-9443-4674-bcb4-4b3601a134a0` → **200**

```json
{
  "calls": [
    {
      "id": "56eb938c-6d03-4819-853c-f9402d605764",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_ids": [
        "f90ae28d-9443-4674-bcb4-4b3601a134a0"
      ],
      "started_at": "2026-10-28T08:07:02.206392Z",
      "answered_at": "2026-10-28T08:07:02.384516Z",
      "ended_at": "2026-10-28T08:07:02.409213Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=f90ae28d-9443-4674-bcb4-4b3601a134a0` → **200**

```json
{
  "calls": [
    {
      "id": "56eb938c-6d03-4819-853c-f9402d605764",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_ids": [
        "f90ae28d-9443-4674-bcb4-4b3601a134a0"
      ],
      "started_at": "2026-10-28T08:07:02.206392Z",
      "answered_at": "2026-10-28T08:07:02.384516Z",
      "ended_at": "2026-10-28T08:07:02.409213Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=f90ae28d-9443-4674-bcb4-4b3601a134a0` → **200**

```json
{
  "calls": [
    {
      "id": "56eb938c-6d03-4819-853c-f9402d605764",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "order_ids": [
        "f90ae28d-9443-4674-bcb4-4b3601a134a0"
      ],
      "started_at": "2026-10-28T08:07:02.206392Z",
      "answered_at": "2026-10-28T08:07:02.384516Z",
      "ended_at": "2026-10-28T08:07:02.409213Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:07:11.991101Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/f90ae28d-9443-4674-bcb4-4b3601a134a0` → **200**

```json
{
  "id": "f90ae28d-9443-4674-bcb4-4b3601a134a0",
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
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T08:07:02.142144Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678113217"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f90ae28d-9443-4674-bcb4-4b3601a134a0/cancel` → **200**

```json
{
  "command_id": "5c867693-6087-4139-be90-75361baf3a06",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f90ae28d-9443-4674-bcb4-4b3601a134a0",
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
  "created_at": "2026-10-28T08:07:02.142144Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678113217"
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
  "command_id": "fefad492-7927-4153-a10c-c437149e6f32",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T08:07:12.739507Z",
  "extension": "101"
}
```

Done: outgoing call 56eb938c-6d03-4819-853c-f9402d605764 from order f90ae28d-9443-4674-bcb4-4b3601a134a0, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633665986",
  "device_ref": "sandbox-13556"
}
```

```json
{
  "challenge_id": "adae513a-2800-41e8-8b4a-eeeb96611f15",
  "expires_at": "2026-10-28T08:12:12.784067882Z",
  "resend_available_at": "2026-10-28T08:07:13.784067882Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633665986` → **200**

```json
{
  "phone": "+380633665986",
  "audience": "CLIENT",
  "code": "730348",
  "sent_at": "2026-10-28T08:07:12.787293264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "adae513a-2800-41e8-8b4a-eeeb96611f15",
  "code": "730348",
  "device_ref": "sandbox-13556"
}
```

```json
{
  "session_id": "a36d0cf6-3dd8-481a-a942-606ba4b7e111",
  "subject": {
    "type": "CLIENT",
    "id": "c711811a-78ea-41a0-b68d-50af489542cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzExODExYS03OGVhLTQxYTAtYjY4ZC01MGFmNDg5NTQyY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzMyLCJpYXQiOjE3OTMxNzQ4MzIsImp0aSI6ImM5NDIxM2M3LWQwNGEtNDI1NS04NjU4LTUyYjhmNTlmZDVkZSIsInNpZCI6ImEzNmQwY2Y2LTNkZDgtNDgxYS1hOTQyLTYwNmJhNGI3ZTExMSJ9.0TaiA9b4Ec34s2CYHAgvzRT5iyhBCn5Knueg-tvAEnI",
  "access_expires_at": "2026-10-28T08:22:12.847973393Z",
  "refresh_token": "0e3Wyrt8NjcAkv1PPtEfHZwM6qaoWhVEc-U-ZYjgcjo",
  "refresh_expires_at": "2026-11-27T08:07:12.847350352Z",
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
  "session_id": "749be4d8-545e-4d8f-9906-b75125516efb",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MzMsImlhdCI6MTc5MzE3NDgzMywianRpIjoiYmU2YjkyMGMtMjUwMy00NzcyLTk3YjMtMTU0ZGYwOGFmNTVjIiwic2lkIjoiNzQ5YmU0ZDgtNTQ1ZS00ZDhmLTk5MDYtYjc1MTI1NTE2ZWZiIn0.UhyfOw7iajZNikeEvi1NoyfEni7mmKYrIFHSYTCsWT4",
  "access_expires_at": "2026-10-28T08:22:13.256551986Z",
  "refresh_token": "sHrWqoQxS4kdD7k3Rih3THe6hS-Zts4uxxVI-T4ZrkQ",
  "refresh_expires_at": "2026-10-28T20:07:13.256036316Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633665986` → **200**

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
  "correlation_id": "4b2b9991-33e6-4087-8eaf-12939162272e"
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
  "session_id": "130cc728-9965-493a-9ec2-952818b49738",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MzMsImlhdCI6MTc5MzE3NDgzMywianRpIjoiZDY0Yjc1ZGUtZmZiNC00ZTgyLWE1ZTYtNmQ4MDZkN2VlNTM1Iiwic2lkIjoiMTMwY2M3MjgtOTk2NS00OTNhLTllYzItOTUyODE4YjQ5NzM4In0.LeqxIKzdIFYmBBHTCry3MieZPorKamkYrfSDr4mmNgI",
  "access_expires_at": "2026-10-28T08:22:13.651910766Z",
  "refresh_token": "y4PXB5Hmo49FVqnhvLBkA6Re7N-0brmESxmTlCh0Eao",
  "refresh_expires_at": "2026-10-28T20:07:13.651258615Z",
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
  "command_id": "94f8ff07-47a3-4c2d-b5c4-48714405e780",
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
  "changed_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T08:07:13.740613998Z"
}
```

## The rider books the airport for 2026-10-28T11:07:13Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600851910",
  "device_ref": "sandbox-10372"
}
```

```json
{
  "challenge_id": "5b88fa3a-e104-4701-9f3c-8090435690be",
  "expires_at": "2026-10-28T08:12:13.775342172Z",
  "resend_available_at": "2026-10-28T08:07:14.775342172Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600851910` → **200**

```json
{
  "phone": "+48600851910",
  "audience": "CLIENT",
  "code": "588478",
  "sent_at": "2026-10-28T08:07:13.778035582Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b88fa3a-e104-4701-9f3c-8090435690be",
  "code": "588478",
  "device_ref": "sandbox-10372"
}
```

```json
{
  "session_id": "ca5eda64-04b4-4c78-b745-a58fb23271a2",
  "subject": {
    "type": "CLIENT",
    "id": "a27deb41-728e-4b14-84e7-6616897cf449"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjdkZWI0MS03MjhlLTRiMTQtODRlNy02NjE2ODk3Y2Y0NDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzMzLCJpYXQiOjE3OTMxNzQ4MzMsImp0aSI6ImEwMDJlYmJhLTZmYjYtNGZjMC1hYmRlLWJjMDNhZGJhM2ZmZCIsInNpZCI6ImNhNWVkYTY0LTA0YjQtNGM3OC1iNzQ1LWE1OGZiMjMyNzFhMiJ9.ALwS6nQlatb9UwRp-bNnrOSwINi4c5wpt7KXNERIq9I",
  "access_expires_at": "2026-10-28T08:22:13.843375447Z",
  "refresh_token": "4iJEk4jR1tBxpzm9yE0jWyRSYIMTxc0RkZljF54MHJk",
  "refresh_expires_at": "2026-11-27T08:07:13.842820208Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3cb7ab0a-e84b-48f4-9a58-754a9a4f037a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T11:07:13Z"
}
```

```json
{
  "id": "b8f8fd74-2eb7-4ad8-9b1e-9de4586619e7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-28T08:12:13.882294Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T11:07:13Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "47b374ca-6b31-455f-8b30-16c12918a329",
  "quote_id": "b8f8fd74-2eb7-4ad8-9b1e-9de4586619e7",
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
  "pickup_at": "2026-10-28T11:07:13Z"
}
```

```json
{
  "id": "32a874a7-c0de-4ede-b32d-d88891e361ba",
  "short_number": 15,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a27deb41-728e-4b14-84e7-6616897cf449",
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
  "created_at": "2026-10-28T08:07:13.928474Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:07:13Z",
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
  "device_ref": "sandbox-10949"
}
```

```json
{
  "challenge_id": "071052f9-aa47-4a45-aa39-3fd440042a83",
  "expires_at": "2026-10-28T08:12:13.964557373Z",
  "resend_available_at": "2026-10-28T08:07:14.964557373Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "273390",
  "sent_at": "2026-10-28T08:07:13.96835373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "071052f9-aa47-4a45-aa39-3fd440042a83",
  "code": "273390",
  "device_ref": "sandbox-10949"
}
```

```json
{
  "session_id": "3a45cd3b-9d3d-4e7f-9bcf-531c0ca01359",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTczNCwiaWF0IjoxNzkzMTc0ODM0LCJqdGkiOiJhM2I2ZWMzMy1lMzBiLTQzMjctOWYzMi00MDk1NGE1NGU0ZmQiLCJzaWQiOiIzYTQ1Y2QzYi05ZDNkLTRlN2YtOWJjZi01MzFjMGNhMDEzNTkifQ.uS8lkqLRgdsADf6KtxNiN9Dbm5bXTNupELCPlv-Ia68",
  "access_expires_at": "2026-10-28T08:22:14.027059635Z",
  "refresh_token": "v9zVIvTTFp32ZNF4z3WPjQ1Tc7GCiTy0POqhZfzN5a8",
  "refresh_expires_at": "2026-11-27T08:07:14.026489212Z",
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
  "command_id": "846fc622-a5b0-431a-8417-10e8315c65fb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:14Z",
    "sequence": 1793174834812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a929df82-cbdc-423a-afea-331700f0706d",
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
  "last_heartbeat_at": "2026-10-28T08:07:14.100104Z",
  "last_location_at": "2026-10-28T08:07:14.100104Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "32a874a7-c0de-4ede-b32d-d88891e361ba",
      "short_number": 15,
      "pickup_at": "2026-10-28T11:07:13Z",
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

`POST /api/driver/v1/preorders/32a874a7-c0de-4ede-b32d-d88891e361ba/reserve` → **200**

```json
{
  "command_id": "0577b5f5-1f05-4b9a-84c4-002db7011376"
}
```

```json
{
  "id": "2f9abaf9-deb1-4d66-8507-ce8a5dfd752b",
  "state": "RESERVED",
  "order": {
    "order_id": "32a874a7-c0de-4ede-b32d-d88891e361ba",
    "short_number": 15,
    "pickup_at": "2026-10-28T11:07:13Z",
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
  "reserved_at": "2026-10-28T08:07:14.172557Z",
  "confirm_from": "2026-10-28T10:37:13Z",
  "confirm_until": "2026-10-28T10:47:13Z",
  "drop_until": "2026-10-28T10:07:13Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "2f9abaf9-deb1-4d66-8507-ce8a5dfd752b",
      "state": "RESERVED",
      "order": {
        "order_id": "32a874a7-c0de-4ede-b32d-d88891e361ba",
        "short_number": 15,
        "pickup_at": "2026-10-28T11:07:13Z",
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
      "reserved_at": "2026-10-28T08:07:14.172557Z",
      "confirm_from": "2026-10-28T10:37:13Z",
      "confirm_until": "2026-10-28T10:47:13Z",
      "drop_until": "2026-10-28T10:07:13Z"
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
      "id": "2f9abaf9-deb1-4d66-8507-ce8a5dfd752b",
      "state": "RESERVED",
      "order": {
        "order_id": "32a874a7-c0de-4ede-b32d-d88891e361ba",
        "short_number": 15,
        "pickup_at": "2026-10-28T11:07:13Z",
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
      "reserved_at": "2026-10-28T08:07:14.172557Z",
      "confirm_from": "2026-10-28T10:37:13Z",
      "confirm_until": "2026-10-28T10:47:13Z",
      "drop_until": "2026-10-28T10:07:13Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/2f9abaf9-deb1-4d66-8507-ce8a5dfd752b/confirm` → **409**

```json
{
  "command_id": "8fe879ce-d8e2-4360-ad37-309ee7e5f2d7"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/2f9abaf9-deb1-4d66-8507-ce8a5dfd752b/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3d466778-52f9-4bb3-996d-34169963f9b0"
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
  "session_id": "8f39dcb8-0198-4a0a-b92d-038aa3e628ff",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MzQsImlhdCI6MTc5MzE3NDgzNCwianRpIjoiMTQ5NTg2MzctMTQ0YS00YjVmLThhMGEtZmYyYjFmNmZjMDJlIiwic2lkIjoiOGYzOWRjYjgtMDE5OC00YTBhLWI5MmQtMDM4YWEzZTYyOGZmIn0.ULj1mrRmH5IRTuB0uKZBbw9W7sSH4sJBffyFkQfThE8",
  "access_expires_at": "2026-10-28T08:22:14.592151566Z",
  "refresh_token": "gTFwO8yGrgaxrWWEvvDdR4HBeWk-O-i24JhnjGtk2_Q",
  "refresh_expires_at": "2026-10-28T20:07:14.591508107Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/32a874a7-c0de-4ede-b32d-d88891e361ba` → **200**

```json
{
  "id": "32a874a7-c0de-4ede-b32d-d88891e361ba",
  "short_number": 15,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "a27deb41-728e-4b14-84e7-6616897cf449",
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
  "created_at": "2026-10-28T08:07:13.928474Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T11:07:13Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "2f9abaf9-deb1-4d66-8507-ce8a5dfd752b",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T08:07:14.172557Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/32a874a7-c0de-4ede-b32d-d88891e361ba/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T08:07:13.930081Z",
      "actor": {
        "type": "CLIENT",
        "id": "a27deb41-728e-4b14-84e7-6616897cf449",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "32a874a7-c0de-4ede-b32d-d88891e361ba",
        "preorder": true,
        "quote_id": "b8f8fd74-2eb7-4ad8-9b1e-9de4586619e7",
        "pickup_at": "2026-10-28T11:07:13Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T08:07:14.173874Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "32a874a7-c0de-4ede-b32d-d88891e361ba",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "2f9abaf9-deb1-4d66-8507-ce8a5dfd752b"
      }
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 32a874a7-c0de-4ede-b32d-d88891e361ba, reservation 2f9abaf9-deb1-4d66-8507-ce8a5dfd752b.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9726"
}
```

```json
{
  "challenge_id": "18c8f061-b31e-4a9e-98a9-ac09ebd9361c",
  "expires_at": "2026-10-28T08:12:14.685622835Z",
  "resend_available_at": "2026-10-28T08:07:15.685622835Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "614609",
  "sent_at": "2026-10-28T08:07:14.68821673Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18c8f061-b31e-4a9e-98a9-ac09ebd9361c",
  "code": "614609",
  "device_ref": "sandbox-9726"
}
```

```json
{
  "session_id": "26ff1c11-d659-448b-9184-9c31238de212",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTczNCwiaWF0IjoxNzkzMTc0ODM0LCJqdGkiOiIzMmQyNmIxNC05MzVmLTQ3ZjgtOGNlNi1kNTVlMjk3ODNmMjgiLCJzaWQiOiIyNmZmMWMxMS1kNjU5LTQ0OGItOTE4NC05YzMxMjM4ZGUyMTIifQ.j7ZbfxuKPYA90HcLpoWnb33x7En6ZXd9fAoFmHLb7Ro",
  "access_expires_at": "2026-10-28T08:22:14.747292865Z",
  "refresh_token": "VDM7f8kLgVMGR1cfd62_GcSnHoD3ufUFrOHrpjopUKQ",
  "refresh_expires_at": "2026-11-27T08:07:14.746652044Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:06:58.194211Z",
  "last_location_at": "2026-10-28T08:06:58.194211Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/handover` → **200**

```json
{
  "command_id": "8888f733-2d84-4894-8f61-d598e3b1d40d",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:06:58.194211Z",
  "last_location_at": "2026-10-28T08:06:58.194211Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:14Z",
    "sequence": 1793174834841
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:07:14.86135Z",
  "last_location_at": "2026-10-28T08:07:14.86135Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671183726",
  "device_ref": "sandbox-8088"
}
```

```json
{
  "challenge_id": "3946771d-ce14-4736-aac8-12bfec15556f",
  "expires_at": "2026-10-28T08:12:14.888548601Z",
  "resend_available_at": "2026-10-28T08:07:15.888548601Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671183726` → **200**

```json
{
  "phone": "+380671183726",
  "audience": "CLIENT",
  "code": "652132",
  "sent_at": "2026-10-28T08:07:14.891151621Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3946771d-ce14-4736-aac8-12bfec15556f",
  "code": "652132",
  "device_ref": "sandbox-8088"
}
```

```json
{
  "session_id": "6002cba4-114c-4598-9d7c-1bae52fb4204",
  "subject": {
    "type": "CLIENT",
    "id": "6473dfba-b5a5-44b1-8122-622954bbaf78"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NDczZGZiYS1iNWE1LTQ0YjEtODEyMi02MjI5NTRiYmFmNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzM0LCJpYXQiOjE3OTMxNzQ4MzQsImp0aSI6Ijk0ZjdhYTUwLTAzMTktNDg0NS04MTc2LTI1Y2MxNDUwMjEwNiIsInNpZCI6IjYwMDJjYmE0LTExNGMtNDU5OC05ZDdjLTFiYWU1MmZiNDIwNCJ9.IzFL7WthqIaMSnv0K1QXE6d49_RrGDLeMvINLX0aTKY",
  "access_expires_at": "2026-10-28T08:22:14.959383204Z",
  "refresh_token": "WQB4KgS7DAXT-5IZxfNalhLckzlVWcsOhYvRv1FxMWQ",
  "refresh_expires_at": "2026-11-27T08:07:14.957608759Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d355021c-392b-4687-bce0-c0fd1d210284",
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
  "id": "e4778637-4d86-4204-af09-4297a7507acb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:12:15.001011Z",
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
  "command_id": "bfdbc63b-16ee-4c9a-8057-961eb5c8b55a",
  "quote_id": "e4778637-4d86-4204-af09-4297a7507acb",
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
  "id": "bdddac9c-81ae-40d1-824e-25a39b4c0463",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6473dfba-b5a5-44b1-8122-622954bbaf78",
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
  "created_at": "2026-10-28T08:07:15.039048Z",
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
    "id": "4c8a47c3-95bc-48af-8acc-55a1743224c1",
    "order_id": "bdddac9c-81ae-40d1-824e-25a39b4c0463",
    "expires_at": "2026-10-28T08:07:30.042213Z",
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

`POST /api/driver/v1/offers/4c8a47c3-95bc-48af-8acc-55a1743224c1/accept` → **200**

```json
{
  "command_id": "f33a11b4-a109-4530-a57a-78c36902b94f"
}
```

```json
{
  "id": "d9b76b74-e19e-4a36-acfc-79c5d5ea88d9",
  "order_id": "bdddac9c-81ae-40d1-824e-25a39b4c0463",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e4cc2e43-47df-448b-842a-4ec4f6ceed35",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e4cc2e43-47df-448b-842a-4ec4f6ceed35",
  "order_id": "bdddac9c-81ae-40d1-824e-25a39b4c0463",
  "assignment_id": "d9b76b74-e19e-4a36-acfc-79c5d5ea88d9",
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

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:15Z",
    "sequence": 1793174835157
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:07:15.175973Z",
  "last_location_at": "2026-10-28T08:07:15.175973Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e4cc2e43-47df-448b-842a-4ec4f6ceed35",
  "order_id": "bdddac9c-81ae-40d1-824e-25a39b4c0463",
  "assignment_id": "d9b76b74-e19e-4a36-acfc-79c5d5ea88d9",
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

`POST /api/driver/v1/trips/e4cc2e43-47df-448b-842a-4ec4f6ceed35/arrive` → **200**

```json
{
  "command_id": "1a759d58-d033-41bd-b586-c8b5c0239082",
  "expected_version": 0
}
```

```json
{
  "id": "e4cc2e43-47df-448b-842a-4ec4f6ceed35",
  "order_id": "bdddac9c-81ae-40d1-824e-25a39b4c0463",
  "assignment_id": "d9b76b74-e19e-4a36-acfc-79c5d5ea88d9",
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
  "arrived_at": "2026-10-28T08:07:15.230161Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e4cc2e43-47df-448b-842a-4ec4f6ceed35/start` → **200**

```json
{
  "command_id": "f5fbdcbe-a3c4-4c7f-a97e-a5ce6c0f28f3",
  "expected_version": 1
}
```

```json
{
  "id": "e4cc2e43-47df-448b-842a-4ec4f6ceed35",
  "order_id": "bdddac9c-81ae-40d1-824e-25a39b4c0463",
  "assignment_id": "d9b76b74-e19e-4a36-acfc-79c5d5ea88d9",
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
  "arrived_at": "2026-10-28T08:07:15.230161Z",
  "started_at": "2026-10-28T08:07:15.264921Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:15Z",
    "sequence": 1793174835290
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:07:15.309374Z",
  "last_location_at": "2026-10-28T08:07:15.309374Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/e4cc2e43-47df-448b-842a-4ec4f6ceed35/complete` → **200**

```json
{
  "command_id": "05b88202-cbbd-4481-94e6-26e50b95e153",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:07:15Z",
  "cash_received": true
}
```

```json
{
  "id": "e4cc2e43-47df-448b-842a-4ec4f6ceed35",
  "order_id": "bdddac9c-81ae-40d1-824e-25a39b4c0463",
  "assignment_id": "d9b76b74-e19e-4a36-acfc-79c5d5ea88d9",
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
  "arrived_at": "2026-10-28T08:07:15.230161Z",
  "started_at": "2026-10-28T08:07:15.264921Z",
  "completed_at": "2026-10-28T08:07:15.34736Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/bdddac9c-81ae-40d1-824e-25a39b4c0463/rating` → **200**

```json
{
  "command_id": "a45d8e95-32ce-4620-b5b9-9a6f59fb4994",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "bdddac9c-81ae-40d1-824e-25a39b4c0463",
  "score": 5,
  "created_at": "2026-10-28T08:07:15.396787464Z"
}
```

`POST /api/driver/v1/orders/bdddac9c-81ae-40d1-824e-25a39b4c0463/rating` → **200**

```json
{
  "command_id": "104062f3-6ffa-453c-b39a-d6194607f190",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "bdddac9c-81ae-40d1-824e-25a39b4c0463",
  "score": 4,
  "created_at": "2026-10-28T08:07:15.432653084Z"
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
  "session_id": "01537fc3-db55-4285-814a-bf996262853c",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MzUsImlhdCI6MTc5MzE3NDgzNSwianRpIjoiZGE3ODUwMzQtOWE2Ny00MDk3LWI4YjUtYWE0NTYwYjk1NzVhIiwic2lkIjoiMDE1MzdmYzMtZGI1NS00Mjg1LTgxNGEtYmY5OTYyNjI4NTNjIn0.P4uZ1Mx1oPjC1f2A6UMWNs37hcywf26zgzxNnWA6D30",
  "access_expires_at": "2026-10-28T08:22:15.796152253Z",
  "refresh_token": "FXc_1toHLIHIWbhj8tPnlBHvwgkE5pL5dR_Y3yVeGCQ",
  "refresh_expires_at": "2026-10-28T20:07:15.795598775Z",
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
  "session_id": "a8611746-ffd3-46ef-9804-027e88229ce3",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MzYsImlhdCI6MTc5MzE3NDgzNiwianRpIjoiMGE0NjdkN2EtMWUyMi00Mjk4LTlhMjctYjI2ZDQ2Mjg1MDMwIiwic2lkIjoiYTg2MTE3NDYtZmZkMy00NmVmLTk4MDQtMDI3ZTg4MjI5Y2UzIn0.U-zMP2PTybzR-UpUC30ft4MPuGvtrOyrwrGe3Tfs780",
  "access_expires_at": "2026-10-28T08:22:16.117568853Z",
  "refresh_token": "Njltrw8zVd8jSkZVqcOTXEWKySF744SMNspF-GZrPhw",
  "refresh_expires_at": "2026-10-28T20:07:16.117031232Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/bdddac9c-81ae-40d1-824e-25a39b4c0463/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "bdddac9c-81ae-40d1-824e-25a39b4c0463",
      "author_type": "RIDER",
      "author_id": "6473dfba-b5a5-44b1-8122-622954bbaf78",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T08:07:15.396787Z"
    },
    {
      "order_id": "bdddac9c-81ae-40d1-824e-25a39b4c0463",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "6473dfba-b5a5-44b1-8122-622954bbaf78",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T08:07:15.432653Z"
    }
  ]
}
```

Done: ratings for order bdddac9c-81ae-40d1-824e-25a39b4c0463.

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
  "session_id": "5936cff1-e8c1-4d54-81f5-67ec224ae575",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MzYsImlhdCI6MTc5MzE3NDgzNiwianRpIjoiZjFhMDlmMTItY2FiYS00OTYwLThjNzYtOTg0MWE1MTVlZGQ1Iiwic2lkIjoiNTkzNmNmZjEtZThjMS00ZDU0LTgxZjUtNjdlYzIyNGFlNTc1In0.UepO1Wj4_k5tqZkTUBUrvKx3O0TnUbBkNgGydc65JhU",
  "access_expires_at": "2026-10-28T08:22:16.499445599Z",
  "refresh_token": "pw67qgg_ZeM7C6RoU1wZNz7mJlzNzEhF1Qfm97t0cGA",
  "refresh_expires_at": "2026-10-28T20:07:16.498867789Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "db526769-d08c-4bf9-970b-ef1399abd174",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "b0a8d7c7-80df-4d6e-af5a-25a76545ceb8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:16.544245Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0a8d7c7-80df-4d6e-af5a-25a76545ceb8` → **200**

```json
{
  "id": "b0a8d7c7-80df-4d6e-af5a-25a76545ceb8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:16.544245Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0a8d7c7-80df-4d6e-af5a-25a76545ceb8` → **200**

```json
{
  "id": "b0a8d7c7-80df-4d6e-af5a-25a76545ceb8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T08:07:16.544245Z",
  "ready_at": "2026-10-28T08:07:17.000456Z",
  "expires_at": "2026-10-29T08:07:17.000456Z"
}
```

`GET /api/admin/v1/reports/exports/b0a8d7c7-80df-4d6e-af5a-25a76545ceb8/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,15,5,7,0,3,11,4,0,13,1,0,1,2,1,4
total,15,5,7,0,3,11,4,0,13,1,0,1,2,1,4
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a689332e-fd1c-47a3-b825-ee144a0d1223",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "0c828192-41ae-4b3a-b987-c9ee3835877e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:17.67488Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0c828192-41ae-4b3a-b987-c9ee3835877e` → **200**

```json
{
  "id": "0c828192-41ae-4b3a-b987-c9ee3835877e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:17.67488Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0c828192-41ae-4b3a-b987-c9ee3835877e` → **200**

```json
{
  "id": "0c828192-41ae-4b3a-b987-c9ee3835877e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:17.67488Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0c828192-41ae-4b3a-b987-c9ee3835877e` → **200**

```json
{
  "id": "0c828192-41ae-4b3a-b987-c9ee3835877e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:17.67488Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0c828192-41ae-4b3a-b987-c9ee3835877e` → **200**

```json
{
  "id": "0c828192-41ae-4b3a-b987-c9ee3835877e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:17.67488Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0c828192-41ae-4b3a-b987-c9ee3835877e` → **200**

```json
{
  "id": "0c828192-41ae-4b3a-b987-c9ee3835877e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:17.67488Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0c828192-41ae-4b3a-b987-c9ee3835877e` → **200**

```json
{
  "id": "0c828192-41ae-4b3a-b987-c9ee3835877e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T08:07:17.67488Z",
  "ready_at": "2026-10-28T08:07:22.008121Z",
  "expires_at": "2026-10-29T08:07:22.008121Z"
}
```

`GET /api/admin/v1/reports/exports/0c828192-41ae-4b3a-b987-c9ee3835877e/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,5,583.65,0.00,87.57,496.08,10.52,0.00,162.97,20.00,390.16,25.00,0.00
total,UAH,5,583.65,0.00,87.57,496.08,10.52,0.00,162.97,20.00,390.16,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/967001ae-a90d-4267-8a2d-825e09c54f44` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/967001ae-a90d-4267-8a2d-825e09c54f44",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a88cd7e6-dbbc-4ec8-a5dc-3244f3acfb8d"
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
  "device_ref": "sandbox-978"
}
```

```json
{
  "challenge_id": "c420828b-2c4f-473f-a074-412f26260572",
  "expires_at": "2026-10-28T08:12:22.951500659Z",
  "resend_available_at": "2026-10-28T08:07:23.951500659Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "849782",
  "sent_at": "2026-10-28T08:07:22.95407619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c420828b-2c4f-473f-a074-412f26260572",
  "code": "849782",
  "device_ref": "sandbox-978"
}
```

```json
{
  "session_id": "f1b80f6a-f3a0-4819-ba67-90bd780fb779",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTc0MywiaWF0IjoxNzkzMTc0ODQzLCJqdGkiOiJjNTlhMGIzZS1mYzgwLTQ4Y2MtYWI1MS0wNzI4NDgzOWMxZDAiLCJzaWQiOiJmMWI4MGY2YS1mM2EwLTQ4MTktYmE2Ny05MGJkNzgwZmI3NzkifQ.Cux9EiBolNNDbOSZDjpOgDAys6NkyRrU0fVJ-UWGLq8",
  "access_expires_at": "2026-10-28T08:22:23.013992297Z",
  "refresh_token": "iOuHyoPCsMv1ZWwslLAXA9fsSOcZTTEKMINkmo7GQ2Y",
  "refresh_expires_at": "2026-11-27T08:07:23.013362341Z",
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
  "command_id": "1b0e8b79-ab86-4aee-b926-3c8b610904d5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:23Z",
    "sequence": 1793174843100
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dccfd81d-f318-4d55-b1c5-253beb639c22",
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
  "last_heartbeat_at": "2026-10-28T08:07:23.120477Z",
  "last_location_at": "2026-10-28T08:07:23.120477Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "904d261b-1b59-4b08-9881-ad675db4c8c4",
  "points": [
    {
      "sequence": 1793174843152,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T08:06:23Z"
    },
    {
      "sequence": 1793174843160,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T08:07:23Z"
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
  "session_id": "fc7a7868-f99e-4421-bfe4-ef7510d62324",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NDMsImlhdCI6MTc5MzE3NDg0MywianRpIjoiOTU0MjhkYzEtYWExOS00YWYwLWExMGMtYjIwOWY1MGI0MWVjIiwic2lkIjoiZmM3YTc4NjgtZjk5ZS00NDIxLWJmZTQtZWY3NTEwZDYyMzI0In0.Tf855xzUPD2GtAbq8l4XaWFfyD5qeatTjKkQvKOsdEw",
  "access_expires_at": "2026-10-28T08:22:23.535084788Z",
  "refresh_token": "gCFwMXURDO7GwDD0sSKbFFM7cKflAg3dGADBq4EzEIU",
  "refresh_expires_at": "2026-10-28T20:07:23.534522031Z",
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
  "flags": []
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
  "flags": []
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
  "flags": []
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
  "flags": []
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
  "flags": []
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
  "flags": []
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
  "flags": []
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
  "flags": []
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
  "flags": []
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
  "flags": []
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
  "session_id": "6cc06811-fdd8-461f-a9b7-f601eaba67ac",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NjQsImlhdCI6MTc5MzE3NDg2NCwianRpIjoiZDg3MGEyYjgtMWYxZi00N2M1LWFhODgtNmI4MjNhNWVmYzI1Iiwic2lkIjoiNmNjMDY4MTEtZmRkOC00NjFmLWE5YjctZjYwMWVhYmE2N2FjIn0.WPtlsWwMyoG7sU7NyzgZfVO65MS8_oh8SWJAfcDSwqM",
  "access_expires_at": "2026-10-28T08:22:44.556514041Z",
  "refresh_token": "KtoeCTdbeBwfQYbclFRACSpUKZRSI8okYpo9eHnOUfI",
  "refresh_expires_at": "2026-10-28T20:07:44.55600249Z",
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
  "command_id": "334e572c-e18a-4756-98b9-d909cf9fd65c",
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
  "changed_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T08:07:44.62782Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "334e572c-e18a-4756-98b9-d909cf9fd65c",
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
  "changed_by": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T08:07:44.62782Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48259617500",
  "device_ref": "sandbox-17648"
}
```

```json
{
  "challenge_id": "ed75b4c8-c8b9-401a-82d4-7ab86d54a5c3",
  "expires_at": "2026-10-28T08:12:44.712284336Z",
  "resend_available_at": "2026-10-28T08:07:45.712284336Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48259617500` → **200**

```json
{
  "phone": "+48259617500",
  "audience": "CLIENT",
  "code": "248934",
  "sent_at": "2026-10-28T08:07:44.714805054Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed75b4c8-c8b9-401a-82d4-7ab86d54a5c3",
  "code": "248934",
  "device_ref": "sandbox-17648"
}
```

```json
{
  "session_id": "f0363fa9-fb11-4483-91e2-9b0782bc2420",
  "subject": {
    "type": "CLIENT",
    "id": "64d5e86e-5be6-4c5f-8e15-f0451026a5a1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGQ1ZTg2ZS01YmU2LTRjNWYtOGUxNS1mMDQ1MTAyNmE1YTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzY0LCJpYXQiOjE3OTMxNzQ4NjQsImp0aSI6IjJkNmY4Y2RlLWMzNjQtNDgyMi05NDg1LTAwZjdmZmFmNTE0NCIsInNpZCI6ImYwMzYzZmE5LWZiMTEtNDQ4My05MWUyLTliMDc4MmJjMjQyMCJ9.VO3WHvibg1n_mRzvoP_X4jtGVyPYFie4KuM9MiIlTK0",
  "access_expires_at": "2026-10-28T08:22:44.77316726Z",
  "refresh_token": "SrBSqegq2ZXUhywUd0kVJXnhlFh6LWJDZpyeiO10KUQ",
  "refresh_expires_at": "2026-11-27T08:07:44.77251378Z",
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
  "correlation_id": "1d9bb391-ff43-4e90-9bb0-6cbf092eb020"
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
  "device_ref": "sandbox-24258"
}
```

```json
{
  "challenge_id": "c3aace7a-c71c-4219-bdba-49516dce6741",
  "expires_at": "2026-10-28T08:12:44.859888594Z",
  "resend_available_at": "2026-10-28T08:07:45.859888594Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "536326",
  "sent_at": "2026-10-28T08:07:44.862178788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c3aace7a-c71c-4219-bdba-49516dce6741",
  "code": "536326",
  "device_ref": "sandbox-24258"
}
```

```json
{
  "session_id": "4e5c6b22-61e8-477f-8d4e-093b6760b693",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTc2NCwiaWF0IjoxNzkzMTc0ODY0LCJqdGkiOiI2MGUyNDUzZi04ZWRjLTRiOTMtYTJmMi0zNmNlYzc5YTMyMjciLCJzaWQiOiI0ZTVjNmIyMi02MWU4LTQ3N2YtOGQ0ZS0wOTNiNjc2MGI2OTMifQ.2wbweQgu5NstZ9tGMZOMFcWOHxnvyy8s3MAov1PfX6E",
  "access_expires_at": "2026-10-28T08:22:44.921164732Z",
  "refresh_token": "nd7LeQYsfZM4r0aHPSBYNq2F9_u7YPuZQJ9yNpNRp8Q",
  "refresh_expires_at": "2026-11-27T08:07:44.92056148Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a929df82-cbdc-423a-afea-331700f0706d",
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
  "last_heartbeat_at": "2026-10-28T08:07:14.100104Z",
  "last_location_at": "2026-10-28T08:07:14.100104Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a929df82-cbdc-423a-afea-331700f0706d/handover` → **200**

```json
{
  "command_id": "a77c6e8c-b97a-4af7-8677-191fc3fa878c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a929df82-cbdc-423a-afea-331700f0706d",
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
  "last_heartbeat_at": "2026-10-28T08:07:14.100104Z",
  "last_location_at": "2026-10-28T08:07:14.100104Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a929df82-cbdc-423a-afea-331700f0706d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:45Z",
    "sequence": 1793174865130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a929df82-cbdc-423a-afea-331700f0706d",
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
  "last_heartbeat_at": "2026-10-28T08:07:45.031959Z",
  "last_location_at": "2026-10-28T08:07:45.031959Z",
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
  "session_id": "a929df82-cbdc-423a-afea-331700f0706d",
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
  "last_heartbeat_at": "2026-10-28T08:07:45.031959Z",
  "last_location_at": "2026-10-28T08:07:45.031959Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a929df82-cbdc-423a-afea-331700f0706d/close` → **200**

```json
{
  "command_id": "d3a3178f-64bd-439e-ba3c-20959902bb93",
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
  "correlation_id": "859b2f30-5536-47ef-a1d4-401c9eeda0cc"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673913244",
  "device_ref": "sandbox-31872"
}
```

```json
{
  "challenge_id": "173b2683-6635-4544-aa44-a27b7310b675",
  "expires_at": "2026-10-28T08:12:45.201207235Z",
  "resend_available_at": "2026-10-28T08:07:46.201207235Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673913244` → **200**

```json
{
  "phone": "+380673913244",
  "audience": "CLIENT",
  "code": "054283",
  "sent_at": "2026-10-28T08:07:45.203394907Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "173b2683-6635-4544-aa44-a27b7310b675",
  "code": "054283",
  "device_ref": "sandbox-31872"
}
```

```json
{
  "session_id": "fb9dec06-c017-4c88-bf3d-346a4acb0ff4",
  "subject": {
    "type": "CLIENT",
    "id": "53616044-38ed-4af6-8ed6-b9acb194e3dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MzYxNjA0NC0zOGVkLTRhZjYtOGVkNi1iOWFjYjE5NGUzZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzY1LCJpYXQiOjE3OTMxNzQ4NjUsImp0aSI6IjdmZjFmN2U2LTgyYTAtNDRjZi05ODU0LTAyM2EzYTRlNjEzNCIsInNpZCI6ImZiOWRlYzA2LWMwMTctNGM4OC1iZjNkLTM0NmE0YWNiMGZmNCJ9.Lzt9H8lr0OHiw7OtaoFnkBYw4EMFLpGa8lGLjLROsi8",
  "access_expires_at": "2026-10-28T08:22:45.262337158Z",
  "refresh_token": "sGDmA7nv2uT04tdBXG22ApcNyR_J7UbjeFDsE26mUAQ",
  "refresh_expires_at": "2026-11-27T08:07:45.261793765Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "f1e696dd-f9a8-4dc5-b67b-4429a28eba29",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "64d56d8c-7886-49a4-a667-f6e9a18af12e",
  "upload_path": "/api/rider/v1/uploads/64d56d8c-7886-49a4-a667-f6e9a18af12e",
  "expires_at": "2026-10-28T08:22:45.302548076Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/64d56d8c-7886-49a4-a667-f6e9a18af12e` → **200**

```json
{
  "file_id": "64d56d8c-7886-49a4-a667-f6e9a18af12e",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "b950c5cb-b9ee-4f66-b481-82ab50fc7cec",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "64d56d8c-7886-49a4-a667-f6e9a18af12e"
  ]
}
```

```json
{
  "id": "8d25c8d4-5bb3-4e35-9cfc-212b445fac83",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "53616044-38ed-4af6-8ed6-b9acb194e3dd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T08:07:45.386806Z",
  "updated_at": "2026-10-28T08:07:45.386806Z",
  "messages": [
    {
      "id": "cb1291a3-c327-4ba2-b970-5990289d7e62",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "53616044-38ed-4af6-8ed6-b9acb194e3dd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:07:45.388778Z",
      "attachments": [
        {
          "file_id": "64d56d8c-7886-49a4-a667-f6e9a18af12e",
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
  "session_id": "4b9fd32e-aef4-48fa-a3e4-81780403fc07",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NjUsImlhdCI6MTc5MzE3NDg2NSwianRpIjoiZmIxNzM5ZjMtZjFmNC00NzA2LTk1N2ItNGIxZDk4MDEwMWNjIiwic2lkIjoiNGI5ZmQzMmUtYWVmNC00OGZhLWEzZTQtODE3ODA0MDNmYzA3In0.TMsTvyFH_NhTDcOTq5MjcWkSjkx-M48NQQr7q4BcRN4",
  "access_expires_at": "2026-10-28T08:22:45.742958922Z",
  "refresh_token": "SzX5p6XST4H6jiA0LX6zrHT2YR1BcT_S7-mSyzmTaHk",
  "refresh_expires_at": "2026-10-28T20:07:45.742361439Z",
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
  "session_id": "84a81095-5bdc-4fb2-be0e-7b9bf63c40c2",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NjYsImlhdCI6MTc5MzE3NDg2NiwianRpIjoiMmQxYWE1ZDgtYjQxMi00ZWJiLTkzZjEtYjg4YTgyMWQ4M2MwIiwic2lkIjoiODRhODEwOTUtNWJkYy00ZmIyLWJlMGUtN2I5YmY2M2M0MGMyIn0.lsONjvO1eSWwrMr5EbfUfqL4oEDia_nJ87YtUVAbk8M",
  "access_expires_at": "2026-10-28T08:22:46.064250157Z",
  "refresh_token": "YDqUCviUwe7pGP1INNnQccbpQlU9agF_SuRFFp1WVQY",
  "refresh_expires_at": "2026-10-28T20:07:46.063717777Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/8d25c8d4-5bb3-4e35-9cfc-212b445fac83/attachments/64d56d8c-7886-49a4-a667-f6e9a18af12e` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "3b3e6642-6ef3-47dd-bea1-ae1c3f2dc5cc",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f9bde180-2a53-4437-bb99-24eb4f092ea4",
  "upload_path": "/api/operator/v1/uploads/f9bde180-2a53-4437-bb99-24eb4f092ea4",
  "expires_at": "2026-10-28T08:22:46.11403395Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/f9bde180-2a53-4437-bb99-24eb4f092ea4` → **200**

```json
{
  "file_id": "f9bde180-2a53-4437-bb99-24eb4f092ea4",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/8d25c8d4-5bb3-4e35-9cfc-212b445fac83` → **200**

```json
{
  "id": "8d25c8d4-5bb3-4e35-9cfc-212b445fac83",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "53616044-38ed-4af6-8ed6-b9acb194e3dd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T08:07:45.386806Z",
  "updated_at": "2026-10-28T08:07:45.386806Z",
  "messages": [
    {
      "id": "cb1291a3-c327-4ba2-b970-5990289d7e62",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "53616044-38ed-4af6-8ed6-b9acb194e3dd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:07:45.388778Z",
      "attachments": [
        {
          "file_id": "64d56d8c-7886-49a4-a667-f6e9a18af12e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/8d25c8d4-5bb3-4e35-9cfc-212b445fac83/comments` → **200**

```json
{
  "command_id": "fdb7c49f-22e8-43a0-bd1e-26d1a65a1401",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "f9bde180-2a53-4437-bb99-24eb4f092ea4"
  ]
}
```

```json
{
  "id": "8d25c8d4-5bb3-4e35-9cfc-212b445fac83",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "53616044-38ed-4af6-8ed6-b9acb194e3dd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T08:07:45.386806Z",
  "updated_at": "2026-10-28T08:07:46.217051Z",
  "messages": [
    {
      "id": "cb1291a3-c327-4ba2-b970-5990289d7e62",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "53616044-38ed-4af6-8ed6-b9acb194e3dd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:07:45.388778Z",
      "attachments": [
        {
          "file_id": "64d56d8c-7886-49a4-a667-f6e9a18af12e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1fced365-1e76-435a-9ab3-5b6d010dd98a",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T08:07:46.216693Z",
      "attachments": [
        {
          "file_id": "f9bde180-2a53-4437-bb99-24eb4f092ea4",
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

`GET /api/rider/v1/support/cases/8d25c8d4-5bb3-4e35-9cfc-212b445fac83` → **200**

```json
{
  "id": "8d25c8d4-5bb3-4e35-9cfc-212b445fac83",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "53616044-38ed-4af6-8ed6-b9acb194e3dd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T08:07:45.386806Z",
  "updated_at": "2026-10-28T08:07:46.217051Z",
  "messages": [
    {
      "id": "cb1291a3-c327-4ba2-b970-5990289d7e62",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "53616044-38ed-4af6-8ed6-b9acb194e3dd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:07:45.388778Z",
      "attachments": [
        {
          "file_id": "64d56d8c-7886-49a4-a667-f6e9a18af12e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1fced365-1e76-435a-9ab3-5b6d010dd98a",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T08:07:46.216693Z",
      "attachments": [
        {
          "file_id": "f9bde180-2a53-4437-bb99-24eb4f092ea4",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/8d25c8d4-5bb3-4e35-9cfc-212b445fac83/attachments/f9bde180-2a53-4437-bb99-24eb4f092ea4` → **200**

Done: support case 8d25c8d4-5bb3-4e35-9cfc-212b445fac83, rider attachment 64d56d8c-7886-49a4-a667-f6e9a18af12e, operator attachment f9bde180-2a53-4437-bb99-24eb4f092ea4.

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
  "session_id": "90f32d87-5a9e-467e-bfc8-f35efa5fa92c",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NjYsImlhdCI6MTc5MzE3NDg2NiwianRpIjoiMTY2YTZhMjUtNDZiMS00NjlkLThiM2QtYzZlM2ZkZWFlODAzIiwic2lkIjoiOTBmMzJkODctNWE5ZS00NjdlLWJmYzgtZjM1ZWZhNWZhOTJjIn0.A2mkMPodHkc3lt8NA9KeuZswoCPIhGJd1E_4ekDnf-g",
  "access_expires_at": "2026-10-28T08:22:46.644840688Z",
  "refresh_token": "UBHaxljW5cMikUNVHKux2C5-6ikGA6mq-Gfg0wuwaE8",
  "refresh_expires_at": "2026-10-28T20:07:46.643874682Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17658"
}
```

```json
{
  "challenge_id": "0ad434ab-c7ad-4012-84a9-c72783b5a1bb",
  "expires_at": "2026-10-28T08:12:46.673819266Z",
  "resend_available_at": "2026-10-28T08:07:47.673819266Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "693419",
  "sent_at": "2026-10-28T08:07:46.679306207Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ad434ab-c7ad-4012-84a9-c72783b5a1bb",
  "code": "693419",
  "device_ref": "sandbox-17658"
}
```

```json
{
  "session_id": "c4ad3fa8-1e16-4846-bb32-1c1b919eaaa2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTc2NiwiaWF0IjoxNzkzMTc0ODY2LCJqdGkiOiI2YmJkMTI4My02MDZiLTQ3NjgtODdlYi1kMzAwYTkzNzEwMWYiLCJzaWQiOiJjNGFkM2ZhOC0xZTE2LTQ4NDYtYmIzMi0xYzFiOTE5ZWFhYTIifQ.Uj2FyUUE8evxcRMsm3vS5QfdqSs_QE3aTIA1ZLIJvqQ",
  "access_expires_at": "2026-10-28T08:22:46.739237672Z",
  "refresh_token": "ukqSB8L2dxWmkhAYuf19lQH15vzWzKr0Edad1jkM9mg",
  "refresh_expires_at": "2026-11-27T08:07:46.73864593Z",
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
    "review_status": "APPROVED",
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
  "history": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "0a26bc8e-81e2-4281-a7bc-9765b10facd9",
  "expected_version": 5,
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
  "version": 6,
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
  "device_ref": "sandbox-7724"
}
```

```json
{
  "challenge_id": "748fd3c4-b36b-4fc4-8680-f010e052230b",
  "expires_at": "2026-10-28T08:12:46.88010153Z",
  "resend_available_at": "2026-10-28T08:07:47.88010153Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "725452",
  "sent_at": "2026-10-28T08:07:46.882334778Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "748fd3c4-b36b-4fc4-8680-f010e052230b",
  "code": "725452",
  "device_ref": "sandbox-7724"
}
```

```json
{
  "session_id": "ad0d8cd2-d092-45cb-9943-d5cead36bce3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTc2NiwiaWF0IjoxNzkzMTc0ODY2LCJqdGkiOiJhNzVlZGIwZi1jNTY0LTQ5ZmUtOTI4Yi0yMjI4MzNhYzkzZTIiLCJzaWQiOiJhZDBkOGNkMi1kMDkyLTQ1Y2ItOTk0My1kNWNlYWQzNmJjZTMifQ.Li3TxQ5cI8zz4BCsNqkrtkLc-Q8DUwGFp20o_QduzOk",
  "access_expires_at": "2026-10-28T08:22:46.940403207Z",
  "refresh_token": "js2xkzKt_zu6lrS1JBCS1WIEuYEK2BcRs887Gq0QiQw",
  "refresh_expires_at": "2026-11-27T08:07:46.939832142Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:07:15.309374Z",
  "last_location_at": "2026-10-28T08:07:15.309374Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/handover` → **200**

```json
{
  "command_id": "79d0f27b-2f28-4ce6-a8a2-e06da5d5b37d",
  "expected_version": 4
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:07:15.309374Z",
  "last_location_at": "2026-10-28T08:07:15.309374Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:47Z",
    "sequence": 1793174867352
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:07:47.055771Z",
  "last_location_at": "2026-10-28T08:07:47.055771Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dccfd81d-f318-4d55-b1c5-253beb639c22",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T08:07:23.120477Z",
  "last_location_at": "2026-10-28T08:07:23.120477Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/dccfd81d-f318-4d55-b1c5-253beb639c22/handover` → **200**

```json
{
  "command_id": "ef119ba7-f4ed-44a3-854e-2f8d4ea2dba4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dccfd81d-f318-4d55-b1c5-253beb639c22",
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
  "last_heartbeat_at": "2026-10-28T08:07:23.120477Z",
  "last_location_at": "2026-10-28T08:07:23.120477Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/dccfd81d-f318-4d55-b1c5-253beb639c22/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:47Z",
    "sequence": 1793174867353
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dccfd81d-f318-4d55-b1c5-253beb639c22",
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
  "last_heartbeat_at": "2026-10-28T08:07:47.16446Z",
  "last_location_at": "2026-10-28T08:07:47.16446Z",
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
  "session_id": "ef765dd2-7735-4bf6-a42e-3d857847fb4e",
  "subject": {
    "type": "STAFF",
    "id": "c69d1bcd-6ba9-4d98-9cfb-ac26525728f9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjlkMWJjZC02YmE5LTRkOTgtOWNmYi1hYzI2NTI1NzI4ZjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NjcsImlhdCI6MTc5MzE3NDg2NywianRpIjoiODUwMGNlNWEtM2VkNS00YjczLWFjNGMtM2MxMjkxNDM5ZGFhIiwic2lkIjoiZWY3NjVkZDItNzczNS00YmY2LWE0MmUtM2Q4NTc4NDdmYjRlIn0.weMKuUnjx6rmXzU8g-XPQl-7j-6V-KwJyPhphHOdfr8",
  "access_expires_at": "2026-10-28T08:22:47.487996433Z",
  "refresh_token": "KRLu96khdkmNVFII_14pKdcPUzayoStwgPFGeOBi16c",
  "refresh_expires_at": "2026-10-28T20:07:47.487345449Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7e8d42e9-108e-49d3-9f25-640a0937df23",
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
  "id": "153619cc-72c1-46bd-bbd3-2206f604b3bd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:12:47.522463Z",
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
  "command_id": "c0cf397f-8ce3-40d0-9ce6-37165e1b1479",
  "quote_id": "153619cc-72c1-46bd-bbd3-2206f604b3bd",
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
  "id": "9076777b-685d-41dd-9f6c-0dc6d36ed2d7",
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
  "created_at": "2026-10-28T08:07:47.562176Z",
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
    "id": "e0c6ff8f-1a5c-46f1-8e0e-3dd7de817476",
    "order_id": "9076777b-685d-41dd-9f6c-0dc6d36ed2d7",
    "expires_at": "2026-10-28T08:08:02.565646Z",
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

`POST /api/driver/v1/offers/e0c6ff8f-1a5c-46f1-8e0e-3dd7de817476/accept` → **200**

```json
{
  "command_id": "d677e739-5621-4f86-903f-f1c21a6db35b"
}
```

```json
{
  "id": "d271abc6-2098-427b-a9c2-6a3141ead42a",
  "order_id": "9076777b-685d-41dd-9f6c-0dc6d36ed2d7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9c6e08fb-eefd-4001-9f35-496fc4558dc0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9c6e08fb-eefd-4001-9f35-496fc4558dc0",
  "order_id": "9076777b-685d-41dd-9f6c-0dc6d36ed2d7",
  "assignment_id": "d271abc6-2098-427b-a9c2-6a3141ead42a",
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

`POST /api/driver/v1/work-sessions/dccfd81d-f318-4d55-b1c5-253beb639c22/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:47Z",
    "sequence": 1793174867705
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dccfd81d-f318-4d55-b1c5-253beb639c22",
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
  "last_heartbeat_at": "2026-10-28T08:07:47.72491Z",
  "last_location_at": "2026-10-28T08:07:47.72491Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9c6e08fb-eefd-4001-9f35-496fc4558dc0/arrive` → **200**

```json
{
  "command_id": "1aa0e98d-b716-4aaf-a06e-fbbc69ac637a",
  "expected_version": 0
}
```

```json
{
  "id": "9c6e08fb-eefd-4001-9f35-496fc4558dc0",
  "order_id": "9076777b-685d-41dd-9f6c-0dc6d36ed2d7",
  "assignment_id": "d271abc6-2098-427b-a9c2-6a3141ead42a",
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
  "arrived_at": "2026-10-28T08:07:47.762958Z",
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

`POST /api/driver/v1/trips/9c6e08fb-eefd-4001-9f35-496fc4558dc0/start` → **200**

```json
{
  "command_id": "45f2a1f1-6f74-4990-806d-deeb08cfa392",
  "expected_version": 1
}
```

```json
{
  "id": "9c6e08fb-eefd-4001-9f35-496fc4558dc0",
  "order_id": "9076777b-685d-41dd-9f6c-0dc6d36ed2d7",
  "assignment_id": "d271abc6-2098-427b-a9c2-6a3141ead42a",
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
  "arrived_at": "2026-10-28T08:07:47.762958Z",
  "started_at": "2026-10-28T08:07:47.805008Z",
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

`POST /api/driver/v1/trips/9c6e08fb-eefd-4001-9f35-496fc4558dc0/complete` → **200**

```json
{
  "command_id": "352e7b13-d6da-446f-a03c-ea754fd8753d",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:07:47Z",
  "cash_received": true
}
```

```json
{
  "id": "9c6e08fb-eefd-4001-9f35-496fc4558dc0",
  "order_id": "9076777b-685d-41dd-9f6c-0dc6d36ed2d7",
  "assignment_id": "d271abc6-2098-427b-a9c2-6a3141ead42a",
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
  "arrived_at": "2026-10-28T08:07:47.762958Z",
  "started_at": "2026-10-28T08:07:47.805008Z",
  "completed_at": "2026-10-28T08:07:47.848378Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/9076777b-685d-41dd-9f6c-0dc6d36ed2d7` → **200**

```json
{
  "id": "9076777b-685d-41dd-9f6c-0dc6d36ed2d7",
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
    "id": "d271abc6-2098-427b-a9c2-6a3141ead42a",
    "order_id": "9076777b-685d-41dd-9f6c-0dc6d36ed2d7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c6e08fb-eefd-4001-9f35-496fc4558dc0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:07:47.562176Z",
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
  "session_id": "e41bfc49-ee40-4bc3-8927-8bd28a263c9c",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:07:47.055771Z",
  "last_location_at": "2026-10-28T08:07:47.055771Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e41bfc49-ee40-4bc3-8927-8bd28a263c9c/close` → **200**

```json
{
  "command_id": "1c67aac3-8821-410d-8c2c-4be8e286b980",
  "expected_version": 5
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
  "session_id": "dccfd81d-f318-4d55-b1c5-253beb639c22",
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
  "last_heartbeat_at": "2026-10-28T08:07:47.72491Z",
  "last_location_at": "2026-10-28T08:07:47.72491Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dccfd81d-f318-4d55-b1c5-253beb639c22/close` → **200**

```json
{
  "command_id": "02896dee-bed1-465c-b520-a47da1f274d8",
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

Done: terminal order 9076777b-685d-41dd-9f6c-0dc6d36ed2d7 by Andrii (5a000000-0000-4000-8000-000000000403).
