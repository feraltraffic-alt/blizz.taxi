# Sandbox transcript (2026-10-27T20:20:04Z, d53a177)

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
  "correlation_id": "c9615fcf-d496-4f3f-b908-1cbcf04486e1"
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
  "session_id": "5fb10584-0fd8-4ff8-b5aa-f949f8b11f31",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzMDUsImlhdCI6MTc5MzEzMjQwNSwianRpIjoiOGU2NjkxOTctMzIwOC00NTgyLWFhY2QtOWRhNTMxYzkwMDU3Iiwic2lkIjoiNWZiMTA1ODQtMGZkOC00ZmY4LWI1YWEtZjk0OWY4YjExZjMxIn0.SlwOlVm4Rf-oF6mW-gnC2_WyS3_eB8nAg61fsPufhKI",
  "access_expires_at": "2026-10-27T20:35:05.142199884Z",
  "refresh_token": "VvwazOP3b2p1Eq2KaO6CCr3Bk-9quG5hGrf6QuuKOrU",
  "refresh_expires_at": "2026-10-28T08:20:05.140672614Z",
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
  "session_id": "1e1b22c5-d4e8-4655-8cbf-de8590e0dcd9",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzMDYsImlhdCI6MTc5MzEzMjQwNiwianRpIjoiOTBiMGI1NjUtOTQyZi00MzY0LTg5ODgtMWZjMzllNzdhZTcxIiwic2lkIjoiMWUxYjIyYzUtZDRlOC00NjU1LThjYmYtZGU4NTkwZTBkY2Q5In0.RqA5dhrA_64sBqkVXnZDkpbSMusXlqmQbgEsBC_dxTo",
  "access_expires_at": "2026-10-27T20:35:06.03307675Z",
  "refresh_token": "9lkkuA0a6C205jTnsmErgfwvnnVnTo22p6P7ejTVk5Y",
  "refresh_expires_at": "2026-10-28T08:20:06.032291617Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "07779876-a6ba-422f-9f61-b12c0cf7f715",
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
  "id": "b95453c3-9fa4-49bc-87d7-317ada8e99cd",
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
  "created_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
  "created_at": "2026-10-27T20:20:06.088276Z",
  "updated_at": "2026-10-27T20:20:06.088276Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639038452",
  "device_ref": "sandbox-2176"
}
```

```json
{
  "challenge_id": "1ef2479c-8db0-4a70-b4d7-39523839c910",
  "expires_at": "2026-10-27T20:25:06.126253081Z",
  "resend_available_at": "2026-10-27T20:20:07.126253081Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639038452` → **200**

```json
{
  "phone": "+380639038452",
  "audience": "CLIENT",
  "code": "091449",
  "sent_at": "2026-10-27T20:20:06.141151812Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ef2479c-8db0-4a70-b4d7-39523839c910",
  "code": "091449",
  "device_ref": "sandbox-2176"
}
```

```json
{
  "session_id": "68a552c8-b334-4cad-b1a4-c173c76dabfc",
  "subject": {
    "type": "CLIENT",
    "id": "5b19603b-9200-4434-b1ff-925c9687201e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YjE5NjAzYi05MjAwLTQ0MzQtYjFmZi05MjVjOTY4NzIwMWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzA2LCJpYXQiOjE3OTMxMzI0MDYsImp0aSI6IjgyZmEwN2VlLTYyMTItNDgxMC04NjBjLTNjYTA3YjY1M2QzOSIsInNpZCI6IjY4YTU1MmM4LWIzMzQtNGNhZC1iMWE0LWMxNzNjNzZkYWJmYyJ9.WhpggYcU5xDc1_iKgr7fEsN5hY4GD2eButJPPPsfHyY",
  "access_expires_at": "2026-10-27T20:35:06.205210877Z",
  "refresh_token": "06i43y6qKx28XOe-AI8HM7LnAg6P2EcsZivH6EqZu3c",
  "refresh_expires_at": "2026-11-26T20:20:06.204455343Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639038452` → **200**

```json
{
  "client_id": "5b19603b-9200-4434-b1ff-925c9687201e"
}
```

`POST /api/admin/v1/rider-wallets/5b19603b-9200-4434-b1ff-925c9687201e/top-ups` → **201**

```json
{
  "command_id": "23d0f796-6243-4ccc-93bf-c18851e1c0a9",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "5b19603b-9200-4434-b1ff-925c9687201e",
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
      "id": "e75df9f0-c534-47fe-b9ba-ed7764635ee9",
      "at": "2026-10-27T20:20:06.269281Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d7a15cf-adcf-44f7-ab84-547e1a790690",
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
  "id": "a55ca04e-171e-4e49-b044-4d7859452389",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:25:06.437707Z",
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
      "id": "b95453c3-9fa4-49bc-87d7-317ada8e99cd",
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
  "device_ref": "sandbox-8847"
}
```

```json
{
  "challenge_id": "a885abbb-1ce8-4f27-b006-005d664dd396",
  "expires_at": "2026-10-27T20:25:06.482270357Z",
  "resend_available_at": "2026-10-27T20:20:07.482270357Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "415375",
  "sent_at": "2026-10-27T20:20:06.485148987Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a885abbb-1ce8-4f27-b006-005d664dd396",
  "code": "415375",
  "device_ref": "sandbox-8847"
}
```

```json
{
  "session_id": "c885ea15-6762-4d40-a89d-b0e18b03967e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzMwNiwiaWF0IjoxNzkzMTMyNDA2LCJqdGkiOiI3MmMwMjlkYi1iZjcxLTQxNzUtOTllYi1hYjczNzFiNDk2YzEiLCJzaWQiOiJjODg1ZWExNS02NzYyLTRkNDAtYTg5ZC1iMGUxOGIwMzk2N2UifQ.WZdyxPQ0Z_D-8_Hf88Xc1e5we9jLow_l3TMGzKl9pZY",
  "access_expires_at": "2026-10-27T20:35:06.541214176Z",
  "refresh_token": "ETgkDo5jM4OwB-AroN0H30pBReU1Y1rVHU8JicnSoeg",
  "refresh_expires_at": "2026-11-26T20:20:06.540368778Z",
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
  "command_id": "48a33474-e1df-4fa3-97f1-2f76d3f89293",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:06Z",
    "sequence": 1793132406592
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dfd3ff26-bc17-4ccf-997c-e39f7aa5a808",
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
  "last_heartbeat_at": "2026-10-27T20:20:06.622774Z",
  "last_location_at": "2026-10-27T20:20:06.622774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "66597993-eb81-454f-9935-a04c01b89002",
  "quote_id": "a55ca04e-171e-4e49-b044-4d7859452389",
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
  "id": "3173c039-c167-4887-bdb1-dc7f189f3cde",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5b19603b-9200-4434-b1ff-925c9687201e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-27T20:20:06.684998Z",
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
  "client_id": "5b19603b-9200-4434-b1ff-925c9687201e",
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
      "id": "e75df9f0-c534-47fe-b9ba-ed7764635ee9",
      "at": "2026-10-27T20:20:06.269281Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
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
    "id": "f67dd08b-ad90-4a40-aad5-f6e1fbc85b74",
    "order_id": "3173c039-c167-4887-bdb1-dc7f189f3cde",
    "expires_at": "2026-10-27T20:20:21.695286Z",
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

`POST /api/driver/v1/offers/f67dd08b-ad90-4a40-aad5-f6e1fbc85b74/accept` → **200**

```json
{
  "command_id": "31f56621-ad06-49a5-993f-29d33da41343"
}
```

```json
{
  "id": "089e4e4a-7532-47ef-ad69-355eb5475908",
  "order_id": "3173c039-c167-4887-bdb1-dc7f189f3cde",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "59053402-d322-492d-b623-25a9a29963c7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "59053402-d322-492d-b623-25a9a29963c7",
  "order_id": "3173c039-c167-4887-bdb1-dc7f189f3cde",
  "assignment_id": "089e4e4a-7532-47ef-ad69-355eb5475908",
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

`POST /api/driver/v1/work-sessions/dfd3ff26-bc17-4ccf-997c-e39f7aa5a808/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:06Z",
    "sequence": 1793132406833
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dfd3ff26-bc17-4ccf-997c-e39f7aa5a808",
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
  "last_heartbeat_at": "2026-10-27T20:20:06.853518Z",
  "last_location_at": "2026-10-27T20:20:06.853518Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/59053402-d322-492d-b623-25a9a29963c7/arrive` → **200**

```json
{
  "command_id": "40e8cd59-d6fd-4ff1-b1c8-741af66c9dfc",
  "expected_version": 0
}
```

```json
{
  "id": "59053402-d322-492d-b623-25a9a29963c7",
  "order_id": "3173c039-c167-4887-bdb1-dc7f189f3cde",
  "assignment_id": "089e4e4a-7532-47ef-ad69-355eb5475908",
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
  "arrived_at": "2026-10-27T20:20:06.891291Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/59053402-d322-492d-b623-25a9a29963c7/start` → **200**

```json
{
  "command_id": "56aa9fe0-696e-4df6-b762-49cb0d4582f4",
  "expected_version": 1
}
```

```json
{
  "id": "59053402-d322-492d-b623-25a9a29963c7",
  "order_id": "3173c039-c167-4887-bdb1-dc7f189f3cde",
  "assignment_id": "089e4e4a-7532-47ef-ad69-355eb5475908",
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
  "arrived_at": "2026-10-27T20:20:06.891291Z",
  "started_at": "2026-10-27T20:20:06.926218Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/59053402-d322-492d-b623-25a9a29963c7/complete` → **200**

```json
{
  "command_id": "c6919cb3-2fb1-43b8-907c-684b66428c1d",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:20:06Z",
  "cash_received": true
}
```

```json
{
  "id": "59053402-d322-492d-b623-25a9a29963c7",
  "order_id": "3173c039-c167-4887-bdb1-dc7f189f3cde",
  "assignment_id": "089e4e4a-7532-47ef-ad69-355eb5475908",
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
  "arrived_at": "2026-10-27T20:20:06.891291Z",
  "started_at": "2026-10-27T20:20:06.926218Z",
  "completed_at": "2026-10-27T20:20:06.979494Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5b19603b-9200-4434-b1ff-925c9687201e",
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
      "id": "1bd0869e-4312-4521-a317-3b5f7dfba366",
      "at": "2026-10-27T20:20:07.318703Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "3173c039-c167-4887-bdb1-dc7f189f3cde"
    },
    {
      "id": "e75df9f0-c534-47fe-b9ba-ed7764635ee9",
      "at": "2026-10-27T20:20:06.269281Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/b95453c3-9fa4-49bc-87d7-317ada8e99cd/archive` → **200**

```json
{
  "command_id": "7f5424a0-7684-428a-941f-6b04a50e69da",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "b95453c3-9fa4-49bc-87d7-317ada8e99cd",
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
  "created_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
  "created_at": "2026-10-27T20:20:06.088276Z",
  "updated_at": "2026-10-27T20:20:10.052024Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dfd3ff26-bc17-4ccf-997c-e39f7aa5a808",
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
  "last_heartbeat_at": "2026-10-27T20:20:06.853518Z",
  "last_location_at": "2026-10-27T20:20:06.853518Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dfd3ff26-bc17-4ccf-997c-e39f7aa5a808/close` → **200**

```json
{
  "command_id": "363d3d6c-4621-413e-b936-9b3abbbd433e",
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

Done: order 3173c039-c167-4887-bdb1-dc7f189f3cde.

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
  "session_id": "3290a0d7-d2bf-4fc6-b6f2-6b2efaaf00d7",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzMTAsImlhdCI6MTc5MzEzMjQxMCwianRpIjoiNWE3NDEzOWQtZjhlYS00MzI4LTkyZTYtM2UzMTZkYzE2NDZkIiwic2lkIjoiMzI5MGEwZDctZDJiZi00ZmM2LWI2ZjItNmIyZWZhYWYwMGQ3In0.WBTpgp7vzL85EpAUSS0_4yKXX-xFEPd5W7uh-Gp68CA",
  "access_expires_at": "2026-10-27T20:35:10.351722891Z",
  "refresh_token": "Dmgsng86MVHvuApHh6y0d7gdwGvp0ou2ZENC6B5D6DY",
  "refresh_expires_at": "2026-10-28T08:20:10.351158901Z",
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
  "command_id": "85de8fe4-3454-4208-b428-b1a883961d13",
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
  "session_id": "b7b4b384-eb83-4eac-98e9-c1d6de2792da",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzMTAsImlhdCI6MTc5MzEzMjQxMCwianRpIjoiN2RjMDQwZjYtNDI0ZS00NzM3LWE2NzItMTY5NTUxZmQxODI5Iiwic2lkIjoiYjdiNGIzODQtZWI4My00ZWFjLTk4ZTktYzFkNmRlMjc5MmRhIn0.oSBtDubUfGHBq2LOoWa74FyQp3eTel_IsfJFY690ZSs",
  "access_expires_at": "2026-10-27T20:35:10.646142251Z",
  "refresh_token": "JeyUZeNmVSdbRfeYyWh4qxXvCvOSPro4qcv8hvNNt1I",
  "refresh_expires_at": "2026-10-28T08:20:10.645682288Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2437023579",
    "linkedid": "1730052700.2437023579",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671382761"
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
    "id": "1730052700.2437023579",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "9e64121b-a86c-4677-a1ac-4096f60155cc",
      "state": "MISSED",
      "caller_phone": "+380671382761",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-27T20:20:10.669675Z",
      "answered_at": null,
      "ended_at": "2026-10-27T20:20:10.688566Z",
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
    "id": "1730052600.3157223264",
    "linkedid": "1730052600.3157223264",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671382761"
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
      "id": "edf05d21-973d-4f65-aa17-5917bdcc0115",
      "state": "RINGING",
      "caller_phone": "+380671382761",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-27T20:20:10.741669Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/edf05d21-973d-4f65-aa17-5917bdcc0115/answer` → **200**

```json
{
  "command_id": "2463b5db-3796-46d8-b6f6-b54f564fee30"
}
```

```json
{
  "id": "edf05d21-973d-4f65-aa17-5917bdcc0115",
  "state": "ANSWERED",
  "caller_phone": "+380671382761",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
  "order_ids": [],
  "started_at": "2026-10-27T20:20:10.741669Z",
  "answered_at": "2026-10-27T20:20:10.799044Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.3157223264",
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
    "id": "1730052600.3157223264",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "edf05d21-973d-4f65-aa17-5917bdcc0115",
      "state": "ENDED",
      "caller_phone": "+380671382761",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
      "order_ids": [],
      "started_at": "2026-10-27T20:20:10.741669Z",
      "answered_at": "2026-10-27T20:20:10.799044Z",
      "ended_at": "2026-10-27T20:20:10.841562Z",
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
      "id": "edf05d21-973d-4f65-aa17-5917bdcc0115",
      "state": "ENDED",
      "caller_phone": "+380671382761",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
      "order_ids": [],
      "started_at": "2026-10-27T20:20:10.741669Z",
      "answered_at": "2026-10-27T20:20:10.799044Z",
      "ended_at": "2026-10-27T20:20:10.841562Z",
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
      "id": "edf05d21-973d-4f65-aa17-5917bdcc0115",
      "state": "ENDED",
      "caller_phone": "+380671382761",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
      "order_ids": [],
      "started_at": "2026-10-27T20:20:10.741669Z",
      "answered_at": "2026-10-27T20:20:10.799044Z",
      "ended_at": "2026-10-27T20:20:10.841562Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-27T20:20:13.212047Z"
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
      "id": "edf05d21-973d-4f65-aa17-5917bdcc0115",
      "state": "ENDED",
      "caller_phone": "+380671382761",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
      "order_ids": [],
      "started_at": "2026-10-27T20:20:10.741669Z",
      "answered_at": "2026-10-27T20:20:10.799044Z",
      "ended_at": "2026-10-27T20:20:10.841562Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-27T20:20:13.212047Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/edf05d21-973d-4f65-aa17-5917bdcc0115/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/edf05d21-973d-4f65-aa17-5917bdcc0115/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=edf05d21-973d-4f65-aa17-5917bdcc0115` → **200**

```json
{
  "changes": [
    {
      "id": "3a75992a-9830-45d6-b49e-9fc06ddb6b16",
      "occurred_at": "2026-10-27T20:20:14.990216Z",
      "actor_type": "STAFF",
      "actor_id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "edf05d21-973d-4f65-aa17-5917bdcc0115",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"7164a2ab-1287-4324-b78d-52bbcc655104\", \"order_ids\": []}",
      "correlation_id": "4a7a6eb2-eee1-4a81-a734-8822ea8ae3af"
    },
    {
      "id": "9a5bfdd4-3c14-490e-bd64-9745e30c2e1c",
      "occurred_at": "2026-10-27T20:20:14.965971Z",
      "actor_type": "STAFF",
      "actor_id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "edf05d21-973d-4f65-aa17-5917bdcc0115",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"7164a2ab-1287-4324-b78d-52bbcc655104\", \"order_ids\": []}",
      "correlation_id": "4bc766e7-fba8-46b3-b9e8-e03c3a2e9bdf"
    }
  ]
}
```

Done: call edf05d21-973d-4f65-aa17-5917bdcc0115 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630106826",
  "device_ref": "sandbox-2814"
}
```

```json
{
  "challenge_id": "7aff502d-17ce-4402-9052-9b1baf3b2a0d",
  "expires_at": "2026-10-27T20:25:15.046096842Z",
  "resend_available_at": "2026-10-27T20:20:16.046096842Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630106826` → **200**

```json
{
  "phone": "+380630106826",
  "audience": "CLIENT",
  "code": "515045",
  "sent_at": "2026-10-27T20:20:15.048437918Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7aff502d-17ce-4402-9052-9b1baf3b2a0d",
  "code": "515045",
  "device_ref": "sandbox-2814"
}
```

```json
{
  "session_id": "3e143365-e103-4588-af63-d6e3a908c118",
  "subject": {
    "type": "CLIENT",
    "id": "23222967-452f-47db-bf63-53e967ab8cda"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMzIyMjk2Ny00NTJmLTQ3ZGItYmY2My01M2U5NjdhYjhjZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzE1LCJpYXQiOjE3OTMxMzI0MTUsImp0aSI6ImRiYWU3NjJlLWUwY2QtNDQyNC04YmIwLTM5OWVkOWEwMzFhOSIsInNpZCI6IjNlMTQzMzY1LWUxMDMtNDU4OC1hZjYzLWQ2ZTNhOTA4YzExOCJ9.PaPEp2W8a1ZCUV4KpYKroQvQ-na7U8rG4bcVukJlWvY",
  "access_expires_at": "2026-10-27T20:35:15.099754157Z",
  "refresh_token": "flsZrleWOXAIM5ozJ6L8P_HCV6lsPAWXZXCtsIqiQ38",
  "refresh_expires_at": "2026-11-26T20:20:15.099161365Z",
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
  "device_ref": "sandbox-22153"
}
```

```json
{
  "challenge_id": "40276675-88ac-4dd9-a4cf-a18622a46395",
  "expires_at": "2026-10-27T20:25:15.142211334Z",
  "resend_available_at": "2026-10-27T20:20:16.142211334Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "244812",
  "sent_at": "2026-10-27T20:20:15.14452593Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40276675-88ac-4dd9-a4cf-a18622a46395",
  "code": "244812",
  "device_ref": "sandbox-22153"
}
```

```json
{
  "session_id": "328e7e38-3963-4431-8a56-65e58699b0b4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzMxNSwiaWF0IjoxNzkzMTMyNDE1LCJqdGkiOiIxYWIxZTllYS05NjA2LTQ4MmUtYjFmYi02NmE2MDc4ZThjMjAiLCJzaWQiOiIzMjhlN2UzOC0zOTYzLTQ0MzEtOGE1Ni02NWU1ODY5OWIwYjQifQ.N6cwxViPcUTmbjBfNGsk9dvY40AztF3EOTpFEUW8k_M",
  "access_expires_at": "2026-10-27T20:35:15.189508871Z",
  "refresh_token": "4fCLP66Um_43MiDo1B_hPaGhv9JP4cmMmYSUcMv7_54",
  "refresh_expires_at": "2026-11-26T20:20:15.189008517Z",
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
  "session_id": "c5fbcf12-c3eb-4bb4-b37f-4d292cfda2f3",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzMTUsImlhdCI6MTc5MzEzMjQxNSwianRpIjoiNTY1YmJlM2EtMDdmZS00M2QzLThkNDQtMTYzNTI2OGY1OGZiIiwic2lkIjoiYzVmYmNmMTItYzNlYi00YmI0LWIzN2YtNGQyOTJjZmRhMmYzIn0.wqCqYoM1_TNgFtkJqkl1N7lPbherVzg2zv8a0li_oUo",
  "access_expires_at": "2026-10-27T20:35:15.425389169Z",
  "refresh_token": "eB-9meLfPgXUGu6tlJ4F3sUZHe2mYAOPKgrCVLOcRfw",
  "refresh_expires_at": "2026-10-28T08:20:15.424938781Z",
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
  "session_id": "9925607f-221e-47f4-a1bf-f280db76adcf",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzMTUsImlhdCI6MTc5MzEzMjQxNSwianRpIjoiOTYyYWM0NTUtODhjYi00OTAyLWIzYjEtYjMzYjYyZDc2MmU4Iiwic2lkIjoiOTkyNTYwN2YtMjIxZS00N2Y0LWExYmYtZjI4MGRiNzZhZGNmIn0.7lkF6gsM4TU3vuX_OBwWNXEFObOhVMJC0YgrpsTQS5w",
  "access_expires_at": "2026-10-27T20:35:15.645054755Z",
  "refresh_token": "8PnLglyy3gNDJ7zCcxY3SzbNKwXPBM74cCnJKQT2LhE",
  "refresh_expires_at": "2026-10-28T08:20:15.644612028Z",
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
  "command_id": "3cc9b6ce-96d3-46c0-a402-de97f970d263",
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
  "id": "ed508e83-4c86-4f9b-83b6-75d9a9bcf53e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T20:25:15.694134Z",
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
  "command_id": "6a74257a-7ba3-4718-bf80-e1281dcf8779",
  "quote_id": "ed508e83-4c86-4f9b-83b6-75d9a9bcf53e",
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
  "id": "67efc0f8-e5c5-4fd0-955f-6a0044028409",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23222967-452f-47db-bf63-53e967ab8cda",
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
  "created_at": "2026-10-27T20:20:15.725581Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/67efc0f8-e5c5-4fd0-955f-6a0044028409` → **200**

```json
{
  "id": "67efc0f8-e5c5-4fd0-955f-6a0044028409",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23222967-452f-47db-bf63-53e967ab8cda",
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
  "created_at": "2026-10-27T20:20:15.725581Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/67efc0f8-e5c5-4fd0-955f-6a0044028409/cancel` → **200**

```json
{
  "command_id": "cb017d2f-6de3-4cf4-ab7c-7de4ecde7f74",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "67efc0f8-e5c5-4fd0-955f-6a0044028409",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "23222967-452f-47db-bf63-53e967ab8cda",
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
  "created_at": "2026-10-27T20:20:15.725581Z",
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
  "command_id": "8abc8435-587f-426d-8161-93b57a752551",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:15Z",
    "sequence": 1793132415836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ae45b7db-3352-475d-89ff-57eeeab8897d",
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
  "last_heartbeat_at": "2026-10-27T20:20:15.85133Z",
  "last_location_at": "2026-10-27T20:20:15.85133Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25093"
}
```

```json
{
  "challenge_id": "c517b9fa-57db-4b48-bea0-f95b32cc0ccb",
  "expires_at": "2026-10-27T20:25:15.875061067Z",
  "resend_available_at": "2026-10-27T20:20:16.875061067Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "010685",
  "sent_at": "2026-10-27T20:20:15.87971412Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c517b9fa-57db-4b48-bea0-f95b32cc0ccb",
  "code": "010685",
  "device_ref": "sandbox-25093"
}
```

```json
{
  "session_id": "cb06aa88-7114-4205-8473-d81bfc353d5f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzMxNSwiaWF0IjoxNzkzMTMyNDE1LCJqdGkiOiIzZGE2ZDNhYy1jYWU0LTRlZjMtOTI1OC1lMzM5NDEyMTA3MWQiLCJzaWQiOiJjYjA2YWE4OC03MTE0LTQyMDUtODQ3My1kODFiZmMzNTNkNWYifQ.rW2ZOOr4VMrCtOzVVZUug8mc1LR0zzPrJotxDrluuak",
  "access_expires_at": "2026-10-27T20:35:15.924255409Z",
  "refresh_token": "wtI1m7SFOPfRUwFQ2OSWVnaYfQ59KZ-DgaxR83gTebM",
  "refresh_expires_at": "2026-11-26T20:20:15.923800644Z",
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
  "command_id": "c8f3fee9-e36c-42f8-80bc-e41bbdb37f72",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:15Z",
    "sequence": 1793132415963
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "107373df-b6d3-4dd7-9fc0-cf4c9fcad391",
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
  "last_heartbeat_at": "2026-10-27T20:20:15.978585Z",
  "last_location_at": "2026-10-27T20:20:15.978585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "44433a00-440a-4e9d-aec7-dad4449bdc7f",
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
  "id": "2267a1ea-d749-4f44-8afe-2a8055cf0532",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T20:25:16.008064Z",
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
  "command_id": "49a7ea99-2bb1-49cb-8629-eded239b3cc1",
  "quote_id": "2267a1ea-d749-4f44-8afe-2a8055cf0532",
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
  "id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23222967-452f-47db-bf63-53e967ab8cda",
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
  "created_at": "2026-10-27T20:20:16.038214Z",
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
    "id": "bb26ed1e-b826-4557-946d-5069047e8744",
    "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
    "expires_at": "2026-10-27T20:20:31.041579Z",
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

`POST /api/driver/v1/offers/bb26ed1e-b826-4557-946d-5069047e8744/accept` → **200**

```json
{
  "command_id": "babed990-689e-4b42-9705-df7fe84c2d42"
}
```

```json
{
  "id": "caafd5ce-cb1e-4dd1-8635-7ac092b766a0",
  "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f3d565ef-f64f-4f7b-80b1-6e8d430b5f39",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f3d565ef-f64f-4f7b-80b1-6e8d430b5f39",
  "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
  "assignment_id": "caafd5ce-cb1e-4dd1-8635-7ac092b766a0",
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

`POST /api/driver/v1/trips/f3d565ef-f64f-4f7b-80b1-6e8d430b5f39/cancel` → **200**

```json
{
  "command_id": "9830fdef-7b21-4dac-b588-becc327b98fe",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "f3d565ef-f64f-4f7b-80b1-6e8d430b5f39",
  "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
  "assignment_id": "caafd5ce-cb1e-4dd1-8635-7ac092b766a0",
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

`GET /api/rider/v1/orders/822bb83c-e9f4-45b3-a607-c78cfbf9a7ee` → **200**

```json
{
  "id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "23222967-452f-47db-bf63-53e967ab8cda",
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
    "id": "caafd5ce-cb1e-4dd1-8635-7ac092b766a0",
    "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f3d565ef-f64f-4f7b-80b1-6e8d430b5f39",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T20:20:16.038214Z",
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
    "id": "af794ac7-be76-4ef2-944a-86521f90ac88",
    "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
    "expires_at": "2026-10-27T20:20:31.151354Z",
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

`POST /api/driver/v1/offers/af794ac7-be76-4ef2-944a-86521f90ac88/accept` → **200**

```json
{
  "command_id": "2fb1e8ef-bd75-4ebf-bf3e-874a68b4a639"
}
```

```json
{
  "id": "c5123879-02dd-4fe6-81b3-d20bb1607130",
  "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c36929cb-d958-4526-adac-e59830ee38ed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c36929cb-d958-4526-adac-e59830ee38ed",
  "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
  "assignment_id": "c5123879-02dd-4fe6-81b3-d20bb1607130",
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

`POST /api/driver/v1/trips/c36929cb-d958-4526-adac-e59830ee38ed/cancel` → **200**

```json
{
  "command_id": "77f6bd6d-5634-4c5e-9595-79b7abd0f0e1",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "c36929cb-d958-4526-adac-e59830ee38ed",
  "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
  "assignment_id": "c5123879-02dd-4fe6-81b3-d20bb1607130",
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
    "id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T20:20:16.038214Z",
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
    "id": "67efc0f8-e5c5-4fd0-955f-6a0044028409",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T20:20:15.725581Z",
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

`GET /api/operator/v1/orders/822bb83c-e9f4-45b3-a607-c78cfbf9a7ee/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T20:20:16.038773Z",
      "actor": {
        "type": "CLIENT",
        "id": "23222967-452f-47db-bf63-53e967ab8cda",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
        "quote_id": "2267a1ea-d749-4f44-8afe-2a8055cf0532",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T20:20:16.040614Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
        "attempt_id": "2ef1d51f-42dc-4a69-a66f-f51173692375",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T20:20:16.045242Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bb26ed1e-b826-4557-946d-5069047e8744",
        "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T20:20:16.092345Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bb26ed1e-b826-4557-946d-5069047e8744",
        "order_id": "822bb83c-e9f4-45b3-a607-c78cfbf9a7ee",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "caafd5ce-cb1e-4dd1-8635-7ac092b766a0"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 67efc0f8-e5c5-4fd0-955f-6a0044028409, 822bb83c-e9f4-45b3-a607-c78cfbf9a7ee.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735311435",
  "device_ref": "sandbox-13032"
}
```

```json
{
  "challenge_id": "3bb54f05-f0e5-4898-b201-3bcb6b1d8fee",
  "expires_at": "2026-10-27T20:25:16.34863887Z",
  "resend_available_at": "2026-10-27T20:20:17.34863887Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735311435` → **200**

```json
{
  "phone": "+380735311435",
  "audience": "CLIENT",
  "code": "282781",
  "sent_at": "2026-10-27T20:20:16.350409687Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3bb54f05-f0e5-4898-b201-3bcb6b1d8fee",
  "code": "282781",
  "device_ref": "sandbox-13032"
}
```

```json
{
  "session_id": "b3483067-00f3-4379-98e8-b6348563469c",
  "subject": {
    "type": "CLIENT",
    "id": "2d63e8e4-6273-4159-bd9d-1c1519872eaf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDYzZThlNC02MjczLTQxNTktYmQ5ZC0xYzE1MTk4NzJlYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzE2LCJpYXQiOjE3OTMxMzI0MTYsImp0aSI6IjViZTgxOWJlLTcxYzEtNDkyNS1iZWE5LThhMmNmY2VmZDg1MCIsInNpZCI6ImIzNDgzMDY3LTAwZjMtNDM3OS05OGU4LWI2MzQ4NTYzNDY5YyJ9.Bpfzq5P0ybcCAXm_eDm3A0nprs1sQawDnC5euH5pjbU",
  "access_expires_at": "2026-10-27T20:35:16.401002927Z",
  "refresh_token": "0ht3WxBk1lGys76sfkXo5geZkdDI9kzGhZaisSCzEKU",
  "refresh_expires_at": "2026-11-26T20:20:16.400523645Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "01e4a75d-9325-477b-9050-413ead95b60d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "be2fe40c-c289-4eb4-ba94-5490bd756863",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-be2fe40c-c289-4eb4-ba94-5490bd756863",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "49e418503125b2dd566a4695cfd79456",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=be2fe40c-c289-4eb4-ba94-5490bd756863",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735311435"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=be2fe40c-c289-4eb4-ba94-5490bd756863",
  "expires_at": "2026-10-27T20:50:16.441298Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/be2fe40c-c289-4eb4-ba94-5490bd756863` → **200**

```json
{
  "id": "be2fe40c-c289-4eb4-ba94-5490bd756863",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T20:50:16.441298Z",
  "card": {
    "id": "af3b95ef-4ba7-4a8d-85ec-ec55912f8da0",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8996",
    "card_type": "Visa",
    "created_at": "2026-10-27T20:20:16.477291Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "af3b95ef-4ba7-4a8d-85ec-ec55912f8da0",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8996",
      "card_type": "Visa",
      "created_at": "2026-10-27T20:20:16.477291Z"
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
  "device_ref": "sandbox-5064"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "b9767cb3-5c1d-48fd-9d3c-12682f15f11d",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5064"
}
```

```json
{
  "challenge_id": "74002f6c-2f59-4f03-84d4-803df980df3b",
  "expires_at": "2026-10-27T20:25:17.565930147Z",
  "resend_available_at": "2026-10-27T20:20:18.565930147Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "714737",
  "sent_at": "2026-10-27T20:20:17.567652581Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74002f6c-2f59-4f03-84d4-803df980df3b",
  "code": "714737",
  "device_ref": "sandbox-5064"
}
```

```json
{
  "session_id": "0773984a-3c3e-4bef-b9a8-07c30d580313",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzMxNywiaWF0IjoxNzkzMTMyNDE3LCJqdGkiOiI0MTJhNGM5Zi05YzVmLTRkYzktYTA4YS0yYzJkYTZlZGVhNjQiLCJzaWQiOiIwNzczOTg0YS0zYzNlLTRiZWYtYjlhOC0wN2MzMGQ1ODAzMTMifQ.AYIA4mMbg8JvdZIdrQScjFMgyUm3LcmIpfzRVTbi3Zc",
  "access_expires_at": "2026-10-27T20:35:17.608977263Z",
  "refresh_token": "S40WlC2cgDdjtsqKpbqMdwnjHtfqen3DMvSBXsRoAjY",
  "refresh_expires_at": "2026-11-26T20:20:17.608632223Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "107373df-b6d3-4dd7-9fc0-cf4c9fcad391",
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
  "last_heartbeat_at": "2026-10-27T20:20:15.978585Z",
  "last_location_at": "2026-10-27T20:20:15.978585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/107373df-b6d3-4dd7-9fc0-cf4c9fcad391/handover` → **200**

```json
{
  "command_id": "84129845-9aee-444d-8803-113a42ef6304",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "107373df-b6d3-4dd7-9fc0-cf4c9fcad391",
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
  "last_heartbeat_at": "2026-10-27T20:20:15.978585Z",
  "last_location_at": "2026-10-27T20:20:15.978585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/107373df-b6d3-4dd7-9fc0-cf4c9fcad391/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:17Z",
    "sequence": 1793132417677
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "107373df-b6d3-4dd7-9fc0-cf4c9fcad391",
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
  "last_heartbeat_at": "2026-10-27T20:20:17.693824Z",
  "last_location_at": "2026-10-27T20:20:17.693824Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c9edd5f6-ba5b-4fd6-89e7-9491aebec206",
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
  "id": "6cefe0ea-33e5-433d-be6e-31d8efdaedab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T20:25:17.725235Z",
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
  "command_id": "a4811665-abae-4937-a123-dcbef46d00cb",
  "quote_id": "6cefe0ea-33e5-433d-be6e-31d8efdaedab",
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
  "id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2d63e8e4-6273-4159-bd9d-1c1519872eaf",
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
  "created_at": "2026-10-27T20:20:17.756974Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/498989d2-f1ed-4441-92ca-6d901237d752` → **200**

```json
{
  "id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2d63e8e4-6273-4159-bd9d-1c1519872eaf",
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
  "created_at": "2026-10-27T20:20:17.756974Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/498989d2-f1ed-4441-92ca-6d901237d752` → **200**

```json
{
  "id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2d63e8e4-6273-4159-bd9d-1c1519872eaf",
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
  "created_at": "2026-10-27T20:20:17.756974Z",
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
    "id": "288eaff8-3b34-47b3-b542-aa2e40a3cb34",
    "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
    "expires_at": "2026-10-27T20:20:33.430729Z",
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

`POST /api/driver/v1/offers/288eaff8-3b34-47b3-b542-aa2e40a3cb34/accept` → **200**

```json
{
  "command_id": "38a2539e-a011-41c5-ba20-318a1c0337ec"
}
```

```json
{
  "id": "bb2fbc8b-05b0-43a8-a997-d510a10f19a9",
  "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cc7d83ed-d304-4006-92ba-bcd218602579",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cc7d83ed-d304-4006-92ba-bcd218602579",
  "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "assignment_id": "bb2fbc8b-05b0-43a8-a997-d510a10f19a9",
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

`POST /api/driver/v1/work-sessions/107373df-b6d3-4dd7-9fc0-cf4c9fcad391/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:18Z",
    "sequence": 1793132418892
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "107373df-b6d3-4dd7-9fc0-cf4c9fcad391",
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
  "last_heartbeat_at": "2026-10-27T20:20:18.907042Z",
  "last_location_at": "2026-10-27T20:20:18.907042Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cc7d83ed-d304-4006-92ba-bcd218602579/arrive` → **200**

```json
{
  "command_id": "428be504-e29b-4de0-bbb0-4efcaae02e7b",
  "expected_version": 0
}
```

```json
{
  "id": "cc7d83ed-d304-4006-92ba-bcd218602579",
  "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "assignment_id": "bb2fbc8b-05b0-43a8-a997-d510a10f19a9",
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
  "arrived_at": "2026-10-27T20:20:18.935097Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cc7d83ed-d304-4006-92ba-bcd218602579/start` → **200**

```json
{
  "command_id": "1e2af15c-1483-448d-98ff-e72a188fb912",
  "expected_version": 1
}
```

```json
{
  "id": "cc7d83ed-d304-4006-92ba-bcd218602579",
  "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "assignment_id": "bb2fbc8b-05b0-43a8-a997-d510a10f19a9",
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
  "arrived_at": "2026-10-27T20:20:18.935097Z",
  "started_at": "2026-10-27T20:20:18.968457Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cc7d83ed-d304-4006-92ba-bcd218602579/complete` → **200**

```json
{
  "command_id": "c4b9ff8e-7cbb-4929-b934-76818aecae2a",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:20:18Z"
}
```

```json
{
  "id": "cc7d83ed-d304-4006-92ba-bcd218602579",
  "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "assignment_id": "bb2fbc8b-05b0-43a8-a997-d510a10f19a9",
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
  "arrived_at": "2026-10-27T20:20:18.935097Z",
  "started_at": "2026-10-27T20:20:18.968457Z",
  "completed_at": "2026-10-27T20:20:19.001104Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/498989d2-f1ed-4441-92ca-6d901237d752` → **200**

```json
{
  "id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2d63e8e4-6273-4159-bd9d-1c1519872eaf",
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
    "id": "bb2fbc8b-05b0-43a8-a997-d510a10f19a9",
    "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cc7d83ed-d304-4006-92ba-bcd218602579",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T20:20:17.756974Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/498989d2-f1ed-4441-92ca-6d901237d752` → **200**

```json
{
  "id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2d63e8e4-6273-4159-bd9d-1c1519872eaf",
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
    "id": "bb2fbc8b-05b0-43a8-a997-d510a10f19a9",
    "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cc7d83ed-d304-4006-92ba-bcd218602579",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T20:20:17.756974Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/498989d2-f1ed-4441-92ca-6d901237d752` → **200**

```json
{
  "id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2d63e8e4-6273-4159-bd9d-1c1519872eaf",
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
    "id": "bb2fbc8b-05b0-43a8-a997-d510a10f19a9",
    "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cc7d83ed-d304-4006-92ba-bcd218602579",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T20:20:17.756974Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/498989d2-f1ed-4441-92ca-6d901237d752` → **200**

```json
{
  "id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "2d63e8e4-6273-4159-bd9d-1c1519872eaf",
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
    "id": "bb2fbc8b-05b0-43a8-a997-d510a10f19a9",
    "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cc7d83ed-d304-4006-92ba-bcd218602579",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T20:20:17.756974Z",
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
      "id": "4c456e2a-d049-4848-8524-cc121c61ac0c",
      "at": "2026-10-27T20:20:19.450452Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/498989d2-f1ed-4441-92ca-6d901237d752/tip` → **200**

```json
{
  "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
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
  "available_until": "2026-10-28T20:20:19.001104Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/498989d2-f1ed-4441-92ca-6d901237d752/tip` → **201**

```json
{
  "command_id": "bbbb8ba5-e38e-47d5-81cd-34c3b8d80dba",
  "amount_minor": 2500
}
```

```json
{
  "id": "cc734a7c-02a9-47ec-97fd-3c63e3d771d8",
  "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T20:20:22.200645Z"
}
```

`GET /api/rider/v1/orders/498989d2-f1ed-4441-92ca-6d901237d752/tip` → **200**

```json
{
  "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
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
  "available_until": "2026-10-28T20:20:19.001104Z",
  "open": false,
  "tip": {
    "id": "cc734a7c-02a9-47ec-97fd-3c63e3d771d8",
    "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T20:20:22.200645Z"
  }
}
```

`GET /api/rider/v1/orders/498989d2-f1ed-4441-92ca-6d901237d752/tip` → **200**

```json
{
  "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
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
  "available_until": "2026-10-28T20:20:19.001104Z",
  "open": false,
  "tip": {
    "id": "cc734a7c-02a9-47ec-97fd-3c63e3d771d8",
    "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T20:20:22.200645Z"
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
      "id": "4c456e2a-d049-4848-8524-cc121c61ac0c",
      "at": "2026-10-27T20:20:19.450452Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
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
      "id": "62cdf18b-5d79-48b6-b28d-8f7fd959defb",
      "at": "2026-10-27T20:20:23.496588Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
      "counterpart_id": null
    },
    {
      "id": "4c456e2a-d049-4848-8524-cc121c61ac0c",
      "at": "2026-10-27T20:20:19.450452Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "498989d2-f1ed-4441-92ca-6d901237d752",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "107373df-b6d3-4dd7-9fc0-cf4c9fcad391",
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
  "last_heartbeat_at": "2026-10-27T20:20:18.907042Z",
  "last_location_at": "2026-10-27T20:20:18.907042Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/107373df-b6d3-4dd7-9fc0-cf4c9fcad391/close` → **200**

```json
{
  "command_id": "f060b836-8b19-4616-819e-3770dcdc6fa8",
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

Done: card order 498989d2-f1ed-4441-92ca-6d901237d752.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738791968",
  "device_ref": "sandbox-32111"
}
```

```json
{
  "challenge_id": "898e02a7-7268-4cf1-872c-ebe6bc09f906",
  "expires_at": "2026-10-27T20:25:24.374202247Z",
  "resend_available_at": "2026-10-27T20:20:25.374202247Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738791968` → **200**

```json
{
  "phone": "+380738791968",
  "audience": "CLIENT",
  "code": "466478",
  "sent_at": "2026-10-27T20:20:24.37630883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "898e02a7-7268-4cf1-872c-ebe6bc09f906",
  "code": "466478",
  "device_ref": "sandbox-32111"
}
```

```json
{
  "session_id": "2fefbd33-80c5-423c-b112-ab0ad8a79061",
  "subject": {
    "type": "CLIENT",
    "id": "a17d6eb6-9081-4cbe-9bae-1481bc1b8d10"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMTdkNmViNi05MDgxLTRjYmUtOWJhZS0xNDgxYmMxYjhkMTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzI0LCJpYXQiOjE3OTMxMzI0MjQsImp0aSI6IjIyOWRjYTZiLWQ2N2QtNDg2ZC05Y2JmLWNjMTQ0Y2IxZmEyMiIsInNpZCI6IjJmZWZiZDMzLTgwYzUtNDIzYy1iMTEyLWFiMGFkOGE3OTA2MSJ9.lmLWvKY4U4PrRm--v0BkgMIg3ZD3Hmpneo9WbVd-HXg",
  "access_expires_at": "2026-10-27T20:35:24.420654275Z",
  "refresh_token": "mitiq3MFyXftOAnlSntoMBro9EF4ROkuaUUgDxUaKeo",
  "refresh_expires_at": "2026-11-26T20:20:24.420212924Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "938e1a9b-c27f-40a3-baae-1e85d4f85629",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "dc8d1573-0b3c-4ba5-a0cf-9d19c3b76fdd",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-dc8d1573-0b3c-4ba5-a0cf-9d19c3b76fdd",
    "orderDate": "1793132424",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "410862b149c670382ff7a1c09f6c828c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=dc8d1573-0b3c-4ba5-a0cf-9d19c3b76fdd",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738791968"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=dc8d1573-0b3c-4ba5-a0cf-9d19c3b76fdd",
  "created_at": "2026-10-27T20:20:24.449792Z",
  "expires_at": "2026-10-27T20:50:24.449792Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/dc8d1573-0b3c-4ba5-a0cf-9d19c3b76fdd` → **200**

```json
{
  "id": "dc8d1573-0b3c-4ba5-a0cf-9d19c3b76fdd",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T20:20:24.449792Z",
  "expires_at": "2026-10-27T20:50:24.449792Z",
  "completed_at": "2026-10-27T20:20:24.481504Z",
  "masked_pan": "41****7662",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a17d6eb6-9081-4cbe-9bae-1481bc1b8d10",
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
      "id": "e3282415-0674-4f31-9c31-94cdbef3b818",
      "at": "2026-10-27T20:20:24.506878Z",
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
  "client_id": "a17d6eb6-9081-4cbe-9bae-1481bc1b8d10",
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
      "id": "e3282415-0674-4f31-9c31-94cdbef3b818",
      "at": "2026-10-27T20:20:24.506878Z",
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
  "device_ref": "sandbox-29570"
}
```

```json
{
  "challenge_id": "cdae1c81-44db-453f-939e-93fb014da66d",
  "expires_at": "2026-10-27T20:25:24.566583912Z",
  "resend_available_at": "2026-10-27T20:20:25.566583912Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "110636",
  "sent_at": "2026-10-27T20:20:24.568542782Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdae1c81-44db-453f-939e-93fb014da66d",
  "code": "110636",
  "device_ref": "sandbox-29570"
}
```

```json
{
  "session_id": "7afbbc91-152a-460f-82b2-ea616d05c1b5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzMyNCwiaWF0IjoxNzkzMTMyNDI0LCJqdGkiOiIzODljNjMxZS1mNjdmLTQ2YzMtYTJkYi1mNjZlYWQwODdjMjIiLCJzaWQiOiI3YWZiYmM5MS0xNTJhLTQ2MGYtODJiMi1lYTYxNmQwNWMxYjUifQ.1wAJY84DXrh3ke9E51u5EJMTWiq6aXArw3Af2aUKRb4",
  "access_expires_at": "2026-10-27T20:35:24.612694694Z",
  "refresh_token": "ysH7ALLFuXIz5IvmJ9gv3HiIGwYRlzwvfGW_hDjJwFE",
  "refresh_expires_at": "2026-11-26T20:20:24.612126127Z",
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
  "command_id": "dde2d6f7-0e2d-4f04-a724-e7c78e8f532c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "c2afaccb-be9d-42e0-8c08-d8f9baeb7aa8",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c2afaccb-be9d-42e0-8c08-d8f9baeb7aa8",
    "orderDate": "1793132424",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "7cb2f42f18e7e27b9cccbb471b3cc9ca",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c2afaccb-be9d-42e0-8c08-d8f9baeb7aa8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c2afaccb-be9d-42e0-8c08-d8f9baeb7aa8",
  "created_at": "2026-10-27T20:20:24.660038Z",
  "expires_at": "2026-10-27T20:50:24.660038Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/c2afaccb-be9d-42e0-8c08-d8f9baeb7aa8` → **200**

```json
{
  "id": "c2afaccb-be9d-42e0-8c08-d8f9baeb7aa8",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T20:20:24.660038Z",
  "expires_at": "2026-10-27T20:50:24.660038Z",
  "completed_at": "2026-10-27T20:20:24.684629Z",
  "masked_pan": "41****0478",
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
      "id": "c6114721-820a-4a60-960a-61164c640fda",
      "at": "2026-10-27T20:20:25.511947Z",
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
  "command_id": "a4727a4d-1ec0-4792-81db-bd930a2fddf2",
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
  "correlation_id": "3c167df5-aafe-4f58-9055-7a9cdea4f572"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670704399",
  "device_ref": "sandbox-29510"
}
```

```json
{
  "challenge_id": "c28be88d-5eef-42f8-a2e0-15f90c89b6e6",
  "expires_at": "2026-10-27T20:25:25.800465051Z",
  "resend_available_at": "2026-10-27T20:20:26.800465051Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670704399` → **200**

```json
{
  "phone": "+380670704399",
  "audience": "CLIENT",
  "code": "424869",
  "sent_at": "2026-10-27T20:20:25.802307065Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c28be88d-5eef-42f8-a2e0-15f90c89b6e6",
  "code": "424869",
  "device_ref": "sandbox-29510"
}
```

```json
{
  "session_id": "d1d9ba0d-a8b8-477d-875c-82ae0f6898d4",
  "subject": {
    "type": "CLIENT",
    "id": "52c03123-ce0f-43a0-954b-66de7369888f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmMwMzEyMy1jZTBmLTQzYTAtOTU0Yi02NmRlNzM2OTg4OGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzI1LCJpYXQiOjE3OTMxMzI0MjUsImp0aSI6IjdhZDkwNjBiLTg5NWEtNDIyNy1hZDExLWRkZWQwY2EyNmRhZSIsInNpZCI6ImQxZDliYTBkLWE4YjgtNDc3ZC04NzVjLTgyYWUwZjY4OThkNCJ9.zub8sB9jcJrvevtJNlhZeDK7kFN6WNW2t04juCT_cGM",
  "access_expires_at": "2026-10-27T20:35:25.85170926Z",
  "refresh_token": "n6TQiD4c6WjfZyTqi3udtTcYbnG_9TFcnG8KYsHILQM",
  "refresh_expires_at": "2026-11-26T20:20:25.851259694Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "52c03123-ce0f-43a0-954b-66de7369888f",
  "session_id": "d1d9ba0d-a8b8-477d-875c-82ae0f6898d4",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3f73281e-b87e-433b-8e44-a7491707b46f",
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
  "id": "0a2807bc-2f41-4193-b232-d75b772974b5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:25:25.907220Z",
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
  "challenge_id": "332a656c-f61d-42a1-b1da-da73c99e2d2f",
  "expires_at": "2026-10-27T20:25:27.937163044Z",
  "resend_available_at": "2026-10-27T20:20:28.937163044Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670704399` → **200**

```json
{
  "phone": "+380670704399",
  "audience": "CLIENT",
  "code": "365916",
  "sent_at": "2026-10-27T20:20:27.938957263Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "4a100b24-4d2f-4d1b-b817-108041862185",
  "challenge_id": "332a656c-f61d-42a1-b1da-da73c99e2d2f",
  "otp_code": "365916"
}
```

```json
{
  "client_id": "52c03123-ce0f-43a0-954b-66de7369888f",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T20:20:27.994180847Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "ed1cd5a7-e872-4e24-8a43-9dd9e6e95387",
  "quote_id": "0a2807bc-2f41-4193-b232-d75b772974b5",
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
  "correlation_id": "ad6ea0c3-7078-4a2b-81cb-55d8168f664b"
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
  "session_id": "768570a2-c0bf-471a-ad2b-8856855e168d",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzMjgsImlhdCI6MTc5MzEzMjQyOCwianRpIjoiMThkMWEzZjktYzcwMC00ZjAwLTgxMGUtZDE2ZjA5YWUwNjgxIiwic2lkIjoiNzY4NTcwYTItYzBiZi00NzFhLWFkMmItODg1Njg1NWUxNjhkIn0.zRzDsy0RNjjIkd9OZdNHP6VrBgmX7HDAEoU318_p8B8",
  "access_expires_at": "2026-10-27T20:35:28.252390823Z",
  "refresh_token": "hXjl5Qv9ihaZbos_5MKilbPK91xU3TR14K1nTj22F4A",
  "refresh_expires_at": "2026-10-28T08:20:28.251899597Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "52c03123-ce0f-43a0-954b-66de7369888f",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T20:20:27.994181Z",
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

`POST /api/admin/v1/client-deletions/52c03123-ce0f-43a0-954b-66de7369888f/complete` → **200**

```json
{
  "command_id": "a32c3daf-40f2-4dbc-a591-ec786579c326",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "52c03123-ce0f-43a0-954b-66de7369888f",
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
  "correlation_id": "7e1777fe-be1e-4856-bf52-3e133a852894"
}
```

Done: client 52c03123-ce0f-43a0-954b-66de7369888f anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666266045",
  "device_ref": "sandbox-26099"
}
```

```json
{
  "challenge_id": "e1e585fb-1a81-4d46-9f56-f2deaf059259",
  "expires_at": "2026-10-27T20:25:28.363662656Z",
  "resend_available_at": "2026-10-27T20:20:29.363662656Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666266045` → **200**

```json
{
  "phone": "+380666266045",
  "audience": "CLIENT",
  "code": "880702",
  "sent_at": "2026-10-27T20:20:28.365446285Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1e585fb-1a81-4d46-9f56-f2deaf059259",
  "code": "880702",
  "device_ref": "sandbox-26099"
}
```

```json
{
  "session_id": "fc5502da-5ee2-4d7d-90c8-033160a024aa",
  "subject": {
    "type": "CLIENT",
    "id": "ea3971f7-122f-4f6c-8b0e-60a8888dc68c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYTM5NzFmNy0xMjJmLTRmNmMtOGIwZS02MGE4ODg4ZGM2OGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzI4LCJpYXQiOjE3OTMxMzI0MjgsImp0aSI6ImY5NWQxM2I0LTE2NmEtNDQxZC04MDRmLWEyYWM3YTM2ODMyOCIsInNpZCI6ImZjNTUwMmRhLTVlZTItNGQ3ZC05MGM4LTAzMzE2MGEwMjRhYSJ9.do5_WFYcSB21yCGDOv5AZkV-5N-LNh2c1x0mpe9pZEc",
  "access_expires_at": "2026-10-27T20:35:28.408120251Z",
  "refresh_token": "KZWW2ik822KYcKjGUSjd8mjvC7COOIVkFUHG4l33Yj0",
  "refresh_expires_at": "2026-11-26T20:20:28.407708721Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ea3971f7-122f-4f6c-8b0e-60a8888dc68c",
  "session_id": "fc5502da-5ee2-4d7d-90c8-033160a024aa",
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
  "session_id": "cf205171-fb85-4420-984f-e88c52d74da4",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzMjgsImlhdCI6MTc5MzEzMjQyOCwianRpIjoiMmJmZDgzNGItNjRjZS00Zjc3LWI3ZTAtNDdhZmE4N2M0NWE3Iiwic2lkIjoiY2YyMDUxNzEtZmI4NS00NDIwLTk4NGYtZTg4YzUyZDc0ZGE0In0.7rGut5m6GQXK1Hh7XzQIMox2F_8cHarzH_LrWvPQhOc",
  "access_expires_at": "2026-10-27T20:35:28.653260076Z",
  "refresh_token": "G--aB1sy3yi8GV2uEX4-7Y68lG1JqLbi6PDqDfC8s9c",
  "refresh_expires_at": "2026-10-28T08:20:28.652845421Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6266045&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "ea3971f7-122f-4f6c-8b0e-60a8888dc68c",
      "phone": "+380666266045",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-27T20:20:28.405991Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/ea3971f7-122f-4f6c-8b0e-60a8888dc68c` → **200**

```json
{
  "client": {
    "id": "ea3971f7-122f-4f6c-8b0e-60a8888dc68c",
    "phone": "+380666266045",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-27T20:20:28.405991Z",
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

`POST /api/admin/v1/clients/ea3971f7-122f-4f6c-8b0e-60a8888dc68c/block` → **400**

```json
{
  "command_id": "64fe6113-8c7e-4224-9ca0-b5703cc15e19",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/ea3971f7-122f-4f6c-8b0e-60a8888dc68c/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "166607ce-fca5-45db-86cf-f07d499cca0f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/ea3971f7-122f-4f6c-8b0e-60a8888dc68c/block` → **200**

```json
{
  "command_id": "0a0afc1f-1cd0-434d-86d4-1daf911c10a6",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "ea3971f7-122f-4f6c-8b0e-60a8888dc68c",
  "phone": "+380666266045",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-27T20:20:28.405991Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-27T20:20:28.788682Z",
    "by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
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
  "correlation_id": "64d741ce-9ff0-473e-a0fe-33d851bdbcce"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666266045",
  "device_ref": "sandbox-7700"
}
```

```json
{
  "challenge_id": "87cdfc2f-c2a1-4c49-b285-a7f4dd9efce0",
  "expires_at": "2026-10-27T20:25:30.836956623Z",
  "resend_available_at": "2026-10-27T20:20:31.836956623Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666266045` → **200**

```json
{
  "phone": "+380666266045",
  "audience": "CLIENT",
  "code": "831928",
  "sent_at": "2026-10-27T20:20:30.838409523Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "87cdfc2f-c2a1-4c49-b285-a7f4dd9efce0",
  "code": "831928",
  "device_ref": "sandbox-7700"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "2b8c4522-e8ca-4d67-833a-55254df08d6a"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/ea3971f7-122f-4f6c-8b0e-60a8888dc68c` → **200**

```json
{
  "client": {
    "id": "ea3971f7-122f-4f6c-8b0e-60a8888dc68c",
    "phone": "+380666266045",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-27T20:20:28.405991Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-27T20:20:28.788682Z",
      "by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
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

`POST /api/admin/v1/clients/ea3971f7-122f-4f6c-8b0e-60a8888dc68c/unblock` → **200**

```json
{
  "command_id": "57ded3f7-0b7d-4b16-832e-6a347bfe390b",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "ea3971f7-122f-4f6c-8b0e-60a8888dc68c",
  "phone": "+380666266045",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-27T20:20:28.405991Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666266045",
  "device_ref": "sandbox-30826"
}
```

```json
{
  "challenge_id": "4508e2be-fca5-423b-9980-306da8770041",
  "expires_at": "2026-10-27T20:25:32.964368127Z",
  "resend_available_at": "2026-10-27T20:20:33.964368127Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666266045` → **200**

```json
{
  "phone": "+380666266045",
  "audience": "CLIENT",
  "code": "537658",
  "sent_at": "2026-10-27T20:20:32.966589951Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4508e2be-fca5-423b-9980-306da8770041",
  "code": "537658",
  "device_ref": "sandbox-30826"
}
```

```json
{
  "session_id": "ec929121-6704-401a-ae82-ded546b81ed2",
  "subject": {
    "type": "CLIENT",
    "id": "ea3971f7-122f-4f6c-8b0e-60a8888dc68c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYTM5NzFmNy0xMjJmLTRmNmMtOGIwZS02MGE4ODg4ZGM2OGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzMzLCJpYXQiOjE3OTMxMzI0MzMsImp0aSI6ImY4ZTFjYWUwLWU1YzUtNGVkOC1hYTZkLTNlZTRmMjk3NjZlYiIsInNpZCI6ImVjOTI5MTIxLTY3MDQtNDAxYS1hZTgyLWRlZDU0NmI4MWVkMiJ9.Nu2oME1fLeGnGh2raVc1_yvXZtImCp5bPK8PMAyVFrM",
  "access_expires_at": "2026-10-27T20:35:33.010479899Z",
  "refresh_token": "ayGbS27I0W3Xca8PbD6xWflWVUmMGcjwduYivfD4Gr8",
  "refresh_expires_at": "2026-11-26T20:20:33.010086326Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ea3971f7-122f-4f6c-8b0e-60a8888dc68c",
  "session_id": "ec929121-6704-401a-ae82-ded546b81ed2",
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
  "device_ref": "sandbox-29735"
}
```

```json
{
  "challenge_id": "a835354d-33b6-4153-bdda-98a10c3d76c4",
  "expires_at": "2026-10-27T20:25:33.085016705Z",
  "resend_available_at": "2026-10-27T20:20:34.085016705Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "062434",
  "sent_at": "2026-10-27T20:20:33.087074697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a835354d-33b6-4153-bdda-98a10c3d76c4",
  "code": "062434",
  "device_ref": "sandbox-29735"
}
```

```json
{
  "session_id": "762768b9-547c-48dc-9a6b-089665a725d0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzMzMywiaWF0IjoxNzkzMTMyNDMzLCJqdGkiOiI5NWY1YjdiZC01OWM1LTRjNWUtYWNlYi0yNzZiNzJjYTM3Y2MiLCJzaWQiOiI3NjI3NjhiOS01NDdjLTQ4ZGMtOWE2Yi0wODk2NjVhNzI1ZDAifQ.O8ZjcStgNu_pDmH6Pc8IjKIiY670-mN-y5k45Zwh4bM",
  "access_expires_at": "2026-10-27T20:35:33.132822787Z",
  "refresh_token": "dhxZWb7X6dbkQ7YW2Vj0Ln6oeQfrjpCGJl9xm2XH6-w",
  "refresh_expires_at": "2026-11-26T20:20:33.132491648Z",
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
  "command_id": "2308d81f-95f8-4ac0-91ed-ad15ff645a4d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:33Z",
    "sequence": 1793132433172
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:33.186385Z",
  "last_location_at": "2026-10-27T20:20:33.186385Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671382731",
  "device_ref": "sandbox-26710"
}
```

```json
{
  "challenge_id": "bc185b84-e786-4865-89d0-a077bd01885b",
  "expires_at": "2026-10-27T20:25:33.210791705Z",
  "resend_available_at": "2026-10-27T20:20:34.210791705Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671382731` → **200**

```json
{
  "phone": "+380671382731",
  "audience": "CLIENT",
  "code": "331213",
  "sent_at": "2026-10-27T20:20:33.212640172Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc185b84-e786-4865-89d0-a077bd01885b",
  "code": "331213",
  "device_ref": "sandbox-26710"
}
```

```json
{
  "session_id": "d78569ff-f782-4cb4-aa0d-8a35e6729621",
  "subject": {
    "type": "CLIENT",
    "id": "9768912e-c2f4-47ef-ba54-a319ca986d6c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NzY4OTEyZS1jMmY0LTQ3ZWYtYmE1NC1hMzE5Y2E5ODZkNmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzMzLCJpYXQiOjE3OTMxMzI0MzMsImp0aSI6IjEzZjAxMTUyLTdmM2QtNGQ3Yi05NzMyLTk4Zjc2ZjU1YzBjNiIsInNpZCI6ImQ3ODU2OWZmLWY3ODItNGNiNC1hYTBkLThhMzVlNjcyOTYyMSJ9.n6lpADGplmMTY41rzdk2UP9wZVLo4ueK2pfvhZ8tusQ",
  "access_expires_at": "2026-10-27T20:35:33.256041765Z",
  "refresh_token": "K68DJFYe4Hrgwr8NFZ4I-z8H2wyy2jKj1VxwMn2GyoE",
  "refresh_expires_at": "2026-11-26T20:20:33.255728683Z",
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
  "command_id": "115b1376-d4c8-4b8f-a81c-764f73932b70",
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
  "id": "ebfa207f-64f5-43a4-82df-dfd5e621d3b6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:25:33.308987Z",
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
  "command_id": "ffc95271-6eac-4241-888f-643cd9e37ca0",
  "platform": "ANDROID",
  "token": "sandbox-driver-4adbb005-26b3-44a5-a016-31d6fe2672df"
}
```

```json
{
  "id": "300613e3-b9f2-43ea-9dfb-01bcf43bcae8",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T20:20:33.346327Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "ad024fda-d056-44a1-b200-761fe727db38",
  "platform": "ANDROID",
  "token": "sandbox-rider-b17bdb58-633e-4047-92b1-84825f3decf9"
}
```

```json
{
  "id": "5a7322e7-0283-4d58-80f5-11c1c5bb4382",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T20:20:33.377888Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f2d0b975-9769-4c78-9d84-4da08b58ecbf",
  "quote_id": "ebfa207f-64f5-43a4-82df-dfd5e621d3b6",
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
  "id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9768912e-c2f4-47ef-ba54-a319ca986d6c",
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
  "created_at": "2026-10-27T20:20:33.423648Z",
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
    "id": "732bf7e3-ba98-4ede-b9a0-0c0fd729a632",
    "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
    "expires_at": "2026-10-27T20:20:48.426835Z",
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

`POST /api/driver/v1/offers/732bf7e3-ba98-4ede-b9a0-0c0fd729a632/accept` → **200**

```json
{
  "command_id": "98881b8d-381d-4b8c-88b6-200a08ef965a"
}
```

```json
{
  "id": "13fc5da2-7668-4a7a-b49e-913ca505f6b3",
  "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "de2f6b19-9c3c-4adf-bbb2-55614e7d1464",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T20:20:33.398Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T20:20:33.398Z` → **200**

```json
[
  {
    "at": "2026-10-27T20:20:34.32040856Z",
    "token_suffix": "2672df",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
      "order_version": "2",
      "event_id": "f7a2eddf-3a76-4461-bf57-e8c5a5cc870a",
      "event_type": "OfferMade",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380671382731&after=2026-10-27T20:20:33.398Z` → **200**

```json
[
  {
    "at": "2026-10-27T20:20:34.319003193Z",
    "token_suffix": "3decf9",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
      "order_version": "3",
      "event_id": "a4904c90-e32d-47ae-afbd-8af4eb0e651b",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/618f9287-62e0-4694-a5c7-b1a7b26bd3b3/messages` → **201**

```json
{
  "command_id": "5932f347-03f4-46e3-ad49-5e9439c1a017",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "a908a722-cb51-4c28-98bb-bced91ef6428",
  "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T20:20:34.590925212Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "de2f6b19-9c3c-4adf-bbb2-55614e7d1464",
  "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
  "assignment_id": "13fc5da2-7668-4a7a-b49e-913ca505f6b3",
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

`POST /api/driver/v1/trips/de2f6b19-9c3c-4adf-bbb2-55614e7d1464/messages` → **201**

```json
{
  "command_id": "c6dbd113-d347-409c-a5ad-2ff81d644f87",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "12dbf22f-ec2a-40c7-bd5a-5741649db926",
  "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T20:20:34.634535659Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/618f9287-62e0-4694-a5c7-b1a7b26bd3b3/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/de2f6b19-9c3c-4adf-bbb2-55614e7d1464/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380671382731"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:34Z",
    "sequence": 1793132434692
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:34.707232Z",
  "last_location_at": "2026-10-27T20:20:34.707232Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "de2f6b19-9c3c-4adf-bbb2-55614e7d1464",
  "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
  "assignment_id": "13fc5da2-7668-4a7a-b49e-913ca505f6b3",
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

`POST /api/driver/v1/trips/de2f6b19-9c3c-4adf-bbb2-55614e7d1464/arrive` → **200**

```json
{
  "command_id": "41ab34d6-8442-47e0-b4fb-e83423dfb9e3",
  "expected_version": 0
}
```

```json
{
  "id": "de2f6b19-9c3c-4adf-bbb2-55614e7d1464",
  "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
  "assignment_id": "13fc5da2-7668-4a7a-b49e-913ca505f6b3",
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
  "arrived_at": "2026-10-27T20:20:34.748046Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/de2f6b19-9c3c-4adf-bbb2-55614e7d1464/start` → **200**

```json
{
  "command_id": "3bf20e7f-e9b9-4467-a2d8-36a6a5372387",
  "expected_version": 1
}
```

```json
{
  "id": "de2f6b19-9c3c-4adf-bbb2-55614e7d1464",
  "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
  "assignment_id": "13fc5da2-7668-4a7a-b49e-913ca505f6b3",
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
  "arrived_at": "2026-10-27T20:20:34.748046Z",
  "started_at": "2026-10-27T20:20:34.774103Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:34Z",
    "sequence": 1793132434792
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:34.807285Z",
  "last_location_at": "2026-10-27T20:20:34.807285Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/de2f6b19-9c3c-4adf-bbb2-55614e7d1464/complete` → **200**

```json
{
  "command_id": "af292315-32dc-4ee0-bd0b-e8746b44291f",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:20:34Z",
  "cash_received": true
}
```

```json
{
  "id": "de2f6b19-9c3c-4adf-bbb2-55614e7d1464",
  "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
  "assignment_id": "13fc5da2-7668-4a7a-b49e-913ca505f6b3",
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
  "arrived_at": "2026-10-27T20:20:34.748046Z",
  "started_at": "2026-10-27T20:20:34.774103Z",
  "completed_at": "2026-10-27T20:20:34.835019Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/618f9287-62e0-4694-a5c7-b1a7b26bd3b3` → **200**

```json
{
  "id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9768912e-c2f4-47ef-ba54-a319ca986d6c",
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
    "id": "13fc5da2-7668-4a7a-b49e-913ca505f6b3",
    "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "de2f6b19-9c3c-4adf-bbb2-55614e7d1464",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T20:20:33.423648Z",
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
    "id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T20:20:33.423648Z",
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
    "id": "de2f6b19-9c3c-4adf-bbb2-55614e7d1464",
    "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
    "order_short_number": 5,
    "created_at": "2026-10-27T20:20:33.482398Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "59053402-d322-492d-b623-25a9a29963c7",
    "order_id": "3173c039-c167-4887-bdb1-dc7f189f3cde",
    "order_short_number": 1,
    "created_at": "2026-10-27T20:20:06.788715Z",
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

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
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

`GET /api/rider/v1/orders/618f9287-62e0-4694-a5c7-b1a7b26bd3b3/tip` → **200**

```json
{
  "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
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
  "available_until": "2026-10-28T20:20:34.835019Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/618f9287-62e0-4694-a5c7-b1a7b26bd3b3/tip` → **201**

```json
{
  "command_id": "2e4a3d05-23a2-4ca0-b82e-9ec992ddeebb",
  "amount_minor": 1100
}
```

```json
{
  "id": "c4dacc2f-c3e6-4c01-9186-cdb6b446b0f2",
  "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T20:20:38.006402Z"
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
  "session_id": "e23c5167-f959-4a71-a103-6e1a2359f02f",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzMzgsImlhdCI6MTc5MzEzMjQzOCwianRpIjoiMWRjNGQwZWYtZTRhMS00MzFlLWE1ZDgtMDk5N2UyZWIwYjM1Iiwic2lkIjoiZTIzYzUxNjctZjk1OS00YTcxLWExMDMtNmUxYTIzNTlmMDJmIn0.1ihu3eY6FDy45z4JdmHxjhNa2qyAjUWNtrKzt_5fLEg",
  "access_expires_at": "2026-10-27T20:35:38.232880627Z",
  "refresh_token": "O5jlSzOBiaBh94YHYmTlSx4OARrSyxSlUSajf0OwV1E",
  "refresh_expires_at": "2026-10-28T08:20:38.232564571Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
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
  "generated_at": "2026-10-27T20:20:38.25816623Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
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
  "generated_at": "2026-10-27T20:20:38.284271739Z"
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
  "session_id": "df01f63d-0fde-462e-bbf4-95a8a2dfcb4e",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzMzgsImlhdCI6MTc5MzEzMjQzOCwianRpIjoiYjhjNGQ3NmEtNGMxYS00Zjc2LThjMzMtMzhkN2FlNGRhZTI0Iiwic2lkIjoiZGYwMWY2M2QtMGZkZS00NjJlLWJiZjQtOTVhOGEyZGZjYjRlIn0.5zPVrwbPEh3buq2PH_jdZ_AkwjtOIGVhHn4IAWQPlmc",
  "access_expires_at": "2026-10-27T20:35:38.503485656Z",
  "refresh_token": "i2-kkLfk6QK_ESM1Ewc3EBVhlfloF-FtvdiqvhtJzBE",
  "refresh_expires_at": "2026-10-28T08:20:38.503147056Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/618f9287-62e0-4694-a5c7-b1a7b26bd3b3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T20:20:33.424302Z",
      "actor": {
        "type": "CLIENT",
        "id": "9768912e-c2f4-47ef-ba54-a319ca986d6c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
        "quote_id": "ebfa207f-64f5-43a4-82df-dfd5e621d3b6",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T20:20:33.425933Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
        "attempt_id": "56cd9b86-36a9-46aa-8e4d-3abdb79ef83b",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T20:20:33.431284Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "732bf7e3-ba98-4ede-b9a0-0c0fd729a632",
        "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T20:20:33.486101Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "732bf7e3-ba98-4ede-b9a0-0c0fd729a632",
        "order_id": "618f9287-62e0-4694-a5c7-b1a7b26bd3b3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "13fc5da2-7668-4a7a-b49e-913ca505f6b3"
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
  "at": "2026-10-27T20:20:38.542277893Z",
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
      "last_location_at": "2026-10-27T20:20:34.807285Z",
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
      "last_location_at": "2026-10-27T20:20:15.85133Z",
      "order_id": null
    }
  ]
}
```

Done: order 618f9287-62e0-4694-a5c7-b1a7b26bd3b3.

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
  "session_id": "e993f225-5d84-477d-a362-dbbdaae4ab0a",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzMzgsImlhdCI6MTc5MzEzMjQzOCwianRpIjoiNjEzMmMyYWEtNzQ5Ni00N2M5LThkN2UtYmU3MjU0OTE3OGE4Iiwic2lkIjoiZTk5M2YyMjUtNWQ4NC00NzdkLWEzNjItZGJiZGFhZTRhYjBhIn0.AeGM_LhVjYH8YfxLMkhIdl4cM5-gs5N6ttEZfzAaTHE",
  "access_expires_at": "2026-10-27T20:35:38.807498451Z",
  "refresh_token": "DRVJz_RatVsGj0BFjNU1KQLp4Y4HAz2iFSuETRNUHmY",
  "refresh_expires_at": "2026-10-28T08:20:38.807012024Z",
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
  "command_id": "594c0dc4-a2ea-4b6e-9657-f166337e2a2f",
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
  "timestamp": "2026-10-27T20:20:38.000+0000",
  "channel": {
    "id": "1730052000.1498024012",
    "linkedid": "1730052000.1498024012",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679391870"
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
  "timestamp": "2026-10-27T20:20:38.000+0000",
  "channel": {
    "id": "1730052000.1498024012",
    "linkedid": "1730052000.1498024012",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679391870"
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
  "session_id": "523c1ffa-1af8-465a-8703-fff498f22ee0",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzMzksImlhdCI6MTc5MzEzMjQzOSwianRpIjoiNjc1NGZlYzAtMmQwNy00MTRiLTg1NjEtNTg0MDIxMGRkYjM4Iiwic2lkIjoiNTIzYzFmZmEtMWFmOC00NjVhLTg3MDMtZmZmNDk4ZjIyZWUwIn0.fTiCL3RmEjTlkro1VxQzYU8GgYwve0oBTrYKhm-3zPI",
  "access_expires_at": "2026-10-27T20:35:39.111738153Z",
  "refresh_token": "Q6jyQPaQl9P58ByamS2xPqbJu8omXJ06bkt7HFY5FbQ",
  "refresh_expires_at": "2026-10-28T08:20:39.111411591Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "a3a0553b-aac4-4c46-b3f7-a7612c3166a3",
      "state": "RINGING",
      "caller_phone": "+380679391870",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-27T20:20:38Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/a3a0553b-aac4-4c46-b3f7-a7612c3166a3/answer` → **200**

```json
{
  "command_id": "bf6a5053-6d91-4000-98c9-b1216db991a3"
}
```

```json
{
  "id": "a3a0553b-aac4-4c46-b3f7-a7612c3166a3",
  "state": "ANSWERED",
  "caller_phone": "+380679391870",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
  "order_ids": [],
  "started_at": "2026-10-27T20:20:38Z",
  "answered_at": "2026-10-27T20:20:39.165176Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1498024012",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d5163410-9e64-4b87-9b4c-cf6f70a36c7d",
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
  "id": "45d1d021-d135-4dfd-be80-abbfd33e9125",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:25:39.216548Z",
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
  "command_id": "667cfaeb-04c2-4d01-b1fb-267ac887880e",
  "quote_id": "45d1d021-d135-4dfd-be80-abbfd33e9125",
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
    "phone": "+380679391870"
  },
  "call_id": "a3a0553b-aac4-4c46-b3f7-a7612c3166a3"
}
```

```json
{
  "id": "937221ae-ebf1-42ce-af4a-3e92b24f2c5d",
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
  "created_at": "2026-10-27T20:20:39.257798Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679391870"
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
    "id": "1730052000.1498024012",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a3a0553b-aac4-4c46-b3f7-a7612c3166a3",
      "state": "ENDED",
      "caller_phone": "+380679391870",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
      "order_ids": [
        "937221ae-ebf1-42ce-af4a-3e92b24f2c5d"
      ],
      "started_at": "2026-10-27T20:20:38Z",
      "answered_at": "2026-10-27T20:20:39.165176Z",
      "ended_at": "2026-10-27T20:20:39.298352Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "edf05d21-973d-4f65-aa17-5917bdcc0115",
      "state": "ENDED",
      "caller_phone": "+380671382761",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
      "order_ids": [],
      "started_at": "2026-10-27T20:20:10.741669Z",
      "answered_at": "2026-10-27T20:20:10.799044Z",
      "ended_at": "2026-10-27T20:20:10.841562Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-27T20:20:13.212047Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/937221ae-ebf1-42ce-af4a-3e92b24f2c5d` → **200**

```json
{
  "id": "937221ae-ebf1-42ce-af4a-3e92b24f2c5d",
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
  "created_at": "2026-10-27T20:20:39.257798Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679391870"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/937221ae-ebf1-42ce-af4a-3e92b24f2c5d` → **200**

```json
{
  "id": "937221ae-ebf1-42ce-af4a-3e92b24f2c5d",
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
  "created_at": "2026-10-27T20:20:39.257798Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679391870"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/937221ae-ebf1-42ce-af4a-3e92b24f2c5d/cancel` → **200**

```json
{
  "command_id": "82c9583c-0657-4c76-9fd6-57ca5d7d0631",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "937221ae-ebf1-42ce-af4a-3e92b24f2c5d",
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
  "created_at": "2026-10-27T20:20:39.257798Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679391870"
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

Done: call a3a0553b-aac4-4c46-b3f7-a7612c3166a3 with order 937221ae-ebf1-42ce-af4a-3e92b24f2c5d.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12377"
}
```

```json
{
  "challenge_id": "62728492-7662-4f32-bc6c-558f3e4a61f0",
  "expires_at": "2026-10-27T20:25:39.43813885Z",
  "resend_available_at": "2026-10-27T20:20:40.43813885Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "390662",
  "sent_at": "2026-10-27T20:20:39.439872651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62728492-7662-4f32-bc6c-558f3e4a61f0",
  "code": "390662",
  "device_ref": "sandbox-12377"
}
```

```json
{
  "session_id": "ce65c883-f707-4c3a-a150-05023f551fa2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzMzOSwiaWF0IjoxNzkzMTMyNDM5LCJqdGkiOiJlMDYyMTYyMC1iNTQ4LTQ1ZWQtYTM2Yy1iMDQ4YzIwZDlhYTQiLCJzaWQiOiJjZTY1Yzg4My1mNzA3LTRjM2EtYTE1MC0wNTAyM2Y1NTFmYTIifQ.00Zb7-SXQjMgcfMAx807y37dVBaMPJ3Z_7TdeIKtu7E",
  "access_expires_at": "2026-10-27T20:35:39.484239749Z",
  "refresh_token": "O7CdwD9BC9tiysGdg-CcdoLAykGvwg_tc9zca9q5FSs",
  "refresh_expires_at": "2026-11-26T20:20:39.483820958Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:34.807285Z",
  "last_location_at": "2026-10-27T20:20:34.807285Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29/handover` → **200**

```json
{
  "command_id": "bdaa5bee-e876-49f3-bb9f-b19db5f9b00d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:34.807285Z",
  "last_location_at": "2026-10-27T20:20:34.807285Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:39Z",
    "sequence": 1793132439550
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:39.564243Z",
  "last_location_at": "2026-10-27T20:20:39.564243Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663828741",
  "device_ref": "sandbox-4750"
}
```

```json
{
  "challenge_id": "fba75c63-41a1-47cd-83d0-cf72512c8250",
  "expires_at": "2026-10-27T20:25:39.585076825Z",
  "resend_available_at": "2026-10-27T20:20:40.585076825Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663828741` → **200**

```json
{
  "phone": "+380663828741",
  "audience": "CLIENT",
  "code": "408102",
  "sent_at": "2026-10-27T20:20:39.586243302Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fba75c63-41a1-47cd-83d0-cf72512c8250",
  "code": "408102",
  "device_ref": "sandbox-4750"
}
```

```json
{
  "session_id": "34522436-3e1b-452d-83d0-b6aa4a2aa21e",
  "subject": {
    "type": "CLIENT",
    "id": "9b400914-2341-4ba2-b386-70376ed9b24d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjQwMDkxNC0yMzQxLTRiYTItYjM4Ni03MDM3NmVkOWIyNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzM5LCJpYXQiOjE3OTMxMzI0MzksImp0aSI6IjQ4ODIyMDdlLWJiZmMtNGM3Yi1hNTgyLWZiNjFiNDQ4MDZmNSIsInNpZCI6IjM0NTIyNDM2LTNlMWItNDUyZC04M2QwLWI2YWE0YTJhYTIxZSJ9.j0thc_dBD353WoEzTUp8zZ5cAIYtCXc4UZabqvZ-gOM",
  "access_expires_at": "2026-10-27T20:35:39.630430875Z",
  "refresh_token": "YGUT1i_hoaTND5IhOUk9Gu7IZUzbsr7ure8lLqXr59E",
  "refresh_expires_at": "2026-11-26T20:20:39.62994272Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e36c4b55-b9e5-4813-99b8-27a7ce6c344b",
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
  "id": "8cf87426-8894-4794-b61d-4174e35d7944",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T20:25:39.657818Z",
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
  "command_id": "de7308e5-6329-49bf-91a2-4d67f7a4eb93",
  "quote_id": "8cf87426-8894-4794-b61d-4174e35d7944",
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
  "id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9b400914-2341-4ba2-b386-70376ed9b24d",
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
  "created_at": "2026-10-27T20:20:39.69295Z",
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
    "id": "9b222f34-9639-4acf-9db7-5f137c4dbb47",
    "order_id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
    "expires_at": "2026-10-27T20:20:54.695196Z",
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

`POST /api/driver/v1/offers/9b222f34-9639-4acf-9db7-5f137c4dbb47/accept` → **200**

```json
{
  "command_id": "c081ece7-7f6d-4bf1-9ded-8d8c66babcb5"
}
```

```json
{
  "id": "3e54f25c-f44b-40d4-bf99-b277ee042f69",
  "order_id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e060eac4-c4ad-442f-9a24-a4daf5286420",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e060eac4-c4ad-442f-9a24-a4daf5286420",
  "order_id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
  "assignment_id": "3e54f25c-f44b-40d4-bf99-b277ee042f69",
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

`POST /api/driver/v1/work-sessions/5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:39Z",
    "sequence": 1793132439774
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:39.789291Z",
  "last_location_at": "2026-10-27T20:20:39.789291Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e060eac4-c4ad-442f-9a24-a4daf5286420/arrive` → **200**

```json
{
  "command_id": "55162c6b-9461-47ad-a242-d41f1b8e78cb",
  "expected_version": 0
}
```

```json
{
  "id": "e060eac4-c4ad-442f-9a24-a4daf5286420",
  "order_id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
  "assignment_id": "3e54f25c-f44b-40d4-bf99-b277ee042f69",
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
  "arrived_at": "2026-10-27T20:20:39.816478Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e060eac4-c4ad-442f-9a24-a4daf5286420/start` → **200**

```json
{
  "command_id": "df95cdb2-a200-4fd5-90a4-9730ea2c6277",
  "expected_version": 1
}
```

```json
{
  "id": "e060eac4-c4ad-442f-9a24-a4daf5286420",
  "order_id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
  "assignment_id": "3e54f25c-f44b-40d4-bf99-b277ee042f69",
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
  "arrived_at": "2026-10-27T20:20:39.816478Z",
  "started_at": "2026-10-27T20:20:39.846912Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:39Z",
    "sequence": 1793132439866
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:39.884974Z",
  "last_location_at": "2026-10-27T20:20:39.884974Z",
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
  "device_ref": "sandbox-12625"
}
```

```json
{
  "challenge_id": "69f32e10-5d33-49cf-926b-fe39e2c23018",
  "expires_at": "2026-10-27T20:25:39.905764Z",
  "resend_available_at": "2026-10-27T20:20:40.905764Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "194352",
  "sent_at": "2026-10-27T20:20:39.907587487Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69f32e10-5d33-49cf-926b-fe39e2c23018",
  "code": "194352",
  "device_ref": "sandbox-12625"
}
```

```json
{
  "session_id": "05ae17c5-0aed-493d-82d2-e8efb2bb1281",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzMzOSwiaWF0IjoxNzkzMTMyNDM5LCJqdGkiOiJiMjc3N2E2MC03NzhlLTQ5ODktOTM4Ni1iMTE0Yjc0ZWNhNzciLCJzaWQiOiIwNWFlMTdjNS0wYWVkLTQ5M2QtODJkMi1lOGVmYjJiYjEyODEifQ.Ac2lW20e-_DoD70pTRdZAjYRsWATAk-aEtuoi6PbAN4",
  "access_expires_at": "2026-10-27T20:35:39.950697357Z",
  "refresh_token": "MVW3lu28aATkjsSNAD1t5jmiTIpkTuL0v0wgpIhJdzA",
  "refresh_expires_at": "2026-11-26T20:20:39.950280179Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ae45b7db-3352-475d-89ff-57eeeab8897d",
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
  "last_heartbeat_at": "2026-10-27T20:20:15.85133Z",
  "last_location_at": "2026-10-27T20:20:15.85133Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ae45b7db-3352-475d-89ff-57eeeab8897d/handover` → **200**

```json
{
  "command_id": "2638d7b5-8cb7-4a04-ab01-0686d5c0d75b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ae45b7db-3352-475d-89ff-57eeeab8897d",
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
  "last_heartbeat_at": "2026-10-27T20:20:15.85133Z",
  "last_location_at": "2026-10-27T20:20:15.85133Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ae45b7db-3352-475d-89ff-57eeeab8897d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:40Z",
    "sequence": 1793132440246
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ae45b7db-3352-475d-89ff-57eeeab8897d",
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
  "last_heartbeat_at": "2026-10-27T20:20:40.04002Z",
  "last_location_at": "2026-10-27T20:20:40.04002Z",
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
  "session_id": "b0b7698f-4e8f-4edd-8268-770f191702a9",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNDAsImlhdCI6MTc5MzEzMjQ0MCwianRpIjoiMjlmZDVjNjYtYzg3Yi00NDI1LWEwMGItMDMyM2IyZTcyZGE3Iiwic2lkIjoiYjBiNzY5OGYtNGU4Zi00ZWRkLTgyNjgtNzcwZjE5MTcwMmE5In0.vEn-f06Bs9Et7bGhE96hjznDm7_bvey5C-EKylLSA_M",
  "access_expires_at": "2026-10-27T20:35:40.260877747Z",
  "refresh_token": "1f3URX1OtYJNzq45wVQQZZPUyh5vIO9gMzdk6T-OZyI",
  "refresh_expires_at": "2026-10-28T08:20:40.260557215Z",
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
  "session_id": "b3b63d38-80e0-4a0a-a2fc-66f66d8c5aed",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNDAsImlhdCI6MTc5MzEzMjQ0MCwianRpIjoiOWM5MTc2M2EtNDRlZS00YTA5LWI1MWMtNjgwZDBjMGFiNDQxIiwic2lkIjoiYjNiNjNkMzgtODBlMC00YTBhLWEyZmMtNjZmNjZkOGM1YWVkIn0.nC6Oedhln5izSerUgumi4x0FprC6Hx3Y0kbd5htG34A",
  "access_expires_at": "2026-10-27T20:35:40.480981899Z",
  "refresh_token": "dOS7pnqwQRP4IVk96ww73PXlw5JYGm_rQOAsO9YKcik",
  "refresh_expires_at": "2026-10-28T08:20:40.48063076Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7b316453-1c82-4fae-9e60-3fa3b650cf9d` → **200**

```json
{
  "id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
  "short_number": 7,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9b400914-2341-4ba2-b386-70376ed9b24d",
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
    "id": "3e54f25c-f44b-40d4-bf99-b277ee042f69",
    "order_id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e060eac4-c4ad-442f-9a24-a4daf5286420",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T20:20:39.69295Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7b316453-1c82-4fae-9e60-3fa3b650cf9d/interrupt` → **200**

```json
{
  "command_id": "d215d345-9890-441c-a3be-e042383e81d5",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
    "short_number": 7,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "9b400914-2341-4ba2-b386-70376ed9b24d",
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
      "id": "3e54f25c-f44b-40d4-bf99-b277ee042f69",
      "order_id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "e060eac4-c4ad-442f-9a24-a4daf5286420",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T20:20:39.69295Z",
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
    "id": "7443e7b1-7a42-40e2-9e19-02a4ad6675f8",
    "short_number": 8,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "9b400914-2341-4ba2-b386-70376ed9b24d",
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
    "id": "e768d86e-bed3-4643-9562-e84d67fd4ebf",
    "order_id": "7443e7b1-7a42-40e2-9e19-02a4ad6675f8",
    "expires_at": "2026-10-27T20:20:55.544201Z",
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

`POST /api/driver/v1/offers/e768d86e-bed3-4643-9562-e84d67fd4ebf/accept` → **200**

```json
{
  "command_id": "53a5e748-fec0-456c-a2c6-11f4aa52a28f"
}
```

```json
{
  "id": "3bcb061c-f1b6-46bb-8ba0-c85c6042f113",
  "order_id": "7443e7b1-7a42-40e2-9e19-02a4ad6675f8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5f44e1f9-9cfd-41aa-92f8-e2a85e5d4a07",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5f44e1f9-9cfd-41aa-92f8-e2a85e5d4a07",
  "order_id": "7443e7b1-7a42-40e2-9e19-02a4ad6675f8",
  "assignment_id": "3bcb061c-f1b6-46bb-8ba0-c85c6042f113",
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
  "session_id": "ae45b7db-3352-475d-89ff-57eeeab8897d",
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
  "last_heartbeat_at": "2026-10-27T20:20:40.04002Z",
  "last_location_at": "2026-10-27T20:20:40.04002Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/ae45b7db-3352-475d-89ff-57eeeab8897d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:40Z",
    "sequence": 1793132440654
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ae45b7db-3352-475d-89ff-57eeeab8897d",
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
  "last_heartbeat_at": "2026-10-27T20:20:40.66831Z",
  "last_location_at": "2026-10-27T20:20:40.66831Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5f44e1f9-9cfd-41aa-92f8-e2a85e5d4a07/arrive` → **200**

```json
{
  "command_id": "d4057bca-0fb7-4298-95f2-27252e9e1518",
  "expected_version": 0
}
```

```json
{
  "id": "5f44e1f9-9cfd-41aa-92f8-e2a85e5d4a07",
  "order_id": "7443e7b1-7a42-40e2-9e19-02a4ad6675f8",
  "assignment_id": "3bcb061c-f1b6-46bb-8ba0-c85c6042f113",
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
  "arrived_at": "2026-10-27T20:20:40.697759Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5f44e1f9-9cfd-41aa-92f8-e2a85e5d4a07/start` → **200**

```json
{
  "command_id": "b1000887-8be7-465c-966b-aeeffcdb05ca",
  "expected_version": 1
}
```

```json
{
  "id": "5f44e1f9-9cfd-41aa-92f8-e2a85e5d4a07",
  "order_id": "7443e7b1-7a42-40e2-9e19-02a4ad6675f8",
  "assignment_id": "3bcb061c-f1b6-46bb-8ba0-c85c6042f113",
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
  "arrived_at": "2026-10-27T20:20:40.697759Z",
  "started_at": "2026-10-27T20:20:40.728236Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5f44e1f9-9cfd-41aa-92f8-e2a85e5d4a07/complete` → **200**

```json
{
  "command_id": "02b6cc43-08d8-4f4a-a03a-8686af997794",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:20:40Z"
}
```

```json
{
  "id": "5f44e1f9-9cfd-41aa-92f8-e2a85e5d4a07",
  "order_id": "7443e7b1-7a42-40e2-9e19-02a4ad6675f8",
  "assignment_id": "3bcb061c-f1b6-46bb-8ba0-c85c6042f113",
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
  "arrived_at": "2026-10-27T20:20:40.697759Z",
  "started_at": "2026-10-27T20:20:40.728236Z",
  "completed_at": "2026-10-27T20:20:40.760683Z",
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
    "id": "7443e7b1-7a42-40e2-9e19-02a4ad6675f8",
    "short_number": 8,
    "status": "FULFILLED",
    "created_at": "2026-10-27T20:20:40.537883Z",
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
    "id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
    "short_number": 7,
    "status": "CANCELLED",
    "created_at": "2026-10-27T20:20:39.69295Z",
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

`GET /api/operator/v1/orders/7b316453-1c82-4fae-9e60-3fa3b650cf9d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T20:20:39.693357Z",
      "actor": {
        "type": "CLIENT",
        "id": "9b400914-2341-4ba2-b386-70376ed9b24d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
        "quote_id": "8cf87426-8894-4794-b61d-4174e35d7944",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T20:20:39.694653Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
        "attempt_id": "e31917d2-4aa5-43a2-9965-fb11e31193ad",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T20:20:39.698173Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9b222f34-9639-4acf-9db7-5f137c4dbb47",
        "order_id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T20:20:39.742494Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9b222f34-9639-4acf-9db7-5f137c4dbb47",
        "order_id": "7b316453-1c82-4fae-9e60-3fa3b650cf9d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3e54f25c-f44b-40d4-bf99-b277ee042f69"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 7b316453-1c82-4fae-9e60-3fa3b650cf9d, follow-up 7443e7b1-7a42-40e2-9e19-02a4ad6675f8.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-5038"
}
```

```json
{
  "challenge_id": "198321b7-e044-4210-8c69-73f858a7d683",
  "expires_at": "2026-10-27T20:25:43.859256683Z",
  "resend_available_at": "2026-10-27T20:20:44.859256683Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "805430",
  "sent_at": "2026-10-27T20:20:43.860990549Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "198321b7-e044-4210-8c69-73f858a7d683",
  "code": "805430",
  "device_ref": "sandbox-5038"
}
```

```json
{
  "session_id": "8ba22e90-4390-4397-bc5a-8b8a742eecb7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzM0MywiaWF0IjoxNzkzMTMyNDQzLCJqdGkiOiI3ZjQ4ZWE5OS01NjM5LTQ3ZGQtYTRjNC00ZWY2NDE3Y2RjZjkiLCJzaWQiOiI4YmEyMmU5MC00MzkwLTQzOTctYmM1YS04YjhhNzQyZWVjYjcifQ.qJ8k7qVW-cCbf6ii0hLwKuGWgeBHY8fjBOXZX5cn6JU",
  "access_expires_at": "2026-10-27T20:35:43.905020277Z",
  "refresh_token": "oDjMxDbAmaS2lTcSvTbi7HkOG16cj_Er6VMbuaXTUBg",
  "refresh_expires_at": "2026-11-26T20:20:43.904579984Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ae45b7db-3352-475d-89ff-57eeeab8897d",
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
  "last_heartbeat_at": "2026-10-27T20:20:40.66831Z",
  "last_location_at": "2026-10-27T20:20:40.66831Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ae45b7db-3352-475d-89ff-57eeeab8897d/handover` → **200**

```json
{
  "command_id": "f134a353-a330-45e7-ac5d-7e9cb513d7cd",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ae45b7db-3352-475d-89ff-57eeeab8897d",
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
  "last_heartbeat_at": "2026-10-27T20:20:40.66831Z",
  "last_location_at": "2026-10-27T20:20:40.66831Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ae45b7db-3352-475d-89ff-57eeeab8897d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:43Z",
    "sequence": 1793132443972
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ae45b7db-3352-475d-89ff-57eeeab8897d",
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
  "last_heartbeat_at": "2026-10-27T20:20:43.986796Z",
  "last_location_at": "2026-10-27T20:20:43.986796Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673515582",
  "device_ref": "sandbox-18904"
}
```

```json
{
  "challenge_id": "6e45a681-ab5a-4ca4-81da-edd400b08070",
  "expires_at": "2026-10-27T20:25:44.007776193Z",
  "resend_available_at": "2026-10-27T20:20:45.007776193Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673515582` → **200**

```json
{
  "phone": "+380673515582",
  "audience": "CLIENT",
  "code": "582231",
  "sent_at": "2026-10-27T20:20:44.00944125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e45a681-ab5a-4ca4-81da-edd400b08070",
  "code": "582231",
  "device_ref": "sandbox-18904"
}
```

```json
{
  "session_id": "32ed0f4b-78e9-4a22-9cba-33a050792ded",
  "subject": {
    "type": "CLIENT",
    "id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMmIyNGQ0Zi1jMWRjLTQ3MTAtYmExNS04MWFiOTA5OGRlYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzQ0LCJpYXQiOjE3OTMxMzI0NDQsImp0aSI6ImM1MDY5ZTBiLWJlZTItNGNkNy1iNjhjLTc3NGIxOWY4Y2Q5MCIsInNpZCI6IjMyZWQwZjRiLTc4ZTktNGEyMi05Y2JhLTMzYTA1MDc5MmRlZCJ9.3L6KD8Fws7C2jFJW7FbYnU8Kz6-QgtCRgSC6-4LrBjw",
  "access_expires_at": "2026-10-27T20:35:44.053455797Z",
  "refresh_token": "ZeIYkTw0-sES9XVaO8scGIThiwbojae0cZ-7Q98qV98",
  "refresh_expires_at": "2026-11-26T20:20:44.052981426Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e5e50771-10c8-49b4-9e6f-b067297e2abf",
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
  "id": "5d27f150-5caf-4fb6-ba5a-ff955fbb3941",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:25:44.082179Z",
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
  "command_id": "d06f5361-4a93-4258-828e-e422169b0fd6",
  "quote_id": "5d27f150-5caf-4fb6-ba5a-ff955fbb3941",
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
    "phone": "+380676559974"
  }
}
```

```json
{
  "id": "57cb2ff9-3446-4b25-aabe-4356b936a69e",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-27T20:20:44.113014Z",
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
    "id": "6b94d4b3-44fe-4d6b-908c-338960463ea3",
    "order_id": "57cb2ff9-3446-4b25-aabe-4356b936a69e",
    "expires_at": "2026-10-27T20:20:59.115177Z",
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

`POST /api/driver/v1/offers/6b94d4b3-44fe-4d6b-908c-338960463ea3/accept` → **200**

```json
{
  "command_id": "563eccaa-4099-4d9b-b74a-9d2bd2de56ea"
}
```

```json
{
  "id": "d86bf15b-ec70-4d66-802a-4f7127918b2d",
  "order_id": "57cb2ff9-3446-4b25-aabe-4356b936a69e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5a38dc54-8894-4beb-8972-aa67c5141812",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5a38dc54-8894-4beb-8972-aa67c5141812",
  "order_id": "57cb2ff9-3446-4b25-aabe-4356b936a69e",
  "assignment_id": "d86bf15b-ec70-4d66-802a-4f7127918b2d",
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
    "phone": "+380676559974"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d849c84-be83-4e9e-93e6-a4eef28e0151",
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
  "id": "b94a4b4a-7c60-48b5-ad5c-9961a664bf84",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:25:44.216042Z",
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
  "command_id": "d04bc26c-1284-425d-9011-a03edb84cbcc",
  "quote_id": "b94a4b4a-7c60-48b5-ad5c-9961a664bf84",
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
  "id": "d655214b-398a-4bf1-b34e-ad17d7051932",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-27T20:20:44.244869Z",
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
  "command_id": "67196e2b-3157-4603-b687-6df652325fb4",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T23:20:44Z"
}
```

```json
{
  "id": "dd1f35ee-3671-4277-9179-180d3e689556",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:25:44.279882Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T23:20:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "227dc4b4-3885-486a-8aae-928d8a1b70ef",
  "quote_id": "dd1f35ee-3671-4277-9179-180d3e689556",
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
  "pickup_at": "2026-10-27T23:20:44Z"
}
```

```json
{
  "id": "58e2f151-3a45-4f0c-9292-bded3c4bab22",
  "short_number": 11,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T20:20:44.309734Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T23:20:44Z",
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
  "command_id": "cce86170-6ace-44d2-bfa6-e47c83e7ee30",
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
  "id": "6f6ca483-83a4-4a2e-845c-824ec109d506",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:25:44.340470Z",
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
  "command_id": "ba2b9b91-5a27-4015-bcf4-802cae41e476",
  "quote_id": "6f6ca483-83a4-4a2e-845c-824ec109d506",
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
  "correlation_id": "c57559fa-6afd-43b0-bc81-a7752b8023e8"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "58e2f151-3a45-4f0c-9292-bded3c4bab22",
      "short_number": 11,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-27T20:20:44.309734Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T23:20:44Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "d655214b-398a-4bf1-b34e-ad17d7051932",
      "short_number": 10,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-27T20:20:44.244869Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "57cb2ff9-3446-4b25-aabe-4356b936a69e",
      "short_number": 9,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "d655214b-398a-4bf1-b34e-ad17d7051932",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-27T20:20:44.244869Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/57cb2ff9-3446-4b25-aabe-4356b936a69e` → **200**

```json
{
  "id": "57cb2ff9-3446-4b25-aabe-4356b936a69e",
  "short_number": 9,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "d86bf15b-ec70-4d66-802a-4f7127918b2d",
    "order_id": "57cb2ff9-3446-4b25-aabe-4356b936a69e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5a38dc54-8894-4beb-8972-aa67c5141812",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T20:20:44.113014Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/57cb2ff9-3446-4b25-aabe-4356b936a69e/cancel` → **200**

```json
{
  "command_id": "e87d19c6-d784-4237-93d4-74701a4d2000",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "57cb2ff9-3446-4b25-aabe-4356b936a69e",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "d86bf15b-ec70-4d66-802a-4f7127918b2d",
    "order_id": "57cb2ff9-3446-4b25-aabe-4356b936a69e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5a38dc54-8894-4beb-8972-aa67c5141812",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T20:20:44.113014Z",
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

`GET /api/rider/v1/orders/d655214b-398a-4bf1-b34e-ad17d7051932` → **200**

```json
{
  "id": "d655214b-398a-4bf1-b34e-ad17d7051932",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-27T20:20:44.244869Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d655214b-398a-4bf1-b34e-ad17d7051932/cancel` → **200**

```json
{
  "command_id": "f7d4ffb7-0148-47f2-99b1-8fbef5a0e8a7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d655214b-398a-4bf1-b34e-ad17d7051932",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-27T20:20:44.244869Z",
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

`GET /api/rider/v1/orders/58e2f151-3a45-4f0c-9292-bded3c4bab22` → **200**

```json
{
  "id": "58e2f151-3a45-4f0c-9292-bded3c4bab22",
  "short_number": 11,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T20:20:44.309734Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T23:20:44Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/58e2f151-3a45-4f0c-9292-bded3c4bab22/cancel` → **200**

```json
{
  "command_id": "9922649f-b670-4440-9a36-adaf58fb0e39",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "58e2f151-3a45-4f0c-9292-bded3c4bab22",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "22b24d4f-c1dc-4710-ba15-81ab9098dea6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T20:20:44.309734Z",
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
  "pickup_at": "2026-10-27T23:20:44Z",
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
  "session_id": "ae45b7db-3352-475d-89ff-57eeeab8897d",
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
  "last_heartbeat_at": "2026-10-27T20:20:43.986796Z",
  "last_location_at": "2026-10-27T20:20:43.986796Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ae45b7db-3352-475d-89ff-57eeeab8897d/close` → **200**

```json
{
  "command_id": "00609dc5-e792-44b3-836e-ee731e5be0c3",
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

Done: orders 57cb2ff9-3446-4b25-aabe-4356b936a69e, d655214b-398a-4bf1-b34e-ad17d7051932, 58e2f151-3a45-4f0c-9292-bded3c4bab22.

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
  "session_id": "858969e0-3d07-47f5-aed0-33c53007ead6",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNDQsImlhdCI6MTc5MzEzMjQ0NCwianRpIjoiNmFlNDYzOTItY2ZhNi00Mzk5LWFhZmQtNGQzZjEzMTczNmRhIiwic2lkIjoiODU4OTY5ZTAtM2QwNy00N2Y1LWFlZDAtMzNjNTMwMDdlYWQ2In0.tinZe_WhSV8cj1jtZu-kECf8IDyOVjtr07B0g4VRNUM",
  "access_expires_at": "2026-10-27T20:35:44.842208691Z",
  "refresh_token": "qHhnioC699u0oFXD4nfw2YP1WVXe9QeYMf983-vugjw",
  "refresh_expires_at": "2026-10-28T08:20:44.841908479Z",
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
  "session_id": "1d31a96f-50c7-49a8-b81a-38cc86c86053",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNDUsImlhdCI6MTc5MzEzMjQ0NSwianRpIjoiNzliODc3NDAtMmE1Zi00Zjk3LTk4MjAtZWRhM2NkNDUxODY4Iiwic2lkIjoiMWQzMWE5NmYtNTBjNy00OWE4LWI4MWEtMzhjYzg2Yzg2MDUzIn0.AA6NrFfYtXH4S35jC6FwoYOa3Dm0UKtOWBpwMygU2fQ",
  "access_expires_at": "2026-10-27T20:35:45.067954715Z",
  "refresh_token": "7HhYSBKct11fNDrGIMMg4t3A-c9fwsFPNms2T6Vv4NY",
  "refresh_expires_at": "2026-10-28T08:20:45.067453156Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29544"
}
```

```json
{
  "challenge_id": "0920393b-0a67-4c3b-a3e4-86e8a240f6ec",
  "expires_at": "2026-10-27T20:25:45.090924144Z",
  "resend_available_at": "2026-10-27T20:20:46.090924144Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "963413",
  "sent_at": "2026-10-27T20:20:45.092789312Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0920393b-0a67-4c3b-a3e4-86e8a240f6ec",
  "code": "963413",
  "device_ref": "sandbox-29544"
}
```

```json
{
  "session_id": "7dc50c7b-958b-48f6-988b-ec6d35704473",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzM0NSwiaWF0IjoxNzkzMTMyNDQ1LCJqdGkiOiIzYTUyMTllZi1lNzYwLTRjNzctODlhYi1jNjEwMTM3NmZmNjAiLCJzaWQiOiI3ZGM1MGM3Yi05NThiLTQ4ZjYtOTg4Yi1lYzZkMzU3MDQ0NzMifQ.vCxo80wqO9s80jn-jEp-kH_kmlIqT4aKl2_TWxqwHw4",
  "access_expires_at": "2026-10-27T20:35:45.136550511Z",
  "refresh_token": "EnBSiYKrnzxwu2fUFURQTdfwKy2zJbleCtOKP0VC9Kg",
  "refresh_expires_at": "2026-11-26T20:20:45.136093333Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:39.884974Z",
  "last_location_at": "2026-10-27T20:20:39.884974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29/handover` → **200**

```json
{
  "command_id": "71e8f6c1-d716-4597-8144-a0c3f6b14e00",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:39.884974Z",
  "last_location_at": "2026-10-27T20:20:39.884974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:45Z",
    "sequence": 1793132445202
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:45.217156Z",
  "last_location_at": "2026-10-27T20:20:45.217156Z",
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
  "command_id": "596419bf-6523-4742-b642-4d6a7b7a6543",
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
  "effective_at": "2026-10-27T20:20:45.270499Z",
  "changed_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T20:20:45.294184868Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3116c061-799f-4be4-ab5e-d2a9a6fb8576",
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
  "id": "548b6acc-e271-4204-b6ae-7e9b4fbbc623",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T20:25:45.322982Z",
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
  "command_id": "dde648ef-4178-4e1b-86f6-4432b020e856",
  "quote_id": "548b6acc-e271-4204-b6ae-7e9b4fbbc623",
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
    "phone": "+3806711116237"
  }
}
```

```json
{
  "id": "39fe1410-4955-4158-b4e5-b24c265b165e",
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
  "created_at": "2026-10-27T20:20:45.352281Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116237"
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
    "id": "b1925670-c55a-4ac6-b9d3-9d3052b4b7c8",
    "order_id": "39fe1410-4955-4158-b4e5-b24c265b165e",
    "expires_at": "2026-10-27T20:21:00.355565Z",
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

`POST /api/driver/v1/offers/b1925670-c55a-4ac6-b9d3-9d3052b4b7c8/accept` → **200**

```json
{
  "command_id": "5daf9f79-69d1-42ef-8ff7-a788bb1c3a7f"
}
```

```json
{
  "id": "a1f56679-5c37-41f4-87b5-a339ba1f55b1",
  "order_id": "39fe1410-4955-4158-b4e5-b24c265b165e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "52a4b258-7aea-4b70-a44a-bc31b2d5591f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "52a4b258-7aea-4b70-a44a-bc31b2d5591f",
  "order_id": "39fe1410-4955-4158-b4e5-b24c265b165e",
  "assignment_id": "a1f56679-5c37-41f4-87b5-a339ba1f55b1",
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
    "phone": "+3806711116237"
  }
}
```

`POST /api/driver/v1/work-sessions/5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:45Z",
    "sequence": 1793132445438
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:45.453161Z",
  "last_location_at": "2026-10-27T20:20:45.453161Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/52a4b258-7aea-4b70-a44a-bc31b2d5591f/arrive` → **200**

```json
{
  "command_id": "05742a44-fd6d-400d-b37a-6c80999efb11",
  "expected_version": 0
}
```

```json
{
  "id": "52a4b258-7aea-4b70-a44a-bc31b2d5591f",
  "order_id": "39fe1410-4955-4158-b4e5-b24c265b165e",
  "assignment_id": "a1f56679-5c37-41f4-87b5-a339ba1f55b1",
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
  "arrived_at": "2026-10-27T20:20:45.485693Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711116237"
  }
}
```

`POST /api/driver/v1/trips/52a4b258-7aea-4b70-a44a-bc31b2d5591f/start` → **200**

```json
{
  "command_id": "435653bd-81d9-426f-87d7-1098e3ce6254",
  "expected_version": 1
}
```

```json
{
  "id": "52a4b258-7aea-4b70-a44a-bc31b2d5591f",
  "order_id": "39fe1410-4955-4158-b4e5-b24c265b165e",
  "assignment_id": "a1f56679-5c37-41f4-87b5-a339ba1f55b1",
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
  "arrived_at": "2026-10-27T20:20:45.485693Z",
  "started_at": "2026-10-27T20:20:45.528933Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711116237"
  }
}
```

`POST /api/driver/v1/trips/52a4b258-7aea-4b70-a44a-bc31b2d5591f/complete` → **200**

```json
{
  "command_id": "e264930a-dd8d-4318-ab42-cc22cac33feb",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:20:45Z",
  "cash_received": true
}
```

```json
{
  "id": "52a4b258-7aea-4b70-a44a-bc31b2d5591f",
  "order_id": "39fe1410-4955-4158-b4e5-b24c265b165e",
  "assignment_id": "a1f56679-5c37-41f4-87b5-a339ba1f55b1",
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
  "arrived_at": "2026-10-27T20:20:45.485693Z",
  "started_at": "2026-10-27T20:20:45.528933Z",
  "completed_at": "2026-10-27T20:20:45.575788Z",
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
  "command_id": "ddc4ba23-831e-4e1d-aafd-e4197d6e35c0",
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
  "id": "15b0a547-33bd-4281-8c6f-6e6931da85ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T20:25:45.609303Z",
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
  "command_id": "104d75dc-57d7-4781-8694-209b1d68fa86",
  "quote_id": "15b0a547-33bd-4281-8c6f-6e6931da85ad",
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
    "phone": "+3806711131325"
  }
}
```

```json
{
  "id": "02daab96-83f8-4d39-b216-1be992bf8c93",
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
  "created_at": "2026-10-27T20:20:45.640895Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131325"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/02daab96-83f8-4d39-b216-1be992bf8c93` → **200**

```json
{
  "id": "02daab96-83f8-4d39-b216-1be992bf8c93",
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
  "created_at": "2026-10-27T20:20:45.640895Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131325"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/02daab96-83f8-4d39-b216-1be992bf8c93/cancel` → **200**

```json
{
  "command_id": "89e72673-ec05-47c5-80df-d2bb3e1af9f0",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "02daab96-83f8-4d39-b216-1be992bf8c93",
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
  "created_at": "2026-10-27T20:20:45.640895Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131325"
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
  "staff_id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T20:20:45.5793Z",
  "last_entries": [
    {
      "order_id": "02daab96-83f8-4d39-b216-1be992bf8c93",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T20:20:45.703184Z"
    },
    {
      "order_id": "39fe1410-4955-4158-b4e5-b24c265b165e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T20:20:45.5793Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29",
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
  "last_heartbeat_at": "2026-10-27T20:20:45.453161Z",
  "last_location_at": "2026-10-27T20:20:45.453161Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5a67ae8d-5f82-4e6b-bb0e-8cc19a5e0a29/close` → **200**

```json
{
  "command_id": "a48505d4-7fe2-4c3d-ac09-556c759909c8",
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

Done: operator bonus for fulfilled 39fe1410-4955-4158-b4e5-b24c265b165e and operator-fault cancellation 02daab96-83f8-4d39-b216-1be992bf8c93.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676186691",
  "device_ref": "sandbox-20747"
}
```

```json
{
  "challenge_id": "f9d8b1b5-627b-4f7f-b44f-06607da16b50",
  "expires_at": "2026-10-27T20:25:47.830295929Z",
  "resend_available_at": "2026-10-27T20:20:48.830295929Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676186691` → **200**

```json
{
  "phone": "+380676186691",
  "audience": "CLIENT",
  "code": "113277",
  "sent_at": "2026-10-27T20:20:47.832001377Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678417192",
  "device_ref": "sandbox-31378",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0787c5e7-4245-4650-9ebe-c026554e8aea",
  "expires_at": "2026-10-27T20:25:47.87645971Z",
  "resend_available_at": "2026-10-27T20:20:48.87645971Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678417192` → **200**

```json
{
  "phone": "+380678417192",
  "audience": "CLIENT",
  "code": "775372",
  "sent_at": "2026-10-27T20:20:47.878198728Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670710000",
  "device_ref": "sandbox-3528"
}
```

```json
{
  "challenge_id": "655f3264-002d-4741-b8e9-c41cf2898817",
  "expires_at": "2026-10-27T20:25:47.918769723Z",
  "resend_available_at": "2026-10-27T20:20:48.918769723Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670710000` → **200**

```json
{
  "phone": "+380670710000",
  "audience": "CLIENT",
  "code": "490621",
  "sent_at": "2026-10-27T20:20:47.920795013Z",
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
  "session_id": "3fa75bb4-7e33-4af1-8da1-4069918f2bc1",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNDgsImlhdCI6MTc5MzEzMjQ0OCwianRpIjoiZDUxMzJjN2EtN2RhOC00N2ZjLWJiM2QtYTFlMjUyYTdlM2RlIiwic2lkIjoiM2ZhNzViYjQtN2UzMy00YWYxLThkYTEtNDA2OTkxOGYyYmMxIn0.YyYfs4ymeljIrNwnaIMTyoRGQKSkXHWEYGrt5GCkS5Y",
  "access_expires_at": "2026-10-27T20:35:48.168450315Z",
  "refresh_token": "rRqNbfIxzRLYK8vDFh60KY4rqlE2uHZe42_TTmYj9ro",
  "refresh_expires_at": "2026-10-28T08:20:48.168053688Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670710000` → **200**

```json
{
  "deliveries": [
    {
      "id": "1f6d5c61-bf07-42ad-b527-d62087aa09f6",
      "challenge_id": "655f3264-002d-4741-b8e9-c41cf2898817",
      "phone": "+380670710000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-51c3d5cd-e46e-4269-9966-037b3f4d5c41",
      "error": null,
      "attempted_at": "2026-10-27T20:20:47.920968Z"
    },
    {
      "id": "9ecc2df5-a763-41d5-b4b5-cf876a8135f0",
      "challenge_id": "655f3264-002d-4741-b8e9-c41cf2898817",
      "phone": "+380670710000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-27T20:20:47.920346Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670710000` → **200**

```json
{
  "phone": "+380670710000",
  "audience": "CLIENT",
  "code": "490621",
  "sent_at": "2026-10-27T20:20:47.920795013Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678417192` → **200**

```json
{
  "deliveries": [
    {
      "id": "79fe3fef-4592-4e65-b4a8-6c5a22db5181",
      "challenge_id": "0787c5e7-4245-4650-9ebe-c026554e8aea",
      "phone": "+380678417192",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3f0ed1cc-04b8-4731-b101-16404ad2edac",
      "error": null,
      "attempted_at": "2026-10-27T20:20:47.878369Z"
    }
  ]
}
```

Done: SMS to +380676186691, a call to +380678417192, SMS then a call to +380670710000.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634497450",
  "device_ref": "sandbox-3703"
}
```

```json
{
  "challenge_id": "4a68ece6-a9e9-46cc-ae6f-5e01eb0e2427",
  "expires_at": "2026-10-27T20:25:48.269993076Z",
  "resend_available_at": "2026-10-27T20:20:49.269993076Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634497450` → **200**

```json
{
  "phone": "+380634497450",
  "audience": "CLIENT",
  "code": "750309",
  "sent_at": "2026-10-27T20:20:48.271768594Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a68ece6-a9e9-46cc-ae6f-5e01eb0e2427",
  "code": "750309",
  "device_ref": "sandbox-3703"
}
```

```json
{
  "session_id": "2ca1c4f1-cab9-4dc6-8ea0-9385da442b34",
  "subject": {
    "type": "CLIENT",
    "id": "c9a14b40-b8d7-41c6-bf5b-ed7819f387e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOWExNGI0MC1iOGQ3LTQxYzYtYmY1Yi1lZDc4MTlmMzg3ZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzQ4LCJpYXQiOjE3OTMxMzI0NDgsImp0aSI6ImIyYWYyODAxLTVlNjktNGYzMi1iZWIyLWYzNTQxOWU3OGFiZiIsInNpZCI6IjJjYTFjNGYxLWNhYjktNGRjNi04ZWEwLTkzODVkYTQ0MmIzNCJ9.t6Q2szZQCpICZouQbfreF1alm0Bg6RZSS1GxEmSGXxQ",
  "access_expires_at": "2026-10-27T20:35:48.316934518Z",
  "refresh_token": "Lpl_8V_XbERlKGtr_ix5jtvGMrpEB3SZ2ysHxbaVHm0",
  "refresh_expires_at": "2026-11-26T20:20:48.316541506Z",
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
  "session_id": "a5762846-5c45-4bb9-9f42-1fbe86c70ad9",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNDgsImlhdCI6MTc5MzEzMjQ0OCwianRpIjoiYmRiMjMxNjUtMDVlYS00MTYwLTk0NGUtZjUyNWViZmMzNzkzIiwic2lkIjoiYTU3NjI4NDYtNWM0NS00YmI5LTlmNDItMWZiZTg2YzcwYWQ5In0.KEwjWVafvBqFaQfPQb2oqnp9U8TICVuy4p95NCN5Fzg",
  "access_expires_at": "2026-10-27T20:35:48.609863471Z",
  "refresh_token": "NxAuYlCj5y2AH3YtSJ9I_Egc-xFrpt-P6EgrYLOyWMg",
  "refresh_expires_at": "2026-10-28T08:20:48.609506673Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380634497450` → **200**

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
  "correlation_id": "10482c48-8aa5-4cb1-b0f6-195cd3d35662"
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
  "session_id": "70fcd3ec-83ce-4aeb-93ca-200ccea409c2",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNDgsImlhdCI6MTc5MzEzMjQ0OCwianRpIjoiYTE1NjZjYzgtNTM5NS00MjY5LTllZGQtNWEzNzM4MDE3MWMwIiwic2lkIjoiNzBmY2QzZWMtODNjZS00YWViLTkzY2EtMjAwY2NlYTQwOWMyIn0.5cg4B-hjtNZJjNG_uOYC4UJGhD06J9xtG48HG7ET7Pc",
  "access_expires_at": "2026-10-27T20:35:48.892724082Z",
  "refresh_token": "iYihyHO2HF9JvkolQRZ_4q2ZHN_4TKVgJ1kyVlELbHU",
  "refresh_expires_at": "2026-10-28T08:20:48.892335908Z",
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
  "command_id": "b484d09d-43bf-478c-8be6-5f09c133a7a7",
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
  "changed_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T20:20:48.949013367Z"
}
```

## The rider books the airport for 2026-10-27T23:20:48Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600501694",
  "device_ref": "sandbox-5159"
}
```

```json
{
  "challenge_id": "26d0b2d7-ba9d-4a42-b73b-7e549f4251ca",
  "expires_at": "2026-10-27T20:25:48.976200818Z",
  "resend_available_at": "2026-10-27T20:20:49.976200818Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600501694` → **200**

```json
{
  "phone": "+48600501694",
  "audience": "CLIENT",
  "code": "340894",
  "sent_at": "2026-10-27T20:20:48.977745179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26d0b2d7-ba9d-4a42-b73b-7e549f4251ca",
  "code": "340894",
  "device_ref": "sandbox-5159"
}
```

```json
{
  "session_id": "c6d2b2f0-5ee0-4b3c-af0a-fa7d5319bf98",
  "subject": {
    "type": "CLIENT",
    "id": "bb1863c0-32f9-48a5-9ce6-72081b766324"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYjE4NjNjMC0zMmY5LTQ4YTUtOWNlNi03MjA4MWI3NjYzMjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzQ5LCJpYXQiOjE3OTMxMzI0NDksImp0aSI6ImZhYzBiMTgyLTRkNDYtNDc0OC1iNGM4LTdkNWUyNTM0Nzk1OSIsInNpZCI6ImM2ZDJiMmYwLTVlZTAtNGIzYy1hZjBhLWZhN2Q1MzE5YmY5OCJ9.aMiTyFajSUEsjFGrp_DOmhR0ngpvfT6CAQ4Bbssy4YM",
  "access_expires_at": "2026-10-27T20:35:49.021193461Z",
  "refresh_token": "-xTp_UuqOjCov9N9djJh4SE1KcqEy5Q_YHpmDrIPp0U",
  "refresh_expires_at": "2026-11-26T20:20:49.020810444Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9cdb92e5-8f03-4b52-b7bb-7d5e9508af2b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T23:20:48Z"
}
```

```json
{
  "id": "8ed4ce39-e26e-473e-8718-ad3129070d81",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T20:25:49.048054Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T23:20:48Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "55d23476-0f8a-4568-8899-bbe109f9f0e3",
  "quote_id": "8ed4ce39-e26e-473e-8718-ad3129070d81",
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
  "pickup_at": "2026-10-27T23:20:48Z"
}
```

```json
{
  "id": "63b71899-a2a7-4159-bd26-182f95cc6581",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bb1863c0-32f9-48a5-9ce6-72081b766324",
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
  "created_at": "2026-10-27T20:20:49.07627Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T23:20:48Z",
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
  "device_ref": "sandbox-14040"
}
```

```json
{
  "challenge_id": "9540fc10-9dc6-424a-8dc4-aba7efdf9cf4",
  "expires_at": "2026-10-27T20:25:49.10126252Z",
  "resend_available_at": "2026-10-27T20:20:50.10126252Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "729858",
  "sent_at": "2026-10-27T20:20:49.102708167Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9540fc10-9dc6-424a-8dc4-aba7efdf9cf4",
  "code": "729858",
  "device_ref": "sandbox-14040"
}
```

```json
{
  "session_id": "3d3d7f12-8c69-4934-9f72-a67517f7dfd4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzM0OSwiaWF0IjoxNzkzMTMyNDQ5LCJqdGkiOiIyNTA5ZDk2ZC00MmYxLTQ5ZGEtODdhOS1hNTQwYWY2ZWQxMTciLCJzaWQiOiIzZDNkN2YxMi04YzY5LTQ5MzQtOWY3Mi1hNjc1MTdmN2RmZDQifQ.fE5XOxsHTmFvbrDCfhpFrsVU3-WNtziJYHcY4P3b5dE",
  "access_expires_at": "2026-10-27T20:35:49.145889497Z",
  "refresh_token": "kkxV6C_1aERzERrXfVXGdxy-Quj7jNZXFbAWXZKEHik",
  "refresh_expires_at": "2026-11-26T20:20:49.145349433Z",
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
  "command_id": "ed28738e-5246-4b9d-84d5-02edc31d54f1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:49Z",
    "sequence": 1793132449191
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e81ff0f4-6a4c-42a3-99fa-9da505d0c964",
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
  "last_heartbeat_at": "2026-10-27T20:20:49.212759Z",
  "last_location_at": "2026-10-27T20:20:49.212759Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "63b71899-a2a7-4159-bd26-182f95cc6581",
      "short_number": 14,
      "pickup_at": "2026-10-27T23:20:48Z",
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

`POST /api/driver/v1/preorders/63b71899-a2a7-4159-bd26-182f95cc6581/reserve` → **200**

```json
{
  "command_id": "6de4f45f-f563-4288-8fb8-57e25604c0e6"
}
```

```json
{
  "id": "3adfe37b-325e-4806-8859-cd5be95df435",
  "state": "RESERVED",
  "order": {
    "order_id": "63b71899-a2a7-4159-bd26-182f95cc6581",
    "short_number": 14,
    "pickup_at": "2026-10-27T23:20:48Z",
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
  "reserved_at": "2026-10-27T20:20:49.292797Z",
  "confirm_from": "2026-10-27T22:50:48Z",
  "confirm_until": "2026-10-27T23:00:48Z",
  "drop_until": "2026-10-27T22:20:48Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "3adfe37b-325e-4806-8859-cd5be95df435",
      "state": "RESERVED",
      "order": {
        "order_id": "63b71899-a2a7-4159-bd26-182f95cc6581",
        "short_number": 14,
        "pickup_at": "2026-10-27T23:20:48Z",
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
      "reserved_at": "2026-10-27T20:20:49.292797Z",
      "confirm_from": "2026-10-27T22:50:48Z",
      "confirm_until": "2026-10-27T23:00:48Z",
      "drop_until": "2026-10-27T22:20:48Z"
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
      "id": "3adfe37b-325e-4806-8859-cd5be95df435",
      "state": "RESERVED",
      "order": {
        "order_id": "63b71899-a2a7-4159-bd26-182f95cc6581",
        "short_number": 14,
        "pickup_at": "2026-10-27T23:20:48Z",
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
      "reserved_at": "2026-10-27T20:20:49.292797Z",
      "confirm_from": "2026-10-27T22:50:48Z",
      "confirm_until": "2026-10-27T23:00:48Z",
      "drop_until": "2026-10-27T22:20:48Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/3adfe37b-325e-4806-8859-cd5be95df435/confirm` → **409**

```json
{
  "command_id": "22e3835b-6f90-48bc-b783-c645e6bfa8fe"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/3adfe37b-325e-4806-8859-cd5be95df435/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e1321a5d-fa86-4403-b37c-7d4521f1d426"
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
  "session_id": "86f94f95-c42f-44c0-8966-5e4c84082aa2",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNDksImlhdCI6MTc5MzEzMjQ0OSwianRpIjoiNDA1ZWQxZmItNjdhMC00MzI3LWFjZDgtNDFmMDk3N2U1ZDU3Iiwic2lkIjoiODZmOTRmOTUtYzQyZi00NGMwLTg5NjYtNWU0Yzg0MDgyYWEyIn0.PTEW72naiveOrGzvUheUaoAFq9paGqj2Vpep_D8OWm0",
  "access_expires_at": "2026-10-27T20:35:49.58518571Z",
  "refresh_token": "IQ3ISVxUHygOHVx8pFnc3ozxrrZdmHkmHbdxFnPU800",
  "refresh_expires_at": "2026-10-28T08:20:49.584812188Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/63b71899-a2a7-4159-bd26-182f95cc6581` → **200**

```json
{
  "id": "63b71899-a2a7-4159-bd26-182f95cc6581",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "bb1863c0-32f9-48a5-9ce6-72081b766324",
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
  "created_at": "2026-10-27T20:20:49.07627Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T23:20:48Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "3adfe37b-325e-4806-8859-cd5be95df435",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T20:20:49.292797Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/63b71899-a2a7-4159-bd26-182f95cc6581/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T20:20:49.077086Z",
      "actor": {
        "type": "CLIENT",
        "id": "bb1863c0-32f9-48a5-9ce6-72081b766324",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "63b71899-a2a7-4159-bd26-182f95cc6581",
        "preorder": true,
        "quote_id": "8ed4ce39-e26e-473e-8718-ad3129070d81",
        "pickup_at": "2026-10-27T23:20:48Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T20:20:49.293898Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "63b71899-a2a7-4159-bd26-182f95cc6581",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "3adfe37b-325e-4806-8859-cd5be95df435"
      }
    }
  ]
}
```

Done: pre-order 63b71899-a2a7-4159-bd26-182f95cc6581, reservation 3adfe37b-325e-4806-8859-cd5be95df435.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18979"
}
```

```json
{
  "challenge_id": "7dd66611-0542-4646-a9a4-397091086fea",
  "expires_at": "2026-10-27T20:25:49.652747178Z",
  "resend_available_at": "2026-10-27T20:20:50.652747178Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "007136",
  "sent_at": "2026-10-27T20:20:49.654584826Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7dd66611-0542-4646-a9a4-397091086fea",
  "code": "007136",
  "device_ref": "sandbox-18979"
}
```

```json
{
  "session_id": "46a7cbaf-e2e3-45f4-b6a9-e318e2bdbf55",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzM0OSwiaWF0IjoxNzkzMTMyNDQ5LCJqdGkiOiJkZWExOTU3Zi0zNDA2LTRmMjctYmIxOC00Njk1YzM0NjFiMzgiLCJzaWQiOiI0NmE3Y2JhZi1lMmUzLTQ1ZjQtYjZhOS1lMzE4ZTJiZGJmNTUifQ.50Vp_xqIcxldM8OsUbR0l48JxamPtBdT2xy_ynXOI7Y",
  "access_expires_at": "2026-10-27T20:35:49.697593361Z",
  "refresh_token": "5wjZtOZx3Za4y1r0wFdWa6Uy6GKbdWzvirqic7ZWJZw",
  "refresh_expires_at": "2026-11-26T20:20:49.69718729Z",
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
  "command_id": "81f949a8-ec5d-4615-a326-d6223d583b1b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:49Z",
    "sequence": 1793132449742
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7d326af0-bdcb-4f9d-a952-a67e5744c727",
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
  "last_heartbeat_at": "2026-10-27T20:20:49.756881Z",
  "last_location_at": "2026-10-27T20:20:49.756881Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678606022",
  "device_ref": "sandbox-15972"
}
```

```json
{
  "challenge_id": "edcca19a-a8cc-441b-bfe9-3e340711d1e9",
  "expires_at": "2026-10-27T20:25:49.781101083Z",
  "resend_available_at": "2026-10-27T20:20:50.781101083Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678606022` → **200**

```json
{
  "phone": "+380678606022",
  "audience": "CLIENT",
  "code": "850284",
  "sent_at": "2026-10-27T20:20:49.782829957Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "edcca19a-a8cc-441b-bfe9-3e340711d1e9",
  "code": "850284",
  "device_ref": "sandbox-15972"
}
```

```json
{
  "session_id": "ffac69aa-14d6-4d39-886b-00fb3237e414",
  "subject": {
    "type": "CLIENT",
    "id": "7b9a1f46-8d31-4c47-b274-81b6e3868fb1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YjlhMWY0Ni04ZDMxLTRjNDctYjI3NC04MWI2ZTM4NjhmYjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzQ5LCJpYXQiOjE3OTMxMzI0NDksImp0aSI6IjgwM2E3NDk2LTA1ZGEtNGI0Yi1iNTY3LWI2NTRmMWQxNDUwZSIsInNpZCI6ImZmYWM2OWFhLTE0ZDYtNGQzOS04ODZiLTAwZmIzMjM3ZTQxNCJ9.CBD8B8HlFvOb_vbzpq1OGNLMgQQWtBt_ZRiF30fEvH4",
  "access_expires_at": "2026-10-27T20:35:49.826073391Z",
  "refresh_token": "lt_emzmb2EAyE4kdnTsTgGmUSjI8yjkKThwoSA2hcnc",
  "refresh_expires_at": "2026-11-26T20:20:49.82571723Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7de7e1cd-a14c-49de-9d22-f10905ef659f",
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
  "id": "3a6f18b5-6a33-4ea2-9167-fb160c5f8f32",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:25:49.854278Z",
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
  "command_id": "08af11cf-93ec-4e5c-8946-c69ba59b09e4",
  "quote_id": "3a6f18b5-6a33-4ea2-9167-fb160c5f8f32",
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
  "id": "3631528a-3163-4e3b-8fae-23402e6edc57",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7b9a1f46-8d31-4c47-b274-81b6e3868fb1",
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
  "created_at": "2026-10-27T20:20:49.881419Z",
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
    "id": "5ad7d3a2-a9de-4ffd-ab03-09eac2885046",
    "order_id": "3631528a-3163-4e3b-8fae-23402e6edc57",
    "expires_at": "2026-10-27T20:21:04.883337Z",
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

`POST /api/driver/v1/offers/5ad7d3a2-a9de-4ffd-ab03-09eac2885046/accept` → **200**

```json
{
  "command_id": "3c36b2e6-64cd-420b-b8b3-aa80ad338f4e"
}
```

```json
{
  "id": "1e05718e-220a-4fa9-9f02-66cd856f9490",
  "order_id": "3631528a-3163-4e3b-8fae-23402e6edc57",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3c2eb105-0e10-41fb-92b1-ba6ea3c7ee5f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3c2eb105-0e10-41fb-92b1-ba6ea3c7ee5f",
  "order_id": "3631528a-3163-4e3b-8fae-23402e6edc57",
  "assignment_id": "1e05718e-220a-4fa9-9f02-66cd856f9490",
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

`POST /api/driver/v1/work-sessions/7d326af0-bdcb-4f9d-a952-a67e5744c727/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:49Z",
    "sequence": 1793132449962
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7d326af0-bdcb-4f9d-a952-a67e5744c727",
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
  "last_heartbeat_at": "2026-10-27T20:20:49.977223Z",
  "last_location_at": "2026-10-27T20:20:49.977223Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3c2eb105-0e10-41fb-92b1-ba6ea3c7ee5f",
  "order_id": "3631528a-3163-4e3b-8fae-23402e6edc57",
  "assignment_id": "1e05718e-220a-4fa9-9f02-66cd856f9490",
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

`POST /api/driver/v1/trips/3c2eb105-0e10-41fb-92b1-ba6ea3c7ee5f/arrive` → **200**

```json
{
  "command_id": "6800d60b-3b41-49dd-807a-8d705588c241",
  "expected_version": 0
}
```

```json
{
  "id": "3c2eb105-0e10-41fb-92b1-ba6ea3c7ee5f",
  "order_id": "3631528a-3163-4e3b-8fae-23402e6edc57",
  "assignment_id": "1e05718e-220a-4fa9-9f02-66cd856f9490",
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
  "arrived_at": "2026-10-27T20:20:50.015824Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3c2eb105-0e10-41fb-92b1-ba6ea3c7ee5f/start` → **200**

```json
{
  "command_id": "002c9d36-a80c-4121-b01f-79bfcb1f8b28",
  "expected_version": 1
}
```

```json
{
  "id": "3c2eb105-0e10-41fb-92b1-ba6ea3c7ee5f",
  "order_id": "3631528a-3163-4e3b-8fae-23402e6edc57",
  "assignment_id": "1e05718e-220a-4fa9-9f02-66cd856f9490",
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
  "arrived_at": "2026-10-27T20:20:50.015824Z",
  "started_at": "2026-10-27T20:20:50.044781Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/7d326af0-bdcb-4f9d-a952-a67e5744c727/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:50Z",
    "sequence": 1793132450644
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7d326af0-bdcb-4f9d-a952-a67e5744c727",
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
  "last_heartbeat_at": "2026-10-27T20:20:50.080107Z",
  "last_location_at": "2026-10-27T20:20:50.080107Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/3c2eb105-0e10-41fb-92b1-ba6ea3c7ee5f/complete` → **200**

```json
{
  "command_id": "0e15920f-1012-4dd1-b17f-1ffad9a6d605",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:20:50Z",
  "cash_received": true
}
```

```json
{
  "id": "3c2eb105-0e10-41fb-92b1-ba6ea3c7ee5f",
  "order_id": "3631528a-3163-4e3b-8fae-23402e6edc57",
  "assignment_id": "1e05718e-220a-4fa9-9f02-66cd856f9490",
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
  "arrived_at": "2026-10-27T20:20:50.015824Z",
  "started_at": "2026-10-27T20:20:50.044781Z",
  "completed_at": "2026-10-27T20:20:50.107892Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/3631528a-3163-4e3b-8fae-23402e6edc57/rating` → **200**

```json
{
  "command_id": "cd6afa2a-6a89-4c20-95a4-8afefff9f344",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "3631528a-3163-4e3b-8fae-23402e6edc57",
  "score": 5,
  "created_at": "2026-10-27T20:20:50.149394175Z"
}
```

`POST /api/driver/v1/orders/3631528a-3163-4e3b-8fae-23402e6edc57/rating` → **200**

```json
{
  "command_id": "ef2b77bc-4167-4274-956d-f02b2a864a32",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "3631528a-3163-4e3b-8fae-23402e6edc57",
  "score": 4,
  "created_at": "2026-10-27T20:20:50.178279348Z"
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
  "session_id": "746f7b24-99fb-42b9-acd1-9676fe087c2b",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNTAsImlhdCI6MTc5MzEzMjQ1MCwianRpIjoiOWJkMDdhZjMtZGIwMi00OTc3LWFhZWItNGZjMjQ1Nzk3YTJjIiwic2lkIjoiNzQ2ZjdiMjQtOTlmYi00MmI5LWFjZDEtOTY3NmZlMDg3YzJiIn0.wqbbkI6oh_79VN780Pen-KZv8Q16jZEkJiQmew0wqrg",
  "access_expires_at": "2026-10-27T20:35:50.429758938Z",
  "refresh_token": "YfS9aP-kH6fdSSGFWPvwlpPGs9MEgATZlr9frQi8wBk",
  "refresh_expires_at": "2026-10-28T08:20:50.429453998Z",
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
  "session_id": "75d0a18d-dbe6-49c5-b3b8-96833e6e70e2",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNTAsImlhdCI6MTc5MzEzMjQ1MCwianRpIjoiMWUzN2Q1ZjgtNTZhNS00ZDIzLWIxZTgtMTcyMTExZjFkMWUyIiwic2lkIjoiNzVkMGExOGQtZGJlNi00OWM1LWIzYjgtOTY4MzNlNmU3MGUyIn0.CxSyqPtT_TNKwOFEfbvy8k46ZBR3CxBX_ICbdVyfEns",
  "access_expires_at": "2026-10-27T20:35:50.65357771Z",
  "refresh_token": "-KDFU4aUjJpu89gmPqI3Fw4oDCsMsK4FylF9ZU4vaBk",
  "refresh_expires_at": "2026-10-28T08:20:50.653226071Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3631528a-3163-4e3b-8fae-23402e6edc57/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "3631528a-3163-4e3b-8fae-23402e6edc57",
      "author_type": "RIDER",
      "author_id": "7b9a1f46-8d31-4c47-b274-81b6e3868fb1",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T20:20:50.149394Z"
    },
    {
      "order_id": "3631528a-3163-4e3b-8fae-23402e6edc57",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "7b9a1f46-8d31-4c47-b274-81b6e3868fb1",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T20:20:50.178279Z"
    }
  ]
}
```

Done: ratings for order 3631528a-3163-4e3b-8fae-23402e6edc57.

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
  "session_id": "a7f3361c-2fc7-4c2e-83b9-3b6501c469f4",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNTAsImlhdCI6MTc5MzEzMjQ1MCwianRpIjoiNTdkY2RmNzEtYjE2My00NTQ4LTkwNzQtMmVlNDVjN2E2ZmZkIiwic2lkIjoiYTdmMzM2MWMtMmZjNy00YzJlLTgzYjktM2I2NTAxYzQ2OWY0In0.9mKQ6zkT6L0HocsL0STnsyGSQblHK7pyQmBI4PlWTPA",
  "access_expires_at": "2026-10-27T20:35:50.924682638Z",
  "refresh_token": "I5OPBXzokVDMW9PuwVVFZhx4uezAvYHzs4XGb3CoGmI",
  "refresh_expires_at": "2026-10-28T08:20:50.924332926Z",
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
  "command_id": "b9a677be-7573-4435-a876-9c53622978bb",
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
  "changed_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T20:20:50.981879Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "b9a677be-7573-4435-a876-9c53622978bb",
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
  "changed_by": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T20:20:50.981879Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48688210409",
  "device_ref": "sandbox-7465"
}
```

```json
{
  "challenge_id": "3ae800da-c133-4df4-af41-5f038b50c158",
  "expires_at": "2026-10-27T20:25:51.042674272Z",
  "resend_available_at": "2026-10-27T20:20:52.042674272Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48688210409` → **200**

```json
{
  "phone": "+48688210409",
  "audience": "CLIENT",
  "code": "267315",
  "sent_at": "2026-10-27T20:20:51.044060189Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ae800da-c133-4df4-af41-5f038b50c158",
  "code": "267315",
  "device_ref": "sandbox-7465"
}
```

```json
{
  "session_id": "91a3a189-8d50-430b-bc4d-5287c26d30a1",
  "subject": {
    "type": "CLIENT",
    "id": "e7e0f8d2-9d28-4526-804b-71d386a54f05"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlN2UwZjhkMi05ZDI4LTQ1MjYtODA0Yi03MWQzODZhNTRmMDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzUxLCJpYXQiOjE3OTMxMzI0NTEsImp0aSI6IjZmY2IyOWNjLTc1NWQtNGIwYy1iZjYyLTY0ZTdmYjA0MjM0NyIsInNpZCI6IjkxYTNhMTg5LThkNTAtNDMwYi1iYzRkLTUyODdjMjZkMzBhMSJ9.3mHOKCmFyAppfuugrMQSzsgK4_FfaXqnzT1VC6KO0tw",
  "access_expires_at": "2026-10-27T20:35:51.086957488Z",
  "refresh_token": "tVc-txNewzrUSsGwuZ_DWjj_lm8lkNwaq7n_IkfRLVM",
  "refresh_expires_at": "2026-11-26T20:20:51.086488627Z",
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
  "correlation_id": "736c06c1-b577-4ad4-934d-6d09707f5291"
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
  "device_ref": "sandbox-14467"
}
```

```json
{
  "challenge_id": "5d4646fa-147e-4fb5-a3c4-af06e3a6c59a",
  "expires_at": "2026-10-27T20:25:51.152516017Z",
  "resend_available_at": "2026-10-27T20:20:52.152516017Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "928778",
  "sent_at": "2026-10-27T20:20:51.154135817Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d4646fa-147e-4fb5-a3c4-af06e3a6c59a",
  "code": "928778",
  "device_ref": "sandbox-14467"
}
```

```json
{
  "session_id": "85535452-9bfb-40e0-92c0-63af7600b08a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzM1MSwiaWF0IjoxNzkzMTMyNDUxLCJqdGkiOiI2NzFhNWJhMS02ZTRhLTQzNjctOWNlNS1iZjgzZTgzNzJkZGQiLCJzaWQiOiI4NTUzNTQ1Mi05YmZiLTQwZTAtOTJjMC02M2FmNzYwMGIwOGEifQ.mZfsCbgMYuRDE6Smbz2-geG0jA9dXcCmNs04ZVzGYy4",
  "access_expires_at": "2026-10-27T20:35:51.197016711Z",
  "refresh_token": "_kVaodeM5QAbITmiC5U1zb3oo6nkrLfc6_Kruv60kvk",
  "refresh_expires_at": "2026-11-26T20:20:51.196636323Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e81ff0f4-6a4c-42a3-99fa-9da505d0c964",
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
  "last_heartbeat_at": "2026-10-27T20:20:49.212759Z",
  "last_location_at": "2026-10-27T20:20:49.212759Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e81ff0f4-6a4c-42a3-99fa-9da505d0c964/handover` → **200**

```json
{
  "command_id": "9187719e-27ef-4c00-b109-62467b5030b7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e81ff0f4-6a4c-42a3-99fa-9da505d0c964",
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
  "last_heartbeat_at": "2026-10-27T20:20:49.212759Z",
  "last_location_at": "2026-10-27T20:20:49.212759Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e81ff0f4-6a4c-42a3-99fa-9da505d0c964/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:51Z",
    "sequence": 1793132451260
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e81ff0f4-6a4c-42a3-99fa-9da505d0c964",
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
  "last_heartbeat_at": "2026-10-27T20:20:51.274263Z",
  "last_location_at": "2026-10-27T20:20:51.274263Z",
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
  "session_id": "e81ff0f4-6a4c-42a3-99fa-9da505d0c964",
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
  "last_heartbeat_at": "2026-10-27T20:20:51.274263Z",
  "last_location_at": "2026-10-27T20:20:51.274263Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e81ff0f4-6a4c-42a3-99fa-9da505d0c964/close` → **200**

```json
{
  "command_id": "16f4e800-41fe-43d3-878f-89d8223f00f4",
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
  "correlation_id": "b0c30e33-d1ed-4bd3-af78-4b3523dc8b31"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678726039",
  "device_ref": "sandbox-5228"
}
```

```json
{
  "challenge_id": "657a4b5c-8b6b-491a-aa9c-73c0bbf7f445",
  "expires_at": "2026-10-27T20:25:51.399014944Z",
  "resend_available_at": "2026-10-27T20:20:52.399014944Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678726039` → **200**

```json
{
  "phone": "+380678726039",
  "audience": "CLIENT",
  "code": "704364",
  "sent_at": "2026-10-27T20:20:51.400498448Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "657a4b5c-8b6b-491a-aa9c-73c0bbf7f445",
  "code": "704364",
  "device_ref": "sandbox-5228"
}
```

```json
{
  "session_id": "b8dc4044-f9b3-4114-93fd-747ce922561f",
  "subject": {
    "type": "CLIENT",
    "id": "d19c780e-c99f-4353-9a7f-5e175fd8e819"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTljNzgwZS1jOTlmLTQzNTMtOWE3Zi01ZTE3NWZkOGU4MTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMzMzUxLCJpYXQiOjE3OTMxMzI0NTEsImp0aSI6IjM5ZDkwOTUwLTliY2UtNDBmYi04ZTg2LTdhZjdmMDIyYWIyNCIsInNpZCI6ImI4ZGM0MDQ0LWY5YjMtNDExNC05M2ZkLTc0N2NlOTIyNTYxZiJ9.NyG0usdT16hRapj7L6Bj17ppw7ADZBjeR1Vyn3NwHJ8",
  "access_expires_at": "2026-10-27T20:35:51.444701699Z",
  "refresh_token": "8ATxCqvI9sCuV3TkJMTiqVoAC0ZUxEoXpYotkNMP4cc",
  "refresh_expires_at": "2026-11-26T20:20:51.444390541Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "2d0d409d-61a2-404d-90f8-4493f3ebba97",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "4e940d21-9d44-4c1f-ac52-209b6a3fc8e1",
  "upload_path": "/api/rider/v1/uploads/4e940d21-9d44-4c1f-ac52-209b6a3fc8e1",
  "expires_at": "2026-10-27T20:35:51.471966974Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/4e940d21-9d44-4c1f-ac52-209b6a3fc8e1` → **200**

```json
{
  "file_id": "4e940d21-9d44-4c1f-ac52-209b6a3fc8e1",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "8b451e41-0439-4c7b-b61e-76362327e09c",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "4e940d21-9d44-4c1f-ac52-209b6a3fc8e1"
  ]
}
```

```json
{
  "id": "94bc53e0-0cb2-4da8-995d-1a508f995ed5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d19c780e-c99f-4353-9a7f-5e175fd8e819",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T20:20:51.525293Z",
  "updated_at": "2026-10-27T20:20:51.525293Z",
  "messages": [
    {
      "id": "fef733de-a3c5-42d7-a289-165f718d3339",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d19c780e-c99f-4353-9a7f-5e175fd8e819",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T20:20:51.526636Z",
      "attachments": [
        {
          "file_id": "4e940d21-9d44-4c1f-ac52-209b6a3fc8e1",
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
  "session_id": "cd719d8a-c121-49f3-9544-71a4657a15f9",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNTEsImlhdCI6MTc5MzEzMjQ1MSwianRpIjoiZTEzYjU5NmMtZGUyNS00ZDViLWI1Y2YtNDE3YzAzMWZmYzM0Iiwic2lkIjoiY2Q3MTlkOGEtYzEyMS00OWYzLTk1NDQtNzFhNDY1N2ExNWY5In0.lQz4fToQlgR2HP-uX5tBQbdoMbOr2DEXw3ig5Cn6hUs",
  "access_expires_at": "2026-10-27T20:35:51.764741191Z",
  "refresh_token": "yw3EpaFUnnSlrwB8aN2DGp8G6y-3CH6pl3FZ4X0EjWE",
  "refresh_expires_at": "2026-10-28T08:20:51.764446638Z",
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
  "session_id": "eee6168a-8b34-4cbb-9edf-3041b0ffa35b",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNTEsImlhdCI6MTc5MzEzMjQ1MSwianRpIjoiNTQ3Yjc0ZTQtZGQ1Ni00MjFlLThmZDctMDFmMjA3YmU1OWQwIiwic2lkIjoiZWVlNjE2OGEtOGIzNC00Y2JiLTllZGYtMzA0MWIwZmZhMzViIn0.lxL1O1Qooz9ooPok4kahN3ac3yd1UroUDhe9taek2wI",
  "access_expires_at": "2026-10-27T20:35:51.994525394Z",
  "refresh_token": "9CKGlP0xVOocD6kxGIh6TLv1toEMU7YT_MfnnIwqWyY",
  "refresh_expires_at": "2026-10-28T08:20:51.994154751Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/94bc53e0-0cb2-4da8-995d-1a508f995ed5/attachments/4e940d21-9d44-4c1f-ac52-209b6a3fc8e1` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "58e0ea10-ad8b-4630-8a1f-67306b875ab4",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "8c36c4eb-2300-4e7c-927d-b8d343e77531",
  "upload_path": "/api/operator/v1/uploads/8c36c4eb-2300-4e7c-927d-b8d343e77531",
  "expires_at": "2026-10-27T20:35:52.031488856Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/8c36c4eb-2300-4e7c-927d-b8d343e77531` → **200**

```json
{
  "file_id": "8c36c4eb-2300-4e7c-927d-b8d343e77531",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/94bc53e0-0cb2-4da8-995d-1a508f995ed5` → **200**

```json
{
  "id": "94bc53e0-0cb2-4da8-995d-1a508f995ed5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d19c780e-c99f-4353-9a7f-5e175fd8e819",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T20:20:51.525293Z",
  "updated_at": "2026-10-27T20:20:51.525293Z",
  "messages": [
    {
      "id": "fef733de-a3c5-42d7-a289-165f718d3339",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d19c780e-c99f-4353-9a7f-5e175fd8e819",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T20:20:51.526636Z",
      "attachments": [
        {
          "file_id": "4e940d21-9d44-4c1f-ac52-209b6a3fc8e1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/94bc53e0-0cb2-4da8-995d-1a508f995ed5/comments` → **200**

```json
{
  "command_id": "54120fc7-e647-43fd-9e1b-a1f830973c62",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "8c36c4eb-2300-4e7c-927d-b8d343e77531"
  ]
}
```

```json
{
  "id": "94bc53e0-0cb2-4da8-995d-1a508f995ed5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d19c780e-c99f-4353-9a7f-5e175fd8e819",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T20:20:51.525293Z",
  "updated_at": "2026-10-27T20:20:52.10511Z",
  "messages": [
    {
      "id": "fef733de-a3c5-42d7-a289-165f718d3339",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d19c780e-c99f-4353-9a7f-5e175fd8e819",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T20:20:51.526636Z",
      "attachments": [
        {
          "file_id": "4e940d21-9d44-4c1f-ac52-209b6a3fc8e1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2d1d8b40-88e0-46c0-ace4-b28af56ef019",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T20:20:52.104864Z",
      "attachments": [
        {
          "file_id": "8c36c4eb-2300-4e7c-927d-b8d343e77531",
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

`GET /api/rider/v1/support/cases/94bc53e0-0cb2-4da8-995d-1a508f995ed5` → **200**

```json
{
  "id": "94bc53e0-0cb2-4da8-995d-1a508f995ed5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d19c780e-c99f-4353-9a7f-5e175fd8e819",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T20:20:51.525293Z",
  "updated_at": "2026-10-27T20:20:52.10511Z",
  "messages": [
    {
      "id": "fef733de-a3c5-42d7-a289-165f718d3339",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d19c780e-c99f-4353-9a7f-5e175fd8e819",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T20:20:51.526636Z",
      "attachments": [
        {
          "file_id": "4e940d21-9d44-4c1f-ac52-209b6a3fc8e1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2d1d8b40-88e0-46c0-ace4-b28af56ef019",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T20:20:52.104864Z",
      "attachments": [
        {
          "file_id": "8c36c4eb-2300-4e7c-927d-b8d343e77531",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/94bc53e0-0cb2-4da8-995d-1a508f995ed5/attachments/8c36c4eb-2300-4e7c-927d-b8d343e77531` → **200**

Done: support case 94bc53e0-0cb2-4da8-995d-1a508f995ed5, rider attachment 4e940d21-9d44-4c1f-ac52-209b6a3fc8e1, operator attachment 8c36c4eb-2300-4e7c-927d-b8d343e77531.

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
  "session_id": "fbf638e2-14e8-4d8f-beff-a07c49b93536",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNTIsImlhdCI6MTc5MzEzMjQ1MiwianRpIjoiNjE2N2YwODktZWViNC00NTg1LTgyNzEtMWI2MzE4OThiMjJjIiwic2lkIjoiZmJmNjM4ZTItMTRlOC00ZDhmLWJlZmYtYTA3YzQ5YjkzNTM2In0.73yXtLFljpwcfm8rwCf4F9FWqhYeTbGSpYpDCvN79rU",
  "access_expires_at": "2026-10-27T20:35:52.384362405Z",
  "refresh_token": "xo_JE7jtKacLXx2nQTG9vefyYZkNA3GzXptHqVLFb6I",
  "refresh_expires_at": "2026-10-28T08:20:52.384026248Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18891"
}
```

```json
{
  "challenge_id": "4bea62a7-a799-4040-a0ce-86aa35c041b2",
  "expires_at": "2026-10-27T20:25:52.405501513Z",
  "resend_available_at": "2026-10-27T20:20:53.405501513Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "193867",
  "sent_at": "2026-10-27T20:20:52.406829152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bea62a7-a799-4040-a0ce-86aa35c041b2",
  "code": "193867",
  "device_ref": "sandbox-18891"
}
```

```json
{
  "session_id": "ecdbd1f1-bdc7-4243-abe5-55eeeaaaea1d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzM1MiwiaWF0IjoxNzkzMTMyNDUyLCJqdGkiOiIzMTg1YzNmMC0zYjQ1LTRlMmUtYjQ0My02ZTUzNGFlOTU3MTUiLCJzaWQiOiJlY2RiZDFmMS1iZGM3LTQyNDMtYWJlNS01NWVlZWFhYWVhMWQifQ.QGbc_KiSrJpL8oMwZLML_wUR6LS5-P9sbSKkcseo_48",
  "access_expires_at": "2026-10-27T20:35:52.44984473Z",
  "refresh_token": "3tY51GM-0bFiqZrpFT3KjHmjRKwMpWBgAEC_SGr0euM",
  "refresh_expires_at": "2026-11-26T20:20:52.449471923Z",
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
  "command_id": "cb4bfbda-8c93-4d9e-9395-b4b735988cd2",
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
  "device_ref": "sandbox-32066"
}
```

```json
{
  "challenge_id": "26cdace5-b827-4963-892e-32fb8794f23b",
  "expires_at": "2026-10-27T20:25:52.550616594Z",
  "resend_available_at": "2026-10-27T20:20:53.550616594Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "865774",
  "sent_at": "2026-10-27T20:20:52.552152267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26cdace5-b827-4963-892e-32fb8794f23b",
  "code": "865774",
  "device_ref": "sandbox-32066"
}
```

```json
{
  "session_id": "d304f747-e0df-483e-b83b-50135172cd5d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMzM1MiwiaWF0IjoxNzkzMTMyNDUyLCJqdGkiOiJhODI2MWQ3YS01ZDVmLTRmZTMtYWZjOS1iMjRlNWM2NThjZmIiLCJzaWQiOiJkMzA0Zjc0Ny1lMGRmLTQ4M2UtYjgzYi01MDEzNTE3MmNkNWQifQ.HmxcM8xTR9s4zcSlUsNSX9UH0J15ykyDQ_2jV7nwjUQ",
  "access_expires_at": "2026-10-27T20:35:52.594350332Z",
  "refresh_token": "6FO65k-Y3KR1oMGB2hMjEHEicNcgWK3iZeMKUwQljII",
  "refresh_expires_at": "2026-11-26T20:20:52.593986614Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7d326af0-bdcb-4f9d-a952-a67e5744c727",
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
  "last_heartbeat_at": "2026-10-27T20:20:50.080107Z",
  "last_location_at": "2026-10-27T20:20:50.080107Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d326af0-bdcb-4f9d-a952-a67e5744c727/handover` → **200**

```json
{
  "command_id": "253f81c2-75ed-46b8-ae19-c3e8b9390fa1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7d326af0-bdcb-4f9d-a952-a67e5744c727",
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
  "last_heartbeat_at": "2026-10-27T20:20:50.080107Z",
  "last_location_at": "2026-10-27T20:20:50.080107Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d326af0-bdcb-4f9d-a952-a67e5744c727/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:52Z",
    "sequence": 1793132452659
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7d326af0-bdcb-4f9d-a952-a67e5744c727",
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
  "last_heartbeat_at": "2026-10-27T20:20:52.673481Z",
  "last_location_at": "2026-10-27T20:20:52.673481Z",
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
  "command_id": "375e86ba-3f3e-4676-990c-500adda71a20",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:52Z",
    "sequence": 1793132452710
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b2a8060f-cce0-4853-a70f-7d32a93aef80",
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
  "last_heartbeat_at": "2026-10-27T20:20:52.723769Z",
  "last_location_at": "2026-10-27T20:20:52.723769Z",
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
  "session_id": "7c1f922f-53ad-4532-a029-f784ddb8a0ba",
  "subject": {
    "type": "STAFF",
    "id": "7e2334e8-8e52-43c3-bf90-9e98980df9a2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTIzMzRlOC04ZTUyLTQzYzMtYmY5MC05ZTk4OTgwZGY5YTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzMzNTIsImlhdCI6MTc5MzEzMjQ1MiwianRpIjoiMGQ5Y2U4NjUtYTFhZS00M2ViLWE1NmEtZTA1NDkzYTA5NTk3Iiwic2lkIjoiN2MxZjkyMmYtNTNhZC00NTMyLWEwMjktZjc4NGRkYjhhMGJhIn0.pKFC3KOuEmMMK99nLh5yOJHw6QJqNlV-pJGtvBaORD0",
  "access_expires_at": "2026-10-27T20:35:52.954282799Z",
  "refresh_token": "tFLKm7OHkO4Ea7LkHnCdb4q92fESLUt8IfMuGDJBpXw",
  "refresh_expires_at": "2026-10-28T08:20:52.953985161Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b5fe4bb3-59e2-453c-89f8-f0b58411f5d8",
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
  "id": "5d4aff48-822c-4d2e-98cc-2eeced2b460d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T20:25:52.978591Z",
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
  "command_id": "6d8d7d2a-66a7-449d-bf89-ce7b03ff514d",
  "quote_id": "5d4aff48-822c-4d2e-98cc-2eeced2b460d",
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
  "id": "1b2e3038-0507-43c6-b727-c577df9fdf67",
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
  "created_at": "2026-10-27T20:20:53.007565Z",
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
    "id": "05d56583-7035-4068-81a3-9b0e00c3618a",
    "order_id": "1b2e3038-0507-43c6-b727-c577df9fdf67",
    "expires_at": "2026-10-27T20:21:08.009794Z",
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

`POST /api/driver/v1/offers/05d56583-7035-4068-81a3-9b0e00c3618a/accept` → **200**

```json
{
  "command_id": "573acd4b-4f85-47c9-85c2-0b4df9921f2e"
}
```

```json
{
  "id": "bd27b46b-d03d-4793-82e0-a651dd51be22",
  "order_id": "1b2e3038-0507-43c6-b727-c577df9fdf67",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "37e5c7e6-e2d6-4393-81b5-9c1490ed1cd9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "37e5c7e6-e2d6-4393-81b5-9c1490ed1cd9",
  "order_id": "1b2e3038-0507-43c6-b727-c577df9fdf67",
  "assignment_id": "bd27b46b-d03d-4793-82e0-a651dd51be22",
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

`POST /api/driver/v1/work-sessions/b2a8060f-cce0-4853-a70f-7d32a93aef80/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:20:53Z",
    "sequence": 1793132453108
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b2a8060f-cce0-4853-a70f-7d32a93aef80",
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
  "last_heartbeat_at": "2026-10-27T20:20:53.122319Z",
  "last_location_at": "2026-10-27T20:20:53.122319Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/37e5c7e6-e2d6-4393-81b5-9c1490ed1cd9/arrive` → **200**

```json
{
  "command_id": "e73442a5-d63b-4e53-a4cf-e96884b48ec5",
  "expected_version": 0
}
```

```json
{
  "id": "37e5c7e6-e2d6-4393-81b5-9c1490ed1cd9",
  "order_id": "1b2e3038-0507-43c6-b727-c577df9fdf67",
  "assignment_id": "bd27b46b-d03d-4793-82e0-a651dd51be22",
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
  "arrived_at": "2026-10-27T20:20:53.149662Z",
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

`POST /api/driver/v1/trips/37e5c7e6-e2d6-4393-81b5-9c1490ed1cd9/start` → **200**

```json
{
  "command_id": "bd45e092-2c20-4440-9a46-cad5e296dfe2",
  "expected_version": 1
}
```

```json
{
  "id": "37e5c7e6-e2d6-4393-81b5-9c1490ed1cd9",
  "order_id": "1b2e3038-0507-43c6-b727-c577df9fdf67",
  "assignment_id": "bd27b46b-d03d-4793-82e0-a651dd51be22",
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
  "arrived_at": "2026-10-27T20:20:53.149662Z",
  "started_at": "2026-10-27T20:20:53.179587Z",
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

`POST /api/driver/v1/trips/37e5c7e6-e2d6-4393-81b5-9c1490ed1cd9/complete` → **200**

```json
{
  "command_id": "c578c67a-d83f-4223-a316-745db81d90d7",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:20:53Z",
  "cash_received": true
}
```

```json
{
  "id": "37e5c7e6-e2d6-4393-81b5-9c1490ed1cd9",
  "order_id": "1b2e3038-0507-43c6-b727-c577df9fdf67",
  "assignment_id": "bd27b46b-d03d-4793-82e0-a651dd51be22",
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
  "arrived_at": "2026-10-27T20:20:53.149662Z",
  "started_at": "2026-10-27T20:20:53.179587Z",
  "completed_at": "2026-10-27T20:20:53.212487Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/1b2e3038-0507-43c6-b727-c577df9fdf67` → **200**

```json
{
  "id": "1b2e3038-0507-43c6-b727-c577df9fdf67",
  "short_number": 16,
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
    "id": "bd27b46b-d03d-4793-82e0-a651dd51be22",
    "order_id": "1b2e3038-0507-43c6-b727-c577df9fdf67",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "37e5c7e6-e2d6-4393-81b5-9c1490ed1cd9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T20:20:53.007565Z",
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
  "session_id": "7d326af0-bdcb-4f9d-a952-a67e5744c727",
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
  "last_heartbeat_at": "2026-10-27T20:20:52.673481Z",
  "last_location_at": "2026-10-27T20:20:52.673481Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d326af0-bdcb-4f9d-a952-a67e5744c727/close` → **200**

```json
{
  "command_id": "ed4c78be-7be6-418e-a389-3449506a3da6",
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
  "session_id": "b2a8060f-cce0-4853-a70f-7d32a93aef80",
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
  "last_heartbeat_at": "2026-10-27T20:20:53.122319Z",
  "last_location_at": "2026-10-27T20:20:53.122319Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b2a8060f-cce0-4853-a70f-7d32a93aef80/close` → **200**

```json
{
  "command_id": "74733721-a042-471a-8128-e42eb4c4a5f5",
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

Done: terminal order 1b2e3038-0507-43c6-b727-c577df9fdf67 by Andrii (5a000000-0000-4000-8000-000000000403).
