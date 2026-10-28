# Sandbox transcript (2026-10-28T18:43:37Z, ac3dc24)

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
  "correlation_id": "926e4cab-4847-49f1-b95b-ceec302e51d6"
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
  "session_id": "933c74dc-7007-4d80-ab5f-2510237513bf",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTM5MjUsImlhdCI6MTc5MzIxMzAyNSwianRpIjoiNGQzZmIwODMtYjlkYi00ZThmLTkwNjQtYzZkODFlMzU1ODU2Iiwic2lkIjoiOTMzYzc0ZGMtNzAwNy00ZDgwLWFiNWYtMjUxMDIzNzUxM2JmIn0.jNq3JJ3uQsrxzDjvA4j8SVOk0KK7VBWNnZUlVOTc7rg",
  "access_expires_at": "2026-10-28T18:58:45.708503725Z",
  "refresh_token": "Q6kiHeW3B5dJ_CzKFB6FVMAu8Rj6BMMUEnbV687V1LA",
  "refresh_expires_at": "2026-10-29T06:43:45.706352421Z",
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
  "session_id": "fffb1c4d-f588-4168-b4d9-b13cc0119fef",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTM5MjcsImlhdCI6MTc5MzIxMzAyNywianRpIjoiN2M4ZDliMGYtOWY0Yi00OGQ0LWE2MDQtNjYyNDdlMTZmZmQzIiwic2lkIjoiZmZmYjFjNGQtZjU4OC00MTY4LWI0ZDktYjEzY2MwMTE5ZmVmIn0.m05pNuCAkYML02wj183nBsd2ajeMgGXetCl7VKyiVFo",
  "access_expires_at": "2026-10-28T18:58:47.431620171Z",
  "refresh_token": "PC_NXs2tV24gYdYjnyj_cfH36wuRgWM66k8HqMh_H0Q",
  "refresh_expires_at": "2026-10-29T06:43:47.430768489Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "81be222f-2602-4eae-ad3e-9782d8ec8f84",
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
  "id": "d5cd24f7-2bd9-4e1e-a7f6-8ee1c3f267f0",
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
  "created_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "created_at": "2026-10-28T18:43:47.738385Z",
  "updated_at": "2026-10-28T18:43:47.738385Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636783725",
  "device_ref": "sandbox-20446"
}
```

```json
{
  "challenge_id": "c93eee87-7753-455a-8c40-38a71f94f7a2",
  "expires_at": "2026-10-28T18:48:48.047989576Z",
  "resend_available_at": "2026-10-28T18:43:49.047989576Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636783725` → **200**

```json
{
  "phone": "+380636783725",
  "audience": "CLIENT",
  "code": "905010",
  "sent_at": "2026-10-28T18:43:48.05856727Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c93eee87-7753-455a-8c40-38a71f94f7a2",
  "code": "905010",
  "device_ref": "sandbox-20446"
}
```

```json
{
  "session_id": "271ec440-b10f-42b0-9405-9ffb2ab827e9",
  "subject": {
    "type": "CLIENT",
    "id": "9763f7f6-4491-49e3-872f-19181b151bf5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NzYzZjdmNi00NDkxLTQ5ZTMtODcyZi0xOTE4MWIxNTFiZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjEzOTI4LCJpYXQiOjE3OTMyMTMwMjgsImp0aSI6IjYwMjNmYzEyLWQwZTEtNGU1Mi04ZmYzLWE0YzZmYjA3OWI2OSIsInNpZCI6IjI3MWVjNDQwLWIxMGYtNDJiMC05NDA1LTlmZmIyYWI4MjdlOSJ9.gSKNQmSTqhUvn_XoSsyzWkQuStkS2MlQ8VdNmd43q9w",
  "access_expires_at": "2026-10-28T18:58:48.392205561Z",
  "refresh_token": "BN6i1fuuNhuJbADIfo9NuDaIEwzG8kmUOMCusHQL07g",
  "refresh_expires_at": "2026-11-27T18:43:48.390976261Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636783725` → **200**

```json
{
  "client_id": "9763f7f6-4491-49e3-872f-19181b151bf5"
}
```

`POST /api/admin/v1/rider-wallets/9763f7f6-4491-49e3-872f-19181b151bf5/top-ups` → **201**

```json
{
  "command_id": "b4969cfe-65c3-447f-841a-983fb4d47d97",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "9763f7f6-4491-49e3-872f-19181b151bf5",
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
      "id": "70643d46-13e2-4537-af84-960c8680be4b",
      "at": "2026-10-28T18:43:48.972649Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "67057ac7-a498-4e65-9702-ccd76e392507",
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
  "id": "7fd135b5-9966-4e6c-ad1f-5fac7bf7aeec",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:48:49.537761Z",
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
      "id": "d5cd24f7-2bd9-4e1e-a7f6-8ee1c3f267f0",
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
  "device_ref": "sandbox-23209"
}
```

```json
{
  "challenge_id": "3add9f17-97df-4d87-a755-01f406b3d55f",
  "expires_at": "2026-10-28T18:48:49.86976979Z",
  "resend_available_at": "2026-10-28T18:43:50.86976979Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "872459",
  "sent_at": "2026-10-28T18:43:49.873714173Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3add9f17-97df-4d87-a755-01f406b3d55f",
  "code": "872459",
  "device_ref": "sandbox-23209"
}
```

```json
{
  "session_id": "32236e98-7e1b-4aa7-8fb3-4f49bc388c97",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxMzkzMCwiaWF0IjoxNzkzMjEzMDMwLCJqdGkiOiI0OTlkZjBmNy00OWFiLTRmNzktYmQzYy04MzJiNmZjMTcyOTYiLCJzaWQiOiIzMjIzNmU5OC03ZTFiLTRhYTctOGZiMy00ZjQ5YmMzODhjOTcifQ.OMTnv2Wn6915A83eIpWbkT3NQ4Ct1pyYeeoiCSc4TCU",
  "access_expires_at": "2026-10-28T18:58:50.181308292Z",
  "refresh_token": "OSvaL10YTymUfWit6v_LKw6wK0klDccvi1CLM_qWMlo",
  "refresh_expires_at": "2026-11-27T18:43:50.180345723Z",
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
  "command_id": "b4eec076-d30d-450c-b19e-eaa276c0ba55",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:43:50Z",
    "sequence": 1793213030735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4c86f7d1-477b-4971-a9d0-c3e2b8aee4c4",
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
  "last_heartbeat_at": "2026-10-28T18:43:50.782714Z",
  "last_location_at": "2026-10-28T18:43:50.782714Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "04ed08b9-83cf-461e-9fdc-0e157c80c9cf",
  "quote_id": "7fd135b5-9966-4e6c-ad1f-5fac7bf7aeec",
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
  "id": "cc7b0b83-b96d-43db-b4c3-1d00f5caec6b",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9763f7f6-4491-49e3-872f-19181b151bf5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:43:51.123025Z",
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
  "client_id": "9763f7f6-4491-49e3-872f-19181b151bf5",
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
      "id": "70643d46-13e2-4537-af84-960c8680be4b",
      "at": "2026-10-28T18:43:48.972649Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
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
    "id": "3b98c31c-7882-4a8c-bc47-fddafdc020ec",
    "order_id": "cc7b0b83-b96d-43db-b4c3-1d00f5caec6b",
    "expires_at": "2026-10-28T18:44:06.137276Z",
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

`POST /api/driver/v1/offers/3b98c31c-7882-4a8c-bc47-fddafdc020ec/accept` → **200**

```json
{
  "command_id": "ee309641-bdc8-40b6-954f-8b1eaa9ca5da"
}
```

```json
{
  "id": "6d7da990-9a96-4811-8425-124b2df3e975",
  "order_id": "cc7b0b83-b96d-43db-b4c3-1d00f5caec6b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d720bec0-d664-410b-b742-d90891cba0bd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d720bec0-d664-410b-b742-d90891cba0bd",
  "order_id": "cc7b0b83-b96d-43db-b4c3-1d00f5caec6b",
  "assignment_id": "6d7da990-9a96-4811-8425-124b2df3e975",
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

`POST /api/driver/v1/work-sessions/4c86f7d1-477b-4971-a9d0-c3e2b8aee4c4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:43:52Z",
    "sequence": 1793213032564
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4c86f7d1-477b-4971-a9d0-c3e2b8aee4c4",
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
  "last_heartbeat_at": "2026-10-28T18:43:52.592032Z",
  "last_location_at": "2026-10-28T18:43:52.592032Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d720bec0-d664-410b-b742-d90891cba0bd/arrive` → **200**

```json
{
  "command_id": "ee88eb04-ead2-4902-a9e9-efe55123780e",
  "expected_version": 0
}
```

```json
{
  "id": "d720bec0-d664-410b-b742-d90891cba0bd",
  "order_id": "cc7b0b83-b96d-43db-b4c3-1d00f5caec6b",
  "assignment_id": "6d7da990-9a96-4811-8425-124b2df3e975",
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
  "arrived_at": "2026-10-28T18:43:52.892289Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d720bec0-d664-410b-b742-d90891cba0bd/start` → **200**

```json
{
  "command_id": "4f55367b-c84d-421f-9cba-42d4f5c321fb",
  "expected_version": 1
}
```

```json
{
  "id": "d720bec0-d664-410b-b742-d90891cba0bd",
  "order_id": "cc7b0b83-b96d-43db-b4c3-1d00f5caec6b",
  "assignment_id": "6d7da990-9a96-4811-8425-124b2df3e975",
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
  "arrived_at": "2026-10-28T18:43:52.892289Z",
  "started_at": "2026-10-28T18:43:53.200965Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/d720bec0-d664-410b-b742-d90891cba0bd/complete` → **200**

```json
{
  "command_id": "5502bd25-7f32-4ade-8e98-a77e6fb380ad",
  "expected_version": 2,
  "reported_at": "2026-10-28T18:43:53Z",
  "cash_received": true
}
```

```json
{
  "id": "d720bec0-d664-410b-b742-d90891cba0bd",
  "order_id": "cc7b0b83-b96d-43db-b4c3-1d00f5caec6b",
  "assignment_id": "6d7da990-9a96-4811-8425-124b2df3e975",
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
  "arrived_at": "2026-10-28T18:43:52.892289Z",
  "started_at": "2026-10-28T18:43:53.200965Z",
  "completed_at": "2026-10-28T18:43:53.531319Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9763f7f6-4491-49e3-872f-19181b151bf5",
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
      "id": "893d324e-7c51-4f2b-87dc-f7260058d7c5",
      "at": "2026-10-28T18:43:54.386802Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "cc7b0b83-b96d-43db-b4c3-1d00f5caec6b"
    },
    {
      "id": "70643d46-13e2-4537-af84-960c8680be4b",
      "at": "2026-10-28T18:43:48.972649Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/d5cd24f7-2bd9-4e1e-a7f6-8ee1c3f267f0/archive` → **200**

```json
{
  "command_id": "02c24027-f274-426c-8099-88f09aefd6b7",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "d5cd24f7-2bd9-4e1e-a7f6-8ee1c3f267f0",
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
  "created_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "created_at": "2026-10-28T18:43:47.738385Z",
  "updated_at": "2026-10-28T18:43:57.114665Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4c86f7d1-477b-4971-a9d0-c3e2b8aee4c4",
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
  "last_heartbeat_at": "2026-10-28T18:43:52.592032Z",
  "last_location_at": "2026-10-28T18:43:52.592032Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4c86f7d1-477b-4971-a9d0-c3e2b8aee4c4/close` → **200**

```json
{
  "command_id": "df054d73-a7e3-4765-a85d-d78e6c833c70",
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

Done: order cc7b0b83-b96d-43db-b4c3-1d00f5caec6b.

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
  "session_id": "8b223cb6-81e1-48c4-bd12-68e52c6cce14",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTM5MzgsImlhdCI6MTc5MzIxMzAzOCwianRpIjoiNzczOTE3OGUtNzVjYy00YTExLTk3MjctMDBkZjFjMTI3NTU0Iiwic2lkIjoiOGIyMjNjYjYtODFlMS00OGM0LWJkMTItNjhlNTJjNmNjZTE0In0.lnFqs1qGPedIxPw0ueJjxyZ3NN6F_7R1wnci9owjOaE",
  "access_expires_at": "2026-10-28T18:58:58.31049436Z",
  "refresh_token": "xpweGLr_WLkrTyzRkG2q7guB_vVAQZeDOWOANho7FS8",
  "refresh_expires_at": "2026-10-29T06:43:58.309783269Z",
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
  "command_id": "7eda2a99-624d-4eb9-8839-f27fefe04af8",
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
  "session_id": "561a2a75-4da1-475a-b436-451a4a779382",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTM5MzksImlhdCI6MTc5MzIxMzAzOSwianRpIjoiYmZhMGY5N2EtZTQ4My00YzkxLTk4NmEtMThkODcwODJmMGRkIiwic2lkIjoiNTYxYTJhNzUtNGRhMS00NzVhLWI0MzYtNDUxYTRhNzc5MzgyIn0.eMolz2FtszHujLs-OwUunovggdoy9kfmTsX4yp9XjVg",
  "access_expires_at": "2026-10-28T18:58:59.496109989Z",
  "refresh_token": "ZviDTY3NJjstubUtr5HTkPjxSSbYGpVSU-2HCUKQmQQ",
  "refresh_expires_at": "2026-10-29T06:43:59.495410325Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1476526899",
    "linkedid": "1730052700.1476526899",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677079309"
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
    "id": "1730052700.1476526899",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "0a920d89-c76e-4778-836a-3b36aa944fe0",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677079309",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T18:43:59.765826Z",
      "answered_at": null,
      "ended_at": "2026-10-28T18:43:59.792955Z",
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
    "id": "1730052600.1839414041",
    "linkedid": "1730052600.1839414041",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677079309"
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
      "id": "78a02513-31ab-46b6-b107-f890ed7daaa2",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677079309",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T18:44:00.113876Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/78a02513-31ab-46b6-b107-f890ed7daaa2/answer` → **200**

```json
{
  "command_id": "96204b48-26e8-4795-a11b-48ead8d8f501"
}
```

```json
{
  "id": "78a02513-31ab-46b6-b107-f890ed7daaa2",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677079309",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "order_ids": [],
  "started_at": "2026-10-28T18:44:00.113876Z",
  "answered_at": "2026-10-28T18:44:00.437121Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1839414041",
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
    "id": "1730052600.1839414041",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "78a02513-31ab-46b6-b107-f890ed7daaa2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677079309",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [],
      "started_at": "2026-10-28T18:44:00.113876Z",
      "answered_at": "2026-10-28T18:44:00.437121Z",
      "ended_at": "2026-10-28T18:44:00.745182Z",
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
      "id": "78a02513-31ab-46b6-b107-f890ed7daaa2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677079309",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [],
      "started_at": "2026-10-28T18:44:00.113876Z",
      "answered_at": "2026-10-28T18:44:00.437121Z",
      "ended_at": "2026-10-28T18:44:00.745182Z",
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
      "id": "78a02513-31ab-46b6-b107-f890ed7daaa2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677079309",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [],
      "started_at": "2026-10-28T18:44:00.113876Z",
      "answered_at": "2026-10-28T18:44:00.437121Z",
      "ended_at": "2026-10-28T18:44:00.745182Z",
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
      "id": "78a02513-31ab-46b6-b107-f890ed7daaa2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677079309",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [],
      "started_at": "2026-10-28T18:44:00.113876Z",
      "answered_at": "2026-10-28T18:44:00.437121Z",
      "ended_at": "2026-10-28T18:44:00.745182Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T18:44:06.153911Z"
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
      "id": "78a02513-31ab-46b6-b107-f890ed7daaa2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677079309",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [],
      "started_at": "2026-10-28T18:44:00.113876Z",
      "answered_at": "2026-10-28T18:44:00.437121Z",
      "ended_at": "2026-10-28T18:44:00.745182Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T18:44:06.153911Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/78a02513-31ab-46b6-b107-f890ed7daaa2/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/78a02513-31ab-46b6-b107-f890ed7daaa2/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=78a02513-31ab-46b6-b107-f890ed7daaa2` → **200**

```json
{
  "changes": [
    {
      "id": "0299d11b-bd84-4b8e-a38f-1803b8d826a7",
      "occurred_at": "2026-10-28T18:44:08.248862Z",
      "actor_type": "STAFF",
      "actor_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "78a02513-31ab-46b6-b107-f890ed7daaa2",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0ee25e91-484c-4d8f-9084-af9f18c401fe\", \"order_ids\": []}",
      "correlation_id": "6eb86fbd-60d8-4b3a-ae00-ee567442356b"
    },
    {
      "id": "d8788c6f-71e0-44d0-bc83-3c8c48c3c71c",
      "occurred_at": "2026-10-28T18:44:08.212229Z",
      "actor_type": "STAFF",
      "actor_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "78a02513-31ab-46b6-b107-f890ed7daaa2",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0ee25e91-484c-4d8f-9084-af9f18c401fe\", \"order_ids\": []}",
      "correlation_id": "4ac3b633-1343-4e54-b383-323e00d68a90"
    }
  ]
}
```

Done: call 78a02513-31ab-46b6-b107-f890ed7daaa2 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32048"
}
```

```json
{
  "challenge_id": "b342b72d-726b-4f8c-b7fa-efdc263b5eac",
  "expires_at": "2026-10-28T18:49:08.57572143Z",
  "resend_available_at": "2026-10-28T18:44:09.57572143Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "324234",
  "sent_at": "2026-10-28T18:44:08.579708411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b342b72d-726b-4f8c-b7fa-efdc263b5eac",
  "code": "324234",
  "device_ref": "sandbox-32048"
}
```

```json
{
  "session_id": "a07f5c5a-b4a5-47f4-be4e-eb0a29e7ae7f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxMzk0OCwiaWF0IjoxNzkzMjEzMDQ4LCJqdGkiOiJiMWM5NTk1Mi1mMmQ4LTQ1ZjktYWY2Yy01NGU5MmM4OTU3MjIiLCJzaWQiOiJhMDdmNWM1YS1iNGE1LTQ3ZjQtYmU0ZS1lYjBhMjllN2FlN2YifQ.J9D9YBkknnrtoZq78xI1tu4AXDRy8C_ld6h-Wb9poio",
  "access_expires_at": "2026-10-28T18:59:08.880741539Z",
  "refresh_token": "TkczfgyO9bnfBWjezLqir76lNUWb2Wf9jIgR2M3Rgyc",
  "refresh_expires_at": "2026-11-27T18:44:08.879946702Z",
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
  "command_id": "983837b1-ede3-410d-b017-259e77f73a1d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:44:09Z",
    "sequence": 1793213049419
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5ce6bd17-faf7-4764-b455-817acf21f86f",
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
  "last_heartbeat_at": "2026-10-28T18:44:09.441737Z",
  "last_location_at": "2026-10-28T18:44:09.441737Z",
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
  "session_id": "0b230051-1b30-479d-a920-85d42e0c685f",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTM5NTAsImlhdCI6MTc5MzIxMzA1MCwianRpIjoiODNkMGFiYzctN2I3Yi00OGE3LTg5ZDAtMjhiNTdmNmFkODdhIiwic2lkIjoiMGIyMzAwNTEtMWIzMC00NzlkLWE5MjAtODVkNDJlMGM2ODVmIn0.b2-OME4pbsD6umEhuhF2JlSs-UariKDGR_E3AH_y4vA",
  "access_expires_at": "2026-10-28T18:59:10.05617518Z",
  "refresh_token": "FL_LX7SwtwjEf2X59HwNcAAxFhUFljaDMe17VHABxuI",
  "refresh_expires_at": "2026-10-29T06:44:10.055550039Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "88b1ff9f-ad12-4d01-b328-fe9b1b6e6ea7",
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
  "id": "6c6f847c-90f6-4e0b-ac82-7c8a32d8419b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:49:10.332631Z",
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
  "command_id": "c6dbaf20-7092-4cb5-8aa4-2dce704f297f",
  "quote_id": "6c6f847c-90f6-4e0b-ac82-7c8a32d8419b",
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
    "phone": "+380674470809"
  }
}
```

```json
{
  "id": "12d57b35-e3d4-4b06-8a1b-c3b7c195ea79",
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
  "created_at": "2026-10-28T18:44:10.645744Z",
  "caller": {
    "name": "Олена",
    "phone": "+380674470809"
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
    "id": "a73a3c28-6520-4671-8278-3ff32d65ff9f",
    "order_id": "12d57b35-e3d4-4b06-8a1b-c3b7c195ea79",
    "expires_at": "2026-10-28T18:44:25.651924Z",
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

`POST /api/driver/v1/offers/a73a3c28-6520-4671-8278-3ff32d65ff9f/accept` → **200**

```json
{
  "command_id": "40419920-1bc4-490e-b209-f31268ffefed"
}
```

```json
{
  "id": "b2ab842d-ef2a-47f3-8ed2-aec5d17257fd",
  "order_id": "12d57b35-e3d4-4b06-8a1b-c3b7c195ea79",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f482c4e1-00c3-4b42-81be-1095260bf649",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380674470809` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674470809` → **200**

```json
[
  {
    "phone": "+380674470809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T18:44:12.343763459Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674470809` → **200**

```json
[
  {
    "phone": "+380674470809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T18:44:12.343763459Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674470809` → **200**

```json
[
  {
    "phone": "+380674470809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T18:44:12.343763459Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f482c4e1-00c3-4b42-81be-1095260bf649",
  "order_id": "12d57b35-e3d4-4b06-8a1b-c3b7c195ea79",
  "assignment_id": "b2ab842d-ef2a-47f3-8ed2-aec5d17257fd",
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
    "phone": "+380674470809"
  }
}
```

`POST /api/driver/v1/work-sessions/5ce6bd17-faf7-4764-b455-817acf21f86f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:44:12Z",
    "sequence": 1793213052899
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5ce6bd17-faf7-4764-b455-817acf21f86f",
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
  "last_heartbeat_at": "2026-10-28T18:44:12.921801Z",
  "last_location_at": "2026-10-28T18:44:12.921801Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f482c4e1-00c3-4b42-81be-1095260bf649/arrive` → **200**

```json
{
  "command_id": "2389151f-08a3-427f-b3a6-591b3f50c4c9",
  "expected_version": 0
}
```

```json
{
  "id": "f482c4e1-00c3-4b42-81be-1095260bf649",
  "order_id": "12d57b35-e3d4-4b06-8a1b-c3b7c195ea79",
  "assignment_id": "b2ab842d-ef2a-47f3-8ed2-aec5d17257fd",
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
  "arrived_at": "2026-10-28T18:44:13.198223Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674470809"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380674470809` → **200**

```json
[
  {
    "phone": "+380674470809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T18:44:12.343763459Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674470809` → **200**

```json
[
  {
    "phone": "+380674470809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T18:44:12.343763459Z"
  },
  {
    "phone": "+380674470809",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T18:44:14.351220682Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674470809` → **200**

```json
[
  {
    "phone": "+380674470809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T18:44:12.343763459Z"
  },
  {
    "phone": "+380674470809",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T18:44:14.351220682Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674470809` → **200**

```json
[
  {
    "phone": "+380674470809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T18:44:12.343763459Z"
  },
  {
    "phone": "+380674470809",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T18:44:14.351220682Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/f482c4e1-00c3-4b42-81be-1095260bf649/start` → **200**

```json
{
  "command_id": "0edec5e3-b52a-45f9-b6c3-d5b555f5fcf0",
  "expected_version": 1
}
```

```json
{
  "id": "f482c4e1-00c3-4b42-81be-1095260bf649",
  "order_id": "12d57b35-e3d4-4b06-8a1b-c3b7c195ea79",
  "assignment_id": "b2ab842d-ef2a-47f3-8ed2-aec5d17257fd",
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
  "arrived_at": "2026-10-28T18:44:13.198223Z",
  "started_at": "2026-10-28T18:44:14.620898Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674470809"
  }
}
```

`POST /api/driver/v1/trips/f482c4e1-00c3-4b42-81be-1095260bf649/complete` → **200**

```json
{
  "command_id": "066e6823-490e-4cb5-a332-0f933a42be5e",
  "expected_version": 2,
  "reported_at": "2026-10-28T18:44:14Z",
  "cash_received": true
}
```

```json
{
  "id": "f482c4e1-00c3-4b42-81be-1095260bf649",
  "order_id": "12d57b35-e3d4-4b06-8a1b-c3b7c195ea79",
  "assignment_id": "b2ab842d-ef2a-47f3-8ed2-aec5d17257fd",
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
  "arrived_at": "2026-10-28T18:44:13.198223Z",
  "started_at": "2026-10-28T18:44:14.620898Z",
  "completed_at": "2026-10-28T18:44:14.930813Z",
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
  "session_id": "5ce6bd17-faf7-4764-b455-817acf21f86f",
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
  "last_heartbeat_at": "2026-10-28T18:44:12.921801Z",
  "last_location_at": "2026-10-28T18:44:12.921801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5ce6bd17-faf7-4764-b455-817acf21f86f/close` → **200**

```json
{
  "command_id": "f3e4756c-10fe-4d03-808e-6fb953082a8d",
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
  "phone": "+380637007604",
  "device_ref": "sandbox-25906"
}
```

```json
{
  "challenge_id": "3e208fb8-e07b-4d33-8b62-9d507b6f1c06",
  "expires_at": "2026-10-28T18:49:15.795981862Z",
  "resend_available_at": "2026-10-28T18:44:16.795981862Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637007604` → **200**

```json
{
  "phone": "+380637007604",
  "audience": "CLIENT",
  "code": "451302",
  "sent_at": "2026-10-28T18:44:15.79982333Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e208fb8-e07b-4d33-8b62-9d507b6f1c06",
  "code": "451302",
  "device_ref": "sandbox-25906"
}
```

```json
{
  "session_id": "9bf301a6-9140-48d7-be14-c824d5824461",
  "subject": {
    "type": "CLIENT",
    "id": "07bb5b0a-7a25-4208-bb3e-369ce109f933"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwN2JiNWIwYS03YTI1LTQyMDgtYmIzZS0zNjljZTEwOWY5MzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjEzOTU2LCJpYXQiOjE3OTMyMTMwNTYsImp0aSI6ImRiYjkzMTU2LWJlOTMtNGQ5Yy1iOWIyLWM4ZTllOGY4NjVjZSIsInNpZCI6IjliZjMwMWE2LTkxNDAtNDhkNy1iZTE0LWM4MjRkNTgyNDQ2MSJ9.LKeyVI7rIvBg9ZoJr91xCTi_NRQz078tOAvqNnIC7DE",
  "access_expires_at": "2026-10-28T18:59:16.107185875Z",
  "refresh_token": "z7ugwx5h909zOSeVYJlFg7bLJPV2x4rIAmqJmc2BoNw",
  "refresh_expires_at": "2026-11-27T18:44:16.106356446Z",
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
  "device_ref": "sandbox-25022"
}
```

```json
{
  "challenge_id": "d0776460-c69d-45ff-82be-5f246c3efcb7",
  "expires_at": "2026-10-28T18:49:16.679822125Z",
  "resend_available_at": "2026-10-28T18:44:17.679822125Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "888647",
  "sent_at": "2026-10-28T18:44:16.683338023Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0776460-c69d-45ff-82be-5f246c3efcb7",
  "code": "888647",
  "device_ref": "sandbox-25022"
}
```

```json
{
  "session_id": "e497e697-cd42-4048-904d-d472714d9d1a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxMzk1NiwiaWF0IjoxNzkzMjEzMDU2LCJqdGkiOiJjYWEyMWEyMC00M2FiLTQzMzItYWUwNC0xMjAwMjM2NGE4ZjkiLCJzaWQiOiJlNDk3ZTY5Ny1jZDQyLTQwNDgtOTA0ZC1kNDcyNzE0ZDlkMWEifQ.bc4LDyS9nO6C7L6uG_IJshnSP2Xa8BY1Tm501gDHyA8",
  "access_expires_at": "2026-10-28T18:59:16.980857007Z",
  "refresh_token": "suB58bO44SGlg4aKssDvOTEtOOlLS4xKShia4B8ddI8",
  "refresh_expires_at": "2026-11-27T18:44:16.980139573Z",
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
  "session_id": "9de7cc4a-e12d-4ca5-b253-b9c80c741b4b",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTM5NTcsImlhdCI6MTc5MzIxMzA1NywianRpIjoiYWRjNDBjYWQtODc5Zi00MzI1LWFhZGQtYTg1YzI4OTVmMWM3Iiwic2lkIjoiOWRlN2NjNGEtZTEyZC00Y2E1LWIyNTMtYjljODBjNzQxYjRiIn0.fA78ipdUF1ZyT-llxyRhoZSR4wklLAxY0JXqUu-8pmY",
  "access_expires_at": "2026-10-28T18:59:17.864807062Z",
  "refresh_token": "eKJaK6n_vaEAVEZHr4Ju6AShxnWEsKUO05pcl2teAvs",
  "refresh_expires_at": "2026-10-29T06:44:17.86418088Z",
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
  "session_id": "11a82de0-4768-4f16-b3d2-f852753cf4d0",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTM5NTgsImlhdCI6MTc5MzIxMzA1OCwianRpIjoiY2FmZDkwYWUtZTQ2MC00OGQzLThlNzUtZjAzZWNhNWY1OGUyIiwic2lkIjoiMTFhODJkZTAtNDc2OC00ZjE2LWIzZDItZjg1Mjc1M2NmNGQwIn0.IhcLgIAg1zop2BPbmfgyQRzEVCXn8hLWKO5oFPWJfII",
  "access_expires_at": "2026-10-28T18:59:18.476762688Z",
  "refresh_token": "7r4dTvqgUgqLPN26Wh30DYwExSUY12KOCWhLuVB2Ngk",
  "refresh_expires_at": "2026-10-29T06:44:18.476224668Z",
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
  "command_id": "7c9dd7a8-737b-4fc8-9bf1-37b885e6cde1",
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
  "id": "b7ce9b0a-c29a-4701-b6ba-fca9f38dc23b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:49:19.038382Z",
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
  "command_id": "bae4bd17-ec7b-47e6-8dd5-f6bb3bb1cbc2",
  "quote_id": "b7ce9b0a-c29a-4701-b6ba-fca9f38dc23b",
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
  "id": "764ded9c-a8d0-4da7-beb0-8b86a3fc768c",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "07bb5b0a-7a25-4208-bb3e-369ce109f933",
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
  "created_at": "2026-10-28T18:44:19.333448Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/764ded9c-a8d0-4da7-beb0-8b86a3fc768c` → **200**

```json
{
  "id": "764ded9c-a8d0-4da7-beb0-8b86a3fc768c",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "07bb5b0a-7a25-4208-bb3e-369ce109f933",
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
  "created_at": "2026-10-28T18:44:19.333448Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/764ded9c-a8d0-4da7-beb0-8b86a3fc768c/cancel` → **200**

```json
{
  "command_id": "51c65e31-2264-4eea-b029-9b383216931b",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "764ded9c-a8d0-4da7-beb0-8b86a3fc768c",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "07bb5b0a-7a25-4208-bb3e-369ce109f933",
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
  "created_at": "2026-10-28T18:44:19.333448Z",
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
  "command_id": "e5de451c-3d88-4dd0-8689-8318bab74fff",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:44:20Z",
    "sequence": 1793213060529
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8220d8cc-8fdc-4e6a-8178-6d66aec328af",
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
  "last_heartbeat_at": "2026-10-28T18:44:20.550583Z",
  "last_location_at": "2026-10-28T18:44:20.550583Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8139"
}
```

```json
{
  "challenge_id": "0a911764-c1b3-4c95-a649-88ba442c0c35",
  "expires_at": "2026-10-28T18:49:20.825194438Z",
  "resend_available_at": "2026-10-28T18:44:21.825194438Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "890612",
  "sent_at": "2026-10-28T18:44:20.828552412Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a911764-c1b3-4c95-a649-88ba442c0c35",
  "code": "890612",
  "device_ref": "sandbox-8139"
}
```

```json
{
  "session_id": "3bee2b78-6390-46d7-9ffd-58624a291fab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxMzk2MSwiaWF0IjoxNzkzMjEzMDYxLCJqdGkiOiJiNTIwZDM1NC1hNDg5LTRkODYtOGNiMy0xMzRiOWIxNzlmOWIiLCJzaWQiOiIzYmVlMmI3OC02MzkwLTQ2ZDctOWZmZC01ODYyNGEyOTFmYWIifQ.iwjD4Dx_pvyCkOASom9CVrQ4B-Z1HeFTXgvlu1dyRXU",
  "access_expires_at": "2026-10-28T18:59:21.134930238Z",
  "refresh_token": "qvcX01f4TCMcc-LdtsLn_-l70yUWV7ktyC1voVL8rZY",
  "refresh_expires_at": "2026-11-27T18:44:21.134217264Z",
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
  "command_id": "5d91e558-6b49-4a38-bca6-a018b99488a7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:44:21Z",
    "sequence": 1793213061687
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d9b5d99-fac1-4af2-a0d3-bd75d182858e",
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
  "last_heartbeat_at": "2026-10-28T18:44:21.708608Z",
  "last_location_at": "2026-10-28T18:44:21.708608Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4ad79eb0-91b2-4e13-83e6-7cf753b72074",
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
  "id": "e2a052b3-d218-41df-ae5b-a79aa9503dbc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:49:22.001967Z",
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
  "command_id": "e5bef3be-b195-43ef-8712-2e763a65b988",
  "quote_id": "e2a052b3-d218-41df-ae5b-a79aa9503dbc",
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
  "id": "9a414977-94b9-4809-8ad9-686ed70c0858",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "07bb5b0a-7a25-4208-bb3e-369ce109f933",
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
  "created_at": "2026-10-28T18:44:22.301208Z",
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
    "id": "0c359f34-4c20-440c-8874-1ca2ca30beaf",
    "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
    "expires_at": "2026-10-28T18:44:37.305413Z",
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

`POST /api/driver/v1/offers/0c359f34-4c20-440c-8874-1ca2ca30beaf/accept` → **200**

```json
{
  "command_id": "454570e2-00ab-43cf-a3f7-2376e92b9d20"
}
```

```json
{
  "id": "48938298-86bc-4b57-a771-6043cc0ae601",
  "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b3c70e3a-de11-4472-9b9f-78ee3fef7d50",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b3c70e3a-de11-4472-9b9f-78ee3fef7d50",
  "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
  "assignment_id": "48938298-86bc-4b57-a771-6043cc0ae601",
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

`POST /api/driver/v1/trips/b3c70e3a-de11-4472-9b9f-78ee3fef7d50/cancel` → **200**

```json
{
  "command_id": "2933036c-6431-4db9-a580-365f12784c01",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "b3c70e3a-de11-4472-9b9f-78ee3fef7d50",
  "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
  "assignment_id": "48938298-86bc-4b57-a771-6043cc0ae601",
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

`GET /api/rider/v1/orders/9a414977-94b9-4809-8ad9-686ed70c0858` → **200**

```json
{
  "id": "9a414977-94b9-4809-8ad9-686ed70c0858",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "07bb5b0a-7a25-4208-bb3e-369ce109f933",
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
    "id": "48938298-86bc-4b57-a771-6043cc0ae601",
    "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b3c70e3a-de11-4472-9b9f-78ee3fef7d50",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T18:44:22.301208Z",
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
    "id": "be07a903-6812-475a-b148-9a841e3f88dc",
    "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
    "expires_at": "2026-10-28T18:44:38.463662Z",
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

`POST /api/driver/v1/offers/be07a903-6812-475a-b148-9a841e3f88dc/accept` → **200**

```json
{
  "command_id": "626c2e22-75e2-48c8-8f0e-9734d817ae0f"
}
```

```json
{
  "id": "468637a0-ecc9-4d1f-ab4d-a55680fa5f63",
  "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "63c6e602-e3c8-4fb7-9645-34c004492062",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "63c6e602-e3c8-4fb7-9645-34c004492062",
  "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
  "assignment_id": "468637a0-ecc9-4d1f-ab4d-a55680fa5f63",
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

`POST /api/driver/v1/trips/63c6e602-e3c8-4fb7-9645-34c004492062/cancel` → **200**

```json
{
  "command_id": "c4b66fa6-f0f4-4c77-9fb0-6f843528f531",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "63c6e602-e3c8-4fb7-9645-34c004492062",
  "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
  "assignment_id": "468637a0-ecc9-4d1f-ab4d-a55680fa5f63",
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
    "id": "9a414977-94b9-4809-8ad9-686ed70c0858",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T18:44:22.301208Z",
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
    "id": "764ded9c-a8d0-4da7-beb0-8b86a3fc768c",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T18:44:19.333448Z",
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

`GET /api/operator/v1/orders/9a414977-94b9-4809-8ad9-686ed70c0858/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T18:44:22.301858Z",
      "actor": {
        "type": "CLIENT",
        "id": "07bb5b0a-7a25-4208-bb3e-369ce109f933",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
        "quote_id": "e2a052b3-d218-41df-ae5b-a79aa9503dbc",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "4ec58b67-83bc-4408-843a-c4a1de7f1c64"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T18:44:22.304288Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
        "attempt_id": "334cb074-55db-4686-9bb5-7c745f82333b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4ec58b67-83bc-4408-843a-c4a1de7f1c64"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T18:44:22.312292Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0c359f34-4c20-440c-8874-1ca2ca30beaf",
        "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "4ec58b67-83bc-4408-843a-c4a1de7f1c64"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T18:44:22.883289Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "0c359f34-4c20-440c-8874-1ca2ca30beaf",
        "order_id": "9a414977-94b9-4809-8ad9-686ed70c0858",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "48938298-86bc-4b57-a771-6043cc0ae601"
      },
      "correlation_id": "32c8369a-6698-4b72-a3a1-ad8a73ff9811"
```

Done: orders 764ded9c-a8d0-4da7-beb0-8b86a3fc768c, 9a414977-94b9-4809-8ad9-686ed70c0858.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731342689",
  "device_ref": "sandbox-14466"
}
```

```json
{
  "challenge_id": "dd45c232-32c0-4622-bbf1-c069671428f7",
  "expires_at": "2026-10-28T18:49:25.784766975Z",
  "resend_available_at": "2026-10-28T18:44:26.784766975Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731342689` → **200**

```json
{
  "phone": "+380731342689",
  "audience": "CLIENT",
  "code": "264106",
  "sent_at": "2026-10-28T18:44:25.787577Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd45c232-32c0-4622-bbf1-c069671428f7",
  "code": "264106",
  "device_ref": "sandbox-14466"
}
```

```json
{
  "session_id": "9a3b2482-9288-4d04-8f61-5da5ae96327f",
  "subject": {
    "type": "CLIENT",
    "id": "8ea99191-0b64-4058-8720-b2f74d8224f0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWE5OTE5MS0wYjY0LTQwNTgtODcyMC1iMmY3NGQ4MjI0ZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjEzOTY2LCJpYXQiOjE3OTMyMTMwNjYsImp0aSI6ImIxZmVmYmI5LTQ4MzAtNGZmMi1iZDBmLTUzODAwNTBiN2FhZSIsInNpZCI6IjlhM2IyNDgyLTkyODgtNGQwNC04ZjYxLTVkYTVhZTk2MzI3ZiJ9.uk1d9Jccg4RD8yRuFVosVNJ5UVfRArJk0byHNVP_QsU",
  "access_expires_at": "2026-10-28T18:59:26.096151132Z",
  "refresh_token": "IfEV4C_EQMGJQKjqfULnIzHn6NWdoTOpuufNhH-HTIM",
  "refresh_expires_at": "2026-11-27T18:44:26.095507934Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d603b5d3-fb43-454e-a520-a8477d127ee8",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8b33bb38-1e79-476a-a57f-b8b1e6b89a0e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8b33bb38-1e79-476a-a57f-b8b1e6b89a0e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b636c58b5d7ea6d906a5f750a9c7c972",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8b33bb38-1e79-476a-a57f-b8b1e6b89a0e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731342689"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8b33bb38-1e79-476a-a57f-b8b1e6b89a0e",
  "expires_at": "2026-10-28T19:14:26.379163Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/8b33bb38-1e79-476a-a57f-b8b1e6b89a0e` → **200**

```json
{
  "id": "8b33bb38-1e79-476a-a57f-b8b1e6b89a0e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T19:14:26.379163Z",
  "card": {
    "id": "e778b481-69dd-43d0-9512-ef5f18755a00",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5306",
    "card_type": "Visa",
    "created_at": "2026-10-28T18:44:26.67852Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "e778b481-69dd-43d0-9512-ef5f18755a00",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5306",
      "card_type": "Visa",
      "created_at": "2026-10-28T18:44:26.67852Z"
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
  "device_ref": "sandbox-23010"
}
```

```json
{
  "challenge_id": "17d4aef4-0a3a-457b-9868-4a56513f8134",
  "expires_at": "2026-10-28T18:49:27.244443229Z",
  "resend_available_at": "2026-10-28T18:44:28.244443229Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "753078",
  "sent_at": "2026-10-28T18:44:27.247335483Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "17d4aef4-0a3a-457b-9868-4a56513f8134",
  "code": "753078",
  "device_ref": "sandbox-23010"
}
```

```json
{
  "session_id": "60714887-c52a-45bd-b7d0-16a034042559",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxMzk2NywiaWF0IjoxNzkzMjEzMDY3LCJqdGkiOiJiY2UyMWMyZi01ODY3LTQyMTctOWQ5MS0yZmUwNDgxYjA4ZjUiLCJzaWQiOiI2MDcxNDg4Ny1jNTJhLTQ1YmQtYjdkMC0xNmEwMzQwNDI1NTkifQ.koyNjwyYP0XNTwtAkazl5Hyh8vFjJ3tLsBlyUCBOsG0",
  "access_expires_at": "2026-10-28T18:59:27.551945151Z",
  "refresh_token": "-AtJqA-1w_r5TxiqD45a3LIohFNSoWmSqOs3z9punaU",
  "refresh_expires_at": "2026-11-27T18:44:27.551284107Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d9b5d99-fac1-4af2-a0d3-bd75d182858e",
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
  "last_heartbeat_at": "2026-10-28T18:44:21.708608Z",
  "last_location_at": "2026-10-28T18:44:21.708608Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d9b5d99-fac1-4af2-a0d3-bd75d182858e/handover` → **200**

```json
{
  "command_id": "d992317c-34dc-40c0-9c80-05d61f2dba34",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d9b5d99-fac1-4af2-a0d3-bd75d182858e",
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
  "last_heartbeat_at": "2026-10-28T18:44:21.708608Z",
  "last_location_at": "2026-10-28T18:44:21.708608Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d9b5d99-fac1-4af2-a0d3-bd75d182858e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:44:28Z",
    "sequence": 1793213068398
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d9b5d99-fac1-4af2-a0d3-bd75d182858e",
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
  "last_heartbeat_at": "2026-10-28T18:44:28.419729Z",
  "last_location_at": "2026-10-28T18:44:28.419729Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c7eeaec9-0395-40f0-a73d-199bf2766d41",
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
  "id": "e3c63bd1-b8d6-4715-9a1c-8f6897438300",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:49:28.714303Z",
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
  "command_id": "3bc245e7-a2d0-4a7a-8f67-0904e4efce11",
  "quote_id": "e3c63bd1-b8d6-4715-9a1c-8f6897438300",
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
  "id": "03cb2035-6087-46cc-9e37-7652720caccb",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8ea99191-0b64-4058-8720-b2f74d8224f0",
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
  "created_at": "2026-10-28T18:44:29.013862Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/03cb2035-6087-46cc-9e37-7652720caccb` → **200**

```json
{
  "id": "03cb2035-6087-46cc-9e37-7652720caccb",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8ea99191-0b64-4058-8720-b2f74d8224f0",
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
  "created_at": "2026-10-28T18:44:29.013862Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/03cb2035-6087-46cc-9e37-7652720caccb` → **200**

```json
{
  "id": "03cb2035-6087-46cc-9e37-7652720caccb",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8ea99191-0b64-4058-8720-b2f74d8224f0",
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
  "created_at": "2026-10-28T18:44:29.013862Z",
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
    "id": "413f1935-055c-40fa-bc3f-a0f2380511ba",
    "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
    "expires_at": "2026-10-28T18:44:44.632599Z",
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

`POST /api/driver/v1/offers/413f1935-055c-40fa-bc3f-a0f2380511ba/accept` → **200**

```json
{
  "command_id": "bf8f6b55-cf5a-4680-a4c6-3bbc6794861e"
}
```

```json
{
  "id": "267c49b5-7cc3-4dfc-bbbc-d80b9b0ef18e",
  "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1b876c43-a862-4017-a334-bbd6976750c6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1b876c43-a862-4017-a334-bbd6976750c6",
  "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
  "assignment_id": "267c49b5-7cc3-4dfc-bbbc-d80b9b0ef18e",
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

`POST /api/driver/v1/work-sessions/7d9b5d99-fac1-4af2-a0d3-bd75d182858e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:44:31Z",
    "sequence": 1793213071732
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d9b5d99-fac1-4af2-a0d3-bd75d182858e",
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
  "last_heartbeat_at": "2026-10-28T18:44:31.753577Z",
  "last_location_at": "2026-10-28T18:44:31.753577Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1b876c43-a862-4017-a334-bbd6976750c6/arrive` → **200**

```json
{
  "command_id": "7cd43a3f-618c-494d-9ce2-2f00ab1829b9",
  "expected_version": 0
}
```

```json
{
  "id": "1b876c43-a862-4017-a334-bbd6976750c6",
  "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
  "assignment_id": "267c49b5-7cc3-4dfc-bbbc-d80b9b0ef18e",
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
  "arrived_at": "2026-10-28T18:44:32.042257Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1b876c43-a862-4017-a334-bbd6976750c6/start` → **200**

```json
{
  "command_id": "b4463b58-86ac-44c2-a278-072ea37bb259",
  "expected_version": 1
}
```

```json
{
  "id": "1b876c43-a862-4017-a334-bbd6976750c6",
  "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
  "assignment_id": "267c49b5-7cc3-4dfc-bbbc-d80b9b0ef18e",
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
  "arrived_at": "2026-10-28T18:44:32.042257Z",
  "started_at": "2026-10-28T18:44:32.341681Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1b876c43-a862-4017-a334-bbd6976750c6/complete` → **200**

```json
{
  "command_id": "67497e09-7fd2-4dfb-8483-578a2d854104",
  "expected_version": 2,
  "reported_at": "2026-10-28T18:44:32Z",
  "cash_received": true
}
```

```json
{
  "id": "1b876c43-a862-4017-a334-bbd6976750c6",
  "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
  "assignment_id": "267c49b5-7cc3-4dfc-bbbc-d80b9b0ef18e",
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
  "arrived_at": "2026-10-28T18:44:32.042257Z",
  "started_at": "2026-10-28T18:44:32.341681Z",
  "completed_at": "2026-10-28T18:44:32.631838Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/03cb2035-6087-46cc-9e37-7652720caccb` → **200**

```json
{
  "id": "03cb2035-6087-46cc-9e37-7652720caccb",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8ea99191-0b64-4058-8720-b2f74d8224f0",
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
    "id": "267c49b5-7cc3-4dfc-bbbc-d80b9b0ef18e",
    "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1b876c43-a862-4017-a334-bbd6976750c6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T18:44:29.013862Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/03cb2035-6087-46cc-9e37-7652720caccb` → **200**

```json
{
  "id": "03cb2035-6087-46cc-9e37-7652720caccb",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8ea99191-0b64-4058-8720-b2f74d8224f0",
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
    "id": "267c49b5-7cc3-4dfc-bbbc-d80b9b0ef18e",
    "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1b876c43-a862-4017-a334-bbd6976750c6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T18:44:29.013862Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/03cb2035-6087-46cc-9e37-7652720caccb` → **200**

```json
{
  "id": "03cb2035-6087-46cc-9e37-7652720caccb",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "8ea99191-0b64-4058-8720-b2f74d8224f0",
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
    "id": "267c49b5-7cc3-4dfc-bbbc-d80b9b0ef18e",
    "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1b876c43-a862-4017-a334-bbd6976750c6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T18:44:29.013862Z",
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

`GET /api/rider/v1/orders/03cb2035-6087-46cc-9e37-7652720caccb/tip` → **200**

```json
{
  "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
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
  "available_until": "2026-10-29T18:44:32.631838Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/03cb2035-6087-46cc-9e37-7652720caccb/tip` → **201**

```json
{
  "command_id": "fb03ace6-ffac-43c9-ade6-196a9ee2a83d",
  "amount_minor": 2500
}
```

```json
{
  "id": "06d2d7ff-e6de-4580-b47c-9ba8dbbbd16a",
  "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T18:44:36.385322Z"
}
```

`GET /api/rider/v1/orders/03cb2035-6087-46cc-9e37-7652720caccb/tip` → **200**

```json
{
  "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
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
  "available_until": "2026-10-29T18:44:32.631838Z",
  "open": false,
  "tip": {
    "id": "06d2d7ff-e6de-4580-b47c-9ba8dbbbd16a",
    "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T18:44:36.385322Z"
  }
}
```

`GET /api/rider/v1/orders/03cb2035-6087-46cc-9e37-7652720caccb/tip` → **200**

```json
{
  "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
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
  "available_until": "2026-10-29T18:44:32.631838Z",
  "open": false,
  "tip": {
    "id": "06d2d7ff-e6de-4580-b47c-9ba8dbbbd16a",
    "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T18:44:36.385322Z"
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
      "id": "a4daa7eb-2a56-4006-a3e7-72bbdabdcfcf",
      "at": "2026-10-28T18:44:37.746112Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
      "counterpart_id": null
    },
    {
      "id": "81e0743b-4c55-4cfd-a583-e322c0e6176e",
      "at": "2026-10-28T18:44:32.683227Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1fa78477-5ba1-4aea-8087-551b82baaa5d",
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
  "id": "b4645cfe-b876-458f-a113-3503ee521440",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:49:38.513048Z",
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
  "session_id": "d29e5427-9e90-4019-805d-53a44fd4d008",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTM5NzksImlhdCI6MTc5MzIxMzA3OSwianRpIjoiN2Q2MjQ2NTAtY2M0MC00Mjg4LTg0NWQtZWViZmQ2Y2M0MGQyIiwic2lkIjoiZDI5ZTU0MjctOWU5MC00MDE5LTgwNWQtNTNhNDRmZDRkMDA4In0.TJkUO4VSNMpYQU3hrtOe10n40E4Xejmw6d2ZMbMZceA",
  "access_expires_at": "2026-10-28T18:59:39.175473649Z",
  "refresh_token": "bj5xKNJM2HWEYSGd_XAsmbe3In-P8av2VAwZyynBgbo",
  "refresh_expires_at": "2026-10-29T06:44:39.174847617Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380731342689` → **200**

```json
{
  "client_id": "8ea99191-0b64-4058-8720-b2f74d8224f0"
}
```

`POST /api/admin/v1/rider-wallets/8ea99191-0b64-4058-8720-b2f74d8224f0/top-ups` → **201**

```json
{
  "command_id": "631fb822-4884-4b85-a39e-3e6bca0baac7",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "8ea99191-0b64-4058-8720-b2f74d8224f0",
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
      "id": "45c64d6d-5d72-4117-a000-054b3b60d665",
      "at": "2026-10-28T18:44:39.729917Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "459890f6-913e-4ad1-9c66-8fb9ee091458",
  "quote_id": "b4645cfe-b876-458f-a113-3503ee521440",
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
  "id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8ea99191-0b64-4058-8720-b2f74d8224f0",
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
  "created_at": "2026-10-28T18:44:40.031323Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b336c8b5-7858-45ae-b101-21f2f2429ab2` → **200**

```json
{
  "id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8ea99191-0b64-4058-8720-b2f74d8224f0",
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
  "created_at": "2026-10-28T18:44:40.031323Z",
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
    "id": "b739eed3-e720-478b-a95b-823ca9eea806",
    "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
    "expires_at": "2026-10-28T18:44:55.036561Z",
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

`POST /api/driver/v1/offers/b739eed3-e720-478b-a95b-823ca9eea806/accept` → **200**

```json
{
  "command_id": "b28d9b9a-c721-443f-9a4a-ca1def409b57"
}
```

```json
{
  "id": "33479bf0-5eae-44f5-b390-db80eb00a4b2",
  "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4ea95bcc-c116-4a03-b3bf-874f2138f6b5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4ea95bcc-c116-4a03-b3bf-874f2138f6b5",
  "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
  "assignment_id": "33479bf0-5eae-44f5-b390-db80eb00a4b2",
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

`POST /api/driver/v1/work-sessions/7d9b5d99-fac1-4af2-a0d3-bd75d182858e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:44:41Z",
    "sequence": 1793213081467
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d9b5d99-fac1-4af2-a0d3-bd75d182858e",
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
  "last_heartbeat_at": "2026-10-28T18:44:41.488727Z",
  "last_location_at": "2026-10-28T18:44:41.488727Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4ea95bcc-c116-4a03-b3bf-874f2138f6b5/arrive` → **200**

```json
{
  "command_id": "1bd32ddf-c6b7-46b5-a365-14ec4c901201",
  "expected_version": 0
}
```

```json
{
  "id": "4ea95bcc-c116-4a03-b3bf-874f2138f6b5",
  "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
  "assignment_id": "33479bf0-5eae-44f5-b390-db80eb00a4b2",
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
  "arrived_at": "2026-10-28T18:44:41.776922Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4ea95bcc-c116-4a03-b3bf-874f2138f6b5/start` → **200**

```json
{
  "command_id": "2deb28bd-edc0-4897-b2b6-9b9ca302307b",
  "expected_version": 1
}
```

```json
{
  "id": "4ea95bcc-c116-4a03-b3bf-874f2138f6b5",
  "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
  "assignment_id": "33479bf0-5eae-44f5-b390-db80eb00a4b2",
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
  "arrived_at": "2026-10-28T18:44:41.776922Z",
  "started_at": "2026-10-28T18:44:42.068354Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4ea95bcc-c116-4a03-b3bf-874f2138f6b5/complete` → **200**

```json
{
  "command_id": "c8d5eb3c-85fe-4704-9986-d86f1409ae86",
  "expected_version": 2,
  "reported_at": "2026-10-28T18:44:42Z",
  "cash_received": true
}
```

```json
{
  "id": "4ea95bcc-c116-4a03-b3bf-874f2138f6b5",
  "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
  "assignment_id": "33479bf0-5eae-44f5-b390-db80eb00a4b2",
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
  "arrived_at": "2026-10-28T18:44:41.776922Z",
  "started_at": "2026-10-28T18:44:42.068354Z",
  "completed_at": "2026-10-28T18:44:42.36582Z",
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
  "client_id": "8ea99191-0b64-4058-8720-b2f74d8224f0",
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
      "id": "45c64d6d-5d72-4117-a000-054b3b60d665",
      "at": "2026-10-28T18:44:39.729917Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
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

`GET /api/rider/v1/orders/b336c8b5-7858-45ae-b101-21f2f2429ab2/tip` → **200**

```json
{
  "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
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
  "available_until": "2026-10-29T18:44:42.36582Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b336c8b5-7858-45ae-b101-21f2f2429ab2/tip` → **201**

```json
{
  "command_id": "77e853af-7085-45b7-98e1-216e358a63e3",
  "amount_minor": 2500
}
```

```json
{
  "id": "6d28ca35-651d-4068-8180-41792e4c963d",
  "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T18:44:43.500983Z"
}
```

`GET /api/rider/v1/orders/b336c8b5-7858-45ae-b101-21f2f2429ab2/tip` → **200**

```json
{
  "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
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
  "available_until": "2026-10-29T18:44:42.36582Z",
  "open": false,
  "tip": {
    "id": "6d28ca35-651d-4068-8180-41792e4c963d",
    "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T18:44:43.500983Z"
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
      "id": "65ab6382-0e80-4e23-8b62-16677a1714a9",
      "at": "2026-10-28T18:44:42.773388Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
      "counterpart_id": null
    },
    {
      "id": "a4daa7eb-2a56-4006-a3e7-72bbdabdcfcf",
      "at": "2026-10-28T18:44:37.746112Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
      "counterpart_id": null
    },
    {
      "id": "81e0743b-4c55-4cfd-a583-e322c0e6176e",
      "at": "2026-10-28T18:44:32.683227Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
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
      "id": "47399cf7-0778-4888-b803-b5ff2672f519",
      "at": "2026-10-28T18:44:44.813057Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
      "counterpart_id": null
    },
    {
      "id": "65ab6382-0e80-4e23-8b62-16677a1714a9",
      "at": "2026-10-28T18:44:42.773388Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b336c8b5-7858-45ae-b101-21f2f2429ab2",
      "counterpart_id": null
    },
    {
      "id": "a4daa7eb-2a56-4006-a3e7-72bbdabdcfcf",
      "at": "2026-10-28T18:44:37.746112Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
      "counterpart_id": null
    },
    {
      "id": "81e0743b-4c55-4cfd-a583-e322c0e6176e",
      "at": "2026-10-28T18:44:32.683227Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "03cb2035-6087-46cc-9e37-7652720caccb",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7d9b5d99-fac1-4af2-a0d3-bd75d182858e",
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
  "last_heartbeat_at": "2026-10-28T18:44:41.488727Z",
  "last_location_at": "2026-10-28T18:44:41.488727Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d9b5d99-fac1-4af2-a0d3-bd75d182858e/close` → **200**

```json
{
  "command_id": "4de7c2b0-6ecd-4e3a-b01f-54f529f236a8",
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

Done: card order b336c8b5-7858-45ae-b101-21f2f2429ab2.

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
  "phone": "+380732587481",
  "device_ref": "sandbox-4357"
}
```

```json
{
  "challenge_id": "d6c8db25-a6e6-495a-bf01-79f321ad29d0",
  "expires_at": "2026-10-28T18:49:46.508390048Z",
  "resend_available_at": "2026-10-28T18:44:47.508390048Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732587481` → **200**

```json
{
  "phone": "+380732587481",
  "audience": "CLIENT",
  "code": "510790",
  "sent_at": "2026-10-28T18:44:46.511490882Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6c8db25-a6e6-495a-bf01-79f321ad29d0",
  "code": "510790",
  "device_ref": "sandbox-4357"
}
```

```json
{
  "session_id": "7d3853a5-aa52-4d25-aa45-092ae6971a66",
  "subject": {
    "type": "CLIENT",
    "id": "eebd0205-ed6b-42bb-9a3f-6ff65203163d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWJkMDIwNS1lZDZiLTQyYmItOWEzZi02ZmY2NTIwMzE2M2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjEzOTg2LCJpYXQiOjE3OTMyMTMwODYsImp0aSI6IjMzODlhNDY4LTdkNDItNDU4Mi04YTI4LWU1NzQ1NDMyYzcyZCIsInNpZCI6IjdkMzg1M2E1LWFhNTItNGQyNS1hYTQ1LTA5MmFlNjk3MWE2NiJ9.wh1AAUgWCC6YVWD2V1z5D6rQA3hZDnEwac3al6uYFfg",
  "access_expires_at": "2026-10-28T18:59:46.818969153Z",
  "refresh_token": "KOLBxonfexPnYXrXkN_-kTUvKOmqHO6fZcvTG_vvY2s",
  "refresh_expires_at": "2026-11-27T18:44:46.818371083Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "653cdf0e-f131-4ba6-afa0-969fbea7bd78",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "db0fda08-dd04-4530-89a9-ed86e3ca5950",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-db0fda08-dd04-4530-89a9-ed86e3ca5950",
    "orderDate": "1793213087",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "abcad0a22f8d00e8b9570aa3772a0697",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=db0fda08-dd04-4530-89a9-ed86e3ca5950",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732587481"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=db0fda08-dd04-4530-89a9-ed86e3ca5950",
  "created_at": "2026-10-28T18:44:47.105908Z",
  "expires_at": "2026-10-28T19:14:47.105908Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/db0fda08-dd04-4530-89a9-ed86e3ca5950` → **200**

```json
{
  "id": "db0fda08-dd04-4530-89a9-ed86e3ca5950",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T18:44:47.105908Z",
  "expires_at": "2026-10-28T19:14:47.105908Z",
  "completed_at": "2026-10-28T18:44:47.394754Z",
  "masked_pan": "41****8927",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "eebd0205-ed6b-42bb-9a3f-6ff65203163d",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "eebd0205-ed6b-42bb-9a3f-6ff65203163d",
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
      "id": "7875a63d-aa1a-41b7-a4ee-1f86c5426dab",
      "at": "2026-10-28T18:44:47.829921Z",
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
  "client_id": "eebd0205-ed6b-42bb-9a3f-6ff65203163d",
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
      "id": "7875a63d-aa1a-41b7-a4ee-1f86c5426dab",
      "at": "2026-10-28T18:44:47.829921Z",
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
  "device_ref": "sandbox-29473"
}
```

```json
{
  "challenge_id": "8ba80342-2f98-4c13-8f7a-2bee61af6220",
  "expires_at": "2026-10-28T18:49:49.53268684Z",
  "resend_available_at": "2026-10-28T18:44:50.53268684Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "536197",
  "sent_at": "2026-10-28T18:44:49.535412332Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ba80342-2f98-4c13-8f7a-2bee61af6220",
  "code": "536197",
  "device_ref": "sandbox-29473"
}
```

```json
{
  "session_id": "047ad35c-1ecc-46e9-b345-9ac482ad53e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxMzk4OSwiaWF0IjoxNzkzMjEzMDg5LCJqdGkiOiJmN2IyMGU0Yi0yZTA5LTRiNDctOGYxNC0wNjFmNjA4ODI0ZjIiLCJzaWQiOiIwNDdhZDM1Yy0xZWNjLTQ2ZTktYjM0NS05YWM0ODJhZDUzZTUifQ.oUtXpA_e1nUvMvroHs0KFdQ8m3u-l3asizarteOoZDI",
  "access_expires_at": "2026-10-28T18:59:49.838012015Z",
  "refresh_token": "ePA-YleCzboGnwnaOvYHN3YbBYiBdMWYluCLR6VEYaM",
  "refresh_expires_at": "2026-11-27T18:44:49.837459769Z",
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
  "command_id": "b2135f0d-bdfd-43cc-9395-f83476fa8fea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "be8eb452-f921-4a86-9fe4-7baddcbe40fb",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-be8eb452-f921-4a86-9fe4-7baddcbe40fb",
    "orderDate": "1793213090",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "512a3e7992ead3740170102c0a39cfe2",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=be8eb452-f921-4a86-9fe4-7baddcbe40fb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=be8eb452-f921-4a86-9fe4-7baddcbe40fb",
  "created_at": "2026-10-28T18:44:50.384409Z",
  "expires_at": "2026-10-28T19:14:50.384409Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/be8eb452-f921-4a86-9fe4-7baddcbe40fb` → **200**

```json
{
  "id": "be8eb452-f921-4a86-9fe4-7baddcbe40fb",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T18:44:50.384409Z",
  "expires_at": "2026-10-28T19:14:50.384409Z",
  "completed_at": "2026-10-28T18:44:50.665499Z",
  "masked_pan": "41****9905",
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
      "id": "66ff55b7-8716-4bdf-b37e-3684cc366580",
      "at": "2026-10-28T18:44:50.839779Z",
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
  "command_id": "e02a4f8b-fe25-4153-8f35-934e7b1a22db",
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
  "correlation_id": "34c93c27-8238-4cf1-a4f7-f90c7ab55b33"
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
  "session_id": "3a024239-dffe-4488-a5ab-000f1cf6ac42",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTM5OTEsImlhdCI6MTc5MzIxMzA5MSwianRpIjoiNjk0ODMyZGYtZTk3ZS00YmY3LThjYjItZjk4OTMzZTZlMGJiIiwic2lkIjoiM2EwMjQyMzktZGZmZS00NDg4LWE1YWItMDAwZjFjZjZhYzQyIn0.HNTMoW8IZPWtWUM1j_kSAecoNC1acH8BAjoHfQLrzvI",
  "access_expires_at": "2026-10-28T18:59:51.868230003Z",
  "refresh_token": "ilO6yDxiPyLeaSUbopzSj4nl9EoDcyRBJiLNZIpvhfI",
  "refresh_expires_at": "2026-10-29T06:44:51.867700275Z",
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
  "phone": "+48600232075",
  "device_ref": "sandbox-15276"
}
```

```json
{
  "challenge_id": "095e56e1-2be1-45a2-9ed9-52c5cebd2052",
  "expires_at": "2026-10-28T18:49:52.6893742Z",
  "resend_available_at": "2026-10-28T18:44:53.6893742Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600232075` → **200**

```json
{
  "phone": "+48600232075",
  "audience": "CLIENT",
  "code": "411885",
  "sent_at": "2026-10-28T18:44:52.691626801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "095e56e1-2be1-45a2-9ed9-52c5cebd2052",
  "code": "411885",
  "device_ref": "sandbox-15276"
}
```

```json
{
  "session_id": "229ce484-bc4c-4148-a94e-5e5412785322",
  "subject": {
    "type": "CLIENT",
    "id": "87748e2c-468d-4593-ac34-12c71741ade3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzc0OGUyYy00NjhkLTQ1OTMtYWMzNC0xMmM3MTc0MWFkZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjEzOTkyLCJpYXQiOjE3OTMyMTMwOTIsImp0aSI6IjMyOTY1YWNjLWU2YjEtNDM5ZC1hNWUyLTA4NjUzZDkxMTZkOSIsInNpZCI6IjIyOWNlNDg0LWJjNGMtNDE0OC1hOTRlLTVlNTQxMjc4NTMyMiJ9.SFoEg2fTU6GcROh3SUOG8sGA2BONFZKPSvJa2Av5f7c",
  "access_expires_at": "2026-10-28T18:59:52.995735957Z",
  "refresh_token": "rdxIM5rXtsuwec74HiLEfKsIw9r2x5fTr6YYssS1C8Y",
  "refresh_expires_at": "2026-11-27T18:44:52.995198948Z",
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
  "command_id": "9dcec458-ee7a-4286-8bbc-f39d69efebee",
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
  "correlation_id": "34516dc4-9cae-4f77-8ddb-0d6fb088f512",
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
  "command_id": "9d79ff3d-7448-409d-9b18-7ee56c59d6dc",
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
  "paused_at": "2026-10-28T18:44:54.138147259Z",
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
  "command_id": "2c03a3ac-981b-46f4-bdb1-8a167de9dcfd",
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
  "id": "c0d97544-d89a-4f83-b561-a3ab141cc24d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:49:54.716762Z",
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
  "command_id": "e8629394-eeb1-4e49-bc88-2f06767b1fd9",
  "quote_id": "c0d97544-d89a-4f83-b561-a3ab141cc24d",
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
  "correlation_id": "f7214cdf-93ab-438e-8020-c1f269de6325"
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
  "paused_at": "2026-10-28T18:44:54.138147Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "e3370849-fdd8-4f97-91fc-bb6fe231aca6",
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
  "command_id": "2b50cff1-272f-4096-9528-5e99a75d8001",
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
  "command_id": "6d7da698-d265-42dc-a95f-064a0ab5c49c",
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
  "id": "867233a8-1b28-4fe3-bafa-82df8beb9d36",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:49:56.435405Z",
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
  "command_id": "d050a82d-a753-4564-b9c5-6db1642608b2",
  "quote_id": "867233a8-1b28-4fe3-bafa-82df8beb9d36",
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
  "correlation_id": "d6457ab7-95d5-4e73-9e90-e23a2c1d9685"
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
  "command_id": "479ab335-784b-4a06-afd8-30f4699d1c99",
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
      "from": "21:00",
      "to": "22:00"
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
      "from": "21:00",
      "to": "22:00"
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
  "command_id": "3fdb3149-5d0d-4219-92b9-77f856ef8d32",
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
  "id": "10145046-a0ac-4067-b28a-6d48750348a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:49:57.579758Z",
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
  "command_id": "e2d316a4-061c-4ae6-a3d9-41ee29e26bdb",
  "quote_id": "10145046-a0ac-4067-b28a-6d48750348a5",
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
  "correlation_id": "86d97f02-9d78-4548-b8d9-ae0517bcf031"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "d44f597d-9609-4f01-bb11-569cbcf574cd",
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
  "correlation_id": "7a0e3a71-77ae-40f4-9623-c91ae214d130"
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
      "from": "21:00",
      "to": "22:00"
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
  "command_id": "0fb9b4dd-e042-4a1a-b087-f3d8fe0ad758",
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
  "phone": "+380676360262",
  "device_ref": "sandbox-17586"
}
```

```json
{
  "challenge_id": "6677f046-d3ce-4562-9a01-6b377c0e0f03",
  "expires_at": "2026-10-28T18:49:59.031455072Z",
  "resend_available_at": "2026-10-28T18:45:00.031455072Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676360262` → **200**

```json
{
  "phone": "+380676360262",
  "audience": "CLIENT",
  "code": "711137",
  "sent_at": "2026-10-28T18:44:59.033668865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6677f046-d3ce-4562-9a01-6b377c0e0f03",
  "code": "711137",
  "device_ref": "sandbox-17586"
}
```

```json
{
  "session_id": "f7012e2e-9ae2-4c65-b509-d8bcd84c968c",
  "subject": {
    "type": "CLIENT",
    "id": "825b2fb7-873c-47da-9840-d318088acea9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjViMmZiNy04NzNjLTQ3ZGEtOTg0MC1kMzE4MDg4YWNlYTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjEzOTk5LCJpYXQiOjE3OTMyMTMwOTksImp0aSI6IjVjMGViNjhjLWE3ZTItNDRlYS1iYjlkLTcxNDY1ZmUzODhmNiIsInNpZCI6ImY3MDEyZTJlLTlhZTItNGM2NS1iNTA5LWQ4YmNkODRjOTY4YyJ9.NS5HCS53SQ_FuY7Z1sxNh6-Z0u7wU5JDRAW9OCcCgjw",
  "access_expires_at": "2026-10-28T18:59:59.334548023Z",
  "refresh_token": "1rfxMnBdrurIY8uzcHDmyBerY0TXBEPQeUsQpWmKAw8",
  "refresh_expires_at": "2026-11-27T18:44:59.333893788Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "825b2fb7-873c-47da-9840-d318088acea9",
  "session_id": "f7012e2e-9ae2-4c65-b509-d8bcd84c968c",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b6ab46da-1930-4419-836c-64fffe5977d0",
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
  "id": "48c68039-14d3-4d39-8379-c92965ad2f28",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:49:59.888771Z",
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
  "challenge_id": "52d9c1d7-7866-409d-b41c-d767ae33589a",
  "expires_at": "2026-10-28T18:50:02.174258196Z",
  "resend_available_at": "2026-10-28T18:45:03.174258196Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676360262` → **200**

```json
{
  "phone": "+380676360262",
  "audience": "CLIENT",
  "code": "339483",
  "sent_at": "2026-10-28T18:45:02.176448333Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "3a46e011-8e31-43af-8014-283bdc76b8da",
  "challenge_id": "52d9c1d7-7866-409d-b41c-d767ae33589a",
  "otp_code": "339483"
}
```

```json
{
  "client_id": "825b2fb7-873c-47da-9840-d318088acea9",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T18:45:02.480681731Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "cb5142e7-c7cc-44f0-8b41-3c9f74c66167",
  "quote_id": "48c68039-14d3-4d39-8379-c92965ad2f28",
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
  "correlation_id": "4ee0ec6c-7fc2-4551-932d-eb75696755b1"
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
  "session_id": "6b2a405f-615d-4f0d-ac88-7c2c6e71afd8",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwMDMsImlhdCI6MTc5MzIxMzEwMywianRpIjoiMmJiYjdhYjEtYzExMy00M2I5LTlhOWYtZGExYWNhOTM1MzIwIiwic2lkIjoiNmIyYTQwNWYtNjE1ZC00ZjBkLWFjODgtN2MyYzZlNzFhZmQ4In0.EFi9GBjwID-YY0XMtB5WJe_V2QQS2ptgqsnNVhwX0AE",
  "access_expires_at": "2026-10-28T19:00:03.387732366Z",
  "refresh_token": "5BidkUPRQXVfEQMbOFiCFv-cHcOwmLRAN6wh6r_XhUc",
  "refresh_expires_at": "2026-10-29T06:45:03.387233816Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "825b2fb7-873c-47da-9840-d318088acea9",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T18:45:02.480682Z",
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

`POST /api/admin/v1/client-deletions/825b2fb7-873c-47da-9840-d318088acea9/complete` → **200**

```json
{
  "command_id": "38f54850-9866-4350-9947-7f1af7f7d6bd",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "825b2fb7-873c-47da-9840-d318088acea9",
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
  "correlation_id": "63fb9d06-cd3a-4563-8005-1edf933f91ed"
}
```

Done: client 825b2fb7-873c-47da-9840-d318088acea9 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666394882",
  "device_ref": "sandbox-2214"
}
```

```json
{
  "challenge_id": "39d9394e-4e7b-4e52-bedf-f93af3c8cc07",
  "expires_at": "2026-10-28T18:50:04.532163761Z",
  "resend_available_at": "2026-10-28T18:45:05.532163761Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666394882` → **200**

```json
{
  "phone": "+380666394882",
  "audience": "CLIENT",
  "code": "314235",
  "sent_at": "2026-10-28T18:45:04.534992439Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39d9394e-4e7b-4e52-bedf-f93af3c8cc07",
  "code": "314235",
  "device_ref": "sandbox-2214"
}
```

```json
{
  "session_id": "6e78bcff-6c88-49fb-a6d5-ea0f98f6702b",
  "subject": {
    "type": "CLIENT",
    "id": "a0ad8b74-1456-43db-ab89-432bfc3eff0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMGFkOGI3NC0xNDU2LTQzZGItYWI4OS00MzJiZmMzZWZmMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MDA0LCJpYXQiOjE3OTMyMTMxMDQsImp0aSI6ImMyOTE4MzdiLTVkOWUtNDBlNi1iZWI2LTg3ZGFlMzkxOWE2NyIsInNpZCI6IjZlNzhiY2ZmLTZjODgtNDlmYi1hNmQ1LWVhMGY5OGY2NzAyYiJ9.k5sb9jn7sd_gIeWGjIU6HGUa3a84Z4a_SiAiMRcflgM",
  "access_expires_at": "2026-10-28T19:00:04.844243703Z",
  "refresh_token": "v5Zz0nfhL5ZM50IWEpIVc0Zf8Su3oBMlDo7Pk_8uqTM",
  "refresh_expires_at": "2026-11-27T18:45:04.843648252Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a0ad8b74-1456-43db-ab89-432bfc3eff0a",
  "session_id": "6e78bcff-6c88-49fb-a6d5-ea0f98f6702b",
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
  "session_id": "9659c9b3-7220-4f41-929f-d450084ef9e3",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwMDUsImlhdCI6MTc5MzIxMzEwNSwianRpIjoiOTZlOTBkOTItNjkxZi00ODM0LThlMGUtMjcyMDE2NjU1ZmRiIiwic2lkIjoiOTY1OWM5YjMtNzIyMC00ZjQxLTkyOWYtZDQ1MDA4NGVmOWUzIn0.Ppk47VVORw5XApBZezR4QMkoXuIsIjXByWCf4GcKKB4",
  "access_expires_at": "2026-10-28T19:00:05.71668484Z",
  "refresh_token": "pJpD0SJYpfs640wzAN1z0h-vCAY1fbOFbN9635wnPok",
  "refresh_expires_at": "2026-10-29T06:45:05.716058998Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6394882&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a0ad8b74-1456-43db-ab89-432bfc3eff0a",
      "phone": "+380666394882",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T18:45:04.841729Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a0ad8b74-1456-43db-ab89-432bfc3eff0a` → **200**

```json
{
  "client": {
    "id": "a0ad8b74-1456-43db-ab89-432bfc3eff0a",
    "phone": "+380666394882",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T18:45:04.841729Z",
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

`POST /api/admin/v1/clients/a0ad8b74-1456-43db-ab89-432bfc3eff0a/block` → **400**

```json
{
  "command_id": "e33566d8-7e78-44dd-9236-32e7662127bc",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a0ad8b74-1456-43db-ab89-432bfc3eff0a/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0e9d285e-891e-4283-bac4-0a5064ee5787",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a0ad8b74-1456-43db-ab89-432bfc3eff0a/block` → **200**

```json
{
  "command_id": "ef4ccc95-fb4e-4451-bf6d-c57b9124c23f",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a0ad8b74-1456-43db-ab89-432bfc3eff0a",
  "phone": "+380666394882",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T18:45:04.841729Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T18:45:06.933136Z",
    "by": "313514fb-76fb-4a6c-b718-bea886fa63bd"
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
  "correlation_id": "7405f653-059b-4280-8a77-29a403611690"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666394882",
  "device_ref": "sandbox-19545"
}
```

```json
{
  "challenge_id": "8ac49fe5-8fc7-4938-a82e-907ef1dc147c",
  "expires_at": "2026-10-28T18:50:09.485453903Z",
  "resend_available_at": "2026-10-28T18:45:10.485453903Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666394882` → **200**

```json
{
  "phone": "+380666394882",
  "audience": "CLIENT",
  "code": "205280",
  "sent_at": "2026-10-28T18:45:09.487537289Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "8ac49fe5-8fc7-4938-a82e-907ef1dc147c",
  "code": "205280",
  "device_ref": "sandbox-19545"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "568a5c72-e98d-41e1-b3ac-d00f3d54f34f"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a0ad8b74-1456-43db-ab89-432bfc3eff0a` → **200**

```json
{
  "client": {
    "id": "a0ad8b74-1456-43db-ab89-432bfc3eff0a",
    "phone": "+380666394882",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T18:45:04.841729Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T18:45:06.933136Z",
      "by": "313514fb-76fb-4a6c-b718-bea886fa63bd"
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

`POST /api/admin/v1/clients/a0ad8b74-1456-43db-ab89-432bfc3eff0a/unblock` → **200**

```json
{
  "command_id": "0a2c7be9-a155-4445-aa96-63226e03c469",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a0ad8b74-1456-43db-ab89-432bfc3eff0a",
  "phone": "+380666394882",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T18:45:04.841729Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666394882",
  "device_ref": "sandbox-18305"
}
```

```json
{
  "challenge_id": "531748ba-3ca1-4ad9-8009-178dce3f032b",
  "expires_at": "2026-10-28T18:50:12.654832789Z",
  "resend_available_at": "2026-10-28T18:45:13.654832789Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666394882` → **200**

```json
{
  "phone": "+380666394882",
  "audience": "CLIENT",
  "code": "904997",
  "sent_at": "2026-10-28T18:45:12.657087493Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "531748ba-3ca1-4ad9-8009-178dce3f032b",
  "code": "904997",
  "device_ref": "sandbox-18305"
}
```

```json
{
  "session_id": "e79637ba-1d74-44be-87ad-325fe1e649c9",
  "subject": {
    "type": "CLIENT",
    "id": "a0ad8b74-1456-43db-ab89-432bfc3eff0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMGFkOGI3NC0xNDU2LTQzZGItYWI4OS00MzJiZmMzZWZmMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MDEyLCJpYXQiOjE3OTMyMTMxMTIsImp0aSI6ImI5OTc3ZDQ2LTQ5M2YtNGRmOS1iYWVhLWNiZWM3M2Y2YmMyMiIsInNpZCI6ImU3OTYzN2JhLTFkNzQtNDRiZS04N2FkLTMyNWZlMWU2NDljOSJ9.O37Ar1NirMzhfpIcNNCe7C5oBi-KMS3hdFiSvK4BBKg",
  "access_expires_at": "2026-10-28T19:00:12.980298503Z",
  "refresh_token": "qoT0s6nKh4q5ouO6dB9vXPbojOfhnKbhhfRr7am6vi8",
  "refresh_expires_at": "2026-11-27T18:45:12.979717373Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a0ad8b74-1456-43db-ab89-432bfc3eff0a",
  "session_id": "e79637ba-1d74-44be-87ad-325fe1e649c9",
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
  "phone": "+380666024386",
  "device_ref": "sandbox-16050"
}
```

```json
{
  "challenge_id": "51fb41bf-548b-4c73-9498-41dd50330419",
  "expires_at": "2026-10-28T18:50:13.532658428Z",
  "resend_available_at": "2026-10-28T18:45:14.532658428Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666024386` → **200**

```json
{
  "phone": "+380666024386",
  "audience": "CLIENT",
  "code": "710995",
  "sent_at": "2026-10-28T18:45:13.534797668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51fb41bf-548b-4c73-9498-41dd50330419",
  "code": "710995",
  "device_ref": "sandbox-16050"
}
```

```json
{
  "session_id": "f928e3b8-d33e-4f99-adf8-f8514da9b3f0",
  "subject": {
    "type": "CLIENT",
    "id": "06b70c4f-365b-494c-8859-a4d8d5b5f8d9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmI3MGM0Zi0zNjViLTQ5NGMtODg1OS1hNGQ4ZDViNWY4ZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MDEzLCJpYXQiOjE3OTMyMTMxMTMsImp0aSI6ImViNjRhMjAyLTY4OTEtNGZlYS1iODlmLWQ3YzQxZWQ0ZDliZCIsInNpZCI6ImY5MjhlM2I4LWQzM2UtNGY5OS1hZGY4LWY4NTE0ZGE5YjNmMCJ9.S8pa_r7ydsut9FElJnRFCc8ucwIXDwh7ZIqIHCje6wg",
  "access_expires_at": "2026-10-28T19:00:13.834694775Z",
  "refresh_token": "RWbRAzRa-r1c1uuAg9XaSfIFW-DcCENG5cOvQJVRMoc",
  "refresh_expires_at": "2026-11-27T18:45:13.834152615Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "00993220-0e38-4562-bff9-3a77b4b34330",
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
  "id": "0642633e-4184-4981-b586-ebb2fced25a4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:50:14.113992Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: fe4db1b4-b212-4312-8ddb-e34a71b3baf5) → **201**

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
  "session_id": "8390fc2f-7745-4a9e-97fb-1e2ebc3b0ce0",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwMTQsImlhdCI6MTc5MzIxMzExNCwianRpIjoiMDhmMTQ1ZjEtMzAxYy00MGYwLWJkMmMtY2VjYzgzNTNiM2ViIiwic2lkIjoiODM5MGZjMmYtNzc0NS00YTllLTk3ZmItMWUyZWJjM2IwY2UwIn0.x35m94f_ltH6tr7PqnarBUr6mo4rSkibqi6_7y1Ajlc",
  "access_expires_at": "2026-10-28T19:00:14.781651009Z",
  "refresh_token": "C6ExE2JANn_dSceV54nJop9XivDBeJGbzpMaIY3JZyk",
  "refresh_expires_at": "2026-10-29T06:45:14.78110095Z",
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
  "session_id": "5a84282b-de75-4a81-bbfa-4c8fdef501f0",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwMTUsImlhdCI6MTc5MzIxMzExNSwianRpIjoiYjJmMjA0OGYtZjQzNS00MzlhLTljNmEtNzExYThkMTZmM2NmIiwic2lkIjoiNWE4NDI4MmItZGU3NS00YTgxLWJiZmEtNGM4ZmRlZjUwMWYwIn0.GR36E5Pt4BgVvZdV7k3h3izaPTAlUV5OaRUszbVp2_U",
  "access_expires_at": "2026-10-28T19:00:15.394940854Z",
  "refresh_token": "Eb_kKCEZiCqQbNwqFuWTGrE_DUpVroLYIouLF3N67SM",
  "refresh_expires_at": "2026-10-29T06:45:15.394430606Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e6e778f7-2e79-4242-ba87-322beb6c8aee/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T18:45:14.405911Z",
      "actor": {
        "type": "CLIENT",
        "id": "06b70c4f-365b-494c-8859-a4d8d5b5f8d9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e6e778f7-2e79-4242-ba87-322beb6c8aee",
        "quote_id": "0642633e-4184-4981-b586-ebb2fced25a4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "fe4db1b4-b212-4312-8ddb-e34a71b3baf5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T18:45:14.408221Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e6e778f7-2e79-4242-ba87-322beb6c8aee",
        "attempt_id": "1792dd8c-d7ff-48ce-9758-23a7dbe67c8e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "fe4db1b4-b212-4312-8ddb-e34a71b3baf5"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T18:45:14.418496Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e6e778f7-2e79-4242-ba87-322beb6c8aee",
        "attempt_id": "1792dd8c-d7ff-48ce-9758-23a7dbe67c8e"
      },
      "correlation_id": "fe4db1b4-b212-4312-8ddb-e34a71b3baf5"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "1792dd8c-d7ff-48ce-9758-23a7dbe67c8e",
        "generation": 1,
        "started_at": "2026-10-28T18:45:14.407247Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T18:45:14.418496Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T18:45:14.409087Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/fe4db1b4-b212-4312-8ddb-e34a71b3baf5` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "e6e778f7-2e79-4242-ba87-322beb6c8aee:0",
      "order_id": "e6e778f7-2e79-4242-ba87-322beb6c8aee",
      "at": "2026-10-28T18:45:14.405911Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e6e778f7-2e79-4242-ba87-322beb6c8aee:1",
      "order_id": "e6e778f7-2e79-4242-ba87-322beb6c8aee",
      "at": "2026-10-28T18:45:14.408221Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e6e778f7-2e79-4242-ba87-322beb6c8aee:2",
      "order_id": "e6e778f7-2e79-4242-ba87-322beb6c8aee",
      "at": "2026-10-28T18:45:14.418496Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/c4178ae7-4a9c-4756-869d-b56f179f79f8` → **200**

```json
{
  "found": []
}
```

Done: request fe4db1b4-b212-4312-8ddb-e34a71b3baf5 — order e6e778f7-2e79-4242-ba87-322beb6c8aee found by its id.

`GET /api/rider/v1/orders/e6e778f7-2e79-4242-ba87-322beb6c8aee` → **200**

```json
{
  "id": "e6e778f7-2e79-4242-ba87-322beb6c8aee",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06b70c4f-365b-494c-8859-a4d8d5b5f8d9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:45:14.405349Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e6e778f7-2e79-4242-ba87-322beb6c8aee/cancel` → **200**

```json
{
  "command_id": "7bbcd65c-fc80-4c5c-834a-c8019d06a784",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e6e778f7-2e79-4242-ba87-322beb6c8aee",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "06b70c4f-365b-494c-8859-a4d8d5b5f8d9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:45:14.405349Z",
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
  "phone": "+380635653210",
  "device_ref": "sandbox-24782"
}
```

```json
{
  "challenge_id": "4b5fce8c-8c57-4f08-92ac-d9744be7d35d",
  "expires_at": "2026-10-28T18:50:17.128023254Z",
  "resend_available_at": "2026-10-28T18:45:18.128023254Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635653210` → **200**

```json
{
  "phone": "+380635653210",
  "audience": "CLIENT",
  "code": "241330",
  "sent_at": "2026-10-28T18:45:17.130708976Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b5fce8c-8c57-4f08-92ac-d9744be7d35d",
  "code": "241330",
  "device_ref": "sandbox-24782"
}
```

```json
{
  "session_id": "15eca61f-1e7d-45f0-9431-778d43df4f90",
  "subject": {
    "type": "CLIENT",
    "id": "aeb0c30a-2291-4fee-9cba-320fdfb7d22b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZWIwYzMwYS0yMjkxLTRmZWUtOWNiYS0zMjBmZGZiN2QyMmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MDE3LCJpYXQiOjE3OTMyMTMxMTcsImp0aSI6ImEzMzU4ZjRmLWY3YzMtNDcwYi1iYjg0LWFlYzA3YTIxMTZiYyIsInNpZCI6IjE1ZWNhNjFmLTFlN2QtNDVmMC05NDMxLTc3OGQ0M2RmNGY5MCJ9.J0fnygxSfML9RG-NeO9mPMsO2w46GQyddhfQkAhVfo8",
  "access_expires_at": "2026-10-28T19:00:17.430256608Z",
  "refresh_token": "HYzkutNdnQzmPG3ZMff3iS5ea22y76Nrd2iCVrZl9uE",
  "refresh_expires_at": "2026-11-27T18:45:17.429609283Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "79180f72-5b6e-4127-a95b-9a6e39771065",
  "expires_at": "2026-10-28T18:50:19.708448222Z",
  "resend_available_at": "2026-10-28T18:45:20.708448222Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635653210` → **200**

```json
{
  "phone": "+380635653210",
  "audience": "CLIENT",
  "code": "639897",
  "sent_at": "2026-10-28T18:45:19.711106648Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "fed4e0e1-4f61-4cc4-b64e-754925be10b5",
  "challenge_id": "79180f72-5b6e-4127-a95b-9a6e39771065",
  "otp_code": "639897"
}
```

```json
{
  "id": "299d6171-de36-4214-9d0d-e3b163f63761",
  "state": "PENDING",
  "created_at": "2026-10-28T18:45:20.020824Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/299d6171-de36-4214-9d0d-e3b163f63761` → **200**

```json
{
  "id": "299d6171-de36-4214-9d0d-e3b163f63761",
  "state": "PENDING",
  "created_at": "2026-10-28T18:45:20.020824Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/299d6171-de36-4214-9d0d-e3b163f63761` → **200**

```json
{
  "id": "299d6171-de36-4214-9d0d-e3b163f63761",
  "state": "PENDING",
  "created_at": "2026-10-28T18:45:20.020824Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/299d6171-de36-4214-9d0d-e3b163f63761` → **200**

```json
{
  "id": "299d6171-de36-4214-9d0d-e3b163f63761",
  "state": "PENDING",
  "created_at": "2026-10-28T18:45:20.020824Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/299d6171-de36-4214-9d0d-e3b163f63761` → **200**

```json
{
  "id": "299d6171-de36-4214-9d0d-e3b163f63761",
  "state": "PENDING",
  "created_at": "2026-10-28T18:45:20.020824Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/299d6171-de36-4214-9d0d-e3b163f63761` → **200**

```json
{
  "id": "299d6171-de36-4214-9d0d-e3b163f63761",
  "state": "PENDING",
  "created_at": "2026-10-28T18:45:20.020824Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/299d6171-de36-4214-9d0d-e3b163f63761` → **200**

```json
{
  "id": "299d6171-de36-4214-9d0d-e3b163f63761",
  "state": "READY",
  "created_at": "2026-10-28T18:45:20.020824Z",
  "ready_at": "2026-10-28T18:45:26.172481Z",
  "expires_at": "2026-11-04T18:45:26.172481Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/299d6171-de36-4214-9d0d-e3b163f63761/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637620876",
  "device_ref": "sandbox-25574"
}
```

```json
{
  "challenge_id": "cef9ca7a-27a3-47d8-9677-c7f536a0a10c",
  "expires_at": "2026-10-28T18:50:26.950650197Z",
  "resend_available_at": "2026-10-28T18:45:27.950650197Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637620876` → **200**

```json
{
  "phone": "+380637620876",
  "audience": "CLIENT",
  "code": "629171",
  "sent_at": "2026-10-28T18:45:26.953281998Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cef9ca7a-27a3-47d8-9677-c7f536a0a10c",
  "code": "629171",
  "device_ref": "sandbox-25574"
}
```

```json
{
  "session_id": "a1cafa9e-208e-4002-89f6-de23dfd79390",
  "subject": {
    "type": "CLIENT",
    "id": "be4b21e0-b7e0-4d9b-88bd-f1eff30e818f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTRiMjFlMC1iN2UwLTRkOWItODhiZC1mMWVmZjMwZTgxOGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MDI3LCJpYXQiOjE3OTMyMTMxMjcsImp0aSI6ImY2ZjMzYzRmLTU3MWQtNDFkYi1hOTU5LTExODE2MDRjNDc2OSIsInNpZCI6ImExY2FmYTllLTIwOGUtNDAwMi04OWY2LWRlMjNkZmQ3OTM5MCJ9.TRBRhzONuKbZGZggAwt5XkON9Ojx-MZVvE5wVGx1SI8",
  "access_expires_at": "2026-10-28T19:00:27.257584263Z",
  "refresh_token": "0u4_PLjItYG33m8J9GDqVoTSGV-9FkfTwEbpnpUCptc",
  "refresh_expires_at": "2026-11-27T18:45:27.257082782Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/299d6171-de36-4214-9d0d-e3b163f63761/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/299d6171-de36-4214-9d0d-e3b163f63761/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cf52d6bc-d5e5-4c82-9041-9facb73b368c"
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
  "session_id": "86116f7d-4ed2-436c-bd70-ac7bc0d1092e",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwMjgsImlhdCI6MTc5MzIxMzEyOCwianRpIjoiNzU5ZTljMGQtMTMyYS00NTEwLTk2MmMtNjcyYmE0NmRhNjQ0Iiwic2lkIjoiODYxMTZmN2QtNGVkMi00MzZjLWJkNzAtYWM3YmMwZDEwOTJlIn0.ErG0vIEqpBoYfuqBQV1ztwdzq4SqLAQSfzfYLPaMi2A",
  "access_expires_at": "2026-10-28T19:00:28.139570653Z",
  "refresh_token": "fJlJh5Ys2k8jdFnAG-TSDJK2xHkdFwnJfsJVUsRM5rI",
  "refresh_expires_at": "2026-10-29T06:45:28.139040335Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "aeb0c30a-2291-4fee-9cba-320fdfb7d22b",
  "session_id": "15eca61f-1e7d-45f0-9431-778d43df4f90",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/aeb0c30a-2291-4fee-9cba-320fdfb7d22b/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "299d6171-de36-4214-9d0d-e3b163f63761",
      "state": "READY",
      "created_at": "2026-10-28T18:45:20.020824Z",
      "ready_at": "2026-10-28T18:45:26.172481Z",
      "expires_at": "2026-11-04T18:45:26.172481Z",
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
  "device_ref": "sandbox-31520"
}
```

```json
{
  "challenge_id": "2ef2d722-5768-45a0-aed4-2b4603f131af",
  "expires_at": "2026-10-28T18:50:28.979572518Z",
  "resend_available_at": "2026-10-28T18:45:29.979572518Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "383326",
  "sent_at": "2026-10-28T18:45:28.98187311Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ef2d722-5768-45a0-aed4-2b4603f131af",
  "code": "383326",
  "device_ref": "sandbox-31520"
}
```

```json
{
  "session_id": "0473b432-79a2-4dd3-8e54-50bfadbe679d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDAyOSwiaWF0IjoxNzkzMjEzMTI5LCJqdGkiOiI0YzcxODllOC03Y2Y2LTQ0ZTktYTgzZC01NGI1M2Q2M2RkZDYiLCJzaWQiOiIwNDczYjQzMi03OWEyLTRkZDMtOGU1NC01MGJmYWRiZTY3OWQifQ.vPppQy07Vw994Qv_0_k6HO9sieXqF2Ss6PzleqUjfwQ",
  "access_expires_at": "2026-10-28T19:00:29.28295697Z",
  "refresh_token": "orioSEbNBO4S7xMdJPSY9bjNENz0SKPAmNZ0dXqr_mc",
  "refresh_expires_at": "2026-11-27T18:45:29.282459171Z",
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
  "device_ref": "sandbox-12936"
}
```

```json
{
  "challenge_id": "1797d4cd-683e-4011-a443-ac663d9fc760",
  "expires_at": "2026-10-28T18:50:29.852406508Z",
  "resend_available_at": "2026-10-28T18:45:30.852406508Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "067314",
  "sent_at": "2026-10-28T18:45:29.854617099Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1797d4cd-683e-4011-a443-ac663d9fc760",
  "code": "067314",
  "device_ref": "sandbox-12936"
}
```

```json
{
  "session_id": "4d5343b1-854a-444a-9c92-e2b927099fd0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDAzMCwiaWF0IjoxNzkzMjEzMTMwLCJqdGkiOiJjOTUzYWIzYS0xOWEzLTQyNmYtYjBlYy01N2FjZjg3ZTczYTAiLCJzaWQiOiI0ZDUzNDNiMS04NTRhLTQ0NGEtOWM5Mi1lMmI5MjcwOTlmZDAifQ.akO1v2ol9N5Hts868p_sQBnQaBDrwBsEsD_8OI64Pj0",
  "access_expires_at": "2026-10-28T19:00:30.159474077Z",
  "refresh_token": "h-wFoB_WYhjd0BVANJfxuhtaGeUMoioqK8w7bKYfxJ0",
  "refresh_expires_at": "2026-11-27T18:45:30.158868186Z",
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
  "command_id": "482dea5c-4756-403a-b69b-973c187ba49e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:45:30Z",
    "sequence": 1793213130721
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bd2f24f3-c07d-4e5f-b760-e0d704ae2f40",
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
  "last_heartbeat_at": "2026-10-28T18:45:30.741546Z",
  "last_location_at": "2026-10-28T18:45:30.741546Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-20355"
}
```

```json
{
  "challenge_id": "446224ff-0d6f-4cd4-a3a5-f7258cb7a303",
  "expires_at": "2026-10-28T18:50:31.019098827Z",
  "resend_available_at": "2026-10-28T18:45:32.019098827Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "687143",
  "sent_at": "2026-10-28T18:45:31.021357766Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "446224ff-0d6f-4cd4-a3a5-f7258cb7a303",
  "code": "687143",
  "device_ref": "sandbox-20355"
}
```

```json
{
  "session_id": "01450a33-be40-4351-8de2-9490d0e71e85",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDAzMSwiaWF0IjoxNzkzMjEzMTMxLCJqdGkiOiJkZDU1MzQ2ZS1kODU1LTRlNzEtYWZhZi1iN2ExZWMwMjFiZmYiLCJzaWQiOiIwMTQ1MGEzMy1iZTQwLTQzNTEtOGRlMi05NDkwZDBlNzFlODUifQ.yNtZP4Sqb0bXkkvCQlmolqzLgjaEj_fO8VMO5-XSEYA",
  "access_expires_at": "2026-10-28T19:00:31.325013442Z",
  "refresh_token": "bKD0FoNPmIe2Sk_l8PfPcVMeJPZYrRKwqMX3mL1-Voc",
  "refresh_expires_at": "2026-11-27T18:45:31.324445197Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8220d8cc-8fdc-4e6a-8178-6d66aec328af",
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
  "last_heartbeat_at": "2026-10-28T18:44:20.550583Z",
  "last_location_at": "2026-10-28T18:44:20.550583Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8220d8cc-8fdc-4e6a-8178-6d66aec328af/handover` → **200**

```json
{
  "command_id": "7a12b56b-3576-42e9-bb35-1b74b0c5044e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8220d8cc-8fdc-4e6a-8178-6d66aec328af",
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
  "last_heartbeat_at": "2026-10-28T18:44:20.550583Z",
  "last_location_at": "2026-10-28T18:44:20.550583Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8220d8cc-8fdc-4e6a-8178-6d66aec328af/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:45:32Z",
    "sequence": 1793213132167
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8220d8cc-8fdc-4e6a-8178-6d66aec328af",
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
  "last_heartbeat_at": "2026-10-28T18:45:32.187775Z",
  "last_location_at": "2026-10-28T18:45:32.187775Z",
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
  "session_id": "6ab9b21f-7c6d-44aa-96c8-e29cc0c9acfc",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwMzIsImlhdCI6MTc5MzIxMzEzMiwianRpIjoiNTdiMjU4YjYtMDFiMS00NTJjLTg4YzItMzg1ZjJjZTJhNDEyIiwic2lkIjoiNmFiOWIyMWYtN2M2ZC00NGFhLTk2YzgtZTI5Y2MwYzlhY2ZjIn0.3sPNTMhy6EpdEb0qjqbt4HAoOJUujkepkN2n47xwpsU",
  "access_expires_at": "2026-10-28T19:00:32.790756557Z",
  "refresh_token": "Gis5CIxl2RvVKWuCGdpXDQQZ2-c4aOWaIDcWrB9tk08",
  "refresh_expires_at": "2026-10-29T06:45:32.790243185Z",
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
  "session_id": "5ab21d5b-9a8e-44fd-98ff-d0fc1b1a8060",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwMzMsImlhdCI6MTc5MzIxMzEzMywianRpIjoiMzViMDRlODktNjExMC00OTBiLThiZWYtOGMzM2FmODc1YWE3Iiwic2lkIjoiNWFiMjFkNWItOWE4ZS00NGZkLTk4ZmYtZDBmYzFiMWE4MDYwIn0.1bDgauFgW86APVybHznVksY442P9TeL_q-6bgPu8VsQ",
  "access_expires_at": "2026-10-28T19:00:33.396674687Z",
  "refresh_token": "0qpR_l6vq1nvoBmT37PyKBJuvzH9nFDNGZ4wdTYbu90",
  "refresh_expires_at": "2026-10-29T06:45:33.396079131Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681185171",
  "device_ref": "sandbox-825"
}
```

```json
{
  "challenge_id": "99c81c4e-8f1c-47af-a639-081ed39265d4",
  "expires_at": "2026-10-28T18:50:33.664729681Z",
  "resend_available_at": "2026-10-28T18:45:34.664729681Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380681185171` → **200**

```json
{
  "phone": "+380681185171",
  "audience": "CLIENT",
  "code": "443368",
  "sent_at": "2026-10-28T18:45:33.667190388Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99c81c4e-8f1c-47af-a639-081ed39265d4",
  "code": "443368",
  "device_ref": "sandbox-825"
}
```

```json
{
  "session_id": "7a674665-2f71-47e7-b907-f7480b9538ff",
  "subject": {
    "type": "CLIENT",
    "id": "46ea1ccd-c2e4-4ad0-ba55-4f089291193a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NmVhMWNjZC1jMmU0LTRhZDAtYmE1NS00ZjA4OTI5MTE5M2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MDMzLCJpYXQiOjE3OTMyMTMxMzMsImp0aSI6IjIzN2U1YjcyLWE4OTItNGE2Zi1iYWJjLTJkMWU2N2NlYTVjZSIsInNpZCI6IjdhNjc0NjY1LTJmNzEtNDdlNy1iOTA3LWY3NDgwYjk1MzhmZiJ9.H7ShEZldl_V5cPTGR_jjwPMmnH-z93ez2uUDbr8U5qA",
  "access_expires_at": "2026-10-28T19:00:33.9641243Z",
  "refresh_token": "rVH1GHzJEYG8OS71z5U7xt4nyVPPqnOGfygJVNQJvQw",
  "refresh_expires_at": "2026-11-27T18:45:33.963640483Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "28fe2655-5ef7-49de-8f8d-9e4d64a66fa4",
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
  "id": "93070fbe-e7ca-4251-97aa-1111b52b2014",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:50:34.238301Z",
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
  "command_id": "e4cb8938-1a1b-41cd-93c2-06379544cdeb",
  "quote_id": "93070fbe-e7ca-4251-97aa-1111b52b2014",
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
  "id": "a66d5205-bfb5-4386-8f23-f381b523ca49",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "46ea1ccd-c2e4-4ad0-ba55-4f089291193a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:45:34.539055Z",
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
    "id": "619659a1-a87a-406f-a4de-14855ecd1a57",
    "order_id": "a66d5205-bfb5-4386-8f23-f381b523ca49",
    "expires_at": "2026-10-28T18:45:49.542963Z",
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

`POST /api/driver/v1/offers/619659a1-a87a-406f-a4de-14855ecd1a57/reject` → **204**

```json
{
  "command_id": "6203ab55-c12a-44e7-9438-63fa812eca1a"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b23b7bc8-26c5-4d20-9f3c-b7844f5014aa",
    "order_id": "a66d5205-bfb5-4386-8f23-f381b523ca49",
    "expires_at": "2026-10-28T18:45:50.137021Z",
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

`POST /api/driver/v1/offers/b23b7bc8-26c5-4d20-9f3c-b7844f5014aa/accept` → **200**

```json
{
  "command_id": "82ffa0c1-666a-40f0-8821-436673aa2432"
}
```

```json
{
  "id": "58b45b3a-fced-4436-9474-1357c2b23b80",
  "order_id": "a66d5205-bfb5-4386-8f23-f381b523ca49",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7352b7e5-82d4-4682-b750-aa8d736212b9",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/a66d5205-bfb5-4386-8f23-f381b523ca49/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T18:45:34.53962Z",
      "actor": {
        "type": "CLIENT",
        "id": "46ea1ccd-c2e4-4ad0-ba55-4f089291193a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a66d5205-bfb5-4386-8f23-f381b523ca49",
        "quote_id": "93070fbe-e7ca-4251-97aa-1111b52b2014",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "64c49e5a-dcd4-4615-bc36-37f440e5c722"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T18:45:34.542003Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a66d5205-bfb5-4386-8f23-f381b523ca49",
        "attempt_id": "1904b1c8-e607-4929-9b67-aa93fbdf7fe9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "64c49e5a-dcd4-4615-bc36-37f440e5c722"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T18:45:34.548859Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "619659a1-a87a-406f-a4de-14855ecd1a57",
        "order_id": "a66d5205-bfb5-4386-8f23-f381b523ca49",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "64c49e5a-dcd4-4615-bc36-37f440e5c722"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T18:45:35.135922Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "619659a1-a87a-406f-a4de-14855ecd1a57",
        "order_id": "a66d5205-bfb5-4386-8f23-f381b523ca49"
      },
      "correlation_id": "a29c55fd-c89f-4752-aaa1-540fef0c5729"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order a66d5205-bfb5-4386-8f23-f381b523ca49 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/a66d5205-bfb5-4386-8f23-f381b523ca49` → **200**

```json
{
  "id": "a66d5205-bfb5-4386-8f23-f381b523ca49",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "46ea1ccd-c2e4-4ad0-ba55-4f089291193a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "58b45b3a-fced-4436-9474-1357c2b23b80",
    "order_id": "a66d5205-bfb5-4386-8f23-f381b523ca49",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7352b7e5-82d4-4682-b750-aa8d736212b9",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T18:45:34.539055Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a66d5205-bfb5-4386-8f23-f381b523ca49/cancel` → **200**

```json
{
  "command_id": "ca715b7a-d362-43c3-9989-e7797242f80f",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a66d5205-bfb5-4386-8f23-f381b523ca49",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "46ea1ccd-c2e4-4ad0-ba55-4f089291193a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "58b45b3a-fced-4436-9474-1357c2b23b80",
    "order_id": "a66d5205-bfb5-4386-8f23-f381b523ca49",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7352b7e5-82d4-4682-b750-aa8d736212b9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T18:45:34.539055Z",
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
  "session_id": "bd2f24f3-c07d-4e5f-b760-e0d704ae2f40",
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
  "last_heartbeat_at": "2026-10-28T18:45:30.741546Z",
  "last_location_at": "2026-10-28T18:45:30.741546Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bd2f24f3-c07d-4e5f-b760-e0d704ae2f40/close` → **200**

```json
{
  "command_id": "f9aa6bfa-a608-4121-b673-4f0a84a173b7",
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
  "session_id": "8220d8cc-8fdc-4e6a-8178-6d66aec328af",
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
  "last_heartbeat_at": "2026-10-28T18:45:32.187775Z",
  "last_location_at": "2026-10-28T18:45:32.187775Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8220d8cc-8fdc-4e6a-8178-6d66aec328af/close` → **200**

```json
{
  "command_id": "9ded1024-a8e2-4be2-a46d-04680fb9d52b",
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
  "session_id": "52b32720-ea34-4a1c-a87a-a863369e0474",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwMzgsImlhdCI6MTc5MzIxMzEzOCwianRpIjoiZWRmMjllOWMtOTNkZi00MWZkLTg0NGYtM2NmYzNjNjM4YzA2Iiwic2lkIjoiNTJiMzI3MjAtZWEzNC00YTFjLWE4N2EtYTg2MzM2OWUwNDc0In0.cDOr9Ct5ya5uP7voUtpiMWMv-cOJPyBsUf8eOBGG6y0",
  "access_expires_at": "2026-10-28T19:00:38.107377012Z",
  "refresh_token": "gAJJVd-SoLbj3eVnrRjAk76C34mJRoJAg1rqdwpEWwc",
  "refresh_expires_at": "2026-10-29T06:45:38.106852323Z",
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
  "command_id": "9a119a0d-799a-4d21-9925-feace599de6b",
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
  "changed_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T18:45:38.67616Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "ac3e34a7-866b-4c15-beed-99312293bc67",
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
  "correlation_id": "fd1640d8-9201-4b0b-bff3-b89d3f3cbae1"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "0c2b542c-6772-4ce2-909f-f21272d7240b",
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
  "correlation_id": "3f1284d2-1e85-4a7d-baeb-742e7cb89fcc"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633672345",
  "device_ref": "sandbox-23476"
}
```

```json
{
  "challenge_id": "a7c1c76d-cfd1-4e8d-b83e-98bff0c9e080",
  "expires_at": "2026-10-28T18:50:39.515004584Z",
  "resend_available_at": "2026-10-28T18:45:40.515004584Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633672345` → **200**

```json
{
  "phone": "+380633672345",
  "audience": "CLIENT",
  "code": "291866",
  "sent_at": "2026-10-28T18:45:39.517523908Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7c1c76d-cfd1-4e8d-b83e-98bff0c9e080",
  "code": "291866",
  "device_ref": "sandbox-23476"
}
```

```json
{
  "session_id": "331c41d5-8548-4f9f-acc4-b4d98b31dba2",
  "subject": {
    "type": "CLIENT",
    "id": "147440b9-fab4-440e-b5a4-6b6730f654d2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNDc0NDBiOS1mYWI0LTQ0MGUtYjVhNC02YjY3MzBmNjU0ZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MDM5LCJpYXQiOjE3OTMyMTMxMzksImp0aSI6IjRkNDEzMzk4LTcwMWYtNDU0Yy1hOGU3LTNmZTZmOTJiYzE5ZSIsInNpZCI6IjMzMWM0MWQ1LTg1NDgtNGY5Zi1hY2M0LWI0ZDk4YjMxZGJhMiJ9.X-tA1XeqdEf6XLCUmY4VUZ5dODkXqignXzb4vX-0y5I",
  "access_expires_at": "2026-10-28T19:00:39.822808863Z",
  "refresh_token": "Ps4Lu6K6MUxaHidVNMNPADtk_hyILOMdZK_4obvXblk",
  "refresh_expires_at": "2026-11-27T18:45:39.822171885Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8fb0fe96-5278-4aff-b86b-5508d61f9e67",
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
  "id": "ce298a51-d275-49f5-80a5-dbec6029e2f4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:50:40.108651Z",
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
  "command_id": "9e9fe3de-934c-4288-b6fc-0ee8ecc0fa90",
  "quote_id": "ce298a51-d275-49f5-80a5-dbec6029e2f4",
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
  "correlation_id": "422aa42e-ccd8-4b45-a307-16d5ec4028c8"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3f7aec2b-3bec-4f12-9592-1746c5f258c0",
  "quote_id": "ce298a51-d275-49f5-80a5-dbec6029e2f4",
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
  "id": "278b1c4d-43aa-43bd-b1e3-38c3ca749a03",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "147440b9-fab4-440e-b5a4-6b6730f654d2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:45:40.679871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/278b1c4d-43aa-43bd-b1e3-38c3ca749a03/cancel` → **200**

```json
{
  "command_id": "2de4896c-4995-4ace-a021-970fed7b0393",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "278b1c4d-43aa-43bd-b1e3-38c3ca749a03",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "147440b9-fab4-440e-b5a4-6b6730f654d2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:45:40.679871Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "2a547741-67e1-4ea7-b383-687f688c80b8",
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
  "changed_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T18:45:41.291443Z"
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
      "changed_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T18:45:41.291443Z"
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
  "device_ref": "sandbox-24415"
}
```

```json
{
  "challenge_id": "9245eac8-db26-498a-9714-765ac4ad348a",
  "expires_at": "2026-10-28T18:50:42.137584579Z",
  "resend_available_at": "2026-10-28T18:45:43.137584579Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "257216",
  "sent_at": "2026-10-28T18:45:42.139768116Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9245eac8-db26-498a-9714-765ac4ad348a",
  "code": "257216",
  "device_ref": "sandbox-24415"
}
```

```json
{
  "session_id": "44410aa7-6d25-400b-8d32-ebe02465ba08",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDA0MiwiaWF0IjoxNzkzMjEzMTQyLCJqdGkiOiI4ZmJlMjBjZS0wYjE4LTQyYmQtYTlhOS05YTllODc2MTg5YTAiLCJzaWQiOiI0NDQxMGFhNy02ZDI1LTQwMGItOGQzMi1lYmUwMjQ2NWJhMDgifQ.2vbebreXjafCot9y5g5Wq30TcfQt7kPm9vNnv_GJsjY",
  "access_expires_at": "2026-10-28T19:00:42.440835274Z",
  "refresh_token": "K_PIaI91xTWJyNhyjmMQsPwNLFinaevH65RHmvnpCDQ",
  "refresh_expires_at": "2026-11-27T18:45:42.44034085Z",
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
  "command_id": "fd2f0f21-cc39-48a5-afe2-3f39b30c1c31",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:45:42Z",
    "sequence": 1793213142986
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a",
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
  "last_heartbeat_at": "2026-10-28T18:45:43.005705Z",
  "last_location_at": "2026-10-28T18:45:43.005705Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678029772",
  "device_ref": "sandbox-2310"
}
```

```json
{
  "challenge_id": "115cbf07-040a-45f9-9dbe-21f23e531061",
  "expires_at": "2026-10-28T18:50:43.284915303Z",
  "resend_available_at": "2026-10-28T18:45:44.284915303Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678029772` → **200**

```json
{
  "phone": "+380678029772",
  "audience": "CLIENT",
  "code": "109580",
  "sent_at": "2026-10-28T18:45:43.287148475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "115cbf07-040a-45f9-9dbe-21f23e531061",
  "code": "109580",
  "device_ref": "sandbox-2310"
}
```

```json
{
  "session_id": "416f9317-9b8f-49a2-b997-9ed26116b347",
  "subject": {
    "type": "CLIENT",
    "id": "c6362c7e-0a82-45c9-8fcb-ee5e34b92eb5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjM2MmM3ZS0wYTgyLTQ1YzktOGZjYi1lZTVlMzRiOTJlYjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MDQzLCJpYXQiOjE3OTMyMTMxNDMsImp0aSI6ImE4YWI0OGZlLTM3MDEtNDNjOC05MjMwLTU1ZjljMmViOTgzYyIsInNpZCI6IjQxNmY5MzE3LTliOGYtNDlhMi1iOTk3LTllZDI2MTE2YjM0NyJ9.wcY4nXG_CcjrHeouP7e2DX5AIq_r8luW-Ukw-hL0gNo",
  "access_expires_at": "2026-10-28T19:00:43.578196755Z",
  "refresh_token": "RZaPVzOpR8tqkJwcPnoZHHLb4CbNW1kHf6ZZtfbI8a8",
  "refresh_expires_at": "2026-11-27T18:45:43.577712596Z",
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
  "command_id": "c405f4ca-497a-45e1-812a-9f3728f0b3ea",
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
  "id": "3f51e84b-71c9-4bd4-b372-40de341e0ce9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:50:44.121469Z",
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
  "command_id": "0c071c7f-3935-4166-9d9e-151cab49bb01",
  "platform": "ANDROID",
  "token": "sandbox-driver-ae24494b-aec9-404b-b6c6-64f478a4f447"
}
```

```json
{
  "id": "372a942b-b559-4581-91df-6b690051ba4e",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T18:45:44.420219Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "866db993-9f19-4eed-be88-352512e465e3",
  "platform": "ANDROID",
  "token": "sandbox-rider-df05dd57-c225-4046-9455-dd133533ee23"
}
```

```json
{
  "id": "d8121b1e-4ba6-4f73-96f8-1150c8a651cc",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T18:45:44.709596Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "464fa961-5e5e-4732-ba6f-2f538908e7d5",
  "quote_id": "3f51e84b-71c9-4bd4-b372-40de341e0ce9",
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
  "id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c6362c7e-0a82-45c9-8fcb-ee5e34b92eb5",
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
  "created_at": "2026-10-28T18:45:44.998679Z",
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
    "id": "b3df22b5-656e-41d5-9e5f-e3052730bb07",
    "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
    "expires_at": "2026-10-28T18:46:00.001779Z",
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

`POST /api/driver/v1/offers/b3df22b5-656e-41d5-9e5f-e3052730bb07/accept` → **200**

```json
{
  "command_id": "d839c57d-994e-495b-8f27-4f62b0629a10"
}
```

```json
{
  "id": "00dbacb9-690f-42ff-aeae-cc7e888fe2c5",
  "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b843fd26-58eb-46af-947d-b12d7fce9552",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T18:45:44.973Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T18:45:44.973Z` → **200**

```json
[
  {
    "at": "2026-10-28T18:45:46.587531147Z",
    "token_suffix": "a4f447",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "6a3f847a-f657-4f8a-9aa0-31b5f9f6bc3a",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380678029772&after=2026-10-28T18:45:44.973Z` → **200**

```json
[
  {
    "at": "2026-10-28T18:45:46.590088907Z",
    "token_suffix": "33ee23",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "51a81faa-99c6-4361-9466-26aa4af2f585",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/dc4688b2-ab6e-41d3-b003-5c98173af015/messages` → **201**

```json
{
  "command_id": "f76883b7-17b8-44e2-8ab7-73e98d94bd1b",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "f88bff59-3ef9-4099-9051-eceeb9d5ee62",
  "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T18:45:46.93811077Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b843fd26-58eb-46af-947d-b12d7fce9552",
  "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
  "assignment_id": "00dbacb9-690f-42ff-aeae-cc7e888fe2c5",
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

`POST /api/driver/v1/trips/b843fd26-58eb-46af-947d-b12d7fce9552/messages` → **201**

```json
{
  "command_id": "f118b9ea-9e1c-4ee7-a051-1910e6b64e61",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "8f57a23f-fa02-4dd7-8738-85bc8b0e69e3",
  "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T18:45:47.481723835Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/dc4688b2-ab6e-41d3-b003-5c98173af015/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/b843fd26-58eb-46af-947d-b12d7fce9552/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678029772"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:45:48Z",
    "sequence": 1793213148286
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a",
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
  "last_heartbeat_at": "2026-10-28T18:45:48.305912Z",
  "last_location_at": "2026-10-28T18:45:48.305912Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b843fd26-58eb-46af-947d-b12d7fce9552",
  "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
  "assignment_id": "00dbacb9-690f-42ff-aeae-cc7e888fe2c5",
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

`POST /api/driver/v1/trips/b843fd26-58eb-46af-947d-b12d7fce9552/arrive` → **200**

```json
{
  "command_id": "6effb121-ce89-476b-8254-4ae6a50e5458",
  "expected_version": 0
}
```

```json
{
  "id": "b843fd26-58eb-46af-947d-b12d7fce9552",
  "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
  "assignment_id": "00dbacb9-690f-42ff-aeae-cc7e888fe2c5",
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
  "arrived_at": "2026-10-28T18:45:48.852081Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b843fd26-58eb-46af-947d-b12d7fce9552/start` → **200**

```json
{
  "command_id": "d9ebc081-b74c-4462-98d3-9b39e2eb29e9",
  "expected_version": 1
}
```

```json
{
  "id": "b843fd26-58eb-46af-947d-b12d7fce9552",
  "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
  "assignment_id": "00dbacb9-690f-42ff-aeae-cc7e888fe2c5",
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
  "arrived_at": "2026-10-28T18:45:48.852081Z",
  "started_at": "2026-10-28T18:45:49.146891Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:45:49Z",
    "sequence": 1793213149418
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a",
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
  "last_heartbeat_at": "2026-10-28T18:45:49.438751Z",
  "last_location_at": "2026-10-28T18:45:49.438751Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/b843fd26-58eb-46af-947d-b12d7fce9552/complete` → **200**

```json
{
  "command_id": "cc2551d7-2400-4b5a-8752-822ec4bf7069",
  "expected_version": 2,
  "reported_at": "2026-10-28T18:45:49Z",
  "cash_received": true
}
```

```json
{
  "id": "b843fd26-58eb-46af-947d-b12d7fce9552",
  "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
  "assignment_id": "00dbacb9-690f-42ff-aeae-cc7e888fe2c5",
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
  "arrived_at": "2026-10-28T18:45:48.852081Z",
  "started_at": "2026-10-28T18:45:49.146891Z",
  "completed_at": "2026-10-28T18:45:49.722571Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/dc4688b2-ab6e-41d3-b003-5c98173af015` → **200**

```json
{
  "id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c6362c7e-0a82-45c9-8fcb-ee5e34b92eb5",
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
    "id": "00dbacb9-690f-42ff-aeae-cc7e888fe2c5",
    "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b843fd26-58eb-46af-947d-b12d7fce9552",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T18:45:44.998679Z",
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
    "id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T18:45:44.998679Z",
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
    "id": "b843fd26-58eb-46af-947d-b12d7fce9552",
    "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
    "order_short_number": 10,
    "created_at": "2026-10-28T18:45:45.558629Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "f482c4e1-00c3-4b42-81be-1095260bf649",
    "order_id": "12d57b35-e3d4-4b06-8a1b-c3b7c195ea79",
    "order_short_number": 2,
    "created_at": "2026-10-28T18:44:11.245776Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d720bec0-d664-410b-b742-d90891cba0bd",
    "order_id": "cc7b0b83-b96d-43db-b4c3-1d00f5caec6b",
    "order_short_number": 1,
    "created_at": "2026-10-28T18:43:52.020897Z",
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

`GET /api/rider/v1/orders/dc4688b2-ab6e-41d3-b003-5c98173af015/tip` → **200**

```json
{
  "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
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
  "available_until": "2026-10-29T18:45:49.722571Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/dc4688b2-ab6e-41d3-b003-5c98173af015/tip` → **201**

```json
{
  "command_id": "32b898c9-7455-411e-96be-978144581482",
  "amount_minor": 1100
}
```

```json
{
  "id": "f2827fae-c5fb-4033-81eb-f5eb5538ea9e",
  "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T18:45:54.695818Z"
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
  "session_id": "7dc475b3-a96e-4fc6-a8f3-bb3ddcdd6cf3",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwNTUsImlhdCI6MTc5MzIxMzE1NSwianRpIjoiNjQ0NGVkOWUtMzNjMS00YmZkLThlNmItOTdhZDQ2MTZhYmFmIiwic2lkIjoiN2RjNDc1YjMtYTk2ZS00ZmM2LWE4ZjMtYmIzZGRjZGQ2Y2YzIn0.De-MRdgP4p25ZKBXX1o-Sv-E-NozghAPPJytThQToHc",
  "access_expires_at": "2026-10-28T19:00:55.317691723Z",
  "refresh_token": "o7wJhwqjm9e54kzn1OFHGeGALYLicusz8kOwuPwNzXo",
  "refresh_expires_at": "2026-10-29T06:45:55.317122216Z",
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
          "PHONE": 1,
          "APP": 9
        },
        "by_payment": {
          "CASH": 9,
          "CARD": 1
        },
        "cancelled_by": {
          "RIDER": 3,
          "DRIVER": 1,
          "STAFF": 1
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
      "PHONE": 1,
      "APP": 9
    },
    "by_payment": {
      "CASH": 9,
      "CARD": 1
    },
    "cancelled_by": {
      "RIDER": 3,
      "DRIVER": 1,
      "STAFF": 1
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
  "generated_at": "2026-10-28T18:45:55.589797651Z"
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
  "generated_at": "2026-10-28T18:45:55.863348869Z"
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
  "session_id": "b64d9db8-ec9c-424a-a039-8d0d227df2d6",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwNTYsImlhdCI6MTc5MzIxMzE1NiwianRpIjoiYjFiN2M5ZmUtNTQxYy00ZDJlLWIzY2EtMDMyNzAyYmNjMTRlIiwic2lkIjoiYjY0ZDlkYjgtZWM5Yy00MjRhLWEwMzktOGQwZDIyN2RmMmQ2In0.CzpVpP1Wn1s4lhqJQxv6I1b9BgAVUkA2k9jUnvKAUPI",
  "access_expires_at": "2026-10-28T19:00:56.490462171Z",
  "refresh_token": "7lflQg2LdWavuEzyOKukWvFnR0ILpqlIIQcdgkpri6g",
  "refresh_expires_at": "2026-10-29T06:45:56.489941667Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dc4688b2-ab6e-41d3-b003-5c98173af015/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T18:45:44.999165Z",
      "actor": {
        "type": "CLIENT",
        "id": "c6362c7e-0a82-45c9-8fcb-ee5e34b92eb5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
        "quote_id": "3f51e84b-71c9-4bd4-b372-40de341e0ce9",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f8c3d0d5-eebb-487c-b367-684d829cfe8b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T18:45:45.0011Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
        "attempt_id": "cd1ee221-8102-44db-89c3-8443f4ddf6c0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f8c3d0d5-eebb-487c-b367-684d829cfe8b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T18:45:45.003717Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b3df22b5-656e-41d5-9e5f-e3052730bb07",
        "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "f8c3d0d5-eebb-487c-b367-684d829cfe8b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T18:45:45.56026Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b3df22b5-656e-41d5-9e5f-e3052730bb07",
        "order_id": "dc4688b2-ab6e-41d3-b003-5c98173af015",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "00dbacb9-690f-42ff-aeae-cc7e888fe2c5"
      },
      "correlation_id": "f7cbb3f0-e791-4914-9964-f44c1f244f64"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T18:45:57.046373845Z",
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
      "last_location_at": "2026-10-28T18:45:49.438751Z",
      "order_id": null
    }
  ]
}
```

Done: order dc4688b2-ab6e-41d3-b003-5c98173af015.

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
  "session_id": "68733dbe-70b4-49a0-8ade-8a2c63081343",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwNTcsImlhdCI6MTc5MzIxMzE1NywianRpIjoiZjEwY2ViZDUtZjJlMS00MzgxLThhZTQtMTQxODBjMWJjNTY0Iiwic2lkIjoiNjg3MzNkYmUtNzBiNC00OWEwLThhZGUtOGEyYzYzMDgxMzQzIn0.RajlD3ZyuDs9SzWBeWyV-BZRflXwkpfzOTMDZKeCDcs",
  "access_expires_at": "2026-10-28T19:00:57.676798035Z",
  "refresh_token": "bHO88MP5FgR9jAN5hrpOkUm5_A49BV6W8KbMRxorPOM",
  "refresh_expires_at": "2026-10-29T06:45:57.676297702Z",
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
  "command_id": "6f43b67e-2abc-431f-8cf5-9897e4c16580",
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
  "timestamp": "2026-10-28T18:45:58.000+0000",
  "channel": {
    "id": "1730052000.2131827076",
    "linkedid": "1730052000.2131827076",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679289149"
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
  "timestamp": "2026-10-28T18:45:58.000+0000",
  "channel": {
    "id": "1730052000.2131827076",
    "linkedid": "1730052000.2131827076",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679289149"
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
  "session_id": "ce352b2b-0323-4d7d-b54d-0dfff06c1d7b",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwNTgsImlhdCI6MTc5MzIxMzE1OCwianRpIjoiOTY3NTM4MDQtMWM1Zi00NTcxLWEwZGMtM2E0ZGMxYWIyYzQ5Iiwic2lkIjoiY2UzNTJiMmItMDMyMy00ZDdkLWI1NGQtMGRmZmYwNmMxZDdiIn0.kngURoXrK29hvaewkMlUSaTeF4JNwBcfLgF7vsMc3aA",
  "access_expires_at": "2026-10-28T19:00:58.88917352Z",
  "refresh_token": "AyOta-Vx_PysD0X3RUbQBInwgFs2PCn9rQ5uVlmWcSw",
  "refresh_expires_at": "2026-10-29T06:45:58.888515504Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "bb782f56-2d52-43a1-9ee1-22903c394a30",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679289149",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T18:45:58Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/bb782f56-2d52-43a1-9ee1-22903c394a30/answer` → **200**

```json
{
  "command_id": "df87bf05-2ad9-4018-874d-ed4b25860658"
}
```

```json
{
  "id": "bb782f56-2d52-43a1-9ee1-22903c394a30",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679289149",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "order_ids": [],
  "started_at": "2026-10-28T18:45:58Z",
  "answered_at": "2026-10-28T18:45:59.463509Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2131827076",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "09b0a129-522a-48fd-b772-75d73117eb23",
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
  "id": "a9542f79-8b5f-492a-be5c-5181dc24b6bc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:50:59.776104Z",
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
  "command_id": "324fbe2f-6b22-416c-ba44-86d49979b596",
  "quote_id": "a9542f79-8b5f-492a-be5c-5181dc24b6bc",
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
    "phone": "+380679289149"
  },
  "call_id": "bb782f56-2d52-43a1-9ee1-22903c394a30"
}
```

```json
{
  "id": "86ac3705-1f6a-40ae-a62b-19ddebf8851c",
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
  "created_at": "2026-10-28T18:46:00.077391Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679289149"
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
    "id": "1730052000.2131827076",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "bb782f56-2d52-43a1-9ee1-22903c394a30",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679289149",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [
        "86ac3705-1f6a-40ae-a62b-19ddebf8851c"
      ],
      "started_at": "2026-10-28T18:45:58Z",
      "answered_at": "2026-10-28T18:45:59.463509Z",
      "ended_at": "2026-10-28T18:46:00.382424Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "78a02513-31ab-46b6-b107-f890ed7daaa2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677079309",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [],
      "started_at": "2026-10-28T18:44:00.113876Z",
      "answered_at": "2026-10-28T18:44:00.437121Z",
      "ended_at": "2026-10-28T18:44:00.745182Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T18:44:06.153911Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/86ac3705-1f6a-40ae-a62b-19ddebf8851c` → **200**

```json
{
  "id": "86ac3705-1f6a-40ae-a62b-19ddebf8851c",
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
  "created_at": "2026-10-28T18:46:00.077391Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679289149"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/86ac3705-1f6a-40ae-a62b-19ddebf8851c` → **200**

```json
{
  "id": "86ac3705-1f6a-40ae-a62b-19ddebf8851c",
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
  "created_at": "2026-10-28T18:46:00.077391Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679289149"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/86ac3705-1f6a-40ae-a62b-19ddebf8851c/cancel` → **200**

```json
{
  "command_id": "af3d6802-5d51-45b3-a16a-a4702ff346a9",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "86ac3705-1f6a-40ae-a62b-19ddebf8851c",
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
  "created_at": "2026-10-28T18:46:00.077391Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679289149"
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

Done: call bb782f56-2d52-43a1-9ee1-22903c394a30 with order 86ac3705-1f6a-40ae-a62b-19ddebf8851c.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13897"
}
```

```json
{
  "challenge_id": "7a45a206-bb11-4b89-a9f6-57819f7daeea",
  "expires_at": "2026-10-28T18:51:01.597762586Z",
  "resend_available_at": "2026-10-28T18:46:02.597762586Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "162905",
  "sent_at": "2026-10-28T18:46:01.600138833Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a45a206-bb11-4b89-a9f6-57819f7daeea",
  "code": "162905",
  "device_ref": "sandbox-13897"
}
```

```json
{
  "session_id": "d5a7f81e-fec1-40cd-b88d-ee8517d93ef4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDA2MSwiaWF0IjoxNzkzMjEzMTYxLCJqdGkiOiI0NjdiYzgzMS1hOGNhLTQwMTctYmI4OC0xZTI0ZjRkZTQ2MGMiLCJzaWQiOiJkNWE3ZjgxZS1mZWMxLTQwY2QtYjg4ZC1lZTg1MTdkOTNlZjQifQ.ldwovyvS94fLcsImKkg58uNLhoZJPe9VkGEaJyI8Zzk",
  "access_expires_at": "2026-10-28T19:01:01.90201989Z",
  "refresh_token": "9y-M1tyxTkiGPIDP6Q8muFLscxJVOSdxHXy-b420yps",
  "refresh_expires_at": "2026-11-27T18:46:01.901425976Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a",
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
  "last_heartbeat_at": "2026-10-28T18:45:49.438751Z",
  "last_location_at": "2026-10-28T18:45:49.438751Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a/handover` → **200**

```json
{
  "command_id": "bd020441-2c3a-4380-a28b-65aa75be7cfa",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a",
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
  "last_heartbeat_at": "2026-10-28T18:45:49.438751Z",
  "last_location_at": "2026-10-28T18:45:49.438751Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:46:02Z",
    "sequence": 1793213162724
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a",
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
  "last_heartbeat_at": "2026-10-28T18:46:02.745136Z",
  "last_location_at": "2026-10-28T18:46:02.745136Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662327526",
  "device_ref": "sandbox-3134"
}
```

```json
{
  "challenge_id": "64bce452-0efe-4ce9-b893-c5c7b09cf01c",
  "expires_at": "2026-10-28T18:51:03.032347609Z",
  "resend_available_at": "2026-10-28T18:46:04.032347609Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662327526` → **200**

```json
{
  "phone": "+380662327526",
  "audience": "CLIENT",
  "code": "596779",
  "sent_at": "2026-10-28T18:46:03.035186553Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64bce452-0efe-4ce9-b893-c5c7b09cf01c",
  "code": "596779",
  "device_ref": "sandbox-3134"
}
```

```json
{
  "session_id": "4ce3234a-086b-4927-9a75-909845068134",
  "subject": {
    "type": "CLIENT",
    "id": "27670785-6089-4603-9249-c48a713e49a5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzY3MDc4NS02MDg5LTQ2MDMtOTI0OS1jNDhhNzEzZTQ5YTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MDYzLCJpYXQiOjE3OTMyMTMxNjMsImp0aSI6IjU0ZDM4YjAwLTFjNjEtNGZlMi04MjJkLTIwOTI4ZjU2NzRmMiIsInNpZCI6IjRjZTMyMzRhLTA4NmItNDkyNy05YTc1LTkwOTg0NTA2ODEzNCJ9.MM3743Tqs0Dw_tuDvJYYDzB-KuTfshMySSd-NvTBBRM",
  "access_expires_at": "2026-10-28T19:01:03.339471433Z",
  "refresh_token": "B-IuoTS3QqYwwkoaS2-5xQbQasiJasGMkdbVPZxcudU",
  "refresh_expires_at": "2026-11-27T18:46:03.338972211Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ff572363-fcd2-4e29-b5f1-62c078ae6722",
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
  "id": "cae41346-6c04-4001-bb4a-389aa373b22c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:51:03.626750Z",
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
  "command_id": "cf04d0c6-01a8-48ff-a5f0-96815968b794",
  "quote_id": "cae41346-6c04-4001-bb4a-389aa373b22c",
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
  "id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "27670785-6089-4603-9249-c48a713e49a5",
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
  "created_at": "2026-10-28T18:46:03.920999Z",
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
    "id": "b2a3e444-a71d-4ce6-a702-0394e674c86c",
    "order_id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
    "expires_at": "2026-10-28T18:46:18.924128Z",
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

`POST /api/driver/v1/offers/b2a3e444-a71d-4ce6-a702-0394e674c86c/accept` → **200**

```json
{
  "command_id": "11634525-1e49-4bbf-a27f-d26ec9554a5f"
}
```

```json
{
  "id": "62a7f596-1120-4755-8c31-2ed45c4d10d2",
  "order_id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4ff1bc07-b4b7-4db8-85c4-a1452d404e7f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4ff1bc07-b4b7-4db8-85c4-a1452d404e7f",
  "order_id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
  "assignment_id": "62a7f596-1120-4755-8c31-2ed45c4d10d2",
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

`POST /api/driver/v1/work-sessions/0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:46:05Z",
    "sequence": 1793213165455
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a",
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
  "last_heartbeat_at": "2026-10-28T18:46:05.065767Z",
  "last_location_at": "2026-10-28T18:46:05.065767Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4ff1bc07-b4b7-4db8-85c4-a1452d404e7f/arrive` → **200**

```json
{
  "command_id": "d6c5bf4a-d2f0-4451-ae36-70d960082037",
  "expected_version": 0
}
```

```json
{
  "id": "4ff1bc07-b4b7-4db8-85c4-a1452d404e7f",
  "order_id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
  "assignment_id": "62a7f596-1120-4755-8c31-2ed45c4d10d2",
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
  "arrived_at": "2026-10-28T18:46:05.344565Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4ff1bc07-b4b7-4db8-85c4-a1452d404e7f/start` → **200**

```json
{
  "command_id": "e2c9db95-b3f8-4db3-a025-596688213bcc",
  "expected_version": 1
}
```

```json
{
  "id": "4ff1bc07-b4b7-4db8-85c4-a1452d404e7f",
  "order_id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
  "assignment_id": "62a7f596-1120-4755-8c31-2ed45c4d10d2",
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
  "arrived_at": "2026-10-28T18:46:05.344565Z",
  "started_at": "2026-10-28T18:46:05.637523Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:46:05Z",
    "sequence": 1793213165940
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a",
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
  "last_heartbeat_at": "2026-10-28T18:46:05.960671Z",
  "last_location_at": "2026-10-28T18:46:05.960671Z",
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
  "device_ref": "sandbox-9008"
}
```

```json
{
  "challenge_id": "2be8fcb3-9c50-4371-942a-63c4ba6ebfd0",
  "expires_at": "2026-10-28T18:51:06.244577346Z",
  "resend_available_at": "2026-10-28T18:46:07.244577346Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "368258",
  "sent_at": "2026-10-28T18:46:06.246818544Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2be8fcb3-9c50-4371-942a-63c4ba6ebfd0",
  "code": "368258",
  "device_ref": "sandbox-9008"
}
```

```json
{
  "session_id": "b7874cc9-ea6e-4fcc-ad11-a5f055a26f4a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDA2NiwiaWF0IjoxNzkzMjEzMTY2LCJqdGkiOiJjMmY0YTE1YS1hZWE0LTRiZTItOGYwOC1mMzA4MWZjNzAyMzMiLCJzaWQiOiJiNzg3NGNjOS1lYTZlLTRmY2MtYWQxMS1hNWYwNTVhMjZmNGEifQ.kRde2UTmFGxy3fhF7igQJ2DtnwAoDYmQo8c1un_FPl0",
  "access_expires_at": "2026-10-28T19:01:06.557324238Z",
  "refresh_token": "DDvk1IEpJgk34VR2l5I1AGe023QU3mesM0v530qrNTg",
  "refresh_expires_at": "2026-11-27T18:46:06.556793649Z",
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
  "command_id": "a30e8b0d-fabb-4abb-b600-c99374beae3a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:46:07Z",
    "sequence": 1793213167113
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3184e7c5-662a-4640-bf66-b070f593363f",
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
  "last_heartbeat_at": "2026-10-28T18:46:07.133437Z",
  "last_location_at": "2026-10-28T18:46:07.133437Z",
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
  "session_id": "7a442076-ebce-4871-85be-4309da69d035",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwNjcsImlhdCI6MTc5MzIxMzE2NywianRpIjoiMmZkZTIzOWUtZjdiZS00ZGE0LWI3MTItM2E0YjRmY2NlNzRlIiwic2lkIjoiN2E0NDIwNzYtZWJjZS00ODcxLTg1YmUtNDMwOWRhNjlkMDM1In0.k_GPHNrGWN3VsE8e_mOo1RHgr-Rk-X-UjjrL1eBftb4",
  "access_expires_at": "2026-10-28T19:01:07.771718605Z",
  "refresh_token": "Rtqo-ULwHe8Zp7i1LwgtEWYh8iOzHgcO5EjsIBuZHgo",
  "refresh_expires_at": "2026-10-29T06:46:07.77123641Z",
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
  "session_id": "4f19738a-43e2-434e-8ec6-59962719ff3c",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwNjgsImlhdCI6MTc5MzIxMzE2OCwianRpIjoiZGYxNjExODctMGYzMy00MTg2LTg0NDItN2MwMzE3ZDgyMWI0Iiwic2lkIjoiNGYxOTczOGEtNDNlMi00MzRlLThlYzYtNTk5NjI3MTlmZjNjIn0.arK3FC9f0AWQHlsb7Pjb4dEeVtQrFGJNLbA4LXqgBts",
  "access_expires_at": "2026-10-28T19:01:08.37247204Z",
  "refresh_token": "5wWforuE0XWASqWzaFNpMflYOrPXFivzNbkNVoeZuO4",
  "refresh_expires_at": "2026-10-29T06:46:08.371976324Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3c7c7ccf-0493-4b12-bcf2-f0019b936a03` → **200**

```json
{
  "id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
  "short_number": 12,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "27670785-6089-4603-9249-c48a713e49a5",
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
    "id": "62a7f596-1120-4755-8c31-2ed45c4d10d2",
    "order_id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4ff1bc07-b4b7-4db8-85c4-a1452d404e7f",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T18:46:03.920999Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3c7c7ccf-0493-4b12-bcf2-f0019b936a03/interrupt` → **200**

```json
{
  "command_id": "486cdfaf-86b5-4b3e-b17c-01530f52ba74",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
    "short_number": 12,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "27670785-6089-4603-9249-c48a713e49a5",
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
      "id": "62a7f596-1120-4755-8c31-2ed45c4d10d2",
      "order_id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "4ff1bc07-b4b7-4db8-85c4-a1452d404e7f",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T18:46:03.920999Z",
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
    "id": "7d1de168-dec6-4a95-8d4e-7b3874246fb9",
    "short_number": 13,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "27670785-6089-4603-9249-c48a713e49a5",
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
    "id": "635e88ba-b56e-49b4-b514-974314422936",
    "order_id": "7d1de168-dec6-4a95-8d4e-7b3874246fb9",
    "expires_at": "2026-10-28T18:46:23.966408Z",
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

`POST /api/driver/v1/offers/635e88ba-b56e-49b4-b514-974314422936/accept` → **200**

```json
{
  "command_id": "e44c15de-2831-4051-af35-67a29999be15"
}
```

```json
{
  "id": "6fd092dc-41d4-42d3-be6d-85a984bdacf2",
  "order_id": "7d1de168-dec6-4a95-8d4e-7b3874246fb9",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "13e2f452-67ac-4427-b30b-eefa4d145315",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "13e2f452-67ac-4427-b30b-eefa4d145315",
  "order_id": "7d1de168-dec6-4a95-8d4e-7b3874246fb9",
  "assignment_id": "6fd092dc-41d4-42d3-be6d-85a984bdacf2",
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
  "session_id": "3184e7c5-662a-4640-bf66-b070f593363f",
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
  "last_heartbeat_at": "2026-10-28T18:46:07.133437Z",
  "last_location_at": "2026-10-28T18:46:07.133437Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/3184e7c5-662a-4640-bf66-b070f593363f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:46:10Z",
    "sequence": 1793213170394
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3184e7c5-662a-4640-bf66-b070f593363f",
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
  "last_heartbeat_at": "2026-10-28T18:46:10.414024Z",
  "last_location_at": "2026-10-28T18:46:10.414024Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/13e2f452-67ac-4427-b30b-eefa4d145315/arrive` → **200**

```json
{
  "command_id": "21c58d74-e4bf-4e0a-b58d-9e1971b862a5",
  "expected_version": 0
}
```

```json
{
  "id": "13e2f452-67ac-4427-b30b-eefa4d145315",
  "order_id": "7d1de168-dec6-4a95-8d4e-7b3874246fb9",
  "assignment_id": "6fd092dc-41d4-42d3-be6d-85a984bdacf2",
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
  "arrived_at": "2026-10-28T18:46:10.690873Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/13e2f452-67ac-4427-b30b-eefa4d145315/start` → **200**

```json
{
  "command_id": "17158116-3291-4312-b230-bc18494dab1c",
  "expected_version": 1
}
```

```json
{
  "id": "13e2f452-67ac-4427-b30b-eefa4d145315",
  "order_id": "7d1de168-dec6-4a95-8d4e-7b3874246fb9",
  "assignment_id": "6fd092dc-41d4-42d3-be6d-85a984bdacf2",
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
  "arrived_at": "2026-10-28T18:46:10.690873Z",
  "started_at": "2026-10-28T18:46:10.980436Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/13e2f452-67ac-4427-b30b-eefa4d145315/complete` → **200**

```json
{
  "command_id": "ad220e28-d3d4-45a9-94ba-9241a242b511",
  "expected_version": 2,
  "reported_at": "2026-10-28T18:46:11Z"
}
```

```json
{
  "id": "13e2f452-67ac-4427-b30b-eefa4d145315",
  "order_id": "7d1de168-dec6-4a95-8d4e-7b3874246fb9",
  "assignment_id": "6fd092dc-41d4-42d3-be6d-85a984bdacf2",
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
  "arrived_at": "2026-10-28T18:46:10.690873Z",
  "started_at": "2026-10-28T18:46:10.980436Z",
  "completed_at": "2026-10-28T18:46:11.285018Z",
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
    "id": "7d1de168-dec6-4a95-8d4e-7b3874246fb9",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-28T18:46:08.955386Z",
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
    "id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
    "short_number": 12,
    "status": "CANCELLED",
    "created_at": "2026-10-28T18:46:03.920999Z",
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

`GET /api/operator/v1/orders/3c7c7ccf-0493-4b12-bcf2-f0019b936a03/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T18:46:03.921461Z",
      "actor": {
        "type": "CLIENT",
        "id": "27670785-6089-4603-9249-c48a713e49a5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
        "quote_id": "cae41346-6c04-4001-bb4a-389aa373b22c",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "10f9345f-ee03-4f47-9e87-4fe218e14a0e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T18:46:03.923318Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
        "attempt_id": "3138e0f6-4e76-4216-ad0d-a6af1bbcd036",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "10f9345f-ee03-4f47-9e87-4fe218e14a0e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T18:46:03.926252Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b2a3e444-a71d-4ce6-a702-0394e674c86c",
        "order_id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "10f9345f-ee03-4f47-9e87-4fe218e14a0e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T18:46:04.493848Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b2a3e444-a71d-4ce6-a702-0394e674c86c",
        "order_id": "3c7c7ccf-0493-4b12-bcf2-f0019b936a03",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "62a7f596-1120-4755-8c31-2ed45c4d10d2"
      },
      "correlation_id": "2713bb81-9918-4376-8641-835fc254bbd3"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/7d1de168-dec6-4a95-8d4e-7b3874246fb9/tip` → **200**

```json
{
  "order_id": "7d1de168-dec6-4a95-8d4e-7b3874246fb9",
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
  "available_until": "2026-10-29T18:46:11.285018Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/7d1de168-dec6-4a95-8d4e-7b3874246fb9/tip` → **409**

```json
{
  "command_id": "92502484-4f82-4df5-873b-dbfc1494613a",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/7d1de168-dec6-4a95-8d4e-7b3874246fb9/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "55100aea-34d2-482c-b29a-cd0bbdc9e93e"
}
```

Done: interrupted 3c7c7ccf-0493-4b12-bcf2-f0019b936a03, follow-up 7d1de168-dec6-4a95-8d4e-7b3874246fb9.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a",
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
  "last_heartbeat_at": "2026-10-28T18:46:05.960671Z",
  "last_location_at": "2026-10-28T18:46:05.960671Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0b82d70a-53b3-4ce4-a2ee-34a6a1650d9a/close` → **200**

```json
{
  "command_id": "328a7e10-2ffe-4158-8d62-724104cab362",
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
  "session_id": "3184e7c5-662a-4640-bf66-b070f593363f",
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
  "last_heartbeat_at": "2026-10-28T18:46:10.414024Z",
  "last_location_at": "2026-10-28T18:46:10.414024Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3184e7c5-662a-4640-bf66-b070f593363f/close` → **200**

```json
{
  "command_id": "3b81deb6-4a4d-4234-ba4c-9c4df9bcb2a1",
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
  "session_id": "8e6ff0b7-4017-42f2-90c9-2e9f11a4c834",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwNzcsImlhdCI6MTc5MzIxMzE3NywianRpIjoiMDNhYTQ1NWUtYjY4My00NzU5LWIxNzQtNGIxZjgzNDQ3NWMzIiwic2lkIjoiOGU2ZmYwYjctNDAxNy00MmYyLTkwYzktMmU5ZjExYTRjODM0In0.i10EkMMFrlMEiDecLRMjeu2ST48XT5uUCdkaiP2xUio",
  "access_expires_at": "2026-10-28T19:01:17.453074941Z",
  "refresh_token": "rSNz3jLL13-ZfKHwNvDyRm1xvYlHeRaIKmZNwfG-j28",
  "refresh_expires_at": "2026-10-29T06:46:17.45243655Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5498b07a-383c-4ffe-a70a-997a92550384",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T18:46:17Z"
}
```

```json
{
  "id": "e329e51e-1d31-4795-9eac-c9522cd58e37",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T18:46:17Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/e329e51e-1d31-4795-9eac-c9522cd58e37/publish` → **200**

```json
{
  "command_id": "69c8fcdd-f7ef-45b3-a0d4-e0b808109abd",
  "expected_version": 0
}
```

```json
{
  "id": "e329e51e-1d31-4795-9eac-c9522cd58e37",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T18:46:18.046157Z",
  "published_at": "2026-10-28T18:46:18.046157Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "e329e51e-1d31-4795-9eac-c9522cd58e37",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T18:46:18.046157Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638912653",
  "device_ref": "sandbox-10312"
}
```

```json
{
  "challenge_id": "fa0c5e38-2ec4-46dc-9134-e3d99aa80f4d",
  "expires_at": "2026-10-28T18:51:18.597198344Z",
  "resend_available_at": "2026-10-28T18:46:19.597198344Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638912653` → **200**

```json
{
  "phone": "+380638912653",
  "audience": "CLIENT",
  "code": "420662",
  "sent_at": "2026-10-28T18:46:18.600295175Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa0c5e38-2ec4-46dc-9134-e3d99aa80f4d",
  "code": "420662",
  "device_ref": "sandbox-10312"
}
```

```json
{
  "session_id": "d06a5e3a-2f7a-4dda-adb9-3b7658c8ac82",
  "subject": {
    "type": "CLIENT",
    "id": "743196de-dd80-4a69-bd76-c025c216c68d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NDMxOTZkZS1kZDgwLTRhNjktYmQ3Ni1jMDI1YzIxNmM2OGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MDc4LCJpYXQiOjE3OTMyMTMxNzgsImp0aSI6IjI3MzMwMTUyLTUzMmYtNGI3YS05MDk4LTY3YzRiYWU2NWY0MSIsInNpZCI6ImQwNmE1ZTNhLTJmN2EtNGRkYS1hZGI5LTNiNzY1OGM4YWM4MiJ9.nMGDWuTmOTmvIpKtSQw5AImyebFWsrOg3MMP3fWLIcM",
  "access_expires_at": "2026-10-28T19:01:18.901325325Z",
  "refresh_token": "5nsFoGXYqgMPpU5PzoOu-DDOZWfHAEah5Eh5dq5cVXU",
  "refresh_expires_at": "2026-11-27T18:46:18.900773415Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "e329e51e-1d31-4795-9eac-c9522cd58e37",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T18:46:18.046157Z",
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
  "command_id": "fbb50e38-d9af-408d-808f-24bf579a0ed4",
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
  "id": "d76d62d5-4faf-4408-96ef-8bf11361ae24",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:51:19.447281Z",
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
  "command_id": "f35b65d8-a36b-4adf-a084-3b0de3a7c759",
  "quote_id": "d76d62d5-4faf-4408-96ef-8bf11361ae24",
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
  "correlation_id": "ca45282a-8cf9-480a-a5b7-dae9e2eb9dce"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "d1f878bb-e7b5-4835-9fb6-e9feffe42183",
  "version_id": "e329e51e-1d31-4795-9eac-c9522cd58e37",
  "language": "uk"
}
```

```json
{
  "version_id": "e329e51e-1d31-4795-9eac-c9522cd58e37",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T18:46:20.039588Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7f5e144f-f44f-4e4e-a410-e2cae692ab6b",
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
  "id": "788c0e7f-1f1e-4b4b-85a3-c7ab5aedefda",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:51:20.336280Z",
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
  "command_id": "01a079b3-4d5e-4603-8f3e-58f635c1fe4a",
  "quote_id": "788c0e7f-1f1e-4b4b-85a3-c7ab5aedefda",
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
  "id": "7c699cf0-563f-40bc-b4f8-31c68161315b",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "743196de-dd80-4a69-bd76-c025c216c68d",
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
  "created_at": "2026-10-28T18:46:20.645517Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7c699cf0-563f-40bc-b4f8-31c68161315b` → **200**

```json
{
  "id": "7c699cf0-563f-40bc-b4f8-31c68161315b",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "743196de-dd80-4a69-bd76-c025c216c68d",
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
  "created_at": "2026-10-28T18:46:20.645517Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7c699cf0-563f-40bc-b4f8-31c68161315b/cancel` → **200**

```json
{
  "command_id": "112299ff-ddae-468a-b13f-983318c6f556",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7c699cf0-563f-40bc-b4f8-31c68161315b",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "743196de-dd80-4a69-bd76-c025c216c68d",
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
  "created_at": "2026-10-28T18:46:20.645517Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/e329e51e-1d31-4795-9eac-c9522cd58e37` → **409**

```json
{
  "command_id": "94911270-e9a7-4901-bc29-097fbec00399",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T18:46:21Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/e329e51e-1d31-4795-9eac-c9522cd58e37",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d16abbbc-ffe4-4d39-bf8a-0faffee8d21b"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "ddd0b6e9-3ef2-4742-83fc-95592380a10f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T18:46:21Z"
}
```

```json
{
  "id": "583dab2f-3228-4284-b92b-a1011d0a99b7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T18:46:21Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/583dab2f-3228-4284-b92b-a1011d0a99b7/publish` → **200**

```json
{
  "command_id": "3eb1e35c-45a8-47ab-9372-04abc57d117a",
  "expected_version": 0
}
```

```json
{
  "id": "583dab2f-3228-4284-b92b-a1011d0a99b7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T18:46:22.160981Z",
  "published_at": "2026-10-28T18:46:22.160981Z",
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
  "device_ref": "sandbox-3911"
}
```

```json
{
  "challenge_id": "7012c7ae-f186-46ce-926f-41a616bbf29d",
  "expires_at": "2026-10-28T18:51:22.459048036Z",
  "resend_available_at": "2026-10-28T18:46:23.459048036Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "806880",
  "sent_at": "2026-10-28T18:46:22.461395409Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7012c7ae-f186-46ce-926f-41a616bbf29d",
  "code": "806880",
  "device_ref": "sandbox-3911"
}
```

```json
{
  "session_id": "5511e2d4-542d-4a08-9213-c117deb82fe1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDA4MiwiaWF0IjoxNzkzMjEzMTgyLCJqdGkiOiI2YTY0ZTgxZC1lZGRhLTRlMjEtYWY3NC1iMThjNDhlYzFhNDciLCJzaWQiOiI1NTExZTJkNC01NDJkLTRhMDgtOTIxMy1jMTE3ZGViODJmZTEifQ.n5dL00F0t8XBeKfg0KbB94jkxEGG1oUND9eEBoQywbc",
  "access_expires_at": "2026-10-28T19:01:22.762709951Z",
  "refresh_token": "I-dDP8hI-s9kSxhZLDbYDwuAKlm6lv6RTdpSoRPhaiA",
  "refresh_expires_at": "2026-11-27T18:46:22.761945711Z",
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
  "command_id": "8f23743b-b7da-460c-9578-bcbcdd5dc921",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:46:23Z",
    "sequence": 1793213183317
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e28334db-52bf-4630-b309-3053ade7d900",
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
  "last_heartbeat_at": "2026-10-28T18:46:23.337231Z",
  "last_location_at": "2026-10-28T18:46:23.337231Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678460558",
  "device_ref": "sandbox-15077"
}
```

```json
{
  "challenge_id": "414d2c9a-4ddc-4d75-bf3b-b1e528dbb521",
  "expires_at": "2026-10-28T18:51:23.61303427Z",
  "resend_available_at": "2026-10-28T18:46:24.61303427Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678460558` → **200**

```json
{
  "phone": "+380678460558",
  "audience": "CLIENT",
  "code": "051346",
  "sent_at": "2026-10-28T18:46:23.615639816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "414d2c9a-4ddc-4d75-bf3b-b1e528dbb521",
  "code": "051346",
  "device_ref": "sandbox-15077"
}
```

```json
{
  "session_id": "353845c3-59bd-44b4-bf92-499be5071efb",
  "subject": {
    "type": "CLIENT",
    "id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYzU3ODc3NS1iZGE4LTRiZTMtOGZjYy1jOGNjMDhlYzFlNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MDgzLCJpYXQiOjE3OTMyMTMxODMsImp0aSI6ImQwYWQzMGUzLTJmYWEtNGQ1ZC1hYmJlLWY1MTVmMWZiMGMwYyIsInNpZCI6IjM1Mzg0NWMzLTU5YmQtNDRiNC1iZjkyLTQ5OWJlNTA3MWVmYiJ9.wnQdigj53q3JzjUsx6kJZrZaAVoStPess0Lr66LX-ZA",
  "access_expires_at": "2026-10-28T19:01:23.920817564Z",
  "refresh_token": "diGSbTzggoz9nbeQ8mpZRzoo_nJcAJEZeyYQDSy42Ts",
  "refresh_expires_at": "2026-11-27T18:46:23.920138501Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9353d5c9-55a5-4e06-9f20-d762ff7a23c6",
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
  "id": "eb1e8f31-fce1-474c-873c-772a860d0f39",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:51:24.206648Z",
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
  "command_id": "4da7ff81-8894-4881-ad17-7a55d44d6115",
  "quote_id": "eb1e8f31-fce1-474c-873c-772a860d0f39",
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
    "phone": "+380674683698"
  }
}
```

```json
{
  "id": "5f5c802f-00ce-4ae7-8321-15b65cb2b399",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:46:24.501431Z",
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
    "id": "00d1df7a-5417-42df-9352-eece9ac2657f",
    "order_id": "5f5c802f-00ce-4ae7-8321-15b65cb2b399",
    "expires_at": "2026-10-28T18:46:39.505088Z",
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

`POST /api/driver/v1/offers/00d1df7a-5417-42df-9352-eece9ac2657f/accept` → **200**

```json
{
  "command_id": "2cdd53f7-c14e-466c-9158-fc51f4eb9aee"
}
```

```json
{
  "id": "14b2aa5d-e48f-4a1b-a6af-d4300fef9af7",
  "order_id": "5f5c802f-00ce-4ae7-8321-15b65cb2b399",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "77d6e0cf-2cf0-42ac-b36d-b4453e623ab4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "77d6e0cf-2cf0-42ac-b36d-b4453e623ab4",
  "order_id": "5f5c802f-00ce-4ae7-8321-15b65cb2b399",
  "assignment_id": "14b2aa5d-e48f-4a1b-a6af-d4300fef9af7",
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
    "phone": "+380674683698"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a876fac2-cc0f-499b-a756-dc7627aaf272",
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
  "id": "1c1bbaf8-ebf2-40ba-9452-f4189cbe6a4f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:51:25.649433Z",
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
  "command_id": "e1302cd6-44a7-413b-be69-e2637d6707b4",
  "quote_id": "1c1bbaf8-ebf2-40ba-9452-f4189cbe6a4f",
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
  "id": "6df78e2a-7172-402d-8b92-12f4d4299db7",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:46:25.939357Z",
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
  "command_id": "f8565fbe-cd78-4341-bfcd-a44cc882d10a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T21:46:26Z"
}
```

```json
{
  "id": "be1f8f22-1d67-4d67-af1c-37357ede2c94",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:51:26.253601Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T21:46:26Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d52f51ec-497b-4ed8-89f5-4aecf4ef88f6",
  "quote_id": "be1f8f22-1d67-4d67-af1c-37357ede2c94",
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
  "pickup_at": "2026-10-28T21:46:26Z"
}
```

```json
{
  "id": "02776f73-25b5-46fb-97a0-1a8783917529",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T18:46:26.543879Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T21:46:26Z",
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
  "command_id": "c2b15c09-8754-4741-b586-b469228812cf",
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
  "id": "ac2d3d2e-1e81-4272-9fa9-f5917b7e4876",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:51:26.852734Z",
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
  "command_id": "20dce6d2-7873-4dcf-9fa4-1e41ea6ddf7f",
  "quote_id": "ac2d3d2e-1e81-4272-9fa9-f5917b7e4876",
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
  "correlation_id": "f51ab616-d183-4320-b19a-43927b162d6f"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "02776f73-25b5-46fb-97a0-1a8783917529",
      "short_number": 17,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T18:46:26.543879Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T21:46:26Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "6df78e2a-7172-402d-8b92-12f4d4299db7",
      "short_number": 16,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T18:46:25.939357Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "5f5c802f-00ce-4ae7-8321-15b65cb2b399",
      "short_number": 15,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "6df78e2a-7172-402d-8b92-12f4d4299db7",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:46:25.939357Z",
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

`GET /api/rider/v1/orders/5f5c802f-00ce-4ae7-8321-15b65cb2b399` → **200**

```json
{
  "id": "5f5c802f-00ce-4ae7-8321-15b65cb2b399",
  "short_number": 15,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "14b2aa5d-e48f-4a1b-a6af-d4300fef9af7",
    "order_id": "5f5c802f-00ce-4ae7-8321-15b65cb2b399",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "77d6e0cf-2cf0-42ac-b36d-b4453e623ab4",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T18:46:24.501431Z",
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
    "location_at": "2026-10-28T18:46:23.337231Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/5f5c802f-00ce-4ae7-8321-15b65cb2b399/cancel` → **200**

```json
{
  "command_id": "a320b4dd-d701-4e64-9dcb-9efcd21f1a04",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5f5c802f-00ce-4ae7-8321-15b65cb2b399",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "14b2aa5d-e48f-4a1b-a6af-d4300fef9af7",
    "order_id": "5f5c802f-00ce-4ae7-8321-15b65cb2b399",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "77d6e0cf-2cf0-42ac-b36d-b4453e623ab4",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T18:46:24.501431Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6df78e2a-7172-402d-8b92-12f4d4299db7` → **200**

```json
{
  "id": "6df78e2a-7172-402d-8b92-12f4d4299db7",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:46:25.939357Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6df78e2a-7172-402d-8b92-12f4d4299db7/cancel` → **200**

```json
{
  "command_id": "27868a44-9b4b-4d1f-bde2-4affde73ff31",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6df78e2a-7172-402d-8b92-12f4d4299db7",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:46:25.939357Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/02776f73-25b5-46fb-97a0-1a8783917529` → **200**

```json
{
  "id": "02776f73-25b5-46fb-97a0-1a8783917529",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T18:46:26.543879Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T21:46:26Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/02776f73-25b5-46fb-97a0-1a8783917529/cancel` → **200**

```json
{
  "command_id": "66e70025-f5b4-44ba-a3b7-d5a43e51a7ba",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "02776f73-25b5-46fb-97a0-1a8783917529",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "cc578775-bda8-4be3-8fcc-c8cc08ec1e78",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T18:46:26.543879Z",
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
  "pickup_at": "2026-10-28T21:46:26Z",
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
  "session_id": "e28334db-52bf-4630-b309-3053ade7d900",
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
  "last_heartbeat_at": "2026-10-28T18:46:23.337231Z",
  "last_location_at": "2026-10-28T18:46:23.337231Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e28334db-52bf-4630-b309-3053ade7d900/close` → **200**

```json
{
  "command_id": "9f300783-d4b2-4f33-81aa-a651f3ebc9bf",
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

Done: orders 5f5c802f-00ce-4ae7-8321-15b65cb2b399, 6df78e2a-7172-402d-8b92-12f4d4299db7, 02776f73-25b5-46fb-97a0-1a8783917529.

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
  "session_id": "0bf6a73e-521c-42cf-965c-19706c13d51d",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwOTAsImlhdCI6MTc5MzIxMzE5MCwianRpIjoiMzE2NGFlYmMtNTc1MC00NWE3LWIyNzQtMGRkZjAzNTc1NjhiIiwic2lkIjoiMGJmNmE3M2UtNTIxYy00MmNmLTk2NWMtMTk3MDZjMTNkNTFkIn0.IY7j6kM27sxwir24M0cLTJHVzMwRoANkyPr-BHmc0bE",
  "access_expires_at": "2026-10-28T19:01:30.643422142Z",
  "refresh_token": "5V3cG1NgNHYAm8-iISCwcodiIhdDizz5hOZL2KfQEV4",
  "refresh_expires_at": "2026-10-29T06:46:30.642849379Z",
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
  "session_id": "1a0b24ea-6f61-42e5-977a-c24d90f6fb23",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQwOTEsImlhdCI6MTc5MzIxMzE5MSwianRpIjoiZjhjNmZhYjMtMGUzYi00MjMxLTg2NWYtYzYxN2E2NmI2YTc1Iiwic2lkIjoiMWEwYjI0ZWEtNmY2MS00MmU1LTk3N2EtYzI0ZDkwZjZmYjIzIn0.4Hbd0jRqSaBGf_02aRACJpa8lhTRH1j47peCByTt6u4",
  "access_expires_at": "2026-10-28T19:01:31.25095749Z",
  "refresh_token": "ug1O-27LJup0TliipWjXeNRa8CJttgVB77xoHxLzlfI",
  "refresh_expires_at": "2026-10-29T06:46:31.250400191Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21481"
}
```

```json
{
  "challenge_id": "8a68f64e-d41f-4696-b1b2-d38338ebbdd5",
  "expires_at": "2026-10-28T18:51:31.525341087Z",
  "resend_available_at": "2026-10-28T18:46:32.525341087Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "399488",
  "sent_at": "2026-10-28T18:46:31.527636597Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a68f64e-d41f-4696-b1b2-d38338ebbdd5",
  "code": "399488",
  "device_ref": "sandbox-21481"
}
```

```json
{
  "session_id": "6a1ca0c2-3d9b-4aeb-ae60-b3d57d5302db",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDA5MSwiaWF0IjoxNzkzMjEzMTkxLCJqdGkiOiIwZDg2NWQ4Yi0zYWVlLTRjZGItYmY1NC0zNWNhMWIyZWM1YWUiLCJzaWQiOiI2YTFjYTBjMi0zZDliLTRhZWItYWU2MC1iM2Q1N2Q1MzAyZGIifQ.XyNYRGDpuDxDLzSEcdx6bYAlkpRD70C3aHZtghhVx80",
  "access_expires_at": "2026-10-28T19:01:31.825692649Z",
  "refresh_token": "sXtmWRBaqZ3ZDITDGJpO0JdedmWWW2MiaQTw4eWZEtM",
  "refresh_expires_at": "2026-11-27T18:46:31.825216473Z",
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
  "command_id": "3c40ae7d-626d-4840-88d7-a2a0d2c766fe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:46:32Z",
    "sequence": 1793213192360
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f9c67a14-591f-4686-9e29-632b8f5bc031",
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
  "last_heartbeat_at": "2026-10-28T18:46:32.37959Z",
  "last_location_at": "2026-10-28T18:46:32.37959Z",
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
  "command_id": "ac731dd6-a4bf-4b1d-ae5e-ccb1d60881c4",
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
  "effective_at": "2026-10-28T18:46:32.962219Z",
  "changed_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T18:44:14.937253Z",
  "last_entries": [
    {
      "order_id": "12d57b35-e3d4-4b06-8a1b-c3b7c195ea79",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T18:44:14.937253Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2859548b-738c-41b5-af07-6d8230c98f0c",
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
  "id": "4e05346f-fd8e-44a6-8dbd-ceeadc1664f7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:51:33.529024Z",
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
  "command_id": "0b4dce80-0f12-40cb-9ff3-283404b37dca",
  "quote_id": "4e05346f-fd8e-44a6-8dbd-ceeadc1664f7",
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
    "phone": "+3806711111603"
  }
}
```

```json
{
  "id": "ef72a2fe-b0c8-477f-ba5a-ae12875fa4ac",
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
  "created_at": "2026-10-28T18:46:33.823041Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111603"
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
    "id": "4a5dc068-9099-44bf-92a5-11b2fe10a799",
    "order_id": "ef72a2fe-b0c8-477f-ba5a-ae12875fa4ac",
    "expires_at": "2026-10-28T18:46:48.826612Z",
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

`POST /api/driver/v1/offers/4a5dc068-9099-44bf-92a5-11b2fe10a799/accept` → **200**

```json
{
  "command_id": "1f0b96f9-6f93-458b-aa85-894597e26778"
}
```

```json
{
  "id": "b3d9a3bb-b0b5-4d6d-a02c-3ee798d68825",
  "order_id": "ef72a2fe-b0c8-477f-ba5a-ae12875fa4ac",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "34dd21fa-940e-47a8-b327-f30178cd64a3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "34dd21fa-940e-47a8-b327-f30178cd64a3",
  "order_id": "ef72a2fe-b0c8-477f-ba5a-ae12875fa4ac",
  "assignment_id": "b3d9a3bb-b0b5-4d6d-a02c-3ee798d68825",
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
    "phone": "+3806711111603"
  }
}
```

`POST /api/driver/v1/work-sessions/f9c67a14-591f-4686-9e29-632b8f5bc031/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:46:34Z",
    "sequence": 1793213194945
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f9c67a14-591f-4686-9e29-632b8f5bc031",
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
  "last_heartbeat_at": "2026-10-28T18:46:34.965447Z",
  "last_location_at": "2026-10-28T18:46:34.965447Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/34dd21fa-940e-47a8-b327-f30178cd64a3/arrive` → **200**

```json
{
  "command_id": "fc0b9034-ac51-4614-9900-7b595fb8e655",
  "expected_version": 0
}
```

```json
{
  "id": "34dd21fa-940e-47a8-b327-f30178cd64a3",
  "order_id": "ef72a2fe-b0c8-477f-ba5a-ae12875fa4ac",
  "assignment_id": "b3d9a3bb-b0b5-4d6d-a02c-3ee798d68825",
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
  "arrived_at": "2026-10-28T18:46:35.259818Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711111603"
  }
}
```

`POST /api/driver/v1/trips/34dd21fa-940e-47a8-b327-f30178cd64a3/start` → **200**

```json
{
  "command_id": "71689fcc-6129-4083-a2ec-f827d3ded542",
  "expected_version": 1
}
```

```json
{
  "id": "34dd21fa-940e-47a8-b327-f30178cd64a3",
  "order_id": "ef72a2fe-b0c8-477f-ba5a-ae12875fa4ac",
  "assignment_id": "b3d9a3bb-b0b5-4d6d-a02c-3ee798d68825",
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
  "arrived_at": "2026-10-28T18:46:35.259818Z",
  "started_at": "2026-10-28T18:46:35.562089Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711111603"
  }
}
```

`POST /api/driver/v1/trips/34dd21fa-940e-47a8-b327-f30178cd64a3/complete` → **200**

```json
{
  "command_id": "f96b9cf9-54f3-47c8-8b82-c385c8154ab0",
  "expected_version": 2,
  "reported_at": "2026-10-28T18:46:35Z",
  "cash_received": true
}
```

```json
{
  "id": "34dd21fa-940e-47a8-b327-f30178cd64a3",
  "order_id": "ef72a2fe-b0c8-477f-ba5a-ae12875fa4ac",
  "assignment_id": "b3d9a3bb-b0b5-4d6d-a02c-3ee798d68825",
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
  "arrived_at": "2026-10-28T18:46:35.259818Z",
  "started_at": "2026-10-28T18:46:35.562089Z",
  "completed_at": "2026-10-28T18:46:35.858751Z",
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
  "command_id": "4415761f-19de-4bce-ae39-13bd1160a2bf",
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
  "id": "716e5d8f-7565-4258-8978-158845944a55",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:51:36.155219Z",
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
  "command_id": "0bcad6c0-3a07-4d81-8239-8600625cd976",
  "quote_id": "716e5d8f-7565-4258-8978-158845944a55",
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
    "phone": "+3806711123801"
  }
}
```

```json
{
  "id": "df235560-04c2-4fc8-9557-d009934ade8c",
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
  "created_at": "2026-10-28T18:46:36.449958Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123801"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/df235560-04c2-4fc8-9557-d009934ade8c` → **200**

```json
{
  "id": "df235560-04c2-4fc8-9557-d009934ade8c",
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
  "created_at": "2026-10-28T18:46:36.449958Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123801"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/df235560-04c2-4fc8-9557-d009934ade8c/cancel` → **200**

```json
{
  "command_id": "78a4f6e5-5702-4e18-88cc-210f9d009b77",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "df235560-04c2-4fc8-9557-d009934ade8c",
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
  "created_at": "2026-10-28T18:46:36.449958Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123801"
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
  "staff_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T18:44:14.937253Z",
  "last_entries": [
    {
      "order_id": "df235560-04c2-4fc8-9557-d009934ade8c",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T18:46:37.044438Z"
    },
    {
      "order_id": "ef72a2fe-b0c8-477f-ba5a-ae12875fa4ac",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T18:46:35.863529Z"
    },
    {
      "order_id": "12d57b35-e3d4-4b06-8a1b-c3b7c195ea79",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T18:44:14.937253Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f9c67a14-591f-4686-9e29-632b8f5bc031",
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
  "last_heartbeat_at": "2026-10-28T18:46:34.965447Z",
  "last_location_at": "2026-10-28T18:46:34.965447Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f9c67a14-591f-4686-9e29-632b8f5bc031/close` → **200**

```json
{
  "command_id": "8fa9f584-4efa-4d8c-80c4-f239ee25cd50",
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

Done: operator bonus for fulfilled ef72a2fe-b0c8-477f-ba5a-ae12875fa4ac and operator-fault cancellation df235560-04c2-4fc8-9557-d009934ade8c.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676500231",
  "device_ref": "sandbox-753"
}
```

```json
{
  "challenge_id": "30cbf4b0-d1f5-4fa6-be01-720d8f1894c2",
  "expires_at": "2026-10-28T18:51:40.207877964Z",
  "resend_available_at": "2026-10-28T18:46:41.207877964Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676500231` → **200**

```json
{
  "phone": "+380676500231",
  "audience": "CLIENT",
  "code": "799508",
  "sent_at": "2026-10-28T18:46:40.210142402Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679793366",
  "device_ref": "sandbox-4120",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "64f6c14d-6508-43d5-bc29-7e652a076a2e",
  "expires_at": "2026-10-28T18:51:40.51081551Z",
  "resend_available_at": "2026-10-28T18:46:41.51081551Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679793366` → **200**

```json
{
  "phone": "+380679793366",
  "audience": "CLIENT",
  "code": "280562",
  "sent_at": "2026-10-28T18:46:40.51343953Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678280000",
  "device_ref": "sandbox-29453"
}
```

```json
{
  "challenge_id": "e0e58bc1-f7a2-492d-ba18-0908d1f04507",
  "expires_at": "2026-10-28T18:51:40.816669424Z",
  "resend_available_at": "2026-10-28T18:46:41.816669424Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678280000` → **200**

```json
{
  "phone": "+380678280000",
  "audience": "CLIENT",
  "code": "978879",
  "sent_at": "2026-10-28T18:46:40.819580815Z",
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
  "session_id": "98e61426-fdee-4766-82fe-324ee4135652",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxMDEsImlhdCI6MTc5MzIxMzIwMSwianRpIjoiNzgzNzlhNTAtNGY3MC00ZWRjLWI2ZGMtMjU5M2Q4ZDllNDNhIiwic2lkIjoiOThlNjE0MjYtZmRlZS00NzY2LTgyZmUtMzI0ZWU0MTM1NjUyIn0.DHmn4XJYX4c5JX0Xy_9R68pybgeLCHWNCzIeVpF5njQ",
  "access_expires_at": "2026-10-28T19:01:41.443711551Z",
  "refresh_token": "9xWnuemo8mZOj4mCF0dhIceuvjXQOAacYnPsEB9ybyk",
  "refresh_expires_at": "2026-10-29T06:46:41.443173251Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678280000` → **200**

```json
{
  "deliveries": [
    {
      "id": "0a691adc-3342-4851-a8ac-2f9f7c6ed012",
      "challenge_id": "e0e58bc1-f7a2-492d-ba18-0908d1f04507",
      "phone": "+380678280000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-451ec955-ca2e-46e0-860d-4f387398ad22",
      "error": null,
      "attempted_at": "2026-10-28T18:46:40.819869Z"
    },
    {
      "id": "4a797cad-6165-468f-90cf-073268c0c5dd",
      "challenge_id": "e0e58bc1-f7a2-492d-ba18-0908d1f04507",
      "phone": "+380678280000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T18:46:40.818757Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678280000` → **200**

```json
{
  "phone": "+380678280000",
  "audience": "CLIENT",
  "code": "978879",
  "sent_at": "2026-10-28T18:46:40.819580815Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679793366` → **200**

```json
{
  "deliveries": [
    {
      "id": "9d6cdfb3-c199-4e15-a846-41da2bb1801e",
      "challenge_id": "64f6c14d-6508-43d5-bc29-7e652a076a2e",
      "phone": "+380679793366",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-68844b7d-9fef-4087-943a-ce68f8f40900",
      "error": null,
      "attempted_at": "2026-10-28T18:46:40.513731Z"
    }
  ]
}
```

Done: SMS to +380676500231, a call to +380679793366, SMS then a call to +380678280000.

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
  "session_id": "9c0fa75d-5a0e-4631-a1be-3ff71a618d2f",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxMDIsImlhdCI6MTc5MzIxMzIwMiwianRpIjoiZjc1MDE2ODYtOTE2ZC00ZTkzLTkwY2YtODhiZTliOWVhMTZmIiwic2lkIjoiOWMwZmE3NWQtNWEwZS00NjMxLWExYmUtM2ZmNzFhNjE4ZDJmIn0.m65snzJ5uqkvse96l2cc1SZO2a43rvLkwB88vVCTr1w",
  "access_expires_at": "2026-10-28T19:01:42.657040825Z",
  "refresh_token": "vIbmdMGeHmUa3BFvEF_RHSDidkkNrno4epfIB3tTp1c",
  "refresh_expires_at": "2026-10-29T06:46:42.656549836Z",
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
  "session_id": "7a38e250-bca3-48f6-ba98-4fe907224ed4",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxMDMsImlhdCI6MTc5MzIxMzIwMywianRpIjoiZDk1NDJlOWYtODE5Yi00NDg3LThlNzctNDU0MGE0MWMxNGFiIiwic2lkIjoiN2EzOGUyNTAtYmNhMy00OGY2LWJhOTgtNGZlOTA3MjI0ZWQ0In0.UXy7RrZbdg2jhu7_hfatqRvJLx41bDFh2Y79ZYc7Wj8",
  "access_expires_at": "2026-10-28T19:01:43.264284727Z",
  "refresh_token": "t7HvD4J-TsdkQMbkjaJAmofe-8yjdayLOvaElSa2b7M",
  "refresh_expires_at": "2026-10-29T06:46:43.263761429Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
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

`POST /api/admin/v1/staff-extensions/313514fb-76fb-4a6c-b718-bea886fa63bd` → **200**

```json
{
  "command_id": "75cbae23-e5e4-4cd7-b973-87a768d0f7a2",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "596b0e45-8a15-4894-9d05-197b1e5e1fe7",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T18:46:44.404877Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T18:46:44.404877Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1a7c8a4d-b1b6-46da-b39a-08509edd1d92",
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
  "id": "31d99a80-abb6-42eb-804a-f93bad2752f4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:51:44.958530Z",
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
  "command_id": "beea76a2-e040-4af4-bc6a-fb3cea31ce30",
  "quote_id": "31d99a80-abb6-42eb-804a-f93bad2752f4",
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
    "phone": "+380678892970"
  }
}
```

```json
{
  "id": "5df1e39a-7c53-474b-b1aa-3b9bc9649646",
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
  "created_at": "2026-10-28T18:46:45.240864Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678892970"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/5df1e39a-7c53-474b-b1aa-3b9bc9649646/calls` → **201**

```json
{
  "command_id": "7e285791-0003-40b3-a5c6-12cdbf8859f6",
  "to": "CALLER"
}
```

```json
{
  "id": "6400c5bc-eeab-480b-bcb4-7afd4785eb40",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "order_ids": [
    "5df1e39a-7c53-474b-b1aa-3b9bc9649646"
  ],
  "started_at": "2026-10-28T18:46:45.551374Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/5df1e39a-7c53-474b-b1aa-3b9bc9649646/calls` → **201**

```json
{
  "command_id": "7e285791-0003-40b3-a5c6-12cdbf8859f6",
  "to": "CALLER"
}
```

```json
{
  "id": "6400c5bc-eeab-480b-bcb4-7afd4785eb40",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "order_ids": [
    "5df1e39a-7c53-474b-b1aa-3b9bc9649646"
  ],
  "started_at": "2026-10-28T18:46:45.551374Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "6400c5bc-eeab-480b-bcb4-7afd4785eb40",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678892970",
    "at": "2026-10-28T18:46:45.553525376Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "6400c5bc-eeab-480b-bcb4-7afd4785eb40",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.18228",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "6400c5bc-eeab-480b-bcb4-7afd4785eb40"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "6400c5bc-eeab-480b-bcb4-7afd4785eb40",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=5df1e39a-7c53-474b-b1aa-3b9bc9649646` → **200**

```json
{
  "calls": [
    {
      "id": "6400c5bc-eeab-480b-bcb4-7afd4785eb40",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [
        "5df1e39a-7c53-474b-b1aa-3b9bc9649646"
      ],
      "started_at": "2026-10-28T18:46:45.551374Z",
      "answered_at": "2026-10-28T18:46:46.202276Z",
      "ended_at": "2026-10-28T18:46:46.225888Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5df1e39a-7c53-474b-b1aa-3b9bc9649646` → **200**

```json
{
  "calls": [
    {
      "id": "6400c5bc-eeab-480b-bcb4-7afd4785eb40",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [
        "5df1e39a-7c53-474b-b1aa-3b9bc9649646"
      ],
      "started_at": "2026-10-28T18:46:45.551374Z",
      "answered_at": "2026-10-28T18:46:46.202276Z",
      "ended_at": "2026-10-28T18:46:46.225888Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5df1e39a-7c53-474b-b1aa-3b9bc9649646` → **200**

```json
{
  "calls": [
    {
      "id": "6400c5bc-eeab-480b-bcb4-7afd4785eb40",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [
        "5df1e39a-7c53-474b-b1aa-3b9bc9649646"
      ],
      "started_at": "2026-10-28T18:46:45.551374Z",
      "answered_at": "2026-10-28T18:46:46.202276Z",
      "ended_at": "2026-10-28T18:46:46.225888Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5df1e39a-7c53-474b-b1aa-3b9bc9649646` → **200**

```json
{
  "calls": [
    {
      "id": "6400c5bc-eeab-480b-bcb4-7afd4785eb40",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [
        "5df1e39a-7c53-474b-b1aa-3b9bc9649646"
      ],
      "started_at": "2026-10-28T18:46:45.551374Z",
      "answered_at": "2026-10-28T18:46:46.202276Z",
      "ended_at": "2026-10-28T18:46:46.225888Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5df1e39a-7c53-474b-b1aa-3b9bc9649646` → **200**

```json
{
  "calls": [
    {
      "id": "6400c5bc-eeab-480b-bcb4-7afd4785eb40",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [
        "5df1e39a-7c53-474b-b1aa-3b9bc9649646"
      ],
      "started_at": "2026-10-28T18:46:45.551374Z",
      "answered_at": "2026-10-28T18:46:46.202276Z",
      "ended_at": "2026-10-28T18:46:46.225888Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5df1e39a-7c53-474b-b1aa-3b9bc9649646` → **200**

```json
{
  "calls": [
    {
      "id": "6400c5bc-eeab-480b-bcb4-7afd4785eb40",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "order_ids": [
        "5df1e39a-7c53-474b-b1aa-3b9bc9649646"
      ],
      "started_at": "2026-10-28T18:46:45.551374Z",
      "answered_at": "2026-10-28T18:46:46.202276Z",
      "ended_at": "2026-10-28T18:46:46.225888Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T18:46:56.197172Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/5df1e39a-7c53-474b-b1aa-3b9bc9649646` → **200**

```json
{
  "id": "5df1e39a-7c53-474b-b1aa-3b9bc9649646",
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
  "created_at": "2026-10-28T18:46:45.240864Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678892970"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5df1e39a-7c53-474b-b1aa-3b9bc9649646/cancel` → **200**

```json
{
  "command_id": "6662ee65-16e8-40b0-8b3b-7a485d0c835e",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5df1e39a-7c53-474b-b1aa-3b9bc9649646",
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
  "created_at": "2026-10-28T18:46:45.240864Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678892970"
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
  "command_id": "28f24e8a-d112-4483-ae5d-f3ff9098f5a7",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T18:46:58.579629Z",
  "extension": "101"
}
```

Done: outgoing call 6400c5bc-eeab-480b-bcb4-7afd4785eb40 from order 5df1e39a-7c53-474b-b1aa-3b9bc9649646, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636424643",
  "device_ref": "sandbox-19856"
}
```

```json
{
  "challenge_id": "911ab883-f416-4efa-98bb-cb86bb49bc91",
  "expires_at": "2026-10-28T18:51:58.879473944Z",
  "resend_available_at": "2026-10-28T18:46:59.879473944Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636424643` → **200**

```json
{
  "phone": "+380636424643",
  "audience": "CLIENT",
  "code": "556655",
  "sent_at": "2026-10-28T18:46:58.88186939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "911ab883-f416-4efa-98bb-cb86bb49bc91",
  "code": "556655",
  "device_ref": "sandbox-19856"
}
```

```json
{
  "session_id": "5e5b1d6b-5623-4941-b38c-1f5766121974",
  "subject": {
    "type": "CLIENT",
    "id": "27c89f37-65bc-4901-98d7-c4d2eb654043"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2M4OWYzNy02NWJjLTQ5MDEtOThkNy1jNGQyZWI2NTQwNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MTE5LCJpYXQiOjE3OTMyMTMyMTksImp0aSI6IjBkYjFhMWEyLWIxMWYtNDcwNi05Y2I4LTcxNGI1NjJhOThlMiIsInNpZCI6IjVlNWIxZDZiLTU2MjMtNDk0MS1iMzhjLTFmNTc2NjEyMTk3NCJ9.Irwz9ou2tF-d3cntmK74cPDg03PI_psXVmCaXIPwvwA",
  "access_expires_at": "2026-10-28T19:01:59.216974997Z",
  "refresh_token": "0tJ26dYXhC0O9PA2gP8adHb6Vho3MIhZ_vsS_5xsRG8",
  "refresh_expires_at": "2026-11-27T18:46:59.216442565Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "27c89f37-65bc-4901-98d7-c4d2eb654043",
  "session_id": "5e5b1d6b-5623-4941-b38c-1f5766121974",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636424643",
  "device_ref": "sandbox-27551"
}
```

```json
{
  "challenge_id": "f5091935-6247-47ff-b339-3255876a1905",
  "expires_at": "2026-10-28T18:52:01.773351631Z",
  "resend_available_at": "2026-10-28T18:47:02.773351631Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636424643` → **200**

```json
{
  "phone": "+380636424643",
  "audience": "CLIENT",
  "code": "375965",
  "sent_at": "2026-10-28T18:47:01.775367545Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5091935-6247-47ff-b339-3255876a1905",
  "code": "375965",
  "device_ref": "sandbox-27551"
}
```

```json
{
  "session_id": "b1d7f951-2f26-4697-b6d2-39e9aff8003f",
  "subject": {
    "type": "CLIENT",
    "id": "27c89f37-65bc-4901-98d7-c4d2eb654043"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2M4OWYzNy02NWJjLTQ5MDEtOThkNy1jNGQyZWI2NTQwNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MTIyLCJpYXQiOjE3OTMyMTMyMjIsImp0aSI6IjMzMjQzNTA1LTUxYTMtNGY5OS05ODQwLThiZjI4NDIwZGYzMSIsInNpZCI6ImIxZDdmOTUxLTJmMjYtNDY5Ny1iNmQyLTM5ZTlhZmY4MDAzZiJ9.-OKbpacxVIVHXWNN3cRzDTAM-BoTS5HvyrxvpXmto9g",
  "access_expires_at": "2026-10-28T19:02:02.081033982Z",
  "refresh_token": "dXT87mqbTnboByIOTEnjjbEiz77cASef68nb_w3Q-vM",
  "refresh_expires_at": "2026-11-27T18:47:02.080518897Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "99941731-c54b-4e08-a00e-1c436b83fbbf",
  "expires_at": "2026-10-28T18:52:04.356370504Z",
  "resend_available_at": "2026-10-28T18:47:05.356370504Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636424643` → **200**

```json
{
  "phone": "+380636424643",
  "audience": "CLIENT",
  "code": "103804",
  "sent_at": "2026-10-28T18:47:04.358516783Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639711019"
}
```

```json
{
  "challenge_id": "16be3852-bcde-4a43-906a-557e6c6b7e25",
  "expires_at": "2026-10-28T18:52:04.646916162Z",
  "resend_available_at": "2026-10-28T18:47:05.646916162Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639711019` → **200**

```json
{
  "phone": "+380639711019",
  "audience": "CLIENT",
  "code": "757785",
  "sent_at": "2026-10-28T18:47:04.648661545Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "f69f7a6f-7f6c-4a87-a2c6-a65655592531",
  "current_challenge_id": "99941731-c54b-4e08-a00e-1c436b83fbbf",
  "current_code": "000000",
  "new_challenge_id": "16be3852-bcde-4a43-906a-557e6c6b7e25",
  "new_code": "757785"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "2b1bc70c-b693-4107-8673-5e103cad3779"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "b209777f-e56a-4d57-a47b-5e06d0d58097",
  "current_challenge_id": "99941731-c54b-4e08-a00e-1c436b83fbbf",
  "current_code": "103804",
  "new_challenge_id": "16be3852-bcde-4a43-906a-557e6c6b7e25",
  "new_code": "757785"
}
```

```json
{
  "subject_id": "27c89f37-65bc-4901-98d7-c4d2eb654043",
  "phone": "+380639711019",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "27c89f37-65bc-4901-98d7-c4d2eb654043",
  "session_id": "5e5b1d6b-5623-4941-b38c-1f5766121974",
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
  "correlation_id": "ef5e2a79-e754-4820-a1c1-f2d0f1942300"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639711019",
  "device_ref": "sandbox-9879"
}
```

```json
{
  "challenge_id": "72d06a9e-f2f8-4c21-94ce-64f4227f1b56",
  "expires_at": "2026-10-28T18:52:08.063962546Z",
  "resend_available_at": "2026-10-28T18:47:09.063962546Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639711019` → **200**

```json
{
  "phone": "+380639711019",
  "audience": "CLIENT",
  "code": "285688",
  "sent_at": "2026-10-28T18:47:08.065997829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72d06a9e-f2f8-4c21-94ce-64f4227f1b56",
  "code": "285688",
  "device_ref": "sandbox-9879"
}
```

```json
{
  "session_id": "26826db2-83db-40c8-90eb-8a558159505f",
  "subject": {
    "type": "CLIENT",
    "id": "27c89f37-65bc-4901-98d7-c4d2eb654043"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2M4OWYzNy02NWJjLTQ5MDEtOThkNy1jNGQyZWI2NTQwNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MTI4LCJpYXQiOjE3OTMyMTMyMjgsImp0aSI6IjAwNDVjNzFiLWRkMzQtNGU1Yy1iZjBiLTNiYWYyOTE5ZjIyMyIsInNpZCI6IjI2ODI2ZGIyLTgzZGItNDBjOC05MGViLThhNTU4MTU5NTA1ZiJ9.zYDwfaktE_9HWMa_Kq5EnNvVVyr_YHxV4sYj9NloKEw",
  "access_expires_at": "2026-10-28T19:02:08.372359476Z",
  "refresh_token": "q3adXGOSNsDTybclX5EPLyTB4zTdgFa85xNj6yBZ0Pk",
  "refresh_expires_at": "2026-11-27T18:47:08.371866795Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "27c89f37-65bc-4901-98d7-c4d2eb654043",
  "session_id": "26826db2-83db-40c8-90eb-8a558159505f",
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
  "session_id": "cf9ef0e9-5283-40d2-94f2-6f298eef2ce6",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxMjksImlhdCI6MTc5MzIxMzIyOSwianRpIjoiYTFiNTZhYjAtNzdkYi00NzA0LWI1YjMtYzJkN2U3OTkzOGM4Iiwic2lkIjoiY2Y5ZWYwZTktNTI4My00MGQyLTk0ZjItNmYyOThlZWYyY2U2In0.v3kj7-r6jXQ3RmR25nO4KHiYwG8_JcknTDieo01bKOQ",
  "access_expires_at": "2026-10-28T19:02:09.248561172Z",
  "refresh_token": "yOOQTJKsRde2_ncdeK7xc8O0R_KfnGgPT-PnAll5QWA",
  "refresh_expires_at": "2026-10-29T06:47:09.248009131Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/27c89f37-65bc-4901-98d7-c4d2eb654043` → **200**

```json
{
  "client": {
    "id": "27c89f37-65bc-4901-98d7-c4d2eb654043",
    "phone": "+380639711019",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T18:46:59.214735Z",
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

`POST /api/admin/v1/clients/27c89f37-65bc-4901-98d7-c4d2eb654043/phone/new-code` → **201**

```json
{
  "phone": "+380637125064"
}
```

```json
{
  "challenge_id": "c7939143-b281-4944-9f56-f5c27b1f031e",
  "expires_at": "2026-10-28T18:52:09.831099354Z",
  "resend_available_at": "2026-10-28T18:47:10.831099354Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637125064` → **200**

```json
{
  "phone": "+380637125064",
  "audience": "CLIENT",
  "code": "975466",
  "sent_at": "2026-10-28T18:47:09.83303658Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/27c89f37-65bc-4901-98d7-c4d2eb654043/phone` → **422**

```json
{
  "command_id": "9aa9290c-ce62-4c45-8a63-d8a934abca1f",
  "expected_version": 3,
  "new_challenge_id": "c7939143-b281-4944-9f56-f5c27b1f031e",
  "new_code": "975467",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/27c89f37-65bc-4901-98d7-c4d2eb654043/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "418749d6-ff73-429f-a29e-edb3b3258d5c"
}
```

`POST /api/admin/v1/clients/27c89f37-65bc-4901-98d7-c4d2eb654043/phone` → **400**

```json
{
  "command_id": "9edbf20f-7332-48c4-ae4b-b2386f33da99",
  "expected_version": 3,
  "new_challenge_id": "c7939143-b281-4944-9f56-f5c27b1f031e",
  "new_code": "975466",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/27c89f37-65bc-4901-98d7-c4d2eb654043/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f8a3f95b-3076-441e-afcd-8a3b954e749d",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/27c89f37-65bc-4901-98d7-c4d2eb654043/phone` → **200**

```json
{
  "command_id": "31fe023f-9031-4b09-9896-9ac281a48f37",
  "expected_version": 3,
  "new_challenge_id": "c7939143-b281-4944-9f56-f5c27b1f031e",
  "new_code": "975466",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "27c89f37-65bc-4901-98d7-c4d2eb654043",
  "phone": "+380637125064",
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
  "correlation_id": "efe199d7-e96c-4876-b06d-7d701b4dc489"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637125064",
  "device_ref": "sandbox-26360"
}
```

```json
{
  "challenge_id": "7c5edab3-aed2-4d56-9662-0b96e28602f3",
  "expires_at": "2026-10-28T18:52:11.253001621Z",
  "resend_available_at": "2026-10-28T18:47:12.253001621Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637125064` → **200**

```json
{
  "phone": "+380637125064",
  "audience": "CLIENT",
  "code": "305793",
  "sent_at": "2026-10-28T18:47:11.255104405Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c5edab3-aed2-4d56-9662-0b96e28602f3",
  "code": "305793",
  "device_ref": "sandbox-26360"
}
```

```json
{
  "session_id": "1fe828a2-31aa-4464-bf5d-9eb6519ed930",
  "subject": {
    "type": "CLIENT",
    "id": "27c89f37-65bc-4901-98d7-c4d2eb654043"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2M4OWYzNy02NWJjLTQ5MDEtOThkNy1jNGQyZWI2NTQwNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MTMxLCJpYXQiOjE3OTMyMTMyMzEsImp0aSI6ImE1NDdkOWZkLTAzOTUtNGQzMC1iYWFjLTRhOGIxOWE0NmYxNCIsInNpZCI6IjFmZTgyOGEyLTMxYWEtNDQ2NC1iZjVkLTllYjY1MTllZDkzMCJ9.wqvepVRAScay8-XvZ6ccF7tZ3B18aBquyvnVABXqV5E",
  "access_expires_at": "2026-10-28T19:02:11.562407087Z",
  "refresh_token": "SOTFHpu8OIVmMUz7CHj6yIvJgZxWJgwOeMY1rLX1Zs8",
  "refresh_expires_at": "2026-11-27T18:47:11.561873624Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "27c89f37-65bc-4901-98d7-c4d2eb654043",
  "session_id": "1fe828a2-31aa-4464-bf5d-9eb6519ed930",
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
  "phone": "+380637468504",
  "device_ref": "sandbox-26899"
}
```

```json
{
  "challenge_id": "ac9ef659-a58c-4b23-bf08-1a46936295b2",
  "expires_at": "2026-10-28T18:52:12.124330412Z",
  "resend_available_at": "2026-10-28T18:47:13.124330412Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637468504` → **200**

```json
{
  "phone": "+380637468504",
  "audience": "CLIENT",
  "code": "520710",
  "sent_at": "2026-10-28T18:47:12.126378525Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac9ef659-a58c-4b23-bf08-1a46936295b2",
  "code": "520710",
  "device_ref": "sandbox-26899"
}
```

```json
{
  "session_id": "5306fef6-77aa-4d9d-a5db-8a03bac9884a",
  "subject": {
    "type": "CLIENT",
    "id": "4da7ef15-9038-4013-b121-deb03e46700a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZGE3ZWYxNS05MDM4LTQwMTMtYjEyMS1kZWIwM2U0NjcwMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MTMyLCJpYXQiOjE3OTMyMTMyMzIsImp0aSI6IjVjYmQwNWVhLWFmODQtNGZjNy1iNWYwLTI1Y2VhZWU0Njk5MyIsInNpZCI6IjUzMDZmZWY2LTc3YWEtNGQ5ZC1hNWRiLThhMDNiYWM5ODg0YSJ9.YZRStWSWmYXyvF6OkiCB4af1jDQlMpQIH--4hIRg1mE",
  "access_expires_at": "2026-10-28T19:02:12.433890261Z",
  "refresh_token": "BYKLRhgbhU3L8GInI3qFwS-Ik3q2Kyu4XmglYn0q6Yw",
  "refresh_expires_at": "2026-11-27T18:47:12.433433634Z",
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
  "session_id": "3fc938bd-61cd-452b-aa94-30a3c8a1d452",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxMzMsImlhdCI6MTc5MzIxMzIzMywianRpIjoiMDQ3YTI5OTMtODdjMy00MzkyLWI5ZTAtYmFkMmU2MDY4NzI5Iiwic2lkIjoiM2ZjOTM4YmQtNjFjZC00NTJiLWFhOTQtMzBhM2M4YTFkNDUyIn0.lAaKieeoy64tLrBLpmNPQFxLZAHo8mT7NDI4cCKtHy8",
  "access_expires_at": "2026-10-28T19:02:13.606253727Z",
  "refresh_token": "Y8ZZvogGn3WtzLxrZlasENRtZKh_X_sw1psJdCm0PdA",
  "refresh_expires_at": "2026-10-29T06:47:13.605495466Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637468504` → **200**

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
  "correlation_id": "2bca0dcd-ab8c-4e6f-9894-7fe6fe3e1adf"
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
  "session_id": "0835628a-1007-4bfc-b79a-46bfc136be27",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxMzQsImlhdCI6MTc5MzIxMzIzNCwianRpIjoiYjU3ZmNkNzUtOTEzYi00ZmNlLWJhMWYtMmVlOTQxMWExMWI2Iiwic2lkIjoiMDgzNTYyOGEtMTAwNy00YmZjLWI3OWEtNDZiZmMxMzZiZTI3In0.W59VIqcBFFbaz1H11BiL-fDuWp7pElCSSWp6nqBUPX0",
  "access_expires_at": "2026-10-28T19:02:14.791539892Z",
  "refresh_token": "NujcFP_kOo9eZjMTMOTeg0VcVHfDVEzob1pkgxF30u4",
  "refresh_expires_at": "2026-10-29T06:47:14.790920319Z",
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
  "command_id": "fae1d126-6749-4a63-9029-42376a4a3fe6",
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
  "changed_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T18:47:15.363023589Z"
}
```

## The rider books the airport for 2026-10-28T21:47:14Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600674475",
  "device_ref": "sandbox-8430"
}
```

```json
{
  "challenge_id": "fbaf3e50-e0bd-4d1c-847c-e08108550361",
  "expires_at": "2026-10-28T18:52:15.643427274Z",
  "resend_available_at": "2026-10-28T18:47:16.643427274Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600674475` → **200**

```json
{
  "phone": "+48600674475",
  "audience": "CLIENT",
  "code": "328503",
  "sent_at": "2026-10-28T18:47:15.645814777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fbaf3e50-e0bd-4d1c-847c-e08108550361",
  "code": "328503",
  "device_ref": "sandbox-8430"
}
```

```json
{
  "session_id": "f33d50a1-5e89-4aed-ae28-26b2dee3e24c",
  "subject": {
    "type": "CLIENT",
    "id": "f7d8afd2-a4e1-4498-89a4-0858ccb44eda"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmN2Q4YWZkMi1hNGUxLTQ0OTgtODlhNC0wODU4Y2NiNDRlZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MTM1LCJpYXQiOjE3OTMyMTMyMzUsImp0aSI6ImI5NjBlN2E5LWQyNzQtNDRjOC04YWJkLThkMjk1ZmY2NDAwNCIsInNpZCI6ImYzM2Q1MGExLTVlODktNGFlZC1hZTI4LTI2YjJkZWUzZTI0YyJ9.XhWDQU2WdxTg1J_1DAEEexI7LqBv3WqihNVf-_QpLG8",
  "access_expires_at": "2026-10-28T19:02:15.942320981Z",
  "refresh_token": "E6sDCp5wNNJck3k4k96BRx9eaEHUpYlInDFt8zvzkyU",
  "refresh_expires_at": "2026-11-27T18:47:15.941787473Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "04da59e0-a2dd-4700-a202-07a5a3464a98",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T21:47:14Z"
}
```

```json
{
  "id": "7b62dd80-5217-4169-8405-7278e21ed501",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:52:16.231739Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T21:47:14Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1a557a76-f8c3-43dd-9cd8-0ce35ff4deb9",
  "quote_id": "7b62dd80-5217-4169-8405-7278e21ed501",
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
  "pickup_at": "2026-10-28T21:47:14Z"
}
```

```json
{
  "id": "199745a4-d0b0-400c-a25e-a15a1f95e313",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f7d8afd2-a4e1-4498-89a4-0858ccb44eda",
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
  "created_at": "2026-10-28T18:47:16.529762Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T21:47:14Z",
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
  "device_ref": "sandbox-28581"
}
```

```json
{
  "challenge_id": "6df34a2e-f631-447d-81cd-89884086c3a8",
  "expires_at": "2026-10-28T18:52:16.824766568Z",
  "resend_available_at": "2026-10-28T18:47:17.824766568Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "199796",
  "sent_at": "2026-10-28T18:47:16.826840208Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6df34a2e-f631-447d-81cd-89884086c3a8",
  "code": "199796",
  "device_ref": "sandbox-28581"
}
```

```json
{
  "session_id": "1434f9ec-70e4-4a0f-bbad-8088b0d5adac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDEzNywiaWF0IjoxNzkzMjEzMjM3LCJqdGkiOiI5MjQ1MjM2ZS03OTBkLTQwYjYtYWY2NC00YmJiMTc5NDcyZmUiLCJzaWQiOiIxNDM0ZjllYy03MGU0LTRhMGYtYmJhZC04MDg4YjBkNWFkYWMifQ.Jaost1DaqaLt7AzDjEB_3FPBilMvUnW8p2l-u1N4d50",
  "access_expires_at": "2026-10-28T19:02:17.126709393Z",
  "refresh_token": "8MHe52tFPurF0r90ua_2a12-d5UAl26JKnVwqiSynQE",
  "refresh_expires_at": "2026-11-27T18:47:17.12624171Z",
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
  "command_id": "3dc395bb-0f4e-4626-92ac-70a2785ea8ea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:47:17Z",
    "sequence": 1793213237680
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8bd91e8c-1842-4192-89db-f9a7d9a9c3b4",
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
  "last_heartbeat_at": "2026-10-28T18:47:17.699522Z",
  "last_location_at": "2026-10-28T18:47:17.699522Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "199745a4-d0b0-400c-a25e-a15a1f95e313",
      "short_number": 21,
      "pickup_at": "2026-10-28T21:47:14Z",
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

`POST /api/driver/v1/preorders/199745a4-d0b0-400c-a25e-a15a1f95e313/reserve` → **200**

```json
{
  "command_id": "d65642bf-873b-4c74-892f-5940c49a661f"
}
```

```json
{
  "id": "a4c0a9ca-46bd-4dc1-a5fe-08ae3cde36a6",
  "state": "RESERVED",
  "order": {
    "order_id": "199745a4-d0b0-400c-a25e-a15a1f95e313",
    "short_number": 21,
    "pickup_at": "2026-10-28T21:47:14Z",
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
  "reserved_at": "2026-10-28T18:47:18.269105Z",
  "confirm_from": "2026-10-28T21:17:14Z",
  "confirm_until": "2026-10-28T21:27:14Z",
  "drop_until": "2026-10-28T20:47:14Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "a4c0a9ca-46bd-4dc1-a5fe-08ae3cde36a6",
      "state": "RESERVED",
      "order": {
        "order_id": "199745a4-d0b0-400c-a25e-a15a1f95e313",
        "short_number": 21,
        "pickup_at": "2026-10-28T21:47:14Z",
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
      "reserved_at": "2026-10-28T18:47:18.269105Z",
      "confirm_from": "2026-10-28T21:17:14Z",
      "confirm_until": "2026-10-28T21:27:14Z",
      "drop_until": "2026-10-28T20:47:14Z"
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
      "id": "a4c0a9ca-46bd-4dc1-a5fe-08ae3cde36a6",
      "state": "RESERVED",
      "order": {
        "order_id": "199745a4-d0b0-400c-a25e-a15a1f95e313",
        "short_number": 21,
        "pickup_at": "2026-10-28T21:47:14Z",
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
      "reserved_at": "2026-10-28T18:47:18.269105Z",
      "confirm_from": "2026-10-28T21:17:14Z",
      "confirm_until": "2026-10-28T21:27:14Z",
      "drop_until": "2026-10-28T20:47:14Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/a4c0a9ca-46bd-4dc1-a5fe-08ae3cde36a6/confirm` → **409**

```json
{
  "command_id": "0baee84b-194e-4992-9c8b-e57d2a7752bf"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/a4c0a9ca-46bd-4dc1-a5fe-08ae3cde36a6/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ca565a6b-7f33-4e11-891c-28798d60b42e"
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
  "session_id": "09888601-c410-480b-9361-d50b44ec0ade",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxMzksImlhdCI6MTc5MzIxMzIzOSwianRpIjoiMjllMWNkOTItMmJlMi00Mjg0LWE1MmEtZDdiMWQ3YmI4OTA2Iiwic2lkIjoiMDk4ODg2MDEtYzQxMC00ODBiLTkzNjEtZDUwYjQ0ZWMwYWRlIn0.RVpmOAgeebpTCe7LhWcVIaU_jv12C5q8QdMGS7kEnS4",
  "access_expires_at": "2026-10-28T19:02:19.714695793Z",
  "refresh_token": "T9DLjqAETXCW9rI6BIL6C6f0YqBoQa9W_sDgIyKUlss",
  "refresh_expires_at": "2026-10-29T06:47:19.714211374Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/199745a4-d0b0-400c-a25e-a15a1f95e313` → **200**

```json
{
  "id": "199745a4-d0b0-400c-a25e-a15a1f95e313",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "f7d8afd2-a4e1-4498-89a4-0858ccb44eda",
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
  "created_at": "2026-10-28T18:47:16.529762Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T21:47:14Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "a4c0a9ca-46bd-4dc1-a5fe-08ae3cde36a6",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T18:47:18.269105Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/199745a4-d0b0-400c-a25e-a15a1f95e313/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T18:47:16.531156Z",
      "actor": {
        "type": "CLIENT",
        "id": "f7d8afd2-a4e1-4498-89a4-0858ccb44eda",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "199745a4-d0b0-400c-a25e-a15a1f95e313",
        "preorder": true,
        "quote_id": "7b62dd80-5217-4169-8405-7278e21ed501",
        "pickup_at": "2026-10-28T21:47:14Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "d0bf4910-e1af-43ab-9e7b-5fbbcd9235fd"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T18:47:18.270375Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "199745a4-d0b0-400c-a25e-a15a1f95e313",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "a4c0a9ca-46bd-4dc1-a5fe-08ae3cde36a6"
      },
      "correlation_id": "6b5b36c0-07e5-4d76-ba87-91980342da28"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 199745a4-d0b0-400c-a25e-a15a1f95e313, reservation a4c0a9ca-46bd-4dc1-a5fe-08ae3cde36a6.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15664"
}
```

```json
{
  "challenge_id": "12848b7d-4089-48f3-b6ad-e96e5927c2bc",
  "expires_at": "2026-10-28T18:52:20.581631358Z",
  "resend_available_at": "2026-10-28T18:47:21.581631358Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "988835",
  "sent_at": "2026-10-28T18:47:20.58374611Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12848b7d-4089-48f3-b6ad-e96e5927c2bc",
  "code": "988835",
  "device_ref": "sandbox-15664"
}
```

```json
{
  "session_id": "2f6ec12e-174d-4018-9f40-95c0ef2817a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDE0MCwiaWF0IjoxNzkzMjEzMjQwLCJqdGkiOiJkYmE4YmU2MC00ZWQ3LTRjMTItYWUwYi0zNzU2NGM0NWM2OTgiLCJzaWQiOiIyZjZlYzEyZS0xNzRkLTQwMTgtOWY0MC05NWMwZWYyODE3YTgifQ.qafivvM1Dhzu36NuAftO4VmY_60PzZtrV8uA44_7D6s",
  "access_expires_at": "2026-10-28T19:02:20.885251682Z",
  "refresh_token": "YUdY7bsXBu6I68-9UPKXHWBR0Bm3g6Du73rHf0ByuZE",
  "refresh_expires_at": "2026-11-27T18:47:20.884713432Z",
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
  "command_id": "ab05dad5-241f-4473-b49c-595e94e57066",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:47:21Z",
    "sequence": 1793213241446
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a3eeaf7b-7a95-4bca-b3d3-7316f4ef95c6",
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
  "last_heartbeat_at": "2026-10-28T18:47:21.464742Z",
  "last_location_at": "2026-10-28T18:47:21.464742Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675527103",
  "device_ref": "sandbox-9135"
}
```

```json
{
  "challenge_id": "19077adc-2f9b-44b7-9041-d528a9e9864d",
  "expires_at": "2026-10-28T18:52:21.737931367Z",
  "resend_available_at": "2026-10-28T18:47:22.737931367Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675527103` → **200**

```json
{
  "phone": "+380675527103",
  "audience": "CLIENT",
  "code": "009630",
  "sent_at": "2026-10-28T18:47:21.740163516Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19077adc-2f9b-44b7-9041-d528a9e9864d",
  "code": "009630",
  "device_ref": "sandbox-9135"
}
```

```json
{
  "session_id": "57877ce2-9de8-4806-a8af-ae1cda186eef",
  "subject": {
    "type": "CLIENT",
    "id": "aa9cb7dc-22bd-4a13-9c61-aac046ba9cdc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYTljYjdkYy0yMmJkLTRhMTMtOWM2MS1hYWMwNDZiYTljZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MTQyLCJpYXQiOjE3OTMyMTMyNDIsImp0aSI6ImE2OTc3ZWExLWUwNGMtNDRkNi05ODJmLTU3ZTg3Zjk3OWY2OCIsInNpZCI6IjU3ODc3Y2UyLTlkZTgtNDgwNi1hOGFmLWFlMWNkYTE4NmVlZiJ9.ddhdlJyQXOta-sU7SfeMp0rR8VRnTdNCMrAkpKaCeNU",
  "access_expires_at": "2026-10-28T19:02:22.03902167Z",
  "refresh_token": "5lNTvJgYzcIuEwdI0AHHs0GLfkAyc_JSBHcwN-GO9Ho",
  "refresh_expires_at": "2026-11-27T18:47:22.038502789Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c2adfb27-2f39-4c80-903d-5830f3cd2828",
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
  "id": "bb69a524-f943-432b-bd54-2ec9b1b069ec",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:52:22.326041Z",
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
  "command_id": "36d482d0-2d68-4e77-a93b-8897aace95ec",
  "quote_id": "bb69a524-f943-432b-bd54-2ec9b1b069ec",
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
  "id": "4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aa9cb7dc-22bd-4a13-9c61-aac046ba9cdc",
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
  "created_at": "2026-10-28T18:47:22.617256Z",
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
    "id": "7f4619d6-a921-4a25-b6d4-b4f10ae5a173",
    "order_id": "4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4",
    "expires_at": "2026-10-28T18:47:37.620539Z",
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

`POST /api/driver/v1/offers/7f4619d6-a921-4a25-b6d4-b4f10ae5a173/accept` → **200**

```json
{
  "command_id": "ddacda23-2c4f-4a67-8fed-a22f92ef18c0"
}
```

```json
{
  "id": "ea7a6afd-cb75-4af9-9766-b535f29528b7",
  "order_id": "4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "34799de7-d8b5-433a-8fa2-c3f7aa37d916",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "34799de7-d8b5-433a-8fa2-c3f7aa37d916",
  "order_id": "4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4",
  "assignment_id": "ea7a6afd-cb75-4af9-9766-b535f29528b7",
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

`POST /api/driver/v1/work-sessions/a3eeaf7b-7a95-4bca-b3d3-7316f4ef95c6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:47:23Z",
    "sequence": 1793213243735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a3eeaf7b-7a95-4bca-b3d3-7316f4ef95c6",
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
  "last_heartbeat_at": "2026-10-28T18:47:23.755446Z",
  "last_location_at": "2026-10-28T18:47:23.755446Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "34799de7-d8b5-433a-8fa2-c3f7aa37d916",
  "order_id": "4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4",
  "assignment_id": "ea7a6afd-cb75-4af9-9766-b535f29528b7",
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

`POST /api/driver/v1/trips/34799de7-d8b5-433a-8fa2-c3f7aa37d916/arrive` → **200**

```json
{
  "command_id": "138e9f6a-0fe4-473b-854c-b4b1e6b3fd6e",
  "expected_version": 0
}
```

```json
{
  "id": "34799de7-d8b5-433a-8fa2-c3f7aa37d916",
  "order_id": "4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4",
  "assignment_id": "ea7a6afd-cb75-4af9-9766-b535f29528b7",
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
  "arrived_at": "2026-10-28T18:47:24.310741Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/34799de7-d8b5-433a-8fa2-c3f7aa37d916/start` → **200**

```json
{
  "command_id": "aa36e421-1649-4556-87e3-ebf6326f2341",
  "expected_version": 1
}
```

```json
{
  "id": "34799de7-d8b5-433a-8fa2-c3f7aa37d916",
  "order_id": "4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4",
  "assignment_id": "ea7a6afd-cb75-4af9-9766-b535f29528b7",
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
  "arrived_at": "2026-10-28T18:47:24.310741Z",
  "started_at": "2026-10-28T18:47:24.592505Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/a3eeaf7b-7a95-4bca-b3d3-7316f4ef95c6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:47:24Z",
    "sequence": 1793213244865
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a3eeaf7b-7a95-4bca-b3d3-7316f4ef95c6",
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
  "last_heartbeat_at": "2026-10-28T18:47:24.8842Z",
  "last_location_at": "2026-10-28T18:47:24.8842Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/34799de7-d8b5-433a-8fa2-c3f7aa37d916/complete` → **200**

```json
{
  "command_id": "473f3ffd-fc74-438d-9396-6ea7941e92b6",
  "expected_version": 2,
  "reported_at": "2026-10-28T18:47:25Z",
  "cash_received": true
}
```

```json
{
  "id": "34799de7-d8b5-433a-8fa2-c3f7aa37d916",
  "order_id": "4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4",
  "assignment_id": "ea7a6afd-cb75-4af9-9766-b535f29528b7",
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
  "arrived_at": "2026-10-28T18:47:24.310741Z",
  "started_at": "2026-10-28T18:47:24.592505Z",
  "completed_at": "2026-10-28T18:47:25.164629Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4/rating` → **200**

```json
{
  "command_id": "7c6c6afe-d1e6-4741-997c-165d359655e4",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4",
  "score": 5,
  "created_at": "2026-10-28T18:47:25.460776647Z"
}
```

`POST /api/driver/v1/orders/4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4/rating` → **200**

```json
{
  "command_id": "0305b167-fb5f-4519-9012-d994230d8114",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4",
  "score": 4,
  "created_at": "2026-10-28T18:47:25.736185529Z"
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
  "session_id": "964d2e28-aa23-4560-a823-4892c6f5b301",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxNDYsImlhdCI6MTc5MzIxMzI0NiwianRpIjoiMWQ4YjQzZDAtZjY5Zi00N2M2LTk4NDctNGM2NzUzMjFmODljIiwic2lkIjoiOTY0ZDJlMjgtYWEyMy00NTYwLWE4MjMtNDg5MmM2ZjViMzAxIn0.I_rpxO3lLalHUYjYVJorcT3bOxzeojzaaREMbPGMNT8",
  "access_expires_at": "2026-10-28T19:02:26.645663039Z",
  "refresh_token": "ToKATPAKoubvUNEa5slrQhVpurZ1mLDp83IxXASRSQk",
  "refresh_expires_at": "2026-10-29T06:47:26.64517155Z",
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
  "session_id": "8ff71731-222c-4eb6-aa7d-3ef37cba43cd",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxNDcsImlhdCI6MTc5MzIxMzI0NywianRpIjoiNDU3NTg0NmYtMGI5OS00M2U5LWE5YWItMDQ1ZTM1M2MwY2EwIiwic2lkIjoiOGZmNzE3MzEtMjIyYy00ZWI2LWFhN2QtM2VmMzdjYmE0M2NkIn0.6QyFEF5_T1F03X8Tffc0YCQxP7-dZAxNEBE5hv4G-hQ",
  "access_expires_at": "2026-10-28T19:02:27.250478463Z",
  "refresh_token": "JLgWm7tSU21BVJOQ7PSa1DgvzbPOWYSspnzwG3CK5lw",
  "refresh_expires_at": "2026-10-29T06:47:27.249933267Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4",
      "author_type": "RIDER",
      "author_id": "aa9cb7dc-22bd-4a13-9c61-aac046ba9cdc",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T18:47:25.460777Z"
    },
    {
      "order_id": "4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "aa9cb7dc-22bd-4a13-9c61-aac046ba9cdc",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T18:47:25.736186Z"
    }
  ]
}
```

Done: ratings for order 4334214b-cd85-4e7f-b0ab-e2ebbcf11ae4.

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
  "session_id": "2b3b8c29-420f-45e4-9716-c31679abc4ff",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxNDgsImlhdCI6MTc5MzIxMzI0OCwianRpIjoiNjRkYWNlYjktYjRlZi00YmY5LTkyMmMtNGRjOTg1MTE1NjI3Iiwic2lkIjoiMmIzYjhjMjktNDIwZi00NWU0LTk3MTYtYzMxNjc5YWJjNGZmIn0.INvrQnsLoQOZYMUxa8gpclVDJm0IQA3BtkxVCE6dJaY",
  "access_expires_at": "2026-10-28T19:02:28.149914966Z",
  "refresh_token": "sCZpAbrHdFtwVEIqLU9UpShfargANAx3rtp3FJGM380",
  "refresh_expires_at": "2026-10-29T06:47:28.149433992Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b3292db2-383c-4bc2-9cd1-23a4f35c911b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "2dea5201-f72b-4a32-abb3-15cfb62ad34a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T18:47:28.438135Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2dea5201-f72b-4a32-abb3-15cfb62ad34a` → **200**

```json
{
  "id": "2dea5201-f72b-4a32-abb3-15cfb62ad34a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T18:47:28.438135Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2dea5201-f72b-4a32-abb3-15cfb62ad34a` → **200**

```json
{
  "id": "2dea5201-f72b-4a32-abb3-15cfb62ad34a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T18:47:28.438135Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2dea5201-f72b-4a32-abb3-15cfb62ad34a` → **200**

```json
{
  "id": "2dea5201-f72b-4a32-abb3-15cfb62ad34a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T18:47:28.438135Z",
  "ready_at": "2026-10-28T18:47:31.228283Z",
  "expires_at": "2026-10-29T18:47:31.228283Z"
}
```

`GET /api/admin/v1/reports/exports/2dea5201-f72b-4a32-abb3-15cfb62ad34a/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
total,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1f0432f6-f5d8-4851-b472-c228c639c5e6",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "88f1457f-394c-41a6-b829-2d0a5758e204",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T18:47:31.579779Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/88f1457f-394c-41a6-b829-2d0a5758e204` → **200**

```json
{
  "id": "88f1457f-394c-41a6-b829-2d0a5758e204",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T18:47:31.579779Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/88f1457f-394c-41a6-b829-2d0a5758e204` → **200**

```json
{
  "id": "88f1457f-394c-41a6-b829-2d0a5758e204",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T18:47:31.579779Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/88f1457f-394c-41a6-b829-2d0a5758e204` → **200**

```json
{
  "id": "88f1457f-394c-41a6-b829-2d0a5758e204",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T18:47:31.579779Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/88f1457f-394c-41a6-b829-2d0a5758e204` → **200**

```json
{
  "id": "88f1457f-394c-41a6-b829-2d0a5758e204",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T18:47:31.579779Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/88f1457f-394c-41a6-b829-2d0a5758e204` → **200**

```json
{
  "id": "88f1457f-394c-41a6-b829-2d0a5758e204",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T18:47:31.579779Z",
  "ready_at": "2026-10-28T18:47:36.236183Z",
  "expires_at": "2026-10-29T18:47:36.236183Z"
}
```

`GET /api/admin/v1/reports/exports/88f1457f-394c-41a6-b829-2d0a5758e204/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/a8b0cfcd-86be-4046-836b-62936f112840` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/a8b0cfcd-86be-4046-836b-62936f112840",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2598abc9-d5d0-4096-a264-011868542fce"
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
  "device_ref": "sandbox-13127"
}
```

```json
{
  "challenge_id": "2eab49b9-89ec-434c-aff7-156c4ac3d7d3",
  "expires_at": "2026-10-28T18:52:37.542513359Z",
  "resend_available_at": "2026-10-28T18:47:38.542513359Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "855179",
  "sent_at": "2026-10-28T18:47:37.544774602Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2eab49b9-89ec-434c-aff7-156c4ac3d7d3",
  "code": "855179",
  "device_ref": "sandbox-13127"
}
```

```json
{
  "session_id": "f35b0149-e8ff-4792-abe7-59d3ac9006b5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDE1NywiaWF0IjoxNzkzMjEzMjU3LCJqdGkiOiJhNTcyY2UyYS1hMjBmLTRmMTItYjY2Yy0xZmVhMjhkMzI2ZTEiLCJzaWQiOiJmMzViMDE0OS1lOGZmLTQ3OTItYWJlNy01OWQzYWM5MDA2YjUifQ.sSDd0HfYr1iOuUn_eU0Nh73l9swsEWAlOZp8wPBWROk",
  "access_expires_at": "2026-10-28T19:02:37.846292969Z",
  "refresh_token": "9MMiIg15cqyjZaR2xl84g8EDTeeA2dbz3KUzbQFFCcI",
  "refresh_expires_at": "2026-11-27T18:47:37.845684864Z",
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
  "command_id": "436847f6-8e37-4901-8ad7-76285f0fed20",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:47:38Z",
    "sequence": 1793213258649
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f3ce4d76-5d9f-414a-8497-883dcaa26d6e",
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
  "last_heartbeat_at": "2026-10-28T18:47:38.668775Z",
  "last_location_at": "2026-10-28T18:47:38.668775Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "844b66b6-006e-46b7-89bc-699d11549d77",
  "points": [
    {
      "sequence": 1793213260948,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T18:46:40Z"
    },
    {
      "sequence": 1793213260956,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T18:47:40Z"
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
  "session_id": "ae2840e6-c63d-4641-bd7d-df43669458d3",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxNjEsImlhdCI6MTc5MzIxMzI2MSwianRpIjoiODAyZTczZGItZmNmNC00NWM0LTgxZDEtZWNlNTE0YWM4MTBjIiwic2lkIjoiYWUyODQwZTYtYzYzZC00NjQxLWJkN2QtZGY0MzY2OTQ1OGQzIn0.CTAvJcynZf2FhGNqNPci59QUrDB67eTXoLYcEG_Q56k",
  "access_expires_at": "2026-10-28T19:02:41.62469782Z",
  "refresh_token": "CHEgmKtvLlohK5QilweDvKG1Nh71M74Kbemz5xT4NVs",
  "refresh_expires_at": "2026-10-29T06:47:41.624204477Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "de13c466-0248-4327-85d1-052f598bcf69",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T18:47:40Z",
        "track_point_id": "f0cf26a0-554b-4adc-867e-a8c22a2813b7",
        "work_session_id": "f3ce4d76-5d9f-414a-8497-883dcaa26d6e"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T18:47:40Z",
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

`POST /api/admin/v1/driver-risk-flags/de13c466-0248-4327-85d1-052f598bcf69/confirm` → **200**

```json
{
  "command_id": "dbb1bc1b-92ae-4636-b3a3-f317379ee639",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "de13c466-0248-4327-85d1-052f598bcf69",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T18:47:40Z",
    "track_point_id": "f0cf26a0-554b-4adc-867e-a8c22a2813b7",
    "work_session_id": "f3ce4d76-5d9f-414a-8497-883dcaa26d6e"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T18:47:40Z",
  "reason": null,
  "reviewed_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "reviewed_at": "2026-10-28T18:47:42.504235Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/de13c466-0248-4327-85d1-052f598bcf69/dismiss` → **409**

```json
{
  "command_id": "ae3ebb8d-0be6-466b-b556-e919afe31994",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/de13c466-0248-4327-85d1-052f598bcf69/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "81f8648c-1a16-441d-a71f-2d871ff71a6a"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "af9a4ac1-efb3-425b-ae92-239762eaff54",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "7d655136-5bc2-4f0e-b96a-838720a84d2f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "raised_at": "2026-10-28T18:47:43.0826Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/7d655136-5bc2-4f0e-b96a-838720a84d2f/dismiss` → **200**

```json
{
  "command_id": "a43b0681-14aa-443c-983d-0594e62ddd56",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "7d655136-5bc2-4f0e-b96a-838720a84d2f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "raised_at": "2026-10-28T18:47:43.0826Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "reviewed_at": "2026-10-28T18:47:43.370841Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "b1d17958-918e-4f4b-90c0-2099513429da",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "de13c466-0248-4327-85d1-052f598bcf69"
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
      "actor_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T18:47:43.670997Z"
    }
  ]
}
```

Done: flag de13c466-0248-4327-85d1-052f598bcf69 confirmed, suspension named it, driver reinstated.

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
  "session_id": "b93c4e1b-f7ac-41da-bee5-edc800bf0fdd",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxNjQsImlhdCI6MTc5MzIxMzI2NCwianRpIjoiYzllMzU5MGItNzdkOC00ZTVmLTkzYWEtM2IyNGNjZmE2NjEyIiwic2lkIjoiYjkzYzRlMWItZjdhYy00MWRhLWJlZTUtZWRjODAwYmYwZmRkIn0.au5N5hjjCaOUAkroo50mpXV4GvXggW3CpYwXifiMYj0",
  "access_expires_at": "2026-10-28T19:02:44.598077591Z",
  "refresh_token": "pnjC7lewX3aR3dxu62X5_obSHGkjqTfxP3R5s7WBB8k",
  "refresh_expires_at": "2026-10-29T06:47:44.597568125Z",
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
      "actor_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T18:47:43.670997Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "c8e352ba-eb5a-447a-b4fc-a498daf8c324",
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
  "session_id": "f3ce4d76-5d9f-414a-8497-883dcaa26d6e",
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
  "last_heartbeat_at": "2026-10-28T18:47:38.668775Z",
  "last_location_at": "2026-10-28T18:47:38.668775Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f3ce4d76-5d9f-414a-8497-883dcaa26d6e/close` → **200**

```json
{
  "command_id": "e75f5fce-9803-4a1b-897b-2a6db2a6e8e0",
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
  "session_id": "07da6e71-2864-423f-ac7f-d9501412e70a",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxNjYsImlhdCI6MTc5MzIxMzI2NiwianRpIjoiNjg1M2Q2MzctYTc3Yi00MDU1LWIyZjQtYjQyYTJiNDY5MDkwIiwic2lkIjoiMDdkYTZlNzEtMjg2NC00MjNmLWFjN2YtZDk1MDE0MTJlNzBhIn0.z4Flt5wL41DY160NFnIyK2iB3AYSQATF2aYPpY5T2xA",
  "access_expires_at": "2026-10-28T19:02:46.370019241Z",
  "refresh_token": "0Hen9fR25t4P9cNEpi73AVQu06kuQkR85-8c62nkW_w",
  "refresh_expires_at": "2026-10-29T06:47:46.369513069Z",
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
  "command_id": "361f5d64-4fac-4181-9e61-40f42d0c44e6",
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
  "changed_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T18:47:46.955454Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "361f5d64-4fac-4181-9e61-40f42d0c44e6",
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
  "changed_by": "313514fb-76fb-4a6c-b718-bea886fa63bd",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T18:47:46.955454Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48876098023",
  "device_ref": "sandbox-25281"
}
```

```json
{
  "challenge_id": "c2216f13-f1bd-48b3-b9c5-171476e340ed",
  "expires_at": "2026-10-28T18:52:47.535367503Z",
  "resend_available_at": "2026-10-28T18:47:48.535367503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48876098023` → **200**

```json
{
  "phone": "+48876098023",
  "audience": "CLIENT",
  "code": "255823",
  "sent_at": "2026-10-28T18:47:47.537763749Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2216f13-f1bd-48b3-b9c5-171476e340ed",
  "code": "255823",
  "device_ref": "sandbox-25281"
}
```

```json
{
  "session_id": "a4931246-eb7d-4edd-83d5-d506e6f69a85",
  "subject": {
    "type": "CLIENT",
    "id": "72ea1ea8-82c0-41c9-85d0-aeb605cf5868"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MmVhMWVhOC04MmMwLTQxYzktODVkMC1hZWI2MDVjZjU4NjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MTY3LCJpYXQiOjE3OTMyMTMyNjcsImp0aSI6ImU0OWI5ZDk4LTkxMGUtNDQxYy1hOTRiLTU1MTM4OWRhMDBhOSIsInNpZCI6ImE0OTMxMjQ2LWViN2QtNGVkZC04M2Q1LWQ1MDZlNmY2OWE4NSJ9.6nynsXgStvid9ATLz7NmKoPnfwscsRAlbOZ04UHekd4",
  "access_expires_at": "2026-10-28T19:02:47.843369213Z",
  "refresh_token": "Ntc3SZRhHKpi_IDEY893c4GdX_1oIwCsFxPKHeifDqw",
  "refresh_expires_at": "2026-11-27T18:47:47.842792119Z",
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
  "correlation_id": "4d300c66-eef4-4b40-be43-01fffb1cf0eb"
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
  "device_ref": "sandbox-13723"
}
```

```json
{
  "challenge_id": "93c6c638-f047-4ee8-93f3-1981ae7b14c5",
  "expires_at": "2026-10-28T18:52:48.6662189Z",
  "resend_available_at": "2026-10-28T18:47:49.6662189Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "395178",
  "sent_at": "2026-10-28T18:47:48.66847388Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93c6c638-f047-4ee8-93f3-1981ae7b14c5",
  "code": "395178",
  "device_ref": "sandbox-13723"
}
```

```json
{
  "session_id": "1461a2c1-803e-4649-ab40-12dca4aab89e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDE2OCwiaWF0IjoxNzkzMjEzMjY4LCJqdGkiOiIzN2MwN2I5OS1jNDZmLTQzMWQtOWZmYi03Y2I2YmNiZmZjZGMiLCJzaWQiOiIxNDYxYTJjMS04MDNlLTQ2NDktYWI0MC0xMmRjYTRhYWI4OWUifQ.aZwbdCejNarYGqgvbSqeDzZ3qjBaxXQwaZpKDXDlIpU",
  "access_expires_at": "2026-10-28T19:02:48.966771364Z",
  "refresh_token": "v5lLnbqCjLh3XcW2zQ_nSaSFGUCJoC_nV5pBeevxazE",
  "refresh_expires_at": "2026-11-27T18:47:48.966096609Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8bd91e8c-1842-4192-89db-f9a7d9a9c3b4",
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
  "last_heartbeat_at": "2026-10-28T18:47:17.699522Z",
  "last_location_at": "2026-10-28T18:47:17.699522Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8bd91e8c-1842-4192-89db-f9a7d9a9c3b4/handover` → **200**

```json
{
  "command_id": "6df55a47-8b9b-455f-ba08-d5ff85e40ede",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8bd91e8c-1842-4192-89db-f9a7d9a9c3b4",
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
  "last_heartbeat_at": "2026-10-28T18:47:17.699522Z",
  "last_location_at": "2026-10-28T18:47:17.699522Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8bd91e8c-1842-4192-89db-f9a7d9a9c3b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:47:49Z",
    "sequence": 1793213269788
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8bd91e8c-1842-4192-89db-f9a7d9a9c3b4",
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
  "last_heartbeat_at": "2026-10-28T18:47:49.807844Z",
  "last_location_at": "2026-10-28T18:47:49.807844Z",
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
  "session_id": "8bd91e8c-1842-4192-89db-f9a7d9a9c3b4",
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
  "last_heartbeat_at": "2026-10-28T18:47:49.807844Z",
  "last_location_at": "2026-10-28T18:47:49.807844Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8bd91e8c-1842-4192-89db-f9a7d9a9c3b4/close` → **200**

```json
{
  "command_id": "b1c7ca1e-68c5-4962-aff5-6f90355e5075",
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
  "correlation_id": "6c81db57-b9bf-4141-8348-ebcfe59c651c"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675710097",
  "device_ref": "sandbox-25092"
}
```

```json
{
  "challenge_id": "c8f0b8c5-6240-4379-b08c-a280f9599074",
  "expires_at": "2026-10-28T18:52:51.192530589Z",
  "resend_available_at": "2026-10-28T18:47:52.192530589Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675710097` → **200**

```json
{
  "phone": "+380675710097",
  "audience": "CLIENT",
  "code": "256844",
  "sent_at": "2026-10-28T18:47:51.194576027Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c8f0b8c5-6240-4379-b08c-a280f9599074",
  "code": "256844",
  "device_ref": "sandbox-25092"
}
```

```json
{
  "session_id": "c39e1f0c-7c16-46e2-bf59-055888d7d5c1",
  "subject": {
    "type": "CLIENT",
    "id": "20d8ab63-c6a1-489e-a3d9-07d4a8a78291"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMGQ4YWI2My1jNmExLTQ4OWUtYTNkOS0wN2Q0YThhNzgyOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MTcxLCJpYXQiOjE3OTMyMTMyNzEsImp0aSI6IjhiZjI2N2MyLTk0NDAtNGYxOS1iNGI1LTg2MWNhMTBkMjM1OSIsInNpZCI6ImMzOWUxZjBjLTdjMTYtNDZlMi1iZjU5LTA1NTg4OGQ3ZDVjMSJ9.enddBYPJjHOMFxSYsD-8bvzMqb4-ESoqMPIOLSUC6BA",
  "access_expires_at": "2026-10-28T19:02:51.498273819Z",
  "refresh_token": "UPgF2ZnZUdFYJPt4ROPtUjEgt7x7BWT4HHAtk2EaFSQ",
  "refresh_expires_at": "2026-11-27T18:47:51.497790281Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "e99351a9-78e9-4d17-9fc3-071639f0d37d",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "00fe04b8-631d-4d02-99fe-cdb4e76e06f5",
  "upload_path": "/api/rider/v1/uploads/00fe04b8-631d-4d02-99fe-cdb4e76e06f5",
  "expires_at": "2026-10-28T19:02:51.786639547Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/00fe04b8-631d-4d02-99fe-cdb4e76e06f5` → **200**

```json
{
  "file_id": "00fe04b8-631d-4d02-99fe-cdb4e76e06f5",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "c9e4deb3-6f43-4cd0-8f3f-bf7bd6baaf71",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "00fe04b8-631d-4d02-99fe-cdb4e76e06f5"
  ]
}
```

```json
{
  "id": "7627cb27-e49a-4a7b-ac59-4d8b68fd3f07",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "20d8ab63-c6a1-489e-a3d9-07d4a8a78291",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T18:47:52.113396Z",
  "updated_at": "2026-10-28T18:47:52.113396Z",
  "respond_by": "2026-10-28T22:47:52.113396Z",
  "messages": [
    {
      "id": "d8884742-d431-43f8-b46b-1472b85cb042",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "20d8ab63-c6a1-489e-a3d9-07d4a8a78291",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T18:47:52.115177Z",
      "attachments": [
        {
          "file_id": "00fe04b8-631d-4d02-99fe-cdb4e76e06f5",
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
  "session_id": "60d8f090-1692-42f8-920d-69a7b1d03e0c",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxNzIsImlhdCI6MTc5MzIxMzI3MiwianRpIjoiYWZiMGU1NjItMjhiNC00YzUzLWJlNmMtZGMwOWEzMzY0Mzk3Iiwic2lkIjoiNjBkOGYwOTAtMTY5Mi00MmY4LTkyMGQtNjlhN2IxZDAzZTBjIn0.QDHVY3eb7uyzSGxoSdJFyo6w1Qcyu8oMt2ThJwXaW3A",
  "access_expires_at": "2026-10-28T19:02:52.739012297Z",
  "refresh_token": "D89nx6U8ExROZRXfoFFhcMmUa4fjeCgbzs0MzfAhomM",
  "refresh_expires_at": "2026-10-29T06:47:52.73848252Z",
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
  "session_id": "b87c6816-26fb-499f-9411-544fa030ed6e",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxNzMsImlhdCI6MTc5MzIxMzI3MywianRpIjoiNDRjOGIyNWYtOGVhZS00MTM1LWE2YzUtMjM1ZTk3NDA5NWZlIiwic2lkIjoiYjg3YzY4MTYtMjZmYi00OTlmLTk0MTEtNTQ0ZmEwMzBlZDZlIn0.eC5203JwpH59Q1n0htTZA9zwJM5eEHGTP_XNmEBy3Dk",
  "access_expires_at": "2026-10-28T19:02:53.344463581Z",
  "refresh_token": "_1qhEaEhrscYHbc_IpsitW7317bYbCc3k5mdN20Uj9U",
  "refresh_expires_at": "2026-10-29T06:47:53.343917028Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/7627cb27-e49a-4a7b-ac59-4d8b68fd3f07/attachments/00fe04b8-631d-4d02-99fe-cdb4e76e06f5` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "7547b541-9643-427e-bbac-873d0975dee5",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "2c324b83-bfda-48cc-a67e-389a9af9b05e",
  "upload_path": "/api/operator/v1/uploads/2c324b83-bfda-48cc-a67e-389a9af9b05e",
  "expires_at": "2026-10-28T19:02:53.639113031Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/2c324b83-bfda-48cc-a67e-389a9af9b05e` → **200**

```json
{
  "file_id": "2c324b83-bfda-48cc-a67e-389a9af9b05e",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/7627cb27-e49a-4a7b-ac59-4d8b68fd3f07` → **200**

```json
{
  "id": "7627cb27-e49a-4a7b-ac59-4d8b68fd3f07",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "20d8ab63-c6a1-489e-a3d9-07d4a8a78291",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T18:47:52.113396Z",
  "updated_at": "2026-10-28T18:47:52.113396Z",
  "respond_by": "2026-10-28T22:47:52.113396Z",
  "messages": [
    {
      "id": "d8884742-d431-43f8-b46b-1472b85cb042",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "20d8ab63-c6a1-489e-a3d9-07d4a8a78291",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T18:47:52.115177Z",
      "attachments": [
        {
          "file_id": "00fe04b8-631d-4d02-99fe-cdb4e76e06f5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/7627cb27-e49a-4a7b-ac59-4d8b68fd3f07/comments` → **200**

```json
{
  "command_id": "0fe08fab-418a-44bd-a203-b03573d227ac",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "2c324b83-bfda-48cc-a67e-389a9af9b05e"
  ]
}
```

```json
{
  "id": "7627cb27-e49a-4a7b-ac59-4d8b68fd3f07",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "20d8ab63-c6a1-489e-a3d9-07d4a8a78291",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T18:47:52.113396Z",
  "updated_at": "2026-10-28T18:47:54.250395Z",
  "respond_by": "2026-10-28T22:47:52.113396Z",
  "messages": [
    {
      "id": "d8884742-d431-43f8-b46b-1472b85cb042",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "20d8ab63-c6a1-489e-a3d9-07d4a8a78291",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T18:47:52.115177Z",
      "attachments": [
        {
          "file_id": "00fe04b8-631d-4d02-99fe-cdb4e76e06f5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "39535343-1712-4951-af7c-ceaf46367dfa",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T18:47:54.249926Z",
      "attachments": [
        {
          "file_id": "2c324b83-bfda-48cc-a67e-389a9af9b05e",
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

`GET /api/rider/v1/support/cases/7627cb27-e49a-4a7b-ac59-4d8b68fd3f07` → **200**

```json
{
  "id": "7627cb27-e49a-4a7b-ac59-4d8b68fd3f07",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "20d8ab63-c6a1-489e-a3d9-07d4a8a78291",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T18:47:52.113396Z",
  "updated_at": "2026-10-28T18:47:54.250395Z",
  "respond_by": "2026-10-28T22:47:52.113396Z",
  "messages": [
    {
      "id": "d8884742-d431-43f8-b46b-1472b85cb042",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "20d8ab63-c6a1-489e-a3d9-07d4a8a78291",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T18:47:52.115177Z",
      "attachments": [
        {
          "file_id": "00fe04b8-631d-4d02-99fe-cdb4e76e06f5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "39535343-1712-4951-af7c-ceaf46367dfa",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T18:47:54.249926Z",
      "attachments": [
        {
          "file_id": "2c324b83-bfda-48cc-a67e-389a9af9b05e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/7627cb27-e49a-4a7b-ac59-4d8b68fd3f07/attachments/2c324b83-bfda-48cc-a67e-389a9af9b05e` → **200**

Done: support case 7627cb27-e49a-4a7b-ac59-4d8b68fd3f07, rider attachment 00fe04b8-631d-4d02-99fe-cdb4e76e06f5, operator attachment 2c324b83-bfda-48cc-a67e-389a9af9b05e.

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
  "session_id": "b356ecb2-4fb3-4aed-809c-13bf8a366919",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxNzUsImlhdCI6MTc5MzIxMzI3NSwianRpIjoiMmYxOGIyOTMtMzUyZS00YWY0LTkxZmItYmZjMWJhM2UyMjdkIiwic2lkIjoiYjM1NmVjYjItNGZiMy00YWVkLTgwOWMtMTNiZjhhMzY2OTE5In0.eehwQs_NVrmY6KLRfDUy6mbC6FF5C_B0m9_qeHIGnCE",
  "access_expires_at": "2026-10-28T19:02:55.208306915Z",
  "refresh_token": "iwsfbs94vHVxhcqqNtGxGD2A0lCHOYAre0KmNvcl9Lk",
  "refresh_expires_at": "2026-10-29T06:47:55.207785881Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22669"
}
```

```json
{
  "challenge_id": "9034879e-37a7-4799-abd9-7e307e78515e",
  "expires_at": "2026-10-28T18:52:55.476280781Z",
  "resend_available_at": "2026-10-28T18:47:56.476280781Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "853237",
  "sent_at": "2026-10-28T18:47:55.478447186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9034879e-37a7-4799-abd9-7e307e78515e",
  "code": "853237",
  "device_ref": "sandbox-22669"
}
```

```json
{
  "session_id": "eeab43cc-f8ee-491b-95eb-bb1c5260b269",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDE3NSwiaWF0IjoxNzkzMjEzMjc1LCJqdGkiOiI0OTY2MzYyMi03MGIzLTQ0YjYtOTkyOS0xNzI4ODNkN2JjODkiLCJzaWQiOiJlZWFiNDNjYy1mOGVlLTQ5MWItOTVlYi1iYjFjNTI2MGIyNjkifQ.wwaGLLfliItqiZ0GSbJ2IyEt4fKll3aM1IbqbxSmp90",
  "access_expires_at": "2026-10-28T19:02:55.775972995Z",
  "refresh_token": "mnR87P_NBkCnL6AyndV9H6NBDMMAztvYcbdHkRYSWRo",
  "refresh_expires_at": "2026-11-27T18:47:55.775439482Z",
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
      "actor_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T18:47:43.670997Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "313514fb-76fb-4a6c-b718-bea886fa63bd",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T18:47:45.177623Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "e83fd917-2bbb-4167-80e9-27dae7bca81c",
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
  "device_ref": "sandbox-9090"
}
```

```json
{
  "challenge_id": "c31d69bd-f614-4deb-9e0c-c9e3f7ddf2b2",
  "expires_at": "2026-10-28T18:52:56.91778682Z",
  "resend_available_at": "2026-10-28T18:47:57.91778682Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "445389",
  "sent_at": "2026-10-28T18:47:56.91993353Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c31d69bd-f614-4deb-9e0c-c9e3f7ddf2b2",
  "code": "445389",
  "device_ref": "sandbox-9090"
}
```

```json
{
  "session_id": "4f4951cf-ba1b-4a76-938d-e68222bed7f8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDE3NywiaWF0IjoxNzkzMjEzMjc3LCJqdGkiOiI0ZWU5MDJlMC0yMTEzLTRmY2EtYTFiMS1kNmZiZWNjZWI4N2YiLCJzaWQiOiI0ZjQ5NTFjZi1iYTFiLTRhNzYtOTM4ZC1lNjgyMjJiZWQ3ZjgifQ.wWZpoHD4Vxh6p_HD-yceHOX3okDFee8hy-RJolGEApQ",
  "access_expires_at": "2026-10-28T19:02:57.219797937Z",
  "refresh_token": "xYbjGURRE7Gll7K1VK8tafdN0ouUH-aza-bllPhpAro",
  "refresh_expires_at": "2026-11-27T18:47:57.219258271Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a3eeaf7b-7a95-4bca-b3d3-7316f4ef95c6",
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
  "last_heartbeat_at": "2026-10-28T18:47:24.8842Z",
  "last_location_at": "2026-10-28T18:47:24.8842Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a3eeaf7b-7a95-4bca-b3d3-7316f4ef95c6/handover` → **200**

```json
{
  "command_id": "40389499-1762-48fb-930b-02093427db1f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a3eeaf7b-7a95-4bca-b3d3-7316f4ef95c6",
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
  "last_heartbeat_at": "2026-10-28T18:47:24.8842Z",
  "last_location_at": "2026-10-28T18:47:24.8842Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a3eeaf7b-7a95-4bca-b3d3-7316f4ef95c6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:47:58Z",
    "sequence": 1793213278401
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a3eeaf7b-7a95-4bca-b3d3-7316f4ef95c6",
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
  "last_heartbeat_at": "2026-10-28T18:47:58.059542Z",
  "last_location_at": "2026-10-28T18:47:58.059542Z",
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
  "command_id": "a78a3917-3fea-4d70-a1bc-d85143850d01",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:47:58Z",
    "sequence": 1793213278600
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "03cf3acc-6f01-4aa0-9849-91366e9c9e3e",
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
  "last_heartbeat_at": "2026-10-28T18:47:58.619159Z",
  "last_location_at": "2026-10-28T18:47:58.619159Z",
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
  "session_id": "636b083b-1e28-4e97-8aee-ed3cf51a6faf",
  "subject": {
    "type": "STAFF",
    "id": "313514fb-76fb-4a6c-b718-bea886fa63bd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM1MTRmYi03NmZiLTRhNmMtYjcxOC1iZWE4ODZmYTYzYmQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTQxNzksImlhdCI6MTc5MzIxMzI3OSwianRpIjoiOWQ5ZjI4OGEtZmVkMi00Y2IwLWI2NWItZGU4OGRmMmY2ZDIyIiwic2lkIjoiNjM2YjA4M2ItMWUyOC00ZTk3LThhZWUtZWQzY2Y1MWE2ZmFmIn0.FDDNfwlUAl0lsvwGbjlPEULEhtMk8UQ3u9UuO0GL7o8",
  "access_expires_at": "2026-10-28T19:02:59.228310458Z",
  "refresh_token": "5AdS6G7YZh5SKvF__ryoIMvZeHKn3Za_hlx2E4-POwc",
  "refresh_expires_at": "2026-10-29T06:47:59.22779387Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8bae1333-a0d2-4c52-9004-90bcc0dae88c",
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
  "id": "3c9f0be8-68e5-4d1d-9860-dc2696d14e08",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:52:59.510905Z",
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
  "command_id": "42905478-5a3b-4783-aef1-810fac357f8a",
  "quote_id": "3c9f0be8-68e5-4d1d-9860-dc2696d14e08",
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
  "id": "1e1d14c0-7d3b-435d-80f7-e1df9236a42e",
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
  "created_at": "2026-10-28T18:47:59.792348Z",
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
    "id": "73d3f20f-9c41-4fbc-9858-ddbcb4767561",
    "order_id": "1e1d14c0-7d3b-435d-80f7-e1df9236a42e",
    "expires_at": "2026-10-28T18:48:14.795708Z",
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

`POST /api/driver/v1/offers/73d3f20f-9c41-4fbc-9858-ddbcb4767561/accept` → **200**

```json
{
  "command_id": "b548f3f8-cbee-4981-a0aa-b1a13a3edd14"
}
```

```json
{
  "id": "ed556139-6a90-4af5-9596-3eb224ff115a",
  "order_id": "1e1d14c0-7d3b-435d-80f7-e1df9236a42e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6806e267-0de8-4a9b-8a5f-3226330d4e4a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6806e267-0de8-4a9b-8a5f-3226330d4e4a",
  "order_id": "1e1d14c0-7d3b-435d-80f7-e1df9236a42e",
  "assignment_id": "ed556139-6a90-4af5-9596-3eb224ff115a",
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

`POST /api/driver/v1/work-sessions/03cf3acc-6f01-4aa0-9849-91366e9c9e3e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T18:48:01Z",
    "sequence": 1793213281179
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "03cf3acc-6f01-4aa0-9849-91366e9c9e3e",
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
  "last_heartbeat_at": "2026-10-28T18:48:01.198401Z",
  "last_location_at": "2026-10-28T18:48:01.198401Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6806e267-0de8-4a9b-8a5f-3226330d4e4a/arrive` → **200**

```json
{
  "command_id": "b31ef22b-26d1-4db7-b8a3-9d4695c98078",
  "expected_version": 0
}
```

```json
{
  "id": "6806e267-0de8-4a9b-8a5f-3226330d4e4a",
  "order_id": "1e1d14c0-7d3b-435d-80f7-e1df9236a42e",
  "assignment_id": "ed556139-6a90-4af5-9596-3eb224ff115a",
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
  "arrived_at": "2026-10-28T18:48:01.487783Z",
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

`POST /api/driver/v1/trips/6806e267-0de8-4a9b-8a5f-3226330d4e4a/start` → **200**

```json
{
  "command_id": "fcc65f17-3c8d-4fc2-b641-f4a922414af0",
  "expected_version": 1
}
```

```json
{
  "id": "6806e267-0de8-4a9b-8a5f-3226330d4e4a",
  "order_id": "1e1d14c0-7d3b-435d-80f7-e1df9236a42e",
  "assignment_id": "ed556139-6a90-4af5-9596-3eb224ff115a",
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
  "arrived_at": "2026-10-28T18:48:01.487783Z",
  "started_at": "2026-10-28T18:48:01.794729Z",
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

`POST /api/driver/v1/trips/6806e267-0de8-4a9b-8a5f-3226330d4e4a/complete` → **200**

```json
{
  "command_id": "20113224-d1ce-4cc5-a291-d1508eed9320",
  "expected_version": 2,
  "reported_at": "2026-10-28T18:48:02Z",
  "cash_received": true
}
```

```json
{
  "id": "6806e267-0de8-4a9b-8a5f-3226330d4e4a",
  "order_id": "1e1d14c0-7d3b-435d-80f7-e1df9236a42e",
  "assignment_id": "ed556139-6a90-4af5-9596-3eb224ff115a",
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
  "arrived_at": "2026-10-28T18:48:01.487783Z",
  "started_at": "2026-10-28T18:48:01.794729Z",
  "completed_at": "2026-10-28T18:48:02.095154Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/1e1d14c0-7d3b-435d-80f7-e1df9236a42e` → **200**

```json
{
  "id": "1e1d14c0-7d3b-435d-80f7-e1df9236a42e",
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
    "id": "ed556139-6a90-4af5-9596-3eb224ff115a",
    "order_id": "1e1d14c0-7d3b-435d-80f7-e1df9236a42e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6806e267-0de8-4a9b-8a5f-3226330d4e4a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T18:47:59.792348Z",
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
  "session_id": "a3eeaf7b-7a95-4bca-b3d3-7316f4ef95c6",
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
  "last_heartbeat_at": "2026-10-28T18:47:58.059542Z",
  "last_location_at": "2026-10-28T18:47:58.059542Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a3eeaf7b-7a95-4bca-b3d3-7316f4ef95c6/close` → **200**

```json
{
  "command_id": "58a58801-8134-49b6-8aee-a57958f7adf2",
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
  "session_id": "03cf3acc-6f01-4aa0-9849-91366e9c9e3e",
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
  "last_heartbeat_at": "2026-10-28T18:48:01.198401Z",
  "last_location_at": "2026-10-28T18:48:01.198401Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/03cf3acc-6f01-4aa0-9849-91366e9c9e3e/close` → **200**

```json
{
  "command_id": "2603d380-1baa-4e40-9bca-2e7aecb37a02",
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

Done: terminal order 1e1d14c0-7d3b-435d-80f7-e1df9236a42e by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4735"
}
```

```json
{
  "challenge_id": "3b4d7800-18f0-4db5-a573-8d11cceb9397",
  "expires_at": "2026-10-28T18:53:07.106595181Z",
  "resend_available_at": "2026-10-28T18:48:08.106595181Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "461078",
  "sent_at": "2026-10-28T18:48:07.108924497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b4d7800-18f0-4db5-a573-8d11cceb9397",
  "code": "461078",
  "device_ref": "sandbox-4735"
}
```

```json
{
  "session_id": "a5e17fbe-43f0-4ee2-be64-c9cbea8f5a84",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDE4NywiaWF0IjoxNzkzMjEzMjg3LCJqdGkiOiI4MTAyYTQ3Mi1hNDQxLTQ5MDAtOTViOS0wOTA2YzIzNTdiMWEiLCJzaWQiOiJhNWUxN2ZiZS00M2YwLTRlZTItYmU2NC1jOWNiZWE4ZjVhODQifQ.tNRJ0-1usCDaaUSod59Lk56dHX5fO8nRV7LfQ-FzSTU",
  "access_expires_at": "2026-10-28T19:03:07.404296232Z",
  "refresh_token": "cy48OX-Nq63OuGuwqD1KsipTwgm9R1hHUFzpyFhWy-w",
  "refresh_expires_at": "2026-11-27T18:48:07.403771873Z",
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
  "device_ref": "sandbox-31288"
}
```

```json
{
  "challenge_id": "01a869d2-661f-4392-9998-2a594c470b46",
  "expires_at": "2026-10-28T18:53:07.944389297Z",
  "resend_available_at": "2026-10-28T18:48:08.944389297Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "067481",
  "sent_at": "2026-10-28T18:48:07.946405892Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01a869d2-661f-4392-9998-2a594c470b46",
  "code": "067481",
  "device_ref": "sandbox-31288"
}
```

```json
{
  "session_id": "4d28af49-01ee-4348-977a-cbd8032a5abe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDE4OCwiaWF0IjoxNzkzMjEzMjg4LCJqdGkiOiI3ZmI5MmQyYy1hZDRlLTQyMjItOGU1ZS0yNmViMWYzYmEwODYiLCJzaWQiOiI0ZDI4YWY0OS0wMWVlLTQzNDgtOTc3YS1jYmQ4MDMyYTVhYmUifQ.sT2l4Sj2lecVrpF6LX1LV_UQw41l_rCycToLMSpX7Y0",
  "access_expires_at": "2026-10-28T19:03:08.240018795Z",
  "refresh_token": "Npfu-i9yb7uQqzFVBRJqzbw8Za-AWiw8eDubbp8fOxQ",
  "refresh_expires_at": "2026-11-27T18:48:08.239514997Z",
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
  "device_ref": "sandbox-7431"
}
```

```json
{
  "challenge_id": "c026a548-afec-46e4-87bf-420b61c479a8",
  "expires_at": "2026-10-28T18:53:08.781728577Z",
  "resend_available_at": "2026-10-28T18:48:09.781728577Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "999756",
  "sent_at": "2026-10-28T18:48:08.783747121Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c026a548-afec-46e4-87bf-420b61c479a8",
  "code": "999756",
  "device_ref": "sandbox-7431"
}
```

```json
{
  "session_id": "a295c5fc-2d17-4e38-8dbb-77af2ae9f7a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNDE4OSwiaWF0IjoxNzkzMjEzMjg5LCJqdGkiOiI0ODYwNmU1OC00Zjg5LTQwNjEtYjE5OS03NDliOGZiZDliNWQiLCJzaWQiOiJhMjk1YzVmYy0yZDE3LTRlMzgtOGRiYi03N2FmMmFlOWY3YTgifQ.96-SFLDw97iUttvEjtzcQvgyQWOmswPTX-OJl_7SgAk",
  "access_expires_at": "2026-10-28T19:03:09.080898951Z",
  "refresh_token": "QFw2MgIheudxJmf6dHHTPN5B4IM4SmuEaN18K1-XJbM",
  "refresh_expires_at": "2026-11-27T18:48:09.080355103Z",
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
  "phone": "+380698482368",
  "device_ref": "sandbox-21674"
}
```

```json
{
  "challenge_id": "4b6e2132-4329-4934-8645-cc9f31b6b73d",
  "expires_at": "2026-10-28T18:53:09.613919849Z",
  "resend_available_at": "2026-10-28T18:48:10.613919849Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380698482368` → **200**

```json
{
  "phone": "+380698482368",
  "audience": "CLIENT",
  "code": "707178",
  "sent_at": "2026-10-28T18:48:09.61589592Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b6e2132-4329-4934-8645-cc9f31b6b73d",
  "code": "707178",
  "device_ref": "sandbox-21674"
}
```

```json
{
  "session_id": "4581c864-6b4e-4daf-a8c2-67f154bb313a",
  "subject": {
    "type": "CLIENT",
    "id": "f3c9b0eb-0540-491e-ac11-06b765d5e951"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmM2M5YjBlYi0wNTQwLTQ5MWUtYWMxMS0wNmI3NjVkNWU5NTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE0MTg5LCJpYXQiOjE3OTMyMTMyODksImp0aSI6ImViZDllZDRjLTU2NDEtNDZmZi05Y2I2LWRlNmE5MzRjOTU2OSIsInNpZCI6IjQ1ODFjODY0LTZiNGUtNGRhZi1hOGMyLTY3ZjE1NGJiMzEzYSJ9.0vjhbfKdrnWaFEDUAw3YzR5SDwmR3uxYDlR_QIIizpU",
  "access_expires_at": "2026-10-28T19:03:09.912890298Z",
  "refresh_token": "44vCJx5ZjioZfB8nplbrzsuxSwMUNNtc3HjpdIW3xDg",
  "refresh_expires_at": "2026-11-27T18:48:09.912368138Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6c81dc9e-2f02-4a3f-8b1f-3db17f7ad40c",
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
  "id": "3ba88918-a417-4f00-8a4a-e844a978efba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T18:53:10.186712Z",
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
  "command_id": "4d08ae98-562c-4f54-b675-737d7c1f40db",
  "quote_id": "3ba88918-a417-4f00-8a4a-e844a978efba",
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
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
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
  "blizz_orders_total": 24,
  "blizz_orders_cancelled_total": 13,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 15,
  "blizz_dispatch_assigned_seconds_count": 14,
  "blizz_offers_total": 17,
  "blizz_dispatch_excluded_total": 7,
  "blizz_sms_sent_total": 64
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 14
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 11.772631798
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 2.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 15
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.126100275
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 14.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 16.0
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 57.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/ab4233a8-a758-4c38-af88-7ace469be3a6` → **200**

```json
{
  "id": "ab4233a8-a758-4c38-af88-7ace469be3a6",
  "short_number": 24,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f3c9b0eb-0540-491e-ac11-06b765d5e951",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T18:48:10.466185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
