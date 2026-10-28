# Sandbox transcript (2026-10-28T13:00:36Z, 07e498f)

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
  "correlation_id": "f6917785-2867-4618-b2b0-8b7a1af1b053"
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
  "session_id": "af68e483-6b2c-4abc-8f1a-6d01b9d2cccd",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTMzNDIsImlhdCI6MTc5MzE5MjQ0MiwianRpIjoiZmQ3YjcyMzUtNWQ4NS00MjZjLWFhZjctZTBiMzRhZDRjZDc5Iiwic2lkIjoiYWY2OGU0ODMtNmIyYy00YWJjLThmMWEtNmQwMWI5ZDJjY2NkIn0.Rd078eiEgDXoBoCOizQ5TaBJ2ftfTXmBeDumsurmIrY",
  "access_expires_at": "2026-10-28T13:15:42.115921729Z",
  "refresh_token": "wLyOWakZWdCFegrJkwh3Zwu5dQ9UK4Q9fbwqCwR0FNE",
  "refresh_expires_at": "2026-10-29T01:00:42.114093685Z",
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
  "session_id": "5a74c515-f79e-4cf6-b71c-90638149336b",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTMzNDMsImlhdCI6MTc5MzE5MjQ0MywianRpIjoiMjc2MmNmM2UtM2I2ZS00NGM4LTljMDAtOTY2NzRiM2I1ODA0Iiwic2lkIjoiNWE3NGM1MTUtZjc5ZS00Y2Y2LWI3MWMtOTA2MzgxNDkzMzZiIn0.J5gN_9uyskY4MOZ0xaImXEGC-zLNxs1EAxE7ZYuqkXg",
  "access_expires_at": "2026-10-28T13:15:43.44509577Z",
  "refresh_token": "k-A_-vGdRqGCqf08N1jznvQrifCXzulsjjisRVsQIGg",
  "refresh_expires_at": "2026-10-29T01:00:43.444304174Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "d609e770-d71f-4d36-8665-b1ec4a5d4641",
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
  "id": "b0f34f19-1db0-42f3-936a-5929168eb744",
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
  "created_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "created_at": "2026-10-28T13:00:43.688409Z",
  "updated_at": "2026-10-28T13:00:43.688409Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633811923",
  "device_ref": "sandbox-2501"
}
```

```json
{
  "challenge_id": "078aba38-58cd-4ab1-bd2b-a4ae73736524",
  "expires_at": "2026-10-28T13:05:43.917830017Z",
  "resend_available_at": "2026-10-28T13:00:44.917830017Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633811923` → **200**

```json
{
  "phone": "+380633811923",
  "audience": "CLIENT",
  "code": "288628",
  "sent_at": "2026-10-28T13:00:43.937998746Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "078aba38-58cd-4ab1-bd2b-a4ae73736524",
  "code": "288628",
  "device_ref": "sandbox-2501"
}
```

```json
{
  "session_id": "c8e8272f-2679-428a-84af-de1aac045b9f",
  "subject": {
    "type": "CLIENT",
    "id": "40511ab4-8c93-4af8-a419-5d19199b144f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDUxMWFiNC04YzkzLTRhZjgtYTQxOS01ZDE5MTk5YjE0NGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzMzQ0LCJpYXQiOjE3OTMxOTI0NDQsImp0aSI6Ijg5YTFiZmIxLWE2NGQtNDdhZC05YmIxLWM3MWM0OTNmNTNkMiIsInNpZCI6ImM4ZTgyNzJmLTI2NzktNDI4YS04NGFmLWRlMWFhYzA0NWI5ZiJ9.ai93e99TbxMykPdQM8zlVVeYBIfnx45wLMnde8hkwYI",
  "access_expires_at": "2026-10-28T13:15:44.196574817Z",
  "refresh_token": "lct-vEEx0Mwhpq2UdZVttof8QxWttspUunp0Ye6wvWQ",
  "refresh_expires_at": "2026-11-27T13:00:44.195743026Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633811923` → **200**

```json
{
  "client_id": "40511ab4-8c93-4af8-a419-5d19199b144f"
}
```

`POST /api/admin/v1/rider-wallets/40511ab4-8c93-4af8-a419-5d19199b144f/top-ups` → **201**

```json
{
  "command_id": "bec8608b-fe48-4911-9a46-a18be5bef02d",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "40511ab4-8c93-4af8-a419-5d19199b144f",
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
      "id": "fecbd1a4-ad38-4105-b15a-1d8dae15fcea",
      "at": "2026-10-28T13:00:44.628204Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6de3beed-56e7-4797-8a20-b46f3ceffe31",
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
  "id": "a24609b2-e7dd-4b2e-83f6-424cb3ffc4f9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:05:44.949271Z",
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
      "id": "b0f34f19-1db0-42f3-936a-5929168eb744",
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
  "device_ref": "sandbox-18990"
}
```

```json
{
  "challenge_id": "0190daaa-4d82-4d97-b280-5068be6ca122",
  "expires_at": "2026-10-28T13:05:45.195239896Z",
  "resend_available_at": "2026-10-28T13:00:46.195239896Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "397392",
  "sent_at": "2026-10-28T13:00:45.198537545Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0190daaa-4d82-4d97-b280-5068be6ca122",
  "code": "397392",
  "device_ref": "sandbox-18990"
}
```

```json
{
  "session_id": "8db5b871-7e8b-4c6a-9c92-f68e616800ab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzM0NSwiaWF0IjoxNzkzMTkyNDQ1LCJqdGkiOiI4MzFmNTJlNC1mYjcyLTQ5OGUtYmYwMS1mZjQ1YjVjNTI1MzUiLCJzaWQiOiI4ZGI1Yjg3MS03ZThiLTRjNmEtOWM5Mi1mNjhlNjE2ODAwYWIifQ.hSYfC5PKOsH3kOMVxtJ5lUcKMNEra85y3AwGDPTdiUU",
  "access_expires_at": "2026-10-28T13:15:45.43464918Z",
  "refresh_token": "eVU_7OTF0d0st39LlT_M0F6iPSsUZ8KzDh_6Y8DQUvE",
  "refresh_expires_at": "2026-11-27T13:00:45.433810089Z",
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
  "command_id": "8a09e5f6-b8bb-41a9-a1f9-3f9c3f48c760",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:00:45Z",
    "sequence": 1793192445870
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65d93655-b44a-4e2b-afde-0b8f981b84c7",
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
  "last_heartbeat_at": "2026-10-28T13:00:45.906254Z",
  "last_location_at": "2026-10-28T13:00:45.906254Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3b9b6f03-6800-4090-937e-2053c2c2ff1e",
  "quote_id": "a24609b2-e7dd-4b2e-83f6-424cb3ffc4f9",
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
  "id": "5bd4641f-4b5b-4295-85f1-abd1d59e60a8",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40511ab4-8c93-4af8-a419-5d19199b144f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:00:46.173905Z",
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
  "client_id": "40511ab4-8c93-4af8-a419-5d19199b144f",
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
      "id": "fecbd1a4-ad38-4105-b15a-1d8dae15fcea",
      "at": "2026-10-28T13:00:44.628204Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
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
    "id": "99aa85e7-90a9-4e8a-b827-d160b63a9a65",
    "order_id": "5bd4641f-4b5b-4295-85f1-abd1d59e60a8",
    "expires_at": "2026-10-28T13:01:01.183415Z",
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

`POST /api/driver/v1/offers/99aa85e7-90a9-4e8a-b827-d160b63a9a65/accept` → **200**

```json
{
  "command_id": "e31085a3-249b-4f9d-b7f4-20c136faf619"
}
```

```json
{
  "id": "b987b80e-5b15-4fc8-9030-b77d74344592",
  "order_id": "5bd4641f-4b5b-4295-85f1-abd1d59e60a8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2f75e288-3601-45f3-9c67-7dcd4bd43afa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2f75e288-3601-45f3-9c67-7dcd4bd43afa",
  "order_id": "5bd4641f-4b5b-4295-85f1-abd1d59e60a8",
  "assignment_id": "b987b80e-5b15-4fc8-9030-b77d74344592",
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

`POST /api/driver/v1/work-sessions/65d93655-b44a-4e2b-afde-0b8f981b84c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:00:47Z",
    "sequence": 1793192447308
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65d93655-b44a-4e2b-afde-0b8f981b84c7",
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
  "last_heartbeat_at": "2026-10-28T13:00:47.329443Z",
  "last_location_at": "2026-10-28T13:00:47.329443Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2f75e288-3601-45f3-9c67-7dcd4bd43afa/arrive` → **200**

```json
{
  "command_id": "32501159-014f-4371-9a83-4e4763640eb1",
  "expected_version": 0
}
```

```json
{
  "id": "2f75e288-3601-45f3-9c67-7dcd4bd43afa",
  "order_id": "5bd4641f-4b5b-4295-85f1-abd1d59e60a8",
  "assignment_id": "b987b80e-5b15-4fc8-9030-b77d74344592",
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
  "arrived_at": "2026-10-28T13:00:47.554823Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2f75e288-3601-45f3-9c67-7dcd4bd43afa/start` → **200**

```json
{
  "command_id": "e0c88b54-269f-4626-b4ae-eb61fc993e99",
  "expected_version": 1
}
```

```json
{
  "id": "2f75e288-3601-45f3-9c67-7dcd4bd43afa",
  "order_id": "5bd4641f-4b5b-4295-85f1-abd1d59e60a8",
  "assignment_id": "b987b80e-5b15-4fc8-9030-b77d74344592",
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
  "arrived_at": "2026-10-28T13:00:47.554823Z",
  "started_at": "2026-10-28T13:00:47.783863Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/2f75e288-3601-45f3-9c67-7dcd4bd43afa/complete` → **200**

```json
{
  "command_id": "e28b7f7e-56e0-4d94-b736-eb1f567f9e4e",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:00:48Z",
  "cash_received": true
}
```

```json
{
  "id": "2f75e288-3601-45f3-9c67-7dcd4bd43afa",
  "order_id": "5bd4641f-4b5b-4295-85f1-abd1d59e60a8",
  "assignment_id": "b987b80e-5b15-4fc8-9030-b77d74344592",
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
  "arrived_at": "2026-10-28T13:00:47.554823Z",
  "started_at": "2026-10-28T13:00:47.783863Z",
  "completed_at": "2026-10-28T13:00:48.031713Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "40511ab4-8c93-4af8-a419-5d19199b144f",
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
      "id": "4a0352a1-93ba-49c1-b5cd-d31f0fda2e18",
      "at": "2026-10-28T13:00:48.300008Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "5bd4641f-4b5b-4295-85f1-abd1d59e60a8"
    },
    {
      "id": "fecbd1a4-ad38-4105-b15a-1d8dae15fcea",
      "at": "2026-10-28T13:00:44.628204Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/b0f34f19-1db0-42f3-936a-5929168eb744/archive` → **200**

```json
{
  "command_id": "ae269fc1-50ba-4c50-9ca7-c55d1af661a5",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "b0f34f19-1db0-42f3-936a-5929168eb744",
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
  "created_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "created_at": "2026-10-28T13:00:43.688409Z",
  "updated_at": "2026-10-28T13:00:51.492523Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65d93655-b44a-4e2b-afde-0b8f981b84c7",
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
  "last_heartbeat_at": "2026-10-28T13:00:47.329443Z",
  "last_location_at": "2026-10-28T13:00:47.329443Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/65d93655-b44a-4e2b-afde-0b8f981b84c7/close` → **200**

```json
{
  "command_id": "2e1ffeff-b243-48eb-a21d-8437ca8b6084",
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

Done: order 5bd4641f-4b5b-4295-85f1-abd1d59e60a8.

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
  "session_id": "f3d69a91-16d1-4a3e-9361-cc98b24fc01a",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTMzNTIsImlhdCI6MTc5MzE5MjQ1MiwianRpIjoiZmUzMzg5MTYtMTE2ZC00YzFkLTk3ZGEtNzVlMDQ3NDc4ZmNiIiwic2lkIjoiZjNkNjlhOTEtMTZkMS00YTNlLTkzNjEtY2M5OGIyNGZjMDFhIn0.6ZzWTLGFzwaVy6f0XMeifUnfszmijieiFfuK-2IvJhs",
  "access_expires_at": "2026-10-28T13:15:52.482918481Z",
  "refresh_token": "u68OtxWL9dnU3oA6bxrSEZjRWW6vniUg50bHZ-kFcqQ",
  "refresh_expires_at": "2026-10-29T01:00:52.482327586Z",
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
  "command_id": "5a8eb048-f510-441c-a1cd-9655e61551b7",
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
  "session_id": "7ca7d376-cfaf-4a42-900a-fcfe48d4b952",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTMzNTMsImlhdCI6MTc5MzE5MjQ1MywianRpIjoiMWU1OWQ4MDQtNTJhMS00NzA0LWI1ODYtNTU3MzBkZTRkZmQ1Iiwic2lkIjoiN2NhN2QzNzYtY2ZhZi00YTQyLTkwMGEtZmNmZTQ4ZDRiOTUyIn0.e0t06O6lXIEmo-uZBU9h09VOoP0EZxy47fjs0CgkWdk",
  "access_expires_at": "2026-10-28T13:15:53.390592742Z",
  "refresh_token": "pmBcTh8WUylnjL2Ly2RO_dhaBpjGbtVp_aL9TOPaGB4",
  "refresh_expires_at": "2026-10-29T01:00:53.389902901Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.24824338",
    "linkedid": "1730052700.24824338",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679961647"
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
    "id": "1730052700.24824338",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "208e4ee9-2d3b-46b7-abbe-d66ebbbc8e62",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679961647",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:00:53.598596Z",
      "answered_at": null,
      "ended_at": "2026-10-28T13:00:53.619619Z",
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
    "id": "1730052600.1791420771",
    "linkedid": "1730052600.1791420771",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679961647"
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
      "id": "a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679961647",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:00:53.900177Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464/answer` → **200**

```json
{
  "command_id": "34a7836a-f615-4781-8de2-2c49fff33c95"
}
```

```json
{
  "id": "a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679961647",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "order_ids": [],
  "started_at": "2026-10-28T13:00:53.900177Z",
  "answered_at": "2026-10-28T13:00:54.162095Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1791420771",
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
    "id": "1730052600.1791420771",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679961647",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_ids": [],
      "started_at": "2026-10-28T13:00:53.900177Z",
      "answered_at": "2026-10-28T13:00:54.162095Z",
      "ended_at": "2026-10-28T13:00:54.408678Z",
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
      "id": "a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679961647",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_ids": [],
      "started_at": "2026-10-28T13:00:53.900177Z",
      "answered_at": "2026-10-28T13:00:54.162095Z",
      "ended_at": "2026-10-28T13:00:54.408678Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:00:56.169986Z"
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
      "id": "a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679961647",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_ids": [],
      "started_at": "2026-10-28T13:00:53.900177Z",
      "answered_at": "2026-10-28T13:00:54.162095Z",
      "ended_at": "2026-10-28T13:00:54.408678Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:00:56.169986Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464` → **200**

```json
{
  "changes": [
    {
      "id": "cab80aea-43d9-4a49-91c7-86661f109887",
      "occurred_at": "2026-10-28T13:00:57.149898Z",
      "actor_type": "STAFF",
      "actor_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"736a3a99-8e02-492f-ad51-c17621873d3f\", \"order_ids\": []}",
      "correlation_id": "a7017add-181a-4b0b-aebf-d26dff936911"
    },
    {
      "id": "6fbfd3dc-577c-43a6-97f0-ebcc8c462b4c",
      "occurred_at": "2026-10-28T13:00:57.119311Z",
      "actor_type": "STAFF",
      "actor_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"736a3a99-8e02-492f-ad51-c17621873d3f\", \"order_ids\": []}",
      "correlation_id": "9183c1d6-cdcc-43c8-a631-536fa19a3edc"
    }
  ]
}
```

Done: call a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630310772",
  "device_ref": "sandbox-11523"
}
```

```json
{
  "challenge_id": "11007c69-a975-48d7-95af-6b99d4af4d42",
  "expires_at": "2026-10-28T13:05:57.406722873Z",
  "resend_available_at": "2026-10-28T13:00:58.406722873Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630310772` → **200**

```json
{
  "phone": "+380630310772",
  "audience": "CLIENT",
  "code": "974114",
  "sent_at": "2026-10-28T13:00:57.40978281Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11007c69-a975-48d7-95af-6b99d4af4d42",
  "code": "974114",
  "device_ref": "sandbox-11523"
}
```

```json
{
  "session_id": "ae09fc84-0199-404c-9bb3-1b6109e1cba2",
  "subject": {
    "type": "CLIENT",
    "id": "0f580d0b-b463-463c-b8ec-1a3bf7bcd6b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZjU4MGQwYi1iNDYzLTQ2M2MtYjhlYy0xYTNiZjdiY2Q2YjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzMzU3LCJpYXQiOjE3OTMxOTI0NTcsImp0aSI6IjBkMmQwMmIwLWQzZGEtNDEwMi04ZjVkLTY4N2QxMTFiYjY5MCIsInNpZCI6ImFlMDlmYzg0LTAxOTktNDA0Yy05YmIzLTFiNjEwOWUxY2JhMiJ9.Z6647W4jCtBr0Ip71BBUpNdBcV_nKc-aZMx7NOfcKbI",
  "access_expires_at": "2026-10-28T13:15:57.652931518Z",
  "refresh_token": "JdS-Aq2GOR2JwSVV3Wa3eW1l0s1LMte2jPVXa66BO1c",
  "refresh_expires_at": "2026-11-27T13:00:57.652455754Z",
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
  "device_ref": "sandbox-3175"
}
```

```json
{
  "challenge_id": "2379dab2-9e4a-4c26-ae16-5a48abe13372",
  "expires_at": "2026-10-28T13:05:58.080137238Z",
  "resend_available_at": "2026-10-28T13:00:59.080137238Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "474876",
  "sent_at": "2026-10-28T13:00:58.08282185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2379dab2-9e4a-4c26-ae16-5a48abe13372",
  "code": "474876",
  "device_ref": "sandbox-3175"
}
```

```json
{
  "session_id": "faff24be-cf08-443f-8a81-740447f2ef96",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzM1OCwiaWF0IjoxNzkzMTkyNDU4LCJqdGkiOiI0YTAwOGExMi1lZTcwLTRkNWQtOWU0NC1hOTExNDE1MzAzZDMiLCJzaWQiOiJmYWZmMjRiZS1jZjA4LTQ0M2YtOGE4MS03NDA0NDdmMmVmOTYifQ.zpPo7MRaqiYB5UlksEiTodR3RQoCMDgSyGWsDJbFaFA",
  "access_expires_at": "2026-10-28T13:15:58.437318772Z",
  "refresh_token": "8bLR7_CoE6eqdKIWp2_vNR9JvstbDLKlmff_bQukBAA",
  "refresh_expires_at": "2026-11-27T13:00:58.436285173Z",
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
  "session_id": "2095ee54-0093-4012-8313-c6f0f8d2c80c",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTMzNTksImlhdCI6MTc5MzE5MjQ1OSwianRpIjoiOTI0OTNmZjctMzdiNi00Zjk0LThlOGYtNTJlMzQ0YTMwOTBiIiwic2lkIjoiMjA5NWVlNTQtMDA5My00MDEyLTgzMTMtYzZmMGY4ZDJjODBjIn0.SBRcdO9xKhw4AcH4Wgmx_3yqIV8p1L2LDJA827aR1wA",
  "access_expires_at": "2026-10-28T13:15:59.254357784Z",
  "refresh_token": "9_BJVD4SyLWbfxZSmELuxVPXeZLmvqZD5N3QUOOe1h8",
  "refresh_expires_at": "2026-10-29T01:00:59.25367544Z",
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
  "session_id": "a39efa19-18a6-450b-a72d-bb47dda8577c",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTMzNTksImlhdCI6MTc5MzE5MjQ1OSwianRpIjoiMTcxYjcxMzQtM2QyNS00ODRmLWI1MDMtNzhlOTdiM2JmNTE3Iiwic2lkIjoiYTM5ZWZhMTktMThhNi00NTBiLWE3MmQtYmI0N2RkYTg1NzdjIn0.eIExgmjOwjpytTxRX3TzSmyp4mu5fdykDagpex7rUi0",
  "access_expires_at": "2026-10-28T13:15:59.72482458Z",
  "refresh_token": "fdRPtWXCzmTja75cxb5QM1KKyvrolw2sUX7p_UzJ7aY",
  "refresh_expires_at": "2026-10-29T01:00:59.724161679Z",
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
  "command_id": "942092b4-fde1-4553-9e37-016940be8a30",
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
  "id": "8fd1c47e-f0c4-4a3c-9847-eb6a7b894501",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:06:00.198987Z",
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
  "command_id": "6afcc2ec-122e-4f7f-a294-e662034c6be3",
  "quote_id": "8fd1c47e-f0c4-4a3c-9847-eb6a7b894501",
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
  "id": "59805bda-f9ff-409c-9cab-b632dceaf61f",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f580d0b-b463-463c-b8ec-1a3bf7bcd6b9",
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
  "created_at": "2026-10-28T13:01:00.445757Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/59805bda-f9ff-409c-9cab-b632dceaf61f` → **200**

```json
{
  "id": "59805bda-f9ff-409c-9cab-b632dceaf61f",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f580d0b-b463-463c-b8ec-1a3bf7bcd6b9",
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
  "created_at": "2026-10-28T13:01:00.445757Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/59805bda-f9ff-409c-9cab-b632dceaf61f/cancel` → **200**

```json
{
  "command_id": "3fbca2f7-cd73-4f96-933a-6e4d177d039a",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "59805bda-f9ff-409c-9cab-b632dceaf61f",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0f580d0b-b463-463c-b8ec-1a3bf7bcd6b9",
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
  "created_at": "2026-10-28T13:01:00.445757Z",
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
  "command_id": "94f69d0a-999f-4d25-85fb-d025a20c471a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:01:01Z",
    "sequence": 1793192461374
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bdf28abb-6ab5-4788-842e-83bda550e1b3",
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
  "last_heartbeat_at": "2026-10-28T13:01:01.392064Z",
  "last_location_at": "2026-10-28T13:01:01.392064Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-903"
}
```

```json
{
  "challenge_id": "1abebe78-af74-475c-a69e-9eb7b6d20104",
  "expires_at": "2026-10-28T13:06:01.615650274Z",
  "resend_available_at": "2026-10-28T13:01:02.615650274Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "469566",
  "sent_at": "2026-10-28T13:01:01.618761596Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1abebe78-af74-475c-a69e-9eb7b6d20104",
  "code": "469566",
  "device_ref": "sandbox-903"
}
```

```json
{
  "session_id": "74f95ec6-9379-4546-b7a6-895d8e7f4626",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzM2MSwiaWF0IjoxNzkzMTkyNDYxLCJqdGkiOiIwZDNkMTc5NC0zYmVkLTQwY2MtOWFkZS1jYmRhZDRlYzkxZjkiLCJzaWQiOiI3NGY5NWVjNi05Mzc5LTQ1NDYtYjdhNi04OTVkOGU3ZjQ2MjYifQ.Dnx64LAs19Kf6SZlfpL4is7y2F5FRG7RwGpXVGZXiOc",
  "access_expires_at": "2026-10-28T13:16:01.855804349Z",
  "refresh_token": "akQREXRr4DoOvj1nta_IN6Ax8M2V0XD51gfBZVHxj8Y",
  "refresh_expires_at": "2026-11-27T13:01:01.855217821Z",
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
  "command_id": "29ea3257-28ed-40e1-9fe4-9abdcd090b1b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:01:02Z",
    "sequence": 1793192462276
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3ca73070-3c1d-48df-8633-03cc0ef12e94",
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
  "last_heartbeat_at": "2026-10-28T13:01:02.293403Z",
  "last_location_at": "2026-10-28T13:01:02.293403Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e85f69b4-5365-4157-969d-0090412df8be",
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
  "id": "675d5d96-3d57-4886-90d6-303f61e55ba1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:06:02.521323Z",
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
  "command_id": "d8c7c2b4-9df2-42f2-80f5-abec77287fa7",
  "quote_id": "675d5d96-3d57-4886-90d6-303f61e55ba1",
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
  "id": "54f196c5-13da-485b-bd22-c55776e4dcda",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f580d0b-b463-463c-b8ec-1a3bf7bcd6b9",
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
  "created_at": "2026-10-28T13:01:02.756401Z",
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
    "id": "bbd8ad74-6134-4eb5-9df9-f2f604f288fc",
    "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
    "expires_at": "2026-10-28T13:01:17.759988Z",
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

`POST /api/driver/v1/offers/bbd8ad74-6134-4eb5-9df9-f2f604f288fc/accept` → **200**

```json
{
  "command_id": "b855d451-b3d2-40a5-ba2e-b7933e15371e"
}
```

```json
{
  "id": "f9cfff93-85e6-43c1-aeae-39633069a651",
  "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "062503a8-5b13-41aa-a9e6-fd23649272cc",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "062503a8-5b13-41aa-a9e6-fd23649272cc",
  "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
  "assignment_id": "f9cfff93-85e6-43c1-aeae-39633069a651",
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

`POST /api/driver/v1/trips/062503a8-5b13-41aa-a9e6-fd23649272cc/cancel` → **200**

```json
{
  "command_id": "52fb472f-27f6-4bcf-9934-d30340da8508",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "062503a8-5b13-41aa-a9e6-fd23649272cc",
  "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
  "assignment_id": "f9cfff93-85e6-43c1-aeae-39633069a651",
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

`GET /api/rider/v1/orders/54f196c5-13da-485b-bd22-c55776e4dcda` → **200**

```json
{
  "id": "54f196c5-13da-485b-bd22-c55776e4dcda",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0f580d0b-b463-463c-b8ec-1a3bf7bcd6b9",
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
    "id": "f9cfff93-85e6-43c1-aeae-39633069a651",
    "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "062503a8-5b13-41aa-a9e6-fd23649272cc",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:01:02.756401Z",
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
    "id": "7bb83763-a8d1-429f-959c-0d3d7fa86887",
    "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
    "expires_at": "2026-10-28T13:01:18.665347Z",
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

`POST /api/driver/v1/offers/7bb83763-a8d1-429f-959c-0d3d7fa86887/accept` → **200**

```json
{
  "command_id": "9c5faa97-f14d-40cc-a79e-6cdff47fc36f"
}
```

```json
{
  "id": "9e616938-26f0-4355-a373-d2c3f18702e4",
  "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "91ee7ecb-889a-4ac2-a303-b6e553dbb71d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "91ee7ecb-889a-4ac2-a303-b6e553dbb71d",
  "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
  "assignment_id": "9e616938-26f0-4355-a373-d2c3f18702e4",
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

`POST /api/driver/v1/trips/91ee7ecb-889a-4ac2-a303-b6e553dbb71d/cancel` → **200**

```json
{
  "command_id": "df29bad2-d765-4ada-abec-371900fb4235",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "91ee7ecb-889a-4ac2-a303-b6e553dbb71d",
  "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
  "assignment_id": "9e616938-26f0-4355-a373-d2c3f18702e4",
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
    "id": "54f196c5-13da-485b-bd22-c55776e4dcda",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:01:02.756401Z",
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
    "id": "59805bda-f9ff-409c-9cab-b632dceaf61f",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:01:00.445757Z",
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

`GET /api/operator/v1/orders/54f196c5-13da-485b-bd22-c55776e4dcda/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:01:02.757001Z",
      "actor": {
        "type": "CLIENT",
        "id": "0f580d0b-b463-463c-b8ec-1a3bf7bcd6b9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
        "quote_id": "675d5d96-3d57-4886-90d6-303f61e55ba1",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "ec806dcd-baf8-48ed-a2a9-6d0eca3d092c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:01:02.759013Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
        "attempt_id": "45731634-3ca6-410e-abd9-3a026a0a2dfc",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ec806dcd-baf8-48ed-a2a9-6d0eca3d092c"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:01:02.76575Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bbd8ad74-6134-4eb5-9df9-f2f604f288fc",
        "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "ec806dcd-baf8-48ed-a2a9-6d0eca3d092c"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:01:03.209559Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bbd8ad74-6134-4eb5-9df9-f2f604f288fc",
        "order_id": "54f196c5-13da-485b-bd22-c55776e4dcda",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "f9cfff93-85e6-43c1-aeae-39633069a651"
      },
      "correlation_id": "ca599765-a045-49c4-9862-7dd1b2fe6145"
```

Done: orders 59805bda-f9ff-409c-9cab-b632dceaf61f, 54f196c5-13da-485b-bd22-c55776e4dcda.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732293892",
  "device_ref": "sandbox-31397"
}
```

```json
{
  "challenge_id": "cb31006b-07c9-49b4-babd-eacc99049ca2",
  "expires_at": "2026-10-28T13:06:05.615244216Z",
  "resend_available_at": "2026-10-28T13:01:06.615244216Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732293892` → **200**

```json
{
  "phone": "+380732293892",
  "audience": "CLIENT",
  "code": "906444",
  "sent_at": "2026-10-28T13:01:05.617670735Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb31006b-07c9-49b4-babd-eacc99049ca2",
  "code": "906444",
  "device_ref": "sandbox-31397"
}
```

```json
{
  "session_id": "8fda18a6-284e-4bd0-8fb7-43c4e289627f",
  "subject": {
    "type": "CLIENT",
    "id": "d9aae185-1ccc-4abd-9e38-617878d7335a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOWFhZTE4NS0xY2NjLTRhYmQtOWUzOC02MTc4NzhkNzMzNWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzMzY1LCJpYXQiOjE3OTMxOTI0NjUsImp0aSI6ImNhMjMxNTI4LWFkMWQtNDExYi05OWU3LTY4ODNlNTBhN2FkYyIsInNpZCI6IjhmZGExOGE2LTI4NGUtNGJkMC04ZmI3LTQzYzRlMjg5NjI3ZiJ9.hw5VW5N96nw4aIAxFZIpVqi_vhOL4Usd7rGgeWZ8j3g",
  "access_expires_at": "2026-10-28T13:16:05.85554295Z",
  "refresh_token": "Z4qllvL8lJF5404wIjA-TpQEDNXXiEW8OTAgN3Fee9A",
  "refresh_expires_at": "2026-11-27T13:01:05.855061578Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "7a6594cd-d5b4-43d1-a61b-d684f2b94e6b",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "85f57d5f-0272-4211-90d3-07c8b69af5e9",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-85f57d5f-0272-4211-90d3-07c8b69af5e9",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a2ce13ecd6879d634b1ce3c750893468",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=85f57d5f-0272-4211-90d3-07c8b69af5e9",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732293892"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=85f57d5f-0272-4211-90d3-07c8b69af5e9",
  "expires_at": "2026-10-28T13:31:06.074764Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/85f57d5f-0272-4211-90d3-07c8b69af5e9` → **200**

```json
{
  "id": "85f57d5f-0272-4211-90d3-07c8b69af5e9",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T13:31:06.074764Z",
  "card": {
    "id": "05c3f000-fa5a-474e-9448-848a7ae931ff",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5517",
    "card_type": "Visa",
    "created_at": "2026-10-28T13:01:06.339709Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "05c3f000-fa5a-474e-9448-848a7ae931ff",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5517",
      "card_type": "Visa",
      "created_at": "2026-10-28T13:01:06.339709Z"
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
  "device_ref": "sandbox-13472"
}
```

```json
{
  "challenge_id": "60f59c4b-d6a4-47db-a5fb-54230eecbe5b",
  "expires_at": "2026-10-28T13:06:06.811392431Z",
  "resend_available_at": "2026-10-28T13:01:07.811392431Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "440997",
  "sent_at": "2026-10-28T13:01:06.813918347Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60f59c4b-d6a4-47db-a5fb-54230eecbe5b",
  "code": "440997",
  "device_ref": "sandbox-13472"
}
```

```json
{
  "session_id": "b08035f3-f124-4c61-a9b7-5fa35148795f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzM2NywiaWF0IjoxNzkzMTkyNDY3LCJqdGkiOiI0ZTgxOWU0ZC0yMTE0LTQ0OTYtOTExMS0zY2VmMWM0YjI0Y2UiLCJzaWQiOiJiMDgwMzVmMy1mMTI0LTRjNjEtYTliNy01ZmEzNTE0ODc5NWYifQ.pi9tyS4Fk2--AMXMDA3KyvoahhJJIzryLiZx8Y0YDYw",
  "access_expires_at": "2026-10-28T13:16:07.050490843Z",
  "refresh_token": "V4I-vp4PrQlWsbHIVZzAwUKojXDLJhTzNVBOWio21y0",
  "refresh_expires_at": "2026-11-27T13:01:07.04987057Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3ca73070-3c1d-48df-8633-03cc0ef12e94",
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
  "last_heartbeat_at": "2026-10-28T13:01:02.293403Z",
  "last_location_at": "2026-10-28T13:01:02.293403Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3ca73070-3c1d-48df-8633-03cc0ef12e94/handover` → **200**

```json
{
  "command_id": "3491c654-0d94-4687-b8e7-720c7dde2be3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3ca73070-3c1d-48df-8633-03cc0ef12e94",
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
  "last_heartbeat_at": "2026-10-28T13:01:02.293403Z",
  "last_location_at": "2026-10-28T13:01:02.293403Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3ca73070-3c1d-48df-8633-03cc0ef12e94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:01:07Z",
    "sequence": 1793192467716
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3ca73070-3c1d-48df-8633-03cc0ef12e94",
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
  "last_heartbeat_at": "2026-10-28T13:01:07.734088Z",
  "last_location_at": "2026-10-28T13:01:07.734088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5c6b0106-4e50-4d14-9802-8c0ba8d65e00",
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
  "id": "8fd59749-bfb6-4cdd-a356-ba0b1c936b60",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:06:07.954852Z",
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
  "command_id": "36fe70b8-b94d-40cb-9993-fe737de2f33a",
  "quote_id": "8fd59749-bfb6-4cdd-a356-ba0b1c936b60",
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
  "id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d9aae185-1ccc-4abd-9e38-617878d7335a",
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
  "created_at": "2026-10-28T13:01:08.180469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae2da5b6-eb8a-4985-beb4-b203291a455f` → **200**

```json
{
  "id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d9aae185-1ccc-4abd-9e38-617878d7335a",
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
  "created_at": "2026-10-28T13:01:08.180469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae2da5b6-eb8a-4985-beb4-b203291a455f` → **200**

```json
{
  "id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d9aae185-1ccc-4abd-9e38-617878d7335a",
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
  "created_at": "2026-10-28T13:01:08.180469Z",
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
    "id": "225dea75-b3e3-485d-8c4a-f9f926e09f49",
    "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
    "expires_at": "2026-10-28T13:01:23.673831Z",
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

`POST /api/driver/v1/offers/225dea75-b3e3-485d-8c4a-f9f926e09f49/accept` → **200**

```json
{
  "command_id": "174634a9-29e5-4bbc-a97f-a5c857eeed3e"
}
```

```json
{
  "id": "b0c85ecd-e0a5-45f8-8fbb-819e1faf847a",
  "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5495ac88-0980-4f62-b0ce-dfeaf214fa77",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5495ac88-0980-4f62-b0ce-dfeaf214fa77",
  "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
  "assignment_id": "b0c85ecd-e0a5-45f8-8fbb-819e1faf847a",
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

`POST /api/driver/v1/work-sessions/3ca73070-3c1d-48df-8633-03cc0ef12e94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:01:10Z",
    "sequence": 1793192470519
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3ca73070-3c1d-48df-8633-03cc0ef12e94",
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
  "last_heartbeat_at": "2026-10-28T13:01:10.536976Z",
  "last_location_at": "2026-10-28T13:01:10.536976Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5495ac88-0980-4f62-b0ce-dfeaf214fa77/arrive` → **200**

```json
{
  "command_id": "6022ecc0-24d9-4580-8aa1-87a9ac37735b",
  "expected_version": 0
}
```

```json
{
  "id": "5495ac88-0980-4f62-b0ce-dfeaf214fa77",
  "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
  "assignment_id": "b0c85ecd-e0a5-45f8-8fbb-819e1faf847a",
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
  "arrived_at": "2026-10-28T13:01:10.761991Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5495ac88-0980-4f62-b0ce-dfeaf214fa77/start` → **200**

```json
{
  "command_id": "d68052e8-ad63-4ecd-935b-1ec98073f467",
  "expected_version": 1
}
```

```json
{
  "id": "5495ac88-0980-4f62-b0ce-dfeaf214fa77",
  "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
  "assignment_id": "b0c85ecd-e0a5-45f8-8fbb-819e1faf847a",
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
  "arrived_at": "2026-10-28T13:01:10.761991Z",
  "started_at": "2026-10-28T13:01:10.998547Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5495ac88-0980-4f62-b0ce-dfeaf214fa77/complete` → **200**

```json
{
  "command_id": "cd5ef9d5-5ba8-4ab9-89e8-e3ffab6c637c",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:01:11Z"
}
```

```json
{
  "id": "5495ac88-0980-4f62-b0ce-dfeaf214fa77",
  "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
  "assignment_id": "b0c85ecd-e0a5-45f8-8fbb-819e1faf847a",
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
  "arrived_at": "2026-10-28T13:01:10.761991Z",
  "started_at": "2026-10-28T13:01:10.998547Z",
  "completed_at": "2026-10-28T13:01:11.228206Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/ae2da5b6-eb8a-4985-beb4-b203291a455f` → **200**

```json
{
  "id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "d9aae185-1ccc-4abd-9e38-617878d7335a",
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
    "id": "b0c85ecd-e0a5-45f8-8fbb-819e1faf847a",
    "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5495ac88-0980-4f62-b0ce-dfeaf214fa77",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:01:08.180469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae2da5b6-eb8a-4985-beb4-b203291a455f` → **200**

```json
{
  "id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "d9aae185-1ccc-4abd-9e38-617878d7335a",
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
    "id": "b0c85ecd-e0a5-45f8-8fbb-819e1faf847a",
    "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5495ac88-0980-4f62-b0ce-dfeaf214fa77",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:01:08.180469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae2da5b6-eb8a-4985-beb4-b203291a455f` → **200**

```json
{
  "id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "d9aae185-1ccc-4abd-9e38-617878d7335a",
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
    "id": "b0c85ecd-e0a5-45f8-8fbb-819e1faf847a",
    "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5495ac88-0980-4f62-b0ce-dfeaf214fa77",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:01:08.180469Z",
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
      "id": "e1c51d24-063e-470c-ab2f-1ca280b44e4e",
      "at": "2026-10-28T13:01:11.719937Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/ae2da5b6-eb8a-4985-beb4-b203291a455f/tip` → **200**

```json
{
  "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
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
  "available_until": "2026-10-29T13:01:11.228206Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ae2da5b6-eb8a-4985-beb4-b203291a455f/tip` → **201**

```json
{
  "command_id": "f8df5a52-f520-460a-ab3d-ea8942a2c673",
  "amount_minor": 2500
}
```

```json
{
  "id": "b51aa99f-d91d-4456-98ef-463e2770ab82",
  "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T13:01:14.786214Z"
}
```

`GET /api/rider/v1/orders/ae2da5b6-eb8a-4985-beb4-b203291a455f/tip` → **200**

```json
{
  "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
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
  "available_until": "2026-10-29T13:01:11.228206Z",
  "open": false,
  "tip": {
    "id": "b51aa99f-d91d-4456-98ef-463e2770ab82",
    "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T13:01:14.786214Z"
  }
}
```

`GET /api/rider/v1/orders/ae2da5b6-eb8a-4985-beb4-b203291a455f/tip` → **200**

```json
{
  "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
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
  "available_until": "2026-10-29T13:01:11.228206Z",
  "open": false,
  "tip": {
    "id": "b51aa99f-d91d-4456-98ef-463e2770ab82",
    "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T13:01:14.786214Z"
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
      "id": "e1c51d24-063e-470c-ab2f-1ca280b44e4e",
      "at": "2026-10-28T13:01:11.719937Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
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
      "id": "3911447a-2965-4811-9eac-349cdbb43d20",
      "at": "2026-10-28T13:01:16.78228Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
      "counterpart_id": null
    },
    {
      "id": "e1c51d24-063e-470c-ab2f-1ca280b44e4e",
      "at": "2026-10-28T13:01:11.719937Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ae2da5b6-eb8a-4985-beb4-b203291a455f",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3ca73070-3c1d-48df-8633-03cc0ef12e94",
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
  "last_heartbeat_at": "2026-10-28T13:01:10.536976Z",
  "last_location_at": "2026-10-28T13:01:10.536976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3ca73070-3c1d-48df-8633-03cc0ef12e94/close` → **200**

```json
{
  "command_id": "d901abc1-02ab-4c97-99d4-a31347eacf2d",
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

Done: card order ae2da5b6-eb8a-4985-beb4-b203291a455f.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733793901",
  "device_ref": "sandbox-7845"
}
```

```json
{
  "challenge_id": "7cb81303-21cc-4afb-bef4-375c7c9858a8",
  "expires_at": "2026-10-28T13:06:18.319147021Z",
  "resend_available_at": "2026-10-28T13:01:19.319147021Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733793901` → **200**

```json
{
  "phone": "+380733793901",
  "audience": "CLIENT",
  "code": "594979",
  "sent_at": "2026-10-28T13:01:18.321721518Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7cb81303-21cc-4afb-bef4-375c7c9858a8",
  "code": "594979",
  "device_ref": "sandbox-7845"
}
```

```json
{
  "session_id": "b7dac1e2-fd44-4ad6-b471-bad83540d41b",
  "subject": {
    "type": "CLIENT",
    "id": "2e8370f1-2428-4bf4-bd89-58d7866a38fb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTgzNzBmMS0yNDI4LTRiZjQtYmQ4OS01OGQ3ODY2YTM4ZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzMzc4LCJpYXQiOjE3OTMxOTI0NzgsImp0aSI6IjUwMGRlODRkLWEzMTktNGQ4OS1iNDZmLTA1ZGMwNmEwODU4YyIsInNpZCI6ImI3ZGFjMWUyLWZkNDQtNGFkNi1iNDcxLWJhZDgzNTQwZDQxYiJ9.A4Yzvz194Hw40oGPAPolkoMAM6hQiKX3kBTHBK0CYH8",
  "access_expires_at": "2026-10-28T13:16:18.558294295Z",
  "refresh_token": "e55NDWZMNyG_z6PiP7c0WoKrVz7Ymj1uzBXTW8BuMi0",
  "refresh_expires_at": "2026-11-27T13:01:18.557852321Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "2e67db30-907c-441e-a378-1a6b8b5d1588",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "5868ec35-94dd-4547-95ee-e5bc0290c451",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-5868ec35-94dd-4547-95ee-e5bc0290c451",
    "orderDate": "1793192478",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "3ca0d0b168524415f600eefd1c6c8063",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=5868ec35-94dd-4547-95ee-e5bc0290c451",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733793901"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=5868ec35-94dd-4547-95ee-e5bc0290c451",
  "created_at": "2026-10-28T13:01:18.776323Z",
  "expires_at": "2026-10-28T13:31:18.776323Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/5868ec35-94dd-4547-95ee-e5bc0290c451` → **200**

```json
{
  "id": "5868ec35-94dd-4547-95ee-e5bc0290c451",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T13:01:18.776323Z",
  "expires_at": "2026-10-28T13:31:18.776323Z",
  "completed_at": "2026-10-28T13:01:19.003168Z",
  "masked_pan": "41****4790",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "2e8370f1-2428-4bf4-bd89-58d7866a38fb",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "2e8370f1-2428-4bf4-bd89-58d7866a38fb",
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
      "id": "f45bdf3b-a0bf-4871-b747-75a04d4d2e8d",
      "at": "2026-10-28T13:01:19.864943Z",
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
  "client_id": "2e8370f1-2428-4bf4-bd89-58d7866a38fb",
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
      "id": "f45bdf3b-a0bf-4871-b747-75a04d4d2e8d",
      "at": "2026-10-28T13:01:19.864943Z",
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
  "device_ref": "sandbox-1254"
}
```

```json
{
  "challenge_id": "973c93d6-0ad5-49d6-887a-1c34c785d3ba",
  "expires_at": "2026-10-28T13:06:20.885719826Z",
  "resend_available_at": "2026-10-28T13:01:21.885719826Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "403512",
  "sent_at": "2026-10-28T13:01:20.888197029Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "973c93d6-0ad5-49d6-887a-1c34c785d3ba",
  "code": "403512",
  "device_ref": "sandbox-1254"
}
```

```json
{
  "session_id": "8ce6f8d7-d144-44cb-82f3-87a1d64b7773",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzM4MSwiaWF0IjoxNzkzMTkyNDgxLCJqdGkiOiIxZDg2YmUxZS1mZGNkLTQ5NWQtYjdjOC04MThjMjA4YThiOGIiLCJzaWQiOiI4Y2U2ZjhkNy1kMTQ0LTQ0Y2ItODJmMy04N2ExZDY0Yjc3NzMifQ.emeoHERZ10zGlRyQz20eRjz-LvwtXyhAh3RA7qd_7kA",
  "access_expires_at": "2026-10-28T13:16:21.127787419Z",
  "refresh_token": "xYF-wJMeGQi5Bg9fLme3o41fWD0lnuG1czs4FbVUULg",
  "refresh_expires_at": "2026-11-27T13:01:21.127298095Z",
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
  "command_id": "989dd88b-57d7-4c72-a712-825eb64eaba8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "4939411b-1361-489d-8b2c-c0a55d18388c",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-4939411b-1361-489d-8b2c-c0a55d18388c",
    "orderDate": "1793192481",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "0b2aaf3678741a876a6320b9d1eff583",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=4939411b-1361-489d-8b2c-c0a55d18388c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=4939411b-1361-489d-8b2c-c0a55d18388c",
  "created_at": "2026-10-28T13:01:21.561596Z",
  "expires_at": "2026-10-28T13:31:21.561596Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/4939411b-1361-489d-8b2c-c0a55d18388c` → **200**

```json
{
  "id": "4939411b-1361-489d-8b2c-c0a55d18388c",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T13:01:21.561596Z",
  "expires_at": "2026-10-28T13:31:21.561596Z",
  "completed_at": "2026-10-28T13:01:21.790035Z",
  "masked_pan": "41****9620",
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
      "id": "4dc361d8-6233-4420-8194-605049a03108",
      "at": "2026-10-28T13:01:21.874826Z",
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
  "command_id": "fa007358-524a-472b-9251-3ebb5aabbf6f",
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
  "correlation_id": "389eb402-5219-49ad-842d-55742d244133"
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
  "session_id": "0c3774c4-ce48-43e7-8fa3-2dff9db28f93",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTMzODIsImlhdCI6MTc5MzE5MjQ4MiwianRpIjoiZWFlMzZlZDctM2I5Yy00ZTY5LWExZTktZDdiYzg2N2JhNzExIiwic2lkIjoiMGMzNzc0YzQtY2U0OC00M2U3LThmYTMtMmRmZjlkYjI4ZjkzIn0.rgozENoPZ2Cpf7HV629KEtHs3NVo5EZPIsZD92rJJAc",
  "access_expires_at": "2026-10-28T13:16:22.799036576Z",
  "refresh_token": "FwNkvTRwxOpL_gmaI71EaxeZ2Axiko_9sWc-kZJszgk",
  "refresh_expires_at": "2026-10-29T01:01:22.798538229Z",
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
  "phone": "+48600623671",
  "device_ref": "sandbox-19748"
}
```

```json
{
  "challenge_id": "c07ac7b1-dd24-4fbc-909c-6e488b01e32a",
  "expires_at": "2026-10-28T13:06:23.46267162Z",
  "resend_available_at": "2026-10-28T13:01:24.46267162Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600623671` → **200**

```json
{
  "phone": "+48600623671",
  "audience": "CLIENT",
  "code": "317399",
  "sent_at": "2026-10-28T13:01:23.464955259Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c07ac7b1-dd24-4fbc-909c-6e488b01e32a",
  "code": "317399",
  "device_ref": "sandbox-19748"
}
```

```json
{
  "session_id": "e5c8ec80-4b73-49a3-823d-dd0c3553342e",
  "subject": {
    "type": "CLIENT",
    "id": "c017eda6-aad4-4a17-8f2a-ccbef49637c0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDE3ZWRhNi1hYWQ0LTRhMTctOGYyYS1jY2JlZjQ5NjM3YzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzMzgzLCJpYXQiOjE3OTMxOTI0ODMsImp0aSI6IjRkMzk3ODI0LTYxNzctNGIzNy1iYmQwLTQ3MjEzZGIyZjZiNyIsInNpZCI6ImU1YzhlYzgwLTRiNzMtNDlhMy04MjNkLWRkMGMzNTUzMzQyZSJ9.Ja2Kam4h5mU9LOnvB4D-Ikj2n0PmgzM_C5ZgGngTOeg",
  "access_expires_at": "2026-10-28T13:16:23.703485922Z",
  "refresh_token": "w8ePTqaZG7paMwHK_6zrev8J8NPCZcFJQdKX-L0lYLo",
  "refresh_expires_at": "2026-11-27T13:01:23.703053713Z",
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
  "command_id": "8369788e-6c8c-4036-8304-6528f4a3905b",
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
  "correlation_id": "aff1fe15-66a9-47ae-86f3-39cdb2cb6c10",
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
  "command_id": "e8ab4264-d6a3-40a5-831d-4094391f5c1c",
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
  "paused_at": "2026-10-28T13:01:24.652158041Z",
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
  "command_id": "2cf1abf7-b7c4-4a3a-a9ef-53b3b6bb4700",
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
  "id": "9fa13f6d-bc9a-47f1-ae8c-b82fe2a345ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:06:25.130380Z",
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
  "command_id": "7ff43cff-2e15-4c6c-b291-221b6e592f48",
  "quote_id": "9fa13f6d-bc9a-47f1-ae8c-b82fe2a345ad",
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
  "correlation_id": "4aea6537-bed5-43cd-9aca-e294342055c1"
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
  "paused_at": "2026-10-28T13:01:24.652158Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "b8b1f4b9-e224-4a94-bdd9-df73bde534ea",
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
  "command_id": "82285fb2-c150-4bad-8042-09f637b857b6",
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
  "command_id": "f8399c2e-be83-4ab3-aac8-723bf07f61e6",
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
  "id": "b960f203-9e1f-4550-9ece-216d8e84cf56",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:06:26.452876Z",
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
  "command_id": "f48bd5d8-9578-4831-97fe-6e4198b98151",
  "quote_id": "b960f203-9e1f-4550-9ece-216d8e84cf56",
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
  "correlation_id": "64016968-d4c4-4573-803b-4fa6eb12be02"
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
  "command_id": "c1cdcf6c-e08f-4cbf-96d4-d958a9f68e85",
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
  "command_id": "3d69b41b-0019-44e6-9c67-ff65e684b1fe",
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
  "id": "5b637e56-d2d6-47c4-964d-80606426c6d7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:06:27.613609Z",
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
  "command_id": "0ccf297f-df8d-455b-bb4c-043bc5a3ae36",
  "quote_id": "5b637e56-d2d6-47c4-964d-80606426c6d7",
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
  "correlation_id": "482272cd-5c23-4ccc-9e28-7c4c779f5e22"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "b82c9c20-5907-43a1-a9bd-d1d63ef161a5",
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
  "correlation_id": "3cba9a2f-bbd8-48e4-bd47-c55980d03421"
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
  "command_id": "1b79fa3a-8d9e-4ea0-9dda-a0b25877dbbb",
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
  "phone": "+380676497054",
  "device_ref": "sandbox-5371"
}
```

```json
{
  "challenge_id": "d796ad46-333d-41e4-afe1-f7259acde18b",
  "expires_at": "2026-10-28T13:06:28.724105121Z",
  "resend_available_at": "2026-10-28T13:01:29.724105121Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676497054` → **200**

```json
{
  "phone": "+380676497054",
  "audience": "CLIENT",
  "code": "924738",
  "sent_at": "2026-10-28T13:01:28.726172249Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d796ad46-333d-41e4-afe1-f7259acde18b",
  "code": "924738",
  "device_ref": "sandbox-5371"
}
```

```json
{
  "session_id": "8da3c258-a074-4b3c-90f6-cc425ee8bb33",
  "subject": {
    "type": "CLIENT",
    "id": "4cf75c51-fae4-497b-a138-dec2c0e949eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2Y3NWM1MS1mYWU0LTQ5N2ItYTEzOC1kZWMyYzBlOTQ5ZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzMzg5LCJpYXQiOjE3OTMxOTI0ODksImp0aSI6ImY0OWY4Y2U5LWM5ZjUtNGE2My1iMTY0LTU3ZTkxYTFlZTcyYiIsInNpZCI6IjhkYTNjMjU4LWEwNzQtNGIzYy05MGY2LWNjNDI1ZWU4YmIzMyJ9.OFYEqeRTNkumeGurcio2MykW88OppWS5CWW0CJNkcrE",
  "access_expires_at": "2026-10-28T13:16:29.00912308Z",
  "refresh_token": "RpJdRasM1w_aeijcrOvKoKP0mXAHJWQLzk3tlPRBjJo",
  "refresh_expires_at": "2026-11-27T13:01:29.008589361Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4cf75c51-fae4-497b-a138-dec2c0e949eb",
  "session_id": "8da3c258-a074-4b3c-90f6-cc425ee8bb33",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3302ed9c-6139-4535-8c00-708c94da4ce2",
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
  "id": "c41f3f04-0d51-4e85-afc2-9a2b1e06b118",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:06:29.558676Z",
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
  "challenge_id": "ba288e6c-2ab8-4193-a44a-e65fd518205b",
  "expires_at": "2026-10-28T13:06:31.781086884Z",
  "resend_available_at": "2026-10-28T13:01:32.781086884Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676497054` → **200**

```json
{
  "phone": "+380676497054",
  "audience": "CLIENT",
  "code": "297060",
  "sent_at": "2026-10-28T13:01:31.783250986Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "02bcc39e-b58d-41d0-8a85-d3bfa8e4e785",
  "challenge_id": "ba288e6c-2ab8-4193-a44a-e65fd518205b",
  "otp_code": "297060"
}
```

```json
{
  "client_id": "4cf75c51-fae4-497b-a138-dec2c0e949eb",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T13:01:32.029567541Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "55dca43c-09b2-46b0-9f02-6886cb02b632",
  "quote_id": "c41f3f04-0d51-4e85-afc2-9a2b1e06b118",
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
  "correlation_id": "0ce344dd-16b0-46d6-9bc5-1d3a6f591eeb"
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
  "session_id": "0d925dbb-8e71-4cb2-83e7-8d1b5f0a1cf4",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTMzOTIsImlhdCI6MTc5MzE5MjQ5MiwianRpIjoiMjZhOGIxY2EtZTg3Mi00M2FiLTlhOTgtM2Q3NWU4ZmQyOWRiIiwic2lkIjoiMGQ5MjVkYmItOGU3MS00Y2IyLTgzZTctOGQxYjVmMGExY2Y0In0.9ZRdPWIWf-Nbb-eUE4I3CCRniYQScQFEpSp4D-uD1fk",
  "access_expires_at": "2026-10-28T13:16:32.741597913Z",
  "refresh_token": "z9-rIUM7JZsCQkyBPJR7Q4tP4oLkOCiTK6eE1a2ngJg",
  "refresh_expires_at": "2026-10-29T01:01:32.741047539Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "4cf75c51-fae4-497b-a138-dec2c0e949eb",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T13:01:32.029568Z",
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

`POST /api/admin/v1/client-deletions/4cf75c51-fae4-497b-a138-dec2c0e949eb/complete` → **200**

```json
{
  "command_id": "b0decbdd-8f0f-4ed6-b4ee-d04ce4a1afd9",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "4cf75c51-fae4-497b-a138-dec2c0e949eb",
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
  "correlation_id": "a3521908-15b2-438e-b890-224b9814c1d4"
}
```

Done: client 4cf75c51-fae4-497b-a138-dec2c0e949eb anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669428875",
  "device_ref": "sandbox-21630"
}
```

```json
{
  "challenge_id": "4f699379-e170-4792-ada6-13d5ae55bbe8",
  "expires_at": "2026-10-28T13:06:33.630593714Z",
  "resend_available_at": "2026-10-28T13:01:34.630593714Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669428875` → **200**

```json
{
  "phone": "+380669428875",
  "audience": "CLIENT",
  "code": "784994",
  "sent_at": "2026-10-28T13:01:33.690583178Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f699379-e170-4792-ada6-13d5ae55bbe8",
  "code": "784994",
  "device_ref": "sandbox-21630"
}
```

```json
{
  "session_id": "d788908e-279b-49d9-8f17-f71d300d5344",
  "subject": {
    "type": "CLIENT",
    "id": "678646d0-9598-4127-a7f2-7241f123c534"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Nzg2NDZkMC05NTk4LTQxMjctYTdmMi03MjQxZjEyM2M1MzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzMzkzLCJpYXQiOjE3OTMxOTI0OTMsImp0aSI6IjQ1YjhmMWI3LTY4MmYtNGQwMC1iNjk4LWY0YjA5OTI5Yzk3MiIsInNpZCI6ImQ3ODg5MDhlLTI3OWItNDlkOS04ZjE3LWY3MWQzMDBkNTM0NCJ9.B6kfCJYaaxzCNcOlt_x-sfX9Liwar58LvPoWT5BZD04",
  "access_expires_at": "2026-10-28T13:16:33.992430891Z",
  "refresh_token": "zUNIUzC3DxwYnEBm_3-RPHIkgXgBGeYAegrZyTwF314",
  "refresh_expires_at": "2026-11-27T13:01:33.991816397Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "678646d0-9598-4127-a7f2-7241f123c534",
  "session_id": "d788908e-279b-49d9-8f17-f71d300d5344",
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
  "session_id": "20d4ac21-ef54-4615-bd44-704bc1494c02",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTMzOTQsImlhdCI6MTc5MzE5MjQ5NCwianRpIjoiNTY5NmZmYTktNWM3Yi00OGVlLWJiN2EtODdkN2ZlZDI0YjBmIiwic2lkIjoiMjBkNGFjMjEtZWY1NC00NjE1LWJkNDQtNzA0YmMxNDk0YzAyIn0.-tBsFhHJKedr4HBWJQYrwvYl0-auSJNGyTTg1hr7TCY",
  "access_expires_at": "2026-10-28T13:16:34.676310102Z",
  "refresh_token": "EmbPiMf9KSjm4EhMHjBe6MHEvaF7qcVOWG_KSP938Mw",
  "refresh_expires_at": "2026-10-29T01:01:34.675846657Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9428875&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "678646d0-9598-4127-a7f2-7241f123c534",
      "phone": "+380669428875",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T13:01:33.927824Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/678646d0-9598-4127-a7f2-7241f123c534` → **200**

```json
{
  "client": {
    "id": "678646d0-9598-4127-a7f2-7241f123c534",
    "phone": "+380669428875",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T13:01:33.927824Z",
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

`POST /api/admin/v1/clients/678646d0-9598-4127-a7f2-7241f123c534/block` → **400**

```json
{
  "command_id": "d46d77e6-3cf6-426a-b6ad-5440c29a3d5a",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/678646d0-9598-4127-a7f2-7241f123c534/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7f44e2c0-8ab9-442e-b237-f36da78a1155",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/678646d0-9598-4127-a7f2-7241f123c534/block` → **200**

```json
{
  "command_id": "d07797ae-0054-4dd8-b644-70ea697d3fa6",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "678646d0-9598-4127-a7f2-7241f123c534",
  "phone": "+380669428875",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T13:01:33.927824Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T13:01:35.687646Z",
    "by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
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
  "correlation_id": "5c0a606d-9a98-4efa-9b80-390bcd7628d6"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669428875",
  "device_ref": "sandbox-19542"
}
```

```json
{
  "challenge_id": "811659c3-d9d4-4ec9-8f09-f678099a116e",
  "expires_at": "2026-10-28T13:06:38.127236494Z",
  "resend_available_at": "2026-10-28T13:01:39.127236494Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669428875` → **200**

```json
{
  "phone": "+380669428875",
  "audience": "CLIENT",
  "code": "293256",
  "sent_at": "2026-10-28T13:01:38.129430981Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "811659c3-d9d4-4ec9-8f09-f678099a116e",
  "code": "293256",
  "device_ref": "sandbox-19542"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "443c73cb-78b3-447e-ba64-148bcc0be9b6"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/678646d0-9598-4127-a7f2-7241f123c534` → **200**

```json
{
  "client": {
    "id": "678646d0-9598-4127-a7f2-7241f123c534",
    "phone": "+380669428875",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T13:01:33.927824Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T13:01:35.687646Z",
      "by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
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

`POST /api/admin/v1/clients/678646d0-9598-4127-a7f2-7241f123c534/unblock` → **200**

```json
{
  "command_id": "0aa0a4ad-366e-4be3-a469-86e891fc59af",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "678646d0-9598-4127-a7f2-7241f123c534",
  "phone": "+380669428875",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T13:01:33.927824Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669428875",
  "device_ref": "sandbox-26611"
}
```

```json
{
  "challenge_id": "35c203f2-4061-4a0a-a96a-ddc86cf9b01b",
  "expires_at": "2026-10-28T13:06:41.053728014Z",
  "resend_available_at": "2026-10-28T13:01:42.053728014Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669428875` → **200**

```json
{
  "phone": "+380669428875",
  "audience": "CLIENT",
  "code": "333968",
  "sent_at": "2026-10-28T13:01:41.058815436Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35c203f2-4061-4a0a-a96a-ddc86cf9b01b",
  "code": "333968",
  "device_ref": "sandbox-26611"
}
```

```json
{
  "session_id": "5435e3c4-4d5c-49ce-adb6-428eb7b2216e",
  "subject": {
    "type": "CLIENT",
    "id": "678646d0-9598-4127-a7f2-7241f123c534"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Nzg2NDZkMC05NTk4LTQxMjctYTdmMi03MjQxZjEyM2M1MzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDAxLCJpYXQiOjE3OTMxOTI1MDEsImp0aSI6ImRhYmJhYjc2LTljMDQtNGVmOS1iMGQxLWQ5NDhhZGZkZmRlNSIsInNpZCI6IjU0MzVlM2M0LTRkNWMtNDljZS1hZGI2LTQyOGViN2IyMjE2ZSJ9.TdL28JUFpRAYpWiSoskellfDLF9AVwnBXdXNZIeOt98",
  "access_expires_at": "2026-10-28T13:16:41.295315819Z",
  "refresh_token": "kYcxPJsI4R_raNk1trqjdZXXR1R7E1oOEzE3zuxx55E",
  "refresh_expires_at": "2026-11-27T13:01:41.29476892Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "678646d0-9598-4127-a7f2-7241f123c534",
  "session_id": "5435e3c4-4d5c-49ce-adb6-428eb7b2216e",
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
  "phone": "+380668069016",
  "device_ref": "sandbox-12069"
}
```

```json
{
  "challenge_id": "53fdcbce-69b0-4d81-96e3-96dd8843a747",
  "expires_at": "2026-10-28T13:06:41.736322136Z",
  "resend_available_at": "2026-10-28T13:01:42.736322136Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668069016` → **200**

```json
{
  "phone": "+380668069016",
  "audience": "CLIENT",
  "code": "676369",
  "sent_at": "2026-10-28T13:01:41.738185363Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53fdcbce-69b0-4d81-96e3-96dd8843a747",
  "code": "676369",
  "device_ref": "sandbox-12069"
}
```

```json
{
  "session_id": "cd4103f8-f676-44ea-aaa1-d111fbd15680",
  "subject": {
    "type": "CLIENT",
    "id": "30eb3f14-1345-40fe-821e-738efdfa6e75"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMGViM2YxNC0xMzQ1LTQwZmUtODIxZS03MzhlZmRmYTZlNzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDAxLCJpYXQiOjE3OTMxOTI1MDEsImp0aSI6IjEwNTU2MjliLTBhZWItNGQ5NC1hNGRjLWMyYzJkY2MzZDdjMSIsInNpZCI6ImNkNDEwM2Y4LWY2NzYtNDRlYS1hYWExLWQxMTFmYmQxNTY4MCJ9.4rQZ_rWikqM9pw6XSBH0VcdoFVF8hSOoZSjFS2I4_NI",
  "access_expires_at": "2026-10-28T13:16:41.979926745Z",
  "refresh_token": "nao0D04GyFm8gFia9Zt6E1K5SPn75VFuFVEyKAbTGVk",
  "refresh_expires_at": "2026-11-27T13:01:41.979506163Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4df46ae8-bc3c-4b36-9702-e69241f2c3e6",
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
  "id": "76f27782-16b8-4c6b-a145-3028684b5a50",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:06:42.201297Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: bb033216-468c-4a6d-ad9f-87e2e2eb1a00) → **201**

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
  "session_id": "cf5c7ca5-e0c0-40fd-ae16-585d1ca8164a",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0MDIsImlhdCI6MTc5MzE5MjUwMiwianRpIjoiZDI3NWI2MmItNzc0OS00ZGJhLWJjMmYtN2I4NmNjY2M1OGVjIiwic2lkIjoiY2Y1YzdjYTUtZTBjMC00MGZkLWFlMTYtNTg1ZDFjYTgxNjRhIn0.hPnVaq-opYi9Eu5tYOCXIq1SeD2CmzejolfRM6vpSnI",
  "access_expires_at": "2026-10-28T13:16:42.719966616Z",
  "refresh_token": "tlsbTntqrrYQ9cxdVwbdx2MZfNxXgqum46G4JEHGDzs",
  "refresh_expires_at": "2026-10-29T01:01:42.719538803Z",
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
  "session_id": "a60eb29e-55ec-498b-959f-29befbe4479f",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0MDMsImlhdCI6MTc5MzE5MjUwMywianRpIjoiMmI0YzUxOWItMDQ1YS00ZDdlLTk2YjQtMGMzMTY4MDAzYzY2Iiwic2lkIjoiYTYwZWIyOWUtNTVlYy00OThiLTk1OWYtMjliZWZiZTQ0NzlmIn0.Pj3Qmr5nFHV4tbbMW2XLYaOaj9_eLZSwDF9xbYBpEgk",
  "access_expires_at": "2026-10-28T13:16:43.193856047Z",
  "refresh_token": "M_jOfzAneDpspLPy3OLZ2Ih5Azy_hyniaQzETJKCbV8",
  "refresh_expires_at": "2026-10-29T01:01:43.19341242Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d4da6b00-b78a-4b49-9a79-a47706b8e32e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:01:42.428413Z",
      "actor": {
        "type": "CLIENT",
        "id": "30eb3f14-1345-40fe-821e-738efdfa6e75",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d4da6b00-b78a-4b49-9a79-a47706b8e32e",
        "quote_id": "76f27782-16b8-4c6b-a145-3028684b5a50",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "bb033216-468c-4a6d-ad9f-87e2e2eb1a00"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:01:42.430043Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d4da6b00-b78a-4b49-9a79-a47706b8e32e",
        "attempt_id": "82b37133-1738-4f29-abe2-916d8f5a8663",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "bb033216-468c-4a6d-ad9f-87e2e2eb1a00"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T13:01:42.438161Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d4da6b00-b78a-4b49-9a79-a47706b8e32e",
        "attempt_id": "82b37133-1738-4f29-abe2-916d8f5a8663"
      },
      "correlation_id": "bb033216-468c-4a6d-ad9f-87e2e2eb1a00"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "82b37133-1738-4f29-abe2-916d8f5a8663",
        "generation": 1,
        "started_at": "2026-10-28T13:01:42.429114Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T13:01:42.438161Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T13:01:42.430939Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/bb033216-468c-4a6d-ad9f-87e2e2eb1a00` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "d4da6b00-b78a-4b49-9a79-a47706b8e32e:0",
      "order_id": "d4da6b00-b78a-4b49-9a79-a47706b8e32e",
      "at": "2026-10-28T13:01:42.428413Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d4da6b00-b78a-4b49-9a79-a47706b8e32e:1",
      "order_id": "d4da6b00-b78a-4b49-9a79-a47706b8e32e",
      "at": "2026-10-28T13:01:42.430043Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d4da6b00-b78a-4b49-9a79-a47706b8e32e:2",
      "order_id": "d4da6b00-b78a-4b49-9a79-a47706b8e32e",
      "at": "2026-10-28T13:01:42.438161Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/c81fc6ac-6f6e-4e97-92cf-d9426c9027ad` → **200**

```json
{
  "found": []
}
```

Done: request bb033216-468c-4a6d-ad9f-87e2e2eb1a00 — order d4da6b00-b78a-4b49-9a79-a47706b8e32e found by its id.

`GET /api/rider/v1/orders/d4da6b00-b78a-4b49-9a79-a47706b8e32e` → **200**

```json
{
  "id": "d4da6b00-b78a-4b49-9a79-a47706b8e32e",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30eb3f14-1345-40fe-821e-738efdfa6e75",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:01:42.427844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d4da6b00-b78a-4b49-9a79-a47706b8e32e/cancel` → **200**

```json
{
  "command_id": "cbf6dd62-d932-4494-85f1-a409f361220a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d4da6b00-b78a-4b49-9a79-a47706b8e32e",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "30eb3f14-1345-40fe-821e-738efdfa6e75",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:01:42.427844Z",
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
  "phone": "+380635771371",
  "device_ref": "sandbox-22669"
}
```

```json
{
  "challenge_id": "22cf10fe-1179-4464-8968-1c5cb8cc1ad8",
  "expires_at": "2026-10-28T13:06:44.551330808Z",
  "resend_available_at": "2026-10-28T13:01:45.551330808Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635771371` → **200**

```json
{
  "phone": "+380635771371",
  "audience": "CLIENT",
  "code": "497242",
  "sent_at": "2026-10-28T13:01:44.553338709Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22cf10fe-1179-4464-8968-1c5cb8cc1ad8",
  "code": "497242",
  "device_ref": "sandbox-22669"
}
```

```json
{
  "session_id": "ec9e3c94-0bb2-473f-ae0d-f85e8f14ffec",
  "subject": {
    "type": "CLIENT",
    "id": "921cf152-853e-479c-baf8-9590866eea05"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MjFjZjE1Mi04NTNlLTQ3OWMtYmFmOC05NTkwODY2ZWVhMDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDA0LCJpYXQiOjE3OTMxOTI1MDQsImp0aSI6IjMzM2Q1YzgzLTFmNTYtNGQxZS1iZDI4LTRkYTc1YTk0YmEwMiIsInNpZCI6ImVjOWUzYzk0LTBiYjItNDczZi1hZTBkLWY4NWU4ZjE0ZmZlYyJ9.E7WzDwA4Ic77LMCBzsv4sztOQBPu9kpVtnChzRYOybo",
  "access_expires_at": "2026-10-28T13:16:44.789958673Z",
  "refresh_token": "S-0aZZZ1qoPTiC0_XNc19CeBTlWvyAZ_rI0M9EexQi8",
  "refresh_expires_at": "2026-11-27T13:01:44.789515247Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "bd16ff51-9cb3-41e9-9067-bc4f8702c6be",
  "expires_at": "2026-10-28T13:06:47.009818489Z",
  "resend_available_at": "2026-10-28T13:01:48.009818489Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635771371` → **200**

```json
{
  "phone": "+380635771371",
  "audience": "CLIENT",
  "code": "592562",
  "sent_at": "2026-10-28T13:01:47.022742151Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "c54fcc66-a626-417d-8d1e-b412a0f99dca",
  "challenge_id": "bd16ff51-9cb3-41e9-9067-bc4f8702c6be",
  "otp_code": "592562"
}
```

```json
{
  "id": "d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0",
  "state": "PENDING",
  "created_at": "2026-10-28T13:01:47.271214Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0` → **200**

```json
{
  "id": "d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0",
  "state": "PENDING",
  "created_at": "2026-10-28T13:01:47.271214Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0` → **200**

```json
{
  "id": "d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0",
  "state": "PENDING",
  "created_at": "2026-10-28T13:01:47.271214Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0` → **200**

```json
{
  "id": "d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0",
  "state": "PENDING",
  "created_at": "2026-10-28T13:01:47.271214Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0` → **200**

```json
{
  "id": "d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0",
  "state": "PENDING",
  "created_at": "2026-10-28T13:01:47.271214Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0` → **200**

```json
{
  "id": "d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0",
  "state": "PENDING",
  "created_at": "2026-10-28T13:01:47.271214Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0` → **200**

```json
{
  "id": "d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0",
  "state": "PENDING",
  "created_at": "2026-10-28T13:01:47.271214Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0` → **200**

```json
{
  "id": "d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0",
  "state": "PENDING",
  "created_at": "2026-10-28T13:01:47.271214Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0` → **200**

```json
{
  "id": "d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0",
  "state": "PENDING",
  "created_at": "2026-10-28T13:01:47.271214Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0` → **200**

```json
{
  "id": "d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0",
  "state": "READY",
  "created_at": "2026-10-28T13:01:47.271214Z",
  "ready_at": "2026-10-28T13:01:56.178008Z",
  "expires_at": "2026-11-04T13:01:56.178008Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630580258",
  "device_ref": "sandbox-14144"
}
```

```json
{
  "challenge_id": "2380b612-7cb3-4d75-a2ef-28c720b05aae",
  "expires_at": "2026-10-28T13:06:57.416760467Z",
  "resend_available_at": "2026-10-28T13:01:58.416760467Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630580258` → **200**

```json
{
  "phone": "+380630580258",
  "audience": "CLIENT",
  "code": "449767",
  "sent_at": "2026-10-28T13:01:57.418798773Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2380b612-7cb3-4d75-a2ef-28c720b05aae",
  "code": "449767",
  "device_ref": "sandbox-14144"
}
```

```json
{
  "session_id": "8a74d4d6-0980-47ff-ab2c-6395fce4d887",
  "subject": {
    "type": "CLIENT",
    "id": "c8407d41-19f7-483a-ad42-56e247c375bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQwN2Q0MS0xOWY3LTQ4M2EtYWQ0Mi01NmUyNDdjMzc1YmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDE3LCJpYXQiOjE3OTMxOTI1MTcsImp0aSI6IjkxZGQ4MTIxLWRhMzktNDhmYS1iNjgwLTExOTU2MGQ4YjAxNSIsInNpZCI6IjhhNzRkNGQ2LTA5ODAtNDdmZi1hYjJjLTYzOTVmY2U0ZDg4NyJ9.c6cLEAU_QgeqA2Qe5YYx_SVPQXii5Cawgdljf0ab220",
  "access_expires_at": "2026-10-28T13:16:57.653269266Z",
  "refresh_token": "ctPXuqRy2shcNqGTuL0GwrVy2uXf6WVgRu8m-b3VKDA",
  "refresh_expires_at": "2026-11-27T13:01:57.652739742Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "04598bbc-d45d-4907-a903-7ed8397d3f6b"
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
  "session_id": "90dac2e9-0c4d-4675-bf64-f0ad2da593ef",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0MTgsImlhdCI6MTc5MzE5MjUxOCwianRpIjoiNWQwNTQ5Y2ItOWYyYy00YjU5LTg0NWMtMWRlNTBmM2M3ODMyIiwic2lkIjoiOTBkYWMyZTktMGM0ZC00Njc1LWJmNjQtZjBhZDJkYTU5M2VmIn0.yCUrDcdTMiCN8TH6D8WieC3Q-ad3quPMe01BjtFL_i0",
  "access_expires_at": "2026-10-28T13:16:58.34357912Z",
  "refresh_token": "Q9KlDC9tk2dUmThn1Eo9e-ghvD46c8G6Uc47D2VwA1s",
  "refresh_expires_at": "2026-10-29T01:01:58.343118228Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "921cf152-853e-479c-baf8-9590866eea05",
  "session_id": "ec9e3c94-0bb2-473f-ae0d-f85e8f14ffec",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/921cf152-853e-479c-baf8-9590866eea05/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "d5f08ae8-5e4e-4f9a-a2b9-993f8a1fc8b0",
      "state": "READY",
      "created_at": "2026-10-28T13:01:47.271214Z",
      "ready_at": "2026-10-28T13:01:56.178008Z",
      "expires_at": "2026-11-04T13:01:56.178008Z",
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
  "device_ref": "sandbox-8107"
}
```

```json
{
  "challenge_id": "4fe7136f-5da7-4adc-90e0-4f84b80f3790",
  "expires_at": "2026-10-28T13:06:58.978506783Z",
  "resend_available_at": "2026-10-28T13:01:59.978506783Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "950661",
  "sent_at": "2026-10-28T13:01:58.980604011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fe7136f-5da7-4adc-90e0-4f84b80f3790",
  "code": "950661",
  "device_ref": "sandbox-8107"
}
```

```json
{
  "session_id": "c6eadfe8-3202-484f-9fa3-5bd4c14bec19",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzQxOSwiaWF0IjoxNzkzMTkyNTE5LCJqdGkiOiI1M2UyMTViNy0xOTIxLTQwNGUtYTRjMy05NmYxYjYxMDNiNTIiLCJzaWQiOiJjNmVhZGZlOC0zMjAyLTQ4NGYtOWZhMy01YmQ0YzE0YmVjMTkifQ.R1j3Ag_Xgiyt4RInF-4Ggsl4gXmYJNG5s7IBFOk9L80",
  "access_expires_at": "2026-10-28T13:16:59.228704591Z",
  "refresh_token": "ERTEZSCt2WP6qb4ZRu2xrxDwONGPY47lhpqtLE4YT-A",
  "refresh_expires_at": "2026-11-27T13:01:59.228138468Z",
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
  "device_ref": "sandbox-10797"
}
```

```json
{
  "challenge_id": "4c1fe87a-8f5f-47f2-a266-b6e2df3fcc40",
  "expires_at": "2026-10-28T13:06:59.643307385Z",
  "resend_available_at": "2026-10-28T13:02:00.643307385Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "527820",
  "sent_at": "2026-10-28T13:01:59.645274656Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c1fe87a-8f5f-47f2-a266-b6e2df3fcc40",
  "code": "527820",
  "device_ref": "sandbox-10797"
}
```

```json
{
  "session_id": "1c58ea6d-d48f-4819-af5e-f99644d5e097",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzQxOSwiaWF0IjoxNzkzMTkyNTE5LCJqdGkiOiI0ZjRiNzU2Mi1mMmJkLTQ4YmUtYWE3NS05YmJkMzc3MjZjZDgiLCJzaWQiOiIxYzU4ZWE2ZC1kNDhmLTQ4MTktYWY1ZS1mOTk2NDRkNWUwOTcifQ.dJ2pOo-YZlZRbQrleh5CVq2bFLsqZVwr9usPaxHbTWw",
  "access_expires_at": "2026-10-28T13:16:59.885076617Z",
  "refresh_token": "S4LcYnWAMb3eDh63ZcP2hJM7FLZHfxRqJnrh9c_4Pdw",
  "refresh_expires_at": "2026-11-27T13:01:59.884637557Z",
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
  "command_id": "40420964-0097-4026-b529-61c5d898fe63",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:00Z",
    "sequence": 1793192520298
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d6f78bd-7048-45dd-8830-b58edda90660",
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
  "last_heartbeat_at": "2026-10-28T13:02:00.314544Z",
  "last_location_at": "2026-10-28T13:02:00.314544Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-32397"
}
```

```json
{
  "challenge_id": "8ccf637e-cb84-4aad-9938-4d4b8b2a16ec",
  "expires_at": "2026-10-28T13:07:00.526245044Z",
  "resend_available_at": "2026-10-28T13:02:01.526245044Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "878053",
  "sent_at": "2026-10-28T13:02:00.528153663Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ccf637e-cb84-4aad-9938-4d4b8b2a16ec",
  "code": "878053",
  "device_ref": "sandbox-32397"
}
```

```json
{
  "session_id": "31211db4-97e9-4806-9fff-5e1c732187dd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzQyMCwiaWF0IjoxNzkzMTkyNTIwLCJqdGkiOiJjYjRmYWNmOC1lMzBhLTQ3OWYtYmQzMC0zZTMwMDNjZmQ0MzkiLCJzaWQiOiIzMTIxMWRiNC05N2U5LTQ4MDYtOWZmZi01ZTFjNzMyMTg3ZGQifQ.urjMGzPLMDZ0_TLlilBOUa4UKuAT-BhuVTXlqiA1Ym0",
  "access_expires_at": "2026-10-28T13:17:00.765534051Z",
  "refresh_token": "4KPKP-HaMw1UZagSCf56NQnpJg8W-zwoTjUKCgM9DAA",
  "refresh_expires_at": "2026-11-27T13:02:00.765097725Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bdf28abb-6ab5-4788-842e-83bda550e1b3",
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
  "last_heartbeat_at": "2026-10-28T13:01:01.392064Z",
  "last_location_at": "2026-10-28T13:01:01.392064Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bdf28abb-6ab5-4788-842e-83bda550e1b3/handover` → **200**

```json
{
  "command_id": "5a6d709e-0596-4df4-9fa9-9f21ed75b7fe",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bdf28abb-6ab5-4788-842e-83bda550e1b3",
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
  "last_heartbeat_at": "2026-10-28T13:01:01.392064Z",
  "last_location_at": "2026-10-28T13:01:01.392064Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bdf28abb-6ab5-4788-842e-83bda550e1b3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:01Z",
    "sequence": 1793192521414
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bdf28abb-6ab5-4788-842e-83bda550e1b3",
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
  "last_heartbeat_at": "2026-10-28T13:02:01.431204Z",
  "last_location_at": "2026-10-28T13:02:01.431204Z",
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
  "session_id": "8215783a-60fa-4526-a927-0e5875bab74c",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0MjEsImlhdCI6MTc5MzE5MjUyMSwianRpIjoiZjMyMjQwNmQtMjA1OC00ZGYzLTkzMDktNGJhZmIzMzMxNmQ5Iiwic2lkIjoiODIxNTc4M2EtNjBmYS00NTI2LWE5MjctMGU1ODc1YmFiNzRjIn0.0U6hN7B3qctjgOxxK0SDRT2fl9EAi12hp-4xto3d1zI",
  "access_expires_at": "2026-10-28T13:17:01.904097072Z",
  "refresh_token": "0KqQSYRUVKtxk8SdKZnlEqa-_h81ISclVyfpZz6IFdE",
  "refresh_expires_at": "2026-10-29T01:02:01.903559156Z",
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
  "session_id": "457f4032-ac6a-4293-b2ff-a8cd283e602f",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0MjIsImlhdCI6MTc5MzE5MjUyMiwianRpIjoiOWVlNDI5ZWYtZjgyZC00YzY2LWE1M2EtZjgyZGQwYWE0OTBlIiwic2lkIjoiNDU3ZjQwMzItYWM2YS00MjkzLWIyZmYtYThjZDI4M2U2MDJmIn0.HCIMNAOfQs87SnkB11WqFhqd79iDOrOnR5FZ6EjMfFo",
  "access_expires_at": "2026-10-28T13:17:02.388120488Z",
  "refresh_token": "WNI2nYkA1Td5zp9Z2e4bu536D-lDqERSdtL5Z5ON8pU",
  "refresh_expires_at": "2026-10-29T01:02:02.38770249Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684557179",
  "device_ref": "sandbox-2954"
}
```

```json
{
  "challenge_id": "791ed1c8-a6cc-4eaa-aa7b-ec3ed67d7c3c",
  "expires_at": "2026-10-28T13:07:02.600730432Z",
  "resend_available_at": "2026-10-28T13:02:03.600730432Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380684557179` → **200**

```json
{
  "phone": "+380684557179",
  "audience": "CLIENT",
  "code": "722067",
  "sent_at": "2026-10-28T13:02:02.602892761Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "791ed1c8-a6cc-4eaa-aa7b-ec3ed67d7c3c",
  "code": "722067",
  "device_ref": "sandbox-2954"
}
```

```json
{
  "session_id": "2a19e308-bf73-46f5-b9f8-d8d720d21f89",
  "subject": {
    "type": "CLIENT",
    "id": "09963096-5361-4dc9-bedb-906d1a6628ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOTk2MzA5Ni01MzYxLTRkYzktYmVkYi05MDZkMWE2NjI4Y2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDIyLCJpYXQiOjE3OTMxOTI1MjIsImp0aSI6IjA4Y2QxMjc4LTNjZTItNDIxZC1iZjliLWNkZmRhM2IzNTBiZSIsInNpZCI6IjJhMTllMzA4LWJmNzMtNDZmNS1iOWY4LWQ4ZDcyMGQyMWY4OSJ9.z-ztLmIf0XF_Gr6fNSOlBdhyVcpau95Rhqr_H5v4bjU",
  "access_expires_at": "2026-10-28T13:17:02.838704354Z",
  "refresh_token": "-9sQzU4de1Tf8bN4Hx6PcBRFfAAIb_Zs4Oaf9XB_Dgo",
  "refresh_expires_at": "2026-11-27T13:02:02.838231189Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ff4e2e36-473f-4aeb-91d0-4d25eb6a8528",
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
  "id": "4c0b3aef-cd8e-4eb7-a84c-5efa84a5417e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:03.067851Z",
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
  "command_id": "8105d029-a82b-40f8-a58b-6b50755763c8",
  "quote_id": "4c0b3aef-cd8e-4eb7-a84c-5efa84a5417e",
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
  "id": "16945f11-7f1f-4cbf-bcc5-fc5b956b42bf",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "09963096-5361-4dc9-bedb-906d1a6628ca",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:02:03.293212Z",
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
    "id": "bb140205-12c1-4afc-971e-ea9775a8f7c5",
    "order_id": "16945f11-7f1f-4cbf-bcc5-fc5b956b42bf",
    "expires_at": "2026-10-28T13:02:18.295919Z",
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

`POST /api/driver/v1/offers/bb140205-12c1-4afc-971e-ea9775a8f7c5/reject` → **204**

```json
{
  "command_id": "0c81a8c9-a5c4-42fd-b74e-04e9d1849c44"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "20f0cf5f-2f7b-4ee4-bc96-1ac1dc2baf7b",
    "order_id": "16945f11-7f1f-4cbf-bcc5-fc5b956b42bf",
    "expires_at": "2026-10-28T13:02:18.7339Z",
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

`POST /api/driver/v1/offers/20f0cf5f-2f7b-4ee4-bc96-1ac1dc2baf7b/accept` → **200**

```json
{
  "command_id": "3f90c8aa-51db-408e-91f5-0139a452e467"
}
```

```json
{
  "id": "7a67e1f7-d712-460d-9685-6edc0fe13905",
  "order_id": "16945f11-7f1f-4cbf-bcc5-fc5b956b42bf",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4bb25f4a-405e-4bd0-b9b3-c931334296d0",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/16945f11-7f1f-4cbf-bcc5-fc5b956b42bf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:02:03.293637Z",
      "actor": {
        "type": "CLIENT",
        "id": "09963096-5361-4dc9-bedb-906d1a6628ca",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "16945f11-7f1f-4cbf-bcc5-fc5b956b42bf",
        "quote_id": "4c0b3aef-cd8e-4eb7-a84c-5efa84a5417e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ec8f8eb7-e57f-4651-9e53-876b0d4cc7d6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:02:03.295235Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "16945f11-7f1f-4cbf-bcc5-fc5b956b42bf",
        "attempt_id": "f0e2c892-2f7e-4e05-bfb6-fd90576addef",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ec8f8eb7-e57f-4651-9e53-876b0d4cc7d6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:02:03.300477Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bb140205-12c1-4afc-971e-ea9775a8f7c5",
        "order_id": "16945f11-7f1f-4cbf-bcc5-fc5b956b42bf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "ec8f8eb7-e57f-4651-9e53-876b0d4cc7d6"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T13:02:03.73296Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bb140205-12c1-4afc-971e-ea9775a8f7c5",
        "order_id": "16945f11-7f1f-4cbf-bcc5-fc5b956b42bf"
      },
      "correlation_id": "db3bb0f0-4978-4e43-80b2-1acbfffd6002"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 16945f11-7f1f-4cbf-bcc5-fc5b956b42bf — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/16945f11-7f1f-4cbf-bcc5-fc5b956b42bf` → **200**

```json
{
  "id": "16945f11-7f1f-4cbf-bcc5-fc5b956b42bf",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "09963096-5361-4dc9-bedb-906d1a6628ca",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7a67e1f7-d712-460d-9685-6edc0fe13905",
    "order_id": "16945f11-7f1f-4cbf-bcc5-fc5b956b42bf",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4bb25f4a-405e-4bd0-b9b3-c931334296d0",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T13:02:03.293212Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/16945f11-7f1f-4cbf-bcc5-fc5b956b42bf/cancel` → **200**

```json
{
  "command_id": "8fb1022d-b6cb-412f-b83d-4665e299e63b",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "16945f11-7f1f-4cbf-bcc5-fc5b956b42bf",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "09963096-5361-4dc9-bedb-906d1a6628ca",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7a67e1f7-d712-460d-9685-6edc0fe13905",
    "order_id": "16945f11-7f1f-4cbf-bcc5-fc5b956b42bf",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4bb25f4a-405e-4bd0-b9b3-c931334296d0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:02:03.293212Z",
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
  "session_id": "1d6f78bd-7048-45dd-8830-b58edda90660",
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
  "last_heartbeat_at": "2026-10-28T13:02:00.314544Z",
  "last_location_at": "2026-10-28T13:02:00.314544Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1d6f78bd-7048-45dd-8830-b58edda90660/close` → **200**

```json
{
  "command_id": "f3936ce3-e753-4df7-ade9-eca2d5199745",
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
  "session_id": "bdf28abb-6ab5-4788-842e-83bda550e1b3",
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
  "last_heartbeat_at": "2026-10-28T13:02:01.431204Z",
  "last_location_at": "2026-10-28T13:02:01.431204Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bdf28abb-6ab5-4788-842e-83bda550e1b3/close` → **200**

```json
{
  "command_id": "b9fcbb5f-1843-42e1-ae72-90d1a1f619e3",
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
  "device_ref": "sandbox-14813"
}
```

```json
{
  "challenge_id": "123fc2cd-0d92-48db-9e28-a2f6b5919497",
  "expires_at": "2026-10-28T13:07:06.004871233Z",
  "resend_available_at": "2026-10-28T13:02:07.004871233Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "013589",
  "sent_at": "2026-10-28T13:02:06.006757559Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "123fc2cd-0d92-48db-9e28-a2f6b5919497",
  "code": "013589",
  "device_ref": "sandbox-14813"
}
```

```json
{
  "session_id": "d4022ee1-9833-44f0-8ee7-0777fc38e247",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzQyNiwiaWF0IjoxNzkzMTkyNTI2LCJqdGkiOiI1ODE1MGEwYi0xMjhhLTQ3ZGYtOTBlNi05YmJjMTQ3OGFlMTkiLCJzaWQiOiJkNDAyMmVlMS05ODMzLTQ0ZjAtOGVlNy0wNzc3ZmMzOGUyNDcifQ.pwOJSeCprok8CbmCK4Hfm8wDufK_7NWamjUS066otYA",
  "access_expires_at": "2026-10-28T13:17:06.239427571Z",
  "refresh_token": "oKvm9Bs2n0G54x2YKdUWKzkwcRlp7GoCdg1hU8qfrs8",
  "refresh_expires_at": "2026-11-27T13:02:06.238929029Z",
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
  "command_id": "005d83be-7638-43eb-bc49-32547a5cc25d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:06Z",
    "sequence": 1793192526652
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:06.668251Z",
  "last_location_at": "2026-10-28T13:02:06.668251Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678704951",
  "device_ref": "sandbox-1490"
}
```

```json
{
  "challenge_id": "c28690e3-347e-4fa3-830c-598670f68c8b",
  "expires_at": "2026-10-28T13:07:06.880756379Z",
  "resend_available_at": "2026-10-28T13:02:07.880756379Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678704951` → **200**

```json
{
  "phone": "+380678704951",
  "audience": "CLIENT",
  "code": "378469",
  "sent_at": "2026-10-28T13:02:06.882733675Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c28690e3-347e-4fa3-830c-598670f68c8b",
  "code": "378469",
  "device_ref": "sandbox-1490"
}
```

```json
{
  "session_id": "f1ba1983-509b-4648-8372-5244ac271bf6",
  "subject": {
    "type": "CLIENT",
    "id": "2d4ec02a-0a56-4a2c-a4fe-e3a09d250254"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDRlYzAyYS0wYTU2LTRhMmMtYTRmZS1lM2EwOWQyNTAyNTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDI3LCJpYXQiOjE3OTMxOTI1MjcsImp0aSI6IjE5OWZjZTljLTE3NTEtNDA2ZC04YWYyLTU5NWZjYmIzM2VlNSIsInNpZCI6ImYxYmExOTgzLTUwOWItNDY0OC04MzcyLTUyNDRhYzI3MWJmNiJ9.x9h9eu5hY5KkIl3P7Aoa3mPyhCCBlks6PrxhQ6Cs9WE",
  "access_expires_at": "2026-10-28T13:17:07.12553987Z",
  "refresh_token": "5o1kDPpulsy-EmTXNkMMJAeUJ5NIjtjQBEDF7dLTmHI",
  "refresh_expires_at": "2026-11-27T13:02:07.125120789Z",
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
  "command_id": "ec8e6706-bd69-4a75-ab84-80a9884407fd",
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
  "id": "e14ea318-26b6-493e-a68f-52af98a1b39d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:07.555624Z",
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
  "command_id": "ccf4ecf8-ce9d-4034-92dc-00b72cd67b4a",
  "platform": "ANDROID",
  "token": "sandbox-driver-c091c09d-440f-406c-90c1-8ffb7247cbb9"
}
```

```json
{
  "id": "12802e88-bacd-40b9-acee-d75c63de9298",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T13:02:07.780154Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "f0ef168e-309a-41b7-bd07-3fa7acc5260d",
  "platform": "ANDROID",
  "token": "sandbox-rider-85851d03-149e-4c84-9295-4b9ef937cbec"
}
```

```json
{
  "id": "850960be-4425-4a5c-a25d-3b7d19dc8df8",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T13:02:07.997538Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b3dcdec0-6831-45b6-85bb-7900f47185c4",
  "quote_id": "e14ea318-26b6-493e-a68f-52af98a1b39d",
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
  "id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d4ec02a-0a56-4a2c-a4fe-e3a09d250254",
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
  "created_at": "2026-10-28T13:02:08.220114Z",
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
    "id": "41844716-0fae-47f5-9b18-35d59ac05bd6",
    "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
    "expires_at": "2026-10-28T13:02:23.222587Z",
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

`POST /api/driver/v1/offers/41844716-0fae-47f5-9b18-35d59ac05bd6/accept` → **200**

```json
{
  "command_id": "5f3482ac-4350-459a-80c3-061958af0801"
}
```

```json
{
  "id": "370810e1-d4c6-423c-a063-adbe2ef5d6c0",
  "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1a757fd8-06d1-4f64-a9b6-397ea3e3e33d",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T13:02:08.198Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T13:02:08.198Z` → **200**

```json
[
  {
    "at": "2026-10-28T13:02:09.381889288Z",
    "token_suffix": "47cbb9",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "28f99ab9-2d1c-4f4e-af1e-c724969c66e9",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380678704951&after=2026-10-28T13:02:08.198Z` → **200**

```json
[
  {
    "at": "2026-10-28T13:02:09.384014923Z",
    "token_suffix": "37cbec",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "e987eb19-42b1-4df2-a3b6-ce329883453c",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/9c502c0e-641a-4ea3-8f5f-13f8306ce3fa/messages` → **201**

```json
{
  "command_id": "1ade6e21-eb69-44ef-b240-836514f94ac8",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "d5625e4e-6d14-4419-80aa-ebb4f31f8d2b",
  "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T13:02:09.952773584Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1a757fd8-06d1-4f64-a9b6-397ea3e3e33d",
  "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
  "assignment_id": "370810e1-d4c6-423c-a063-adbe2ef5d6c0",
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

`POST /api/driver/v1/trips/1a757fd8-06d1-4f64-a9b6-397ea3e3e33d/messages` → **201**

```json
{
  "command_id": "2665d973-a948-4d74-b427-29dba2defb01",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "3a7a4c5f-2ddb-480a-b483-f57368b12bd1",
  "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T13:02:10.40577Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/9c502c0e-641a-4ea3-8f5f-13f8306ce3fa/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/1a757fd8-06d1-4f64-a9b6-397ea3e3e33d/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678704951"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/01ff3665-e70f-422e-b16c-f3132d515204/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:11Z",
    "sequence": 1793192531198
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:11.035802Z",
  "last_location_at": "2026-10-28T13:02:11.035802Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1a757fd8-06d1-4f64-a9b6-397ea3e3e33d",
  "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
  "assignment_id": "370810e1-d4c6-423c-a063-adbe2ef5d6c0",
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

`POST /api/driver/v1/trips/1a757fd8-06d1-4f64-a9b6-397ea3e3e33d/arrive` → **200**

```json
{
  "command_id": "16156de6-5053-4d9a-bc3d-764d6a06a0d9",
  "expected_version": 0
}
```

```json
{
  "id": "1a757fd8-06d1-4f64-a9b6-397ea3e3e33d",
  "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
  "assignment_id": "370810e1-d4c6-423c-a063-adbe2ef5d6c0",
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
  "arrived_at": "2026-10-28T13:02:11.451404Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1a757fd8-06d1-4f64-a9b6-397ea3e3e33d/start` → **200**

```json
{
  "command_id": "e5377d8e-535f-4c13-a2c1-42c7430ec05a",
  "expected_version": 1
}
```

```json
{
  "id": "1a757fd8-06d1-4f64-a9b6-397ea3e3e33d",
  "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
  "assignment_id": "370810e1-d4c6-423c-a063-adbe2ef5d6c0",
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
  "arrived_at": "2026-10-28T13:02:11.451404Z",
  "started_at": "2026-10-28T13:02:11.668207Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/01ff3665-e70f-422e-b16c-f3132d515204/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:11Z",
    "sequence": 1793192531877
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:11.893939Z",
  "last_location_at": "2026-10-28T13:02:11.893939Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/1a757fd8-06d1-4f64-a9b6-397ea3e3e33d/complete` → **200**

```json
{
  "command_id": "5ca52d47-ac79-4f3c-a033-beadef2240fd",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:02:12Z",
  "cash_received": true
}
```

```json
{
  "id": "1a757fd8-06d1-4f64-a9b6-397ea3e3e33d",
  "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
  "assignment_id": "370810e1-d4c6-423c-a063-adbe2ef5d6c0",
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
  "arrived_at": "2026-10-28T13:02:11.451404Z",
  "started_at": "2026-10-28T13:02:11.668207Z",
  "completed_at": "2026-10-28T13:02:12.128458Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/9c502c0e-641a-4ea3-8f5f-13f8306ce3fa` → **200**

```json
{
  "id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2d4ec02a-0a56-4a2c-a4fe-e3a09d250254",
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
    "id": "370810e1-d4c6-423c-a063-adbe2ef5d6c0",
    "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1a757fd8-06d1-4f64-a9b6-397ea3e3e33d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:02:08.220114Z",
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
    "id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T13:02:08.220114Z",
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
    "id": "1a757fd8-06d1-4f64-a9b6-397ea3e3e33d",
    "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
    "order_short_number": 7,
    "created_at": "2026-10-28T13:02:08.661858Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2f75e288-3601-45f3-9c67-7dcd4bd43afa",
    "order_id": "5bd4641f-4b5b-4295-85f1-abd1d59e60a8",
    "order_short_number": 1,
    "created_at": "2026-10-28T13:00:46.878455Z",
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

`GET /api/rider/v1/orders/9c502c0e-641a-4ea3-8f5f-13f8306ce3fa/tip` → **200**

```json
{
  "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
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
  "available_until": "2026-10-29T13:02:12.128458Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/9c502c0e-641a-4ea3-8f5f-13f8306ce3fa/tip` → **201**

```json
{
  "command_id": "335ca216-a3ac-4d00-baa9-f248ccb1aacb",
  "amount_minor": 1100
}
```

```json
{
  "id": "3f2574ad-1151-4bcf-a4ca-314babc0db5d",
  "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T13:02:16.645743Z"
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
  "session_id": "8a029b14-01bb-473e-b687-776691fb002b",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0MzcsImlhdCI6MTc5MzE5MjUzNywianRpIjoiNTFlZGM1YTAtZTBmMS00ZGZkLTlmMTMtMWY5ZDg3YTg5MGE5Iiwic2lkIjoiOGEwMjliMTQtMDFiYi00NzNlLWI2ODctNzc2NjkxZmIwMDJiIn0.aAmpfllvlb4i9r3atVtOlKjrprCzUmSGUpyaQQkh5Hg",
  "access_expires_at": "2026-10-28T13:17:17.121131302Z",
  "refresh_token": "0Rm-dFCtg_PLcgc9wlA7lOTPS-lgEk7oG_y_8RO6FX0",
  "refresh_expires_at": "2026-10-29T01:02:17.12064359Z",
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
  "generated_at": "2026-10-28T13:02:17.3367056Z"
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
  "generated_at": "2026-10-28T13:02:17.550185204Z"
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
  "session_id": "ff7a5a53-f6d6-415b-836b-7be5766a95b3",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0MzgsImlhdCI6MTc5MzE5MjUzOCwianRpIjoiOTY2OWE2OGYtMjZmYS00YTlhLThlZjktYWQ5YjljZTkxMjZkIiwic2lkIjoiZmY3YTVhNTMtZjZkNi00MTViLTgzNmItN2JlNTc2NmE5NWIzIn0.53GK1sz2f_hu0MbvgkghYyloOK3s4PzclVYTQnBiYG4",
  "access_expires_at": "2026-10-28T13:17:18.019751843Z",
  "refresh_token": "BVfSRJOGFRwD1V3HNf2XOev1frMwGF1FqeBJtPglEIo",
  "refresh_expires_at": "2026-10-29T01:02:18.019301737Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9c502c0e-641a-4ea3-8f5f-13f8306ce3fa/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:02:08.220536Z",
      "actor": {
        "type": "CLIENT",
        "id": "2d4ec02a-0a56-4a2c-a4fe-e3a09d250254",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
        "quote_id": "e14ea318-26b6-493e-a68f-52af98a1b39d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b3086466-f67d-44ea-aabf-f2aa5a714967"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:02:08.221946Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
        "attempt_id": "3544785d-39b5-4d60-8f74-61ac7ed09ce5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b3086466-f67d-44ea-aabf-f2aa5a714967"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:02:08.22699Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "41844716-0fae-47f5-9b18-35d59ac05bd6",
        "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "b3086466-f67d-44ea-aabf-f2aa5a714967"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:02:08.663197Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "41844716-0fae-47f5-9b18-35d59ac05bd6",
        "order_id": "9c502c0e-641a-4ea3-8f5f-13f8306ce3fa",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "370810e1-d4c6-423c-a063-adbe2ef5d6c0"
      },
      "correlation_id": "e1344603-14bf-4ccc-9cd6-0a4c7dd69138"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T13:02:18.445413947Z",
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
      "last_location_at": "2026-10-28T13:02:11.893939Z",
      "order_id": null
    }
  ]
}
```

Done: order 9c502c0e-641a-4ea3-8f5f-13f8306ce3fa.

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
  "session_id": "9757ab20-31ff-4618-be88-2e7860caeefb",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0MzgsImlhdCI6MTc5MzE5MjUzOCwianRpIjoiOWZkZDRmZGItOWZjZS00NTk5LWJhNDItNjliNDkxMGQ3MjgxIiwic2lkIjoiOTc1N2FiMjAtMzFmZi00NjE4LWJlODgtMmU3ODYwY2FlZWZiIn0.n9-hKNJMEoU8qQ4R4-rjbdT7mm7-tkGyInA2Vheuv4M",
  "access_expires_at": "2026-10-28T13:17:18.935872404Z",
  "refresh_token": "fPIfcrXcgF8sMID6gknKV6KVqx2y2-VJV3gYMtEGmNg",
  "refresh_expires_at": "2026-10-29T01:02:18.935428377Z",
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
  "command_id": "3240a6b0-bc43-4c7f-8cfe-7f0f03230e38",
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
  "timestamp": "2026-10-28T13:02:19.000+0000",
  "channel": {
    "id": "1730052000.2924727395",
    "linkedid": "1730052000.2924727395",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670616339"
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
  "timestamp": "2026-10-28T13:02:19.000+0000",
  "channel": {
    "id": "1730052000.2924727395",
    "linkedid": "1730052000.2924727395",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670616339"
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
  "session_id": "7daf9ee7-32eb-491b-86c7-e270cb84f72a",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0MzksImlhdCI6MTc5MzE5MjUzOSwianRpIjoiZTA5YjI3NjEtNThmZS00YTM3LWIxMjktOWMwY2U4YzE2NWM1Iiwic2lkIjoiN2RhZjllZTctMzJlYi00OTFiLTg2YzctZTI3MGNiODRmNzJhIn0.JIHhRsj-LLD-Ik63njHWl3Tt4ihHIOHzTOVsen3I2Jc",
  "access_expires_at": "2026-10-28T13:17:19.863320531Z",
  "refresh_token": "ASprfmrcFydWi7d0OysVg2_hdOnbh9iNHaMMW6zE5To",
  "refresh_expires_at": "2026-10-29T01:02:19.862898988Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "2d47e145-3ea5-4d42-8225-26339b030539",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670616339",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:02:19Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/2d47e145-3ea5-4d42-8225-26339b030539/answer` → **200**

```json
{
  "command_id": "6ff9f247-adf9-4451-a935-69ddb2761e8a"
}
```

```json
{
  "id": "2d47e145-3ea5-4d42-8225-26339b030539",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670616339",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "order_ids": [],
  "started_at": "2026-10-28T13:02:19Z",
  "answered_at": "2026-10-28T13:02:20.30491Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2924727395",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c41a2ff8-26df-4a03-90db-05220986d4f1",
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
  "id": "f6eb2da9-0e03-4c02-865f-badae743adba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:20.549207Z",
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
  "command_id": "6a4d3688-0030-4f9c-b845-989a41ddef5e",
  "quote_id": "f6eb2da9-0e03-4c02-865f-badae743adba",
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
    "phone": "+380670616339"
  },
  "call_id": "2d47e145-3ea5-4d42-8225-26339b030539"
}
```

```json
{
  "id": "4e78b34c-12b0-4476-889f-527183559056",
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
  "created_at": "2026-10-28T13:02:20.785708Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670616339"
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
    "id": "1730052000.2924727395",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "2d47e145-3ea5-4d42-8225-26339b030539",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670616339",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_ids": [
        "4e78b34c-12b0-4476-889f-527183559056"
      ],
      "started_at": "2026-10-28T13:02:19Z",
      "answered_at": "2026-10-28T13:02:20.30491Z",
      "ended_at": "2026-10-28T13:02:21.017662Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "a1ddf7ad-fb2d-4bd4-9e79-9ea1c86fe464",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679961647",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_ids": [],
      "started_at": "2026-10-28T13:00:53.900177Z",
      "answered_at": "2026-10-28T13:00:54.162095Z",
      "ended_at": "2026-10-28T13:00:54.408678Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:00:56.169986Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/4e78b34c-12b0-4476-889f-527183559056` → **200**

```json
{
  "id": "4e78b34c-12b0-4476-889f-527183559056",
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
  "created_at": "2026-10-28T13:02:20.785708Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670616339"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/4e78b34c-12b0-4476-889f-527183559056` → **200**

```json
{
  "id": "4e78b34c-12b0-4476-889f-527183559056",
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
  "created_at": "2026-10-28T13:02:20.785708Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670616339"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4e78b34c-12b0-4476-889f-527183559056/cancel` → **200**

```json
{
  "command_id": "d43d9f95-9371-4f87-bd8d-2a1632586270",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4e78b34c-12b0-4476-889f-527183559056",
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
  "created_at": "2026-10-28T13:02:20.785708Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670616339"
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

Done: call 2d47e145-3ea5-4d42-8225-26339b030539 with order 4e78b34c-12b0-4476-889f-527183559056.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20089"
}
```

```json
{
  "challenge_id": "d73ccb38-c900-433a-bc5a-3eee63cbbddd",
  "expires_at": "2026-10-28T13:07:22.09267777Z",
  "resend_available_at": "2026-10-28T13:02:23.09267777Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "981255",
  "sent_at": "2026-10-28T13:02:22.094457605Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d73ccb38-c900-433a-bc5a-3eee63cbbddd",
  "code": "981255",
  "device_ref": "sandbox-20089"
}
```

```json
{
  "session_id": "8cbf836b-23c2-4ded-87ad-bb2bd931e30e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzQ0MiwiaWF0IjoxNzkzMTkyNTQyLCJqdGkiOiIyOTU3MWU0OS00YTAxLTRmMzgtYTZiMy01NDAyNzE1ZjY1YzciLCJzaWQiOiI4Y2JmODM2Yi0yM2MyLTRkZWQtODdhZC1iYjJiZDkzMWUzMGUifQ.nvyHpZl5IP8n5bk1dN2mFA-SvS_bAc4j-KvBS9PgUZk",
  "access_expires_at": "2026-10-28T13:17:22.333511328Z",
  "refresh_token": "XgOfklKTGKZxkS6JXhFK5QrulGrX0y4GSa-H5fB_7PE",
  "refresh_expires_at": "2026-11-27T13:02:22.333064176Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:11.893939Z",
  "last_location_at": "2026-10-28T13:02:11.893939Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/01ff3665-e70f-422e-b16c-f3132d515204/handover` → **200**

```json
{
  "command_id": "b0346af7-2329-4c12-b3fa-7dad04aa4740",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:11.893939Z",
  "last_location_at": "2026-10-28T13:02:11.893939Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/01ff3665-e70f-422e-b16c-f3132d515204/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:22Z",
    "sequence": 1793192542966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:22.982039Z",
  "last_location_at": "2026-10-28T13:02:22.982039Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666059466",
  "device_ref": "sandbox-30704"
}
```

```json
{
  "challenge_id": "8a3d3412-f910-4ce4-af99-c4e50076ca08",
  "expires_at": "2026-10-28T13:07:23.186939928Z",
  "resend_available_at": "2026-10-28T13:02:24.186939928Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666059466` → **200**

```json
{
  "phone": "+380666059466",
  "audience": "CLIENT",
  "code": "762677",
  "sent_at": "2026-10-28T13:02:23.188728077Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a3d3412-f910-4ce4-af99-c4e50076ca08",
  "code": "762677",
  "device_ref": "sandbox-30704"
}
```

```json
{
  "session_id": "8382f640-3eb7-4a77-b02c-afddca3281f7",
  "subject": {
    "type": "CLIENT",
    "id": "e4e4c2b3-702d-4715-8ff2-0ab798eafebc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGU0YzJiMy03MDJkLTQ3MTUtOGZmMi0wYWI3OThlYWZlYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDQzLCJpYXQiOjE3OTMxOTI1NDMsImp0aSI6Ijc3MmU1NGU2LWVkYjEtNDEwNy05YjI2LTA3ODUwMDIwMWNkMiIsInNpZCI6IjgzODJmNjQwLTNlYjctNGE3Ny1iMDJjLWFmZGRjYTMyODFmNyJ9.sQipoZ8u8iGdivaI14PCDGSc_CjDpnLMR7CvQp9HPGk",
  "access_expires_at": "2026-10-28T13:17:23.419150441Z",
  "refresh_token": "1jCGwlN_tcr8xJBOWWpdJC37GzvJ9MMVJ2Q5Hp5ngcc",
  "refresh_expires_at": "2026-11-27T13:02:23.418703779Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5aef91c3-6b22-49da-b0f9-53068fa87869",
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
  "id": "94df3b85-64f7-401f-8c91-6e757774b58e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:23.631412Z",
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
  "command_id": "027985c0-2eb1-4ec0-a43c-48e20d9b34a5",
  "quote_id": "94df3b85-64f7-401f-8c91-6e757774b58e",
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
  "id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4e4c2b3-702d-4715-8ff2-0ab798eafebc",
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
  "created_at": "2026-10-28T13:02:23.852442Z",
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
    "id": "428fc909-ad75-46a8-adfb-4b3d4891b99c",
    "order_id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
    "expires_at": "2026-10-28T13:02:38.855402Z",
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

`POST /api/driver/v1/offers/428fc909-ad75-46a8-adfb-4b3d4891b99c/accept` → **200**

```json
{
  "command_id": "63e30cb7-a51f-4752-b88b-b70b3ee9048a"
}
```

```json
{
  "id": "7a03538f-a256-4a05-b781-38b2a29c257c",
  "order_id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "98aefe44-5a0d-4454-884a-45f07051ecd1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "98aefe44-5a0d-4454-884a-45f07051ecd1",
  "order_id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
  "assignment_id": "7a03538f-a256-4a05-b781-38b2a29c257c",
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

`POST /api/driver/v1/work-sessions/01ff3665-e70f-422e-b16c-f3132d515204/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:24Z",
    "sequence": 1793192544772
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:24.789356Z",
  "last_location_at": "2026-10-28T13:02:24.789356Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/98aefe44-5a0d-4454-884a-45f07051ecd1/arrive` → **200**

```json
{
  "command_id": "4fd3e2a3-727f-4560-8414-36ecdbffa3bd",
  "expected_version": 0
}
```

```json
{
  "id": "98aefe44-5a0d-4454-884a-45f07051ecd1",
  "order_id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
  "assignment_id": "7a03538f-a256-4a05-b781-38b2a29c257c",
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
  "arrived_at": "2026-10-28T13:02:25.005163Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/98aefe44-5a0d-4454-884a-45f07051ecd1/start` → **200**

```json
{
  "command_id": "c2bcc98a-02a8-40c5-84f8-2645669a2d71",
  "expected_version": 1
}
```

```json
{
  "id": "98aefe44-5a0d-4454-884a-45f07051ecd1",
  "order_id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
  "assignment_id": "7a03538f-a256-4a05-b781-38b2a29c257c",
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
  "arrived_at": "2026-10-28T13:02:25.005163Z",
  "started_at": "2026-10-28T13:02:25.224357Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/01ff3665-e70f-422e-b16c-f3132d515204/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:25Z",
    "sequence": 1793192545437
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:25.454289Z",
  "last_location_at": "2026-10-28T13:02:25.454289Z",
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
  "device_ref": "sandbox-3677"
}
```

```json
{
  "challenge_id": "89faedd7-b5e1-4c6d-a58e-3e8a70784ec6",
  "expires_at": "2026-10-28T13:07:25.659193373Z",
  "resend_available_at": "2026-10-28T13:02:26.659193373Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "519750",
  "sent_at": "2026-10-28T13:02:25.661276275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89faedd7-b5e1-4c6d-a58e-3e8a70784ec6",
  "code": "519750",
  "device_ref": "sandbox-3677"
}
```

```json
{
  "session_id": "2862862d-c99a-4f0c-bdb3-d90a693ae74d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzQ0NSwiaWF0IjoxNzkzMTkyNTQ1LCJqdGkiOiIzY2IzY2ZjNC05ZjlhLTQ1ZmEtOTMwZi02YjE5YmZlNDQ4MTAiLCJzaWQiOiIyODYyODYyZC1jOTlhLTRmMGMtYmRiMy1kOTBhNjkzYWU3NGQifQ.A1_BP6axlM7o3gvUydErzuNbocP_2ijaO09_ehDDMTc",
  "access_expires_at": "2026-10-28T13:17:25.885501144Z",
  "refresh_token": "CUioAc0wXoy10rpczZG6MTFEoTj9s_m1j0xQX1lugyw",
  "refresh_expires_at": "2026-11-27T13:02:25.885053501Z",
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
  "command_id": "6d0b31d2-a75b-4530-b451-b4fbeff8e73b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:26Z",
    "sequence": 1793192546301
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dcda6fdd-cc4c-412b-a5c0-fafe62270718",
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
  "last_heartbeat_at": "2026-10-28T13:02:26.316916Z",
  "last_location_at": "2026-10-28T13:02:26.316916Z",
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
  "session_id": "b319b3e9-6a1e-4ab6-aabc-d113c49d12bc",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0NDYsImlhdCI6MTc5MzE5MjU0NiwianRpIjoiN2EyZmRlMTYtNmYwOC00YjAwLWFlMmMtNTY0OTc3NzU0ZjRhIiwic2lkIjoiYjMxOWIzZTktNmExZS00YWI2LWFhYmMtZDExM2M0OWQxMmJjIn0.hEj5D-DfKdLRuCgrjKno8B2YdZZytfDzkGLRca9ZSWU",
  "access_expires_at": "2026-10-28T13:17:26.784934801Z",
  "refresh_token": "DvgqYeI3SonGaOBURXbMC_mzLxej4HdfNHf7VGwlcA0",
  "refresh_expires_at": "2026-10-29T01:02:26.784498315Z",
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
  "session_id": "7442fd74-960c-42f6-ba13-9031bcdc44f0",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0NDcsImlhdCI6MTc5MzE5MjU0NywianRpIjoiODM4OWQyNTYtYWYzZS00MTRiLWE5YjUtOGZiZGQ0OGM1ZGFhIiwic2lkIjoiNzQ0MmZkNzQtOTYwYy00MmY2LWJhMTMtOTAzMWJjZGM0NGYwIn0.Riwgcr_6g-rpRFdp3UvnyF8qRa-59nNyDww9Ms_1bGA",
  "access_expires_at": "2026-10-28T13:17:27.256915053Z",
  "refresh_token": "KJ6BbOz1AbRdHuBWwa_htRAin0z58e1yofg3m-7-WAo",
  "refresh_expires_at": "2026-10-29T01:02:27.256395429Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/310bdd02-5b05-46f0-b412-85c9a6537dbf` → **200**

```json
{
  "id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e4e4c2b3-702d-4715-8ff2-0ab798eafebc",
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
    "id": "7a03538f-a256-4a05-b781-38b2a29c257c",
    "order_id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "98aefe44-5a0d-4454-884a-45f07051ecd1",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T13:02:23.852442Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/310bdd02-5b05-46f0-b412-85c9a6537dbf/interrupt` → **200**

```json
{
  "command_id": "690fea6c-d7be-42a0-886b-7743a9c9bc94",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "e4e4c2b3-702d-4715-8ff2-0ab798eafebc",
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
      "id": "7a03538f-a256-4a05-b781-38b2a29c257c",
      "order_id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "98aefe44-5a0d-4454-884a-45f07051ecd1",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T13:02:23.852442Z",
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
    "id": "516fef7e-a05f-4fba-85c7-a9fe0c5c5fe3",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "e4e4c2b3-702d-4715-8ff2-0ab798eafebc",
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
    "id": "e1d98951-fdb0-4dce-8303-1d7b47027de1",
    "order_id": "516fef7e-a05f-4fba-85c7-a9fe0c5c5fe3",
    "expires_at": "2026-10-28T13:02:42.708038Z",
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

`POST /api/driver/v1/offers/e1d98951-fdb0-4dce-8303-1d7b47027de1/accept` → **200**

```json
{
  "command_id": "544b3097-7a3e-482d-ac65-ffaa3559194c"
}
```

```json
{
  "id": "9b90948e-c3e7-41f0-94f2-c4731952943b",
  "order_id": "516fef7e-a05f-4fba-85c7-a9fe0c5c5fe3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4c485519-1659-4d24-b8d1-f6cd48efad96",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4c485519-1659-4d24-b8d1-f6cd48efad96",
  "order_id": "516fef7e-a05f-4fba-85c7-a9fe0c5c5fe3",
  "assignment_id": "9b90948e-c3e7-41f0-94f2-c4731952943b",
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
  "session_id": "dcda6fdd-cc4c-412b-a5c0-fafe62270718",
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
  "last_heartbeat_at": "2026-10-28T13:02:26.316916Z",
  "last_location_at": "2026-10-28T13:02:26.316916Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/dcda6fdd-cc4c-412b-a5c0-fafe62270718/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:28Z",
    "sequence": 1793192548787
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dcda6fdd-cc4c-412b-a5c0-fafe62270718",
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
  "last_heartbeat_at": "2026-10-28T13:02:28.803843Z",
  "last_location_at": "2026-10-28T13:02:28.803843Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4c485519-1659-4d24-b8d1-f6cd48efad96/arrive` → **200**

```json
{
  "command_id": "e7e1882c-b51d-44d8-b34e-e9f09045d081",
  "expected_version": 0
}
```

```json
{
  "id": "4c485519-1659-4d24-b8d1-f6cd48efad96",
  "order_id": "516fef7e-a05f-4fba-85c7-a9fe0c5c5fe3",
  "assignment_id": "9b90948e-c3e7-41f0-94f2-c4731952943b",
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
  "arrived_at": "2026-10-28T13:02:29.091626Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4c485519-1659-4d24-b8d1-f6cd48efad96/start` → **200**

```json
{
  "command_id": "a5e2659f-4f03-43c8-9a3b-eca5bb35cd94",
  "expected_version": 1
}
```

```json
{
  "id": "4c485519-1659-4d24-b8d1-f6cd48efad96",
  "order_id": "516fef7e-a05f-4fba-85c7-a9fe0c5c5fe3",
  "assignment_id": "9b90948e-c3e7-41f0-94f2-c4731952943b",
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
  "arrived_at": "2026-10-28T13:02:29.091626Z",
  "started_at": "2026-10-28T13:02:29.313052Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4c485519-1659-4d24-b8d1-f6cd48efad96/complete` → **200**

```json
{
  "command_id": "1d72f35d-b0a3-4d20-8a15-547a07f1c35f",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:02:29Z"
}
```

```json
{
  "id": "4c485519-1659-4d24-b8d1-f6cd48efad96",
  "order_id": "516fef7e-a05f-4fba-85c7-a9fe0c5c5fe3",
  "assignment_id": "9b90948e-c3e7-41f0-94f2-c4731952943b",
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
  "arrived_at": "2026-10-28T13:02:29.091626Z",
  "started_at": "2026-10-28T13:02:29.313052Z",
  "completed_at": "2026-10-28T13:02:29.534632Z",
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
    "id": "516fef7e-a05f-4fba-85c7-a9fe0c5c5fe3",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T13:02:27.699476Z",
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
    "id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:02:23.852442Z",
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

`GET /api/operator/v1/orders/310bdd02-5b05-46f0-b412-85c9a6537dbf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:02:23.85293Z",
      "actor": {
        "type": "CLIENT",
        "id": "e4e4c2b3-702d-4715-8ff2-0ab798eafebc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
        "quote_id": "94df3b85-64f7-401f-8c91-6e757774b58e",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "c7f44b8e-de42-42d0-bb21-fd516f1e930d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:02:23.854624Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
        "attempt_id": "d1e95f07-26e9-4985-983f-9f3992672ade",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c7f44b8e-de42-42d0-bb21-fd516f1e930d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:02:23.857634Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "428fc909-ad75-46a8-adfb-4b3d4891b99c",
        "order_id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "c7f44b8e-de42-42d0-bb21-fd516f1e930d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:02:24.28625Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "428fc909-ad75-46a8-adfb-4b3d4891b99c",
        "order_id": "310bdd02-5b05-46f0-b412-85c9a6537dbf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "7a03538f-a256-4a05-b781-38b2a29c257c"
      },
      "correlation_id": "3f70a07c-9597-440d-a7a1-f6368ec2a311"
```

Done: interrupted 310bdd02-5b05-46f0-b412-85c9a6537dbf, follow-up 516fef7e-a05f-4fba-85c7-a9fe0c5c5fe3.

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
  "session_id": "00108ff0-3c17-43b5-a60e-7215aed29bee",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0NTMsImlhdCI6MTc5MzE5MjU1MywianRpIjoiNzRmNTZkZGItNTMyYi00ODg5LWEzMTQtNzE5Y2QwMTk1ZjBhIiwic2lkIjoiMDAxMDhmZjAtM2MxNy00M2I1LWE2MGUtNzIxNWFlZDI5YmVlIn0.kKqrPyexXzE3eHmPuNiYTlsST-pxERcRUxb6zi2tezg",
  "access_expires_at": "2026-10-28T13:17:33.658883049Z",
  "refresh_token": "z7KAki_yewcMEoX2k54AdmoRGQI2vj0gzB73WmD9qoc",
  "refresh_expires_at": "2026-10-29T01:02:33.658445121Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "8002c82d-713d-452e-a78d-c912366e7042",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:02:33Z"
}
```

```json
{
  "id": "65e00ba8-52c8-4e6c-a94d-e773152beb95",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:02:33Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/65e00ba8-52c8-4e6c-a94d-e773152beb95/publish` → **200**

```json
{
  "command_id": "98ec6d74-78f0-42ba-8b88-71db35c0c888",
  "expected_version": 0
}
```

```json
{
  "id": "65e00ba8-52c8-4e6c-a94d-e773152beb95",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:02:34.104297Z",
  "published_at": "2026-10-28T13:02:34.104297Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "65e00ba8-52c8-4e6c-a94d-e773152beb95",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T13:02:34.104297Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630662733",
  "device_ref": "sandbox-248"
}
```

```json
{
  "challenge_id": "aada1976-ba31-4710-9151-968cad8bad92",
  "expires_at": "2026-10-28T13:07:34.525188171Z",
  "resend_available_at": "2026-10-28T13:02:35.525188171Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630662733` → **200**

```json
{
  "phone": "+380630662733",
  "audience": "CLIENT",
  "code": "178918",
  "sent_at": "2026-10-28T13:02:34.527257533Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aada1976-ba31-4710-9151-968cad8bad92",
  "code": "178918",
  "device_ref": "sandbox-248"
}
```

```json
{
  "session_id": "b8fc821c-ed22-4b7f-bb28-30e45146c0d2",
  "subject": {
    "type": "CLIENT",
    "id": "b6ad2051-1afc-4c95-bce2-c85874488692"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNmFkMjA1MS0xYWZjLTRjOTUtYmNlMi1jODU4NzQ0ODg2OTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDU0LCJpYXQiOjE3OTMxOTI1NTQsImp0aSI6IjM0ZTNhYjQ4LWU1ZmYtNGYwNi1iMjMzLTI5MmUwNTA4NjE0MSIsInNpZCI6ImI4ZmM4MjFjLWVkMjItNGI3Zi1iYjI4LTMwZTQ1MTQ2YzBkMiJ9.6zpGtUAcqjXHcUmHh0SymJDK249Av5PeW-VM9vneibI",
  "access_expires_at": "2026-10-28T13:17:34.757624189Z",
  "refresh_token": "ngT0jYh_cwniw-YJ675nEZPBMtJWveGNNMCQ2Lkehss",
  "refresh_expires_at": "2026-11-27T13:02:34.757218679Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "65e00ba8-52c8-4e6c-a94d-e773152beb95",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T13:02:34.104297Z",
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
  "command_id": "607c65e1-7cde-416b-bd36-a9e59b98816d",
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
  "id": "6b6d8e2e-157b-406b-953f-dacea77f5952",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:35.173449Z",
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
  "command_id": "a95138f2-5251-4243-8d22-74c01418e4c9",
  "quote_id": "6b6d8e2e-157b-406b-953f-dacea77f5952",
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
  "correlation_id": "1c6d28c5-32cb-4301-bd11-832f7d22d2c3"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "ce71535d-68fb-440d-9cbd-1b679b8eb5b1",
  "version_id": "65e00ba8-52c8-4e6c-a94d-e773152beb95",
  "language": "uk"
}
```

```json
{
  "version_id": "65e00ba8-52c8-4e6c-a94d-e773152beb95",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T13:02:35.619298Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b8412990-248c-43f3-880b-5c3dc40f5368",
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
  "id": "c0e4e453-ab8d-4d0b-a5de-90c929baa6cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:35.834604Z",
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
  "command_id": "c23e3df0-6a06-4f09-a7dd-0b23efbe6117",
  "quote_id": "c0e4e453-ab8d-4d0b-a5de-90c929baa6cc",
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
  "id": "b769922b-a567-4301-a1d0-0067094c11cb",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b6ad2051-1afc-4c95-bce2-c85874488692",
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
  "created_at": "2026-10-28T13:02:36.051211Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b769922b-a567-4301-a1d0-0067094c11cb` → **200**

```json
{
  "id": "b769922b-a567-4301-a1d0-0067094c11cb",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b6ad2051-1afc-4c95-bce2-c85874488692",
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
  "created_at": "2026-10-28T13:02:36.051211Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b769922b-a567-4301-a1d0-0067094c11cb/cancel` → **200**

```json
{
  "command_id": "caa9b812-65dd-480c-9d3d-d04e9b08d1b9",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b769922b-a567-4301-a1d0-0067094c11cb",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b6ad2051-1afc-4c95-bce2-c85874488692",
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
  "created_at": "2026-10-28T13:02:36.051211Z",
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

`POST /api/admin/v1/legal-documents/65e00ba8-52c8-4e6c-a94d-e773152beb95` → **409**

```json
{
  "command_id": "55bdf102-4e7e-43be-b4f2-b966a226d06f",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:02:36Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/65e00ba8-52c8-4e6c-a94d-e773152beb95",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "698ac5e0-120b-4190-a9c2-7e0202bee9af"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "4116a10e-1521-4ac3-bf9e-6925ad5f9d74",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:02:36Z"
}
```

```json
{
  "id": "c66cb138-e591-4cd7-a81b-3f50c54896d9",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:02:36Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/c66cb138-e591-4cd7-a81b-3f50c54896d9/publish` → **200**

```json
{
  "command_id": "273852bc-0a2d-4323-8a3a-c00281990a04",
  "expected_version": 0
}
```

```json
{
  "id": "c66cb138-e591-4cd7-a81b-3f50c54896d9",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:02:37.198709Z",
  "published_at": "2026-10-28T13:02:37.198709Z",
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
  "device_ref": "sandbox-24140"
}
```

```json
{
  "challenge_id": "d6e14214-276d-4ad0-997a-d3cd5c21ee8c",
  "expires_at": "2026-10-28T13:07:37.42577143Z",
  "resend_available_at": "2026-10-28T13:02:38.42577143Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "430343",
  "sent_at": "2026-10-28T13:02:37.427815955Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6e14214-276d-4ad0-997a-d3cd5c21ee8c",
  "code": "430343",
  "device_ref": "sandbox-24140"
}
```

```json
{
  "session_id": "d138eeee-1224-4488-8c74-d2cb984ec61c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzQ1NywiaWF0IjoxNzkzMTkyNTU3LCJqdGkiOiI4MmIzZTA2ZS0yNWQwLTRlMTItYjg1NS0yYzk1YjFkNmI1MTEiLCJzaWQiOiJkMTM4ZWVlZS0xMjI0LTQ0ODgtOGM3NC1kMmNiOTg0ZWM2MWMifQ.EXExWGKs6HvVKU2YQT4ZpEz_GZggF7FVpu8GGvb1OzU",
  "access_expires_at": "2026-10-28T13:17:37.65619584Z",
  "refresh_token": "Hl47tIyHZZ09cEfxIoM3QHQ1iwB2knq-784Mh-2dJcw",
  "refresh_expires_at": "2026-11-27T13:02:37.65576379Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dcda6fdd-cc4c-412b-a5c0-fafe62270718",
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
  "last_heartbeat_at": "2026-10-28T13:02:28.803843Z",
  "last_location_at": "2026-10-28T13:02:28.803843Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dcda6fdd-cc4c-412b-a5c0-fafe62270718/handover` → **200**

```json
{
  "command_id": "8746ca80-0801-4aff-8724-35466890b0f0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dcda6fdd-cc4c-412b-a5c0-fafe62270718",
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
  "last_heartbeat_at": "2026-10-28T13:02:28.803843Z",
  "last_location_at": "2026-10-28T13:02:28.803843Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dcda6fdd-cc4c-412b-a5c0-fafe62270718/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:38Z",
    "sequence": 1793192558281
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dcda6fdd-cc4c-412b-a5c0-fafe62270718",
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
  "last_heartbeat_at": "2026-10-28T13:02:38.297626Z",
  "last_location_at": "2026-10-28T13:02:38.297626Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674046617",
  "device_ref": "sandbox-20448"
}
```

```json
{
  "challenge_id": "3df2ffb7-2b66-4464-ad98-7b17176dff69",
  "expires_at": "2026-10-28T13:07:38.509018585Z",
  "resend_available_at": "2026-10-28T13:02:39.509018585Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674046617` → **200**

```json
{
  "phone": "+380674046617",
  "audience": "CLIENT",
  "code": "021961",
  "sent_at": "2026-10-28T13:02:38.511026446Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3df2ffb7-2b66-4464-ad98-7b17176dff69",
  "code": "021961",
  "device_ref": "sandbox-20448"
}
```

```json
{
  "session_id": "e69eb68d-a194-41be-a500-482260b3a8a0",
  "subject": {
    "type": "CLIENT",
    "id": "1642618f-ec7e-4ccc-9a66-2996fa422fec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjQyNjE4Zi1lYzdlLTRjY2MtOWE2Ni0yOTk2ZmE0MjJmZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDU4LCJpYXQiOjE3OTMxOTI1NTgsImp0aSI6IjQ2NjkwZDEyLWM1YmQtNDIxYS05YzZjLTE0MGQ4NWFkZGFkNCIsInNpZCI6ImU2OWViNjhkLWExOTQtNDFiZS1hNTAwLTQ4MjI2MGIzYThhMCJ9.Oz9ZXcAtYMVNkjOf3L45Yf3KCd_Qiox2EB_sISAvvT0",
  "access_expires_at": "2026-10-28T13:17:38.743030153Z",
  "refresh_token": "-DGIng7dksA4EWmfNuHzUqB2FgayBxqwZPgdC56Vs3w",
  "refresh_expires_at": "2026-11-27T13:02:38.742570293Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "429edebd-175e-4b4a-b879-902148478138",
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
  "id": "e0f76b21-1d84-4036-be90-d2df9f763239",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:38.955776Z",
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
  "command_id": "5a22f9da-805b-4de5-bc45-1173b8c54b1b",
  "quote_id": "e0f76b21-1d84-4036-be90-d2df9f763239",
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
    "phone": "+380674870604"
  }
}
```

```json
{
  "id": "53e3e2ab-5b5c-404a-99c4-729befe83f3d",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1642618f-ec7e-4ccc-9a66-2996fa422fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:02:39.175562Z",
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
    "id": "d3b37bbf-719b-41d3-84bf-88f4c83e1083",
    "order_id": "53e3e2ab-5b5c-404a-99c4-729befe83f3d",
    "expires_at": "2026-10-28T13:02:54.178001Z",
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

`POST /api/driver/v1/offers/d3b37bbf-719b-41d3-84bf-88f4c83e1083/accept` → **200**

```json
{
  "command_id": "baccd232-a466-4e46-8353-059111ec28d9"
}
```

```json
{
  "id": "6001c42d-7f29-42d4-86c8-fd9b91be5f07",
  "order_id": "53e3e2ab-5b5c-404a-99c4-729befe83f3d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "336a91d0-be33-4ad3-95de-4633f08fefeb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "336a91d0-be33-4ad3-95de-4633f08fefeb",
  "order_id": "53e3e2ab-5b5c-404a-99c4-729befe83f3d",
  "assignment_id": "6001c42d-7f29-42d4-86c8-fd9b91be5f07",
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
    "phone": "+380674870604"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5e691a89-2b4d-4166-8432-83c2f823a1f5",
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
  "id": "3a1a4feb-ebec-4dfb-acb0-06935dee91b5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:40.041786Z",
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
  "command_id": "73c5629c-fcb5-41ce-8e21-2d8958a85b7a",
  "quote_id": "3a1a4feb-ebec-4dfb-acb0-06935dee91b5",
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
  "id": "e1c26e4c-d038-423b-9026-7f1dbeb7142d",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1642618f-ec7e-4ccc-9a66-2996fa422fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:02:40.260852Z",
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
  "command_id": "07d152ed-53d3-49a8-b591-8538a9160d4e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T16:02:40Z"
}
```

```json
{
  "id": "c8dc4b17-6564-4f0c-9c0b-c861f27140b8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:40.496498Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T16:02:40Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b09f74b8-e679-4aec-992a-a8d41ce08a25",
  "quote_id": "c8dc4b17-6564-4f0c-9c0b-c861f27140b8",
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
  "pickup_at": "2026-10-28T16:02:40Z"
}
```

```json
{
  "id": "c10d80a8-fe56-418f-8146-930ea3d133d6",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1642618f-ec7e-4ccc-9a66-2996fa422fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T13:02:40.771191Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:02:40Z",
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
  "command_id": "be549903-ab17-4509-872d-95426c278485",
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
  "id": "d56d39b4-a9b8-4afb-9fce-cff9cb80ac88",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:41.002030Z",
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
  "command_id": "b9ff9f2f-8696-48f1-8e3c-9208fca51296",
  "quote_id": "d56d39b4-a9b8-4afb-9fce-cff9cb80ac88",
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
  "correlation_id": "fc38e457-47f6-4217-a3c0-fb63b48ec7bc"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "c10d80a8-fe56-418f-8146-930ea3d133d6",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "1642618f-ec7e-4ccc-9a66-2996fa422fec",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T13:02:40.771191Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T16:02:40Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "e1c26e4c-d038-423b-9026-7f1dbeb7142d",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "1642618f-ec7e-4ccc-9a66-2996fa422fec",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T13:02:40.260852Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "53e3e2ab-5b5c-404a-99c4-729befe83f3d",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "e1c26e4c-d038-423b-9026-7f1dbeb7142d",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1642618f-ec7e-4ccc-9a66-2996fa422fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:02:40.260852Z",
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

`GET /api/rider/v1/orders/53e3e2ab-5b5c-404a-99c4-729befe83f3d` → **200**

```json
{
  "id": "53e3e2ab-5b5c-404a-99c4-729befe83f3d",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1642618f-ec7e-4ccc-9a66-2996fa422fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6001c42d-7f29-42d4-86c8-fd9b91be5f07",
    "order_id": "53e3e2ab-5b5c-404a-99c4-729befe83f3d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "336a91d0-be33-4ad3-95de-4633f08fefeb",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T13:02:39.175562Z",
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
    "location_at": "2026-10-28T13:02:38.297626Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/53e3e2ab-5b5c-404a-99c4-729befe83f3d/cancel` → **200**

```json
{
  "command_id": "9e16c3f7-8461-4bbd-afbd-f4ebd98a7105",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "53e3e2ab-5b5c-404a-99c4-729befe83f3d",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "1642618f-ec7e-4ccc-9a66-2996fa422fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6001c42d-7f29-42d4-86c8-fd9b91be5f07",
    "order_id": "53e3e2ab-5b5c-404a-99c4-729befe83f3d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "336a91d0-be33-4ad3-95de-4633f08fefeb",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:02:39.175562Z",
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

`GET /api/rider/v1/orders/e1c26e4c-d038-423b-9026-7f1dbeb7142d` → **200**

```json
{
  "id": "e1c26e4c-d038-423b-9026-7f1dbeb7142d",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1642618f-ec7e-4ccc-9a66-2996fa422fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:02:40.260852Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e1c26e4c-d038-423b-9026-7f1dbeb7142d/cancel` → **200**

```json
{
  "command_id": "e33134cf-46a4-4683-a3f0-3349c9cdebc4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e1c26e4c-d038-423b-9026-7f1dbeb7142d",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1642618f-ec7e-4ccc-9a66-2996fa422fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T13:02:40.260852Z",
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

`GET /api/rider/v1/orders/c10d80a8-fe56-418f-8146-930ea3d133d6` → **200**

```json
{
  "id": "c10d80a8-fe56-418f-8146-930ea3d133d6",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1642618f-ec7e-4ccc-9a66-2996fa422fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T13:02:40.771191Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:02:40Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c10d80a8-fe56-418f-8146-930ea3d133d6/cancel` → **200**

```json
{
  "command_id": "7cde62fd-5f41-4af7-aaaa-9bc6945ee0ab",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c10d80a8-fe56-418f-8146-930ea3d133d6",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "1642618f-ec7e-4ccc-9a66-2996fa422fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T13:02:40.771191Z",
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
  "pickup_at": "2026-10-28T16:02:40Z",
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
  "session_id": "dcda6fdd-cc4c-412b-a5c0-fafe62270718",
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
  "last_heartbeat_at": "2026-10-28T13:02:38.297626Z",
  "last_location_at": "2026-10-28T13:02:38.297626Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dcda6fdd-cc4c-412b-a5c0-fafe62270718/close` → **200**

```json
{
  "command_id": "ad815625-dade-4d02-b578-9f01db92217d",
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

Done: orders 53e3e2ab-5b5c-404a-99c4-729befe83f3d, e1c26e4c-d038-423b-9026-7f1dbeb7142d, c10d80a8-fe56-418f-8146-930ea3d133d6.

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
  "session_id": "72c334bb-4209-4b1d-81e4-bfa833a653e9",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0NjQsImlhdCI6MTc5MzE5MjU2NCwianRpIjoiMjZkOWQxODgtNzUyMC00YzFhLTkwNzAtNzI0YWU2MWJiOGQ2Iiwic2lkIjoiNzJjMzM0YmItNDIwOS00YjFkLTgxZTQtYmZhODMzYTY1M2U5In0.0olYDJwIjrz7T1cUytxlnGKBvZ3oRPUvd3fpZYwEeA4",
  "access_expires_at": "2026-10-28T13:17:44.005075982Z",
  "refresh_token": "o-vCD-QL1Qe8Dgiisx0OhhtXDcZQxJI1gBeZlc4_Aok",
  "refresh_expires_at": "2026-10-29T01:02:44.004663562Z",
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
  "session_id": "bfeeab96-8ce4-40de-8498-a834707e7543",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0NjQsImlhdCI6MTc5MzE5MjU2NCwianRpIjoiMDMyMmVlYzQtOWM3Yi00NjAxLWJiNjktZjEwOGU1YjlmZWMyIiwic2lkIjoiYmZlZWFiOTYtOGNlNC00MGRlLTg0OTgtYTgzNDcwN2U3NTQzIn0.H_RAXwY3RMLh6VFlmEx4dVGJUZoLE1ASOt2tyxsJ-yQ",
  "access_expires_at": "2026-10-28T13:17:44.473617084Z",
  "refresh_token": "8UHXfyGLHHuF5kHcE727ztG5n6q_AEuT0msNqAWTj-U",
  "refresh_expires_at": "2026-10-29T01:02:44.47318139Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26329"
}
```

```json
{
  "challenge_id": "71148468-2dbd-430f-a46b-3fdaed7be06a",
  "expires_at": "2026-10-28T13:07:44.679875691Z",
  "resend_available_at": "2026-10-28T13:02:45.679875691Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "448722",
  "sent_at": "2026-10-28T13:02:44.681754626Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71148468-2dbd-430f-a46b-3fdaed7be06a",
  "code": "448722",
  "device_ref": "sandbox-26329"
}
```

```json
{
  "session_id": "e3539e12-e1e5-4b79-8c54-e32784834dde",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzQ2NCwiaWF0IjoxNzkzMTkyNTY0LCJqdGkiOiI2YmIwMDQ0OC02ZjIzLTRiNDgtOGZiZi0zZDBlNzFiN2VkM2IiLCJzaWQiOiJlMzUzOWUxMi1lMWU1LTRiNzktOGM1NC1lMzI3ODQ4MzRkZGUifQ.xei3FR9ofEHHP_a0exM-eubW0TZiiZdSJaZ-RxgcIWo",
  "access_expires_at": "2026-10-28T13:17:44.914778321Z",
  "refresh_token": "ip1c-EFXeOJRdDb8NywK1HHOTE5cL1o2q6enQnbFcCI",
  "refresh_expires_at": "2026-11-27T13:02:44.914286834Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:25.454289Z",
  "last_location_at": "2026-10-28T13:02:25.454289Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/01ff3665-e70f-422e-b16c-f3132d515204/handover` → **200**

```json
{
  "command_id": "b31db866-72e1-4f0c-8e66-ffcb34097bd0",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:25.454289Z",
  "last_location_at": "2026-10-28T13:02:25.454289Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/01ff3665-e70f-422e-b16c-f3132d515204/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:45Z",
    "sequence": 1793192565546
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:45.562172Z",
  "last_location_at": "2026-10-28T13:02:45.562172Z",
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
  "command_id": "0039b21c-1ae4-4c0f-b404-a24f1270525a",
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
  "effective_at": "2026-10-28T13:02:46.000384Z",
  "changed_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T13:02:46.216142629Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "af9e9623-997c-4f5b-bfe2-eb7580c958d2",
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
  "id": "ac2de787-5bb1-4cc5-8cd6-2ddffb2948f4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:46.432197Z",
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
  "command_id": "ca8ad8f5-23bb-4803-94dc-400fc9cb64c7",
  "quote_id": "ac2de787-5bb1-4cc5-8cd6-2ddffb2948f4",
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
    "phone": "+3806711128324"
  }
}
```

```json
{
  "id": "4386da40-cca2-4488-9696-1f869d302e0a",
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
  "created_at": "2026-10-28T13:02:46.646951Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128324"
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
    "id": "1a5347b0-cb12-4dbb-b44d-61d6bdf39d4f",
    "order_id": "4386da40-cca2-4488-9696-1f869d302e0a",
    "expires_at": "2026-10-28T13:03:01.649821Z",
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

`POST /api/driver/v1/offers/1a5347b0-cb12-4dbb-b44d-61d6bdf39d4f/accept` → **200**

```json
{
  "command_id": "6c5f62f6-b94d-4f4b-94ad-d41c86e679b2"
}
```

```json
{
  "id": "fa9b1c8b-7c5d-4c17-8bc4-d8df8798cb82",
  "order_id": "4386da40-cca2-4488-9696-1f869d302e0a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "edea0ba2-3f4d-4afb-bc03-0f9288ad169a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "edea0ba2-3f4d-4afb-bc03-0f9288ad169a",
  "order_id": "4386da40-cca2-4488-9696-1f869d302e0a",
  "assignment_id": "fa9b1c8b-7c5d-4c17-8bc4-d8df8798cb82",
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
    "phone": "+3806711128324"
  }
}
```

`POST /api/driver/v1/work-sessions/01ff3665-e70f-422e-b16c-f3132d515204/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:02:47Z",
    "sequence": 1793192567513
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:47.529532Z",
  "last_location_at": "2026-10-28T13:02:47.529532Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/edea0ba2-3f4d-4afb-bc03-0f9288ad169a/arrive` → **200**

```json
{
  "command_id": "a1d5d04c-d430-4d39-b06a-0d37316901d1",
  "expected_version": 0
}
```

```json
{
  "id": "edea0ba2-3f4d-4afb-bc03-0f9288ad169a",
  "order_id": "4386da40-cca2-4488-9696-1f869d302e0a",
  "assignment_id": "fa9b1c8b-7c5d-4c17-8bc4-d8df8798cb82",
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
  "arrived_at": "2026-10-28T13:02:47.746081Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711128324"
  }
}
```

`POST /api/driver/v1/trips/edea0ba2-3f4d-4afb-bc03-0f9288ad169a/start` → **200**

```json
{
  "command_id": "985893a5-2ed2-4b2b-a1a8-bd2adfd44d62",
  "expected_version": 1
}
```

```json
{
  "id": "edea0ba2-3f4d-4afb-bc03-0f9288ad169a",
  "order_id": "4386da40-cca2-4488-9696-1f869d302e0a",
  "assignment_id": "fa9b1c8b-7c5d-4c17-8bc4-d8df8798cb82",
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
  "arrived_at": "2026-10-28T13:02:47.746081Z",
  "started_at": "2026-10-28T13:02:47.972283Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711128324"
  }
}
```

`POST /api/driver/v1/trips/edea0ba2-3f4d-4afb-bc03-0f9288ad169a/complete` → **200**

```json
{
  "command_id": "53005aff-86c8-44de-ad52-df7d02b579bd",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:02:48Z",
  "cash_received": true
}
```

```json
{
  "id": "edea0ba2-3f4d-4afb-bc03-0f9288ad169a",
  "order_id": "4386da40-cca2-4488-9696-1f869d302e0a",
  "assignment_id": "fa9b1c8b-7c5d-4c17-8bc4-d8df8798cb82",
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
  "arrived_at": "2026-10-28T13:02:47.746081Z",
  "started_at": "2026-10-28T13:02:47.972283Z",
  "completed_at": "2026-10-28T13:02:48.193741Z",
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
  "command_id": "95a54465-cd4c-46bb-ac45-b8bfe8114e76",
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
  "id": "99e468cb-deeb-4a4e-bf48-857bd14a6b04",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:48.414980Z",
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
  "command_id": "70adf7ee-8471-4940-b0b2-c0ae40aeb47c",
  "quote_id": "99e468cb-deeb-4a4e-bf48-857bd14a6b04",
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
    "phone": "+3806711111640"
  }
}
```

```json
{
  "id": "981f5082-3064-4fa3-83f2-e096e7beb18f",
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
  "created_at": "2026-10-28T13:02:48.636423Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111640"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/981f5082-3064-4fa3-83f2-e096e7beb18f` → **200**

```json
{
  "id": "981f5082-3064-4fa3-83f2-e096e7beb18f",
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
  "created_at": "2026-10-28T13:02:48.636423Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111640"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/981f5082-3064-4fa3-83f2-e096e7beb18f/cancel` → **200**

```json
{
  "command_id": "5f54cd05-1514-4604-a873-c0dd9ec9d42c",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "981f5082-3064-4fa3-83f2-e096e7beb18f",
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
  "created_at": "2026-10-28T13:02:48.636423Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111640"
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
  "staff_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T13:02:48.197682Z",
  "last_entries": [
    {
      "order_id": "981f5082-3064-4fa3-83f2-e096e7beb18f",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T13:02:49.100254Z"
    },
    {
      "order_id": "4386da40-cca2-4488-9696-1f869d302e0a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T13:02:48.197682Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01ff3665-e70f-422e-b16c-f3132d515204",
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
  "last_heartbeat_at": "2026-10-28T13:02:47.529532Z",
  "last_location_at": "2026-10-28T13:02:47.529532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/01ff3665-e70f-422e-b16c-f3132d515204/close` → **200**

```json
{
  "command_id": "008d5be7-5d0d-4dae-8600-73ad2c0a5651",
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

Done: operator bonus for fulfilled 4386da40-cca2-4488-9696-1f869d302e0a and operator-fault cancellation 981f5082-3064-4fa3-83f2-e096e7beb18f.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677559823",
  "device_ref": "sandbox-12065"
}
```

```json
{
  "challenge_id": "8a1b1b83-13bb-4133-92f6-f52bdb1684d0",
  "expires_at": "2026-10-28T13:07:52.00907814Z",
  "resend_available_at": "2026-10-28T13:02:53.00907814Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677559823` → **200**

```json
{
  "phone": "+380677559823",
  "audience": "CLIENT",
  "code": "089678",
  "sent_at": "2026-10-28T13:02:52.011554225Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675031032",
  "device_ref": "sandbox-21365",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d3f1c5bc-2129-4c7b-9f31-d10d8a3b998e",
  "expires_at": "2026-10-28T13:07:52.233075805Z",
  "resend_available_at": "2026-10-28T13:02:53.233075805Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675031032` → **200**

```json
{
  "phone": "+380675031032",
  "audience": "CLIENT",
  "code": "182037",
  "sent_at": "2026-10-28T13:02:52.234750114Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679340000",
  "device_ref": "sandbox-29971"
}
```

```json
{
  "challenge_id": "04211046-0666-4b4d-ac9e-58b452988e04",
  "expires_at": "2026-10-28T13:07:52.461039361Z",
  "resend_available_at": "2026-10-28T13:02:53.461039361Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679340000` → **200**

```json
{
  "phone": "+380679340000",
  "audience": "CLIENT",
  "code": "499084",
  "sent_at": "2026-10-28T13:02:52.500030402Z",
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
  "session_id": "3e014fb4-6c6c-4703-a8a6-bccd8c083fed",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0NzIsImlhdCI6MTc5MzE5MjU3MiwianRpIjoiOGRiOGJkN2ItM2VhYi00ZTVjLWJmMzktODA0ZWNjNjliMjk4Iiwic2lkIjoiM2UwMTRmYjQtNmM2Yy00NzAzLWE4YTYtYmNjZDhjMDgzZmVkIn0.3Utp6jRcMhWtvAmuCST2WtnK362hbC9F7dXQLVQHZTk",
  "access_expires_at": "2026-10-28T13:17:52.987284888Z",
  "refresh_token": "DufDhggZXzQaNT-VihIn75E3zpMyfDNtXuCvcK0WXQM",
  "refresh_expires_at": "2026-10-29T01:02:52.986633414Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679340000` → **200**

```json
{
  "deliveries": [
    {
      "id": "053e38d4-34b6-4e8b-9440-95174543bba9",
      "challenge_id": "04211046-0666-4b4d-ac9e-58b452988e04",
      "phone": "+380679340000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-63939004-26af-499a-808c-64406b4cbe1d",
      "error": null,
      "attempted_at": "2026-10-28T13:02:52.500343Z"
    },
    {
      "id": "82e88c47-98ef-48f3-b154-0d2ca783df93",
      "challenge_id": "04211046-0666-4b4d-ac9e-58b452988e04",
      "phone": "+380679340000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T13:02:52.499153Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380679340000` → **200**

```json
{
  "phone": "+380679340000",
  "audience": "CLIENT",
  "code": "499084",
  "sent_at": "2026-10-28T13:02:52.500030402Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675031032` → **200**

```json
{
  "deliveries": [
    {
      "id": "bc4a3f5b-4471-4c5e-b77d-9ec09bd16d07",
      "challenge_id": "d3f1c5bc-2129-4c7b-9f31-d10d8a3b998e",
      "phone": "+380675031032",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-07063d7c-8d26-4e91-855d-9abd1652e28d",
      "error": null,
      "attempted_at": "2026-10-28T13:02:52.234948Z"
    }
  ]
}
```

Done: SMS to +380677559823, a call to +380675031032, SMS then a call to +380679340000.

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
  "session_id": "a045deee-d532-4905-b367-1f195f752769",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0NzMsImlhdCI6MTc5MzE5MjU3MywianRpIjoiMGFkZmRjZjAtYmNiZi00ZmExLThlNzAtNmM4NmMyNjc3NjQ0Iiwic2lkIjoiYTA0NWRlZWUtZDUzMi00OTA1LWIzNjctMWYxOTVmNzUyNzY5In0.X27K8-hFDLaNBGy1mqTazBRETX9fW3d-HvTRvca66Cc",
  "access_expires_at": "2026-10-28T13:17:53.932783054Z",
  "refresh_token": "QQRvLNOoGnw2leOs4BJguh3rUV7hcRSBu70CFAFSOAg",
  "refresh_expires_at": "2026-10-29T01:02:53.932312778Z",
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
  "session_id": "64d632c6-c273-4ad0-816f-59419d6e9e35",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0NzQsImlhdCI6MTc5MzE5MjU3NCwianRpIjoiZmE5OGIzOWMtNGM2MC00OTY1LTk0OTUtN2MyMDVlNjAwMTU5Iiwic2lkIjoiNjRkNjMyYzYtYzI3My00YWQwLTgxNmYtNTk0MTlkNmU5ZTM1In0.XJ6hIqkz8Uziddn41q5n6H66mtuBusEYGajv5huhkIg",
  "access_expires_at": "2026-10-28T13:17:54.404918053Z",
  "refresh_token": "HtbJadBHO_53Atv1US0Vbj31N3VBlrwl6gvi9SPFzDc",
  "refresh_expires_at": "2026-10-29T01:02:54.404456771Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
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

`POST /api/admin/v1/staff-extensions/a21086f5-0ace-42c1-adfb-bfc037b6ebcc` → **200**

```json
{
  "command_id": "823a4f35-b283-496f-a80d-cfa42be8f3af",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "ba82ca9d-f7a4-47b8-a58d-f0ea594a1f11",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T13:02:55.256514Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T13:02:55.256514Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cb86bab9-5f6b-4859-95cc-7940869e9091",
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
  "id": "645f0def-76b1-46ab-a0cf-19500381be55",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:07:55.686436Z",
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
  "command_id": "03e41533-54b0-47ed-bde4-70446d9fd862",
  "quote_id": "645f0def-76b1-46ab-a0cf-19500381be55",
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
    "phone": "+380673728732"
  }
}
```

```json
{
  "id": "15bede6e-f7dc-4bef-b0a2-58afd07fa155",
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
  "created_at": "2026-10-28T13:02:55.937855Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673728732"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/15bede6e-f7dc-4bef-b0a2-58afd07fa155/calls` → **201**

```json
{
  "command_id": "4c24b3cb-59ca-4e21-85fb-fada3e335730",
  "to": "CALLER"
}
```

```json
{
  "id": "55c44b5c-f0e8-49af-9729-9458b0880e5f",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "order_ids": [
    "15bede6e-f7dc-4bef-b0a2-58afd07fa155"
  ],
  "started_at": "2026-10-28T13:02:56.195408Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/15bede6e-f7dc-4bef-b0a2-58afd07fa155/calls` → **201**

```json
{
  "command_id": "4c24b3cb-59ca-4e21-85fb-fada3e335730",
  "to": "CALLER"
}
```

```json
{
  "id": "55c44b5c-f0e8-49af-9729-9458b0880e5f",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "order_ids": [
    "15bede6e-f7dc-4bef-b0a2-58afd07fa155"
  ],
  "started_at": "2026-10-28T13:02:56.195408Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "55c44b5c-f0e8-49af-9729-9458b0880e5f",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673728732",
    "at": "2026-10-28T13:02:56.196885164Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "55c44b5c-f0e8-49af-9729-9458b0880e5f",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.31036",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "55c44b5c-f0e8-49af-9729-9458b0880e5f"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "55c44b5c-f0e8-49af-9729-9458b0880e5f",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=15bede6e-f7dc-4bef-b0a2-58afd07fa155` → **200**

```json
{
  "calls": [
    {
      "id": "55c44b5c-f0e8-49af-9729-9458b0880e5f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_ids": [
        "15bede6e-f7dc-4bef-b0a2-58afd07fa155"
      ],
      "started_at": "2026-10-28T13:02:56.195408Z",
      "answered_at": "2026-10-28T13:02:56.693822Z",
      "ended_at": "2026-10-28T13:02:56.712587Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=15bede6e-f7dc-4bef-b0a2-58afd07fa155` → **200**

```json
{
  "calls": [
    {
      "id": "55c44b5c-f0e8-49af-9729-9458b0880e5f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_ids": [
        "15bede6e-f7dc-4bef-b0a2-58afd07fa155"
      ],
      "started_at": "2026-10-28T13:02:56.195408Z",
      "answered_at": "2026-10-28T13:02:56.693822Z",
      "ended_at": "2026-10-28T13:02:56.712587Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=15bede6e-f7dc-4bef-b0a2-58afd07fa155` → **200**

```json
{
  "calls": [
    {
      "id": "55c44b5c-f0e8-49af-9729-9458b0880e5f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_ids": [
        "15bede6e-f7dc-4bef-b0a2-58afd07fa155"
      ],
      "started_at": "2026-10-28T13:02:56.195408Z",
      "answered_at": "2026-10-28T13:02:56.693822Z",
      "ended_at": "2026-10-28T13:02:56.712587Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=15bede6e-f7dc-4bef-b0a2-58afd07fa155` → **200**

```json
{
  "calls": [
    {
      "id": "55c44b5c-f0e8-49af-9729-9458b0880e5f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_ids": [
        "15bede6e-f7dc-4bef-b0a2-58afd07fa155"
      ],
      "started_at": "2026-10-28T13:02:56.195408Z",
      "answered_at": "2026-10-28T13:02:56.693822Z",
      "ended_at": "2026-10-28T13:02:56.712587Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=15bede6e-f7dc-4bef-b0a2-58afd07fa155` → **200**

```json
{
  "calls": [
    {
      "id": "55c44b5c-f0e8-49af-9729-9458b0880e5f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_ids": [
        "15bede6e-f7dc-4bef-b0a2-58afd07fa155"
      ],
      "started_at": "2026-10-28T13:02:56.195408Z",
      "answered_at": "2026-10-28T13:02:56.693822Z",
      "ended_at": "2026-10-28T13:02:56.712587Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=15bede6e-f7dc-4bef-b0a2-58afd07fa155` → **200**

```json
{
  "calls": [
    {
      "id": "55c44b5c-f0e8-49af-9729-9458b0880e5f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "order_ids": [
        "15bede6e-f7dc-4bef-b0a2-58afd07fa155"
      ],
      "started_at": "2026-10-28T13:02:56.195408Z",
      "answered_at": "2026-10-28T13:02:56.693822Z",
      "ended_at": "2026-10-28T13:02:56.712587Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:03:06.197622Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/15bede6e-f7dc-4bef-b0a2-58afd07fa155` → **200**

```json
{
  "id": "15bede6e-f7dc-4bef-b0a2-58afd07fa155",
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
  "created_at": "2026-10-28T13:02:55.937855Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673728732"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/15bede6e-f7dc-4bef-b0a2-58afd07fa155/cancel` → **200**

```json
{
  "command_id": "a255c8c0-9585-438a-b36c-04eb099f9ba6",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "15bede6e-f7dc-4bef-b0a2-58afd07fa155",
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
  "created_at": "2026-10-28T13:02:55.937855Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673728732"
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
  "command_id": "223c8a73-7c4d-4715-b859-d0e364278460",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T13:03:08.521595Z",
  "extension": "101"
}
```

Done: outgoing call 55c44b5c-f0e8-49af-9729-9458b0880e5f from order 15bede6e-f7dc-4bef-b0a2-58afd07fa155, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637654386",
  "device_ref": "sandbox-6774"
}
```

```json
{
  "challenge_id": "e1f25d99-4f58-4b0e-b83b-903e1de6f307",
  "expires_at": "2026-10-28T13:08:08.744966301Z",
  "resend_available_at": "2026-10-28T13:03:09.744966301Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637654386` → **200**

```json
{
  "phone": "+380637654386",
  "audience": "CLIENT",
  "code": "611227",
  "sent_at": "2026-10-28T13:03:08.746682491Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1f25d99-4f58-4b0e-b83b-903e1de6f307",
  "code": "611227",
  "device_ref": "sandbox-6774"
}
```

```json
{
  "session_id": "605ef026-2a14-4d05-ad9a-8d26516e656a",
  "subject": {
    "type": "CLIENT",
    "id": "30e1be0c-d4eb-4fb3-844c-e19437e22720"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMGUxYmUwYy1kNGViLTRmYjMtODQ0Yy1lMTk0MzdlMjI3MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDg4LCJpYXQiOjE3OTMxOTI1ODgsImp0aSI6IjU2OGRjNDVjLTAwMWMtNDgzNy04MTUyLWNlMzhhNWE2MjJmYSIsInNpZCI6IjYwNWVmMDI2LTJhMTQtNGQwNS1hZDlhLThkMjY1MTZlNjU2YSJ9.og7xEuQr_B8mg9xYWHZ8s8EBl-ctlPPXKZ_JHTXMYdc",
  "access_expires_at": "2026-10-28T13:18:08.986424866Z",
  "refresh_token": "72apLWth9DbZN7c8qVvv4tllORnL3UbvWbBFCMUkQbQ",
  "refresh_expires_at": "2026-11-27T13:03:08.985924436Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "30e1be0c-d4eb-4fb3-844c-e19437e22720",
  "session_id": "605ef026-2a14-4d05-ad9a-8d26516e656a",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637654386",
  "device_ref": "sandbox-21932"
}
```

```json
{
  "challenge_id": "5bf2e549-9447-4048-aed0-ddfe2f047fad",
  "expires_at": "2026-10-28T13:08:11.402538475Z",
  "resend_available_at": "2026-10-28T13:03:12.402538475Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637654386` → **200**

```json
{
  "phone": "+380637654386",
  "audience": "CLIENT",
  "code": "924342",
  "sent_at": "2026-10-28T13:03:11.404004063Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5bf2e549-9447-4048-aed0-ddfe2f047fad",
  "code": "924342",
  "device_ref": "sandbox-21932"
}
```

```json
{
  "session_id": "e6f869cc-d47d-4540-8884-8264f97b4b69",
  "subject": {
    "type": "CLIENT",
    "id": "30e1be0c-d4eb-4fb3-844c-e19437e22720"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMGUxYmUwYy1kNGViLTRmYjMtODQ0Yy1lMTk0MzdlMjI3MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDkxLCJpYXQiOjE3OTMxOTI1OTEsImp0aSI6Ijg4MTgzN2IyLWVmMDQtNDM5ZS04M2JkLTNiM2E1N2JjOGJhYiIsInNpZCI6ImU2Zjg2OWNjLWQ0N2QtNDU0MC04ODg0LTgyNjRmOTdiNGI2OSJ9.VRAUEtKDdhw9NdbjlNXjDq07GYEeOkvPc_k-jaPJZjE",
  "access_expires_at": "2026-10-28T13:18:11.632772482Z",
  "refresh_token": "pYuLakMeKMHlCudLAU4qRbb4gt8jak6jVXYYP-RLwhg",
  "refresh_expires_at": "2026-11-27T13:03:11.632245562Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "1291c1cf-75d3-4aaf-bcda-f0fd262cf282",
  "expires_at": "2026-10-28T13:08:13.84443767Z",
  "resend_available_at": "2026-10-28T13:03:14.84443767Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637654386` → **200**

```json
{
  "phone": "+380637654386",
  "audience": "CLIENT",
  "code": "711342",
  "sent_at": "2026-10-28T13:03:13.845981289Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380630745793"
}
```

```json
{
  "challenge_id": "a5142414-64d5-466c-b693-7553327a506e",
  "expires_at": "2026-10-28T13:08:14.073228601Z",
  "resend_available_at": "2026-10-28T13:03:15.073228601Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630745793` → **200**

```json
{
  "phone": "+380630745793",
  "audience": "CLIENT",
  "code": "334627",
  "sent_at": "2026-10-28T13:03:14.074730013Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "dd51a927-de93-4e98-996c-7511b0120c08",
  "current_challenge_id": "1291c1cf-75d3-4aaf-bcda-f0fd262cf282",
  "current_code": "000000",
  "new_challenge_id": "a5142414-64d5-466c-b693-7553327a506e",
  "new_code": "334627"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "d96bc290-848a-40c0-b700-d1be2de51847"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "0779c0bb-f2b3-488b-85ac-7aaf870656f1",
  "current_challenge_id": "1291c1cf-75d3-4aaf-bcda-f0fd262cf282",
  "current_code": "711342",
  "new_challenge_id": "a5142414-64d5-466c-b693-7553327a506e",
  "new_code": "334627"
}
```

```json
{
  "subject_id": "30e1be0c-d4eb-4fb3-844c-e19437e22720",
  "phone": "+380630745793",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "30e1be0c-d4eb-4fb3-844c-e19437e22720",
  "session_id": "605ef026-2a14-4d05-ad9a-8d26516e656a",
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
  "correlation_id": "de464dee-d3a6-430a-8b46-b21ea0432d5b"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630745793",
  "device_ref": "sandbox-14990"
}
```

```json
{
  "challenge_id": "a71f2695-d91a-4d5f-b289-b9d3e8493cb8",
  "expires_at": "2026-10-28T13:08:17.148854781Z",
  "resend_available_at": "2026-10-28T13:03:18.148854781Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630745793` → **200**

```json
{
  "phone": "+380630745793",
  "audience": "CLIENT",
  "code": "596300",
  "sent_at": "2026-10-28T13:03:17.15055504Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a71f2695-d91a-4d5f-b289-b9d3e8493cb8",
  "code": "596300",
  "device_ref": "sandbox-14990"
}
```

```json
{
  "session_id": "5be846c8-84da-4e71-95c6-e635d476e54f",
  "subject": {
    "type": "CLIENT",
    "id": "30e1be0c-d4eb-4fb3-844c-e19437e22720"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMGUxYmUwYy1kNGViLTRmYjMtODQ0Yy1lMTk0MzdlMjI3MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDk3LCJpYXQiOjE3OTMxOTI1OTcsImp0aSI6IjEyNmI1M2Y1LThlOTAtNDRmOC04YjhjLTgyMTgyZTAzNWNmNyIsInNpZCI6IjViZTg0NmM4LTg0ZGEtNGU3MS05NWM2LWU2MzVkNDc2ZTU0ZiJ9.GBUkpvwBWvB_bJOvwFydJ3CZwEkYiX-dLQwt7Xh1RB0",
  "access_expires_at": "2026-10-28T13:18:17.385324101Z",
  "refresh_token": "wqVedQYYY1QDWCKG-QwfaCYYOTujwTevqmleL-28sDE",
  "refresh_expires_at": "2026-11-27T13:03:17.384793853Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "30e1be0c-d4eb-4fb3-844c-e19437e22720",
  "session_id": "5be846c8-84da-4e71-95c6-e635d476e54f",
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
  "session_id": "c1a50f72-5204-4ad4-8aa3-9c7ea59be755",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM0OTgsImlhdCI6MTc5MzE5MjU5OCwianRpIjoiMzFmYjM4MjQtOTdlZC00YmFlLTllNTYtMzYwMzYwMGRiZjMwIiwic2lkIjoiYzFhNTBmNzItNTIwNC00YWQ0LThhYTMtOWM3ZWE1OWJlNzU1In0.H3199g8UCP-Ktgnq5mJI8VfTlcq-MGS4KTa9GuqDQuM",
  "access_expires_at": "2026-10-28T13:18:18.062852887Z",
  "refresh_token": "1SdcSNIB6F9EOAaKtNfatr3b2j39R1tX1pIGUDJr1y4",
  "refresh_expires_at": "2026-10-29T01:03:18.062423403Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/30e1be0c-d4eb-4fb3-844c-e19437e22720` → **200**

```json
{
  "client": {
    "id": "30e1be0c-d4eb-4fb3-844c-e19437e22720",
    "phone": "+380630745793",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T13:03:08.984511Z",
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

`POST /api/admin/v1/clients/30e1be0c-d4eb-4fb3-844c-e19437e22720/phone` → **400**

```json
{
  "command_id": "396a3758-70af-4d0e-a121-be4bada5c6e5",
  "expected_version": 3,
  "phone": "+380632788008",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/30e1be0c-d4eb-4fb3-844c-e19437e22720/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d8fd8708-bbb9-4bb9-9bdf-e5add7307403",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/30e1be0c-d4eb-4fb3-844c-e19437e22720/phone` → **200**

```json
{
  "command_id": "048197fb-d821-4be7-ba45-4fd307e02971",
  "expected_version": 3,
  "phone": "+380632788008",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "30e1be0c-d4eb-4fb3-844c-e19437e22720",
  "phone": "+380632788008",
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
  "correlation_id": "7436ca5c-4504-4fa6-8cf0-3ce32df19815"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632788008",
  "device_ref": "sandbox-10517"
}
```

```json
{
  "challenge_id": "3a368fb3-1518-4737-9f2a-2c49cc7e18e8",
  "expires_at": "2026-10-28T13:08:19.144327617Z",
  "resend_available_at": "2026-10-28T13:03:20.144327617Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632788008` → **200**

```json
{
  "phone": "+380632788008",
  "audience": "CLIENT",
  "code": "002934",
  "sent_at": "2026-10-28T13:03:19.146167501Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a368fb3-1518-4737-9f2a-2c49cc7e18e8",
  "code": "002934",
  "device_ref": "sandbox-10517"
}
```

```json
{
  "session_id": "b1d7edc2-e07f-4c4b-97ab-553f0f9a2ab6",
  "subject": {
    "type": "CLIENT",
    "id": "30e1be0c-d4eb-4fb3-844c-e19437e22720"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMGUxYmUwYy1kNGViLTRmYjMtODQ0Yy1lMTk0MzdlMjI3MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNDk5LCJpYXQiOjE3OTMxOTI1OTksImp0aSI6ImM2YzBkMGJmLTQxZWUtNDQyZS05ODI3LTZhNzExNTI4MjRhZCIsInNpZCI6ImIxZDdlZGMyLWUwN2YtNGM0Yi05N2FiLTU1M2YwZjlhMmFiNiJ9.NvrBI-odzUnGkILbpAxEFGqdsdHIRyNT4XYCyWsWus8",
  "access_expires_at": "2026-10-28T13:18:19.381545476Z",
  "refresh_token": "TnO8ZNW3hsZC_hcZq90LOFfvrRVSnuRRFl8CKvtI8Z4",
  "refresh_expires_at": "2026-11-27T13:03:19.381126688Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "30e1be0c-d4eb-4fb3-844c-e19437e22720",
  "session_id": "b1d7edc2-e07f-4c4b-97ab-553f0f9a2ab6",
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
  "phone": "+380638416327",
  "device_ref": "sandbox-25857"
}
```

```json
{
  "challenge_id": "424b6aa6-2e49-4bc7-a33c-130ef1413dca",
  "expires_at": "2026-10-28T13:08:19.796627941Z",
  "resend_available_at": "2026-10-28T13:03:20.796627941Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638416327` → **200**

```json
{
  "phone": "+380638416327",
  "audience": "CLIENT",
  "code": "720398",
  "sent_at": "2026-10-28T13:03:19.798337017Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "424b6aa6-2e49-4bc7-a33c-130ef1413dca",
  "code": "720398",
  "device_ref": "sandbox-25857"
}
```

```json
{
  "session_id": "b8be25fa-8aba-43cc-9112-b89e1296c975",
  "subject": {
    "type": "CLIENT",
    "id": "3595aaff-b4ea-49cb-868e-2919af2cf0e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNTk1YWFmZi1iNGVhLTQ5Y2ItODY4ZS0yOTE5YWYyY2YwZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNTAwLCJpYXQiOjE3OTMxOTI2MDAsImp0aSI6IjI2Nzg3ZTMwLTViY2UtNDU3My04NWZjLTJlNGQ1OGI0NWEyZCIsInNpZCI6ImI4YmUyNWZhLThhYmEtNDNjYy05MTEyLWI4OWUxMjk2Yzk3NSJ9.ebIId45Jh_SuQigWs-If_fxfhoFHjVevLTj4KoIu4HY",
  "access_expires_at": "2026-10-28T13:18:20.027475004Z",
  "refresh_token": "uDOzTEHKoHT0GYFWS0-0gDTblMB75UiqIs_nJSZqARA",
  "refresh_expires_at": "2026-11-27T13:03:20.027037684Z",
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
  "session_id": "04e6911a-c91f-4875-8986-e35129dcf54e",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1MDAsImlhdCI6MTc5MzE5MjYwMCwianRpIjoiZjY0MzY2MWMtNzc0My00YjdjLThjNzMtZDQ5Mzk0OWMzYTE3Iiwic2lkIjoiMDRlNjkxMWEtYzkxZi00ODc1LTg5ODYtZTM1MTI5ZGNmNTRlIn0.Mbtp2P1bVFamoq9fAga8uPCOzVERw3ICddj03WgXGEA",
  "access_expires_at": "2026-10-28T13:18:20.938079114Z",
  "refresh_token": "wxn2fiShPAGWizmRT7ZPEzb8lYBGwIg1CK9pnwoXygs",
  "refresh_expires_at": "2026-10-29T01:03:20.937673885Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638416327` → **200**

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
  "correlation_id": "b36fbf4b-d29d-4307-82f3-20d46a29f4a6"
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
  "session_id": "6a63cdab-ccca-4700-99de-89d4aa5c6f3b",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1MDEsImlhdCI6MTc5MzE5MjYwMSwianRpIjoiYzhkMmEyYmQtNTU0NS00OWY2LWI3NjUtMTBhMTU5ZmQzZDM5Iiwic2lkIjoiNmE2M2NkYWItY2NjYS00NzAwLTk5ZGUtODlkNGFhNWM2ZjNiIn0.hC8N9br5C8gpe8vQijo8IN3X9ktrejbE3vkSW6LpPKs",
  "access_expires_at": "2026-10-28T13:18:21.837123116Z",
  "refresh_token": "WVAl1Q_YGoPpSqtNCh1AdrYfvL6P4G4wL1eO8wu0bOk",
  "refresh_expires_at": "2026-10-29T01:03:21.836553188Z",
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
  "command_id": "491a7aa1-0a18-4019-b318-9216bf6aa215",
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
  "changed_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T13:03:22.275153127Z"
}
```

## The rider books the airport for 2026-10-28T16:03:21Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600950405",
  "device_ref": "sandbox-2786"
}
```

```json
{
  "challenge_id": "2c4ee7e6-f626-418e-bb29-c40d47785153",
  "expires_at": "2026-10-28T13:08:22.490291964Z",
  "resend_available_at": "2026-10-28T13:03:23.490291964Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600950405` → **200**

```json
{
  "phone": "+48600950405",
  "audience": "CLIENT",
  "code": "270846",
  "sent_at": "2026-10-28T13:03:22.492067923Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c4ee7e6-f626-418e-bb29-c40d47785153",
  "code": "270846",
  "device_ref": "sandbox-2786"
}
```

```json
{
  "session_id": "1dc347a1-4de2-48d6-8d93-81b082319c4a",
  "subject": {
    "type": "CLIENT",
    "id": "c43f9ce4-184c-4380-96b0-aea6170c1b40"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDNmOWNlNC0xODRjLTQzODAtOTZiMC1hZWE2MTcwYzFiNDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNTAyLCJpYXQiOjE3OTMxOTI2MDIsImp0aSI6ImRkOTQ0MzBmLWY5N2QtNDZhOC05YTk1LTIwODc3MTdmNGQwYiIsInNpZCI6IjFkYzM0N2ExLTRkZTItNDhkNi04ZDkzLTgxYjA4MjMxOWM0YSJ9.YTm9-9RW8__pbWPKSI4rqzTg3G_3mkdZ70SMycovtqA",
  "access_expires_at": "2026-10-28T13:18:22.729442686Z",
  "refresh_token": "znCI7AlSBRdld4L869TFJqsoAmxFngauDJzXJEUl59c",
  "refresh_expires_at": "2026-11-27T13:03:22.728991198Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3feea48f-060d-42d6-8a89-c18c7f49a41d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T16:03:21Z"
}
```

```json
{
  "id": "0387d445-5a88-4932-8968-5966e9a8f92d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:08:22.957222Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T16:03:21Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9ef28e56-fb8f-49b8-a6f3-acbf3f9e131f",
  "quote_id": "0387d445-5a88-4932-8968-5966e9a8f92d",
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
  "pickup_at": "2026-10-28T16:03:21Z"
}
```

```json
{
  "id": "0e0a6ecf-a4b6-46c9-9f97-2b74e0251de8",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c43f9ce4-184c-4380-96b0-aea6170c1b40",
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
  "created_at": "2026-10-28T13:03:23.176267Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:03:21Z",
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
  "device_ref": "sandbox-22013"
}
```

```json
{
  "challenge_id": "fbd1f5b9-17f3-4de3-bf0b-2c371bf62fea",
  "expires_at": "2026-10-28T13:08:23.398598539Z",
  "resend_available_at": "2026-10-28T13:03:24.398598539Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "520938",
  "sent_at": "2026-10-28T13:03:23.400408818Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fbd1f5b9-17f3-4de3-bf0b-2c371bf62fea",
  "code": "520938",
  "device_ref": "sandbox-22013"
}
```

```json
{
  "session_id": "89ffedfe-4548-4448-8eda-42594ac8f59e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzUwMywiaWF0IjoxNzkzMTkyNjAzLCJqdGkiOiI3YTg0MTQ2ZS1jYTc4LTQ1M2EtODVjOC04ZGU3ZDM4OTVmNjciLCJzaWQiOiI4OWZmZWRmZS00NTQ4LTQ0NDgtOGVkYS00MjU5NGFjOGY1OWUifQ.ZtYeL4cyojrfnA3XrZlEQ02Vp80tB4LbR-tKkwHoFeE",
  "access_expires_at": "2026-10-28T13:18:23.629044579Z",
  "refresh_token": "c-xBNuyCDx5V3mdRrRX4Ih9q0b-mowGfcbxdmYDCYUs",
  "refresh_expires_at": "2026-11-27T13:03:23.628557839Z",
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
  "command_id": "b7656fd1-09fc-4b53-8d73-2dd25507b1b3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:03:24Z",
    "sequence": 1793192604459
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c986a398-5084-463f-a2ff-6000c3d5cf35",
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
  "last_heartbeat_at": "2026-10-28T13:03:24.061115Z",
  "last_location_at": "2026-10-28T13:03:24.061115Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "0e0a6ecf-a4b6-46c9-9f97-2b74e0251de8",
      "short_number": 18,
      "pickup_at": "2026-10-28T16:03:21Z",
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

`POST /api/driver/v1/preorders/0e0a6ecf-a4b6-46c9-9f97-2b74e0251de8/reserve` → **200**

```json
{
  "command_id": "1dd2729d-6080-4e4b-9ee1-d79a12039d96"
}
```

```json
{
  "id": "4b3b598e-d896-4f06-9cb2-742d55c244be",
  "state": "RESERVED",
  "order": {
    "order_id": "0e0a6ecf-a4b6-46c9-9f97-2b74e0251de8",
    "short_number": 18,
    "pickup_at": "2026-10-28T16:03:21Z",
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
  "reserved_at": "2026-10-28T13:03:24.494103Z",
  "confirm_from": "2026-10-28T15:33:21Z",
  "confirm_until": "2026-10-28T15:43:21Z",
  "drop_until": "2026-10-28T15:03:21Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "4b3b598e-d896-4f06-9cb2-742d55c244be",
      "state": "RESERVED",
      "order": {
        "order_id": "0e0a6ecf-a4b6-46c9-9f97-2b74e0251de8",
        "short_number": 18,
        "pickup_at": "2026-10-28T16:03:21Z",
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
      "reserved_at": "2026-10-28T13:03:24.494103Z",
      "confirm_from": "2026-10-28T15:33:21Z",
      "confirm_until": "2026-10-28T15:43:21Z",
      "drop_until": "2026-10-28T15:03:21Z"
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
      "id": "4b3b598e-d896-4f06-9cb2-742d55c244be",
      "state": "RESERVED",
      "order": {
        "order_id": "0e0a6ecf-a4b6-46c9-9f97-2b74e0251de8",
        "short_number": 18,
        "pickup_at": "2026-10-28T16:03:21Z",
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
      "reserved_at": "2026-10-28T13:03:24.494103Z",
      "confirm_from": "2026-10-28T15:33:21Z",
      "confirm_until": "2026-10-28T15:43:21Z",
      "drop_until": "2026-10-28T15:03:21Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/4b3b598e-d896-4f06-9cb2-742d55c244be/confirm` → **409**

```json
{
  "command_id": "8affa0b5-3a6c-40bc-b05a-ce5a04787688"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/4b3b598e-d896-4f06-9cb2-742d55c244be/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "54b6346e-b184-4d3b-bd97-ded578f90921"
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
  "session_id": "5c5caa3d-286f-4749-a5dd-7423cf986454",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1MDUsImlhdCI6MTc5MzE5MjYwNSwianRpIjoiMjAyMDljNmEtMDc2Ny00OTllLTlkOGItYTk4YTI5MWQ1MGVjIiwic2lkIjoiNWM1Y2FhM2QtMjg2Zi00NzQ5LWE1ZGQtNzQyM2NmOTg2NDU0In0.rnL847NBR6c6aH8GKHUoxz3JsyuP_dzZXfIKQeSTBTA",
  "access_expires_at": "2026-10-28T13:18:25.58001147Z",
  "refresh_token": "y_fevv64ppNnmg20OE_d2SRocjVCwCNfO7Stt7KPnsc",
  "refresh_expires_at": "2026-10-29T01:03:25.579541004Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0e0a6ecf-a4b6-46c9-9f97-2b74e0251de8` → **200**

```json
{
  "id": "0e0a6ecf-a4b6-46c9-9f97-2b74e0251de8",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c43f9ce4-184c-4380-96b0-aea6170c1b40",
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
  "created_at": "2026-10-28T13:03:23.176267Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T16:03:21Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "4b3b598e-d896-4f06-9cb2-742d55c244be",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T13:03:24.494103Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0e0a6ecf-a4b6-46c9-9f97-2b74e0251de8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T13:03:23.177195Z",
      "actor": {
        "type": "CLIENT",
        "id": "c43f9ce4-184c-4380-96b0-aea6170c1b40",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "0e0a6ecf-a4b6-46c9-9f97-2b74e0251de8",
        "preorder": true,
        "quote_id": "0387d445-5a88-4932-8968-5966e9a8f92d",
        "pickup_at": "2026-10-28T16:03:21Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "5d05b4f9-f0c7-4ebd-a9b7-857f55ca1cf5"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T13:03:24.494949Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0e0a6ecf-a4b6-46c9-9f97-2b74e0251de8",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "4b3b598e-d896-4f06-9cb2-742d55c244be"
      },
      "correlation_id": "76c43358-82ad-4f1b-bac3-5f751c6a6de8"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 0e0a6ecf-a4b6-46c9-9f97-2b74e0251de8, reservation 4b3b598e-d896-4f06-9cb2-742d55c244be.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2265"
}
```

```json
{
  "challenge_id": "3642fd17-5fe1-4ed6-8612-a036d165afdf",
  "expires_at": "2026-10-28T13:08:26.238981411Z",
  "resend_available_at": "2026-10-28T13:03:27.238981411Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "932712",
  "sent_at": "2026-10-28T13:03:26.240798144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3642fd17-5fe1-4ed6-8612-a036d165afdf",
  "code": "932712",
  "device_ref": "sandbox-2265"
}
```

```json
{
  "session_id": "4847a042-b6c1-4676-9b16-56339c1c39d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzUwNiwiaWF0IjoxNzkzMTkyNjA2LCJqdGkiOiIxMGQzM2VhMC00ODgxLTQ2OGUtYmNlNC02MGRmNGYyYWJiN2UiLCJzaWQiOiI0ODQ3YTA0Mi1iNmMxLTQ2NzYtOWIxNi01NjMzOWMxYzM5ZDgifQ.hvbE_rMgFhgGN3znkzVHulpWO6lDlquHxxLf4hEjnV8",
  "access_expires_at": "2026-10-28T13:18:26.470655529Z",
  "refresh_token": "D6uKx8QzjBIqgtIKMmFGL509WFmw4K7cMImUx9SQJt4",
  "refresh_expires_at": "2026-11-27T13:03:26.470032397Z",
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
  "command_id": "07963657-eb10-4cad-8bfb-59385c2a4648",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:03:26Z",
    "sequence": 1793192606882
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b858c06a-fced-4167-ab1c-58464d7a3b2a",
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
  "last_heartbeat_at": "2026-10-28T13:03:26.898173Z",
  "last_location_at": "2026-10-28T13:03:26.898173Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675396679",
  "device_ref": "sandbox-5590"
}
```

```json
{
  "challenge_id": "c2790cfe-c2e8-40c8-9e33-0818bf6297ba",
  "expires_at": "2026-10-28T13:08:27.110867937Z",
  "resend_available_at": "2026-10-28T13:03:28.110867937Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675396679` → **200**

```json
{
  "phone": "+380675396679",
  "audience": "CLIENT",
  "code": "607315",
  "sent_at": "2026-10-28T13:03:27.112956828Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2790cfe-c2e8-40c8-9e33-0818bf6297ba",
  "code": "607315",
  "device_ref": "sandbox-5590"
}
```

```json
{
  "session_id": "6f44329d-cf8a-4584-b96b-149e60eb11c2",
  "subject": {
    "type": "CLIENT",
    "id": "aece098b-7324-4334-bdd2-857ae407b4a2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZWNlMDk4Yi03MzI0LTQzMzQtYmRkMi04NTdhZTQwN2I0YTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNTA3LCJpYXQiOjE3OTMxOTI2MDcsImp0aSI6ImMwYWU4NDlhLWZhMWQtNGUzOS1hZDQ2LTdhYTE5MjlmZDNhYiIsInNpZCI6IjZmNDQzMjlkLWNmOGEtNDU4NC1iOTZiLTE0OWU2MGViMTFjMiJ9.jHn_6c-rIfifiCf9x11nPBErklw2Svc6PjEVk8wnGB4",
  "access_expires_at": "2026-10-28T13:18:27.343776997Z",
  "refresh_token": "Q5UzCtIdXL6xHGiW3J-Mg2uYJu7LSAsCx_JAD-D34cU",
  "refresh_expires_at": "2026-11-27T13:03:27.343357336Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "68593c7c-ad57-4937-8826-d0b5ba2cfe3e",
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
  "id": "29b76626-e529-48a1-b924-556e33de18f3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:08:27.558062Z",
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
  "command_id": "9aa8c744-0579-4c7b-b8b1-e54779e0e72a",
  "quote_id": "29b76626-e529-48a1-b924-556e33de18f3",
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
  "id": "7a1abec5-9d0e-4e45-941e-7ce1ba36c99e",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aece098b-7324-4334-bdd2-857ae407b4a2",
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
  "created_at": "2026-10-28T13:03:27.782484Z",
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
    "id": "545c7a23-199f-4174-9646-b18f772e485b",
    "order_id": "7a1abec5-9d0e-4e45-941e-7ce1ba36c99e",
    "expires_at": "2026-10-28T13:03:42.784797Z",
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

`POST /api/driver/v1/offers/545c7a23-199f-4174-9646-b18f772e485b/accept` → **200**

```json
{
  "command_id": "5e11f850-ab7b-428a-a85b-ae24f333dec2"
}
```

```json
{
  "id": "a02a9696-f449-4651-adea-19c8fc4aa7fa",
  "order_id": "7a1abec5-9d0e-4e45-941e-7ce1ba36c99e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "16bedca9-e803-4fe3-96e9-3d00ffacb777",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "16bedca9-e803-4fe3-96e9-3d00ffacb777",
  "order_id": "7a1abec5-9d0e-4e45-941e-7ce1ba36c99e",
  "assignment_id": "a02a9696-f449-4651-adea-19c8fc4aa7fa",
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

`POST /api/driver/v1/work-sessions/b858c06a-fced-4167-ab1c-58464d7a3b2a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:03:28Z",
    "sequence": 1793192608643
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b858c06a-fced-4167-ab1c-58464d7a3b2a",
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
  "last_heartbeat_at": "2026-10-28T13:03:28.659359Z",
  "last_location_at": "2026-10-28T13:03:28.659359Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "16bedca9-e803-4fe3-96e9-3d00ffacb777",
  "order_id": "7a1abec5-9d0e-4e45-941e-7ce1ba36c99e",
  "assignment_id": "a02a9696-f449-4651-adea-19c8fc4aa7fa",
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

`POST /api/driver/v1/trips/16bedca9-e803-4fe3-96e9-3d00ffacb777/arrive` → **200**

```json
{
  "command_id": "5e05dc8d-48c9-4f21-8ed2-be4fb4c89369",
  "expected_version": 0
}
```

```json
{
  "id": "16bedca9-e803-4fe3-96e9-3d00ffacb777",
  "order_id": "7a1abec5-9d0e-4e45-941e-7ce1ba36c99e",
  "assignment_id": "a02a9696-f449-4651-adea-19c8fc4aa7fa",
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
  "arrived_at": "2026-10-28T13:03:29.117319Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/16bedca9-e803-4fe3-96e9-3d00ffacb777/start` → **200**

```json
{
  "command_id": "bc78b954-d289-49c4-805c-e005f6bb17a4",
  "expected_version": 1
}
```

```json
{
  "id": "16bedca9-e803-4fe3-96e9-3d00ffacb777",
  "order_id": "7a1abec5-9d0e-4e45-941e-7ce1ba36c99e",
  "assignment_id": "a02a9696-f449-4651-adea-19c8fc4aa7fa",
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
  "arrived_at": "2026-10-28T13:03:29.117319Z",
  "started_at": "2026-10-28T13:03:29.344874Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/b858c06a-fced-4167-ab1c-58464d7a3b2a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:03:29Z",
    "sequence": 1793192609558
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b858c06a-fced-4167-ab1c-58464d7a3b2a",
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
  "last_heartbeat_at": "2026-10-28T13:03:29.573696Z",
  "last_location_at": "2026-10-28T13:03:29.573696Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/16bedca9-e803-4fe3-96e9-3d00ffacb777/complete` → **200**

```json
{
  "command_id": "d7c192f8-775e-4af3-b2e8-6efeba36c069",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:03:29Z",
  "cash_received": true
}
```

```json
{
  "id": "16bedca9-e803-4fe3-96e9-3d00ffacb777",
  "order_id": "7a1abec5-9d0e-4e45-941e-7ce1ba36c99e",
  "assignment_id": "a02a9696-f449-4651-adea-19c8fc4aa7fa",
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
  "arrived_at": "2026-10-28T13:03:29.117319Z",
  "started_at": "2026-10-28T13:03:29.344874Z",
  "completed_at": "2026-10-28T13:03:29.792817Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/7a1abec5-9d0e-4e45-941e-7ce1ba36c99e/rating` → **200**

```json
{
  "command_id": "c20ea2a0-1375-4bec-b71e-30f25822663e",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "7a1abec5-9d0e-4e45-941e-7ce1ba36c99e",
  "score": 5,
  "created_at": "2026-10-28T13:03:30.027896316Z"
}
```

`POST /api/driver/v1/orders/7a1abec5-9d0e-4e45-941e-7ce1ba36c99e/rating` → **200**

```json
{
  "command_id": "14863644-4fa4-46a5-8622-bd00144fe3ae",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "7a1abec5-9d0e-4e45-941e-7ce1ba36c99e",
  "score": 4,
  "created_at": "2026-10-28T13:03:30.240767423Z"
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
  "session_id": "ac421402-3847-4a75-adac-59225e8286c5",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1MTAsImlhdCI6MTc5MzE5MjYxMCwianRpIjoiZjc0NWFlNmQtOTdiNS00ZjIzLTkxZDgtYTRjNGU4NDE3YWFmIiwic2lkIjoiYWM0MjE0MDItMzg0Ny00YTc1LWFkYWMtNTkyMjVlODI4NmM1In0.Gy4ChujhsVo6B--rsBgFB9_IZXRiCDzdgrexOCTytFw",
  "access_expires_at": "2026-10-28T13:18:30.961085114Z",
  "refresh_token": "n5z58L1Z3S1n9xiazzjNgQZHIKLH22jjZWBWlAAutQ4",
  "refresh_expires_at": "2026-10-29T01:03:30.96066996Z",
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
  "session_id": "7d4fbcb6-0117-494d-93c1-80afaa315905",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1MTEsImlhdCI6MTc5MzE5MjYxMSwianRpIjoiZWFjMjVhZTAtYmFmYS00N2NlLWI4ZDUtMmU3YjgzMzYzZjM1Iiwic2lkIjoiN2Q0ZmJjYjYtMDExNy00OTRkLTkzYzEtODBhZmFhMzE1OTA1In0.jq5iRJUPH1bQQGcrdQ1kLs80Du8o645V8aGP7IqQUQI",
  "access_expires_at": "2026-10-28T13:18:31.435565075Z",
  "refresh_token": "_M5YjD6QNSshSFV1T1STiKCWCrpkCn8FYVWNP8Uja_s",
  "refresh_expires_at": "2026-10-29T01:03:31.435151133Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7a1abec5-9d0e-4e45-941e-7ce1ba36c99e/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "7a1abec5-9d0e-4e45-941e-7ce1ba36c99e",
      "author_type": "RIDER",
      "author_id": "aece098b-7324-4334-bdd2-857ae407b4a2",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T13:03:30.027896Z"
    },
    {
      "order_id": "7a1abec5-9d0e-4e45-941e-7ce1ba36c99e",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "aece098b-7324-4334-bdd2-857ae407b4a2",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T13:03:30.240767Z"
    }
  ]
}
```

Done: ratings for order 7a1abec5-9d0e-4e45-941e-7ce1ba36c99e.

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
  "session_id": "3def4fe9-a4cc-4d19-8527-38f3aff30ca3",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1MTIsImlhdCI6MTc5MzE5MjYxMiwianRpIjoiZjEzNDhjMWMtZTQwYy00MDc1LWI1MWEtYWIxYzJlZTJkYTlmIiwic2lkIjoiM2RlZjRmZTktYTRjYy00ZDE5LTg1MjctMzhmM2FmZjMwY2EzIn0.75R5MVcAOxjk61_lTU52Noils76F6bJSg-b4Mku31Lg",
  "access_expires_at": "2026-10-28T13:18:32.1281751Z",
  "refresh_token": "k-v7WvAVXcZVAVDiwGwdwMCN31acRTvyFvJeS13Jqps",
  "refresh_expires_at": "2026-10-29T01:03:32.127766485Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "8537aa7a-9dee-4de7-bbbc-0a1c09288120",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "e6973484-6911-49e4-b457-37267d93d8cf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:03:32.349821Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e6973484-6911-49e4-b457-37267d93d8cf` → **200**

```json
{
  "id": "e6973484-6911-49e4-b457-37267d93d8cf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:03:32.349821Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e6973484-6911-49e4-b457-37267d93d8cf` → **200**

```json
{
  "id": "e6973484-6911-49e4-b457-37267d93d8cf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:03:32.349821Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e6973484-6911-49e4-b457-37267d93d8cf` → **200**

```json
{
  "id": "e6973484-6911-49e4-b457-37267d93d8cf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:03:32.349821Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e6973484-6911-49e4-b457-37267d93d8cf` → **200**

```json
{
  "id": "e6973484-6911-49e4-b457-37267d93d8cf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:03:32.349821Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e6973484-6911-49e4-b457-37267d93d8cf` → **200**

```json
{
  "id": "e6973484-6911-49e4-b457-37267d93d8cf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T13:03:32.349821Z",
  "ready_at": "2026-10-28T13:03:36.264342Z",
  "expires_at": "2026-10-29T13:03:36.264342Z"
}
```

`GET /api/admin/v1/reports/exports/e6973484-6911-49e4-b457-37267d93d8cf/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "7a9c0062-1920-40cc-b2bd-22cfbf23d023",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "24e39f30-f20e-4801-a09c-0527dee9de93",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:03:37.709057Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/24e39f30-f20e-4801-a09c-0527dee9de93` → **200**

```json
{
  "id": "24e39f30-f20e-4801-a09c-0527dee9de93",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:03:37.709057Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/24e39f30-f20e-4801-a09c-0527dee9de93` → **200**

```json
{
  "id": "24e39f30-f20e-4801-a09c-0527dee9de93",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:03:37.709057Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/24e39f30-f20e-4801-a09c-0527dee9de93` → **200**

```json
{
  "id": "24e39f30-f20e-4801-a09c-0527dee9de93",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:03:37.709057Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/24e39f30-f20e-4801-a09c-0527dee9de93` → **200**

```json
{
  "id": "24e39f30-f20e-4801-a09c-0527dee9de93",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T13:03:37.709057Z",
  "ready_at": "2026-10-28T13:03:41.27202Z",
  "expires_at": "2026-10-29T13:03:41.27202Z"
}
```

`GET /api/admin/v1/reports/exports/24e39f30-f20e-4801-a09c-0527dee9de93/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/02d90e6d-3f45-4900-9c5c-9dbb41f64a1e` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/02d90e6d-3f45-4900-9c5c-9dbb41f64a1e",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7ef741b4-b53a-4591-b9c7-350d3bd465a5"
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
  "device_ref": "sandbox-24878"
}
```

```json
{
  "challenge_id": "1e0a6744-dd76-47d1-be27-1979e4f17e81",
  "expires_at": "2026-10-28T13:08:42.025048091Z",
  "resend_available_at": "2026-10-28T13:03:43.025048091Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "750947",
  "sent_at": "2026-10-28T13:03:42.026941312Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e0a6744-dd76-47d1-be27-1979e4f17e81",
  "code": "750947",
  "device_ref": "sandbox-24878"
}
```

```json
{
  "session_id": "5728698c-8699-4fde-b12d-2b633997edff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzUyMiwiaWF0IjoxNzkzMTkyNjIyLCJqdGkiOiI1YmFiYTAyNi01ZGRhLTQ5MGItYjA1Yy00NzUzOWE1MzQ1MDUiLCJzaWQiOiI1NzI4Njk4Yy04Njk5LTRmZGUtYjEyZC0yYjYzMzk5N2VkZmYifQ.YNtpMxc7R9Pt2o80yDAyBLTjDKRlVDS1_LNpqd9hZyA",
  "access_expires_at": "2026-10-28T13:18:42.257236306Z",
  "refresh_token": "oEnqyxhBXMWou_-_BQ4nap5JEt_avGstUF5Xth7gf3E",
  "refresh_expires_at": "2026-11-27T13:03:42.256807802Z",
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
  "command_id": "96d7d602-dd14-43cf-903a-30d205023ae8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:03:42Z",
    "sequence": 1793192622919
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1ed131b1-ed89-4484-9ffd-15ef46c0fcc3",
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
  "last_heartbeat_at": "2026-10-28T13:03:42.934854Z",
  "last_location_at": "2026-10-28T13:03:42.934854Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "442f6430-b4a1-4579-8497-cdb131729a22",
  "points": [
    {
      "sequence": 1793192625158,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T13:02:45Z"
    },
    {
      "sequence": 1793192625165,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T13:03:45Z"
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
  "session_id": "5ca54c29-22f3-424f-bb24-6bf12811dadb",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1MjUsImlhdCI6MTc5MzE5MjYyNSwianRpIjoiYmYyMWJkNjItOGE1MS00MDYxLThlMWYtYTZkMzgyZTIxMDFlIiwic2lkIjoiNWNhNTRjMjktMjJmMy00MjRmLWJiMjQtNmJmMTI4MTFkYWRiIn0.KCCfdTd-BBYoyNMEOB8xFSCSJ8VO-iKhGVFgT_REB1k",
  "access_expires_at": "2026-10-28T13:18:45.660795724Z",
  "refresh_token": "0p0wLNot5pw6VpmjuQYv05xqAt8mWcOZBqLizase7N8",
  "refresh_expires_at": "2026-10-29T01:03:45.660392237Z",
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
      "id": "93dcebd5-0955-43e7-b304-e003b9d40b28",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T13:03:45Z",
        "track_point_id": "e98b1800-1261-4c4c-a753-3c61d242f15c",
        "work_session_id": "1ed131b1-ed89-4484-9ffd-15ef46c0fcc3"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T13:03:45Z",
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

`POST /api/admin/v1/driver-risk-flags/93dcebd5-0955-43e7-b304-e003b9d40b28/confirm` → **200**

```json
{
  "command_id": "f304b3a3-91c0-4a2b-9813-dd4a5b04ac96",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "93dcebd5-0955-43e7-b304-e003b9d40b28",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T13:03:45Z",
    "track_point_id": "e98b1800-1261-4c4c-a753-3c61d242f15c",
    "work_session_id": "1ed131b1-ed89-4484-9ffd-15ef46c0fcc3"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T13:03:45Z",
  "reason": null,
  "reviewed_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "reviewed_at": "2026-10-28T13:03:47.539408Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/93dcebd5-0955-43e7-b304-e003b9d40b28/dismiss` → **409**

```json
{
  "command_id": "9d0d8386-6c3a-42f2-88e7-870ace9600b0",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/93dcebd5-0955-43e7-b304-e003b9d40b28/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5930c2af-1a62-4aaa-b6a0-9d1e08fa55e7"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "ecd27549-441a-4e88-a3ea-91574c8e9f1d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "07eac0c6-c8b8-4dda-81f2-48a5a797406a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "raised_at": "2026-10-28T13:03:47.980573Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/07eac0c6-c8b8-4dda-81f2-48a5a797406a/dismiss` → **200**

```json
{
  "command_id": "efc42cf4-1c9a-4d49-ae68-bab8eea03244",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "07eac0c6-c8b8-4dda-81f2-48a5a797406a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "raised_at": "2026-10-28T13:03:47.980573Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "reviewed_at": "2026-10-28T13:03:48.209475Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "4475d8e6-00f3-4963-b162-3dbcc12c5574",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "93dcebd5-0955-43e7-b304-e003b9d40b28"
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
      "actor_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:03:48.440147Z"
    }
  ]
}
```

Done: flag 93dcebd5-0955-43e7-b304-e003b9d40b28 confirmed, suspension named it, driver reinstated.

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
  "session_id": "1e9c3dbe-5e1d-4fd4-901c-5a004e45f530",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1MjksImlhdCI6MTc5MzE5MjYyOSwianRpIjoiNjRjMDQ5NTQtMWQwMi00ZTg3LTg1NWItYWRlMzI4N2Q2ODA3Iiwic2lkIjoiMWU5YzNkYmUtNWUxZC00ZmQ0LTkwMWMtNWEwMDRlNDVmNTMwIn0.yZ1At6jhYJdXysovFTvRbNBjCWktQOeDTg_eLwwVjnw",
  "access_expires_at": "2026-10-28T13:18:49.124257774Z",
  "refresh_token": "rz7MLJtZFrjgck5q3AVrL-NqRZQDOpvV4r1ZUWM_Nd0",
  "refresh_expires_at": "2026-10-29T01:03:49.123861007Z",
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
      "actor_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:03:48.440147Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "9a22f6a5-76f0-4739-93f3-402522e831fe",
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
  "session_id": "1ed131b1-ed89-4484-9ffd-15ef46c0fcc3",
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
  "last_heartbeat_at": "2026-10-28T13:03:42.934854Z",
  "last_location_at": "2026-10-28T13:03:42.934854Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1ed131b1-ed89-4484-9ffd-15ef46c0fcc3/close` → **200**

```json
{
  "command_id": "e1af0ac0-a575-40c7-963e-ffe32457a7b9",
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
  "session_id": "2c1bdcab-4ba1-4c90-a1e3-bcab9e20d007",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1MzAsImlhdCI6MTc5MzE5MjYzMCwianRpIjoiYzhkZTQ1NGItYjY5OS00YTRkLTk2ODgtNmZhN2RhN2M2OTVmIiwic2lkIjoiMmMxYmRjYWItNGJhMS00YzkwLWExZTMtYmNhYjllMjBkMDA3In0.0x_mcr2gK_9fBGCHkBtktT6n_74gzH2g0f8yP4UlWH8",
  "access_expires_at": "2026-10-28T13:18:50.455665437Z",
  "refresh_token": "lU-f6U2Ttl3EKX4GmLJsRcWupNJMFwN2XOgnGCd0T5Y",
  "refresh_expires_at": "2026-10-29T01:03:50.455252817Z",
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
  "command_id": "db5ceb1d-9ba2-472b-8335-63ec812fec6c",
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
  "changed_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T13:03:50.891007Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "db5ceb1d-9ba2-472b-8335-63ec812fec6c",
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
  "changed_by": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T13:03:50.891007Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48919700803",
  "device_ref": "sandbox-25054"
}
```

```json
{
  "challenge_id": "2e86292f-598f-46bd-8681-7f5e68f5150e",
  "expires_at": "2026-10-28T13:08:51.325505234Z",
  "resend_available_at": "2026-10-28T13:03:52.325505234Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48919700803` → **200**

```json
{
  "phone": "+48919700803",
  "audience": "CLIENT",
  "code": "168308",
  "sent_at": "2026-10-28T13:03:51.32716515Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e86292f-598f-46bd-8681-7f5e68f5150e",
  "code": "168308",
  "device_ref": "sandbox-25054"
}
```

```json
{
  "session_id": "c9257148-1ae5-4e46-a7ed-e0ad72d02422",
  "subject": {
    "type": "CLIENT",
    "id": "ebde9a99-bd53-4b62-a90d-63b91fd9f36d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYmRlOWE5OS1iZDUzLTRiNjItYTkwZC02M2I5MWZkOWYzNmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNTMxLCJpYXQiOjE3OTMxOTI2MzEsImp0aSI6ImM1Mjc3YjE2LTFkYzgtNGM2Mi04MDVlLTZjMmNjNWVmZGEyNSIsInNpZCI6ImM5MjU3MTQ4LTFhZTUtNGU0Ni1hN2VkLWUwYWQ3MmQwMjQyMiJ9.B2I0vyjDA6gjaOAuDIzb4-TCIFfT7wP3968UQF8c7Sc",
  "access_expires_at": "2026-10-28T13:18:51.554071275Z",
  "refresh_token": "gzM8VjiglBHWJfVJzjO4H4DzEhjH41R1wTKbRTEIl8Y",
  "refresh_expires_at": "2026-11-27T13:03:51.553705434Z",
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
  "correlation_id": "7b4b274e-9f12-40a3-a78b-c70477759d20"
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
  "device_ref": "sandbox-27156"
}
```

```json
{
  "challenge_id": "98814a78-39a7-4705-a09a-ac7c94398fb6",
  "expires_at": "2026-10-28T13:08:52.200322776Z",
  "resend_available_at": "2026-10-28T13:03:53.200322776Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "422433",
  "sent_at": "2026-10-28T13:03:52.202076615Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98814a78-39a7-4705-a09a-ac7c94398fb6",
  "code": "422433",
  "device_ref": "sandbox-27156"
}
```

```json
{
  "session_id": "4bb1ad0c-4c4c-4f10-b782-d137bc86991e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzUzMiwiaWF0IjoxNzkzMTkyNjMyLCJqdGkiOiJiYmY0MTRjMi02ZWQwLTRiNzMtOWVhNC0yNGJkYmY2Y2QzZDAiLCJzaWQiOiI0YmIxYWQwYy00YzRjLTRmMTAtYjc4Mi1kMTM3YmM4Njk5MWUifQ.MRuxWvl6jwrwyaBTgtGN4LPG95Y-OuaNjeGfaEKWkWU",
  "access_expires_at": "2026-10-28T13:18:52.433742739Z",
  "refresh_token": "OS2QVu1MmKIonal5eOuyF1aimlPxBdX3AJhTDsRtEnE",
  "refresh_expires_at": "2026-11-27T13:03:52.433312182Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c986a398-5084-463f-a2ff-6000c3d5cf35",
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
  "last_heartbeat_at": "2026-10-28T13:03:24.061115Z",
  "last_location_at": "2026-10-28T13:03:24.061115Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c986a398-5084-463f-a2ff-6000c3d5cf35/handover` → **200**

```json
{
  "command_id": "c16925ff-5982-4ba1-a14f-94c1888c320a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c986a398-5084-463f-a2ff-6000c3d5cf35",
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
  "last_heartbeat_at": "2026-10-28T13:03:24.061115Z",
  "last_location_at": "2026-10-28T13:03:24.061115Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c986a398-5084-463f-a2ff-6000c3d5cf35/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:03:53Z",
    "sequence": 1793192633688
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c986a398-5084-463f-a2ff-6000c3d5cf35",
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
  "last_heartbeat_at": "2026-10-28T13:03:53.084037Z",
  "last_location_at": "2026-10-28T13:03:53.084037Z",
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
  "session_id": "c986a398-5084-463f-a2ff-6000c3d5cf35",
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
  "last_heartbeat_at": "2026-10-28T13:03:53.084037Z",
  "last_location_at": "2026-10-28T13:03:53.084037Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c986a398-5084-463f-a2ff-6000c3d5cf35/close` → **200**

```json
{
  "command_id": "51a34949-5031-4309-8f05-599196eb6d2f",
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
  "correlation_id": "7f96800e-bea8-415c-94c8-ff3972ec6bfd"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672987629",
  "device_ref": "sandbox-18079"
}
```

```json
{
  "challenge_id": "781d3da5-a51b-4461-ba28-d62bfc819029",
  "expires_at": "2026-10-28T13:08:54.186202727Z",
  "resend_available_at": "2026-10-28T13:03:55.186202727Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672987629` → **200**

```json
{
  "phone": "+380672987629",
  "audience": "CLIENT",
  "code": "172703",
  "sent_at": "2026-10-28T13:03:54.187942161Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "781d3da5-a51b-4461-ba28-d62bfc819029",
  "code": "172703",
  "device_ref": "sandbox-18079"
}
```

```json
{
  "session_id": "373f5420-d078-42aa-b679-382c622925a3",
  "subject": {
    "type": "CLIENT",
    "id": "72a48fcf-c946-402f-9b77-211f29c11a14"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MmE0OGZjZi1jOTQ2LTQwMmYtOWI3Ny0yMTFmMjljMTFhMTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTkzNTM0LCJpYXQiOjE3OTMxOTI2MzQsImp0aSI6ImIzYzAyM2M0LTE5NTctNDZjNS1hMGI3LWI5ZmFhZThlNGNmYSIsInNpZCI6IjM3M2Y1NDIwLWQwNzgtNDJhYS1iNjc5LTM4MmM2MjI5MjVhMyJ9.PgY8gwqdeElZfgLR_sPXmjhyJf2hB2o4dw5bWLMkO7c",
  "access_expires_at": "2026-10-28T13:18:54.502353672Z",
  "refresh_token": "oY2JClUVRWTCgDAkHBj0UDw5H9l6yznpwwYIp3uxDP4",
  "refresh_expires_at": "2026-11-27T13:03:54.501768897Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "2a9d3dbf-8343-4bef-b623-b065a451a3b0",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "0d6a3c4d-6e09-4b77-9ba9-6a88dd890585",
  "upload_path": "/api/rider/v1/uploads/0d6a3c4d-6e09-4b77-9ba9-6a88dd890585",
  "expires_at": "2026-10-28T13:18:54.802974974Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/0d6a3c4d-6e09-4b77-9ba9-6a88dd890585` → **200**

```json
{
  "file_id": "0d6a3c4d-6e09-4b77-9ba9-6a88dd890585",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "65bc5b26-9ed2-4097-8255-3abf2429ffde",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "0d6a3c4d-6e09-4b77-9ba9-6a88dd890585"
  ]
}
```

```json
{
  "id": "b3e7dc51-8388-4e7d-b15d-74f99a3185ed",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "72a48fcf-c946-402f-9b77-211f29c11a14",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T13:03:55.039303Z",
  "updated_at": "2026-10-28T13:03:55.039303Z",
  "messages": [
    {
      "id": "ef7215ea-2e45-4941-8869-928bc6bf6234",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "72a48fcf-c946-402f-9b77-211f29c11a14",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:03:55.0408Z",
      "attachments": [
        {
          "file_id": "0d6a3c4d-6e09-4b77-9ba9-6a88dd890585",
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
  "session_id": "c5047cd6-83c4-4a42-9900-291d618e19f4",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1MzUsImlhdCI6MTc5MzE5MjYzNSwianRpIjoiNmY4OGE0N2MtOWQxZC00ODQyLWEyZDUtN2JjMTY2ODJiYTE0Iiwic2lkIjoiYzUwNDdjZDYtODNjNC00YTQyLTk5MDAtMjkxZDYxOGUxOWY0In0.W7jpDvnYiaEf9IMUaSLL60f91sRY6VrzyZ1g7qvCouw",
  "access_expires_at": "2026-10-28T13:18:55.54360115Z",
  "refresh_token": "GzEVcnCI25QfnpLh6Vc7Ikus_jkuN7Z62u08913VtoM",
  "refresh_expires_at": "2026-10-29T01:03:55.543108371Z",
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
  "session_id": "33bc1bc9-3b14-4c6d-8419-92e74b879c9d",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1MzYsImlhdCI6MTc5MzE5MjYzNiwianRpIjoiMWIxMTFkOTAtZGRmNC00Y2JjLWE3YzctMjAzMWU5MTQ2MWZmIiwic2lkIjoiMzNiYzFiYzktM2IxNC00YzZkLTg0MTktOTJlNzRiODc5YzlkIn0.tF-ueR2bbCewXFdtabXR8UrVaZzU5J64mHUCBxUVUjI",
  "access_expires_at": "2026-10-28T13:18:56.028014808Z",
  "refresh_token": "eYtbSaEXU0teOaJlNCRmhMi7ELa3YrW0_rn5acO6QyQ",
  "refresh_expires_at": "2026-10-29T01:03:56.027548628Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/b3e7dc51-8388-4e7d-b15d-74f99a3185ed/attachments/0d6a3c4d-6e09-4b77-9ba9-6a88dd890585` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "f96c82fc-be79-429a-b2e7-378a9af417dd",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "41392018-3d24-4432-8187-68b4d82823cc",
  "upload_path": "/api/operator/v1/uploads/41392018-3d24-4432-8187-68b4d82823cc",
  "expires_at": "2026-10-28T13:18:56.260931738Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/41392018-3d24-4432-8187-68b4d82823cc` → **200**

```json
{
  "file_id": "41392018-3d24-4432-8187-68b4d82823cc",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/b3e7dc51-8388-4e7d-b15d-74f99a3185ed` → **200**

```json
{
  "id": "b3e7dc51-8388-4e7d-b15d-74f99a3185ed",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "72a48fcf-c946-402f-9b77-211f29c11a14",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T13:03:55.039303Z",
  "updated_at": "2026-10-28T13:03:55.039303Z",
  "messages": [
    {
      "id": "ef7215ea-2e45-4941-8869-928bc6bf6234",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "72a48fcf-c946-402f-9b77-211f29c11a14",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:03:55.0408Z",
      "attachments": [
        {
          "file_id": "0d6a3c4d-6e09-4b77-9ba9-6a88dd890585",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/b3e7dc51-8388-4e7d-b15d-74f99a3185ed/comments` → **200**

```json
{
  "command_id": "3c91eee6-a2dd-4247-a50a-91c725fcf72a",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "41392018-3d24-4432-8187-68b4d82823cc"
  ]
}
```

```json
{
  "id": "b3e7dc51-8388-4e7d-b15d-74f99a3185ed",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "72a48fcf-c946-402f-9b77-211f29c11a14",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T13:03:55.039303Z",
  "updated_at": "2026-10-28T13:03:56.711125Z",
  "messages": [
    {
      "id": "ef7215ea-2e45-4941-8869-928bc6bf6234",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "72a48fcf-c946-402f-9b77-211f29c11a14",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:03:55.0408Z",
      "attachments": [
        {
          "file_id": "0d6a3c4d-6e09-4b77-9ba9-6a88dd890585",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "5359ec6f-2d92-49e8-87ef-8aa59370b1a6",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T13:03:56.71086Z",
      "attachments": [
        {
          "file_id": "41392018-3d24-4432-8187-68b4d82823cc",
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

`GET /api/rider/v1/support/cases/b3e7dc51-8388-4e7d-b15d-74f99a3185ed` → **200**

```json
{
  "id": "b3e7dc51-8388-4e7d-b15d-74f99a3185ed",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "72a48fcf-c946-402f-9b77-211f29c11a14",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T13:03:55.039303Z",
  "updated_at": "2026-10-28T13:03:56.711125Z",
  "messages": [
    {
      "id": "ef7215ea-2e45-4941-8869-928bc6bf6234",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "72a48fcf-c946-402f-9b77-211f29c11a14",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:03:55.0408Z",
      "attachments": [
        {
          "file_id": "0d6a3c4d-6e09-4b77-9ba9-6a88dd890585",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "5359ec6f-2d92-49e8-87ef-8aa59370b1a6",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T13:03:56.71086Z",
      "attachments": [
        {
          "file_id": "41392018-3d24-4432-8187-68b4d82823cc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/b3e7dc51-8388-4e7d-b15d-74f99a3185ed/attachments/41392018-3d24-4432-8187-68b4d82823cc` → **200**

Done: support case b3e7dc51-8388-4e7d-b15d-74f99a3185ed, rider attachment 0d6a3c4d-6e09-4b77-9ba9-6a88dd890585, operator attachment 41392018-3d24-4432-8187-68b4d82823cc.

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
  "session_id": "f9d5583b-4922-4d4d-8f6c-83e9a96f1b50",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1MzcsImlhdCI6MTc5MzE5MjYzNywianRpIjoiOTE0MmRlNzgtNzI0OS00MmMyLTllZjQtYmNmY2NlZGI4YTgyIiwic2lkIjoiZjlkNTU4M2ItNDkyMi00ZDRkLThmNmMtODNlOWE5NmYxYjUwIn0.M0IqNPpL1CxqhVBek6b5zebE9evVXB6IXNnXiSYbzFE",
  "access_expires_at": "2026-10-28T13:18:57.453810249Z",
  "refresh_token": "63U0kL8DVz-gh1qipORdaT__YOdncb1h20sIJ7e1SjY",
  "refresh_expires_at": "2026-10-29T01:03:57.453298242Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22338"
}
```

```json
{
  "challenge_id": "b89ead99-56b3-407b-af21-c6727ea4d5dd",
  "expires_at": "2026-10-28T13:08:57.658816257Z",
  "resend_available_at": "2026-10-28T13:03:58.658816257Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "858362",
  "sent_at": "2026-10-28T13:03:57.660595019Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b89ead99-56b3-407b-af21-c6727ea4d5dd",
  "code": "858362",
  "device_ref": "sandbox-22338"
}
```

```json
{
  "session_id": "a513ef0a-81a4-4bb3-90a7-57dc6a1820d6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzUzNywiaWF0IjoxNzkzMTkyNjM3LCJqdGkiOiI0MWNmMWJjZS0wMjY2LTQ5NjgtOGI3MS04YTgzYjMyMjVlNmIiLCJzaWQiOiJhNTEzZWYwYS04MWE0LTRiYjMtOTBhNy01N2RjNmExODIwZDYifQ.uI3FjHsrmQVBCM5XoPx6NojWDacs2UY_-boMk09e2ds",
  "access_expires_at": "2026-10-28T13:18:57.89640963Z",
  "refresh_token": "-tuaUDVILH1zFcnwjemvjKNr_dAk6OYpB7CRYmzr0Hg",
  "refresh_expires_at": "2026-11-27T13:03:57.89576068Z",
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
      "actor_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:03:48.440147Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T13:03:49.551137Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "08e40774-43cf-4670-9f8b-b4bac24178e1",
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
  "device_ref": "sandbox-5007"
}
```

```json
{
  "challenge_id": "794a3df7-cb7f-453d-8838-af90646a20fa",
  "expires_at": "2026-10-28T13:08:58.76388605Z",
  "resend_available_at": "2026-10-28T13:03:59.76388605Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "985503",
  "sent_at": "2026-10-28T13:03:58.765517534Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "794a3df7-cb7f-453d-8838-af90646a20fa",
  "code": "985503",
  "device_ref": "sandbox-5007"
}
```

```json
{
  "session_id": "83073262-0027-418a-99ce-4bbb44b268a4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5MzUzOCwiaWF0IjoxNzkzMTkyNjM4LCJqdGkiOiI1MmIzN2NkOS1mNjIyLTQ5YzQtODExNi1mZTNjNzVhZmI0NzAiLCJzaWQiOiI4MzA3MzI2Mi0wMDI3LTQxOGEtOTljZS00YmJiNDRiMjY4YTQifQ.0sLYyOlQQN4QhSWNgD3uoTdtSZSiTlAVkdFTjpTE-1g",
  "access_expires_at": "2026-10-28T13:18:58.993457469Z",
  "refresh_token": "LKAK8dHsFssLa-iCo-wP0XS_ZovmyhV36tmB-RUuzoI",
  "refresh_expires_at": "2026-11-27T13:03:58.993015901Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b858c06a-fced-4167-ab1c-58464d7a3b2a",
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
  "last_heartbeat_at": "2026-10-28T13:03:29.573696Z",
  "last_location_at": "2026-10-28T13:03:29.573696Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b858c06a-fced-4167-ab1c-58464d7a3b2a/handover` → **200**

```json
{
  "command_id": "ae4816ca-da43-4b66-b1af-e172f6d48642",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b858c06a-fced-4167-ab1c-58464d7a3b2a",
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
  "last_heartbeat_at": "2026-10-28T13:03:29.573696Z",
  "last_location_at": "2026-10-28T13:03:29.573696Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b858c06a-fced-4167-ab1c-58464d7a3b2a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:03:59Z",
    "sequence": 1793192639622
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b858c06a-fced-4167-ab1c-58464d7a3b2a",
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
  "last_heartbeat_at": "2026-10-28T13:03:59.63825Z",
  "last_location_at": "2026-10-28T13:03:59.63825Z",
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
  "command_id": "5927ff52-15b4-4ff1-bd7f-a2b406e26592",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:04:00Z",
    "sequence": 1793192640515
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "02a062a7-249d-4a9f-b037-1f6b8e82fa66",
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
  "last_heartbeat_at": "2026-10-28T13:04:00.066242Z",
  "last_location_at": "2026-10-28T13:04:00.066242Z",
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
  "session_id": "33ed3e0a-2980-495a-a0af-84c4200c831b",
  "subject": {
    "type": "STAFF",
    "id": "a21086f5-0ace-42c1-adfb-bfc037b6ebcc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjEwODZmNS0wYWNlLTQyYzEtYWRmYi1iZmMwMzdiNmViY2MiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTM1NDAsImlhdCI6MTc5MzE5MjY0MCwianRpIjoiMDkwYTQzNjYtNDI0Yi00ZGU3LWI1YjctOGJmYjQ0YzYzMTM2Iiwic2lkIjoiMzNlZDNlMGEtMjk4MC00OTVhLWEwYWYtODRjNDIwMGM4MzFiIn0.esjOtfG0XRx0FjR-e3tHvl2DsofAOWU9Gqx-2HR0QIY",
  "access_expires_at": "2026-10-28T13:19:00.535819497Z",
  "refresh_token": "yc1JjXNIQmLSCXYXtr5-k4hMVGgh5oDNo3ffHmXJemg",
  "refresh_expires_at": "2026-10-29T01:04:00.535364163Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b4ff4e27-675b-462b-9548-8a467dbc2aee",
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
  "id": "bfd3c550-51ca-49be-a173-f65fd4d8ff00",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:09:00.746446Z",
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
  "command_id": "e7377099-8735-46e4-9432-332259d44586",
  "quote_id": "bfd3c550-51ca-49be-a173-f65fd4d8ff00",
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
  "id": "feb4460e-792c-426f-a78c-efb716e0fe16",
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
  "created_at": "2026-10-28T13:04:00.968109Z",
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
    "id": "4f927c67-7a0c-4a88-88a9-a4da407cba0f",
    "order_id": "feb4460e-792c-426f-a78c-efb716e0fe16",
    "expires_at": "2026-10-28T13:04:15.971283Z",
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

`POST /api/driver/v1/offers/4f927c67-7a0c-4a88-88a9-a4da407cba0f/accept` → **200**

```json
{
  "command_id": "d672f90f-de5e-4976-a785-26d9a9ce0b1b"
}
```

```json
{
  "id": "d054ae12-cc95-4ec1-bdd3-53adf08cf497",
  "order_id": "feb4460e-792c-426f-a78c-efb716e0fe16",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "55b1c176-df90-4d0f-a044-e3acd0921ff8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "55b1c176-df90-4d0f-a044-e3acd0921ff8",
  "order_id": "feb4460e-792c-426f-a78c-efb716e0fe16",
  "assignment_id": "d054ae12-cc95-4ec1-bdd3-53adf08cf497",
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

`POST /api/driver/v1/work-sessions/02a062a7-249d-4a9f-b037-1f6b8e82fa66/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:04:02Z",
    "sequence": 1793192642340
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "02a062a7-249d-4a9f-b037-1f6b8e82fa66",
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
  "last_heartbeat_at": "2026-10-28T13:04:02.049671Z",
  "last_location_at": "2026-10-28T13:04:02.049671Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/55b1c176-df90-4d0f-a044-e3acd0921ff8/arrive` → **200**

```json
{
  "command_id": "fa93f002-3690-41fd-8dd6-8470c462f800",
  "expected_version": 0
}
```

```json
{
  "id": "55b1c176-df90-4d0f-a044-e3acd0921ff8",
  "order_id": "feb4460e-792c-426f-a78c-efb716e0fe16",
  "assignment_id": "d054ae12-cc95-4ec1-bdd3-53adf08cf497",
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
  "arrived_at": "2026-10-28T13:04:02.266019Z",
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

`POST /api/driver/v1/trips/55b1c176-df90-4d0f-a044-e3acd0921ff8/start` → **200**

```json
{
  "command_id": "c70d555b-a4fa-4fa9-a2e7-ccadf7b9a1c2",
  "expected_version": 1
}
```

```json
{
  "id": "55b1c176-df90-4d0f-a044-e3acd0921ff8",
  "order_id": "feb4460e-792c-426f-a78c-efb716e0fe16",
  "assignment_id": "d054ae12-cc95-4ec1-bdd3-53adf08cf497",
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
  "arrived_at": "2026-10-28T13:04:02.266019Z",
  "started_at": "2026-10-28T13:04:02.484801Z",
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

`POST /api/driver/v1/trips/55b1c176-df90-4d0f-a044-e3acd0921ff8/complete` → **200**

```json
{
  "command_id": "c6079658-f938-4ebb-bad0-c26ee67965bd",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:04:02Z",
  "cash_received": true
}
```

```json
{
  "id": "55b1c176-df90-4d0f-a044-e3acd0921ff8",
  "order_id": "feb4460e-792c-426f-a78c-efb716e0fe16",
  "assignment_id": "d054ae12-cc95-4ec1-bdd3-53adf08cf497",
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
  "arrived_at": "2026-10-28T13:04:02.266019Z",
  "started_at": "2026-10-28T13:04:02.484801Z",
  "completed_at": "2026-10-28T13:04:02.705869Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/feb4460e-792c-426f-a78c-efb716e0fe16` → **200**

```json
{
  "id": "feb4460e-792c-426f-a78c-efb716e0fe16",
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
    "id": "d054ae12-cc95-4ec1-bdd3-53adf08cf497",
    "order_id": "feb4460e-792c-426f-a78c-efb716e0fe16",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "55b1c176-df90-4d0f-a044-e3acd0921ff8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:04:00.968109Z",
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
  "session_id": "b858c06a-fced-4167-ab1c-58464d7a3b2a",
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
  "last_heartbeat_at": "2026-10-28T13:03:59.63825Z",
  "last_location_at": "2026-10-28T13:03:59.63825Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b858c06a-fced-4167-ab1c-58464d7a3b2a/close` → **200**

```json
{
  "command_id": "3cc558f4-b430-46fe-9dba-ec2632712498",
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
  "session_id": "02a062a7-249d-4a9f-b037-1f6b8e82fa66",
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
  "last_heartbeat_at": "2026-10-28T13:04:02.049671Z",
  "last_location_at": "2026-10-28T13:04:02.049671Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/02a062a7-249d-4a9f-b037-1f6b8e82fa66/close` → **200**

```json
{
  "command_id": "0d6bc0aa-f89d-4368-b595-a64c3bcd71d1",
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

Done: terminal order feb4460e-792c-426f-a78c-efb716e0fe16 by Andrii (5a000000-0000-4000-8000-000000000403).
