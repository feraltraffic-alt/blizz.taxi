# Sandbox transcript (2026-10-28T14:14:16Z, d656c74)

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
  "correlation_id": "dfe562cb-0dd0-4bf8-9a76-71dc0c0fde4e"
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
  "session_id": "29b0741a-94d8-498e-988c-877300379708",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc3NjQsImlhdCI6MTc5MzE5Njg2NCwianRpIjoiMmZjYjg3NGYtMTNkZC00OGFjLWE4YzItNGE0Y2U1ZThmMjA2Iiwic2lkIjoiMjliMDc0MWEtOTRkOC00OThlLTk4OGMtODc3MzAwMzc5NzA4In0.7U_swOKwLClOQeNhCPaFqKI9gcVwjPL3D_Umq5Ccig8",
  "access_expires_at": "2026-10-28T14:29:24.224965415Z",
  "refresh_token": "q0bSpxI1kdvMLlNxiKyiEPtZb_jcbERZJuU6QOh-OaQ",
  "refresh_expires_at": "2026-10-29T02:14:24.222766295Z",
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
  "session_id": "ed7927ea-ff4a-4f7e-885f-257f7b926dd9",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc3NjUsImlhdCI6MTc5MzE5Njg2NSwianRpIjoiZjcxOTcxZGEtMzMwYi00MWQyLWJjNzAtZjJmZjE1ODJlODZkIiwic2lkIjoiZWQ3OTI3ZWEtZmY0YS00ZjdlLTg4NWYtMjU3ZjdiOTI2ZGQ5In0.D1dwx0FL9X-v8N4V5Qh8vVbXJoVtgnn_WC3ez6cXH54",
  "access_expires_at": "2026-10-28T14:29:25.958121082Z",
  "refresh_token": "EvaHbRFB4qz-c-ZbBCXHNvsvX9v_lHrvZKtzrvglMbo",
  "refresh_expires_at": "2026-10-29T02:14:25.957104545Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "f8aea9b5-c753-42fe-a722-6ff6b56634f4",
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
  "id": "00d7b6d1-1734-4630-906e-e2f0cc0173d2",
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
  "created_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "created_at": "2026-10-28T14:14:26.292323Z",
  "updated_at": "2026-10-28T14:14:26.292323Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630761859",
  "device_ref": "sandbox-23551"
}
```

```json
{
  "challenge_id": "bc983bc1-898d-4071-b4b2-7a802af4056d",
  "expires_at": "2026-10-28T14:19:26.584361063Z",
  "resend_available_at": "2026-10-28T14:14:27.584361063Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630761859` → **200**

```json
{
  "phone": "+380630761859",
  "audience": "CLIENT",
  "code": "183337",
  "sent_at": "2026-10-28T14:14:26.595546541Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc983bc1-898d-4071-b4b2-7a802af4056d",
  "code": "183337",
  "device_ref": "sandbox-23551"
}
```

```json
{
  "session_id": "39918524-2f8f-4a74-9b35-aa61668834fa",
  "subject": {
    "type": "CLIENT",
    "id": "d638650f-78f2-45bc-a362-b6705df60345"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjM4NjUwZi03OGYyLTQ1YmMtYTM2Mi1iNjcwNWRmNjAzNDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NzY2LCJpYXQiOjE3OTMxOTY4NjYsImp0aSI6IjU5YjA1MWYzLTUxYzUtNGRlNC04MTgwLTUzNGY0MzBmZmM4MCIsInNpZCI6IjM5OTE4NTI0LTJmOGYtNGE3NC05YjM1LWFhNjE2Njg4MzRmYSJ9.vipmqRBP6kufKSDcKTd2M0kem_JFmzMRzscpuGHX4zc",
  "access_expires_at": "2026-10-28T14:29:26.919525659Z",
  "refresh_token": "vcB6L5IjMbyx7mbrkdvun5_5U89UT2y8CZkTOhJ9AKY",
  "refresh_expires_at": "2026-11-27T14:14:26.918541946Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630761859` → **200**

```json
{
  "client_id": "d638650f-78f2-45bc-a362-b6705df60345"
}
```

`POST /api/admin/v1/rider-wallets/d638650f-78f2-45bc-a362-b6705df60345/top-ups` → **201**

```json
{
  "command_id": "8b9d587d-e82a-4720-9aeb-f3638c1a012b",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "d638650f-78f2-45bc-a362-b6705df60345",
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
      "id": "6701bbd3-b980-4baf-bd7d-ed66e85a2ab8",
      "at": "2026-10-28T14:14:27.476818Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6a9cc9bc-0a70-47e8-b921-92cb588d0ac1",
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
  "id": "fef5e6c5-1b2f-4b4c-9c47-d1306152532b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:19:27.947407Z",
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
      "id": "00d7b6d1-1734-4630-906e-e2f0cc0173d2",
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
  "device_ref": "sandbox-31890"
}
```

```json
{
  "challenge_id": "f1f83677-eb4d-4c14-9f0b-d44f53411e0e",
  "expires_at": "2026-10-28T14:19:28.257686457Z",
  "resend_available_at": "2026-10-28T14:14:29.257686457Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "529092",
  "sent_at": "2026-10-28T14:14:28.26166834Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1f83677-eb4d-4c14-9f0b-d44f53411e0e",
  "code": "529092",
  "device_ref": "sandbox-31890"
}
```

```json
{
  "session_id": "11da32f6-0d8a-49c5-934a-80956011c24b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzc2OCwiaWF0IjoxNzkzMTk2ODY4LCJqdGkiOiJmNWNjYzM3NC1kMDBiLTQ2OTMtOTI1My02OWEyODViN2QyNzMiLCJzaWQiOiIxMWRhMzJmNi0wZDhhLTQ5YzUtOTM0YS04MDk1NjAxMWMyNGIifQ.3qp6AtDLAzsw87AK2EBywsPc0iivdB6_sHBCD4KdTGU",
  "access_expires_at": "2026-10-28T14:29:28.569845733Z",
  "refresh_token": "WHqJxjWXOpqfjNAGsw-x1QPylAPv1qUqLSV1QwUl5J0",
  "refresh_expires_at": "2026-11-27T14:14:28.568719684Z",
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
  "command_id": "a5732a04-6f09-4cf6-bb55-1166bf6df2aa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:14:29Z",
    "sequence": 1793196869127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8660d9f4-fd74-4ea1-8fab-c87c56b18606",
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
  "last_heartbeat_at": "2026-10-28T14:14:29.175543Z",
  "last_location_at": "2026-10-28T14:14:29.175543Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9e0fa8b6-0b96-4c82-874b-0a0f7d7605a6",
  "quote_id": "fef5e6c5-1b2f-4b4c-9c47-d1306152532b",
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
  "id": "2666f1c9-a2ba-42ca-b734-50f01cdb4315",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d638650f-78f2-45bc-a362-b6705df60345",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:14:29.521645Z",
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
  "client_id": "d638650f-78f2-45bc-a362-b6705df60345",
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
      "id": "6701bbd3-b980-4baf-bd7d-ed66e85a2ab8",
      "at": "2026-10-28T14:14:27.476818Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
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
    "id": "42a8ebeb-d768-4b8d-ab8f-fbd0b9803cbd",
    "order_id": "2666f1c9-a2ba-42ca-b734-50f01cdb4315",
    "expires_at": "2026-10-28T14:14:44.5379Z",
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

`POST /api/driver/v1/offers/42a8ebeb-d768-4b8d-ab8f-fbd0b9803cbd/accept` → **200**

```json
{
  "command_id": "2a17d177-be86-470a-b70c-8f4352dceb2d"
}
```

```json
{
  "id": "ab3eea88-23a3-44ba-8ea3-816917c49cd9",
  "order_id": "2666f1c9-a2ba-42ca-b734-50f01cdb4315",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ec514ed4-49d4-496d-8ab2-8aa397242998",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ec514ed4-49d4-496d-8ab2-8aa397242998",
  "order_id": "2666f1c9-a2ba-42ca-b734-50f01cdb4315",
  "assignment_id": "ab3eea88-23a3-44ba-8ea3-816917c49cd9",
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

`POST /api/driver/v1/work-sessions/8660d9f4-fd74-4ea1-8fab-c87c56b18606/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:14:30Z",
    "sequence": 1793196870982
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8660d9f4-fd74-4ea1-8fab-c87c56b18606",
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
  "last_heartbeat_at": "2026-10-28T14:14:31.008946Z",
  "last_location_at": "2026-10-28T14:14:31.008946Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ec514ed4-49d4-496d-8ab2-8aa397242998/arrive` → **200**

```json
{
  "command_id": "04483843-cd98-4e99-8783-eac84c4b89b2",
  "expected_version": 0
}
```

```json
{
  "id": "ec514ed4-49d4-496d-8ab2-8aa397242998",
  "order_id": "2666f1c9-a2ba-42ca-b734-50f01cdb4315",
  "assignment_id": "ab3eea88-23a3-44ba-8ea3-816917c49cd9",
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
  "arrived_at": "2026-10-28T14:14:31.310669Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ec514ed4-49d4-496d-8ab2-8aa397242998/start` → **200**

```json
{
  "command_id": "0b8b735b-daa2-4e77-b2df-633929f14423",
  "expected_version": 1
}
```

```json
{
  "id": "ec514ed4-49d4-496d-8ab2-8aa397242998",
  "order_id": "2666f1c9-a2ba-42ca-b734-50f01cdb4315",
  "assignment_id": "ab3eea88-23a3-44ba-8ea3-816917c49cd9",
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
  "arrived_at": "2026-10-28T14:14:31.310669Z",
  "started_at": "2026-10-28T14:14:31.599307Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/ec514ed4-49d4-496d-8ab2-8aa397242998/complete` → **200**

```json
{
  "command_id": "6a89d017-fab6-4bf9-a290-bf8bb2622fa3",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:14:31Z",
  "cash_received": true
}
```

```json
{
  "id": "ec514ed4-49d4-496d-8ab2-8aa397242998",
  "order_id": "2666f1c9-a2ba-42ca-b734-50f01cdb4315",
  "assignment_id": "ab3eea88-23a3-44ba-8ea3-816917c49cd9",
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
  "arrived_at": "2026-10-28T14:14:31.310669Z",
  "started_at": "2026-10-28T14:14:31.599307Z",
  "completed_at": "2026-10-28T14:14:31.912982Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d638650f-78f2-45bc-a362-b6705df60345",
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
      "id": "9d8af138-9722-4fa0-9e0e-f676aaec86d1",
      "at": "2026-10-28T14:14:32.194638Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "2666f1c9-a2ba-42ca-b734-50f01cdb4315"
    },
    {
      "id": "6701bbd3-b980-4baf-bd7d-ed66e85a2ab8",
      "at": "2026-10-28T14:14:27.476818Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/00d7b6d1-1734-4630-906e-e2f0cc0173d2/archive` → **200**

```json
{
  "command_id": "c0418b48-27f8-473e-aca3-1039e0ce4b9c",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "00d7b6d1-1734-4630-906e-e2f0cc0173d2",
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
  "created_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "created_at": "2026-10-28T14:14:26.292323Z",
  "updated_at": "2026-10-28T14:14:35.505829Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8660d9f4-fd74-4ea1-8fab-c87c56b18606",
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
  "last_heartbeat_at": "2026-10-28T14:14:31.008946Z",
  "last_location_at": "2026-10-28T14:14:31.008946Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8660d9f4-fd74-4ea1-8fab-c87c56b18606/close` → **200**

```json
{
  "command_id": "48d32a0d-6df3-4d56-aa5a-2621fb07cbf6",
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

Done: order 2666f1c9-a2ba-42ca-b734-50f01cdb4315.

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
  "session_id": "8a858e44-db20-4629-81de-493e7d211f83",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc3NzYsImlhdCI6MTc5MzE5Njg3NiwianRpIjoiNzE2OTI2OTUtYjRjMS00NTBjLTk0MjMtYzdiYTBiZGQyYmVhIiwic2lkIjoiOGE4NThlNDQtZGIyMC00NjI5LTgxZGUtNDkzZTdkMjExZjgzIn0.jY9kLr9qy67D4JoO5JmwoogYVYAaBfw59ApHz4KsxU4",
  "access_expires_at": "2026-10-28T14:29:36.688553806Z",
  "refresh_token": "Vx2O6mfFSIlx2aT6U8Mk6d7_zX5qtlWn4SKNqtS8FD0",
  "refresh_expires_at": "2026-10-29T02:14:36.687637402Z",
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
  "command_id": "636c3f45-761e-48d8-bdf8-e482f88403c8",
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
  "session_id": "a0db8f6b-ed2d-4474-9bee-22ea1a155316",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc3NzcsImlhdCI6MTc5MzE5Njg3NywianRpIjoiNGZlODg2OGItZTM4Yy00YjAyLWE1YzUtMTQyNjNhNDRhYjNjIiwic2lkIjoiYTBkYjhmNmItZWQyZC00NDc0LTliZWUtMjJlYTFhMTU1MzE2In0.RM4NfKnE8rHuof8lHXpi5ymbix9sFcA7srRGe-qQkxw",
  "access_expires_at": "2026-10-28T14:29:37.870822935Z",
  "refresh_token": "V82UEFbomXo9ZwTNAZhwBOgjT3SM_vB2-CIvcTce8PY",
  "refresh_expires_at": "2026-10-29T02:14:37.870095427Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.475225553",
    "linkedid": "1730052700.475225553",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678502533"
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
    "id": "1730052700.475225553",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "db96125e-a6cf-42d9-8ec5-fa01d351b359",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380678502533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:14:38.144164Z",
      "answered_at": null,
      "ended_at": "2026-10-28T14:14:38.17185Z",
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
    "id": "1730052600.1812219077",
    "linkedid": "1730052600.1812219077",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678502533"
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
      "id": "d29d779e-22ce-490f-aaf6-44f5a2cc8bb7",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678502533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:14:38.490868Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/d29d779e-22ce-490f-aaf6-44f5a2cc8bb7/answer` → **200**

```json
{
  "command_id": "a223e0c8-b258-467b-9da0-e1b0e1658fc1"
}
```

```json
{
  "id": "d29d779e-22ce-490f-aaf6-44f5a2cc8bb7",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678502533",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "order_ids": [],
  "started_at": "2026-10-28T14:14:38.490868Z",
  "answered_at": "2026-10-28T14:14:38.800489Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1812219077",
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
    "id": "1730052600.1812219077",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d29d779e-22ce-490f-aaf6-44f5a2cc8bb7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678502533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_ids": [],
      "started_at": "2026-10-28T14:14:38.490868Z",
      "answered_at": "2026-10-28T14:14:38.800489Z",
      "ended_at": "2026-10-28T14:14:39.099605Z",
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
      "id": "d29d779e-22ce-490f-aaf6-44f5a2cc8bb7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678502533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_ids": [],
      "started_at": "2026-10-28T14:14:38.490868Z",
      "answered_at": "2026-10-28T14:14:38.800489Z",
      "ended_at": "2026-10-28T14:14:39.099605Z",
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
      "id": "d29d779e-22ce-490f-aaf6-44f5a2cc8bb7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678502533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_ids": [],
      "started_at": "2026-10-28T14:14:38.490868Z",
      "answered_at": "2026-10-28T14:14:38.800489Z",
      "ended_at": "2026-10-28T14:14:39.099605Z",
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
      "id": "d29d779e-22ce-490f-aaf6-44f5a2cc8bb7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678502533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_ids": [],
      "started_at": "2026-10-28T14:14:38.490868Z",
      "answered_at": "2026-10-28T14:14:38.800489Z",
      "ended_at": "2026-10-28T14:14:39.099605Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:14:45.954203Z"
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
      "id": "d29d779e-22ce-490f-aaf6-44f5a2cc8bb7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678502533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_ids": [],
      "started_at": "2026-10-28T14:14:38.490868Z",
      "answered_at": "2026-10-28T14:14:38.800489Z",
      "ended_at": "2026-10-28T14:14:39.099605Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:14:45.954203Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/d29d779e-22ce-490f-aaf6-44f5a2cc8bb7/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/d29d779e-22ce-490f-aaf6-44f5a2cc8bb7/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=d29d779e-22ce-490f-aaf6-44f5a2cc8bb7` → **200**

```json
{
  "changes": [
    {
      "id": "c018c449-de17-4a03-a919-03589ee924ad",
      "occurred_at": "2026-10-28T14:14:46.556415Z",
      "actor_type": "STAFF",
      "actor_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "d29d779e-22ce-490f-aaf6-44f5a2cc8bb7",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"15339c79-4284-4e2e-8eef-413726877214\", \"order_ids\": []}",
      "correlation_id": "297f147e-e3cb-4442-a19c-d1856b0f0e05"
    },
    {
      "id": "8fdde1b3-1593-403c-af07-4e40151d9081",
      "occurred_at": "2026-10-28T14:14:46.520478Z",
      "actor_type": "STAFF",
      "actor_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "d29d779e-22ce-490f-aaf6-44f5a2cc8bb7",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"15339c79-4284-4e2e-8eef-413726877214\", \"order_ids\": []}",
      "correlation_id": "981abf7d-092a-4f6e-9d71-78848dd5ac04"
    }
  ]
}
```

Done: call d29d779e-22ce-490f-aaf6-44f5a2cc8bb7 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4821"
}
```

```json
{
  "challenge_id": "204c098c-327e-4d52-82c0-6bda8e73df2a",
  "expires_at": "2026-10-28T14:19:46.876477891Z",
  "resend_available_at": "2026-10-28T14:14:47.876477891Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "756433",
  "sent_at": "2026-10-28T14:14:46.881599573Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "204c098c-327e-4d52-82c0-6bda8e73df2a",
  "code": "756433",
  "device_ref": "sandbox-4821"
}
```

```json
{
  "session_id": "c1ee4172-2d15-4fd8-a915-e116eb74c7f5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzc4NywiaWF0IjoxNzkzMTk2ODg3LCJqdGkiOiIzM2IwOGQwNS00ZWM1LTRhOWUtYTk2Ny01MGI5ZGJkYTI0ZjIiLCJzaWQiOiJjMWVlNDE3Mi0yZDE1LTRmZDgtYTkxNS1lMTE2ZWI3NGM3ZjUifQ.XiTY6BK2oTcjxCp6SCTtU5TaJPculYcNinjo6xrDTWc",
  "access_expires_at": "2026-10-28T14:29:47.18540246Z",
  "refresh_token": "xML8sU7u2QplorGLHc7S0c_xhsJSQ18SU9awTB6qdu8",
  "refresh_expires_at": "2026-11-27T14:14:47.18469931Z",
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
  "command_id": "918597bb-d331-4a41-bfe4-9b6f519275e3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:14:47Z",
    "sequence": 1793196887719
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d51871c-b884-4bc3-9abb-97fa586b3501",
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
  "last_heartbeat_at": "2026-10-28T14:14:47.740604Z",
  "last_location_at": "2026-10-28T14:14:47.740604Z",
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
  "session_id": "4bcb28c6-6fad-407c-95da-3135c05b4e3e",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc3ODgsImlhdCI6MTc5MzE5Njg4OCwianRpIjoiNDNkYTg2YzctYWEyOS00NmI1LTkxY2YtNDZiMWI4NWMwNTM5Iiwic2lkIjoiNGJjYjI4YzYtNmZhZC00MDdjLTk1ZGEtMzEzNWMwNWI0ZTNlIn0.uFpBjxrxGA3qhDd_J6HtmbcHHzmuvKnyysRK8MBy8Yw",
  "access_expires_at": "2026-10-28T14:29:48.35449742Z",
  "refresh_token": "IullsxGWneyEKl71yrZmyznYcqKH-Bq6MeSmfGVPM1A",
  "refresh_expires_at": "2026-10-29T02:14:48.353676636Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "95831a41-7930-49ee-8827-e271ffe19ae3",
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
  "id": "c4533abf-e267-4d67-b1c3-7551ac0033c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:19:48.635262Z",
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
  "command_id": "e9410995-d010-4983-acf7-b49cf5021403",
  "quote_id": "c4533abf-e267-4d67-b1c3-7551ac0033c0",
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
    "phone": "+380676007607"
  }
}
```

```json
{
  "id": "2c9bc5c7-621d-4368-9b21-fd98b5d4f634",
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
  "created_at": "2026-10-28T14:14:48.933304Z",
  "caller": {
    "name": "Олена",
    "phone": "+380676007607"
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
    "id": "5c68d481-a5bc-4038-88e1-56e8d6966767",
    "order_id": "2c9bc5c7-621d-4368-9b21-fd98b5d4f634",
    "expires_at": "2026-10-28T14:15:03.939176Z",
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

`POST /api/driver/v1/offers/5c68d481-a5bc-4038-88e1-56e8d6966767/accept` → **200**

```json
{
  "command_id": "693047fd-6b61-457c-91f7-865e75a3f7cd"
}
```

```json
{
  "id": "6f456412-c43d-4830-9da7-63d5ee8dcbf7",
  "order_id": "2c9bc5c7-621d-4368-9b21-fd98b5d4f634",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "08551cfc-4541-4d79-a2c7-433d62af1bc6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380676007607` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676007607` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676007607` → **200**

```json
[
  {
    "phone": "+380676007607",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:14:51.139237906Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676007607` → **200**

```json
[
  {
    "phone": "+380676007607",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:14:51.139237906Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676007607` → **200**

```json
[
  {
    "phone": "+380676007607",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:14:51.139237906Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "08551cfc-4541-4d79-a2c7-433d62af1bc6",
  "order_id": "2c9bc5c7-621d-4368-9b21-fd98b5d4f634",
  "assignment_id": "6f456412-c43d-4830-9da7-63d5ee8dcbf7",
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
    "phone": "+380676007607"
  }
}
```

`POST /api/driver/v1/work-sessions/3d51871c-b884-4bc3-9abb-97fa586b3501/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:14:52Z",
    "sequence": 1793196892207
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d51871c-b884-4bc3-9abb-97fa586b3501",
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
  "last_heartbeat_at": "2026-10-28T14:14:52.229355Z",
  "last_location_at": "2026-10-28T14:14:52.229355Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/08551cfc-4541-4d79-a2c7-433d62af1bc6/arrive` → **200**

```json
{
  "command_id": "e8d467b6-af2f-4f77-9fd8-41bae68b7372",
  "expected_version": 0
}
```

```json
{
  "id": "08551cfc-4541-4d79-a2c7-433d62af1bc6",
  "order_id": "2c9bc5c7-621d-4368-9b21-fd98b5d4f634",
  "assignment_id": "6f456412-c43d-4830-9da7-63d5ee8dcbf7",
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
  "arrived_at": "2026-10-28T14:14:52.50974Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676007607"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380676007607` → **200**

```json
[
  {
    "phone": "+380676007607",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:14:51.139237906Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676007607` → **200**

```json
[
  {
    "phone": "+380676007607",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:14:51.139237906Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676007607` → **200**

```json
[
  {
    "phone": "+380676007607",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:14:51.139237906Z"
  },
  {
    "phone": "+380676007607",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:14:54.150683623Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676007607` → **200**

```json
[
  {
    "phone": "+380676007607",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:14:51.139237906Z"
  },
  {
    "phone": "+380676007607",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:14:54.150683623Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676007607` → **200**

```json
[
  {
    "phone": "+380676007607",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:14:51.139237906Z"
  },
  {
    "phone": "+380676007607",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:14:54.150683623Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/08551cfc-4541-4d79-a2c7-433d62af1bc6/start` → **200**

```json
{
  "command_id": "3e87e63b-6d00-446d-bb08-80c77033098b",
  "expected_version": 1
}
```

```json
{
  "id": "08551cfc-4541-4d79-a2c7-433d62af1bc6",
  "order_id": "2c9bc5c7-621d-4368-9b21-fd98b5d4f634",
  "assignment_id": "6f456412-c43d-4830-9da7-63d5ee8dcbf7",
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
  "arrived_at": "2026-10-28T14:14:52.50974Z",
  "started_at": "2026-10-28T14:14:54.933324Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676007607"
  }
}
```

`POST /api/driver/v1/trips/08551cfc-4541-4d79-a2c7-433d62af1bc6/complete` → **200**

```json
{
  "command_id": "6218b8af-f7b4-4dcc-afa1-7948bc8f41ce",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:14:55Z",
  "cash_received": true
}
```

```json
{
  "id": "08551cfc-4541-4d79-a2c7-433d62af1bc6",
  "order_id": "2c9bc5c7-621d-4368-9b21-fd98b5d4f634",
  "assignment_id": "6f456412-c43d-4830-9da7-63d5ee8dcbf7",
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
  "arrived_at": "2026-10-28T14:14:52.50974Z",
  "started_at": "2026-10-28T14:14:54.933324Z",
  "completed_at": "2026-10-28T14:14:55.219014Z",
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
  "session_id": "3d51871c-b884-4bc3-9abb-97fa586b3501",
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
  "last_heartbeat_at": "2026-10-28T14:14:52.229355Z",
  "last_location_at": "2026-10-28T14:14:52.229355Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d51871c-b884-4bc3-9abb-97fa586b3501/close` → **200**

```json
{
  "command_id": "764ccc06-80e5-46da-8c76-9431eccfbe1c",
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
  "phone": "+380632563232",
  "device_ref": "sandbox-28920"
}
```

```json
{
  "challenge_id": "e9d7960c-745e-447a-8cdc-77755bab2125",
  "expires_at": "2026-10-28T14:19:56.080367771Z",
  "resend_available_at": "2026-10-28T14:14:57.080367771Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632563232` → **200**

```json
{
  "phone": "+380632563232",
  "audience": "CLIENT",
  "code": "230601",
  "sent_at": "2026-10-28T14:14:56.084562415Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9d7960c-745e-447a-8cdc-77755bab2125",
  "code": "230601",
  "device_ref": "sandbox-28920"
}
```

```json
{
  "session_id": "76f80e48-473c-49f0-8551-f986be14c39d",
  "subject": {
    "type": "CLIENT",
    "id": "fafedabd-eedd-437e-b772-5deab6060c3e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYWZlZGFiZC1lZWRkLTQzN2UtYjc3Mi01ZGVhYjYwNjBjM2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3Nzk2LCJpYXQiOjE3OTMxOTY4OTYsImp0aSI6IjdhYWIxMWY4LTBjZGEtNGQxZS04MmM3LTBjOWRmZDY2ZWJkOSIsInNpZCI6Ijc2ZjgwZTQ4LTQ3M2MtNDlmMC04NTUxLWY5ODZiZTE0YzM5ZCJ9.-HTELjzINd7dgGKyGb8m5SuYogEjOkmaz332xpt2WDM",
  "access_expires_at": "2026-10-28T14:29:56.381552775Z",
  "refresh_token": "vVcOcRLekr0ZtsUoJ9evisdR_FlbugH7AgFkVRUwfac",
  "refresh_expires_at": "2026-11-27T14:14:56.380866063Z",
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
  "device_ref": "sandbox-21965"
}
```

```json
{
  "challenge_id": "35bcb3da-e8e7-490a-a670-b5126804c81a",
  "expires_at": "2026-10-28T14:19:56.913834298Z",
  "resend_available_at": "2026-10-28T14:14:57.913834298Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "357503",
  "sent_at": "2026-10-28T14:14:56.917210495Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35bcb3da-e8e7-490a-a670-b5126804c81a",
  "code": "357503",
  "device_ref": "sandbox-21965"
}
```

```json
{
  "session_id": "f5e59ada-ef1c-440a-a82d-70c316a56a3f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzc5NywiaWF0IjoxNzkzMTk2ODk3LCJqdGkiOiI1YTUzNTdhYy1mN2YzLTQzNTktOWMwYi04MGM2MzhkZjc0NWEiLCJzaWQiOiJmNWU1OWFkYS1lZjFjLTQ0MGEtYTgyZC03MGMzMTZhNTZhM2YifQ.WQvMuU4JtDDs6rB4MVIQ-MsyaF9CDKQD2ARis9bfwnk",
  "access_expires_at": "2026-10-28T14:29:57.215257604Z",
  "refresh_token": "_BgcM-FbLgtROpWRZtCkmmQN32n93s5yx-Vu5_pttP8",
  "refresh_expires_at": "2026-11-27T14:14:57.214584212Z",
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
  "session_id": "62ce77e1-d556-4ad2-b49b-560bbec9fe0b",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc3OTgsImlhdCI6MTc5MzE5Njg5OCwianRpIjoiYTEzNTliZTMtYzc2Yi00MDhlLWE0NmEtNGMzMDY3ZjUxNWU0Iiwic2lkIjoiNjJjZTc3ZTEtZDU1Ni00YWQyLWI0OWItNTYwYmJlYzlmZTBiIn0.sqGljKkwZUqEP6nr9W0kmSjsy8Tpo4O0rOg-zM7SB-k",
  "access_expires_at": "2026-10-28T14:29:58.077142929Z",
  "refresh_token": "E30RKj8r6PZyJDMyUHI03B8V0CPYn5FJTiocnBiU0CM",
  "refresh_expires_at": "2026-10-29T02:14:58.076568668Z",
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
  "session_id": "55d29ab3-21b6-4d3d-8362-6f07d8805587",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc3OTgsImlhdCI6MTc5MzE5Njg5OCwianRpIjoiZmJlNTU5YmItMzk0MC00ZTMwLThjMDMtNDU2Njg3OGMzZTU1Iiwic2lkIjoiNTVkMjlhYjMtMjFiNi00ZDNkLTgzNjItNmYwN2Q4ODA1NTg3In0.7vgYgYfXd_zdwNInzhU9tXHLJFCx3OOaRtPNFbHYu30",
  "access_expires_at": "2026-10-28T14:29:58.674253167Z",
  "refresh_token": "VMBYCzBPWmRguqgLbKzcxtmW67PifK-J3tU7liXcB1o",
  "refresh_expires_at": "2026-10-29T02:14:58.673454573Z",
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
  "command_id": "614bc8ad-09b2-4436-90c1-64a4c74cb370",
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
  "id": "cf8fff0a-221b-4622-ab67-867abcb88b1d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:19:59.219255Z",
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
  "command_id": "a2a251ea-0564-4964-b9f6-7ba3091b1b5e",
  "quote_id": "cf8fff0a-221b-4622-ab67-867abcb88b1d",
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
  "id": "87a045f7-cd28-432c-bf1c-c5fc2cdcd9a7",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fafedabd-eedd-437e-b772-5deab6060c3e",
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
  "created_at": "2026-10-28T14:14:59.505478Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/87a045f7-cd28-432c-bf1c-c5fc2cdcd9a7` → **200**

```json
{
  "id": "87a045f7-cd28-432c-bf1c-c5fc2cdcd9a7",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fafedabd-eedd-437e-b772-5deab6060c3e",
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
  "created_at": "2026-10-28T14:14:59.505478Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/87a045f7-cd28-432c-bf1c-c5fc2cdcd9a7/cancel` → **200**

```json
{
  "command_id": "72c2dee3-25a0-4204-a53c-80adeb19b8c0",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "87a045f7-cd28-432c-bf1c-c5fc2cdcd9a7",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fafedabd-eedd-437e-b772-5deab6060c3e",
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
  "created_at": "2026-10-28T14:14:59.505478Z",
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
  "command_id": "386d48cf-267d-4cff-8cc2-9b2a46fd3940",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:15:00Z",
    "sequence": 1793196900642
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "890cf188-a361-49f7-bd23-36901c63ce31",
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
  "last_heartbeat_at": "2026-10-28T14:15:00.663311Z",
  "last_location_at": "2026-10-28T14:15:00.663311Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-21080"
}
```

```json
{
  "challenge_id": "4d3019c0-2c6b-4239-a868-056d43dcf5e3",
  "expires_at": "2026-10-28T14:20:00.930127544Z",
  "resend_available_at": "2026-10-28T14:15:01.930127544Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "083770",
  "sent_at": "2026-10-28T14:15:00.933821246Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d3019c0-2c6b-4239-a868-056d43dcf5e3",
  "code": "083770",
  "device_ref": "sandbox-21080"
}
```

```json
{
  "session_id": "95309163-8187-48ac-a62e-82004f792a49",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzgwMSwiaWF0IjoxNzkzMTk2OTAxLCJqdGkiOiI2YjkzOGZiNi1jZWJkLTQyMzgtOTRlMi0yMGZhZjQyMTU0NjUiLCJzaWQiOiI5NTMwOTE2My04MTg3LTQ4YWMtYTYyZS04MjAwNGY3OTJhNDkifQ.5FRNT50iqgovfiQDEBQ33GwlUQcaJ6W9F0Ol9GhMd6U",
  "access_expires_at": "2026-10-28T14:30:01.228662358Z",
  "refresh_token": "WF0MVbcLPAfcGvpvCrSMcHmkyU6ixTqaMtUSZdu2KBk",
  "refresh_expires_at": "2026-11-27T14:15:01.228048848Z",
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
  "command_id": "e4499aec-c401-4b3e-9755-b6e3a0adb5b6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:15:01Z",
    "sequence": 1793196901772
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f793e91-4277-4ca2-b1a9-00dd7a1bfd81",
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
  "last_heartbeat_at": "2026-10-28T14:15:01.794178Z",
  "last_location_at": "2026-10-28T14:15:01.794178Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4f7c3a7d-e643-4433-8f3f-79c662500a96",
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
  "id": "c7948cdd-f777-4aab-8f9c-f5d7c7f0083b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:02.072997Z",
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
  "command_id": "701a7534-fe92-4bd4-b9cb-59e73aff11a0",
  "quote_id": "c7948cdd-f777-4aab-8f9c-f5d7c7f0083b",
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
  "id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fafedabd-eedd-437e-b772-5deab6060c3e",
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
  "created_at": "2026-10-28T14:15:02.360379Z",
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
    "id": "7f071c8f-7327-4dc2-897c-48e8ccb8bf35",
    "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
    "expires_at": "2026-10-28T14:15:17.365332Z",
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

`POST /api/driver/v1/offers/7f071c8f-7327-4dc2-897c-48e8ccb8bf35/accept` → **200**

```json
{
  "command_id": "697ca7e0-67b0-45ab-ab53-b42b91e12aad"
}
```

```json
{
  "id": "850ba1f4-c2cd-4e84-a3f5-2c9e8ad037a3",
  "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "caec03ed-98b8-4c17-a113-d6f21861e7d4",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "caec03ed-98b8-4c17-a113-d6f21861e7d4",
  "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
  "assignment_id": "850ba1f4-c2cd-4e84-a3f5-2c9e8ad037a3",
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

`POST /api/driver/v1/trips/caec03ed-98b8-4c17-a113-d6f21861e7d4/cancel` → **200**

```json
{
  "command_id": "7097588e-36b2-40bf-850f-9c456521d5e9",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "caec03ed-98b8-4c17-a113-d6f21861e7d4",
  "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
  "assignment_id": "850ba1f4-c2cd-4e84-a3f5-2c9e8ad037a3",
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

`GET /api/rider/v1/orders/faf8200f-aee8-4153-a657-bdcd2bad8196` → **200**

```json
{
  "id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fafedabd-eedd-437e-b772-5deab6060c3e",
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
    "id": "850ba1f4-c2cd-4e84-a3f5-2c9e8ad037a3",
    "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "caec03ed-98b8-4c17-a113-d6f21861e7d4",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:15:02.360379Z",
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
    "id": "2d8ba9fb-c7c6-484f-960b-52e07d0358da",
    "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
    "expires_at": "2026-10-28T14:15:18.480741Z",
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

`POST /api/driver/v1/offers/2d8ba9fb-c7c6-484f-960b-52e07d0358da/accept` → **200**

```json
{
  "command_id": "25692ff0-1f6d-47ba-9903-d0264d3f8e8d"
}
```

```json
{
  "id": "c4f45341-bf01-49c3-bdd2-9cd51e2574f5",
  "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ef409552-5327-4055-8cbc-e880384f9ba9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ef409552-5327-4055-8cbc-e880384f9ba9",
  "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
  "assignment_id": "c4f45341-bf01-49c3-bdd2-9cd51e2574f5",
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

`POST /api/driver/v1/trips/ef409552-5327-4055-8cbc-e880384f9ba9/cancel` → **200**

```json
{
  "command_id": "f42daf6f-79b6-4d28-85ed-fd124a72882d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "ef409552-5327-4055-8cbc-e880384f9ba9",
  "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
  "assignment_id": "c4f45341-bf01-49c3-bdd2-9cd51e2574f5",
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
    "id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:15:02.360379Z",
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
    "id": "87a045f7-cd28-432c-bf1c-c5fc2cdcd9a7",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:14:59.505478Z",
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

`GET /api/operator/v1/orders/faf8200f-aee8-4153-a657-bdcd2bad8196/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:15:02.361277Z",
      "actor": {
        "type": "CLIENT",
        "id": "fafedabd-eedd-437e-b772-5deab6060c3e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
        "quote_id": "c7948cdd-f777-4aab-8f9c-f5d7c7f0083b",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "51a4e388-d1d8-46f0-ae39-5f19a5c20c31"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:15:02.364236Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
        "attempt_id": "544e90d5-9a79-4144-98d9-c1315eb03ba2",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "51a4e388-d1d8-46f0-ae39-5f19a5c20c31"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:15:02.372129Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7f071c8f-7327-4dc2-897c-48e8ccb8bf35",
        "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "51a4e388-d1d8-46f0-ae39-5f19a5c20c31"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:15:02.921101Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "7f071c8f-7327-4dc2-897c-48e8ccb8bf35",
        "order_id": "faf8200f-aee8-4153-a657-bdcd2bad8196",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "850ba1f4-c2cd-4e84-a3f5-2c9e8ad037a3"
      },
      "correlation_id": "47a12091-79c3-42b3-b77f-c80fdb9bd5c1"
```

Done: orders 87a045f7-cd28-432c-bf1c-c5fc2cdcd9a7, faf8200f-aee8-4153-a657-bdcd2bad8196.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737757755",
  "device_ref": "sandbox-272"
}
```

```json
{
  "challenge_id": "83382074-c74e-45e6-b121-9b4beff52327",
  "expires_at": "2026-10-28T14:20:05.740831083Z",
  "resend_available_at": "2026-10-28T14:15:06.740831083Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737757755` → **200**

```json
{
  "phone": "+380737757755",
  "audience": "CLIENT",
  "code": "587696",
  "sent_at": "2026-10-28T14:15:05.744013938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83382074-c74e-45e6-b121-9b4beff52327",
  "code": "587696",
  "device_ref": "sandbox-272"
}
```

```json
{
  "session_id": "52d72aad-4d2d-4c40-ba37-9d0bea7bc233",
  "subject": {
    "type": "CLIENT",
    "id": "7a0f6e6d-3ca5-46da-8275-8e0274f3bb80"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTBmNmU2ZC0zY2E1LTQ2ZGEtODI3NS04ZTAyNzRmM2JiODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODA2LCJpYXQiOjE3OTMxOTY5MDYsImp0aSI6Ijk1ZGUyOGU2LTZkYjEtNGU5NC1hYmUxLWM0NmY5NzkxN2QxNCIsInNpZCI6IjUyZDcyYWFkLTRkMmQtNGM0MC1iYTM3LTlkMGJlYTdiYzIzMyJ9.iAE3ZrR8cM3l5FHv1kyMKnvpYprzRSMnVYZkVr_GrtQ",
  "access_expires_at": "2026-10-28T14:30:06.044017179Z",
  "refresh_token": "8eZnjHDqnS_r54Atm19Hi7jX7oXDzZ-TKhfh0YxsT00",
  "refresh_expires_at": "2026-11-27T14:15:06.043308187Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "015a5e86-c59c-42ae-9ab3-8cd1f0b94b7c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "53f9b63e-d111-49e4-950a-e27a4cf897a0",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-53f9b63e-d111-49e4-950a-e27a4cf897a0",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "3f3bce3c51f31ea740a6825621cd279b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=53f9b63e-d111-49e4-950a-e27a4cf897a0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737757755"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=53f9b63e-d111-49e4-950a-e27a4cf897a0",
  "expires_at": "2026-10-28T14:45:06.325965Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/53f9b63e-d111-49e4-950a-e27a4cf897a0` → **200**

```json
{
  "id": "53f9b63e-d111-49e4-950a-e27a4cf897a0",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T14:45:06.325965Z",
  "card": {
    "id": "f5e5bc5b-59f9-4a93-a1ff-df7a7a6a5bd2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8243",
    "card_type": "Visa",
    "created_at": "2026-10-28T14:15:06.612545Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "f5e5bc5b-59f9-4a93-a1ff-df7a7a6a5bd2",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8243",
      "card_type": "Visa",
      "created_at": "2026-10-28T14:15:06.612545Z"
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
  "device_ref": "sandbox-28923"
}
```

```json
{
  "challenge_id": "ae79917e-98dc-4706-a85e-9075ea436d52",
  "expires_at": "2026-10-28T14:20:07.167755656Z",
  "resend_available_at": "2026-10-28T14:15:08.167755656Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "294923",
  "sent_at": "2026-10-28T14:15:07.171169544Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae79917e-98dc-4706-a85e-9075ea436d52",
  "code": "294923",
  "device_ref": "sandbox-28923"
}
```

```json
{
  "session_id": "fa425aba-8512-41fe-ad1a-3c351ba76c3f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzgwNywiaWF0IjoxNzkzMTk2OTA3LCJqdGkiOiIyYjE4MTQ1My1iN2QxLTQwMWEtODVlYS1lZDBjMGMwODJjYjkiLCJzaWQiOiJmYTQyNWFiYS04NTEyLTQxZmUtYWQxYS0zYzM1MWJhNzZjM2YifQ.qb616_bhLqWcQnQdK9zMSCf2_u2NJXTnKEA3nAQY520",
  "access_expires_at": "2026-10-28T14:30:07.472293158Z",
  "refresh_token": "b4pF68fKea6n2Y10AvGq4CeKZcSXUPFZo-276u4m8LU",
  "refresh_expires_at": "2026-11-27T14:15:07.471686087Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f793e91-4277-4ca2-b1a9-00dd7a1bfd81",
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
  "last_heartbeat_at": "2026-10-28T14:15:01.794178Z",
  "last_location_at": "2026-10-28T14:15:01.794178Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f793e91-4277-4ca2-b1a9-00dd7a1bfd81/handover` → **200**

```json
{
  "command_id": "2b527aeb-aa06-40fd-bd1d-58aad6d6392e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f793e91-4277-4ca2-b1a9-00dd7a1bfd81",
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
  "last_heartbeat_at": "2026-10-28T14:15:01.794178Z",
  "last_location_at": "2026-10-28T14:15:01.794178Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f793e91-4277-4ca2-b1a9-00dd7a1bfd81/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:15:08Z",
    "sequence": 1793196908300
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f793e91-4277-4ca2-b1a9-00dd7a1bfd81",
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
  "last_heartbeat_at": "2026-10-28T14:15:08.320902Z",
  "last_location_at": "2026-10-28T14:15:08.320902Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c28161ab-9d51-454c-84a3-818ff2128c41",
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
  "id": "29db720f-b5e9-44cc-b6c1-1e4ea8e0c1f3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:08.599205Z",
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
  "command_id": "3b7deda4-6e15-41fe-bb72-247cfb247d5b",
  "quote_id": "29db720f-b5e9-44cc-b6c1-1e4ea8e0c1f3",
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
  "id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7a0f6e6d-3ca5-46da-8275-8e0274f3bb80",
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
  "created_at": "2026-10-28T14:15:08.880603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7bc705b7-30c1-4997-8223-6f9ed7563d87` → **200**

```json
{
  "id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7a0f6e6d-3ca5-46da-8275-8e0274f3bb80",
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
  "created_at": "2026-10-28T14:15:08.880603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7bc705b7-30c1-4997-8223-6f9ed7563d87` → **200**

```json
{
  "id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7a0f6e6d-3ca5-46da-8275-8e0274f3bb80",
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
  "created_at": "2026-10-28T14:15:08.880603Z",
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
    "id": "296ba5eb-28fe-482e-a7cf-ea684afcc5de",
    "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
    "expires_at": "2026-10-28T14:15:24.427463Z",
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

`POST /api/driver/v1/offers/296ba5eb-28fe-482e-a7cf-ea684afcc5de/accept` → **200**

```json
{
  "command_id": "a48eaef1-f934-4afa-a1c0-e9fe2201f8e2"
}
```

```json
{
  "id": "fe6939e7-f676-4953-bdcf-1dfbdff9ca86",
  "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b95346f9-bdd1-41ec-b7d8-38bf04cddd57",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b95346f9-bdd1-41ec-b7d8-38bf04cddd57",
  "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
  "assignment_id": "fe6939e7-f676-4953-bdcf-1dfbdff9ca86",
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

`POST /api/driver/v1/work-sessions/1f793e91-4277-4ca2-b1a9-00dd7a1bfd81/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:15:11Z",
    "sequence": 1793196911525
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f793e91-4277-4ca2-b1a9-00dd7a1bfd81",
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
  "last_heartbeat_at": "2026-10-28T14:15:11.546313Z",
  "last_location_at": "2026-10-28T14:15:11.546313Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b95346f9-bdd1-41ec-b7d8-38bf04cddd57/arrive` → **200**

```json
{
  "command_id": "42e53c18-aed1-42c9-b59d-f1f87613ed1a",
  "expected_version": 0
}
```

```json
{
  "id": "b95346f9-bdd1-41ec-b7d8-38bf04cddd57",
  "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
  "assignment_id": "fe6939e7-f676-4953-bdcf-1dfbdff9ca86",
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
  "arrived_at": "2026-10-28T14:15:11.822408Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b95346f9-bdd1-41ec-b7d8-38bf04cddd57/start` → **200**

```json
{
  "command_id": "5e02f8f4-1147-4225-8ff0-52fa3c9db397",
  "expected_version": 1
}
```

```json
{
  "id": "b95346f9-bdd1-41ec-b7d8-38bf04cddd57",
  "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
  "assignment_id": "fe6939e7-f676-4953-bdcf-1dfbdff9ca86",
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
  "arrived_at": "2026-10-28T14:15:11.822408Z",
  "started_at": "2026-10-28T14:15:12.103818Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b95346f9-bdd1-41ec-b7d8-38bf04cddd57/complete` → **200**

```json
{
  "command_id": "f312b816-3458-4898-a074-69ffe1bc2696",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:15:12Z",
  "cash_received": true
}
```

```json
{
  "id": "b95346f9-bdd1-41ec-b7d8-38bf04cddd57",
  "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
  "assignment_id": "fe6939e7-f676-4953-bdcf-1dfbdff9ca86",
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
  "arrived_at": "2026-10-28T14:15:11.822408Z",
  "started_at": "2026-10-28T14:15:12.103818Z",
  "completed_at": "2026-10-28T14:15:12.383Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/7bc705b7-30c1-4997-8223-6f9ed7563d87` → **200**

```json
{
  "id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7a0f6e6d-3ca5-46da-8275-8e0274f3bb80",
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
    "id": "fe6939e7-f676-4953-bdcf-1dfbdff9ca86",
    "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b95346f9-bdd1-41ec-b7d8-38bf04cddd57",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:15:08.880603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7bc705b7-30c1-4997-8223-6f9ed7563d87` → **200**

```json
{
  "id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7a0f6e6d-3ca5-46da-8275-8e0274f3bb80",
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
    "id": "fe6939e7-f676-4953-bdcf-1dfbdff9ca86",
    "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b95346f9-bdd1-41ec-b7d8-38bf04cddd57",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:15:08.880603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7bc705b7-30c1-4997-8223-6f9ed7563d87` → **200**

```json
{
  "id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "7a0f6e6d-3ca5-46da-8275-8e0274f3bb80",
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
    "id": "fe6939e7-f676-4953-bdcf-1dfbdff9ca86",
    "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b95346f9-bdd1-41ec-b7d8-38bf04cddd57",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:15:08.880603Z",
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
      "id": "383a488a-8a32-4b20-9e1b-1d17ff3b8fe4",
      "at": "2026-10-28T14:15:12.481156Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/7bc705b7-30c1-4997-8223-6f9ed7563d87/tip` → **200**

```json
{
  "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
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
  "available_until": "2026-10-29T14:15:12.383Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/7bc705b7-30c1-4997-8223-6f9ed7563d87/tip` → **201**

```json
{
  "command_id": "f788ed88-04ba-481e-a468-c441af3b201e",
  "amount_minor": 2500
}
```

```json
{
  "id": "dc90ee75-5ef3-4cd0-8241-6a85f0aba13e",
  "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:15:16.333299Z"
}
```

`GET /api/rider/v1/orders/7bc705b7-30c1-4997-8223-6f9ed7563d87/tip` → **200**

```json
{
  "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
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
  "available_until": "2026-10-29T14:15:12.383Z",
  "open": false,
  "tip": {
    "id": "dc90ee75-5ef3-4cd0-8241-6a85f0aba13e",
    "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:15:16.333299Z"
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
      "id": "383a488a-8a32-4b20-9e1b-1d17ff3b8fe4",
      "at": "2026-10-28T14:15:12.481156Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
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
      "id": "e16f05d9-7919-40ba-8584-f6529ef14e5a",
      "at": "2026-10-28T14:15:17.549196Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
      "counterpart_id": null
    },
    {
      "id": "383a488a-8a32-4b20-9e1b-1d17ff3b8fe4",
      "at": "2026-10-28T14:15:12.481156Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d6cb21b2-bfb7-4b6b-9085-ff9493a730e1",
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
  "id": "e065e2aa-c9d0-46b4-a9b5-d8a23b4b903a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:18.423665Z",
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
  "session_id": "5545418c-2895-4d5b-8a17-f8f1d5f1f98c",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4MTksImlhdCI6MTc5MzE5NjkxOSwianRpIjoiM2EyOGRkNzAtMjc4ZC00ZGIxLTg5M2ItYTYwNWUwODZjMGU4Iiwic2lkIjoiNTU0NTQxOGMtMjg5NS00ZDViLThhMTctZjhmMWQ1ZjFmOThjIn0.RAdS1GHGN1h_WtyQFZ4yvjew6BJJeynvQ3G-swQCxH8",
  "access_expires_at": "2026-10-28T14:30:19.049304289Z",
  "refresh_token": "NRZi8i4j11HFcFO3MCHhnSd76tgRu4wzfV9zMi0qFFo",
  "refresh_expires_at": "2026-10-29T02:15:19.048592028Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737757755` → **200**

```json
{
  "client_id": "7a0f6e6d-3ca5-46da-8275-8e0274f3bb80"
}
```

`POST /api/admin/v1/rider-wallets/7a0f6e6d-3ca5-46da-8275-8e0274f3bb80/top-ups` → **201**

```json
{
  "command_id": "0b204cf5-4967-4713-a52b-39d5846bf6e9",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "7a0f6e6d-3ca5-46da-8275-8e0274f3bb80",
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
      "id": "f9b482c1-4324-4ccd-bcd4-4b53c883c35e",
      "at": "2026-10-28T14:15:19.600902Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a3483579-f538-4588-a857-cf935128e63b",
  "quote_id": "e065e2aa-c9d0-46b4-a9b5-d8a23b4b903a",
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
  "id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a0f6e6d-3ca5-46da-8275-8e0274f3bb80",
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
  "created_at": "2026-10-28T14:15:19.895647Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8eac1d10-ba02-41d5-a62d-4776bbb99fe4` → **200**

```json
{
  "id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a0f6e6d-3ca5-46da-8275-8e0274f3bb80",
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
  "created_at": "2026-10-28T14:15:19.895647Z",
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
    "id": "6b842484-c39a-4e7f-840c-2e736a05aa99",
    "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
    "expires_at": "2026-10-28T14:15:34.90098Z",
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

`POST /api/driver/v1/offers/6b842484-c39a-4e7f-840c-2e736a05aa99/accept` → **200**

```json
{
  "command_id": "e1ee9214-524a-4699-88a8-288e64dafc9d"
}
```

```json
{
  "id": "e024098e-7df6-42a8-a2e9-4217aea04117",
  "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5906af3f-1b27-46ef-a4e1-23a33b6b48e9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5906af3f-1b27-46ef-a4e1-23a33b6b48e9",
  "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
  "assignment_id": "e024098e-7df6-42a8-a2e9-4217aea04117",
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

`POST /api/driver/v1/work-sessions/1f793e91-4277-4ca2-b1a9-00dd7a1bfd81/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:15:21Z",
    "sequence": 1793196921304
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f793e91-4277-4ca2-b1a9-00dd7a1bfd81",
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
  "last_heartbeat_at": "2026-10-28T14:15:21.324773Z",
  "last_location_at": "2026-10-28T14:15:21.324773Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5906af3f-1b27-46ef-a4e1-23a33b6b48e9/arrive` → **200**

```json
{
  "command_id": "ddebbf9f-dce6-43c5-be53-d4803c421288",
  "expected_version": 0
}
```

```json
{
  "id": "5906af3f-1b27-46ef-a4e1-23a33b6b48e9",
  "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
  "assignment_id": "e024098e-7df6-42a8-a2e9-4217aea04117",
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
  "arrived_at": "2026-10-28T14:15:21.598947Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5906af3f-1b27-46ef-a4e1-23a33b6b48e9/start` → **200**

```json
{
  "command_id": "8ee9605b-bbd1-4bba-82b8-ecb23eb7c041",
  "expected_version": 1
}
```

```json
{
  "id": "5906af3f-1b27-46ef-a4e1-23a33b6b48e9",
  "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
  "assignment_id": "e024098e-7df6-42a8-a2e9-4217aea04117",
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
  "arrived_at": "2026-10-28T14:15:21.598947Z",
  "started_at": "2026-10-28T14:15:21.891728Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5906af3f-1b27-46ef-a4e1-23a33b6b48e9/complete` → **200**

```json
{
  "command_id": "57fa1c1a-9ebb-4d02-988a-d6e19052a911",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:15:22Z",
  "cash_received": true
}
```

```json
{
  "id": "5906af3f-1b27-46ef-a4e1-23a33b6b48e9",
  "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
  "assignment_id": "e024098e-7df6-42a8-a2e9-4217aea04117",
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
  "arrived_at": "2026-10-28T14:15:21.598947Z",
  "started_at": "2026-10-28T14:15:21.891728Z",
  "completed_at": "2026-10-28T14:15:22.182844Z",
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
  "client_id": "7a0f6e6d-3ca5-46da-8275-8e0274f3bb80",
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
      "id": "f9b482c1-4324-4ccd-bcd4-4b53c883c35e",
      "at": "2026-10-28T14:15:19.600902Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
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
      "id": "066ecffd-c2d3-4571-8fce-26115ac369bd",
      "at": "2026-10-28T14:15:22.597087Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
      "counterpart_id": null
    },
    {
      "id": "e16f05d9-7919-40ba-8584-f6529ef14e5a",
      "at": "2026-10-28T14:15:17.549196Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
      "counterpart_id": null
    },
    {
      "id": "383a488a-8a32-4b20-9e1b-1d17ff3b8fe4",
      "at": "2026-10-28T14:15:12.481156Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/8eac1d10-ba02-41d5-a62d-4776bbb99fe4/tip` → **200**

```json
{
  "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
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
  "available_until": "2026-10-29T14:15:22.182844Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/8eac1d10-ba02-41d5-a62d-4776bbb99fe4/tip` → **201**

```json
{
  "command_id": "a89392d6-db5e-42e9-a858-fc85a0c371e0",
  "amount_minor": 2500
}
```

```json
{
  "id": "f6cdf4ef-686a-41b2-b88e-9415d4768782",
  "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:15:23.571908Z"
}
```

`GET /api/rider/v1/orders/8eac1d10-ba02-41d5-a62d-4776bbb99fe4/tip` → **200**

```json
{
  "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
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
  "available_until": "2026-10-29T14:15:22.182844Z",
  "open": false,
  "tip": {
    "id": "f6cdf4ef-686a-41b2-b88e-9415d4768782",
    "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:15:23.571908Z"
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
      "id": "066ecffd-c2d3-4571-8fce-26115ac369bd",
      "at": "2026-10-28T14:15:22.597087Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
      "counterpart_id": null
    },
    {
      "id": "e16f05d9-7919-40ba-8584-f6529ef14e5a",
      "at": "2026-10-28T14:15:17.549196Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
      "counterpart_id": null
    },
    {
      "id": "383a488a-8a32-4b20-9e1b-1d17ff3b8fe4",
      "at": "2026-10-28T14:15:12.481156Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
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
      "id": "c1e4112f-4491-4bd7-9bba-ea51bd294acb",
      "at": "2026-10-28T14:15:24.625776Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
      "counterpart_id": null
    },
    {
      "id": "066ecffd-c2d3-4571-8fce-26115ac369bd",
      "at": "2026-10-28T14:15:22.597087Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8eac1d10-ba02-41d5-a62d-4776bbb99fe4",
      "counterpart_id": null
    },
    {
      "id": "e16f05d9-7919-40ba-8584-f6529ef14e5a",
      "at": "2026-10-28T14:15:17.549196Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
      "counterpart_id": null
    },
    {
      "id": "383a488a-8a32-4b20-9e1b-1d17ff3b8fe4",
      "at": "2026-10-28T14:15:12.481156Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7bc705b7-30c1-4997-8223-6f9ed7563d87",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f793e91-4277-4ca2-b1a9-00dd7a1bfd81",
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
  "last_heartbeat_at": "2026-10-28T14:15:21.324773Z",
  "last_location_at": "2026-10-28T14:15:21.324773Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f793e91-4277-4ca2-b1a9-00dd7a1bfd81/close` → **200**

```json
{
  "command_id": "9915fece-064b-4499-ab01-fe673b47f7b8",
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

Done: card order 8eac1d10-ba02-41d5-a62d-4776bbb99fe4.

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
  "phone": "+380737266307",
  "device_ref": "sandbox-23746"
}
```

```json
{
  "challenge_id": "b529c86c-35b0-40db-8728-87f3954e92c8",
  "expires_at": "2026-10-28T14:20:26.480441419Z",
  "resend_available_at": "2026-10-28T14:15:27.480441419Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737266307` → **200**

```json
{
  "phone": "+380737266307",
  "audience": "CLIENT",
  "code": "631423",
  "sent_at": "2026-10-28T14:15:26.48417225Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b529c86c-35b0-40db-8728-87f3954e92c8",
  "code": "631423",
  "device_ref": "sandbox-23746"
}
```

```json
{
  "session_id": "128fb49a-fd8d-4362-a6e9-2b7ec4d917e6",
  "subject": {
    "type": "CLIENT",
    "id": "43611210-ebab-49a4-90d6-4fff26737047"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzYxMTIxMC1lYmFiLTQ5YTQtOTBkNi00ZmZmMjY3MzcwNDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODI2LCJpYXQiOjE3OTMxOTY5MjYsImp0aSI6IjNkNjYxZDI4LWE1NDctNDljYS1hNmE5LWEwYTM3NmQwZmFmNyIsInNpZCI6IjEyOGZiNDlhLWZkOGQtNDM2Mi1hNmU5LTJiN2VjNGQ5MTdlNiJ9.8eDgEdPv1C1Fo_23JAt2jlbhoGCjqHLGOZsGMZ2SCTQ",
  "access_expires_at": "2026-10-28T14:30:26.782584086Z",
  "refresh_token": "4UHVzf0meaRqwAxK7zZNC84wWno_QaTSXcrsAwWTrYg",
  "refresh_expires_at": "2026-11-27T14:15:26.782064035Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "1aa9c3cc-b821-479e-ba7d-8dbef79149dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "1ea02692-8e94-4182-9f23-f02f4dac6660",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-1ea02692-8e94-4182-9f23-f02f4dac6660",
    "orderDate": "1793196927",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "e70ee4a27ebfc46ddcc180a7460e24f4",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=1ea02692-8e94-4182-9f23-f02f4dac6660",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737266307"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=1ea02692-8e94-4182-9f23-f02f4dac6660",
  "created_at": "2026-10-28T14:15:27.058099Z",
  "expires_at": "2026-10-28T14:45:27.058099Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/1ea02692-8e94-4182-9f23-f02f4dac6660` → **200**

```json
{
  "id": "1ea02692-8e94-4182-9f23-f02f4dac6660",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:15:27.058099Z",
  "expires_at": "2026-10-28T14:45:27.058099Z",
  "completed_at": "2026-10-28T14:15:27.337661Z",
  "masked_pan": "41****7448",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "43611210-ebab-49a4-90d6-4fff26737047",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "43611210-ebab-49a4-90d6-4fff26737047",
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
      "id": "4c29a349-52d4-4628-83d3-688f75acd11f",
      "at": "2026-10-28T14:15:27.64009Z",
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
  "client_id": "43611210-ebab-49a4-90d6-4fff26737047",
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
      "id": "4c29a349-52d4-4628-83d3-688f75acd11f",
      "at": "2026-10-28T14:15:27.64009Z",
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
  "device_ref": "sandbox-16752"
}
```

```json
{
  "challenge_id": "36ae387a-4961-407c-9ad9-df74d559198b",
  "expires_at": "2026-10-28T14:20:29.436099016Z",
  "resend_available_at": "2026-10-28T14:15:30.436099016Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "526968",
  "sent_at": "2026-10-28T14:15:29.439315574Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36ae387a-4961-407c-9ad9-df74d559198b",
  "code": "526968",
  "device_ref": "sandbox-16752"
}
```

```json
{
  "session_id": "41abd55b-8557-4475-ac5b-972c4ac45819",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzgyOSwiaWF0IjoxNzkzMTk2OTI5LCJqdGkiOiJjZTVhOTBiNC00NDU3LTQ4ZmUtODk5YS02MWNlNDhkNjczNzMiLCJzaWQiOiI0MWFiZDU1Yi04NTU3LTQ0NzUtYWM1Yi05NzJjNGFjNDU4MTkifQ.8HddFOm8_ryulK-AC_H8Cpoo-Hz-RPEuFSa-_38nRbM",
  "access_expires_at": "2026-10-28T14:30:29.73859061Z",
  "refresh_token": "J1NL3mZ2Oc-1J0M9VK0L67D1r4zEQtT_7Hlut27-QQY",
  "refresh_expires_at": "2026-11-27T14:15:29.738055446Z",
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
  "command_id": "eab0d9fe-b336-401a-8e54-efd870fea91d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "058f0644-2297-4052-9865-511d93828672",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-058f0644-2297-4052-9865-511d93828672",
    "orderDate": "1793196930",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "6faf4023ef906cbdcf7a1d7e20b44244",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=058f0644-2297-4052-9865-511d93828672",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=058f0644-2297-4052-9865-511d93828672",
  "created_at": "2026-10-28T14:15:30.276502Z",
  "expires_at": "2026-10-28T14:45:30.276502Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/058f0644-2297-4052-9865-511d93828672` → **200**

```json
{
  "id": "058f0644-2297-4052-9865-511d93828672",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:15:30.276502Z",
  "expires_at": "2026-10-28T14:45:30.276502Z",
  "completed_at": "2026-10-28T14:15:30.556456Z",
  "masked_pan": "41****6735",
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
      "id": "d7c4b6cb-1ff6-4717-b88f-239d1d47d1f3",
      "at": "2026-10-28T14:15:30.657672Z",
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
  "command_id": "3c085022-c8ce-42a9-8e37-ff9275d67c84",
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
  "correlation_id": "b8c41665-b3df-4c6b-b920-0a8273d56db8"
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
  "session_id": "7f6efd12-4160-4094-91de-c6e525bd1701",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4MzEsImlhdCI6MTc5MzE5NjkzMSwianRpIjoiMzc1MjljY2QtYzA3My00ZTA5LWFhMTQtYmI0YjY2M2QwNThmIiwic2lkIjoiN2Y2ZWZkMTItNDE2MC00MDk0LTkxZGUtYzZlNTI1YmQxNzAxIn0.iG0nJ0MKmH0ZgLx2CTtxip6rDY5R-x0o__K0PlLOq6M",
  "access_expires_at": "2026-10-28T14:30:31.746727771Z",
  "refresh_token": "bMmEvD_IjCVF6aLvi9oDup3yq-bagr1QLDLOoyJj7sc",
  "refresh_expires_at": "2026-10-29T02:15:31.746216664Z",
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
  "phone": "+48600748626",
  "device_ref": "sandbox-12420"
}
```

```json
{
  "challenge_id": "4447a2b0-b367-4f9a-af9b-f7cf41dce07f",
  "expires_at": "2026-10-28T14:20:32.557298605Z",
  "resend_available_at": "2026-10-28T14:15:33.557298605Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600748626` → **200**

```json
{
  "phone": "+48600748626",
  "audience": "CLIENT",
  "code": "189669",
  "sent_at": "2026-10-28T14:15:32.560233946Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4447a2b0-b367-4f9a-af9b-f7cf41dce07f",
  "code": "189669",
  "device_ref": "sandbox-12420"
}
```

```json
{
  "session_id": "d0ec7c0f-f97b-4755-9d38-bcd9f9ad35ed",
  "subject": {
    "type": "CLIENT",
    "id": "45ec66f1-ff4a-4a5a-8cd6-3f97cee15591"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NWVjNjZmMS1mZjRhLTRhNWEtOGNkNi0zZjk3Y2VlMTU1OTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODMyLCJpYXQiOjE3OTMxOTY5MzIsImp0aSI6ImZkM2I5ZDhiLTkzYmItNDFlNy04ZTkzLWMxN2E5YmJlYmE2NSIsInNpZCI6ImQwZWM3YzBmLWY5N2ItNDc1NS05ZDM4LWJjZDlmOWFkMzVlZCJ9.s7XfkbI3TMSsATAy084OM0iYH7JN-5dfIjk1m43F5-k",
  "access_expires_at": "2026-10-28T14:30:32.855398664Z",
  "refresh_token": "NGCiOM_ONjhBMINGZQx4mf9VRl8yP4a-SuovFs1bJaA",
  "refresh_expires_at": "2026-11-27T14:15:32.854877401Z",
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
  "command_id": "4351747f-a458-4044-aa72-2cabece2fc1a",
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
  "correlation_id": "bad84380-3e6c-4aac-8eaf-12ad0e3ea7bc",
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
  "command_id": "fe0a7185-eb04-4621-8000-dc19cd31d05b",
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
  "paused_at": "2026-10-28T14:15:33.967366188Z",
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
  "command_id": "d20fdbee-ce68-45fe-a766-e959b475decd",
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
  "id": "4e9f7f1b-bd73-4944-902b-37003b2a64c8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:34.528780Z",
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
  "command_id": "b6638173-0e6c-48b3-b511-9ab8e9359f55",
  "quote_id": "4e9f7f1b-bd73-4944-902b-37003b2a64c8",
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
  "correlation_id": "ca9f1229-c3e8-4d6f-b225-9c7141ab7516"
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
  "paused_at": "2026-10-28T14:15:33.967366Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "b2032ae8-706a-4e21-a372-12387b90d116",
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
  "command_id": "fa0a0c80-20c3-41b1-84ad-dde4c5fbea29",
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
  "command_id": "e0affee8-1f5c-4f88-9ab1-9bcd8f147e09",
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
  "id": "522adadc-f9dc-47da-a3b7-b300ed151abf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:36.190662Z",
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
  "command_id": "8e464107-57f4-41d6-a37c-0b78309a0fa2",
  "quote_id": "522adadc-f9dc-47da-a3b7-b300ed151abf",
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
  "correlation_id": "b425ed26-fca3-467c-bbeb-1feb9c13b3f5"
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
  "command_id": "39ad8722-51ed-4845-99bc-0db121f913b4",
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
  "command_id": "c77e67ba-d756-4814-896b-105f9b7e1a90",
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
  "id": "06f5dbc7-388a-4837-b4c5-78820966b0ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:37.299776Z",
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
  "command_id": "d4f452d7-6892-4f85-a717-dac4859ac105",
  "quote_id": "06f5dbc7-388a-4837-b4c5-78820966b0ad",
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
  "correlation_id": "3d0331f0-4e84-4bd6-8dc4-169f6f23ec46"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "252dea4a-3eaf-4a1b-a96b-e9d4c1e5eefc",
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
  "correlation_id": "af42b456-9e50-4aab-bea8-17f222934e17"
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
  "command_id": "74e173d0-ede4-494c-bc6f-75e366e9ca9a",
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
  "phone": "+380671350785",
  "device_ref": "sandbox-7653"
}
```

```json
{
  "challenge_id": "13e7363f-6924-4c46-bae1-14fec716ac9b",
  "expires_at": "2026-10-28T14:20:38.695118567Z",
  "resend_available_at": "2026-10-28T14:15:39.695118567Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671350785` → **200**

```json
{
  "phone": "+380671350785",
  "audience": "CLIENT",
  "code": "165049",
  "sent_at": "2026-10-28T14:15:38.697315674Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "13e7363f-6924-4c46-bae1-14fec716ac9b",
  "code": "165049",
  "device_ref": "sandbox-7653"
}
```

```json
{
  "session_id": "bd82acbc-ef9b-41aa-9d15-ed189a596769",
  "subject": {
    "type": "CLIENT",
    "id": "97204d99-e21a-4e85-9c8b-ddd771cd1c5a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NzIwNGQ5OS1lMjFhLTRlODUtOWM4Yi1kZGQ3NzFjZDFjNWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODM4LCJpYXQiOjE3OTMxOTY5MzgsImp0aSI6IjUyM2RlNjliLTM4NWEtNGFiMS04ZjI3LWM3NTBmYjEyNjRiMCIsInNpZCI6ImJkODJhY2JjLWVmOWItNDFhYS05ZDE1LWVkMTg5YTU5Njc2OSJ9.vVP2mrZyxGTETKIE6zHb_jq3q140aMg3SDs_1EzC0bc",
  "access_expires_at": "2026-10-28T14:30:38.999154865Z",
  "refresh_token": "L_Rxr82Irtth8HUosDG9QGhRJaPMKC2gCmx7JJDsG8c",
  "refresh_expires_at": "2026-11-27T14:15:38.998603624Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "97204d99-e21a-4e85-9c8b-ddd771cd1c5a",
  "session_id": "bd82acbc-ef9b-41aa-9d15-ed189a596769",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7b291e82-8fb9-412a-ab36-3e5171a2239d",
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
  "id": "fb2ae63b-1928-4405-9a8a-a11ed8133b12",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:39.541229Z",
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
  "challenge_id": "626a1a6c-cc3b-438b-aaa6-982889227a14",
  "expires_at": "2026-10-28T14:20:41.833293049Z",
  "resend_available_at": "2026-10-28T14:15:42.833293049Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671350785` → **200**

```json
{
  "phone": "+380671350785",
  "audience": "CLIENT",
  "code": "988131",
  "sent_at": "2026-10-28T14:15:41.835388936Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "c5c9ba8d-dc2b-4432-98ae-34660bab4e73",
  "challenge_id": "626a1a6c-cc3b-438b-aaa6-982889227a14",
  "otp_code": "988131"
}
```

```json
{
  "client_id": "97204d99-e21a-4e85-9c8b-ddd771cd1c5a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T14:15:42.136041815Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "edf9351a-5943-43f1-87d0-a3c1f4b54e3e",
  "quote_id": "fb2ae63b-1928-4405-9a8a-a11ed8133b12",
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
  "correlation_id": "1ee61535-db91-4158-b898-dc3055ac0d73"
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
  "session_id": "56a1915c-60c4-43e5-8da4-c8be12d04ad7",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4NDMsImlhdCI6MTc5MzE5Njk0MywianRpIjoiZjJkMzRhODYtNTczMC00OThhLTk1NGUtYjc1MDcxMDRkODQwIiwic2lkIjoiNTZhMTkxNWMtNjBjNC00M2U1LThkYTQtYzhiZTEyZDA0YWQ3In0.MVczjYHKpzcQI3n8N8NK_hblebA_s2znglw3qz2AXg4",
  "access_expires_at": "2026-10-28T14:30:43.018745332Z",
  "refresh_token": "l-fxBnzwCzZTGxYs_KwN8Ckz7cGRSEmcH1MUxhbNLG8",
  "refresh_expires_at": "2026-10-29T02:15:43.0182375Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "97204d99-e21a-4e85-9c8b-ddd771cd1c5a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T14:15:42.136042Z",
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

`POST /api/admin/v1/client-deletions/97204d99-e21a-4e85-9c8b-ddd771cd1c5a/complete` → **200**

```json
{
  "command_id": "3e127a09-c942-453b-97a2-85b9a0cab57f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "97204d99-e21a-4e85-9c8b-ddd771cd1c5a",
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
  "correlation_id": "87f5334a-bf0b-46b4-808e-93cf5f0ad6a9"
}
```

Done: client 97204d99-e21a-4e85-9c8b-ddd771cd1c5a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665499991",
  "device_ref": "sandbox-9241"
}
```

```json
{
  "challenge_id": "2c91ebbe-f0d5-4a89-a1ae-916f9cf5db8f",
  "expires_at": "2026-10-28T14:20:44.133214237Z",
  "resend_available_at": "2026-10-28T14:15:45.133214237Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665499991` → **200**

```json
{
  "phone": "+380665499991",
  "audience": "CLIENT",
  "code": "504744",
  "sent_at": "2026-10-28T14:15:44.136039654Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c91ebbe-f0d5-4a89-a1ae-916f9cf5db8f",
  "code": "504744",
  "device_ref": "sandbox-9241"
}
```

```json
{
  "session_id": "4d7e11ba-388f-41c1-810f-272b2481b5cc",
  "subject": {
    "type": "CLIENT",
    "id": "27b3143d-e078-442d-a594-5d5149b0de48"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2IzMTQzZC1lMDc4LTQ0MmQtYTU5NC01ZDUxNDliMGRlNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODQ0LCJpYXQiOjE3OTMxOTY5NDQsImp0aSI6IjYyY2I5NzEzLTVlMDEtNGExYy04ZTZjLTg4MGI1NTg4OGRkZSIsInNpZCI6IjRkN2UxMWJhLTM4OGYtNDFjMS04MTBmLTI3MmIyNDgxYjVjYyJ9.Lhsk74YexCwFXpmkBqTl6Z3uL6L7liuo1vny6qXS8Ss",
  "access_expires_at": "2026-10-28T14:30:44.43412816Z",
  "refresh_token": "rCEm4dBX7v5O1Q0f4uWeB1I7a1Wf6vmxdINQEZFQUZI",
  "refresh_expires_at": "2026-11-27T14:15:44.433578405Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "27b3143d-e078-442d-a594-5d5149b0de48",
  "session_id": "4d7e11ba-388f-41c1-810f-272b2481b5cc",
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
  "session_id": "58a64082-89a4-472f-b56e-73986e4dabd9",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4NDUsImlhdCI6MTc5MzE5Njk0NSwianRpIjoiMGNjNzllMzQtYTg5MC00OTU4LTgwNWItNWM4ODdlMjM4OTQ0Iiwic2lkIjoiNThhNjQwODItODlhNC00NzJmLWI1NmUtNzM5ODZlNGRhYmQ5In0.5d-x91I6ORYjohInbylTp94v5qkO4rUqYd5fU3cxuBU",
  "access_expires_at": "2026-10-28T14:30:45.286303227Z",
  "refresh_token": "aEpp_EfKtR_LIzc-ni1GCB73SD0fyBTTgQMUbFNmzXk",
  "refresh_expires_at": "2026-10-29T02:15:45.285769807Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=5499991&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "27b3143d-e078-442d-a594-5d5149b0de48",
      "phone": "+380665499991",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T14:15:44.431689Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/27b3143d-e078-442d-a594-5d5149b0de48` → **200**

```json
{
  "client": {
    "id": "27b3143d-e078-442d-a594-5d5149b0de48",
    "phone": "+380665499991",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:15:44.431689Z",
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

`POST /api/admin/v1/clients/27b3143d-e078-442d-a594-5d5149b0de48/block` → **400**

```json
{
  "command_id": "6be40928-79e6-4631-b066-bd4ab916a15a",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/27b3143d-e078-442d-a594-5d5149b0de48/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "89ed65db-a267-41e2-98b5-d375cea1a2c4",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/27b3143d-e078-442d-a594-5d5149b0de48/block` → **200**

```json
{
  "command_id": "4e930352-634e-455e-9f4c-f287a4dc64ae",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "27b3143d-e078-442d-a594-5d5149b0de48",
  "phone": "+380665499991",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T14:15:44.431689Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T14:15:46.43599Z",
    "by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
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
  "correlation_id": "4c53d609-e0db-43e1-b3cc-26cc0aaef27e"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665499991",
  "device_ref": "sandbox-26249"
}
```

```json
{
  "challenge_id": "1610d5b2-16bd-409b-bc42-e2b35492f9f1",
  "expires_at": "2026-10-28T14:20:48.989497035Z",
  "resend_available_at": "2026-10-28T14:15:49.989497035Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665499991` → **200**

```json
{
  "phone": "+380665499991",
  "audience": "CLIENT",
  "code": "817866",
  "sent_at": "2026-10-28T14:15:48.991631328Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "1610d5b2-16bd-409b-bc42-e2b35492f9f1",
  "code": "817866",
  "device_ref": "sandbox-26249"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "b7c70106-e63b-477e-a169-ae85b4a63d7e"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/27b3143d-e078-442d-a594-5d5149b0de48` → **200**

```json
{
  "client": {
    "id": "27b3143d-e078-442d-a594-5d5149b0de48",
    "phone": "+380665499991",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T14:15:44.431689Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T14:15:46.43599Z",
      "by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
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

`POST /api/admin/v1/clients/27b3143d-e078-442d-a594-5d5149b0de48/unblock` → **200**

```json
{
  "command_id": "4c8178f3-6c3e-4726-b7bf-66fac8052aac",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "27b3143d-e078-442d-a594-5d5149b0de48",
  "phone": "+380665499991",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T14:15:44.431689Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665499991",
  "device_ref": "sandbox-7734"
}
```

```json
{
  "challenge_id": "5c576dcc-b51d-4239-9e21-455d736b0173",
  "expires_at": "2026-10-28T14:20:52.130595802Z",
  "resend_available_at": "2026-10-28T14:15:53.130595802Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665499991` → **200**

```json
{
  "phone": "+380665499991",
  "audience": "CLIENT",
  "code": "924709",
  "sent_at": "2026-10-28T14:15:52.133283231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c576dcc-b51d-4239-9e21-455d736b0173",
  "code": "924709",
  "device_ref": "sandbox-7734"
}
```

```json
{
  "session_id": "71d1687c-5df1-4f4b-a4e9-8829a917fabf",
  "subject": {
    "type": "CLIENT",
    "id": "27b3143d-e078-442d-a594-5d5149b0de48"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2IzMTQzZC1lMDc4LTQ0MmQtYTU5NC01ZDUxNDliMGRlNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODUyLCJpYXQiOjE3OTMxOTY5NTIsImp0aSI6ImVkZGZjYTA0LWU1OGUtNDI5YS04ZWYwLTdhNmU5ODE3NmM1YSIsInNpZCI6IjcxZDE2ODdjLTVkZjEtNGY0Yi1hNGU5LTg4MjlhOTE3ZmFiZiJ9.J8kJ9ZO-YwXY17rhRWh_VzRpPpScEa-i1x9Il-XQAdg",
  "access_expires_at": "2026-10-28T14:30:52.424796701Z",
  "refresh_token": "z5QuAOvpW9Tx-shtbEj4O2tX0u__K4IGXlZJbiJzj20",
  "refresh_expires_at": "2026-11-27T14:15:52.424182591Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "27b3143d-e078-442d-a594-5d5149b0de48",
  "session_id": "71d1687c-5df1-4f4b-a4e9-8829a917fabf",
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
  "phone": "+380663875432",
  "device_ref": "sandbox-16728"
}
```

```json
{
  "challenge_id": "fb61b744-6da6-4262-a4d8-3ad6f91e0265",
  "expires_at": "2026-10-28T14:20:52.968950604Z",
  "resend_available_at": "2026-10-28T14:15:53.968950604Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663875432` → **200**

```json
{
  "phone": "+380663875432",
  "audience": "CLIENT",
  "code": "209421",
  "sent_at": "2026-10-28T14:15:52.971384452Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb61b744-6da6-4262-a4d8-3ad6f91e0265",
  "code": "209421",
  "device_ref": "sandbox-16728"
}
```

```json
{
  "session_id": "bb89b7b5-ffe7-4d3d-aec5-42f0de3648ff",
  "subject": {
    "type": "CLIENT",
    "id": "4e980ecf-5fdc-4fe8-b0d9-9e3d57fb90e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZTk4MGVjZi01ZmRjLTRmZTgtYjBkOS05ZTNkNTdmYjkwZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODUzLCJpYXQiOjE3OTMxOTY5NTMsImp0aSI6ImE0MjhiMjlkLTYwMTYtNDllNy05N2I0LWVlMWI2ZWU3NWNlOCIsInNpZCI6ImJiODliN2I1LWZmZTctNGQzZC1hZWM1LTQyZjBkZTM2NDhmZiJ9.vvgJ3CJHMMDYt-7NVHLBt5bGRQAu3Z-RpKDiACuwMFM",
  "access_expires_at": "2026-10-28T14:30:53.261958643Z",
  "refresh_token": "L8vK2Xg8i5egmYHJzc8DnO3hTDwuG7Dcf_LihGmA1FU",
  "refresh_expires_at": "2026-11-27T14:15:53.261317158Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b0c85756-4c91-49da-928b-d9881307e08e",
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
  "id": "f6ac4071-0327-4bfa-bed3-19e5643e78e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:53.537891Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 15b724c4-50bb-4c68-b22e-e4a31f5b4f99) → **201**

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
  "session_id": "64650306-828f-47d3-8ac9-a13b5b08bac0",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4NTQsImlhdCI6MTc5MzE5Njk1NCwianRpIjoiY2VkZDQyODUtN2VhMS00MWZmLTkyODAtZjc1OWQ4MDg1YTMwIiwic2lkIjoiNjQ2NTAzMDYtODI4Zi00N2QzLThhYzktYTEzYjViMDhiYWMwIn0.QssSs1Ve6VL4mNebG_7qdYCpTTdHuXvdKf75_AW_qT8",
  "access_expires_at": "2026-10-28T14:30:54.188560629Z",
  "refresh_token": "4g7x3eQp0R7m368e0iHAlmjVVmRaLYJlzvcSR_Xgm3Y",
  "refresh_expires_at": "2026-10-29T02:15:54.188052857Z",
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
  "session_id": "b45d0979-c602-4262-8966-9290aca182bf",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4NTQsImlhdCI6MTc5MzE5Njk1NCwianRpIjoiNDgwNWNhYjQtOTdiOC00ZjExLTk0M2YtN2EwMGM2ZDZkNTJmIiwic2lkIjoiYjQ1ZDA5NzktYzYwMi00MjYyLTg5NjYtOTI5MGFjYTE4MmJmIn0.BbHWLnQw6nwJbAv0d1nDhtAzrYMzyvgMRFzLtpwdqBU",
  "access_expires_at": "2026-10-28T14:30:54.811163512Z",
  "refresh_token": "sTNImgM6PEWkiN7-NqBu98X4d_rbPPyiCIMzIs7YheQ",
  "refresh_expires_at": "2026-10-29T02:15:54.810565871Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b971a440-d4d5-4664-b345-0c92db645854/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:15:53.818955Z",
      "actor": {
        "type": "CLIENT",
        "id": "4e980ecf-5fdc-4fe8-b0d9-9e3d57fb90e3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b971a440-d4d5-4664-b345-0c92db645854",
        "quote_id": "f6ac4071-0327-4bfa-bed3-19e5643e78e2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "15b724c4-50bb-4c68-b22e-e4a31f5b4f99"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:15:53.820837Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b971a440-d4d5-4664-b345-0c92db645854",
        "attempt_id": "408a0d05-9380-459a-be11-b5eca4d0ef8d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "15b724c4-50bb-4c68-b22e-e4a31f5b4f99"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T14:15:53.830393Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b971a440-d4d5-4664-b345-0c92db645854",
        "attempt_id": "408a0d05-9380-459a-be11-b5eca4d0ef8d"
      },
      "correlation_id": "15b724c4-50bb-4c68-b22e-e4a31f5b4f99"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "408a0d05-9380-459a-be11-b5eca4d0ef8d",
        "generation": 1,
        "started_at": "2026-10-28T14:15:53.819946Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T14:15:53.830393Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T14:15:53.821757Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/15b724c4-50bb-4c68-b22e-e4a31f5b4f99` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "b971a440-d4d5-4664-b345-0c92db645854:0",
      "order_id": "b971a440-d4d5-4664-b345-0c92db645854",
      "at": "2026-10-28T14:15:53.818955Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "b971a440-d4d5-4664-b345-0c92db645854:1",
      "order_id": "b971a440-d4d5-4664-b345-0c92db645854",
      "at": "2026-10-28T14:15:53.820837Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "b971a440-d4d5-4664-b345-0c92db645854:2",
      "order_id": "b971a440-d4d5-4664-b345-0c92db645854",
      "at": "2026-10-28T14:15:53.830393Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/b6cf5490-9ea1-42b1-bfb2-3d9154431201` → **200**

```json
{
  "found": []
}
```

Done: request 15b724c4-50bb-4c68-b22e-e4a31f5b4f99 — order b971a440-d4d5-4664-b345-0c92db645854 found by its id.

`GET /api/rider/v1/orders/b971a440-d4d5-4664-b345-0c92db645854` → **200**

```json
{
  "id": "b971a440-d4d5-4664-b345-0c92db645854",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4e980ecf-5fdc-4fe8-b0d9-9e3d57fb90e3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:15:53.818375Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b971a440-d4d5-4664-b345-0c92db645854/cancel` → **200**

```json
{
  "command_id": "3f30088d-c4e1-4fed-880b-c39512666582",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b971a440-d4d5-4664-b345-0c92db645854",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4e980ecf-5fdc-4fe8-b0d9-9e3d57fb90e3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:15:53.818375Z",
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
  "phone": "+380637063374",
  "device_ref": "sandbox-14513"
}
```

```json
{
  "challenge_id": "5aa2215c-984a-4e10-b976-ee62dbc43e90",
  "expires_at": "2026-10-28T14:20:56.528662638Z",
  "resend_available_at": "2026-10-28T14:15:57.528662638Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637063374` → **200**

```json
{
  "phone": "+380637063374",
  "audience": "CLIENT",
  "code": "508268",
  "sent_at": "2026-10-28T14:15:56.531319878Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5aa2215c-984a-4e10-b976-ee62dbc43e90",
  "code": "508268",
  "device_ref": "sandbox-14513"
}
```

```json
{
  "session_id": "92562bae-0f3b-4862-b213-7e1228ab3c07",
  "subject": {
    "type": "CLIENT",
    "id": "3240122b-a23a-4524-9d39-bd6edd6dc4fa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMjQwMTIyYi1hMjNhLTQ1MjQtOWQzOS1iZDZlZGQ2ZGM0ZmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODU2LCJpYXQiOjE3OTMxOTY5NTYsImp0aSI6Ijc1ODVjODQ1LWQ3OGItNDM0Yi04MzQxLTQ2M2M5MjkzZjBkMyIsInNpZCI6IjkyNTYyYmFlLTBmM2ItNDg2Mi1iMjEzLTdlMTIyOGFiM2MwNyJ9.aIWdPeZ84ZOJSs6GtjpxQrHsCR5aZXJb9_xX-z2vMiM",
  "access_expires_at": "2026-10-28T14:30:56.843461457Z",
  "refresh_token": "x4tTC126Hnhe1fxXvuFkSzv7Nbi1yJoW_lzToLWlMPo",
  "refresh_expires_at": "2026-11-27T14:15:56.842739216Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "7fe35c4e-0aa0-4604-a367-ac022a768d7e",
  "expires_at": "2026-10-28T14:20:59.120071448Z",
  "resend_available_at": "2026-10-28T14:16:00.120071448Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637063374` → **200**

```json
{
  "phone": "+380637063374",
  "audience": "CLIENT",
  "code": "175229",
  "sent_at": "2026-10-28T14:15:59.122472478Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "db6f10fe-f821-4c12-8402-388975e19acc",
  "challenge_id": "7fe35c4e-0aa0-4604-a367-ac022a768d7e",
  "otp_code": "175229"
}
```

```json
{
  "id": "66477ba0-6e45-4e27-8852-3db5d285036c",
  "state": "PENDING",
  "created_at": "2026-10-28T14:15:59.435708Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/66477ba0-6e45-4e27-8852-3db5d285036c` → **200**

```json
{
  "id": "66477ba0-6e45-4e27-8852-3db5d285036c",
  "state": "PENDING",
  "created_at": "2026-10-28T14:15:59.435708Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/66477ba0-6e45-4e27-8852-3db5d285036c` → **200**

```json
{
  "id": "66477ba0-6e45-4e27-8852-3db5d285036c",
  "state": "PENDING",
  "created_at": "2026-10-28T14:15:59.435708Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/66477ba0-6e45-4e27-8852-3db5d285036c` → **200**

```json
{
  "id": "66477ba0-6e45-4e27-8852-3db5d285036c",
  "state": "PENDING",
  "created_at": "2026-10-28T14:15:59.435708Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/66477ba0-6e45-4e27-8852-3db5d285036c` → **200**

```json
{
  "id": "66477ba0-6e45-4e27-8852-3db5d285036c",
  "state": "PENDING",
  "created_at": "2026-10-28T14:15:59.435708Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/66477ba0-6e45-4e27-8852-3db5d285036c` → **200**

```json
{
  "id": "66477ba0-6e45-4e27-8852-3db5d285036c",
  "state": "PENDING",
  "created_at": "2026-10-28T14:15:59.435708Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/66477ba0-6e45-4e27-8852-3db5d285036c` → **200**

```json
{
  "id": "66477ba0-6e45-4e27-8852-3db5d285036c",
  "state": "READY",
  "created_at": "2026-10-28T14:15:59.435708Z",
  "ready_at": "2026-10-28T14:16:05.962686Z",
  "expires_at": "2026-11-04T14:16:05.962686Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/66477ba0-6e45-4e27-8852-3db5d285036c/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634688132",
  "device_ref": "sandbox-7542"
}
```

```json
{
  "challenge_id": "3a19068a-f4c6-45ee-9a95-163eb052683a",
  "expires_at": "2026-10-28T14:21:06.399165205Z",
  "resend_available_at": "2026-10-28T14:16:07.399165205Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634688132` → **200**

```json
{
  "phone": "+380634688132",
  "audience": "CLIENT",
  "code": "585932",
  "sent_at": "2026-10-28T14:16:06.401841703Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a19068a-f4c6-45ee-9a95-163eb052683a",
  "code": "585932",
  "device_ref": "sandbox-7542"
}
```

```json
{
  "session_id": "6479afc1-9786-42c5-9142-2881714aa915",
  "subject": {
    "type": "CLIENT",
    "id": "37040207-d557-4f3b-9217-ad8ceac894e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzA0MDIwNy1kNTU3LTRmM2ItOTIxNy1hZDhjZWFjODk0ZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODY2LCJpYXQiOjE3OTMxOTY5NjYsImp0aSI6IjkxYmM5OWU4LWY5NmUtNDRmMS1hNTRkLWQwMGRlOWMzMDUxNiIsInNpZCI6IjY0NzlhZmMxLTk3ODYtNDJjNS05MTQyLTI4ODE3MTRhYTkxNSJ9.j1CH05Fi83ZX0-la-euy0aQF3HGZUeqfobTx2UQ0PhE",
  "access_expires_at": "2026-10-28T14:31:06.705554685Z",
  "refresh_token": "zd5P3HsqWam1qPEi_OKYEa5ccHM5XUw2UickrBwPp1U",
  "refresh_expires_at": "2026-11-27T14:16:06.704964921Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/66477ba0-6e45-4e27-8852-3db5d285036c/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/66477ba0-6e45-4e27-8852-3db5d285036c/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7523953b-addd-47ac-a551-05adce3bbc7d"
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
  "session_id": "4b892381-09c4-4b06-b537-c91760b671a3",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4NjcsImlhdCI6MTc5MzE5Njk2NywianRpIjoiZWQwZmRiZDItYTlhMy00MDgwLTkxYWMtYzA2YTgyN2I4ZTNmIiwic2lkIjoiNGI4OTIzODEtMDljNC00YjA2LWI1MzctYzkxNzYwYjY3MWEzIn0.i8LNlRM-YF2Ihv6WLmPMaFwzQkGP1E-N2E6n0hszfOk",
  "access_expires_at": "2026-10-28T14:31:07.595339977Z",
  "refresh_token": "yr2fTiATi6jdly7cPVYJ9VHMrF57z-sAV2ehKxXhFG0",
  "refresh_expires_at": "2026-10-29T02:16:07.594744724Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3240122b-a23a-4524-9d39-bd6edd6dc4fa",
  "session_id": "92562bae-0f3b-4862-b213-7e1228ab3c07",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/3240122b-a23a-4524-9d39-bd6edd6dc4fa/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "66477ba0-6e45-4e27-8852-3db5d285036c",
      "state": "READY",
      "created_at": "2026-10-28T14:15:59.435708Z",
      "ready_at": "2026-10-28T14:16:05.962686Z",
      "expires_at": "2026-11-04T14:16:05.962686Z",
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
  "device_ref": "sandbox-16459"
}
```

```json
{
  "challenge_id": "4915bf0a-e9da-418f-8727-c1101adb30c0",
  "expires_at": "2026-10-28T14:21:08.443642628Z",
  "resend_available_at": "2026-10-28T14:16:09.443642628Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "810385",
  "sent_at": "2026-10-28T14:16:08.446175488Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4915bf0a-e9da-418f-8727-c1101adb30c0",
  "code": "810385",
  "device_ref": "sandbox-16459"
}
```

```json
{
  "session_id": "fe4dad62-179e-4e08-96f3-b3a66f5f5329",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzg2OCwiaWF0IjoxNzkzMTk2OTY4LCJqdGkiOiIyNzIxZWUwZC03NWVjLTQ4NDItODU0Yy0wMGMxZWRjN2E4NTMiLCJzaWQiOiJmZTRkYWQ2Mi0xNzllLTRlMDgtOTZmMy1iM2E2NmY1ZjUzMjkifQ.J0sUTMmphqHGcf3UbX5W397qbqEvDBYzl08RcXDzbjo",
  "access_expires_at": "2026-10-28T14:31:08.748788424Z",
  "refresh_token": "m1LU3kGlu9EqHcVVv5kB3fNaTnktLToQRYq-yHlldIc",
  "refresh_expires_at": "2026-11-27T14:16:08.748227848Z",
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
  "device_ref": "sandbox-12175"
}
```

```json
{
  "challenge_id": "43f24867-9700-494a-9e85-1ab40311be41",
  "expires_at": "2026-10-28T14:21:09.300347666Z",
  "resend_available_at": "2026-10-28T14:16:10.300347666Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "309600",
  "sent_at": "2026-10-28T14:16:09.303062687Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43f24867-9700-494a-9e85-1ab40311be41",
  "code": "309600",
  "device_ref": "sandbox-12175"
}
```

```json
{
  "session_id": "731f42f2-b875-44c1-b333-fd3cfdb4fdba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzg2OSwiaWF0IjoxNzkzMTk2OTY5LCJqdGkiOiI0YTMzZGVmZS1iOTM3LTQyZmMtODIxYi0yYTJkNjk3MTgyNGUiLCJzaWQiOiI3MzFmNDJmMi1iODc1LTQ0YzEtYjMzMy1mZDNjZmRiNGZkYmEifQ.zK-dCX83MiUTqazUK22UeytWW8ELFeQxPNrLavOCNYc",
  "access_expires_at": "2026-10-28T14:31:09.611503814Z",
  "refresh_token": "VwhF4KzKpsshMawjlIMgK74_OIMYNktHkY6XewpEknA",
  "refresh_expires_at": "2026-11-27T14:16:09.610827612Z",
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
  "command_id": "c1e3a0bc-be46-4e57-9b03-5cf41fdacf14",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:10Z",
    "sequence": 1793196970156
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "27161eed-3227-4954-849f-a8b720ac2858",
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
  "last_heartbeat_at": "2026-10-28T14:16:10.17755Z",
  "last_location_at": "2026-10-28T14:16:10.17755Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-26672"
}
```

```json
{
  "challenge_id": "94a72b56-b130-43f9-bfe7-ea7bf5f92198",
  "expires_at": "2026-10-28T14:21:10.467292981Z",
  "resend_available_at": "2026-10-28T14:16:11.467292981Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "419992",
  "sent_at": "2026-10-28T14:16:10.469865044Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94a72b56-b130-43f9-bfe7-ea7bf5f92198",
  "code": "419992",
  "device_ref": "sandbox-26672"
}
```

```json
{
  "session_id": "d12682ce-855f-4312-a289-f4a0342228a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzg3MCwiaWF0IjoxNzkzMTk2OTcwLCJqdGkiOiJkNTcyOTU0ZS1kODBkLTRjODctOWJmYS1iNjgwZTY3YmJlMTMiLCJzaWQiOiJkMTI2ODJjZS04NTVmLTQzMTItYTI4OS1mNGEwMzQyMjI4YTkifQ._8TK3WVzerS5TsyRqGtU0-j8g99tixk5KtWncPwJIZE",
  "access_expires_at": "2026-10-28T14:31:10.781640516Z",
  "refresh_token": "l3OjV-8e5-uycrlkXeOK4v7Rrol6MhnesTJNMpKNCHs",
  "refresh_expires_at": "2026-11-27T14:16:10.781124531Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "890cf188-a361-49f7-bd23-36901c63ce31",
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
  "last_heartbeat_at": "2026-10-28T14:15:00.663311Z",
  "last_location_at": "2026-10-28T14:15:00.663311Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/890cf188-a361-49f7-bd23-36901c63ce31/handover` → **200**

```json
{
  "command_id": "b0e9ec86-4355-451d-b489-5956969b4b9c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "890cf188-a361-49f7-bd23-36901c63ce31",
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
  "last_heartbeat_at": "2026-10-28T14:15:00.663311Z",
  "last_location_at": "2026-10-28T14:15:00.663311Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/890cf188-a361-49f7-bd23-36901c63ce31/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:11Z",
    "sequence": 1793196971627
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "890cf188-a361-49f7-bd23-36901c63ce31",
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
  "last_heartbeat_at": "2026-10-28T14:16:11.647045Z",
  "last_location_at": "2026-10-28T14:16:11.647045Z",
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
  "session_id": "a93ac2d8-1ebc-46da-91b2-3b81c395b005",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4NzIsImlhdCI6MTc5MzE5Njk3MiwianRpIjoiZWE3OGVlNTItYmMxOS00MzRiLTgyOTUtZTc0Y2M1MDZjOTVmIiwic2lkIjoiYTkzYWMyZDgtMWViYy00NmRhLTkxYjItM2I4MWMzOTViMDA1In0.O5S3xuJ9Mqiyx4so8VIobYefPRzZFxZn-28pHtJAF50",
  "access_expires_at": "2026-10-28T14:31:12.240462558Z",
  "refresh_token": "cfdKGyoQtV4Cm6zmPf3_EMKKqlg1zZ7-bSln9PJqX74",
  "refresh_expires_at": "2026-10-29T02:16:12.239954474Z",
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
  "session_id": "210c9e77-002e-4b3c-b7c6-45ec08e64b09",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4NzIsImlhdCI6MTc5MzE5Njk3MiwianRpIjoiNmRiNmRlZDQtOTQzZS00YzdhLWI0OTQtMzU4NDMwYWE4ZDE3Iiwic2lkIjoiMjEwYzllNzctMDAyZS00YjNjLWI3YzYtNDVlYzA4ZTY0YjA5In0.QtlwafVNzIxhYWAk82_JeUzz2D6he98f-HUFh1a3d3M",
  "access_expires_at": "2026-10-28T14:31:12.836281293Z",
  "refresh_token": "no-jmHo5eUBaVLSxh0K3LZZBDmDpSvXl3ggDjl2POnU",
  "refresh_expires_at": "2026-10-29T02:16:12.835623567Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687195827",
  "device_ref": "sandbox-25473"
}
```

```json
{
  "challenge_id": "8f706473-1c4a-4a16-8f2d-8845c5e7abae",
  "expires_at": "2026-10-28T14:21:13.108794065Z",
  "resend_available_at": "2026-10-28T14:16:14.108794065Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380687195827` → **200**

```json
{
  "phone": "+380687195827",
  "audience": "CLIENT",
  "code": "369225",
  "sent_at": "2026-10-28T14:16:13.111426097Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f706473-1c4a-4a16-8f2d-8845c5e7abae",
  "code": "369225",
  "device_ref": "sandbox-25473"
}
```

```json
{
  "session_id": "9e3f0489-a0a8-4536-ac05-abb795ec8159",
  "subject": {
    "type": "CLIENT",
    "id": "2fe1459c-ae41-494d-9155-e60ba346dbe6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmUxNDU5Yy1hZTQxLTQ5NGQtOTE1NS1lNjBiYTM0NmRiZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODczLCJpYXQiOjE3OTMxOTY5NzMsImp0aSI6IjQxNWJhNWRiLTkwMGEtNDY0Ny05YjFlLTJiN2M4MjhhNDNkZiIsInNpZCI6IjllM2YwNDg5LWEwYTgtNDUzNi1hYzA1LWFiYjc5NWVjODE1OSJ9.KPtZY6mJ_y-_D-H2wcDZ66Ux8jAife4xn8hhyQpMJqw",
  "access_expires_at": "2026-10-28T14:31:13.426085986Z",
  "refresh_token": "5_zZHiKrxH13FkmJrQJ3up-DGjRUWnR9zQ-KCEoTz_Y",
  "refresh_expires_at": "2026-11-27T14:16:13.425480778Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "11fe26ad-34a4-4991-8f7a-c3e614d2f400",
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
  "id": "4ad801ea-ca15-42e6-8bb1-97e838746620",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:21:13.704762Z",
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
  "command_id": "0d0af9a9-4030-46da-9f42-0b52d669b3d0",
  "quote_id": "4ad801ea-ca15-42e6-8bb1-97e838746620",
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
  "id": "0f6d1101-512c-45e3-aa02-65ef42b87aea",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2fe1459c-ae41-494d-9155-e60ba346dbe6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:16:13.984047Z",
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
    "id": "1893cdc3-233d-466b-b7da-130da3247215",
    "order_id": "0f6d1101-512c-45e3-aa02-65ef42b87aea",
    "expires_at": "2026-10-28T14:16:28.988034Z",
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

`POST /api/driver/v1/offers/1893cdc3-233d-466b-b7da-130da3247215/reject` → **204**

```json
{
  "command_id": "3ad11a51-f2d4-432a-b758-73507f46d559"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b05a1064-6d57-4c82-bc85-567d5c885ac3",
    "order_id": "0f6d1101-512c-45e3-aa02-65ef42b87aea",
    "expires_at": "2026-10-28T14:16:29.556356Z",
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

`POST /api/driver/v1/offers/b05a1064-6d57-4c82-bc85-567d5c885ac3/accept` → **200**

```json
{
  "command_id": "1c1585a8-c746-4005-ad4c-f1f4be1a5a97"
}
```

```json
{
  "id": "01f37066-4e5b-44d7-a15d-306c16449433",
  "order_id": "0f6d1101-512c-45e3-aa02-65ef42b87aea",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9c6f4b4b-f4a5-49ba-bc38-344c5b35af20",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/0f6d1101-512c-45e3-aa02-65ef42b87aea/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:16:13.984656Z",
      "actor": {
        "type": "CLIENT",
        "id": "2fe1459c-ae41-494d-9155-e60ba346dbe6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0f6d1101-512c-45e3-aa02-65ef42b87aea",
        "quote_id": "4ad801ea-ca15-42e6-8bb1-97e838746620",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "10c2037c-571f-43ac-af74-b7e953ea4124"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:16:13.987107Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0f6d1101-512c-45e3-aa02-65ef42b87aea",
        "attempt_id": "57c4bb20-78fe-4eea-aae7-457122d31d8e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "10c2037c-571f-43ac-af74-b7e953ea4124"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:16:13.995907Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1893cdc3-233d-466b-b7da-130da3247215",
        "order_id": "0f6d1101-512c-45e3-aa02-65ef42b87aea",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "10c2037c-571f-43ac-af74-b7e953ea4124"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T14:16:14.555346Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1893cdc3-233d-466b-b7da-130da3247215",
        "order_id": "0f6d1101-512c-45e3-aa02-65ef42b87aea"
      },
      "correlation_id": "3ce0aeff-0c62-422b-a331-f05238bded9b"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 0f6d1101-512c-45e3-aa02-65ef42b87aea — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/0f6d1101-512c-45e3-aa02-65ef42b87aea` → **200**

```json
{
  "id": "0f6d1101-512c-45e3-aa02-65ef42b87aea",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "2fe1459c-ae41-494d-9155-e60ba346dbe6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "01f37066-4e5b-44d7-a15d-306c16449433",
    "order_id": "0f6d1101-512c-45e3-aa02-65ef42b87aea",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9c6f4b4b-f4a5-49ba-bc38-344c5b35af20",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:16:13.984047Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0f6d1101-512c-45e3-aa02-65ef42b87aea/cancel` → **200**

```json
{
  "command_id": "46b06a0e-97aa-46fd-b15c-8147402749ce",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0f6d1101-512c-45e3-aa02-65ef42b87aea",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2fe1459c-ae41-494d-9155-e60ba346dbe6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "01f37066-4e5b-44d7-a15d-306c16449433",
    "order_id": "0f6d1101-512c-45e3-aa02-65ef42b87aea",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9c6f4b4b-f4a5-49ba-bc38-344c5b35af20",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:16:13.984047Z",
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
  "session_id": "27161eed-3227-4954-849f-a8b720ac2858",
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
  "last_heartbeat_at": "2026-10-28T14:16:10.17755Z",
  "last_location_at": "2026-10-28T14:16:10.17755Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/27161eed-3227-4954-849f-a8b720ac2858/close` → **200**

```json
{
  "command_id": "17bfe479-e2db-4d9b-bcc1-f4a59366a617",
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
  "session_id": "890cf188-a361-49f7-bd23-36901c63ce31",
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
  "last_heartbeat_at": "2026-10-28T14:16:11.647045Z",
  "last_location_at": "2026-10-28T14:16:11.647045Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/890cf188-a361-49f7-bd23-36901c63ce31/close` → **200**

```json
{
  "command_id": "1643a65c-fb9f-4e30-ac84-523b8fe3ba4d",
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
  "device_ref": "sandbox-26195"
}
```

```json
{
  "challenge_id": "dea8efce-e225-4644-897e-f45b94d0eba4",
  "expires_at": "2026-10-28T14:21:17.469528922Z",
  "resend_available_at": "2026-10-28T14:16:18.469528922Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "848113",
  "sent_at": "2026-10-28T14:16:17.471698169Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dea8efce-e225-4644-897e-f45b94d0eba4",
  "code": "848113",
  "device_ref": "sandbox-26195"
}
```

```json
{
  "session_id": "bd86fc7c-ef6b-447b-a4c7-a9863e2a503a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzg3NywiaWF0IjoxNzkzMTk2OTc3LCJqdGkiOiI2MjFmZDAzMC01NzlkLTQ4N2MtYjM3NC0xOTg4NmJjZjViZWQiLCJzaWQiOiJiZDg2ZmM3Yy1lZjZiLTQ0N2ItYTRjNy1hOTg2M2UyYTUwM2EifQ.ekxmrYhZh7wQBhGTIJbCNbz6mq062yLiAa8FG3q01pU",
  "access_expires_at": "2026-10-28T14:31:17.763029448Z",
  "refresh_token": "hEpZMvakfK5BREXcuBpBEO1TTKJ1PfF_2fg36Z7xgqo",
  "refresh_expires_at": "2026-11-27T14:16:17.762449348Z",
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
  "command_id": "18348fa9-2794-42c9-b286-a286b83bb0fc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:18Z",
    "sequence": 1793196978293
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d21d7029-3ae9-4c27-956f-6d2e9197bbce",
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
  "last_heartbeat_at": "2026-10-28T14:16:18.312214Z",
  "last_location_at": "2026-10-28T14:16:18.312214Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670652567",
  "device_ref": "sandbox-8279"
}
```

```json
{
  "challenge_id": "521a5680-25ee-43ed-ac0f-003b58fd35d4",
  "expires_at": "2026-10-28T14:21:18.586879609Z",
  "resend_available_at": "2026-10-28T14:16:19.586879609Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670652567` → **200**

```json
{
  "phone": "+380670652567",
  "audience": "CLIENT",
  "code": "388550",
  "sent_at": "2026-10-28T14:16:18.589556788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "521a5680-25ee-43ed-ac0f-003b58fd35d4",
  "code": "388550",
  "device_ref": "sandbox-8279"
}
```

```json
{
  "session_id": "485fd1e1-d088-4866-bc3c-d688ad0117f8",
  "subject": {
    "type": "CLIENT",
    "id": "335066fb-47f0-4160-9f96-9c03f6ba43e0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMzUwNjZmYi00N2YwLTQxNjAtOWY5Ni05YzAzZjZiYTQzZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODc4LCJpYXQiOjE3OTMxOTY5NzgsImp0aSI6IjA3YWNlMWI1LThkZTMtNGUxNy05YmVlLTJhODc3YTdhOTNhNCIsInNpZCI6IjQ4NWZkMWUxLWQwODgtNDg2Ni1iYzNjLWQ2ODhhZDAxMTdmOCJ9.hNHoh5JUgai8e3pgYGMzweLvCIe7XpDSUdYFHqnuXK0",
  "access_expires_at": "2026-10-28T14:31:18.89396638Z",
  "refresh_token": "4cfeF5xoblTPmGCnRgZbrEeq6hrK0R414TLnr_4bROQ",
  "refresh_expires_at": "2026-11-27T14:16:18.893357132Z",
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
  "command_id": "c7d66d7c-b8dd-4c20-8783-f7494942251b",
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
  "id": "2e66c13a-7247-4871-9900-49bcc48dde2e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:21:19.432805Z",
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
  "command_id": "0711ad23-e931-4c9f-b35d-3dcce115b1d7",
  "platform": "ANDROID",
  "token": "sandbox-driver-b415ea63-23bb-41df-b11d-85beabd84de8"
}
```

```json
{
  "id": "d3e696cf-986a-4f46-a770-82389f7e7379",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:16:19.719974Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "00e65668-cd2f-4b17-9c3a-b016e87cca38",
  "platform": "ANDROID",
  "token": "sandbox-rider-684595c2-c9a8-48b6-b9ea-fcaa79bfcacc"
}
```

```json
{
  "id": "b8f1b7b9-2712-45dc-9d72-3792ecefde5a",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:16:19.99507Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "36b56e77-f95a-4a86-a6e0-66e5d79de65b",
  "quote_id": "2e66c13a-7247-4871-9900-49bcc48dde2e",
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
  "id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "335066fb-47f0-4160-9f96-9c03f6ba43e0",
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
  "created_at": "2026-10-28T14:16:20.279209Z",
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
    "id": "45effdb5-93f9-46ae-9683-fd2eb68b34ff",
    "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
    "expires_at": "2026-10-28T14:16:35.282834Z",
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

`POST /api/driver/v1/offers/45effdb5-93f9-46ae-9683-fd2eb68b34ff/accept` → **200**

```json
{
  "command_id": "3eca6296-bc84-4119-b40a-42f927f7a78c"
}
```

```json
{
  "id": "9bb3f878-f705-411b-8313-c5fa51ceec63",
  "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "465fb3d7-dc47-49fd-861b-881a7783a41c",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:16:20.253Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:16:20.253Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:16:21.369992488Z",
    "token_suffix": "d84de8",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "5e2ec138-0dae-474a-bb75-c55f5bb6abc7",
      "order_version": "2",
      "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380670652567&after=2026-10-28T14:16:20.253Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380670652567&after=2026-10-28T14:16:20.253Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:16:22.374261271Z",
    "token_suffix": "bfcacc",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "58527405-e3fd-4414-b3f4-a20835cbdaee",
      "order_version": "3",
      "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/2892dadb-0473-4d14-ae61-acf39c103aa6/messages` → **201**

```json
{
  "command_id": "1b421cfd-fa3c-4b4d-9035-7257b551b13d",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "12fd0000-0b55-40ea-9d3a-53bec1fc2b5b",
  "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T14:16:23.248777717Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "465fb3d7-dc47-49fd-861b-881a7783a41c",
  "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
  "assignment_id": "9bb3f878-f705-411b-8313-c5fa51ceec63",
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

`POST /api/driver/v1/trips/465fb3d7-dc47-49fd-861b-881a7783a41c/messages` → **201**

```json
{
  "command_id": "13b1ee94-a647-4272-8786-5d363a8309f2",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "f8233080-1207-47f2-81b7-1e1dec1ed683",
  "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T14:16:23.784415121Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/2892dadb-0473-4d14-ae61-acf39c103aa6/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/465fb3d7-dc47-49fd-861b-881a7783a41c/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670652567"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/d21d7029-3ae9-4c27-956f-6d2e9197bbce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:24Z",
    "sequence": 1793196984567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d21d7029-3ae9-4c27-956f-6d2e9197bbce",
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
  "last_heartbeat_at": "2026-10-28T14:16:24.58826Z",
  "last_location_at": "2026-10-28T14:16:24.58826Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "465fb3d7-dc47-49fd-861b-881a7783a41c",
  "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
  "assignment_id": "9bb3f878-f705-411b-8313-c5fa51ceec63",
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

`POST /api/driver/v1/trips/465fb3d7-dc47-49fd-861b-881a7783a41c/arrive` → **200**

```json
{
  "command_id": "51473ecc-4282-467b-9003-41328328ce41",
  "expected_version": 0
}
```

```json
{
  "id": "465fb3d7-dc47-49fd-861b-881a7783a41c",
  "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
  "assignment_id": "9bb3f878-f705-411b-8313-c5fa51ceec63",
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
  "arrived_at": "2026-10-28T14:16:25.132197Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/465fb3d7-dc47-49fd-861b-881a7783a41c/start` → **200**

```json
{
  "command_id": "140f74ac-d943-4de3-9a93-a81909ba754c",
  "expected_version": 1
}
```

```json
{
  "id": "465fb3d7-dc47-49fd-861b-881a7783a41c",
  "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
  "assignment_id": "9bb3f878-f705-411b-8313-c5fa51ceec63",
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
  "arrived_at": "2026-10-28T14:16:25.132197Z",
  "started_at": "2026-10-28T14:16:25.41273Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d21d7029-3ae9-4c27-956f-6d2e9197bbce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:25Z",
    "sequence": 1793196985686
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d21d7029-3ae9-4c27-956f-6d2e9197bbce",
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
  "last_heartbeat_at": "2026-10-28T14:16:25.706357Z",
  "last_location_at": "2026-10-28T14:16:25.706357Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/465fb3d7-dc47-49fd-861b-881a7783a41c/complete` → **200**

```json
{
  "command_id": "ba7be923-2887-4177-be06-9332d14ef362",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:16:25Z",
  "cash_received": true
}
```

```json
{
  "id": "465fb3d7-dc47-49fd-861b-881a7783a41c",
  "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
  "assignment_id": "9bb3f878-f705-411b-8313-c5fa51ceec63",
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
  "arrived_at": "2026-10-28T14:16:25.132197Z",
  "started_at": "2026-10-28T14:16:25.41273Z",
  "completed_at": "2026-10-28T14:16:25.988496Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/2892dadb-0473-4d14-ae61-acf39c103aa6` → **200**

```json
{
  "id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "335066fb-47f0-4160-9f96-9c03f6ba43e0",
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
    "id": "9bb3f878-f705-411b-8313-c5fa51ceec63",
    "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "465fb3d7-dc47-49fd-861b-881a7783a41c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:16:20.279209Z",
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
    "id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:16:20.279209Z",
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
    "id": "465fb3d7-dc47-49fd-861b-881a7783a41c",
    "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
    "order_short_number": 9,
    "created_at": "2026-10-28T14:16:20.848717Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "08551cfc-4541-4d79-a2c7-433d62af1bc6",
    "order_id": "2c9bc5c7-621d-4368-9b21-fd98b5d4f634",
    "order_short_number": 2,
    "created_at": "2026-10-28T14:14:49.519452Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "ec514ed4-49d4-496d-8ab2-8aa397242998",
    "order_id": "2666f1c9-a2ba-42ca-b734-50f01cdb4315",
    "order_short_number": 1,
    "created_at": "2026-10-28T14:14:30.434552Z",
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

`GET /api/rider/v1/orders/2892dadb-0473-4d14-ae61-acf39c103aa6/tip` → **200**

```json
{
  "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
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
  "available_until": "2026-10-29T14:16:25.988496Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/2892dadb-0473-4d14-ae61-acf39c103aa6/tip` → **201**

```json
{
  "command_id": "ccde5565-a39f-40b2-833a-0b0d1cfcb8b6",
  "amount_minor": 1100
}
```

```json
{
  "id": "b74824bf-6e7d-42c2-9a85-1571ecbdfefe",
  "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T14:16:30.92508Z"
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
  "session_id": "2bf94dfb-67c3-4cd7-a61d-a97c016d056c",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4OTEsImlhdCI6MTc5MzE5Njk5MSwianRpIjoiYjdiYzBiYjUtNmFlOS00NmQ2LTk1ZmItZmI3MjIyMGIxNzY2Iiwic2lkIjoiMmJmOTRkZmItNjdjMy00Y2Q3LWE2MWQtYTk3YzAxNmQwNTZjIn0.h5ZSyb4cM0nYtKu0K8e8p2W_ELtAytj-VjwbSsAmpFA",
  "access_expires_at": "2026-10-28T14:31:31.540847767Z",
  "refresh_token": "IGxdMNMlwEzlnE4akBplrcCuKq3VINOzKVKVZ7_pVBQ",
  "refresh_expires_at": "2026-10-29T02:16:31.540360349Z",
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
          "RIDER": 2,
          "STAFF": 1,
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
      "PHONE": 1,
      "APP": 8
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 8
    },
    "cancelled_by": {
      "RIDER": 2,
      "STAFF": 1,
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
  "generated_at": "2026-10-28T14:16:31.809080671Z"
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
  "generated_at": "2026-10-28T14:16:32.087815546Z"
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
  "session_id": "6d93e8e3-ac41-4b79-9f3d-c48267c6532e",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4OTIsImlhdCI6MTc5MzE5Njk5MiwianRpIjoiMzc0MjUxNzMtNDg5Yi00OWVkLWI1MTYtYWJjY2U0ZGM4ZWRhIiwic2lkIjoiNmQ5M2U4ZTMtYWM0MS00Yjc5LTlmM2QtYzQ4MjY3YzY1MzJlIn0.ryMkUmnsuCjGEoccvijv3M5bVTxz5wa-QFbF5ya-uko",
  "access_expires_at": "2026-10-28T14:31:32.692593248Z",
  "refresh_token": "4QXJMaERof_txKE-_mwHSdcGDtwbVwG-IGUwwos56BI",
  "refresh_expires_at": "2026-10-29T02:16:32.69208906Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2892dadb-0473-4d14-ae61-acf39c103aa6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:16:20.279765Z",
      "actor": {
        "type": "CLIENT",
        "id": "335066fb-47f0-4160-9f96-9c03f6ba43e0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
        "quote_id": "2e66c13a-7247-4871-9900-49bcc48dde2e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f6e33770-ded9-4a25-91a9-616ff1978006"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:16:20.282064Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
        "attempt_id": "febee0ee-8509-4ed5-ab73-377d2e4e18e0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f6e33770-ded9-4a25-91a9-616ff1978006"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:16:20.288502Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "45effdb5-93f9-46ae-9683-fd2eb68b34ff",
        "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "f6e33770-ded9-4a25-91a9-616ff1978006"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:16:20.850346Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "45effdb5-93f9-46ae-9683-fd2eb68b34ff",
        "order_id": "2892dadb-0473-4d14-ae61-acf39c103aa6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "9bb3f878-f705-411b-8313-c5fa51ceec63"
      },
      "correlation_id": "39a59a7d-6d85-4bea-92b3-6f2fe29dc728"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T14:16:33.241496796Z",
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
      "last_location_at": "2026-10-28T14:16:25.706357Z",
      "order_id": null
    }
  ]
}
```

Done: order 2892dadb-0473-4d14-ae61-acf39c103aa6.

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
  "session_id": "49c4b43f-9407-4b04-918d-a60d59adf0d2",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4OTMsImlhdCI6MTc5MzE5Njk5MywianRpIjoiZjdiNDRhZmYtM2FkNy00YWU5LWJmYTctOWZiNTU1ODIyNzY4Iiwic2lkIjoiNDljNGI0M2YtOTQwNy00YjA0LTkxOGQtYTYwZDU5YWRmMGQyIn0.z917-vJyqbBxUZ_MKzyHnWqDJfywKECIAJnd3PvNZiA",
  "access_expires_at": "2026-10-28T14:31:33.860359049Z",
  "refresh_token": "lv4vTcFOPrjrCjiIQh26wStM5Y2kKxVaIvfeCOLqpZM",
  "refresh_expires_at": "2026-10-29T02:16:33.859775413Z",
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
  "command_id": "d443db0e-23ca-4ad1-bdba-e952a8d9e828",
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
  "timestamp": "2026-10-28T14:16:34.000+0000",
  "channel": {
    "id": "1730052000.1964710271",
    "linkedid": "1730052000.1964710271",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671605679"
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
  "timestamp": "2026-10-28T14:16:34.000+0000",
  "channel": {
    "id": "1730052000.1964710271",
    "linkedid": "1730052000.1964710271",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671605679"
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
  "session_id": "3901705e-64cc-4937-b3ad-743bd16d7712",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4OTUsImlhdCI6MTc5MzE5Njk5NSwianRpIjoiNzM2NTY0ZGMtMzI2OS00Nzc4LTgyZjktZTQwMGMzMWI2Y2MzIiwic2lkIjoiMzkwMTcwNWUtNjRjYy00OTM3LWIzYWQtNzQzYmQxNmQ3NzEyIn0.NvGKyE0DIOXq1AiH3xo15c-KIgxUIufRtqJJomuV2fI",
  "access_expires_at": "2026-10-28T14:31:35.035280984Z",
  "refresh_token": "nmqoUFTwyQ7N4kkMSU1fD17LhE1f6Tlne7hDIg3UQQM",
  "refresh_expires_at": "2026-10-29T02:16:35.034715991Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "1e365e88-422b-48ef-a021-969b140d84f6",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671605679",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:16:34Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/1e365e88-422b-48ef-a021-969b140d84f6/answer` → **200**

```json
{
  "command_id": "2aa77c34-70e4-427e-b44b-9dc42b0520ab"
}
```

```json
{
  "id": "1e365e88-422b-48ef-a021-969b140d84f6",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671605679",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "order_ids": [],
  "started_at": "2026-10-28T14:16:34Z",
  "answered_at": "2026-10-28T14:16:35.580013Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1964710271",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "fa9ad8e7-3cdb-4fb8-9890-4941f456ee3c",
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
  "id": "40c3131e-2dd8-4cbc-baf8-45ae30ccdc38",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:21:35.886096Z",
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
  "command_id": "5f4fad11-2757-47df-b6b4-5110ca6277a6",
  "quote_id": "40c3131e-2dd8-4cbc-baf8-45ae30ccdc38",
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
    "phone": "+380671605679"
  },
  "call_id": "1e365e88-422b-48ef-a021-969b140d84f6"
}
```

```json
{
  "id": "dd4c3d4f-a687-482b-8b02-f739913710c4",
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
  "created_at": "2026-10-28T14:16:36.173976Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671605679"
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
    "id": "1730052000.1964710271",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "1e365e88-422b-48ef-a021-969b140d84f6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671605679",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_ids": [
        "dd4c3d4f-a687-482b-8b02-f739913710c4"
      ],
      "started_at": "2026-10-28T14:16:34Z",
      "answered_at": "2026-10-28T14:16:35.580013Z",
      "ended_at": "2026-10-28T14:16:36.48471Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "d29d779e-22ce-490f-aaf6-44f5a2cc8bb7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678502533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_ids": [],
      "started_at": "2026-10-28T14:14:38.490868Z",
      "answered_at": "2026-10-28T14:14:38.800489Z",
      "ended_at": "2026-10-28T14:14:39.099605Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:14:45.954203Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/dd4c3d4f-a687-482b-8b02-f739913710c4` → **200**

```json
{
  "id": "dd4c3d4f-a687-482b-8b02-f739913710c4",
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
  "created_at": "2026-10-28T14:16:36.173976Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671605679"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/dd4c3d4f-a687-482b-8b02-f739913710c4` → **200**

```json
{
  "id": "dd4c3d4f-a687-482b-8b02-f739913710c4",
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
  "created_at": "2026-10-28T14:16:36.173976Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671605679"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dd4c3d4f-a687-482b-8b02-f739913710c4/cancel` → **200**

```json
{
  "command_id": "b678ff93-aa7d-436b-882b-baa85802d924",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "dd4c3d4f-a687-482b-8b02-f739913710c4",
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
  "created_at": "2026-10-28T14:16:36.173976Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671605679"
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

Done: call 1e365e88-422b-48ef-a021-969b140d84f6 with order dd4c3d4f-a687-482b-8b02-f739913710c4.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-957"
}
```

```json
{
  "challenge_id": "022aac4d-471d-4e7a-b4e2-826c1015e689",
  "expires_at": "2026-10-28T14:21:37.661281622Z",
  "resend_available_at": "2026-10-28T14:16:38.661281622Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "560994",
  "sent_at": "2026-10-28T14:16:37.66354433Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "022aac4d-471d-4e7a-b4e2-826c1015e689",
  "code": "560994",
  "device_ref": "sandbox-957"
}
```

```json
{
  "session_id": "42c71433-47ef-4a1d-8ac6-d4b11fc82b35",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzg5NywiaWF0IjoxNzkzMTk2OTk3LCJqdGkiOiI4YjEzOTRiNC02MjQ4LTQxOTctOWEzNS0wM2NkMTZmNWM5Y2UiLCJzaWQiOiI0MmM3MTQzMy00N2VmLTRhMWQtOGFjNi1kNGIxMWZjODJiMzUifQ.bMeZfG2Xnk5YQZQJIhqPPsSI7Byjcqol_tbeBbIqU8I",
  "access_expires_at": "2026-10-28T14:31:37.968678177Z",
  "refresh_token": "efM0H1gc-sN3f9MjYJJ2lB0pcjk2aHwZvFKAVhq_Cuc",
  "refresh_expires_at": "2026-11-27T14:16:37.968154275Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d21d7029-3ae9-4c27-956f-6d2e9197bbce",
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
  "last_heartbeat_at": "2026-10-28T14:16:25.706357Z",
  "last_location_at": "2026-10-28T14:16:25.706357Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d21d7029-3ae9-4c27-956f-6d2e9197bbce/handover` → **200**

```json
{
  "command_id": "273a8777-e053-4351-bf31-5b4dde006497",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d21d7029-3ae9-4c27-956f-6d2e9197bbce",
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
  "last_heartbeat_at": "2026-10-28T14:16:25.706357Z",
  "last_location_at": "2026-10-28T14:16:25.706357Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d21d7029-3ae9-4c27-956f-6d2e9197bbce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:38Z",
    "sequence": 1793196998794
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d21d7029-3ae9-4c27-956f-6d2e9197bbce",
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
  "last_heartbeat_at": "2026-10-28T14:16:38.814749Z",
  "last_location_at": "2026-10-28T14:16:38.814749Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661183905",
  "device_ref": "sandbox-10214"
}
```

```json
{
  "challenge_id": "1ad166b8-c8da-4dfa-8324-aa88f5befa5e",
  "expires_at": "2026-10-28T14:21:39.080037434Z",
  "resend_available_at": "2026-10-28T14:16:40.080037434Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661183905` → **200**

```json
{
  "phone": "+380661183905",
  "audience": "CLIENT",
  "code": "012673",
  "sent_at": "2026-10-28T14:16:39.082418989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ad166b8-c8da-4dfa-8324-aa88f5befa5e",
  "code": "012673",
  "device_ref": "sandbox-10214"
}
```

```json
{
  "session_id": "463b7f95-f5f2-4936-bb36-32dbb414637c",
  "subject": {
    "type": "CLIENT",
    "id": "48685bab-e2fe-4e36-bed5-07eb13e81ddf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODY4NWJhYi1lMmZlLTRlMzYtYmVkNS0wN2ViMTNlODFkZGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODk5LCJpYXQiOjE3OTMxOTY5OTksImp0aSI6ImIzNGE4OWQ5LTI2OWQtNDc2ZS05ZjEyLWI4YzcxYTJkMjZlZiIsInNpZCI6IjQ2M2I3Zjk1LWY1ZjItNDkzNi1iYjM2LTMyZGJiNDE0NjM3YyJ9.TfL13tTfq9GITcnRTVeKk27Z4QJQnyi6m7w-7TghEow",
  "access_expires_at": "2026-10-28T14:31:39.374022539Z",
  "refresh_token": "BaQmTs_0pLHI0GkLJlavAouOEdUoojLSBmWBouvTmig",
  "refresh_expires_at": "2026-11-27T14:16:39.373475395Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "21835072-b7f0-4f1a-8226-effbb41d0d21",
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
  "id": "1c4d004f-ad4b-4c4d-8fc0-48ebec611e7e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:21:39.650353Z",
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
  "command_id": "01daac7f-d80c-478c-b2ab-788f6712245f",
  "quote_id": "1c4d004f-ad4b-4c4d-8fc0-48ebec611e7e",
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
  "id": "adfa742e-bad6-4359-a18d-02e3804856a6",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "48685bab-e2fe-4e36-bed5-07eb13e81ddf",
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
  "created_at": "2026-10-28T14:16:39.926613Z",
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
    "id": "d7487d75-5fc2-4115-bfa8-ddd9b7e7fa5a",
    "order_id": "adfa742e-bad6-4359-a18d-02e3804856a6",
    "expires_at": "2026-10-28T14:16:54.929551Z",
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

`POST /api/driver/v1/offers/d7487d75-5fc2-4115-bfa8-ddd9b7e7fa5a/accept` → **200**

```json
{
  "command_id": "e0bdfa91-281e-45bb-8e54-89f7cacd0ca5"
}
```

```json
{
  "id": "4f5de468-b182-4fa6-a716-e1c03fcdf8a6",
  "order_id": "adfa742e-bad6-4359-a18d-02e3804856a6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bb3f5a18-b09a-4865-be72-b50e2350de25",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bb3f5a18-b09a-4865-be72-b50e2350de25",
  "order_id": "adfa742e-bad6-4359-a18d-02e3804856a6",
  "assignment_id": "4f5de468-b182-4fa6-a716-e1c03fcdf8a6",
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

`POST /api/driver/v1/work-sessions/d21d7029-3ae9-4c27-956f-6d2e9197bbce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:41Z",
    "sequence": 1793197001494
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d21d7029-3ae9-4c27-956f-6d2e9197bbce",
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
  "last_heartbeat_at": "2026-10-28T14:16:41.024808Z",
  "last_location_at": "2026-10-28T14:16:41.024808Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bb3f5a18-b09a-4865-be72-b50e2350de25/arrive` → **200**

```json
{
  "command_id": "b28255a0-a51e-4fb2-b9d8-c16ac403c3b1",
  "expected_version": 0
}
```

```json
{
  "id": "bb3f5a18-b09a-4865-be72-b50e2350de25",
  "order_id": "adfa742e-bad6-4359-a18d-02e3804856a6",
  "assignment_id": "4f5de468-b182-4fa6-a716-e1c03fcdf8a6",
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
  "arrived_at": "2026-10-28T14:16:41.3045Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bb3f5a18-b09a-4865-be72-b50e2350de25/start` → **200**

```json
{
  "command_id": "92a73e69-f3a8-4f9f-bcc1-e8329d61cc94",
  "expected_version": 1
}
```

```json
{
  "id": "bb3f5a18-b09a-4865-be72-b50e2350de25",
  "order_id": "adfa742e-bad6-4359-a18d-02e3804856a6",
  "assignment_id": "4f5de468-b182-4fa6-a716-e1c03fcdf8a6",
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
  "arrived_at": "2026-10-28T14:16:41.3045Z",
  "started_at": "2026-10-28T14:16:41.596766Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/d21d7029-3ae9-4c27-956f-6d2e9197bbce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:41Z",
    "sequence": 1793197001868
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d21d7029-3ae9-4c27-956f-6d2e9197bbce",
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
  "last_heartbeat_at": "2026-10-28T14:16:41.887478Z",
  "last_location_at": "2026-10-28T14:16:41.887478Z",
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
  "device_ref": "sandbox-11146"
}
```

```json
{
  "challenge_id": "7f87430c-2692-4877-9543-7ee8a0e06012",
  "expires_at": "2026-10-28T14:21:42.15377031Z",
  "resend_available_at": "2026-10-28T14:16:43.15377031Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "966039",
  "sent_at": "2026-10-28T14:16:42.156806781Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f87430c-2692-4877-9543-7ee8a0e06012",
  "code": "966039",
  "device_ref": "sandbox-11146"
}
```

```json
{
  "session_id": "4496f9b1-9f4f-44a2-9506-b45c8fd9e7ef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzkwMiwiaWF0IjoxNzkzMTk3MDAyLCJqdGkiOiI1ODhjNmY3NS05MzQxLTQ4NDgtOTAwYy0yYzg4ZjM3MDdhNWEiLCJzaWQiOiI0NDk2ZjliMS05ZjRmLTQ0YTItOTUwNi1iNDVjOGZkOWU3ZWYifQ.UpYXZfftZco44WVvNBSKMOXcnwKIQ2SrIZsY3bMXaG8",
  "access_expires_at": "2026-10-28T14:31:42.465378735Z",
  "refresh_token": "STWck8BuZ4x4H9I0kfPT5OP-NQdS8Agg1i0B8i2KdCw",
  "refresh_expires_at": "2026-11-27T14:16:42.464762928Z",
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
  "command_id": "9ee055e8-4438-4332-a501-6fcaeee6f057",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:42Z",
    "sequence": 1793197003254
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "289d9b56-4f7a-4e63-b514-36741f335313",
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
  "last_heartbeat_at": "2026-10-28T14:16:43.021201Z",
  "last_location_at": "2026-10-28T14:16:43.021201Z",
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
  "session_id": "4b377b63-7d43-447c-8ae0-5a6837dcb12c",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MDMsImlhdCI6MTc5MzE5NzAwMywianRpIjoiNzJhMmM4ZjctMzkwNy00YjkzLThmZmMtZGQ3NzVhY2E3NjIxIiwic2lkIjoiNGIzNzdiNjMtN2Q0My00NDdjLThhZTAtNWE2ODM3ZGNiMTJjIn0.93FbrWzBWz1NxuBZjfO18OkyiQgAST6KPNtV5_maTTc",
  "access_expires_at": "2026-10-28T14:31:43.624872874Z",
  "refresh_token": "ZFGkO-eL5PKJqkNNNT_CvDkDFZ61JrCDSMYtJ1HcWog",
  "refresh_expires_at": "2026-10-29T02:16:43.624390127Z",
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
  "session_id": "f6deeba7-9b30-44be-ba58-3e2f6c94fc67",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MDQsImlhdCI6MTc5MzE5NzAwNCwianRpIjoiMjg4ZTZhMzctNjA0ZS00MzBjLWI2NjItZTAxZDYzZGJjZGIzIiwic2lkIjoiZjZkZWViYTctOWIzMC00NGJlLWJhNTgtM2UyZjZjOTRmYzY3In0.4fINRjRdApqf7wA6VKYVhE52yTGsSsiJOJvoN_4Ye2k",
  "access_expires_at": "2026-10-28T14:31:44.221270218Z",
  "refresh_token": "07nSfjVGYntCPbX62zBa6kCPFGurqR15DTTvyba5wX0",
  "refresh_expires_at": "2026-10-29T02:16:44.220754873Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/adfa742e-bad6-4359-a18d-02e3804856a6` → **200**

```json
{
  "id": "adfa742e-bad6-4359-a18d-02e3804856a6",
  "short_number": 11,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "48685bab-e2fe-4e36-bed5-07eb13e81ddf",
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
    "id": "4f5de468-b182-4fa6-a716-e1c03fcdf8a6",
    "order_id": "adfa742e-bad6-4359-a18d-02e3804856a6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "bb3f5a18-b09a-4865-be72-b50e2350de25",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T14:16:39.926613Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/adfa742e-bad6-4359-a18d-02e3804856a6/interrupt` → **200**

```json
{
  "command_id": "8ed569ee-5ff7-4e50-9cd6-51d254e2ebad",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "adfa742e-bad6-4359-a18d-02e3804856a6",
    "short_number": 11,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "48685bab-e2fe-4e36-bed5-07eb13e81ddf",
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
      "id": "4f5de468-b182-4fa6-a716-e1c03fcdf8a6",
      "order_id": "adfa742e-bad6-4359-a18d-02e3804856a6",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "bb3f5a18-b09a-4865-be72-b50e2350de25",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T14:16:39.926613Z",
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
    "id": "dfe78ac5-d045-4307-a4ac-d26daadf6ce4",
    "short_number": 12,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "48685bab-e2fe-4e36-bed5-07eb13e81ddf",
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
    "id": "8d213dbd-f69b-45e4-9376-478ce9d1b808",
    "order_id": "dfe78ac5-d045-4307-a4ac-d26daadf6ce4",
    "expires_at": "2026-10-28T14:16:59.79814Z",
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

`POST /api/driver/v1/offers/8d213dbd-f69b-45e4-9376-478ce9d1b808/accept` → **200**

```json
{
  "command_id": "b8e5ad0c-f513-4c48-83d0-f0b4a4e13b28"
}
```

```json
{
  "id": "7cc685dd-44f8-47fb-94fb-2b2c29df8dea",
  "order_id": "dfe78ac5-d045-4307-a4ac-d26daadf6ce4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2f0e0909-93cd-42a0-8660-4ddbee9605b6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2f0e0909-93cd-42a0-8660-4ddbee9605b6",
  "order_id": "dfe78ac5-d045-4307-a4ac-d26daadf6ce4",
  "assignment_id": "7cc685dd-44f8-47fb-94fb-2b2c29df8dea",
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
  "session_id": "289d9b56-4f7a-4e63-b514-36741f335313",
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
  "last_heartbeat_at": "2026-10-28T14:16:43.021201Z",
  "last_location_at": "2026-10-28T14:16:43.021201Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/289d9b56-4f7a-4e63-b514-36741f335313/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:46Z",
    "sequence": 1793197006204
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "289d9b56-4f7a-4e63-b514-36741f335313",
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
  "last_heartbeat_at": "2026-10-28T14:16:46.223768Z",
  "last_location_at": "2026-10-28T14:16:46.223768Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2f0e0909-93cd-42a0-8660-4ddbee9605b6/arrive` → **200**

```json
{
  "command_id": "6e589964-d5a1-4ac5-b97e-a18162fc4179",
  "expected_version": 0
}
```

```json
{
  "id": "2f0e0909-93cd-42a0-8660-4ddbee9605b6",
  "order_id": "dfe78ac5-d045-4307-a4ac-d26daadf6ce4",
  "assignment_id": "7cc685dd-44f8-47fb-94fb-2b2c29df8dea",
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
  "arrived_at": "2026-10-28T14:16:46.512812Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2f0e0909-93cd-42a0-8660-4ddbee9605b6/start` → **200**

```json
{
  "command_id": "610af39b-1024-44a5-bfed-f64d8dd02b74",
  "expected_version": 1
}
```

```json
{
  "id": "2f0e0909-93cd-42a0-8660-4ddbee9605b6",
  "order_id": "dfe78ac5-d045-4307-a4ac-d26daadf6ce4",
  "assignment_id": "7cc685dd-44f8-47fb-94fb-2b2c29df8dea",
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
  "arrived_at": "2026-10-28T14:16:46.512812Z",
  "started_at": "2026-10-28T14:16:46.799595Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2f0e0909-93cd-42a0-8660-4ddbee9605b6/complete` → **200**

```json
{
  "command_id": "648167bd-6fc5-49ce-912f-36597c3aa535",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:16:47Z"
}
```

```json
{
  "id": "2f0e0909-93cd-42a0-8660-4ddbee9605b6",
  "order_id": "dfe78ac5-d045-4307-a4ac-d26daadf6ce4",
  "assignment_id": "7cc685dd-44f8-47fb-94fb-2b2c29df8dea",
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
  "arrived_at": "2026-10-28T14:16:46.512812Z",
  "started_at": "2026-10-28T14:16:46.799595Z",
  "completed_at": "2026-10-28T14:16:47.090713Z",
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
    "id": "dfe78ac5-d045-4307-a4ac-d26daadf6ce4",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:16:44.789024Z",
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
    "id": "adfa742e-bad6-4359-a18d-02e3804856a6",
    "short_number": 11,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:16:39.926613Z",
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

`GET /api/operator/v1/orders/adfa742e-bad6-4359-a18d-02e3804856a6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:16:39.927096Z",
      "actor": {
        "type": "CLIENT",
        "id": "48685bab-e2fe-4e36-bed5-07eb13e81ddf",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "adfa742e-bad6-4359-a18d-02e3804856a6",
        "quote_id": "1c4d004f-ad4b-4c4d-8fc0-48ebec611e7e",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "0e152edc-e6ea-4f20-9761-fbbabd23a6da"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:16:39.928855Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "adfa742e-bad6-4359-a18d-02e3804856a6",
        "attempt_id": "d7f7df29-c765-4e29-9ed5-e5b35a8cf308",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0e152edc-e6ea-4f20-9761-fbbabd23a6da"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:16:39.931455Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d7487d75-5fc2-4115-bfa8-ddd9b7e7fa5a",
        "order_id": "adfa742e-bad6-4359-a18d-02e3804856a6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "0e152edc-e6ea-4f20-9761-fbbabd23a6da"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:16:40.48064Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d7487d75-5fc2-4115-bfa8-ddd9b7e7fa5a",
        "order_id": "adfa742e-bad6-4359-a18d-02e3804856a6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "4f5de468-b182-4fa6-a716-e1c03fcdf8a6"
      },
      "correlation_id": "d2dff6d4-8b54-4917-86c9-9c2ae1d8bd56"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/dfe78ac5-d045-4307-a4ac-d26daadf6ce4/tip` → **200**

```json
{
  "order_id": "dfe78ac5-d045-4307-a4ac-d26daadf6ce4",
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
  "available_until": "2026-10-29T14:16:47.090713Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/dfe78ac5-d045-4307-a4ac-d26daadf6ce4/tip` → **409**

```json
{
  "command_id": "d1467664-6cf8-494a-a084-863c6f7391db",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/dfe78ac5-d045-4307-a4ac-d26daadf6ce4/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8e4aff05-d097-4348-8d9c-7b1596a327b2"
}
```

Done: interrupted adfa742e-bad6-4359-a18d-02e3804856a6, follow-up dfe78ac5-d045-4307-a4ac-d26daadf6ce4.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d21d7029-3ae9-4c27-956f-6d2e9197bbce",
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
  "last_heartbeat_at": "2026-10-28T14:16:41.887478Z",
  "last_location_at": "2026-10-28T14:16:41.887478Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d21d7029-3ae9-4c27-956f-6d2e9197bbce/close` → **200**

```json
{
  "command_id": "e20cbffe-f23f-44da-874c-6af727a67e5c",
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
  "session_id": "289d9b56-4f7a-4e63-b514-36741f335313",
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
  "last_heartbeat_at": "2026-10-28T14:16:46.223768Z",
  "last_location_at": "2026-10-28T14:16:46.223768Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/289d9b56-4f7a-4e63-b514-36741f335313/close` → **200**

```json
{
  "command_id": "0985d579-07d4-4cd4-8a21-8c605cf918bd",
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
  "session_id": "ffefc603-aa5a-446b-9112-24f096e70872",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MTMsImlhdCI6MTc5MzE5NzAxMywianRpIjoiYWZlYmQ5MmUtMTA4YS00MDk4LTgxYWItMTc5Y2I1OTBmZGIxIiwic2lkIjoiZmZlZmM2MDMtYWE1YS00NDZiLTkxMTItMjRmMDk2ZTcwODcyIn0.zgpomv23XU6uHz8nzEBzDUDE8cShY1HT9VJXSqjBiBQ",
  "access_expires_at": "2026-10-28T14:31:53.175643894Z",
  "refresh_token": "SsSd673SC0tgk8KPmqCwyd_BjnHm2LuKO8pm2KRiuYg",
  "refresh_expires_at": "2026-10-29T02:16:53.175162639Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "7809251b-f459-4a48-bd4b-0cf5c793e356",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:16:53Z"
}
```

```json
{
  "id": "7e18dff6-81f8-439e-815f-f5a493521bec",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:16:53Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/7e18dff6-81f8-439e-815f-f5a493521bec/publish` → **200**

```json
{
  "command_id": "761c929b-c452-40dd-96c0-33cfce5d3b45",
  "expected_version": 0
}
```

```json
{
  "id": "7e18dff6-81f8-439e-815f-f5a493521bec",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:16:53.739094Z",
  "published_at": "2026-10-28T14:16:53.739094Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "7e18dff6-81f8-439e-815f-f5a493521bec",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T14:16:53.739094Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634016573",
  "device_ref": "sandbox-19955"
}
```

```json
{
  "challenge_id": "c17dc5ea-d358-471c-bc28-f94a61359d1b",
  "expires_at": "2026-10-28T14:21:54.291090059Z",
  "resend_available_at": "2026-10-28T14:16:55.291090059Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634016573` → **200**

```json
{
  "phone": "+380634016573",
  "audience": "CLIENT",
  "code": "095804",
  "sent_at": "2026-10-28T14:16:54.293758269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c17dc5ea-d358-471c-bc28-f94a61359d1b",
  "code": "095804",
  "device_ref": "sandbox-19955"
}
```

```json
{
  "session_id": "371242dc-d672-4f8d-842c-5aadda5f208a",
  "subject": {
    "type": "CLIENT",
    "id": "27e1b67d-99ab-43c3-95c0-7c93a467234d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2UxYjY3ZC05OWFiLTQzYzMtOTVjMC03YzkzYTQ2NzIzNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTE0LCJpYXQiOjE3OTMxOTcwMTQsImp0aSI6IjBkYjNmNWY3LTAzOWUtNGM4NC04ZGMzLThkNDdkODZmYjZlNSIsInNpZCI6IjM3MTI0MmRjLWQ2NzItNGY4ZC04NDJjLTVhYWRkYTVmMjA4YSJ9.UOK-7MyJVCRy6enogP_DJEC3PPyyZmO6MD1JaPMqipo",
  "access_expires_at": "2026-10-28T14:31:54.59086189Z",
  "refresh_token": "SRC1z0XB0495smAtyv9g6rl5NZaPOdl-kTUnO8_YAPE",
  "refresh_expires_at": "2026-11-27T14:16:54.590383741Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "7e18dff6-81f8-439e-815f-f5a493521bec",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T14:16:53.739094Z",
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
  "command_id": "386552f1-a6c1-49b6-9886-9904b1a548bf",
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
  "id": "aebf10a8-b89f-4563-a806-ec642d5585af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:21:55.126032Z",
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
  "command_id": "05fbb111-a395-4c57-953c-9a6295976f9e",
  "quote_id": "aebf10a8-b89f-4563-a806-ec642d5585af",
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
  "correlation_id": "5132455f-d169-4084-be51-d34ffa6fa09e"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "af496302-c837-44f5-b2a3-599aa392ce36",
  "version_id": "7e18dff6-81f8-439e-815f-f5a493521bec",
  "language": "uk"
}
```

```json
{
  "version_id": "7e18dff6-81f8-439e-815f-f5a493521bec",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T14:16:55.686872Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dff9514a-1908-4ab5-a011-ef604311fc5c",
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
  "id": "5e56ee68-9e8a-45a3-9642-c09a7d250b85",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:21:55.960944Z",
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
  "command_id": "d2c21b2e-fa90-4cb7-988b-0712295edae4",
  "quote_id": "5e56ee68-9e8a-45a3-9642-c09a7d250b85",
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
  "id": "9b804fcc-1e0b-4103-a2c4-b65dbe47ec19",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "27e1b67d-99ab-43c3-95c0-7c93a467234d",
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
  "created_at": "2026-10-28T14:16:56.244623Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b804fcc-1e0b-4103-a2c4-b65dbe47ec19` → **200**

```json
{
  "id": "9b804fcc-1e0b-4103-a2c4-b65dbe47ec19",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "27e1b67d-99ab-43c3-95c0-7c93a467234d",
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
  "created_at": "2026-10-28T14:16:56.244623Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9b804fcc-1e0b-4103-a2c4-b65dbe47ec19/cancel` → **200**

```json
{
  "command_id": "2dc3a50c-5d22-4bd8-8b8d-26fa177b82a4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9b804fcc-1e0b-4103-a2c4-b65dbe47ec19",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "27e1b67d-99ab-43c3-95c0-7c93a467234d",
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
  "created_at": "2026-10-28T14:16:56.244623Z",
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

`POST /api/admin/v1/legal-documents/7e18dff6-81f8-439e-815f-f5a493521bec` → **409**

```json
{
  "command_id": "a3083fa7-9b89-40ff-bab0-232589a65d2d",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:16:57Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/7e18dff6-81f8-439e-815f-f5a493521bec",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b4eecac6-26a8-466d-8e8b-b34b1febc977"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "39894855-5657-4bc5-9fea-f53cb59c1c18",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:16:57Z"
}
```

```json
{
  "id": "12f31c3a-7f2c-422a-bf1b-3164cf86c103",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:16:57Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/12f31c3a-7f2c-422a-bf1b-3164cf86c103/publish` → **200**

```json
{
  "command_id": "c31b0a03-01a7-49b4-8326-ccc782926b1f",
  "expected_version": 0
}
```

```json
{
  "id": "12f31c3a-7f2c-422a-bf1b-3164cf86c103",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:16:57.672115Z",
  "published_at": "2026-10-28T14:16:57.672115Z",
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
  "device_ref": "sandbox-14767"
}
```

```json
{
  "challenge_id": "3e5b951b-6159-4fff-9ca6-a5d1362c64a8",
  "expires_at": "2026-10-28T14:21:57.954990057Z",
  "resend_available_at": "2026-10-28T14:16:58.954990057Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "725775",
  "sent_at": "2026-10-28T14:16:57.957388567Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e5b951b-6159-4fff-9ca6-a5d1362c64a8",
  "code": "725775",
  "device_ref": "sandbox-14767"
}
```

```json
{
  "session_id": "b9285380-c167-4a19-90b5-df2f4090f698",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzkxOCwiaWF0IjoxNzkzMTk3MDE4LCJqdGkiOiJlMzA3NDIzYy0xYjg4LTRiZjAtYWY1NS0yNzY0ODdkM2MyNGUiLCJzaWQiOiJiOTI4NTM4MC1jMTY3LTRhMTktOTBiNS1kZjJmNDA5MGY2OTgifQ.Nt-dJPoiJitiGTZBkAQF8jb9mTvtO-_EA1dYEfGrMhM",
  "access_expires_at": "2026-10-28T14:31:58.248114235Z",
  "refresh_token": "kdrKtvPxOg8D1tBhqskjJs7vbsXgxIkU1piuvD4rxXo",
  "refresh_expires_at": "2026-11-27T14:16:58.247619872Z",
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
  "command_id": "3cf86b83-6aab-437e-8178-dc3a4fae34a1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:58Z",
    "sequence": 1793197018773
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d793e006-dbb4-4364-a7b9-242d19599f28",
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
  "last_heartbeat_at": "2026-10-28T14:16:58.79168Z",
  "last_location_at": "2026-10-28T14:16:58.79168Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675789983",
  "device_ref": "sandbox-30176"
}
```

```json
{
  "challenge_id": "29207aae-e72e-465b-a60d-1cc2a02e9bae",
  "expires_at": "2026-10-28T14:21:59.057883903Z",
  "resend_available_at": "2026-10-28T14:17:00.057883903Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675789983` → **200**

```json
{
  "phone": "+380675789983",
  "audience": "CLIENT",
  "code": "137936",
  "sent_at": "2026-10-28T14:16:59.060055956Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29207aae-e72e-465b-a60d-1cc2a02e9bae",
  "code": "137936",
  "device_ref": "sandbox-30176"
}
```

```json
{
  "session_id": "aa34fbc6-24b7-48b8-8b1d-850c58d3666c",
  "subject": {
    "type": "CLIENT",
    "id": "66336a0c-3338-4dd1-a229-555bf42cef7b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NjMzNmEwYy0zMzM4LTRkZDEtYTIyOS01NTViZjQyY2VmN2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTE5LCJpYXQiOjE3OTMxOTcwMTksImp0aSI6ImY4MDkwYjdkLTYyNGUtNGMzMi1iODQyLWNlNjQyNjliOGIwOCIsInNpZCI6ImFhMzRmYmM2LTI0YjctNDhiOC04YjFkLTg1MGM1OGQzNjY2YyJ9.XoSSf5QzgOEfZozX3hewETJF58OtX5gvHHEzItYYxrI",
  "access_expires_at": "2026-10-28T14:31:59.349318314Z",
  "refresh_token": "OWB3_8g8lMqulPlWBe_EdoRAVYLgg-uVcqgytUMNF3s",
  "refresh_expires_at": "2026-11-27T14:16:59.348787486Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "404dffba-9956-4d71-b4e3-bd17261fa16b",
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
  "id": "64caa545-4c96-4438-aa1e-9818fefc90ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:21:59.623668Z",
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
  "command_id": "f5d0c5c7-7db5-4af1-8f20-3e433a457bb5",
  "quote_id": "64caa545-4c96-4438-aa1e-9818fefc90ed",
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
    "phone": "+380674863107"
  }
}
```

```json
{
  "id": "3d9cedfc-7f5f-4e75-99d6-645033d24c29",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "66336a0c-3338-4dd1-a229-555bf42cef7b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:16:59.900727Z",
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
    "id": "96a8c3b5-a36e-478e-aff0-53cf6d73f1b9",
    "order_id": "3d9cedfc-7f5f-4e75-99d6-645033d24c29",
    "expires_at": "2026-10-28T14:17:14.903897Z",
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

`POST /api/driver/v1/offers/96a8c3b5-a36e-478e-aff0-53cf6d73f1b9/accept` → **200**

```json
{
  "command_id": "906659fe-b1cd-4a33-a3bf-da0568ff2f4f"
}
```

```json
{
  "id": "845f88b6-52bf-4423-86c7-c20e83392cdf",
  "order_id": "3d9cedfc-7f5f-4e75-99d6-645033d24c29",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "82c7c2f9-c416-4551-a8ec-34347c3877f7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "82c7c2f9-c416-4551-a8ec-34347c3877f7",
  "order_id": "3d9cedfc-7f5f-4e75-99d6-645033d24c29",
  "assignment_id": "845f88b6-52bf-4423-86c7-c20e83392cdf",
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
    "phone": "+380674863107"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d53ed2a5-1f6c-4b4e-a068-06dde3b4d807",
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
  "id": "9b237bc5-18ec-4548-8028-f2ebd61496c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:01.012089Z",
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
  "command_id": "eef33e39-cdf7-4a7d-949a-38f5c390f25d",
  "quote_id": "9b237bc5-18ec-4548-8028-f2ebd61496c4",
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
  "id": "1a5f1f0a-6001-46bd-a8b8-fc306b2c2c62",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "66336a0c-3338-4dd1-a229-555bf42cef7b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:17:01.294086Z",
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
  "command_id": "f2443e8e-081c-4d7d-953b-b2864c9b6ff8",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T17:17:01Z"
}
```

```json
{
  "id": "17a45d8a-b22d-4d81-9ca4-a9a8fd8cdeb5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:01.594176Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:17:01Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "75082b3c-c82e-4cfa-b57d-91a892e6702f",
  "quote_id": "17a45d8a-b22d-4d81-9ca4-a9a8fd8cdeb5",
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
  "pickup_at": "2026-10-28T17:17:01Z"
}
```

```json
{
  "id": "ebf24dba-8887-4442-8f77-303c3ede6890",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "66336a0c-3338-4dd1-a229-555bf42cef7b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:17:01.888426Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:17:01Z",
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
  "command_id": "4725713f-bb52-4e56-80b0-a0b7f79d0739",
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
  "id": "fbc49563-18f0-48ca-b5b0-abb27452c9b3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:02.176043Z",
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
  "command_id": "47cae1ec-d89e-49d6-b10d-53f8599b4edc",
  "quote_id": "fbc49563-18f0-48ca-b5b0-abb27452c9b3",
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
  "correlation_id": "d8f4d8df-5e60-48d2-8796-82514f2d1fd1"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "ebf24dba-8887-4442-8f77-303c3ede6890",
      "short_number": 16,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "66336a0c-3338-4dd1-a229-555bf42cef7b",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T14:17:01.888426Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T17:17:01Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "1a5f1f0a-6001-46bd-a8b8-fc306b2c2c62",
      "short_number": 15,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "66336a0c-3338-4dd1-a229-555bf42cef7b",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T14:17:01.294086Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "3d9cedfc-7f5f-4e75-99d6-645033d24c29",
      "short_number": 14,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "1a5f1f0a-6001-46bd-a8b8-fc306b2c2c62",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "66336a0c-3338-4dd1-a229-555bf42cef7b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:17:01.294086Z",
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

`GET /api/rider/v1/orders/3d9cedfc-7f5f-4e75-99d6-645033d24c29` → **200**

```json
{
  "id": "3d9cedfc-7f5f-4e75-99d6-645033d24c29",
  "short_number": 14,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "66336a0c-3338-4dd1-a229-555bf42cef7b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "845f88b6-52bf-4423-86c7-c20e83392cdf",
    "order_id": "3d9cedfc-7f5f-4e75-99d6-645033d24c29",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "82c7c2f9-c416-4551-a8ec-34347c3877f7",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:16:59.900727Z",
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
    "location_at": "2026-10-28T14:16:58.79168Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/3d9cedfc-7f5f-4e75-99d6-645033d24c29/cancel` → **200**

```json
{
  "command_id": "814376d9-10f5-482a-9c78-42a7bab8d6d2",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3d9cedfc-7f5f-4e75-99d6-645033d24c29",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "66336a0c-3338-4dd1-a229-555bf42cef7b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "845f88b6-52bf-4423-86c7-c20e83392cdf",
    "order_id": "3d9cedfc-7f5f-4e75-99d6-645033d24c29",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "82c7c2f9-c416-4551-a8ec-34347c3877f7",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:16:59.900727Z",
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

`GET /api/rider/v1/orders/1a5f1f0a-6001-46bd-a8b8-fc306b2c2c62` → **200**

```json
{
  "id": "1a5f1f0a-6001-46bd-a8b8-fc306b2c2c62",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "66336a0c-3338-4dd1-a229-555bf42cef7b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:17:01.294086Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1a5f1f0a-6001-46bd-a8b8-fc306b2c2c62/cancel` → **200**

```json
{
  "command_id": "f25fc29c-0188-4a6e-b480-264896b7953d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1a5f1f0a-6001-46bd-a8b8-fc306b2c2c62",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "66336a0c-3338-4dd1-a229-555bf42cef7b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:17:01.294086Z",
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

`GET /api/rider/v1/orders/ebf24dba-8887-4442-8f77-303c3ede6890` → **200**

```json
{
  "id": "ebf24dba-8887-4442-8f77-303c3ede6890",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "66336a0c-3338-4dd1-a229-555bf42cef7b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:17:01.888426Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:17:01Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ebf24dba-8887-4442-8f77-303c3ede6890/cancel` → **200**

```json
{
  "command_id": "4719614c-9268-416f-9936-c5650b2556ee",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ebf24dba-8887-4442-8f77-303c3ede6890",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "66336a0c-3338-4dd1-a229-555bf42cef7b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:17:01.888426Z",
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
  "pickup_at": "2026-10-28T17:17:01Z",
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
  "session_id": "d793e006-dbb4-4364-a7b9-242d19599f28",
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
  "last_heartbeat_at": "2026-10-28T14:16:58.79168Z",
  "last_location_at": "2026-10-28T14:16:58.79168Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d793e006-dbb4-4364-a7b9-242d19599f28/close` → **200**

```json
{
  "command_id": "878d46e9-0db1-4a12-bac4-efe6bf90b593",
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

Done: orders 3d9cedfc-7f5f-4e75-99d6-645033d24c29, 1a5f1f0a-6001-46bd-a8b8-fc306b2c2c62, ebf24dba-8887-4442-8f77-303c3ede6890.

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
  "session_id": "5dfc16f2-6498-4aec-870b-a220e1dcb6e9",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MjUsImlhdCI6MTc5MzE5NzAyNSwianRpIjoiZDkwZGEwNTAtN2EyZC00YmEzLWIzN2YtYmM1ZjVlZjgzMzg3Iiwic2lkIjoiNWRmYzE2ZjItNjQ5OC00YWVjLTg3MGItYTIyMGUxZGNiNmU5In0.-eOMLbq_XrQuVWTQGJL4YjrrK47dm_eFeXIisAjjWjQ",
  "access_expires_at": "2026-10-28T14:32:05.854275688Z",
  "refresh_token": "3IXD6ziPw-1uldbz7dL2cuUehi5fos-fdbdFkAJ4ULk",
  "refresh_expires_at": "2026-10-29T02:17:05.853754374Z",
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
  "session_id": "f7268732-8d55-45dd-aba3-388b520d2e9c",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MjYsImlhdCI6MTc5MzE5NzAyNiwianRpIjoiNmJkMjJhZGYtOWIxZS00NTI0LWFjMWMtMWIyMDJjMDY5MTllIiwic2lkIjoiZjcyNjg3MzItOGQ1NS00NWRkLWFiYTMtMzg4YjUyMGQyZTljIn0.ORNW2TYc4di5wvv4s9GMkuYJZTAH6I48zC9fYkL7v_8",
  "access_expires_at": "2026-10-28T14:32:06.449633075Z",
  "refresh_token": "MdTsUyC6sXd2T1W6LU0aOxpUUyrX514Y-curYJRvc4E",
  "refresh_expires_at": "2026-10-29T02:17:06.449157499Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3873"
}
```

```json
{
  "challenge_id": "730e3abb-8a3e-4698-ba7d-1cdc919d893e",
  "expires_at": "2026-10-28T14:22:06.708176243Z",
  "resend_available_at": "2026-10-28T14:17:07.708176243Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "749936",
  "sent_at": "2026-10-28T14:17:06.710438479Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "730e3abb-8a3e-4698-ba7d-1cdc919d893e",
  "code": "749936",
  "device_ref": "sandbox-3873"
}
```

```json
{
  "session_id": "ad087fe9-b086-48ca-8c08-9be654f76b34",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzkyNywiaWF0IjoxNzkzMTk3MDI3LCJqdGkiOiIxZjg2ZThkMy01OWYxLTQzNWMtOTQ0YS0yZWVmY2Q1YjVkY2MiLCJzaWQiOiJhZDA4N2ZlOS1iMDg2LTQ4Y2EtOGMwOC05YmU2NTRmNzZiMzQifQ.G3QmqXrO7EgWzGW29N59b6Pdw4mcE44DBzND7rUikb4",
  "access_expires_at": "2026-10-28T14:32:07.009979221Z",
  "refresh_token": "a_fQzylTNjfJFnT0OXWx34520RKH3fmzY9f_nUhtlgs",
  "refresh_expires_at": "2026-11-27T14:17:07.009416866Z",
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
  "command_id": "99706020-a80a-4316-bf34-548c4e35298d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:17:07Z",
    "sequence": 1793197027547
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "71936ee9-4164-4228-a5d2-b45f16761648",
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
  "last_heartbeat_at": "2026-10-28T14:17:07.565656Z",
  "last_location_at": "2026-10-28T14:17:07.565656Z",
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
  "command_id": "f74b21e6-cfed-4df4-9fd5-68add2d30e94",
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
  "effective_at": "2026-10-28T14:17:08.129299Z",
  "changed_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T14:14:55.226017Z",
  "last_entries": [
    {
      "order_id": "2c9bc5c7-621d-4368-9b21-fd98b5d4f634",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T14:14:55.226017Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "89937956-a1fb-48b5-b9d7-241d300d9732",
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
  "id": "7dffc9d0-36f8-4725-973e-c633949c491e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:08.680533Z",
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
  "command_id": "34de7b32-9bf0-4d22-8911-28f6903ebba2",
  "quote_id": "7dffc9d0-36f8-4725-973e-c633949c491e",
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
    "phone": "+380671110227"
  }
}
```

```json
{
  "id": "5e5f4f9a-664d-4c61-b250-a459fd22db3a",
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
  "created_at": "2026-10-28T14:17:08.959782Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110227"
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
    "id": "a43a9e0a-0458-480e-8d4f-5031f739ef07",
    "order_id": "5e5f4f9a-664d-4c61-b250-a459fd22db3a",
    "expires_at": "2026-10-28T14:17:23.964014Z",
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

`POST /api/driver/v1/offers/a43a9e0a-0458-480e-8d4f-5031f739ef07/accept` → **200**

```json
{
  "command_id": "5765421a-0c80-4b3b-b5c0-32690ec21eee"
}
```

```json
{
  "id": "7722c2b8-200a-426a-ace4-406c467432bc",
  "order_id": "5e5f4f9a-664d-4c61-b250-a459fd22db3a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9cb4cb63-09f0-46f6-b575-880e094a0824",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9cb4cb63-09f0-46f6-b575-880e094a0824",
  "order_id": "5e5f4f9a-664d-4c61-b250-a459fd22db3a",
  "assignment_id": "7722c2b8-200a-426a-ace4-406c467432bc",
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
    "phone": "+380671110227"
  }
}
```

`POST /api/driver/v1/work-sessions/71936ee9-4164-4228-a5d2-b45f16761648/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:17:10Z",
    "sequence": 1793197030390
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "71936ee9-4164-4228-a5d2-b45f16761648",
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
  "last_heartbeat_at": "2026-10-28T14:17:10.058496Z",
  "last_location_at": "2026-10-28T14:17:10.058496Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9cb4cb63-09f0-46f6-b575-880e094a0824/arrive` → **200**

```json
{
  "command_id": "a4086ea1-3831-4b34-b3e0-eb1526877eb7",
  "expected_version": 0
}
```

```json
{
  "id": "9cb4cb63-09f0-46f6-b575-880e094a0824",
  "order_id": "5e5f4f9a-664d-4c61-b250-a459fd22db3a",
  "assignment_id": "7722c2b8-200a-426a-ace4-406c467432bc",
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
  "arrived_at": "2026-10-28T14:17:10.33344Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671110227"
  }
}
```

`POST /api/driver/v1/trips/9cb4cb63-09f0-46f6-b575-880e094a0824/start` → **200**

```json
{
  "command_id": "e3b7ce28-cf09-4c98-9f94-ee902af9fbd4",
  "expected_version": 1
}
```

```json
{
  "id": "9cb4cb63-09f0-46f6-b575-880e094a0824",
  "order_id": "5e5f4f9a-664d-4c61-b250-a459fd22db3a",
  "assignment_id": "7722c2b8-200a-426a-ace4-406c467432bc",
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
  "arrived_at": "2026-10-28T14:17:10.33344Z",
  "started_at": "2026-10-28T14:17:10.614896Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671110227"
  }
}
```

`POST /api/driver/v1/trips/9cb4cb63-09f0-46f6-b575-880e094a0824/complete` → **200**

```json
{
  "command_id": "82a2ae3b-7ca6-4fc2-a81e-f08221dc65d6",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:17:10Z",
  "cash_received": true
}
```

```json
{
  "id": "9cb4cb63-09f0-46f6-b575-880e094a0824",
  "order_id": "5e5f4f9a-664d-4c61-b250-a459fd22db3a",
  "assignment_id": "7722c2b8-200a-426a-ace4-406c467432bc",
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
  "arrived_at": "2026-10-28T14:17:10.33344Z",
  "started_at": "2026-10-28T14:17:10.614896Z",
  "completed_at": "2026-10-28T14:17:10.907083Z",
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
  "command_id": "16e59f5d-cb7e-41f5-9802-33e717da8b88",
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
  "id": "5130a812-dc73-4395-8e64-b708ff35f298",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:11.191830Z",
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
  "command_id": "ff929ac4-8745-4a52-9c48-fd9bb31190e0",
  "quote_id": "5130a812-dc73-4395-8e64-b708ff35f298",
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
    "phone": "+3806711121308"
  }
}
```

```json
{
  "id": "95803af5-fbea-41b5-917a-e10741980cb8",
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
  "created_at": "2026-10-28T14:17:11.469864Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121308"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/95803af5-fbea-41b5-917a-e10741980cb8` → **200**

```json
{
  "id": "95803af5-fbea-41b5-917a-e10741980cb8",
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
  "created_at": "2026-10-28T14:17:11.469864Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121308"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/95803af5-fbea-41b5-917a-e10741980cb8/cancel` → **200**

```json
{
  "command_id": "aaf6d4f3-8a8f-438f-ab81-3fbef0336a30",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "95803af5-fbea-41b5-917a-e10741980cb8",
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
  "created_at": "2026-10-28T14:17:11.469864Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121308"
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
  "staff_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T14:14:55.226017Z",
  "last_entries": [
    {
      "order_id": "95803af5-fbea-41b5-917a-e10741980cb8",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T14:17:12.065311Z"
    },
    {
      "order_id": "5e5f4f9a-664d-4c61-b250-a459fd22db3a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T14:17:10.912069Z"
    },
    {
      "order_id": "2c9bc5c7-621d-4368-9b21-fd98b5d4f634",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T14:14:55.226017Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "71936ee9-4164-4228-a5d2-b45f16761648",
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
  "last_heartbeat_at": "2026-10-28T14:17:10.058496Z",
  "last_location_at": "2026-10-28T14:17:10.058496Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/71936ee9-4164-4228-a5d2-b45f16761648/close` → **200**

```json
{
  "command_id": "05777e88-1d31-4cef-b62d-c09cc7de0955",
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

Done: operator bonus for fulfilled 5e5f4f9a-664d-4c61-b250-a459fd22db3a and operator-fault cancellation 95803af5-fbea-41b5-917a-e10741980cb8.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679077746",
  "device_ref": "sandbox-15625"
}
```

```json
{
  "challenge_id": "21ef6114-8e4e-4f93-bab1-8b845fbffbff",
  "expires_at": "2026-10-28T14:22:15.201502248Z",
  "resend_available_at": "2026-10-28T14:17:16.201502248Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679077746` → **200**

```json
{
  "phone": "+380679077746",
  "audience": "CLIENT",
  "code": "086054",
  "sent_at": "2026-10-28T14:17:15.204111868Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674419088",
  "device_ref": "sandbox-27074",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "4d052dda-cb05-49f7-8e81-5b64f9931617",
  "expires_at": "2026-10-28T14:22:15.498404922Z",
  "resend_available_at": "2026-10-28T14:17:16.498404922Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674419088` → **200**

```json
{
  "phone": "+380674419088",
  "audience": "CLIENT",
  "code": "000144",
  "sent_at": "2026-10-28T14:17:15.50038979Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671080000",
  "device_ref": "sandbox-3897"
}
```

```json
{
  "challenge_id": "35a993ba-660a-4312-ab91-fe8c985ecae7",
  "expires_at": "2026-10-28T14:22:15.788010229Z",
  "resend_available_at": "2026-10-28T14:17:16.788010229Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671080000` → **200**

```json
{
  "phone": "+380671080000",
  "audience": "CLIENT",
  "code": "033092",
  "sent_at": "2026-10-28T14:17:15.790669233Z",
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
  "session_id": "84744664-7220-4649-94f2-339fdd515b33",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MzYsImlhdCI6MTc5MzE5NzAzNiwianRpIjoiYTIzZDU2NjktNzZjNi00ODZkLThmMGEtYWE0OTExNDZjZmJmIiwic2lkIjoiODQ3NDQ2NjQtNzIyMC00NjQ5LTk0ZjItMzM5ZmRkNTE1YjMzIn0.mLgfzyCekPfU9BKJp0vWLRW3vk0DkuUAWHsEYC6FUpY",
  "access_expires_at": "2026-10-28T14:32:16.421603966Z",
  "refresh_token": "vMxp8yvJIJt1g-dWG8envgTiPh_1z7s3XHbCxwEPJi0",
  "refresh_expires_at": "2026-10-29T02:17:16.420698361Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671080000` → **200**

```json
{
  "deliveries": [
    {
      "id": "0a7cbf8c-7a8f-43a2-8a9a-4c08ad63d1ff",
      "challenge_id": "35a993ba-660a-4312-ab91-fe8c985ecae7",
      "phone": "+380671080000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-46310875-60b9-435e-a28d-633decb03753",
      "error": null,
      "attempted_at": "2026-10-28T14:17:15.790949Z"
    },
    {
      "id": "1883c121-d6f1-4f83-aaf3-6fba1d9a7298",
      "challenge_id": "35a993ba-660a-4312-ab91-fe8c985ecae7",
      "phone": "+380671080000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T14:17:15.790171Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380671080000` → **200**

```json
{
  "phone": "+380671080000",
  "audience": "CLIENT",
  "code": "033092",
  "sent_at": "2026-10-28T14:17:15.790669233Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674419088` → **200**

```json
{
  "deliveries": [
    {
      "id": "7cb49142-a964-4976-ba33-f57bb0d0261a",
      "challenge_id": "4d052dda-cb05-49f7-8e81-5b64f9931617",
      "phone": "+380674419088",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-cd2ea533-7795-4755-ae24-3c72f5538f76",
      "error": null,
      "attempted_at": "2026-10-28T14:17:15.500633Z"
    }
  ]
}
```

Done: SMS to +380679077746, a call to +380674419088, SMS then a call to +380671080000.

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
  "session_id": "6e5e2b57-075d-42a9-83c9-d8ba9dfcd908",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MzcsImlhdCI6MTc5MzE5NzAzNywianRpIjoiOTY0MjNjNWQtNjNlOS00MGNlLTk5YTItYmQzMzBiNGUyMTZlIiwic2lkIjoiNmU1ZTJiNTctMDc1ZC00MmE5LTgzYzktZDhiYTlkZmNkOTA4In0.fb3fXnHUKD4thg1OVM4moH9yQVmOmKNS2EzWslkU4Z0",
  "access_expires_at": "2026-10-28T14:32:17.611124025Z",
  "refresh_token": "eeFqGwok2h87dT3a0wMJUsacSp-o8riclUem5IKyP3E",
  "refresh_expires_at": "2026-10-29T02:17:17.610520459Z",
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
  "session_id": "a7587497-8208-4f1e-9a4c-5c890e2fda6f",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MzgsImlhdCI6MTc5MzE5NzAzOCwianRpIjoiNWY1MTZiOTAtNjViNi00MzM3LTk3YjEtYjFhMWE1N2Q2NmI4Iiwic2lkIjoiYTc1ODc0OTctODIwOC00ZjFlLTlhNGMtNWM4OTBlMmZkYTZmIn0.k6y86RE6ouM2JfJjyerZRNLvc5gJXeI4ZkzDNyU24VM",
  "access_expires_at": "2026-10-28T14:32:18.212786939Z",
  "refresh_token": "ExRO80XWscCoTtO1B5iwsy4RFaI_YzLhIeLH6xidnsE",
  "refresh_expires_at": "2026-10-29T02:17:18.212259055Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
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

`POST /api/admin/v1/staff-extensions/27cfa9ff-b784-4f83-81bb-26217b7bebaa` → **200**

```json
{
  "command_id": "73fb9a62-1ed6-4320-8549-6e8e11487d78",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "6571a350-4b4b-450c-a0ee-e40026c9236f",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:17:19.305718Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:17:19.305718Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e611b750-b410-4aad-92c2-809f8886eed1",
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
  "id": "160831ec-42e1-4f8d-8b42-f3ac026f1b73",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:19.829081Z",
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
  "command_id": "f4cab760-a0fa-4937-bcc1-224e1a04e662",
  "quote_id": "160831ec-42e1-4f8d-8b42-f3ac026f1b73",
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
    "phone": "+380672739117"
  }
}
```

```json
{
  "id": "6c2fe89d-4a61-4914-b7e0-89d278e53f4e",
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
  "created_at": "2026-10-28T14:17:20.108833Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672739117"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/6c2fe89d-4a61-4914-b7e0-89d278e53f4e/calls` → **201**

```json
{
  "command_id": "69fbfd17-36a6-4d16-a689-26b08b1d1c5a",
  "to": "CALLER"
}
```

```json
{
  "id": "707c928d-1bb8-4e4d-a513-03ec05c44609",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "order_ids": [
    "6c2fe89d-4a61-4914-b7e0-89d278e53f4e"
  ],
  "started_at": "2026-10-28T14:17:20.418981Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/6c2fe89d-4a61-4914-b7e0-89d278e53f4e/calls` → **201**

```json
{
  "command_id": "69fbfd17-36a6-4d16-a689-26b08b1d1c5a",
  "to": "CALLER"
}
```

```json
{
  "id": "707c928d-1bb8-4e4d-a513-03ec05c44609",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "order_ids": [
    "6c2fe89d-4a61-4914-b7e0-89d278e53f4e"
  ],
  "started_at": "2026-10-28T14:17:20.418981Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "707c928d-1bb8-4e4d-a513-03ec05c44609",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380672739117",
    "at": "2026-10-28T14:17:20.421226294Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "707c928d-1bb8-4e4d-a513-03ec05c44609",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.30173",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "707c928d-1bb8-4e4d-a513-03ec05c44609"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "707c928d-1bb8-4e4d-a513-03ec05c44609",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=6c2fe89d-4a61-4914-b7e0-89d278e53f4e` → **200**

```json
{
  "calls": [
    {
      "id": "707c928d-1bb8-4e4d-a513-03ec05c44609",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_ids": [
        "6c2fe89d-4a61-4914-b7e0-89d278e53f4e"
      ],
      "started_at": "2026-10-28T14:17:20.418981Z",
      "answered_at": "2026-10-28T14:17:21.037039Z",
      "ended_at": "2026-10-28T14:17:21.059603Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6c2fe89d-4a61-4914-b7e0-89d278e53f4e` → **200**

```json
{
  "calls": [
    {
      "id": "707c928d-1bb8-4e4d-a513-03ec05c44609",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_ids": [
        "6c2fe89d-4a61-4914-b7e0-89d278e53f4e"
      ],
      "started_at": "2026-10-28T14:17:20.418981Z",
      "answered_at": "2026-10-28T14:17:21.037039Z",
      "ended_at": "2026-10-28T14:17:21.059603Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6c2fe89d-4a61-4914-b7e0-89d278e53f4e` → **200**

```json
{
  "calls": [
    {
      "id": "707c928d-1bb8-4e4d-a513-03ec05c44609",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_ids": [
        "6c2fe89d-4a61-4914-b7e0-89d278e53f4e"
      ],
      "started_at": "2026-10-28T14:17:20.418981Z",
      "answered_at": "2026-10-28T14:17:21.037039Z",
      "ended_at": "2026-10-28T14:17:21.059603Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6c2fe89d-4a61-4914-b7e0-89d278e53f4e` → **200**

```json
{
  "calls": [
    {
      "id": "707c928d-1bb8-4e4d-a513-03ec05c44609",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "order_ids": [
        "6c2fe89d-4a61-4914-b7e0-89d278e53f4e"
      ],
      "started_at": "2026-10-28T14:17:20.418981Z",
      "answered_at": "2026-10-28T14:17:21.037039Z",
      "ended_at": "2026-10-28T14:17:21.059603Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:17:25.990165Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/6c2fe89d-4a61-4914-b7e0-89d278e53f4e` → **200**

```json
{
  "id": "6c2fe89d-4a61-4914-b7e0-89d278e53f4e",
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
  "created_at": "2026-10-28T14:17:20.108833Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672739117"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6c2fe89d-4a61-4914-b7e0-89d278e53f4e/cancel` → **200**

```json
{
  "command_id": "bf4a3dc7-aee5-4d40-8bbd-97ec3cbe81e1",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6c2fe89d-4a61-4914-b7e0-89d278e53f4e",
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
  "created_at": "2026-10-28T14:17:20.108833Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672739117"
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
  "command_id": "0033305b-a2dc-42e4-9e3e-a6abf57f6154",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T14:17:28.782707Z",
  "extension": "101"
}
```

Done: outgoing call 707c928d-1bb8-4e4d-a513-03ec05c44609 from order 6c2fe89d-4a61-4914-b7e0-89d278e53f4e, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633601562",
  "device_ref": "sandbox-1176"
}
```

```json
{
  "challenge_id": "11648a40-9f9d-40f3-94c3-4fbdcb74f60b",
  "expires_at": "2026-10-28T14:22:29.06822661Z",
  "resend_available_at": "2026-10-28T14:17:30.06822661Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633601562` → **200**

```json
{
  "phone": "+380633601562",
  "audience": "CLIENT",
  "code": "968182",
  "sent_at": "2026-10-28T14:17:29.072018925Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11648a40-9f9d-40f3-94c3-4fbdcb74f60b",
  "code": "968182",
  "device_ref": "sandbox-1176"
}
```

```json
{
  "session_id": "d63d8149-76ec-4900-9613-7c7bd9469a5d",
  "subject": {
    "type": "CLIENT",
    "id": "abce6717-adaa-4183-a7c2-26f147b7a39f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmNlNjcxNy1hZGFhLTQxODMtYTdjMi0yNmYxNDdiN2EzOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTQ5LCJpYXQiOjE3OTMxOTcwNDksImp0aSI6ImZkZTNiNzg5LWU5NzktNDQwNC04NmRlLTJjNDM0MjY4MTliZiIsInNpZCI6ImQ2M2Q4MTQ5LTc2ZWMtNDkwMC05NjEzLTdjN2JkOTQ2OWE1ZCJ9.tBgV93RqYcdG6W9BW-rQqw6Ko5kn0-ezsBnwrudQYNg",
  "access_expires_at": "2026-10-28T14:32:29.36604454Z",
  "refresh_token": "cP4g5uf2ecoYXK2e7HWZdnnlDuHQtRDmpuov26iDlsQ",
  "refresh_expires_at": "2026-11-27T14:17:29.365457859Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "abce6717-adaa-4183-a7c2-26f147b7a39f",
  "session_id": "d63d8149-76ec-4900-9613-7c7bd9469a5d",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633601562",
  "device_ref": "sandbox-20521"
}
```

```json
{
  "challenge_id": "1ba80299-eea5-4115-a1f6-c7f57bce588f",
  "expires_at": "2026-10-28T14:22:31.886125951Z",
  "resend_available_at": "2026-10-28T14:17:32.886125951Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633601562` → **200**

```json
{
  "phone": "+380633601562",
  "audience": "CLIENT",
  "code": "464303",
  "sent_at": "2026-10-28T14:17:31.888136777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ba80299-eea5-4115-a1f6-c7f57bce588f",
  "code": "464303",
  "device_ref": "sandbox-20521"
}
```

```json
{
  "session_id": "3ea64837-135b-4716-b31e-831e05e60c8e",
  "subject": {
    "type": "CLIENT",
    "id": "abce6717-adaa-4183-a7c2-26f147b7a39f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmNlNjcxNy1hZGFhLTQxODMtYTdjMi0yNmYxNDdiN2EzOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTUyLCJpYXQiOjE3OTMxOTcwNTIsImp0aSI6ImI5ZWMzYWJmLWIwNTctNDY5Yy04NWY2LTY5NjVlZmUwN2Q2NCIsInNpZCI6IjNlYTY0ODM3LTEzNWItNDcxNi1iMzFlLTgzMWUwNWU2MGM4ZSJ9.WHgD_wEZVyu3rAXI-Le57RCOWZ6Q5Fl6FMy7YxZ2fnI",
  "access_expires_at": "2026-10-28T14:32:32.199542076Z",
  "refresh_token": "pS2d2czKWF7L2Z7fsyjtMpbjCXFOwJ-S_69ETL-jsbA",
  "refresh_expires_at": "2026-11-27T14:17:32.198971188Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "53f41c87-cc36-4147-8749-dbfdd6375ce1",
  "expires_at": "2026-10-28T14:22:34.474978289Z",
  "resend_available_at": "2026-10-28T14:17:35.474978289Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633601562` → **200**

```json
{
  "phone": "+380633601562",
  "audience": "CLIENT",
  "code": "191298",
  "sent_at": "2026-10-28T14:17:34.47693906Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637307192"
}
```

```json
{
  "challenge_id": "312e5bc2-8168-4df3-8fac-50415d80630a",
  "expires_at": "2026-10-28T14:22:34.757782259Z",
  "resend_available_at": "2026-10-28T14:17:35.757782259Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637307192` → **200**

```json
{
  "phone": "+380637307192",
  "audience": "CLIENT",
  "code": "885914",
  "sent_at": "2026-10-28T14:17:34.759566756Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "d4627dcf-ed90-4c2e-b49c-308ed17fc9c5",
  "current_challenge_id": "53f41c87-cc36-4147-8749-dbfdd6375ce1",
  "current_code": "000000",
  "new_challenge_id": "312e5bc2-8168-4df3-8fac-50415d80630a",
  "new_code": "885914"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "80a23042-5b1d-47f7-8cd9-87217efe94e4"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "e1b0ce7c-314d-4aba-bb48-3cb5b3673928",
  "current_challenge_id": "53f41c87-cc36-4147-8749-dbfdd6375ce1",
  "current_code": "191298",
  "new_challenge_id": "312e5bc2-8168-4df3-8fac-50415d80630a",
  "new_code": "885914"
}
```

```json
{
  "subject_id": "abce6717-adaa-4183-a7c2-26f147b7a39f",
  "phone": "+380637307192",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "abce6717-adaa-4183-a7c2-26f147b7a39f",
  "session_id": "d63d8149-76ec-4900-9613-7c7bd9469a5d",
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
  "correlation_id": "deeb6faa-65a4-45f3-8c31-c5a816e6fe31"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637307192",
  "device_ref": "sandbox-4586"
}
```

```json
{
  "challenge_id": "e3ea5df6-f49f-4280-9ee1-d9f693e4ea27",
  "expires_at": "2026-10-28T14:22:38.137329373Z",
  "resend_available_at": "2026-10-28T14:17:39.137329373Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637307192` → **200**

```json
{
  "phone": "+380637307192",
  "audience": "CLIENT",
  "code": "472221",
  "sent_at": "2026-10-28T14:17:38.139604408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3ea5df6-f49f-4280-9ee1-d9f693e4ea27",
  "code": "472221",
  "device_ref": "sandbox-4586"
}
```

```json
{
  "session_id": "e4a64d72-f738-46cd-a892-7a2b46aae57e",
  "subject": {
    "type": "CLIENT",
    "id": "abce6717-adaa-4183-a7c2-26f147b7a39f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmNlNjcxNy1hZGFhLTQxODMtYTdjMi0yNmYxNDdiN2EzOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTU4LCJpYXQiOjE3OTMxOTcwNTgsImp0aSI6ImZmZDM5YTM0LWQyYWEtNGI2Ni05YTZlLWIyNTljNDRlNzgzMSIsInNpZCI6ImU0YTY0ZDcyLWY3MzgtNDZjZC1hODkyLTdhMmI0NmFhZTU3ZSJ9.mdJVWEYmUfW2nUMGRRMGceKRu118Pj8hndkMT0wU3AQ",
  "access_expires_at": "2026-10-28T14:32:38.434989946Z",
  "refresh_token": "RfLLmxZQUMFBv9dh-RBnVIYaIuXxpvklDJhCq2eRoX0",
  "refresh_expires_at": "2026-11-27T14:17:38.434468282Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "abce6717-adaa-4183-a7c2-26f147b7a39f",
  "session_id": "e4a64d72-f738-46cd-a892-7a2b46aae57e",
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
  "session_id": "f17bf43d-6de7-4ab9-b1e2-2da3b6965bea",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NTksImlhdCI6MTc5MzE5NzA1OSwianRpIjoiNDg0YjcwMGUtMTBjOC00MDRmLTlkNzktMzY1MmQwZmNkYTkzIiwic2lkIjoiZjE3YmY0M2QtNmRlNy00YWI5LWIxZTItMmRhM2I2OTY1YmVhIn0.suoXOJrKAclEVyILuvnZ58C04Gd0WDMmwETwsAIAFRQ",
  "access_expires_at": "2026-10-28T14:32:39.293876842Z",
  "refresh_token": "_OmccA75627SHnqFn117rQgNHsJI9Pa3l67b8s6kn6k",
  "refresh_expires_at": "2026-10-29T02:17:39.293387606Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/abce6717-adaa-4183-a7c2-26f147b7a39f` → **200**

```json
{
  "client": {
    "id": "abce6717-adaa-4183-a7c2-26f147b7a39f",
    "phone": "+380637307192",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:17:29.363624Z",
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

`POST /api/admin/v1/clients/abce6717-adaa-4183-a7c2-26f147b7a39f/phone` → **400**

```json
{
  "command_id": "d96ae34e-aa04-40e9-9177-d0a68d02aeef",
  "expected_version": 3,
  "phone": "+380632010728",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/abce6717-adaa-4183-a7c2-26f147b7a39f/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "931fb058-4b5a-4e61-aa3c-3da475f67a3f",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/abce6717-adaa-4183-a7c2-26f147b7a39f/phone` → **200**

```json
{
  "command_id": "595e3a7f-c2c9-4742-a278-e9f665d74e28",
  "expected_version": 3,
  "phone": "+380632010728",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "abce6717-adaa-4183-a7c2-26f147b7a39f",
  "phone": "+380632010728",
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
  "correlation_id": "e120ec13-07d6-43bb-ad8d-87ee96449e55"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632010728",
  "device_ref": "sandbox-22369"
}
```

```json
{
  "challenge_id": "c19ea0e2-e1be-4628-9aa4-2b6da94e9775",
  "expires_at": "2026-10-28T14:22:40.660663494Z",
  "resend_available_at": "2026-10-28T14:17:41.660663494Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632010728` → **200**

```json
{
  "phone": "+380632010728",
  "audience": "CLIENT",
  "code": "229305",
  "sent_at": "2026-10-28T14:17:40.6630684Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c19ea0e2-e1be-4628-9aa4-2b6da94e9775",
  "code": "229305",
  "device_ref": "sandbox-22369"
}
```

```json
{
  "session_id": "5486169f-47cf-41d3-875c-0e0326d36c2b",
  "subject": {
    "type": "CLIENT",
    "id": "abce6717-adaa-4183-a7c2-26f147b7a39f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmNlNjcxNy1hZGFhLTQxODMtYTdjMi0yNmYxNDdiN2EzOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTYwLCJpYXQiOjE3OTMxOTcwNjAsImp0aSI6IjFlZDc3OTQ1LTk1NjUtNGM3Mi1hODM3LTI2NGYzYWI2ZDNkMCIsInNpZCI6IjU0ODYxNjlmLTQ3Y2YtNDFkMy04NzVjLTBlMDMyNmQzNmMyYiJ9.3h3z23_MOcc4HVUM9fh53W29-40GDQ3p4IoCwPePaps",
  "access_expires_at": "2026-10-28T14:32:40.953013633Z",
  "refresh_token": "UZFBF2INf27uVPzlWlqxfiDXzmr2RaJLXqPnRSAIo2Y",
  "refresh_expires_at": "2026-11-27T14:17:40.952438178Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "abce6717-adaa-4183-a7c2-26f147b7a39f",
  "session_id": "5486169f-47cf-41d3-875c-0e0326d36c2b",
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
  "phone": "+380631533814",
  "device_ref": "sandbox-31033"
}
```

```json
{
  "challenge_id": "780d4221-8c1b-4b23-a1fc-8850a50f1cc5",
  "expires_at": "2026-10-28T14:22:41.494673364Z",
  "resend_available_at": "2026-10-28T14:17:42.494673364Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631533814` → **200**

```json
{
  "phone": "+380631533814",
  "audience": "CLIENT",
  "code": "018408",
  "sent_at": "2026-10-28T14:17:41.496780543Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "780d4221-8c1b-4b23-a1fc-8850a50f1cc5",
  "code": "018408",
  "device_ref": "sandbox-31033"
}
```

```json
{
  "session_id": "52f2c4a4-5293-4f38-95cc-340022aac094",
  "subject": {
    "type": "CLIENT",
    "id": "4bfe9f86-9ea6-4b33-b7b3-4e17de330941"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YmZlOWY4Ni05ZWE2LTRiMzMtYjdiMy00ZTE3ZGUzMzA5NDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTYxLCJpYXQiOjE3OTMxOTcwNjEsImp0aSI6Ijg1OWVhNDYwLWNmYjYtNGE4OS05YTI4LWMxZDNhYTZkZGJhOSIsInNpZCI6IjUyZjJjNGE0LTUyOTMtNGYzOC05NWNjLTM0MDAyMmFhYzA5NCJ9.d_ZDvELcGvmnP4i3bBm7meQDZSm3FXsrUBG_VY3WraM",
  "access_expires_at": "2026-10-28T14:32:41.794808668Z",
  "refresh_token": "IIuRUBz1m-v6VCcIPFEgT8YUkHe5d-DF2qAcRzxTxAY",
  "refresh_expires_at": "2026-11-27T14:17:41.794323538Z",
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
  "session_id": "289b22ff-a55b-4d9b-a82f-f84b5cc5a2e2",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NjIsImlhdCI6MTc5MzE5NzA2MiwianRpIjoiNmQyNDE0NDgtMjU1NS00MGE5LWE3YTQtMjcwZGUyNWRkMmM1Iiwic2lkIjoiMjg5YjIyZmYtYTU1Yi00ZDliLWE4MmYtZjg0YjVjYzVhMmUyIn0.F_0PDv4hmt32M19Y1aqJlXp4DRQ39x4_RCTWcutmUNs",
  "access_expires_at": "2026-10-28T14:32:42.963003252Z",
  "refresh_token": "nLBaf0NOUo3LbKlS7ozN9eDlyb2jz45mIadBLrZ_P88",
  "refresh_expires_at": "2026-10-29T02:17:42.962428552Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631533814` → **200**

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
  "correlation_id": "d14ddf34-f1b4-4d3f-bdd4-df24c299e0e5"
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
  "session_id": "b378ed07-6af2-4c05-b893-759f63297585",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NjQsImlhdCI6MTc5MzE5NzA2NCwianRpIjoiOTdiNTQwNzYtNWJiOC00Njk1LTgzZjMtMjU1NjJhZTJlZGYwIiwic2lkIjoiYjM3OGVkMDctNmFmMi00YzA1LWI4OTMtNzU5ZjYzMjk3NTg1In0.x4NZLLNWR9mU3rY35UToBQOHvdO_9eSPHGQx5rGD5uc",
  "access_expires_at": "2026-10-28T14:32:44.114570675Z",
  "refresh_token": "_YBZAvU7LmEWUBcUNNq-XANEpe2MuLxajrUQsu4NNuM",
  "refresh_expires_at": "2026-10-29T02:17:44.114092057Z",
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
  "command_id": "b9cebca4-c3a6-410f-bd6d-6705bb305a19",
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
  "changed_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T14:17:44.663845139Z"
}
```

## The rider books the airport for 2026-10-28T17:17:43Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600375206",
  "device_ref": "sandbox-12347"
}
```

```json
{
  "challenge_id": "5ac184cd-ea7f-4073-874d-bc3cac638aa4",
  "expires_at": "2026-10-28T14:22:44.94183109Z",
  "resend_available_at": "2026-10-28T14:17:45.94183109Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600375206` → **200**

```json
{
  "phone": "+48600375206",
  "audience": "CLIENT",
  "code": "291626",
  "sent_at": "2026-10-28T14:17:44.943905508Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ac184cd-ea7f-4073-874d-bc3cac638aa4",
  "code": "291626",
  "device_ref": "sandbox-12347"
}
```

```json
{
  "session_id": "8ea70213-05fb-44ae-868a-4409c4c8e5c0",
  "subject": {
    "type": "CLIENT",
    "id": "a1f92143-cf84-4aff-8f32-f7bf0a789336"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWY5MjE0My1jZjg0LTRhZmYtOGYzMi1mN2JmMGE3ODkzMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTY1LCJpYXQiOjE3OTMxOTcwNjUsImp0aSI6IjJkOTQ5NDdmLWQyNGItNGI1OS1hOTE0LTRjMGI2ODNhN2Q2MSIsInNpZCI6IjhlYTcwMjEzLTA1ZmItNDRhZS04NjhhLTQ0MDljNGM4ZTVjMCJ9.emp1__66jpMbbz7AeVmjtAQZygyYnJBE-0--S9N_-D8",
  "access_expires_at": "2026-10-28T14:32:45.234795728Z",
  "refresh_token": "jD5dXv1hErXKvkDVcX0XpyRoo8S-wHEjBGIaDUMMOvM",
  "refresh_expires_at": "2026-11-27T14:17:45.234150269Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b4214b2c-9594-4ad2-afce-ca2db1a73ace",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T17:17:43Z"
}
```

```json
{
  "id": "5d4af6b9-d85b-4c9d-8ec5-9c611f1340bc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:45.506436Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:17:43Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "889b4fec-7ee3-4360-a81d-ed67697ead60",
  "quote_id": "5d4af6b9-d85b-4c9d-8ec5-9c611f1340bc",
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
  "pickup_at": "2026-10-28T17:17:43Z"
}
```

```json
{
  "id": "14923754-0e8f-49c9-8442-63b7c61ec5c4",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a1f92143-cf84-4aff-8f32-f7bf0a789336",
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
  "created_at": "2026-10-28T14:17:45.797327Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:17:43Z",
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
  "device_ref": "sandbox-26973"
}
```

```json
{
  "challenge_id": "4dd5c4db-a55e-4561-8190-e63a38a650d9",
  "expires_at": "2026-10-28T14:22:46.084155222Z",
  "resend_available_at": "2026-10-28T14:17:47.084155222Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "297224",
  "sent_at": "2026-10-28T14:17:46.087691082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4dd5c4db-a55e-4561-8190-e63a38a650d9",
  "code": "297224",
  "device_ref": "sandbox-26973"
}
```

```json
{
  "session_id": "e7e3e2f7-e32b-4595-b46f-f9285ea95f5a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzk2NiwiaWF0IjoxNzkzMTk3MDY2LCJqdGkiOiI1MDcxM2IyZS0zNjZkLTRjYzctODk2ZC1hZjFlMTIzZmUzMWIiLCJzaWQiOiJlN2UzZTJmNy1lMzJiLTQ1OTUtYjQ2Zi1mOTI4NWVhOTVmNWEifQ.93b-ZPIqbpUYtkE3KgFKaV20SE9ScW75rOYI_osFZBM",
  "access_expires_at": "2026-10-28T14:32:46.384839508Z",
  "refresh_token": "nW0gW7pl9hwVduxIPyg6BTxVTV-8q2g1ibRyal49wc8",
  "refresh_expires_at": "2026-11-27T14:17:46.384325224Z",
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
  "command_id": "e30404b7-2704-44ab-b719-c4aa635b1210",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:17:46Z",
    "sequence": 1793197066907
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c0b9ac73-b2f6-4f15-9b18-63def21f7b60",
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
  "last_heartbeat_at": "2026-10-28T14:17:46.925769Z",
  "last_location_at": "2026-10-28T14:17:46.925769Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "14923754-0e8f-49c9-8442-63b7c61ec5c4",
      "short_number": 20,
      "pickup_at": "2026-10-28T17:17:43Z",
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

`POST /api/driver/v1/preorders/14923754-0e8f-49c9-8442-63b7c61ec5c4/reserve` → **200**

```json
{
  "command_id": "fa7cd52b-b8a7-41f4-95a9-d783b3622543"
}
```

```json
{
  "id": "7ddd0261-014e-4797-af4d-44bbff741a89",
  "state": "RESERVED",
  "order": {
    "order_id": "14923754-0e8f-49c9-8442-63b7c61ec5c4",
    "short_number": 20,
    "pickup_at": "2026-10-28T17:17:43Z",
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
  "reserved_at": "2026-10-28T14:17:47.470778Z",
  "confirm_from": "2026-10-28T16:47:43Z",
  "confirm_until": "2026-10-28T16:57:43Z",
  "drop_until": "2026-10-28T16:17:43Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "7ddd0261-014e-4797-af4d-44bbff741a89",
      "state": "RESERVED",
      "order": {
        "order_id": "14923754-0e8f-49c9-8442-63b7c61ec5c4",
        "short_number": 20,
        "pickup_at": "2026-10-28T17:17:43Z",
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
      "reserved_at": "2026-10-28T14:17:47.470778Z",
      "confirm_from": "2026-10-28T16:47:43Z",
      "confirm_until": "2026-10-28T16:57:43Z",
      "drop_until": "2026-10-28T16:17:43Z"
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
      "id": "7ddd0261-014e-4797-af4d-44bbff741a89",
      "state": "RESERVED",
      "order": {
        "order_id": "14923754-0e8f-49c9-8442-63b7c61ec5c4",
        "short_number": 20,
        "pickup_at": "2026-10-28T17:17:43Z",
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
      "reserved_at": "2026-10-28T14:17:47.470778Z",
      "confirm_from": "2026-10-28T16:47:43Z",
      "confirm_until": "2026-10-28T16:57:43Z",
      "drop_until": "2026-10-28T16:17:43Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/7ddd0261-014e-4797-af4d-44bbff741a89/confirm` → **409**

```json
{
  "command_id": "f8698531-1723-44d5-8ae7-dff9df52cdff"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/7ddd0261-014e-4797-af4d-44bbff741a89/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "cd79ccc9-50db-453c-a45c-1fb3e3e59895"
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
  "session_id": "1b33de01-e856-43ee-97b6-30e6f1a9f7b4",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NjgsImlhdCI6MTc5MzE5NzA2OCwianRpIjoiY2U4ZjE2YmItZWU0ZC00MWZmLTg1YWYtOTFmODQ2ZDc5ZmQ4Iiwic2lkIjoiMWIzM2RlMDEtZTg1Ni00M2VlLTk3YjYtMzBlNmYxYTlmN2I0In0.FNyeh13LtOafKi4nVFZQJVtA9HeCL5_vS_c_fAlIyOU",
  "access_expires_at": "2026-10-28T14:32:48.899844396Z",
  "refresh_token": "X4wJS9rMLeR22t7cTyfdfJx7YhmPzZN_TNHP7b1Cdug",
  "refresh_expires_at": "2026-10-29T02:17:48.899320869Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/14923754-0e8f-49c9-8442-63b7c61ec5c4` → **200**

```json
{
  "id": "14923754-0e8f-49c9-8442-63b7c61ec5c4",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "a1f92143-cf84-4aff-8f32-f7bf0a789336",
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
  "created_at": "2026-10-28T14:17:45.797327Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T17:17:43Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "7ddd0261-014e-4797-af4d-44bbff741a89",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T14:17:47.470778Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/14923754-0e8f-49c9-8442-63b7c61ec5c4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T14:17:45.798442Z",
      "actor": {
        "type": "CLIENT",
        "id": "a1f92143-cf84-4aff-8f32-f7bf0a789336",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "14923754-0e8f-49c9-8442-63b7c61ec5c4",
        "preorder": true,
        "quote_id": "5d4af6b9-d85b-4c9d-8ec5-9c611f1340bc",
        "pickup_at": "2026-10-28T17:17:43Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "ff3ae61e-b5cb-42af-b41a-d0f2e90a64e8"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T14:17:47.471845Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "14923754-0e8f-49c9-8442-63b7c61ec5c4",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "7ddd0261-014e-4797-af4d-44bbff741a89"
      },
      "correlation_id": "509c1885-4e15-498b-be09-5ccb01cb4feb"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 14923754-0e8f-49c9-8442-63b7c61ec5c4, reservation 7ddd0261-014e-4797-af4d-44bbff741a89.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4927"
}
```

```json
{
  "challenge_id": "a29d4ac2-8541-4bd4-9214-97b8d0ad2867",
  "expires_at": "2026-10-28T14:22:49.725317089Z",
  "resend_available_at": "2026-10-28T14:17:50.725317089Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "634033",
  "sent_at": "2026-10-28T14:17:49.727518983Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a29d4ac2-8541-4bd4-9214-97b8d0ad2867",
  "code": "634033",
  "device_ref": "sandbox-4927"
}
```

```json
{
  "session_id": "0d1ce813-7903-45b6-92a3-a72140c95e8d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzk3MCwiaWF0IjoxNzkzMTk3MDcwLCJqdGkiOiI1ZDFmYzdmNC03NDM0LTRiMmMtOGFjZC04ZmVkMTE4NjkwZGYiLCJzaWQiOiIwZDFjZTgxMy03OTAzLTQ1YjYtOTJhMy1hNzIxNDBjOTVlOGQifQ.W7v-7p1g92RQm-3vhU1Rp7n-g4rBoBoAOF9RFPfMHrM",
  "access_expires_at": "2026-10-28T14:32:50.019498724Z",
  "refresh_token": "y9yY-jsC7ZGC_oNe0zc834dyqbVpWBcOwchT-t630C8",
  "refresh_expires_at": "2026-11-27T14:17:50.019015216Z",
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
  "command_id": "0df6d863-9744-4da3-a9ba-7cc3f4eac0f4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:17:50Z",
    "sequence": 1793197070563
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b097aaf-1c39-44d3-8430-aa5e506beeff",
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
  "last_heartbeat_at": "2026-10-28T14:17:50.584955Z",
  "last_location_at": "2026-10-28T14:17:50.584955Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675478749",
  "device_ref": "sandbox-19058"
}
```

```json
{
  "challenge_id": "423253f3-f20e-4a0f-87ed-2b7baad50235",
  "expires_at": "2026-10-28T14:22:50.852025814Z",
  "resend_available_at": "2026-10-28T14:17:51.852025814Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675478749` → **200**

```json
{
  "phone": "+380675478749",
  "audience": "CLIENT",
  "code": "675564",
  "sent_at": "2026-10-28T14:17:50.854276119Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "423253f3-f20e-4a0f-87ed-2b7baad50235",
  "code": "675564",
  "device_ref": "sandbox-19058"
}
```

```json
{
  "session_id": "59fa3179-8724-40dc-8a8e-c088681ea4e5",
  "subject": {
    "type": "CLIENT",
    "id": "4ba256c8-ba13-4939-b2d7-f42af51edeb7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YmEyNTZjOC1iYTEzLTQ5MzktYjJkNy1mNDJhZjUxZWRlYjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTcxLCJpYXQiOjE3OTMxOTcwNzEsImp0aSI6IjdjNGY3MTE1LWJkYzQtNDg0MS05YzQ1LTVhZmFmMTkzOGEyNSIsInNpZCI6IjU5ZmEzMTc5LTg3MjQtNDBkYy04YThlLWMwODg2ODFlYTRlNSJ9.IJqdRG1rQTESlJUAjcdQqXzqvjH3JEJWmswpg-8Ui1A",
  "access_expires_at": "2026-10-28T14:32:51.150404074Z",
  "refresh_token": "5mG0gNyf9BhSRwH0DhAaoSSAnRZprTZuzVMGpBwbCYs",
  "refresh_expires_at": "2026-11-27T14:17:51.149839466Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b2273b1c-aed2-40fd-a95e-35684e5ecb55",
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
  "id": "498e8734-dc3b-4db7-b792-872c117fec67",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:51.424139Z",
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
  "command_id": "81e69b1a-8d01-451e-b3e9-852b679a0f25",
  "quote_id": "498e8734-dc3b-4db7-b792-872c117fec67",
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
  "id": "7ebb322e-c98c-42ba-9fa4-566f924f471b",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4ba256c8-ba13-4939-b2d7-f42af51edeb7",
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
  "created_at": "2026-10-28T14:17:51.698673Z",
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
    "id": "e4537355-a976-4e32-94e4-db976a8ed937",
    "order_id": "7ebb322e-c98c-42ba-9fa4-566f924f471b",
    "expires_at": "2026-10-28T14:18:06.701489Z",
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

`POST /api/driver/v1/offers/e4537355-a976-4e32-94e4-db976a8ed937/accept` → **200**

```json
{
  "command_id": "bf17f667-27c5-4805-9c07-d1169431db7f"
}
```

```json
{
  "id": "d6c5dfe7-d5dc-4f96-9e09-a89cd7ba7b58",
  "order_id": "7ebb322e-c98c-42ba-9fa4-566f924f471b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9db5e7cb-8056-4bad-b566-a999a43894cc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9db5e7cb-8056-4bad-b566-a999a43894cc",
  "order_id": "7ebb322e-c98c-42ba-9fa4-566f924f471b",
  "assignment_id": "d6c5dfe7-d5dc-4f96-9e09-a89cd7ba7b58",
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

`POST /api/driver/v1/work-sessions/6b097aaf-1c39-44d3-8430-aa5e506beeff/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:17:52Z",
    "sequence": 1793197072789
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b097aaf-1c39-44d3-8430-aa5e506beeff",
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
  "last_heartbeat_at": "2026-10-28T14:17:52.808215Z",
  "last_location_at": "2026-10-28T14:17:52.808215Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9db5e7cb-8056-4bad-b566-a999a43894cc",
  "order_id": "7ebb322e-c98c-42ba-9fa4-566f924f471b",
  "assignment_id": "d6c5dfe7-d5dc-4f96-9e09-a89cd7ba7b58",
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

`POST /api/driver/v1/trips/9db5e7cb-8056-4bad-b566-a999a43894cc/arrive` → **200**

```json
{
  "command_id": "d6f85dee-cf3b-477f-8794-c7d9c6548f8e",
  "expected_version": 0
}
```

```json
{
  "id": "9db5e7cb-8056-4bad-b566-a999a43894cc",
  "order_id": "7ebb322e-c98c-42ba-9fa4-566f924f471b",
  "assignment_id": "d6c5dfe7-d5dc-4f96-9e09-a89cd7ba7b58",
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
  "arrived_at": "2026-10-28T14:17:53.328151Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9db5e7cb-8056-4bad-b566-a999a43894cc/start` → **200**

```json
{
  "command_id": "584eba3b-1c33-42e5-b100-b3186b36b51b",
  "expected_version": 1
}
```

```json
{
  "id": "9db5e7cb-8056-4bad-b566-a999a43894cc",
  "order_id": "7ebb322e-c98c-42ba-9fa4-566f924f471b",
  "assignment_id": "d6c5dfe7-d5dc-4f96-9e09-a89cd7ba7b58",
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
  "arrived_at": "2026-10-28T14:17:53.328151Z",
  "started_at": "2026-10-28T14:17:53.600406Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/6b097aaf-1c39-44d3-8430-aa5e506beeff/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:17:53Z",
    "sequence": 1793197073861
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b097aaf-1c39-44d3-8430-aa5e506beeff",
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
  "last_heartbeat_at": "2026-10-28T14:17:53.880782Z",
  "last_location_at": "2026-10-28T14:17:53.880782Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/9db5e7cb-8056-4bad-b566-a999a43894cc/complete` → **200**

```json
{
  "command_id": "d9402ed1-d1c9-410c-a29d-06c0fd8e8581",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:17:54Z",
  "cash_received": true
}
```

```json
{
  "id": "9db5e7cb-8056-4bad-b566-a999a43894cc",
  "order_id": "7ebb322e-c98c-42ba-9fa4-566f924f471b",
  "assignment_id": "d6c5dfe7-d5dc-4f96-9e09-a89cd7ba7b58",
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
  "arrived_at": "2026-10-28T14:17:53.328151Z",
  "started_at": "2026-10-28T14:17:53.600406Z",
  "completed_at": "2026-10-28T14:17:54.153782Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/7ebb322e-c98c-42ba-9fa4-566f924f471b/rating` → **200**

```json
{
  "command_id": "41d8b601-c36f-485d-98ec-b063b8f60d0b",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "7ebb322e-c98c-42ba-9fa4-566f924f471b",
  "score": 5,
  "created_at": "2026-10-28T14:17:54.49728477Z"
}
```

`POST /api/driver/v1/orders/7ebb322e-c98c-42ba-9fa4-566f924f471b/rating` → **200**

```json
{
  "command_id": "bfeaceca-3b5b-4dd2-b637-0acd00fbdd32",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "7ebb322e-c98c-42ba-9fa4-566f924f471b",
  "score": 4,
  "created_at": "2026-10-28T14:17:54.774024322Z"
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
  "session_id": "b3f22309-2656-407d-bf94-1c71f9686da1",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NzUsImlhdCI6MTc5MzE5NzA3NSwianRpIjoiYjlkZTU2NzUtZTA1Ny00MzIzLWExYTktNzc3ODY1Yzg0MjA5Iiwic2lkIjoiYjNmMjIzMDktMjY1Ni00MDdkLWJmOTQtMWM3MWY5Njg2ZGExIn0._tr6WM2fM-KJojcpuC4hlx8udnkGYl46_G35_4clXGg",
  "access_expires_at": "2026-10-28T14:32:55.647544976Z",
  "refresh_token": "XJOIG4St3IKjNw4kAbhTuYUhrRLOhp53dgsMSKBkR2w",
  "refresh_expires_at": "2026-10-29T02:17:55.647060917Z",
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
  "session_id": "76226301-9bc1-43b6-860c-bdd1e5f5f4c5",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NzYsImlhdCI6MTc5MzE5NzA3NiwianRpIjoiZDYyZTNiYzgtYTIyNy00NGJkLTk1YTQtYzczZjVhODVkMWRiIiwic2lkIjoiNzYyMjYzMDEtOWJjMS00M2I2LTg2MGMtYmRkMWU1ZjVmNGM1In0.Qb0aTXbSDUkX9mw643_nVxbrPwb2ubUE8Mvd9hMmpcc",
  "access_expires_at": "2026-10-28T14:32:56.248844992Z",
  "refresh_token": "KdF78dw6xzKBJZTLsa5-zIqyV8L2k_JSPbzPurElLI8",
  "refresh_expires_at": "2026-10-29T02:17:56.248368325Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7ebb322e-c98c-42ba-9fa4-566f924f471b/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "7ebb322e-c98c-42ba-9fa4-566f924f471b",
      "author_type": "RIDER",
      "author_id": "4ba256c8-ba13-4939-b2d7-f42af51edeb7",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T14:17:54.497285Z"
    },
    {
      "order_id": "7ebb322e-c98c-42ba-9fa4-566f924f471b",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "4ba256c8-ba13-4939-b2d7-f42af51edeb7",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T14:17:54.774024Z"
    }
  ]
}
```

Done: ratings for order 7ebb322e-c98c-42ba-9fa4-566f924f471b.

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
  "session_id": "14f25dc8-5ef5-4802-9550-d63d6154133c",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NzcsImlhdCI6MTc5MzE5NzA3NywianRpIjoiYmEwNTU2NzItMzIzNi00ZjE0LTgwMGItMjhkOTlkMGIyZmVmIiwic2lkIjoiMTRmMjVkYzgtNWVmNS00ODAyLTk1NTAtZDYzZDYxNTQxMzNjIn0.M9YT8N8H63HjLG165tRWLGVpcCpZViziw4GHEUPw6RE",
  "access_expires_at": "2026-10-28T14:32:57.128229357Z",
  "refresh_token": "a2lKNu6P_34qc4Nxms8SdHFS8xQqNUdRisEs2fxeCOg",
  "refresh_expires_at": "2026-10-29T02:17:57.127584385Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "4d975cf3-6655-4a2d-bef7-f9564a79d6d3",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "f48184a7-702b-4da7-9ad5-8bed224f498e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:17:57.412204Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f48184a7-702b-4da7-9ad5-8bed224f498e` → **200**

```json
{
  "id": "f48184a7-702b-4da7-9ad5-8bed224f498e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:17:57.412204Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f48184a7-702b-4da7-9ad5-8bed224f498e` → **200**

```json
{
  "id": "f48184a7-702b-4da7-9ad5-8bed224f498e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:17:57.412204Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f48184a7-702b-4da7-9ad5-8bed224f498e` → **200**

```json
{
  "id": "f48184a7-702b-4da7-9ad5-8bed224f498e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:17:57.412204Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f48184a7-702b-4da7-9ad5-8bed224f498e` → **200**

```json
{
  "id": "f48184a7-702b-4da7-9ad5-8bed224f498e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:17:57.412204Z",
  "ready_at": "2026-10-28T14:18:01.030323Z",
  "expires_at": "2026-10-29T14:18:01.030323Z"
}
```

`GET /api/admin/v1/reports/exports/f48184a7-702b-4da7-9ad5-8bed224f498e/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
total,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "d71cc66a-4c2f-44ae-8533-8e936817b1dd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "d72d3a3d-8bb5-42f8-961f-24f4968080c3",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:01.780999Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d72d3a3d-8bb5-42f8-961f-24f4968080c3` → **200**

```json
{
  "id": "d72d3a3d-8bb5-42f8-961f-24f4968080c3",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:01.780999Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d72d3a3d-8bb5-42f8-961f-24f4968080c3` → **200**

```json
{
  "id": "d72d3a3d-8bb5-42f8-961f-24f4968080c3",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:01.780999Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d72d3a3d-8bb5-42f8-961f-24f4968080c3` → **200**

```json
{
  "id": "d72d3a3d-8bb5-42f8-961f-24f4968080c3",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:01.780999Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d72d3a3d-8bb5-42f8-961f-24f4968080c3` → **200**

```json
{
  "id": "d72d3a3d-8bb5-42f8-961f-24f4968080c3",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:01.780999Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d72d3a3d-8bb5-42f8-961f-24f4968080c3` → **200**

```json
{
  "id": "d72d3a3d-8bb5-42f8-961f-24f4968080c3",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:18:01.780999Z",
  "ready_at": "2026-10-28T14:18:06.03927Z",
  "expires_at": "2026-10-29T14:18:06.03927Z"
}
```

`GET /api/admin/v1/reports/exports/d72d3a3d-8bb5-42f8-961f-24f4968080c3/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/ed7d04e9-e80a-49d5-912a-e4bc7338c432` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/ed7d04e9-e80a-49d5-912a-e4bc7338c432",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ae7cca74-43ee-4342-a676-51b0353b32a2"
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
  "device_ref": "sandbox-1943"
}
```

```json
{
  "challenge_id": "2d48dccc-3239-4a2e-a4d3-d12d190737d5",
  "expires_at": "2026-10-28T14:23:07.703834438Z",
  "resend_available_at": "2026-10-28T14:18:08.703834438Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "367478",
  "sent_at": "2026-10-28T14:18:07.706898577Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d48dccc-3239-4a2e-a4d3-d12d190737d5",
  "code": "367478",
  "device_ref": "sandbox-1943"
}
```

```json
{
  "session_id": "cfbbadaa-d244-4742-a322-5a1aaac5e4b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzk4NywiaWF0IjoxNzkzMTk3MDg3LCJqdGkiOiJhODMyZTg4YS0xYmI5LTRhOGEtODcyNi1iOWU5YjFhYmI3ZGYiLCJzaWQiOiJjZmJiYWRhYS1kMjQ0LTQ3NDItYTMyMi01YTFhYWFjNWU0YjcifQ.CQqAn43facQ9IJ2N9fAOPyQI_VlGDJTsKaIJX-sAWJs",
  "access_expires_at": "2026-10-28T14:33:07.997887763Z",
  "refresh_token": "z4TB3_sNpFGxXnD2hc1yTDoOy5wRZBgqQaufiLDpHiw",
  "refresh_expires_at": "2026-11-27T14:18:07.997409463Z",
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
  "command_id": "34f2547a-0fed-49d3-bd85-512efddec3b2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:08Z",
    "sequence": 1793197088785
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c7a9087d-8f7b-4fdf-9e9c-673ca847f381",
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
  "last_heartbeat_at": "2026-10-28T14:18:08.803832Z",
  "last_location_at": "2026-10-28T14:18:08.803832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "f2a55e61-e7b3-4e6a-8192-2a0174820191",
  "points": [
    {
      "sequence": 1793197091779,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:17:11Z"
    },
    {
      "sequence": 1793197091856,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:18:11Z"
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
  "session_id": "dc5d2094-10f4-4b3c-ba03-84f91347f411",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5OTEsImlhdCI6MTc5MzE5NzA5MSwianRpIjoiYzA5ZTgxNGYtN2ViYS00OTYxLWIwMTctMDkzM2RhZGZhMDAyIiwic2lkIjoiZGM1ZDIwOTQtMTBmNC00YjNjLWJhMDMtODRmOTEzNDdmNDExIn0.zOA5eJuaN1nl2e4TFum3L8ASrr8hJuWEbwVTdADT7eI",
  "access_expires_at": "2026-10-28T14:33:11.724517287Z",
  "refresh_token": "WWfmg6lpdbNTO-OwwkA7kP0dEr1c6VEdMUGKb-bOiC0",
  "refresh_expires_at": "2026-10-29T02:18:11.724022463Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "42fa2aa6-c563-425d-a6d4-321da598637c",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T14:18:11Z",
        "track_point_id": "e09ac4ec-0eff-4b55-9797-29ea700f05f2",
        "work_session_id": "c7a9087d-8f7b-4fdf-9e9c-673ca847f381"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T14:18:11Z",
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

`POST /api/admin/v1/driver-risk-flags/42fa2aa6-c563-425d-a6d4-321da598637c/confirm` → **200**

```json
{
  "command_id": "e5d1a856-bdce-4ef5-8681-0d93fa132cff",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "42fa2aa6-c563-425d-a6d4-321da598637c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T14:18:11Z",
    "track_point_id": "e09ac4ec-0eff-4b55-9797-29ea700f05f2",
    "work_session_id": "c7a9087d-8f7b-4fdf-9e9c-673ca847f381"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T14:18:11Z",
  "reason": null,
  "reviewed_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "reviewed_at": "2026-10-28T14:18:12.553592Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/42fa2aa6-c563-425d-a6d4-321da598637c/dismiss` → **409**

```json
{
  "command_id": "eef88820-bbb8-4694-a4e0-70e06214e7ef",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/42fa2aa6-c563-425d-a6d4-321da598637c/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "566c92c4-85cf-4562-a1f8-9a903e9f0d70"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "7ee26cc9-aa85-4de4-be54-4ccd4572939b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "e15265a3-f098-4bf3-8eb8-78219fa38188",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "raised_at": "2026-10-28T14:18:13.114411Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/e15265a3-f098-4bf3-8eb8-78219fa38188/dismiss` → **200**

```json
{
  "command_id": "ba6594ff-066a-4ded-9abd-4d501c33ecf5",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "e15265a3-f098-4bf3-8eb8-78219fa38188",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "raised_at": "2026-10-28T14:18:13.114411Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "reviewed_at": "2026-10-28T14:18:13.389523Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "a9e38984-8383-4631-a316-4f666ee48da8",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "42fa2aa6-c563-425d-a6d4-321da598637c"
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
      "actor_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:18:13.676178Z"
    }
  ]
}
```

Done: flag 42fa2aa6-c563-425d-a6d4-321da598637c confirmed, suspension named it, driver reinstated.

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
  "session_id": "d47b6817-fa97-4ba5-b51e-9b62c6b324a0",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5OTQsImlhdCI6MTc5MzE5NzA5NCwianRpIjoiNmExMTdhOWMtYmRkMS00NTZhLWI5NjYtNGU1ZDU5ZDYyZTBiIiwic2lkIjoiZDQ3YjY4MTctZmE5Ny00YmE1LWI1MWUtOWI2MmM2YjMyNGEwIn0.niSUMYzqHodc3O0o0kmNOHy5xuHkIw4RKi037RONY0A",
  "access_expires_at": "2026-10-28T14:33:14.546691484Z",
  "refresh_token": "qkCzh3GyzVpk7P3Cl7pvXxb6CPZgWnJed1ivwAGZUQE",
  "refresh_expires_at": "2026-10-29T02:18:14.546186394Z",
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
      "actor_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:18:13.676178Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "57e24ac9-f725-4a82-814b-ca31ed0dfcee",
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
  "session_id": "c7a9087d-8f7b-4fdf-9e9c-673ca847f381",
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
  "last_heartbeat_at": "2026-10-28T14:18:08.803832Z",
  "last_location_at": "2026-10-28T14:18:08.803832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c7a9087d-8f7b-4fdf-9e9c-673ca847f381/close` → **200**

```json
{
  "command_id": "2052b827-6514-4415-aacb-806c195a20b4",
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
  "session_id": "3df9c31f-2fef-40ab-b568-4d349165a817",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5OTYsImlhdCI6MTc5MzE5NzA5NiwianRpIjoiNWIzMTI2NjktN2E0ZC00MGM0LTg1OTctNTUzOWNhZjViMTY5Iiwic2lkIjoiM2RmOWMzMWYtMmZlZi00MGFiLWI1NjgtNGQzNDkxNjVhODE3In0.Yx8PbgTZCKv7AJAP9SM0AMAurHzKgEDZbTaoOHyzWeU",
  "access_expires_at": "2026-10-28T14:33:16.217311244Z",
  "refresh_token": "UQ-d69C9WdTCQRquZ7fmODSN5DClC3v7OEu4KTnYAWo",
  "refresh_expires_at": "2026-10-29T02:18:16.216801787Z",
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
  "command_id": "f3a0baf2-0d28-47a1-8cdf-871ac52ad49a",
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
  "changed_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:18:16.762843Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "f3a0baf2-0d28-47a1-8cdf-871ac52ad49a",
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
  "changed_by": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:18:16.762843Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48855908079",
  "device_ref": "sandbox-5563"
}
```

```json
{
  "challenge_id": "62c03206-f6af-4744-840a-1c833cddbffc",
  "expires_at": "2026-10-28T14:23:17.315763199Z",
  "resend_available_at": "2026-10-28T14:18:18.315763199Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48855908079` → **200**

```json
{
  "phone": "+48855908079",
  "audience": "CLIENT",
  "code": "255717",
  "sent_at": "2026-10-28T14:18:17.318011732Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62c03206-f6af-4744-840a-1c833cddbffc",
  "code": "255717",
  "device_ref": "sandbox-5563"
}
```

```json
{
  "session_id": "439eeda0-12d1-43b7-9726-c3f18aa323e5",
  "subject": {
    "type": "CLIENT",
    "id": "b96be476-b8f7-44e8-a5df-762e647b1ef0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOTZiZTQ3Ni1iOGY3LTQ0ZTgtYTVkZi03NjJlNjQ3YjFlZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTk3LCJpYXQiOjE3OTMxOTcwOTcsImp0aSI6ImI2MWUxNWZjLTlhMDgtNDYxOC05ZjczLThkYTIyNTBjOTIzMyIsInNpZCI6IjQzOWVlZGEwLTEyZDEtNDNiNy05NzI2LWMzZjE4YWEzMjNlNSJ9.5FsGYZZJsHTcru4uUokiXCzjiHdr_oJKSVmMquGPcx0",
  "access_expires_at": "2026-10-28T14:33:17.608442587Z",
  "refresh_token": "9OHkXenXtzm_QKvhLUHYvvmMqU732DdkoZBHvz2SRpE",
  "refresh_expires_at": "2026-11-27T14:18:17.607723498Z",
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
  "correlation_id": "b0eb7cce-f28b-4218-ab75-1dee3cbced5f"
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
  "device_ref": "sandbox-16124"
}
```

```json
{
  "challenge_id": "60d112d4-47f4-419f-bf56-9165a7503763",
  "expires_at": "2026-10-28T14:23:18.409420763Z",
  "resend_available_at": "2026-10-28T14:18:19.409420763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "482680",
  "sent_at": "2026-10-28T14:18:18.411528106Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60d112d4-47f4-419f-bf56-9165a7503763",
  "code": "482680",
  "device_ref": "sandbox-16124"
}
```

```json
{
  "session_id": "0d5ec530-b110-4e78-b685-16363479e48a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzk5OCwiaWF0IjoxNzkzMTk3MDk4LCJqdGkiOiI4NjViYmFiNi0yNTMwLTQxMmItOTQ2Mi05Mzg1MjFjZDY5MzkiLCJzaWQiOiIwZDVlYzUzMC1iMTEwLTRlNzgtYjY4NS0xNjM2MzQ3OWU0OGEifQ.bthIjcHLHwcT8zRd6lUASd9Rbu7hF0WbkTuTY31b5JQ",
  "access_expires_at": "2026-10-28T14:33:18.701332519Z",
  "refresh_token": "TVFAlHur8suLPLqRWQd8HSw-21VE5jshNSSmfT6sUD8",
  "refresh_expires_at": "2026-11-27T14:18:18.700773348Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c0b9ac73-b2f6-4f15-9b18-63def21f7b60",
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
  "last_heartbeat_at": "2026-10-28T14:17:46.925769Z",
  "last_location_at": "2026-10-28T14:17:46.925769Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c0b9ac73-b2f6-4f15-9b18-63def21f7b60/handover` → **200**

```json
{
  "command_id": "62a0ba59-b34d-466b-9495-7919d47c2e5f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c0b9ac73-b2f6-4f15-9b18-63def21f7b60",
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
  "last_heartbeat_at": "2026-10-28T14:17:46.925769Z",
  "last_location_at": "2026-10-28T14:17:46.925769Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c0b9ac73-b2f6-4f15-9b18-63def21f7b60/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:19Z",
    "sequence": 1793197099502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c0b9ac73-b2f6-4f15-9b18-63def21f7b60",
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
  "last_heartbeat_at": "2026-10-28T14:18:19.522394Z",
  "last_location_at": "2026-10-28T14:18:19.522394Z",
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
  "session_id": "c0b9ac73-b2f6-4f15-9b18-63def21f7b60",
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
  "last_heartbeat_at": "2026-10-28T14:18:19.522394Z",
  "last_location_at": "2026-10-28T14:18:19.522394Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c0b9ac73-b2f6-4f15-9b18-63def21f7b60/close` → **200**

```json
{
  "command_id": "0ca40d82-1183-448b-a057-ce0bf7d4f57e",
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
  "correlation_id": "178981af-89c9-4ce8-8aaf-d47eee5797cf"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674117481",
  "device_ref": "sandbox-26801"
}
```

```json
{
  "challenge_id": "826d35ba-21e0-4a59-8f33-f195348e942e",
  "expires_at": "2026-10-28T14:23:20.879743028Z",
  "resend_available_at": "2026-10-28T14:18:21.879743028Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674117481` → **200**

```json
{
  "phone": "+380674117481",
  "audience": "CLIENT",
  "code": "089710",
  "sent_at": "2026-10-28T14:18:20.882038716Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "826d35ba-21e0-4a59-8f33-f195348e942e",
  "code": "089710",
  "device_ref": "sandbox-26801"
}
```

```json
{
  "session_id": "a4093444-b1fb-4cfa-9314-02294f260526",
  "subject": {
    "type": "CLIENT",
    "id": "35872874-28f5-47a1-a040-a1521e09928e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNTg3Mjg3NC0yOGY1LTQ3YTEtYTA0MC1hMTUyMWUwOTkyOGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDAxLCJpYXQiOjE3OTMxOTcxMDEsImp0aSI6IjkyNzEzYzgzLTEyYmQtNGRhMS1iNDJjLWY4NTNmN2UxZWQzYSIsInNpZCI6ImE0MDkzNDQ0LWIxZmItNGNmYS05MzE0LTAyMjk0ZjI2MDUyNiJ9.ouPG7yuXxqRHjnAmVgLNBOx9w3gimuhyEV8ytS7Y-8c",
  "access_expires_at": "2026-10-28T14:33:21.179053177Z",
  "refresh_token": "tlqYDLwydykdpj3j7G4RMnqBGZFt-Sjadu6gIIoDyY0",
  "refresh_expires_at": "2026-11-27T14:18:21.17855688Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "887fb43d-d612-428f-aeee-725f20cb278b",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "78c2c3cf-4620-42c4-8186-84973236298e",
  "upload_path": "/api/rider/v1/uploads/78c2c3cf-4620-42c4-8186-84973236298e",
  "expires_at": "2026-10-28T14:33:21.453896101Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/78c2c3cf-4620-42c4-8186-84973236298e` → **200**

```json
{
  "file_id": "78c2c3cf-4620-42c4-8186-84973236298e",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "697bf7ec-31d0-4516-8ba5-9d9473c2b03e",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "78c2c3cf-4620-42c4-8186-84973236298e"
  ]
}
```

```json
{
  "id": "f8b5a2e4-5a8a-4bca-a5af-31cf82f584d8",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "35872874-28f5-47a1-a040-a1521e09928e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:18:21.759854Z",
  "updated_at": "2026-10-28T14:18:21.759854Z",
  "messages": [
    {
      "id": "43fd3cea-4823-4c09-8667-d84dfa68285a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "35872874-28f5-47a1-a040-a1521e09928e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:18:21.761257Z",
      "attachments": [
        {
          "file_id": "78c2c3cf-4620-42c4-8186-84973236298e",
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
  "session_id": "96442a68-5ccb-466a-a846-9e304e42bac7",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMDIsImlhdCI6MTc5MzE5NzEwMiwianRpIjoiNDM3NzIwYmMtZTQ0ZC00NmJhLWJjNDctMTkyMmZlMGI2MjZlIiwic2lkIjoiOTY0NDJhNjgtNWNjYi00NjZhLWE4NDYtOWUzMDRlNDJiYWM3In0.LISjonM9IHJClhcuA49_p2LSeUPWLFo1IbpoouZo_ws",
  "access_expires_at": "2026-10-28T14:33:22.378790905Z",
  "refresh_token": "CK9jdd41JD7mC0bOtyHkpx6zqPcA1S_CxTYjlqrBRBU",
  "refresh_expires_at": "2026-10-29T02:18:22.378064086Z",
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
  "session_id": "39b51c33-a981-4a34-9da1-b45e52a6a6f4",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMDIsImlhdCI6MTc5MzE5NzEwMiwianRpIjoiY2FlODY2MzgtZDVjOS00YjE4LThiYTUtOGI5ZmQ5NmQzZTMwIiwic2lkIjoiMzliNTFjMzMtYTk4MS00YTM0LTlkYTEtYjQ1ZTUyYTZhNmY0In0.h0dsz8iwxKcf--h0tdBIhBb0GNSJwJ5lcTnMJK-MWE8",
  "access_expires_at": "2026-10-28T14:33:22.972332909Z",
  "refresh_token": "VsmDpNtZv8nfonZLUhUwPli1SnHo1NKTM3ZRhn-PrfM",
  "refresh_expires_at": "2026-10-29T02:18:22.97176062Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/f8b5a2e4-5a8a-4bca-a5af-31cf82f584d8/attachments/78c2c3cf-4620-42c4-8186-84973236298e` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "328cc4de-c245-4057-a96a-79d1d2813384",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "aed561dd-d1bb-4ab4-b455-488d7d40cb6e",
  "upload_path": "/api/operator/v1/uploads/aed561dd-d1bb-4ab4-b455-488d7d40cb6e",
  "expires_at": "2026-10-28T14:33:23.24918229Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/aed561dd-d1bb-4ab4-b455-488d7d40cb6e` → **200**

```json
{
  "file_id": "aed561dd-d1bb-4ab4-b455-488d7d40cb6e",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/f8b5a2e4-5a8a-4bca-a5af-31cf82f584d8` → **200**

```json
{
  "id": "f8b5a2e4-5a8a-4bca-a5af-31cf82f584d8",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "35872874-28f5-47a1-a040-a1521e09928e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:18:21.759854Z",
  "updated_at": "2026-10-28T14:18:21.759854Z",
  "messages": [
    {
      "id": "43fd3cea-4823-4c09-8667-d84dfa68285a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "35872874-28f5-47a1-a040-a1521e09928e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:18:21.761257Z",
      "attachments": [
        {
          "file_id": "78c2c3cf-4620-42c4-8186-84973236298e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/f8b5a2e4-5a8a-4bca-a5af-31cf82f584d8/comments` → **200**

```json
{
  "command_id": "5716b6e2-5a10-481b-b902-f7798ca01799",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "aed561dd-d1bb-4ab4-b455-488d7d40cb6e"
  ]
}
```

```json
{
  "id": "f8b5a2e4-5a8a-4bca-a5af-31cf82f584d8",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "35872874-28f5-47a1-a040-a1521e09928e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:18:21.759854Z",
  "updated_at": "2026-10-28T14:18:23.831193Z",
  "messages": [
    {
      "id": "43fd3cea-4823-4c09-8667-d84dfa68285a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "35872874-28f5-47a1-a040-a1521e09928e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:18:21.761257Z",
      "attachments": [
        {
          "file_id": "78c2c3cf-4620-42c4-8186-84973236298e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "515e8ed0-cdf9-4421-ba2b-ebbd3d33459d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:18:23.830797Z",
      "attachments": [
        {
          "file_id": "aed561dd-d1bb-4ab4-b455-488d7d40cb6e",
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

`GET /api/rider/v1/support/cases/f8b5a2e4-5a8a-4bca-a5af-31cf82f584d8` → **200**

```json
{
  "id": "f8b5a2e4-5a8a-4bca-a5af-31cf82f584d8",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "35872874-28f5-47a1-a040-a1521e09928e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:18:21.759854Z",
  "updated_at": "2026-10-28T14:18:23.831193Z",
  "messages": [
    {
      "id": "43fd3cea-4823-4c09-8667-d84dfa68285a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "35872874-28f5-47a1-a040-a1521e09928e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:18:21.761257Z",
      "attachments": [
        {
          "file_id": "78c2c3cf-4620-42c4-8186-84973236298e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "515e8ed0-cdf9-4421-ba2b-ebbd3d33459d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:18:23.830797Z",
      "attachments": [
        {
          "file_id": "aed561dd-d1bb-4ab4-b455-488d7d40cb6e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/f8b5a2e4-5a8a-4bca-a5af-31cf82f584d8/attachments/aed561dd-d1bb-4ab4-b455-488d7d40cb6e` → **200**

Done: support case f8b5a2e4-5a8a-4bca-a5af-31cf82f584d8, rider attachment 78c2c3cf-4620-42c4-8186-84973236298e, operator attachment aed561dd-d1bb-4ab4-b455-488d7d40cb6e.

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
  "session_id": "69f7dc83-f24b-4b88-a2c7-b2df07dff054",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMDQsImlhdCI6MTc5MzE5NzEwNCwianRpIjoiOTY0ZWRjOGEtMjYxYy00ZWU0LTg4ZDctYWQwMThiMTM3ZjA4Iiwic2lkIjoiNjlmN2RjODMtZjI0Yi00Yjg4LWEyYzctYjJkZjA3ZGZmMDU0In0.CZ3JylYsri4UqHnV-HhyiePhXMTe-Z6xhmirfXK9XJg",
  "access_expires_at": "2026-10-28T14:33:24.742373659Z",
  "refresh_token": "_O_BfzfUUJGy-_nilA2OC9JRCdtNkwCguN3XMcESD4w",
  "refresh_expires_at": "2026-10-29T02:18:24.741800979Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30236"
}
```

```json
{
  "challenge_id": "59741877-93d7-4efe-8c6f-f82696eb6753",
  "expires_at": "2026-10-28T14:23:25.004518231Z",
  "resend_available_at": "2026-10-28T14:18:26.004518231Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "719033",
  "sent_at": "2026-10-28T14:18:25.006794075Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59741877-93d7-4efe-8c6f-f82696eb6753",
  "code": "719033",
  "device_ref": "sandbox-30236"
}
```

```json
{
  "session_id": "fa7993b6-e842-4099-b8d4-32a0ef8b1d59",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODAwNSwiaWF0IjoxNzkzMTk3MTA1LCJqdGkiOiIyMmJmOTI5OC1kNDJkLTQxYTktYWRkYS03MWY4ZGEzZDM2MTciLCJzaWQiOiJmYTc5OTNiNi1lODQyLTQwOTktYjhkNC0zMmEwZWY4YjFkNTkifQ.QWR6JrdV1j4HVwl9tORao1oQbBmRUVJZ2yrGlmW3Ba4",
  "access_expires_at": "2026-10-28T14:33:25.298269542Z",
  "refresh_token": "i2ITaW_GvPvrD4Fc7S8LcZ24WJsT8m-UcYgk3PDS-OY",
  "refresh_expires_at": "2026-11-27T14:18:25.29769519Z",
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
      "actor_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:18:13.676178Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T14:18:15.085492Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "2cbfbbed-9829-478e-be3c-7efd427de78a",
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
  "device_ref": "sandbox-24385"
}
```

```json
{
  "challenge_id": "f082a0cc-c804-48fe-9ffa-99d664793634",
  "expires_at": "2026-10-28T14:23:26.375265724Z",
  "resend_available_at": "2026-10-28T14:18:27.375265724Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "353366",
  "sent_at": "2026-10-28T14:18:26.377264632Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f082a0cc-c804-48fe-9ffa-99d664793634",
  "code": "353366",
  "device_ref": "sandbox-24385"
}
```

```json
{
  "session_id": "825f1173-8504-4b79-a8cf-efed7ef8f840",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODAwNiwiaWF0IjoxNzkzMTk3MTA2LCJqdGkiOiI5NjIxNzNkMi1kMTBlLTQ5NWQtOGQxMC00ZTc4NzMxZGIyZTUiLCJzaWQiOiI4MjVmMTE3My04NTA0LTRiNzktYThjZi1lZmVkN2VmOGY4NDAifQ.XVRLbBLSgsCgBzDmhNcTsdyDi7KA7QNlqZshZcuJKt0",
  "access_expires_at": "2026-10-28T14:33:26.664363906Z",
  "refresh_token": "FPgSzv6zdEJ_alYMP6dNtc6V4wFW46Y_LeAErLWCMe0",
  "refresh_expires_at": "2026-11-27T14:18:26.663741011Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b097aaf-1c39-44d3-8430-aa5e506beeff",
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
  "last_heartbeat_at": "2026-10-28T14:17:53.880782Z",
  "last_location_at": "2026-10-28T14:17:53.880782Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6b097aaf-1c39-44d3-8430-aa5e506beeff/handover` → **200**

```json
{
  "command_id": "fb1741a5-ccd1-44ab-a550-d6d2dfa888ba",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b097aaf-1c39-44d3-8430-aa5e506beeff",
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
  "last_heartbeat_at": "2026-10-28T14:17:53.880782Z",
  "last_location_at": "2026-10-28T14:17:53.880782Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6b097aaf-1c39-44d3-8430-aa5e506beeff/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:27Z",
    "sequence": 1793197107454
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b097aaf-1c39-44d3-8430-aa5e506beeff",
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
  "last_heartbeat_at": "2026-10-28T14:18:27.473143Z",
  "last_location_at": "2026-10-28T14:18:27.473143Z",
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
  "command_id": "cbfd24d5-3602-43e7-8ab0-48379ac35c4b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:27Z",
    "sequence": 1793197107995
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0890e5a9-b189-4bd6-9b4c-30c6fcdf24f6",
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
  "last_heartbeat_at": "2026-10-28T14:18:28.016134Z",
  "last_location_at": "2026-10-28T14:18:28.016134Z",
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
  "session_id": "da43cd91-11d9-46a2-be7c-13476368d8d4",
  "subject": {
    "type": "STAFF",
    "id": "27cfa9ff-b784-4f83-81bb-26217b7bebaa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2NmYTlmZi1iNzg0LTRmODMtODFiYi0yNjIxN2I3YmViYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMDgsImlhdCI6MTc5MzE5NzEwOCwianRpIjoiZjNkYjg5NGQtNTNhNC00OTUzLTljM2QtY2RhZTU4ZTBiZGMyIiwic2lkIjoiZGE0M2NkOTEtMTFkOS00NmEyLWJlN2MtMTM0NzYzNjhkOGQ0In0.vbILAKGF_FrGepR2uCVQZnaFSs7wBL7mA_o9h7hFD5M",
  "access_expires_at": "2026-10-28T14:33:28.618137573Z",
  "refresh_token": "gfSaKilGP8H-veYQ0MDZpSdF3wgZ_7QwBTNar9xWbkE",
  "refresh_expires_at": "2026-10-29T02:18:28.617613275Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bfe13075-be91-4e65-9989-162e9a39c2c2",
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
  "id": "7c1a53b2-4371-4c4a-9d5f-f45601bc420b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:23:28.887284Z",
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
  "command_id": "f415c523-226b-4fd8-b552-5de311384bd8",
  "quote_id": "7c1a53b2-4371-4c4a-9d5f-f45601bc420b",
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
  "id": "8af2525d-bc3e-4202-8a1d-957c4d69d845",
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
  "created_at": "2026-10-28T14:18:29.165682Z",
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
    "id": "4fa3ae5b-f4f3-4598-8f82-7a76de94bc51",
    "order_id": "8af2525d-bc3e-4202-8a1d-957c4d69d845",
    "expires_at": "2026-10-28T14:18:44.169967Z",
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

`POST /api/driver/v1/offers/4fa3ae5b-f4f3-4598-8f82-7a76de94bc51/accept` → **200**

```json
{
  "command_id": "0e02c07f-1eab-4727-9909-306988770766"
}
```

```json
{
  "id": "f7ae4631-e590-4eb9-b957-50c24479e916",
  "order_id": "8af2525d-bc3e-4202-8a1d-957c4d69d845",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "58c4b561-a333-4a96-85d7-cdbb384f6bc7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "58c4b561-a333-4a96-85d7-cdbb384f6bc7",
  "order_id": "8af2525d-bc3e-4202-8a1d-957c4d69d845",
  "assignment_id": "f7ae4631-e590-4eb9-b957-50c24479e916",
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

`POST /api/driver/v1/work-sessions/0890e5a9-b189-4bd6-9b4c-30c6fcdf24f6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:30Z",
    "sequence": 1793197110512
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0890e5a9-b189-4bd6-9b4c-30c6fcdf24f6",
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
  "last_heartbeat_at": "2026-10-28T14:18:30.53111Z",
  "last_location_at": "2026-10-28T14:18:30.53111Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/58c4b561-a333-4a96-85d7-cdbb384f6bc7/arrive` → **200**

```json
{
  "command_id": "4f930a2e-935a-4e15-a04c-dc3c8af13994",
  "expected_version": 0
}
```

```json
{
  "id": "58c4b561-a333-4a96-85d7-cdbb384f6bc7",
  "order_id": "8af2525d-bc3e-4202-8a1d-957c4d69d845",
  "assignment_id": "f7ae4631-e590-4eb9-b957-50c24479e916",
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
  "arrived_at": "2026-10-28T14:18:30.806798Z",
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

`POST /api/driver/v1/trips/58c4b561-a333-4a96-85d7-cdbb384f6bc7/start` → **200**

```json
{
  "command_id": "333f5b42-c270-4c0c-b68a-dacae334e892",
  "expected_version": 1
}
```

```json
{
  "id": "58c4b561-a333-4a96-85d7-cdbb384f6bc7",
  "order_id": "8af2525d-bc3e-4202-8a1d-957c4d69d845",
  "assignment_id": "f7ae4631-e590-4eb9-b957-50c24479e916",
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
  "arrived_at": "2026-10-28T14:18:30.806798Z",
  "started_at": "2026-10-28T14:18:31.088443Z",
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

`POST /api/driver/v1/trips/58c4b561-a333-4a96-85d7-cdbb384f6bc7/complete` → **200**

```json
{
  "command_id": "3366b4de-d590-4522-bc09-8c7bdc61ffc4",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:18:31Z",
  "cash_received": true
}
```

```json
{
  "id": "58c4b561-a333-4a96-85d7-cdbb384f6bc7",
  "order_id": "8af2525d-bc3e-4202-8a1d-957c4d69d845",
  "assignment_id": "f7ae4631-e590-4eb9-b957-50c24479e916",
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
  "arrived_at": "2026-10-28T14:18:30.806798Z",
  "started_at": "2026-10-28T14:18:31.088443Z",
  "completed_at": "2026-10-28T14:18:31.375512Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/8af2525d-bc3e-4202-8a1d-957c4d69d845` → **200**

```json
{
  "id": "8af2525d-bc3e-4202-8a1d-957c4d69d845",
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
    "id": "f7ae4631-e590-4eb9-b957-50c24479e916",
    "order_id": "8af2525d-bc3e-4202-8a1d-957c4d69d845",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "58c4b561-a333-4a96-85d7-cdbb384f6bc7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:18:29.165682Z",
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
  "session_id": "6b097aaf-1c39-44d3-8430-aa5e506beeff",
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
  "last_heartbeat_at": "2026-10-28T14:18:27.473143Z",
  "last_location_at": "2026-10-28T14:18:27.473143Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6b097aaf-1c39-44d3-8430-aa5e506beeff/close` → **200**

```json
{
  "command_id": "84c1acf4-a1e7-477e-b496-7f7d0a51dffa",
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
  "session_id": "0890e5a9-b189-4bd6-9b4c-30c6fcdf24f6",
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
  "last_heartbeat_at": "2026-10-28T14:18:30.53111Z",
  "last_location_at": "2026-10-28T14:18:30.53111Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0890e5a9-b189-4bd6-9b4c-30c6fcdf24f6/close` → **200**

```json
{
  "command_id": "18b7dd2c-ceee-423e-a93c-a90fce3f3dec",
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

Done: terminal order 8af2525d-bc3e-4202-8a1d-957c4d69d845 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8331"
}
```

```json
{
  "challenge_id": "2237eae7-0e6c-4cca-b733-a42e1fd012f8",
  "expires_at": "2026-10-28T14:23:36.281101097Z",
  "resend_available_at": "2026-10-28T14:18:37.281101097Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "896109",
  "sent_at": "2026-10-28T14:18:36.283519659Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2237eae7-0e6c-4cca-b733-a42e1fd012f8",
  "code": "896109",
  "device_ref": "sandbox-8331"
}
```

```json
{
  "session_id": "55f4dfd0-ee17-416d-a18f-bd7f94b1b7ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODAxNiwiaWF0IjoxNzkzMTk3MTE2LCJqdGkiOiI5MGY3MjQ5Zi1lZjQ4LTQ2M2ItOGZiNi01MWM0ZmI4YzUwYzkiLCJzaWQiOiI1NWY0ZGZkMC1lZTE3LTQxNmQtYTE4Zi1iZDdmOTRiMWI3ZWQifQ.9oQW7nx_GT5I8G_ko4eoBXC_Mxahvau51QqVcJEFHQQ",
  "access_expires_at": "2026-10-28T14:33:36.570246119Z",
  "refresh_token": "lzaDZbwOS6TqRFCOIF3FxrFygaE2l2GO0xb_uwHdwBY",
  "refresh_expires_at": "2026-11-27T14:18:36.56959689Z",
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
  "device_ref": "sandbox-5700"
}
```

```json
{
  "challenge_id": "edf1627d-4f75-4dd3-9eca-0fcb0b456db6",
  "expires_at": "2026-10-28T14:23:37.092193484Z",
  "resend_available_at": "2026-10-28T14:18:38.092193484Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "401387",
  "sent_at": "2026-10-28T14:18:37.094349095Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "edf1627d-4f75-4dd3-9eca-0fcb0b456db6",
  "code": "401387",
  "device_ref": "sandbox-5700"
}
```

```json
{
  "session_id": "458eb02f-d914-4e0c-b885-d5e4584eca3e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODAxNywiaWF0IjoxNzkzMTk3MTE3LCJqdGkiOiI5MDJlOWU5OS1lODQwLTQ4MzktOTgwYy0zMGRmODk1ZTg3NTkiLCJzaWQiOiI0NThlYjAyZi1kOTE0LTRlMGMtYjg4NS1kNWU0NTg0ZWNhM2UifQ.m6wyjKCL5NCECtibcPrt9w0xgG0k9NjEHQDb90tn_qU",
  "access_expires_at": "2026-10-28T14:33:37.38027759Z",
  "refresh_token": "msoPnfrUuUkYdH7tIy3lrauTv_T-bwHPfoEvacDA0rE",
  "refresh_expires_at": "2026-11-27T14:18:37.37971151Z",
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
  "device_ref": "sandbox-6038"
}
```

```json
{
  "challenge_id": "dc595239-3a05-4ebd-8804-e0289ce58bf9",
  "expires_at": "2026-10-28T14:23:37.897021855Z",
  "resend_available_at": "2026-10-28T14:18:38.897021855Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "801922",
  "sent_at": "2026-10-28T14:18:37.899133521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc595239-3a05-4ebd-8804-e0289ce58bf9",
  "code": "801922",
  "device_ref": "sandbox-6038"
}
```

```json
{
  "session_id": "35a48805-d0e0-4b3e-95ff-a1104c0c2c9a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODAxOCwiaWF0IjoxNzkzMTk3MTE4LCJqdGkiOiJjOTk5NmFhNS0zNTJmLTRiMDctODdhZS0xNmQ2NGY0Yzk2OTUiLCJzaWQiOiIzNWE0ODgwNS1kMGUwLTRiM2UtOTVmZi1hMTEwNGMwYzJjOWEifQ._Jm-CGapwZDsqTIDnI2HqFYPI1KNPt4JoMHv4K5BSlA",
  "access_expires_at": "2026-10-28T14:33:38.194958957Z",
  "refresh_token": "X3A_XBphrY6BNIvdogOcuUnoItI5M_JbRMCfdBuN4xk",
  "refresh_expires_at": "2026-11-27T14:18:38.194461619Z",
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
  "phone": "+380691799619",
  "device_ref": "sandbox-1802"
}
```

```json
{
  "challenge_id": "564e11eb-2900-455c-8fa7-319031fe0818",
  "expires_at": "2026-10-28T14:23:38.731820616Z",
  "resend_available_at": "2026-10-28T14:18:39.731820616Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380691799619` → **200**

```json
{
  "phone": "+380691799619",
  "audience": "CLIENT",
  "code": "208965",
  "sent_at": "2026-10-28T14:18:38.733946959Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "564e11eb-2900-455c-8fa7-319031fe0818",
  "code": "208965",
  "device_ref": "sandbox-1802"
}
```

```json
{
  "session_id": "1a287f71-3ed1-40e6-b376-e4cc7775853d",
  "subject": {
    "type": "CLIENT",
    "id": "e7f2e615-f639-4818-bc6a-745c3c39e24b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlN2YyZTYxNS1mNjM5LTQ4MTgtYmM2YS03NDVjM2MzOWUyNGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDE5LCJpYXQiOjE3OTMxOTcxMTksImp0aSI6ImQ5NjdlZGI3LTkyNDYtNGNmMC04NDYzLTRlOTY3MTRiYTQ0MSIsInNpZCI6IjFhMjg3ZjcxLTNlZDEtNDBlNi1iMzc2LWU0Y2M3Nzc1ODUzZCJ9.Rl1KQsmGiWSRmJkohWViDNMpkkik1Y4bVyvCI8ggDnw",
  "access_expires_at": "2026-10-28T14:33:39.027786703Z",
  "refresh_token": "czQEqYLjUtQKDsj84nS66GeZ3jDEqMVeebyBmPjfBBs",
  "refresh_expires_at": "2026-11-27T14:18:39.027279888Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5bbb8f25-c8f2-48d3-9916-a14378153ada",
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
  "id": "dbf8aed4-5d1a-4d79-a2e9-7f065fd503eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:23:39.296644Z",
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
  "command_id": "3d45f1ac-5518-4f64-8019-0a3b4b794e67",
  "quote_id": "dbf8aed4-5d1a-4d79-a2e9-7f065fd503eb",
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
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
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

`GET /api/rider/v1/orders/6a19220c-e4b9-4984-8b60-e2c4e5ef7b40` → **200**

```json
{
  "id": "6a19220c-e4b9-4984-8b60-e2c4e5ef7b40",
  "short_number": 23,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e7f2e615-f639-4818-bc6a-745c3c39e24b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:18:39.573361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
